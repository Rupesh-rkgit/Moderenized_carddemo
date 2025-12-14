package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity CcWorkAreas.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *  Other common working storage Variables<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'ccWorkArea' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.CcWorkArea
 * <br></p>
 * 
 * @see RecordEntity
 */
public class CcWorkAreas extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group ccWorkArea = new Group(root);
	private final Elementary ccardAid = new Elementary(ccWorkArea,new AlphanumericType(5));
	private final ConditionName ccardAidEnter=new ConditionName(ccardAid,"ENTER");
	private final ConditionName ccardAidClear=new ConditionName(ccardAid,"CLEAR");
	private final ConditionName ccardAidPa1=new ConditionName(ccardAid,"PA1  ");
	private final ConditionName ccardAidPa2=new ConditionName(ccardAid,"PA2  ");
	private final ConditionName ccardAidPfk01=new ConditionName(ccardAid,"PFK01");
	private final ConditionName ccardAidPfk02=new ConditionName(ccardAid,"PFK02");
	private final ConditionName ccardAidPfk03=new ConditionName(ccardAid,"PFK03");
	private final ConditionName ccardAidPfk04=new ConditionName(ccardAid,"PFK04");
	private final ConditionName ccardAidPfk05=new ConditionName(ccardAid,"PFK05");
	private final ConditionName ccardAidPfk06=new ConditionName(ccardAid,"PFK06");
	private final ConditionName ccardAidPfk07=new ConditionName(ccardAid,"PFK07");
	private final ConditionName ccardAidPfk08=new ConditionName(ccardAid,"PFK08");
	private final ConditionName ccardAidPfk09=new ConditionName(ccardAid,"PFK09");
	private final ConditionName ccardAidPfk10=new ConditionName(ccardAid,"PFK10");
	private final ConditionName ccardAidPfk11=new ConditionName(ccardAid,"PFK11");
	private final ConditionName ccardAidPfk12=new ConditionName(ccardAid,"PFK12");
	
	/**
	 * 10  CCARD-LAST-PROG                  PIC X(8).
	 */
	private final Elementary ccardNextProg = new Elementary(ccWorkArea,new AlphanumericType(8));
	
	/**
	 * 10  CCARD-RETURN-TO-PROG             PIC X(8).
	 */
	private final Elementary ccardNextMapset = new Elementary(ccWorkArea,new AlphanumericType(7));
	private final Elementary ccardNextMap = new Elementary(ccWorkArea,new AlphanumericType(7));
	
	/**
	 * 10  CCARD-RETURN-FLAG                PIC X(1).
	 * 88  CCARD-RETURN-FLAG-OFF          VALUE LOW-VALUES.
	 * 88  CCARD-RETURN-FLAG-ON           VALUE '1'.
	 */
	private final Elementary ccardErrorMsg = new Elementary(ccWorkArea,new AlphanumericType(75));
	private final Elementary ccardReturnMsg = new Elementary(ccWorkArea,new AlphanumericType(75));
	private final ConditionName ccardReturnMsgOff=new ConditionName(ccardReturnMsg,Record.LOW_VALUES);
	private final Union union = new Union(ccWorkArea);
	
	/**
	 * 10  CCARD-FUNCTION                   PIC X(1).
	 * 88  CCARD-NO-VALUE                  VALUE LOW-VALUES.
	 * 88  CCARD-GET-DATA                  VALUE '1'.
	 */
	private final Elementary ccAcctId = new Elementary(union,new AlphanumericType(11)," ");
	private final Elementary ccAcctIdN = new Elementary(union,new ZonedType(11, 0, false));
	private final Union union1 = new Union(ccWorkArea);
	private final Elementary ccCardNum = new Elementary(union1,new AlphanumericType(16)," ");
	private final Elementary ccCardNumN = new Elementary(union1,new ZonedType(16, 0, false));
	private final Union union2 = new Union(ccWorkArea);
	private final Elementary ccCustId = new Elementary(union2,new AlphanumericType(9)," ");
	private final Elementary ccCustIdN = new Elementary(union2,new ZonedType(9, 0, false));
	

	/**
	 * Instantiate a new CcWorkAreas with a default record.
	 * @param configuration the configuration
	 */
	public CcWorkAreas(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CcWorkAreas bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CcWorkAreas(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute ccWorkArea.
	 * @return the ccWorkArea attribute reference
	 */
	public RangeReference getCcWorkAreaReference() {
		return ccWorkArea.getReference();
	}	
				
	/**
	 * Setter for ccWorkArea .
	 */
   	public void setCcWorkArea(RangeReference reference) {
       	ccWorkArea.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute ccardAid.
	 * @return the ccardAid attribute reference
	 */
	public ElementaryRangeReference getCcardAidReference() {
		return ccardAid.getReference();
	}

	/**
	 * Getter for ccardAid attribute.
	 * @return ccardAid attribute
	 */
	public String getCcardAid() {
		return ccardAid.getValue();
	}

	/**
	 * Setter for ccardAid attribute.
	 * @param ccardAid the new value of ccardAid
	 */
	public void setCcardAid(String ccardAid) {
		this.ccardAid.setValue(ccardAid);
	}
	/**
	 * Gets the reference for attribute ccardAidEnter.
	 * @return the ccardAidEnter attribute reference
	 */
	public ConditionReference getCcardAidEnterReference() {
		return ccardAid.getCondition(ccardAidEnter);	
	}

	/**
	 * Getter for ccardAidEnter attribute.
	 * @return ccardAidEnter attribute
	 */
	public boolean isCcardAidEnter() {
		return getCcardAidEnterReference().getValue();	
	}

	/**
	 * Setter for ccardAidEnter attribute.
	 * @param ccardAidEnter the new value of ccardAidEnter
	 */
	public void setCcardAidEnter(boolean ccardAidEnter) {
		getCcardAidEnterReference().setValue(ccardAidEnter);	
	}
	/**
	 * Gets the reference for attribute ccardAidClear.
	 * @return the ccardAidClear attribute reference
	 */
	public ConditionReference getCcardAidClearReference() {
		return ccardAid.getCondition(ccardAidClear);	
	}

	/**
	 * Getter for ccardAidClear attribute.
	 * @return ccardAidClear attribute
	 */
	public boolean isCcardAidClear() {
		return getCcardAidClearReference().getValue();	
	}

	/**
	 * Setter for ccardAidClear attribute.
	 * @param ccardAidClear the new value of ccardAidClear
	 */
	public void setCcardAidClear(boolean ccardAidClear) {
		getCcardAidClearReference().setValue(ccardAidClear);	
	}
	/**
	 * Gets the reference for attribute ccardAidPa1.
	 * @return the ccardAidPa1 attribute reference
	 */
	public ConditionReference getCcardAidPa1Reference() {
		return ccardAid.getCondition(ccardAidPa1);	
	}

	/**
	 * Getter for ccardAidPa1 attribute.
	 * @return ccardAidPa1 attribute
	 */
	public boolean isCcardAidPa1() {
		return getCcardAidPa1Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPa1 attribute.
	 * @param ccardAidPa1 the new value of ccardAidPa1
	 */
	public void setCcardAidPa1(boolean ccardAidPa1) {
		getCcardAidPa1Reference().setValue(ccardAidPa1);	
	}
	/**
	 * Gets the reference for attribute ccardAidPa2.
	 * @return the ccardAidPa2 attribute reference
	 */
	public ConditionReference getCcardAidPa2Reference() {
		return ccardAid.getCondition(ccardAidPa2);	
	}

	/**
	 * Getter for ccardAidPa2 attribute.
	 * @return ccardAidPa2 attribute
	 */
	public boolean isCcardAidPa2() {
		return getCcardAidPa2Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPa2 attribute.
	 * @param ccardAidPa2 the new value of ccardAidPa2
	 */
	public void setCcardAidPa2(boolean ccardAidPa2) {
		getCcardAidPa2Reference().setValue(ccardAidPa2);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk01.
	 * @return the ccardAidPfk01 attribute reference
	 */
	public ConditionReference getCcardAidPfk01Reference() {
		return ccardAid.getCondition(ccardAidPfk01);	
	}

	/**
	 * Getter for ccardAidPfk01 attribute.
	 * @return ccardAidPfk01 attribute
	 */
	public boolean isCcardAidPfk01() {
		return getCcardAidPfk01Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk01 attribute.
	 * @param ccardAidPfk01 the new value of ccardAidPfk01
	 */
	public void setCcardAidPfk01(boolean ccardAidPfk01) {
		getCcardAidPfk01Reference().setValue(ccardAidPfk01);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk02.
	 * @return the ccardAidPfk02 attribute reference
	 */
	public ConditionReference getCcardAidPfk02Reference() {
		return ccardAid.getCondition(ccardAidPfk02);	
	}

	/**
	 * Getter for ccardAidPfk02 attribute.
	 * @return ccardAidPfk02 attribute
	 */
	public boolean isCcardAidPfk02() {
		return getCcardAidPfk02Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk02 attribute.
	 * @param ccardAidPfk02 the new value of ccardAidPfk02
	 */
	public void setCcardAidPfk02(boolean ccardAidPfk02) {
		getCcardAidPfk02Reference().setValue(ccardAidPfk02);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk03.
	 * @return the ccardAidPfk03 attribute reference
	 */
	public ConditionReference getCcardAidPfk03Reference() {
		return ccardAid.getCondition(ccardAidPfk03);	
	}

	/**
	 * Getter for ccardAidPfk03 attribute.
	 * @return ccardAidPfk03 attribute
	 */
	public boolean isCcardAidPfk03() {
		return getCcardAidPfk03Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk03 attribute.
	 * @param ccardAidPfk03 the new value of ccardAidPfk03
	 */
	public void setCcardAidPfk03(boolean ccardAidPfk03) {
		getCcardAidPfk03Reference().setValue(ccardAidPfk03);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk04.
	 * @return the ccardAidPfk04 attribute reference
	 */
	public ConditionReference getCcardAidPfk04Reference() {
		return ccardAid.getCondition(ccardAidPfk04);	
	}

	/**
	 * Getter for ccardAidPfk04 attribute.
	 * @return ccardAidPfk04 attribute
	 */
	public boolean isCcardAidPfk04() {
		return getCcardAidPfk04Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk04 attribute.
	 * @param ccardAidPfk04 the new value of ccardAidPfk04
	 */
	public void setCcardAidPfk04(boolean ccardAidPfk04) {
		getCcardAidPfk04Reference().setValue(ccardAidPfk04);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk05.
	 * @return the ccardAidPfk05 attribute reference
	 */
	public ConditionReference getCcardAidPfk05Reference() {
		return ccardAid.getCondition(ccardAidPfk05);	
	}

	/**
	 * Getter for ccardAidPfk05 attribute.
	 * @return ccardAidPfk05 attribute
	 */
	public boolean isCcardAidPfk05() {
		return getCcardAidPfk05Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk05 attribute.
	 * @param ccardAidPfk05 the new value of ccardAidPfk05
	 */
	public void setCcardAidPfk05(boolean ccardAidPfk05) {
		getCcardAidPfk05Reference().setValue(ccardAidPfk05);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk06.
	 * @return the ccardAidPfk06 attribute reference
	 */
	public ConditionReference getCcardAidPfk06Reference() {
		return ccardAid.getCondition(ccardAidPfk06);	
	}

	/**
	 * Getter for ccardAidPfk06 attribute.
	 * @return ccardAidPfk06 attribute
	 */
	public boolean isCcardAidPfk06() {
		return getCcardAidPfk06Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk06 attribute.
	 * @param ccardAidPfk06 the new value of ccardAidPfk06
	 */
	public void setCcardAidPfk06(boolean ccardAidPfk06) {
		getCcardAidPfk06Reference().setValue(ccardAidPfk06);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk07.
	 * @return the ccardAidPfk07 attribute reference
	 */
	public ConditionReference getCcardAidPfk07Reference() {
		return ccardAid.getCondition(ccardAidPfk07);	
	}

	/**
	 * Getter for ccardAidPfk07 attribute.
	 * @return ccardAidPfk07 attribute
	 */
	public boolean isCcardAidPfk07() {
		return getCcardAidPfk07Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk07 attribute.
	 * @param ccardAidPfk07 the new value of ccardAidPfk07
	 */
	public void setCcardAidPfk07(boolean ccardAidPfk07) {
		getCcardAidPfk07Reference().setValue(ccardAidPfk07);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk08.
	 * @return the ccardAidPfk08 attribute reference
	 */
	public ConditionReference getCcardAidPfk08Reference() {
		return ccardAid.getCondition(ccardAidPfk08);	
	}

	/**
	 * Getter for ccardAidPfk08 attribute.
	 * @return ccardAidPfk08 attribute
	 */
	public boolean isCcardAidPfk08() {
		return getCcardAidPfk08Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk08 attribute.
	 * @param ccardAidPfk08 the new value of ccardAidPfk08
	 */
	public void setCcardAidPfk08(boolean ccardAidPfk08) {
		getCcardAidPfk08Reference().setValue(ccardAidPfk08);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk09.
	 * @return the ccardAidPfk09 attribute reference
	 */
	public ConditionReference getCcardAidPfk09Reference() {
		return ccardAid.getCondition(ccardAidPfk09);	
	}

	/**
	 * Getter for ccardAidPfk09 attribute.
	 * @return ccardAidPfk09 attribute
	 */
	public boolean isCcardAidPfk09() {
		return getCcardAidPfk09Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk09 attribute.
	 * @param ccardAidPfk09 the new value of ccardAidPfk09
	 */
	public void setCcardAidPfk09(boolean ccardAidPfk09) {
		getCcardAidPfk09Reference().setValue(ccardAidPfk09);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk10.
	 * @return the ccardAidPfk10 attribute reference
	 */
	public ConditionReference getCcardAidPfk10Reference() {
		return ccardAid.getCondition(ccardAidPfk10);	
	}

	/**
	 * Getter for ccardAidPfk10 attribute.
	 * @return ccardAidPfk10 attribute
	 */
	public boolean isCcardAidPfk10() {
		return getCcardAidPfk10Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk10 attribute.
	 * @param ccardAidPfk10 the new value of ccardAidPfk10
	 */
	public void setCcardAidPfk10(boolean ccardAidPfk10) {
		getCcardAidPfk10Reference().setValue(ccardAidPfk10);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk11.
	 * @return the ccardAidPfk11 attribute reference
	 */
	public ConditionReference getCcardAidPfk11Reference() {
		return ccardAid.getCondition(ccardAidPfk11);	
	}

	/**
	 * Getter for ccardAidPfk11 attribute.
	 * @return ccardAidPfk11 attribute
	 */
	public boolean isCcardAidPfk11() {
		return getCcardAidPfk11Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk11 attribute.
	 * @param ccardAidPfk11 the new value of ccardAidPfk11
	 */
	public void setCcardAidPfk11(boolean ccardAidPfk11) {
		getCcardAidPfk11Reference().setValue(ccardAidPfk11);	
	}
	/**
	 * Gets the reference for attribute ccardAidPfk12.
	 * @return the ccardAidPfk12 attribute reference
	 */
	public ConditionReference getCcardAidPfk12Reference() {
		return ccardAid.getCondition(ccardAidPfk12);	
	}

	/**
	 * Getter for ccardAidPfk12 attribute.
	 * @return ccardAidPfk12 attribute
	 */
	public boolean isCcardAidPfk12() {
		return getCcardAidPfk12Reference().getValue();	
	}

	/**
	 * Setter for ccardAidPfk12 attribute.
	 * @param ccardAidPfk12 the new value of ccardAidPfk12
	 */
	public void setCcardAidPfk12(boolean ccardAidPfk12) {
		getCcardAidPfk12Reference().setValue(ccardAidPfk12);	
	}
	/**
	 * Gets the reference for attribute ccardNextProg.
	 * @return the ccardNextProg attribute reference
	 */
	public ElementaryRangeReference getCcardNextProgReference() {
		return ccardNextProg.getReference();
	}

	/**
	 * Getter for ccardNextProg attribute.
	 * @return ccardNextProg attribute
	 */
	public String getCcardNextProg() {
		return ccardNextProg.getValue();
	}

	/**
	 * Setter for ccardNextProg attribute.
	 * @param ccardNextProg the new value of ccardNextProg
	 */
	public void setCcardNextProg(String ccardNextProg) {
		this.ccardNextProg.setValue(ccardNextProg);
	}
	/**
	 * Gets the reference for attribute ccardNextMapset.
	 * @return the ccardNextMapset attribute reference
	 */
	public ElementaryRangeReference getCcardNextMapsetReference() {
		return ccardNextMapset.getReference();
	}

	/**
	 * Getter for ccardNextMapset attribute.
	 * @return ccardNextMapset attribute
	 */
	public String getCcardNextMapset() {
		return ccardNextMapset.getValue();
	}

	/**
	 * Setter for ccardNextMapset attribute.
	 * @param ccardNextMapset the new value of ccardNextMapset
	 */
	public void setCcardNextMapset(String ccardNextMapset) {
		this.ccardNextMapset.setValue(ccardNextMapset);
	}
	/**
	 * Gets the reference for attribute ccardNextMap.
	 * @return the ccardNextMap attribute reference
	 */
	public ElementaryRangeReference getCcardNextMapReference() {
		return ccardNextMap.getReference();
	}

	/**
	 * Getter for ccardNextMap attribute.
	 * @return ccardNextMap attribute
	 */
	public String getCcardNextMap() {
		return ccardNextMap.getValue();
	}

	/**
	 * Setter for ccardNextMap attribute.
	 * @param ccardNextMap the new value of ccardNextMap
	 */
	public void setCcardNextMap(String ccardNextMap) {
		this.ccardNextMap.setValue(ccardNextMap);
	}
	/**
	 * Gets the reference for attribute ccardErrorMsg.
	 * @return the ccardErrorMsg attribute reference
	 */
	public ElementaryRangeReference getCcardErrorMsgReference() {
		return ccardErrorMsg.getReference();
	}

	/**
	 * Getter for ccardErrorMsg attribute.
	 * @return ccardErrorMsg attribute
	 */
	public String getCcardErrorMsg() {
		return ccardErrorMsg.getValue();
	}

	/**
	 * Setter for ccardErrorMsg attribute.
	 * @param ccardErrorMsg the new value of ccardErrorMsg
	 */
	public void setCcardErrorMsg(String ccardErrorMsg) {
		this.ccardErrorMsg.setValue(ccardErrorMsg);
	}
	/**
	 * Gets the reference for attribute ccardReturnMsg.
	 * @return the ccardReturnMsg attribute reference
	 */
	public ElementaryRangeReference getCcardReturnMsgReference() {
		return ccardReturnMsg.getReference();
	}

	/**
	 * Getter for ccardReturnMsg attribute.
	 * @return ccardReturnMsg attribute
	 */
	public String getCcardReturnMsg() {
		return ccardReturnMsg.getValue();
	}

	/**
	 * Setter for ccardReturnMsg attribute.
	 * @param ccardReturnMsg the new value of ccardReturnMsg
	 */
	public void setCcardReturnMsg(String ccardReturnMsg) {
		this.ccardReturnMsg.setValue(ccardReturnMsg);
	}
	/**
	 * Gets the reference for attribute ccardReturnMsgOff.
	 * @return the ccardReturnMsgOff attribute reference
	 */
	public ConditionReference getCcardReturnMsgOffReference() {
		return ccardReturnMsg.getCondition(ccardReturnMsgOff);	
	}

	/**
	 * Getter for ccardReturnMsgOff attribute.
	 * @return ccardReturnMsgOff attribute
	 */
	public boolean isCcardReturnMsgOff() {
		return getCcardReturnMsgOffReference().getValue();	
	}

	/**
	 * Setter for ccardReturnMsgOff attribute.
	 * @param ccardReturnMsgOff the new value of ccardReturnMsgOff
	 */
	public void setCcardReturnMsgOff(boolean ccardReturnMsgOff) {
		getCcardReturnMsgOffReference().setValue(ccardReturnMsgOff);	
	}
	/**
	 * Gets the reference for attribute ccAcctId.
	 * @return the ccAcctId attribute reference
	 */
	public ElementaryRangeReference getCcAcctIdReference() {
		return ccAcctId.getReference();
	}

	/**
	 * Getter for ccAcctId attribute.
	 * @return ccAcctId attribute
	 */
	public String getCcAcctId() {
		return ccAcctId.getValue();
	}

	/**
	 * Setter for ccAcctId attribute.
	 * @param ccAcctId the new value of ccAcctId
	 */
	public void setCcAcctId(String ccAcctId) {
		this.ccAcctId.setValue(ccAcctId);
	}
	/**
	 * Gets the reference for attribute ccAcctIdN.
	 * @return the ccAcctIdN attribute reference
	 */
	public ElementaryRangeReference getCcAcctIdNReference() {
		return ccAcctIdN.getReference();
	}

	/**
	 * Getter for ccAcctIdN attribute.
	 * @return ccAcctIdN attribute
	 */
	public long getCcAcctIdN() {
		return ccAcctIdN.getValue();
	}

	/**
	 * Setter for ccAcctIdN attribute.
	 * @param ccAcctIdN the new value of ccAcctIdN
	 */
	public void setCcAcctIdN(long ccAcctIdN) {
		this.ccAcctIdN.setValue(ccAcctIdN);
	}
	/**
	 * Gets the reference for attribute ccCardNum.
	 * @return the ccCardNum attribute reference
	 */
	public ElementaryRangeReference getCcCardNumReference() {
		return ccCardNum.getReference();
	}

	/**
	 * Getter for ccCardNum attribute.
	 * @return ccCardNum attribute
	 */
	public String getCcCardNum() {
		return ccCardNum.getValue();
	}

	/**
	 * Setter for ccCardNum attribute.
	 * @param ccCardNum the new value of ccCardNum
	 */
	public void setCcCardNum(String ccCardNum) {
		this.ccCardNum.setValue(ccCardNum);
	}
	/**
	 * Gets the reference for attribute ccCardNumN.
	 * @return the ccCardNumN attribute reference
	 */
	public ElementaryRangeReference getCcCardNumNReference() {
		return ccCardNumN.getReference();
	}

	/**
	 * Getter for ccCardNumN attribute.
	 * @return ccCardNumN attribute
	 */
	public long getCcCardNumN() {
		return ccCardNumN.getValue();
	}

	/**
	 * Setter for ccCardNumN attribute.
	 * @param ccCardNumN the new value of ccCardNumN
	 */
	public void setCcCardNumN(long ccCardNumN) {
		this.ccCardNumN.setValue(ccCardNumN);
	}
	/**
	 * Gets the reference for attribute ccCustId.
	 * @return the ccCustId attribute reference
	 */
	public ElementaryRangeReference getCcCustIdReference() {
		return ccCustId.getReference();
	}

	/**
	 * Getter for ccCustId attribute.
	 * @return ccCustId attribute
	 */
	public String getCcCustId() {
		return ccCustId.getValue();
	}

	/**
	 * Setter for ccCustId attribute.
	 * @param ccCustId the new value of ccCustId
	 */
	public void setCcCustId(String ccCustId) {
		this.ccCustId.setValue(ccCustId);
	}
	/**
	 * Gets the reference for attribute ccCustIdN.
	 * @return the ccCustIdN attribute reference
	 */
	public ElementaryRangeReference getCcCustIdNReference() {
		return ccCustIdN.getReference();
	}

	/**
	 * Getter for ccCustIdN attribute.
	 * @return ccCustIdN attribute
	 */
	public int getCcCustIdN() {
		return ccCustIdN.getValue();
	}

	/**
	 * Setter for ccCustIdN attribute.
	 * @param ccCustIdN the new value of ccCustIdN
	 */
	public void setCcCustIdN(int ccCustIdN) {
		this.ccCustIdN.setValue(ccCustIdN);
	}
}
