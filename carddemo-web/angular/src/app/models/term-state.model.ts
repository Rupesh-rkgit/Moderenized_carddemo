import {Injectable} from '@angular/core';
import {Data} from '@angular/router';

/**
 * Class used to maintain the state of the term component (whether modal or regular term)
 */
@Injectable()
export class TermState {
  // Keep track of injected fields(s), by position
  fieldsByPosition: { [key: number]: Data } = {}
  // Keep track of progress of tableDataFetch
  isFetchingTableData: boolean = false;
}
