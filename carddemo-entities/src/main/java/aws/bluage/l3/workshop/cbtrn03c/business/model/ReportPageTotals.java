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
 * Data simplifier entity ReportPageTotals.
 * 
 * <p>About 'reptPageTotal' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class ReportPageTotals extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(11),"Page Total");
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(86),"......................................................................................");
	private final Elementary reptPageTotal = new Elementary(root,new NumericEditedType("+ZZZ,ZZZ,ZZZ.ZZ"));
	

	/**
	 * Instantiate a new ReportPageTotals with a default record.
	 * @param configuration the configuration
	 */
	public ReportPageTotals(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new ReportPageTotals bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public ReportPageTotals(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute reptPageTotal.
	 * @return the reptPageTotal attribute reference
	 */
	public ElementaryRangeReference getReptPageTotalReference() {
		return reptPageTotal.getReference();
	}

	/**
	 * Getter for reptPageTotal attribute.
	 * @return reptPageTotal attribute
	 */
	public String getReptPageTotal() {
		return reptPageTotal.getValue();
	}

	/**
	 * Setter for reptPageTotal attribute.
	 * @param reptPageTotal the new value of reptPageTotal
	 */
	public void setReptPageTotal(String reptPageTotal) {
		this.reptPageTotal.setValue(reptPageTotal);
	}
}
