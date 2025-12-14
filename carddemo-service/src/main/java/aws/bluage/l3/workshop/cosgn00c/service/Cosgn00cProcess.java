package aws.bluage.l3.workshop.cosgn00c.service;

import aws.bluage.l3.workshop.cosgn00c.business.context.Cosgn00cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cosgn00cProcess.
 * 
 * Defines application services for Cosgn00cProcess
 */
public interface Cosgn00cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COSGN00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Cosgn00cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Cosgn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendSignonScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-SIGNON-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendSignonScreen(final Cosgn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendPlainText.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-PLAIN-TEXT
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendPlainText(final Cosgn00cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Cosgn00cContext ctx, final ExecutionController ctrl);

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
	void readUserSecFile(final Cosgn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation addProgramLog.
	 * 
	 * ****************************************************************
	 *  Common Logging Routines
	 * ****************************************************************
	 * ****************************************************************
	 *               ADD LOG DEPENDING ON PROGRAM LOG LEVEL
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void addProgramLog(final Cosgn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getProgramLogLevel.
	 * 
	 * ****************************************************************
	 *                       GET PROGRAM LOG LEVEL
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getProgramLogLevel(final Cosgn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation addProgramLogDebug.
	 * 
	 * ****************************************************************
	 *                           ADD LOG DEBUG
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void addProgramLogDebug(final Cosgn00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation addProgramLogTrace.
	 * 
	 * ****************************************************************
	 *                            ADD LOG TRACE
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void addProgramLogTrace(final Cosgn00cContext ctx, final ExecutionController ctrl);

}
