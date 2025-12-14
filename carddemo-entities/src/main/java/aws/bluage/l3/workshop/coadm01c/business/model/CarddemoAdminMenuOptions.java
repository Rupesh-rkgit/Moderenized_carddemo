package aws.bluage.l3.workshop.coadm01c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity CarddemoAdminMenuOptions.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:57 CDT<br>
 *  <br>
 *  ****************************************************************<br>
 *   CardDemo - Admin Menu Options<br>
 *  ****************************************************************<br>
 *   Copyright Amazon.com, Inc. or its affiliates.<br>
 *   All Rights Reserved.<br>
 *  <br>
 *   Licensed under the Apache License, Version 2.0 (the "License").<br>
 *   You may not use this file except in compliance with the License.<br>
 *   You may obtain a copy of the License at<br>
 *  <br>
 *      http://www.apache.org/licenses/LICENSE-2.0<br>
 *  <br>
 *   Unless required by applicable law or agreed to in writing,<br>
 *   software distributed under the License is distributed on an<br>
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,<br>
 *   either express or implied. See the License for the specific<br>
 *   language governing permissions and limitations under the License<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'cdemoAdminOptCount' field, <br>
 * </p>
 * 
 * <p>About 'cdemoAdminOptionsData' field, <br>uml entity: aws.bluage.l3.workshop.coadm01c.business.model.CdemoAdminOptionsData
 * <br></p>
 * 
 * <p>About 'cdemoAdminOptions' field, <br>uml entity: aws.bluage.l3.workshop.coadm01c.business.model.CdemoAdminOptions
 * <br></p>
 * 
 * @see RecordEntity
 */
public class CarddemoAdminMenuOptions extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cdemoAdminOptCount = new Elementary(root,new ZonedType(2, 0, false),Short.valueOf("4"));
	private final Union union = new Union(root);
	private final Group cdemoAdminOptionsData = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cdemoAdminOptionsData,new ZonedType(2, 0, false),Short.valueOf("1"));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cdemoAdminOptionsData,new AlphanumericType(35),"User List (Security)               ");
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cdemoAdminOptionsData,new AlphanumericType(8),"COUSR00C");
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cdemoAdminOptionsData,new ZonedType(2, 0, false),Short.valueOf("2"));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cdemoAdminOptionsData,new AlphanumericType(35),"User Add (Security)                ");
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cdemoAdminOptionsData,new AlphanumericType(8),"COUSR01C");
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cdemoAdminOptionsData,new ZonedType(2, 0, false),Short.valueOf("3"));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cdemoAdminOptionsData,new AlphanumericType(35),"User Update (Security)             ");
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cdemoAdminOptionsData,new AlphanumericType(8),"COUSR02C");
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cdemoAdminOptionsData,new ZonedType(2, 0, false),Short.valueOf("4"));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cdemoAdminOptionsData,new AlphanumericType(35),"User Delete (Security)             ");
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cdemoAdminOptionsData,new AlphanumericType(8),"COUSR03C");
	private final Group cdemoAdminOptions = new Group(union);
	private final Group cdemoAdminOpt = new Group(cdemoAdminOptions,new FixedArray(9));
	private final Elementary cdemoAdminOptNum = new Elementary(cdemoAdminOpt,new ZonedType(2, 0, false));
	private final Elementary cdemoAdminOptName = new Elementary(cdemoAdminOpt,new AlphanumericType(35));
	private final Elementary cdemoAdminOptPgmname = new Elementary(cdemoAdminOpt,new AlphanumericType(8));
	

	/**
	 * Instantiate a new CarddemoAdminMenuOptions with a default record.
	 * @param configuration the configuration
	 */
	public CarddemoAdminMenuOptions(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CarddemoAdminMenuOptions bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CarddemoAdminMenuOptions(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute cdemoAdminOptCount.
	 * @return the cdemoAdminOptCount attribute reference
	 */
	public ElementaryRangeReference getCdemoAdminOptCountReference() {
		return cdemoAdminOptCount.getReference();
	}

	/**
	 * Getter for cdemoAdminOptCount attribute.
	 * @return cdemoAdminOptCount attribute
	 */
	public int getCdemoAdminOptCount() {
		return cdemoAdminOptCount.getValue();
	}

	/**
	 * Setter for cdemoAdminOptCount attribute.
	 * @param cdemoAdminOptCount the new value of cdemoAdminOptCount
	 */
	public void setCdemoAdminOptCount(int cdemoAdminOptCount) {
		this.cdemoAdminOptCount.setValue(cdemoAdminOptCount);
	}
	
	/**
	 * Gets the reference for attribute cdemoAdminOptionsData.
	 * @return the cdemoAdminOptionsData attribute reference
	 */
	public RangeReference getCdemoAdminOptionsDataReference() {
		return cdemoAdminOptionsData.getReference();
	}	
				
	/**
	 * Setter for cdemoAdminOptionsData .
	 */
   	public void setCdemoAdminOptionsData(RangeReference reference) {
       	cdemoAdminOptionsData.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute cdemoAdminOptions.
	 * @return the cdemoAdminOptions attribute reference
	 */
	public RangeReference getCdemoAdminOptionsReference() {
		return cdemoAdminOptions.getReference();
	}	
				
	/**
	 * Setter for cdemoAdminOptions .
	 */
   	public void setCdemoAdminOptions(RangeReference reference) {
       	cdemoAdminOptions.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Indexed getter for group cdemoAdminOpt attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOpt attribute
	 */
	public RangeReference getItemFromCdemoAdminOptReference(Integer... indexes){
		return cdemoAdminOpt.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group cdemoAdminOpt attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromCdemoAdminOpt( RangeReference rangeReference, Integer... indexes){
		cdemoAdminOpt.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group cdemoAdminOpt attribute.
	 * @return  the collection size for attributecdemoAdminOpt
	 */
	public int getCdemoAdminOptSize(){
		return cdemoAdminOpt.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for cdemoAdminOptNum attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptNum attribute
	 */
	public ElementaryRangeReference getItemFromCdemoAdminOptNumReference(Integer... indexes) {
		return cdemoAdminOptNum.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for cdemoAdminOptNum attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptNum attribute
	 */
	public int getItemFromCdemoAdminOptNum(Integer... indexes) {
		return cdemoAdminOptNum.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for cdemoAdminOptNum attribute.
	 * @param cdemoAdminOptNum the new value of cdemoAdminOptNum for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromCdemoAdminOptNum(int cdemoAdminOptNum,Integer... indexes) {
		this.cdemoAdminOptNum.setIndexedValue(cdemoAdminOptNum,indexes);
	}
	
	/**
	 * Collection size getter for cdemoAdminOptNum attribute.
	 * @return  the collection size for attributecdemoAdminOptNum
	 */
	public int getCdemoAdminOptNumSize(){
		return cdemoAdminOptNum.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for cdemoAdminOptNum attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptNum attribute
	 */
	public ElementaryRangeReference getCdemoAdminOptNumReference() {
		return cdemoAdminOptNum.getReference();
	}
	
	/**
	 * Indexed getter for cdemoAdminOptNum attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptNum attribute
	 */
	public int getCdemoAdminOptNum() {
		return cdemoAdminOptNum.getValue();
	}
	
	/**
	 * Indexed setter for cdemoAdminOptNum attribute.
	 * @param cdemoAdminOptNum the new value of cdemoAdminOptNum for given indexes
	 * @param indexes the indexes
	 */
	public void setCdemoAdminOptNum(int cdemoAdminOptNum) {
		this.cdemoAdminOptNum.setValue(cdemoAdminOptNum);
	}
	
	/**
	 * Indexed getter for cdemoAdminOptName attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptName attribute
	 */
	public ElementaryRangeReference getItemFromCdemoAdminOptNameReference(Integer... indexes) {
		return cdemoAdminOptName.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for cdemoAdminOptName attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptName attribute
	 */
	public String getItemFromCdemoAdminOptName(Integer... indexes) {
		return cdemoAdminOptName.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for cdemoAdminOptName attribute.
	 * @param cdemoAdminOptName the new value of cdemoAdminOptName for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromCdemoAdminOptName(String cdemoAdminOptName,Integer... indexes) {
		this.cdemoAdminOptName.setIndexedValue(cdemoAdminOptName,indexes);
	}
	
	/**
	 * Collection size getter for cdemoAdminOptName attribute.
	 * @return  the collection size for attributecdemoAdminOptName
	 */
	public int getCdemoAdminOptNameSize(){
		return cdemoAdminOptName.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for cdemoAdminOptName attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptName attribute
	 */
	public ElementaryRangeReference getCdemoAdminOptNameReference() {
		return cdemoAdminOptName.getReference();
	}
	
	/**
	 * Indexed getter for cdemoAdminOptName attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptName attribute
	 */
	public String getCdemoAdminOptName() {
		return cdemoAdminOptName.getValue();
	}
	
	/**
	 * Indexed setter for cdemoAdminOptName attribute.
	 * @param cdemoAdminOptName the new value of cdemoAdminOptName for given indexes
	 * @param indexes the indexes
	 */
	public void setCdemoAdminOptName(String cdemoAdminOptName) {
		this.cdemoAdminOptName.setValue(cdemoAdminOptName);
	}
	
	/**
	 * Indexed getter for cdemoAdminOptPgmname attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptPgmname attribute
	 */
	public ElementaryRangeReference getItemFromCdemoAdminOptPgmnameReference(Integer... indexes) {
		return cdemoAdminOptPgmname.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for cdemoAdminOptPgmname attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptPgmname attribute
	 */
	public String getItemFromCdemoAdminOptPgmname(Integer... indexes) {
		return cdemoAdminOptPgmname.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for cdemoAdminOptPgmname attribute.
	 * @param cdemoAdminOptPgmname the new value of cdemoAdminOptPgmname for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromCdemoAdminOptPgmname(String cdemoAdminOptPgmname,Integer... indexes) {
		this.cdemoAdminOptPgmname.setIndexedValue(cdemoAdminOptPgmname,indexes);
	}
	
	/**
	 * Collection size getter for cdemoAdminOptPgmname attribute.
	 * @return  the collection size for attributecdemoAdminOptPgmname
	 */
	public int getCdemoAdminOptPgmnameSize(){
		return cdemoAdminOptPgmname.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for cdemoAdminOptPgmname attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptPgmname attribute
	 */
	public ElementaryRangeReference getCdemoAdminOptPgmnameReference() {
		return cdemoAdminOptPgmname.getReference();
	}
	
	/**
	 * Indexed getter for cdemoAdminOptPgmname attribute.
	 * @param indexes the indexes
	 * @return cdemoAdminOptPgmname attribute
	 */
	public String getCdemoAdminOptPgmname() {
		return cdemoAdminOptPgmname.getValue();
	}
	
	/**
	 * Indexed setter for cdemoAdminOptPgmname attribute.
	 * @param cdemoAdminOptPgmname the new value of cdemoAdminOptPgmname for given indexes
	 * @param indexes the indexes
	 */
	public void setCdemoAdminOptPgmname(String cdemoAdminOptPgmname) {
		this.cdemoAdminOptPgmname.setValue(cdemoAdminOptPgmname);
	}
	
}
