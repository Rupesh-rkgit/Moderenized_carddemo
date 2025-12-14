package aws.bluage.l3.workshop.cbstm03a.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Data simplifier file StmtFile.
 * 
 * <p>About 'fdStmtfileRec' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.FdStmtfileRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbstm03a.business.model.StmtFile")
@Lazy
@Scope("prototype")
public class StmtFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Elementary fdStmtfileRec = new Elementary(root,new AlphanumericType(80));
	 
	/**
	 * Instantiate a new StmtFile.
	 * @param configuration the configuration
	 */
	public StmtFile(@Qualifier("Cbstm03aContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
 
	/**
	 * Gets the reference for attribute fdStmtfileRec.
	 * @return the fdStmtfileRec attribute reference
	 */
	public ElementaryRangeReference getFdStmtfileRecReference() {
		return fdStmtfileRec.getReference();
	}

	/**
	 * Getter for fdStmtfileRec attribute.
	 * @return fdStmtfileRec attribute
	 */
	public String getFdStmtfileRec() {
		return fdStmtfileRec.getValue();
	}

	/**
	 * Setter for fdStmtfileRec attribute.
	 * @param fdStmtfileRec the new value of fdStmtfileRec
	 */
	public void setFdStmtfileRec(String fdStmtfileRec) {
		this.fdStmtfileRec.setValue(fdStmtfileRec);
	}
}
