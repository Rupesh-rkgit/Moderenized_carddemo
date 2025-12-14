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
 * Data simplifier file HtmlFile.
 * 
 * <p>About 'fdHtmlfileRec' field, <br>uml entity: aws.bluage.l3.workshop.cbstm03a.business.model.FdHtmlfileRec
 * <br></p>
 * 
 */
@Component("aws.bluage.l3.workshop.cbstm03a.business.model.HtmlFile")
@Lazy
@Scope("prototype")
public class HtmlFile extends RecordEntity {

	private final Group root = new Group(getData());
	private final Elementary fdHtmlfileRec = new Elementary(root,new AlphanumericType(100));
	 
	/**
	 * Instantiate a new HtmlFile.
	 * @param configuration the configuration
	 */
	public HtmlFile(@Qualifier("Cbstm03aContextConfiguration") Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
 
	/**
	 * Gets the reference for attribute fdHtmlfileRec.
	 * @return the fdHtmlfileRec attribute reference
	 */
	public ElementaryRangeReference getFdHtmlfileRecReference() {
		return fdHtmlfileRec.getReference();
	}

	/**
	 * Getter for fdHtmlfileRec attribute.
	 * @return fdHtmlfileRec attribute
	 */
	public String getFdHtmlfileRec() {
		return fdHtmlfileRec.getValue();
	}

	/**
	 * Setter for fdHtmlfileRec attribute.
	 * @param fdHtmlfileRec the new value of fdHtmlfileRec
	 */
	public void setFdHtmlfileRec(String fdHtmlfileRec) {
		this.fdHtmlfileRec.setValue(fdHtmlfileRec);
	}
}
