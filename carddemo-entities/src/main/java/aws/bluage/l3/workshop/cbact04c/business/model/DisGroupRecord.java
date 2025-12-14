package aws.bluage.l3.workshop.cbact04c.business.model;

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
 * Data simplifier entity DisGroupRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *      Data-structure for disclosure group (RECLN = 50)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'disGroupKey' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.DisGroupKey
 * <br></p>
 * 
 * <p>About 'disIntRate' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class DisGroupRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group disGroupKey = new Group(root);
	private final Elementary disAcctGroupId = new Elementary(disGroupKey,new AlphanumericType(10));
	private final Elementary disTranTypeCd = new Elementary(disGroupKey,new AlphanumericType(2));
	private final Elementary disTranCatCd = new Elementary(disGroupKey,new ZonedType(4, 0, false));
	private final Elementary disIntRate = new Elementary(root,new ZonedType(4, 2, false, false, true));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(28));
	

	/**
	 * Instantiate a new DisGroupRecord with a default record.
	 * @param configuration the configuration
	 */
	public DisGroupRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new DisGroupRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public DisGroupRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute disGroupKey.
	 * @return the disGroupKey attribute reference
	 */
	public RangeReference getDisGroupKeyReference() {
		return disGroupKey.getReference();
	}	
				
	/**
	 * Setter for disGroupKey .
	 */
   	public void setDisGroupKey(RangeReference reference) {
       	disGroupKey.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute disAcctGroupId.
	 * @return the disAcctGroupId attribute reference
	 */
	public ElementaryRangeReference getDisAcctGroupIdReference() {
		return disAcctGroupId.getReference();
	}

	/**
	 * Getter for disAcctGroupId attribute.
	 * @return disAcctGroupId attribute
	 */
	public String getDisAcctGroupId() {
		return disAcctGroupId.getValue();
	}

	/**
	 * Setter for disAcctGroupId attribute.
	 * @param disAcctGroupId the new value of disAcctGroupId
	 */
	public void setDisAcctGroupId(String disAcctGroupId) {
		this.disAcctGroupId.setValue(disAcctGroupId);
	}
	/**
	 * Gets the reference for attribute disTranTypeCd.
	 * @return the disTranTypeCd attribute reference
	 */
	public ElementaryRangeReference getDisTranTypeCdReference() {
		return disTranTypeCd.getReference();
	}

	/**
	 * Getter for disTranTypeCd attribute.
	 * @return disTranTypeCd attribute
	 */
	public String getDisTranTypeCd() {
		return disTranTypeCd.getValue();
	}

	/**
	 * Setter for disTranTypeCd attribute.
	 * @param disTranTypeCd the new value of disTranTypeCd
	 */
	public void setDisTranTypeCd(String disTranTypeCd) {
		this.disTranTypeCd.setValue(disTranTypeCd);
	}
	/**
	 * Gets the reference for attribute disTranCatCd.
	 * @return the disTranCatCd attribute reference
	 */
	public ElementaryRangeReference getDisTranCatCdReference() {
		return disTranCatCd.getReference();
	}

	/**
	 * Getter for disTranCatCd attribute.
	 * @return disTranCatCd attribute
	 */
	public int getDisTranCatCd() {
		return disTranCatCd.getValue();
	}

	/**
	 * Setter for disTranCatCd attribute.
	 * @param disTranCatCd the new value of disTranCatCd
	 */
	public void setDisTranCatCd(int disTranCatCd) {
		this.disTranCatCd.setValue(disTranCatCd);
	}
	/**
	 * Gets the reference for attribute disIntRate.
	 * @return the disIntRate attribute reference
	 */
	public ElementaryRangeReference getDisIntRateReference() {
		return disIntRate.getReference();
	}

	/**
	 * Getter for disIntRate attribute.
	 * @return disIntRate attribute
	 */
	public BigDecimal getDisIntRate() {
		return disIntRate.getValue();
	}

	/**
	 * Setter for disIntRate attribute.
	 * @param disIntRate the new value of disIntRate
	 */
	public void setDisIntRate(BigDecimal disIntRate) {
		this.disIntRate.setValue(disIntRate);
	}
}
