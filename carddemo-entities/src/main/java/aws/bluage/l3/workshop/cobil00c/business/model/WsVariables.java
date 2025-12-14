package aws.bluage.l3.workshop.cobil00c.business.model;

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
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.NumericEditedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity WsVariables.
<pre>
 * 
 * Legacy Documentation:<br>
 *  *****************************************************************<br>
 *   Program     : COBIL00C.CBL<br>
 *   Application : CardDemo<br>
 *   Type        : CICS COBOL Program<br>
 *   Function    : Bill Payment - Pay account balance in full and a<br>
 *                 tractionsaction for the online bill payment.<br>
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
 * <p>About 'wsTransactFile' field, <br>
 * </p>
 * 
 * <p>About 'wsAcctdatFile' field, <br>
 * </p>
 * 
 * <p>About 'wsCxacaixFile' field, <br>
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
 * <p>About 'wsConfPayFlg' field, <br>
 * </p>
 * 
 * <p>About 'confPayYes' field, <br>
 * </p>
 * 
 * <p>About 'confPayNo' field, <br>
 * </p>
 * 
 * <p>About 'wsTranAmt' field, <br>
 * </p>
 * 
 * <p>About 'wsCurrBal' field, <br>
 * </p>
 * 
 * <p>About 'wsTranIdNum' field, <br>
 * </p>
 * 
 * <p>About 'wsTranDate' field, <br>
 * </p>
 * 
 * <p>About 'wsAbsTime' field, <br>
 * </p>
 * 
 * <p>About 'wsCurDateX10' field, <br>
 * </p>
 * 
 * <p>About 'wsCurTimeX08' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsVariables extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsPgmname = new Elementary(root,new AlphanumericType(8),"COBIL00C");
	private final Elementary wsTranid = new Elementary(root,new AlphanumericType(4),"CB00");
	private final Elementary wsMessage = new Elementary(root,new AlphanumericType(80)," ");
	private final Elementary wsTransactFile = new Elementary(root,new AlphanumericType(8),"TRANSACT");
	private final Elementary wsAcctdatFile = new Elementary(root,new AlphanumericType(8),"ACCTDAT ");
	private final Elementary wsCxacaixFile = new Elementary(root,new AlphanumericType(8),"CXACAIX ");
	private final Elementary wsErrFlg = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName errFlgOn=new ConditionName(wsErrFlg,"Y");
	private final ConditionName errFlgOff=new ConditionName(wsErrFlg,"N");
	private final Elementary wsRespCd = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsReasCd = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsUsrModified = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName usrModifiedYes=new ConditionName(wsUsrModified,"Y");
	private final ConditionName usrModifiedNo=new ConditionName(wsUsrModified,"N");
	private final Elementary wsConfPayFlg = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName confPayYes=new ConditionName(wsConfPayFlg,"Y");
	private final ConditionName confPayNo=new ConditionName(wsConfPayFlg,"N");
	private final Elementary wsTranAmt = new Elementary(root,new NumericEditedType("+99999999.99"));
	private final Elementary wsCurrBal = new Elementary(root,new NumericEditedType("+9999999999.99"));
	private final Elementary wsTranIdNum = new Elementary(root,new ZonedType(16, 0, false),new BigDecimal("0"));
	private final Elementary wsTranDate = new Elementary(root,new AlphanumericType(8),"00/00/00");
	private final Elementary wsAbsTime = new Elementary(root,new PackedType(15, 0, false, false, true),new BigDecimal("0"));
	private final Elementary wsCurDateX10 = new Elementary(root,new AlphanumericType(10)," ");
	private final Elementary wsCurTimeX08 = new Elementary(root,new AlphanumericType(8)," ");
	

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
	 * Gets the reference for attribute wsTransactFile.
	 * @return the wsTransactFile attribute reference
	 */
	public ElementaryRangeReference getWsTransactFileReference() {
		return wsTransactFile.getReference();
	}

	/**
	 * Getter for wsTransactFile attribute.
	 * @return wsTransactFile attribute
	 */
	public String getWsTransactFile() {
		return wsTransactFile.getValue();
	}

	/**
	 * Setter for wsTransactFile attribute.
	 * @param wsTransactFile the new value of wsTransactFile
	 */
	public void setWsTransactFile(String wsTransactFile) {
		this.wsTransactFile.setValue(wsTransactFile);
	}
	/**
	 * Gets the reference for attribute wsAcctdatFile.
	 * @return the wsAcctdatFile attribute reference
	 */
	public ElementaryRangeReference getWsAcctdatFileReference() {
		return wsAcctdatFile.getReference();
	}

	/**
	 * Getter for wsAcctdatFile attribute.
	 * @return wsAcctdatFile attribute
	 */
	public String getWsAcctdatFile() {
		return wsAcctdatFile.getValue();
	}

	/**
	 * Setter for wsAcctdatFile attribute.
	 * @param wsAcctdatFile the new value of wsAcctdatFile
	 */
	public void setWsAcctdatFile(String wsAcctdatFile) {
		this.wsAcctdatFile.setValue(wsAcctdatFile);
	}
	/**
	 * Gets the reference for attribute wsCxacaixFile.
	 * @return the wsCxacaixFile attribute reference
	 */
	public ElementaryRangeReference getWsCxacaixFileReference() {
		return wsCxacaixFile.getReference();
	}

	/**
	 * Getter for wsCxacaixFile attribute.
	 * @return wsCxacaixFile attribute
	 */
	public String getWsCxacaixFile() {
		return wsCxacaixFile.getValue();
	}

	/**
	 * Setter for wsCxacaixFile attribute.
	 * @param wsCxacaixFile the new value of wsCxacaixFile
	 */
	public void setWsCxacaixFile(String wsCxacaixFile) {
		this.wsCxacaixFile.setValue(wsCxacaixFile);
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
	/**
	 * Gets the reference for attribute wsConfPayFlg.
	 * @return the wsConfPayFlg attribute reference
	 */
	public ElementaryRangeReference getWsConfPayFlgReference() {
		return wsConfPayFlg.getReference();
	}

	/**
	 * Getter for wsConfPayFlg attribute.
	 * @return wsConfPayFlg attribute
	 */
	public String getWsConfPayFlg() {
		return wsConfPayFlg.getValue();
	}

	/**
	 * Setter for wsConfPayFlg attribute.
	 * @param wsConfPayFlg the new value of wsConfPayFlg
	 */
	public void setWsConfPayFlg(String wsConfPayFlg) {
		this.wsConfPayFlg.setValue(wsConfPayFlg);
	}
	/**
	 * Gets the reference for attribute confPayYes.
	 * @return the confPayYes attribute reference
	 */
	public ConditionReference getConfPayYesReference() {
		return wsConfPayFlg.getCondition(confPayYes);	
	}

	/**
	 * Getter for confPayYes attribute.
	 * @return confPayYes attribute
	 */
	public boolean isConfPayYes() {
		return getConfPayYesReference().getValue();	
	}

	/**
	 * Setter for confPayYes attribute.
	 * @param confPayYes the new value of confPayYes
	 */
	public void setConfPayYes(boolean confPayYes) {
		getConfPayYesReference().setValue(confPayYes);	
	}
	/**
	 * Gets the reference for attribute confPayNo.
	 * @return the confPayNo attribute reference
	 */
	public ConditionReference getConfPayNoReference() {
		return wsConfPayFlg.getCondition(confPayNo);	
	}

	/**
	 * Getter for confPayNo attribute.
	 * @return confPayNo attribute
	 */
	public boolean isConfPayNo() {
		return getConfPayNoReference().getValue();	
	}

	/**
	 * Setter for confPayNo attribute.
	 * @param confPayNo the new value of confPayNo
	 */
	public void setConfPayNo(boolean confPayNo) {
		getConfPayNoReference().setValue(confPayNo);	
	}
	/**
	 * Gets the reference for attribute wsTranAmt.
	 * @return the wsTranAmt attribute reference
	 */
	public ElementaryRangeReference getWsTranAmtReference() {
		return wsTranAmt.getReference();
	}

	/**
	 * Getter for wsTranAmt attribute.
	 * @return wsTranAmt attribute
	 */
	public String getWsTranAmt() {
		return wsTranAmt.getValue();
	}

	/**
	 * Setter for wsTranAmt attribute.
	 * @param wsTranAmt the new value of wsTranAmt
	 */
	public void setWsTranAmt(String wsTranAmt) {
		this.wsTranAmt.setValue(wsTranAmt);
	}
	/**
	 * Gets the reference for attribute wsCurrBal.
	 * @return the wsCurrBal attribute reference
	 */
	public ElementaryRangeReference getWsCurrBalReference() {
		return wsCurrBal.getReference();
	}

	/**
	 * Getter for wsCurrBal attribute.
	 * @return wsCurrBal attribute
	 */
	public String getWsCurrBal() {
		return wsCurrBal.getValue();
	}

	/**
	 * Setter for wsCurrBal attribute.
	 * @param wsCurrBal the new value of wsCurrBal
	 */
	public void setWsCurrBal(String wsCurrBal) {
		this.wsCurrBal.setValue(wsCurrBal);
	}
	/**
	 * Gets the reference for attribute wsTranIdNum.
	 * @return the wsTranIdNum attribute reference
	 */
	public ElementaryRangeReference getWsTranIdNumReference() {
		return wsTranIdNum.getReference();
	}

	/**
	 * Getter for wsTranIdNum attribute.
	 * @return wsTranIdNum attribute
	 */
	public long getWsTranIdNum() {
		return wsTranIdNum.getValue();
	}

	/**
	 * Setter for wsTranIdNum attribute.
	 * @param wsTranIdNum the new value of wsTranIdNum
	 */
	public void setWsTranIdNum(long wsTranIdNum) {
		this.wsTranIdNum.setValue(wsTranIdNum);
	}
	/**
	 * Gets the reference for attribute wsTranDate.
	 * @return the wsTranDate attribute reference
	 */
	public ElementaryRangeReference getWsTranDateReference() {
		return wsTranDate.getReference();
	}

	/**
	 * Getter for wsTranDate attribute.
	 * @return wsTranDate attribute
	 */
	public String getWsTranDate() {
		return wsTranDate.getValue();
	}

	/**
	 * Setter for wsTranDate attribute.
	 * @param wsTranDate the new value of wsTranDate
	 */
	public void setWsTranDate(String wsTranDate) {
		this.wsTranDate.setValue(wsTranDate);
	}
	/**
	 * Gets the reference for attribute wsAbsTime.
	 * @return the wsAbsTime attribute reference
	 */
	public ElementaryRangeReference getWsAbsTimeReference() {
		return wsAbsTime.getReference();
	}

	/**
	 * Getter for wsAbsTime attribute.
	 * @return wsAbsTime attribute
	 */
	public long getWsAbsTime() {
		return wsAbsTime.getValue();
	}

	/**
	 * Setter for wsAbsTime attribute.
	 * @param wsAbsTime the new value of wsAbsTime
	 */
	public void setWsAbsTime(long wsAbsTime) {
		this.wsAbsTime.setValue(wsAbsTime);
	}
	/**
	 * Gets the reference for attribute wsCurDateX10.
	 * @return the wsCurDateX10 attribute reference
	 */
	public ElementaryRangeReference getWsCurDateX10Reference() {
		return wsCurDateX10.getReference();
	}

	/**
	 * Getter for wsCurDateX10 attribute.
	 * @return wsCurDateX10 attribute
	 */
	public String getWsCurDateX10() {
		return wsCurDateX10.getValue();
	}

	/**
	 * Setter for wsCurDateX10 attribute.
	 * @param wsCurDateX10 the new value of wsCurDateX10
	 */
	public void setWsCurDateX10(String wsCurDateX10) {
		this.wsCurDateX10.setValue(wsCurDateX10);
	}
	/**
	 * Gets the reference for attribute wsCurTimeX08.
	 * @return the wsCurTimeX08 attribute reference
	 */
	public ElementaryRangeReference getWsCurTimeX08Reference() {
		return wsCurTimeX08.getReference();
	}

	/**
	 * Getter for wsCurTimeX08 attribute.
	 * @return wsCurTimeX08 attribute
	 */
	public String getWsCurTimeX08() {
		return wsCurTimeX08.getValue();
	}

	/**
	 * Setter for wsCurTimeX08 attribute.
	 * @param wsCurTimeX08 the new value of wsCurTimeX08
	 */
	public void setWsCurTimeX08(String wsCurTimeX08) {
		this.wsCurTimeX08.setValue(wsCurTimeX08);
	}
}
