package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier file TcatbalFile.
<pre>
 * 
 * Legacy Documentation:<br>
 *  *****************************************************************<br>
 *   Program     : CBACT04C.CBL<br>
 *   Application : CardDemo<br>
 *   Type        : BATCH COBOL Program<br>
 *   Function    : This is a interest calculator program.<br>
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
 * <p>About 'fdTranCatBalRecord' field, <br>uml entity: aws.bluage.l3.workshop.cbact04c.business.model.FdTranCatBalRecord
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbact04c.business.model.TcatbalFile")
@Lazy
@Scope("prototype")
public class TcatbalFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdTranCatBalRecord = new Group(root);
	private final Group fdTranCatKey = new Group(fdTranCatBalRecord);
	private final Elementary fdTrancatAcctId = new Elementary(fdTranCatKey,new ZonedType(11, 0, false));
	private final Elementary fdTrancatTypeCd = new Elementary(fdTranCatKey,new AlphanumericType(2));
	private final Elementary fdTrancatCd = new Elementary(fdTranCatKey,new ZonedType(4, 0, false));
	private final Elementary fdFdTranCatData = new Elementary(fdTranCatBalRecord,new AlphanumericType(33));
	 
	/**
	 * Instantiate a new TcatbalFile.
	 * @param configuration the configuration
	 */
	public TcatbalFile(@Qualifier("Cbact04cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdTranCatBalRecord.
	 * @return the fdTranCatBalRecord attribute reference
	 */
	public RangeReference getFdTranCatBalRecordReference() {
		return fdTranCatBalRecord.getReference();
	}	
				
	/**
	 * Setter for fdTranCatBalRecord .
	 */
   	public void setFdTranCatBalRecord(RangeReference reference) {
       	fdTranCatBalRecord.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute fdTranCatKey.
	 * @return the fdTranCatKey attribute reference
	 */
	public RangeReference getFdTranCatKeyReference() {
		return fdTranCatKey.getReference();
	}	
				
	/**
	 * Setter for fdTranCatKey .
	 */
   	public void setFdTranCatKey(RangeReference reference) {
       	fdTranCatKey.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdTrancatAcctId.
	 * @return the fdTrancatAcctId attribute reference
	 */
	public ElementaryRangeReference getFdTrancatAcctIdReference() {
		return fdTrancatAcctId.getReference();
	}

	/**
	 * Getter for fdTrancatAcctId attribute.
	 * @return fdTrancatAcctId attribute
	 */
	public long getFdTrancatAcctId() {
		return fdTrancatAcctId.getValue();
	}

	/**
	 * Setter for fdTrancatAcctId attribute.
	 * @param fdTrancatAcctId the new value of fdTrancatAcctId
	 */
	public void setFdTrancatAcctId(long fdTrancatAcctId) {
		this.fdTrancatAcctId.setValue(fdTrancatAcctId);
	}
	/**
	 * Gets the reference for attribute fdTrancatTypeCd.
	 * @return the fdTrancatTypeCd attribute reference
	 */
	public ElementaryRangeReference getFdTrancatTypeCdReference() {
		return fdTrancatTypeCd.getReference();
	}

	/**
	 * Getter for fdTrancatTypeCd attribute.
	 * @return fdTrancatTypeCd attribute
	 */
	public String getFdTrancatTypeCd() {
		return fdTrancatTypeCd.getValue();
	}

	/**
	 * Setter for fdTrancatTypeCd attribute.
	 * @param fdTrancatTypeCd the new value of fdTrancatTypeCd
	 */
	public void setFdTrancatTypeCd(String fdTrancatTypeCd) {
		this.fdTrancatTypeCd.setValue(fdTrancatTypeCd);
	}
	/**
	 * Gets the reference for attribute fdTrancatCd.
	 * @return the fdTrancatCd attribute reference
	 */
	public ElementaryRangeReference getFdTrancatCdReference() {
		return fdTrancatCd.getReference();
	}

	/**
	 * Getter for fdTrancatCd attribute.
	 * @return fdTrancatCd attribute
	 */
	public int getFdTrancatCd() {
		return fdTrancatCd.getValue();
	}

	/**
	 * Setter for fdTrancatCd attribute.
	 * @param fdTrancatCd the new value of fdTrancatCd
	 */
	public void setFdTrancatCd(int fdTrancatCd) {
		this.fdTrancatCd.setValue(fdTrancatCd);
	}
	/**
	 * Gets the reference for attribute fdFdTranCatData.
	 * @return the fdFdTranCatData attribute reference
	 */
	public ElementaryRangeReference getFdFdTranCatDataReference() {
		return fdFdTranCatData.getReference();
	}

	/**
	 * Getter for fdFdTranCatData attribute.
	 * @return fdFdTranCatData attribute
	 */
	public String getFdFdTranCatData() {
		return fdFdTranCatData.getValue();
	}

	/**
	 * Setter for fdFdTranCatData attribute.
	 * @param fdFdTranCatData the new value of fdFdTranCatData
	 */
	public void setFdFdTranCatData(String fdFdTranCatData) {
		this.fdFdTranCatData.setValue(fdFdTranCatData);
	}
}
