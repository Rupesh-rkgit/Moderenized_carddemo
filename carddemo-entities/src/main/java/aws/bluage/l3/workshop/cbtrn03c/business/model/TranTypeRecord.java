package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity TranTypeRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *      Data-structure for transaction type (RECLN = 60)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'tranType' field, <br>
 * </p>
 * 
 * <p>About 'tranTypeDesc' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TranTypeRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary tranType = new Elementary(root,new AlphanumericType(2));
	private final Elementary tranTypeDesc = new Elementary(root,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(8));
	

	/**
	 * Instantiate a new TranTypeRecord with a default record.
	 * @param configuration the configuration
	 */
	public TranTypeRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TranTypeRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TranTypeRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute tranType.
	 * @return the tranType attribute reference
	 */
	public ElementaryRangeReference getTranTypeReference() {
		return tranType.getReference();
	}

	/**
	 * Getter for tranType attribute.
	 * @return tranType attribute
	 */
	public String getTranType() {
		return tranType.getValue();
	}

	/**
	 * Setter for tranType attribute.
	 * @param tranType the new value of tranType
	 */
	public void setTranType(String tranType) {
		this.tranType.setValue(tranType);
	}
	/**
	 * Gets the reference for attribute tranTypeDesc.
	 * @return the tranTypeDesc attribute reference
	 */
	public ElementaryRangeReference getTranTypeDescReference() {
		return tranTypeDesc.getReference();
	}

	/**
	 * Getter for tranTypeDesc attribute.
	 * @return tranTypeDesc attribute
	 */
	public String getTranTypeDesc() {
		return tranTypeDesc.getValue();
	}

	/**
	 * Setter for tranTypeDesc attribute.
	 * @param tranTypeDesc the new value of tranTypeDesc
	 */
	public void setTranTypeDesc(String tranTypeDesc) {
		this.tranTypeDesc.setValue(tranTypeDesc);
	}
}
