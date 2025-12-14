package aws.bluage.l3.workshop.cocrdupc.statemachine;

import aws.bluage.l3.workshop.cocrdupc.business.context.CocrdupcContext;
import aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineController.Events;
import aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineController.States;
import aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineService;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.context.RuntimeContext;
import com.netfective.bluage.gapwalk.rt.statemachine.MultipleActiveContinuationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.config.configurers.StateConfigurer;
import org.springframework.stereotype.Component;

/**
 * Controller managing the state machine "CocrdupcProcedureDivisionStateMachine" execution.
 */
@Component("aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineController")
@Import({
aws.bluage.l3.workshop.cocrdupc.statemachine.CocrdupcProcedureDivisionStateMachineService.class
})
@Lazy
public class CocrdupcProcedureDivisionStateMachineController extends MultipleActiveContinuationController<States, Events> {
	
	/**
	 * State machine states.
	 */
	public enum States {
		_0000_MAIN_1, _0000_MAIN, _2000_DECIDE_ACTION, _9200_WRITE_PROCESSING, _9200_WRITE_PROCESSING_EXIT, _9300_CHECK_CHANGE_IN_REC, _9300_CHECK_CHANGE_IN_REC_EXIT, ABEND_ROUTINE, _0000_MAIN_CASEBRANCH, _2000_DECIDE_ACTION_POSTIF, _2000_DECIDE_ACTION_CASEBRANCH, _2000_DECIDE_ACTION_CASEBRANCH_1, _0000_MAIN_POST__2000DECIDEACTION_THRU__2000DECIDEACTIONEXIT, _2000_DECIDE_ACTION_POST__9200WRITEPROCESSING_THRU__9200WRITEPROCESSINGEXIT, _9200_WRITE_PROCESSING_POST__9300CHECKCHANGEINREC_THRU__9300CHECKCHANGEINRECEXIT, FINAL, LOCAL_FINAL
	}

	/**
	 * State machine events.
	 */
	public enum Events {
		TO__0000_MAIN_1, TO__0000_MAIN, TO__2000_DECIDE_ACTION, TO__9200_WRITE_PROCESSING, TO__9200_WRITE_PROCESSING_EXIT, TO__9300_CHECK_CHANGE_IN_REC, TO__9300_CHECK_CHANGE_IN_REC_EXIT, TO_ABEND_ROUTINE, TO__0000_MAIN_CASEBRANCH, TO__2000_DECIDE_ACTION_POSTIF, TO__2000_DECIDE_ACTION_CASEBRANCH, TO__2000_DECIDE_ACTION_CASEBRANCH_1, TO__0000_MAIN_POST__2000DECIDEACTION_THRU__2000DECIDEACTIONEXIT, TO__2000_DECIDE_ACTION_POST__9200WRITEPROCESSING_THRU__9200WRITEPROCESSINGEXIT, TO__9200_WRITE_PROCESSING_POST__9300CHECKCHANGEINREC_THRU__9300CHECKCHANGEINRECEXIT, TO_FINAL, TO_LOCAL_FINAL
	}

	/**
	 * State machine state process service provider.
	 */
	@Autowired
	@Lazy
	private CocrdupcProcedureDivisionStateMachineService stateProcess;

	@Override
	protected void configureStateMachine(StateMachineStateConfigurer<States, Events> states, StateMachineTransitionConfigurer<States, Events> transitions) throws Exception {
		throw new UnsupportedOperationException("Please use the four arguments configureStateMachine method instead: configureStateMachine(StateMachineStateConfigurer<States, Events> states, StateMachineTransitionConfigurer<States, Events> transitions, RuntimeContext ctx, ExecutionController ctrl)");
	}
	
	@Override
	protected void configureStateMachine(StateMachineStateConfigurer<States, Events> states, StateMachineTransitionConfigurer<States, Events> transitions, RuntimeContext ctx, ExecutionController ctrl) throws Exception {
		StateConfigurer<States, Events> configurer = states.withStates();
		configurer.initial(States._0000_MAIN_1).end(States.FINAL);
		configurer.state(States._0000_MAIN_1);	
		configurer.state(States.FINAL);
		
		StateConfigurer<States, Events> subConfigurer = states.withStates().parent(States._0000_MAIN_1);
		subConfigurer.initial(States._0000_MAIN).end(States.LOCAL_FINAL);
		CocrdupcContext lctx = (CocrdupcContext) ctx;
		subConfigurer.state(States._0000_MAIN, buildAction(() -> {stateProcess._0000Main(lctx, ctrl);}), null);
		subConfigurer.state(States._2000_DECIDE_ACTION, buildAction(() -> {stateProcess._2000DecideAction(lctx, ctrl);}), null);
		subConfigurer.state(States._9200_WRITE_PROCESSING, buildAction(() -> {stateProcess._9200WriteProcessing(lctx, ctrl);}), null);
		subConfigurer.state(States._9200_WRITE_PROCESSING_EXIT, buildAction(() -> {stateProcess._9200WriteProcessingExit(lctx, ctrl);}), null);
		subConfigurer.state(States._9300_CHECK_CHANGE_IN_REC, buildAction(() -> {stateProcess._9300CheckChangeInRec(lctx, ctrl);}), null);
		subConfigurer.state(States._9300_CHECK_CHANGE_IN_REC_EXIT, buildAction(() -> {stateProcess._9300CheckChangeInRecExit(lctx, ctrl);}), null);
		subConfigurer.state(States.ABEND_ROUTINE, buildAction(() -> {stateProcess.abendRoutine(lctx, ctrl);}), null);
		subConfigurer.state(States._0000_MAIN_CASEBRANCH, buildAction(() -> {stateProcess._0000MainCasebranch(lctx, ctrl);}), null);
		subConfigurer.state(States._2000_DECIDE_ACTION_POSTIF, buildAction(() -> {stateProcess._2000DecideActionPostif(lctx, ctrl);}), null);
		subConfigurer.state(States._2000_DECIDE_ACTION_CASEBRANCH, buildAction(() -> {stateProcess._2000DecideActionCasebranch(lctx, ctrl);}), null);
		subConfigurer.state(States._2000_DECIDE_ACTION_CASEBRANCH_1, buildAction(() -> {stateProcess._2000DecideActionCasebranch1(lctx, ctrl);}), null);
		subConfigurer.state(States._0000_MAIN_POST__2000DECIDEACTION_THRU__2000DECIDEACTIONEXIT, buildAction(() -> {stateProcess._0000MainPost2000decideactionThru2000decideactionexit(lctx, ctrl);}), null);
		subConfigurer.state(States._2000_DECIDE_ACTION_POST__9200WRITEPROCESSING_THRU__9200WRITEPROCESSINGEXIT, buildAction(() -> {stateProcess._2000DecideActionPost9200writeprocessingThru9200writeprocessingexit(lctx, ctrl);}), null);
		subConfigurer.state(States._9200_WRITE_PROCESSING_POST__9300CHECKCHANGEINREC_THRU__9300CHECKCHANGEINRECEXIT, buildAction(() -> {stateProcess._9200WriteProcessingPost9300checkchangeinrecThru9300checkchangeinrecexit(lctx, ctrl);}), null);
		
		configureTransitions(transitions);
	}
	
	/**
	 * Declare state machine transitions.
	 * @param transitions the transitions configuration helper
	 */
	private void configureTransitions(StateMachineTransitionConfigurer<States, Events> transitions) throws Exception {
		transitions.withLocal().source(States._0000_MAIN_1).target(States.ABEND_ROUTINE).event(Events.TO_ABEND_ROUTINE);
		transitions.withExternal().source(States._0000_MAIN).target(States._0000_MAIN_CASEBRANCH).event(Events.TO__0000_MAIN_CASEBRANCH);
		transitions.withExternal().source(States._2000_DECIDE_ACTION).target(States._2000_DECIDE_ACTION_CASEBRANCH).event(Events.TO__2000_DECIDE_ACTION_CASEBRANCH);
		transitions.withExternal().source(States._2000_DECIDE_ACTION).target(States._2000_DECIDE_ACTION_CASEBRANCH_1).event(Events.TO__2000_DECIDE_ACTION_CASEBRANCH_1);
		transitions.withExternal().source(States._2000_DECIDE_ACTION).target(States._2000_DECIDE_ACTION_POSTIF).event(Events.TO__2000_DECIDE_ACTION_POSTIF);
		transitions.withExternal().source(States._9200_WRITE_PROCESSING).target(States._9200_WRITE_PROCESSING_EXIT).event(Events.TO__9200_WRITE_PROCESSING_EXIT);
		transitions.withExternal().source(States._9200_WRITE_PROCESSING).target(States._9300_CHECK_CHANGE_IN_REC).event(Events.TO__9300_CHECK_CHANGE_IN_REC);
		transitions.withExternal().source(States._9200_WRITE_PROCESSING_EXIT).target(States._2000_DECIDE_ACTION_POST__9200WRITEPROCESSING_THRU__9200WRITEPROCESSINGEXIT).event(Events.TO__2000_DECIDE_ACTION_POST__9200WRITEPROCESSING_THRU__9200WRITEPROCESSINGEXIT);
		transitions.withExternal().source(States._9300_CHECK_CHANGE_IN_REC).target(States._9200_WRITE_PROCESSING_EXIT).event(Events.TO__9200_WRITE_PROCESSING_EXIT);
		transitions.withExternal().source(States._9300_CHECK_CHANGE_IN_REC).target(States._9300_CHECK_CHANGE_IN_REC_EXIT).event(Events.TO__9300_CHECK_CHANGE_IN_REC_EXIT);
		transitions.withExternal().source(States._9300_CHECK_CHANGE_IN_REC_EXIT).target(States._9200_WRITE_PROCESSING_POST__9300CHECKCHANGEINREC_THRU__9300CHECKCHANGEINRECEXIT).event(Events.TO__9200_WRITE_PROCESSING_POST__9300CHECKCHANGEINREC_THRU__9300CHECKCHANGEINRECEXIT);
		transitions.withExternal().source(States.ABEND_ROUTINE).target(States.FINAL).event(Events.TO_FINAL);
		transitions.withExternal().source(States.ABEND_ROUTINE).target(States._2000_DECIDE_ACTION_POSTIF).event(Events.TO__2000_DECIDE_ACTION_POSTIF);
		transitions.withExternal().source(States._0000_MAIN_CASEBRANCH).target(States._2000_DECIDE_ACTION).event(Events.TO__2000_DECIDE_ACTION);
		transitions.withExternal().source(States._2000_DECIDE_ACTION_POSTIF).target(States._0000_MAIN_POST__2000DECIDEACTION_THRU__2000DECIDEACTIONEXIT).event(Events.TO__0000_MAIN_POST__2000DECIDEACTION_THRU__2000DECIDEACTIONEXIT);
		transitions.withExternal().source(States._2000_DECIDE_ACTION_CASEBRANCH).target(States._9200_WRITE_PROCESSING).event(Events.TO__9200_WRITE_PROCESSING);
		transitions.withExternal().source(States._2000_DECIDE_ACTION_CASEBRANCH_1).target(States.ABEND_ROUTINE).event(Events.TO_ABEND_ROUTINE);
		transitions.withExternal().source(States._2000_DECIDE_ACTION_POST__9200WRITEPROCESSING_THRU__9200WRITEPROCESSINGEXIT).target(States._2000_DECIDE_ACTION_POSTIF).event(Events.TO__2000_DECIDE_ACTION_POSTIF);
		transitions.withExternal().source(States._9200_WRITE_PROCESSING_POST__9300CHECKCHANGEINREC_THRU__9300CHECKCHANGEINRECEXIT).target(States._9200_WRITE_PROCESSING_EXIT).event(Events.TO__9200_WRITE_PROCESSING_EXIT);
	}
}
