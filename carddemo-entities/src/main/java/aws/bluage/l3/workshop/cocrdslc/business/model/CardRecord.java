package aws.bluage.l3.workshop.cocrdslc.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity CardRecord.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:59 CDT<br>
 *  <br>
 *  Dataset layouts<br>
 *  ACCOUNT RECORD LAYOUT<br>
 *  COPY CVACT01Y.<br>
 *  CARD RECORD LAYOUT<br>
 *  ****************************************************************<br>
 *      Data-structure for card entity (RECLN 150)<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'cardNum' field, <br>
 * </p>
 * 
 * <p>About 'cardAcctId' field, <br>
 * </p>
 * 
 * <p>About 'cardCvvCd' field, <br>
 * </p>
 * 
 * <p>About 'cardEmbossedName' field, <br>
 * </p>
 * 
 * <p>About 'cardExpiraionDate' field, <br>
 * </p>
 * 
 * <p>About 'cardActiveStatus' field, <br>
 * </p>
 * 
 * @see RecordEntity
 */
public class CardRecord extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Elementary cardNum = new Elementary(root,new AlphanumericType(16));
	private final Elementary cardAcctId = new Elementary(root,new ZonedType(11, 0, false));
	private final Elementary cardCvvCd = new Elementary(root,new ZonedType(3, 0, false));
	private final Elementary cardEmbossedName = new Elementary(root,new AlphanumericType(50));
	private final Elementary cardExpiraionDate = new Elementary(root,new AlphanumericType(10));
	private final Elementary cardActiveStatus = new Elementary(root,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(59));
	

	/**
	 * Instantiate a new CardRecord with a default record.
	 * @param configuration the configuration
	 */
	public CardRecord(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new CardRecord bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public CardRecord(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute cardNum.
	 * @return the cardNum attribute reference
	 */
	public ElementaryRangeReference getCardNumReference() {
		return cardNum.getReference();
	}

	/**
	 * Getter for cardNum attribute.
	 * @return cardNum attribute
	 */
	public String getCardNum() {
		return cardNum.getValue();
	}

	/**
	 * Setter for cardNum attribute.
	 * @param cardNum the new value of cardNum
	 */
	public void setCardNum(String cardNum) {
		this.cardNum.setValue(cardNum);
	}
	/**
	 * Gets the reference for attribute cardAcctId.
	 * @return the cardAcctId attribute reference
	 */
	public ElementaryRangeReference getCardAcctIdReference() {
		return cardAcctId.getReference();
	}

	/**
	 * Getter for cardAcctId attribute.
	 * @return cardAcctId attribute
	 */
	public long getCardAcctId() {
		return cardAcctId.getValue();
	}

	/**
	 * Setter for cardAcctId attribute.
	 * @param cardAcctId the new value of cardAcctId
	 */
	public void setCardAcctId(long cardAcctId) {
		this.cardAcctId.setValue(cardAcctId);
	}
	/**
	 * Gets the reference for attribute cardCvvCd.
	 * @return the cardCvvCd attribute reference
	 */
	public ElementaryRangeReference getCardCvvCdReference() {
		return cardCvvCd.getReference();
	}

	/**
	 * Getter for cardCvvCd attribute.
	 * @return cardCvvCd attribute
	 */
	public int getCardCvvCd() {
		return cardCvvCd.getValue();
	}

	/**
	 * Setter for cardCvvCd attribute.
	 * @param cardCvvCd the new value of cardCvvCd
	 */
	public void setCardCvvCd(int cardCvvCd) {
		this.cardCvvCd.setValue(cardCvvCd);
	}
	/**
	 * Gets the reference for attribute cardEmbossedName.
	 * @return the cardEmbossedName attribute reference
	 */
	public ElementaryRangeReference getCardEmbossedNameReference() {
		return cardEmbossedName.getReference();
	}

	/**
	 * Getter for cardEmbossedName attribute.
	 * @return cardEmbossedName attribute
	 */
	public String getCardEmbossedName() {
		return cardEmbossedName.getValue();
	}

	/**
	 * Setter for cardEmbossedName attribute.
	 * @param cardEmbossedName the new value of cardEmbossedName
	 */
	public void setCardEmbossedName(String cardEmbossedName) {
		this.cardEmbossedName.setValue(cardEmbossedName);
	}
	/**
	 * Gets the reference for attribute cardExpiraionDate.
	 * @return the cardExpiraionDate attribute reference
	 */
	public ElementaryRangeReference getCardExpiraionDateReference() {
		return cardExpiraionDate.getReference();
	}

	/**
	 * Getter for cardExpiraionDate attribute.
	 * @return cardExpiraionDate attribute
	 */
	public String getCardExpiraionDate() {
		return cardExpiraionDate.getValue();
	}

	/**
	 * Setter for cardExpiraionDate attribute.
	 * @param cardExpiraionDate the new value of cardExpiraionDate
	 */
	public void setCardExpiraionDate(String cardExpiraionDate) {
		this.cardExpiraionDate.setValue(cardExpiraionDate);
	}
	/**
	 * Gets the reference for attribute cardActiveStatus.
	 * @return the cardActiveStatus attribute reference
	 */
	public ElementaryRangeReference getCardActiveStatusReference() {
		return cardActiveStatus.getReference();
	}

	/**
	 * Getter for cardActiveStatus attribute.
	 * @return cardActiveStatus attribute
	 */
	public String getCardActiveStatus() {
		return cardActiveStatus.getValue();
	}

	/**
	 * Setter for cardActiveStatus attribute.
	 * @param cardActiveStatus the new value of cardActiveStatus
	 */
	public void setCardActiveStatus(String cardActiveStatus) {
		this.cardActiveStatus.setValue(cardActiveStatus);
	}
}
