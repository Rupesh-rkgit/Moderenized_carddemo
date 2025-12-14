package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity IoStatus04.
 * 
 * <p>About 'ioStatus0401' field, <br>
 * </p>
 * 
 * <p>About 'ioStatus0403' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class IoStatus04 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ioStatus0401 = new Elementary(root,new ZonedType(1, 0, false),Short.valueOf("0"));
	private final Elementary ioStatus0403 = new Elementary(root,new ZonedType(3, 0, false),Short.valueOf("0"));
	

	/**
	 * Instantiate a new IoStatus04 with a default record.
	 * @param configuration the configuration
	 */
	public IoStatus04(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new IoStatus04 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public IoStatus04(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ioStatus0401.
	 * @return the ioStatus0401 attribute reference
	 */
	public ElementaryRangeReference getIoStatus0401Reference() {
		return ioStatus0401.getReference();
	}

	/**
	 * Getter for ioStatus0401 attribute.
	 * @return ioStatus0401 attribute
	 */
	public int getIoStatus0401() {
		return ioStatus0401.getValue();
	}

	/**
	 * Setter for ioStatus0401 attribute.
	 * @param ioStatus0401 the new value of ioStatus0401
	 */
	public void setIoStatus0401(int ioStatus0401) {
		this.ioStatus0401.setValue(ioStatus0401);
	}
	/**
	 * Gets the reference for attribute ioStatus0403.
	 * @return the ioStatus0403 attribute reference
	 */
	public ElementaryRangeReference getIoStatus0403Reference() {
		return ioStatus0403.getReference();
	}

	/**
	 * Getter for ioStatus0403 attribute.
	 * @return ioStatus0403 attribute
	 */
	public int getIoStatus0403() {
		return ioStatus0403.getValue();
	}

	/**
	 * Setter for ioStatus0403 attribute.
	 * @param ioStatus0403 the new value of ioStatus0403
	 */
	public void setIoStatus0403(int ioStatus0403) {
		this.ioStatus0403.setValue(ioStatus0403);
	}
}
