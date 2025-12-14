package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier file DalyrejsFile.
 * 
 * <p>About 'fdRejsRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.FdRejsRecord
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn02c.business.model.DalyrejsFile")
@Lazy
@Scope("prototype")
public class DalyrejsFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdRejsRecord = new Group(root);
	private final Elementary fdRejectRecord = new Elementary(fdRejsRecord,new AlphanumericType(350));
	private final Elementary fdValidationTrailer = new Elementary(fdRejsRecord,new AlphanumericType(80));
	 
	/**
	 * Instantiate a new DalyrejsFile.
	 * @param configuration the configuration
	 */
	public DalyrejsFile(@Qualifier("Cbtrn02cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdRejsRecord.
	 * @return the fdRejsRecord attribute reference
	 */
	public RangeReference getFdRejsRecordReference() {
		return fdRejsRecord.getReference();
	}	
				
	/**
	 * Setter for fdRejsRecord .
	 */
   	public void setFdRejsRecord(RangeReference reference) {
       	fdRejsRecord.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdRejectRecord.
	 * @return the fdRejectRecord attribute reference
	 */
	public ElementaryRangeReference getFdRejectRecordReference() {
		return fdRejectRecord.getReference();
	}

	/**
	 * Getter for fdRejectRecord attribute.
	 * @return fdRejectRecord attribute
	 */
	public String getFdRejectRecord() {
		return fdRejectRecord.getValue();
	}

	/**
	 * Setter for fdRejectRecord attribute.
	 * @param fdRejectRecord the new value of fdRejectRecord
	 */
	public void setFdRejectRecord(String fdRejectRecord) {
		this.fdRejectRecord.setValue(fdRejectRecord);
	}
	/**
	 * Gets the reference for attribute fdValidationTrailer.
	 * @return the fdValidationTrailer attribute reference
	 */
	public ElementaryRangeReference getFdValidationTrailerReference() {
		return fdValidationTrailer.getReference();
	}

	/**
	 * Getter for fdValidationTrailer attribute.
	 * @return fdValidationTrailer attribute
	 */
	public String getFdValidationTrailer() {
		return fdValidationTrailer.getValue();
	}

	/**
	 * Setter for fdValidationTrailer attribute.
	 * @param fdValidationTrailer the new value of fdValidationTrailer
	 */
	public void setFdValidationTrailer(String fdValidationTrailer) {
		this.fdValidationTrailer.setValue(fdValidationTrailer);
	}
}
