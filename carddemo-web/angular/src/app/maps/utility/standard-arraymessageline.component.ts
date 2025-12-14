import { Component, ViewChild } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";
import { TableComponent, Paging } from "../../table/table.component";
import { AfterViewInit } from '@angular/core';

@Component({
    moduleId: module.id,
    selector: 'standard-arraymessageline',
    templateUrl: './standard-arraymessageline.component.html'
})

export class StandardArrayMessageLineComponent extends Overlay implements AfterViewInit {
    arraymessageline: any = [];

    public FIELDS: string[] = ['arraymessageline'];

    public isSubfileControl: boolean = true;

	public updateMetadataFlag: boolean = false;
	
    @ViewChild('table') subfileTable: TableComponent;

    public doPaging(key: KeyboardEvent): boolean {
        return this.subfileTable.keyEvent(key);
    }

    public doDropFold(key: KeyboardEvent): boolean {
        let result = this.subfileTable.handleDropFold(key);
        return result;
    }

    public updateSubfile(): boolean {
        let result = this.arraymessageline.attributes.recordNumber < 0 || (this.arraymessageline.length > 0 && this.arraymessageline.attributes.recordNumber > this.arraymessageline.length);
        if (this.subfileTable !== undefined) {
            this.subfileTable.updateAttribute(this.arraymessageline.attributes);
        }
        return result;
    }

    public clearSubfile(): void {
        if (this.subfileTable !== undefined) {
            this.subfileTable.clear();
        }
    }


    public getCurrentRecordNumber() : number {
        return this.subfileTable.getRecordNumber();
    }
    
    public updateTableMetadata() {
        if(this.subfileTable === undefined){
            this.updateMetadataFlag = true;
        } else{
            this.subfileTable.updateTableMetadata();
        }
    }

    ngAfterViewInit(): void {
        if (this.updateMetadataFlag) {
            this.subfileTable.updateTableMetadata();
            this.updateMetadataFlag = false;
        }
    }
}

