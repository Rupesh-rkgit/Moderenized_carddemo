package aws.bluage.l3.workshop.cousr03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity CarddemoCommarea.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *   Communication area for CardDemo application programs<br>
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
 * <p>About 'cdemoGeneralInfo' field, <br>uml entity: aws.bluage.l3.workshop.cousr03c.business.model.CdemoGeneralInfo
 * <br></p>
 * 
 * <p>About 'cdemoCustomerInfo' field, <br>uml entity: aws.bluage.l3.workshop.cousr03c.business.model.CdemoCustomerInfo
 * <br></p>
 * 
 * <p>About 'cdemoAccountInfo' field, <br>uml entity: aws.bluage.l3.workshop.cousr03c.business.model.CdemoAccountInfo
 * <br></p>
 * 
 * <p>About 'cdemoCardInfo' field, <br>uml entity: aws.bluage.l3.workshop.cousr03c.business.model.CdemoCardInfo
 * <br></p>
 * 
 * <p>About 'cdemoMoreInfo' field, <br>uml entity: aws.bluage.l3.workshop.cousr03c.business.model.CdemoMoreInfo
 * <br></p>
 * 
 * <p>About 'cdemoCu03Info' field, <br>uml entity: aws.bluage.l3.workshop.cousr03c.business.model.CdemoCu03Info
 * <br></p>
 * 
 * @see RecordEntity
 */
public class CarddemoCommarea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group cdemoGeneralInfo = new Group(root);
	private final Elementary cdemoFromTranid = new Elementary(cdemoGeneralInfo,new AlphanumericType(4));
	private final Elementary cdemoFromProgram = new Elementary(cdemoGeneralInfo,new AlphanumericType(8));
	private final Elementary cdemoToTranid = new Elementary(cdemoGeneralInfo,new AlphanumericType(4));
	private final Elementary cdemoToProgram = new Elementary(cdemoGeneralInfo,new AlphanumericType(8));
	private final Elementary cdemoUserId = new Elementary(cdemoGeneralInfo,new AlphanumericType(8));
	private final Elementary cdemoUserType = new Elementary(cdemoGeneralInfo,new AlphanumericType(1));
	private final ConditionName cdemoUsrtypAdmin=new ConditionName(cdemoUserType,"A");
	private final ConditionName cdemoUsrtypUser=new ConditionName(cdemoUserType,"U");
	private final Elementary cdemoPgmContext = new Elementary(cdemoGeneralInfo,new ZonedType(1, 0, false));
	private final ConditionName cdemoPgmEnter=new ConditionName(cdemoPgmContext,new BigDecimal("0"));
	private final ConditionName cdemoPgmReenter=new ConditionName(cdemoPgmContext,new BigDecimal("1"));
	private final Group cdemoCustomerInfo = new Group(root);
	private final Elementary cdemoCustId = new Elementary(cdemoCustomerInfo,new ZonedType(9, 0, false));
	private final Elementary cdemoCustFname = new Elementary(cdemoCustomerInfo,new AlphanumericType(25));
	private final Elementary cdemoCustMname = new Elementary(cdemoCustomerInfo,new AlphanumericType(25));
	private final Elementary cdemoCustLname = new Elementary(cdemoCustomerInfo,new AlphanumericType(25));
	private final Group cdemoAccountInfo = new Group(root);
	private final Elementary cdemoAcctId = new Elementary(cdemoAccountInfo,new ZonedType(11, 0, false));
	private final Elementary cdemoAcctStatus = new Elementary(cdemoAccountInfo,new AlphanumericType(1));
	private final Group cdemoCardInfo = new Group(root);
	private final Elementary cdemoCardNum = new Elementary(cdemoCardInfo,new ZonedType(16, 0, false));
	private final Group cdemoMoreInfo = new Group(root);
	private final Elementary cdemoLastMap = new Elementary(cdemoMoreInfo,new AlphanumericType(7));
	private final Elementary cdemoLastMapset = new Elementary(cdemoMoreInfo,new AlphanumericType(7));
	
	/**
	 * 
	 * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:57 CDT
	 * 
	 */
	private final Group cdemoCu03Info = new Group(root);
	private final Elementary cdemoCu03UsridFirst = new Elementary(cdemoCu03Info,new AlphanumericType(8));
	private final Elementary cdemoCu03UsridLast = new Elementary(cdemoCu03Info,new AlphanumericType(8));
	private final Elementary cdemoCu03PageNum = new Elementary(cdemoCu03Info,new ZonedType(8, 0, false));
	private final Elementary cdemoCu03NextPageFlg = new Elementary(cdemoCu03Info,new AlphanumericType(1),"N");
	private final ConditionName nextPageYes=new ConditionName(cdemoCu03NextPageFlg,"Y");
	private final ConditionName nextPageNo=new ConditionName(cdemoCu03NextPageFlg,"N");
	private final Elementary cdemoCu03UsrSelFlg = new Elementary(cdemoCu03Info,new AlphanumericType(1));
	private final Elementary cdemoCu03UsrSelected = new Elementary(cdemoCu03Info,new AlphanumericType(8));
	

	/**
	 * Instantiate a new CarddemoCommarea with a default record.
	 * @param configuration the configuration
	 */
	public CarddemoCommarea(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CarddemoCommarea bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CarddemoCommarea(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute cdemoGeneralInfo.
	 * @return the cdemoGeneralInfo attribute reference
	 */
	public RangeReference getCdemoGeneralInfoReference() {
		return cdemoGeneralInfo.getReference();
	}	
				
	/**
	 * Setter for cdemoGeneralInfo .
	 */
   	public void setCdemoGeneralInfo(RangeReference reference) {
       	cdemoGeneralInfo.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute cdemoFromTranid.
	 * @return the cdemoFromTranid attribute reference
	 */
	public ElementaryRangeReference getCdemoFromTranidReference() {
		return cdemoFromTranid.getReference();
	}

	/**
	 * Getter for cdemoFromTranid attribute.
	 * @return cdemoFromTranid attribute
	 */
	public String getCdemoFromTranid() {
		return cdemoFromTranid.getValue();
	}

	/**
	 * Setter for cdemoFromTranid attribute.
	 * @param cdemoFromTranid the new value of cdemoFromTranid
	 */
	public void setCdemoFromTranid(String cdemoFromTranid) {
		this.cdemoFromTranid.setValue(cdemoFromTranid);
	}
	/**
	 * Gets the reference for attribute cdemoFromProgram.
	 * @return the cdemoFromProgram attribute reference
	 */
	public ElementaryRangeReference getCdemoFromProgramReference() {
		return cdemoFromProgram.getReference();
	}

	/**
	 * Getter for cdemoFromProgram attribute.
	 * @return cdemoFromProgram attribute
	 */
	public String getCdemoFromProgram() {
		return cdemoFromProgram.getValue();
	}

	/**
	 * Setter for cdemoFromProgram attribute.
	 * @param cdemoFromProgram the new value of cdemoFromProgram
	 */
	public void setCdemoFromProgram(String cdemoFromProgram) {
		this.cdemoFromProgram.setValue(cdemoFromProgram);
	}
	/**
	 * Gets the reference for attribute cdemoToTranid.
	 * @return the cdemoToTranid attribute reference
	 */
	public ElementaryRangeReference getCdemoToTranidReference() {
		return cdemoToTranid.getReference();
	}

	/**
	 * Getter for cdemoToTranid attribute.
	 * @return cdemoToTranid attribute
	 */
	public String getCdemoToTranid() {
		return cdemoToTranid.getValue();
	}

	/**
	 * Setter for cdemoToTranid attribute.
	 * @param cdemoToTranid the new value of cdemoToTranid
	 */
	public void setCdemoToTranid(String cdemoToTranid) {
		this.cdemoToTranid.setValue(cdemoToTranid);
	}
	/**
	 * Gets the reference for attribute cdemoToProgram.
	 * @return the cdemoToProgram attribute reference
	 */
	public ElementaryRangeReference getCdemoToProgramReference() {
		return cdemoToProgram.getReference();
	}

	/**
	 * Getter for cdemoToProgram attribute.
	 * @return cdemoToProgram attribute
	 */
	public String getCdemoToProgram() {
		return cdemoToProgram.getValue();
	}

	/**
	 * Setter for cdemoToProgram attribute.
	 * @param cdemoToProgram the new value of cdemoToProgram
	 */
	public void setCdemoToProgram(String cdemoToProgram) {
		this.cdemoToProgram.setValue(cdemoToProgram);
	}
	/**
	 * Gets the reference for attribute cdemoUserId.
	 * @return the cdemoUserId attribute reference
	 */
	public ElementaryRangeReference getCdemoUserIdReference() {
		return cdemoUserId.getReference();
	}

	/**
	 * Getter for cdemoUserId attribute.
	 * @return cdemoUserId attribute
	 */
	public String getCdemoUserId() {
		return cdemoUserId.getValue();
	}

	/**
	 * Setter for cdemoUserId attribute.
	 * @param cdemoUserId the new value of cdemoUserId
	 */
	public void setCdemoUserId(String cdemoUserId) {
		this.cdemoUserId.setValue(cdemoUserId);
	}
	/**
	 * Gets the reference for attribute cdemoUserType.
	 * @return the cdemoUserType attribute reference
	 */
	public ElementaryRangeReference getCdemoUserTypeReference() {
		return cdemoUserType.getReference();
	}

	/**
	 * Getter for cdemoUserType attribute.
	 * @return cdemoUserType attribute
	 */
	public String getCdemoUserType() {
		return cdemoUserType.getValue();
	}

	/**
	 * Setter for cdemoUserType attribute.
	 * @param cdemoUserType the new value of cdemoUserType
	 */
	public void setCdemoUserType(String cdemoUserType) {
		this.cdemoUserType.setValue(cdemoUserType);
	}
	/**
	 * Gets the reference for attribute cdemoUsrtypAdmin.
	 * @return the cdemoUsrtypAdmin attribute reference
	 */
	public ConditionReference getCdemoUsrtypAdminReference() {
		return cdemoUserType.getCondition(cdemoUsrtypAdmin);	
	}

	/**
	 * Getter for cdemoUsrtypAdmin attribute.
	 * @return cdemoUsrtypAdmin attribute
	 */
	public boolean isCdemoUsrtypAdmin() {
		return getCdemoUsrtypAdminReference().getValue();	
	}

	/**
	 * Setter for cdemoUsrtypAdmin attribute.
	 * @param cdemoUsrtypAdmin the new value of cdemoUsrtypAdmin
	 */
	public void setCdemoUsrtypAdmin(boolean cdemoUsrtypAdmin) {
		getCdemoUsrtypAdminReference().setValue(cdemoUsrtypAdmin);	
	}
	/**
	 * Gets the reference for attribute cdemoUsrtypUser.
	 * @return the cdemoUsrtypUser attribute reference
	 */
	public ConditionReference getCdemoUsrtypUserReference() {
		return cdemoUserType.getCondition(cdemoUsrtypUser);	
	}

	/**
	 * Getter for cdemoUsrtypUser attribute.
	 * @return cdemoUsrtypUser attribute
	 */
	public boolean isCdemoUsrtypUser() {
		return getCdemoUsrtypUserReference().getValue();	
	}

	/**
	 * Setter for cdemoUsrtypUser attribute.
	 * @param cdemoUsrtypUser the new value of cdemoUsrtypUser
	 */
	public void setCdemoUsrtypUser(boolean cdemoUsrtypUser) {
		getCdemoUsrtypUserReference().setValue(cdemoUsrtypUser);	
	}
	/**
	 * Gets the reference for attribute cdemoPgmContext.
	 * @return the cdemoPgmContext attribute reference
	 */
	public ElementaryRangeReference getCdemoPgmContextReference() {
		return cdemoPgmContext.getReference();
	}

	/**
	 * Getter for cdemoPgmContext attribute.
	 * @return cdemoPgmContext attribute
	 */
	public int getCdemoPgmContext() {
		return cdemoPgmContext.getValue();
	}

	/**
	 * Setter for cdemoPgmContext attribute.
	 * @param cdemoPgmContext the new value of cdemoPgmContext
	 */
	public void setCdemoPgmContext(int cdemoPgmContext) {
		this.cdemoPgmContext.setValue(cdemoPgmContext);
	}
	/**
	 * Gets the reference for attribute cdemoPgmEnter.
	 * @return the cdemoPgmEnter attribute reference
	 */
	public ConditionReference getCdemoPgmEnterReference() {
		return cdemoPgmContext.getCondition(cdemoPgmEnter);	
	}

	/**
	 * Getter for cdemoPgmEnter attribute.
	 * @return cdemoPgmEnter attribute
	 */
	public boolean isCdemoPgmEnter() {
		return getCdemoPgmEnterReference().getValue();	
	}

	/**
	 * Setter for cdemoPgmEnter attribute.
	 * @param cdemoPgmEnter the new value of cdemoPgmEnter
	 */
	public void setCdemoPgmEnter(boolean cdemoPgmEnter) {
		getCdemoPgmEnterReference().setValue(cdemoPgmEnter);	
	}
	/**
	 * Gets the reference for attribute cdemoPgmReenter.
	 * @return the cdemoPgmReenter attribute reference
	 */
	public ConditionReference getCdemoPgmReenterReference() {
		return cdemoPgmContext.getCondition(cdemoPgmReenter);	
	}

	/**
	 * Getter for cdemoPgmReenter attribute.
	 * @return cdemoPgmReenter attribute
	 */
	public boolean isCdemoPgmReenter() {
		return getCdemoPgmReenterReference().getValue();	
	}

	/**
	 * Setter for cdemoPgmReenter attribute.
	 * @param cdemoPgmReenter the new value of cdemoPgmReenter
	 */
	public void setCdemoPgmReenter(boolean cdemoPgmReenter) {
		getCdemoPgmReenterReference().setValue(cdemoPgmReenter);	
	}
	
	/**
	 * Gets the reference for attribute cdemoCustomerInfo.
	 * @return the cdemoCustomerInfo attribute reference
	 */
	public RangeReference getCdemoCustomerInfoReference() {
		return cdemoCustomerInfo.getReference();
	}	
				
	/**
	 * Setter for cdemoCustomerInfo .
	 */
   	public void setCdemoCustomerInfo(RangeReference reference) {
       	cdemoCustomerInfo.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute cdemoCustId.
	 * @return the cdemoCustId attribute reference
	 */
	public ElementaryRangeReference getCdemoCustIdReference() {
		return cdemoCustId.getReference();
	}

	/**
	 * Getter for cdemoCustId attribute.
	 * @return cdemoCustId attribute
	 */
	public int getCdemoCustId() {
		return cdemoCustId.getValue();
	}

	/**
	 * Setter for cdemoCustId attribute.
	 * @param cdemoCustId the new value of cdemoCustId
	 */
	public void setCdemoCustId(int cdemoCustId) {
		this.cdemoCustId.setValue(cdemoCustId);
	}
	/**
	 * Gets the reference for attribute cdemoCustFname.
	 * @return the cdemoCustFname attribute reference
	 */
	public ElementaryRangeReference getCdemoCustFnameReference() {
		return cdemoCustFname.getReference();
	}

	/**
	 * Getter for cdemoCustFname attribute.
	 * @return cdemoCustFname attribute
	 */
	public String getCdemoCustFname() {
		return cdemoCustFname.getValue();
	}

	/**
	 * Setter for cdemoCustFname attribute.
	 * @param cdemoCustFname the new value of cdemoCustFname
	 */
	public void setCdemoCustFname(String cdemoCustFname) {
		this.cdemoCustFname.setValue(cdemoCustFname);
	}
	/**
	 * Gets the reference for attribute cdemoCustMname.
	 * @return the cdemoCustMname attribute reference
	 */
	public ElementaryRangeReference getCdemoCustMnameReference() {
		return cdemoCustMname.getReference();
	}

	/**
	 * Getter for cdemoCustMname attribute.
	 * @return cdemoCustMname attribute
	 */
	public String getCdemoCustMname() {
		return cdemoCustMname.getValue();
	}

	/**
	 * Setter for cdemoCustMname attribute.
	 * @param cdemoCustMname the new value of cdemoCustMname
	 */
	public void setCdemoCustMname(String cdemoCustMname) {
		this.cdemoCustMname.setValue(cdemoCustMname);
	}
	/**
	 * Gets the reference for attribute cdemoCustLname.
	 * @return the cdemoCustLname attribute reference
	 */
	public ElementaryRangeReference getCdemoCustLnameReference() {
		return cdemoCustLname.getReference();
	}

	/**
	 * Getter for cdemoCustLname attribute.
	 * @return cdemoCustLname attribute
	 */
	public String getCdemoCustLname() {
		return cdemoCustLname.getValue();
	}

	/**
	 * Setter for cdemoCustLname attribute.
	 * @param cdemoCustLname the new value of cdemoCustLname
	 */
	public void setCdemoCustLname(String cdemoCustLname) {
		this.cdemoCustLname.setValue(cdemoCustLname);
	}
	
	/**
	 * Gets the reference for attribute cdemoAccountInfo.
	 * @return the cdemoAccountInfo attribute reference
	 */
	public RangeReference getCdemoAccountInfoReference() {
		return cdemoAccountInfo.getReference();
	}	
				
	/**
	 * Setter for cdemoAccountInfo .
	 */
   	public void setCdemoAccountInfo(RangeReference reference) {
       	cdemoAccountInfo.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute cdemoAcctId.
	 * @return the cdemoAcctId attribute reference
	 */
	public ElementaryRangeReference getCdemoAcctIdReference() {
		return cdemoAcctId.getReference();
	}

	/**
	 * Getter for cdemoAcctId attribute.
	 * @return cdemoAcctId attribute
	 */
	public long getCdemoAcctId() {
		return cdemoAcctId.getValue();
	}

	/**
	 * Setter for cdemoAcctId attribute.
	 * @param cdemoAcctId the new value of cdemoAcctId
	 */
	public void setCdemoAcctId(long cdemoAcctId) {
		this.cdemoAcctId.setValue(cdemoAcctId);
	}
	/**
	 * Gets the reference for attribute cdemoAcctStatus.
	 * @return the cdemoAcctStatus attribute reference
	 */
	public ElementaryRangeReference getCdemoAcctStatusReference() {
		return cdemoAcctStatus.getReference();
	}

	/**
	 * Getter for cdemoAcctStatus attribute.
	 * @return cdemoAcctStatus attribute
	 */
	public String getCdemoAcctStatus() {
		return cdemoAcctStatus.getValue();
	}

	/**
	 * Setter for cdemoAcctStatus attribute.
	 * @param cdemoAcctStatus the new value of cdemoAcctStatus
	 */
	public void setCdemoAcctStatus(String cdemoAcctStatus) {
		this.cdemoAcctStatus.setValue(cdemoAcctStatus);
	}
	
	/**
	 * Gets the reference for attribute cdemoCardInfo.
	 * @return the cdemoCardInfo attribute reference
	 */
	public RangeReference getCdemoCardInfoReference() {
		return cdemoCardInfo.getReference();
	}	
				
	/**
	 * Setter for cdemoCardInfo .
	 */
   	public void setCdemoCardInfo(RangeReference reference) {
       	cdemoCardInfo.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute cdemoCardNum.
	 * @return the cdemoCardNum attribute reference
	 */
	public ElementaryRangeReference getCdemoCardNumReference() {
		return cdemoCardNum.getReference();
	}

	/**
	 * Getter for cdemoCardNum attribute.
	 * @return cdemoCardNum attribute
	 */
	public long getCdemoCardNum() {
		return cdemoCardNum.getValue();
	}

	/**
	 * Setter for cdemoCardNum attribute.
	 * @param cdemoCardNum the new value of cdemoCardNum
	 */
	public void setCdemoCardNum(long cdemoCardNum) {
		this.cdemoCardNum.setValue(cdemoCardNum);
	}
	
	/**
	 * Gets the reference for attribute cdemoMoreInfo.
	 * @return the cdemoMoreInfo attribute reference
	 */
	public RangeReference getCdemoMoreInfoReference() {
		return cdemoMoreInfo.getReference();
	}	
				
	/**
	 * Setter for cdemoMoreInfo .
	 */
   	public void setCdemoMoreInfo(RangeReference reference) {
       	cdemoMoreInfo.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute cdemoLastMap.
	 * @return the cdemoLastMap attribute reference
	 */
	public ElementaryRangeReference getCdemoLastMapReference() {
		return cdemoLastMap.getReference();
	}

	/**
	 * Getter for cdemoLastMap attribute.
	 * @return cdemoLastMap attribute
	 */
	public String getCdemoLastMap() {
		return cdemoLastMap.getValue();
	}

	/**
	 * Setter for cdemoLastMap attribute.
	 * @param cdemoLastMap the new value of cdemoLastMap
	 */
	public void setCdemoLastMap(String cdemoLastMap) {
		this.cdemoLastMap.setValue(cdemoLastMap);
	}
	/**
	 * Gets the reference for attribute cdemoLastMapset.
	 * @return the cdemoLastMapset attribute reference
	 */
	public ElementaryRangeReference getCdemoLastMapsetReference() {
		return cdemoLastMapset.getReference();
	}

	/**
	 * Getter for cdemoLastMapset attribute.
	 * @return cdemoLastMapset attribute
	 */
	public String getCdemoLastMapset() {
		return cdemoLastMapset.getValue();
	}

	/**
	 * Setter for cdemoLastMapset attribute.
	 * @param cdemoLastMapset the new value of cdemoLastMapset
	 */
	public void setCdemoLastMapset(String cdemoLastMapset) {
		this.cdemoLastMapset.setValue(cdemoLastMapset);
	}
	
	/**
	 * Gets the reference for attribute cdemoCu03Info.
	 * @return the cdemoCu03Info attribute reference
	 */
	public RangeReference getCdemoCu03InfoReference() {
		return cdemoCu03Info.getReference();
	}	
				
	/**
	 * Setter for cdemoCu03Info .
	 */
   	public void setCdemoCu03Info(RangeReference reference) {
       	cdemoCu03Info.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute cdemoCu03UsridFirst.
	 * @return the cdemoCu03UsridFirst attribute reference
	 */
	public ElementaryRangeReference getCdemoCu03UsridFirstReference() {
		return cdemoCu03UsridFirst.getReference();
	}

	/**
	 * Getter for cdemoCu03UsridFirst attribute.
	 * @return cdemoCu03UsridFirst attribute
	 */
	public String getCdemoCu03UsridFirst() {
		return cdemoCu03UsridFirst.getValue();
	}

	/**
	 * Setter for cdemoCu03UsridFirst attribute.
	 * @param cdemoCu03UsridFirst the new value of cdemoCu03UsridFirst
	 */
	public void setCdemoCu03UsridFirst(String cdemoCu03UsridFirst) {
		this.cdemoCu03UsridFirst.setValue(cdemoCu03UsridFirst);
	}
	/**
	 * Gets the reference for attribute cdemoCu03UsridLast.
	 * @return the cdemoCu03UsridLast attribute reference
	 */
	public ElementaryRangeReference getCdemoCu03UsridLastReference() {
		return cdemoCu03UsridLast.getReference();
	}

	/**
	 * Getter for cdemoCu03UsridLast attribute.
	 * @return cdemoCu03UsridLast attribute
	 */
	public String getCdemoCu03UsridLast() {
		return cdemoCu03UsridLast.getValue();
	}

	/**
	 * Setter for cdemoCu03UsridLast attribute.
	 * @param cdemoCu03UsridLast the new value of cdemoCu03UsridLast
	 */
	public void setCdemoCu03UsridLast(String cdemoCu03UsridLast) {
		this.cdemoCu03UsridLast.setValue(cdemoCu03UsridLast);
	}
	/**
	 * Gets the reference for attribute cdemoCu03PageNum.
	 * @return the cdemoCu03PageNum attribute reference
	 */
	public ElementaryRangeReference getCdemoCu03PageNumReference() {
		return cdemoCu03PageNum.getReference();
	}

	/**
	 * Getter for cdemoCu03PageNum attribute.
	 * @return cdemoCu03PageNum attribute
	 */
	public int getCdemoCu03PageNum() {
		return cdemoCu03PageNum.getValue();
	}

	/**
	 * Setter for cdemoCu03PageNum attribute.
	 * @param cdemoCu03PageNum the new value of cdemoCu03PageNum
	 */
	public void setCdemoCu03PageNum(int cdemoCu03PageNum) {
		this.cdemoCu03PageNum.setValue(cdemoCu03PageNum);
	}
	/**
	 * Gets the reference for attribute cdemoCu03NextPageFlg.
	 * @return the cdemoCu03NextPageFlg attribute reference
	 */
	public ElementaryRangeReference getCdemoCu03NextPageFlgReference() {
		return cdemoCu03NextPageFlg.getReference();
	}

	/**
	 * Getter for cdemoCu03NextPageFlg attribute.
	 * @return cdemoCu03NextPageFlg attribute
	 */
	public String getCdemoCu03NextPageFlg() {
		return cdemoCu03NextPageFlg.getValue();
	}

	/**
	 * Setter for cdemoCu03NextPageFlg attribute.
	 * @param cdemoCu03NextPageFlg the new value of cdemoCu03NextPageFlg
	 */
	public void setCdemoCu03NextPageFlg(String cdemoCu03NextPageFlg) {
		this.cdemoCu03NextPageFlg.setValue(cdemoCu03NextPageFlg);
	}
	/**
	 * Gets the reference for attribute nextPageYes.
	 * @return the nextPageYes attribute reference
	 */
	public ConditionReference getNextPageYesReference() {
		return cdemoCu03NextPageFlg.getCondition(nextPageYes);	
	}

	/**
	 * Getter for nextPageYes attribute.
	 * @return nextPageYes attribute
	 */
	public boolean isNextPageYes() {
		return getNextPageYesReference().getValue();	
	}

	/**
	 * Setter for nextPageYes attribute.
	 * @param nextPageYes the new value of nextPageYes
	 */
	public void setNextPageYes(boolean nextPageYes) {
		getNextPageYesReference().setValue(nextPageYes);	
	}
	/**
	 * Gets the reference for attribute nextPageNo.
	 * @return the nextPageNo attribute reference
	 */
	public ConditionReference getNextPageNoReference() {
		return cdemoCu03NextPageFlg.getCondition(nextPageNo);	
	}

	/**
	 * Getter for nextPageNo attribute.
	 * @return nextPageNo attribute
	 */
	public boolean isNextPageNo() {
		return getNextPageNoReference().getValue();	
	}

	/**
	 * Setter for nextPageNo attribute.
	 * @param nextPageNo the new value of nextPageNo
	 */
	public void setNextPageNo(boolean nextPageNo) {
		getNextPageNoReference().setValue(nextPageNo);	
	}
	/**
	 * Gets the reference for attribute cdemoCu03UsrSelFlg.
	 * @return the cdemoCu03UsrSelFlg attribute reference
	 */
	public ElementaryRangeReference getCdemoCu03UsrSelFlgReference() {
		return cdemoCu03UsrSelFlg.getReference();
	}

	/**
	 * Getter for cdemoCu03UsrSelFlg attribute.
	 * @return cdemoCu03UsrSelFlg attribute
	 */
	public String getCdemoCu03UsrSelFlg() {
		return cdemoCu03UsrSelFlg.getValue();
	}

	/**
	 * Setter for cdemoCu03UsrSelFlg attribute.
	 * @param cdemoCu03UsrSelFlg the new value of cdemoCu03UsrSelFlg
	 */
	public void setCdemoCu03UsrSelFlg(String cdemoCu03UsrSelFlg) {
		this.cdemoCu03UsrSelFlg.setValue(cdemoCu03UsrSelFlg);
	}
	/**
	 * Gets the reference for attribute cdemoCu03UsrSelected.
	 * @return the cdemoCu03UsrSelected attribute reference
	 */
	public ElementaryRangeReference getCdemoCu03UsrSelectedReference() {
		return cdemoCu03UsrSelected.getReference();
	}

	/**
	 * Getter for cdemoCu03UsrSelected attribute.
	 * @return cdemoCu03UsrSelected attribute
	 */
	public String getCdemoCu03UsrSelected() {
		return cdemoCu03UsrSelected.getValue();
	}

	/**
	 * Setter for cdemoCu03UsrSelected attribute.
	 * @param cdemoCu03UsrSelected the new value of cdemoCu03UsrSelected
	 */
	public void setCdemoCu03UsrSelected(String cdemoCu03UsrSelected) {
		this.cdemoCu03UsrSelected.setValue(cdemoCu03UsrSelected);
	}
}
