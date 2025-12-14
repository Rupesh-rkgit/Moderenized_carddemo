package aws.bluage.l3.workshop.cotrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity CcdaCommonMessages.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT<br>
 *  <br>
 *  ****************************************************************<br>
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
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'ccdaMsgThankYou' field, <br>
 * </p>
 * 
 * <p>About 'ccdaMsgInvalidKey' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class CcdaCommonMessages extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ccdaMsgThankYou = new Elementary(root,new AlphanumericType(50),"Thank you for using CardDemo application...      ");
	private final Elementary ccdaMsgInvalidKey = new Elementary(root,new AlphanumericType(50),"Invalid key pressed. Please see below...         ");
	

	/**
	 * Instantiate a new CcdaCommonMessages with a default record.
	 * @param configuration the configuration
	 */
	public CcdaCommonMessages(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CcdaCommonMessages bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CcdaCommonMessages(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ccdaMsgThankYou.
	 * @return the ccdaMsgThankYou attribute reference
	 */
	public ElementaryRangeReference getCcdaMsgThankYouReference() {
		return ccdaMsgThankYou.getReference();
	}

	/**
	 * Getter for ccdaMsgThankYou attribute.
	 * @return ccdaMsgThankYou attribute
	 */
	public String getCcdaMsgThankYou() {
		return ccdaMsgThankYou.getValue();
	}

	/**
	 * Setter for ccdaMsgThankYou attribute.
	 * @param ccdaMsgThankYou the new value of ccdaMsgThankYou
	 */
	public void setCcdaMsgThankYou(String ccdaMsgThankYou) {
		this.ccdaMsgThankYou.setValue(ccdaMsgThankYou);
	}
	/**
	 * Gets the reference for attribute ccdaMsgInvalidKey.
	 * @return the ccdaMsgInvalidKey attribute reference
	 */
	public ElementaryRangeReference getCcdaMsgInvalidKeyReference() {
		return ccdaMsgInvalidKey.getReference();
	}

	/**
	 * Getter for ccdaMsgInvalidKey attribute.
	 * @return ccdaMsgInvalidKey attribute
	 */
	public String getCcdaMsgInvalidKey() {
		return ccdaMsgInvalidKey.getValue();
	}

	/**
	 * Setter for ccdaMsgInvalidKey attribute.
	 * @param ccdaMsgInvalidKey the new value of ccdaMsgInvalidKey
	 */
	public void setCcdaMsgInvalidKey(String ccdaMsgInvalidKey) {
		this.ccdaMsgInvalidKey.setValue(ccdaMsgInvalidKey);
	}
}
