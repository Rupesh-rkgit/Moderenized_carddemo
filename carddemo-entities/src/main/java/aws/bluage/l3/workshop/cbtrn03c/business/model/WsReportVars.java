package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity WsReportVars.
 * 
 * <p>About 'wsFirstTime' field, <br>
 * </p>
 * 
 * <p>About 'wsLineCounter' field, <br>
 * </p>
 * 
 * <p>About 'wsPageSize' field, <br>
 * </p>
 * 
 * <p>About 'wsBlankLine' field, <br>
 * </p>
 * 
 * <p>About 'wsPageTotal' field, <br>
 * </p>
 * 
 * <p>About 'wsAccountTotal' field, <br>
 * </p>
 * 
 * <p>About 'wsGrandTotal' field, <br>
 * </p>
 * 
 * <p>About 'wsCurrCardNum' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsReportVars extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsFirstTime = new Elementary(root,new AlphanumericType(1),"Y");
	private final Elementary wsLineCounter = new Elementary(root,new PackedType(9, 0, false),Integer.valueOf("0"));
	private final Elementary wsPageSize = new Elementary(root,new PackedType(3, 0, false),Short.valueOf("20"));
	private final Elementary wsBlankLine = new Elementary(root,new AlphanumericType(133)," ");
	private final Elementary wsPageTotal = new Elementary(root,new ZonedType(9, 2, false, false, true),new BigDecimal("0"));
	private final Elementary wsAccountTotal = new Elementary(root,new ZonedType(9, 2, false, false, true),new BigDecimal("0"));
	private final Elementary wsGrandTotal = new Elementary(root,new ZonedType(9, 2, false, false, true),new BigDecimal("0"));
	private final Elementary wsCurrCardNum = new Elementary(root,new AlphanumericType(16)," ");
	

	/**
	 * Instantiate a new WsReportVars with a default record.
	 * @param configuration the configuration
	 */
	public WsReportVars(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsReportVars bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsReportVars(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
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
	/**
	 * Gets the reference for attribute wsLineCounter.
	 * @return the wsLineCounter attribute reference
	 */
	public ElementaryRangeReference getWsLineCounterReference() {
		return wsLineCounter.getReference();
	}

	/**
	 * Getter for wsLineCounter attribute.
	 * @return wsLineCounter attribute
	 */
	public int getWsLineCounter() {
		return wsLineCounter.getValue();
	}

	/**
	 * Setter for wsLineCounter attribute.
	 * @param wsLineCounter the new value of wsLineCounter
	 */
	public void setWsLineCounter(int wsLineCounter) {
		this.wsLineCounter.setValue(wsLineCounter);
	}
	/**
	 * Gets the reference for attribute wsPageSize.
	 * @return the wsPageSize attribute reference
	 */
	public ElementaryRangeReference getWsPageSizeReference() {
		return wsPageSize.getReference();
	}

	/**
	 * Getter for wsPageSize attribute.
	 * @return wsPageSize attribute
	 */
	public int getWsPageSize() {
		return wsPageSize.getValue();
	}

	/**
	 * Setter for wsPageSize attribute.
	 * @param wsPageSize the new value of wsPageSize
	 */
	public void setWsPageSize(int wsPageSize) {
		this.wsPageSize.setValue(wsPageSize);
	}
	/**
	 * Gets the reference for attribute wsBlankLine.
	 * @return the wsBlankLine attribute reference
	 */
	public ElementaryRangeReference getWsBlankLineReference() {
		return wsBlankLine.getReference();
	}

	/**
	 * Getter for wsBlankLine attribute.
	 * @return wsBlankLine attribute
	 */
	public String getWsBlankLine() {
		return wsBlankLine.getValue();
	}

	/**
	 * Setter for wsBlankLine attribute.
	 * @param wsBlankLine the new value of wsBlankLine
	 */
	public void setWsBlankLine(String wsBlankLine) {
		this.wsBlankLine.setValue(wsBlankLine);
	}
	/**
	 * Gets the reference for attribute wsPageTotal.
	 * @return the wsPageTotal attribute reference
	 */
	public ElementaryRangeReference getWsPageTotalReference() {
		return wsPageTotal.getReference();
	}

	/**
	 * Getter for wsPageTotal attribute.
	 * @return wsPageTotal attribute
	 */
	public BigDecimal getWsPageTotal() {
		return wsPageTotal.getValue();
	}

	/**
	 * Setter for wsPageTotal attribute.
	 * @param wsPageTotal the new value of wsPageTotal
	 */
	public void setWsPageTotal(BigDecimal wsPageTotal) {
		this.wsPageTotal.setValue(wsPageTotal);
	}
	/**
	 * Gets the reference for attribute wsAccountTotal.
	 * @return the wsAccountTotal attribute reference
	 */
	public ElementaryRangeReference getWsAccountTotalReference() {
		return wsAccountTotal.getReference();
	}

	/**
	 * Getter for wsAccountTotal attribute.
	 * @return wsAccountTotal attribute
	 */
	public BigDecimal getWsAccountTotal() {
		return wsAccountTotal.getValue();
	}

	/**
	 * Setter for wsAccountTotal attribute.
	 * @param wsAccountTotal the new value of wsAccountTotal
	 */
	public void setWsAccountTotal(BigDecimal wsAccountTotal) {
		this.wsAccountTotal.setValue(wsAccountTotal);
	}
	/**
	 * Gets the reference for attribute wsGrandTotal.
	 * @return the wsGrandTotal attribute reference
	 */
	public ElementaryRangeReference getWsGrandTotalReference() {
		return wsGrandTotal.getReference();
	}

	/**
	 * Getter for wsGrandTotal attribute.
	 * @return wsGrandTotal attribute
	 */
	public BigDecimal getWsGrandTotal() {
		return wsGrandTotal.getValue();
	}

	/**
	 * Setter for wsGrandTotal attribute.
	 * @param wsGrandTotal the new value of wsGrandTotal
	 */
	public void setWsGrandTotal(BigDecimal wsGrandTotal) {
		this.wsGrandTotal.setValue(wsGrandTotal);
	}
	/**
	 * Gets the reference for attribute wsCurrCardNum.
	 * @return the wsCurrCardNum attribute reference
	 */
	public ElementaryRangeReference getWsCurrCardNumReference() {
		return wsCurrCardNum.getReference();
	}

	/**
	 * Getter for wsCurrCardNum attribute.
	 * @return wsCurrCardNum attribute
	 */
	public String getWsCurrCardNum() {
		return wsCurrCardNum.getValue();
	}

	/**
	 * Setter for wsCurrCardNum attribute.
	 * @param wsCurrCardNum the new value of wsCurrCardNum
	 */
	public void setWsCurrCardNum(String wsCurrCardNum) {
		this.wsCurrCardNum.setValue(wsCurrCardNum);
	}
}
