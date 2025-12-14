package aws.bluage.l3.workshop.cbact04c.service;

import aws.bluage.l3.workshop.cbact04c.business.context.Cbact04cContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cbact04cProcess.
 * 
 * Defines application services for Cbact04cProcess
 */
public interface Cbact04cProcess {

	/**
	 * Process operation procedureDivision.
	 * 
	 * PROGRAM-ID.CBACT04C.
	 *  AUTHOR.        AWS.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void procedureDivision(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tcatbalfOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tcatbalfOpen(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation xreffileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void xreffileOpen(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation discgrpOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void discgrpOpen(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileOpen(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tranfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tranfileOpen(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tcatbalfGetNext.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tcatbalfGetNext(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation updateAccount.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void updateAccount(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getAcctData.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getAcctData(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getXrefData.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getXrefData(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation getInterestRate.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void getInterestRate(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation aGetDefaultIntRate.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void aGetDefaultIntRate(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation computeInterest.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void computeInterest(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation bWriteTx.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void bWriteTx(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tcatbalfClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tcatbalfClose(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation xreffileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void xreffileClose(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation discgrpClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void discgrpClose(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileClose(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation tranfileClose.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void tranfileClose(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation zGetDb2FormatTimestamp.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void zGetDb2FormatTimestamp(final Cbact04cContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation abendProgram.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void abendProgram(final Cbact04cContext ctx, final ExecutionController ctrl);

}
