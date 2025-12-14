package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity AcctfileStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'acctfileStat1' field, <br>
 * </p>
 * 
 * <p>About 'acctfileStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class AcctfileStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary acctfileStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary acctfileStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new AcctfileStatus with a default record.
	 * @param configuration the configuration
	 */
	public AcctfileStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new AcctfileStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public AcctfileStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute acctfileStat1.
	 * @return the acctfileStat1 attribute reference
	 */
	public ElementaryRangeReference getAcctfileStat1Reference() {
		return acctfileStat1.getReference();
	}

	/**
	 * Getter for acctfileStat1 attribute.
	 * @return acctfileStat1 attribute
	 */
	public String getAcctfileStat1() {
		return acctfileStat1.getValue();
	}

	/**
	 * Setter for acctfileStat1 attribute.
	 * @param acctfileStat1 the new value of acctfileStat1
	 */
	public void setAcctfileStat1(String acctfileStat1) {
		this.acctfileStat1.setValue(acctfileStat1);
	}
	/**
	 * Gets the reference for attribute acctfileStat2.
	 * @return the acctfileStat2 attribute reference
	 */
	public ElementaryRangeReference getAcctfileStat2Reference() {
		return acctfileStat2.getReference();
	}

	/**
	 * Getter for acctfileStat2 attribute.
	 * @return acctfileStat2 attribute
	 */
	public String getAcctfileStat2() {
		return acctfileStat2.getValue();
	}

	/**
	 * Setter for acctfileStat2 attribute.
	 * @param acctfileStat2 the new value of acctfileStat2
	 */
	public void setAcctfileStat2(String acctfileStat2) {
		this.acctfileStat2.setValue(acctfileStat2);
	}
}
