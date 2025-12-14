package aws.bluage.l3.workshop.cbstm03b.business.context;
import aws.bluage.l3.workshop.cbstm03b.business.model.AcctFile;
import aws.bluage.l3.workshop.cbstm03b.business.model.AcctfileStatus;
import aws.bluage.l3.workshop.cbstm03b.business.model.CustFile;
import aws.bluage.l3.workshop.cbstm03b.business.model.CustfileStatus;
import aws.bluage.l3.workshop.cbstm03b.business.model.LkM03bArea;
import aws.bluage.l3.workshop.cbstm03b.business.model.TrnxFile;
import aws.bluage.l3.workshop.cbstm03b.business.model.TrnxfileStatus;
import aws.bluage.l3.workshop.cbstm03b.business.model.XrefFile;
import aws.bluage.l3.workshop.cbstm03b.business.model.XreffileStatus;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.io.metadata.builder.IndexedFileDescriptionBuilder;
import com.netfective.bluage.gapwalk.rt.io.AccessMode;
import com.netfective.bluage.gapwalk.rt.io.IndexedFile;
import com.netfective.bluage.gapwalk.rt.jics.context.JicsRuntimeContext;
import com.netfective.bluage.gapwalk.rt.shared.ExecutionContext;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier context Cbstm03bContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'trnxFile' file, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.TrnxFile
 * <br></p>
 * 
 * <p>About 'xrefFile' file, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.XrefFile
 * <br></p>
 * 
 * <p>About 'custFile' file, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.CustFile
 * <br></p>
 * 
 * <p>About 'acctFile' file, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.AcctFile
 * <br></p>
 * 
 * <p>About 'trnxfileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.TrnxfileStatus
 * <br></p>
 * 
 * <p>About 'xreffileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.XreffileStatus
 * <br></p>
 * 
 * <p>About 'custfileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.CustfileStatus
 * <br></p>
 * 
 * <p>About 'acctfileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.AcctfileStatus
 * <br></p>
 * 
 * <p>About 'lkM03bArea' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.LkM03bArea
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbstm03b.business.context.Cbstm03bContext")
@Import({
	aws.bluage.l3.workshop.cbstm03b.business.model.TrnxFile.class
,	aws.bluage.l3.workshop.cbstm03b.business.model.XrefFile.class
,	aws.bluage.l3.workshop.cbstm03b.business.model.CustFile.class
,	aws.bluage.l3.workshop.cbstm03b.business.model.AcctFile.class
})
@Lazy
@Scope("prototype")
public class Cbstm03bContext extends JicsRuntimeContext {

	@Autowired
	private TrnxFile trnxFile;

	@Autowired
	private XrefFile xrefFile;

	@Autowired
	private CustFile custFile;

	@Autowired
	private AcctFile acctFile;

	private IndexedFile trnxFileFile;	

	private IndexedFile xrefFileFile;	

	private IndexedFile custFileFile;	

	private IndexedFile acctFileFile;	
	
	private TrnxfileStatus trnxfileStatus;
	private XreffileStatus xreffileStatus;
	private CustfileStatus custfileStatus;
	private AcctfileStatus acctfileStatus;
	private LkM03bArea lkM03bArea;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cbstm03bContext (@Qualifier("Cbstm03bContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
	}
	
	

	/**
	 * Getter for the file trnxFile.
	 * @return the trnxFile
	 */
	public TrnxFile getTrnxFile() {
		return this.trnxFile;
	}

	
	/**
	 * Getter for the file handler trnxFileFile.
	 * @param executionContext the execution context
	 * @return the trnxFileFile
	 */
	public IndexedFile getTrnxFileHandler(ExecutionContext executionContext) {
		
		if(this.trnxFileFile == null){
			this.trnxFileFile = executionContext.getFileProvider().getFile(
				"TRNXFILE",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getTrnxfileStatus())
					.accessMode(AccessMode.SEQUENTIAL)
					.primaryKey(this.getTrnxFile().getFdTrnxsIdReference())
					.build(),
				getConfiguration(), trnxFile);
		}
		return this.trnxFileFile;	
	}

	/**
	 * Getter for the file xrefFile.
	 * @return the xrefFile
	 */
	public XrefFile getXrefFile() {
		return this.xrefFile;
	}

	
	/**
	 * Getter for the file handler xrefFileFile.
	 * @param executionContext the execution context
	 * @return the xrefFileFile
	 */
	public IndexedFile getXrefFileHandler(ExecutionContext executionContext) {
		
		if(this.xrefFileFile == null){
			this.xrefFileFile = executionContext.getFileProvider().getFile(
				"XREFFILE",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getXreffileStatus())
					.accessMode(AccessMode.SEQUENTIAL)
					.primaryKey(this.getXrefFile().getFdXrefCardNumReference())
					.build(),
				getConfiguration(), xrefFile);
		}
		return this.xrefFileFile;	
	}

	/**
	 * Getter for the file custFile.
	 * @return the custFile
	 */
	public CustFile getCustFile() {
		return this.custFile;
	}

	
	/**
	 * Getter for the file handler custFileFile.
	 * @param executionContext the execution context
	 * @return the custFileFile
	 */
	public IndexedFile getCustFileHandler(ExecutionContext executionContext) {
		
		if(this.custFileFile == null){
			this.custFileFile = executionContext.getFileProvider().getFile(
				"CUSTFILE",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getCustfileStatus())
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getCustFile().getFdCustIdReference())
					.build(),
				getConfiguration(), custFile);
		}
		return this.custFileFile;	
	}

	/**
	 * Getter for the file acctFile.
	 * @return the acctFile
	 */
	public AcctFile getAcctFile() {
		return this.acctFile;
	}

	
	/**
	 * Getter for the file handler acctFileFile.
	 * @param executionContext the execution context
	 * @return the acctFileFile
	 */
	public IndexedFile getAcctFileHandler(ExecutionContext executionContext) {
		
		if(this.acctFileFile == null){
			this.acctFileFile = executionContext.getFileProvider().getFile(
				"ACCTFILE",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getAcctfileStatus())
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getAcctFile().getFdAcctIdReference())
					.build(),
				getConfiguration(), acctFile);
		}
		return this.acctFileFile;	
	}

	/**
	 * Getter for trnxfileStatus.
	 * @return the trnxfileStatus
	 */
	public TrnxfileStatus getTrnxfileStatus() {
		return this.trnxfileStatus;
	}

	/**
	 * Setter for trnxfileStatus.
	 * @param reference the new value for trnxfileStatus
	 */
	public void setTrnxfileStatus(RangeReference reference) {
		this.trnxfileStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for xreffileStatus.
	 * @return the xreffileStatus
	 */
	public XreffileStatus getXreffileStatus() {
		return this.xreffileStatus;
	}

	/**
	 * Setter for xreffileStatus.
	 * @param reference the new value for xreffileStatus
	 */
	public void setXreffileStatus(RangeReference reference) {
		this.xreffileStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for custfileStatus.
	 * @return the custfileStatus
	 */
	public CustfileStatus getCustfileStatus() {
		return this.custfileStatus;
	}

	/**
	 * Setter for custfileStatus.
	 * @param reference the new value for custfileStatus
	 */
	public void setCustfileStatus(RangeReference reference) {
		this.custfileStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for acctfileStatus.
	 * @return the acctfileStatus
	 */
	public AcctfileStatus getAcctfileStatus() {
		return this.acctfileStatus;
	}

	/**
	 * Setter for acctfileStatus.
	 * @param reference the new value for acctfileStatus
	 */
	public void setAcctfileStatus(RangeReference reference) {
		this.acctfileStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for lkM03bArea.
	 * @return the lkM03bArea
	 */
	public LkM03bArea getLkM03bArea() {
		return this.lkM03bArea;
	}

	/**
	 * Setter for lkM03bArea.
	 * @param reference the new value for lkM03bArea
	 */
	public void setLkM03bArea(RangeReference reference) {
		this.lkM03bArea.setBytes(reference.getBytes());
	}

	@Override 
	public void cleanUp(){
		if(this.trnxFileFile !=null && this.trnxFileFile.isOpen() && !this.trnxFileFile.isShared()) {
			this.trnxFileFile.close();
		}
		if(this.trnxFileFile !=null && !this.trnxFileFile.isShared()){
			this.trnxFileFile = null;
		}
		if(this.xrefFileFile !=null && this.xrefFileFile.isOpen() && !this.xrefFileFile.isShared()) {
			this.xrefFileFile.close();
		}
		if(this.xrefFileFile !=null && !this.xrefFileFile.isShared()){
			this.xrefFileFile = null;
		}
		if(this.custFileFile !=null && this.custFileFile.isOpen() && !this.custFileFile.isShared()) {
			this.custFileFile.close();
		}
		if(this.custFileFile !=null && !this.custFileFile.isShared()){
			this.custFileFile = null;
		}
		if(this.acctFileFile !=null && this.acctFileFile.isOpen() && !this.acctFileFile.isShared()) {
			this.acctFileFile.close();
		}
		if(this.acctFileFile !=null && !this.acctFileFile.isShared()){
			this.acctFileFile = null;
		}
	}

	@Override
	protected void doReset() {
		cleanUp();
		this.trnxFile.reset();
		this.xrefFile.reset();
		this.custFile.reset();
		this.acctFile.reset();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
	}

	
	private void initWorking(Configuration configuration) {
		trnxfileStatus = new TrnxfileStatus(configuration);
		xreffileStatus = new XreffileStatus(configuration);
		custfileStatus = new CustfileStatus(configuration);
		acctfileStatus = new AcctfileStatus(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		lkM03bArea = new LkM03bArea(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(trnxfileStatus, xreffileStatus, custfileStatus, acctfileStatus);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCbstm03bContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("LkM03bArea : [").append(lkM03bArea.toString()).append("]\n");
		return toSB.toString();
	}

}
