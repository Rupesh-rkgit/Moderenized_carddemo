package aws.bluage.l3.workshop.cousr03c.service;

import aws.bluage.l3.workshop.cousr03c.business.context.Cousr03cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cousr03cProcess.
 * 
 * Defines application services for Cousr03cProcess
 */
public interface Cousr03cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COUSR03C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Cousr03cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Cousr03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation deleteUserInfo.
	 * 
	 * ----------------------------------------------------------------*
	 *                       DELETE-USER-INFO
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void deleteUserInfo(final Cousr03cContext ctx, final ExecutionController ctrl);

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
	void returnToPrevScreen(final Cousr03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendUsrdelScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-USRDEL-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendUsrdelScreen(final Cousr03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveUsrdelScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-USRDEL-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveUsrdelScreen(final Cousr03cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Cousr03cContext ctx, final ExecutionController ctrl);

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
	void readUserSecFile(final Cousr03cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation deleteUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       DELETE-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void deleteUserSecFile(final Cousr03cContext ctx, final ExecutionController ctrl);

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
	void clearCurrentScreen(final Cousr03cContext ctx, final ExecutionController ctrl);

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
	void initializeAllFields(final Cousr03cContext ctx, final ExecutionController ctrl);

}
