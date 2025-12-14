package aws.bluage.l3.workshop.cbact04c.business.context;
import aws.bluage.l3.workshop.cbact04c.business.model.Abcode;
import aws.bluage.l3.workshop.cbact04c.business.model.AccountFile;
import aws.bluage.l3.workshop.cbact04c.business.model.AccountRecord;
import aws.bluage.l3.workshop.cbact04c.business.model.AcctfileStatus;
import aws.bluage.l3.workshop.cbact04c.business.model.ApplResult;
import aws.bluage.l3.workshop.cbact04c.business.model.CardXrefRecord;
import aws.bluage.l3.workshop.cbact04c.business.model.CobolTs;
import aws.bluage.l3.workshop.cbact04c.business.model.DisGroupRecord;
import aws.bluage.l3.workshop.cbact04c.business.model.DiscgrpFile;
import aws.bluage.l3.workshop.cbact04c.business.model.DiscgrpStatus;
import aws.bluage.l3.workshop.cbact04c.business.model.EndOfFile;
import aws.bluage.l3.workshop.cbact04c.business.model.ExternalParms;
import aws.bluage.l3.workshop.cbact04c.business.model.Group1;
import aws.bluage.l3.workshop.cbact04c.business.model.Group2;
import aws.bluage.l3.workshop.cbact04c.business.model.IoStatus;
import aws.bluage.l3.workshop.cbact04c.business.model.IoStatus04;
import aws.bluage.l3.workshop.cbact04c.business.model.TcatbalFile;
import aws.bluage.l3.workshop.cbact04c.business.model.TcatbalfStatus;
import aws.bluage.l3.workshop.cbact04c.business.model.Timing;
import aws.bluage.l3.workshop.cbact04c.business.model.TranCatBalRecord;
import aws.bluage.l3.workshop.cbact04c.business.model.TranRecord;
import aws.bluage.l3.workshop.cbact04c.business.model.TranfileStatus;
import aws.bluage.l3.workshop.cbact04c.business.model.TransactFile;
import aws.bluage.l3.workshop.cbact04c.business.model.WsCounters;
import aws.bluage.l3.workshop.cbact04c.business.model.WsMiscVars;
import aws.bluage.l3.workshop.cbact04c.business.model.XrefFile;
import aws.bluage.l3.workshop.cbact04c.business.model.XreffileStatus;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.io.metadata.builder.IndexedFileDescriptionBuilder;
import com.netfective.bluage.gapwalk.io.metadata.builder.SequentialFileDescriptionBuilder;
import com.netfective.bluage.gapwalk.rt.io.AccessMode;
import com.netfective.bluage.gapwalk.rt.io.IndexedFile;
import com.netfective.bluage.gapwalk.rt.io.SequentialFile;
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
 * Data simplifier context Cbact04cContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'tcatbalFile' file, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.TcatbalFile
 * <br></p>
 * 
 * <p>About 'xrefFile' file, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.XrefFile
 * <br></p>
 * 
 * <p>About 'discgrpFile' file, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.DiscgrpFile
 * <br></p>
 * 
 * <p>About 'accountFile' file, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.AccountFile
 * <br></p>
 * 
 * <p>About 'transactFile' file, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.TransactFile
 * <br></p>
 * 
 * <p>About 'tranCatBalRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.TranCatBalRecord
 * <br></p>
 * 
 * <p>About 'tcatbalfStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.TcatbalfStatus
 * <br></p>
 * 
 * <p>About 'cardXrefRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.CardXrefRecord
 * <br></p>
 * 
 * <p>About 'xreffileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.XreffileStatus
 * <br></p>
 * 
 * <p>About 'disGroupRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.DisGroupRecord
 * <br></p>
 * 
 * <p>About 'discgrpStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.DiscgrpStatus
 * <br></p>
 * 
 * <p>About 'accountRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.AccountRecord
 * <br></p>
 * 
 * <p>About 'acctfileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.AcctfileStatus
 * <br></p>
 * 
 * <p>About 'tranRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.TranRecord
 * <br></p>
 * 
 * <p>About 'tranfileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.TranfileStatus
 * <br></p>
 * 
 * <p>About 'ioStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.IoStatus
 * <br></p>
 * 
 * <p>About 'group1' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.Group1
 * <br></p>
 * 
 * <p>About 'ioStatus04' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.IoStatus04
 * <br></p>
 * 
 * <p>About 'applResult' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.ApplResult
 * <br></p>
 * 
 * <p>About 'endOfFile' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.EndOfFile
 * <br></p>
 * 
 * <p>About 'abcode' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.Abcode
 * <br></p>
 * 
 * <p>About 'timing' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.Timing
 * <br></p>
 * 
 * <p>About 'cobolTs' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.CobolTs
 * <br></p>
 * 
 * <p>About 'group2' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.Group2
 * <br></p>
 * 
 * <p>About 'wsMiscVars' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.WsMiscVars
 * <br></p>
 * 
 * <p>About 'wsCounters' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.WsCounters
 * <br></p>
 * 
 * <p>About 'externalParms' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.ExternalParms
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbact04c.business.context.Cbact04cContext")
@Import({
	aws.bluage.l3.workshop.cbact04c.business.model.TcatbalFile.class
,	aws.bluage.l3.workshop.cbact04c.business.model.XrefFile.class
,	aws.bluage.l3.workshop.cbact04c.business.model.DiscgrpFile.class
,	aws.bluage.l3.workshop.cbact04c.business.model.AccountFile.class
,	aws.bluage.l3.workshop.cbact04c.business.model.TransactFile.class
})
@Lazy
@Scope("prototype")
public class Cbact04cContext extends JicsRuntimeContext {

	@Autowired
	private TcatbalFile tcatbalFile;

	@Autowired
	private XrefFile xrefFile;

	@Autowired
	private DiscgrpFile discgrpFile;

	@Autowired
	private AccountFile accountFile;

	@Autowired
	private TransactFile transactFile;

	private IndexedFile tcatbalFileFile;	

	private IndexedFile xrefFileFile;	

	private IndexedFile discgrpFileFile;	

	private IndexedFile accountFileFile;	

	private SequentialFile transactFileFile;	
	
	private TranCatBalRecord tranCatBalRecord;
	private TcatbalfStatus tcatbalfStatus;
	private CardXrefRecord cardXrefRecord;
	private XreffileStatus xreffileStatus;
	private DisGroupRecord disGroupRecord;
	private DiscgrpStatus discgrpStatus;
	private AccountRecord accountRecord;
	private AcctfileStatus acctfileStatus;
	private TranRecord tranRecord;
	private TranfileStatus tranfileStatus;
	private IoStatus ioStatus;
	private Group1 group1;
	private IoStatus04 ioStatus04;
	private ApplResult applResult;
	private EndOfFile endOfFile;
	private Abcode abcode;
	private Timing timing;
	private CobolTs cobolTs;
	private Group2 group2;
	private WsMiscVars wsMiscVars;
	private WsCounters wsCounters;
	private ExternalParms externalParms;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cbact04cContext (@Qualifier("Cbact04cContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
	}
	
	

	/**
	 * Getter for the file tcatbalFile.
	 * @return the tcatbalFile
	 */
	public TcatbalFile getTcatbalFile() {
		return this.tcatbalFile;
	}

	
	/**
	 * Getter for the file handler tcatbalFileFile.
	 * @param executionContext the execution context
	 * @return the tcatbalFileFile
	 */
	public IndexedFile getTcatbalFileHandler(ExecutionContext executionContext) {
		
		if(this.tcatbalFileFile == null){
			this.tcatbalFileFile = executionContext.getFileProvider().getFile(
				"TCATBALF",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getTcatbalfStatus())
					.accessMode(AccessMode.SEQUENTIAL)
					.primaryKey(this.getTcatbalFile().getFdTranCatKeyReference())
					.build(),
				getConfiguration(), tcatbalFile);
		}
		return this.tcatbalFileFile;	
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
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getXrefFile().getFdXrefCardNumReference())
					.alternateKey(this.getXrefFile().getFdXrefAcctIdReference(), false)
					.build(),
				getConfiguration(), xrefFile);
		}
		return this.xrefFileFile;	
	}

	/**
	 * Getter for the file discgrpFile.
	 * @return the discgrpFile
	 */
	public DiscgrpFile getDiscgrpFile() {
		return this.discgrpFile;
	}

	
	/**
	 * Getter for the file handler discgrpFileFile.
	 * @param executionContext the execution context
	 * @return the discgrpFileFile
	 */
	public IndexedFile getDiscgrpFileHandler(ExecutionContext executionContext) {
		
		if(this.discgrpFileFile == null){
			this.discgrpFileFile = executionContext.getFileProvider().getFile(
				"DISCGRP",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getDiscgrpStatus())
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getDiscgrpFile().getFdDiscgrpKeyReference())
					.build(),
				getConfiguration(), discgrpFile);
		}
		return this.discgrpFileFile;	
	}

	/**
	 * Getter for the file accountFile.
	 * @return the accountFile
	 */
	public AccountFile getAccountFile() {
		return this.accountFile;
	}

	
	/**
	 * Getter for the file handler accountFileFile.
	 * @param executionContext the execution context
	 * @return the accountFileFile
	 */
	public IndexedFile getAccountFileHandler(ExecutionContext executionContext) {
		
		if(this.accountFileFile == null){
			this.accountFileFile = executionContext.getFileProvider().getFile(
				"ACCTFILE",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getAcctfileStatus())
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getAccountFile().getFdAcctIdReference())
					.build(),
				getConfiguration(), accountFile);
		}
		return this.accountFileFile;	
	}

	/**
	 * Getter for the file transactFile.
	 * @return the transactFile
	 */
	public TransactFile getTransactFile() {
		return this.transactFile;
	}

	
	/**
	 * Getter for the file handler transactFileFile.
	 * @param executionContext the execution context
	 * @return the transactFileFile
	 */
	public SequentialFile getTransactFileHandler(ExecutionContext executionContext) {
		
		if(this.transactFileFile == null){
			this.transactFileFile = executionContext.getFileProvider().getFile(
				"TRANSACT",
				new SequentialFileDescriptionBuilder()
					.fileStatus(this.getTranfileStatus())
					.accessMode(AccessMode.SEQUENTIAL)
					.build(),
				getConfiguration(), transactFile);
		}
		return this.transactFileFile;	
	}

	/**
	 * Getter for tranCatBalRecord.
	 * @return the tranCatBalRecord
	 */
	public TranCatBalRecord getTranCatBalRecord() {
		return this.tranCatBalRecord;
	}

	/**
	 * Setter for tranCatBalRecord.
	 * @param reference the new value for tranCatBalRecord
	 */
	public void setTranCatBalRecord(RangeReference reference) {
		this.tranCatBalRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for tcatbalfStatus.
	 * @return the tcatbalfStatus
	 */
	public TcatbalfStatus getTcatbalfStatus() {
		return this.tcatbalfStatus;
	}

	/**
	 * Setter for tcatbalfStatus.
	 * @param reference the new value for tcatbalfStatus
	 */
	public void setTcatbalfStatus(RangeReference reference) {
		this.tcatbalfStatus.setBytes(reference.getBytes());
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
	 * Getter for disGroupRecord.
	 * @return the disGroupRecord
	 */
	public DisGroupRecord getDisGroupRecord() {
		return this.disGroupRecord;
	}

	/**
	 * Setter for disGroupRecord.
	 * @param reference the new value for disGroupRecord
	 */
	public void setDisGroupRecord(RangeReference reference) {
		this.disGroupRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for discgrpStatus.
	 * @return the discgrpStatus
	 */
	public DiscgrpStatus getDiscgrpStatus() {
		return this.discgrpStatus;
	}

	/**
	 * Setter for discgrpStatus.
	 * @param reference the new value for discgrpStatus
	 */
	public void setDiscgrpStatus(RangeReference reference) {
		this.discgrpStatus.setBytes(reference.getBytes());
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
	 * Getter for tranRecord.
	 * @return the tranRecord
	 */
	public TranRecord getTranRecord() {
		return this.tranRecord;
	}

	/**
	 * Setter for tranRecord.
	 * @param reference the new value for tranRecord
	 */
	public void setTranRecord(RangeReference reference) {
		this.tranRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for tranfileStatus.
	 * @return the tranfileStatus
	 */
	public TranfileStatus getTranfileStatus() {
		return this.tranfileStatus;
	}

	/**
	 * Setter for tranfileStatus.
	 * @param reference the new value for tranfileStatus
	 */
	public void setTranfileStatus(RangeReference reference) {
		this.tranfileStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for ioStatus.
	 * @return the ioStatus
	 */
	public IoStatus getIoStatus() {
		return this.ioStatus;
	}

	/**
	 * Setter for ioStatus.
	 * @param reference the new value for ioStatus
	 */
	public void setIoStatus(RangeReference reference) {
		this.ioStatus.setBytes(reference.getBytes());
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
	 * Getter for ioStatus04.
	 * @return the ioStatus04
	 */
	public IoStatus04 getIoStatus04() {
		return this.ioStatus04;
	}

	/**
	 * Setter for ioStatus04.
	 * @param reference the new value for ioStatus04
	 */
	public void setIoStatus04(RangeReference reference) {
		this.ioStatus04.setBytes(reference.getBytes());
	}

	/**
	 * Getter for applResult.
	 * @return the applResult
	 */
	public ApplResult getApplResult() {
		return this.applResult;
	}

	/**
	 * Setter for applResult.
	 * @param reference the new value for applResult
	 */
	public void setApplResult(RangeReference reference) {
		this.applResult.setBytes(reference.getBytes());
	}

	/**
	 * Getter for endOfFile.
	 * @return the endOfFile
	 */
	public EndOfFile getEndOfFile() {
		return this.endOfFile;
	}

	/**
	 * Setter for endOfFile.
	 * @param reference the new value for endOfFile
	 */
	public void setEndOfFile(RangeReference reference) {
		this.endOfFile.setBytes(reference.getBytes());
	}

	/**
	 * Getter for abcode.
	 * @return the abcode
	 */
	public Abcode getAbcode() {
		return this.abcode;
	}

	/**
	 * Setter for abcode.
	 * @param reference the new value for abcode
	 */
	public void setAbcode(RangeReference reference) {
		this.abcode.setBytes(reference.getBytes());
	}

	/**
	 * Getter for timing.
	 * @return the timing
	 */
	public Timing getTiming() {
		return this.timing;
	}

	/**
	 * Setter for timing.
	 * @param reference the new value for timing
	 */
	public void setTiming(RangeReference reference) {
		this.timing.setBytes(reference.getBytes());
	}

	/**
	 * Getter for cobolTs.
	 * @return the cobolTs
	 */
	public CobolTs getCobolTs() {
		return this.cobolTs;
	}

	/**
	 * Setter for cobolTs.
	 * @param reference the new value for cobolTs
	 */
	public void setCobolTs(RangeReference reference) {
		this.cobolTs.setBytes(reference.getBytes());
	}

	/**
	 * Getter for group2.
	 * @return the group2
	 */
	public Group2 getGroup2() {
		return this.group2;
	}

	/**
	 * Setter for group2.
	 * @param reference the new value for group2
	 */
	public void setGroup2(RangeReference reference) {
		this.group2.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsMiscVars.
	 * @return the wsMiscVars
	 */
	public WsMiscVars getWsMiscVars() {
		return this.wsMiscVars;
	}

	/**
	 * Setter for wsMiscVars.
	 * @param reference the new value for wsMiscVars
	 */
	public void setWsMiscVars(RangeReference reference) {
		this.wsMiscVars.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsCounters.
	 * @return the wsCounters
	 */
	public WsCounters getWsCounters() {
		return this.wsCounters;
	}

	/**
	 * Setter for wsCounters.
	 * @param reference the new value for wsCounters
	 */
	public void setWsCounters(RangeReference reference) {
		this.wsCounters.setBytes(reference.getBytes());
	}

	/**
	 * Getter for externalParms.
	 * @return the externalParms
	 */
	public ExternalParms getExternalParms() {
		return this.externalParms;
	}

	/**
	 * Setter for externalParms.
	 * @param reference the new value for externalParms
	 */
	public void setExternalParms(RangeReference reference) {
		this.externalParms.setBytes(reference.getBytes());
	}

	@Override 
	public void cleanUp(){
		if(this.tcatbalFileFile !=null && this.tcatbalFileFile.isOpen() && !this.tcatbalFileFile.isShared()) {
			this.tcatbalFileFile.close();
		}
		if(this.tcatbalFileFile !=null && !this.tcatbalFileFile.isShared()){
			this.tcatbalFileFile = null;
		}
		if(this.xrefFileFile !=null && this.xrefFileFile.isOpen() && !this.xrefFileFile.isShared()) {
			this.xrefFileFile.close();
		}
		if(this.xrefFileFile !=null && !this.xrefFileFile.isShared()){
			this.xrefFileFile = null;
		}
		if(this.discgrpFileFile !=null && this.discgrpFileFile.isOpen() && !this.discgrpFileFile.isShared()) {
			this.discgrpFileFile.close();
		}
		if(this.discgrpFileFile !=null && !this.discgrpFileFile.isShared()){
			this.discgrpFileFile = null;
		}
		if(this.accountFileFile !=null && this.accountFileFile.isOpen() && !this.accountFileFile.isShared()) {
			this.accountFileFile.close();
		}
		if(this.accountFileFile !=null && !this.accountFileFile.isShared()){
			this.accountFileFile = null;
		}
		if(this.transactFileFile !=null && this.transactFileFile.isOpen() && !this.transactFileFile.isShared()) {
			this.transactFileFile.close();
		}
		if(this.transactFileFile !=null && !this.transactFileFile.isShared()){
			this.transactFileFile = null;
		}
	}

	@Override
	protected void doReset() {
		cleanUp();
		this.tcatbalFile.reset();
		this.xrefFile.reset();
		this.discgrpFile.reset();
		this.accountFile.reset();
		this.transactFile.reset();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
	}

	
	private void initWorking(Configuration configuration) {
		tranCatBalRecord = new TranCatBalRecord(configuration);
		tcatbalfStatus = new TcatbalfStatus(configuration);
		cardXrefRecord = new CardXrefRecord(configuration);
		xreffileStatus = new XreffileStatus(configuration);
		disGroupRecord = new DisGroupRecord(configuration);
		discgrpStatus = new DiscgrpStatus(configuration);
		accountRecord = new AccountRecord(configuration);
		acctfileStatus = new AcctfileStatus(configuration);
		tranRecord = new TranRecord(configuration);
		tranfileStatus = new TranfileStatus(configuration);
		ioStatus = new IoStatus(configuration);
		group1 = new Group1(configuration);
		ioStatus04 = new IoStatus04(configuration);
		applResult = new ApplResult(configuration);
		endOfFile = new EndOfFile(configuration);
		abcode = new Abcode(configuration);
		timing = new Timing(configuration);
		cobolTs = new CobolTs(configuration);
		group2 = new Group2(configuration);
		wsMiscVars = new WsMiscVars(configuration);
		wsCounters = new WsCounters(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		externalParms = new ExternalParms(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(tranCatBalRecord, tcatbalfStatus, cardXrefRecord, xreffileStatus, disGroupRecord, discgrpStatus, accountRecord, acctfileStatus, tranRecord, tranfileStatus, ioStatus, group1, ioStatus04, applResult, endOfFile, abcode, timing, cobolTs, group2, wsMiscVars, wsCounters);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCbact04cContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("ExternalParms : [").append(externalParms.toString()).append("]\n");
		return toSB.toString();
	}

}
