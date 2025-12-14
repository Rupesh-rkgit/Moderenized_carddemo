package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
import java.math.BigDecimal;
/**
 * Data simplifier entity TrnxRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *   CardDemo - Transaction altered Layout for use in reporting<br>
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
 *  <br>
</pre>
 * 
 * <p>About 'trnxKey' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.TrnxKey
 * <br></p>
 * 
 * <p>About 'trnxRest' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.TrnxRest
 * <br></p>
 * 
 * @see RecordEntity
 */
public class TrnxRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group trnxKey = new Group(root);
	private final Elementary trnxCardNum = new Elementary(trnxKey,new AlphanumericType(16));
	private final Elementary trnxId = new Elementary(trnxKey,new AlphanumericType(16));
	private final Group trnxRest = new Group(root);
	private final Elementary trnxTypeCd = new Elementary(trnxRest,new AlphanumericType(2));
	private final Elementary trnxCatCd = new Elementary(trnxRest,new ZonedType(4, 0, false));
	private final Elementary trnxSource = new Elementary(trnxRest,new AlphanumericType(10));
	private final Elementary trnxDesc = new Elementary(trnxRest,new AlphanumericType(100));
	private final Elementary trnxAmt = new Elementary(trnxRest,new ZonedType(9, 2, false, false, true));
	private final Elementary trnxMerchantId = new Elementary(trnxRest,new ZonedType(9, 0, false));
	private final Elementary trnxMerchantName = new Elementary(trnxRest,new AlphanumericType(50));
	private final Elementary trnxMerchantCity = new Elementary(trnxRest,new AlphanumericType(50));
	private final Elementary trnxMerchantZip = new Elementary(trnxRest,new AlphanumericType(10));
	private final Elementary trnxOrigTs = new Elementary(trnxRest,new AlphanumericType(26));
	private final Elementary trnxProcTs = new Elementary(trnxRest,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(trnxRest,new AlphanumericType(20));
	

	/**
	 * Instantiate a new TrnxRecord with a default record.
	 * @param configuration the configuration
	 */
	public TrnxRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TrnxRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TrnxRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute trnxKey.
	 * @return the trnxKey attribute reference
	 */
	public RangeReference getTrnxKeyReference() {
		return trnxKey.getReference();
	}	
				
	/**
	 * Setter for trnxKey .
	 */
   	public void setTrnxKey(RangeReference reference) {
       	trnxKey.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute trnxCardNum.
	 * @return the trnxCardNum attribute reference
	 */
	public ElementaryRangeReference getTrnxCardNumReference() {
		return trnxCardNum.getReference();
	}

	/**
	 * Getter for trnxCardNum attribute.
	 * @return trnxCardNum attribute
	 */
	public String getTrnxCardNum() {
		return trnxCardNum.getValue();
	}

	/**
	 * Setter for trnxCardNum attribute.
	 * @param trnxCardNum the new value of trnxCardNum
	 */
	public void setTrnxCardNum(String trnxCardNum) {
		this.trnxCardNum.setValue(trnxCardNum);
	}
	/**
	 * Gets the reference for attribute trnxId.
	 * @return the trnxId attribute reference
	 */
	public ElementaryRangeReference getTrnxIdReference() {
		return trnxId.getReference();
	}

	/**
	 * Getter for trnxId attribute.
	 * @return trnxId attribute
	 */
	public String getTrnxId() {
		return trnxId.getValue();
	}

	/**
	 * Setter for trnxId attribute.
	 * @param trnxId the new value of trnxId
	 */
	public void setTrnxId(String trnxId) {
		this.trnxId.setValue(trnxId);
	}
	
	/**
	 * Gets the reference for attribute trnxRest.
	 * @return the trnxRest attribute reference
	 */
	public RangeReference getTrnxRestReference() {
		return trnxRest.getReference();
	}	
				
	/**
	 * Setter for trnxRest .
	 */
   	public void setTrnxRest(RangeReference reference) {
       	trnxRest.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute trnxTypeCd.
	 * @return the trnxTypeCd attribute reference
	 */
	public ElementaryRangeReference getTrnxTypeCdReference() {
		return trnxTypeCd.getReference();
	}

	/**
	 * Getter for trnxTypeCd attribute.
	 * @return trnxTypeCd attribute
	 */
	public String getTrnxTypeCd() {
		return trnxTypeCd.getValue();
	}

	/**
	 * Setter for trnxTypeCd attribute.
	 * @param trnxTypeCd the new value of trnxTypeCd
	 */
	public void setTrnxTypeCd(String trnxTypeCd) {
		this.trnxTypeCd.setValue(trnxTypeCd);
	}
	/**
	 * Gets the reference for attribute trnxCatCd.
	 * @return the trnxCatCd attribute reference
	 */
	public ElementaryRangeReference getTrnxCatCdReference() {
		return trnxCatCd.getReference();
	}

	/**
	 * Getter for trnxCatCd attribute.
	 * @return trnxCatCd attribute
	 */
	public int getTrnxCatCd() {
		return trnxCatCd.getValue();
	}

	/**
	 * Setter for trnxCatCd attribute.
	 * @param trnxCatCd the new value of trnxCatCd
	 */
	public void setTrnxCatCd(int trnxCatCd) {
		this.trnxCatCd.setValue(trnxCatCd);
	}
	/**
	 * Gets the reference for attribute trnxSource.
	 * @return the trnxSource attribute reference
	 */
	public ElementaryRangeReference getTrnxSourceReference() {
		return trnxSource.getReference();
	}

	/**
	 * Getter for trnxSource attribute.
	 * @return trnxSource attribute
	 */
	public String getTrnxSource() {
		return trnxSource.getValue();
	}

	/**
	 * Setter for trnxSource attribute.
	 * @param trnxSource the new value of trnxSource
	 */
	public void setTrnxSource(String trnxSource) {
		this.trnxSource.setValue(trnxSource);
	}
	/**
	 * Gets the reference for attribute trnxDesc.
	 * @return the trnxDesc attribute reference
	 */
	public ElementaryRangeReference getTrnxDescReference() {
		return trnxDesc.getReference();
	}

	/**
	 * Getter for trnxDesc attribute.
	 * @return trnxDesc attribute
	 */
	public String getTrnxDesc() {
		return trnxDesc.getValue();
	}

	/**
	 * Setter for trnxDesc attribute.
	 * @param trnxDesc the new value of trnxDesc
	 */
	public void setTrnxDesc(String trnxDesc) {
		this.trnxDesc.setValue(trnxDesc);
	}
	/**
	 * Gets the reference for attribute trnxAmt.
	 * @return the trnxAmt attribute reference
	 */
	public ElementaryRangeReference getTrnxAmtReference() {
		return trnxAmt.getReference();
	}

	/**
	 * Getter for trnxAmt attribute.
	 * @return trnxAmt attribute
	 */
	public BigDecimal getTrnxAmt() {
		return trnxAmt.getValue();
	}

	/**
	 * Setter for trnxAmt attribute.
	 * @param trnxAmt the new value of trnxAmt
	 */
	public void setTrnxAmt(BigDecimal trnxAmt) {
		this.trnxAmt.setValue(trnxAmt);
	}
	/**
	 * Gets the reference for attribute trnxMerchantId.
	 * @return the trnxMerchantId attribute reference
	 */
	public ElementaryRangeReference getTrnxMerchantIdReference() {
		return trnxMerchantId.getReference();
	}

	/**
	 * Getter for trnxMerchantId attribute.
	 * @return trnxMerchantId attribute
	 */
	public int getTrnxMerchantId() {
		return trnxMerchantId.getValue();
	}

	/**
	 * Setter for trnxMerchantId attribute.
	 * @param trnxMerchantId the new value of trnxMerchantId
	 */
	public void setTrnxMerchantId(int trnxMerchantId) {
		this.trnxMerchantId.setValue(trnxMerchantId);
	}
	/**
	 * Gets the reference for attribute trnxMerchantName.
	 * @return the trnxMerchantName attribute reference
	 */
	public ElementaryRangeReference getTrnxMerchantNameReference() {
		return trnxMerchantName.getReference();
	}

	/**
	 * Getter for trnxMerchantName attribute.
	 * @return trnxMerchantName attribute
	 */
	public String getTrnxMerchantName() {
		return trnxMerchantName.getValue();
	}

	/**
	 * Setter for trnxMerchantName attribute.
	 * @param trnxMerchantName the new value of trnxMerchantName
	 */
	public void setTrnxMerchantName(String trnxMerchantName) {
		this.trnxMerchantName.setValue(trnxMerchantName);
	}
	/**
	 * Gets the reference for attribute trnxMerchantCity.
	 * @return the trnxMerchantCity attribute reference
	 */
	public ElementaryRangeReference getTrnxMerchantCityReference() {
		return trnxMerchantCity.getReference();
	}

	/**
	 * Getter for trnxMerchantCity attribute.
	 * @return trnxMerchantCity attribute
	 */
	public String getTrnxMerchantCity() {
		return trnxMerchantCity.getValue();
	}

	/**
	 * Setter for trnxMerchantCity attribute.
	 * @param trnxMerchantCity the new value of trnxMerchantCity
	 */
	public void setTrnxMerchantCity(String trnxMerchantCity) {
		this.trnxMerchantCity.setValue(trnxMerchantCity);
	}
	/**
	 * Gets the reference for attribute trnxMerchantZip.
	 * @return the trnxMerchantZip attribute reference
	 */
	public ElementaryRangeReference getTrnxMerchantZipReference() {
		return trnxMerchantZip.getReference();
	}

	/**
	 * Getter for trnxMerchantZip attribute.
	 * @return trnxMerchantZip attribute
	 */
	public String getTrnxMerchantZip() {
		return trnxMerchantZip.getValue();
	}

	/**
	 * Setter for trnxMerchantZip attribute.
	 * @param trnxMerchantZip the new value of trnxMerchantZip
	 */
	public void setTrnxMerchantZip(String trnxMerchantZip) {
		this.trnxMerchantZip.setValue(trnxMerchantZip);
	}
	/**
	 * Gets the reference for attribute trnxOrigTs.
	 * @return the trnxOrigTs attribute reference
	 */
	public ElementaryRangeReference getTrnxOrigTsReference() {
		return trnxOrigTs.getReference();
	}

	/**
	 * Getter for trnxOrigTs attribute.
	 * @return trnxOrigTs attribute
	 */
	public String getTrnxOrigTs() {
		return trnxOrigTs.getValue();
	}

	/**
	 * Setter for trnxOrigTs attribute.
	 * @param trnxOrigTs the new value of trnxOrigTs
	 */
	public void setTrnxOrigTs(String trnxOrigTs) {
		this.trnxOrigTs.setValue(trnxOrigTs);
	}
	/**
	 * Gets the reference for attribute trnxProcTs.
	 * @return the trnxProcTs attribute reference
	 */
	public ElementaryRangeReference getTrnxProcTsReference() {
		return trnxProcTs.getReference();
	}

	/**
	 * Getter for trnxProcTs attribute.
	 * @return trnxProcTs attribute
	 */
	public String getTrnxProcTs() {
		return trnxProcTs.getValue();
	}

	/**
	 * Setter for trnxProcTs attribute.
	 * @param trnxProcTs the new value of trnxProcTs
	 */
	public void setTrnxProcTs(String trnxProcTs) {
		this.trnxProcTs.setValue(trnxProcTs);
	}
}
