package aws.bluage.l3.workshop.csutldtc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LsDateFormat.
 * 
 * <p>About 'lsDateFormat' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class LsDateFormat extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary lsDateFormat = new Elementary(root,new AlphanumericType(10));
	

	/**
	 * Instantiate a new LsDateFormat with a default record.
	 * @param configuration the configuration
	 */
	public LsDateFormat(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LsDateFormat bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LsDateFormat(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute lsDateFormat.
	 * @return the lsDateFormat attribute reference
	 */
	public ElementaryRangeReference getLsDateFormatReference() {
		return lsDateFormat.getReference();
	}

	/**
	 * Getter for lsDateFormat attribute.
	 * @return lsDateFormat attribute
	 */
	public String getLsDateFormat() {
		return lsDateFormat.getValue();
	}

	/**
	 * Setter for lsDateFormat attribute.
	 * @param lsDateFormat the new value of lsDateFormat
	 */
	public void setLsDateFormat(String lsDateFormat) {
		this.lsDateFormat.setValue(lsDateFormat);
	}
}
