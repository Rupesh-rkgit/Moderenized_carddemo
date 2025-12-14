package aws.bluage.l3.workshop.coactupc.business.context;
import aws.bluage.l3.workshop.coactupc.business.model.AbendData;
import aws.bluage.l3.workshop.coactupc.business.model.AccountRecord;
import aws.bluage.l3.workshop.coactupc.business.model.CardXrefRecord;
import aws.bluage.l3.workshop.coactupc.business.model.CarddemoCommarea;
import aws.bluage.l3.workshop.coactupc.business.model.CcWorkAreas;
import aws.bluage.l3.workshop.coactupc.business.model.CcdaCommonMessages;
import aws.bluage.l3.workshop.coactupc.business.model.CcdaScreenTitle;
import aws.bluage.l3.workshop.coactupc.business.model.CustomerRecord;
import aws.bluage.l3.workshop.coactupc.business.model.Dfhaid;
import aws.bluage.l3.workshop.coactupc.business.model.Dfhbmsca;
import aws.bluage.l3.workshop.coactupc.business.model.Dfhcommarea;
import aws.bluage.l3.workshop.coactupc.business.model.Dfheiblk;
import aws.bluage.l3.workshop.coactupc.business.model.Group1;
import aws.bluage.l3.workshop.coactupc.business.model.LitAllAlphaFrom;
import aws.bluage.l3.workshop.coactupc.business.model.LitAllAlphanumFrom;
import aws.bluage.l3.workshop.coactupc.business.model.LitAllNumFrom;
import aws.bluage.l3.workshop.coactupc.business.model.LitAlphaSpacesTo;
import aws.bluage.l3.workshop.coactupc.business.model.LitAlphanumSpacesTo;
import aws.bluage.l3.workshop.coactupc.business.model.LitNumSpacesTo;
import aws.bluage.l3.workshop.coactupc.business.model.SecUserData;
import aws.bluage.l3.workshop.coactupc.business.model.UsStateCodeToEdit;
import aws.bluage.l3.workshop.coactupc.business.model.UsStateZipcodeToEdit;
import aws.bluage.l3.workshop.coactupc.business.model.WsCommarea;
import aws.bluage.l3.workshop.coactupc.business.model.WsDateTime;
import aws.bluage.l3.workshop.coactupc.business.model.WsLiterals;
import aws.bluage.l3.workshop.coactupc.business.model.WsMiscStorage;
import aws.bluage.l3.workshop.coactupc.business.model.WsThisProgcommarea;
import aws.bluage.l3.workshop.coactupc.business.model.WsUsPhoneAreaCodeToEdit;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.rt.jics.context.JicsRuntimeContext;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier context CoactupcContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'wsMiscStorage' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsMiscStorage
 * <br></p>
 * 
 * <p>About 'wsLiterals' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsLiterals
 * <br></p>
 * 
 * <p>About 'ccWorkAreas' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.CcWorkAreas
 * <br></p>
 * 
 * <p>About 'wsUsPhoneAreaCodeToEdit' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsUsPhoneAreaCodeToEdit
 * <br></p>
 * 
 * <p>About 'usStateCodeToEdit' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.UsStateCodeToEdit
 * <br></p>
 * 
 * <p>About 'usStateZipcodeToEdit' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.UsStateZipcodeToEdit
 * <br></p>
 * 
 * <p>About 'litAllAlphaFrom' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.LitAllAlphaFrom
 * <br></p>
 * 
 * <p>About 'litAllAlphanumFrom' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.LitAllAlphanumFrom
 * <br></p>
 * 
 * <p>About 'litAllNumFrom' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.LitAllNumFrom
 * <br></p>
 * 
 * <p>About 'litAlphaSpacesTo' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.LitAlphaSpacesTo
 * <br></p>
 * 
 * <p>About 'litAlphanumSpacesTo' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.LitAlphanumSpacesTo
 * <br></p>
 * 
 * <p>About 'litNumSpacesTo' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.LitNumSpacesTo
 * <br></p>
 * 
 * <p>About 'dfhbmsca' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.Dfhbmsca
 * <br></p>
 * 
 * <p>About 'dfhaid' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.Dfhaid
 * <br></p>
 * 
 * <p>About 'ccdaScreenTitle' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.CcdaScreenTitle
 * <br></p>
 * 
 * <p>About 'group1' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.Group1
 * <br></p>
 * 
 * <p>About 'wsDateTime' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsDateTime
 * <br></p>
 * 
 * <p>About 'ccdaCommonMessages' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.CcdaCommonMessages
 * <br></p>
 * 
 * <p>About 'abendData' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.AbendData
 * <br></p>
 * 
 * <p>About 'secUserData' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.SecUserData
 * <br></p>
 * 
 * <p>About 'accountRecord' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.AccountRecord
 * <br></p>
 * 
 * <p>About 'cardXrefRecord' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.CardXrefRecord
 * <br></p>
 * 
 * <p>About 'customerRecord' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.CustomerRecord
 * <br></p>
 * 
 * <p>About 'carddemoCommarea' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.CarddemoCommarea
 * <br></p>
 * 
 * <p>About 'wsThisProgcommarea' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsThisProgcommarea
 * <br></p>
 * 
 * <p>About 'wsCommarea' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.WsCommarea
 * <br></p>
 * 
 * <p>About 'dfheiblk' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.Dfheiblk
 * <br></p>
 * 
 * <p>About 'dfhcommarea' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.Dfhcommarea
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.coactupc.business.context.CoactupcContext")
@Lazy
@Scope("prototype")
public class CoactupcContext extends JicsRuntimeContext {
	
	private WsMiscStorage wsMiscStorage;
	private WsLiterals wsLiterals;
	private CcWorkAreas ccWorkAreas;
	private WsUsPhoneAreaCodeToEdit wsUsPhoneAreaCodeToEdit;
	private UsStateCodeToEdit usStateCodeToEdit;
	private UsStateZipcodeToEdit usStateZipcodeToEdit;
	private LitAllAlphaFrom litAllAlphaFrom;
	private LitAllAlphanumFrom litAllAlphanumFrom;
	private LitAllNumFrom litAllNumFrom;
	private LitAlphaSpacesTo litAlphaSpacesTo;
	private LitAlphanumSpacesTo litAlphanumSpacesTo;
	private LitNumSpacesTo litNumSpacesTo;
	private Dfhbmsca dfhbmsca;
	private Dfhaid dfhaid;
	private CcdaScreenTitle ccdaScreenTitle;
	private Group1 group1;
	private WsDateTime wsDateTime;
	private CcdaCommonMessages ccdaCommonMessages;
	private AbendData abendData;
	private SecUserData secUserData;
	private AccountRecord accountRecord;
	private CardXrefRecord cardXrefRecord;
	private CustomerRecord customerRecord;
	private CarddemoCommarea carddemoCommarea;
	private WsThisProgcommarea wsThisProgcommarea;
	private WsCommarea wsCommarea;
	private Dfheiblk dfheiblk;
	private Dfhcommarea dfhcommarea;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public CoactupcContext (@Qualifier("CoactupcContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
	}
	
	/**
	 * Add count holders:
	 * 
	 * Once all entities/files have been initialized, bind the
	 * elementary references that act as count holder for 
	 * variable size arrays.
	 */
	@PostConstruct
	public void addCountHolders(){
		dfhcommarea.setTableCountHolder(dfheiblk.getEibcalenReference());
	}
	

	/**
	 * Getter for wsMiscStorage.
	 * @return the wsMiscStorage
	 */
	public WsMiscStorage getWsMiscStorage() {
		return this.wsMiscStorage;
	}

	/**
	 * Setter for wsMiscStorage.
	 * @param reference the new value for wsMiscStorage
	 */
	public void setWsMiscStorage(RangeReference reference) {
		this.wsMiscStorage.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsLiterals.
	 * @return the wsLiterals
	 */
	public WsLiterals getWsLiterals() {
		return this.wsLiterals;
	}

	/**
	 * Setter for wsLiterals.
	 * @param reference the new value for wsLiterals
	 */
	public void setWsLiterals(RangeReference reference) {
		this.wsLiterals.setBytes(reference.getBytes());
	}

	/**
	 * Getter for ccWorkAreas.
	 * @return the ccWorkAreas
	 */
	public CcWorkAreas getCcWorkAreas() {
		return this.ccWorkAreas;
	}

	/**
	 * Setter for ccWorkAreas.
	 * @param reference the new value for ccWorkAreas
	 */
	public void setCcWorkAreas(RangeReference reference) {
		this.ccWorkAreas.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsUsPhoneAreaCodeToEdit.
	 * @return the wsUsPhoneAreaCodeToEdit
	 */
	public WsUsPhoneAreaCodeToEdit getWsUsPhoneAreaCodeToEdit() {
		return this.wsUsPhoneAreaCodeToEdit;
	}

	/**
	 * Setter for wsUsPhoneAreaCodeToEdit.
	 * @param reference the new value for wsUsPhoneAreaCodeToEdit
	 */
	public void setWsUsPhoneAreaCodeToEdit(RangeReference reference) {
		this.wsUsPhoneAreaCodeToEdit.setBytes(reference.getBytes());
	}

	/**
	 * Getter for usStateCodeToEdit.
	 * @return the usStateCodeToEdit
	 */
	public UsStateCodeToEdit getUsStateCodeToEdit() {
		return this.usStateCodeToEdit;
	}

	/**
	 * Setter for usStateCodeToEdit.
	 * @param reference the new value for usStateCodeToEdit
	 */
	public void setUsStateCodeToEdit(RangeReference reference) {
		this.usStateCodeToEdit.setBytes(reference.getBytes());
	}

	/**
	 * Getter for usStateZipcodeToEdit.
	 * @return the usStateZipcodeToEdit
	 */
	public UsStateZipcodeToEdit getUsStateZipcodeToEdit() {
		return this.usStateZipcodeToEdit;
	}

	/**
	 * Setter for usStateZipcodeToEdit.
	 * @param reference the new value for usStateZipcodeToEdit
	 */
	public void setUsStateZipcodeToEdit(RangeReference reference) {
		this.usStateZipcodeToEdit.setBytes(reference.getBytes());
	}

	/**
	 * Getter for litAllAlphaFrom.
	 * @return the litAllAlphaFrom
	 */
	public LitAllAlphaFrom getLitAllAlphaFrom() {
		return this.litAllAlphaFrom;
	}

	/**
	 * Setter for litAllAlphaFrom.
	 * @param reference the new value for litAllAlphaFrom
	 */
	public void setLitAllAlphaFrom(RangeReference reference) {
		this.litAllAlphaFrom.setBytes(reference.getBytes());
	}

	/**
	 * Getter for litAllAlphanumFrom.
	 * @return the litAllAlphanumFrom
	 */
	public LitAllAlphanumFrom getLitAllAlphanumFrom() {
		return this.litAllAlphanumFrom;
	}

	/**
	 * Setter for litAllAlphanumFrom.
	 * @param reference the new value for litAllAlphanumFrom
	 */
	public void setLitAllAlphanumFrom(RangeReference reference) {
		this.litAllAlphanumFrom.setBytes(reference.getBytes());
	}

	/**
	 * Getter for litAllNumFrom.
	 * @return the litAllNumFrom
	 */
	public LitAllNumFrom getLitAllNumFrom() {
		return this.litAllNumFrom;
	}

	/**
	 * Setter for litAllNumFrom.
	 * @param reference the new value for litAllNumFrom
	 */
	public void setLitAllNumFrom(RangeReference reference) {
		this.litAllNumFrom.setBytes(reference.getBytes());
	}

	/**
	 * Getter for litAlphaSpacesTo.
	 * @return the litAlphaSpacesTo
	 */
	public LitAlphaSpacesTo getLitAlphaSpacesTo() {
		return this.litAlphaSpacesTo;
	}

	/**
	 * Setter for litAlphaSpacesTo.
	 * @param reference the new value for litAlphaSpacesTo
	 */
	public void setLitAlphaSpacesTo(RangeReference reference) {
		this.litAlphaSpacesTo.setBytes(reference.getBytes());
	}

	/**
	 * Getter for litAlphanumSpacesTo.
	 * @return the litAlphanumSpacesTo
	 */
	public LitAlphanumSpacesTo getLitAlphanumSpacesTo() {
		return this.litAlphanumSpacesTo;
	}

	/**
	 * Setter for litAlphanumSpacesTo.
	 * @param reference the new value for litAlphanumSpacesTo
	 */
	public void setLitAlphanumSpacesTo(RangeReference reference) {
		this.litAlphanumSpacesTo.setBytes(reference.getBytes());
	}

	/**
	 * Getter for litNumSpacesTo.
	 * @return the litNumSpacesTo
	 */
	public LitNumSpacesTo getLitNumSpacesTo() {
		return this.litNumSpacesTo;
	}

	/**
	 * Setter for litNumSpacesTo.
	 * @param reference the new value for litNumSpacesTo
	 */
	public void setLitNumSpacesTo(RangeReference reference) {
		this.litNumSpacesTo.setBytes(reference.getBytes());
	}

	/**
	 * Getter for dfhbmsca.
	 * @return the dfhbmsca
	 */
	public Dfhbmsca getDfhbmsca() {
		return this.dfhbmsca;
	}

	/**
	 * Setter for dfhbmsca.
	 * @param reference the new value for dfhbmsca
	 */
	public void setDfhbmsca(RangeReference reference) {
		this.dfhbmsca.setBytes(reference.getBytes());
	}

	/**
	 * Getter for dfhaid.
	 * @return the dfhaid
	 */
	public Dfhaid getDfhaid() {
		return this.dfhaid;
	}

	/**
	 * Setter for dfhaid.
	 * @param reference the new value for dfhaid
	 */
	public void setDfhaid(RangeReference reference) {
		this.dfhaid.setBytes(reference.getBytes());
	}

	/**
	 * Getter for ccdaScreenTitle.
	 * @return the ccdaScreenTitle
	 */
	public CcdaScreenTitle getCcdaScreenTitle() {
		return this.ccdaScreenTitle;
	}

	/**
	 * Setter for ccdaScreenTitle.
	 * @param reference the new value for ccdaScreenTitle
	 */
	public void setCcdaScreenTitle(RangeReference reference) {
		this.ccdaScreenTitle.setBytes(reference.getBytes());
	}

	/**
	 * Getter for group1.
	 * @return the group1
	 */
	public Group1 getGroup1() {
		return this.group1;
	}

	/**
	 * Setter for group1.
	 * @param reference the new value for group1
	 */
	public void setGroup1(RangeReference reference) {
		this.group1.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsDateTime.
	 * @return the wsDateTime
	 */
	public WsDateTime getWsDateTime() {
		return this.wsDateTime;
	}

	/**
	 * Setter for wsDateTime.
	 * @param reference the new value for wsDateTime
	 */
	public void setWsDateTime(RangeReference reference) {
		this.wsDateTime.setBytes(reference.getBytes());
	}

	/**
	 * Getter for ccdaCommonMessages.
	 * @return the ccdaCommonMessages
	 */
	public CcdaCommonMessages getCcdaCommonMessages() {
		return this.ccdaCommonMessages;
	}

	/**
	 * Setter for ccdaCommonMessages.
	 * @param reference the new value for ccdaCommonMessages
	 */
	public void setCcdaCommonMessages(RangeReference reference) {
		this.ccdaCommonMessages.setBytes(reference.getBytes());
	}

	/**
	 * Getter for abendData.
	 * @return the abendData
	 */
	public AbendData getAbendData() {
		return this.abendData;
	}

	/**
	 * Setter for abendData.
	 * @param reference the new value for abendData
	 */
	public void setAbendData(RangeReference reference) {
		this.abendData.setBytes(reference.getBytes());
	}

	/**
	 * Getter for secUserData.
	 * @return the secUserData
	 */
	public SecUserData getSecUserData() {
		return this.secUserData;
	}

	/**
	 * Setter for secUserData.
	 * @param reference the new value for secUserData
	 */
	public void setSecUserData(RangeReference reference) {
		this.secUserData.setBytes(reference.getBytes());
	}

	/**
	 * Getter for accountRecord.
	 * @return the accountRecord
	 */
	public AccountRecord getAccountRecord() {
		return this.accountRecord;
	}

	/**
	 * Setter for accountRecord.
	 * @param reference the new value for accountRecord
	 */
	public void setAccountRecord(RangeReference reference) {
		this.accountRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for cardXrefRecord.
	 * @return the cardXrefRecord
	 */
	public CardXrefRecord getCardXrefRecord() {
		return this.cardXrefRecord;
	}

	/**
	 * Setter for cardXrefRecord.
	 * @param reference the new value for cardXrefRecord
	 */
	public void setCardXrefRecord(RangeReference reference) {
		this.cardXrefRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for customerRecord.
	 * @return the customerRecord
	 */
	public CustomerRecord getCustomerRecord() {
		return this.customerRecord;
	}

	/**
	 * Setter for customerRecord.
	 * @param reference the new value for customerRecord
	 */
	public void setCustomerRecord(RangeReference reference) {
		this.customerRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for carddemoCommarea.
	 * @return the carddemoCommarea
	 */
	public CarddemoCommarea getCarddemoCommarea() {
		return this.carddemoCommarea;
	}

	/**
	 * Setter for carddemoCommarea.
	 * @param reference the new value for carddemoCommarea
	 */
	public void setCarddemoCommarea(RangeReference reference) {
		this.carddemoCommarea.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsThisProgcommarea.
	 * @return the wsThisProgcommarea
	 */
	public WsThisProgcommarea getWsThisProgcommarea() {
		return this.wsThisProgcommarea;
	}

	/**
	 * Setter for wsThisProgcommarea.
	 * @param reference the new value for wsThisProgcommarea
	 */
	public void setWsThisProgcommarea(RangeReference reference) {
		this.wsThisProgcommarea.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsCommarea.
	 * @return the wsCommarea
	 */
	public WsCommarea getWsCommarea() {
		return this.wsCommarea;
	}

	/**
	 * Setter for wsCommarea.
	 * @param reference the new value for wsCommarea
	 */
	public void setWsCommarea(RangeReference reference) {
		this.wsCommarea.setBytes(reference.getBytes());
	}

	/**
	 * Getter for dfheiblk.
	 * @return the dfheiblk
	 */
	public Dfheiblk getDfheiblk() {
		return this.dfheiblk;
	}

	/**
	 * Setter for dfheiblk.
	 * @param reference the new value for dfheiblk
	 */
	public void setDfheiblk(RangeReference reference) {
		this.dfheiblk.setBytes(reference.getBytes());
	}

	/**
	 * Getter for dfhcommarea.
	 * @return the dfhcommarea
	 */
	public Dfhcommarea getDfhcommarea() {
		return this.dfhcommarea;
	}

	/**
	 * Setter for dfhcommarea.
	 * @param reference the new value for dfhcommarea
	 */
	public void setDfhcommarea(RangeReference reference) {
		this.dfhcommarea.setBytes(reference.getBytes());
	}

	@Override 
	public void cleanUp(){
	}

	@Override
	protected void doReset() {
		cleanUp();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
	}

	
	private void initWorking(Configuration configuration) {
		wsMiscStorage = new WsMiscStorage(configuration);
		wsLiterals = new WsLiterals(configuration);
		ccWorkAreas = new CcWorkAreas(configuration);
		wsUsPhoneAreaCodeToEdit = new WsUsPhoneAreaCodeToEdit(configuration);
		usStateCodeToEdit = new UsStateCodeToEdit(configuration);
		usStateZipcodeToEdit = new UsStateZipcodeToEdit(configuration);
		litAllAlphaFrom = new LitAllAlphaFrom(configuration);
		litAllAlphanumFrom = new LitAllAlphanumFrom(configuration);
		litAllNumFrom = new LitAllNumFrom(configuration);
		litAlphaSpacesTo = new LitAlphaSpacesTo(configuration);
		litAlphanumSpacesTo = new LitAlphanumSpacesTo(configuration);
		litNumSpacesTo = new LitNumSpacesTo(configuration);
		dfhbmsca = new Dfhbmsca(configuration);
		dfhaid = new Dfhaid(configuration);
		ccdaScreenTitle = new CcdaScreenTitle(configuration);
		group1 = new Group1(configuration);
		wsDateTime = new WsDateTime(configuration);
		ccdaCommonMessages = new CcdaCommonMessages(configuration);
		abendData = new AbendData(configuration);
		secUserData = new SecUserData(configuration);
		accountRecord = new AccountRecord(configuration);
		cardXrefRecord = new CardXrefRecord(configuration);
		customerRecord = new CustomerRecord(configuration);
		carddemoCommarea = new CarddemoCommarea(configuration);
		wsThisProgcommarea = new WsThisProgcommarea(configuration);
		wsCommarea = new WsCommarea(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		dfheiblk = new Dfheiblk(configuration, EntityUtils.getUnlinkedRecord());
		dfhcommarea = new Dfhcommarea(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(wsMiscStorage, wsLiterals, ccWorkAreas, wsUsPhoneAreaCodeToEdit, usStateCodeToEdit, usStateZipcodeToEdit, litAllAlphaFrom, litAllAlphanumFrom, litAllNumFrom, litAlphaSpacesTo, litAlphanumSpacesTo, litNumSpacesTo, dfhbmsca, dfhaid, ccdaScreenTitle, group1, wsDateTime, ccdaCommonMessages, abendData, secUserData, accountRecord, cardXrefRecord, customerRecord, carddemoCommarea, wsThisProgcommarea, wsCommarea);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCoactupcContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Dfheiblk : [").append(dfheiblk.toString()).append("]\n");
		toSB.append("Dfhcommarea : [").append(dfhcommarea.toString()).append("]\n");
		return toSB.toString();
	}

}
