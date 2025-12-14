package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LitAlphanumSpacesTo.
 * 
 * <p>About 'litAlphanumSpacesTo' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class LitAlphanumSpacesTo extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary litAlphanumSpacesTo = new Elementary(root,new AlphanumericType(62)," ");
	

	/**
	 * Instantiate a new LitAlphanumSpacesTo with a default record.
	 * @param configuration the configuration
	 */
	public LitAlphanumSpacesTo(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LitAlphanumSpacesTo bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LitAlphanumSpacesTo(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute litAlphanumSpacesTo.
	 * @return the litAlphanumSpacesTo attribute reference
	 */
	public ElementaryRangeReference getLitAlphanumSpacesToReference() {
		return litAlphanumSpacesTo.getReference();
	}

	/**
	 * Getter for litAlphanumSpacesTo attribute.
	 * @return litAlphanumSpacesTo attribute
	 */
	public String getLitAlphanumSpacesTo() {
		return litAlphanumSpacesTo.getValue();
	}

	/**
	 * Setter for litAlphanumSpacesTo attribute.
	 * @param litAlphanumSpacesTo the new value of litAlphanumSpacesTo
	 */
	public void setLitAlphanumSpacesTo(String litAlphanumSpacesTo) {
		this.litAlphanumSpacesTo.setValue(litAlphanumSpacesTo);
	}
}
