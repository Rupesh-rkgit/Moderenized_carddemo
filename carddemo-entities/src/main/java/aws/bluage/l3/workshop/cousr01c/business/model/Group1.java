package aws.bluage.l3.workshop.cousr01c.business.model;

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
 * <p>About 'cousr1ai' field, <br>uml entity: aws.bluage.l3.workshop.cousr01c.business.model.Cousr1ai
 * <br></p>
 * 
 * <p>About 'cousr1ao' field, <br>uml entity: aws.bluage.l3.workshop.cousr01c.business.model.Cousr1ao
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
	private final Group cousr1ai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cousr1ai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(cousr1ai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(cousr1ai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(cousr1ai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(cousr1ai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(cousr1ai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(cousr1ai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(cousr1ai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(cousr1ai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(cousr1ai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(cousr1ai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(cousr1ai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(cousr1ai,new AlphanumericType(8));
	private final Elementary fnamel = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(cousr1ai);
	private final Elementary fnamef = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary fnamea = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary fnamei = new Elementary(cousr1ai,new AlphanumericType(20));
	private final Elementary lnamel = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(cousr1ai);
	private final Elementary lnamef = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary lnamea = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary lnamei = new Elementary(cousr1ai,new AlphanumericType(20));
	private final Elementary useridl = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(cousr1ai);
	private final Elementary useridf = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary userida = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary useridi = new Elementary(cousr1ai,new AlphanumericType(8));
	private final Elementary passwdl = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(cousr1ai);
	private final Elementary passwdf = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary passwda = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary passwdi = new Elementary(cousr1ai,new AlphanumericType(8));
	private final Elementary usrtypel = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(cousr1ai);
	private final Elementary usrtypef = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary usrtypea = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary usrtypei = new Elementary(cousr1ai,new AlphanumericType(1));
	private final Elementary errmsgl = new Elementary(cousr1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(cousr1ai);
	private final Elementary errmsgf = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary errmsga = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(cousr1ai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(cousr1ai,new AlphanumericType(78));
	private final Group cousr1ao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(cousr1ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(cousr1ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(cousr1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(cousr1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(cousr1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(cousr1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(cousr1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary fnamec = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary fnamep = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary fnameh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary fnamev = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary fnameo = new Elementary(cousr1ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary lnamec = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary lnamep = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary lnameh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary lnamev = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary lnameo = new Elementary(cousr1ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary useridc = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary useridp = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary useridh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary useridv = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary userido = new Elementary(cousr1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary passwdc = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary passwdp = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary passwdh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary passwdv = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary passwdo = new Elementary(cousr1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary usrtypec = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary usrtypep = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary usrtypeh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary usrtypev = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary usrtypeo = new Elementary(cousr1ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(cousr1ao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(cousr1ao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(cousr1ao,new AlphanumericType(78));
	

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
	 * Gets the reference for attribute cousr1ai.
	 * @return the cousr1ai attribute reference
	 */
	public RangeReference getCousr1aiReference() {
		return cousr1ai.getReference();
	}	
				
	/**
	 * Setter for cousr1ai .
	 */
   	public void setCousr1ai(RangeReference reference) {
       	cousr1ai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute fnamel.
	 * @return the fnamel attribute reference
	 */
	public ElementaryRangeReference getFnamelReference() {
		return fnamel.getReference();
	}

	/**
	 * Getter for fnamel attribute.
	 * @return fnamel attribute
	 */
	public int getFnamel() {
		return fnamel.getValue();
	}

	/**
	 * Setter for fnamel attribute.
	 * @param fnamel the new value of fnamel
	 */
	public void setFnamel(int fnamel) {
		this.fnamel.setValue(fnamel);
	}
	/**
	 * Gets the reference for attribute fnamef.
	 * @return the fnamef attribute reference
	 */
	public ElementaryRangeReference getFnamefReference() {
		return fnamef.getReference();
	}

	/**
	 * Getter for fnamef attribute.
	 * @return fnamef attribute
	 */
	public String getFnamef() {
		return fnamef.getValue();
	}

	/**
	 * Setter for fnamef attribute.
	 * @param fnamef the new value of fnamef
	 */
	public void setFnamef(String fnamef) {
		this.fnamef.setValue(fnamef);
	}
	/**
	 * Gets the reference for attribute fnamea.
	 * @return the fnamea attribute reference
	 */
	public ElementaryRangeReference getFnameaReference() {
		return fnamea.getReference();
	}

	/**
	 * Getter for fnamea attribute.
	 * @return fnamea attribute
	 */
	public String getFnamea() {
		return fnamea.getValue();
	}

	/**
	 * Setter for fnamea attribute.
	 * @param fnamea the new value of fnamea
	 */
	public void setFnamea(String fnamea) {
		this.fnamea.setValue(fnamea);
	}
	/**
	 * Gets the reference for attribute fnamei.
	 * @return the fnamei attribute reference
	 */
	public ElementaryRangeReference getFnameiReference() {
		return fnamei.getReference();
	}

	/**
	 * Getter for fnamei attribute.
	 * @return fnamei attribute
	 */
	public String getFnamei() {
		return fnamei.getValue();
	}

	/**
	 * Setter for fnamei attribute.
	 * @param fnamei the new value of fnamei
	 */
	public void setFnamei(String fnamei) {
		this.fnamei.setValue(fnamei);
	}
	/**
	 * Gets the reference for attribute lnamel.
	 * @return the lnamel attribute reference
	 */
	public ElementaryRangeReference getLnamelReference() {
		return lnamel.getReference();
	}

	/**
	 * Getter for lnamel attribute.
	 * @return lnamel attribute
	 */
	public int getLnamel() {
		return lnamel.getValue();
	}

	/**
	 * Setter for lnamel attribute.
	 * @param lnamel the new value of lnamel
	 */
	public void setLnamel(int lnamel) {
		this.lnamel.setValue(lnamel);
	}
	/**
	 * Gets the reference for attribute lnamef.
	 * @return the lnamef attribute reference
	 */
	public ElementaryRangeReference getLnamefReference() {
		return lnamef.getReference();
	}

	/**
	 * Getter for lnamef attribute.
	 * @return lnamef attribute
	 */
	public String getLnamef() {
		return lnamef.getValue();
	}

	/**
	 * Setter for lnamef attribute.
	 * @param lnamef the new value of lnamef
	 */
	public void setLnamef(String lnamef) {
		this.lnamef.setValue(lnamef);
	}
	/**
	 * Gets the reference for attribute lnamea.
	 * @return the lnamea attribute reference
	 */
	public ElementaryRangeReference getLnameaReference() {
		return lnamea.getReference();
	}

	/**
	 * Getter for lnamea attribute.
	 * @return lnamea attribute
	 */
	public String getLnamea() {
		return lnamea.getValue();
	}

	/**
	 * Setter for lnamea attribute.
	 * @param lnamea the new value of lnamea
	 */
	public void setLnamea(String lnamea) {
		this.lnamea.setValue(lnamea);
	}
	/**
	 * Gets the reference for attribute lnamei.
	 * @return the lnamei attribute reference
	 */
	public ElementaryRangeReference getLnameiReference() {
		return lnamei.getReference();
	}

	/**
	 * Getter for lnamei attribute.
	 * @return lnamei attribute
	 */
	public String getLnamei() {
		return lnamei.getValue();
	}

	/**
	 * Setter for lnamei attribute.
	 * @param lnamei the new value of lnamei
	 */
	public void setLnamei(String lnamei) {
		this.lnamei.setValue(lnamei);
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
	 * Gets the reference for attribute usrtypel.
	 * @return the usrtypel attribute reference
	 */
	public ElementaryRangeReference getUsrtypelReference() {
		return usrtypel.getReference();
	}

	/**
	 * Getter for usrtypel attribute.
	 * @return usrtypel attribute
	 */
	public int getUsrtypel() {
		return usrtypel.getValue();
	}

	/**
	 * Setter for usrtypel attribute.
	 * @param usrtypel the new value of usrtypel
	 */
	public void setUsrtypel(int usrtypel) {
		this.usrtypel.setValue(usrtypel);
	}
	/**
	 * Gets the reference for attribute usrtypef.
	 * @return the usrtypef attribute reference
	 */
	public ElementaryRangeReference getUsrtypefReference() {
		return usrtypef.getReference();
	}

	/**
	 * Getter for usrtypef attribute.
	 * @return usrtypef attribute
	 */
	public String getUsrtypef() {
		return usrtypef.getValue();
	}

	/**
	 * Setter for usrtypef attribute.
	 * @param usrtypef the new value of usrtypef
	 */
	public void setUsrtypef(String usrtypef) {
		this.usrtypef.setValue(usrtypef);
	}
	/**
	 * Gets the reference for attribute usrtypea.
	 * @return the usrtypea attribute reference
	 */
	public ElementaryRangeReference getUsrtypeaReference() {
		return usrtypea.getReference();
	}

	/**
	 * Getter for usrtypea attribute.
	 * @return usrtypea attribute
	 */
	public String getUsrtypea() {
		return usrtypea.getValue();
	}

	/**
	 * Setter for usrtypea attribute.
	 * @param usrtypea the new value of usrtypea
	 */
	public void setUsrtypea(String usrtypea) {
		this.usrtypea.setValue(usrtypea);
	}
	/**
	 * Gets the reference for attribute usrtypei.
	 * @return the usrtypei attribute reference
	 */
	public ElementaryRangeReference getUsrtypeiReference() {
		return usrtypei.getReference();
	}

	/**
	 * Getter for usrtypei attribute.
	 * @return usrtypei attribute
	 */
	public String getUsrtypei() {
		return usrtypei.getValue();
	}

	/**
	 * Setter for usrtypei attribute.
	 * @param usrtypei the new value of usrtypei
	 */
	public void setUsrtypei(String usrtypei) {
		this.usrtypei.setValue(usrtypei);
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
	 * Gets the reference for attribute cousr1ao.
	 * @return the cousr1ao attribute reference
	 */
	public RangeReference getCousr1aoReference() {
		return cousr1ao.getReference();
	}	
				
	/**
	 * Setter for cousr1ao .
	 */
   	public void setCousr1ao(RangeReference reference) {
       	cousr1ao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute fnamec.
	 * @return the fnamec attribute reference
	 */
	public ElementaryRangeReference getFnamecReference() {
		return fnamec.getReference();
	}

	/**
	 * Getter for fnamec attribute.
	 * @return fnamec attribute
	 */
	public String getFnamec() {
		return fnamec.getValue();
	}

	/**
	 * Setter for fnamec attribute.
	 * @param fnamec the new value of fnamec
	 */
	public void setFnamec(String fnamec) {
		this.fnamec.setValue(fnamec);
	}
	/**
	 * Gets the reference for attribute fnamep.
	 * @return the fnamep attribute reference
	 */
	public ElementaryRangeReference getFnamepReference() {
		return fnamep.getReference();
	}

	/**
	 * Getter for fnamep attribute.
	 * @return fnamep attribute
	 */
	public String getFnamep() {
		return fnamep.getValue();
	}

	/**
	 * Setter for fnamep attribute.
	 * @param fnamep the new value of fnamep
	 */
	public void setFnamep(String fnamep) {
		this.fnamep.setValue(fnamep);
	}
	/**
	 * Gets the reference for attribute fnameh.
	 * @return the fnameh attribute reference
	 */
	public ElementaryRangeReference getFnamehReference() {
		return fnameh.getReference();
	}

	/**
	 * Getter for fnameh attribute.
	 * @return fnameh attribute
	 */
	public String getFnameh() {
		return fnameh.getValue();
	}

	/**
	 * Setter for fnameh attribute.
	 * @param fnameh the new value of fnameh
	 */
	public void setFnameh(String fnameh) {
		this.fnameh.setValue(fnameh);
	}
	/**
	 * Gets the reference for attribute fnamev.
	 * @return the fnamev attribute reference
	 */
	public ElementaryRangeReference getFnamevReference() {
		return fnamev.getReference();
	}

	/**
	 * Getter for fnamev attribute.
	 * @return fnamev attribute
	 */
	public String getFnamev() {
		return fnamev.getValue();
	}

	/**
	 * Setter for fnamev attribute.
	 * @param fnamev the new value of fnamev
	 */
	public void setFnamev(String fnamev) {
		this.fnamev.setValue(fnamev);
	}
	/**
	 * Gets the reference for attribute fnameo.
	 * @return the fnameo attribute reference
	 */
	public ElementaryRangeReference getFnameoReference() {
		return fnameo.getReference();
	}

	/**
	 * Getter for fnameo attribute.
	 * @return fnameo attribute
	 */
	public String getFnameo() {
		return fnameo.getValue();
	}

	/**
	 * Setter for fnameo attribute.
	 * @param fnameo the new value of fnameo
	 */
	public void setFnameo(String fnameo) {
		this.fnameo.setValue(fnameo);
	}
	/**
	 * Gets the reference for attribute lnamec.
	 * @return the lnamec attribute reference
	 */
	public ElementaryRangeReference getLnamecReference() {
		return lnamec.getReference();
	}

	/**
	 * Getter for lnamec attribute.
	 * @return lnamec attribute
	 */
	public String getLnamec() {
		return lnamec.getValue();
	}

	/**
	 * Setter for lnamec attribute.
	 * @param lnamec the new value of lnamec
	 */
	public void setLnamec(String lnamec) {
		this.lnamec.setValue(lnamec);
	}
	/**
	 * Gets the reference for attribute lnamep.
	 * @return the lnamep attribute reference
	 */
	public ElementaryRangeReference getLnamepReference() {
		return lnamep.getReference();
	}

	/**
	 * Getter for lnamep attribute.
	 * @return lnamep attribute
	 */
	public String getLnamep() {
		return lnamep.getValue();
	}

	/**
	 * Setter for lnamep attribute.
	 * @param lnamep the new value of lnamep
	 */
	public void setLnamep(String lnamep) {
		this.lnamep.setValue(lnamep);
	}
	/**
	 * Gets the reference for attribute lnameh.
	 * @return the lnameh attribute reference
	 */
	public ElementaryRangeReference getLnamehReference() {
		return lnameh.getReference();
	}

	/**
	 * Getter for lnameh attribute.
	 * @return lnameh attribute
	 */
	public String getLnameh() {
		return lnameh.getValue();
	}

	/**
	 * Setter for lnameh attribute.
	 * @param lnameh the new value of lnameh
	 */
	public void setLnameh(String lnameh) {
		this.lnameh.setValue(lnameh);
	}
	/**
	 * Gets the reference for attribute lnamev.
	 * @return the lnamev attribute reference
	 */
	public ElementaryRangeReference getLnamevReference() {
		return lnamev.getReference();
	}

	/**
	 * Getter for lnamev attribute.
	 * @return lnamev attribute
	 */
	public String getLnamev() {
		return lnamev.getValue();
	}

	/**
	 * Setter for lnamev attribute.
	 * @param lnamev the new value of lnamev
	 */
	public void setLnamev(String lnamev) {
		this.lnamev.setValue(lnamev);
	}
	/**
	 * Gets the reference for attribute lnameo.
	 * @return the lnameo attribute reference
	 */
	public ElementaryRangeReference getLnameoReference() {
		return lnameo.getReference();
	}

	/**
	 * Getter for lnameo attribute.
	 * @return lnameo attribute
	 */
	public String getLnameo() {
		return lnameo.getValue();
	}

	/**
	 * Setter for lnameo attribute.
	 * @param lnameo the new value of lnameo
	 */
	public void setLnameo(String lnameo) {
		this.lnameo.setValue(lnameo);
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
	 * Gets the reference for attribute usrtypec.
	 * @return the usrtypec attribute reference
	 */
	public ElementaryRangeReference getUsrtypecReference() {
		return usrtypec.getReference();
	}

	/**
	 * Getter for usrtypec attribute.
	 * @return usrtypec attribute
	 */
	public String getUsrtypec() {
		return usrtypec.getValue();
	}

	/**
	 * Setter for usrtypec attribute.
	 * @param usrtypec the new value of usrtypec
	 */
	public void setUsrtypec(String usrtypec) {
		this.usrtypec.setValue(usrtypec);
	}
	/**
	 * Gets the reference for attribute usrtypep.
	 * @return the usrtypep attribute reference
	 */
	public ElementaryRangeReference getUsrtypepReference() {
		return usrtypep.getReference();
	}

	/**
	 * Getter for usrtypep attribute.
	 * @return usrtypep attribute
	 */
	public String getUsrtypep() {
		return usrtypep.getValue();
	}

	/**
	 * Setter for usrtypep attribute.
	 * @param usrtypep the new value of usrtypep
	 */
	public void setUsrtypep(String usrtypep) {
		this.usrtypep.setValue(usrtypep);
	}
	/**
	 * Gets the reference for attribute usrtypeh.
	 * @return the usrtypeh attribute reference
	 */
	public ElementaryRangeReference getUsrtypehReference() {
		return usrtypeh.getReference();
	}

	/**
	 * Getter for usrtypeh attribute.
	 * @return usrtypeh attribute
	 */
	public String getUsrtypeh() {
		return usrtypeh.getValue();
	}

	/**
	 * Setter for usrtypeh attribute.
	 * @param usrtypeh the new value of usrtypeh
	 */
	public void setUsrtypeh(String usrtypeh) {
		this.usrtypeh.setValue(usrtypeh);
	}
	/**
	 * Gets the reference for attribute usrtypev.
	 * @return the usrtypev attribute reference
	 */
	public ElementaryRangeReference getUsrtypevReference() {
		return usrtypev.getReference();
	}

	/**
	 * Getter for usrtypev attribute.
	 * @return usrtypev attribute
	 */
	public String getUsrtypev() {
		return usrtypev.getValue();
	}

	/**
	 * Setter for usrtypev attribute.
	 * @param usrtypev the new value of usrtypev
	 */
	public void setUsrtypev(String usrtypev) {
		this.usrtypev.setValue(usrtypev);
	}
	/**
	 * Gets the reference for attribute usrtypeo.
	 * @return the usrtypeo attribute reference
	 */
	public ElementaryRangeReference getUsrtypeoReference() {
		return usrtypeo.getReference();
	}

	/**
	 * Getter for usrtypeo attribute.
	 * @return usrtypeo attribute
	 */
	public String getUsrtypeo() {
		return usrtypeo.getValue();
	}

	/**
	 * Setter for usrtypeo attribute.
	 * @param usrtypeo the new value of usrtypeo
	 */
	public void setUsrtypeo(String usrtypeo) {
		this.usrtypeo.setValue(usrtypeo);
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
