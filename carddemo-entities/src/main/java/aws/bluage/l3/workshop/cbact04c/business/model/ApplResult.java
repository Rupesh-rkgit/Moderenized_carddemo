package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
import java.math.BigDecimal;
/**
 * Data simplifier entity ApplResult.
 * 
 * <p>About 'applResult' field, <br>
 * </p>
 * 
 * <p>About 'applAok' field, <br>
 * </p>
 * 
 * <p>About 'applEof' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class ApplResult extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary applResult = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true));
	private final ConditionName applAok=new ConditionName(applResult,new BigDecimal("0"));
	private final ConditionName applEof=new ConditionName(applResult,new BigDecimal("16"));
	

	/**
	 * Instantiate a new ApplResult with a default record.
	 * @param configuration the configuration
	 */
	public ApplResult(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new ApplResult bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public ApplResult(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute applResult.
	 * @return the applResult attribute reference
	 */
	public ElementaryRangeReference getApplResultReference() {
		return applResult.getReference();
	}

	/**
	 * Getter for applResult attribute.
	 * @return applResult attribute
	 */
	public int getApplResult() {
		return applResult.getValue();
	}

	/**
	 * Setter for applResult attribute.
	 * @param applResult the new value of applResult
	 */
	public void setApplResult(int applResult) {
		this.applResult.setValue(applResult);
	}
	/**
	 * Gets the reference for attribute applAok.
	 * @return the applAok attribute reference
	 */
	public ConditionReference getApplAokReference() {
		return applResult.getCondition(applAok);	
	}

	/**
	 * Getter for applAok attribute.
	 * @return applAok attribute
	 */
	public boolean isApplAok() {
		return getApplAokReference().getValue();	
	}

	/**
	 * Setter for applAok attribute.
	 * @param applAok the new value of applAok
	 */
	public void setApplAok(boolean applAok) {
		getApplAokReference().setValue(applAok);	
	}
	/**
	 * Gets the reference for attribute applEof.
	 * @return the applEof attribute reference
	 */
	public ConditionReference getApplEofReference() {
		return applResult.getCondition(applEof);	
	}

	/**
	 * Getter for applEof attribute.
	 * @return applEof attribute
	 */
	public boolean isApplEof() {
		return getApplEofReference().getValue();	
	}

	/**
	 * Setter for applEof attribute.
	 * @param applEof the new value of applEof
	 */
	public void setApplEof(boolean applEof) {
		getApplEofReference().setValue(applEof);	
	}
}
