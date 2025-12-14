package aws.bluage.l3.workshop.cbstm03a.business.model;

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
 * Data simplifier entity WsM03bArea.
 * 
 * <p>About 'wsM03bDd' field, <br>
 * </p>
 * 
 * <p>About 'wsM03bOper' field, <br>
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
 * <p>About 'wsM03bRc' field, <br>
 * </p>
 * 
 * <p>About 'wsM03bKey' field, <br>
 * </p>
 * 
 * <p>About 'wsM03bKeyLn' field, <br>
 * </p>
 * 
 * <p>About 'wsM03bFldt' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class WsM03bArea extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary wsM03bDd = new Elementary(root,new AlphanumericType(8));
	private final Elementary wsM03bOper = new Elementary(root,new AlphanumericType(1));
	private final ConditionName m03bOpen=new ConditionName(wsM03bOper,"O");
	private final ConditionName m03bClose=new ConditionName(wsM03bOper,"C");
	private final ConditionName m03bRead=new ConditionName(wsM03bOper,"R");
	private final ConditionName m03bReadK=new ConditionName(wsM03bOper,"K");
	private final ConditionName m03bWrite=new ConditionName(wsM03bOper,"W");
	private final ConditionName m03bRewrite=new ConditionName(wsM03bOper,"Z");
	private final Elementary wsM03bRc = new Elementary(root,new AlphanumericType(2));
	private final Elementary wsM03bKey = new Elementary(root,new AlphanumericType(25));
	private final Elementary wsM03bKeyLn = new Elementary(root,new ZonedType(4, 0, false, false, true));
	private final Elementary wsM03bFldt = new Elementary(root,new AlphanumericType(1000));
	

	/**
	 * Instantiate a new WsM03bArea with a default record.
	 * @param configuration the configuration
	 */
	public WsM03bArea(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsM03bArea bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsM03bArea(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute wsM03bDd.
	 * @return the wsM03bDd attribute reference
	 */
	public ElementaryRangeReference getWsM03bDdReference() {
		return wsM03bDd.getReference();
	}

	/**
	 * Getter for wsM03bDd attribute.
	 * @return wsM03bDd attribute
	 */
	public String getWsM03bDd() {
		return wsM03bDd.getValue();
	}

	/**
	 * Setter for wsM03bDd attribute.
	 * @param wsM03bDd the new value of wsM03bDd
	 */
	public void setWsM03bDd(String wsM03bDd) {
		this.wsM03bDd.setValue(wsM03bDd);
	}
	/**
	 * Gets the reference for attribute wsM03bOper.
	 * @return the wsM03bOper attribute reference
	 */
	public ElementaryRangeReference getWsM03bOperReference() {
		return wsM03bOper.getReference();
	}

	/**
	 * Getter for wsM03bOper attribute.
	 * @return wsM03bOper attribute
	 */
	public String getWsM03bOper() {
		return wsM03bOper.getValue();
	}

	/**
	 * Setter for wsM03bOper attribute.
	 * @param wsM03bOper the new value of wsM03bOper
	 */
	public void setWsM03bOper(String wsM03bOper) {
		this.wsM03bOper.setValue(wsM03bOper);
	}
	/**
	 * Gets the reference for attribute m03bOpen.
	 * @return the m03bOpen attribute reference
	 */
	public ConditionReference getM03bOpenReference() {
		return wsM03bOper.getCondition(m03bOpen);	
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
		return wsM03bOper.getCondition(m03bClose);	
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
		return wsM03bOper.getCondition(m03bRead);	
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
		return wsM03bOper.getCondition(m03bReadK);	
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
		return wsM03bOper.getCondition(m03bWrite);	
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
		return wsM03bOper.getCondition(m03bRewrite);	
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
	 * Gets the reference for attribute wsM03bRc.
	 * @return the wsM03bRc attribute reference
	 */
	public ElementaryRangeReference getWsM03bRcReference() {
		return wsM03bRc.getReference();
	}

	/**
	 * Getter for wsM03bRc attribute.
	 * @return wsM03bRc attribute
	 */
	public String getWsM03bRc() {
		return wsM03bRc.getValue();
	}

	/**
	 * Setter for wsM03bRc attribute.
	 * @param wsM03bRc the new value of wsM03bRc
	 */
	public void setWsM03bRc(String wsM03bRc) {
		this.wsM03bRc.setValue(wsM03bRc);
	}
	/**
	 * Gets the reference for attribute wsM03bKey.
	 * @return the wsM03bKey attribute reference
	 */
	public ElementaryRangeReference getWsM03bKeyReference() {
		return wsM03bKey.getReference();
	}

	/**
	 * Getter for wsM03bKey attribute.
	 * @return wsM03bKey attribute
	 */
	public String getWsM03bKey() {
		return wsM03bKey.getValue();
	}

	/**
	 * Setter for wsM03bKey attribute.
	 * @param wsM03bKey the new value of wsM03bKey
	 */
	public void setWsM03bKey(String wsM03bKey) {
		this.wsM03bKey.setValue(wsM03bKey);
	}
	/**
	 * Gets the reference for attribute wsM03bKeyLn.
	 * @return the wsM03bKeyLn attribute reference
	 */
	public ElementaryRangeReference getWsM03bKeyLnReference() {
		return wsM03bKeyLn.getReference();
	}

	/**
	 * Getter for wsM03bKeyLn attribute.
	 * @return wsM03bKeyLn attribute
	 */
	public int getWsM03bKeyLn() {
		return wsM03bKeyLn.getValue();
	}

	/**
	 * Setter for wsM03bKeyLn attribute.
	 * @param wsM03bKeyLn the new value of wsM03bKeyLn
	 */
	public void setWsM03bKeyLn(int wsM03bKeyLn) {
		this.wsM03bKeyLn.setValue(wsM03bKeyLn);
	}
	/**
	 * Gets the reference for attribute wsM03bFldt.
	 * @return the wsM03bFldt attribute reference
	 */
	public ElementaryRangeReference getWsM03bFldtReference() {
		return wsM03bFldt.getReference();
	}

	/**
	 * Getter for wsM03bFldt attribute.
	 * @return wsM03bFldt attribute
	 */
	public String getWsM03bFldt() {
		return wsM03bFldt.getValue();
	}

	/**
	 * Setter for wsM03bFldt attribute.
	 * @param wsM03bFldt the new value of wsM03bFldt
	 */
	public void setWsM03bFldt(String wsM03bFldt) {
		this.wsM03bFldt.setValue(wsM03bFldt);
	}
}
