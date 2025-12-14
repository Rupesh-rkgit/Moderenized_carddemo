package aws.bluage.l3.workshop.corpt00c.business.model;

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
 * <p>About 'corpt0ai' field, <br>uml entity: aws.bluage.l3.workshop.corpt00c.business.model.Corpt0ai
 * <br></p>
 * 
 * <p>About 'corpt0ao' field, <br>uml entity: aws.bluage.l3.workshop.corpt00c.business.model.Corpt0ao
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
	private final Group corpt0ai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(corpt0ai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(corpt0ai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(corpt0ai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(corpt0ai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(corpt0ai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(corpt0ai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(corpt0ai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(corpt0ai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(corpt0ai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(corpt0ai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(corpt0ai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(corpt0ai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(corpt0ai,new AlphanumericType(8));
	private final Elementary monthlyl = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(corpt0ai);
	private final Elementary monthlyf = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary monthlya = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary monthlyi = new Elementary(corpt0ai,new AlphanumericType(1));
	private final Elementary yearlyl = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(corpt0ai);
	private final Elementary yearlyf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary yearlya = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary yearlyi = new Elementary(corpt0ai,new AlphanumericType(1));
	private final Elementary customl = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(corpt0ai);
	private final Elementary customf = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary customa = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary customi = new Elementary(corpt0ai,new AlphanumericType(1));
	private final Elementary sdtmml = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(corpt0ai);
	private final Elementary sdtmmf = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary sdtmma = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary sdtmmi = new Elementary(corpt0ai,new AlphanumericType(2));
	private final Elementary sdtddl = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(corpt0ai);
	private final Elementary sdtddf = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary sdtdda = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary sdtddi = new Elementary(corpt0ai,new AlphanumericType(2));
	private final Elementary sdtyyyyl = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(corpt0ai);
	private final Elementary sdtyyyyf = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary sdtyyyya = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary sdtyyyyi = new Elementary(corpt0ai,new AlphanumericType(4));
	private final Elementary edtmml = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union13 = new Union(corpt0ai);
	private final Elementary edtmmf = new Elementary(union13,new AlphanumericType(1));
	private final Group group12 = new Group(union13);
	private final Elementary edtmma = new Elementary(group12,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary edtmmi = new Elementary(corpt0ai,new AlphanumericType(2));
	private final Elementary edtddl = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union14 = new Union(corpt0ai);
	private final Elementary edtddf = new Elementary(union14,new AlphanumericType(1));
	private final Group group13 = new Group(union14);
	private final Elementary edtdda = new Elementary(group13,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary edtddi = new Elementary(corpt0ai,new AlphanumericType(2));
	private final Elementary edtyyyyl = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union15 = new Union(corpt0ai);
	private final Elementary edtyyyyf = new Elementary(union15,new AlphanumericType(1));
	private final Group group14 = new Group(union15);
	private final Elementary edtyyyya = new Elementary(group14,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary edtyyyyi = new Elementary(corpt0ai,new AlphanumericType(4));
	private final Elementary confirml = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union16 = new Union(corpt0ai);
	private final Elementary confirmf = new Elementary(union16,new AlphanumericType(1));
	private final Group group15 = new Group(union16);
	private final Elementary confirma = new Elementary(group15,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary confirmi = new Elementary(corpt0ai,new AlphanumericType(1));
	private final Elementary errmsgl = new Elementary(corpt0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union17 = new Union(corpt0ai);
	private final Elementary errmsgf = new Elementary(union17,new AlphanumericType(1));
	private final Group group16 = new Group(union17);
	private final Elementary errmsga = new Elementary(group16,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(corpt0ai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(corpt0ai,new AlphanumericType(78));
	private final Group corpt0ao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(corpt0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(corpt0ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(corpt0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(corpt0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(corpt0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(corpt0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(corpt0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary monthlyc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary monthlyp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary monthlyh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary monthlyv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary monthlyo = new Elementary(corpt0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary yearlyc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary yearlyp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary yearlyh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary yearlyv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary yearlyo = new Elementary(corpt0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary customc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary customp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary customh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary customv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary customo = new Elementary(corpt0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary sdtmmc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtmmp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtmmh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtmmv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtmmo = new Elementary(corpt0ao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary sdtddc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtddp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtddh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtddv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtddo = new Elementary(corpt0ao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary sdtyyyyc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtyyyyp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtyyyyh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtyyyyv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary sdtyyyyo = new Elementary(corpt0ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary edtmmc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtmmp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtmmh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtmmv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtmmo = new Elementary(corpt0ao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary edtddc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtddp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtddh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtddv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtddo = new Elementary(corpt0ao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler33 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary edtyyyyc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtyyyyp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtyyyyh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtyyyyv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary edtyyyyo = new Elementary(corpt0ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler34 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary confirmc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary confirmp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary confirmh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary confirmv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary confirmo = new Elementary(corpt0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler35 = new Filler(corpt0ao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(corpt0ao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(corpt0ao,new AlphanumericType(78));
	

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
	 * Gets the reference for attribute corpt0ai.
	 * @return the corpt0ai attribute reference
	 */
	public RangeReference getCorpt0aiReference() {
		return corpt0ai.getReference();
	}	
				
	/**
	 * Setter for corpt0ai .
	 */
   	public void setCorpt0ai(RangeReference reference) {
       	corpt0ai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute monthlyl.
	 * @return the monthlyl attribute reference
	 */
	public ElementaryRangeReference getMonthlylReference() {
		return monthlyl.getReference();
	}

	/**
	 * Getter for monthlyl attribute.
	 * @return monthlyl attribute
	 */
	public int getMonthlyl() {
		return monthlyl.getValue();
	}

	/**
	 * Setter for monthlyl attribute.
	 * @param monthlyl the new value of monthlyl
	 */
	public void setMonthlyl(int monthlyl) {
		this.monthlyl.setValue(monthlyl);
	}
	/**
	 * Gets the reference for attribute monthlyf.
	 * @return the monthlyf attribute reference
	 */
	public ElementaryRangeReference getMonthlyfReference() {
		return monthlyf.getReference();
	}

	/**
	 * Getter for monthlyf attribute.
	 * @return monthlyf attribute
	 */
	public String getMonthlyf() {
		return monthlyf.getValue();
	}

	/**
	 * Setter for monthlyf attribute.
	 * @param monthlyf the new value of monthlyf
	 */
	public void setMonthlyf(String monthlyf) {
		this.monthlyf.setValue(monthlyf);
	}
	/**
	 * Gets the reference for attribute monthlya.
	 * @return the monthlya attribute reference
	 */
	public ElementaryRangeReference getMonthlyaReference() {
		return monthlya.getReference();
	}

	/**
	 * Getter for monthlya attribute.
	 * @return monthlya attribute
	 */
	public String getMonthlya() {
		return monthlya.getValue();
	}

	/**
	 * Setter for monthlya attribute.
	 * @param monthlya the new value of monthlya
	 */
	public void setMonthlya(String monthlya) {
		this.monthlya.setValue(monthlya);
	}
	/**
	 * Gets the reference for attribute monthlyi.
	 * @return the monthlyi attribute reference
	 */
	public ElementaryRangeReference getMonthlyiReference() {
		return monthlyi.getReference();
	}

	/**
	 * Getter for monthlyi attribute.
	 * @return monthlyi attribute
	 */
	public String getMonthlyi() {
		return monthlyi.getValue();
	}

	/**
	 * Setter for monthlyi attribute.
	 * @param monthlyi the new value of monthlyi
	 */
	public void setMonthlyi(String monthlyi) {
		this.monthlyi.setValue(monthlyi);
	}
	/**
	 * Gets the reference for attribute yearlyl.
	 * @return the yearlyl attribute reference
	 */
	public ElementaryRangeReference getYearlylReference() {
		return yearlyl.getReference();
	}

	/**
	 * Getter for yearlyl attribute.
	 * @return yearlyl attribute
	 */
	public int getYearlyl() {
		return yearlyl.getValue();
	}

	/**
	 * Setter for yearlyl attribute.
	 * @param yearlyl the new value of yearlyl
	 */
	public void setYearlyl(int yearlyl) {
		this.yearlyl.setValue(yearlyl);
	}
	/**
	 * Gets the reference for attribute yearlyf.
	 * @return the yearlyf attribute reference
	 */
	public ElementaryRangeReference getYearlyfReference() {
		return yearlyf.getReference();
	}

	/**
	 * Getter for yearlyf attribute.
	 * @return yearlyf attribute
	 */
	public String getYearlyf() {
		return yearlyf.getValue();
	}

	/**
	 * Setter for yearlyf attribute.
	 * @param yearlyf the new value of yearlyf
	 */
	public void setYearlyf(String yearlyf) {
		this.yearlyf.setValue(yearlyf);
	}
	/**
	 * Gets the reference for attribute yearlya.
	 * @return the yearlya attribute reference
	 */
	public ElementaryRangeReference getYearlyaReference() {
		return yearlya.getReference();
	}

	/**
	 * Getter for yearlya attribute.
	 * @return yearlya attribute
	 */
	public String getYearlya() {
		return yearlya.getValue();
	}

	/**
	 * Setter for yearlya attribute.
	 * @param yearlya the new value of yearlya
	 */
	public void setYearlya(String yearlya) {
		this.yearlya.setValue(yearlya);
	}
	/**
	 * Gets the reference for attribute yearlyi.
	 * @return the yearlyi attribute reference
	 */
	public ElementaryRangeReference getYearlyiReference() {
		return yearlyi.getReference();
	}

	/**
	 * Getter for yearlyi attribute.
	 * @return yearlyi attribute
	 */
	public String getYearlyi() {
		return yearlyi.getValue();
	}

	/**
	 * Setter for yearlyi attribute.
	 * @param yearlyi the new value of yearlyi
	 */
	public void setYearlyi(String yearlyi) {
		this.yearlyi.setValue(yearlyi);
	}
	/**
	 * Gets the reference for attribute customl.
	 * @return the customl attribute reference
	 */
	public ElementaryRangeReference getCustomlReference() {
		return customl.getReference();
	}

	/**
	 * Getter for customl attribute.
	 * @return customl attribute
	 */
	public int getCustoml() {
		return customl.getValue();
	}

	/**
	 * Setter for customl attribute.
	 * @param customl the new value of customl
	 */
	public void setCustoml(int customl) {
		this.customl.setValue(customl);
	}
	/**
	 * Gets the reference for attribute customf.
	 * @return the customf attribute reference
	 */
	public ElementaryRangeReference getCustomfReference() {
		return customf.getReference();
	}

	/**
	 * Getter for customf attribute.
	 * @return customf attribute
	 */
	public String getCustomf() {
		return customf.getValue();
	}

	/**
	 * Setter for customf attribute.
	 * @param customf the new value of customf
	 */
	public void setCustomf(String customf) {
		this.customf.setValue(customf);
	}
	/**
	 * Gets the reference for attribute customa.
	 * @return the customa attribute reference
	 */
	public ElementaryRangeReference getCustomaReference() {
		return customa.getReference();
	}

	/**
	 * Getter for customa attribute.
	 * @return customa attribute
	 */
	public String getCustoma() {
		return customa.getValue();
	}

	/**
	 * Setter for customa attribute.
	 * @param customa the new value of customa
	 */
	public void setCustoma(String customa) {
		this.customa.setValue(customa);
	}
	/**
	 * Gets the reference for attribute customi.
	 * @return the customi attribute reference
	 */
	public ElementaryRangeReference getCustomiReference() {
		return customi.getReference();
	}

	/**
	 * Getter for customi attribute.
	 * @return customi attribute
	 */
	public String getCustomi() {
		return customi.getValue();
	}

	/**
	 * Setter for customi attribute.
	 * @param customi the new value of customi
	 */
	public void setCustomi(String customi) {
		this.customi.setValue(customi);
	}
	/**
	 * Gets the reference for attribute sdtmml.
	 * @return the sdtmml attribute reference
	 */
	public ElementaryRangeReference getSdtmmlReference() {
		return sdtmml.getReference();
	}

	/**
	 * Getter for sdtmml attribute.
	 * @return sdtmml attribute
	 */
	public int getSdtmml() {
		return sdtmml.getValue();
	}

	/**
	 * Setter for sdtmml attribute.
	 * @param sdtmml the new value of sdtmml
	 */
	public void setSdtmml(int sdtmml) {
		this.sdtmml.setValue(sdtmml);
	}
	/**
	 * Gets the reference for attribute sdtmmf.
	 * @return the sdtmmf attribute reference
	 */
	public ElementaryRangeReference getSdtmmfReference() {
		return sdtmmf.getReference();
	}

	/**
	 * Getter for sdtmmf attribute.
	 * @return sdtmmf attribute
	 */
	public String getSdtmmf() {
		return sdtmmf.getValue();
	}

	/**
	 * Setter for sdtmmf attribute.
	 * @param sdtmmf the new value of sdtmmf
	 */
	public void setSdtmmf(String sdtmmf) {
		this.sdtmmf.setValue(sdtmmf);
	}
	/**
	 * Gets the reference for attribute sdtmma.
	 * @return the sdtmma attribute reference
	 */
	public ElementaryRangeReference getSdtmmaReference() {
		return sdtmma.getReference();
	}

	/**
	 * Getter for sdtmma attribute.
	 * @return sdtmma attribute
	 */
	public String getSdtmma() {
		return sdtmma.getValue();
	}

	/**
	 * Setter for sdtmma attribute.
	 * @param sdtmma the new value of sdtmma
	 */
	public void setSdtmma(String sdtmma) {
		this.sdtmma.setValue(sdtmma);
	}
	/**
	 * Gets the reference for attribute sdtmmi.
	 * @return the sdtmmi attribute reference
	 */
	public ElementaryRangeReference getSdtmmiReference() {
		return sdtmmi.getReference();
	}

	/**
	 * Getter for sdtmmi attribute.
	 * @return sdtmmi attribute
	 */
	public String getSdtmmi() {
		return sdtmmi.getValue();
	}

	/**
	 * Setter for sdtmmi attribute.
	 * @param sdtmmi the new value of sdtmmi
	 */
	public void setSdtmmi(String sdtmmi) {
		this.sdtmmi.setValue(sdtmmi);
	}
	/**
	 * Gets the reference for attribute sdtddl.
	 * @return the sdtddl attribute reference
	 */
	public ElementaryRangeReference getSdtddlReference() {
		return sdtddl.getReference();
	}

	/**
	 * Getter for sdtddl attribute.
	 * @return sdtddl attribute
	 */
	public int getSdtddl() {
		return sdtddl.getValue();
	}

	/**
	 * Setter for sdtddl attribute.
	 * @param sdtddl the new value of sdtddl
	 */
	public void setSdtddl(int sdtddl) {
		this.sdtddl.setValue(sdtddl);
	}
	/**
	 * Gets the reference for attribute sdtddf.
	 * @return the sdtddf attribute reference
	 */
	public ElementaryRangeReference getSdtddfReference() {
		return sdtddf.getReference();
	}

	/**
	 * Getter for sdtddf attribute.
	 * @return sdtddf attribute
	 */
	public String getSdtddf() {
		return sdtddf.getValue();
	}

	/**
	 * Setter for sdtddf attribute.
	 * @param sdtddf the new value of sdtddf
	 */
	public void setSdtddf(String sdtddf) {
		this.sdtddf.setValue(sdtddf);
	}
	/**
	 * Gets the reference for attribute sdtdda.
	 * @return the sdtdda attribute reference
	 */
	public ElementaryRangeReference getSdtddaReference() {
		return sdtdda.getReference();
	}

	/**
	 * Getter for sdtdda attribute.
	 * @return sdtdda attribute
	 */
	public String getSdtdda() {
		return sdtdda.getValue();
	}

	/**
	 * Setter for sdtdda attribute.
	 * @param sdtdda the new value of sdtdda
	 */
	public void setSdtdda(String sdtdda) {
		this.sdtdda.setValue(sdtdda);
	}
	/**
	 * Gets the reference for attribute sdtddi.
	 * @return the sdtddi attribute reference
	 */
	public ElementaryRangeReference getSdtddiReference() {
		return sdtddi.getReference();
	}

	/**
	 * Getter for sdtddi attribute.
	 * @return sdtddi attribute
	 */
	public String getSdtddi() {
		return sdtddi.getValue();
	}

	/**
	 * Setter for sdtddi attribute.
	 * @param sdtddi the new value of sdtddi
	 */
	public void setSdtddi(String sdtddi) {
		this.sdtddi.setValue(sdtddi);
	}
	/**
	 * Gets the reference for attribute sdtyyyyl.
	 * @return the sdtyyyyl attribute reference
	 */
	public ElementaryRangeReference getSdtyyyylReference() {
		return sdtyyyyl.getReference();
	}

	/**
	 * Getter for sdtyyyyl attribute.
	 * @return sdtyyyyl attribute
	 */
	public int getSdtyyyyl() {
		return sdtyyyyl.getValue();
	}

	/**
	 * Setter for sdtyyyyl attribute.
	 * @param sdtyyyyl the new value of sdtyyyyl
	 */
	public void setSdtyyyyl(int sdtyyyyl) {
		this.sdtyyyyl.setValue(sdtyyyyl);
	}
	/**
	 * Gets the reference for attribute sdtyyyyf.
	 * @return the sdtyyyyf attribute reference
	 */
	public ElementaryRangeReference getSdtyyyyfReference() {
		return sdtyyyyf.getReference();
	}

	/**
	 * Getter for sdtyyyyf attribute.
	 * @return sdtyyyyf attribute
	 */
	public String getSdtyyyyf() {
		return sdtyyyyf.getValue();
	}

	/**
	 * Setter for sdtyyyyf attribute.
	 * @param sdtyyyyf the new value of sdtyyyyf
	 */
	public void setSdtyyyyf(String sdtyyyyf) {
		this.sdtyyyyf.setValue(sdtyyyyf);
	}
	/**
	 * Gets the reference for attribute sdtyyyya.
	 * @return the sdtyyyya attribute reference
	 */
	public ElementaryRangeReference getSdtyyyyaReference() {
		return sdtyyyya.getReference();
	}

	/**
	 * Getter for sdtyyyya attribute.
	 * @return sdtyyyya attribute
	 */
	public String getSdtyyyya() {
		return sdtyyyya.getValue();
	}

	/**
	 * Setter for sdtyyyya attribute.
	 * @param sdtyyyya the new value of sdtyyyya
	 */
	public void setSdtyyyya(String sdtyyyya) {
		this.sdtyyyya.setValue(sdtyyyya);
	}
	/**
	 * Gets the reference for attribute sdtyyyyi.
	 * @return the sdtyyyyi attribute reference
	 */
	public ElementaryRangeReference getSdtyyyyiReference() {
		return sdtyyyyi.getReference();
	}

	/**
	 * Getter for sdtyyyyi attribute.
	 * @return sdtyyyyi attribute
	 */
	public String getSdtyyyyi() {
		return sdtyyyyi.getValue();
	}

	/**
	 * Setter for sdtyyyyi attribute.
	 * @param sdtyyyyi the new value of sdtyyyyi
	 */
	public void setSdtyyyyi(String sdtyyyyi) {
		this.sdtyyyyi.setValue(sdtyyyyi);
	}
	/**
	 * Gets the reference for attribute edtmml.
	 * @return the edtmml attribute reference
	 */
	public ElementaryRangeReference getEdtmmlReference() {
		return edtmml.getReference();
	}

	/**
	 * Getter for edtmml attribute.
	 * @return edtmml attribute
	 */
	public int getEdtmml() {
		return edtmml.getValue();
	}

	/**
	 * Setter for edtmml attribute.
	 * @param edtmml the new value of edtmml
	 */
	public void setEdtmml(int edtmml) {
		this.edtmml.setValue(edtmml);
	}
	/**
	 * Gets the reference for attribute edtmmf.
	 * @return the edtmmf attribute reference
	 */
	public ElementaryRangeReference getEdtmmfReference() {
		return edtmmf.getReference();
	}

	/**
	 * Getter for edtmmf attribute.
	 * @return edtmmf attribute
	 */
	public String getEdtmmf() {
		return edtmmf.getValue();
	}

	/**
	 * Setter for edtmmf attribute.
	 * @param edtmmf the new value of edtmmf
	 */
	public void setEdtmmf(String edtmmf) {
		this.edtmmf.setValue(edtmmf);
	}
	/**
	 * Gets the reference for attribute edtmma.
	 * @return the edtmma attribute reference
	 */
	public ElementaryRangeReference getEdtmmaReference() {
		return edtmma.getReference();
	}

	/**
	 * Getter for edtmma attribute.
	 * @return edtmma attribute
	 */
	public String getEdtmma() {
		return edtmma.getValue();
	}

	/**
	 * Setter for edtmma attribute.
	 * @param edtmma the new value of edtmma
	 */
	public void setEdtmma(String edtmma) {
		this.edtmma.setValue(edtmma);
	}
	/**
	 * Gets the reference for attribute edtmmi.
	 * @return the edtmmi attribute reference
	 */
	public ElementaryRangeReference getEdtmmiReference() {
		return edtmmi.getReference();
	}

	/**
	 * Getter for edtmmi attribute.
	 * @return edtmmi attribute
	 */
	public String getEdtmmi() {
		return edtmmi.getValue();
	}

	/**
	 * Setter for edtmmi attribute.
	 * @param edtmmi the new value of edtmmi
	 */
	public void setEdtmmi(String edtmmi) {
		this.edtmmi.setValue(edtmmi);
	}
	/**
	 * Gets the reference for attribute edtddl.
	 * @return the edtddl attribute reference
	 */
	public ElementaryRangeReference getEdtddlReference() {
		return edtddl.getReference();
	}

	/**
	 * Getter for edtddl attribute.
	 * @return edtddl attribute
	 */
	public int getEdtddl() {
		return edtddl.getValue();
	}

	/**
	 * Setter for edtddl attribute.
	 * @param edtddl the new value of edtddl
	 */
	public void setEdtddl(int edtddl) {
		this.edtddl.setValue(edtddl);
	}
	/**
	 * Gets the reference for attribute edtddf.
	 * @return the edtddf attribute reference
	 */
	public ElementaryRangeReference getEdtddfReference() {
		return edtddf.getReference();
	}

	/**
	 * Getter for edtddf attribute.
	 * @return edtddf attribute
	 */
	public String getEdtddf() {
		return edtddf.getValue();
	}

	/**
	 * Setter for edtddf attribute.
	 * @param edtddf the new value of edtddf
	 */
	public void setEdtddf(String edtddf) {
		this.edtddf.setValue(edtddf);
	}
	/**
	 * Gets the reference for attribute edtdda.
	 * @return the edtdda attribute reference
	 */
	public ElementaryRangeReference getEdtddaReference() {
		return edtdda.getReference();
	}

	/**
	 * Getter for edtdda attribute.
	 * @return edtdda attribute
	 */
	public String getEdtdda() {
		return edtdda.getValue();
	}

	/**
	 * Setter for edtdda attribute.
	 * @param edtdda the new value of edtdda
	 */
	public void setEdtdda(String edtdda) {
		this.edtdda.setValue(edtdda);
	}
	/**
	 * Gets the reference for attribute edtddi.
	 * @return the edtddi attribute reference
	 */
	public ElementaryRangeReference getEdtddiReference() {
		return edtddi.getReference();
	}

	/**
	 * Getter for edtddi attribute.
	 * @return edtddi attribute
	 */
	public String getEdtddi() {
		return edtddi.getValue();
	}

	/**
	 * Setter for edtddi attribute.
	 * @param edtddi the new value of edtddi
	 */
	public void setEdtddi(String edtddi) {
		this.edtddi.setValue(edtddi);
	}
	/**
	 * Gets the reference for attribute edtyyyyl.
	 * @return the edtyyyyl attribute reference
	 */
	public ElementaryRangeReference getEdtyyyylReference() {
		return edtyyyyl.getReference();
	}

	/**
	 * Getter for edtyyyyl attribute.
	 * @return edtyyyyl attribute
	 */
	public int getEdtyyyyl() {
		return edtyyyyl.getValue();
	}

	/**
	 * Setter for edtyyyyl attribute.
	 * @param edtyyyyl the new value of edtyyyyl
	 */
	public void setEdtyyyyl(int edtyyyyl) {
		this.edtyyyyl.setValue(edtyyyyl);
	}
	/**
	 * Gets the reference for attribute edtyyyyf.
	 * @return the edtyyyyf attribute reference
	 */
	public ElementaryRangeReference getEdtyyyyfReference() {
		return edtyyyyf.getReference();
	}

	/**
	 * Getter for edtyyyyf attribute.
	 * @return edtyyyyf attribute
	 */
	public String getEdtyyyyf() {
		return edtyyyyf.getValue();
	}

	/**
	 * Setter for edtyyyyf attribute.
	 * @param edtyyyyf the new value of edtyyyyf
	 */
	public void setEdtyyyyf(String edtyyyyf) {
		this.edtyyyyf.setValue(edtyyyyf);
	}
	/**
	 * Gets the reference for attribute edtyyyya.
	 * @return the edtyyyya attribute reference
	 */
	public ElementaryRangeReference getEdtyyyyaReference() {
		return edtyyyya.getReference();
	}

	/**
	 * Getter for edtyyyya attribute.
	 * @return edtyyyya attribute
	 */
	public String getEdtyyyya() {
		return edtyyyya.getValue();
	}

	/**
	 * Setter for edtyyyya attribute.
	 * @param edtyyyya the new value of edtyyyya
	 */
	public void setEdtyyyya(String edtyyyya) {
		this.edtyyyya.setValue(edtyyyya);
	}
	/**
	 * Gets the reference for attribute edtyyyyi.
	 * @return the edtyyyyi attribute reference
	 */
	public ElementaryRangeReference getEdtyyyyiReference() {
		return edtyyyyi.getReference();
	}

	/**
	 * Getter for edtyyyyi attribute.
	 * @return edtyyyyi attribute
	 */
	public String getEdtyyyyi() {
		return edtyyyyi.getValue();
	}

	/**
	 * Setter for edtyyyyi attribute.
	 * @param edtyyyyi the new value of edtyyyyi
	 */
	public void setEdtyyyyi(String edtyyyyi) {
		this.edtyyyyi.setValue(edtyyyyi);
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
	 * Gets the reference for attribute corpt0ao.
	 * @return the corpt0ao attribute reference
	 */
	public RangeReference getCorpt0aoReference() {
		return corpt0ao.getReference();
	}	
				
	/**
	 * Setter for corpt0ao .
	 */
   	public void setCorpt0ao(RangeReference reference) {
       	corpt0ao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute monthlyc.
	 * @return the monthlyc attribute reference
	 */
	public ElementaryRangeReference getMonthlycReference() {
		return monthlyc.getReference();
	}

	/**
	 * Getter for monthlyc attribute.
	 * @return monthlyc attribute
	 */
	public String getMonthlyc() {
		return monthlyc.getValue();
	}

	/**
	 * Setter for monthlyc attribute.
	 * @param monthlyc the new value of monthlyc
	 */
	public void setMonthlyc(String monthlyc) {
		this.monthlyc.setValue(monthlyc);
	}
	/**
	 * Gets the reference for attribute monthlyp.
	 * @return the monthlyp attribute reference
	 */
	public ElementaryRangeReference getMonthlypReference() {
		return monthlyp.getReference();
	}

	/**
	 * Getter for monthlyp attribute.
	 * @return monthlyp attribute
	 */
	public String getMonthlyp() {
		return monthlyp.getValue();
	}

	/**
	 * Setter for monthlyp attribute.
	 * @param monthlyp the new value of monthlyp
	 */
	public void setMonthlyp(String monthlyp) {
		this.monthlyp.setValue(monthlyp);
	}
	/**
	 * Gets the reference for attribute monthlyh.
	 * @return the monthlyh attribute reference
	 */
	public ElementaryRangeReference getMonthlyhReference() {
		return monthlyh.getReference();
	}

	/**
	 * Getter for monthlyh attribute.
	 * @return monthlyh attribute
	 */
	public String getMonthlyh() {
		return monthlyh.getValue();
	}

	/**
	 * Setter for monthlyh attribute.
	 * @param monthlyh the new value of monthlyh
	 */
	public void setMonthlyh(String monthlyh) {
		this.monthlyh.setValue(monthlyh);
	}
	/**
	 * Gets the reference for attribute monthlyv.
	 * @return the monthlyv attribute reference
	 */
	public ElementaryRangeReference getMonthlyvReference() {
		return monthlyv.getReference();
	}

	/**
	 * Getter for monthlyv attribute.
	 * @return monthlyv attribute
	 */
	public String getMonthlyv() {
		return monthlyv.getValue();
	}

	/**
	 * Setter for monthlyv attribute.
	 * @param monthlyv the new value of monthlyv
	 */
	public void setMonthlyv(String monthlyv) {
		this.monthlyv.setValue(monthlyv);
	}
	/**
	 * Gets the reference for attribute monthlyo.
	 * @return the monthlyo attribute reference
	 */
	public ElementaryRangeReference getMonthlyoReference() {
		return monthlyo.getReference();
	}

	/**
	 * Getter for monthlyo attribute.
	 * @return monthlyo attribute
	 */
	public String getMonthlyo() {
		return monthlyo.getValue();
	}

	/**
	 * Setter for monthlyo attribute.
	 * @param monthlyo the new value of monthlyo
	 */
	public void setMonthlyo(String monthlyo) {
		this.monthlyo.setValue(monthlyo);
	}
	/**
	 * Gets the reference for attribute yearlyc.
	 * @return the yearlyc attribute reference
	 */
	public ElementaryRangeReference getYearlycReference() {
		return yearlyc.getReference();
	}

	/**
	 * Getter for yearlyc attribute.
	 * @return yearlyc attribute
	 */
	public String getYearlyc() {
		return yearlyc.getValue();
	}

	/**
	 * Setter for yearlyc attribute.
	 * @param yearlyc the new value of yearlyc
	 */
	public void setYearlyc(String yearlyc) {
		this.yearlyc.setValue(yearlyc);
	}
	/**
	 * Gets the reference for attribute yearlyp.
	 * @return the yearlyp attribute reference
	 */
	public ElementaryRangeReference getYearlypReference() {
		return yearlyp.getReference();
	}

	/**
	 * Getter for yearlyp attribute.
	 * @return yearlyp attribute
	 */
	public String getYearlyp() {
		return yearlyp.getValue();
	}

	/**
	 * Setter for yearlyp attribute.
	 * @param yearlyp the new value of yearlyp
	 */
	public void setYearlyp(String yearlyp) {
		this.yearlyp.setValue(yearlyp);
	}
	/**
	 * Gets the reference for attribute yearlyh.
	 * @return the yearlyh attribute reference
	 */
	public ElementaryRangeReference getYearlyhReference() {
		return yearlyh.getReference();
	}

	/**
	 * Getter for yearlyh attribute.
	 * @return yearlyh attribute
	 */
	public String getYearlyh() {
		return yearlyh.getValue();
	}

	/**
	 * Setter for yearlyh attribute.
	 * @param yearlyh the new value of yearlyh
	 */
	public void setYearlyh(String yearlyh) {
		this.yearlyh.setValue(yearlyh);
	}
	/**
	 * Gets the reference for attribute yearlyv.
	 * @return the yearlyv attribute reference
	 */
	public ElementaryRangeReference getYearlyvReference() {
		return yearlyv.getReference();
	}

	/**
	 * Getter for yearlyv attribute.
	 * @return yearlyv attribute
	 */
	public String getYearlyv() {
		return yearlyv.getValue();
	}

	/**
	 * Setter for yearlyv attribute.
	 * @param yearlyv the new value of yearlyv
	 */
	public void setYearlyv(String yearlyv) {
		this.yearlyv.setValue(yearlyv);
	}
	/**
	 * Gets the reference for attribute yearlyo.
	 * @return the yearlyo attribute reference
	 */
	public ElementaryRangeReference getYearlyoReference() {
		return yearlyo.getReference();
	}

	/**
	 * Getter for yearlyo attribute.
	 * @return yearlyo attribute
	 */
	public String getYearlyo() {
		return yearlyo.getValue();
	}

	/**
	 * Setter for yearlyo attribute.
	 * @param yearlyo the new value of yearlyo
	 */
	public void setYearlyo(String yearlyo) {
		this.yearlyo.setValue(yearlyo);
	}
	/**
	 * Gets the reference for attribute customc.
	 * @return the customc attribute reference
	 */
	public ElementaryRangeReference getCustomcReference() {
		return customc.getReference();
	}

	/**
	 * Getter for customc attribute.
	 * @return customc attribute
	 */
	public String getCustomc() {
		return customc.getValue();
	}

	/**
	 * Setter for customc attribute.
	 * @param customc the new value of customc
	 */
	public void setCustomc(String customc) {
		this.customc.setValue(customc);
	}
	/**
	 * Gets the reference for attribute customp.
	 * @return the customp attribute reference
	 */
	public ElementaryRangeReference getCustompReference() {
		return customp.getReference();
	}

	/**
	 * Getter for customp attribute.
	 * @return customp attribute
	 */
	public String getCustomp() {
		return customp.getValue();
	}

	/**
	 * Setter for customp attribute.
	 * @param customp the new value of customp
	 */
	public void setCustomp(String customp) {
		this.customp.setValue(customp);
	}
	/**
	 * Gets the reference for attribute customh.
	 * @return the customh attribute reference
	 */
	public ElementaryRangeReference getCustomhReference() {
		return customh.getReference();
	}

	/**
	 * Getter for customh attribute.
	 * @return customh attribute
	 */
	public String getCustomh() {
		return customh.getValue();
	}

	/**
	 * Setter for customh attribute.
	 * @param customh the new value of customh
	 */
	public void setCustomh(String customh) {
		this.customh.setValue(customh);
	}
	/**
	 * Gets the reference for attribute customv.
	 * @return the customv attribute reference
	 */
	public ElementaryRangeReference getCustomvReference() {
		return customv.getReference();
	}

	/**
	 * Getter for customv attribute.
	 * @return customv attribute
	 */
	public String getCustomv() {
		return customv.getValue();
	}

	/**
	 * Setter for customv attribute.
	 * @param customv the new value of customv
	 */
	public void setCustomv(String customv) {
		this.customv.setValue(customv);
	}
	/**
	 * Gets the reference for attribute customo.
	 * @return the customo attribute reference
	 */
	public ElementaryRangeReference getCustomoReference() {
		return customo.getReference();
	}

	/**
	 * Getter for customo attribute.
	 * @return customo attribute
	 */
	public String getCustomo() {
		return customo.getValue();
	}

	/**
	 * Setter for customo attribute.
	 * @param customo the new value of customo
	 */
	public void setCustomo(String customo) {
		this.customo.setValue(customo);
	}
	/**
	 * Gets the reference for attribute sdtmmc.
	 * @return the sdtmmc attribute reference
	 */
	public ElementaryRangeReference getSdtmmcReference() {
		return sdtmmc.getReference();
	}

	/**
	 * Getter for sdtmmc attribute.
	 * @return sdtmmc attribute
	 */
	public String getSdtmmc() {
		return sdtmmc.getValue();
	}

	/**
	 * Setter for sdtmmc attribute.
	 * @param sdtmmc the new value of sdtmmc
	 */
	public void setSdtmmc(String sdtmmc) {
		this.sdtmmc.setValue(sdtmmc);
	}
	/**
	 * Gets the reference for attribute sdtmmp.
	 * @return the sdtmmp attribute reference
	 */
	public ElementaryRangeReference getSdtmmpReference() {
		return sdtmmp.getReference();
	}

	/**
	 * Getter for sdtmmp attribute.
	 * @return sdtmmp attribute
	 */
	public String getSdtmmp() {
		return sdtmmp.getValue();
	}

	/**
	 * Setter for sdtmmp attribute.
	 * @param sdtmmp the new value of sdtmmp
	 */
	public void setSdtmmp(String sdtmmp) {
		this.sdtmmp.setValue(sdtmmp);
	}
	/**
	 * Gets the reference for attribute sdtmmh.
	 * @return the sdtmmh attribute reference
	 */
	public ElementaryRangeReference getSdtmmhReference() {
		return sdtmmh.getReference();
	}

	/**
	 * Getter for sdtmmh attribute.
	 * @return sdtmmh attribute
	 */
	public String getSdtmmh() {
		return sdtmmh.getValue();
	}

	/**
	 * Setter for sdtmmh attribute.
	 * @param sdtmmh the new value of sdtmmh
	 */
	public void setSdtmmh(String sdtmmh) {
		this.sdtmmh.setValue(sdtmmh);
	}
	/**
	 * Gets the reference for attribute sdtmmv.
	 * @return the sdtmmv attribute reference
	 */
	public ElementaryRangeReference getSdtmmvReference() {
		return sdtmmv.getReference();
	}

	/**
	 * Getter for sdtmmv attribute.
	 * @return sdtmmv attribute
	 */
	public String getSdtmmv() {
		return sdtmmv.getValue();
	}

	/**
	 * Setter for sdtmmv attribute.
	 * @param sdtmmv the new value of sdtmmv
	 */
	public void setSdtmmv(String sdtmmv) {
		this.sdtmmv.setValue(sdtmmv);
	}
	/**
	 * Gets the reference for attribute sdtmmo.
	 * @return the sdtmmo attribute reference
	 */
	public ElementaryRangeReference getSdtmmoReference() {
		return sdtmmo.getReference();
	}

	/**
	 * Getter for sdtmmo attribute.
	 * @return sdtmmo attribute
	 */
	public String getSdtmmo() {
		return sdtmmo.getValue();
	}

	/**
	 * Setter for sdtmmo attribute.
	 * @param sdtmmo the new value of sdtmmo
	 */
	public void setSdtmmo(String sdtmmo) {
		this.sdtmmo.setValue(sdtmmo);
	}
	/**
	 * Gets the reference for attribute sdtddc.
	 * @return the sdtddc attribute reference
	 */
	public ElementaryRangeReference getSdtddcReference() {
		return sdtddc.getReference();
	}

	/**
	 * Getter for sdtddc attribute.
	 * @return sdtddc attribute
	 */
	public String getSdtddc() {
		return sdtddc.getValue();
	}

	/**
	 * Setter for sdtddc attribute.
	 * @param sdtddc the new value of sdtddc
	 */
	public void setSdtddc(String sdtddc) {
		this.sdtddc.setValue(sdtddc);
	}
	/**
	 * Gets the reference for attribute sdtddp.
	 * @return the sdtddp attribute reference
	 */
	public ElementaryRangeReference getSdtddpReference() {
		return sdtddp.getReference();
	}

	/**
	 * Getter for sdtddp attribute.
	 * @return sdtddp attribute
	 */
	public String getSdtddp() {
		return sdtddp.getValue();
	}

	/**
	 * Setter for sdtddp attribute.
	 * @param sdtddp the new value of sdtddp
	 */
	public void setSdtddp(String sdtddp) {
		this.sdtddp.setValue(sdtddp);
	}
	/**
	 * Gets the reference for attribute sdtddh.
	 * @return the sdtddh attribute reference
	 */
	public ElementaryRangeReference getSdtddhReference() {
		return sdtddh.getReference();
	}

	/**
	 * Getter for sdtddh attribute.
	 * @return sdtddh attribute
	 */
	public String getSdtddh() {
		return sdtddh.getValue();
	}

	/**
	 * Setter for sdtddh attribute.
	 * @param sdtddh the new value of sdtddh
	 */
	public void setSdtddh(String sdtddh) {
		this.sdtddh.setValue(sdtddh);
	}
	/**
	 * Gets the reference for attribute sdtddv.
	 * @return the sdtddv attribute reference
	 */
	public ElementaryRangeReference getSdtddvReference() {
		return sdtddv.getReference();
	}

	/**
	 * Getter for sdtddv attribute.
	 * @return sdtddv attribute
	 */
	public String getSdtddv() {
		return sdtddv.getValue();
	}

	/**
	 * Setter for sdtddv attribute.
	 * @param sdtddv the new value of sdtddv
	 */
	public void setSdtddv(String sdtddv) {
		this.sdtddv.setValue(sdtddv);
	}
	/**
	 * Gets the reference for attribute sdtddo.
	 * @return the sdtddo attribute reference
	 */
	public ElementaryRangeReference getSdtddoReference() {
		return sdtddo.getReference();
	}

	/**
	 * Getter for sdtddo attribute.
	 * @return sdtddo attribute
	 */
	public String getSdtddo() {
		return sdtddo.getValue();
	}

	/**
	 * Setter for sdtddo attribute.
	 * @param sdtddo the new value of sdtddo
	 */
	public void setSdtddo(String sdtddo) {
		this.sdtddo.setValue(sdtddo);
	}
	/**
	 * Gets the reference for attribute sdtyyyyc.
	 * @return the sdtyyyyc attribute reference
	 */
	public ElementaryRangeReference getSdtyyyycReference() {
		return sdtyyyyc.getReference();
	}

	/**
	 * Getter for sdtyyyyc attribute.
	 * @return sdtyyyyc attribute
	 */
	public String getSdtyyyyc() {
		return sdtyyyyc.getValue();
	}

	/**
	 * Setter for sdtyyyyc attribute.
	 * @param sdtyyyyc the new value of sdtyyyyc
	 */
	public void setSdtyyyyc(String sdtyyyyc) {
		this.sdtyyyyc.setValue(sdtyyyyc);
	}
	/**
	 * Gets the reference for attribute sdtyyyyp.
	 * @return the sdtyyyyp attribute reference
	 */
	public ElementaryRangeReference getSdtyyyypReference() {
		return sdtyyyyp.getReference();
	}

	/**
	 * Getter for sdtyyyyp attribute.
	 * @return sdtyyyyp attribute
	 */
	public String getSdtyyyyp() {
		return sdtyyyyp.getValue();
	}

	/**
	 * Setter for sdtyyyyp attribute.
	 * @param sdtyyyyp the new value of sdtyyyyp
	 */
	public void setSdtyyyyp(String sdtyyyyp) {
		this.sdtyyyyp.setValue(sdtyyyyp);
	}
	/**
	 * Gets the reference for attribute sdtyyyyh.
	 * @return the sdtyyyyh attribute reference
	 */
	public ElementaryRangeReference getSdtyyyyhReference() {
		return sdtyyyyh.getReference();
	}

	/**
	 * Getter for sdtyyyyh attribute.
	 * @return sdtyyyyh attribute
	 */
	public String getSdtyyyyh() {
		return sdtyyyyh.getValue();
	}

	/**
	 * Setter for sdtyyyyh attribute.
	 * @param sdtyyyyh the new value of sdtyyyyh
	 */
	public void setSdtyyyyh(String sdtyyyyh) {
		this.sdtyyyyh.setValue(sdtyyyyh);
	}
	/**
	 * Gets the reference for attribute sdtyyyyv.
	 * @return the sdtyyyyv attribute reference
	 */
	public ElementaryRangeReference getSdtyyyyvReference() {
		return sdtyyyyv.getReference();
	}

	/**
	 * Getter for sdtyyyyv attribute.
	 * @return sdtyyyyv attribute
	 */
	public String getSdtyyyyv() {
		return sdtyyyyv.getValue();
	}

	/**
	 * Setter for sdtyyyyv attribute.
	 * @param sdtyyyyv the new value of sdtyyyyv
	 */
	public void setSdtyyyyv(String sdtyyyyv) {
		this.sdtyyyyv.setValue(sdtyyyyv);
	}
	/**
	 * Gets the reference for attribute sdtyyyyo.
	 * @return the sdtyyyyo attribute reference
	 */
	public ElementaryRangeReference getSdtyyyyoReference() {
		return sdtyyyyo.getReference();
	}

	/**
	 * Getter for sdtyyyyo attribute.
	 * @return sdtyyyyo attribute
	 */
	public String getSdtyyyyo() {
		return sdtyyyyo.getValue();
	}

	/**
	 * Setter for sdtyyyyo attribute.
	 * @param sdtyyyyo the new value of sdtyyyyo
	 */
	public void setSdtyyyyo(String sdtyyyyo) {
		this.sdtyyyyo.setValue(sdtyyyyo);
	}
	/**
	 * Gets the reference for attribute edtmmc.
	 * @return the edtmmc attribute reference
	 */
	public ElementaryRangeReference getEdtmmcReference() {
		return edtmmc.getReference();
	}

	/**
	 * Getter for edtmmc attribute.
	 * @return edtmmc attribute
	 */
	public String getEdtmmc() {
		return edtmmc.getValue();
	}

	/**
	 * Setter for edtmmc attribute.
	 * @param edtmmc the new value of edtmmc
	 */
	public void setEdtmmc(String edtmmc) {
		this.edtmmc.setValue(edtmmc);
	}
	/**
	 * Gets the reference for attribute edtmmp.
	 * @return the edtmmp attribute reference
	 */
	public ElementaryRangeReference getEdtmmpReference() {
		return edtmmp.getReference();
	}

	/**
	 * Getter for edtmmp attribute.
	 * @return edtmmp attribute
	 */
	public String getEdtmmp() {
		return edtmmp.getValue();
	}

	/**
	 * Setter for edtmmp attribute.
	 * @param edtmmp the new value of edtmmp
	 */
	public void setEdtmmp(String edtmmp) {
		this.edtmmp.setValue(edtmmp);
	}
	/**
	 * Gets the reference for attribute edtmmh.
	 * @return the edtmmh attribute reference
	 */
	public ElementaryRangeReference getEdtmmhReference() {
		return edtmmh.getReference();
	}

	/**
	 * Getter for edtmmh attribute.
	 * @return edtmmh attribute
	 */
	public String getEdtmmh() {
		return edtmmh.getValue();
	}

	/**
	 * Setter for edtmmh attribute.
	 * @param edtmmh the new value of edtmmh
	 */
	public void setEdtmmh(String edtmmh) {
		this.edtmmh.setValue(edtmmh);
	}
	/**
	 * Gets the reference for attribute edtmmv.
	 * @return the edtmmv attribute reference
	 */
	public ElementaryRangeReference getEdtmmvReference() {
		return edtmmv.getReference();
	}

	/**
	 * Getter for edtmmv attribute.
	 * @return edtmmv attribute
	 */
	public String getEdtmmv() {
		return edtmmv.getValue();
	}

	/**
	 * Setter for edtmmv attribute.
	 * @param edtmmv the new value of edtmmv
	 */
	public void setEdtmmv(String edtmmv) {
		this.edtmmv.setValue(edtmmv);
	}
	/**
	 * Gets the reference for attribute edtmmo.
	 * @return the edtmmo attribute reference
	 */
	public ElementaryRangeReference getEdtmmoReference() {
		return edtmmo.getReference();
	}

	/**
	 * Getter for edtmmo attribute.
	 * @return edtmmo attribute
	 */
	public String getEdtmmo() {
		return edtmmo.getValue();
	}

	/**
	 * Setter for edtmmo attribute.
	 * @param edtmmo the new value of edtmmo
	 */
	public void setEdtmmo(String edtmmo) {
		this.edtmmo.setValue(edtmmo);
	}
	/**
	 * Gets the reference for attribute edtddc.
	 * @return the edtddc attribute reference
	 */
	public ElementaryRangeReference getEdtddcReference() {
		return edtddc.getReference();
	}

	/**
	 * Getter for edtddc attribute.
	 * @return edtddc attribute
	 */
	public String getEdtddc() {
		return edtddc.getValue();
	}

	/**
	 * Setter for edtddc attribute.
	 * @param edtddc the new value of edtddc
	 */
	public void setEdtddc(String edtddc) {
		this.edtddc.setValue(edtddc);
	}
	/**
	 * Gets the reference for attribute edtddp.
	 * @return the edtddp attribute reference
	 */
	public ElementaryRangeReference getEdtddpReference() {
		return edtddp.getReference();
	}

	/**
	 * Getter for edtddp attribute.
	 * @return edtddp attribute
	 */
	public String getEdtddp() {
		return edtddp.getValue();
	}

	/**
	 * Setter for edtddp attribute.
	 * @param edtddp the new value of edtddp
	 */
	public void setEdtddp(String edtddp) {
		this.edtddp.setValue(edtddp);
	}
	/**
	 * Gets the reference for attribute edtddh.
	 * @return the edtddh attribute reference
	 */
	public ElementaryRangeReference getEdtddhReference() {
		return edtddh.getReference();
	}

	/**
	 * Getter for edtddh attribute.
	 * @return edtddh attribute
	 */
	public String getEdtddh() {
		return edtddh.getValue();
	}

	/**
	 * Setter for edtddh attribute.
	 * @param edtddh the new value of edtddh
	 */
	public void setEdtddh(String edtddh) {
		this.edtddh.setValue(edtddh);
	}
	/**
	 * Gets the reference for attribute edtddv.
	 * @return the edtddv attribute reference
	 */
	public ElementaryRangeReference getEdtddvReference() {
		return edtddv.getReference();
	}

	/**
	 * Getter for edtddv attribute.
	 * @return edtddv attribute
	 */
	public String getEdtddv() {
		return edtddv.getValue();
	}

	/**
	 * Setter for edtddv attribute.
	 * @param edtddv the new value of edtddv
	 */
	public void setEdtddv(String edtddv) {
		this.edtddv.setValue(edtddv);
	}
	/**
	 * Gets the reference for attribute edtddo.
	 * @return the edtddo attribute reference
	 */
	public ElementaryRangeReference getEdtddoReference() {
		return edtddo.getReference();
	}

	/**
	 * Getter for edtddo attribute.
	 * @return edtddo attribute
	 */
	public String getEdtddo() {
		return edtddo.getValue();
	}

	/**
	 * Setter for edtddo attribute.
	 * @param edtddo the new value of edtddo
	 */
	public void setEdtddo(String edtddo) {
		this.edtddo.setValue(edtddo);
	}
	/**
	 * Gets the reference for attribute edtyyyyc.
	 * @return the edtyyyyc attribute reference
	 */
	public ElementaryRangeReference getEdtyyyycReference() {
		return edtyyyyc.getReference();
	}

	/**
	 * Getter for edtyyyyc attribute.
	 * @return edtyyyyc attribute
	 */
	public String getEdtyyyyc() {
		return edtyyyyc.getValue();
	}

	/**
	 * Setter for edtyyyyc attribute.
	 * @param edtyyyyc the new value of edtyyyyc
	 */
	public void setEdtyyyyc(String edtyyyyc) {
		this.edtyyyyc.setValue(edtyyyyc);
	}
	/**
	 * Gets the reference for attribute edtyyyyp.
	 * @return the edtyyyyp attribute reference
	 */
	public ElementaryRangeReference getEdtyyyypReference() {
		return edtyyyyp.getReference();
	}

	/**
	 * Getter for edtyyyyp attribute.
	 * @return edtyyyyp attribute
	 */
	public String getEdtyyyyp() {
		return edtyyyyp.getValue();
	}

	/**
	 * Setter for edtyyyyp attribute.
	 * @param edtyyyyp the new value of edtyyyyp
	 */
	public void setEdtyyyyp(String edtyyyyp) {
		this.edtyyyyp.setValue(edtyyyyp);
	}
	/**
	 * Gets the reference for attribute edtyyyyh.
	 * @return the edtyyyyh attribute reference
	 */
	public ElementaryRangeReference getEdtyyyyhReference() {
		return edtyyyyh.getReference();
	}

	/**
	 * Getter for edtyyyyh attribute.
	 * @return edtyyyyh attribute
	 */
	public String getEdtyyyyh() {
		return edtyyyyh.getValue();
	}

	/**
	 * Setter for edtyyyyh attribute.
	 * @param edtyyyyh the new value of edtyyyyh
	 */
	public void setEdtyyyyh(String edtyyyyh) {
		this.edtyyyyh.setValue(edtyyyyh);
	}
	/**
	 * Gets the reference for attribute edtyyyyv.
	 * @return the edtyyyyv attribute reference
	 */
	public ElementaryRangeReference getEdtyyyyvReference() {
		return edtyyyyv.getReference();
	}

	/**
	 * Getter for edtyyyyv attribute.
	 * @return edtyyyyv attribute
	 */
	public String getEdtyyyyv() {
		return edtyyyyv.getValue();
	}

	/**
	 * Setter for edtyyyyv attribute.
	 * @param edtyyyyv the new value of edtyyyyv
	 */
	public void setEdtyyyyv(String edtyyyyv) {
		this.edtyyyyv.setValue(edtyyyyv);
	}
	/**
	 * Gets the reference for attribute edtyyyyo.
	 * @return the edtyyyyo attribute reference
	 */
	public ElementaryRangeReference getEdtyyyyoReference() {
		return edtyyyyo.getReference();
	}

	/**
	 * Getter for edtyyyyo attribute.
	 * @return edtyyyyo attribute
	 */
	public String getEdtyyyyo() {
		return edtyyyyo.getValue();
	}

	/**
	 * Setter for edtyyyyo attribute.
	 * @param edtyyyyo the new value of edtyyyyo
	 */
	public void setEdtyyyyo(String edtyyyyo) {
		this.edtyyyyo.setValue(edtyyyyo);
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
