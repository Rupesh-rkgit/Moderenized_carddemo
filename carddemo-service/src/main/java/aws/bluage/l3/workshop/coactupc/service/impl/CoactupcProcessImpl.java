
package aws.bluage.l3.workshop.coactupc.service.impl;

import aws.bluage.l3.workshop.coactupc.business.context.CoactupcContext;
import aws.bluage.l3.workshop.coactupc.service.CoactupcProcess;
import aws.bluage.l3.workshop.coactupc.statemachine.CoactupcProcedureDivisionStateMachineController;
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
import com.netfective.bluage.gapwalk.runtime.statements.CallBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.DateHelper;
import com.netfective.bluage.gapwalk.runtime.statements.InspectBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * Class CoactupcProcessImpl
 * 
 * Defines application services for CoactupcProcess
 * @see CoactupcProcess
 */
@Service("aws.bluage.l3.workshop.coactupc.service.CoactupcProcess")
@Import({
aws.bluage.l3.workshop.coactupc.statemachine.CoactupcProcedureDivisionStateMachineController.class 
}) 	
public class CoactupcProcessImpl implements CoactupcProcess {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CoactupcProcessImpl.class);

	@Autowired
	private CoactupcProcedureDivisionStateMachineController coactupcProcedureDivisionStateMachineRunner;


	/**
	 * Process operation coactupc.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void coactupc(final CoactupcContext ctx, final ExecutionController ctrl) {
		coactupcProcedureDivisionStateMachineRunner.run(ctx,ctrl);
	}

	/**
	 * Process operation commonReturn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void commonReturn(final CoactupcContext ctx, final ExecutionController ctrl) {
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
	public void processInputs(final CoactupcContext ctx, final ExecutionController ctrl) {
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
	public void receiveMap(final CoactupcContext ctx, final ExecutionController ctrl) {
		ReceiveMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getWsLiterals().getLitThismap())
		.withMapset(ctx.getWsLiterals().getLitThismapset())
		.into(ctx.getGroup1().getCactupaiReference())
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		ctx.getWsThisProgcommarea().getAcupNewDetailsReference().getField().initialize();
		
		/* 
		****************************************************************
		Account Master data
		**************************************************************** */
		if (DataUtils.compare(ctx.getGroup1().getAcctsidiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcctsidiReference())) {
			ctx.getCcWorkAreas().getCcAcctIdReference().setBytes(Record.LOW_VALUES);
			ctx.getWsThisProgcommarea().getAcupNewAcctIdXReference().setBytes(Record.LOW_VALUES);
		} else {
			ctx.getCcWorkAreas().getCcAcctIdReference().setValue(ctx.getGroup1().getAcctsidiReference());
			ctx.getWsThisProgcommarea().getAcupNewAcctIdXReference().setValue(ctx.getGroup1().getAcctsidiReference());
		}
		if (ctx.getWsThisProgcommarea().isAcupDetailsNotFetched()) {
			return;
		} else {
			
			/* 
			Active Status */
			if (DataUtils.compare(ctx.getGroup1().getAcsttusiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsttusiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewActiveStatusReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewActiveStatusReference().setValue(ctx.getGroup1().getAcsttusiReference());
			}
			
			/* 
			Credit Limit */
			if (DataUtils.compare(ctx.getGroup1().getAcrdlimiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcrdlimiReference())) {
				ctx.getWsMiscStorage().getAcupNewCreditLimitXReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsMiscStorage().getAcupNewCreditLimitXReference().setValue(ctx.getGroup1().getAcrdlimiReference());
				if (DataUtils.compare(NumberUtils.testNumvalC(ctx.getWsMiscStorage().getAcupNewCreditLimitX()), 0) == 0) {
					ctx.getWsThisProgcommarea().setAcupNewCreditLimitN(NumberUtils.convert(ctx.getGroup1().getAcrdlimi()));
				} else {
					
					/* 
					Do nothing */
				}
			}
			
			/* 
			Cash Limit */
			if (DataUtils.compare(ctx.getGroup1().getAcshlimiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcshlimiReference())) {
				ctx.getWsMiscStorage().getAcupNewCashCreditLimitXReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsMiscStorage().getAcupNewCashCreditLimitXReference().setValue(ctx.getGroup1().getAcshlimiReference());
				if (DataUtils.compare(NumberUtils.testNumvalC(ctx.getWsMiscStorage().getAcupNewCashCreditLimitX()), 0) == 0) {
					ctx.getWsThisProgcommarea().setAcupNewCashCreditLimitN(NumberUtils.convert(ctx.getGroup1().getAcshlimi()));
				} else {
					
					/* 
					Do nothing */
				}
			}
			
			/* 
			Current Balance */
			if (DataUtils.compare(ctx.getGroup1().getAcurbaliReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcurbaliReference())) {
				ctx.getWsMiscStorage().getAcupNewCurrBalXReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsMiscStorage().getAcupNewCurrBalXReference().setValue(ctx.getGroup1().getAcurbaliReference());
				if (DataUtils.compare(NumberUtils.testNumvalC(ctx.getWsMiscStorage().getAcupNewCurrBalX()), 0) == 0) {
					ctx.getWsThisProgcommarea().setAcupNewCurrBalN(NumberUtils.convert(ctx.getWsMiscStorage().getAcupNewCurrBalX()));
				} else {
					
					/* 
					Do nothing */
				}
			}
			
			/* 
			Current Cycle Credit */
			if (DataUtils.compare(ctx.getGroup1().getAcrcycriReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcrcycriReference())) {
				ctx.getWsMiscStorage().getAcupNewCurrCycCreditXReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsMiscStorage().getAcupNewCurrCycCreditXReference().setValue(ctx.getGroup1().getAcrcycriReference());
				if (DataUtils.compare(NumberUtils.testNumvalC(ctx.getWsMiscStorage().getAcupNewCurrCycCreditX()), 0) == 0) {
					ctx.getWsThisProgcommarea().setAcupNewCurrCycCreditN(NumberUtils.convert(ctx.getGroup1().getAcrcycri()));
				} else {
					
					/* 
					Do nothing */
				}
			}
			
			/* 
			Current Cycle Debit */
			if (DataUtils.compare(ctx.getGroup1().getAcrcydbiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcrcydbiReference())) {
				ctx.getWsMiscStorage().getAcupNewCurrCycDebitXReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsMiscStorage().getAcupNewCurrCycDebitXReference().setValue(ctx.getGroup1().getAcrcydbiReference());
				if (DataUtils.compare(NumberUtils.testNumvalC(ctx.getWsMiscStorage().getAcupNewCurrCycDebitX()), 0) == 0) {
					ctx.getWsThisProgcommarea().setAcupNewCurrCycDebitN(NumberUtils.convert(ctx.getGroup1().getAcrcydbi()));
				} else {
					
					/* 
					Do nothing */
				}
			}
			
			/* 
			Open date */
			if (DataUtils.compare(ctx.getGroup1().getOpnyeariReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getOpnyeariReference())) {
				ctx.getWsThisProgcommarea().getAcupNewOpenYearReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewOpenYearReference().setValue(ctx.getGroup1().getOpnyeariReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getOpnmoniReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getOpnmoniReference())) {
				ctx.getWsThisProgcommarea().getAcupNewOpenMonReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewOpenMonReference().setValue(ctx.getGroup1().getOpnmoniReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getOpndayiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getOpndayiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewOpenDayReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewOpenDayReference().setValue(ctx.getGroup1().getOpndayiReference());
			}
			
			/* 
			Expiry date */
			if (DataUtils.compare(ctx.getGroup1().getExpyeariReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getExpyeariReference())) {
				ctx.getWsThisProgcommarea().getAcupNewExpYearReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewExpYearReference().setValue(ctx.getGroup1().getExpyeariReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getExpmoniReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getExpmoniReference())) {
				ctx.getWsThisProgcommarea().getAcupNewExpMonReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewExpMonReference().setValue(ctx.getGroup1().getExpmoniReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getExpdayiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getExpdayiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewExpDayReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewExpDayReference().setValue(ctx.getGroup1().getExpdayiReference());
			}
			
			/* 
			Reissue date */
			if (DataUtils.compare(ctx.getGroup1().getRisyeariReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getRisyeariReference())) {
				ctx.getWsThisProgcommarea().getAcupNewReissueYearReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewReissueYearReference().setValue(ctx.getGroup1().getRisyeariReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getRismoniReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getRismoniReference())) {
				ctx.getWsThisProgcommarea().getAcupNewReissueMonReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewReissueMonReference().setValue(ctx.getGroup1().getRismoniReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getRisdayiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getRisdayiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewReissueDayReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewReissueDayReference().setValue(ctx.getGroup1().getRisdayiReference());
			}
			
			/* 
			Account Group */
			if (DataUtils.compare(ctx.getGroup1().getAaddgrpiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAaddgrpiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewGroupIdReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewGroupIdReference().setValue(ctx.getGroup1().getAaddgrpiReference());
			}
			
			/* 
			****************************************************************
			Customer Master data
			****************************************************************
			Customer Id (actually not editable) */
			if (DataUtils.compare(ctx.getGroup1().getAcstnumiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcstnumiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustIdXReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustIdXReference().setValue(ctx.getGroup1().getAcstnumiReference());
			}
			
			/* 
			Social Security Number */
			if (DataUtils.compare(ctx.getGroup1().getActssn1iReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getActssn1iReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustSsn1Reference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustSsn1Reference().setValue(ctx.getGroup1().getActssn1iReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getActssn2iReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getActssn2iReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustSsn2Reference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustSsn2Reference().setValue(ctx.getGroup1().getActssn2iReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getActssn3iReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getActssn3iReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustSsn3Reference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustSsn3Reference().setValue(ctx.getGroup1().getActssn3iReference());
			}
			
			/* 
			Date of birth */
			if (DataUtils.compare(ctx.getGroup1().getDobyeariReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getDobyeariReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustDobYearReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustDobYearReference().setValue(ctx.getGroup1().getDobyeariReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getDobmoniReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getDobmoniReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustDobMonReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustDobMonReference().setValue(ctx.getGroup1().getDobmoniReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getDobdayiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getDobdayiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustDobDayReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustDobDayReference().setValue(ctx.getGroup1().getDobdayiReference());
			}
			
			/* 
			FICO */
			if (DataUtils.compare(ctx.getGroup1().getAcstfcoiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcstfcoiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustFicoScoreXReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustFicoScoreXReference().setValue(ctx.getGroup1().getAcstfcoiReference());
			}
			
			/* 
			First Name */
			if (DataUtils.compare(ctx.getGroup1().getAcsfnamiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsfnamiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustFirstNameReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustFirstNameReference().setValue(ctx.getGroup1().getAcsfnamiReference());
			}
			
			/* 
			Middle Name */
			if (DataUtils.compare(ctx.getGroup1().getAcsmnamiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsmnamiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustMiddleNameReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustMiddleNameReference().setValue(ctx.getGroup1().getAcsmnamiReference());
			}
			
			/* 
			Last Name */
			if (DataUtils.compare(ctx.getGroup1().getAcslnamiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcslnamiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustLastNameReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustLastNameReference().setValue(ctx.getGroup1().getAcslnamiReference());
			}
			
			/* 
			Address */
			if (DataUtils.compare(ctx.getGroup1().getAcsadl1iReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsadl1iReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrLine1Reference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrLine1Reference().setValue(ctx.getGroup1().getAcsadl1iReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcsadl2iReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsadl2iReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrLine2Reference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrLine2Reference().setValue(ctx.getGroup1().getAcsadl2iReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcscityiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcscityiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrLine3Reference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrLine3Reference().setValue(ctx.getGroup1().getAcscityiReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcsstteiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsstteiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrStateCdReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrStateCdReference().setValue(ctx.getGroup1().getAcsstteiReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcsctryiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsctryiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrCountryCdReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrCountryCdReference().setValue(ctx.getGroup1().getAcsctryiReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcszipciReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcszipciReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustAddrZipReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().setAcupNewCustAddrZip(ctx.getGroup1().getAcszipci());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcsph1aiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsph1aiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1aReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1aReference().setValue(ctx.getGroup1().getAcsph1aiReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcsph1biReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsph1biReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1bReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1bReference().setValue(ctx.getGroup1().getAcsph1biReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcsph1ciReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsph1ciReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1cReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1cReference().setValue(ctx.getGroup1().getAcsph1ciReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcsph2aiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsph2aiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2aReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2aReference().setValue(ctx.getGroup1().getAcsph2aiReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcsph2biReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsph2biReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2bReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2bReference().setValue(ctx.getGroup1().getAcsph2biReference());
			}
			if (DataUtils.compare(ctx.getGroup1().getAcsph2ciReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsph2ciReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2cReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2cReference().setValue(ctx.getGroup1().getAcsph2ciReference());
			}
			
			/* 
			Government Id */
			if (DataUtils.compare(ctx.getGroup1().getAcsgovtiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcsgovtiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustGovtIssuedIdReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustGovtIssuedIdReference().setValue(ctx.getGroup1().getAcsgovtiReference());
			}
			
			/* 
			EFT Code */
			if (DataUtils.compare(ctx.getGroup1().getAcseftciReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcseftciReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustEftAccountIdReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustEftAccountIdReference().setValue(ctx.getGroup1().getAcseftciReference());
			}
			
			/* 
			Primary Holder Indicator */
			if (DataUtils.compare(ctx.getGroup1().getAcspflgiReference(), "*") == 0 || DataUtils.isBlank(ctx.getGroup1().getAcspflgiReference())) {
				ctx.getWsThisProgcommarea().getAcupNewCustPriHolderIndReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getWsThisProgcommarea().getAcupNewCustPriHolderIndReference().setValue(ctx.getGroup1().getAcspflgiReference());
			}
		}
	}

	/**
	 * Process operation editMapInputs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editMapInputs(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setInputOk(true);
		if (ctx.getWsThisProgcommarea().isAcupDetailsNotFetched()) {
			
			/* 
			VALIDATE THE SEARCH KEYS */
			editAccount(ctx, ctrl);
			ctx.getWsThisProgcommarea().getAcupOldAcctDataReference().setBytes(Record.LOW_VALUES);
			
			/* 
			IF THE SEARCH CONDITIONS HAVE PROBLEMS FLAG THEM */
			if (ctx.getWsMiscStorage().isFlgAcctfilterBlank()) {
				ctx.getWsMiscStorage().setNoSearchCriteriaReceived(true);
			} 
			
			/* 
			AT THIS STAGE. NO DETAILS FETCHED. NOTHING MORE TO EDIT. */
			return;
		} else {
			
			/* 
			SEARCH KEYS ALREADY VALIDATED AND DATA FETCHED
			Do nothing */
			ctx.getWsMiscStorage().setFoundAccountData(true);
			ctx.getWsMiscStorage().setFoundAcctInMaster(true);
			ctx.getWsMiscStorage().setFlgAcctfilterIsvalid(true);
			ctx.getWsMiscStorage().setFoundCustInMaster(true);
			ctx.getWsMiscStorage().setFlgCustfilterIsvalid(true);
			compareOldNew(ctx, ctrl);
			if (ctx.getWsMiscStorage().isNoChangesFound() || ctx.getWsThisProgcommarea().isAcupChangesOkNotConfirmed() || ctx.getWsThisProgcommarea().isAcupChangesOkayedAndDone()) {
				ctx.getWsMiscStorage().getWsNonKeyFlagsReference().setBytes(Record.LOW_VALUES);
				return;
			} else {
				ctx.getWsThisProgcommarea().setAcupChangesNotOk(true);
				ctx.getWsMiscStorage().setWsEditVariableName("Account Status");
				ctx.getWsMiscStorage().getWsEditYesNoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewActiveStatusReference());
				editYesno(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditAcctStatusReference().setValue(ctx.getWsMiscStorage().getWsEditYesNoReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Open Date");
				ctx.getWsMiscStorage().getWsEditDateCcyymmddReference().setBytes(ctx.getWsThisProgcommarea().getAcupNewOpenDateReference().getBytes());
				editDateCcyymmdd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditOpenDateFlgsReference().setBytes(ctx.getWsMiscStorage().getWsEditDateFlgsReference().getBytes());
				ctx.getWsMiscStorage().setWsEditVariableName("Credit Limit");
				ctx.getWsMiscStorage().getWsEditSignedNumber9v2XReference().setValue(ctx.getWsMiscStorage().getAcupNewCreditLimitXReference());
				editSigned9v2(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditCreditLimitReference().setValue(ctx.getWsMiscStorage().getWsFlgSignedNumberEditReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Expiry Date");
				ctx.getWsMiscStorage().getWsEditDateCcyymmddReference().setBytes(ctx.getWsThisProgcommarea().getAcupNewExpiraionDateReference().getBytes());
				editDateCcyymmdd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsExpiryDateFlgsReference().setBytes(ctx.getWsMiscStorage().getWsEditDateFlgsReference().getBytes());
				ctx.getWsMiscStorage().setWsEditVariableName("Cash Credit Limit");
				ctx.getWsMiscStorage().getWsEditSignedNumber9v2XReference().setValue(ctx.getWsMiscStorage().getAcupNewCashCreditLimitXReference());
				editSigned9v2(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditCashCreditLimitReference().setValue(ctx.getWsMiscStorage().getWsFlgSignedNumberEditReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Reissue Date");
				ctx.getWsMiscStorage().getWsEditDateCcyymmddReference().setBytes(ctx.getWsThisProgcommarea().getAcupNewReissueDateReference().getBytes());
				editDateCcyymmdd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditReissueDateFlgsReference().setBytes(ctx.getWsMiscStorage().getWsEditDateFlgsReference().getBytes());
				ctx.getWsMiscStorage().setWsEditVariableName("Current Balance");
				ctx.getWsMiscStorage().getWsEditSignedNumber9v2XReference().setValue(ctx.getWsMiscStorage().getAcupNewCurrBalXReference());
				editSigned9v2(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditCurrBalReference().setValue(ctx.getWsMiscStorage().getWsFlgSignedNumberEditReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Current Cycle Credit Limit");
				ctx.getWsMiscStorage().getWsEditSignedNumber9v2XReference().setValue(ctx.getWsMiscStorage().getAcupNewCurrCycCreditXReference());
				editSigned9v2(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditCurrCycCreditReference().setValue(ctx.getWsMiscStorage().getWsFlgSignedNumberEditReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Current Cycle Debit Limit");
				ctx.getWsMiscStorage().getWsEditSignedNumber9v2XReference().setValue(ctx.getWsMiscStorage().getAcupNewCurrCycDebitXReference());
				editSigned9v2(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditCurrCycDebitReference().setValue(ctx.getWsMiscStorage().getWsFlgSignedNumberEditReference());
				ctx.getWsMiscStorage().setWsEditVariableName("SSN");
				editUsSsn(ctx, ctrl);
				ctx.getWsMiscStorage().setWsEditVariableName("Date of Birth");
				ctx.getWsMiscStorage().getWsEditDateCcyymmddReference().setBytes(ctx.getWsThisProgcommarea().getAcupNewCustDobYyyyMmDdReference().getBytes());
				editDateCcyymmdd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditDtOfBirthFlgsReference().setBytes(ctx.getWsMiscStorage().getWsEditDateFlgsReference().getBytes());
				if (ctx.getWsMiscStorage().isWsEditDtOfBirthIsvalid()) {
					editDateOfBirth(ctx, ctrl);
					ctx.getWsMiscStorage().getWsEditDtOfBirthFlgsReference().setBytes(ctx.getWsMiscStorage().getWsEditDateFlgsReference().getBytes());
				} 
				ctx.getWsMiscStorage().setWsEditVariableName("FICO Score");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustFicoScoreX());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(3);
				editNumReqd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditFicoScoreFlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyFlagsReference());
				if (ctx.getWsMiscStorage().isFlgFicoScoreIsvalid()) {
					editFicoScore(ctx, ctrl);
				} 
				
				/* 
				****************************************************************
				Edit names
				**************************************************************** */
				ctx.getWsMiscStorage().setWsEditVariableName("First Name");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustFirstName());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(25);
				editAlphaReqd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditFirstNameFlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphaOnlyFlagsReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Middle Name");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustMiddleName());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(25);
				editAlphaOpt(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditMiddleNameFlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphaOnlyFlagsReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Last Name");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustLastName());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(25);
				editAlphaReqd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditLastNameFlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphaOnlyFlagsReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Address Line 1");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine1());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(50);
				editMandatory(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditAddressLine1FlgsReference().setValue(ctx.getWsMiscStorage().getWsEditMandatoryFlagsReference());
				ctx.getWsMiscStorage().setWsEditVariableName("State");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustAddrStateCd());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(2);
				editAlphaReqd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditStateFlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphaOnlyFlagsReference());
				if (ctx.getWsMiscStorage().isFlgAlphaIsvalid()) {
					editUsStateCd(ctx, ctrl);
				} 
				ctx.getWsMiscStorage().setWsEditVariableName("Zip");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustAddrZip());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(5);
				editNumReqd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditZipcodeFlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyFlagsReference());
				
				/* 
				Address Line 2 is optional
				MOVE 'Address Line 2'         TO WS-EDIT-VARIABLE-NAME */
				ctx.getWsMiscStorage().setWsEditVariableName("City");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine3());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(50);
				editAlphaReqd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditCityFlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphaOnlyFlagsReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Country");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustAddrCountryCd());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(3);
				editAlphaReqd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditCountryFlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphaOnlyFlagsReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Phone Number 1");
				ctx.getWsMiscStorage().getWsEditUsPhoneNumReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1Reference());
				editUsPhoneNum(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditPhoneNum1FlgsReference().setBytes(ctx.getWsMiscStorage().getWsEditUsPhoneNumFlgsReference().getBytes());
				ctx.getWsMiscStorage().setWsEditVariableName("Phone Number 2");
				ctx.getWsMiscStorage().getWsEditUsPhoneNumReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2Reference());
				editUsPhoneNum(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditPhoneNum2FlgsReference().setBytes(ctx.getWsMiscStorage().getWsEditUsPhoneNumFlgsReference().getBytes());
				ctx.getWsMiscStorage().setWsEditVariableName("EFT Account Id");
				ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustEftAccountId());
				ctx.getWsMiscStorage().setWsEditAlphanumLength(10);
				editNumReqd(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEftAccountIdFlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyFlagsReference());
				ctx.getWsMiscStorage().setWsEditVariableName("Primary Card Holder");
				ctx.getWsMiscStorage().getWsEditYesNoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPriHolderIndReference());
				editYesno(ctx, ctrl);
				ctx.getWsMiscStorage().getWsEditPriCardholderReference().setValue(ctx.getWsMiscStorage().getWsEditYesNoReference());
				
				/* 
				Cross field edits begin here */
				if (ctx.getWsMiscStorage().isFlgStateIsvalid() && ctx.getWsMiscStorage().isFlgZipcodeIsvalid()) {
					editUsStateZipCd(ctx, ctrl);
				} 
				if (ctx.getWsMiscStorage().isInputError()) {
					
					/* 
					Do nothing */
				} else {
					ctx.getWsThisProgcommarea().setAcupChangesOkNotConfirmed(true);
				}
			}
		}
	}

	/**
	 * Process operation compareOldNew.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void compareOldNew(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setNoChangesFound(true);
		if (DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewAcctIdXReference(), ctx.getWsThisProgcommarea().getAcupOldAcctIdXReference()) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewActiveStatus()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldActiveStatus())) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCurrBalReference(), ctx.getWsThisProgcommarea().getAcupOldCurrBalReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCreditLimitReference(), ctx.getWsThisProgcommarea().getAcupOldCreditLimitReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCashCreditLimitReference(), ctx.getWsThisProgcommarea().getAcupOldCashCreditLimitReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewOpenDateReference(), ctx.getWsThisProgcommarea().getAcupOldOpenDateReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewExpiraionDateReference(), ctx.getWsThisProgcommarea().getAcupOldExpiraionDateReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewReissueDateReference(), ctx.getWsThisProgcommarea().getAcupOldReissueDateReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCurrCycCreditReference(), ctx.getWsThisProgcommarea().getAcupOldCurrCycCreditReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCurrCycDebitReference(), ctx.getWsThisProgcommarea().getAcupOldCurrCycDebitReference()) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewGroupId().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldGroupId().trim())) == 0) {
			
			/* 
			Do nothing */
			if (DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustIdX().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustIdX().trim())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustFirstName().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustFirstName().trim())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustMiddleName().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustMiddleName().trim())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustLastName().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustLastName().trim())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine1().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrLine1().trim())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine2().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrLine2().trim())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine3().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrLine3().trim())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustAddrStateCd().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrStateCd().trim())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustAddrCountryCd().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrCountryCd().trim())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustAddrZip().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrZip().trim())) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1aReference(), ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum1aReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1bReference(), ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum1bReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1cReference(), ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum1cReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2aReference(), ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum2aReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2bReference(), ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum2bReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2cReference(), ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum2cReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustSsnXReference(), ctx.getWsThisProgcommarea().getAcupOldCustSsnXReference()) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustGovtIssuedId().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustGovtIssuedId().trim())) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustDobYyyyMmDdReference(), ctx.getWsThisProgcommarea().getAcupOldCustDobYyyyMmDdReference()) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustEftAccountIdReference(), ctx.getWsThisProgcommarea().getAcupOldCustEftAccountIdReference()) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupNewCustPriHolderInd().trim()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustPriHolderInd().trim())) == 0 && DataUtils.compare(ctx.getWsThisProgcommarea().getAcupNewCustFicoScoreXReference(), ctx.getWsThisProgcommarea().getAcupOldCustFicoScoreXReference()) == 0) {
				ctx.getWsMiscStorage().setNoChangesDetected(true);
				return;
			} else {
				ctx.getWsMiscStorage().setChangeHasOccurred(true);
				return;
			}
		} else {
			ctx.getWsMiscStorage().setChangeHasOccurred(true);
			return;
		}
	}

	/**
	 * Process operation editAccount.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAccount(final CoactupcContext ctx, final ExecutionController ctrl) {
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
			DataUtils.setToZeroes(ctx.getWsThisProgcommarea().getAcupNewAcctIdReference());
			return;
		} else {
			
			/* 
			Not numeric
			Not 11 characters */
			ctx.getWsThisProgcommarea().setAcupNewAcctId(NumberUtils.convert(ctx.getCcWorkAreas().getCcAcctId()).longValue());
			if (!(DataUtils.isNumeric(ctx.getCcWorkAreas().getCcAcctIdReference())) || NumberUtils.eq(ctx.getCcWorkAreas().getCcAcctIdNReference(), 0)) {
				ctx.getWsMiscStorage().setInputError(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize("Account Number if supplied must be a 11 digit")
						.addDelimitedBySize(" Non-Zero Number")
						.end();
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
	 * Process operation editMandatory.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editMandatory(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		Initialize */
		ctx.getWsMiscStorage().setFlgMandatoryNotOk(true);
		
		/* 
		Not supplied */
		int len = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len1 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len2 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len)) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len1)) || DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len2)).trim().length() == 0) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgMandatoryBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" must be supplied.")
					.end();
			} 
			return;
		} else {
			ctx.getWsMiscStorage().setFlgMandatoryIsvalid(true);
		}
	}

	/**
	 * Process operation editYesno.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editYesno(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		Must be Y or N
		SET FLG-YES-NO-NOT-OK         TO TRUE
		Not supplied */
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditYesNoReference()) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditYesNoReference()) || DataUtils.isZero(ctx.getWsMiscStorage().getWsEditYesNoReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgYesNoBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" must be supplied.")
					.end();
			} 
			return;
		} else {
			if (ctx.getWsMiscStorage().isFlgYesNoIsvalid()) {
				
				/* 
				Do nothing */
				return;
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgYesNoNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(" must be Y or N.")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editAlphaReqd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAlphaReqd(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		Initialize */
		ctx.getWsMiscStorage().setFlgAlphaNotOk(true);
		
		/* 
		Not supplied */
		int len = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len1 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len2 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len)) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len1)) || DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len2)).trim().length() == 0) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAlphaBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" must be supplied.")
					.end();
			} 
			return;
		} else {
			
			/* 
			Only Alphabets and space allowed */
			ctx.getLitAllAlphaFrom().getLitAllAlphaFromReference().setBytes(ctx.getWsLiterals().getLitAllAlphaFromXReference().getBytes());
			InspectBuilder.newInstance(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference(), 0, ctx.getWsMiscStorage().getWsEditAlphanumLength())
				.convert(ctx.getLitAllAlphaFrom().getLitAllAlphaFromReference())
				.to(ctx.getLitAlphaSpacesTo().getLitAlphaSpacesToReference())
				.apply();
			int len3 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
			if (DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len3)).trim().length() == 0) {
				
				/* 
				Do nothing */
				ctx.getWsMiscStorage().setFlgAlphaIsvalid(true);
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgAlphaNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(" can have alphabets only.")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editAlphanumReqd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAlphanumReqd(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		Initialize */
		ctx.getWsMiscStorage().setFlgAlphnanumNotOk(true);
		
		/* 
		Not supplied */
		int len = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len1 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len2 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len)) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len1)) || DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len2)).trim().length() == 0) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAlphnanumBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" must be supplied.")
					.end();
			} 
			
			/* 
			GotoStatement to _1230EditAlphanumReqdExit */
		} 
		
		/* 
		Only Alphabets,numbers and space allowed */
		ctx.getLitAllAlphanumFrom().getLitAllAlphanumFromReference().setBytes(ctx.getWsLiterals().getLitAllAlphanumFromXReference().getBytes());
		InspectBuilder.newInstance(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference(), 0, ctx.getWsMiscStorage().getWsEditAlphanumLength())
			.convert(ctx.getLitAllAlphanumFrom().getLitAllAlphanumFromReference())
			.to(ctx.getLitAlphanumSpacesTo().getLitAlphanumSpacesToReference())
			.apply();
		int len3 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		if (DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len3)).trim().length() == 0) {
			
			/* 
			Do nothing */
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAlphnanumNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" can have numbers or alphabets only.")
					.end();
			} 
			
			/* 
			GotoStatement to _1230EditAlphanumReqdExit */
		}
		ctx.getWsMiscStorage().setFlgAlphnanumIsvalid(true);
	}

	/**
	 * Process operation editAlphaOpt.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAlphaOpt(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		Initialize */
		ctx.getWsMiscStorage().setFlgAlphaNotOk(true);
		
		/* 
		Not supplied */
		int len = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len1 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len2 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len)) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len1)) || DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len2)).trim().length() == 0) {
			ctx.getWsMiscStorage().setFlgAlphaIsvalid(true);
			return;
		} else {
			
			/* 
			Only Alphabets and space allowed
			Do nothing */
			ctx.getLitAllAlphaFrom().getLitAllAlphaFromReference().setBytes(ctx.getWsLiterals().getLitAllAlphaFromXReference().getBytes());
			InspectBuilder.newInstance(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference(), 0, ctx.getWsMiscStorage().getWsEditAlphanumLength())
				.convert(ctx.getLitAllAlphaFrom().getLitAllAlphaFromReference())
				.to(ctx.getLitAlphaSpacesTo().getLitAlphaSpacesToReference())
				.apply();
			int len3 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
			if (DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len3)).trim().length() == 0) {
				
				/* 
				Do nothing */
				ctx.getWsMiscStorage().setFlgAlphaIsvalid(true);
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgAlphaNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(" can have alphabets only.")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editAlphanumOpt.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAlphanumOpt(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		Initialize */
		ctx.getWsMiscStorage().setFlgAlphnanumNotOk(true);
		
		/* 
		Not supplied, but ok as optional */
		int len = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len1 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len2 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len)) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len1)) || DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len2)).trim().length() == 0) {
			ctx.getWsMiscStorage().setFlgAlphnanumIsvalid(true);
			
			/* 
			GotoStatement to _1240EditAlphanumOptExit */
		} else {
			
			/* 
			Do nothing */
		}
		
		/* 
		Only Alphabets and space allowed */
		ctx.getLitAllAlphanumFrom().getLitAllAlphanumFromReference().setBytes(ctx.getWsLiterals().getLitAllAlphanumFromXReference().getBytes());
		InspectBuilder.newInstance(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference(), 0, ctx.getWsMiscStorage().getWsEditAlphanumLength())
			.convert(ctx.getLitAllAlphanumFrom().getLitAllAlphanumFromReference())
			.to(ctx.getLitAlphanumSpacesTo().getLitAlphanumSpacesToReference())
			.apply();
		int len3 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		if (DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len3)).trim().length() == 0) {
			
			/* 
			Do nothing */
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAlphnanumNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" can have numbers or alphabets only.")
					.end();
			} 
			
			/* 
			GotoStatement to _1240EditAlphanumOptExit */
		}
		ctx.getWsMiscStorage().setFlgAlphnanumIsvalid(true);
	}

	/**
	 * Process operation editNumReqd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editNumReqd(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		Initialize */
		ctx.getWsMiscStorage().setFlgAlphnanumNotOk(true);
		
		/* 
		Not supplied */
		int len = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len1 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		int len2 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len)) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len1)) || DataUtils.toString(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len2)).trim().length() == 0) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgAlphnanumBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" must be supplied.")
					.end();
			} 
			return;
		} else {
			
			/* 
			Only all numeric allowed */
			int len3 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
			if (DataUtils.isNumeric(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len3))) {
				
				/* 
				Must not be zero
				Do nothing */
				int len4 = ctx.getWsMiscStorage().getWsEditAlphanumLength();
				if (NumberUtils.compare(NumberUtils.convert(ctx.getWsMiscStorage().getWsEditAlphanumOnlyReference().getBytes(0, len4)), 0) == 0) {
					ctx.getWsMiscStorage().setInputError(true);
					ctx.getWsMiscStorage().setFlgAlphnanumNotOk(true);
					if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
						StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
							.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
							.addDelimitedBySize(" must not be zero.")
							.end();
					} 
					return;
				} else {
					
					/* 
					Do nothing */
					ctx.getWsMiscStorage().setFlgAlphnanumIsvalid(true);
				}
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgAlphnanumNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(" must be all numeric.")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editSigned9v2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editSigned9v2(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setFlgSignedNumberNotOk(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditSignedNumber9v2XReference()) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditSignedNumber9v2XReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgSignedNumberBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" must be supplied.")
					.end();
			} 
			return;
		} else {
			
			/* 
			Do nothing */
			if (DataUtils.compare(NumberUtils.testNumvalC(ctx.getWsMiscStorage().getWsEditSignedNumber9v2X()), 0) == 0) {
				
				/* 
				If we got here all edits were cleared
				Do nothing */
				ctx.getWsMiscStorage().setFlgSignedNumberIsvalid(true);
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgSignedNumberNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(" is not valid")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editUsPhoneNum.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editUsPhoneNum(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		The database stores date in X(15) format (999)999-9999
		1234567890123
		So we take the X(15) input into WS-EDIT-US-PHONE-NUM
		and edit it */
		ctx.getWsMiscStorage().setWsEditUsPhoneIsInvalid(true);
		
		/* 
		Not mandatory to enter a phone number */
		if ((DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditUsPhoneNumaReference()) || DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditUsPhoneNumaReference())) && (DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditUsPhoneNumbReference()) || DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditUsPhoneNumbReference())) && (DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditUsPhoneNumaReference()) || DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditUsPhoneNumcReference()))) {
			ctx.getWsMiscStorage().setWsEditUsPhoneIsValid(true);
			return;
		} else {
			
			/* 
			Do nothing */
			editAreaCode(ctx, ctrl);
		}
	}

	/**
	 * Process operation editAreaCode.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAreaCode(final CoactupcContext ctx, final ExecutionController ctrl) {
		editAreaCode1(ctx, ctrl);
		if (DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditUsPhoneNumcReference()) || DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditUsPhoneNumcReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgEditUsPhonecBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(": Line number code must be supplied.")
					.end();
			} 
			return;
		} else {
			
			/* 
			Do nothing */
			if (DataUtils.isNumeric(ctx.getWsMiscStorage().getWsEditUsPhoneNumcReference())) {
				
				/* 
				Do nothing */
				if (NumberUtils.eq(ctx.getWsMiscStorage().getWsEditUsPhoneNumcNReference(), 0)) {
					ctx.getWsMiscStorage().setInputError(true);
					ctx.getWsMiscStorage().setFlgEditUsPhonecNotOk(true);
					if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
						StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
							.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
							.addDelimitedBySize(": Line number code cannot be zero")
							.end();
					} 
					return;
				} else {
					
					/* 
					Do nothing */
					ctx.getWsMiscStorage().setFlgEditUsPhonecIsvalid(true);
				}
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgEditUsPhonecNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(": Line number code must be A 4 digit number.")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editAreaCode1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAreaCode1(final CoactupcContext ctx, final ExecutionController ctrl) {
		editAreaCode2(ctx, ctrl);
		if (DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditUsPhoneNumbReference()) || DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditUsPhoneNumbReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgEditUsPhonebBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(": Prefix code must be supplied.")
					.end();
			} 
			return;
		} else {
			
			/* 
			Do nothing */
			if (DataUtils.isNumeric(ctx.getWsMiscStorage().getWsEditUsPhoneNumbReference())) {
				
				/* 
				Do nothing */
				if (NumberUtils.eq(ctx.getWsMiscStorage().getWsEditUsPhoneNumbNReference(), 0)) {
					ctx.getWsMiscStorage().setInputError(true);
					ctx.getWsMiscStorage().setFlgEditUsPhonebNotOk(true);
					if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
						StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
							.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
							.addDelimitedBySize(": Prefix code cannot be zero")
							.end();
					} 
					return;
				} else {
					
					/* 
					Do nothing */
					ctx.getWsMiscStorage().setFlgEditUsPhonebIsvalid(true);
				}
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgEditUsPhonebNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(": Prefix code must be A 3 digit number.")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editAreaCode2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editAreaCode2(final CoactupcContext ctx, final ExecutionController ctrl) {
		if (DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditUsPhoneNumaReference()) || DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditUsPhoneNumaReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgEditUsPhoneaBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(": Area code must be supplied.")
					.end();
			} 
			return;
		} else {
			
			/* 
			Do nothing */
			if (DataUtils.isNumeric(ctx.getWsMiscStorage().getWsEditUsPhoneNumaReference())) {
				
				/* 
				Do nothing */
				if (NumberUtils.eq(ctx.getWsMiscStorage().getWsEditUsPhoneNumaNReference(), 0)) {
					ctx.getWsMiscStorage().setInputError(true);
					ctx.getWsMiscStorage().setFlgEditUsPhoneaNotOk(true);
					if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
						StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
							.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
							.addDelimitedBySize(": Area code cannot be zero")
							.end();
					} 
					return;
				} else {
					
					/* 
					Do nothing */
					ctx.getWsUsPhoneAreaCodeToEdit().setWsUsPhoneAreaCodeToEdit(ctx.getWsMiscStorage().getWsEditUsPhoneNuma().trim());
					if (ctx.getWsUsPhoneAreaCodeToEdit().isValidGeneralPurpCode()) {
						
						/* 
						Do nothing */
						ctx.getWsMiscStorage().setFlgEditUsPhoneaIsvalid(true);
					} else {
						ctx.getWsMiscStorage().setInputError(true);
						ctx.getWsMiscStorage().setFlgEditUsPhoneaNotOk(true);
						if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
							StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
								.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
								.addDelimitedBySize(": Not valid North America general purpose area code")
								.end();
						} 
						return;
					}
				}
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgEditUsPhoneaNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(": Area code must be A 3 digit number.")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editUsSsn.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editUsSsn(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		Format xxx-xx-xxxx
		Part1 :should have 3 digits
		Part2 :should have 2 digits and it should be from 01 to 99
		Part3 should have 4 digits from 0001 to 9999.
		****************************************************************
		Edit SSN Part 1
		**************************************************************** */
		ctx.getWsMiscStorage().setWsEditVariableName("SSN: First 3 chars");
		ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustSsn1());
		ctx.getWsMiscStorage().setWsEditAlphanumLength(3);
		editNumReqd(ctx, ctrl);
		ctx.getWsMiscStorage().getWsEditUsSsnPart1FlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyFlagsReference());
		
		/* 
		Part1 :should not be 000, 666, or between 900 and 999 */
		if (ctx.getWsMiscStorage().isFlgEditUsSsnPart1Isvalid()) {
			ctx.getWsMiscStorage().getWsEditUsSsnPart1Reference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustSsn1Reference());
			if (ctx.getWsMiscStorage().isInvalidSsnPart1()) {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgEditUsSsnPart1NotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(": should not be 000, 666, or between 900 and 999")
						.end();
				} else {
					
					/* 
					Do nothing */
				}
			} 
			
			/* 
			****************************************************************
			Edit SSN Part 2
			**************************************************************** */
			ctx.getWsMiscStorage().setWsEditVariableName("SSN 4th & 5th chars");
			ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustSsn2());
			ctx.getWsMiscStorage().setWsEditAlphanumLength(2);
			editNumReqd(ctx, ctrl);
			ctx.getWsMiscStorage().getWsEditUsSsnPart2FlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyFlagsReference());
			
			/* 
			****************************************************************
			Edit SSN Part 3
			**************************************************************** */
			ctx.getWsMiscStorage().setWsEditVariableName("SSN Last 4 chars");
			ctx.getWsMiscStorage().setWsEditAlphanumOnly(ctx.getWsThisProgcommarea().getAcupNewCustSsn3());
			ctx.getWsMiscStorage().setWsEditAlphanumLength(4);
			editNumReqd(ctx, ctrl);
			ctx.getWsMiscStorage().getWsEditUsSsnPart3FlgsReference().setValue(ctx.getWsMiscStorage().getWsEditAlphanumOnlyFlagsReference());
		}
	}

	/**
	 * Process operation editUsStateCd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editUsStateCd(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getUsStateCodeToEdit().getUsStateCodeToEditReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrStateCdReference());
		if (ctx.getUsStateCodeToEdit().isValidUsStateCode()) {
			
			/* 
			Do nothing */
			return;
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgStateNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(": is not a valid state code")
					.end();
			} 
			return;
		}
	}

	/**
	 * Process operation editFicoScore.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editFicoScore(final CoactupcContext ctx, final ExecutionController ctrl) {
		if (ctx.getWsThisProgcommarea().isFicoRangeIsValid()) {
			
			/* 
			Do nothing */
			return;
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgFicoScoreNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(": should be between 300 and 850")
					.end();
			} 
			return;
		}
	}

	/**
	 * Process operation editUsStateZipCd.
	 * 
	 * A crude zip code edit based on data from USPS web site
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editUsStateZipCd(final CoactupcContext ctx, final ExecutionController ctrl) {
		StringConcatenationBuilder.newInstance(ctx.getUsStateZipcodeToEdit().getUsStateAndFirstZip2Reference())
			.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustAddrStateCdReference().getBytes())
			.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustAddrZipReference().getBytes(0, 2))
			.end();
		if (ctx.getUsStateZipcodeToEdit().isValidUsStateZipCd2Combo()) {
			
			/* 
			Do nothing */
			return;
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgStateNotOk(true);
			ctx.getWsMiscStorage().setFlgZipcodeNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize("Invalid zip code for state")
					.end();
			} 
			return;
		}
	}

	/**
	 * Process operation sendMap.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendMap(final CoactupcContext ctx, final ExecutionController ctrl) {
		screenInit(ctx, ctrl);
		setupScreenVars(ctx, ctrl);
		setupInfomsg(ctx, ctrl);
		setupScreenAttrs(ctx, ctrl);
		setupInfomsgAttrs(ctx, ctrl);
		sendScreen(ctx, ctrl);
	}

	/**
	 * Process operation screenInit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void screenInit(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().getCactupaoReference().setBytes(Record.LOW_VALUES);
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
	public void setupScreenVars(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		INITIALIZE SEARCH CRITERIA */
		if (ctx.getCarddemoCommarea().isCdemoPgmEnter()) {
			
			/* 
			Do nothing */
		} else {
			if (NumberUtils.eq(ctx.getCcWorkAreas().getCcAcctIdNReference(), 0) && ctx.getWsMiscStorage().isFlgAcctfilterIsvalid()) {
				ctx.getGroup1().getAcctsidoReference().setBytes(Record.LOW_VALUES);
			} else {
				ctx.getGroup1().getAcctsidoReference().setValue(ctx.getCcWorkAreas().getCcAcctIdReference());
			}
			if (ctx.getWsThisProgcommarea().isAcupDetailsNotFetched() || NumberUtils.eq(ctx.getCcWorkAreas().getCcAcctIdNReference(), 0)) {
				showInitialValues(ctx, ctrl);
			} else if (ctx.getWsThisProgcommarea().isAcupShowDetails()) {
				showOriginalValues(ctx, ctrl);
			} else if (ctx.getWsThisProgcommarea().isAcupChangesMade()) {
				showUpdatedValues(ctx, ctrl);
			} else {
				showOriginalValues(ctx, ctrl);
			}
		}
	}

	/**
	 * Process operation showInitialValues.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void showInitialValues(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().getAcsttusoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcrdlimoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcurbaloReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcshlimoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcrcycroReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcrcydboReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getOpnyearoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getOpnmonoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getOpndayoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getExpyearoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getExpmonoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getExpdayoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getRisyearoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getRismonoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getRisdayoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAaddgrpoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcstnumoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getActssn1oReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getActssn2oReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getActssn3oReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcstfcooReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getDobyearoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getDobmonoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getDobdayoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsfnamoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsmnamoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcslnamoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsadl1oReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsadl2oReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcscityoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsstteoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcszipcoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsctryoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsph1aoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsph1boReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsph1coReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsph2aoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsph2boReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsph2coReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcsgovtoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcseftcoReference().setBytes(Record.LOW_VALUES);
		ctx.getGroup1().getAcspflgoReference().setBytes(Record.LOW_VALUES);
		
		/* 
		Account Limits
		Account Dates
		Customer data
		Customer address and contact info
		Customer other good stuff */
		return;
	}

	/**
	 * Process operation showOriginalValues.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void showOriginalValues(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().getWsNonKeyFlagsReference().setBytes(Record.LOW_VALUES);
		ctx.getWsMiscStorage().setPromptForChanges(true);
		if (ctx.getWsMiscStorage().isFoundAcctInMaster() || ctx.getWsMiscStorage().isFoundCustInMaster()) {
			ctx.getGroup1().getAcsttusoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldActiveStatusReference());
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCurrBalN());
			ctx.getGroup1().setAcurbalo(ctx.getWsMiscStorage().getWsEditCurrency92F());
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCreditLimitN());
			ctx.getGroup1().setAcrdlimo(ctx.getWsMiscStorage().getWsEditCurrency92F());
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCashCreditLimitN());
			ctx.getGroup1().setAcshlimo(ctx.getWsMiscStorage().getWsEditCurrency92F());
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCurrCycCreditN());
			ctx.getGroup1().setAcrcycro(ctx.getWsMiscStorage().getWsEditCurrency92F());
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCurrCycDebitN());
			ctx.getGroup1().setAcrcydbo(ctx.getWsMiscStorage().getWsEditCurrency92F());
			ctx.getGroup1().getOpnyearoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldOpenYearReference());
			ctx.getGroup1().getOpnmonoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldOpenMonReference());
			ctx.getGroup1().getOpndayoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldOpenDayReference());
			ctx.getGroup1().getExpyearoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldExpYearReference());
			ctx.getGroup1().getExpmonoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldExpMonReference());
			ctx.getGroup1().getExpdayoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldExpDayReference());
			ctx.getGroup1().getRisyearoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldReissueYearReference());
			ctx.getGroup1().getRismonoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldReissueMonReference());
			ctx.getGroup1().getRisdayoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldReissueDayReference());
			ctx.getGroup1().getAaddgrpoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldGroupIdReference());
		} 
		if (ctx.getWsMiscStorage().isFoundCustInMaster()) {
			ctx.getGroup1().getAcstnumoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustIdXReference());
			ctx.getGroup1().getActssn1oReference().setBytes(ctx.getWsThisProgcommarea().getAcupOldCustSsnXReference().getBytes(0, 3));
			ctx.getGroup1().getActssn2oReference().setBytes(ctx.getWsThisProgcommarea().getAcupOldCustSsnXReference().getBytes(3, 2));
			ctx.getGroup1().getActssn3oReference().setBytes(ctx.getWsThisProgcommarea().getAcupOldCustSsnXReference().getBytes(5, 4));
			ctx.getGroup1().getAcstfcooReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustFicoScoreXReference());
			ctx.getGroup1().getDobyearoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustDobYearReference());
			ctx.getGroup1().getDobmonoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustDobMonReference());
			ctx.getGroup1().getDobdayoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustDobDayReference());
			ctx.getGroup1().getAcsfnamoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustFirstNameReference());
			ctx.getGroup1().getAcsmnamoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustMiddleNameReference());
			ctx.getGroup1().getAcslnamoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustLastNameReference());
			ctx.getGroup1().getAcsadl1oReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustAddrLine1Reference());
			ctx.getGroup1().getAcsadl2oReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustAddrLine2Reference());
			ctx.getGroup1().getAcscityoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustAddrLine3Reference());
			ctx.getGroup1().getAcsstteoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustAddrStateCdReference());
			ctx.getGroup1().setAcszipco(ctx.getWsThisProgcommarea().getAcupOldCustAddrZip());
			ctx.getGroup1().getAcsctryoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustAddrCountryCdReference());
			ctx.getGroup1().getAcsph1aoReference().setBytes(ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum1Reference().getBytes(1, 3));
			ctx.getGroup1().getAcsph1boReference().setBytes(ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum1Reference().getBytes(5, 3));
			ctx.getGroup1().getAcsph1coReference().setBytes(ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum1Reference().getBytes(9, 4));
			ctx.getGroup1().getAcsph2aoReference().setBytes(ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum2Reference().getBytes(1, 3));
			ctx.getGroup1().getAcsph2boReference().setBytes(ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum2Reference().getBytes(5, 3));
			ctx.getGroup1().getAcsph2coReference().setBytes(ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum2Reference().getBytes(9, 4));
			ctx.getGroup1().getAcsgovtoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustGovtIssuedIdReference());
			ctx.getGroup1().getAcseftcoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustEftAccountIdReference());
			ctx.getGroup1().getAcspflgoReference().setValue(ctx.getWsThisProgcommarea().getAcupOldCustPriHolderIndReference());
		}
	}

	/**
	 * Process operation showUpdatedValues.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void showUpdatedValues(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().getAcsttusoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewActiveStatusReference());
		if (ctx.getWsMiscStorage().isFlgCredLimitIsvalid()) {
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCreditLimitN());
			ctx.getGroup1().setAcrdlimo(ctx.getWsMiscStorage().getWsEditCurrency92F());
		} else {
			ctx.getGroup1().getAcrdlimoReference().setValue(ctx.getWsMiscStorage().getAcupNewCreditLimitXReference());
		}
		if (ctx.getWsMiscStorage().isFlgCashCreditLimitIsvalid()) {
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCashCreditLimitN());
			ctx.getGroup1().setAcshlimo(ctx.getWsMiscStorage().getWsEditCurrency92F());
		} else {
			ctx.getGroup1().getAcshlimoReference().setValue(ctx.getWsMiscStorage().getAcupNewCashCreditLimitXReference());
		}
		if (ctx.getWsMiscStorage().isFlgCurrBalIsvalid()) {
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCurrBalN());
			ctx.getGroup1().setAcurbalo(ctx.getWsMiscStorage().getWsEditCurrency92F());
		} else {
			ctx.getGroup1().getAcurbaloReference().setValue(ctx.getWsMiscStorage().getAcupNewCurrBalXReference());
		}
		if (ctx.getWsMiscStorage().isFlgCurrCycCreditIsvalid()) {
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCurrCycCreditN());
			ctx.getGroup1().setAcrcycro(ctx.getWsMiscStorage().getWsEditCurrency92F());
		} else {
			ctx.getGroup1().getAcrcycroReference().setValue(ctx.getWsMiscStorage().getAcupNewCurrCycCreditXReference());
		}
		if (ctx.getWsMiscStorage().isFlgCurrCycDebitIsvalid()) {
			ctx.getWsMiscStorage().getWsEditCurrency92FReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCurrCycDebitN());
			ctx.getGroup1().setAcrcydbo(ctx.getWsMiscStorage().getWsEditCurrency92F());
		} else {
			ctx.getGroup1().getAcrcydboReference().setValue(ctx.getWsMiscStorage().getAcupNewCurrCycDebitXReference());
		}
		ctx.getGroup1().getOpnyearoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewOpenYearReference());
		ctx.getGroup1().getOpnmonoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewOpenMonReference());
		ctx.getGroup1().getOpndayoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewOpenDayReference());
		ctx.getGroup1().getExpyearoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewExpYearReference());
		ctx.getGroup1().getExpmonoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewExpMonReference());
		ctx.getGroup1().getExpdayoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewExpDayReference());
		ctx.getGroup1().getRisyearoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewReissueYearReference());
		ctx.getGroup1().getRismonoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewReissueMonReference());
		ctx.getGroup1().getRisdayoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewReissueDayReference());
		ctx.getGroup1().getAaddgrpoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewGroupIdReference());
		ctx.getGroup1().getAcstnumoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustIdXReference());
		ctx.getGroup1().getActssn1oReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustSsn1Reference());
		ctx.getGroup1().getActssn2oReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustSsn2Reference());
		ctx.getGroup1().getActssn3oReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustSsn3Reference());
		ctx.getGroup1().getAcstfcooReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustFicoScoreXReference());
		ctx.getGroup1().getDobyearoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustDobYearReference());
		ctx.getGroup1().getDobmonoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustDobMonReference());
		ctx.getGroup1().getDobdayoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustDobDayReference());
		ctx.getGroup1().getAcsfnamoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustFirstNameReference());
		ctx.getGroup1().getAcsmnamoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustMiddleNameReference());
		ctx.getGroup1().getAcslnamoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustLastNameReference());
		ctx.getGroup1().getAcsadl1oReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine1Reference());
		ctx.getGroup1().getAcsadl2oReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine2Reference());
		ctx.getGroup1().getAcscityoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine3Reference());
		ctx.getGroup1().getAcsstteoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrStateCdReference());
		ctx.getGroup1().setAcszipco(ctx.getWsThisProgcommarea().getAcupNewCustAddrZip());
		ctx.getGroup1().getAcsctryoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrCountryCdReference());
		ctx.getGroup1().getAcsph1aoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1aReference());
		ctx.getGroup1().getAcsph1boReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1bReference());
		ctx.getGroup1().getAcsph1coReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1cReference());
		ctx.getGroup1().getAcsph2aoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2aReference());
		ctx.getGroup1().getAcsph2boReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2bReference());
		ctx.getGroup1().getAcsph2coReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2cReference());
		ctx.getGroup1().getAcsgovtoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustGovtIssuedIdReference());
		ctx.getGroup1().getAcseftcoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustEftAccountIdReference());
		ctx.getGroup1().getAcspflgoReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPriHolderIndReference());
	}

	/**
	 * Process operation setupInfomsg.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupInfomsg(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		SETUP INFORMATION MESSAGE */
		if (ctx.getCarddemoCommarea().isCdemoPgmEnter()) {
			ctx.getWsMiscStorage().setPromptForSearchKeys(true);
		} else if (ctx.getWsThisProgcommarea().isAcupDetailsNotFetched()) {
			ctx.getWsMiscStorage().setPromptForSearchKeys(true);
		} else if (ctx.getWsThisProgcommarea().isAcupShowDetails()) {
			ctx.getWsMiscStorage().setPromptForChanges(true);
		} else if (ctx.getWsThisProgcommarea().isAcupChangesNotOk()) {
			ctx.getWsMiscStorage().setPromptForChanges(true);
		} else if (ctx.getWsThisProgcommarea().isAcupChangesOkNotConfirmed()) {
			ctx.getWsMiscStorage().setPromptForConfirmation(true);
		} else if (ctx.getWsThisProgcommarea().isAcupChangesOkayedAndDone()) {
			ctx.getWsMiscStorage().setConfirmUpdateSuccess(true);
		} else if (ctx.getWsThisProgcommarea().isAcupChangesOkayedLockError()) {
			ctx.getWsMiscStorage().setInformFailure(true);
		} else if (ctx.getWsThisProgcommarea().isAcupChangesOkayedButFailed()) {
			ctx.getWsMiscStorage().setInformFailure(true);
		} else if (ctx.getWsMiscStorage().isWsNoInfoMessage()) {
			ctx.getWsMiscStorage().setPromptForSearchKeys(true);
		} 
		ctx.getGroup1().setInfomsgo(ctx.getWsMiscStorage().getWsInfoMsg());
		ctx.getGroup1().setErrmsgo(ctx.getWsMiscStorage().getWsReturnMsg());
	}

	/**
	 * Process operation setupScreenAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupScreenAttrs(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		PROTECT ALL FIELDS */
		protectAllAttrs(ctx, ctrl);
		
		/* 
		UNPROTECT BASED ON CONTEXT */
		if (ctx.getWsThisProgcommarea().isAcupDetailsNotFetched()) {
			
			/* 
			Make Account Id editable */
			ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		} else if (ctx.getWsThisProgcommarea().isAcupShowDetails() || ctx.getWsThisProgcommarea().isAcupChangesNotOk()) {
			unprotectFewAttrs(ctx, ctrl);
		} else if (ctx.getWsThisProgcommarea().isAcupChangesOkNotConfirmed() || ctx.getWsThisProgcommarea().isAcupChangesOkayedAndDone()) {
			
			/* 
			Do nothing */
		} else {
			ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		}
		
		/* 
		POSITION CURSOR - ORDER BASED ON SCREEN LOCATION */
		if (ctx.getWsMiscStorage().isFoundAccountData() || ctx.getWsMiscStorage().isNoChangesDetected()) {
			ctx.getGroup1().setAcsttusl(-1);
		} else if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk() || ctx.getWsMiscStorage().isFlgAcctfilterBlank()) {
			ctx.getGroup1().setAcctsidl(-1);
			
			/* 
			Account Status */
		} else if (ctx.getWsMiscStorage().isFlgAcctStatusNotOk() || ctx.getWsMiscStorage().isFlgAcctStatusBlank()) {
			ctx.getGroup1().setAcsttusl(-1);
			
			/* 
			Open Year */
		} else if (ctx.getWsMiscStorage().isFlgOpenYearNotOk() || ctx.getWsMiscStorage().isFlgOpenYearBlank()) {
			ctx.getGroup1().setOpnyearl(-1);
			
			/* 
			Open Month */
		} else if (ctx.getWsMiscStorage().isFlgOpenMonthNotOk() || ctx.getWsMiscStorage().isFlgOpenMonthBlank()) {
			ctx.getGroup1().setOpnmonl(-1);
			
			/* 
			Open Day */
		} else if (ctx.getWsMiscStorage().isFlgOpenDayNotOk() || ctx.getWsMiscStorage().isFlgOpenDayBlank()) {
			ctx.getGroup1().setOpndayl(-1);
			
			/* 
			Credit Limit */
		} else if (ctx.getWsMiscStorage().isFlgCredLimitNotOk() || ctx.getWsMiscStorage().isFlgCredLimitBlank()) {
			ctx.getGroup1().setAcrdliml(-1);
			
			/* 
			Expiry Year */
		} else if (ctx.getWsMiscStorage().isFlgExpiryYearNotOk() || ctx.getWsMiscStorage().isFlgExpiryYearBlank()) {
			ctx.getGroup1().setExpyearl(-1);
			
			/* 
			Expiry Month */
		} else if (ctx.getWsMiscStorage().isFlgExpiryMonthNotOk() || ctx.getWsMiscStorage().isFlgExpiryMonthBlank()) {
			ctx.getGroup1().setExpmonl(-1);
			
			/* 
			Expiry Day */
		} else if (ctx.getWsMiscStorage().isFlgExpiryDayNotOk() || ctx.getWsMiscStorage().isFlgExpiryDayBlank()) {
			ctx.getGroup1().setExpdayl(-1);
			
			/* 
			Cash credit limit */
		} else if (ctx.getWsMiscStorage().isFlgCashCreditLimitNotOk() || ctx.getWsMiscStorage().isFlgCashCreditLimitBlank()) {
			ctx.getGroup1().setAcshliml(-1);
			
			/* 
			Reissue Year */
		} else if (ctx.getWsMiscStorage().isFlgReissueYearNotOk() || ctx.getWsMiscStorage().isFlgReissueYearBlank()) {
			ctx.getGroup1().setRisyearl(-1);
			
			/* 
			Expiry Month */
		} else if (ctx.getWsMiscStorage().isFlgReissueMonthNotOk() || ctx.getWsMiscStorage().isFlgReissueMonthBlank()) {
			ctx.getGroup1().setRismonl(-1);
			
			/* 
			Expiry Day */
		} else if (ctx.getWsMiscStorage().isFlgReissueDayNotOk() || ctx.getWsMiscStorage().isFlgReissueDayBlank()) {
			ctx.getGroup1().setRisdayl(-1);
			
			/* 
			Current Balance */
		} else if (ctx.getWsMiscStorage().isFlgCurrBalNotOk() || ctx.getWsMiscStorage().isFlgCurrBalBlank()) {
			ctx.getGroup1().setAcurball(-1);
			
			/* 
			Current Cycle Credit */
		} else if (ctx.getWsMiscStorage().isFlgCurrCycCreditNotOk() || ctx.getWsMiscStorage().isFlgCurrCycCreditBlank()) {
			ctx.getGroup1().setAcrcycrl(-1);
			
			/* 
			Current Cycle Debit */
		} else if (ctx.getWsMiscStorage().isFlgCurrCycDebitNotOk() || ctx.getWsMiscStorage().isFlgCurrCycDebitBlank()) {
			ctx.getGroup1().setAcrcydbl(-1);
			
			/* 
			SSN Part 1 */
		} else if (ctx.getWsMiscStorage().isFlgEditUsSsnPart1NotOk() || ctx.getWsMiscStorage().isFlgEditUsSsnPart1Blank()) {
			ctx.getGroup1().setActssn1l(-1);
			
			/* 
			SSN Part 2 */
		} else if (ctx.getWsMiscStorage().isFlgEditUsSsnPart2NotOk() || ctx.getWsMiscStorage().isFlgEditUsSsnPart2Blank()) {
			ctx.getGroup1().setActssn2l(-1);
			
			/* 
			SSN Part 3 */
		} else if (ctx.getWsMiscStorage().isFlgEditUsSsnPart3NotOk() || ctx.getWsMiscStorage().isFlgEditUsSsnPart3Blank()) {
			ctx.getGroup1().setActssn3l(-1);
			
			/* 
			Date of Birth Year */
		} else if (ctx.getWsMiscStorage().isFlgDtOfBirthYearNotOk() || ctx.getWsMiscStorage().isFlgDtOfBirthYearBlank()) {
			ctx.getGroup1().setDobyearl(-1);
			
			/* 
			Date of Birth Month */
		} else if (ctx.getWsMiscStorage().isFlgDtOfBirthMonthNotOk() || ctx.getWsMiscStorage().isFlgDtOfBirthMonthBlank()) {
			ctx.getGroup1().setDobmonl(-1);
			
			/* 
			Date of Birth Day */
		} else if (ctx.getWsMiscStorage().isFlgDtOfBirthDayNotOk() || ctx.getWsMiscStorage().isFlgDtOfBirthDayBlank()) {
			ctx.getGroup1().setDobdayl(-1);
			
			/* 
			FICO Score */
		} else if (ctx.getWsMiscStorage().isFlgFicoScoreNotOk() || ctx.getWsMiscStorage().isFlgFicoScoreBlank()) {
			ctx.getGroup1().setAcstfcol(-1);
			
			/* 
			First Name */
		} else if (ctx.getWsMiscStorage().isFlgFirstNameNotOk() || ctx.getWsMiscStorage().isFlgFirstNameBlank()) {
			ctx.getGroup1().setAcsfnaml(-1);
			
			/* 
			Middle Name */
		} else if (ctx.getWsMiscStorage().isFlgMiddleNameNotOk()) {
			ctx.getGroup1().setAcsmnaml(-1);
			
			/* 
			Last Name */
		} else if (ctx.getWsMiscStorage().isFlgLastNameNotOk() || ctx.getWsMiscStorage().isFlgLastNameBlank()) {
			ctx.getGroup1().setAcslnaml(-1);
			
			/* 
			Address Line 1 */
		} else if (ctx.getWsMiscStorage().isFlgAddressLine1NotOk() || ctx.getWsMiscStorage().isFlgAddressLine1Blank()) {
			ctx.getGroup1().setAcsadl1l(-1);
			
			/* 
			State (appears next to Line 2 on screen before city) */
		} else if (ctx.getWsMiscStorage().isFlgStateNotOk() || ctx.getWsMiscStorage().isFlgStateBlank()) {
			ctx.getGroup1().setAcssttel(-1);
			
			/* 
			Address Line 2 has no edits
			Zip code */
		} else if (ctx.getWsMiscStorage().isFlgZipcodeNotOk() || ctx.getWsMiscStorage().isFlgZipcodeBlank()) {
			ctx.getGroup1().setAcszipcl(-1);
			
			/* 
			Address Line 3 (City) */
		} else if (ctx.getWsMiscStorage().isFlgCityNotOk() || ctx.getWsMiscStorage().isFlgCityBlank()) {
			ctx.getGroup1().setAcscityl(-1);
			
			/* 
			Country edits. */
		} else if (ctx.getWsMiscStorage().isFlgCountryNotOk() || ctx.getWsMiscStorage().isFlgCountryBlank()) {
			ctx.getGroup1().setAcsctryl(-1);
			
			/* 
			Phone 1 */
		} else if (ctx.getWsMiscStorage().isFlgPhoneNum1aNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum1aBlank()) {
			ctx.getGroup1().setAcsph1al(-1);
		} else if (ctx.getWsMiscStorage().isFlgPhoneNum1bNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum1bBlank()) {
			ctx.getGroup1().setAcsph1bl(-1);
		} else if (ctx.getWsMiscStorage().isFlgPhoneNum1cNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum1cBlank()) {
			ctx.getGroup1().setAcsph1cl(-1);
			
			/* 
			Phone 2 */
		} else if (ctx.getWsMiscStorage().isFlgPhoneNum2aNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum2aBlank()) {
			ctx.getGroup1().setAcsph2al(-1);
		} else if (ctx.getWsMiscStorage().isFlgPhoneNum2bNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum2bBlank()) {
			ctx.getGroup1().setAcsph2bl(-1);
		} else if (ctx.getWsMiscStorage().isFlgPhoneNum2cNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum2cBlank()) {
			ctx.getGroup1().setAcsph2cl(-1);
			
			/* 
			EFT Account Id */
		} else if (ctx.getWsMiscStorage().isFlgEftAccountIdNotOk() || ctx.getWsMiscStorage().isFlgEftAccountIdBlank()) {
			ctx.getGroup1().setAcseftcl(-1);
			
			/* 
			Primary Card Holder */
		} else if (ctx.getWsMiscStorage().isFlgPriCardholderNotOk() || ctx.getWsMiscStorage().isFlgPriCardholderBlank()) {
			ctx.getGroup1().setAcspflgl(-1);
		} else {
			ctx.getGroup1().setAcctsidl(-1);
		}
		
		/* 
		SETUP COLOR */
		if (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoLastMapsetReference(), ctx.getWsLiterals().getLitCclistmapsetReference()) == 0) {
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhdfcolReference());
		} 
		
		/* 
		Account Filter */
		if (ctx.getWsMiscStorage().isFlgAcctfilterNotOk()) {
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsMiscStorage().isFlgAcctfilterBlank() && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
			ctx.getGroup1().setAcctsido("*");
			ctx.getGroup1().getAcctsidcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
		} 
		if (ctx.getWsThisProgcommarea().isAcupDetailsNotFetched() || ctx.getWsMiscStorage().isFlgAcctfilterBlank() || ctx.getWsMiscStorage().isFlgAcctfilterNotOk()) {
			return;
		} else {
			
			/* 
			****************************************************************
			Using Copy replacing to set attribs for remaining vars
			Write specific code only if rules differ
			****************************************************************
			IF (FLG-ACCT-STATUS-NOT-OK
			OR  FLG-ACCT-STATUS-BLANK)
			AND CDEMO-PGM-REENTER
			MOVE DFHRED             TO ACSTTUSC OF CACTUPAO
			IF  FLG-ACCT-STATUS-BLANK
			MOVE '*'            TO ACSTTUSO OF CACTUPAO
			END-IF
			END-IF
			Account Status
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set ACCT-STATUS to red if in error and * if blankACSHLIM
			Do nothing */
			if ((ctx.getWsMiscStorage().isFlgAcctStatusNotOk() || ctx.getWsMiscStorage().isFlgAcctStatusBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsttuscReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgAcctStatusBlank()) {
					ctx.getGroup1().setAcsttuso("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Open Year
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set OPEN-YEAR to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgOpenYearNotOk() || ctx.getWsMiscStorage().isFlgOpenYearBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getOpnyearcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgOpenYearBlank()) {
					ctx.getGroup1().setOpnyearo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Open Month
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set OPEN-MONTH to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgOpenMonthNotOk() || ctx.getWsMiscStorage().isFlgOpenMonthBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getOpnmoncReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgOpenMonthBlank()) {
					ctx.getGroup1().setOpnmono("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Open Day
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set OPEN-DAY to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgOpenDayNotOk() || ctx.getWsMiscStorage().isFlgOpenDayBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getOpndaycReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgOpenDayBlank()) {
					ctx.getGroup1().setOpndayo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Credit Limit
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set CRED-LIMIT to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgCredLimitNotOk() || ctx.getWsMiscStorage().isFlgCredLimitBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcrdlimcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgCredLimitBlank()) {
					ctx.getGroup1().setAcrdlimo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Expiry Year
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set EXPIRY-YEAR to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgExpiryYearNotOk() || ctx.getWsMiscStorage().isFlgExpiryYearBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getExpyearcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgExpiryYearBlank()) {
					ctx.getGroup1().setExpyearo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Expiry Month
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set EXPIRY-MONTH to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgExpiryMonthNotOk() || ctx.getWsMiscStorage().isFlgExpiryMonthBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getExpmoncReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgExpiryMonthBlank()) {
					ctx.getGroup1().setExpmono("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Expiry Day
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set EXPIRY-DAY to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgExpiryDayNotOk() || ctx.getWsMiscStorage().isFlgExpiryDayBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getExpdaycReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgExpiryDayBlank()) {
					ctx.getGroup1().setExpdayo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Cash Credit Limit
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set CASH-CREDIT-LIMIT to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgCashCreditLimitNotOk() || ctx.getWsMiscStorage().isFlgCashCreditLimitBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcshlimcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgCashCreditLimitBlank()) {
					ctx.getGroup1().setAcshlimo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Reissue Year
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set REISSUE-YEAR to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgReissueYearNotOk() || ctx.getWsMiscStorage().isFlgReissueYearBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getRisyearcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgReissueYearBlank()) {
					ctx.getGroup1().setRisyearo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Reissue Month
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set REISSUE-MONTH to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgReissueMonthNotOk() || ctx.getWsMiscStorage().isFlgReissueMonthBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getRismoncReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgReissueMonthBlank()) {
					ctx.getGroup1().setRismono("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Reissue Day
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set REISSUE-DAY to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgReissueDayNotOk() || ctx.getWsMiscStorage().isFlgReissueDayBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getRisdaycReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgReissueDayBlank()) {
					ctx.getGroup1().setRisdayo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Current Balance
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set CURR-BAL to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgCurrBalNotOk() || ctx.getWsMiscStorage().isFlgCurrBalBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcurbalcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgCurrBalBlank()) {
					ctx.getGroup1().setAcurbalo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Current Cycle Credit
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set CURR-CYC-CREDIT to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgCurrCycCreditNotOk() || ctx.getWsMiscStorage().isFlgCurrCycCreditBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcrcycrcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgCurrCycCreditBlank()) {
					ctx.getGroup1().setAcrcycro("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Current Cycle Debit
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set CURR-CYC-DEBIT to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgCurrCycDebitNotOk() || ctx.getWsMiscStorage().isFlgCurrCycDebitBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcrcydbcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgCurrCycDebitBlank()) {
					ctx.getGroup1().setAcrcydbo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			SSN Part 1
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set EDIT-US-SSN-PART1 to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgEditUsSsnPart1NotOk() || ctx.getWsMiscStorage().isFlgEditUsSsnPart1Blank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getActssn1cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgEditUsSsnPart1Blank()) {
					ctx.getGroup1().setActssn1o("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			SSN Part 2
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set EDIT-US-SSN-PART2 to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgEditUsSsnPart2NotOk() || ctx.getWsMiscStorage().isFlgEditUsSsnPart2Blank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getActssn2cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgEditUsSsnPart2Blank()) {
					ctx.getGroup1().setActssn2o("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			SSN Part 3
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set EDIT-US-SSN-PART3 to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgEditUsSsnPart3NotOk() || ctx.getWsMiscStorage().isFlgEditUsSsnPart3Blank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getActssn3cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgEditUsSsnPart3Blank()) {
					ctx.getGroup1().setActssn3o("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Date of Birth Year
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set DT-OF-BIRTH-YEAR to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgDtOfBirthYearNotOk() || ctx.getWsMiscStorage().isFlgDtOfBirthYearBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getDobyearcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgDtOfBirthYearBlank()) {
					ctx.getGroup1().setDobyearo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Date of Birth Month
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set DT-OF-BIRTH-MONTH to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgDtOfBirthMonthNotOk() || ctx.getWsMiscStorage().isFlgDtOfBirthMonthBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getDobmoncReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgDtOfBirthMonthBlank()) {
					ctx.getGroup1().setDobmono("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Date of Birth Day
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set DT-OF-BIRTH-DAY to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgDtOfBirthDayNotOk() || ctx.getWsMiscStorage().isFlgDtOfBirthDayBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getDobdaycReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgDtOfBirthDayBlank()) {
					ctx.getGroup1().setDobdayo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			FICO Score
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set FICO-SCORE to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgFicoScoreNotOk() || ctx.getWsMiscStorage().isFlgFicoScoreBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcstfcocReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgFicoScoreBlank()) {
					ctx.getGroup1().setAcstfcoo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			First Name
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set FIRST-NAME to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgFirstNameNotOk() || ctx.getWsMiscStorage().isFlgFirstNameBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsfnamcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgFirstNameBlank()) {
					ctx.getGroup1().setAcsfnamo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Middle Name (no edits coded)
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set MIDDLE-NAME to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgMiddleNameNotOk() || ctx.getWsMiscStorage().isFlgMiddleNameBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsmnamcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgMiddleNameBlank()) {
					ctx.getGroup1().setAcsmnamo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Last Name
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set LAST-NAME to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgLastNameNotOk() || ctx.getWsMiscStorage().isFlgLastNameBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcslnamcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgLastNameBlank()) {
					ctx.getGroup1().setAcslnamo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Address Line 1
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set ADDRESS-LINE-1 to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgAddressLine1NotOk() || ctx.getWsMiscStorage().isFlgAddressLine1Blank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsadl1cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgAddressLine1Blank()) {
					ctx.getGroup1().setAcsadl1o("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			State
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set STATE to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgStateNotOk() || ctx.getWsMiscStorage().isFlgStateBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcssttecReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgStateBlank()) {
					ctx.getGroup1().setAcsstteo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Address Line 2 (NO EDITS CODED AS YET)
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set ADDRESS-LINE-2 to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgAddressLine2NotOk() || ctx.getWsMiscStorage().isFlgAddressLine2Blank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsadl2cReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgAddressLine2Blank()) {
					ctx.getGroup1().setAcsadl2o("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			State
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set ZIPCODE to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgZipcodeNotOk() || ctx.getWsMiscStorage().isFlgZipcodeBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcszipccReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgZipcodeBlank()) {
					ctx.getGroup1().setAcszipco("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			City
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set CITY to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgCityNotOk() || ctx.getWsMiscStorage().isFlgCityBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcscitycReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgCityBlank()) {
					ctx.getGroup1().setAcscityo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Country
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set COUNTRY to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgCountryNotOk() || ctx.getWsMiscStorage().isFlgCountryBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsctrycReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgCountryBlank()) {
					ctx.getGroup1().setAcsctryo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Phone 1 Area Code
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set PHONE-NUM-1A to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgPhoneNum1aNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum1aBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsph1acReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgPhoneNum1aBlank()) {
					ctx.getGroup1().setAcsph1ao("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Phone 1 Prefix
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set PHONE-NUM-1B to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgPhoneNum1bNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum1bBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsph1bcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgPhoneNum1bBlank()) {
					ctx.getGroup1().setAcsph1bo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Phone 1 Line number
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set PHONE-NUM-1C to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgPhoneNum1cNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum1cBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsph1ccReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgPhoneNum1cBlank()) {
					ctx.getGroup1().setAcsph1co("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Phone 2 Area Code
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set PHONE-NUM-2A to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgPhoneNum2aNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum2aBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsph2acReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgPhoneNum2aBlank()) {
					ctx.getGroup1().setAcsph2ao("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Phone 2 Prefix
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set PHONE-NUM-2B to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgPhoneNum2bNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum2bBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsph2bcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgPhoneNum2bBlank()) {
					ctx.getGroup1().setAcsph2bo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Phone 2 Line number
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set PHONE-NUM-2C to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgPhoneNum2cNotOk() || ctx.getWsMiscStorage().isFlgPhoneNum2cBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcsph2ccReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgPhoneNum2cBlank()) {
					ctx.getGroup1().setAcsph2co("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			EFT Account Id
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set PRI-CARDHOLDER to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgPriCardholderNotOk() || ctx.getWsMiscStorage().isFlgPriCardholderBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcspflgcReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgPriCardholderBlank()) {
					ctx.getGroup1().setAcspflgo("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
			Primary Card Holder
			****************************************************************
			Copyright Amazon.com, Inc. or its affiliates.
			All Rights Reserved.
			Licensed under the Apache License, Version 2.0 (the \"License\").
			You may not use this file except in compliance with the License.
			You may obtain a copy of the License at
			http://www.apache.org/licenses/LICENSE-2.0
			Unless required by applicable law or agreed to in writing,
			software distributed under the License is distributed on an
			\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
			either express or implied. See the License for the specific
			language governing permissions and limitations under the License
			****************************************************************
			Set EFT-ACCOUNT-ID to red if in error and * if blankACSHLIM */
			if ((ctx.getWsMiscStorage().isFlgEftAccountIdNotOk() || ctx.getWsMiscStorage().isFlgEftAccountIdBlank()) && ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
				ctx.getGroup1().getAcseftccReference().setValue(ctx.getDfhbmsca().getDfhredReference());
				if (ctx.getWsMiscStorage().isFlgEftAccountIdBlank()) {
					ctx.getGroup1().setAcseftco("*");
				} 
			} 
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT */
			return;
		}
	}

	/**
	 * Process operation protectAllAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void protectAllAttrs(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().getAcctsidaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsttusaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcrdlimaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcshlimaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcurbalaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcrcycraReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcrcydbaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getOpnyearaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getOpnmonaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getOpndayaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getExpyearaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getExpmonaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getExpdayaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getRisyearaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getRismonaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getRisdayaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAaddgrpaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcstnumaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getActssn1aReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getActssn2aReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getActssn3aReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcstfcoaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getDobyearaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getDobmonaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getDobdayaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsfnamaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsmnamaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcslnamaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsadl1aReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsadl2aReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcscityaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsstteaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcszipcaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsctryaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsph1aaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsph1baReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsph1caReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsph2aaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsph2baReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsph2caReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsgovtaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcseftcaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcspflgaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getInfomsgaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		
		/* 
		Account Limits
		Account dates
		Customer data
		Date of Birth
		Address */
		return;
	}

	/**
	 * Process operation unprotectFewAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void unprotectFewAttrs(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getGroup1().getAcsttusaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcrdlimaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcshlimaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcurbalaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcrcycraReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcrcydbaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getOpnyearaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getOpnmonaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getOpndayaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getExpyearaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getExpmonaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getExpdayaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getRisyearaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getRismonaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getRisdayaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getDobyearaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getDobmonaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getDobdayaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAaddgrpaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		
		/* 
		Account Limits
		Account dates
		Open Date
		Expiry date
		Reissue date
		Date of Birth
		Customer data */
		ctx.getGroup1().getAcstnumaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getActssn1aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getActssn2aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getActssn3aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcstfcoaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsfnamaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsmnamaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcslnamaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsadl1aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsadl2aReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcscityaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsstteaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcszipcaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		
		/* 
		Address
		Since most of the edits are USA specific protected country */
		ctx.getGroup1().getAcsctryaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
		ctx.getGroup1().getAcsph1aaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsph1baReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsph1caReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsph2aaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsph2baReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsph2caReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcsgovtaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcseftcaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getAcspflgaReference().setValue(ctx.getDfhbmsca().getDfhbmfseReference());
		ctx.getGroup1().getInfomsgaReference().setValue(ctx.getDfhbmsca().getDfhbmprfReference());
	}

	/**
	 * Process operation setupInfomsgAttrs.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void setupInfomsgAttrs(final CoactupcContext ctx, final ExecutionController ctrl) {
		if (ctx.getWsMiscStorage().isWsNoInfoMessage()) {
			ctx.getGroup1().getInfomsgaReference().setValue(ctx.getDfhbmsca().getDfhbmdarReference());
		} else {
			ctx.getGroup1().getInfomsgaReference().setValue(ctx.getDfhbmsca().getDfhbmasbReference());
		}
		if (ctx.getWsThisProgcommarea().isAcupChangesMade() && !(ctx.getWsThisProgcommarea().isAcupChangesOkayedAndDone())) {
			ctx.getGroup1().getFkey12aReference().setValue(ctx.getDfhbmsca().getDfhbmasbReference());
		} 
		if (ctx.getWsMiscStorage().isPromptForConfirmation()) {
			ctx.getGroup1().getFkey05aReference().setValue(ctx.getDfhbmsca().getDfhbmasbReference());
			ctx.getGroup1().getFkey12aReference().setValue(ctx.getDfhbmsca().getDfhbmasbReference());
		}
	}

	/**
	 * Process operation sendScreen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void sendScreen(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getCcWorkAreas().setCcardNextMapset(ctx.getWsLiterals().getLitThismapset());
		ctx.getCcWorkAreas().getCcardNextMapReference().setValue(ctx.getWsLiterals().getLitThismapReference());
		SendMapBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withMap(ctx.getCcWorkAreas().getCcardNextMap())
		.withMapset(ctx.getCcWorkAreas().getCcardNextMapset())
		.withData(ctx.getGroup1().getCactupaoReference())
		.withCursor()
		.withErase()
		.withFreeKB()
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
	}

	/**
	 * Process operation readAcct.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void readAcct(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsThisProgcommarea().getAcupOldDetailsReference().getField().initialize();
		ctx.getWsMiscStorage().setWsNoInfoMessage(true);
		ctx.getWsThisProgcommarea().setAcupOldAcctId(NumberUtils.convert(ctx.getCcWorkAreas().getCcAcctId()).longValue());
		ctx.getWsMiscStorage().setWsCardRidAcctId(NumberUtils.convert(ctx.getCcWorkAreas().getCcAcctId()).longValue());
		getcardxrefByacct(ctx, ctrl);
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
					storeFetchedData(ctx, ctrl);
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
	public void getcardxrefByacct(final CoactupcContext ctx, final ExecutionController ctrl) {
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
	public void getacctdataByacct(final CoactupcContext ctx, final ExecutionController ctrl) {
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
	public void getcustdataBycust(final CoactupcContext ctx, final ExecutionController ctrl) {
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
	 * Process operation storeFetchedData.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void storeFetchedData(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		Store Context in Commarea */
		ctx.getCarddemoCommarea().setCdemoAcctId(ctx.getAccountRecord().getAcctId());
		ctx.getCarddemoCommarea().setCdemoCustId(ctx.getCustomerRecord().getCustId());
		ctx.getCarddemoCommarea().getCdemoCustFnameReference().setValue(ctx.getCustomerRecord().getCustFirstNameReference());
		ctx.getCarddemoCommarea().getCdemoCustMnameReference().setValue(ctx.getCustomerRecord().getCustMiddleNameReference());
		ctx.getCarddemoCommarea().getCdemoCustLnameReference().setValue(ctx.getCustomerRecord().getCustLastNameReference());
		ctx.getCarddemoCommarea().getCdemoAcctStatusReference().setValue(ctx.getAccountRecord().getAcctActiveStatusReference());
		ctx.getCarddemoCommarea().setCdemoCardNum(NumberUtils.convert(ctx.getCardXrefRecord().getXrefCardNum()).longValue());
		ctx.getWsThisProgcommarea().getAcupOldDetailsReference().getField().initialize();
		
		/* 
		****************************************************************
		Account Master data
		**************************************************************** */
		ctx.getWsThisProgcommarea().setAcupOldAcctId(ctx.getAccountRecord().getAcctId());
		
		/* 
		Active Status */
		ctx.getWsThisProgcommarea().getAcupOldActiveStatusReference().setValue(ctx.getAccountRecord().getAcctActiveStatusReference());
		
		/* 
		Current Balance */
		ctx.getWsThisProgcommarea().setAcupOldCurrBalN(ctx.getAccountRecord().getAcctCurrBal());
		
		/* 
		Credit Limit */
		ctx.getWsThisProgcommarea().setAcupOldCreditLimitN(ctx.getAccountRecord().getAcctCreditLimit());
		
		/* 
		Cash Limit */
		ctx.getWsThisProgcommarea().setAcupOldCashCreditLimitN(ctx.getAccountRecord().getAcctCashCreditLimit());
		
		/* 
		Current Cycle Credit */
		ctx.getWsThisProgcommarea().setAcupOldCurrCycCreditN(ctx.getAccountRecord().getAcctCurrCycCredit());
		
		/* 
		Current Cycle Debit */
		ctx.getWsThisProgcommarea().setAcupOldCurrCycDebitN(ctx.getAccountRecord().getAcctCurrCycDebit());
		
		/* 
		Open date
		MOVE ACCT-OPEN-DATE           TO ACUP-OLD-OPEN-DATE */
		ctx.getWsThisProgcommarea().getAcupOldOpenYearReference().setBytes(ctx.getAccountRecord().getAcctOpenDateReference().getBytes(0, 4));
		ctx.getWsThisProgcommarea().getAcupOldOpenMonReference().setBytes(ctx.getAccountRecord().getAcctOpenDateReference().getBytes(5, 2));
		ctx.getWsThisProgcommarea().getAcupOldOpenDayReference().setBytes(ctx.getAccountRecord().getAcctOpenDateReference().getBytes(8, 2));
		
		/* 
		Expiry date
		MOVE ACCT-EXPIRAION-DATE      TO ACUP-OLD-EXPIRAION-DATE */
		ctx.getWsThisProgcommarea().getAcupOldExpYearReference().setBytes(ctx.getAccountRecord().getAcctExpiraionDateReference().getBytes(0, 4));
		ctx.getWsThisProgcommarea().getAcupOldExpMonReference().setBytes(ctx.getAccountRecord().getAcctExpiraionDateReference().getBytes(5, 2));
		ctx.getWsThisProgcommarea().getAcupOldExpDayReference().setBytes(ctx.getAccountRecord().getAcctExpiraionDateReference().getBytes(8, 2));
		
		/* 
		Reissue date
		MOVE ACCT-REISSUE-DATE        TO ACUP-OLD-REISSUE-DATE */
		ctx.getWsThisProgcommarea().getAcupOldReissueYearReference().setBytes(ctx.getAccountRecord().getAcctReissueDateReference().getBytes(0, 4));
		ctx.getWsThisProgcommarea().getAcupOldReissueMonReference().setBytes(ctx.getAccountRecord().getAcctReissueDateReference().getBytes(5, 2));
		ctx.getWsThisProgcommarea().getAcupOldReissueDayReference().setBytes(ctx.getAccountRecord().getAcctReissueDateReference().getBytes(8, 2));
		
		/* 
		Account Group */
		ctx.getWsThisProgcommarea().getAcupOldGroupIdReference().setValue(ctx.getAccountRecord().getAcctGroupIdReference());
		
		/* 
		****************************************************************
		Customer Master data
		****************************************************************
		Customer Id (actually not editable) */
		ctx.getWsThisProgcommarea().setAcupOldCustId(ctx.getCustomerRecord().getCustId());
		
		/* 
		Social Security Number */
		ctx.getWsThisProgcommarea().setAcupOldCustSsn(ctx.getCustomerRecord().getCustSsn());
		
		/* 
		Date of birth
		MOVE CUST-DOB-YYYY-MM-DD      TO ACUP-OLD-CUST-DOB-YYYY-MM-DD */
		ctx.getWsThisProgcommarea().getAcupOldCustDobYearReference().setBytes(ctx.getCustomerRecord().getCustDobYyyyMmDdReference().getBytes(0, 4));
		ctx.getWsThisProgcommarea().getAcupOldCustDobMonReference().setBytes(ctx.getCustomerRecord().getCustDobYyyyMmDdReference().getBytes(5, 2));
		ctx.getWsThisProgcommarea().getAcupOldCustDobDayReference().setBytes(ctx.getCustomerRecord().getCustDobYyyyMmDdReference().getBytes(8, 2));
		
		/* 
		FICO */
		ctx.getWsThisProgcommarea().setAcupOldCustFicoScore(ctx.getCustomerRecord().getCustFicoCreditScore());
		
		/* 
		First Name */
		ctx.getWsThisProgcommarea().getAcupOldCustFirstNameReference().setValue(ctx.getCustomerRecord().getCustFirstNameReference());
		
		/* 
		Middle Name */
		ctx.getWsThisProgcommarea().getAcupOldCustMiddleNameReference().setValue(ctx.getCustomerRecord().getCustMiddleNameReference());
		
		/* 
		Last Name */
		ctx.getWsThisProgcommarea().getAcupOldCustLastNameReference().setValue(ctx.getCustomerRecord().getCustLastNameReference());
		
		/* 
		Address */
		ctx.getWsThisProgcommarea().getAcupOldCustAddrLine1Reference().setValue(ctx.getCustomerRecord().getCustAddrLine1Reference());
		ctx.getWsThisProgcommarea().getAcupOldCustAddrLine2Reference().setValue(ctx.getCustomerRecord().getCustAddrLine2Reference());
		ctx.getWsThisProgcommarea().getAcupOldCustAddrLine3Reference().setValue(ctx.getCustomerRecord().getCustAddrLine3Reference());
		ctx.getWsThisProgcommarea().getAcupOldCustAddrStateCdReference().setValue(ctx.getCustomerRecord().getCustAddrStateCdReference());
		ctx.getWsThisProgcommarea().getAcupOldCustAddrCountryCdReference().setValue(ctx.getCustomerRecord().getCustAddrCountryCdReference());
		ctx.getWsThisProgcommarea().getAcupOldCustAddrZipReference().setValue(ctx.getCustomerRecord().getCustAddrZipReference());
		ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum1Reference().setValue(ctx.getCustomerRecord().getCustPhoneNum1Reference());
		ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum2Reference().setValue(ctx.getCustomerRecord().getCustPhoneNum2Reference());
		
		/* 
		Government Id */
		ctx.getWsThisProgcommarea().getAcupOldCustGovtIssuedIdReference().setValue(ctx.getCustomerRecord().getCustGovtIssuedIdReference());
		
		/* 
		EFT Code */
		ctx.getWsThisProgcommarea().getAcupOldCustEftAccountIdReference().setValue(ctx.getCustomerRecord().getCustEftAccountIdReference());
		
		/* 
		Primary Holder Indicator */
		ctx.getWsThisProgcommarea().getAcupOldCustPriHolderIndReference().setValue(ctx.getCustomerRecord().getCustPriCardHolderIndReference());
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
	public void yyyyStorePfkey(final CoactupcContext ctx, final ExecutionController ctrl) {
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
	public void abendRoutine(final CoactupcContext ctx, final ExecutionController ctrl) {
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
	}

	/**
	 * Process operation editDateCcyymmdd.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editDateCcyymmdd(final CoactupcContext ctx, final ExecutionController ctrl) {
		editDateCcyymmdd1(ctx, ctrl);
		editMonthExit(ctx, ctrl);
		
		/* 
		****************************************************************
		Checking for any other combinations
		**************************************************************** */
		if (!(ctx.getWsMiscStorage().isWs31DayMonth()) && ctx.getWsMiscStorage().isWsDay31()) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgDayNotOk(true);
			ctx.getWsMiscStorage().setFlgMonthNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(":Cannot have 31 days in this month.")
					.end();
			} 
			return;
		} else {
			if (ctx.getWsMiscStorage().isWsFebruary() && ctx.getWsMiscStorage().isWsDay30()) {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgDayNotOk(true);
				ctx.getWsMiscStorage().setFlgMonthNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(":Cannot have 30 days in this month.")
						.end();
				} 
				return;
			} else {
				if (ctx.getWsMiscStorage().isWsFebruary() && ctx.getWsMiscStorage().isWsDay29()) {
					if (NumberUtils.eq(ctx.getWsMiscStorage().getWsEditDateYyNReference(), 0)) {
						ctx.getWsMiscStorage().setWsDivBy(400);
					} else {
						ctx.getWsMiscStorage().setWsDivBy(4);
					}
					NumberUtils.divideAndKeepRemainder(ctx.getWsMiscStorage().getWsEditDateCcyyN(), ctx.getWsMiscStorage().getWsDivBy(), ctx.getWsMiscStorage().getWsDividendReference(), ctx.getWsMiscStorage().getWsRemainderReference());
					if (ctx.getWsMiscStorage().getWsRemainder() == 0) {
						
						/* 
						Do nothing */
					} else {
						ctx.getWsMiscStorage().setInputError(true);
						ctx.getWsMiscStorage().setFlgDayNotOk(true);
						ctx.getWsMiscStorage().setFlgMonthNotOk(true);
						ctx.getWsMiscStorage().setFlgYearNotOk(true);
						if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
							StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
								.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
								.addDelimitedBySize(":Not a leap year.Cannot have 29 days in this month.")
								.end();
						} 
						return;
					}
				} 
				if (ctx.getWsMiscStorage().isWsEditDateIsValid()) {
					
					/* 
					Do nothing */
					editDayMonthYearExit(ctx, ctrl);
				} else {
					return;
				}
			}
		}
	}

	/**
	 * Process operation editDateCcyymmdd1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editDateCcyymmdd1(final CoactupcContext ctx, final ExecutionController ctrl) {
		editDateCcyymmdd2(ctx, ctrl);
		ctx.getWsMiscStorage().setFlgMonthNotOk(true);
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditDateMmReference()) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditDateMmReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgMonthBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" : Month must be supplied.")
					.end();
			} 
			return;
		} else {
			
			/* 
			Month not reasonable
			Do nothing */
			if (ctx.getWsMiscStorage().isWsValidMonth()) {
				
				/* 
				Do nothing */
				if (DataUtils.compare(NumberUtils.testNumval(ctx.getWsMiscStorage().getWsEditDateMm()), 0) == 0) {
					ctx.getWsMiscStorage().setWsEditDateMmN(NumberUtils.convert(ctx.getWsMiscStorage().getWsEditDateMm()).intValue());
					ctx.getWsMiscStorage().setFlgMonthIsvalid(true);
				} else {
					ctx.getWsMiscStorage().setInputError(true);
					ctx.getWsMiscStorage().setFlgMonthNotOk(true);
					if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
						StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
							.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
							.addDelimitedBySize(": Month must be a number between 1 and 12.")
							.end();
					} 
					return;
				}
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgMonthNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(": Month must be a number between 1 and 12.")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editDateCcyymmdd2.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editDateCcyymmdd2(final CoactupcContext ctx, final ExecutionController ctrl) {
		editDateCcyymmdd3(ctx, ctrl);
		
		/* 
		****************************************************************
		Check for valid year and century
		**************************************************************** */
		ctx.getWsMiscStorage().setFlgYearNotOk(true);
		
		/* 
		Not supplied */
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditDateCcyyReference()) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditDateCcyyReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgYearBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" : Year must be supplied.")
					.end();
			} 
			
			/* 
			Intentional violation of structured programming norms */
			return;
		} else {
			
			/* 
			Not numeric
			Do nothing */
			if (!(DataUtils.isNumeric(ctx.getWsMiscStorage().getWsEditDateCcyyReference()))) {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgYearNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(" must be 4 digit number.")
						.end();
				} 
				return;
			} else {
				
				/* 
				****************************************************************
				Century not reasonable
				****************************************************************
				Not having learnt our lesson from history and Y2K
				And being unable to imagine COBOL in the 2100s
				We code only 19 and 20 as valid century values
				****************************************************************
				Do nothing */
				if (ctx.getWsMiscStorage().isThisCentury() || ctx.getWsMiscStorage().isLastCentury()) {
					
					/* 
					Do nothing */
					ctx.getWsMiscStorage().setFlgYearIsvalid(true);
				} else {
					ctx.getWsMiscStorage().setInputError(true);
					ctx.getWsMiscStorage().setFlgYearNotOk(true);
					if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
						StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
							.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
							.addDelimitedBySize(" : Century is not valid.")
							.end();
					} 
					return;
				}
			}
		}
	}

	/**
	 * Process operation editDateCcyymmdd3.
	 * 
	 * ****************************************************************
	 *  Common Date Routines
	 * ****************************************************************
	 * ****************************************************************
	 * Procedure Division Copybook for DATE related code
	 * ****************************************************************
	 * Date validation paragraph for reuse and hopefully not misuse
	 * Accompanying WORKING Storage is CSUTLDTR
	 * ****************************************************************
	 *  ***  PERFORM EDIT-DATE-CCYYMMDD
	 *          THRU EDIT-DATE-CCYYMMDD-EXIT
	 *          to validate CCYYMMDD dates
	 *       Reusable paras
	 *       a) EDIT-YEAR-CCYY
	 *       b) EDIT-MONTH
	 *       c) EDIT-DAY
	 *       d) EDIT-DATE-OF-BIRTH
	 *       e) EDIT-DATE-OF-BIRTH
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editDateCcyymmdd3(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setWsEditDateIsInvalid(true);
	}

	/**
	 * Process operation editMonthExit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editMonthExit(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setFlgDayIsvalid(true);
		if (DataUtils.isLowValue(ctx.getWsMiscStorage().getWsEditDateDdReference()) || DataUtils.isBlank(ctx.getWsMiscStorage().getWsEditDateDdReference())) {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgDayBlank(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" : Day must be supplied.")
					.end();
			} 
			return;
		} else {
			
			/* 
			Do nothing */
			if (DataUtils.compare(NumberUtils.testNumval(ctx.getWsMiscStorage().getWsEditDateDd()), 0) == 0) {
				ctx.getWsMiscStorage().setWsEditDateDdN(NumberUtils.convert(ctx.getWsMiscStorage().getWsEditDateDd()).intValue());
				if (ctx.getWsMiscStorage().isWsValidDay()) {
					
					/* 
					Do nothing */
					ctx.getWsMiscStorage().setFlgDayIsvalid(true);
				} else {
					ctx.getWsMiscStorage().setInputError(true);
					ctx.getWsMiscStorage().setFlgDayNotOk(true);
					if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
						StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
							.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
							.addDelimitedBySize(":day must be a number between 1 and 31.")
							.end();
					} 
					return;
				}
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				ctx.getWsMiscStorage().setFlgDayNotOk(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
						.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
						.addDelimitedBySize(":day must be a number between 1 and 31.")
						.end();
				} 
				return;
			}
		}
	}

	/**
	 * Process operation editDayMonthYearExit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editDayMonthYearExit(final CoactupcContext ctx, final ExecutionController ctrl) {
		editDayMonthYearExit1(ctx, ctrl);
		
		/* 
		If we got here all edits were cleared */
		ctx.getWsMiscStorage().setWsEditDateIsValid(true);
	}

	/**
	 * Process operation editDayMonthYearExit1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editDayMonthYearExit1(final CoactupcContext ctx, final ExecutionController ctrl) {
		/* 
		****************************************************************
		In case some one managed to enter a bad date that passsed all
		the edits above ......
		Use LE Services to verify the supplied date
		**************************************************************** */
		ctx.getWsMiscStorage().getWsDateValidationResultReference().getField().initialize();
		ctx.getWsMiscStorage().setWsDateFormat("YYYYMMDD");
		ctrl.callSubProgram("CSUTLDTC", CallBuilder.newInstance()
			.byReference(ctx.getWsMiscStorage().getWsEditDateCcyymmddReference())
			.byReference(ctx.getWsMiscStorage().getWsDateFormatReference())
			.byReference(ctx.getWsMiscStorage().getWsDateValidationResultReference())
			.getArguments(), ctx);
		if (NumberUtils.eq(ctx.getWsMiscStorage().getWsSeverityNReference(), 0)) {
			
			/* 
			Do nothing */
			if (!(ctx.getWsMiscStorage().isInputError())) {
				ctx.getWsMiscStorage().setFlgDayIsvalid(true);
			} 
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgDayNotOk(true);
			ctx.getWsMiscStorage().setFlgMonthNotOk(true);
			ctx.getWsMiscStorage().setFlgYearNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(" validation error Sev code: ")
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsSeverityReference().getBytes())
					.addDelimitedBySize(" Message code: ")
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsMsgNoReference().getBytes())
					.end();
			} 
			return;
		}
	}

	/**
	 * Process operation editDateOfBirth.
	 * 
	 * ****************************************************************
	 * Date of Birth Reasonableness check
	 * ****************************************************************
	 *   At the time of writing this program
	 *   Time travel was not possible.
	 *   Date of birth in the future is not acceptable
	 * ****************************************************************
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	@Override
	public void editDateOfBirth(final CoactupcContext ctx, final ExecutionController ctrl) {
		ctx.getWsMiscStorage().setWsCurrentDateYyyymmdd(DateHelper.getFormattedDate("yyyyMMddHHmmssSSZZZ"));
		ctx.getWsMiscStorage().setWsEditDateBinary(DateHelper.integerOfDate(ctx.getWsMiscStorage().getWsEditDateCcyymmddN()));
		ctx.getWsMiscStorage().setWsCurrentDateBinary(DateHelper.integerOfDate(ctx.getWsMiscStorage().getWsCurrentDateYyyymmddN()));
		if (ctx.getWsMiscStorage().getWsCurrentDateBinary() > ctx.getWsMiscStorage().getWsEditDateBinary()) {
			
			/* 
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT
			Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:32 CDT
			IF FUNCTION FIND-DURATION(FUNCTION CURRENT-DATE
			,WS-EDIT-DATE-CCYYMMDD)
			,DAYS) > 0
			Do nothing */
			return;
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			ctx.getWsMiscStorage().setFlgDayNotOk(true);
			ctx.getWsMiscStorage().setFlgMonthNotOk(true);
			ctx.getWsMiscStorage().setFlgYearNotOk(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getWsReturnMsgReference())
					.addDelimitedBySize(ctx.getWsMiscStorage().getWsEditVariableName().trim())
					.addDelimitedBySize(":cannot be in the future ")
					.end();
			} 
			return;
		}
	}

}
