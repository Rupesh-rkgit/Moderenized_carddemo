package aws.bluage.l3.workshop.cocrdslc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity WsLiterals.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *        Literals and Constants<br>
 *  ****************************************************************<br>
</pre>
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
 * <p>About 'litCclistpgm' field, <br>
 * </p>
 * 
 * <p>About 'litCclisttranid' field, <br>
 * </p>
 * 
 * <p>About 'litCclistmapset' field, <br>
 * </p>
 * 
 * <p>About 'litCclistmap' field, <br>
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
 * <p>About 'litCardfilename' field, <br>
 * </p>
 * 
 * <p>About 'litCardfilenameAcctPath' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsLiterals extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary litThispgm = new Elementary(root,new AlphanumericType(8),"COCRDSLC");
	private final Elementary litThistranid = new Elementary(root,new AlphanumericType(4),"CCDL");
	private final Elementary litThismapset = new Elementary(root,new AlphanumericType(8),"COCRDSL ");
	private final Elementary litThismap = new Elementary(root,new AlphanumericType(7),"CCRDSLA");
	private final Elementary litCclistpgm = new Elementary(root,new AlphanumericType(8),"COCRDLIC");
	private final Elementary litCclisttranid = new Elementary(root,new AlphanumericType(4),"CCLI");
	private final Elementary litCclistmapset = new Elementary(root,new AlphanumericType(7),"COCRDLI");
	private final Elementary litCclistmap = new Elementary(root,new AlphanumericType(7),"CCRDSLA");
	private final Elementary litMenupgm = new Elementary(root,new AlphanumericType(8),"COMEN01C");
	private final Elementary litMenutranid = new Elementary(root,new AlphanumericType(4),"CM00");
	private final Elementary litMenumapset = new Elementary(root,new AlphanumericType(7),"COMEN01");
	private final Elementary litMenumap = new Elementary(root,new AlphanumericType(7),"COMEN1A");
	private final Elementary litCardfilename = new Elementary(root,new AlphanumericType(8),"CARDDAT ");
	private final Elementary litCardfilenameAcctPath = new Elementary(root,new AlphanumericType(8),"CARDAIX ");
	

	/**
	 * Instantiate a new WsLiterals with a default record.
	 * @param configuration the configuration
	 */
	public WsLiterals(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsLiterals bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsLiterals(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
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
	 * Gets the reference for attribute litCclistpgm.
	 * @return the litCclistpgm attribute reference
	 */
	public ElementaryRangeReference getLitCclistpgmReference() {
		return litCclistpgm.getReference();
	}

	/**
	 * Getter for litCclistpgm attribute.
	 * @return litCclistpgm attribute
	 */
	public String getLitCclistpgm() {
		return litCclistpgm.getValue();
	}

	/**
	 * Setter for litCclistpgm attribute.
	 * @param litCclistpgm the new value of litCclistpgm
	 */
	public void setLitCclistpgm(String litCclistpgm) {
		this.litCclistpgm.setValue(litCclistpgm);
	}
	/**
	 * Gets the reference for attribute litCclisttranid.
	 * @return the litCclisttranid attribute reference
	 */
	public ElementaryRangeReference getLitCclisttranidReference() {
		return litCclisttranid.getReference();
	}

	/**
	 * Getter for litCclisttranid attribute.
	 * @return litCclisttranid attribute
	 */
	public String getLitCclisttranid() {
		return litCclisttranid.getValue();
	}

	/**
	 * Setter for litCclisttranid attribute.
	 * @param litCclisttranid the new value of litCclisttranid
	 */
	public void setLitCclisttranid(String litCclisttranid) {
		this.litCclisttranid.setValue(litCclisttranid);
	}
	/**
	 * Gets the reference for attribute litCclistmapset.
	 * @return the litCclistmapset attribute reference
	 */
	public ElementaryRangeReference getLitCclistmapsetReference() {
		return litCclistmapset.getReference();
	}

	/**
	 * Getter for litCclistmapset attribute.
	 * @return litCclistmapset attribute
	 */
	public String getLitCclistmapset() {
		return litCclistmapset.getValue();
	}

	/**
	 * Setter for litCclistmapset attribute.
	 * @param litCclistmapset the new value of litCclistmapset
	 */
	public void setLitCclistmapset(String litCclistmapset) {
		this.litCclistmapset.setValue(litCclistmapset);
	}
	/**
	 * Gets the reference for attribute litCclistmap.
	 * @return the litCclistmap attribute reference
	 */
	public ElementaryRangeReference getLitCclistmapReference() {
		return litCclistmap.getReference();
	}

	/**
	 * Getter for litCclistmap attribute.
	 * @return litCclistmap attribute
	 */
	public String getLitCclistmap() {
		return litCclistmap.getValue();
	}

	/**
	 * Setter for litCclistmap attribute.
	 * @param litCclistmap the new value of litCclistmap
	 */
	public void setLitCclistmap(String litCclistmap) {
		this.litCclistmap.setValue(litCclistmap);
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
	 * Gets the reference for attribute litCardfilename.
	 * @return the litCardfilename attribute reference
	 */
	public ElementaryRangeReference getLitCardfilenameReference() {
		return litCardfilename.getReference();
	}

	/**
	 * Getter for litCardfilename attribute.
	 * @return litCardfilename attribute
	 */
	public String getLitCardfilename() {
		return litCardfilename.getValue();
	}

	/**
	 * Setter for litCardfilename attribute.
	 * @param litCardfilename the new value of litCardfilename
	 */
	public void setLitCardfilename(String litCardfilename) {
		this.litCardfilename.setValue(litCardfilename);
	}
	/**
	 * Gets the reference for attribute litCardfilenameAcctPath.
	 * @return the litCardfilenameAcctPath attribute reference
	 */
	public ElementaryRangeReference getLitCardfilenameAcctPathReference() {
		return litCardfilenameAcctPath.getReference();
	}

	/**
	 * Getter for litCardfilenameAcctPath attribute.
	 * @return litCardfilenameAcctPath attribute
	 */
	public String getLitCardfilenameAcctPath() {
		return litCardfilenameAcctPath.getValue();
	}

	/**
	 * Setter for litCardfilenameAcctPath attribute.
	 * @param litCardfilenameAcctPath the new value of litCardfilenameAcctPath
	 */
	public void setLitCardfilenameAcctPath(String litCardfilenameAcctPath) {
		this.litCardfilenameAcctPath.setValue(litCardfilenameAcctPath);
	}
}
