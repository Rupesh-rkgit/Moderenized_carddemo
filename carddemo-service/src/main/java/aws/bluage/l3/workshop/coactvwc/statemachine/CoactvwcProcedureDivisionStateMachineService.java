
package aws.bluage.l3.workshop.coactvwc.statemachine;

import aws.bluage.l3.workshop.coactvwc.business.context.CoactvwcContext;
import aws.bluage.l3.workshop.coactvwc.service.CoactvwcProcess;
import aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineController.Events;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.jics.bms.SendTextBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.AbendBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.HandleAbendBuilder;
import com.netfective.bluage.gapwalk.rt.jics.control.XCTLBuilder;
import com.netfective.bluage.gapwalk.rt.statemachine.StateMachineController;
import com.netfective.bluage.gapwalk.rt.utils.ArgUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Service class containing states process used to drive state machine "CoactvwcProcedureDivisionStateMachine".
 */
@Service("aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineService")
@Lazy
public class CoactvwcProcedureDivisionStateMachineService {
	
	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CoactvwcProcedureDivisionStateMachineService.class);

	/**
	 * The associated state machine controller.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineController")	
	private StateMachineController<Events> instanceStateMachineController;
	
	
	/**
	 * Service used by the state machine.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.coactvwc.service.CoactvwcProcess")
	private CoactvwcProcess instanceCoactvwcProcess;
	
	
	

	/**
	 * State process operation _0000Main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _0000Main(CoactvwcContext ctx, ExecutionController ctrl) {
		instanceStateMachineController.registerSignalHandler(Events.TO_ABEND_ROUTINE, ctx, "ABEND_1_VIRTUAL_SIGNAL");
		ctx.getDfheiblk().bind(ArgUtils.get(ctx, 0));
		ctx.getDfhcommarea().bind(ArgUtils.get(ctx, 1));
		
		/* 
		****************************************************************
		Program:     COACTVWC.CBL                                     *
		Layer:       Business logic                                   *
		Function:    Accept and process Account View request          *
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
		instanceCoactvwcProcess.yyyyStorePfkey(ctx, ctrl);
		
		/* 
		****************************************************************
		Check the AID to see if its valid at this point               *
		F3 - Exit
		Enter show screen again
		**************************************************************** */
		ctx.getWsMiscStorage().setPfkInvalid(true);
		if (ctx.getCcWorkAreas().isCcardAidEnter() || ctx.getCcWorkAreas().isCcardAidPfk03()) {
			ctx.getWsMiscStorage().setPfkValid(true);
		} 
		if (ctx.getWsMiscStorage().isPfkInvalid()) {
			ctx.getCcWorkAreas().setCcardAidEnter(true);
		} 
		
		/* 
		****************************************************************
		Decide what to do based on inputs received
		****************************************************************
		****************************************************************
		****************************************************************
		Decide what to do based on inputs received
		**************************************************************** */
		if (ctx.getCcWorkAreas().isCcardAidPfk03()) {
			
			/* 
			****************************************************************
			XCTL TO CALLING PROGRAM OR MAIN MENU
			**************************************************************** */
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
			XCTLBuilder.newInstance(ctx.getDfheiblk(), ctx).withProgram(ctx.getCarddemoCommarea().getCdemoToProgramReference()).withNonParentCommarea(ctx.getCarddemoCommarea()).execute().handleException();
		} else if (ctx.getCarddemoCommarea().isCdemoPgmEnter()) {
			
			/* 
			****************************************************************
			COMING FROM SOME OTHER CONTEXT
			SELECTION CRITERIA TO BE GATHERED
			**************************************************************** */
			instanceCoactvwcProcess.sendMap(ctx, ctrl);
			instanceCoactvwcProcess.commonReturn(ctx, ctrl);
		} else if (ctx.getCarddemoCommarea().isCdemoPgmReenter()) {
			instanceCoactvwcProcess.processInputs(ctx, ctrl);
			if (ctx.getWsMiscStorage().isInputError()) {
				instanceCoactvwcProcess.sendMap(ctx, ctrl);
				instanceCoactvwcProcess.commonReturn(ctx, ctrl);
			} else {
				instanceCoactvwcProcess.readAcct(ctx, ctrl);
				instanceCoactvwcProcess.sendMap(ctx, ctrl);
				instanceCoactvwcProcess.commonReturn(ctx, ctrl);
			}
		} else {
			ctx.getAbendData().getAbendCulpritReference().setValue(ctx.getWsLiterals().getLitThispgmReference());
			ctx.getAbendData().setAbendCode("0001");
			DataUtils.setToBlank(ctx.getAbendData().getAbendReasonReference());
			ctx.getWsMiscStorage().setWsReturnMsg("UNEXPECTED DATA SCENARIO");
			instanceCoactvwcProcess.sendPlainText(ctx, ctrl);
		}
		
		/* 
		If we had an error setup error message that slipped through
		Display and return */
		if (ctx.getWsMiscStorage().isInputError()) {
			ctx.getCcWorkAreas().getCcardErrorMsgReference().setValue(ctx.getWsMiscStorage().getWsReturnMsgReference());
			instanceCoactvwcProcess.sendMap(ctx, ctrl);
			instanceCoactvwcProcess.commonReturn(ctx, ctrl);
		} 

	}
	/**
	 * State process operation abendRoutine.
	 * 
	 *  Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void abendRoutine(CoactvwcContext ctx, ExecutionController ctrl) {
		if (DataUtils.isLowValue(ctx.getAbendData().getAbendMsgReference())) {
			ctx.getAbendData().setAbendMsg("UNEXPECTED ABEND OCCURRED.");
		} 
		ctx.getAbendData().getAbendCulpritReference().setValue(ctx.getWsLiterals().getLitThispgmReference());
		SendTextBuilder.newInstance(ctx.getDfheiblk(), ctx)
		.withData(ctx.getAbendData())
		.withLength(134)
		.execute();
		HandleAbendBuilder.newInstance(ctx.getDfheiblk(), ctx).cancel().execute().handleException();
		AbendBuilder.newInstance(ctx.getDfheiblk(), ctx).withAbendCode("9999").execute().handleException();
		
		/* 
		Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:32 CDT */
		instanceStateMachineController.sendEvent(Events.TO_FINAL);

	}
}
