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
 * Data simplifier file TrnxFile.
 * 
 * <p>About 'fdTrnxfileRec' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03b.business.model.FdTrnxfileRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbstm03b.business.model.TrnxFile")
@Lazy
@Scope("prototype")
public class TrnxFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdTrnxfileRec = new Group(root);
	private final Group fdTrnxsId = new Group(fdTrnxfileRec);
	private final Elementary fdTrnxCard = new Elementary(fdTrnxsId,new AlphanumericType(16));
	private final Elementary fdTrnxId = new Elementary(fdTrnxsId,new AlphanumericType(16));
	private final Elementary fdAcctData = new Elementary(fdTrnxfileRec,new AlphanumericType(318));
	 
	/**
	 * Instantiate a new TrnxFile.
	 * @param configuration the configuration
	 */
	public TrnxFile(@Qualifier("Cbstm03bContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdTrnxfileRec.
	 * @return the fdTrnxfileRec attribute reference
	 */
	public RangeReference getFdTrnxfileRecReference() {
		return fdTrnxfileRec.getReference();
	}	
				
	/**
	 * Setter for fdTrnxfileRec .
	 */
   	public void setFdTrnxfileRec(RangeReference reference) {
       	fdTrnxfileRec.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute fdTrnxsId.
	 * @return the fdTrnxsId attribute reference
	 */
	public RangeReference getFdTrnxsIdReference() {
		return fdTrnxsId.getReference();
	}	
				
	/**
	 * Setter for fdTrnxsId .
	 */
   	public void setFdTrnxsId(RangeReference reference) {
       	fdTrnxsId.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdTrnxCard.
	 * @return the fdTrnxCard attribute reference
	 */
	public ElementaryRangeReference getFdTrnxCardReference() {
		return fdTrnxCard.getReference();
	}

	/**
	 * Getter for fdTrnxCard attribute.
	 * @return fdTrnxCard attribute
	 */
	public String getFdTrnxCard() {
		return fdTrnxCard.getValue();
	}

	/**
	 * Setter for fdTrnxCard attribute.
	 * @param fdTrnxCard the new value of fdTrnxCard
	 */
	public void setFdTrnxCard(String fdTrnxCard) {
		this.fdTrnxCard.setValue(fdTrnxCard);
	}
	/**
	 * Gets the reference for attribute fdTrnxId.
	 * @return the fdTrnxId attribute reference
	 */
	public ElementaryRangeReference getFdTrnxIdReference() {
		return fdTrnxId.getReference();
	}

	/**
	 * Getter for fdTrnxId attribute.
	 * @return fdTrnxId attribute
	 */
	public String getFdTrnxId() {
		return fdTrnxId.getValue();
	}

	/**
	 * Setter for fdTrnxId attribute.
	 * @param fdTrnxId the new value of fdTrnxId
	 */
	public void setFdTrnxId(String fdTrnxId) {
		this.fdTrnxId.setValue(fdTrnxId);
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
