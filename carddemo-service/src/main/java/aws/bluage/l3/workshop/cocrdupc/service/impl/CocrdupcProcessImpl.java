
package aws.bluage.l3.workshop.cocrdupc.service.impl;

import aws.bluage.l3.workshop.cocrdupc.business.context.CocrdupcContext;
import aws.bluage.l3.workshop.cocrdupc.service.CocrdupcProcess;
import aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineController;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.ResponseCode;
import com.netfective.bluage.gapwalk.rt.jics.bms.ReceiveMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendMapBuilder;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendTextBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.AbendBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.HandleAbendBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.ReturnBuilder;
import com.netfective.bluage.gapwalk.rt.jics.io.internal.JicsFileBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.InspectBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * Class CocrdupcProcessImpl
 * 
 * Defines application services for CocrdupcProcess
 * @see CocrdupcProcess
 */
@Service("aws.bluage.l3.workshop.cocrdupc.service.CocrdupcProcess")
@Import({
aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineController.class 
}) 	
public class CocrdupcProcessImpl implements CocrdupcProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CocrdupcProcessImpl.class);

	@Autowired
	private CocrdupcProcedureDivisionStateMachineController cocrdupcProcedureDivisionStateMachineRunner;


	/**
	 * Process operation cocrdupc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void cocrdupc(final CocrdupcContext ctx, final ExecutionController ctrl) {
		cocrdupcProcedureDivisionStateMachineRunner.run(ctx,ctrl);
	}

	/**
	 * Process operation commonReturn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void commonReturn(final CocrdupcContext ctx, final ExecutionController ctrl) {
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
	 * Process operation processInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void processInputs(final CocrdupcContext ctx, final ExecutionController ctrl) {
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
	public void receiveMap(final CocrdupcContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getWsLiterals().getLitThismap())
		.withMapset(ctx.getWsLiterals().getLitThismapset())
		.into(ctx.getGroup1().getCcrdupaiReference())
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		ctx.getWsThisProgcommarea().getCcupNewDetailsReference().getField().initialize();
		
		/* 
		REPLACE * WITH LOW-VALUES */
		if (DataUtils.compare(ctx.getGroup1().getAcctsidiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcctsidiReference())) {
			ctx.getCcWorkAreas().getCcAcctIdReference().setBytes(Record.LOW_VALUES);
			ctx.getWsThisProgcommarea().getCcupNewAcctidReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getCcWorkAreas().getCcAcctIdReference().setValue(ctx.getGroup1().getAcctsidiReference());
			ctx.getWsThisProgcommarea().getCcupNewAcctidReference().setValue(ctx.getGroup1().getAcctsidiReference());
		}
		if (DataUtils.compare(ctx.getGroup1().getCardsidiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getCardsidiReference())) {
			ctx.getCcWorkAreas().getCcCardNumReference().setBytes(Record.LOW_VALUES);
			ctx.getWsThisProgcommarea().getCcupNewCardidReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getCcWorkAreas().getCcCardNumReference().setValue(ctx.getGroup1().getCardsidiReference());
			ctx.getWsThisProgcommarea().getCcupNewCardidReference().setValue(ctx.getGroup1().getCardsidiReference());
		}
		if (DataUtils.compare(ctx.getGroup1().getCrdnameiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getCrdnameiReference())) {
			ctx.getWsThisProgcommarea().getCcupNewCrdnameReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getWsThisProgcommarea().getCcupNewCrdnameReference().setValue(ctx.getGroup1().getCrdnameiReference());
		}
		if (DataUtils.compare(ctx.getGroup1().getCrdstcdiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getCrdstcdiReference())) {
			ctx.getWsThisProgcommarea().getCcupNewCrdstcdReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getWsThisProgcommarea().getCcupNewCrdstcdReference().setValue(ctx.getGroup1().getCrdstcdiReference());
		}
		ctx.getWsThisProgcommarea().getCcupNewExpdayReference().setValue(ctx.getGroup1().getExpdayiReference());
		if (DataUtils.compare(ctx.getGroup1().getExpmoniReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getExpmoniReference())) {
			ctx.getWsThisProgcommarea().getCcupNewExpmonReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getWsThisProgcommarea().getCcupNewExpmonReference().setValue(ctx.getGroup1().getExpmoniReference());
		}
		if (DataUtils.compare(ctx.getGroup1().getExpyeariReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getExpyeariReference())) {
			ctx.getWsThisProgcommarea().getCcupNewExpyearReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getWsThisProgcommarea().getCcupNewExpyearReference().setValue(ctx.getGroup1().getExpyeariReference());
		}
	}

	/**
	 * Process operation editMapInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editMapInputs(final CocrdupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setInputOk(true);
		if (ctx.getWsThisProgcommarea().isCcupDetailsNotFetched()) {
			
			/* 
			VALIDATE THE SEARCH KEYS */
			editAccount(ctx, ctrl);
			editCard(ctx, ctrl);
			ctx.getWsThisProgcommarea().getCcupNewCarddataReference().setBytes(Record.LOW_VALUES);
			
			/* 
			IF THE SEARCH CONDITIONS HAVE PROBLEMS SKIP OTHER EDITS */
			if (ctx.getWsMiscStorage().isFlgAcctfilterBlank() && ctx.getWsMiscStorage().isFlgCardfilterBlank()) {
				ctx.getWsMiscStorage().setNoSearchCriteriaReceived(true);
			} 
			return;
		} else {
			
			/* 
			SEARCH KEYS ALREADY VALIDATED AND DATA FETCHED
			Do nothing */
			ctx.getWsMiscStorage().setFoundCardsForAccount(true);
			ctx.getWsMiscStorage().setFlgAcctfilterIsvalid(true);
			ctx.getWsMiscStorage().setFlgCardfilterIsvalid(true);
			ctx.getCarddemoCommarea().setCdemoAcctId(NumberUtils.convert(ctx.getWsThisProgcommarea().getCcupOldAcctid()).longValue());
			ctx.getCarddemoCommarea().setCdemoCardNum(NumberUtils.convert(ctx.getWsThisProgcommarea().getCcupOldCardid()).longValue());
			ctx.getCardRecord().getCardEmbossedNameReference().setValue(ctx.getWsThisProgcommarea().getCcupOldCrdnameReference());
			ctx.getCardRecord().getCardActiveStatusReference().setValue(ctx.getWsThisProgcommarea().getCcupOldCrdstcdReference());
			ctx.getWsMiscStorage().getCardExpiryDayReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpdayReference());
			ctx.getWsMiscStorage().getCardExpiryMonthReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpmonReference());
			ctx.getWsMiscStorage().getCardExpiryYearReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpyearReference());
			
			/* 
			NEW DATA IS SAME AS OLD DATA */
			if (DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getCcupNewCarddataReference().getBytes()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getCcupOldCarddataReference().getBytes())) == 0) {
				ctx.getWsMiscStorage().setNoChangesDetected(true);
			} 
			if (ctx.getWsMiscStorage().isNoChangesDetected() || ctx.getWsThisProgcommarea().isCcupChangesOkNotConfirmed() || ctx.getWsThisProgcommarea().isCcupChangesOkayedAndDone()) {
				ctx.getWsMiscStorage().setFlgCardnameIsvalid(true);
				ctx.getWsMiscStorage().setFlgCardstatusIsvalid(true);
				ctx.getWsMiscStorage().setFlgCardexpmonIsvalid(true);
				ctx.getWsMiscStorage().setFlgCardexpyearIsvalid(true);
				return;
			} else {
				ctx.getWsThisProgcommarea().setCcupChangesNotOk(true);
				editName(ctx, ctrl);
				editCardstatus(ctx, ctrl);
				editExpiryMon(ctx, ctrl);
				editExpiryYear(ctx, ctrl);
				if (ctx.getWsMiscStorage().isInputError()) {
					
					/* 
					Do nothing */
				} else {
					ctx.getWsThisProgcommarea().setCcupChangesOkNotConfirmed(true);
				}
			}
		}
	}

	/**
	 * Process operation editAccount.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAccount(final CocrdupcContext ctx, final ExecutionController ctrl) {
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
			ctx.getWsThisProgcommarea().getCcupNewAcctidReference().setBytes(Record.LOW_VALUES);
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
				ctx.getWsThisProgcommarea().getCcupNewAcctidReference().setBytes(Record.LOW_VALUES);
				return;
			} else {
				ctx.getCarddemoCommarea().setCdemoAcctId(NumberUtils.convert(ctx.getCcWorkAreas().getCcAcctId()).longValue());
				ctx.getWsThisProgcommarea().getCcupNewAcctidReference().setValue(ctx.getCcWorkAreas().getCcAcctIdReference());
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
	public void editCard(final CocrdupcContext ctx, final ExecutionController ctrl) {
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
			DataUtils.setToZeroes(ctx.getWsThisProgcommarea().getCcupNewCardidReference());
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
				ctx.getWsThisProgcommarea().getCcupNewCardidReference().setBytes(Record.LOW_VALUES);
				return;
			} else {
				ctx.getCarddemoCommarea().setCdemoCardNum(ctx.getCcWorkAreas().getCcCardNumN());
				ctx.getWsThisProgcommarea().getCcupNewCardidReference().setValue(ctx.getCcWorkAreas().getCcCardNumReference());
				ctx.getWsMiscStorage().setFlgCardfilterIsvalid(true);
				return;
			}
		}
	}

	/**
	 * Process operation editName.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editName(final CocrdupcContext ctx, final ExecutionController ctrl) {
		/* 
		Not BLANK */
		ctx.getWsMiscStorage().setFlgCardnameNotOk(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getCcupNewCrdnameReference()) || DataUtils.isBlank(ctx.getWsThisProgcommarea().getCcupNewCrdnameReference()) || DataUtils.isZero(ctx.getWsThisProgcommarea().getCcupNewCrdnameReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgCardnameBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setWsPromptForName(true);
			} 
			return;
		} else {
			
			/* 
			Only Alphabets and space allowed */
			ctx.getWsMiscStorage().getCardNameCheckReference().setValue(ctx.getWsThisProgcommarea().getCcupNewCrdnameReference());
			InspectBuilder.newInstance(ctx.getWsMiscStorage().getCardNameCheckReference())
				.convert(ctx.getWsLiterals().getLitAllAlphaFromReference())
				.to(ctx.getWsLiterals().getLitAllSpacesToReference())
				.apply();
			if (ctx.getWsMiscStorage().getCardNameCheck().trim().length() == 0) {
				
				/* 
				Do nothing */
				ctx.getWsMiscStorage().setFlgCardnameIsvalid(true);
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgCardnameNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					ctx.getWsMiscStorage().setWsNameMustBeAlpha(true);
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editCardstatus.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editCardstatus(final CocrdupcContext ctx, final ExecutionController ctrl) {
		/* 
		Must be Y or N */
		ctx.getWsMiscStorage().setFlgCardstatusNotOk(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getCcupNewCrdstcdReference()) || DataUtils.isBlank(ctx.getWsThisProgcommarea().getCcupNewCrdstcdReference()) || DataUtils.isZero(ctx.getWsThisProgcommarea().getCcupNewCrdstcdReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgCardstatusBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setCardStatusMustBeYesNo(true);
			} 
			return;
		} else {
			ctx.getWsMiscStorage().getFlgYesNoCheckReference().setValue(ctx.getWsThisProgcommarea().getCcupNewCrdstcdReference());
			if (ctx.getWsMiscStorage().isFlgYesNoValid()) {
				ctx.getWsMiscStorage().setFlgCardstatusIsvalid(true);
				return;
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgCardstatusNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					ctx.getWsMiscStorage().setCardStatusMustBeYesNo(true);
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editExpiryMon.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editExpiryMon(final CocrdupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setFlgCardexpmonNotOk(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getCcupNewExpmonReference()) || DataUtils.isBlank(ctx.getWsThisProgcommarea().getCcupNewExpmonReference()) || DataUtils.isZero(ctx.getWsThisProgcommarea().getCcupNewExpmonReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgCardexpmonBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setCardExpiryMonthNotValid(true);
			} 
			return;
		} else {
			
			/* 
			Must be numeric
			Must be 1 to 12 */
			ctx.getWsMiscStorage().getCardMonthCheckReference().setValue(ctx.getWsThisProgcommarea().getCcupNewExpmonReference());
			if (ctx.getWsMiscStorage().isValidMonth()) {
				ctx.getWsMiscStorage().setFlgCardexpmonIsvalid(true);
				return;
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgCardexpmonNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					ctx.getWsMiscStorage().setCardExpiryMonthNotValid(true);
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editExpiryYear.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editExpiryYear(final CocrdupcContext ctx, final ExecutionController ctrl) {
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getWsThisProgcommarea().getCcupNewExpyearReference()) || DataUtils.isBlank(ctx.getWsThisProgcommarea().getCcupNewExpyearReference()) || DataUtils.isZero(ctx.getWsThisProgcommarea().getCcupNewExpyearReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgCardexpyearBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setCardExpiryYearNotValid(true);
			} 
			return;
		} else {
			
			/* 
			Must be numeric
			Must be 1 to 12 */
			ctx.getWsMiscStorage().setFlgCardexpyearNotOk(true);
			ctx.getWsMiscStorage().getCardYearCheckReference().setValue(ctx.getWsThisProgcommarea().getCcupNewExpyearReference());
			if (ctx.getWsMiscStorage().isValidYear()) {
				ctx.getWsMiscStorage().setFlgCardexpyearIsvalid(true);
				return;
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgCardexpyearNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					ctx.getWsMiscStorage().setCardExpiryYearNotValid(true);
				} 
				return;
			}
		}
	}

	/**
	 * Process operation sendMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendMap(final CocrdupcContext ctx, final ExecutionController ctrl) {
		screenInit(ctx, ctrl);
		setupScreenVars(ctx, ctrl);
		setupInfomsg(ctx, ctrl);
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
	public void screenInit(final CocrdupcContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().getCcrdupaoReference().setBytes(Record.LOW_VALUES);
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
	public void setupScreenVars(final CocrdupcContext ctx, final ExecutionController ctrl) {
		/* 
		INITIALIZE SEARCH CRITERIA */
		if (ctx.getCarddemoCommarea().isCdemoPgmEnter()) {
			
			/* 
			Do nothing */
		} else {
			if (NumberUtils.eq(ctx.getCcWorkAreas().getCcAcctIdNReference(), 0)) {
				ctx.getGroup1().getAcctsidoReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getGroup1().getAcctsidoReference().setValue(ctx.getCcWorkAreas().getCcAcctIdReference());
			}
			if (NumberUtils.eq(ctx.getCcWorkAreas().getCcCardNumNReference(), 0)) {
				ctx.getGroup1().getCardsidoReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getGroup1().getCardsidoReference().setValue(ctx.getCcWorkAreas().getCcCardNumReference());
			}
			if (ctx.getWsThisProgcommarea().isCcupDetailsNotFetched()) {
				ctx.getGroup1().getCrdnameoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().getCrdnameoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().getCrdstcdoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().getExpdayoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().getExpmonoReference().setBytes(Record.LOW_VALUES);
				ctx.getGroup1().getExpyearoReference().setBytes(Record.LOW_VALUES);
			} else if (ctx.getWsThisProgcommarea().isCcupShowDetails()) {
				ctx.getGroup1().getCrdnameoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldCrdnameReference());
				ctx.getGroup1().getCrdstcdoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldCrdstcdReference());
				ctx.getGroup1().getExpdayoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpdayReference());
				ctx.getGroup1().getExpmonoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpmonReference());
				ctx.getGroup1().getExpyearoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpyearReference());
			} else if (ctx.getWsThisProgcommarea().isCcupChangesMade()) {
				ctx.getGroup1().getCrdnameoReference().setValue(ctx.getWsThisProgcommarea().getCcupNewCrdnameReference());
				ctx.getGroup1().getCrdstcdoReference().setValue(ctx.getWsThisProgcommarea().getCcupNewCrdstcdReference());
				ctx.getGroup1().getExpmonoReference().setValue(ctx.getWsThisProgcommarea().getCcupNewExpmonReference());
				ctx.getGroup1().getExpyearoReference().setValue(ctx.getWsThisProgcommarea().getCcupNewExpyearReference());
				
				/* 
				****************************************************************
				MOVE OLD VALUES TO NON-DISPLAY FIELDS
				THAT WE ARE NOT ALLOWING USER TO CHANGE(FOR NOW)
				****************************************************************
				MOVE CCUP-NEW-EXPDAY     TO EXPDAYO  OF CCRDUPAO */
				ctx.getGroup1().getExpdayoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpdayReference());
			} else {
				ctx.getGroup1().getCrdnameoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldCrdnameReference());
				ctx.getGroup1().getCrdstcdoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldCrdstcdReference());
				ctx.getGroup1().getExpdayoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpdayReference());
				ctx.getGroup1().getExpmonoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpmonReference());
				ctx.getGroup1().getExpyearoReference().setValue(ctx.getWsThisProgcommarea().getCcupOldExpyearReference());
			}
		}
	}

	/**
	 * Process operation setupInfomsg.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupInfomsg(final CocrdupcContext ctx, final ExecutionController ctrl) {
		/* 
		SETUP INFORMATION MESSAGE */
		if (ctx.getCarddemoCommarea().isCdemoPgmEnter()) {
			ctx.getWsMiscStorage().setPromptForSearchKeys(true);
		} else if (ctx.getWsThisProgcommarea().isCcupDetailsNotFetched()) {
			ctx.getWsMiscStorage().setPromptForSearchKeys(true);
		} else if (ctx.getWsThisProgcommarea().isCcupShowDetails()) {
			ctx.getWsMiscStorage().setFoundCardsForAccount(true);
		} else if (ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getWsMiscStorage().setPromptForChanges(true);
		} else if (ctx.getWsThisProgcommarea().isCcupChangesOkNotConfirmed()) {
			ctx.getWsMiscStorage().setPromptForConfirmation(true);
		} else if (ctx.getWsThisProgcommarea().isCcupChangesOkayedAndDone()) {
			ctx.getWsMiscStorage().setConfirmUpdateSuccess(true);
		} else if (ctx.getWsThisProgcommarea().isCcupChangesOkayedLockError()) {
			ctx.getWsMiscStorage().setInformFailure(true);
		} else if (ctx.getWsThisProgcommarea().isCcupChangesOkayedButFailed()) {
			ctx.getWsMiscStorage().setInformFailure(true);
		} else if (ctx.getWsMiscStorage().isWsNoInfoMessage()) {
			ctx.getWsMiscStorage().setPromptForSearchKeys(true);
		} 
		ctx.getGroup1().getInfomsgoReference().setValue(ctx.getWsMiscStorage().getWsInfoMsgReference());
		ctx.getGroup1().setErrmsgo(ctx.getWsMiscStorage().getWsReturnMsg());
	}

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupScreenAttrs(final CocrdupcContext ctx, final ExecutionController ctrl) {
		/* 
		PROTECT OR UNPROTECT BASED ON CONTEXT */
		if (ctx.getWsThisProgcommarea().isCcupDetailsNotFetched()) {
			ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			ctx.getGroup1().getCardsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			ctx.getGroup1().getCrdnameaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getCrdstcdaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getExpmonaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getExpyearaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			
			/* 
			EXPDAYA  OF CCRDUPAI */
		} else if (ctx.getWsThisProgcommarea().isCcupShowDetails() || ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getCardsidaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			
			/* 
			EXPDAYA  OF CCRDUPAI */
			ctx.getGroup1().getCrdnameaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			ctx.getGroup1().getCrdstcdaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			ctx.getGroup1().getExpmonaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			ctx.getGroup1().getExpyearaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		} else if (ctx.getWsThisProgcommarea().isCcupChangesOkNotConfirmed() || ctx.getWsThisProgcommarea().isCcupChangesOkayedAndDone()) {
			ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getCardsidaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getCrdnameaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getCrdstcdaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getExpmonaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getExpyearaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			
			/* 
			EXPDAYA  OF CCRDUPAI */
		} else {
			ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			ctx.getGroup1().getCardsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
			ctx.getGroup1().getCrdnameaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getCrdstcdaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getExpmonaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			ctx.getGroup1().getExpyearaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
			
			/* 
			EXPDAYA  OF CCRDUPAI */
		}
		
		/* 
		POSITION CURSOR */
		if (ctx.getWsMiscStorage().isFoundCardsForAccount() || ctx.getWsMiscStorage().isNoChangesDetected()) {
			ctx.getGroup1().setCrdnamel(-1);
		} else if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk() || ctx.getWsMiscStorage().isFlgAcctfilterBlank()) {
			ctx.getGroup1().setAcctsidl(-1);
		} else if (ctx.getWsMiscStorage().isFlgCardfilterNotOk() || ctx.getWsMiscStorage().isFlgCardfilterBlank()) {
			ctx.getGroup1().setCardsidl(-1);
		} else if (ctx.getWsMiscStorage().isFlgCardnameNotOk() || ctx.getWsMiscStorage().isFlgCardnameBlank()) {
			ctx.getGroup1().setCrdnamel(-1);
		} else if (ctx.getWsMiscStorage().isFlgCardstatusNotOk() || ctx.getWsMiscStorage().isFlgCardstatusBlank()) {
			ctx.getGroup1().setCrdstcdl(-1);
		} else if (ctx.getWsMiscStorage().isFlgCardexpmonNotOk() || ctx.getWsMiscStorage().isFlgCardexpmonBlank()) {
			ctx.getGroup1().setExpmonl(-1);
		} else if (ctx.getWsMiscStorage().isFlgCardexpyearNotOk() || ctx.getWsMiscStorage().isFlgCardexpyearBlank()) {
			ctx.getGroup1().setExpyearl(-1);
		} else {
			ctx.getGroup1().setAcctsidl(-1);
		}
		
		/* 
		SETUP COLOR */
		if (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoLastMapsetReference(), ctx.getWsLiterals().getLitCclistmapsetReference()) == 0) {
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhdfcolReference());
			ctx.getGroup1().getCardsidcReference().setValue(ctx.getDfhbmsca().getDfhdfcolReference());
		} 
		if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk()) {
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgAcctfilterBlank() && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
			ctx.getGroup1().setAcctsido("*");
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardfilterNotOk()) {
			ctx.getGroup1().getCardsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardfilterBlank() && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
			ctx.getGroup1().setCardsido("*");
			ctx.getGroup1().getCardsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardnameNotOk() && ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getGroup1().getCrdnamecReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardnameBlank() && ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getGroup1().setCrdnameo("*");
			ctx.getGroup1().getCrdnamecReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardstatusNotOk() && ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getGroup1().getCrdstcdcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardstatusBlank() && ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getGroup1().setCrdstcdo("*");
			ctx.getGroup1().getCrdstcdcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		ctx.getGroup1().getExpdaycReference().setValue(ctx.getDfhbmsca().getDfhbmdarReference());
		if (ctx.getWsMiscStorage().isFlgCardexpmonNotOk() && ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getGroup1().getExpmoncReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardexpmonBlank() && ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getGroup1().setExpmono("*");
			ctx.getGroup1().getExpmoncReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardexpyearNotOk() && ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getGroup1().getExpyearcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgCardexpyearBlank() && ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			ctx.getGroup1().setExpyearo("*");
			ctx.getGroup1().getExpyearcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isWsNoInfoMessage()) {
			ctx.getGroup1().getInfomsgaReference().setValue(ctx.getDfhbmsca().getDfhbmdarReference());
		} else {
			ctx.getGroup1().getInfomsgaReference().setValue(ctx.getDfhbmsca().getDfhbmbryReference());
		}
		if (ctx.getWsMiscStorage().isPromptForConfirmation()) {
			ctx.getGroup1().getFkeyscaReference().setValue(ctx.getDfhbmsca().getDfhbmbryReference());
		}
	}

	/**
	 * Process operation sendScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendScreen(final CocrdupcContext ctx, final ExecutionController ctrl) {
		ctx.getCcWorkAreas().setCcardNextMapset(ctx.getWsLiterals().getLitThismapset());
		ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsLiterals().getLitThismapReference());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getCcWorkAreas().getCcardNextMap())
		.withMapset(ctx.getCcWorkAreas().getCcardNextMapset())
		.withData(ctx.getGroup1().getCcrdupaoReference())
		.withCursor()
		.withErase()
		.withFreeKB()
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
	}

	/**
	 * Process operation readData.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readData(final CocrdupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsThisProgcommarea().getCcupOldDetailsReference().getField().initialize();
		ctx.getWsThisProgcommarea().getCcupOldAcctidReference().setValue(ctx.getCcWorkAreas().getCcAcctIdReference());
		ctx.getWsThisProgcommarea().getCcupOldCardidReference().setValue(ctx.getCcWorkAreas().getCcCardNumReference());
		getcardByacctcard(ctx, ctrl);
		if (ctx.getWsMiscStorage().isFoundCardsForAccount()) {
			ctx.getWsThisProgcommarea().setCcupOldCvvCd(ctx.getCardRecord().getCardCvvCdReference().getValue(String.class));
			InspectBuilder.newInstance(ctx.getCardRecord().getCardEmbossedNameReference())
				.convert(ctx.getWsLiterals().getLitLowerReference())
				.to(ctx.getWsLiterals().getLitUpperReference())
				.apply();
			ctx.getWsThisProgcommarea().getCcupOldCrdnameReference().setValue(ctx.getCardRecord().getCardEmbossedNameReference());
			ctx.getWsThisProgcommarea().getCcupOldExpyearReference().setBytes(ctx.getCardRecord().getCardExpiraionDateReference().getBytes(0, 4));
			ctx.getWsThisProgcommarea().getCcupOldExpmonReference().setBytes(ctx.getCardRecord().getCardExpiraionDateReference().getBytes(5, 2));
			ctx.getWsThisProgcommarea().getCcupOldExpdayReference().setBytes(ctx.getCardRecord().getCardExpiraionDateReference().getBytes(8, 2));
			ctx.getWsThisProgcommarea().getCcupOldCrdstcdReference().setValue(ctx.getCardRecord().getCardActiveStatusReference());
		}
	}

	/**
	 * Process operation getcardByacctcard.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void getcardByacctcard(final CocrdupcContext ctx, final ExecutionController ctrl) {
		/* 
		Read the Card file
		MOVE CC-ACCT-ID-N            TO WS-CARD-RID-ACCT-ID */
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
	public void yyyyStorePfkey(final CocrdupcContext ctx, final ExecutionController ctrl) {
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

	/**
	 * Process operation abendRoutine.
	 * 
	 *  Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void abendRoutine(final CocrdupcContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getAbendData().getAbendMsgReference())) {
			ctx.getAbendData().setAbendMsg("UNEXPECTED ABEND OCCURRED.");
		} 
		ctx.getAbendData().getAbendCulpritReference().setValue(ctx.getWsLiterals().getLitThispgmReference());
		SendTextBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withData(ctx.getAbendData())
		.withLength(134)
		.withErase()
		.execute();
		HandleAbendBuilder.newInstance(ctx.getDfheiblk(), ctx).cancel().execute().handleException();
		AbendBuilder.newInstance(ctx.getDfheiblk(), ctx).withAbendCode("9999").execute().handleException();
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:33 CDT */
		return;
	}

}
