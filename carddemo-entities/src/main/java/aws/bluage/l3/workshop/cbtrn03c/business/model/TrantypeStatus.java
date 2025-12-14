package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity TrantypeStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'trantypeStat1' field, <br>
 * </p>
 * 
 * <p>About 'trantypeStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TrantypeStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary trantypeStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary trantypeStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new TrantypeStatus with a default record.
	 * @param configuration the configuration
	 */
	public TrantypeStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TrantypeStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TrantypeStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute trantypeStat1.
	 * @return the trantypeStat1 attribute reference
	 */
	public ElementaryRangeReference getTrantypeStat1Reference() {
		return trantypeStat1.getReference();
	}

	/**
	 * Getter for trantypeStat1 attribute.
	 * @return trantypeStat1 attribute
	 */
	public String getTrantypeStat1() {
		return trantypeStat1.getValue();
	}

	/**
	 * Setter for trantypeStat1 attribute.
	 * @param trantypeStat1 the new value of trantypeStat1
	 */
	public void setTrantypeStat1(String trantypeStat1) {
		this.trantypeStat1.setValue(trantypeStat1);
	}
	/**
	 * Gets the reference for attribute trantypeStat2.
	 * @return the trantypeStat2 attribute reference
	 */
	public ElementaryRangeReference getTrantypeStat2Reference() {
		return trantypeStat2.getReference();
	}

	/**
	 * Getter for trantypeStat2 attribute.
	 * @return trantypeStat2 attribute
	 */
	public String getTrantypeStat2() {
		return trantypeStat2.getValue();
	}

	/**
	 * Setter for trantypeStat2 attribute.
	 * @param trantypeStat2 the new value of trantypeStat2
	 */
	public void setTrantypeStat2(String trantypeStat2) {
		this.trantypeStat2.setValue(trantypeStat2);
	}
}
