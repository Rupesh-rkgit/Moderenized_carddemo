package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity ReportNameHeader.
<pre>
 * 
 * Legacy Documentation:<br>
 *  ****************************************************************<br>
 *      Reporting data structure for transaction report<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'reptShortName' field, <br>
 * </p>
 * 
 * <p>About 'reptLongName' field, <br>
 * </p>
 * 
 * <p>About 'reptDateHeader' field, <br>
 * </p>
 * 
 * <p>About 'reptStartDate' field, <br>
 * </p>
 * 
 * <p>About 'reptEndDate' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class ReportNameHeader extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary reptShortName = new Elementary(root,new AlphanumericType(38),"DALYREPT");
	private final Elementary reptLongName = new Elementary(root,new AlphanumericType(41),"Daily Transaction Report");
	private final Elementary reptDateHeader = new Elementary(root,new AlphanumericType(12),"Date Range: ");
	private final Elementary reptStartDate = new Elementary(root,new AlphanumericType(10)," ");
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(4)," to ");
	private final Elementary reptEndDate = new Elementary(root,new AlphanumericType(10)," ");
	

	/**
	 * Instantiate a new ReportNameHeader with a default record.
	 * @param configuration the configuration
	 */
	public ReportNameHeader(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new ReportNameHeader bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public ReportNameHeader(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute reptShortName.
	 * @return the reptShortName attribute reference
	 */
	public ElementaryRangeReference getReptShortNameReference() {
		return reptShortName.getReference();
	}

	/**
	 * Getter for reptShortName attribute.
	 * @return reptShortName attribute
	 */
	public String getReptShortName() {
		return reptShortName.getValue();
	}

	/**
	 * Setter for reptShortName attribute.
	 * @param reptShortName the new value of reptShortName
	 */
	public void setReptShortName(String reptShortName) {
		this.reptShortName.setValue(reptShortName);
	}
	/**
	 * Gets the reference for attribute reptLongName.
	 * @return the reptLongName attribute reference
	 */
	public ElementaryRangeReference getReptLongNameReference() {
		return reptLongName.getReference();
	}

	/**
	 * Getter for reptLongName attribute.
	 * @return reptLongName attribute
	 */
	public String getReptLongName() {
		return reptLongName.getValue();
	}

	/**
	 * Setter for reptLongName attribute.
	 * @param reptLongName the new value of reptLongName
	 */
	public void setReptLongName(String reptLongName) {
		this.reptLongName.setValue(reptLongName);
	}
	/**
	 * Gets the reference for attribute reptDateHeader.
	 * @return the reptDateHeader attribute reference
	 */
	public ElementaryRangeReference getReptDateHeaderReference() {
		return reptDateHeader.getReference();
	}

	/**
	 * Getter for reptDateHeader attribute.
	 * @return reptDateHeader attribute
	 */
	public String getReptDateHeader() {
		return reptDateHeader.getValue();
	}

	/**
	 * Setter for reptDateHeader attribute.
	 * @param reptDateHeader the new value of reptDateHeader
	 */
	public void setReptDateHeader(String reptDateHeader) {
		this.reptDateHeader.setValue(reptDateHeader);
	}
	/**
	 * Gets the reference for attribute reptStartDate.
	 * @return the reptStartDate attribute reference
	 */
	public ElementaryRangeReference getReptStartDateReference() {
		return reptStartDate.getReference();
	}

	/**
	 * Getter for reptStartDate attribute.
	 * @return reptStartDate attribute
	 */
	public String getReptStartDate() {
		return reptStartDate.getValue();
	}

	/**
	 * Setter for reptStartDate attribute.
	 * @param reptStartDate the new value of reptStartDate
	 */
	public void setReptStartDate(String reptStartDate) {
		this.reptStartDate.setValue(reptStartDate);
	}
	/**
	 * Gets the reference for attribute reptEndDate.
	 * @return the reptEndDate attribute reference
	 */
	public ElementaryRangeReference getReptEndDateReference() {
		return reptEndDate.getReference();
	}

	/**
	 * Getter for reptEndDate attribute.
	 * @return reptEndDate attribute
	 */
	public String getReptEndDate() {
		return reptEndDate.getValue();
	}

	/**
	 * Setter for reptEndDate attribute.
	 * @param reptEndDate the new value of reptEndDate
	 */
	public void setReptEndDate(String reptEndDate) {
		this.reptEndDate.setValue(reptEndDate);
	}
}
