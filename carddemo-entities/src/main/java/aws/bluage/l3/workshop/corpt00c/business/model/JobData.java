package aws.bluage.l3.workshop.corpt00c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity JobData.
 * 
 * <p>About 'jobData1' field, <br>uml entity: aws.bluage.l3.workshop.corpt00c.business.model.JobData1
 * <br></p>
 * 
 * <p>About 'jobData2' field, <br>uml entity: aws.bluage.l3.workshop.corpt00c.business.model.JobData2
 * <br></p>
 * 
 * @see RecordEntity
 */
public class JobData extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Union union = new Union(root);
	private final Group jobData1 = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(jobData1,new AlphanumericType(80),"//TRNRPT00 JOB 'TRAN REPORT',CLASS=A,MSGCLASS=0,");
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(jobData1,new AlphanumericType(80),"// NOTIFY=&SYSUID");
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(jobData1,new AlphanumericType(80),"//*");
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(jobData1,new AlphanumericType(80),"//JOBLIB JCLLIB ORDER=('AWS.M2.CARDDEMO.PROC')");
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(jobData1,new AlphanumericType(80),"//*");
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(jobData1,new AlphanumericType(80),"//STEP10 EXEC PROC=TRANREPT");
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(jobData1,new AlphanumericType(80),"//*");
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(jobData1,new AlphanumericType(80),"//STEP05R.SYMNAMES DD *");
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(jobData1,new AlphanumericType(80),"TRAN-CARD-NUM,263,16,ZD");
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(jobData1,new AlphanumericType(80),"TRAN-PROC-DT,305,10,CH");
	private final Group filler1 = new Group(jobData1);
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(filler1,new AlphanumericType(18),"PARM-START-DATE,C'");
	private final Elementary parmStartDate1 = new Elementary(filler1,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(filler1,new AlphanumericType(52),"'");
	private final Group filler2 = new Group(jobData1);
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(filler2,new AlphanumericType(16),"PARM-END-DATE,C'");
	private final Elementary parmEndDate1 = new Elementary(filler2,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(filler2,new AlphanumericType(54),"'");
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(jobData1,new AlphanumericType(80),"/*");
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(jobData1,new AlphanumericType(80),"//STEP10R.DATEPARM DD *");
	private final Group filler3 = new Group(jobData1);
	private final Elementary parmStartDate2 = new Elementary(filler3,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(filler3,new AlphanumericType(1)," ");
	private final Elementary parmEndDate2 = new Elementary(filler3,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(filler3,new AlphanumericType(59)," ");
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(jobData1,new AlphanumericType(80),"/*");
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(jobData1,new AlphanumericType(80),"/*EOF");
	private final Group jobData2 = new Group(union);
	private final Elementary jobLines = new Elementary(jobData2,new FixedArray(1000),new AlphanumericType(80));
	

	/**
	 * Instantiate a new JobData with a default record.
	 * @param configuration the configuration
	 */
	public JobData(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new JobData bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public JobData(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute jobData1.
	 * @return the jobData1 attribute reference
	 */
	public RangeReference getJobData1Reference() {
		return jobData1.getReference();
	}	
				
	/**
	 * Setter for jobData1 .
	 */
   	public void setJobData1(RangeReference reference) {
       	jobData1.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute filler1.
	 * @return the filler1 attribute reference
	 */
	public RangeReference getFiller1Reference() {
		return filler1.getReference();
	}	
				
	/**
	 * Setter for filler1 .
	 */
   	public void setFiller1(RangeReference reference) {
       	filler1.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute parmStartDate1.
	 * @return the parmStartDate1 attribute reference
	 */
	public ElementaryRangeReference getParmStartDate1Reference() {
		return parmStartDate1.getReference();
	}

	/**
	 * Getter for parmStartDate1 attribute.
	 * @return parmStartDate1 attribute
	 */
	public String getParmStartDate1() {
		return parmStartDate1.getValue();
	}

	/**
	 * Setter for parmStartDate1 attribute.
	 * @param parmStartDate1 the new value of parmStartDate1
	 */
	public void setParmStartDate1(String parmStartDate1) {
		this.parmStartDate1.setValue(parmStartDate1);
	}
	
	/**
	 * Gets the reference for attribute filler2.
	 * @return the filler2 attribute reference
	 */
	public RangeReference getFiller2Reference() {
		return filler2.getReference();
	}	
				
	/**
	 * Setter for filler2 .
	 */
   	public void setFiller2(RangeReference reference) {
       	filler2.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute parmEndDate1.
	 * @return the parmEndDate1 attribute reference
	 */
	public ElementaryRangeReference getParmEndDate1Reference() {
		return parmEndDate1.getReference();
	}

	/**
	 * Getter for parmEndDate1 attribute.
	 * @return parmEndDate1 attribute
	 */
	public String getParmEndDate1() {
		return parmEndDate1.getValue();
	}

	/**
	 * Setter for parmEndDate1 attribute.
	 * @param parmEndDate1 the new value of parmEndDate1
	 */
	public void setParmEndDate1(String parmEndDate1) {
		this.parmEndDate1.setValue(parmEndDate1);
	}
	
	/**
	 * Gets the reference for attribute filler3.
	 * @return the filler3 attribute reference
	 */
	public RangeReference getFiller3Reference() {
		return filler3.getReference();
	}	
				
	/**
	 * Setter for filler3 .
	 */
   	public void setFiller3(RangeReference reference) {
       	filler3.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute parmStartDate2.
	 * @return the parmStartDate2 attribute reference
	 */
	public ElementaryRangeReference getParmStartDate2Reference() {
		return parmStartDate2.getReference();
	}

	/**
	 * Getter for parmStartDate2 attribute.
	 * @return parmStartDate2 attribute
	 */
	public String getParmStartDate2() {
		return parmStartDate2.getValue();
	}

	/**
	 * Setter for parmStartDate2 attribute.
	 * @param parmStartDate2 the new value of parmStartDate2
	 */
	public void setParmStartDate2(String parmStartDate2) {
		this.parmStartDate2.setValue(parmStartDate2);
	}
	/**
	 * Gets the reference for attribute parmEndDate2.
	 * @return the parmEndDate2 attribute reference
	 */
	public ElementaryRangeReference getParmEndDate2Reference() {
		return parmEndDate2.getReference();
	}

	/**
	 * Getter for parmEndDate2 attribute.
	 * @return parmEndDate2 attribute
	 */
	public String getParmEndDate2() {
		return parmEndDate2.getValue();
	}

	/**
	 * Setter for parmEndDate2 attribute.
	 * @param parmEndDate2 the new value of parmEndDate2
	 */
	public void setParmEndDate2(String parmEndDate2) {
		this.parmEndDate2.setValue(parmEndDate2);
	}
	
	/**
	 * Gets the reference for attribute jobData2.
	 * @return the jobData2 attribute reference
	 */
	public RangeReference getJobData2Reference() {
		return jobData2.getReference();
	}	
				
	/**
	 * Setter for jobData2 .
	 */
   	public void setJobData2(RangeReference reference) {
       	jobData2.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Indexed getter for jobLines attribute.
	 * @param indexes the indexes
	 * @return jobLines attribute
	 */
	public ElementaryRangeReference getItemFromJobLinesReference(Integer... indexes) {
		return jobLines.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for jobLines attribute.
	 * @param indexes the indexes
	 * @return jobLines attribute
	 */
	public String getItemFromJobLines(Integer... indexes) {
		return jobLines.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for jobLines attribute.
	 * @param jobLines the new value of jobLines for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromJobLines(String jobLines,Integer... indexes) {
		this.jobLines.setIndexedValue(jobLines,indexes);
	}
	
	/**
	 * Collection size getter for jobLines attribute.
	 * @return  the collection size for attributejobLines
	 */
	public int getJobLinesSize(){
		return jobLines.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for jobLines attribute.
	 * @param indexes the indexes
	 * @return jobLines attribute
	 */
	public ElementaryRangeReference getJobLinesReference() {
		return jobLines.getReference();
	}
	
	/**
	 * Indexed getter for jobLines attribute.
	 * @param indexes the indexes
	 * @return jobLines attribute
	 */
	public String getJobLines() {
		return jobLines.getValue();
	}
	
	/**
	 * Indexed setter for jobLines attribute.
	 * @param jobLines the new value of jobLines for given indexes
	 * @param indexes the indexes
	 */
	public void setJobLines(String jobLines) {
		this.jobLines.setValue(jobLines);
	}
	
}
