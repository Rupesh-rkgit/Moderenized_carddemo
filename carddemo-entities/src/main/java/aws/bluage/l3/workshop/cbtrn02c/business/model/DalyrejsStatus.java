package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity DalyrejsStatus.
 * 
 * <p>About 'dalyrejsStat1' field, <br>
 * </p>
 * 
 * <p>About 'dalyrejsStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class DalyrejsStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dalyrejsStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary dalyrejsStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new DalyrejsStatus with a default record.
	 * @param configuration the configuration
	 */
	public DalyrejsStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new DalyrejsStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public DalyrejsStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dalyrejsStat1.
	 * @return the dalyrejsStat1 attribute reference
	 */
	public ElementaryRangeReference getDalyrejsStat1Reference() {
		return dalyrejsStat1.getReference();
	}

	/**
	 * Getter for dalyrejsStat1 attribute.
	 * @return dalyrejsStat1 attribute
	 */
	public String getDalyrejsStat1() {
		return dalyrejsStat1.getValue();
	}

	/**
	 * Setter for dalyrejsStat1 attribute.
	 * @param dalyrejsStat1 the new value of dalyrejsStat1
	 */
	public void setDalyrejsStat1(String dalyrejsStat1) {
		this.dalyrejsStat1.setValue(dalyrejsStat1);
	}
	/**
	 * Gets the reference for attribute dalyrejsStat2.
	 * @return the dalyrejsStat2 attribute reference
	 */
	public ElementaryRangeReference getDalyrejsStat2Reference() {
		return dalyrejsStat2.getReference();
	}

	/**
	 * Getter for dalyrejsStat2 attribute.
	 * @return dalyrejsStat2 attribute
	 */
	public String getDalyrejsStat2() {
		return dalyrejsStat2.getValue();
	}

	/**
	 * Setter for dalyrejsStat2 attribute.
	 * @param dalyrejsStat2 the new value of dalyrejsStat2
	 */
	public void setDalyrejsStat2(String dalyrejsStat2) {
		this.dalyrejsStat2.setValue(dalyrejsStat2);
	}
}
