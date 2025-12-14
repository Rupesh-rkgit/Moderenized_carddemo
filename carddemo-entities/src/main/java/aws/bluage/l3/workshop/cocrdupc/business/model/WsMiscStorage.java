package aws.bluage.l3.workshop.cocrdupc.business.model;

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
import java.math.BigDecimal;
import org.apache.commons.lang3.tuple.Pair;
/**
 * Data simplifier entity WsMiscStorage.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *   Program:     COCRDUPC.CBL                                     *<br>
 *   Layer:       Business logic                                   *<br>
 *   Function:    Accept and process credit card detail request    *<br>
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
 * <p>About 'wsCicsProcessngVars' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.WsCicsProcessngVars
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
 * <p>About 'wsEditCardnameFlag' field, <br>
 * </p>
 * 
 * <p>About 'flgCardnameNotOk' field, <br>
 * </p>
 * 
 * <p>About 'flgCardnameIsvalid' field, <br>
 * </p>
 * 
 * <p>About 'flgCardnameBlank' field, <br>
 * </p>
 * 
 * <p>About 'wsEditCardstatusFlag' field, <br>
 * </p>
 * 
 * <p>About 'flgCardstatusNotOk' field, <br>
 * </p>
 * 
 * <p>About 'flgCardstatusIsvalid' field, <br>
 * </p>
 * 
 * <p>About 'flgCardstatusBlank' field, <br>
 * </p>
 * 
 * <p>About 'wsEditCardexpmonFlag' field, <br>
 * </p>
 * 
 * <p>About 'flgCardexpmonNotOk' field, <br>
 * </p>
 * 
 * <p>About 'flgCardexpmonIsvalid' field, <br>
 * </p>
 * 
 * <p>About 'flgCardexpmonBlank' field, <br>
 * </p>
 * 
 * <p>About 'wsEditCardexpyearFlag' field, <br>
 * </p>
 * 
 * <p>About 'flgCardexpyearNotOk' field, <br>
 * </p>
 * 
 * <p>About 'flgCardexpyearIsvalid' field, <br>
 * </p>
 * 
 * <p>About 'flgCardexpyearBlank' field, <br>
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
 * <p>About 'wsPfkFlag' field, <br>
 * </p>
 * 
 * <p>About 'pfkValid' field, <br>
 * </p>
 * 
 * <p>About 'pfkInvalid' field, <br>
 * </p>
 * 
 * <p>About 'cardNameCheck' field, <br>
 * </p>
 * 
 * <p>About 'flgYesNoCheck' field, <br>
 * </p>
 * 
 * <p>About 'flgYesNoValid' field, <br>
 * </p>
 * 
 * <p>About 'cardMonthCheck' field, <br>
 * </p>
 * 
 * <p>About 'cardMonthCheckN' field, <br>
 * </p>
 * 
 * <p>About 'validMonth' field, <br>
 * </p>
 * 
 * <p>About 'cardYearCheck' field, <br>
 * </p>
 * 
 * <p>About 'cardYearCheckN' field, <br>
 * </p>
 * 
 * <p>About 'validYear' field, <br>
 * </p>
 * 
 * <p>About 'cicsOutputEditVars' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CicsOutputEditVars
 * <br></p>
 * 
 * <p>About 'wsCardRid' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.WsCardRid
 * <br></p>
 * 
 * <p>About 'wsFileErrorMessage' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.WsFileErrorMessage
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
 * <p>About 'foundCardsForAccount' field, <br>
 * </p>
 * 
 * <p>About 'promptForSearchKeys' field, <br>
 * </p>
 * 
 * <p>About 'promptForChanges' field, <br>
 * </p>
 * 
 * <p>About 'promptForConfirmation' field, <br>
 * </p>
 * 
 * <p>About 'confirmUpdateSuccess' field, <br>
 * </p>
 * 
 * <p>About 'informFailure' field, <br>
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
 * <p>About 'wsPromptForCard' field, <br>
 * </p>
 * 
 * <p>About 'wsPromptForName' field, <br>
 * </p>
 * 
 * <p>About 'wsNameMustBeAlpha' field, <br>
 * </p>
 * 
 * <p>About 'noSearchCriteriaReceived' field, <br>
 * </p>
 * 
 * <p>About 'noChangesDetected' field, <br>
 * </p>
 * 
 * <p>About 'searchedAcctZeroes' field, <br>
 * </p>
 * 
 * <p>About 'searchedAcctNotNumeric' field, <br>
 * </p>
 * 
 * <p>About 'searchedCardNotNumeric' field, <br>
 * </p>
 * 
 * <p>About 'cardStatusMustBeYesNo' field, <br>
 * </p>
 * 
 * <p>About 'cardExpiryMonthNotValid' field, <br>
 * </p>
 * 
 * <p>About 'cardExpiryYearNotValid' field, <br>
 * </p>
 * 
 * <p>About 'didNotFindAcctInCardxref' field, <br>
 * </p>
 * 
 * <p>About 'didNotFindAcctcardCombo' field, <br>
 * </p>
 * 
 * <p>About 'couldNotLockForUpdate' field, <br>
 * </p>
 * 
 * <p>About 'dataWasChangedBeforeUpdate' field, <br>
 * </p>
 * 
 * <p>About 'lockedButUpdateFailed' field, <br>
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
	private final Elementary wsUctrans = new Elementary(wsCicsProcessngVars,new AlphanumericType(4)," ");
	
	/**
	 * ****************************************************************
	 * Input edits
	 * ****************************************************************
	 */
	private final Elementary wsInputFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName inputOk=new ConditionName(wsInputFlag,"0");
	private final ConditionName inputError=new ConditionName(wsInputFlag,"1");
	private final ConditionName inputPending=new ConditionName(wsInputFlag,Record.LOW_VALUES);
	private final Elementary wsEditAcctFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgAcctfilterNotOk=new ConditionName(wsEditAcctFlag,"0");
	private final ConditionName flgAcctfilterIsvalid=new ConditionName(wsEditAcctFlag,"1");
	private final ConditionName flgAcctfilterBlank=new ConditionName(wsEditAcctFlag," ");
	private final Elementary wsEditCardFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgCardfilterNotOk=new ConditionName(wsEditCardFlag,"0");
	private final ConditionName flgCardfilterIsvalid=new ConditionName(wsEditCardFlag,"1");
	private final ConditionName flgCardfilterBlank=new ConditionName(wsEditCardFlag," ");
	private final Elementary wsEditCardnameFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgCardnameNotOk=new ConditionName(wsEditCardnameFlag,"0");
	private final ConditionName flgCardnameIsvalid=new ConditionName(wsEditCardnameFlag,"1");
	private final ConditionName flgCardnameBlank=new ConditionName(wsEditCardnameFlag," ");
	private final Elementary wsEditCardstatusFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgCardstatusNotOk=new ConditionName(wsEditCardstatusFlag,"0");
	private final ConditionName flgCardstatusIsvalid=new ConditionName(wsEditCardstatusFlag,"1");
	private final ConditionName flgCardstatusBlank=new ConditionName(wsEditCardstatusFlag," ");
	private final Elementary wsEditCardexpmonFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgCardexpmonNotOk=new ConditionName(wsEditCardexpmonFlag,"0");
	private final ConditionName flgCardexpmonIsvalid=new ConditionName(wsEditCardexpmonFlag,"1");
	private final ConditionName flgCardexpmonBlank=new ConditionName(wsEditCardexpmonFlag," ");
	private final Elementary wsEditCardexpyearFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgCardexpyearNotOk=new ConditionName(wsEditCardexpyearFlag,"0");
	private final ConditionName flgCardexpyearIsvalid=new ConditionName(wsEditCardexpyearFlag,"1");
	private final ConditionName flgCardexpyearBlank=new ConditionName(wsEditCardexpyearFlag," ");
	private final Elementary wsReturnFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName wsReturnFlagOff=new ConditionName(wsReturnFlag,Record.LOW_VALUES);
	private final ConditionName wsReturnFlagOn=new ConditionName(wsReturnFlag,"1");
	private final Elementary wsPfkFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName pfkValid=new ConditionName(wsPfkFlag,"0");
	private final ConditionName pfkInvalid=new ConditionName(wsPfkFlag,"1");
	private final Elementary cardNameCheck = new Elementary(root,new AlphanumericType(50),Record.LOW_VALUES);
	private final Elementary flgYesNoCheck = new Elementary(root,new AlphanumericType(1),"N");
	private final ConditionName flgYesNoValid=new ConditionName(flgYesNoCheck,"Y",
	"N");
	private final Union union = new Union(root);
	private final Elementary cardMonthCheck = new Elementary(union,new AlphanumericType(2));
	private final Elementary cardMonthCheckN = new Elementary(union,new ZonedType(2, 0, false));
	private final ConditionName validMonth=new ConditionName(cardMonthCheckN,Pair.of(new BigDecimal("1"),new BigDecimal("12")));
	private final Union union1 = new Union(root);
	private final Elementary cardYearCheck = new Elementary(union1,new AlphanumericType(4));
	private final Elementary cardYearCheckN = new Elementary(union1,new ZonedType(4, 0, false));
	private final ConditionName validYear=new ConditionName(cardYearCheckN,Pair.of(new BigDecimal("1950"),new BigDecimal("2099")));
	
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
	private final Union union4 = new Union(cicsOutputEditVars);
	private final Elementary cardCardNumX = new Elementary(union4,new AlphanumericType(16));
	private final Elementary cardCardNumN = new Elementary(union4,new ZonedType(16, 0, false));
	private final Elementary cardNameEmbossedX = new Elementary(cicsOutputEditVars,new AlphanumericType(50));
	private final Elementary cardStatusX = new Elementary(cicsOutputEditVars,new AlphanumericType(1));
	private final Union union5 = new Union(cicsOutputEditVars);
	private final Elementary cardExpiraionDateX = new Elementary(union5,new AlphanumericType(10));
	private final Group group = new Group(union5);
	private final Elementary cardExpiryYear = new Elementary(group,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(group,new AlphanumericType(1));
	private final Elementary cardExpiryMonth = new Elementary(group,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(group,new AlphanumericType(1));
	private final Elementary cardExpiryDay = new Elementary(group,new AlphanumericType(2));
	private final Elementary cardExpiraionDateN = new Elementary(union5,new ZonedType(10, 0, false));
	
	/**
	 * ****************************************************************
	 * File and data Handling
	 * ****************************************************************
	 */
	private final Group wsCardRid = new Group(root);
	private final Elementary wsCardRidCardnum = new Elementary(wsCardRid,new AlphanumericType(16));
	private final Union union6 = new Union(wsCardRid);
	private final Elementary wsCardRidAcctId = new Elementary(union6,new ZonedType(11, 0, false));
	private final Elementary wsCardRidAcctIdX = new Elementary(union6,new AlphanumericType(11));
	private final Group wsFileErrorMessage = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(wsFileErrorMessage,new AlphanumericType(12),"File Error: ");
	private final Elementary errorOpname = new Elementary(wsFileErrorMessage,new AlphanumericType(8)," ");
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(wsFileErrorMessage,new AlphanumericType(4)," on ");
	private final Elementary errorFile = new Elementary(wsFileErrorMessage,new AlphanumericType(9)," ");
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(wsFileErrorMessage,new AlphanumericType(15)," returned RESP ");
	private final Elementary errorResp = new Elementary(wsFileErrorMessage,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(wsFileErrorMessage,new AlphanumericType(7),",RESP2 ");
	private final Elementary errorResp2 = new Elementary(wsFileErrorMessage,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(wsFileErrorMessage,new AlphanumericType(5)," ");
	
	/**
	 * ****************************************************************
	 * Output Message Construction
	 * ****************************************************************
	 */
	private final Elementary wsLongMsg = new Elementary(root,new AlphanumericType(500));
	private final Elementary wsInfoMsg = new Elementary(root,new AlphanumericType(40));
	private final ConditionName wsNoInfoMessage=new ConditionName(wsInfoMsg," ",
	Record.LOW_VALUES);
	private final ConditionName foundCardsForAccount=new ConditionName(wsInfoMsg,"Details of selected card shown above");
	private final ConditionName promptForSearchKeys=new ConditionName(wsInfoMsg,"Please enter Account and Card Number");
	private final ConditionName promptForChanges=new ConditionName(wsInfoMsg,"Update card details presented above.");
	private final ConditionName promptForConfirmation=new ConditionName(wsInfoMsg,"Changes validated.Press F5 to save");
	private final ConditionName confirmUpdateSuccess=new ConditionName(wsInfoMsg,"Changes committed to database");
	private final ConditionName informFailure=new ConditionName(wsInfoMsg,"Changes unsuccessful. Please try again");
	private final Elementary wsReturnMsg = new Elementary(root,new AlphanumericType(75));
	private final ConditionName wsReturnMsgOff=new ConditionName(wsReturnMsg," ");
	private final ConditionName wsExitMessage=new ConditionName(wsReturnMsg,"PF03 pressed.Exiting              ");
	private final ConditionName wsPromptForAcct=new ConditionName(wsReturnMsg,"Account number not provided");
	private final ConditionName wsPromptForCard=new ConditionName(wsReturnMsg,"Card number not provided");
	private final ConditionName wsPromptForName=new ConditionName(wsReturnMsg,"Card name not provided");
	private final ConditionName wsNameMustBeAlpha=new ConditionName(wsReturnMsg,"Card name can only contain alphabets and spaces");
	private final ConditionName noSearchCriteriaReceived=new ConditionName(wsReturnMsg,"No input received");
	private final ConditionName noChangesDetected=new ConditionName(wsReturnMsg,"No change detected with respect to values fetched.");
	private final ConditionName searchedAcctZeroes=new ConditionName(wsReturnMsg,"Account number must be a non zero 11 digit number");
	private final ConditionName searchedAcctNotNumeric=new ConditionName(wsReturnMsg,"Account number must be a non zero 11 digit number");
	private final ConditionName searchedCardNotNumeric=new ConditionName(wsReturnMsg,"Card number if supplied must be a 16 digit number");
	private final ConditionName cardStatusMustBeYesNo=new ConditionName(wsReturnMsg,"Card Active Status must be Y or N");
	private final ConditionName cardExpiryMonthNotValid=new ConditionName(wsReturnMsg,"Card expiry month must be between 1 and 12");
	private final ConditionName cardExpiryYearNotValid=new ConditionName(wsReturnMsg,"Invalid card expiry year");
	private final ConditionName didNotFindAcctInCardxref=new ConditionName(wsReturnMsg,"Did not find this account in cards database");
	private final ConditionName didNotFindAcctcardCombo=new ConditionName(wsReturnMsg,"Did not find cards for this search condition");
	private final ConditionName couldNotLockForUpdate=new ConditionName(wsReturnMsg,"Could not lock record for update");
	private final ConditionName dataWasChangedBeforeUpdate=new ConditionName(wsReturnMsg,"Record changed by some one else. Please review");
	private final ConditionName lockedButUpdateFailed=new ConditionName(wsReturnMsg,"Update of record failed");
	private final ConditionName xrefReadError=new ConditionName(wsReturnMsg,"Error reading Card Data File");
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
	 * Gets the reference for attribute wsUctrans.
	 * @return the wsUctrans attribute reference
	 */
	public ElementaryRangeReference getWsUctransReference() {
		return wsUctrans.getReference();
	}

	/**
	 * Getter for wsUctrans attribute.
	 * @return wsUctrans attribute
	 */
	public String getWsUctrans() {
		return wsUctrans.getValue();
	}

	/**
	 * Setter for wsUctrans attribute.
	 * @param wsUctrans the new value of wsUctrans
	 */
	public void setWsUctrans(String wsUctrans) {
		this.wsUctrans.setValue(wsUctrans);
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
	 * Gets the reference for attribute wsEditCardnameFlag.
	 * @return the wsEditCardnameFlag attribute reference
	 */
	public ElementaryRangeReference getWsEditCardnameFlagReference() {
		return wsEditCardnameFlag.getReference();
	}

	/**
	 * Getter for wsEditCardnameFlag attribute.
	 * @return wsEditCardnameFlag attribute
	 */
	public String getWsEditCardnameFlag() {
		return wsEditCardnameFlag.getValue();
	}

	/**
	 * Setter for wsEditCardnameFlag attribute.
	 * @param wsEditCardnameFlag the new value of wsEditCardnameFlag
	 */
	public void setWsEditCardnameFlag(String wsEditCardnameFlag) {
		this.wsEditCardnameFlag.setValue(wsEditCardnameFlag);
	}
	/**
	 * Gets the reference for attribute flgCardnameNotOk.
	 * @return the flgCardnameNotOk attribute reference
	 */
	public ConditionReference getFlgCardnameNotOkReference() {
		return wsEditCardnameFlag.getCondition(flgCardnameNotOk);	
	}

	/**
	 * Getter for flgCardnameNotOk attribute.
	 * @return flgCardnameNotOk attribute
	 */
	public boolean isFlgCardnameNotOk() {
		return getFlgCardnameNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCardnameNotOk attribute.
	 * @param flgCardnameNotOk the new value of flgCardnameNotOk
	 */
	public void setFlgCardnameNotOk(boolean flgCardnameNotOk) {
		getFlgCardnameNotOkReference().setValue(flgCardnameNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCardnameIsvalid.
	 * @return the flgCardnameIsvalid attribute reference
	 */
	public ConditionReference getFlgCardnameIsvalidReference() {
		return wsEditCardnameFlag.getCondition(flgCardnameIsvalid);	
	}

	/**
	 * Getter for flgCardnameIsvalid attribute.
	 * @return flgCardnameIsvalid attribute
	 */
	public boolean isFlgCardnameIsvalid() {
		return getFlgCardnameIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCardnameIsvalid attribute.
	 * @param flgCardnameIsvalid the new value of flgCardnameIsvalid
	 */
	public void setFlgCardnameIsvalid(boolean flgCardnameIsvalid) {
		getFlgCardnameIsvalidReference().setValue(flgCardnameIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCardnameBlank.
	 * @return the flgCardnameBlank attribute reference
	 */
	public ConditionReference getFlgCardnameBlankReference() {
		return wsEditCardnameFlag.getCondition(flgCardnameBlank);	
	}

	/**
	 * Getter for flgCardnameBlank attribute.
	 * @return flgCardnameBlank attribute
	 */
	public boolean isFlgCardnameBlank() {
		return getFlgCardnameBlankReference().getValue();	
	}

	/**
	 * Setter for flgCardnameBlank attribute.
	 * @param flgCardnameBlank the new value of flgCardnameBlank
	 */
	public void setFlgCardnameBlank(boolean flgCardnameBlank) {
		getFlgCardnameBlankReference().setValue(flgCardnameBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCardstatusFlag.
	 * @return the wsEditCardstatusFlag attribute reference
	 */
	public ElementaryRangeReference getWsEditCardstatusFlagReference() {
		return wsEditCardstatusFlag.getReference();
	}

	/**
	 * Getter for wsEditCardstatusFlag attribute.
	 * @return wsEditCardstatusFlag attribute
	 */
	public String getWsEditCardstatusFlag() {
		return wsEditCardstatusFlag.getValue();
	}

	/**
	 * Setter for wsEditCardstatusFlag attribute.
	 * @param wsEditCardstatusFlag the new value of wsEditCardstatusFlag
	 */
	public void setWsEditCardstatusFlag(String wsEditCardstatusFlag) {
		this.wsEditCardstatusFlag.setValue(wsEditCardstatusFlag);
	}
	/**
	 * Gets the reference for attribute flgCardstatusNotOk.
	 * @return the flgCardstatusNotOk attribute reference
	 */
	public ConditionReference getFlgCardstatusNotOkReference() {
		return wsEditCardstatusFlag.getCondition(flgCardstatusNotOk);	
	}

	/**
	 * Getter for flgCardstatusNotOk attribute.
	 * @return flgCardstatusNotOk attribute
	 */
	public boolean isFlgCardstatusNotOk() {
		return getFlgCardstatusNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCardstatusNotOk attribute.
	 * @param flgCardstatusNotOk the new value of flgCardstatusNotOk
	 */
	public void setFlgCardstatusNotOk(boolean flgCardstatusNotOk) {
		getFlgCardstatusNotOkReference().setValue(flgCardstatusNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCardstatusIsvalid.
	 * @return the flgCardstatusIsvalid attribute reference
	 */
	public ConditionReference getFlgCardstatusIsvalidReference() {
		return wsEditCardstatusFlag.getCondition(flgCardstatusIsvalid);	
	}

	/**
	 * Getter for flgCardstatusIsvalid attribute.
	 * @return flgCardstatusIsvalid attribute
	 */
	public boolean isFlgCardstatusIsvalid() {
		return getFlgCardstatusIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCardstatusIsvalid attribute.
	 * @param flgCardstatusIsvalid the new value of flgCardstatusIsvalid
	 */
	public void setFlgCardstatusIsvalid(boolean flgCardstatusIsvalid) {
		getFlgCardstatusIsvalidReference().setValue(flgCardstatusIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCardstatusBlank.
	 * @return the flgCardstatusBlank attribute reference
	 */
	public ConditionReference getFlgCardstatusBlankReference() {
		return wsEditCardstatusFlag.getCondition(flgCardstatusBlank);	
	}

	/**
	 * Getter for flgCardstatusBlank attribute.
	 * @return flgCardstatusBlank attribute
	 */
	public boolean isFlgCardstatusBlank() {
		return getFlgCardstatusBlankReference().getValue();	
	}

	/**
	 * Setter for flgCardstatusBlank attribute.
	 * @param flgCardstatusBlank the new value of flgCardstatusBlank
	 */
	public void setFlgCardstatusBlank(boolean flgCardstatusBlank) {
		getFlgCardstatusBlankReference().setValue(flgCardstatusBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCardexpmonFlag.
	 * @return the wsEditCardexpmonFlag attribute reference
	 */
	public ElementaryRangeReference getWsEditCardexpmonFlagReference() {
		return wsEditCardexpmonFlag.getReference();
	}

	/**
	 * Getter for wsEditCardexpmonFlag attribute.
	 * @return wsEditCardexpmonFlag attribute
	 */
	public String getWsEditCardexpmonFlag() {
		return wsEditCardexpmonFlag.getValue();
	}

	/**
	 * Setter for wsEditCardexpmonFlag attribute.
	 * @param wsEditCardexpmonFlag the new value of wsEditCardexpmonFlag
	 */
	public void setWsEditCardexpmonFlag(String wsEditCardexpmonFlag) {
		this.wsEditCardexpmonFlag.setValue(wsEditCardexpmonFlag);
	}
	/**
	 * Gets the reference for attribute flgCardexpmonNotOk.
	 * @return the flgCardexpmonNotOk attribute reference
	 */
	public ConditionReference getFlgCardexpmonNotOkReference() {
		return wsEditCardexpmonFlag.getCondition(flgCardexpmonNotOk);	
	}

	/**
	 * Getter for flgCardexpmonNotOk attribute.
	 * @return flgCardexpmonNotOk attribute
	 */
	public boolean isFlgCardexpmonNotOk() {
		return getFlgCardexpmonNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCardexpmonNotOk attribute.
	 * @param flgCardexpmonNotOk the new value of flgCardexpmonNotOk
	 */
	public void setFlgCardexpmonNotOk(boolean flgCardexpmonNotOk) {
		getFlgCardexpmonNotOkReference().setValue(flgCardexpmonNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCardexpmonIsvalid.
	 * @return the flgCardexpmonIsvalid attribute reference
	 */
	public ConditionReference getFlgCardexpmonIsvalidReference() {
		return wsEditCardexpmonFlag.getCondition(flgCardexpmonIsvalid);	
	}

	/**
	 * Getter for flgCardexpmonIsvalid attribute.
	 * @return flgCardexpmonIsvalid attribute
	 */
	public boolean isFlgCardexpmonIsvalid() {
		return getFlgCardexpmonIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCardexpmonIsvalid attribute.
	 * @param flgCardexpmonIsvalid the new value of flgCardexpmonIsvalid
	 */
	public void setFlgCardexpmonIsvalid(boolean flgCardexpmonIsvalid) {
		getFlgCardexpmonIsvalidReference().setValue(flgCardexpmonIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCardexpmonBlank.
	 * @return the flgCardexpmonBlank attribute reference
	 */
	public ConditionReference getFlgCardexpmonBlankReference() {
		return wsEditCardexpmonFlag.getCondition(flgCardexpmonBlank);	
	}

	/**
	 * Getter for flgCardexpmonBlank attribute.
	 * @return flgCardexpmonBlank attribute
	 */
	public boolean isFlgCardexpmonBlank() {
		return getFlgCardexpmonBlankReference().getValue();	
	}

	/**
	 * Setter for flgCardexpmonBlank attribute.
	 * @param flgCardexpmonBlank the new value of flgCardexpmonBlank
	 */
	public void setFlgCardexpmonBlank(boolean flgCardexpmonBlank) {
		getFlgCardexpmonBlankReference().setValue(flgCardexpmonBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCardexpyearFlag.
	 * @return the wsEditCardexpyearFlag attribute reference
	 */
	public ElementaryRangeReference getWsEditCardexpyearFlagReference() {
		return wsEditCardexpyearFlag.getReference();
	}

	/**
	 * Getter for wsEditCardexpyearFlag attribute.
	 * @return wsEditCardexpyearFlag attribute
	 */
	public String getWsEditCardexpyearFlag() {
		return wsEditCardexpyearFlag.getValue();
	}

	/**
	 * Setter for wsEditCardexpyearFlag attribute.
	 * @param wsEditCardexpyearFlag the new value of wsEditCardexpyearFlag
	 */
	public void setWsEditCardexpyearFlag(String wsEditCardexpyearFlag) {
		this.wsEditCardexpyearFlag.setValue(wsEditCardexpyearFlag);
	}
	/**
	 * Gets the reference for attribute flgCardexpyearNotOk.
	 * @return the flgCardexpyearNotOk attribute reference
	 */
	public ConditionReference getFlgCardexpyearNotOkReference() {
		return wsEditCardexpyearFlag.getCondition(flgCardexpyearNotOk);	
	}

	/**
	 * Getter for flgCardexpyearNotOk attribute.
	 * @return flgCardexpyearNotOk attribute
	 */
	public boolean isFlgCardexpyearNotOk() {
		return getFlgCardexpyearNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCardexpyearNotOk attribute.
	 * @param flgCardexpyearNotOk the new value of flgCardexpyearNotOk
	 */
	public void setFlgCardexpyearNotOk(boolean flgCardexpyearNotOk) {
		getFlgCardexpyearNotOkReference().setValue(flgCardexpyearNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCardexpyearIsvalid.
	 * @return the flgCardexpyearIsvalid attribute reference
	 */
	public ConditionReference getFlgCardexpyearIsvalidReference() {
		return wsEditCardexpyearFlag.getCondition(flgCardexpyearIsvalid);	
	}

	/**
	 * Getter for flgCardexpyearIsvalid attribute.
	 * @return flgCardexpyearIsvalid attribute
	 */
	public boolean isFlgCardexpyearIsvalid() {
		return getFlgCardexpyearIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCardexpyearIsvalid attribute.
	 * @param flgCardexpyearIsvalid the new value of flgCardexpyearIsvalid
	 */
	public void setFlgCardexpyearIsvalid(boolean flgCardexpyearIsvalid) {
		getFlgCardexpyearIsvalidReference().setValue(flgCardexpyearIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCardexpyearBlank.
	 * @return the flgCardexpyearBlank attribute reference
	 */
	public ConditionReference getFlgCardexpyearBlankReference() {
		return wsEditCardexpyearFlag.getCondition(flgCardexpyearBlank);	
	}

	/**
	 * Getter for flgCardexpyearBlank attribute.
	 * @return flgCardexpyearBlank attribute
	 */
	public boolean isFlgCardexpyearBlank() {
		return getFlgCardexpyearBlankReference().getValue();	
	}

	/**
	 * Setter for flgCardexpyearBlank attribute.
	 * @param flgCardexpyearBlank the new value of flgCardexpyearBlank
	 */
	public void setFlgCardexpyearBlank(boolean flgCardexpyearBlank) {
		getFlgCardexpyearBlankReference().setValue(flgCardexpyearBlank);	
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
	 * Gets the reference for attribute cardNameCheck.
	 * @return the cardNameCheck attribute reference
	 */
	public ElementaryRangeReference getCardNameCheckReference() {
		return cardNameCheck.getReference();
	}

	/**
	 * Getter for cardNameCheck attribute.
	 * @return cardNameCheck attribute
	 */
	public String getCardNameCheck() {
		return cardNameCheck.getValue();
	}

	/**
	 * Setter for cardNameCheck attribute.
	 * @param cardNameCheck the new value of cardNameCheck
	 */
	public void setCardNameCheck(String cardNameCheck) {
		this.cardNameCheck.setValue(cardNameCheck);
	}
	/**
	 * Gets the reference for attribute flgYesNoCheck.
	 * @return the flgYesNoCheck attribute reference
	 */
	public ElementaryRangeReference getFlgYesNoCheckReference() {
		return flgYesNoCheck.getReference();
	}

	/**
	 * Getter for flgYesNoCheck attribute.
	 * @return flgYesNoCheck attribute
	 */
	public String getFlgYesNoCheck() {
		return flgYesNoCheck.getValue();
	}

	/**
	 * Setter for flgYesNoCheck attribute.
	 * @param flgYesNoCheck the new value of flgYesNoCheck
	 */
	public void setFlgYesNoCheck(String flgYesNoCheck) {
		this.flgYesNoCheck.setValue(flgYesNoCheck);
	}
	/**
	 * Gets the reference for attribute flgYesNoValid.
	 * @return the flgYesNoValid attribute reference
	 */
	public ConditionReference getFlgYesNoValidReference() {
		return flgYesNoCheck.getCondition(flgYesNoValid);	
	}

	/**
	 * Getter for flgYesNoValid attribute.
	 * @return flgYesNoValid attribute
	 */
	public boolean isFlgYesNoValid() {
		return getFlgYesNoValidReference().getValue();	
	}

	/**
	 * Setter for flgYesNoValid attribute.
	 * @param flgYesNoValid the new value of flgYesNoValid
	 */
	public void setFlgYesNoValid(boolean flgYesNoValid) {
		getFlgYesNoValidReference().setValue(flgYesNoValid);	
	}
	/**
	 * Gets the reference for attribute cardMonthCheck.
	 * @return the cardMonthCheck attribute reference
	 */
	public ElementaryRangeReference getCardMonthCheckReference() {
		return cardMonthCheck.getReference();
	}

	/**
	 * Getter for cardMonthCheck attribute.
	 * @return cardMonthCheck attribute
	 */
	public String getCardMonthCheck() {
		return cardMonthCheck.getValue();
	}

	/**
	 * Setter for cardMonthCheck attribute.
	 * @param cardMonthCheck the new value of cardMonthCheck
	 */
	public void setCardMonthCheck(String cardMonthCheck) {
		this.cardMonthCheck.setValue(cardMonthCheck);
	}
	/**
	 * Gets the reference for attribute cardMonthCheckN.
	 * @return the cardMonthCheckN attribute reference
	 */
	public ElementaryRangeReference getCardMonthCheckNReference() {
		return cardMonthCheckN.getReference();
	}

	/**
	 * Getter for cardMonthCheckN attribute.
	 * @return cardMonthCheckN attribute
	 */
	public int getCardMonthCheckN() {
		return cardMonthCheckN.getValue();
	}

	/**
	 * Setter for cardMonthCheckN attribute.
	 * @param cardMonthCheckN the new value of cardMonthCheckN
	 */
	public void setCardMonthCheckN(int cardMonthCheckN) {
		this.cardMonthCheckN.setValue(cardMonthCheckN);
	}
	/**
	 * Gets the reference for attribute validMonth.
	 * @return the validMonth attribute reference
	 */
	public ConditionReference getValidMonthReference() {
		return cardMonthCheckN.getCondition(validMonth);	
	}

	/**
	 * Getter for validMonth attribute.
	 * @return validMonth attribute
	 */
	public boolean isValidMonth() {
		return getValidMonthReference().getValue();	
	}

	/**
	 * Setter for validMonth attribute.
	 * @param validMonth the new value of validMonth
	 */
	public void setValidMonth(boolean validMonth) {
		getValidMonthReference().setValue(validMonth);	
	}
	/**
	 * Gets the reference for attribute cardYearCheck.
	 * @return the cardYearCheck attribute reference
	 */
	public ElementaryRangeReference getCardYearCheckReference() {
		return cardYearCheck.getReference();
	}

	/**
	 * Getter for cardYearCheck attribute.
	 * @return cardYearCheck attribute
	 */
	public String getCardYearCheck() {
		return cardYearCheck.getValue();
	}

	/**
	 * Setter for cardYearCheck attribute.
	 * @param cardYearCheck the new value of cardYearCheck
	 */
	public void setCardYearCheck(String cardYearCheck) {
		this.cardYearCheck.setValue(cardYearCheck);
	}
	/**
	 * Gets the reference for attribute cardYearCheckN.
	 * @return the cardYearCheckN attribute reference
	 */
	public ElementaryRangeReference getCardYearCheckNReference() {
		return cardYearCheckN.getReference();
	}

	/**
	 * Getter for cardYearCheckN attribute.
	 * @return cardYearCheckN attribute
	 */
	public int getCardYearCheckN() {
		return cardYearCheckN.getValue();
	}

	/**
	 * Setter for cardYearCheckN attribute.
	 * @param cardYearCheckN the new value of cardYearCheckN
	 */
	public void setCardYearCheckN(int cardYearCheckN) {
		this.cardYearCheckN.setValue(cardYearCheckN);
	}
	/**
	 * Gets the reference for attribute validYear.
	 * @return the validYear attribute reference
	 */
	public ConditionReference getValidYearReference() {
		return cardYearCheckN.getCondition(validYear);	
	}

	/**
	 * Getter for validYear attribute.
	 * @return validYear attribute
	 */
	public boolean isValidYear() {
		return getValidYearReference().getValue();	
	}

	/**
	 * Setter for validYear attribute.
	 * @param validYear the new value of validYear
	 */
	public void setValidYear(boolean validYear) {
		getValidYearReference().setValue(validYear);	
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
	 * Gets the reference for attribute cardCardNumX.
	 * @return the cardCardNumX attribute reference
	 */
	public ElementaryRangeReference getCardCardNumXReference() {
		return cardCardNumX.getReference();
	}

	/**
	 * Getter for cardCardNumX attribute.
	 * @return cardCardNumX attribute
	 */
	public String getCardCardNumX() {
		return cardCardNumX.getValue();
	}

	/**
	 * Setter for cardCardNumX attribute.
	 * @param cardCardNumX the new value of cardCardNumX
	 */
	public void setCardCardNumX(String cardCardNumX) {
		this.cardCardNumX.setValue(cardCardNumX);
	}
	/**
	 * Gets the reference for attribute cardCardNumN.
	 * @return the cardCardNumN attribute reference
	 */
	public ElementaryRangeReference getCardCardNumNReference() {
		return cardCardNumN.getReference();
	}

	/**
	 * Getter for cardCardNumN attribute.
	 * @return cardCardNumN attribute
	 */
	public long getCardCardNumN() {
		return cardCardNumN.getValue();
	}

	/**
	 * Setter for cardCardNumN attribute.
	 * @param cardCardNumN the new value of cardCardNumN
	 */
	public void setCardCardNumN(long cardCardNumN) {
		this.cardCardNumN.setValue(cardCardNumN);
	}
	/**
	 * Gets the reference for attribute cardNameEmbossedX.
	 * @return the cardNameEmbossedX attribute reference
	 */
	public ElementaryRangeReference getCardNameEmbossedXReference() {
		return cardNameEmbossedX.getReference();
	}

	/**
	 * Getter for cardNameEmbossedX attribute.
	 * @return cardNameEmbossedX attribute
	 */
	public String getCardNameEmbossedX() {
		return cardNameEmbossedX.getValue();
	}

	/**
	 * Setter for cardNameEmbossedX attribute.
	 * @param cardNameEmbossedX the new value of cardNameEmbossedX
	 */
	public void setCardNameEmbossedX(String cardNameEmbossedX) {
		this.cardNameEmbossedX.setValue(cardNameEmbossedX);
	}
	/**
	 * Gets the reference for attribute cardStatusX.
	 * @return the cardStatusX attribute reference
	 */
	public ElementaryRangeReference getCardStatusXReference() {
		return cardStatusX.getReference();
	}

	/**
	 * Getter for cardStatusX attribute.
	 * @return cardStatusX attribute
	 */
	public String getCardStatusX() {
		return cardStatusX.getValue();
	}

	/**
	 * Setter for cardStatusX attribute.
	 * @param cardStatusX the new value of cardStatusX
	 */
	public void setCardStatusX(String cardStatusX) {
		this.cardStatusX.setValue(cardStatusX);
	}
	/**
	 * Gets the reference for attribute cardExpiraionDateX.
	 * @return the cardExpiraionDateX attribute reference
	 */
	public ElementaryRangeReference getCardExpiraionDateXReference() {
		return cardExpiraionDateX.getReference();
	}

	/**
	 * Getter for cardExpiraionDateX attribute.
	 * @return cardExpiraionDateX attribute
	 */
	public String getCardExpiraionDateX() {
		return cardExpiraionDateX.getValue();
	}

	/**
	 * Setter for cardExpiraionDateX attribute.
	 * @param cardExpiraionDateX the new value of cardExpiraionDateX
	 */
	public void setCardExpiraionDateX(String cardExpiraionDateX) {
		this.cardExpiraionDateX.setValue(cardExpiraionDateX);
	}
	/**
	 * Gets the reference for attribute cardExpiryYear.
	 * @return the cardExpiryYear attribute reference
	 */
	public ElementaryRangeReference getCardExpiryYearReference() {
		return cardExpiryYear.getReference();
	}

	/**
	 * Getter for cardExpiryYear attribute.
	 * @return cardExpiryYear attribute
	 */
	public String getCardExpiryYear() {
		return cardExpiryYear.getValue();
	}

	/**
	 * Setter for cardExpiryYear attribute.
	 * @param cardExpiryYear the new value of cardExpiryYear
	 */
	public void setCardExpiryYear(String cardExpiryYear) {
		this.cardExpiryYear.setValue(cardExpiryYear);
	}
	/**
	 * Gets the reference for attribute cardExpiryMonth.
	 * @return the cardExpiryMonth attribute reference
	 */
	public ElementaryRangeReference getCardExpiryMonthReference() {
		return cardExpiryMonth.getReference();
	}

	/**
	 * Getter for cardExpiryMonth attribute.
	 * @return cardExpiryMonth attribute
	 */
	public String getCardExpiryMonth() {
		return cardExpiryMonth.getValue();
	}

	/**
	 * Setter for cardExpiryMonth attribute.
	 * @param cardExpiryMonth the new value of cardExpiryMonth
	 */
	public void setCardExpiryMonth(String cardExpiryMonth) {
		this.cardExpiryMonth.setValue(cardExpiryMonth);
	}
	/**
	 * Gets the reference for attribute cardExpiryDay.
	 * @return the cardExpiryDay attribute reference
	 */
	public ElementaryRangeReference getCardExpiryDayReference() {
		return cardExpiryDay.getReference();
	}

	/**
	 * Getter for cardExpiryDay attribute.
	 * @return cardExpiryDay attribute
	 */
	public String getCardExpiryDay() {
		return cardExpiryDay.getValue();
	}

	/**
	 * Setter for cardExpiryDay attribute.
	 * @param cardExpiryDay the new value of cardExpiryDay
	 */
	public void setCardExpiryDay(String cardExpiryDay) {
		this.cardExpiryDay.setValue(cardExpiryDay);
	}
	/**
	 * Gets the reference for attribute cardExpiraionDateN.
	 * @return the cardExpiraionDateN attribute reference
	 */
	public ElementaryRangeReference getCardExpiraionDateNReference() {
		return cardExpiraionDateN.getReference();
	}

	/**
	 * Getter for cardExpiraionDateN attribute.
	 * @return cardExpiraionDateN attribute
	 */
	public long getCardExpiraionDateN() {
		return cardExpiraionDateN.getValue();
	}

	/**
	 * Setter for cardExpiraionDateN attribute.
	 * @param cardExpiraionDateN the new value of cardExpiraionDateN
	 */
	public void setCardExpiraionDateN(long cardExpiraionDateN) {
		this.cardExpiraionDateN.setValue(cardExpiraionDateN);
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
	 * Gets the reference for attribute foundCardsForAccount.
	 * @return the foundCardsForAccount attribute reference
	 */
	public ConditionReference getFoundCardsForAccountReference() {
		return wsInfoMsg.getCondition(foundCardsForAccount);	
	}

	/**
	 * Getter for foundCardsForAccount attribute.
	 * @return foundCardsForAccount attribute
	 */
	public boolean isFoundCardsForAccount() {
		return getFoundCardsForAccountReference().getValue();	
	}

	/**
	 * Setter for foundCardsForAccount attribute.
	 * @param foundCardsForAccount the new value of foundCardsForAccount
	 */
	public void setFoundCardsForAccount(boolean foundCardsForAccount) {
		getFoundCardsForAccountReference().setValue(foundCardsForAccount);	
	}
	/**
	 * Gets the reference for attribute promptForSearchKeys.
	 * @return the promptForSearchKeys attribute reference
	 */
	public ConditionReference getPromptForSearchKeysReference() {
		return wsInfoMsg.getCondition(promptForSearchKeys);	
	}

	/**
	 * Getter for promptForSearchKeys attribute.
	 * @return promptForSearchKeys attribute
	 */
	public boolean isPromptForSearchKeys() {
		return getPromptForSearchKeysReference().getValue();	
	}

	/**
	 * Setter for promptForSearchKeys attribute.
	 * @param promptForSearchKeys the new value of promptForSearchKeys
	 */
	public void setPromptForSearchKeys(boolean promptForSearchKeys) {
		getPromptForSearchKeysReference().setValue(promptForSearchKeys);	
	}
	/**
	 * Gets the reference for attribute promptForChanges.
	 * @return the promptForChanges attribute reference
	 */
	public ConditionReference getPromptForChangesReference() {
		return wsInfoMsg.getCondition(promptForChanges);	
	}

	/**
	 * Getter for promptForChanges attribute.
	 * @return promptForChanges attribute
	 */
	public boolean isPromptForChanges() {
		return getPromptForChangesReference().getValue();	
	}

	/**
	 * Setter for promptForChanges attribute.
	 * @param promptForChanges the new value of promptForChanges
	 */
	public void setPromptForChanges(boolean promptForChanges) {
		getPromptForChangesReference().setValue(promptForChanges);	
	}
	/**
	 * Gets the reference for attribute promptForConfirmation.
	 * @return the promptForConfirmation attribute reference
	 */
	public ConditionReference getPromptForConfirmationReference() {
		return wsInfoMsg.getCondition(promptForConfirmation);	
	}

	/**
	 * Getter for promptForConfirmation attribute.
	 * @return promptForConfirmation attribute
	 */
	public boolean isPromptForConfirmation() {
		return getPromptForConfirmationReference().getValue();	
	}

	/**
	 * Setter for promptForConfirmation attribute.
	 * @param promptForConfirmation the new value of promptForConfirmation
	 */
	public void setPromptForConfirmation(boolean promptForConfirmation) {
		getPromptForConfirmationReference().setValue(promptForConfirmation);	
	}
	/**
	 * Gets the reference for attribute confirmUpdateSuccess.
	 * @return the confirmUpdateSuccess attribute reference
	 */
	public ConditionReference getConfirmUpdateSuccessReference() {
		return wsInfoMsg.getCondition(confirmUpdateSuccess);	
	}

	/**
	 * Getter for confirmUpdateSuccess attribute.
	 * @return confirmUpdateSuccess attribute
	 */
	public boolean isConfirmUpdateSuccess() {
		return getConfirmUpdateSuccessReference().getValue();	
	}

	/**
	 * Setter for confirmUpdateSuccess attribute.
	 * @param confirmUpdateSuccess the new value of confirmUpdateSuccess
	 */
	public void setConfirmUpdateSuccess(boolean confirmUpdateSuccess) {
		getConfirmUpdateSuccessReference().setValue(confirmUpdateSuccess);	
	}
	/**
	 * Gets the reference for attribute informFailure.
	 * @return the informFailure attribute reference
	 */
	public ConditionReference getInformFailureReference() {
		return wsInfoMsg.getCondition(informFailure);	
	}

	/**
	 * Getter for informFailure attribute.
	 * @return informFailure attribute
	 */
	public boolean isInformFailure() {
		return getInformFailureReference().getValue();	
	}

	/**
	 * Setter for informFailure attribute.
	 * @param informFailure the new value of informFailure
	 */
	public void setInformFailure(boolean informFailure) {
		getInformFailureReference().setValue(informFailure);	
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
	 * Gets the reference for attribute wsPromptForCard.
	 * @return the wsPromptForCard attribute reference
	 */
	public ConditionReference getWsPromptForCardReference() {
		return wsReturnMsg.getCondition(wsPromptForCard);	
	}

	/**
	 * Getter for wsPromptForCard attribute.
	 * @return wsPromptForCard attribute
	 */
	public boolean isWsPromptForCard() {
		return getWsPromptForCardReference().getValue();	
	}

	/**
	 * Setter for wsPromptForCard attribute.
	 * @param wsPromptForCard the new value of wsPromptForCard
	 */
	public void setWsPromptForCard(boolean wsPromptForCard) {
		getWsPromptForCardReference().setValue(wsPromptForCard);	
	}
	/**
	 * Gets the reference for attribute wsPromptForName.
	 * @return the wsPromptForName attribute reference
	 */
	public ConditionReference getWsPromptForNameReference() {
		return wsReturnMsg.getCondition(wsPromptForName);	
	}

	/**
	 * Getter for wsPromptForName attribute.
	 * @return wsPromptForName attribute
	 */
	public boolean isWsPromptForName() {
		return getWsPromptForNameReference().getValue();	
	}

	/**
	 * Setter for wsPromptForName attribute.
	 * @param wsPromptForName the new value of wsPromptForName
	 */
	public void setWsPromptForName(boolean wsPromptForName) {
		getWsPromptForNameReference().setValue(wsPromptForName);	
	}
	/**
	 * Gets the reference for attribute wsNameMustBeAlpha.
	 * @return the wsNameMustBeAlpha attribute reference
	 */
	public ConditionReference getWsNameMustBeAlphaReference() {
		return wsReturnMsg.getCondition(wsNameMustBeAlpha);	
	}

	/**
	 * Getter for wsNameMustBeAlpha attribute.
	 * @return wsNameMustBeAlpha attribute
	 */
	public boolean isWsNameMustBeAlpha() {
		return getWsNameMustBeAlphaReference().getValue();	
	}

	/**
	 * Setter for wsNameMustBeAlpha attribute.
	 * @param wsNameMustBeAlpha the new value of wsNameMustBeAlpha
	 */
	public void setWsNameMustBeAlpha(boolean wsNameMustBeAlpha) {
		getWsNameMustBeAlphaReference().setValue(wsNameMustBeAlpha);	
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
	 * Gets the reference for attribute noChangesDetected.
	 * @return the noChangesDetected attribute reference
	 */
	public ConditionReference getNoChangesDetectedReference() {
		return wsReturnMsg.getCondition(noChangesDetected);	
	}

	/**
	 * Getter for noChangesDetected attribute.
	 * @return noChangesDetected attribute
	 */
	public boolean isNoChangesDetected() {
		return getNoChangesDetectedReference().getValue();	
	}

	/**
	 * Setter for noChangesDetected attribute.
	 * @param noChangesDetected the new value of noChangesDetected
	 */
	public void setNoChangesDetected(boolean noChangesDetected) {
		getNoChangesDetectedReference().setValue(noChangesDetected);	
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
	 * Gets the reference for attribute searchedCardNotNumeric.
	 * @return the searchedCardNotNumeric attribute reference
	 */
	public ConditionReference getSearchedCardNotNumericReference() {
		return wsReturnMsg.getCondition(searchedCardNotNumeric);	
	}

	/**
	 * Getter for searchedCardNotNumeric attribute.
	 * @return searchedCardNotNumeric attribute
	 */
	public boolean isSearchedCardNotNumeric() {
		return getSearchedCardNotNumericReference().getValue();	
	}

	/**
	 * Setter for searchedCardNotNumeric attribute.
	 * @param searchedCardNotNumeric the new value of searchedCardNotNumeric
	 */
	public void setSearchedCardNotNumeric(boolean searchedCardNotNumeric) {
		getSearchedCardNotNumericReference().setValue(searchedCardNotNumeric);	
	}
	/**
	 * Gets the reference for attribute cardStatusMustBeYesNo.
	 * @return the cardStatusMustBeYesNo attribute reference
	 */
	public ConditionReference getCardStatusMustBeYesNoReference() {
		return wsReturnMsg.getCondition(cardStatusMustBeYesNo);	
	}

	/**
	 * Getter for cardStatusMustBeYesNo attribute.
	 * @return cardStatusMustBeYesNo attribute
	 */
	public boolean isCardStatusMustBeYesNo() {
		return getCardStatusMustBeYesNoReference().getValue();	
	}

	/**
	 * Setter for cardStatusMustBeYesNo attribute.
	 * @param cardStatusMustBeYesNo the new value of cardStatusMustBeYesNo
	 */
	public void setCardStatusMustBeYesNo(boolean cardStatusMustBeYesNo) {
		getCardStatusMustBeYesNoReference().setValue(cardStatusMustBeYesNo);	
	}
	/**
	 * Gets the reference for attribute cardExpiryMonthNotValid.
	 * @return the cardExpiryMonthNotValid attribute reference
	 */
	public ConditionReference getCardExpiryMonthNotValidReference() {
		return wsReturnMsg.getCondition(cardExpiryMonthNotValid);	
	}

	/**
	 * Getter for cardExpiryMonthNotValid attribute.
	 * @return cardExpiryMonthNotValid attribute
	 */
	public boolean isCardExpiryMonthNotValid() {
		return getCardExpiryMonthNotValidReference().getValue();	
	}

	/**
	 * Setter for cardExpiryMonthNotValid attribute.
	 * @param cardExpiryMonthNotValid the new value of cardExpiryMonthNotValid
	 */
	public void setCardExpiryMonthNotValid(boolean cardExpiryMonthNotValid) {
		getCardExpiryMonthNotValidReference().setValue(cardExpiryMonthNotValid);	
	}
	/**
	 * Gets the reference for attribute cardExpiryYearNotValid.
	 * @return the cardExpiryYearNotValid attribute reference
	 */
	public ConditionReference getCardExpiryYearNotValidReference() {
		return wsReturnMsg.getCondition(cardExpiryYearNotValid);	
	}

	/**
	 * Getter for cardExpiryYearNotValid attribute.
	 * @return cardExpiryYearNotValid attribute
	 */
	public boolean isCardExpiryYearNotValid() {
		return getCardExpiryYearNotValidReference().getValue();	
	}

	/**
	 * Setter for cardExpiryYearNotValid attribute.
	 * @param cardExpiryYearNotValid the new value of cardExpiryYearNotValid
	 */
	public void setCardExpiryYearNotValid(boolean cardExpiryYearNotValid) {
		getCardExpiryYearNotValidReference().setValue(cardExpiryYearNotValid);	
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
	 * Gets the reference for attribute didNotFindAcctcardCombo.
	 * @return the didNotFindAcctcardCombo attribute reference
	 */
	public ConditionReference getDidNotFindAcctcardComboReference() {
		return wsReturnMsg.getCondition(didNotFindAcctcardCombo);	
	}

	/**
	 * Getter for didNotFindAcctcardCombo attribute.
	 * @return didNotFindAcctcardCombo attribute
	 */
	public boolean isDidNotFindAcctcardCombo() {
		return getDidNotFindAcctcardComboReference().getValue();	
	}

	/**
	 * Setter for didNotFindAcctcardCombo attribute.
	 * @param didNotFindAcctcardCombo the new value of didNotFindAcctcardCombo
	 */
	public void setDidNotFindAcctcardCombo(boolean didNotFindAcctcardCombo) {
		getDidNotFindAcctcardComboReference().setValue(didNotFindAcctcardCombo);	
	}
	/**
	 * Gets the reference for attribute couldNotLockForUpdate.
	 * @return the couldNotLockForUpdate attribute reference
	 */
	public ConditionReference getCouldNotLockForUpdateReference() {
		return wsReturnMsg.getCondition(couldNotLockForUpdate);	
	}

	/**
	 * Getter for couldNotLockForUpdate attribute.
	 * @return couldNotLockForUpdate attribute
	 */
	public boolean isCouldNotLockForUpdate() {
		return getCouldNotLockForUpdateReference().getValue();	
	}

	/**
	 * Setter for couldNotLockForUpdate attribute.
	 * @param couldNotLockForUpdate the new value of couldNotLockForUpdate
	 */
	public void setCouldNotLockForUpdate(boolean couldNotLockForUpdate) {
		getCouldNotLockForUpdateReference().setValue(couldNotLockForUpdate);	
	}
	/**
	 * Gets the reference for attribute dataWasChangedBeforeUpdate.
	 * @return the dataWasChangedBeforeUpdate attribute reference
	 */
	public ConditionReference getDataWasChangedBeforeUpdateReference() {
		return wsReturnMsg.getCondition(dataWasChangedBeforeUpdate);	
	}

	/**
	 * Getter for dataWasChangedBeforeUpdate attribute.
	 * @return dataWasChangedBeforeUpdate attribute
	 */
	public boolean isDataWasChangedBeforeUpdate() {
		return getDataWasChangedBeforeUpdateReference().getValue();	
	}

	/**
	 * Setter for dataWasChangedBeforeUpdate attribute.
	 * @param dataWasChangedBeforeUpdate the new value of dataWasChangedBeforeUpdate
	 */
	public void setDataWasChangedBeforeUpdate(boolean dataWasChangedBeforeUpdate) {
		getDataWasChangedBeforeUpdateReference().setValue(dataWasChangedBeforeUpdate);	
	}
	/**
	 * Gets the reference for attribute lockedButUpdateFailed.
	 * @return the lockedButUpdateFailed attribute reference
	 */
	public ConditionReference getLockedButUpdateFailedReference() {
		return wsReturnMsg.getCondition(lockedButUpdateFailed);	
	}

	/**
	 * Getter for lockedButUpdateFailed attribute.
	 * @return lockedButUpdateFailed attribute
	 */
	public boolean isLockedButUpdateFailed() {
		return getLockedButUpdateFailedReference().getValue();	
	}

	/**
	 * Setter for lockedButUpdateFailed attribute.
	 * @param lockedButUpdateFailed the new value of lockedButUpdateFailed
	 */
	public void setLockedButUpdateFailed(boolean lockedButUpdateFailed) {
		getLockedButUpdateFailedReference().setValue(lockedButUpdateFailed);	
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
