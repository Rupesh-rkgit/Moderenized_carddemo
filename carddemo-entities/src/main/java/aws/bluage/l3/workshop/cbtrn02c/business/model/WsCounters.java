package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity WsCounters.
 * 
 * <p>About 'wsTransactionCount' field, <br>
 * </p>
 * 
 * <p>About 'wsRejectCount' field, <br>
 * </p>
 * 
 * <p>About 'wsTempBal' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsCounters extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsTransactionCount = new Elementary(root,new ZonedType(9, 0, false),Integer.valueOf("0"));
	private final Elementary wsRejectCount = new Elementary(root,new ZonedType(9, 0, false),Integer.valueOf("0"));
	private final Elementary wsTempBal = new Elementary(root,new ZonedType(9, 2, false, false, true));
	

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
	 * Gets the reference for attribute wsTransactionCount.
	 * @return the wsTransactionCount attribute reference
	 */
	public ElementaryRangeReference getWsTransactionCountReference() {
		return wsTransactionCount.getReference();
	}

	/**
	 * Getter for wsTransactionCount attribute.
	 * @return wsTransactionCount attribute
	 */
	public int getWsTransactionCount() {
		return wsTransactionCount.getValue();
	}

	/**
	 * Setter for wsTransactionCount attribute.
	 * @param wsTransactionCount the new value of wsTransactionCount
	 */
	public void setWsTransactionCount(int wsTransactionCount) {
		this.wsTransactionCount.setValue(wsTransactionCount);
	}
	/**
	 * Gets the reference for attribute wsRejectCount.
	 * @return the wsRejectCount attribute reference
	 */
	public ElementaryRangeReference getWsRejectCountReference() {
		return wsRejectCount.getReference();
	}

	/**
	 * Getter for wsRejectCount attribute.
	 * @return wsRejectCount attribute
	 */
	public int getWsRejectCount() {
		return wsRejectCount.getValue();
	}

	/**
	 * Setter for wsRejectCount attribute.
	 * @param wsRejectCount the new value of wsRejectCount
	 */
	public void setWsRejectCount(int wsRejectCount) {
		this.wsRejectCount.setValue(wsRejectCount);
	}
	/**
	 * Gets the reference for attribute wsTempBal.
	 * @return the wsTempBal attribute reference
	 */
	public ElementaryRangeReference getWsTempBalReference() {
		return wsTempBal.getReference();
	}

	/**
	 * Getter for wsTempBal attribute.
	 * @return wsTempBal attribute
	 */
	public BigDecimal getWsTempBal() {
		return wsTempBal.getValue();
	}

	/**
	 * Setter for wsTempBal attribute.
	 * @param wsTempBal the new value of wsTempBal
	 */
	public void setWsTempBal(BigDecimal wsTempBal) {
		this.wsTempBal.setValue(wsTempBal);
	}
}
