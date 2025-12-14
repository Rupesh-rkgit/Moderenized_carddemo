package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity AbendData.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT<br>
 *  <br>
 *  Abend Variables<br>
 *  ****************************************************************<br>
 *   CABENDD.CPY                                                   *<br>
 *  ---------------------------------------------------------------*<br>
 *   Work areas for abend routine                                  *<br>
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
 * <p>About 'abendCode' field, <br>
 * </p>
 * 
 * <p>About 'abendCulprit' field, <br>
 * </p>
 * 
 * <p>About 'abendReason' field, <br>
 * </p>
 * 
 * <p>About 'abendMsg' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class AbendData extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary abendCode = new Elementary(root,new AlphanumericType(4)," ");
	private final Elementary abendCulprit = new Elementary(root,new AlphanumericType(8)," ");
	private final Elementary abendReason = new Elementary(root,new AlphanumericType(50)," ");
	private final Elementary abendMsg = new Elementary(root,new AlphanumericType(72)," ");
	

	/**
	 * Instantiate a new AbendData with a default record.
	 * @param configuration the configuration
	 */
	public AbendData(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new AbendData bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public AbendData(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute abendCode.
	 * @return the abendCode attribute reference
	 */
	public ElementaryRangeReference getAbendCodeReference() {
		return abendCode.getReference();
	}

	/**
	 * Getter for abendCode attribute.
	 * @return abendCode attribute
	 */
	public String getAbendCode() {
		return abendCode.getValue();
	}

	/**
	 * Setter for abendCode attribute.
	 * @param abendCode the new value of abendCode
	 */
	public void setAbendCode(String abendCode) {
		this.abendCode.setValue(abendCode);
	}
	/**
	 * Gets the reference for attribute abendCulprit.
	 * @return the abendCulprit attribute reference
	 */
	public ElementaryRangeReference getAbendCulpritReference() {
		return abendCulprit.getReference();
	}

	/**
	 * Getter for abendCulprit attribute.
	 * @return abendCulprit attribute
	 */
	public String getAbendCulprit() {
		return abendCulprit.getValue();
	}

	/**
	 * Setter for abendCulprit attribute.
	 * @param abendCulprit the new value of abendCulprit
	 */
	public void setAbendCulprit(String abendCulprit) {
		this.abendCulprit.setValue(abendCulprit);
	}
	/**
	 * Gets the reference for attribute abendReason.
	 * @return the abendReason attribute reference
	 */
	public ElementaryRangeReference getAbendReasonReference() {
		return abendReason.getReference();
	}

	/**
	 * Getter for abendReason attribute.
	 * @return abendReason attribute
	 */
	public String getAbendReason() {
		return abendReason.getValue();
	}

	/**
	 * Setter for abendReason attribute.
	 * @param abendReason the new value of abendReason
	 */
	public void setAbendReason(String abendReason) {
		this.abendReason.setValue(abendReason);
	}
	/**
	 * Gets the reference for attribute abendMsg.
	 * @return the abendMsg attribute reference
	 */
	public ElementaryRangeReference getAbendMsgReference() {
		return abendMsg.getReference();
	}

	/**
	 * Getter for abendMsg attribute.
	 * @return abendMsg attribute
	 */
	public String getAbendMsg() {
		return abendMsg.getValue();
	}

	/**
	 * Setter for abendMsg attribute.
	 * @param abendMsg the new value of abendMsg
	 */
	public void setAbendMsg(String abendMsg) {
		this.abendMsg.setValue(abendMsg);
	}
}
