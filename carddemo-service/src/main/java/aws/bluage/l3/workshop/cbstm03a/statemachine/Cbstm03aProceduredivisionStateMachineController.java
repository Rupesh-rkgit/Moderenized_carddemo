package aws.bluage.l3.workshop.cbstm03a.statemachine;

import aws.bluage.l3.workshop.cbstm03a.business.context.Cbstm03aContext;
import aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineController.Events;
import aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineController.States;
import aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineService;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;
import com.netfective.bluage.gapwalk.rt.context.RuntimeContext;
import com.netfective.bluage.gapwalk.rt.statemachine.SimpleStateMachineController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.config.configurers.StateConfigurer;
import org.springframework.stereotype.Component;

/**
 * Controller managing the state machine "Cbstm03aProceduredivisionStateMachine" execution.
 */
@Component("aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineController")
@Import({
aws.bluage.l3.workshop.cbstm03a.statemachine.Cbstm03aProceduredivisionStateMachineService.class
})
@Lazy
public class Cbstm03aProceduredivisionStateMachineController extends SimpleStateMachineController<States, Events> {
	
	/**
	 * State machine states.
	 */
	public enum States {
		PROCEDUREDIVISION, _0000_START, _8100_FILE_OPEN, FINAL
	}

	/**
	 * State machine events.
	 */
	public enum Events {
		TO_PROCEDUREDIVISION, TO__0000_START, TO__8100_FILE_OPEN, TO_FINAL
	}

	/**
	 * State machine state process service provider.
	 */
	@Autowired
	@Lazy
	private Cbstm03aProceduredivisionStateMachineService stateProcess;

	@Override
	protected void configureStateMachine(StateMachineStateConfigurer<States, Events> states, StateMachineTransitionConfigurer<States, Events> transitions) throws Exception {
		throw new UnsupportedOperationException("Please use the four arguments configureStateMachine method instead: configureStateMachine(StateMachineStateConfigurer<States, Events> states, StateMachineTransitionConfigurer<States, Events> transitions, RuntimeContext ctx, ExecutionController ctrl)");
	}
	
	@Override
	protected void configureStateMachine(StateMachineStateConfigurer<States, Events> states, StateMachineTransitionConfigurer<States, Events> transitions, RuntimeContext ctx, ExecutionController ctrl) throws Exception {
		StateConfigurer<States, Events> configurer = states.withStates();
		configurer.initial(States.PROCEDUREDIVISION).end(States.FINAL);
		Cbstm03aContext lctx = (Cbstm03aContext) ctx;
		configurer.state(States.PROCEDUREDIVISION, buildAction(() -> {stateProcess.proceduredivision(lctx, ctrl);}), null);
		configurer.state(States._0000_START, buildAction(() -> {stateProcess._0000Start(lctx, ctrl);}), null);
		configurer.state(States._8100_FILE_OPEN, buildAction(() -> {stateProcess._8100FileOpen(lctx, ctrl);}), null);
		
		configureTransitions(transitions);
	}
	
	/**
	 * Declare state machine transitions.
	 * @param transitions the transitions configuration helper
	 */
	private void configureTransitions(StateMachineTransitionConfigurer<States, Events> transitions) throws Exception {
		transitions.withExternal().source(States.PROCEDUREDIVISION).target(States._0000_START).event(Events.TO__0000_START);
		transitions.withExternal().source(States._0000_START).target(States._8100_FILE_OPEN).event(Events.TO__8100_FILE_OPEN);
		transitions.withExternal().source(States._0000_START).target(States.FINAL).event(Events.TO_FINAL);
		transitions.withExternal().source(States._8100_FILE_OPEN).target(States._0000_START).event(Events.TO__0000_START);
		transitions.withExternal().source(States._8100_FILE_OPEN).target(States.FINAL).event(Events.TO_FINAL);
	}
}
