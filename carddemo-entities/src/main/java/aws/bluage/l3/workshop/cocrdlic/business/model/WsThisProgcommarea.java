package aws.bluage.l3.workshop.cocrdlic.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity WsThisProgcommarea.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:57 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'wsCaLastCardkey' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.WsCaLastCardkey
 * <br></p>
 * 
 * <p>About 'wsCaFirstCardkey' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.WsCaFirstCardkey
 * <br></p>
 * 
 * <p>About 'wsCaScreenNum' field, <br>
 * </p>
 * 
 * <p>About 'caFirstPage' field, <br>
 * </p>
 * 
 * <p>About 'wsCaLastPageDisplayed' field, <br>
 * </p>
 * 
 * <p>About 'caLastPageShown' field, <br>
 * </p>
 * 
 * <p>About 'caLastPageNotShown' field, <br>
 * </p>
 * 
 * <p>About 'wsCaNextPageInd' field, <br>
 * </p>
 * 
 * <p>About 'caNextPageNotExists' field, <br>
 * </p>
 * 
 * <p>About 'caNextPageExists' field, <br>
 * </p>
 * 
 * <p>About 'wsReturnFlag' field, <br>
 * </p>
 * 
 * <p>About 'wsReturnFlagOff' field, <br>
 * </p>
 * 
 * <p>About 'wsReturnFlagOn' field, <br>
 * </p>
 * 
 * <p>About 'wsScreenData' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.WsScreenData
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsThisProgcommarea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group wsCaLastCardkey = new Group(root);
	private final Elementary wsCaLastCardNum = new Elementary(wsCaLastCardkey,new AlphanumericType(16));
	private final Elementary wsCaLastCardAcctId = new Elementary(wsCaLastCardkey,new ZonedType(11, 0, false));
	private final Group wsCaFirstCardkey = new Group(root);
	private final Elementary wsCaFirstCardNum = new Elementary(wsCaFirstCardkey,new AlphanumericType(16));
	private final Elementary wsCaFirstCardAcctId = new Elementary(wsCaFirstCardkey,new ZonedType(11, 0, false));
	private final Elementary wsCaScreenNum = new Elementary(root,new ZonedType(1, 0, false));
	private final ConditionName caFirstPage=new ConditionName(wsCaScreenNum,new BigDecimal("1"));
	private final Elementary wsCaLastPageDisplayed = new Elementary(root,new ZonedType(1, 0, false));
	private final ConditionName caLastPageShown=new ConditionName(wsCaLastPageDisplayed,new BigDecimal("0"));
	private final ConditionName caLastPageNotShown=new ConditionName(wsCaLastPageDisplayed,new BigDecimal("9"));
	private final Elementary wsCaNextPageInd = new Elementary(root,new AlphanumericType(1));
	private final ConditionName caNextPageNotExists=new ConditionName(wsCaNextPageInd,Record.LOW_VALUES);
	private final ConditionName caNextPageExists=new ConditionName(wsCaNextPageInd,"Y");
	private final Elementary wsReturnFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName wsReturnFlagOff=new ConditionName(wsReturnFlag,Record.LOW_VALUES);
	private final ConditionName wsReturnFlagOn=new ConditionName(wsReturnFlag,"1");
	
	/**
	 * ****************************************************************
	 * File Data Array         28 CHARS X 7 ROWS = 196
	 * ****************************************************************
	 */
	private final Group wsScreenData = new Group(root);
	private final Union union = new Union(wsScreenData);
	private final Elementary wsAllRows = new Elementary(union,new AlphanumericType(196));
	private final Group group = new Group(union);
	private final Group wsScreenRows = new Group(group,new FixedArray(7));
	private final Group wsEachRow = new Group(wsScreenRows);
	private final Group wsEachCard = new Group(wsEachRow);
	private final Elementary wsRowAcctno = new Elementary(wsEachCard,new AlphanumericType(11));
	private final Elementary wsRowCardNum = new Elementary(wsEachCard,new AlphanumericType(16));
	private final Elementary wsRowCardStatus = new Elementary(wsEachCard,new AlphanumericType(1));
	

	/**
	 * Instantiate a new WsThisProgcommarea with a default record.
	 * @param configuration the configuration
	 */
	public WsThisProgcommarea(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsThisProgcommarea bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsThisProgcommarea(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute wsCaLastCardkey.
	 * @return the wsCaLastCardkey attribute reference
	 */
	public RangeReference getWsCaLastCardkeyReference() {
		return wsCaLastCardkey.getReference();
	}	
				
	/**
	 * Setter for wsCaLastCardkey .
	 */
   	public void setWsCaLastCardkey(RangeReference reference) {
       	wsCaLastCardkey.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsCaLastCardNum.
	 * @return the wsCaLastCardNum attribute reference
	 */
	public ElementaryRangeReference getWsCaLastCardNumReference() {
		return wsCaLastCardNum.getReference();
	}

	/**
	 * Getter for wsCaLastCardNum attribute.
	 * @return wsCaLastCardNum attribute
	 */
	public String getWsCaLastCardNum() {
		return wsCaLastCardNum.getValue();
	}

	/**
	 * Setter for wsCaLastCardNum attribute.
	 * @param wsCaLastCardNum the new value of wsCaLastCardNum
	 */
	public void setWsCaLastCardNum(String wsCaLastCardNum) {
		this.wsCaLastCardNum.setValue(wsCaLastCardNum);
	}
	/**
	 * Gets the reference for attribute wsCaLastCardAcctId.
	 * @return the wsCaLastCardAcctId attribute reference
	 */
	public ElementaryRangeReference getWsCaLastCardAcctIdReference() {
		return wsCaLastCardAcctId.getReference();
	}

	/**
	 * Getter for wsCaLastCardAcctId attribute.
	 * @return wsCaLastCardAcctId attribute
	 */
	public long getWsCaLastCardAcctId() {
		return wsCaLastCardAcctId.getValue();
	}

	/**
	 * Setter for wsCaLastCardAcctId attribute.
	 * @param wsCaLastCardAcctId the new value of wsCaLastCardAcctId
	 */
	public void setWsCaLastCardAcctId(long wsCaLastCardAcctId) {
		this.wsCaLastCardAcctId.setValue(wsCaLastCardAcctId);
	}
	
	/**
	 * Gets the reference for attribute wsCaFirstCardkey.
	 * @return the wsCaFirstCardkey attribute reference
	 */
	public RangeReference getWsCaFirstCardkeyReference() {
		return wsCaFirstCardkey.getReference();
	}	
				
	/**
	 * Setter for wsCaFirstCardkey .
	 */
   	public void setWsCaFirstCardkey(RangeReference reference) {
       	wsCaFirstCardkey.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsCaFirstCardNum.
	 * @return the wsCaFirstCardNum attribute reference
	 */
	public ElementaryRangeReference getWsCaFirstCardNumReference() {
		return wsCaFirstCardNum.getReference();
	}

	/**
	 * Getter for wsCaFirstCardNum attribute.
	 * @return wsCaFirstCardNum attribute
	 */
	public String getWsCaFirstCardNum() {
		return wsCaFirstCardNum.getValue();
	}

	/**
	 * Setter for wsCaFirstCardNum attribute.
	 * @param wsCaFirstCardNum the new value of wsCaFirstCardNum
	 */
	public void setWsCaFirstCardNum(String wsCaFirstCardNum) {
		this.wsCaFirstCardNum.setValue(wsCaFirstCardNum);
	}
	/**
	 * Gets the reference for attribute wsCaFirstCardAcctId.
	 * @return the wsCaFirstCardAcctId attribute reference
	 */
	public ElementaryRangeReference getWsCaFirstCardAcctIdReference() {
		return wsCaFirstCardAcctId.getReference();
	}

	/**
	 * Getter for wsCaFirstCardAcctId attribute.
	 * @return wsCaFirstCardAcctId attribute
	 */
	public long getWsCaFirstCardAcctId() {
		return wsCaFirstCardAcctId.getValue();
	}

	/**
	 * Setter for wsCaFirstCardAcctId attribute.
	 * @param wsCaFirstCardAcctId the new value of wsCaFirstCardAcctId
	 */
	public void setWsCaFirstCardAcctId(long wsCaFirstCardAcctId) {
		this.wsCaFirstCardAcctId.setValue(wsCaFirstCardAcctId);
	}
	/**
	 * Gets the reference for attribute wsCaScreenNum.
	 * @return the wsCaScreenNum attribute reference
	 */
	public ElementaryRangeReference getWsCaScreenNumReference() {
		return wsCaScreenNum.getReference();
	}

	/**
	 * Getter for wsCaScreenNum attribute.
	 * @return wsCaScreenNum attribute
	 */
	public int getWsCaScreenNum() {
		return wsCaScreenNum.getValue();
	}

	/**
	 * Setter for wsCaScreenNum attribute.
	 * @param wsCaScreenNum the new value of wsCaScreenNum
	 */
	public void setWsCaScreenNum(int wsCaScreenNum) {
		this.wsCaScreenNum.setValue(wsCaScreenNum);
	}
	/**
	 * Gets the reference for attribute caFirstPage.
	 * @return the caFirstPage attribute reference
	 */
	public ConditionReference getCaFirstPageReference() {
		return wsCaScreenNum.getCondition(caFirstPage);	
	}

	/**
	 * Getter for caFirstPage attribute.
	 * @return caFirstPage attribute
	 */
	public boolean isCaFirstPage() {
		return getCaFirstPageReference().getValue();	
	}

	/**
	 * Setter for caFirstPage attribute.
	 * @param caFirstPage the new value of caFirstPage
	 */
	public void setCaFirstPage(boolean caFirstPage) {
		getCaFirstPageReference().setValue(caFirstPage);	
	}
	/**
	 * Gets the reference for attribute wsCaLastPageDisplayed.
	 * @return the wsCaLastPageDisplayed attribute reference
	 */
	public ElementaryRangeReference getWsCaLastPageDisplayedReference() {
		return wsCaLastPageDisplayed.getReference();
	}

	/**
	 * Getter for wsCaLastPageDisplayed attribute.
	 * @return wsCaLastPageDisplayed attribute
	 */
	public int getWsCaLastPageDisplayed() {
		return wsCaLastPageDisplayed.getValue();
	}

	/**
	 * Setter for wsCaLastPageDisplayed attribute.
	 * @param wsCaLastPageDisplayed the new value of wsCaLastPageDisplayed
	 */
	public void setWsCaLastPageDisplayed(int wsCaLastPageDisplayed) {
		this.wsCaLastPageDisplayed.setValue(wsCaLastPageDisplayed);
	}
	/**
	 * Gets the reference for attribute caLastPageShown.
	 * @return the caLastPageShown attribute reference
	 */
	public ConditionReference getCaLastPageShownReference() {
		return wsCaLastPageDisplayed.getCondition(caLastPageShown);	
	}

	/**
	 * Getter for caLastPageShown attribute.
	 * @return caLastPageShown attribute
	 */
	public boolean isCaLastPageShown() {
		return getCaLastPageShownReference().getValue();	
	}

	/**
	 * Setter for caLastPageShown attribute.
	 * @param caLastPageShown the new value of caLastPageShown
	 */
	public void setCaLastPageShown(boolean caLastPageShown) {
		getCaLastPageShownReference().setValue(caLastPageShown);	
	}
	/**
	 * Gets the reference for attribute caLastPageNotShown.
	 * @return the caLastPageNotShown attribute reference
	 */
	public ConditionReference getCaLastPageNotShownReference() {
		return wsCaLastPageDisplayed.getCondition(caLastPageNotShown);	
	}

	/**
	 * Getter for caLastPageNotShown attribute.
	 * @return caLastPageNotShown attribute
	 */
	public boolean isCaLastPageNotShown() {
		return getCaLastPageNotShownReference().getValue();	
	}

	/**
	 * Setter for caLastPageNotShown attribute.
	 * @param caLastPageNotShown the new value of caLastPageNotShown
	 */
	public void setCaLastPageNotShown(boolean caLastPageNotShown) {
		getCaLastPageNotShownReference().setValue(caLastPageNotShown);	
	}
	/**
	 * Gets the reference for attribute wsCaNextPageInd.
	 * @return the wsCaNextPageInd attribute reference
	 */
	public ElementaryRangeReference getWsCaNextPageIndReference() {
		return wsCaNextPageInd.getReference();
	}

	/**
	 * Getter for wsCaNextPageInd attribute.
	 * @return wsCaNextPageInd attribute
	 */
	public String getWsCaNextPageInd() {
		return wsCaNextPageInd.getValue();
	}

	/**
	 * Setter for wsCaNextPageInd attribute.
	 * @param wsCaNextPageInd the new value of wsCaNextPageInd
	 */
	public void setWsCaNextPageInd(String wsCaNextPageInd) {
		this.wsCaNextPageInd.setValue(wsCaNextPageInd);
	}
	/**
	 * Gets the reference for attribute caNextPageNotExists.
	 * @return the caNextPageNotExists attribute reference
	 */
	public ConditionReference getCaNextPageNotExistsReference() {
		return wsCaNextPageInd.getCondition(caNextPageNotExists);	
	}

	/**
	 * Getter for caNextPageNotExists attribute.
	 * @return caNextPageNotExists attribute
	 */
	public boolean isCaNextPageNotExists() {
		return getCaNextPageNotExistsReference().getValue();	
	}

	/**
	 * Setter for caNextPageNotExists attribute.
	 * @param caNextPageNotExists the new value of caNextPageNotExists
	 */
	public void setCaNextPageNotExists(boolean caNextPageNotExists) {
		getCaNextPageNotExistsReference().setValue(caNextPageNotExists);	
	}
	/**
	 * Gets the reference for attribute caNextPageExists.
	 * @return the caNextPageExists attribute reference
	 */
	public ConditionReference getCaNextPageExistsReference() {
		return wsCaNextPageInd.getCondition(caNextPageExists);	
	}

	/**
	 * Getter for caNextPageExists attribute.
	 * @return caNextPageExists attribute
	 */
	public boolean isCaNextPageExists() {
		return getCaNextPageExistsReference().getValue();	
	}

	/**
	 * Setter for caNextPageExists attribute.
	 * @param caNextPageExists the new value of caNextPageExists
	 */
	public void setCaNextPageExists(boolean caNextPageExists) {
		getCaNextPageExistsReference().setValue(caNextPageExists);	
	}
	/**
	 * Gets the reference for attribute wsReturnFlag.
	 * @return the wsReturnFlag attribute reference
	 */
	public ElementaryRangeReference getWsReturnFlagReference() {
		return wsReturnFlag.getReference();
	}

	/**
	 * Getter for wsReturnFlag attribute.
	 * @return wsReturnFlag attribute
	 */
	public String getWsReturnFlag() {
		return wsReturnFlag.getValue();
	}

	/**
	 * Setter for wsReturnFlag attribute.
	 * @param wsReturnFlag the new value of wsReturnFlag
	 */
	public void setWsReturnFlag(String wsReturnFlag) {
		this.wsReturnFlag.setValue(wsReturnFlag);
	}
	/**
	 * Gets the reference for attribute wsReturnFlagOff.
	 * @return the wsReturnFlagOff attribute reference
	 */
	public ConditionReference getWsReturnFlagOffReference() {
		return wsReturnFlag.getCondition(wsReturnFlagOff);	
	}

	/**
	 * Getter for wsReturnFlagOff attribute.
	 * @return wsReturnFlagOff attribute
	 */
	public boolean isWsReturnFlagOff() {
		return getWsReturnFlagOffReference().getValue();	
	}

	/**
	 * Setter for wsReturnFlagOff attribute.
	 * @param wsReturnFlagOff the new value of wsReturnFlagOff
	 */
	public void setWsReturnFlagOff(boolean wsReturnFlagOff) {
		getWsReturnFlagOffReference().setValue(wsReturnFlagOff);	
	}
	/**
	 * Gets the reference for attribute wsReturnFlagOn.
	 * @return the wsReturnFlagOn attribute reference
	 */
	public ConditionReference getWsReturnFlagOnReference() {
		return wsReturnFlag.getCondition(wsReturnFlagOn);	
	}

	/**
	 * Getter for wsReturnFlagOn attribute.
	 * @return wsReturnFlagOn attribute
	 */
	public boolean isWsReturnFlagOn() {
		return getWsReturnFlagOnReference().getValue();	
	}

	/**
	 * Setter for wsReturnFlagOn attribute.
	 * @param wsReturnFlagOn the new value of wsReturnFlagOn
	 */
	public void setWsReturnFlagOn(boolean wsReturnFlagOn) {
		getWsReturnFlagOnReference().setValue(wsReturnFlagOn);	
	}
	
	/**
	 * Gets the reference for attribute wsScreenData.
	 * @return the wsScreenData attribute reference
	 */
	public RangeReference getWsScreenDataReference() {
		return wsScreenData.getReference();
	}	
				
	/**
	 * Setter for wsScreenData .
	 */
   	public void setWsScreenData(RangeReference reference) {
       	wsScreenData.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsAllRows.
	 * @return the wsAllRows attribute reference
	 */
	public ElementaryRangeReference getWsAllRowsReference() {
		return wsAllRows.getReference();
	}

	/**
	 * Getter for wsAllRows attribute.
	 * @return wsAllRows attribute
	 */
	public String getWsAllRows() {
		return wsAllRows.getValue();
	}

	/**
	 * Setter for wsAllRows attribute.
	 * @param wsAllRows the new value of wsAllRows
	 */
	public void setWsAllRows(String wsAllRows) {
		this.wsAllRows.setValue(wsAllRows);
	}
	/**
	 * Indexed getter for group wsScreenRows attribute.
	 * @param indexes the indexes
	 * @return wsScreenRows attribute
	 */
	public RangeReference getItemFromWsScreenRowsReference(Integer... indexes){
		return wsScreenRows.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group wsScreenRows attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromWsScreenRows( RangeReference rangeReference, Integer... indexes){
		wsScreenRows.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group wsScreenRows attribute.
	 * @return  the collection size for attributewsScreenRows
	 */
	public int getWsScreenRowsSize(){
		return wsScreenRows.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for group wsEachRow attribute.
	 * @param indexes the indexes
	 * @return wsEachRow attribute
	 */
	public RangeReference getItemFromWsEachRowReference(Integer... indexes){
		return wsEachRow.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group wsEachRow attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromWsEachRow( RangeReference rangeReference, Integer... indexes){
		wsEachRow.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group wsEachRow attribute.
	 * @return  the collection size for attributewsEachRow
	 */
	public int getWsEachRowSize(){
		return wsEachRow.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for group wsEachCard attribute.
	 * @param indexes the indexes
	 * @return wsEachCard attribute
	 */
	public RangeReference getItemFromWsEachCardReference(Integer... indexes){
		return wsEachCard.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group wsEachCard attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromWsEachCard( RangeReference rangeReference, Integer... indexes){
		wsEachCard.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group wsEachCard attribute.
	 * @return  the collection size for attributewsEachCard
	 */
	public int getWsEachCardSize(){
		return wsEachCard.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for wsRowAcctno attribute.
	 * @param indexes the indexes
	 * @return wsRowAcctno attribute
	 */
	public ElementaryRangeReference getItemFromWsRowAcctnoReference(Integer... indexes) {
		return wsRowAcctno.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for wsRowAcctno attribute.
	 * @param indexes the indexes
	 * @return wsRowAcctno attribute
	 */
	public String getItemFromWsRowAcctno(Integer... indexes) {
		return wsRowAcctno.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for wsRowAcctno attribute.
	 * @param wsRowAcctno the new value of wsRowAcctno for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsRowAcctno(String wsRowAcctno,Integer... indexes) {
		this.wsRowAcctno.setIndexedValue(wsRowAcctno,indexes);
	}
	
	/**
	 * Collection size getter for wsRowAcctno attribute.
	 * @return  the collection size for attributewsRowAcctno
	 */
	public int getWsRowAcctnoSize(){
		return wsRowAcctno.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for wsRowAcctno attribute.
	 * @param indexes the indexes
	 * @return wsRowAcctno attribute
	 */
	public ElementaryRangeReference getWsRowAcctnoReference() {
		return wsRowAcctno.getReference();
	}
	
	/**
	 * Indexed getter for wsRowAcctno attribute.
	 * @param indexes the indexes
	 * @return wsRowAcctno attribute
	 */
	public String getWsRowAcctno() {
		return wsRowAcctno.getValue();
	}
	
	/**
	 * Indexed setter for wsRowAcctno attribute.
	 * @param wsRowAcctno the new value of wsRowAcctno for given indexes
	 * @param indexes the indexes
	 */
	public void setWsRowAcctno(String wsRowAcctno) {
		this.wsRowAcctno.setValue(wsRowAcctno);
	}
	
	/**
	 * Indexed getter for wsRowCardNum attribute.
	 * @param indexes the indexes
	 * @return wsRowCardNum attribute
	 */
	public ElementaryRangeReference getItemFromWsRowCardNumReference(Integer... indexes) {
		return wsRowCardNum.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for wsRowCardNum attribute.
	 * @param indexes the indexes
	 * @return wsRowCardNum attribute
	 */
	public String getItemFromWsRowCardNum(Integer... indexes) {
		return wsRowCardNum.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for wsRowCardNum attribute.
	 * @param wsRowCardNum the new value of wsRowCardNum for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsRowCardNum(String wsRowCardNum,Integer... indexes) {
		this.wsRowCardNum.setIndexedValue(wsRowCardNum,indexes);
	}
	
	/**
	 * Collection size getter for wsRowCardNum attribute.
	 * @return  the collection size for attributewsRowCardNum
	 */
	public int getWsRowCardNumSize(){
		return wsRowCardNum.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for wsRowCardNum attribute.
	 * @param indexes the indexes
	 * @return wsRowCardNum attribute
	 */
	public ElementaryRangeReference getWsRowCardNumReference() {
		return wsRowCardNum.getReference();
	}
	
	/**
	 * Indexed getter for wsRowCardNum attribute.
	 * @param indexes the indexes
	 * @return wsRowCardNum attribute
	 */
	public String getWsRowCardNum() {
		return wsRowCardNum.getValue();
	}
	
	/**
	 * Indexed setter for wsRowCardNum attribute.
	 * @param wsRowCardNum the new value of wsRowCardNum for given indexes
	 * @param indexes the indexes
	 */
	public void setWsRowCardNum(String wsRowCardNum) {
		this.wsRowCardNum.setValue(wsRowCardNum);
	}
	
	/**
	 * Indexed getter for wsRowCardStatus attribute.
	 * @param indexes the indexes
	 * @return wsRowCardStatus attribute
	 */
	public ElementaryRangeReference getItemFromWsRowCardStatusReference(Integer... indexes) {
		return wsRowCardStatus.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for wsRowCardStatus attribute.
	 * @param indexes the indexes
	 * @return wsRowCardStatus attribute
	 */
	public String getItemFromWsRowCardStatus(Integer... indexes) {
		return wsRowCardStatus.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for wsRowCardStatus attribute.
	 * @param wsRowCardStatus the new value of wsRowCardStatus for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsRowCardStatus(String wsRowCardStatus,Integer... indexes) {
		this.wsRowCardStatus.setIndexedValue(wsRowCardStatus,indexes);
	}
	
	/**
	 * Collection size getter for wsRowCardStatus attribute.
	 * @return  the collection size for attributewsRowCardStatus
	 */
	public int getWsRowCardStatusSize(){
		return wsRowCardStatus.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for wsRowCardStatus attribute.
	 * @param indexes the indexes
	 * @return wsRowCardStatus attribute
	 */
	public ElementaryRangeReference getWsRowCardStatusReference() {
		return wsRowCardStatus.getReference();
	}
	
	/**
	 * Indexed getter for wsRowCardStatus attribute.
	 * @param indexes the indexes
	 * @return wsRowCardStatus attribute
	 */
	public String getWsRowCardStatus() {
		return wsRowCardStatus.getValue();
	}
	
	/**
	 * Indexed setter for wsRowCardStatus attribute.
	 * @param wsRowCardStatus the new value of wsRowCardStatus for given indexes
	 * @param indexes the indexes
	 */
	public void setWsRowCardStatus(String wsRowCardStatus) {
		this.wsRowCardStatus.setValue(wsRowCardStatus);
	}
	
}
