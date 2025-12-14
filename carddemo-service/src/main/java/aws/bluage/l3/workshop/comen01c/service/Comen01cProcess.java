package aws.bluage.l3.workshop.comen01c.service;

import aws.bluage.l3.workshop.comen01c.business.context.Comen01cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Comen01cProcess.
 * 
 * Defines application services for Comen01cProcess
 */
public interface Comen01cProcess {

	/**
	 * Process operation mainPara.
	 * 
	 * PROGRAM-ID.COMEN01C.
	 *  AUTHOR.     AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void mainPara(final Comen01cContext ctx, final ExecutionController ctrl);

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
	void processEnterKey(final Comen01cContext ctx, final ExecutionController ctrl);

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
	void returnToSignonScreen(final Comen01cContext ctx, final ExecutionController ctrl);

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
	void sendMenuScreen(final Comen01cContext ctx, final ExecutionController ctrl);

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
	void receiveMenuScreen(final Comen01cContext ctx, final ExecutionController ctrl);

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
	void populateHeaderInfo(final Comen01cContext ctx, final ExecutionController ctrl);

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
	void buildMenuOptions(final Comen01cContext ctx, final ExecutionController ctrl);

}
