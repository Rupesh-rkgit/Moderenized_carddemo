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
 * Data simplifier file XrefFile.
 * 
 * <p>About 'fdCardxrefRec' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.FdCardxrefRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn03c.business.model.XrefFile")
@Lazy
@Scope("prototype")
public class XrefFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdCardxrefRec = new Group(root);
	private final Elementary fdXrefCardNum = new Elementary(fdCardxrefRec,new AlphanumericType(16));
	private final Elementary fdXrefData = new Elementary(fdCardxrefRec,new AlphanumericType(34));
	 
	/**
	 * Instantiate a new XrefFile.
	 * @param configuration the configuration
	 */
	public XrefFile(@Qualifier("Cbtrn03cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdCardxrefRec.
	 * @return the fdCardxrefRec attribute reference
	 */
	public RangeReference getFdCardxrefRecReference() {
		return fdCardxrefRec.getReference();
	}	
				
	/**
	 * Setter for fdCardxrefRec .
	 */
   	public void setFdCardxrefRec(RangeReference reference) {
       	fdCardxrefRec.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdXrefCardNum.
	 * @return the fdXrefCardNum attribute reference
	 */
	public ElementaryRangeReference getFdXrefCardNumReference() {
		return fdXrefCardNum.getReference();
	}

	/**
	 * Getter for fdXrefCardNum attribute.
	 * @return fdXrefCardNum attribute
	 */
	public String getFdXrefCardNum() {
		return fdXrefCardNum.getValue();
	}

	/**
	 * Setter for fdXrefCardNum attribute.
	 * @param fdXrefCardNum the new value of fdXrefCardNum
	 */
	public void setFdXrefCardNum(String fdXrefCardNum) {
		this.fdXrefCardNum.setValue(fdXrefCardNum);
	}
	/**
	 * Gets the reference for attribute fdXrefData.
	 * @return the fdXrefData attribute reference
	 */
	public ElementaryRangeReference getFdXrefDataReference() {
		return fdXrefData.getReference();
	}

	/**
	 * Getter for fdXrefData attribute.
	 * @return fdXrefData attribute
	 */
	public String getFdXrefData() {
		return fdXrefData.getValue();
	}

	/**
	 * Setter for fdXrefData attribute.
	 * @param fdXrefData the new value of fdXrefData
	 */
	public void setFdXrefData(String fdXrefData) {
		this.fdXrefData.setValue(fdXrefData);
	}
}
