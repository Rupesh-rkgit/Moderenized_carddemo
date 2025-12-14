package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier file ReportFile.
 * 
 * <p>About 'fdReptfileRec' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.FdReptfileRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn03c.business.model.ReportFile")
@Lazy
@Scope("prototype")
public class ReportFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Elementary fdReptfileRec = new Elementary(root,new AlphanumericType(133));
	 
	/**
	 * Instantiate a new ReportFile.
	 * @param configuration the configuration
	 */
	public ReportFile(@Qualifier("Cbtrn03cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
 
	/**
	 * Gets the reference for attribute fdReptfileRec.
	 * @return the fdReptfileRec attribute reference
	 */
	public ElementaryRangeReference getFdReptfileRecReference() {
		return fdReptfileRec.getReference();
	}

	/**
	 * Getter for fdReptfileRec attribute.
	 * @return fdReptfileRec attribute
	 */
	public String getFdReptfileRec() {
		return fdReptfileRec.getValue();
	}

	/**
	 * Setter for fdReptfileRec attribute.
	 * @param fdReptfileRec the new value of fdReptfileRec
	 */
	public void setFdReptfileRec(String fdReptfileRec) {
		this.fdReptfileRec.setValue(fdReptfileRec);
	}
}
