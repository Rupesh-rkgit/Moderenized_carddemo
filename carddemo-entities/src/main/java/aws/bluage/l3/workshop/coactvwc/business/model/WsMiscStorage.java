package aws.bluage.l3.workshop.coactvwc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity WsMiscStorage.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *   Program:     COACTVWC.CBL                                     *<br>
 *   Layer:       Business logic                                   *<br>
 *   Function:    Accept and process Account View request          *<br>
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
</pre>
 * 
 * <p>About 'wsCicsProcessngVars' field, <br>uml entity: aws.bluage.l3.workshop.coactvwc.business.model.WsCicsProcessngVars
 * <br></p>
 * 
 * <p>About 'wsInputFlag' field, <br>
 *  ****************************************************************<br>
 *        Input edits<br>
 *  ****************************************************************<br></p>
 * 
 * <p>About 'inputOk' field, <br>
 * </p>
 * 
 * <p>About 'inputError' field, <br>
 * </p>
 * 
 * <p>About 'inputPending' field, <br>
 * </p>
 * 
 * <p>About 'wsPfkFlag' field, <br>
 * </p>
 * 
 * <p>About 'pfkValid' field, <br>
 * </p>
 * 
 * <p>About 'pfkInvalid' field, <br>
 * </p>
 * 
 * <p>About 'inputPending_1' field, <br>
 * </p>
 * 
 * <p>About 'wsEditAcctFlag' field, <br>
 * </p>
 * 
 * <p>About 'flgAcctfilterNotOk' field, <br>
 * </p>
 * 
 * <p>About 'flgAcctfilterIsvalid' field, <br>
 * </p>
 * 
 * <p>About 'flgAcctfilterBlank' field, <br>
 * </p>
 * 
 * <p>About 'wsEditCustFlag' field, <br>
 * </p>
 * 
 * <p>About 'flgCustfilterNotOk' field, <br>
 * </p>
 * 
 * <p>About 'flgCustfilterIsvalid' field, <br>
 * </p>
 * 
 * <p>About 'flgCustfilterBlank' field, <br>
 * </p>
 * 
 * <p>About 'wsXrefRid' field, <br>uml entity: aws.bluage.l3.workshop.coactvwc.business.model.WsXrefRid
 * <br></p>
 * 
 * <p>About 'wsFileReadFlags' field, <br>uml entity: aws.bluage.l3.workshop.coactvwc.business.model.WsFileReadFlags
 * <br></p>
 * 
 * <p>About 'wsFileErrorMessage' field, <br>uml entity: aws.bluage.l3.workshop.coactvwc.business.model.WsFileErrorMessage
 * <br></p>
 * 
 * <p>About 'wsLongMsg' field, <br>
 *  ****************************************************************<br>
 *        Output Message Construction<br>
 *  ****************************************************************<br></p>
 * 
 * <p>About 'wsInfoMsg' field, <br>
 * </p>
 * 
 * <p>About 'wsNoInfoMessage' field, <br>
 * </p>
 * 
 * <p>About 'wsPromptForInput' field, <br>
 * </p>
 * 
 * <p>About 'wsInformOutput' field, <br>
 * </p>
 * 
 * <p>About 'wsReturnMsg' field, <br>
 * </p>
 * 
 * <p>About 'wsReturnMsgOff' field, <br>
 * </p>
 * 
 * <p>About 'wsExitMessage' field, <br>
 * </p>
 * 
 * <p>About 'wsPromptForAcct' field, <br>
 * </p>
 * 
 * <p>About 'noSearchCriteriaReceived' field, <br>
 * </p>
 * 
 * <p>About 'searchedAcctZeroes' field, <br>
 * </p>
 * 
 * <p>About 'searchedAcctNotNumeric' field, <br>
 * </p>
 * 
 * <p>About 'didNotFindAcctInCardxref' field, <br>
 * </p>
 * 
 * <p>About 'didNotFindAcctInAcctdat' field, <br>
 * </p>
 * 
 * <p>About 'didNotFindCustInCustdat' field, <br>
 * </p>
 * 
 * <p>About 'xrefReadError' field, <br>
 * </p>
 * 
 * <p>About 'codingToBeDone' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsMiscStorage extends RecordEntity {

	private final Group root = new Group(getData()); 
	
	/**
	 * ****************************************************************
	 * General CICS related
	 * ****************************************************************
	 */
	private final Group wsCicsProcessngVars = new Group(root);
	private final Elementary wsRespCd = new Elementary(wsCicsProcessngVars,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsReasCd = new Elementary(wsCicsProcessngVars,new BinaryType(9, 0, "STD", false, false, true),Integer.valueOf("0"));
	private final Elementary wsTranid = new Elementary(wsCicsProcessngVars,new AlphanumericType(4)," ");
	
	/**
	 * ****************************************************************
	 * Input edits
	 * ****************************************************************
	 */
	private final Elementary wsInputFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName inputOk=new ConditionName(wsInputFlag,"0");
	private final ConditionName inputError=new ConditionName(wsInputFlag,"1");
	private final ConditionName inputPending=new ConditionName(wsInputFlag,Record.LOW_VALUES);
	private final Elementary wsPfkFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName pfkValid=new ConditionName(wsPfkFlag,"0");
	private final ConditionName pfkInvalid=new ConditionName(wsPfkFlag,"1");
	private final ConditionName inputPending_1=new ConditionName(wsPfkFlag,Record.LOW_VALUES);
	private final Elementary wsEditAcctFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgAcctfilterNotOk=new ConditionName(wsEditAcctFlag,"0");
	private final ConditionName flgAcctfilterIsvalid=new ConditionName(wsEditAcctFlag,"1");
	private final ConditionName flgAcctfilterBlank=new ConditionName(wsEditAcctFlag," ");
	private final Elementary wsEditCustFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgCustfilterNotOk=new ConditionName(wsEditCustFlag,"0");
	private final ConditionName flgCustfilterIsvalid=new ConditionName(wsEditCustFlag,"1");
	private final ConditionName flgCustfilterBlank=new ConditionName(wsEditCustFlag," ");
	
	/**
	 * ****************************************************************
	 * Output edits
	 * ****************************************************************
	 * 05  EDIT-FIELD-9-2                PIC +ZZZ,ZZZ,ZZZ.99.
	 * ****************************************************************
	 * File and data Handling
	 * ****************************************************************
	 */
	private final Group wsXrefRid = new Group(root);
	private final Elementary wsCardRidCardnum = new Elementary(wsXrefRid,new AlphanumericType(16));
	private final Union union = new Union(wsXrefRid);
	private final Elementary wsCardRidCustId = new Elementary(union,new ZonedType(9, 0, false));
	private final Elementary wsCardRidCustIdX = new Elementary(union,new AlphanumericType(9));
	private final Union union1 = new Union(wsXrefRid);
	private final Elementary wsCardRidAcctId = new Elementary(union1,new ZonedType(11, 0, false));
	private final Elementary wsCardRidAcctIdX = new Elementary(union1,new AlphanumericType(11));
	private final Group wsFileReadFlags = new Group(root);
	private final Elementary wsAccountMasterReadFlag = new Elementary(wsFileReadFlags,new AlphanumericType(1));
	private final ConditionName foundAcctInMaster=new ConditionName(wsAccountMasterReadFlag,"1");
	private final Elementary wsCustMasterReadFlag = new Elementary(wsFileReadFlags,new AlphanumericType(1));
	private final ConditionName foundCustInMaster=new ConditionName(wsCustMasterReadFlag,"1");
	private final Group wsFileErrorMessage = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(wsFileErrorMessage,new AlphanumericType(12),"File Error: ");
	private final Elementary errorOpname = new Elementary(wsFileErrorMessage,new AlphanumericType(8)," ");
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(wsFileErrorMessage,new AlphanumericType(4)," on ");
	private final Elementary errorFile = new Elementary(wsFileErrorMessage,new AlphanumericType(9)," ");
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(wsFileErrorMessage,new AlphanumericType(15)," returned RESP ");
	private final Elementary errorResp = new Elementary(wsFileErrorMessage,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(wsFileErrorMessage,new AlphanumericType(7),",RESP2 ");
	private final Elementary errorResp2 = new Elementary(wsFileErrorMessage,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(wsFileErrorMessage,new AlphanumericType(5)," ");
	
	/**
	 * ****************************************************************
	 * Output Message Construction
	 * ****************************************************************
	 */
	private final Elementary wsLongMsg = new Elementary(root,new AlphanumericType(500));
	private final Elementary wsInfoMsg = new Elementary(root,new AlphanumericType(40));
	private final ConditionName wsNoInfoMessage=new ConditionName(wsInfoMsg," ",
	Record.LOW_VALUES);
	private final ConditionName wsPromptForInput=new ConditionName(wsInfoMsg,"Enter or update id of account to display");
	private final ConditionName wsInformOutput=new ConditionName(wsInfoMsg,"Displaying details of given Account");
	private final Elementary wsReturnMsg = new Elementary(root,new AlphanumericType(75));
	private final ConditionName wsReturnMsgOff=new ConditionName(wsReturnMsg," ");
	private final ConditionName wsExitMessage=new ConditionName(wsReturnMsg,"PF03 pressed.Exiting              ");
	private final ConditionName wsPromptForAcct=new ConditionName(wsReturnMsg,"Account number not provided");
	private final ConditionName noSearchCriteriaReceived=new ConditionName(wsReturnMsg,"No input received");
	private final ConditionName searchedAcctZeroes=new ConditionName(wsReturnMsg,"Account number must be a non zero 11 digit number");
	private final ConditionName searchedAcctNotNumeric=new ConditionName(wsReturnMsg,"Account number must be a non zero 11 digit number");
	private final ConditionName didNotFindAcctInCardxref=new ConditionName(wsReturnMsg,"Did not find this account in account card xref file");
	private final ConditionName didNotFindAcctInAcctdat=new ConditionName(wsReturnMsg,"Did not find this account in account master file");
	private final ConditionName didNotFindCustInCustdat=new ConditionName(wsReturnMsg,"Did not find associated customer in master file");
	private final ConditionName xrefReadError=new ConditionName(wsReturnMsg,"Error reading account card xref File");
	private final ConditionName codingToBeDone=new ConditionName(wsReturnMsg,"Looks Good.... so far");
	

	/**
	 * Instantiate a new WsMiscStorage with a default record.
	 * @param configuration the configuration
	 */
	public WsMiscStorage(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsMiscStorage bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsMiscStorage(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute wsCicsProcessngVars.
	 * @return the wsCicsProcessngVars attribute reference
	 */
	public RangeReference getWsCicsProcessngVarsReference() {
		return wsCicsProcessngVars.getReference();
	}	
				
	/**
	 * Setter for wsCicsProcessngVars .
	 */
   	public void setWsCicsProcessngVars(RangeReference reference) {
       	wsCicsProcessngVars.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute wsInputFlag.
	 * @return the wsInputFlag attribute reference
	 */
	public ElementaryRangeReference getWsInputFlagReference() {
		return wsInputFlag.getReference();
	}

	/**
	 * Getter for wsInputFlag attribute.
	 * @return wsInputFlag attribute
	 */
	public String getWsInputFlag() {
		return wsInputFlag.getValue();
	}

	/**
	 * Setter for wsInputFlag attribute.
	 * @param wsInputFlag the new value of wsInputFlag
	 */
	public void setWsInputFlag(String wsInputFlag) {
		this.wsInputFlag.setValue(wsInputFlag);
	}
	/**
	 * Gets the reference for attribute inputOk.
	 * @return the inputOk attribute reference
	 */
	public ConditionReference getInputOkReference() {
		return wsInputFlag.getCondition(inputOk);	
	}

	/**
	 * Getter for inputOk attribute.
	 * @return inputOk attribute
	 */
	public boolean isInputOk() {
		return getInputOkReference().getValue();	
	}

	/**
	 * Setter for inputOk attribute.
	 * @param inputOk the new value of inputOk
	 */
	public void setInputOk(boolean inputOk) {
		getInputOkReference().setValue(inputOk);	
	}
	/**
	 * Gets the reference for attribute inputError.
	 * @return the inputError attribute reference
	 */
	public ConditionReference getInputErrorReference() {
		return wsInputFlag.getCondition(inputError);	
	}

	/**
	 * Getter for inputError attribute.
	 * @return inputError attribute
	 */
	public boolean isInputError() {
		return getInputErrorReference().getValue();	
	}

	/**
	 * Setter for inputError attribute.
	 * @param inputError the new value of inputError
	 */
	public void setInputError(boolean inputError) {
		getInputErrorReference().setValue(inputError);	
	}
	/**
	 * Gets the reference for attribute inputPending.
	 * @return the inputPending attribute reference
	 */
	public ConditionReference getInputPendingReference() {
		return wsInputFlag.getCondition(inputPending);	
	}

	/**
	 * Getter for inputPending attribute.
	 * @return inputPending attribute
	 */
	public boolean isInputPending() {
		return getInputPendingReference().getValue();	
	}

	/**
	 * Setter for inputPending attribute.
	 * @param inputPending the new value of inputPending
	 */
	public void setInputPending(boolean inputPending) {
		getInputPendingReference().setValue(inputPending);	
	}
	/**
	 * Gets the reference for attribute wsPfkFlag.
	 * @return the wsPfkFlag attribute reference
	 */
	public ElementaryRangeReference getWsPfkFlagReference() {
		return wsPfkFlag.getReference();
	}

	/**
	 * Getter for wsPfkFlag attribute.
	 * @return wsPfkFlag attribute
	 */
	public String getWsPfkFlag() {
		return wsPfkFlag.getValue();
	}

	/**
	 * Setter for wsPfkFlag attribute.
	 * @param wsPfkFlag the new value of wsPfkFlag
	 */
	public void setWsPfkFlag(String wsPfkFlag) {
		this.wsPfkFlag.setValue(wsPfkFlag);
	}
	/**
	 * Gets the reference for attribute pfkValid.
	 * @return the pfkValid attribute reference
	 */
	public ConditionReference getPfkValidReference() {
		return wsPfkFlag.getCondition(pfkValid);	
	}

	/**
	 * Getter for pfkValid attribute.
	 * @return pfkValid attribute
	 */
	public boolean isPfkValid() {
		return getPfkValidReference().getValue();	
	}

	/**
	 * Setter for pfkValid attribute.
	 * @param pfkValid the new value of pfkValid
	 */
	public void setPfkValid(boolean pfkValid) {
		getPfkValidReference().setValue(pfkValid);	
	}
	/**
	 * Gets the reference for attribute pfkInvalid.
	 * @return the pfkInvalid attribute reference
	 */
	public ConditionReference getPfkInvalidReference() {
		return wsPfkFlag.getCondition(pfkInvalid);	
	}

	/**
	 * Getter for pfkInvalid attribute.
	 * @return pfkInvalid attribute
	 */
	public boolean isPfkInvalid() {
		return getPfkInvalidReference().getValue();	
	}

	/**
	 * Setter for pfkInvalid attribute.
	 * @param pfkInvalid the new value of pfkInvalid
	 */
	public void setPfkInvalid(boolean pfkInvalid) {
		getPfkInvalidReference().setValue(pfkInvalid);	
	}
	/**
	 * Gets the reference for attribute inputPending_1.
	 * @return the inputPending_1 attribute reference
	 */
	public ConditionReference getInputPending_1Reference() {
		return wsPfkFlag.getCondition(inputPending_1);	
	}

	/**
	 * Getter for inputPending_1 attribute.
	 * @return inputPending_1 attribute
	 */
	public boolean isInputPending_1() {
		return getInputPending_1Reference().getValue();	
	}

	/**
	 * Setter for inputPending_1 attribute.
	 * @param inputPending_1 the new value of inputPending_1
	 */
	public void setInputPending_1(boolean inputPending_1) {
		getInputPending_1Reference().setValue(inputPending_1);	
	}
	/**
	 * Gets the reference for attribute wsEditAcctFlag.
	 * @return the wsEditAcctFlag attribute reference
	 */
	public ElementaryRangeReference getWsEditAcctFlagReference() {
		return wsEditAcctFlag.getReference();
	}

	/**
	 * Getter for wsEditAcctFlag attribute.
	 * @return wsEditAcctFlag attribute
	 */
	public String getWsEditAcctFlag() {
		return wsEditAcctFlag.getValue();
	}

	/**
	 * Setter for wsEditAcctFlag attribute.
	 * @param wsEditAcctFlag the new value of wsEditAcctFlag
	 */
	public void setWsEditAcctFlag(String wsEditAcctFlag) {
		this.wsEditAcctFlag.setValue(wsEditAcctFlag);
	}
	/**
	 * Gets the reference for attribute flgAcctfilterNotOk.
	 * @return the flgAcctfilterNotOk attribute reference
	 */
	public ConditionReference getFlgAcctfilterNotOkReference() {
		return wsEditAcctFlag.getCondition(flgAcctfilterNotOk);	
	}

	/**
	 * Getter for flgAcctfilterNotOk attribute.
	 * @return flgAcctfilterNotOk attribute
	 */
	public boolean isFlgAcctfilterNotOk() {
		return getFlgAcctfilterNotOkReference().getValue();	
	}

	/**
	 * Setter for flgAcctfilterNotOk attribute.
	 * @param flgAcctfilterNotOk the new value of flgAcctfilterNotOk
	 */
	public void setFlgAcctfilterNotOk(boolean flgAcctfilterNotOk) {
		getFlgAcctfilterNotOkReference().setValue(flgAcctfilterNotOk);	
	}
	/**
	 * Gets the reference for attribute flgAcctfilterIsvalid.
	 * @return the flgAcctfilterIsvalid attribute reference
	 */
	public ConditionReference getFlgAcctfilterIsvalidReference() {
		return wsEditAcctFlag.getCondition(flgAcctfilterIsvalid);	
	}

	/**
	 * Getter for flgAcctfilterIsvalid attribute.
	 * @return flgAcctfilterIsvalid attribute
	 */
	public boolean isFlgAcctfilterIsvalid() {
		return getFlgAcctfilterIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgAcctfilterIsvalid attribute.
	 * @param flgAcctfilterIsvalid the new value of flgAcctfilterIsvalid
	 */
	public void setFlgAcctfilterIsvalid(boolean flgAcctfilterIsvalid) {
		getFlgAcctfilterIsvalidReference().setValue(flgAcctfilterIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgAcctfilterBlank.
	 * @return the flgAcctfilterBlank attribute reference
	 */
	public ConditionReference getFlgAcctfilterBlankReference() {
		return wsEditAcctFlag.getCondition(flgAcctfilterBlank);	
	}

	/**
	 * Getter for flgAcctfilterBlank attribute.
	 * @return flgAcctfilterBlank attribute
	 */
	public boolean isFlgAcctfilterBlank() {
		return getFlgAcctfilterBlankReference().getValue();	
	}

	/**
	 * Setter for flgAcctfilterBlank attribute.
	 * @param flgAcctfilterBlank the new value of flgAcctfilterBlank
	 */
	public void setFlgAcctfilterBlank(boolean flgAcctfilterBlank) {
		getFlgAcctfilterBlankReference().setValue(flgAcctfilterBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCustFlag.
	 * @return the wsEditCustFlag attribute reference
	 */
	public ElementaryRangeReference getWsEditCustFlagReference() {
		return wsEditCustFlag.getReference();
	}

	/**
	 * Getter for wsEditCustFlag attribute.
	 * @return wsEditCustFlag attribute
	 */
	public String getWsEditCustFlag() {
		return wsEditCustFlag.getValue();
	}

	/**
	 * Setter for wsEditCustFlag attribute.
	 * @param wsEditCustFlag the new value of wsEditCustFlag
	 */
	public void setWsEditCustFlag(String wsEditCustFlag) {
		this.wsEditCustFlag.setValue(wsEditCustFlag);
	}
	/**
	 * Gets the reference for attribute flgCustfilterNotOk.
	 * @return the flgCustfilterNotOk attribute reference
	 */
	public ConditionReference getFlgCustfilterNotOkReference() {
		return wsEditCustFlag.getCondition(flgCustfilterNotOk);	
	}

	/**
	 * Getter for flgCustfilterNotOk attribute.
	 * @return flgCustfilterNotOk attribute
	 */
	public boolean isFlgCustfilterNotOk() {
		return getFlgCustfilterNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCustfilterNotOk attribute.
	 * @param flgCustfilterNotOk the new value of flgCustfilterNotOk
	 */
	public void setFlgCustfilterNotOk(boolean flgCustfilterNotOk) {
		getFlgCustfilterNotOkReference().setValue(flgCustfilterNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCustfilterIsvalid.
	 * @return the flgCustfilterIsvalid attribute reference
	 */
	public ConditionReference getFlgCustfilterIsvalidReference() {
		return wsEditCustFlag.getCondition(flgCustfilterIsvalid);	
	}

	/**
	 * Getter for flgCustfilterIsvalid attribute.
	 * @return flgCustfilterIsvalid attribute
	 */
	public boolean isFlgCustfilterIsvalid() {
		return getFlgCustfilterIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCustfilterIsvalid attribute.
	 * @param flgCustfilterIsvalid the new value of flgCustfilterIsvalid
	 */
	public void setFlgCustfilterIsvalid(boolean flgCustfilterIsvalid) {
		getFlgCustfilterIsvalidReference().setValue(flgCustfilterIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCustfilterBlank.
	 * @return the flgCustfilterBlank attribute reference
	 */
	public ConditionReference getFlgCustfilterBlankReference() {
		return wsEditCustFlag.getCondition(flgCustfilterBlank);	
	}

	/**
	 * Getter for flgCustfilterBlank attribute.
	 * @return flgCustfilterBlank attribute
	 */
	public boolean isFlgCustfilterBlank() {
		return getFlgCustfilterBlankReference().getValue();	
	}

	/**
	 * Setter for flgCustfilterBlank attribute.
	 * @param flgCustfilterBlank the new value of flgCustfilterBlank
	 */
	public void setFlgCustfilterBlank(boolean flgCustfilterBlank) {
		getFlgCustfilterBlankReference().setValue(flgCustfilterBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsXrefRid.
	 * @return the wsXrefRid attribute reference
	 */
	public RangeReference getWsXrefRidReference() {
		return wsXrefRid.getReference();
	}	
				
	/**
	 * Setter for wsXrefRid .
	 */
   	public void setWsXrefRid(RangeReference reference) {
       	wsXrefRid.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsCardRidCardnum.
	 * @return the wsCardRidCardnum attribute reference
	 */
	public ElementaryRangeReference getWsCardRidCardnumReference() {
		return wsCardRidCardnum.getReference();
	}

	/**
	 * Getter for wsCardRidCardnum attribute.
	 * @return wsCardRidCardnum attribute
	 */
	public String getWsCardRidCardnum() {
		return wsCardRidCardnum.getValue();
	}

	/**
	 * Setter for wsCardRidCardnum attribute.
	 * @param wsCardRidCardnum the new value of wsCardRidCardnum
	 */
	public void setWsCardRidCardnum(String wsCardRidCardnum) {
		this.wsCardRidCardnum.setValue(wsCardRidCardnum);
	}
	/**
	 * Gets the reference for attribute wsCardRidCustId.
	 * @return the wsCardRidCustId attribute reference
	 */
	public ElementaryRangeReference getWsCardRidCustIdReference() {
		return wsCardRidCustId.getReference();
	}

	/**
	 * Getter for wsCardRidCustId attribute.
	 * @return wsCardRidCustId attribute
	 */
	public int getWsCardRidCustId() {
		return wsCardRidCustId.getValue();
	}

	/**
	 * Setter for wsCardRidCustId attribute.
	 * @param wsCardRidCustId the new value of wsCardRidCustId
	 */
	public void setWsCardRidCustId(int wsCardRidCustId) {
		this.wsCardRidCustId.setValue(wsCardRidCustId);
	}
	/**
	 * Gets the reference for attribute wsCardRidCustIdX.
	 * @return the wsCardRidCustIdX attribute reference
	 */
	public ElementaryRangeReference getWsCardRidCustIdXReference() {
		return wsCardRidCustIdX.getReference();
	}

	/**
	 * Getter for wsCardRidCustIdX attribute.
	 * @return wsCardRidCustIdX attribute
	 */
	public String getWsCardRidCustIdX() {
		return wsCardRidCustIdX.getValue();
	}

	/**
	 * Setter for wsCardRidCustIdX attribute.
	 * @param wsCardRidCustIdX the new value of wsCardRidCustIdX
	 */
	public void setWsCardRidCustIdX(String wsCardRidCustIdX) {
		this.wsCardRidCustIdX.setValue(wsCardRidCustIdX);
	}
	/**
	 * Gets the reference for attribute wsCardRidAcctId.
	 * @return the wsCardRidAcctId attribute reference
	 */
	public ElementaryRangeReference getWsCardRidAcctIdReference() {
		return wsCardRidAcctId.getReference();
	}

	/**
	 * Getter for wsCardRidAcctId attribute.
	 * @return wsCardRidAcctId attribute
	 */
	public long getWsCardRidAcctId() {
		return wsCardRidAcctId.getValue();
	}

	/**
	 * Setter for wsCardRidAcctId attribute.
	 * @param wsCardRidAcctId the new value of wsCardRidAcctId
	 */
	public void setWsCardRidAcctId(long wsCardRidAcctId) {
		this.wsCardRidAcctId.setValue(wsCardRidAcctId);
	}
	/**
	 * Gets the reference for attribute wsCardRidAcctIdX.
	 * @return the wsCardRidAcctIdX attribute reference
	 */
	public ElementaryRangeReference getWsCardRidAcctIdXReference() {
		return wsCardRidAcctIdX.getReference();
	}

	/**
	 * Getter for wsCardRidAcctIdX attribute.
	 * @return wsCardRidAcctIdX attribute
	 */
	public String getWsCardRidAcctIdX() {
		return wsCardRidAcctIdX.getValue();
	}

	/**
	 * Setter for wsCardRidAcctIdX attribute.
	 * @param wsCardRidAcctIdX the new value of wsCardRidAcctIdX
	 */
	public void setWsCardRidAcctIdX(String wsCardRidAcctIdX) {
		this.wsCardRidAcctIdX.setValue(wsCardRidAcctIdX);
	}
	
	/**
	 * Gets the reference for attribute wsFileReadFlags.
	 * @return the wsFileReadFlags attribute reference
	 */
	public RangeReference getWsFileReadFlagsReference() {
		return wsFileReadFlags.getReference();
	}	
				
	/**
	 * Setter for wsFileReadFlags .
	 */
   	public void setWsFileReadFlags(RangeReference reference) {
       	wsFileReadFlags.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsAccountMasterReadFlag.
	 * @return the wsAccountMasterReadFlag attribute reference
	 */
	public ElementaryRangeReference getWsAccountMasterReadFlagReference() {
		return wsAccountMasterReadFlag.getReference();
	}

	/**
	 * Getter for wsAccountMasterReadFlag attribute.
	 * @return wsAccountMasterReadFlag attribute
	 */
	public String getWsAccountMasterReadFlag() {
		return wsAccountMasterReadFlag.getValue();
	}

	/**
	 * Setter for wsAccountMasterReadFlag attribute.
	 * @param wsAccountMasterReadFlag the new value of wsAccountMasterReadFlag
	 */
	public void setWsAccountMasterReadFlag(String wsAccountMasterReadFlag) {
		this.wsAccountMasterReadFlag.setValue(wsAccountMasterReadFlag);
	}
	/**
	 * Gets the reference for attribute foundAcctInMaster.
	 * @return the foundAcctInMaster attribute reference
	 */
	public ConditionReference getFoundAcctInMasterReference() {
		return wsAccountMasterReadFlag.getCondition(foundAcctInMaster);	
	}

	/**
	 * Getter for foundAcctInMaster attribute.
	 * @return foundAcctInMaster attribute
	 */
	public boolean isFoundAcctInMaster() {
		return getFoundAcctInMasterReference().getValue();	
	}

	/**
	 * Setter for foundAcctInMaster attribute.
	 * @param foundAcctInMaster the new value of foundAcctInMaster
	 */
	public void setFoundAcctInMaster(boolean foundAcctInMaster) {
		getFoundAcctInMasterReference().setValue(foundAcctInMaster);	
	}
	/**
	 * Gets the reference for attribute wsCustMasterReadFlag.
	 * @return the wsCustMasterReadFlag attribute reference
	 */
	public ElementaryRangeReference getWsCustMasterReadFlagReference() {
		return wsCustMasterReadFlag.getReference();
	}

	/**
	 * Getter for wsCustMasterReadFlag attribute.
	 * @return wsCustMasterReadFlag attribute
	 */
	public String getWsCustMasterReadFlag() {
		return wsCustMasterReadFlag.getValue();
	}

	/**
	 * Setter for wsCustMasterReadFlag attribute.
	 * @param wsCustMasterReadFlag the new value of wsCustMasterReadFlag
	 */
	public void setWsCustMasterReadFlag(String wsCustMasterReadFlag) {
		this.wsCustMasterReadFlag.setValue(wsCustMasterReadFlag);
	}
	/**
	 * Gets the reference for attribute foundCustInMaster.
	 * @return the foundCustInMaster attribute reference
	 */
	public ConditionReference getFoundCustInMasterReference() {
		return wsCustMasterReadFlag.getCondition(foundCustInMaster);	
	}

	/**
	 * Getter for foundCustInMaster attribute.
	 * @return foundCustInMaster attribute
	 */
	public boolean isFoundCustInMaster() {
		return getFoundCustInMasterReference().getValue();	
	}

	/**
	 * Setter for foundCustInMaster attribute.
	 * @param foundCustInMaster the new value of foundCustInMaster
	 */
	public void setFoundCustInMaster(boolean foundCustInMaster) {
		getFoundCustInMasterReference().setValue(foundCustInMaster);	
	}
	
	/**
	 * Gets the reference for attribute wsFileErrorMessage.
	 * @return the wsFileErrorMessage attribute reference
	 */
	public RangeReference getWsFileErrorMessageReference() {
		return wsFileErrorMessage.getReference();
	}	
				
	/**
	 * Setter for wsFileErrorMessage .
	 */
   	public void setWsFileErrorMessage(RangeReference reference) {
       	wsFileErrorMessage.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute errorOpname.
	 * @return the errorOpname attribute reference
	 */
	public ElementaryRangeReference getErrorOpnameReference() {
		return errorOpname.getReference();
	}

	/**
	 * Getter for errorOpname attribute.
	 * @return errorOpname attribute
	 */
	public String getErrorOpname() {
		return errorOpname.getValue();
	}

	/**
	 * Setter for errorOpname attribute.
	 * @param errorOpname the new value of errorOpname
	 */
	public void setErrorOpname(String errorOpname) {
		this.errorOpname.setValue(errorOpname);
	}
	/**
	 * Gets the reference for attribute errorFile.
	 * @return the errorFile attribute reference
	 */
	public ElementaryRangeReference getErrorFileReference() {
		return errorFile.getReference();
	}

	/**
	 * Getter for errorFile attribute.
	 * @return errorFile attribute
	 */
	public String getErrorFile() {
		return errorFile.getValue();
	}

	/**
	 * Setter for errorFile attribute.
	 * @param errorFile the new value of errorFile
	 */
	public void setErrorFile(String errorFile) {
		this.errorFile.setValue(errorFile);
	}
	/**
	 * Gets the reference for attribute errorResp.
	 * @return the errorResp attribute reference
	 */
	public ElementaryRangeReference getErrorRespReference() {
		return errorResp.getReference();
	}

	/**
	 * Getter for errorResp attribute.
	 * @return errorResp attribute
	 */
	public String getErrorResp() {
		return errorResp.getValue();
	}

	/**
	 * Setter for errorResp attribute.
	 * @param errorResp the new value of errorResp
	 */
	public void setErrorResp(String errorResp) {
		this.errorResp.setValue(errorResp);
	}
	/**
	 * Gets the reference for attribute errorResp2.
	 * @return the errorResp2 attribute reference
	 */
	public ElementaryRangeReference getErrorResp2Reference() {
		return errorResp2.getReference();
	}

	/**
	 * Getter for errorResp2 attribute.
	 * @return errorResp2 attribute
	 */
	public String getErrorResp2() {
		return errorResp2.getValue();
	}

	/**
	 * Setter for errorResp2 attribute.
	 * @param errorResp2 the new value of errorResp2
	 */
	public void setErrorResp2(String errorResp2) {
		this.errorResp2.setValue(errorResp2);
	}
	/**
	 * Gets the reference for attribute wsLongMsg.
	 * @return the wsLongMsg attribute reference
	 */
	public ElementaryRangeReference getWsLongMsgReference() {
		return wsLongMsg.getReference();
	}

	/**
	 * Getter for wsLongMsg attribute.
	 * @return wsLongMsg attribute
	 */
	public String getWsLongMsg() {
		return wsLongMsg.getValue();
	}

	/**
	 * Setter for wsLongMsg attribute.
	 * @param wsLongMsg the new value of wsLongMsg
	 */
	public void setWsLongMsg(String wsLongMsg) {
		this.wsLongMsg.setValue(wsLongMsg);
	}
	/**
	 * Gets the reference for attribute wsInfoMsg.
	 * @return the wsInfoMsg attribute reference
	 */
	public ElementaryRangeReference getWsInfoMsgReference() {
		return wsInfoMsg.getReference();
	}

	/**
	 * Getter for wsInfoMsg attribute.
	 * @return wsInfoMsg attribute
	 */
	public String getWsInfoMsg() {
		return wsInfoMsg.getValue();
	}

	/**
	 * Setter for wsInfoMsg attribute.
	 * @param wsInfoMsg the new value of wsInfoMsg
	 */
	public void setWsInfoMsg(String wsInfoMsg) {
		this.wsInfoMsg.setValue(wsInfoMsg);
	}
	/**
	 * Gets the reference for attribute wsNoInfoMessage.
	 * @return the wsNoInfoMessage attribute reference
	 */
	public ConditionReference getWsNoInfoMessageReference() {
		return wsInfoMsg.getCondition(wsNoInfoMessage);	
	}

	/**
	 * Getter for wsNoInfoMessage attribute.
	 * @return wsNoInfoMessage attribute
	 */
	public boolean isWsNoInfoMessage() {
		return getWsNoInfoMessageReference().getValue();	
	}

	/**
	 * Setter for wsNoInfoMessage attribute.
	 * @param wsNoInfoMessage the new value of wsNoInfoMessage
	 */
	public void setWsNoInfoMessage(boolean wsNoInfoMessage) {
		getWsNoInfoMessageReference().setValue(wsNoInfoMessage);	
	}
	/**
	 * Gets the reference for attribute wsPromptForInput.
	 * @return the wsPromptForInput attribute reference
	 */
	public ConditionReference getWsPromptForInputReference() {
		return wsInfoMsg.getCondition(wsPromptForInput);	
	}

	/**
	 * Getter for wsPromptForInput attribute.
	 * @return wsPromptForInput attribute
	 */
	public boolean isWsPromptForInput() {
		return getWsPromptForInputReference().getValue();	
	}

	/**
	 * Setter for wsPromptForInput attribute.
	 * @param wsPromptForInput the new value of wsPromptForInput
	 */
	public void setWsPromptForInput(boolean wsPromptForInput) {
		getWsPromptForInputReference().setValue(wsPromptForInput);	
	}
	/**
	 * Gets the reference for attribute wsInformOutput.
	 * @return the wsInformOutput attribute reference
	 */
	public ConditionReference getWsInformOutputReference() {
		return wsInfoMsg.getCondition(wsInformOutput);	
	}

	/**
	 * Getter for wsInformOutput attribute.
	 * @return wsInformOutput attribute
	 */
	public boolean isWsInformOutput() {
		return getWsInformOutputReference().getValue();	
	}

	/**
	 * Setter for wsInformOutput attribute.
	 * @param wsInformOutput the new value of wsInformOutput
	 */
	public void setWsInformOutput(boolean wsInformOutput) {
		getWsInformOutputReference().setValue(wsInformOutput);	
	}
	/**
	 * Gets the reference for attribute wsReturnMsg.
	 * @return the wsReturnMsg attribute reference
	 */
	public ElementaryRangeReference getWsReturnMsgReference() {
		return wsReturnMsg.getReference();
	}

	/**
	 * Getter for wsReturnMsg attribute.
	 * @return wsReturnMsg attribute
	 */
	public String getWsReturnMsg() {
		return wsReturnMsg.getValue();
	}

	/**
	 * Setter for wsReturnMsg attribute.
	 * @param wsReturnMsg the new value of wsReturnMsg
	 */
	public void setWsReturnMsg(String wsReturnMsg) {
		this.wsReturnMsg.setValue(wsReturnMsg);
	}
	/**
	 * Gets the reference for attribute wsReturnMsgOff.
	 * @return the wsReturnMsgOff attribute reference
	 */
	public ConditionReference getWsReturnMsgOffReference() {
		return wsReturnMsg.getCondition(wsReturnMsgOff);	
	}

	/**
	 * Getter for wsReturnMsgOff attribute.
	 * @return wsReturnMsgOff attribute
	 */
	public boolean isWsReturnMsgOff() {
		return getWsReturnMsgOffReference().getValue();	
	}

	/**
	 * Setter for wsReturnMsgOff attribute.
	 * @param wsReturnMsgOff the new value of wsReturnMsgOff
	 */
	public void setWsReturnMsgOff(boolean wsReturnMsgOff) {
		getWsReturnMsgOffReference().setValue(wsReturnMsgOff);	
	}
	/**
	 * Gets the reference for attribute wsExitMessage.
	 * @return the wsExitMessage attribute reference
	 */
	public ConditionReference getWsExitMessageReference() {
		return wsReturnMsg.getCondition(wsExitMessage);	
	}

	/**
	 * Getter for wsExitMessage attribute.
	 * @return wsExitMessage attribute
	 */
	public boolean isWsExitMessage() {
		return getWsExitMessageReference().getValue();	
	}

	/**
	 * Setter for wsExitMessage attribute.
	 * @param wsExitMessage the new value of wsExitMessage
	 */
	public void setWsExitMessage(boolean wsExitMessage) {
		getWsExitMessageReference().setValue(wsExitMessage);	
	}
	/**
	 * Gets the reference for attribute wsPromptForAcct.
	 * @return the wsPromptForAcct attribute reference
	 */
	public ConditionReference getWsPromptForAcctReference() {
		return wsReturnMsg.getCondition(wsPromptForAcct);	
	}

	/**
	 * Getter for wsPromptForAcct attribute.
	 * @return wsPromptForAcct attribute
	 */
	public boolean isWsPromptForAcct() {
		return getWsPromptForAcctReference().getValue();	
	}

	/**
	 * Setter for wsPromptForAcct attribute.
	 * @param wsPromptForAcct the new value of wsPromptForAcct
	 */
	public void setWsPromptForAcct(boolean wsPromptForAcct) {
		getWsPromptForAcctReference().setValue(wsPromptForAcct);	
	}
	/**
	 * Gets the reference for attribute noSearchCriteriaReceived.
	 * @return the noSearchCriteriaReceived attribute reference
	 */
	public ConditionReference getNoSearchCriteriaReceivedReference() {
		return wsReturnMsg.getCondition(noSearchCriteriaReceived);	
	}

	/**
	 * Getter for noSearchCriteriaReceived attribute.
	 * @return noSearchCriteriaReceived attribute
	 */
	public boolean isNoSearchCriteriaReceived() {
		return getNoSearchCriteriaReceivedReference().getValue();	
	}

	/**
	 * Setter for noSearchCriteriaReceived attribute.
	 * @param noSearchCriteriaReceived the new value of noSearchCriteriaReceived
	 */
	public void setNoSearchCriteriaReceived(boolean noSearchCriteriaReceived) {
		getNoSearchCriteriaReceivedReference().setValue(noSearchCriteriaReceived);	
	}
	/**
	 * Gets the reference for attribute searchedAcctZeroes.
	 * @return the searchedAcctZeroes attribute reference
	 */
	public ConditionReference getSearchedAcctZeroesReference() {
		return wsReturnMsg.getCondition(searchedAcctZeroes);	
	}

	/**
	 * Getter for searchedAcctZeroes attribute.
	 * @return searchedAcctZeroes attribute
	 */
	public boolean isSearchedAcctZeroes() {
		return getSearchedAcctZeroesReference().getValue();	
	}

	/**
	 * Setter for searchedAcctZeroes attribute.
	 * @param searchedAcctZeroes the new value of searchedAcctZeroes
	 */
	public void setSearchedAcctZeroes(boolean searchedAcctZeroes) {
		getSearchedAcctZeroesReference().setValue(searchedAcctZeroes);	
	}
	/**
	 * Gets the reference for attribute searchedAcctNotNumeric.
	 * @return the searchedAcctNotNumeric attribute reference
	 */
	public ConditionReference getSearchedAcctNotNumericReference() {
		return wsReturnMsg.getCondition(searchedAcctNotNumeric);	
	}

	/**
	 * Getter for searchedAcctNotNumeric attribute.
	 * @return searchedAcctNotNumeric attribute
	 */
	public boolean isSearchedAcctNotNumeric() {
		return getSearchedAcctNotNumericReference().getValue();	
	}

	/**
	 * Setter for searchedAcctNotNumeric attribute.
	 * @param searchedAcctNotNumeric the new value of searchedAcctNotNumeric
	 */
	public void setSearchedAcctNotNumeric(boolean searchedAcctNotNumeric) {
		getSearchedAcctNotNumericReference().setValue(searchedAcctNotNumeric);	
	}
	/**
	 * Gets the reference for attribute didNotFindAcctInCardxref.
	 * @return the didNotFindAcctInCardxref attribute reference
	 */
	public ConditionReference getDidNotFindAcctInCardxrefReference() {
		return wsReturnMsg.getCondition(didNotFindAcctInCardxref);	
	}

	/**
	 * Getter for didNotFindAcctInCardxref attribute.
	 * @return didNotFindAcctInCardxref attribute
	 */
	public boolean isDidNotFindAcctInCardxref() {
		return getDidNotFindAcctInCardxrefReference().getValue();	
	}

	/**
	 * Setter for didNotFindAcctInCardxref attribute.
	 * @param didNotFindAcctInCardxref the new value of didNotFindAcctInCardxref
	 */
	public void setDidNotFindAcctInCardxref(boolean didNotFindAcctInCardxref) {
		getDidNotFindAcctInCardxrefReference().setValue(didNotFindAcctInCardxref);	
	}
	/**
	 * Gets the reference for attribute didNotFindAcctInAcctdat.
	 * @return the didNotFindAcctInAcctdat attribute reference
	 */
	public ConditionReference getDidNotFindAcctInAcctdatReference() {
		return wsReturnMsg.getCondition(didNotFindAcctInAcctdat);	
	}

	/**
	 * Getter for didNotFindAcctInAcctdat attribute.
	 * @return didNotFindAcctInAcctdat attribute
	 */
	public boolean isDidNotFindAcctInAcctdat() {
		return getDidNotFindAcctInAcctdatReference().getValue();	
	}

	/**
	 * Setter for didNotFindAcctInAcctdat attribute.
	 * @param didNotFindAcctInAcctdat the new value of didNotFindAcctInAcctdat
	 */
	public void setDidNotFindAcctInAcctdat(boolean didNotFindAcctInAcctdat) {
		getDidNotFindAcctInAcctdatReference().setValue(didNotFindAcctInAcctdat);	
	}
	/**
	 * Gets the reference for attribute didNotFindCustInCustdat.
	 * @return the didNotFindCustInCustdat attribute reference
	 */
	public ConditionReference getDidNotFindCustInCustdatReference() {
		return wsReturnMsg.getCondition(didNotFindCustInCustdat);	
	}

	/**
	 * Getter for didNotFindCustInCustdat attribute.
	 * @return didNotFindCustInCustdat attribute
	 */
	public boolean isDidNotFindCustInCustdat() {
		return getDidNotFindCustInCustdatReference().getValue();	
	}

	/**
	 * Setter for didNotFindCustInCustdat attribute.
	 * @param didNotFindCustInCustdat the new value of didNotFindCustInCustdat
	 */
	public void setDidNotFindCustInCustdat(boolean didNotFindCustInCustdat) {
		getDidNotFindCustInCustdatReference().setValue(didNotFindCustInCustdat);	
	}
	/**
	 * Gets the reference for attribute xrefReadError.
	 * @return the xrefReadError attribute reference
	 */
	public ConditionReference getXrefReadErrorReference() {
		return wsReturnMsg.getCondition(xrefReadError);	
	}

	/**
	 * Getter for xrefReadError attribute.
	 * @return xrefReadError attribute
	 */
	public boolean isXrefReadError() {
		return getXrefReadErrorReference().getValue();	
	}

	/**
	 * Setter for xrefReadError attribute.
	 * @param xrefReadError the new value of xrefReadError
	 */
	public void setXrefReadError(boolean xrefReadError) {
		getXrefReadErrorReference().setValue(xrefReadError);	
	}
	/**
	 * Gets the reference for attribute codingToBeDone.
	 * @return the codingToBeDone attribute reference
	 */
	public ConditionReference getCodingToBeDoneReference() {
		return wsReturnMsg.getCondition(codingToBeDone);	
	}

	/**
	 * Getter for codingToBeDone attribute.
	 * @return codingToBeDone attribute
	 */
	public boolean isCodingToBeDone() {
		return getCodingToBeDoneReference().getValue();	
	}

	/**
	 * Setter for codingToBeDone attribute.
	 * @param codingToBeDone the new value of codingToBeDone
	 */
	public void setCodingToBeDone(boolean codingToBeDone) {
		getCodingToBeDoneReference().setValue(codingToBeDone);	
	}
}
