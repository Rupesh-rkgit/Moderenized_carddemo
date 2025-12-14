package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity Timing.
 * 
 * <p>About 'timing' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Timing extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary timing = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true));
	

	/**
	 * Instantiate a new Timing with a default record.
	 * @param configuration the configuration
	 */
	public Timing(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Timing bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Timing(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute timing.
	 * @return the timing attribute reference
	 */
	public ElementaryRangeReference getTimingReference() {
		return timing.getReference();
	}

	/**
	 * Getter for timing attribute.
	 * @return timing attribute
	 */
	public int getTiming() {
		return timing.getValue();
	}

	/**
	 * Setter for timing attribute.
	 * @param timing the new value of timing
	 */
	public void setTiming(int timing) {
		this.timing.setValue(timing);
	}
}
