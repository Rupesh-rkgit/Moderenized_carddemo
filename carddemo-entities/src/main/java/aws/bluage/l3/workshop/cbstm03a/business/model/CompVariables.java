package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity CompVariables.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'crCnt' field, <br>
 * </p>
 * 
 * <p>About 'trCnt' field, <br>
 * </p>
 * 
 * <p>About 'crJmp' field, <br>
 * </p>
 * 
 * <p>About 'trJmp' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class CompVariables extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary crCnt = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("0"));
	private final Elementary trCnt = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("0"));
	private final Elementary crJmp = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("0"));
	private final Elementary trJmp = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("0"));
	

	/**
	 * Instantiate a new CompVariables with a default record.
	 * @param configuration the configuration
	 */
	public CompVariables(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CompVariables bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CompVariables(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute crCnt.
	 * @return the crCnt attribute reference
	 */
	public ElementaryRangeReference getCrCntReference() {
		return crCnt.getReference();
	}

	/**
	 * Getter for crCnt attribute.
	 * @return crCnt attribute
	 */
	public int getCrCnt() {
		return crCnt.getValue();
	}

	/**
	 * Setter for crCnt attribute.
	 * @param crCnt the new value of crCnt
	 */
	public void setCrCnt(int crCnt) {
		this.crCnt.setValue(crCnt);
	}
	/**
	 * Gets the reference for attribute trCnt.
	 * @return the trCnt attribute reference
	 */
	public ElementaryRangeReference getTrCntReference() {
		return trCnt.getReference();
	}

	/**
	 * Getter for trCnt attribute.
	 * @return trCnt attribute
	 */
	public int getTrCnt() {
		return trCnt.getValue();
	}

	/**
	 * Setter for trCnt attribute.
	 * @param trCnt the new value of trCnt
	 */
	public void setTrCnt(int trCnt) {
		this.trCnt.setValue(trCnt);
	}
	/**
	 * Gets the reference for attribute crJmp.
	 * @return the crJmp attribute reference
	 */
	public ElementaryRangeReference getCrJmpReference() {
		return crJmp.getReference();
	}

	/**
	 * Getter for crJmp attribute.
	 * @return crJmp attribute
	 */
	public int getCrJmp() {
		return crJmp.getValue();
	}

	/**
	 * Setter for crJmp attribute.
	 * @param crJmp the new value of crJmp
	 */
	public void setCrJmp(int crJmp) {
		this.crJmp.setValue(crJmp);
	}
	/**
	 * Gets the reference for attribute trJmp.
	 * @return the trJmp attribute reference
	 */
	public ElementaryRangeReference getTrJmpReference() {
		return trJmp.getReference();
	}

	/**
	 * Getter for trJmp attribute.
	 * @return trJmp attribute
	 */
	public int getTrJmp() {
		return trJmp.getValue();
	}

	/**
	 * Setter for trJmp attribute.
	 * @param trJmp the new value of trJmp
	 */
	public void setTrJmp(int trJmp) {
		this.trJmp.setValue(trJmp);
	}
}
