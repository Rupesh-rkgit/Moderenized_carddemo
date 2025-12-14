package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity Abcode.
 * 
 * <p>About 'abcode' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Abcode extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary abcode = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true));
	

	/**
	 * Instantiate a new Abcode with a default record.
	 * @param configuration the configuration
	 */
	public Abcode(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Abcode bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Abcode(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute abcode.
	 * @return the abcode attribute reference
	 */
	public ElementaryRangeReference getAbcodeReference() {
		return abcode.getReference();
	}

	/**
	 * Getter for abcode attribute.
	 * @return abcode attribute
	 */
	public int getAbcode() {
		return abcode.getValue();
	}

	/**
	 * Setter for abcode attribute.
	 * @param abcode the new value of abcode
	 */
	public void setAbcode(int abcode) {
		this.abcode.setValue(abcode);
	}
}
