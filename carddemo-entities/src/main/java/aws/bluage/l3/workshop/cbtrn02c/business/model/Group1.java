package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity Group1.
 * 
 * <p>About 'twoBytesBinary' field, <br>
 * </p>
 * 
 * <p>About 'twoBytesAlpha' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.TwoBytesAlpha
 * <br></p>
 * 
 * @see RecordEntity
 */
public class Group1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Union union = new Union(root);
	private final Elementary twoBytesBinary = new Elementary(union,new BinaryType(4, 0, "STD", false));
	private final Group twoBytesAlpha = new Group(union);
	private final Elementary twoBytesLeft = new Elementary(twoBytesAlpha,new AlphanumericType(1));
	private final Elementary twoBytesRight = new Elementary(twoBytesAlpha,new AlphanumericType(1));
	

	/**
	 * Instantiate a new Group1 with a default record.
	 * @param configuration the configuration
	 */
	public Group1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Group1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Group1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute twoBytesBinary.
	 * @return the twoBytesBinary attribute reference
	 */
	public ElementaryRangeReference getTwoBytesBinaryReference() {
		return twoBytesBinary.getReference();
	}

	/**
	 * Getter for twoBytesBinary attribute.
	 * @return twoBytesBinary attribute
	 */
	public int getTwoBytesBinary() {
		return twoBytesBinary.getValue();
	}

	/**
	 * Setter for twoBytesBinary attribute.
	 * @param twoBytesBinary the new value of twoBytesBinary
	 */
	public void setTwoBytesBinary(int twoBytesBinary) {
		this.twoBytesBinary.setValue(twoBytesBinary);
	}
	
	/**
	 * Gets the reference for attribute twoBytesAlpha.
	 * @return the twoBytesAlpha attribute reference
	 */
	public RangeReference getTwoBytesAlphaReference() {
		return twoBytesAlpha.getReference();
	}	
				
	/**
	 * Setter for twoBytesAlpha .
	 */
   	public void setTwoBytesAlpha(RangeReference reference) {
       	twoBytesAlpha.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute twoBytesLeft.
	 * @return the twoBytesLeft attribute reference
	 */
	public ElementaryRangeReference getTwoBytesLeftReference() {
		return twoBytesLeft.getReference();
	}

	/**
	 * Getter for twoBytesLeft attribute.
	 * @return twoBytesLeft attribute
	 */
	public String getTwoBytesLeft() {
		return twoBytesLeft.getValue();
	}

	/**
	 * Setter for twoBytesLeft attribute.
	 * @param twoBytesLeft the new value of twoBytesLeft
	 */
	public void setTwoBytesLeft(String twoBytesLeft) {
		this.twoBytesLeft.setValue(twoBytesLeft);
	}
	/**
	 * Gets the reference for attribute twoBytesRight.
	 * @return the twoBytesRight attribute reference
	 */
	public ElementaryRangeReference getTwoBytesRightReference() {
		return twoBytesRight.getReference();
	}

	/**
	 * Getter for twoBytesRight attribute.
	 * @return twoBytesRight attribute
	 */
	public String getTwoBytesRight() {
		return twoBytesRight.getValue();
	}

	/**
	 * Setter for twoBytesRight attribute.
	 * @param twoBytesRight the new value of twoBytesRight
	 */
	public void setTwoBytesRight(String twoBytesRight) {
		this.twoBytesRight.setValue(twoBytesRight);
	}
}
