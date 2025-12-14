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
 * Data simplifier file DiscgrpFile.
 * 
 * <p>About 'fdDiscgrpRec' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.FdDiscgrpRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbact04c.business.model.DiscgrpFile")
@Lazy
@Scope("prototype")
public class DiscgrpFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdDiscgrpRec = new Group(root);
	private final Group fdDiscgrpKey = new Group(fdDiscgrpRec);
	private final Elementary fdDisAcctGroupId = new Elementary(fdDiscgrpKey,new AlphanumericType(10));
	private final Elementary fdDisTranTypeCd = new Elementary(fdDiscgrpKey,new AlphanumericType(2));
	private final Elementary fdDisTranCatCd = new Elementary(fdDiscgrpKey,new ZonedType(4, 0, false));
	private final Elementary fdDiscgrpData = new Elementary(fdDiscgrpRec,new AlphanumericType(34));
	 
	/**
	 * Instantiate a new DiscgrpFile.
	 * @param configuration the configuration
	 */
	public DiscgrpFile(@Qualifier("Cbact04cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdDiscgrpRec.
	 * @return the fdDiscgrpRec attribute reference
	 */
	public RangeReference getFdDiscgrpRecReference() {
		return fdDiscgrpRec.getReference();
	}	
				
	/**
	 * Setter for fdDiscgrpRec .
	 */
   	public void setFdDiscgrpRec(RangeReference reference) {
       	fdDiscgrpRec.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute fdDiscgrpKey.
	 * @return the fdDiscgrpKey attribute reference
	 */
	public RangeReference getFdDiscgrpKeyReference() {
		return fdDiscgrpKey.getReference();
	}	
				
	/**
	 * Setter for fdDiscgrpKey .
	 */
   	public void setFdDiscgrpKey(RangeReference reference) {
       	fdDiscgrpKey.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdDisAcctGroupId.
	 * @return the fdDisAcctGroupId attribute reference
	 */
	public ElementaryRangeReference getFdDisAcctGroupIdReference() {
		return fdDisAcctGroupId.getReference();
	}

	/**
	 * Getter for fdDisAcctGroupId attribute.
	 * @return fdDisAcctGroupId attribute
	 */
	public String getFdDisAcctGroupId() {
		return fdDisAcctGroupId.getValue();
	}

	/**
	 * Setter for fdDisAcctGroupId attribute.
	 * @param fdDisAcctGroupId the new value of fdDisAcctGroupId
	 */
	public void setFdDisAcctGroupId(String fdDisAcctGroupId) {
		this.fdDisAcctGroupId.setValue(fdDisAcctGroupId);
	}
	/**
	 * Gets the reference for attribute fdDisTranTypeCd.
	 * @return the fdDisTranTypeCd attribute reference
	 */
	public ElementaryRangeReference getFdDisTranTypeCdReference() {
		return fdDisTranTypeCd.getReference();
	}

	/**
	 * Getter for fdDisTranTypeCd attribute.
	 * @return fdDisTranTypeCd attribute
	 */
	public String getFdDisTranTypeCd() {
		return fdDisTranTypeCd.getValue();
	}

	/**
	 * Setter for fdDisTranTypeCd attribute.
	 * @param fdDisTranTypeCd the new value of fdDisTranTypeCd
	 */
	public void setFdDisTranTypeCd(String fdDisTranTypeCd) {
		this.fdDisTranTypeCd.setValue(fdDisTranTypeCd);
	}
	/**
	 * Gets the reference for attribute fdDisTranCatCd.
	 * @return the fdDisTranCatCd attribute reference
	 */
	public ElementaryRangeReference getFdDisTranCatCdReference() {
		return fdDisTranCatCd.getReference();
	}

	/**
	 * Getter for fdDisTranCatCd attribute.
	 * @return fdDisTranCatCd attribute
	 */
	public int getFdDisTranCatCd() {
		return fdDisTranCatCd.getValue();
	}

	/**
	 * Setter for fdDisTranCatCd attribute.
	 * @param fdDisTranCatCd the new value of fdDisTranCatCd
	 */
	public void setFdDisTranCatCd(int fdDisTranCatCd) {
		this.fdDisTranCatCd.setValue(fdDisTranCatCd);
	}
	/**
	 * Gets the reference for attribute fdDiscgrpData.
	 * @return the fdDiscgrpData attribute reference
	 */
	public ElementaryRangeReference getFdDiscgrpDataReference() {
		return fdDiscgrpData.getReference();
	}

	/**
	 * Getter for fdDiscgrpData attribute.
	 * @return fdDiscgrpData attribute
	 */
	public String getFdDiscgrpData() {
		return fdDiscgrpData.getValue();
	}

	/**
	 * Setter for fdDiscgrpData attribute.
	 * @param fdDiscgrpData the new value of fdDiscgrpData
	 */
	public void setFdDiscgrpData(String fdDiscgrpData) {
		this.fdDiscgrpData.setValue(fdDiscgrpData);
	}
}
