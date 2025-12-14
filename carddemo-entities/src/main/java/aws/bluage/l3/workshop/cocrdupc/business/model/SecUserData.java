package aws.bluage.l3.workshop.cocrdupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity SecUserData.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT<br>
 *  <br>
 *  Signed on user data<br>
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
 * <p>About 'secUsrId' field, <br>
 * </p>
 * 
 * <p>About 'secUsrFname' field, <br>
 * </p>
 * 
 * <p>About 'secUsrLname' field, <br>
 * </p>
 * 
 * <p>About 'secUsrPwd' field, <br>
 * </p>
 * 
 * <p>About 'secUsrType' field, <br>
 * </p>
 * 
 * <p>About 'secUsrFiller' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class SecUserData extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary secUsrId = new Elementary(root,new AlphanumericType(8));
	private final Elementary secUsrFname = new Elementary(root,new AlphanumericType(20));
	private final Elementary secUsrLname = new Elementary(root,new AlphanumericType(20));
	private final Elementary secUsrPwd = new Elementary(root,new AlphanumericType(8));
	private final Elementary secUsrType = new Elementary(root,new AlphanumericType(1));
	private final Elementary secUsrFiller = new Elementary(root,new AlphanumericType(23));
	

	/**
	 * Instantiate a new SecUserData with a default record.
	 * @param configuration the configuration
	 */
	public SecUserData(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new SecUserData bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public SecUserData(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute secUsrId.
	 * @return the secUsrId attribute reference
	 */
	public ElementaryRangeReference getSecUsrIdReference() {
		return secUsrId.getReference();
	}

	/**
	 * Getter for secUsrId attribute.
	 * @return secUsrId attribute
	 */
	public String getSecUsrId() {
		return secUsrId.getValue();
	}

	/**
	 * Setter for secUsrId attribute.
	 * @param secUsrId the new value of secUsrId
	 */
	public void setSecUsrId(String secUsrId) {
		this.secUsrId.setValue(secUsrId);
	}
	/**
	 * Gets the reference for attribute secUsrFname.
	 * @return the secUsrFname attribute reference
	 */
	public ElementaryRangeReference getSecUsrFnameReference() {
		return secUsrFname.getReference();
	}

	/**
	 * Getter for secUsrFname attribute.
	 * @return secUsrFname attribute
	 */
	public String getSecUsrFname() {
		return secUsrFname.getValue();
	}

	/**
	 * Setter for secUsrFname attribute.
	 * @param secUsrFname the new value of secUsrFname
	 */
	public void setSecUsrFname(String secUsrFname) {
		this.secUsrFname.setValue(secUsrFname);
	}
	/**
	 * Gets the reference for attribute secUsrLname.
	 * @return the secUsrLname attribute reference
	 */
	public ElementaryRangeReference getSecUsrLnameReference() {
		return secUsrLname.getReference();
	}

	/**
	 * Getter for secUsrLname attribute.
	 * @return secUsrLname attribute
	 */
	public String getSecUsrLname() {
		return secUsrLname.getValue();
	}

	/**
	 * Setter for secUsrLname attribute.
	 * @param secUsrLname the new value of secUsrLname
	 */
	public void setSecUsrLname(String secUsrLname) {
		this.secUsrLname.setValue(secUsrLname);
	}
	/**
	 * Gets the reference for attribute secUsrPwd.
	 * @return the secUsrPwd attribute reference
	 */
	public ElementaryRangeReference getSecUsrPwdReference() {
		return secUsrPwd.getReference();
	}

	/**
	 * Getter for secUsrPwd attribute.
	 * @return secUsrPwd attribute
	 */
	public String getSecUsrPwd() {
		return secUsrPwd.getValue();
	}

	/**
	 * Setter for secUsrPwd attribute.
	 * @param secUsrPwd the new value of secUsrPwd
	 */
	public void setSecUsrPwd(String secUsrPwd) {
		this.secUsrPwd.setValue(secUsrPwd);
	}
	/**
	 * Gets the reference for attribute secUsrType.
	 * @return the secUsrType attribute reference
	 */
	public ElementaryRangeReference getSecUsrTypeReference() {
		return secUsrType.getReference();
	}

	/**
	 * Getter for secUsrType attribute.
	 * @return secUsrType attribute
	 */
	public String getSecUsrType() {
		return secUsrType.getValue();
	}

	/**
	 * Setter for secUsrType attribute.
	 * @param secUsrType the new value of secUsrType
	 */
	public void setSecUsrType(String secUsrType) {
		this.secUsrType.setValue(secUsrType);
	}
	/**
	 * Gets the reference for attribute secUsrFiller.
	 * @return the secUsrFiller attribute reference
	 */
	public ElementaryRangeReference getSecUsrFillerReference() {
		return secUsrFiller.getReference();
	}

	/**
	 * Getter for secUsrFiller attribute.
	 * @return secUsrFiller attribute
	 */
	public String getSecUsrFiller() {
		return secUsrFiller.getValue();
	}

	/**
	 * Setter for secUsrFiller attribute.
	 * @param secUsrFiller the new value of secUsrFiller
	 */
	public void setSecUsrFiller(String secUsrFiller) {
		this.secUsrFiller.setValue(secUsrFiller);
	}
}
