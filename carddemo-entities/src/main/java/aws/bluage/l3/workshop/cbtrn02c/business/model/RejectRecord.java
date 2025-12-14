package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity RejectRecord.
 * 
 * <p>About 'rejectTranData' field, <br>
 * </p>
 * 
 * <p>About 'validationTrailer' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class RejectRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary rejectTranData = new Elementary(root,new AlphanumericType(350));
	private final Elementary validationTrailer = new Elementary(root,new AlphanumericType(80));
	

	/**
	 * Instantiate a new RejectRecord with a default record.
	 * @param configuration the configuration
	 */
	public RejectRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new RejectRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public RejectRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute rejectTranData.
	 * @return the rejectTranData attribute reference
	 */
	public ElementaryRangeReference getRejectTranDataReference() {
		return rejectTranData.getReference();
	}

	/**
	 * Getter for rejectTranData attribute.
	 * @return rejectTranData attribute
	 */
	public String getRejectTranData() {
		return rejectTranData.getValue();
	}

	/**
	 * Setter for rejectTranData attribute.
	 * @param rejectTranData the new value of rejectTranData
	 */
	public void setRejectTranData(String rejectTranData) {
		this.rejectTranData.setValue(rejectTranData);
	}
	/**
	 * Gets the reference for attribute validationTrailer.
	 * @return the validationTrailer attribute reference
	 */
	public ElementaryRangeReference getValidationTrailerReference() {
		return validationTrailer.getReference();
	}

	/**
	 * Getter for validationTrailer attribute.
	 * @return validationTrailer attribute
	 */
	public String getValidationTrailer() {
		return validationTrailer.getValue();
	}

	/**
	 * Setter for validationTrailer attribute.
	 * @param validationTrailer the new value of validationTrailer
	 */
	public void setValidationTrailer(String validationTrailer) {
		this.validationTrailer.setValue(validationTrailer);
	}
}
