package aws.bluage.l3.workshop.cotrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.PackedType;
/**
 * Data simplifier entity Dfheiblk.
 * 
 * <p>About 'eibtime' field, <br>
 * </p>
 * 
 * <p>About 'eibdate' field, <br>
 * </p>
 * 
 * <p>About 'eibtrnid' field, <br>
 * </p>
 * 
 * <p>About 'eibtaskn' field, <br>
 * </p>
 * 
 * <p>About 'eibtrmid' field, <br>
 * </p>
 * 
 * <p>About 'dfheigdi' field, <br>
 * </p>
 * 
 * <p>About 'eibcposn' field, <br>
 * </p>
 * 
 * <p>About 'eibcalen' field, <br>
 * </p>
 * 
 * <p>About 'eibaid' field, <br>
 * </p>
 * 
 * <p>About 'eibfn' field, <br>
 * </p>
 * 
 * <p>About 'eibrcode' field, <br>
 * </p>
 * 
 * <p>About 'eibds' field, <br>
 * </p>
 * 
 * <p>About 'eibreqid' field, <br>
 * </p>
 * 
 * <p>About 'eibrsrce' field, <br>
 * </p>
 * 
 * <p>About 'eibsync' field, <br>
 * </p>
 * 
 * <p>About 'eibfree' field, <br>
 * </p>
 * 
 * <p>About 'eibrecv' field, <br>
 * </p>
 * 
 * <p>About 'eibfil' field, <br>
 * </p>
 * 
 * <p>About 'eibatt' field, <br>
 * </p>
 * 
 * <p>About 'eibeoc' field, <br>
 * </p>
 * 
 * <p>About 'eibfmh' field, <br>
 * </p>
 * 
 * <p>About 'eibcompl' field, <br>
 * </p>
 * 
 * <p>About 'eibsig' field, <br>
 * </p>
 * 
 * <p>About 'eibconf' field, <br>
 * </p>
 * 
 * <p>About 'eiberr' field, <br>
 * </p>
 * 
 * <p>About 'eiberrcd' field, <br>
 * </p>
 * 
 * <p>About 'eibsynrb' field, <br>
 * </p>
 * 
 * <p>About 'eibnodat' field, <br>
 * </p>
 * 
 * <p>About 'eibresp' field, <br>
 * </p>
 * 
 * <p>About 'eibresp2' field, <br>
 * </p>
 * 
 * <p>About 'eibrldbk' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class Dfheiblk extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary eibtime = new Elementary(root,new PackedType(7, 0, false, false, true));
	private final Elementary eibdate = new Elementary(root,new PackedType(7, 0, false, false, true));
	private final Elementary eibtrnid = new Elementary(root,new AlphanumericType(4));
	private final Elementary eibtaskn = new Elementary(root,new PackedType(7, 0, false, false, true));
	private final Elementary eibtrmid = new Elementary(root,new AlphanumericType(4));
	private final Elementary dfheigdi = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true));
	private final Elementary eibcposn = new Elementary(root,new BinaryType(4, 0, "STD", false, false, true));
	private final Elementary eibcalen = new Elementary(root,new BinaryType(4, 0, "BIN", false, false, true));
	private final Elementary eibaid = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibfn = new Elementary(root,new AlphanumericType(2));
	private final Elementary eibrcode = new Elementary(root,new AlphanumericType(6));
	private final Elementary eibds = new Elementary(root,new AlphanumericType(8));
	private final Elementary eibreqid = new Elementary(root,new AlphanumericType(8));
	private final Elementary eibrsrce = new Elementary(root,new AlphanumericType(8));
	private final Elementary eibsync = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibfree = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibrecv = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibfil = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibatt = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibeoc = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibfmh = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibcompl = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibsig = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibconf = new Elementary(root,new AlphanumericType(1));
	private final Elementary eiberr = new Elementary(root,new AlphanumericType(1));
	private final Elementary eiberrcd = new Elementary(root,new AlphanumericType(4));
	private final Elementary eibsynrb = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibnodat = new Elementary(root,new AlphanumericType(1));
	private final Elementary eibresp = new Elementary(root,new BinaryType(8, 0, "STD", false, false, true));
	private final Elementary eibresp2 = new Elementary(root,new BinaryType(8, 0, "STD", false, false, true));
	private final Elementary eibrldbk = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new Dfheiblk with a default record.
	 * @param configuration the configuration
	 */
	public Dfheiblk(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Dfheiblk bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Dfheiblk(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute eibtime.
	 * @return the eibtime attribute reference
	 */
	public ElementaryRangeReference getEibtimeReference() {
		return eibtime.getReference();
	}

	/**
	 * Getter for eibtime attribute.
	 * @return eibtime attribute
	 */
	public int getEibtime() {
		return eibtime.getValue();
	}

	/**
	 * Setter for eibtime attribute.
	 * @param eibtime the new value of eibtime
	 */
	public void setEibtime(int eibtime) {
		this.eibtime.setValue(eibtime);
	}
	/**
	 * Gets the reference for attribute eibdate.
	 * @return the eibdate attribute reference
	 */
	public ElementaryRangeReference getEibdateReference() {
		return eibdate.getReference();
	}

	/**
	 * Getter for eibdate attribute.
	 * @return eibdate attribute
	 */
	public int getEibdate() {
		return eibdate.getValue();
	}

	/**
	 * Setter for eibdate attribute.
	 * @param eibdate the new value of eibdate
	 */
	public void setEibdate(int eibdate) {
		this.eibdate.setValue(eibdate);
	}
	/**
	 * Gets the reference for attribute eibtrnid.
	 * @return the eibtrnid attribute reference
	 */
	public ElementaryRangeReference getEibtrnidReference() {
		return eibtrnid.getReference();
	}

	/**
	 * Getter for eibtrnid attribute.
	 * @return eibtrnid attribute
	 */
	public String getEibtrnid() {
		return eibtrnid.getValue();
	}

	/**
	 * Setter for eibtrnid attribute.
	 * @param eibtrnid the new value of eibtrnid
	 */
	public void setEibtrnid(String eibtrnid) {
		this.eibtrnid.setValue(eibtrnid);
	}
	/**
	 * Gets the reference for attribute eibtaskn.
	 * @return the eibtaskn attribute reference
	 */
	public ElementaryRangeReference getEibtasknReference() {
		return eibtaskn.getReference();
	}

	/**
	 * Getter for eibtaskn attribute.
	 * @return eibtaskn attribute
	 */
	public int getEibtaskn() {
		return eibtaskn.getValue();
	}

	/**
	 * Setter for eibtaskn attribute.
	 * @param eibtaskn the new value of eibtaskn
	 */
	public void setEibtaskn(int eibtaskn) {
		this.eibtaskn.setValue(eibtaskn);
	}
	/**
	 * Gets the reference for attribute eibtrmid.
	 * @return the eibtrmid attribute reference
	 */
	public ElementaryRangeReference getEibtrmidReference() {
		return eibtrmid.getReference();
	}

	/**
	 * Getter for eibtrmid attribute.
	 * @return eibtrmid attribute
	 */
	public String getEibtrmid() {
		return eibtrmid.getValue();
	}

	/**
	 * Setter for eibtrmid attribute.
	 * @param eibtrmid the new value of eibtrmid
	 */
	public void setEibtrmid(String eibtrmid) {
		this.eibtrmid.setValue(eibtrmid);
	}
	/**
	 * Gets the reference for attribute dfheigdi.
	 * @return the dfheigdi attribute reference
	 */
	public ElementaryRangeReference getDfheigdiReference() {
		return dfheigdi.getReference();
	}

	/**
	 * Getter for dfheigdi attribute.
	 * @return dfheigdi attribute
	 */
	public int getDfheigdi() {
		return dfheigdi.getValue();
	}

	/**
	 * Setter for dfheigdi attribute.
	 * @param dfheigdi the new value of dfheigdi
	 */
	public void setDfheigdi(int dfheigdi) {
		this.dfheigdi.setValue(dfheigdi);
	}
	/**
	 * Gets the reference for attribute eibcposn.
	 * @return the eibcposn attribute reference
	 */
	public ElementaryRangeReference getEibcposnReference() {
		return eibcposn.getReference();
	}

	/**
	 * Getter for eibcposn attribute.
	 * @return eibcposn attribute
	 */
	public int getEibcposn() {
		return eibcposn.getValue();
	}

	/**
	 * Setter for eibcposn attribute.
	 * @param eibcposn the new value of eibcposn
	 */
	public void setEibcposn(int eibcposn) {
		this.eibcposn.setValue(eibcposn);
	}
	/**
	 * Gets the reference for attribute eibcalen.
	 * @return the eibcalen attribute reference
	 */
	public ElementaryRangeReference getEibcalenReference() {
		return eibcalen.getReference();
	}

	/**
	 * Getter for eibcalen attribute.
	 * @return eibcalen attribute
	 */
	public int getEibcalen() {
		return eibcalen.getValue();
	}

	/**
	 * Setter for eibcalen attribute.
	 * @param eibcalen the new value of eibcalen
	 */
	public void setEibcalen(int eibcalen) {
		this.eibcalen.setValue(eibcalen);
	}
	/**
	 * Gets the reference for attribute eibaid.
	 * @return the eibaid attribute reference
	 */
	public ElementaryRangeReference getEibaidReference() {
		return eibaid.getReference();
	}

	/**
	 * Getter for eibaid attribute.
	 * @return eibaid attribute
	 */
	public String getEibaid() {
		return eibaid.getValue();
	}

	/**
	 * Setter for eibaid attribute.
	 * @param eibaid the new value of eibaid
	 */
	public void setEibaid(String eibaid) {
		this.eibaid.setValue(eibaid);
	}
	/**
	 * Gets the reference for attribute eibfn.
	 * @return the eibfn attribute reference
	 */
	public ElementaryRangeReference getEibfnReference() {
		return eibfn.getReference();
	}

	/**
	 * Getter for eibfn attribute.
	 * @return eibfn attribute
	 */
	public String getEibfn() {
		return eibfn.getValue();
	}

	/**
	 * Setter for eibfn attribute.
	 * @param eibfn the new value of eibfn
	 */
	public void setEibfn(String eibfn) {
		this.eibfn.setValue(eibfn);
	}
	/**
	 * Gets the reference for attribute eibrcode.
	 * @return the eibrcode attribute reference
	 */
	public ElementaryRangeReference getEibrcodeReference() {
		return eibrcode.getReference();
	}

	/**
	 * Getter for eibrcode attribute.
	 * @return eibrcode attribute
	 */
	public String getEibrcode() {
		return eibrcode.getValue();
	}

	/**
	 * Setter for eibrcode attribute.
	 * @param eibrcode the new value of eibrcode
	 */
	public void setEibrcode(String eibrcode) {
		this.eibrcode.setValue(eibrcode);
	}
	/**
	 * Gets the reference for attribute eibds.
	 * @return the eibds attribute reference
	 */
	public ElementaryRangeReference getEibdsReference() {
		return eibds.getReference();
	}

	/**
	 * Getter for eibds attribute.
	 * @return eibds attribute
	 */
	public String getEibds() {
		return eibds.getValue();
	}

	/**
	 * Setter for eibds attribute.
	 * @param eibds the new value of eibds
	 */
	public void setEibds(String eibds) {
		this.eibds.setValue(eibds);
	}
	/**
	 * Gets the reference for attribute eibreqid.
	 * @return the eibreqid attribute reference
	 */
	public ElementaryRangeReference getEibreqidReference() {
		return eibreqid.getReference();
	}

	/**
	 * Getter for eibreqid attribute.
	 * @return eibreqid attribute
	 */
	public String getEibreqid() {
		return eibreqid.getValue();
	}

	/**
	 * Setter for eibreqid attribute.
	 * @param eibreqid the new value of eibreqid
	 */
	public void setEibreqid(String eibreqid) {
		this.eibreqid.setValue(eibreqid);
	}
	/**
	 * Gets the reference for attribute eibrsrce.
	 * @return the eibrsrce attribute reference
	 */
	public ElementaryRangeReference getEibrsrceReference() {
		return eibrsrce.getReference();
	}

	/**
	 * Getter for eibrsrce attribute.
	 * @return eibrsrce attribute
	 */
	public String getEibrsrce() {
		return eibrsrce.getValue();
	}

	/**
	 * Setter for eibrsrce attribute.
	 * @param eibrsrce the new value of eibrsrce
	 */
	public void setEibrsrce(String eibrsrce) {
		this.eibrsrce.setValue(eibrsrce);
	}
	/**
	 * Gets the reference for attribute eibsync.
	 * @return the eibsync attribute reference
	 */
	public ElementaryRangeReference getEibsyncReference() {
		return eibsync.getReference();
	}

	/**
	 * Getter for eibsync attribute.
	 * @return eibsync attribute
	 */
	public String getEibsync() {
		return eibsync.getValue();
	}

	/**
	 * Setter for eibsync attribute.
	 * @param eibsync the new value of eibsync
	 */
	public void setEibsync(String eibsync) {
		this.eibsync.setValue(eibsync);
	}
	/**
	 * Gets the reference for attribute eibfree.
	 * @return the eibfree attribute reference
	 */
	public ElementaryRangeReference getEibfreeReference() {
		return eibfree.getReference();
	}

	/**
	 * Getter for eibfree attribute.
	 * @return eibfree attribute
	 */
	public String getEibfree() {
		return eibfree.getValue();
	}

	/**
	 * Setter for eibfree attribute.
	 * @param eibfree the new value of eibfree
	 */
	public void setEibfree(String eibfree) {
		this.eibfree.setValue(eibfree);
	}
	/**
	 * Gets the reference for attribute eibrecv.
	 * @return the eibrecv attribute reference
	 */
	public ElementaryRangeReference getEibrecvReference() {
		return eibrecv.getReference();
	}

	/**
	 * Getter for eibrecv attribute.
	 * @return eibrecv attribute
	 */
	public String getEibrecv() {
		return eibrecv.getValue();
	}

	/**
	 * Setter for eibrecv attribute.
	 * @param eibrecv the new value of eibrecv
	 */
	public void setEibrecv(String eibrecv) {
		this.eibrecv.setValue(eibrecv);
	}
	/**
	 * Gets the reference for attribute eibfil.
	 * @return the eibfil attribute reference
	 */
	public ElementaryRangeReference getEibfilReference() {
		return eibfil.getReference();
	}

	/**
	 * Getter for eibfil attribute.
	 * @return eibfil attribute
	 */
	public String getEibfil() {
		return eibfil.getValue();
	}

	/**
	 * Setter for eibfil attribute.
	 * @param eibfil the new value of eibfil
	 */
	public void setEibfil(String eibfil) {
		this.eibfil.setValue(eibfil);
	}
	/**
	 * Gets the reference for attribute eibatt.
	 * @return the eibatt attribute reference
	 */
	public ElementaryRangeReference getEibattReference() {
		return eibatt.getReference();
	}

	/**
	 * Getter for eibatt attribute.
	 * @return eibatt attribute
	 */
	public String getEibatt() {
		return eibatt.getValue();
	}

	/**
	 * Setter for eibatt attribute.
	 * @param eibatt the new value of eibatt
	 */
	public void setEibatt(String eibatt) {
		this.eibatt.setValue(eibatt);
	}
	/**
	 * Gets the reference for attribute eibeoc.
	 * @return the eibeoc attribute reference
	 */
	public ElementaryRangeReference getEibeocReference() {
		return eibeoc.getReference();
	}

	/**
	 * Getter for eibeoc attribute.
	 * @return eibeoc attribute
	 */
	public String getEibeoc() {
		return eibeoc.getValue();
	}

	/**
	 * Setter for eibeoc attribute.
	 * @param eibeoc the new value of eibeoc
	 */
	public void setEibeoc(String eibeoc) {
		this.eibeoc.setValue(eibeoc);
	}
	/**
	 * Gets the reference for attribute eibfmh.
	 * @return the eibfmh attribute reference
	 */
	public ElementaryRangeReference getEibfmhReference() {
		return eibfmh.getReference();
	}

	/**
	 * Getter for eibfmh attribute.
	 * @return eibfmh attribute
	 */
	public String getEibfmh() {
		return eibfmh.getValue();
	}

	/**
	 * Setter for eibfmh attribute.
	 * @param eibfmh the new value of eibfmh
	 */
	public void setEibfmh(String eibfmh) {
		this.eibfmh.setValue(eibfmh);
	}
	/**
	 * Gets the reference for attribute eibcompl.
	 * @return the eibcompl attribute reference
	 */
	public ElementaryRangeReference getEibcomplReference() {
		return eibcompl.getReference();
	}

	/**
	 * Getter for eibcompl attribute.
	 * @return eibcompl attribute
	 */
	public String getEibcompl() {
		return eibcompl.getValue();
	}

	/**
	 * Setter for eibcompl attribute.
	 * @param eibcompl the new value of eibcompl
	 */
	public void setEibcompl(String eibcompl) {
		this.eibcompl.setValue(eibcompl);
	}
	/**
	 * Gets the reference for attribute eibsig.
	 * @return the eibsig attribute reference
	 */
	public ElementaryRangeReference getEibsigReference() {
		return eibsig.getReference();
	}

	/**
	 * Getter for eibsig attribute.
	 * @return eibsig attribute
	 */
	public String getEibsig() {
		return eibsig.getValue();
	}

	/**
	 * Setter for eibsig attribute.
	 * @param eibsig the new value of eibsig
	 */
	public void setEibsig(String eibsig) {
		this.eibsig.setValue(eibsig);
	}
	/**
	 * Gets the reference for attribute eibconf.
	 * @return the eibconf attribute reference
	 */
	public ElementaryRangeReference getEibconfReference() {
		return eibconf.getReference();
	}

	/**
	 * Getter for eibconf attribute.
	 * @return eibconf attribute
	 */
	public String getEibconf() {
		return eibconf.getValue();
	}

	/**
	 * Setter for eibconf attribute.
	 * @param eibconf the new value of eibconf
	 */
	public void setEibconf(String eibconf) {
		this.eibconf.setValue(eibconf);
	}
	/**
	 * Gets the reference for attribute eiberr.
	 * @return the eiberr attribute reference
	 */
	public ElementaryRangeReference getEiberrReference() {
		return eiberr.getReference();
	}

	/**
	 * Getter for eiberr attribute.
	 * @return eiberr attribute
	 */
	public String getEiberr() {
		return eiberr.getValue();
	}

	/**
	 * Setter for eiberr attribute.
	 * @param eiberr the new value of eiberr
	 */
	public void setEiberr(String eiberr) {
		this.eiberr.setValue(eiberr);
	}
	/**
	 * Gets the reference for attribute eiberrcd.
	 * @return the eiberrcd attribute reference
	 */
	public ElementaryRangeReference getEiberrcdReference() {
		return eiberrcd.getReference();
	}

	/**
	 * Getter for eiberrcd attribute.
	 * @return eiberrcd attribute
	 */
	public String getEiberrcd() {
		return eiberrcd.getValue();
	}

	/**
	 * Setter for eiberrcd attribute.
	 * @param eiberrcd the new value of eiberrcd
	 */
	public void setEiberrcd(String eiberrcd) {
		this.eiberrcd.setValue(eiberrcd);
	}
	/**
	 * Gets the reference for attribute eibsynrb.
	 * @return the eibsynrb attribute reference
	 */
	public ElementaryRangeReference getEibsynrbReference() {
		return eibsynrb.getReference();
	}

	/**
	 * Getter for eibsynrb attribute.
	 * @return eibsynrb attribute
	 */
	public String getEibsynrb() {
		return eibsynrb.getValue();
	}

	/**
	 * Setter for eibsynrb attribute.
	 * @param eibsynrb the new value of eibsynrb
	 */
	public void setEibsynrb(String eibsynrb) {
		this.eibsynrb.setValue(eibsynrb);
	}
	/**
	 * Gets the reference for attribute eibnodat.
	 * @return the eibnodat attribute reference
	 */
	public ElementaryRangeReference getEibnodatReference() {
		return eibnodat.getReference();
	}

	/**
	 * Getter for eibnodat attribute.
	 * @return eibnodat attribute
	 */
	public String getEibnodat() {
		return eibnodat.getValue();
	}

	/**
	 * Setter for eibnodat attribute.
	 * @param eibnodat the new value of eibnodat
	 */
	public void setEibnodat(String eibnodat) {
		this.eibnodat.setValue(eibnodat);
	}
	/**
	 * Gets the reference for attribute eibresp.
	 * @return the eibresp attribute reference
	 */
	public ElementaryRangeReference getEibrespReference() {
		return eibresp.getReference();
	}

	/**
	 * Getter for eibresp attribute.
	 * @return eibresp attribute
	 */
	public int getEibresp() {
		return eibresp.getValue();
	}

	/**
	 * Setter for eibresp attribute.
	 * @param eibresp the new value of eibresp
	 */
	public void setEibresp(int eibresp) {
		this.eibresp.setValue(eibresp);
	}
	/**
	 * Gets the reference for attribute eibresp2.
	 * @return the eibresp2 attribute reference
	 */
	public ElementaryRangeReference getEibresp2Reference() {
		return eibresp2.getReference();
	}

	/**
	 * Getter for eibresp2 attribute.
	 * @return eibresp2 attribute
	 */
	public int getEibresp2() {
		return eibresp2.getValue();
	}

	/**
	 * Setter for eibresp2 attribute.
	 * @param eibresp2 the new value of eibresp2
	 */
	public void setEibresp2(int eibresp2) {
		this.eibresp2.setValue(eibresp2);
	}
	/**
	 * Gets the reference for attribute eibrldbk.
	 * @return the eibrldbk attribute reference
	 */
	public ElementaryRangeReference getEibrldbkReference() {
		return eibrldbk.getReference();
	}

	/**
	 * Getter for eibrldbk attribute.
	 * @return eibrldbk attribute
	 */
	public String getEibrldbk() {
		return eibrldbk.getValue();
	}

	/**
	 * Setter for eibrldbk attribute.
	 * @param eibrldbk the new value of eibrldbk
	 */
	public void setEibrldbk(String eibrldbk) {
		this.eibrldbk.setValue(eibrldbk);
	}
}
