package aws.bluage.l3.workshop.cbtrn03c.business.context;
import aws.bluage.l3.workshop.cbtrn03c.business.model.Abcode;
import aws.bluage.l3.workshop.cbtrn03c.business.model.ApplResult;
import aws.bluage.l3.workshop.cbtrn03c.business.model.CardXrefRecord;
import aws.bluage.l3.workshop.cbtrn03c.business.model.CardxrefStatus;
import aws.bluage.l3.workshop.cbtrn03c.business.model.DateParmsFile;
import aws.bluage.l3.workshop.cbtrn03c.business.model.DateparmStatus;
import aws.bluage.l3.workshop.cbtrn03c.business.model.EndOfFile;
import aws.bluage.l3.workshop.cbtrn03c.business.model.Group1;
import aws.bluage.l3.workshop.cbtrn03c.business.model.IoStatus;
import aws.bluage.l3.workshop.cbtrn03c.business.model.IoStatus04;
import aws.bluage.l3.workshop.cbtrn03c.business.model.ReportAccountTotals;
import aws.bluage.l3.workshop.cbtrn03c.business.model.ReportFile;
import aws.bluage.l3.workshop.cbtrn03c.business.model.ReportGrandTotals;
import aws.bluage.l3.workshop.cbtrn03c.business.model.ReportNameHeader;
import aws.bluage.l3.workshop.cbtrn03c.business.model.ReportPageTotals;
import aws.bluage.l3.workshop.cbtrn03c.business.model.Timing;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TranCatRecord;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TranRecord;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TranTypeRecord;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TrancatgFile;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TrancatgStatus;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TranfileStatus;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TranreptStatus;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TransactFile;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TransactionDetailReport;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TransactionHeader1;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TransactionHeader2;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TrantypeFile;
import aws.bluage.l3.workshop.cbtrn03c.business.model.TrantypeStatus;
import aws.bluage.l3.workshop.cbtrn03c.business.model.WsDateparmRecord;
import aws.bluage.l3.workshop.cbtrn03c.business.model.WsReportVars;
import aws.bluage.l3.workshop.cbtrn03c.business.model.XrefFile;
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
 * Data simplifier context Cbtrn03cContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'transactFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TransactFile
 * <br></p>
 * 
 * <p>About 'xrefFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.XrefFile
 * <br></p>
 * 
 * <p>About 'trantypeFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TrantypeFile
 * <br></p>
 * 
 * <p>About 'trancatgFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TrancatgFile
 * <br></p>
 * 
 * <p>About 'reportFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.ReportFile
 * <br></p>
 * 
 * <p>About 'dateParmsFile' file, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.DateParmsFile
 * <br></p>
 * 
 * <p>About 'tranRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TranRecord
 * <br></p>
 * 
 * <p>About 'tranfileStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TranfileStatus
 * <br></p>
 * 
 * <p>About 'cardXrefRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.CardXrefRecord
 * <br></p>
 * 
 * <p>About 'cardxrefStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.CardxrefStatus
 * <br></p>
 * 
 * <p>About 'tranTypeRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TranTypeRecord
 * <br></p>
 * 
 * <p>About 'trantypeStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TrantypeStatus
 * <br></p>
 * 
 * <p>About 'tranCatRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TranCatRecord
 * <br></p>
 * 
 * <p>About 'trancatgStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TrancatgStatus
 * <br></p>
 * 
 * <p>About 'reportNameHeader' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.ReportNameHeader
 * <br></p>
 * 
 * <p>About 'transactionDetailReport' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TransactionDetailReport
 * <br></p>
 * 
 * <p>About 'transactionHeader1' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TransactionHeader1
 * <br></p>
 * 
 * <p>About 'transactionHeader2' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TransactionHeader2
 * <br></p>
 * 
 * <p>About 'reportPageTotals' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.ReportPageTotals
 * <br></p>
 * 
 * <p>About 'reportAccountTotals' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.ReportAccountTotals
 * <br></p>
 * 
 * <p>About 'reportGrandTotals' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.ReportGrandTotals
 * <br></p>
 * 
 * <p>About 'tranreptStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.TranreptStatus
 * <br></p>
 * 
 * <p>About 'dateparmStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.DateparmStatus
 * <br></p>
 * 
 * <p>About 'wsDateparmRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.WsDateparmRecord
 * <br></p>
 * 
 * <p>About 'wsReportVars' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.WsReportVars
 * <br></p>
 * 
 * <p>About 'ioStatus' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.IoStatus
 * <br></p>
 * 
 * <p>About 'group1' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.Group1
 * <br></p>
 * 
 * <p>About 'ioStatus04' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.IoStatus04
 * <br></p>
 * 
 * <p>About 'applResult' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.ApplResult
 * <br></p>
 * 
 * <p>About 'endOfFile' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.EndOfFile
 * <br></p>
 * 
 * <p>About 'abcode' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.Abcode
 * <br></p>
 * 
 * <p>About 'timing' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.Timing
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn03c.business.context.Cbtrn03cContext")
@Import({
	aws.bluage.l3.workshop.cbtrn03c.business.model.TransactFile.class
,	aws.bluage.l3.workshop.cbtrn03c.business.model.XrefFile.class
,	aws.bluage.l3.workshop.cbtrn03c.business.model.TrantypeFile.class
,	aws.bluage.l3.workshop.cbtrn03c.business.model.TrancatgFile.class
,	aws.bluage.l3.workshop.cbtrn03c.business.model.ReportFile.class
,	aws.bluage.l3.workshop.cbtrn03c.business.model.DateParmsFile.class
})
@Lazy
@Scope("prototype")
public class Cbtrn03cContext extends JicsRuntimeContext {

	@Autowired
	private TransactFile transactFile;

	@Autowired
	private XrefFile xrefFile;

	@Autowired
	private TrantypeFile trantypeFile;

	@Autowired
	private TrancatgFile trancatgFile;

	@Autowired
	private ReportFile reportFile;

	@Autowired
	private DateParmsFile dateParmsFile;

	private SequentialFile transactFileFile;	

	private IndexedFile xrefFileFile;	

	private IndexedFile trantypeFileFile;	

	private IndexedFile trancatgFileFile;	

	private SequentialFile reportFileFile;	

	private SequentialFile dateParmsFileFile;	
	
	private TranRecord tranRecord;
	private TranfileStatus tranfileStatus;
	private CardXrefRecord cardXrefRecord;
	private CardxrefStatus cardxrefStatus;
	private TranTypeRecord tranTypeRecord;
	private TrantypeStatus trantypeStatus;
	private TranCatRecord tranCatRecord;
	private TrancatgStatus trancatgStatus;
	private ReportNameHeader reportNameHeader;
	private TransactionDetailReport transactionDetailReport;
	private TransactionHeader1 transactionHeader1;
	private TransactionHeader2 transactionHeader2;
	private ReportPageTotals reportPageTotals;
	private ReportAccountTotals reportAccountTotals;
	private ReportGrandTotals reportGrandTotals;
	private TranreptStatus tranreptStatus;
	private DateparmStatus dateparmStatus;
	private WsDateparmRecord wsDateparmRecord;
	private WsReportVars wsReportVars;
	private IoStatus ioStatus;
	private Group1 group1;
	private IoStatus04 ioStatus04;
	private ApplResult applResult;
	private EndOfFile endOfFile;
	private Abcode abcode;
	private Timing timing;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cbtrn03cContext (@Qualifier("Cbtrn03cContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
		initRecordEntities();
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
				"TRANFILE",
				new SequentialFileDescriptionBuilder()
					.fileStatus(this.getTranfileStatus())
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
				"CARDXREF",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getCardxrefStatus())
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getXrefFile().getFdXrefCardNumReference())
					.build(),
				getConfiguration(), xrefFile);
		}
		return this.xrefFileFile;	
	}

	/**
	 * Getter for the file trantypeFile.
	 * @return the trantypeFile
	 */
	public TrantypeFile getTrantypeFile() {
		return this.trantypeFile;
	}

	
	/**
	 * Getter for the file handler trantypeFileFile.
	 * @param executionContext the execution context
	 * @return the trantypeFileFile
	 */
	public IndexedFile getTrantypeFileHandler(ExecutionContext executionContext) {
		
		if(this.trantypeFileFile == null){
			this.trantypeFileFile = executionContext.getFileProvider().getFile(
				"TRANTYPE",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getTrantypeStatus())
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getTrantypeFile().getFdTranTypeReference())
					.build(),
				getConfiguration(), trantypeFile);
		}
		return this.trantypeFileFile;	
	}

	/**
	 * Getter for the file trancatgFile.
	 * @return the trancatgFile
	 */
	public TrancatgFile getTrancatgFile() {
		return this.trancatgFile;
	}

	
	/**
	 * Getter for the file handler trancatgFileFile.
	 * @param executionContext the execution context
	 * @return the trancatgFileFile
	 */
	public IndexedFile getTrancatgFileHandler(ExecutionContext executionContext) {
		
		if(this.trancatgFileFile == null){
			this.trancatgFileFile = executionContext.getFileProvider().getFile(
				"TRANCATG",
				new IndexedFileDescriptionBuilder()
					.fileStatus(this.getTrancatgStatus())
					.accessMode(AccessMode.RANDOM)
					.primaryKey(this.getTrancatgFile().getFdTranCatKeyReference())
					.build(),
				getConfiguration(), trancatgFile);
		}
		return this.trancatgFileFile;	
	}

	/**
	 * Getter for the file reportFile.
	 * @return the reportFile
	 */
	public ReportFile getReportFile() {
		return this.reportFile;
	}

	
	/**
	 * Getter for the file handler reportFileFile.
	 * @param executionContext the execution context
	 * @return the reportFileFile
	 */
	public SequentialFile getReportFileHandler(ExecutionContext executionContext) {
		
		if(this.reportFileFile == null){
			this.reportFileFile = executionContext.getFileProvider().getFile(
				"TRANREPT",
				new SequentialFileDescriptionBuilder()
					.fileStatus(this.getTranreptStatus())
					.build(),
				getConfiguration(), reportFile);
		}
		return this.reportFileFile;	
	}

	/**
	 * Getter for the file dateParmsFile.
	 * @return the dateParmsFile
	 */
	public DateParmsFile getDateParmsFile() {
		return this.dateParmsFile;
	}

	
	/**
	 * Getter for the file handler dateParmsFileFile.
	 * @param executionContext the execution context
	 * @return the dateParmsFileFile
	 */
	public SequentialFile getDateParmsFileHandler(ExecutionContext executionContext) {
		
		if(this.dateParmsFileFile == null){
			this.dateParmsFileFile = executionContext.getFileProvider().getFile(
				"DATEPARM",
				new SequentialFileDescriptionBuilder()
					.fileStatus(this.getDateparmStatus())
					.build(),
				getConfiguration(), dateParmsFile);
		}
		return this.dateParmsFileFile;	
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
	 * Getter for cardxrefStatus.
	 * @return the cardxrefStatus
	 */
	public CardxrefStatus getCardxrefStatus() {
		return this.cardxrefStatus;
	}

	/**
	 * Setter for cardxrefStatus.
	 * @param reference the new value for cardxrefStatus
	 */
	public void setCardxrefStatus(RangeReference reference) {
		this.cardxrefStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for tranTypeRecord.
	 * @return the tranTypeRecord
	 */
	public TranTypeRecord getTranTypeRecord() {
		return this.tranTypeRecord;
	}

	/**
	 * Setter for tranTypeRecord.
	 * @param reference the new value for tranTypeRecord
	 */
	public void setTranTypeRecord(RangeReference reference) {
		this.tranTypeRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for trantypeStatus.
	 * @return the trantypeStatus
	 */
	public TrantypeStatus getTrantypeStatus() {
		return this.trantypeStatus;
	}

	/**
	 * Setter for trantypeStatus.
	 * @param reference the new value for trantypeStatus
	 */
	public void setTrantypeStatus(RangeReference reference) {
		this.trantypeStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for tranCatRecord.
	 * @return the tranCatRecord
	 */
	public TranCatRecord getTranCatRecord() {
		return this.tranCatRecord;
	}

	/**
	 * Setter for tranCatRecord.
	 * @param reference the new value for tranCatRecord
	 */
	public void setTranCatRecord(RangeReference reference) {
		this.tranCatRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for trancatgStatus.
	 * @return the trancatgStatus
	 */
	public TrancatgStatus getTrancatgStatus() {
		return this.trancatgStatus;
	}

	/**
	 * Setter for trancatgStatus.
	 * @param reference the new value for trancatgStatus
	 */
	public void setTrancatgStatus(RangeReference reference) {
		this.trancatgStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for reportNameHeader.
	 * @return the reportNameHeader
	 */
	public ReportNameHeader getReportNameHeader() {
		return this.reportNameHeader;
	}

	/**
	 * Setter for reportNameHeader.
	 * @param reference the new value for reportNameHeader
	 */
	public void setReportNameHeader(RangeReference reference) {
		this.reportNameHeader.setBytes(reference.getBytes());
	}

	/**
	 * Getter for transactionDetailReport.
	 * @return the transactionDetailReport
	 */
	public TransactionDetailReport getTransactionDetailReport() {
		return this.transactionDetailReport;
	}

	/**
	 * Setter for transactionDetailReport.
	 * @param reference the new value for transactionDetailReport
	 */
	public void setTransactionDetailReport(RangeReference reference) {
		this.transactionDetailReport.setBytes(reference.getBytes());
	}

	/**
	 * Getter for transactionHeader1.
	 * @return the transactionHeader1
	 */
	public TransactionHeader1 getTransactionHeader1() {
		return this.transactionHeader1;
	}

	/**
	 * Setter for transactionHeader1.
	 * @param reference the new value for transactionHeader1
	 */
	public void setTransactionHeader1(RangeReference reference) {
		this.transactionHeader1.setBytes(reference.getBytes());
	}

	/**
	 * Getter for transactionHeader2.
	 * @return the transactionHeader2
	 */
	public TransactionHeader2 getTransactionHeader2() {
		return this.transactionHeader2;
	}

	/**
	 * Setter for transactionHeader2.
	 * @param reference the new value for transactionHeader2
	 */
	public void setTransactionHeader2(RangeReference reference) {
		this.transactionHeader2.setBytes(reference.getBytes());
	}

	/**
	 * Getter for reportPageTotals.
	 * @return the reportPageTotals
	 */
	public ReportPageTotals getReportPageTotals() {
		return this.reportPageTotals;
	}

	/**
	 * Setter for reportPageTotals.
	 * @param reference the new value for reportPageTotals
	 */
	public void setReportPageTotals(RangeReference reference) {
		this.reportPageTotals.setBytes(reference.getBytes());
	}

	/**
	 * Getter for reportAccountTotals.
	 * @return the reportAccountTotals
	 */
	public ReportAccountTotals getReportAccountTotals() {
		return this.reportAccountTotals;
	}

	/**
	 * Setter for reportAccountTotals.
	 * @param reference the new value for reportAccountTotals
	 */
	public void setReportAccountTotals(RangeReference reference) {
		this.reportAccountTotals.setBytes(reference.getBytes());
	}

	/**
	 * Getter for reportGrandTotals.
	 * @return the reportGrandTotals
	 */
	public ReportGrandTotals getReportGrandTotals() {
		return this.reportGrandTotals;
	}

	/**
	 * Setter for reportGrandTotals.
	 * @param reference the new value for reportGrandTotals
	 */
	public void setReportGrandTotals(RangeReference reference) {
		this.reportGrandTotals.setBytes(reference.getBytes());
	}

	/**
	 * Getter for tranreptStatus.
	 * @return the tranreptStatus
	 */
	public TranreptStatus getTranreptStatus() {
		return this.tranreptStatus;
	}

	/**
	 * Setter for tranreptStatus.
	 * @param reference the new value for tranreptStatus
	 */
	public void setTranreptStatus(RangeReference reference) {
		this.tranreptStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for dateparmStatus.
	 * @return the dateparmStatus
	 */
	public DateparmStatus getDateparmStatus() {
		return this.dateparmStatus;
	}

	/**
	 * Setter for dateparmStatus.
	 * @param reference the new value for dateparmStatus
	 */
	public void setDateparmStatus(RangeReference reference) {
		this.dateparmStatus.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsDateparmRecord.
	 * @return the wsDateparmRecord
	 */
	public WsDateparmRecord getWsDateparmRecord() {
		return this.wsDateparmRecord;
	}

	/**
	 * Setter for wsDateparmRecord.
	 * @param reference the new value for wsDateparmRecord
	 */
	public void setWsDateparmRecord(RangeReference reference) {
		this.wsDateparmRecord.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsReportVars.
	 * @return the wsReportVars
	 */
	public WsReportVars getWsReportVars() {
		return this.wsReportVars;
	}

	/**
	 * Setter for wsReportVars.
	 * @param reference the new value for wsReportVars
	 */
	public void setWsReportVars(RangeReference reference) {
		this.wsReportVars.setBytes(reference.getBytes());
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

	@Override 
	public void cleanUp(){
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
		if(this.trantypeFileFile !=null && this.trantypeFileFile.isOpen() && !this.trantypeFileFile.isShared()) {
			this.trantypeFileFile.close();
		}
		if(this.trantypeFileFile !=null && !this.trantypeFileFile.isShared()){
			this.trantypeFileFile = null;
		}
		if(this.trancatgFileFile !=null && this.trancatgFileFile.isOpen() && !this.trancatgFileFile.isShared()) {
			this.trancatgFileFile.close();
		}
		if(this.trancatgFileFile !=null && !this.trancatgFileFile.isShared()){
			this.trancatgFileFile = null;
		}
		if(this.reportFileFile !=null && this.reportFileFile.isOpen() && !this.reportFileFile.isShared()) {
			this.reportFileFile.close();
		}
		if(this.reportFileFile !=null && !this.reportFileFile.isShared()){
			this.reportFileFile = null;
		}
		if(this.dateParmsFileFile !=null && this.dateParmsFileFile.isOpen() && !this.dateParmsFileFile.isShared()) {
			this.dateParmsFileFile.close();
		}
		if(this.dateParmsFileFile !=null && !this.dateParmsFileFile.isShared()){
			this.dateParmsFileFile = null;
		}
	}

	@Override
	protected void doReset() {
		cleanUp();
		this.transactFile.reset();
		this.xrefFile.reset();
		this.trantypeFile.reset();
		this.trancatgFile.reset();
		this.reportFile.reset();
		this.dateParmsFile.reset();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
	}

	
	private void initWorking(Configuration configuration) {
		tranRecord = new TranRecord(configuration);
		tranfileStatus = new TranfileStatus(configuration);
		cardXrefRecord = new CardXrefRecord(configuration);
		cardxrefStatus = new CardxrefStatus(configuration);
		tranTypeRecord = new TranTypeRecord(configuration);
		trantypeStatus = new TrantypeStatus(configuration);
		tranCatRecord = new TranCatRecord(configuration);
		trancatgStatus = new TrancatgStatus(configuration);
		reportNameHeader = new ReportNameHeader(configuration);
		transactionDetailReport = new TransactionDetailReport(configuration);
		transactionHeader1 = new TransactionHeader1(configuration);
		transactionHeader2 = new TransactionHeader2(configuration);
		reportPageTotals = new ReportPageTotals(configuration);
		reportAccountTotals = new ReportAccountTotals(configuration);
		reportGrandTotals = new ReportGrandTotals(configuration);
		tranreptStatus = new TranreptStatus(configuration);
		dateparmStatus = new DateparmStatus(configuration);
		wsDateparmRecord = new WsDateparmRecord(configuration);
		wsReportVars = new WsReportVars(configuration);
		ioStatus = new IoStatus(configuration);
		group1 = new Group1(configuration);
		ioStatus04 = new IoStatus04(configuration);
		applResult = new ApplResult(configuration);
		endOfFile = new EndOfFile(configuration);
		abcode = new Abcode(configuration);
		timing = new Timing(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(tranRecord, tranfileStatus, cardXrefRecord, cardxrefStatus, tranTypeRecord, trantypeStatus, tranCatRecord, trancatgStatus, reportNameHeader, transactionDetailReport, transactionHeader1, transactionHeader2, reportPageTotals, reportAccountTotals, reportGrandTotals, tranreptStatus, dateparmStatus, wsDateparmRecord, wsReportVars, ioStatus, group1, ioStatus04, applResult, endOfFile, abcode, timing);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCbtrn03cContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
