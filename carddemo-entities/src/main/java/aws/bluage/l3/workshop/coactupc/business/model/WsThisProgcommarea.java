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
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
import org.apache.commons.lang3.tuple.Pair;
/**
 * Data simplifier entity WsThisProgcommarea.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:57 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'acctUpdateScreenData' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.AcctUpdateScreenData
 * <br></p>
 * 
 * <p>About 'acupOldDetails' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.AcupOldDetails
 * <br></p>
 * 
 * <p>About 'acupNewDetails' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.AcupNewDetails
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsThisProgcommarea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group acctUpdateScreenData = new Group(root);
	private final Elementary acupChangeAction = new Elementary(acctUpdateScreenData,new AlphanumericType(1),Record.LOW_VALUES);
	private final ConditionName acupDetailsNotFetched=new ConditionName(acupChangeAction,Record.LOW_VALUES,
	" ");
	private final ConditionName acupShowDetails=new ConditionName(acupChangeAction,"S");
	private final ConditionName acupChangesMade=new ConditionName(acupChangeAction,"E",
	"N",
	"C",
	"L",
	"F");
	private final ConditionName acupChangesNotOk=new ConditionName(acupChangeAction,"E");
	private final ConditionName acupChangesOkNotConfirmed=new ConditionName(acupChangeAction,"N");
	private final ConditionName acupChangesOkayedAndDone=new ConditionName(acupChangeAction,"C");
	private final ConditionName acupChangesFailed=new ConditionName(acupChangeAction,"L",
	"F");
	private final ConditionName acupChangesOkayedLockError=new ConditionName(acupChangeAction,"L");
	private final ConditionName acupChangesOkayedButFailed=new ConditionName(acupChangeAction,"F");
	private final Group acupOldDetails = new Group(root);
	private final Group acupOldAcctData = new Group(acupOldDetails);
	private final Union union = new Union(acupOldAcctData);
	private final Elementary acupOldAcctIdX = new Elementary(union,new AlphanumericType(11));
	private final Elementary acupOldAcctId = new Elementary(union,new ZonedType(11, 0, false));
	private final Elementary acupOldActiveStatus = new Elementary(acupOldAcctData,new AlphanumericType(1));
	private final Union union1 = new Union(acupOldAcctData);
	private final Elementary acupOldCurrBal = new Elementary(union1,new AlphanumericType(12));
	private final Elementary acupOldCurrBalN = new Elementary(union1,new ZonedType(10, 2, false, false, true));
	private final Union union2 = new Union(acupOldAcctData);
	private final Elementary acupOldCreditLimit = new Elementary(union2,new AlphanumericType(12));
	private final Elementary acupOldCreditLimitN = new Elementary(union2,new ZonedType(10, 2, false, false, true));
	private final Union union3 = new Union(acupOldAcctData);
	private final Elementary acupOldCashCreditLimit = new Elementary(union3,new AlphanumericType(12));
	private final Elementary acupOldCashCreditLimitN = new Elementary(union3,new ZonedType(10, 2, false, false, true));
	private final Union union4 = new Union(acupOldAcctData);
	private final Elementary acupOldOpenDate = new Elementary(union4,new AlphanumericType(8));
	private final Group acupOldOpenDateParts = new Group(union4);
	private final Elementary acupOldOpenYear = new Elementary(acupOldOpenDateParts,new AlphanumericType(4));
	private final Elementary acupOldOpenMon = new Elementary(acupOldOpenDateParts,new AlphanumericType(2));
	private final Elementary acupOldOpenDay = new Elementary(acupOldOpenDateParts,new AlphanumericType(2));
	private final Union union5 = new Union(acupOldAcctData);
	private final Elementary acupOldExpiraionDate = new Elementary(union5,new AlphanumericType(8));
	private final Group acupOldExpiraionDateParts = new Group(union5);
	private final Elementary acupOldExpYear = new Elementary(acupOldExpiraionDateParts,new AlphanumericType(4));
	private final Elementary acupOldExpMon = new Elementary(acupOldExpiraionDateParts,new AlphanumericType(2));
	private final Elementary acupOldExpDay = new Elementary(acupOldExpiraionDateParts,new AlphanumericType(2));
	private final Union union6 = new Union(acupOldAcctData);
	private final Elementary acupOldReissueDate = new Elementary(union6,new AlphanumericType(8));
	private final Group acupOldReissueDateParts = new Group(union6);
	private final Elementary acupOldReissueYear = new Elementary(acupOldReissueDateParts,new AlphanumericType(4));
	private final Elementary acupOldReissueMon = new Elementary(acupOldReissueDateParts,new AlphanumericType(2));
	private final Elementary acupOldReissueDay = new Elementary(acupOldReissueDateParts,new AlphanumericType(2));
	private final Union union7 = new Union(acupOldAcctData);
	private final Elementary acupOldCurrCycCredit = new Elementary(union7,new AlphanumericType(12));
	private final Elementary acupOldCurrCycCreditN = new Elementary(union7,new ZonedType(10, 2, false, false, true));
	private final Union union8 = new Union(acupOldAcctData);
	private final Elementary acupOldCurrCycDebit = new Elementary(union8,new AlphanumericType(12));
	private final Elementary acupOldCurrCycDebitN = new Elementary(union8,new ZonedType(10, 2, false, false, true));
	private final Elementary acupOldGroupId = new Elementary(acupOldAcctData,new AlphanumericType(10));
	private final Group acupOldCustData = new Group(acupOldDetails);
	private final Union union9 = new Union(acupOldCustData);
	private final Elementary acupOldCustIdX = new Elementary(union9,new AlphanumericType(9));
	private final Elementary acupOldCustId = new Elementary(union9,new ZonedType(9, 0, false));
	private final Elementary acupOldCustFirstName = new Elementary(acupOldCustData,new AlphanumericType(25));
	private final Elementary acupOldCustMiddleName = new Elementary(acupOldCustData,new AlphanumericType(25));
	private final Elementary acupOldCustLastName = new Elementary(acupOldCustData,new AlphanumericType(25));
	private final Elementary acupOldCustAddrLine1 = new Elementary(acupOldCustData,new AlphanumericType(50));
	private final Elementary acupOldCustAddrLine2 = new Elementary(acupOldCustData,new AlphanumericType(50));
	private final Elementary acupOldCustAddrLine3 = new Elementary(acupOldCustData,new AlphanumericType(50));
	private final Elementary acupOldCustAddrStateCd = new Elementary(acupOldCustData,new AlphanumericType(2));
	private final Elementary acupOldCustAddrCountryCd = new Elementary(acupOldCustData,new AlphanumericType(3));
	private final Elementary acupOldCustAddrZip = new Elementary(acupOldCustData,new AlphanumericType(10));
	private final Union union10 = new Union(acupOldCustData);
	private final Elementary acupOldCustPhoneNum1 = new Elementary(union10,new AlphanumericType(15));
	private final Group acupOldCustPhoneNum1X = new Group(union10);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(acupOldCustPhoneNum1X,new AlphanumericType(1));
	private final Elementary acupOldCustPhoneNum1a = new Elementary(acupOldCustPhoneNum1X,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(acupOldCustPhoneNum1X,new AlphanumericType(1));
	private final Elementary acupOldCustPhoneNum1b = new Elementary(acupOldCustPhoneNum1X,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(acupOldCustPhoneNum1X,new AlphanumericType(1));
	private final Elementary acupOldCustPhoneNum1c = new Elementary(acupOldCustPhoneNum1X,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(acupOldCustPhoneNum1X,new AlphanumericType(2));
	private final Union union11 = new Union(acupOldCustData);
	private final Elementary acupOldCustPhoneNum2 = new Elementary(union11,new AlphanumericType(15));
	private final Group acupOldCustPhoneNum2X = new Group(union11);
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(acupOldCustPhoneNum2X,new AlphanumericType(1));
	private final Elementary acupOldCustPhoneNum2a = new Elementary(acupOldCustPhoneNum2X,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(acupOldCustPhoneNum2X,new AlphanumericType(1));
	private final Elementary acupOldCustPhoneNum2b = new Elementary(acupOldCustPhoneNum2X,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(acupOldCustPhoneNum2X,new AlphanumericType(1));
	private final Elementary acupOldCustPhoneNum2c = new Elementary(acupOldCustPhoneNum2X,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(acupOldCustPhoneNum2X,new AlphanumericType(2));
	private final Union union12 = new Union(acupOldCustData);
	private final Elementary acupOldCustSsnX = new Elementary(union12,new AlphanumericType(9));
	private final Elementary acupOldCustSsn = new Elementary(union12,new ZonedType(9, 0, false));
	private final Elementary acupOldCustGovtIssuedId = new Elementary(acupOldCustData,new AlphanumericType(20));
	private final Union union13 = new Union(acupOldCustData);
	private final Elementary acupOldCustDobYyyyMmDd = new Elementary(union13,new AlphanumericType(8));
	private final Group acupOldCustDobParts = new Group(union13);
	private final Elementary acupOldCustDobYear = new Elementary(acupOldCustDobParts,new AlphanumericType(4));
	private final Elementary acupOldCustDobMon = new Elementary(acupOldCustDobParts,new AlphanumericType(2));
	private final Elementary acupOldCustDobDay = new Elementary(acupOldCustDobParts,new AlphanumericType(2));
	private final Elementary acupOldCustEftAccountId = new Elementary(acupOldCustData,new AlphanumericType(10));
	private final Elementary acupOldCustPriHolderInd = new Elementary(acupOldCustData,new AlphanumericType(1));
	private final Union union14 = new Union(acupOldCustData);
	private final Elementary acupOldCustFicoScoreX = new Elementary(union14,new AlphanumericType(3));
	private final Elementary acupOldCustFicoScore = new Elementary(union14,new ZonedType(3, 0, false));
	private final Group acupNewDetails = new Group(root);
	private final Group acupNewAcctData = new Group(acupNewDetails);
	private final Union union15 = new Union(acupNewAcctData);
	private final Elementary acupNewAcctIdX = new Elementary(union15,new AlphanumericType(11));
	private final Elementary acupNewAcctId = new Elementary(union15,new ZonedType(11, 0, false));
	private final Elementary acupNewActiveStatus = new Elementary(acupNewAcctData,new AlphanumericType(1));
	private final Union union16 = new Union(acupNewAcctData);
	private final Elementary acupNewCurrBal = new Elementary(union16,new AlphanumericType(12));
	private final Elementary acupNewCurrBalN = new Elementary(union16,new ZonedType(10, 2, false, false, true));
	private final Union union17 = new Union(acupNewAcctData);
	private final Elementary acupNewCreditLimit = new Elementary(union17,new AlphanumericType(12));
	private final Elementary acupNewCreditLimitN = new Elementary(union17,new ZonedType(10, 2, false, false, true));
	private final Union union18 = new Union(acupNewAcctData);
	private final Elementary acupNewCashCreditLimit = new Elementary(union18,new AlphanumericType(12));
	private final Elementary acupNewCashCreditLimitN = new Elementary(union18,new ZonedType(10, 2, false, false, true));
	private final Union union19 = new Union(acupNewAcctData);
	private final Elementary acupNewOpenDate = new Elementary(union19,new AlphanumericType(8));
	private final Group acupNewOpenDateParts = new Group(union19);
	private final Elementary acupNewOpenYear = new Elementary(acupNewOpenDateParts,new AlphanumericType(4));
	private final Elementary acupNewOpenMon = new Elementary(acupNewOpenDateParts,new AlphanumericType(2));
	private final Elementary acupNewOpenDay = new Elementary(acupNewOpenDateParts,new AlphanumericType(2));
	private final Union union20 = new Union(acupNewAcctData);
	private final Elementary acupNewExpiraionDate = new Elementary(union20,new AlphanumericType(8));
	private final Group acupNewExpiraionDateParts = new Group(union20);
	private final Elementary acupNewExpYear = new Elementary(acupNewExpiraionDateParts,new AlphanumericType(4));
	private final Elementary acupNewExpMon = new Elementary(acupNewExpiraionDateParts,new AlphanumericType(2));
	private final Elementary acupNewExpDay = new Elementary(acupNewExpiraionDateParts,new AlphanumericType(2));
	private final Union union21 = new Union(acupNewAcctData);
	private final Elementary acupNewReissueDate = new Elementary(union21,new AlphanumericType(8));
	private final Group acupNewReissueDateParts = new Group(union21);
	private final Elementary acupNewReissueYear = new Elementary(acupNewReissueDateParts,new AlphanumericType(4));
	private final Elementary acupNewReissueMon = new Elementary(acupNewReissueDateParts,new AlphanumericType(2));
	private final Elementary acupNewReissueDay = new Elementary(acupNewReissueDateParts,new AlphanumericType(2));
	private final Union union22 = new Union(acupNewAcctData);
	private final Elementary acupNewCurrCycCredit = new Elementary(union22,new AlphanumericType(12));
	private final Elementary acupNewCurrCycCreditN = new Elementary(union22,new ZonedType(10, 2, false, false, true));
	private final Union union23 = new Union(acupNewAcctData);
	private final Elementary acupNewCurrCycDebit = new Elementary(union23,new AlphanumericType(12));
	private final Elementary acupNewCurrCycDebitN = new Elementary(union23,new ZonedType(10, 2, false, false, true));
	private final Elementary acupNewGroupId = new Elementary(acupNewAcctData,new AlphanumericType(10));
	private final Group acupNewCustData = new Group(acupNewDetails);
	private final Union union24 = new Union(acupNewCustData);
	private final Elementary acupNewCustIdX = new Elementary(union24,new AlphanumericType(9));
	private final Elementary acupNewCustId = new Elementary(union24,new ZonedType(9, 0, false));
	private final Elementary acupNewCustFirstName = new Elementary(acupNewCustData,new AlphanumericType(25));
	private final Elementary acupNewCustMiddleName = new Elementary(acupNewCustData,new AlphanumericType(25));
	private final Elementary acupNewCustLastName = new Elementary(acupNewCustData,new AlphanumericType(25));
	private final Elementary acupNewCustAddrLine1 = new Elementary(acupNewCustData,new AlphanumericType(50));
	private final Elementary acupNewCustAddrLine2 = new Elementary(acupNewCustData,new AlphanumericType(50));
	private final Elementary acupNewCustAddrLine3 = new Elementary(acupNewCustData,new AlphanumericType(50));
	private final Elementary acupNewCustAddrStateCd = new Elementary(acupNewCustData,new AlphanumericType(2));
	private final Elementary acupNewCustAddrCountryCd = new Elementary(acupNewCustData,new AlphanumericType(3));
	private final Elementary acupNewCustAddrZip = new Elementary(acupNewCustData,new AlphanumericType(10));
	private final Union union25 = new Union(acupNewCustData);
	private final Elementary acupNewCustPhoneNum1 = new Elementary(union25,new AlphanumericType(15));
	private final Group acupNewCustPhoneNum1X = new Group(union25);
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(acupNewCustPhoneNum1X,new AlphanumericType(1));
	private final Elementary acupNewCustPhoneNum1a = new Elementary(acupNewCustPhoneNum1X,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(acupNewCustPhoneNum1X,new AlphanumericType(1));
	private final Elementary acupNewCustPhoneNum1b = new Elementary(acupNewCustPhoneNum1X,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(acupNewCustPhoneNum1X,new AlphanumericType(1));
	private final Elementary acupNewCustPhoneNum1c = new Elementary(acupNewCustPhoneNum1X,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(acupNewCustPhoneNum1X,new AlphanumericType(2));
	private final Union union26 = new Union(acupNewCustData);
	private final Elementary acupNewCustPhoneNum2 = new Elementary(union26,new AlphanumericType(15));
	private final Group acupNewCustPhoneNum2X = new Group(union26);
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(acupNewCustPhoneNum2X,new AlphanumericType(1));
	private final Elementary acupNewCustPhoneNum2a = new Elementary(acupNewCustPhoneNum2X,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(acupNewCustPhoneNum2X,new AlphanumericType(1));
	private final Elementary acupNewCustPhoneNum2b = new Elementary(acupNewCustPhoneNum2X,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(acupNewCustPhoneNum2X,new AlphanumericType(1));
	private final Elementary acupNewCustPhoneNum2c = new Elementary(acupNewCustPhoneNum2X,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(acupNewCustPhoneNum2X,new AlphanumericType(2));
	private final Union union27 = new Union(acupNewCustData);
	private final Group acupNewCustSsnX = new Group(union27);
	private final Elementary acupNewCustSsn1 = new Elementary(acupNewCustSsnX,new AlphanumericType(3));
	private final Elementary acupNewCustSsn2 = new Elementary(acupNewCustSsnX,new AlphanumericType(2));
	private final Elementary acupNewCustSsn3 = new Elementary(acupNewCustSsnX,new AlphanumericType(4));
	private final Elementary acupNewCustSsn = new Elementary(union27,new ZonedType(9, 0, false));
	private final Elementary acupNewCustGovtIssuedId = new Elementary(acupNewCustData,new AlphanumericType(20));
	private final Union union28 = new Union(acupNewCustData);
	private final Elementary acupNewCustDobYyyyMmDd = new Elementary(union28,new AlphanumericType(8));
	private final Group acupNewCustDobParts = new Group(union28);
	private final Elementary acupNewCustDobYear = new Elementary(acupNewCustDobParts,new AlphanumericType(4));
	private final Elementary acupNewCustDobMon = new Elementary(acupNewCustDobParts,new AlphanumericType(2));
	private final Elementary acupNewCustDobDay = new Elementary(acupNewCustDobParts,new AlphanumericType(2));
	private final Elementary acupNewCustEftAccountId = new Elementary(acupNewCustData,new AlphanumericType(10));
	private final Elementary acupNewCustPriHolderInd = new Elementary(acupNewCustData,new AlphanumericType(1));
	private final Union union29 = new Union(acupNewCustData);
	private final Elementary acupNewCustFicoScoreX = new Elementary(union29,new AlphanumericType(3));
	private final Elementary acupNewCustFicoScore = new Elementary(union29,new ZonedType(3, 0, false));
	private final ConditionName ficoRangeIsValid=new ConditionName(acupNewCustFicoScore,Pair.of(new BigDecimal("300"),new BigDecimal("850")));
	

	/**
	 * Instantiate a new WsThisProgcommarea with a default record.
	 * @param configuration the configuration
	 */
	public WsThisProgcommarea(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsThisProgcommarea bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsThisProgcommarea(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute acctUpdateScreenData.
	 * @return the acctUpdateScreenData attribute reference
	 */
	public RangeReference getAcctUpdateScreenDataReference() {
		return acctUpdateScreenData.getReference();
	}	
				
	/**
	 * Setter for acctUpdateScreenData .
	 */
   	public void setAcctUpdateScreenData(RangeReference reference) {
       	acctUpdateScreenData.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupChangeAction.
	 * @return the acupChangeAction attribute reference
	 */
	public ElementaryRangeReference getAcupChangeActionReference() {
		return acupChangeAction.getReference();
	}

	/**
	 * Getter for acupChangeAction attribute.
	 * @return acupChangeAction attribute
	 */
	public String getAcupChangeAction() {
		return acupChangeAction.getValue();
	}

	/**
	 * Setter for acupChangeAction attribute.
	 * @param acupChangeAction the new value of acupChangeAction
	 */
	public void setAcupChangeAction(String acupChangeAction) {
		this.acupChangeAction.setValue(acupChangeAction);
	}
	/**
	 * Gets the reference for attribute acupDetailsNotFetched.
	 * @return the acupDetailsNotFetched attribute reference
	 */
	public ConditionReference getAcupDetailsNotFetchedReference() {
		return acupChangeAction.getCondition(acupDetailsNotFetched);	
	}

	/**
	 * Getter for acupDetailsNotFetched attribute.
	 * @return acupDetailsNotFetched attribute
	 */
	public boolean isAcupDetailsNotFetched() {
		return getAcupDetailsNotFetchedReference().getValue();	
	}

	/**
	 * Setter for acupDetailsNotFetched attribute.
	 * @param acupDetailsNotFetched the new value of acupDetailsNotFetched
	 */
	public void setAcupDetailsNotFetched(boolean acupDetailsNotFetched) {
		getAcupDetailsNotFetchedReference().setValue(acupDetailsNotFetched);	
	}
	/**
	 * Gets the reference for attribute acupShowDetails.
	 * @return the acupShowDetails attribute reference
	 */
	public ConditionReference getAcupShowDetailsReference() {
		return acupChangeAction.getCondition(acupShowDetails);	
	}

	/**
	 * Getter for acupShowDetails attribute.
	 * @return acupShowDetails attribute
	 */
	public boolean isAcupShowDetails() {
		return getAcupShowDetailsReference().getValue();	
	}

	/**
	 * Setter for acupShowDetails attribute.
	 * @param acupShowDetails the new value of acupShowDetails
	 */
	public void setAcupShowDetails(boolean acupShowDetails) {
		getAcupShowDetailsReference().setValue(acupShowDetails);	
	}
	/**
	 * Gets the reference for attribute acupChangesMade.
	 * @return the acupChangesMade attribute reference
	 */
	public ConditionReference getAcupChangesMadeReference() {
		return acupChangeAction.getCondition(acupChangesMade);	
	}

	/**
	 * Getter for acupChangesMade attribute.
	 * @return acupChangesMade attribute
	 */
	public boolean isAcupChangesMade() {
		return getAcupChangesMadeReference().getValue();	
	}

	/**
	 * Setter for acupChangesMade attribute.
	 * @param acupChangesMade the new value of acupChangesMade
	 */
	public void setAcupChangesMade(boolean acupChangesMade) {
		getAcupChangesMadeReference().setValue(acupChangesMade);	
	}
	/**
	 * Gets the reference for attribute acupChangesNotOk.
	 * @return the acupChangesNotOk attribute reference
	 */
	public ConditionReference getAcupChangesNotOkReference() {
		return acupChangeAction.getCondition(acupChangesNotOk);	
	}

	/**
	 * Getter for acupChangesNotOk attribute.
	 * @return acupChangesNotOk attribute
	 */
	public boolean isAcupChangesNotOk() {
		return getAcupChangesNotOkReference().getValue();	
	}

	/**
	 * Setter for acupChangesNotOk attribute.
	 * @param acupChangesNotOk the new value of acupChangesNotOk
	 */
	public void setAcupChangesNotOk(boolean acupChangesNotOk) {
		getAcupChangesNotOkReference().setValue(acupChangesNotOk);	
	}
	/**
	 * Gets the reference for attribute acupChangesOkNotConfirmed.
	 * @return the acupChangesOkNotConfirmed attribute reference
	 */
	public ConditionReference getAcupChangesOkNotConfirmedReference() {
		return acupChangeAction.getCondition(acupChangesOkNotConfirmed);	
	}

	/**
	 * Getter for acupChangesOkNotConfirmed attribute.
	 * @return acupChangesOkNotConfirmed attribute
	 */
	public boolean isAcupChangesOkNotConfirmed() {
		return getAcupChangesOkNotConfirmedReference().getValue();	
	}

	/**
	 * Setter for acupChangesOkNotConfirmed attribute.
	 * @param acupChangesOkNotConfirmed the new value of acupChangesOkNotConfirmed
	 */
	public void setAcupChangesOkNotConfirmed(boolean acupChangesOkNotConfirmed) {
		getAcupChangesOkNotConfirmedReference().setValue(acupChangesOkNotConfirmed);	
	}
	/**
	 * Gets the reference for attribute acupChangesOkayedAndDone.
	 * @return the acupChangesOkayedAndDone attribute reference
	 */
	public ConditionReference getAcupChangesOkayedAndDoneReference() {
		return acupChangeAction.getCondition(acupChangesOkayedAndDone);	
	}

	/**
	 * Getter for acupChangesOkayedAndDone attribute.
	 * @return acupChangesOkayedAndDone attribute
	 */
	public boolean isAcupChangesOkayedAndDone() {
		return getAcupChangesOkayedAndDoneReference().getValue();	
	}

	/**
	 * Setter for acupChangesOkayedAndDone attribute.
	 * @param acupChangesOkayedAndDone the new value of acupChangesOkayedAndDone
	 */
	public void setAcupChangesOkayedAndDone(boolean acupChangesOkayedAndDone) {
		getAcupChangesOkayedAndDoneReference().setValue(acupChangesOkayedAndDone);	
	}
	/**
	 * Gets the reference for attribute acupChangesFailed.
	 * @return the acupChangesFailed attribute reference
	 */
	public ConditionReference getAcupChangesFailedReference() {
		return acupChangeAction.getCondition(acupChangesFailed);	
	}

	/**
	 * Getter for acupChangesFailed attribute.
	 * @return acupChangesFailed attribute
	 */
	public boolean isAcupChangesFailed() {
		return getAcupChangesFailedReference().getValue();	
	}

	/**
	 * Setter for acupChangesFailed attribute.
	 * @param acupChangesFailed the new value of acupChangesFailed
	 */
	public void setAcupChangesFailed(boolean acupChangesFailed) {
		getAcupChangesFailedReference().setValue(acupChangesFailed);	
	}
	/**
	 * Gets the reference for attribute acupChangesOkayedLockError.
	 * @return the acupChangesOkayedLockError attribute reference
	 */
	public ConditionReference getAcupChangesOkayedLockErrorReference() {
		return acupChangeAction.getCondition(acupChangesOkayedLockError);	
	}

	/**
	 * Getter for acupChangesOkayedLockError attribute.
	 * @return acupChangesOkayedLockError attribute
	 */
	public boolean isAcupChangesOkayedLockError() {
		return getAcupChangesOkayedLockErrorReference().getValue();	
	}

	/**
	 * Setter for acupChangesOkayedLockError attribute.
	 * @param acupChangesOkayedLockError the new value of acupChangesOkayedLockError
	 */
	public void setAcupChangesOkayedLockError(boolean acupChangesOkayedLockError) {
		getAcupChangesOkayedLockErrorReference().setValue(acupChangesOkayedLockError);	
	}
	/**
	 * Gets the reference for attribute acupChangesOkayedButFailed.
	 * @return the acupChangesOkayedButFailed attribute reference
	 */
	public ConditionReference getAcupChangesOkayedButFailedReference() {
		return acupChangeAction.getCondition(acupChangesOkayedButFailed);	
	}

	/**
	 * Getter for acupChangesOkayedButFailed attribute.
	 * @return acupChangesOkayedButFailed attribute
	 */
	public boolean isAcupChangesOkayedButFailed() {
		return getAcupChangesOkayedButFailedReference().getValue();	
	}

	/**
	 * Setter for acupChangesOkayedButFailed attribute.
	 * @param acupChangesOkayedButFailed the new value of acupChangesOkayedButFailed
	 */
	public void setAcupChangesOkayedButFailed(boolean acupChangesOkayedButFailed) {
		getAcupChangesOkayedButFailedReference().setValue(acupChangesOkayedButFailed);	
	}
	
	/**
	 * Gets the reference for attribute acupOldDetails.
	 * @return the acupOldDetails attribute reference
	 */
	public RangeReference getAcupOldDetailsReference() {
		return acupOldDetails.getReference();
	}	
				
	/**
	 * Setter for acupOldDetails .
	 */
   	public void setAcupOldDetails(RangeReference reference) {
       	acupOldDetails.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute acupOldAcctData.
	 * @return the acupOldAcctData attribute reference
	 */
	public RangeReference getAcupOldAcctDataReference() {
		return acupOldAcctData.getReference();
	}	
				
	/**
	 * Setter for acupOldAcctData .
	 */
   	public void setAcupOldAcctData(RangeReference reference) {
       	acupOldAcctData.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupOldAcctIdX.
	 * @return the acupOldAcctIdX attribute reference
	 */
	public ElementaryRangeReference getAcupOldAcctIdXReference() {
		return acupOldAcctIdX.getReference();
	}

	/**
	 * Getter for acupOldAcctIdX attribute.
	 * @return acupOldAcctIdX attribute
	 */
	public String getAcupOldAcctIdX() {
		return acupOldAcctIdX.getValue();
	}

	/**
	 * Setter for acupOldAcctIdX attribute.
	 * @param acupOldAcctIdX the new value of acupOldAcctIdX
	 */
	public void setAcupOldAcctIdX(String acupOldAcctIdX) {
		this.acupOldAcctIdX.setValue(acupOldAcctIdX);
	}
	/**
	 * Gets the reference for attribute acupOldAcctId.
	 * @return the acupOldAcctId attribute reference
	 */
	public ElementaryRangeReference getAcupOldAcctIdReference() {
		return acupOldAcctId.getReference();
	}

	/**
	 * Getter for acupOldAcctId attribute.
	 * @return acupOldAcctId attribute
	 */
	public long getAcupOldAcctId() {
		return acupOldAcctId.getValue();
	}

	/**
	 * Setter for acupOldAcctId attribute.
	 * @param acupOldAcctId the new value of acupOldAcctId
	 */
	public void setAcupOldAcctId(long acupOldAcctId) {
		this.acupOldAcctId.setValue(acupOldAcctId);
	}
	/**
	 * Gets the reference for attribute acupOldActiveStatus.
	 * @return the acupOldActiveStatus attribute reference
	 */
	public ElementaryRangeReference getAcupOldActiveStatusReference() {
		return acupOldActiveStatus.getReference();
	}

	/**
	 * Getter for acupOldActiveStatus attribute.
	 * @return acupOldActiveStatus attribute
	 */
	public String getAcupOldActiveStatus() {
		return acupOldActiveStatus.getValue();
	}

	/**
	 * Setter for acupOldActiveStatus attribute.
	 * @param acupOldActiveStatus the new value of acupOldActiveStatus
	 */
	public void setAcupOldActiveStatus(String acupOldActiveStatus) {
		this.acupOldActiveStatus.setValue(acupOldActiveStatus);
	}
	/**
	 * Gets the reference for attribute acupOldCurrBal.
	 * @return the acupOldCurrBal attribute reference
	 */
	public ElementaryRangeReference getAcupOldCurrBalReference() {
		return acupOldCurrBal.getReference();
	}

	/**
	 * Getter for acupOldCurrBal attribute.
	 * @return acupOldCurrBal attribute
	 */
	public String getAcupOldCurrBal() {
		return acupOldCurrBal.getValue();
	}

	/**
	 * Setter for acupOldCurrBal attribute.
	 * @param acupOldCurrBal the new value of acupOldCurrBal
	 */
	public void setAcupOldCurrBal(String acupOldCurrBal) {
		this.acupOldCurrBal.setValue(acupOldCurrBal);
	}
	/**
	 * Gets the reference for attribute acupOldCurrBalN.
	 * @return the acupOldCurrBalN attribute reference
	 */
	public ElementaryRangeReference getAcupOldCurrBalNReference() {
		return acupOldCurrBalN.getReference();
	}

	/**
	 * Getter for acupOldCurrBalN attribute.
	 * @return acupOldCurrBalN attribute
	 */
	public BigDecimal getAcupOldCurrBalN() {
		return acupOldCurrBalN.getValue();
	}

	/**
	 * Setter for acupOldCurrBalN attribute.
	 * @param acupOldCurrBalN the new value of acupOldCurrBalN
	 */
	public void setAcupOldCurrBalN(BigDecimal acupOldCurrBalN) {
		this.acupOldCurrBalN.setValue(acupOldCurrBalN);
	}
	/**
	 * Gets the reference for attribute acupOldCreditLimit.
	 * @return the acupOldCreditLimit attribute reference
	 */
	public ElementaryRangeReference getAcupOldCreditLimitReference() {
		return acupOldCreditLimit.getReference();
	}

	/**
	 * Getter for acupOldCreditLimit attribute.
	 * @return acupOldCreditLimit attribute
	 */
	public String getAcupOldCreditLimit() {
		return acupOldCreditLimit.getValue();
	}

	/**
	 * Setter for acupOldCreditLimit attribute.
	 * @param acupOldCreditLimit the new value of acupOldCreditLimit
	 */
	public void setAcupOldCreditLimit(String acupOldCreditLimit) {
		this.acupOldCreditLimit.setValue(acupOldCreditLimit);
	}
	/**
	 * Gets the reference for attribute acupOldCreditLimitN.
	 * @return the acupOldCreditLimitN attribute reference
	 */
	public ElementaryRangeReference getAcupOldCreditLimitNReference() {
		return acupOldCreditLimitN.getReference();
	}

	/**
	 * Getter for acupOldCreditLimitN attribute.
	 * @return acupOldCreditLimitN attribute
	 */
	public BigDecimal getAcupOldCreditLimitN() {
		return acupOldCreditLimitN.getValue();
	}

	/**
	 * Setter for acupOldCreditLimitN attribute.
	 * @param acupOldCreditLimitN the new value of acupOldCreditLimitN
	 */
	public void setAcupOldCreditLimitN(BigDecimal acupOldCreditLimitN) {
		this.acupOldCreditLimitN.setValue(acupOldCreditLimitN);
	}
	/**
	 * Gets the reference for attribute acupOldCashCreditLimit.
	 * @return the acupOldCashCreditLimit attribute reference
	 */
	public ElementaryRangeReference getAcupOldCashCreditLimitReference() {
		return acupOldCashCreditLimit.getReference();
	}

	/**
	 * Getter for acupOldCashCreditLimit attribute.
	 * @return acupOldCashCreditLimit attribute
	 */
	public String getAcupOldCashCreditLimit() {
		return acupOldCashCreditLimit.getValue();
	}

	/**
	 * Setter for acupOldCashCreditLimit attribute.
	 * @param acupOldCashCreditLimit the new value of acupOldCashCreditLimit
	 */
	public void setAcupOldCashCreditLimit(String acupOldCashCreditLimit) {
		this.acupOldCashCreditLimit.setValue(acupOldCashCreditLimit);
	}
	/**
	 * Gets the reference for attribute acupOldCashCreditLimitN.
	 * @return the acupOldCashCreditLimitN attribute reference
	 */
	public ElementaryRangeReference getAcupOldCashCreditLimitNReference() {
		return acupOldCashCreditLimitN.getReference();
	}

	/**
	 * Getter for acupOldCashCreditLimitN attribute.
	 * @return acupOldCashCreditLimitN attribute
	 */
	public BigDecimal getAcupOldCashCreditLimitN() {
		return acupOldCashCreditLimitN.getValue();
	}

	/**
	 * Setter for acupOldCashCreditLimitN attribute.
	 * @param acupOldCashCreditLimitN the new value of acupOldCashCreditLimitN
	 */
	public void setAcupOldCashCreditLimitN(BigDecimal acupOldCashCreditLimitN) {
		this.acupOldCashCreditLimitN.setValue(acupOldCashCreditLimitN);
	}
	/**
	 * Gets the reference for attribute acupOldOpenDate.
	 * @return the acupOldOpenDate attribute reference
	 */
	public ElementaryRangeReference getAcupOldOpenDateReference() {
		return acupOldOpenDate.getReference();
	}

	/**
	 * Getter for acupOldOpenDate attribute.
	 * @return acupOldOpenDate attribute
	 */
	public String getAcupOldOpenDate() {
		return acupOldOpenDate.getValue();
	}

	/**
	 * Setter for acupOldOpenDate attribute.
	 * @param acupOldOpenDate the new value of acupOldOpenDate
	 */
	public void setAcupOldOpenDate(String acupOldOpenDate) {
		this.acupOldOpenDate.setValue(acupOldOpenDate);
	}
	
	/**
	 * Gets the reference for attribute acupOldOpenDateParts.
	 * @return the acupOldOpenDateParts attribute reference
	 */
	public RangeReference getAcupOldOpenDatePartsReference() {
		return acupOldOpenDateParts.getReference();
	}	
				
	/**
	 * Setter for acupOldOpenDateParts .
	 */
   	public void setAcupOldOpenDateParts(RangeReference reference) {
       	acupOldOpenDateParts.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupOldOpenYear.
	 * @return the acupOldOpenYear attribute reference
	 */
	public ElementaryRangeReference getAcupOldOpenYearReference() {
		return acupOldOpenYear.getReference();
	}

	/**
	 * Getter for acupOldOpenYear attribute.
	 * @return acupOldOpenYear attribute
	 */
	public String getAcupOldOpenYear() {
		return acupOldOpenYear.getValue();
	}

	/**
	 * Setter for acupOldOpenYear attribute.
	 * @param acupOldOpenYear the new value of acupOldOpenYear
	 */
	public void setAcupOldOpenYear(String acupOldOpenYear) {
		this.acupOldOpenYear.setValue(acupOldOpenYear);
	}
	/**
	 * Gets the reference for attribute acupOldOpenMon.
	 * @return the acupOldOpenMon attribute reference
	 */
	public ElementaryRangeReference getAcupOldOpenMonReference() {
		return acupOldOpenMon.getReference();
	}

	/**
	 * Getter for acupOldOpenMon attribute.
	 * @return acupOldOpenMon attribute
	 */
	public String getAcupOldOpenMon() {
		return acupOldOpenMon.getValue();
	}

	/**
	 * Setter for acupOldOpenMon attribute.
	 * @param acupOldOpenMon the new value of acupOldOpenMon
	 */
	public void setAcupOldOpenMon(String acupOldOpenMon) {
		this.acupOldOpenMon.setValue(acupOldOpenMon);
	}
	/**
	 * Gets the reference for attribute acupOldOpenDay.
	 * @return the acupOldOpenDay attribute reference
	 */
	public ElementaryRangeReference getAcupOldOpenDayReference() {
		return acupOldOpenDay.getReference();
	}

	/**
	 * Getter for acupOldOpenDay attribute.
	 * @return acupOldOpenDay attribute
	 */
	public String getAcupOldOpenDay() {
		return acupOldOpenDay.getValue();
	}

	/**
	 * Setter for acupOldOpenDay attribute.
	 * @param acupOldOpenDay the new value of acupOldOpenDay
	 */
	public void setAcupOldOpenDay(String acupOldOpenDay) {
		this.acupOldOpenDay.setValue(acupOldOpenDay);
	}
	/**
	 * Gets the reference for attribute acupOldExpiraionDate.
	 * @return the acupOldExpiraionDate attribute reference
	 */
	public ElementaryRangeReference getAcupOldExpiraionDateReference() {
		return acupOldExpiraionDate.getReference();
	}

	/**
	 * Getter for acupOldExpiraionDate attribute.
	 * @return acupOldExpiraionDate attribute
	 */
	public String getAcupOldExpiraionDate() {
		return acupOldExpiraionDate.getValue();
	}

	/**
	 * Setter for acupOldExpiraionDate attribute.
	 * @param acupOldExpiraionDate the new value of acupOldExpiraionDate
	 */
	public void setAcupOldExpiraionDate(String acupOldExpiraionDate) {
		this.acupOldExpiraionDate.setValue(acupOldExpiraionDate);
	}
	
	/**
	 * Gets the reference for attribute acupOldExpiraionDateParts.
	 * @return the acupOldExpiraionDateParts attribute reference
	 */
	public RangeReference getAcupOldExpiraionDatePartsReference() {
		return acupOldExpiraionDateParts.getReference();
	}	
				
	/**
	 * Setter for acupOldExpiraionDateParts .
	 */
   	public void setAcupOldExpiraionDateParts(RangeReference reference) {
       	acupOldExpiraionDateParts.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupOldExpYear.
	 * @return the acupOldExpYear attribute reference
	 */
	public ElementaryRangeReference getAcupOldExpYearReference() {
		return acupOldExpYear.getReference();
	}

	/**
	 * Getter for acupOldExpYear attribute.
	 * @return acupOldExpYear attribute
	 */
	public String getAcupOldExpYear() {
		return acupOldExpYear.getValue();
	}

	/**
	 * Setter for acupOldExpYear attribute.
	 * @param acupOldExpYear the new value of acupOldExpYear
	 */
	public void setAcupOldExpYear(String acupOldExpYear) {
		this.acupOldExpYear.setValue(acupOldExpYear);
	}
	/**
	 * Gets the reference for attribute acupOldExpMon.
	 * @return the acupOldExpMon attribute reference
	 */
	public ElementaryRangeReference getAcupOldExpMonReference() {
		return acupOldExpMon.getReference();
	}

	/**
	 * Getter for acupOldExpMon attribute.
	 * @return acupOldExpMon attribute
	 */
	public String getAcupOldExpMon() {
		return acupOldExpMon.getValue();
	}

	/**
	 * Setter for acupOldExpMon attribute.
	 * @param acupOldExpMon the new value of acupOldExpMon
	 */
	public void setAcupOldExpMon(String acupOldExpMon) {
		this.acupOldExpMon.setValue(acupOldExpMon);
	}
	/**
	 * Gets the reference for attribute acupOldExpDay.
	 * @return the acupOldExpDay attribute reference
	 */
	public ElementaryRangeReference getAcupOldExpDayReference() {
		return acupOldExpDay.getReference();
	}

	/**
	 * Getter for acupOldExpDay attribute.
	 * @return acupOldExpDay attribute
	 */
	public String getAcupOldExpDay() {
		return acupOldExpDay.getValue();
	}

	/**
	 * Setter for acupOldExpDay attribute.
	 * @param acupOldExpDay the new value of acupOldExpDay
	 */
	public void setAcupOldExpDay(String acupOldExpDay) {
		this.acupOldExpDay.setValue(acupOldExpDay);
	}
	/**
	 * Gets the reference for attribute acupOldReissueDate.
	 * @return the acupOldReissueDate attribute reference
	 */
	public ElementaryRangeReference getAcupOldReissueDateReference() {
		return acupOldReissueDate.getReference();
	}

	/**
	 * Getter for acupOldReissueDate attribute.
	 * @return acupOldReissueDate attribute
	 */
	public String getAcupOldReissueDate() {
		return acupOldReissueDate.getValue();
	}

	/**
	 * Setter for acupOldReissueDate attribute.
	 * @param acupOldReissueDate the new value of acupOldReissueDate
	 */
	public void setAcupOldReissueDate(String acupOldReissueDate) {
		this.acupOldReissueDate.setValue(acupOldReissueDate);
	}
	
	/**
	 * Gets the reference for attribute acupOldReissueDateParts.
	 * @return the acupOldReissueDateParts attribute reference
	 */
	public RangeReference getAcupOldReissueDatePartsReference() {
		return acupOldReissueDateParts.getReference();
	}	
				
	/**
	 * Setter for acupOldReissueDateParts .
	 */
   	public void setAcupOldReissueDateParts(RangeReference reference) {
       	acupOldReissueDateParts.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupOldReissueYear.
	 * @return the acupOldReissueYear attribute reference
	 */
	public ElementaryRangeReference getAcupOldReissueYearReference() {
		return acupOldReissueYear.getReference();
	}

	/**
	 * Getter for acupOldReissueYear attribute.
	 * @return acupOldReissueYear attribute
	 */
	public String getAcupOldReissueYear() {
		return acupOldReissueYear.getValue();
	}

	/**
	 * Setter for acupOldReissueYear attribute.
	 * @param acupOldReissueYear the new value of acupOldReissueYear
	 */
	public void setAcupOldReissueYear(String acupOldReissueYear) {
		this.acupOldReissueYear.setValue(acupOldReissueYear);
	}
	/**
	 * Gets the reference for attribute acupOldReissueMon.
	 * @return the acupOldReissueMon attribute reference
	 */
	public ElementaryRangeReference getAcupOldReissueMonReference() {
		return acupOldReissueMon.getReference();
	}

	/**
	 * Getter for acupOldReissueMon attribute.
	 * @return acupOldReissueMon attribute
	 */
	public String getAcupOldReissueMon() {
		return acupOldReissueMon.getValue();
	}

	/**
	 * Setter for acupOldReissueMon attribute.
	 * @param acupOldReissueMon the new value of acupOldReissueMon
	 */
	public void setAcupOldReissueMon(String acupOldReissueMon) {
		this.acupOldReissueMon.setValue(acupOldReissueMon);
	}
	/**
	 * Gets the reference for attribute acupOldReissueDay.
	 * @return the acupOldReissueDay attribute reference
	 */
	public ElementaryRangeReference getAcupOldReissueDayReference() {
		return acupOldReissueDay.getReference();
	}

	/**
	 * Getter for acupOldReissueDay attribute.
	 * @return acupOldReissueDay attribute
	 */
	public String getAcupOldReissueDay() {
		return acupOldReissueDay.getValue();
	}

	/**
	 * Setter for acupOldReissueDay attribute.
	 * @param acupOldReissueDay the new value of acupOldReissueDay
	 */
	public void setAcupOldReissueDay(String acupOldReissueDay) {
		this.acupOldReissueDay.setValue(acupOldReissueDay);
	}
	/**
	 * Gets the reference for attribute acupOldCurrCycCredit.
	 * @return the acupOldCurrCycCredit attribute reference
	 */
	public ElementaryRangeReference getAcupOldCurrCycCreditReference() {
		return acupOldCurrCycCredit.getReference();
	}

	/**
	 * Getter for acupOldCurrCycCredit attribute.
	 * @return acupOldCurrCycCredit attribute
	 */
	public String getAcupOldCurrCycCredit() {
		return acupOldCurrCycCredit.getValue();
	}

	/**
	 * Setter for acupOldCurrCycCredit attribute.
	 * @param acupOldCurrCycCredit the new value of acupOldCurrCycCredit
	 */
	public void setAcupOldCurrCycCredit(String acupOldCurrCycCredit) {
		this.acupOldCurrCycCredit.setValue(acupOldCurrCycCredit);
	}
	/**
	 * Gets the reference for attribute acupOldCurrCycCreditN.
	 * @return the acupOldCurrCycCreditN attribute reference
	 */
	public ElementaryRangeReference getAcupOldCurrCycCreditNReference() {
		return acupOldCurrCycCreditN.getReference();
	}

	/**
	 * Getter for acupOldCurrCycCreditN attribute.
	 * @return acupOldCurrCycCreditN attribute
	 */
	public BigDecimal getAcupOldCurrCycCreditN() {
		return acupOldCurrCycCreditN.getValue();
	}

	/**
	 * Setter for acupOldCurrCycCreditN attribute.
	 * @param acupOldCurrCycCreditN the new value of acupOldCurrCycCreditN
	 */
	public void setAcupOldCurrCycCreditN(BigDecimal acupOldCurrCycCreditN) {
		this.acupOldCurrCycCreditN.setValue(acupOldCurrCycCreditN);
	}
	/**
	 * Gets the reference for attribute acupOldCurrCycDebit.
	 * @return the acupOldCurrCycDebit attribute reference
	 */
	public ElementaryRangeReference getAcupOldCurrCycDebitReference() {
		return acupOldCurrCycDebit.getReference();
	}

	/**
	 * Getter for acupOldCurrCycDebit attribute.
	 * @return acupOldCurrCycDebit attribute
	 */
	public String getAcupOldCurrCycDebit() {
		return acupOldCurrCycDebit.getValue();
	}

	/**
	 * Setter for acupOldCurrCycDebit attribute.
	 * @param acupOldCurrCycDebit the new value of acupOldCurrCycDebit
	 */
	public void setAcupOldCurrCycDebit(String acupOldCurrCycDebit) {
		this.acupOldCurrCycDebit.setValue(acupOldCurrCycDebit);
	}
	/**
	 * Gets the reference for attribute acupOldCurrCycDebitN.
	 * @return the acupOldCurrCycDebitN attribute reference
	 */
	public ElementaryRangeReference getAcupOldCurrCycDebitNReference() {
		return acupOldCurrCycDebitN.getReference();
	}

	/**
	 * Getter for acupOldCurrCycDebitN attribute.
	 * @return acupOldCurrCycDebitN attribute
	 */
	public BigDecimal getAcupOldCurrCycDebitN() {
		return acupOldCurrCycDebitN.getValue();
	}

	/**
	 * Setter for acupOldCurrCycDebitN attribute.
	 * @param acupOldCurrCycDebitN the new value of acupOldCurrCycDebitN
	 */
	public void setAcupOldCurrCycDebitN(BigDecimal acupOldCurrCycDebitN) {
		this.acupOldCurrCycDebitN.setValue(acupOldCurrCycDebitN);
	}
	/**
	 * Gets the reference for attribute acupOldGroupId.
	 * @return the acupOldGroupId attribute reference
	 */
	public ElementaryRangeReference getAcupOldGroupIdReference() {
		return acupOldGroupId.getReference();
	}

	/**
	 * Getter for acupOldGroupId attribute.
	 * @return acupOldGroupId attribute
	 */
	public String getAcupOldGroupId() {
		return acupOldGroupId.getValue();
	}

	/**
	 * Setter for acupOldGroupId attribute.
	 * @param acupOldGroupId the new value of acupOldGroupId
	 */
	public void setAcupOldGroupId(String acupOldGroupId) {
		this.acupOldGroupId.setValue(acupOldGroupId);
	}
	
	/**
	 * Gets the reference for attribute acupOldCustData.
	 * @return the acupOldCustData attribute reference
	 */
	public RangeReference getAcupOldCustDataReference() {
		return acupOldCustData.getReference();
	}	
				
	/**
	 * Setter for acupOldCustData .
	 */
   	public void setAcupOldCustData(RangeReference reference) {
       	acupOldCustData.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupOldCustIdX.
	 * @return the acupOldCustIdX attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustIdXReference() {
		return acupOldCustIdX.getReference();
	}

	/**
	 * Getter for acupOldCustIdX attribute.
	 * @return acupOldCustIdX attribute
	 */
	public String getAcupOldCustIdX() {
		return acupOldCustIdX.getValue();
	}

	/**
	 * Setter for acupOldCustIdX attribute.
	 * @param acupOldCustIdX the new value of acupOldCustIdX
	 */
	public void setAcupOldCustIdX(String acupOldCustIdX) {
		this.acupOldCustIdX.setValue(acupOldCustIdX);
	}
	/**
	 * Gets the reference for attribute acupOldCustId.
	 * @return the acupOldCustId attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustIdReference() {
		return acupOldCustId.getReference();
	}

	/**
	 * Getter for acupOldCustId attribute.
	 * @return acupOldCustId attribute
	 */
	public int getAcupOldCustId() {
		return acupOldCustId.getValue();
	}

	/**
	 * Setter for acupOldCustId attribute.
	 * @param acupOldCustId the new value of acupOldCustId
	 */
	public void setAcupOldCustId(int acupOldCustId) {
		this.acupOldCustId.setValue(acupOldCustId);
	}
	/**
	 * Gets the reference for attribute acupOldCustFirstName.
	 * @return the acupOldCustFirstName attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustFirstNameReference() {
		return acupOldCustFirstName.getReference();
	}

	/**
	 * Getter for acupOldCustFirstName attribute.
	 * @return acupOldCustFirstName attribute
	 */
	public String getAcupOldCustFirstName() {
		return acupOldCustFirstName.getValue();
	}

	/**
	 * Setter for acupOldCustFirstName attribute.
	 * @param acupOldCustFirstName the new value of acupOldCustFirstName
	 */
	public void setAcupOldCustFirstName(String acupOldCustFirstName) {
		this.acupOldCustFirstName.setValue(acupOldCustFirstName);
	}
	/**
	 * Gets the reference for attribute acupOldCustMiddleName.
	 * @return the acupOldCustMiddleName attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustMiddleNameReference() {
		return acupOldCustMiddleName.getReference();
	}

	/**
	 * Getter for acupOldCustMiddleName attribute.
	 * @return acupOldCustMiddleName attribute
	 */
	public String getAcupOldCustMiddleName() {
		return acupOldCustMiddleName.getValue();
	}

	/**
	 * Setter for acupOldCustMiddleName attribute.
	 * @param acupOldCustMiddleName the new value of acupOldCustMiddleName
	 */
	public void setAcupOldCustMiddleName(String acupOldCustMiddleName) {
		this.acupOldCustMiddleName.setValue(acupOldCustMiddleName);
	}
	/**
	 * Gets the reference for attribute acupOldCustLastName.
	 * @return the acupOldCustLastName attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustLastNameReference() {
		return acupOldCustLastName.getReference();
	}

	/**
	 * Getter for acupOldCustLastName attribute.
	 * @return acupOldCustLastName attribute
	 */
	public String getAcupOldCustLastName() {
		return acupOldCustLastName.getValue();
	}

	/**
	 * Setter for acupOldCustLastName attribute.
	 * @param acupOldCustLastName the new value of acupOldCustLastName
	 */
	public void setAcupOldCustLastName(String acupOldCustLastName) {
		this.acupOldCustLastName.setValue(acupOldCustLastName);
	}
	/**
	 * Gets the reference for attribute acupOldCustAddrLine1.
	 * @return the acupOldCustAddrLine1 attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustAddrLine1Reference() {
		return acupOldCustAddrLine1.getReference();
	}

	/**
	 * Getter for acupOldCustAddrLine1 attribute.
	 * @return acupOldCustAddrLine1 attribute
	 */
	public String getAcupOldCustAddrLine1() {
		return acupOldCustAddrLine1.getValue();
	}

	/**
	 * Setter for acupOldCustAddrLine1 attribute.
	 * @param acupOldCustAddrLine1 the new value of acupOldCustAddrLine1
	 */
	public void setAcupOldCustAddrLine1(String acupOldCustAddrLine1) {
		this.acupOldCustAddrLine1.setValue(acupOldCustAddrLine1);
	}
	/**
	 * Gets the reference for attribute acupOldCustAddrLine2.
	 * @return the acupOldCustAddrLine2 attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustAddrLine2Reference() {
		return acupOldCustAddrLine2.getReference();
	}

	/**
	 * Getter for acupOldCustAddrLine2 attribute.
	 * @return acupOldCustAddrLine2 attribute
	 */
	public String getAcupOldCustAddrLine2() {
		return acupOldCustAddrLine2.getValue();
	}

	/**
	 * Setter for acupOldCustAddrLine2 attribute.
	 * @param acupOldCustAddrLine2 the new value of acupOldCustAddrLine2
	 */
	public void setAcupOldCustAddrLine2(String acupOldCustAddrLine2) {
		this.acupOldCustAddrLine2.setValue(acupOldCustAddrLine2);
	}
	/**
	 * Gets the reference for attribute acupOldCustAddrLine3.
	 * @return the acupOldCustAddrLine3 attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustAddrLine3Reference() {
		return acupOldCustAddrLine3.getReference();
	}

	/**
	 * Getter for acupOldCustAddrLine3 attribute.
	 * @return acupOldCustAddrLine3 attribute
	 */
	public String getAcupOldCustAddrLine3() {
		return acupOldCustAddrLine3.getValue();
	}

	/**
	 * Setter for acupOldCustAddrLine3 attribute.
	 * @param acupOldCustAddrLine3 the new value of acupOldCustAddrLine3
	 */
	public void setAcupOldCustAddrLine3(String acupOldCustAddrLine3) {
		this.acupOldCustAddrLine3.setValue(acupOldCustAddrLine3);
	}
	/**
	 * Gets the reference for attribute acupOldCustAddrStateCd.
	 * @return the acupOldCustAddrStateCd attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustAddrStateCdReference() {
		return acupOldCustAddrStateCd.getReference();
	}

	/**
	 * Getter for acupOldCustAddrStateCd attribute.
	 * @return acupOldCustAddrStateCd attribute
	 */
	public String getAcupOldCustAddrStateCd() {
		return acupOldCustAddrStateCd.getValue();
	}

	/**
	 * Setter for acupOldCustAddrStateCd attribute.
	 * @param acupOldCustAddrStateCd the new value of acupOldCustAddrStateCd
	 */
	public void setAcupOldCustAddrStateCd(String acupOldCustAddrStateCd) {
		this.acupOldCustAddrStateCd.setValue(acupOldCustAddrStateCd);
	}
	/**
	 * Gets the reference for attribute acupOldCustAddrCountryCd.
	 * @return the acupOldCustAddrCountryCd attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustAddrCountryCdReference() {
		return acupOldCustAddrCountryCd.getReference();
	}

	/**
	 * Getter for acupOldCustAddrCountryCd attribute.
	 * @return acupOldCustAddrCountryCd attribute
	 */
	public String getAcupOldCustAddrCountryCd() {
		return acupOldCustAddrCountryCd.getValue();
	}

	/**
	 * Setter for acupOldCustAddrCountryCd attribute.
	 * @param acupOldCustAddrCountryCd the new value of acupOldCustAddrCountryCd
	 */
	public void setAcupOldCustAddrCountryCd(String acupOldCustAddrCountryCd) {
		this.acupOldCustAddrCountryCd.setValue(acupOldCustAddrCountryCd);
	}
	/**
	 * Gets the reference for attribute acupOldCustAddrZip.
	 * @return the acupOldCustAddrZip attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustAddrZipReference() {
		return acupOldCustAddrZip.getReference();
	}

	/**
	 * Getter for acupOldCustAddrZip attribute.
	 * @return acupOldCustAddrZip attribute
	 */
	public String getAcupOldCustAddrZip() {
		return acupOldCustAddrZip.getValue();
	}

	/**
	 * Setter for acupOldCustAddrZip attribute.
	 * @param acupOldCustAddrZip the new value of acupOldCustAddrZip
	 */
	public void setAcupOldCustAddrZip(String acupOldCustAddrZip) {
		this.acupOldCustAddrZip.setValue(acupOldCustAddrZip);
	}
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum1.
	 * @return the acupOldCustPhoneNum1 attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustPhoneNum1Reference() {
		return acupOldCustPhoneNum1.getReference();
	}

	/**
	 * Getter for acupOldCustPhoneNum1 attribute.
	 * @return acupOldCustPhoneNum1 attribute
	 */
	public String getAcupOldCustPhoneNum1() {
		return acupOldCustPhoneNum1.getValue();
	}

	/**
	 * Setter for acupOldCustPhoneNum1 attribute.
	 * @param acupOldCustPhoneNum1 the new value of acupOldCustPhoneNum1
	 */
	public void setAcupOldCustPhoneNum1(String acupOldCustPhoneNum1) {
		this.acupOldCustPhoneNum1.setValue(acupOldCustPhoneNum1);
	}
	
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum1X.
	 * @return the acupOldCustPhoneNum1X attribute reference
	 */
	public RangeReference getAcupOldCustPhoneNum1XReference() {
		return acupOldCustPhoneNum1X.getReference();
	}	
				
	/**
	 * Setter for acupOldCustPhoneNum1X .
	 */
   	public void setAcupOldCustPhoneNum1X(RangeReference reference) {
       	acupOldCustPhoneNum1X.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum1a.
	 * @return the acupOldCustPhoneNum1a attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustPhoneNum1aReference() {
		return acupOldCustPhoneNum1a.getReference();
	}

	/**
	 * Getter for acupOldCustPhoneNum1a attribute.
	 * @return acupOldCustPhoneNum1a attribute
	 */
	public String getAcupOldCustPhoneNum1a() {
		return acupOldCustPhoneNum1a.getValue();
	}

	/**
	 * Setter for acupOldCustPhoneNum1a attribute.
	 * @param acupOldCustPhoneNum1a the new value of acupOldCustPhoneNum1a
	 */
	public void setAcupOldCustPhoneNum1a(String acupOldCustPhoneNum1a) {
		this.acupOldCustPhoneNum1a.setValue(acupOldCustPhoneNum1a);
	}
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum1b.
	 * @return the acupOldCustPhoneNum1b attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustPhoneNum1bReference() {
		return acupOldCustPhoneNum1b.getReference();
	}

	/**
	 * Getter for acupOldCustPhoneNum1b attribute.
	 * @return acupOldCustPhoneNum1b attribute
	 */
	public String getAcupOldCustPhoneNum1b() {
		return acupOldCustPhoneNum1b.getValue();
	}

	/**
	 * Setter for acupOldCustPhoneNum1b attribute.
	 * @param acupOldCustPhoneNum1b the new value of acupOldCustPhoneNum1b
	 */
	public void setAcupOldCustPhoneNum1b(String acupOldCustPhoneNum1b) {
		this.acupOldCustPhoneNum1b.setValue(acupOldCustPhoneNum1b);
	}
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum1c.
	 * @return the acupOldCustPhoneNum1c attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustPhoneNum1cReference() {
		return acupOldCustPhoneNum1c.getReference();
	}

	/**
	 * Getter for acupOldCustPhoneNum1c attribute.
	 * @return acupOldCustPhoneNum1c attribute
	 */
	public String getAcupOldCustPhoneNum1c() {
		return acupOldCustPhoneNum1c.getValue();
	}

	/**
	 * Setter for acupOldCustPhoneNum1c attribute.
	 * @param acupOldCustPhoneNum1c the new value of acupOldCustPhoneNum1c
	 */
	public void setAcupOldCustPhoneNum1c(String acupOldCustPhoneNum1c) {
		this.acupOldCustPhoneNum1c.setValue(acupOldCustPhoneNum1c);
	}
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum2.
	 * @return the acupOldCustPhoneNum2 attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustPhoneNum2Reference() {
		return acupOldCustPhoneNum2.getReference();
	}

	/**
	 * Getter for acupOldCustPhoneNum2 attribute.
	 * @return acupOldCustPhoneNum2 attribute
	 */
	public String getAcupOldCustPhoneNum2() {
		return acupOldCustPhoneNum2.getValue();
	}

	/**
	 * Setter for acupOldCustPhoneNum2 attribute.
	 * @param acupOldCustPhoneNum2 the new value of acupOldCustPhoneNum2
	 */
	public void setAcupOldCustPhoneNum2(String acupOldCustPhoneNum2) {
		this.acupOldCustPhoneNum2.setValue(acupOldCustPhoneNum2);
	}
	
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum2X.
	 * @return the acupOldCustPhoneNum2X attribute reference
	 */
	public RangeReference getAcupOldCustPhoneNum2XReference() {
		return acupOldCustPhoneNum2X.getReference();
	}	
				
	/**
	 * Setter for acupOldCustPhoneNum2X .
	 */
   	public void setAcupOldCustPhoneNum2X(RangeReference reference) {
       	acupOldCustPhoneNum2X.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum2a.
	 * @return the acupOldCustPhoneNum2a attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustPhoneNum2aReference() {
		return acupOldCustPhoneNum2a.getReference();
	}

	/**
	 * Getter for acupOldCustPhoneNum2a attribute.
	 * @return acupOldCustPhoneNum2a attribute
	 */
	public String getAcupOldCustPhoneNum2a() {
		return acupOldCustPhoneNum2a.getValue();
	}

	/**
	 * Setter for acupOldCustPhoneNum2a attribute.
	 * @param acupOldCustPhoneNum2a the new value of acupOldCustPhoneNum2a
	 */
	public void setAcupOldCustPhoneNum2a(String acupOldCustPhoneNum2a) {
		this.acupOldCustPhoneNum2a.setValue(acupOldCustPhoneNum2a);
	}
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum2b.
	 * @return the acupOldCustPhoneNum2b attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustPhoneNum2bReference() {
		return acupOldCustPhoneNum2b.getReference();
	}

	/**
	 * Getter for acupOldCustPhoneNum2b attribute.
	 * @return acupOldCustPhoneNum2b attribute
	 */
	public String getAcupOldCustPhoneNum2b() {
		return acupOldCustPhoneNum2b.getValue();
	}

	/**
	 * Setter for acupOldCustPhoneNum2b attribute.
	 * @param acupOldCustPhoneNum2b the new value of acupOldCustPhoneNum2b
	 */
	public void setAcupOldCustPhoneNum2b(String acupOldCustPhoneNum2b) {
		this.acupOldCustPhoneNum2b.setValue(acupOldCustPhoneNum2b);
	}
	/**
	 * Gets the reference for attribute acupOldCustPhoneNum2c.
	 * @return the acupOldCustPhoneNum2c attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustPhoneNum2cReference() {
		return acupOldCustPhoneNum2c.getReference();
	}

	/**
	 * Getter for acupOldCustPhoneNum2c attribute.
	 * @return acupOldCustPhoneNum2c attribute
	 */
	public String getAcupOldCustPhoneNum2c() {
		return acupOldCustPhoneNum2c.getValue();
	}

	/**
	 * Setter for acupOldCustPhoneNum2c attribute.
	 * @param acupOldCustPhoneNum2c the new value of acupOldCustPhoneNum2c
	 */
	public void setAcupOldCustPhoneNum2c(String acupOldCustPhoneNum2c) {
		this.acupOldCustPhoneNum2c.setValue(acupOldCustPhoneNum2c);
	}
	/**
	 * Gets the reference for attribute acupOldCustSsnX.
	 * @return the acupOldCustSsnX attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustSsnXReference() {
		return acupOldCustSsnX.getReference();
	}

	/**
	 * Getter for acupOldCustSsnX attribute.
	 * @return acupOldCustSsnX attribute
	 */
	public String getAcupOldCustSsnX() {
		return acupOldCustSsnX.getValue();
	}

	/**
	 * Setter for acupOldCustSsnX attribute.
	 * @param acupOldCustSsnX the new value of acupOldCustSsnX
	 */
	public void setAcupOldCustSsnX(String acupOldCustSsnX) {
		this.acupOldCustSsnX.setValue(acupOldCustSsnX);
	}
	/**
	 * Gets the reference for attribute acupOldCustSsn.
	 * @return the acupOldCustSsn attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustSsnReference() {
		return acupOldCustSsn.getReference();
	}

	/**
	 * Getter for acupOldCustSsn attribute.
	 * @return acupOldCustSsn attribute
	 */
	public int getAcupOldCustSsn() {
		return acupOldCustSsn.getValue();
	}

	/**
	 * Setter for acupOldCustSsn attribute.
	 * @param acupOldCustSsn the new value of acupOldCustSsn
	 */
	public void setAcupOldCustSsn(int acupOldCustSsn) {
		this.acupOldCustSsn.setValue(acupOldCustSsn);
	}
	/**
	 * Gets the reference for attribute acupOldCustGovtIssuedId.
	 * @return the acupOldCustGovtIssuedId attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustGovtIssuedIdReference() {
		return acupOldCustGovtIssuedId.getReference();
	}

	/**
	 * Getter for acupOldCustGovtIssuedId attribute.
	 * @return acupOldCustGovtIssuedId attribute
	 */
	public String getAcupOldCustGovtIssuedId() {
		return acupOldCustGovtIssuedId.getValue();
	}

	/**
	 * Setter for acupOldCustGovtIssuedId attribute.
	 * @param acupOldCustGovtIssuedId the new value of acupOldCustGovtIssuedId
	 */
	public void setAcupOldCustGovtIssuedId(String acupOldCustGovtIssuedId) {
		this.acupOldCustGovtIssuedId.setValue(acupOldCustGovtIssuedId);
	}
	/**
	 * Gets the reference for attribute acupOldCustDobYyyyMmDd.
	 * @return the acupOldCustDobYyyyMmDd attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustDobYyyyMmDdReference() {
		return acupOldCustDobYyyyMmDd.getReference();
	}

	/**
	 * Getter for acupOldCustDobYyyyMmDd attribute.
	 * @return acupOldCustDobYyyyMmDd attribute
	 */
	public String getAcupOldCustDobYyyyMmDd() {
		return acupOldCustDobYyyyMmDd.getValue();
	}

	/**
	 * Setter for acupOldCustDobYyyyMmDd attribute.
	 * @param acupOldCustDobYyyyMmDd the new value of acupOldCustDobYyyyMmDd
	 */
	public void setAcupOldCustDobYyyyMmDd(String acupOldCustDobYyyyMmDd) {
		this.acupOldCustDobYyyyMmDd.setValue(acupOldCustDobYyyyMmDd);
	}
	
	/**
	 * Gets the reference for attribute acupOldCustDobParts.
	 * @return the acupOldCustDobParts attribute reference
	 */
	public RangeReference getAcupOldCustDobPartsReference() {
		return acupOldCustDobParts.getReference();
	}	
				
	/**
	 * Setter for acupOldCustDobParts .
	 */
   	public void setAcupOldCustDobParts(RangeReference reference) {
       	acupOldCustDobParts.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupOldCustDobYear.
	 * @return the acupOldCustDobYear attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustDobYearReference() {
		return acupOldCustDobYear.getReference();
	}

	/**
	 * Getter for acupOldCustDobYear attribute.
	 * @return acupOldCustDobYear attribute
	 */
	public String getAcupOldCustDobYear() {
		return acupOldCustDobYear.getValue();
	}

	/**
	 * Setter for acupOldCustDobYear attribute.
	 * @param acupOldCustDobYear the new value of acupOldCustDobYear
	 */
	public void setAcupOldCustDobYear(String acupOldCustDobYear) {
		this.acupOldCustDobYear.setValue(acupOldCustDobYear);
	}
	/**
	 * Gets the reference for attribute acupOldCustDobMon.
	 * @return the acupOldCustDobMon attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustDobMonReference() {
		return acupOldCustDobMon.getReference();
	}

	/**
	 * Getter for acupOldCustDobMon attribute.
	 * @return acupOldCustDobMon attribute
	 */
	public String getAcupOldCustDobMon() {
		return acupOldCustDobMon.getValue();
	}

	/**
	 * Setter for acupOldCustDobMon attribute.
	 * @param acupOldCustDobMon the new value of acupOldCustDobMon
	 */
	public void setAcupOldCustDobMon(String acupOldCustDobMon) {
		this.acupOldCustDobMon.setValue(acupOldCustDobMon);
	}
	/**
	 * Gets the reference for attribute acupOldCustDobDay.
	 * @return the acupOldCustDobDay attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustDobDayReference() {
		return acupOldCustDobDay.getReference();
	}

	/**
	 * Getter for acupOldCustDobDay attribute.
	 * @return acupOldCustDobDay attribute
	 */
	public String getAcupOldCustDobDay() {
		return acupOldCustDobDay.getValue();
	}

	/**
	 * Setter for acupOldCustDobDay attribute.
	 * @param acupOldCustDobDay the new value of acupOldCustDobDay
	 */
	public void setAcupOldCustDobDay(String acupOldCustDobDay) {
		this.acupOldCustDobDay.setValue(acupOldCustDobDay);
	}
	/**
	 * Gets the reference for attribute acupOldCustEftAccountId.
	 * @return the acupOldCustEftAccountId attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustEftAccountIdReference() {
		return acupOldCustEftAccountId.getReference();
	}

	/**
	 * Getter for acupOldCustEftAccountId attribute.
	 * @return acupOldCustEftAccountId attribute
	 */
	public String getAcupOldCustEftAccountId() {
		return acupOldCustEftAccountId.getValue();
	}

	/**
	 * Setter for acupOldCustEftAccountId attribute.
	 * @param acupOldCustEftAccountId the new value of acupOldCustEftAccountId
	 */
	public void setAcupOldCustEftAccountId(String acupOldCustEftAccountId) {
		this.acupOldCustEftAccountId.setValue(acupOldCustEftAccountId);
	}
	/**
	 * Gets the reference for attribute acupOldCustPriHolderInd.
	 * @return the acupOldCustPriHolderInd attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustPriHolderIndReference() {
		return acupOldCustPriHolderInd.getReference();
	}

	/**
	 * Getter for acupOldCustPriHolderInd attribute.
	 * @return acupOldCustPriHolderInd attribute
	 */
	public String getAcupOldCustPriHolderInd() {
		return acupOldCustPriHolderInd.getValue();
	}

	/**
	 * Setter for acupOldCustPriHolderInd attribute.
	 * @param acupOldCustPriHolderInd the new value of acupOldCustPriHolderInd
	 */
	public void setAcupOldCustPriHolderInd(String acupOldCustPriHolderInd) {
		this.acupOldCustPriHolderInd.setValue(acupOldCustPriHolderInd);
	}
	/**
	 * Gets the reference for attribute acupOldCustFicoScoreX.
	 * @return the acupOldCustFicoScoreX attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustFicoScoreXReference() {
		return acupOldCustFicoScoreX.getReference();
	}

	/**
	 * Getter for acupOldCustFicoScoreX attribute.
	 * @return acupOldCustFicoScoreX attribute
	 */
	public String getAcupOldCustFicoScoreX() {
		return acupOldCustFicoScoreX.getValue();
	}

	/**
	 * Setter for acupOldCustFicoScoreX attribute.
	 * @param acupOldCustFicoScoreX the new value of acupOldCustFicoScoreX
	 */
	public void setAcupOldCustFicoScoreX(String acupOldCustFicoScoreX) {
		this.acupOldCustFicoScoreX.setValue(acupOldCustFicoScoreX);
	}
	/**
	 * Gets the reference for attribute acupOldCustFicoScore.
	 * @return the acupOldCustFicoScore attribute reference
	 */
	public ElementaryRangeReference getAcupOldCustFicoScoreReference() {
		return acupOldCustFicoScore.getReference();
	}

	/**
	 * Getter for acupOldCustFicoScore attribute.
	 * @return acupOldCustFicoScore attribute
	 */
	public int getAcupOldCustFicoScore() {
		return acupOldCustFicoScore.getValue();
	}

	/**
	 * Setter for acupOldCustFicoScore attribute.
	 * @param acupOldCustFicoScore the new value of acupOldCustFicoScore
	 */
	public void setAcupOldCustFicoScore(int acupOldCustFicoScore) {
		this.acupOldCustFicoScore.setValue(acupOldCustFicoScore);
	}
	
	/**
	 * Gets the reference for attribute acupNewDetails.
	 * @return the acupNewDetails attribute reference
	 */
	public RangeReference getAcupNewDetailsReference() {
		return acupNewDetails.getReference();
	}	
				
	/**
	 * Setter for acupNewDetails .
	 */
   	public void setAcupNewDetails(RangeReference reference) {
       	acupNewDetails.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute acupNewAcctData.
	 * @return the acupNewAcctData attribute reference
	 */
	public RangeReference getAcupNewAcctDataReference() {
		return acupNewAcctData.getReference();
	}	
				
	/**
	 * Setter for acupNewAcctData .
	 */
   	public void setAcupNewAcctData(RangeReference reference) {
       	acupNewAcctData.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewAcctIdX.
	 * @return the acupNewAcctIdX attribute reference
	 */
	public ElementaryRangeReference getAcupNewAcctIdXReference() {
		return acupNewAcctIdX.getReference();
	}

	/**
	 * Getter for acupNewAcctIdX attribute.
	 * @return acupNewAcctIdX attribute
	 */
	public String getAcupNewAcctIdX() {
		return acupNewAcctIdX.getValue();
	}

	/**
	 * Setter for acupNewAcctIdX attribute.
	 * @param acupNewAcctIdX the new value of acupNewAcctIdX
	 */
	public void setAcupNewAcctIdX(String acupNewAcctIdX) {
		this.acupNewAcctIdX.setValue(acupNewAcctIdX);
	}
	/**
	 * Gets the reference for attribute acupNewAcctId.
	 * @return the acupNewAcctId attribute reference
	 */
	public ElementaryRangeReference getAcupNewAcctIdReference() {
		return acupNewAcctId.getReference();
	}

	/**
	 * Getter for acupNewAcctId attribute.
	 * @return acupNewAcctId attribute
	 */
	public long getAcupNewAcctId() {
		return acupNewAcctId.getValue();
	}

	/**
	 * Setter for acupNewAcctId attribute.
	 * @param acupNewAcctId the new value of acupNewAcctId
	 */
	public void setAcupNewAcctId(long acupNewAcctId) {
		this.acupNewAcctId.setValue(acupNewAcctId);
	}
	/**
	 * Gets the reference for attribute acupNewActiveStatus.
	 * @return the acupNewActiveStatus attribute reference
	 */
	public ElementaryRangeReference getAcupNewActiveStatusReference() {
		return acupNewActiveStatus.getReference();
	}

	/**
	 * Getter for acupNewActiveStatus attribute.
	 * @return acupNewActiveStatus attribute
	 */
	public String getAcupNewActiveStatus() {
		return acupNewActiveStatus.getValue();
	}

	/**
	 * Setter for acupNewActiveStatus attribute.
	 * @param acupNewActiveStatus the new value of acupNewActiveStatus
	 */
	public void setAcupNewActiveStatus(String acupNewActiveStatus) {
		this.acupNewActiveStatus.setValue(acupNewActiveStatus);
	}
	/**
	 * Gets the reference for attribute acupNewCurrBal.
	 * @return the acupNewCurrBal attribute reference
	 */
	public ElementaryRangeReference getAcupNewCurrBalReference() {
		return acupNewCurrBal.getReference();
	}

	/**
	 * Getter for acupNewCurrBal attribute.
	 * @return acupNewCurrBal attribute
	 */
	public String getAcupNewCurrBal() {
		return acupNewCurrBal.getValue();
	}

	/**
	 * Setter for acupNewCurrBal attribute.
	 * @param acupNewCurrBal the new value of acupNewCurrBal
	 */
	public void setAcupNewCurrBal(String acupNewCurrBal) {
		this.acupNewCurrBal.setValue(acupNewCurrBal);
	}
	/**
	 * Gets the reference for attribute acupNewCurrBalN.
	 * @return the acupNewCurrBalN attribute reference
	 */
	public ElementaryRangeReference getAcupNewCurrBalNReference() {
		return acupNewCurrBalN.getReference();
	}

	/**
	 * Getter for acupNewCurrBalN attribute.
	 * @return acupNewCurrBalN attribute
	 */
	public BigDecimal getAcupNewCurrBalN() {
		return acupNewCurrBalN.getValue();
	}

	/**
	 * Setter for acupNewCurrBalN attribute.
	 * @param acupNewCurrBalN the new value of acupNewCurrBalN
	 */
	public void setAcupNewCurrBalN(BigDecimal acupNewCurrBalN) {
		this.acupNewCurrBalN.setValue(acupNewCurrBalN);
	}
	/**
	 * Gets the reference for attribute acupNewCreditLimit.
	 * @return the acupNewCreditLimit attribute reference
	 */
	public ElementaryRangeReference getAcupNewCreditLimitReference() {
		return acupNewCreditLimit.getReference();
	}

	/**
	 * Getter for acupNewCreditLimit attribute.
	 * @return acupNewCreditLimit attribute
	 */
	public String getAcupNewCreditLimit() {
		return acupNewCreditLimit.getValue();
	}

	/**
	 * Setter for acupNewCreditLimit attribute.
	 * @param acupNewCreditLimit the new value of acupNewCreditLimit
	 */
	public void setAcupNewCreditLimit(String acupNewCreditLimit) {
		this.acupNewCreditLimit.setValue(acupNewCreditLimit);
	}
	/**
	 * Gets the reference for attribute acupNewCreditLimitN.
	 * @return the acupNewCreditLimitN attribute reference
	 */
	public ElementaryRangeReference getAcupNewCreditLimitNReference() {
		return acupNewCreditLimitN.getReference();
	}

	/**
	 * Getter for acupNewCreditLimitN attribute.
	 * @return acupNewCreditLimitN attribute
	 */
	public BigDecimal getAcupNewCreditLimitN() {
		return acupNewCreditLimitN.getValue();
	}

	/**
	 * Setter for acupNewCreditLimitN attribute.
	 * @param acupNewCreditLimitN the new value of acupNewCreditLimitN
	 */
	public void setAcupNewCreditLimitN(BigDecimal acupNewCreditLimitN) {
		this.acupNewCreditLimitN.setValue(acupNewCreditLimitN);
	}
	/**
	 * Gets the reference for attribute acupNewCashCreditLimit.
	 * @return the acupNewCashCreditLimit attribute reference
	 */
	public ElementaryRangeReference getAcupNewCashCreditLimitReference() {
		return acupNewCashCreditLimit.getReference();
	}

	/**
	 * Getter for acupNewCashCreditLimit attribute.
	 * @return acupNewCashCreditLimit attribute
	 */
	public String getAcupNewCashCreditLimit() {
		return acupNewCashCreditLimit.getValue();
	}

	/**
	 * Setter for acupNewCashCreditLimit attribute.
	 * @param acupNewCashCreditLimit the new value of acupNewCashCreditLimit
	 */
	public void setAcupNewCashCreditLimit(String acupNewCashCreditLimit) {
		this.acupNewCashCreditLimit.setValue(acupNewCashCreditLimit);
	}
	/**
	 * Gets the reference for attribute acupNewCashCreditLimitN.
	 * @return the acupNewCashCreditLimitN attribute reference
	 */
	public ElementaryRangeReference getAcupNewCashCreditLimitNReference() {
		return acupNewCashCreditLimitN.getReference();
	}

	/**
	 * Getter for acupNewCashCreditLimitN attribute.
	 * @return acupNewCashCreditLimitN attribute
	 */
	public BigDecimal getAcupNewCashCreditLimitN() {
		return acupNewCashCreditLimitN.getValue();
	}

	/**
	 * Setter for acupNewCashCreditLimitN attribute.
	 * @param acupNewCashCreditLimitN the new value of acupNewCashCreditLimitN
	 */
	public void setAcupNewCashCreditLimitN(BigDecimal acupNewCashCreditLimitN) {
		this.acupNewCashCreditLimitN.setValue(acupNewCashCreditLimitN);
	}
	/**
	 * Gets the reference for attribute acupNewOpenDate.
	 * @return the acupNewOpenDate attribute reference
	 */
	public ElementaryRangeReference getAcupNewOpenDateReference() {
		return acupNewOpenDate.getReference();
	}

	/**
	 * Getter for acupNewOpenDate attribute.
	 * @return acupNewOpenDate attribute
	 */
	public String getAcupNewOpenDate() {
		return acupNewOpenDate.getValue();
	}

	/**
	 * Setter for acupNewOpenDate attribute.
	 * @param acupNewOpenDate the new value of acupNewOpenDate
	 */
	public void setAcupNewOpenDate(String acupNewOpenDate) {
		this.acupNewOpenDate.setValue(acupNewOpenDate);
	}
	
	/**
	 * Gets the reference for attribute acupNewOpenDateParts.
	 * @return the acupNewOpenDateParts attribute reference
	 */
	public RangeReference getAcupNewOpenDatePartsReference() {
		return acupNewOpenDateParts.getReference();
	}	
				
	/**
	 * Setter for acupNewOpenDateParts .
	 */
   	public void setAcupNewOpenDateParts(RangeReference reference) {
       	acupNewOpenDateParts.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewOpenYear.
	 * @return the acupNewOpenYear attribute reference
	 */
	public ElementaryRangeReference getAcupNewOpenYearReference() {
		return acupNewOpenYear.getReference();
	}

	/**
	 * Getter for acupNewOpenYear attribute.
	 * @return acupNewOpenYear attribute
	 */
	public String getAcupNewOpenYear() {
		return acupNewOpenYear.getValue();
	}

	/**
	 * Setter for acupNewOpenYear attribute.
	 * @param acupNewOpenYear the new value of acupNewOpenYear
	 */
	public void setAcupNewOpenYear(String acupNewOpenYear) {
		this.acupNewOpenYear.setValue(acupNewOpenYear);
	}
	/**
	 * Gets the reference for attribute acupNewOpenMon.
	 * @return the acupNewOpenMon attribute reference
	 */
	public ElementaryRangeReference getAcupNewOpenMonReference() {
		return acupNewOpenMon.getReference();
	}

	/**
	 * Getter for acupNewOpenMon attribute.
	 * @return acupNewOpenMon attribute
	 */
	public String getAcupNewOpenMon() {
		return acupNewOpenMon.getValue();
	}

	/**
	 * Setter for acupNewOpenMon attribute.
	 * @param acupNewOpenMon the new value of acupNewOpenMon
	 */
	public void setAcupNewOpenMon(String acupNewOpenMon) {
		this.acupNewOpenMon.setValue(acupNewOpenMon);
	}
	/**
	 * Gets the reference for attribute acupNewOpenDay.
	 * @return the acupNewOpenDay attribute reference
	 */
	public ElementaryRangeReference getAcupNewOpenDayReference() {
		return acupNewOpenDay.getReference();
	}

	/**
	 * Getter for acupNewOpenDay attribute.
	 * @return acupNewOpenDay attribute
	 */
	public String getAcupNewOpenDay() {
		return acupNewOpenDay.getValue();
	}

	/**
	 * Setter for acupNewOpenDay attribute.
	 * @param acupNewOpenDay the new value of acupNewOpenDay
	 */
	public void setAcupNewOpenDay(String acupNewOpenDay) {
		this.acupNewOpenDay.setValue(acupNewOpenDay);
	}
	/**
	 * Gets the reference for attribute acupNewExpiraionDate.
	 * @return the acupNewExpiraionDate attribute reference
	 */
	public ElementaryRangeReference getAcupNewExpiraionDateReference() {
		return acupNewExpiraionDate.getReference();
	}

	/**
	 * Getter for acupNewExpiraionDate attribute.
	 * @return acupNewExpiraionDate attribute
	 */
	public String getAcupNewExpiraionDate() {
		return acupNewExpiraionDate.getValue();
	}

	/**
	 * Setter for acupNewExpiraionDate attribute.
	 * @param acupNewExpiraionDate the new value of acupNewExpiraionDate
	 */
	public void setAcupNewExpiraionDate(String acupNewExpiraionDate) {
		this.acupNewExpiraionDate.setValue(acupNewExpiraionDate);
	}
	
	/**
	 * Gets the reference for attribute acupNewExpiraionDateParts.
	 * @return the acupNewExpiraionDateParts attribute reference
	 */
	public RangeReference getAcupNewExpiraionDatePartsReference() {
		return acupNewExpiraionDateParts.getReference();
	}	
				
	/**
	 * Setter for acupNewExpiraionDateParts .
	 */
   	public void setAcupNewExpiraionDateParts(RangeReference reference) {
       	acupNewExpiraionDateParts.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewExpYear.
	 * @return the acupNewExpYear attribute reference
	 */
	public ElementaryRangeReference getAcupNewExpYearReference() {
		return acupNewExpYear.getReference();
	}

	/**
	 * Getter for acupNewExpYear attribute.
	 * @return acupNewExpYear attribute
	 */
	public String getAcupNewExpYear() {
		return acupNewExpYear.getValue();
	}

	/**
	 * Setter for acupNewExpYear attribute.
	 * @param acupNewExpYear the new value of acupNewExpYear
	 */
	public void setAcupNewExpYear(String acupNewExpYear) {
		this.acupNewExpYear.setValue(acupNewExpYear);
	}
	/**
	 * Gets the reference for attribute acupNewExpMon.
	 * @return the acupNewExpMon attribute reference
	 */
	public ElementaryRangeReference getAcupNewExpMonReference() {
		return acupNewExpMon.getReference();
	}

	/**
	 * Getter for acupNewExpMon attribute.
	 * @return acupNewExpMon attribute
	 */
	public String getAcupNewExpMon() {
		return acupNewExpMon.getValue();
	}

	/**
	 * Setter for acupNewExpMon attribute.
	 * @param acupNewExpMon the new value of acupNewExpMon
	 */
	public void setAcupNewExpMon(String acupNewExpMon) {
		this.acupNewExpMon.setValue(acupNewExpMon);
	}
	/**
	 * Gets the reference for attribute acupNewExpDay.
	 * @return the acupNewExpDay attribute reference
	 */
	public ElementaryRangeReference getAcupNewExpDayReference() {
		return acupNewExpDay.getReference();
	}

	/**
	 * Getter for acupNewExpDay attribute.
	 * @return acupNewExpDay attribute
	 */
	public String getAcupNewExpDay() {
		return acupNewExpDay.getValue();
	}

	/**
	 * Setter for acupNewExpDay attribute.
	 * @param acupNewExpDay the new value of acupNewExpDay
	 */
	public void setAcupNewExpDay(String acupNewExpDay) {
		this.acupNewExpDay.setValue(acupNewExpDay);
	}
	/**
	 * Gets the reference for attribute acupNewReissueDate.
	 * @return the acupNewReissueDate attribute reference
	 */
	public ElementaryRangeReference getAcupNewReissueDateReference() {
		return acupNewReissueDate.getReference();
	}

	/**
	 * Getter for acupNewReissueDate attribute.
	 * @return acupNewReissueDate attribute
	 */
	public String getAcupNewReissueDate() {
		return acupNewReissueDate.getValue();
	}

	/**
	 * Setter for acupNewReissueDate attribute.
	 * @param acupNewReissueDate the new value of acupNewReissueDate
	 */
	public void setAcupNewReissueDate(String acupNewReissueDate) {
		this.acupNewReissueDate.setValue(acupNewReissueDate);
	}
	
	/**
	 * Gets the reference for attribute acupNewReissueDateParts.
	 * @return the acupNewReissueDateParts attribute reference
	 */
	public RangeReference getAcupNewReissueDatePartsReference() {
		return acupNewReissueDateParts.getReference();
	}	
				
	/**
	 * Setter for acupNewReissueDateParts .
	 */
   	public void setAcupNewReissueDateParts(RangeReference reference) {
       	acupNewReissueDateParts.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewReissueYear.
	 * @return the acupNewReissueYear attribute reference
	 */
	public ElementaryRangeReference getAcupNewReissueYearReference() {
		return acupNewReissueYear.getReference();
	}

	/**
	 * Getter for acupNewReissueYear attribute.
	 * @return acupNewReissueYear attribute
	 */
	public String getAcupNewReissueYear() {
		return acupNewReissueYear.getValue();
	}

	/**
	 * Setter for acupNewReissueYear attribute.
	 * @param acupNewReissueYear the new value of acupNewReissueYear
	 */
	public void setAcupNewReissueYear(String acupNewReissueYear) {
		this.acupNewReissueYear.setValue(acupNewReissueYear);
	}
	/**
	 * Gets the reference for attribute acupNewReissueMon.
	 * @return the acupNewReissueMon attribute reference
	 */
	public ElementaryRangeReference getAcupNewReissueMonReference() {
		return acupNewReissueMon.getReference();
	}

	/**
	 * Getter for acupNewReissueMon attribute.
	 * @return acupNewReissueMon attribute
	 */
	public String getAcupNewReissueMon() {
		return acupNewReissueMon.getValue();
	}

	/**
	 * Setter for acupNewReissueMon attribute.
	 * @param acupNewReissueMon the new value of acupNewReissueMon
	 */
	public void setAcupNewReissueMon(String acupNewReissueMon) {
		this.acupNewReissueMon.setValue(acupNewReissueMon);
	}
	/**
	 * Gets the reference for attribute acupNewReissueDay.
	 * @return the acupNewReissueDay attribute reference
	 */
	public ElementaryRangeReference getAcupNewReissueDayReference() {
		return acupNewReissueDay.getReference();
	}

	/**
	 * Getter for acupNewReissueDay attribute.
	 * @return acupNewReissueDay attribute
	 */
	public String getAcupNewReissueDay() {
		return acupNewReissueDay.getValue();
	}

	/**
	 * Setter for acupNewReissueDay attribute.
	 * @param acupNewReissueDay the new value of acupNewReissueDay
	 */
	public void setAcupNewReissueDay(String acupNewReissueDay) {
		this.acupNewReissueDay.setValue(acupNewReissueDay);
	}
	/**
	 * Gets the reference for attribute acupNewCurrCycCredit.
	 * @return the acupNewCurrCycCredit attribute reference
	 */
	public ElementaryRangeReference getAcupNewCurrCycCreditReference() {
		return acupNewCurrCycCredit.getReference();
	}

	/**
	 * Getter for acupNewCurrCycCredit attribute.
	 * @return acupNewCurrCycCredit attribute
	 */
	public String getAcupNewCurrCycCredit() {
		return acupNewCurrCycCredit.getValue();
	}

	/**
	 * Setter for acupNewCurrCycCredit attribute.
	 * @param acupNewCurrCycCredit the new value of acupNewCurrCycCredit
	 */
	public void setAcupNewCurrCycCredit(String acupNewCurrCycCredit) {
		this.acupNewCurrCycCredit.setValue(acupNewCurrCycCredit);
	}
	/**
	 * Gets the reference for attribute acupNewCurrCycCreditN.
	 * @return the acupNewCurrCycCreditN attribute reference
	 */
	public ElementaryRangeReference getAcupNewCurrCycCreditNReference() {
		return acupNewCurrCycCreditN.getReference();
	}

	/**
	 * Getter for acupNewCurrCycCreditN attribute.
	 * @return acupNewCurrCycCreditN attribute
	 */
	public BigDecimal getAcupNewCurrCycCreditN() {
		return acupNewCurrCycCreditN.getValue();
	}

	/**
	 * Setter for acupNewCurrCycCreditN attribute.
	 * @param acupNewCurrCycCreditN the new value of acupNewCurrCycCreditN
	 */
	public void setAcupNewCurrCycCreditN(BigDecimal acupNewCurrCycCreditN) {
		this.acupNewCurrCycCreditN.setValue(acupNewCurrCycCreditN);
	}
	/**
	 * Gets the reference for attribute acupNewCurrCycDebit.
	 * @return the acupNewCurrCycDebit attribute reference
	 */
	public ElementaryRangeReference getAcupNewCurrCycDebitReference() {
		return acupNewCurrCycDebit.getReference();
	}

	/**
	 * Getter for acupNewCurrCycDebit attribute.
	 * @return acupNewCurrCycDebit attribute
	 */
	public String getAcupNewCurrCycDebit() {
		return acupNewCurrCycDebit.getValue();
	}

	/**
	 * Setter for acupNewCurrCycDebit attribute.
	 * @param acupNewCurrCycDebit the new value of acupNewCurrCycDebit
	 */
	public void setAcupNewCurrCycDebit(String acupNewCurrCycDebit) {
		this.acupNewCurrCycDebit.setValue(acupNewCurrCycDebit);
	}
	/**
	 * Gets the reference for attribute acupNewCurrCycDebitN.
	 * @return the acupNewCurrCycDebitN attribute reference
	 */
	public ElementaryRangeReference getAcupNewCurrCycDebitNReference() {
		return acupNewCurrCycDebitN.getReference();
	}

	/**
	 * Getter for acupNewCurrCycDebitN attribute.
	 * @return acupNewCurrCycDebitN attribute
	 */
	public BigDecimal getAcupNewCurrCycDebitN() {
		return acupNewCurrCycDebitN.getValue();
	}

	/**
	 * Setter for acupNewCurrCycDebitN attribute.
	 * @param acupNewCurrCycDebitN the new value of acupNewCurrCycDebitN
	 */
	public void setAcupNewCurrCycDebitN(BigDecimal acupNewCurrCycDebitN) {
		this.acupNewCurrCycDebitN.setValue(acupNewCurrCycDebitN);
	}
	/**
	 * Gets the reference for attribute acupNewGroupId.
	 * @return the acupNewGroupId attribute reference
	 */
	public ElementaryRangeReference getAcupNewGroupIdReference() {
		return acupNewGroupId.getReference();
	}

	/**
	 * Getter for acupNewGroupId attribute.
	 * @return acupNewGroupId attribute
	 */
	public String getAcupNewGroupId() {
		return acupNewGroupId.getValue();
	}

	/**
	 * Setter for acupNewGroupId attribute.
	 * @param acupNewGroupId the new value of acupNewGroupId
	 */
	public void setAcupNewGroupId(String acupNewGroupId) {
		this.acupNewGroupId.setValue(acupNewGroupId);
	}
	
	/**
	 * Gets the reference for attribute acupNewCustData.
	 * @return the acupNewCustData attribute reference
	 */
	public RangeReference getAcupNewCustDataReference() {
		return acupNewCustData.getReference();
	}	
				
	/**
	 * Setter for acupNewCustData .
	 */
   	public void setAcupNewCustData(RangeReference reference) {
       	acupNewCustData.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewCustIdX.
	 * @return the acupNewCustIdX attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustIdXReference() {
		return acupNewCustIdX.getReference();
	}

	/**
	 * Getter for acupNewCustIdX attribute.
	 * @return acupNewCustIdX attribute
	 */
	public String getAcupNewCustIdX() {
		return acupNewCustIdX.getValue();
	}

	/**
	 * Setter for acupNewCustIdX attribute.
	 * @param acupNewCustIdX the new value of acupNewCustIdX
	 */
	public void setAcupNewCustIdX(String acupNewCustIdX) {
		this.acupNewCustIdX.setValue(acupNewCustIdX);
	}
	/**
	 * Gets the reference for attribute acupNewCustId.
	 * @return the acupNewCustId attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustIdReference() {
		return acupNewCustId.getReference();
	}

	/**
	 * Getter for acupNewCustId attribute.
	 * @return acupNewCustId attribute
	 */
	public int getAcupNewCustId() {
		return acupNewCustId.getValue();
	}

	/**
	 * Setter for acupNewCustId attribute.
	 * @param acupNewCustId the new value of acupNewCustId
	 */
	public void setAcupNewCustId(int acupNewCustId) {
		this.acupNewCustId.setValue(acupNewCustId);
	}
	/**
	 * Gets the reference for attribute acupNewCustFirstName.
	 * @return the acupNewCustFirstName attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustFirstNameReference() {
		return acupNewCustFirstName.getReference();
	}

	/**
	 * Getter for acupNewCustFirstName attribute.
	 * @return acupNewCustFirstName attribute
	 */
	public String getAcupNewCustFirstName() {
		return acupNewCustFirstName.getValue();
	}

	/**
	 * Setter for acupNewCustFirstName attribute.
	 * @param acupNewCustFirstName the new value of acupNewCustFirstName
	 */
	public void setAcupNewCustFirstName(String acupNewCustFirstName) {
		this.acupNewCustFirstName.setValue(acupNewCustFirstName);
	}
	/**
	 * Gets the reference for attribute acupNewCustMiddleName.
	 * @return the acupNewCustMiddleName attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustMiddleNameReference() {
		return acupNewCustMiddleName.getReference();
	}

	/**
	 * Getter for acupNewCustMiddleName attribute.
	 * @return acupNewCustMiddleName attribute
	 */
	public String getAcupNewCustMiddleName() {
		return acupNewCustMiddleName.getValue();
	}

	/**
	 * Setter for acupNewCustMiddleName attribute.
	 * @param acupNewCustMiddleName the new value of acupNewCustMiddleName
	 */
	public void setAcupNewCustMiddleName(String acupNewCustMiddleName) {
		this.acupNewCustMiddleName.setValue(acupNewCustMiddleName);
	}
	/**
	 * Gets the reference for attribute acupNewCustLastName.
	 * @return the acupNewCustLastName attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustLastNameReference() {
		return acupNewCustLastName.getReference();
	}

	/**
	 * Getter for acupNewCustLastName attribute.
	 * @return acupNewCustLastName attribute
	 */
	public String getAcupNewCustLastName() {
		return acupNewCustLastName.getValue();
	}

	/**
	 * Setter for acupNewCustLastName attribute.
	 * @param acupNewCustLastName the new value of acupNewCustLastName
	 */
	public void setAcupNewCustLastName(String acupNewCustLastName) {
		this.acupNewCustLastName.setValue(acupNewCustLastName);
	}
	/**
	 * Gets the reference for attribute acupNewCustAddrLine1.
	 * @return the acupNewCustAddrLine1 attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustAddrLine1Reference() {
		return acupNewCustAddrLine1.getReference();
	}

	/**
	 * Getter for acupNewCustAddrLine1 attribute.
	 * @return acupNewCustAddrLine1 attribute
	 */
	public String getAcupNewCustAddrLine1() {
		return acupNewCustAddrLine1.getValue();
	}

	/**
	 * Setter for acupNewCustAddrLine1 attribute.
	 * @param acupNewCustAddrLine1 the new value of acupNewCustAddrLine1
	 */
	public void setAcupNewCustAddrLine1(String acupNewCustAddrLine1) {
		this.acupNewCustAddrLine1.setValue(acupNewCustAddrLine1);
	}
	/**
	 * Gets the reference for attribute acupNewCustAddrLine2.
	 * @return the acupNewCustAddrLine2 attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustAddrLine2Reference() {
		return acupNewCustAddrLine2.getReference();
	}

	/**
	 * Getter for acupNewCustAddrLine2 attribute.
	 * @return acupNewCustAddrLine2 attribute
	 */
	public String getAcupNewCustAddrLine2() {
		return acupNewCustAddrLine2.getValue();
	}

	/**
	 * Setter for acupNewCustAddrLine2 attribute.
	 * @param acupNewCustAddrLine2 the new value of acupNewCustAddrLine2
	 */
	public void setAcupNewCustAddrLine2(String acupNewCustAddrLine2) {
		this.acupNewCustAddrLine2.setValue(acupNewCustAddrLine2);
	}
	/**
	 * Gets the reference for attribute acupNewCustAddrLine3.
	 * @return the acupNewCustAddrLine3 attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustAddrLine3Reference() {
		return acupNewCustAddrLine3.getReference();
	}

	/**
	 * Getter for acupNewCustAddrLine3 attribute.
	 * @return acupNewCustAddrLine3 attribute
	 */
	public String getAcupNewCustAddrLine3() {
		return acupNewCustAddrLine3.getValue();
	}

	/**
	 * Setter for acupNewCustAddrLine3 attribute.
	 * @param acupNewCustAddrLine3 the new value of acupNewCustAddrLine3
	 */
	public void setAcupNewCustAddrLine3(String acupNewCustAddrLine3) {
		this.acupNewCustAddrLine3.setValue(acupNewCustAddrLine3);
	}
	/**
	 * Gets the reference for attribute acupNewCustAddrStateCd.
	 * @return the acupNewCustAddrStateCd attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustAddrStateCdReference() {
		return acupNewCustAddrStateCd.getReference();
	}

	/**
	 * Getter for acupNewCustAddrStateCd attribute.
	 * @return acupNewCustAddrStateCd attribute
	 */
	public String getAcupNewCustAddrStateCd() {
		return acupNewCustAddrStateCd.getValue();
	}

	/**
	 * Setter for acupNewCustAddrStateCd attribute.
	 * @param acupNewCustAddrStateCd the new value of acupNewCustAddrStateCd
	 */
	public void setAcupNewCustAddrStateCd(String acupNewCustAddrStateCd) {
		this.acupNewCustAddrStateCd.setValue(acupNewCustAddrStateCd);
	}
	/**
	 * Gets the reference for attribute acupNewCustAddrCountryCd.
	 * @return the acupNewCustAddrCountryCd attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustAddrCountryCdReference() {
		return acupNewCustAddrCountryCd.getReference();
	}

	/**
	 * Getter for acupNewCustAddrCountryCd attribute.
	 * @return acupNewCustAddrCountryCd attribute
	 */
	public String getAcupNewCustAddrCountryCd() {
		return acupNewCustAddrCountryCd.getValue();
	}

	/**
	 * Setter for acupNewCustAddrCountryCd attribute.
	 * @param acupNewCustAddrCountryCd the new value of acupNewCustAddrCountryCd
	 */
	public void setAcupNewCustAddrCountryCd(String acupNewCustAddrCountryCd) {
		this.acupNewCustAddrCountryCd.setValue(acupNewCustAddrCountryCd);
	}
	/**
	 * Gets the reference for attribute acupNewCustAddrZip.
	 * @return the acupNewCustAddrZip attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustAddrZipReference() {
		return acupNewCustAddrZip.getReference();
	}

	/**
	 * Getter for acupNewCustAddrZip attribute.
	 * @return acupNewCustAddrZip attribute
	 */
	public String getAcupNewCustAddrZip() {
		return acupNewCustAddrZip.getValue();
	}

	/**
	 * Setter for acupNewCustAddrZip attribute.
	 * @param acupNewCustAddrZip the new value of acupNewCustAddrZip
	 */
	public void setAcupNewCustAddrZip(String acupNewCustAddrZip) {
		this.acupNewCustAddrZip.setValue(acupNewCustAddrZip);
	}
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum1.
	 * @return the acupNewCustPhoneNum1 attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustPhoneNum1Reference() {
		return acupNewCustPhoneNum1.getReference();
	}

	/**
	 * Getter for acupNewCustPhoneNum1 attribute.
	 * @return acupNewCustPhoneNum1 attribute
	 */
	public String getAcupNewCustPhoneNum1() {
		return acupNewCustPhoneNum1.getValue();
	}

	/**
	 * Setter for acupNewCustPhoneNum1 attribute.
	 * @param acupNewCustPhoneNum1 the new value of acupNewCustPhoneNum1
	 */
	public void setAcupNewCustPhoneNum1(String acupNewCustPhoneNum1) {
		this.acupNewCustPhoneNum1.setValue(acupNewCustPhoneNum1);
	}
	
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum1X.
	 * @return the acupNewCustPhoneNum1X attribute reference
	 */
	public RangeReference getAcupNewCustPhoneNum1XReference() {
		return acupNewCustPhoneNum1X.getReference();
	}	
				
	/**
	 * Setter for acupNewCustPhoneNum1X .
	 */
   	public void setAcupNewCustPhoneNum1X(RangeReference reference) {
       	acupNewCustPhoneNum1X.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum1a.
	 * @return the acupNewCustPhoneNum1a attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustPhoneNum1aReference() {
		return acupNewCustPhoneNum1a.getReference();
	}

	/**
	 * Getter for acupNewCustPhoneNum1a attribute.
	 * @return acupNewCustPhoneNum1a attribute
	 */
	public String getAcupNewCustPhoneNum1a() {
		return acupNewCustPhoneNum1a.getValue();
	}

	/**
	 * Setter for acupNewCustPhoneNum1a attribute.
	 * @param acupNewCustPhoneNum1a the new value of acupNewCustPhoneNum1a
	 */
	public void setAcupNewCustPhoneNum1a(String acupNewCustPhoneNum1a) {
		this.acupNewCustPhoneNum1a.setValue(acupNewCustPhoneNum1a);
	}
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum1b.
	 * @return the acupNewCustPhoneNum1b attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustPhoneNum1bReference() {
		return acupNewCustPhoneNum1b.getReference();
	}

	/**
	 * Getter for acupNewCustPhoneNum1b attribute.
	 * @return acupNewCustPhoneNum1b attribute
	 */
	public String getAcupNewCustPhoneNum1b() {
		return acupNewCustPhoneNum1b.getValue();
	}

	/**
	 * Setter for acupNewCustPhoneNum1b attribute.
	 * @param acupNewCustPhoneNum1b the new value of acupNewCustPhoneNum1b
	 */
	public void setAcupNewCustPhoneNum1b(String acupNewCustPhoneNum1b) {
		this.acupNewCustPhoneNum1b.setValue(acupNewCustPhoneNum1b);
	}
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum1c.
	 * @return the acupNewCustPhoneNum1c attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustPhoneNum1cReference() {
		return acupNewCustPhoneNum1c.getReference();
	}

	/**
	 * Getter for acupNewCustPhoneNum1c attribute.
	 * @return acupNewCustPhoneNum1c attribute
	 */
	public String getAcupNewCustPhoneNum1c() {
		return acupNewCustPhoneNum1c.getValue();
	}

	/**
	 * Setter for acupNewCustPhoneNum1c attribute.
	 * @param acupNewCustPhoneNum1c the new value of acupNewCustPhoneNum1c
	 */
	public void setAcupNewCustPhoneNum1c(String acupNewCustPhoneNum1c) {
		this.acupNewCustPhoneNum1c.setValue(acupNewCustPhoneNum1c);
	}
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum2.
	 * @return the acupNewCustPhoneNum2 attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustPhoneNum2Reference() {
		return acupNewCustPhoneNum2.getReference();
	}

	/**
	 * Getter for acupNewCustPhoneNum2 attribute.
	 * @return acupNewCustPhoneNum2 attribute
	 */
	public String getAcupNewCustPhoneNum2() {
		return acupNewCustPhoneNum2.getValue();
	}

	/**
	 * Setter for acupNewCustPhoneNum2 attribute.
	 * @param acupNewCustPhoneNum2 the new value of acupNewCustPhoneNum2
	 */
	public void setAcupNewCustPhoneNum2(String acupNewCustPhoneNum2) {
		this.acupNewCustPhoneNum2.setValue(acupNewCustPhoneNum2);
	}
	
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum2X.
	 * @return the acupNewCustPhoneNum2X attribute reference
	 */
	public RangeReference getAcupNewCustPhoneNum2XReference() {
		return acupNewCustPhoneNum2X.getReference();
	}	
				
	/**
	 * Setter for acupNewCustPhoneNum2X .
	 */
   	public void setAcupNewCustPhoneNum2X(RangeReference reference) {
       	acupNewCustPhoneNum2X.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum2a.
	 * @return the acupNewCustPhoneNum2a attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustPhoneNum2aReference() {
		return acupNewCustPhoneNum2a.getReference();
	}

	/**
	 * Getter for acupNewCustPhoneNum2a attribute.
	 * @return acupNewCustPhoneNum2a attribute
	 */
	public String getAcupNewCustPhoneNum2a() {
		return acupNewCustPhoneNum2a.getValue();
	}

	/**
	 * Setter for acupNewCustPhoneNum2a attribute.
	 * @param acupNewCustPhoneNum2a the new value of acupNewCustPhoneNum2a
	 */
	public void setAcupNewCustPhoneNum2a(String acupNewCustPhoneNum2a) {
		this.acupNewCustPhoneNum2a.setValue(acupNewCustPhoneNum2a);
	}
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum2b.
	 * @return the acupNewCustPhoneNum2b attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustPhoneNum2bReference() {
		return acupNewCustPhoneNum2b.getReference();
	}

	/**
	 * Getter for acupNewCustPhoneNum2b attribute.
	 * @return acupNewCustPhoneNum2b attribute
	 */
	public String getAcupNewCustPhoneNum2b() {
		return acupNewCustPhoneNum2b.getValue();
	}

	/**
	 * Setter for acupNewCustPhoneNum2b attribute.
	 * @param acupNewCustPhoneNum2b the new value of acupNewCustPhoneNum2b
	 */
	public void setAcupNewCustPhoneNum2b(String acupNewCustPhoneNum2b) {
		this.acupNewCustPhoneNum2b.setValue(acupNewCustPhoneNum2b);
	}
	/**
	 * Gets the reference for attribute acupNewCustPhoneNum2c.
	 * @return the acupNewCustPhoneNum2c attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustPhoneNum2cReference() {
		return acupNewCustPhoneNum2c.getReference();
	}

	/**
	 * Getter for acupNewCustPhoneNum2c attribute.
	 * @return acupNewCustPhoneNum2c attribute
	 */
	public String getAcupNewCustPhoneNum2c() {
		return acupNewCustPhoneNum2c.getValue();
	}

	/**
	 * Setter for acupNewCustPhoneNum2c attribute.
	 * @param acupNewCustPhoneNum2c the new value of acupNewCustPhoneNum2c
	 */
	public void setAcupNewCustPhoneNum2c(String acupNewCustPhoneNum2c) {
		this.acupNewCustPhoneNum2c.setValue(acupNewCustPhoneNum2c);
	}
	
	/**
	 * Gets the reference for attribute acupNewCustSsnX.
	 * @return the acupNewCustSsnX attribute reference
	 */
	public RangeReference getAcupNewCustSsnXReference() {
		return acupNewCustSsnX.getReference();
	}	
				
	/**
	 * Setter for acupNewCustSsnX .
	 */
   	public void setAcupNewCustSsnX(RangeReference reference) {
       	acupNewCustSsnX.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewCustSsn1.
	 * @return the acupNewCustSsn1 attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustSsn1Reference() {
		return acupNewCustSsn1.getReference();
	}

	/**
	 * Getter for acupNewCustSsn1 attribute.
	 * @return acupNewCustSsn1 attribute
	 */
	public String getAcupNewCustSsn1() {
		return acupNewCustSsn1.getValue();
	}

	/**
	 * Setter for acupNewCustSsn1 attribute.
	 * @param acupNewCustSsn1 the new value of acupNewCustSsn1
	 */
	public void setAcupNewCustSsn1(String acupNewCustSsn1) {
		this.acupNewCustSsn1.setValue(acupNewCustSsn1);
	}
	/**
	 * Gets the reference for attribute acupNewCustSsn2.
	 * @return the acupNewCustSsn2 attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustSsn2Reference() {
		return acupNewCustSsn2.getReference();
	}

	/**
	 * Getter for acupNewCustSsn2 attribute.
	 * @return acupNewCustSsn2 attribute
	 */
	public String getAcupNewCustSsn2() {
		return acupNewCustSsn2.getValue();
	}

	/**
	 * Setter for acupNewCustSsn2 attribute.
	 * @param acupNewCustSsn2 the new value of acupNewCustSsn2
	 */
	public void setAcupNewCustSsn2(String acupNewCustSsn2) {
		this.acupNewCustSsn2.setValue(acupNewCustSsn2);
	}
	/**
	 * Gets the reference for attribute acupNewCustSsn3.
	 * @return the acupNewCustSsn3 attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustSsn3Reference() {
		return acupNewCustSsn3.getReference();
	}

	/**
	 * Getter for acupNewCustSsn3 attribute.
	 * @return acupNewCustSsn3 attribute
	 */
	public String getAcupNewCustSsn3() {
		return acupNewCustSsn3.getValue();
	}

	/**
	 * Setter for acupNewCustSsn3 attribute.
	 * @param acupNewCustSsn3 the new value of acupNewCustSsn3
	 */
	public void setAcupNewCustSsn3(String acupNewCustSsn3) {
		this.acupNewCustSsn3.setValue(acupNewCustSsn3);
	}
	/**
	 * Gets the reference for attribute acupNewCustSsn.
	 * @return the acupNewCustSsn attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustSsnReference() {
		return acupNewCustSsn.getReference();
	}

	/**
	 * Getter for acupNewCustSsn attribute.
	 * @return acupNewCustSsn attribute
	 */
	public int getAcupNewCustSsn() {
		return acupNewCustSsn.getValue();
	}

	/**
	 * Setter for acupNewCustSsn attribute.
	 * @param acupNewCustSsn the new value of acupNewCustSsn
	 */
	public void setAcupNewCustSsn(int acupNewCustSsn) {
		this.acupNewCustSsn.setValue(acupNewCustSsn);
	}
	/**
	 * Gets the reference for attribute acupNewCustGovtIssuedId.
	 * @return the acupNewCustGovtIssuedId attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustGovtIssuedIdReference() {
		return acupNewCustGovtIssuedId.getReference();
	}

	/**
	 * Getter for acupNewCustGovtIssuedId attribute.
	 * @return acupNewCustGovtIssuedId attribute
	 */
	public String getAcupNewCustGovtIssuedId() {
		return acupNewCustGovtIssuedId.getValue();
	}

	/**
	 * Setter for acupNewCustGovtIssuedId attribute.
	 * @param acupNewCustGovtIssuedId the new value of acupNewCustGovtIssuedId
	 */
	public void setAcupNewCustGovtIssuedId(String acupNewCustGovtIssuedId) {
		this.acupNewCustGovtIssuedId.setValue(acupNewCustGovtIssuedId);
	}
	/**
	 * Gets the reference for attribute acupNewCustDobYyyyMmDd.
	 * @return the acupNewCustDobYyyyMmDd attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustDobYyyyMmDdReference() {
		return acupNewCustDobYyyyMmDd.getReference();
	}

	/**
	 * Getter for acupNewCustDobYyyyMmDd attribute.
	 * @return acupNewCustDobYyyyMmDd attribute
	 */
	public String getAcupNewCustDobYyyyMmDd() {
		return acupNewCustDobYyyyMmDd.getValue();
	}

	/**
	 * Setter for acupNewCustDobYyyyMmDd attribute.
	 * @param acupNewCustDobYyyyMmDd the new value of acupNewCustDobYyyyMmDd
	 */
	public void setAcupNewCustDobYyyyMmDd(String acupNewCustDobYyyyMmDd) {
		this.acupNewCustDobYyyyMmDd.setValue(acupNewCustDobYyyyMmDd);
	}
	
	/**
	 * Gets the reference for attribute acupNewCustDobParts.
	 * @return the acupNewCustDobParts attribute reference
	 */
	public RangeReference getAcupNewCustDobPartsReference() {
		return acupNewCustDobParts.getReference();
	}	
				
	/**
	 * Setter for acupNewCustDobParts .
	 */
   	public void setAcupNewCustDobParts(RangeReference reference) {
       	acupNewCustDobParts.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute acupNewCustDobYear.
	 * @return the acupNewCustDobYear attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustDobYearReference() {
		return acupNewCustDobYear.getReference();
	}

	/**
	 * Getter for acupNewCustDobYear attribute.
	 * @return acupNewCustDobYear attribute
	 */
	public String getAcupNewCustDobYear() {
		return acupNewCustDobYear.getValue();
	}

	/**
	 * Setter for acupNewCustDobYear attribute.
	 * @param acupNewCustDobYear the new value of acupNewCustDobYear
	 */
	public void setAcupNewCustDobYear(String acupNewCustDobYear) {
		this.acupNewCustDobYear.setValue(acupNewCustDobYear);
	}
	/**
	 * Gets the reference for attribute acupNewCustDobMon.
	 * @return the acupNewCustDobMon attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustDobMonReference() {
		return acupNewCustDobMon.getReference();
	}

	/**
	 * Getter for acupNewCustDobMon attribute.
	 * @return acupNewCustDobMon attribute
	 */
	public String getAcupNewCustDobMon() {
		return acupNewCustDobMon.getValue();
	}

	/**
	 * Setter for acupNewCustDobMon attribute.
	 * @param acupNewCustDobMon the new value of acupNewCustDobMon
	 */
	public void setAcupNewCustDobMon(String acupNewCustDobMon) {
		this.acupNewCustDobMon.setValue(acupNewCustDobMon);
	}
	/**
	 * Gets the reference for attribute acupNewCustDobDay.
	 * @return the acupNewCustDobDay attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustDobDayReference() {
		return acupNewCustDobDay.getReference();
	}

	/**
	 * Getter for acupNewCustDobDay attribute.
	 * @return acupNewCustDobDay attribute
	 */
	public String getAcupNewCustDobDay() {
		return acupNewCustDobDay.getValue();
	}

	/**
	 * Setter for acupNewCustDobDay attribute.
	 * @param acupNewCustDobDay the new value of acupNewCustDobDay
	 */
	public void setAcupNewCustDobDay(String acupNewCustDobDay) {
		this.acupNewCustDobDay.setValue(acupNewCustDobDay);
	}
	/**
	 * Gets the reference for attribute acupNewCustEftAccountId.
	 * @return the acupNewCustEftAccountId attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustEftAccountIdReference() {
		return acupNewCustEftAccountId.getReference();
	}

	/**
	 * Getter for acupNewCustEftAccountId attribute.
	 * @return acupNewCustEftAccountId attribute
	 */
	public String getAcupNewCustEftAccountId() {
		return acupNewCustEftAccountId.getValue();
	}

	/**
	 * Setter for acupNewCustEftAccountId attribute.
	 * @param acupNewCustEftAccountId the new value of acupNewCustEftAccountId
	 */
	public void setAcupNewCustEftAccountId(String acupNewCustEftAccountId) {
		this.acupNewCustEftAccountId.setValue(acupNewCustEftAccountId);
	}
	/**
	 * Gets the reference for attribute acupNewCustPriHolderInd.
	 * @return the acupNewCustPriHolderInd attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustPriHolderIndReference() {
		return acupNewCustPriHolderInd.getReference();
	}

	/**
	 * Getter for acupNewCustPriHolderInd attribute.
	 * @return acupNewCustPriHolderInd attribute
	 */
	public String getAcupNewCustPriHolderInd() {
		return acupNewCustPriHolderInd.getValue();
	}

	/**
	 * Setter for acupNewCustPriHolderInd attribute.
	 * @param acupNewCustPriHolderInd the new value of acupNewCustPriHolderInd
	 */
	public void setAcupNewCustPriHolderInd(String acupNewCustPriHolderInd) {
		this.acupNewCustPriHolderInd.setValue(acupNewCustPriHolderInd);
	}
	/**
	 * Gets the reference for attribute acupNewCustFicoScoreX.
	 * @return the acupNewCustFicoScoreX attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustFicoScoreXReference() {
		return acupNewCustFicoScoreX.getReference();
	}

	/**
	 * Getter for acupNewCustFicoScoreX attribute.
	 * @return acupNewCustFicoScoreX attribute
	 */
	public String getAcupNewCustFicoScoreX() {
		return acupNewCustFicoScoreX.getValue();
	}

	/**
	 * Setter for acupNewCustFicoScoreX attribute.
	 * @param acupNewCustFicoScoreX the new value of acupNewCustFicoScoreX
	 */
	public void setAcupNewCustFicoScoreX(String acupNewCustFicoScoreX) {
		this.acupNewCustFicoScoreX.setValue(acupNewCustFicoScoreX);
	}
	/**
	 * Gets the reference for attribute acupNewCustFicoScore.
	 * @return the acupNewCustFicoScore attribute reference
	 */
	public ElementaryRangeReference getAcupNewCustFicoScoreReference() {
		return acupNewCustFicoScore.getReference();
	}

	/**
	 * Getter for acupNewCustFicoScore attribute.
	 * @return acupNewCustFicoScore attribute
	 */
	public int getAcupNewCustFicoScore() {
		return acupNewCustFicoScore.getValue();
	}

	/**
	 * Setter for acupNewCustFicoScore attribute.
	 * @param acupNewCustFicoScore the new value of acupNewCustFicoScore
	 */
	public void setAcupNewCustFicoScore(int acupNewCustFicoScore) {
		this.acupNewCustFicoScore.setValue(acupNewCustFicoScore);
	}
	/**
	 * Gets the reference for attribute ficoRangeIsValid.
	 * @return the ficoRangeIsValid attribute reference
	 */
	public ConditionReference getFicoRangeIsValidReference() {
		return acupNewCustFicoScore.getCondition(ficoRangeIsValid);	
	}

	/**
	 * Getter for ficoRangeIsValid attribute.
	 * @return ficoRangeIsValid attribute
	 */
	public boolean isFicoRangeIsValid() {
		return getFicoRangeIsValidReference().getValue();	
	}

	/**
	 * Setter for ficoRangeIsValid attribute.
	 * @param ficoRangeIsValid the new value of ficoRangeIsValid
	 */
	public void setFicoRangeIsValid(boolean ficoRangeIsValid) {
		getFicoRangeIsValidReference().setValue(ficoRangeIsValid);	
	}
}
