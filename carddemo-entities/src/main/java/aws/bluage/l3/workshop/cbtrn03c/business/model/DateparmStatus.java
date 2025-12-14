package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity DateparmStatus.
 * 
 * <p>About 'dateparmStat1' field, <br>
 * </p>
 * 
 * <p>About 'dateparmStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class DateparmStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary dateparmStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary dateparmStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new DateparmStatus with a default record.
	 * @param configuration the configuration
	 */
	public DateparmStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new DateparmStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public DateparmStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dateparmStat1.
	 * @return the dateparmStat1 attribute reference
	 */
	public ElementaryRangeReference getDateparmStat1Reference() {
		return dateparmStat1.getReference();
	}

	/**
	 * Getter for dateparmStat1 attribute.
	 * @return dateparmStat1 attribute
	 */
	public String getDateparmStat1() {
		return dateparmStat1.getValue();
	}

	/**
	 * Setter for dateparmStat1 attribute.
	 * @param dateparmStat1 the new value of dateparmStat1
	 */
	public void setDateparmStat1(String dateparmStat1) {
		this.dateparmStat1.setValue(dateparmStat1);
	}
	/**
	 * Gets the reference for attribute dateparmStat2.
	 * @return the dateparmStat2 attribute reference
	 */
	public ElementaryRangeReference getDateparmStat2Reference() {
		return dateparmStat2.getReference();
	}

	/**
	 * Getter for dateparmStat2 attribute.
	 * @return dateparmStat2 attribute
	 */
	public String getDateparmStat2() {
		return dateparmStat2.getValue();
	}

	/**
	 * Setter for dateparmStat2 attribute.
	 * @param dateparmStat2 the new value of dateparmStat2
	 */
	public void setDateparmStat2(String dateparmStat2) {
		this.dateparmStat2.setValue(dateparmStat2);
	}
}
