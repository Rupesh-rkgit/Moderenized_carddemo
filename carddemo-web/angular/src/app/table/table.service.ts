import {inject, Injectable} from '@angular/core';
import {TransactionService} from '../term/transaction.service';
import {AbstTermComponent} from '../abs-term.component';
import {BackendMessage, LogicalMessage, UpdateTableComponents, Map} from '../term/message';
import {TableDataChunk, TableMetadata} from './table-metadata.model';
import {Data} from '../term/term.model';
import {
    RangeRequest,
    Request,
    RequestMessage,
} from '../term/request-message.model';
import {MessageUtils} from '../shared/utils/message-utils';
import {FieldInitializationService} from '../services/field-initialization.service';
import {TermState} from '../models/term-state.model';

/**
 * Service responsible to providing data to table component.
 * Each TableComponent has its own TableService
 */
@Injectable()
export class TableService {

    /**
     * The table metadata. Contains important information regarding the state of the cache
     */
    private tableMetadata: TableMetadata = new TableMetadata();

    /**
     * The amount of pages remaining till we prefetch the next set of rows.
     */
    private static preFetchPageThreshold: number = 0;

    /**
     * The rows cache.
     */
    private _rows: any[];

    private dataRequestsMap: { [start: number]: { end: number, promise: Promise<boolean> } } = {};

    /**
     * Transaction service used for requesting data to the backend.
     */
    private transactionService: TransactionService = inject(TransactionService);

    private fieldInitializationService: FieldInitializationService = inject(FieldInitializationService);

    public initRows(rows: any[]) {
        // Only one chunk allowed
        // Reset the table metadata.
        TableService.log('Init rows', rows);
        this._rows = rows;
        this.tableMetadata.headChunk = new TableDataChunk(0, 0);
        this.tableMetadata.tailChunk = this.tableMetadata.headChunk;
        this.tableMetadata.currentChunk = this.tableMetadata.headChunk;
        if ('tableLength' in rows) {
            this.tableMetadata.tableLength = Number(rows['tableLength']);
        } else {
            this.tableMetadata.tableLength = rows.length;
        }
        if (rows['componentId']) {
            this.tableMetadata.componentId = rows['componentId'];
        }
        if (rows.length > 0) {
            // Initialize the first and the last key
            let start: number, end: number;
            if ('start' in rows && 'end' in rows) {
                start = Number(rows['start']);
                end = Number(rows['end']);
            } else {
                let keys: string[] = Object.keys(rows);
                if (keys && keys.length > 0) {
                    start = Number(keys[0]);
                    end = Number(keys[-1]);
                }
            }
            if (start != undefined && end != undefined && !isNaN(start) && !isNaN(end)) {
                this.tableMetadata.headChunk.start = start;
                this.tableMetadata.headChunk.end = end;
                return;
            }
            TableService.log('Something went wrong during calculation of table metadata');
        }
    }

    /**
     * Update the metadata according to the rows
     */
    public updateRows() {
        this._rows['tableLength'] = this._rows.length;
        this._rows['start'] = 0;
        this._rows['end'] = this._rows.length;
        this.initRows(this._rows);
    }

    /**
     * Index chunks from start to end
     *
     * @param start the start
     * @param end the end
     * @private
     */
    private indexChunks(start: number, end: number) {
        TableService.log('Indexing chunks.....');
        // TableService.log('Before indexing: ', this.tableMetadata.getText());
        // TableService.log('Before indexing Reverse: ', this.tableMetadata.getTextReverse());
        let left: TableDataChunk = this.getLeftChunk(start);
        // Find the right chunk
        let right: TableDataChunk = this.getRightChunk(end);
        if (left !== undefined && right !== undefined && left == right) {
            // Chunk already present. nothing to do here. (update the current chunk)
            TableService.log('Changing current chunk from %s to %s', this.tableMetadata.currentChunk.getText(), left.getText())
            this.tableMetadata.currentChunk = left;
            return;
        }
        let newChunk: TableDataChunk = new TableDataChunk(start, end);
        // Merge the left side of the new chunk
        this.mergeWithLeftChunk(left, newChunk);
        // Merge the right side of the new chunk
        this.mergeWithRightChunk(right, newChunk);
        TableService.log('Changing current chunk from %s to %s', this.tableMetadata.currentChunk.getText(), newChunk.getText())
        this.tableMetadata.currentChunk = newChunk;
        // TableService.log('Validate indexes: ', this.tableMetadata.validate());
        // TableService.log('After indexing: ', this.tableMetadata.getText());
        // TableService.log('After indexing Reverse: ', this.tableMetadata.getTextReverse());
    }

    /**
     * Merge the new chunk with the left chunk
     *
     * @param left The left chunk
     * @param newChunk the new Chunk
     * @private
     */
    private mergeWithLeftChunk(left: TableDataChunk, newChunk: TableDataChunk) {
        if (left === undefined) {
            // New chunk is the head chunk
            newChunk.next = this.tableMetadata.headChunk;
            this.tableMetadata.headChunk = newChunk;
        } else {
            if (left.containsRow(newChunk.start) || left.end === newChunk.start) {
                // Merge left and newChunk
                newChunk.start = left.start;
                newChunk.prev = left.prev;
                if (newChunk.prev !== undefined) {
                    newChunk.prev.next = newChunk;
                }
                if (this.tableMetadata.headChunk === left) {
                    this.tableMetadata.headChunk = newChunk;
                }
            } else {
                left.next = newChunk;
                newChunk.prev = left;
            }
            if (this.tableMetadata.tailChunk === left) {
                this.tableMetadata.tailChunk = newChunk;
            }
        }
    }

    /**
     * Merge the new chunk with the right chunk
     *
     * @param right The right chunk
     * @param newChunk the new Chunk
     * @private
     */
    private mergeWithRightChunk(right: TableDataChunk, newChunk: TableDataChunk) {
        if (right === undefined) {
            // New chunk is the tail chunk
            if (this.tableMetadata.tailChunk !== newChunk) {
                newChunk.prev = this.tableMetadata.tailChunk;
                this.tableMetadata.tailChunk = newChunk;
            }
        } else {
            if (right.containsRow(newChunk.end) || right.start === newChunk.end) {
                // Merge right and newChunk
                newChunk.end = right.end;
                newChunk.next = right.next;
                if (newChunk.next !== undefined) {
                    newChunk.next.prev = newChunk;
                }
                if (this.tableMetadata.tailChunk === right) {
                    this.tableMetadata.tailChunk = newChunk;
                }
            } else {
                right.prev = newChunk;
                newChunk.next = right;
            }
            if (this.tableMetadata.headChunk === right) {
                this.tableMetadata.headChunk = newChunk;
            }
        }
    }

    /**
     * Gets the chunk which is to the left of start
     * If start is contained in a chunk, it will return that chunk.
     * If there is no left, then undefined is returned
     *
     * @param start the start value
     * @return The table data chunk, if none exists, then undefined.
     * @private
     */
    private getLeftChunk(start: number): TableDataChunk {
        if (start < this.tableMetadata.headChunk.start) {
            return undefined;
        }
        let left: TableDataChunk = this.tableMetadata.headChunk;
        while (left.next !== undefined && left.next.start <= start) {
            left = left.next;
        }
        return left;
    }

    /**
     * Gets the chunk which is to the right of end
     * If end is contained in a chunk, it will return that chunk.
     * If there is no right, then undefined is returned
     *
     * @param end the end value
     * @return The table data chunk, if none exists, then undefined.
     * @private
     */
    private getRightChunk(end: number): TableDataChunk {
        if (end > this.tableMetadata.tailChunk.end) {
            return undefined;
        }
        let right: TableDataChunk = this.tableMetadata.tailChunk;
        while (right.prev !== undefined && right.prev.end >= end) {
            right = right.prev;
        }
        return right;
    }

    /**
     * Get the rows cache.
     */
    public getRows(): any[] {
        return this._rows;
    }

    /**
     * Fetch the rows which should be displayed on the component.
     *
     * @param startRow the starting index of the page
     * @param pageSize the size of the page
     * @param termState the state of the term component which is the parent of the table
     * @param action The action user took to fetch the page
     */
    public async fetchPage(startRow: number, pageSize: number, termState: TermState, action: string = undefined): Promise<void> {
        if (!this.isValidRow(startRow)) {
            return;
        }
        let endPage: number = Math.min(startRow + pageSize, this.tableMetadata.tableLength);
        let chunk: TableDataChunk = this.rangeAvailable(startRow, endPage);
        if (chunk === undefined) {
            // Check if this data was already requested
            if (startRow in this.dataRequestsMap) {
                // wait for the requested
                TableService.log('Prefetched previously, waiting for its response.')
                await this.dataRequestsMap[startRow].promise;
                // It is possible that the page size has changed in between the last request and the current request.
                // If the page size increased, (i.e. truncated mode was enabled), we request again for the full data.
                chunk = this.rangeAvailable(startRow, endPage);
            }
            // if requested page is not found, then fetch the data and add the data request to the map.
            if (chunk === undefined) {
                this.dataRequestsMap[startRow] = {
                    end: endPage,
                    promise: this.fetchData(startRow, endPage, termState)
                }
                await this.dataRequestsMap[startRow].promise;
            }
            return;
        }
        // Current Page was already found. Check if we need to the prefetch the next/prev set of rows
        if (TableService.preFetchPageThreshold > 0 && action !== undefined) {
            this.prefetchData(action, chunk, startRow, pageSize, termState);
        }
    }

    /**
     * Check if prefetching applies and prefetch the data.
     *
     * @param action The action performed
     * @param chunk the chunk which was selected
     * @param startRow the start row of the current page
     * @param pageSize the current page size
     * @param termState The term state
     * @private
     */
    private prefetchData(action: string, chunk: TableDataChunk, startRow: number, pageSize: number, termState: TermState) {
        if (action === 'PageDown' && chunk.end < this.tableMetadata.tableLength) {
            let pagesAvailableAhead = Math.floor((chunk.end - startRow) / pageSize);
            if (pagesAvailableAhead === TableService.preFetchPageThreshold) {
                let preFetchStartRows: number = Math.min(startRow + TableService.preFetchPageThreshold * pageSize, chunk.end);
                let preFetchEndRows: number = Math.min(preFetchStartRows + pageSize, this.tableMetadata.tableLength);
                this.addFetchDataRequest(preFetchStartRows, preFetchEndRows, termState);
            }
        } else if (action === 'PageUp' && chunk.start > 0) {
            let pagesAvailableBehind = Math.floor((startRow - chunk.start) / pageSize) + 1;
            if (pagesAvailableBehind === TableService.preFetchPageThreshold) {
                let preFetchStartRows: number = Math.max(0, startRow - (TableService.preFetchPageThreshold * pageSize));
                let preFetchEndRows: number = Math.min(preFetchStartRows + pageSize, this.tableMetadata.tableLength);
                this.addFetchDataRequest(preFetchStartRows, preFetchEndRows, termState);
            }
        }
    }

    private addFetchDataRequest(fetchStartRows: number, fetchEndRows: number, termState: TermState) {
        if (fetchStartRows in this.dataRequestsMap) {
            return;
        }
        TableService.log('Prefetching rows from {} to {}', fetchStartRows, fetchEndRows);
        this.dataRequestsMap[fetchStartRows] = {
            end: fetchEndRows,
            promise: this.fetchData(fetchStartRows, fetchEndRows, termState)
        };
    }

    /**
     * Request data and update the table metadata with the result
     *
     * @param pageStart the page start
     * @param pageEnd the page end
     * @param termState the state of term component parent to this table component
     */
    public async fetchData(
        pageStart: number,
        pageEnd: number,
        termState: TermState
    ): Promise<boolean> {
        TableService.log('Fetching data for %s of range (%d, %d)', this.tableMetadata.componentId, pageStart, pageEnd);
        // Find the starting point of the new chunk
        let message: RequestMessage = this.buildDataRequestMessage(pageStart, pageEnd);
        AbstTermComponent.isWaitingForBackendResponse = true;
        termState.isFetchingTableData = true;
        let response: BackendMessage = undefined;
        try {
            // Technically we shouldn't need transactionId / parameters
            response = await this.transactionService.fetchData(message);
        } finally {
            AbstTermComponent.isWaitingForBackendResponse = false;
            termState.isFetchingTableData = false;
        }
        // Remove it from the dat requests map.
        delete this.dataRequestsMap[pageStart];
        if (response) {
            let unpackResult = this.unpackAndPopulate(response, termState);
            if (!unpackResult.isError) {
                this.updateCache(unpackResult);
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Update the table cache using the unpacked result
     *
     * @param unpackResult The result unpacked
     * @private
     */
    private updateCache(unpackResult: { data: any; isError: boolean }) {
        // Update the table cache.
        Object.keys(unpackResult.data).map(key => Number(key))
            .filter(key => !isNaN(key)).forEach(key => {
            this._rows[key] = unpackResult.data[key];
        });
        // Index the new chunk.
        let start: number = unpackResult.data['start'];
        let end: number = unpackResult.data['end'];
        this.indexChunks(start, end);
    }

    /**
     * Check if the range is available in the cache.
     *
     * @param start the start of the range to check
     * @param end the end of the range to check
     * @private
     */
    private rangeAvailable(start: number, end: number): TableDataChunk {
        let chunk: TableDataChunk = this.findLeastStartWithEndLtStartGt(this.tableMetadata.currentChunk, start);
        return chunk?.contains(start, end) ? chunk : undefined;
    }

    private findLeastStartWithEndLtStartGt(chunk: TableDataChunk, pageStart: number): TableDataChunk {
        let result: TableDataChunk = chunk;
        // If chunk is after the page keep looking left
        while (result.prev && result.prev.end > pageStart) {
            result = chunk.prev;
        }
        // If chunk is before the page keep looking right
        while (result && result.end < pageStart) {
            result = result.next;
        }
        return result;
    }

    /**
     * Build a data request message for the backend.
     *
     * @param pageStart the start of data required
     * @param pageEnd the end of data required
     * @private
     */
    private buildDataRequestMessage(pageStart: number, pageEnd: number): RequestMessage {
        let expandLeft: number = 0;
        let expandRight: number = this.tableMetadata.tableLength;
        let crStart: number, crEnd: number;
        let chunk: TableDataChunk = this.getLeftChunk(pageStart);
        let chunkRequests: RangeRequest[] = [];

        if (chunk === undefined) {
            crStart = pageStart;
            // Start with the head chunk.
            chunk = this.tableMetadata.headChunk;
        } else {
            expandLeft = chunk.end;
            // If the pageStart is contained in chunk, then its chunk.end otherwise its pageStart
            crStart = Math.max(pageStart, chunk.end);
            // Let start with the next chunk.
            chunk = chunk.next;
        }
        // Keep going through all the chunks and add requests if there are gaps.
        while (chunk !== undefined && chunk.end <= pageEnd) {
            crEnd = chunk.start;
            chunkRequests.push(MessageUtils.buildRangeRequest(crStart, crEnd));
            crStart = chunk.end;
            chunk = chunk.next;
        }
        if (chunk === undefined) {
            // Reached the end of the list
            crEnd = Math.min(pageEnd, this.tableMetadata.tableLength);
        } else {
            expandRight = chunk.start;
            // If the pageEnd is contained in the chunk, then its chunk, otherwise its pageEnd.
            crEnd = Math.min(chunk.start, pageEnd);
        }
        chunkRequests.push(MessageUtils.buildRangeRequest(crStart, crEnd));
        let requests: Request[] = [
            MessageUtils.buildTableDataRequest(this.tableMetadata.componentId, expandLeft, expandRight,
                chunkRequests)
        ];
        return MessageUtils.buildRequestMessage(requests);
    }

    /**
     * Unpack the response and populate the metadata
     *
     * @param response The response from the server
     * @param termState The state of the term component parent to the table component.
     * @private
     */
    private unpackAndPopulate(
        response: BackendMessage,
        termState: TermState
    ): { data: any, isError: boolean } {
        let result = {data: undefined, isError: true};
        // We are expected at least one logical message
        if (response.messages === undefined || response.messages.length == 0) {
            TableService.log('Invalid response from backend.');
            return result;
        }
        let message: LogicalMessage;
        for (message of response.messages) {
            if (message.command === 'updateTableComponents') {
                let updateMessage: UpdateTableComponents = message as UpdateTableComponents;
                // Double-check the component id
                let map: Map;
                // There should be only one since we queried for only one.
                for (map of updateMessage.maps) {
                    // The map here is the field (subfile) and not table (subfile control)
                    if (this.tableMetadata.componentId != map.component) {
                        TableService.log('Unknown component ', map.component,
                            ' discovered when requesting data for ', this.tableMetadata.componentId);
                    } else if (map.fields !== undefined) {
                        let data: any = new Data();
                        result.data = data;
                        this.fieldInitializationService.processArrayField(map, data, termState);
                        result.isError = false;
                    }
                }
            } else {
                TableService.log('Unknown message type ', message.command,
                    ' when trying to unpack data for table');
            }
        }

        return result;
    }

    /**
     * Check if the page starting with pageStart is the last page or not
     *
     * @param pageStart The page start
     * @param pageSize The page size
     * @returns true if it is the last page, otherwise false
     */
    public isLastPage(pageStart: number, pageSize: number): boolean {
        return (pageStart + pageSize) >= this.tableMetadata.tableLength;
    }

    /**
     * Determine if the row number given is a valid row or not
     *
     * @param pageStart the page start
     */
    public isValidRow(pageStart: number): boolean {
        return 0 <= pageStart && pageStart < this.tableMetadata.tableLength;
    }

    /**
     * For testing purposes only.
     *
     * @param data the data to log
     */
    private static log(...data: any[]) {
        // console.log(...data);
    }

    /**
     * Return the length of the actual table
     */
    public getTableLength(): number {
        return this.tableMetadata.tableLength;
    }
}
