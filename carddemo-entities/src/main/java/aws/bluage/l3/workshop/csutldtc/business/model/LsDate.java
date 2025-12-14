package aws.bluage.l3.workshop.csutldtc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LsDate.
 * 
 * <p>About 'lsDate' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class LsDate extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary lsDate = new Elementary(root,new AlphanumericType(10));
	

	/**
	 * Instantiate a new LsDate with a default record.
	 * @param configuration the configuration
	 */
	public LsDate(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LsDate bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LsDate(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute lsDate.
	 * @return the lsDate attribute reference
	 */
	public ElementaryRangeReference getLsDateReference() {
		return lsDate.getReference();
	}

	/**
	 * Getter for lsDate attribute.
	 * @return lsDate attribute
	 */
	public String getLsDate() {
		return lsDate.getValue();
	}

	/**
	 * Setter for lsDate attribute.
	 * @param lsDate the new value of lsDate
	 */
	public void setLsDate(String lsDate) {
		this.lsDate.setValue(lsDate);
	}
}
