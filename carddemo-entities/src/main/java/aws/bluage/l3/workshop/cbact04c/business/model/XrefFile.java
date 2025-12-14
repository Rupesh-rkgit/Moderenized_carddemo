package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier file XrefFile.
 * 
 * <p>About 'fdXreffileRec' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.FdXreffileRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbact04c.business.model.XrefFile")
@Lazy
@Scope("prototype")
public class XrefFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdXreffileRec = new Group(root);
	private final Elementary fdXrefCardNum = new Elementary(fdXreffileRec,new AlphanumericType(16));
	private final Elementary fdXrefCustNum = new Elementary(fdXreffileRec,new ZonedType(9, 0, false));
	private final Elementary fdXrefAcctId = new Elementary(fdXreffileRec,new ZonedType(11, 0, false));
	private final Elementary fdXrefFiller = new Elementary(fdXreffileRec,new AlphanumericType(14));
	 
	/**
	 * Instantiate a new XrefFile.
	 * @param configuration the configuration
	 */
	public XrefFile(@Qualifier("Cbact04cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdXreffileRec.
	 * @return the fdXreffileRec attribute reference
	 */
	public RangeReference getFdXreffileRecReference() {
		return fdXreffileRec.getReference();
	}	
				
	/**
	 * Setter for fdXreffileRec .
	 */
   	public void setFdXreffileRec(RangeReference reference) {
       	fdXreffileRec.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute fdXrefCustNum.
	 * @return the fdXrefCustNum attribute reference
	 */
	public ElementaryRangeReference getFdXrefCustNumReference() {
		return fdXrefCustNum.getReference();
	}

	/**
	 * Getter for fdXrefCustNum attribute.
	 * @return fdXrefCustNum attribute
	 */
	public int getFdXrefCustNum() {
		return fdXrefCustNum.getValue();
	}

	/**
	 * Setter for fdXrefCustNum attribute.
	 * @param fdXrefCustNum the new value of fdXrefCustNum
	 */
	public void setFdXrefCustNum(int fdXrefCustNum) {
		this.fdXrefCustNum.setValue(fdXrefCustNum);
	}
	/**
	 * Gets the reference for attribute fdXrefAcctId.
	 * @return the fdXrefAcctId attribute reference
	 */
	public ElementaryRangeReference getFdXrefAcctIdReference() {
		return fdXrefAcctId.getReference();
	}

	/**
	 * Getter for fdXrefAcctId attribute.
	 * @return fdXrefAcctId attribute
	 */
	public long getFdXrefAcctId() {
		return fdXrefAcctId.getValue();
	}

	/**
	 * Setter for fdXrefAcctId attribute.
	 * @param fdXrefAcctId the new value of fdXrefAcctId
	 */
	public void setFdXrefAcctId(long fdXrefAcctId) {
		this.fdXrefAcctId.setValue(fdXrefAcctId);
	}
	/**
	 * Gets the reference for attribute fdXrefFiller.
	 * @return the fdXrefFiller attribute reference
	 */
	public ElementaryRangeReference getFdXrefFillerReference() {
		return fdXrefFiller.getReference();
	}

	/**
	 * Getter for fdXrefFiller attribute.
	 * @return fdXrefFiller attribute
	 */
	public String getFdXrefFiller() {
		return fdXrefFiller.getValue();
	}

	/**
	 * Setter for fdXrefFiller attribute.
	 * @param fdXrefFiller the new value of fdXrefFiller
	 */
	public void setFdXrefFiller(String fdXrefFiller) {
		this.fdXrefFiller.setValue(fdXrefFiller);
	}
}
