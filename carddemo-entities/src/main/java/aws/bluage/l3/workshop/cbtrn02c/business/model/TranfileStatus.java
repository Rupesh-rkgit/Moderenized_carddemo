package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity TranfileStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:01 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'tranfileStat1' field, <br>
 * </p>
 * 
 * <p>About 'tranfileStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TranfileStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary tranfileStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary tranfileStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new TranfileStatus with a default record.
	 * @param configuration the configuration
	 */
	public TranfileStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TranfileStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TranfileStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute tranfileStat1.
	 * @return the tranfileStat1 attribute reference
	 */
	public ElementaryRangeReference getTranfileStat1Reference() {
		return tranfileStat1.getReference();
	}

	/**
	 * Getter for tranfileStat1 attribute.
	 * @return tranfileStat1 attribute
	 */
	public String getTranfileStat1() {
		return tranfileStat1.getValue();
	}

	/**
	 * Setter for tranfileStat1 attribute.
	 * @param tranfileStat1 the new value of tranfileStat1
	 */
	public void setTranfileStat1(String tranfileStat1) {
		this.tranfileStat1.setValue(tranfileStat1);
	}
	/**
	 * Gets the reference for attribute tranfileStat2.
	 * @return the tranfileStat2 attribute reference
	 */
	public ElementaryRangeReference getTranfileStat2Reference() {
		return tranfileStat2.getReference();
	}

	/**
	 * Getter for tranfileStat2 attribute.
	 * @return tranfileStat2 attribute
	 */
	public String getTranfileStat2() {
		return tranfileStat2.getValue();
	}

	/**
	 * Setter for tranfileStat2 attribute.
	 * @param tranfileStat2 the new value of tranfileStat2
	 */
	public void setTranfileStat2(String tranfileStat2) {
		this.tranfileStat2.setValue(tranfileStat2);
	}
}
