package aws.bluage.l3.workshop.cbact04c.business.model;

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
 * Data simplifier file TransactFile.
 * 
 * <p>About 'fdTranfileRec' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.FdTranfileRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbact04c.business.model.TransactFile")
@Lazy
@Scope("prototype")
public class TransactFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdTranfileRec = new Group(root);
	private final Elementary fdTransId = new Elementary(fdTranfileRec,new AlphanumericType(16));
	private final Elementary fdAcctData = new Elementary(fdTranfileRec,new AlphanumericType(334));
	 
	/**
	 * Instantiate a new TransactFile.
	 * @param configuration the configuration
	 */
	public TransactFile(@Qualifier("Cbact04cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdTranfileRec.
	 * @return the fdTranfileRec attribute reference
	 */
	public RangeReference getFdTranfileRecReference() {
		return fdTranfileRec.getReference();
	}	
				
	/**
	 * Setter for fdTranfileRec .
	 */
   	public void setFdTranfileRec(RangeReference reference) {
       	fdTranfileRec.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdTransId.
	 * @return the fdTransId attribute reference
	 */
	public ElementaryRangeReference getFdTransIdReference() {
		return fdTransId.getReference();
	}

	/**
	 * Getter for fdTransId attribute.
	 * @return fdTransId attribute
	 */
	public String getFdTransId() {
		return fdTransId.getValue();
	}

	/**
	 * Setter for fdTransId attribute.
	 * @param fdTransId the new value of fdTransId
	 */
	public void setFdTransId(String fdTransId) {
		this.fdTransId.setValue(fdTransId);
	}
	/**
	 * Gets the reference for attribute fdAcctData.
	 * @return the fdAcctData attribute reference
	 */
	public ElementaryRangeReference getFdAcctDataReference() {
		return fdAcctData.getReference();
	}

	/**
	 * Getter for fdAcctData attribute.
	 * @return fdAcctData attribute
	 */
	public String getFdAcctData() {
		return fdAcctData.getValue();
	}

	/**
	 * Setter for fdAcctData attribute.
	 * @param fdAcctData the new value of fdAcctData
	 */
	public void setFdAcctData(String fdAcctData) {
		this.fdAcctData.setValue(fdAcctData);
	}
}
