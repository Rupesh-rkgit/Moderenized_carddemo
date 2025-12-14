
package aws.bluage.l3.workshop.coactvwc.service.impl;

import aws.bluage.l3.workshop.coactvwc.business.context.CoactvwcContext;
import aws.bluage.l3.workshop.coactvwc.service.CoactvwcProcess;
import aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineController;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.ResponseCode;
import com.netfective.bluage.gapwalk.rt.jics.bms.ReceiveMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendTextBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.ReturnBuilder;
import com.netfective.bluage.gapwalk.rt.jics.io.internal.JicsFileBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * Class CoactvwcProcessImpl
 * 
 * Defines application services for CoactvwcProcess
 * @see CoactvwcProcess
 */
@Service("aws.bluage.l3.workshop.coactvwc.service.CoactvwcProcess")
@Import({
aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineController.class 
}) 	
public class CoactvwcProcessImpl implements CoactvwcProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CoactvwcProcessImpl.class);

	@Autowired
	private CoactvwcProcedureDivisionStateMachineController coactvwcProcedureDivisionStateMachineRunner;


	/**
	 * Process operation coactvwc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void coactvwc(final CoactvwcContext ctx, final ExecutionController ctrl) {
		coactvwcProcedureDivisionStateMachineRunner.run(ctx,ctrl);
	}

	/**
	 * Process operation commonReturn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void commonReturn(final CoactvwcContext ctx, final ExecutionController ctrl) {
		ctx.getCcWorkAreas().getCcardErrorMsgReference().setValue(ctx.getWsMiscStorage().getWsReturnMsgReference());
		ctx.getWsCommarea().getWsCommareaReference().setBytes(ctx.getCarddemoCommarea().getBytes());
		int idx = ctx.getCarddemoCommarea().getSize() + 1 - 1;
		int len = ctx.getWsThisProgcommarea().getSize();
		ctx.getWsCommarea().getWsCommareaReference().setBytes(ctx.getWsThisProgcommarea().getBytes(), idx, len);
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withTransID(ctx.getWsLiterals().getLitThistranid())
		.withCommarea(ctx.getWsCommarea().getWsCommareaReference())
		.withLength(2000)
		.execute()
		.handleException();
	}

	/**
	 * Process operation sendMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendMap(final CoactvwcContext ctx, final ExecutionController ctrl) {
		screenInit(ctx, ctrl);
		setupScreenVars(ctx, ctrl);
		setupScreenAttrs(ctx, ctrl);
		sendScreen(ctx, ctrl);
	}

	/**
	 * Process operation screenInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void screenInit(final CoactvwcContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().getCactvwaoReference().setBytes(Record.LOW_VALUES);
		ctx.getWsDateTime().getWsCurdateDataReference().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
		ctx.getGroup1().getTitle01oReference().setValue(ctx.getCcdaScreenTitle().getCcdaTitle01Reference());
		ctx.getGroup1().getTitle02oReference().setValue(ctx.getCcdaScreenTitle().getCcdaTitle02Reference());
		ctx.getGroup1().getTrnnameoReference().setValue(ctx.getWsLiterals().getLitThistranidReference());
		ctx.getGroup1().getPgmnameoReference().setValue(ctx.getWsLiterals().getLitThispgmReference());
		ctx.getWsDateTime().getWsCurdateDataReference().setBytes(DataUtils.getBytes(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ")));
		ctx.getWsDateTime().setWsCurdateMm(ctx.getWsDateTime().getWsCurdateMonth());
		ctx.getWsDateTime().setWsCurdateDd(ctx.getWsDateTime().getWsCurdateDay());
		ctx.getWsDateTime().setWsCurdateYy(NumberUtils.convert(ctx.getWsDateTime().getWsCurdateYearReference().getBytes(2, 2)).intValue());
		ctx.getGroup1().getCurdateoReference().setBytes(ctx.getWsDateTime().getWsCurdateMmDdYyReference().getBytes());
		ctx.getWsDateTime().setWsCurtimeHh(ctx.getWsDateTime().getWsCurtimeHours());
		ctx.getWsDateTime().setWsCurtimeMm(ctx.getWsDateTime().getWsCurtimeMinute());
		ctx.getWsDateTime().setWsCurtimeSs(ctx.getWsDateTime().getWsCurtimeSecond());
		ctx.getGroup1().getCurtimeoReference().setBytes(ctx.getWsDateTime().getWsCurtimeHhMmSsReference().getBytes());
	}

	/**
	 * Process operation setupScreenVars.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupScreenVars(final CoactvwcContext ctx, final ExecutionController ctrl) {
		/* 
		INITIALIZE SEARCH CRITERIA */
		if (ctx.getDfheiblk().getEibcalen() == 0) {
			ctx.getWsMiscStorage().setWsPromptForInput(true);
		} else {
			if (ctx.getWsMiscStorage().isFlgAcctfilterBlank()) {
				ctx.getGroup1().getAcctsidoReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getGroup1().getAcctsidoReference().setValue(ctx.getCcWorkAreas().getCcAcctIdReference());
			}
			if (ctx.getWsMiscStorage().isFoundAcctInMaster() || ctx.getWsMiscStorage().isFoundCustInMaster()) {
				ctx.getGroup1().getAcsttusoReference().setValue(ctx.getAccountRecord().getAcctActiveStatusReference());
				ctx.getGroup1().getAcurbaloReference().setValue(ctx.getAccountRecord().getAcctCurrBal());
				ctx.getGroup1().getAcrdlimoReference().setValue(ctx.getAccountRecord().getAcctCreditLimit());
				ctx.getGroup1().getAcshlimoReference().setValue(ctx.getAccountRecord().getAcctCashCreditLimit());
				ctx.getGroup1().getAcrcycroReference().setValue(ctx.getAccountRecord().getAcctCurrCycCredit());
				ctx.getGroup1().getAcrcydboReference().setValue(ctx.getAccountRecord().getAcctCurrCycDebit());
				ctx.getGroup1().getAdtopenoReference().setValue(ctx.getAccountRecord().getAcctOpenDateReference());
				ctx.getGroup1().getAexpdtoReference().setValue(ctx.getAccountRecord().getAcctExpiraionDateReference());
				ctx.getGroup1().getAreisdtoReference().setValue(ctx.getAccountRecord().getAcctReissueDateReference());
				ctx.getGroup1().getAaddgrpoReference().setValue(ctx.getAccountRecord().getAcctGroupIdReference());
			} 
			if (ctx.getWsMiscStorage().isFoundCustInMaster()) {
				ctx.getGroup1().setAcstnumo(ctx.getCustomerRecord().getCustIdReference().getValue(String.class));
				
				/* 
				MOVE CUST-SSN             TO ACSTSSNO OF CACTVWAO */
				StringConcatenationBuilder.newInstance(ctx.getGroup1().getAcstssnoReference())
					.addDelimitedBySize(ctx.getCustomerRecord().getCustSsnReference().getBytes(0, 3))
					.addDelimitedBySize("-")
					.addDelimitedBySize(ctx.getCustomerRecord().getCustSsnReference().getBytes(3, 2))
					.addDelimitedBySize("-")
					.addDelimitedBySize(ctx.getCustomerRecord().getCustSsnReference().getBytes(5, 4))
					.end();
				ctx.getGroup1().setAcstfcoo(ctx.getCustomerRecord().getCustFicoCreditScoreReference().getValue(String.class));
				ctx.getGroup1().getAcstdoboReference().setValue(ctx.getCustomerRecord().getCustDobYyyyMmDdReference());
				ctx.getGroup1().getAcsfnamoReference().setValue(ctx.getCustomerRecord().getCustFirstNameReference());
				ctx.getGroup1().getAcsmnamoReference().setValue(ctx.getCustomerRecord().getCustMiddleNameReference());
				ctx.getGroup1().getAcslnamoReference().setValue(ctx.getCustomerRecord().getCustLastNameReference());
				ctx.getGroup1().getAcsadl1oReference().setValue(ctx.getCustomerRecord().getCustAddrLine1Reference());
				ctx.getGroup1().getAcsadl2oReference().setValue(ctx.getCustomerRecord().getCustAddrLine2Reference());
				ctx.getGroup1().getAcscityoReference().setValue(ctx.getCustomerRecord().getCustAddrLine3Reference());
				ctx.getGroup1().getAcsstteoReference().setValue(ctx.getCustomerRecord().getCustAddrStateCdReference());
				ctx.getGroup1().setAcszipco(ctx.getCustomerRecord().getCustAddrZip());
				ctx.getGroup1().getAcsctryoReference().setValue(ctx.getCustomerRecord().getCustAddrCountryCdReference());
				ctx.getGroup1().setAcsphn1o(ctx.getCustomerRecord().getCustPhoneNum1());
				ctx.getGroup1().setAcsphn2o(ctx.getCustomerRecord().getCustPhoneNum2());
				ctx.getGroup1().getAcsgovtoReference().setValue(ctx.getCustomerRecord().getCustGovtIssuedIdReference());
				ctx.getGroup1().getAcseftcoReference().setValue(ctx.getCustomerRecord().getCustEftAccountIdReference());
				ctx.getGroup1().getAcspflgoReference().setValue(ctx.getCustomerRecord().getCustPriCardHolderIndReference());
			} 
		}
		
		/* 
		SETUP MESSAGE */
		if (ctx.getWsMiscStorage().isWsNoInfoMessage()) {
			ctx.getWsMiscStorage().setWsPromptForInput(true);
		} 
		ctx.getGroup1().setErrmsgo(ctx.getWsMiscStorage().getWsReturnMsg());
		ctx.getGroup1().setInfomsgo(ctx.getWsMiscStorage().getWsInfoMsg());
	}

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupScreenAttrs(final CoactvwcContext ctx, final ExecutionController ctrl) {
		/* 
		PROTECT OR UNPROTECT BASED ON CONTEXT */
		ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		
		/* 
		POSITION CURSOR */
		if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk() || ctx.getWsMiscStorage().isFlgAcctfilterBlank()) {
			ctx.getGroup1().setAcctsidl(-1);
		} else {
			ctx.getGroup1().setAcctsidl(-1);
		}
		
		/* 
		SETUP COLOR */
		ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhdfcolReference());
		if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk()) {
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgAcctfilterBlank() && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
			ctx.getGroup1().setAcctsido("*");
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isWsNoInfoMessage()) {
			ctx.getGroup1().getInfomsgcReference().setValue(ctx.getDfhbmsca().getDfhbmdarReference());
		} else {
			ctx.getGroup1().getInfomsgcReference().setValue(ctx.getDfhbmsca().getDfhneutrReference());
		}
	}

	/**
	 * Process operation sendScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendScreen(final CoactvwcContext ctx, final ExecutionController ctrl) {
		ctx.getCcWorkAreas().setCcardNextMapset(ctx.getWsLiterals().getLitThismapset());
		ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsLiterals().getLitThismapReference());
		ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getCcWorkAreas().getCcardNextMap())
		.withMapset(ctx.getCcWorkAreas().getCcardNextMapset())
		.withData(ctx.getGroup1().getCactvwaoReference())
		.withCursor()
		.withErase()
		.withFreeKB()
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
	}

	/**
	 * Process operation processInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void processInputs(final CoactvwcContext ctx, final ExecutionController ctrl) {
		receiveMap(ctx, ctrl);
		editMapInputs(ctx, ctrl);
		ctx.getCcWorkAreas().getCcardErrorMsgReference().setValue(ctx.getWsMiscStorage().getWsReturnMsgReference());
		ctx.getCcWorkAreas().getCcardNextProgReference().setValue(ctx.getWsLiterals().getLitThispgmReference());
		ctx.getCcWorkAreas().setCcardNextMapset(ctx.getWsLiterals().getLitThismapset());
		ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsLiterals().getLitThismapReference());
	}

	/**
	 * Process operation receiveMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void receiveMap(final CoactvwcContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getWsLiterals().getLitThismap())
		.withMapset(ctx.getWsLiterals().getLitThismapset())
		.into(ctx.getGroup1().getCactvwaiReference())
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
	}

	/**
	 * Process operation editMapInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editMapInputs(final CoactvwcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setInputOk(true);
		ctx.getWsMiscStorage().setFlgAcctfilterIsvalid(true);
		
		/* 
		REPLACE * WITH LOW-VALUES */
		if (DataUtils.compareAlphInt("*", ctx.getGroup1().getAcctsidiReference().getValue(String.class)) == 0 || DataUtils.isBlank(ctx.getGroup1().getAcctsidiReference())) {
			ctx.getCcWorkAreas().getCcAcctIdReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getCcWorkAreas().setCcAcctId(ctx.getGroup1().getAcctsidiReference().getValue(String.class));
		}
		
		/* 
		INDIVIDUAL FIELD EDITS */
		editAccount(ctx, ctrl);
		
		/* 
		CROSS FIELD EDITS */
		if (ctx.getWsMiscStorage().isFlgAcctfilterBlank()) {
			ctx.getWsMiscStorage().setNoSearchCriteriaReceived(true);
		}
	}

	/**
	 * Process operation editAccount.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAccount(final CoactvwcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getCcWorkAreas().getCcAcctIdReference()) || DataUtils.isBlank(ctx.getCcWorkAreas().getCcAcctIdReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAcctfilterBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setWsPromptForAcct(true);
			} 
			DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoAcctIdReference());
			return;
		} else {
			
			/* 
			Not numeric
			Not 11 characters */
			if (!(DataUtils.isNumeric(ctx.getCcWorkAreas().getCcAcctIdReference())) || DataUtils.isZero(ctx.getCcWorkAreas().getCcAcctIdReference())) {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					ctx.getWsMiscStorage().setWsReturnMsg("Account Filter must  be a non-zero 11 digit number");
				} 
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoAcctIdReference());
				return;
			} else {
				ctx.getCarddemoCommarea().setCdemoAcctId(NumberUtils.convert(ctx.getCcWorkAreas().getCcAcctId()).longValue());
				ctx.getWsMiscStorage().setFlgAcctfilterIsvalid(true);
				return;
			}
		}
	}

	/**
	 * Process operation readAcct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readAcct(final CoactvwcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setWsNoInfoMessage(true);
		ctx.getWsMiscStorage().setWsCardRidAcctId(ctx.getCarddemoCommarea().getCdemoAcctId());
		getcardxrefByacct(ctx, ctrl);
		
		/* 
		IF DID-NOT-FIND-ACCT-IN-CARDXREF */
		if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk()) {
			return;
		} else {
			getacctdataByacct(ctx, ctrl);
			if (ctx.getWsMiscStorage().isDidNotFindAcctInAcctdat()) {
				return;
			} else {
				ctx.getWsMiscStorage().setWsCardRidCustId(ctx.getCarddemoCommarea().getCdemoCustId());
				getcustdataBycust(ctx, ctrl);
				if (ctx.getWsMiscStorage().isDidNotFindCustInCustdat()) {
					return;
				} else {
					return;
				}
			}
		}
	}

	/**
	 * Process operation getcardxrefByacct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getcardxrefByacct(final CoactvwcContext ctx, final ExecutionController ctrl) {
		/* 
		Read the Card file. Access via alternate index ACCTID */
		JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitCardxrefnameAcctPathReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.into(ctx.getCardXrefRecord())
		.length(50)
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidAcctIdXReference())
		.keyLength(11,false)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			ctx.getCarddemoCommarea().setCdemoCustId(ctx.getCardXrefRecord().getXrefCustId());
			ctx.getCarddemoCommarea().setCdemoCardNum(NumberUtils.convert(ctx.getCardXrefRecord().getXrefCardNum()).longValue());
		} else if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
				ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize("Account:")
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsCardRidAcctIdXReference().getBytes())
					.addDelimitedBySize(" not found in")
					.addDelimitedBySize(" Cross ref file.  Resp:")
					.addDelimitedBySize(ctx.getWsMiscStorage().getErrorRespReference().getBytes())
					.addDelimitedBySize(" Reas:")
					.addDelimitedBySize(ctx.getWsMiscStorage().getErrorResp2Reference().getBytes())
					.end();
			} 
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
			ctx.getWsMiscStorage().setErrorOpname("READ");
			ctx.getWsMiscStorage().setErrorFile(ctx.getWsLiterals().getLitCardxrefnameAcctPath());
			ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
			ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
			ctx.getWsMiscStorage().getWsReturnMsgReference().setBytes(ctx.getWsMiscStorage().getWsFileErrorMessageReference().getBytes());
			
			/* 
			WS-LONG-MSG
			PERFORM SEND-LONG-TEXT */
		}
	}

	/**
	 * Process operation getacctdataByacct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getacctdataByacct(final CoactvwcContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitAcctfilenameReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.into(ctx.getAccountRecord())
		.length(300)
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidAcctIdXReference())
		.keyLength(11,false)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			ctx.getWsMiscStorage().setFoundAcctInMaster(true);
		} else if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
			
			/* 
			SET DID-NOT-FIND-ACCT-IN-ACCTDAT TO TRUE */
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
				ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize("Account:")
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsCardRidAcctIdXReference().getBytes())
					.addDelimitedBySize(" not found in")
					.addDelimitedBySize(" Acct Master file.Resp:")
					.addDelimitedBySize(ctx.getWsMiscStorage().getErrorRespReference().getBytes())
					.addDelimitedBySize(" Reas:")
					.addDelimitedBySize(ctx.getWsMiscStorage().getErrorResp2Reference().getBytes())
					.end();
			} 
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
			ctx.getWsMiscStorage().setErrorOpname("READ");
			ctx.getWsMiscStorage().setErrorFile(ctx.getWsLiterals().getLitAcctfilename());
			ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
			ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
			ctx.getWsMiscStorage().getWsReturnMsgReference().setBytes(ctx.getWsMiscStorage().getWsFileErrorMessageReference().getBytes());
			
			/* 
			WS-LONG-MSG
			PERFORM SEND-LONG-TEXT */
		}
	}

	/**
	 * Process operation getcustdataBycust.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getcustdataBycust(final CoactvwcContext ctx, final ExecutionController ctrl) {
		JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitCustfilenameReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.into(ctx.getCustomerRecord())
		.length(500)
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCustIdXReference())
		.keyLength(9,false)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			ctx.getWsMiscStorage().setFoundCustInMaster(true);
		} else if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgCustfilterNotOk(true);
			
			/* 
			SET DID-NOT-FIND-CUST-IN-CUSTDAT TO TRUE */
			ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
			ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize("CustId:")
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsCardRidCustIdXReference().getBytes())
					.addDelimitedBySize(" not found")
					.addDelimitedBySize(" in customer master.Resp: ")
					.addDelimitedBySize(ctx.getWsMiscStorage().getErrorRespReference().getBytes())
					.addDelimitedBySize(" REAS:")
					.addDelimitedBySize(ctx.getWsMiscStorage().getErrorResp2Reference().getBytes())
					.end();
			} 
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgCustfilterNotOk(true);
			ctx.getWsMiscStorage().setErrorOpname("READ");
			ctx.getWsMiscStorage().setErrorFile(ctx.getWsLiterals().getLitCustfilename());
			ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
			ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
			ctx.getWsMiscStorage().getWsReturnMsgReference().setBytes(ctx.getWsMiscStorage().getWsFileErrorMessageReference().getBytes());
			
			/* 
			WS-LONG-MSG
			PERFORM SEND-LONG-TEXT */
		}
	}

	/**
	 * Process operation sendPlainText.
	 * 
	 * ****************************************************************
	 *  Plain text exit - Dont use in production                      *
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendPlainText(final CoactvwcContext ctx, final ExecutionController ctrl) {
		SendTextBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withData(ctx.getWsMiscStorage().getWsReturnMsgReference())
		.withLength(75)
		.withErase()
		.withFreeKB()
		.execute()
		.handleException();
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.execute()
		.handleException();
	}

	/**
	 * Process operation sendLongText.
	 * 
	 * ****************************************************************
	 *  Display Long text and exit                                    *
	 *  This is primarily for debugging and should not be used in     *
	 *  regular course                                                *
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendLongText(final CoactvwcContext ctx, final ExecutionController ctrl) {
		SendTextBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withData(ctx.getWsMiscStorage().getWsLongMsgReference())
		.withLength(500)
		.withErase()
		.withFreeKB()
		.execute()
		.handleException();
		ReturnBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.execute()
		.handleException();
	}

	/**
	 * Process operation yyyyStorePfkey.
	 * 
	 * ****************************************************************
	 * Common code to store PFKey
	 * ****************************************************************
	 * ****************************************************************
	 *  Copyright Amazon.com, Inc. or its affiliates.
	 *  All Rights Reserved.
	 *  Licensed under the Apache License, Version 2.0 (the \"License\").
	 *  You may not use this file except in compliance with the License.
	 *  You may obtain a copy of the License at
	 *     http://www.apache.org/licenses/LICENSE-2.0
	 *  Unless required by applicable law or agreed to in writing,
	 *  software distributed under the License is distributed on an
	 *  \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
	 *  either express or implied. See the License for the specific
	 *  language governing permissions and limitations under the License
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void yyyyStorePfkey(final CoactvwcContext ctx, final ExecutionController ctrl) {
		/* 
		Map AID to PFKey in COMMON Area
		****************************************************************
		**************************************************************** */
		if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhenterReference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidEnter(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhclearReference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidClear(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpa1Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPa1(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpa2Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPa2(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf1Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk01(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf2Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk02(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf3Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk03(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf4Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk04(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf5Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk05(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf6Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk06(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf7Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk07(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf8Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk08(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf9Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk09(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf10Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk10(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf11Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk11(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf12Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk12(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf13Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk01(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf14Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk02(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf15Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk03(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf16Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk04(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf17Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk05(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf18Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk06(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf19Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk07(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf20Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk08(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf21Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk09(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf22Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk10(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf23Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk11(true);
		} else if (DataUtils.compare(ctx.getDfheiblk().getEibaidReference(), ctx.getDfhaid().getDfhpf24Reference()) == 0) {
			ctx.getCcWorkAreas().setCcardAidPfk12(true);
		}
	}

}
