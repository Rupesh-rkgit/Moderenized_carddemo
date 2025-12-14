package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity TranRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *  ****************************************************************<br>
 *      Data-structure for TRANsaction record (RECLN = 350)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'tranId' field, <br>
 * </p>
 * 
 * <p>About 'tranTypeCd' field, <br>
 * </p>
 * 
 * <p>About 'tranCatCd' field, <br>
 * </p>
 * 
 * <p>About 'tranSource' field, <br>
 * </p>
 * 
 * <p>About 'tranDesc' field, <br>
 * </p>
 * 
 * <p>About 'tranAmt' field, <br>
 * </p>
 * 
 * <p>About 'tranMerchantId' field, <br>
 * </p>
 * 
 * <p>About 'tranMerchantName' field, <br>
 * </p>
 * 
 * <p>About 'tranMerchantCity' field, <br>
 * </p>
 * 
 * <p>About 'tranMerchantZip' field, <br>
 * </p>
 * 
 * <p>About 'tranCardNum' field, <br>
 * </p>
 * 
 * <p>About 'tranOrigTs' field, <br>
 * </p>
 * 
 * <p>About 'tranProcTs' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TranRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary tranId = new Elementary(root,new AlphanumericType(16));
	private final Elementary tranTypeCd = new Elementary(root,new AlphanumericType(2));
	private final Elementary tranCatCd = new Elementary(root,new ZonedType(4, 0, false));
	private final Elementary tranSource = new Elementary(root,new AlphanumericType(10));
	private final Elementary tranDesc = new Elementary(root,new AlphanumericType(100));
	private final Elementary tranAmt = new Elementary(root,new ZonedType(9, 2, false, false, true));
	private final Elementary tranMerchantId = new Elementary(root,new ZonedType(9, 0, false));
	private final Elementary tranMerchantName = new Elementary(root,new AlphanumericType(50));
	private final Elementary tranMerchantCity = new Elementary(root,new AlphanumericType(50));
	private final Elementary tranMerchantZip = new Elementary(root,new AlphanumericType(10));
	private final Elementary tranCardNum = new Elementary(root,new AlphanumericType(16));
	private final Elementary tranOrigTs = new Elementary(root,new AlphanumericType(26));
	private final Elementary tranProcTs = new Elementary(root,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(20));
	

	/**
	 * Instantiate a new TranRecord with a default record.
	 * @param configuration the configuration
	 */
	public TranRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TranRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TranRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute tranId.
	 * @return the tranId attribute reference
	 */
	public ElementaryRangeReference getTranIdReference() {
		return tranId.getReference();
	}

	/**
	 * Getter for tranId attribute.
	 * @return tranId attribute
	 */
	public String getTranId() {
		return tranId.getValue();
	}

	/**
	 * Setter for tranId attribute.
	 * @param tranId the new value of tranId
	 */
	public void setTranId(String tranId) {
		this.tranId.setValue(tranId);
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
	 * Gets the reference for attribute tranSource.
	 * @return the tranSource attribute reference
	 */
	public ElementaryRangeReference getTranSourceReference() {
		return tranSource.getReference();
	}

	/**
	 * Getter for tranSource attribute.
	 * @return tranSource attribute
	 */
	public String getTranSource() {
		return tranSource.getValue();
	}

	/**
	 * Setter for tranSource attribute.
	 * @param tranSource the new value of tranSource
	 */
	public void setTranSource(String tranSource) {
		this.tranSource.setValue(tranSource);
	}
	/**
	 * Gets the reference for attribute tranDesc.
	 * @return the tranDesc attribute reference
	 */
	public ElementaryRangeReference getTranDescReference() {
		return tranDesc.getReference();
	}

	/**
	 * Getter for tranDesc attribute.
	 * @return tranDesc attribute
	 */
	public String getTranDesc() {
		return tranDesc.getValue();
	}

	/**
	 * Setter for tranDesc attribute.
	 * @param tranDesc the new value of tranDesc
	 */
	public void setTranDesc(String tranDesc) {
		this.tranDesc.setValue(tranDesc);
	}
	/**
	 * Gets the reference for attribute tranAmt.
	 * @return the tranAmt attribute reference
	 */
	public ElementaryRangeReference getTranAmtReference() {
		return tranAmt.getReference();
	}

	/**
	 * Getter for tranAmt attribute.
	 * @return tranAmt attribute
	 */
	public BigDecimal getTranAmt() {
		return tranAmt.getValue();
	}

	/**
	 * Setter for tranAmt attribute.
	 * @param tranAmt the new value of tranAmt
	 */
	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt.setValue(tranAmt);
	}
	/**
	 * Gets the reference for attribute tranMerchantId.
	 * @return the tranMerchantId attribute reference
	 */
	public ElementaryRangeReference getTranMerchantIdReference() {
		return tranMerchantId.getReference();
	}

	/**
	 * Getter for tranMerchantId attribute.
	 * @return tranMerchantId attribute
	 */
	public int getTranMerchantId() {
		return tranMerchantId.getValue();
	}

	/**
	 * Setter for tranMerchantId attribute.
	 * @param tranMerchantId the new value of tranMerchantId
	 */
	public void setTranMerchantId(int tranMerchantId) {
		this.tranMerchantId.setValue(tranMerchantId);
	}
	/**
	 * Gets the reference for attribute tranMerchantName.
	 * @return the tranMerchantName attribute reference
	 */
	public ElementaryRangeReference getTranMerchantNameReference() {
		return tranMerchantName.getReference();
	}

	/**
	 * Getter for tranMerchantName attribute.
	 * @return tranMerchantName attribute
	 */
	public String getTranMerchantName() {
		return tranMerchantName.getValue();
	}

	/**
	 * Setter for tranMerchantName attribute.
	 * @param tranMerchantName the new value of tranMerchantName
	 */
	public void setTranMerchantName(String tranMerchantName) {
		this.tranMerchantName.setValue(tranMerchantName);
	}
	/**
	 * Gets the reference for attribute tranMerchantCity.
	 * @return the tranMerchantCity attribute reference
	 */
	public ElementaryRangeReference getTranMerchantCityReference() {
		return tranMerchantCity.getReference();
	}

	/**
	 * Getter for tranMerchantCity attribute.
	 * @return tranMerchantCity attribute
	 */
	public String getTranMerchantCity() {
		return tranMerchantCity.getValue();
	}

	/**
	 * Setter for tranMerchantCity attribute.
	 * @param tranMerchantCity the new value of tranMerchantCity
	 */
	public void setTranMerchantCity(String tranMerchantCity) {
		this.tranMerchantCity.setValue(tranMerchantCity);
	}
	/**
	 * Gets the reference for attribute tranMerchantZip.
	 * @return the tranMerchantZip attribute reference
	 */
	public ElementaryRangeReference getTranMerchantZipReference() {
		return tranMerchantZip.getReference();
	}

	/**
	 * Getter for tranMerchantZip attribute.
	 * @return tranMerchantZip attribute
	 */
	public String getTranMerchantZip() {
		return tranMerchantZip.getValue();
	}

	/**
	 * Setter for tranMerchantZip attribute.
	 * @param tranMerchantZip the new value of tranMerchantZip
	 */
	public void setTranMerchantZip(String tranMerchantZip) {
		this.tranMerchantZip.setValue(tranMerchantZip);
	}
	/**
	 * Gets the reference for attribute tranCardNum.
	 * @return the tranCardNum attribute reference
	 */
	public ElementaryRangeReference getTranCardNumReference() {
		return tranCardNum.getReference();
	}

	/**
	 * Getter for tranCardNum attribute.
	 * @return tranCardNum attribute
	 */
	public String getTranCardNum() {
		return tranCardNum.getValue();
	}

	/**
	 * Setter for tranCardNum attribute.
	 * @param tranCardNum the new value of tranCardNum
	 */
	public void setTranCardNum(String tranCardNum) {
		this.tranCardNum.setValue(tranCardNum);
	}
	/**
	 * Gets the reference for attribute tranOrigTs.
	 * @return the tranOrigTs attribute reference
	 */
	public ElementaryRangeReference getTranOrigTsReference() {
		return tranOrigTs.getReference();
	}

	/**
	 * Getter for tranOrigTs attribute.
	 * @return tranOrigTs attribute
	 */
	public String getTranOrigTs() {
		return tranOrigTs.getValue();
	}

	/**
	 * Setter for tranOrigTs attribute.
	 * @param tranOrigTs the new value of tranOrigTs
	 */
	public void setTranOrigTs(String tranOrigTs) {
		this.tranOrigTs.setValue(tranOrigTs);
	}
	/**
	 * Gets the reference for attribute tranProcTs.
	 * @return the tranProcTs attribute reference
	 */
	public ElementaryRangeReference getTranProcTsReference() {
		return tranProcTs.getReference();
	}

	/**
	 * Getter for tranProcTs attribute.
	 * @return tranProcTs attribute
	 */
	public String getTranProcTs() {
		return tranProcTs.getValue();
	}

	/**
	 * Setter for tranProcTs attribute.
	 * @param tranProcTs the new value of tranProcTs
	 */
	public void setTranProcTs(String tranProcTs) {
		this.tranProcTs.setValue(tranProcTs);
	}
}
