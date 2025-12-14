package aws.bluage.l3.workshop.cosgn00c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity Sqlca.
<pre>
 * 
 * Legacy Documentation:<br>
 *  COPY DFHATTR.<br>
 *  LOGGING LAYOUT<br>
 *  <br>
 *      $Header: sqlca5.cob 14-oct-98.15:55:33 apopat Exp $<br>
 *  <br>
 *  ****************************************************************<br>
 *                                                                 *<br>
 *                 S  Q  L  C  A                                   *<br>
 *    (This file in ANSI format.  Do NOT bse it).                  *<br>
 *                                                                 *<br>
 *   MODIFIED                                                      *<br>
 *     losborne   03/09/94 - COMP-5 version of SQLCA.              *<br>
 *     Clare      12/06/84 - Ch SQLCA to not be an EXTERNAL.       *<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'sqlcaid' field, <br>
 * </p>
 * 
 * <p>About 'sqlcabc' field, <br>
 * </p>
 * 
 * <p>About 'sqlcode' field, <br>
 * </p>
 * 
 * <p>About 'sqlerrm' field, <br>uml entity: aws.bluage.l3.workshop.cosgn00c.business.model.Sqlerrm
 * <br></p>
 * 
 * <p>About 'sqlerrp' field, <br>
 * </p>
 * 
 * <p>About 'sqlerrd' field, <br>
 * </p>
 * 
 * <p>About 'sqlwarn' field, <br>uml entity: aws.bluage.l3.workshop.cosgn00c.business.model.Sqlwarn
 * <br></p>
 * 
 * <p>About 'sqlext' field, <br>uml entity: aws.bluage.l3.workshop.cosgn00c.business.model.Sqlext
 * <br></p>
 * 
 * @see RecordEntity
 */
public class Sqlca extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary sqlcaid = new Elementary(root,new AlphanumericType(8));
	private final Elementary sqlcabc = new Elementary(root,new BinaryType(9, 0, "BIN", false, false, true));
	private final Elementary sqlcode = new Elementary(root,new BinaryType(9, 0, "BIN", false, false, true));
	private final Group sqlerrm = new Group(root);
	private final Elementary sqlerrml = new Elementary(sqlerrm,new BinaryType(4, 0, "BIN", false, false, true));
	private final Elementary sqlerrmc = new Elementary(sqlerrm,new AlphanumericType(70));
	private final Elementary sqlerrp = new Elementary(root,new AlphanumericType(8));
	private final Elementary sqlerrd = new Elementary(root,new FixedArray(6),new BinaryType(9, 0, "BIN", false, false, true));
	private final Group sqlwarn = new Group(root);
	private final Elementary sqlwarn0 = new Elementary(sqlwarn,new AlphanumericType(1));
	private final Elementary sqlwarn1 = new Elementary(sqlwarn,new AlphanumericType(1));
	private final Elementary sqlwarn2 = new Elementary(sqlwarn,new AlphanumericType(1));
	private final Elementary sqlwarn3 = new Elementary(sqlwarn,new AlphanumericType(1));
	private final Elementary sqlwarn4 = new Elementary(sqlwarn,new AlphanumericType(1));
	private final Elementary sqlwarn5 = new Elementary(sqlwarn,new AlphanumericType(1));
	private final Elementary sqlwarn6 = new Elementary(sqlwarn,new AlphanumericType(1));
	private final Elementary sqlwarn7 = new Elementary(sqlwarn,new AlphanumericType(1));
	private final Group sqlext = new Group(root);
	private final Elementary sqlwarn8 = new Elementary(sqlext,new AlphanumericType(1));
	private final Elementary sqlwarn9 = new Elementary(sqlext,new AlphanumericType(1));
	private final Elementary sqlwarna = new Elementary(sqlext,new AlphanumericType(1));
	private final Elementary sqlstate = new Elementary(sqlext,new AlphanumericType(5));
	

	/**
	 * Instantiate a new Sqlca with a default record.
	 * @param configuration the configuration
	 */
	public Sqlca(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Sqlca bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Sqlca(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute sqlcaid.
	 * @return the sqlcaid attribute reference
	 */
	public ElementaryRangeReference getSqlcaidReference() {
		return sqlcaid.getReference();
	}

	/**
	 * Getter for sqlcaid attribute.
	 * @return sqlcaid attribute
	 */
	public String getSqlcaid() {
		return sqlcaid.getValue();
	}

	/**
	 * Setter for sqlcaid attribute.
	 * @param sqlcaid the new value of sqlcaid
	 */
	public void setSqlcaid(String sqlcaid) {
		this.sqlcaid.setValue(sqlcaid);
	}
	/**
	 * Gets the reference for attribute sqlcabc.
	 * @return the sqlcabc attribute reference
	 */
	public ElementaryRangeReference getSqlcabcReference() {
		return sqlcabc.getReference();
	}

	/**
	 * Getter for sqlcabc attribute.
	 * @return sqlcabc attribute
	 */
	public int getSqlcabc() {
		return sqlcabc.getValue();
	}

	/**
	 * Setter for sqlcabc attribute.
	 * @param sqlcabc the new value of sqlcabc
	 */
	public void setSqlcabc(int sqlcabc) {
		this.sqlcabc.setValue(sqlcabc);
	}
	/**
	 * Gets the reference for attribute sqlcode.
	 * @return the sqlcode attribute reference
	 */
	public ElementaryRangeReference getSqlcodeReference() {
		return sqlcode.getReference();
	}

	/**
	 * Getter for sqlcode attribute.
	 * @return sqlcode attribute
	 */
	public int getSqlcode() {
		return sqlcode.getValue();
	}

	/**
	 * Setter for sqlcode attribute.
	 * @param sqlcode the new value of sqlcode
	 */
	public void setSqlcode(int sqlcode) {
		this.sqlcode.setValue(sqlcode);
	}
	
	/**
	 * Gets the reference for attribute sqlerrm.
	 * @return the sqlerrm attribute reference
	 */
	public RangeReference getSqlerrmReference() {
		return sqlerrm.getReference();
	}	
				
	/**
	 * Setter for sqlerrm .
	 */
   	public void setSqlerrm(RangeReference reference) {
       	sqlerrm.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute sqlerrml.
	 * @return the sqlerrml attribute reference
	 */
	public ElementaryRangeReference getSqlerrmlReference() {
		return sqlerrml.getReference();
	}

	/**
	 * Getter for sqlerrml attribute.
	 * @return sqlerrml attribute
	 */
	public int getSqlerrml() {
		return sqlerrml.getValue();
	}

	/**
	 * Setter for sqlerrml attribute.
	 * @param sqlerrml the new value of sqlerrml
	 */
	public void setSqlerrml(int sqlerrml) {
		this.sqlerrml.setValue(sqlerrml);
	}
	/**
	 * Gets the reference for attribute sqlerrmc.
	 * @return the sqlerrmc attribute reference
	 */
	public ElementaryRangeReference getSqlerrmcReference() {
		return sqlerrmc.getReference();
	}

	/**
	 * Getter for sqlerrmc attribute.
	 * @return sqlerrmc attribute
	 */
	public String getSqlerrmc() {
		return sqlerrmc.getValue();
	}

	/**
	 * Setter for sqlerrmc attribute.
	 * @param sqlerrmc the new value of sqlerrmc
	 */
	public void setSqlerrmc(String sqlerrmc) {
		this.sqlerrmc.setValue(sqlerrmc);
	}
	/**
	 * Gets the reference for attribute sqlerrp.
	 * @return the sqlerrp attribute reference
	 */
	public ElementaryRangeReference getSqlerrpReference() {
		return sqlerrp.getReference();
	}

	/**
	 * Getter for sqlerrp attribute.
	 * @return sqlerrp attribute
	 */
	public String getSqlerrp() {
		return sqlerrp.getValue();
	}

	/**
	 * Setter for sqlerrp attribute.
	 * @param sqlerrp the new value of sqlerrp
	 */
	public void setSqlerrp(String sqlerrp) {
		this.sqlerrp.setValue(sqlerrp);
	}
	/**
	 * Indexed getter for sqlerrd attribute.
	 * @param indexes the indexes
	 * @return sqlerrd attribute
	 */
	public ElementaryRangeReference getItemFromSqlerrdReference(Integer... indexes) {
		return sqlerrd.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for sqlerrd attribute.
	 * @param indexes the indexes
	 * @return sqlerrd attribute
	 */
	public Integer getItemFromSqlerrd(Integer... indexes) {
		return sqlerrd.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for sqlerrd attribute.
	 * @param sqlerrd the new value of sqlerrd for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromSqlerrd(Integer sqlerrd,Integer... indexes) {
		this.sqlerrd.setIndexedValue(sqlerrd,indexes);
	}
	
	/**
	 * Collection size getter for sqlerrd attribute.
	 * @return  the collection size for attributesqlerrd
	 */
	public int getSqlerrdSize(){
		return sqlerrd.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for sqlerrd attribute.
	 * @param indexes the indexes
	 * @return sqlerrd attribute
	 */
	public ElementaryRangeReference getSqlerrdReference() {
		return sqlerrd.getReference();
	}
	
	/**
	 * Indexed getter for sqlerrd attribute.
	 * @param indexes the indexes
	 * @return sqlerrd attribute
	 */
	public Integer getSqlerrd() {
		return sqlerrd.getValue();
	}
	
	/**
	 * Indexed setter for sqlerrd attribute.
	 * @param sqlerrd the new value of sqlerrd for given indexes
	 * @param indexes the indexes
	 */
	public void setSqlerrd(Integer sqlerrd) {
		this.sqlerrd.setValue(sqlerrd);
	}
	
	
	/**
	 * Gets the reference for attribute sqlwarn.
	 * @return the sqlwarn attribute reference
	 */
	public RangeReference getSqlwarnReference() {
		return sqlwarn.getReference();
	}	
				
	/**
	 * Setter for sqlwarn .
	 */
   	public void setSqlwarn(RangeReference reference) {
       	sqlwarn.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute sqlwarn0.
	 * @return the sqlwarn0 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn0Reference() {
		return sqlwarn0.getReference();
	}

	/**
	 * Getter for sqlwarn0 attribute.
	 * @return sqlwarn0 attribute
	 */
	public String getSqlwarn0() {
		return sqlwarn0.getValue();
	}

	/**
	 * Setter for sqlwarn0 attribute.
	 * @param sqlwarn0 the new value of sqlwarn0
	 */
	public void setSqlwarn0(String sqlwarn0) {
		this.sqlwarn0.setValue(sqlwarn0);
	}
	/**
	 * Gets the reference for attribute sqlwarn1.
	 * @return the sqlwarn1 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn1Reference() {
		return sqlwarn1.getReference();
	}

	/**
	 * Getter for sqlwarn1 attribute.
	 * @return sqlwarn1 attribute
	 */
	public String getSqlwarn1() {
		return sqlwarn1.getValue();
	}

	/**
	 * Setter for sqlwarn1 attribute.
	 * @param sqlwarn1 the new value of sqlwarn1
	 */
	public void setSqlwarn1(String sqlwarn1) {
		this.sqlwarn1.setValue(sqlwarn1);
	}
	/**
	 * Gets the reference for attribute sqlwarn2.
	 * @return the sqlwarn2 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn2Reference() {
		return sqlwarn2.getReference();
	}

	/**
	 * Getter for sqlwarn2 attribute.
	 * @return sqlwarn2 attribute
	 */
	public String getSqlwarn2() {
		return sqlwarn2.getValue();
	}

	/**
	 * Setter for sqlwarn2 attribute.
	 * @param sqlwarn2 the new value of sqlwarn2
	 */
	public void setSqlwarn2(String sqlwarn2) {
		this.sqlwarn2.setValue(sqlwarn2);
	}
	/**
	 * Gets the reference for attribute sqlwarn3.
	 * @return the sqlwarn3 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn3Reference() {
		return sqlwarn3.getReference();
	}

	/**
	 * Getter for sqlwarn3 attribute.
	 * @return sqlwarn3 attribute
	 */
	public String getSqlwarn3() {
		return sqlwarn3.getValue();
	}

	/**
	 * Setter for sqlwarn3 attribute.
	 * @param sqlwarn3 the new value of sqlwarn3
	 */
	public void setSqlwarn3(String sqlwarn3) {
		this.sqlwarn3.setValue(sqlwarn3);
	}
	/**
	 * Gets the reference for attribute sqlwarn4.
	 * @return the sqlwarn4 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn4Reference() {
		return sqlwarn4.getReference();
	}

	/**
	 * Getter for sqlwarn4 attribute.
	 * @return sqlwarn4 attribute
	 */
	public String getSqlwarn4() {
		return sqlwarn4.getValue();
	}

	/**
	 * Setter for sqlwarn4 attribute.
	 * @param sqlwarn4 the new value of sqlwarn4
	 */
	public void setSqlwarn4(String sqlwarn4) {
		this.sqlwarn4.setValue(sqlwarn4);
	}
	/**
	 * Gets the reference for attribute sqlwarn5.
	 * @return the sqlwarn5 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn5Reference() {
		return sqlwarn5.getReference();
	}

	/**
	 * Getter for sqlwarn5 attribute.
	 * @return sqlwarn5 attribute
	 */
	public String getSqlwarn5() {
		return sqlwarn5.getValue();
	}

	/**
	 * Setter for sqlwarn5 attribute.
	 * @param sqlwarn5 the new value of sqlwarn5
	 */
	public void setSqlwarn5(String sqlwarn5) {
		this.sqlwarn5.setValue(sqlwarn5);
	}
	/**
	 * Gets the reference for attribute sqlwarn6.
	 * @return the sqlwarn6 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn6Reference() {
		return sqlwarn6.getReference();
	}

	/**
	 * Getter for sqlwarn6 attribute.
	 * @return sqlwarn6 attribute
	 */
	public String getSqlwarn6() {
		return sqlwarn6.getValue();
	}

	/**
	 * Setter for sqlwarn6 attribute.
	 * @param sqlwarn6 the new value of sqlwarn6
	 */
	public void setSqlwarn6(String sqlwarn6) {
		this.sqlwarn6.setValue(sqlwarn6);
	}
	/**
	 * Gets the reference for attribute sqlwarn7.
	 * @return the sqlwarn7 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn7Reference() {
		return sqlwarn7.getReference();
	}

	/**
	 * Getter for sqlwarn7 attribute.
	 * @return sqlwarn7 attribute
	 */
	public String getSqlwarn7() {
		return sqlwarn7.getValue();
	}

	/**
	 * Setter for sqlwarn7 attribute.
	 * @param sqlwarn7 the new value of sqlwarn7
	 */
	public void setSqlwarn7(String sqlwarn7) {
		this.sqlwarn7.setValue(sqlwarn7);
	}
	
	/**
	 * Gets the reference for attribute sqlext.
	 * @return the sqlext attribute reference
	 */
	public RangeReference getSqlextReference() {
		return sqlext.getReference();
	}	
				
	/**
	 * Setter for sqlext .
	 */
   	public void setSqlext(RangeReference reference) {
       	sqlext.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute sqlwarn8.
	 * @return the sqlwarn8 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn8Reference() {
		return sqlwarn8.getReference();
	}

	/**
	 * Getter for sqlwarn8 attribute.
	 * @return sqlwarn8 attribute
	 */
	public String getSqlwarn8() {
		return sqlwarn8.getValue();
	}

	/**
	 * Setter for sqlwarn8 attribute.
	 * @param sqlwarn8 the new value of sqlwarn8
	 */
	public void setSqlwarn8(String sqlwarn8) {
		this.sqlwarn8.setValue(sqlwarn8);
	}
	/**
	 * Gets the reference for attribute sqlwarn9.
	 * @return the sqlwarn9 attribute reference
	 */
	public ElementaryRangeReference getSqlwarn9Reference() {
		return sqlwarn9.getReference();
	}

	/**
	 * Getter for sqlwarn9 attribute.
	 * @return sqlwarn9 attribute
	 */
	public String getSqlwarn9() {
		return sqlwarn9.getValue();
	}

	/**
	 * Setter for sqlwarn9 attribute.
	 * @param sqlwarn9 the new value of sqlwarn9
	 */
	public void setSqlwarn9(String sqlwarn9) {
		this.sqlwarn9.setValue(sqlwarn9);
	}
	/**
	 * Gets the reference for attribute sqlwarna.
	 * @return the sqlwarna attribute reference
	 */
	public ElementaryRangeReference getSqlwarnaReference() {
		return sqlwarna.getReference();
	}

	/**
	 * Getter for sqlwarna attribute.
	 * @return sqlwarna attribute
	 */
	public String getSqlwarna() {
		return sqlwarna.getValue();
	}

	/**
	 * Setter for sqlwarna attribute.
	 * @param sqlwarna the new value of sqlwarna
	 */
	public void setSqlwarna(String sqlwarna) {
		this.sqlwarna.setValue(sqlwarna);
	}
	/**
	 * Gets the reference for attribute sqlstate.
	 * @return the sqlstate attribute reference
	 */
	public ElementaryRangeReference getSqlstateReference() {
		return sqlstate.getReference();
	}

	/**
	 * Getter for sqlstate attribute.
	 * @return sqlstate attribute
	 */
	public String getSqlstate() {
		return sqlstate.getValue();
	}

	/**
	 * Setter for sqlstate attribute.
	 * @param sqlstate the new value of sqlstate
	 */
	public void setSqlstate(String sqlstate) {
		this.sqlstate.setValue(sqlstate);
	}
}
