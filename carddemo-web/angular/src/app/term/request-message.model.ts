/**
 * The request message sent to the backend to retrieve a response
 * Matches the structure of FrontEndMessageBean
 */
export class RequestMessage {
    type: string = "REQUEST";
    requests: Request[];
}

/**
 * Abstract class for request
 */
export abstract class Request {
    type: string
}

/**
 * The request message sent to the backend to retrieve a response
 * Matches the structure of FrontEndMessageBean
 */
export class TableDataRequest extends Request {
    componentId: string;
    expandLeft: number;
    expandRight: number;
    rangesRequired: RangeRequest[];
}

/**
 * Class used to store the requests for range
 */
export class RangeRequest {
    constructor(
      public start: number,
      public end: number
    ) {}
}
