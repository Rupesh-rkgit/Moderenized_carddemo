package aws.bluage.l3.workshop.corpt00c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.VariableSizeArray;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Dfhcommarea.
 * 
 * <p>About 'lkCommarea' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Dfhcommarea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary lkCommarea = new Elementary(root,new VariableSizeArray(32767),new AlphanumericType(1));
	

	/**
	 * Instantiate a new Dfhcommarea with a default record.
	 * @param configuration the configuration
	 */
	public Dfhcommarea(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Dfhcommarea bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Dfhcommarea(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Count holder setter for lkCommarea attribute.
	 * @param countHolder the ElementaryRangeReference that acts as count holder for lkCommarea
	 */
	public void setLkCommareaCountHolder (ElementaryRangeReference countHolder){
		((VariableSizeArray)this.lkCommarea.getRepetition()).setCountHolder(countHolder);	
	}
	/**
	 * Indexed getter for lkCommarea attribute.
	 * @param indexes the indexes
	 * @return lkCommarea attribute
	 */
	public ElementaryRangeReference getItemFromLkCommareaReference(Integer... indexes) {
		return lkCommarea.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for lkCommarea attribute.
	 * @param indexes the indexes
	 * @return lkCommarea attribute
	 */
	public String getItemFromLkCommarea(Integer... indexes) {
		return lkCommarea.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for lkCommarea attribute.
	 * @param lkCommarea the new value of lkCommarea for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromLkCommarea(String lkCommarea,Integer... indexes) {
		this.lkCommarea.setIndexedValue(lkCommarea,indexes);
	}
	
	/**
	 * Collection size getter for lkCommarea attribute.
	 * @return  the collection size for attributelkCommarea
	 */
	public int getLkCommareaSize(){
		return lkCommarea.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for lkCommarea attribute.
	 * @param indexes the indexes
	 * @return lkCommarea attribute
	 */
	public ElementaryRangeReference getLkCommareaReference() {
		return lkCommarea.getReference();
	}
	
	/**
	 * Indexed getter for lkCommarea attribute.
	 * @param indexes the indexes
	 * @return lkCommarea attribute
	 */
	public String getLkCommarea() {
		return lkCommarea.getValue();
	}
	
	/**
	 * Indexed setter for lkCommarea attribute.
	 * @param lkCommarea the new value of lkCommarea for given indexes
	 * @param indexes the indexes
	 */
	public void setLkCommarea(String lkCommarea) {
		this.lkCommarea.setValue(lkCommarea);
	}
	
}
