package aws.bluage.l3.workshop.csutldtc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity OutputLillian.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ***  OUTPUT from CEEDAYS - LILLIAN DATE FORMAT<br>
</pre>
 * 
 * <p>About 'outputLillian' field, <br>
 *  ***  OUTPUT from CEEDAYS - LILLIAN DATE FORMAT<br></p>
 * 
 * @see RecordEntity
 */
public class OutputLillian extends RecordEntity {

	private final Group root = new Group(getData()); 
	
	/**
	 * ***  OUTPUT from CEEDAYS - LILLIAN DATE FORMAT
	 */
	private final Elementary outputLillian = new Elementary(root,new BinaryType(9, 0, "STD", false, false, true));
	

	/**
	 * Instantiate a new OutputLillian with a default record.
	 * @param configuration the configuration
	 */
	public OutputLillian(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new OutputLillian bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public OutputLillian(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute outputLillian.
	 * @return the outputLillian attribute reference
	 */
	public ElementaryRangeReference getOutputLillianReference() {
		return outputLillian.getReference();
	}

	/**
	 * Getter for outputLillian attribute.
	 * @return outputLillian attribute
	 */
	public int getOutputLillian() {
		return outputLillian.getValue();
	}

	/**
	 * Setter for outputLillian attribute.
	 * @param outputLillian the new value of outputLillian
	 */
	public void setOutputLillian(int outputLillian) {
		this.outputLillian.setValue(outputLillian);
	}
}
