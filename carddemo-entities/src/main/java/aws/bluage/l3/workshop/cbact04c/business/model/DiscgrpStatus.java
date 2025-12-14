package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity DiscgrpStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'discgrpStat1' field, <br>
 * </p>
 * 
 * <p>About 'discgrpStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class DiscgrpStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary discgrpStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary discgrpStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new DiscgrpStatus with a default record.
	 * @param configuration the configuration
	 */
	public DiscgrpStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new DiscgrpStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public DiscgrpStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute discgrpStat1.
	 * @return the discgrpStat1 attribute reference
	 */
	public ElementaryRangeReference getDiscgrpStat1Reference() {
		return discgrpStat1.getReference();
	}

	/**
	 * Getter for discgrpStat1 attribute.
	 * @return discgrpStat1 attribute
	 */
	public String getDiscgrpStat1() {
		return discgrpStat1.getValue();
	}

	/**
	 * Setter for discgrpStat1 attribute.
	 * @param discgrpStat1 the new value of discgrpStat1
	 */
	public void setDiscgrpStat1(String discgrpStat1) {
		this.discgrpStat1.setValue(discgrpStat1);
	}
	/**
	 * Gets the reference for attribute discgrpStat2.
	 * @return the discgrpStat2 attribute reference
	 */
	public ElementaryRangeReference getDiscgrpStat2Reference() {
		return discgrpStat2.getReference();
	}

	/**
	 * Getter for discgrpStat2 attribute.
	 * @return discgrpStat2 attribute
	 */
	public String getDiscgrpStat2() {
		return discgrpStat2.getValue();
	}

	/**
	 * Setter for discgrpStat2 attribute.
	 * @param discgrpStat2 the new value of discgrpStat2
	 */
	public void setDiscgrpStat2(String discgrpStat2) {
		this.discgrpStat2.setValue(discgrpStat2);
	}
}
