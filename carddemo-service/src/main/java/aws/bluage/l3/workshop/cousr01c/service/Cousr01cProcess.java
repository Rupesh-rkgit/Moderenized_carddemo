package aws.bluage.l3.workshop.cousr01c.service;

import aws.bluage.l3.workshop.cousr01c.business.context.Cousr01cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cousr01cProcess.
 * 
 * Defines application services for Cousr01cProcess
 */
public interface Cousr01cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COUSR01C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Cousr01cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Cousr01cContext ctx, final ExecutionController ctrl);

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
	void returnToPrevScreen(final Cousr01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendUsraddScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-USRADD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendUsraddScreen(final Cousr01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveUsraddScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-USRADD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveUsraddScreen(final Cousr01cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Cousr01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       WRITE-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeUserSecFile(final Cousr01cContext ctx, final ExecutionController ctrl);

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
	void clearCurrentScreen(final Cousr01cContext ctx, final ExecutionController ctrl);

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
	void initializeAllFields(final Cousr01cContext ctx, final ExecutionController ctrl);

}
