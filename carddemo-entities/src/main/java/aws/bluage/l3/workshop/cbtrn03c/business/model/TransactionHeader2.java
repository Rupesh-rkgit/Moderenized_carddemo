package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity TransactionHeader2.
 * 
 * <p>About 'transactionHeader2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TransactionHeader2 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary transactionHeader2 = new Elementary(root,new AlphanumericType(133),"-------------------------------------------------------------------------------------------------------------------------------------");
	

	/**
	 * Instantiate a new TransactionHeader2 with a default record.
	 * @param configuration the configuration
	 */
	public TransactionHeader2(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TransactionHeader2 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TransactionHeader2(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute transactionHeader2.
	 * @return the transactionHeader2 attribute reference
	 */
	public ElementaryRangeReference getTransactionHeader2Reference() {
		return transactionHeader2.getReference();
	}

	/**
	 * Getter for transactionHeader2 attribute.
	 * @return transactionHeader2 attribute
	 */
	public String getTransactionHeader2() {
		return transactionHeader2.getValue();
	}

	/**
	 * Setter for transactionHeader2 attribute.
	 * @param transactionHeader2 the new value of transactionHeader2
	 */
	public void setTransactionHeader2(String transactionHeader2) {
		this.transactionHeader2.setValue(transactionHeader2);
	}
}
