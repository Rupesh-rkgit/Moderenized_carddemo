package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity WsDateparmRecord.
 * 
 * <p>About 'wsStartDate' field, <br>
 * </p>
 * 
 * <p>About 'wsEndDate' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsDateparmRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsStartDate = new Elementary(root,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(1));
	private final Elementary wsEndDate = new Elementary(root,new AlphanumericType(10));
	

	/**
	 * Instantiate a new WsDateparmRecord with a default record.
	 * @param configuration the configuration
	 */
	public WsDateparmRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsDateparmRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsDateparmRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsStartDate.
	 * @return the wsStartDate attribute reference
	 */
	public ElementaryRangeReference getWsStartDateReference() {
		return wsStartDate.getReference();
	}

	/**
	 * Getter for wsStartDate attribute.
	 * @return wsStartDate attribute
	 */
	public String getWsStartDate() {
		return wsStartDate.getValue();
	}

	/**
	 * Setter for wsStartDate attribute.
	 * @param wsStartDate the new value of wsStartDate
	 */
	public void setWsStartDate(String wsStartDate) {
		this.wsStartDate.setValue(wsStartDate);
	}
	/**
	 * Gets the reference for attribute wsEndDate.
	 * @return the wsEndDate attribute reference
	 */
	public ElementaryRangeReference getWsEndDateReference() {
		return wsEndDate.getReference();
	}

	/**
	 * Getter for wsEndDate attribute.
	 * @return wsEndDate attribute
	 */
	public String getWsEndDate() {
		return wsEndDate.getValue();
	}

	/**
	 * Setter for wsEndDate attribute.
	 * @param wsEndDate the new value of wsEndDate
	 */
	public void setWsEndDate(String wsEndDate) {
		this.wsEndDate.setValue(wsEndDate);
	}
}
