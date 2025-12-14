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
 * Data simplifier entity UsStateCodeToEdit.
<pre>
 * 
 * Legacy Documentation:<br>
 *  Search list of valid Phone area codes<br>
</pre>
 * 
 * <p>About 'usStateCodeToEdit' field, <br>
 *  Search list of valid Phone area codes<br></p>
 * 
 * <p>About 'validUsStateCode' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class UsStateCodeToEdit extends RecordEntity {

	private final Group root = new Group(getData()); 
	
	/**
	 * Search list of valid Phone area codes
	 */
	private final Elementary usStateCodeToEdit = new Elementary(root,new AlphanumericType(2));
	private final ConditionName validUsStateCode=new ConditionName(usStateCodeToEdit,"AL",
	"AK",
	"AZ",
	"AR",
	"CA",
	"CO",
	"CT",
	"DE",
	"FL",
	"GA",
	"HI",
	"ID",
	"IL",
	"IN",
	"IA",
	"KS",
	"KY",
	"LA",
	"ME",
	"MD",
	"MA",
	"MI",
	"MN",
	"MS",
	"MO",
	"MT",
	"NE",
	"NV",
	"NH",
	"NJ",
	"NM",
	"NY",
	"NC",
	"ND",
	"OH",
	"OK",
	"OR",
	"PA",
	"RI",
	"SC",
	"SD",
	"TN",
	"TX",
	"UT",
	"VT",
	"VA",
	"WA",
	"WV",
	"WI",
	"WY",
	"DC",
	"AS",
	"GU",
	"MP",
	"PR",
	"VI");
	

	/**
	 * Instantiate a new UsStateCodeToEdit with a default record.
	 * @param configuration the configuration
	 */
	public UsStateCodeToEdit(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new UsStateCodeToEdit bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public UsStateCodeToEdit(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute usStateCodeToEdit.
	 * @return the usStateCodeToEdit attribute reference
	 */
	public ElementaryRangeReference getUsStateCodeToEditReference() {
		return usStateCodeToEdit.getReference();
	}

	/**
	 * Getter for usStateCodeToEdit attribute.
	 * @return usStateCodeToEdit attribute
	 */
	public String getUsStateCodeToEdit() {
		return usStateCodeToEdit.getValue();
	}

	/**
	 * Setter for usStateCodeToEdit attribute.
	 * @param usStateCodeToEdit the new value of usStateCodeToEdit
	 */
	public void setUsStateCodeToEdit(String usStateCodeToEdit) {
		this.usStateCodeToEdit.setValue(usStateCodeToEdit);
	}
	/**
	 * Gets the reference for attribute validUsStateCode.
	 * @return the validUsStateCode attribute reference
	 */
	public ConditionReference getValidUsStateCodeReference() {
		return usStateCodeToEdit.getCondition(validUsStateCode);	
	}

	/**
	 * Getter for validUsStateCode attribute.
	 * @return validUsStateCode attribute
	 */
	public boolean isValidUsStateCode() {
		return getValidUsStateCodeReference().getValue();	
	}

	/**
	 * Setter for validUsStateCode attribute.
	 * @param validUsStateCode the new value of validUsStateCode
	 */
	public void setValidUsStateCode(boolean validUsStateCode) {
		getValidUsStateCodeReference().setValue(validUsStateCode);	
	}
}
