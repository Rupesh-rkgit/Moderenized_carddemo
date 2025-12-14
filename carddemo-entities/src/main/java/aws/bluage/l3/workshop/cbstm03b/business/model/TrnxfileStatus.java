package aws.bluage.l3.workshop.cbstm03b.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity TrnxfileStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'trnxfileStat1' field, <br>
 * </p>
 * 
 * <p>About 'trnxfileStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class TrnxfileStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary trnxfileStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary trnxfileStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new TrnxfileStatus with a default record.
	 * @param configuration the configuration
	 */
	public TrnxfileStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TrnxfileStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TrnxfileStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute trnxfileStat1.
	 * @return the trnxfileStat1 attribute reference
	 */
	public ElementaryRangeReference getTrnxfileStat1Reference() {
		return trnxfileStat1.getReference();
	}

	/**
	 * Getter for trnxfileStat1 attribute.
	 * @return trnxfileStat1 attribute
	 */
	public String getTrnxfileStat1() {
		return trnxfileStat1.getValue();
	}

	/**
	 * Setter for trnxfileStat1 attribute.
	 * @param trnxfileStat1 the new value of trnxfileStat1
	 */
	public void setTrnxfileStat1(String trnxfileStat1) {
		this.trnxfileStat1.setValue(trnxfileStat1);
	}
	/**
	 * Gets the reference for attribute trnxfileStat2.
	 * @return the trnxfileStat2 attribute reference
	 */
	public ElementaryRangeReference getTrnxfileStat2Reference() {
		return trnxfileStat2.getReference();
	}

	/**
	 * Getter for trnxfileStat2 attribute.
	 * @return trnxfileStat2 attribute
	 */
	public String getTrnxfileStat2() {
		return trnxfileStat2.getValue();
	}

	/**
	 * Setter for trnxfileStat2 attribute.
	 * @param trnxfileStat2 the new value of trnxfileStat2
	 */
	public void setTrnxfileStat2(String trnxfileStat2) {
		this.trnxfileStat2.setValue(trnxfileStat2);
	}
}
