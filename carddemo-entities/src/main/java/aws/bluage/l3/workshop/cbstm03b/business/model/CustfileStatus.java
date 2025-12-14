package aws.bluage.l3.workshop.cbstm03b.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity CustfileStatus.
 * 
 * <p>About 'custfileStat1' field, <br>
 * </p>
 * 
 * <p>About 'custfileStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class CustfileStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary custfileStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary custfileStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new CustfileStatus with a default record.
	 * @param configuration the configuration
	 */
	public CustfileStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CustfileStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CustfileStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute custfileStat1.
	 * @return the custfileStat1 attribute reference
	 */
	public ElementaryRangeReference getCustfileStat1Reference() {
		return custfileStat1.getReference();
	}

	/**
	 * Getter for custfileStat1 attribute.
	 * @return custfileStat1 attribute
	 */
	public String getCustfileStat1() {
		return custfileStat1.getValue();
	}

	/**
	 * Setter for custfileStat1 attribute.
	 * @param custfileStat1 the new value of custfileStat1
	 */
	public void setCustfileStat1(String custfileStat1) {
		this.custfileStat1.setValue(custfileStat1);
	}
	/**
	 * Gets the reference for attribute custfileStat2.
	 * @return the custfileStat2 attribute reference
	 */
	public ElementaryRangeReference getCustfileStat2Reference() {
		return custfileStat2.getReference();
	}

	/**
	 * Getter for custfileStat2 attribute.
	 * @return custfileStat2 attribute
	 */
	public String getCustfileStat2() {
		return custfileStat2.getValue();
	}

	/**
	 * Setter for custfileStat2 attribute.
	 * @param custfileStat2 the new value of custfileStat2
	 */
	public void setCustfileStat2(String custfileStat2) {
		this.custfileStat2.setValue(custfileStat2);
	}
}
