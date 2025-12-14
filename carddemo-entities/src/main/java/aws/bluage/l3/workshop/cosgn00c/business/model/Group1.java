package aws.bluage.l3.workshop.cosgn00c.business.model;

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
 * <p>About 'cosgn0ai' field, <br>uml entity: aws.bluage.l3.workshop.cosgn00c.business.model.Cosgn0ai
 * <br></p>
 * 
 * <p>About 'cosgn0ao' field, <br>uml entity: aws.bluage.l3.workshop.cosgn00c.business.model.Cosgn0ao
 * <br></p>
 * 
 * @see RecordEntity
 */
public class Group1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Union union = new Union(root);
	
	/**
	 * 
	 * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:57 CDT
	 * 
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
	private final Group cosgn0ai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cosgn0ai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(cosgn0ai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(cosgn0ai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(cosgn0ai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(cosgn0ai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(cosgn0ai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(cosgn0ai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(cosgn0ai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(cosgn0ai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(cosgn0ai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(cosgn0ai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(cosgn0ai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(cosgn0ai,new AlphanumericType(9));
	private final Elementary applidl = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(cosgn0ai);
	private final Elementary applidf = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary applida = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary applidi = new Elementary(cosgn0ai,new AlphanumericType(8));
	private final Elementary sysidl = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(cosgn0ai);
	private final Elementary sysidf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary sysida = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary sysidi = new Elementary(cosgn0ai,new AlphanumericType(8));
	private final Elementary useridl = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(cosgn0ai);
	private final Elementary useridf = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary userida = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary useridi = new Elementary(cosgn0ai,new AlphanumericType(8));
	private final Elementary passwdl = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(cosgn0ai);
	private final Elementary passwdf = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary passwda = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary passwdi = new Elementary(cosgn0ai,new AlphanumericType(8));
	private final Elementary errmsgl = new Elementary(cosgn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(cosgn0ai);
	private final Elementary errmsgf = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary errmsga = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cosgn0ai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(cosgn0ai,new AlphanumericType(78));
	private final Group cosgn0ao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(cosgn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(cosgn0ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(cosgn0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(cosgn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(cosgn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(cosgn0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(cosgn0ao,new AlphanumericType(9));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary applidc = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary applidp = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary applidh = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary applidv = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary applido = new Elementary(cosgn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary sysidc = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary sysidp = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary sysidh = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary sysidv = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary sysido = new Elementary(cosgn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary useridc = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary useridp = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary useridh = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary useridv = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary userido = new Elementary(cosgn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary passwdc = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary passwdp = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary passwdh = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary passwdv = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary passwdo = new Elementary(cosgn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(cosgn0ao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(cosgn0ao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(cosgn0ao,new AlphanumericType(78));
	

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
	 * Gets the reference for attribute cosgn0ai.
	 * @return the cosgn0ai attribute reference
	 */
	public RangeReference getCosgn0aiReference() {
		return cosgn0ai.getReference();
	}	
				
	/**
	 * Setter for cosgn0ai .
	 */
   	public void setCosgn0ai(RangeReference reference) {
       	cosgn0ai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute applidl.
	 * @return the applidl attribute reference
	 */
	public ElementaryRangeReference getApplidlReference() {
		return applidl.getReference();
	}

	/**
	 * Getter for applidl attribute.
	 * @return applidl attribute
	 */
	public int getApplidl() {
		return applidl.getValue();
	}

	/**
	 * Setter for applidl attribute.
	 * @param applidl the new value of applidl
	 */
	public void setApplidl(int applidl) {
		this.applidl.setValue(applidl);
	}
	/**
	 * Gets the reference for attribute applidf.
	 * @return the applidf attribute reference
	 */
	public ElementaryRangeReference getApplidfReference() {
		return applidf.getReference();
	}

	/**
	 * Getter for applidf attribute.
	 * @return applidf attribute
	 */
	public String getApplidf() {
		return applidf.getValue();
	}

	/**
	 * Setter for applidf attribute.
	 * @param applidf the new value of applidf
	 */
	public void setApplidf(String applidf) {
		this.applidf.setValue(applidf);
	}
	/**
	 * Gets the reference for attribute applida.
	 * @return the applida attribute reference
	 */
	public ElementaryRangeReference getApplidaReference() {
		return applida.getReference();
	}

	/**
	 * Getter for applida attribute.
	 * @return applida attribute
	 */
	public String getApplida() {
		return applida.getValue();
	}

	/**
	 * Setter for applida attribute.
	 * @param applida the new value of applida
	 */
	public void setApplida(String applida) {
		this.applida.setValue(applida);
	}
	/**
	 * Gets the reference for attribute applidi.
	 * @return the applidi attribute reference
	 */
	public ElementaryRangeReference getApplidiReference() {
		return applidi.getReference();
	}

	/**
	 * Getter for applidi attribute.
	 * @return applidi attribute
	 */
	public String getApplidi() {
		return applidi.getValue();
	}

	/**
	 * Setter for applidi attribute.
	 * @param applidi the new value of applidi
	 */
	public void setApplidi(String applidi) {
		this.applidi.setValue(applidi);
	}
	/**
	 * Gets the reference for attribute sysidl.
	 * @return the sysidl attribute reference
	 */
	public ElementaryRangeReference getSysidlReference() {
		return sysidl.getReference();
	}

	/**
	 * Getter for sysidl attribute.
	 * @return sysidl attribute
	 */
	public int getSysidl() {
		return sysidl.getValue();
	}

	/**
	 * Setter for sysidl attribute.
	 * @param sysidl the new value of sysidl
	 */
	public void setSysidl(int sysidl) {
		this.sysidl.setValue(sysidl);
	}
	/**
	 * Gets the reference for attribute sysidf.
	 * @return the sysidf attribute reference
	 */
	public ElementaryRangeReference getSysidfReference() {
		return sysidf.getReference();
	}

	/**
	 * Getter for sysidf attribute.
	 * @return sysidf attribute
	 */
	public String getSysidf() {
		return sysidf.getValue();
	}

	/**
	 * Setter for sysidf attribute.
	 * @param sysidf the new value of sysidf
	 */
	public void setSysidf(String sysidf) {
		this.sysidf.setValue(sysidf);
	}
	/**
	 * Gets the reference for attribute sysida.
	 * @return the sysida attribute reference
	 */
	public ElementaryRangeReference getSysidaReference() {
		return sysida.getReference();
	}

	/**
	 * Getter for sysida attribute.
	 * @return sysida attribute
	 */
	public String getSysida() {
		return sysida.getValue();
	}

	/**
	 * Setter for sysida attribute.
	 * @param sysida the new value of sysida
	 */
	public void setSysida(String sysida) {
		this.sysida.setValue(sysida);
	}
	/**
	 * Gets the reference for attribute sysidi.
	 * @return the sysidi attribute reference
	 */
	public ElementaryRangeReference getSysidiReference() {
		return sysidi.getReference();
	}

	/**
	 * Getter for sysidi attribute.
	 * @return sysidi attribute
	 */
	public String getSysidi() {
		return sysidi.getValue();
	}

	/**
	 * Setter for sysidi attribute.
	 * @param sysidi the new value of sysidi
	 */
	public void setSysidi(String sysidi) {
		this.sysidi.setValue(sysidi);
	}
	/**
	 * Gets the reference for attribute useridl.
	 * @return the useridl attribute reference
	 */
	public ElementaryRangeReference getUseridlReference() {
		return useridl.getReference();
	}

	/**
	 * Getter for useridl attribute.
	 * @return useridl attribute
	 */
	public int getUseridl() {
		return useridl.getValue();
	}

	/**
	 * Setter for useridl attribute.
	 * @param useridl the new value of useridl
	 */
	public void setUseridl(int useridl) {
		this.useridl.setValue(useridl);
	}
	/**
	 * Gets the reference for attribute useridf.
	 * @return the useridf attribute reference
	 */
	public ElementaryRangeReference getUseridfReference() {
		return useridf.getReference();
	}

	/**
	 * Getter for useridf attribute.
	 * @return useridf attribute
	 */
	public String getUseridf() {
		return useridf.getValue();
	}

	/**
	 * Setter for useridf attribute.
	 * @param useridf the new value of useridf
	 */
	public void setUseridf(String useridf) {
		this.useridf.setValue(useridf);
	}
	/**
	 * Gets the reference for attribute userida.
	 * @return the userida attribute reference
	 */
	public ElementaryRangeReference getUseridaReference() {
		return userida.getReference();
	}

	/**
	 * Getter for userida attribute.
	 * @return userida attribute
	 */
	public String getUserida() {
		return userida.getValue();
	}

	/**
	 * Setter for userida attribute.
	 * @param userida the new value of userida
	 */
	public void setUserida(String userida) {
		this.userida.setValue(userida);
	}
	/**
	 * Gets the reference for attribute useridi.
	 * @return the useridi attribute reference
	 */
	public ElementaryRangeReference getUseridiReference() {
		return useridi.getReference();
	}

	/**
	 * Getter for useridi attribute.
	 * @return useridi attribute
	 */
	public String getUseridi() {
		return useridi.getValue();
	}

	/**
	 * Setter for useridi attribute.
	 * @param useridi the new value of useridi
	 */
	public void setUseridi(String useridi) {
		this.useridi.setValue(useridi);
	}
	/**
	 * Gets the reference for attribute passwdl.
	 * @return the passwdl attribute reference
	 */
	public ElementaryRangeReference getPasswdlReference() {
		return passwdl.getReference();
	}

	/**
	 * Getter for passwdl attribute.
	 * @return passwdl attribute
	 */
	public int getPasswdl() {
		return passwdl.getValue();
	}

	/**
	 * Setter for passwdl attribute.
	 * @param passwdl the new value of passwdl
	 */
	public void setPasswdl(int passwdl) {
		this.passwdl.setValue(passwdl);
	}
	/**
	 * Gets the reference for attribute passwdf.
	 * @return the passwdf attribute reference
	 */
	public ElementaryRangeReference getPasswdfReference() {
		return passwdf.getReference();
	}

	/**
	 * Getter for passwdf attribute.
	 * @return passwdf attribute
	 */
	public String getPasswdf() {
		return passwdf.getValue();
	}

	/**
	 * Setter for passwdf attribute.
	 * @param passwdf the new value of passwdf
	 */
	public void setPasswdf(String passwdf) {
		this.passwdf.setValue(passwdf);
	}
	/**
	 * Gets the reference for attribute passwda.
	 * @return the passwda attribute reference
	 */
	public ElementaryRangeReference getPasswdaReference() {
		return passwda.getReference();
	}

	/**
	 * Getter for passwda attribute.
	 * @return passwda attribute
	 */
	public String getPasswda() {
		return passwda.getValue();
	}

	/**
	 * Setter for passwda attribute.
	 * @param passwda the new value of passwda
	 */
	public void setPasswda(String passwda) {
		this.passwda.setValue(passwda);
	}
	/**
	 * Gets the reference for attribute passwdi.
	 * @return the passwdi attribute reference
	 */
	public ElementaryRangeReference getPasswdiReference() {
		return passwdi.getReference();
	}

	/**
	 * Getter for passwdi attribute.
	 * @return passwdi attribute
	 */
	public String getPasswdi() {
		return passwdi.getValue();
	}

	/**
	 * Setter for passwdi attribute.
	 * @param passwdi the new value of passwdi
	 */
	public void setPasswdi(String passwdi) {
		this.passwdi.setValue(passwdi);
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
	 * Gets the reference for attribute cosgn0ao.
	 * @return the cosgn0ao attribute reference
	 */
	public RangeReference getCosgn0aoReference() {
		return cosgn0ao.getReference();
	}	
				
	/**
	 * Setter for cosgn0ao .
	 */
   	public void setCosgn0ao(RangeReference reference) {
       	cosgn0ao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute applidc.
	 * @return the applidc attribute reference
	 */
	public ElementaryRangeReference getApplidcReference() {
		return applidc.getReference();
	}

	/**
	 * Getter for applidc attribute.
	 * @return applidc attribute
	 */
	public String getApplidc() {
		return applidc.getValue();
	}

	/**
	 * Setter for applidc attribute.
	 * @param applidc the new value of applidc
	 */
	public void setApplidc(String applidc) {
		this.applidc.setValue(applidc);
	}
	/**
	 * Gets the reference for attribute applidp.
	 * @return the applidp attribute reference
	 */
	public ElementaryRangeReference getApplidpReference() {
		return applidp.getReference();
	}

	/**
	 * Getter for applidp attribute.
	 * @return applidp attribute
	 */
	public String getApplidp() {
		return applidp.getValue();
	}

	/**
	 * Setter for applidp attribute.
	 * @param applidp the new value of applidp
	 */
	public void setApplidp(String applidp) {
		this.applidp.setValue(applidp);
	}
	/**
	 * Gets the reference for attribute applidh.
	 * @return the applidh attribute reference
	 */
	public ElementaryRangeReference getApplidhReference() {
		return applidh.getReference();
	}

	/**
	 * Getter for applidh attribute.
	 * @return applidh attribute
	 */
	public String getApplidh() {
		return applidh.getValue();
	}

	/**
	 * Setter for applidh attribute.
	 * @param applidh the new value of applidh
	 */
	public void setApplidh(String applidh) {
		this.applidh.setValue(applidh);
	}
	/**
	 * Gets the reference for attribute applidv.
	 * @return the applidv attribute reference
	 */
	public ElementaryRangeReference getApplidvReference() {
		return applidv.getReference();
	}

	/**
	 * Getter for applidv attribute.
	 * @return applidv attribute
	 */
	public String getApplidv() {
		return applidv.getValue();
	}

	/**
	 * Setter for applidv attribute.
	 * @param applidv the new value of applidv
	 */
	public void setApplidv(String applidv) {
		this.applidv.setValue(applidv);
	}
	/**
	 * Gets the reference for attribute applido.
	 * @return the applido attribute reference
	 */
	public ElementaryRangeReference getApplidoReference() {
		return applido.getReference();
	}

	/**
	 * Getter for applido attribute.
	 * @return applido attribute
	 */
	public String getApplido() {
		return applido.getValue();
	}

	/**
	 * Setter for applido attribute.
	 * @param applido the new value of applido
	 */
	public void setApplido(String applido) {
		this.applido.setValue(applido);
	}
	/**
	 * Gets the reference for attribute sysidc.
	 * @return the sysidc attribute reference
	 */
	public ElementaryRangeReference getSysidcReference() {
		return sysidc.getReference();
	}

	/**
	 * Getter for sysidc attribute.
	 * @return sysidc attribute
	 */
	public String getSysidc() {
		return sysidc.getValue();
	}

	/**
	 * Setter for sysidc attribute.
	 * @param sysidc the new value of sysidc
	 */
	public void setSysidc(String sysidc) {
		this.sysidc.setValue(sysidc);
	}
	/**
	 * Gets the reference for attribute sysidp.
	 * @return the sysidp attribute reference
	 */
	public ElementaryRangeReference getSysidpReference() {
		return sysidp.getReference();
	}

	/**
	 * Getter for sysidp attribute.
	 * @return sysidp attribute
	 */
	public String getSysidp() {
		return sysidp.getValue();
	}

	/**
	 * Setter for sysidp attribute.
	 * @param sysidp the new value of sysidp
	 */
	public void setSysidp(String sysidp) {
		this.sysidp.setValue(sysidp);
	}
	/**
	 * Gets the reference for attribute sysidh.
	 * @return the sysidh attribute reference
	 */
	public ElementaryRangeReference getSysidhReference() {
		return sysidh.getReference();
	}

	/**
	 * Getter for sysidh attribute.
	 * @return sysidh attribute
	 */
	public String getSysidh() {
		return sysidh.getValue();
	}

	/**
	 * Setter for sysidh attribute.
	 * @param sysidh the new value of sysidh
	 */
	public void setSysidh(String sysidh) {
		this.sysidh.setValue(sysidh);
	}
	/**
	 * Gets the reference for attribute sysidv.
	 * @return the sysidv attribute reference
	 */
	public ElementaryRangeReference getSysidvReference() {
		return sysidv.getReference();
	}

	/**
	 * Getter for sysidv attribute.
	 * @return sysidv attribute
	 */
	public String getSysidv() {
		return sysidv.getValue();
	}

	/**
	 * Setter for sysidv attribute.
	 * @param sysidv the new value of sysidv
	 */
	public void setSysidv(String sysidv) {
		this.sysidv.setValue(sysidv);
	}
	/**
	 * Gets the reference for attribute sysido.
	 * @return the sysido attribute reference
	 */
	public ElementaryRangeReference getSysidoReference() {
		return sysido.getReference();
	}

	/**
	 * Getter for sysido attribute.
	 * @return sysido attribute
	 */
	public String getSysido() {
		return sysido.getValue();
	}

	/**
	 * Setter for sysido attribute.
	 * @param sysido the new value of sysido
	 */
	public void setSysido(String sysido) {
		this.sysido.setValue(sysido);
	}
	/**
	 * Gets the reference for attribute useridc.
	 * @return the useridc attribute reference
	 */
	public ElementaryRangeReference getUseridcReference() {
		return useridc.getReference();
	}

	/**
	 * Getter for useridc attribute.
	 * @return useridc attribute
	 */
	public String getUseridc() {
		return useridc.getValue();
	}

	/**
	 * Setter for useridc attribute.
	 * @param useridc the new value of useridc
	 */
	public void setUseridc(String useridc) {
		this.useridc.setValue(useridc);
	}
	/**
	 * Gets the reference for attribute useridp.
	 * @return the useridp attribute reference
	 */
	public ElementaryRangeReference getUseridpReference() {
		return useridp.getReference();
	}

	/**
	 * Getter for useridp attribute.
	 * @return useridp attribute
	 */
	public String getUseridp() {
		return useridp.getValue();
	}

	/**
	 * Setter for useridp attribute.
	 * @param useridp the new value of useridp
	 */
	public void setUseridp(String useridp) {
		this.useridp.setValue(useridp);
	}
	/**
	 * Gets the reference for attribute useridh.
	 * @return the useridh attribute reference
	 */
	public ElementaryRangeReference getUseridhReference() {
		return useridh.getReference();
	}

	/**
	 * Getter for useridh attribute.
	 * @return useridh attribute
	 */
	public String getUseridh() {
		return useridh.getValue();
	}

	/**
	 * Setter for useridh attribute.
	 * @param useridh the new value of useridh
	 */
	public void setUseridh(String useridh) {
		this.useridh.setValue(useridh);
	}
	/**
	 * Gets the reference for attribute useridv.
	 * @return the useridv attribute reference
	 */
	public ElementaryRangeReference getUseridvReference() {
		return useridv.getReference();
	}

	/**
	 * Getter for useridv attribute.
	 * @return useridv attribute
	 */
	public String getUseridv() {
		return useridv.getValue();
	}

	/**
	 * Setter for useridv attribute.
	 * @param useridv the new value of useridv
	 */
	public void setUseridv(String useridv) {
		this.useridv.setValue(useridv);
	}
	/**
	 * Gets the reference for attribute userido.
	 * @return the userido attribute reference
	 */
	public ElementaryRangeReference getUseridoReference() {
		return userido.getReference();
	}

	/**
	 * Getter for userido attribute.
	 * @return userido attribute
	 */
	public String getUserido() {
		return userido.getValue();
	}

	/**
	 * Setter for userido attribute.
	 * @param userido the new value of userido
	 */
	public void setUserido(String userido) {
		this.userido.setValue(userido);
	}
	/**
	 * Gets the reference for attribute passwdc.
	 * @return the passwdc attribute reference
	 */
	public ElementaryRangeReference getPasswdcReference() {
		return passwdc.getReference();
	}

	/**
	 * Getter for passwdc attribute.
	 * @return passwdc attribute
	 */
	public String getPasswdc() {
		return passwdc.getValue();
	}

	/**
	 * Setter for passwdc attribute.
	 * @param passwdc the new value of passwdc
	 */
	public void setPasswdc(String passwdc) {
		this.passwdc.setValue(passwdc);
	}
	/**
	 * Gets the reference for attribute passwdp.
	 * @return the passwdp attribute reference
	 */
	public ElementaryRangeReference getPasswdpReference() {
		return passwdp.getReference();
	}

	/**
	 * Getter for passwdp attribute.
	 * @return passwdp attribute
	 */
	public String getPasswdp() {
		return passwdp.getValue();
	}

	/**
	 * Setter for passwdp attribute.
	 * @param passwdp the new value of passwdp
	 */
	public void setPasswdp(String passwdp) {
		this.passwdp.setValue(passwdp);
	}
	/**
	 * Gets the reference for attribute passwdh.
	 * @return the passwdh attribute reference
	 */
	public ElementaryRangeReference getPasswdhReference() {
		return passwdh.getReference();
	}

	/**
	 * Getter for passwdh attribute.
	 * @return passwdh attribute
	 */
	public String getPasswdh() {
		return passwdh.getValue();
	}

	/**
	 * Setter for passwdh attribute.
	 * @param passwdh the new value of passwdh
	 */
	public void setPasswdh(String passwdh) {
		this.passwdh.setValue(passwdh);
	}
	/**
	 * Gets the reference for attribute passwdv.
	 * @return the passwdv attribute reference
	 */
	public ElementaryRangeReference getPasswdvReference() {
		return passwdv.getReference();
	}

	/**
	 * Getter for passwdv attribute.
	 * @return passwdv attribute
	 */
	public String getPasswdv() {
		return passwdv.getValue();
	}

	/**
	 * Setter for passwdv attribute.
	 * @param passwdv the new value of passwdv
	 */
	public void setPasswdv(String passwdv) {
		this.passwdv.setValue(passwdv);
	}
	/**
	 * Gets the reference for attribute passwdo.
	 * @return the passwdo attribute reference
	 */
	public ElementaryRangeReference getPasswdoReference() {
		return passwdo.getReference();
	}

	/**
	 * Getter for passwdo attribute.
	 * @return passwdo attribute
	 */
	public String getPasswdo() {
		return passwdo.getValue();
	}

	/**
	 * Setter for passwdo attribute.
	 * @param passwdo the new value of passwdo
	 */
	public void setPasswdo(String passwdo) {
		this.passwdo.setValue(passwdo);
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
