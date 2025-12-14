package aws.bluage.l3.workshop.coactupc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ConditionReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.ConditionName;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity UsStateZipcodeToEdit.
<pre>
 * 
 * Legacy Documentation:<br>
 *  State Zip Code Combinations<br>
</pre>
 * 
 * <p>About 'usStateAndFirstZip2' field, <br>
 * </p>
 * 
 * <p>About 'validUsStateZipCd2Combo' field, <br>
 * </p>
 * 
 * <p>About 'last3OfZip' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class UsStateZipcodeToEdit extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary usStateAndFirstZip2 = new Elementary(root,new AlphanumericType(4));
	private final ConditionName validUsStateZipCd2Combo=new ConditionName(usStateAndFirstZip2,"AA34",
	"AE90",
	"AE91",
	"AE92",
	"AE93",
	"AE94",
	"AE95",
	"AE96",
	"AE97",
	"AE98",
	"AK99",
	"AL35",
	"AL36",
	"AP96",
	"AR71",
	"AR72",
	"AS96",
	"AZ85",
	"AZ86",
	"CA90",
	"CA91",
	"CA92",
	"CA93",
	"CA94",
	"CA95",
	"CA96",
	"CO80",
	"CO81",
	"CT60",
	"CT61",
	"CT62",
	"CT63",
	"CT64",
	"CT65",
	"CT66",
	"CT67",
	"CT68",
	"CT69",
	"DC20",
	"DC56",
	"DC88",
	"DE19",
	"FL32",
	"FL33",
	"FL34",
	"FM96",
	"GA30",
	"GA31",
	"GA39",
	"GU96",
	"HI96",
	"IA50",
	"IA51",
	"IA52",
	"ID83",
	"IL60",
	"IL61",
	"IL62",
	"IN46",
	"IN47",
	"KS66",
	"KS67",
	"KY40",
	"KY41",
	"KY42",
	"LA70",
	"LA71",
	"MA10",
	"MA11",
	"MA12",
	"MA13",
	"MA14",
	"MA15",
	"MA16",
	"MA17",
	"MA18",
	"MA19",
	"MA20",
	"MA21",
	"MA22",
	"MA23",
	"MA24",
	"MA25",
	"MA26",
	"MA27",
	"MA55",
	"MD20",
	"MD21",
	"ME39",
	"ME40",
	"ME41",
	"ME42",
	"ME43",
	"ME44",
	"ME45",
	"ME46",
	"ME47",
	"ME48",
	"ME49",
	"MH96",
	"MI48",
	"MI49",
	"MN55",
	"MN56",
	"MO63",
	"MO64",
	"MO65",
	"MO72",
	"MP96",
	"MS38",
	"MS39",
	"MT59",
	"NC27",
	"NC28",
	"ND58",
	"NE68",
	"NE69",
	"NH30",
	"NH31",
	"NH32",
	"NH33",
	"NH34",
	"NH35",
	"NH36",
	"NH37",
	"NH38",
	"NJ70",
	"NJ71",
	"NJ72",
	"NJ73",
	"NJ74",
	"NJ75",
	"NJ76",
	"NJ77",
	"NJ78",
	"NJ79",
	"NJ80",
	"NJ81",
	"NJ82",
	"NJ83",
	"NJ84",
	"NJ85",
	"NJ86",
	"NJ87",
	"NJ88",
	"NJ89",
	"NM87",
	"NM88",
	"NV88",
	"NV89",
	"NY50",
	"NY54",
	"NY63",
	"NY10",
	"NY11",
	"NY12",
	"NY13",
	"NY14",
	"OH43",
	"OH44",
	"OH45",
	"OK73",
	"OK74",
	"OR97",
	"PA15",
	"PA16",
	"PA17",
	"PA18",
	"PA19",
	"PR60",
	"PR61",
	"PR62",
	"PR63",
	"PR64",
	"PR65",
	"PR66",
	"PR67",
	"PR68",
	"PR69",
	"PR70",
	"PR71",
	"PR72",
	"PR73",
	"PR74",
	"PR75",
	"PR76",
	"PR77",
	"PR78",
	"PR79",
	"PR90",
	"PR91",
	"PR92",
	"PR93",
	"PR94",
	"PR95",
	"PR96",
	"PR97",
	"PR98",
	"PW96",
	"RI28",
	"RI29",
	"SC29",
	"SD57",
	"TN37",
	"TN38",
	"TX73",
	"TX75",
	"TX76",
	"TX77",
	"TX78",
	"TX79",
	"TX88",
	"UT84",
	"VA20",
	"VA22",
	"VA23",
	"VA24",
	"VI80",
	"VI82",
	"VI83",
	"VI84",
	"VI85",
	"VT50",
	"VT51",
	"VT52",
	"VT53",
	"VT54",
	"VT56",
	"VT57",
	"VT58",
	"VT59",
	"WA98",
	"WA99",
	"WI53",
	"WI54",
	"WV24",
	"WV25",
	"WV26",
	"WY82",
	"WY83");
	private final Elementary last3OfZip = new Elementary(root,new AlphanumericType(3));
	

	/**
	 * Instantiate a new UsStateZipcodeToEdit with a default record.
	 * @param configuration the configuration
	 */
	public UsStateZipcodeToEdit(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new UsStateZipcodeToEdit bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public UsStateZipcodeToEdit(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute usStateAndFirstZip2.
	 * @return the usStateAndFirstZip2 attribute reference
	 */
	public ElementaryRangeReference getUsStateAndFirstZip2Reference() {
		return usStateAndFirstZip2.getReference();
	}

	/**
	 * Getter for usStateAndFirstZip2 attribute.
	 * @return usStateAndFirstZip2 attribute
	 */
	public String getUsStateAndFirstZip2() {
		return usStateAndFirstZip2.getValue();
	}

	/**
	 * Setter for usStateAndFirstZip2 attribute.
	 * @param usStateAndFirstZip2 the new value of usStateAndFirstZip2
	 */
	public void setUsStateAndFirstZip2(String usStateAndFirstZip2) {
		this.usStateAndFirstZip2.setValue(usStateAndFirstZip2);
	}
	/**
	 * Gets the reference for attribute validUsStateZipCd2Combo.
	 * @return the validUsStateZipCd2Combo attribute reference
	 */
	public ConditionReference getValidUsStateZipCd2ComboReference() {
		return usStateAndFirstZip2.getCondition(validUsStateZipCd2Combo);	
	}

	/**
	 * Getter for validUsStateZipCd2Combo attribute.
	 * @return validUsStateZipCd2Combo attribute
	 */
	public boolean isValidUsStateZipCd2Combo() {
		return getValidUsStateZipCd2ComboReference().getValue();	
	}

	/**
	 * Setter for validUsStateZipCd2Combo attribute.
	 * @param validUsStateZipCd2Combo the new value of validUsStateZipCd2Combo
	 */
	public void setValidUsStateZipCd2Combo(boolean validUsStateZipCd2Combo) {
		getValidUsStateZipCd2ComboReference().setValue(validUsStateZipCd2Combo);	
	}
	/**
	 * Gets the reference for attribute last3OfZip.
	 * @return the last3OfZip attribute reference
	 */
	public ElementaryRangeReference getLast3OfZipReference() {
		return last3OfZip.getReference();
	}

	/**
	 * Getter for last3OfZip attribute.
	 * @return last3OfZip attribute
	 */
	public String getLast3OfZip() {
		return last3OfZip.getValue();
	}

	/**
	 * Setter for last3OfZip attribute.
	 * @param last3OfZip the new value of last3OfZip
	 */
	public void setLast3OfZip(String last3OfZip) {
		this.last3OfZip.setValue(last3OfZip);
	}
}
