package aws.bluage.l3.workshop.csutldtc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity WsMessage.
 * 
 * <p>About 'wsSeverity' field, <br>
 * </p>
 * 
 * <p>About 'wsSeverityN' field, <br>
 * </p>
 * 
 * <p>About 'wsMsgNo' field, <br>
 * </p>
 * 
 * <p>About 'wsMsgNoN' field, <br>
 * </p>
 * 
 * <p>About 'wsResult' field, <br>
 * </p>
 * 
 * <p>About 'wsDate' field, <br>
 * </p>
 * 
 * <p>About 'wsDateFmt' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsMessage extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Union union = new Union(root);
	private final Elementary wsSeverity = new Elementary(union,new AlphanumericType(4));
	private final Elementary wsSeverityN = new Elementary(union,new ZonedType(4, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(11),"Mesg Code:");
	private final Union union1 = new Union(root);
	private final Elementary wsMsgNo = new Elementary(union1,new AlphanumericType(4));
	private final Elementary wsMsgNoN = new Elementary(union1,new ZonedType(4, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(1)," ");
	private final Elementary wsResult = new Elementary(root,new AlphanumericType(15));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(1)," ");
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(9),"TstDate:");
	private final Elementary wsDate = new Elementary(root,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(1)," ");
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(root,new AlphanumericType(10),"Mask used:");
	private final Elementary wsDateFmt = new Elementary(root,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(root,new AlphanumericType(1)," ");
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(root,new AlphanumericType(3)," ");
	

	/**
	 * Instantiate a new WsMessage with a default record.
	 * @param configuration the configuration
	 */
	public WsMessage(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsMessage bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsMessage(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsSeverity.
	 * @return the wsSeverity attribute reference
	 */
	public ElementaryRangeReference getWsSeverityReference() {
		return wsSeverity.getReference();
	}

	/**
	 * Getter for wsSeverity attribute.
	 * @return wsSeverity attribute
	 */
	public String getWsSeverity() {
		return wsSeverity.getValue();
	}

	/**
	 * Setter for wsSeverity attribute.
	 * @param wsSeverity the new value of wsSeverity
	 */
	public void setWsSeverity(String wsSeverity) {
		this.wsSeverity.setValue(wsSeverity);
	}
	/**
	 * Gets the reference for attribute wsSeverityN.
	 * @return the wsSeverityN attribute reference
	 */
	public ElementaryRangeReference getWsSeverityNReference() {
		return wsSeverityN.getReference();
	}

	/**
	 * Getter for wsSeverityN attribute.
	 * @return wsSeverityN attribute
	 */
	public int getWsSeverityN() {
		return wsSeverityN.getValue();
	}

	/**
	 * Setter for wsSeverityN attribute.
	 * @param wsSeverityN the new value of wsSeverityN
	 */
	public void setWsSeverityN(int wsSeverityN) {
		this.wsSeverityN.setValue(wsSeverityN);
	}
	/**
	 * Gets the reference for attribute wsMsgNo.
	 * @return the wsMsgNo attribute reference
	 */
	public ElementaryRangeReference getWsMsgNoReference() {
		return wsMsgNo.getReference();
	}

	/**
	 * Getter for wsMsgNo attribute.
	 * @return wsMsgNo attribute
	 */
	public String getWsMsgNo() {
		return wsMsgNo.getValue();
	}

	/**
	 * Setter for wsMsgNo attribute.
	 * @param wsMsgNo the new value of wsMsgNo
	 */
	public void setWsMsgNo(String wsMsgNo) {
		this.wsMsgNo.setValue(wsMsgNo);
	}
	/**
	 * Gets the reference for attribute wsMsgNoN.
	 * @return the wsMsgNoN attribute reference
	 */
	public ElementaryRangeReference getWsMsgNoNReference() {
		return wsMsgNoN.getReference();
	}

	/**
	 * Getter for wsMsgNoN attribute.
	 * @return wsMsgNoN attribute
	 */
	public int getWsMsgNoN() {
		return wsMsgNoN.getValue();
	}

	/**
	 * Setter for wsMsgNoN attribute.
	 * @param wsMsgNoN the new value of wsMsgNoN
	 */
	public void setWsMsgNoN(int wsMsgNoN) {
		this.wsMsgNoN.setValue(wsMsgNoN);
	}
	/**
	 * Gets the reference for attribute wsResult.
	 * @return the wsResult attribute reference
	 */
	public ElementaryRangeReference getWsResultReference() {
		return wsResult.getReference();
	}

	/**
	 * Getter for wsResult attribute.
	 * @return wsResult attribute
	 */
	public String getWsResult() {
		return wsResult.getValue();
	}

	/**
	 * Setter for wsResult attribute.
	 * @param wsResult the new value of wsResult
	 */
	public void setWsResult(String wsResult) {
		this.wsResult.setValue(wsResult);
	}
	/**
	 * Gets the reference for attribute wsDate.
	 * @return the wsDate attribute reference
	 */
	public ElementaryRangeReference getWsDateReference() {
		return wsDate.getReference();
	}

	/**
	 * Getter for wsDate attribute.
	 * @return wsDate attribute
	 */
	public String getWsDate() {
		return wsDate.getValue();
	}

	/**
	 * Setter for wsDate attribute.
	 * @param wsDate the new value of wsDate
	 */
	public void setWsDate(String wsDate) {
		this.wsDate.setValue(wsDate);
	}
	/**
	 * Gets the reference for attribute wsDateFmt.
	 * @return the wsDateFmt attribute reference
	 */
	public ElementaryRangeReference getWsDateFmtReference() {
		return wsDateFmt.getReference();
	}

	/**
	 * Getter for wsDateFmt attribute.
	 * @return wsDateFmt attribute
	 */
	public String getWsDateFmt() {
		return wsDateFmt.getValue();
	}

	/**
	 * Setter for wsDateFmt attribute.
	 * @param wsDateFmt the new value of wsDateFmt
	 */
	public void setWsDateFmt(String wsDateFmt) {
		this.wsDateFmt.setValue(wsDateFmt);
	}
}
