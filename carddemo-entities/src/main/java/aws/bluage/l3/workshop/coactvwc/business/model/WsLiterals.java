package aws.bluage.l3.workshop.coactvwc.business.model;

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
 * <p>About 'litCardupdatepgm' field, <br>
 * </p>
 * 
 * <p>About 'litCardudpatetranid' field, <br>
 * </p>
 * 
 * <p>About 'litCardupdatemapset' field, <br>
 * </p>
 * 
 * <p>About 'litCardupdatemap' field, <br>
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
 * <p>About 'litAcctfilename' field, <br>
 * </p>
 * 
 * <p>About 'litCardfilename' field, <br>
 * </p>
 * 
 * <p>About 'litCustfilename' field, <br>
 * </p>
 * 
 * <p>About 'litCardfilenameAcctPath' field, <br>
 * </p>
 * 
 * <p>About 'litCardxrefnameAcctPath' field, <br>
 * </p>
 * 
 * <p>About 'litAllAlphaFrom' field, <br>
 * </p>
 * 
 * <p>About 'litAllSpacesTo' field, <br>
 * </p>
 * 
 * <p>About 'litUpper' field, <br>
 * </p>
 * 
 * <p>About 'litLower' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsLiterals extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary litThispgm = new Elementary(root,new AlphanumericType(8),"COACTVWC");
	private final Elementary litThistranid = new Elementary(root,new AlphanumericType(4),"CAVW");
	private final Elementary litThismapset = new Elementary(root,new AlphanumericType(8),"COACTVW ");
	private final Elementary litThismap = new Elementary(root,new AlphanumericType(7),"CACTVWA");
	private final Elementary litCclistpgm = new Elementary(root,new AlphanumericType(8),"COCRDLIC");
	private final Elementary litCclisttranid = new Elementary(root,new AlphanumericType(4),"CCLI");
	private final Elementary litCclistmapset = new Elementary(root,new AlphanumericType(7),"COCRDLI");
	private final Elementary litCclistmap = new Elementary(root,new AlphanumericType(7),"CCRDSLA");
	private final Elementary litCardupdatepgm = new Elementary(root,new AlphanumericType(8),"COCRDUPC");
	private final Elementary litCardudpatetranid = new Elementary(root,new AlphanumericType(4),"CCUP");
	private final Elementary litCardupdatemapset = new Elementary(root,new AlphanumericType(8),"COCRDUP ");
	private final Elementary litCardupdatemap = new Elementary(root,new AlphanumericType(7),"CCRDUPA");
	private final Elementary litMenupgm = new Elementary(root,new AlphanumericType(8),"COMEN01C");
	private final Elementary litMenutranid = new Elementary(root,new AlphanumericType(4),"CM00");
	private final Elementary litMenumapset = new Elementary(root,new AlphanumericType(7),"COMEN01");
	private final Elementary litMenumap = new Elementary(root,new AlphanumericType(7),"COMEN1A");
	private final Elementary litCarddtlpgm = new Elementary(root,new AlphanumericType(8),"COCRDSLC");
	private final Elementary litCarddtltranid = new Elementary(root,new AlphanumericType(4),"CCDL");
	private final Elementary litCarddtlmapset = new Elementary(root,new AlphanumericType(7),"COCRDSL");
	private final Elementary litCarddtlmap = new Elementary(root,new AlphanumericType(7),"CCRDSLA");
	private final Elementary litAcctfilename = new Elementary(root,new AlphanumericType(8),"ACCTDAT ");
	private final Elementary litCardfilename = new Elementary(root,new AlphanumericType(8),"CARDDAT ");
	private final Elementary litCustfilename = new Elementary(root,new AlphanumericType(8),"CUSTDAT ");
	private final Elementary litCardfilenameAcctPath = new Elementary(root,new AlphanumericType(8),"CARDAIX ");
	private final Elementary litCardxrefnameAcctPath = new Elementary(root,new AlphanumericType(8),"CXACAIX ");
	private final Elementary litAllAlphaFrom = new Elementary(root,new AlphanumericType(52),"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
	private final Elementary litAllSpacesTo = new Elementary(root,new AlphanumericType(52)," ");
	private final Elementary litUpper = new Elementary(root,new AlphanumericType(26),"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	private final Elementary litLower = new Elementary(root,new AlphanumericType(26),"abcdefghijklmnopqrstuvwxyz");
	

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
	 * Gets the reference for attribute litCardupdatepgm.
	 * @return the litCardupdatepgm attribute reference
	 */
	public ElementaryRangeReference getLitCardupdatepgmReference() {
		return litCardupdatepgm.getReference();
	}

	/**
	 * Getter for litCardupdatepgm attribute.
	 * @return litCardupdatepgm attribute
	 */
	public String getLitCardupdatepgm() {
		return litCardupdatepgm.getValue();
	}

	/**
	 * Setter for litCardupdatepgm attribute.
	 * @param litCardupdatepgm the new value of litCardupdatepgm
	 */
	public void setLitCardupdatepgm(String litCardupdatepgm) {
		this.litCardupdatepgm.setValue(litCardupdatepgm);
	}
	/**
	 * Gets the reference for attribute litCardudpatetranid.
	 * @return the litCardudpatetranid attribute reference
	 */
	public ElementaryRangeReference getLitCardudpatetranidReference() {
		return litCardudpatetranid.getReference();
	}

	/**
	 * Getter for litCardudpatetranid attribute.
	 * @return litCardudpatetranid attribute
	 */
	public String getLitCardudpatetranid() {
		return litCardudpatetranid.getValue();
	}

	/**
	 * Setter for litCardudpatetranid attribute.
	 * @param litCardudpatetranid the new value of litCardudpatetranid
	 */
	public void setLitCardudpatetranid(String litCardudpatetranid) {
		this.litCardudpatetranid.setValue(litCardudpatetranid);
	}
	/**
	 * Gets the reference for attribute litCardupdatemapset.
	 * @return the litCardupdatemapset attribute reference
	 */
	public ElementaryRangeReference getLitCardupdatemapsetReference() {
		return litCardupdatemapset.getReference();
	}

	/**
	 * Getter for litCardupdatemapset attribute.
	 * @return litCardupdatemapset attribute
	 */
	public String getLitCardupdatemapset() {
		return litCardupdatemapset.getValue();
	}

	/**
	 * Setter for litCardupdatemapset attribute.
	 * @param litCardupdatemapset the new value of litCardupdatemapset
	 */
	public void setLitCardupdatemapset(String litCardupdatemapset) {
		this.litCardupdatemapset.setValue(litCardupdatemapset);
	}
	/**
	 * Gets the reference for attribute litCardupdatemap.
	 * @return the litCardupdatemap attribute reference
	 */
	public ElementaryRangeReference getLitCardupdatemapReference() {
		return litCardupdatemap.getReference();
	}

	/**
	 * Getter for litCardupdatemap attribute.
	 * @return litCardupdatemap attribute
	 */
	public String getLitCardupdatemap() {
		return litCardupdatemap.getValue();
	}

	/**
	 * Setter for litCardupdatemap attribute.
	 * @param litCardupdatemap the new value of litCardupdatemap
	 */
	public void setLitCardupdatemap(String litCardupdatemap) {
		this.litCardupdatemap.setValue(litCardupdatemap);
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
	 * Gets the reference for attribute litAcctfilename.
	 * @return the litAcctfilename attribute reference
	 */
	public ElementaryRangeReference getLitAcctfilenameReference() {
		return litAcctfilename.getReference();
	}

	/**
	 * Getter for litAcctfilename attribute.
	 * @return litAcctfilename attribute
	 */
	public String getLitAcctfilename() {
		return litAcctfilename.getValue();
	}

	/**
	 * Setter for litAcctfilename attribute.
	 * @param litAcctfilename the new value of litAcctfilename
	 */
	public void setLitAcctfilename(String litAcctfilename) {
		this.litAcctfilename.setValue(litAcctfilename);
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
	 * Gets the reference for attribute litCustfilename.
	 * @return the litCustfilename attribute reference
	 */
	public ElementaryRangeReference getLitCustfilenameReference() {
		return litCustfilename.getReference();
	}

	/**
	 * Getter for litCustfilename attribute.
	 * @return litCustfilename attribute
	 */
	public String getLitCustfilename() {
		return litCustfilename.getValue();
	}

	/**
	 * Setter for litCustfilename attribute.
	 * @param litCustfilename the new value of litCustfilename
	 */
	public void setLitCustfilename(String litCustfilename) {
		this.litCustfilename.setValue(litCustfilename);
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
	/**
	 * Gets the reference for attribute litCardxrefnameAcctPath.
	 * @return the litCardxrefnameAcctPath attribute reference
	 */
	public ElementaryRangeReference getLitCardxrefnameAcctPathReference() {
		return litCardxrefnameAcctPath.getReference();
	}

	/**
	 * Getter for litCardxrefnameAcctPath attribute.
	 * @return litCardxrefnameAcctPath attribute
	 */
	public String getLitCardxrefnameAcctPath() {
		return litCardxrefnameAcctPath.getValue();
	}

	/**
	 * Setter for litCardxrefnameAcctPath attribute.
	 * @param litCardxrefnameAcctPath the new value of litCardxrefnameAcctPath
	 */
	public void setLitCardxrefnameAcctPath(String litCardxrefnameAcctPath) {
		this.litCardxrefnameAcctPath.setValue(litCardxrefnameAcctPath);
	}
	/**
	 * Gets the reference for attribute litAllAlphaFrom.
	 * @return the litAllAlphaFrom attribute reference
	 */
	public ElementaryRangeReference getLitAllAlphaFromReference() {
		return litAllAlphaFrom.getReference();
	}

	/**
	 * Getter for litAllAlphaFrom attribute.
	 * @return litAllAlphaFrom attribute
	 */
	public String getLitAllAlphaFrom() {
		return litAllAlphaFrom.getValue();
	}

	/**
	 * Setter for litAllAlphaFrom attribute.
	 * @param litAllAlphaFrom the new value of litAllAlphaFrom
	 */
	public void setLitAllAlphaFrom(String litAllAlphaFrom) {
		this.litAllAlphaFrom.setValue(litAllAlphaFrom);
	}
	/**
	 * Gets the reference for attribute litAllSpacesTo.
	 * @return the litAllSpacesTo attribute reference
	 */
	public ElementaryRangeReference getLitAllSpacesToReference() {
		return litAllSpacesTo.getReference();
	}

	/**
	 * Getter for litAllSpacesTo attribute.
	 * @return litAllSpacesTo attribute
	 */
	public String getLitAllSpacesTo() {
		return litAllSpacesTo.getValue();
	}

	/**
	 * Setter for litAllSpacesTo attribute.
	 * @param litAllSpacesTo the new value of litAllSpacesTo
	 */
	public void setLitAllSpacesTo(String litAllSpacesTo) {
		this.litAllSpacesTo.setValue(litAllSpacesTo);
	}
	/**
	 * Gets the reference for attribute litUpper.
	 * @return the litUpper attribute reference
	 */
	public ElementaryRangeReference getLitUpperReference() {
		return litUpper.getReference();
	}

	/**
	 * Getter for litUpper attribute.
	 * @return litUpper attribute
	 */
	public String getLitUpper() {
		return litUpper.getValue();
	}

	/**
	 * Setter for litUpper attribute.
	 * @param litUpper the new value of litUpper
	 */
	public void setLitUpper(String litUpper) {
		this.litUpper.setValue(litUpper);
	}
	/**
	 * Gets the reference for attribute litLower.
	 * @return the litLower attribute reference
	 */
	public ElementaryRangeReference getLitLowerReference() {
		return litLower.getReference();
	}

	/**
	 * Getter for litLower attribute.
	 * @return litLower attribute
	 */
	public String getLitLower() {
		return litLower.getValue();
	}

	/**
	 * Setter for litLower attribute.
	 * @param litLower the new value of litLower
	 */
	public void setLitLower(String litLower) {
		this.litLower.setValue(litLower);
	}
}
