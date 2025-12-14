package aws.bluage.l3.workshop.coactvwc.statemachine;

import aws.bluage.l3.workshop.coactvwc.business.context.CoactvwcContext;
import aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineController.Events;
import aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineController.States;
import aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineService;
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
 * Controller managing the state machine "CoactvwcProcedureDivisionStateMachine" execution.
 */
@Component("aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineController")
@Import({
aws.bluage.l3.workshop.coactvwc.statemachine.CoactvwcProcedureDivisionStateMachineService.class
})
@Lazy
public class CoactvwcProcedureDivisionStateMachineController extends SimpleStateMachineController<States, Events> {
	
	/**
	 * State machine states.
	 */
	public enum States {
		_0000_MAIN_1, _0000_MAIN, ABEND_ROUTINE, FINAL, LOCAL_FINAL
	}

	/**
	 * State machine events.
	 */
	public enum Events {
		TO__0000_MAIN_1, TO__0000_MAIN, TO_ABEND_ROUTINE, TO_FINAL, TO_LOCAL_FINAL
	}

	/**
	 * State machine state process service provider.
	 */
	@Autowired
	@Lazy
	private CoactvwcProcedureDivisionStateMachineService stateProcess;

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
		CoactvwcContext lctx = (CoactvwcContext) ctx;
		subConfigurer.state(States._0000_MAIN, buildAction(() -> {stateProcess._0000Main(lctx, ctrl);}), null);
		subConfigurer.state(States.ABEND_ROUTINE, buildAction(() -> {stateProcess.abendRoutine(lctx, ctrl);}), null);
		
		configureTransitions(transitions);
	}
	
	/**
	 * Declare state machine transitions.
	 * @param transitions the transitions configuration helper
	 */
	private void configureTransitions(StateMachineTransitionConfigurer<States, Events> transitions) throws Exception {
		transitions.withLocal().source(States._0000_MAIN_1).target(States.ABEND_ROUTINE).event(Events.TO_ABEND_ROUTINE);
		transitions.withExternal().source(States.ABEND_ROUTINE).target(States.FINAL).event(Events.TO_FINAL);
	}
}
