package aws.bluage.l3.workshop.cbtrn03c.business.model;

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
 * Data simplifier file TrancatgFile.
 * 
 * <p>About 'fdTranCatRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.FdTranCatRecord
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn03c.business.model.TrancatgFile")
@Lazy
@Scope("prototype")
public class TrancatgFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdTranCatRecord = new Group(root);
	private final Group fdTranCatKey = new Group(fdTranCatRecord);
	private final Elementary fdTranTypeCd = new Elementary(fdTranCatKey,new AlphanumericType(2));
	private final Elementary fdTranCatCd = new Elementary(fdTranCatKey,new ZonedType(4, 0, false));
	private final Elementary fdTranCatData = new Elementary(fdTranCatRecord,new AlphanumericType(54));
	 
	/**
	 * Instantiate a new TrancatgFile.
	 * @param configuration the configuration
	 */
	public TrancatgFile(@Qualifier("Cbtrn03cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdTranCatRecord.
	 * @return the fdTranCatRecord attribute reference
	 */
	public RangeReference getFdTranCatRecordReference() {
		return fdTranCatRecord.getReference();
	}	
				
	/**
	 * Setter for fdTranCatRecord .
	 */
   	public void setFdTranCatRecord(RangeReference reference) {
       	fdTranCatRecord.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute fdTranCatKey.
	 * @return the fdTranCatKey attribute reference
	 */
	public RangeReference getFdTranCatKeyReference() {
		return fdTranCatKey.getReference();
	}	
				
	/**
	 * Setter for fdTranCatKey .
	 */
   	public void setFdTranCatKey(RangeReference reference) {
       	fdTranCatKey.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdTranTypeCd.
	 * @return the fdTranTypeCd attribute reference
	 */
	public ElementaryRangeReference getFdTranTypeCdReference() {
		return fdTranTypeCd.getReference();
	}

	/**
	 * Getter for fdTranTypeCd attribute.
	 * @return fdTranTypeCd attribute
	 */
	public String getFdTranTypeCd() {
		return fdTranTypeCd.getValue();
	}

	/**
	 * Setter for fdTranTypeCd attribute.
	 * @param fdTranTypeCd the new value of fdTranTypeCd
	 */
	public void setFdTranTypeCd(String fdTranTypeCd) {
		this.fdTranTypeCd.setValue(fdTranTypeCd);
	}
	/**
	 * Gets the reference for attribute fdTranCatCd.
	 * @return the fdTranCatCd attribute reference
	 */
	public ElementaryRangeReference getFdTranCatCdReference() {
		return fdTranCatCd.getReference();
	}

	/**
	 * Getter for fdTranCatCd attribute.
	 * @return fdTranCatCd attribute
	 */
	public int getFdTranCatCd() {
		return fdTranCatCd.getValue();
	}

	/**
	 * Setter for fdTranCatCd attribute.
	 * @param fdTranCatCd the new value of fdTranCatCd
	 */
	public void setFdTranCatCd(int fdTranCatCd) {
		this.fdTranCatCd.setValue(fdTranCatCd);
	}
	/**
	 * Gets the reference for attribute fdTranCatData.
	 * @return the fdTranCatData attribute reference
	 */
	public ElementaryRangeReference getFdTranCatDataReference() {
		return fdTranCatData.getReference();
	}

	/**
	 * Getter for fdTranCatData attribute.
	 * @return fdTranCatData attribute
	 */
	public String getFdTranCatData() {
		return fdTranCatData.getValue();
	}

	/**
	 * Setter for fdTranCatData attribute.
	 * @param fdTranCatData the new value of fdTranCatData
	 */
	public void setFdTranCatData(String fdTranCatData) {
		this.fdTranCatData.setValue(fdTranCatData);
	}
}
