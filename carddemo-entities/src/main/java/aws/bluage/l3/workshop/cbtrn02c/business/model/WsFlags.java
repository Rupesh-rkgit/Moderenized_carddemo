package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity WsFlags.
 * 
 * <p>About 'wsCreateTrancatRec' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsFlags extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsCreateTrancatRec = new Elementary(root,new AlphanumericType(1),"N");
	

	/**
	 * Instantiate a new WsFlags with a default record.
	 * @param configuration the configuration
	 */
	public WsFlags(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsFlags bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsFlags(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsCreateTrancatRec.
	 * @return the wsCreateTrancatRec attribute reference
	 */
	public ElementaryRangeReference getWsCreateTrancatRecReference() {
		return wsCreateTrancatRec.getReference();
	}

	/**
	 * Getter for wsCreateTrancatRec attribute.
	 * @return wsCreateTrancatRec attribute
	 */
	public String getWsCreateTrancatRec() {
		return wsCreateTrancatRec.getValue();
	}

	/**
	 * Setter for wsCreateTrancatRec attribute.
	 * @param wsCreateTrancatRec the new value of wsCreateTrancatRec
	 */
	public void setWsCreateTrancatRec(String wsCreateTrancatRec) {
		this.wsCreateTrancatRec.setValue(wsCreateTrancatRec);
	}
}
