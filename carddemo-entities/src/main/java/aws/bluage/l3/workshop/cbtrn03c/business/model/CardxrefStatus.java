package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity CardxrefStatus.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT<br>
 *  <br>
</pre>
 * 
 * <p>About 'cardxrefStat1' field, <br>
 * </p>
 * 
 * <p>About 'cardxrefStat2' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class CardxrefStatus extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cardxrefStat1 = new Elementary(root,new AlphanumericType(1));
	private final Elementary cardxrefStat2 = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new CardxrefStatus with a default record.
	 * @param configuration the configuration
	 */
	public CardxrefStatus(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CardxrefStatus bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CardxrefStatus(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute cardxrefStat1.
	 * @return the cardxrefStat1 attribute reference
	 */
	public ElementaryRangeReference getCardxrefStat1Reference() {
		return cardxrefStat1.getReference();
	}

	/**
	 * Getter for cardxrefStat1 attribute.
	 * @return cardxrefStat1 attribute
	 */
	public String getCardxrefStat1() {
		return cardxrefStat1.getValue();
	}

	/**
	 * Setter for cardxrefStat1 attribute.
	 * @param cardxrefStat1 the new value of cardxrefStat1
	 */
	public void setCardxrefStat1(String cardxrefStat1) {
		this.cardxrefStat1.setValue(cardxrefStat1);
	}
	/**
	 * Gets the reference for attribute cardxrefStat2.
	 * @return the cardxrefStat2 attribute reference
	 */
	public ElementaryRangeReference getCardxrefStat2Reference() {
		return cardxrefStat2.getReference();
	}

	/**
	 * Getter for cardxrefStat2 attribute.
	 * @return cardxrefStat2 attribute
	 */
	public String getCardxrefStat2() {
		return cardxrefStat2.getValue();
	}

	/**
	 * Setter for cardxrefStat2 attribute.
	 * @param cardxrefStat2 the new value of cardxrefStat2
	 */
	public void setCardxrefStat2(String cardxrefStat2) {
		this.cardxrefStat2.setValue(cardxrefStat2);
	}
}
