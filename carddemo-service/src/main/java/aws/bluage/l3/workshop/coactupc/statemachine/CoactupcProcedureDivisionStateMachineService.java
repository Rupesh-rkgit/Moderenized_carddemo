
package aws.bluage.l3.workshop.coactupc.statemachine;

import aws.bluage.l3.workshop.coactupc.business.context.CoactupcContext;
import aws.bluage.l3.workshop.coactupc.service.CoactupcProcess;
import aws.bluage.l3.workshop.coactupc.statemachine.CoactupcProcedureDivisionStateMachineController.Events;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.NumberUtils;
import com.netfective.bluage.gapwalk.datasimplifier.utils.StringUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.ResponseCode;
import com.netfective.bluage.gapwalk.rt.jics.control.HandleAbendBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.jics.internal.JicsSyncpointBuilder;
import com.netfective.bluage.gapwalk.rt.jics.io.JicsIsolationLevel;
import com.netfective.bluage.gapwalk.rt.jics.io.internal.JicsFileBuilder;
import com.netfective.bluage.gapwalk.rt.statemachine.StateMachineControllerWithContinuation;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Service class containing states process used to drive state machine "CoactupcProcedureDivisionStateMachine".
 */
@Service("aws.bluage.l3.workshop.coactupc.statemachine.CoactupcProcedureDivisionStateMachineService")
@Lazy
public class CoactupcProcedureDivisionStateMachineService {
	
	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CoactupcProcedureDivisionStateMachineService.class);

	/**
	 * The associated state machine controller.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.coactupc.statemachine.CoactupcProcedureDivisionStateMachineController")	
	private StateMachineControllerWithContinuation<Events> instanceStateMachineController;
	
	
	/**
	 * Service used by the state machine.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.coactupc.service.CoactupcProcess")
	private CoactupcProcess instanceCoactupcProcess;
	
	
	

	/**
	 * State process operation _0000Main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _0000Main(CoactupcContext ctx, ExecutionController ctrl) {
		instanceStateMachineController.registerSignalHandler(Events.TO_ABEND_ROUTINE, ctx, "ABEND_1_VIRTUAL_SIGNAL");
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		*************************************** *************************
		Program:     COACTUPC.CBL                                     *
		Layer:       Business logic                                   *
		Function:    Accept and process ACCOUNT UPDATE                *
		*****************************************************************
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
		***************************************************************** */
		ctx.getSignalHandlersController().activateSignalHandler("ABEND_1_VIRTUAL_SIGNAL","!ABEND");
		HandleAbendBuilder.newInstance(ctx.getDfheiblk(), ctx).execute().handleException();
		ctx.getCcWorkAreas().getCcWorkAreaReference().getField().initialize();
		ctx.getWsMiscStorage().getField().initialize();
		DataUtils.initialize(ctx.getWsCommarea().getWsCommareaReference());
		
		/* 
		****************************************************************
		Store our context
		**************************************************************** */
		ctx.getWsMiscStorage().getWsTranidReference().setValue(ctx.getWsLiterals().getLitThistranidReference());
		
		/* 
		****************************************************************
		Ensure error message is cleared                               *
		**************************************************************** */
		ctx.getWsMiscStorage().setWsReturnMsgOff(true);
		
		/* 
		****************************************************************
		Store passed data if  any                *
		**************************************************************** */
		if (ctx.getDfheiblk().getEibcalen() == 0 || (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsLiterals().getLitMenupgmReference()) == 0 && !(ctx.getCarddemoCommarea().isCdemoPgmReenter()))) {
			ctx.getCarddemoCommarea().getField().initialize();
			ctx.getWsThisProgcommarea().getField().initialize();
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			ctx.getWsThisProgcommarea().setAcupDetailsNotFetched(true);
		} else {
			int len = ctx.getCarddemoCommarea().getSize();
			ctx.getCarddemoCommarea().setBytes(ctx.getDfhcommarea().getBytes(0, len));
			int idx = ctx.getCarddemoCommarea().getSize() + 1 - 1;
			int len1 = ctx.getWsThisProgcommarea().getSize();
			ctx.getWsThisProgcommarea().setBytes(ctx.getDfhcommarea().getBytes(idx, len1));
		}
		
		/* 
		****************************************************************
		Remap PFkeys as needed.
		Store the Mapped PF Key
		**************************************************************** */
		instanceCoactupcProcess.yyyyStorePfkey(ctx, ctrl);
		
		/* 
		****************************************************************
		Check the AID to see if its valid at this point               *
		F3 - Exit
		Enter show screen again
		**************************************************************** */
		ctx.getWsMiscStorage().setPfkInvalid(true);
		if (ctx.getCcWorkAreas().isCcardAidEnter() || ctx.getCcWorkAreas().isCcardAidPfk03() || (ctx.getCcWorkAreas().isCcardAidPfk05() && ctx.getWsThisProgcommarea().isAcupChangesOkNotConfirmed()) || (ctx.getCcWorkAreas().isCcardAidPfk12() && !(ctx.getWsThisProgcommarea().isAcupDetailsNotFetched()))) {
			ctx.getWsMiscStorage().setPfkValid(true);
		} 
		if (ctx.getWsMiscStorage().isPfkInvalid()) {
			ctx.getCcWorkAreas().setCcardAidEnter(true);
		} 
		
		/* 
		****************************************************************
		Decide what to do based on inputs received
		**************************************************************** */
		if (ctx.getCcWorkAreas().isCcardAidPfk03()) {
			
			/* 
			****************************************************************
			USER PRESSES PF03 TO EXIT
			OR   USER IS DONE WITH UPDATE
			XCTL TO CALLING PROGRAM OR MAIN MENU
			**************************************************************** */
			ctx.getCcWorkAreas().setCcardAidPfk03(true);
			if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoFromTranidReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoFromTranidReference())) {
				ctx.getCarddemoCommarea().getCdemoToTranidReference().setValue(ctx.getWsLiterals().getLitMenutranidReference());
			} else {
				ctx.getCarddemoCommarea().getCdemoToTranidReference().setValue(ctx.getCarddemoCommarea().getCdemoFromTranidReference());
			}
			if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoFromProgramReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoFromProgramReference())) {
				ctx.getCarddemoCommarea().getCdemoToProgramReference().setValue(ctx.getWsLiterals().getLitMenupgmReference());
			} else {
				ctx.getCarddemoCommarea().getCdemoToProgramReference().setValue(ctx.getCarddemoCommarea().getCdemoFromProgramReference());
			}
			ctx.getCarddemoCommarea().getCdemoFromTranidReference().setValue(ctx.getWsLiterals().getLitThistranidReference());
			ctx.getCarddemoCommarea().getCdemoFromProgramReference().setValue(ctx.getWsLiterals().getLitThispgmReference());
			ctx.getCarddemoCommarea().setCdemoUsrtypUser(true);
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			ctx.getCarddemoCommarea().setCdemoLastMapset(ctx.getWsLiterals().getLitThismapset());
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsLiterals().getLitThismapReference());
			JicsSyncpointBuilder.newInstance(ctx.getDfheiblk(), ctx)
			.commit()
			.execute()
			.handleException();
			XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
		} else if ((ctx.getWsThisProgcommarea().isAcupDetailsNotFetched() && ctx.getCarddemoCommarea().isCdemoPgmEnter()) || (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsLiterals().getLitMenupgmReference()) == 0 && !(ctx.getCarddemoCommarea().isCdemoPgmReenter()))) {
			ctx.getWsThisProgcommarea().getField().initialize();
			instanceCoactupcProcess.sendMap(ctx, ctrl);
			ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
			ctx.getWsThisProgcommarea().setAcupDetailsNotFetched(true);
			instanceCoactupcProcess.commonReturn(ctx, ctrl);
		} else if (ctx.getWsThisProgcommarea().isAcupChangesOkayedAndDone() || ctx.getWsThisProgcommarea().isAcupChangesFailed()) {
			ctx.getWsThisProgcommarea().getField().initialize();
			ctx.getWsMiscStorage().getField().initialize();
			DataUtils.initialize(ctx.getCarddemoCommarea().getCdemoAcctIdReference());
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			instanceCoactupcProcess.sendMap(ctx, ctrl);
			ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
			ctx.getWsThisProgcommarea().setAcupDetailsNotFetched(true);
			instanceCoactupcProcess.commonReturn(ctx, ctrl);
		} else {
			instanceStateMachineController.sendEvent(Events.TO__0000_MAIN_CASEBRANCH);
			return;
		}

	}
	/**
	 * State process operation _2000DecideAction.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _2000DecideAction(CoactupcContext ctx, ExecutionController ctrl) {
		if (ctx.getWsThisProgcommarea().isAcupDetailsNotFetched() || ctx.getCcWorkAreas().isCcardAidPfk12()) {
			
			/* 
			****************************************************************
			NO DETAILS SHOWN.
			SO GET THEM AND SETUP DETAIL EDIT SCREEN
			**************************************************************** */
			if (ctx.getWsMiscStorage().isFlgAcctfilterIsvalid()) {
				ctx.getWsMiscStorage().setWsReturnMsgOff(true);
				instanceCoactupcProcess.readAcct(ctx, ctrl);
				if (ctx.getWsMiscStorage().isFoundCustInMaster()) {
					ctx.getWsThisProgcommarea().setAcupShowDetails(true);
				} 
			} 
			
			/* 
			****************************************************************
			DETAILS SHOWN
			CHECK CHANGES AND ASK CONFIRMATION IF GOOD
			**************************************************************** */
		} else if (ctx.getWsThisProgcommarea().isAcupShowDetails()) {
			if (ctx.getWsMiscStorage().isInputError() || ctx.getWsMiscStorage().isNoChangesDetected()) {
				
				/* 
				Do nothing */
			} else {
				ctx.getWsThisProgcommarea().setAcupChangesOkNotConfirmed(true);
			}
			
			/* 
			****************************************************************
			DETAILS SHOWN
			BUT INPUT EDIT ERRORS FOUND
			**************************************************************** */
		} else if (ctx.getWsThisProgcommarea().isAcupChangesNotOk()) {
			
			/* 
			Do nothing
			****************************************************************
			DETAILS EDITED , FOUND OK, CONFIRM SAVE REQUESTED
			CONFIRMATION GIVEN.SO SAVE THE CHANGES
			**************************************************************** */
		} else if (ctx.getWsThisProgcommarea().isAcupChangesOkNotConfirmed() && ctx.getCcWorkAreas().isCcardAidPfk05()) {
			instanceStateMachineController.sendEvent(Events.TO__2000_DECIDE_ACTION_CASEBRANCH);
			return;
		} else if (ctx.getWsThisProgcommarea().isAcupChangesOkNotConfirmed()) {
			
			/* 
			Do nothing
			****************************************************************
			SHOW CONFIRMATION. GO BACK TO SQUARE 1
			**************************************************************** */
		} else if (ctx.getWsThisProgcommarea().isAcupChangesOkayedAndDone()) {
			ctx.getWsThisProgcommarea().setAcupShowDetails(true);
			if (DataUtils.isLowValue(ctx.getCarddemoCommarea().getCdemoFromTranidReference()) || DataUtils.isBlank(ctx.getCarddemoCommarea().getCdemoFromTranidReference())) {
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoAcctIdReference());
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoCardNumReference());
				ctx.getCarddemoCommarea().getCdemoAcctStatusReference().setBytes(Record.LOW_VALUES);
			} 
		} else {
			instanceStateMachineController.sendEvent(Events.TO__2000_DECIDE_ACTION_CASEBRANCH_1);
			return;
		}
		instanceStateMachineController.sendEvent(Events.TO__2000_DECIDE_ACTION_POSTIF);

	}
	/**
	 * State process operation _9600WriteProcessing.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9600WriteProcessing(CoactupcContext ctx, ExecutionController ctrl) {
		
		/* 
		Read the account file for update */
		ctx.getWsMiscStorage().setWsCardRidAcctId(NumberUtils.convert(ctx.getCcWorkAreas().getCcAcctId()).longValue());
		JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitAcctfilenameReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.setIsolationLevel(JicsIsolationLevel.UPDATE)
		.updateNoToken()
		.into(ctx.getAccountRecord())
		.length(300)
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidAcctIdXReference())
		.keyLength(11,false)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		
		/* 
		****************************************************************
		Could we lock the account record ?
		**************************************************************** */
		if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			Read the customer file for update
			Do nothing */
			ctx.getWsMiscStorage().setWsCardRidCustId(ctx.getCarddemoCommarea().getCdemoCustId());
			JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitCustfilenameReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
			.read()
			.setIsolationLevel(JicsIsolationLevel.UPDATE)
			.updateNoToken()
			.into(ctx.getCustomerRecord())
			.length(500)
			.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCustIdXReference())
			.keyLength(9,false)
			.execute();
			ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
			ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
			
			/* 
			****************************************************************
			Could we lock the customer record ?
			**************************************************************** */
			if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
				
				/* 
				****************************************************************
				Did someone change the record while we were out ?
				****************************************************************
				Do nothing */
				instanceStateMachineController.addContinuationEvent(Events.TO__9600_WRITE_PROCESSING_POST__9700CHECKCHANGEINREC_THRU__9700CHECKCHANGEINRECEXIT, "END_OF__9700_CHECK_CHANGE_IN_REC_EXIT");
				instanceStateMachineController.sendEvent(Events.TO__9700_CHECK_CHANGE_IN_REC);
			} else {
				ctx.getWsMiscStorage().setInputError(true);
				if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
					ctx.getWsMiscStorage().setCouldNotLockCustForUpdate(true);
				} 
				instanceStateMachineController.sendEvent(Events.TO__9600_WRITE_PROCESSING_EXIT);
				return;
			}
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setCouldNotLockAcctForUpdate(true);
			} 
			instanceStateMachineController.sendEvent(Events.TO__9600_WRITE_PROCESSING_EXIT);
			return;
		}

	}
	/**
	 * State process operation _9600WriteProcessingExit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9600WriteProcessingExit(CoactupcContext ctx, ExecutionController ctrl) {
				boolean res = false; 
		res = instanceStateMachineController.sendContinuationEventIfActive("END_OF__9600_WRITE_PROCESSING_EXIT");
		if (res) {
			return;
		} 

	}
	/**
	 * State process operation _9700CheckChangeInRec.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9700CheckChangeInRec(CoactupcContext ctx, ExecutionController ctrl) {
		
		/* 
		****************************************************************
		Account Master data
		**************************************************************** */
		if (DataUtils.compare(ctx.getAccountRecord().getAcctActiveStatusReference(), ctx.getWsThisProgcommarea().getAcupOldActiveStatusReference()) == 0 && NumberUtils.eq(ctx.getAccountRecord().getAcctCurrBalReference(), ctx.getWsThisProgcommarea().getAcupOldCurrBalNReference()) && NumberUtils.eq(ctx.getAccountRecord().getAcctCreditLimitReference(), ctx.getWsThisProgcommarea().getAcupOldCreditLimitNReference()) && NumberUtils.eq(ctx.getAccountRecord().getAcctCashCreditLimitReference(), ctx.getWsThisProgcommarea().getAcupOldCashCreditLimitNReference()) && NumberUtils.eq(ctx.getAccountRecord().getAcctCurrCycCreditReference(), ctx.getWsThisProgcommarea().getAcupOldCurrCycCreditNReference()) && NumberUtils.eq(ctx.getAccountRecord().getAcctCurrCycDebitReference(), ctx.getWsThisProgcommarea().getAcupOldCurrCycDebitNReference()) && DataUtils.compare(ctx.getAccountRecord().getAcctOpenDateReference().getBytes(0, 4), ctx.getWsThisProgcommarea().getAcupOldOpenYearReference()) == 0 && DataUtils.compare(ctx.getAccountRecord().getAcctOpenDateReference().getBytes(5, 2), ctx.getWsThisProgcommarea().getAcupOldOpenMonReference()) == 0 && DataUtils.compare(ctx.getAccountRecord().getAcctOpenDateReference().getBytes(8, 2), ctx.getWsThisProgcommarea().getAcupOldOpenDayReference()) == 0 && DataUtils.compare(ctx.getAccountRecord().getAcctExpiraionDateReference().getBytes(0, 4), ctx.getWsThisProgcommarea().getAcupOldExpYearReference()) == 0 && DataUtils.compare(ctx.getAccountRecord().getAcctExpiraionDateReference().getBytes(5, 2), ctx.getWsThisProgcommarea().getAcupOldExpMonReference()) == 0 && DataUtils.compare(ctx.getAccountRecord().getAcctExpiraionDateReference().getBytes(8, 2), ctx.getWsThisProgcommarea().getAcupOldExpDayReference()) == 0 && DataUtils.compare(ctx.getAccountRecord().getAcctReissueDateReference().getBytes(0, 4), ctx.getWsThisProgcommarea().getAcupOldReissueYearReference()) == 0 && DataUtils.compare(ctx.getAccountRecord().getAcctReissueDateReference().getBytes(5, 2), ctx.getWsThisProgcommarea().getAcupOldReissueMonReference()) == 0 && DataUtils.compare(ctx.getAccountRecord().getAcctReissueDateReference().getBytes(8, 2), ctx.getWsThisProgcommarea().getAcupOldReissueDayReference()) == 0 && DataUtils.compare(StringUtils.lowerCase(ctx.getAccountRecord().getAcctGroupId()), StringUtils.lowerCase(ctx.getWsThisProgcommarea().getAcupOldGroupId())) == 0) {
			
			/* 
			****************************************************************
			Customer  data - Split into 2 IFs for easier reading
			And maybe put logic to update only 1 file if only date
			pertaining to one of them is updated
			****************************************************************
			Current Balance
			Credit Limit
			Cash Limit
			Current Cycle Credit
			Current Cycle Debit
			Open date
			Expiry date
			Reissue date
			Account Group
			Do nothing */
			if (DataUtils.compare(StringUtils.upperCase(ctx.getCustomerRecord().getCustFirstName()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustFirstName())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getCustomerRecord().getCustMiddleName()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustMiddleName())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getCustomerRecord().getCustLastName()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustLastName())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getCustomerRecord().getCustAddrLine1()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrLine1())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getCustomerRecord().getCustAddrLine2()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrLine2())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getCustomerRecord().getCustAddrLine3()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrLine3())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getCustomerRecord().getCustAddrStateCd()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrStateCd())) == 0 && DataUtils.compare(StringUtils.upperCase(ctx.getCustomerRecord().getCustAddrCountryCd()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustAddrCountryCd())) == 0 && DataUtils.compare(ctx.getCustomerRecord().getCustAddrZipReference(), ctx.getWsThisProgcommarea().getAcupOldCustAddrZipReference()) == 0 && DataUtils.compare(ctx.getCustomerRecord().getCustPhoneNum1Reference(), ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum1Reference()) == 0 && DataUtils.compare(ctx.getCustomerRecord().getCustPhoneNum2Reference(), ctx.getWsThisProgcommarea().getAcupOldCustPhoneNum2Reference()) == 0 && NumberUtils.eq(ctx.getCustomerRecord().getCustSsnReference(), ctx.getWsThisProgcommarea().getAcupOldCustSsnReference()) && DataUtils.compare(StringUtils.upperCase(ctx.getCustomerRecord().getCustGovtIssuedId()), StringUtils.upperCase(ctx.getWsThisProgcommarea().getAcupOldCustGovtIssuedId())) == 0 && DataUtils.compare(ctx.getCustomerRecord().getCustDobYyyyMmDdReference().getBytes(0, 4), ctx.getWsThisProgcommarea().getAcupOldCustDobYyyyMmDdReference().getBytes(0, 4)) == 0 && DataUtils.compare(ctx.getCustomerRecord().getCustDobYyyyMmDdReference().getBytes(5, 2), ctx.getWsThisProgcommarea().getAcupOldCustDobYyyyMmDdReference().getBytes(4, 2)) == 0 && DataUtils.compare(ctx.getCustomerRecord().getCustDobYyyyMmDdReference().getBytes(8, 2), ctx.getWsThisProgcommarea().getAcupOldCustDobYyyyMmDdReference().getBytes(6, 2)) == 0 && DataUtils.compare(ctx.getCustomerRecord().getCustEftAccountIdReference(), ctx.getWsThisProgcommarea().getAcupOldCustEftAccountIdReference()) == 0 && DataUtils.compare(ctx.getCustomerRecord().getCustPriCardHolderIndReference(), ctx.getWsThisProgcommarea().getAcupOldCustPriHolderIndReference()) == 0 && NumberUtils.eq(ctx.getCustomerRecord().getCustFicoCreditScoreReference(), ctx.getWsThisProgcommarea().getAcupOldCustFicoScoreReference())) {
				
				/* 
				Do nothing */
				instanceStateMachineController.sendEvent(Events.TO__9700_CHECK_CHANGE_IN_REC_EXIT);
			} else {
				ctx.getWsMiscStorage().setDataWasChangedBeforeUpdate(true);
				instanceStateMachineController.sendEvent(Events.TO__9600_WRITE_PROCESSING_EXIT);
				return;
			}
		} else {
			ctx.getWsMiscStorage().setDataWasChangedBeforeUpdate(true);
			instanceStateMachineController.sendEvent(Events.TO__9600_WRITE_PROCESSING_EXIT);
			return;
		}

	}
	/**
	 * State process operation _9700CheckChangeInRecExit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9700CheckChangeInRecExit(CoactupcContext ctx, ExecutionController ctrl) {
				boolean res = false; 
		res = instanceStateMachineController.sendContinuationEventIfActive("END_OF__9700_CHECK_CHANGE_IN_REC_EXIT");
		if (res) {
			return;
		} 

	}
	/**
	 * State process operation abendRoutine.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void abendRoutine(CoactupcContext ctx, ExecutionController ctrl) {
				boolean res = false; 
		instanceCoactupcProcess.abendRoutine(ctx, ctrl);
		res = instanceStateMachineController.sendContinuationEventIfActive("END_OF_ABEND_ROUTINE");
		if (res) {
			return;
		} else {
			instanceCoactupcProcess.editDateCcyymmdd(ctx, ctrl);
			instanceCoactupcProcess.editDateOfBirth(ctx, ctrl);
			instanceStateMachineController.sendEvent(Events.TO_FINAL);
		}

	}
	/**
	 * State process operation _0000MainCasebranch.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _0000MainCasebranch(CoactupcContext ctx, ExecutionController ctrl) {
		instanceCoactupcProcess.processInputs(ctx, ctrl);
		instanceStateMachineController.addContinuationEvent(Events.TO__0000_MAIN_POST__2000DECIDEACTION_THRU__2000DECIDEACTIONEXIT, "END_OF__2000_DECIDE_ACTION_POSTIF");
		instanceStateMachineController.sendEvent(Events.TO__2000_DECIDE_ACTION);

	}
	/**
	 * State process operation _2000DecideActionPostif.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _2000DecideActionPostif(CoactupcContext ctx, ExecutionController ctrl) {
				boolean res = false; 
		res = instanceStateMachineController.sendContinuationEventIfActive("END_OF__2000_DECIDE_ACTION_POSTIF");
		if (res) {
			return;
		} 

	}
	/**
	 * State process operation _2000DecideActionCasebranch.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _2000DecideActionCasebranch(CoactupcContext ctx, ExecutionController ctrl) {
		instanceStateMachineController.addContinuationEvent(Events.TO__2000_DECIDE_ACTION_POST__9600WRITEPROCESSING_THRU__9600WRITEPROCESSINGEXIT, "END_OF__9600_WRITE_PROCESSING_EXIT");
		instanceStateMachineController.sendEvent(Events.TO__9600_WRITE_PROCESSING);

	}
	/**
	 * State process operation _2000DecideActionCasebranch1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _2000DecideActionCasebranch1(CoactupcContext ctx, ExecutionController ctrl) {
		ctx.getAbendData().getAbendCulpritReference().setValue(ctx.getWsLiterals().getLitThispgmReference());
		ctx.getAbendData().setAbendCode("0001");
		DataUtils.setToBlank(ctx.getAbendData().getAbendReasonReference());
		ctx.getAbendData().setAbendMsg("UNEXPECTED DATA SCENARIO");
		instanceStateMachineController.addContinuationEvent(Events.TO__2000_DECIDE_ACTION_POSTIF, "END_OF_ABEND_ROUTINE");
		instanceStateMachineController.sendEvent(Events.TO_ABEND_ROUTINE);

	}
	/**
	 * State process operation _0000MainPost2000decideactionThru2000decideactionexit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _0000MainPost2000decideactionThru2000decideactionexit(CoactupcContext ctx, ExecutionController ctrl) {
		instanceCoactupcProcess.sendMap(ctx, ctrl);
		instanceCoactupcProcess.commonReturn(ctx, ctrl);

	}
	/**
	 * State process operation _2000DecideActionPost9600writeprocessingThru9600writeprocessingexit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _2000DecideActionPost9600writeprocessingThru9600writeprocessingexit(CoactupcContext ctx, ExecutionController ctrl) {
		if (ctx.getWsMiscStorage().isCouldNotLockAcctForUpdate()) {
			ctx.getWsThisProgcommarea().setAcupChangesOkayedLockError(true);
		} else if (ctx.getWsMiscStorage().isLockedButUpdateFailed()) {
			ctx.getWsThisProgcommarea().setAcupChangesOkayedButFailed(true);
		} else if (ctx.getWsMiscStorage().isDataWasChangedBeforeUpdate()) {
			ctx.getWsThisProgcommarea().setAcupShowDetails(true);
		} else {
			ctx.getWsThisProgcommarea().setAcupChangesOkayedAndDone(true);
		}
		
		/* 
		****************************************************************
		DETAILS EDITED , FOUND OK, CONFIRM SAVE REQUESTED
		CONFIRMATION NOT GIVEN. SO SHOW DETAILS AGAIN
		**************************************************************** */
		instanceStateMachineController.sendEvent(Events.TO__2000_DECIDE_ACTION_POSTIF);

	}
	/**
	 * State process operation _9600WriteProcessingPost9700checkchangeinrecThru9700checkchangeinrecexit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9600WriteProcessingPost9700checkchangeinrecThru9700checkchangeinrecexit(CoactupcContext ctx, ExecutionController ctrl) {
		if (ctx.getWsMiscStorage().isDataWasChangedBeforeUpdate()) {
			instanceStateMachineController.sendEvent(Events.TO__9600_WRITE_PROCESSING_EXIT);
			return;
		} else {
			
			/* 
			****************************************************************
			Prepare the update
			**************************************************************** */
			ctx.getWsMiscStorage().getAcctUpdateRecordReference().getField().initialize();
			
			/* 
			****************************************************************
			Account Master data
			**************************************************************** */
			ctx.getWsMiscStorage().setAcctUpdateId(ctx.getWsThisProgcommarea().getAcupNewAcctId());
			
			/* 
			Active Status */
			ctx.getWsMiscStorage().getAcctUpdateActiveStatusReference().setValue(ctx.getWsThisProgcommarea().getAcupNewActiveStatusReference());
			
			/* 
			Current Balance */
			ctx.getWsMiscStorage().setAcctUpdateCurrBal(ctx.getWsThisProgcommarea().getAcupNewCurrBalN());
			
			/* 
			Credit Limit */
			ctx.getWsMiscStorage().setAcctUpdateCreditLimit(ctx.getWsThisProgcommarea().getAcupNewCreditLimitN());
			
			/* 
			Cash Limit */
			ctx.getWsMiscStorage().setAcctUpdateCashCreditLimit(ctx.getWsThisProgcommarea().getAcupNewCashCreditLimitN());
			
			/* 
			Current Cycle Credit */
			ctx.getWsMiscStorage().setAcctUpdateCurrCycCredit(ctx.getWsThisProgcommarea().getAcupNewCurrCycCreditN());
			
			/* 
			Current Cycle Debit */
			ctx.getWsMiscStorage().setAcctUpdateCurrCycDebit(ctx.getWsThisProgcommarea().getAcupNewCurrCycDebitN());
			
			/* 
			Open date */
			StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getAcctUpdateOpenDateReference())
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewOpenYearReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewOpenMonReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewOpenDayReference().getBytes())
				.end();
			
			/* 
			Expiry date */
			StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getAcctUpdateExpiraionDateReference())
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewExpYearReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewExpMonReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewExpDayReference().getBytes())
				.end();
			
			/* 
			Reissue date */
			ctx.getWsMiscStorage().getAcctUpdateReissueDateReference().setValue(ctx.getAccountRecord().getAcctReissueDateReference());
			StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getAcctUpdateReissueDateReference())
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewReissueYearReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewReissueMonReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewReissueDayReference().getBytes())
				.end();
			
			/* 
			Account Group */
			ctx.getWsMiscStorage().getAcctUpdateGroupIdReference().setValue(ctx.getWsThisProgcommarea().getAcupNewGroupIdReference());
			
			/* 
			****************************************************************
			Customer data
			**************************************************************** */
			ctx.getWsMiscStorage().getCustUpdateRecordReference().getField().initialize();
			ctx.getWsMiscStorage().setCustUpdateId(ctx.getWsThisProgcommarea().getAcupNewCustId());
			ctx.getWsMiscStorage().getCustUpdateFirstNameReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustFirstNameReference());
			ctx.getWsMiscStorage().getCustUpdateMiddleNameReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustMiddleNameReference());
			ctx.getWsMiscStorage().getCustUpdateLastNameReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustLastNameReference());
			ctx.getWsMiscStorage().getCustUpdateAddrLine1Reference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine1Reference());
			ctx.getWsMiscStorage().getCustUpdateAddrLine2Reference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine2Reference());
			ctx.getWsMiscStorage().getCustUpdateAddrLine3Reference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrLine3Reference());
			ctx.getWsMiscStorage().getCustUpdateAddrStateCdReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrStateCdReference());
			ctx.getWsMiscStorage().getCustUpdateAddrCountryCdReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrCountryCdReference());
			ctx.getWsMiscStorage().getCustUpdateAddrZipReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustAddrZipReference());
			StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getCustUpdatePhoneNum1Reference())
				.addDelimitedBySize("(")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1aReference().getBytes())
				.addDelimitedBySize(")")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1bReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum1cReference().getBytes())
				.end();
			StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getCustUpdatePhoneNum2Reference())
				.addDelimitedBySize("(")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2aReference().getBytes())
				.addDelimitedBySize(")")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2bReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustPhoneNum2cReference().getBytes())
				.end();
			ctx.getWsMiscStorage().setCustUpdateSsn(ctx.getWsThisProgcommarea().getAcupNewCustSsn());
			ctx.getWsMiscStorage().getCustUpdateGovtIssuedIdReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustGovtIssuedIdReference());
			StringConcatenationBuilder.newInstance(ctx.getWsMiscStorage().getCustUpdateDobYyyyMmDdReference())
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustDobYearReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustDobMonReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getAcupNewCustDobDayReference().getBytes())
				.end();
			ctx.getWsMiscStorage().getCustUpdateEftAccountIdReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustEftAccountIdReference());
			ctx.getWsMiscStorage().getCustUpdatePriCardIndReference().setValue(ctx.getWsThisProgcommarea().getAcupNewCustPriHolderIndReference());
			ctx.getWsMiscStorage().setCustUpdateFicoCreditScore(ctx.getWsThisProgcommarea().getAcupNewCustFicoScore());
			
			/* 
			****************************************************************
			Update account *
			**************************************************************** */
			JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitAcctfilenameReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
			.rewrite()
			.from(ctx.getWsMiscStorage().getAcctUpdateRecordReference())
			.length(300)
			.execute();
			ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
			ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
			
			/* 
			****************************************************************
			Did account update succeed ?  *
			**************************************************************** */
			if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
				
				/* 
				****************************************************************
				Update customer *
				****************************************************************
				Do nothing */
				JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitCustfilenameReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
				.rewrite()
				.from(ctx.getWsMiscStorage().getCustUpdateRecordReference())
				.length(500)
				.execute();
				ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
				ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
				
				/* 
				****************************************************************
				Did customer update succeed ? *
				**************************************************************** */
				if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
					
					/* 
					Do nothing */
					instanceStateMachineController.sendEvent(Events.TO__9600_WRITE_PROCESSING_EXIT);
				} else {
					ctx.getWsMiscStorage().setLockedButUpdateFailed(true);
					JicsSyncpointBuilder.newInstance(ctx.getDfheiblk(), ctx)
					.rollback()
					.execute()
					.handleException();
					instanceStateMachineController.sendEvent(Events.TO__9600_WRITE_PROCESSING_EXIT);
					return;
				}
			} else {
				ctx.getWsMiscStorage().setLockedButUpdateFailed(true);
				instanceStateMachineController.sendEvent(Events.TO__9600_WRITE_PROCESSING_EXIT);
				return;
			}
		}

	}
}
