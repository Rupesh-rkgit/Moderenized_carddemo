package aws.bluage.l3.workshop.cocrdupc.business.context;
import aws.bluage.l3.workshop.cocrdupc.business.model.AbendData;
import aws.bluage.l3.workshop.cocrdupc.business.model.CardRecord;
import aws.bluage.l3.workshop.cocrdupc.business.model.CarddemoCommarea;
import aws.bluage.l3.workshop.cocrdupc.business.model.CcWorkAreas;
import aws.bluage.l3.workshop.cocrdupc.business.model.CcdaCommonMessages;
import aws.bluage.l3.workshop.cocrdupc.business.model.CcdaScreenTitle;
import aws.bluage.l3.workshop.cocrdupc.business.model.CustomerRecord;
import aws.bluage.l3.workshop.cocrdupc.business.model.Dfhaid;
import aws.bluage.l3.workshop.cocrdupc.business.model.Dfhbmsca;
import aws.bluage.l3.workshop.cocrdupc.business.model.Dfhcommarea;
import aws.bluage.l3.workshop.cocrdupc.business.model.Dfheiblk;
import aws.bluage.l3.workshop.cocrdupc.business.model.Group1;
import aws.bluage.l3.workshop.cocrdupc.business.model.SecUserData;
import aws.bluage.l3.workshop.cocrdupc.business.model.WsCommarea;
import aws.bluage.l3.workshop.cocrdupc.business.model.WsDateTime;
import aws.bluage.l3.workshop.cocrdupc.business.model.WsLiterals;
import aws.bluage.l3.workshop.cocrdupc.business.model.WsMiscStorage;
import aws.bluage.l3.workshop.cocrdupc.business.model.WsThisProgcommarea;
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
 * Data simplifier context CocrdupcContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'wsMiscStorage' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.WsMiscStorage
 * <br></p>
 * 
 * <p>About 'wsLiterals' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.WsLiterals
 * <br></p>
 * 
 * <p>About 'ccWorkAreas' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CcWorkAreas
 * <br></p>
 * 
 * <p>About 'carddemoCommarea' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CarddemoCommarea
 * <br></p>
 * 
 * <p>About 'wsThisProgcommarea' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.WsThisProgcommarea
 * <br></p>
 * 
 * <p>About 'wsCommarea' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.WsCommarea
 * <br></p>
 * 
 * <p>About 'dfhbmsca' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.Dfhbmsca
 * <br></p>
 * 
 * <p>About 'dfhaid' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.Dfhaid
 * <br></p>
 * 
 * <p>About 'ccdaScreenTitle' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CcdaScreenTitle
 * <br></p>
 * 
 * <p>About 'group1' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.Group1
 * <br></p>
 * 
 * <p>About 'wsDateTime' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.WsDateTime
 * <br></p>
 * 
 * <p>About 'ccdaCommonMessages' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CcdaCommonMessages
 * <br></p>
 * 
 * <p>About 'abendData' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.AbendData
 * <br></p>
 * 
 * <p>About 'secUserData' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.SecUserData
 * <br></p>
 * 
 * <p>About 'cardRecord' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CardRecord
 * <br></p>
 * 
 * <p>About 'customerRecord' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.CustomerRecord
 * <br></p>
 * 
 * <p>About 'dfheiblk' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.Dfheiblk
 * <br></p>
 * 
 * <p>About 'dfhcommarea' field, <br>uml entity: aws.bluage.l3.workshop.cocrdupc.business.model.Dfhcommarea
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cocrdupc.business.context.CocrdupcContext")
@Lazy
@Scope("prototype")
public class CocrdupcContext extends JicsRuntimeContext {
	
	private WsMiscStorage wsMiscStorage;
	private WsLiterals wsLiterals;
	private CcWorkAreas ccWorkAreas;
	private CarddemoCommarea carddemoCommarea;
	private WsThisProgcommarea wsThisProgcommarea;
	private WsCommarea wsCommarea;
	private Dfhbmsca dfhbmsca;
	private Dfhaid dfhaid;
	private CcdaScreenTitle ccdaScreenTitle;
	private Group1 group1;
	private WsDateTime wsDateTime;
	private CcdaCommonMessages ccdaCommonMessages;
	private AbendData abendData;
	private SecUserData secUserData;
	private CardRecord cardRecord;
	private CustomerRecord customerRecord;
	private Dfheiblk dfheiblk;
	private Dfhcommarea dfhcommarea;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public CocrdupcContext (@Qualifier("CocrdupcContextConfiguration") Configuration configuration) {
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
	 * Getter for cardRecord.
	 * @return the cardRecord
	 */
	public CardRecord getCardRecord() {
		return this.cardRecord;
	}

	/**
	 * Setter for cardRecord.
	 * @param reference the new value for cardRecord
	 */
	public void setCardRecord(RangeReference reference) {
		this.cardRecord.setBytes(reference.getBytes());
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
		carddemoCommarea = new CarddemoCommarea(configuration);
		wsThisProgcommarea = new WsThisProgcommarea(configuration);
		wsCommarea = new WsCommarea(configuration);
		dfhbmsca = new Dfhbmsca(configuration);
		dfhaid = new Dfhaid(configuration);
		ccdaScreenTitle = new CcdaScreenTitle(configuration);
		group1 = new Group1(configuration);
		wsDateTime = new WsDateTime(configuration);
		ccdaCommonMessages = new CcdaCommonMessages(configuration);
		abendData = new AbendData(configuration);
		secUserData = new SecUserData(configuration);
		cardRecord = new CardRecord(configuration);
		customerRecord = new CustomerRecord(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		dfheiblk = new Dfheiblk(configuration, EntityUtils.getUnlinkedRecord());
		dfhcommarea = new Dfhcommarea(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(wsMiscStorage, wsLiterals, ccWorkAreas, carddemoCommarea, wsThisProgcommarea, wsCommarea, dfhbmsca, dfhaid, ccdaScreenTitle, group1, wsDateTime, ccdaCommonMessages, abendData, secUserData, cardRecord, customerRecord);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCocrdupcContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Dfheiblk : [").append(dfheiblk.toString()).append("]\n");
		toSB.append("Dfhcommarea : [").append(dfhcommarea.toString()).append("]\n");
		return toSB.toString();
	}

}
