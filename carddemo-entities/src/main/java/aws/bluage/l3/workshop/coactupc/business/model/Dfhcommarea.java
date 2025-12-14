package aws.bluage.l3.workshop.coactupc.business.model;

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
 * <p>About 'table' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Dfhcommarea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary table = new Elementary(root,new VariableSizeArray(32767),new AlphanumericType(1));
	

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
	 * Count holder setter for table attribute.
	 * @param countHolder the ElementaryRangeReference that acts as count holder for table
	 */
	public void setTableCountHolder (ElementaryRangeReference countHolder){
		((VariableSizeArray)this.table.getRepetition()).setCountHolder(countHolder);	
	}
	/**
	 * Indexed getter for table attribute.
	 * @param indexes the indexes
	 * @return table attribute
	 */
	public ElementaryRangeReference getItemFromTableReference(Integer... indexes) {
		return table.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for table attribute.
	 * @param indexes the indexes
	 * @return table attribute
	 */
	public String getItemFromTable(Integer... indexes) {
		return table.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for table attribute.
	 * @param table the new value of table for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromTable(String table,Integer... indexes) {
		this.table.setIndexedValue(table,indexes);
	}
	
	/**
	 * Collection size getter for table attribute.
	 * @return  the collection size for attributetable
	 */
	public int getTableSize(){
		return table.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for table attribute.
	 * @param indexes the indexes
	 * @return table attribute
	 */
	public ElementaryRangeReference getTableReference() {
		return table.getReference();
	}
	
	/**
	 * Indexed getter for table attribute.
	 * @param indexes the indexes
	 * @return table attribute
	 */
	public String getTable() {
		return table.getValue();
	}
	
	/**
	 * Indexed setter for table attribute.
	 * @param table the new value of table for given indexes
	 * @param indexes the indexes
	 */
	public void setTable(String table) {
		this.table.setValue(table);
	}
	
}
