package aws.bluage.l3.workshop.csutldtc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity FeedbackCode.
<pre>
 * 
 * Legacy Documentation:<br>
 *   CEEDAYS API FEEDBACK CODE<br>
</pre>
 * 
 * <p>About 'feedbackTokenValue' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.FeedbackTokenValue
 * <br></p>
 * 
 * <p>About 'iSInfo' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class FeedbackCode extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group feedbackTokenValue = new Group(root);
	private final ConditionName fcInvalidDate=new ConditionName(feedbackTokenValue,hexBytes("0000000000000000"));
	private final ConditionName fcInsufficientData=new ConditionName(feedbackTokenValue,hexBytes("000309CB59C3C5C5"));
	private final ConditionName fcBadDateValue=new ConditionName(feedbackTokenValue,hexBytes("000309CC59C3C5C5"));
	private final ConditionName fcInvalidEra=new ConditionName(feedbackTokenValue,hexBytes("000309CD59C3C5C5"));
	private final ConditionName fcUnsuppRange=new ConditionName(feedbackTokenValue,hexBytes("000309D159C3C5C5"));
	private final ConditionName fcInvalidMonth=new ConditionName(feedbackTokenValue,hexBytes("000309D559C3C5C5"));
	private final ConditionName fcBadPicString=new ConditionName(feedbackTokenValue,hexBytes("000309D659C3C5C5"));
	private final ConditionName fcNonNumericData=new ConditionName(feedbackTokenValue,hexBytes("000309D859C3C5C5"));
	private final ConditionName fcYearInEraZero=new ConditionName(feedbackTokenValue,hexBytes("000309D959C3C5C5"));
	private final Union union = new Union(feedbackTokenValue);
	private final Group case1ConditionId = new Group(union);
	private final Elementary severity = new Elementary(case1ConditionId,new BinaryType(4, 0, "STD", false, false, true));
	private final Elementary msgNo = new Elementary(case1ConditionId,new BinaryType(4, 0, "STD", false, false, true));
	private final Group case2ConditionId = new Group(union);
	private final Elementary classCode = new Elementary(case2ConditionId,new BinaryType(4, 0, "STD", false, false, true));
	private final Elementary causeCode = new Elementary(case2ConditionId,new BinaryType(4, 0, "STD", false, false, true));
	private final Elementary caseSevCtl = new Elementary(feedbackTokenValue,new AlphanumericType(1));
	private final Elementary facilityId = new Elementary(feedbackTokenValue,new AlphanumericType(3));
	private final Elementary iSInfo = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true));
	

	/**
	 * Instantiate a new FeedbackCode with a default record.
	 * @param configuration the configuration
	 */
	public FeedbackCode(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new FeedbackCode bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public FeedbackCode(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute feedbackTokenValue.
	 * @return the feedbackTokenValue attribute reference
	 */
	public RangeReference getFeedbackTokenValueReference() {
		return feedbackTokenValue.getReference();
	}	
				
	/**
	 * Setter for feedbackTokenValue .
	 */
   	public void setFeedbackTokenValue(RangeReference reference) {
       	feedbackTokenValue.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fcInvalidDate.
	 * @return the fcInvalidDate attribute reference
	 */
	public ConditionReference getFcInvalidDateReference() {
		return feedbackTokenValue.getCondition(fcInvalidDate);	
	}

	/**
	 * Getter for fcInvalidDate attribute.
	 * @return fcInvalidDate attribute
	 */
	public boolean isFcInvalidDate() {
		return getFcInvalidDateReference().getValue();	
	}

	/**
	 * Setter for fcInvalidDate attribute.
	 * @param fcInvalidDate the new value of fcInvalidDate
	 */
	public void setFcInvalidDate(boolean fcInvalidDate) {
		getFcInvalidDateReference().setValue(fcInvalidDate);	
	}
	/**
	 * Gets the reference for attribute fcInsufficientData.
	 * @return the fcInsufficientData attribute reference
	 */
	public ConditionReference getFcInsufficientDataReference() {
		return feedbackTokenValue.getCondition(fcInsufficientData);	
	}

	/**
	 * Getter for fcInsufficientData attribute.
	 * @return fcInsufficientData attribute
	 */
	public boolean isFcInsufficientData() {
		return getFcInsufficientDataReference().getValue();	
	}

	/**
	 * Setter for fcInsufficientData attribute.
	 * @param fcInsufficientData the new value of fcInsufficientData
	 */
	public void setFcInsufficientData(boolean fcInsufficientData) {
		getFcInsufficientDataReference().setValue(fcInsufficientData);	
	}
	/**
	 * Gets the reference for attribute fcBadDateValue.
	 * @return the fcBadDateValue attribute reference
	 */
	public ConditionReference getFcBadDateValueReference() {
		return feedbackTokenValue.getCondition(fcBadDateValue);	
	}

	/**
	 * Getter for fcBadDateValue attribute.
	 * @return fcBadDateValue attribute
	 */
	public boolean isFcBadDateValue() {
		return getFcBadDateValueReference().getValue();	
	}

	/**
	 * Setter for fcBadDateValue attribute.
	 * @param fcBadDateValue the new value of fcBadDateValue
	 */
	public void setFcBadDateValue(boolean fcBadDateValue) {
		getFcBadDateValueReference().setValue(fcBadDateValue);	
	}
	/**
	 * Gets the reference for attribute fcInvalidEra.
	 * @return the fcInvalidEra attribute reference
	 */
	public ConditionReference getFcInvalidEraReference() {
		return feedbackTokenValue.getCondition(fcInvalidEra);	
	}

	/**
	 * Getter for fcInvalidEra attribute.
	 * @return fcInvalidEra attribute
	 */
	public boolean isFcInvalidEra() {
		return getFcInvalidEraReference().getValue();	
	}

	/**
	 * Setter for fcInvalidEra attribute.
	 * @param fcInvalidEra the new value of fcInvalidEra
	 */
	public void setFcInvalidEra(boolean fcInvalidEra) {
		getFcInvalidEraReference().setValue(fcInvalidEra);	
	}
	/**
	 * Gets the reference for attribute fcUnsuppRange.
	 * @return the fcUnsuppRange attribute reference
	 */
	public ConditionReference getFcUnsuppRangeReference() {
		return feedbackTokenValue.getCondition(fcUnsuppRange);	
	}

	/**
	 * Getter for fcUnsuppRange attribute.
	 * @return fcUnsuppRange attribute
	 */
	public boolean isFcUnsuppRange() {
		return getFcUnsuppRangeReference().getValue();	
	}

	/**
	 * Setter for fcUnsuppRange attribute.
	 * @param fcUnsuppRange the new value of fcUnsuppRange
	 */
	public void setFcUnsuppRange(boolean fcUnsuppRange) {
		getFcUnsuppRangeReference().setValue(fcUnsuppRange);	
	}
	/**
	 * Gets the reference for attribute fcInvalidMonth.
	 * @return the fcInvalidMonth attribute reference
	 */
	public ConditionReference getFcInvalidMonthReference() {
		return feedbackTokenValue.getCondition(fcInvalidMonth);	
	}

	/**
	 * Getter for fcInvalidMonth attribute.
	 * @return fcInvalidMonth attribute
	 */
	public boolean isFcInvalidMonth() {
		return getFcInvalidMonthReference().getValue();	
	}

	/**
	 * Setter for fcInvalidMonth attribute.
	 * @param fcInvalidMonth the new value of fcInvalidMonth
	 */
	public void setFcInvalidMonth(boolean fcInvalidMonth) {
		getFcInvalidMonthReference().setValue(fcInvalidMonth);	
	}
	/**
	 * Gets the reference for attribute fcBadPicString.
	 * @return the fcBadPicString attribute reference
	 */
	public ConditionReference getFcBadPicStringReference() {
		return feedbackTokenValue.getCondition(fcBadPicString);	
	}

	/**
	 * Getter for fcBadPicString attribute.
	 * @return fcBadPicString attribute
	 */
	public boolean isFcBadPicString() {
		return getFcBadPicStringReference().getValue();	
	}

	/**
	 * Setter for fcBadPicString attribute.
	 * @param fcBadPicString the new value of fcBadPicString
	 */
	public void setFcBadPicString(boolean fcBadPicString) {
		getFcBadPicStringReference().setValue(fcBadPicString);	
	}
	/**
	 * Gets the reference for attribute fcNonNumericData.
	 * @return the fcNonNumericData attribute reference
	 */
	public ConditionReference getFcNonNumericDataReference() {
		return feedbackTokenValue.getCondition(fcNonNumericData);	
	}

	/**
	 * Getter for fcNonNumericData attribute.
	 * @return fcNonNumericData attribute
	 */
	public boolean isFcNonNumericData() {
		return getFcNonNumericDataReference().getValue();	
	}

	/**
	 * Setter for fcNonNumericData attribute.
	 * @param fcNonNumericData the new value of fcNonNumericData
	 */
	public void setFcNonNumericData(boolean fcNonNumericData) {
		getFcNonNumericDataReference().setValue(fcNonNumericData);	
	}
	/**
	 * Gets the reference for attribute fcYearInEraZero.
	 * @return the fcYearInEraZero attribute reference
	 */
	public ConditionReference getFcYearInEraZeroReference() {
		return feedbackTokenValue.getCondition(fcYearInEraZero);	
	}

	/**
	 * Getter for fcYearInEraZero attribute.
	 * @return fcYearInEraZero attribute
	 */
	public boolean isFcYearInEraZero() {
		return getFcYearInEraZeroReference().getValue();	
	}

	/**
	 * Setter for fcYearInEraZero attribute.
	 * @param fcYearInEraZero the new value of fcYearInEraZero
	 */
	public void setFcYearInEraZero(boolean fcYearInEraZero) {
		getFcYearInEraZeroReference().setValue(fcYearInEraZero);	
	}
	
	/**
	 * Gets the reference for attribute case1ConditionId.
	 * @return the case1ConditionId attribute reference
	 */
	public RangeReference getCase1ConditionIdReference() {
		return case1ConditionId.getReference();
	}	
				
	/**
	 * Setter for case1ConditionId .
	 */
   	public void setCase1ConditionId(RangeReference reference) {
       	case1ConditionId.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute severity.
	 * @return the severity attribute reference
	 */
	public ElementaryRangeReference getSeverityReference() {
		return severity.getReference();
	}

	/**
	 * Getter for severity attribute.
	 * @return severity attribute
	 */
	public int getSeverity() {
		return severity.getValue();
	}

	/**
	 * Setter for severity attribute.
	 * @param severity the new value of severity
	 */
	public void setSeverity(int severity) {
		this.severity.setValue(severity);
	}
	/**
	 * Gets the reference for attribute msgNo.
	 * @return the msgNo attribute reference
	 */
	public ElementaryRangeReference getMsgNoReference() {
		return msgNo.getReference();
	}

	/**
	 * Getter for msgNo attribute.
	 * @return msgNo attribute
	 */
	public int getMsgNo() {
		return msgNo.getValue();
	}

	/**
	 * Setter for msgNo attribute.
	 * @param msgNo the new value of msgNo
	 */
	public void setMsgNo(int msgNo) {
		this.msgNo.setValue(msgNo);
	}
	
	/**
	 * Gets the reference for attribute case2ConditionId.
	 * @return the case2ConditionId attribute reference
	 */
	public RangeReference getCase2ConditionIdReference() {
		return case2ConditionId.getReference();
	}	
				
	/**
	 * Setter for case2ConditionId .
	 */
   	public void setCase2ConditionId(RangeReference reference) {
       	case2ConditionId.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute classCode.
	 * @return the classCode attribute reference
	 */
	public ElementaryRangeReference getClassCodeReference() {
		return classCode.getReference();
	}

	/**
	 * Getter for classCode attribute.
	 * @return classCode attribute
	 */
	public int getClassCode() {
		return classCode.getValue();
	}

	/**
	 * Setter for classCode attribute.
	 * @param classCode the new value of classCode
	 */
	public void setClassCode(int classCode) {
		this.classCode.setValue(classCode);
	}
	/**
	 * Gets the reference for attribute causeCode.
	 * @return the causeCode attribute reference
	 */
	public ElementaryRangeReference getCauseCodeReference() {
		return causeCode.getReference();
	}

	/**
	 * Getter for causeCode attribute.
	 * @return causeCode attribute
	 */
	public int getCauseCode() {
		return causeCode.getValue();
	}

	/**
	 * Setter for causeCode attribute.
	 * @param causeCode the new value of causeCode
	 */
	public void setCauseCode(int causeCode) {
		this.causeCode.setValue(causeCode);
	}
	/**
	 * Gets the reference for attribute caseSevCtl.
	 * @return the caseSevCtl attribute reference
	 */
	public ElementaryRangeReference getCaseSevCtlReference() {
		return caseSevCtl.getReference();
	}

	/**
	 * Getter for caseSevCtl attribute.
	 * @return caseSevCtl attribute
	 */
	public String getCaseSevCtl() {
		return caseSevCtl.getValue();
	}

	/**
	 * Setter for caseSevCtl attribute.
	 * @param caseSevCtl the new value of caseSevCtl
	 */
	public void setCaseSevCtl(String caseSevCtl) {
		this.caseSevCtl.setValue(caseSevCtl);
	}
	/**
	 * Gets the reference for attribute facilityId.
	 * @return the facilityId attribute reference
	 */
	public ElementaryRangeReference getFacilityIdReference() {
		return facilityId.getReference();
	}

	/**
	 * Getter for facilityId attribute.
	 * @return facilityId attribute
	 */
	public String getFacilityId() {
		return facilityId.getValue();
	}

	/**
	 * Setter for facilityId attribute.
	 * @param facilityId the new value of facilityId
	 */
	public void setFacilityId(String facilityId) {
		this.facilityId.setValue(facilityId);
	}
	/**
	 * Gets the reference for attribute iSInfo.
	 * @return the iSInfo attribute reference
	 */
	public ElementaryRangeReference getISInfoReference() {
		return iSInfo.getReference();
	}

	/**
	 * Getter for iSInfo attribute.
	 * @return iSInfo attribute
	 */
	public int getISInfo() {
		return iSInfo.getValue();
	}

	/**
	 * Setter for iSInfo attribute.
	 * @param iSInfo the new value of iSInfo
	 */
	public void setISInfo(int iSInfo) {
		this.iSInfo.setValue(iSInfo);
	}
}
