package aws.bluage.l3.workshop.cbtrn02c.business.context;
import aws.bluage.l3.workshop.cbtrn02c.business.model.Abcode;
import aws.bluage.l3.workshop.cbtrn02c.business.model.AccountFile;
import aws.bluage.l3.workshop.cbtrn02c.business.model.AccountRecord;
import aws.bluage.l3.workshop.cbtrn02c.business.model.AcctfileStatus;
import aws.bluage.l3.workshop.cbtrn02c.business.model.ApplResult;
import aws.bluage.l3.workshop.cbtrn02c.business.model.CardXrefRecord;
import aws.bluage.l3.workshop.cbtrn02c.business.model.CobolTs;
import aws.bluage.l3.workshop.cbtrn02c.business.model.DalyrejsFile;
import aws.bluage.l3.workshop.cbtrn02c.business.model.DalyrejsStatus;
import aws.bluage.l3.workshop.cbtrn02c.business.model.DalytranFile;
import aws.bluage.l3.workshop.cbtrn02c.business.model.DalytranRecord;
import aws.bluage.l3.workshop.cbtrn02c.business.model.DalytranStatus;
import aws.bluage.l3.workshop.cbtrn02c.business.model.EndOfFile;
import aws.bluage.l3.workshop.cbtrn02c.business.model.Group1;
import aws.bluage.l3.workshop.cbtrn02c.business.model.Group2;
import aws.bluage.l3.workshop.cbtrn02c.business.model.IoStatus;
import aws.bluage.l3.workshop.cbtrn02c.business.model.IoStatus04;
import aws.bluage.l3.workshop.cbtrn02c.business.model.RejectRecord;
import aws.bluage.l3.workshop.cbtrn02c.business.model.TcatbalFile;
import aws.bluage.l3.workshop.cbtrn02c.business.model.TcatbalfStatus;
import aws.bluage.l3.workshop.cbtrn02c.business.model.Timing;
import aws.bluage.l3.workshop.cbtrn02c.business.model.TranCatBalRecord;
import aws.bluage.l3.workshop.cbtrn02c.business.model.TranRecord;
import aws.bluage.l3.workshop.cbtrn02c.business.model.TranfileStatus;
import aws.bluage.l3.workshop.cbtrn02c.business.model.TransactFile;
import aws.bluage.l3.workshop.cbtrn02c.business.model.WsCounters;
import aws.bluage.l3.workshop.cbtrn02c.business.model.WsFlags;
import aws.bluage.l3.workshop.cbtrn02c.business.model.WsValidationTrailer;
import aws.bluage.l3.workshop.cbtrn02c.business.model.XrefFile;
import aws.bluage.l3.workshop.cbtrn02c.business.model.XreffileStatus;
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
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier context Cbtrn02cContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'dalytranFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.DalytranFile
 * <br></p>
 * 
 * <p>About 'transactFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.TransactFile
 * <br></p>
 * 
 * <p>About 'xrefFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.XrefFile
 * <br></p>
 * 
 * <p>About 'dalyrejsFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.DalyrejsFile
 * <br></p>
 * 
 * <p>About 'accountFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.AccountFile
 * <br></p>
 * 
 * <p>About 'tcatbalFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.TcatbalFile
 * <br></p>
 * 
 * <p>About 'dalytranRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.DalytranRecord
 * <br></p>
 * 
 * <p>About 'dalytranStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.DalytranStatus
 * <br></p>
 * 
 * <p>About 'tranRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.TranRecord
 * <br></p>
 * 
 * <p>About 'tranfileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.TranfileStatus
 * <br></p>
 * 
 * <p>About 'cardXrefRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.CardXrefRecord
 * <br></p>
 * 
 * <p>About 'xreffileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.XreffileStatus
 * <br></p>
 * 
 * <p>About 'dalyrejsStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.DalyrejsStatus
 * <br></p>
 * 
 * <p>About 'accountRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.AccountRecord
 * <br></p>
 * 
 * <p>About 'acctfileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.AcctfileStatus
 * <br></p>
 * 
 * <p>About 'tranCatBalRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.TranCatBalRecord
 * <br></p>
 * 
 * <p>About 'tcatbalfStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.TcatbalfStatus
 * <br></p>
 * 
 * <p>About 'ioStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.IoStatus
 * <br></p>
 * 
 * <p>About 'group1' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.Group1
 * <br></p>
 * 
 * <p>About 'ioStatus04' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.IoStatus04
 * <br></p>
 * 
 * <p>About 'applResult' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.ApplResult
 * <br></p>
 * 
 * <p>About 'endOfFile' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.EndOfFile
 * <br></p>
 * 
 * <p>About 'abcode' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.Abcode
 * <br></p>
 * 
 * <p>About 'timing' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.Timing
 * <br></p>
 * 
 * <p>About 'cobolTs' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.CobolTs
 * <br></p>
 * 
 * <p>About 'group2' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.Group2
 * <br></p>
 * 
 * <p>About 'rejectRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.RejectRecord
 * <br></p>
 * 
 * <p>About 'wsValidationTrailer' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.WsValidationTrailer
 * <br></p>
 * 
 * <p>About 'wsCounters' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.WsCounters
 * <br></p>
 * 
 * <p>About 'wsFlags' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.WsFlags
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn02c.business.context.Cbtrn02cContext")
@Import({
	aws.bluage.l3.workshop.cbtrn02c.business.model.DalytranFile.class
,	aws.bluage.l3.workshop.cbtrn02c.business.model.TransactFile.class
,	aws.bluage.l3.workshop.cbtrn02c.business.model.XrefFile.class
,	aws.bluage.l3.workshop.cbtrn02c.business.model.DalyrejsFile.class
,	aws.bluage.l3.workshop.cbtrn02c.business.model.AccountFile.class
,	aws.bluage.l3.workshop.cbtrn02c.business.model.TcatbalFile.class
})
@Lazy
@Scope("prototype")
public class Cbtrn02cContext extends JicsRuntimeContext {

	@Autowired
	private DalytranFile dalytranFile;

	@Autowired
	private TransactFile transactFile;

	@Autowired
	private XrefFile xrefFile;

	@Autowired
	private DalyrejsFile dalyrejsFile;

	@Autowired
	private AccountFile accountFile;

	@Autowired
	private TcatbalFile tcatbalFile;

	private SequentialFile dalytranFileFile;	

	private IndexedFile transactFileFile;	

	private IndexedFile xrefFileFile;	

	private SequentialFile dalyrejsFileFile;	

	private IndexedFile accountFileFile;	

	private IndexedFile tcatbalFileFile;	
	
	private DalytranRecord dalytranRecord;
	private DalytranStatus dalytranStatus;
	private TranRecord tranRecord;
	private TranfileStatus tranfileStatus;
	private CardXrefRecord cardXrefRecord;
	private XreffileStatus xreffileStatus;
	private DalyrejsStatus dalyrejsStatus;
	private AccountRecord accountRecord;
	private AcctfileStatus acctfileStatus;
	private TranCatBalRecord tranCatBalRecord;
	private TcatbalfStatus tcatbalfStatus;
	private IoStatus ioStatus;
	private Group1 group1;
	private IoStatus04 ioStatus04;
	private ApplResult applResult;
	private EndOfFile endOfFile;
	private Abcode abcode;
	private Timing timing;
	private CobolTs cobolTs;
	private Group2 group2;
	private RejectRecord rejectRecord;
	private WsValidationTrailer wsValidationTrailer;
	private WsCounters wsCounters;
	private WsFlags wsFlags;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cbtrn02cContext (@Qualifier("Cbtrn02cContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
		initRecordEntities();
	}
	
	

	/**
	 * Getter for the file dalytranFile.
	 * @return the dalytranFile
	 */
	public DalytranFile getDalytranFile() {
		return this.dalytranFile;
	}

	
	/**
	 * Getter for the file handler dalytranFileFile.
	 * @param executionContext the execution context
	 * @return the dalytranFileFile
	 */
	public SequentialFile getDalytranFileHandler(ExecutionContext executionContext) {
		
		if(this.dalytranFileFile == null){
			this.dalytranFileFile = executionContext.getFileProvider().getFile(
				"DALYTRAN",
				new SequentialFileDescriptionBuilder()
					.fileStatus(this.getDalytranStatus())
					.accessMode(AccessMode.SEQUENTIAL)
					.build(),
				getConfiguration(), dalytranFile);
		}
		return this.dalytranFileFile;	
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
	public IndexedFile getTransactFileHandler(ExecutionContext executionContext) {
		
		if(this.transactFileFile == null){
			this.transactFileFile = executionContext.getFileProvider().getFile(
				"TRANFILE",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getTranfileStatus())
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getTransactFile().getFdTransIdReference())
					.build(),
				getConfiguration(), transactFile);
		}
		return this.transactFileFile;	
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
					.build(),
				getConfiguration(), xrefFile);
		}
		return this.xrefFileFile;	
	}

	/**
	 * Getter for the file dalyrejsFile.
	 * @return the dalyrejsFile
	 */
	public DalyrejsFile getDalyrejsFile() {
		return this.dalyrejsFile;
	}

	
	/**
	 * Getter for the file handler dalyrejsFileFile.
	 * @param executionContext the execution context
	 * @return the dalyrejsFileFile
	 */
	public SequentialFile getDalyrejsFileHandler(ExecutionContext executionContext) {
		
		if(this.dalyrejsFileFile == null){
			this.dalyrejsFileFile = executionContext.getFileProvider().getFile(
				"DALYREJS",
				new SequentialFileDescriptionBuilder()
					.fileStatus(this.getDalyrejsStatus())
					.accessMode(AccessMode.SEQUENTIAL)
					.build(),
				getConfiguration(), dalyrejsFile);
		}
		return this.dalyrejsFileFile;	
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
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getTcatbalFile().getFdTranCatKeyReference())
					.build(),
				getConfiguration(), tcatbalFile);
		}
		return this.tcatbalFileFile;	
	}

	/**
	 * Getter for dalytranRecord.
	 * @return the dalytranRecord
	 */
	public DalytranRecord getDalytranRecord() {
		return this.dalytranRecord;
	}

	/**
	 * Setter for dalytranRecord.
	 * @param reference the new value for dalytranRecord
	 */
	public void setDalytranRecord(RangeReference reference) {
		this.dalytranRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for dalytranStatus.
	 * @return the dalytranStatus
	 */
	public DalytranStatus getDalytranStatus() {
		return this.dalytranStatus;
	}

	/**
	 * Setter for dalytranStatus.
	 * @param reference the new value for dalytranStatus
	 */
	public void setDalytranStatus(RangeReference reference) {
		this.dalytranStatus.setBytes(reference.getBytes());
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
	 * Getter for dalyrejsStatus.
	 * @return the dalyrejsStatus
	 */
	public DalyrejsStatus getDalyrejsStatus() {
		return this.dalyrejsStatus;
	}

	/**
	 * Setter for dalyrejsStatus.
	 * @param reference the new value for dalyrejsStatus
	 */
	public void setDalyrejsStatus(RangeReference reference) {
		this.dalyrejsStatus.setBytes(reference.getBytes());
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
	 * Getter for rejectRecord.
	 * @return the rejectRecord
	 */
	public RejectRecord getRejectRecord() {
		return this.rejectRecord;
	}

	/**
	 * Setter for rejectRecord.
	 * @param reference the new value for rejectRecord
	 */
	public void setRejectRecord(RangeReference reference) {
		this.rejectRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsValidationTrailer.
	 * @return the wsValidationTrailer
	 */
	public WsValidationTrailer getWsValidationTrailer() {
		return this.wsValidationTrailer;
	}

	/**
	 * Setter for wsValidationTrailer.
	 * @param reference the new value for wsValidationTrailer
	 */
	public void setWsValidationTrailer(RangeReference reference) {
		this.wsValidationTrailer.setBytes(reference.getBytes());
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
	 * Getter for wsFlags.
	 * @return the wsFlags
	 */
	public WsFlags getWsFlags() {
		return this.wsFlags;
	}

	/**
	 * Setter for wsFlags.
	 * @param reference the new value for wsFlags
	 */
	public void setWsFlags(RangeReference reference) {
		this.wsFlags.setBytes(reference.getBytes());
	}

	@Override 
	public void cleanUp(){
		if(this.dalytranFileFile !=null && this.dalytranFileFile.isOpen() && !this.dalytranFileFile.isShared()) {
			this.dalytranFileFile.close();
		}
		if(this.dalytranFileFile !=null && !this.dalytranFileFile.isShared()){
			this.dalytranFileFile = null;
		}
		if(this.transactFileFile !=null && this.transactFileFile.isOpen() && !this.transactFileFile.isShared()) {
			this.transactFileFile.close();
		}
		if(this.transactFileFile !=null && !this.transactFileFile.isShared()){
			this.transactFileFile = null;
		}
		if(this.xrefFileFile !=null && this.xrefFileFile.isOpen() && !this.xrefFileFile.isShared()) {
			this.xrefFileFile.close();
		}
		if(this.xrefFileFile !=null && !this.xrefFileFile.isShared()){
			this.xrefFileFile = null;
		}
		if(this.dalyrejsFileFile !=null && this.dalyrejsFileFile.isOpen() && !this.dalyrejsFileFile.isShared()) {
			this.dalyrejsFileFile.close();
		}
		if(this.dalyrejsFileFile !=null && !this.dalyrejsFileFile.isShared()){
			this.dalyrejsFileFile = null;
		}
		if(this.accountFileFile !=null && this.accountFileFile.isOpen() && !this.accountFileFile.isShared()) {
			this.accountFileFile.close();
		}
		if(this.accountFileFile !=null && !this.accountFileFile.isShared()){
			this.accountFileFile = null;
		}
		if(this.tcatbalFileFile !=null && this.tcatbalFileFile.isOpen() && !this.tcatbalFileFile.isShared()) {
			this.tcatbalFileFile.close();
		}
		if(this.tcatbalFileFile !=null && !this.tcatbalFileFile.isShared()){
			this.tcatbalFileFile = null;
		}
	}

	@Override
	protected void doReset() {
		cleanUp();
		this.dalytranFile.reset();
		this.transactFile.reset();
		this.xrefFile.reset();
		this.dalyrejsFile.reset();
		this.accountFile.reset();
		this.tcatbalFile.reset();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
	}

	
	private void initWorking(Configuration configuration) {
		dalytranRecord = new DalytranRecord(configuration);
		dalytranStatus = new DalytranStatus(configuration);
		tranRecord = new TranRecord(configuration);
		tranfileStatus = new TranfileStatus(configuration);
		cardXrefRecord = new CardXrefRecord(configuration);
		xreffileStatus = new XreffileStatus(configuration);
		dalyrejsStatus = new DalyrejsStatus(configuration);
		accountRecord = new AccountRecord(configuration);
		acctfileStatus = new AcctfileStatus(configuration);
		tranCatBalRecord = new TranCatBalRecord(configuration);
		tcatbalfStatus = new TcatbalfStatus(configuration);
		ioStatus = new IoStatus(configuration);
		group1 = new Group1(configuration);
		ioStatus04 = new IoStatus04(configuration);
		applResult = new ApplResult(configuration);
		endOfFile = new EndOfFile(configuration);
		abcode = new Abcode(configuration);
		timing = new Timing(configuration);
		cobolTs = new CobolTs(configuration);
		group2 = new Group2(configuration);
		rejectRecord = new RejectRecord(configuration);
		wsValidationTrailer = new WsValidationTrailer(configuration);
		wsCounters = new WsCounters(configuration);
		wsFlags = new WsFlags(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(dalytranRecord, dalytranStatus, tranRecord, tranfileStatus, cardXrefRecord, xreffileStatus, dalyrejsStatus, accountRecord, acctfileStatus, tranCatBalRecord, tcatbalfStatus, ioStatus, group1, ioStatus04, applResult, endOfFile, abcode, timing, cobolTs, group2, rejectRecord, wsValidationTrailer, wsCounters, wsFlags);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCbtrn02cContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
