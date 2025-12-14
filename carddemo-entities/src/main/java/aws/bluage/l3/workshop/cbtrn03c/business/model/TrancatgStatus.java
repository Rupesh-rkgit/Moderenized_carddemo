package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity TrancatgStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:01 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'trancatgStat1' field, <br>
 * </p>
 * 
 * <p>About 'trancatgStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TrancatgStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary trancatgStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary trancatgStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new TrancatgStatus with a default record.
	 * @param configuration the configuration
	 */
	public TrancatgStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TrancatgStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TrancatgStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute trancatgStat1.
	 * @return the trancatgStat1 attribute reference
	 */
	public ElementaryRangeReference getTrancatgStat1Reference() {
		return trancatgStat1.getReference();
	}

	/**
	 * Getter for trancatgStat1 attribute.
	 * @return trancatgStat1 attribute
	 */
	public String getTrancatgStat1() {
		return trancatgStat1.getValue();
	}

	/**
	 * Setter for trancatgStat1 attribute.
	 * @param trancatgStat1 the new value of trancatgStat1
	 */
	public void setTrancatgStat1(String trancatgStat1) {
		this.trancatgStat1.setValue(trancatgStat1);
	}
	/**
	 * Gets the reference for attribute trancatgStat2.
	 * @return the trancatgStat2 attribute reference
	 */
	public ElementaryRangeReference getTrancatgStat2Reference() {
		return trancatgStat2.getReference();
	}

	/**
	 * Getter for trancatgStat2 attribute.
	 * @return trancatgStat2 attribute
	 */
	public String getTrancatgStat2() {
		return trancatgStat2.getValue();
	}

	/**
	 * Setter for trancatgStat2 attribute.
	 * @param trancatgStat2 the new value of trancatgStat2
	 */
	public void setTrancatgStat2(String trancatgStat2) {
		this.trancatgStat2.setValue(trancatgStat2);
	}
}
