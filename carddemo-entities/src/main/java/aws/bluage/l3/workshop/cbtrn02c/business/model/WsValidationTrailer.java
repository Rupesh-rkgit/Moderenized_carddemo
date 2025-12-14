package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity WsValidationTrailer.
 * 
 * <p>About 'wsValidationFailReason' field, <br>
 * </p>
 * 
 * <p>About 'wsValidationFailReasonDesc' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsValidationTrailer extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsValidationFailReason = new Elementary(root,new ZonedType(4, 0, false));
	private final Elementary wsValidationFailReasonDesc = new Elementary(root,new AlphanumericType(76));
	

	/**
	 * Instantiate a new WsValidationTrailer with a default record.
	 * @param configuration the configuration
	 */
	public WsValidationTrailer(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsValidationTrailer bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsValidationTrailer(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsValidationFailReason.
	 * @return the wsValidationFailReason attribute reference
	 */
	public ElementaryRangeReference getWsValidationFailReasonReference() {
		return wsValidationFailReason.getReference();
	}

	/**
	 * Getter for wsValidationFailReason attribute.
	 * @return wsValidationFailReason attribute
	 */
	public int getWsValidationFailReason() {
		return wsValidationFailReason.getValue();
	}

	/**
	 * Setter for wsValidationFailReason attribute.
	 * @param wsValidationFailReason the new value of wsValidationFailReason
	 */
	public void setWsValidationFailReason(int wsValidationFailReason) {
		this.wsValidationFailReason.setValue(wsValidationFailReason);
	}
	/**
	 * Gets the reference for attribute wsValidationFailReasonDesc.
	 * @return the wsValidationFailReasonDesc attribute reference
	 */
	public ElementaryRangeReference getWsValidationFailReasonDescReference() {
		return wsValidationFailReasonDesc.getReference();
	}

	/**
	 * Getter for wsValidationFailReasonDesc attribute.
	 * @return wsValidationFailReasonDesc attribute
	 */
	public String getWsValidationFailReasonDesc() {
		return wsValidationFailReasonDesc.getValue();
	}

	/**
	 * Setter for wsValidationFailReasonDesc attribute.
	 * @param wsValidationFailReasonDesc the new value of wsValidationFailReasonDesc
	 */
	public void setWsValidationFailReasonDesc(String wsValidationFailReasonDesc) {
		this.wsValidationFailReasonDesc.setValue(wsValidationFailReasonDesc);
	}
}
