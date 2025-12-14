package aws.bluage.l3.workshop.cotrn02c.business.model;

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
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity WsVariables.
<pre>
 * 
 * Legacy Documentation:<br>
 *  *****************************************************************<br>
 *   Program     : COTRN02C.CBL<br>
 *   Application : CardDemo<br>
 *   Type        : CICS COBOL Program<br>
 *   Function    : Add a new Transaction to TRANSACT file<br>
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
 * <p>About 'wsCcxrefFile' field, <br>
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
 * <p>About 'wsTranAmt' field, <br>
 * </p>
 * 
 * <p>About 'wsTranDate' field, <br>
 * </p>
 * 
 * <p>About 'wsAcctIdN' field, <br>
 * </p>
 * 
 * <p>About 'wsCardNumN' field, <br>
 * </p>
 * 
 * <p>About 'wsTranIdN' field, <br>
 * </p>
 * 
 * <p>About 'wsTranAmtN' field, <br>
 * </p>
 * 
 * <p>About 'wsTranAmtE' field, <br>
 * </p>
 * 
 * <p>About 'wsDateFormat' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsVariables extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsPgmname = new Elementary(root,new AlphanumericType(8),"COTRN02C");
	private final Elementary wsTranid = new Elementary(root,new AlphanumericType(4),"CT02");
	private final Elementary wsMessage = new Elementary(root,new AlphanumericType(80)," ");
	private final Elementary wsTransactFile = new Elementary(root,new AlphanumericType(8),"TRANSACT");
	private final Elementary wsAcctdatFile = new Elementary(root,new AlphanumericType(8),"ACCTDAT ");
	private final Elementary wsCcxrefFile = new Elementary(root,new AlphanumericType(8),"CCXREF  ");
	private final Elementary wsCxacaixFile = new Elementary(root,new AlphanumericType(8),"CXACAIX ");
	private final Elementary wsErrFlg = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName errFlgOn=new ConditionName(wsErrFlg,"Y");
	private final ConditionName errFlgOff=new ConditionName(wsErrFlg,"N");
	private final Elementary wsRespCd = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsReasCd = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsUsrModified = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName usrModifiedYes=new ConditionName(wsUsrModified,"Y");
	private final ConditionName usrModifiedNo=new ConditionName(wsUsrModified,"N");
	private final Elementary wsTranAmt = new Elementary(root,new NumericEditedType("+99999999.99"));
	private final Elementary wsTranDate = new Elementary(root,new AlphanumericType(8),"00/00/00");
	private final Elementary wsAcctIdN = new Elementary(root,new ZonedType(11, 0, false),new BigDecimal("0"));
	private final Elementary wsCardNumN = new Elementary(root,new ZonedType(16, 0, false),new BigDecimal("0"));
	private final Elementary wsTranIdN = new Elementary(root,new ZonedType(16, 0, false),new BigDecimal("0"));
	private final Elementary wsTranAmtN = new Elementary(root,new ZonedType(9, 2, false, false, true),new BigDecimal("0"));
	private final Elementary wsTranAmtE = new Elementary(root,new NumericEditedType("+99999999.99"),"000000000000");
	private final Elementary wsDateFormat = new Elementary(root,new AlphanumericType(10),"YYYY-MM-DD");
	

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
	 * Gets the reference for attribute wsCcxrefFile.
	 * @return the wsCcxrefFile attribute reference
	 */
	public ElementaryRangeReference getWsCcxrefFileReference() {
		return wsCcxrefFile.getReference();
	}

	/**
	 * Getter for wsCcxrefFile attribute.
	 * @return wsCcxrefFile attribute
	 */
	public String getWsCcxrefFile() {
		return wsCcxrefFile.getValue();
	}

	/**
	 * Setter for wsCcxrefFile attribute.
	 * @param wsCcxrefFile the new value of wsCcxrefFile
	 */
	public void setWsCcxrefFile(String wsCcxrefFile) {
		this.wsCcxrefFile.setValue(wsCcxrefFile);
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
	 * Gets the reference for attribute wsAcctIdN.
	 * @return the wsAcctIdN attribute reference
	 */
	public ElementaryRangeReference getWsAcctIdNReference() {
		return wsAcctIdN.getReference();
	}

	/**
	 * Getter for wsAcctIdN attribute.
	 * @return wsAcctIdN attribute
	 */
	public long getWsAcctIdN() {
		return wsAcctIdN.getValue();
	}

	/**
	 * Setter for wsAcctIdN attribute.
	 * @param wsAcctIdN the new value of wsAcctIdN
	 */
	public void setWsAcctIdN(long wsAcctIdN) {
		this.wsAcctIdN.setValue(wsAcctIdN);
	}
	/**
	 * Gets the reference for attribute wsCardNumN.
	 * @return the wsCardNumN attribute reference
	 */
	public ElementaryRangeReference getWsCardNumNReference() {
		return wsCardNumN.getReference();
	}

	/**
	 * Getter for wsCardNumN attribute.
	 * @return wsCardNumN attribute
	 */
	public long getWsCardNumN() {
		return wsCardNumN.getValue();
	}

	/**
	 * Setter for wsCardNumN attribute.
	 * @param wsCardNumN the new value of wsCardNumN
	 */
	public void setWsCardNumN(long wsCardNumN) {
		this.wsCardNumN.setValue(wsCardNumN);
	}
	/**
	 * Gets the reference for attribute wsTranIdN.
	 * @return the wsTranIdN attribute reference
	 */
	public ElementaryRangeReference getWsTranIdNReference() {
		return wsTranIdN.getReference();
	}

	/**
	 * Getter for wsTranIdN attribute.
	 * @return wsTranIdN attribute
	 */
	public long getWsTranIdN() {
		return wsTranIdN.getValue();
	}

	/**
	 * Setter for wsTranIdN attribute.
	 * @param wsTranIdN the new value of wsTranIdN
	 */
	public void setWsTranIdN(long wsTranIdN) {
		this.wsTranIdN.setValue(wsTranIdN);
	}
	/**
	 * Gets the reference for attribute wsTranAmtN.
	 * @return the wsTranAmtN attribute reference
	 */
	public ElementaryRangeReference getWsTranAmtNReference() {
		return wsTranAmtN.getReference();
	}

	/**
	 * Getter for wsTranAmtN attribute.
	 * @return wsTranAmtN attribute
	 */
	public BigDecimal getWsTranAmtN() {
		return wsTranAmtN.getValue();
	}

	/**
	 * Setter for wsTranAmtN attribute.
	 * @param wsTranAmtN the new value of wsTranAmtN
	 */
	public void setWsTranAmtN(BigDecimal wsTranAmtN) {
		this.wsTranAmtN.setValue(wsTranAmtN);
	}
	/**
	 * Gets the reference for attribute wsTranAmtE.
	 * @return the wsTranAmtE attribute reference
	 */
	public ElementaryRangeReference getWsTranAmtEReference() {
		return wsTranAmtE.getReference();
	}

	/**
	 * Getter for wsTranAmtE attribute.
	 * @return wsTranAmtE attribute
	 */
	public String getWsTranAmtE() {
		return wsTranAmtE.getValue();
	}

	/**
	 * Setter for wsTranAmtE attribute.
	 * @param wsTranAmtE the new value of wsTranAmtE
	 */
	public void setWsTranAmtE(String wsTranAmtE) {
		this.wsTranAmtE.setValue(wsTranAmtE);
	}
	/**
	 * Gets the reference for attribute wsDateFormat.
	 * @return the wsDateFormat attribute reference
	 */
	public ElementaryRangeReference getWsDateFormatReference() {
		return wsDateFormat.getReference();
	}

	/**
	 * Getter for wsDateFormat attribute.
	 * @return wsDateFormat attribute
	 */
	public String getWsDateFormat() {
		return wsDateFormat.getValue();
	}

	/**
	 * Setter for wsDateFormat attribute.
	 * @param wsDateFormat the new value of wsDateFormat
	 */
	public void setWsDateFormat(String wsDateFormat) {
		this.wsDateFormat.setValue(wsDateFormat);
	}
}
