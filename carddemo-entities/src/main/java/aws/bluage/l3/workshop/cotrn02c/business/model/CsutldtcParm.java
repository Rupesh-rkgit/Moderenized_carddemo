package aws.bluage.l3.workshop.cotrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity CsutldtcParm.
 * 
 * <p>About 'csutldtcDate' field, <br>
 * </p>
 * 
 * <p>About 'csutldtcDateFormat' field, <br>
 * </p>
 * 
 * <p>About 'csutldtcResult' field, <br>uml entity: aws.bluage.l3.workshop.cotrn02c.business.model.CsutldtcResult
 * <br></p>
 * 
 * @see RecordEntity
 */
public class CsutldtcParm extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary csutldtcDate = new Elementary(root,new AlphanumericType(10));
	private final Elementary csutldtcDateFormat = new Elementary(root,new AlphanumericType(10));
	private final Group csutldtcResult = new Group(root);
	private final Elementary csutldtcResultSevCd = new Elementary(csutldtcResult,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(csutldtcResult,new AlphanumericType(11));
	private final Elementary csutldtcResultMsgNum = new Elementary(csutldtcResult,new AlphanumericType(4));
	private final Elementary csutldtcResultMsg = new Elementary(csutldtcResult,new AlphanumericType(61));
	

	/**
	 * Instantiate a new CsutldtcParm with a default record.
	 * @param configuration the configuration
	 */
	public CsutldtcParm(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CsutldtcParm bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CsutldtcParm(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute csutldtcDate.
	 * @return the csutldtcDate attribute reference
	 */
	public ElementaryRangeReference getCsutldtcDateReference() {
		return csutldtcDate.getReference();
	}

	/**
	 * Getter for csutldtcDate attribute.
	 * @return csutldtcDate attribute
	 */
	public String getCsutldtcDate() {
		return csutldtcDate.getValue();
	}

	/**
	 * Setter for csutldtcDate attribute.
	 * @param csutldtcDate the new value of csutldtcDate
	 */
	public void setCsutldtcDate(String csutldtcDate) {
		this.csutldtcDate.setValue(csutldtcDate);
	}
	/**
	 * Gets the reference for attribute csutldtcDateFormat.
	 * @return the csutldtcDateFormat attribute reference
	 */
	public ElementaryRangeReference getCsutldtcDateFormatReference() {
		return csutldtcDateFormat.getReference();
	}

	/**
	 * Getter for csutldtcDateFormat attribute.
	 * @return csutldtcDateFormat attribute
	 */
	public String getCsutldtcDateFormat() {
		return csutldtcDateFormat.getValue();
	}

	/**
	 * Setter for csutldtcDateFormat attribute.
	 * @param csutldtcDateFormat the new value of csutldtcDateFormat
	 */
	public void setCsutldtcDateFormat(String csutldtcDateFormat) {
		this.csutldtcDateFormat.setValue(csutldtcDateFormat);
	}
	
	/**
	 * Gets the reference for attribute csutldtcResult.
	 * @return the csutldtcResult attribute reference
	 */
	public RangeReference getCsutldtcResultReference() {
		return csutldtcResult.getReference();
	}	
				
	/**
	 * Setter for csutldtcResult .
	 */
   	public void setCsutldtcResult(RangeReference reference) {
       	csutldtcResult.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute csutldtcResultSevCd.
	 * @return the csutldtcResultSevCd attribute reference
	 */
	public ElementaryRangeReference getCsutldtcResultSevCdReference() {
		return csutldtcResultSevCd.getReference();
	}

	/**
	 * Getter for csutldtcResultSevCd attribute.
	 * @return csutldtcResultSevCd attribute
	 */
	public String getCsutldtcResultSevCd() {
		return csutldtcResultSevCd.getValue();
	}

	/**
	 * Setter for csutldtcResultSevCd attribute.
	 * @param csutldtcResultSevCd the new value of csutldtcResultSevCd
	 */
	public void setCsutldtcResultSevCd(String csutldtcResultSevCd) {
		this.csutldtcResultSevCd.setValue(csutldtcResultSevCd);
	}
	/**
	 * Gets the reference for attribute csutldtcResultMsgNum.
	 * @return the csutldtcResultMsgNum attribute reference
	 */
	public ElementaryRangeReference getCsutldtcResultMsgNumReference() {
		return csutldtcResultMsgNum.getReference();
	}

	/**
	 * Getter for csutldtcResultMsgNum attribute.
	 * @return csutldtcResultMsgNum attribute
	 */
	public String getCsutldtcResultMsgNum() {
		return csutldtcResultMsgNum.getValue();
	}

	/**
	 * Setter for csutldtcResultMsgNum attribute.
	 * @param csutldtcResultMsgNum the new value of csutldtcResultMsgNum
	 */
	public void setCsutldtcResultMsgNum(String csutldtcResultMsgNum) {
		this.csutldtcResultMsgNum.setValue(csutldtcResultMsgNum);
	}
	/**
	 * Gets the reference for attribute csutldtcResultMsg.
	 * @return the csutldtcResultMsg attribute reference
	 */
	public ElementaryRangeReference getCsutldtcResultMsgReference() {
		return csutldtcResultMsg.getReference();
	}

	/**
	 * Getter for csutldtcResultMsg attribute.
	 * @return csutldtcResultMsg attribute
	 */
	public String getCsutldtcResultMsg() {
		return csutldtcResultMsg.getValue();
	}

	/**
	 * Setter for csutldtcResultMsg attribute.
	 * @param csutldtcResultMsg the new value of csutldtcResultMsg
	 */
	public void setCsutldtcResultMsg(String csutldtcResultMsg) {
		this.csutldtcResultMsg.setValue(csutldtcResultMsg);
	}
}
