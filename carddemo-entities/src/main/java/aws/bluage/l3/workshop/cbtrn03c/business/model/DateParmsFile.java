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
 * Data simplifier file DateParmsFile.
 * 
 * <p>About 'fdDateparmRec' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.FdDateparmRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn03c.business.model.DateParmsFile")
@Lazy
@Scope("prototype")
public class DateParmsFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Elementary fdDateparmRec = new Elementary(root,new AlphanumericType(80));
	 
	/**
	 * Instantiate a new DateParmsFile.
	 * @param configuration the configuration
	 */
	public DateParmsFile(@Qualifier("Cbtrn03cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
 
	/**
	 * Gets the reference for attribute fdDateparmRec.
	 * @return the fdDateparmRec attribute reference
	 */
	public ElementaryRangeReference getFdDateparmRecReference() {
		return fdDateparmRec.getReference();
	}

	/**
	 * Getter for fdDateparmRec attribute.
	 * @return fdDateparmRec attribute
	 */
	public String getFdDateparmRec() {
		return fdDateparmRec.getValue();
	}

	/**
	 * Setter for fdDateparmRec attribute.
	 * @param fdDateparmRec the new value of fdDateparmRec
	 */
	public void setFdDateparmRec(String fdDateparmRec) {
		this.fdDateparmRec.setValue(fdDateparmRec);
	}
}
