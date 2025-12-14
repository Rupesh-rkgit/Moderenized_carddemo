package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LitAllNumFrom.
 * 
 * <p>About 'litAllNumFrom' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class LitAllNumFrom extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary litAllNumFrom = new Elementary(root,new AlphanumericType(10)," ");
	

	/**
	 * Instantiate a new LitAllNumFrom with a default record.
	 * @param configuration the configuration
	 */
	public LitAllNumFrom(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LitAllNumFrom bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LitAllNumFrom(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute litAllNumFrom.
	 * @return the litAllNumFrom attribute reference
	 */
	public ElementaryRangeReference getLitAllNumFromReference() {
		return litAllNumFrom.getReference();
	}

	/**
	 * Getter for litAllNumFrom attribute.
	 * @return litAllNumFrom attribute
	 */
	public String getLitAllNumFrom() {
		return litAllNumFrom.getValue();
	}

	/**
	 * Setter for litAllNumFrom attribute.
	 * @param litAllNumFrom the new value of litAllNumFrom
	 */
	public void setLitAllNumFrom(String litAllNumFrom) {
		this.litAllNumFrom.setValue(litAllNumFrom);
	}
}
