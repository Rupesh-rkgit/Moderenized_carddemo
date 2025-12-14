import {
    RangeRequest,
    Request, RequestMessage,
    TableDataRequest
} from '../../term/request-message.model';

/**
 * Utils class used to build messages to server
 */
export class MessageUtils {

    /**
     * Utility function to build a range request
     *
     * @param start the start of the requested range
     * @param end the end of the requested range
     */
    static buildRangeRequest(start: number, end: number): RangeRequest {
        return new RangeRequest(start, end);
    }

    /**
     * Utility function to build a table data request
     *
     * @param componentId the component id of the request
     * @param expandLeft the minimum expansion possible on the left side of the chunk
     * @param expandRight the maximum expansion possible on the right side of the chunk
     * @param rangesRequired list of ranges which are required for the table.
     */
    static buildTableDataRequest(componentId: string, expandLeft: number, expandRight: number,
        rangesRequired: RangeRequest[]): TableDataRequest {
        let request: TableDataRequest = new TableDataRequest();
        request.componentId = componentId;
        request.expandLeft = expandLeft;
        request.expandRight = expandRight;
        request.rangesRequired = rangesRequired;
        return request;
    }

    /**
     * Utility function to build a request message from an array of requests
     *
     * @param requests The requests array
     */
    static buildRequestMessage(requests: Request[]): RequestMessage {
        let requestMessage: RequestMessage = new RequestMessage();
        requestMessage.type = 'REQUEST';
        requestMessage.requests = requests;
        return requestMessage;
    }
}
