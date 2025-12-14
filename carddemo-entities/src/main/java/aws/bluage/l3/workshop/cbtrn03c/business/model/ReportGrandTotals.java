package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.NumericEditedType;
/**
 * Data simplifier entity ReportGrandTotals.
 * 
 * <p>About 'reptGrandTotal' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class ReportGrandTotals extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(11),"Grand Total");
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(86),"......................................................................................");
	private final Elementary reptGrandTotal = new Elementary(root,new NumericEditedType("+ZZZ,ZZZ,ZZZ.ZZ"));
	

	/**
	 * Instantiate a new ReportGrandTotals with a default record.
	 * @param configuration the configuration
	 */
	public ReportGrandTotals(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new ReportGrandTotals bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public ReportGrandTotals(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute reptGrandTotal.
	 * @return the reptGrandTotal attribute reference
	 */
	public ElementaryRangeReference getReptGrandTotalReference() {
		return reptGrandTotal.getReference();
	}

	/**
	 * Getter for reptGrandTotal attribute.
	 * @return reptGrandTotal attribute
	 */
	public String getReptGrandTotal() {
		return reptGrandTotal.getValue();
	}

	/**
	 * Setter for reptGrandTotal attribute.
	 * @param reptGrandTotal the new value of reptGrandTotal
	 */
	public void setReptGrandTotal(String reptGrandTotal) {
		this.reptGrandTotal.setValue(reptGrandTotal);
	}
}
