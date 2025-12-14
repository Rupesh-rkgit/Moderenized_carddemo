package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Group2.
 * 
 * <p>About 'db2FormatTs' field, <br>
 * </p>
 * 
 * <p>About 'entity' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.Entity
 * <br></p>
 * 
 * @see RecordEntity
 */
public class Group2 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Union union = new Union(root);
	private final Elementary db2FormatTs = new Elementary(union,new AlphanumericType(26));
	private final Group entity = new Group(union);
	private final Elementary db2Yyyy = new Elementary(entity,new AlphanumericType(4));
	private final Elementary db2Streep1 = new Elementary(entity,new AlphanumericType(1));
	private final Elementary db2Mm = new Elementary(entity,new AlphanumericType(2));
	private final Elementary db2Streep2 = new Elementary(entity,new AlphanumericType(1));
	private final Elementary db2Dd = new Elementary(entity,new AlphanumericType(2));
	private final Elementary db2Streep3 = new Elementary(entity,new AlphanumericType(1));
	private final Elementary db2Hh = new Elementary(entity,new AlphanumericType(2));
	private final Elementary db2Dot1 = new Elementary(entity,new AlphanumericType(1));
	private final Elementary db2Min = new Elementary(entity,new AlphanumericType(2));
	private final Elementary db2Dot2 = new Elementary(entity,new AlphanumericType(1));
	private final Elementary db2Ss = new Elementary(entity,new AlphanumericType(2));
	private final Elementary db2Dot3 = new Elementary(entity,new AlphanumericType(1));
	private final Elementary db2Mil = new Elementary(entity,new ZonedType(2, 0, false));
	private final Elementary db2Rest = new Elementary(entity,new AlphanumericType(4));
	

	/**
	 * Instantiate a new Group2 with a default record.
	 * @param configuration the configuration
	 */
	public Group2(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Group2 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Group2(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute db2FormatTs.
	 * @return the db2FormatTs attribute reference
	 */
	public ElementaryRangeReference getDb2FormatTsReference() {
		return db2FormatTs.getReference();
	}

	/**
	 * Getter for db2FormatTs attribute.
	 * @return db2FormatTs attribute
	 */
	public String getDb2FormatTs() {
		return db2FormatTs.getValue();
	}

	/**
	 * Setter for db2FormatTs attribute.
	 * @param db2FormatTs the new value of db2FormatTs
	 */
	public void setDb2FormatTs(String db2FormatTs) {
		this.db2FormatTs.setValue(db2FormatTs);
	}
	
	/**
	 * Gets the reference for attribute entity.
	 * @return the entity attribute reference
	 */
	public RangeReference getEntityReference() {
		return entity.getReference();
	}	
				
	/**
	 * Setter for entity .
	 */
   	public void setEntity(RangeReference reference) {
       	entity.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute db2Yyyy.
	 * @return the db2Yyyy attribute reference
	 */
	public ElementaryRangeReference getDb2YyyyReference() {
		return db2Yyyy.getReference();
	}

	/**
	 * Getter for db2Yyyy attribute.
	 * @return db2Yyyy attribute
	 */
	public String getDb2Yyyy() {
		return db2Yyyy.getValue();
	}

	/**
	 * Setter for db2Yyyy attribute.
	 * @param db2Yyyy the new value of db2Yyyy
	 */
	public void setDb2Yyyy(String db2Yyyy) {
		this.db2Yyyy.setValue(db2Yyyy);
	}
	/**
	 * Gets the reference for attribute db2Streep1.
	 * @return the db2Streep1 attribute reference
	 */
	public ElementaryRangeReference getDb2Streep1Reference() {
		return db2Streep1.getReference();
	}

	/**
	 * Getter for db2Streep1 attribute.
	 * @return db2Streep1 attribute
	 */
	public String getDb2Streep1() {
		return db2Streep1.getValue();
	}

	/**
	 * Setter for db2Streep1 attribute.
	 * @param db2Streep1 the new value of db2Streep1
	 */
	public void setDb2Streep1(String db2Streep1) {
		this.db2Streep1.setValue(db2Streep1);
	}
	/**
	 * Gets the reference for attribute db2Mm.
	 * @return the db2Mm attribute reference
	 */
	public ElementaryRangeReference getDb2MmReference() {
		return db2Mm.getReference();
	}

	/**
	 * Getter for db2Mm attribute.
	 * @return db2Mm attribute
	 */
	public String getDb2Mm() {
		return db2Mm.getValue();
	}

	/**
	 * Setter for db2Mm attribute.
	 * @param db2Mm the new value of db2Mm
	 */
	public void setDb2Mm(String db2Mm) {
		this.db2Mm.setValue(db2Mm);
	}
	/**
	 * Gets the reference for attribute db2Streep2.
	 * @return the db2Streep2 attribute reference
	 */
	public ElementaryRangeReference getDb2Streep2Reference() {
		return db2Streep2.getReference();
	}

	/**
	 * Getter for db2Streep2 attribute.
	 * @return db2Streep2 attribute
	 */
	public String getDb2Streep2() {
		return db2Streep2.getValue();
	}

	/**
	 * Setter for db2Streep2 attribute.
	 * @param db2Streep2 the new value of db2Streep2
	 */
	public void setDb2Streep2(String db2Streep2) {
		this.db2Streep2.setValue(db2Streep2);
	}
	/**
	 * Gets the reference for attribute db2Dd.
	 * @return the db2Dd attribute reference
	 */
	public ElementaryRangeReference getDb2DdReference() {
		return db2Dd.getReference();
	}

	/**
	 * Getter for db2Dd attribute.
	 * @return db2Dd attribute
	 */
	public String getDb2Dd() {
		return db2Dd.getValue();
	}

	/**
	 * Setter for db2Dd attribute.
	 * @param db2Dd the new value of db2Dd
	 */
	public void setDb2Dd(String db2Dd) {
		this.db2Dd.setValue(db2Dd);
	}
	/**
	 * Gets the reference for attribute db2Streep3.
	 * @return the db2Streep3 attribute reference
	 */
	public ElementaryRangeReference getDb2Streep3Reference() {
		return db2Streep3.getReference();
	}

	/**
	 * Getter for db2Streep3 attribute.
	 * @return db2Streep3 attribute
	 */
	public String getDb2Streep3() {
		return db2Streep3.getValue();
	}

	/**
	 * Setter for db2Streep3 attribute.
	 * @param db2Streep3 the new value of db2Streep3
	 */
	public void setDb2Streep3(String db2Streep3) {
		this.db2Streep3.setValue(db2Streep3);
	}
	/**
	 * Gets the reference for attribute db2Hh.
	 * @return the db2Hh attribute reference
	 */
	public ElementaryRangeReference getDb2HhReference() {
		return db2Hh.getReference();
	}

	/**
	 * Getter for db2Hh attribute.
	 * @return db2Hh attribute
	 */
	public String getDb2Hh() {
		return db2Hh.getValue();
	}

	/**
	 * Setter for db2Hh attribute.
	 * @param db2Hh the new value of db2Hh
	 */
	public void setDb2Hh(String db2Hh) {
		this.db2Hh.setValue(db2Hh);
	}
	/**
	 * Gets the reference for attribute db2Dot1.
	 * @return the db2Dot1 attribute reference
	 */
	public ElementaryRangeReference getDb2Dot1Reference() {
		return db2Dot1.getReference();
	}

	/**
	 * Getter for db2Dot1 attribute.
	 * @return db2Dot1 attribute
	 */
	public String getDb2Dot1() {
		return db2Dot1.getValue();
	}

	/**
	 * Setter for db2Dot1 attribute.
	 * @param db2Dot1 the new value of db2Dot1
	 */
	public void setDb2Dot1(String db2Dot1) {
		this.db2Dot1.setValue(db2Dot1);
	}
	/**
	 * Gets the reference for attribute db2Min.
	 * @return the db2Min attribute reference
	 */
	public ElementaryRangeReference getDb2MinReference() {
		return db2Min.getReference();
	}

	/**
	 * Getter for db2Min attribute.
	 * @return db2Min attribute
	 */
	public String getDb2Min() {
		return db2Min.getValue();
	}

	/**
	 * Setter for db2Min attribute.
	 * @param db2Min the new value of db2Min
	 */
	public void setDb2Min(String db2Min) {
		this.db2Min.setValue(db2Min);
	}
	/**
	 * Gets the reference for attribute db2Dot2.
	 * @return the db2Dot2 attribute reference
	 */
	public ElementaryRangeReference getDb2Dot2Reference() {
		return db2Dot2.getReference();
	}

	/**
	 * Getter for db2Dot2 attribute.
	 * @return db2Dot2 attribute
	 */
	public String getDb2Dot2() {
		return db2Dot2.getValue();
	}

	/**
	 * Setter for db2Dot2 attribute.
	 * @param db2Dot2 the new value of db2Dot2
	 */
	public void setDb2Dot2(String db2Dot2) {
		this.db2Dot2.setValue(db2Dot2);
	}
	/**
	 * Gets the reference for attribute db2Ss.
	 * @return the db2Ss attribute reference
	 */
	public ElementaryRangeReference getDb2SsReference() {
		return db2Ss.getReference();
	}

	/**
	 * Getter for db2Ss attribute.
	 * @return db2Ss attribute
	 */
	public String getDb2Ss() {
		return db2Ss.getValue();
	}

	/**
	 * Setter for db2Ss attribute.
	 * @param db2Ss the new value of db2Ss
	 */
	public void setDb2Ss(String db2Ss) {
		this.db2Ss.setValue(db2Ss);
	}
	/**
	 * Gets the reference for attribute db2Dot3.
	 * @return the db2Dot3 attribute reference
	 */
	public ElementaryRangeReference getDb2Dot3Reference() {
		return db2Dot3.getReference();
	}

	/**
	 * Getter for db2Dot3 attribute.
	 * @return db2Dot3 attribute
	 */
	public String getDb2Dot3() {
		return db2Dot3.getValue();
	}

	/**
	 * Setter for db2Dot3 attribute.
	 * @param db2Dot3 the new value of db2Dot3
	 */
	public void setDb2Dot3(String db2Dot3) {
		this.db2Dot3.setValue(db2Dot3);
	}
	/**
	 * Gets the reference for attribute db2Mil.
	 * @return the db2Mil attribute reference
	 */
	public ElementaryRangeReference getDb2MilReference() {
		return db2Mil.getReference();
	}

	/**
	 * Getter for db2Mil attribute.
	 * @return db2Mil attribute
	 */
	public int getDb2Mil() {
		return db2Mil.getValue();
	}

	/**
	 * Setter for db2Mil attribute.
	 * @param db2Mil the new value of db2Mil
	 */
	public void setDb2Mil(int db2Mil) {
		this.db2Mil.setValue(db2Mil);
	}
	/**
	 * Gets the reference for attribute db2Rest.
	 * @return the db2Rest attribute reference
	 */
	public ElementaryRangeReference getDb2RestReference() {
		return db2Rest.getReference();
	}

	/**
	 * Getter for db2Rest attribute.
	 * @return db2Rest attribute
	 */
	public String getDb2Rest() {
		return db2Rest.getValue();
	}

	/**
	 * Setter for db2Rest attribute.
	 * @param db2Rest the new value of db2Rest
	 */
	public void setDb2Rest(String db2Rest) {
		this.db2Rest.setValue(db2Rest);
	}
}
