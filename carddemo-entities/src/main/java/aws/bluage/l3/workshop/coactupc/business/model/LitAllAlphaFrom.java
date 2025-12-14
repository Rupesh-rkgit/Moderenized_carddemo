package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity LitAllAlphaFrom.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:57 CDT<br>
 *  <br>
 *  ****************************************************************<br>
 *   Variables for use in INSPECT statements<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'litAllAlphaFrom' field, <br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:57 CDT<br>
 *  <br>
 *  ****************************************************************<br>
 *   Variables for use in INSPECT statements<br>
 *  ****************************************************************<br></p>
 * 
 * @see RecordEntity
 */
public class LitAllAlphaFrom extends RecordEntity {

	private final Group root = new Group(getData()); 
	
	/**
	 * 
	 * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:57 CDT
	 * 
	 * ****************************************************************
	 * Variables for use in INSPECT statements
	 * ****************************************************************
	 */
	private final Elementary litAllAlphaFrom = new Elementary(root,new AlphanumericType(52)," ");
	

	/**
	 * Instantiate a new LitAllAlphaFrom with a default record.
	 * @param configuration the configuration
	 */
	public LitAllAlphaFrom(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LitAllAlphaFrom bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LitAllAlphaFrom(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute litAllAlphaFrom.
	 * @return the litAllAlphaFrom attribute reference
	 */
	public ElementaryRangeReference getLitAllAlphaFromReference() {
		return litAllAlphaFrom.getReference();
	}

	/**
	 * Getter for litAllAlphaFrom attribute.
	 * @return litAllAlphaFrom attribute
	 */
	public String getLitAllAlphaFrom() {
		return litAllAlphaFrom.getValue();
	}

	/**
	 * Setter for litAllAlphaFrom attribute.
	 * @param litAllAlphaFrom the new value of litAllAlphaFrom
	 */
	public void setLitAllAlphaFrom(String litAllAlphaFrom) {
		this.litAllAlphaFrom.setValue(litAllAlphaFrom);
	}
}
