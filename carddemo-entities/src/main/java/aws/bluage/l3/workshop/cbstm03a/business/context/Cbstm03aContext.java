package aws.bluage.l3.workshop.cbstm03a.business.context;
import aws.bluage.l3.workshop.cbstm03a.business.model.AccountRecord;
import aws.bluage.l3.workshop.cbstm03a.business.model.CardXrefRecord;
import aws.bluage.l3.workshop.cbstm03a.business.model.Comp3Variables;
import aws.bluage.l3.workshop.cbstm03a.business.model.CompVariables;
import aws.bluage.l3.workshop.cbstm03a.business.model.CustomerRecord;
import aws.bluage.l3.workshop.cbstm03a.business.model.Group1;
import aws.bluage.l3.workshop.cbstm03a.business.model.HtmlFile;
import aws.bluage.l3.workshop.cbstm03a.business.model.HtmlLines;
import aws.bluage.l3.workshop.cbstm03a.business.model.MiscVariables;
import aws.bluage.l3.workshop.cbstm03a.business.model.Psaptr;
import aws.bluage.l3.workshop.cbstm03a.business.model.StatementLines;
import aws.bluage.l3.workshop.cbstm03a.business.model.StmtFile;
import aws.bluage.l3.workshop.cbstm03a.business.model.TrnxRecord;
import aws.bluage.l3.workshop.cbstm03a.business.model.WsM03bArea;
import aws.bluage.l3.workshop.cbstm03a.business.model.WsTrnTblCntr;
import aws.bluage.l3.workshop.cbstm03a.business.model.WsTrnxTable;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.io.metadata.builder.SequentialFileDescriptionBuilder;
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
 * Data simplifier context Cbstm03aContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'stmtFile' file, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StmtFile
 * <br></p>
 * 
 * <p>About 'htmlFile' file, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.HtmlFile
 * <br></p>
 * 
 * <p>About 'trnxRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.TrnxRecord
 * <br></p>
 * 
 * <p>About 'cardXrefRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.CardXrefRecord
 * <br></p>
 * 
 * <p>About 'customerRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.CustomerRecord
 * <br></p>
 * 
 * <p>About 'accountRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.AccountRecord
 * <br></p>
 * 
 * <p>About 'compVariables' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.CompVariables
 * <br></p>
 * 
 * <p>About 'comp3Variables' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.Comp3Variables
 * <br></p>
 * 
 * <p>About 'miscVariables' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.MiscVariables
 * <br></p>
 * 
 * <p>About 'wsM03bArea' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.WsM03bArea
 * <br></p>
 * 
 * <p>About 'statementLines' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StatementLines
 * <br></p>
 * 
 * <p>About 'htmlLines' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.HtmlLines
 * <br></p>
 * 
 * <p>About 'wsTrnxTable' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.WsTrnxTable
 * <br></p>
 * 
 * <p>About 'wsTrnTblCntr' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.WsTrnTblCntr
 * <br></p>
 * 
 * <p>About 'psaptr' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.Psaptr
 * <br></p>
 * 
 * <p>About 'group1' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.Group1
 * <br></p>
 * 
 * <p>About '_8100FileOpenTarget' field, <br>
 * </p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbstm03a.business.context.Cbstm03aContext")
@Import({
	aws.bluage.l3.workshop.cbstm03a.business.model.StmtFile.class
,	aws.bluage.l3.workshop.cbstm03a.business.model.HtmlFile.class
})
@Lazy
@Scope("prototype")
public class Cbstm03aContext extends JicsRuntimeContext {

	@Autowired
	private StmtFile stmtFile;

	@Autowired
	private HtmlFile htmlFile;

	private SequentialFile stmtFileFile;	

	private SequentialFile htmlFileFile;	
	
	private TrnxRecord trnxRecord;
	private CardXrefRecord cardXrefRecord;
	private CustomerRecord customerRecord;
	private AccountRecord accountRecord;
	private CompVariables compVariables;
	private Comp3Variables comp3Variables;
	private MiscVariables miscVariables;
	private WsM03bArea wsM03bArea;
	private StatementLines statementLines;
	private HtmlLines htmlLines;
	private WsTrnxTable wsTrnxTable;
	private WsTrnTblCntr wsTrnTblCntr;
	private Psaptr psaptr;
	private Group1 group1;

	private int _8100FileOpenTarget;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public Cbstm03aContext (@Qualifier("Cbstm03aContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		
		initRecordEntities();
	}
	
	

	/**
	 * Getter for the file stmtFile.
	 * @return the stmtFile
	 */
	public StmtFile getStmtFile() {
		return this.stmtFile;
	}

	
	/**
	 * Getter for the file handler stmtFileFile.
	 * @param executionContext the execution context
	 * @return the stmtFileFile
	 */
	public SequentialFile getStmtFileHandler(ExecutionContext executionContext) {
		
		if(this.stmtFileFile == null){
			this.stmtFileFile = executionContext.getFileProvider().getFile(
				"STMTFILE",
				new SequentialFileDescriptionBuilder()
					.build(),
				getConfiguration(), stmtFile);
		}
		return this.stmtFileFile;	
	}

	/**
	 * Getter for the file htmlFile.
	 * @return the htmlFile
	 */
	public HtmlFile getHtmlFile() {
		return this.htmlFile;
	}

	
	/**
	 * Getter for the file handler htmlFileFile.
	 * @param executionContext the execution context
	 * @return the htmlFileFile
	 */
	public SequentialFile getHtmlFileHandler(ExecutionContext executionContext) {
		
		if(this.htmlFileFile == null){
			this.htmlFileFile = executionContext.getFileProvider().getFile(
				"HTMLFILE",
				new SequentialFileDescriptionBuilder()
					.build(),
				getConfiguration(), htmlFile);
		}
		return this.htmlFileFile;	
	}

	/**
	 * Getter for trnxRecord.
	 * @return the trnxRecord
	 */
	public TrnxRecord getTrnxRecord() {
		return this.trnxRecord;
	}

	/**
	 * Setter for trnxRecord.
	 * @param reference the new value for trnxRecord
	 */
	public void setTrnxRecord(RangeReference reference) {
		this.trnxRecord.setBytes(reference.getBytes());
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
	 * Getter for compVariables.
	 * @return the compVariables
	 */
	public CompVariables getCompVariables() {
		return this.compVariables;
	}

	/**
	 * Setter for compVariables.
	 * @param reference the new value for compVariables
	 */
	public void setCompVariables(RangeReference reference) {
		this.compVariables.setBytes(reference.getBytes());
	}

	/**
	 * Getter for comp3Variables.
	 * @return the comp3Variables
	 */
	public Comp3Variables getComp3Variables() {
		return this.comp3Variables;
	}

	/**
	 * Setter for comp3Variables.
	 * @param reference the new value for comp3Variables
	 */
	public void setComp3Variables(RangeReference reference) {
		this.comp3Variables.setBytes(reference.getBytes());
	}

	/**
	 * Getter for miscVariables.
	 * @return the miscVariables
	 */
	public MiscVariables getMiscVariables() {
		return this.miscVariables;
	}

	/**
	 * Setter for miscVariables.
	 * @param reference the new value for miscVariables
	 */
	public void setMiscVariables(RangeReference reference) {
		this.miscVariables.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsM03bArea.
	 * @return the wsM03bArea
	 */
	public WsM03bArea getWsM03bArea() {
		return this.wsM03bArea;
	}

	/**
	 * Setter for wsM03bArea.
	 * @param reference the new value for wsM03bArea
	 */
	public void setWsM03bArea(RangeReference reference) {
		this.wsM03bArea.setBytes(reference.getBytes());
	}

	/**
	 * Getter for statementLines.
	 * @return the statementLines
	 */
	public StatementLines getStatementLines() {
		return this.statementLines;
	}

	/**
	 * Setter for statementLines.
	 * @param reference the new value for statementLines
	 */
	public void setStatementLines(RangeReference reference) {
		this.statementLines.setBytes(reference.getBytes());
	}

	/**
	 * Getter for htmlLines.
	 * @return the htmlLines
	 */
	public HtmlLines getHtmlLines() {
		return this.htmlLines;
	}

	/**
	 * Setter for htmlLines.
	 * @param reference the new value for htmlLines
	 */
	public void setHtmlLines(RangeReference reference) {
		this.htmlLines.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsTrnxTable.
	 * @return the wsTrnxTable
	 */
	public WsTrnxTable getWsTrnxTable() {
		return this.wsTrnxTable;
	}

	/**
	 * Setter for wsTrnxTable.
	 * @param reference the new value for wsTrnxTable
	 */
	public void setWsTrnxTable(RangeReference reference) {
		this.wsTrnxTable.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsTrnTblCntr.
	 * @return the wsTrnTblCntr
	 */
	public WsTrnTblCntr getWsTrnTblCntr() {
		return this.wsTrnTblCntr;
	}

	/**
	 * Setter for wsTrnTblCntr.
	 * @param reference the new value for wsTrnTblCntr
	 */
	public void setWsTrnTblCntr(RangeReference reference) {
		this.wsTrnTblCntr.setBytes(reference.getBytes());
	}

	/**
	 * Getter for psaptr.
	 * @return the psaptr
	 */
	public Psaptr getPsaptr() {
		return this.psaptr;
	}

	/**
	 * Setter for psaptr.
	 * @param reference the new value for psaptr
	 */
	public void setPsaptr(RangeReference reference) {
		this.psaptr.setBytes(reference.getBytes());
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
	 * Getter for _8100FileOpenTarget.
	 * @return the _8100FileOpenTarget
	 */
	public int get_8100FileOpenTarget() {
		return this._8100FileOpenTarget;
	}

	/**
	 * Setter for _8100FileOpenTarget.
	 * @param value the new value for _8100FileOpenTarget
	 */
	public void set_8100FileOpenTarget(int value) {
		this._8100FileOpenTarget = value;
	}

	

	@Override 
	public void cleanUp(){
		if(this.stmtFileFile !=null && this.stmtFileFile.isOpen() && !this.stmtFileFile.isShared()) {
			this.stmtFileFile.close();
		}
		if(this.stmtFileFile !=null && !this.stmtFileFile.isShared()){
			this.stmtFileFile = null;
		}
		if(this.htmlFileFile !=null && this.htmlFileFile.isOpen() && !this.htmlFileFile.isShared()) {
			this.htmlFileFile.close();
		}
		if(this.htmlFileFile !=null && !this.htmlFileFile.isShared()){
			this.htmlFileFile = null;
		}
	}

	@Override
	protected void doReset() {
		cleanUp();
		this.stmtFile.reset();
		this.htmlFile.reset();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
		this._8100FileOpenTarget = 0;
	}

	
	private void initWorking(Configuration configuration) {
		trnxRecord = new TrnxRecord(configuration);
		cardXrefRecord = new CardXrefRecord(configuration);
		customerRecord = new CustomerRecord(configuration);
		accountRecord = new AccountRecord(configuration);
		compVariables = new CompVariables(configuration);
		comp3Variables = new Comp3Variables(configuration);
		miscVariables = new MiscVariables(configuration);
		wsM03bArea = new WsM03bArea(configuration);
		statementLines = new StatementLines(configuration);
		htmlLines = new HtmlLines(configuration);
		wsTrnxTable = new WsTrnxTable(configuration);
		wsTrnTblCntr = new WsTrnTblCntr(configuration);
		psaptr = new Psaptr(configuration);
		group1 = new Group1(configuration);
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(trnxRecord, cardXrefRecord, customerRecord, accountRecord, compVariables, comp3Variables, miscVariables, wsM03bArea, statementLines, htmlLines, wsTrnxTable, wsTrnTblCntr, psaptr, group1);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCbstm03aContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		return toSB.toString();
	}

}
