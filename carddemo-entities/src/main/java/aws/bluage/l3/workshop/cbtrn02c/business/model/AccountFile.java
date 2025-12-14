package aws.bluage.l3.workshop.cbtrn02c.business.model;

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
 * Data simplifier file AccountFile.
 * 
 * <p>About 'fdAcctfileRec' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.FdAcctfileRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn02c.business.model.AccountFile")
@Lazy
@Scope("prototype")
public class AccountFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdAcctfileRec = new Group(root);
	private final Elementary fdAcctId = new Elementary(fdAcctfileRec,new ZonedType(11, 0, false));
	private final Elementary fdAcctData = new Elementary(fdAcctfileRec,new AlphanumericType(289));
	 
	/**
	 * Instantiate a new AccountFile.
	 * @param configuration the configuration
	 */
	public AccountFile(@Qualifier("Cbtrn02cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdAcctfileRec.
	 * @return the fdAcctfileRec attribute reference
	 */
	public RangeReference getFdAcctfileRecReference() {
		return fdAcctfileRec.getReference();
	}	
				
	/**
	 * Setter for fdAcctfileRec .
	 */
   	public void setFdAcctfileRec(RangeReference reference) {
       	fdAcctfileRec.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdAcctId.
	 * @return the fdAcctId attribute reference
	 */
	public ElementaryRangeReference getFdAcctIdReference() {
		return fdAcctId.getReference();
	}

	/**
	 * Getter for fdAcctId attribute.
	 * @return fdAcctId attribute
	 */
	public long getFdAcctId() {
		return fdAcctId.getValue();
	}

	/**
	 * Setter for fdAcctId attribute.
	 * @param fdAcctId the new value of fdAcctId
	 */
	public void setFdAcctId(long fdAcctId) {
		this.fdAcctId.setValue(fdAcctId);
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
