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
 * Data simplifier entity ReportAccountTotals.
 * 
 * <p>About 'reptAccountTotal' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class ReportAccountTotals extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(13),"Account Total");
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(84),"....................................................................................");
	private final Elementary reptAccountTotal = new Elementary(root,new NumericEditedType("+ZZZ,ZZZ,ZZZ.ZZ"));
	

	/**
	 * Instantiate a new ReportAccountTotals with a default record.
	 * @param configuration the configuration
	 */
	public ReportAccountTotals(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new ReportAccountTotals bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public ReportAccountTotals(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute reptAccountTotal.
	 * @return the reptAccountTotal attribute reference
	 */
	public ElementaryRangeReference getReptAccountTotalReference() {
		return reptAccountTotal.getReference();
	}

	/**
	 * Getter for reptAccountTotal attribute.
	 * @return reptAccountTotal attribute
	 */
	public String getReptAccountTotal() {
		return reptAccountTotal.getValue();
	}

	/**
	 * Setter for reptAccountTotal attribute.
	 * @param reptAccountTotal the new value of reptAccountTotal
	 */
	public void setReptAccountTotal(String reptAccountTotal) {
		this.reptAccountTotal.setValue(reptAccountTotal);
	}
}
