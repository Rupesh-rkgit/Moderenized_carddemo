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
 * Data simplifier entity WsDateToTest.
<pre>
 * 
 * Legacy Documentation:<br>
 *  *****************************************************************<br>
 *  ****       CALL TO CEEDAYS                                *******<br>
 *  *****************************************************************<br>
 *   Copyright Amazon.com, Inc. or its affiliates.<br>
 *   All Rights Reserved.<br>
 *  <br>
 *   Licensed under the Apache License, Version 2.0 (the "License").<br>
 *   You may not use this file except in compliance with the License.<br>
 *   You may obtain a copy of the License at<br>
 *  <br>
 *      http://www.apache.org/licenses/LICENSE-2.0<br>
 *  <br>
 *   Unless required by applicable law or agreed to in writing,<br>
 *   software distributed under the License is distributed on an<br>
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,<br>
 *   either express or implied. See the License for the specific<br>
 *   language governing permissions and limitations under the License<br>
 *  *****************************************************************<br>
 *  ***  Date passed to CEEDAYS API<br>
</pre>
 * 
 * <p>About 'vstringLength_2' field, <br>
 * </p>
 * 
 * <p>About 'vstringText' field, <br>uml entity: aws.bluage.l3.workshop.csutldtc.business.model.VstringText
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsDateToTest extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary vstringLength_2 = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true));
	private final Group vstringText = new Group(root);
	private final Elementary vstringChar = new Elementary(vstringText,new VariableSizeArray(256),new AlphanumericType(1));
	

	/**
	 * Instantiate a new WsDateToTest with a default record.
	 * @param configuration the configuration
	 */
	public WsDateToTest(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsDateToTest bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsDateToTest(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute vstringLength_2.
	 * @return the vstringLength_2 attribute reference
	 */
	public ElementaryRangeReference getVstringLength_2Reference() {
		return vstringLength_2.getReference();
	}

	/**
	 * Getter for vstringLength_2 attribute.
	 * @return vstringLength_2 attribute
	 */
	public int getVstringLength_2() {
		return vstringLength_2.getValue();
	}

	/**
	 * Setter for vstringLength_2 attribute.
	 * @param vstringLength_2 the new value of vstringLength_2
	 */
	public void setVstringLength_2(int vstringLength_2) {
		this.vstringLength_2.setValue(vstringLength_2);
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
