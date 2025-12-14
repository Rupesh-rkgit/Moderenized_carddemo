package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity WsCounters.
 * 
 * <p>About 'wsRecordCount' field, <br>
 * </p>
 * 
 * <p>About 'wsTranidSuffix' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsCounters extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsRecordCount = new Elementary(root,new ZonedType(9, 0, false),Integer.valueOf("0"));
	private final Elementary wsTranidSuffix = new Elementary(root,new ZonedType(6, 0, false),Integer.valueOf("0"));
	

	/**
	 * Instantiate a new WsCounters with a default record.
	 * @param configuration the configuration
	 */
	public WsCounters(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsCounters bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsCounters(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsRecordCount.
	 * @return the wsRecordCount attribute reference
	 */
	public ElementaryRangeReference getWsRecordCountReference() {
		return wsRecordCount.getReference();
	}

	/**
	 * Getter for wsRecordCount attribute.
	 * @return wsRecordCount attribute
	 */
	public int getWsRecordCount() {
		return wsRecordCount.getValue();
	}

	/**
	 * Setter for wsRecordCount attribute.
	 * @param wsRecordCount the new value of wsRecordCount
	 */
	public void setWsRecordCount(int wsRecordCount) {
		this.wsRecordCount.setValue(wsRecordCount);
	}
	/**
	 * Gets the reference for attribute wsTranidSuffix.
	 * @return the wsTranidSuffix attribute reference
	 */
	public ElementaryRangeReference getWsTranidSuffixReference() {
		return wsTranidSuffix.getReference();
	}

	/**
	 * Getter for wsTranidSuffix attribute.
	 * @return wsTranidSuffix attribute
	 */
	public int getWsTranidSuffix() {
		return wsTranidSuffix.getValue();
	}

	/**
	 * Setter for wsTranidSuffix attribute.
	 * @param wsTranidSuffix the new value of wsTranidSuffix
	 */
	public void setWsTranidSuffix(int wsTranidSuffix) {
		this.wsTranidSuffix.setValue(wsTranidSuffix);
	}
}
