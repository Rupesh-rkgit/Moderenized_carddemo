package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.NumericEditedType;
/**
 * Data simplifier entity StatementLines.
 * 
 * <p>About 'stLine0' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine0
 * <br></p>
 * 
 * <p>About 'stLine1' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine1
 * <br></p>
 * 
 * <p>About 'stLine2' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine2
 * <br></p>
 * 
 * <p>About 'stLine3' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine3
 * <br></p>
 * 
 * <p>About 'stLine4' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine4
 * <br></p>
 * 
 * <p>About 'stLine5' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine5
 * <br></p>
 * 
 * <p>About 'stLine6' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine6
 * <br></p>
 * 
 * <p>About 'stLine7' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine7
 * <br></p>
 * 
 * <p>About 'stLine8' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine8
 * <br></p>
 * 
 * <p>About 'stLine9' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine9
 * <br></p>
 * 
 * <p>About 'stLine10' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine10
 * <br></p>
 * 
 * <p>About 'stLine11' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine11
 * <br></p>
 * 
 * <p>About 'stLine12' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine12
 * <br></p>
 * 
 * <p>About 'stLine13' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine13
 * <br></p>
 * 
 * <p>About 'stLine14' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine14
 * <br></p>
 * 
 * <p>About 'stLine14a' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine14a
 * <br></p>
 * 
 * <p>About 'stLine15' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.StLine15
 * <br></p>
 * 
 * @see RecordEntity
 */
public class StatementLines extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group stLine0 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(stLine0,new AlphanumericType(31),"*******************************");
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(stLine0,new AlphanumericType(18),"START OF STATEMENT");
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(stLine0,new AlphanumericType(31),"*******************************");
	private final Group stLine1 = new Group(root);
	private final Elementary stName = new Elementary(stLine1,new AlphanumericType(75));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(stLine1,new AlphanumericType(5)," ");
	private final Group stLine2 = new Group(root);
	private final Elementary stAdd1 = new Elementary(stLine2,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(stLine2,new AlphanumericType(30)," ");
	private final Group stLine3 = new Group(root);
	private final Elementary stAdd2 = new Elementary(stLine3,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(stLine3,new AlphanumericType(30)," ");
	private final Group stLine4 = new Group(root);
	private final Elementary stAdd3 = new Elementary(stLine4,new AlphanumericType(80));
	private final Group stLine5 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(stLine5,new AlphanumericType(80),"--------------------------------------------------------------------------------");
	private final Group stLine6 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(stLine6,new AlphanumericType(33)," ");
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(stLine6,new AlphanumericType(14),"Basic Details");
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(stLine6,new AlphanumericType(33)," ");
	private final Group stLine7 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(stLine7,new AlphanumericType(20),"Account ID         :");
	private final Elementary stAcctId = new Elementary(stLine7,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(stLine7,new AlphanumericType(40)," ");
	private final Group stLine8 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(stLine8,new AlphanumericType(20),"Current Balance    :");
	private final Elementary stCurrBal = new Elementary(stLine8,new NumericEditedType("9(9).99-"));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(stLine8,new AlphanumericType(7)," ");
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(stLine8,new AlphanumericType(40)," ");
	private final Group stLine9 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(stLine9,new AlphanumericType(20),"FICO Score         :");
	private final Elementary stFicoScore = new Elementary(stLine9,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(stLine9,new AlphanumericType(40)," ");
	private final Group stLine10 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(stLine10,new AlphanumericType(80),"--------------------------------------------------------------------------------");
	private final Group stLine11 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(stLine11,new AlphanumericType(30)," ");
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(stLine11,new AlphanumericType(20),"TRANSACTION SUMMARY ");
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(stLine11,new AlphanumericType(30)," ");
	private final Group stLine12 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(stLine12,new AlphanumericType(80),"--------------------------------------------------------------------------------");
	private final Group stLine13 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(stLine13,new AlphanumericType(16),"Tran ID         ");
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(stLine13,new AlphanumericType(51),"Tran Details    ");
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(stLine13,new AlphanumericType(13),"  Tran Amount");
	private final Group stLine14 = new Group(root);
	private final Elementary stTranid = new Elementary(stLine14,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(stLine14,new AlphanumericType(1)," ");
	private final Elementary stTrandt = new Elementary(stLine14,new AlphanumericType(49));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(stLine14,new AlphanumericType(1),"$");
	private final Elementary stTranamt = new Elementary(stLine14,new NumericEditedType("Z(9).99-"));
	private final Group stLine14a = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(stLine14a,new AlphanumericType(10),"Total EXP:");
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(stLine14a,new AlphanumericType(56)," ");
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(stLine14a,new AlphanumericType(1),"$");
	private final Elementary stTotalTramt = new Elementary(stLine14a,new NumericEditedType("Z(9).99-"));
	private final Group stLine15 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(stLine15,new AlphanumericType(32),"********************************");
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(stLine15,new AlphanumericType(16),"END OF STATEMENT");
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(stLine15,new AlphanumericType(32),"********************************");
	

	/**
	 * Instantiate a new StatementLines with a default record.
	 * @param configuration the configuration
	 */
	public StatementLines(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new StatementLines bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public StatementLines(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute stLine0.
	 * @return the stLine0 attribute reference
	 */
	public RangeReference getStLine0Reference() {
		return stLine0.getReference();
	}	
				
	/**
	 * Setter for stLine0 .
	 */
   	public void setStLine0(RangeReference reference) {
       	stLine0.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute stLine1.
	 * @return the stLine1 attribute reference
	 */
	public RangeReference getStLine1Reference() {
		return stLine1.getReference();
	}	
				
	/**
	 * Setter for stLine1 .
	 */
   	public void setStLine1(RangeReference reference) {
       	stLine1.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute stName.
	 * @return the stName attribute reference
	 */
	public ElementaryRangeReference getStNameReference() {
		return stName.getReference();
	}

	/**
	 * Getter for stName attribute.
	 * @return stName attribute
	 */
	public String getStName() {
		return stName.getValue();
	}

	/**
	 * Setter for stName attribute.
	 * @param stName the new value of stName
	 */
	public void setStName(String stName) {
		this.stName.setValue(stName);
	}
	
	/**
	 * Gets the reference for attribute stLine2.
	 * @return the stLine2 attribute reference
	 */
	public RangeReference getStLine2Reference() {
		return stLine2.getReference();
	}	
				
	/**
	 * Setter for stLine2 .
	 */
   	public void setStLine2(RangeReference reference) {
       	stLine2.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute stAdd1.
	 * @return the stAdd1 attribute reference
	 */
	public ElementaryRangeReference getStAdd1Reference() {
		return stAdd1.getReference();
	}

	/**
	 * Getter for stAdd1 attribute.
	 * @return stAdd1 attribute
	 */
	public String getStAdd1() {
		return stAdd1.getValue();
	}

	/**
	 * Setter for stAdd1 attribute.
	 * @param stAdd1 the new value of stAdd1
	 */
	public void setStAdd1(String stAdd1) {
		this.stAdd1.setValue(stAdd1);
	}
	
	/**
	 * Gets the reference for attribute stLine3.
	 * @return the stLine3 attribute reference
	 */
	public RangeReference getStLine3Reference() {
		return stLine3.getReference();
	}	
				
	/**
	 * Setter for stLine3 .
	 */
   	public void setStLine3(RangeReference reference) {
       	stLine3.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute stAdd2.
	 * @return the stAdd2 attribute reference
	 */
	public ElementaryRangeReference getStAdd2Reference() {
		return stAdd2.getReference();
	}

	/**
	 * Getter for stAdd2 attribute.
	 * @return stAdd2 attribute
	 */
	public String getStAdd2() {
		return stAdd2.getValue();
	}

	/**
	 * Setter for stAdd2 attribute.
	 * @param stAdd2 the new value of stAdd2
	 */
	public void setStAdd2(String stAdd2) {
		this.stAdd2.setValue(stAdd2);
	}
	
	/**
	 * Gets the reference for attribute stLine4.
	 * @return the stLine4 attribute reference
	 */
	public RangeReference getStLine4Reference() {
		return stLine4.getReference();
	}	
				
	/**
	 * Setter for stLine4 .
	 */
   	public void setStLine4(RangeReference reference) {
       	stLine4.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute stAdd3.
	 * @return the stAdd3 attribute reference
	 */
	public ElementaryRangeReference getStAdd3Reference() {
		return stAdd3.getReference();
	}

	/**
	 * Getter for stAdd3 attribute.
	 * @return stAdd3 attribute
	 */
	public String getStAdd3() {
		return stAdd3.getValue();
	}

	/**
	 * Setter for stAdd3 attribute.
	 * @param stAdd3 the new value of stAdd3
	 */
	public void setStAdd3(String stAdd3) {
		this.stAdd3.setValue(stAdd3);
	}
	
	/**
	 * Gets the reference for attribute stLine5.
	 * @return the stLine5 attribute reference
	 */
	public RangeReference getStLine5Reference() {
		return stLine5.getReference();
	}	
				
	/**
	 * Setter for stLine5 .
	 */
   	public void setStLine5(RangeReference reference) {
       	stLine5.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute stLine6.
	 * @return the stLine6 attribute reference
	 */
	public RangeReference getStLine6Reference() {
		return stLine6.getReference();
	}	
				
	/**
	 * Setter for stLine6 .
	 */
   	public void setStLine6(RangeReference reference) {
       	stLine6.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute stLine7.
	 * @return the stLine7 attribute reference
	 */
	public RangeReference getStLine7Reference() {
		return stLine7.getReference();
	}	
				
	/**
	 * Setter for stLine7 .
	 */
   	public void setStLine7(RangeReference reference) {
       	stLine7.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute stAcctId.
	 * @return the stAcctId attribute reference
	 */
	public ElementaryRangeReference getStAcctIdReference() {
		return stAcctId.getReference();
	}

	/**
	 * Getter for stAcctId attribute.
	 * @return stAcctId attribute
	 */
	public String getStAcctId() {
		return stAcctId.getValue();
	}

	/**
	 * Setter for stAcctId attribute.
	 * @param stAcctId the new value of stAcctId
	 */
	public void setStAcctId(String stAcctId) {
		this.stAcctId.setValue(stAcctId);
	}
	
	/**
	 * Gets the reference for attribute stLine8.
	 * @return the stLine8 attribute reference
	 */
	public RangeReference getStLine8Reference() {
		return stLine8.getReference();
	}	
				
	/**
	 * Setter for stLine8 .
	 */
   	public void setStLine8(RangeReference reference) {
       	stLine8.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute stCurrBal.
	 * @return the stCurrBal attribute reference
	 */
	public ElementaryRangeReference getStCurrBalReference() {
		return stCurrBal.getReference();
	}

	/**
	 * Getter for stCurrBal attribute.
	 * @return stCurrBal attribute
	 */
	public String getStCurrBal() {
		return stCurrBal.getValue();
	}

	/**
	 * Setter for stCurrBal attribute.
	 * @param stCurrBal the new value of stCurrBal
	 */
	public void setStCurrBal(String stCurrBal) {
		this.stCurrBal.setValue(stCurrBal);
	}
	
	/**
	 * Gets the reference for attribute stLine9.
	 * @return the stLine9 attribute reference
	 */
	public RangeReference getStLine9Reference() {
		return stLine9.getReference();
	}	
				
	/**
	 * Setter for stLine9 .
	 */
   	public void setStLine9(RangeReference reference) {
       	stLine9.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute stFicoScore.
	 * @return the stFicoScore attribute reference
	 */
	public ElementaryRangeReference getStFicoScoreReference() {
		return stFicoScore.getReference();
	}

	/**
	 * Getter for stFicoScore attribute.
	 * @return stFicoScore attribute
	 */
	public String getStFicoScore() {
		return stFicoScore.getValue();
	}

	/**
	 * Setter for stFicoScore attribute.
	 * @param stFicoScore the new value of stFicoScore
	 */
	public void setStFicoScore(String stFicoScore) {
		this.stFicoScore.setValue(stFicoScore);
	}
	
	/**
	 * Gets the reference for attribute stLine10.
	 * @return the stLine10 attribute reference
	 */
	public RangeReference getStLine10Reference() {
		return stLine10.getReference();
	}	
				
	/**
	 * Setter for stLine10 .
	 */
   	public void setStLine10(RangeReference reference) {
       	stLine10.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute stLine11.
	 * @return the stLine11 attribute reference
	 */
	public RangeReference getStLine11Reference() {
		return stLine11.getReference();
	}	
				
	/**
	 * Setter for stLine11 .
	 */
   	public void setStLine11(RangeReference reference) {
       	stLine11.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute stLine12.
	 * @return the stLine12 attribute reference
	 */
	public RangeReference getStLine12Reference() {
		return stLine12.getReference();
	}	
				
	/**
	 * Setter for stLine12 .
	 */
   	public void setStLine12(RangeReference reference) {
       	stLine12.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute stLine13.
	 * @return the stLine13 attribute reference
	 */
	public RangeReference getStLine13Reference() {
		return stLine13.getReference();
	}	
				
	/**
	 * Setter for stLine13 .
	 */
   	public void setStLine13(RangeReference reference) {
       	stLine13.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute stLine14.
	 * @return the stLine14 attribute reference
	 */
	public RangeReference getStLine14Reference() {
		return stLine14.getReference();
	}	
				
	/**
	 * Setter for stLine14 .
	 */
   	public void setStLine14(RangeReference reference) {
       	stLine14.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute stTranid.
	 * @return the stTranid attribute reference
	 */
	public ElementaryRangeReference getStTranidReference() {
		return stTranid.getReference();
	}

	/**
	 * Getter for stTranid attribute.
	 * @return stTranid attribute
	 */
	public String getStTranid() {
		return stTranid.getValue();
	}

	/**
	 * Setter for stTranid attribute.
	 * @param stTranid the new value of stTranid
	 */
	public void setStTranid(String stTranid) {
		this.stTranid.setValue(stTranid);
	}
	/**
	 * Gets the reference for attribute stTrandt.
	 * @return the stTrandt attribute reference
	 */
	public ElementaryRangeReference getStTrandtReference() {
		return stTrandt.getReference();
	}

	/**
	 * Getter for stTrandt attribute.
	 * @return stTrandt attribute
	 */
	public String getStTrandt() {
		return stTrandt.getValue();
	}

	/**
	 * Setter for stTrandt attribute.
	 * @param stTrandt the new value of stTrandt
	 */
	public void setStTrandt(String stTrandt) {
		this.stTrandt.setValue(stTrandt);
	}
	/**
	 * Gets the reference for attribute stTranamt.
	 * @return the stTranamt attribute reference
	 */
	public ElementaryRangeReference getStTranamtReference() {
		return stTranamt.getReference();
	}

	/**
	 * Getter for stTranamt attribute.
	 * @return stTranamt attribute
	 */
	public String getStTranamt() {
		return stTranamt.getValue();
	}

	/**
	 * Setter for stTranamt attribute.
	 * @param stTranamt the new value of stTranamt
	 */
	public void setStTranamt(String stTranamt) {
		this.stTranamt.setValue(stTranamt);
	}
	
	/**
	 * Gets the reference for attribute stLine14a.
	 * @return the stLine14a attribute reference
	 */
	public RangeReference getStLine14aReference() {
		return stLine14a.getReference();
	}	
				
	/**
	 * Setter for stLine14a .
	 */
   	public void setStLine14a(RangeReference reference) {
       	stLine14a.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute stTotalTramt.
	 * @return the stTotalTramt attribute reference
	 */
	public ElementaryRangeReference getStTotalTramtReference() {
		return stTotalTramt.getReference();
	}

	/**
	 * Getter for stTotalTramt attribute.
	 * @return stTotalTramt attribute
	 */
	public String getStTotalTramt() {
		return stTotalTramt.getValue();
	}

	/**
	 * Setter for stTotalTramt attribute.
	 * @param stTotalTramt the new value of stTotalTramt
	 */
	public void setStTotalTramt(String stTotalTramt) {
		this.stTotalTramt.setValue(stTotalTramt);
	}
	
	/**
	 * Gets the reference for attribute stLine15.
	 * @return the stLine15 attribute reference
	 */
	public RangeReference getStLine15Reference() {
		return stLine15.getReference();
	}	
				
	/**
	 * Setter for stLine15 .
	 */
   	public void setStLine15(RangeReference reference) {
       	stLine15.getReference().setBytes(reference.getBytes());
   	}
 
}
