package aws.bluage.l3.workshop.cbtrn03c.business.model;

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
 * Data simplifier file TrantypeFile.
 * 
 * <p>About 'fdTrantypeRec' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.FdTrantypeRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn03c.business.model.TrantypeFile")
@Lazy
@Scope("prototype")
public class TrantypeFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdTrantypeRec = new Group(root);
	private final Elementary fdTranType = new Elementary(fdTrantypeRec,new AlphanumericType(2));
	private final Elementary fdTranData = new Elementary(fdTrantypeRec,new AlphanumericType(58));
	 
	/**
	 * Instantiate a new TrantypeFile.
	 * @param configuration the configuration
	 */
	public TrantypeFile(@Qualifier("Cbtrn03cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdTrantypeRec.
	 * @return the fdTrantypeRec attribute reference
	 */
	public RangeReference getFdTrantypeRecReference() {
		return fdTrantypeRec.getReference();
	}	
				
	/**
	 * Setter for fdTrantypeRec .
	 */
   	public void setFdTrantypeRec(RangeReference reference) {
       	fdTrantypeRec.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdTranType.
	 * @return the fdTranType attribute reference
	 */
	public ElementaryRangeReference getFdTranTypeReference() {
		return fdTranType.getReference();
	}

	/**
	 * Getter for fdTranType attribute.
	 * @return fdTranType attribute
	 */
	public String getFdTranType() {
		return fdTranType.getValue();
	}

	/**
	 * Setter for fdTranType attribute.
	 * @param fdTranType the new value of fdTranType
	 */
	public void setFdTranType(String fdTranType) {
		this.fdTranType.setValue(fdTranType);
	}
	/**
	 * Gets the reference for attribute fdTranData.
	 * @return the fdTranData attribute reference
	 */
	public ElementaryRangeReference getFdTranDataReference() {
		return fdTranData.getReference();
	}

	/**
	 * Getter for fdTranData attribute.
	 * @return fdTranData attribute
	 */
	public String getFdTranData() {
		return fdTranData.getValue();
	}

	/**
	 * Setter for fdTranData attribute.
	 * @param fdTranData the new value of fdTranData
	 */
	public void setFdTranData(String fdTranData) {
		this.fdTranData.setValue(fdTranData);
	}
}
