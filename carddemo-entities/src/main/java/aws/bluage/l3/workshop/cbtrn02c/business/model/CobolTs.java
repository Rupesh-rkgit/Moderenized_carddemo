package aws.bluage.l3.workshop.cbtrn02c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity CobolTs.
<pre>
 * 
 * Legacy Documentation:<br>
 *   T I M E S T A M P   D B 2  X(26)     EEEE-MM-DD-UU.MM.SS.HH0000<br>
</pre>
 * 
 * <p>About 'cobYyyy' field, <br>
 * </p>
 * 
 * <p>About 'cobMm' field, <br>
 * </p>
 * 
 * <p>About 'cobDd' field, <br>
 * </p>
 * 
 * <p>About 'cobHh' field, <br>
 * </p>
 * 
 * <p>About 'cobMin' field, <br>
 * </p>
 * 
 * <p>About 'cobSs' field, <br>
 * </p>
 * 
 * <p>About 'cobMil' field, <br>
 * </p>
 * 
 * <p>About 'cobRest' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class CobolTs extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cobYyyy = new Elementary(root,new AlphanumericType(4));
	private final Elementary cobMm = new Elementary(root,new AlphanumericType(2));
	private final Elementary cobDd = new Elementary(root,new AlphanumericType(2));
	private final Elementary cobHh = new Elementary(root,new AlphanumericType(2));
	private final Elementary cobMin = new Elementary(root,new AlphanumericType(2));
	private final Elementary cobSs = new Elementary(root,new AlphanumericType(2));
	private final Elementary cobMil = new Elementary(root,new AlphanumericType(2));
	private final Elementary cobRest = new Elementary(root,new AlphanumericType(5));
	

	/**
	 * Instantiate a new CobolTs with a default record.
	 * @param configuration the configuration
	 */
	public CobolTs(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CobolTs bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CobolTs(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute cobYyyy.
	 * @return the cobYyyy attribute reference
	 */
	public ElementaryRangeReference getCobYyyyReference() {
		return cobYyyy.getReference();
	}

	/**
	 * Getter for cobYyyy attribute.
	 * @return cobYyyy attribute
	 */
	public String getCobYyyy() {
		return cobYyyy.getValue();
	}

	/**
	 * Setter for cobYyyy attribute.
	 * @param cobYyyy the new value of cobYyyy
	 */
	public void setCobYyyy(String cobYyyy) {
		this.cobYyyy.setValue(cobYyyy);
	}
	/**
	 * Gets the reference for attribute cobMm.
	 * @return the cobMm attribute reference
	 */
	public ElementaryRangeReference getCobMmReference() {
		return cobMm.getReference();
	}

	/**
	 * Getter for cobMm attribute.
	 * @return cobMm attribute
	 */
	public String getCobMm() {
		return cobMm.getValue();
	}

	/**
	 * Setter for cobMm attribute.
	 * @param cobMm the new value of cobMm
	 */
	public void setCobMm(String cobMm) {
		this.cobMm.setValue(cobMm);
	}
	/**
	 * Gets the reference for attribute cobDd.
	 * @return the cobDd attribute reference
	 */
	public ElementaryRangeReference getCobDdReference() {
		return cobDd.getReference();
	}

	/**
	 * Getter for cobDd attribute.
	 * @return cobDd attribute
	 */
	public String getCobDd() {
		return cobDd.getValue();
	}

	/**
	 * Setter for cobDd attribute.
	 * @param cobDd the new value of cobDd
	 */
	public void setCobDd(String cobDd) {
		this.cobDd.setValue(cobDd);
	}
	/**
	 * Gets the reference for attribute cobHh.
	 * @return the cobHh attribute reference
	 */
	public ElementaryRangeReference getCobHhReference() {
		return cobHh.getReference();
	}

	/**
	 * Getter for cobHh attribute.
	 * @return cobHh attribute
	 */
	public String getCobHh() {
		return cobHh.getValue();
	}

	/**
	 * Setter for cobHh attribute.
	 * @param cobHh the new value of cobHh
	 */
	public void setCobHh(String cobHh) {
		this.cobHh.setValue(cobHh);
	}
	/**
	 * Gets the reference for attribute cobMin.
	 * @return the cobMin attribute reference
	 */
	public ElementaryRangeReference getCobMinReference() {
		return cobMin.getReference();
	}

	/**
	 * Getter for cobMin attribute.
	 * @return cobMin attribute
	 */
	public String getCobMin() {
		return cobMin.getValue();
	}

	/**
	 * Setter for cobMin attribute.
	 * @param cobMin the new value of cobMin
	 */
	public void setCobMin(String cobMin) {
		this.cobMin.setValue(cobMin);
	}
	/**
	 * Gets the reference for attribute cobSs.
	 * @return the cobSs attribute reference
	 */
	public ElementaryRangeReference getCobSsReference() {
		return cobSs.getReference();
	}

	/**
	 * Getter for cobSs attribute.
	 * @return cobSs attribute
	 */
	public String getCobSs() {
		return cobSs.getValue();
	}

	/**
	 * Setter for cobSs attribute.
	 * @param cobSs the new value of cobSs
	 */
	public void setCobSs(String cobSs) {
		this.cobSs.setValue(cobSs);
	}
	/**
	 * Gets the reference for attribute cobMil.
	 * @return the cobMil attribute reference
	 */
	public ElementaryRangeReference getCobMilReference() {
		return cobMil.getReference();
	}

	/**
	 * Getter for cobMil attribute.
	 * @return cobMil attribute
	 */
	public String getCobMil() {
		return cobMil.getValue();
	}

	/**
	 * Setter for cobMil attribute.
	 * @param cobMil the new value of cobMil
	 */
	public void setCobMil(String cobMil) {
		this.cobMil.setValue(cobMil);
	}
	/**
	 * Gets the reference for attribute cobRest.
	 * @return the cobRest attribute reference
	 */
	public ElementaryRangeReference getCobRestReference() {
		return cobRest.getReference();
	}

	/**
	 * Getter for cobRest attribute.
	 * @return cobRest attribute
	 */
	public String getCobRest() {
		return cobRest.getValue();
	}

	/**
	 * Setter for cobRest attribute.
	 * @param cobRest the new value of cobRest
	 */
	public void setCobRest(String cobRest) {
		this.cobRest.setValue(cobRest);
	}
}
