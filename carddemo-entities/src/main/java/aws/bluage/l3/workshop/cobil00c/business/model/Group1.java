package aws.bluage.l3.workshop.cobil00c.business.model;

import com.netfective.bluage.gapwalk.datasimplifier.configuration.Configuration;
import com.netfective.bluage.gapwalk.datasimplifier.data.RecordAdaptable;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Elementary;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Filler;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Group;
import com.netfective.bluage.gapwalk.datasimplifier.data.structure.Union;
import com.netfective.bluage.gapwalk.datasimplifier.entity.ElementaryRangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RangeReference;
import com.netfective.bluage.gapwalk.datasimplifier.entity.RecordEntity;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.AlphanumericType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.BinaryType;
/**
 * Data simplifier entity Group1.
 * 
 * <p>About 'cobil0ai' field, <br>uml entity: aws.bluage.l3.workshop.cobil00c.business.model.Cobil0ai
 * <br></p>
 * 
 * <p>About 'cobil0ao' field, <br>uml entity: aws.bluage.l3.workshop.cobil00c.business.model.Cobil0ao
 * <br></p>
 * 
 * @see RecordEntity
 */
public class Group1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Union union = new Union(root);
	
	/**
	 * ****************************************************************
	 * Copyright Amazon.com, Inc. or its affiliates.
	 * All Rights Reserved.
	 * 
	 * Licensed under the Apache License, Version 2.0 (the "License").
	 * You may not use this file except in compliance with the License.
	 * You may obtain a copy of the License at
	 * 
	 * http://www.apache.org/licenses/LICENSE-2.0
	 * 
	 * Unless required by applicable law or agreed to in writing,
	 * software distributed under the License is distributed on an
	 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
	 * either express or implied. See the License for the specific
	 * language governing permissions and limitations under the License
	 * ****************************************************************
	 */
	private final Group cobil0ai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cobil0ai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(cobil0ai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(cobil0ai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(cobil0ai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(cobil0ai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(cobil0ai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(cobil0ai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(cobil0ai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(cobil0ai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(cobil0ai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(cobil0ai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(cobil0ai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(cobil0ai,new AlphanumericType(8));
	private final Elementary actidinl = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(cobil0ai);
	private final Elementary actidinf = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary actidina = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary actidini = new Elementary(cobil0ai,new AlphanumericType(11));
	private final Elementary curball = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(cobil0ai);
	private final Elementary curbalf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary curbala = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary curbali = new Elementary(cobil0ai,new AlphanumericType(14));
	private final Elementary confirml = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(cobil0ai);
	private final Elementary confirmf = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary confirma = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary confirmi = new Elementary(cobil0ai,new AlphanumericType(1));
	private final Elementary errmsgl = new Elementary(cobil0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(cobil0ai);
	private final Elementary errmsgf = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary errmsga = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cobil0ai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(cobil0ai,new AlphanumericType(78));
	private final Group cobil0ao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cobil0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(cobil0ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(cobil0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(cobil0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(cobil0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(cobil0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(cobil0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary actidinc = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary actidinp = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary actidinh = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary actidinv = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary actidino = new Elementary(cobil0ao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary curbalc = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curbalp = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curbalh = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curbalv = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary curbalo = new Elementary(cobil0ao,new AlphanumericType(14));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary confirmc = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary confirmp = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary confirmh = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary confirmv = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary confirmo = new Elementary(cobil0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(cobil0ao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(cobil0ao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(cobil0ao,new AlphanumericType(78));
	

	/**
	 * Instantiate a new Group1 with a default record.
	 * @param configuration the configuration
	 */
	public Group1(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new Group1 bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public Group1(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute cobil0ai.
	 * @return the cobil0ai attribute reference
	 */
	public RangeReference getCobil0aiReference() {
		return cobil0ai.getReference();
	}	
				
	/**
	 * Setter for cobil0ai .
	 */
   	public void setCobil0ai(RangeReference reference) {
       	cobil0ai.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute trnnamel.
	 * @return the trnnamel attribute reference
	 */
	public ElementaryRangeReference getTrnnamelReference() {
		return trnnamel.getReference();
	}

	/**
	 * Getter for trnnamel attribute.
	 * @return trnnamel attribute
	 */
	public int getTrnnamel() {
		return trnnamel.getValue();
	}

	/**
	 * Setter for trnnamel attribute.
	 * @param trnnamel the new value of trnnamel
	 */
	public void setTrnnamel(int trnnamel) {
		this.trnnamel.setValue(trnnamel);
	}
	/**
	 * Gets the reference for attribute trnnamef.
	 * @return the trnnamef attribute reference
	 */
	public ElementaryRangeReference getTrnnamefReference() {
		return trnnamef.getReference();
	}

	/**
	 * Getter for trnnamef attribute.
	 * @return trnnamef attribute
	 */
	public String getTrnnamef() {
		return trnnamef.getValue();
	}

	/**
	 * Setter for trnnamef attribute.
	 * @param trnnamef the new value of trnnamef
	 */
	public void setTrnnamef(String trnnamef) {
		this.trnnamef.setValue(trnnamef);
	}
	/**
	 * Gets the reference for attribute trnnamea.
	 * @return the trnnamea attribute reference
	 */
	public ElementaryRangeReference getTrnnameaReference() {
		return trnnamea.getReference();
	}

	/**
	 * Getter for trnnamea attribute.
	 * @return trnnamea attribute
	 */
	public String getTrnnamea() {
		return trnnamea.getValue();
	}

	/**
	 * Setter for trnnamea attribute.
	 * @param trnnamea the new value of trnnamea
	 */
	public void setTrnnamea(String trnnamea) {
		this.trnnamea.setValue(trnnamea);
	}
	/**
	 * Gets the reference for attribute trnnamei.
	 * @return the trnnamei attribute reference
	 */
	public ElementaryRangeReference getTrnnameiReference() {
		return trnnamei.getReference();
	}

	/**
	 * Getter for trnnamei attribute.
	 * @return trnnamei attribute
	 */
	public String getTrnnamei() {
		return trnnamei.getValue();
	}

	/**
	 * Setter for trnnamei attribute.
	 * @param trnnamei the new value of trnnamei
	 */
	public void setTrnnamei(String trnnamei) {
		this.trnnamei.setValue(trnnamei);
	}
	/**
	 * Gets the reference for attribute title01l.
	 * @return the title01l attribute reference
	 */
	public ElementaryRangeReference getTitle01lReference() {
		return title01l.getReference();
	}

	/**
	 * Getter for title01l attribute.
	 * @return title01l attribute
	 */
	public int getTitle01l() {
		return title01l.getValue();
	}

	/**
	 * Setter for title01l attribute.
	 * @param title01l the new value of title01l
	 */
	public void setTitle01l(int title01l) {
		this.title01l.setValue(title01l);
	}
	/**
	 * Gets the reference for attribute title01f.
	 * @return the title01f attribute reference
	 */
	public ElementaryRangeReference getTitle01fReference() {
		return title01f.getReference();
	}

	/**
	 * Getter for title01f attribute.
	 * @return title01f attribute
	 */
	public String getTitle01f() {
		return title01f.getValue();
	}

	/**
	 * Setter for title01f attribute.
	 * @param title01f the new value of title01f
	 */
	public void setTitle01f(String title01f) {
		this.title01f.setValue(title01f);
	}
	/**
	 * Gets the reference for attribute title01a.
	 * @return the title01a attribute reference
	 */
	public ElementaryRangeReference getTitle01aReference() {
		return title01a.getReference();
	}

	/**
	 * Getter for title01a attribute.
	 * @return title01a attribute
	 */
	public String getTitle01a() {
		return title01a.getValue();
	}

	/**
	 * Setter for title01a attribute.
	 * @param title01a the new value of title01a
	 */
	public void setTitle01a(String title01a) {
		this.title01a.setValue(title01a);
	}
	/**
	 * Gets the reference for attribute title01i.
	 * @return the title01i attribute reference
	 */
	public ElementaryRangeReference getTitle01iReference() {
		return title01i.getReference();
	}

	/**
	 * Getter for title01i attribute.
	 * @return title01i attribute
	 */
	public String getTitle01i() {
		return title01i.getValue();
	}

	/**
	 * Setter for title01i attribute.
	 * @param title01i the new value of title01i
	 */
	public void setTitle01i(String title01i) {
		this.title01i.setValue(title01i);
	}
	/**
	 * Gets the reference for attribute curdatel.
	 * @return the curdatel attribute reference
	 */
	public ElementaryRangeReference getCurdatelReference() {
		return curdatel.getReference();
	}

	/**
	 * Getter for curdatel attribute.
	 * @return curdatel attribute
	 */
	public int getCurdatel() {
		return curdatel.getValue();
	}

	/**
	 * Setter for curdatel attribute.
	 * @param curdatel the new value of curdatel
	 */
	public void setCurdatel(int curdatel) {
		this.curdatel.setValue(curdatel);
	}
	/**
	 * Gets the reference for attribute curdatef.
	 * @return the curdatef attribute reference
	 */
	public ElementaryRangeReference getCurdatefReference() {
		return curdatef.getReference();
	}

	/**
	 * Getter for curdatef attribute.
	 * @return curdatef attribute
	 */
	public String getCurdatef() {
		return curdatef.getValue();
	}

	/**
	 * Setter for curdatef attribute.
	 * @param curdatef the new value of curdatef
	 */
	public void setCurdatef(String curdatef) {
		this.curdatef.setValue(curdatef);
	}
	/**
	 * Gets the reference for attribute curdatea.
	 * @return the curdatea attribute reference
	 */
	public ElementaryRangeReference getCurdateaReference() {
		return curdatea.getReference();
	}

	/**
	 * Getter for curdatea attribute.
	 * @return curdatea attribute
	 */
	public String getCurdatea() {
		return curdatea.getValue();
	}

	/**
	 * Setter for curdatea attribute.
	 * @param curdatea the new value of curdatea
	 */
	public void setCurdatea(String curdatea) {
		this.curdatea.setValue(curdatea);
	}
	/**
	 * Gets the reference for attribute curdatei.
	 * @return the curdatei attribute reference
	 */
	public ElementaryRangeReference getCurdateiReference() {
		return curdatei.getReference();
	}

	/**
	 * Getter for curdatei attribute.
	 * @return curdatei attribute
	 */
	public String getCurdatei() {
		return curdatei.getValue();
	}

	/**
	 * Setter for curdatei attribute.
	 * @param curdatei the new value of curdatei
	 */
	public void setCurdatei(String curdatei) {
		this.curdatei.setValue(curdatei);
	}
	/**
	 * Gets the reference for attribute pgmnamel.
	 * @return the pgmnamel attribute reference
	 */
	public ElementaryRangeReference getPgmnamelReference() {
		return pgmnamel.getReference();
	}

	/**
	 * Getter for pgmnamel attribute.
	 * @return pgmnamel attribute
	 */
	public int getPgmnamel() {
		return pgmnamel.getValue();
	}

	/**
	 * Setter for pgmnamel attribute.
	 * @param pgmnamel the new value of pgmnamel
	 */
	public void setPgmnamel(int pgmnamel) {
		this.pgmnamel.setValue(pgmnamel);
	}
	/**
	 * Gets the reference for attribute pgmnamef.
	 * @return the pgmnamef attribute reference
	 */
	public ElementaryRangeReference getPgmnamefReference() {
		return pgmnamef.getReference();
	}

	/**
	 * Getter for pgmnamef attribute.
	 * @return pgmnamef attribute
	 */
	public String getPgmnamef() {
		return pgmnamef.getValue();
	}

	/**
	 * Setter for pgmnamef attribute.
	 * @param pgmnamef the new value of pgmnamef
	 */
	public void setPgmnamef(String pgmnamef) {
		this.pgmnamef.setValue(pgmnamef);
	}
	/**
	 * Gets the reference for attribute pgmnamea.
	 * @return the pgmnamea attribute reference
	 */
	public ElementaryRangeReference getPgmnameaReference() {
		return pgmnamea.getReference();
	}

	/**
	 * Getter for pgmnamea attribute.
	 * @return pgmnamea attribute
	 */
	public String getPgmnamea() {
		return pgmnamea.getValue();
	}

	/**
	 * Setter for pgmnamea attribute.
	 * @param pgmnamea the new value of pgmnamea
	 */
	public void setPgmnamea(String pgmnamea) {
		this.pgmnamea.setValue(pgmnamea);
	}
	/**
	 * Gets the reference for attribute pgmnamei.
	 * @return the pgmnamei attribute reference
	 */
	public ElementaryRangeReference getPgmnameiReference() {
		return pgmnamei.getReference();
	}

	/**
	 * Getter for pgmnamei attribute.
	 * @return pgmnamei attribute
	 */
	public String getPgmnamei() {
		return pgmnamei.getValue();
	}

	/**
	 * Setter for pgmnamei attribute.
	 * @param pgmnamei the new value of pgmnamei
	 */
	public void setPgmnamei(String pgmnamei) {
		this.pgmnamei.setValue(pgmnamei);
	}
	/**
	 * Gets the reference for attribute title02l.
	 * @return the title02l attribute reference
	 */
	public ElementaryRangeReference getTitle02lReference() {
		return title02l.getReference();
	}

	/**
	 * Getter for title02l attribute.
	 * @return title02l attribute
	 */
	public int getTitle02l() {
		return title02l.getValue();
	}

	/**
	 * Setter for title02l attribute.
	 * @param title02l the new value of title02l
	 */
	public void setTitle02l(int title02l) {
		this.title02l.setValue(title02l);
	}
	/**
	 * Gets the reference for attribute title02f.
	 * @return the title02f attribute reference
	 */
	public ElementaryRangeReference getTitle02fReference() {
		return title02f.getReference();
	}

	/**
	 * Getter for title02f attribute.
	 * @return title02f attribute
	 */
	public String getTitle02f() {
		return title02f.getValue();
	}

	/**
	 * Setter for title02f attribute.
	 * @param title02f the new value of title02f
	 */
	public void setTitle02f(String title02f) {
		this.title02f.setValue(title02f);
	}
	/**
	 * Gets the reference for attribute title02a.
	 * @return the title02a attribute reference
	 */
	public ElementaryRangeReference getTitle02aReference() {
		return title02a.getReference();
	}

	/**
	 * Getter for title02a attribute.
	 * @return title02a attribute
	 */
	public String getTitle02a() {
		return title02a.getValue();
	}

	/**
	 * Setter for title02a attribute.
	 * @param title02a the new value of title02a
	 */
	public void setTitle02a(String title02a) {
		this.title02a.setValue(title02a);
	}
	/**
	 * Gets the reference for attribute title02i.
	 * @return the title02i attribute reference
	 */
	public ElementaryRangeReference getTitle02iReference() {
		return title02i.getReference();
	}

	/**
	 * Getter for title02i attribute.
	 * @return title02i attribute
	 */
	public String getTitle02i() {
		return title02i.getValue();
	}

	/**
	 * Setter for title02i attribute.
	 * @param title02i the new value of title02i
	 */
	public void setTitle02i(String title02i) {
		this.title02i.setValue(title02i);
	}
	/**
	 * Gets the reference for attribute curtimel.
	 * @return the curtimel attribute reference
	 */
	public ElementaryRangeReference getCurtimelReference() {
		return curtimel.getReference();
	}

	/**
	 * Getter for curtimel attribute.
	 * @return curtimel attribute
	 */
	public int getCurtimel() {
		return curtimel.getValue();
	}

	/**
	 * Setter for curtimel attribute.
	 * @param curtimel the new value of curtimel
	 */
	public void setCurtimel(int curtimel) {
		this.curtimel.setValue(curtimel);
	}
	/**
	 * Gets the reference for attribute curtimef.
	 * @return the curtimef attribute reference
	 */
	public ElementaryRangeReference getCurtimefReference() {
		return curtimef.getReference();
	}

	/**
	 * Getter for curtimef attribute.
	 * @return curtimef attribute
	 */
	public String getCurtimef() {
		return curtimef.getValue();
	}

	/**
	 * Setter for curtimef attribute.
	 * @param curtimef the new value of curtimef
	 */
	public void setCurtimef(String curtimef) {
		this.curtimef.setValue(curtimef);
	}
	/**
	 * Gets the reference for attribute curtimea.
	 * @return the curtimea attribute reference
	 */
	public ElementaryRangeReference getCurtimeaReference() {
		return curtimea.getReference();
	}

	/**
	 * Getter for curtimea attribute.
	 * @return curtimea attribute
	 */
	public String getCurtimea() {
		return curtimea.getValue();
	}

	/**
	 * Setter for curtimea attribute.
	 * @param curtimea the new value of curtimea
	 */
	public void setCurtimea(String curtimea) {
		this.curtimea.setValue(curtimea);
	}
	/**
	 * Gets the reference for attribute curtimei.
	 * @return the curtimei attribute reference
	 */
	public ElementaryRangeReference getCurtimeiReference() {
		return curtimei.getReference();
	}

	/**
	 * Getter for curtimei attribute.
	 * @return curtimei attribute
	 */
	public String getCurtimei() {
		return curtimei.getValue();
	}

	/**
	 * Setter for curtimei attribute.
	 * @param curtimei the new value of curtimei
	 */
	public void setCurtimei(String curtimei) {
		this.curtimei.setValue(curtimei);
	}
	/**
	 * Gets the reference for attribute actidinl.
	 * @return the actidinl attribute reference
	 */
	public ElementaryRangeReference getActidinlReference() {
		return actidinl.getReference();
	}

	/**
	 * Getter for actidinl attribute.
	 * @return actidinl attribute
	 */
	public int getActidinl() {
		return actidinl.getValue();
	}

	/**
	 * Setter for actidinl attribute.
	 * @param actidinl the new value of actidinl
	 */
	public void setActidinl(int actidinl) {
		this.actidinl.setValue(actidinl);
	}
	/**
	 * Gets the reference for attribute actidinf.
	 * @return the actidinf attribute reference
	 */
	public ElementaryRangeReference getActidinfReference() {
		return actidinf.getReference();
	}

	/**
	 * Getter for actidinf attribute.
	 * @return actidinf attribute
	 */
	public String getActidinf() {
		return actidinf.getValue();
	}

	/**
	 * Setter for actidinf attribute.
	 * @param actidinf the new value of actidinf
	 */
	public void setActidinf(String actidinf) {
		this.actidinf.setValue(actidinf);
	}
	/**
	 * Gets the reference for attribute actidina.
	 * @return the actidina attribute reference
	 */
	public ElementaryRangeReference getActidinaReference() {
		return actidina.getReference();
	}

	/**
	 * Getter for actidina attribute.
	 * @return actidina attribute
	 */
	public String getActidina() {
		return actidina.getValue();
	}

	/**
	 * Setter for actidina attribute.
	 * @param actidina the new value of actidina
	 */
	public void setActidina(String actidina) {
		this.actidina.setValue(actidina);
	}
	/**
	 * Gets the reference for attribute actidini.
	 * @return the actidini attribute reference
	 */
	public ElementaryRangeReference getActidiniReference() {
		return actidini.getReference();
	}

	/**
	 * Getter for actidini attribute.
	 * @return actidini attribute
	 */
	public String getActidini() {
		return actidini.getValue();
	}

	/**
	 * Setter for actidini attribute.
	 * @param actidini the new value of actidini
	 */
	public void setActidini(String actidini) {
		this.actidini.setValue(actidini);
	}
	/**
	 * Gets the reference for attribute curball.
	 * @return the curball attribute reference
	 */
	public ElementaryRangeReference getCurballReference() {
		return curball.getReference();
	}

	/**
	 * Getter for curball attribute.
	 * @return curball attribute
	 */
	public int getCurball() {
		return curball.getValue();
	}

	/**
	 * Setter for curball attribute.
	 * @param curball the new value of curball
	 */
	public void setCurball(int curball) {
		this.curball.setValue(curball);
	}
	/**
	 * Gets the reference for attribute curbalf.
	 * @return the curbalf attribute reference
	 */
	public ElementaryRangeReference getCurbalfReference() {
		return curbalf.getReference();
	}

	/**
	 * Getter for curbalf attribute.
	 * @return curbalf attribute
	 */
	public String getCurbalf() {
		return curbalf.getValue();
	}

	/**
	 * Setter for curbalf attribute.
	 * @param curbalf the new value of curbalf
	 */
	public void setCurbalf(String curbalf) {
		this.curbalf.setValue(curbalf);
	}
	/**
	 * Gets the reference for attribute curbala.
	 * @return the curbala attribute reference
	 */
	public ElementaryRangeReference getCurbalaReference() {
		return curbala.getReference();
	}

	/**
	 * Getter for curbala attribute.
	 * @return curbala attribute
	 */
	public String getCurbala() {
		return curbala.getValue();
	}

	/**
	 * Setter for curbala attribute.
	 * @param curbala the new value of curbala
	 */
	public void setCurbala(String curbala) {
		this.curbala.setValue(curbala);
	}
	/**
	 * Gets the reference for attribute curbali.
	 * @return the curbali attribute reference
	 */
	public ElementaryRangeReference getCurbaliReference() {
		return curbali.getReference();
	}

	/**
	 * Getter for curbali attribute.
	 * @return curbali attribute
	 */
	public String getCurbali() {
		return curbali.getValue();
	}

	/**
	 * Setter for curbali attribute.
	 * @param curbali the new value of curbali
	 */
	public void setCurbali(String curbali) {
		this.curbali.setValue(curbali);
	}
	/**
	 * Gets the reference for attribute confirml.
	 * @return the confirml attribute reference
	 */
	public ElementaryRangeReference getConfirmlReference() {
		return confirml.getReference();
	}

	/**
	 * Getter for confirml attribute.
	 * @return confirml attribute
	 */
	public int getConfirml() {
		return confirml.getValue();
	}

	/**
	 * Setter for confirml attribute.
	 * @param confirml the new value of confirml
	 */
	public void setConfirml(int confirml) {
		this.confirml.setValue(confirml);
	}
	/**
	 * Gets the reference for attribute confirmf.
	 * @return the confirmf attribute reference
	 */
	public ElementaryRangeReference getConfirmfReference() {
		return confirmf.getReference();
	}

	/**
	 * Getter for confirmf attribute.
	 * @return confirmf attribute
	 */
	public String getConfirmf() {
		return confirmf.getValue();
	}

	/**
	 * Setter for confirmf attribute.
	 * @param confirmf the new value of confirmf
	 */
	public void setConfirmf(String confirmf) {
		this.confirmf.setValue(confirmf);
	}
	/**
	 * Gets the reference for attribute confirma.
	 * @return the confirma attribute reference
	 */
	public ElementaryRangeReference getConfirmaReference() {
		return confirma.getReference();
	}

	/**
	 * Getter for confirma attribute.
	 * @return confirma attribute
	 */
	public String getConfirma() {
		return confirma.getValue();
	}

	/**
	 * Setter for confirma attribute.
	 * @param confirma the new value of confirma
	 */
	public void setConfirma(String confirma) {
		this.confirma.setValue(confirma);
	}
	/**
	 * Gets the reference for attribute confirmi.
	 * @return the confirmi attribute reference
	 */
	public ElementaryRangeReference getConfirmiReference() {
		return confirmi.getReference();
	}

	/**
	 * Getter for confirmi attribute.
	 * @return confirmi attribute
	 */
	public String getConfirmi() {
		return confirmi.getValue();
	}

	/**
	 * Setter for confirmi attribute.
	 * @param confirmi the new value of confirmi
	 */
	public void setConfirmi(String confirmi) {
		this.confirmi.setValue(confirmi);
	}
	/**
	 * Gets the reference for attribute errmsgl.
	 * @return the errmsgl attribute reference
	 */
	public ElementaryRangeReference getErrmsglReference() {
		return errmsgl.getReference();
	}

	/**
	 * Getter for errmsgl attribute.
	 * @return errmsgl attribute
	 */
	public int getErrmsgl() {
		return errmsgl.getValue();
	}

	/**
	 * Setter for errmsgl attribute.
	 * @param errmsgl the new value of errmsgl
	 */
	public void setErrmsgl(int errmsgl) {
		this.errmsgl.setValue(errmsgl);
	}
	/**
	 * Gets the reference for attribute errmsgf.
	 * @return the errmsgf attribute reference
	 */
	public ElementaryRangeReference getErrmsgfReference() {
		return errmsgf.getReference();
	}

	/**
	 * Getter for errmsgf attribute.
	 * @return errmsgf attribute
	 */
	public String getErrmsgf() {
		return errmsgf.getValue();
	}

	/**
	 * Setter for errmsgf attribute.
	 * @param errmsgf the new value of errmsgf
	 */
	public void setErrmsgf(String errmsgf) {
		this.errmsgf.setValue(errmsgf);
	}
	/**
	 * Gets the reference for attribute errmsga.
	 * @return the errmsga attribute reference
	 */
	public ElementaryRangeReference getErrmsgaReference() {
		return errmsga.getReference();
	}

	/**
	 * Getter for errmsga attribute.
	 * @return errmsga attribute
	 */
	public String getErrmsga() {
		return errmsga.getValue();
	}

	/**
	 * Setter for errmsga attribute.
	 * @param errmsga the new value of errmsga
	 */
	public void setErrmsga(String errmsga) {
		this.errmsga.setValue(errmsga);
	}
	/**
	 * Gets the reference for attribute errmsgi.
	 * @return the errmsgi attribute reference
	 */
	public ElementaryRangeReference getErrmsgiReference() {
		return errmsgi.getReference();
	}

	/**
	 * Getter for errmsgi attribute.
	 * @return errmsgi attribute
	 */
	public String getErrmsgi() {
		return errmsgi.getValue();
	}

	/**
	 * Setter for errmsgi attribute.
	 * @param errmsgi the new value of errmsgi
	 */
	public void setErrmsgi(String errmsgi) {
		this.errmsgi.setValue(errmsgi);
	}
	
	/**
	 * Gets the reference for attribute cobil0ao.
	 * @return the cobil0ao attribute reference
	 */
	public RangeReference getCobil0aoReference() {
		return cobil0ao.getReference();
	}	
				
	/**
	 * Setter for cobil0ao .
	 */
   	public void setCobil0ao(RangeReference reference) {
       	cobil0ao.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute trnnamec.
	 * @return the trnnamec attribute reference
	 */
	public ElementaryRangeReference getTrnnamecReference() {
		return trnnamec.getReference();
	}

	/**
	 * Getter for trnnamec attribute.
	 * @return trnnamec attribute
	 */
	public String getTrnnamec() {
		return trnnamec.getValue();
	}

	/**
	 * Setter for trnnamec attribute.
	 * @param trnnamec the new value of trnnamec
	 */
	public void setTrnnamec(String trnnamec) {
		this.trnnamec.setValue(trnnamec);
	}
	/**
	 * Gets the reference for attribute trnnamep.
	 * @return the trnnamep attribute reference
	 */
	public ElementaryRangeReference getTrnnamepReference() {
		return trnnamep.getReference();
	}

	/**
	 * Getter for trnnamep attribute.
	 * @return trnnamep attribute
	 */
	public String getTrnnamep() {
		return trnnamep.getValue();
	}

	/**
	 * Setter for trnnamep attribute.
	 * @param trnnamep the new value of trnnamep
	 */
	public void setTrnnamep(String trnnamep) {
		this.trnnamep.setValue(trnnamep);
	}
	/**
	 * Gets the reference for attribute trnnameh.
	 * @return the trnnameh attribute reference
	 */
	public ElementaryRangeReference getTrnnamehReference() {
		return trnnameh.getReference();
	}

	/**
	 * Getter for trnnameh attribute.
	 * @return trnnameh attribute
	 */
	public String getTrnnameh() {
		return trnnameh.getValue();
	}

	/**
	 * Setter for trnnameh attribute.
	 * @param trnnameh the new value of trnnameh
	 */
	public void setTrnnameh(String trnnameh) {
		this.trnnameh.setValue(trnnameh);
	}
	/**
	 * Gets the reference for attribute trnnamev.
	 * @return the trnnamev attribute reference
	 */
	public ElementaryRangeReference getTrnnamevReference() {
		return trnnamev.getReference();
	}

	/**
	 * Getter for trnnamev attribute.
	 * @return trnnamev attribute
	 */
	public String getTrnnamev() {
		return trnnamev.getValue();
	}

	/**
	 * Setter for trnnamev attribute.
	 * @param trnnamev the new value of trnnamev
	 */
	public void setTrnnamev(String trnnamev) {
		this.trnnamev.setValue(trnnamev);
	}
	/**
	 * Gets the reference for attribute trnnameo.
	 * @return the trnnameo attribute reference
	 */
	public ElementaryRangeReference getTrnnameoReference() {
		return trnnameo.getReference();
	}

	/**
	 * Getter for trnnameo attribute.
	 * @return trnnameo attribute
	 */
	public String getTrnnameo() {
		return trnnameo.getValue();
	}

	/**
	 * Setter for trnnameo attribute.
	 * @param trnnameo the new value of trnnameo
	 */
	public void setTrnnameo(String trnnameo) {
		this.trnnameo.setValue(trnnameo);
	}
	/**
	 * Gets the reference for attribute title01c.
	 * @return the title01c attribute reference
	 */
	public ElementaryRangeReference getTitle01cReference() {
		return title01c.getReference();
	}

	/**
	 * Getter for title01c attribute.
	 * @return title01c attribute
	 */
	public String getTitle01c() {
		return title01c.getValue();
	}

	/**
	 * Setter for title01c attribute.
	 * @param title01c the new value of title01c
	 */
	public void setTitle01c(String title01c) {
		this.title01c.setValue(title01c);
	}
	/**
	 * Gets the reference for attribute title01p.
	 * @return the title01p attribute reference
	 */
	public ElementaryRangeReference getTitle01pReference() {
		return title01p.getReference();
	}

	/**
	 * Getter for title01p attribute.
	 * @return title01p attribute
	 */
	public String getTitle01p() {
		return title01p.getValue();
	}

	/**
	 * Setter for title01p attribute.
	 * @param title01p the new value of title01p
	 */
	public void setTitle01p(String title01p) {
		this.title01p.setValue(title01p);
	}
	/**
	 * Gets the reference for attribute title01h.
	 * @return the title01h attribute reference
	 */
	public ElementaryRangeReference getTitle01hReference() {
		return title01h.getReference();
	}

	/**
	 * Getter for title01h attribute.
	 * @return title01h attribute
	 */
	public String getTitle01h() {
		return title01h.getValue();
	}

	/**
	 * Setter for title01h attribute.
	 * @param title01h the new value of title01h
	 */
	public void setTitle01h(String title01h) {
		this.title01h.setValue(title01h);
	}
	/**
	 * Gets the reference for attribute title01v.
	 * @return the title01v attribute reference
	 */
	public ElementaryRangeReference getTitle01vReference() {
		return title01v.getReference();
	}

	/**
	 * Getter for title01v attribute.
	 * @return title01v attribute
	 */
	public String getTitle01v() {
		return title01v.getValue();
	}

	/**
	 * Setter for title01v attribute.
	 * @param title01v the new value of title01v
	 */
	public void setTitle01v(String title01v) {
		this.title01v.setValue(title01v);
	}
	/**
	 * Gets the reference for attribute title01o.
	 * @return the title01o attribute reference
	 */
	public ElementaryRangeReference getTitle01oReference() {
		return title01o.getReference();
	}

	/**
	 * Getter for title01o attribute.
	 * @return title01o attribute
	 */
	public String getTitle01o() {
		return title01o.getValue();
	}

	/**
	 * Setter for title01o attribute.
	 * @param title01o the new value of title01o
	 */
	public void setTitle01o(String title01o) {
		this.title01o.setValue(title01o);
	}
	/**
	 * Gets the reference for attribute curdatec.
	 * @return the curdatec attribute reference
	 */
	public ElementaryRangeReference getCurdatecReference() {
		return curdatec.getReference();
	}

	/**
	 * Getter for curdatec attribute.
	 * @return curdatec attribute
	 */
	public String getCurdatec() {
		return curdatec.getValue();
	}

	/**
	 * Setter for curdatec attribute.
	 * @param curdatec the new value of curdatec
	 */
	public void setCurdatec(String curdatec) {
		this.curdatec.setValue(curdatec);
	}
	/**
	 * Gets the reference for attribute curdatep.
	 * @return the curdatep attribute reference
	 */
	public ElementaryRangeReference getCurdatepReference() {
		return curdatep.getReference();
	}

	/**
	 * Getter for curdatep attribute.
	 * @return curdatep attribute
	 */
	public String getCurdatep() {
		return curdatep.getValue();
	}

	/**
	 * Setter for curdatep attribute.
	 * @param curdatep the new value of curdatep
	 */
	public void setCurdatep(String curdatep) {
		this.curdatep.setValue(curdatep);
	}
	/**
	 * Gets the reference for attribute curdateh.
	 * @return the curdateh attribute reference
	 */
	public ElementaryRangeReference getCurdatehReference() {
		return curdateh.getReference();
	}

	/**
	 * Getter for curdateh attribute.
	 * @return curdateh attribute
	 */
	public String getCurdateh() {
		return curdateh.getValue();
	}

	/**
	 * Setter for curdateh attribute.
	 * @param curdateh the new value of curdateh
	 */
	public void setCurdateh(String curdateh) {
		this.curdateh.setValue(curdateh);
	}
	/**
	 * Gets the reference for attribute curdatev.
	 * @return the curdatev attribute reference
	 */
	public ElementaryRangeReference getCurdatevReference() {
		return curdatev.getReference();
	}

	/**
	 * Getter for curdatev attribute.
	 * @return curdatev attribute
	 */
	public String getCurdatev() {
		return curdatev.getValue();
	}

	/**
	 * Setter for curdatev attribute.
	 * @param curdatev the new value of curdatev
	 */
	public void setCurdatev(String curdatev) {
		this.curdatev.setValue(curdatev);
	}
	/**
	 * Gets the reference for attribute curdateo.
	 * @return the curdateo attribute reference
	 */
	public ElementaryRangeReference getCurdateoReference() {
		return curdateo.getReference();
	}

	/**
	 * Getter for curdateo attribute.
	 * @return curdateo attribute
	 */
	public String getCurdateo() {
		return curdateo.getValue();
	}

	/**
	 * Setter for curdateo attribute.
	 * @param curdateo the new value of curdateo
	 */
	public void setCurdateo(String curdateo) {
		this.curdateo.setValue(curdateo);
	}
	/**
	 * Gets the reference for attribute pgmnamec.
	 * @return the pgmnamec attribute reference
	 */
	public ElementaryRangeReference getPgmnamecReference() {
		return pgmnamec.getReference();
	}

	/**
	 * Getter for pgmnamec attribute.
	 * @return pgmnamec attribute
	 */
	public String getPgmnamec() {
		return pgmnamec.getValue();
	}

	/**
	 * Setter for pgmnamec attribute.
	 * @param pgmnamec the new value of pgmnamec
	 */
	public void setPgmnamec(String pgmnamec) {
		this.pgmnamec.setValue(pgmnamec);
	}
	/**
	 * Gets the reference for attribute pgmnamep.
	 * @return the pgmnamep attribute reference
	 */
	public ElementaryRangeReference getPgmnamepReference() {
		return pgmnamep.getReference();
	}

	/**
	 * Getter for pgmnamep attribute.
	 * @return pgmnamep attribute
	 */
	public String getPgmnamep() {
		return pgmnamep.getValue();
	}

	/**
	 * Setter for pgmnamep attribute.
	 * @param pgmnamep the new value of pgmnamep
	 */
	public void setPgmnamep(String pgmnamep) {
		this.pgmnamep.setValue(pgmnamep);
	}
	/**
	 * Gets the reference for attribute pgmnameh.
	 * @return the pgmnameh attribute reference
	 */
	public ElementaryRangeReference getPgmnamehReference() {
		return pgmnameh.getReference();
	}

	/**
	 * Getter for pgmnameh attribute.
	 * @return pgmnameh attribute
	 */
	public String getPgmnameh() {
		return pgmnameh.getValue();
	}

	/**
	 * Setter for pgmnameh attribute.
	 * @param pgmnameh the new value of pgmnameh
	 */
	public void setPgmnameh(String pgmnameh) {
		this.pgmnameh.setValue(pgmnameh);
	}
	/**
	 * Gets the reference for attribute pgmnamev.
	 * @return the pgmnamev attribute reference
	 */
	public ElementaryRangeReference getPgmnamevReference() {
		return pgmnamev.getReference();
	}

	/**
	 * Getter for pgmnamev attribute.
	 * @return pgmnamev attribute
	 */
	public String getPgmnamev() {
		return pgmnamev.getValue();
	}

	/**
	 * Setter for pgmnamev attribute.
	 * @param pgmnamev the new value of pgmnamev
	 */
	public void setPgmnamev(String pgmnamev) {
		this.pgmnamev.setValue(pgmnamev);
	}
	/**
	 * Gets the reference for attribute pgmnameo.
	 * @return the pgmnameo attribute reference
	 */
	public ElementaryRangeReference getPgmnameoReference() {
		return pgmnameo.getReference();
	}

	/**
	 * Getter for pgmnameo attribute.
	 * @return pgmnameo attribute
	 */
	public String getPgmnameo() {
		return pgmnameo.getValue();
	}

	/**
	 * Setter for pgmnameo attribute.
	 * @param pgmnameo the new value of pgmnameo
	 */
	public void setPgmnameo(String pgmnameo) {
		this.pgmnameo.setValue(pgmnameo);
	}
	/**
	 * Gets the reference for attribute title02c.
	 * @return the title02c attribute reference
	 */
	public ElementaryRangeReference getTitle02cReference() {
		return title02c.getReference();
	}

	/**
	 * Getter for title02c attribute.
	 * @return title02c attribute
	 */
	public String getTitle02c() {
		return title02c.getValue();
	}

	/**
	 * Setter for title02c attribute.
	 * @param title02c the new value of title02c
	 */
	public void setTitle02c(String title02c) {
		this.title02c.setValue(title02c);
	}
	/**
	 * Gets the reference for attribute title02p.
	 * @return the title02p attribute reference
	 */
	public ElementaryRangeReference getTitle02pReference() {
		return title02p.getReference();
	}

	/**
	 * Getter for title02p attribute.
	 * @return title02p attribute
	 */
	public String getTitle02p() {
		return title02p.getValue();
	}

	/**
	 * Setter for title02p attribute.
	 * @param title02p the new value of title02p
	 */
	public void setTitle02p(String title02p) {
		this.title02p.setValue(title02p);
	}
	/**
	 * Gets the reference for attribute title02h.
	 * @return the title02h attribute reference
	 */
	public ElementaryRangeReference getTitle02hReference() {
		return title02h.getReference();
	}

	/**
	 * Getter for title02h attribute.
	 * @return title02h attribute
	 */
	public String getTitle02h() {
		return title02h.getValue();
	}

	/**
	 * Setter for title02h attribute.
	 * @param title02h the new value of title02h
	 */
	public void setTitle02h(String title02h) {
		this.title02h.setValue(title02h);
	}
	/**
	 * Gets the reference for attribute title02v.
	 * @return the title02v attribute reference
	 */
	public ElementaryRangeReference getTitle02vReference() {
		return title02v.getReference();
	}

	/**
	 * Getter for title02v attribute.
	 * @return title02v attribute
	 */
	public String getTitle02v() {
		return title02v.getValue();
	}

	/**
	 * Setter for title02v attribute.
	 * @param title02v the new value of title02v
	 */
	public void setTitle02v(String title02v) {
		this.title02v.setValue(title02v);
	}
	/**
	 * Gets the reference for attribute title02o.
	 * @return the title02o attribute reference
	 */
	public ElementaryRangeReference getTitle02oReference() {
		return title02o.getReference();
	}

	/**
	 * Getter for title02o attribute.
	 * @return title02o attribute
	 */
	public String getTitle02o() {
		return title02o.getValue();
	}

	/**
	 * Setter for title02o attribute.
	 * @param title02o the new value of title02o
	 */
	public void setTitle02o(String title02o) {
		this.title02o.setValue(title02o);
	}
	/**
	 * Gets the reference for attribute curtimec.
	 * @return the curtimec attribute reference
	 */
	public ElementaryRangeReference getCurtimecReference() {
		return curtimec.getReference();
	}

	/**
	 * Getter for curtimec attribute.
	 * @return curtimec attribute
	 */
	public String getCurtimec() {
		return curtimec.getValue();
	}

	/**
	 * Setter for curtimec attribute.
	 * @param curtimec the new value of curtimec
	 */
	public void setCurtimec(String curtimec) {
		this.curtimec.setValue(curtimec);
	}
	/**
	 * Gets the reference for attribute curtimep.
	 * @return the curtimep attribute reference
	 */
	public ElementaryRangeReference getCurtimepReference() {
		return curtimep.getReference();
	}

	/**
	 * Getter for curtimep attribute.
	 * @return curtimep attribute
	 */
	public String getCurtimep() {
		return curtimep.getValue();
	}

	/**
	 * Setter for curtimep attribute.
	 * @param curtimep the new value of curtimep
	 */
	public void setCurtimep(String curtimep) {
		this.curtimep.setValue(curtimep);
	}
	/**
	 * Gets the reference for attribute curtimeh.
	 * @return the curtimeh attribute reference
	 */
	public ElementaryRangeReference getCurtimehReference() {
		return curtimeh.getReference();
	}

	/**
	 * Getter for curtimeh attribute.
	 * @return curtimeh attribute
	 */
	public String getCurtimeh() {
		return curtimeh.getValue();
	}

	/**
	 * Setter for curtimeh attribute.
	 * @param curtimeh the new value of curtimeh
	 */
	public void setCurtimeh(String curtimeh) {
		this.curtimeh.setValue(curtimeh);
	}
	/**
	 * Gets the reference for attribute curtimev.
	 * @return the curtimev attribute reference
	 */
	public ElementaryRangeReference getCurtimevReference() {
		return curtimev.getReference();
	}

	/**
	 * Getter for curtimev attribute.
	 * @return curtimev attribute
	 */
	public String getCurtimev() {
		return curtimev.getValue();
	}

	/**
	 * Setter for curtimev attribute.
	 * @param curtimev the new value of curtimev
	 */
	public void setCurtimev(String curtimev) {
		this.curtimev.setValue(curtimev);
	}
	/**
	 * Gets the reference for attribute curtimeo.
	 * @return the curtimeo attribute reference
	 */
	public ElementaryRangeReference getCurtimeoReference() {
		return curtimeo.getReference();
	}

	/**
	 * Getter for curtimeo attribute.
	 * @return curtimeo attribute
	 */
	public String getCurtimeo() {
		return curtimeo.getValue();
	}

	/**
	 * Setter for curtimeo attribute.
	 * @param curtimeo the new value of curtimeo
	 */
	public void setCurtimeo(String curtimeo) {
		this.curtimeo.setValue(curtimeo);
	}
	/**
	 * Gets the reference for attribute actidinc.
	 * @return the actidinc attribute reference
	 */
	public ElementaryRangeReference getActidincReference() {
		return actidinc.getReference();
	}

	/**
	 * Getter for actidinc attribute.
	 * @return actidinc attribute
	 */
	public String getActidinc() {
		return actidinc.getValue();
	}

	/**
	 * Setter for actidinc attribute.
	 * @param actidinc the new value of actidinc
	 */
	public void setActidinc(String actidinc) {
		this.actidinc.setValue(actidinc);
	}
	/**
	 * Gets the reference for attribute actidinp.
	 * @return the actidinp attribute reference
	 */
	public ElementaryRangeReference getActidinpReference() {
		return actidinp.getReference();
	}

	/**
	 * Getter for actidinp attribute.
	 * @return actidinp attribute
	 */
	public String getActidinp() {
		return actidinp.getValue();
	}

	/**
	 * Setter for actidinp attribute.
	 * @param actidinp the new value of actidinp
	 */
	public void setActidinp(String actidinp) {
		this.actidinp.setValue(actidinp);
	}
	/**
	 * Gets the reference for attribute actidinh.
	 * @return the actidinh attribute reference
	 */
	public ElementaryRangeReference getActidinhReference() {
		return actidinh.getReference();
	}

	/**
	 * Getter for actidinh attribute.
	 * @return actidinh attribute
	 */
	public String getActidinh() {
		return actidinh.getValue();
	}

	/**
	 * Setter for actidinh attribute.
	 * @param actidinh the new value of actidinh
	 */
	public void setActidinh(String actidinh) {
		this.actidinh.setValue(actidinh);
	}
	/**
	 * Gets the reference for attribute actidinv.
	 * @return the actidinv attribute reference
	 */
	public ElementaryRangeReference getActidinvReference() {
		return actidinv.getReference();
	}

	/**
	 * Getter for actidinv attribute.
	 * @return actidinv attribute
	 */
	public String getActidinv() {
		return actidinv.getValue();
	}

	/**
	 * Setter for actidinv attribute.
	 * @param actidinv the new value of actidinv
	 */
	public void setActidinv(String actidinv) {
		this.actidinv.setValue(actidinv);
	}
	/**
	 * Gets the reference for attribute actidino.
	 * @return the actidino attribute reference
	 */
	public ElementaryRangeReference getActidinoReference() {
		return actidino.getReference();
	}

	/**
	 * Getter for actidino attribute.
	 * @return actidino attribute
	 */
	public String getActidino() {
		return actidino.getValue();
	}

	/**
	 * Setter for actidino attribute.
	 * @param actidino the new value of actidino
	 */
	public void setActidino(String actidino) {
		this.actidino.setValue(actidino);
	}
	/**
	 * Gets the reference for attribute curbalc.
	 * @return the curbalc attribute reference
	 */
	public ElementaryRangeReference getCurbalcReference() {
		return curbalc.getReference();
	}

	/**
	 * Getter for curbalc attribute.
	 * @return curbalc attribute
	 */
	public String getCurbalc() {
		return curbalc.getValue();
	}

	/**
	 * Setter for curbalc attribute.
	 * @param curbalc the new value of curbalc
	 */
	public void setCurbalc(String curbalc) {
		this.curbalc.setValue(curbalc);
	}
	/**
	 * Gets the reference for attribute curbalp.
	 * @return the curbalp attribute reference
	 */
	public ElementaryRangeReference getCurbalpReference() {
		return curbalp.getReference();
	}

	/**
	 * Getter for curbalp attribute.
	 * @return curbalp attribute
	 */
	public String getCurbalp() {
		return curbalp.getValue();
	}

	/**
	 * Setter for curbalp attribute.
	 * @param curbalp the new value of curbalp
	 */
	public void setCurbalp(String curbalp) {
		this.curbalp.setValue(curbalp);
	}
	/**
	 * Gets the reference for attribute curbalh.
	 * @return the curbalh attribute reference
	 */
	public ElementaryRangeReference getCurbalhReference() {
		return curbalh.getReference();
	}

	/**
	 * Getter for curbalh attribute.
	 * @return curbalh attribute
	 */
	public String getCurbalh() {
		return curbalh.getValue();
	}

	/**
	 * Setter for curbalh attribute.
	 * @param curbalh the new value of curbalh
	 */
	public void setCurbalh(String curbalh) {
		this.curbalh.setValue(curbalh);
	}
	/**
	 * Gets the reference for attribute curbalv.
	 * @return the curbalv attribute reference
	 */
	public ElementaryRangeReference getCurbalvReference() {
		return curbalv.getReference();
	}

	/**
	 * Getter for curbalv attribute.
	 * @return curbalv attribute
	 */
	public String getCurbalv() {
		return curbalv.getValue();
	}

	/**
	 * Setter for curbalv attribute.
	 * @param curbalv the new value of curbalv
	 */
	public void setCurbalv(String curbalv) {
		this.curbalv.setValue(curbalv);
	}
	/**
	 * Gets the reference for attribute curbalo.
	 * @return the curbalo attribute reference
	 */
	public ElementaryRangeReference getCurbaloReference() {
		return curbalo.getReference();
	}

	/**
	 * Getter for curbalo attribute.
	 * @return curbalo attribute
	 */
	public String getCurbalo() {
		return curbalo.getValue();
	}

	/**
	 * Setter for curbalo attribute.
	 * @param curbalo the new value of curbalo
	 */
	public void setCurbalo(String curbalo) {
		this.curbalo.setValue(curbalo);
	}
	/**
	 * Gets the reference for attribute confirmc.
	 * @return the confirmc attribute reference
	 */
	public ElementaryRangeReference getConfirmcReference() {
		return confirmc.getReference();
	}

	/**
	 * Getter for confirmc attribute.
	 * @return confirmc attribute
	 */
	public String getConfirmc() {
		return confirmc.getValue();
	}

	/**
	 * Setter for confirmc attribute.
	 * @param confirmc the new value of confirmc
	 */
	public void setConfirmc(String confirmc) {
		this.confirmc.setValue(confirmc);
	}
	/**
	 * Gets the reference for attribute confirmp.
	 * @return the confirmp attribute reference
	 */
	public ElementaryRangeReference getConfirmpReference() {
		return confirmp.getReference();
	}

	/**
	 * Getter for confirmp attribute.
	 * @return confirmp attribute
	 */
	public String getConfirmp() {
		return confirmp.getValue();
	}

	/**
	 * Setter for confirmp attribute.
	 * @param confirmp the new value of confirmp
	 */
	public void setConfirmp(String confirmp) {
		this.confirmp.setValue(confirmp);
	}
	/**
	 * Gets the reference for attribute confirmh.
	 * @return the confirmh attribute reference
	 */
	public ElementaryRangeReference getConfirmhReference() {
		return confirmh.getReference();
	}

	/**
	 * Getter for confirmh attribute.
	 * @return confirmh attribute
	 */
	public String getConfirmh() {
		return confirmh.getValue();
	}

	/**
	 * Setter for confirmh attribute.
	 * @param confirmh the new value of confirmh
	 */
	public void setConfirmh(String confirmh) {
		this.confirmh.setValue(confirmh);
	}
	/**
	 * Gets the reference for attribute confirmv.
	 * @return the confirmv attribute reference
	 */
	public ElementaryRangeReference getConfirmvReference() {
		return confirmv.getReference();
	}

	/**
	 * Getter for confirmv attribute.
	 * @return confirmv attribute
	 */
	public String getConfirmv() {
		return confirmv.getValue();
	}

	/**
	 * Setter for confirmv attribute.
	 * @param confirmv the new value of confirmv
	 */
	public void setConfirmv(String confirmv) {
		this.confirmv.setValue(confirmv);
	}
	/**
	 * Gets the reference for attribute confirmo.
	 * @return the confirmo attribute reference
	 */
	public ElementaryRangeReference getConfirmoReference() {
		return confirmo.getReference();
	}

	/**
	 * Getter for confirmo attribute.
	 * @return confirmo attribute
	 */
	public String getConfirmo() {
		return confirmo.getValue();
	}

	/**
	 * Setter for confirmo attribute.
	 * @param confirmo the new value of confirmo
	 */
	public void setConfirmo(String confirmo) {
		this.confirmo.setValue(confirmo);
	}
	/**
	 * Gets the reference for attribute errmsgc.
	 * @return the errmsgc attribute reference
	 */
	public ElementaryRangeReference getErrmsgcReference() {
		return errmsgc.getReference();
	}

	/**
	 * Getter for errmsgc attribute.
	 * @return errmsgc attribute
	 */
	public String getErrmsgc() {
		return errmsgc.getValue();
	}

	/**
	 * Setter for errmsgc attribute.
	 * @param errmsgc the new value of errmsgc
	 */
	public void setErrmsgc(String errmsgc) {
		this.errmsgc.setValue(errmsgc);
	}
	/**
	 * Gets the reference for attribute errmsgp.
	 * @return the errmsgp attribute reference
	 */
	public ElementaryRangeReference getErrmsgpReference() {
		return errmsgp.getReference();
	}

	/**
	 * Getter for errmsgp attribute.
	 * @return errmsgp attribute
	 */
	public String getErrmsgp() {
		return errmsgp.getValue();
	}

	/**
	 * Setter for errmsgp attribute.
	 * @param errmsgp the new value of errmsgp
	 */
	public void setErrmsgp(String errmsgp) {
		this.errmsgp.setValue(errmsgp);
	}
	/**
	 * Gets the reference for attribute errmsgh.
	 * @return the errmsgh attribute reference
	 */
	public ElementaryRangeReference getErrmsghReference() {
		return errmsgh.getReference();
	}

	/**
	 * Getter for errmsgh attribute.
	 * @return errmsgh attribute
	 */
	public String getErrmsgh() {
		return errmsgh.getValue();
	}

	/**
	 * Setter for errmsgh attribute.
	 * @param errmsgh the new value of errmsgh
	 */
	public void setErrmsgh(String errmsgh) {
		this.errmsgh.setValue(errmsgh);
	}
	/**
	 * Gets the reference for attribute errmsgv.
	 * @return the errmsgv attribute reference
	 */
	public ElementaryRangeReference getErrmsgvReference() {
		return errmsgv.getReference();
	}

	/**
	 * Getter for errmsgv attribute.
	 * @return errmsgv attribute
	 */
	public String getErrmsgv() {
		return errmsgv.getValue();
	}

	/**
	 * Setter for errmsgv attribute.
	 * @param errmsgv the new value of errmsgv
	 */
	public void setErrmsgv(String errmsgv) {
		this.errmsgv.setValue(errmsgv);
	}
	/**
	 * Gets the reference for attribute errmsgo.
	 * @return the errmsgo attribute reference
	 */
	public ElementaryRangeReference getErrmsgoReference() {
		return errmsgo.getReference();
	}

	/**
	 * Getter for errmsgo attribute.
	 * @return errmsgo attribute
	 */
	public String getErrmsgo() {
		return errmsgo.getValue();
	}

	/**
	 * Setter for errmsgo attribute.
	 * @param errmsgo the new value of errmsgo
	 */
	public void setErrmsgo(String errmsgo) {
		this.errmsgo.setValue(errmsgo);
	}
}
