package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier file DalytranFile.
<pre>
 * 
 * Legacy Documentation:<br>
 *  *****************************************************************<br>
 *   Program     : CBTRN02C.CBL<br>
 *   Application : CardDemo<br>
 *   Type        : BATCH COBOL Program<br>
 *   Function    : Post the records from daily transaction file.<br>
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
 *  <br>
</pre>
 * 
 * <p>About 'fdTranRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn02c.business.model.FdTranRecord
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn02c.business.model.DalytranFile")
@Lazy
@Scope("prototype")
public class DalytranFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdTranRecord = new Group(root);
	private final Elementary fdTranId = new Elementary(fdTranRecord,new AlphanumericType(16));
	private final Elementary fdCustData = new Elementary(fdTranRecord,new AlphanumericType(334));
	 
	/**
	 * Instantiate a new DalytranFile.
	 * @param configuration the configuration
	 */
	public DalytranFile(@Qualifier("Cbtrn02cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdTranRecord.
	 * @return the fdTranRecord attribute reference
	 */
	public RangeReference getFdTranRecordReference() {
		return fdTranRecord.getReference();
	}	
				
	/**
	 * Setter for fdTranRecord .
	 */
   	public void setFdTranRecord(RangeReference reference) {
       	fdTranRecord.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdTranId.
	 * @return the fdTranId attribute reference
	 */
	public ElementaryRangeReference getFdTranIdReference() {
		return fdTranId.getReference();
	}

	/**
	 * Getter for fdTranId attribute.
	 * @return fdTranId attribute
	 */
	public String getFdTranId() {
		return fdTranId.getValue();
	}

	/**
	 * Setter for fdTranId attribute.
	 * @param fdTranId the new value of fdTranId
	 */
	public void setFdTranId(String fdTranId) {
		this.fdTranId.setValue(fdTranId);
	}
	/**
	 * Gets the reference for attribute fdCustData.
	 * @return the fdCustData attribute reference
	 */
	public ElementaryRangeReference getFdCustDataReference() {
		return fdCustData.getReference();
	}

	/**
	 * Getter for fdCustData attribute.
	 * @return fdCustData attribute
	 */
	public String getFdCustData() {
		return fdCustData.getValue();
	}

	/**
	 * Setter for fdCustData attribute.
	 * @param fdCustData the new value of fdCustData
	 */
	public void setFdCustData(String fdCustData) {
		this.fdCustData.setValue(fdCustData);
	}
}
