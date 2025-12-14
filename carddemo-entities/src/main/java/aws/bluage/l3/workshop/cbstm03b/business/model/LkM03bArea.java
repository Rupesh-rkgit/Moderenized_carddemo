package aws.bluage.l3.workshop.cbstm03b.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity LkM03bArea.
 * 
 * <p>About 'lkM03bDd' field, <br>
 * </p>
 * 
 * <p>About 'lkM03bOper' field, <br>
 * </p>
 * 
 * <p>About 'm03bOpen' field, <br>
 * </p>
 * 
 * <p>About 'm03bClose' field, <br>
 * </p>
 * 
 * <p>About 'm03bRead' field, <br>
 * </p>
 * 
 * <p>About 'm03bReadK' field, <br>
 * </p>
 * 
 * <p>About 'm03bWrite' field, <br>
 * </p>
 * 
 * <p>About 'm03bRewrite' field, <br>
 * </p>
 * 
 * <p>About 'lkM03bRc' field, <br>
 * </p>
 * 
 * <p>About 'lkM03bKey' field, <br>
 * </p>
 * 
 * <p>About 'lkM03bKeyLn' field, <br>
 * </p>
 * 
 * <p>About 'lkM03bFldt' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class LkM03bArea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary lkM03bDd = new Elementary(root,new AlphanumericType(8));
	private final Elementary lkM03bOper = new Elementary(root,new AlphanumericType(1));
	private final ConditionName m03bOpen=new ConditionName(lkM03bOper,"O");
	private final ConditionName m03bClose=new ConditionName(lkM03bOper,"C");
	private final ConditionName m03bRead=new ConditionName(lkM03bOper,"R");
	private final ConditionName m03bReadK=new ConditionName(lkM03bOper,"K");
	private final ConditionName m03bWrite=new ConditionName(lkM03bOper,"W");
	private final ConditionName m03bRewrite=new ConditionName(lkM03bOper,"Z");
	private final Elementary lkM03bRc = new Elementary(root,new AlphanumericType(2));
	private final Elementary lkM03bKey = new Elementary(root,new AlphanumericType(25));
	private final Elementary lkM03bKeyLn = new Elementary(root,new ZonedType(4, 0, false, false, true));
	private final Elementary lkM03bFldt = new Elementary(root,new AlphanumericType(1000));
	

	/**
	 * Instantiate a new LkM03bArea with a default record.
	 * @param configuration the configuration
	 */
	public LkM03bArea(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new LkM03bArea bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public LkM03bArea(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute lkM03bDd.
	 * @return the lkM03bDd attribute reference
	 */
	public ElementaryRangeReference getLkM03bDdReference() {
		return lkM03bDd.getReference();
	}

	/**
	 * Getter for lkM03bDd attribute.
	 * @return lkM03bDd attribute
	 */
	public String getLkM03bDd() {
		return lkM03bDd.getValue();
	}

	/**
	 * Setter for lkM03bDd attribute.
	 * @param lkM03bDd the new value of lkM03bDd
	 */
	public void setLkM03bDd(String lkM03bDd) {
		this.lkM03bDd.setValue(lkM03bDd);
	}
	/**
	 * Gets the reference for attribute lkM03bOper.
	 * @return the lkM03bOper attribute reference
	 */
	public ElementaryRangeReference getLkM03bOperReference() {
		return lkM03bOper.getReference();
	}

	/**
	 * Getter for lkM03bOper attribute.
	 * @return lkM03bOper attribute
	 */
	public String getLkM03bOper() {
		return lkM03bOper.getValue();
	}

	/**
	 * Setter for lkM03bOper attribute.
	 * @param lkM03bOper the new value of lkM03bOper
	 */
	public void setLkM03bOper(String lkM03bOper) {
		this.lkM03bOper.setValue(lkM03bOper);
	}
	/**
	 * Gets the reference for attribute m03bOpen.
	 * @return the m03bOpen attribute reference
	 */
	public ConditionReference getM03bOpenReference() {
		return lkM03bOper.getCondition(m03bOpen);	
	}

	/**
	 * Getter for m03bOpen attribute.
	 * @return m03bOpen attribute
	 */
	public boolean isM03bOpen() {
		return getM03bOpenReference().getValue();	
	}

	/**
	 * Setter for m03bOpen attribute.
	 * @param m03bOpen the new value of m03bOpen
	 */
	public void setM03bOpen(boolean m03bOpen) {
		getM03bOpenReference().setValue(m03bOpen);	
	}
	/**
	 * Gets the reference for attribute m03bClose.
	 * @return the m03bClose attribute reference
	 */
	public ConditionReference getM03bCloseReference() {
		return lkM03bOper.getCondition(m03bClose);	
	}

	/**
	 * Getter for m03bClose attribute.
	 * @return m03bClose attribute
	 */
	public boolean isM03bClose() {
		return getM03bCloseReference().getValue();	
	}

	/**
	 * Setter for m03bClose attribute.
	 * @param m03bClose the new value of m03bClose
	 */
	public void setM03bClose(boolean m03bClose) {
		getM03bCloseReference().setValue(m03bClose);	
	}
	/**
	 * Gets the reference for attribute m03bRead.
	 * @return the m03bRead attribute reference
	 */
	public ConditionReference getM03bReadReference() {
		return lkM03bOper.getCondition(m03bRead);	
	}

	/**
	 * Getter for m03bRead attribute.
	 * @return m03bRead attribute
	 */
	public boolean isM03bRead() {
		return getM03bReadReference().getValue();	
	}

	/**
	 * Setter for m03bRead attribute.
	 * @param m03bRead the new value of m03bRead
	 */
	public void setM03bRead(boolean m03bRead) {
		getM03bReadReference().setValue(m03bRead);	
	}
	/**
	 * Gets the reference for attribute m03bReadK.
	 * @return the m03bReadK attribute reference
	 */
	public ConditionReference getM03bReadKReference() {
		return lkM03bOper.getCondition(m03bReadK);	
	}

	/**
	 * Getter for m03bReadK attribute.
	 * @return m03bReadK attribute
	 */
	public boolean isM03bReadK() {
		return getM03bReadKReference().getValue();	
	}

	/**
	 * Setter for m03bReadK attribute.
	 * @param m03bReadK the new value of m03bReadK
	 */
	public void setM03bReadK(boolean m03bReadK) {
		getM03bReadKReference().setValue(m03bReadK);	
	}
	/**
	 * Gets the reference for attribute m03bWrite.
	 * @return the m03bWrite attribute reference
	 */
	public ConditionReference getM03bWriteReference() {
		return lkM03bOper.getCondition(m03bWrite);	
	}

	/**
	 * Getter for m03bWrite attribute.
	 * @return m03bWrite attribute
	 */
	public boolean isM03bWrite() {
		return getM03bWriteReference().getValue();	
	}

	/**
	 * Setter for m03bWrite attribute.
	 * @param m03bWrite the new value of m03bWrite
	 */
	public void setM03bWrite(boolean m03bWrite) {
		getM03bWriteReference().setValue(m03bWrite);	
	}
	/**
	 * Gets the reference for attribute m03bRewrite.
	 * @return the m03bRewrite attribute reference
	 */
	public ConditionReference getM03bRewriteReference() {
		return lkM03bOper.getCondition(m03bRewrite);	
	}

	/**
	 * Getter for m03bRewrite attribute.
	 * @return m03bRewrite attribute
	 */
	public boolean isM03bRewrite() {
		return getM03bRewriteReference().getValue();	
	}

	/**
	 * Setter for m03bRewrite attribute.
	 * @param m03bRewrite the new value of m03bRewrite
	 */
	public void setM03bRewrite(boolean m03bRewrite) {
		getM03bRewriteReference().setValue(m03bRewrite);	
	}
	/**
	 * Gets the reference for attribute lkM03bRc.
	 * @return the lkM03bRc attribute reference
	 */
	public ElementaryRangeReference getLkM03bRcReference() {
		return lkM03bRc.getReference();
	}

	/**
	 * Getter for lkM03bRc attribute.
	 * @return lkM03bRc attribute
	 */
	public String getLkM03bRc() {
		return lkM03bRc.getValue();
	}

	/**
	 * Setter for lkM03bRc attribute.
	 * @param lkM03bRc the new value of lkM03bRc
	 */
	public void setLkM03bRc(String lkM03bRc) {
		this.lkM03bRc.setValue(lkM03bRc);
	}
	/**
	 * Gets the reference for attribute lkM03bKey.
	 * @return the lkM03bKey attribute reference
	 */
	public ElementaryRangeReference getLkM03bKeyReference() {
		return lkM03bKey.getReference();
	}

	/**
	 * Getter for lkM03bKey attribute.
	 * @return lkM03bKey attribute
	 */
	public String getLkM03bKey() {
		return lkM03bKey.getValue();
	}

	/**
	 * Setter for lkM03bKey attribute.
	 * @param lkM03bKey the new value of lkM03bKey
	 */
	public void setLkM03bKey(String lkM03bKey) {
		this.lkM03bKey.setValue(lkM03bKey);
	}
	/**
	 * Gets the reference for attribute lkM03bKeyLn.
	 * @return the lkM03bKeyLn attribute reference
	 */
	public ElementaryRangeReference getLkM03bKeyLnReference() {
		return lkM03bKeyLn.getReference();
	}

	/**
	 * Getter for lkM03bKeyLn attribute.
	 * @return lkM03bKeyLn attribute
	 */
	public int getLkM03bKeyLn() {
		return lkM03bKeyLn.getValue();
	}

	/**
	 * Setter for lkM03bKeyLn attribute.
	 * @param lkM03bKeyLn the new value of lkM03bKeyLn
	 */
	public void setLkM03bKeyLn(int lkM03bKeyLn) {
		this.lkM03bKeyLn.setValue(lkM03bKeyLn);
	}
	/**
	 * Gets the reference for attribute lkM03bFldt.
	 * @return the lkM03bFldt attribute reference
	 */
	public ElementaryRangeReference getLkM03bFldtReference() {
		return lkM03bFldt.getReference();
	}

	/**
	 * Getter for lkM03bFldt attribute.
	 * @return lkM03bFldt attribute
	 */
	public String getLkM03bFldt() {
		return lkM03bFldt.getValue();
	}

	/**
	 * Setter for lkM03bFldt attribute.
	 * @param lkM03bFldt the new value of lkM03bFldt
	 */
	public void setLkM03bFldt(String lkM03bFldt) {
		this.lkM03bFldt.setValue(lkM03bFldt);
	}
}
