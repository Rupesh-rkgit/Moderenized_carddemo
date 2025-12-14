package aws.bluage.l3.workshop.cosgn00c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LogData.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *                DATA STRUCTURE FOR PROGRAM LOGGING<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'logProgramLevel' field, <br>
 * </p>
 * 
 * <p>About 'logProgramName' field, <br>
 * </p>
 * 
 * <p>About 'logProgramData' field, <br>
 * </p>
 * 
 * <p>About 'logDateData' field, <br>uml entity: aws.bluage.l3.workshop.cosgn00c.business.model.LogDateData
 * <br></p>
 * 
 * @see RecordEntity
 */
public class LogData extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary logProgramLevel = new Elementary(root,new AlphanumericType(1)," ");
	private final Elementary logProgramName = new Elementary(root,new AlphanumericType(10));
	private final Elementary logProgramData = new Elementary(root,new AlphanumericType(100));
	private final Group logDateData = new Group(root);
	private final Elementary logCurrentDate = new Elementary(logDateData,new AlphanumericType(8));
	private final Elementary logCurrentTime = new Elementary(logDateData,new AlphanumericType(8));
	

	/**
	 * Instantiate a new LogData with a default record.
	 * @param configuration the configuration
	 */
	public LogData(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LogData bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LogData(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute logProgramLevel.
	 * @return the logProgramLevel attribute reference
	 */
	public ElementaryRangeReference getLogProgramLevelReference() {
		return logProgramLevel.getReference();
	}

	/**
	 * Getter for logProgramLevel attribute.
	 * @return logProgramLevel attribute
	 */
	public String getLogProgramLevel() {
		return logProgramLevel.getValue();
	}

	/**
	 * Setter for logProgramLevel attribute.
	 * @param logProgramLevel the new value of logProgramLevel
	 */
	public void setLogProgramLevel(String logProgramLevel) {
		this.logProgramLevel.setValue(logProgramLevel);
	}
	/**
	 * Gets the reference for attribute logProgramName.
	 * @return the logProgramName attribute reference
	 */
	public ElementaryRangeReference getLogProgramNameReference() {
		return logProgramName.getReference();
	}

	/**
	 * Getter for logProgramName attribute.
	 * @return logProgramName attribute
	 */
	public String getLogProgramName() {
		return logProgramName.getValue();
	}

	/**
	 * Setter for logProgramName attribute.
	 * @param logProgramName the new value of logProgramName
	 */
	public void setLogProgramName(String logProgramName) {
		this.logProgramName.setValue(logProgramName);
	}
	/**
	 * Gets the reference for attribute logProgramData.
	 * @return the logProgramData attribute reference
	 */
	public ElementaryRangeReference getLogProgramDataReference() {
		return logProgramData.getReference();
	}

	/**
	 * Getter for logProgramData attribute.
	 * @return logProgramData attribute
	 */
	public String getLogProgramData() {
		return logProgramData.getValue();
	}

	/**
	 * Setter for logProgramData attribute.
	 * @param logProgramData the new value of logProgramData
	 */
	public void setLogProgramData(String logProgramData) {
		this.logProgramData.setValue(logProgramData);
	}
	
	/**
	 * Gets the reference for attribute logDateData.
	 * @return the logDateData attribute reference
	 */
	public RangeReference getLogDateDataReference() {
		return logDateData.getReference();
	}	
				
	/**
	 * Setter for logDateData .
	 */
   	public void setLogDateData(RangeReference reference) {
       	logDateData.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute logCurrentDate.
	 * @return the logCurrentDate attribute reference
	 */
	public ElementaryRangeReference getLogCurrentDateReference() {
		return logCurrentDate.getReference();
	}

	/**
	 * Getter for logCurrentDate attribute.
	 * @return logCurrentDate attribute
	 */
	public String getLogCurrentDate() {
		return logCurrentDate.getValue();
	}

	/**
	 * Setter for logCurrentDate attribute.
	 * @param logCurrentDate the new value of logCurrentDate
	 */
	public void setLogCurrentDate(String logCurrentDate) {
		this.logCurrentDate.setValue(logCurrentDate);
	}
	/**
	 * Gets the reference for attribute logCurrentTime.
	 * @return the logCurrentTime attribute reference
	 */
	public ElementaryRangeReference getLogCurrentTimeReference() {
		return logCurrentTime.getReference();
	}

	/**
	 * Getter for logCurrentTime attribute.
	 * @return logCurrentTime attribute
	 */
	public String getLogCurrentTime() {
		return logCurrentTime.getValue();
	}

	/**
	 * Setter for logCurrentTime attribute.
	 * @param logCurrentTime the new value of logCurrentTime
	 */
	public void setLogCurrentTime(String logCurrentTime) {
		this.logCurrentTime.setValue(logCurrentTime);
	}
}
