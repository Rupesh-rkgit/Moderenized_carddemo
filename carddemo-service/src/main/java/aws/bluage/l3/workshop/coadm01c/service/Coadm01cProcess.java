package aws.bluage.l3.workshop.coadm01c.service;

import aws.bluage.l3.workshop.coadm01c.business.context.Coadm01cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Coadm01cProcess.
 * 
 * Defines application services for Coadm01cProcess
 */
public interface Coadm01cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COADM01C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Coadm01cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Coadm01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation returnToSignonScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RETURN-TO-SIGNON-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void returnToSignonScreen(final Coadm01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation sendMenuScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       SEND-MENU-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void sendMenuScreen(final Coadm01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation receiveMenuScreen.
	 * 
	 * ----------------------------------------------------------------*
	 *                       RECEIVE-MENU-SCREEN
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void receiveMenuScreen(final Coadm01cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Coadm01cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation buildMenuOptions.
	 * 
	 * ----------------------------------------------------------------*
	 *                       BUILD-MENU-OPTIONS
	 * ----------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void buildMenuOptions(final Coadm01cContext ctx, final ExecutionController ctrl);

}
