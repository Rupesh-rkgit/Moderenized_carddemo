package aws.bluage.l3.workshop.cobil00c.service;

import aws.bluage.l3.workshop.cobil00c.business.context.Cobil00cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cobil00cProcess.
 * 
 * Defines application services for Cobil00cProcess
 */
public interface Cobil00cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COBIL00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation processEnterKey.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-ENTER-KEY
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void processEnterKey(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getCurrentTimestamp.
	 * 
	 * ----------------------------------------------------------------*
	 *                       GET-CURRENT-TIMESTAMP
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getCurrentTimestamp(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation returnToPrevScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RETURN-TO-PREV-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void returnToPrevScreen(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendBillpayScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-BILLPAY-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendBillpayScreen(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveBillpayScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-BILLPAY-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveBillpayScreen(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation populateHeaderInfo.
	 * 
	 * ----------------------------------------------------------------*
	 *                       POPULATE-HEADER-INFO
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void populateHeaderInfo(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readAcctdatFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-ACCTDAT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readAcctdatFile(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation updateAcctdatFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       UPDATE-ACCTDAT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void updateAcctdatFile(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readCxacaixFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-CXACAIX-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readCxacaixFile(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation startbrTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       STARTBR-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void startbrTransactFile(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readprevTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READPREV-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readprevTransactFile(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation endbrTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       ENDBR-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void endbrTransactFile(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       WRITE-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeTransactFile(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation clearCurrentScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       CLEAR-CURRENT-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void clearCurrentScreen(final Cobil00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation initializeAllFields.
	 * 
	 * ----------------------------------------------------------------*
	 *                       INITIALIZE-ALL-FIELDS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void initializeAllFields(final Cobil00cContext ctx, final ExecutionController ctrl);

}
