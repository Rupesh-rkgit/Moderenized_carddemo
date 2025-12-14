package aws.bluage.l3.workshop.cotrn02c.service;

import aws.bluage.l3.workshop.cotrn02c.business.context.Cotrn02cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cotrn02cProcess.
 * 
 * Defines application services for Cotrn02cProcess
 */
public interface Cotrn02cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COTRN02C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Cotrn02cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation validateInputKeyFields.
	 * 
	 * ----------------------------------------------------------------*
	 *                       VALIDATE-INPUT-KEY-FIELDS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void validateInputKeyFields(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation validateInputDataFields.
	 * 
	 * ----------------------------------------------------------------*
	 *                  VALIDATE-INPUT-DATA-FIELDS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void validateInputDataFields(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation addTransaction.
	 * 
	 * ----------------------------------------------------------------*
	 *                         ADD-TRANSACTION
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void addTransaction(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation copyLastTranData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       COPY-LAST-TRAN-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void copyLastTranData(final Cotrn02cContext ctx, final ExecutionController ctrl);

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
	void returnToPrevScreen(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendTrnaddScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-TRNADD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendTrnaddScreen(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveTrnaddScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-TRNADD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveTrnaddScreen(final Cotrn02cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Cotrn02cContext ctx, final ExecutionController ctrl);

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
	void readCxacaixFile(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readCcxrefFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-CCXREF-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readCcxrefFile(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation startbrTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                     STARTBR-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void startbrTransactFile(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readprevTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                     READPREV-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readprevTransactFile(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation endbrTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                     ENDBR-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void endbrTransactFile(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                     WRITE-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeTransactFile(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation clearCurrentScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                     CLEAR-CURRENT-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void clearCurrentScreen(final Cotrn02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation initializeAllFields.
	 * 
	 * ----------------------------------------------------------------*
	 *                     INITIALIZE-ALL-FIELDS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void initializeAllFields(final Cotrn02cContext ctx, final ExecutionController ctrl);

}
