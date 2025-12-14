package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LitNumSpacesTo.
 * 
 * <p>About 'litNumSpacesTo' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class LitNumSpacesTo extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary litNumSpacesTo = new Elementary(root,new AlphanumericType(10)," ");
	

	/**
	 * Instantiate a new LitNumSpacesTo with a default record.
	 * @param configuration the configuration
	 */
	public LitNumSpacesTo(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LitNumSpacesTo bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LitNumSpacesTo(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute litNumSpacesTo.
	 * @return the litNumSpacesTo attribute reference
	 */
	public ElementaryRangeReference getLitNumSpacesToReference() {
		return litNumSpacesTo.getReference();
	}

	/**
	 * Getter for litNumSpacesTo attribute.
	 * @return litNumSpacesTo attribute
	 */
	public String getLitNumSpacesTo() {
		return litNumSpacesTo.getValue();
	}

	/**
	 * Setter for litNumSpacesTo attribute.
	 * @param litNumSpacesTo the new value of litNumSpacesTo
	 */
	public void setLitNumSpacesTo(String litNumSpacesTo) {
		this.litNumSpacesTo.setValue(litNumSpacesTo);
	}
}
