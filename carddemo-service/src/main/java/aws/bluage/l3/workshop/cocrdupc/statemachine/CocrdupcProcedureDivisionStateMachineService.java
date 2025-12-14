
package aws.bluage.l3.workshop.cocrdupc.statemachine;

import aws.bluage.l3.workshop.cocrdupc.business.context.CocrdupcContext;
import aws.bluage.l3.workshop.cocrdupc.service.CocrdupcProcess;
import aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineController.Events;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.ResponseCode;
import com.netfective.bluage.gapwalk.rt.jics.control.HandleAbendBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.jics.internal.JicsSyncpointBuilder;
import com.netfective.bluage.gapwalk.rt.jics.io.JicsIsolationLevel;
import com.netfective.bluage.gapwalk.rt.jics.io.internal.JicsFileBuilder;
import com.netfective.bluage.gapwalk.rt.statemachine.StateMachineControllerWithContinuation;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import com.netfective.bluage.gapwalk.runtime.statements.InspectBuilder;
import com.netfective.bluage.gapwalk.runtime.statements.StringConcatenationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Service class containing states process used to drive state machine "CocrdupcProcedureDivisionStateMachine".
 */
@Service("aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineService")
@Lazy
public class CocrdupcProcedureDivisionStateMachineService {
	
	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CocrdupcProcedureDivisionStateMachineService.class);

	/**
	 * The associated state machine controller.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineController")	
	private StateMachineControllerWithContinuation<Events> instanceStateMachineController;
	
	
	/**
	 * Service used by the state machine.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.cocrdupc.service.CocrdupcProcess")
	private CocrdupcProcess instanceCocrdupcProcess;
	
	
	

	/**
	 * State process operation _0000Main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _0000Main(CocrdupcContext ctx, ExecutionController ctrl) {
		instanceStateMachineController.registerSignalHandler(Events.TO_ABEND_ROUTINE, ctx, "ABEND_1_VIRTUAL_SIGNAL");
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		****************************************************************
		Program:     COCRDUPC.CBL                                     *
		Layer:       Business logic                                   *
		Function:    Accept and process credit card detail request    *
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
		*****************************************************************
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT */
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
			ctx.getWsThisProgcommarea().setCcupDetailsNotFetched(true);
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
		instanceCocrdupcProcess.yyyyStorePfkey(ctx, ctrl);
		
		/* 
		****************************************************************
		Check the AID to see if its valid at this point               *
		F3 - Exit
		Enter show screen again
		**************************************************************** */
		ctx.getWsMiscStorage().setPfkInvalid(true);
		if (ctx.getCcWorkAreas().isCcardAidEnter() || ctx.getCcWorkAreas().isCcardAidPfk03() || (ctx.getCcWorkAreas().isCcardAidPfk05() && ctx.getWsThisProgcommarea().isCcupChangesOkNotConfirmed()) || (ctx.getCcWorkAreas().isCcardAidPfk12() && !(ctx.getWsThisProgcommarea().isCcupDetailsNotFetched()))) {
			ctx.getWsMiscStorage().setPfkValid(true);
		} 
		if (ctx.getWsMiscStorage().isPfkInvalid()) {
			ctx.getCcWorkAreas().setCcardAidEnter(true);
		} 
		
		/* 
		****************************************************************
		Decide what to do based on inputs received
		**************************************************************** */
		if (ctx.getCcWorkAreas().isCcardAidPfk03() || (ctx.getWsThisProgcommarea().isCcupChangesOkayedAndDone() && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoLastMapsetReference(), ctx.getWsLiterals().getLitCclistmapsetReference()) == 0) || (ctx.getWsThisProgcommarea().isCcupChangesFailed() && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoLastMapsetReference(), ctx.getWsLiterals().getLitCclistmapsetReference()) == 0)) {
			
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
			if (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoLastMapsetReference(), ctx.getWsLiterals().getLitCclistmapsetReference()) == 0) {
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoAcctIdReference());
				DataUtils.setToZeroes(ctx.getCarddemoCommarea().getCdemoCardNumReference());
			} 
			ctx.getCarddemoCommarea().setCdemoUsrtypUser(true);
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			ctx.getCarddemoCommarea().setCdemoLastMapset(ctx.getWsLiterals().getLitThismapset());
			ctx.getCarddemoCommarea().getCdemoLastMapReference().setValue(ctx.getWsLiterals().getLitThismapReference());
			JicsSyncpointBuilder.newInstance(ctx.getDfheiblk(), ctx)
			.commit()
			.execute()
			.handleException();
			XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
		} else if ((ctx.getCarddemoCommarea().isCdemoPgmEnter() && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsLiterals().getLitCclistpgmReference()) == 0) || (ctx.getCcWorkAreas().isCcardAidPfk12() && DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsLiterals().getLitCclistpgmReference()) == 0)) {
			ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
			ctx.getWsMiscStorage().setInputOk(true);
			ctx.getWsMiscStorage().setFlgAcctfilterIsvalid(true);
			ctx.getWsMiscStorage().setFlgCardfilterIsvalid(true);
			ctx.getCcWorkAreas().setCcAcctIdN(ctx.getCarddemoCommarea().getCdemoAcctId());
			ctx.getCcWorkAreas().setCcCardNumN(ctx.getCarddemoCommarea().getCdemoCardNum());
			instanceCocrdupcProcess.readData(ctx, ctrl);
			ctx.getWsThisProgcommarea().setCcupShowDetails(true);
			instanceCocrdupcProcess.sendMap(ctx, ctrl);
			instanceCocrdupcProcess.commonReturn(ctx, ctrl);
		} else if ((ctx.getWsThisProgcommarea().isCcupDetailsNotFetched() && ctx.getCarddemoCommarea().isCdemoPgmEnter()) || (DataUtils.compare(ctx.getCarddemoCommarea().getCdemoFromProgramReference(), ctx.getWsLiterals().getLitMenupgmReference()) == 0 && !(ctx.getCarddemoCommarea().isCdemoPgmReenter()))) {
			ctx.getWsThisProgcommarea().getField().initialize();
			instanceCocrdupcProcess.sendMap(ctx, ctrl);
			ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
			ctx.getWsThisProgcommarea().setCcupDetailsNotFetched(true);
			instanceCocrdupcProcess.commonReturn(ctx, ctrl);
		} else if (ctx.getWsThisProgcommarea().isCcupChangesOkayedAndDone() || ctx.getWsThisProgcommarea().isCcupChangesFailed()) {
			ctx.getWsThisProgcommarea().getField().initialize();
			ctx.getWsMiscStorage().getField().initialize();
			DataUtils.initialize(ctx.getCarddemoCommarea().getCdemoAcctIdReference());
			DataUtils.initialize(ctx.getCarddemoCommarea().getCdemoCardNumReference());
			ctx.getCarddemoCommarea().setCdemoPgmEnter(true);
			instanceCocrdupcProcess.sendMap(ctx, ctrl);
			ctx.getCarddemoCommarea().setCdemoPgmReenter(true);
			ctx.getWsThisProgcommarea().setCcupDetailsNotFetched(true);
			instanceCocrdupcProcess.commonReturn(ctx, ctrl);
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
	void _2000DecideAction(CocrdupcContext ctx, ExecutionController ctrl) {
		if (ctx.getWsThisProgcommarea().isCcupDetailsNotFetched() || ctx.getCcWorkAreas().isCcardAidPfk12()) {
			
			/* 
			****************************************************************
			NO DETAILS SHOWN.
			SO GET THEM AND SETUP DETAIL EDIT SCREEN
			**************************************************************** */
			if (ctx.getWsMiscStorage().isFlgAcctfilterIsvalid() && ctx.getWsMiscStorage().isFlgCardfilterIsvalid()) {
				instanceCocrdupcProcess.readData(ctx, ctrl);
				if (ctx.getWsMiscStorage().isFoundCardsForAccount()) {
					ctx.getWsThisProgcommarea().setCcupShowDetails(true);
				} 
			} 
			
			/* 
			****************************************************************
			DETAILS SHOWN
			CHECK CHANGES AND ASK CONFIRMATION IF GOOD
			**************************************************************** */
		} else if (ctx.getWsThisProgcommarea().isCcupShowDetails()) {
			if (ctx.getWsMiscStorage().isInputError() || ctx.getWsMiscStorage().isNoChangesDetected()) {
				
				/* 
				Do nothing */
			} else {
				ctx.getWsThisProgcommarea().setCcupChangesOkNotConfirmed(true);
			}
			
			/* 
			****************************************************************
			DETAILS SHOWN
			BUT INPUT EDIT ERRORS FOUND
			**************************************************************** */
		} else if (ctx.getWsThisProgcommarea().isCcupChangesNotOk()) {
			
			/* 
			Do nothing
			****************************************************************
			DETAILS EDITED , FOUND OK, CONFIRM SAVE REQUESTED
			CONFIRMATION GIVEN.SO SAVE THE CHANGES
			**************************************************************** */
		} else if (ctx.getWsThisProgcommarea().isCcupChangesOkNotConfirmed() && ctx.getCcWorkAreas().isCcardAidPfk05()) {
			instanceStateMachineController.sendEvent(Events.TO__2000_DECIDE_ACTION_CASEBRANCH);
			return;
		} else if (ctx.getWsThisProgcommarea().isCcupChangesOkNotConfirmed()) {
			
			/* 
			Do nothing
			****************************************************************
			SHOW CONFIRMATION. GO BACK TO SQUARE 1
			**************************************************************** */
		} else if (ctx.getWsThisProgcommarea().isCcupChangesOkayedAndDone()) {
			ctx.getWsThisProgcommarea().setCcupShowDetails(true);
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
	 * State process operation _9200WriteProcessing.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9200WriteProcessing(CocrdupcContext ctx, ExecutionController ctrl) {
		
		/* 
		Read the Card file
		MOVE CC-ACCT-ID-N            TO WS-CARD-RID-ACCT-ID */
		ctx.getWsMiscStorage().getWsCardRidCardnumReference().setValue(ctx.getCcWorkAreas().getCcCardNumReference());
		JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitCardfilenameReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
		.read()
		.setIsolationLevel(JicsIsolationLevel.UPDATE)
		.updateNoToken()
		.into(ctx.getCardRecord())
		.length(150)
		.recordIndentificationField(ctx.getWsMiscStorage().getWsCardRidCardnumReference())
		.keyLength(16,false)
		.execute();
		ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
		ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
		
		/* 
		****************************************************************
		Could we lock the record ?
		**************************************************************** */
		if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
			
			/* 
			****************************************************************
			Did someone change the record while we were out ?
			****************************************************************
			Do nothing */
			instanceStateMachineController.addContinuationEvent(Events.TO__9200_WRITE_PROCESSING_POST__9300CHECKCHANGEINREC_THRU__9300CHECKCHANGEINRECEXIT, "END_OF__9300_CHECK_CHANGE_IN_REC_EXIT");
			instanceStateMachineController.sendEvent(Events.TO__9300_CHECK_CHANGE_IN_REC);
		} else {
			ctx.getWsMiscStorage().setInputError(true);
			if (ctx.getWsMiscStorage().isWsReturnMsgOff()) {
				ctx.getWsMiscStorage().setCouldNotLockForUpdate(true);
			} 
			instanceStateMachineController.sendEvent(Events.TO__9200_WRITE_PROCESSING_EXIT);
			return;
		}

	}
	/**
	 * State process operation _9200WriteProcessingExit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9200WriteProcessingExit(CocrdupcContext ctx, ExecutionController ctrl) {
				boolean res = false; 
		res = instanceStateMachineController.sendContinuationEventIfActive("END_OF__9200_WRITE_PROCESSING_EXIT");
		if (res) {
			return;
		} 

	}
	/**
	 * State process operation _9300CheckChangeInRec.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9300CheckChangeInRec(CocrdupcContext ctx, ExecutionController ctrl) {
		InspectBuilder.newInstance(ctx.getCardRecord().getCardEmbossedNameReference())
			.convert(ctx.getWsLiterals().getLitLowerReference())
			.to(ctx.getWsLiterals().getLitUpperReference())
			.apply();
		if (DataUtils.compareAlphInt(ctx.getCardRecord().getCardCvvCdReference().getValue(String.class), ctx.getWsThisProgcommarea().getCcupOldCvvCd()) == 0 && DataUtils.compare(ctx.getCardRecord().getCardEmbossedNameReference(), ctx.getWsThisProgcommarea().getCcupOldCrdnameReference()) == 0 && DataUtils.compare(ctx.getCardRecord().getCardExpiraionDateReference().getBytes(0, 4), ctx.getWsThisProgcommarea().getCcupOldExpyearReference()) == 0 && DataUtils.compare(ctx.getCardRecord().getCardExpiraionDateReference().getBytes(5, 2), ctx.getWsThisProgcommarea().getCcupOldExpmonReference()) == 0 && DataUtils.compare(ctx.getCardRecord().getCardExpiraionDateReference().getBytes(8, 2), ctx.getWsThisProgcommarea().getCcupOldExpdayReference()) == 0 && DataUtils.compare(ctx.getCardRecord().getCardActiveStatusReference(), ctx.getWsThisProgcommarea().getCcupOldCrdstcdReference()) == 0) {
			
			/* 
			Do nothing */
			instanceStateMachineController.sendEvent(Events.TO__9300_CHECK_CHANGE_IN_REC_EXIT);
		} else {
			ctx.getWsMiscStorage().setDataWasChangedBeforeUpdate(true);
			ctx.getWsThisProgcommarea().setCcupOldCvvCd(ctx.getCardRecord().getCardCvvCdReference().getValue(String.class));
			ctx.getWsThisProgcommarea().getCcupOldCrdnameReference().setValue(ctx.getCardRecord().getCardEmbossedNameReference());
			ctx.getWsThisProgcommarea().getCcupOldExpyearReference().setBytes(ctx.getCardRecord().getCardExpiraionDateReference().getBytes(0, 4));
			ctx.getWsThisProgcommarea().getCcupOldExpmonReference().setBytes(ctx.getCardRecord().getCardExpiraionDateReference().getBytes(5, 2));
			ctx.getWsThisProgcommarea().getCcupOldExpdayReference().setBytes(ctx.getCardRecord().getCardExpiraionDateReference().getBytes(8, 2));
			ctx.getWsThisProgcommarea().getCcupOldCrdstcdReference().setValue(ctx.getCardRecord().getCardActiveStatusReference());
			instanceStateMachineController.sendEvent(Events.TO__9200_WRITE_PROCESSING_EXIT);
			return;
		}

	}
	/**
	 * State process operation _9300CheckChangeInRecExit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9300CheckChangeInRecExit(CocrdupcContext ctx, ExecutionController ctrl) {
				boolean res = false; 
		res = instanceStateMachineController.sendContinuationEventIfActive("END_OF__9300_CHECK_CHANGE_IN_REC_EXIT");
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
	void abendRoutine(CocrdupcContext ctx, ExecutionController ctrl) {
				boolean res = false; 
		instanceCocrdupcProcess.abendRoutine(ctx, ctrl);
		res = instanceStateMachineController.sendContinuationEventIfActive("END_OF_ABEND_ROUTINE");
		if (res) {
			return;
		} else {
			instanceStateMachineController.sendEvent(Events.TO_FINAL);
		}

	}
	/**
	 * State process operation _0000MainCasebranch.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _0000MainCasebranch(CocrdupcContext ctx, ExecutionController ctrl) {
		instanceCocrdupcProcess.processInputs(ctx, ctrl);
		instanceStateMachineController.addContinuationEvent(Events.TO__0000_MAIN_POST__2000DECIDEACTION_THRU__2000DECIDEACTIONEXIT, "END_OF__2000_DECIDE_ACTION_POSTIF");
		instanceStateMachineController.sendEvent(Events.TO__2000_DECIDE_ACTION);

	}
	/**
	 * State process operation _2000DecideActionPostif.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _2000DecideActionPostif(CocrdupcContext ctx, ExecutionController ctrl) {
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
	void _2000DecideActionCasebranch(CocrdupcContext ctx, ExecutionController ctrl) {
		instanceStateMachineController.addContinuationEvent(Events.TO__2000_DECIDE_ACTION_POST__9200WRITEPROCESSING_THRU__9200WRITEPROCESSINGEXIT, "END_OF__9200_WRITE_PROCESSING_EXIT");
		instanceStateMachineController.sendEvent(Events.TO__9200_WRITE_PROCESSING);

	}
	/**
	 * State process operation _2000DecideActionCasebranch1.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _2000DecideActionCasebranch1(CocrdupcContext ctx, ExecutionController ctrl) {
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
	void _0000MainPost2000decideactionThru2000decideactionexit(CocrdupcContext ctx, ExecutionController ctrl) {
		instanceCocrdupcProcess.sendMap(ctx, ctrl);
		instanceCocrdupcProcess.commonReturn(ctx, ctrl);

	}
	/**
	 * State process operation _2000DecideActionPost9200writeprocessingThru9200writeprocessingexit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _2000DecideActionPost9200writeprocessingThru9200writeprocessingexit(CocrdupcContext ctx, ExecutionController ctrl) {
		if (ctx.getWsMiscStorage().isCouldNotLockForUpdate()) {
			ctx.getWsThisProgcommarea().setCcupChangesOkayedLockError(true);
		} else if (ctx.getWsMiscStorage().isLockedButUpdateFailed()) {
			ctx.getWsThisProgcommarea().setCcupChangesOkayedButFailed(true);
		} else if (ctx.getWsMiscStorage().isDataWasChangedBeforeUpdate()) {
			ctx.getWsThisProgcommarea().setCcupShowDetails(true);
		} else {
			ctx.getWsThisProgcommarea().setCcupChangesOkayedAndDone(true);
		}
		
		/* 
		****************************************************************
		DETAILS EDITED , FOUND OK, CONFIRM SAVE REQUESTED
		CONFIRMATION NOT GIVEN. SO SHOW DETAILS AGAIN
		**************************************************************** */
		instanceStateMachineController.sendEvent(Events.TO__2000_DECIDE_ACTION_POSTIF);

	}
	/**
	 * State process operation _9200WriteProcessingPost9300checkchangeinrecThru9300checkchangeinrecexit.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _9200WriteProcessingPost9300checkchangeinrecThru9300checkchangeinrecexit(CocrdupcContext ctx, ExecutionController ctrl) {
		if (ctx.getWsMiscStorage().isDataWasChangedBeforeUpdate()) {
			instanceStateMachineController.sendEvent(Events.TO__9200_WRITE_PROCESSING_EXIT);
			return;
		} else {
			
			/* 
			****************************************************************
			Prepare the update
			**************************************************************** */
			ctx.getWsThisProgcommarea().getCardUpdateRecordReference().getField().initialize();
			ctx.getWsThisProgcommarea().getCardUpdateNumReference().setValue(ctx.getWsThisProgcommarea().getCcupNewCardidReference());
			ctx.getWsThisProgcommarea().setCardUpdateAcctId(ctx.getCcWorkAreas().getCcAcctIdN());
			ctx.getWsMiscStorage().getCardCvvCdXReference().setValue(ctx.getWsThisProgcommarea().getCcupNewCvvCdReference());
			ctx.getWsThisProgcommarea().setCardUpdateCvvCd(ctx.getWsMiscStorage().getCardCvvCdN());
			ctx.getWsThisProgcommarea().getCardUpdateEmbossedNameReference().setValue(ctx.getWsThisProgcommarea().getCcupNewCrdnameReference());
			StringConcatenationBuilder.newInstance(ctx.getWsThisProgcommarea().getCardUpdateExpiraionDateReference())
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getCcupNewExpyearReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getCcupNewExpmonReference().getBytes())
				.addDelimitedBySize("-")
				.addDelimitedBySize(ctx.getWsThisProgcommarea().getCcupNewExpdayReference().getBytes())
				.end();
			ctx.getWsThisProgcommarea().getCardUpdateActiveStatusReference().setValue(ctx.getWsThisProgcommarea().getCcupNewCrdstcdReference());
			JicsFileBuilder.newInstance(ctx.getWsLiterals().getLitCardfilenameReference(), ctx.getDfheiblk(), ctx, ctrl.getExecutionContext())
			.rewrite()
			.from(ctx.getWsThisProgcommarea().getCardUpdateRecordReference())
			.length(150)
			.execute();
			ctx.getWsMiscStorage().setWsRespCd(ctx.getDfheiblk().getEibresp());
			ctx.getWsMiscStorage().setWsReasCd(ctx.getDfheiblk().getEibresp2());
			
			/* 
			****************************************************************
			Did the update succeed ?  *
			**************************************************************** */
			if (ctx.getWsMiscStorage().getWsRespCd() == ResponseCode.NORMAL.getIntValue()) {
				
				/* 
				Do nothing */
			} else {
				ctx.getWsMiscStorage().setLockedButUpdateFailed(true);
			}
			instanceStateMachineController.sendEvent(Events.TO__9200_WRITE_PROCESSING_EXIT);
		}

	}
}
