package aws.bluage.l3.workshop.cobil00c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.Record;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
/**
 * Data simplifier entity Dfhbmsca.
<pre>
 * 
 * Legacy Documentation:<br>
 *   Part of source :<br>
 *   http://www.cedix.de/Literature/Textbooks/Cobol/CicsCobPrimer.pdf<br>
</pre>
 * 
 * <p>About 'dfhbmpem' field, <br>
 *   Printer end-of-message<br></p>
 * 
 * <p>About 'dfhbmpnl' field, <br>
 *   Printer new-line<br></p>
 * 
 * <p>About 'dfhbmpff' field, <br>
 *   Printer form feed<br></p>
 * 
 * <p>About 'dfhbmpcr' field, <br>
 *   Printer carriage return<br></p>
 * 
 * <p>About 'dfhbmask' field, <br>
 *   Autoskip<br></p>
 * 
 * <p>About 'dfhbmunp' field, <br>
 *   Unprotected<br></p>
 * 
 * <p>About 'dfhbmunn' field, <br>
 *   Unprotected and numeric<br></p>
 * 
 * <p>About 'dfhbmpro' field, <br>
 *   Protected<br></p>
 * 
 * <p>About 'dfhbmbry' field, <br>
 *   Bright<br></p>
 * 
 * <p>About 'dfhbmdar' field, <br>
 *   Dark<br></p>
 * 
 * <p>About 'dfhbmfse' field, <br>
 *   MDT set<br></p>
 * 
 * <p>About 'dfhbmprf' field, <br>
 *   Protected and MDT set<br></p>
 * 
 * <p>About 'dfhbmasf' field, <br>
 *   Autoskip and MDT set<br></p>
 * 
 * <p>About 'dfhbmasb' field, <br>
 *   Autoskip and bright<br></p>
 * 
 * <p>About 'dfhbmpso' field, <br>
 *   shift-out.<br></p>
 * 
 * <p>About 'dfhbmpsi' field, <br>
 *   shift-in.<br></p>
 * 
 * <p>About 'dfhbmeof' field, <br>
 *   Field erased<br></p>
 * 
 * <p>About 'dfhbmcur' field, <br>
 *   Field containing cursor flagged<br></p>
 * 
 * <p>About 'dfhbmec' field, <br>
 *   Erased field containing cursor (COBOL<br></p>
 * 
 * <p>About 'dfhbmflg' field, <br>
 *   Flags (COBOL only)<br></p>
 * 
 * <p>About 'dfhbmdet' field, <br>
 *   Field detected<br></p>
 * 
 * <p>About 'dfhsa' field, <br>
 *   Set attribute (SA) order<br></p>
 * 
 * <p>About 'dfherror' field, <br>
 *   Error code<br></p>
 * 
 * <p>About 'dfhcolor' field, <br>
 *   Color<br></p>
 * 
 * <p>About 'dfhps' field, <br>
 *   Programmed symbols<br></p>
 * 
 * <p>About 'dfhhlt' field, <br>
 *   Highlight<br></p>
 * 
 * <p>About 'dfh3270' field, <br>
 *   Base 3270 field attribute<br></p>
 * 
 * <p>About 'dfhval' field, <br>
 *   Validation<br></p>
 * 
 * <p>About 'dfhoutln' field, <br>
 *   Field outlining attribute code<br></p>
 * 
 * <p>About 'dfhbktrn' field, <br>
 *   Background transparency attribute code<br></p>
 * 
 * <p>About 'dfhall' field, <br>
 *   Reset all to defaults<br></p>
 * 
 * <p>About 'dfhdft' field, <br>
 *   Default<br></p>
 * 
 * <p>About 'dfhdfcol' field, <br>
 *   Default color<br></p>
 * 
 * <p>About 'dfhblue' field, <br>
 *   Blue<br></p>
 * 
 * <p>About 'dfhred' field, <br>
 *   Red<br></p>
 * 
 * <p>About 'dfhpink' field, <br>
 *   Pink<br></p>
 * 
 * <p>About 'dfhgreen' field, <br>
 *   Green<br></p>
 * 
 * <p>About 'dfhturq' field, <br>
 *   Turquoise<br></p>
 * 
 * <p>About 'dfhyello' field, <br>
 *   Yellow<br></p>
 * 
 * <p>About 'dfhneutr' field, <br>
 *   Neutral<br></p>
 * 
 * <p>About 'dfhbase' field, <br>
 *   Base programmed symbols<br></p>
 * 
 * <p>About 'dfhdfhi' field, <br>
 *   Normal<br></p>
 * 
 * <p>About 'dfhblink' field, <br>
 *   Blink<br></p>
 * 
 * <p>About 'dfhrevrs' field, <br>
 *   Reverse video<br></p>
 * 
 * <p>About 'dfhundln' field, <br>
 *   Underscore<br></p>
 * 
 * <p>About 'dfhmfil' field, <br>
 *   Mandatory fill<br></p>
 * 
 * <p>About 'dfhment' field, <br>
 *   Mandatory enter<br></p>
 * 
 * <p>About 'dfhmfe' field, <br>
 *   Mandatory fill and mandatory enter<br></p>
 * 
 * <p>About 'dfhmt' field, <br>
 *   Trigger<br></p>
 * 
 * <p>About 'dfhmft' field, <br>
 *   Mandatory fill and trigger<br></p>
 * 
 * <p>About 'dfhmet' field, <br>
 *   Mandatory enter and trigger<br></p>
 * 
 * <p>About 'dfhmfet' field, <br>
 *   Mandatory fill and mandatory enter and<br></p>
 * 
 * <p>About 'dfhunnod' field, <br>
 *   Unprotected, nondisplay, n<br></p>
 * 
 * <p>About 'dfhunimd' field, <br>
 *   Unprotected, intensify, li<br></p>
 * 
 * <p>About 'dfhunnum' field, <br>
 *   Unprotected, numeric, MDT<br></p>
 * 
 * <p>About 'dfhunnub' field, <br>
 *   Unprotected, numeric, inte<br></p>
 * 
 * <p>About 'dfhunint' field, <br>
 *   Unprotected, numeric, inte<br></p>
 * 
 * <p>About 'dfhunnon' field, <br>
 *   Unprotected, numeric, nond<br></p>
 * 
 * <p>About 'dfhproti' field, <br>
 *   Protected, intensify, ligh<br></p>
 * 
 * <p>About 'dfhprotn' field, <br>
 *   Protected, nondisplay, non<br></p>
 * 
 * <p>About 'dfhdffr' field, <br>
 *   Default outline<br></p>
 * 
 * <p>About 'dfhunder' field, <br>
 *   Underline<br></p>
 * 
 * <p>About 'dfhright' field, <br>
 *   Right vertical line<br></p>
 * 
 * <p>About 'dfhover' field, <br>
 *   Overline<br></p>
 * 
 * <p>About 'dfhleft' field, <br>
 *   Left vertical line<br></p>
 * 
 * <p>About 'dfhbox' field, <br>
 *   Underline and right vertical and overl<br></p>
 * 
 * <p>About 'dfhsosi' field, <br>
 *   SOSI=yes<br></p>
 * 
 * <p>About 'dfhtrans' field, <br>
 *   Background transparency<br></p>
 * 
 * <p>About 'dfhopaq' field, <br>
 *   No background transparency<br></p>
 * 
 * @see RecordEntity
 */
public class Dfhbmsca extends RecordEntity {

	private final Group root = new Group(getData()); 
	
	/**
	 * Printer end-of-message
	 */
	private final Elementary dfhbmpem = new Elementary(root,new AlphanumericType(1),hexBytes("40"));
	
	/**
	 * Printer new-line
	 */
	private final Elementary dfhbmpnl = new Elementary(root,new AlphanumericType(1),hexBytes("40"));
	
	/**
	 * Printer form feed
	 */
	private final Elementary dfhbmpff = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Printer carriage return
	 */
	private final Elementary dfhbmpcr = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Autoskip
	 */
	private final Elementary dfhbmask = new Elementary(root,new AlphanumericType(1),hexBytes("F0"));
	
	/**
	 * Unprotected
	 */
	private final Elementary dfhbmunp = new Elementary(root,new AlphanumericType(1),hexBytes("40"));
	
	/**
	 * Unprotected and numeric
	 */
	private final Elementary dfhbmunn = new Elementary(root,new AlphanumericType(1),hexBytes("50"));
	
	/**
	 * Protected
	 */
	private final Elementary dfhbmpro = new Elementary(root,new AlphanumericType(1),hexBytes("60"));
	
	/**
	 * Bright
	 */
	private final Elementary dfhbmbry = new Elementary(root,new AlphanumericType(1),hexBytes("C9"));
	
	/**
	 * Dark
	 */
	private final Elementary dfhbmdar = new Elementary(root,new AlphanumericType(1),hexBytes("4C"));
	
	/**
	 * MDT set
	 */
	private final Elementary dfhbmfse = new Elementary(root,new AlphanumericType(1),hexBytes("C1"));
	
	/**
	 * Protected and MDT set
	 */
	private final Elementary dfhbmprf = new Elementary(root,new AlphanumericType(1),hexBytes("61"));
	
	/**
	 * Autoskip and MDT set
	 */
	private final Elementary dfhbmasf = new Elementary(root,new AlphanumericType(1),hexBytes("F1"));
	
	/**
	 * Autoskip and bright
	 */
	private final Elementary dfhbmasb = new Elementary(root,new AlphanumericType(1),hexBytes("F8"));
	
	/**
	 * shift-out.
	 */
	private final Elementary dfhbmpso = new Elementary(root,new AlphanumericType(1),hexBytes("0E"));
	
	/**
	 * shift-in.
	 */
	private final Elementary dfhbmpsi = new Elementary(root,new AlphanumericType(1),hexBytes("0F"));
	
	/**
	 * Field erased
	 */
	private final Elementary dfhbmeof = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Field containing cursor flagged
	 */
	private final Elementary dfhbmcur = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Erased field containing cursor (COBOL
	 */
	private final Elementary dfhbmec = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Flags (COBOL only)
	 */
	private final Elementary dfhbmflg = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Field detected
	 */
	private final Elementary dfhbmdet = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Set attribute (SA) order
	 */
	private final Elementary dfhsa = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Error code
	 */
	private final Elementary dfherror = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Color
	 */
	private final Elementary dfhcolor = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Programmed symbols
	 */
	private final Elementary dfhps = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Highlight
	 */
	private final Elementary dfhhlt = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Base 3270 field attribute
	 */
	private final Elementary dfh3270 = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Validation
	 */
	private final Elementary dfhval = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Field outlining attribute code
	 */
	private final Elementary dfhoutln = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Background transparency attribute code
	 */
	private final Elementary dfhbktrn = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Reset all to defaults
	 */
	private final Elementary dfhall = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Default
	 */
	private final Elementary dfhdft = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Default color
	 */
	private final Elementary dfhdfcol = new Elementary(root,new AlphanumericType(1),Record.LOW_VALUES);
	
	/**
	 * Blue
	 */
	private final Elementary dfhblue = new Elementary(root,new AlphanumericType(1),hexBytes("F1"));
	
	/**
	 * Red
	 */
	private final Elementary dfhred = new Elementary(root,new AlphanumericType(1),hexBytes("F2"));
	
	/**
	 * Pink
	 */
	private final Elementary dfhpink = new Elementary(root,new AlphanumericType(1),hexBytes("F3"));
	
	/**
	 * Green
	 */
	private final Elementary dfhgreen = new Elementary(root,new AlphanumericType(1),hexBytes("F4"));
	
	/**
	 * Turquoise
	 */
	private final Elementary dfhturq = new Elementary(root,new AlphanumericType(1),hexBytes("F5"));
	
	/**
	 * Yellow
	 */
	private final Elementary dfhyello = new Elementary(root,new AlphanumericType(1),hexBytes("F6"));
	
	/**
	 * Neutral
	 */
	private final Elementary dfhneutr = new Elementary(root,new AlphanumericType(1),hexBytes("F7"));
	
	/**
	 * Base programmed symbols
	 */
	private final Elementary dfhbase = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Normal
	 */
	private final Elementary dfhdfhi = new Elementary(root,new AlphanumericType(1),Record.LOW_VALUES);
	
	/**
	 * Blink
	 */
	private final Elementary dfhblink = new Elementary(root,new AlphanumericType(1),hexBytes("F1"));
	
	/**
	 * Reverse video
	 */
	private final Elementary dfhrevrs = new Elementary(root,new AlphanumericType(1),hexBytes("F2"));
	
	/**
	 * Underscore
	 */
	private final Elementary dfhundln = new Elementary(root,new AlphanumericType(1),hexBytes("F3"));
	
	/**
	 * Mandatory fill
	 */
	private final Elementary dfhmfil = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Mandatory enter
	 */
	private final Elementary dfhment = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Mandatory fill and mandatory enter
	 */
	private final Elementary dfhmfe = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Trigger
	 */
	private final Elementary dfhmt = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Mandatory fill and trigger
	 */
	private final Elementary dfhmft = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Mandatory enter and trigger
	 */
	private final Elementary dfhmet = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Mandatory fill and mandatory enter and
	 */
	private final Elementary dfhmfet = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Unprotected, nondisplay, n
	 */
	private final Elementary dfhunnod = new Elementary(root,new AlphanumericType(1),hexBytes("4D"));
	
	/**
	 * Unprotected, intensify, li
	 */
	private final Elementary dfhunimd = new Elementary(root,new AlphanumericType(1),hexBytes("C9"));
	
	/**
	 * Unprotected, numeric, MDT
	 */
	private final Elementary dfhunnum = new Elementary(root,new AlphanumericType(1),hexBytes("D1"));
	
	/**
	 * Unprotected, numeric, inte
	 */
	private final Elementary dfhunnub = new Elementary(root,new AlphanumericType(1),hexBytes("D8"));
	
	/**
	 * Unprotected, numeric, inte
	 */
	private final Elementary dfhunint = new Elementary(root,new AlphanumericType(1),hexBytes("D9"));
	
	/**
	 * Unprotected, numeric, nond
	 */
	private final Elementary dfhunnon = new Elementary(root,new AlphanumericType(1),hexBytes("5D"));
	
	/**
	 * Protected, intensify, ligh
	 */
	private final Elementary dfhproti = new Elementary(root,new AlphanumericType(1),hexBytes("E8"));
	
	/**
	 * Protected, nondisplay, non
	 */
	private final Elementary dfhprotn = new Elementary(root,new AlphanumericType(1),hexBytes("6C"));
	
	/**
	 * Default outline
	 */
	private final Elementary dfhdffr = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Underline
	 */
	private final Elementary dfhunder = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Right vertical line
	 */
	private final Elementary dfhright = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Overline
	 */
	private final Elementary dfhover = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Left vertical line
	 */
	private final Elementary dfhleft = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Underline and right vertical and overl
	 */
	private final Elementary dfhbox = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * SOSI=yes
	 */
	private final Elementary dfhsosi = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * Background transparency
	 */
	private final Elementary dfhtrans = new Elementary(root,new AlphanumericType(1));
	
	/**
	 * No background transparency
	 */
	private final Elementary dfhopaq = new Elementary(root,new AlphanumericType(1));
	

	/**
	 * Instantiate a new Dfhbmsca with a default record.
	 * @param configuration the configuration
	 */
	public Dfhbmsca(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Dfhbmsca bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Dfhbmsca(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	/**
	 * Gets the reference for attribute dfhbmpem.
	 * @return the dfhbmpem attribute reference
	 */
	public ElementaryRangeReference getDfhbmpemReference() {
		return dfhbmpem.getReference();
	}

	/**
	 * Getter for dfhbmpem attribute.
	 * @return dfhbmpem attribute
	 */
	public String getDfhbmpem() {
		return dfhbmpem.getValue();
	}

	/**
	 * Setter for dfhbmpem attribute.
	 * @param dfhbmpem the new value of dfhbmpem
	 */
	public void setDfhbmpem(String dfhbmpem) {
		this.dfhbmpem.setValue(dfhbmpem);
	}
	/**
	 * Gets the reference for attribute dfhbmpnl.
	 * @return the dfhbmpnl attribute reference
	 */
	public ElementaryRangeReference getDfhbmpnlReference() {
		return dfhbmpnl.getReference();
	}

	/**
	 * Getter for dfhbmpnl attribute.
	 * @return dfhbmpnl attribute
	 */
	public String getDfhbmpnl() {
		return dfhbmpnl.getValue();
	}

	/**
	 * Setter for dfhbmpnl attribute.
	 * @param dfhbmpnl the new value of dfhbmpnl
	 */
	public void setDfhbmpnl(String dfhbmpnl) {
		this.dfhbmpnl.setValue(dfhbmpnl);
	}
	/**
	 * Gets the reference for attribute dfhbmpff.
	 * @return the dfhbmpff attribute reference
	 */
	public ElementaryRangeReference getDfhbmpffReference() {
		return dfhbmpff.getReference();
	}

	/**
	 * Getter for dfhbmpff attribute.
	 * @return dfhbmpff attribute
	 */
	public String getDfhbmpff() {
		return dfhbmpff.getValue();
	}

	/**
	 * Setter for dfhbmpff attribute.
	 * @param dfhbmpff the new value of dfhbmpff
	 */
	public void setDfhbmpff(String dfhbmpff) {
		this.dfhbmpff.setValue(dfhbmpff);
	}
	/**
	 * Gets the reference for attribute dfhbmpcr.
	 * @return the dfhbmpcr attribute reference
	 */
	public ElementaryRangeReference getDfhbmpcrReference() {
		return dfhbmpcr.getReference();
	}

	/**
	 * Getter for dfhbmpcr attribute.
	 * @return dfhbmpcr attribute
	 */
	public String getDfhbmpcr() {
		return dfhbmpcr.getValue();
	}

	/**
	 * Setter for dfhbmpcr attribute.
	 * @param dfhbmpcr the new value of dfhbmpcr
	 */
	public void setDfhbmpcr(String dfhbmpcr) {
		this.dfhbmpcr.setValue(dfhbmpcr);
	}
	/**
	 * Gets the reference for attribute dfhbmask.
	 * @return the dfhbmask attribute reference
	 */
	public ElementaryRangeReference getDfhbmaskReference() {
		return dfhbmask.getReference();
	}

	/**
	 * Getter for dfhbmask attribute.
	 * @return dfhbmask attribute
	 */
	public String getDfhbmask() {
		return dfhbmask.getValue();
	}

	/**
	 * Setter for dfhbmask attribute.
	 * @param dfhbmask the new value of dfhbmask
	 */
	public void setDfhbmask(String dfhbmask) {
		this.dfhbmask.setValue(dfhbmask);
	}
	/**
	 * Gets the reference for attribute dfhbmunp.
	 * @return the dfhbmunp attribute reference
	 */
	public ElementaryRangeReference getDfhbmunpReference() {
		return dfhbmunp.getReference();
	}

	/**
	 * Getter for dfhbmunp attribute.
	 * @return dfhbmunp attribute
	 */
	public String getDfhbmunp() {
		return dfhbmunp.getValue();
	}

	/**
	 * Setter for dfhbmunp attribute.
	 * @param dfhbmunp the new value of dfhbmunp
	 */
	public void setDfhbmunp(String dfhbmunp) {
		this.dfhbmunp.setValue(dfhbmunp);
	}
	/**
	 * Gets the reference for attribute dfhbmunn.
	 * @return the dfhbmunn attribute reference
	 */
	public ElementaryRangeReference getDfhbmunnReference() {
		return dfhbmunn.getReference();
	}

	/**
	 * Getter for dfhbmunn attribute.
	 * @return dfhbmunn attribute
	 */
	public String getDfhbmunn() {
		return dfhbmunn.getValue();
	}

	/**
	 * Setter for dfhbmunn attribute.
	 * @param dfhbmunn the new value of dfhbmunn
	 */
	public void setDfhbmunn(String dfhbmunn) {
		this.dfhbmunn.setValue(dfhbmunn);
	}
	/**
	 * Gets the reference for attribute dfhbmpro.
	 * @return the dfhbmpro attribute reference
	 */
	public ElementaryRangeReference getDfhbmproReference() {
		return dfhbmpro.getReference();
	}

	/**
	 * Getter for dfhbmpro attribute.
	 * @return dfhbmpro attribute
	 */
	public String getDfhbmpro() {
		return dfhbmpro.getValue();
	}

	/**
	 * Setter for dfhbmpro attribute.
	 * @param dfhbmpro the new value of dfhbmpro
	 */
	public void setDfhbmpro(String dfhbmpro) {
		this.dfhbmpro.setValue(dfhbmpro);
	}
	/**
	 * Gets the reference for attribute dfhbmbry.
	 * @return the dfhbmbry attribute reference
	 */
	public ElementaryRangeReference getDfhbmbryReference() {
		return dfhbmbry.getReference();
	}

	/**
	 * Getter for dfhbmbry attribute.
	 * @return dfhbmbry attribute
	 */
	public String getDfhbmbry() {
		return dfhbmbry.getValue();
	}

	/**
	 * Setter for dfhbmbry attribute.
	 * @param dfhbmbry the new value of dfhbmbry
	 */
	public void setDfhbmbry(String dfhbmbry) {
		this.dfhbmbry.setValue(dfhbmbry);
	}
	/**
	 * Gets the reference for attribute dfhbmdar.
	 * @return the dfhbmdar attribute reference
	 */
	public ElementaryRangeReference getDfhbmdarReference() {
		return dfhbmdar.getReference();
	}

	/**
	 * Getter for dfhbmdar attribute.
	 * @return dfhbmdar attribute
	 */
	public String getDfhbmdar() {
		return dfhbmdar.getValue();
	}

	/**
	 * Setter for dfhbmdar attribute.
	 * @param dfhbmdar the new value of dfhbmdar
	 */
	public void setDfhbmdar(String dfhbmdar) {
		this.dfhbmdar.setValue(dfhbmdar);
	}
	/**
	 * Gets the reference for attribute dfhbmfse.
	 * @return the dfhbmfse attribute reference
	 */
	public ElementaryRangeReference getDfhbmfseReference() {
		return dfhbmfse.getReference();
	}

	/**
	 * Getter for dfhbmfse attribute.
	 * @return dfhbmfse attribute
	 */
	public String getDfhbmfse() {
		return dfhbmfse.getValue();
	}

	/**
	 * Setter for dfhbmfse attribute.
	 * @param dfhbmfse the new value of dfhbmfse
	 */
	public void setDfhbmfse(String dfhbmfse) {
		this.dfhbmfse.setValue(dfhbmfse);
	}
	/**
	 * Gets the reference for attribute dfhbmprf.
	 * @return the dfhbmprf attribute reference
	 */
	public ElementaryRangeReference getDfhbmprfReference() {
		return dfhbmprf.getReference();
	}

	/**
	 * Getter for dfhbmprf attribute.
	 * @return dfhbmprf attribute
	 */
	public String getDfhbmprf() {
		return dfhbmprf.getValue();
	}

	/**
	 * Setter for dfhbmprf attribute.
	 * @param dfhbmprf the new value of dfhbmprf
	 */
	public void setDfhbmprf(String dfhbmprf) {
		this.dfhbmprf.setValue(dfhbmprf);
	}
	/**
	 * Gets the reference for attribute dfhbmasf.
	 * @return the dfhbmasf attribute reference
	 */
	public ElementaryRangeReference getDfhbmasfReference() {
		return dfhbmasf.getReference();
	}

	/**
	 * Getter for dfhbmasf attribute.
	 * @return dfhbmasf attribute
	 */
	public String getDfhbmasf() {
		return dfhbmasf.getValue();
	}

	/**
	 * Setter for dfhbmasf attribute.
	 * @param dfhbmasf the new value of dfhbmasf
	 */
	public void setDfhbmasf(String dfhbmasf) {
		this.dfhbmasf.setValue(dfhbmasf);
	}
	/**
	 * Gets the reference for attribute dfhbmasb.
	 * @return the dfhbmasb attribute reference
	 */
	public ElementaryRangeReference getDfhbmasbReference() {
		return dfhbmasb.getReference();
	}

	/**
	 * Getter for dfhbmasb attribute.
	 * @return dfhbmasb attribute
	 */
	public String getDfhbmasb() {
		return dfhbmasb.getValue();
	}

	/**
	 * Setter for dfhbmasb attribute.
	 * @param dfhbmasb the new value of dfhbmasb
	 */
	public void setDfhbmasb(String dfhbmasb) {
		this.dfhbmasb.setValue(dfhbmasb);
	}
	/**
	 * Gets the reference for attribute dfhbmpso.
	 * @return the dfhbmpso attribute reference
	 */
	public ElementaryRangeReference getDfhbmpsoReference() {
		return dfhbmpso.getReference();
	}

	/**
	 * Getter for dfhbmpso attribute.
	 * @return dfhbmpso attribute
	 */
	public String getDfhbmpso() {
		return dfhbmpso.getValue();
	}

	/**
	 * Setter for dfhbmpso attribute.
	 * @param dfhbmpso the new value of dfhbmpso
	 */
	public void setDfhbmpso(String dfhbmpso) {
		this.dfhbmpso.setValue(dfhbmpso);
	}
	/**
	 * Gets the reference for attribute dfhbmpsi.
	 * @return the dfhbmpsi attribute reference
	 */
	public ElementaryRangeReference getDfhbmpsiReference() {
		return dfhbmpsi.getReference();
	}

	/**
	 * Getter for dfhbmpsi attribute.
	 * @return dfhbmpsi attribute
	 */
	public String getDfhbmpsi() {
		return dfhbmpsi.getValue();
	}

	/**
	 * Setter for dfhbmpsi attribute.
	 * @param dfhbmpsi the new value of dfhbmpsi
	 */
	public void setDfhbmpsi(String dfhbmpsi) {
		this.dfhbmpsi.setValue(dfhbmpsi);
	}
	/**
	 * Gets the reference for attribute dfhbmeof.
	 * @return the dfhbmeof attribute reference
	 */
	public ElementaryRangeReference getDfhbmeofReference() {
		return dfhbmeof.getReference();
	}

	/**
	 * Getter for dfhbmeof attribute.
	 * @return dfhbmeof attribute
	 */
	public String getDfhbmeof() {
		return dfhbmeof.getValue();
	}

	/**
	 * Setter for dfhbmeof attribute.
	 * @param dfhbmeof the new value of dfhbmeof
	 */
	public void setDfhbmeof(String dfhbmeof) {
		this.dfhbmeof.setValue(dfhbmeof);
	}
	/**
	 * Gets the reference for attribute dfhbmcur.
	 * @return the dfhbmcur attribute reference
	 */
	public ElementaryRangeReference getDfhbmcurReference() {
		return dfhbmcur.getReference();
	}

	/**
	 * Getter for dfhbmcur attribute.
	 * @return dfhbmcur attribute
	 */
	public String getDfhbmcur() {
		return dfhbmcur.getValue();
	}

	/**
	 * Setter for dfhbmcur attribute.
	 * @param dfhbmcur the new value of dfhbmcur
	 */
	public void setDfhbmcur(String dfhbmcur) {
		this.dfhbmcur.setValue(dfhbmcur);
	}
	/**
	 * Gets the reference for attribute dfhbmec.
	 * @return the dfhbmec attribute reference
	 */
	public ElementaryRangeReference getDfhbmecReference() {
		return dfhbmec.getReference();
	}

	/**
	 * Getter for dfhbmec attribute.
	 * @return dfhbmec attribute
	 */
	public String getDfhbmec() {
		return dfhbmec.getValue();
	}

	/**
	 * Setter for dfhbmec attribute.
	 * @param dfhbmec the new value of dfhbmec
	 */
	public void setDfhbmec(String dfhbmec) {
		this.dfhbmec.setValue(dfhbmec);
	}
	/**
	 * Gets the reference for attribute dfhbmflg.
	 * @return the dfhbmflg attribute reference
	 */
	public ElementaryRangeReference getDfhbmflgReference() {
		return dfhbmflg.getReference();
	}

	/**
	 * Getter for dfhbmflg attribute.
	 * @return dfhbmflg attribute
	 */
	public String getDfhbmflg() {
		return dfhbmflg.getValue();
	}

	/**
	 * Setter for dfhbmflg attribute.
	 * @param dfhbmflg the new value of dfhbmflg
	 */
	public void setDfhbmflg(String dfhbmflg) {
		this.dfhbmflg.setValue(dfhbmflg);
	}
	/**
	 * Gets the reference for attribute dfhbmdet.
	 * @return the dfhbmdet attribute reference
	 */
	public ElementaryRangeReference getDfhbmdetReference() {
		return dfhbmdet.getReference();
	}

	/**
	 * Getter for dfhbmdet attribute.
	 * @return dfhbmdet attribute
	 */
	public String getDfhbmdet() {
		return dfhbmdet.getValue();
	}

	/**
	 * Setter for dfhbmdet attribute.
	 * @param dfhbmdet the new value of dfhbmdet
	 */
	public void setDfhbmdet(String dfhbmdet) {
		this.dfhbmdet.setValue(dfhbmdet);
	}
	/**
	 * Gets the reference for attribute dfhsa.
	 * @return the dfhsa attribute reference
	 */
	public ElementaryRangeReference getDfhsaReference() {
		return dfhsa.getReference();
	}

	/**
	 * Getter for dfhsa attribute.
	 * @return dfhsa attribute
	 */
	public String getDfhsa() {
		return dfhsa.getValue();
	}

	/**
	 * Setter for dfhsa attribute.
	 * @param dfhsa the new value of dfhsa
	 */
	public void setDfhsa(String dfhsa) {
		this.dfhsa.setValue(dfhsa);
	}
	/**
	 * Gets the reference for attribute dfherror.
	 * @return the dfherror attribute reference
	 */
	public ElementaryRangeReference getDfherrorReference() {
		return dfherror.getReference();
	}

	/**
	 * Getter for dfherror attribute.
	 * @return dfherror attribute
	 */
	public String getDfherror() {
		return dfherror.getValue();
	}

	/**
	 * Setter for dfherror attribute.
	 * @param dfherror the new value of dfherror
	 */
	public void setDfherror(String dfherror) {
		this.dfherror.setValue(dfherror);
	}
	/**
	 * Gets the reference for attribute dfhcolor.
	 * @return the dfhcolor attribute reference
	 */
	public ElementaryRangeReference getDfhcolorReference() {
		return dfhcolor.getReference();
	}

	/**
	 * Getter for dfhcolor attribute.
	 * @return dfhcolor attribute
	 */
	public String getDfhcolor() {
		return dfhcolor.getValue();
	}

	/**
	 * Setter for dfhcolor attribute.
	 * @param dfhcolor the new value of dfhcolor
	 */
	public void setDfhcolor(String dfhcolor) {
		this.dfhcolor.setValue(dfhcolor);
	}
	/**
	 * Gets the reference for attribute dfhps.
	 * @return the dfhps attribute reference
	 */
	public ElementaryRangeReference getDfhpsReference() {
		return dfhps.getReference();
	}

	/**
	 * Getter for dfhps attribute.
	 * @return dfhps attribute
	 */
	public String getDfhps() {
		return dfhps.getValue();
	}

	/**
	 * Setter for dfhps attribute.
	 * @param dfhps the new value of dfhps
	 */
	public void setDfhps(String dfhps) {
		this.dfhps.setValue(dfhps);
	}
	/**
	 * Gets the reference for attribute dfhhlt.
	 * @return the dfhhlt attribute reference
	 */
	public ElementaryRangeReference getDfhhltReference() {
		return dfhhlt.getReference();
	}

	/**
	 * Getter for dfhhlt attribute.
	 * @return dfhhlt attribute
	 */
	public String getDfhhlt() {
		return dfhhlt.getValue();
	}

	/**
	 * Setter for dfhhlt attribute.
	 * @param dfhhlt the new value of dfhhlt
	 */
	public void setDfhhlt(String dfhhlt) {
		this.dfhhlt.setValue(dfhhlt);
	}
	/**
	 * Gets the reference for attribute dfh3270.
	 * @return the dfh3270 attribute reference
	 */
	public ElementaryRangeReference getDfh3270Reference() {
		return dfh3270.getReference();
	}

	/**
	 * Getter for dfh3270 attribute.
	 * @return dfh3270 attribute
	 */
	public String getDfh3270() {
		return dfh3270.getValue();
	}

	/**
	 * Setter for dfh3270 attribute.
	 * @param dfh3270 the new value of dfh3270
	 */
	public void setDfh3270(String dfh3270) {
		this.dfh3270.setValue(dfh3270);
	}
	/**
	 * Gets the reference for attribute dfhval.
	 * @return the dfhval attribute reference
	 */
	public ElementaryRangeReference getDfhvalReference() {
		return dfhval.getReference();
	}

	/**
	 * Getter for dfhval attribute.
	 * @return dfhval attribute
	 */
	public String getDfhval() {
		return dfhval.getValue();
	}

	/**
	 * Setter for dfhval attribute.
	 * @param dfhval the new value of dfhval
	 */
	public void setDfhval(String dfhval) {
		this.dfhval.setValue(dfhval);
	}
	/**
	 * Gets the reference for attribute dfhoutln.
	 * @return the dfhoutln attribute reference
	 */
	public ElementaryRangeReference getDfhoutlnReference() {
		return dfhoutln.getReference();
	}

	/**
	 * Getter for dfhoutln attribute.
	 * @return dfhoutln attribute
	 */
	public String getDfhoutln() {
		return dfhoutln.getValue();
	}

	/**
	 * Setter for dfhoutln attribute.
	 * @param dfhoutln the new value of dfhoutln
	 */
	public void setDfhoutln(String dfhoutln) {
		this.dfhoutln.setValue(dfhoutln);
	}
	/**
	 * Gets the reference for attribute dfhbktrn.
	 * @return the dfhbktrn attribute reference
	 */
	public ElementaryRangeReference getDfhbktrnReference() {
		return dfhbktrn.getReference();
	}

	/**
	 * Getter for dfhbktrn attribute.
	 * @return dfhbktrn attribute
	 */
	public String getDfhbktrn() {
		return dfhbktrn.getValue();
	}

	/**
	 * Setter for dfhbktrn attribute.
	 * @param dfhbktrn the new value of dfhbktrn
	 */
	public void setDfhbktrn(String dfhbktrn) {
		this.dfhbktrn.setValue(dfhbktrn);
	}
	/**
	 * Gets the reference for attribute dfhall.
	 * @return the dfhall attribute reference
	 */
	public ElementaryRangeReference getDfhallReference() {
		return dfhall.getReference();
	}

	/**
	 * Getter for dfhall attribute.
	 * @return dfhall attribute
	 */
	public String getDfhall() {
		return dfhall.getValue();
	}

	/**
	 * Setter for dfhall attribute.
	 * @param dfhall the new value of dfhall
	 */
	public void setDfhall(String dfhall) {
		this.dfhall.setValue(dfhall);
	}
	/**
	 * Gets the reference for attribute dfhdft.
	 * @return the dfhdft attribute reference
	 */
	public ElementaryRangeReference getDfhdftReference() {
		return dfhdft.getReference();
	}

	/**
	 * Getter for dfhdft attribute.
	 * @return dfhdft attribute
	 */
	public String getDfhdft() {
		return dfhdft.getValue();
	}

	/**
	 * Setter for dfhdft attribute.
	 * @param dfhdft the new value of dfhdft
	 */
	public void setDfhdft(String dfhdft) {
		this.dfhdft.setValue(dfhdft);
	}
	/**
	 * Gets the reference for attribute dfhdfcol.
	 * @return the dfhdfcol attribute reference
	 */
	public ElementaryRangeReference getDfhdfcolReference() {
		return dfhdfcol.getReference();
	}

	/**
	 * Getter for dfhdfcol attribute.
	 * @return dfhdfcol attribute
	 */
	public String getDfhdfcol() {
		return dfhdfcol.getValue();
	}

	/**
	 * Setter for dfhdfcol attribute.
	 * @param dfhdfcol the new value of dfhdfcol
	 */
	public void setDfhdfcol(String dfhdfcol) {
		this.dfhdfcol.setValue(dfhdfcol);
	}
	/**
	 * Gets the reference for attribute dfhblue.
	 * @return the dfhblue attribute reference
	 */
	public ElementaryRangeReference getDfhblueReference() {
		return dfhblue.getReference();
	}

	/**
	 * Getter for dfhblue attribute.
	 * @return dfhblue attribute
	 */
	public String getDfhblue() {
		return dfhblue.getValue();
	}

	/**
	 * Setter for dfhblue attribute.
	 * @param dfhblue the new value of dfhblue
	 */
	public void setDfhblue(String dfhblue) {
		this.dfhblue.setValue(dfhblue);
	}
	/**
	 * Gets the reference for attribute dfhred.
	 * @return the dfhred attribute reference
	 */
	public ElementaryRangeReference getDfhredReference() {
		return dfhred.getReference();
	}

	/**
	 * Getter for dfhred attribute.
	 * @return dfhred attribute
	 */
	public String getDfhred() {
		return dfhred.getValue();
	}

	/**
	 * Setter for dfhred attribute.
	 * @param dfhred the new value of dfhred
	 */
	public void setDfhred(String dfhred) {
		this.dfhred.setValue(dfhred);
	}
	/**
	 * Gets the reference for attribute dfhpink.
	 * @return the dfhpink attribute reference
	 */
	public ElementaryRangeReference getDfhpinkReference() {
		return dfhpink.getReference();
	}

	/**
	 * Getter for dfhpink attribute.
	 * @return dfhpink attribute
	 */
	public String getDfhpink() {
		return dfhpink.getValue();
	}

	/**
	 * Setter for dfhpink attribute.
	 * @param dfhpink the new value of dfhpink
	 */
	public void setDfhpink(String dfhpink) {
		this.dfhpink.setValue(dfhpink);
	}
	/**
	 * Gets the reference for attribute dfhgreen.
	 * @return the dfhgreen attribute reference
	 */
	public ElementaryRangeReference getDfhgreenReference() {
		return dfhgreen.getReference();
	}

	/**
	 * Getter for dfhgreen attribute.
	 * @return dfhgreen attribute
	 */
	public String getDfhgreen() {
		return dfhgreen.getValue();
	}

	/**
	 * Setter for dfhgreen attribute.
	 * @param dfhgreen the new value of dfhgreen
	 */
	public void setDfhgreen(String dfhgreen) {
		this.dfhgreen.setValue(dfhgreen);
	}
	/**
	 * Gets the reference for attribute dfhturq.
	 * @return the dfhturq attribute reference
	 */
	public ElementaryRangeReference getDfhturqReference() {
		return dfhturq.getReference();
	}

	/**
	 * Getter for dfhturq attribute.
	 * @return dfhturq attribute
	 */
	public String getDfhturq() {
		return dfhturq.getValue();
	}

	/**
	 * Setter for dfhturq attribute.
	 * @param dfhturq the new value of dfhturq
	 */
	public void setDfhturq(String dfhturq) {
		this.dfhturq.setValue(dfhturq);
	}
	/**
	 * Gets the reference for attribute dfhyello.
	 * @return the dfhyello attribute reference
	 */
	public ElementaryRangeReference getDfhyelloReference() {
		return dfhyello.getReference();
	}

	/**
	 * Getter for dfhyello attribute.
	 * @return dfhyello attribute
	 */
	public String getDfhyello() {
		return dfhyello.getValue();
	}

	/**
	 * Setter for dfhyello attribute.
	 * @param dfhyello the new value of dfhyello
	 */
	public void setDfhyello(String dfhyello) {
		this.dfhyello.setValue(dfhyello);
	}
	/**
	 * Gets the reference for attribute dfhneutr.
	 * @return the dfhneutr attribute reference
	 */
	public ElementaryRangeReference getDfhneutrReference() {
		return dfhneutr.getReference();
	}

	/**
	 * Getter for dfhneutr attribute.
	 * @return dfhneutr attribute
	 */
	public String getDfhneutr() {
		return dfhneutr.getValue();
	}

	/**
	 * Setter for dfhneutr attribute.
	 * @param dfhneutr the new value of dfhneutr
	 */
	public void setDfhneutr(String dfhneutr) {
		this.dfhneutr.setValue(dfhneutr);
	}
	/**
	 * Gets the reference for attribute dfhbase.
	 * @return the dfhbase attribute reference
	 */
	public ElementaryRangeReference getDfhbaseReference() {
		return dfhbase.getReference();
	}

	/**
	 * Getter for dfhbase attribute.
	 * @return dfhbase attribute
	 */
	public String getDfhbase() {
		return dfhbase.getValue();
	}

	/**
	 * Setter for dfhbase attribute.
	 * @param dfhbase the new value of dfhbase
	 */
	public void setDfhbase(String dfhbase) {
		this.dfhbase.setValue(dfhbase);
	}
	/**
	 * Gets the reference for attribute dfhdfhi.
	 * @return the dfhdfhi attribute reference
	 */
	public ElementaryRangeReference getDfhdfhiReference() {
		return dfhdfhi.getReference();
	}

	/**
	 * Getter for dfhdfhi attribute.
	 * @return dfhdfhi attribute
	 */
	public String getDfhdfhi() {
		return dfhdfhi.getValue();
	}

	/**
	 * Setter for dfhdfhi attribute.
	 * @param dfhdfhi the new value of dfhdfhi
	 */
	public void setDfhdfhi(String dfhdfhi) {
		this.dfhdfhi.setValue(dfhdfhi);
	}
	/**
	 * Gets the reference for attribute dfhblink.
	 * @return the dfhblink attribute reference
	 */
	public ElementaryRangeReference getDfhblinkReference() {
		return dfhblink.getReference();
	}

	/**
	 * Getter for dfhblink attribute.
	 * @return dfhblink attribute
	 */
	public String getDfhblink() {
		return dfhblink.getValue();
	}

	/**
	 * Setter for dfhblink attribute.
	 * @param dfhblink the new value of dfhblink
	 */
	public void setDfhblink(String dfhblink) {
		this.dfhblink.setValue(dfhblink);
	}
	/**
	 * Gets the reference for attribute dfhrevrs.
	 * @return the dfhrevrs attribute reference
	 */
	public ElementaryRangeReference getDfhrevrsReference() {
		return dfhrevrs.getReference();
	}

	/**
	 * Getter for dfhrevrs attribute.
	 * @return dfhrevrs attribute
	 */
	public String getDfhrevrs() {
		return dfhrevrs.getValue();
	}

	/**
	 * Setter for dfhrevrs attribute.
	 * @param dfhrevrs the new value of dfhrevrs
	 */
	public void setDfhrevrs(String dfhrevrs) {
		this.dfhrevrs.setValue(dfhrevrs);
	}
	/**
	 * Gets the reference for attribute dfhundln.
	 * @return the dfhundln attribute reference
	 */
	public ElementaryRangeReference getDfhundlnReference() {
		return dfhundln.getReference();
	}

	/**
	 * Getter for dfhundln attribute.
	 * @return dfhundln attribute
	 */
	public String getDfhundln() {
		return dfhundln.getValue();
	}

	/**
	 * Setter for dfhundln attribute.
	 * @param dfhundln the new value of dfhundln
	 */
	public void setDfhundln(String dfhundln) {
		this.dfhundln.setValue(dfhundln);
	}
	/**
	 * Gets the reference for attribute dfhmfil.
	 * @return the dfhmfil attribute reference
	 */
	public ElementaryRangeReference getDfhmfilReference() {
		return dfhmfil.getReference();
	}

	/**
	 * Getter for dfhmfil attribute.
	 * @return dfhmfil attribute
	 */
	public String getDfhmfil() {
		return dfhmfil.getValue();
	}

	/**
	 * Setter for dfhmfil attribute.
	 * @param dfhmfil the new value of dfhmfil
	 */
	public void setDfhmfil(String dfhmfil) {
		this.dfhmfil.setValue(dfhmfil);
	}
	/**
	 * Gets the reference for attribute dfhment.
	 * @return the dfhment attribute reference
	 */
	public ElementaryRangeReference getDfhmentReference() {
		return dfhment.getReference();
	}

	/**
	 * Getter for dfhment attribute.
	 * @return dfhment attribute
	 */
	public String getDfhment() {
		return dfhment.getValue();
	}

	/**
	 * Setter for dfhment attribute.
	 * @param dfhment the new value of dfhment
	 */
	public void setDfhment(String dfhment) {
		this.dfhment.setValue(dfhment);
	}
	/**
	 * Gets the reference for attribute dfhmfe.
	 * @return the dfhmfe attribute reference
	 */
	public ElementaryRangeReference getDfhmfeReference() {
		return dfhmfe.getReference();
	}

	/**
	 * Getter for dfhmfe attribute.
	 * @return dfhmfe attribute
	 */
	public String getDfhmfe() {
		return dfhmfe.getValue();
	}

	/**
	 * Setter for dfhmfe attribute.
	 * @param dfhmfe the new value of dfhmfe
	 */
	public void setDfhmfe(String dfhmfe) {
		this.dfhmfe.setValue(dfhmfe);
	}
	/**
	 * Gets the reference for attribute dfhmt.
	 * @return the dfhmt attribute reference
	 */
	public ElementaryRangeReference getDfhmtReference() {
		return dfhmt.getReference();
	}

	/**
	 * Getter for dfhmt attribute.
	 * @return dfhmt attribute
	 */
	public String getDfhmt() {
		return dfhmt.getValue();
	}

	/**
	 * Setter for dfhmt attribute.
	 * @param dfhmt the new value of dfhmt
	 */
	public void setDfhmt(String dfhmt) {
		this.dfhmt.setValue(dfhmt);
	}
	/**
	 * Gets the reference for attribute dfhmft.
	 * @return the dfhmft attribute reference
	 */
	public ElementaryRangeReference getDfhmftReference() {
		return dfhmft.getReference();
	}

	/**
	 * Getter for dfhmft attribute.
	 * @return dfhmft attribute
	 */
	public String getDfhmft() {
		return dfhmft.getValue();
	}

	/**
	 * Setter for dfhmft attribute.
	 * @param dfhmft the new value of dfhmft
	 */
	public void setDfhmft(String dfhmft) {
		this.dfhmft.setValue(dfhmft);
	}
	/**
	 * Gets the reference for attribute dfhmet.
	 * @return the dfhmet attribute reference
	 */
	public ElementaryRangeReference getDfhmetReference() {
		return dfhmet.getReference();
	}

	/**
	 * Getter for dfhmet attribute.
	 * @return dfhmet attribute
	 */
	public String getDfhmet() {
		return dfhmet.getValue();
	}

	/**
	 * Setter for dfhmet attribute.
	 * @param dfhmet the new value of dfhmet
	 */
	public void setDfhmet(String dfhmet) {
		this.dfhmet.setValue(dfhmet);
	}
	/**
	 * Gets the reference for attribute dfhmfet.
	 * @return the dfhmfet attribute reference
	 */
	public ElementaryRangeReference getDfhmfetReference() {
		return dfhmfet.getReference();
	}

	/**
	 * Getter for dfhmfet attribute.
	 * @return dfhmfet attribute
	 */
	public String getDfhmfet() {
		return dfhmfet.getValue();
	}

	/**
	 * Setter for dfhmfet attribute.
	 * @param dfhmfet the new value of dfhmfet
	 */
	public void setDfhmfet(String dfhmfet) {
		this.dfhmfet.setValue(dfhmfet);
	}
	/**
	 * Gets the reference for attribute dfhunnod.
	 * @return the dfhunnod attribute reference
	 */
	public ElementaryRangeReference getDfhunnodReference() {
		return dfhunnod.getReference();
	}

	/**
	 * Getter for dfhunnod attribute.
	 * @return dfhunnod attribute
	 */
	public String getDfhunnod() {
		return dfhunnod.getValue();
	}

	/**
	 * Setter for dfhunnod attribute.
	 * @param dfhunnod the new value of dfhunnod
	 */
	public void setDfhunnod(String dfhunnod) {
		this.dfhunnod.setValue(dfhunnod);
	}
	/**
	 * Gets the reference for attribute dfhunimd.
	 * @return the dfhunimd attribute reference
	 */
	public ElementaryRangeReference getDfhunimdReference() {
		return dfhunimd.getReference();
	}

	/**
	 * Getter for dfhunimd attribute.
	 * @return dfhunimd attribute
	 */
	public String getDfhunimd() {
		return dfhunimd.getValue();
	}

	/**
	 * Setter for dfhunimd attribute.
	 * @param dfhunimd the new value of dfhunimd
	 */
	public void setDfhunimd(String dfhunimd) {
		this.dfhunimd.setValue(dfhunimd);
	}
	/**
	 * Gets the reference for attribute dfhunnum.
	 * @return the dfhunnum attribute reference
	 */
	public ElementaryRangeReference getDfhunnumReference() {
		return dfhunnum.getReference();
	}

	/**
	 * Getter for dfhunnum attribute.
	 * @return dfhunnum attribute
	 */
	public String getDfhunnum() {
		return dfhunnum.getValue();
	}

	/**
	 * Setter for dfhunnum attribute.
	 * @param dfhunnum the new value of dfhunnum
	 */
	public void setDfhunnum(String dfhunnum) {
		this.dfhunnum.setValue(dfhunnum);
	}
	/**
	 * Gets the reference for attribute dfhunnub.
	 * @return the dfhunnub attribute reference
	 */
	public ElementaryRangeReference getDfhunnubReference() {
		return dfhunnub.getReference();
	}

	/**
	 * Getter for dfhunnub attribute.
	 * @return dfhunnub attribute
	 */
	public String getDfhunnub() {
		return dfhunnub.getValue();
	}

	/**
	 * Setter for dfhunnub attribute.
	 * @param dfhunnub the new value of dfhunnub
	 */
	public void setDfhunnub(String dfhunnub) {
		this.dfhunnub.setValue(dfhunnub);
	}
	/**
	 * Gets the reference for attribute dfhunint.
	 * @return the dfhunint attribute reference
	 */
	public ElementaryRangeReference getDfhunintReference() {
		return dfhunint.getReference();
	}

	/**
	 * Getter for dfhunint attribute.
	 * @return dfhunint attribute
	 */
	public String getDfhunint() {
		return dfhunint.getValue();
	}

	/**
	 * Setter for dfhunint attribute.
	 * @param dfhunint the new value of dfhunint
	 */
	public void setDfhunint(String dfhunint) {
		this.dfhunint.setValue(dfhunint);
	}
	/**
	 * Gets the reference for attribute dfhunnon.
	 * @return the dfhunnon attribute reference
	 */
	public ElementaryRangeReference getDfhunnonReference() {
		return dfhunnon.getReference();
	}

	/**
	 * Getter for dfhunnon attribute.
	 * @return dfhunnon attribute
	 */
	public String getDfhunnon() {
		return dfhunnon.getValue();
	}

	/**
	 * Setter for dfhunnon attribute.
	 * @param dfhunnon the new value of dfhunnon
	 */
	public void setDfhunnon(String dfhunnon) {
		this.dfhunnon.setValue(dfhunnon);
	}
	/**
	 * Gets the reference for attribute dfhproti.
	 * @return the dfhproti attribute reference
	 */
	public ElementaryRangeReference getDfhprotiReference() {
		return dfhproti.getReference();
	}

	/**
	 * Getter for dfhproti attribute.
	 * @return dfhproti attribute
	 */
	public String getDfhproti() {
		return dfhproti.getValue();
	}

	/**
	 * Setter for dfhproti attribute.
	 * @param dfhproti the new value of dfhproti
	 */
	public void setDfhproti(String dfhproti) {
		this.dfhproti.setValue(dfhproti);
	}
	/**
	 * Gets the reference for attribute dfhprotn.
	 * @return the dfhprotn attribute reference
	 */
	public ElementaryRangeReference getDfhprotnReference() {
		return dfhprotn.getReference();
	}

	/**
	 * Getter for dfhprotn attribute.
	 * @return dfhprotn attribute
	 */
	public String getDfhprotn() {
		return dfhprotn.getValue();
	}

	/**
	 * Setter for dfhprotn attribute.
	 * @param dfhprotn the new value of dfhprotn
	 */
	public void setDfhprotn(String dfhprotn) {
		this.dfhprotn.setValue(dfhprotn);
	}
	/**
	 * Gets the reference for attribute dfhdffr.
	 * @return the dfhdffr attribute reference
	 */
	public ElementaryRangeReference getDfhdffrReference() {
		return dfhdffr.getReference();
	}

	/**
	 * Getter for dfhdffr attribute.
	 * @return dfhdffr attribute
	 */
	public String getDfhdffr() {
		return dfhdffr.getValue();
	}

	/**
	 * Setter for dfhdffr attribute.
	 * @param dfhdffr the new value of dfhdffr
	 */
	public void setDfhdffr(String dfhdffr) {
		this.dfhdffr.setValue(dfhdffr);
	}
	/**
	 * Gets the reference for attribute dfhunder.
	 * @return the dfhunder attribute reference
	 */
	public ElementaryRangeReference getDfhunderReference() {
		return dfhunder.getReference();
	}

	/**
	 * Getter for dfhunder attribute.
	 * @return dfhunder attribute
	 */
	public String getDfhunder() {
		return dfhunder.getValue();
	}

	/**
	 * Setter for dfhunder attribute.
	 * @param dfhunder the new value of dfhunder
	 */
	public void setDfhunder(String dfhunder) {
		this.dfhunder.setValue(dfhunder);
	}
	/**
	 * Gets the reference for attribute dfhright.
	 * @return the dfhright attribute reference
	 */
	public ElementaryRangeReference getDfhrightReference() {
		return dfhright.getReference();
	}

	/**
	 * Getter for dfhright attribute.
	 * @return dfhright attribute
	 */
	public String getDfhright() {
		return dfhright.getValue();
	}

	/**
	 * Setter for dfhright attribute.
	 * @param dfhright the new value of dfhright
	 */
	public void setDfhright(String dfhright) {
		this.dfhright.setValue(dfhright);
	}
	/**
	 * Gets the reference for attribute dfhover.
	 * @return the dfhover attribute reference
	 */
	public ElementaryRangeReference getDfhoverReference() {
		return dfhover.getReference();
	}

	/**
	 * Getter for dfhover attribute.
	 * @return dfhover attribute
	 */
	public String getDfhover() {
		return dfhover.getValue();
	}

	/**
	 * Setter for dfhover attribute.
	 * @param dfhover the new value of dfhover
	 */
	public void setDfhover(String dfhover) {
		this.dfhover.setValue(dfhover);
	}
	/**
	 * Gets the reference for attribute dfhleft.
	 * @return the dfhleft attribute reference
	 */
	public ElementaryRangeReference getDfhleftReference() {
		return dfhleft.getReference();
	}

	/**
	 * Getter for dfhleft attribute.
	 * @return dfhleft attribute
	 */
	public String getDfhleft() {
		return dfhleft.getValue();
	}

	/**
	 * Setter for dfhleft attribute.
	 * @param dfhleft the new value of dfhleft
	 */
	public void setDfhleft(String dfhleft) {
		this.dfhleft.setValue(dfhleft);
	}
	/**
	 * Gets the reference for attribute dfhbox.
	 * @return the dfhbox attribute reference
	 */
	public ElementaryRangeReference getDfhboxReference() {
		return dfhbox.getReference();
	}

	/**
	 * Getter for dfhbox attribute.
	 * @return dfhbox attribute
	 */
	public String getDfhbox() {
		return dfhbox.getValue();
	}

	/**
	 * Setter for dfhbox attribute.
	 * @param dfhbox the new value of dfhbox
	 */
	public void setDfhbox(String dfhbox) {
		this.dfhbox.setValue(dfhbox);
	}
	/**
	 * Gets the reference for attribute dfhsosi.
	 * @return the dfhsosi attribute reference
	 */
	public ElementaryRangeReference getDfhsosiReference() {
		return dfhsosi.getReference();
	}

	/**
	 * Getter for dfhsosi attribute.
	 * @return dfhsosi attribute
	 */
	public String getDfhsosi() {
		return dfhsosi.getValue();
	}

	/**
	 * Setter for dfhsosi attribute.
	 * @param dfhsosi the new value of dfhsosi
	 */
	public void setDfhsosi(String dfhsosi) {
		this.dfhsosi.setValue(dfhsosi);
	}
	/**
	 * Gets the reference for attribute dfhtrans.
	 * @return the dfhtrans attribute reference
	 */
	public ElementaryRangeReference getDfhtransReference() {
		return dfhtrans.getReference();
	}

	/**
	 * Getter for dfhtrans attribute.
	 * @return dfhtrans attribute
	 */
	public String getDfhtrans() {
		return dfhtrans.getValue();
	}

	/**
	 * Setter for dfhtrans attribute.
	 * @param dfhtrans the new value of dfhtrans
	 */
	public void setDfhtrans(String dfhtrans) {
		this.dfhtrans.setValue(dfhtrans);
	}
	/**
	 * Gets the reference for attribute dfhopaq.
	 * @return the dfhopaq attribute reference
	 */
	public ElementaryRangeReference getDfhopaqReference() {
		return dfhopaq.getReference();
	}

	/**
	 * Getter for dfhopaq attribute.
	 * @return dfhopaq attribute
	 */
	public String getDfhopaq() {
		return dfhopaq.getValue();
	}

	/**
	 * Setter for dfhopaq attribute.
	 * @param dfhopaq the new value of dfhopaq
	 */
	public void setDfhopaq(String dfhopaq) {
		this.dfhopaq.setValue(dfhopaq);
	}
}
