package aws.bluage.l3.workshop.comen01c.business.context;
import aws.bluage.l3.workshop.comen01c.business.model.CarddemoCommarea;
import aws.bluage.l3.workshop.comen01c.business.model.CarddemoMainMenuOptions;
import aws.bluage.l3.workshop.comen01c.business.model.CcdaCommonMessages;
import aws.bluage.l3.workshop.comen01c.business.model.CcdaScreenTitle;
import aws.bluage.l3.workshop.comen01c.business.model.Dfhaid;
import aws.bluage.l3.workshop.comen01c.business.model.Dfhbmsca;
import aws.bluage.l3.workshop.comen01c.business.model.Dfhcommarea;
import aws.bluage.l3.workshop.comen01c.business.model.Dfheiblk;
import aws.bluage.l3.workshop.comen01c.business.model.Group1;
import aws.bluage.l3.workshop.comen01c.business.model.SecUserData;
import aws.bluage.l3.workshop.comen01c.business.model.WsDateTime;
import aws.bluage.l3.workshop.comen01c.business.model.WsVariables;
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
 * Data simplifier context Comen01cContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'wsVariables' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.WsVariables
 * <br></p>
 * 
 * <p>About 'carddemoCommarea' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.CarddemoCommarea
 * <br></p>
 * 
 * <p>About 'carddemoMainMenuOptions' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.CarddemoMainMenuOptions
 * <br></p>
 * 
 * <p>About 'group1' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.Group1
 * <br></p>
 * 
 * <p>About 'ccdaScreenTitle' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.CcdaScreenTitle
 * <br></p>
 * 
 * <p>About 'wsDateTime' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.WsDateTime
 * <br></p>
 * 
 * <p>About 'ccdaCommonMessages' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.CcdaCommonMessages
 * <br></p>
 * 
 * <p>About 'secUserData' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.SecUserData
 * <br></p>
 * 
 * <p>About 'dfhaid' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.Dfhaid
 * <br></p>
 * 
 * <p>About 'dfhbmsca' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.Dfhbmsca
 * <br></p>
 * 
 * <p>About 'dfheiblk' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.Dfheiblk
 * <br></p>
 * 
 * <p>About 'dfhcommarea' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.Dfhcommarea
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.comen01c.business.context.Comen01cContext")
@Lazy
@Scope("prototype")
public class Comen01cContext extends JicsRuntimeContext {
	
	private WsVariables wsVariables;
	private CarddemoCommarea carddemoCommarea;
	private CarddemoMainMenuOptions carddemoMainMenuOptions;
	private Group1 group1;
	private CcdaScreenTitle ccdaScreenTitle;
	private WsDateTime wsDateTime;
	private CcdaCommonMessages ccdaCommonMessages;
	private SecUserData secUserData;
	private Dfhaid dfhaid;
	private Dfhbmsca dfhbmsca;
	private Dfheiblk dfheiblk;
	private Dfhcommarea dfhcommarea;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Comen01cContext (@Qualifier("Comen01cContextConfiguration") Configuration configuration) {
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
		dfhcommarea.setLkCommareaCountHolder(dfheiblk.getEibcalenReference());
	}
	

	/**
	 * Getter for wsVariables.
	 * @return the wsVariables
	 */
	public WsVariables getWsVariables() {
		return this.wsVariables;
	}

	/**
	 * Setter for wsVariables.
	 * @param reference the new value for wsVariables
	 */
	public void setWsVariables(RangeReference reference) {
		this.wsVariables.setBytes(reference.getBytes());
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
	 * Getter for carddemoMainMenuOptions.
	 * @return the carddemoMainMenuOptions
	 */
	public CarddemoMainMenuOptions getCarddemoMainMenuOptions() {
		return this.carddemoMainMenuOptions;
	}

	/**
	 * Setter for carddemoMainMenuOptions.
	 * @param reference the new value for carddemoMainMenuOptions
	 */
	public void setCarddemoMainMenuOptions(RangeReference reference) {
		this.carddemoMainMenuOptions.setBytes(reference.getBytes());
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
		wsVariables = new WsVariables(configuration);
		carddemoCommarea = new CarddemoCommarea(configuration);
		carddemoMainMenuOptions = new CarddemoMainMenuOptions(configuration);
		group1 = new Group1(configuration);
		ccdaScreenTitle = new CcdaScreenTitle(configuration);
		wsDateTime = new WsDateTime(configuration);
		ccdaCommonMessages = new CcdaCommonMessages(configuration);
		secUserData = new SecUserData(configuration);
		dfhaid = new Dfhaid(configuration);
		dfhbmsca = new Dfhbmsca(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		dfheiblk = new Dfheiblk(configuration, EntityUtils.getUnlinkedRecord());
		dfhcommarea = new Dfhcommarea(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(wsVariables, carddemoCommarea, carddemoMainMenuOptions, group1, ccdaScreenTitle, wsDateTime, ccdaCommonMessages, secUserData, dfhaid, dfhbmsca);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nComen01cContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("Dfheiblk : [").append(dfheiblk.toString()).append("]\n");
		toSB.append("Dfhcommarea : [").append(dfhcommarea.toString()).append("]\n");
		return toSB.toString();
	}

}
