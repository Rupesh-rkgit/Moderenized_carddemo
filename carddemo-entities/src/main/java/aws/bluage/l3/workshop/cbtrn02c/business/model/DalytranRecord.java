package aws.bluage.l3.workshop.cbtrn02c.business.model;

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
 * Data simplifier entity DalytranRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *  ****************************************************************<br>
 *      Data-structure for DALYTRANsaction record (RECLN = 350)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'dalytranId' field, <br>
 * </p>
 * 
 * <p>About 'dalytranTypeCd' field, <br>
 * </p>
 * 
 * <p>About 'dalytranCatCd' field, <br>
 * </p>
 * 
 * <p>About 'dalytranSource' field, <br>
 * </p>
 * 
 * <p>About 'dalytranDesc' field, <br>
 * </p>
 * 
 * <p>About 'dalytranAmt' field, <br>
 * </p>
 * 
 * <p>About 'dalytranMerchantId' field, <br>
 * </p>
 * 
 * <p>About 'dalytranMerchantName' field, <br>
 * </p>
 * 
 * <p>About 'dalytranMerchantCity' field, <br>
 * </p>
 * 
 * <p>About 'dalytranMerchantZip' field, <br>
 * </p>
 * 
 * <p>About 'dalytranCardNum' field, <br>
 * </p>
 * 
 * <p>About 'dalytranOrigTs' field, <br>
 * </p>
 * 
 * <p>About 'dalytranProcTs' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class DalytranRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dalytranId = new Elementary(root,new AlphanumericType(16));
	private final Elementary dalytranTypeCd = new Elementary(root,new AlphanumericType(2));
	private final Elementary dalytranCatCd = new Elementary(root,new ZonedType(4, 0, false));
	private final Elementary dalytranSource = new Elementary(root,new AlphanumericType(10));
	private final Elementary dalytranDesc = new Elementary(root,new AlphanumericType(100));
	private final Elementary dalytranAmt = new Elementary(root,new ZonedType(9, 2, false, false, true));
	private final Elementary dalytranMerchantId = new Elementary(root,new ZonedType(9, 0, false));
	private final Elementary dalytranMerchantName = new Elementary(root,new AlphanumericType(50));
	private final Elementary dalytranMerchantCity = new Elementary(root,new AlphanumericType(50));
	private final Elementary dalytranMerchantZip = new Elementary(root,new AlphanumericType(10));
	private final Elementary dalytranCardNum = new Elementary(root,new AlphanumericType(16));
	private final Elementary dalytranOrigTs = new Elementary(root,new AlphanumericType(26));
	private final Elementary dalytranProcTs = new Elementary(root,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(20));
	

	/**
	 * Instantiate a new DalytranRecord with a default record.
	 * @param configuration the configuration
	 */
	public DalytranRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new DalytranRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public DalytranRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dalytranId.
	 * @return the dalytranId attribute reference
	 */
	public ElementaryRangeReference getDalytranIdReference() {
		return dalytranId.getReference();
	}

	/**
	 * Getter for dalytranId attribute.
	 * @return dalytranId attribute
	 */
	public String getDalytranId() {
		return dalytranId.getValue();
	}

	/**
	 * Setter for dalytranId attribute.
	 * @param dalytranId the new value of dalytranId
	 */
	public void setDalytranId(String dalytranId) {
		this.dalytranId.setValue(dalytranId);
	}
	/**
	 * Gets the reference for attribute dalytranTypeCd.
	 * @return the dalytranTypeCd attribute reference
	 */
	public ElementaryRangeReference getDalytranTypeCdReference() {
		return dalytranTypeCd.getReference();
	}

	/**
	 * Getter for dalytranTypeCd attribute.
	 * @return dalytranTypeCd attribute
	 */
	public String getDalytranTypeCd() {
		return dalytranTypeCd.getValue();
	}

	/**
	 * Setter for dalytranTypeCd attribute.
	 * @param dalytranTypeCd the new value of dalytranTypeCd
	 */
	public void setDalytranTypeCd(String dalytranTypeCd) {
		this.dalytranTypeCd.setValue(dalytranTypeCd);
	}
	/**
	 * Gets the reference for attribute dalytranCatCd.
	 * @return the dalytranCatCd attribute reference
	 */
	public ElementaryRangeReference getDalytranCatCdReference() {
		return dalytranCatCd.getReference();
	}

	/**
	 * Getter for dalytranCatCd attribute.
	 * @return dalytranCatCd attribute
	 */
	public int getDalytranCatCd() {
		return dalytranCatCd.getValue();
	}

	/**
	 * Setter for dalytranCatCd attribute.
	 * @param dalytranCatCd the new value of dalytranCatCd
	 */
	public void setDalytranCatCd(int dalytranCatCd) {
		this.dalytranCatCd.setValue(dalytranCatCd);
	}
	/**
	 * Gets the reference for attribute dalytranSource.
	 * @return the dalytranSource attribute reference
	 */
	public ElementaryRangeReference getDalytranSourceReference() {
		return dalytranSource.getReference();
	}

	/**
	 * Getter for dalytranSource attribute.
	 * @return dalytranSource attribute
	 */
	public String getDalytranSource() {
		return dalytranSource.getValue();
	}

	/**
	 * Setter for dalytranSource attribute.
	 * @param dalytranSource the new value of dalytranSource
	 */
	public void setDalytranSource(String dalytranSource) {
		this.dalytranSource.setValue(dalytranSource);
	}
	/**
	 * Gets the reference for attribute dalytranDesc.
	 * @return the dalytranDesc attribute reference
	 */
	public ElementaryRangeReference getDalytranDescReference() {
		return dalytranDesc.getReference();
	}

	/**
	 * Getter for dalytranDesc attribute.
	 * @return dalytranDesc attribute
	 */
	public String getDalytranDesc() {
		return dalytranDesc.getValue();
	}

	/**
	 * Setter for dalytranDesc attribute.
	 * @param dalytranDesc the new value of dalytranDesc
	 */
	public void setDalytranDesc(String dalytranDesc) {
		this.dalytranDesc.setValue(dalytranDesc);
	}
	/**
	 * Gets the reference for attribute dalytranAmt.
	 * @return the dalytranAmt attribute reference
	 */
	public ElementaryRangeReference getDalytranAmtReference() {
		return dalytranAmt.getReference();
	}

	/**
	 * Getter for dalytranAmt attribute.
	 * @return dalytranAmt attribute
	 */
	public BigDecimal getDalytranAmt() {
		return dalytranAmt.getValue();
	}

	/**
	 * Setter for dalytranAmt attribute.
	 * @param dalytranAmt the new value of dalytranAmt
	 */
	public void setDalytranAmt(BigDecimal dalytranAmt) {
		this.dalytranAmt.setValue(dalytranAmt);
	}
	/**
	 * Gets the reference for attribute dalytranMerchantId.
	 * @return the dalytranMerchantId attribute reference
	 */
	public ElementaryRangeReference getDalytranMerchantIdReference() {
		return dalytranMerchantId.getReference();
	}

	/**
	 * Getter for dalytranMerchantId attribute.
	 * @return dalytranMerchantId attribute
	 */
	public int getDalytranMerchantId() {
		return dalytranMerchantId.getValue();
	}

	/**
	 * Setter for dalytranMerchantId attribute.
	 * @param dalytranMerchantId the new value of dalytranMerchantId
	 */
	public void setDalytranMerchantId(int dalytranMerchantId) {
		this.dalytranMerchantId.setValue(dalytranMerchantId);
	}
	/**
	 * Gets the reference for attribute dalytranMerchantName.
	 * @return the dalytranMerchantName attribute reference
	 */
	public ElementaryRangeReference getDalytranMerchantNameReference() {
		return dalytranMerchantName.getReference();
	}

	/**
	 * Getter for dalytranMerchantName attribute.
	 * @return dalytranMerchantName attribute
	 */
	public String getDalytranMerchantName() {
		return dalytranMerchantName.getValue();
	}

	/**
	 * Setter for dalytranMerchantName attribute.
	 * @param dalytranMerchantName the new value of dalytranMerchantName
	 */
	public void setDalytranMerchantName(String dalytranMerchantName) {
		this.dalytranMerchantName.setValue(dalytranMerchantName);
	}
	/**
	 * Gets the reference for attribute dalytranMerchantCity.
	 * @return the dalytranMerchantCity attribute reference
	 */
	public ElementaryRangeReference getDalytranMerchantCityReference() {
		return dalytranMerchantCity.getReference();
	}

	/**
	 * Getter for dalytranMerchantCity attribute.
	 * @return dalytranMerchantCity attribute
	 */
	public String getDalytranMerchantCity() {
		return dalytranMerchantCity.getValue();
	}

	/**
	 * Setter for dalytranMerchantCity attribute.
	 * @param dalytranMerchantCity the new value of dalytranMerchantCity
	 */
	public void setDalytranMerchantCity(String dalytranMerchantCity) {
		this.dalytranMerchantCity.setValue(dalytranMerchantCity);
	}
	/**
	 * Gets the reference for attribute dalytranMerchantZip.
	 * @return the dalytranMerchantZip attribute reference
	 */
	public ElementaryRangeReference getDalytranMerchantZipReference() {
		return dalytranMerchantZip.getReference();
	}

	/**
	 * Getter for dalytranMerchantZip attribute.
	 * @return dalytranMerchantZip attribute
	 */
	public String getDalytranMerchantZip() {
		return dalytranMerchantZip.getValue();
	}

	/**
	 * Setter for dalytranMerchantZip attribute.
	 * @param dalytranMerchantZip the new value of dalytranMerchantZip
	 */
	public void setDalytranMerchantZip(String dalytranMerchantZip) {
		this.dalytranMerchantZip.setValue(dalytranMerchantZip);
	}
	/**
	 * Gets the reference for attribute dalytranCardNum.
	 * @return the dalytranCardNum attribute reference
	 */
	public ElementaryRangeReference getDalytranCardNumReference() {
		return dalytranCardNum.getReference();
	}

	/**
	 * Getter for dalytranCardNum attribute.
	 * @return dalytranCardNum attribute
	 */
	public String getDalytranCardNum() {
		return dalytranCardNum.getValue();
	}

	/**
	 * Setter for dalytranCardNum attribute.
	 * @param dalytranCardNum the new value of dalytranCardNum
	 */
	public void setDalytranCardNum(String dalytranCardNum) {
		this.dalytranCardNum.setValue(dalytranCardNum);
	}
	/**
	 * Gets the reference for attribute dalytranOrigTs.
	 * @return the dalytranOrigTs attribute reference
	 */
	public ElementaryRangeReference getDalytranOrigTsReference() {
		return dalytranOrigTs.getReference();
	}

	/**
	 * Getter for dalytranOrigTs attribute.
	 * @return dalytranOrigTs attribute
	 */
	public String getDalytranOrigTs() {
		return dalytranOrigTs.getValue();
	}

	/**
	 * Setter for dalytranOrigTs attribute.
	 * @param dalytranOrigTs the new value of dalytranOrigTs
	 */
	public void setDalytranOrigTs(String dalytranOrigTs) {
		this.dalytranOrigTs.setValue(dalytranOrigTs);
	}
	/**
	 * Gets the reference for attribute dalytranProcTs.
	 * @return the dalytranProcTs attribute reference
	 */
	public ElementaryRangeReference getDalytranProcTsReference() {
		return dalytranProcTs.getReference();
	}

	/**
	 * Getter for dalytranProcTs attribute.
	 * @return dalytranProcTs attribute
	 */
	public String getDalytranProcTs() {
		return dalytranProcTs.getValue();
	}

	/**
	 * Setter for dalytranProcTs attribute.
	 * @param dalytranProcTs the new value of dalytranProcTs
	 */
	public void setDalytranProcTs(String dalytranProcTs) {
		this.dalytranProcTs.setValue(dalytranProcTs);
	}
}
