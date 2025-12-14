package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity TcatbalfStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'tcatbalfStat1' field, <br>
 * </p>
 * 
 * <p>About 'tcatbalfStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TcatbalfStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary tcatbalfStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary tcatbalfStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new TcatbalfStatus with a default record.
	 * @param configuration the configuration
	 */
	public TcatbalfStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TcatbalfStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TcatbalfStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute tcatbalfStat1.
	 * @return the tcatbalfStat1 attribute reference
	 */
	public ElementaryRangeReference getTcatbalfStat1Reference() {
		return tcatbalfStat1.getReference();
	}

	/**
	 * Getter for tcatbalfStat1 attribute.
	 * @return tcatbalfStat1 attribute
	 */
	public String getTcatbalfStat1() {
		return tcatbalfStat1.getValue();
	}

	/**
	 * Setter for tcatbalfStat1 attribute.
	 * @param tcatbalfStat1 the new value of tcatbalfStat1
	 */
	public void setTcatbalfStat1(String tcatbalfStat1) {
		this.tcatbalfStat1.setValue(tcatbalfStat1);
	}
	/**
	 * Gets the reference for attribute tcatbalfStat2.
	 * @return the tcatbalfStat2 attribute reference
	 */
	public ElementaryRangeReference getTcatbalfStat2Reference() {
		return tcatbalfStat2.getReference();
	}

	/**
	 * Getter for tcatbalfStat2 attribute.
	 * @return tcatbalfStat2 attribute
	 */
	public String getTcatbalfStat2() {
		return tcatbalfStat2.getValue();
	}

	/**
	 * Setter for tcatbalfStat2 attribute.
	 * @param tcatbalfStat2 the new value of tcatbalfStat2
	 */
	public void setTcatbalfStat2(String tcatbalfStat2) {
		this.tcatbalfStat2.setValue(tcatbalfStat2);
	}
}
