package aws.bluage.l3.workshop.csutldtc.business.context;
import aws.bluage.l3.workshop.csutldtc.business.model.FeedbackCode;
import aws.bluage.l3.workshop.csutldtc.business.model.LsDate;
import aws.bluage.l3.workshop.csutldtc.business.model.LsDateFormat;
import aws.bluage.l3.workshop.csutldtc.business.model.LsResult;
import aws.bluage.l3.workshop.csutldtc.business.model.OutputLillian;
import aws.bluage.l3.workshop.csutldtc.business.model.WsDateFormat;
import aws.bluage.l3.workshop.csutldtc.business.model.WsDateToTest;
import aws.bluage.l3.workshop.csutldtc.business.model.WsMessage;
import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.rt.jics.context.JicsRuntimeContext;
import com.netfective.bluage.gapwalk.rt.utils.EntityUtils;
import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier context CsutldtcContext.
 * 
 * <p>About 'onCode' field, <br>
 * </p>
 * 
 * <p>About 'onChar' field, <br>
 * </p>
 * 
 * <p>About 'wsDateToTest' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.WsDateToTest
 * <br></p>
 * 
 * <p>About 'wsDateFormat' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.WsDateFormat
 * <br></p>
 * 
 * <p>About 'outputLillian' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.OutputLillian
 * <br></p>
 * 
 * <p>About 'wsMessage' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.WsMessage
 * <br></p>
 * 
 * <p>About 'feedbackCode' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.FeedbackCode
 * <br></p>
 * 
 * <p>About 'lsDate' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.LsDate
 * <br></p>
 * 
 * <p>About 'lsDateFormat' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.LsDateFormat
 * <br></p>
 * 
 * <p>About 'lsResult' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.LsResult
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.csutldtc.business.context.CsutldtcContext")
@Lazy
@Scope("prototype")
public class CsutldtcContext extends JicsRuntimeContext {
	
	private WsDateToTest wsDateToTest;
	private WsDateFormat wsDateFormat;
	private OutputLillian outputLillian;
	private WsMessage wsMessage;
	private FeedbackCode feedbackCode;
	private LsDate lsDate;
	private LsDateFormat lsDateFormat;
	private LsResult lsResult;

	private List<RecordEntity> recordEntities;

	/**
	 * Default constructor.
	 * @param configuration the datasimplifier configuration
	 */
	public CsutldtcContext (@Qualifier("CsutldtcContextConfiguration") Configuration configuration) {
		super(configuration);
		initWorking(configuration);
		initLinkage(configuration);
		initRecordEntities();
	}
	
	/**
	 * Add count holders:
	 * 
	 * Once all entities/files have been initialized, bind the
	 * elementary references that act as count holder for 
	 * variable size arrays.
	 */
	@PostConstruct
	public void addCountHolders(){
		wsDateToTest.setVstringCharCountHolder(wsDateToTest.getVstringLength_2Reference());
		wsDateFormat.setVstringCharCountHolder(wsDateFormat.getVstringLength_3Reference());
	}
	

	/**
	 * Getter for wsDateToTest.
	 * @return the wsDateToTest
	 */
	public WsDateToTest getWsDateToTest() {
		return this.wsDateToTest;
	}

	/**
	 * Setter for wsDateToTest.
	 * @param reference the new value for wsDateToTest
	 */
	public void setWsDateToTest(RangeReference reference) {
		this.wsDateToTest.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsDateFormat.
	 * @return the wsDateFormat
	 */
	public WsDateFormat getWsDateFormat() {
		return this.wsDateFormat;
	}

	/**
	 * Setter for wsDateFormat.
	 * @param reference the new value for wsDateFormat
	 */
	public void setWsDateFormat(RangeReference reference) {
		this.wsDateFormat.setBytes(reference.getBytes());
	}

	/**
	 * Getter for outputLillian.
	 * @return the outputLillian
	 */
	public OutputLillian getOutputLillian() {
		return this.outputLillian;
	}

	/**
	 * Setter for outputLillian.
	 * @param reference the new value for outputLillian
	 */
	public void setOutputLillian(RangeReference reference) {
		this.outputLillian.setBytes(reference.getBytes());
	}

	/**
	 * Getter for wsMessage.
	 * @return the wsMessage
	 */
	public WsMessage getWsMessage() {
		return this.wsMessage;
	}

	/**
	 * Setter for wsMessage.
	 * @param reference the new value for wsMessage
	 */
	public void setWsMessage(RangeReference reference) {
		this.wsMessage.setBytes(reference.getBytes());
	}

	/**
	 * Getter for feedbackCode.
	 * @return the feedbackCode
	 */
	public FeedbackCode getFeedbackCode() {
		return this.feedbackCode;
	}

	/**
	 * Setter for feedbackCode.
	 * @param reference the new value for feedbackCode
	 */
	public void setFeedbackCode(RangeReference reference) {
		this.feedbackCode.setBytes(reference.getBytes());
	}

	/**
	 * Getter for lsDate.
	 * @return the lsDate
	 */
	public LsDate getLsDate() {
		return this.lsDate;
	}

	/**
	 * Setter for lsDate.
	 * @param reference the new value for lsDate
	 */
	public void setLsDate(RangeReference reference) {
		this.lsDate.setBytes(reference.getBytes());
	}

	/**
	 * Getter for lsDateFormat.
	 * @return the lsDateFormat
	 */
	public LsDateFormat getLsDateFormat() {
		return this.lsDateFormat;
	}

	/**
	 * Setter for lsDateFormat.
	 * @param reference the new value for lsDateFormat
	 */
	public void setLsDateFormat(RangeReference reference) {
		this.lsDateFormat.setBytes(reference.getBytes());
	}

	/**
	 * Getter for lsResult.
	 * @return the lsResult
	 */
	public LsResult getLsResult() {
		return this.lsResult;
	}

	/**
	 * Setter for lsResult.
	 * @param reference the new value for lsResult
	 */
	public void setLsResult(RangeReference reference) {
		this.lsResult.setBytes(reference.getBytes());
	}

	@Override 
	public void cleanUp(){
	}

	@Override
	protected void doReset() {
		cleanUp();
	    // reset the working
		recordEntities.stream().forEach(e -> e.reset());
	}

	
	private void initWorking(Configuration configuration) {
		wsDateToTest = new WsDateToTest(configuration);
		wsDateFormat = new WsDateFormat(configuration);
		outputLillian = new OutputLillian(configuration);
		wsMessage = new WsMessage(configuration);
		feedbackCode = new FeedbackCode(configuration);
	}
	
	private void initLinkage(Configuration configuration) {
		lsDate = new LsDate(configuration, EntityUtils.getUnlinkedRecord());
		lsDateFormat = new LsDateFormat(configuration, EntityUtils.getUnlinkedRecord());
		lsResult = new LsResult(configuration, EntityUtils.getUnlinkedRecord());
	
	}

	private void initRecordEntities() {
		recordEntities = Arrays.asList(wsDateToTest, wsDateFormat, outputLillian, wsMessage, feedbackCode);
	}

	@Override
	public String toString(){
		StringBuilder toSB = new StringBuilder("\nCsutldtcContext:\n");
		if(!this.recordEntities.isEmpty()){
			this.recordEntities.forEach(e -> toSB.append(e.getClass().getSimpleName()).append(" : [").append(e.toString()).append("]\n"));
		}
		toSB.append("LsDate : [").append(lsDate.toString()).append("]\n");
		toSB.append("LsDateFormat : [").append(lsDateFormat.toString()).append("]\n");
		toSB.append("LsResult : [").append(lsResult.toString()).append("]\n");
		return toSB.toString();
	}

}
