package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LitAlphaSpacesTo.
 * 
 * <p>About 'litAlphaSpacesTo' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class LitAlphaSpacesTo extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary litAlphaSpacesTo = new Elementary(root,new AlphanumericType(52)," ");
	

	/**
	 * Instantiate a new LitAlphaSpacesTo with a default record.
	 * @param configuration the configuration
	 */
	public LitAlphaSpacesTo(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LitAlphaSpacesTo bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LitAlphaSpacesTo(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute litAlphaSpacesTo.
	 * @return the litAlphaSpacesTo attribute reference
	 */
	public ElementaryRangeReference getLitAlphaSpacesToReference() {
		return litAlphaSpacesTo.getReference();
	}

	/**
	 * Getter for litAlphaSpacesTo attribute.
	 * @return litAlphaSpacesTo attribute
	 */
	public String getLitAlphaSpacesTo() {
		return litAlphaSpacesTo.getValue();
	}

	/**
	 * Setter for litAlphaSpacesTo attribute.
	 * @param litAlphaSpacesTo the new value of litAlphaSpacesTo
	 */
	public void setLitAlphaSpacesTo(String litAlphaSpacesTo) {
		this.litAlphaSpacesTo.setValue(litAlphaSpacesTo);
	}
}
