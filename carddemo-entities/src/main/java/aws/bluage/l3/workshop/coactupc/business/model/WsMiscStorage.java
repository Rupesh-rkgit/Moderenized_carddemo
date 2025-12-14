package aws.bluage.l3.workshop.coactupc.business.model;

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
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.NumericEditedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
import org.apache.commons.lang3.tuple.Pair;
/**
 * Data simplifier entity WsMiscStorage.
<pre>
 * 
 * Legacy Documentation:<br>
 *  *************************************** *************************<br>
 *   Program:     COACTUPC.CBL                                     *<br>
 *   Layer:       Business logic                                   *<br>
 *   Function:    Accept and process ACCOUNT UPDATE                *<br>
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
 * <p>About 'wsCicsProcessngVars' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsCicsProcessngVars
 * <br></p>
 * 
 * <p>About 'wsGenericEdits' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsGenericEdits
 * <br></p>
 * 
 * <p>About 'wsCalculationVars' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsCalculationVars
 * <br></p>
 * 
 * <p>About 'wsDatachangedFlag' field, <br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT<br>
 *  <br>
 *  ****************************************************************<br></p>
 * 
 * <p>About 'noChangesFound' field, <br>
 * </p>
 * 
 * <p>About 'changeHasOccurred' field, <br>
 * </p>
 * 
 * <p>About 'wsInputFlag' field, <br>
 * </p>
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
 * <p>About 'wsEditAcctFlag' field, <br>
 *    Program specific edits<br></p>
 * 
 * <p>About 'flgAcctfilterIsvalid' field, <br>
 * </p>
 * 
 * <p>About 'flgAcctfilterNotOk' field, <br>
 * </p>
 * 
 * <p>About 'flgAcctfilterBlank' field, <br>
 * </p>
 * 
 * <p>About 'wsEditCustFlag' field, <br>
 * </p>
 * 
 * <p>About 'flgCustfilterIsvalid' field, <br>
 * </p>
 * 
 * <p>About 'flgCustfilterNotOk' field, <br>
 * </p>
 * 
 * <p>About 'flgCustfilterBlank' field, <br>
 * </p>
 * 
 * <p>About 'wsNonKeyFlags' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsNonKeyFlags
 * <br></p>
 * 
 * <p>About 'cicsOutputEditVars' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.CicsOutputEditVars
 * <br></p>
 * 
 * <p>About 'wsXrefRid' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsXrefRid
 * <br></p>
 * 
 * <p>About 'wsFileReadFlags' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsFileReadFlags
 * <br></p>
 * 
 * <p>About 'wsFileErrorMessage' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsFileErrorMessage
 * <br></p>
 * 
 * <p>About 'alphaVarsForDataEditing' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.AlphaVarsForDataEditing
 * <br></p>
 * 
 * <p>About 'acctUpdateRecord' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.AcctUpdateRecord
 * <br></p>
 * 
 * <p>About 'custUpdateRecord' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.CustUpdateRecord
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
 * <p>About 'foundAccountData' field, <br>
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
 * <p>About 'wsPromptForLastname' field, <br>
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
 * <p>About 'didNotFindAcctInAcctdat' field, <br>
 * </p>
 * 
 * <p>About 'didNotFindCustInCustdat' field, <br>
 * </p>
 * 
 * <p>About 'acctStatusMustBeYesNo' field, <br>
 * </p>
 * 
 * <p>About 'credLimitIsBlank' field, <br>
 * </p>
 * 
 * <p>About 'credLimitIsNotValid' field, <br>
 * </p>
 * 
 * <p>About 'thisMonthNotValid' field, <br>
 * </p>
 * 
 * <p>About 'thisYearNotValid' field, <br>
 * </p>
 * 
 * <p>About 'didNotFindAcctcardCombo' field, <br>
 * </p>
 * 
 * <p>About 'couldNotLockAcctForUpdate' field, <br>
 * </p>
 * 
 * <p>About 'couldNotLockCustForUpdate' field, <br>
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
	 * Generic Input Edits
	 */
	private final Group wsGenericEdits = new Group(root);
	private final Elementary wsEditVariableName = new Elementary(wsGenericEdits,new AlphanumericType(25));
	private final Elementary wsEditSignedNumber9v2X = new Elementary(wsGenericEdits,new AlphanumericType(15));
	private final Elementary wsFlgSignedNumberEdit = new Elementary(wsGenericEdits,new AlphanumericType(1));
	private final ConditionName flgSignedNumberIsvalid=new ConditionName(wsFlgSignedNumberEdit,Record.LOW_VALUES);
	private final ConditionName flgSignedNumberNotOk=new ConditionName(wsFlgSignedNumberEdit,"0");
	private final ConditionName flgSignedNumberBlank=new ConditionName(wsFlgSignedNumberEdit,"B");
	private final Elementary wsEditAlphanumOnly = new Elementary(wsGenericEdits,new AlphanumericType(256));
	private final Elementary wsEditAlphanumLength = new Elementary(wsGenericEdits,new PackedType(4, 0, false, false, true));
	private final Elementary wsEditAlphaOnlyFlags = new Elementary(wsGenericEdits,new AlphanumericType(1));
	private final ConditionName flgAlphaIsvalid=new ConditionName(wsEditAlphaOnlyFlags,Record.LOW_VALUES);
	private final ConditionName flgAlphaNotOk=new ConditionName(wsEditAlphaOnlyFlags,"0");
	private final ConditionName flgAlphaBlank=new ConditionName(wsEditAlphaOnlyFlags,"B");
	private final Elementary wsEditAlphanumOnlyFlags = new Elementary(wsGenericEdits,new AlphanumericType(1));
	private final ConditionName flgAlphnanumIsvalid=new ConditionName(wsEditAlphanumOnlyFlags,Record.LOW_VALUES);
	private final ConditionName flgAlphnanumNotOk=new ConditionName(wsEditAlphanumOnlyFlags,"0");
	private final ConditionName flgAlphnanumBlank=new ConditionName(wsEditAlphanumOnlyFlags,"B");
	private final Elementary wsEditMandatoryFlags = new Elementary(wsGenericEdits,new AlphanumericType(1));
	private final ConditionName flgMandatoryIsvalid=new ConditionName(wsEditMandatoryFlags,Record.LOW_VALUES);
	private final ConditionName flgMandatoryNotOk=new ConditionName(wsEditMandatoryFlags,"0");
	private final ConditionName flgMandatoryBlank=new ConditionName(wsEditMandatoryFlags,"B");
	private final Elementary wsEditYesNo = new Elementary(wsGenericEdits,new AlphanumericType(1),"N");
	private final ConditionName flgYesNoIsvalid=new ConditionName(wsEditYesNo,"Y",
	"N");
	private final ConditionName flgYesNoNotOk=new ConditionName(wsEditYesNo,"0");
	private final ConditionName flgYesNoBlank=new ConditionName(wsEditYesNo,"B");
	private final Union union = new Union(wsGenericEdits);
	private final Elementary wsEditUsPhoneNum = new Elementary(union,new AlphanumericType(15));
	private final Group wsEditUsPhoneNumX = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(wsEditUsPhoneNumX,new AlphanumericType(1));
	private final Union union1 = new Union(wsEditUsPhoneNumX);
	
	/**
	 * VALUE '('
	 */
	private final Elementary wsEditUsPhoneNuma = new Elementary(union1,new AlphanumericType(3));
	private final Elementary wsEditUsPhoneNumaN = new Elementary(union1,new ZonedType(3, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(wsEditUsPhoneNumX,new AlphanumericType(1));
	private final Union union2 = new Union(wsEditUsPhoneNumX);
	
	/**
	 * VALUE ')'
	 */
	private final Elementary wsEditUsPhoneNumb = new Elementary(union2,new AlphanumericType(3));
	private final Elementary wsEditUsPhoneNumbN = new Elementary(union2,new ZonedType(3, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(wsEditUsPhoneNumX,new AlphanumericType(1));
	private final Union union3 = new Union(wsEditUsPhoneNumX);
	
	/**
	 * VALUE '-'
	 */
	private final Elementary wsEditUsPhoneNumc = new Elementary(union3,new AlphanumericType(4));
	private final Elementary wsEditUsPhoneNumcN = new Elementary(union3,new ZonedType(4, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(wsEditUsPhoneNumX,new AlphanumericType(2));
	private final Group wsEditUsPhoneNumFlgs = new Group(wsGenericEdits);
	private final ConditionName wsEditUsPhoneIsInvalid=new ConditionName(wsEditUsPhoneNumFlgs,"000");
	private final ConditionName wsEditUsPhoneIsValid=new ConditionName(wsEditUsPhoneNumFlgs,Record.LOW_VALUES);
	private final Elementary wsEditUsPhoneaFlg = new Elementary(wsEditUsPhoneNumFlgs,new AlphanumericType(1));
	private final ConditionName flgEditUsPhoneaIsvalid=new ConditionName(wsEditUsPhoneaFlg,Record.LOW_VALUES);
	private final ConditionName flgEditUsPhoneaNotOk=new ConditionName(wsEditUsPhoneaFlg,"0");
	private final ConditionName flgEditUsPhoneaBlank=new ConditionName(wsEditUsPhoneaFlg,"B");
	private final Elementary wsEditEditUsPhoneb = new Elementary(wsEditUsPhoneNumFlgs,new AlphanumericType(1));
	private final ConditionName flgEditUsPhonebIsvalid=new ConditionName(wsEditEditUsPhoneb,Record.LOW_VALUES);
	private final ConditionName flgEditUsPhonebNotOk=new ConditionName(wsEditEditUsPhoneb,"0");
	private final ConditionName flgEditUsPhonebBlank=new ConditionName(wsEditEditUsPhoneb,"B");
	private final Elementary wsEditEditPhonec = new Elementary(wsEditUsPhoneNumFlgs,new AlphanumericType(1));
	private final ConditionName flgEditUsPhonecIsvalid=new ConditionName(wsEditEditPhonec,Record.LOW_VALUES);
	private final ConditionName flgEditUsPhonecNotOk=new ConditionName(wsEditEditPhonec,"0");
	private final ConditionName flgEditUsPhonecBlank=new ConditionName(wsEditEditPhonec,"B");
	private final Union union4 = new Union(wsGenericEdits);
	private final Group wsEditUsSsn = new Group(union4);
	private final Union union5 = new Union(wsEditUsSsn);
	private final Elementary wsEditUsSsnPart1 = new Elementary(union5,new AlphanumericType(3));
	private final Elementary wsEditUsSsnPart1N = new Elementary(union5,new ZonedType(3, 0, false));
	private final ConditionName invalidSsnPart1=new ConditionName(wsEditUsSsnPart1N,new BigDecimal("0"),
	new BigDecimal("666"),Pair.of(new BigDecimal("900"),new BigDecimal("999")));
	private final Union union6 = new Union(wsEditUsSsn);
	private final Elementary wsEditUsSsnPart2 = new Elementary(union6,new AlphanumericType(2));
	private final Elementary wsEditUsSsnPart2N = new Elementary(union6,new ZonedType(2, 0, false));
	private final Union union7 = new Union(wsEditUsSsn);
	private final Elementary wsEditUsSsnPart3 = new Elementary(union7,new AlphanumericType(4));
	private final Elementary wsEditUsSsnPart3N = new Elementary(union7,new ZonedType(4, 0, false));
	private final Elementary wsEditUsSsnN = new Elementary(union4,new ZonedType(9, 0, false));
	private final Group wsEditUsSsnFlgs = new Group(wsGenericEdits);
	private final ConditionName wsEditUsSsnIsInvalid=new ConditionName(wsEditUsSsnFlgs,"000");
	private final ConditionName wsEditUsSsnIsValid=new ConditionName(wsEditUsSsnFlgs,Record.LOW_VALUES);
	private final Elementary wsEditUsSsnPart1Flgs = new Elementary(wsEditUsSsnFlgs,new AlphanumericType(1));
	private final ConditionName flgEditUsSsnPart1Isvalid=new ConditionName(wsEditUsSsnPart1Flgs,Record.LOW_VALUES);
	private final ConditionName flgEditUsSsnPart1NotOk=new ConditionName(wsEditUsSsnPart1Flgs,"0");
	private final ConditionName flgEditUsSsnPart1Blank=new ConditionName(wsEditUsSsnPart1Flgs,"B");
	private final Elementary wsEditUsSsnPart2Flgs = new Elementary(wsEditUsSsnFlgs,new AlphanumericType(1));
	private final ConditionName flgEditUsSsnPart2Isvalid=new ConditionName(wsEditUsSsnPart2Flgs,Record.LOW_VALUES);
	private final ConditionName flgEditUsSsnPart2NotOk=new ConditionName(wsEditUsSsnPart2Flgs,"0");
	private final ConditionName flgEditUsSsnPart2Blank=new ConditionName(wsEditUsSsnPart2Flgs,"B");
	private final Elementary wsEditUsSsnPart3Flgs = new Elementary(wsEditUsSsnFlgs,new AlphanumericType(1));
	private final ConditionName flgEditUsSsnPart3Isvalid=new ConditionName(wsEditUsSsnPart3Flgs,Record.LOW_VALUES);
	private final ConditionName flgEditUsSsnPart3NotOk=new ConditionName(wsEditUsSsnPart3Flgs,"0");
	private final ConditionName flgEditUsSsnPart3Blank=new ConditionName(wsEditUsSsnPart3Flgs,"B");
	
	/**
	 * ****************************************************************
	 * Work variables
	 * ****************************************************************
	 */
	private final Group wsCalculationVars = new Group(root);
	private final Elementary wsDivBy = new Elementary(wsCalculationVars,new PackedType(4, 0, false, false, true),Short.valueOf("4"));
	private final Elementary wsDividend = new Elementary(wsCalculationVars,new PackedType(4, 0, false, false, true),Short.valueOf("0"));
	private final Elementary wsRemainder = new Elementary(wsCalculationVars,new PackedType(4, 0, false, false, true),Short.valueOf("0"));
	private final Elementary wsCurrDate = new Elementary(wsCalculationVars,new AlphanumericType(21)," ");
	private final Union union8 = new Union(wsCalculationVars);
	
	/**
	 * ****************************************************************
	 * Generic date edit variables CCYYMMDD
	 * ****************************************************************
	 * ****************************************************************
	 * Working Storage Copybook for DATE related code
	 * ****************************************************************
	 */
	private final Group wsEditDateCcyymmdd = new Group(union8);
	private final Union union9 = new Union(wsEditDateCcyymmdd);
	private final Group wsEditDateCcyy = new Group(union9);
	private final Union union10 = new Union(wsEditDateCcyy);
	private final Elementary wsEditDateCc = new Elementary(union10,new AlphanumericType(2));
	private final Elementary wsEditDateCcN = new Elementary(union10,new ZonedType(2, 0, false));
	private final ConditionName thisCentury=new ConditionName(wsEditDateCcN,new BigDecimal("20"));
	private final ConditionName lastCentury=new ConditionName(wsEditDateCcN,new BigDecimal("19"));
	private final Union union11 = new Union(wsEditDateCcyy);
	private final Elementary wsEditDateYy = new Elementary(union11,new AlphanumericType(2));
	private final Elementary wsEditDateYyN = new Elementary(union11,new ZonedType(2, 0, false));
	private final Elementary wsEditDateCcyyN = new Elementary(union9,new ZonedType(4, 0, false));
	private final Union union12 = new Union(wsEditDateCcyymmdd);
	private final Elementary wsEditDateMm = new Elementary(union12,new AlphanumericType(2));
	private final Elementary wsEditDateMmN = new Elementary(union12,new ZonedType(2, 0, false));
	private final ConditionName wsValidMonth=new ConditionName(wsEditDateMmN,Pair.of(new BigDecimal("1"),new BigDecimal("12")));
	private final ConditionName ws31DayMonth=new ConditionName(wsEditDateMmN,new BigDecimal("1"),
	new BigDecimal("3"),
	new BigDecimal("5"),
	new BigDecimal("7"),
	new BigDecimal("8"),
	new BigDecimal("10"),
	new BigDecimal("12"));
	private final ConditionName wsFebruary=new ConditionName(wsEditDateMmN,new BigDecimal("2"));
	private final Union union13 = new Union(wsEditDateCcyymmdd);
	private final Elementary wsEditDateDd = new Elementary(union13,new AlphanumericType(2));
	private final Elementary wsEditDateDdN = new Elementary(union13,new ZonedType(2, 0, false));
	private final ConditionName wsValidDay=new ConditionName(wsEditDateDdN,Pair.of(new BigDecimal("1"),new BigDecimal("31")));
	private final ConditionName wsDay31=new ConditionName(wsEditDateDdN,new BigDecimal("31"));
	private final ConditionName wsDay30=new ConditionName(wsEditDateDdN,new BigDecimal("30"));
	private final ConditionName wsDay29=new ConditionName(wsEditDateDdN,new BigDecimal("29"));
	private final ConditionName wsValidFebDay=new ConditionName(wsEditDateDdN,Pair.of(new BigDecimal("1"),new BigDecimal("28")));
	private final Elementary wsEditDateCcyymmddN = new Elementary(union8,new ZonedType(8, 0, false));
	private final Elementary wsEditDateBinary = new Elementary(wsCalculationVars,new BinaryType(9, 0, "STD", false, false, true));
	private final Group wsCurrentDate = new Group(wsCalculationVars);
	private final Union union14 = new Union(wsCurrentDate);
	private final Elementary wsCurrentDateYyyymmdd = new Elementary(union14,new AlphanumericType(8));
	private final Elementary wsCurrentDateYyyymmddN = new Elementary(union14,new ZonedType(8, 0, false));
	private final Elementary wsCurrentDateBinary = new Elementary(wsCurrentDate,new BinaryType(9, 0, "STD", false, false, true));
	private final Group wsEditDateFlgs = new Group(wsCalculationVars);
	private final ConditionName wsEditDateIsValid=new ConditionName(wsEditDateFlgs,Record.LOW_VALUES);
	private final ConditionName wsEditDateIsInvalid=new ConditionName(wsEditDateFlgs,"000");
	private final Elementary wsEditYearFlg = new Elementary(wsEditDateFlgs,new AlphanumericType(1));
	private final ConditionName flgYearIsvalid=new ConditionName(wsEditYearFlg,Record.LOW_VALUES);
	private final ConditionName flgYearNotOk=new ConditionName(wsEditYearFlg,"0");
	private final ConditionName flgYearBlank=new ConditionName(wsEditYearFlg,"B");
	private final Elementary wsEditMonth = new Elementary(wsEditDateFlgs,new AlphanumericType(1));
	private final ConditionName flgMonthIsvalid=new ConditionName(wsEditMonth,Record.LOW_VALUES);
	private final ConditionName flgMonthNotOk=new ConditionName(wsEditMonth,"0");
	private final ConditionName flgMonthBlank=new ConditionName(wsEditMonth,"B");
	private final Elementary wsEditDay = new Elementary(wsEditDateFlgs,new AlphanumericType(1));
	private final ConditionName flgDayIsvalid=new ConditionName(wsEditDay,Record.LOW_VALUES);
	private final ConditionName flgDayNotOk=new ConditionName(wsEditDay,"0");
	private final ConditionName flgDayBlank=new ConditionName(wsEditDay,"B");
	private final Elementary wsDateFormat = new Elementary(wsCalculationVars,new AlphanumericType(8),"YYYYMMDD");
	private final Group wsDateValidationResult = new Group(wsCalculationVars);
	private final Union union15 = new Union(wsDateValidationResult);
	private final Elementary wsSeverity = new Elementary(union15,new AlphanumericType(4));
	private final Elementary wsSeverityN = new Elementary(union15,new ZonedType(4, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(wsDateValidationResult,new AlphanumericType(11),"Mesg Code:");
	private final Union union16 = new Union(wsDateValidationResult);
	private final Elementary wsMsgNo = new Elementary(union16,new AlphanumericType(4));
	private final Elementary wsMsgNoN = new Elementary(union16,new ZonedType(4, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(wsDateValidationResult,new AlphanumericType(1)," ");
	private final Elementary wsResult = new Elementary(wsDateValidationResult,new AlphanumericType(15));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(wsDateValidationResult,new AlphanumericType(1)," ");
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(wsDateValidationResult,new AlphanumericType(9),"TstDate:");
	private final Elementary wsDate = new Elementary(wsDateValidationResult,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(wsDateValidationResult,new AlphanumericType(1)," ");
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(wsDateValidationResult,new AlphanumericType(10),"Mask used:");
	private final Elementary wsDateFmt = new Elementary(wsDateValidationResult,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(wsDateValidationResult,new AlphanumericType(1)," ");
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(wsDateValidationResult,new AlphanumericType(3)," ");
	
	/**
	 * 
	 * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT
	 * 
	 * ****************************************************************
	 */
	private final Elementary wsDatachangedFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName noChangesFound=new ConditionName(wsDatachangedFlag,"0");
	private final ConditionName changeHasOccurred=new ConditionName(wsDatachangedFlag,"1");
	private final Elementary wsInputFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName inputOk=new ConditionName(wsInputFlag,"0");
	private final ConditionName inputError=new ConditionName(wsInputFlag,"1");
	private final ConditionName inputPending=new ConditionName(wsInputFlag,Record.LOW_VALUES);
	private final Elementary wsReturnFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName wsReturnFlagOff=new ConditionName(wsReturnFlag,Record.LOW_VALUES);
	private final ConditionName wsReturnFlagOn=new ConditionName(wsReturnFlag,"1");
	private final Elementary wsPfkFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName pfkValid=new ConditionName(wsPfkFlag,"0");
	private final ConditionName pfkInvalid=new ConditionName(wsPfkFlag,"1");
	
	/**
	 * Program specific edits
	 */
	private final Elementary wsEditAcctFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgAcctfilterIsvalid=new ConditionName(wsEditAcctFlag,"1");
	private final ConditionName flgAcctfilterNotOk=new ConditionName(wsEditAcctFlag,"0");
	private final ConditionName flgAcctfilterBlank=new ConditionName(wsEditAcctFlag," ");
	private final Elementary wsEditCustFlag = new Elementary(root,new AlphanumericType(1));
	private final ConditionName flgCustfilterIsvalid=new ConditionName(wsEditCustFlag,"1");
	private final ConditionName flgCustfilterNotOk=new ConditionName(wsEditCustFlag,"0");
	private final ConditionName flgCustfilterBlank=new ConditionName(wsEditCustFlag," ");
	private final Group wsNonKeyFlags = new Group(root);
	private final Elementary wsEditAcctStatus = new Elementary(wsNonKeyFlags,new AlphanumericType(1));
	private final ConditionName flgAcctStatusIsvalid=new ConditionName(wsEditAcctStatus,"Y",
	"N");
	private final ConditionName flgAcctStatusNotOk=new ConditionName(wsEditAcctStatus,"0");
	private final ConditionName flgAcctStatusBlank=new ConditionName(wsEditAcctStatus,"B");
	private final Elementary wsEditCreditLimit = new Elementary(wsNonKeyFlags,new AlphanumericType(1));
	private final ConditionName flgCredLimitIsvalid=new ConditionName(wsEditCreditLimit,Record.LOW_VALUES);
	private final ConditionName flgCredLimitNotOk=new ConditionName(wsEditCreditLimit,"0");
	private final ConditionName flgCredLimitBlank=new ConditionName(wsEditCreditLimit,"B");
	private final Elementary wsEditCashCreditLimit = new Elementary(wsNonKeyFlags,new AlphanumericType(1));
	private final ConditionName flgCashCreditLimitIsvalid=new ConditionName(wsEditCashCreditLimit,Record.LOW_VALUES);
	private final ConditionName flgCashCreditLimitNotOk=new ConditionName(wsEditCashCreditLimit,"0");
	private final ConditionName flgCashCreditLimitBlank=new ConditionName(wsEditCashCreditLimit,"B");
	private final Elementary wsEditCurrBal = new Elementary(wsNonKeyFlags,new AlphanumericType(1));
	private final ConditionName flgCurrBalIsvalid=new ConditionName(wsEditCurrBal,Record.LOW_VALUES);
	private final ConditionName flgCurrBalNotOk=new ConditionName(wsEditCurrBal,"0");
	private final ConditionName flgCurrBalBlank=new ConditionName(wsEditCurrBal,"B");
	private final Elementary wsEditCurrCycCredit = new Elementary(wsNonKeyFlags,new AlphanumericType(1));
	private final ConditionName flgCurrCycCreditIsvalid=new ConditionName(wsEditCurrCycCredit,Record.LOW_VALUES);
	private final ConditionName flgCurrCycCreditNotOk=new ConditionName(wsEditCurrCycCredit,"0");
	private final ConditionName flgCurrCycCreditBlank=new ConditionName(wsEditCurrCycCredit,"B");
	private final Elementary wsEditCurrCycDebit = new Elementary(wsNonKeyFlags,new AlphanumericType(1));
	private final ConditionName flgCurrCycDebitIsvalid=new ConditionName(wsEditCurrCycDebit,Record.LOW_VALUES);
	private final ConditionName flgCurrCycDebitNotOk=new ConditionName(wsEditCurrCycDebit,"0");
	private final ConditionName flgCurrCycDebitBlank=new ConditionName(wsEditCurrCycDebit,"B");
	private final Group wsEditDtOfBirthFlgs = new Group(wsNonKeyFlags);
	private final ConditionName wsEditDtOfBirthInvalid=new ConditionName(wsEditDtOfBirthFlgs,"000");
	private final ConditionName wsEditDtOfBirthIsvalid=new ConditionName(wsEditDtOfBirthFlgs,Record.LOW_VALUES);
	private final Elementary wsEditDtOfBirthYearFlg = new Elementary(wsEditDtOfBirthFlgs,new AlphanumericType(1));
	private final ConditionName flgDtOfBirthYearIsvalid=new ConditionName(wsEditDtOfBirthYearFlg,Record.LOW_VALUES);
	private final ConditionName flgDtOfBirthYearNotOk=new ConditionName(wsEditDtOfBirthYearFlg,"0");
	private final ConditionName flgDtOfBirthYearBlank=new ConditionName(wsEditDtOfBirthYearFlg,"B");
	private final Elementary wsEditDtOfBirthMonth = new Elementary(wsEditDtOfBirthFlgs,new AlphanumericType(1));
	private final ConditionName flgDtOfBirthMonthIsvalid=new ConditionName(wsEditDtOfBirthMonth,Record.LOW_VALUES);
	private final ConditionName flgDtOfBirthMonthNotOk=new ConditionName(wsEditDtOfBirthMonth,"0");
	private final ConditionName flgDtOfBirthMonthBlank=new ConditionName(wsEditDtOfBirthMonth,"B");
	private final Elementary wsEditDtOfBirthDay = new Elementary(wsEditDtOfBirthFlgs,new AlphanumericType(1));
	private final ConditionName flgDtOfBirthDayIsvalid=new ConditionName(wsEditDtOfBirthDay,Record.LOW_VALUES);
	private final ConditionName flgDtOfBirthDayNotOk=new ConditionName(wsEditDtOfBirthDay,"0");
	private final ConditionName flgDtOfBirthDayBlank=new ConditionName(wsEditDtOfBirthDay,"B");
	private final Elementary wsEditFicoScoreFlgs = new Elementary(wsNonKeyFlags,new AlphanumericType(1));
	private final ConditionName flgFicoScoreIsvalid=new ConditionName(wsEditFicoScoreFlgs,Record.LOW_VALUES);
	private final ConditionName flgFicoScoreNotOk=new ConditionName(wsEditFicoScoreFlgs,"0");
	private final ConditionName flgFicoScoreBlank=new ConditionName(wsEditFicoScoreFlgs,"B");
	private final Group wsEditOpenDateFlgs = new Group(wsNonKeyFlags);
	private final ConditionName wsEditOpenDateIsInvalid=new ConditionName(wsEditOpenDateFlgs,"000");
	private final Elementary wsEditOpenYearFlg = new Elementary(wsEditOpenDateFlgs,new AlphanumericType(1));
	private final ConditionName flgOpenYearIsvalid=new ConditionName(wsEditOpenYearFlg,Record.LOW_VALUES);
	private final ConditionName flgOpenYearNotOk=new ConditionName(wsEditOpenYearFlg,"0");
	private final ConditionName flgOpenYearBlank=new ConditionName(wsEditOpenYearFlg,"B");
	private final Elementary wsEditOpenMonth = new Elementary(wsEditOpenDateFlgs,new AlphanumericType(1));
	private final ConditionName flgOpenMonthIsvalid=new ConditionName(wsEditOpenMonth,Record.LOW_VALUES);
	private final ConditionName flgOpenMonthNotOk=new ConditionName(wsEditOpenMonth,"0");
	private final ConditionName flgOpenMonthBlank=new ConditionName(wsEditOpenMonth,"B");
	private final Elementary wsEditOpenDay = new Elementary(wsEditOpenDateFlgs,new AlphanumericType(1));
	private final ConditionName flgOpenDayIsvalid=new ConditionName(wsEditOpenDay,Record.LOW_VALUES);
	private final ConditionName flgOpenDayNotOk=new ConditionName(wsEditOpenDay,"0");
	private final ConditionName flgOpenDayBlank=new ConditionName(wsEditOpenDay,"B");
	private final Group wsExpiryDateFlgs = new Group(wsNonKeyFlags);
	private final ConditionName wsEditExpiryIsInvalid=new ConditionName(wsExpiryDateFlgs,"000");
	private final Elementary wsEditExpiryYearFlg = new Elementary(wsExpiryDateFlgs,new AlphanumericType(1));
	private final ConditionName flgExpiryYearIsvalid=new ConditionName(wsEditExpiryYearFlg,Record.LOW_VALUES);
	private final ConditionName flgExpiryYearNotOk=new ConditionName(wsEditExpiryYearFlg,"0");
	private final ConditionName flgExpiryYearBlank=new ConditionName(wsEditExpiryYearFlg,"B");
	private final Elementary wsEditExpiryMonth = new Elementary(wsExpiryDateFlgs,new AlphanumericType(1));
	private final ConditionName flgExpiryMonthIsvalid=new ConditionName(wsEditExpiryMonth,Record.LOW_VALUES);
	private final ConditionName flgExpiryMonthNotOk=new ConditionName(wsEditExpiryMonth,"0");
	private final ConditionName flgExpiryMonthBlank=new ConditionName(wsEditExpiryMonth,"B");
	private final Elementary wsEditExpiryDay = new Elementary(wsExpiryDateFlgs,new AlphanumericType(1));
	private final ConditionName flgExpiryDayIsvalid=new ConditionName(wsEditExpiryDay,Record.LOW_VALUES);
	private final ConditionName flgExpiryDayNotOk=new ConditionName(wsEditExpiryDay,"0");
	private final ConditionName flgExpiryDayBlank=new ConditionName(wsEditExpiryDay,"B");
	private final Group wsEditReissueDateFlgs = new Group(wsNonKeyFlags);
	private final ConditionName wsEditReissueDateInvalid=new ConditionName(wsEditReissueDateFlgs,"000");
	private final Elementary wsEditReissueYearFlg = new Elementary(wsEditReissueDateFlgs,new AlphanumericType(1));
	private final ConditionName flgReissueYearIsvalid=new ConditionName(wsEditReissueYearFlg,Record.LOW_VALUES);
	private final ConditionName flgReissueYearNotOk=new ConditionName(wsEditReissueYearFlg,"0");
	private final ConditionName flgReissueYearBlank=new ConditionName(wsEditReissueYearFlg,"B");
	private final Elementary wsEditReissueMonth = new Elementary(wsEditReissueDateFlgs,new AlphanumericType(1));
	private final ConditionName flgReissueMonthIsvalid=new ConditionName(wsEditReissueMonth,Record.LOW_VALUES);
	private final ConditionName flgReissueMonthNotOk=new ConditionName(wsEditReissueMonth,"0");
	private final ConditionName flgReissueMonthBlank=new ConditionName(wsEditReissueMonth,"B");
	private final Elementary wsEditReissueDay = new Elementary(wsEditReissueDateFlgs,new AlphanumericType(1));
	private final ConditionName flgReissueDayIsvalid=new ConditionName(wsEditReissueDay,Record.LOW_VALUES);
	private final ConditionName flgReissueDayNotOk=new ConditionName(wsEditReissueDay,"0");
	private final ConditionName flgReissueDayBlank=new ConditionName(wsEditReissueDay,"B");
	private final Group wsEditNameFlags = new Group(wsNonKeyFlags);
	private final Elementary wsEditFirstNameFlgs = new Elementary(wsEditNameFlags,new AlphanumericType(1));
	private final ConditionName flgFirstNameIsvalid=new ConditionName(wsEditFirstNameFlgs,Record.LOW_VALUES);
	private final ConditionName flgFirstNameNotOk=new ConditionName(wsEditFirstNameFlgs,"0");
	private final ConditionName flgFirstNameBlank=new ConditionName(wsEditFirstNameFlgs,"B");
	private final Elementary wsEditMiddleNameFlgs = new Elementary(wsEditNameFlags,new AlphanumericType(1));
	private final ConditionName flgMiddleNameIsvalid=new ConditionName(wsEditMiddleNameFlgs,Record.LOW_VALUES);
	private final ConditionName flgMiddleNameNotOk=new ConditionName(wsEditMiddleNameFlgs,"0");
	private final ConditionName flgMiddleNameBlank=new ConditionName(wsEditMiddleNameFlgs,"B");
	private final Elementary wsEditLastNameFlgs = new Elementary(wsEditNameFlags,new AlphanumericType(1));
	private final ConditionName flgLastNameIsvalid=new ConditionName(wsEditLastNameFlgs,Record.LOW_VALUES);
	private final ConditionName flgLastNameNotOk=new ConditionName(wsEditLastNameFlgs,"0");
	private final ConditionName flgLastNameBlank=new ConditionName(wsEditLastNameFlgs,"B");
	private final Group wsEditAddressFlags = new Group(wsNonKeyFlags);
	private final Elementary wsEditAddressLine1Flgs = new Elementary(wsEditAddressFlags,new AlphanumericType(1));
	private final ConditionName flgAddressLine1Isvalid=new ConditionName(wsEditAddressLine1Flgs,Record.LOW_VALUES);
	private final ConditionName flgAddressLine1NotOk=new ConditionName(wsEditAddressLine1Flgs,"0");
	private final ConditionName flgAddressLine1Blank=new ConditionName(wsEditAddressLine1Flgs,"B");
	private final Elementary wsEditAddressLine2Flgs = new Elementary(wsEditAddressFlags,new AlphanumericType(1));
	private final ConditionName flgAddressLine2Isvalid=new ConditionName(wsEditAddressLine2Flgs,Record.LOW_VALUES);
	private final ConditionName flgAddressLine2NotOk=new ConditionName(wsEditAddressLine2Flgs,"0");
	private final ConditionName flgAddressLine2Blank=new ConditionName(wsEditAddressLine2Flgs,"B");
	private final Elementary wsEditCityFlgs = new Elementary(wsEditAddressFlags,new AlphanumericType(1));
	private final ConditionName flgCityIsvalid=new ConditionName(wsEditCityFlgs,Record.LOW_VALUES);
	private final ConditionName flgCityNotOk=new ConditionName(wsEditCityFlgs,"0");
	private final ConditionName flgCityBlank=new ConditionName(wsEditCityFlgs,"B");
	private final Elementary wsEditStateFlgs = new Elementary(wsEditAddressFlags,new AlphanumericType(1));
	private final ConditionName flgStateIsvalid=new ConditionName(wsEditStateFlgs,Record.LOW_VALUES);
	private final ConditionName flgStateNotOk=new ConditionName(wsEditStateFlgs,"0");
	private final ConditionName flgStateBlank=new ConditionName(wsEditStateFlgs,"B");
	private final Elementary wsEditZipcodeFlgs = new Elementary(wsEditAddressFlags,new AlphanumericType(1));
	private final ConditionName flgZipcodeIsvalid=new ConditionName(wsEditZipcodeFlgs,Record.LOW_VALUES);
	private final ConditionName flgZipcodeNotOk=new ConditionName(wsEditZipcodeFlgs,"0");
	private final ConditionName flgZipcodeBlank=new ConditionName(wsEditZipcodeFlgs,"B");
	private final Elementary wsEditCountryFlgs = new Elementary(wsEditAddressFlags,new AlphanumericType(1));
	private final ConditionName flgCountryIsvalid=new ConditionName(wsEditCountryFlgs,Record.LOW_VALUES);
	private final ConditionName flgCountryNotOk=new ConditionName(wsEditCountryFlgs,"0");
	private final ConditionName flgCountryBlank=new ConditionName(wsEditCountryFlgs,"B");
	private final Group wsEditPhoneNum1Flgs = new Group(wsEditAddressFlags);
	private final ConditionName wsEditPhoneNum1IsInvalid=new ConditionName(wsEditPhoneNum1Flgs,"000");
	private final Elementary wsEditPhoneNum1aFlg = new Elementary(wsEditPhoneNum1Flgs,new AlphanumericType(1));
	private final ConditionName flgPhoneNum1aIsvalid=new ConditionName(wsEditPhoneNum1aFlg,Record.LOW_VALUES);
	private final ConditionName flgPhoneNum1aNotOk=new ConditionName(wsEditPhoneNum1aFlg,"0");
	private final ConditionName flgPhoneNum1aBlank=new ConditionName(wsEditPhoneNum1aFlg,"B");
	private final Elementary wsEditPhoneNum1b = new Elementary(wsEditPhoneNum1Flgs,new AlphanumericType(1));
	private final ConditionName flgPhoneNum1bIsvalid=new ConditionName(wsEditPhoneNum1b,Record.LOW_VALUES);
	private final ConditionName flgPhoneNum1bNotOk=new ConditionName(wsEditPhoneNum1b,"0");
	private final ConditionName flgPhoneNum1bBlank=new ConditionName(wsEditPhoneNum1b,"B");
	private final Elementary wsEditPhoneNum1c = new Elementary(wsEditPhoneNum1Flgs,new AlphanumericType(1));
	private final ConditionName flgPhoneNum1cIsvalid=new ConditionName(wsEditPhoneNum1c,Record.LOW_VALUES);
	private final ConditionName flgPhoneNum1cNotOk=new ConditionName(wsEditPhoneNum1c,"0");
	private final ConditionName flgPhoneNum1cBlank=new ConditionName(wsEditPhoneNum1c,"B");
	private final Group wsEditPhoneNum2Flgs = new Group(wsEditAddressFlags);
	private final ConditionName wsEditPhoneNum2IsInvalid=new ConditionName(wsEditPhoneNum2Flgs,"000");
	private final Elementary wsEditPhoneNum2aFlg = new Elementary(wsEditPhoneNum2Flgs,new AlphanumericType(1));
	private final ConditionName flgPhoneNum2aIsvalid=new ConditionName(wsEditPhoneNum2aFlg,Record.LOW_VALUES);
	private final ConditionName flgPhoneNum2aNotOk=new ConditionName(wsEditPhoneNum2aFlg,"0");
	private final ConditionName flgPhoneNum2aBlank=new ConditionName(wsEditPhoneNum2aFlg,"B");
	private final Elementary wsEditPhoneNum2b = new Elementary(wsEditPhoneNum2Flgs,new AlphanumericType(1));
	private final ConditionName flgPhoneNum2bIsvalid=new ConditionName(wsEditPhoneNum2b,Record.LOW_VALUES);
	private final ConditionName flgPhoneNum2bNotOk=new ConditionName(wsEditPhoneNum2b,"0");
	private final ConditionName flgPhoneNum2bBlank=new ConditionName(wsEditPhoneNum2b,"B");
	private final Elementary wsEditPhoneNum2c = new Elementary(wsEditPhoneNum2Flgs,new AlphanumericType(1));
	private final ConditionName flgPhoneNum2cIsvalid=new ConditionName(wsEditPhoneNum2c,Record.LOW_VALUES);
	private final ConditionName flgPhoneNum2cNotOk=new ConditionName(wsEditPhoneNum2c,"0");
	private final ConditionName flgPhoneNum2cBlank=new ConditionName(wsEditPhoneNum2c,"B");
	private final Elementary wsEftAccountIdFlgs = new Elementary(wsNonKeyFlags,new AlphanumericType(1));
	private final ConditionName flgEftAccountIdIsvalid=new ConditionName(wsEftAccountIdFlgs,Record.LOW_VALUES);
	private final ConditionName flgEftAccountIdNotOk=new ConditionName(wsEftAccountIdFlgs,"0");
	private final ConditionName flgEftAccountIdBlank=new ConditionName(wsEftAccountIdFlgs,"B");
	private final Elementary wsEditPriCardholder = new Elementary(wsNonKeyFlags,new AlphanumericType(1));
	private final ConditionName flgPriCardholderIsvalid=new ConditionName(wsEditPriCardholder,"Y",
	"N");
	private final ConditionName flgPriCardholderNotOk=new ConditionName(wsEditPriCardholder,"0");
	private final ConditionName flgPriCardholderBlank=new ConditionName(wsEditPriCardholder,"B");
	
	/**
	 * ****************************************************************
	 * Output edits
	 * ****************************************************************
	 */
	private final Group cicsOutputEditVars = new Group(root);
	private final Union union17 = new Union(cicsOutputEditVars);
	private final Elementary custAcctIdX = new Elementary(union17,new AlphanumericType(11));
	private final Elementary custAcctIdN = new Elementary(union17,new ZonedType(11, 0, false));
	private final Union union18 = new Union(cicsOutputEditVars);
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(union18,new AlphanumericType(10));
	private final Group group = new Group(union18);
	private final Elementary wsEditDateXYear = new Elementary(group,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(group,new AlphanumericType(1));
	private final Elementary wsEditDateMonth = new Elementary(group,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(group,new AlphanumericType(1));
	private final Elementary wsEditDateDay = new Elementary(group,new AlphanumericType(2));
	private final Union union19 = new Union(cicsOutputEditVars);
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(union19,new ZonedType(10, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(union19,new ZonedType(10, 0, false));
	private final Elementary wsEditCurrency92 = new Elementary(cicsOutputEditVars,new AlphanumericType(15));
	private final Elementary wsEditCurrency92F = new Elementary(cicsOutputEditVars,new NumericEditedType("+ZZZ,ZZZ,ZZZ.99"));
	
	/**
	 * ****************************************************************
	 * File and data Handling
	 * ****************************************************************
	 */
	private final Group wsXrefRid = new Group(root);
	private final Elementary wsCardRidCardnum = new Elementary(wsXrefRid,new AlphanumericType(16));
	private final Union union20 = new Union(wsXrefRid);
	private final Elementary wsCardRidCustId = new Elementary(union20,new ZonedType(9, 0, false));
	private final Elementary wsCardRidCustIdX = new Elementary(union20,new AlphanumericType(9));
	private final Union union21 = new Union(wsXrefRid);
	private final Elementary wsCardRidAcctId = new Elementary(union21,new ZonedType(11, 0, false));
	private final Elementary wsCardRidAcctIdX = new Elementary(union21,new AlphanumericType(11));
	private final Group wsFileReadFlags = new Group(root);
	private final Elementary wsAccountMasterReadFlag = new Elementary(wsFileReadFlags,new AlphanumericType(1));
	private final ConditionName foundAcctInMaster=new ConditionName(wsAccountMasterReadFlag,"1");
	private final Elementary wsCustMasterReadFlag = new Elementary(wsFileReadFlags,new AlphanumericType(1));
	private final ConditionName foundCustInMaster=new ConditionName(wsCustMasterReadFlag,"1");
	private final Group wsFileErrorMessage = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(wsFileErrorMessage,new AlphanumericType(12),"File Error: ");
	private final Elementary errorOpname = new Elementary(wsFileErrorMessage,new AlphanumericType(8)," ");
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(wsFileErrorMessage,new AlphanumericType(4)," on ");
	private final Elementary errorFile = new Elementary(wsFileErrorMessage,new AlphanumericType(9)," ");
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(wsFileErrorMessage,new AlphanumericType(15)," returned RESP ");
	private final Elementary errorResp = new Elementary(wsFileErrorMessage,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(wsFileErrorMessage,new AlphanumericType(7),",RESP2 ");
	private final Elementary errorResp2 = new Elementary(wsFileErrorMessage,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(wsFileErrorMessage,new AlphanumericType(5)," ");
	
	/**
	 * Alpha variables for editing numerics
	 * 
	 */
	private final Group alphaVarsForDataEditing = new Group(root);
	private final Elementary acupNewCreditLimitX = new Elementary(alphaVarsForDataEditing,new AlphanumericType(15));
	private final Elementary acupNewCashCreditLimitX = new Elementary(alphaVarsForDataEditing,new AlphanumericType(15));
	private final Elementary acupNewCurrBalX = new Elementary(alphaVarsForDataEditing,new AlphanumericType(15));
	private final Elementary acupNewCurrCycCreditX = new Elementary(alphaVarsForDataEditing,new AlphanumericType(15));
	private final Elementary acupNewCurrCycDebitX = new Elementary(alphaVarsForDataEditing,new AlphanumericType(15));
	private final Group acctUpdateRecord = new Group(root);
	
	/**
	 * ****************************************************************
	 * Data-structure for  account entity (RECLN 300)
	 * ****************************************************************
	 */
	private final Elementary acctUpdateId = new Elementary(acctUpdateRecord,new ZonedType(11, 0, false));
	private final Elementary acctUpdateActiveStatus = new Elementary(acctUpdateRecord,new AlphanumericType(1));
	private final Elementary acctUpdateCurrBal = new Elementary(acctUpdateRecord,new ZonedType(10, 2, false, false, true));
	private final Elementary acctUpdateCreditLimit = new Elementary(acctUpdateRecord,new ZonedType(10, 2, false, false, true));
	private final Elementary acctUpdateCashCreditLimit = new Elementary(acctUpdateRecord,new ZonedType(10, 2, false, false, true));
	private final Elementary acctUpdateOpenDate = new Elementary(acctUpdateRecord,new AlphanumericType(10));
	private final Elementary acctUpdateExpiraionDate = new Elementary(acctUpdateRecord,new AlphanumericType(10));
	private final Elementary acctUpdateReissueDate = new Elementary(acctUpdateRecord,new AlphanumericType(10));
	private final Elementary acctUpdateCurrCycCredit = new Elementary(acctUpdateRecord,new ZonedType(10, 2, false, false, true));
	private final Elementary acctUpdateCurrCycDebit = new Elementary(acctUpdateRecord,new ZonedType(10, 2, false, false, true));
	private final Elementary acctUpdateGroupId = new Elementary(acctUpdateRecord,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(acctUpdateRecord,new AlphanumericType(188));
	private final Group custUpdateRecord = new Group(root);
	
	/**
	 * ****************************************************************
	 * Data-structure for  CUSTOMER entity (RECLN 300)
	 * ****************************************************************
	 */
	private final Elementary custUpdateId = new Elementary(custUpdateRecord,new ZonedType(9, 0, false));
	private final Elementary custUpdateFirstName = new Elementary(custUpdateRecord,new AlphanumericType(25));
	private final Elementary custUpdateMiddleName = new Elementary(custUpdateRecord,new AlphanumericType(25));
	private final Elementary custUpdateLastName = new Elementary(custUpdateRecord,new AlphanumericType(25));
	private final Elementary custUpdateAddrLine1 = new Elementary(custUpdateRecord,new AlphanumericType(50));
	private final Elementary custUpdateAddrLine2 = new Elementary(custUpdateRecord,new AlphanumericType(50));
	private final Elementary custUpdateAddrLine3 = new Elementary(custUpdateRecord,new AlphanumericType(50));
	private final Elementary custUpdateAddrStateCd = new Elementary(custUpdateRecord,new AlphanumericType(2));
	private final Elementary custUpdateAddrCountryCd = new Elementary(custUpdateRecord,new AlphanumericType(3));
	private final Elementary custUpdateAddrZip = new Elementary(custUpdateRecord,new AlphanumericType(10));
	private final Elementary custUpdatePhoneNum1 = new Elementary(custUpdateRecord,new AlphanumericType(15));
	private final Elementary custUpdatePhoneNum2 = new Elementary(custUpdateRecord,new AlphanumericType(15));
	private final Elementary custUpdateSsn = new Elementary(custUpdateRecord,new ZonedType(9, 0, false));
	private final Elementary custUpdateGovtIssuedId = new Elementary(custUpdateRecord,new AlphanumericType(20));
	private final Elementary custUpdateDobYyyyMmDd = new Elementary(custUpdateRecord,new AlphanumericType(10));
	private final Elementary custUpdateEftAccountId = new Elementary(custUpdateRecord,new AlphanumericType(10));
	private final Elementary custUpdatePriCardInd = new Elementary(custUpdateRecord,new AlphanumericType(1));
	private final Elementary custUpdateFicoCreditScore = new Elementary(custUpdateRecord,new ZonedType(3, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(custUpdateRecord,new AlphanumericType(168));
	
	/**
	 * ****************************************************************
	 * Output Message Construction
	 * ****************************************************************
	 */
	private final Elementary wsLongMsg = new Elementary(root,new AlphanumericType(500));
	private final Elementary wsInfoMsg = new Elementary(root,new AlphanumericType(40));
	private final ConditionName wsNoInfoMessage=new ConditionName(wsInfoMsg," ",
	Record.LOW_VALUES);
	private final ConditionName foundAccountData=new ConditionName(wsInfoMsg,"Details of selected account shown above");
	private final ConditionName promptForSearchKeys=new ConditionName(wsInfoMsg,"Enter or update id of account to update");
	private final ConditionName promptForChanges=new ConditionName(wsInfoMsg,"Update account details presented above.");
	private final ConditionName promptForConfirmation=new ConditionName(wsInfoMsg,"Changes validated.Press F5 to save");
	private final ConditionName confirmUpdateSuccess=new ConditionName(wsInfoMsg,"Changes committed to database");
	private final ConditionName informFailure=new ConditionName(wsInfoMsg,"Changes unsuccessful. Please try again");
	private final Elementary wsReturnMsg = new Elementary(root,new AlphanumericType(75));
	private final ConditionName wsReturnMsgOff=new ConditionName(wsReturnMsg," ");
	private final ConditionName wsExitMessage=new ConditionName(wsReturnMsg,"PF03 pressed.Exiting              ");
	private final ConditionName wsPromptForAcct=new ConditionName(wsReturnMsg,"Account number not provided");
	private final ConditionName wsPromptForLastname=new ConditionName(wsReturnMsg,"Last name not provided");
	private final ConditionName wsNameMustBeAlpha=new ConditionName(wsReturnMsg,"Name can only contain alphabets and spaces");
	private final ConditionName noSearchCriteriaReceived=new ConditionName(wsReturnMsg,"No input received");
	private final ConditionName noChangesDetected=new ConditionName(wsReturnMsg,"No change detected with respect to values fetched.");
	private final ConditionName searchedAcctZeroes=new ConditionName(wsReturnMsg,"Account number must be a non zero 11 digit number");
	private final ConditionName searchedAcctNotNumeric=new ConditionName(wsReturnMsg,"Account number must be a non zero 11 digit number");
	private final ConditionName didNotFindAcctInAcctdat=new ConditionName(wsReturnMsg,"Did not find this account in account master file");
	private final ConditionName didNotFindCustInCustdat=new ConditionName(wsReturnMsg,"Did not find associated customer in master file");
	private final ConditionName acctStatusMustBeYesNo=new ConditionName(wsReturnMsg,"Account Active Status must be Y or N");
	private final ConditionName credLimitIsBlank=new ConditionName(wsReturnMsg,"Credit Limit must be supplied");
	private final ConditionName credLimitIsNotValid=new ConditionName(wsReturnMsg,"Credit Limit is not valid");
	private final ConditionName thisMonthNotValid=new ConditionName(wsReturnMsg,"Card expiry month must be between 1 and 12");
	private final ConditionName thisYearNotValid=new ConditionName(wsReturnMsg,"Invalid card expiry year");
	private final ConditionName didNotFindAcctcardCombo=new ConditionName(wsReturnMsg,"Did not find cards for this search condition");
	private final ConditionName couldNotLockAcctForUpdate=new ConditionName(wsReturnMsg,"Could not lock account record for update");
	private final ConditionName couldNotLockCustForUpdate=new ConditionName(wsReturnMsg,"Could not lock customer record for update");
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
	 * Gets the reference for attribute wsGenericEdits.
	 * @return the wsGenericEdits attribute reference
	 */
	public RangeReference getWsGenericEditsReference() {
		return wsGenericEdits.getReference();
	}	
				
	/**
	 * Setter for wsGenericEdits .
	 */
   	public void setWsGenericEdits(RangeReference reference) {
       	wsGenericEdits.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditVariableName.
	 * @return the wsEditVariableName attribute reference
	 */
	public ElementaryRangeReference getWsEditVariableNameReference() {
		return wsEditVariableName.getReference();
	}

	/**
	 * Getter for wsEditVariableName attribute.
	 * @return wsEditVariableName attribute
	 */
	public String getWsEditVariableName() {
		return wsEditVariableName.getValue();
	}

	/**
	 * Setter for wsEditVariableName attribute.
	 * @param wsEditVariableName the new value of wsEditVariableName
	 */
	public void setWsEditVariableName(String wsEditVariableName) {
		this.wsEditVariableName.setValue(wsEditVariableName);
	}
	/**
	 * Gets the reference for attribute wsEditSignedNumber9v2X.
	 * @return the wsEditSignedNumber9v2X attribute reference
	 */
	public ElementaryRangeReference getWsEditSignedNumber9v2XReference() {
		return wsEditSignedNumber9v2X.getReference();
	}

	/**
	 * Getter for wsEditSignedNumber9v2X attribute.
	 * @return wsEditSignedNumber9v2X attribute
	 */
	public String getWsEditSignedNumber9v2X() {
		return wsEditSignedNumber9v2X.getValue();
	}

	/**
	 * Setter for wsEditSignedNumber9v2X attribute.
	 * @param wsEditSignedNumber9v2X the new value of wsEditSignedNumber9v2X
	 */
	public void setWsEditSignedNumber9v2X(String wsEditSignedNumber9v2X) {
		this.wsEditSignedNumber9v2X.setValue(wsEditSignedNumber9v2X);
	}
	/**
	 * Gets the reference for attribute wsFlgSignedNumberEdit.
	 * @return the wsFlgSignedNumberEdit attribute reference
	 */
	public ElementaryRangeReference getWsFlgSignedNumberEditReference() {
		return wsFlgSignedNumberEdit.getReference();
	}

	/**
	 * Getter for wsFlgSignedNumberEdit attribute.
	 * @return wsFlgSignedNumberEdit attribute
	 */
	public String getWsFlgSignedNumberEdit() {
		return wsFlgSignedNumberEdit.getValue();
	}

	/**
	 * Setter for wsFlgSignedNumberEdit attribute.
	 * @param wsFlgSignedNumberEdit the new value of wsFlgSignedNumberEdit
	 */
	public void setWsFlgSignedNumberEdit(String wsFlgSignedNumberEdit) {
		this.wsFlgSignedNumberEdit.setValue(wsFlgSignedNumberEdit);
	}
	/**
	 * Gets the reference for attribute flgSignedNumberIsvalid.
	 * @return the flgSignedNumberIsvalid attribute reference
	 */
	public ConditionReference getFlgSignedNumberIsvalidReference() {
		return wsFlgSignedNumberEdit.getCondition(flgSignedNumberIsvalid);	
	}

	/**
	 * Getter for flgSignedNumberIsvalid attribute.
	 * @return flgSignedNumberIsvalid attribute
	 */
	public boolean isFlgSignedNumberIsvalid() {
		return getFlgSignedNumberIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgSignedNumberIsvalid attribute.
	 * @param flgSignedNumberIsvalid the new value of flgSignedNumberIsvalid
	 */
	public void setFlgSignedNumberIsvalid(boolean flgSignedNumberIsvalid) {
		getFlgSignedNumberIsvalidReference().setValue(flgSignedNumberIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgSignedNumberNotOk.
	 * @return the flgSignedNumberNotOk attribute reference
	 */
	public ConditionReference getFlgSignedNumberNotOkReference() {
		return wsFlgSignedNumberEdit.getCondition(flgSignedNumberNotOk);	
	}

	/**
	 * Getter for flgSignedNumberNotOk attribute.
	 * @return flgSignedNumberNotOk attribute
	 */
	public boolean isFlgSignedNumberNotOk() {
		return getFlgSignedNumberNotOkReference().getValue();	
	}

	/**
	 * Setter for flgSignedNumberNotOk attribute.
	 * @param flgSignedNumberNotOk the new value of flgSignedNumberNotOk
	 */
	public void setFlgSignedNumberNotOk(boolean flgSignedNumberNotOk) {
		getFlgSignedNumberNotOkReference().setValue(flgSignedNumberNotOk);	
	}
	/**
	 * Gets the reference for attribute flgSignedNumberBlank.
	 * @return the flgSignedNumberBlank attribute reference
	 */
	public ConditionReference getFlgSignedNumberBlankReference() {
		return wsFlgSignedNumberEdit.getCondition(flgSignedNumberBlank);	
	}

	/**
	 * Getter for flgSignedNumberBlank attribute.
	 * @return flgSignedNumberBlank attribute
	 */
	public boolean isFlgSignedNumberBlank() {
		return getFlgSignedNumberBlankReference().getValue();	
	}

	/**
	 * Setter for flgSignedNumberBlank attribute.
	 * @param flgSignedNumberBlank the new value of flgSignedNumberBlank
	 */
	public void setFlgSignedNumberBlank(boolean flgSignedNumberBlank) {
		getFlgSignedNumberBlankReference().setValue(flgSignedNumberBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditAlphanumOnly.
	 * @return the wsEditAlphanumOnly attribute reference
	 */
	public ElementaryRangeReference getWsEditAlphanumOnlyReference() {
		return wsEditAlphanumOnly.getReference();
	}

	/**
	 * Getter for wsEditAlphanumOnly attribute.
	 * @return wsEditAlphanumOnly attribute
	 */
	public String getWsEditAlphanumOnly() {
		return wsEditAlphanumOnly.getValue();
	}

	/**
	 * Setter for wsEditAlphanumOnly attribute.
	 * @param wsEditAlphanumOnly the new value of wsEditAlphanumOnly
	 */
	public void setWsEditAlphanumOnly(String wsEditAlphanumOnly) {
		this.wsEditAlphanumOnly.setValue(wsEditAlphanumOnly);
	}
	/**
	 * Gets the reference for attribute wsEditAlphanumLength.
	 * @return the wsEditAlphanumLength attribute reference
	 */
	public ElementaryRangeReference getWsEditAlphanumLengthReference() {
		return wsEditAlphanumLength.getReference();
	}

	/**
	 * Getter for wsEditAlphanumLength attribute.
	 * @return wsEditAlphanumLength attribute
	 */
	public int getWsEditAlphanumLength() {
		return wsEditAlphanumLength.getValue();
	}

	/**
	 * Setter for wsEditAlphanumLength attribute.
	 * @param wsEditAlphanumLength the new value of wsEditAlphanumLength
	 */
	public void setWsEditAlphanumLength(int wsEditAlphanumLength) {
		this.wsEditAlphanumLength.setValue(wsEditAlphanumLength);
	}
	/**
	 * Gets the reference for attribute wsEditAlphaOnlyFlags.
	 * @return the wsEditAlphaOnlyFlags attribute reference
	 */
	public ElementaryRangeReference getWsEditAlphaOnlyFlagsReference() {
		return wsEditAlphaOnlyFlags.getReference();
	}

	/**
	 * Getter for wsEditAlphaOnlyFlags attribute.
	 * @return wsEditAlphaOnlyFlags attribute
	 */
	public String getWsEditAlphaOnlyFlags() {
		return wsEditAlphaOnlyFlags.getValue();
	}

	/**
	 * Setter for wsEditAlphaOnlyFlags attribute.
	 * @param wsEditAlphaOnlyFlags the new value of wsEditAlphaOnlyFlags
	 */
	public void setWsEditAlphaOnlyFlags(String wsEditAlphaOnlyFlags) {
		this.wsEditAlphaOnlyFlags.setValue(wsEditAlphaOnlyFlags);
	}
	/**
	 * Gets the reference for attribute flgAlphaIsvalid.
	 * @return the flgAlphaIsvalid attribute reference
	 */
	public ConditionReference getFlgAlphaIsvalidReference() {
		return wsEditAlphaOnlyFlags.getCondition(flgAlphaIsvalid);	
	}

	/**
	 * Getter for flgAlphaIsvalid attribute.
	 * @return flgAlphaIsvalid attribute
	 */
	public boolean isFlgAlphaIsvalid() {
		return getFlgAlphaIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgAlphaIsvalid attribute.
	 * @param flgAlphaIsvalid the new value of flgAlphaIsvalid
	 */
	public void setFlgAlphaIsvalid(boolean flgAlphaIsvalid) {
		getFlgAlphaIsvalidReference().setValue(flgAlphaIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgAlphaNotOk.
	 * @return the flgAlphaNotOk attribute reference
	 */
	public ConditionReference getFlgAlphaNotOkReference() {
		return wsEditAlphaOnlyFlags.getCondition(flgAlphaNotOk);	
	}

	/**
	 * Getter for flgAlphaNotOk attribute.
	 * @return flgAlphaNotOk attribute
	 */
	public boolean isFlgAlphaNotOk() {
		return getFlgAlphaNotOkReference().getValue();	
	}

	/**
	 * Setter for flgAlphaNotOk attribute.
	 * @param flgAlphaNotOk the new value of flgAlphaNotOk
	 */
	public void setFlgAlphaNotOk(boolean flgAlphaNotOk) {
		getFlgAlphaNotOkReference().setValue(flgAlphaNotOk);	
	}
	/**
	 * Gets the reference for attribute flgAlphaBlank.
	 * @return the flgAlphaBlank attribute reference
	 */
	public ConditionReference getFlgAlphaBlankReference() {
		return wsEditAlphaOnlyFlags.getCondition(flgAlphaBlank);	
	}

	/**
	 * Getter for flgAlphaBlank attribute.
	 * @return flgAlphaBlank attribute
	 */
	public boolean isFlgAlphaBlank() {
		return getFlgAlphaBlankReference().getValue();	
	}

	/**
	 * Setter for flgAlphaBlank attribute.
	 * @param flgAlphaBlank the new value of flgAlphaBlank
	 */
	public void setFlgAlphaBlank(boolean flgAlphaBlank) {
		getFlgAlphaBlankReference().setValue(flgAlphaBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditAlphanumOnlyFlags.
	 * @return the wsEditAlphanumOnlyFlags attribute reference
	 */
	public ElementaryRangeReference getWsEditAlphanumOnlyFlagsReference() {
		return wsEditAlphanumOnlyFlags.getReference();
	}

	/**
	 * Getter for wsEditAlphanumOnlyFlags attribute.
	 * @return wsEditAlphanumOnlyFlags attribute
	 */
	public String getWsEditAlphanumOnlyFlags() {
		return wsEditAlphanumOnlyFlags.getValue();
	}

	/**
	 * Setter for wsEditAlphanumOnlyFlags attribute.
	 * @param wsEditAlphanumOnlyFlags the new value of wsEditAlphanumOnlyFlags
	 */
	public void setWsEditAlphanumOnlyFlags(String wsEditAlphanumOnlyFlags) {
		this.wsEditAlphanumOnlyFlags.setValue(wsEditAlphanumOnlyFlags);
	}
	/**
	 * Gets the reference for attribute flgAlphnanumIsvalid.
	 * @return the flgAlphnanumIsvalid attribute reference
	 */
	public ConditionReference getFlgAlphnanumIsvalidReference() {
		return wsEditAlphanumOnlyFlags.getCondition(flgAlphnanumIsvalid);	
	}

	/**
	 * Getter for flgAlphnanumIsvalid attribute.
	 * @return flgAlphnanumIsvalid attribute
	 */
	public boolean isFlgAlphnanumIsvalid() {
		return getFlgAlphnanumIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgAlphnanumIsvalid attribute.
	 * @param flgAlphnanumIsvalid the new value of flgAlphnanumIsvalid
	 */
	public void setFlgAlphnanumIsvalid(boolean flgAlphnanumIsvalid) {
		getFlgAlphnanumIsvalidReference().setValue(flgAlphnanumIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgAlphnanumNotOk.
	 * @return the flgAlphnanumNotOk attribute reference
	 */
	public ConditionReference getFlgAlphnanumNotOkReference() {
		return wsEditAlphanumOnlyFlags.getCondition(flgAlphnanumNotOk);	
	}

	/**
	 * Getter for flgAlphnanumNotOk attribute.
	 * @return flgAlphnanumNotOk attribute
	 */
	public boolean isFlgAlphnanumNotOk() {
		return getFlgAlphnanumNotOkReference().getValue();	
	}

	/**
	 * Setter for flgAlphnanumNotOk attribute.
	 * @param flgAlphnanumNotOk the new value of flgAlphnanumNotOk
	 */
	public void setFlgAlphnanumNotOk(boolean flgAlphnanumNotOk) {
		getFlgAlphnanumNotOkReference().setValue(flgAlphnanumNotOk);	
	}
	/**
	 * Gets the reference for attribute flgAlphnanumBlank.
	 * @return the flgAlphnanumBlank attribute reference
	 */
	public ConditionReference getFlgAlphnanumBlankReference() {
		return wsEditAlphanumOnlyFlags.getCondition(flgAlphnanumBlank);	
	}

	/**
	 * Getter for flgAlphnanumBlank attribute.
	 * @return flgAlphnanumBlank attribute
	 */
	public boolean isFlgAlphnanumBlank() {
		return getFlgAlphnanumBlankReference().getValue();	
	}

	/**
	 * Setter for flgAlphnanumBlank attribute.
	 * @param flgAlphnanumBlank the new value of flgAlphnanumBlank
	 */
	public void setFlgAlphnanumBlank(boolean flgAlphnanumBlank) {
		getFlgAlphnanumBlankReference().setValue(flgAlphnanumBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditMandatoryFlags.
	 * @return the wsEditMandatoryFlags attribute reference
	 */
	public ElementaryRangeReference getWsEditMandatoryFlagsReference() {
		return wsEditMandatoryFlags.getReference();
	}

	/**
	 * Getter for wsEditMandatoryFlags attribute.
	 * @return wsEditMandatoryFlags attribute
	 */
	public String getWsEditMandatoryFlags() {
		return wsEditMandatoryFlags.getValue();
	}

	/**
	 * Setter for wsEditMandatoryFlags attribute.
	 * @param wsEditMandatoryFlags the new value of wsEditMandatoryFlags
	 */
	public void setWsEditMandatoryFlags(String wsEditMandatoryFlags) {
		this.wsEditMandatoryFlags.setValue(wsEditMandatoryFlags);
	}
	/**
	 * Gets the reference for attribute flgMandatoryIsvalid.
	 * @return the flgMandatoryIsvalid attribute reference
	 */
	public ConditionReference getFlgMandatoryIsvalidReference() {
		return wsEditMandatoryFlags.getCondition(flgMandatoryIsvalid);	
	}

	/**
	 * Getter for flgMandatoryIsvalid attribute.
	 * @return flgMandatoryIsvalid attribute
	 */
	public boolean isFlgMandatoryIsvalid() {
		return getFlgMandatoryIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgMandatoryIsvalid attribute.
	 * @param flgMandatoryIsvalid the new value of flgMandatoryIsvalid
	 */
	public void setFlgMandatoryIsvalid(boolean flgMandatoryIsvalid) {
		getFlgMandatoryIsvalidReference().setValue(flgMandatoryIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgMandatoryNotOk.
	 * @return the flgMandatoryNotOk attribute reference
	 */
	public ConditionReference getFlgMandatoryNotOkReference() {
		return wsEditMandatoryFlags.getCondition(flgMandatoryNotOk);	
	}

	/**
	 * Getter for flgMandatoryNotOk attribute.
	 * @return flgMandatoryNotOk attribute
	 */
	public boolean isFlgMandatoryNotOk() {
		return getFlgMandatoryNotOkReference().getValue();	
	}

	/**
	 * Setter for flgMandatoryNotOk attribute.
	 * @param flgMandatoryNotOk the new value of flgMandatoryNotOk
	 */
	public void setFlgMandatoryNotOk(boolean flgMandatoryNotOk) {
		getFlgMandatoryNotOkReference().setValue(flgMandatoryNotOk);	
	}
	/**
	 * Gets the reference for attribute flgMandatoryBlank.
	 * @return the flgMandatoryBlank attribute reference
	 */
	public ConditionReference getFlgMandatoryBlankReference() {
		return wsEditMandatoryFlags.getCondition(flgMandatoryBlank);	
	}

	/**
	 * Getter for flgMandatoryBlank attribute.
	 * @return flgMandatoryBlank attribute
	 */
	public boolean isFlgMandatoryBlank() {
		return getFlgMandatoryBlankReference().getValue();	
	}

	/**
	 * Setter for flgMandatoryBlank attribute.
	 * @param flgMandatoryBlank the new value of flgMandatoryBlank
	 */
	public void setFlgMandatoryBlank(boolean flgMandatoryBlank) {
		getFlgMandatoryBlankReference().setValue(flgMandatoryBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditYesNo.
	 * @return the wsEditYesNo attribute reference
	 */
	public ElementaryRangeReference getWsEditYesNoReference() {
		return wsEditYesNo.getReference();
	}

	/**
	 * Getter for wsEditYesNo attribute.
	 * @return wsEditYesNo attribute
	 */
	public String getWsEditYesNo() {
		return wsEditYesNo.getValue();
	}

	/**
	 * Setter for wsEditYesNo attribute.
	 * @param wsEditYesNo the new value of wsEditYesNo
	 */
	public void setWsEditYesNo(String wsEditYesNo) {
		this.wsEditYesNo.setValue(wsEditYesNo);
	}
	/**
	 * Gets the reference for attribute flgYesNoIsvalid.
	 * @return the flgYesNoIsvalid attribute reference
	 */
	public ConditionReference getFlgYesNoIsvalidReference() {
		return wsEditYesNo.getCondition(flgYesNoIsvalid);	
	}

	/**
	 * Getter for flgYesNoIsvalid attribute.
	 * @return flgYesNoIsvalid attribute
	 */
	public boolean isFlgYesNoIsvalid() {
		return getFlgYesNoIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgYesNoIsvalid attribute.
	 * @param flgYesNoIsvalid the new value of flgYesNoIsvalid
	 */
	public void setFlgYesNoIsvalid(boolean flgYesNoIsvalid) {
		getFlgYesNoIsvalidReference().setValue(flgYesNoIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgYesNoNotOk.
	 * @return the flgYesNoNotOk attribute reference
	 */
	public ConditionReference getFlgYesNoNotOkReference() {
		return wsEditYesNo.getCondition(flgYesNoNotOk);	
	}

	/**
	 * Getter for flgYesNoNotOk attribute.
	 * @return flgYesNoNotOk attribute
	 */
	public boolean isFlgYesNoNotOk() {
		return getFlgYesNoNotOkReference().getValue();	
	}

	/**
	 * Setter for flgYesNoNotOk attribute.
	 * @param flgYesNoNotOk the new value of flgYesNoNotOk
	 */
	public void setFlgYesNoNotOk(boolean flgYesNoNotOk) {
		getFlgYesNoNotOkReference().setValue(flgYesNoNotOk);	
	}
	/**
	 * Gets the reference for attribute flgYesNoBlank.
	 * @return the flgYesNoBlank attribute reference
	 */
	public ConditionReference getFlgYesNoBlankReference() {
		return wsEditYesNo.getCondition(flgYesNoBlank);	
	}

	/**
	 * Getter for flgYesNoBlank attribute.
	 * @return flgYesNoBlank attribute
	 */
	public boolean isFlgYesNoBlank() {
		return getFlgYesNoBlankReference().getValue();	
	}

	/**
	 * Setter for flgYesNoBlank attribute.
	 * @param flgYesNoBlank the new value of flgYesNoBlank
	 */
	public void setFlgYesNoBlank(boolean flgYesNoBlank) {
		getFlgYesNoBlankReference().setValue(flgYesNoBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditUsPhoneNum.
	 * @return the wsEditUsPhoneNum attribute reference
	 */
	public ElementaryRangeReference getWsEditUsPhoneNumReference() {
		return wsEditUsPhoneNum.getReference();
	}

	/**
	 * Getter for wsEditUsPhoneNum attribute.
	 * @return wsEditUsPhoneNum attribute
	 */
	public String getWsEditUsPhoneNum() {
		return wsEditUsPhoneNum.getValue();
	}

	/**
	 * Setter for wsEditUsPhoneNum attribute.
	 * @param wsEditUsPhoneNum the new value of wsEditUsPhoneNum
	 */
	public void setWsEditUsPhoneNum(String wsEditUsPhoneNum) {
		this.wsEditUsPhoneNum.setValue(wsEditUsPhoneNum);
	}
	
	/**
	 * Gets the reference for attribute wsEditUsPhoneNumX.
	 * @return the wsEditUsPhoneNumX attribute reference
	 */
	public RangeReference getWsEditUsPhoneNumXReference() {
		return wsEditUsPhoneNumX.getReference();
	}	
				
	/**
	 * Setter for wsEditUsPhoneNumX .
	 */
   	public void setWsEditUsPhoneNumX(RangeReference reference) {
       	wsEditUsPhoneNumX.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditUsPhoneNuma.
	 * @return the wsEditUsPhoneNuma attribute reference
	 */
	public ElementaryRangeReference getWsEditUsPhoneNumaReference() {
		return wsEditUsPhoneNuma.getReference();
	}

	/**
	 * Getter for wsEditUsPhoneNuma attribute.
	 * @return wsEditUsPhoneNuma attribute
	 */
	public String getWsEditUsPhoneNuma() {
		return wsEditUsPhoneNuma.getValue();
	}

	/**
	 * Setter for wsEditUsPhoneNuma attribute.
	 * @param wsEditUsPhoneNuma the new value of wsEditUsPhoneNuma
	 */
	public void setWsEditUsPhoneNuma(String wsEditUsPhoneNuma) {
		this.wsEditUsPhoneNuma.setValue(wsEditUsPhoneNuma);
	}
	/**
	 * Gets the reference for attribute wsEditUsPhoneNumaN.
	 * @return the wsEditUsPhoneNumaN attribute reference
	 */
	public ElementaryRangeReference getWsEditUsPhoneNumaNReference() {
		return wsEditUsPhoneNumaN.getReference();
	}

	/**
	 * Getter for wsEditUsPhoneNumaN attribute.
	 * @return wsEditUsPhoneNumaN attribute
	 */
	public int getWsEditUsPhoneNumaN() {
		return wsEditUsPhoneNumaN.getValue();
	}

	/**
	 * Setter for wsEditUsPhoneNumaN attribute.
	 * @param wsEditUsPhoneNumaN the new value of wsEditUsPhoneNumaN
	 */
	public void setWsEditUsPhoneNumaN(int wsEditUsPhoneNumaN) {
		this.wsEditUsPhoneNumaN.setValue(wsEditUsPhoneNumaN);
	}
	/**
	 * Gets the reference for attribute wsEditUsPhoneNumb.
	 * @return the wsEditUsPhoneNumb attribute reference
	 */
	public ElementaryRangeReference getWsEditUsPhoneNumbReference() {
		return wsEditUsPhoneNumb.getReference();
	}

	/**
	 * Getter for wsEditUsPhoneNumb attribute.
	 * @return wsEditUsPhoneNumb attribute
	 */
	public String getWsEditUsPhoneNumb() {
		return wsEditUsPhoneNumb.getValue();
	}

	/**
	 * Setter for wsEditUsPhoneNumb attribute.
	 * @param wsEditUsPhoneNumb the new value of wsEditUsPhoneNumb
	 */
	public void setWsEditUsPhoneNumb(String wsEditUsPhoneNumb) {
		this.wsEditUsPhoneNumb.setValue(wsEditUsPhoneNumb);
	}
	/**
	 * Gets the reference for attribute wsEditUsPhoneNumbN.
	 * @return the wsEditUsPhoneNumbN attribute reference
	 */
	public ElementaryRangeReference getWsEditUsPhoneNumbNReference() {
		return wsEditUsPhoneNumbN.getReference();
	}

	/**
	 * Getter for wsEditUsPhoneNumbN attribute.
	 * @return wsEditUsPhoneNumbN attribute
	 */
	public int getWsEditUsPhoneNumbN() {
		return wsEditUsPhoneNumbN.getValue();
	}

	/**
	 * Setter for wsEditUsPhoneNumbN attribute.
	 * @param wsEditUsPhoneNumbN the new value of wsEditUsPhoneNumbN
	 */
	public void setWsEditUsPhoneNumbN(int wsEditUsPhoneNumbN) {
		this.wsEditUsPhoneNumbN.setValue(wsEditUsPhoneNumbN);
	}
	/**
	 * Gets the reference for attribute wsEditUsPhoneNumc.
	 * @return the wsEditUsPhoneNumc attribute reference
	 */
	public ElementaryRangeReference getWsEditUsPhoneNumcReference() {
		return wsEditUsPhoneNumc.getReference();
	}

	/**
	 * Getter for wsEditUsPhoneNumc attribute.
	 * @return wsEditUsPhoneNumc attribute
	 */
	public String getWsEditUsPhoneNumc() {
		return wsEditUsPhoneNumc.getValue();
	}

	/**
	 * Setter for wsEditUsPhoneNumc attribute.
	 * @param wsEditUsPhoneNumc the new value of wsEditUsPhoneNumc
	 */
	public void setWsEditUsPhoneNumc(String wsEditUsPhoneNumc) {
		this.wsEditUsPhoneNumc.setValue(wsEditUsPhoneNumc);
	}
	/**
	 * Gets the reference for attribute wsEditUsPhoneNumcN.
	 * @return the wsEditUsPhoneNumcN attribute reference
	 */
	public ElementaryRangeReference getWsEditUsPhoneNumcNReference() {
		return wsEditUsPhoneNumcN.getReference();
	}

	/**
	 * Getter for wsEditUsPhoneNumcN attribute.
	 * @return wsEditUsPhoneNumcN attribute
	 */
	public int getWsEditUsPhoneNumcN() {
		return wsEditUsPhoneNumcN.getValue();
	}

	/**
	 * Setter for wsEditUsPhoneNumcN attribute.
	 * @param wsEditUsPhoneNumcN the new value of wsEditUsPhoneNumcN
	 */
	public void setWsEditUsPhoneNumcN(int wsEditUsPhoneNumcN) {
		this.wsEditUsPhoneNumcN.setValue(wsEditUsPhoneNumcN);
	}
	
	/**
	 * Gets the reference for attribute wsEditUsPhoneNumFlgs.
	 * @return the wsEditUsPhoneNumFlgs attribute reference
	 */
	public RangeReference getWsEditUsPhoneNumFlgsReference() {
		return wsEditUsPhoneNumFlgs.getReference();
	}	
				
	/**
	 * Setter for wsEditUsPhoneNumFlgs .
	 */
   	public void setWsEditUsPhoneNumFlgs(RangeReference reference) {
       	wsEditUsPhoneNumFlgs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditUsPhoneIsInvalid.
	 * @return the wsEditUsPhoneIsInvalid attribute reference
	 */
	public ConditionReference getWsEditUsPhoneIsInvalidReference() {
		return wsEditUsPhoneNumFlgs.getCondition(wsEditUsPhoneIsInvalid);	
	}

	/**
	 * Getter for wsEditUsPhoneIsInvalid attribute.
	 * @return wsEditUsPhoneIsInvalid attribute
	 */
	public boolean isWsEditUsPhoneIsInvalid() {
		return getWsEditUsPhoneIsInvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditUsPhoneIsInvalid attribute.
	 * @param wsEditUsPhoneIsInvalid the new value of wsEditUsPhoneIsInvalid
	 */
	public void setWsEditUsPhoneIsInvalid(boolean wsEditUsPhoneIsInvalid) {
		getWsEditUsPhoneIsInvalidReference().setValue(wsEditUsPhoneIsInvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditUsPhoneIsValid.
	 * @return the wsEditUsPhoneIsValid attribute reference
	 */
	public ConditionReference getWsEditUsPhoneIsValidReference() {
		return wsEditUsPhoneNumFlgs.getCondition(wsEditUsPhoneIsValid);	
	}

	/**
	 * Getter for wsEditUsPhoneIsValid attribute.
	 * @return wsEditUsPhoneIsValid attribute
	 */
	public boolean isWsEditUsPhoneIsValid() {
		return getWsEditUsPhoneIsValidReference().getValue();	
	}

	/**
	 * Setter for wsEditUsPhoneIsValid attribute.
	 * @param wsEditUsPhoneIsValid the new value of wsEditUsPhoneIsValid
	 */
	public void setWsEditUsPhoneIsValid(boolean wsEditUsPhoneIsValid) {
		getWsEditUsPhoneIsValidReference().setValue(wsEditUsPhoneIsValid);	
	}
	/**
	 * Gets the reference for attribute wsEditUsPhoneaFlg.
	 * @return the wsEditUsPhoneaFlg attribute reference
	 */
	public ElementaryRangeReference getWsEditUsPhoneaFlgReference() {
		return wsEditUsPhoneaFlg.getReference();
	}

	/**
	 * Getter for wsEditUsPhoneaFlg attribute.
	 * @return wsEditUsPhoneaFlg attribute
	 */
	public String getWsEditUsPhoneaFlg() {
		return wsEditUsPhoneaFlg.getValue();
	}

	/**
	 * Setter for wsEditUsPhoneaFlg attribute.
	 * @param wsEditUsPhoneaFlg the new value of wsEditUsPhoneaFlg
	 */
	public void setWsEditUsPhoneaFlg(String wsEditUsPhoneaFlg) {
		this.wsEditUsPhoneaFlg.setValue(wsEditUsPhoneaFlg);
	}
	/**
	 * Gets the reference for attribute flgEditUsPhoneaIsvalid.
	 * @return the flgEditUsPhoneaIsvalid attribute reference
	 */
	public ConditionReference getFlgEditUsPhoneaIsvalidReference() {
		return wsEditUsPhoneaFlg.getCondition(flgEditUsPhoneaIsvalid);	
	}

	/**
	 * Getter for flgEditUsPhoneaIsvalid attribute.
	 * @return flgEditUsPhoneaIsvalid attribute
	 */
	public boolean isFlgEditUsPhoneaIsvalid() {
		return getFlgEditUsPhoneaIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgEditUsPhoneaIsvalid attribute.
	 * @param flgEditUsPhoneaIsvalid the new value of flgEditUsPhoneaIsvalid
	 */
	public void setFlgEditUsPhoneaIsvalid(boolean flgEditUsPhoneaIsvalid) {
		getFlgEditUsPhoneaIsvalidReference().setValue(flgEditUsPhoneaIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgEditUsPhoneaNotOk.
	 * @return the flgEditUsPhoneaNotOk attribute reference
	 */
	public ConditionReference getFlgEditUsPhoneaNotOkReference() {
		return wsEditUsPhoneaFlg.getCondition(flgEditUsPhoneaNotOk);	
	}

	/**
	 * Getter for flgEditUsPhoneaNotOk attribute.
	 * @return flgEditUsPhoneaNotOk attribute
	 */
	public boolean isFlgEditUsPhoneaNotOk() {
		return getFlgEditUsPhoneaNotOkReference().getValue();	
	}

	/**
	 * Setter for flgEditUsPhoneaNotOk attribute.
	 * @param flgEditUsPhoneaNotOk the new value of flgEditUsPhoneaNotOk
	 */
	public void setFlgEditUsPhoneaNotOk(boolean flgEditUsPhoneaNotOk) {
		getFlgEditUsPhoneaNotOkReference().setValue(flgEditUsPhoneaNotOk);	
	}
	/**
	 * Gets the reference for attribute flgEditUsPhoneaBlank.
	 * @return the flgEditUsPhoneaBlank attribute reference
	 */
	public ConditionReference getFlgEditUsPhoneaBlankReference() {
		return wsEditUsPhoneaFlg.getCondition(flgEditUsPhoneaBlank);	
	}

	/**
	 * Getter for flgEditUsPhoneaBlank attribute.
	 * @return flgEditUsPhoneaBlank attribute
	 */
	public boolean isFlgEditUsPhoneaBlank() {
		return getFlgEditUsPhoneaBlankReference().getValue();	
	}

	/**
	 * Setter for flgEditUsPhoneaBlank attribute.
	 * @param flgEditUsPhoneaBlank the new value of flgEditUsPhoneaBlank
	 */
	public void setFlgEditUsPhoneaBlank(boolean flgEditUsPhoneaBlank) {
		getFlgEditUsPhoneaBlankReference().setValue(flgEditUsPhoneaBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditEditUsPhoneb.
	 * @return the wsEditEditUsPhoneb attribute reference
	 */
	public ElementaryRangeReference getWsEditEditUsPhonebReference() {
		return wsEditEditUsPhoneb.getReference();
	}

	/**
	 * Getter for wsEditEditUsPhoneb attribute.
	 * @return wsEditEditUsPhoneb attribute
	 */
	public String getWsEditEditUsPhoneb() {
		return wsEditEditUsPhoneb.getValue();
	}

	/**
	 * Setter for wsEditEditUsPhoneb attribute.
	 * @param wsEditEditUsPhoneb the new value of wsEditEditUsPhoneb
	 */
	public void setWsEditEditUsPhoneb(String wsEditEditUsPhoneb) {
		this.wsEditEditUsPhoneb.setValue(wsEditEditUsPhoneb);
	}
	/**
	 * Gets the reference for attribute flgEditUsPhonebIsvalid.
	 * @return the flgEditUsPhonebIsvalid attribute reference
	 */
	public ConditionReference getFlgEditUsPhonebIsvalidReference() {
		return wsEditEditUsPhoneb.getCondition(flgEditUsPhonebIsvalid);	
	}

	/**
	 * Getter for flgEditUsPhonebIsvalid attribute.
	 * @return flgEditUsPhonebIsvalid attribute
	 */
	public boolean isFlgEditUsPhonebIsvalid() {
		return getFlgEditUsPhonebIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgEditUsPhonebIsvalid attribute.
	 * @param flgEditUsPhonebIsvalid the new value of flgEditUsPhonebIsvalid
	 */
	public void setFlgEditUsPhonebIsvalid(boolean flgEditUsPhonebIsvalid) {
		getFlgEditUsPhonebIsvalidReference().setValue(flgEditUsPhonebIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgEditUsPhonebNotOk.
	 * @return the flgEditUsPhonebNotOk attribute reference
	 */
	public ConditionReference getFlgEditUsPhonebNotOkReference() {
		return wsEditEditUsPhoneb.getCondition(flgEditUsPhonebNotOk);	
	}

	/**
	 * Getter for flgEditUsPhonebNotOk attribute.
	 * @return flgEditUsPhonebNotOk attribute
	 */
	public boolean isFlgEditUsPhonebNotOk() {
		return getFlgEditUsPhonebNotOkReference().getValue();	
	}

	/**
	 * Setter for flgEditUsPhonebNotOk attribute.
	 * @param flgEditUsPhonebNotOk the new value of flgEditUsPhonebNotOk
	 */
	public void setFlgEditUsPhonebNotOk(boolean flgEditUsPhonebNotOk) {
		getFlgEditUsPhonebNotOkReference().setValue(flgEditUsPhonebNotOk);	
	}
	/**
	 * Gets the reference for attribute flgEditUsPhonebBlank.
	 * @return the flgEditUsPhonebBlank attribute reference
	 */
	public ConditionReference getFlgEditUsPhonebBlankReference() {
		return wsEditEditUsPhoneb.getCondition(flgEditUsPhonebBlank);	
	}

	/**
	 * Getter for flgEditUsPhonebBlank attribute.
	 * @return flgEditUsPhonebBlank attribute
	 */
	public boolean isFlgEditUsPhonebBlank() {
		return getFlgEditUsPhonebBlankReference().getValue();	
	}

	/**
	 * Setter for flgEditUsPhonebBlank attribute.
	 * @param flgEditUsPhonebBlank the new value of flgEditUsPhonebBlank
	 */
	public void setFlgEditUsPhonebBlank(boolean flgEditUsPhonebBlank) {
		getFlgEditUsPhonebBlankReference().setValue(flgEditUsPhonebBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditEditPhonec.
	 * @return the wsEditEditPhonec attribute reference
	 */
	public ElementaryRangeReference getWsEditEditPhonecReference() {
		return wsEditEditPhonec.getReference();
	}

	/**
	 * Getter for wsEditEditPhonec attribute.
	 * @return wsEditEditPhonec attribute
	 */
	public String getWsEditEditPhonec() {
		return wsEditEditPhonec.getValue();
	}

	/**
	 * Setter for wsEditEditPhonec attribute.
	 * @param wsEditEditPhonec the new value of wsEditEditPhonec
	 */
	public void setWsEditEditPhonec(String wsEditEditPhonec) {
		this.wsEditEditPhonec.setValue(wsEditEditPhonec);
	}
	/**
	 * Gets the reference for attribute flgEditUsPhonecIsvalid.
	 * @return the flgEditUsPhonecIsvalid attribute reference
	 */
	public ConditionReference getFlgEditUsPhonecIsvalidReference() {
		return wsEditEditPhonec.getCondition(flgEditUsPhonecIsvalid);	
	}

	/**
	 * Getter for flgEditUsPhonecIsvalid attribute.
	 * @return flgEditUsPhonecIsvalid attribute
	 */
	public boolean isFlgEditUsPhonecIsvalid() {
		return getFlgEditUsPhonecIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgEditUsPhonecIsvalid attribute.
	 * @param flgEditUsPhonecIsvalid the new value of flgEditUsPhonecIsvalid
	 */
	public void setFlgEditUsPhonecIsvalid(boolean flgEditUsPhonecIsvalid) {
		getFlgEditUsPhonecIsvalidReference().setValue(flgEditUsPhonecIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgEditUsPhonecNotOk.
	 * @return the flgEditUsPhonecNotOk attribute reference
	 */
	public ConditionReference getFlgEditUsPhonecNotOkReference() {
		return wsEditEditPhonec.getCondition(flgEditUsPhonecNotOk);	
	}

	/**
	 * Getter for flgEditUsPhonecNotOk attribute.
	 * @return flgEditUsPhonecNotOk attribute
	 */
	public boolean isFlgEditUsPhonecNotOk() {
		return getFlgEditUsPhonecNotOkReference().getValue();	
	}

	/**
	 * Setter for flgEditUsPhonecNotOk attribute.
	 * @param flgEditUsPhonecNotOk the new value of flgEditUsPhonecNotOk
	 */
	public void setFlgEditUsPhonecNotOk(boolean flgEditUsPhonecNotOk) {
		getFlgEditUsPhonecNotOkReference().setValue(flgEditUsPhonecNotOk);	
	}
	/**
	 * Gets the reference for attribute flgEditUsPhonecBlank.
	 * @return the flgEditUsPhonecBlank attribute reference
	 */
	public ConditionReference getFlgEditUsPhonecBlankReference() {
		return wsEditEditPhonec.getCondition(flgEditUsPhonecBlank);	
	}

	/**
	 * Getter for flgEditUsPhonecBlank attribute.
	 * @return flgEditUsPhonecBlank attribute
	 */
	public boolean isFlgEditUsPhonecBlank() {
		return getFlgEditUsPhonecBlankReference().getValue();	
	}

	/**
	 * Setter for flgEditUsPhonecBlank attribute.
	 * @param flgEditUsPhonecBlank the new value of flgEditUsPhonecBlank
	 */
	public void setFlgEditUsPhonecBlank(boolean flgEditUsPhonecBlank) {
		getFlgEditUsPhonecBlankReference().setValue(flgEditUsPhonecBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsEditUsSsn.
	 * @return the wsEditUsSsn attribute reference
	 */
	public RangeReference getWsEditUsSsnReference() {
		return wsEditUsSsn.getReference();
	}	
				
	/**
	 * Setter for wsEditUsSsn .
	 */
   	public void setWsEditUsSsn(RangeReference reference) {
       	wsEditUsSsn.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditUsSsnPart1.
	 * @return the wsEditUsSsnPart1 attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnPart1Reference() {
		return wsEditUsSsnPart1.getReference();
	}

	/**
	 * Getter for wsEditUsSsnPart1 attribute.
	 * @return wsEditUsSsnPart1 attribute
	 */
	public String getWsEditUsSsnPart1() {
		return wsEditUsSsnPart1.getValue();
	}

	/**
	 * Setter for wsEditUsSsnPart1 attribute.
	 * @param wsEditUsSsnPart1 the new value of wsEditUsSsnPart1
	 */
	public void setWsEditUsSsnPart1(String wsEditUsSsnPart1) {
		this.wsEditUsSsnPart1.setValue(wsEditUsSsnPart1);
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnPart1N.
	 * @return the wsEditUsSsnPart1N attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnPart1NReference() {
		return wsEditUsSsnPart1N.getReference();
	}

	/**
	 * Getter for wsEditUsSsnPart1N attribute.
	 * @return wsEditUsSsnPart1N attribute
	 */
	public int getWsEditUsSsnPart1N() {
		return wsEditUsSsnPart1N.getValue();
	}

	/**
	 * Setter for wsEditUsSsnPart1N attribute.
	 * @param wsEditUsSsnPart1N the new value of wsEditUsSsnPart1N
	 */
	public void setWsEditUsSsnPart1N(int wsEditUsSsnPart1N) {
		this.wsEditUsSsnPart1N.setValue(wsEditUsSsnPart1N);
	}
	/**
	 * Gets the reference for attribute invalidSsnPart1.
	 * @return the invalidSsnPart1 attribute reference
	 */
	public ConditionReference getInvalidSsnPart1Reference() {
		return wsEditUsSsnPart1N.getCondition(invalidSsnPart1);	
	}

	/**
	 * Getter for invalidSsnPart1 attribute.
	 * @return invalidSsnPart1 attribute
	 */
	public boolean isInvalidSsnPart1() {
		return getInvalidSsnPart1Reference().getValue();	
	}

	/**
	 * Setter for invalidSsnPart1 attribute.
	 * @param invalidSsnPart1 the new value of invalidSsnPart1
	 */
	public void setInvalidSsnPart1(boolean invalidSsnPart1) {
		getInvalidSsnPart1Reference().setValue(invalidSsnPart1);	
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnPart2.
	 * @return the wsEditUsSsnPart2 attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnPart2Reference() {
		return wsEditUsSsnPart2.getReference();
	}

	/**
	 * Getter for wsEditUsSsnPart2 attribute.
	 * @return wsEditUsSsnPart2 attribute
	 */
	public String getWsEditUsSsnPart2() {
		return wsEditUsSsnPart2.getValue();
	}

	/**
	 * Setter for wsEditUsSsnPart2 attribute.
	 * @param wsEditUsSsnPart2 the new value of wsEditUsSsnPart2
	 */
	public void setWsEditUsSsnPart2(String wsEditUsSsnPart2) {
		this.wsEditUsSsnPart2.setValue(wsEditUsSsnPart2);
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnPart2N.
	 * @return the wsEditUsSsnPart2N attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnPart2NReference() {
		return wsEditUsSsnPart2N.getReference();
	}

	/**
	 * Getter for wsEditUsSsnPart2N attribute.
	 * @return wsEditUsSsnPart2N attribute
	 */
	public int getWsEditUsSsnPart2N() {
		return wsEditUsSsnPart2N.getValue();
	}

	/**
	 * Setter for wsEditUsSsnPart2N attribute.
	 * @param wsEditUsSsnPart2N the new value of wsEditUsSsnPart2N
	 */
	public void setWsEditUsSsnPart2N(int wsEditUsSsnPart2N) {
		this.wsEditUsSsnPart2N.setValue(wsEditUsSsnPart2N);
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnPart3.
	 * @return the wsEditUsSsnPart3 attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnPart3Reference() {
		return wsEditUsSsnPart3.getReference();
	}

	/**
	 * Getter for wsEditUsSsnPart3 attribute.
	 * @return wsEditUsSsnPart3 attribute
	 */
	public String getWsEditUsSsnPart3() {
		return wsEditUsSsnPart3.getValue();
	}

	/**
	 * Setter for wsEditUsSsnPart3 attribute.
	 * @param wsEditUsSsnPart3 the new value of wsEditUsSsnPart3
	 */
	public void setWsEditUsSsnPart3(String wsEditUsSsnPart3) {
		this.wsEditUsSsnPart3.setValue(wsEditUsSsnPart3);
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnPart3N.
	 * @return the wsEditUsSsnPart3N attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnPart3NReference() {
		return wsEditUsSsnPart3N.getReference();
	}

	/**
	 * Getter for wsEditUsSsnPart3N attribute.
	 * @return wsEditUsSsnPart3N attribute
	 */
	public int getWsEditUsSsnPart3N() {
		return wsEditUsSsnPart3N.getValue();
	}

	/**
	 * Setter for wsEditUsSsnPart3N attribute.
	 * @param wsEditUsSsnPart3N the new value of wsEditUsSsnPart3N
	 */
	public void setWsEditUsSsnPart3N(int wsEditUsSsnPart3N) {
		this.wsEditUsSsnPart3N.setValue(wsEditUsSsnPart3N);
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnN.
	 * @return the wsEditUsSsnN attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnNReference() {
		return wsEditUsSsnN.getReference();
	}

	/**
	 * Getter for wsEditUsSsnN attribute.
	 * @return wsEditUsSsnN attribute
	 */
	public int getWsEditUsSsnN() {
		return wsEditUsSsnN.getValue();
	}

	/**
	 * Setter for wsEditUsSsnN attribute.
	 * @param wsEditUsSsnN the new value of wsEditUsSsnN
	 */
	public void setWsEditUsSsnN(int wsEditUsSsnN) {
		this.wsEditUsSsnN.setValue(wsEditUsSsnN);
	}
	
	/**
	 * Gets the reference for attribute wsEditUsSsnFlgs.
	 * @return the wsEditUsSsnFlgs attribute reference
	 */
	public RangeReference getWsEditUsSsnFlgsReference() {
		return wsEditUsSsnFlgs.getReference();
	}	
				
	/**
	 * Setter for wsEditUsSsnFlgs .
	 */
   	public void setWsEditUsSsnFlgs(RangeReference reference) {
       	wsEditUsSsnFlgs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditUsSsnIsInvalid.
	 * @return the wsEditUsSsnIsInvalid attribute reference
	 */
	public ConditionReference getWsEditUsSsnIsInvalidReference() {
		return wsEditUsSsnFlgs.getCondition(wsEditUsSsnIsInvalid);	
	}

	/**
	 * Getter for wsEditUsSsnIsInvalid attribute.
	 * @return wsEditUsSsnIsInvalid attribute
	 */
	public boolean isWsEditUsSsnIsInvalid() {
		return getWsEditUsSsnIsInvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditUsSsnIsInvalid attribute.
	 * @param wsEditUsSsnIsInvalid the new value of wsEditUsSsnIsInvalid
	 */
	public void setWsEditUsSsnIsInvalid(boolean wsEditUsSsnIsInvalid) {
		getWsEditUsSsnIsInvalidReference().setValue(wsEditUsSsnIsInvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnIsValid.
	 * @return the wsEditUsSsnIsValid attribute reference
	 */
	public ConditionReference getWsEditUsSsnIsValidReference() {
		return wsEditUsSsnFlgs.getCondition(wsEditUsSsnIsValid);	
	}

	/**
	 * Getter for wsEditUsSsnIsValid attribute.
	 * @return wsEditUsSsnIsValid attribute
	 */
	public boolean isWsEditUsSsnIsValid() {
		return getWsEditUsSsnIsValidReference().getValue();	
	}

	/**
	 * Setter for wsEditUsSsnIsValid attribute.
	 * @param wsEditUsSsnIsValid the new value of wsEditUsSsnIsValid
	 */
	public void setWsEditUsSsnIsValid(boolean wsEditUsSsnIsValid) {
		getWsEditUsSsnIsValidReference().setValue(wsEditUsSsnIsValid);	
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnPart1Flgs.
	 * @return the wsEditUsSsnPart1Flgs attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnPart1FlgsReference() {
		return wsEditUsSsnPart1Flgs.getReference();
	}

	/**
	 * Getter for wsEditUsSsnPart1Flgs attribute.
	 * @return wsEditUsSsnPart1Flgs attribute
	 */
	public String getWsEditUsSsnPart1Flgs() {
		return wsEditUsSsnPart1Flgs.getValue();
	}

	/**
	 * Setter for wsEditUsSsnPart1Flgs attribute.
	 * @param wsEditUsSsnPart1Flgs the new value of wsEditUsSsnPart1Flgs
	 */
	public void setWsEditUsSsnPart1Flgs(String wsEditUsSsnPart1Flgs) {
		this.wsEditUsSsnPart1Flgs.setValue(wsEditUsSsnPart1Flgs);
	}
	/**
	 * Gets the reference for attribute flgEditUsSsnPart1Isvalid.
	 * @return the flgEditUsSsnPart1Isvalid attribute reference
	 */
	public ConditionReference getFlgEditUsSsnPart1IsvalidReference() {
		return wsEditUsSsnPart1Flgs.getCondition(flgEditUsSsnPart1Isvalid);	
	}

	/**
	 * Getter for flgEditUsSsnPart1Isvalid attribute.
	 * @return flgEditUsSsnPart1Isvalid attribute
	 */
	public boolean isFlgEditUsSsnPart1Isvalid() {
		return getFlgEditUsSsnPart1IsvalidReference().getValue();	
	}

	/**
	 * Setter for flgEditUsSsnPart1Isvalid attribute.
	 * @param flgEditUsSsnPart1Isvalid the new value of flgEditUsSsnPart1Isvalid
	 */
	public void setFlgEditUsSsnPart1Isvalid(boolean flgEditUsSsnPart1Isvalid) {
		getFlgEditUsSsnPart1IsvalidReference().setValue(flgEditUsSsnPart1Isvalid);	
	}
	/**
	 * Gets the reference for attribute flgEditUsSsnPart1NotOk.
	 * @return the flgEditUsSsnPart1NotOk attribute reference
	 */
	public ConditionReference getFlgEditUsSsnPart1NotOkReference() {
		return wsEditUsSsnPart1Flgs.getCondition(flgEditUsSsnPart1NotOk);	
	}

	/**
	 * Getter for flgEditUsSsnPart1NotOk attribute.
	 * @return flgEditUsSsnPart1NotOk attribute
	 */
	public boolean isFlgEditUsSsnPart1NotOk() {
		return getFlgEditUsSsnPart1NotOkReference().getValue();	
	}

	/**
	 * Setter for flgEditUsSsnPart1NotOk attribute.
	 * @param flgEditUsSsnPart1NotOk the new value of flgEditUsSsnPart1NotOk
	 */
	public void setFlgEditUsSsnPart1NotOk(boolean flgEditUsSsnPart1NotOk) {
		getFlgEditUsSsnPart1NotOkReference().setValue(flgEditUsSsnPart1NotOk);	
	}
	/**
	 * Gets the reference for attribute flgEditUsSsnPart1Blank.
	 * @return the flgEditUsSsnPart1Blank attribute reference
	 */
	public ConditionReference getFlgEditUsSsnPart1BlankReference() {
		return wsEditUsSsnPart1Flgs.getCondition(flgEditUsSsnPart1Blank);	
	}

	/**
	 * Getter for flgEditUsSsnPart1Blank attribute.
	 * @return flgEditUsSsnPart1Blank attribute
	 */
	public boolean isFlgEditUsSsnPart1Blank() {
		return getFlgEditUsSsnPart1BlankReference().getValue();	
	}

	/**
	 * Setter for flgEditUsSsnPart1Blank attribute.
	 * @param flgEditUsSsnPart1Blank the new value of flgEditUsSsnPart1Blank
	 */
	public void setFlgEditUsSsnPart1Blank(boolean flgEditUsSsnPart1Blank) {
		getFlgEditUsSsnPart1BlankReference().setValue(flgEditUsSsnPart1Blank);	
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnPart2Flgs.
	 * @return the wsEditUsSsnPart2Flgs attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnPart2FlgsReference() {
		return wsEditUsSsnPart2Flgs.getReference();
	}

	/**
	 * Getter for wsEditUsSsnPart2Flgs attribute.
	 * @return wsEditUsSsnPart2Flgs attribute
	 */
	public String getWsEditUsSsnPart2Flgs() {
		return wsEditUsSsnPart2Flgs.getValue();
	}

	/**
	 * Setter for wsEditUsSsnPart2Flgs attribute.
	 * @param wsEditUsSsnPart2Flgs the new value of wsEditUsSsnPart2Flgs
	 */
	public void setWsEditUsSsnPart2Flgs(String wsEditUsSsnPart2Flgs) {
		this.wsEditUsSsnPart2Flgs.setValue(wsEditUsSsnPart2Flgs);
	}
	/**
	 * Gets the reference for attribute flgEditUsSsnPart2Isvalid.
	 * @return the flgEditUsSsnPart2Isvalid attribute reference
	 */
	public ConditionReference getFlgEditUsSsnPart2IsvalidReference() {
		return wsEditUsSsnPart2Flgs.getCondition(flgEditUsSsnPart2Isvalid);	
	}

	/**
	 * Getter for flgEditUsSsnPart2Isvalid attribute.
	 * @return flgEditUsSsnPart2Isvalid attribute
	 */
	public boolean isFlgEditUsSsnPart2Isvalid() {
		return getFlgEditUsSsnPart2IsvalidReference().getValue();	
	}

	/**
	 * Setter for flgEditUsSsnPart2Isvalid attribute.
	 * @param flgEditUsSsnPart2Isvalid the new value of flgEditUsSsnPart2Isvalid
	 */
	public void setFlgEditUsSsnPart2Isvalid(boolean flgEditUsSsnPart2Isvalid) {
		getFlgEditUsSsnPart2IsvalidReference().setValue(flgEditUsSsnPart2Isvalid);	
	}
	/**
	 * Gets the reference for attribute flgEditUsSsnPart2NotOk.
	 * @return the flgEditUsSsnPart2NotOk attribute reference
	 */
	public ConditionReference getFlgEditUsSsnPart2NotOkReference() {
		return wsEditUsSsnPart2Flgs.getCondition(flgEditUsSsnPart2NotOk);	
	}

	/**
	 * Getter for flgEditUsSsnPart2NotOk attribute.
	 * @return flgEditUsSsnPart2NotOk attribute
	 */
	public boolean isFlgEditUsSsnPart2NotOk() {
		return getFlgEditUsSsnPart2NotOkReference().getValue();	
	}

	/**
	 * Setter for flgEditUsSsnPart2NotOk attribute.
	 * @param flgEditUsSsnPart2NotOk the new value of flgEditUsSsnPart2NotOk
	 */
	public void setFlgEditUsSsnPart2NotOk(boolean flgEditUsSsnPart2NotOk) {
		getFlgEditUsSsnPart2NotOkReference().setValue(flgEditUsSsnPart2NotOk);	
	}
	/**
	 * Gets the reference for attribute flgEditUsSsnPart2Blank.
	 * @return the flgEditUsSsnPart2Blank attribute reference
	 */
	public ConditionReference getFlgEditUsSsnPart2BlankReference() {
		return wsEditUsSsnPart2Flgs.getCondition(flgEditUsSsnPart2Blank);	
	}

	/**
	 * Getter for flgEditUsSsnPart2Blank attribute.
	 * @return flgEditUsSsnPart2Blank attribute
	 */
	public boolean isFlgEditUsSsnPart2Blank() {
		return getFlgEditUsSsnPart2BlankReference().getValue();	
	}

	/**
	 * Setter for flgEditUsSsnPart2Blank attribute.
	 * @param flgEditUsSsnPart2Blank the new value of flgEditUsSsnPart2Blank
	 */
	public void setFlgEditUsSsnPart2Blank(boolean flgEditUsSsnPart2Blank) {
		getFlgEditUsSsnPart2BlankReference().setValue(flgEditUsSsnPart2Blank);	
	}
	/**
	 * Gets the reference for attribute wsEditUsSsnPart3Flgs.
	 * @return the wsEditUsSsnPart3Flgs attribute reference
	 */
	public ElementaryRangeReference getWsEditUsSsnPart3FlgsReference() {
		return wsEditUsSsnPart3Flgs.getReference();
	}

	/**
	 * Getter for wsEditUsSsnPart3Flgs attribute.
	 * @return wsEditUsSsnPart3Flgs attribute
	 */
	public String getWsEditUsSsnPart3Flgs() {
		return wsEditUsSsnPart3Flgs.getValue();
	}

	/**
	 * Setter for wsEditUsSsnPart3Flgs attribute.
	 * @param wsEditUsSsnPart3Flgs the new value of wsEditUsSsnPart3Flgs
	 */
	public void setWsEditUsSsnPart3Flgs(String wsEditUsSsnPart3Flgs) {
		this.wsEditUsSsnPart3Flgs.setValue(wsEditUsSsnPart3Flgs);
	}
	/**
	 * Gets the reference for attribute flgEditUsSsnPart3Isvalid.
	 * @return the flgEditUsSsnPart3Isvalid attribute reference
	 */
	public ConditionReference getFlgEditUsSsnPart3IsvalidReference() {
		return wsEditUsSsnPart3Flgs.getCondition(flgEditUsSsnPart3Isvalid);	
	}

	/**
	 * Getter for flgEditUsSsnPart3Isvalid attribute.
	 * @return flgEditUsSsnPart3Isvalid attribute
	 */
	public boolean isFlgEditUsSsnPart3Isvalid() {
		return getFlgEditUsSsnPart3IsvalidReference().getValue();	
	}

	/**
	 * Setter for flgEditUsSsnPart3Isvalid attribute.
	 * @param flgEditUsSsnPart3Isvalid the new value of flgEditUsSsnPart3Isvalid
	 */
	public void setFlgEditUsSsnPart3Isvalid(boolean flgEditUsSsnPart3Isvalid) {
		getFlgEditUsSsnPart3IsvalidReference().setValue(flgEditUsSsnPart3Isvalid);	
	}
	/**
	 * Gets the reference for attribute flgEditUsSsnPart3NotOk.
	 * @return the flgEditUsSsnPart3NotOk attribute reference
	 */
	public ConditionReference getFlgEditUsSsnPart3NotOkReference() {
		return wsEditUsSsnPart3Flgs.getCondition(flgEditUsSsnPart3NotOk);	
	}

	/**
	 * Getter for flgEditUsSsnPart3NotOk attribute.
	 * @return flgEditUsSsnPart3NotOk attribute
	 */
	public boolean isFlgEditUsSsnPart3NotOk() {
		return getFlgEditUsSsnPart3NotOkReference().getValue();	
	}

	/**
	 * Setter for flgEditUsSsnPart3NotOk attribute.
	 * @param flgEditUsSsnPart3NotOk the new value of flgEditUsSsnPart3NotOk
	 */
	public void setFlgEditUsSsnPart3NotOk(boolean flgEditUsSsnPart3NotOk) {
		getFlgEditUsSsnPart3NotOkReference().setValue(flgEditUsSsnPart3NotOk);	
	}
	/**
	 * Gets the reference for attribute flgEditUsSsnPart3Blank.
	 * @return the flgEditUsSsnPart3Blank attribute reference
	 */
	public ConditionReference getFlgEditUsSsnPart3BlankReference() {
		return wsEditUsSsnPart3Flgs.getCondition(flgEditUsSsnPart3Blank);	
	}

	/**
	 * Getter for flgEditUsSsnPart3Blank attribute.
	 * @return flgEditUsSsnPart3Blank attribute
	 */
	public boolean isFlgEditUsSsnPart3Blank() {
		return getFlgEditUsSsnPart3BlankReference().getValue();	
	}

	/**
	 * Setter for flgEditUsSsnPart3Blank attribute.
	 * @param flgEditUsSsnPart3Blank the new value of flgEditUsSsnPart3Blank
	 */
	public void setFlgEditUsSsnPart3Blank(boolean flgEditUsSsnPart3Blank) {
		getFlgEditUsSsnPart3BlankReference().setValue(flgEditUsSsnPart3Blank);	
	}
	
	/**
	 * Gets the reference for attribute wsCalculationVars.
	 * @return the wsCalculationVars attribute reference
	 */
	public RangeReference getWsCalculationVarsReference() {
		return wsCalculationVars.getReference();
	}	
				
	/**
	 * Setter for wsCalculationVars .
	 */
   	public void setWsCalculationVars(RangeReference reference) {
       	wsCalculationVars.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsDivBy.
	 * @return the wsDivBy attribute reference
	 */
	public ElementaryRangeReference getWsDivByReference() {
		return wsDivBy.getReference();
	}

	/**
	 * Getter for wsDivBy attribute.
	 * @return wsDivBy attribute
	 */
	public int getWsDivBy() {
		return wsDivBy.getValue();
	}

	/**
	 * Setter for wsDivBy attribute.
	 * @param wsDivBy the new value of wsDivBy
	 */
	public void setWsDivBy(int wsDivBy) {
		this.wsDivBy.setValue(wsDivBy);
	}
	/**
	 * Gets the reference for attribute wsDividend.
	 * @return the wsDividend attribute reference
	 */
	public ElementaryRangeReference getWsDividendReference() {
		return wsDividend.getReference();
	}

	/**
	 * Getter for wsDividend attribute.
	 * @return wsDividend attribute
	 */
	public int getWsDividend() {
		return wsDividend.getValue();
	}

	/**
	 * Setter for wsDividend attribute.
	 * @param wsDividend the new value of wsDividend
	 */
	public void setWsDividend(int wsDividend) {
		this.wsDividend.setValue(wsDividend);
	}
	/**
	 * Gets the reference for attribute wsRemainder.
	 * @return the wsRemainder attribute reference
	 */
	public ElementaryRangeReference getWsRemainderReference() {
		return wsRemainder.getReference();
	}

	/**
	 * Getter for wsRemainder attribute.
	 * @return wsRemainder attribute
	 */
	public int getWsRemainder() {
		return wsRemainder.getValue();
	}

	/**
	 * Setter for wsRemainder attribute.
	 * @param wsRemainder the new value of wsRemainder
	 */
	public void setWsRemainder(int wsRemainder) {
		this.wsRemainder.setValue(wsRemainder);
	}
	/**
	 * Gets the reference for attribute wsCurrDate.
	 * @return the wsCurrDate attribute reference
	 */
	public ElementaryRangeReference getWsCurrDateReference() {
		return wsCurrDate.getReference();
	}

	/**
	 * Getter for wsCurrDate attribute.
	 * @return wsCurrDate attribute
	 */
	public String getWsCurrDate() {
		return wsCurrDate.getValue();
	}

	/**
	 * Setter for wsCurrDate attribute.
	 * @param wsCurrDate the new value of wsCurrDate
	 */
	public void setWsCurrDate(String wsCurrDate) {
		this.wsCurrDate.setValue(wsCurrDate);
	}
	
	/**
	 * Gets the reference for attribute wsEditDateCcyymmdd.
	 * @return the wsEditDateCcyymmdd attribute reference
	 */
	public RangeReference getWsEditDateCcyymmddReference() {
		return wsEditDateCcyymmdd.getReference();
	}	
				
	/**
	 * Setter for wsEditDateCcyymmdd .
	 */
   	public void setWsEditDateCcyymmdd(RangeReference reference) {
       	wsEditDateCcyymmdd.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute wsEditDateCcyy.
	 * @return the wsEditDateCcyy attribute reference
	 */
	public RangeReference getWsEditDateCcyyReference() {
		return wsEditDateCcyy.getReference();
	}	
				
	/**
	 * Setter for wsEditDateCcyy .
	 */
   	public void setWsEditDateCcyy(RangeReference reference) {
       	wsEditDateCcyy.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditDateCc.
	 * @return the wsEditDateCc attribute reference
	 */
	public ElementaryRangeReference getWsEditDateCcReference() {
		return wsEditDateCc.getReference();
	}

	/**
	 * Getter for wsEditDateCc attribute.
	 * @return wsEditDateCc attribute
	 */
	public String getWsEditDateCc() {
		return wsEditDateCc.getValue();
	}

	/**
	 * Setter for wsEditDateCc attribute.
	 * @param wsEditDateCc the new value of wsEditDateCc
	 */
	public void setWsEditDateCc(String wsEditDateCc) {
		this.wsEditDateCc.setValue(wsEditDateCc);
	}
	/**
	 * Gets the reference for attribute wsEditDateCcN.
	 * @return the wsEditDateCcN attribute reference
	 */
	public ElementaryRangeReference getWsEditDateCcNReference() {
		return wsEditDateCcN.getReference();
	}

	/**
	 * Getter for wsEditDateCcN attribute.
	 * @return wsEditDateCcN attribute
	 */
	public int getWsEditDateCcN() {
		return wsEditDateCcN.getValue();
	}

	/**
	 * Setter for wsEditDateCcN attribute.
	 * @param wsEditDateCcN the new value of wsEditDateCcN
	 */
	public void setWsEditDateCcN(int wsEditDateCcN) {
		this.wsEditDateCcN.setValue(wsEditDateCcN);
	}
	/**
	 * Gets the reference for attribute thisCentury.
	 * @return the thisCentury attribute reference
	 */
	public ConditionReference getThisCenturyReference() {
		return wsEditDateCcN.getCondition(thisCentury);	
	}

	/**
	 * Getter for thisCentury attribute.
	 * @return thisCentury attribute
	 */
	public boolean isThisCentury() {
		return getThisCenturyReference().getValue();	
	}

	/**
	 * Setter for thisCentury attribute.
	 * @param thisCentury the new value of thisCentury
	 */
	public void setThisCentury(boolean thisCentury) {
		getThisCenturyReference().setValue(thisCentury);	
	}
	/**
	 * Gets the reference for attribute lastCentury.
	 * @return the lastCentury attribute reference
	 */
	public ConditionReference getLastCenturyReference() {
		return wsEditDateCcN.getCondition(lastCentury);	
	}

	/**
	 * Getter for lastCentury attribute.
	 * @return lastCentury attribute
	 */
	public boolean isLastCentury() {
		return getLastCenturyReference().getValue();	
	}

	/**
	 * Setter for lastCentury attribute.
	 * @param lastCentury the new value of lastCentury
	 */
	public void setLastCentury(boolean lastCentury) {
		getLastCenturyReference().setValue(lastCentury);	
	}
	/**
	 * Gets the reference for attribute wsEditDateYy.
	 * @return the wsEditDateYy attribute reference
	 */
	public ElementaryRangeReference getWsEditDateYyReference() {
		return wsEditDateYy.getReference();
	}

	/**
	 * Getter for wsEditDateYy attribute.
	 * @return wsEditDateYy attribute
	 */
	public String getWsEditDateYy() {
		return wsEditDateYy.getValue();
	}

	/**
	 * Setter for wsEditDateYy attribute.
	 * @param wsEditDateYy the new value of wsEditDateYy
	 */
	public void setWsEditDateYy(String wsEditDateYy) {
		this.wsEditDateYy.setValue(wsEditDateYy);
	}
	/**
	 * Gets the reference for attribute wsEditDateYyN.
	 * @return the wsEditDateYyN attribute reference
	 */
	public ElementaryRangeReference getWsEditDateYyNReference() {
		return wsEditDateYyN.getReference();
	}

	/**
	 * Getter for wsEditDateYyN attribute.
	 * @return wsEditDateYyN attribute
	 */
	public int getWsEditDateYyN() {
		return wsEditDateYyN.getValue();
	}

	/**
	 * Setter for wsEditDateYyN attribute.
	 * @param wsEditDateYyN the new value of wsEditDateYyN
	 */
	public void setWsEditDateYyN(int wsEditDateYyN) {
		this.wsEditDateYyN.setValue(wsEditDateYyN);
	}
	/**
	 * Gets the reference for attribute wsEditDateCcyyN.
	 * @return the wsEditDateCcyyN attribute reference
	 */
	public ElementaryRangeReference getWsEditDateCcyyNReference() {
		return wsEditDateCcyyN.getReference();
	}

	/**
	 * Getter for wsEditDateCcyyN attribute.
	 * @return wsEditDateCcyyN attribute
	 */
	public int getWsEditDateCcyyN() {
		return wsEditDateCcyyN.getValue();
	}

	/**
	 * Setter for wsEditDateCcyyN attribute.
	 * @param wsEditDateCcyyN the new value of wsEditDateCcyyN
	 */
	public void setWsEditDateCcyyN(int wsEditDateCcyyN) {
		this.wsEditDateCcyyN.setValue(wsEditDateCcyyN);
	}
	/**
	 * Gets the reference for attribute wsEditDateMm.
	 * @return the wsEditDateMm attribute reference
	 */
	public ElementaryRangeReference getWsEditDateMmReference() {
		return wsEditDateMm.getReference();
	}

	/**
	 * Getter for wsEditDateMm attribute.
	 * @return wsEditDateMm attribute
	 */
	public String getWsEditDateMm() {
		return wsEditDateMm.getValue();
	}

	/**
	 * Setter for wsEditDateMm attribute.
	 * @param wsEditDateMm the new value of wsEditDateMm
	 */
	public void setWsEditDateMm(String wsEditDateMm) {
		this.wsEditDateMm.setValue(wsEditDateMm);
	}
	/**
	 * Gets the reference for attribute wsEditDateMmN.
	 * @return the wsEditDateMmN attribute reference
	 */
	public ElementaryRangeReference getWsEditDateMmNReference() {
		return wsEditDateMmN.getReference();
	}

	/**
	 * Getter for wsEditDateMmN attribute.
	 * @return wsEditDateMmN attribute
	 */
	public int getWsEditDateMmN() {
		return wsEditDateMmN.getValue();
	}

	/**
	 * Setter for wsEditDateMmN attribute.
	 * @param wsEditDateMmN the new value of wsEditDateMmN
	 */
	public void setWsEditDateMmN(int wsEditDateMmN) {
		this.wsEditDateMmN.setValue(wsEditDateMmN);
	}
	/**
	 * Gets the reference for attribute wsValidMonth.
	 * @return the wsValidMonth attribute reference
	 */
	public ConditionReference getWsValidMonthReference() {
		return wsEditDateMmN.getCondition(wsValidMonth);	
	}

	/**
	 * Getter for wsValidMonth attribute.
	 * @return wsValidMonth attribute
	 */
	public boolean isWsValidMonth() {
		return getWsValidMonthReference().getValue();	
	}

	/**
	 * Setter for wsValidMonth attribute.
	 * @param wsValidMonth the new value of wsValidMonth
	 */
	public void setWsValidMonth(boolean wsValidMonth) {
		getWsValidMonthReference().setValue(wsValidMonth);	
	}
	/**
	 * Gets the reference for attribute ws31DayMonth.
	 * @return the ws31DayMonth attribute reference
	 */
	public ConditionReference getWs31DayMonthReference() {
		return wsEditDateMmN.getCondition(ws31DayMonth);	
	}

	/**
	 * Getter for ws31DayMonth attribute.
	 * @return ws31DayMonth attribute
	 */
	public boolean isWs31DayMonth() {
		return getWs31DayMonthReference().getValue();	
	}

	/**
	 * Setter for ws31DayMonth attribute.
	 * @param ws31DayMonth the new value of ws31DayMonth
	 */
	public void setWs31DayMonth(boolean ws31DayMonth) {
		getWs31DayMonthReference().setValue(ws31DayMonth);	
	}
	/**
	 * Gets the reference for attribute wsFebruary.
	 * @return the wsFebruary attribute reference
	 */
	public ConditionReference getWsFebruaryReference() {
		return wsEditDateMmN.getCondition(wsFebruary);	
	}

	/**
	 * Getter for wsFebruary attribute.
	 * @return wsFebruary attribute
	 */
	public boolean isWsFebruary() {
		return getWsFebruaryReference().getValue();	
	}

	/**
	 * Setter for wsFebruary attribute.
	 * @param wsFebruary the new value of wsFebruary
	 */
	public void setWsFebruary(boolean wsFebruary) {
		getWsFebruaryReference().setValue(wsFebruary);	
	}
	/**
	 * Gets the reference for attribute wsEditDateDd.
	 * @return the wsEditDateDd attribute reference
	 */
	public ElementaryRangeReference getWsEditDateDdReference() {
		return wsEditDateDd.getReference();
	}

	/**
	 * Getter for wsEditDateDd attribute.
	 * @return wsEditDateDd attribute
	 */
	public String getWsEditDateDd() {
		return wsEditDateDd.getValue();
	}

	/**
	 * Setter for wsEditDateDd attribute.
	 * @param wsEditDateDd the new value of wsEditDateDd
	 */
	public void setWsEditDateDd(String wsEditDateDd) {
		this.wsEditDateDd.setValue(wsEditDateDd);
	}
	/**
	 * Gets the reference for attribute wsEditDateDdN.
	 * @return the wsEditDateDdN attribute reference
	 */
	public ElementaryRangeReference getWsEditDateDdNReference() {
		return wsEditDateDdN.getReference();
	}

	/**
	 * Getter for wsEditDateDdN attribute.
	 * @return wsEditDateDdN attribute
	 */
	public int getWsEditDateDdN() {
		return wsEditDateDdN.getValue();
	}

	/**
	 * Setter for wsEditDateDdN attribute.
	 * @param wsEditDateDdN the new value of wsEditDateDdN
	 */
	public void setWsEditDateDdN(int wsEditDateDdN) {
		this.wsEditDateDdN.setValue(wsEditDateDdN);
	}
	/**
	 * Gets the reference for attribute wsValidDay.
	 * @return the wsValidDay attribute reference
	 */
	public ConditionReference getWsValidDayReference() {
		return wsEditDateDdN.getCondition(wsValidDay);	
	}

	/**
	 * Getter for wsValidDay attribute.
	 * @return wsValidDay attribute
	 */
	public boolean isWsValidDay() {
		return getWsValidDayReference().getValue();	
	}

	/**
	 * Setter for wsValidDay attribute.
	 * @param wsValidDay the new value of wsValidDay
	 */
	public void setWsValidDay(boolean wsValidDay) {
		getWsValidDayReference().setValue(wsValidDay);	
	}
	/**
	 * Gets the reference for attribute wsDay31.
	 * @return the wsDay31 attribute reference
	 */
	public ConditionReference getWsDay31Reference() {
		return wsEditDateDdN.getCondition(wsDay31);	
	}

	/**
	 * Getter for wsDay31 attribute.
	 * @return wsDay31 attribute
	 */
	public boolean isWsDay31() {
		return getWsDay31Reference().getValue();	
	}

	/**
	 * Setter for wsDay31 attribute.
	 * @param wsDay31 the new value of wsDay31
	 */
	public void setWsDay31(boolean wsDay31) {
		getWsDay31Reference().setValue(wsDay31);	
	}
	/**
	 * Gets the reference for attribute wsDay30.
	 * @return the wsDay30 attribute reference
	 */
	public ConditionReference getWsDay30Reference() {
		return wsEditDateDdN.getCondition(wsDay30);	
	}

	/**
	 * Getter for wsDay30 attribute.
	 * @return wsDay30 attribute
	 */
	public boolean isWsDay30() {
		return getWsDay30Reference().getValue();	
	}

	/**
	 * Setter for wsDay30 attribute.
	 * @param wsDay30 the new value of wsDay30
	 */
	public void setWsDay30(boolean wsDay30) {
		getWsDay30Reference().setValue(wsDay30);	
	}
	/**
	 * Gets the reference for attribute wsDay29.
	 * @return the wsDay29 attribute reference
	 */
	public ConditionReference getWsDay29Reference() {
		return wsEditDateDdN.getCondition(wsDay29);	
	}

	/**
	 * Getter for wsDay29 attribute.
	 * @return wsDay29 attribute
	 */
	public boolean isWsDay29() {
		return getWsDay29Reference().getValue();	
	}

	/**
	 * Setter for wsDay29 attribute.
	 * @param wsDay29 the new value of wsDay29
	 */
	public void setWsDay29(boolean wsDay29) {
		getWsDay29Reference().setValue(wsDay29);	
	}
	/**
	 * Gets the reference for attribute wsValidFebDay.
	 * @return the wsValidFebDay attribute reference
	 */
	public ConditionReference getWsValidFebDayReference() {
		return wsEditDateDdN.getCondition(wsValidFebDay);	
	}

	/**
	 * Getter for wsValidFebDay attribute.
	 * @return wsValidFebDay attribute
	 */
	public boolean isWsValidFebDay() {
		return getWsValidFebDayReference().getValue();	
	}

	/**
	 * Setter for wsValidFebDay attribute.
	 * @param wsValidFebDay the new value of wsValidFebDay
	 */
	public void setWsValidFebDay(boolean wsValidFebDay) {
		getWsValidFebDayReference().setValue(wsValidFebDay);	
	}
	/**
	 * Gets the reference for attribute wsEditDateCcyymmddN.
	 * @return the wsEditDateCcyymmddN attribute reference
	 */
	public ElementaryRangeReference getWsEditDateCcyymmddNReference() {
		return wsEditDateCcyymmddN.getReference();
	}

	/**
	 * Getter for wsEditDateCcyymmddN attribute.
	 * @return wsEditDateCcyymmddN attribute
	 */
	public int getWsEditDateCcyymmddN() {
		return wsEditDateCcyymmddN.getValue();
	}

	/**
	 * Setter for wsEditDateCcyymmddN attribute.
	 * @param wsEditDateCcyymmddN the new value of wsEditDateCcyymmddN
	 */
	public void setWsEditDateCcyymmddN(int wsEditDateCcyymmddN) {
		this.wsEditDateCcyymmddN.setValue(wsEditDateCcyymmddN);
	}
	/**
	 * Gets the reference for attribute wsEditDateBinary.
	 * @return the wsEditDateBinary attribute reference
	 */
	public ElementaryRangeReference getWsEditDateBinaryReference() {
		return wsEditDateBinary.getReference();
	}

	/**
	 * Getter for wsEditDateBinary attribute.
	 * @return wsEditDateBinary attribute
	 */
	public int getWsEditDateBinary() {
		return wsEditDateBinary.getValue();
	}

	/**
	 * Setter for wsEditDateBinary attribute.
	 * @param wsEditDateBinary the new value of wsEditDateBinary
	 */
	public void setWsEditDateBinary(int wsEditDateBinary) {
		this.wsEditDateBinary.setValue(wsEditDateBinary);
	}
	
	/**
	 * Gets the reference for attribute wsCurrentDate.
	 * @return the wsCurrentDate attribute reference
	 */
	public RangeReference getWsCurrentDateReference() {
		return wsCurrentDate.getReference();
	}	
				
	/**
	 * Setter for wsCurrentDate .
	 */
   	public void setWsCurrentDate(RangeReference reference) {
       	wsCurrentDate.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsCurrentDateYyyymmdd.
	 * @return the wsCurrentDateYyyymmdd attribute reference
	 */
	public ElementaryRangeReference getWsCurrentDateYyyymmddReference() {
		return wsCurrentDateYyyymmdd.getReference();
	}

	/**
	 * Getter for wsCurrentDateYyyymmdd attribute.
	 * @return wsCurrentDateYyyymmdd attribute
	 */
	public String getWsCurrentDateYyyymmdd() {
		return wsCurrentDateYyyymmdd.getValue();
	}

	/**
	 * Setter for wsCurrentDateYyyymmdd attribute.
	 * @param wsCurrentDateYyyymmdd the new value of wsCurrentDateYyyymmdd
	 */
	public void setWsCurrentDateYyyymmdd(String wsCurrentDateYyyymmdd) {
		this.wsCurrentDateYyyymmdd.setValue(wsCurrentDateYyyymmdd);
	}
	/**
	 * Gets the reference for attribute wsCurrentDateYyyymmddN.
	 * @return the wsCurrentDateYyyymmddN attribute reference
	 */
	public ElementaryRangeReference getWsCurrentDateYyyymmddNReference() {
		return wsCurrentDateYyyymmddN.getReference();
	}

	/**
	 * Getter for wsCurrentDateYyyymmddN attribute.
	 * @return wsCurrentDateYyyymmddN attribute
	 */
	public int getWsCurrentDateYyyymmddN() {
		return wsCurrentDateYyyymmddN.getValue();
	}

	/**
	 * Setter for wsCurrentDateYyyymmddN attribute.
	 * @param wsCurrentDateYyyymmddN the new value of wsCurrentDateYyyymmddN
	 */
	public void setWsCurrentDateYyyymmddN(int wsCurrentDateYyyymmddN) {
		this.wsCurrentDateYyyymmddN.setValue(wsCurrentDateYyyymmddN);
	}
	/**
	 * Gets the reference for attribute wsCurrentDateBinary.
	 * @return the wsCurrentDateBinary attribute reference
	 */
	public ElementaryRangeReference getWsCurrentDateBinaryReference() {
		return wsCurrentDateBinary.getReference();
	}

	/**
	 * Getter for wsCurrentDateBinary attribute.
	 * @return wsCurrentDateBinary attribute
	 */
	public int getWsCurrentDateBinary() {
		return wsCurrentDateBinary.getValue();
	}

	/**
	 * Setter for wsCurrentDateBinary attribute.
	 * @param wsCurrentDateBinary the new value of wsCurrentDateBinary
	 */
	public void setWsCurrentDateBinary(int wsCurrentDateBinary) {
		this.wsCurrentDateBinary.setValue(wsCurrentDateBinary);
	}
	
	/**
	 * Gets the reference for attribute wsEditDateFlgs.
	 * @return the wsEditDateFlgs attribute reference
	 */
	public RangeReference getWsEditDateFlgsReference() {
		return wsEditDateFlgs.getReference();
	}	
				
	/**
	 * Setter for wsEditDateFlgs .
	 */
   	public void setWsEditDateFlgs(RangeReference reference) {
       	wsEditDateFlgs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditDateIsValid.
	 * @return the wsEditDateIsValid attribute reference
	 */
	public ConditionReference getWsEditDateIsValidReference() {
		return wsEditDateFlgs.getCondition(wsEditDateIsValid);	
	}

	/**
	 * Getter for wsEditDateIsValid attribute.
	 * @return wsEditDateIsValid attribute
	 */
	public boolean isWsEditDateIsValid() {
		return getWsEditDateIsValidReference().getValue();	
	}

	/**
	 * Setter for wsEditDateIsValid attribute.
	 * @param wsEditDateIsValid the new value of wsEditDateIsValid
	 */
	public void setWsEditDateIsValid(boolean wsEditDateIsValid) {
		getWsEditDateIsValidReference().setValue(wsEditDateIsValid);	
	}
	/**
	 * Gets the reference for attribute wsEditDateIsInvalid.
	 * @return the wsEditDateIsInvalid attribute reference
	 */
	public ConditionReference getWsEditDateIsInvalidReference() {
		return wsEditDateFlgs.getCondition(wsEditDateIsInvalid);	
	}

	/**
	 * Getter for wsEditDateIsInvalid attribute.
	 * @return wsEditDateIsInvalid attribute
	 */
	public boolean isWsEditDateIsInvalid() {
		return getWsEditDateIsInvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditDateIsInvalid attribute.
	 * @param wsEditDateIsInvalid the new value of wsEditDateIsInvalid
	 */
	public void setWsEditDateIsInvalid(boolean wsEditDateIsInvalid) {
		getWsEditDateIsInvalidReference().setValue(wsEditDateIsInvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditYearFlg.
	 * @return the wsEditYearFlg attribute reference
	 */
	public ElementaryRangeReference getWsEditYearFlgReference() {
		return wsEditYearFlg.getReference();
	}

	/**
	 * Getter for wsEditYearFlg attribute.
	 * @return wsEditYearFlg attribute
	 */
	public String getWsEditYearFlg() {
		return wsEditYearFlg.getValue();
	}

	/**
	 * Setter for wsEditYearFlg attribute.
	 * @param wsEditYearFlg the new value of wsEditYearFlg
	 */
	public void setWsEditYearFlg(String wsEditYearFlg) {
		this.wsEditYearFlg.setValue(wsEditYearFlg);
	}
	/**
	 * Gets the reference for attribute flgYearIsvalid.
	 * @return the flgYearIsvalid attribute reference
	 */
	public ConditionReference getFlgYearIsvalidReference() {
		return wsEditYearFlg.getCondition(flgYearIsvalid);	
	}

	/**
	 * Getter for flgYearIsvalid attribute.
	 * @return flgYearIsvalid attribute
	 */
	public boolean isFlgYearIsvalid() {
		return getFlgYearIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgYearIsvalid attribute.
	 * @param flgYearIsvalid the new value of flgYearIsvalid
	 */
	public void setFlgYearIsvalid(boolean flgYearIsvalid) {
		getFlgYearIsvalidReference().setValue(flgYearIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgYearNotOk.
	 * @return the flgYearNotOk attribute reference
	 */
	public ConditionReference getFlgYearNotOkReference() {
		return wsEditYearFlg.getCondition(flgYearNotOk);	
	}

	/**
	 * Getter for flgYearNotOk attribute.
	 * @return flgYearNotOk attribute
	 */
	public boolean isFlgYearNotOk() {
		return getFlgYearNotOkReference().getValue();	
	}

	/**
	 * Setter for flgYearNotOk attribute.
	 * @param flgYearNotOk the new value of flgYearNotOk
	 */
	public void setFlgYearNotOk(boolean flgYearNotOk) {
		getFlgYearNotOkReference().setValue(flgYearNotOk);	
	}
	/**
	 * Gets the reference for attribute flgYearBlank.
	 * @return the flgYearBlank attribute reference
	 */
	public ConditionReference getFlgYearBlankReference() {
		return wsEditYearFlg.getCondition(flgYearBlank);	
	}

	/**
	 * Getter for flgYearBlank attribute.
	 * @return flgYearBlank attribute
	 */
	public boolean isFlgYearBlank() {
		return getFlgYearBlankReference().getValue();	
	}

	/**
	 * Setter for flgYearBlank attribute.
	 * @param flgYearBlank the new value of flgYearBlank
	 */
	public void setFlgYearBlank(boolean flgYearBlank) {
		getFlgYearBlankReference().setValue(flgYearBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditMonth.
	 * @return the wsEditMonth attribute reference
	 */
	public ElementaryRangeReference getWsEditMonthReference() {
		return wsEditMonth.getReference();
	}

	/**
	 * Getter for wsEditMonth attribute.
	 * @return wsEditMonth attribute
	 */
	public String getWsEditMonth() {
		return wsEditMonth.getValue();
	}

	/**
	 * Setter for wsEditMonth attribute.
	 * @param wsEditMonth the new value of wsEditMonth
	 */
	public void setWsEditMonth(String wsEditMonth) {
		this.wsEditMonth.setValue(wsEditMonth);
	}
	/**
	 * Gets the reference for attribute flgMonthIsvalid.
	 * @return the flgMonthIsvalid attribute reference
	 */
	public ConditionReference getFlgMonthIsvalidReference() {
		return wsEditMonth.getCondition(flgMonthIsvalid);	
	}

	/**
	 * Getter for flgMonthIsvalid attribute.
	 * @return flgMonthIsvalid attribute
	 */
	public boolean isFlgMonthIsvalid() {
		return getFlgMonthIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgMonthIsvalid attribute.
	 * @param flgMonthIsvalid the new value of flgMonthIsvalid
	 */
	public void setFlgMonthIsvalid(boolean flgMonthIsvalid) {
		getFlgMonthIsvalidReference().setValue(flgMonthIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgMonthNotOk.
	 * @return the flgMonthNotOk attribute reference
	 */
	public ConditionReference getFlgMonthNotOkReference() {
		return wsEditMonth.getCondition(flgMonthNotOk);	
	}

	/**
	 * Getter for flgMonthNotOk attribute.
	 * @return flgMonthNotOk attribute
	 */
	public boolean isFlgMonthNotOk() {
		return getFlgMonthNotOkReference().getValue();	
	}

	/**
	 * Setter for flgMonthNotOk attribute.
	 * @param flgMonthNotOk the new value of flgMonthNotOk
	 */
	public void setFlgMonthNotOk(boolean flgMonthNotOk) {
		getFlgMonthNotOkReference().setValue(flgMonthNotOk);	
	}
	/**
	 * Gets the reference for attribute flgMonthBlank.
	 * @return the flgMonthBlank attribute reference
	 */
	public ConditionReference getFlgMonthBlankReference() {
		return wsEditMonth.getCondition(flgMonthBlank);	
	}

	/**
	 * Getter for flgMonthBlank attribute.
	 * @return flgMonthBlank attribute
	 */
	public boolean isFlgMonthBlank() {
		return getFlgMonthBlankReference().getValue();	
	}

	/**
	 * Setter for flgMonthBlank attribute.
	 * @param flgMonthBlank the new value of flgMonthBlank
	 */
	public void setFlgMonthBlank(boolean flgMonthBlank) {
		getFlgMonthBlankReference().setValue(flgMonthBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditDay.
	 * @return the wsEditDay attribute reference
	 */
	public ElementaryRangeReference getWsEditDayReference() {
		return wsEditDay.getReference();
	}

	/**
	 * Getter for wsEditDay attribute.
	 * @return wsEditDay attribute
	 */
	public String getWsEditDay() {
		return wsEditDay.getValue();
	}

	/**
	 * Setter for wsEditDay attribute.
	 * @param wsEditDay the new value of wsEditDay
	 */
	public void setWsEditDay(String wsEditDay) {
		this.wsEditDay.setValue(wsEditDay);
	}
	/**
	 * Gets the reference for attribute flgDayIsvalid.
	 * @return the flgDayIsvalid attribute reference
	 */
	public ConditionReference getFlgDayIsvalidReference() {
		return wsEditDay.getCondition(flgDayIsvalid);	
	}

	/**
	 * Getter for flgDayIsvalid attribute.
	 * @return flgDayIsvalid attribute
	 */
	public boolean isFlgDayIsvalid() {
		return getFlgDayIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgDayIsvalid attribute.
	 * @param flgDayIsvalid the new value of flgDayIsvalid
	 */
	public void setFlgDayIsvalid(boolean flgDayIsvalid) {
		getFlgDayIsvalidReference().setValue(flgDayIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgDayNotOk.
	 * @return the flgDayNotOk attribute reference
	 */
	public ConditionReference getFlgDayNotOkReference() {
		return wsEditDay.getCondition(flgDayNotOk);	
	}

	/**
	 * Getter for flgDayNotOk attribute.
	 * @return flgDayNotOk attribute
	 */
	public boolean isFlgDayNotOk() {
		return getFlgDayNotOkReference().getValue();	
	}

	/**
	 * Setter for flgDayNotOk attribute.
	 * @param flgDayNotOk the new value of flgDayNotOk
	 */
	public void setFlgDayNotOk(boolean flgDayNotOk) {
		getFlgDayNotOkReference().setValue(flgDayNotOk);	
	}
	/**
	 * Gets the reference for attribute flgDayBlank.
	 * @return the flgDayBlank attribute reference
	 */
	public ConditionReference getFlgDayBlankReference() {
		return wsEditDay.getCondition(flgDayBlank);	
	}

	/**
	 * Getter for flgDayBlank attribute.
	 * @return flgDayBlank attribute
	 */
	public boolean isFlgDayBlank() {
		return getFlgDayBlankReference().getValue();	
	}

	/**
	 * Setter for flgDayBlank attribute.
	 * @param flgDayBlank the new value of flgDayBlank
	 */
	public void setFlgDayBlank(boolean flgDayBlank) {
		getFlgDayBlankReference().setValue(flgDayBlank);	
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
	 * Gets the reference for attribute wsDateValidationResult.
	 * @return the wsDateValidationResult attribute reference
	 */
	public RangeReference getWsDateValidationResultReference() {
		return wsDateValidationResult.getReference();
	}	
				
	/**
	 * Setter for wsDateValidationResult .
	 */
   	public void setWsDateValidationResult(RangeReference reference) {
       	wsDateValidationResult.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsSeverity.
	 * @return the wsSeverity attribute reference
	 */
	public ElementaryRangeReference getWsSeverityReference() {
		return wsSeverity.getReference();
	}

	/**
	 * Getter for wsSeverity attribute.
	 * @return wsSeverity attribute
	 */
	public String getWsSeverity() {
		return wsSeverity.getValue();
	}

	/**
	 * Setter for wsSeverity attribute.
	 * @param wsSeverity the new value of wsSeverity
	 */
	public void setWsSeverity(String wsSeverity) {
		this.wsSeverity.setValue(wsSeverity);
	}
	/**
	 * Gets the reference for attribute wsSeverityN.
	 * @return the wsSeverityN attribute reference
	 */
	public ElementaryRangeReference getWsSeverityNReference() {
		return wsSeverityN.getReference();
	}

	/**
	 * Getter for wsSeverityN attribute.
	 * @return wsSeverityN attribute
	 */
	public int getWsSeverityN() {
		return wsSeverityN.getValue();
	}

	/**
	 * Setter for wsSeverityN attribute.
	 * @param wsSeverityN the new value of wsSeverityN
	 */
	public void setWsSeverityN(int wsSeverityN) {
		this.wsSeverityN.setValue(wsSeverityN);
	}
	/**
	 * Gets the reference for attribute wsMsgNo.
	 * @return the wsMsgNo attribute reference
	 */
	public ElementaryRangeReference getWsMsgNoReference() {
		return wsMsgNo.getReference();
	}

	/**
	 * Getter for wsMsgNo attribute.
	 * @return wsMsgNo attribute
	 */
	public String getWsMsgNo() {
		return wsMsgNo.getValue();
	}

	/**
	 * Setter for wsMsgNo attribute.
	 * @param wsMsgNo the new value of wsMsgNo
	 */
	public void setWsMsgNo(String wsMsgNo) {
		this.wsMsgNo.setValue(wsMsgNo);
	}
	/**
	 * Gets the reference for attribute wsMsgNoN.
	 * @return the wsMsgNoN attribute reference
	 */
	public ElementaryRangeReference getWsMsgNoNReference() {
		return wsMsgNoN.getReference();
	}

	/**
	 * Getter for wsMsgNoN attribute.
	 * @return wsMsgNoN attribute
	 */
	public int getWsMsgNoN() {
		return wsMsgNoN.getValue();
	}

	/**
	 * Setter for wsMsgNoN attribute.
	 * @param wsMsgNoN the new value of wsMsgNoN
	 */
	public void setWsMsgNoN(int wsMsgNoN) {
		this.wsMsgNoN.setValue(wsMsgNoN);
	}
	/**
	 * Gets the reference for attribute wsResult.
	 * @return the wsResult attribute reference
	 */
	public ElementaryRangeReference getWsResultReference() {
		return wsResult.getReference();
	}

	/**
	 * Getter for wsResult attribute.
	 * @return wsResult attribute
	 */
	public String getWsResult() {
		return wsResult.getValue();
	}

	/**
	 * Setter for wsResult attribute.
	 * @param wsResult the new value of wsResult
	 */
	public void setWsResult(String wsResult) {
		this.wsResult.setValue(wsResult);
	}
	/**
	 * Gets the reference for attribute wsDate.
	 * @return the wsDate attribute reference
	 */
	public ElementaryRangeReference getWsDateReference() {
		return wsDate.getReference();
	}

	/**
	 * Getter for wsDate attribute.
	 * @return wsDate attribute
	 */
	public String getWsDate() {
		return wsDate.getValue();
	}

	/**
	 * Setter for wsDate attribute.
	 * @param wsDate the new value of wsDate
	 */
	public void setWsDate(String wsDate) {
		this.wsDate.setValue(wsDate);
	}
	/**
	 * Gets the reference for attribute wsDateFmt.
	 * @return the wsDateFmt attribute reference
	 */
	public ElementaryRangeReference getWsDateFmtReference() {
		return wsDateFmt.getReference();
	}

	/**
	 * Getter for wsDateFmt attribute.
	 * @return wsDateFmt attribute
	 */
	public String getWsDateFmt() {
		return wsDateFmt.getValue();
	}

	/**
	 * Setter for wsDateFmt attribute.
	 * @param wsDateFmt the new value of wsDateFmt
	 */
	public void setWsDateFmt(String wsDateFmt) {
		this.wsDateFmt.setValue(wsDateFmt);
	}
	/**
	 * Gets the reference for attribute wsDatachangedFlag.
	 * @return the wsDatachangedFlag attribute reference
	 */
	public ElementaryRangeReference getWsDatachangedFlagReference() {
		return wsDatachangedFlag.getReference();
	}

	/**
	 * Getter for wsDatachangedFlag attribute.
	 * @return wsDatachangedFlag attribute
	 */
	public String getWsDatachangedFlag() {
		return wsDatachangedFlag.getValue();
	}

	/**
	 * Setter for wsDatachangedFlag attribute.
	 * @param wsDatachangedFlag the new value of wsDatachangedFlag
	 */
	public void setWsDatachangedFlag(String wsDatachangedFlag) {
		this.wsDatachangedFlag.setValue(wsDatachangedFlag);
	}
	/**
	 * Gets the reference for attribute noChangesFound.
	 * @return the noChangesFound attribute reference
	 */
	public ConditionReference getNoChangesFoundReference() {
		return wsDatachangedFlag.getCondition(noChangesFound);	
	}

	/**
	 * Getter for noChangesFound attribute.
	 * @return noChangesFound attribute
	 */
	public boolean isNoChangesFound() {
		return getNoChangesFoundReference().getValue();	
	}

	/**
	 * Setter for noChangesFound attribute.
	 * @param noChangesFound the new value of noChangesFound
	 */
	public void setNoChangesFound(boolean noChangesFound) {
		getNoChangesFoundReference().setValue(noChangesFound);	
	}
	/**
	 * Gets the reference for attribute changeHasOccurred.
	 * @return the changeHasOccurred attribute reference
	 */
	public ConditionReference getChangeHasOccurredReference() {
		return wsDatachangedFlag.getCondition(changeHasOccurred);	
	}

	/**
	 * Getter for changeHasOccurred attribute.
	 * @return changeHasOccurred attribute
	 */
	public boolean isChangeHasOccurred() {
		return getChangeHasOccurredReference().getValue();	
	}

	/**
	 * Setter for changeHasOccurred attribute.
	 * @param changeHasOccurred the new value of changeHasOccurred
	 */
	public void setChangeHasOccurred(boolean changeHasOccurred) {
		getChangeHasOccurredReference().setValue(changeHasOccurred);	
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
	 * Gets the reference for attribute wsNonKeyFlags.
	 * @return the wsNonKeyFlags attribute reference
	 */
	public RangeReference getWsNonKeyFlagsReference() {
		return wsNonKeyFlags.getReference();
	}	
				
	/**
	 * Setter for wsNonKeyFlags .
	 */
   	public void setWsNonKeyFlags(RangeReference reference) {
       	wsNonKeyFlags.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditAcctStatus.
	 * @return the wsEditAcctStatus attribute reference
	 */
	public ElementaryRangeReference getWsEditAcctStatusReference() {
		return wsEditAcctStatus.getReference();
	}

	/**
	 * Getter for wsEditAcctStatus attribute.
	 * @return wsEditAcctStatus attribute
	 */
	public String getWsEditAcctStatus() {
		return wsEditAcctStatus.getValue();
	}

	/**
	 * Setter for wsEditAcctStatus attribute.
	 * @param wsEditAcctStatus the new value of wsEditAcctStatus
	 */
	public void setWsEditAcctStatus(String wsEditAcctStatus) {
		this.wsEditAcctStatus.setValue(wsEditAcctStatus);
	}
	/**
	 * Gets the reference for attribute flgAcctStatusIsvalid.
	 * @return the flgAcctStatusIsvalid attribute reference
	 */
	public ConditionReference getFlgAcctStatusIsvalidReference() {
		return wsEditAcctStatus.getCondition(flgAcctStatusIsvalid);	
	}

	/**
	 * Getter for flgAcctStatusIsvalid attribute.
	 * @return flgAcctStatusIsvalid attribute
	 */
	public boolean isFlgAcctStatusIsvalid() {
		return getFlgAcctStatusIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgAcctStatusIsvalid attribute.
	 * @param flgAcctStatusIsvalid the new value of flgAcctStatusIsvalid
	 */
	public void setFlgAcctStatusIsvalid(boolean flgAcctStatusIsvalid) {
		getFlgAcctStatusIsvalidReference().setValue(flgAcctStatusIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgAcctStatusNotOk.
	 * @return the flgAcctStatusNotOk attribute reference
	 */
	public ConditionReference getFlgAcctStatusNotOkReference() {
		return wsEditAcctStatus.getCondition(flgAcctStatusNotOk);	
	}

	/**
	 * Getter for flgAcctStatusNotOk attribute.
	 * @return flgAcctStatusNotOk attribute
	 */
	public boolean isFlgAcctStatusNotOk() {
		return getFlgAcctStatusNotOkReference().getValue();	
	}

	/**
	 * Setter for flgAcctStatusNotOk attribute.
	 * @param flgAcctStatusNotOk the new value of flgAcctStatusNotOk
	 */
	public void setFlgAcctStatusNotOk(boolean flgAcctStatusNotOk) {
		getFlgAcctStatusNotOkReference().setValue(flgAcctStatusNotOk);	
	}
	/**
	 * Gets the reference for attribute flgAcctStatusBlank.
	 * @return the flgAcctStatusBlank attribute reference
	 */
	public ConditionReference getFlgAcctStatusBlankReference() {
		return wsEditAcctStatus.getCondition(flgAcctStatusBlank);	
	}

	/**
	 * Getter for flgAcctStatusBlank attribute.
	 * @return flgAcctStatusBlank attribute
	 */
	public boolean isFlgAcctStatusBlank() {
		return getFlgAcctStatusBlankReference().getValue();	
	}

	/**
	 * Setter for flgAcctStatusBlank attribute.
	 * @param flgAcctStatusBlank the new value of flgAcctStatusBlank
	 */
	public void setFlgAcctStatusBlank(boolean flgAcctStatusBlank) {
		getFlgAcctStatusBlankReference().setValue(flgAcctStatusBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCreditLimit.
	 * @return the wsEditCreditLimit attribute reference
	 */
	public ElementaryRangeReference getWsEditCreditLimitReference() {
		return wsEditCreditLimit.getReference();
	}

	/**
	 * Getter for wsEditCreditLimit attribute.
	 * @return wsEditCreditLimit attribute
	 */
	public String getWsEditCreditLimit() {
		return wsEditCreditLimit.getValue();
	}

	/**
	 * Setter for wsEditCreditLimit attribute.
	 * @param wsEditCreditLimit the new value of wsEditCreditLimit
	 */
	public void setWsEditCreditLimit(String wsEditCreditLimit) {
		this.wsEditCreditLimit.setValue(wsEditCreditLimit);
	}
	/**
	 * Gets the reference for attribute flgCredLimitIsvalid.
	 * @return the flgCredLimitIsvalid attribute reference
	 */
	public ConditionReference getFlgCredLimitIsvalidReference() {
		return wsEditCreditLimit.getCondition(flgCredLimitIsvalid);	
	}

	/**
	 * Getter for flgCredLimitIsvalid attribute.
	 * @return flgCredLimitIsvalid attribute
	 */
	public boolean isFlgCredLimitIsvalid() {
		return getFlgCredLimitIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCredLimitIsvalid attribute.
	 * @param flgCredLimitIsvalid the new value of flgCredLimitIsvalid
	 */
	public void setFlgCredLimitIsvalid(boolean flgCredLimitIsvalid) {
		getFlgCredLimitIsvalidReference().setValue(flgCredLimitIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCredLimitNotOk.
	 * @return the flgCredLimitNotOk attribute reference
	 */
	public ConditionReference getFlgCredLimitNotOkReference() {
		return wsEditCreditLimit.getCondition(flgCredLimitNotOk);	
	}

	/**
	 * Getter for flgCredLimitNotOk attribute.
	 * @return flgCredLimitNotOk attribute
	 */
	public boolean isFlgCredLimitNotOk() {
		return getFlgCredLimitNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCredLimitNotOk attribute.
	 * @param flgCredLimitNotOk the new value of flgCredLimitNotOk
	 */
	public void setFlgCredLimitNotOk(boolean flgCredLimitNotOk) {
		getFlgCredLimitNotOkReference().setValue(flgCredLimitNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCredLimitBlank.
	 * @return the flgCredLimitBlank attribute reference
	 */
	public ConditionReference getFlgCredLimitBlankReference() {
		return wsEditCreditLimit.getCondition(flgCredLimitBlank);	
	}

	/**
	 * Getter for flgCredLimitBlank attribute.
	 * @return flgCredLimitBlank attribute
	 */
	public boolean isFlgCredLimitBlank() {
		return getFlgCredLimitBlankReference().getValue();	
	}

	/**
	 * Setter for flgCredLimitBlank attribute.
	 * @param flgCredLimitBlank the new value of flgCredLimitBlank
	 */
	public void setFlgCredLimitBlank(boolean flgCredLimitBlank) {
		getFlgCredLimitBlankReference().setValue(flgCredLimitBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCashCreditLimit.
	 * @return the wsEditCashCreditLimit attribute reference
	 */
	public ElementaryRangeReference getWsEditCashCreditLimitReference() {
		return wsEditCashCreditLimit.getReference();
	}

	/**
	 * Getter for wsEditCashCreditLimit attribute.
	 * @return wsEditCashCreditLimit attribute
	 */
	public String getWsEditCashCreditLimit() {
		return wsEditCashCreditLimit.getValue();
	}

	/**
	 * Setter for wsEditCashCreditLimit attribute.
	 * @param wsEditCashCreditLimit the new value of wsEditCashCreditLimit
	 */
	public void setWsEditCashCreditLimit(String wsEditCashCreditLimit) {
		this.wsEditCashCreditLimit.setValue(wsEditCashCreditLimit);
	}
	/**
	 * Gets the reference for attribute flgCashCreditLimitIsvalid.
	 * @return the flgCashCreditLimitIsvalid attribute reference
	 */
	public ConditionReference getFlgCashCreditLimitIsvalidReference() {
		return wsEditCashCreditLimit.getCondition(flgCashCreditLimitIsvalid);	
	}

	/**
	 * Getter for flgCashCreditLimitIsvalid attribute.
	 * @return flgCashCreditLimitIsvalid attribute
	 */
	public boolean isFlgCashCreditLimitIsvalid() {
		return getFlgCashCreditLimitIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCashCreditLimitIsvalid attribute.
	 * @param flgCashCreditLimitIsvalid the new value of flgCashCreditLimitIsvalid
	 */
	public void setFlgCashCreditLimitIsvalid(boolean flgCashCreditLimitIsvalid) {
		getFlgCashCreditLimitIsvalidReference().setValue(flgCashCreditLimitIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCashCreditLimitNotOk.
	 * @return the flgCashCreditLimitNotOk attribute reference
	 */
	public ConditionReference getFlgCashCreditLimitNotOkReference() {
		return wsEditCashCreditLimit.getCondition(flgCashCreditLimitNotOk);	
	}

	/**
	 * Getter for flgCashCreditLimitNotOk attribute.
	 * @return flgCashCreditLimitNotOk attribute
	 */
	public boolean isFlgCashCreditLimitNotOk() {
		return getFlgCashCreditLimitNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCashCreditLimitNotOk attribute.
	 * @param flgCashCreditLimitNotOk the new value of flgCashCreditLimitNotOk
	 */
	public void setFlgCashCreditLimitNotOk(boolean flgCashCreditLimitNotOk) {
		getFlgCashCreditLimitNotOkReference().setValue(flgCashCreditLimitNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCashCreditLimitBlank.
	 * @return the flgCashCreditLimitBlank attribute reference
	 */
	public ConditionReference getFlgCashCreditLimitBlankReference() {
		return wsEditCashCreditLimit.getCondition(flgCashCreditLimitBlank);	
	}

	/**
	 * Getter for flgCashCreditLimitBlank attribute.
	 * @return flgCashCreditLimitBlank attribute
	 */
	public boolean isFlgCashCreditLimitBlank() {
		return getFlgCashCreditLimitBlankReference().getValue();	
	}

	/**
	 * Setter for flgCashCreditLimitBlank attribute.
	 * @param flgCashCreditLimitBlank the new value of flgCashCreditLimitBlank
	 */
	public void setFlgCashCreditLimitBlank(boolean flgCashCreditLimitBlank) {
		getFlgCashCreditLimitBlankReference().setValue(flgCashCreditLimitBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCurrBal.
	 * @return the wsEditCurrBal attribute reference
	 */
	public ElementaryRangeReference getWsEditCurrBalReference() {
		return wsEditCurrBal.getReference();
	}

	/**
	 * Getter for wsEditCurrBal attribute.
	 * @return wsEditCurrBal attribute
	 */
	public String getWsEditCurrBal() {
		return wsEditCurrBal.getValue();
	}

	/**
	 * Setter for wsEditCurrBal attribute.
	 * @param wsEditCurrBal the new value of wsEditCurrBal
	 */
	public void setWsEditCurrBal(String wsEditCurrBal) {
		this.wsEditCurrBal.setValue(wsEditCurrBal);
	}
	/**
	 * Gets the reference for attribute flgCurrBalIsvalid.
	 * @return the flgCurrBalIsvalid attribute reference
	 */
	public ConditionReference getFlgCurrBalIsvalidReference() {
		return wsEditCurrBal.getCondition(flgCurrBalIsvalid);	
	}

	/**
	 * Getter for flgCurrBalIsvalid attribute.
	 * @return flgCurrBalIsvalid attribute
	 */
	public boolean isFlgCurrBalIsvalid() {
		return getFlgCurrBalIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCurrBalIsvalid attribute.
	 * @param flgCurrBalIsvalid the new value of flgCurrBalIsvalid
	 */
	public void setFlgCurrBalIsvalid(boolean flgCurrBalIsvalid) {
		getFlgCurrBalIsvalidReference().setValue(flgCurrBalIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCurrBalNotOk.
	 * @return the flgCurrBalNotOk attribute reference
	 */
	public ConditionReference getFlgCurrBalNotOkReference() {
		return wsEditCurrBal.getCondition(flgCurrBalNotOk);	
	}

	/**
	 * Getter for flgCurrBalNotOk attribute.
	 * @return flgCurrBalNotOk attribute
	 */
	public boolean isFlgCurrBalNotOk() {
		return getFlgCurrBalNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCurrBalNotOk attribute.
	 * @param flgCurrBalNotOk the new value of flgCurrBalNotOk
	 */
	public void setFlgCurrBalNotOk(boolean flgCurrBalNotOk) {
		getFlgCurrBalNotOkReference().setValue(flgCurrBalNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCurrBalBlank.
	 * @return the flgCurrBalBlank attribute reference
	 */
	public ConditionReference getFlgCurrBalBlankReference() {
		return wsEditCurrBal.getCondition(flgCurrBalBlank);	
	}

	/**
	 * Getter for flgCurrBalBlank attribute.
	 * @return flgCurrBalBlank attribute
	 */
	public boolean isFlgCurrBalBlank() {
		return getFlgCurrBalBlankReference().getValue();	
	}

	/**
	 * Setter for flgCurrBalBlank attribute.
	 * @param flgCurrBalBlank the new value of flgCurrBalBlank
	 */
	public void setFlgCurrBalBlank(boolean flgCurrBalBlank) {
		getFlgCurrBalBlankReference().setValue(flgCurrBalBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCurrCycCredit.
	 * @return the wsEditCurrCycCredit attribute reference
	 */
	public ElementaryRangeReference getWsEditCurrCycCreditReference() {
		return wsEditCurrCycCredit.getReference();
	}

	/**
	 * Getter for wsEditCurrCycCredit attribute.
	 * @return wsEditCurrCycCredit attribute
	 */
	public String getWsEditCurrCycCredit() {
		return wsEditCurrCycCredit.getValue();
	}

	/**
	 * Setter for wsEditCurrCycCredit attribute.
	 * @param wsEditCurrCycCredit the new value of wsEditCurrCycCredit
	 */
	public void setWsEditCurrCycCredit(String wsEditCurrCycCredit) {
		this.wsEditCurrCycCredit.setValue(wsEditCurrCycCredit);
	}
	/**
	 * Gets the reference for attribute flgCurrCycCreditIsvalid.
	 * @return the flgCurrCycCreditIsvalid attribute reference
	 */
	public ConditionReference getFlgCurrCycCreditIsvalidReference() {
		return wsEditCurrCycCredit.getCondition(flgCurrCycCreditIsvalid);	
	}

	/**
	 * Getter for flgCurrCycCreditIsvalid attribute.
	 * @return flgCurrCycCreditIsvalid attribute
	 */
	public boolean isFlgCurrCycCreditIsvalid() {
		return getFlgCurrCycCreditIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCurrCycCreditIsvalid attribute.
	 * @param flgCurrCycCreditIsvalid the new value of flgCurrCycCreditIsvalid
	 */
	public void setFlgCurrCycCreditIsvalid(boolean flgCurrCycCreditIsvalid) {
		getFlgCurrCycCreditIsvalidReference().setValue(flgCurrCycCreditIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCurrCycCreditNotOk.
	 * @return the flgCurrCycCreditNotOk attribute reference
	 */
	public ConditionReference getFlgCurrCycCreditNotOkReference() {
		return wsEditCurrCycCredit.getCondition(flgCurrCycCreditNotOk);	
	}

	/**
	 * Getter for flgCurrCycCreditNotOk attribute.
	 * @return flgCurrCycCreditNotOk attribute
	 */
	public boolean isFlgCurrCycCreditNotOk() {
		return getFlgCurrCycCreditNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCurrCycCreditNotOk attribute.
	 * @param flgCurrCycCreditNotOk the new value of flgCurrCycCreditNotOk
	 */
	public void setFlgCurrCycCreditNotOk(boolean flgCurrCycCreditNotOk) {
		getFlgCurrCycCreditNotOkReference().setValue(flgCurrCycCreditNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCurrCycCreditBlank.
	 * @return the flgCurrCycCreditBlank attribute reference
	 */
	public ConditionReference getFlgCurrCycCreditBlankReference() {
		return wsEditCurrCycCredit.getCondition(flgCurrCycCreditBlank);	
	}

	/**
	 * Getter for flgCurrCycCreditBlank attribute.
	 * @return flgCurrCycCreditBlank attribute
	 */
	public boolean isFlgCurrCycCreditBlank() {
		return getFlgCurrCycCreditBlankReference().getValue();	
	}

	/**
	 * Setter for flgCurrCycCreditBlank attribute.
	 * @param flgCurrCycCreditBlank the new value of flgCurrCycCreditBlank
	 */
	public void setFlgCurrCycCreditBlank(boolean flgCurrCycCreditBlank) {
		getFlgCurrCycCreditBlankReference().setValue(flgCurrCycCreditBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCurrCycDebit.
	 * @return the wsEditCurrCycDebit attribute reference
	 */
	public ElementaryRangeReference getWsEditCurrCycDebitReference() {
		return wsEditCurrCycDebit.getReference();
	}

	/**
	 * Getter for wsEditCurrCycDebit attribute.
	 * @return wsEditCurrCycDebit attribute
	 */
	public String getWsEditCurrCycDebit() {
		return wsEditCurrCycDebit.getValue();
	}

	/**
	 * Setter for wsEditCurrCycDebit attribute.
	 * @param wsEditCurrCycDebit the new value of wsEditCurrCycDebit
	 */
	public void setWsEditCurrCycDebit(String wsEditCurrCycDebit) {
		this.wsEditCurrCycDebit.setValue(wsEditCurrCycDebit);
	}
	/**
	 * Gets the reference for attribute flgCurrCycDebitIsvalid.
	 * @return the flgCurrCycDebitIsvalid attribute reference
	 */
	public ConditionReference getFlgCurrCycDebitIsvalidReference() {
		return wsEditCurrCycDebit.getCondition(flgCurrCycDebitIsvalid);	
	}

	/**
	 * Getter for flgCurrCycDebitIsvalid attribute.
	 * @return flgCurrCycDebitIsvalid attribute
	 */
	public boolean isFlgCurrCycDebitIsvalid() {
		return getFlgCurrCycDebitIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCurrCycDebitIsvalid attribute.
	 * @param flgCurrCycDebitIsvalid the new value of flgCurrCycDebitIsvalid
	 */
	public void setFlgCurrCycDebitIsvalid(boolean flgCurrCycDebitIsvalid) {
		getFlgCurrCycDebitIsvalidReference().setValue(flgCurrCycDebitIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCurrCycDebitNotOk.
	 * @return the flgCurrCycDebitNotOk attribute reference
	 */
	public ConditionReference getFlgCurrCycDebitNotOkReference() {
		return wsEditCurrCycDebit.getCondition(flgCurrCycDebitNotOk);	
	}

	/**
	 * Getter for flgCurrCycDebitNotOk attribute.
	 * @return flgCurrCycDebitNotOk attribute
	 */
	public boolean isFlgCurrCycDebitNotOk() {
		return getFlgCurrCycDebitNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCurrCycDebitNotOk attribute.
	 * @param flgCurrCycDebitNotOk the new value of flgCurrCycDebitNotOk
	 */
	public void setFlgCurrCycDebitNotOk(boolean flgCurrCycDebitNotOk) {
		getFlgCurrCycDebitNotOkReference().setValue(flgCurrCycDebitNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCurrCycDebitBlank.
	 * @return the flgCurrCycDebitBlank attribute reference
	 */
	public ConditionReference getFlgCurrCycDebitBlankReference() {
		return wsEditCurrCycDebit.getCondition(flgCurrCycDebitBlank);	
	}

	/**
	 * Getter for flgCurrCycDebitBlank attribute.
	 * @return flgCurrCycDebitBlank attribute
	 */
	public boolean isFlgCurrCycDebitBlank() {
		return getFlgCurrCycDebitBlankReference().getValue();	
	}

	/**
	 * Setter for flgCurrCycDebitBlank attribute.
	 * @param flgCurrCycDebitBlank the new value of flgCurrCycDebitBlank
	 */
	public void setFlgCurrCycDebitBlank(boolean flgCurrCycDebitBlank) {
		getFlgCurrCycDebitBlankReference().setValue(flgCurrCycDebitBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsEditDtOfBirthFlgs.
	 * @return the wsEditDtOfBirthFlgs attribute reference
	 */
	public RangeReference getWsEditDtOfBirthFlgsReference() {
		return wsEditDtOfBirthFlgs.getReference();
	}	
				
	/**
	 * Setter for wsEditDtOfBirthFlgs .
	 */
   	public void setWsEditDtOfBirthFlgs(RangeReference reference) {
       	wsEditDtOfBirthFlgs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditDtOfBirthInvalid.
	 * @return the wsEditDtOfBirthInvalid attribute reference
	 */
	public ConditionReference getWsEditDtOfBirthInvalidReference() {
		return wsEditDtOfBirthFlgs.getCondition(wsEditDtOfBirthInvalid);	
	}

	/**
	 * Getter for wsEditDtOfBirthInvalid attribute.
	 * @return wsEditDtOfBirthInvalid attribute
	 */
	public boolean isWsEditDtOfBirthInvalid() {
		return getWsEditDtOfBirthInvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditDtOfBirthInvalid attribute.
	 * @param wsEditDtOfBirthInvalid the new value of wsEditDtOfBirthInvalid
	 */
	public void setWsEditDtOfBirthInvalid(boolean wsEditDtOfBirthInvalid) {
		getWsEditDtOfBirthInvalidReference().setValue(wsEditDtOfBirthInvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditDtOfBirthIsvalid.
	 * @return the wsEditDtOfBirthIsvalid attribute reference
	 */
	public ConditionReference getWsEditDtOfBirthIsvalidReference() {
		return wsEditDtOfBirthFlgs.getCondition(wsEditDtOfBirthIsvalid);	
	}

	/**
	 * Getter for wsEditDtOfBirthIsvalid attribute.
	 * @return wsEditDtOfBirthIsvalid attribute
	 */
	public boolean isWsEditDtOfBirthIsvalid() {
		return getWsEditDtOfBirthIsvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditDtOfBirthIsvalid attribute.
	 * @param wsEditDtOfBirthIsvalid the new value of wsEditDtOfBirthIsvalid
	 */
	public void setWsEditDtOfBirthIsvalid(boolean wsEditDtOfBirthIsvalid) {
		getWsEditDtOfBirthIsvalidReference().setValue(wsEditDtOfBirthIsvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditDtOfBirthYearFlg.
	 * @return the wsEditDtOfBirthYearFlg attribute reference
	 */
	public ElementaryRangeReference getWsEditDtOfBirthYearFlgReference() {
		return wsEditDtOfBirthYearFlg.getReference();
	}

	/**
	 * Getter for wsEditDtOfBirthYearFlg attribute.
	 * @return wsEditDtOfBirthYearFlg attribute
	 */
	public String getWsEditDtOfBirthYearFlg() {
		return wsEditDtOfBirthYearFlg.getValue();
	}

	/**
	 * Setter for wsEditDtOfBirthYearFlg attribute.
	 * @param wsEditDtOfBirthYearFlg the new value of wsEditDtOfBirthYearFlg
	 */
	public void setWsEditDtOfBirthYearFlg(String wsEditDtOfBirthYearFlg) {
		this.wsEditDtOfBirthYearFlg.setValue(wsEditDtOfBirthYearFlg);
	}
	/**
	 * Gets the reference for attribute flgDtOfBirthYearIsvalid.
	 * @return the flgDtOfBirthYearIsvalid attribute reference
	 */
	public ConditionReference getFlgDtOfBirthYearIsvalidReference() {
		return wsEditDtOfBirthYearFlg.getCondition(flgDtOfBirthYearIsvalid);	
	}

	/**
	 * Getter for flgDtOfBirthYearIsvalid attribute.
	 * @return flgDtOfBirthYearIsvalid attribute
	 */
	public boolean isFlgDtOfBirthYearIsvalid() {
		return getFlgDtOfBirthYearIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgDtOfBirthYearIsvalid attribute.
	 * @param flgDtOfBirthYearIsvalid the new value of flgDtOfBirthYearIsvalid
	 */
	public void setFlgDtOfBirthYearIsvalid(boolean flgDtOfBirthYearIsvalid) {
		getFlgDtOfBirthYearIsvalidReference().setValue(flgDtOfBirthYearIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgDtOfBirthYearNotOk.
	 * @return the flgDtOfBirthYearNotOk attribute reference
	 */
	public ConditionReference getFlgDtOfBirthYearNotOkReference() {
		return wsEditDtOfBirthYearFlg.getCondition(flgDtOfBirthYearNotOk);	
	}

	/**
	 * Getter for flgDtOfBirthYearNotOk attribute.
	 * @return flgDtOfBirthYearNotOk attribute
	 */
	public boolean isFlgDtOfBirthYearNotOk() {
		return getFlgDtOfBirthYearNotOkReference().getValue();	
	}

	/**
	 * Setter for flgDtOfBirthYearNotOk attribute.
	 * @param flgDtOfBirthYearNotOk the new value of flgDtOfBirthYearNotOk
	 */
	public void setFlgDtOfBirthYearNotOk(boolean flgDtOfBirthYearNotOk) {
		getFlgDtOfBirthYearNotOkReference().setValue(flgDtOfBirthYearNotOk);	
	}
	/**
	 * Gets the reference for attribute flgDtOfBirthYearBlank.
	 * @return the flgDtOfBirthYearBlank attribute reference
	 */
	public ConditionReference getFlgDtOfBirthYearBlankReference() {
		return wsEditDtOfBirthYearFlg.getCondition(flgDtOfBirthYearBlank);	
	}

	/**
	 * Getter for flgDtOfBirthYearBlank attribute.
	 * @return flgDtOfBirthYearBlank attribute
	 */
	public boolean isFlgDtOfBirthYearBlank() {
		return getFlgDtOfBirthYearBlankReference().getValue();	
	}

	/**
	 * Setter for flgDtOfBirthYearBlank attribute.
	 * @param flgDtOfBirthYearBlank the new value of flgDtOfBirthYearBlank
	 */
	public void setFlgDtOfBirthYearBlank(boolean flgDtOfBirthYearBlank) {
		getFlgDtOfBirthYearBlankReference().setValue(flgDtOfBirthYearBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditDtOfBirthMonth.
	 * @return the wsEditDtOfBirthMonth attribute reference
	 */
	public ElementaryRangeReference getWsEditDtOfBirthMonthReference() {
		return wsEditDtOfBirthMonth.getReference();
	}

	/**
	 * Getter for wsEditDtOfBirthMonth attribute.
	 * @return wsEditDtOfBirthMonth attribute
	 */
	public String getWsEditDtOfBirthMonth() {
		return wsEditDtOfBirthMonth.getValue();
	}

	/**
	 * Setter for wsEditDtOfBirthMonth attribute.
	 * @param wsEditDtOfBirthMonth the new value of wsEditDtOfBirthMonth
	 */
	public void setWsEditDtOfBirthMonth(String wsEditDtOfBirthMonth) {
		this.wsEditDtOfBirthMonth.setValue(wsEditDtOfBirthMonth);
	}
	/**
	 * Gets the reference for attribute flgDtOfBirthMonthIsvalid.
	 * @return the flgDtOfBirthMonthIsvalid attribute reference
	 */
	public ConditionReference getFlgDtOfBirthMonthIsvalidReference() {
		return wsEditDtOfBirthMonth.getCondition(flgDtOfBirthMonthIsvalid);	
	}

	/**
	 * Getter for flgDtOfBirthMonthIsvalid attribute.
	 * @return flgDtOfBirthMonthIsvalid attribute
	 */
	public boolean isFlgDtOfBirthMonthIsvalid() {
		return getFlgDtOfBirthMonthIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgDtOfBirthMonthIsvalid attribute.
	 * @param flgDtOfBirthMonthIsvalid the new value of flgDtOfBirthMonthIsvalid
	 */
	public void setFlgDtOfBirthMonthIsvalid(boolean flgDtOfBirthMonthIsvalid) {
		getFlgDtOfBirthMonthIsvalidReference().setValue(flgDtOfBirthMonthIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgDtOfBirthMonthNotOk.
	 * @return the flgDtOfBirthMonthNotOk attribute reference
	 */
	public ConditionReference getFlgDtOfBirthMonthNotOkReference() {
		return wsEditDtOfBirthMonth.getCondition(flgDtOfBirthMonthNotOk);	
	}

	/**
	 * Getter for flgDtOfBirthMonthNotOk attribute.
	 * @return flgDtOfBirthMonthNotOk attribute
	 */
	public boolean isFlgDtOfBirthMonthNotOk() {
		return getFlgDtOfBirthMonthNotOkReference().getValue();	
	}

	/**
	 * Setter for flgDtOfBirthMonthNotOk attribute.
	 * @param flgDtOfBirthMonthNotOk the new value of flgDtOfBirthMonthNotOk
	 */
	public void setFlgDtOfBirthMonthNotOk(boolean flgDtOfBirthMonthNotOk) {
		getFlgDtOfBirthMonthNotOkReference().setValue(flgDtOfBirthMonthNotOk);	
	}
	/**
	 * Gets the reference for attribute flgDtOfBirthMonthBlank.
	 * @return the flgDtOfBirthMonthBlank attribute reference
	 */
	public ConditionReference getFlgDtOfBirthMonthBlankReference() {
		return wsEditDtOfBirthMonth.getCondition(flgDtOfBirthMonthBlank);	
	}

	/**
	 * Getter for flgDtOfBirthMonthBlank attribute.
	 * @return flgDtOfBirthMonthBlank attribute
	 */
	public boolean isFlgDtOfBirthMonthBlank() {
		return getFlgDtOfBirthMonthBlankReference().getValue();	
	}

	/**
	 * Setter for flgDtOfBirthMonthBlank attribute.
	 * @param flgDtOfBirthMonthBlank the new value of flgDtOfBirthMonthBlank
	 */
	public void setFlgDtOfBirthMonthBlank(boolean flgDtOfBirthMonthBlank) {
		getFlgDtOfBirthMonthBlankReference().setValue(flgDtOfBirthMonthBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditDtOfBirthDay.
	 * @return the wsEditDtOfBirthDay attribute reference
	 */
	public ElementaryRangeReference getWsEditDtOfBirthDayReference() {
		return wsEditDtOfBirthDay.getReference();
	}

	/**
	 * Getter for wsEditDtOfBirthDay attribute.
	 * @return wsEditDtOfBirthDay attribute
	 */
	public String getWsEditDtOfBirthDay() {
		return wsEditDtOfBirthDay.getValue();
	}

	/**
	 * Setter for wsEditDtOfBirthDay attribute.
	 * @param wsEditDtOfBirthDay the new value of wsEditDtOfBirthDay
	 */
	public void setWsEditDtOfBirthDay(String wsEditDtOfBirthDay) {
		this.wsEditDtOfBirthDay.setValue(wsEditDtOfBirthDay);
	}
	/**
	 * Gets the reference for attribute flgDtOfBirthDayIsvalid.
	 * @return the flgDtOfBirthDayIsvalid attribute reference
	 */
	public ConditionReference getFlgDtOfBirthDayIsvalidReference() {
		return wsEditDtOfBirthDay.getCondition(flgDtOfBirthDayIsvalid);	
	}

	/**
	 * Getter for flgDtOfBirthDayIsvalid attribute.
	 * @return flgDtOfBirthDayIsvalid attribute
	 */
	public boolean isFlgDtOfBirthDayIsvalid() {
		return getFlgDtOfBirthDayIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgDtOfBirthDayIsvalid attribute.
	 * @param flgDtOfBirthDayIsvalid the new value of flgDtOfBirthDayIsvalid
	 */
	public void setFlgDtOfBirthDayIsvalid(boolean flgDtOfBirthDayIsvalid) {
		getFlgDtOfBirthDayIsvalidReference().setValue(flgDtOfBirthDayIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgDtOfBirthDayNotOk.
	 * @return the flgDtOfBirthDayNotOk attribute reference
	 */
	public ConditionReference getFlgDtOfBirthDayNotOkReference() {
		return wsEditDtOfBirthDay.getCondition(flgDtOfBirthDayNotOk);	
	}

	/**
	 * Getter for flgDtOfBirthDayNotOk attribute.
	 * @return flgDtOfBirthDayNotOk attribute
	 */
	public boolean isFlgDtOfBirthDayNotOk() {
		return getFlgDtOfBirthDayNotOkReference().getValue();	
	}

	/**
	 * Setter for flgDtOfBirthDayNotOk attribute.
	 * @param flgDtOfBirthDayNotOk the new value of flgDtOfBirthDayNotOk
	 */
	public void setFlgDtOfBirthDayNotOk(boolean flgDtOfBirthDayNotOk) {
		getFlgDtOfBirthDayNotOkReference().setValue(flgDtOfBirthDayNotOk);	
	}
	/**
	 * Gets the reference for attribute flgDtOfBirthDayBlank.
	 * @return the flgDtOfBirthDayBlank attribute reference
	 */
	public ConditionReference getFlgDtOfBirthDayBlankReference() {
		return wsEditDtOfBirthDay.getCondition(flgDtOfBirthDayBlank);	
	}

	/**
	 * Getter for flgDtOfBirthDayBlank attribute.
	 * @return flgDtOfBirthDayBlank attribute
	 */
	public boolean isFlgDtOfBirthDayBlank() {
		return getFlgDtOfBirthDayBlankReference().getValue();	
	}

	/**
	 * Setter for flgDtOfBirthDayBlank attribute.
	 * @param flgDtOfBirthDayBlank the new value of flgDtOfBirthDayBlank
	 */
	public void setFlgDtOfBirthDayBlank(boolean flgDtOfBirthDayBlank) {
		getFlgDtOfBirthDayBlankReference().setValue(flgDtOfBirthDayBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditFicoScoreFlgs.
	 * @return the wsEditFicoScoreFlgs attribute reference
	 */
	public ElementaryRangeReference getWsEditFicoScoreFlgsReference() {
		return wsEditFicoScoreFlgs.getReference();
	}

	/**
	 * Getter for wsEditFicoScoreFlgs attribute.
	 * @return wsEditFicoScoreFlgs attribute
	 */
	public String getWsEditFicoScoreFlgs() {
		return wsEditFicoScoreFlgs.getValue();
	}

	/**
	 * Setter for wsEditFicoScoreFlgs attribute.
	 * @param wsEditFicoScoreFlgs the new value of wsEditFicoScoreFlgs
	 */
	public void setWsEditFicoScoreFlgs(String wsEditFicoScoreFlgs) {
		this.wsEditFicoScoreFlgs.setValue(wsEditFicoScoreFlgs);
	}
	/**
	 * Gets the reference for attribute flgFicoScoreIsvalid.
	 * @return the flgFicoScoreIsvalid attribute reference
	 */
	public ConditionReference getFlgFicoScoreIsvalidReference() {
		return wsEditFicoScoreFlgs.getCondition(flgFicoScoreIsvalid);	
	}

	/**
	 * Getter for flgFicoScoreIsvalid attribute.
	 * @return flgFicoScoreIsvalid attribute
	 */
	public boolean isFlgFicoScoreIsvalid() {
		return getFlgFicoScoreIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgFicoScoreIsvalid attribute.
	 * @param flgFicoScoreIsvalid the new value of flgFicoScoreIsvalid
	 */
	public void setFlgFicoScoreIsvalid(boolean flgFicoScoreIsvalid) {
		getFlgFicoScoreIsvalidReference().setValue(flgFicoScoreIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgFicoScoreNotOk.
	 * @return the flgFicoScoreNotOk attribute reference
	 */
	public ConditionReference getFlgFicoScoreNotOkReference() {
		return wsEditFicoScoreFlgs.getCondition(flgFicoScoreNotOk);	
	}

	/**
	 * Getter for flgFicoScoreNotOk attribute.
	 * @return flgFicoScoreNotOk attribute
	 */
	public boolean isFlgFicoScoreNotOk() {
		return getFlgFicoScoreNotOkReference().getValue();	
	}

	/**
	 * Setter for flgFicoScoreNotOk attribute.
	 * @param flgFicoScoreNotOk the new value of flgFicoScoreNotOk
	 */
	public void setFlgFicoScoreNotOk(boolean flgFicoScoreNotOk) {
		getFlgFicoScoreNotOkReference().setValue(flgFicoScoreNotOk);	
	}
	/**
	 * Gets the reference for attribute flgFicoScoreBlank.
	 * @return the flgFicoScoreBlank attribute reference
	 */
	public ConditionReference getFlgFicoScoreBlankReference() {
		return wsEditFicoScoreFlgs.getCondition(flgFicoScoreBlank);	
	}

	/**
	 * Getter for flgFicoScoreBlank attribute.
	 * @return flgFicoScoreBlank attribute
	 */
	public boolean isFlgFicoScoreBlank() {
		return getFlgFicoScoreBlankReference().getValue();	
	}

	/**
	 * Setter for flgFicoScoreBlank attribute.
	 * @param flgFicoScoreBlank the new value of flgFicoScoreBlank
	 */
	public void setFlgFicoScoreBlank(boolean flgFicoScoreBlank) {
		getFlgFicoScoreBlankReference().setValue(flgFicoScoreBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsEditOpenDateFlgs.
	 * @return the wsEditOpenDateFlgs attribute reference
	 */
	public RangeReference getWsEditOpenDateFlgsReference() {
		return wsEditOpenDateFlgs.getReference();
	}	
				
	/**
	 * Setter for wsEditOpenDateFlgs .
	 */
   	public void setWsEditOpenDateFlgs(RangeReference reference) {
       	wsEditOpenDateFlgs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditOpenDateIsInvalid.
	 * @return the wsEditOpenDateIsInvalid attribute reference
	 */
	public ConditionReference getWsEditOpenDateIsInvalidReference() {
		return wsEditOpenDateFlgs.getCondition(wsEditOpenDateIsInvalid);	
	}

	/**
	 * Getter for wsEditOpenDateIsInvalid attribute.
	 * @return wsEditOpenDateIsInvalid attribute
	 */
	public boolean isWsEditOpenDateIsInvalid() {
		return getWsEditOpenDateIsInvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditOpenDateIsInvalid attribute.
	 * @param wsEditOpenDateIsInvalid the new value of wsEditOpenDateIsInvalid
	 */
	public void setWsEditOpenDateIsInvalid(boolean wsEditOpenDateIsInvalid) {
		getWsEditOpenDateIsInvalidReference().setValue(wsEditOpenDateIsInvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditOpenYearFlg.
	 * @return the wsEditOpenYearFlg attribute reference
	 */
	public ElementaryRangeReference getWsEditOpenYearFlgReference() {
		return wsEditOpenYearFlg.getReference();
	}

	/**
	 * Getter for wsEditOpenYearFlg attribute.
	 * @return wsEditOpenYearFlg attribute
	 */
	public String getWsEditOpenYearFlg() {
		return wsEditOpenYearFlg.getValue();
	}

	/**
	 * Setter for wsEditOpenYearFlg attribute.
	 * @param wsEditOpenYearFlg the new value of wsEditOpenYearFlg
	 */
	public void setWsEditOpenYearFlg(String wsEditOpenYearFlg) {
		this.wsEditOpenYearFlg.setValue(wsEditOpenYearFlg);
	}
	/**
	 * Gets the reference for attribute flgOpenYearIsvalid.
	 * @return the flgOpenYearIsvalid attribute reference
	 */
	public ConditionReference getFlgOpenYearIsvalidReference() {
		return wsEditOpenYearFlg.getCondition(flgOpenYearIsvalid);	
	}

	/**
	 * Getter for flgOpenYearIsvalid attribute.
	 * @return flgOpenYearIsvalid attribute
	 */
	public boolean isFlgOpenYearIsvalid() {
		return getFlgOpenYearIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgOpenYearIsvalid attribute.
	 * @param flgOpenYearIsvalid the new value of flgOpenYearIsvalid
	 */
	public void setFlgOpenYearIsvalid(boolean flgOpenYearIsvalid) {
		getFlgOpenYearIsvalidReference().setValue(flgOpenYearIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgOpenYearNotOk.
	 * @return the flgOpenYearNotOk attribute reference
	 */
	public ConditionReference getFlgOpenYearNotOkReference() {
		return wsEditOpenYearFlg.getCondition(flgOpenYearNotOk);	
	}

	/**
	 * Getter for flgOpenYearNotOk attribute.
	 * @return flgOpenYearNotOk attribute
	 */
	public boolean isFlgOpenYearNotOk() {
		return getFlgOpenYearNotOkReference().getValue();	
	}

	/**
	 * Setter for flgOpenYearNotOk attribute.
	 * @param flgOpenYearNotOk the new value of flgOpenYearNotOk
	 */
	public void setFlgOpenYearNotOk(boolean flgOpenYearNotOk) {
		getFlgOpenYearNotOkReference().setValue(flgOpenYearNotOk);	
	}
	/**
	 * Gets the reference for attribute flgOpenYearBlank.
	 * @return the flgOpenYearBlank attribute reference
	 */
	public ConditionReference getFlgOpenYearBlankReference() {
		return wsEditOpenYearFlg.getCondition(flgOpenYearBlank);	
	}

	/**
	 * Getter for flgOpenYearBlank attribute.
	 * @return flgOpenYearBlank attribute
	 */
	public boolean isFlgOpenYearBlank() {
		return getFlgOpenYearBlankReference().getValue();	
	}

	/**
	 * Setter for flgOpenYearBlank attribute.
	 * @param flgOpenYearBlank the new value of flgOpenYearBlank
	 */
	public void setFlgOpenYearBlank(boolean flgOpenYearBlank) {
		getFlgOpenYearBlankReference().setValue(flgOpenYearBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditOpenMonth.
	 * @return the wsEditOpenMonth attribute reference
	 */
	public ElementaryRangeReference getWsEditOpenMonthReference() {
		return wsEditOpenMonth.getReference();
	}

	/**
	 * Getter for wsEditOpenMonth attribute.
	 * @return wsEditOpenMonth attribute
	 */
	public String getWsEditOpenMonth() {
		return wsEditOpenMonth.getValue();
	}

	/**
	 * Setter for wsEditOpenMonth attribute.
	 * @param wsEditOpenMonth the new value of wsEditOpenMonth
	 */
	public void setWsEditOpenMonth(String wsEditOpenMonth) {
		this.wsEditOpenMonth.setValue(wsEditOpenMonth);
	}
	/**
	 * Gets the reference for attribute flgOpenMonthIsvalid.
	 * @return the flgOpenMonthIsvalid attribute reference
	 */
	public ConditionReference getFlgOpenMonthIsvalidReference() {
		return wsEditOpenMonth.getCondition(flgOpenMonthIsvalid);	
	}

	/**
	 * Getter for flgOpenMonthIsvalid attribute.
	 * @return flgOpenMonthIsvalid attribute
	 */
	public boolean isFlgOpenMonthIsvalid() {
		return getFlgOpenMonthIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgOpenMonthIsvalid attribute.
	 * @param flgOpenMonthIsvalid the new value of flgOpenMonthIsvalid
	 */
	public void setFlgOpenMonthIsvalid(boolean flgOpenMonthIsvalid) {
		getFlgOpenMonthIsvalidReference().setValue(flgOpenMonthIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgOpenMonthNotOk.
	 * @return the flgOpenMonthNotOk attribute reference
	 */
	public ConditionReference getFlgOpenMonthNotOkReference() {
		return wsEditOpenMonth.getCondition(flgOpenMonthNotOk);	
	}

	/**
	 * Getter for flgOpenMonthNotOk attribute.
	 * @return flgOpenMonthNotOk attribute
	 */
	public boolean isFlgOpenMonthNotOk() {
		return getFlgOpenMonthNotOkReference().getValue();	
	}

	/**
	 * Setter for flgOpenMonthNotOk attribute.
	 * @param flgOpenMonthNotOk the new value of flgOpenMonthNotOk
	 */
	public void setFlgOpenMonthNotOk(boolean flgOpenMonthNotOk) {
		getFlgOpenMonthNotOkReference().setValue(flgOpenMonthNotOk);	
	}
	/**
	 * Gets the reference for attribute flgOpenMonthBlank.
	 * @return the flgOpenMonthBlank attribute reference
	 */
	public ConditionReference getFlgOpenMonthBlankReference() {
		return wsEditOpenMonth.getCondition(flgOpenMonthBlank);	
	}

	/**
	 * Getter for flgOpenMonthBlank attribute.
	 * @return flgOpenMonthBlank attribute
	 */
	public boolean isFlgOpenMonthBlank() {
		return getFlgOpenMonthBlankReference().getValue();	
	}

	/**
	 * Setter for flgOpenMonthBlank attribute.
	 * @param flgOpenMonthBlank the new value of flgOpenMonthBlank
	 */
	public void setFlgOpenMonthBlank(boolean flgOpenMonthBlank) {
		getFlgOpenMonthBlankReference().setValue(flgOpenMonthBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditOpenDay.
	 * @return the wsEditOpenDay attribute reference
	 */
	public ElementaryRangeReference getWsEditOpenDayReference() {
		return wsEditOpenDay.getReference();
	}

	/**
	 * Getter for wsEditOpenDay attribute.
	 * @return wsEditOpenDay attribute
	 */
	public String getWsEditOpenDay() {
		return wsEditOpenDay.getValue();
	}

	/**
	 * Setter for wsEditOpenDay attribute.
	 * @param wsEditOpenDay the new value of wsEditOpenDay
	 */
	public void setWsEditOpenDay(String wsEditOpenDay) {
		this.wsEditOpenDay.setValue(wsEditOpenDay);
	}
	/**
	 * Gets the reference for attribute flgOpenDayIsvalid.
	 * @return the flgOpenDayIsvalid attribute reference
	 */
	public ConditionReference getFlgOpenDayIsvalidReference() {
		return wsEditOpenDay.getCondition(flgOpenDayIsvalid);	
	}

	/**
	 * Getter for flgOpenDayIsvalid attribute.
	 * @return flgOpenDayIsvalid attribute
	 */
	public boolean isFlgOpenDayIsvalid() {
		return getFlgOpenDayIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgOpenDayIsvalid attribute.
	 * @param flgOpenDayIsvalid the new value of flgOpenDayIsvalid
	 */
	public void setFlgOpenDayIsvalid(boolean flgOpenDayIsvalid) {
		getFlgOpenDayIsvalidReference().setValue(flgOpenDayIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgOpenDayNotOk.
	 * @return the flgOpenDayNotOk attribute reference
	 */
	public ConditionReference getFlgOpenDayNotOkReference() {
		return wsEditOpenDay.getCondition(flgOpenDayNotOk);	
	}

	/**
	 * Getter for flgOpenDayNotOk attribute.
	 * @return flgOpenDayNotOk attribute
	 */
	public boolean isFlgOpenDayNotOk() {
		return getFlgOpenDayNotOkReference().getValue();	
	}

	/**
	 * Setter for flgOpenDayNotOk attribute.
	 * @param flgOpenDayNotOk the new value of flgOpenDayNotOk
	 */
	public void setFlgOpenDayNotOk(boolean flgOpenDayNotOk) {
		getFlgOpenDayNotOkReference().setValue(flgOpenDayNotOk);	
	}
	/**
	 * Gets the reference for attribute flgOpenDayBlank.
	 * @return the flgOpenDayBlank attribute reference
	 */
	public ConditionReference getFlgOpenDayBlankReference() {
		return wsEditOpenDay.getCondition(flgOpenDayBlank);	
	}

	/**
	 * Getter for flgOpenDayBlank attribute.
	 * @return flgOpenDayBlank attribute
	 */
	public boolean isFlgOpenDayBlank() {
		return getFlgOpenDayBlankReference().getValue();	
	}

	/**
	 * Setter for flgOpenDayBlank attribute.
	 * @param flgOpenDayBlank the new value of flgOpenDayBlank
	 */
	public void setFlgOpenDayBlank(boolean flgOpenDayBlank) {
		getFlgOpenDayBlankReference().setValue(flgOpenDayBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsExpiryDateFlgs.
	 * @return the wsExpiryDateFlgs attribute reference
	 */
	public RangeReference getWsExpiryDateFlgsReference() {
		return wsExpiryDateFlgs.getReference();
	}	
				
	/**
	 * Setter for wsExpiryDateFlgs .
	 */
   	public void setWsExpiryDateFlgs(RangeReference reference) {
       	wsExpiryDateFlgs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditExpiryIsInvalid.
	 * @return the wsEditExpiryIsInvalid attribute reference
	 */
	public ConditionReference getWsEditExpiryIsInvalidReference() {
		return wsExpiryDateFlgs.getCondition(wsEditExpiryIsInvalid);	
	}

	/**
	 * Getter for wsEditExpiryIsInvalid attribute.
	 * @return wsEditExpiryIsInvalid attribute
	 */
	public boolean isWsEditExpiryIsInvalid() {
		return getWsEditExpiryIsInvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditExpiryIsInvalid attribute.
	 * @param wsEditExpiryIsInvalid the new value of wsEditExpiryIsInvalid
	 */
	public void setWsEditExpiryIsInvalid(boolean wsEditExpiryIsInvalid) {
		getWsEditExpiryIsInvalidReference().setValue(wsEditExpiryIsInvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditExpiryYearFlg.
	 * @return the wsEditExpiryYearFlg attribute reference
	 */
	public ElementaryRangeReference getWsEditExpiryYearFlgReference() {
		return wsEditExpiryYearFlg.getReference();
	}

	/**
	 * Getter for wsEditExpiryYearFlg attribute.
	 * @return wsEditExpiryYearFlg attribute
	 */
	public String getWsEditExpiryYearFlg() {
		return wsEditExpiryYearFlg.getValue();
	}

	/**
	 * Setter for wsEditExpiryYearFlg attribute.
	 * @param wsEditExpiryYearFlg the new value of wsEditExpiryYearFlg
	 */
	public void setWsEditExpiryYearFlg(String wsEditExpiryYearFlg) {
		this.wsEditExpiryYearFlg.setValue(wsEditExpiryYearFlg);
	}
	/**
	 * Gets the reference for attribute flgExpiryYearIsvalid.
	 * @return the flgExpiryYearIsvalid attribute reference
	 */
	public ConditionReference getFlgExpiryYearIsvalidReference() {
		return wsEditExpiryYearFlg.getCondition(flgExpiryYearIsvalid);	
	}

	/**
	 * Getter for flgExpiryYearIsvalid attribute.
	 * @return flgExpiryYearIsvalid attribute
	 */
	public boolean isFlgExpiryYearIsvalid() {
		return getFlgExpiryYearIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgExpiryYearIsvalid attribute.
	 * @param flgExpiryYearIsvalid the new value of flgExpiryYearIsvalid
	 */
	public void setFlgExpiryYearIsvalid(boolean flgExpiryYearIsvalid) {
		getFlgExpiryYearIsvalidReference().setValue(flgExpiryYearIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgExpiryYearNotOk.
	 * @return the flgExpiryYearNotOk attribute reference
	 */
	public ConditionReference getFlgExpiryYearNotOkReference() {
		return wsEditExpiryYearFlg.getCondition(flgExpiryYearNotOk);	
	}

	/**
	 * Getter for flgExpiryYearNotOk attribute.
	 * @return flgExpiryYearNotOk attribute
	 */
	public boolean isFlgExpiryYearNotOk() {
		return getFlgExpiryYearNotOkReference().getValue();	
	}

	/**
	 * Setter for flgExpiryYearNotOk attribute.
	 * @param flgExpiryYearNotOk the new value of flgExpiryYearNotOk
	 */
	public void setFlgExpiryYearNotOk(boolean flgExpiryYearNotOk) {
		getFlgExpiryYearNotOkReference().setValue(flgExpiryYearNotOk);	
	}
	/**
	 * Gets the reference for attribute flgExpiryYearBlank.
	 * @return the flgExpiryYearBlank attribute reference
	 */
	public ConditionReference getFlgExpiryYearBlankReference() {
		return wsEditExpiryYearFlg.getCondition(flgExpiryYearBlank);	
	}

	/**
	 * Getter for flgExpiryYearBlank attribute.
	 * @return flgExpiryYearBlank attribute
	 */
	public boolean isFlgExpiryYearBlank() {
		return getFlgExpiryYearBlankReference().getValue();	
	}

	/**
	 * Setter for flgExpiryYearBlank attribute.
	 * @param flgExpiryYearBlank the new value of flgExpiryYearBlank
	 */
	public void setFlgExpiryYearBlank(boolean flgExpiryYearBlank) {
		getFlgExpiryYearBlankReference().setValue(flgExpiryYearBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditExpiryMonth.
	 * @return the wsEditExpiryMonth attribute reference
	 */
	public ElementaryRangeReference getWsEditExpiryMonthReference() {
		return wsEditExpiryMonth.getReference();
	}

	/**
	 * Getter for wsEditExpiryMonth attribute.
	 * @return wsEditExpiryMonth attribute
	 */
	public String getWsEditExpiryMonth() {
		return wsEditExpiryMonth.getValue();
	}

	/**
	 * Setter for wsEditExpiryMonth attribute.
	 * @param wsEditExpiryMonth the new value of wsEditExpiryMonth
	 */
	public void setWsEditExpiryMonth(String wsEditExpiryMonth) {
		this.wsEditExpiryMonth.setValue(wsEditExpiryMonth);
	}
	/**
	 * Gets the reference for attribute flgExpiryMonthIsvalid.
	 * @return the flgExpiryMonthIsvalid attribute reference
	 */
	public ConditionReference getFlgExpiryMonthIsvalidReference() {
		return wsEditExpiryMonth.getCondition(flgExpiryMonthIsvalid);	
	}

	/**
	 * Getter for flgExpiryMonthIsvalid attribute.
	 * @return flgExpiryMonthIsvalid attribute
	 */
	public boolean isFlgExpiryMonthIsvalid() {
		return getFlgExpiryMonthIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgExpiryMonthIsvalid attribute.
	 * @param flgExpiryMonthIsvalid the new value of flgExpiryMonthIsvalid
	 */
	public void setFlgExpiryMonthIsvalid(boolean flgExpiryMonthIsvalid) {
		getFlgExpiryMonthIsvalidReference().setValue(flgExpiryMonthIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgExpiryMonthNotOk.
	 * @return the flgExpiryMonthNotOk attribute reference
	 */
	public ConditionReference getFlgExpiryMonthNotOkReference() {
		return wsEditExpiryMonth.getCondition(flgExpiryMonthNotOk);	
	}

	/**
	 * Getter for flgExpiryMonthNotOk attribute.
	 * @return flgExpiryMonthNotOk attribute
	 */
	public boolean isFlgExpiryMonthNotOk() {
		return getFlgExpiryMonthNotOkReference().getValue();	
	}

	/**
	 * Setter for flgExpiryMonthNotOk attribute.
	 * @param flgExpiryMonthNotOk the new value of flgExpiryMonthNotOk
	 */
	public void setFlgExpiryMonthNotOk(boolean flgExpiryMonthNotOk) {
		getFlgExpiryMonthNotOkReference().setValue(flgExpiryMonthNotOk);	
	}
	/**
	 * Gets the reference for attribute flgExpiryMonthBlank.
	 * @return the flgExpiryMonthBlank attribute reference
	 */
	public ConditionReference getFlgExpiryMonthBlankReference() {
		return wsEditExpiryMonth.getCondition(flgExpiryMonthBlank);	
	}

	/**
	 * Getter for flgExpiryMonthBlank attribute.
	 * @return flgExpiryMonthBlank attribute
	 */
	public boolean isFlgExpiryMonthBlank() {
		return getFlgExpiryMonthBlankReference().getValue();	
	}

	/**
	 * Setter for flgExpiryMonthBlank attribute.
	 * @param flgExpiryMonthBlank the new value of flgExpiryMonthBlank
	 */
	public void setFlgExpiryMonthBlank(boolean flgExpiryMonthBlank) {
		getFlgExpiryMonthBlankReference().setValue(flgExpiryMonthBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditExpiryDay.
	 * @return the wsEditExpiryDay attribute reference
	 */
	public ElementaryRangeReference getWsEditExpiryDayReference() {
		return wsEditExpiryDay.getReference();
	}

	/**
	 * Getter for wsEditExpiryDay attribute.
	 * @return wsEditExpiryDay attribute
	 */
	public String getWsEditExpiryDay() {
		return wsEditExpiryDay.getValue();
	}

	/**
	 * Setter for wsEditExpiryDay attribute.
	 * @param wsEditExpiryDay the new value of wsEditExpiryDay
	 */
	public void setWsEditExpiryDay(String wsEditExpiryDay) {
		this.wsEditExpiryDay.setValue(wsEditExpiryDay);
	}
	/**
	 * Gets the reference for attribute flgExpiryDayIsvalid.
	 * @return the flgExpiryDayIsvalid attribute reference
	 */
	public ConditionReference getFlgExpiryDayIsvalidReference() {
		return wsEditExpiryDay.getCondition(flgExpiryDayIsvalid);	
	}

	/**
	 * Getter for flgExpiryDayIsvalid attribute.
	 * @return flgExpiryDayIsvalid attribute
	 */
	public boolean isFlgExpiryDayIsvalid() {
		return getFlgExpiryDayIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgExpiryDayIsvalid attribute.
	 * @param flgExpiryDayIsvalid the new value of flgExpiryDayIsvalid
	 */
	public void setFlgExpiryDayIsvalid(boolean flgExpiryDayIsvalid) {
		getFlgExpiryDayIsvalidReference().setValue(flgExpiryDayIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgExpiryDayNotOk.
	 * @return the flgExpiryDayNotOk attribute reference
	 */
	public ConditionReference getFlgExpiryDayNotOkReference() {
		return wsEditExpiryDay.getCondition(flgExpiryDayNotOk);	
	}

	/**
	 * Getter for flgExpiryDayNotOk attribute.
	 * @return flgExpiryDayNotOk attribute
	 */
	public boolean isFlgExpiryDayNotOk() {
		return getFlgExpiryDayNotOkReference().getValue();	
	}

	/**
	 * Setter for flgExpiryDayNotOk attribute.
	 * @param flgExpiryDayNotOk the new value of flgExpiryDayNotOk
	 */
	public void setFlgExpiryDayNotOk(boolean flgExpiryDayNotOk) {
		getFlgExpiryDayNotOkReference().setValue(flgExpiryDayNotOk);	
	}
	/**
	 * Gets the reference for attribute flgExpiryDayBlank.
	 * @return the flgExpiryDayBlank attribute reference
	 */
	public ConditionReference getFlgExpiryDayBlankReference() {
		return wsEditExpiryDay.getCondition(flgExpiryDayBlank);	
	}

	/**
	 * Getter for flgExpiryDayBlank attribute.
	 * @return flgExpiryDayBlank attribute
	 */
	public boolean isFlgExpiryDayBlank() {
		return getFlgExpiryDayBlankReference().getValue();	
	}

	/**
	 * Setter for flgExpiryDayBlank attribute.
	 * @param flgExpiryDayBlank the new value of flgExpiryDayBlank
	 */
	public void setFlgExpiryDayBlank(boolean flgExpiryDayBlank) {
		getFlgExpiryDayBlankReference().setValue(flgExpiryDayBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsEditReissueDateFlgs.
	 * @return the wsEditReissueDateFlgs attribute reference
	 */
	public RangeReference getWsEditReissueDateFlgsReference() {
		return wsEditReissueDateFlgs.getReference();
	}	
				
	/**
	 * Setter for wsEditReissueDateFlgs .
	 */
   	public void setWsEditReissueDateFlgs(RangeReference reference) {
       	wsEditReissueDateFlgs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditReissueDateInvalid.
	 * @return the wsEditReissueDateInvalid attribute reference
	 */
	public ConditionReference getWsEditReissueDateInvalidReference() {
		return wsEditReissueDateFlgs.getCondition(wsEditReissueDateInvalid);	
	}

	/**
	 * Getter for wsEditReissueDateInvalid attribute.
	 * @return wsEditReissueDateInvalid attribute
	 */
	public boolean isWsEditReissueDateInvalid() {
		return getWsEditReissueDateInvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditReissueDateInvalid attribute.
	 * @param wsEditReissueDateInvalid the new value of wsEditReissueDateInvalid
	 */
	public void setWsEditReissueDateInvalid(boolean wsEditReissueDateInvalid) {
		getWsEditReissueDateInvalidReference().setValue(wsEditReissueDateInvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditReissueYearFlg.
	 * @return the wsEditReissueYearFlg attribute reference
	 */
	public ElementaryRangeReference getWsEditReissueYearFlgReference() {
		return wsEditReissueYearFlg.getReference();
	}

	/**
	 * Getter for wsEditReissueYearFlg attribute.
	 * @return wsEditReissueYearFlg attribute
	 */
	public String getWsEditReissueYearFlg() {
		return wsEditReissueYearFlg.getValue();
	}

	/**
	 * Setter for wsEditReissueYearFlg attribute.
	 * @param wsEditReissueYearFlg the new value of wsEditReissueYearFlg
	 */
	public void setWsEditReissueYearFlg(String wsEditReissueYearFlg) {
		this.wsEditReissueYearFlg.setValue(wsEditReissueYearFlg);
	}
	/**
	 * Gets the reference for attribute flgReissueYearIsvalid.
	 * @return the flgReissueYearIsvalid attribute reference
	 */
	public ConditionReference getFlgReissueYearIsvalidReference() {
		return wsEditReissueYearFlg.getCondition(flgReissueYearIsvalid);	
	}

	/**
	 * Getter for flgReissueYearIsvalid attribute.
	 * @return flgReissueYearIsvalid attribute
	 */
	public boolean isFlgReissueYearIsvalid() {
		return getFlgReissueYearIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgReissueYearIsvalid attribute.
	 * @param flgReissueYearIsvalid the new value of flgReissueYearIsvalid
	 */
	public void setFlgReissueYearIsvalid(boolean flgReissueYearIsvalid) {
		getFlgReissueYearIsvalidReference().setValue(flgReissueYearIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgReissueYearNotOk.
	 * @return the flgReissueYearNotOk attribute reference
	 */
	public ConditionReference getFlgReissueYearNotOkReference() {
		return wsEditReissueYearFlg.getCondition(flgReissueYearNotOk);	
	}

	/**
	 * Getter for flgReissueYearNotOk attribute.
	 * @return flgReissueYearNotOk attribute
	 */
	public boolean isFlgReissueYearNotOk() {
		return getFlgReissueYearNotOkReference().getValue();	
	}

	/**
	 * Setter for flgReissueYearNotOk attribute.
	 * @param flgReissueYearNotOk the new value of flgReissueYearNotOk
	 */
	public void setFlgReissueYearNotOk(boolean flgReissueYearNotOk) {
		getFlgReissueYearNotOkReference().setValue(flgReissueYearNotOk);	
	}
	/**
	 * Gets the reference for attribute flgReissueYearBlank.
	 * @return the flgReissueYearBlank attribute reference
	 */
	public ConditionReference getFlgReissueYearBlankReference() {
		return wsEditReissueYearFlg.getCondition(flgReissueYearBlank);	
	}

	/**
	 * Getter for flgReissueYearBlank attribute.
	 * @return flgReissueYearBlank attribute
	 */
	public boolean isFlgReissueYearBlank() {
		return getFlgReissueYearBlankReference().getValue();	
	}

	/**
	 * Setter for flgReissueYearBlank attribute.
	 * @param flgReissueYearBlank the new value of flgReissueYearBlank
	 */
	public void setFlgReissueYearBlank(boolean flgReissueYearBlank) {
		getFlgReissueYearBlankReference().setValue(flgReissueYearBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditReissueMonth.
	 * @return the wsEditReissueMonth attribute reference
	 */
	public ElementaryRangeReference getWsEditReissueMonthReference() {
		return wsEditReissueMonth.getReference();
	}

	/**
	 * Getter for wsEditReissueMonth attribute.
	 * @return wsEditReissueMonth attribute
	 */
	public String getWsEditReissueMonth() {
		return wsEditReissueMonth.getValue();
	}

	/**
	 * Setter for wsEditReissueMonth attribute.
	 * @param wsEditReissueMonth the new value of wsEditReissueMonth
	 */
	public void setWsEditReissueMonth(String wsEditReissueMonth) {
		this.wsEditReissueMonth.setValue(wsEditReissueMonth);
	}
	/**
	 * Gets the reference for attribute flgReissueMonthIsvalid.
	 * @return the flgReissueMonthIsvalid attribute reference
	 */
	public ConditionReference getFlgReissueMonthIsvalidReference() {
		return wsEditReissueMonth.getCondition(flgReissueMonthIsvalid);	
	}

	/**
	 * Getter for flgReissueMonthIsvalid attribute.
	 * @return flgReissueMonthIsvalid attribute
	 */
	public boolean isFlgReissueMonthIsvalid() {
		return getFlgReissueMonthIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgReissueMonthIsvalid attribute.
	 * @param flgReissueMonthIsvalid the new value of flgReissueMonthIsvalid
	 */
	public void setFlgReissueMonthIsvalid(boolean flgReissueMonthIsvalid) {
		getFlgReissueMonthIsvalidReference().setValue(flgReissueMonthIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgReissueMonthNotOk.
	 * @return the flgReissueMonthNotOk attribute reference
	 */
	public ConditionReference getFlgReissueMonthNotOkReference() {
		return wsEditReissueMonth.getCondition(flgReissueMonthNotOk);	
	}

	/**
	 * Getter for flgReissueMonthNotOk attribute.
	 * @return flgReissueMonthNotOk attribute
	 */
	public boolean isFlgReissueMonthNotOk() {
		return getFlgReissueMonthNotOkReference().getValue();	
	}

	/**
	 * Setter for flgReissueMonthNotOk attribute.
	 * @param flgReissueMonthNotOk the new value of flgReissueMonthNotOk
	 */
	public void setFlgReissueMonthNotOk(boolean flgReissueMonthNotOk) {
		getFlgReissueMonthNotOkReference().setValue(flgReissueMonthNotOk);	
	}
	/**
	 * Gets the reference for attribute flgReissueMonthBlank.
	 * @return the flgReissueMonthBlank attribute reference
	 */
	public ConditionReference getFlgReissueMonthBlankReference() {
		return wsEditReissueMonth.getCondition(flgReissueMonthBlank);	
	}

	/**
	 * Getter for flgReissueMonthBlank attribute.
	 * @return flgReissueMonthBlank attribute
	 */
	public boolean isFlgReissueMonthBlank() {
		return getFlgReissueMonthBlankReference().getValue();	
	}

	/**
	 * Setter for flgReissueMonthBlank attribute.
	 * @param flgReissueMonthBlank the new value of flgReissueMonthBlank
	 */
	public void setFlgReissueMonthBlank(boolean flgReissueMonthBlank) {
		getFlgReissueMonthBlankReference().setValue(flgReissueMonthBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditReissueDay.
	 * @return the wsEditReissueDay attribute reference
	 */
	public ElementaryRangeReference getWsEditReissueDayReference() {
		return wsEditReissueDay.getReference();
	}

	/**
	 * Getter for wsEditReissueDay attribute.
	 * @return wsEditReissueDay attribute
	 */
	public String getWsEditReissueDay() {
		return wsEditReissueDay.getValue();
	}

	/**
	 * Setter for wsEditReissueDay attribute.
	 * @param wsEditReissueDay the new value of wsEditReissueDay
	 */
	public void setWsEditReissueDay(String wsEditReissueDay) {
		this.wsEditReissueDay.setValue(wsEditReissueDay);
	}
	/**
	 * Gets the reference for attribute flgReissueDayIsvalid.
	 * @return the flgReissueDayIsvalid attribute reference
	 */
	public ConditionReference getFlgReissueDayIsvalidReference() {
		return wsEditReissueDay.getCondition(flgReissueDayIsvalid);	
	}

	/**
	 * Getter for flgReissueDayIsvalid attribute.
	 * @return flgReissueDayIsvalid attribute
	 */
	public boolean isFlgReissueDayIsvalid() {
		return getFlgReissueDayIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgReissueDayIsvalid attribute.
	 * @param flgReissueDayIsvalid the new value of flgReissueDayIsvalid
	 */
	public void setFlgReissueDayIsvalid(boolean flgReissueDayIsvalid) {
		getFlgReissueDayIsvalidReference().setValue(flgReissueDayIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgReissueDayNotOk.
	 * @return the flgReissueDayNotOk attribute reference
	 */
	public ConditionReference getFlgReissueDayNotOkReference() {
		return wsEditReissueDay.getCondition(flgReissueDayNotOk);	
	}

	/**
	 * Getter for flgReissueDayNotOk attribute.
	 * @return flgReissueDayNotOk attribute
	 */
	public boolean isFlgReissueDayNotOk() {
		return getFlgReissueDayNotOkReference().getValue();	
	}

	/**
	 * Setter for flgReissueDayNotOk attribute.
	 * @param flgReissueDayNotOk the new value of flgReissueDayNotOk
	 */
	public void setFlgReissueDayNotOk(boolean flgReissueDayNotOk) {
		getFlgReissueDayNotOkReference().setValue(flgReissueDayNotOk);	
	}
	/**
	 * Gets the reference for attribute flgReissueDayBlank.
	 * @return the flgReissueDayBlank attribute reference
	 */
	public ConditionReference getFlgReissueDayBlankReference() {
		return wsEditReissueDay.getCondition(flgReissueDayBlank);	
	}

	/**
	 * Getter for flgReissueDayBlank attribute.
	 * @return flgReissueDayBlank attribute
	 */
	public boolean isFlgReissueDayBlank() {
		return getFlgReissueDayBlankReference().getValue();	
	}

	/**
	 * Setter for flgReissueDayBlank attribute.
	 * @param flgReissueDayBlank the new value of flgReissueDayBlank
	 */
	public void setFlgReissueDayBlank(boolean flgReissueDayBlank) {
		getFlgReissueDayBlankReference().setValue(flgReissueDayBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsEditNameFlags.
	 * @return the wsEditNameFlags attribute reference
	 */
	public RangeReference getWsEditNameFlagsReference() {
		return wsEditNameFlags.getReference();
	}	
				
	/**
	 * Setter for wsEditNameFlags .
	 */
   	public void setWsEditNameFlags(RangeReference reference) {
       	wsEditNameFlags.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditFirstNameFlgs.
	 * @return the wsEditFirstNameFlgs attribute reference
	 */
	public ElementaryRangeReference getWsEditFirstNameFlgsReference() {
		return wsEditFirstNameFlgs.getReference();
	}

	/**
	 * Getter for wsEditFirstNameFlgs attribute.
	 * @return wsEditFirstNameFlgs attribute
	 */
	public String getWsEditFirstNameFlgs() {
		return wsEditFirstNameFlgs.getValue();
	}

	/**
	 * Setter for wsEditFirstNameFlgs attribute.
	 * @param wsEditFirstNameFlgs the new value of wsEditFirstNameFlgs
	 */
	public void setWsEditFirstNameFlgs(String wsEditFirstNameFlgs) {
		this.wsEditFirstNameFlgs.setValue(wsEditFirstNameFlgs);
	}
	/**
	 * Gets the reference for attribute flgFirstNameIsvalid.
	 * @return the flgFirstNameIsvalid attribute reference
	 */
	public ConditionReference getFlgFirstNameIsvalidReference() {
		return wsEditFirstNameFlgs.getCondition(flgFirstNameIsvalid);	
	}

	/**
	 * Getter for flgFirstNameIsvalid attribute.
	 * @return flgFirstNameIsvalid attribute
	 */
	public boolean isFlgFirstNameIsvalid() {
		return getFlgFirstNameIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgFirstNameIsvalid attribute.
	 * @param flgFirstNameIsvalid the new value of flgFirstNameIsvalid
	 */
	public void setFlgFirstNameIsvalid(boolean flgFirstNameIsvalid) {
		getFlgFirstNameIsvalidReference().setValue(flgFirstNameIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgFirstNameNotOk.
	 * @return the flgFirstNameNotOk attribute reference
	 */
	public ConditionReference getFlgFirstNameNotOkReference() {
		return wsEditFirstNameFlgs.getCondition(flgFirstNameNotOk);	
	}

	/**
	 * Getter for flgFirstNameNotOk attribute.
	 * @return flgFirstNameNotOk attribute
	 */
	public boolean isFlgFirstNameNotOk() {
		return getFlgFirstNameNotOkReference().getValue();	
	}

	/**
	 * Setter for flgFirstNameNotOk attribute.
	 * @param flgFirstNameNotOk the new value of flgFirstNameNotOk
	 */
	public void setFlgFirstNameNotOk(boolean flgFirstNameNotOk) {
		getFlgFirstNameNotOkReference().setValue(flgFirstNameNotOk);	
	}
	/**
	 * Gets the reference for attribute flgFirstNameBlank.
	 * @return the flgFirstNameBlank attribute reference
	 */
	public ConditionReference getFlgFirstNameBlankReference() {
		return wsEditFirstNameFlgs.getCondition(flgFirstNameBlank);	
	}

	/**
	 * Getter for flgFirstNameBlank attribute.
	 * @return flgFirstNameBlank attribute
	 */
	public boolean isFlgFirstNameBlank() {
		return getFlgFirstNameBlankReference().getValue();	
	}

	/**
	 * Setter for flgFirstNameBlank attribute.
	 * @param flgFirstNameBlank the new value of flgFirstNameBlank
	 */
	public void setFlgFirstNameBlank(boolean flgFirstNameBlank) {
		getFlgFirstNameBlankReference().setValue(flgFirstNameBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditMiddleNameFlgs.
	 * @return the wsEditMiddleNameFlgs attribute reference
	 */
	public ElementaryRangeReference getWsEditMiddleNameFlgsReference() {
		return wsEditMiddleNameFlgs.getReference();
	}

	/**
	 * Getter for wsEditMiddleNameFlgs attribute.
	 * @return wsEditMiddleNameFlgs attribute
	 */
	public String getWsEditMiddleNameFlgs() {
		return wsEditMiddleNameFlgs.getValue();
	}

	/**
	 * Setter for wsEditMiddleNameFlgs attribute.
	 * @param wsEditMiddleNameFlgs the new value of wsEditMiddleNameFlgs
	 */
	public void setWsEditMiddleNameFlgs(String wsEditMiddleNameFlgs) {
		this.wsEditMiddleNameFlgs.setValue(wsEditMiddleNameFlgs);
	}
	/**
	 * Gets the reference for attribute flgMiddleNameIsvalid.
	 * @return the flgMiddleNameIsvalid attribute reference
	 */
	public ConditionReference getFlgMiddleNameIsvalidReference() {
		return wsEditMiddleNameFlgs.getCondition(flgMiddleNameIsvalid);	
	}

	/**
	 * Getter for flgMiddleNameIsvalid attribute.
	 * @return flgMiddleNameIsvalid attribute
	 */
	public boolean isFlgMiddleNameIsvalid() {
		return getFlgMiddleNameIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgMiddleNameIsvalid attribute.
	 * @param flgMiddleNameIsvalid the new value of flgMiddleNameIsvalid
	 */
	public void setFlgMiddleNameIsvalid(boolean flgMiddleNameIsvalid) {
		getFlgMiddleNameIsvalidReference().setValue(flgMiddleNameIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgMiddleNameNotOk.
	 * @return the flgMiddleNameNotOk attribute reference
	 */
	public ConditionReference getFlgMiddleNameNotOkReference() {
		return wsEditMiddleNameFlgs.getCondition(flgMiddleNameNotOk);	
	}

	/**
	 * Getter for flgMiddleNameNotOk attribute.
	 * @return flgMiddleNameNotOk attribute
	 */
	public boolean isFlgMiddleNameNotOk() {
		return getFlgMiddleNameNotOkReference().getValue();	
	}

	/**
	 * Setter for flgMiddleNameNotOk attribute.
	 * @param flgMiddleNameNotOk the new value of flgMiddleNameNotOk
	 */
	public void setFlgMiddleNameNotOk(boolean flgMiddleNameNotOk) {
		getFlgMiddleNameNotOkReference().setValue(flgMiddleNameNotOk);	
	}
	/**
	 * Gets the reference for attribute flgMiddleNameBlank.
	 * @return the flgMiddleNameBlank attribute reference
	 */
	public ConditionReference getFlgMiddleNameBlankReference() {
		return wsEditMiddleNameFlgs.getCondition(flgMiddleNameBlank);	
	}

	/**
	 * Getter for flgMiddleNameBlank attribute.
	 * @return flgMiddleNameBlank attribute
	 */
	public boolean isFlgMiddleNameBlank() {
		return getFlgMiddleNameBlankReference().getValue();	
	}

	/**
	 * Setter for flgMiddleNameBlank attribute.
	 * @param flgMiddleNameBlank the new value of flgMiddleNameBlank
	 */
	public void setFlgMiddleNameBlank(boolean flgMiddleNameBlank) {
		getFlgMiddleNameBlankReference().setValue(flgMiddleNameBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditLastNameFlgs.
	 * @return the wsEditLastNameFlgs attribute reference
	 */
	public ElementaryRangeReference getWsEditLastNameFlgsReference() {
		return wsEditLastNameFlgs.getReference();
	}

	/**
	 * Getter for wsEditLastNameFlgs attribute.
	 * @return wsEditLastNameFlgs attribute
	 */
	public String getWsEditLastNameFlgs() {
		return wsEditLastNameFlgs.getValue();
	}

	/**
	 * Setter for wsEditLastNameFlgs attribute.
	 * @param wsEditLastNameFlgs the new value of wsEditLastNameFlgs
	 */
	public void setWsEditLastNameFlgs(String wsEditLastNameFlgs) {
		this.wsEditLastNameFlgs.setValue(wsEditLastNameFlgs);
	}
	/**
	 * Gets the reference for attribute flgLastNameIsvalid.
	 * @return the flgLastNameIsvalid attribute reference
	 */
	public ConditionReference getFlgLastNameIsvalidReference() {
		return wsEditLastNameFlgs.getCondition(flgLastNameIsvalid);	
	}

	/**
	 * Getter for flgLastNameIsvalid attribute.
	 * @return flgLastNameIsvalid attribute
	 */
	public boolean isFlgLastNameIsvalid() {
		return getFlgLastNameIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgLastNameIsvalid attribute.
	 * @param flgLastNameIsvalid the new value of flgLastNameIsvalid
	 */
	public void setFlgLastNameIsvalid(boolean flgLastNameIsvalid) {
		getFlgLastNameIsvalidReference().setValue(flgLastNameIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgLastNameNotOk.
	 * @return the flgLastNameNotOk attribute reference
	 */
	public ConditionReference getFlgLastNameNotOkReference() {
		return wsEditLastNameFlgs.getCondition(flgLastNameNotOk);	
	}

	/**
	 * Getter for flgLastNameNotOk attribute.
	 * @return flgLastNameNotOk attribute
	 */
	public boolean isFlgLastNameNotOk() {
		return getFlgLastNameNotOkReference().getValue();	
	}

	/**
	 * Setter for flgLastNameNotOk attribute.
	 * @param flgLastNameNotOk the new value of flgLastNameNotOk
	 */
	public void setFlgLastNameNotOk(boolean flgLastNameNotOk) {
		getFlgLastNameNotOkReference().setValue(flgLastNameNotOk);	
	}
	/**
	 * Gets the reference for attribute flgLastNameBlank.
	 * @return the flgLastNameBlank attribute reference
	 */
	public ConditionReference getFlgLastNameBlankReference() {
		return wsEditLastNameFlgs.getCondition(flgLastNameBlank);	
	}

	/**
	 * Getter for flgLastNameBlank attribute.
	 * @return flgLastNameBlank attribute
	 */
	public boolean isFlgLastNameBlank() {
		return getFlgLastNameBlankReference().getValue();	
	}

	/**
	 * Setter for flgLastNameBlank attribute.
	 * @param flgLastNameBlank the new value of flgLastNameBlank
	 */
	public void setFlgLastNameBlank(boolean flgLastNameBlank) {
		getFlgLastNameBlankReference().setValue(flgLastNameBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsEditAddressFlags.
	 * @return the wsEditAddressFlags attribute reference
	 */
	public RangeReference getWsEditAddressFlagsReference() {
		return wsEditAddressFlags.getReference();
	}	
				
	/**
	 * Setter for wsEditAddressFlags .
	 */
   	public void setWsEditAddressFlags(RangeReference reference) {
       	wsEditAddressFlags.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditAddressLine1Flgs.
	 * @return the wsEditAddressLine1Flgs attribute reference
	 */
	public ElementaryRangeReference getWsEditAddressLine1FlgsReference() {
		return wsEditAddressLine1Flgs.getReference();
	}

	/**
	 * Getter for wsEditAddressLine1Flgs attribute.
	 * @return wsEditAddressLine1Flgs attribute
	 */
	public String getWsEditAddressLine1Flgs() {
		return wsEditAddressLine1Flgs.getValue();
	}

	/**
	 * Setter for wsEditAddressLine1Flgs attribute.
	 * @param wsEditAddressLine1Flgs the new value of wsEditAddressLine1Flgs
	 */
	public void setWsEditAddressLine1Flgs(String wsEditAddressLine1Flgs) {
		this.wsEditAddressLine1Flgs.setValue(wsEditAddressLine1Flgs);
	}
	/**
	 * Gets the reference for attribute flgAddressLine1Isvalid.
	 * @return the flgAddressLine1Isvalid attribute reference
	 */
	public ConditionReference getFlgAddressLine1IsvalidReference() {
		return wsEditAddressLine1Flgs.getCondition(flgAddressLine1Isvalid);	
	}

	/**
	 * Getter for flgAddressLine1Isvalid attribute.
	 * @return flgAddressLine1Isvalid attribute
	 */
	public boolean isFlgAddressLine1Isvalid() {
		return getFlgAddressLine1IsvalidReference().getValue();	
	}

	/**
	 * Setter for flgAddressLine1Isvalid attribute.
	 * @param flgAddressLine1Isvalid the new value of flgAddressLine1Isvalid
	 */
	public void setFlgAddressLine1Isvalid(boolean flgAddressLine1Isvalid) {
		getFlgAddressLine1IsvalidReference().setValue(flgAddressLine1Isvalid);	
	}
	/**
	 * Gets the reference for attribute flgAddressLine1NotOk.
	 * @return the flgAddressLine1NotOk attribute reference
	 */
	public ConditionReference getFlgAddressLine1NotOkReference() {
		return wsEditAddressLine1Flgs.getCondition(flgAddressLine1NotOk);	
	}

	/**
	 * Getter for flgAddressLine1NotOk attribute.
	 * @return flgAddressLine1NotOk attribute
	 */
	public boolean isFlgAddressLine1NotOk() {
		return getFlgAddressLine1NotOkReference().getValue();	
	}

	/**
	 * Setter for flgAddressLine1NotOk attribute.
	 * @param flgAddressLine1NotOk the new value of flgAddressLine1NotOk
	 */
	public void setFlgAddressLine1NotOk(boolean flgAddressLine1NotOk) {
		getFlgAddressLine1NotOkReference().setValue(flgAddressLine1NotOk);	
	}
	/**
	 * Gets the reference for attribute flgAddressLine1Blank.
	 * @return the flgAddressLine1Blank attribute reference
	 */
	public ConditionReference getFlgAddressLine1BlankReference() {
		return wsEditAddressLine1Flgs.getCondition(flgAddressLine1Blank);	
	}

	/**
	 * Getter for flgAddressLine1Blank attribute.
	 * @return flgAddressLine1Blank attribute
	 */
	public boolean isFlgAddressLine1Blank() {
		return getFlgAddressLine1BlankReference().getValue();	
	}

	/**
	 * Setter for flgAddressLine1Blank attribute.
	 * @param flgAddressLine1Blank the new value of flgAddressLine1Blank
	 */
	public void setFlgAddressLine1Blank(boolean flgAddressLine1Blank) {
		getFlgAddressLine1BlankReference().setValue(flgAddressLine1Blank);	
	}
	/**
	 * Gets the reference for attribute wsEditAddressLine2Flgs.
	 * @return the wsEditAddressLine2Flgs attribute reference
	 */
	public ElementaryRangeReference getWsEditAddressLine2FlgsReference() {
		return wsEditAddressLine2Flgs.getReference();
	}

	/**
	 * Getter for wsEditAddressLine2Flgs attribute.
	 * @return wsEditAddressLine2Flgs attribute
	 */
	public String getWsEditAddressLine2Flgs() {
		return wsEditAddressLine2Flgs.getValue();
	}

	/**
	 * Setter for wsEditAddressLine2Flgs attribute.
	 * @param wsEditAddressLine2Flgs the new value of wsEditAddressLine2Flgs
	 */
	public void setWsEditAddressLine2Flgs(String wsEditAddressLine2Flgs) {
		this.wsEditAddressLine2Flgs.setValue(wsEditAddressLine2Flgs);
	}
	/**
	 * Gets the reference for attribute flgAddressLine2Isvalid.
	 * @return the flgAddressLine2Isvalid attribute reference
	 */
	public ConditionReference getFlgAddressLine2IsvalidReference() {
		return wsEditAddressLine2Flgs.getCondition(flgAddressLine2Isvalid);	
	}

	/**
	 * Getter for flgAddressLine2Isvalid attribute.
	 * @return flgAddressLine2Isvalid attribute
	 */
	public boolean isFlgAddressLine2Isvalid() {
		return getFlgAddressLine2IsvalidReference().getValue();	
	}

	/**
	 * Setter for flgAddressLine2Isvalid attribute.
	 * @param flgAddressLine2Isvalid the new value of flgAddressLine2Isvalid
	 */
	public void setFlgAddressLine2Isvalid(boolean flgAddressLine2Isvalid) {
		getFlgAddressLine2IsvalidReference().setValue(flgAddressLine2Isvalid);	
	}
	/**
	 * Gets the reference for attribute flgAddressLine2NotOk.
	 * @return the flgAddressLine2NotOk attribute reference
	 */
	public ConditionReference getFlgAddressLine2NotOkReference() {
		return wsEditAddressLine2Flgs.getCondition(flgAddressLine2NotOk);	
	}

	/**
	 * Getter for flgAddressLine2NotOk attribute.
	 * @return flgAddressLine2NotOk attribute
	 */
	public boolean isFlgAddressLine2NotOk() {
		return getFlgAddressLine2NotOkReference().getValue();	
	}

	/**
	 * Setter for flgAddressLine2NotOk attribute.
	 * @param flgAddressLine2NotOk the new value of flgAddressLine2NotOk
	 */
	public void setFlgAddressLine2NotOk(boolean flgAddressLine2NotOk) {
		getFlgAddressLine2NotOkReference().setValue(flgAddressLine2NotOk);	
	}
	/**
	 * Gets the reference for attribute flgAddressLine2Blank.
	 * @return the flgAddressLine2Blank attribute reference
	 */
	public ConditionReference getFlgAddressLine2BlankReference() {
		return wsEditAddressLine2Flgs.getCondition(flgAddressLine2Blank);	
	}

	/**
	 * Getter for flgAddressLine2Blank attribute.
	 * @return flgAddressLine2Blank attribute
	 */
	public boolean isFlgAddressLine2Blank() {
		return getFlgAddressLine2BlankReference().getValue();	
	}

	/**
	 * Setter for flgAddressLine2Blank attribute.
	 * @param flgAddressLine2Blank the new value of flgAddressLine2Blank
	 */
	public void setFlgAddressLine2Blank(boolean flgAddressLine2Blank) {
		getFlgAddressLine2BlankReference().setValue(flgAddressLine2Blank);	
	}
	/**
	 * Gets the reference for attribute wsEditCityFlgs.
	 * @return the wsEditCityFlgs attribute reference
	 */
	public ElementaryRangeReference getWsEditCityFlgsReference() {
		return wsEditCityFlgs.getReference();
	}

	/**
	 * Getter for wsEditCityFlgs attribute.
	 * @return wsEditCityFlgs attribute
	 */
	public String getWsEditCityFlgs() {
		return wsEditCityFlgs.getValue();
	}

	/**
	 * Setter for wsEditCityFlgs attribute.
	 * @param wsEditCityFlgs the new value of wsEditCityFlgs
	 */
	public void setWsEditCityFlgs(String wsEditCityFlgs) {
		this.wsEditCityFlgs.setValue(wsEditCityFlgs);
	}
	/**
	 * Gets the reference for attribute flgCityIsvalid.
	 * @return the flgCityIsvalid attribute reference
	 */
	public ConditionReference getFlgCityIsvalidReference() {
		return wsEditCityFlgs.getCondition(flgCityIsvalid);	
	}

	/**
	 * Getter for flgCityIsvalid attribute.
	 * @return flgCityIsvalid attribute
	 */
	public boolean isFlgCityIsvalid() {
		return getFlgCityIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCityIsvalid attribute.
	 * @param flgCityIsvalid the new value of flgCityIsvalid
	 */
	public void setFlgCityIsvalid(boolean flgCityIsvalid) {
		getFlgCityIsvalidReference().setValue(flgCityIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCityNotOk.
	 * @return the flgCityNotOk attribute reference
	 */
	public ConditionReference getFlgCityNotOkReference() {
		return wsEditCityFlgs.getCondition(flgCityNotOk);	
	}

	/**
	 * Getter for flgCityNotOk attribute.
	 * @return flgCityNotOk attribute
	 */
	public boolean isFlgCityNotOk() {
		return getFlgCityNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCityNotOk attribute.
	 * @param flgCityNotOk the new value of flgCityNotOk
	 */
	public void setFlgCityNotOk(boolean flgCityNotOk) {
		getFlgCityNotOkReference().setValue(flgCityNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCityBlank.
	 * @return the flgCityBlank attribute reference
	 */
	public ConditionReference getFlgCityBlankReference() {
		return wsEditCityFlgs.getCondition(flgCityBlank);	
	}

	/**
	 * Getter for flgCityBlank attribute.
	 * @return flgCityBlank attribute
	 */
	public boolean isFlgCityBlank() {
		return getFlgCityBlankReference().getValue();	
	}

	/**
	 * Setter for flgCityBlank attribute.
	 * @param flgCityBlank the new value of flgCityBlank
	 */
	public void setFlgCityBlank(boolean flgCityBlank) {
		getFlgCityBlankReference().setValue(flgCityBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditStateFlgs.
	 * @return the wsEditStateFlgs attribute reference
	 */
	public ElementaryRangeReference getWsEditStateFlgsReference() {
		return wsEditStateFlgs.getReference();
	}

	/**
	 * Getter for wsEditStateFlgs attribute.
	 * @return wsEditStateFlgs attribute
	 */
	public String getWsEditStateFlgs() {
		return wsEditStateFlgs.getValue();
	}

	/**
	 * Setter for wsEditStateFlgs attribute.
	 * @param wsEditStateFlgs the new value of wsEditStateFlgs
	 */
	public void setWsEditStateFlgs(String wsEditStateFlgs) {
		this.wsEditStateFlgs.setValue(wsEditStateFlgs);
	}
	/**
	 * Gets the reference for attribute flgStateIsvalid.
	 * @return the flgStateIsvalid attribute reference
	 */
	public ConditionReference getFlgStateIsvalidReference() {
		return wsEditStateFlgs.getCondition(flgStateIsvalid);	
	}

	/**
	 * Getter for flgStateIsvalid attribute.
	 * @return flgStateIsvalid attribute
	 */
	public boolean isFlgStateIsvalid() {
		return getFlgStateIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgStateIsvalid attribute.
	 * @param flgStateIsvalid the new value of flgStateIsvalid
	 */
	public void setFlgStateIsvalid(boolean flgStateIsvalid) {
		getFlgStateIsvalidReference().setValue(flgStateIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgStateNotOk.
	 * @return the flgStateNotOk attribute reference
	 */
	public ConditionReference getFlgStateNotOkReference() {
		return wsEditStateFlgs.getCondition(flgStateNotOk);	
	}

	/**
	 * Getter for flgStateNotOk attribute.
	 * @return flgStateNotOk attribute
	 */
	public boolean isFlgStateNotOk() {
		return getFlgStateNotOkReference().getValue();	
	}

	/**
	 * Setter for flgStateNotOk attribute.
	 * @param flgStateNotOk the new value of flgStateNotOk
	 */
	public void setFlgStateNotOk(boolean flgStateNotOk) {
		getFlgStateNotOkReference().setValue(flgStateNotOk);	
	}
	/**
	 * Gets the reference for attribute flgStateBlank.
	 * @return the flgStateBlank attribute reference
	 */
	public ConditionReference getFlgStateBlankReference() {
		return wsEditStateFlgs.getCondition(flgStateBlank);	
	}

	/**
	 * Getter for flgStateBlank attribute.
	 * @return flgStateBlank attribute
	 */
	public boolean isFlgStateBlank() {
		return getFlgStateBlankReference().getValue();	
	}

	/**
	 * Setter for flgStateBlank attribute.
	 * @param flgStateBlank the new value of flgStateBlank
	 */
	public void setFlgStateBlank(boolean flgStateBlank) {
		getFlgStateBlankReference().setValue(flgStateBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditZipcodeFlgs.
	 * @return the wsEditZipcodeFlgs attribute reference
	 */
	public ElementaryRangeReference getWsEditZipcodeFlgsReference() {
		return wsEditZipcodeFlgs.getReference();
	}

	/**
	 * Getter for wsEditZipcodeFlgs attribute.
	 * @return wsEditZipcodeFlgs attribute
	 */
	public String getWsEditZipcodeFlgs() {
		return wsEditZipcodeFlgs.getValue();
	}

	/**
	 * Setter for wsEditZipcodeFlgs attribute.
	 * @param wsEditZipcodeFlgs the new value of wsEditZipcodeFlgs
	 */
	public void setWsEditZipcodeFlgs(String wsEditZipcodeFlgs) {
		this.wsEditZipcodeFlgs.setValue(wsEditZipcodeFlgs);
	}
	/**
	 * Gets the reference for attribute flgZipcodeIsvalid.
	 * @return the flgZipcodeIsvalid attribute reference
	 */
	public ConditionReference getFlgZipcodeIsvalidReference() {
		return wsEditZipcodeFlgs.getCondition(flgZipcodeIsvalid);	
	}

	/**
	 * Getter for flgZipcodeIsvalid attribute.
	 * @return flgZipcodeIsvalid attribute
	 */
	public boolean isFlgZipcodeIsvalid() {
		return getFlgZipcodeIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgZipcodeIsvalid attribute.
	 * @param flgZipcodeIsvalid the new value of flgZipcodeIsvalid
	 */
	public void setFlgZipcodeIsvalid(boolean flgZipcodeIsvalid) {
		getFlgZipcodeIsvalidReference().setValue(flgZipcodeIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgZipcodeNotOk.
	 * @return the flgZipcodeNotOk attribute reference
	 */
	public ConditionReference getFlgZipcodeNotOkReference() {
		return wsEditZipcodeFlgs.getCondition(flgZipcodeNotOk);	
	}

	/**
	 * Getter for flgZipcodeNotOk attribute.
	 * @return flgZipcodeNotOk attribute
	 */
	public boolean isFlgZipcodeNotOk() {
		return getFlgZipcodeNotOkReference().getValue();	
	}

	/**
	 * Setter for flgZipcodeNotOk attribute.
	 * @param flgZipcodeNotOk the new value of flgZipcodeNotOk
	 */
	public void setFlgZipcodeNotOk(boolean flgZipcodeNotOk) {
		getFlgZipcodeNotOkReference().setValue(flgZipcodeNotOk);	
	}
	/**
	 * Gets the reference for attribute flgZipcodeBlank.
	 * @return the flgZipcodeBlank attribute reference
	 */
	public ConditionReference getFlgZipcodeBlankReference() {
		return wsEditZipcodeFlgs.getCondition(flgZipcodeBlank);	
	}

	/**
	 * Getter for flgZipcodeBlank attribute.
	 * @return flgZipcodeBlank attribute
	 */
	public boolean isFlgZipcodeBlank() {
		return getFlgZipcodeBlankReference().getValue();	
	}

	/**
	 * Setter for flgZipcodeBlank attribute.
	 * @param flgZipcodeBlank the new value of flgZipcodeBlank
	 */
	public void setFlgZipcodeBlank(boolean flgZipcodeBlank) {
		getFlgZipcodeBlankReference().setValue(flgZipcodeBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditCountryFlgs.
	 * @return the wsEditCountryFlgs attribute reference
	 */
	public ElementaryRangeReference getWsEditCountryFlgsReference() {
		return wsEditCountryFlgs.getReference();
	}

	/**
	 * Getter for wsEditCountryFlgs attribute.
	 * @return wsEditCountryFlgs attribute
	 */
	public String getWsEditCountryFlgs() {
		return wsEditCountryFlgs.getValue();
	}

	/**
	 * Setter for wsEditCountryFlgs attribute.
	 * @param wsEditCountryFlgs the new value of wsEditCountryFlgs
	 */
	public void setWsEditCountryFlgs(String wsEditCountryFlgs) {
		this.wsEditCountryFlgs.setValue(wsEditCountryFlgs);
	}
	/**
	 * Gets the reference for attribute flgCountryIsvalid.
	 * @return the flgCountryIsvalid attribute reference
	 */
	public ConditionReference getFlgCountryIsvalidReference() {
		return wsEditCountryFlgs.getCondition(flgCountryIsvalid);	
	}

	/**
	 * Getter for flgCountryIsvalid attribute.
	 * @return flgCountryIsvalid attribute
	 */
	public boolean isFlgCountryIsvalid() {
		return getFlgCountryIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgCountryIsvalid attribute.
	 * @param flgCountryIsvalid the new value of flgCountryIsvalid
	 */
	public void setFlgCountryIsvalid(boolean flgCountryIsvalid) {
		getFlgCountryIsvalidReference().setValue(flgCountryIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgCountryNotOk.
	 * @return the flgCountryNotOk attribute reference
	 */
	public ConditionReference getFlgCountryNotOkReference() {
		return wsEditCountryFlgs.getCondition(flgCountryNotOk);	
	}

	/**
	 * Getter for flgCountryNotOk attribute.
	 * @return flgCountryNotOk attribute
	 */
	public boolean isFlgCountryNotOk() {
		return getFlgCountryNotOkReference().getValue();	
	}

	/**
	 * Setter for flgCountryNotOk attribute.
	 * @param flgCountryNotOk the new value of flgCountryNotOk
	 */
	public void setFlgCountryNotOk(boolean flgCountryNotOk) {
		getFlgCountryNotOkReference().setValue(flgCountryNotOk);	
	}
	/**
	 * Gets the reference for attribute flgCountryBlank.
	 * @return the flgCountryBlank attribute reference
	 */
	public ConditionReference getFlgCountryBlankReference() {
		return wsEditCountryFlgs.getCondition(flgCountryBlank);	
	}

	/**
	 * Getter for flgCountryBlank attribute.
	 * @return flgCountryBlank attribute
	 */
	public boolean isFlgCountryBlank() {
		return getFlgCountryBlankReference().getValue();	
	}

	/**
	 * Setter for flgCountryBlank attribute.
	 * @param flgCountryBlank the new value of flgCountryBlank
	 */
	public void setFlgCountryBlank(boolean flgCountryBlank) {
		getFlgCountryBlankReference().setValue(flgCountryBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsEditPhoneNum1Flgs.
	 * @return the wsEditPhoneNum1Flgs attribute reference
	 */
	public RangeReference getWsEditPhoneNum1FlgsReference() {
		return wsEditPhoneNum1Flgs.getReference();
	}	
				
	/**
	 * Setter for wsEditPhoneNum1Flgs .
	 */
   	public void setWsEditPhoneNum1Flgs(RangeReference reference) {
       	wsEditPhoneNum1Flgs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditPhoneNum1IsInvalid.
	 * @return the wsEditPhoneNum1IsInvalid attribute reference
	 */
	public ConditionReference getWsEditPhoneNum1IsInvalidReference() {
		return wsEditPhoneNum1Flgs.getCondition(wsEditPhoneNum1IsInvalid);	
	}

	/**
	 * Getter for wsEditPhoneNum1IsInvalid attribute.
	 * @return wsEditPhoneNum1IsInvalid attribute
	 */
	public boolean isWsEditPhoneNum1IsInvalid() {
		return getWsEditPhoneNum1IsInvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditPhoneNum1IsInvalid attribute.
	 * @param wsEditPhoneNum1IsInvalid the new value of wsEditPhoneNum1IsInvalid
	 */
	public void setWsEditPhoneNum1IsInvalid(boolean wsEditPhoneNum1IsInvalid) {
		getWsEditPhoneNum1IsInvalidReference().setValue(wsEditPhoneNum1IsInvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditPhoneNum1aFlg.
	 * @return the wsEditPhoneNum1aFlg attribute reference
	 */
	public ElementaryRangeReference getWsEditPhoneNum1aFlgReference() {
		return wsEditPhoneNum1aFlg.getReference();
	}

	/**
	 * Getter for wsEditPhoneNum1aFlg attribute.
	 * @return wsEditPhoneNum1aFlg attribute
	 */
	public String getWsEditPhoneNum1aFlg() {
		return wsEditPhoneNum1aFlg.getValue();
	}

	/**
	 * Setter for wsEditPhoneNum1aFlg attribute.
	 * @param wsEditPhoneNum1aFlg the new value of wsEditPhoneNum1aFlg
	 */
	public void setWsEditPhoneNum1aFlg(String wsEditPhoneNum1aFlg) {
		this.wsEditPhoneNum1aFlg.setValue(wsEditPhoneNum1aFlg);
	}
	/**
	 * Gets the reference for attribute flgPhoneNum1aIsvalid.
	 * @return the flgPhoneNum1aIsvalid attribute reference
	 */
	public ConditionReference getFlgPhoneNum1aIsvalidReference() {
		return wsEditPhoneNum1aFlg.getCondition(flgPhoneNum1aIsvalid);	
	}

	/**
	 * Getter for flgPhoneNum1aIsvalid attribute.
	 * @return flgPhoneNum1aIsvalid attribute
	 */
	public boolean isFlgPhoneNum1aIsvalid() {
		return getFlgPhoneNum1aIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum1aIsvalid attribute.
	 * @param flgPhoneNum1aIsvalid the new value of flgPhoneNum1aIsvalid
	 */
	public void setFlgPhoneNum1aIsvalid(boolean flgPhoneNum1aIsvalid) {
		getFlgPhoneNum1aIsvalidReference().setValue(flgPhoneNum1aIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum1aNotOk.
	 * @return the flgPhoneNum1aNotOk attribute reference
	 */
	public ConditionReference getFlgPhoneNum1aNotOkReference() {
		return wsEditPhoneNum1aFlg.getCondition(flgPhoneNum1aNotOk);	
	}

	/**
	 * Getter for flgPhoneNum1aNotOk attribute.
	 * @return flgPhoneNum1aNotOk attribute
	 */
	public boolean isFlgPhoneNum1aNotOk() {
		return getFlgPhoneNum1aNotOkReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum1aNotOk attribute.
	 * @param flgPhoneNum1aNotOk the new value of flgPhoneNum1aNotOk
	 */
	public void setFlgPhoneNum1aNotOk(boolean flgPhoneNum1aNotOk) {
		getFlgPhoneNum1aNotOkReference().setValue(flgPhoneNum1aNotOk);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum1aBlank.
	 * @return the flgPhoneNum1aBlank attribute reference
	 */
	public ConditionReference getFlgPhoneNum1aBlankReference() {
		return wsEditPhoneNum1aFlg.getCondition(flgPhoneNum1aBlank);	
	}

	/**
	 * Getter for flgPhoneNum1aBlank attribute.
	 * @return flgPhoneNum1aBlank attribute
	 */
	public boolean isFlgPhoneNum1aBlank() {
		return getFlgPhoneNum1aBlankReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum1aBlank attribute.
	 * @param flgPhoneNum1aBlank the new value of flgPhoneNum1aBlank
	 */
	public void setFlgPhoneNum1aBlank(boolean flgPhoneNum1aBlank) {
		getFlgPhoneNum1aBlankReference().setValue(flgPhoneNum1aBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditPhoneNum1b.
	 * @return the wsEditPhoneNum1b attribute reference
	 */
	public ElementaryRangeReference getWsEditPhoneNum1bReference() {
		return wsEditPhoneNum1b.getReference();
	}

	/**
	 * Getter for wsEditPhoneNum1b attribute.
	 * @return wsEditPhoneNum1b attribute
	 */
	public String getWsEditPhoneNum1b() {
		return wsEditPhoneNum1b.getValue();
	}

	/**
	 * Setter for wsEditPhoneNum1b attribute.
	 * @param wsEditPhoneNum1b the new value of wsEditPhoneNum1b
	 */
	public void setWsEditPhoneNum1b(String wsEditPhoneNum1b) {
		this.wsEditPhoneNum1b.setValue(wsEditPhoneNum1b);
	}
	/**
	 * Gets the reference for attribute flgPhoneNum1bIsvalid.
	 * @return the flgPhoneNum1bIsvalid attribute reference
	 */
	public ConditionReference getFlgPhoneNum1bIsvalidReference() {
		return wsEditPhoneNum1b.getCondition(flgPhoneNum1bIsvalid);	
	}

	/**
	 * Getter for flgPhoneNum1bIsvalid attribute.
	 * @return flgPhoneNum1bIsvalid attribute
	 */
	public boolean isFlgPhoneNum1bIsvalid() {
		return getFlgPhoneNum1bIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum1bIsvalid attribute.
	 * @param flgPhoneNum1bIsvalid the new value of flgPhoneNum1bIsvalid
	 */
	public void setFlgPhoneNum1bIsvalid(boolean flgPhoneNum1bIsvalid) {
		getFlgPhoneNum1bIsvalidReference().setValue(flgPhoneNum1bIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum1bNotOk.
	 * @return the flgPhoneNum1bNotOk attribute reference
	 */
	public ConditionReference getFlgPhoneNum1bNotOkReference() {
		return wsEditPhoneNum1b.getCondition(flgPhoneNum1bNotOk);	
	}

	/**
	 * Getter for flgPhoneNum1bNotOk attribute.
	 * @return flgPhoneNum1bNotOk attribute
	 */
	public boolean isFlgPhoneNum1bNotOk() {
		return getFlgPhoneNum1bNotOkReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum1bNotOk attribute.
	 * @param flgPhoneNum1bNotOk the new value of flgPhoneNum1bNotOk
	 */
	public void setFlgPhoneNum1bNotOk(boolean flgPhoneNum1bNotOk) {
		getFlgPhoneNum1bNotOkReference().setValue(flgPhoneNum1bNotOk);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum1bBlank.
	 * @return the flgPhoneNum1bBlank attribute reference
	 */
	public ConditionReference getFlgPhoneNum1bBlankReference() {
		return wsEditPhoneNum1b.getCondition(flgPhoneNum1bBlank);	
	}

	/**
	 * Getter for flgPhoneNum1bBlank attribute.
	 * @return flgPhoneNum1bBlank attribute
	 */
	public boolean isFlgPhoneNum1bBlank() {
		return getFlgPhoneNum1bBlankReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum1bBlank attribute.
	 * @param flgPhoneNum1bBlank the new value of flgPhoneNum1bBlank
	 */
	public void setFlgPhoneNum1bBlank(boolean flgPhoneNum1bBlank) {
		getFlgPhoneNum1bBlankReference().setValue(flgPhoneNum1bBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditPhoneNum1c.
	 * @return the wsEditPhoneNum1c attribute reference
	 */
	public ElementaryRangeReference getWsEditPhoneNum1cReference() {
		return wsEditPhoneNum1c.getReference();
	}

	/**
	 * Getter for wsEditPhoneNum1c attribute.
	 * @return wsEditPhoneNum1c attribute
	 */
	public String getWsEditPhoneNum1c() {
		return wsEditPhoneNum1c.getValue();
	}

	/**
	 * Setter for wsEditPhoneNum1c attribute.
	 * @param wsEditPhoneNum1c the new value of wsEditPhoneNum1c
	 */
	public void setWsEditPhoneNum1c(String wsEditPhoneNum1c) {
		this.wsEditPhoneNum1c.setValue(wsEditPhoneNum1c);
	}
	/**
	 * Gets the reference for attribute flgPhoneNum1cIsvalid.
	 * @return the flgPhoneNum1cIsvalid attribute reference
	 */
	public ConditionReference getFlgPhoneNum1cIsvalidReference() {
		return wsEditPhoneNum1c.getCondition(flgPhoneNum1cIsvalid);	
	}

	/**
	 * Getter for flgPhoneNum1cIsvalid attribute.
	 * @return flgPhoneNum1cIsvalid attribute
	 */
	public boolean isFlgPhoneNum1cIsvalid() {
		return getFlgPhoneNum1cIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum1cIsvalid attribute.
	 * @param flgPhoneNum1cIsvalid the new value of flgPhoneNum1cIsvalid
	 */
	public void setFlgPhoneNum1cIsvalid(boolean flgPhoneNum1cIsvalid) {
		getFlgPhoneNum1cIsvalidReference().setValue(flgPhoneNum1cIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum1cNotOk.
	 * @return the flgPhoneNum1cNotOk attribute reference
	 */
	public ConditionReference getFlgPhoneNum1cNotOkReference() {
		return wsEditPhoneNum1c.getCondition(flgPhoneNum1cNotOk);	
	}

	/**
	 * Getter for flgPhoneNum1cNotOk attribute.
	 * @return flgPhoneNum1cNotOk attribute
	 */
	public boolean isFlgPhoneNum1cNotOk() {
		return getFlgPhoneNum1cNotOkReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum1cNotOk attribute.
	 * @param flgPhoneNum1cNotOk the new value of flgPhoneNum1cNotOk
	 */
	public void setFlgPhoneNum1cNotOk(boolean flgPhoneNum1cNotOk) {
		getFlgPhoneNum1cNotOkReference().setValue(flgPhoneNum1cNotOk);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum1cBlank.
	 * @return the flgPhoneNum1cBlank attribute reference
	 */
	public ConditionReference getFlgPhoneNum1cBlankReference() {
		return wsEditPhoneNum1c.getCondition(flgPhoneNum1cBlank);	
	}

	/**
	 * Getter for flgPhoneNum1cBlank attribute.
	 * @return flgPhoneNum1cBlank attribute
	 */
	public boolean isFlgPhoneNum1cBlank() {
		return getFlgPhoneNum1cBlankReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum1cBlank attribute.
	 * @param flgPhoneNum1cBlank the new value of flgPhoneNum1cBlank
	 */
	public void setFlgPhoneNum1cBlank(boolean flgPhoneNum1cBlank) {
		getFlgPhoneNum1cBlankReference().setValue(flgPhoneNum1cBlank);	
	}
	
	/**
	 * Gets the reference for attribute wsEditPhoneNum2Flgs.
	 * @return the wsEditPhoneNum2Flgs attribute reference
	 */
	public RangeReference getWsEditPhoneNum2FlgsReference() {
		return wsEditPhoneNum2Flgs.getReference();
	}	
				
	/**
	 * Setter for wsEditPhoneNum2Flgs .
	 */
   	public void setWsEditPhoneNum2Flgs(RangeReference reference) {
       	wsEditPhoneNum2Flgs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsEditPhoneNum2IsInvalid.
	 * @return the wsEditPhoneNum2IsInvalid attribute reference
	 */
	public ConditionReference getWsEditPhoneNum2IsInvalidReference() {
		return wsEditPhoneNum2Flgs.getCondition(wsEditPhoneNum2IsInvalid);	
	}

	/**
	 * Getter for wsEditPhoneNum2IsInvalid attribute.
	 * @return wsEditPhoneNum2IsInvalid attribute
	 */
	public boolean isWsEditPhoneNum2IsInvalid() {
		return getWsEditPhoneNum2IsInvalidReference().getValue();	
	}

	/**
	 * Setter for wsEditPhoneNum2IsInvalid attribute.
	 * @param wsEditPhoneNum2IsInvalid the new value of wsEditPhoneNum2IsInvalid
	 */
	public void setWsEditPhoneNum2IsInvalid(boolean wsEditPhoneNum2IsInvalid) {
		getWsEditPhoneNum2IsInvalidReference().setValue(wsEditPhoneNum2IsInvalid);	
	}
	/**
	 * Gets the reference for attribute wsEditPhoneNum2aFlg.
	 * @return the wsEditPhoneNum2aFlg attribute reference
	 */
	public ElementaryRangeReference getWsEditPhoneNum2aFlgReference() {
		return wsEditPhoneNum2aFlg.getReference();
	}

	/**
	 * Getter for wsEditPhoneNum2aFlg attribute.
	 * @return wsEditPhoneNum2aFlg attribute
	 */
	public String getWsEditPhoneNum2aFlg() {
		return wsEditPhoneNum2aFlg.getValue();
	}

	/**
	 * Setter for wsEditPhoneNum2aFlg attribute.
	 * @param wsEditPhoneNum2aFlg the new value of wsEditPhoneNum2aFlg
	 */
	public void setWsEditPhoneNum2aFlg(String wsEditPhoneNum2aFlg) {
		this.wsEditPhoneNum2aFlg.setValue(wsEditPhoneNum2aFlg);
	}
	/**
	 * Gets the reference for attribute flgPhoneNum2aIsvalid.
	 * @return the flgPhoneNum2aIsvalid attribute reference
	 */
	public ConditionReference getFlgPhoneNum2aIsvalidReference() {
		return wsEditPhoneNum2aFlg.getCondition(flgPhoneNum2aIsvalid);	
	}

	/**
	 * Getter for flgPhoneNum2aIsvalid attribute.
	 * @return flgPhoneNum2aIsvalid attribute
	 */
	public boolean isFlgPhoneNum2aIsvalid() {
		return getFlgPhoneNum2aIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum2aIsvalid attribute.
	 * @param flgPhoneNum2aIsvalid the new value of flgPhoneNum2aIsvalid
	 */
	public void setFlgPhoneNum2aIsvalid(boolean flgPhoneNum2aIsvalid) {
		getFlgPhoneNum2aIsvalidReference().setValue(flgPhoneNum2aIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum2aNotOk.
	 * @return the flgPhoneNum2aNotOk attribute reference
	 */
	public ConditionReference getFlgPhoneNum2aNotOkReference() {
		return wsEditPhoneNum2aFlg.getCondition(flgPhoneNum2aNotOk);	
	}

	/**
	 * Getter for flgPhoneNum2aNotOk attribute.
	 * @return flgPhoneNum2aNotOk attribute
	 */
	public boolean isFlgPhoneNum2aNotOk() {
		return getFlgPhoneNum2aNotOkReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum2aNotOk attribute.
	 * @param flgPhoneNum2aNotOk the new value of flgPhoneNum2aNotOk
	 */
	public void setFlgPhoneNum2aNotOk(boolean flgPhoneNum2aNotOk) {
		getFlgPhoneNum2aNotOkReference().setValue(flgPhoneNum2aNotOk);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum2aBlank.
	 * @return the flgPhoneNum2aBlank attribute reference
	 */
	public ConditionReference getFlgPhoneNum2aBlankReference() {
		return wsEditPhoneNum2aFlg.getCondition(flgPhoneNum2aBlank);	
	}

	/**
	 * Getter for flgPhoneNum2aBlank attribute.
	 * @return flgPhoneNum2aBlank attribute
	 */
	public boolean isFlgPhoneNum2aBlank() {
		return getFlgPhoneNum2aBlankReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum2aBlank attribute.
	 * @param flgPhoneNum2aBlank the new value of flgPhoneNum2aBlank
	 */
	public void setFlgPhoneNum2aBlank(boolean flgPhoneNum2aBlank) {
		getFlgPhoneNum2aBlankReference().setValue(flgPhoneNum2aBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditPhoneNum2b.
	 * @return the wsEditPhoneNum2b attribute reference
	 */
	public ElementaryRangeReference getWsEditPhoneNum2bReference() {
		return wsEditPhoneNum2b.getReference();
	}

	/**
	 * Getter for wsEditPhoneNum2b attribute.
	 * @return wsEditPhoneNum2b attribute
	 */
	public String getWsEditPhoneNum2b() {
		return wsEditPhoneNum2b.getValue();
	}

	/**
	 * Setter for wsEditPhoneNum2b attribute.
	 * @param wsEditPhoneNum2b the new value of wsEditPhoneNum2b
	 */
	public void setWsEditPhoneNum2b(String wsEditPhoneNum2b) {
		this.wsEditPhoneNum2b.setValue(wsEditPhoneNum2b);
	}
	/**
	 * Gets the reference for attribute flgPhoneNum2bIsvalid.
	 * @return the flgPhoneNum2bIsvalid attribute reference
	 */
	public ConditionReference getFlgPhoneNum2bIsvalidReference() {
		return wsEditPhoneNum2b.getCondition(flgPhoneNum2bIsvalid);	
	}

	/**
	 * Getter for flgPhoneNum2bIsvalid attribute.
	 * @return flgPhoneNum2bIsvalid attribute
	 */
	public boolean isFlgPhoneNum2bIsvalid() {
		return getFlgPhoneNum2bIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum2bIsvalid attribute.
	 * @param flgPhoneNum2bIsvalid the new value of flgPhoneNum2bIsvalid
	 */
	public void setFlgPhoneNum2bIsvalid(boolean flgPhoneNum2bIsvalid) {
		getFlgPhoneNum2bIsvalidReference().setValue(flgPhoneNum2bIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum2bNotOk.
	 * @return the flgPhoneNum2bNotOk attribute reference
	 */
	public ConditionReference getFlgPhoneNum2bNotOkReference() {
		return wsEditPhoneNum2b.getCondition(flgPhoneNum2bNotOk);	
	}

	/**
	 * Getter for flgPhoneNum2bNotOk attribute.
	 * @return flgPhoneNum2bNotOk attribute
	 */
	public boolean isFlgPhoneNum2bNotOk() {
		return getFlgPhoneNum2bNotOkReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum2bNotOk attribute.
	 * @param flgPhoneNum2bNotOk the new value of flgPhoneNum2bNotOk
	 */
	public void setFlgPhoneNum2bNotOk(boolean flgPhoneNum2bNotOk) {
		getFlgPhoneNum2bNotOkReference().setValue(flgPhoneNum2bNotOk);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum2bBlank.
	 * @return the flgPhoneNum2bBlank attribute reference
	 */
	public ConditionReference getFlgPhoneNum2bBlankReference() {
		return wsEditPhoneNum2b.getCondition(flgPhoneNum2bBlank);	
	}

	/**
	 * Getter for flgPhoneNum2bBlank attribute.
	 * @return flgPhoneNum2bBlank attribute
	 */
	public boolean isFlgPhoneNum2bBlank() {
		return getFlgPhoneNum2bBlankReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum2bBlank attribute.
	 * @param flgPhoneNum2bBlank the new value of flgPhoneNum2bBlank
	 */
	public void setFlgPhoneNum2bBlank(boolean flgPhoneNum2bBlank) {
		getFlgPhoneNum2bBlankReference().setValue(flgPhoneNum2bBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditPhoneNum2c.
	 * @return the wsEditPhoneNum2c attribute reference
	 */
	public ElementaryRangeReference getWsEditPhoneNum2cReference() {
		return wsEditPhoneNum2c.getReference();
	}

	/**
	 * Getter for wsEditPhoneNum2c attribute.
	 * @return wsEditPhoneNum2c attribute
	 */
	public String getWsEditPhoneNum2c() {
		return wsEditPhoneNum2c.getValue();
	}

	/**
	 * Setter for wsEditPhoneNum2c attribute.
	 * @param wsEditPhoneNum2c the new value of wsEditPhoneNum2c
	 */
	public void setWsEditPhoneNum2c(String wsEditPhoneNum2c) {
		this.wsEditPhoneNum2c.setValue(wsEditPhoneNum2c);
	}
	/**
	 * Gets the reference for attribute flgPhoneNum2cIsvalid.
	 * @return the flgPhoneNum2cIsvalid attribute reference
	 */
	public ConditionReference getFlgPhoneNum2cIsvalidReference() {
		return wsEditPhoneNum2c.getCondition(flgPhoneNum2cIsvalid);	
	}

	/**
	 * Getter for flgPhoneNum2cIsvalid attribute.
	 * @return flgPhoneNum2cIsvalid attribute
	 */
	public boolean isFlgPhoneNum2cIsvalid() {
		return getFlgPhoneNum2cIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum2cIsvalid attribute.
	 * @param flgPhoneNum2cIsvalid the new value of flgPhoneNum2cIsvalid
	 */
	public void setFlgPhoneNum2cIsvalid(boolean flgPhoneNum2cIsvalid) {
		getFlgPhoneNum2cIsvalidReference().setValue(flgPhoneNum2cIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum2cNotOk.
	 * @return the flgPhoneNum2cNotOk attribute reference
	 */
	public ConditionReference getFlgPhoneNum2cNotOkReference() {
		return wsEditPhoneNum2c.getCondition(flgPhoneNum2cNotOk);	
	}

	/**
	 * Getter for flgPhoneNum2cNotOk attribute.
	 * @return flgPhoneNum2cNotOk attribute
	 */
	public boolean isFlgPhoneNum2cNotOk() {
		return getFlgPhoneNum2cNotOkReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum2cNotOk attribute.
	 * @param flgPhoneNum2cNotOk the new value of flgPhoneNum2cNotOk
	 */
	public void setFlgPhoneNum2cNotOk(boolean flgPhoneNum2cNotOk) {
		getFlgPhoneNum2cNotOkReference().setValue(flgPhoneNum2cNotOk);	
	}
	/**
	 * Gets the reference for attribute flgPhoneNum2cBlank.
	 * @return the flgPhoneNum2cBlank attribute reference
	 */
	public ConditionReference getFlgPhoneNum2cBlankReference() {
		return wsEditPhoneNum2c.getCondition(flgPhoneNum2cBlank);	
	}

	/**
	 * Getter for flgPhoneNum2cBlank attribute.
	 * @return flgPhoneNum2cBlank attribute
	 */
	public boolean isFlgPhoneNum2cBlank() {
		return getFlgPhoneNum2cBlankReference().getValue();	
	}

	/**
	 * Setter for flgPhoneNum2cBlank attribute.
	 * @param flgPhoneNum2cBlank the new value of flgPhoneNum2cBlank
	 */
	public void setFlgPhoneNum2cBlank(boolean flgPhoneNum2cBlank) {
		getFlgPhoneNum2cBlankReference().setValue(flgPhoneNum2cBlank);	
	}
	/**
	 * Gets the reference for attribute wsEftAccountIdFlgs.
	 * @return the wsEftAccountIdFlgs attribute reference
	 */
	public ElementaryRangeReference getWsEftAccountIdFlgsReference() {
		return wsEftAccountIdFlgs.getReference();
	}

	/**
	 * Getter for wsEftAccountIdFlgs attribute.
	 * @return wsEftAccountIdFlgs attribute
	 */
	public String getWsEftAccountIdFlgs() {
		return wsEftAccountIdFlgs.getValue();
	}

	/**
	 * Setter for wsEftAccountIdFlgs attribute.
	 * @param wsEftAccountIdFlgs the new value of wsEftAccountIdFlgs
	 */
	public void setWsEftAccountIdFlgs(String wsEftAccountIdFlgs) {
		this.wsEftAccountIdFlgs.setValue(wsEftAccountIdFlgs);
	}
	/**
	 * Gets the reference for attribute flgEftAccountIdIsvalid.
	 * @return the flgEftAccountIdIsvalid attribute reference
	 */
	public ConditionReference getFlgEftAccountIdIsvalidReference() {
		return wsEftAccountIdFlgs.getCondition(flgEftAccountIdIsvalid);	
	}

	/**
	 * Getter for flgEftAccountIdIsvalid attribute.
	 * @return flgEftAccountIdIsvalid attribute
	 */
	public boolean isFlgEftAccountIdIsvalid() {
		return getFlgEftAccountIdIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgEftAccountIdIsvalid attribute.
	 * @param flgEftAccountIdIsvalid the new value of flgEftAccountIdIsvalid
	 */
	public void setFlgEftAccountIdIsvalid(boolean flgEftAccountIdIsvalid) {
		getFlgEftAccountIdIsvalidReference().setValue(flgEftAccountIdIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgEftAccountIdNotOk.
	 * @return the flgEftAccountIdNotOk attribute reference
	 */
	public ConditionReference getFlgEftAccountIdNotOkReference() {
		return wsEftAccountIdFlgs.getCondition(flgEftAccountIdNotOk);	
	}

	/**
	 * Getter for flgEftAccountIdNotOk attribute.
	 * @return flgEftAccountIdNotOk attribute
	 */
	public boolean isFlgEftAccountIdNotOk() {
		return getFlgEftAccountIdNotOkReference().getValue();	
	}

	/**
	 * Setter for flgEftAccountIdNotOk attribute.
	 * @param flgEftAccountIdNotOk the new value of flgEftAccountIdNotOk
	 */
	public void setFlgEftAccountIdNotOk(boolean flgEftAccountIdNotOk) {
		getFlgEftAccountIdNotOkReference().setValue(flgEftAccountIdNotOk);	
	}
	/**
	 * Gets the reference for attribute flgEftAccountIdBlank.
	 * @return the flgEftAccountIdBlank attribute reference
	 */
	public ConditionReference getFlgEftAccountIdBlankReference() {
		return wsEftAccountIdFlgs.getCondition(flgEftAccountIdBlank);	
	}

	/**
	 * Getter for flgEftAccountIdBlank attribute.
	 * @return flgEftAccountIdBlank attribute
	 */
	public boolean isFlgEftAccountIdBlank() {
		return getFlgEftAccountIdBlankReference().getValue();	
	}

	/**
	 * Setter for flgEftAccountIdBlank attribute.
	 * @param flgEftAccountIdBlank the new value of flgEftAccountIdBlank
	 */
	public void setFlgEftAccountIdBlank(boolean flgEftAccountIdBlank) {
		getFlgEftAccountIdBlankReference().setValue(flgEftAccountIdBlank);	
	}
	/**
	 * Gets the reference for attribute wsEditPriCardholder.
	 * @return the wsEditPriCardholder attribute reference
	 */
	public ElementaryRangeReference getWsEditPriCardholderReference() {
		return wsEditPriCardholder.getReference();
	}

	/**
	 * Getter for wsEditPriCardholder attribute.
	 * @return wsEditPriCardholder attribute
	 */
	public String getWsEditPriCardholder() {
		return wsEditPriCardholder.getValue();
	}

	/**
	 * Setter for wsEditPriCardholder attribute.
	 * @param wsEditPriCardholder the new value of wsEditPriCardholder
	 */
	public void setWsEditPriCardholder(String wsEditPriCardholder) {
		this.wsEditPriCardholder.setValue(wsEditPriCardholder);
	}
	/**
	 * Gets the reference for attribute flgPriCardholderIsvalid.
	 * @return the flgPriCardholderIsvalid attribute reference
	 */
	public ConditionReference getFlgPriCardholderIsvalidReference() {
		return wsEditPriCardholder.getCondition(flgPriCardholderIsvalid);	
	}

	/**
	 * Getter for flgPriCardholderIsvalid attribute.
	 * @return flgPriCardholderIsvalid attribute
	 */
	public boolean isFlgPriCardholderIsvalid() {
		return getFlgPriCardholderIsvalidReference().getValue();	
	}

	/**
	 * Setter for flgPriCardholderIsvalid attribute.
	 * @param flgPriCardholderIsvalid the new value of flgPriCardholderIsvalid
	 */
	public void setFlgPriCardholderIsvalid(boolean flgPriCardholderIsvalid) {
		getFlgPriCardholderIsvalidReference().setValue(flgPriCardholderIsvalid);	
	}
	/**
	 * Gets the reference for attribute flgPriCardholderNotOk.
	 * @return the flgPriCardholderNotOk attribute reference
	 */
	public ConditionReference getFlgPriCardholderNotOkReference() {
		return wsEditPriCardholder.getCondition(flgPriCardholderNotOk);	
	}

	/**
	 * Getter for flgPriCardholderNotOk attribute.
	 * @return flgPriCardholderNotOk attribute
	 */
	public boolean isFlgPriCardholderNotOk() {
		return getFlgPriCardholderNotOkReference().getValue();	
	}

	/**
	 * Setter for flgPriCardholderNotOk attribute.
	 * @param flgPriCardholderNotOk the new value of flgPriCardholderNotOk
	 */
	public void setFlgPriCardholderNotOk(boolean flgPriCardholderNotOk) {
		getFlgPriCardholderNotOkReference().setValue(flgPriCardholderNotOk);	
	}
	/**
	 * Gets the reference for attribute flgPriCardholderBlank.
	 * @return the flgPriCardholderBlank attribute reference
	 */
	public ConditionReference getFlgPriCardholderBlankReference() {
		return wsEditPriCardholder.getCondition(flgPriCardholderBlank);	
	}

	/**
	 * Getter for flgPriCardholderBlank attribute.
	 * @return flgPriCardholderBlank attribute
	 */
	public boolean isFlgPriCardholderBlank() {
		return getFlgPriCardholderBlankReference().getValue();	
	}

	/**
	 * Setter for flgPriCardholderBlank attribute.
	 * @param flgPriCardholderBlank the new value of flgPriCardholderBlank
	 */
	public void setFlgPriCardholderBlank(boolean flgPriCardholderBlank) {
		getFlgPriCardholderBlankReference().setValue(flgPriCardholderBlank);	
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
	 * Gets the reference for attribute custAcctIdX.
	 * @return the custAcctIdX attribute reference
	 */
	public ElementaryRangeReference getCustAcctIdXReference() {
		return custAcctIdX.getReference();
	}

	/**
	 * Getter for custAcctIdX attribute.
	 * @return custAcctIdX attribute
	 */
	public String getCustAcctIdX() {
		return custAcctIdX.getValue();
	}

	/**
	 * Setter for custAcctIdX attribute.
	 * @param custAcctIdX the new value of custAcctIdX
	 */
	public void setCustAcctIdX(String custAcctIdX) {
		this.custAcctIdX.setValue(custAcctIdX);
	}
	/**
	 * Gets the reference for attribute custAcctIdN.
	 * @return the custAcctIdN attribute reference
	 */
	public ElementaryRangeReference getCustAcctIdNReference() {
		return custAcctIdN.getReference();
	}

	/**
	 * Getter for custAcctIdN attribute.
	 * @return custAcctIdN attribute
	 */
	public long getCustAcctIdN() {
		return custAcctIdN.getValue();
	}

	/**
	 * Setter for custAcctIdN attribute.
	 * @param custAcctIdN the new value of custAcctIdN
	 */
	public void setCustAcctIdN(long custAcctIdN) {
		this.custAcctIdN.setValue(custAcctIdN);
	}
	/**
	 * Gets the reference for attribute wsEditDateXYear.
	 * @return the wsEditDateXYear attribute reference
	 */
	public ElementaryRangeReference getWsEditDateXYearReference() {
		return wsEditDateXYear.getReference();
	}

	/**
	 * Getter for wsEditDateXYear attribute.
	 * @return wsEditDateXYear attribute
	 */
	public String getWsEditDateXYear() {
		return wsEditDateXYear.getValue();
	}

	/**
	 * Setter for wsEditDateXYear attribute.
	 * @param wsEditDateXYear the new value of wsEditDateXYear
	 */
	public void setWsEditDateXYear(String wsEditDateXYear) {
		this.wsEditDateXYear.setValue(wsEditDateXYear);
	}
	/**
	 * Gets the reference for attribute wsEditDateMonth.
	 * @return the wsEditDateMonth attribute reference
	 */
	public ElementaryRangeReference getWsEditDateMonthReference() {
		return wsEditDateMonth.getReference();
	}

	/**
	 * Getter for wsEditDateMonth attribute.
	 * @return wsEditDateMonth attribute
	 */
	public String getWsEditDateMonth() {
		return wsEditDateMonth.getValue();
	}

	/**
	 * Setter for wsEditDateMonth attribute.
	 * @param wsEditDateMonth the new value of wsEditDateMonth
	 */
	public void setWsEditDateMonth(String wsEditDateMonth) {
		this.wsEditDateMonth.setValue(wsEditDateMonth);
	}
	/**
	 * Gets the reference for attribute wsEditDateDay.
	 * @return the wsEditDateDay attribute reference
	 */
	public ElementaryRangeReference getWsEditDateDayReference() {
		return wsEditDateDay.getReference();
	}

	/**
	 * Getter for wsEditDateDay attribute.
	 * @return wsEditDateDay attribute
	 */
	public String getWsEditDateDay() {
		return wsEditDateDay.getValue();
	}

	/**
	 * Setter for wsEditDateDay attribute.
	 * @param wsEditDateDay the new value of wsEditDateDay
	 */
	public void setWsEditDateDay(String wsEditDateDay) {
		this.wsEditDateDay.setValue(wsEditDateDay);
	}
	/**
	 * Gets the reference for attribute wsEditCurrency92.
	 * @return the wsEditCurrency92 attribute reference
	 */
	public ElementaryRangeReference getWsEditCurrency92Reference() {
		return wsEditCurrency92.getReference();
	}

	/**
	 * Getter for wsEditCurrency92 attribute.
	 * @return wsEditCurrency92 attribute
	 */
	public String getWsEditCurrency92() {
		return wsEditCurrency92.getValue();
	}

	/**
	 * Setter for wsEditCurrency92 attribute.
	 * @param wsEditCurrency92 the new value of wsEditCurrency92
	 */
	public void setWsEditCurrency92(String wsEditCurrency92) {
		this.wsEditCurrency92.setValue(wsEditCurrency92);
	}
	/**
	 * Gets the reference for attribute wsEditCurrency92F.
	 * @return the wsEditCurrency92F attribute reference
	 */
	public ElementaryRangeReference getWsEditCurrency92FReference() {
		return wsEditCurrency92F.getReference();
	}

	/**
	 * Getter for wsEditCurrency92F attribute.
	 * @return wsEditCurrency92F attribute
	 */
	public String getWsEditCurrency92F() {
		return wsEditCurrency92F.getValue();
	}

	/**
	 * Setter for wsEditCurrency92F attribute.
	 * @param wsEditCurrency92F the new value of wsEditCurrency92F
	 */
	public void setWsEditCurrency92F(String wsEditCurrency92F) {
		this.wsEditCurrency92F.setValue(wsEditCurrency92F);
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
	 * Gets the reference for attribute alphaVarsForDataEditing.
	 * @return the alphaVarsForDataEditing attribute reference
	 */
	public RangeReference getAlphaVarsForDataEditingReference() {
		return alphaVarsForDataEditing.getReference();
	}	
				
	/**
	 * Setter for alphaVarsForDataEditing .
	 */
   	public void setAlphaVarsForDataEditing(RangeReference reference) {
       	alphaVarsForDataEditing.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewCreditLimitX.
	 * @return the acupNewCreditLimitX attribute reference
	 */
	public ElementaryRangeReference getAcupNewCreditLimitXReference() {
		return acupNewCreditLimitX.getReference();
	}

	/**
	 * Getter for acupNewCreditLimitX attribute.
	 * @return acupNewCreditLimitX attribute
	 */
	public String getAcupNewCreditLimitX() {
		return acupNewCreditLimitX.getValue();
	}

	/**
	 * Setter for acupNewCreditLimitX attribute.
	 * @param acupNewCreditLimitX the new value of acupNewCreditLimitX
	 */
	public void setAcupNewCreditLimitX(String acupNewCreditLimitX) {
		this.acupNewCreditLimitX.setValue(acupNewCreditLimitX);
	}
	/**
	 * Gets the reference for attribute acupNewCashCreditLimitX.
	 * @return the acupNewCashCreditLimitX attribute reference
	 */
	public ElementaryRangeReference getAcupNewCashCreditLimitXReference() {
		return acupNewCashCreditLimitX.getReference();
	}

	/**
	 * Getter for acupNewCashCreditLimitX attribute.
	 * @return acupNewCashCreditLimitX attribute
	 */
	public String getAcupNewCashCreditLimitX() {
		return acupNewCashCreditLimitX.getValue();
	}

	/**
	 * Setter for acupNewCashCreditLimitX attribute.
	 * @param acupNewCashCreditLimitX the new value of acupNewCashCreditLimitX
	 */
	public void setAcupNewCashCreditLimitX(String acupNewCashCreditLimitX) {
		this.acupNewCashCreditLimitX.setValue(acupNewCashCreditLimitX);
	}
	/**
	 * Gets the reference for attribute acupNewCurrBalX.
	 * @return the acupNewCurrBalX attribute reference
	 */
	public ElementaryRangeReference getAcupNewCurrBalXReference() {
		return acupNewCurrBalX.getReference();
	}

	/**
	 * Getter for acupNewCurrBalX attribute.
	 * @return acupNewCurrBalX attribute
	 */
	public String getAcupNewCurrBalX() {
		return acupNewCurrBalX.getValue();
	}

	/**
	 * Setter for acupNewCurrBalX attribute.
	 * @param acupNewCurrBalX the new value of acupNewCurrBalX
	 */
	public void setAcupNewCurrBalX(String acupNewCurrBalX) {
		this.acupNewCurrBalX.setValue(acupNewCurrBalX);
	}
	/**
	 * Gets the reference for attribute acupNewCurrCycCreditX.
	 * @return the acupNewCurrCycCreditX attribute reference
	 */
	public ElementaryRangeReference getAcupNewCurrCycCreditXReference() {
		return acupNewCurrCycCreditX.getReference();
	}

	/**
	 * Getter for acupNewCurrCycCreditX attribute.
	 * @return acupNewCurrCycCreditX attribute
	 */
	public String getAcupNewCurrCycCreditX() {
		return acupNewCurrCycCreditX.getValue();
	}

	/**
	 * Setter for acupNewCurrCycCreditX attribute.
	 * @param acupNewCurrCycCreditX the new value of acupNewCurrCycCreditX
	 */
	public void setAcupNewCurrCycCreditX(String acupNewCurrCycCreditX) {
		this.acupNewCurrCycCreditX.setValue(acupNewCurrCycCreditX);
	}
	/**
	 * Gets the reference for attribute acupNewCurrCycDebitX.
	 * @return the acupNewCurrCycDebitX attribute reference
	 */
	public ElementaryRangeReference getAcupNewCurrCycDebitXReference() {
		return acupNewCurrCycDebitX.getReference();
	}

	/**
	 * Getter for acupNewCurrCycDebitX attribute.
	 * @return acupNewCurrCycDebitX attribute
	 */
	public String getAcupNewCurrCycDebitX() {
		return acupNewCurrCycDebitX.getValue();
	}

	/**
	 * Setter for acupNewCurrCycDebitX attribute.
	 * @param acupNewCurrCycDebitX the new value of acupNewCurrCycDebitX
	 */
	public void setAcupNewCurrCycDebitX(String acupNewCurrCycDebitX) {
		this.acupNewCurrCycDebitX.setValue(acupNewCurrCycDebitX);
	}
	
	/**
	 * Gets the reference for attribute acctUpdateRecord.
	 * @return the acctUpdateRecord attribute reference
	 */
	public RangeReference getAcctUpdateRecordReference() {
		return acctUpdateRecord.getReference();
	}	
				
	/**
	 * Setter for acctUpdateRecord .
	 */
   	public void setAcctUpdateRecord(RangeReference reference) {
       	acctUpdateRecord.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acctUpdateId.
	 * @return the acctUpdateId attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateIdReference() {
		return acctUpdateId.getReference();
	}

	/**
	 * Getter for acctUpdateId attribute.
	 * @return acctUpdateId attribute
	 */
	public long getAcctUpdateId() {
		return acctUpdateId.getValue();
	}

	/**
	 * Setter for acctUpdateId attribute.
	 * @param acctUpdateId the new value of acctUpdateId
	 */
	public void setAcctUpdateId(long acctUpdateId) {
		this.acctUpdateId.setValue(acctUpdateId);
	}
	/**
	 * Gets the reference for attribute acctUpdateActiveStatus.
	 * @return the acctUpdateActiveStatus attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateActiveStatusReference() {
		return acctUpdateActiveStatus.getReference();
	}

	/**
	 * Getter for acctUpdateActiveStatus attribute.
	 * @return acctUpdateActiveStatus attribute
	 */
	public String getAcctUpdateActiveStatus() {
		return acctUpdateActiveStatus.getValue();
	}

	/**
	 * Setter for acctUpdateActiveStatus attribute.
	 * @param acctUpdateActiveStatus the new value of acctUpdateActiveStatus
	 */
	public void setAcctUpdateActiveStatus(String acctUpdateActiveStatus) {
		this.acctUpdateActiveStatus.setValue(acctUpdateActiveStatus);
	}
	/**
	 * Gets the reference for attribute acctUpdateCurrBal.
	 * @return the acctUpdateCurrBal attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateCurrBalReference() {
		return acctUpdateCurrBal.getReference();
	}

	/**
	 * Getter for acctUpdateCurrBal attribute.
	 * @return acctUpdateCurrBal attribute
	 */
	public BigDecimal getAcctUpdateCurrBal() {
		return acctUpdateCurrBal.getValue();
	}

	/**
	 * Setter for acctUpdateCurrBal attribute.
	 * @param acctUpdateCurrBal the new value of acctUpdateCurrBal
	 */
	public void setAcctUpdateCurrBal(BigDecimal acctUpdateCurrBal) {
		this.acctUpdateCurrBal.setValue(acctUpdateCurrBal);
	}
	/**
	 * Gets the reference for attribute acctUpdateCreditLimit.
	 * @return the acctUpdateCreditLimit attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateCreditLimitReference() {
		return acctUpdateCreditLimit.getReference();
	}

	/**
	 * Getter for acctUpdateCreditLimit attribute.
	 * @return acctUpdateCreditLimit attribute
	 */
	public BigDecimal getAcctUpdateCreditLimit() {
		return acctUpdateCreditLimit.getValue();
	}

	/**
	 * Setter for acctUpdateCreditLimit attribute.
	 * @param acctUpdateCreditLimit the new value of acctUpdateCreditLimit
	 */
	public void setAcctUpdateCreditLimit(BigDecimal acctUpdateCreditLimit) {
		this.acctUpdateCreditLimit.setValue(acctUpdateCreditLimit);
	}
	/**
	 * Gets the reference for attribute acctUpdateCashCreditLimit.
	 * @return the acctUpdateCashCreditLimit attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateCashCreditLimitReference() {
		return acctUpdateCashCreditLimit.getReference();
	}

	/**
	 * Getter for acctUpdateCashCreditLimit attribute.
	 * @return acctUpdateCashCreditLimit attribute
	 */
	public BigDecimal getAcctUpdateCashCreditLimit() {
		return acctUpdateCashCreditLimit.getValue();
	}

	/**
	 * Setter for acctUpdateCashCreditLimit attribute.
	 * @param acctUpdateCashCreditLimit the new value of acctUpdateCashCreditLimit
	 */
	public void setAcctUpdateCashCreditLimit(BigDecimal acctUpdateCashCreditLimit) {
		this.acctUpdateCashCreditLimit.setValue(acctUpdateCashCreditLimit);
	}
	/**
	 * Gets the reference for attribute acctUpdateOpenDate.
	 * @return the acctUpdateOpenDate attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateOpenDateReference() {
		return acctUpdateOpenDate.getReference();
	}

	/**
	 * Getter for acctUpdateOpenDate attribute.
	 * @return acctUpdateOpenDate attribute
	 */
	public String getAcctUpdateOpenDate() {
		return acctUpdateOpenDate.getValue();
	}

	/**
	 * Setter for acctUpdateOpenDate attribute.
	 * @param acctUpdateOpenDate the new value of acctUpdateOpenDate
	 */
	public void setAcctUpdateOpenDate(String acctUpdateOpenDate) {
		this.acctUpdateOpenDate.setValue(acctUpdateOpenDate);
	}
	/**
	 * Gets the reference for attribute acctUpdateExpiraionDate.
	 * @return the acctUpdateExpiraionDate attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateExpiraionDateReference() {
		return acctUpdateExpiraionDate.getReference();
	}

	/**
	 * Getter for acctUpdateExpiraionDate attribute.
	 * @return acctUpdateExpiraionDate attribute
	 */
	public String getAcctUpdateExpiraionDate() {
		return acctUpdateExpiraionDate.getValue();
	}

	/**
	 * Setter for acctUpdateExpiraionDate attribute.
	 * @param acctUpdateExpiraionDate the new value of acctUpdateExpiraionDate
	 */
	public void setAcctUpdateExpiraionDate(String acctUpdateExpiraionDate) {
		this.acctUpdateExpiraionDate.setValue(acctUpdateExpiraionDate);
	}
	/**
	 * Gets the reference for attribute acctUpdateReissueDate.
	 * @return the acctUpdateReissueDate attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateReissueDateReference() {
		return acctUpdateReissueDate.getReference();
	}

	/**
	 * Getter for acctUpdateReissueDate attribute.
	 * @return acctUpdateReissueDate attribute
	 */
	public String getAcctUpdateReissueDate() {
		return acctUpdateReissueDate.getValue();
	}

	/**
	 * Setter for acctUpdateReissueDate attribute.
	 * @param acctUpdateReissueDate the new value of acctUpdateReissueDate
	 */
	public void setAcctUpdateReissueDate(String acctUpdateReissueDate) {
		this.acctUpdateReissueDate.setValue(acctUpdateReissueDate);
	}
	/**
	 * Gets the reference for attribute acctUpdateCurrCycCredit.
	 * @return the acctUpdateCurrCycCredit attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateCurrCycCreditReference() {
		return acctUpdateCurrCycCredit.getReference();
	}

	/**
	 * Getter for acctUpdateCurrCycCredit attribute.
	 * @return acctUpdateCurrCycCredit attribute
	 */
	public BigDecimal getAcctUpdateCurrCycCredit() {
		return acctUpdateCurrCycCredit.getValue();
	}

	/**
	 * Setter for acctUpdateCurrCycCredit attribute.
	 * @param acctUpdateCurrCycCredit the new value of acctUpdateCurrCycCredit
	 */
	public void setAcctUpdateCurrCycCredit(BigDecimal acctUpdateCurrCycCredit) {
		this.acctUpdateCurrCycCredit.setValue(acctUpdateCurrCycCredit);
	}
	/**
	 * Gets the reference for attribute acctUpdateCurrCycDebit.
	 * @return the acctUpdateCurrCycDebit attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateCurrCycDebitReference() {
		return acctUpdateCurrCycDebit.getReference();
	}

	/**
	 * Getter for acctUpdateCurrCycDebit attribute.
	 * @return acctUpdateCurrCycDebit attribute
	 */
	public BigDecimal getAcctUpdateCurrCycDebit() {
		return acctUpdateCurrCycDebit.getValue();
	}

	/**
	 * Setter for acctUpdateCurrCycDebit attribute.
	 * @param acctUpdateCurrCycDebit the new value of acctUpdateCurrCycDebit
	 */
	public void setAcctUpdateCurrCycDebit(BigDecimal acctUpdateCurrCycDebit) {
		this.acctUpdateCurrCycDebit.setValue(acctUpdateCurrCycDebit);
	}
	/**
	 * Gets the reference for attribute acctUpdateGroupId.
	 * @return the acctUpdateGroupId attribute reference
	 */
	public ElementaryRangeReference getAcctUpdateGroupIdReference() {
		return acctUpdateGroupId.getReference();
	}

	/**
	 * Getter for acctUpdateGroupId attribute.
	 * @return acctUpdateGroupId attribute
	 */
	public String getAcctUpdateGroupId() {
		return acctUpdateGroupId.getValue();
	}

	/**
	 * Setter for acctUpdateGroupId attribute.
	 * @param acctUpdateGroupId the new value of acctUpdateGroupId
	 */
	public void setAcctUpdateGroupId(String acctUpdateGroupId) {
		this.acctUpdateGroupId.setValue(acctUpdateGroupId);
	}
	
	/**
	 * Gets the reference for attribute custUpdateRecord.
	 * @return the custUpdateRecord attribute reference
	 */
	public RangeReference getCustUpdateRecordReference() {
		return custUpdateRecord.getReference();
	}	
				
	/**
	 * Setter for custUpdateRecord .
	 */
   	public void setCustUpdateRecord(RangeReference reference) {
       	custUpdateRecord.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute custUpdateId.
	 * @return the custUpdateId attribute reference
	 */
	public ElementaryRangeReference getCustUpdateIdReference() {
		return custUpdateId.getReference();
	}

	/**
	 * Getter for custUpdateId attribute.
	 * @return custUpdateId attribute
	 */
	public int getCustUpdateId() {
		return custUpdateId.getValue();
	}

	/**
	 * Setter for custUpdateId attribute.
	 * @param custUpdateId the new value of custUpdateId
	 */
	public void setCustUpdateId(int custUpdateId) {
		this.custUpdateId.setValue(custUpdateId);
	}
	/**
	 * Gets the reference for attribute custUpdateFirstName.
	 * @return the custUpdateFirstName attribute reference
	 */
	public ElementaryRangeReference getCustUpdateFirstNameReference() {
		return custUpdateFirstName.getReference();
	}

	/**
	 * Getter for custUpdateFirstName attribute.
	 * @return custUpdateFirstName attribute
	 */
	public String getCustUpdateFirstName() {
		return custUpdateFirstName.getValue();
	}

	/**
	 * Setter for custUpdateFirstName attribute.
	 * @param custUpdateFirstName the new value of custUpdateFirstName
	 */
	public void setCustUpdateFirstName(String custUpdateFirstName) {
		this.custUpdateFirstName.setValue(custUpdateFirstName);
	}
	/**
	 * Gets the reference for attribute custUpdateMiddleName.
	 * @return the custUpdateMiddleName attribute reference
	 */
	public ElementaryRangeReference getCustUpdateMiddleNameReference() {
		return custUpdateMiddleName.getReference();
	}

	/**
	 * Getter for custUpdateMiddleName attribute.
	 * @return custUpdateMiddleName attribute
	 */
	public String getCustUpdateMiddleName() {
		return custUpdateMiddleName.getValue();
	}

	/**
	 * Setter for custUpdateMiddleName attribute.
	 * @param custUpdateMiddleName the new value of custUpdateMiddleName
	 */
	public void setCustUpdateMiddleName(String custUpdateMiddleName) {
		this.custUpdateMiddleName.setValue(custUpdateMiddleName);
	}
	/**
	 * Gets the reference for attribute custUpdateLastName.
	 * @return the custUpdateLastName attribute reference
	 */
	public ElementaryRangeReference getCustUpdateLastNameReference() {
		return custUpdateLastName.getReference();
	}

	/**
	 * Getter for custUpdateLastName attribute.
	 * @return custUpdateLastName attribute
	 */
	public String getCustUpdateLastName() {
		return custUpdateLastName.getValue();
	}

	/**
	 * Setter for custUpdateLastName attribute.
	 * @param custUpdateLastName the new value of custUpdateLastName
	 */
	public void setCustUpdateLastName(String custUpdateLastName) {
		this.custUpdateLastName.setValue(custUpdateLastName);
	}
	/**
	 * Gets the reference for attribute custUpdateAddrLine1.
	 * @return the custUpdateAddrLine1 attribute reference
	 */
	public ElementaryRangeReference getCustUpdateAddrLine1Reference() {
		return custUpdateAddrLine1.getReference();
	}

	/**
	 * Getter for custUpdateAddrLine1 attribute.
	 * @return custUpdateAddrLine1 attribute
	 */
	public String getCustUpdateAddrLine1() {
		return custUpdateAddrLine1.getValue();
	}

	/**
	 * Setter for custUpdateAddrLine1 attribute.
	 * @param custUpdateAddrLine1 the new value of custUpdateAddrLine1
	 */
	public void setCustUpdateAddrLine1(String custUpdateAddrLine1) {
		this.custUpdateAddrLine1.setValue(custUpdateAddrLine1);
	}
	/**
	 * Gets the reference for attribute custUpdateAddrLine2.
	 * @return the custUpdateAddrLine2 attribute reference
	 */
	public ElementaryRangeReference getCustUpdateAddrLine2Reference() {
		return custUpdateAddrLine2.getReference();
	}

	/**
	 * Getter for custUpdateAddrLine2 attribute.
	 * @return custUpdateAddrLine2 attribute
	 */
	public String getCustUpdateAddrLine2() {
		return custUpdateAddrLine2.getValue();
	}

	/**
	 * Setter for custUpdateAddrLine2 attribute.
	 * @param custUpdateAddrLine2 the new value of custUpdateAddrLine2
	 */
	public void setCustUpdateAddrLine2(String custUpdateAddrLine2) {
		this.custUpdateAddrLine2.setValue(custUpdateAddrLine2);
	}
	/**
	 * Gets the reference for attribute custUpdateAddrLine3.
	 * @return the custUpdateAddrLine3 attribute reference
	 */
	public ElementaryRangeReference getCustUpdateAddrLine3Reference() {
		return custUpdateAddrLine3.getReference();
	}

	/**
	 * Getter for custUpdateAddrLine3 attribute.
	 * @return custUpdateAddrLine3 attribute
	 */
	public String getCustUpdateAddrLine3() {
		return custUpdateAddrLine3.getValue();
	}

	/**
	 * Setter for custUpdateAddrLine3 attribute.
	 * @param custUpdateAddrLine3 the new value of custUpdateAddrLine3
	 */
	public void setCustUpdateAddrLine3(String custUpdateAddrLine3) {
		this.custUpdateAddrLine3.setValue(custUpdateAddrLine3);
	}
	/**
	 * Gets the reference for attribute custUpdateAddrStateCd.
	 * @return the custUpdateAddrStateCd attribute reference
	 */
	public ElementaryRangeReference getCustUpdateAddrStateCdReference() {
		return custUpdateAddrStateCd.getReference();
	}

	/**
	 * Getter for custUpdateAddrStateCd attribute.
	 * @return custUpdateAddrStateCd attribute
	 */
	public String getCustUpdateAddrStateCd() {
		return custUpdateAddrStateCd.getValue();
	}

	/**
	 * Setter for custUpdateAddrStateCd attribute.
	 * @param custUpdateAddrStateCd the new value of custUpdateAddrStateCd
	 */
	public void setCustUpdateAddrStateCd(String custUpdateAddrStateCd) {
		this.custUpdateAddrStateCd.setValue(custUpdateAddrStateCd);
	}
	/**
	 * Gets the reference for attribute custUpdateAddrCountryCd.
	 * @return the custUpdateAddrCountryCd attribute reference
	 */
	public ElementaryRangeReference getCustUpdateAddrCountryCdReference() {
		return custUpdateAddrCountryCd.getReference();
	}

	/**
	 * Getter for custUpdateAddrCountryCd attribute.
	 * @return custUpdateAddrCountryCd attribute
	 */
	public String getCustUpdateAddrCountryCd() {
		return custUpdateAddrCountryCd.getValue();
	}

	/**
	 * Setter for custUpdateAddrCountryCd attribute.
	 * @param custUpdateAddrCountryCd the new value of custUpdateAddrCountryCd
	 */
	public void setCustUpdateAddrCountryCd(String custUpdateAddrCountryCd) {
		this.custUpdateAddrCountryCd.setValue(custUpdateAddrCountryCd);
	}
	/**
	 * Gets the reference for attribute custUpdateAddrZip.
	 * @return the custUpdateAddrZip attribute reference
	 */
	public ElementaryRangeReference getCustUpdateAddrZipReference() {
		return custUpdateAddrZip.getReference();
	}

	/**
	 * Getter for custUpdateAddrZip attribute.
	 * @return custUpdateAddrZip attribute
	 */
	public String getCustUpdateAddrZip() {
		return custUpdateAddrZip.getValue();
	}

	/**
	 * Setter for custUpdateAddrZip attribute.
	 * @param custUpdateAddrZip the new value of custUpdateAddrZip
	 */
	public void setCustUpdateAddrZip(String custUpdateAddrZip) {
		this.custUpdateAddrZip.setValue(custUpdateAddrZip);
	}
	/**
	 * Gets the reference for attribute custUpdatePhoneNum1.
	 * @return the custUpdatePhoneNum1 attribute reference
	 */
	public ElementaryRangeReference getCustUpdatePhoneNum1Reference() {
		return custUpdatePhoneNum1.getReference();
	}

	/**
	 * Getter for custUpdatePhoneNum1 attribute.
	 * @return custUpdatePhoneNum1 attribute
	 */
	public String getCustUpdatePhoneNum1() {
		return custUpdatePhoneNum1.getValue();
	}

	/**
	 * Setter for custUpdatePhoneNum1 attribute.
	 * @param custUpdatePhoneNum1 the new value of custUpdatePhoneNum1
	 */
	public void setCustUpdatePhoneNum1(String custUpdatePhoneNum1) {
		this.custUpdatePhoneNum1.setValue(custUpdatePhoneNum1);
	}
	/**
	 * Gets the reference for attribute custUpdatePhoneNum2.
	 * @return the custUpdatePhoneNum2 attribute reference
	 */
	public ElementaryRangeReference getCustUpdatePhoneNum2Reference() {
		return custUpdatePhoneNum2.getReference();
	}

	/**
	 * Getter for custUpdatePhoneNum2 attribute.
	 * @return custUpdatePhoneNum2 attribute
	 */
	public String getCustUpdatePhoneNum2() {
		return custUpdatePhoneNum2.getValue();
	}

	/**
	 * Setter for custUpdatePhoneNum2 attribute.
	 * @param custUpdatePhoneNum2 the new value of custUpdatePhoneNum2
	 */
	public void setCustUpdatePhoneNum2(String custUpdatePhoneNum2) {
		this.custUpdatePhoneNum2.setValue(custUpdatePhoneNum2);
	}
	/**
	 * Gets the reference for attribute custUpdateSsn.
	 * @return the custUpdateSsn attribute reference
	 */
	public ElementaryRangeReference getCustUpdateSsnReference() {
		return custUpdateSsn.getReference();
	}

	/**
	 * Getter for custUpdateSsn attribute.
	 * @return custUpdateSsn attribute
	 */
	public int getCustUpdateSsn() {
		return custUpdateSsn.getValue();
	}

	/**
	 * Setter for custUpdateSsn attribute.
	 * @param custUpdateSsn the new value of custUpdateSsn
	 */
	public void setCustUpdateSsn(int custUpdateSsn) {
		this.custUpdateSsn.setValue(custUpdateSsn);
	}
	/**
	 * Gets the reference for attribute custUpdateGovtIssuedId.
	 * @return the custUpdateGovtIssuedId attribute reference
	 */
	public ElementaryRangeReference getCustUpdateGovtIssuedIdReference() {
		return custUpdateGovtIssuedId.getReference();
	}

	/**
	 * Getter for custUpdateGovtIssuedId attribute.
	 * @return custUpdateGovtIssuedId attribute
	 */
	public String getCustUpdateGovtIssuedId() {
		return custUpdateGovtIssuedId.getValue();
	}

	/**
	 * Setter for custUpdateGovtIssuedId attribute.
	 * @param custUpdateGovtIssuedId the new value of custUpdateGovtIssuedId
	 */
	public void setCustUpdateGovtIssuedId(String custUpdateGovtIssuedId) {
		this.custUpdateGovtIssuedId.setValue(custUpdateGovtIssuedId);
	}
	/**
	 * Gets the reference for attribute custUpdateDobYyyyMmDd.
	 * @return the custUpdateDobYyyyMmDd attribute reference
	 */
	public ElementaryRangeReference getCustUpdateDobYyyyMmDdReference() {
		return custUpdateDobYyyyMmDd.getReference();
	}

	/**
	 * Getter for custUpdateDobYyyyMmDd attribute.
	 * @return custUpdateDobYyyyMmDd attribute
	 */
	public String getCustUpdateDobYyyyMmDd() {
		return custUpdateDobYyyyMmDd.getValue();
	}

	/**
	 * Setter for custUpdateDobYyyyMmDd attribute.
	 * @param custUpdateDobYyyyMmDd the new value of custUpdateDobYyyyMmDd
	 */
	public void setCustUpdateDobYyyyMmDd(String custUpdateDobYyyyMmDd) {
		this.custUpdateDobYyyyMmDd.setValue(custUpdateDobYyyyMmDd);
	}
	/**
	 * Gets the reference for attribute custUpdateEftAccountId.
	 * @return the custUpdateEftAccountId attribute reference
	 */
	public ElementaryRangeReference getCustUpdateEftAccountIdReference() {
		return custUpdateEftAccountId.getReference();
	}

	/**
	 * Getter for custUpdateEftAccountId attribute.
	 * @return custUpdateEftAccountId attribute
	 */
	public String getCustUpdateEftAccountId() {
		return custUpdateEftAccountId.getValue();
	}

	/**
	 * Setter for custUpdateEftAccountId attribute.
	 * @param custUpdateEftAccountId the new value of custUpdateEftAccountId
	 */
	public void setCustUpdateEftAccountId(String custUpdateEftAccountId) {
		this.custUpdateEftAccountId.setValue(custUpdateEftAccountId);
	}
	/**
	 * Gets the reference for attribute custUpdatePriCardInd.
	 * @return the custUpdatePriCardInd attribute reference
	 */
	public ElementaryRangeReference getCustUpdatePriCardIndReference() {
		return custUpdatePriCardInd.getReference();
	}

	/**
	 * Getter for custUpdatePriCardInd attribute.
	 * @return custUpdatePriCardInd attribute
	 */
	public String getCustUpdatePriCardInd() {
		return custUpdatePriCardInd.getValue();
	}

	/**
	 * Setter for custUpdatePriCardInd attribute.
	 * @param custUpdatePriCardInd the new value of custUpdatePriCardInd
	 */
	public void setCustUpdatePriCardInd(String custUpdatePriCardInd) {
		this.custUpdatePriCardInd.setValue(custUpdatePriCardInd);
	}
	/**
	 * Gets the reference for attribute custUpdateFicoCreditScore.
	 * @return the custUpdateFicoCreditScore attribute reference
	 */
	public ElementaryRangeReference getCustUpdateFicoCreditScoreReference() {
		return custUpdateFicoCreditScore.getReference();
	}

	/**
	 * Getter for custUpdateFicoCreditScore attribute.
	 * @return custUpdateFicoCreditScore attribute
	 */
	public int getCustUpdateFicoCreditScore() {
		return custUpdateFicoCreditScore.getValue();
	}

	/**
	 * Setter for custUpdateFicoCreditScore attribute.
	 * @param custUpdateFicoCreditScore the new value of custUpdateFicoCreditScore
	 */
	public void setCustUpdateFicoCreditScore(int custUpdateFicoCreditScore) {
		this.custUpdateFicoCreditScore.setValue(custUpdateFicoCreditScore);
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
	 * Gets the reference for attribute foundAccountData.
	 * @return the foundAccountData attribute reference
	 */
	public ConditionReference getFoundAccountDataReference() {
		return wsInfoMsg.getCondition(foundAccountData);	
	}

	/**
	 * Getter for foundAccountData attribute.
	 * @return foundAccountData attribute
	 */
	public boolean isFoundAccountData() {
		return getFoundAccountDataReference().getValue();	
	}

	/**
	 * Setter for foundAccountData attribute.
	 * @param foundAccountData the new value of foundAccountData
	 */
	public void setFoundAccountData(boolean foundAccountData) {
		getFoundAccountDataReference().setValue(foundAccountData);	
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
	 * Gets the reference for attribute wsPromptForLastname.
	 * @return the wsPromptForLastname attribute reference
	 */
	public ConditionReference getWsPromptForLastnameReference() {
		return wsReturnMsg.getCondition(wsPromptForLastname);	
	}

	/**
	 * Getter for wsPromptForLastname attribute.
	 * @return wsPromptForLastname attribute
	 */
	public boolean isWsPromptForLastname() {
		return getWsPromptForLastnameReference().getValue();	
	}

	/**
	 * Setter for wsPromptForLastname attribute.
	 * @param wsPromptForLastname the new value of wsPromptForLastname
	 */
	public void setWsPromptForLastname(boolean wsPromptForLastname) {
		getWsPromptForLastnameReference().setValue(wsPromptForLastname);	
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
	 * Gets the reference for attribute acctStatusMustBeYesNo.
	 * @return the acctStatusMustBeYesNo attribute reference
	 */
	public ConditionReference getAcctStatusMustBeYesNoReference() {
		return wsReturnMsg.getCondition(acctStatusMustBeYesNo);	
	}

	/**
	 * Getter for acctStatusMustBeYesNo attribute.
	 * @return acctStatusMustBeYesNo attribute
	 */
	public boolean isAcctStatusMustBeYesNo() {
		return getAcctStatusMustBeYesNoReference().getValue();	
	}

	/**
	 * Setter for acctStatusMustBeYesNo attribute.
	 * @param acctStatusMustBeYesNo the new value of acctStatusMustBeYesNo
	 */
	public void setAcctStatusMustBeYesNo(boolean acctStatusMustBeYesNo) {
		getAcctStatusMustBeYesNoReference().setValue(acctStatusMustBeYesNo);	
	}
	/**
	 * Gets the reference for attribute credLimitIsBlank.
	 * @return the credLimitIsBlank attribute reference
	 */
	public ConditionReference getCredLimitIsBlankReference() {
		return wsReturnMsg.getCondition(credLimitIsBlank);	
	}

	/**
	 * Getter for credLimitIsBlank attribute.
	 * @return credLimitIsBlank attribute
	 */
	public boolean isCredLimitIsBlank() {
		return getCredLimitIsBlankReference().getValue();	
	}

	/**
	 * Setter for credLimitIsBlank attribute.
	 * @param credLimitIsBlank the new value of credLimitIsBlank
	 */
	public void setCredLimitIsBlank(boolean credLimitIsBlank) {
		getCredLimitIsBlankReference().setValue(credLimitIsBlank);	
	}
	/**
	 * Gets the reference for attribute credLimitIsNotValid.
	 * @return the credLimitIsNotValid attribute reference
	 */
	public ConditionReference getCredLimitIsNotValidReference() {
		return wsReturnMsg.getCondition(credLimitIsNotValid);	
	}

	/**
	 * Getter for credLimitIsNotValid attribute.
	 * @return credLimitIsNotValid attribute
	 */
	public boolean isCredLimitIsNotValid() {
		return getCredLimitIsNotValidReference().getValue();	
	}

	/**
	 * Setter for credLimitIsNotValid attribute.
	 * @param credLimitIsNotValid the new value of credLimitIsNotValid
	 */
	public void setCredLimitIsNotValid(boolean credLimitIsNotValid) {
		getCredLimitIsNotValidReference().setValue(credLimitIsNotValid);	
	}
	/**
	 * Gets the reference for attribute thisMonthNotValid.
	 * @return the thisMonthNotValid attribute reference
	 */
	public ConditionReference getThisMonthNotValidReference() {
		return wsReturnMsg.getCondition(thisMonthNotValid);	
	}

	/**
	 * Getter for thisMonthNotValid attribute.
	 * @return thisMonthNotValid attribute
	 */
	public boolean isThisMonthNotValid() {
		return getThisMonthNotValidReference().getValue();	
	}

	/**
	 * Setter for thisMonthNotValid attribute.
	 * @param thisMonthNotValid the new value of thisMonthNotValid
	 */
	public void setThisMonthNotValid(boolean thisMonthNotValid) {
		getThisMonthNotValidReference().setValue(thisMonthNotValid);	
	}
	/**
	 * Gets the reference for attribute thisYearNotValid.
	 * @return the thisYearNotValid attribute reference
	 */
	public ConditionReference getThisYearNotValidReference() {
		return wsReturnMsg.getCondition(thisYearNotValid);	
	}

	/**
	 * Getter for thisYearNotValid attribute.
	 * @return thisYearNotValid attribute
	 */
	public boolean isThisYearNotValid() {
		return getThisYearNotValidReference().getValue();	
	}

	/**
	 * Setter for thisYearNotValid attribute.
	 * @param thisYearNotValid the new value of thisYearNotValid
	 */
	public void setThisYearNotValid(boolean thisYearNotValid) {
		getThisYearNotValidReference().setValue(thisYearNotValid);	
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
	 * Gets the reference for attribute couldNotLockAcctForUpdate.
	 * @return the couldNotLockAcctForUpdate attribute reference
	 */
	public ConditionReference getCouldNotLockAcctForUpdateReference() {
		return wsReturnMsg.getCondition(couldNotLockAcctForUpdate);	
	}

	/**
	 * Getter for couldNotLockAcctForUpdate attribute.
	 * @return couldNotLockAcctForUpdate attribute
	 */
	public boolean isCouldNotLockAcctForUpdate() {
		return getCouldNotLockAcctForUpdateReference().getValue();	
	}

	/**
	 * Setter for couldNotLockAcctForUpdate attribute.
	 * @param couldNotLockAcctForUpdate the new value of couldNotLockAcctForUpdate
	 */
	public void setCouldNotLockAcctForUpdate(boolean couldNotLockAcctForUpdate) {
		getCouldNotLockAcctForUpdateReference().setValue(couldNotLockAcctForUpdate);	
	}
	/**
	 * Gets the reference for attribute couldNotLockCustForUpdate.
	 * @return the couldNotLockCustForUpdate attribute reference
	 */
	public ConditionReference getCouldNotLockCustForUpdateReference() {
		return wsReturnMsg.getCondition(couldNotLockCustForUpdate);	
	}

	/**
	 * Getter for couldNotLockCustForUpdate attribute.
	 * @return couldNotLockCustForUpdate attribute
	 */
	public boolean isCouldNotLockCustForUpdate() {
		return getCouldNotLockCustForUpdateReference().getValue();	
	}

	/**
	 * Setter for couldNotLockCustForUpdate attribute.
	 * @param couldNotLockCustForUpdate the new value of couldNotLockCustForUpdate
	 */
	public void setCouldNotLockCustForUpdate(boolean couldNotLockCustForUpdate) {
		getCouldNotLockCustForUpdateReference().setValue(couldNotLockCustForUpdate);	
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
