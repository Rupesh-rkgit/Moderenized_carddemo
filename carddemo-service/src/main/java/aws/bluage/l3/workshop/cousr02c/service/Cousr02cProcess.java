package aws.bluage.l3.workshop.cousr02c.service;

import aws.bluage.l3.workshop.cousr02c.business.context.Cousr02cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cousr02cProcess.
 * 
 * Defines application services for Cousr02cProcess
 */
public interface Cousr02cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COUSR02C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Cousr02cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Cousr02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation updateUserInfo.
	 * 
	 * ----------------------------------------------------------------*
	 *                       UPDATE-USER-INFO
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void updateUserInfo(final Cousr02cContext ctx, final ExecutionController ctrl);

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
	void returnToPrevScreen(final Cousr02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendUsrupdScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-USRUPD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendUsrupdScreen(final Cousr02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveUsrupdScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-USRUPD-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveUsrupdScreen(final Cousr02cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Cousr02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READ-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readUserSecFile(final Cousr02cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation updateUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       UPDATE-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void updateUserSecFile(final Cousr02cContext ctx, final ExecutionController ctrl);

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
	void clearCurrentScreen(final Cousr02cContext ctx, final ExecutionController ctrl);

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
	void initializeAllFields(final Cousr02cContext ctx, final ExecutionController ctrl);

}
