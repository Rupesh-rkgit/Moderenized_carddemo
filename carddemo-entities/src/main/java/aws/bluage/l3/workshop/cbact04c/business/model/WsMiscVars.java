package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity WsMiscVars.
 * 
 * <p>About 'wsLastAcctNum' field, <br>
 * </p>
 * 
 * <p>About 'wsMonthlyInt' field, <br>
 * </p>
 * 
 * <p>About 'wsTotalInt' field, <br>
 * </p>
 * 
 * <p>About 'wsFirstTime' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsMiscVars extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsLastAcctNum = new Elementary(root,new AlphanumericType(11)," ");
	private final Elementary wsMonthlyInt = new Elementary(root,new ZonedType(9, 2, false, false, true));
	private final Elementary wsTotalInt = new Elementary(root,new ZonedType(9, 2, false, false, true));
	private final Elementary wsFirstTime = new Elementary(root,new AlphanumericType(1),"Y");
	

	/**
	 * Instantiate a new WsMiscVars with a default record.
	 * @param configuration the configuration
	 */
	public WsMiscVars(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsMiscVars bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsMiscVars(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsLastAcctNum.
	 * @return the wsLastAcctNum attribute reference
	 */
	public ElementaryRangeReference getWsLastAcctNumReference() {
		return wsLastAcctNum.getReference();
	}

	/**
	 * Getter for wsLastAcctNum attribute.
	 * @return wsLastAcctNum attribute
	 */
	public String getWsLastAcctNum() {
		return wsLastAcctNum.getValue();
	}

	/**
	 * Setter for wsLastAcctNum attribute.
	 * @param wsLastAcctNum the new value of wsLastAcctNum
	 */
	public void setWsLastAcctNum(String wsLastAcctNum) {
		this.wsLastAcctNum.setValue(wsLastAcctNum);
	}
	/**
	 * Gets the reference for attribute wsMonthlyInt.
	 * @return the wsMonthlyInt attribute reference
	 */
	public ElementaryRangeReference getWsMonthlyIntReference() {
		return wsMonthlyInt.getReference();
	}

	/**
	 * Getter for wsMonthlyInt attribute.
	 * @return wsMonthlyInt attribute
	 */
	public BigDecimal getWsMonthlyInt() {
		return wsMonthlyInt.getValue();
	}

	/**
	 * Setter for wsMonthlyInt attribute.
	 * @param wsMonthlyInt the new value of wsMonthlyInt
	 */
	public void setWsMonthlyInt(BigDecimal wsMonthlyInt) {
		this.wsMonthlyInt.setValue(wsMonthlyInt);
	}
	/**
	 * Gets the reference for attribute wsTotalInt.
	 * @return the wsTotalInt attribute reference
	 */
	public ElementaryRangeReference getWsTotalIntReference() {
		return wsTotalInt.getReference();
	}

	/**
	 * Getter for wsTotalInt attribute.
	 * @return wsTotalInt attribute
	 */
	public BigDecimal getWsTotalInt() {
		return wsTotalInt.getValue();
	}

	/**
	 * Setter for wsTotalInt attribute.
	 * @param wsTotalInt the new value of wsTotalInt
	 */
	public void setWsTotalInt(BigDecimal wsTotalInt) {
		this.wsTotalInt.setValue(wsTotalInt);
	}
	/**
	 * Gets the reference for attribute wsFirstTime.
	 * @return the wsFirstTime attribute reference
	 */
	public ElementaryRangeReference getWsFirstTimeReference() {
		return wsFirstTime.getReference();
	}

	/**
	 * Getter for wsFirstTime attribute.
	 * @return wsFirstTime attribute
	 */
	public String getWsFirstTime() {
		return wsFirstTime.getValue();
	}

	/**
	 * Setter for wsFirstTime attribute.
	 * @param wsFirstTime the new value of wsFirstTime
	 */
	public void setWsFirstTime(String wsFirstTime) {
		this.wsFirstTime.setValue(wsFirstTime);
	}
}
