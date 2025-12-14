package aws.bluage.l3.workshop.cocrdupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
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
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
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
 * <p>About 'cardUpdateScreenData' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CardUpdateScreenData
 * <br></p>
 * 
 * <p>About 'ccupOldDetails' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CcupOldDetails
 * <br></p>
 * 
 * <p>About 'ccupNewDetails' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CcupNewDetails
 * <br></p>
 * 
 * <p>About 'cardUpdateRecord' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CardUpdateRecord
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsThisProgcommarea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group cardUpdateScreenData = new Group(root);
	private final Elementary ccupChangeAction = new Elementary(cardUpdateScreenData,new AlphanumericType(1),Record.LOW_VALUES);
	private final ConditionName ccupDetailsNotFetched=new ConditionName(ccupChangeAction,Record.LOW_VALUES,
	" ");
	private final ConditionName ccupShowDetails=new ConditionName(ccupChangeAction,"S");
	private final ConditionName ccupChangesMade=new ConditionName(ccupChangeAction,"E",
	"N",
	"C",
	"L",
	"F");
	private final ConditionName ccupChangesNotOk=new ConditionName(ccupChangeAction,"E");
	private final ConditionName ccupChangesOkNotConfirmed=new ConditionName(ccupChangeAction,"N");
	private final ConditionName ccupChangesOkayedAndDone=new ConditionName(ccupChangeAction,"C");
	private final ConditionName ccupChangesFailed=new ConditionName(ccupChangeAction,"L",
	"F");
	private final ConditionName ccupChangesOkayedLockError=new ConditionName(ccupChangeAction,"L");
	private final ConditionName ccupChangesOkayedButFailed=new ConditionName(ccupChangeAction,"F");
	private final Group ccupOldDetails = new Group(root);
	private final Elementary ccupOldAcctid = new Elementary(ccupOldDetails,new AlphanumericType(11));
	private final Elementary ccupOldCardid = new Elementary(ccupOldDetails,new AlphanumericType(16));
	private final Elementary ccupOldCvvCd = new Elementary(ccupOldDetails,new AlphanumericType(3));
	private final Group ccupOldCarddata = new Group(ccupOldDetails);
	private final Elementary ccupOldCrdname = new Elementary(ccupOldCarddata,new AlphanumericType(50));
	private final Group ccupOldExpiraionDate = new Group(ccupOldCarddata);
	private final Elementary ccupOldExpyear = new Elementary(ccupOldExpiraionDate,new AlphanumericType(4));
	private final Elementary ccupOldExpmon = new Elementary(ccupOldExpiraionDate,new AlphanumericType(2));
	private final Elementary ccupOldExpday = new Elementary(ccupOldExpiraionDate,new AlphanumericType(2));
	private final Elementary ccupOldCrdstcd = new Elementary(ccupOldCarddata,new AlphanumericType(1));
	private final Group ccupNewDetails = new Group(root);
	private final Elementary ccupNewAcctid = new Elementary(ccupNewDetails,new AlphanumericType(11));
	private final Elementary ccupNewCardid = new Elementary(ccupNewDetails,new AlphanumericType(16));
	private final Elementary ccupNewCvvCd = new Elementary(ccupNewDetails,new AlphanumericType(3));
	private final Group ccupNewCarddata = new Group(ccupNewDetails);
	private final Elementary ccupNewCrdname = new Elementary(ccupNewCarddata,new AlphanumericType(50));
	private final Group ccupNewExpiraionDate = new Group(ccupNewCarddata);
	private final Elementary ccupNewExpyear = new Elementary(ccupNewExpiraionDate,new AlphanumericType(4));
	private final Elementary ccupNewExpmon = new Elementary(ccupNewExpiraionDate,new AlphanumericType(2));
	private final Elementary ccupNewExpday = new Elementary(ccupNewExpiraionDate,new AlphanumericType(2));
	private final Elementary ccupNewCrdstcd = new Elementary(ccupNewCarddata,new AlphanumericType(1));
	private final Group cardUpdateRecord = new Group(root);
	private final Elementary cardUpdateNum = new Elementary(cardUpdateRecord,new AlphanumericType(16));
	private final Elementary cardUpdateAcctId = new Elementary(cardUpdateRecord,new ZonedType(11, 0, false));
	private final Elementary cardUpdateCvvCd = new Elementary(cardUpdateRecord,new ZonedType(3, 0, false));
	private final Elementary cardUpdateEmbossedName = new Elementary(cardUpdateRecord,new AlphanumericType(50));
	private final Elementary cardUpdateExpiraionDate = new Elementary(cardUpdateRecord,new AlphanumericType(10));
	private final Elementary cardUpdateActiveStatus = new Elementary(cardUpdateRecord,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cardUpdateRecord,new AlphanumericType(59));
	

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
	 * Gets the reference for attribute cardUpdateScreenData.
	 * @return the cardUpdateScreenData attribute reference
	 */
	public RangeReference getCardUpdateScreenDataReference() {
		return cardUpdateScreenData.getReference();
	}	
				
	/**
	 * Setter for cardUpdateScreenData .
	 */
   	public void setCardUpdateScreenData(RangeReference reference) {
       	cardUpdateScreenData.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute ccupChangeAction.
	 * @return the ccupChangeAction attribute reference
	 */
	public ElementaryRangeReference getCcupChangeActionReference() {
		return ccupChangeAction.getReference();
	}

	/**
	 * Getter for ccupChangeAction attribute.
	 * @return ccupChangeAction attribute
	 */
	public String getCcupChangeAction() {
		return ccupChangeAction.getValue();
	}

	/**
	 * Setter for ccupChangeAction attribute.
	 * @param ccupChangeAction the new value of ccupChangeAction
	 */
	public void setCcupChangeAction(String ccupChangeAction) {
		this.ccupChangeAction.setValue(ccupChangeAction);
	}
	/**
	 * Gets the reference for attribute ccupDetailsNotFetched.
	 * @return the ccupDetailsNotFetched attribute reference
	 */
	public ConditionReference getCcupDetailsNotFetchedReference() {
		return ccupChangeAction.getCondition(ccupDetailsNotFetched);	
	}

	/**
	 * Getter for ccupDetailsNotFetched attribute.
	 * @return ccupDetailsNotFetched attribute
	 */
	public boolean isCcupDetailsNotFetched() {
		return getCcupDetailsNotFetchedReference().getValue();	
	}

	/**
	 * Setter for ccupDetailsNotFetched attribute.
	 * @param ccupDetailsNotFetched the new value of ccupDetailsNotFetched
	 */
	public void setCcupDetailsNotFetched(boolean ccupDetailsNotFetched) {
		getCcupDetailsNotFetchedReference().setValue(ccupDetailsNotFetched);	
	}
	/**
	 * Gets the reference for attribute ccupShowDetails.
	 * @return the ccupShowDetails attribute reference
	 */
	public ConditionReference getCcupShowDetailsReference() {
		return ccupChangeAction.getCondition(ccupShowDetails);	
	}

	/**
	 * Getter for ccupShowDetails attribute.
	 * @return ccupShowDetails attribute
	 */
	public boolean isCcupShowDetails() {
		return getCcupShowDetailsReference().getValue();	
	}

	/**
	 * Setter for ccupShowDetails attribute.
	 * @param ccupShowDetails the new value of ccupShowDetails
	 */
	public void setCcupShowDetails(boolean ccupShowDetails) {
		getCcupShowDetailsReference().setValue(ccupShowDetails);	
	}
	/**
	 * Gets the reference for attribute ccupChangesMade.
	 * @return the ccupChangesMade attribute reference
	 */
	public ConditionReference getCcupChangesMadeReference() {
		return ccupChangeAction.getCondition(ccupChangesMade);	
	}

	/**
	 * Getter for ccupChangesMade attribute.
	 * @return ccupChangesMade attribute
	 */
	public boolean isCcupChangesMade() {
		return getCcupChangesMadeReference().getValue();	
	}

	/**
	 * Setter for ccupChangesMade attribute.
	 * @param ccupChangesMade the new value of ccupChangesMade
	 */
	public void setCcupChangesMade(boolean ccupChangesMade) {
		getCcupChangesMadeReference().setValue(ccupChangesMade);	
	}
	/**
	 * Gets the reference for attribute ccupChangesNotOk.
	 * @return the ccupChangesNotOk attribute reference
	 */
	public ConditionReference getCcupChangesNotOkReference() {
		return ccupChangeAction.getCondition(ccupChangesNotOk);	
	}

	/**
	 * Getter for ccupChangesNotOk attribute.
	 * @return ccupChangesNotOk attribute
	 */
	public boolean isCcupChangesNotOk() {
		return getCcupChangesNotOkReference().getValue();	
	}

	/**
	 * Setter for ccupChangesNotOk attribute.
	 * @param ccupChangesNotOk the new value of ccupChangesNotOk
	 */
	public void setCcupChangesNotOk(boolean ccupChangesNotOk) {
		getCcupChangesNotOkReference().setValue(ccupChangesNotOk);	
	}
	/**
	 * Gets the reference for attribute ccupChangesOkNotConfirmed.
	 * @return the ccupChangesOkNotConfirmed attribute reference
	 */
	public ConditionReference getCcupChangesOkNotConfirmedReference() {
		return ccupChangeAction.getCondition(ccupChangesOkNotConfirmed);	
	}

	/**
	 * Getter for ccupChangesOkNotConfirmed attribute.
	 * @return ccupChangesOkNotConfirmed attribute
	 */
	public boolean isCcupChangesOkNotConfirmed() {
		return getCcupChangesOkNotConfirmedReference().getValue();	
	}

	/**
	 * Setter for ccupChangesOkNotConfirmed attribute.
	 * @param ccupChangesOkNotConfirmed the new value of ccupChangesOkNotConfirmed
	 */
	public void setCcupChangesOkNotConfirmed(boolean ccupChangesOkNotConfirmed) {
		getCcupChangesOkNotConfirmedReference().setValue(ccupChangesOkNotConfirmed);	
	}
	/**
	 * Gets the reference for attribute ccupChangesOkayedAndDone.
	 * @return the ccupChangesOkayedAndDone attribute reference
	 */
	public ConditionReference getCcupChangesOkayedAndDoneReference() {
		return ccupChangeAction.getCondition(ccupChangesOkayedAndDone);	
	}

	/**
	 * Getter for ccupChangesOkayedAndDone attribute.
	 * @return ccupChangesOkayedAndDone attribute
	 */
	public boolean isCcupChangesOkayedAndDone() {
		return getCcupChangesOkayedAndDoneReference().getValue();	
	}

	/**
	 * Setter for ccupChangesOkayedAndDone attribute.
	 * @param ccupChangesOkayedAndDone the new value of ccupChangesOkayedAndDone
	 */
	public void setCcupChangesOkayedAndDone(boolean ccupChangesOkayedAndDone) {
		getCcupChangesOkayedAndDoneReference().setValue(ccupChangesOkayedAndDone);	
	}
	/**
	 * Gets the reference for attribute ccupChangesFailed.
	 * @return the ccupChangesFailed attribute reference
	 */
	public ConditionReference getCcupChangesFailedReference() {
		return ccupChangeAction.getCondition(ccupChangesFailed);	
	}

	/**
	 * Getter for ccupChangesFailed attribute.
	 * @return ccupChangesFailed attribute
	 */
	public boolean isCcupChangesFailed() {
		return getCcupChangesFailedReference().getValue();	
	}

	/**
	 * Setter for ccupChangesFailed attribute.
	 * @param ccupChangesFailed the new value of ccupChangesFailed
	 */
	public void setCcupChangesFailed(boolean ccupChangesFailed) {
		getCcupChangesFailedReference().setValue(ccupChangesFailed);	
	}
	/**
	 * Gets the reference for attribute ccupChangesOkayedLockError.
	 * @return the ccupChangesOkayedLockError attribute reference
	 */
	public ConditionReference getCcupChangesOkayedLockErrorReference() {
		return ccupChangeAction.getCondition(ccupChangesOkayedLockError);	
	}

	/**
	 * Getter for ccupChangesOkayedLockError attribute.
	 * @return ccupChangesOkayedLockError attribute
	 */
	public boolean isCcupChangesOkayedLockError() {
		return getCcupChangesOkayedLockErrorReference().getValue();	
	}

	/**
	 * Setter for ccupChangesOkayedLockError attribute.
	 * @param ccupChangesOkayedLockError the new value of ccupChangesOkayedLockError
	 */
	public void setCcupChangesOkayedLockError(boolean ccupChangesOkayedLockError) {
		getCcupChangesOkayedLockErrorReference().setValue(ccupChangesOkayedLockError);	
	}
	/**
	 * Gets the reference for attribute ccupChangesOkayedButFailed.
	 * @return the ccupChangesOkayedButFailed attribute reference
	 */
	public ConditionReference getCcupChangesOkayedButFailedReference() {
		return ccupChangeAction.getCondition(ccupChangesOkayedButFailed);	
	}

	/**
	 * Getter for ccupChangesOkayedButFailed attribute.
	 * @return ccupChangesOkayedButFailed attribute
	 */
	public boolean isCcupChangesOkayedButFailed() {
		return getCcupChangesOkayedButFailedReference().getValue();	
	}

	/**
	 * Setter for ccupChangesOkayedButFailed attribute.
	 * @param ccupChangesOkayedButFailed the new value of ccupChangesOkayedButFailed
	 */
	public void setCcupChangesOkayedButFailed(boolean ccupChangesOkayedButFailed) {
		getCcupChangesOkayedButFailedReference().setValue(ccupChangesOkayedButFailed);	
	}
	
	/**
	 * Gets the reference for attribute ccupOldDetails.
	 * @return the ccupOldDetails attribute reference
	 */
	public RangeReference getCcupOldDetailsReference() {
		return ccupOldDetails.getReference();
	}	
				
	/**
	 * Setter for ccupOldDetails .
	 */
   	public void setCcupOldDetails(RangeReference reference) {
       	ccupOldDetails.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute ccupOldAcctid.
	 * @return the ccupOldAcctid attribute reference
	 */
	public ElementaryRangeReference getCcupOldAcctidReference() {
		return ccupOldAcctid.getReference();
	}

	/**
	 * Getter for ccupOldAcctid attribute.
	 * @return ccupOldAcctid attribute
	 */
	public String getCcupOldAcctid() {
		return ccupOldAcctid.getValue();
	}

	/**
	 * Setter for ccupOldAcctid attribute.
	 * @param ccupOldAcctid the new value of ccupOldAcctid
	 */
	public void setCcupOldAcctid(String ccupOldAcctid) {
		this.ccupOldAcctid.setValue(ccupOldAcctid);
	}
	/**
	 * Gets the reference for attribute ccupOldCardid.
	 * @return the ccupOldCardid attribute reference
	 */
	public ElementaryRangeReference getCcupOldCardidReference() {
		return ccupOldCardid.getReference();
	}

	/**
	 * Getter for ccupOldCardid attribute.
	 * @return ccupOldCardid attribute
	 */
	public String getCcupOldCardid() {
		return ccupOldCardid.getValue();
	}

	/**
	 * Setter for ccupOldCardid attribute.
	 * @param ccupOldCardid the new value of ccupOldCardid
	 */
	public void setCcupOldCardid(String ccupOldCardid) {
		this.ccupOldCardid.setValue(ccupOldCardid);
	}
	/**
	 * Gets the reference for attribute ccupOldCvvCd.
	 * @return the ccupOldCvvCd attribute reference
	 */
	public ElementaryRangeReference getCcupOldCvvCdReference() {
		return ccupOldCvvCd.getReference();
	}

	/**
	 * Getter for ccupOldCvvCd attribute.
	 * @return ccupOldCvvCd attribute
	 */
	public String getCcupOldCvvCd() {
		return ccupOldCvvCd.getValue();
	}

	/**
	 * Setter for ccupOldCvvCd attribute.
	 * @param ccupOldCvvCd the new value of ccupOldCvvCd
	 */
	public void setCcupOldCvvCd(String ccupOldCvvCd) {
		this.ccupOldCvvCd.setValue(ccupOldCvvCd);
	}
	
	/**
	 * Gets the reference for attribute ccupOldCarddata.
	 * @return the ccupOldCarddata attribute reference
	 */
	public RangeReference getCcupOldCarddataReference() {
		return ccupOldCarddata.getReference();
	}	
				
	/**
	 * Setter for ccupOldCarddata .
	 */
   	public void setCcupOldCarddata(RangeReference reference) {
       	ccupOldCarddata.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute ccupOldCrdname.
	 * @return the ccupOldCrdname attribute reference
	 */
	public ElementaryRangeReference getCcupOldCrdnameReference() {
		return ccupOldCrdname.getReference();
	}

	/**
	 * Getter for ccupOldCrdname attribute.
	 * @return ccupOldCrdname attribute
	 */
	public String getCcupOldCrdname() {
		return ccupOldCrdname.getValue();
	}

	/**
	 * Setter for ccupOldCrdname attribute.
	 * @param ccupOldCrdname the new value of ccupOldCrdname
	 */
	public void setCcupOldCrdname(String ccupOldCrdname) {
		this.ccupOldCrdname.setValue(ccupOldCrdname);
	}
	
	/**
	 * Gets the reference for attribute ccupOldExpiraionDate.
	 * @return the ccupOldExpiraionDate attribute reference
	 */
	public RangeReference getCcupOldExpiraionDateReference() {
		return ccupOldExpiraionDate.getReference();
	}	
				
	/**
	 * Setter for ccupOldExpiraionDate .
	 */
   	public void setCcupOldExpiraionDate(RangeReference reference) {
       	ccupOldExpiraionDate.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute ccupOldExpyear.
	 * @return the ccupOldExpyear attribute reference
	 */
	public ElementaryRangeReference getCcupOldExpyearReference() {
		return ccupOldExpyear.getReference();
	}

	/**
	 * Getter for ccupOldExpyear attribute.
	 * @return ccupOldExpyear attribute
	 */
	public String getCcupOldExpyear() {
		return ccupOldExpyear.getValue();
	}

	/**
	 * Setter for ccupOldExpyear attribute.
	 * @param ccupOldExpyear the new value of ccupOldExpyear
	 */
	public void setCcupOldExpyear(String ccupOldExpyear) {
		this.ccupOldExpyear.setValue(ccupOldExpyear);
	}
	/**
	 * Gets the reference for attribute ccupOldExpmon.
	 * @return the ccupOldExpmon attribute reference
	 */
	public ElementaryRangeReference getCcupOldExpmonReference() {
		return ccupOldExpmon.getReference();
	}

	/**
	 * Getter for ccupOldExpmon attribute.
	 * @return ccupOldExpmon attribute
	 */
	public String getCcupOldExpmon() {
		return ccupOldExpmon.getValue();
	}

	/**
	 * Setter for ccupOldExpmon attribute.
	 * @param ccupOldExpmon the new value of ccupOldExpmon
	 */
	public void setCcupOldExpmon(String ccupOldExpmon) {
		this.ccupOldExpmon.setValue(ccupOldExpmon);
	}
	/**
	 * Gets the reference for attribute ccupOldExpday.
	 * @return the ccupOldExpday attribute reference
	 */
	public ElementaryRangeReference getCcupOldExpdayReference() {
		return ccupOldExpday.getReference();
	}

	/**
	 * Getter for ccupOldExpday attribute.
	 * @return ccupOldExpday attribute
	 */
	public String getCcupOldExpday() {
		return ccupOldExpday.getValue();
	}

	/**
	 * Setter for ccupOldExpday attribute.
	 * @param ccupOldExpday the new value of ccupOldExpday
	 */
	public void setCcupOldExpday(String ccupOldExpday) {
		this.ccupOldExpday.setValue(ccupOldExpday);
	}
	/**
	 * Gets the reference for attribute ccupOldCrdstcd.
	 * @return the ccupOldCrdstcd attribute reference
	 */
	public ElementaryRangeReference getCcupOldCrdstcdReference() {
		return ccupOldCrdstcd.getReference();
	}

	/**
	 * Getter for ccupOldCrdstcd attribute.
	 * @return ccupOldCrdstcd attribute
	 */
	public String getCcupOldCrdstcd() {
		return ccupOldCrdstcd.getValue();
	}

	/**
	 * Setter for ccupOldCrdstcd attribute.
	 * @param ccupOldCrdstcd the new value of ccupOldCrdstcd
	 */
	public void setCcupOldCrdstcd(String ccupOldCrdstcd) {
		this.ccupOldCrdstcd.setValue(ccupOldCrdstcd);
	}
	
	/**
	 * Gets the reference for attribute ccupNewDetails.
	 * @return the ccupNewDetails attribute reference
	 */
	public RangeReference getCcupNewDetailsReference() {
		return ccupNewDetails.getReference();
	}	
				
	/**
	 * Setter for ccupNewDetails .
	 */
   	public void setCcupNewDetails(RangeReference reference) {
       	ccupNewDetails.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute ccupNewAcctid.
	 * @return the ccupNewAcctid attribute reference
	 */
	public ElementaryRangeReference getCcupNewAcctidReference() {
		return ccupNewAcctid.getReference();
	}

	/**
	 * Getter for ccupNewAcctid attribute.
	 * @return ccupNewAcctid attribute
	 */
	public String getCcupNewAcctid() {
		return ccupNewAcctid.getValue();
	}

	/**
	 * Setter for ccupNewAcctid attribute.
	 * @param ccupNewAcctid the new value of ccupNewAcctid
	 */
	public void setCcupNewAcctid(String ccupNewAcctid) {
		this.ccupNewAcctid.setValue(ccupNewAcctid);
	}
	/**
	 * Gets the reference for attribute ccupNewCardid.
	 * @return the ccupNewCardid attribute reference
	 */
	public ElementaryRangeReference getCcupNewCardidReference() {
		return ccupNewCardid.getReference();
	}

	/**
	 * Getter for ccupNewCardid attribute.
	 * @return ccupNewCardid attribute
	 */
	public String getCcupNewCardid() {
		return ccupNewCardid.getValue();
	}

	/**
	 * Setter for ccupNewCardid attribute.
	 * @param ccupNewCardid the new value of ccupNewCardid
	 */
	public void setCcupNewCardid(String ccupNewCardid) {
		this.ccupNewCardid.setValue(ccupNewCardid);
	}
	/**
	 * Gets the reference for attribute ccupNewCvvCd.
	 * @return the ccupNewCvvCd attribute reference
	 */
	public ElementaryRangeReference getCcupNewCvvCdReference() {
		return ccupNewCvvCd.getReference();
	}

	/**
	 * Getter for ccupNewCvvCd attribute.
	 * @return ccupNewCvvCd attribute
	 */
	public String getCcupNewCvvCd() {
		return ccupNewCvvCd.getValue();
	}

	/**
	 * Setter for ccupNewCvvCd attribute.
	 * @param ccupNewCvvCd the new value of ccupNewCvvCd
	 */
	public void setCcupNewCvvCd(String ccupNewCvvCd) {
		this.ccupNewCvvCd.setValue(ccupNewCvvCd);
	}
	
	/**
	 * Gets the reference for attribute ccupNewCarddata.
	 * @return the ccupNewCarddata attribute reference
	 */
	public RangeReference getCcupNewCarddataReference() {
		return ccupNewCarddata.getReference();
	}	
				
	/**
	 * Setter for ccupNewCarddata .
	 */
   	public void setCcupNewCarddata(RangeReference reference) {
       	ccupNewCarddata.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute ccupNewCrdname.
	 * @return the ccupNewCrdname attribute reference
	 */
	public ElementaryRangeReference getCcupNewCrdnameReference() {
		return ccupNewCrdname.getReference();
	}

	/**
	 * Getter for ccupNewCrdname attribute.
	 * @return ccupNewCrdname attribute
	 */
	public String getCcupNewCrdname() {
		return ccupNewCrdname.getValue();
	}

	/**
	 * Setter for ccupNewCrdname attribute.
	 * @param ccupNewCrdname the new value of ccupNewCrdname
	 */
	public void setCcupNewCrdname(String ccupNewCrdname) {
		this.ccupNewCrdname.setValue(ccupNewCrdname);
	}
	
	/**
	 * Gets the reference for attribute ccupNewExpiraionDate.
	 * @return the ccupNewExpiraionDate attribute reference
	 */
	public RangeReference getCcupNewExpiraionDateReference() {
		return ccupNewExpiraionDate.getReference();
	}	
				
	/**
	 * Setter for ccupNewExpiraionDate .
	 */
   	public void setCcupNewExpiraionDate(RangeReference reference) {
       	ccupNewExpiraionDate.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute ccupNewExpyear.
	 * @return the ccupNewExpyear attribute reference
	 */
	public ElementaryRangeReference getCcupNewExpyearReference() {
		return ccupNewExpyear.getReference();
	}

	/**
	 * Getter for ccupNewExpyear attribute.
	 * @return ccupNewExpyear attribute
	 */
	public String getCcupNewExpyear() {
		return ccupNewExpyear.getValue();
	}

	/**
	 * Setter for ccupNewExpyear attribute.
	 * @param ccupNewExpyear the new value of ccupNewExpyear
	 */
	public void setCcupNewExpyear(String ccupNewExpyear) {
		this.ccupNewExpyear.setValue(ccupNewExpyear);
	}
	/**
	 * Gets the reference for attribute ccupNewExpmon.
	 * @return the ccupNewExpmon attribute reference
	 */
	public ElementaryRangeReference getCcupNewExpmonReference() {
		return ccupNewExpmon.getReference();
	}

	/**
	 * Getter for ccupNewExpmon attribute.
	 * @return ccupNewExpmon attribute
	 */
	public String getCcupNewExpmon() {
		return ccupNewExpmon.getValue();
	}

	/**
	 * Setter for ccupNewExpmon attribute.
	 * @param ccupNewExpmon the new value of ccupNewExpmon
	 */
	public void setCcupNewExpmon(String ccupNewExpmon) {
		this.ccupNewExpmon.setValue(ccupNewExpmon);
	}
	/**
	 * Gets the reference for attribute ccupNewExpday.
	 * @return the ccupNewExpday attribute reference
	 */
	public ElementaryRangeReference getCcupNewExpdayReference() {
		return ccupNewExpday.getReference();
	}

	/**
	 * Getter for ccupNewExpday attribute.
	 * @return ccupNewExpday attribute
	 */
	public String getCcupNewExpday() {
		return ccupNewExpday.getValue();
	}

	/**
	 * Setter for ccupNewExpday attribute.
	 * @param ccupNewExpday the new value of ccupNewExpday
	 */
	public void setCcupNewExpday(String ccupNewExpday) {
		this.ccupNewExpday.setValue(ccupNewExpday);
	}
	/**
	 * Gets the reference for attribute ccupNewCrdstcd.
	 * @return the ccupNewCrdstcd attribute reference
	 */
	public ElementaryRangeReference getCcupNewCrdstcdReference() {
		return ccupNewCrdstcd.getReference();
	}

	/**
	 * Getter for ccupNewCrdstcd attribute.
	 * @return ccupNewCrdstcd attribute
	 */
	public String getCcupNewCrdstcd() {
		return ccupNewCrdstcd.getValue();
	}

	/**
	 * Setter for ccupNewCrdstcd attribute.
	 * @param ccupNewCrdstcd the new value of ccupNewCrdstcd
	 */
	public void setCcupNewCrdstcd(String ccupNewCrdstcd) {
		this.ccupNewCrdstcd.setValue(ccupNewCrdstcd);
	}
	
	/**
	 * Gets the reference for attribute cardUpdateRecord.
	 * @return the cardUpdateRecord attribute reference
	 */
	public RangeReference getCardUpdateRecordReference() {
		return cardUpdateRecord.getReference();
	}	
				
	/**
	 * Setter for cardUpdateRecord .
	 */
   	public void setCardUpdateRecord(RangeReference reference) {
       	cardUpdateRecord.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute cardUpdateNum.
	 * @return the cardUpdateNum attribute reference
	 */
	public ElementaryRangeReference getCardUpdateNumReference() {
		return cardUpdateNum.getReference();
	}

	/**
	 * Getter for cardUpdateNum attribute.
	 * @return cardUpdateNum attribute
	 */
	public String getCardUpdateNum() {
		return cardUpdateNum.getValue();
	}

	/**
	 * Setter for cardUpdateNum attribute.
	 * @param cardUpdateNum the new value of cardUpdateNum
	 */
	public void setCardUpdateNum(String cardUpdateNum) {
		this.cardUpdateNum.setValue(cardUpdateNum);
	}
	/**
	 * Gets the reference for attribute cardUpdateAcctId.
	 * @return the cardUpdateAcctId attribute reference
	 */
	public ElementaryRangeReference getCardUpdateAcctIdReference() {
		return cardUpdateAcctId.getReference();
	}

	/**
	 * Getter for cardUpdateAcctId attribute.
	 * @return cardUpdateAcctId attribute
	 */
	public long getCardUpdateAcctId() {
		return cardUpdateAcctId.getValue();
	}

	/**
	 * Setter for cardUpdateAcctId attribute.
	 * @param cardUpdateAcctId the new value of cardUpdateAcctId
	 */
	public void setCardUpdateAcctId(long cardUpdateAcctId) {
		this.cardUpdateAcctId.setValue(cardUpdateAcctId);
	}
	/**
	 * Gets the reference for attribute cardUpdateCvvCd.
	 * @return the cardUpdateCvvCd attribute reference
	 */
	public ElementaryRangeReference getCardUpdateCvvCdReference() {
		return cardUpdateCvvCd.getReference();
	}

	/**
	 * Getter for cardUpdateCvvCd attribute.
	 * @return cardUpdateCvvCd attribute
	 */
	public int getCardUpdateCvvCd() {
		return cardUpdateCvvCd.getValue();
	}

	/**
	 * Setter for cardUpdateCvvCd attribute.
	 * @param cardUpdateCvvCd the new value of cardUpdateCvvCd
	 */
	public void setCardUpdateCvvCd(int cardUpdateCvvCd) {
		this.cardUpdateCvvCd.setValue(cardUpdateCvvCd);
	}
	/**
	 * Gets the reference for attribute cardUpdateEmbossedName.
	 * @return the cardUpdateEmbossedName attribute reference
	 */
	public ElementaryRangeReference getCardUpdateEmbossedNameReference() {
		return cardUpdateEmbossedName.getReference();
	}

	/**
	 * Getter for cardUpdateEmbossedName attribute.
	 * @return cardUpdateEmbossedName attribute
	 */
	public String getCardUpdateEmbossedName() {
		return cardUpdateEmbossedName.getValue();
	}

	/**
	 * Setter for cardUpdateEmbossedName attribute.
	 * @param cardUpdateEmbossedName the new value of cardUpdateEmbossedName
	 */
	public void setCardUpdateEmbossedName(String cardUpdateEmbossedName) {
		this.cardUpdateEmbossedName.setValue(cardUpdateEmbossedName);
	}
	/**
	 * Gets the reference for attribute cardUpdateExpiraionDate.
	 * @return the cardUpdateExpiraionDate attribute reference
	 */
	public ElementaryRangeReference getCardUpdateExpiraionDateReference() {
		return cardUpdateExpiraionDate.getReference();
	}

	/**
	 * Getter for cardUpdateExpiraionDate attribute.
	 * @return cardUpdateExpiraionDate attribute
	 */
	public String getCardUpdateExpiraionDate() {
		return cardUpdateExpiraionDate.getValue();
	}

	/**
	 * Setter for cardUpdateExpiraionDate attribute.
	 * @param cardUpdateExpiraionDate the new value of cardUpdateExpiraionDate
	 */
	public void setCardUpdateExpiraionDate(String cardUpdateExpiraionDate) {
		this.cardUpdateExpiraionDate.setValue(cardUpdateExpiraionDate);
	}
	/**
	 * Gets the reference for attribute cardUpdateActiveStatus.
	 * @return the cardUpdateActiveStatus attribute reference
	 */
	public ElementaryRangeReference getCardUpdateActiveStatusReference() {
		return cardUpdateActiveStatus.getReference();
	}

	/**
	 * Getter for cardUpdateActiveStatus attribute.
	 * @return cardUpdateActiveStatus attribute
	 */
	public String getCardUpdateActiveStatus() {
		return cardUpdateActiveStatus.getValue();
	}

	/**
	 * Setter for cardUpdateActiveStatus attribute.
	 * @param cardUpdateActiveStatus the new value of cardUpdateActiveStatus
	 */
	public void setCardUpdateActiveStatus(String cardUpdateActiveStatus) {
		this.cardUpdateActiveStatus.setValue(cardUpdateActiveStatus);
	}
}
