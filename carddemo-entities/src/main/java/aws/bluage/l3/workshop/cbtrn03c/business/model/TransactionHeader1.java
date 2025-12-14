package aws.bluage.l3.workshop.cbtrn03c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity TransactionHeader1.
 * @see RecordEntity
 */
public class TransactionHeader1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(root,new AlphanumericType(17),"Transaction ID");
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(root,new AlphanumericType(12),"Account ID");
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(root,new AlphanumericType(19),"Transaction Type");
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(root,new AlphanumericType(35),"Tran Category");
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(root,new AlphanumericType(14),"Tran Source");
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(root,new AlphanumericType(1)," ");
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(root,new AlphanumericType(16),"        Amount");
	

	/**
	 * Instantiate a new TransactionHeader1 with a default record.
	 * @param configuration the configuration
	 */
	public TransactionHeader1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new TransactionHeader1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public TransactionHeader1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

}
