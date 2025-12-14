package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity HtmlLines.
 * 
 * <p>About 'htmlFixedLn' field, <br>
 * </p>
 * 
 * <p>About 'htmlL01' field, <br>
 * </p>
 * 
 * <p>About 'htmlL02' field, <br>
 * </p>
 * 
 * <p>About 'htmlL03' field, <br>
 * </p>
 * 
 * <p>About 'htmlL04' field, <br>
 * </p>
 * 
 * <p>About 'htmlL05' field, <br>
 * </p>
 * 
 * <p>About 'htmlL06' field, <br>
 * </p>
 * 
 * <p>About 'htmlL07' field, <br>
 * </p>
 * 
 * <p>About 'htmlL08' field, <br>
 * </p>
 * 
 * <p>About 'htmlLtrs' field, <br>
 * </p>
 * 
 * <p>About 'htmlLtre' field, <br>
 * </p>
 * 
 * <p>About 'htmlLtds' field, <br>
 * </p>
 * 
 * <p>About 'htmlLtde' field, <br>
 * </p>
 * 
 * <p>About 'htmlL10' field, <br>
 * </p>
 * 
 * <p>About 'htmlL15' field, <br>
 * </p>
 * 
 * <p>About 'htmlL16' field, <br>
 * </p>
 * 
 * <p>About 'htmlL17' field, <br>
 * </p>
 * 
 * <p>About 'htmlL18' field, <br>
 * </p>
 * 
 * <p>About 'htmlL2235' field, <br>
 * </p>
 * 
 * <p>About 'htmlL3042' field, <br>
 * </p>
 * 
 * <p>About 'htmlL31' field, <br>
 * </p>
 * 
 * <p>About 'htmlL43' field, <br>
 * </p>
 * 
 * <p>About 'htmlL47' field, <br>
 * </p>
 * 
 * <p>About 'htmlL48' field, <br>
 * </p>
 * 
 * <p>About 'htmlL50' field, <br>
 * </p>
 * 
 * <p>About 'htmlL51' field, <br>
 * </p>
 * 
 * <p>About 'htmlL53' field, <br>
 * </p>
 * 
 * <p>About 'htmlL54' field, <br>
 * </p>
 * 
 * <p>About 'htmlL58' field, <br>
 * </p>
 * 
 * <p>About 'htmlL61' field, <br>
 * </p>
 * 
 * <p>About 'htmlL64' field, <br>
 * </p>
 * 
 * <p>About 'htmlL75' field, <br>
 * </p>
 * 
 * <p>About 'htmlL78' field, <br>
 * </p>
 * 
 * <p>About 'htmlL79' field, <br>
 * </p>
 * 
 * <p>About 'htmlL80' field, <br>
 * </p>
 * 
 * <p>About 'htmlL11' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.HtmlL11
 * <br></p>
 * 
 * <p>About 'htmlL23' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.HtmlL23
 * <br></p>
 * 
 * <p>About 'htmlAddrLn' field, <br>
 * </p>
 * 
 * <p>About 'htmlBsicLn' field, <br>
 * </p>
 * 
 * <p>About 'htmlTranLn' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class HtmlLines extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary htmlFixedLn = new Elementary(root,new AlphanumericType(100));
	private final ConditionName htmlL01=new ConditionName(htmlFixedLn,"<!DOCTYPE html>");
	private final ConditionName htmlL02=new ConditionName(htmlFixedLn,"<html lang=\"en\">");
	private final ConditionName htmlL03=new ConditionName(htmlFixedLn,"<head>");
	private final ConditionName htmlL04=new ConditionName(htmlFixedLn,"<meta charset=\"utf-8\">");
	private final ConditionName htmlL05=new ConditionName(htmlFixedLn,"<title>HTML Table Layout</title>");
	private final ConditionName htmlL06=new ConditionName(htmlFixedLn,"</head>");
	private final ConditionName htmlL07=new ConditionName(htmlFixedLn,"<body style=\"margin:0px;\">");
	private final ConditionName htmlL08=new ConditionName(htmlFixedLn,"<table  align=\"center\" frame=\"box\" style=\"width:70%; font:12px Segoe UI,sans-serif;\">");
	private final ConditionName htmlLtrs=new ConditionName(htmlFixedLn,"<tr>");
	private final ConditionName htmlLtre=new ConditionName(htmlFixedLn,"</tr>");
	private final ConditionName htmlLtds=new ConditionName(htmlFixedLn,"<td>");
	private final ConditionName htmlLtde=new ConditionName(htmlFixedLn,"</td>");
	private final ConditionName htmlL10=new ConditionName(htmlFixedLn,"<td colspan=\"3\" style=\"padding:0px 5px;background-color:#1d1d96b3;\">");
	private final ConditionName htmlL15=new ConditionName(htmlFixedLn,"<td colspan=\"3\" style=\"padding:0px 5px;background-color:#FFAF33;\">");
	private final ConditionName htmlL16=new ConditionName(htmlFixedLn,"<p style=\"font-size:16px\">Bank of XYZ</p>");
	private final ConditionName htmlL17=new ConditionName(htmlFixedLn,"<p>410 Terry Ave N</p>");
	private final ConditionName htmlL18=new ConditionName(htmlFixedLn,"<p>Seattle WA 99999</p>");
	private final ConditionName htmlL2235=new ConditionName(htmlFixedLn,"<td colspan=\"3\" style=\"padding:0px 5px;background-color:#f2f2f2;\">");
	private final ConditionName htmlL3042=new ConditionName(htmlFixedLn,"<td colspan=\"3\" style=\"padding:0px 5px;background-color:#33FFD1; text-align:center;\">");
	private final ConditionName htmlL31=new ConditionName(htmlFixedLn,"<p style=\"font-size:16px\">Basic Details</p>");
	private final ConditionName htmlL43=new ConditionName(htmlFixedLn,"<p style=\"font-size:16px\">Transaction Summary</p>");
	private final ConditionName htmlL47=new ConditionName(htmlFixedLn,"<td style=\"width:25%; padding:0px 5px; background-color:#33FF5E; text-align:left;\">");
	private final ConditionName htmlL48=new ConditionName(htmlFixedLn,"<p style=\"font-size:16px\">Tran ID</p>");
	private final ConditionName htmlL50=new ConditionName(htmlFixedLn,"<td style=\"width:55%; padding:0px 5px; background-color:#33FF5E; text-align:left;\">");
	private final ConditionName htmlL51=new ConditionName(htmlFixedLn,"<p style=\"font-size:16px\">Tran Details</p>");
	private final ConditionName htmlL53=new ConditionName(htmlFixedLn,"<td style=\"width:20%; padding:0px 5px; background-color:#33FF5E; text-align:right;\">");
	private final ConditionName htmlL54=new ConditionName(htmlFixedLn,"<p style=\"font-size:16px\">Amount</p>");
	private final ConditionName htmlL58=new ConditionName(htmlFixedLn,"<td style=\"width:25%; padding:0px 5px; background-color:#f2f2f2; text-align:left;\">");
	private final ConditionName htmlL61=new ConditionName(htmlFixedLn,"<td style=\"width:55%; padding:0px 5px; background-color:#f2f2f2; text-align:left;\">");
	private final ConditionName htmlL64=new ConditionName(htmlFixedLn,"<td style=\"width:20%; padding:0px 5px; background-color:#f2f2f2; text-align:right;\">");
	private final ConditionName htmlL75=new ConditionName(htmlFixedLn,"<h3>End of Statement</h3>");
	private final ConditionName htmlL78=new ConditionName(htmlFixedLn,"</table>");
	private final ConditionName htmlL79=new ConditionName(htmlFixedLn,"</body>");
	private final ConditionName htmlL80=new ConditionName(htmlFixedLn,"</html>");
	private final Group htmlL11 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(htmlL11,new AlphanumericType(34),"<h3>Statement for Account Number: ");
	private final Elementary l11Acct = new Elementary(htmlL11,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(htmlL11,new AlphanumericType(5),"</h3>");
	private final Group htmlL23 = new Group(root);
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(htmlL23,new AlphanumericType(26),"<p style=\"font-size:16px\">");
	private final Elementary l23Name = new Elementary(htmlL23,new AlphanumericType(50));
	private final Elementary htmlAddrLn = new Elementary(root,new AlphanumericType(100));
	private final Elementary htmlBsicLn = new Elementary(root,new AlphanumericType(100));
	private final Elementary htmlTranLn = new Elementary(root,new AlphanumericType(100));
	

	/**
	 * Instantiate a new HtmlLines with a default record.
	 * @param configuration the configuration
	 */
	public HtmlLines(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new HtmlLines bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public HtmlLines(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute htmlFixedLn.
	 * @return the htmlFixedLn attribute reference
	 */
	public ElementaryRangeReference getHtmlFixedLnReference() {
		return htmlFixedLn.getReference();
	}

	/**
	 * Getter for htmlFixedLn attribute.
	 * @return htmlFixedLn attribute
	 */
	public String getHtmlFixedLn() {
		return htmlFixedLn.getValue();
	}

	/**
	 * Setter for htmlFixedLn attribute.
	 * @param htmlFixedLn the new value of htmlFixedLn
	 */
	public void setHtmlFixedLn(String htmlFixedLn) {
		this.htmlFixedLn.setValue(htmlFixedLn);
	}
	/**
	 * Gets the reference for attribute htmlL01.
	 * @return the htmlL01 attribute reference
	 */
	public ConditionReference getHtmlL01Reference() {
		return htmlFixedLn.getCondition(htmlL01);	
	}

	/**
	 * Getter for htmlL01 attribute.
	 * @return htmlL01 attribute
	 */
	public boolean isHtmlL01() {
		return getHtmlL01Reference().getValue();	
	}

	/**
	 * Setter for htmlL01 attribute.
	 * @param htmlL01 the new value of htmlL01
	 */
	public void setHtmlL01(boolean htmlL01) {
		getHtmlL01Reference().setValue(htmlL01);	
	}
	/**
	 * Gets the reference for attribute htmlL02.
	 * @return the htmlL02 attribute reference
	 */
	public ConditionReference getHtmlL02Reference() {
		return htmlFixedLn.getCondition(htmlL02);	
	}

	/**
	 * Getter for htmlL02 attribute.
	 * @return htmlL02 attribute
	 */
	public boolean isHtmlL02() {
		return getHtmlL02Reference().getValue();	
	}

	/**
	 * Setter for htmlL02 attribute.
	 * @param htmlL02 the new value of htmlL02
	 */
	public void setHtmlL02(boolean htmlL02) {
		getHtmlL02Reference().setValue(htmlL02);	
	}
	/**
	 * Gets the reference for attribute htmlL03.
	 * @return the htmlL03 attribute reference
	 */
	public ConditionReference getHtmlL03Reference() {
		return htmlFixedLn.getCondition(htmlL03);	
	}

	/**
	 * Getter for htmlL03 attribute.
	 * @return htmlL03 attribute
	 */
	public boolean isHtmlL03() {
		return getHtmlL03Reference().getValue();	
	}

	/**
	 * Setter for htmlL03 attribute.
	 * @param htmlL03 the new value of htmlL03
	 */
	public void setHtmlL03(boolean htmlL03) {
		getHtmlL03Reference().setValue(htmlL03);	
	}
	/**
	 * Gets the reference for attribute htmlL04.
	 * @return the htmlL04 attribute reference
	 */
	public ConditionReference getHtmlL04Reference() {
		return htmlFixedLn.getCondition(htmlL04);	
	}

	/**
	 * Getter for htmlL04 attribute.
	 * @return htmlL04 attribute
	 */
	public boolean isHtmlL04() {
		return getHtmlL04Reference().getValue();	
	}

	/**
	 * Setter for htmlL04 attribute.
	 * @param htmlL04 the new value of htmlL04
	 */
	public void setHtmlL04(boolean htmlL04) {
		getHtmlL04Reference().setValue(htmlL04);	
	}
	/**
	 * Gets the reference for attribute htmlL05.
	 * @return the htmlL05 attribute reference
	 */
	public ConditionReference getHtmlL05Reference() {
		return htmlFixedLn.getCondition(htmlL05);	
	}

	/**
	 * Getter for htmlL05 attribute.
	 * @return htmlL05 attribute
	 */
	public boolean isHtmlL05() {
		return getHtmlL05Reference().getValue();	
	}

	/**
	 * Setter for htmlL05 attribute.
	 * @param htmlL05 the new value of htmlL05
	 */
	public void setHtmlL05(boolean htmlL05) {
		getHtmlL05Reference().setValue(htmlL05);	
	}
	/**
	 * Gets the reference for attribute htmlL06.
	 * @return the htmlL06 attribute reference
	 */
	public ConditionReference getHtmlL06Reference() {
		return htmlFixedLn.getCondition(htmlL06);	
	}

	/**
	 * Getter for htmlL06 attribute.
	 * @return htmlL06 attribute
	 */
	public boolean isHtmlL06() {
		return getHtmlL06Reference().getValue();	
	}

	/**
	 * Setter for htmlL06 attribute.
	 * @param htmlL06 the new value of htmlL06
	 */
	public void setHtmlL06(boolean htmlL06) {
		getHtmlL06Reference().setValue(htmlL06);	
	}
	/**
	 * Gets the reference for attribute htmlL07.
	 * @return the htmlL07 attribute reference
	 */
	public ConditionReference getHtmlL07Reference() {
		return htmlFixedLn.getCondition(htmlL07);	
	}

	/**
	 * Getter for htmlL07 attribute.
	 * @return htmlL07 attribute
	 */
	public boolean isHtmlL07() {
		return getHtmlL07Reference().getValue();	
	}

	/**
	 * Setter for htmlL07 attribute.
	 * @param htmlL07 the new value of htmlL07
	 */
	public void setHtmlL07(boolean htmlL07) {
		getHtmlL07Reference().setValue(htmlL07);	
	}
	/**
	 * Gets the reference for attribute htmlL08.
	 * @return the htmlL08 attribute reference
	 */
	public ConditionReference getHtmlL08Reference() {
		return htmlFixedLn.getCondition(htmlL08);	
	}

	/**
	 * Getter for htmlL08 attribute.
	 * @return htmlL08 attribute
	 */
	public boolean isHtmlL08() {
		return getHtmlL08Reference().getValue();	
	}

	/**
	 * Setter for htmlL08 attribute.
	 * @param htmlL08 the new value of htmlL08
	 */
	public void setHtmlL08(boolean htmlL08) {
		getHtmlL08Reference().setValue(htmlL08);	
	}
	/**
	 * Gets the reference for attribute htmlLtrs.
	 * @return the htmlLtrs attribute reference
	 */
	public ConditionReference getHtmlLtrsReference() {
		return htmlFixedLn.getCondition(htmlLtrs);	
	}

	/**
	 * Getter for htmlLtrs attribute.
	 * @return htmlLtrs attribute
	 */
	public boolean isHtmlLtrs() {
		return getHtmlLtrsReference().getValue();	
	}

	/**
	 * Setter for htmlLtrs attribute.
	 * @param htmlLtrs the new value of htmlLtrs
	 */
	public void setHtmlLtrs(boolean htmlLtrs) {
		getHtmlLtrsReference().setValue(htmlLtrs);	
	}
	/**
	 * Gets the reference for attribute htmlLtre.
	 * @return the htmlLtre attribute reference
	 */
	public ConditionReference getHtmlLtreReference() {
		return htmlFixedLn.getCondition(htmlLtre);	
	}

	/**
	 * Getter for htmlLtre attribute.
	 * @return htmlLtre attribute
	 */
	public boolean isHtmlLtre() {
		return getHtmlLtreReference().getValue();	
	}

	/**
	 * Setter for htmlLtre attribute.
	 * @param htmlLtre the new value of htmlLtre
	 */
	public void setHtmlLtre(boolean htmlLtre) {
		getHtmlLtreReference().setValue(htmlLtre);	
	}
	/**
	 * Gets the reference for attribute htmlLtds.
	 * @return the htmlLtds attribute reference
	 */
	public ConditionReference getHtmlLtdsReference() {
		return htmlFixedLn.getCondition(htmlLtds);	
	}

	/**
	 * Getter for htmlLtds attribute.
	 * @return htmlLtds attribute
	 */
	public boolean isHtmlLtds() {
		return getHtmlLtdsReference().getValue();	
	}

	/**
	 * Setter for htmlLtds attribute.
	 * @param htmlLtds the new value of htmlLtds
	 */
	public void setHtmlLtds(boolean htmlLtds) {
		getHtmlLtdsReference().setValue(htmlLtds);	
	}
	/**
	 * Gets the reference for attribute htmlLtde.
	 * @return the htmlLtde attribute reference
	 */
	public ConditionReference getHtmlLtdeReference() {
		return htmlFixedLn.getCondition(htmlLtde);	
	}

	/**
	 * Getter for htmlLtde attribute.
	 * @return htmlLtde attribute
	 */
	public boolean isHtmlLtde() {
		return getHtmlLtdeReference().getValue();	
	}

	/**
	 * Setter for htmlLtde attribute.
	 * @param htmlLtde the new value of htmlLtde
	 */
	public void setHtmlLtde(boolean htmlLtde) {
		getHtmlLtdeReference().setValue(htmlLtde);	
	}
	/**
	 * Gets the reference for attribute htmlL10.
	 * @return the htmlL10 attribute reference
	 */
	public ConditionReference getHtmlL10Reference() {
		return htmlFixedLn.getCondition(htmlL10);	
	}

	/**
	 * Getter for htmlL10 attribute.
	 * @return htmlL10 attribute
	 */
	public boolean isHtmlL10() {
		return getHtmlL10Reference().getValue();	
	}

	/**
	 * Setter for htmlL10 attribute.
	 * @param htmlL10 the new value of htmlL10
	 */
	public void setHtmlL10(boolean htmlL10) {
		getHtmlL10Reference().setValue(htmlL10);	
	}
	/**
	 * Gets the reference for attribute htmlL15.
	 * @return the htmlL15 attribute reference
	 */
	public ConditionReference getHtmlL15Reference() {
		return htmlFixedLn.getCondition(htmlL15);	
	}

	/**
	 * Getter for htmlL15 attribute.
	 * @return htmlL15 attribute
	 */
	public boolean isHtmlL15() {
		return getHtmlL15Reference().getValue();	
	}

	/**
	 * Setter for htmlL15 attribute.
	 * @param htmlL15 the new value of htmlL15
	 */
	public void setHtmlL15(boolean htmlL15) {
		getHtmlL15Reference().setValue(htmlL15);	
	}
	/**
	 * Gets the reference for attribute htmlL16.
	 * @return the htmlL16 attribute reference
	 */
	public ConditionReference getHtmlL16Reference() {
		return htmlFixedLn.getCondition(htmlL16);	
	}

	/**
	 * Getter for htmlL16 attribute.
	 * @return htmlL16 attribute
	 */
	public boolean isHtmlL16() {
		return getHtmlL16Reference().getValue();	
	}

	/**
	 * Setter for htmlL16 attribute.
	 * @param htmlL16 the new value of htmlL16
	 */
	public void setHtmlL16(boolean htmlL16) {
		getHtmlL16Reference().setValue(htmlL16);	
	}
	/**
	 * Gets the reference for attribute htmlL17.
	 * @return the htmlL17 attribute reference
	 */
	public ConditionReference getHtmlL17Reference() {
		return htmlFixedLn.getCondition(htmlL17);	
	}

	/**
	 * Getter for htmlL17 attribute.
	 * @return htmlL17 attribute
	 */
	public boolean isHtmlL17() {
		return getHtmlL17Reference().getValue();	
	}

	/**
	 * Setter for htmlL17 attribute.
	 * @param htmlL17 the new value of htmlL17
	 */
	public void setHtmlL17(boolean htmlL17) {
		getHtmlL17Reference().setValue(htmlL17);	
	}
	/**
	 * Gets the reference for attribute htmlL18.
	 * @return the htmlL18 attribute reference
	 */
	public ConditionReference getHtmlL18Reference() {
		return htmlFixedLn.getCondition(htmlL18);	
	}

	/**
	 * Getter for htmlL18 attribute.
	 * @return htmlL18 attribute
	 */
	public boolean isHtmlL18() {
		return getHtmlL18Reference().getValue();	
	}

	/**
	 * Setter for htmlL18 attribute.
	 * @param htmlL18 the new value of htmlL18
	 */
	public void setHtmlL18(boolean htmlL18) {
		getHtmlL18Reference().setValue(htmlL18);	
	}
	/**
	 * Gets the reference for attribute htmlL2235.
	 * @return the htmlL2235 attribute reference
	 */
	public ConditionReference getHtmlL2235Reference() {
		return htmlFixedLn.getCondition(htmlL2235);	
	}

	/**
	 * Getter for htmlL2235 attribute.
	 * @return htmlL2235 attribute
	 */
	public boolean isHtmlL2235() {
		return getHtmlL2235Reference().getValue();	
	}

	/**
	 * Setter for htmlL2235 attribute.
	 * @param htmlL2235 the new value of htmlL2235
	 */
	public void setHtmlL2235(boolean htmlL2235) {
		getHtmlL2235Reference().setValue(htmlL2235);	
	}
	/**
	 * Gets the reference for attribute htmlL3042.
	 * @return the htmlL3042 attribute reference
	 */
	public ConditionReference getHtmlL3042Reference() {
		return htmlFixedLn.getCondition(htmlL3042);	
	}

	/**
	 * Getter for htmlL3042 attribute.
	 * @return htmlL3042 attribute
	 */
	public boolean isHtmlL3042() {
		return getHtmlL3042Reference().getValue();	
	}

	/**
	 * Setter for htmlL3042 attribute.
	 * @param htmlL3042 the new value of htmlL3042
	 */
	public void setHtmlL3042(boolean htmlL3042) {
		getHtmlL3042Reference().setValue(htmlL3042);	
	}
	/**
	 * Gets the reference for attribute htmlL31.
	 * @return the htmlL31 attribute reference
	 */
	public ConditionReference getHtmlL31Reference() {
		return htmlFixedLn.getCondition(htmlL31);	
	}

	/**
	 * Getter for htmlL31 attribute.
	 * @return htmlL31 attribute
	 */
	public boolean isHtmlL31() {
		return getHtmlL31Reference().getValue();	
	}

	/**
	 * Setter for htmlL31 attribute.
	 * @param htmlL31 the new value of htmlL31
	 */
	public void setHtmlL31(boolean htmlL31) {
		getHtmlL31Reference().setValue(htmlL31);	
	}
	/**
	 * Gets the reference for attribute htmlL43.
	 * @return the htmlL43 attribute reference
	 */
	public ConditionReference getHtmlL43Reference() {
		return htmlFixedLn.getCondition(htmlL43);	
	}

	/**
	 * Getter for htmlL43 attribute.
	 * @return htmlL43 attribute
	 */
	public boolean isHtmlL43() {
		return getHtmlL43Reference().getValue();	
	}

	/**
	 * Setter for htmlL43 attribute.
	 * @param htmlL43 the new value of htmlL43
	 */
	public void setHtmlL43(boolean htmlL43) {
		getHtmlL43Reference().setValue(htmlL43);	
	}
	/**
	 * Gets the reference for attribute htmlL47.
	 * @return the htmlL47 attribute reference
	 */
	public ConditionReference getHtmlL47Reference() {
		return htmlFixedLn.getCondition(htmlL47);	
	}

	/**
	 * Getter for htmlL47 attribute.
	 * @return htmlL47 attribute
	 */
	public boolean isHtmlL47() {
		return getHtmlL47Reference().getValue();	
	}

	/**
	 * Setter for htmlL47 attribute.
	 * @param htmlL47 the new value of htmlL47
	 */
	public void setHtmlL47(boolean htmlL47) {
		getHtmlL47Reference().setValue(htmlL47);	
	}
	/**
	 * Gets the reference for attribute htmlL48.
	 * @return the htmlL48 attribute reference
	 */
	public ConditionReference getHtmlL48Reference() {
		return htmlFixedLn.getCondition(htmlL48);	
	}

	/**
	 * Getter for htmlL48 attribute.
	 * @return htmlL48 attribute
	 */
	public boolean isHtmlL48() {
		return getHtmlL48Reference().getValue();	
	}

	/**
	 * Setter for htmlL48 attribute.
	 * @param htmlL48 the new value of htmlL48
	 */
	public void setHtmlL48(boolean htmlL48) {
		getHtmlL48Reference().setValue(htmlL48);	
	}
	/**
	 * Gets the reference for attribute htmlL50.
	 * @return the htmlL50 attribute reference
	 */
	public ConditionReference getHtmlL50Reference() {
		return htmlFixedLn.getCondition(htmlL50);	
	}

	/**
	 * Getter for htmlL50 attribute.
	 * @return htmlL50 attribute
	 */
	public boolean isHtmlL50() {
		return getHtmlL50Reference().getValue();	
	}

	/**
	 * Setter for htmlL50 attribute.
	 * @param htmlL50 the new value of htmlL50
	 */
	public void setHtmlL50(boolean htmlL50) {
		getHtmlL50Reference().setValue(htmlL50);	
	}
	/**
	 * Gets the reference for attribute htmlL51.
	 * @return the htmlL51 attribute reference
	 */
	public ConditionReference getHtmlL51Reference() {
		return htmlFixedLn.getCondition(htmlL51);	
	}

	/**
	 * Getter for htmlL51 attribute.
	 * @return htmlL51 attribute
	 */
	public boolean isHtmlL51() {
		return getHtmlL51Reference().getValue();	
	}

	/**
	 * Setter for htmlL51 attribute.
	 * @param htmlL51 the new value of htmlL51
	 */
	public void setHtmlL51(boolean htmlL51) {
		getHtmlL51Reference().setValue(htmlL51);	
	}
	/**
	 * Gets the reference for attribute htmlL53.
	 * @return the htmlL53 attribute reference
	 */
	public ConditionReference getHtmlL53Reference() {
		return htmlFixedLn.getCondition(htmlL53);	
	}

	/**
	 * Getter for htmlL53 attribute.
	 * @return htmlL53 attribute
	 */
	public boolean isHtmlL53() {
		return getHtmlL53Reference().getValue();	
	}

	/**
	 * Setter for htmlL53 attribute.
	 * @param htmlL53 the new value of htmlL53
	 */
	public void setHtmlL53(boolean htmlL53) {
		getHtmlL53Reference().setValue(htmlL53);	
	}
	/**
	 * Gets the reference for attribute htmlL54.
	 * @return the htmlL54 attribute reference
	 */
	public ConditionReference getHtmlL54Reference() {
		return htmlFixedLn.getCondition(htmlL54);	
	}

	/**
	 * Getter for htmlL54 attribute.
	 * @return htmlL54 attribute
	 */
	public boolean isHtmlL54() {
		return getHtmlL54Reference().getValue();	
	}

	/**
	 * Setter for htmlL54 attribute.
	 * @param htmlL54 the new value of htmlL54
	 */
	public void setHtmlL54(boolean htmlL54) {
		getHtmlL54Reference().setValue(htmlL54);	
	}
	/**
	 * Gets the reference for attribute htmlL58.
	 * @return the htmlL58 attribute reference
	 */
	public ConditionReference getHtmlL58Reference() {
		return htmlFixedLn.getCondition(htmlL58);	
	}

	/**
	 * Getter for htmlL58 attribute.
	 * @return htmlL58 attribute
	 */
	public boolean isHtmlL58() {
		return getHtmlL58Reference().getValue();	
	}

	/**
	 * Setter for htmlL58 attribute.
	 * @param htmlL58 the new value of htmlL58
	 */
	public void setHtmlL58(boolean htmlL58) {
		getHtmlL58Reference().setValue(htmlL58);	
	}
	/**
	 * Gets the reference for attribute htmlL61.
	 * @return the htmlL61 attribute reference
	 */
	public ConditionReference getHtmlL61Reference() {
		return htmlFixedLn.getCondition(htmlL61);	
	}

	/**
	 * Getter for htmlL61 attribute.
	 * @return htmlL61 attribute
	 */
	public boolean isHtmlL61() {
		return getHtmlL61Reference().getValue();	
	}

	/**
	 * Setter for htmlL61 attribute.
	 * @param htmlL61 the new value of htmlL61
	 */
	public void setHtmlL61(boolean htmlL61) {
		getHtmlL61Reference().setValue(htmlL61);	
	}
	/**
	 * Gets the reference for attribute htmlL64.
	 * @return the htmlL64 attribute reference
	 */
	public ConditionReference getHtmlL64Reference() {
		return htmlFixedLn.getCondition(htmlL64);	
	}

	/**
	 * Getter for htmlL64 attribute.
	 * @return htmlL64 attribute
	 */
	public boolean isHtmlL64() {
		return getHtmlL64Reference().getValue();	
	}

	/**
	 * Setter for htmlL64 attribute.
	 * @param htmlL64 the new value of htmlL64
	 */
	public void setHtmlL64(boolean htmlL64) {
		getHtmlL64Reference().setValue(htmlL64);	
	}
	/**
	 * Gets the reference for attribute htmlL75.
	 * @return the htmlL75 attribute reference
	 */
	public ConditionReference getHtmlL75Reference() {
		return htmlFixedLn.getCondition(htmlL75);	
	}

	/**
	 * Getter for htmlL75 attribute.
	 * @return htmlL75 attribute
	 */
	public boolean isHtmlL75() {
		return getHtmlL75Reference().getValue();	
	}

	/**
	 * Setter for htmlL75 attribute.
	 * @param htmlL75 the new value of htmlL75
	 */
	public void setHtmlL75(boolean htmlL75) {
		getHtmlL75Reference().setValue(htmlL75);	
	}
	/**
	 * Gets the reference for attribute htmlL78.
	 * @return the htmlL78 attribute reference
	 */
	public ConditionReference getHtmlL78Reference() {
		return htmlFixedLn.getCondition(htmlL78);	
	}

	/**
	 * Getter for htmlL78 attribute.
	 * @return htmlL78 attribute
	 */
	public boolean isHtmlL78() {
		return getHtmlL78Reference().getValue();	
	}

	/**
	 * Setter for htmlL78 attribute.
	 * @param htmlL78 the new value of htmlL78
	 */
	public void setHtmlL78(boolean htmlL78) {
		getHtmlL78Reference().setValue(htmlL78);	
	}
	/**
	 * Gets the reference for attribute htmlL79.
	 * @return the htmlL79 attribute reference
	 */
	public ConditionReference getHtmlL79Reference() {
		return htmlFixedLn.getCondition(htmlL79);	
	}

	/**
	 * Getter for htmlL79 attribute.
	 * @return htmlL79 attribute
	 */
	public boolean isHtmlL79() {
		return getHtmlL79Reference().getValue();	
	}

	/**
	 * Setter for htmlL79 attribute.
	 * @param htmlL79 the new value of htmlL79
	 */
	public void setHtmlL79(boolean htmlL79) {
		getHtmlL79Reference().setValue(htmlL79);	
	}
	/**
	 * Gets the reference for attribute htmlL80.
	 * @return the htmlL80 attribute reference
	 */
	public ConditionReference getHtmlL80Reference() {
		return htmlFixedLn.getCondition(htmlL80);	
	}

	/**
	 * Getter for htmlL80 attribute.
	 * @return htmlL80 attribute
	 */
	public boolean isHtmlL80() {
		return getHtmlL80Reference().getValue();	
	}

	/**
	 * Setter for htmlL80 attribute.
	 * @param htmlL80 the new value of htmlL80
	 */
	public void setHtmlL80(boolean htmlL80) {
		getHtmlL80Reference().setValue(htmlL80);	
	}
	
	/**
	 * Gets the reference for attribute htmlL11.
	 * @return the htmlL11 attribute reference
	 */
	public RangeReference getHtmlL11Reference() {
		return htmlL11.getReference();
	}	
				
	/**
	 * Setter for htmlL11 .
	 */
   	public void setHtmlL11(RangeReference reference) {
       	htmlL11.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute l11Acct.
	 * @return the l11Acct attribute reference
	 */
	public ElementaryRangeReference getL11AcctReference() {
		return l11Acct.getReference();
	}

	/**
	 * Getter for l11Acct attribute.
	 * @return l11Acct attribute
	 */
	public String getL11Acct() {
		return l11Acct.getValue();
	}

	/**
	 * Setter for l11Acct attribute.
	 * @param l11Acct the new value of l11Acct
	 */
	public void setL11Acct(String l11Acct) {
		this.l11Acct.setValue(l11Acct);
	}
	
	/**
	 * Gets the reference for attribute htmlL23.
	 * @return the htmlL23 attribute reference
	 */
	public RangeReference getHtmlL23Reference() {
		return htmlL23.getReference();
	}	
				
	/**
	 * Setter for htmlL23 .
	 */
   	public void setHtmlL23(RangeReference reference) {
       	htmlL23.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute l23Name.
	 * @return the l23Name attribute reference
	 */
	public ElementaryRangeReference getL23NameReference() {
		return l23Name.getReference();
	}

	/**
	 * Getter for l23Name attribute.
	 * @return l23Name attribute
	 */
	public String getL23Name() {
		return l23Name.getValue();
	}

	/**
	 * Setter for l23Name attribute.
	 * @param l23Name the new value of l23Name
	 */
	public void setL23Name(String l23Name) {
		this.l23Name.setValue(l23Name);
	}
	/**
	 * Gets the reference for attribute htmlAddrLn.
	 * @return the htmlAddrLn attribute reference
	 */
	public ElementaryRangeReference getHtmlAddrLnReference() {
		return htmlAddrLn.getReference();
	}

	/**
	 * Getter for htmlAddrLn attribute.
	 * @return htmlAddrLn attribute
	 */
	public String getHtmlAddrLn() {
		return htmlAddrLn.getValue();
	}

	/**
	 * Setter for htmlAddrLn attribute.
	 * @param htmlAddrLn the new value of htmlAddrLn
	 */
	public void setHtmlAddrLn(String htmlAddrLn) {
		this.htmlAddrLn.setValue(htmlAddrLn);
	}
	/**
	 * Gets the reference for attribute htmlBsicLn.
	 * @return the htmlBsicLn attribute reference
	 */
	public ElementaryRangeReference getHtmlBsicLnReference() {
		return htmlBsicLn.getReference();
	}

	/**
	 * Getter for htmlBsicLn attribute.
	 * @return htmlBsicLn attribute
	 */
	public String getHtmlBsicLn() {
		return htmlBsicLn.getValue();
	}

	/**
	 * Setter for htmlBsicLn attribute.
	 * @param htmlBsicLn the new value of htmlBsicLn
	 */
	public void setHtmlBsicLn(String htmlBsicLn) {
		this.htmlBsicLn.setValue(htmlBsicLn);
	}
	/**
	 * Gets the reference for attribute htmlTranLn.
	 * @return the htmlTranLn attribute reference
	 */
	public ElementaryRangeReference getHtmlTranLnReference() {
		return htmlTranLn.getReference();
	}

	/**
	 * Getter for htmlTranLn attribute.
	 * @return htmlTranLn attribute
	 */
	public String getHtmlTranLn() {
		return htmlTranLn.getValue();
	}

	/**
	 * Setter for htmlTranLn attribute.
	 * @param htmlTranLn the new value of htmlTranLn
	 */
	public void setHtmlTranLn(String htmlTranLn) {
		this.htmlTranLn.setValue(htmlTranLn);
	}
}
