package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PointerType;
/**
 * Data simplifier entity Psaptr.
 * 
 * <p>About 'psaptr' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Psaptr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary psaptr = new Elementary(root,new PointerType());
	

	/**
	 * Instantiate a new Psaptr with a default record.
	 * @param configuration the configuration
	 */
	public Psaptr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Psaptr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Psaptr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute psaptr.
	 * @return the psaptr attribute reference
	 */
	public ElementaryRangeReference getPsaptrReference() {
		return psaptr.getReference();
	}

	/**
	 * Getter for psaptr attribute.
	 * @return psaptr attribute
	 */
	public Integer getPsaptr() {
		return psaptr.getValue();
	}

	/**
	 * Setter for psaptr attribute.
	 * @param psaptr the new value of psaptr
	 */
	public void setPsaptr(Integer psaptr) {
		this.psaptr.setValue(psaptr);
	}
}
