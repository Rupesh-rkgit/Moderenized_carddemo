package aws.bluage.l3.workshop.cousr00c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.FixedArray;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity WsUserData.
 * 
 * <p>About 'userRec' field, <br>uml entity: aws.bluage.l3.workshop.cousr00c.business.model.userRec
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsUserData extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group userRec = new Group(root,new FixedArray(10));
	private final Elementary userSel = new Elementary(userRec,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(userRec,new AlphanumericType(2));
	private final Elementary userId = new Elementary(userRec,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(userRec,new AlphanumericType(2));
	private final Elementary userName = new Elementary(userRec,new AlphanumericType(25));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(userRec,new AlphanumericType(2));
	private final Elementary userType = new Elementary(userRec,new AlphanumericType(8));
	

	/**
	 * Instantiate a new WsUserData with a default record.
	 * @param configuration the configuration
	 */
	public WsUserData(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsUserData bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsUserData(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Indexed getter for group userRec attribute.
	 * @param indexes the indexes
	 * @return userRec attribute
	 */
	public RangeReference getItemFromUserRecReference(Integer... indexes){
		return userRec.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed setter for group userRec attribute.
	 * @param RangeReference rangeReference to copy bytes from.
	 * @param indexes the indexes
	 */
	public void setItemFromUserRec( RangeReference rangeReference, Integer... indexes){
		userRec.getIndexedReference(indexes).setBytes(rangeReference.getBytes());
	}

	/**
	 * Collection size getter for group userRec attribute.
	 * @return  the collection size for attributeuserRec
	 */
	public int getUserRecSize(){
		return userRec.getRepetition().getCount();
	}				
	
	/**
	 * Indexed getter for userSel attribute.
	 * @param indexes the indexes
	 * @return userSel attribute
	 */
	public ElementaryRangeReference getItemFromUserSelReference(Integer... indexes) {
		return userSel.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for userSel attribute.
	 * @param indexes the indexes
	 * @return userSel attribute
	 */
	public String getItemFromUserSel(Integer... indexes) {
		return userSel.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for userSel attribute.
	 * @param userSel the new value of userSel for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromUserSel(String userSel,Integer... indexes) {
		this.userSel.setIndexedValue(userSel,indexes);
	}
	
	/**
	 * Collection size getter for userSel attribute.
	 * @return  the collection size for attributeuserSel
	 */
	public int getUserSelSize(){
		return userSel.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for userSel attribute.
	 * @param indexes the indexes
	 * @return userSel attribute
	 */
	public ElementaryRangeReference getUserSelReference() {
		return userSel.getReference();
	}
	
	/**
	 * Indexed getter for userSel attribute.
	 * @param indexes the indexes
	 * @return userSel attribute
	 */
	public String getUserSel() {
		return userSel.getValue();
	}
	
	/**
	 * Indexed setter for userSel attribute.
	 * @param userSel the new value of userSel for given indexes
	 * @param indexes the indexes
	 */
	public void setUserSel(String userSel) {
		this.userSel.setValue(userSel);
	}
	
	/**
	 * Indexed getter for userId attribute.
	 * @param indexes the indexes
	 * @return userId attribute
	 */
	public ElementaryRangeReference getItemFromUserIdReference(Integer... indexes) {
		return userId.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for userId attribute.
	 * @param indexes the indexes
	 * @return userId attribute
	 */
	public String getItemFromUserId(Integer... indexes) {
		return userId.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for userId attribute.
	 * @param userId the new value of userId for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromUserId(String userId,Integer... indexes) {
		this.userId.setIndexedValue(userId,indexes);
	}
	
	/**
	 * Collection size getter for userId attribute.
	 * @return  the collection size for attributeuserId
	 */
	public int getUserIdSize(){
		return userId.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for userId attribute.
	 * @param indexes the indexes
	 * @return userId attribute
	 */
	public ElementaryRangeReference getUserIdReference() {
		return userId.getReference();
	}
	
	/**
	 * Indexed getter for userId attribute.
	 * @param indexes the indexes
	 * @return userId attribute
	 */
	public String getUserId() {
		return userId.getValue();
	}
	
	/**
	 * Indexed setter for userId attribute.
	 * @param userId the new value of userId for given indexes
	 * @param indexes the indexes
	 */
	public void setUserId(String userId) {
		this.userId.setValue(userId);
	}
	
	/**
	 * Indexed getter for userName attribute.
	 * @param indexes the indexes
	 * @return userName attribute
	 */
	public ElementaryRangeReference getItemFromUserNameReference(Integer... indexes) {
		return userName.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for userName attribute.
	 * @param indexes the indexes
	 * @return userName attribute
	 */
	public String getItemFromUserName(Integer... indexes) {
		return userName.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for userName attribute.
	 * @param userName the new value of userName for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromUserName(String userName,Integer... indexes) {
		this.userName.setIndexedValue(userName,indexes);
	}
	
	/**
	 * Collection size getter for userName attribute.
	 * @return  the collection size for attributeuserName
	 */
	public int getUserNameSize(){
		return userName.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for userName attribute.
	 * @param indexes the indexes
	 * @return userName attribute
	 */
	public ElementaryRangeReference getUserNameReference() {
		return userName.getReference();
	}
	
	/**
	 * Indexed getter for userName attribute.
	 * @param indexes the indexes
	 * @return userName attribute
	 */
	public String getUserName() {
		return userName.getValue();
	}
	
	/**
	 * Indexed setter for userName attribute.
	 * @param userName the new value of userName for given indexes
	 * @param indexes the indexes
	 */
	public void setUserName(String userName) {
		this.userName.setValue(userName);
	}
	
	/**
	 * Indexed getter for userType attribute.
	 * @param indexes the indexes
	 * @return userType attribute
	 */
	public ElementaryRangeReference getItemFromUserTypeReference(Integer... indexes) {
		return userType.getIndexedReference(indexes);
	}
	
	/**
	 * Indexed getter for userType attribute.
	 * @param indexes the indexes
	 * @return userType attribute
	 */
	public String getItemFromUserType(Integer... indexes) {
		return userType.getIndexedValue(indexes);
	}
	
	/**
	 * Indexed setter for userType attribute.
	 * @param userType the new value of userType for given indexes
	 * @param indexes the indexes
	 */
	public void setItemFromUserType(String userType,Integer... indexes) {
		this.userType.setIndexedValue(userType,indexes);
	}
	
	/**
	 * Collection size getter for userType attribute.
	 * @return  the collection size for attributeuserType
	 */
	public int getUserTypeSize(){
		return userType.getRepetition().getCount();
	}
	
	/**
	 * Indexed getter for userType attribute.
	 * @param indexes the indexes
	 * @return userType attribute
	 */
	public ElementaryRangeReference getUserTypeReference() {
		return userType.getReference();
	}
	
	/**
	 * Indexed getter for userType attribute.
	 * @param indexes the indexes
	 * @return userType attribute
	 */
	public String getUserType() {
		return userType.getValue();
	}
	
	/**
	 * Indexed setter for userType attribute.
	 * @param userType the new value of userType for given indexes
	 * @param indexes the indexes
	 */
	public void setUserType(String userType) {
		this.userType.setValue(userType);
	}
	
}
