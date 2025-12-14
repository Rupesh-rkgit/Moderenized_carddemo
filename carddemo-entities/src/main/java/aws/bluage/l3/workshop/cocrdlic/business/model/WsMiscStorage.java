package aws.bluage.l3.workshop.cocrdlic.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
import org.apache.commons.lang3.tuple.Pair;
/**
 * Data simplifier entity WsMiscStorage.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *   Program:     COCRDLIC.CBL                                     *<br>
 *   Layer:       Business logic                                   *<br>
 *   Function:    List Credit Cards<br>
 *                a) All cards if no context passed and admin user<br>
 *                b) Only the ones associated with ACCT in COMMAREA<br>
 *                   if user is not admin<br>
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
 * <p>About 'wsCicsProcessngVars' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.WsCicsProcessngVars
 * <br></p>
 * 
 * <p>About 'wsInputFlag' field, <br>
 *  ****************************************************************<br>
 *   Input edits<br>
 *  ****************************************************************<br></p>
 * 
 * <p>About 'inputOk' field, <br>
 * </p>
 * 
 * <p>About 'inputError' field, <br>
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
 * <p>About 'wsEditCardFlag' field, <br>
 * </p>
 * 
 * <p>About 'flgCardfilterNotOk' field, <br>
 * </p>
 * 
 * <p>About 'flgCardfilterIsvalid' field, <br>
 * </p>
 * 
 * <p>About 'flgCardfilterBlank' field, <br>
 * </p>
 * 
 * <p>About 'wsEditSelectCounter' field, <br>
 * </p>
 * 
 * <p>About 'wsEditSelectFlags' field, <br>
 * </p>
 * 
 * <p>About 'wsEditSelectArray' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.WsEditSelectArray
 * <br></p>
 * 
 * <p>About 'wsEditSelectErrorFlags' field, <br>
 * </p>
 * 
 * <p>About 'wsEditSelectErrorFlagx' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.WsEditSelectErrorFlagx
 * <br></p>
 * 
 * <p>About 'wsSubscriptVars' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.WsSubscriptVars
 * <br></p>
 * 
 * <p>About 'cicsOutputEditVars' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.CicsOutputEditVars
 * <br></p>
 * 
 * <p>About 'wsLongMsg' field, <br>
 *  ****************************************************************<br>
 *   Output Message Construction<br>
 *  ****************************************************************<br></p>
 * 
 * <p>About 'wsInfoMsg' field, <br>
 * </p>
 * 
 * <p>About 'wsNoInfoMessage' field, <br>
 * </p>
 * 
 * <p>About 'wsInformRecActions' field, <br>
 * </p>
 * 
 * <p>About 'wsErrorMsg' field, <br>
 * </p>
 * 
 * <p>About 'wsErrorMsgOff' field, <br>
 * </p>
 * 
 * <p>About 'wsExitMessage' field, <br>
 * </p>
 * 
 * <p>About 'wsNoRecordsFound' field, <br>
 * </p>
 * 
 * <p>About 'wsMoreThan1Action' field, <br>
 * </p>
 * 
 * <p>About 'wsInvalidActionCode' field, <br>
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
 * <p>About 'wsContextFlag' field, <br>
 * </p>
 * 
 * <p>About 'wsContextFreshStart' field, <br>
 * </p>
 * 
 * <p>About 'wsContextFreshStartNo' field, <br>
 * </p>
 * 
 * <p>About 'wsFileHandlingVars' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.WsFileHandlingVars
 * <br></p>
 * 
 * <p>About 'wsScrnCounter' field, <br>
 * </p>
 * 
 * <p>About 'wsFilterRecordFlag' field, <br>
 * </p>
 * 
 * <p>About 'wsExcludeThisRecord' field, <br>
 * </p>
 * 
 * <p>About 'wsDonotExcludeThisRecord' field, <br>
 * </p>
 * 
 * <p>About 'wsRecordsToProcessFlag' field, <br>
 * </p>
 * 
 * <p>About 'readLoopExit' field, <br>
 * </p>
 * 
 * <p>About 'moreRecordsToRead' field, <br>
 * </p>
 * 
 * <p>About 'wsFileErrorMessage' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.WsFileErrorMessage
 * <br></p>
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
	private final ConditionName inputOk=new ConditionName(wsInputFlag,"0",
	" ",
	Record.LOW_VALUES);
	private final ConditionName inputError=new ConditionName(wsInputFlag,"1");
	private final Elementary wsEditAcctFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgAcctfilterNotOk=new ConditionName(wsEditAcctFlag,"0");
	private final ConditionName flgAcctfilterIsvalid=new ConditionName(wsEditAcctFlag,"1");
	private final ConditionName flgAcctfilterBlank=new ConditionName(wsEditAcctFlag," ");
	private final Elementary wsEditCardFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgCardfilterNotOk=new ConditionName(wsEditCardFlag,"0");
	private final ConditionName flgCardfilterIsvalid=new ConditionName(wsEditCardFlag,"1");
	private final ConditionName flgCardfilterBlank=new ConditionName(wsEditCardFlag," ");
	private final Elementary wsEditSelectCounter = new Elementary(root,new PackedType(4, 0, false, false, true),Short.valueOf("0"));
	private final Union union = new Union(root);
	private final Elementary wsEditSelectFlags = new Elementary(union,new AlphanumericType(7),Record.LOW_VALUES);
	private final Group wsEditSelectArray = new Group(union);
	private final Elementary wsEditSelect = new Elementary(wsEditSelectArray,new FixedArray(7),new AlphanumericType(1));
	private final ConditionName selectOk=new ConditionName(wsEditSelect,"S",
	"U");
	private final ConditionName viewRequestedOn=new ConditionName(wsEditSelect,"S");
	private final ConditionName updateRequestedOn=new ConditionName(wsEditSelect,"U");
	private final ConditionName selectBlank=new ConditionName(wsEditSelect," ",
	Record.LOW_VALUES);
	private final Union union1 = new Union(root);
	private final Elementary wsEditSelectErrorFlags = new Elementary(union1,new AlphanumericType(7));
	private final Group wsEditSelectErrorFlagx = new Group(union1);
	private final Group wsEditSelectErrors = new Group(wsEditSelectErrorFlagx,new FixedArray(7));
	private final Elementary wsRowCrdselectError = new Elementary(wsEditSelectErrors,new AlphanumericType(1));
	private final ConditionName wsRowSelectError=new ConditionName(wsRowCrdselectError,"1");
	private final Group wsSubscriptVars = new Group(root);
	private final Elementary i = new Elementary(wsSubscriptVars,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("0"));
	private final Elementary iSelected = new Elementary(wsSubscriptVars,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("0"));
	private final ConditionName detailWasRequested=new ConditionName(iSelected,Pair.of(new BigDecimal("1"),new BigDecimal("7")));
	
	/**
	 * ****************************************************************
	 * Output edits
	 * ****************************************************************
	 */
	private final Group cicsOutputEditVars = new Group(root);
	private final Union union2 = new Union(cicsOutputEditVars);
	private final Elementary cardAcctIdX = new Elementary(union2,new AlphanumericType(11));
	private final Elementary cardAcctIdN = new Elementary(union2,new ZonedType(11, 0, false));
	private final Union union3 = new Union(cicsOutputEditVars);
	private final Elementary cardCvvCdX = new Elementary(union3,new AlphanumericType(3));
	private final Elementary cardCvvCdN = new Elementary(union3,new ZonedType(3, 0, false));
	private final Elementary flgProtectSelectRows = new Elementary(cicsOutputEditVars,new AlphanumericType(1));
	private final ConditionName flgProtectSelectRowsNo=new ConditionName(flgProtectSelectRows,"0");
	private final ConditionName flgProtectSelectRowsYes=new ConditionName(flgProtectSelectRows,"1");
	
	/**
	 * ****************************************************************
	 * Output Message Construction
	 * ****************************************************************
	 */
	private final Elementary wsLongMsg = new Elementary(root,new AlphanumericType(500));
	private final Elementary wsInfoMsg = new Elementary(root,new AlphanumericType(45));
	private final ConditionName wsNoInfoMessage=new ConditionName(wsInfoMsg," ",
	Record.LOW_VALUES);
	private final ConditionName wsInformRecActions=new ConditionName(wsInfoMsg,"TYPE S FOR DETAIL, U TO UPDATE ANY RECORD");
	private final Elementary wsErrorMsg = new Elementary(root,new AlphanumericType(75));
	private final ConditionName wsErrorMsgOff=new ConditionName(wsErrorMsg," ");
	private final ConditionName wsExitMessage=new ConditionName(wsErrorMsg,"PF03 PRESSED.EXITING");
	private final ConditionName wsNoRecordsFound=new ConditionName(wsErrorMsg,"NO RECORDS FOUND FOR THIS SEARCH CONDITION.");
	private final ConditionName wsMoreThan1Action=new ConditionName(wsErrorMsg,"PLEASE SELECT ONLY ONE RECORD TO VIEW OR UPDATE");
	private final ConditionName wsInvalidActionCode=new ConditionName(wsErrorMsg,"INVALID ACTION CODE");
	private final Elementary wsPfkFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName pfkValid=new ConditionName(wsPfkFlag,"0");
	private final ConditionName pfkInvalid=new ConditionName(wsPfkFlag,"1");
	private final Elementary wsContextFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName wsContextFreshStart=new ConditionName(wsContextFlag,"0");
	private final ConditionName wsContextFreshStartNo=new ConditionName(wsContextFlag,"1");
	
	/**
	 * ****************************************************************
	 * File and data Handling
	 * ****************************************************************
	 */
	private final Group wsFileHandlingVars = new Group(root);
	private final Group wsCardRid = new Group(wsFileHandlingVars);
	private final Elementary wsCardRidCardnum = new Elementary(wsCardRid,new AlphanumericType(16));
	private final Union union4 = new Union(wsCardRid);
	private final Elementary wsCardRidAcctId = new Elementary(union4,new ZonedType(11, 0, false));
	private final Elementary wsCardRidAcctIdX = new Elementary(union4,new AlphanumericType(11));
	private final Elementary wsScrnCounter = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("0"));
	private final Elementary wsFilterRecordFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName wsExcludeThisRecord=new ConditionName(wsFilterRecordFlag,"0");
	private final ConditionName wsDonotExcludeThisRecord=new ConditionName(wsFilterRecordFlag,"1");
	private final Elementary wsRecordsToProcessFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName readLoopExit=new ConditionName(wsRecordsToProcessFlag,"0");
	private final ConditionName moreRecordsToRead=new ConditionName(wsRecordsToProcessFlag,"1");
	private final Group wsFileErrorMessage = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(wsFileErrorMessage,new AlphanumericType(12),"File Error:");
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
	private final Filler filler4 = new Filler(wsFileErrorMessage,new AlphanumericType(5));
	

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
	 * Gets the reference for attribute wsEditCardFlag.
	 * @return the wsEditCardFlag attribute reference
	 */
	public ElementaryRangeReference getWsEditCardFlagReference() {
		return wsEditCardFlag.getReference();
	}

	/**
	 * Getter for wsEditCardFlag attribute.
	 * @return wsEditCardFlag attribute
	 */
	public String getWsEditCardFlag() {
		return wsEditCardFlag.getValue();
	}

	/**
	 * Setter for wsEditCardFlag attribute.
	 * @param wsEditCardFlag the new value of wsEditCardFlag
	 */
	public void setWsEditCardFlag(String wsEditCardFlag) {
		this.wsEditCardFlag.setValue(wsEditCardFlag);
	}
	/**
	 * Gets the reference for attribute flgCardfilterNotOk.
	 * @return the flgCardfilterNotOk attribute reference
	 */
	public ConditionReference getFlgCardfilterNotOkReference() {
		return wsEditCardFlag.getCondition(flgCardfilterNotOk);	
	}

	/**
	 * Getter for flgCardfilterNotOk attribute.
	 * @return flgCardfilterNotOk attribute
	 */
	public boolean isFlgCardfilterNotOk() {
		return getFlgCardfilterNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCardfilterNotOk attribute.
	 * @param flgCardfilterNotOk the new value of flgCardfilterNotOk
	 */
	public void setFlgCardfilterNotOk(boolean flgCardfilterNotOk) {
		getFlgCardfilterNotOkReference().setValue(flgCardfilterNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCardfilterIsvalid.
	 * @return the flgCardfilterIsvalid attribute reference
	 */
	public ConditionReference getFlgCardfilterIsvalidReference() {
		return wsEditCardFlag.getCondition(flgCardfilterIsvalid);	
	}

	/**
	 * Getter for flgCardfilterIsvalid attribute.
	 * @return flgCardfilterIsvalid attribute
	 */
	public boolean isFlgCardfilterIsvalid() {
		return getFlgCardfilterIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCardfilterIsvalid attribute.
	 * @param flgCardfilterIsvalid the new value of flgCardfilterIsvalid
	 */
	public void setFlgCardfilterIsvalid(boolean flgCardfilterIsvalid) {
		getFlgCardfilterIsvalidReference().setValue(flgCardfilterIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCardfilterBlank.
	 * @return the flgCardfilterBlank attribute reference
	 */
	public ConditionReference getFlgCardfilterBlankReference() {
		return wsEditCardFlag.getCondition(flgCardfilterBlank);	
	}

	/**
	 * Getter for flgCardfilterBlank attribute.
	 * @return flgCardfilterBlank attribute
	 */
	public boolean isFlgCardfilterBlank() {
		return getFlgCardfilterBlankReference().getValue();	
	}

	/**
	 * Setter for flgCardfilterBlank attribute.
	 * @param flgCardfilterBlank the new value of flgCardfilterBlank
	 */
	public void setFlgCardfilterBlank(boolean flgCardfilterBlank) {
		getFlgCardfilterBlankReference().setValue(flgCardfilterBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditSelectCounter.
	 * @return the wsEditSelectCounter attribute reference
	 */
	public ElementaryRangeReference getWsEditSelectCounterReference() {
		return wsEditSelectCounter.getReference();
	}

	/**
	 * Getter for wsEditSelectCounter attribute.
	 * @return wsEditSelectCounter attribute
	 */
	public int getWsEditSelectCounter() {
		return wsEditSelectCounter.getValue();
	}

	/**
	 * Setter for wsEditSelectCounter attribute.
	 * @param wsEditSelectCounter the new value of wsEditSelectCounter
	 */
	public void setWsEditSelectCounter(int wsEditSelectCounter) {
		this.wsEditSelectCounter.setValue(wsEditSelectCounter);
	}
	/**
	 * Gets the reference for attribute wsEditSelectFlags.
	 * @return the wsEditSelectFlags attribute reference
	 */
	public ElementaryRangeReference getWsEditSelectFlagsReference() {
		return wsEditSelectFlags.getReference();
	}

	/**
	 * Getter for wsEditSelectFlags attribute.
	 * @return wsEditSelectFlags attribute
	 */
	public String getWsEditSelectFlags() {
		return wsEditSelectFlags.getValue();
	}

	/**
	 * Setter for wsEditSelectFlags attribute.
	 * @param wsEditSelectFlags the new value of wsEditSelectFlags
	 */
	public void setWsEditSelectFlags(String wsEditSelectFlags) {
		this.wsEditSelectFlags.setValue(wsEditSelectFlags);
	}
	
	/**
	 * Gets the reference for attribute wsEditSelectArray.
	 * @return the wsEditSelectArray attribute reference
	 */
	public RangeReference getWsEditSelectArrayReference() {
		return wsEditSelectArray.getReference();
	}	
				
	/**
	 * Setter for wsEditSelectArray .
	 */
   	public void setWsEditSelectArray(RangeReference reference) {
       	wsEditSelectArray.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Getter for selectOk attribute.
	 * @param indexes the indexes
	 * @return selectOk attribute
	 */
	public ConditionReference getItemFromSelectOk(Integer... indexes) {
		return wsEditSelect.getIndexedConditionReference(selectOk, indexes);
	}
	
	/**
	 * Indexed getter for selectOk attribute.
	 * @param indexes the indexes
	 * @return selectOk attribute
	 */
	public Boolean isItemFromSelectOk(Integer... indexes) {
		return wsEditSelect.getIndexedConditionReference(selectOk, indexes).getValue();
	}
	
	/**
	 * Indexed setter for selectOk attribute.
	 * @param selectOkValue the new value of selectOk for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromSelectOk(Boolean selectOkValue, Integer... indexes) {
		wsEditSelect.getIndexedConditionReference(selectOk, indexes).setValue(selectOkValue);
	}
	
	/**
	 * Getter for viewRequestedOn attribute.
	 * @param indexes the indexes
	 * @return viewRequestedOn attribute
	 */
	public ConditionReference getItemFromViewRequestedOn(Integer... indexes) {
		return wsEditSelect.getIndexedConditionReference(viewRequestedOn, indexes);
	}
	
	/**
	 * Indexed getter for viewRequestedOn attribute.
	 * @param indexes the indexes
	 * @return viewRequestedOn attribute
	 */
	public Boolean isItemFromViewRequestedOn(Integer... indexes) {
		return wsEditSelect.getIndexedConditionReference(viewRequestedOn, indexes).getValue();
	}
	
	/**
	 * Indexed setter for viewRequestedOn attribute.
	 * @param viewRequestedOnValue the new value of viewRequestedOn for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromViewRequestedOn(Boolean viewRequestedOnValue, Integer... indexes) {
		wsEditSelect.getIndexedConditionReference(viewRequestedOn, indexes).setValue(viewRequestedOnValue);
	}
	
	/**
	 * Getter for updateRequestedOn attribute.
	 * @param indexes the indexes
	 * @return updateRequestedOn attribute
	 */
	public ConditionReference getItemFromUpdateRequestedOn(Integer... indexes) {
		return wsEditSelect.getIndexedConditionReference(updateRequestedOn, indexes);
	}
	
	/**
	 * Indexed getter for updateRequestedOn attribute.
	 * @param indexes the indexes
	 * @return updateRequestedOn attribute
	 */
	public Boolean isItemFromUpdateRequestedOn(Integer... indexes) {
		return wsEditSelect.getIndexedConditionReference(updateRequestedOn, indexes).getValue();
	}
	
	/**
	 * Indexed setter for updateRequestedOn attribute.
	 * @param updateRequestedOnValue the new value of updateRequestedOn for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromUpdateRequestedOn(Boolean updateRequestedOnValue, Integer... indexes) {
		wsEditSelect.getIndexedConditionReference(updateRequestedOn, indexes).setValue(updateRequestedOnValue);
	}
	
	/**
	 * Getter for selectBlank attribute.
	 * @param indexes the indexes
	 * @return selectBlank attribute
	 */
	public ConditionReference getItemFromSelectBlank(Integer... indexes) {
		return wsEditSelect.getIndexedConditionReference(selectBlank, indexes);
	}
	
	/**
	 * Indexed getter for selectBlank attribute.
	 * @param indexes the indexes
	 * @return selectBlank attribute
	 */
	public Boolean isItemFromSelectBlank(Integer... indexes) {
		return wsEditSelect.getIndexedConditionReference(selectBlank, indexes).getValue();
	}
	
	/**
	 * Indexed setter for selectBlank attribute.
	 * @param selectBlankValue the new value of selectBlank for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromSelectBlank(Boolean selectBlankValue, Integer... indexes) {
		wsEditSelect.getIndexedConditionReference(selectBlank, indexes).setValue(selectBlankValue);
	}
	
	/**
	 * Indexed getter for wsEditSelect attribute.
	 * @param indexes the indexes
	 * @return wsEditSelect attribute
	 */
	public ElementaryRangeReference getItemFromWsEditSelectReference(Integer... indexes) {
		return wsEditSelect.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for wsEditSelect attribute.
	 * @param indexes the indexes
	 * @return wsEditSelect attribute
	 */
	public String getItemFromWsEditSelect(Integer... indexes) {
		return wsEditSelect.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for wsEditSelect attribute.
	 * @param wsEditSelect the new value of wsEditSelect for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsEditSelect(String wsEditSelect,Integer... indexes) {
		this.wsEditSelect.setIndexedValue(wsEditSelect,indexes);
	}
	
	/**
	 * Collection size getter for wsEditSelect attribute.
	 * @return  the collection size for attributewsEditSelect
	 */
	public int getWsEditSelectSize(){
		return wsEditSelect.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for wsEditSelect attribute.
	 * @param indexes the indexes
	 * @return wsEditSelect attribute
	 */
	public ElementaryRangeReference getWsEditSelectReference() {
		return wsEditSelect.getReference();
	}
	
	/**
	 * Indexed getter for wsEditSelect attribute.
	 * @param indexes the indexes
	 * @return wsEditSelect attribute
	 */
	public String getWsEditSelect() {
		return wsEditSelect.getValue();
	}
	
	/**
	 * Indexed setter for wsEditSelect attribute.
	 * @param wsEditSelect the new value of wsEditSelect for given indexes
	 * @param indexes the indexes
	 */
	public void setWsEditSelect(String wsEditSelect) {
		this.wsEditSelect.setValue(wsEditSelect);
	}
	
	/**
	 * Gets the reference for attribute wsEditSelectErrorFlags.
	 * @return the wsEditSelectErrorFlags attribute reference
	 */
	public ElementaryRangeReference getWsEditSelectErrorFlagsReference() {
		return wsEditSelectErrorFlags.getReference();
	}

	/**
	 * Getter for wsEditSelectErrorFlags attribute.
	 * @return wsEditSelectErrorFlags attribute
	 */
	public String getWsEditSelectErrorFlags() {
		return wsEditSelectErrorFlags.getValue();
	}

	/**
	 * Setter for wsEditSelectErrorFlags attribute.
	 * @param wsEditSelectErrorFlags the new value of wsEditSelectErrorFlags
	 */
	public void setWsEditSelectErrorFlags(String wsEditSelectErrorFlags) {
		this.wsEditSelectErrorFlags.setValue(wsEditSelectErrorFlags);
	}
	
	/**
	 * Gets the reference for attribute wsEditSelectErrorFlagx.
	 * @return the wsEditSelectErrorFlagx attribute reference
	 */
	public RangeReference getWsEditSelectErrorFlagxReference() {
		return wsEditSelectErrorFlagx.getReference();
	}	
				
	/**
	 * Setter for wsEditSelectErrorFlagx .
	 */
   	public void setWsEditSelectErrorFlagx(RangeReference reference) {
       	wsEditSelectErrorFlagx.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Indexed getter for group wsEditSelectErrors attribute.
	 * @param indexes the indexes
	 * @return wsEditSelectErrors attribute
	 */
	public RangeReference getItemFromWsEditSelectErrorsReference(Integer... indexes){
		return wsEditSelectErrors.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group wsEditSelectErrors attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromWsEditSelectErrors( RangeReference rangeReference, Integer... indexes){
		wsEditSelectErrors.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group wsEditSelectErrors attribute.
	 * @return  the collection size for attributewsEditSelectErrors
	 */
	public int getWsEditSelectErrorsSize(){
		return wsEditSelectErrors.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for wsRowCrdselectError attribute.
	 * @param indexes the indexes
	 * @return wsRowCrdselectError attribute
	 */
	public ElementaryRangeReference getItemFromWsRowCrdselectErrorReference(Integer... indexes) {
		return wsRowCrdselectError.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for wsRowCrdselectError attribute.
	 * @param indexes the indexes
	 * @return wsRowCrdselectError attribute
	 */
	public String getItemFromWsRowCrdselectError(Integer... indexes) {
		return wsRowCrdselectError.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for wsRowCrdselectError attribute.
	 * @param wsRowCrdselectError the new value of wsRowCrdselectError for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsRowCrdselectError(String wsRowCrdselectError,Integer... indexes) {
		this.wsRowCrdselectError.setIndexedValue(wsRowCrdselectError,indexes);
	}
	
	/**
	 * Collection size getter for wsRowCrdselectError attribute.
	 * @return  the collection size for attributewsRowCrdselectError
	 */
	public int getWsRowCrdselectErrorSize(){
		return wsRowCrdselectError.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for wsRowCrdselectError attribute.
	 * @param indexes the indexes
	 * @return wsRowCrdselectError attribute
	 */
	public ElementaryRangeReference getWsRowCrdselectErrorReference() {
		return wsRowCrdselectError.getReference();
	}
	
	/**
	 * Indexed getter for wsRowCrdselectError attribute.
	 * @param indexes the indexes
	 * @return wsRowCrdselectError attribute
	 */
	public String getWsRowCrdselectError() {
		return wsRowCrdselectError.getValue();
	}
	
	/**
	 * Indexed setter for wsRowCrdselectError attribute.
	 * @param wsRowCrdselectError the new value of wsRowCrdselectError for given indexes
	 * @param indexes the indexes
	 */
	public void setWsRowCrdselectError(String wsRowCrdselectError) {
		this.wsRowCrdselectError.setValue(wsRowCrdselectError);
	}
	
	/**
	 * Getter for wsRowSelectError attribute.
	 * @param indexes the indexes
	 * @return wsRowSelectError attribute
	 */
	public ConditionReference getItemFromWsRowSelectError(Integer... indexes) {
		return wsRowCrdselectError.getIndexedConditionReference(wsRowSelectError, indexes);
	}
	
	/**
	 * Indexed getter for wsRowSelectError attribute.
	 * @param indexes the indexes
	 * @return wsRowSelectError attribute
	 */
	public Boolean isItemFromWsRowSelectError(Integer... indexes) {
		return wsRowCrdselectError.getIndexedConditionReference(wsRowSelectError, indexes).getValue();
	}
	
	/**
	 * Indexed setter for wsRowSelectError attribute.
	 * @param wsRowSelectErrorValue the new value of wsRowSelectError for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromWsRowSelectError(Boolean wsRowSelectErrorValue, Integer... indexes) {
		wsRowCrdselectError.getIndexedConditionReference(wsRowSelectError, indexes).setValue(wsRowSelectErrorValue);
	}
	
	
	/**
	 * Gets the reference for attribute wsSubscriptVars.
	 * @return the wsSubscriptVars attribute reference
	 */
	public RangeReference getWsSubscriptVarsReference() {
		return wsSubscriptVars.getReference();
	}	
				
	/**
	 * Setter for wsSubscriptVars .
	 */
   	public void setWsSubscriptVars(RangeReference reference) {
       	wsSubscriptVars.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute i.
	 * @return the i attribute reference
	 */
	public ElementaryRangeReference getIReference() {
		return i.getReference();
	}

	/**
	 * Getter for i attribute.
	 * @return i attribute
	 */
	public int getI() {
		return i.getValue();
	}

	/**
	 * Setter for i attribute.
	 * @param i the new value of i
	 */
	public void setI(int i) {
		this.i.setValue(i);
	}
	/**
	 * Gets the reference for attribute iSelected.
	 * @return the iSelected attribute reference
	 */
	public ElementaryRangeReference getISelectedReference() {
		return iSelected.getReference();
	}

	/**
	 * Getter for iSelected attribute.
	 * @return iSelected attribute
	 */
	public int getISelected() {
		return iSelected.getValue();
	}

	/**
	 * Setter for iSelected attribute.
	 * @param iSelected the new value of iSelected
	 */
	public void setISelected(int iSelected) {
		this.iSelected.setValue(iSelected);
	}
	/**
	 * Gets the reference for attribute detailWasRequested.
	 * @return the detailWasRequested attribute reference
	 */
	public ConditionReference getDetailWasRequestedReference() {
		return iSelected.getCondition(detailWasRequested);	
	}

	/**
	 * Getter for detailWasRequested attribute.
	 * @return detailWasRequested attribute
	 */
	public boolean isDetailWasRequested() {
		return getDetailWasRequestedReference().getValue();	
	}

	/**
	 * Setter for detailWasRequested attribute.
	 * @param detailWasRequested the new value of detailWasRequested
	 */
	public void setDetailWasRequested(boolean detailWasRequested) {
		getDetailWasRequestedReference().setValue(detailWasRequested);	
	}
	
	/**
	 * Gets the reference for attribute cicsOutputEditVars.
	 * @return the cicsOutputEditVars attribute reference
	 */
	public RangeReference getCicsOutputEditVarsReference() {
		return cicsOutputEditVars.getReference();
	}	
				
	/**
	 * Setter for cicsOutputEditVars .
	 */
   	public void setCicsOutputEditVars(RangeReference reference) {
       	cicsOutputEditVars.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute cardAcctIdX.
	 * @return the cardAcctIdX attribute reference
	 */
	public ElementaryRangeReference getCardAcctIdXReference() {
		return cardAcctIdX.getReference();
	}

	/**
	 * Getter for cardAcctIdX attribute.
	 * @return cardAcctIdX attribute
	 */
	public String getCardAcctIdX() {
		return cardAcctIdX.getValue();
	}

	/**
	 * Setter for cardAcctIdX attribute.
	 * @param cardAcctIdX the new value of cardAcctIdX
	 */
	public void setCardAcctIdX(String cardAcctIdX) {
		this.cardAcctIdX.setValue(cardAcctIdX);
	}
	/**
	 * Gets the reference for attribute cardAcctIdN.
	 * @return the cardAcctIdN attribute reference
	 */
	public ElementaryRangeReference getCardAcctIdNReference() {
		return cardAcctIdN.getReference();
	}

	/**
	 * Getter for cardAcctIdN attribute.
	 * @return cardAcctIdN attribute
	 */
	public long getCardAcctIdN() {
		return cardAcctIdN.getValue();
	}

	/**
	 * Setter for cardAcctIdN attribute.
	 * @param cardAcctIdN the new value of cardAcctIdN
	 */
	public void setCardAcctIdN(long cardAcctIdN) {
		this.cardAcctIdN.setValue(cardAcctIdN);
	}
	/**
	 * Gets the reference for attribute cardCvvCdX.
	 * @return the cardCvvCdX attribute reference
	 */
	public ElementaryRangeReference getCardCvvCdXReference() {
		return cardCvvCdX.getReference();
	}

	/**
	 * Getter for cardCvvCdX attribute.
	 * @return cardCvvCdX attribute
	 */
	public String getCardCvvCdX() {
		return cardCvvCdX.getValue();
	}

	/**
	 * Setter for cardCvvCdX attribute.
	 * @param cardCvvCdX the new value of cardCvvCdX
	 */
	public void setCardCvvCdX(String cardCvvCdX) {
		this.cardCvvCdX.setValue(cardCvvCdX);
	}
	/**
	 * Gets the reference for attribute cardCvvCdN.
	 * @return the cardCvvCdN attribute reference
	 */
	public ElementaryRangeReference getCardCvvCdNReference() {
		return cardCvvCdN.getReference();
	}

	/**
	 * Getter for cardCvvCdN attribute.
	 * @return cardCvvCdN attribute
	 */
	public int getCardCvvCdN() {
		return cardCvvCdN.getValue();
	}

	/**
	 * Setter for cardCvvCdN attribute.
	 * @param cardCvvCdN the new value of cardCvvCdN
	 */
	public void setCardCvvCdN(int cardCvvCdN) {
		this.cardCvvCdN.setValue(cardCvvCdN);
	}
	/**
	 * Gets the reference for attribute flgProtectSelectRows.
	 * @return the flgProtectSelectRows attribute reference
	 */
	public ElementaryRangeReference getFlgProtectSelectRowsReference() {
		return flgProtectSelectRows.getReference();
	}

	/**
	 * Getter for flgProtectSelectRows attribute.
	 * @return flgProtectSelectRows attribute
	 */
	public String getFlgProtectSelectRows() {
		return flgProtectSelectRows.getValue();
	}

	/**
	 * Setter for flgProtectSelectRows attribute.
	 * @param flgProtectSelectRows the new value of flgProtectSelectRows
	 */
	public void setFlgProtectSelectRows(String flgProtectSelectRows) {
		this.flgProtectSelectRows.setValue(flgProtectSelectRows);
	}
	/**
	 * Gets the reference for attribute flgProtectSelectRowsNo.
	 * @return the flgProtectSelectRowsNo attribute reference
	 */
	public ConditionReference getFlgProtectSelectRowsNoReference() {
		return flgProtectSelectRows.getCondition(flgProtectSelectRowsNo);	
	}

	/**
	 * Getter for flgProtectSelectRowsNo attribute.
	 * @return flgProtectSelectRowsNo attribute
	 */
	public boolean isFlgProtectSelectRowsNo() {
		return getFlgProtectSelectRowsNoReference().getValue();	
	}

	/**
	 * Setter for flgProtectSelectRowsNo attribute.
	 * @param flgProtectSelectRowsNo the new value of flgProtectSelectRowsNo
	 */
	public void setFlgProtectSelectRowsNo(boolean flgProtectSelectRowsNo) {
		getFlgProtectSelectRowsNoReference().setValue(flgProtectSelectRowsNo);	
	}
	/**
	 * Gets the reference for attribute flgProtectSelectRowsYes.
	 * @return the flgProtectSelectRowsYes attribute reference
	 */
	public ConditionReference getFlgProtectSelectRowsYesReference() {
		return flgProtectSelectRows.getCondition(flgProtectSelectRowsYes);	
	}

	/**
	 * Getter for flgProtectSelectRowsYes attribute.
	 * @return flgProtectSelectRowsYes attribute
	 */
	public boolean isFlgProtectSelectRowsYes() {
		return getFlgProtectSelectRowsYesReference().getValue();	
	}

	/**
	 * Setter for flgProtectSelectRowsYes attribute.
	 * @param flgProtectSelectRowsYes the new value of flgProtectSelectRowsYes
	 */
	public void setFlgProtectSelectRowsYes(boolean flgProtectSelectRowsYes) {
		getFlgProtectSelectRowsYesReference().setValue(flgProtectSelectRowsYes);	
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
	 * Gets the reference for attribute wsInformRecActions.
	 * @return the wsInformRecActions attribute reference
	 */
	public ConditionReference getWsInformRecActionsReference() {
		return wsInfoMsg.getCondition(wsInformRecActions);	
	}

	/**
	 * Getter for wsInformRecActions attribute.
	 * @return wsInformRecActions attribute
	 */
	public boolean isWsInformRecActions() {
		return getWsInformRecActionsReference().getValue();	
	}

	/**
	 * Setter for wsInformRecActions attribute.
	 * @param wsInformRecActions the new value of wsInformRecActions
	 */
	public void setWsInformRecActions(boolean wsInformRecActions) {
		getWsInformRecActionsReference().setValue(wsInformRecActions);	
	}
	/**
	 * Gets the reference for attribute wsErrorMsg.
	 * @return the wsErrorMsg attribute reference
	 */
	public ElementaryRangeReference getWsErrorMsgReference() {
		return wsErrorMsg.getReference();
	}

	/**
	 * Getter for wsErrorMsg attribute.
	 * @return wsErrorMsg attribute
	 */
	public String getWsErrorMsg() {
		return wsErrorMsg.getValue();
	}

	/**
	 * Setter for wsErrorMsg attribute.
	 * @param wsErrorMsg the new value of wsErrorMsg
	 */
	public void setWsErrorMsg(String wsErrorMsg) {
		this.wsErrorMsg.setValue(wsErrorMsg);
	}
	/**
	 * Gets the reference for attribute wsErrorMsgOff.
	 * @return the wsErrorMsgOff attribute reference
	 */
	public ConditionReference getWsErrorMsgOffReference() {
		return wsErrorMsg.getCondition(wsErrorMsgOff);	
	}

	/**
	 * Getter for wsErrorMsgOff attribute.
	 * @return wsErrorMsgOff attribute
	 */
	public boolean isWsErrorMsgOff() {
		return getWsErrorMsgOffReference().getValue();	
	}

	/**
	 * Setter for wsErrorMsgOff attribute.
	 * @param wsErrorMsgOff the new value of wsErrorMsgOff
	 */
	public void setWsErrorMsgOff(boolean wsErrorMsgOff) {
		getWsErrorMsgOffReference().setValue(wsErrorMsgOff);	
	}
	/**
	 * Gets the reference for attribute wsExitMessage.
	 * @return the wsExitMessage attribute reference
	 */
	public ConditionReference getWsExitMessageReference() {
		return wsErrorMsg.getCondition(wsExitMessage);	
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
	 * Gets the reference for attribute wsNoRecordsFound.
	 * @return the wsNoRecordsFound attribute reference
	 */
	public ConditionReference getWsNoRecordsFoundReference() {
		return wsErrorMsg.getCondition(wsNoRecordsFound);	
	}

	/**
	 * Getter for wsNoRecordsFound attribute.
	 * @return wsNoRecordsFound attribute
	 */
	public boolean isWsNoRecordsFound() {
		return getWsNoRecordsFoundReference().getValue();	
	}

	/**
	 * Setter for wsNoRecordsFound attribute.
	 * @param wsNoRecordsFound the new value of wsNoRecordsFound
	 */
	public void setWsNoRecordsFound(boolean wsNoRecordsFound) {
		getWsNoRecordsFoundReference().setValue(wsNoRecordsFound);	
	}
	/**
	 * Gets the reference for attribute wsMoreThan1Action.
	 * @return the wsMoreThan1Action attribute reference
	 */
	public ConditionReference getWsMoreThan1ActionReference() {
		return wsErrorMsg.getCondition(wsMoreThan1Action);	
	}

	/**
	 * Getter for wsMoreThan1Action attribute.
	 * @return wsMoreThan1Action attribute
	 */
	public boolean isWsMoreThan1Action() {
		return getWsMoreThan1ActionReference().getValue();	
	}

	/**
	 * Setter for wsMoreThan1Action attribute.
	 * @param wsMoreThan1Action the new value of wsMoreThan1Action
	 */
	public void setWsMoreThan1Action(boolean wsMoreThan1Action) {
		getWsMoreThan1ActionReference().setValue(wsMoreThan1Action);	
	}
	/**
	 * Gets the reference for attribute wsInvalidActionCode.
	 * @return the wsInvalidActionCode attribute reference
	 */
	public ConditionReference getWsInvalidActionCodeReference() {
		return wsErrorMsg.getCondition(wsInvalidActionCode);	
	}

	/**
	 * Getter for wsInvalidActionCode attribute.
	 * @return wsInvalidActionCode attribute
	 */
	public boolean isWsInvalidActionCode() {
		return getWsInvalidActionCodeReference().getValue();	
	}

	/**
	 * Setter for wsInvalidActionCode attribute.
	 * @param wsInvalidActionCode the new value of wsInvalidActionCode
	 */
	public void setWsInvalidActionCode(boolean wsInvalidActionCode) {
		getWsInvalidActionCodeReference().setValue(wsInvalidActionCode);	
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
	 * Gets the reference for attribute wsContextFlag.
	 * @return the wsContextFlag attribute reference
	 */
	public ElementaryRangeReference getWsContextFlagReference() {
		return wsContextFlag.getReference();
	}

	/**
	 * Getter for wsContextFlag attribute.
	 * @return wsContextFlag attribute
	 */
	public String getWsContextFlag() {
		return wsContextFlag.getValue();
	}

	/**
	 * Setter for wsContextFlag attribute.
	 * @param wsContextFlag the new value of wsContextFlag
	 */
	public void setWsContextFlag(String wsContextFlag) {
		this.wsContextFlag.setValue(wsContextFlag);
	}
	/**
	 * Gets the reference for attribute wsContextFreshStart.
	 * @return the wsContextFreshStart attribute reference
	 */
	public ConditionReference getWsContextFreshStartReference() {
		return wsContextFlag.getCondition(wsContextFreshStart);	
	}

	/**
	 * Getter for wsContextFreshStart attribute.
	 * @return wsContextFreshStart attribute
	 */
	public boolean isWsContextFreshStart() {
		return getWsContextFreshStartReference().getValue();	
	}

	/**
	 * Setter for wsContextFreshStart attribute.
	 * @param wsContextFreshStart the new value of wsContextFreshStart
	 */
	public void setWsContextFreshStart(boolean wsContextFreshStart) {
		getWsContextFreshStartReference().setValue(wsContextFreshStart);	
	}
	/**
	 * Gets the reference for attribute wsContextFreshStartNo.
	 * @return the wsContextFreshStartNo attribute reference
	 */
	public ConditionReference getWsContextFreshStartNoReference() {
		return wsContextFlag.getCondition(wsContextFreshStartNo);	
	}

	/**
	 * Getter for wsContextFreshStartNo attribute.
	 * @return wsContextFreshStartNo attribute
	 */
	public boolean isWsContextFreshStartNo() {
		return getWsContextFreshStartNoReference().getValue();	
	}

	/**
	 * Setter for wsContextFreshStartNo attribute.
	 * @param wsContextFreshStartNo the new value of wsContextFreshStartNo
	 */
	public void setWsContextFreshStartNo(boolean wsContextFreshStartNo) {
		getWsContextFreshStartNoReference().setValue(wsContextFreshStartNo);	
	}
	
	/**
	 * Gets the reference for attribute wsFileHandlingVars.
	 * @return the wsFileHandlingVars attribute reference
	 */
	public RangeReference getWsFileHandlingVarsReference() {
		return wsFileHandlingVars.getReference();
	}	
				
	/**
	 * Setter for wsFileHandlingVars .
	 */
   	public void setWsFileHandlingVars(RangeReference reference) {
       	wsFileHandlingVars.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute wsCardRid.
	 * @return the wsCardRid attribute reference
	 */
	public RangeReference getWsCardRidReference() {
		return wsCardRid.getReference();
	}	
				
	/**
	 * Setter for wsCardRid .
	 */
   	public void setWsCardRid(RangeReference reference) {
       	wsCardRid.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute wsScrnCounter.
	 * @return the wsScrnCounter attribute reference
	 */
	public ElementaryRangeReference getWsScrnCounterReference() {
		return wsScrnCounter.getReference();
	}

	/**
	 * Getter for wsScrnCounter attribute.
	 * @return wsScrnCounter attribute
	 */
	public int getWsScrnCounter() {
		return wsScrnCounter.getValue();
	}

	/**
	 * Setter for wsScrnCounter attribute.
	 * @param wsScrnCounter the new value of wsScrnCounter
	 */
	public void setWsScrnCounter(int wsScrnCounter) {
		this.wsScrnCounter.setValue(wsScrnCounter);
	}
	/**
	 * Gets the reference for attribute wsFilterRecordFlag.
	 * @return the wsFilterRecordFlag attribute reference
	 */
	public ElementaryRangeReference getWsFilterRecordFlagReference() {
		return wsFilterRecordFlag.getReference();
	}

	/**
	 * Getter for wsFilterRecordFlag attribute.
	 * @return wsFilterRecordFlag attribute
	 */
	public String getWsFilterRecordFlag() {
		return wsFilterRecordFlag.getValue();
	}

	/**
	 * Setter for wsFilterRecordFlag attribute.
	 * @param wsFilterRecordFlag the new value of wsFilterRecordFlag
	 */
	public void setWsFilterRecordFlag(String wsFilterRecordFlag) {
		this.wsFilterRecordFlag.setValue(wsFilterRecordFlag);
	}
	/**
	 * Gets the reference for attribute wsExcludeThisRecord.
	 * @return the wsExcludeThisRecord attribute reference
	 */
	public ConditionReference getWsExcludeThisRecordReference() {
		return wsFilterRecordFlag.getCondition(wsExcludeThisRecord);	
	}

	/**
	 * Getter for wsExcludeThisRecord attribute.
	 * @return wsExcludeThisRecord attribute
	 */
	public boolean isWsExcludeThisRecord() {
		return getWsExcludeThisRecordReference().getValue();	
	}

	/**
	 * Setter for wsExcludeThisRecord attribute.
	 * @param wsExcludeThisRecord the new value of wsExcludeThisRecord
	 */
	public void setWsExcludeThisRecord(boolean wsExcludeThisRecord) {
		getWsExcludeThisRecordReference().setValue(wsExcludeThisRecord);	
	}
	/**
	 * Gets the reference for attribute wsDonotExcludeThisRecord.
	 * @return the wsDonotExcludeThisRecord attribute reference
	 */
	public ConditionReference getWsDonotExcludeThisRecordReference() {
		return wsFilterRecordFlag.getCondition(wsDonotExcludeThisRecord);	
	}

	/**
	 * Getter for wsDonotExcludeThisRecord attribute.
	 * @return wsDonotExcludeThisRecord attribute
	 */
	public boolean isWsDonotExcludeThisRecord() {
		return getWsDonotExcludeThisRecordReference().getValue();	
	}

	/**
	 * Setter for wsDonotExcludeThisRecord attribute.
	 * @param wsDonotExcludeThisRecord the new value of wsDonotExcludeThisRecord
	 */
	public void setWsDonotExcludeThisRecord(boolean wsDonotExcludeThisRecord) {
		getWsDonotExcludeThisRecordReference().setValue(wsDonotExcludeThisRecord);	
	}
	/**
	 * Gets the reference for attribute wsRecordsToProcessFlag.
	 * @return the wsRecordsToProcessFlag attribute reference
	 */
	public ElementaryRangeReference getWsRecordsToProcessFlagReference() {
		return wsRecordsToProcessFlag.getReference();
	}

	/**
	 * Getter for wsRecordsToProcessFlag attribute.
	 * @return wsRecordsToProcessFlag attribute
	 */
	public String getWsRecordsToProcessFlag() {
		return wsRecordsToProcessFlag.getValue();
	}

	/**
	 * Setter for wsRecordsToProcessFlag attribute.
	 * @param wsRecordsToProcessFlag the new value of wsRecordsToProcessFlag
	 */
	public void setWsRecordsToProcessFlag(String wsRecordsToProcessFlag) {
		this.wsRecordsToProcessFlag.setValue(wsRecordsToProcessFlag);
	}
	/**
	 * Gets the reference for attribute readLoopExit.
	 * @return the readLoopExit attribute reference
	 */
	public ConditionReference getReadLoopExitReference() {
		return wsRecordsToProcessFlag.getCondition(readLoopExit);	
	}

	/**
	 * Getter for readLoopExit attribute.
	 * @return readLoopExit attribute
	 */
	public boolean isReadLoopExit() {
		return getReadLoopExitReference().getValue();	
	}

	/**
	 * Setter for readLoopExit attribute.
	 * @param readLoopExit the new value of readLoopExit
	 */
	public void setReadLoopExit(boolean readLoopExit) {
		getReadLoopExitReference().setValue(readLoopExit);	
	}
	/**
	 * Gets the reference for attribute moreRecordsToRead.
	 * @return the moreRecordsToRead attribute reference
	 */
	public ConditionReference getMoreRecordsToReadReference() {
		return wsRecordsToProcessFlag.getCondition(moreRecordsToRead);	
	}

	/**
	 * Getter for moreRecordsToRead attribute.
	 * @return moreRecordsToRead attribute
	 */
	public boolean isMoreRecordsToRead() {
		return getMoreRecordsToReadReference().getValue();	
	}

	/**
	 * Setter for moreRecordsToRead attribute.
	 * @param moreRecordsToRead the new value of moreRecordsToRead
	 */
	public void setMoreRecordsToRead(boolean moreRecordsToRead) {
		getMoreRecordsToReadReference().setValue(moreRecordsToRead);	
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
}
