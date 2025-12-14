
package aws.bluage.l3.workshop.cocrdslc.service.impl;

import aws.bluage.l3.workshop.cocrdslc.business.context.CocrdslcContext;
import aws.bluage.l3.workshop.cocrdslc.service.CocrdslcProcess;
import aws.bluage.l3.workshop.cocrdslc.statemachine.CocrdslcProcedureDivisionStateMachineController;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * Class CocrdslcProcessImpl
 * 
 * Defines application services for CocrdslcProcess
 * @see CocrdslcProcess
 */
@Service("aws.bluage.l3.workshop.cocrdslc.service.CocrdslcProcess")
@Import({
aws.bluage.l3.workshop.cocrdslc.statemachine.CocrdslcProcedureDivisionStateMachineController.class 
}) 	
public class CocrdslcProcessImpl implements CocrdslcProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CocrdslcProcessImpl.class);

	@Autowired
	private CocrdslcProcedureDivisionStateMachineController cocrdslcProcedureDivisionStateMachineRunner;


	/**
	 * Process operation cocrdslc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void cocrdslc(final CocrdslcContext ctx, final ExecutionController ctrl) {
		cocrdslcProcedureDivisionStateMachineRunner.run(ctx,ctrl);
	}

	/**
	 * Process operation commonReturn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void commonReturn(final CocrdslcContext ctx, final ExecutionController ctrl) {
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
	public void sendMap(final CocrdslcContext ctx, final ExecutionController ctrl) {
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
	public void screenInit(final CocrdslcContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().getCcrdslaoReference().setBytes(Record.LOW_VALUES);
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
	public void setupScreenVars(final CocrdslcContext ctx, final ExecutionController ctrl) {
		/* 
		INITIALIZE SEARCH CRITERIA */
		if (ctx.getDfheiblk().getEibcalen() == 0) {
			ctx.getWsMiscStorage().setWsPromptForInput(true);
		} else {
			if (NumberUtils.eq(ctx.getCarddemoCommarea().getCdemoAcctIdReference(), 0)) {
				ctx.getGroup1().getAcctsidoReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getGroup1().getAcctsidoReference().setValue(ctx.getCcWorkAreas().getCcAcctIdReference());
			}
			if (NumberUtils.eq(ctx.getCarddemoCommarea().getCdemoCardNumReference(), 0)) {
				ctx.getGroup1().getCardsidoReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getGroup1().getCardsidoReference().setValue(ctx.getCcWorkAreas().getCcCardNumReference());
			}
			if (ctx.getWsMiscStorage().isFoundCardsForAccount()) {
				ctx.getGroup1().getCrdnameoReference().setValue(ctx.getCardRecord().getCardEmbossedNameReference());
				ctx.getWsMiscStorage().getCardExpiraionDateXReference().setValue(ctx.getCardRecord().getCardExpiraionDateReference());
				ctx.getGroup1().getExpmonoReference().setValue(ctx.getWsMiscStorage().getCardExpiryMonthReference());
				ctx.getGroup1().getExpyearoReference().setValue(ctx.getWsMiscStorage().getCardExpiryYearReference());
				ctx.getGroup1().getCrdstcdoReference().setValue(ctx.getCardRecord().getCardActiveStatusReference());
			} 
		}
		
		/* 
		SETUP MESSAGE */
		if (ctx.getWsMiscStorage().isWsNoInfoMessage()) {
			ctx.getWsMiscStorage().setWsPromptForInput(true);
		} 
		ctx.getGroup1().setErrmsgo(ctx.getWsMiscStorage().getWsReturnMsg());
		ctx.getGroup1().getInfomsgoReference().setValue(ctx.getWsMiscStorage().getWsInfoMsgReference());
	}

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupScreenAttrs(final CocrdslcContext ctx, final ExecutionController ctrl) {
		/* 
		PROTECT OR UNPROTECT BASED ON CONTEXT */
		if (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoLastMapsetReference(), ctx.getWsLiterals().getLitCclistmapsetReference()) == 0 && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsLiterals().getLitCclistpgmReference()) == 0) {
			ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getCardsidaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		} else {
			ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			ctx.getGroup1().getCardsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		}
		
		/* 
		POSITION CURSOR */
		if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk() || ctx.getWsMiscStorage().isFlgAcctfilterBlank()) {
			ctx.getGroup1().setAcctsidl(-1);
		} else if (ctx.getWsMiscStorage().isFlgCardfilterNotOk() || ctx.getWsMiscStorage().isFlgCardfilterBlank()) {
			ctx.getGroup1().setCardsidl(-1);
		} else {
			ctx.getGroup1().setAcctsidl(-1);
		}
		
		/* 
		SETUP COLOR */
		if (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoLastMapsetReference(), ctx.getWsLiterals().getLitCclistmapsetReference()) == 0 && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsLiterals().getLitCclistpgmReference()) == 0) {
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhdfcolReference());
			ctx.getGroup1().getCardsidcReference().setValue(ctx.getDfhbmsca().getDfhdfcolReference());
		} 
		if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk()) {
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardfilterNotOk()) {
			ctx.getGroup1().getCardsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgAcctfilterBlank() && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
			ctx.getGroup1().setAcctsido("*");
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardfilterBlank() && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
			ctx.getGroup1().setCardsido("*");
			ctx.getGroup1().getCardsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
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
	public void sendScreen(final CocrdslcContext ctx, final ExecutionController ctrl) {
		ctx.getCcWorkAreas().setCcardNextMapset(ctx.getWsLiterals().getLitThismapset());
		ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsLiterals().getLitThismapReference());
		ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getCcWorkAreas().getCcardNextMap())
		.withMapset(ctx.getCcWorkAreas().getCcardNextMapset())
		.withData(ctx.getGroup1().getCcrdslaoReference())
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
	public void processInputs(final CocrdslcContext ctx, final ExecutionController ctrl) {
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
	public void receiveMap(final CocrdslcContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getWsLiterals().getLitThismap())
		.withMapset(ctx.getWsLiterals().getLitThismapset())
		.into(ctx.getGroup1().getCcrdslaiReference())
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
	public void editMapInputs(final CocrdslcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setInputOk(true);
		ctx.getWsMiscStorage().setFlgCardfilterIsvalid(true);
		ctx.getWsMiscStorage().setFlgAcctfilterIsvalid(true);
		
		/* 
		REPLACE * WITH LOW-VALUES */
		if (DataUtils.compare(ctx.getGroup1().getAcctsidiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcctsidiReference())) {
			ctx.getCcWorkAreas().getCcAcctIdReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getCcWorkAreas().getCcAcctIdReference().setValue(ctx.getGroup1().getAcctsidiReference());
		}
		if (DataUtils.compare(ctx.getGroup1().getCardsidiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getCardsidiReference())) {
			ctx.getCcWorkAreas().getCcCardNumReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getCcWorkAreas().getCcCardNumReference().setValue(ctx.getGroup1().getCardsidiReference());
		}
		
		/* 
		INDIVIDUAL FIELD EDITS */
		editAccount(ctx, ctrl);
		editCard(ctx, ctrl);
		
		/* 
		CROSS FIELD EDITS */
		if (ctx.getWsMiscStorage().isFlgAcctfilterBlank() && ctx.getWsMiscStorage().isFlgCardfilterBlank()) {
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
	public void editAccount(final CocrdslcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getCcWorkAreas().getCcAcctIdReference()) || DataUtils.isBlank(ctx.getCcWorkAreas().getCcAcctIdReference()) || NumberUtils.eq(ctx.getCcWorkAreas().getCcAcctIdNReference(), 0)) {
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
			if (!(DataUtils.isNumeric(ctx.getCcWorkAreas().getCcAcctIdReference()))) {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					ctx.getWsMiscStorage().setWsReturnMsg("ACCOUNT FILTER,IF SUPPLIED MUST BE A 11 DIGIT NUMBER");
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
	 * Process operation editCard.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editCard(final CocrdslcContext ctx, final ExecutionController ctrl) {
		/* 
		Not numeric
		Not 16 characters */
		ctx.getWsMiscStorage().setFlgCardfilterNotOk(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getCcWorkAreas().getCcCardNumReference()) || DataUtils.isBlank(ctx.getCcWorkAreas().getCcCardNumReference()) || NumberUtils.eq(ctx.getCcWorkAreas().getCcCardNumNReference(), 0)) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgCardfilterBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setWsPromptForCard(true);
			} 
			DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoCardNumReference());
			return;
		} else {
			
			/* 
			Not numeric
			Not 16 characters */
			if (!(DataUtils.isNumeric(ctx.getCcWorkAreas().getCcCardNumReference()))) {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgCardfilterNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					ctx.getWsMiscStorage().setWsReturnMsg("CARD ID FILTER,IF SUPPLIED MUST BE A 16 DIGIT NUMBER");
				} 
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoCardNumReference());
				return;
			} else {
				ctx.getCarddemoCommarea().setCdemoCardNum(ctx.getCcWorkAreas().getCcCardNumN());
				ctx.getWsMiscStorage().setFlgCardfilterIsvalid(true);
				return;
			}
		}
	}

	/**
	 * Process operation getcardByacctcard.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getcardByacctcard(final CocrdslcContext ctx, final ExecutionController ctrl) {
		/* 
		Read the Card file
		MOVE CC-ACCT-ID-N      TO WS-CARD-RID-ACCT-ID */
		ctx.getWsMiscStorage().getWsCardRidCardnumReference().setValue(ctx.getCcWorkAreas().getCcCardNumReference());
		JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitCardfilenameReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.into(ctx.getCardRecord())
		.length(150)
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCardnumReference())
		.keyLength(16,false)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			ctx.getWsMiscStorage().setFoundCardsForAccount(true);
		} else if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
			ctx.getWsMiscStorage().setFlgCardfilterNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setDidNotFindAcctcardCombo(true);
			} 
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
			} 
			ctx.getWsMiscStorage().setErrorOpname("READ");
			ctx.getWsMiscStorage().setErrorFile(ctx.getWsLiterals().getLitCardfilename());
			ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
			ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
			ctx.getWsMiscStorage().getWsReturnMsgReference().setBytes(ctx.getWsMiscStorage().getWsFileErrorMessageReference().getBytes());
		}
	}

	/**
	 * Process operation getcardByacct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getcardByacct(final CocrdslcContext ctx, final ExecutionController ctrl) {
		/* 
		Read the Card file. Access via alternate index ACCTID */
		JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitCardfilenameAcctPathReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.into(ctx.getCardRecord())
		.length(150)
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidAcctIdReference())
		.keyLength(11,false)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			ctx.getWsMiscStorage().setFoundCardsForAccount(true);
		} else if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NOTFND.getIntValue()) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
			ctx.getWsMiscStorage().setDidNotFindAcctInCardxref(true);
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAcctfilterNotOk(true);
			ctx.getWsMiscStorage().setErrorOpname("READ");
			ctx.getWsMiscStorage().setErrorFile(ctx.getWsLiterals().getLitCardfilenameAcctPath());
			ctx.getWsMiscStorage().setErrorResp(ctx.getWsMiscStorage().getWsRespCdReference().getValue(String.class));
			ctx.getWsMiscStorage().setErrorResp2(ctx.getWsMiscStorage().getWsReasCdReference().getValue(String.class));
			ctx.getWsMiscStorage().getWsReturnMsgReference().setBytes(ctx.getWsMiscStorage().getWsFileErrorMessageReference().getBytes());
		}
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
	public void sendLongText(final CocrdslcContext ctx, final ExecutionController ctrl) {
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
	public void sendPlainText(final CocrdslcContext ctx, final ExecutionController ctrl) {
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
	public void yyyyStorePfkey(final CocrdslcContext ctx, final ExecutionController ctrl) {
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
