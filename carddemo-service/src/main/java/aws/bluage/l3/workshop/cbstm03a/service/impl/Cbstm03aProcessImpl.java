
package aws.bluage.l3.workshop.cbstm03a.service.impl;

import aws.bluage.l3.workshop.cbstm03a.business.context.Cbstm03aContext;
import aws.bluage.l3.workshop.cbstm03a.service.Cbstm03aProcess;
import aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineController;
import aws.bluage.l3.workshop.core.Abend;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.io.SequentialFile;
import com.netfective.bluage.gapwalk.runtime.statements.CallBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * Class Cbstm03aProcessImpl
 * 
 * Defines application services for Cbstm03aProcess
 * @see Cbstm03aProcess
 */
@Service("aws.bluage.l3.workshop.cbstm03a.service.Cbstm03aProcess")
@Import({
aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineController.class,aws.bluage.l3.workshop.core.impl.AbendImpl.class 
}) 	
public class Cbstm03aProcessImpl implements Cbstm03aProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cbstm03aProcessImpl.class);

	@Autowired
	private Cbstm03aProceduredivisionStateMachineController cbstm03aProceduredivisionStateMachineRunner;

	@Autowired
	private Abend abendInstance;


	/**
	 * Process operation cbstm03a.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void cbstm03a(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		cbstm03aProceduredivisionStateMachineRunner.run(ctx,ctrl);
	}

	/**
	 * Process operation goback.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void goback(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		if (ctx.isMainProgram()) {
			ctrl.stopRunUnit();
		}
	}

	/**
	 * Process operation xreffileGetNext.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void xreffileGetNext(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("XREFFILE");
		ctx.getWsM03bArea().setM03bRead(true);
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		DataUtils.setToBlank(ctx.getWsM03bArea().getWsM03bFldtReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0) {
			
			/* 
			Do nothing */
		} else if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "10") == 0) {
			ctx.getMiscVariables().setEndOfFile("Y");
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING XREFFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
		ctx.getCardXrefRecord().setBytes(ctx.getWsM03bArea().getWsM03bFldtReference().getBytes());
	}

	/**
	 * Process operation custfileGet.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void custfileGet(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("CUSTFILE");
		ctx.getWsM03bArea().setM03bReadK(true);
		ctx.getWsM03bArea().setWsM03bKey(ctx.getCardXrefRecord().getXrefCustIdReference().getValue(String.class));
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bKeyLnReference());
		ctx.getWsM03bArea().setWsM03bKeyLn(ctx.getCardXrefRecord().getXrefCustIdReference().getRecord().getSize());
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		DataUtils.setToBlank(ctx.getWsM03bArea().getWsM03bFldtReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING CUSTFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
		ctx.getCustomerRecord().setBytes(ctx.getWsM03bArea().getWsM03bFldtReference().getBytes());
	}

	/**
	 * Process operation acctfileGet.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void acctfileGet(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("ACCTFILE");
		ctx.getWsM03bArea().setM03bReadK(true);
		ctx.getWsM03bArea().setWsM03bKey(ctx.getCardXrefRecord().getXrefAcctIdReference().getValue(String.class));
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bKeyLnReference());
		ctx.getWsM03bArea().setWsM03bKeyLn(ctx.getCardXrefRecord().getXrefAcctIdReference().getRecord().getSize());
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		DataUtils.setToBlank(ctx.getWsM03bArea().getWsM03bFldtReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING ACCTFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
		ctx.getAccountRecord().setBytes(ctx.getWsM03bArea().getWsM03bFldtReference().getBytes());
	}

	/**
	 * Process operation trnxfileGet.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void trnxfileGet(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		SequentialFile htmlFile = ctx.getHtmlFileHandler(ctrl.getExecutionContext()); 
		SequentialFile stmtFile = ctx.getStmtFileHandler(ctrl.getExecutionContext()); 
		ctx.getCompVariables().setCrJmp(1);
		while (!(ctx.getCompVariables().getCrJmp() > ctx.getCompVariables().getCrCnt() || DataUtils.compare(ctx.getWsTrnxTable().getItemFromWsCardNumReference(ctx.getCompVariables().getCrJmp() - 1), ctx.getCardXrefRecord().getXrefCardNumReference()) > 0)) {
			if (DataUtils.compare(ctx.getCardXrefRecord().getXrefCardNumReference(), ctx.getWsTrnxTable().getItemFromWsCardNumReference(ctx.getCompVariables().getCrJmp() - 1)) == 0) {
				ctx.getTrnxRecord().getTrnxCardNumReference().setValue(ctx.getWsTrnxTable().getItemFromWsCardNumReference(ctx.getCompVariables().getCrJmp() - 1));
				ctx.getCompVariables().setTrJmp(1);
				while (ctx.getCompVariables().getTrJmp() <= ctx.getWsTrnTblCntr().getItemFromWsTrct(ctx.getCompVariables().getCrJmp() - 1)) {
					ctx.getTrnxRecord().getTrnxIdReference().setValue(ctx.getWsTrnxTable().getItemFromWsTranNumReference(ctx.getCompVariables().getCrJmp() - 1,ctx.getCompVariables().getTrJmp() - 1));
					ctx.getTrnxRecord().getTrnxRestReference().setBytes(ctx.getWsTrnxTable().getItemFromWsTranRestReference(ctx.getCompVariables().getCrJmp() - 1,ctx.getCompVariables().getTrJmp() - 1).getBytes());
					writeTrans(ctx, ctrl);
					ctx.getComp3Variables().setWsTotalAmt(ctx.getComp3Variables().getWsTotalAmt().add(ctx.getTrnxRecord().getTrnxAmt()));
					ctx.getCompVariables().setTrJmp(ctx.getCompVariables().getTrJmp() + 1);
				}
			} 
			ctx.getCompVariables().setCrJmp(ctx.getCompVariables().getCrJmp() + 1);
		}
		ctx.getMiscVariables().setWsTrnAmt(ctx.getComp3Variables().getWsTotalAmt());
		ctx.getStatementLines().getStTotalTramtReference().setValue(ctx.getMiscVariables().getWsTrnAmt());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine12Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine14aReference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine15Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getHtmlLines().setHtmlLtrs(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL10(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL75(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtre(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL78(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL79(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL80(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
	}

	/**
	 * Process operation createStatement.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void createStatement(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		SequentialFile stmtFile = ctx.getStmtFileHandler(ctrl.getExecutionContext()); 
		ctx.getStatementLines().getField().initialize();
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine0Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		writeHtmlHeader(ctx, ctrl);
		StringConcatenationBuilder.newInstance(ctx.getStatementLines().getStNameReference())
			.addDelimitedByLiteral(ctx.getCustomerRecord().getCustFirstName()," ")
			.addDelimitedBySize(" ")
			.addDelimitedByLiteral(ctx.getCustomerRecord().getCustMiddleName()," ")
			.addDelimitedBySize(" ")
			.addDelimitedByLiteral(ctx.getCustomerRecord().getCustLastName()," ")
			.addDelimitedBySize(" ")
			.end();
		ctx.getStatementLines().getStAdd1Reference().setValue(ctx.getCustomerRecord().getCustAddrLine1Reference());
		ctx.getStatementLines().getStAdd2Reference().setValue(ctx.getCustomerRecord().getCustAddrLine2Reference());
		StringConcatenationBuilder.newInstance(ctx.getStatementLines().getStAdd3Reference())
			.addDelimitedByLiteral(ctx.getCustomerRecord().getCustAddrLine3()," ")
			.addDelimitedBySize(" ")
			.addDelimitedByLiteral(ctx.getCustomerRecord().getCustAddrStateCd()," ")
			.addDelimitedBySize(" ")
			.addDelimitedByLiteral(ctx.getCustomerRecord().getCustAddrCountryCd()," ")
			.addDelimitedBySize(" ")
			.addDelimitedByLiteral(ctx.getCustomerRecord().getCustAddrZip()," ")
			.addDelimitedBySize(" ")
			.end();
		ctx.getStatementLines().setStAcctId(ctx.getAccountRecord().getAcctIdReference().getValue(String.class));
		ctx.getStatementLines().getStCurrBalReference().setValue(ctx.getAccountRecord().getAcctCurrBal());
		ctx.getStatementLines().setStFicoScore(ctx.getCustomerRecord().getCustFicoCreditScoreReference().getValue(String.class));
		writeHtmlNmadbs(ctx, ctrl);
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine1Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine2Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine3Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine4Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine5Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine6Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine5Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine7Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine8Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine9Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine10Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine11Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine12Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine13Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine12Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
	}

	/**
	 * Process operation writeHtmlHeader.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeHtmlHeader(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		SequentialFile htmlFile = ctx.getHtmlFileHandler(ctrl.getExecutionContext()); 
		ctx.getHtmlLines().setHtmlL01(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL02(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL03(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL04(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL05(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL06(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL07(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL08(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtrs(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL10(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setL11Acct(ctx.getAccountRecord().getAcctIdReference().getValue(String.class));
		ctx.getHtmlFile().getFdHtmlfileRecReference().setBytes(ctx.getHtmlLines().getHtmlL11Reference().getBytes());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtre(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtrs(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL15(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL16(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL17(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL18(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtre(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtrs(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL2235(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
	}

	/**
	 * Process operation writeHtmlNmadbs.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeHtmlNmadbs(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		SequentialFile htmlFile = ctx.getHtmlFileHandler(ctrl.getExecutionContext()); 
		ctx.getHtmlLines().setL23Name(ctx.getStatementLines().getStName());
		DataUtils.setToBlank(ctx.getHtmlFile().getFdHtmlfileRecReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlFile().getFdHtmlfileRecReference())
			.addDelimitedByLiteral("<p style=\"font-size:16px\">","*")
			.addDelimitedByLiteral(ctx.getHtmlLines().getL23Name(),"  ")
			.addDelimitedBySize("  ")
			.addDelimitedByLiteral("</p>","*")
			.end();
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		DataUtils.setToBlank(ctx.getHtmlLines().getHtmlAddrLnReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlLines().getHtmlAddrLnReference())
			.addDelimitedByLiteral("<p>","*")
			.addDelimitedByLiteral(ctx.getStatementLines().getStAdd1(),"  ")
			.addDelimitedBySize("  ")
			.addDelimitedByLiteral("</p>","*")
			.end();
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlAddrLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		DataUtils.setToBlank(ctx.getHtmlLines().getHtmlAddrLnReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlLines().getHtmlAddrLnReference())
			.addDelimitedByLiteral("<p>","*")
			.addDelimitedByLiteral(ctx.getStatementLines().getStAdd2(),"  ")
			.addDelimitedBySize("  ")
			.addDelimitedByLiteral("</p>","*")
			.end();
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlAddrLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		DataUtils.setToBlank(ctx.getHtmlLines().getHtmlAddrLnReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlLines().getHtmlAddrLnReference())
			.addDelimitedByLiteral("<p>","*")
			.addDelimitedByLiteral(ctx.getStatementLines().getStAdd3(),"  ")
			.addDelimitedBySize("  ")
			.addDelimitedByLiteral("</p>","*")
			.end();
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlAddrLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtre(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtrs(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL3042(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL31(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtre(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtrs(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL2235(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		DataUtils.setToBlank(ctx.getHtmlLines().getHtmlBsicLnReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlLines().getHtmlBsicLnReference())
			.addDelimitedByLiteral("<p>Account ID         : ","*")
			.addDelimitedByLiteral(ctx.getStatementLines().getStAcctId(),"*")
			.addDelimitedByLiteral("</p>","*")
			.end();
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlBsicLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		DataUtils.setToBlank(ctx.getHtmlLines().getHtmlBsicLnReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlLines().getHtmlBsicLnReference())
			.addDelimitedByLiteral("<p>Current Balance    : ","*")
			.addDelimitedByLiteral(ctx.getStatementLines().getStCurrBal(),"*")
			.addDelimitedByLiteral("</p>","*")
			.end();
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlBsicLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		DataUtils.setToBlank(ctx.getHtmlLines().getHtmlBsicLnReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlLines().getHtmlBsicLnReference())
			.addDelimitedByLiteral("<p>FICO Score         : ","*")
			.addDelimitedByLiteral(ctx.getStatementLines().getStFicoScore(),"*")
			.addDelimitedByLiteral("</p>","*")
			.end();
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlBsicLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtre(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtrs(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL3042(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL43(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtre(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtrs(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL47(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL48(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL50(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL51(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL53(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL54(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtre(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
	}

	/**
	 * Process operation writeTrans.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void writeTrans(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		SequentialFile htmlFile = ctx.getHtmlFileHandler(ctrl.getExecutionContext()); 
		SequentialFile stmtFile = ctx.getStmtFileHandler(ctrl.getExecutionContext()); 
		ctx.getStatementLines().getStTranidReference().setValue(ctx.getTrnxRecord().getTrnxIdReference());
		ctx.getStatementLines().setStTrandt(ctx.getTrnxRecord().getTrnxDesc());
		ctx.getStatementLines().getStTranamtReference().setValue(ctx.getTrnxRecord().getTrnxAmt());
		ctx.getStmtFile().getFdStmtfileRecReference().setBytes(ctx.getStatementLines().getStLine14Reference().getBytes());
		stmtFile.write(ctx.getStmtFile().getFdStmtfileRecReference());
		ctx.getHtmlLines().setHtmlLtrs(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL58(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		DataUtils.setToBlank(ctx.getHtmlLines().getHtmlTranLnReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlLines().getHtmlTranLnReference())
			.addDelimitedByLiteral("<p>","*")
			.addDelimitedByLiteral(ctx.getStatementLines().getStTranid(),"*")
			.addDelimitedByLiteral("</p>","*")
			.end();
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlTranLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL61(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		DataUtils.setToBlank(ctx.getHtmlLines().getHtmlTranLnReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlLines().getHtmlTranLnReference())
			.addDelimitedByLiteral("<p>","*")
			.addDelimitedByLiteral(ctx.getStatementLines().getStTrandt(),"*")
			.addDelimitedByLiteral("</p>","*")
			.end();
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlTranLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlL64(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		DataUtils.setToBlank(ctx.getHtmlLines().getHtmlTranLnReference());
		StringConcatenationBuilder.newInstance(ctx.getHtmlLines().getHtmlTranLnReference())
			.addDelimitedByLiteral("<p>","*")
			.addDelimitedByLiteral(ctx.getStatementLines().getStTranamt(),"*")
			.addDelimitedByLiteral("</p>","*")
			.end();
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlTranLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtde(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
		ctx.getHtmlLines().setHtmlLtre(true);
		ctx.getHtmlFile().getFdHtmlfileRecReference().setValue(ctx.getHtmlLines().getHtmlFixedLnReference());
		htmlFile.write(ctx.getHtmlFile().getFdHtmlfileRecReference());
	}

	/**
	 * Process operation trnxfileOpen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void trnxfileOpen(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("TRNXFILE");
		ctx.getWsM03bArea().setM03bOpen(true);
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0 || DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "04") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING TRNXFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
		ctx.getWsM03bArea().setM03bRead(true);
		DataUtils.setToBlank(ctx.getWsM03bArea().getWsM03bFldtReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0 || DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "04") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING TRNXFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
		ctx.getTrnxRecord().setBytes(ctx.getWsM03bArea().getWsM03bFldtReference().getBytes());
		ctx.getMiscVariables().getWsSaveCardReference().setValue(ctx.getTrnxRecord().getTrnxCardNumReference());
		ctx.getCompVariables().setCrCnt(1);
		ctx.getCompVariables().setTrCnt(0);
		ctx.getMiscVariables().setWsFlDd("READTRNX");
	}

	/**
	 * Process operation xreffileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void xreffileOpen(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("XREFFILE");
		ctx.getWsM03bArea().setM03bOpen(true);
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0 || DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "04") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING XREFFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
		ctx.getMiscVariables().setWsFlDd("CUSTFILE");
	}

	/**
	 * Process operation custfileOpen.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void custfileOpen(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("CUSTFILE");
		ctx.getWsM03bArea().setM03bOpen(true);
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0 || DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "04") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING CUSTFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
		ctx.getMiscVariables().setWsFlDd("ACCTFILE");
	}

	/**
	 * Process operation acctfileOpen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void acctfileOpen(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		SequentialFile htmlFile = ctx.getHtmlFileHandler(ctrl.getExecutionContext()); 
		SequentialFile stmtFile = ctx.getStmtFileHandler(ctrl.getExecutionContext()); 
		acctfileOpen1(ctx, ctrl);
		while (DataUtils.compare(ctx.getMiscVariables().getEndOfFileReference(), "Y") != 0) {
			if (DataUtils.compare(ctx.getMiscVariables().getEndOfFileReference(), "N") == 0) {
				xreffileGetNext(ctx, ctrl);
				if (DataUtils.compare(ctx.getMiscVariables().getEndOfFileReference(), "N") == 0) {
					custfileGet(ctx, ctrl);
					acctfileGet(ctx, ctrl);
					createStatement(ctx, ctrl);
					ctx.getCompVariables().setCrJmp(1);
					DataUtils.setToZeroes(ctx.getComp3Variables().getWsTotalAmtReference());
					trnxfileGet(ctx, ctrl);
				} 
			} 
		}
		trnxfileClose(ctx, ctrl);
		xreffileClose(ctx, ctrl);
		custfileClose(ctx, ctrl);
		acctfileClose(ctx, ctrl);
		stmtFile.close();
		htmlFile.close();
	}

	/**
	 * Process operation acctfileOpen1.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void acctfileOpen1(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("ACCTFILE");
		ctx.getWsM03bArea().setM03bOpen(true);
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0 || DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "04") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR OPENING ACCTFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation readtrnxRead.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readtrnxRead(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		while (true) {
			if (DataUtils.compare(ctx.getMiscVariables().getWsSaveCardReference(), ctx.getTrnxRecord().getTrnxCardNumReference()) == 0) {
				ctx.getCompVariables().setTrCnt(ctx.getCompVariables().getTrCnt() + 1);
			} else {
				ctx.getWsTrnTblCntr().setItemFromWsTrct(ctx.getCompVariables().getTrCnt(),ctx.getCompVariables().getCrCnt() - 1);
				ctx.getCompVariables().setCrCnt(ctx.getCompVariables().getCrCnt() + 1);
				ctx.getCompVariables().setTrCnt(1);
			}
			ctx.getWsTrnxTable().getItemFromWsCardNumReference(ctx.getCompVariables().getCrCnt() - 1).setValue(ctx.getTrnxRecord().getTrnxCardNumReference());
			ctx.getWsTrnxTable().getItemFromWsTranNumReference(ctx.getCompVariables().getCrCnt() - 1,ctx.getCompVariables().getTrCnt() - 1).setValue(ctx.getTrnxRecord().getTrnxIdReference());
			ctx.getWsTrnxTable().getItemFromWsTranRestReference(ctx.getCompVariables().getCrCnt() - 1,ctx.getCompVariables().getTrCnt() - 1).setBytes(ctx.getTrnxRecord().getTrnxRestReference().getBytes());
			ctx.getMiscVariables().getWsSaveCardReference().setValue(ctx.getTrnxRecord().getTrnxCardNumReference());
			ctx.getWsM03bArea().setWsM03bDd("TRNXFILE");
			ctx.getWsM03bArea().setM03bRead(true);
			DataUtils.setToBlank(ctx.getWsM03bArea().getWsM03bFldtReference());
			ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
				.byReference(ctx.getWsM03bArea())
				.getArguments(), ctx);
			if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0) {
				ctx.getTrnxRecord().setBytes(ctx.getWsM03bArea().getWsM03bFldtReference().getBytes());
				continue;
			} else if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "10") == 0) {
				exit(ctx, ctrl);
				return;
			} else {
				if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR READING TRNXFILE");
				if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
				abendProgram(ctx, ctrl);
			}
		}
	}

	/**
	 * Process operation exit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void exit(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsTrnTblCntr().setItemFromWsTrct(ctx.getCompVariables().getTrCnt(),ctx.getCompVariables().getCrCnt() - 1);
		ctx.getMiscVariables().setWsFlDd("XREFFILE");
	}

	/**
	 * Process operation trnxfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void trnxfileClose(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("TRNXFILE");
		ctx.getWsM03bArea().setM03bClose(true);
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0 || DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "04") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING TRNXFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation xreffileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void xreffileClose(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("XREFFILE");
		ctx.getWsM03bArea().setM03bClose(true);
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0 || DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "04") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING XREFFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation custfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void custfileClose(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("CUSTFILE");
		ctx.getWsM03bArea().setM03bClose(true);
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0 || DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "04") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING CUSTFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation acctfileClose.
	 * 
	 * ---------------------------------------------------------------*
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void acctfileClose(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		ctx.getWsM03bArea().setWsM03bDd("ACCTFILE");
		ctx.getWsM03bArea().setM03bClose(true);
		DataUtils.setToZeroes(ctx.getWsM03bArea().getWsM03bRcReference());
		ctrl.callSubProgram("CBSTM03B", CallBuilder.newInstance()
			.byReference(ctx.getWsM03bArea())
			.getArguments(), ctx);
		if (DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "00") == 0 || DataUtils.compare(ctx.getWsM03bArea().getWsM03bRcReference(), "04") == 0) {
			
			/* 
			Do nothing */
		} else {
			if (LOGGER.isInfoEnabled()) LOGGER.info("ERROR CLOSING ACCTFILE");
			if (LOGGER.isInfoEnabled()) LOGGER.info("{}{}" , "RETURN CODE: " , ctx.getWsM03bArea().getWsM03bRc());
			abendProgram(ctx, ctrl);
		}
	}

	/**
	 * Process operation abendProgram.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void abendProgram(final Cbstm03aContext ctx, final ExecutionController ctrl) {
		if (LOGGER.isInfoEnabled()) LOGGER.info("ABENDING PROGRAM");
		abendInstance.triggerAbend();
	}

}
