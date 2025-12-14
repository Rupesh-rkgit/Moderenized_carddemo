package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity ExternalParms.
 * 
 * <p>About 'parmLength' field, <br>
 * </p>
 * 
 * <p>About 'parmDate' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class ExternalParms extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary parmLength = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true));
	private final Elementary parmDate = new Elementary(root,new AlphanumericType(10));
	

	/**
	 * Instantiate a new ExternalParms with a default record.
	 * @param configuration the configuration
	 */
	public ExternalParms(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new ExternalParms bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public ExternalParms(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute parmLength.
	 * @return the parmLength attribute reference
	 */
	public ElementaryRangeReference getParmLengthReference() {
		return parmLength.getReference();
	}

	/**
	 * Getter for parmLength attribute.
	 * @return parmLength attribute
	 */
	public int getParmLength() {
		return parmLength.getValue();
	}

	/**
	 * Setter for parmLength attribute.
	 * @param parmLength the new value of parmLength
	 */
	public void setParmLength(int parmLength) {
		this.parmLength.setValue(parmLength);
	}
	/**
	 * Gets the reference for attribute parmDate.
	 * @return the parmDate attribute reference
	 */
	public ElementaryRangeReference getParmDateReference() {
		return parmDate.getReference();
	}

	/**
	 * Getter for parmDate attribute.
	 * @return parmDate attribute
	 */
	public String getParmDate() {
		return parmDate.getValue();
	}

	/**
	 * Setter for parmDate attribute.
	 * @param parmDate the new value of parmDate
	 */
	public void setParmDate(String parmDate) {
		this.parmDate.setValue(parmDate);
	}
}
