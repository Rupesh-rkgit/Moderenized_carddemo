package aws.bluage.l3.workshop.cocrdslc.business.model;

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
 * <p>About 'ccrdslai' field, <br>uml entity: aws.bluage.l3.workshop.cocrdslc.business.model.Ccrdslai
 * <br></p>
 * 
 * <p>About 'ccrdslao' field, <br>uml entity: aws.bluage.l3.workshop.cocrdslc.business.model.Ccrdslao
 * <br></p>
 * 
 * @see RecordEntity
 */
public class Group1 extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Union union = new Union(root);
	
	/**
	 * 
	 * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT
	 * 
	 * Credit Card Search Screen Layout
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
	private final Group ccrdslai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(ccrdslai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(ccrdslai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(ccrdslai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(ccrdslai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(ccrdslai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(ccrdslai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(ccrdslai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(ccrdslai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(ccrdslai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(ccrdslai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(ccrdslai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(ccrdslai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(ccrdslai,new AlphanumericType(8));
	private final Elementary acctsidl = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(ccrdslai);
	private final Elementary acctsidf = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary acctsida = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary acctsidi = new Elementary(ccrdslai,new AlphanumericType(11));
	private final Elementary cardsidl = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(ccrdslai);
	private final Elementary cardsidf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary cardsida = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary cardsidi = new Elementary(ccrdslai,new AlphanumericType(16));
	private final Elementary crdnamel = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(ccrdslai);
	private final Elementary crdnamef = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary crdnamea = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary crdnamei = new Elementary(ccrdslai,new AlphanumericType(50));
	private final Elementary crdstcdl = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(ccrdslai);
	private final Elementary crdstcdf = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary crdstcda = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary crdstcdi = new Elementary(ccrdslai,new AlphanumericType(1));
	private final Elementary expmonl = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(ccrdslai);
	private final Elementary expmonf = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary expmona = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary expmoni = new Elementary(ccrdslai,new AlphanumericType(2));
	private final Elementary expyearl = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(ccrdslai);
	private final Elementary expyearf = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary expyeara = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary expyeari = new Elementary(ccrdslai,new AlphanumericType(4));
	private final Elementary infomsgl = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union13 = new Union(ccrdslai);
	private final Elementary infomsgf = new Elementary(union13,new AlphanumericType(1));
	private final Group group12 = new Group(union13);
	private final Elementary infomsga = new Elementary(group12,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary infomsgi = new Elementary(ccrdslai,new AlphanumericType(40));
	private final Elementary errmsgl = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union14 = new Union(ccrdslai);
	private final Elementary errmsgf = new Elementary(union14,new AlphanumericType(1));
	private final Group group13 = new Group(union14);
	private final Elementary errmsga = new Elementary(group13,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(ccrdslai,new AlphanumericType(80));
	private final Elementary fkeysl = new Elementary(ccrdslai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union15 = new Union(ccrdslai);
	private final Elementary fkeysf = new Elementary(union15,new AlphanumericType(1));
	private final Group group14 = new Group(union15);
	private final Elementary fkeysa = new Elementary(group14,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(ccrdslai,new AlphanumericType(4));
	private final Elementary fkeysi = new Elementary(ccrdslai,new AlphanumericType(75));
	private final Group ccrdslao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(ccrdslao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(ccrdslao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(ccrdslao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(ccrdslao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(ccrdslao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(ccrdslao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(ccrdslao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary acctsidc = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary acctsidp = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary acctsidh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary acctsidv = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary acctsido = new Elementary(ccrdslao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary cardsidc = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary cardsidp = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary cardsidh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary cardsidv = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary cardsido = new Elementary(ccrdslao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary crdnamec = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary crdnamep = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary crdnameh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary crdnamev = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary crdnameo = new Elementary(ccrdslao,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary crdstcdc = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary crdstcdp = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary crdstcdh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary crdstcdv = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary crdstcdo = new Elementary(ccrdslao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary expmonc = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary expmonp = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary expmonh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary expmonv = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary expmono = new Elementary(ccrdslao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary expyearc = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary expyearp = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary expyearh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary expyearv = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary expyearo = new Elementary(ccrdslao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary infomsgc = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary infomsgp = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary infomsgh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary infomsgv = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary infomsgo = new Elementary(ccrdslao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(ccrdslao,new AlphanumericType(80));
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(ccrdslao,new AlphanumericType(3));
	private final Elementary fkeysc = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary fkeysp = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary fkeysh = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary fkeysv = new Elementary(ccrdslao,new AlphanumericType(1));
	private final Elementary fkeyso = new Elementary(ccrdslao,new AlphanumericType(75));
	

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
	 * Gets the reference for attribute ccrdslai.
	 * @return the ccrdslai attribute reference
	 */
	public RangeReference getCcrdslaiReference() {
		return ccrdslai.getReference();
	}	
				
	/**
	 * Setter for ccrdslai .
	 */
   	public void setCcrdslai(RangeReference reference) {
       	ccrdslai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute acctsidl.
	 * @return the acctsidl attribute reference
	 */
	public ElementaryRangeReference getAcctsidlReference() {
		return acctsidl.getReference();
	}

	/**
	 * Getter for acctsidl attribute.
	 * @return acctsidl attribute
	 */
	public int getAcctsidl() {
		return acctsidl.getValue();
	}

	/**
	 * Setter for acctsidl attribute.
	 * @param acctsidl the new value of acctsidl
	 */
	public void setAcctsidl(int acctsidl) {
		this.acctsidl.setValue(acctsidl);
	}
	/**
	 * Gets the reference for attribute acctsidf.
	 * @return the acctsidf attribute reference
	 */
	public ElementaryRangeReference getAcctsidfReference() {
		return acctsidf.getReference();
	}

	/**
	 * Getter for acctsidf attribute.
	 * @return acctsidf attribute
	 */
	public String getAcctsidf() {
		return acctsidf.getValue();
	}

	/**
	 * Setter for acctsidf attribute.
	 * @param acctsidf the new value of acctsidf
	 */
	public void setAcctsidf(String acctsidf) {
		this.acctsidf.setValue(acctsidf);
	}
	/**
	 * Gets the reference for attribute acctsida.
	 * @return the acctsida attribute reference
	 */
	public ElementaryRangeReference getAcctsidaReference() {
		return acctsida.getReference();
	}

	/**
	 * Getter for acctsida attribute.
	 * @return acctsida attribute
	 */
	public String getAcctsida() {
		return acctsida.getValue();
	}

	/**
	 * Setter for acctsida attribute.
	 * @param acctsida the new value of acctsida
	 */
	public void setAcctsida(String acctsida) {
		this.acctsida.setValue(acctsida);
	}
	/**
	 * Gets the reference for attribute acctsidi.
	 * @return the acctsidi attribute reference
	 */
	public ElementaryRangeReference getAcctsidiReference() {
		return acctsidi.getReference();
	}

	/**
	 * Getter for acctsidi attribute.
	 * @return acctsidi attribute
	 */
	public String getAcctsidi() {
		return acctsidi.getValue();
	}

	/**
	 * Setter for acctsidi attribute.
	 * @param acctsidi the new value of acctsidi
	 */
	public void setAcctsidi(String acctsidi) {
		this.acctsidi.setValue(acctsidi);
	}
	/**
	 * Gets the reference for attribute cardsidl.
	 * @return the cardsidl attribute reference
	 */
	public ElementaryRangeReference getCardsidlReference() {
		return cardsidl.getReference();
	}

	/**
	 * Getter for cardsidl attribute.
	 * @return cardsidl attribute
	 */
	public int getCardsidl() {
		return cardsidl.getValue();
	}

	/**
	 * Setter for cardsidl attribute.
	 * @param cardsidl the new value of cardsidl
	 */
	public void setCardsidl(int cardsidl) {
		this.cardsidl.setValue(cardsidl);
	}
	/**
	 * Gets the reference for attribute cardsidf.
	 * @return the cardsidf attribute reference
	 */
	public ElementaryRangeReference getCardsidfReference() {
		return cardsidf.getReference();
	}

	/**
	 * Getter for cardsidf attribute.
	 * @return cardsidf attribute
	 */
	public String getCardsidf() {
		return cardsidf.getValue();
	}

	/**
	 * Setter for cardsidf attribute.
	 * @param cardsidf the new value of cardsidf
	 */
	public void setCardsidf(String cardsidf) {
		this.cardsidf.setValue(cardsidf);
	}
	/**
	 * Gets the reference for attribute cardsida.
	 * @return the cardsida attribute reference
	 */
	public ElementaryRangeReference getCardsidaReference() {
		return cardsida.getReference();
	}

	/**
	 * Getter for cardsida attribute.
	 * @return cardsida attribute
	 */
	public String getCardsida() {
		return cardsida.getValue();
	}

	/**
	 * Setter for cardsida attribute.
	 * @param cardsida the new value of cardsida
	 */
	public void setCardsida(String cardsida) {
		this.cardsida.setValue(cardsida);
	}
	/**
	 * Gets the reference for attribute cardsidi.
	 * @return the cardsidi attribute reference
	 */
	public ElementaryRangeReference getCardsidiReference() {
		return cardsidi.getReference();
	}

	/**
	 * Getter for cardsidi attribute.
	 * @return cardsidi attribute
	 */
	public String getCardsidi() {
		return cardsidi.getValue();
	}

	/**
	 * Setter for cardsidi attribute.
	 * @param cardsidi the new value of cardsidi
	 */
	public void setCardsidi(String cardsidi) {
		this.cardsidi.setValue(cardsidi);
	}
	/**
	 * Gets the reference for attribute crdnamel.
	 * @return the crdnamel attribute reference
	 */
	public ElementaryRangeReference getCrdnamelReference() {
		return crdnamel.getReference();
	}

	/**
	 * Getter for crdnamel attribute.
	 * @return crdnamel attribute
	 */
	public int getCrdnamel() {
		return crdnamel.getValue();
	}

	/**
	 * Setter for crdnamel attribute.
	 * @param crdnamel the new value of crdnamel
	 */
	public void setCrdnamel(int crdnamel) {
		this.crdnamel.setValue(crdnamel);
	}
	/**
	 * Gets the reference for attribute crdnamef.
	 * @return the crdnamef attribute reference
	 */
	public ElementaryRangeReference getCrdnamefReference() {
		return crdnamef.getReference();
	}

	/**
	 * Getter for crdnamef attribute.
	 * @return crdnamef attribute
	 */
	public String getCrdnamef() {
		return crdnamef.getValue();
	}

	/**
	 * Setter for crdnamef attribute.
	 * @param crdnamef the new value of crdnamef
	 */
	public void setCrdnamef(String crdnamef) {
		this.crdnamef.setValue(crdnamef);
	}
	/**
	 * Gets the reference for attribute crdnamea.
	 * @return the crdnamea attribute reference
	 */
	public ElementaryRangeReference getCrdnameaReference() {
		return crdnamea.getReference();
	}

	/**
	 * Getter for crdnamea attribute.
	 * @return crdnamea attribute
	 */
	public String getCrdnamea() {
		return crdnamea.getValue();
	}

	/**
	 * Setter for crdnamea attribute.
	 * @param crdnamea the new value of crdnamea
	 */
	public void setCrdnamea(String crdnamea) {
		this.crdnamea.setValue(crdnamea);
	}
	/**
	 * Gets the reference for attribute crdnamei.
	 * @return the crdnamei attribute reference
	 */
	public ElementaryRangeReference getCrdnameiReference() {
		return crdnamei.getReference();
	}

	/**
	 * Getter for crdnamei attribute.
	 * @return crdnamei attribute
	 */
	public String getCrdnamei() {
		return crdnamei.getValue();
	}

	/**
	 * Setter for crdnamei attribute.
	 * @param crdnamei the new value of crdnamei
	 */
	public void setCrdnamei(String crdnamei) {
		this.crdnamei.setValue(crdnamei);
	}
	/**
	 * Gets the reference for attribute crdstcdl.
	 * @return the crdstcdl attribute reference
	 */
	public ElementaryRangeReference getCrdstcdlReference() {
		return crdstcdl.getReference();
	}

	/**
	 * Getter for crdstcdl attribute.
	 * @return crdstcdl attribute
	 */
	public int getCrdstcdl() {
		return crdstcdl.getValue();
	}

	/**
	 * Setter for crdstcdl attribute.
	 * @param crdstcdl the new value of crdstcdl
	 */
	public void setCrdstcdl(int crdstcdl) {
		this.crdstcdl.setValue(crdstcdl);
	}
	/**
	 * Gets the reference for attribute crdstcdf.
	 * @return the crdstcdf attribute reference
	 */
	public ElementaryRangeReference getCrdstcdfReference() {
		return crdstcdf.getReference();
	}

	/**
	 * Getter for crdstcdf attribute.
	 * @return crdstcdf attribute
	 */
	public String getCrdstcdf() {
		return crdstcdf.getValue();
	}

	/**
	 * Setter for crdstcdf attribute.
	 * @param crdstcdf the new value of crdstcdf
	 */
	public void setCrdstcdf(String crdstcdf) {
		this.crdstcdf.setValue(crdstcdf);
	}
	/**
	 * Gets the reference for attribute crdstcda.
	 * @return the crdstcda attribute reference
	 */
	public ElementaryRangeReference getCrdstcdaReference() {
		return crdstcda.getReference();
	}

	/**
	 * Getter for crdstcda attribute.
	 * @return crdstcda attribute
	 */
	public String getCrdstcda() {
		return crdstcda.getValue();
	}

	/**
	 * Setter for crdstcda attribute.
	 * @param crdstcda the new value of crdstcda
	 */
	public void setCrdstcda(String crdstcda) {
		this.crdstcda.setValue(crdstcda);
	}
	/**
	 * Gets the reference for attribute crdstcdi.
	 * @return the crdstcdi attribute reference
	 */
	public ElementaryRangeReference getCrdstcdiReference() {
		return crdstcdi.getReference();
	}

	/**
	 * Getter for crdstcdi attribute.
	 * @return crdstcdi attribute
	 */
	public String getCrdstcdi() {
		return crdstcdi.getValue();
	}

	/**
	 * Setter for crdstcdi attribute.
	 * @param crdstcdi the new value of crdstcdi
	 */
	public void setCrdstcdi(String crdstcdi) {
		this.crdstcdi.setValue(crdstcdi);
	}
	/**
	 * Gets the reference for attribute expmonl.
	 * @return the expmonl attribute reference
	 */
	public ElementaryRangeReference getExpmonlReference() {
		return expmonl.getReference();
	}

	/**
	 * Getter for expmonl attribute.
	 * @return expmonl attribute
	 */
	public int getExpmonl() {
		return expmonl.getValue();
	}

	/**
	 * Setter for expmonl attribute.
	 * @param expmonl the new value of expmonl
	 */
	public void setExpmonl(int expmonl) {
		this.expmonl.setValue(expmonl);
	}
	/**
	 * Gets the reference for attribute expmonf.
	 * @return the expmonf attribute reference
	 */
	public ElementaryRangeReference getExpmonfReference() {
		return expmonf.getReference();
	}

	/**
	 * Getter for expmonf attribute.
	 * @return expmonf attribute
	 */
	public String getExpmonf() {
		return expmonf.getValue();
	}

	/**
	 * Setter for expmonf attribute.
	 * @param expmonf the new value of expmonf
	 */
	public void setExpmonf(String expmonf) {
		this.expmonf.setValue(expmonf);
	}
	/**
	 * Gets the reference for attribute expmona.
	 * @return the expmona attribute reference
	 */
	public ElementaryRangeReference getExpmonaReference() {
		return expmona.getReference();
	}

	/**
	 * Getter for expmona attribute.
	 * @return expmona attribute
	 */
	public String getExpmona() {
		return expmona.getValue();
	}

	/**
	 * Setter for expmona attribute.
	 * @param expmona the new value of expmona
	 */
	public void setExpmona(String expmona) {
		this.expmona.setValue(expmona);
	}
	/**
	 * Gets the reference for attribute expmoni.
	 * @return the expmoni attribute reference
	 */
	public ElementaryRangeReference getExpmoniReference() {
		return expmoni.getReference();
	}

	/**
	 * Getter for expmoni attribute.
	 * @return expmoni attribute
	 */
	public String getExpmoni() {
		return expmoni.getValue();
	}

	/**
	 * Setter for expmoni attribute.
	 * @param expmoni the new value of expmoni
	 */
	public void setExpmoni(String expmoni) {
		this.expmoni.setValue(expmoni);
	}
	/**
	 * Gets the reference for attribute expyearl.
	 * @return the expyearl attribute reference
	 */
	public ElementaryRangeReference getExpyearlReference() {
		return expyearl.getReference();
	}

	/**
	 * Getter for expyearl attribute.
	 * @return expyearl attribute
	 */
	public int getExpyearl() {
		return expyearl.getValue();
	}

	/**
	 * Setter for expyearl attribute.
	 * @param expyearl the new value of expyearl
	 */
	public void setExpyearl(int expyearl) {
		this.expyearl.setValue(expyearl);
	}
	/**
	 * Gets the reference for attribute expyearf.
	 * @return the expyearf attribute reference
	 */
	public ElementaryRangeReference getExpyearfReference() {
		return expyearf.getReference();
	}

	/**
	 * Getter for expyearf attribute.
	 * @return expyearf attribute
	 */
	public String getExpyearf() {
		return expyearf.getValue();
	}

	/**
	 * Setter for expyearf attribute.
	 * @param expyearf the new value of expyearf
	 */
	public void setExpyearf(String expyearf) {
		this.expyearf.setValue(expyearf);
	}
	/**
	 * Gets the reference for attribute expyeara.
	 * @return the expyeara attribute reference
	 */
	public ElementaryRangeReference getExpyearaReference() {
		return expyeara.getReference();
	}

	/**
	 * Getter for expyeara attribute.
	 * @return expyeara attribute
	 */
	public String getExpyeara() {
		return expyeara.getValue();
	}

	/**
	 * Setter for expyeara attribute.
	 * @param expyeara the new value of expyeara
	 */
	public void setExpyeara(String expyeara) {
		this.expyeara.setValue(expyeara);
	}
	/**
	 * Gets the reference for attribute expyeari.
	 * @return the expyeari attribute reference
	 */
	public ElementaryRangeReference getExpyeariReference() {
		return expyeari.getReference();
	}

	/**
	 * Getter for expyeari attribute.
	 * @return expyeari attribute
	 */
	public String getExpyeari() {
		return expyeari.getValue();
	}

	/**
	 * Setter for expyeari attribute.
	 * @param expyeari the new value of expyeari
	 */
	public void setExpyeari(String expyeari) {
		this.expyeari.setValue(expyeari);
	}
	/**
	 * Gets the reference for attribute infomsgl.
	 * @return the infomsgl attribute reference
	 */
	public ElementaryRangeReference getInfomsglReference() {
		return infomsgl.getReference();
	}

	/**
	 * Getter for infomsgl attribute.
	 * @return infomsgl attribute
	 */
	public int getInfomsgl() {
		return infomsgl.getValue();
	}

	/**
	 * Setter for infomsgl attribute.
	 * @param infomsgl the new value of infomsgl
	 */
	public void setInfomsgl(int infomsgl) {
		this.infomsgl.setValue(infomsgl);
	}
	/**
	 * Gets the reference for attribute infomsgf.
	 * @return the infomsgf attribute reference
	 */
	public ElementaryRangeReference getInfomsgfReference() {
		return infomsgf.getReference();
	}

	/**
	 * Getter for infomsgf attribute.
	 * @return infomsgf attribute
	 */
	public String getInfomsgf() {
		return infomsgf.getValue();
	}

	/**
	 * Setter for infomsgf attribute.
	 * @param infomsgf the new value of infomsgf
	 */
	public void setInfomsgf(String infomsgf) {
		this.infomsgf.setValue(infomsgf);
	}
	/**
	 * Gets the reference for attribute infomsga.
	 * @return the infomsga attribute reference
	 */
	public ElementaryRangeReference getInfomsgaReference() {
		return infomsga.getReference();
	}

	/**
	 * Getter for infomsga attribute.
	 * @return infomsga attribute
	 */
	public String getInfomsga() {
		return infomsga.getValue();
	}

	/**
	 * Setter for infomsga attribute.
	 * @param infomsga the new value of infomsga
	 */
	public void setInfomsga(String infomsga) {
		this.infomsga.setValue(infomsga);
	}
	/**
	 * Gets the reference for attribute infomsgi.
	 * @return the infomsgi attribute reference
	 */
	public ElementaryRangeReference getInfomsgiReference() {
		return infomsgi.getReference();
	}

	/**
	 * Getter for infomsgi attribute.
	 * @return infomsgi attribute
	 */
	public String getInfomsgi() {
		return infomsgi.getValue();
	}

	/**
	 * Setter for infomsgi attribute.
	 * @param infomsgi the new value of infomsgi
	 */
	public void setInfomsgi(String infomsgi) {
		this.infomsgi.setValue(infomsgi);
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
	 * Gets the reference for attribute fkeysl.
	 * @return the fkeysl attribute reference
	 */
	public ElementaryRangeReference getFkeyslReference() {
		return fkeysl.getReference();
	}

	/**
	 * Getter for fkeysl attribute.
	 * @return fkeysl attribute
	 */
	public int getFkeysl() {
		return fkeysl.getValue();
	}

	/**
	 * Setter for fkeysl attribute.
	 * @param fkeysl the new value of fkeysl
	 */
	public void setFkeysl(int fkeysl) {
		this.fkeysl.setValue(fkeysl);
	}
	/**
	 * Gets the reference for attribute fkeysf.
	 * @return the fkeysf attribute reference
	 */
	public ElementaryRangeReference getFkeysfReference() {
		return fkeysf.getReference();
	}

	/**
	 * Getter for fkeysf attribute.
	 * @return fkeysf attribute
	 */
	public String getFkeysf() {
		return fkeysf.getValue();
	}

	/**
	 * Setter for fkeysf attribute.
	 * @param fkeysf the new value of fkeysf
	 */
	public void setFkeysf(String fkeysf) {
		this.fkeysf.setValue(fkeysf);
	}
	/**
	 * Gets the reference for attribute fkeysa.
	 * @return the fkeysa attribute reference
	 */
	public ElementaryRangeReference getFkeysaReference() {
		return fkeysa.getReference();
	}

	/**
	 * Getter for fkeysa attribute.
	 * @return fkeysa attribute
	 */
	public String getFkeysa() {
		return fkeysa.getValue();
	}

	/**
	 * Setter for fkeysa attribute.
	 * @param fkeysa the new value of fkeysa
	 */
	public void setFkeysa(String fkeysa) {
		this.fkeysa.setValue(fkeysa);
	}
	/**
	 * Gets the reference for attribute fkeysi.
	 * @return the fkeysi attribute reference
	 */
	public ElementaryRangeReference getFkeysiReference() {
		return fkeysi.getReference();
	}

	/**
	 * Getter for fkeysi attribute.
	 * @return fkeysi attribute
	 */
	public String getFkeysi() {
		return fkeysi.getValue();
	}

	/**
	 * Setter for fkeysi attribute.
	 * @param fkeysi the new value of fkeysi
	 */
	public void setFkeysi(String fkeysi) {
		this.fkeysi.setValue(fkeysi);
	}
	
	/**
	 * Gets the reference for attribute ccrdslao.
	 * @return the ccrdslao attribute reference
	 */
	public RangeReference getCcrdslaoReference() {
		return ccrdslao.getReference();
	}	
				
	/**
	 * Setter for ccrdslao .
	 */
   	public void setCcrdslao(RangeReference reference) {
       	ccrdslao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute acctsidc.
	 * @return the acctsidc attribute reference
	 */
	public ElementaryRangeReference getAcctsidcReference() {
		return acctsidc.getReference();
	}

	/**
	 * Getter for acctsidc attribute.
	 * @return acctsidc attribute
	 */
	public String getAcctsidc() {
		return acctsidc.getValue();
	}

	/**
	 * Setter for acctsidc attribute.
	 * @param acctsidc the new value of acctsidc
	 */
	public void setAcctsidc(String acctsidc) {
		this.acctsidc.setValue(acctsidc);
	}
	/**
	 * Gets the reference for attribute acctsidp.
	 * @return the acctsidp attribute reference
	 */
	public ElementaryRangeReference getAcctsidpReference() {
		return acctsidp.getReference();
	}

	/**
	 * Getter for acctsidp attribute.
	 * @return acctsidp attribute
	 */
	public String getAcctsidp() {
		return acctsidp.getValue();
	}

	/**
	 * Setter for acctsidp attribute.
	 * @param acctsidp the new value of acctsidp
	 */
	public void setAcctsidp(String acctsidp) {
		this.acctsidp.setValue(acctsidp);
	}
	/**
	 * Gets the reference for attribute acctsidh.
	 * @return the acctsidh attribute reference
	 */
	public ElementaryRangeReference getAcctsidhReference() {
		return acctsidh.getReference();
	}

	/**
	 * Getter for acctsidh attribute.
	 * @return acctsidh attribute
	 */
	public String getAcctsidh() {
		return acctsidh.getValue();
	}

	/**
	 * Setter for acctsidh attribute.
	 * @param acctsidh the new value of acctsidh
	 */
	public void setAcctsidh(String acctsidh) {
		this.acctsidh.setValue(acctsidh);
	}
	/**
	 * Gets the reference for attribute acctsidv.
	 * @return the acctsidv attribute reference
	 */
	public ElementaryRangeReference getAcctsidvReference() {
		return acctsidv.getReference();
	}

	/**
	 * Getter for acctsidv attribute.
	 * @return acctsidv attribute
	 */
	public String getAcctsidv() {
		return acctsidv.getValue();
	}

	/**
	 * Setter for acctsidv attribute.
	 * @param acctsidv the new value of acctsidv
	 */
	public void setAcctsidv(String acctsidv) {
		this.acctsidv.setValue(acctsidv);
	}
	/**
	 * Gets the reference for attribute acctsido.
	 * @return the acctsido attribute reference
	 */
	public ElementaryRangeReference getAcctsidoReference() {
		return acctsido.getReference();
	}

	/**
	 * Getter for acctsido attribute.
	 * @return acctsido attribute
	 */
	public String getAcctsido() {
		return acctsido.getValue();
	}

	/**
	 * Setter for acctsido attribute.
	 * @param acctsido the new value of acctsido
	 */
	public void setAcctsido(String acctsido) {
		this.acctsido.setValue(acctsido);
	}
	/**
	 * Gets the reference for attribute cardsidc.
	 * @return the cardsidc attribute reference
	 */
	public ElementaryRangeReference getCardsidcReference() {
		return cardsidc.getReference();
	}

	/**
	 * Getter for cardsidc attribute.
	 * @return cardsidc attribute
	 */
	public String getCardsidc() {
		return cardsidc.getValue();
	}

	/**
	 * Setter for cardsidc attribute.
	 * @param cardsidc the new value of cardsidc
	 */
	public void setCardsidc(String cardsidc) {
		this.cardsidc.setValue(cardsidc);
	}
	/**
	 * Gets the reference for attribute cardsidp.
	 * @return the cardsidp attribute reference
	 */
	public ElementaryRangeReference getCardsidpReference() {
		return cardsidp.getReference();
	}

	/**
	 * Getter for cardsidp attribute.
	 * @return cardsidp attribute
	 */
	public String getCardsidp() {
		return cardsidp.getValue();
	}

	/**
	 * Setter for cardsidp attribute.
	 * @param cardsidp the new value of cardsidp
	 */
	public void setCardsidp(String cardsidp) {
		this.cardsidp.setValue(cardsidp);
	}
	/**
	 * Gets the reference for attribute cardsidh.
	 * @return the cardsidh attribute reference
	 */
	public ElementaryRangeReference getCardsidhReference() {
		return cardsidh.getReference();
	}

	/**
	 * Getter for cardsidh attribute.
	 * @return cardsidh attribute
	 */
	public String getCardsidh() {
		return cardsidh.getValue();
	}

	/**
	 * Setter for cardsidh attribute.
	 * @param cardsidh the new value of cardsidh
	 */
	public void setCardsidh(String cardsidh) {
		this.cardsidh.setValue(cardsidh);
	}
	/**
	 * Gets the reference for attribute cardsidv.
	 * @return the cardsidv attribute reference
	 */
	public ElementaryRangeReference getCardsidvReference() {
		return cardsidv.getReference();
	}

	/**
	 * Getter for cardsidv attribute.
	 * @return cardsidv attribute
	 */
	public String getCardsidv() {
		return cardsidv.getValue();
	}

	/**
	 * Setter for cardsidv attribute.
	 * @param cardsidv the new value of cardsidv
	 */
	public void setCardsidv(String cardsidv) {
		this.cardsidv.setValue(cardsidv);
	}
	/**
	 * Gets the reference for attribute cardsido.
	 * @return the cardsido attribute reference
	 */
	public ElementaryRangeReference getCardsidoReference() {
		return cardsido.getReference();
	}

	/**
	 * Getter for cardsido attribute.
	 * @return cardsido attribute
	 */
	public String getCardsido() {
		return cardsido.getValue();
	}

	/**
	 * Setter for cardsido attribute.
	 * @param cardsido the new value of cardsido
	 */
	public void setCardsido(String cardsido) {
		this.cardsido.setValue(cardsido);
	}
	/**
	 * Gets the reference for attribute crdnamec.
	 * @return the crdnamec attribute reference
	 */
	public ElementaryRangeReference getCrdnamecReference() {
		return crdnamec.getReference();
	}

	/**
	 * Getter for crdnamec attribute.
	 * @return crdnamec attribute
	 */
	public String getCrdnamec() {
		return crdnamec.getValue();
	}

	/**
	 * Setter for crdnamec attribute.
	 * @param crdnamec the new value of crdnamec
	 */
	public void setCrdnamec(String crdnamec) {
		this.crdnamec.setValue(crdnamec);
	}
	/**
	 * Gets the reference for attribute crdnamep.
	 * @return the crdnamep attribute reference
	 */
	public ElementaryRangeReference getCrdnamepReference() {
		return crdnamep.getReference();
	}

	/**
	 * Getter for crdnamep attribute.
	 * @return crdnamep attribute
	 */
	public String getCrdnamep() {
		return crdnamep.getValue();
	}

	/**
	 * Setter for crdnamep attribute.
	 * @param crdnamep the new value of crdnamep
	 */
	public void setCrdnamep(String crdnamep) {
		this.crdnamep.setValue(crdnamep);
	}
	/**
	 * Gets the reference for attribute crdnameh.
	 * @return the crdnameh attribute reference
	 */
	public ElementaryRangeReference getCrdnamehReference() {
		return crdnameh.getReference();
	}

	/**
	 * Getter for crdnameh attribute.
	 * @return crdnameh attribute
	 */
	public String getCrdnameh() {
		return crdnameh.getValue();
	}

	/**
	 * Setter for crdnameh attribute.
	 * @param crdnameh the new value of crdnameh
	 */
	public void setCrdnameh(String crdnameh) {
		this.crdnameh.setValue(crdnameh);
	}
	/**
	 * Gets the reference for attribute crdnamev.
	 * @return the crdnamev attribute reference
	 */
	public ElementaryRangeReference getCrdnamevReference() {
		return crdnamev.getReference();
	}

	/**
	 * Getter for crdnamev attribute.
	 * @return crdnamev attribute
	 */
	public String getCrdnamev() {
		return crdnamev.getValue();
	}

	/**
	 * Setter for crdnamev attribute.
	 * @param crdnamev the new value of crdnamev
	 */
	public void setCrdnamev(String crdnamev) {
		this.crdnamev.setValue(crdnamev);
	}
	/**
	 * Gets the reference for attribute crdnameo.
	 * @return the crdnameo attribute reference
	 */
	public ElementaryRangeReference getCrdnameoReference() {
		return crdnameo.getReference();
	}

	/**
	 * Getter for crdnameo attribute.
	 * @return crdnameo attribute
	 */
	public String getCrdnameo() {
		return crdnameo.getValue();
	}

	/**
	 * Setter for crdnameo attribute.
	 * @param crdnameo the new value of crdnameo
	 */
	public void setCrdnameo(String crdnameo) {
		this.crdnameo.setValue(crdnameo);
	}
	/**
	 * Gets the reference for attribute crdstcdc.
	 * @return the crdstcdc attribute reference
	 */
	public ElementaryRangeReference getCrdstcdcReference() {
		return crdstcdc.getReference();
	}

	/**
	 * Getter for crdstcdc attribute.
	 * @return crdstcdc attribute
	 */
	public String getCrdstcdc() {
		return crdstcdc.getValue();
	}

	/**
	 * Setter for crdstcdc attribute.
	 * @param crdstcdc the new value of crdstcdc
	 */
	public void setCrdstcdc(String crdstcdc) {
		this.crdstcdc.setValue(crdstcdc);
	}
	/**
	 * Gets the reference for attribute crdstcdp.
	 * @return the crdstcdp attribute reference
	 */
	public ElementaryRangeReference getCrdstcdpReference() {
		return crdstcdp.getReference();
	}

	/**
	 * Getter for crdstcdp attribute.
	 * @return crdstcdp attribute
	 */
	public String getCrdstcdp() {
		return crdstcdp.getValue();
	}

	/**
	 * Setter for crdstcdp attribute.
	 * @param crdstcdp the new value of crdstcdp
	 */
	public void setCrdstcdp(String crdstcdp) {
		this.crdstcdp.setValue(crdstcdp);
	}
	/**
	 * Gets the reference for attribute crdstcdh.
	 * @return the crdstcdh attribute reference
	 */
	public ElementaryRangeReference getCrdstcdhReference() {
		return crdstcdh.getReference();
	}

	/**
	 * Getter for crdstcdh attribute.
	 * @return crdstcdh attribute
	 */
	public String getCrdstcdh() {
		return crdstcdh.getValue();
	}

	/**
	 * Setter for crdstcdh attribute.
	 * @param crdstcdh the new value of crdstcdh
	 */
	public void setCrdstcdh(String crdstcdh) {
		this.crdstcdh.setValue(crdstcdh);
	}
	/**
	 * Gets the reference for attribute crdstcdv.
	 * @return the crdstcdv attribute reference
	 */
	public ElementaryRangeReference getCrdstcdvReference() {
		return crdstcdv.getReference();
	}

	/**
	 * Getter for crdstcdv attribute.
	 * @return crdstcdv attribute
	 */
	public String getCrdstcdv() {
		return crdstcdv.getValue();
	}

	/**
	 * Setter for crdstcdv attribute.
	 * @param crdstcdv the new value of crdstcdv
	 */
	public void setCrdstcdv(String crdstcdv) {
		this.crdstcdv.setValue(crdstcdv);
	}
	/**
	 * Gets the reference for attribute crdstcdo.
	 * @return the crdstcdo attribute reference
	 */
	public ElementaryRangeReference getCrdstcdoReference() {
		return crdstcdo.getReference();
	}

	/**
	 * Getter for crdstcdo attribute.
	 * @return crdstcdo attribute
	 */
	public String getCrdstcdo() {
		return crdstcdo.getValue();
	}

	/**
	 * Setter for crdstcdo attribute.
	 * @param crdstcdo the new value of crdstcdo
	 */
	public void setCrdstcdo(String crdstcdo) {
		this.crdstcdo.setValue(crdstcdo);
	}
	/**
	 * Gets the reference for attribute expmonc.
	 * @return the expmonc attribute reference
	 */
	public ElementaryRangeReference getExpmoncReference() {
		return expmonc.getReference();
	}

	/**
	 * Getter for expmonc attribute.
	 * @return expmonc attribute
	 */
	public String getExpmonc() {
		return expmonc.getValue();
	}

	/**
	 * Setter for expmonc attribute.
	 * @param expmonc the new value of expmonc
	 */
	public void setExpmonc(String expmonc) {
		this.expmonc.setValue(expmonc);
	}
	/**
	 * Gets the reference for attribute expmonp.
	 * @return the expmonp attribute reference
	 */
	public ElementaryRangeReference getExpmonpReference() {
		return expmonp.getReference();
	}

	/**
	 * Getter for expmonp attribute.
	 * @return expmonp attribute
	 */
	public String getExpmonp() {
		return expmonp.getValue();
	}

	/**
	 * Setter for expmonp attribute.
	 * @param expmonp the new value of expmonp
	 */
	public void setExpmonp(String expmonp) {
		this.expmonp.setValue(expmonp);
	}
	/**
	 * Gets the reference for attribute expmonh.
	 * @return the expmonh attribute reference
	 */
	public ElementaryRangeReference getExpmonhReference() {
		return expmonh.getReference();
	}

	/**
	 * Getter for expmonh attribute.
	 * @return expmonh attribute
	 */
	public String getExpmonh() {
		return expmonh.getValue();
	}

	/**
	 * Setter for expmonh attribute.
	 * @param expmonh the new value of expmonh
	 */
	public void setExpmonh(String expmonh) {
		this.expmonh.setValue(expmonh);
	}
	/**
	 * Gets the reference for attribute expmonv.
	 * @return the expmonv attribute reference
	 */
	public ElementaryRangeReference getExpmonvReference() {
		return expmonv.getReference();
	}

	/**
	 * Getter for expmonv attribute.
	 * @return expmonv attribute
	 */
	public String getExpmonv() {
		return expmonv.getValue();
	}

	/**
	 * Setter for expmonv attribute.
	 * @param expmonv the new value of expmonv
	 */
	public void setExpmonv(String expmonv) {
		this.expmonv.setValue(expmonv);
	}
	/**
	 * Gets the reference for attribute expmono.
	 * @return the expmono attribute reference
	 */
	public ElementaryRangeReference getExpmonoReference() {
		return expmono.getReference();
	}

	/**
	 * Getter for expmono attribute.
	 * @return expmono attribute
	 */
	public String getExpmono() {
		return expmono.getValue();
	}

	/**
	 * Setter for expmono attribute.
	 * @param expmono the new value of expmono
	 */
	public void setExpmono(String expmono) {
		this.expmono.setValue(expmono);
	}
	/**
	 * Gets the reference for attribute expyearc.
	 * @return the expyearc attribute reference
	 */
	public ElementaryRangeReference getExpyearcReference() {
		return expyearc.getReference();
	}

	/**
	 * Getter for expyearc attribute.
	 * @return expyearc attribute
	 */
	public String getExpyearc() {
		return expyearc.getValue();
	}

	/**
	 * Setter for expyearc attribute.
	 * @param expyearc the new value of expyearc
	 */
	public void setExpyearc(String expyearc) {
		this.expyearc.setValue(expyearc);
	}
	/**
	 * Gets the reference for attribute expyearp.
	 * @return the expyearp attribute reference
	 */
	public ElementaryRangeReference getExpyearpReference() {
		return expyearp.getReference();
	}

	/**
	 * Getter for expyearp attribute.
	 * @return expyearp attribute
	 */
	public String getExpyearp() {
		return expyearp.getValue();
	}

	/**
	 * Setter for expyearp attribute.
	 * @param expyearp the new value of expyearp
	 */
	public void setExpyearp(String expyearp) {
		this.expyearp.setValue(expyearp);
	}
	/**
	 * Gets the reference for attribute expyearh.
	 * @return the expyearh attribute reference
	 */
	public ElementaryRangeReference getExpyearhReference() {
		return expyearh.getReference();
	}

	/**
	 * Getter for expyearh attribute.
	 * @return expyearh attribute
	 */
	public String getExpyearh() {
		return expyearh.getValue();
	}

	/**
	 * Setter for expyearh attribute.
	 * @param expyearh the new value of expyearh
	 */
	public void setExpyearh(String expyearh) {
		this.expyearh.setValue(expyearh);
	}
	/**
	 * Gets the reference for attribute expyearv.
	 * @return the expyearv attribute reference
	 */
	public ElementaryRangeReference getExpyearvReference() {
		return expyearv.getReference();
	}

	/**
	 * Getter for expyearv attribute.
	 * @return expyearv attribute
	 */
	public String getExpyearv() {
		return expyearv.getValue();
	}

	/**
	 * Setter for expyearv attribute.
	 * @param expyearv the new value of expyearv
	 */
	public void setExpyearv(String expyearv) {
		this.expyearv.setValue(expyearv);
	}
	/**
	 * Gets the reference for attribute expyearo.
	 * @return the expyearo attribute reference
	 */
	public ElementaryRangeReference getExpyearoReference() {
		return expyearo.getReference();
	}

	/**
	 * Getter for expyearo attribute.
	 * @return expyearo attribute
	 */
	public String getExpyearo() {
		return expyearo.getValue();
	}

	/**
	 * Setter for expyearo attribute.
	 * @param expyearo the new value of expyearo
	 */
	public void setExpyearo(String expyearo) {
		this.expyearo.setValue(expyearo);
	}
	/**
	 * Gets the reference for attribute infomsgc.
	 * @return the infomsgc attribute reference
	 */
	public ElementaryRangeReference getInfomsgcReference() {
		return infomsgc.getReference();
	}

	/**
	 * Getter for infomsgc attribute.
	 * @return infomsgc attribute
	 */
	public String getInfomsgc() {
		return infomsgc.getValue();
	}

	/**
	 * Setter for infomsgc attribute.
	 * @param infomsgc the new value of infomsgc
	 */
	public void setInfomsgc(String infomsgc) {
		this.infomsgc.setValue(infomsgc);
	}
	/**
	 * Gets the reference for attribute infomsgp.
	 * @return the infomsgp attribute reference
	 */
	public ElementaryRangeReference getInfomsgpReference() {
		return infomsgp.getReference();
	}

	/**
	 * Getter for infomsgp attribute.
	 * @return infomsgp attribute
	 */
	public String getInfomsgp() {
		return infomsgp.getValue();
	}

	/**
	 * Setter for infomsgp attribute.
	 * @param infomsgp the new value of infomsgp
	 */
	public void setInfomsgp(String infomsgp) {
		this.infomsgp.setValue(infomsgp);
	}
	/**
	 * Gets the reference for attribute infomsgh.
	 * @return the infomsgh attribute reference
	 */
	public ElementaryRangeReference getInfomsghReference() {
		return infomsgh.getReference();
	}

	/**
	 * Getter for infomsgh attribute.
	 * @return infomsgh attribute
	 */
	public String getInfomsgh() {
		return infomsgh.getValue();
	}

	/**
	 * Setter for infomsgh attribute.
	 * @param infomsgh the new value of infomsgh
	 */
	public void setInfomsgh(String infomsgh) {
		this.infomsgh.setValue(infomsgh);
	}
	/**
	 * Gets the reference for attribute infomsgv.
	 * @return the infomsgv attribute reference
	 */
	public ElementaryRangeReference getInfomsgvReference() {
		return infomsgv.getReference();
	}

	/**
	 * Getter for infomsgv attribute.
	 * @return infomsgv attribute
	 */
	public String getInfomsgv() {
		return infomsgv.getValue();
	}

	/**
	 * Setter for infomsgv attribute.
	 * @param infomsgv the new value of infomsgv
	 */
	public void setInfomsgv(String infomsgv) {
		this.infomsgv.setValue(infomsgv);
	}
	/**
	 * Gets the reference for attribute infomsgo.
	 * @return the infomsgo attribute reference
	 */
	public ElementaryRangeReference getInfomsgoReference() {
		return infomsgo.getReference();
	}

	/**
	 * Getter for infomsgo attribute.
	 * @return infomsgo attribute
	 */
	public String getInfomsgo() {
		return infomsgo.getValue();
	}

	/**
	 * Setter for infomsgo attribute.
	 * @param infomsgo the new value of infomsgo
	 */
	public void setInfomsgo(String infomsgo) {
		this.infomsgo.setValue(infomsgo);
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
	/**
	 * Gets the reference for attribute fkeysc.
	 * @return the fkeysc attribute reference
	 */
	public ElementaryRangeReference getFkeyscReference() {
		return fkeysc.getReference();
	}

	/**
	 * Getter for fkeysc attribute.
	 * @return fkeysc attribute
	 */
	public String getFkeysc() {
		return fkeysc.getValue();
	}

	/**
	 * Setter for fkeysc attribute.
	 * @param fkeysc the new value of fkeysc
	 */
	public void setFkeysc(String fkeysc) {
		this.fkeysc.setValue(fkeysc);
	}
	/**
	 * Gets the reference for attribute fkeysp.
	 * @return the fkeysp attribute reference
	 */
	public ElementaryRangeReference getFkeyspReference() {
		return fkeysp.getReference();
	}

	/**
	 * Getter for fkeysp attribute.
	 * @return fkeysp attribute
	 */
	public String getFkeysp() {
		return fkeysp.getValue();
	}

	/**
	 * Setter for fkeysp attribute.
	 * @param fkeysp the new value of fkeysp
	 */
	public void setFkeysp(String fkeysp) {
		this.fkeysp.setValue(fkeysp);
	}
	/**
	 * Gets the reference for attribute fkeysh.
	 * @return the fkeysh attribute reference
	 */
	public ElementaryRangeReference getFkeyshReference() {
		return fkeysh.getReference();
	}

	/**
	 * Getter for fkeysh attribute.
	 * @return fkeysh attribute
	 */
	public String getFkeysh() {
		return fkeysh.getValue();
	}

	/**
	 * Setter for fkeysh attribute.
	 * @param fkeysh the new value of fkeysh
	 */
	public void setFkeysh(String fkeysh) {
		this.fkeysh.setValue(fkeysh);
	}
	/**
	 * Gets the reference for attribute fkeysv.
	 * @return the fkeysv attribute reference
	 */
	public ElementaryRangeReference getFkeysvReference() {
		return fkeysv.getReference();
	}

	/**
	 * Getter for fkeysv attribute.
	 * @return fkeysv attribute
	 */
	public String getFkeysv() {
		return fkeysv.getValue();
	}

	/**
	 * Setter for fkeysv attribute.
	 * @param fkeysv the new value of fkeysv
	 */
	public void setFkeysv(String fkeysv) {
		this.fkeysv.setValue(fkeysv);
	}
	/**
	 * Gets the reference for attribute fkeyso.
	 * @return the fkeyso attribute reference
	 */
	public ElementaryRangeReference getFkeysoReference() {
		return fkeyso.getReference();
	}

	/**
	 * Getter for fkeyso attribute.
	 * @return fkeyso attribute
	 */
	public String getFkeyso() {
		return fkeyso.getValue();
	}

	/**
	 * Setter for fkeyso attribute.
	 * @param fkeyso the new value of fkeyso
	 */
	public void setFkeyso(String fkeyso) {
		this.fkeyso.setValue(fkeyso);
	}
}
