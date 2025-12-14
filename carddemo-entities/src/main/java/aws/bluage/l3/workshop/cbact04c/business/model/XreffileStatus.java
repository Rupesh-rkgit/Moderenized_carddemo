package aws.bluage.l3.workshop.cbact04c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity XreffileStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'xreffileStat1' field, <br>
 * </p>
 * 
 * <p>About 'xreffileStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class XreffileStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary xreffileStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary xreffileStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new XreffileStatus with a default record.
	 * @param configuration the configuration
	 */
	public XreffileStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new XreffileStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public XreffileStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute xreffileStat1.
	 * @return the xreffileStat1 attribute reference
	 */
	public ElementaryRangeReference getXreffileStat1Reference() {
		return xreffileStat1.getReference();
	}

	/**
	 * Getter for xreffileStat1 attribute.
	 * @return xreffileStat1 attribute
	 */
	public String getXreffileStat1() {
		return xreffileStat1.getValue();
	}

	/**
	 * Setter for xreffileStat1 attribute.
	 * @param xreffileStat1 the new value of xreffileStat1
	 */
	public void setXreffileStat1(String xreffileStat1) {
		this.xreffileStat1.setValue(xreffileStat1);
	}
	/**
	 * Gets the reference for attribute xreffileStat2.
	 * @return the xreffileStat2 attribute reference
	 */
	public ElementaryRangeReference getXreffileStat2Reference() {
		return xreffileStat2.getReference();
	}

	/**
	 * Getter for xreffileStat2 attribute.
	 * @return xreffileStat2 attribute
	 */
	public String getXreffileStat2() {
		return xreffileStat2.getValue();
	}

	/**
	 * Setter for xreffileStat2 attribute.
	 * @param xreffileStat2 the new value of xreffileStat2
	 */
	public void setXreffileStat2(String xreffileStat2) {
		this.xreffileStat2.setValue(xreffileStat2);
	}
}
