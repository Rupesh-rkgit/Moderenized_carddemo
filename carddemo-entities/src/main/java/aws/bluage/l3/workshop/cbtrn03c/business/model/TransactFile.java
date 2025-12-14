package aws.bluage.l3.workshop.cbtrn03c.business.model;

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
 * Data simplifier file TransactFile.
<pre>
 * 
 * Legacy Documentation:<br>
 *  *****************************************************************<br>
 *   Program     : CBTRN03C.CBL<br>
 *   Application : CardDemo<br>
 *   Type        : BATCH COBOL Program<br>
 *   Function    : Print the transaction detail report.<br>
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
 * <p>About 'fdTranfileRec' field, <br>uml entity: aws.bluage.l3.workshop.cbtrn03c.business.model.FdTranfileRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbtrn03c.business.model.TransactFile")
@Lazy
@Scope("prototype")
public class TransactFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Group fdTranfileRec = new Group(root);
	private final Elementary fdTransData = new Elementary(fdTranfileRec,new AlphanumericType(304));
	private final Elementary fdTranProcTs = new Elementary(fdTranfileRec,new AlphanumericType(26));
	private final Elementary fdFiller = new Elementary(fdTranfileRec,new AlphanumericType(20));
	 
	/**
	 * Instantiate a new TransactFile.
	 * @param configuration the configuration
	 */
	public TransactFile(@Qualifier("Cbtrn03cContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	
	/**
	 * Gets the reference for attribute fdTranfileRec.
	 * @return the fdTranfileRec attribute reference
	 */
	public RangeReference getFdTranfileRecReference() {
		return fdTranfileRec.getReference();
	}	
				
	/**
	 * Setter for fdTranfileRec .
	 */
   	public void setFdTranfileRec(RangeReference reference) {
       	fdTranfileRec.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute fdTransData.
	 * @return the fdTransData attribute reference
	 */
	public ElementaryRangeReference getFdTransDataReference() {
		return fdTransData.getReference();
	}

	/**
	 * Getter for fdTransData attribute.
	 * @return fdTransData attribute
	 */
	public String getFdTransData() {
		return fdTransData.getValue();
	}

	/**
	 * Setter for fdTransData attribute.
	 * @param fdTransData the new value of fdTransData
	 */
	public void setFdTransData(String fdTransData) {
		this.fdTransData.setValue(fdTransData);
	}
	/**
	 * Gets the reference for attribute fdTranProcTs.
	 * @return the fdTranProcTs attribute reference
	 */
	public ElementaryRangeReference getFdTranProcTsReference() {
		return fdTranProcTs.getReference();
	}

	/**
	 * Getter for fdTranProcTs attribute.
	 * @return fdTranProcTs attribute
	 */
	public String getFdTranProcTs() {
		return fdTranProcTs.getValue();
	}

	/**
	 * Setter for fdTranProcTs attribute.
	 * @param fdTranProcTs the new value of fdTranProcTs
	 */
	public void setFdTranProcTs(String fdTranProcTs) {
		this.fdTranProcTs.setValue(fdTranProcTs);
	}
	/**
	 * Gets the reference for attribute fdFiller.
	 * @return the fdFiller attribute reference
	 */
	public ElementaryRangeReference getFdFillerReference() {
		return fdFiller.getReference();
	}

	/**
	 * Getter for fdFiller attribute.
	 * @return fdFiller attribute
	 */
	public String getFdFiller() {
		return fdFiller.getValue();
	}

	/**
	 * Setter for fdFiller attribute.
	 * @param fdFiller the new value of fdFiller
	 */
	public void setFdFiller(String fdFiller) {
		this.fdFiller.setValue(fdFiller);
	}
}
