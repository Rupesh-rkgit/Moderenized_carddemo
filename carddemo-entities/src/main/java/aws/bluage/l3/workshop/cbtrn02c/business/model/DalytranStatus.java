package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity DalytranStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:01 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'dalytranStat1' field, <br>
 * </p>
 * 
 * <p>About 'dalytranStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class DalytranStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dalytranStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary dalytranStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new DalytranStatus with a default record.
	 * @param configuration the configuration
	 */
	public DalytranStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new DalytranStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public DalytranStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dalytranStat1.
	 * @return the dalytranStat1 attribute reference
	 */
	public ElementaryRangeReference getDalytranStat1Reference() {
		return dalytranStat1.getReference();
	}

	/**
	 * Getter for dalytranStat1 attribute.
	 * @return dalytranStat1 attribute
	 */
	public String getDalytranStat1() {
		return dalytranStat1.getValue();
	}

	/**
	 * Setter for dalytranStat1 attribute.
	 * @param dalytranStat1 the new value of dalytranStat1
	 */
	public void setDalytranStat1(String dalytranStat1) {
		this.dalytranStat1.setValue(dalytranStat1);
	}
	/**
	 * Gets the reference for attribute dalytranStat2.
	 * @return the dalytranStat2 attribute reference
	 */
	public ElementaryRangeReference getDalytranStat2Reference() {
		return dalytranStat2.getReference();
	}

	/**
	 * Getter for dalytranStat2 attribute.
	 * @return dalytranStat2 attribute
	 */
	public String getDalytranStat2() {
		return dalytranStat2.getValue();
	}

	/**
	 * Setter for dalytranStat2 attribute.
	 * @param dalytranStat2 the new value of dalytranStat2
	 */
	public void setDalytranStat2(String dalytranStat2) {
		this.dalytranStat2.setValue(dalytranStat2);
	}
}
