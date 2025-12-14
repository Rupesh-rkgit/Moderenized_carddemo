package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity CustomerRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT<br>
 *  <br>
 *  ****************************************************************<br>
 *      Data-structure for Customer entity (RECLN 500)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'custId' field, <br>
 * </p>
 * 
 * <p>About 'custFirstName' field, <br>
 * </p>
 * 
 * <p>About 'custMiddleName' field, <br>
 * </p>
 * 
 * <p>About 'custLastName' field, <br>
 * </p>
 * 
 * <p>About 'custAddrLine1' field, <br>
 * </p>
 * 
 * <p>About 'custAddrLine2' field, <br>
 * </p>
 * 
 * <p>About 'custAddrLine3' field, <br>
 * </p>
 * 
 * <p>About 'custAddrStateCd' field, <br>
 * </p>
 * 
 * <p>About 'custAddrCountryCd' field, <br>
 * </p>
 * 
 * <p>About 'custAddrZip' field, <br>
 * </p>
 * 
 * <p>About 'custPhoneNum1' field, <br>
 * </p>
 * 
 * <p>About 'custPhoneNum2' field, <br>
 * </p>
 * 
 * <p>About 'custSsn' field, <br>
 * </p>
 * 
 * <p>About 'custGovtIssuedId' field, <br>
 * </p>
 * 
 * <p>About 'custDobYyyymmdd' field, <br>
 * </p>
 * 
 * <p>About 'custEftAccountId' field, <br>
 * </p>
 * 
 * <p>About 'custPriCardHolderInd' field, <br>
 * </p>
 * 
 * <p>About 'custFicoCreditScore' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class CustomerRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary custId = new Elementary(root,new ZonedType(9, 0, false));
	private final Elementary custFirstName = new Elementary(root,new AlphanumericType(25));
	private final Elementary custMiddleName = new Elementary(root,new AlphanumericType(25));
	private final Elementary custLastName = new Elementary(root,new AlphanumericType(25));
	private final Elementary custAddrLine1 = new Elementary(root,new AlphanumericType(50));
	private final Elementary custAddrLine2 = new Elementary(root,new AlphanumericType(50));
	private final Elementary custAddrLine3 = new Elementary(root,new AlphanumericType(50));
	private final Elementary custAddrStateCd = new Elementary(root,new AlphanumericType(2));
	private final Elementary custAddrCountryCd = new Elementary(root,new AlphanumericType(3));
	private final Elementary custAddrZip = new Elementary(root,new AlphanumericType(10));
	private final Elementary custPhoneNum1 = new Elementary(root,new AlphanumericType(15));
	private final Elementary custPhoneNum2 = new Elementary(root,new AlphanumericType(15));
	private final Elementary custSsn = new Elementary(root,new ZonedType(9, 0, false));
	private final Elementary custGovtIssuedId = new Elementary(root,new AlphanumericType(20));
	private final Elementary custDobYyyymmdd = new Elementary(root,new AlphanumericType(10));
	private final Elementary custEftAccountId = new Elementary(root,new AlphanumericType(10));
	private final Elementary custPriCardHolderInd = new Elementary(root,new AlphanumericType(1));
	private final Elementary custFicoCreditScore = new Elementary(root,new ZonedType(3, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(168));
	

	/**
	 * Instantiate a new CustomerRecord with a default record.
	 * @param configuration the configuration
	 */
	public CustomerRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CustomerRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CustomerRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute custId.
	 * @return the custId attribute reference
	 */
	public ElementaryRangeReference getCustIdReference() {
		return custId.getReference();
	}

	/**
	 * Getter for custId attribute.
	 * @return custId attribute
	 */
	public int getCustId() {
		return custId.getValue();
	}

	/**
	 * Setter for custId attribute.
	 * @param custId the new value of custId
	 */
	public void setCustId(int custId) {
		this.custId.setValue(custId);
	}
	/**
	 * Gets the reference for attribute custFirstName.
	 * @return the custFirstName attribute reference
	 */
	public ElementaryRangeReference getCustFirstNameReference() {
		return custFirstName.getReference();
	}

	/**
	 * Getter for custFirstName attribute.
	 * @return custFirstName attribute
	 */
	public String getCustFirstName() {
		return custFirstName.getValue();
	}

	/**
	 * Setter for custFirstName attribute.
	 * @param custFirstName the new value of custFirstName
	 */
	public void setCustFirstName(String custFirstName) {
		this.custFirstName.setValue(custFirstName);
	}
	/**
	 * Gets the reference for attribute custMiddleName.
	 * @return the custMiddleName attribute reference
	 */
	public ElementaryRangeReference getCustMiddleNameReference() {
		return custMiddleName.getReference();
	}

	/**
	 * Getter for custMiddleName attribute.
	 * @return custMiddleName attribute
	 */
	public String getCustMiddleName() {
		return custMiddleName.getValue();
	}

	/**
	 * Setter for custMiddleName attribute.
	 * @param custMiddleName the new value of custMiddleName
	 */
	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName.setValue(custMiddleName);
	}
	/**
	 * Gets the reference for attribute custLastName.
	 * @return the custLastName attribute reference
	 */
	public ElementaryRangeReference getCustLastNameReference() {
		return custLastName.getReference();
	}

	/**
	 * Getter for custLastName attribute.
	 * @return custLastName attribute
	 */
	public String getCustLastName() {
		return custLastName.getValue();
	}

	/**
	 * Setter for custLastName attribute.
	 * @param custLastName the new value of custLastName
	 */
	public void setCustLastName(String custLastName) {
		this.custLastName.setValue(custLastName);
	}
	/**
	 * Gets the reference for attribute custAddrLine1.
	 * @return the custAddrLine1 attribute reference
	 */
	public ElementaryRangeReference getCustAddrLine1Reference() {
		return custAddrLine1.getReference();
	}

	/**
	 * Getter for custAddrLine1 attribute.
	 * @return custAddrLine1 attribute
	 */
	public String getCustAddrLine1() {
		return custAddrLine1.getValue();
	}

	/**
	 * Setter for custAddrLine1 attribute.
	 * @param custAddrLine1 the new value of custAddrLine1
	 */
	public void setCustAddrLine1(String custAddrLine1) {
		this.custAddrLine1.setValue(custAddrLine1);
	}
	/**
	 * Gets the reference for attribute custAddrLine2.
	 * @return the custAddrLine2 attribute reference
	 */
	public ElementaryRangeReference getCustAddrLine2Reference() {
		return custAddrLine2.getReference();
	}

	/**
	 * Getter for custAddrLine2 attribute.
	 * @return custAddrLine2 attribute
	 */
	public String getCustAddrLine2() {
		return custAddrLine2.getValue();
	}

	/**
	 * Setter for custAddrLine2 attribute.
	 * @param custAddrLine2 the new value of custAddrLine2
	 */
	public void setCustAddrLine2(String custAddrLine2) {
		this.custAddrLine2.setValue(custAddrLine2);
	}
	/**
	 * Gets the reference for attribute custAddrLine3.
	 * @return the custAddrLine3 attribute reference
	 */
	public ElementaryRangeReference getCustAddrLine3Reference() {
		return custAddrLine3.getReference();
	}

	/**
	 * Getter for custAddrLine3 attribute.
	 * @return custAddrLine3 attribute
	 */
	public String getCustAddrLine3() {
		return custAddrLine3.getValue();
	}

	/**
	 * Setter for custAddrLine3 attribute.
	 * @param custAddrLine3 the new value of custAddrLine3
	 */
	public void setCustAddrLine3(String custAddrLine3) {
		this.custAddrLine3.setValue(custAddrLine3);
	}
	/**
	 * Gets the reference for attribute custAddrStateCd.
	 * @return the custAddrStateCd attribute reference
	 */
	public ElementaryRangeReference getCustAddrStateCdReference() {
		return custAddrStateCd.getReference();
	}

	/**
	 * Getter for custAddrStateCd attribute.
	 * @return custAddrStateCd attribute
	 */
	public String getCustAddrStateCd() {
		return custAddrStateCd.getValue();
	}

	/**
	 * Setter for custAddrStateCd attribute.
	 * @param custAddrStateCd the new value of custAddrStateCd
	 */
	public void setCustAddrStateCd(String custAddrStateCd) {
		this.custAddrStateCd.setValue(custAddrStateCd);
	}
	/**
	 * Gets the reference for attribute custAddrCountryCd.
	 * @return the custAddrCountryCd attribute reference
	 */
	public ElementaryRangeReference getCustAddrCountryCdReference() {
		return custAddrCountryCd.getReference();
	}

	/**
	 * Getter for custAddrCountryCd attribute.
	 * @return custAddrCountryCd attribute
	 */
	public String getCustAddrCountryCd() {
		return custAddrCountryCd.getValue();
	}

	/**
	 * Setter for custAddrCountryCd attribute.
	 * @param custAddrCountryCd the new value of custAddrCountryCd
	 */
	public void setCustAddrCountryCd(String custAddrCountryCd) {
		this.custAddrCountryCd.setValue(custAddrCountryCd);
	}
	/**
	 * Gets the reference for attribute custAddrZip.
	 * @return the custAddrZip attribute reference
	 */
	public ElementaryRangeReference getCustAddrZipReference() {
		return custAddrZip.getReference();
	}

	/**
	 * Getter for custAddrZip attribute.
	 * @return custAddrZip attribute
	 */
	public String getCustAddrZip() {
		return custAddrZip.getValue();
	}

	/**
	 * Setter for custAddrZip attribute.
	 * @param custAddrZip the new value of custAddrZip
	 */
	public void setCustAddrZip(String custAddrZip) {
		this.custAddrZip.setValue(custAddrZip);
	}
	/**
	 * Gets the reference for attribute custPhoneNum1.
	 * @return the custPhoneNum1 attribute reference
	 */
	public ElementaryRangeReference getCustPhoneNum1Reference() {
		return custPhoneNum1.getReference();
	}

	/**
	 * Getter for custPhoneNum1 attribute.
	 * @return custPhoneNum1 attribute
	 */
	public String getCustPhoneNum1() {
		return custPhoneNum1.getValue();
	}

	/**
	 * Setter for custPhoneNum1 attribute.
	 * @param custPhoneNum1 the new value of custPhoneNum1
	 */
	public void setCustPhoneNum1(String custPhoneNum1) {
		this.custPhoneNum1.setValue(custPhoneNum1);
	}
	/**
	 * Gets the reference for attribute custPhoneNum2.
	 * @return the custPhoneNum2 attribute reference
	 */
	public ElementaryRangeReference getCustPhoneNum2Reference() {
		return custPhoneNum2.getReference();
	}

	/**
	 * Getter for custPhoneNum2 attribute.
	 * @return custPhoneNum2 attribute
	 */
	public String getCustPhoneNum2() {
		return custPhoneNum2.getValue();
	}

	/**
	 * Setter for custPhoneNum2 attribute.
	 * @param custPhoneNum2 the new value of custPhoneNum2
	 */
	public void setCustPhoneNum2(String custPhoneNum2) {
		this.custPhoneNum2.setValue(custPhoneNum2);
	}
	/**
	 * Gets the reference for attribute custSsn.
	 * @return the custSsn attribute reference
	 */
	public ElementaryRangeReference getCustSsnReference() {
		return custSsn.getReference();
	}

	/**
	 * Getter for custSsn attribute.
	 * @return custSsn attribute
	 */
	public int getCustSsn() {
		return custSsn.getValue();
	}

	/**
	 * Setter for custSsn attribute.
	 * @param custSsn the new value of custSsn
	 */
	public void setCustSsn(int custSsn) {
		this.custSsn.setValue(custSsn);
	}
	/**
	 * Gets the reference for attribute custGovtIssuedId.
	 * @return the custGovtIssuedId attribute reference
	 */
	public ElementaryRangeReference getCustGovtIssuedIdReference() {
		return custGovtIssuedId.getReference();
	}

	/**
	 * Getter for custGovtIssuedId attribute.
	 * @return custGovtIssuedId attribute
	 */
	public String getCustGovtIssuedId() {
		return custGovtIssuedId.getValue();
	}

	/**
	 * Setter for custGovtIssuedId attribute.
	 * @param custGovtIssuedId the new value of custGovtIssuedId
	 */
	public void setCustGovtIssuedId(String custGovtIssuedId) {
		this.custGovtIssuedId.setValue(custGovtIssuedId);
	}
	/**
	 * Gets the reference for attribute custDobYyyymmdd.
	 * @return the custDobYyyymmdd attribute reference
	 */
	public ElementaryRangeReference getCustDobYyyymmddReference() {
		return custDobYyyymmdd.getReference();
	}

	/**
	 * Getter for custDobYyyymmdd attribute.
	 * @return custDobYyyymmdd attribute
	 */
	public String getCustDobYyyymmdd() {
		return custDobYyyymmdd.getValue();
	}

	/**
	 * Setter for custDobYyyymmdd attribute.
	 * @param custDobYyyymmdd the new value of custDobYyyymmdd
	 */
	public void setCustDobYyyymmdd(String custDobYyyymmdd) {
		this.custDobYyyymmdd.setValue(custDobYyyymmdd);
	}
	/**
	 * Gets the reference for attribute custEftAccountId.
	 * @return the custEftAccountId attribute reference
	 */
	public ElementaryRangeReference getCustEftAccountIdReference() {
		return custEftAccountId.getReference();
	}

	/**
	 * Getter for custEftAccountId attribute.
	 * @return custEftAccountId attribute
	 */
	public String getCustEftAccountId() {
		return custEftAccountId.getValue();
	}

	/**
	 * Setter for custEftAccountId attribute.
	 * @param custEftAccountId the new value of custEftAccountId
	 */
	public void setCustEftAccountId(String custEftAccountId) {
		this.custEftAccountId.setValue(custEftAccountId);
	}
	/**
	 * Gets the reference for attribute custPriCardHolderInd.
	 * @return the custPriCardHolderInd attribute reference
	 */
	public ElementaryRangeReference getCustPriCardHolderIndReference() {
		return custPriCardHolderInd.getReference();
	}

	/**
	 * Getter for custPriCardHolderInd attribute.
	 * @return custPriCardHolderInd attribute
	 */
	public String getCustPriCardHolderInd() {
		return custPriCardHolderInd.getValue();
	}

	/**
	 * Setter for custPriCardHolderInd attribute.
	 * @param custPriCardHolderInd the new value of custPriCardHolderInd
	 */
	public void setCustPriCardHolderInd(String custPriCardHolderInd) {
		this.custPriCardHolderInd.setValue(custPriCardHolderInd);
	}
	/**
	 * Gets the reference for attribute custFicoCreditScore.
	 * @return the custFicoCreditScore attribute reference
	 */
	public ElementaryRangeReference getCustFicoCreditScoreReference() {
		return custFicoCreditScore.getReference();
	}

	/**
	 * Getter for custFicoCreditScore attribute.
	 * @return custFicoCreditScore attribute
	 */
	public int getCustFicoCreditScore() {
		return custFicoCreditScore.getValue();
	}

	/**
	 * Setter for custFicoCreditScore attribute.
	 * @param custFicoCreditScore the new value of custFicoCreditScore
	 */
	public void setCustFicoCreditScore(int custFicoCreditScore) {
		this.custFicoCreditScore.setValue(custFicoCreditScore);
	}
}
