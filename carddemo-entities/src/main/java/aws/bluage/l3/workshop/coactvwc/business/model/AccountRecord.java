package aws.bluage.l3.workshop.coactvwc.business.model;

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
 * Data simplifier entity AccountRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT<br>
 *  <br>
 *  ACCOUNT RECORD LAYOUT<br>
 *  ****************************************************************<br>
 *      Data-structure for  account entity (RECLN 300)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'acctId' field, <br>
 * </p>
 * 
 * <p>About 'acctActiveStatus' field, <br>
 * </p>
 * 
 * <p>About 'acctCurrBal' field, <br>
 * </p>
 * 
 * <p>About 'acctCreditLimit' field, <br>
 * </p>
 * 
 * <p>About 'acctCashCreditLimit' field, <br>
 * </p>
 * 
 * <p>About 'acctOpenDate' field, <br>
 * </p>
 * 
 * <p>About 'acctExpiraionDate' field, <br>
 * </p>
 * 
 * <p>About 'acctReissueDate' field, <br>
 * </p>
 * 
 * <p>About 'acctCurrCycCredit' field, <br>
 * </p>
 * 
 * <p>About 'acctCurrCycDebit' field, <br>
 * </p>
 * 
 * <p>About 'acctAddrZip' field, <br>
 * </p>
 * 
 * <p>About 'acctGroupId' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class AccountRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary acctId = new Elementary(root,new ZonedType(11, 0, false));
	private final Elementary acctActiveStatus = new Elementary(root,new AlphanumericType(1));
	private final Elementary acctCurrBal = new Elementary(root,new ZonedType(10, 2, false, false, true));
	private final Elementary acctCreditLimit = new Elementary(root,new ZonedType(10, 2, false, false, true));
	private final Elementary acctCashCreditLimit = new Elementary(root,new ZonedType(10, 2, false, false, true));
	private final Elementary acctOpenDate = new Elementary(root,new AlphanumericType(10));
	private final Elementary acctExpiraionDate = new Elementary(root,new AlphanumericType(10));
	private final Elementary acctReissueDate = new Elementary(root,new AlphanumericType(10));
	private final Elementary acctCurrCycCredit = new Elementary(root,new ZonedType(10, 2, false, false, true));
	private final Elementary acctCurrCycDebit = new Elementary(root,new ZonedType(10, 2, false, false, true));
	private final Elementary acctAddrZip = new Elementary(root,new AlphanumericType(10));
	private final Elementary acctGroupId = new Elementary(root,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(178));
	

	/**
	 * Instantiate a new AccountRecord with a default record.
	 * @param configuration the configuration
	 */
	public AccountRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new AccountRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public AccountRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute acctId.
	 * @return the acctId attribute reference
	 */
	public ElementaryRangeReference getAcctIdReference() {
		return acctId.getReference();
	}

	/**
	 * Getter for acctId attribute.
	 * @return acctId attribute
	 */
	public long getAcctId() {
		return acctId.getValue();
	}

	/**
	 * Setter for acctId attribute.
	 * @param acctId the new value of acctId
	 */
	public void setAcctId(long acctId) {
		this.acctId.setValue(acctId);
	}
	/**
	 * Gets the reference for attribute acctActiveStatus.
	 * @return the acctActiveStatus attribute reference
	 */
	public ElementaryRangeReference getAcctActiveStatusReference() {
		return acctActiveStatus.getReference();
	}

	/**
	 * Getter for acctActiveStatus attribute.
	 * @return acctActiveStatus attribute
	 */
	public String getAcctActiveStatus() {
		return acctActiveStatus.getValue();
	}

	/**
	 * Setter for acctActiveStatus attribute.
	 * @param acctActiveStatus the new value of acctActiveStatus
	 */
	public void setAcctActiveStatus(String acctActiveStatus) {
		this.acctActiveStatus.setValue(acctActiveStatus);
	}
	/**
	 * Gets the reference for attribute acctCurrBal.
	 * @return the acctCurrBal attribute reference
	 */
	public ElementaryRangeReference getAcctCurrBalReference() {
		return acctCurrBal.getReference();
	}

	/**
	 * Getter for acctCurrBal attribute.
	 * @return acctCurrBal attribute
	 */
	public BigDecimal getAcctCurrBal() {
		return acctCurrBal.getValue();
	}

	/**
	 * Setter for acctCurrBal attribute.
	 * @param acctCurrBal the new value of acctCurrBal
	 */
	public void setAcctCurrBal(BigDecimal acctCurrBal) {
		this.acctCurrBal.setValue(acctCurrBal);
	}
	/**
	 * Gets the reference for attribute acctCreditLimit.
	 * @return the acctCreditLimit attribute reference
	 */
	public ElementaryRangeReference getAcctCreditLimitReference() {
		return acctCreditLimit.getReference();
	}

	/**
	 * Getter for acctCreditLimit attribute.
	 * @return acctCreditLimit attribute
	 */
	public BigDecimal getAcctCreditLimit() {
		return acctCreditLimit.getValue();
	}

	/**
	 * Setter for acctCreditLimit attribute.
	 * @param acctCreditLimit the new value of acctCreditLimit
	 */
	public void setAcctCreditLimit(BigDecimal acctCreditLimit) {
		this.acctCreditLimit.setValue(acctCreditLimit);
	}
	/**
	 * Gets the reference for attribute acctCashCreditLimit.
	 * @return the acctCashCreditLimit attribute reference
	 */
	public ElementaryRangeReference getAcctCashCreditLimitReference() {
		return acctCashCreditLimit.getReference();
	}

	/**
	 * Getter for acctCashCreditLimit attribute.
	 * @return acctCashCreditLimit attribute
	 */
	public BigDecimal getAcctCashCreditLimit() {
		return acctCashCreditLimit.getValue();
	}

	/**
	 * Setter for acctCashCreditLimit attribute.
	 * @param acctCashCreditLimit the new value of acctCashCreditLimit
	 */
	public void setAcctCashCreditLimit(BigDecimal acctCashCreditLimit) {
		this.acctCashCreditLimit.setValue(acctCashCreditLimit);
	}
	/**
	 * Gets the reference for attribute acctOpenDate.
	 * @return the acctOpenDate attribute reference
	 */
	public ElementaryRangeReference getAcctOpenDateReference() {
		return acctOpenDate.getReference();
	}

	/**
	 * Getter for acctOpenDate attribute.
	 * @return acctOpenDate attribute
	 */
	public String getAcctOpenDate() {
		return acctOpenDate.getValue();
	}

	/**
	 * Setter for acctOpenDate attribute.
	 * @param acctOpenDate the new value of acctOpenDate
	 */
	public void setAcctOpenDate(String acctOpenDate) {
		this.acctOpenDate.setValue(acctOpenDate);
	}
	/**
	 * Gets the reference for attribute acctExpiraionDate.
	 * @return the acctExpiraionDate attribute reference
	 */
	public ElementaryRangeReference getAcctExpiraionDateReference() {
		return acctExpiraionDate.getReference();
	}

	/**
	 * Getter for acctExpiraionDate attribute.
	 * @return acctExpiraionDate attribute
	 */
	public String getAcctExpiraionDate() {
		return acctExpiraionDate.getValue();
	}

	/**
	 * Setter for acctExpiraionDate attribute.
	 * @param acctExpiraionDate the new value of acctExpiraionDate
	 */
	public void setAcctExpiraionDate(String acctExpiraionDate) {
		this.acctExpiraionDate.setValue(acctExpiraionDate);
	}
	/**
	 * Gets the reference for attribute acctReissueDate.
	 * @return the acctReissueDate attribute reference
	 */
	public ElementaryRangeReference getAcctReissueDateReference() {
		return acctReissueDate.getReference();
	}

	/**
	 * Getter for acctReissueDate attribute.
	 * @return acctReissueDate attribute
	 */
	public String getAcctReissueDate() {
		return acctReissueDate.getValue();
	}

	/**
	 * Setter for acctReissueDate attribute.
	 * @param acctReissueDate the new value of acctReissueDate
	 */
	public void setAcctReissueDate(String acctReissueDate) {
		this.acctReissueDate.setValue(acctReissueDate);
	}
	/**
	 * Gets the reference for attribute acctCurrCycCredit.
	 * @return the acctCurrCycCredit attribute reference
	 */
	public ElementaryRangeReference getAcctCurrCycCreditReference() {
		return acctCurrCycCredit.getReference();
	}

	/**
	 * Getter for acctCurrCycCredit attribute.
	 * @return acctCurrCycCredit attribute
	 */
	public BigDecimal getAcctCurrCycCredit() {
		return acctCurrCycCredit.getValue();
	}

	/**
	 * Setter for acctCurrCycCredit attribute.
	 * @param acctCurrCycCredit the new value of acctCurrCycCredit
	 */
	public void setAcctCurrCycCredit(BigDecimal acctCurrCycCredit) {
		this.acctCurrCycCredit.setValue(acctCurrCycCredit);
	}
	/**
	 * Gets the reference for attribute acctCurrCycDebit.
	 * @return the acctCurrCycDebit attribute reference
	 */
	public ElementaryRangeReference getAcctCurrCycDebitReference() {
		return acctCurrCycDebit.getReference();
	}

	/**
	 * Getter for acctCurrCycDebit attribute.
	 * @return acctCurrCycDebit attribute
	 */
	public BigDecimal getAcctCurrCycDebit() {
		return acctCurrCycDebit.getValue();
	}

	/**
	 * Setter for acctCurrCycDebit attribute.
	 * @param acctCurrCycDebit the new value of acctCurrCycDebit
	 */
	public void setAcctCurrCycDebit(BigDecimal acctCurrCycDebit) {
		this.acctCurrCycDebit.setValue(acctCurrCycDebit);
	}
	/**
	 * Gets the reference for attribute acctAddrZip.
	 * @return the acctAddrZip attribute reference
	 */
	public ElementaryRangeReference getAcctAddrZipReference() {
		return acctAddrZip.getReference();
	}

	/**
	 * Getter for acctAddrZip attribute.
	 * @return acctAddrZip attribute
	 */
	public String getAcctAddrZip() {
		return acctAddrZip.getValue();
	}

	/**
	 * Setter for acctAddrZip attribute.
	 * @param acctAddrZip the new value of acctAddrZip
	 */
	public void setAcctAddrZip(String acctAddrZip) {
		this.acctAddrZip.setValue(acctAddrZip);
	}
	/**
	 * Gets the reference for attribute acctGroupId.
	 * @return the acctGroupId attribute reference
	 */
	public ElementaryRangeReference getAcctGroupIdReference() {
		return acctGroupId.getReference();
	}

	/**
	 * Getter for acctGroupId attribute.
	 * @return acctGroupId attribute
	 */
	public String getAcctGroupId() {
		return acctGroupId.getValue();
	}

	/**
	 * Setter for acctGroupId attribute.
	 * @param acctGroupId the new value of acctGroupId
	 */
	public void setAcctGroupId(String acctGroupId) {
		this.acctGroupId.setValue(acctGroupId);
	}
}
