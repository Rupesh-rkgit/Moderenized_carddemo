package aws.bluage.l3.workshop.cotrn00c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity CcdaScreenTitle.
<pre>
 * 
 * Legacy Documentation:<br>
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
 * <p>About 'ccdaTitle01' field, <br>
 * </p>
 * 
 * <p>About 'ccdaTitle02' field, <br>
 * </p>
 * 
 * <p>About 'ccdaThankYou' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class CcdaScreenTitle extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary ccdaTitle01 = new Elementary(root,new AlphanumericType(40),"      AWS Mainframe Modernization       ");
	private final Elementary ccdaTitle02 = new Elementary(root,new AlphanumericType(40),"              CardDemo                  ");
	private final Elementary ccdaThankYou = new Elementary(root,new AlphanumericType(40),"Thank you for using CCDA application... ");
	

	/**
	 * Instantiate a new CcdaScreenTitle with a default record.
	 * @param configuration the configuration
	 */
	public CcdaScreenTitle(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CcdaScreenTitle bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CcdaScreenTitle(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute ccdaTitle01.
	 * @return the ccdaTitle01 attribute reference
	 */
	public ElementaryRangeReference getCcdaTitle01Reference() {
		return ccdaTitle01.getReference();
	}

	/**
	 * Getter for ccdaTitle01 attribute.
	 * @return ccdaTitle01 attribute
	 */
	public String getCcdaTitle01() {
		return ccdaTitle01.getValue();
	}

	/**
	 * Setter for ccdaTitle01 attribute.
	 * @param ccdaTitle01 the new value of ccdaTitle01
	 */
	public void setCcdaTitle01(String ccdaTitle01) {
		this.ccdaTitle01.setValue(ccdaTitle01);
	}
	/**
	 * Gets the reference for attribute ccdaTitle02.
	 * @return the ccdaTitle02 attribute reference
	 */
	public ElementaryRangeReference getCcdaTitle02Reference() {
		return ccdaTitle02.getReference();
	}

	/**
	 * Getter for ccdaTitle02 attribute.
	 * @return ccdaTitle02 attribute
	 */
	public String getCcdaTitle02() {
		return ccdaTitle02.getValue();
	}

	/**
	 * Setter for ccdaTitle02 attribute.
	 * @param ccdaTitle02 the new value of ccdaTitle02
	 */
	public void setCcdaTitle02(String ccdaTitle02) {
		this.ccdaTitle02.setValue(ccdaTitle02);
	}
	/**
	 * Gets the reference for attribute ccdaThankYou.
	 * @return the ccdaThankYou attribute reference
	 */
	public ElementaryRangeReference getCcdaThankYouReference() {
		return ccdaThankYou.getReference();
	}

	/**
	 * Getter for ccdaThankYou attribute.
	 * @return ccdaThankYou attribute
	 */
	public String getCcdaThankYou() {
		return ccdaThankYou.getValue();
	}

	/**
	 * Setter for ccdaThankYou attribute.
	 * @param ccdaThankYou the new value of ccdaThankYou
	 */
	public void setCcdaThankYou(String ccdaThankYou) {
		this.ccdaThankYou.setValue(ccdaThankYou);
	}
}
