package aws.bluage.l3.workshop.csutldtc.service;

import aws.bluage.l3.workshop.csutldtc.business.context.CsutldtcContext;
import com.netfective.bluage.gapwalk.rt.call.ExecutionController;

/**
 * Interface CsutldtcProcess.
 * 
 * Defines application services for CsutldtcProcess
 */
public interface CsutldtcProcess {

	/**
	 * Process operation procedureDivision.
	 * 
	 * PROGRAM-ID.CSUTLDTC.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void procedureDivision(final CsutldtcContext ctx, final ExecutionController ctrl);

	/**
	 * Process operation a000Main.
	 * 
	 * @param ctx 
	 * @param ctrl 
	 */
	void a000Main(final CsutldtcContext ctx, final ExecutionController ctrl);

}
