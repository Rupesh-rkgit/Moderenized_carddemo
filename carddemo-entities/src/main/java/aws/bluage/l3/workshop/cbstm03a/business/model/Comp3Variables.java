package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity Comp3Variables.
 * 
 * <p>About 'wsTotalAmt' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Comp3Variables extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsTotalAmt = new Elementary(root,new PackedType(9, 2, false, false, true),new BigDecimal("0"));
	

	/**
	 * Instantiate a new Comp3Variables with a default record.
	 * @param configuration the configuration
	 */
	public Comp3Variables(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Comp3Variables bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Comp3Variables(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsTotalAmt.
	 * @return the wsTotalAmt attribute reference
	 */
	public ElementaryRangeReference getWsTotalAmtReference() {
		return wsTotalAmt.getReference();
	}

	/**
	 * Getter for wsTotalAmt attribute.
	 * @return wsTotalAmt attribute
	 */
	public BigDecimal getWsTotalAmt() {
		return wsTotalAmt.getValue();
	}

	/**
	 * Setter for wsTotalAmt attribute.
	 * @param wsTotalAmt the new value of wsTotalAmt
	 */
	public void setWsTotalAmt(BigDecimal wsTotalAmt) {
		this.wsTotalAmt.setValue(wsTotalAmt);
	}
}
