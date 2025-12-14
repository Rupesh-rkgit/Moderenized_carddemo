
package aws.bluage.l3.workshop.cbstm03a.statemachine;

import aws.bluage.l3.workshop.cbstm03a.business.context.Cbstm03aContext;
import aws.bluage.l3.workshop.cbstm03a.service.Cbstm03aProcess;
import aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineController.Events;
import com.netfective.bluage.gapwalk.datasimplifier.utils.DataUtils;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.io.OpenMode;
import com.netfective.bluage.gapwalk.rt.io.SequentialFile;
import com.netfective.bluage.gapwalk.rt.statemachine.StateMachineController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Service class containing states process used to drive state machine "Cbstm03aProceduredivisionStateMachine".
 */
@Service("aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineService")
@Lazy
public class Cbstm03aProceduredivisionStateMachineService {
	
	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Cbstm03aProceduredivisionStateMachineService.class);

	/**
	 * The associated state machine controller.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineController")	
	private StateMachineController<Events> instanceStateMachineController;
	
	
	/**
	 * Service used by the state machine.
	 */
	@Autowired
	@Qualifier("aws.bluage.l3.workshop.cbstm03a.service.Cbstm03aProcess")
	private Cbstm03aProcess instanceCbstm03aProcess;
	
	
	

	/**
	 * State process operation proceduredivision.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void proceduredivision(Cbstm03aContext ctx, ExecutionController ctrl) {
				SequentialFile htmlFile = ctx.getHtmlFileHandler(ctrl.getExecutionContext()); 
				SequentialFile stmtFile = ctx.getStmtFileHandler(ctrl.getExecutionContext()); 
		
		/* 
		****************************************************************
		**************************************************************** */
		stmtFile.open(OpenMode.OUTPUT);
		htmlFile.open(OpenMode.OUTPUT);
		ctx.getWsTrnxTable().getField().initialize();
		ctx.getWsTrnTblCntr().getField().initialize();
		instanceStateMachineController.sendEvent(Events.TO__0000_START);

	}
	/**
	 * State process operation _0000Start.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _0000Start(Cbstm03aContext ctx, ExecutionController ctrl) {
		while (true) {
			if (DataUtils.compare(ctx.getMiscVariables().getWsFlDdReference(), "TRNXFILE") == 0) {
				ctx.set_8100FileOpenTarget(1);
				instanceStateMachineController.sendEvent(Events.TO__8100_FILE_OPEN);
				return;
			} else if (DataUtils.compare(ctx.getMiscVariables().getWsFlDdReference(), "XREFFILE") == 0) {
				ctx.set_8100FileOpenTarget(2);
				instanceStateMachineController.sendEvent(Events.TO__8100_FILE_OPEN);
				return;
			} else if (DataUtils.compare(ctx.getMiscVariables().getWsFlDdReference(), "CUSTFILE") == 0) {
				ctx.set_8100FileOpenTarget(3);
				instanceStateMachineController.sendEvent(Events.TO__8100_FILE_OPEN);
				return;
			} else if (DataUtils.compare(ctx.getMiscVariables().getWsFlDdReference(), "ACCTFILE") == 0) {
				ctx.set_8100FileOpenTarget(4);
				instanceStateMachineController.sendEvent(Events.TO__8100_FILE_OPEN);
				return;
			} else if (DataUtils.compare(ctx.getMiscVariables().getWsFlDdReference(), "READTRNX") == 0) {
				instanceCbstm03aProcess.readtrnxRead(ctx, ctrl);
				continue;
			} else {
				instanceCbstm03aProcess.goback(ctx, ctrl);
				instanceStateMachineController.sendEvent(Events.TO_FINAL);
				return;
			}
		}

	}
	/**
	 * State process operation _8100FileOpen.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void _8100FileOpen(Cbstm03aContext ctx, ExecutionController ctrl) {
		if (ctx.get_8100FileOpenTarget() == 1) {
			instanceCbstm03aProcess.trnxfileOpen(ctx, ctrl);
			instanceStateMachineController.sendEvent(Events.TO__0000_START);
			return;
		} else if (ctx.get_8100FileOpenTarget() == 2) {
			instanceCbstm03aProcess.xreffileOpen(ctx, ctrl);
			instanceStateMachineController.sendEvent(Events.TO__0000_START);
			return;
		} else if (ctx.get_8100FileOpenTarget() == 3) {
			instanceCbstm03aProcess.custfileOpen(ctx, ctrl);
			instanceStateMachineController.sendEvent(Events.TO__0000_START);
			return;
		} else if (ctx.get_8100FileOpenTarget() == 4) {
			instanceCbstm03aProcess.acctfileOpen(ctx, ctrl);
			instanceCbstm03aProcess.goback(ctx, ctrl);
			instanceStateMachineController.sendEvent(Events.TO_FINAL);
			return;
		} else {
			
			/* 
			---------------------------------------------------------------* */
			instanceCbstm03aProcess.trnxfileOpen(ctx, ctrl);
			instanceStateMachineController.sendEvent(Events.TO__0000_START);
		}

	}
}
