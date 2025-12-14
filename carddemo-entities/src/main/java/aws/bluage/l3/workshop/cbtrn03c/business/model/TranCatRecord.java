package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity TranCatRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *      Data-structure for transaction category type (RECLN = 60)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'tranCatKey' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TranCatKey
 * <br></p>
 * 
 * <p>About 'tranCatTypeDesc' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TranCatRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group tranCatKey = new Group(root);
	private final Elementary tranTypeCd = new Elementary(tranCatKey,new AlphanumericType(2));
	private final Elementary tranCatCd = new Elementary(tranCatKey,new ZonedType(4, 0, false));
	private final Elementary tranCatTypeDesc = new Elementary(root,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(4));
	

	/**
	 * Instantiate a new TranCatRecord with a default record.
	 * @param configuration the configuration
	 */
	public TranCatRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TranCatRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TranCatRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute tranCatKey.
	 * @return the tranCatKey attribute reference
	 */
	public RangeReference getTranCatKeyReference() {
		return tranCatKey.getReference();
	}	
				
	/**
	 * Setter for tranCatKey .
	 */
   	public void setTranCatKey(RangeReference reference) {
       	tranCatKey.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute tranTypeCd.
	 * @return the tranTypeCd attribute reference
	 */
	public ElementaryRangeReference getTranTypeCdReference() {
		return tranTypeCd.getReference();
	}

	/**
	 * Getter for tranTypeCd attribute.
	 * @return tranTypeCd attribute
	 */
	public String getTranTypeCd() {
		return tranTypeCd.getValue();
	}

	/**
	 * Setter for tranTypeCd attribute.
	 * @param tranTypeCd the new value of tranTypeCd
	 */
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd.setValue(tranTypeCd);
	}
	/**
	 * Gets the reference for attribute tranCatCd.
	 * @return the tranCatCd attribute reference
	 */
	public ElementaryRangeReference getTranCatCdReference() {
		return tranCatCd.getReference();
	}

	/**
	 * Getter for tranCatCd attribute.
	 * @return tranCatCd attribute
	 */
	public int getTranCatCd() {
		return tranCatCd.getValue();
	}

	/**
	 * Setter for tranCatCd attribute.
	 * @param tranCatCd the new value of tranCatCd
	 */
	public void setTranCatCd(int tranCatCd) {
		this.tranCatCd.setValue(tranCatCd);
	}
	/**
	 * Gets the reference for attribute tranCatTypeDesc.
	 * @return the tranCatTypeDesc attribute reference
	 */
	public ElementaryRangeReference getTranCatTypeDescReference() {
		return tranCatTypeDesc.getReference();
	}

	/**
	 * Getter for tranCatTypeDesc attribute.
	 * @return tranCatTypeDesc attribute
	 */
	public String getTranCatTypeDesc() {
		return tranCatTypeDesc.getValue();
	}

	/**
	 * Setter for tranCatTypeDesc attribute.
	 * @param tranCatTypeDesc the new value of tranCatTypeDesc
	 */
	public void setTranCatTypeDesc(String tranCatTypeDesc) {
		this.tranCatTypeDesc.setValue(tranCatTypeDesc);
	}
}
