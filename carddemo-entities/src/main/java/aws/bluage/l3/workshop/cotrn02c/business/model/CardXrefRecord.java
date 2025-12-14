package aws.bluage.l3.workshop.cotrn02c.business.model;

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
 * Data simplifier entity CardXrefRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT<br>
 *  <br>
 *  ****************************************************************<br>
 *      Data-structure for card xref (RECLN 50)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'xrefCardNum' field, <br>
 * </p>
 * 
 * <p>About 'xrefCustId' field, <br>
 * </p>
 * 
 * <p>About 'xrefAcctId' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class CardXrefRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary xrefCardNum = new Elementary(root,new AlphanumericType(16));
	private final Elementary xrefCustId = new Elementary(root,new ZonedType(9, 0, false));
	private final Elementary xrefAcctId = new Elementary(root,new ZonedType(11, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(14));
	

	/**
	 * Instantiate a new CardXrefRecord with a default record.
	 * @param configuration the configuration
	 */
	public CardXrefRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CardXrefRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CardXrefRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute xrefCardNum.
	 * @return the xrefCardNum attribute reference
	 */
	public ElementaryRangeReference getXrefCardNumReference() {
		return xrefCardNum.getReference();
	}

	/**
	 * Getter for xrefCardNum attribute.
	 * @return xrefCardNum attribute
	 */
	public String getXrefCardNum() {
		return xrefCardNum.getValue();
	}

	/**
	 * Setter for xrefCardNum attribute.
	 * @param xrefCardNum the new value of xrefCardNum
	 */
	public void setXrefCardNum(String xrefCardNum) {
		this.xrefCardNum.setValue(xrefCardNum);
	}
	/**
	 * Gets the reference for attribute xrefCustId.
	 * @return the xrefCustId attribute reference
	 */
	public ElementaryRangeReference getXrefCustIdReference() {
		return xrefCustId.getReference();
	}

	/**
	 * Getter for xrefCustId attribute.
	 * @return xrefCustId attribute
	 */
	public int getXrefCustId() {
		return xrefCustId.getValue();
	}

	/**
	 * Setter for xrefCustId attribute.
	 * @param xrefCustId the new value of xrefCustId
	 */
	public void setXrefCustId(int xrefCustId) {
		this.xrefCustId.setValue(xrefCustId);
	}
	/**
	 * Gets the reference for attribute xrefAcctId.
	 * @return the xrefAcctId attribute reference
	 */
	public ElementaryRangeReference getXrefAcctIdReference() {
		return xrefAcctId.getReference();
	}

	/**
	 * Getter for xrefAcctId attribute.
	 * @return xrefAcctId attribute
	 */
	public long getXrefAcctId() {
		return xrefAcctId.getValue();
	}

	/**
	 * Setter for xrefAcctId attribute.
	 * @param xrefAcctId the new value of xrefAcctId
	 */
	public void setXrefAcctId(long xrefAcctId) {
		this.xrefAcctId.setValue(xrefAcctId);
	}
}
