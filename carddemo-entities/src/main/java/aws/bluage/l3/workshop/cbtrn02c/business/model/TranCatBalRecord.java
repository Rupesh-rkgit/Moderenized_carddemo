package aws.bluage.l3.workshop.cbtrn02c.business.model;

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
import java.math.BigDecimal;
/**
 * Data simplifier entity TranCatBalRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *      Data-structure for transaction category balance (RECLN = 50)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'tranCatKey' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.TranCatKey
 * <br></p>
 * 
 * <p>About 'tranCatBal' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TranCatBalRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group tranCatKey = new Group(root);
	private final Elementary trancatAcctId = new Elementary(tranCatKey,new ZonedType(11, 0, false));
	private final Elementary trancatTypeCd = new Elementary(tranCatKey,new AlphanumericType(2));
	private final Elementary trancatCd = new Elementary(tranCatKey,new ZonedType(4, 0, false));
	private final Elementary tranCatBal = new Elementary(root,new ZonedType(9, 2, false, false, true));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(22));
	

	/**
	 * Instantiate a new TranCatBalRecord with a default record.
	 * @param configuration the configuration
	 */
	public TranCatBalRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TranCatBalRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TranCatBalRecord(Configuration configuration, RecordAdaptable record) {
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
	 * Gets the reference for attribute trancatAcctId.
	 * @return the trancatAcctId attribute reference
	 */
	public ElementaryRangeReference getTrancatAcctIdReference() {
		return trancatAcctId.getReference();
	}

	/**
	 * Getter for trancatAcctId attribute.
	 * @return trancatAcctId attribute
	 */
	public long getTrancatAcctId() {
		return trancatAcctId.getValue();
	}

	/**
	 * Setter for trancatAcctId attribute.
	 * @param trancatAcctId the new value of trancatAcctId
	 */
	public void setTrancatAcctId(long trancatAcctId) {
		this.trancatAcctId.setValue(trancatAcctId);
	}
	/**
	 * Gets the reference for attribute trancatTypeCd.
	 * @return the trancatTypeCd attribute reference
	 */
	public ElementaryRangeReference getTrancatTypeCdReference() {
		return trancatTypeCd.getReference();
	}

	/**
	 * Getter for trancatTypeCd attribute.
	 * @return trancatTypeCd attribute
	 */
	public String getTrancatTypeCd() {
		return trancatTypeCd.getValue();
	}

	/**
	 * Setter for trancatTypeCd attribute.
	 * @param trancatTypeCd the new value of trancatTypeCd
	 */
	public void setTrancatTypeCd(String trancatTypeCd) {
		this.trancatTypeCd.setValue(trancatTypeCd);
	}
	/**
	 * Gets the reference for attribute trancatCd.
	 * @return the trancatCd attribute reference
	 */
	public ElementaryRangeReference getTrancatCdReference() {
		return trancatCd.getReference();
	}

	/**
	 * Getter for trancatCd attribute.
	 * @return trancatCd attribute
	 */
	public int getTrancatCd() {
		return trancatCd.getValue();
	}

	/**
	 * Setter for trancatCd attribute.
	 * @param trancatCd the new value of trancatCd
	 */
	public void setTrancatCd(int trancatCd) {
		this.trancatCd.setValue(trancatCd);
	}
	/**
	 * Gets the reference for attribute tranCatBal.
	 * @return the tranCatBal attribute reference
	 */
	public ElementaryRangeReference getTranCatBalReference() {
		return tranCatBal.getReference();
	}

	/**
	 * Getter for tranCatBal attribute.
	 * @return tranCatBal attribute
	 */
	public BigDecimal getTranCatBal() {
		return tranCatBal.getValue();
	}

	/**
	 * Setter for tranCatBal attribute.
	 * @param tranCatBal the new value of tranCatBal
	 */
	public void setTranCatBal(BigDecimal tranCatBal) {
		this.tranCatBal.setValue(tranCatBal);
	}
}
