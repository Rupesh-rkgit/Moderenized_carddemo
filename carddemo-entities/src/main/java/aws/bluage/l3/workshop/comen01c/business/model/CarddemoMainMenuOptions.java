package aws.bluage.l3.workshop.comen01c.business.model;

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
 * Data simplifier entity CarddemoMainMenuOptions.
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
 * <p>About 'cdemoMenuOptCount' field, <br>
 * </p>
 * 
 * <p>About 'cdemoMenuOptionsData' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.CdemoMenuOptionsData
 * <br></p>
 * 
 * <p>About 'cdemoMenuOptions' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.CdemoMenuOptions
 * <br></p>
 * 
 * @see RecordEntity
 */
public class CarddemoMainMenuOptions extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cdemoMenuOptCount = new Elementary(root,new ZonedType(2, 0, false),Short.valueOf("10"));
	private final Union union = new Union(root);
	private final Group cdemoMenuOptionsData = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("1"));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Account View                       ");
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"COACTVWC");
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("2"));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Account Update                     ");
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"COACTUPC");
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("3"));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Credit Card List                   ");
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"COCRDLIC");
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("4"));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Credit Card View                   ");
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"COCRDSLC");
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("5"));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Credit Card Update                 ");
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"COCRDUPC");
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("6"));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Transaction List                   ");
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"COTRN00C");
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("7"));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Transaction View                   ");
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"COTRN01C");
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("8"));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Transaction Add                    ");
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"COTRN02C");
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("9"));
	@SuppressWarnings("unused")
	private final Filler filler33 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Transaction Reports                ");
	@SuppressWarnings("unused")
	private final Filler filler34 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"CORPT00C");
	@SuppressWarnings("unused")
	private final Filler filler35 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	@SuppressWarnings("unused")
	private final Filler filler36 = new Filler(cdemoMenuOptionsData,new ZonedType(2, 0, false),Short.valueOf("10"));
	@SuppressWarnings("unused")
	private final Filler filler37 = new Filler(cdemoMenuOptionsData,new AlphanumericType(35),"Bill Payment                       ");
	@SuppressWarnings("unused")
	private final Filler filler38 = new Filler(cdemoMenuOptionsData,new AlphanumericType(8),"COBIL00C");
	@SuppressWarnings("unused")
	private final Filler filler39 = new Filler(cdemoMenuOptionsData,new AlphanumericType(1),"U");
	private final Group cdemoMenuOptions = new Group(union);
	private final Group cdemoMenuOpt = new Group(cdemoMenuOptions,new FixedArray(12));
	private final Elementary cdemoMenuOptNum = new Elementary(cdemoMenuOpt,new ZonedType(2, 0, false));
	private final Elementary cdemoMenuOptName = new Elementary(cdemoMenuOpt,new AlphanumericType(35));
	private final Elementary cdemoMenuOptPgmname = new Elementary(cdemoMenuOpt,new AlphanumericType(8));
	private final Elementary cdemoMenuOptUsrtype = new Elementary(cdemoMenuOpt,new AlphanumericType(1));
	

	/**
	 * Instantiate a new CarddemoMainMenuOptions with a default record.
	 * @param configuration the configuration
	 */
	public CarddemoMainMenuOptions(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CarddemoMainMenuOptions bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CarddemoMainMenuOptions(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute cdemoMenuOptCount.
	 * @return the cdemoMenuOptCount attribute reference
	 */
	public ElementaryRangeReference getCdemoMenuOptCountReference() {
		return cdemoMenuOptCount.getReference();
	}

	/**
	 * Getter for cdemoMenuOptCount attribute.
	 * @return cdemoMenuOptCount attribute
	 */
	public int getCdemoMenuOptCount() {
		return cdemoMenuOptCount.getValue();
	}

	/**
	 * Setter for cdemoMenuOptCount attribute.
	 * @param cdemoMenuOptCount the new value of cdemoMenuOptCount
	 */
	public void setCdemoMenuOptCount(int cdemoMenuOptCount) {
		this.cdemoMenuOptCount.setValue(cdemoMenuOptCount);
	}
	
	/**
	 * Gets the reference for attribute cdemoMenuOptionsData.
	 * @return the cdemoMenuOptionsData attribute reference
	 */
	public RangeReference getCdemoMenuOptionsDataReference() {
		return cdemoMenuOptionsData.getReference();
	}	
				
	/**
	 * Setter for cdemoMenuOptionsData .
	 */
   	public void setCdemoMenuOptionsData(RangeReference reference) {
       	cdemoMenuOptionsData.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute cdemoMenuOptions.
	 * @return the cdemoMenuOptions attribute reference
	 */
	public RangeReference getCdemoMenuOptionsReference() {
		return cdemoMenuOptions.getReference();
	}	
				
	/**
	 * Setter for cdemoMenuOptions .
	 */
   	public void setCdemoMenuOptions(RangeReference reference) {
       	cdemoMenuOptions.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Indexed getter for group cdemoMenuOpt attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOpt attribute
	 */
	public RangeReference getItemFromCdemoMenuOptReference(Integer... indexes){
		return cdemoMenuOpt.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group cdemoMenuOpt attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromCdemoMenuOpt( RangeReference rangeReference, Integer... indexes){
		cdemoMenuOpt.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group cdemoMenuOpt attribute.
	 * @return  the collection size for attributecdemoMenuOpt
	 */
	public int getCdemoMenuOptSize(){
		return cdemoMenuOpt.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for cdemoMenuOptNum attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptNum attribute
	 */
	public ElementaryRangeReference getItemFromCdemoMenuOptNumReference(Integer... indexes) {
		return cdemoMenuOptNum.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for cdemoMenuOptNum attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptNum attribute
	 */
	public int getItemFromCdemoMenuOptNum(Integer... indexes) {
		return cdemoMenuOptNum.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for cdemoMenuOptNum attribute.
	 * @param cdemoMenuOptNum the new value of cdemoMenuOptNum for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromCdemoMenuOptNum(int cdemoMenuOptNum,Integer... indexes) {
		this.cdemoMenuOptNum.setIndexedValue(cdemoMenuOptNum,indexes);
	}
	
	/**
	 * Collection size getter for cdemoMenuOptNum attribute.
	 * @return  the collection size for attributecdemoMenuOptNum
	 */
	public int getCdemoMenuOptNumSize(){
		return cdemoMenuOptNum.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for cdemoMenuOptNum attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptNum attribute
	 */
	public ElementaryRangeReference getCdemoMenuOptNumReference() {
		return cdemoMenuOptNum.getReference();
	}
	
	/**
	 * Indexed getter for cdemoMenuOptNum attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptNum attribute
	 */
	public int getCdemoMenuOptNum() {
		return cdemoMenuOptNum.getValue();
	}
	
	/**
	 * Indexed setter for cdemoMenuOptNum attribute.
	 * @param cdemoMenuOptNum the new value of cdemoMenuOptNum for given indexes
	 * @param indexes the indexes
	 */
	public void setCdemoMenuOptNum(int cdemoMenuOptNum) {
		this.cdemoMenuOptNum.setValue(cdemoMenuOptNum);
	}
	
	/**
	 * Indexed getter for cdemoMenuOptName attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptName attribute
	 */
	public ElementaryRangeReference getItemFromCdemoMenuOptNameReference(Integer... indexes) {
		return cdemoMenuOptName.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for cdemoMenuOptName attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptName attribute
	 */
	public String getItemFromCdemoMenuOptName(Integer... indexes) {
		return cdemoMenuOptName.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for cdemoMenuOptName attribute.
	 * @param cdemoMenuOptName the new value of cdemoMenuOptName for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromCdemoMenuOptName(String cdemoMenuOptName,Integer... indexes) {
		this.cdemoMenuOptName.setIndexedValue(cdemoMenuOptName,indexes);
	}
	
	/**
	 * Collection size getter for cdemoMenuOptName attribute.
	 * @return  the collection size for attributecdemoMenuOptName
	 */
	public int getCdemoMenuOptNameSize(){
		return cdemoMenuOptName.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for cdemoMenuOptName attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptName attribute
	 */
	public ElementaryRangeReference getCdemoMenuOptNameReference() {
		return cdemoMenuOptName.getReference();
	}
	
	/**
	 * Indexed getter for cdemoMenuOptName attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptName attribute
	 */
	public String getCdemoMenuOptName() {
		return cdemoMenuOptName.getValue();
	}
	
	/**
	 * Indexed setter for cdemoMenuOptName attribute.
	 * @param cdemoMenuOptName the new value of cdemoMenuOptName for given indexes
	 * @param indexes the indexes
	 */
	public void setCdemoMenuOptName(String cdemoMenuOptName) {
		this.cdemoMenuOptName.setValue(cdemoMenuOptName);
	}
	
	/**
	 * Indexed getter for cdemoMenuOptPgmname attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptPgmname attribute
	 */
	public ElementaryRangeReference getItemFromCdemoMenuOptPgmnameReference(Integer... indexes) {
		return cdemoMenuOptPgmname.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for cdemoMenuOptPgmname attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptPgmname attribute
	 */
	public String getItemFromCdemoMenuOptPgmname(Integer... indexes) {
		return cdemoMenuOptPgmname.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for cdemoMenuOptPgmname attribute.
	 * @param cdemoMenuOptPgmname the new value of cdemoMenuOptPgmname for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromCdemoMenuOptPgmname(String cdemoMenuOptPgmname,Integer... indexes) {
		this.cdemoMenuOptPgmname.setIndexedValue(cdemoMenuOptPgmname,indexes);
	}
	
	/**
	 * Collection size getter for cdemoMenuOptPgmname attribute.
	 * @return  the collection size for attributecdemoMenuOptPgmname
	 */
	public int getCdemoMenuOptPgmnameSize(){
		return cdemoMenuOptPgmname.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for cdemoMenuOptPgmname attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptPgmname attribute
	 */
	public ElementaryRangeReference getCdemoMenuOptPgmnameReference() {
		return cdemoMenuOptPgmname.getReference();
	}
	
	/**
	 * Indexed getter for cdemoMenuOptPgmname attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptPgmname attribute
	 */
	public String getCdemoMenuOptPgmname() {
		return cdemoMenuOptPgmname.getValue();
	}
	
	/**
	 * Indexed setter for cdemoMenuOptPgmname attribute.
	 * @param cdemoMenuOptPgmname the new value of cdemoMenuOptPgmname for given indexes
	 * @param indexes the indexes
	 */
	public void setCdemoMenuOptPgmname(String cdemoMenuOptPgmname) {
		this.cdemoMenuOptPgmname.setValue(cdemoMenuOptPgmname);
	}
	
	/**
	 * Indexed getter for cdemoMenuOptUsrtype attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptUsrtype attribute
	 */
	public ElementaryRangeReference getItemFromCdemoMenuOptUsrtypeReference(Integer... indexes) {
		return cdemoMenuOptUsrtype.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for cdemoMenuOptUsrtype attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptUsrtype attribute
	 */
	public String getItemFromCdemoMenuOptUsrtype(Integer... indexes) {
		return cdemoMenuOptUsrtype.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for cdemoMenuOptUsrtype attribute.
	 * @param cdemoMenuOptUsrtype the new value of cdemoMenuOptUsrtype for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromCdemoMenuOptUsrtype(String cdemoMenuOptUsrtype,Integer... indexes) {
		this.cdemoMenuOptUsrtype.setIndexedValue(cdemoMenuOptUsrtype,indexes);
	}
	
	/**
	 * Collection size getter for cdemoMenuOptUsrtype attribute.
	 * @return  the collection size for attributecdemoMenuOptUsrtype
	 */
	public int getCdemoMenuOptUsrtypeSize(){
		return cdemoMenuOptUsrtype.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for cdemoMenuOptUsrtype attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptUsrtype attribute
	 */
	public ElementaryRangeReference getCdemoMenuOptUsrtypeReference() {
		return cdemoMenuOptUsrtype.getReference();
	}
	
	/**
	 * Indexed getter for cdemoMenuOptUsrtype attribute.
	 * @param indexes the indexes
	 * @return cdemoMenuOptUsrtype attribute
	 */
	public String getCdemoMenuOptUsrtype() {
		return cdemoMenuOptUsrtype.getValue();
	}
	
	/**
	 * Indexed setter for cdemoMenuOptUsrtype attribute.
	 * @param cdemoMenuOptUsrtype the new value of cdemoMenuOptUsrtype for given indexes
	 * @param indexes the indexes
	 */
	public void setCdemoMenuOptUsrtype(String cdemoMenuOptUsrtype) {
		this.cdemoMenuOptUsrtype.setValue(cdemoMenuOptUsrtype);
	}
	
}
