package aws.bluage.l3.workshop.cotrn01c.service;

import aws.bluage.l3.workshop.cotrn01c.business.context.Cotrn01cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cotrn01cProcess.
 * 
 * Defines application services for Cotrn01cProcess
 */
public interface Cotrn01cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COTRN01C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Cotrn01cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Cotrn01cContext ctx, final ExecutionController ctrl);

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
	void returnToPrevScreen(final Cotrn01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendTrnviewScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-TRNVIEW-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendTrnviewScreen(final Cotrn01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveTrnviewScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-TRNVIEW-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveTrnviewScreen(final Cotrn01cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Cotrn01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readTransactFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-TRANSACT-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readTransactFile(final Cotrn01cContext ctx, final ExecutionController ctrl);

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
	void clearCurrentScreen(final Cotrn01cContext ctx, final ExecutionController ctrl);

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
	void initializeAllFields(final Cotrn01cContext ctx, final ExecutionController ctrl);

}
