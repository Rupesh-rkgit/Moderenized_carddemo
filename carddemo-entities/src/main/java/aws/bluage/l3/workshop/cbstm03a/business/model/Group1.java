package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PointerType;
/**
 * Data simplifier entity Group1.
 * 
 * <p>About 'bumpTiot' field, <br>
 * </p>
 * 
 * <p>About 'tiotIndex' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Group1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Union union = new Union(root);
	private final Elementary bumpTiot = new Elementary(union,new BinaryType(8, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary tiotIndex = new Elementary(union,new PointerType());
	

	/**
	 * Instantiate a new Group1 with a default record.
	 * @param configuration the configuration
	 */
	public Group1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Group1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Group1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute bumpTiot.
	 * @return the bumpTiot attribute reference
	 */
	public ElementaryRangeReference getBumpTiotReference() {
		return bumpTiot.getReference();
	}

	/**
	 * Getter for bumpTiot attribute.
	 * @return bumpTiot attribute
	 */
	public int getBumpTiot() {
		return bumpTiot.getValue();
	}

	/**
	 * Setter for bumpTiot attribute.
	 * @param bumpTiot the new value of bumpTiot
	 */
	public void setBumpTiot(int bumpTiot) {
		this.bumpTiot.setValue(bumpTiot);
	}
	/**
	 * Gets the reference for attribute tiotIndex.
	 * @return the tiotIndex attribute reference
	 */
	public ElementaryRangeReference getTiotIndexReference() {
		return tiotIndex.getReference();
	}

	/**
	 * Getter for tiotIndex attribute.
	 * @return tiotIndex attribute
	 */
	public Integer getTiotIndex() {
		return tiotIndex.getValue();
	}

	/**
	 * Setter for tiotIndex attribute.
	 * @param tiotIndex the new value of tiotIndex
	 */
	public void setTiotIndex(Integer tiotIndex) {
		this.tiotIndex.setValue(tiotIndex);
	}
}
