package aws.bluage.l3.workshop.coactvwc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity WsThisProgcommarea.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:57 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'caCallContext' field, <br>uml entity: aws.bluage.l3.workshop.coactvwc.business.model.CaCallContext
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsThisProgcommarea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group caCallContext = new Group(root);
	private final Elementary caFromProgram = new Elementary(caCallContext,new AlphanumericType(8));
	private final Elementary caFromTranid = new Elementary(caCallContext,new AlphanumericType(4));
	

	/**
	 * Instantiate a new WsThisProgcommarea with a default record.
	 * @param configuration the configuration
	 */
	public WsThisProgcommarea(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsThisProgcommarea bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsThisProgcommarea(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute caCallContext.
	 * @return the caCallContext attribute reference
	 */
	public RangeReference getCaCallContextReference() {
		return caCallContext.getReference();
	}	
				
	/**
	 * Setter for caCallContext .
	 */
   	public void setCaCallContext(RangeReference reference) {
       	caCallContext.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute caFromProgram.
	 * @return the caFromProgram attribute reference
	 */
	public ElementaryRangeReference getCaFromProgramReference() {
		return caFromProgram.getReference();
	}

	/**
	 * Getter for caFromProgram attribute.
	 * @return caFromProgram attribute
	 */
	public String getCaFromProgram() {
		return caFromProgram.getValue();
	}

	/**
	 * Setter for caFromProgram attribute.
	 * @param caFromProgram the new value of caFromProgram
	 */
	public void setCaFromProgram(String caFromProgram) {
		this.caFromProgram.setValue(caFromProgram);
	}
	/**
	 * Gets the reference for attribute caFromTranid.
	 * @return the caFromTranid attribute reference
	 */
	public ElementaryRangeReference getCaFromTranidReference() {
		return caFromTranid.getReference();
	}

	/**
	 * Getter for caFromTranid attribute.
	 * @return caFromTranid attribute
	 */
	public String getCaFromTranid() {
		return caFromTranid.getValue();
	}

	/**
	 * Setter for caFromTranid attribute.
	 * @param caFromTranid the new value of caFromTranid
	 */
	public void setCaFromTranid(String caFromTranid) {
		this.caFromTranid.setValue(caFromTranid);
	}
}
