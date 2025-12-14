package aws.bluage.l3.workshop.corpt00c.service;

import aws.bluage.l3.workshop.corpt00c.business.context.Corpt00cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Corpt00cProcess.
 * 
 * Defines application services for Corpt00cProcess
 */
public interface Corpt00cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.CORPT00C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Corpt00cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Corpt00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation submitJobToIntrdr.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SUBMIT-JOB-TO-INTRDR
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void submitJobToIntrdr(final Corpt00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation wirteJobsubTdq.
	 * 
	 * ----------------------------------------------------------------*
	 *                       WIRTE-JOBSUB-TDQ
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void wirteJobsubTdq(final Corpt00cContext ctx, final ExecutionController ctrl);

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
	void returnToPrevScreen(final Corpt00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendTrnrptScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-TRNRPT-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendTrnrptScreen(final Corpt00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation returnToCics.
	 * 
	 * ----------------------------------------------------------------*
	 *                          RETURN-TO-CICS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void returnToCics(final Corpt00cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveTrnrptScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-TRNRPT-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveTrnrptScreen(final Corpt00cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Corpt00cContext ctx, final ExecutionController ctrl);

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
	void initializeAllFields(final Corpt00cContext ctx, final ExecutionController ctrl);

}
