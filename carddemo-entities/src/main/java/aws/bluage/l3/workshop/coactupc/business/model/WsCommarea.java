package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity WsCommarea.
 * 
 * <p>About 'wsCommarea' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsCommarea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsCommarea = new Elementary(root,new AlphanumericType(2000));
	

	/**
	 * Instantiate a new WsCommarea with a default record.
	 * @param configuration the configuration
	 */
	public WsCommarea(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsCommarea bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsCommarea(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsCommarea.
	 * @return the wsCommarea attribute reference
	 */
	public ElementaryRangeReference getWsCommareaReference() {
		return wsCommarea.getReference();
	}

	/**
	 * Getter for wsCommarea attribute.
	 * @return wsCommarea attribute
	 */
	public String getWsCommarea() {
		return wsCommarea.getValue();
	}

	/**
	 * Setter for wsCommarea attribute.
	 * @param wsCommarea the new value of wsCommarea
	 */
	public void setWsCommarea(String wsCommarea) {
		this.wsCommarea.setValue(wsCommarea);
	}
}
