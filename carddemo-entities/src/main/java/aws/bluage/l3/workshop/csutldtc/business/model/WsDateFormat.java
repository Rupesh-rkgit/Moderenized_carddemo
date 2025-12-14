package aws.bluage.l3.workshop.csutldtc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.VariableSizeArray;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity WsDateFormat.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ***  DATE FORMAT PASSED TO CEEDAYS API<br>
</pre>
 * 
 * <p>About 'vstringLength_3' field, <br>
 * </p>
 * 
 * <p>About 'vstringText' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.VstringText
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsDateFormat extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary vstringLength_3 = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true));
	private final Group vstringText = new Group(root);
	private final Elementary vstringChar = new Elementary(vstringText,new VariableSizeArray(256),new AlphanumericType(1));
	

	/**
	 * Instantiate a new WsDateFormat with a default record.
	 * @param configuration the configuration
	 */
	public WsDateFormat(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsDateFormat bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsDateFormat(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute vstringLength_3.
	 * @return the vstringLength_3 attribute reference
	 */
	public ElementaryRangeReference getVstringLength_3Reference() {
		return vstringLength_3.getReference();
	}

	/**
	 * Getter for vstringLength_3 attribute.
	 * @return vstringLength_3 attribute
	 */
	public int getVstringLength_3() {
		return vstringLength_3.getValue();
	}

	/**
	 * Setter for vstringLength_3 attribute.
	 * @param vstringLength_3 the new value of vstringLength_3
	 */
	public void setVstringLength_3(int vstringLength_3) {
		this.vstringLength_3.setValue(vstringLength_3);
	}
	
	/**
	 * Gets the reference for attribute vstringText.
	 * @return the vstringText attribute reference
	 */
	public RangeReference getVstringTextReference() {
		return vstringText.getReference();
	}	
				
	/**
	 * Setter for vstringText .
	 */
   	public void setVstringText(RangeReference reference) {
       	vstringText.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Count holder setter for vstringChar attribute.
	 * @param countHolder the ElementaryRangeReference that acts as count holder for vstringChar
	 */
	public void setVstringCharCountHolder (ElementaryRangeReference countHolder){
		((VariableSizeArray)this.vstringChar.getRepetition()).setCountHolder(countHolder);	
	}
	/**
	 * Indexed getter for vstringChar attribute.
	 * @param indexes the indexes
	 * @return vstringChar attribute
	 */
	public ElementaryRangeReference getItemFromVstringCharReference(Integer... indexes) {
		return vstringChar.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for vstringChar attribute.
	 * @param indexes the indexes
	 * @return vstringChar attribute
	 */
	public String getItemFromVstringChar(Integer... indexes) {
		return vstringChar.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for vstringChar attribute.
	 * @param vstringChar the new value of vstringChar for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromVstringChar(String vstringChar,Integer... indexes) {
		this.vstringChar.setIndexedValue(vstringChar,indexes);
	}
	
	/**
	 * Collection size getter for vstringChar attribute.
	 * @return  the collection size for attributevstringChar
	 */
	public int getVstringCharSize(){
		return vstringChar.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for vstringChar attribute.
	 * @param indexes the indexes
	 * @return vstringChar attribute
	 */
	public ElementaryRangeReference getVstringCharReference() {
		return vstringChar.getReference();
	}
	
	/**
	 * Indexed getter for vstringChar attribute.
	 * @param indexes the indexes
	 * @return vstringChar attribute
	 */
	public String getVstringChar() {
		return vstringChar.getValue();
	}
	
	/**
	 * Indexed setter for vstringChar attribute.
	 * @param vstringChar the new value of vstringChar for given indexes
	 * @param indexes the indexes
	 */
	public void setVstringChar(String vstringChar) {
		this.vstringChar.setValue(vstringChar);
	}
	
}
