package aws.bluage.l3.workshop.cocrdlic.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity WsConstants.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *   Literals and Constants<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'wsMaxScreenLines' field, <br>
 * </p>
 * 
 * <p>About 'litThispgm' field, <br>
 * </p>
 * 
 * <p>About 'litThistranid' field, <br>
 * </p>
 * 
 * <p>About 'litThismapset' field, <br>
 * </p>
 * 
 * <p>About 'litThismap' field, <br>
 * </p>
 * 
 * <p>About 'litMenupgm' field, <br>
 * </p>
 * 
 * <p>About 'litMenutranid' field, <br>
 * </p>
 * 
 * <p>About 'litMenumapset' field, <br>
 * </p>
 * 
 * <p>About 'litMenumap' field, <br>
 * </p>
 * 
 * <p>About 'litCarddtlpgm' field, <br>
 * </p>
 * 
 * <p>About 'litCarddtltranid' field, <br>
 * </p>
 * 
 * <p>About 'litCarddtlmapset' field, <br>
 * </p>
 * 
 * <p>About 'litCarddtlmap' field, <br>
 * </p>
 * 
 * <p>About 'litCardupdpgm' field, <br>
 * </p>
 * 
 * <p>About 'litCardupdtranid' field, <br>
 * </p>
 * 
 * <p>About 'litCardupdmapset' field, <br>
 * </p>
 * 
 * <p>About 'litCardupdmap' field, <br>
 * </p>
 * 
 * <p>About 'litCardFile' field, <br>
 * </p>
 * 
 * <p>About 'litCardFileAcctPath' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsConstants extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsMaxScreenLines = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true),Short.valueOf("7"));
	private final Elementary litThispgm = new Elementary(root,new AlphanumericType(8),"COCRDLIC");
	private final Elementary litThistranid = new Elementary(root,new AlphanumericType(4),"CCLI");
	private final Elementary litThismapset = new Elementary(root,new AlphanumericType(7),"COCRDLI");
	private final Elementary litThismap = new Elementary(root,new AlphanumericType(7),"CCRDLIA");
	private final Elementary litMenupgm = new Elementary(root,new AlphanumericType(8),"COMEN01C");
	private final Elementary litMenutranid = new Elementary(root,new AlphanumericType(4),"CM00");
	private final Elementary litMenumapset = new Elementary(root,new AlphanumericType(7),"COMEN01");
	private final Elementary litMenumap = new Elementary(root,new AlphanumericType(7),"COMEN1A");
	private final Elementary litCarddtlpgm = new Elementary(root,new AlphanumericType(8),"COCRDSLC");
	private final Elementary litCarddtltranid = new Elementary(root,new AlphanumericType(4),"CCDL");
	private final Elementary litCarddtlmapset = new Elementary(root,new AlphanumericType(7),"COCRDSL");
	private final Elementary litCarddtlmap = new Elementary(root,new AlphanumericType(7),"CCRDSLA");
	private final Elementary litCardupdpgm = new Elementary(root,new AlphanumericType(8),"COCRDUPC");
	private final Elementary litCardupdtranid = new Elementary(root,new AlphanumericType(4),"CCUP");
	private final Elementary litCardupdmapset = new Elementary(root,new AlphanumericType(7),"COCRDUP");
	private final Elementary litCardupdmap = new Elementary(root,new AlphanumericType(7),"CCRDUPA");
	private final Elementary litCardFile = new Elementary(root,new AlphanumericType(8),"CARDDAT ");
	private final Elementary litCardFileAcctPath = new Elementary(root,new AlphanumericType(8),"CARDAIX ");
	

	/**
	 * Instantiate a new WsConstants with a default record.
	 * @param configuration the configuration
	 */
	public WsConstants(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsConstants bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsConstants(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsMaxScreenLines.
	 * @return the wsMaxScreenLines attribute reference
	 */
	public ElementaryRangeReference getWsMaxScreenLinesReference() {
		return wsMaxScreenLines.getReference();
	}

	/**
	 * Getter for wsMaxScreenLines attribute.
	 * @return wsMaxScreenLines attribute
	 */
	public int getWsMaxScreenLines() {
		return wsMaxScreenLines.getValue();
	}

	/**
	 * Setter for wsMaxScreenLines attribute.
	 * @param wsMaxScreenLines the new value of wsMaxScreenLines
	 */
	public void setWsMaxScreenLines(int wsMaxScreenLines) {
		this.wsMaxScreenLines.setValue(wsMaxScreenLines);
	}
	/**
	 * Gets the reference for attribute litThispgm.
	 * @return the litThispgm attribute reference
	 */
	public ElementaryRangeReference getLitThispgmReference() {
		return litThispgm.getReference();
	}

	/**
	 * Getter for litThispgm attribute.
	 * @return litThispgm attribute
	 */
	public String getLitThispgm() {
		return litThispgm.getValue();
	}

	/**
	 * Setter for litThispgm attribute.
	 * @param litThispgm the new value of litThispgm
	 */
	public void setLitThispgm(String litThispgm) {
		this.litThispgm.setValue(litThispgm);
	}
	/**
	 * Gets the reference for attribute litThistranid.
	 * @return the litThistranid attribute reference
	 */
	public ElementaryRangeReference getLitThistranidReference() {
		return litThistranid.getReference();
	}

	/**
	 * Getter for litThistranid attribute.
	 * @return litThistranid attribute
	 */
	public String getLitThistranid() {
		return litThistranid.getValue();
	}

	/**
	 * Setter for litThistranid attribute.
	 * @param litThistranid the new value of litThistranid
	 */
	public void setLitThistranid(String litThistranid) {
		this.litThistranid.setValue(litThistranid);
	}
	/**
	 * Gets the reference for attribute litThismapset.
	 * @return the litThismapset attribute reference
	 */
	public ElementaryRangeReference getLitThismapsetReference() {
		return litThismapset.getReference();
	}

	/**
	 * Getter for litThismapset attribute.
	 * @return litThismapset attribute
	 */
	public String getLitThismapset() {
		return litThismapset.getValue();
	}

	/**
	 * Setter for litThismapset attribute.
	 * @param litThismapset the new value of litThismapset
	 */
	public void setLitThismapset(String litThismapset) {
		this.litThismapset.setValue(litThismapset);
	}
	/**
	 * Gets the reference for attribute litThismap.
	 * @return the litThismap attribute reference
	 */
	public ElementaryRangeReference getLitThismapReference() {
		return litThismap.getReference();
	}

	/**
	 * Getter for litThismap attribute.
	 * @return litThismap attribute
	 */
	public String getLitThismap() {
		return litThismap.getValue();
	}

	/**
	 * Setter for litThismap attribute.
	 * @param litThismap the new value of litThismap
	 */
	public void setLitThismap(String litThismap) {
		this.litThismap.setValue(litThismap);
	}
	/**
	 * Gets the reference for attribute litMenupgm.
	 * @return the litMenupgm attribute reference
	 */
	public ElementaryRangeReference getLitMenupgmReference() {
		return litMenupgm.getReference();
	}

	/**
	 * Getter for litMenupgm attribute.
	 * @return litMenupgm attribute
	 */
	public String getLitMenupgm() {
		return litMenupgm.getValue();
	}

	/**
	 * Setter for litMenupgm attribute.
	 * @param litMenupgm the new value of litMenupgm
	 */
	public void setLitMenupgm(String litMenupgm) {
		this.litMenupgm.setValue(litMenupgm);
	}
	/**
	 * Gets the reference for attribute litMenutranid.
	 * @return the litMenutranid attribute reference
	 */
	public ElementaryRangeReference getLitMenutranidReference() {
		return litMenutranid.getReference();
	}

	/**
	 * Getter for litMenutranid attribute.
	 * @return litMenutranid attribute
	 */
	public String getLitMenutranid() {
		return litMenutranid.getValue();
	}

	/**
	 * Setter for litMenutranid attribute.
	 * @param litMenutranid the new value of litMenutranid
	 */
	public void setLitMenutranid(String litMenutranid) {
		this.litMenutranid.setValue(litMenutranid);
	}
	/**
	 * Gets the reference for attribute litMenumapset.
	 * @return the litMenumapset attribute reference
	 */
	public ElementaryRangeReference getLitMenumapsetReference() {
		return litMenumapset.getReference();
	}

	/**
	 * Getter for litMenumapset attribute.
	 * @return litMenumapset attribute
	 */
	public String getLitMenumapset() {
		return litMenumapset.getValue();
	}

	/**
	 * Setter for litMenumapset attribute.
	 * @param litMenumapset the new value of litMenumapset
	 */
	public void setLitMenumapset(String litMenumapset) {
		this.litMenumapset.setValue(litMenumapset);
	}
	/**
	 * Gets the reference for attribute litMenumap.
	 * @return the litMenumap attribute reference
	 */
	public ElementaryRangeReference getLitMenumapReference() {
		return litMenumap.getReference();
	}

	/**
	 * Getter for litMenumap attribute.
	 * @return litMenumap attribute
	 */
	public String getLitMenumap() {
		return litMenumap.getValue();
	}

	/**
	 * Setter for litMenumap attribute.
	 * @param litMenumap the new value of litMenumap
	 */
	public void setLitMenumap(String litMenumap) {
		this.litMenumap.setValue(litMenumap);
	}
	/**
	 * Gets the reference for attribute litCarddtlpgm.
	 * @return the litCarddtlpgm attribute reference
	 */
	public ElementaryRangeReference getLitCarddtlpgmReference() {
		return litCarddtlpgm.getReference();
	}

	/**
	 * Getter for litCarddtlpgm attribute.
	 * @return litCarddtlpgm attribute
	 */
	public String getLitCarddtlpgm() {
		return litCarddtlpgm.getValue();
	}

	/**
	 * Setter for litCarddtlpgm attribute.
	 * @param litCarddtlpgm the new value of litCarddtlpgm
	 */
	public void setLitCarddtlpgm(String litCarddtlpgm) {
		this.litCarddtlpgm.setValue(litCarddtlpgm);
	}
	/**
	 * Gets the reference for attribute litCarddtltranid.
	 * @return the litCarddtltranid attribute reference
	 */
	public ElementaryRangeReference getLitCarddtltranidReference() {
		return litCarddtltranid.getReference();
	}

	/**
	 * Getter for litCarddtltranid attribute.
	 * @return litCarddtltranid attribute
	 */
	public String getLitCarddtltranid() {
		return litCarddtltranid.getValue();
	}

	/**
	 * Setter for litCarddtltranid attribute.
	 * @param litCarddtltranid the new value of litCarddtltranid
	 */
	public void setLitCarddtltranid(String litCarddtltranid) {
		this.litCarddtltranid.setValue(litCarddtltranid);
	}
	/**
	 * Gets the reference for attribute litCarddtlmapset.
	 * @return the litCarddtlmapset attribute reference
	 */
	public ElementaryRangeReference getLitCarddtlmapsetReference() {
		return litCarddtlmapset.getReference();
	}

	/**
	 * Getter for litCarddtlmapset attribute.
	 * @return litCarddtlmapset attribute
	 */
	public String getLitCarddtlmapset() {
		return litCarddtlmapset.getValue();
	}

	/**
	 * Setter for litCarddtlmapset attribute.
	 * @param litCarddtlmapset the new value of litCarddtlmapset
	 */
	public void setLitCarddtlmapset(String litCarddtlmapset) {
		this.litCarddtlmapset.setValue(litCarddtlmapset);
	}
	/**
	 * Gets the reference for attribute litCarddtlmap.
	 * @return the litCarddtlmap attribute reference
	 */
	public ElementaryRangeReference getLitCarddtlmapReference() {
		return litCarddtlmap.getReference();
	}

	/**
	 * Getter for litCarddtlmap attribute.
	 * @return litCarddtlmap attribute
	 */
	public String getLitCarddtlmap() {
		return litCarddtlmap.getValue();
	}

	/**
	 * Setter for litCarddtlmap attribute.
	 * @param litCarddtlmap the new value of litCarddtlmap
	 */
	public void setLitCarddtlmap(String litCarddtlmap) {
		this.litCarddtlmap.setValue(litCarddtlmap);
	}
	/**
	 * Gets the reference for attribute litCardupdpgm.
	 * @return the litCardupdpgm attribute reference
	 */
	public ElementaryRangeReference getLitCardupdpgmReference() {
		return litCardupdpgm.getReference();
	}

	/**
	 * Getter for litCardupdpgm attribute.
	 * @return litCardupdpgm attribute
	 */
	public String getLitCardupdpgm() {
		return litCardupdpgm.getValue();
	}

	/**
	 * Setter for litCardupdpgm attribute.
	 * @param litCardupdpgm the new value of litCardupdpgm
	 */
	public void setLitCardupdpgm(String litCardupdpgm) {
		this.litCardupdpgm.setValue(litCardupdpgm);
	}
	/**
	 * Gets the reference for attribute litCardupdtranid.
	 * @return the litCardupdtranid attribute reference
	 */
	public ElementaryRangeReference getLitCardupdtranidReference() {
		return litCardupdtranid.getReference();
	}

	/**
	 * Getter for litCardupdtranid attribute.
	 * @return litCardupdtranid attribute
	 */
	public String getLitCardupdtranid() {
		return litCardupdtranid.getValue();
	}

	/**
	 * Setter for litCardupdtranid attribute.
	 * @param litCardupdtranid the new value of litCardupdtranid
	 */
	public void setLitCardupdtranid(String litCardupdtranid) {
		this.litCardupdtranid.setValue(litCardupdtranid);
	}
	/**
	 * Gets the reference for attribute litCardupdmapset.
	 * @return the litCardupdmapset attribute reference
	 */
	public ElementaryRangeReference getLitCardupdmapsetReference() {
		return litCardupdmapset.getReference();
	}

	/**
	 * Getter for litCardupdmapset attribute.
	 * @return litCardupdmapset attribute
	 */
	public String getLitCardupdmapset() {
		return litCardupdmapset.getValue();
	}

	/**
	 * Setter for litCardupdmapset attribute.
	 * @param litCardupdmapset the new value of litCardupdmapset
	 */
	public void setLitCardupdmapset(String litCardupdmapset) {
		this.litCardupdmapset.setValue(litCardupdmapset);
	}
	/**
	 * Gets the reference for attribute litCardupdmap.
	 * @return the litCardupdmap attribute reference
	 */
	public ElementaryRangeReference getLitCardupdmapReference() {
		return litCardupdmap.getReference();
	}

	/**
	 * Getter for litCardupdmap attribute.
	 * @return litCardupdmap attribute
	 */
	public String getLitCardupdmap() {
		return litCardupdmap.getValue();
	}

	/**
	 * Setter for litCardupdmap attribute.
	 * @param litCardupdmap the new value of litCardupdmap
	 */
	public void setLitCardupdmap(String litCardupdmap) {
		this.litCardupdmap.setValue(litCardupdmap);
	}
	/**
	 * Gets the reference for attribute litCardFile.
	 * @return the litCardFile attribute reference
	 */
	public ElementaryRangeReference getLitCardFileReference() {
		return litCardFile.getReference();
	}

	/**
	 * Getter for litCardFile attribute.
	 * @return litCardFile attribute
	 */
	public String getLitCardFile() {
		return litCardFile.getValue();
	}

	/**
	 * Setter for litCardFile attribute.
	 * @param litCardFile the new value of litCardFile
	 */
	public void setLitCardFile(String litCardFile) {
		this.litCardFile.setValue(litCardFile);
	}
	/**
	 * Gets the reference for attribute litCardFileAcctPath.
	 * @return the litCardFileAcctPath attribute reference
	 */
	public ElementaryRangeReference getLitCardFileAcctPathReference() {
		return litCardFileAcctPath.getReference();
	}

	/**
	 * Getter for litCardFileAcctPath attribute.
	 * @return litCardFileAcctPath attribute
	 */
	public String getLitCardFileAcctPath() {
		return litCardFileAcctPath.getValue();
	}

	/**
	 * Setter for litCardFileAcctPath attribute.
	 * @param litCardFileAcctPath the new value of litCardFileAcctPath
	 */
	public void setLitCardFileAcctPath(String litCardFileAcctPath) {
		this.litCardFileAcctPath.setValue(litCardFileAcctPath);
	}
}
