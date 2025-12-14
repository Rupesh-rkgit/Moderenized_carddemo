package aws.bluage.l3.workshop.core.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.netfective.bluage.gapwalk.rt.call.ProgramExecutionResult;
import com.netfective.bluage.gapwalk.rt.call.internal.StopRunUnitException;

import aws.bluage.l3.workshop.core.Abend;

/**
 * Class AbendImpl
 * 
 * Implement abend operations
 * Usage: public static ProgramExecutionResult success(int returnCode, boolean abend)
 * 
 * @see Abend
 */
@Service("aws.bluage.l3.workshop.core.Abend")
public class AbendImpl implements Abend {

	/**
	 * The logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(AbendImpl.class);

	@Override
	public void triggerAbend (int abendCode) {
		if (LOGGER.isInfoEnabled()) LOGGER.info("ABEND WITH CODE {}", abendCode);
		throw new StopRunUnitException(ProgramExecutionResult.success(abendCode, true));
	}

	@Override
	public void triggerAbend() {
		throw new StopRunUnitException(ProgramExecutionResult.success(-1, true));
	}

}