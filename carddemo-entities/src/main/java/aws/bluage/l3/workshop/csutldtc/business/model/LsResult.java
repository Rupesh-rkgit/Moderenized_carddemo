package aws.bluage.l3.workshop.csutldtc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LsResult.
 * 
 * <p>About 'lsResult' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class LsResult extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary lsResult = new Elementary(root,new AlphanumericType(80));
	

	/**
	 * Instantiate a new LsResult with a default record.
	 * @param configuration the configuration
	 */
	public LsResult(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LsResult bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LsResult(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute lsResult.
	 * @return the lsResult attribute reference
	 */
	public ElementaryRangeReference getLsResultReference() {
		return lsResult.getReference();
	}

	/**
	 * Getter for lsResult attribute.
	 * @return lsResult attribute
	 */
	public String getLsResult() {
		return lsResult.getValue();
	}

	/**
	 * Setter for lsResult attribute.
	 * @param lsResult the new value of lsResult
	 */
	public void setLsResult(String lsResult) {
		this.lsResult.setValue(lsResult);
	}
}
