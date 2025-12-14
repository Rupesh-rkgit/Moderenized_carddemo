package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity EndOfFile.
 * 
 * <p>About 'endOfFile' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class EndOfFile extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary endOfFile = new Elementary(root,new AlphanumericType(1),"N");
	

	/**
	 * Instantiate a new EndOfFile with a default record.
	 * @param configuration the configuration
	 */
	public EndOfFile(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new EndOfFile bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public EndOfFile(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
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
