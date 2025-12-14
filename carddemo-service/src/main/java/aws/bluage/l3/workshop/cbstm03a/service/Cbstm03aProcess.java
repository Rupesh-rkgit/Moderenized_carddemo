package aws.bluage.l3.workshop.cbstm03a.service;

import aws.bluage.l3.workshop.cbstm03a.business.context.Cbstm03aContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface Cbstm03aProcess.
 * 
 * Defines application services for Cbstm03aProcess
 */
public interface Cbstm03aProcess {

	/**
	 * Process operation cbstm03a.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void cbstm03a(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation goback.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void goback(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation xreffileGetNext.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void xreffileGetNext(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation custfileGet.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void custfileGet(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileGet.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileGet(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation trnxfileGet.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void trnxfileGet(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation createStatement.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void createStatement(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeHtmlHeader.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeHtmlHeader(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeHtmlNmadbs.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeHtmlNmadbs(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation writeTrans.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void writeTrans(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation trnxfileOpen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void trnxfileOpen(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation xreffileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void xreffileOpen(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation custfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void custfileOpen(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileOpen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileOpen(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileOpen1.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileOpen1(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation readtrnxRead.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void readtrnxRead(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation exit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void exit(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation trnxfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void trnxfileClose(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation xreffileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void xreffileClose(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation custfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void custfileClose(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation acctfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void acctfileClose(final Cbstm03aContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation abendProgram.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void abendProgram(final Cbstm03aContext ctx, final ExecutionController ctrl);

}
