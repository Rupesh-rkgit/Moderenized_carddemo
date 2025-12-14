package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity WsTrnxTable.
 * 
 * <p>About 'wsCardTbl' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.wsCardTbl
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsTrnxTable extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group wsCardTbl = new Group(root,new FixedArray(51));
	private final Elementary wsCardNum = new Elementary(wsCardTbl,new AlphanumericType(16));
	private final Group wsTranTbl = new Group(wsCardTbl,new FixedArray(10));
	private final Elementary wsTranNum = new Elementary(wsTranTbl,new AlphanumericType(16));
	private final Elementary wsTranRest = new Elementary(wsTranTbl,new AlphanumericType(318));
	

	/**
	 * Instantiate a new WsTrnxTable with a default record.
	 * @param configuration the configuration
	 */
	public WsTrnxTable(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsTrnxTable bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsTrnxTable(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Indexed getter for group wsCardTbl attribute.
	 * @param indexes the indexes
	 * @return wsCardTbl attribute
	 */
	public RangeReference getItemFromWsCardTblReference(Integer... indexes){
		return wsCardTbl.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group wsCardTbl attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromWsCardTbl( RangeReference rangeReference, Integer... indexes){
		wsCardTbl.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group wsCardTbl attribute.
	 * @return  the collection size for attributewsCardTbl
	 */
	public int getWsCardTblSize(){
		return wsCardTbl.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for wsCardNum attribute.
	 * @param indexes the indexes
	 * @return wsCardNum attribute
	 */
	public ElementaryRangeReference getItemFromWsCardNumReference(Integer... indexes) {
		return wsCardNum.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for wsCardNum attribute.
	 * @param indexes the indexes
	 * @return wsCardNum attribute
	 */
	public String getItemFromWsCardNum(Integer... indexes) {
		return wsCardNum.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for wsCardNum attribute.
	 * @param wsCardNum the new value of wsCardNum for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsCardNum(String wsCardNum,Integer... indexes) {
		this.wsCardNum.setIndexedValue(wsCardNum,indexes);
	}
	
	/**
	 * Collection size getter for wsCardNum attribute.
	 * @return  the collection size for attributewsCardNum
	 */
	public int getWsCardNumSize(){
		return wsCardNum.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for wsCardNum attribute.
	 * @param indexes the indexes
	 * @return wsCardNum attribute
	 */
	public ElementaryRangeReference getWsCardNumReference() {
		return wsCardNum.getReference();
	}
	
	/**
	 * Indexed getter for wsCardNum attribute.
	 * @param indexes the indexes
	 * @return wsCardNum attribute
	 */
	public String getWsCardNum() {
		return wsCardNum.getValue();
	}
	
	/**
	 * Indexed setter for wsCardNum attribute.
	 * @param wsCardNum the new value of wsCardNum for given indexes
	 * @param indexes the indexes
	 */
	public void setWsCardNum(String wsCardNum) {
		this.wsCardNum.setValue(wsCardNum);
	}
	
	/**
	 * Indexed getter for group wsTranTbl attribute.
	 * @param indexes the indexes
	 * @return wsTranTbl attribute
	 */
	public RangeReference getItemFromWsTranTblReference(Integer... indexes){
		return wsTranTbl.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group wsTranTbl attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromWsTranTbl( RangeReference rangeReference, Integer... indexes){
		wsTranTbl.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group wsTranTbl attribute.
	 * @return  the collection size for attributewsTranTbl
	 */
	public int getWsTranTblSize(){
		return wsTranTbl.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for wsTranNum attribute.
	 * @param indexes the indexes
	 * @return wsTranNum attribute
	 */
	public ElementaryRangeReference getItemFromWsTranNumReference(Integer... indexes) {
		return wsTranNum.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for wsTranNum attribute.
	 * @param indexes the indexes
	 * @return wsTranNum attribute
	 */
	public String getItemFromWsTranNum(Integer... indexes) {
		return wsTranNum.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for wsTranNum attribute.
	 * @param wsTranNum the new value of wsTranNum for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsTranNum(String wsTranNum,Integer... indexes) {
		this.wsTranNum.setIndexedValue(wsTranNum,indexes);
	}
	
	/**
	 * Collection size getter for wsTranNum attribute.
	 * @return  the collection size for attributewsTranNum
	 */
	public int getWsTranNumSize(){
		return wsTranNum.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for wsTranNum attribute.
	 * @param indexes the indexes
	 * @return wsTranNum attribute
	 */
	public ElementaryRangeReference getWsTranNumReference() {
		return wsTranNum.getReference();
	}
	
	/**
	 * Indexed getter for wsTranNum attribute.
	 * @param indexes the indexes
	 * @return wsTranNum attribute
	 */
	public String getWsTranNum() {
		return wsTranNum.getValue();
	}
	
	/**
	 * Indexed setter for wsTranNum attribute.
	 * @param wsTranNum the new value of wsTranNum for given indexes
	 * @param indexes the indexes
	 */
	public void setWsTranNum(String wsTranNum) {
		this.wsTranNum.setValue(wsTranNum);
	}
	
	/**
	 * Indexed getter for wsTranRest attribute.
	 * @param indexes the indexes
	 * @return wsTranRest attribute
	 */
	public ElementaryRangeReference getItemFromWsTranRestReference(Integer... indexes) {
		return wsTranRest.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for wsTranRest attribute.
	 * @param indexes the indexes
	 * @return wsTranRest attribute
	 */
	public String getItemFromWsTranRest(Integer... indexes) {
		return wsTranRest.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for wsTranRest attribute.
	 * @param wsTranRest the new value of wsTranRest for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsTranRest(String wsTranRest,Integer... indexes) {
		this.wsTranRest.setIndexedValue(wsTranRest,indexes);
	}
	
	/**
	 * Collection size getter for wsTranRest attribute.
	 * @return  the collection size for attributewsTranRest
	 */
	public int getWsTranRestSize(){
		return wsTranRest.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for wsTranRest attribute.
	 * @param indexes the indexes
	 * @return wsTranRest attribute
	 */
	public ElementaryRangeReference getWsTranRestReference() {
		return wsTranRest.getReference();
	}
	
	/**
	 * Indexed getter for wsTranRest attribute.
	 * @param indexes the indexes
	 * @return wsTranRest attribute
	 */
	public String getWsTranRest() {
		return wsTranRest.getValue();
	}
	
	/**
	 * Indexed setter for wsTranRest attribute.
	 * @param wsTranRest the new value of wsTranRest for given indexes
	 * @param indexes the indexes
	 */
	public void setWsTranRest(String wsTranRest) {
		this.wsTranRest.setValue(wsTranRest);
	}
	
}
