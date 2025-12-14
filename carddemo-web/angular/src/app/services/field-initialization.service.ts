import {inject, Injectable} from '@angular/core';
import {Data} from '../term/term.model';
import {Field} from '../term/message';
import {NumericalService} from '../dynamic-field/utility/numerical.service';
import {ConfigService} from '../config-service';
import {FieldSynchronizationService} from './field-synchronization.service';
import {TransactionService} from '../term/transaction.service';
import {TermState} from '../models/term-state.model';

/**
 * This class is responsible for the initialization of fields of the map components.
 * The values are initialized from map beans sent by the backend. This class is a Singleton.
 */
@Injectable()
export class FieldInitializationService {

  /**
   * Inject the config service. Used to get the QDECFMT.
   */
  private configService: ConfigService = inject(ConfigService);

  /**
   * Inject the field synchronization service. Used to synchronize the focus of the initial cursor
   */
  private fieldSyncService: FieldSynchronizationService = inject(FieldSynchronizationService);
  
  /**
   * Inject the transaction service for configuration.
   */
  private transactionService: TransactionService = inject(TransactionService);

  /**
   * Process an array field and populate the data.
   *
   * @param field The array field provided by the response
   * @param data the data which needs to be populated
   * @param termState The state of the term component the field belongs to
   * @private
   */
  public processArrayField(field: any, data: any, termState: TermState) {
    // Check if we need to perform cursor placement
    let cursorRecordNumber: any;
    if (field.attributes && field.attributes.cursor) {
      cursorRecordNumber = field.attributes.recordNumber;
    }

    let start: number = 0;
    let end: number = 0;
    let dataLength: number = -1;
    let dummyField: any;
    // table metadata has been sent
    if (field.arrayMetadata) {
      start = field.arrayMetadata.start;
      end = field.arrayMetadata.end;
      dataLength = field.arrayMetadata.dataLength;
      dummyField = field.arrayMetadata.dummyField;
    }
    for (let subMap of field.fields) {
      let rrn: number = this.processArrayItem(subMap, cursorRecordNumber, data, termState);
      if (!field.arrayMetadata) {
        start = Math.min(start, rrn - 1);
        end = Math.max(end, rrn - 1);
      }
    }
    // If dummy field exists
    if (dummyField) {
      let dummyFieldString: string = JSON.stringify(dummyField);
      for (let i = start; i < end; i++) {
        if (data[i] === undefined) {
          let subMap = JSON.parse(dummyFieldString);
          subMap.relativeRecordNumber = i + 1;
          this.processArrayItem(subMap, cursorRecordNumber, data, termState);
        }
      }
    }
    // for chunks
    data['start'] = start;
    data['end'] = end;
    data['componentId'] = field.component;
    data['tableLength'] = Math.max(dataLength, end);
  }

  /**
   * Build an array item from map provided by the response and populate it inside data.
   *
   * @param subMap the map provided by the response
   * @param cursorRecordNumber the cursor record number if applicable
   * @param data the data to be populated
   * @param termState The state of the term component containing this array item
   * @returns the relative record number
   */
  private processArrayItem(subMap: any, cursorRecordNumber: number, data: any, termState: TermState): number {
    let arrayItem: any = {};
    let shouldPlaceCursor: boolean = !!cursorRecordNumber && cursorRecordNumber == (
      subMap.relativeRecordNumber ? subMap.relativeRecordNumber : (data.length + 1)
    );
    for (let subField of subMap.fields) {
      let subData = new Data;
      subData.value = this.getFieldData(subField);
      this.fillData(subData, subField, termState);
      // Process cursor placement based on cursor record number.
      if (cursorRecordNumber) {
        if (shouldPlaceCursor && this.isValidInputField(subData)) {
          shouldPlaceCursor = false;
          subData.initialCursor = true;
        } else {
          subData.initialCursor = false;
        }
      }
      arrayItem[subField.id] = subData;
    }
    arrayItem['FIELDS'] = subMap.fields;
    arrayItem['forceModified'] = subMap.forceModified;
    if (subMap.relativeRecordNumber != undefined) {
      data[subMap.relativeRecordNumber - 1] = arrayItem;
    } else {
      subMap.relativeRecordNumber = (data.push(arrayItem)) + 1;
    }
    return subMap.relativeRecordNumber;
  }

  /** Retrieve the data from Map field. Convert its format if needed */
  private getFieldData(field: Field): string {
    if(field.attributes.numerical){
      return NumericalService.convertDecimalFormat(field.data, this.configService.getQDECFMT());
    }
    return field.data;
  }

  private isValidInputField(field: any): boolean {
    let valid = field && field.attributes;
    // Check for visibility
    valid = valid && field.attributes.intensity && field.attributes.intensity === 'NORM';
    // Check for input protection.
    valid = valid && field.attributes.protection && field.attributes.protection === 'UNPROT'
    return valid;
  }
  
    /* Fill data from field. Code also expects this to be called on Array => "data" can be of type Data or Array */
    public fillData(data : any, field: Field, termState: TermState): void {
        // Keep track of initial value (for "modified" detection purpose)
        data.initialValue = data.value;

        if (field.attributes !== undefined) {
            // Provide attributes for decoding by the dynamic-field component
            data.attributes = field.attributes;

            // Signal that field data must be sent inconditionnaly (even if not modified)
            // Keep existing value if we did not receive attributes (V7-139, V7-127)
            if (Array.isArray(data)) {
                // TODO Probably not needed since decodeFields also sets forceModified in the Array case (V7-7297)
                data['forceModified'] = field.attributes.forceModified;
            } else {
                let actualData: Data = data as Data;
                 
                 // This test gives us some room for not sending forceModified in attributes in the future
                 if (field.attributes.forceModified !== undefined) {
                 	// Usual "forceModified from backend will set the MDT on the terminal" scenario
                    if (field.attributes.forceModified) {
                        actualData.setModified();
                    } else {
                        // Used to reset the MDT programmatically; only activated for CICS/BMS now
                        if (this.transactionService.configuration.forceModifiedCanResetMDT) {
                            actualData.clearModified();
                        }
                    }
                 }
            }

            // Update consultation mode (readOnly & disabled)
            data.disabled =  field.attributes && field.attributes.protection === 'ASKIP';
            data.protected = field.attributes && field.attributes.protection === 'PROT';
            
            let pos: number = data.attributes.line * 80 + data.attributes.column;
            termState.fieldsByPosition[pos] = data;
        }

        if (field.initialCursor !== undefined) {
            data.initialCursor = field.initialCursor;
        }
    }
}
