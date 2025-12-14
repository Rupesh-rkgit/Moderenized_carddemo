package aws.bluage.l3.workshop.cousr00c.service;

import aws.bluage.l3.workshop.cousr00c.business.context.Cousr00cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cousr00cProcess.
 * 
 * Defines application services for Cousr00cProcess
 */
public interface Cousr00cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COUSR00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Cousr00cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Cousr00cContext ctx, final ExecutionController ctrl);

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
	void processPf7Key(final Cousr00cContext ctx, final ExecutionController ctrl);

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
	void processPf8Key(final Cousr00cContext ctx, final ExecutionController ctrl);

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
	void processPageForward(final Cousr00cContext ctx, final ExecutionController ctrl);

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
	void processPageBackward(final Cousr00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation populateUserData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       POPULATE-USER-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void populateUserData(final Cousr00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation initializeUserData.
	 * 
	 * ----------------------------------------------------------------*
	 *                       INITIALIZE-USER-DATA
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void initializeUserData(final Cousr00cContext ctx, final ExecutionController ctrl);

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
	void returnToPrevScreen(final Cousr00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendUsrlstScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-USRLST-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendUsrlstScreen(final Cousr00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveUsrlstScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-USRLST-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveUsrlstScreen(final Cousr00cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Cousr00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation startbrUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       STARTBR-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void startbrUserSecFile(final Cousr00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readnextUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READNEXT-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readnextUserSecFile(final Cousr00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readprevUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       READPREV-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readprevUserSecFile(final Cousr00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation endbrUserSecFile.
	 * 
	 * ----------------------------------------------------------------*
	 *                       ENDBR-USER-SEC-FILE
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void endbrUserSecFile(final Cousr00cContext ctx, final ExecutionController ctrl);

}
