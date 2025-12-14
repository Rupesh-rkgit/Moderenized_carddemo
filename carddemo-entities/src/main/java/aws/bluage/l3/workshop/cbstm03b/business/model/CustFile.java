package aws.bluage.l3.workshop.cbstm03b.business.model;

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
 * Data simplifier file CustFile.
 * 
 * <p>About 'fdCustfileRec' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.FdCustfileRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbstm03b.business.model.CustFile")
@Lazy
@Scope("prototype")
public class CustFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdCustfileRec = new Group(root);
	private final Elementary fdCustId = new Elementary(fdCustfileRec,new AlphanumericType(9));
	private final Elementary fdCustData = new Elementary(fdCustfileRec,new AlphanumericType(491));
	 
	/**
	 * Instantiate a new CustFile.
	 * @param configuration the configuration
	 */
	public CustFile(@Qualifier("Cbstm03bContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdCustfileRec.
	 * @return the fdCustfileRec attribute reference
	 */
	public RangeReference getFdCustfileRecReference() {
		return fdCustfileRec.getReference();
	}	
				
	/**
	 * Setter for fdCustfileRec .
	 */
   	public void setFdCustfileRec(RangeReference reference) {
       	fdCustfileRec.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdCustId.
	 * @return the fdCustId attribute reference
	 */
	public ElementaryRangeReference getFdCustIdReference() {
		return fdCustId.getReference();
	}

	/**
	 * Getter for fdCustId attribute.
	 * @return fdCustId attribute
	 */
	public String getFdCustId() {
		return fdCustId.getValue();
	}

	/**
	 * Setter for fdCustId attribute.
	 * @param fdCustId the new value of fdCustId
	 */
	public void setFdCustId(String fdCustId) {
		this.fdCustId.setValue(fdCustId);
	}
	/**
	 * Gets the reference for attribute fdCustData.
	 * @return the fdCustData attribute reference
	 */
	public ElementaryRangeReference getFdCustDataReference() {
		return fdCustData.getReference();
	}

	/**
	 * Getter for fdCustData attribute.
	 * @return fdCustData attribute
	 */
	public String getFdCustData() {
		return fdCustData.getValue();
	}

	/**
	 * Setter for fdCustData attribute.
	 * @param fdCustData the new value of fdCustData
	 */
	public void setFdCustData(String fdCustData) {
		this.fdCustData.setValue(fdCustData);
	}
}
