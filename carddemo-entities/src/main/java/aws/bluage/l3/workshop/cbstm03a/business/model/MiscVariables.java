package aws.bluage.l3.workshop.cbstm03a.business.model;

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
 * Data simplifier entity MiscVariables.
 * 
 * <p>About 'wsFlDd' field, <br>
 * </p>
 * 
 * <p>About 'wsTrnAmt' field, <br>
 * </p>
 * 
 * <p>About 'wsSaveCard' field, <br>
 * </p>
 * 
 * <p>About 'endOfFile' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class MiscVariables extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsFlDd = new Elementary(root,new AlphanumericType(8),"TRNXFILE");
	private final Elementary wsTrnAmt = new Elementary(root,new ZonedType(9, 2, false, false, true),new BigDecimal("0"));
	private final Elementary wsSaveCard = new Elementary(root,new AlphanumericType(16)," ");
	private final Elementary endOfFile = new Elementary(root,new AlphanumericType(1),"N");
	

	/**
	 * Instantiate a new MiscVariables with a default record.
	 * @param configuration the configuration
	 */
	public MiscVariables(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new MiscVariables bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public MiscVariables(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsFlDd.
	 * @return the wsFlDd attribute reference
	 */
	public ElementaryRangeReference getWsFlDdReference() {
		return wsFlDd.getReference();
	}

	/**
	 * Getter for wsFlDd attribute.
	 * @return wsFlDd attribute
	 */
	public String getWsFlDd() {
		return wsFlDd.getValue();
	}

	/**
	 * Setter for wsFlDd attribute.
	 * @param wsFlDd the new value of wsFlDd
	 */
	public void setWsFlDd(String wsFlDd) {
		this.wsFlDd.setValue(wsFlDd);
	}
	/**
	 * Gets the reference for attribute wsTrnAmt.
	 * @return the wsTrnAmt attribute reference
	 */
	public ElementaryRangeReference getWsTrnAmtReference() {
		return wsTrnAmt.getReference();
	}

	/**
	 * Getter for wsTrnAmt attribute.
	 * @return wsTrnAmt attribute
	 */
	public BigDecimal getWsTrnAmt() {
		return wsTrnAmt.getValue();
	}

	/**
	 * Setter for wsTrnAmt attribute.
	 * @param wsTrnAmt the new value of wsTrnAmt
	 */
	public void setWsTrnAmt(BigDecimal wsTrnAmt) {
		this.wsTrnAmt.setValue(wsTrnAmt);
	}
	/**
	 * Gets the reference for attribute wsSaveCard.
	 * @return the wsSaveCard attribute reference
	 */
	public ElementaryRangeReference getWsSaveCardReference() {
		return wsSaveCard.getReference();
	}

	/**
	 * Getter for wsSaveCard attribute.
	 * @return wsSaveCard attribute
	 */
	public String getWsSaveCard() {
		return wsSaveCard.getValue();
	}

	/**
	 * Setter for wsSaveCard attribute.
	 * @param wsSaveCard the new value of wsSaveCard
	 */
	public void setWsSaveCard(String wsSaveCard) {
		this.wsSaveCard.setValue(wsSaveCard);
	}
	/**
	 * Gets the reference for attribute endOfFile.
	 * @return the endOfFile attribute reference
	 */
	public ElementaryRangeReference getEndOfFileReference() {
		return endOfFile.getReference();
	}

	/**
	 * Getter for endOfFile attribute.
	 * @return endOfFile attribute
	 */
	public String getEndOfFile() {
		return endOfFile.getValue();
	}

	/**
	 * Setter for endOfFile attribute.
	 * @param endOfFile the new value of endOfFile
	 */
	public void setEndOfFile(String endOfFile) {
		this.endOfFile.setValue(endOfFile);
	}
}
