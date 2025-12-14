package aws.bluage.l3.workshop.corpt00c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.NumericEditedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity WsVariables.
<pre>
 * 
 * Legacy Documentation:<br>
 *  *****************************************************************<br>
 *   Program     : CORPT00C.CBL<br>
 *   Application : CardDemo<br>
 *   Type        : CICS COBOL Program<br>
 *   Function    : Print Transaction reports by submitting batch<br>
 *                 job from online using extra partition TDQ.<br>
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
 * <p>About 'wsErrFlg' field, <br>
 * </p>
 * 
 * <p>About 'errFlgOn' field, <br>
 * </p>
 * 
 * <p>About 'errFlgOff' field, <br>
 * </p>
 * 
 * <p>About 'wsTransactEof' field, <br>
 * </p>
 * 
 * <p>About 'transactEof' field, <br>
 * </p>
 * 
 * <p>About 'transactNotEof' field, <br>
 * </p>
 * 
 * <p>About 'wsSendEraseFlg' field, <br>
 * </p>
 * 
 * <p>About 'sendEraseYes' field, <br>
 * </p>
 * 
 * <p>About 'sendEraseNo' field, <br>
 * </p>
 * 
 * <p>About 'wsEndLoop' field, <br>
 * </p>
 * 
 * <p>About 'endLoopYes' field, <br>
 * </p>
 * 
 * <p>About 'endLoopNo' field, <br>
 * </p>
 * 
 * <p>About 'wsRespCd' field, <br>
 * </p>
 * 
 * <p>About 'wsReasCd' field, <br>
 * </p>
 * 
 * <p>About 'wsRecCount' field, <br>
 * </p>
 * 
 * <p>About 'wsIdx' field, <br>
 * </p>
 * 
 * <p>About 'wsReportName' field, <br>
 * </p>
 * 
 * <p>About 'wsStartDate' field, <br>uml entity: aws.bluage.l3.workshop.corpt00c.business.model.WsStartDate
 * <br></p>
 * 
 * <p>About 'wsEndDate' field, <br>uml entity: aws.bluage.l3.workshop.corpt00c.business.model.WsEndDate
 * <br></p>
 * 
 * <p>About 'wsDateFormat' field, <br>
 * </p>
 * 
 * <p>About 'wsNum99' field, <br>
 * </p>
 * 
 * <p>About 'wsNum9999' field, <br>
 * </p>
 * 
 * <p>About 'wsTranAmt' field, <br>
 * </p>
 * 
 * <p>About 'wsTranDate' field, <br>
 * </p>
 * 
 * <p>About 'jclRecord' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsVariables extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsPgmname = new Elementary(root,new AlphanumericType(8),"CORPT00C");
	private final Elementary wsTranid = new Elementary(root,new AlphanumericType(4),"CR00");
	private final Elementary wsMessage = new Elementary(root,new AlphanumericType(80)," ");
	private final Elementary wsTransactFile = new Elementary(root,new AlphanumericType(8),"TRANSACT");
	private final Elementary wsErrFlg = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName errFlgOn=new ConditionName(wsErrFlg,"Y");
	private final ConditionName errFlgOff=new ConditionName(wsErrFlg,"N");
	private final Elementary wsTransactEof = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName transactEof=new ConditionName(wsTransactEof,"Y");
	private final ConditionName transactNotEof=new ConditionName(wsTransactEof,"N");
	private final Elementary wsSendEraseFlg = new Elementary(root,new AlphanumericType(1),"Y");
	private final ConditionName sendEraseYes=new ConditionName(wsSendEraseFlg,"Y");
	private final ConditionName sendEraseNo=new ConditionName(wsSendEraseFlg,"N");
	private final Elementary wsEndLoop = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName endLoopYes=new ConditionName(wsEndLoop,"Y");
	private final ConditionName endLoopNo=new ConditionName(wsEndLoop,"N");
	private final Elementary wsRespCd = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsReasCd = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsRecCount = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("0"));
	private final Elementary wsIdx = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("0"));
	private final Elementary wsReportName = new Elementary(root,new AlphanumericType(10)," ");
	private final Group wsStartDate = new Group(root);
	private final Elementary wsStartDateYyyy = new Elementary(wsStartDate,new AlphanumericType(4)," ");
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(wsStartDate,new AlphanumericType(1),"-");
	private final Elementary wsStartDateMm = new Elementary(wsStartDate,new AlphanumericType(2)," ");
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(wsStartDate,new AlphanumericType(1),"-");
	private final Elementary wsStartDateDd = new Elementary(wsStartDate,new AlphanumericType(2)," ");
	private final Group wsEndDate = new Group(root);
	private final Elementary wsEndDateYyyy = new Elementary(wsEndDate,new AlphanumericType(4)," ");
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(wsEndDate,new AlphanumericType(1),"-");
	private final Elementary wsEndDateMm = new Elementary(wsEndDate,new AlphanumericType(2)," ");
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(wsEndDate,new AlphanumericType(1),"-");
	private final Elementary wsEndDateDd = new Elementary(wsEndDate,new AlphanumericType(2)," ");
	private final Elementary wsDateFormat = new Elementary(root,new AlphanumericType(10),"YYYY-MM-DD");
	private final Elementary wsNum99 = new Elementary(root,new ZonedType(2, 0, false),Short.valueOf("0"));
	private final Elementary wsNum9999 = new Elementary(root,new ZonedType(4, 0, false),Short.valueOf("0"));
	private final Elementary wsTranAmt = new Elementary(root,new NumericEditedType("+99999999.99"));
	private final Elementary wsTranDate = new Elementary(root,new AlphanumericType(8),"00/00/00");
	private final Elementary jclRecord = new Elementary(root,new AlphanumericType(80)," ");
	

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
	 * Gets the reference for attribute wsTransactEof.
	 * @return the wsTransactEof attribute reference
	 */
	public ElementaryRangeReference getWsTransactEofReference() {
		return wsTransactEof.getReference();
	}

	/**
	 * Getter for wsTransactEof attribute.
	 * @return wsTransactEof attribute
	 */
	public String getWsTransactEof() {
		return wsTransactEof.getValue();
	}

	/**
	 * Setter for wsTransactEof attribute.
	 * @param wsTransactEof the new value of wsTransactEof
	 */
	public void setWsTransactEof(String wsTransactEof) {
		this.wsTransactEof.setValue(wsTransactEof);
	}
	/**
	 * Gets the reference for attribute transactEof.
	 * @return the transactEof attribute reference
	 */
	public ConditionReference getTransactEofReference() {
		return wsTransactEof.getCondition(transactEof);	
	}

	/**
	 * Getter for transactEof attribute.
	 * @return transactEof attribute
	 */
	public boolean isTransactEof() {
		return getTransactEofReference().getValue();	
	}

	/**
	 * Setter for transactEof attribute.
	 * @param transactEof the new value of transactEof
	 */
	public void setTransactEof(boolean transactEof) {
		getTransactEofReference().setValue(transactEof);	
	}
	/**
	 * Gets the reference for attribute transactNotEof.
	 * @return the transactNotEof attribute reference
	 */
	public ConditionReference getTransactNotEofReference() {
		return wsTransactEof.getCondition(transactNotEof);	
	}

	/**
	 * Getter for transactNotEof attribute.
	 * @return transactNotEof attribute
	 */
	public boolean isTransactNotEof() {
		return getTransactNotEofReference().getValue();	
	}

	/**
	 * Setter for transactNotEof attribute.
	 * @param transactNotEof the new value of transactNotEof
	 */
	public void setTransactNotEof(boolean transactNotEof) {
		getTransactNotEofReference().setValue(transactNotEof);	
	}
	/**
	 * Gets the reference for attribute wsSendEraseFlg.
	 * @return the wsSendEraseFlg attribute reference
	 */
	public ElementaryRangeReference getWsSendEraseFlgReference() {
		return wsSendEraseFlg.getReference();
	}

	/**
	 * Getter for wsSendEraseFlg attribute.
	 * @return wsSendEraseFlg attribute
	 */
	public String getWsSendEraseFlg() {
		return wsSendEraseFlg.getValue();
	}

	/**
	 * Setter for wsSendEraseFlg attribute.
	 * @param wsSendEraseFlg the new value of wsSendEraseFlg
	 */
	public void setWsSendEraseFlg(String wsSendEraseFlg) {
		this.wsSendEraseFlg.setValue(wsSendEraseFlg);
	}
	/**
	 * Gets the reference for attribute sendEraseYes.
	 * @return the sendEraseYes attribute reference
	 */
	public ConditionReference getSendEraseYesReference() {
		return wsSendEraseFlg.getCondition(sendEraseYes);	
	}

	/**
	 * Getter for sendEraseYes attribute.
	 * @return sendEraseYes attribute
	 */
	public boolean isSendEraseYes() {
		return getSendEraseYesReference().getValue();	
	}

	/**
	 * Setter for sendEraseYes attribute.
	 * @param sendEraseYes the new value of sendEraseYes
	 */
	public void setSendEraseYes(boolean sendEraseYes) {
		getSendEraseYesReference().setValue(sendEraseYes);	
	}
	/**
	 * Gets the reference for attribute sendEraseNo.
	 * @return the sendEraseNo attribute reference
	 */
	public ConditionReference getSendEraseNoReference() {
		return wsSendEraseFlg.getCondition(sendEraseNo);	
	}

	/**
	 * Getter for sendEraseNo attribute.
	 * @return sendEraseNo attribute
	 */
	public boolean isSendEraseNo() {
		return getSendEraseNoReference().getValue();	
	}

	/**
	 * Setter for sendEraseNo attribute.
	 * @param sendEraseNo the new value of sendEraseNo
	 */
	public void setSendEraseNo(boolean sendEraseNo) {
		getSendEraseNoReference().setValue(sendEraseNo);	
	}
	/**
	 * Gets the reference for attribute wsEndLoop.
	 * @return the wsEndLoop attribute reference
	 */
	public ElementaryRangeReference getWsEndLoopReference() {
		return wsEndLoop.getReference();
	}

	/**
	 * Getter for wsEndLoop attribute.
	 * @return wsEndLoop attribute
	 */
	public String getWsEndLoop() {
		return wsEndLoop.getValue();
	}

	/**
	 * Setter for wsEndLoop attribute.
	 * @param wsEndLoop the new value of wsEndLoop
	 */
	public void setWsEndLoop(String wsEndLoop) {
		this.wsEndLoop.setValue(wsEndLoop);
	}
	/**
	 * Gets the reference for attribute endLoopYes.
	 * @return the endLoopYes attribute reference
	 */
	public ConditionReference getEndLoopYesReference() {
		return wsEndLoop.getCondition(endLoopYes);	
	}

	/**
	 * Getter for endLoopYes attribute.
	 * @return endLoopYes attribute
	 */
	public boolean isEndLoopYes() {
		return getEndLoopYesReference().getValue();	
	}

	/**
	 * Setter for endLoopYes attribute.
	 * @param endLoopYes the new value of endLoopYes
	 */
	public void setEndLoopYes(boolean endLoopYes) {
		getEndLoopYesReference().setValue(endLoopYes);	
	}
	/**
	 * Gets the reference for attribute endLoopNo.
	 * @return the endLoopNo attribute reference
	 */
	public ConditionReference getEndLoopNoReference() {
		return wsEndLoop.getCondition(endLoopNo);	
	}

	/**
	 * Getter for endLoopNo attribute.
	 * @return endLoopNo attribute
	 */
	public boolean isEndLoopNo() {
		return getEndLoopNoReference().getValue();	
	}

	/**
	 * Setter for endLoopNo attribute.
	 * @param endLoopNo the new value of endLoopNo
	 */
	public void setEndLoopNo(boolean endLoopNo) {
		getEndLoopNoReference().setValue(endLoopNo);	
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
	 * Gets the reference for attribute wsRecCount.
	 * @return the wsRecCount attribute reference
	 */
	public ElementaryRangeReference getWsRecCountReference() {
		return wsRecCount.getReference();
	}

	/**
	 * Getter for wsRecCount attribute.
	 * @return wsRecCount attribute
	 */
	public int getWsRecCount() {
		return wsRecCount.getValue();
	}

	/**
	 * Setter for wsRecCount attribute.
	 * @param wsRecCount the new value of wsRecCount
	 */
	public void setWsRecCount(int wsRecCount) {
		this.wsRecCount.setValue(wsRecCount);
	}
	/**
	 * Gets the reference for attribute wsIdx.
	 * @return the wsIdx attribute reference
	 */
	public ElementaryRangeReference getWsIdxReference() {
		return wsIdx.getReference();
	}

	/**
	 * Getter for wsIdx attribute.
	 * @return wsIdx attribute
	 */
	public int getWsIdx() {
		return wsIdx.getValue();
	}

	/**
	 * Setter for wsIdx attribute.
	 * @param wsIdx the new value of wsIdx
	 */
	public void setWsIdx(int wsIdx) {
		this.wsIdx.setValue(wsIdx);
	}
	/**
	 * Gets the reference for attribute wsReportName.
	 * @return the wsReportName attribute reference
	 */
	public ElementaryRangeReference getWsReportNameReference() {
		return wsReportName.getReference();
	}

	/**
	 * Getter for wsReportName attribute.
	 * @return wsReportName attribute
	 */
	public String getWsReportName() {
		return wsReportName.getValue();
	}

	/**
	 * Setter for wsReportName attribute.
	 * @param wsReportName the new value of wsReportName
	 */
	public void setWsReportName(String wsReportName) {
		this.wsReportName.setValue(wsReportName);
	}
	
	/**
	 * Gets the reference for attribute wsStartDate.
	 * @return the wsStartDate attribute reference
	 */
	public RangeReference getWsStartDateReference() {
		return wsStartDate.getReference();
	}	
				
	/**
	 * Setter for wsStartDate .
	 */
   	public void setWsStartDate(RangeReference reference) {
       	wsStartDate.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsStartDateYyyy.
	 * @return the wsStartDateYyyy attribute reference
	 */
	public ElementaryRangeReference getWsStartDateYyyyReference() {
		return wsStartDateYyyy.getReference();
	}

	/**
	 * Getter for wsStartDateYyyy attribute.
	 * @return wsStartDateYyyy attribute
	 */
	public String getWsStartDateYyyy() {
		return wsStartDateYyyy.getValue();
	}

	/**
	 * Setter for wsStartDateYyyy attribute.
	 * @param wsStartDateYyyy the new value of wsStartDateYyyy
	 */
	public void setWsStartDateYyyy(String wsStartDateYyyy) {
		this.wsStartDateYyyy.setValue(wsStartDateYyyy);
	}
	/**
	 * Gets the reference for attribute wsStartDateMm.
	 * @return the wsStartDateMm attribute reference
	 */
	public ElementaryRangeReference getWsStartDateMmReference() {
		return wsStartDateMm.getReference();
	}

	/**
	 * Getter for wsStartDateMm attribute.
	 * @return wsStartDateMm attribute
	 */
	public String getWsStartDateMm() {
		return wsStartDateMm.getValue();
	}

	/**
	 * Setter for wsStartDateMm attribute.
	 * @param wsStartDateMm the new value of wsStartDateMm
	 */
	public void setWsStartDateMm(String wsStartDateMm) {
		this.wsStartDateMm.setValue(wsStartDateMm);
	}
	/**
	 * Gets the reference for attribute wsStartDateDd.
	 * @return the wsStartDateDd attribute reference
	 */
	public ElementaryRangeReference getWsStartDateDdReference() {
		return wsStartDateDd.getReference();
	}

	/**
	 * Getter for wsStartDateDd attribute.
	 * @return wsStartDateDd attribute
	 */
	public String getWsStartDateDd() {
		return wsStartDateDd.getValue();
	}

	/**
	 * Setter for wsStartDateDd attribute.
	 * @param wsStartDateDd the new value of wsStartDateDd
	 */
	public void setWsStartDateDd(String wsStartDateDd) {
		this.wsStartDateDd.setValue(wsStartDateDd);
	}
	
	/**
	 * Gets the reference for attribute wsEndDate.
	 * @return the wsEndDate attribute reference
	 */
	public RangeReference getWsEndDateReference() {
		return wsEndDate.getReference();
	}	
				
	/**
	 * Setter for wsEndDate .
	 */
   	public void setWsEndDate(RangeReference reference) {
       	wsEndDate.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEndDateYyyy.
	 * @return the wsEndDateYyyy attribute reference
	 */
	public ElementaryRangeReference getWsEndDateYyyyReference() {
		return wsEndDateYyyy.getReference();
	}

	/**
	 * Getter for wsEndDateYyyy attribute.
	 * @return wsEndDateYyyy attribute
	 */
	public String getWsEndDateYyyy() {
		return wsEndDateYyyy.getValue();
	}

	/**
	 * Setter for wsEndDateYyyy attribute.
	 * @param wsEndDateYyyy the new value of wsEndDateYyyy
	 */
	public void setWsEndDateYyyy(String wsEndDateYyyy) {
		this.wsEndDateYyyy.setValue(wsEndDateYyyy);
	}
	/**
	 * Gets the reference for attribute wsEndDateMm.
	 * @return the wsEndDateMm attribute reference
	 */
	public ElementaryRangeReference getWsEndDateMmReference() {
		return wsEndDateMm.getReference();
	}

	/**
	 * Getter for wsEndDateMm attribute.
	 * @return wsEndDateMm attribute
	 */
	public String getWsEndDateMm() {
		return wsEndDateMm.getValue();
	}

	/**
	 * Setter for wsEndDateMm attribute.
	 * @param wsEndDateMm the new value of wsEndDateMm
	 */
	public void setWsEndDateMm(String wsEndDateMm) {
		this.wsEndDateMm.setValue(wsEndDateMm);
	}
	/**
	 * Gets the reference for attribute wsEndDateDd.
	 * @return the wsEndDateDd attribute reference
	 */
	public ElementaryRangeReference getWsEndDateDdReference() {
		return wsEndDateDd.getReference();
	}

	/**
	 * Getter for wsEndDateDd attribute.
	 * @return wsEndDateDd attribute
	 */
	public String getWsEndDateDd() {
		return wsEndDateDd.getValue();
	}

	/**
	 * Setter for wsEndDateDd attribute.
	 * @param wsEndDateDd the new value of wsEndDateDd
	 */
	public void setWsEndDateDd(String wsEndDateDd) {
		this.wsEndDateDd.setValue(wsEndDateDd);
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
	/**
	 * Gets the reference for attribute wsNum99.
	 * @return the wsNum99 attribute reference
	 */
	public ElementaryRangeReference getWsNum99Reference() {
		return wsNum99.getReference();
	}

	/**
	 * Getter for wsNum99 attribute.
	 * @return wsNum99 attribute
	 */
	public int getWsNum99() {
		return wsNum99.getValue();
	}

	/**
	 * Setter for wsNum99 attribute.
	 * @param wsNum99 the new value of wsNum99
	 */
	public void setWsNum99(int wsNum99) {
		this.wsNum99.setValue(wsNum99);
	}
	/**
	 * Gets the reference for attribute wsNum9999.
	 * @return the wsNum9999 attribute reference
	 */
	public ElementaryRangeReference getWsNum9999Reference() {
		return wsNum9999.getReference();
	}

	/**
	 * Getter for wsNum9999 attribute.
	 * @return wsNum9999 attribute
	 */
	public int getWsNum9999() {
		return wsNum9999.getValue();
	}

	/**
	 * Setter for wsNum9999 attribute.
	 * @param wsNum9999 the new value of wsNum9999
	 */
	public void setWsNum9999(int wsNum9999) {
		this.wsNum9999.setValue(wsNum9999);
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
	 * Gets the reference for attribute jclRecord.
	 * @return the jclRecord attribute reference
	 */
	public ElementaryRangeReference getJclRecordReference() {
		return jclRecord.getReference();
	}

	/**
	 * Getter for jclRecord attribute.
	 * @return jclRecord attribute
	 */
	public String getJclRecord() {
		return jclRecord.getValue();
	}

	/**
	 * Setter for jclRecord attribute.
	 * @param jclRecord the new value of jclRecord
	 */
	public void setJclRecord(String jclRecord) {
		this.jclRecord.setValue(jclRecord);
	}
}
