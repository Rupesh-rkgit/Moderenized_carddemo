package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.NumericEditedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity TransactionDetailReport.
 * 
 * <p>About 'tranReportTransId' field, <br>
 * </p>
 * 
 * <p>About 'tranReportAccountId' field, <br>
 * </p>
 * 
 * <p>About 'tranReportTypeCd' field, <br>
 * </p>
 * 
 * <p>About 'tranReportTypeDesc' field, <br>
 * </p>
 * 
 * <p>About 'tranReportCatCd' field, <br>
 * </p>
 * 
 * <p>About 'tranReportCatDesc' field, <br>
 * </p>
 * 
 * <p>About 'tranReportSource' field, <br>
 * </p>
 * 
 * <p>About 'tranReportAmt' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TransactionDetailReport extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary tranReportTransId = new Elementary(root,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(1)," ");
	private final Elementary tranReportAccountId = new Elementary(root,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(1)," ");
	private final Elementary tranReportTypeCd = new Elementary(root,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(1),"-");
	private final Elementary tranReportTypeDesc = new Elementary(root,new AlphanumericType(15));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(1)," ");
	private final Elementary tranReportCatCd = new Elementary(root,new ZonedType(4, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(1),"-");
	private final Elementary tranReportCatDesc = new Elementary(root,new AlphanumericType(29));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(root,new AlphanumericType(1)," ");
	private final Elementary tranReportSource = new Elementary(root,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(root,new AlphanumericType(4)," ");
	private final Elementary tranReportAmt = new Elementary(root,new NumericEditedType("-ZZZ,ZZZ,ZZZ.ZZ"));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(root,new AlphanumericType(2)," ");
	

	/**
	 * Instantiate a new TransactionDetailReport with a default record.
	 * @param configuration the configuration
	 */
	public TransactionDetailReport(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TransactionDetailReport bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TransactionDetailReport(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute tranReportTransId.
	 * @return the tranReportTransId attribute reference
	 */
	public ElementaryRangeReference getTranReportTransIdReference() {
		return tranReportTransId.getReference();
	}

	/**
	 * Getter for tranReportTransId attribute.
	 * @return tranReportTransId attribute
	 */
	public String getTranReportTransId() {
		return tranReportTransId.getValue();
	}

	/**
	 * Setter for tranReportTransId attribute.
	 * @param tranReportTransId the new value of tranReportTransId
	 */
	public void setTranReportTransId(String tranReportTransId) {
		this.tranReportTransId.setValue(tranReportTransId);
	}
	/**
	 * Gets the reference for attribute tranReportAccountId.
	 * @return the tranReportAccountId attribute reference
	 */
	public ElementaryRangeReference getTranReportAccountIdReference() {
		return tranReportAccountId.getReference();
	}

	/**
	 * Getter for tranReportAccountId attribute.
	 * @return tranReportAccountId attribute
	 */
	public String getTranReportAccountId() {
		return tranReportAccountId.getValue();
	}

	/**
	 * Setter for tranReportAccountId attribute.
	 * @param tranReportAccountId the new value of tranReportAccountId
	 */
	public void setTranReportAccountId(String tranReportAccountId) {
		this.tranReportAccountId.setValue(tranReportAccountId);
	}
	/**
	 * Gets the reference for attribute tranReportTypeCd.
	 * @return the tranReportTypeCd attribute reference
	 */
	public ElementaryRangeReference getTranReportTypeCdReference() {
		return tranReportTypeCd.getReference();
	}

	/**
	 * Getter for tranReportTypeCd attribute.
	 * @return tranReportTypeCd attribute
	 */
	public String getTranReportTypeCd() {
		return tranReportTypeCd.getValue();
	}

	/**
	 * Setter for tranReportTypeCd attribute.
	 * @param tranReportTypeCd the new value of tranReportTypeCd
	 */
	public void setTranReportTypeCd(String tranReportTypeCd) {
		this.tranReportTypeCd.setValue(tranReportTypeCd);
	}
	/**
	 * Gets the reference for attribute tranReportTypeDesc.
	 * @return the tranReportTypeDesc attribute reference
	 */
	public ElementaryRangeReference getTranReportTypeDescReference() {
		return tranReportTypeDesc.getReference();
	}

	/**
	 * Getter for tranReportTypeDesc attribute.
	 * @return tranReportTypeDesc attribute
	 */
	public String getTranReportTypeDesc() {
		return tranReportTypeDesc.getValue();
	}

	/**
	 * Setter for tranReportTypeDesc attribute.
	 * @param tranReportTypeDesc the new value of tranReportTypeDesc
	 */
	public void setTranReportTypeDesc(String tranReportTypeDesc) {
		this.tranReportTypeDesc.setValue(tranReportTypeDesc);
	}
	/**
	 * Gets the reference for attribute tranReportCatCd.
	 * @return the tranReportCatCd attribute reference
	 */
	public ElementaryRangeReference getTranReportCatCdReference() {
		return tranReportCatCd.getReference();
	}

	/**
	 * Getter for tranReportCatCd attribute.
	 * @return tranReportCatCd attribute
	 */
	public int getTranReportCatCd() {
		return tranReportCatCd.getValue();
	}

	/**
	 * Setter for tranReportCatCd attribute.
	 * @param tranReportCatCd the new value of tranReportCatCd
	 */
	public void setTranReportCatCd(int tranReportCatCd) {
		this.tranReportCatCd.setValue(tranReportCatCd);
	}
	/**
	 * Gets the reference for attribute tranReportCatDesc.
	 * @return the tranReportCatDesc attribute reference
	 */
	public ElementaryRangeReference getTranReportCatDescReference() {
		return tranReportCatDesc.getReference();
	}

	/**
	 * Getter for tranReportCatDesc attribute.
	 * @return tranReportCatDesc attribute
	 */
	public String getTranReportCatDesc() {
		return tranReportCatDesc.getValue();
	}

	/**
	 * Setter for tranReportCatDesc attribute.
	 * @param tranReportCatDesc the new value of tranReportCatDesc
	 */
	public void setTranReportCatDesc(String tranReportCatDesc) {
		this.tranReportCatDesc.setValue(tranReportCatDesc);
	}
	/**
	 * Gets the reference for attribute tranReportSource.
	 * @return the tranReportSource attribute reference
	 */
	public ElementaryRangeReference getTranReportSourceReference() {
		return tranReportSource.getReference();
	}

	/**
	 * Getter for tranReportSource attribute.
	 * @return tranReportSource attribute
	 */
	public String getTranReportSource() {
		return tranReportSource.getValue();
	}

	/**
	 * Setter for tranReportSource attribute.
	 * @param tranReportSource the new value of tranReportSource
	 */
	public void setTranReportSource(String tranReportSource) {
		this.tranReportSource.setValue(tranReportSource);
	}
	/**
	 * Gets the reference for attribute tranReportAmt.
	 * @return the tranReportAmt attribute reference
	 */
	public ElementaryRangeReference getTranReportAmtReference() {
		return tranReportAmt.getReference();
	}

	/**
	 * Getter for tranReportAmt attribute.
	 * @return tranReportAmt attribute
	 */
	public String getTranReportAmt() {
		return tranReportAmt.getValue();
	}

	/**
	 * Setter for tranReportAmt attribute.
	 * @param tranReportAmt the new value of tranReportAmt
	 */
	public void setTranReportAmt(String tranReportAmt) {
		this.tranReportAmt.setValue(tranReportAmt);
	}
}
