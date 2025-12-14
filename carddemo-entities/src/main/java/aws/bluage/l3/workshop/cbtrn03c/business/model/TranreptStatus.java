package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity TranreptStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:01 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'reptfileStat1' field, <br>
 * </p>
 * 
 * <p>About 'reptfileStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TranreptStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary reptfileStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary reptfileStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new TranreptStatus with a default record.
	 * @param configuration the configuration
	 */
	public TranreptStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TranreptStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TranreptStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute reptfileStat1.
	 * @return the reptfileStat1 attribute reference
	 */
	public ElementaryRangeReference getReptfileStat1Reference() {
		return reptfileStat1.getReference();
	}

	/**
	 * Getter for reptfileStat1 attribute.
	 * @return reptfileStat1 attribute
	 */
	public String getReptfileStat1() {
		return reptfileStat1.getValue();
	}

	/**
	 * Setter for reptfileStat1 attribute.
	 * @param reptfileStat1 the new value of reptfileStat1
	 */
	public void setReptfileStat1(String reptfileStat1) {
		this.reptfileStat1.setValue(reptfileStat1);
	}
	/**
	 * Gets the reference for attribute reptfileStat2.
	 * @return the reptfileStat2 attribute reference
	 */
	public ElementaryRangeReference getReptfileStat2Reference() {
		return reptfileStat2.getReference();
	}

	/**
	 * Getter for reptfileStat2 attribute.
	 * @return reptfileStat2 attribute
	 */
	public String getReptfileStat2() {
		return reptfileStat2.getValue();
	}

	/**
	 * Setter for reptfileStat2 attribute.
	 * @param reptfileStat2 the new value of reptfileStat2
	 */
	public void setReptfileStat2(String reptfileStat2) {
		this.reptfileStat2.setValue(reptfileStat2);
	}
}
