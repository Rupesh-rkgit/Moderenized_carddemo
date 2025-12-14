package aws.bluage.l3.workshop.cousr03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity WsVariables.
<pre>
 * 
 * Legacy Documentation:<br>
 *  *****************************************************************<br>
 *   Program     : COUSR03C.CBL<br>
 *   Application : CardDemo<br>
 *   Type        : CICS COBOL Program<br>
 *   Function    : Delete a user from USRSEC file<br>
 *  *****************************************************************<br>
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
 *  *****************************************************************<br>
 *  ----------------------------------------------------------------*<br>
 *                       WORKING STORAGE SECTION<br>
 *  ----------------------------------------------------------------*<br>
</pre>
 * 
 * <p>About 'wsPgmname' field, <br>
 * </p>
 * 
 * <p>About 'wsTranid' field, <br>
 * </p>
 * 
 * <p>About 'wsMessage' field, <br>
 * </p>
 * 
 * <p>About 'wsUsrsecFile' field, <br>
 * </p>
 * 
 * <p>About 'wsErrFlg' field, <br>
 * </p>
 * 
 * <p>About 'errFlgOn' field, <br>
 * </p>
 * 
 * <p>About 'errFlgOff' field, <br>
 * </p>
 * 
 * <p>About 'wsRespCd' field, <br>
 * </p>
 * 
 * <p>About 'wsReasCd' field, <br>
 * </p>
 * 
 * <p>About 'wsUsrModified' field, <br>
 * </p>
 * 
 * <p>About 'usrModifiedYes' field, <br>
 * </p>
 * 
 * <p>About 'usrModifiedNo' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsVariables extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsPgmname = new Elementary(root,new AlphanumericType(8),"COUSR03C");
	private final Elementary wsTranid = new Elementary(root,new AlphanumericType(4),"CU03");
	private final Elementary wsMessage = new Elementary(root,new AlphanumericType(80)," ");
	private final Elementary wsUsrsecFile = new Elementary(root,new AlphanumericType(8),"USRSEC  ");
	private final Elementary wsErrFlg = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName errFlgOn=new ConditionName(wsErrFlg,"Y");
	private final ConditionName errFlgOff=new ConditionName(wsErrFlg,"N");
	private final Elementary wsRespCd = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsReasCd = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsUsrModified = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName usrModifiedYes=new ConditionName(wsUsrModified,"Y");
	private final ConditionName usrModifiedNo=new ConditionName(wsUsrModified,"N");
	

	/**
	 * Instantiate a new WsVariables with a default record.
	 * @param configuration the configuration
	 */
	public WsVariables(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsVariables bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsVariables(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsPgmname.
	 * @return the wsPgmname attribute reference
	 */
	public ElementaryRangeReference getWsPgmnameReference() {
		return wsPgmname.getReference();
	}

	/**
	 * Getter for wsPgmname attribute.
	 * @return wsPgmname attribute
	 */
	public String getWsPgmname() {
		return wsPgmname.getValue();
	}

	/**
	 * Setter for wsPgmname attribute.
	 * @param wsPgmname the new value of wsPgmname
	 */
	public void setWsPgmname(String wsPgmname) {
		this.wsPgmname.setValue(wsPgmname);
	}
	/**
	 * Gets the reference for attribute wsTranid.
	 * @return the wsTranid attribute reference
	 */
	public ElementaryRangeReference getWsTranidReference() {
		return wsTranid.getReference();
	}

	/**
	 * Getter for wsTranid attribute.
	 * @return wsTranid attribute
	 */
	public String getWsTranid() {
		return wsTranid.getValue();
	}

	/**
	 * Setter for wsTranid attribute.
	 * @param wsTranid the new value of wsTranid
	 */
	public void setWsTranid(String wsTranid) {
		this.wsTranid.setValue(wsTranid);
	}
	/**
	 * Gets the reference for attribute wsMessage.
	 * @return the wsMessage attribute reference
	 */
	public ElementaryRangeReference getWsMessageReference() {
		return wsMessage.getReference();
	}

	/**
	 * Getter for wsMessage attribute.
	 * @return wsMessage attribute
	 */
	public String getWsMessage() {
		return wsMessage.getValue();
	}

	/**
	 * Setter for wsMessage attribute.
	 * @param wsMessage the new value of wsMessage
	 */
	public void setWsMessage(String wsMessage) {
		this.wsMessage.setValue(wsMessage);
	}
	/**
	 * Gets the reference for attribute wsUsrsecFile.
	 * @return the wsUsrsecFile attribute reference
	 */
	public ElementaryRangeReference getWsUsrsecFileReference() {
		return wsUsrsecFile.getReference();
	}

	/**
	 * Getter for wsUsrsecFile attribute.
	 * @return wsUsrsecFile attribute
	 */
	public String getWsUsrsecFile() {
		return wsUsrsecFile.getValue();
	}

	/**
	 * Setter for wsUsrsecFile attribute.
	 * @param wsUsrsecFile the new value of wsUsrsecFile
	 */
	public void setWsUsrsecFile(String wsUsrsecFile) {
		this.wsUsrsecFile.setValue(wsUsrsecFile);
	}
	/**
	 * Gets the reference for attribute wsErrFlg.
	 * @return the wsErrFlg attribute reference
	 */
	public ElementaryRangeReference getWsErrFlgReference() {
		return wsErrFlg.getReference();
	}

	/**
	 * Getter for wsErrFlg attribute.
	 * @return wsErrFlg attribute
	 */
	public String getWsErrFlg() {
		return wsErrFlg.getValue();
	}

	/**
	 * Setter for wsErrFlg attribute.
	 * @param wsErrFlg the new value of wsErrFlg
	 */
	public void setWsErrFlg(String wsErrFlg) {
		this.wsErrFlg.setValue(wsErrFlg);
	}
	/**
	 * Gets the reference for attribute errFlgOn.
	 * @return the errFlgOn attribute reference
	 */
	public ConditionReference getErrFlgOnReference() {
		return wsErrFlg.getCondition(errFlgOn);	
	}

	/**
	 * Getter for errFlgOn attribute.
	 * @return errFlgOn attribute
	 */
	public boolean isErrFlgOn() {
		return getErrFlgOnReference().getValue();	
	}

	/**
	 * Setter for errFlgOn attribute.
	 * @param errFlgOn the new value of errFlgOn
	 */
	public void setErrFlgOn(boolean errFlgOn) {
		getErrFlgOnReference().setValue(errFlgOn);	
	}
	/**
	 * Gets the reference for attribute errFlgOff.
	 * @return the errFlgOff attribute reference
	 */
	public ConditionReference getErrFlgOffReference() {
		return wsErrFlg.getCondition(errFlgOff);	
	}

	/**
	 * Getter for errFlgOff attribute.
	 * @return errFlgOff attribute
	 */
	public boolean isErrFlgOff() {
		return getErrFlgOffReference().getValue();	
	}

	/**
	 * Setter for errFlgOff attribute.
	 * @param errFlgOff the new value of errFlgOff
	 */
	public void setErrFlgOff(boolean errFlgOff) {
		getErrFlgOffReference().setValue(errFlgOff);	
	}
	/**
	 * Gets the reference for attribute wsRespCd.
	 * @return the wsRespCd attribute reference
	 */
	public ElementaryRangeReference getWsRespCdReference() {
		return wsRespCd.getReference();
	}

	/**
	 * Getter for wsRespCd attribute.
	 * @return wsRespCd attribute
	 */
	public int getWsRespCd() {
		return wsRespCd.getValue();
	}

	/**
	 * Setter for wsRespCd attribute.
	 * @param wsRespCd the new value of wsRespCd
	 */
	public void setWsRespCd(int wsRespCd) {
		this.wsRespCd.setValue(wsRespCd);
	}
	/**
	 * Gets the reference for attribute wsReasCd.
	 * @return the wsReasCd attribute reference
	 */
	public ElementaryRangeReference getWsReasCdReference() {
		return wsReasCd.getReference();
	}

	/**
	 * Getter for wsReasCd attribute.
	 * @return wsReasCd attribute
	 */
	public int getWsReasCd() {
		return wsReasCd.getValue();
	}

	/**
	 * Setter for wsReasCd attribute.
	 * @param wsReasCd the new value of wsReasCd
	 */
	public void setWsReasCd(int wsReasCd) {
		this.wsReasCd.setValue(wsReasCd);
	}
	/**
	 * Gets the reference for attribute wsUsrModified.
	 * @return the wsUsrModified attribute reference
	 */
	public ElementaryRangeReference getWsUsrModifiedReference() {
		return wsUsrModified.getReference();
	}

	/**
	 * Getter for wsUsrModified attribute.
	 * @return wsUsrModified attribute
	 */
	public String getWsUsrModified() {
		return wsUsrModified.getValue();
	}

	/**
	 * Setter for wsUsrModified attribute.
	 * @param wsUsrModified the new value of wsUsrModified
	 */
	public void setWsUsrModified(String wsUsrModified) {
		this.wsUsrModified.setValue(wsUsrModified);
	}
	/**
	 * Gets the reference for attribute usrModifiedYes.
	 * @return the usrModifiedYes attribute reference
	 */
	public ConditionReference getUsrModifiedYesReference() {
		return wsUsrModified.getCondition(usrModifiedYes);	
	}

	/**
	 * Getter for usrModifiedYes attribute.
	 * @return usrModifiedYes attribute
	 */
	public boolean isUsrModifiedYes() {
		return getUsrModifiedYesReference().getValue();	
	}

	/**
	 * Setter for usrModifiedYes attribute.
	 * @param usrModifiedYes the new value of usrModifiedYes
	 */
	public void setUsrModifiedYes(boolean usrModifiedYes) {
		getUsrModifiedYesReference().setValue(usrModifiedYes);	
	}
	/**
	 * Gets the reference for attribute usrModifiedNo.
	 * @return the usrModifiedNo attribute reference
	 */
	public ConditionReference getUsrModifiedNoReference() {
		return wsUsrModified.getCondition(usrModifiedNo);	
	}

	/**
	 * Getter for usrModifiedNo attribute.
	 * @return usrModifiedNo attribute
	 */
	public boolean isUsrModifiedNo() {
		return getUsrModifiedNoReference().getValue();	
	}

	/**
	 * Setter for usrModifiedNo attribute.
	 * @param usrModifiedNo the new value of usrModifiedNo
	 */
	public void setUsrModifiedNo(boolean usrModifiedNo) {
		getUsrModifiedNoReference().setValue(usrModifiedNo);	
	}
}
