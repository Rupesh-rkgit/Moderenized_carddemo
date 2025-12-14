package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LitAllAlphanumFrom.
 * 
 * <p>About 'litAllAlphanumFrom' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class LitAllAlphanumFrom extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary litAllAlphanumFrom = new Elementary(root,new AlphanumericType(62)," ");
	

	/**
	 * Instantiate a new LitAllAlphanumFrom with a default record.
	 * @param configuration the configuration
	 */
	public LitAllAlphanumFrom(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LitAllAlphanumFrom bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LitAllAlphanumFrom(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute litAllAlphanumFrom.
	 * @return the litAllAlphanumFrom attribute reference
	 */
	public ElementaryRangeReference getLitAllAlphanumFromReference() {
		return litAllAlphanumFrom.getReference();
	}

	/**
	 * Getter for litAllAlphanumFrom attribute.
	 * @return litAllAlphanumFrom attribute
	 */
	public String getLitAllAlphanumFrom() {
		return litAllAlphanumFrom.getValue();
	}

	/**
	 * Setter for litAllAlphanumFrom attribute.
	 * @param litAllAlphanumFrom the new value of litAllAlphanumFrom
	 */
	public void setLitAllAlphanumFrom(String litAllAlphanumFrom) {
		this.litAllAlphanumFrom.setValue(litAllAlphanumFrom);
	}
}
