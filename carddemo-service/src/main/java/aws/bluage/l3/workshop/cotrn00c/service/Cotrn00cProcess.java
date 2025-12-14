package aws.bluage.l3.workshop.cotrn00c.service;

import aws.bluage.l3.workshop.cotrn00c.business.context.Cotrn00cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cotrn00cProcess.
 * 
 * Defines application services for Cotrn00cProcess
 */
public interface Cotrn00cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COTRN00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Cotrn00cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Cotrn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation processPf7Key.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-PF7-KEY
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void processPf7Key(final Cotrn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation processPf8Key.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-PF8-KEY
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void processPf8Key(final Cotrn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation processPageForward.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-PAGE-FORWARD
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void processPageForward(final Cotrn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation processPageBackward.
	 * 
	 * ----------------------------------------------------------------*
	 *                       PROCESS-PAGE-BACKWARD
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void processPageBackward(final Cotrn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation populateTranData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       POPULATE-TRAN-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void populateTranData(final Cotrn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation initializeTranData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       INITIALIZE-TRAN-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void initializeTranData(final Cotrn00cContext ctx, final ExecutionController ctrl);

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
	void returnToPrevScreen(final Cotrn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendTrnlstScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-TRNLST-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendTrnlstScreen(final Cotrn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveTrnlstScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-TRNLST-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveTrnlstScreen(final Cotrn00cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Cotrn00cContext ctx, final ExecutionController ctrl);

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
	void startbrTransactFile(final Cotrn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readnextTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READNEXT-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readnextTransactFile(final Cotrn00cContext ctx, final ExecutionController ctrl);

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
	void readprevTransactFile(final Cotrn00cContext ctx, final ExecutionController ctrl);

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
	void endbrTransactFile(final Cotrn00cContext ctx, final ExecutionController ctrl);

}
