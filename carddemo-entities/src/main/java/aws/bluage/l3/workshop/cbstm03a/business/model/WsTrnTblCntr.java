package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity WsTrnTblCntr.
 * 
 * <p>About 'wsTrnTblCtr' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.wsTrnTblCtr
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsTrnTblCntr extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group wsTrnTblCtr = new Group(root,new FixedArray(51));
	private final Elementary wsTrct = new Elementary(wsTrnTblCtr,new BinaryType(4, 0, "STD", false, false, true));
	

	/**
	 * Instantiate a new WsTrnTblCntr with a default record.
	 * @param configuration the configuration
	 */
	public WsTrnTblCntr(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsTrnTblCntr bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsTrnTblCntr(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Indexed getter for group wsTrnTblCtr attribute.
	 * @param indexes the indexes
	 * @return wsTrnTblCtr attribute
	 */
	public RangeReference getItemFromWsTrnTblCtrReference(Integer... indexes){
		return wsTrnTblCtr.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group wsTrnTblCtr attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromWsTrnTblCtr( RangeReference rangeReference, Integer... indexes){
		wsTrnTblCtr.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group wsTrnTblCtr attribute.
	 * @return  the collection size for attributewsTrnTblCtr
	 */
	public int getWsTrnTblCtrSize(){
		return wsTrnTblCtr.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for wsTrct attribute.
	 * @param indexes the indexes
	 * @return wsTrct attribute
	 */
	public ElementaryRangeReference getItemFromWsTrctReference(Integer... indexes) {
		return wsTrct.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for wsTrct attribute.
	 * @param indexes the indexes
	 * @return wsTrct attribute
	 */
	public int getItemFromWsTrct(Integer... indexes) {
		return wsTrct.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for wsTrct attribute.
	 * @param wsTrct the new value of wsTrct for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsTrct(int wsTrct,Integer... indexes) {
		this.wsTrct.setIndexedValue(wsTrct,indexes);
	}
	
	/**
	 * Collection size getter for wsTrct attribute.
	 * @return  the collection size for attributewsTrct
	 */
	public int getWsTrctSize(){
		return wsTrct.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for wsTrct attribute.
	 * @param indexes the indexes
	 * @return wsTrct attribute
	 */
	public ElementaryRangeReference getWsTrctReference() {
		return wsTrct.getReference();
	}
	
	/**
	 * Indexed getter for wsTrct attribute.
	 * @param indexes the indexes
	 * @return wsTrct attribute
	 */
	public int getWsTrct() {
		return wsTrct.getValue();
	}
	
	/**
	 * Indexed setter for wsTrct attribute.
	 * @param wsTrct the new value of wsTrct for given indexes
	 * @param indexes the indexes
	 */
	public void setWsTrct(int wsTrct) {
		this.wsTrct.setValue(wsTrct);
	}
	
}
