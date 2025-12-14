package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity IoStatus.
 * 
 * <p>About 'ioStat1' field, <br>
 * </p>
 * 
 * <p>About 'ioStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class IoStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ioStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary ioStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new IoStatus with a default record.
	 * @param configuration the configuration
	 */
	public IoStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new IoStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public IoStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ioStat1.
	 * @return the ioStat1 attribute reference
	 */
	public ElementaryRangeReference getIoStat1Reference() {
		return ioStat1.getReference();
	}

	/**
	 * Getter for ioStat1 attribute.
	 * @return ioStat1 attribute
	 */
	public String getIoStat1() {
		return ioStat1.getValue();
	}

	/**
	 * Setter for ioStat1 attribute.
	 * @param ioStat1 the new value of ioStat1
	 */
	public void setIoStat1(String ioStat1) {
		this.ioStat1.setValue(ioStat1);
	}
	/**
	 * Gets the reference for attribute ioStat2.
	 * @return the ioStat2 attribute reference
	 */
	public ElementaryRangeReference getIoStat2Reference() {
		return ioStat2.getReference();
	}

	/**
	 * Getter for ioStat2 attribute.
	 * @return ioStat2 attribute
	 */
	public String getIoStat2() {
		return ioStat2.getValue();
	}

	/**
	 * Setter for ioStat2 attribute.
	 * @param ioStat2 the new value of ioStat2
	 */
	public void setIoStat2(String ioStat2) {
		this.ioStat2.setValue(ioStat2);
	}
}
