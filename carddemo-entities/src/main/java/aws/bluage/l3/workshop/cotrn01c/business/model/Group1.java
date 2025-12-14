package aws.bluage.l3.workshop.cotrn01c.business.model;

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
 * <p>About 'cotrn1ai' field, <br>uml entity: aws.bluage.l3.workshop.cotrn01c.business.model.Cotrn1ai
 * <br></p>
 * 
 * <p>About 'cotrn1ao' field, <br>uml entity: aws.bluage.l3.workshop.cotrn01c.business.model.Cotrn1ao
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
	private final Group cotrn1ai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cotrn1ai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(cotrn1ai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(cotrn1ai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(cotrn1ai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(cotrn1ai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(cotrn1ai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(cotrn1ai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(cotrn1ai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(cotrn1ai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(cotrn1ai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(cotrn1ai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(cotrn1ai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(cotrn1ai,new AlphanumericType(8));
	private final Elementary trnidinl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(cotrn1ai);
	private final Elementary trnidinf = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary trnidina = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary trnidini = new Elementary(cotrn1ai,new AlphanumericType(16));
	private final Elementary trnidl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(cotrn1ai);
	private final Elementary trnidf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary trnida = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary trnidi = new Elementary(cotrn1ai,new AlphanumericType(16));
	private final Elementary cardnuml = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(cotrn1ai);
	private final Elementary cardnumf = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary cardnuma = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary cardnumi = new Elementary(cotrn1ai,new AlphanumericType(16));
	private final Elementary ttypcdl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(cotrn1ai);
	private final Elementary ttypcdf = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary ttypcda = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary ttypcdi = new Elementary(cotrn1ai,new AlphanumericType(2));
	private final Elementary tcatcdl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(cotrn1ai);
	private final Elementary tcatcdf = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary tcatcda = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary tcatcdi = new Elementary(cotrn1ai,new AlphanumericType(4));
	private final Elementary trnsrcl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(cotrn1ai);
	private final Elementary trnsrcf = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary trnsrca = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary trnsrci = new Elementary(cotrn1ai,new AlphanumericType(10));
	private final Elementary tdescl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union13 = new Union(cotrn1ai);
	private final Elementary tdescf = new Elementary(union13,new AlphanumericType(1));
	private final Group group12 = new Group(union13);
	private final Elementary tdesca = new Elementary(group12,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary tdesci = new Elementary(cotrn1ai,new AlphanumericType(60));
	private final Elementary trnamtl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union14 = new Union(cotrn1ai);
	private final Elementary trnamtf = new Elementary(union14,new AlphanumericType(1));
	private final Group group13 = new Group(union14);
	private final Elementary trnamta = new Elementary(group13,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary trnamti = new Elementary(cotrn1ai,new AlphanumericType(12));
	private final Elementary torigdtl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union15 = new Union(cotrn1ai);
	private final Elementary torigdtf = new Elementary(union15,new AlphanumericType(1));
	private final Group group14 = new Group(union15);
	private final Elementary torigdta = new Elementary(group14,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary torigdti = new Elementary(cotrn1ai,new AlphanumericType(10));
	private final Elementary tprocdtl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union16 = new Union(cotrn1ai);
	private final Elementary tprocdtf = new Elementary(union16,new AlphanumericType(1));
	private final Group group15 = new Group(union16);
	private final Elementary tprocdta = new Elementary(group15,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary tprocdti = new Elementary(cotrn1ai,new AlphanumericType(10));
	private final Elementary midl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union17 = new Union(cotrn1ai);
	private final Elementary midf = new Elementary(union17,new AlphanumericType(1));
	private final Group group16 = new Group(union17);
	private final Elementary mida = new Elementary(group16,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary midi = new Elementary(cotrn1ai,new AlphanumericType(9));
	private final Elementary mnamel = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union18 = new Union(cotrn1ai);
	private final Elementary mnamef = new Elementary(union18,new AlphanumericType(1));
	private final Group group17 = new Group(union18);
	private final Elementary mnamea = new Elementary(group17,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary mnamei = new Elementary(cotrn1ai,new AlphanumericType(30));
	private final Elementary mcityl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union19 = new Union(cotrn1ai);
	private final Elementary mcityf = new Elementary(union19,new AlphanumericType(1));
	private final Group group18 = new Group(union19);
	private final Elementary mcitya = new Elementary(group18,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary mcityi = new Elementary(cotrn1ai,new AlphanumericType(25));
	private final Elementary mzipl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union20 = new Union(cotrn1ai);
	private final Elementary mzipf = new Elementary(union20,new AlphanumericType(1));
	private final Group group19 = new Group(union20);
	private final Elementary mzipa = new Elementary(group19,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary mzipi = new Elementary(cotrn1ai,new AlphanumericType(10));
	private final Elementary errmsgl = new Elementary(cotrn1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union21 = new Union(cotrn1ai);
	private final Elementary errmsgf = new Elementary(union21,new AlphanumericType(1));
	private final Group group20 = new Group(union21);
	private final Elementary errmsga = new Elementary(group20,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(cotrn1ai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(cotrn1ai,new AlphanumericType(78));
	private final Group cotrn1ao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(cotrn1ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(cotrn1ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(cotrn1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(cotrn1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(cotrn1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(cotrn1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(cotrn1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary trnidinc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnidinp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnidinh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnidinv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnidino = new Elementary(cotrn1ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary trnidc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnidp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnidh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnidv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnido = new Elementary(cotrn1ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary cardnumc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary cardnump = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary cardnumh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary cardnumv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary cardnumo = new Elementary(cotrn1ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary ttypcdc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary ttypcdp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary ttypcdh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary ttypcdv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary ttypcdo = new Elementary(cotrn1ao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler33 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary tcatcdc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tcatcdp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tcatcdh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tcatcdv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tcatcdo = new Elementary(cotrn1ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler34 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary trnsrcc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnsrcp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnsrch = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnsrcv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnsrco = new Elementary(cotrn1ao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler35 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary tdescc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tdescp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tdesch = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tdescv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tdesco = new Elementary(cotrn1ao,new AlphanumericType(60));
	@SuppressWarnings("unused")
	private final Filler filler36 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary trnamtc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnamtp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnamth = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnamtv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary trnamto = new Elementary(cotrn1ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler37 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary torigdtc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary torigdtp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary torigdth = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary torigdtv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary torigdto = new Elementary(cotrn1ao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler38 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary tprocdtc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tprocdtp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tprocdth = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tprocdtv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary tprocdto = new Elementary(cotrn1ao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler39 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary midc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary midp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary midh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary midv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mido = new Elementary(cotrn1ao,new AlphanumericType(9));
	@SuppressWarnings("unused")
	private final Filler filler40 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary mnamec = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mnamep = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mnameh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mnamev = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mnameo = new Elementary(cotrn1ao,new AlphanumericType(30));
	@SuppressWarnings("unused")
	private final Filler filler41 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary mcityc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mcityp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mcityh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mcityv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mcityo = new Elementary(cotrn1ao,new AlphanumericType(25));
	@SuppressWarnings("unused")
	private final Filler filler42 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary mzipc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mzipp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mziph = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mzipv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary mzipo = new Elementary(cotrn1ao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler43 = new Filler(cotrn1ao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(cotrn1ao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(cotrn1ao,new AlphanumericType(78));
	

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
	 * Gets the reference for attribute cotrn1ai.
	 * @return the cotrn1ai attribute reference
	 */
	public RangeReference getCotrn1aiReference() {
		return cotrn1ai.getReference();
	}	
				
	/**
	 * Setter for cotrn1ai .
	 */
   	public void setCotrn1ai(RangeReference reference) {
       	cotrn1ai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute trnidinl.
	 * @return the trnidinl attribute reference
	 */
	public ElementaryRangeReference getTrnidinlReference() {
		return trnidinl.getReference();
	}

	/**
	 * Getter for trnidinl attribute.
	 * @return trnidinl attribute
	 */
	public int getTrnidinl() {
		return trnidinl.getValue();
	}

	/**
	 * Setter for trnidinl attribute.
	 * @param trnidinl the new value of trnidinl
	 */
	public void setTrnidinl(int trnidinl) {
		this.trnidinl.setValue(trnidinl);
	}
	/**
	 * Gets the reference for attribute trnidinf.
	 * @return the trnidinf attribute reference
	 */
	public ElementaryRangeReference getTrnidinfReference() {
		return trnidinf.getReference();
	}

	/**
	 * Getter for trnidinf attribute.
	 * @return trnidinf attribute
	 */
	public String getTrnidinf() {
		return trnidinf.getValue();
	}

	/**
	 * Setter for trnidinf attribute.
	 * @param trnidinf the new value of trnidinf
	 */
	public void setTrnidinf(String trnidinf) {
		this.trnidinf.setValue(trnidinf);
	}
	/**
	 * Gets the reference for attribute trnidina.
	 * @return the trnidina attribute reference
	 */
	public ElementaryRangeReference getTrnidinaReference() {
		return trnidina.getReference();
	}

	/**
	 * Getter for trnidina attribute.
	 * @return trnidina attribute
	 */
	public String getTrnidina() {
		return trnidina.getValue();
	}

	/**
	 * Setter for trnidina attribute.
	 * @param trnidina the new value of trnidina
	 */
	public void setTrnidina(String trnidina) {
		this.trnidina.setValue(trnidina);
	}
	/**
	 * Gets the reference for attribute trnidini.
	 * @return the trnidini attribute reference
	 */
	public ElementaryRangeReference getTrnidiniReference() {
		return trnidini.getReference();
	}

	/**
	 * Getter for trnidini attribute.
	 * @return trnidini attribute
	 */
	public String getTrnidini() {
		return trnidini.getValue();
	}

	/**
	 * Setter for trnidini attribute.
	 * @param trnidini the new value of trnidini
	 */
	public void setTrnidini(String trnidini) {
		this.trnidini.setValue(trnidini);
	}
	/**
	 * Gets the reference for attribute trnidl.
	 * @return the trnidl attribute reference
	 */
	public ElementaryRangeReference getTrnidlReference() {
		return trnidl.getReference();
	}

	/**
	 * Getter for trnidl attribute.
	 * @return trnidl attribute
	 */
	public int getTrnidl() {
		return trnidl.getValue();
	}

	/**
	 * Setter for trnidl attribute.
	 * @param trnidl the new value of trnidl
	 */
	public void setTrnidl(int trnidl) {
		this.trnidl.setValue(trnidl);
	}
	/**
	 * Gets the reference for attribute trnidf.
	 * @return the trnidf attribute reference
	 */
	public ElementaryRangeReference getTrnidfReference() {
		return trnidf.getReference();
	}

	/**
	 * Getter for trnidf attribute.
	 * @return trnidf attribute
	 */
	public String getTrnidf() {
		return trnidf.getValue();
	}

	/**
	 * Setter for trnidf attribute.
	 * @param trnidf the new value of trnidf
	 */
	public void setTrnidf(String trnidf) {
		this.trnidf.setValue(trnidf);
	}
	/**
	 * Gets the reference for attribute trnida.
	 * @return the trnida attribute reference
	 */
	public ElementaryRangeReference getTrnidaReference() {
		return trnida.getReference();
	}

	/**
	 * Getter for trnida attribute.
	 * @return trnida attribute
	 */
	public String getTrnida() {
		return trnida.getValue();
	}

	/**
	 * Setter for trnida attribute.
	 * @param trnida the new value of trnida
	 */
	public void setTrnida(String trnida) {
		this.trnida.setValue(trnida);
	}
	/**
	 * Gets the reference for attribute trnidi.
	 * @return the trnidi attribute reference
	 */
	public ElementaryRangeReference getTrnidiReference() {
		return trnidi.getReference();
	}

	/**
	 * Getter for trnidi attribute.
	 * @return trnidi attribute
	 */
	public String getTrnidi() {
		return trnidi.getValue();
	}

	/**
	 * Setter for trnidi attribute.
	 * @param trnidi the new value of trnidi
	 */
	public void setTrnidi(String trnidi) {
		this.trnidi.setValue(trnidi);
	}
	/**
	 * Gets the reference for attribute cardnuml.
	 * @return the cardnuml attribute reference
	 */
	public ElementaryRangeReference getCardnumlReference() {
		return cardnuml.getReference();
	}

	/**
	 * Getter for cardnuml attribute.
	 * @return cardnuml attribute
	 */
	public int getCardnuml() {
		return cardnuml.getValue();
	}

	/**
	 * Setter for cardnuml attribute.
	 * @param cardnuml the new value of cardnuml
	 */
	public void setCardnuml(int cardnuml) {
		this.cardnuml.setValue(cardnuml);
	}
	/**
	 * Gets the reference for attribute cardnumf.
	 * @return the cardnumf attribute reference
	 */
	public ElementaryRangeReference getCardnumfReference() {
		return cardnumf.getReference();
	}

	/**
	 * Getter for cardnumf attribute.
	 * @return cardnumf attribute
	 */
	public String getCardnumf() {
		return cardnumf.getValue();
	}

	/**
	 * Setter for cardnumf attribute.
	 * @param cardnumf the new value of cardnumf
	 */
	public void setCardnumf(String cardnumf) {
		this.cardnumf.setValue(cardnumf);
	}
	/**
	 * Gets the reference for attribute cardnuma.
	 * @return the cardnuma attribute reference
	 */
	public ElementaryRangeReference getCardnumaReference() {
		return cardnuma.getReference();
	}

	/**
	 * Getter for cardnuma attribute.
	 * @return cardnuma attribute
	 */
	public String getCardnuma() {
		return cardnuma.getValue();
	}

	/**
	 * Setter for cardnuma attribute.
	 * @param cardnuma the new value of cardnuma
	 */
	public void setCardnuma(String cardnuma) {
		this.cardnuma.setValue(cardnuma);
	}
	/**
	 * Gets the reference for attribute cardnumi.
	 * @return the cardnumi attribute reference
	 */
	public ElementaryRangeReference getCardnumiReference() {
		return cardnumi.getReference();
	}

	/**
	 * Getter for cardnumi attribute.
	 * @return cardnumi attribute
	 */
	public String getCardnumi() {
		return cardnumi.getValue();
	}

	/**
	 * Setter for cardnumi attribute.
	 * @param cardnumi the new value of cardnumi
	 */
	public void setCardnumi(String cardnumi) {
		this.cardnumi.setValue(cardnumi);
	}
	/**
	 * Gets the reference for attribute ttypcdl.
	 * @return the ttypcdl attribute reference
	 */
	public ElementaryRangeReference getTtypcdlReference() {
		return ttypcdl.getReference();
	}

	/**
	 * Getter for ttypcdl attribute.
	 * @return ttypcdl attribute
	 */
	public int getTtypcdl() {
		return ttypcdl.getValue();
	}

	/**
	 * Setter for ttypcdl attribute.
	 * @param ttypcdl the new value of ttypcdl
	 */
	public void setTtypcdl(int ttypcdl) {
		this.ttypcdl.setValue(ttypcdl);
	}
	/**
	 * Gets the reference for attribute ttypcdf.
	 * @return the ttypcdf attribute reference
	 */
	public ElementaryRangeReference getTtypcdfReference() {
		return ttypcdf.getReference();
	}

	/**
	 * Getter for ttypcdf attribute.
	 * @return ttypcdf attribute
	 */
	public String getTtypcdf() {
		return ttypcdf.getValue();
	}

	/**
	 * Setter for ttypcdf attribute.
	 * @param ttypcdf the new value of ttypcdf
	 */
	public void setTtypcdf(String ttypcdf) {
		this.ttypcdf.setValue(ttypcdf);
	}
	/**
	 * Gets the reference for attribute ttypcda.
	 * @return the ttypcda attribute reference
	 */
	public ElementaryRangeReference getTtypcdaReference() {
		return ttypcda.getReference();
	}

	/**
	 * Getter for ttypcda attribute.
	 * @return ttypcda attribute
	 */
	public String getTtypcda() {
		return ttypcda.getValue();
	}

	/**
	 * Setter for ttypcda attribute.
	 * @param ttypcda the new value of ttypcda
	 */
	public void setTtypcda(String ttypcda) {
		this.ttypcda.setValue(ttypcda);
	}
	/**
	 * Gets the reference for attribute ttypcdi.
	 * @return the ttypcdi attribute reference
	 */
	public ElementaryRangeReference getTtypcdiReference() {
		return ttypcdi.getReference();
	}

	/**
	 * Getter for ttypcdi attribute.
	 * @return ttypcdi attribute
	 */
	public String getTtypcdi() {
		return ttypcdi.getValue();
	}

	/**
	 * Setter for ttypcdi attribute.
	 * @param ttypcdi the new value of ttypcdi
	 */
	public void setTtypcdi(String ttypcdi) {
		this.ttypcdi.setValue(ttypcdi);
	}
	/**
	 * Gets the reference for attribute tcatcdl.
	 * @return the tcatcdl attribute reference
	 */
	public ElementaryRangeReference getTcatcdlReference() {
		return tcatcdl.getReference();
	}

	/**
	 * Getter for tcatcdl attribute.
	 * @return tcatcdl attribute
	 */
	public int getTcatcdl() {
		return tcatcdl.getValue();
	}

	/**
	 * Setter for tcatcdl attribute.
	 * @param tcatcdl the new value of tcatcdl
	 */
	public void setTcatcdl(int tcatcdl) {
		this.tcatcdl.setValue(tcatcdl);
	}
	/**
	 * Gets the reference for attribute tcatcdf.
	 * @return the tcatcdf attribute reference
	 */
	public ElementaryRangeReference getTcatcdfReference() {
		return tcatcdf.getReference();
	}

	/**
	 * Getter for tcatcdf attribute.
	 * @return tcatcdf attribute
	 */
	public String getTcatcdf() {
		return tcatcdf.getValue();
	}

	/**
	 * Setter for tcatcdf attribute.
	 * @param tcatcdf the new value of tcatcdf
	 */
	public void setTcatcdf(String tcatcdf) {
		this.tcatcdf.setValue(tcatcdf);
	}
	/**
	 * Gets the reference for attribute tcatcda.
	 * @return the tcatcda attribute reference
	 */
	public ElementaryRangeReference getTcatcdaReference() {
		return tcatcda.getReference();
	}

	/**
	 * Getter for tcatcda attribute.
	 * @return tcatcda attribute
	 */
	public String getTcatcda() {
		return tcatcda.getValue();
	}

	/**
	 * Setter for tcatcda attribute.
	 * @param tcatcda the new value of tcatcda
	 */
	public void setTcatcda(String tcatcda) {
		this.tcatcda.setValue(tcatcda);
	}
	/**
	 * Gets the reference for attribute tcatcdi.
	 * @return the tcatcdi attribute reference
	 */
	public ElementaryRangeReference getTcatcdiReference() {
		return tcatcdi.getReference();
	}

	/**
	 * Getter for tcatcdi attribute.
	 * @return tcatcdi attribute
	 */
	public String getTcatcdi() {
		return tcatcdi.getValue();
	}

	/**
	 * Setter for tcatcdi attribute.
	 * @param tcatcdi the new value of tcatcdi
	 */
	public void setTcatcdi(String tcatcdi) {
		this.tcatcdi.setValue(tcatcdi);
	}
	/**
	 * Gets the reference for attribute trnsrcl.
	 * @return the trnsrcl attribute reference
	 */
	public ElementaryRangeReference getTrnsrclReference() {
		return trnsrcl.getReference();
	}

	/**
	 * Getter for trnsrcl attribute.
	 * @return trnsrcl attribute
	 */
	public int getTrnsrcl() {
		return trnsrcl.getValue();
	}

	/**
	 * Setter for trnsrcl attribute.
	 * @param trnsrcl the new value of trnsrcl
	 */
	public void setTrnsrcl(int trnsrcl) {
		this.trnsrcl.setValue(trnsrcl);
	}
	/**
	 * Gets the reference for attribute trnsrcf.
	 * @return the trnsrcf attribute reference
	 */
	public ElementaryRangeReference getTrnsrcfReference() {
		return trnsrcf.getReference();
	}

	/**
	 * Getter for trnsrcf attribute.
	 * @return trnsrcf attribute
	 */
	public String getTrnsrcf() {
		return trnsrcf.getValue();
	}

	/**
	 * Setter for trnsrcf attribute.
	 * @param trnsrcf the new value of trnsrcf
	 */
	public void setTrnsrcf(String trnsrcf) {
		this.trnsrcf.setValue(trnsrcf);
	}
	/**
	 * Gets the reference for attribute trnsrca.
	 * @return the trnsrca attribute reference
	 */
	public ElementaryRangeReference getTrnsrcaReference() {
		return trnsrca.getReference();
	}

	/**
	 * Getter for trnsrca attribute.
	 * @return trnsrca attribute
	 */
	public String getTrnsrca() {
		return trnsrca.getValue();
	}

	/**
	 * Setter for trnsrca attribute.
	 * @param trnsrca the new value of trnsrca
	 */
	public void setTrnsrca(String trnsrca) {
		this.trnsrca.setValue(trnsrca);
	}
	/**
	 * Gets the reference for attribute trnsrci.
	 * @return the trnsrci attribute reference
	 */
	public ElementaryRangeReference getTrnsrciReference() {
		return trnsrci.getReference();
	}

	/**
	 * Getter for trnsrci attribute.
	 * @return trnsrci attribute
	 */
	public String getTrnsrci() {
		return trnsrci.getValue();
	}

	/**
	 * Setter for trnsrci attribute.
	 * @param trnsrci the new value of trnsrci
	 */
	public void setTrnsrci(String trnsrci) {
		this.trnsrci.setValue(trnsrci);
	}
	/**
	 * Gets the reference for attribute tdescl.
	 * @return the tdescl attribute reference
	 */
	public ElementaryRangeReference getTdesclReference() {
		return tdescl.getReference();
	}

	/**
	 * Getter for tdescl attribute.
	 * @return tdescl attribute
	 */
	public int getTdescl() {
		return tdescl.getValue();
	}

	/**
	 * Setter for tdescl attribute.
	 * @param tdescl the new value of tdescl
	 */
	public void setTdescl(int tdescl) {
		this.tdescl.setValue(tdescl);
	}
	/**
	 * Gets the reference for attribute tdescf.
	 * @return the tdescf attribute reference
	 */
	public ElementaryRangeReference getTdescfReference() {
		return tdescf.getReference();
	}

	/**
	 * Getter for tdescf attribute.
	 * @return tdescf attribute
	 */
	public String getTdescf() {
		return tdescf.getValue();
	}

	/**
	 * Setter for tdescf attribute.
	 * @param tdescf the new value of tdescf
	 */
	public void setTdescf(String tdescf) {
		this.tdescf.setValue(tdescf);
	}
	/**
	 * Gets the reference for attribute tdesca.
	 * @return the tdesca attribute reference
	 */
	public ElementaryRangeReference getTdescaReference() {
		return tdesca.getReference();
	}

	/**
	 * Getter for tdesca attribute.
	 * @return tdesca attribute
	 */
	public String getTdesca() {
		return tdesca.getValue();
	}

	/**
	 * Setter for tdesca attribute.
	 * @param tdesca the new value of tdesca
	 */
	public void setTdesca(String tdesca) {
		this.tdesca.setValue(tdesca);
	}
	/**
	 * Gets the reference for attribute tdesci.
	 * @return the tdesci attribute reference
	 */
	public ElementaryRangeReference getTdesciReference() {
		return tdesci.getReference();
	}

	/**
	 * Getter for tdesci attribute.
	 * @return tdesci attribute
	 */
	public String getTdesci() {
		return tdesci.getValue();
	}

	/**
	 * Setter for tdesci attribute.
	 * @param tdesci the new value of tdesci
	 */
	public void setTdesci(String tdesci) {
		this.tdesci.setValue(tdesci);
	}
	/**
	 * Gets the reference for attribute trnamtl.
	 * @return the trnamtl attribute reference
	 */
	public ElementaryRangeReference getTrnamtlReference() {
		return trnamtl.getReference();
	}

	/**
	 * Getter for trnamtl attribute.
	 * @return trnamtl attribute
	 */
	public int getTrnamtl() {
		return trnamtl.getValue();
	}

	/**
	 * Setter for trnamtl attribute.
	 * @param trnamtl the new value of trnamtl
	 */
	public void setTrnamtl(int trnamtl) {
		this.trnamtl.setValue(trnamtl);
	}
	/**
	 * Gets the reference for attribute trnamtf.
	 * @return the trnamtf attribute reference
	 */
	public ElementaryRangeReference getTrnamtfReference() {
		return trnamtf.getReference();
	}

	/**
	 * Getter for trnamtf attribute.
	 * @return trnamtf attribute
	 */
	public String getTrnamtf() {
		return trnamtf.getValue();
	}

	/**
	 * Setter for trnamtf attribute.
	 * @param trnamtf the new value of trnamtf
	 */
	public void setTrnamtf(String trnamtf) {
		this.trnamtf.setValue(trnamtf);
	}
	/**
	 * Gets the reference for attribute trnamta.
	 * @return the trnamta attribute reference
	 */
	public ElementaryRangeReference getTrnamtaReference() {
		return trnamta.getReference();
	}

	/**
	 * Getter for trnamta attribute.
	 * @return trnamta attribute
	 */
	public String getTrnamta() {
		return trnamta.getValue();
	}

	/**
	 * Setter for trnamta attribute.
	 * @param trnamta the new value of trnamta
	 */
	public void setTrnamta(String trnamta) {
		this.trnamta.setValue(trnamta);
	}
	/**
	 * Gets the reference for attribute trnamti.
	 * @return the trnamti attribute reference
	 */
	public ElementaryRangeReference getTrnamtiReference() {
		return trnamti.getReference();
	}

	/**
	 * Getter for trnamti attribute.
	 * @return trnamti attribute
	 */
	public String getTrnamti() {
		return trnamti.getValue();
	}

	/**
	 * Setter for trnamti attribute.
	 * @param trnamti the new value of trnamti
	 */
	public void setTrnamti(String trnamti) {
		this.trnamti.setValue(trnamti);
	}
	/**
	 * Gets the reference for attribute torigdtl.
	 * @return the torigdtl attribute reference
	 */
	public ElementaryRangeReference getTorigdtlReference() {
		return torigdtl.getReference();
	}

	/**
	 * Getter for torigdtl attribute.
	 * @return torigdtl attribute
	 */
	public int getTorigdtl() {
		return torigdtl.getValue();
	}

	/**
	 * Setter for torigdtl attribute.
	 * @param torigdtl the new value of torigdtl
	 */
	public void setTorigdtl(int torigdtl) {
		this.torigdtl.setValue(torigdtl);
	}
	/**
	 * Gets the reference for attribute torigdtf.
	 * @return the torigdtf attribute reference
	 */
	public ElementaryRangeReference getTorigdtfReference() {
		return torigdtf.getReference();
	}

	/**
	 * Getter for torigdtf attribute.
	 * @return torigdtf attribute
	 */
	public String getTorigdtf() {
		return torigdtf.getValue();
	}

	/**
	 * Setter for torigdtf attribute.
	 * @param torigdtf the new value of torigdtf
	 */
	public void setTorigdtf(String torigdtf) {
		this.torigdtf.setValue(torigdtf);
	}
	/**
	 * Gets the reference for attribute torigdta.
	 * @return the torigdta attribute reference
	 */
	public ElementaryRangeReference getTorigdtaReference() {
		return torigdta.getReference();
	}

	/**
	 * Getter for torigdta attribute.
	 * @return torigdta attribute
	 */
	public String getTorigdta() {
		return torigdta.getValue();
	}

	/**
	 * Setter for torigdta attribute.
	 * @param torigdta the new value of torigdta
	 */
	public void setTorigdta(String torigdta) {
		this.torigdta.setValue(torigdta);
	}
	/**
	 * Gets the reference for attribute torigdti.
	 * @return the torigdti attribute reference
	 */
	public ElementaryRangeReference getTorigdtiReference() {
		return torigdti.getReference();
	}

	/**
	 * Getter for torigdti attribute.
	 * @return torigdti attribute
	 */
	public String getTorigdti() {
		return torigdti.getValue();
	}

	/**
	 * Setter for torigdti attribute.
	 * @param torigdti the new value of torigdti
	 */
	public void setTorigdti(String torigdti) {
		this.torigdti.setValue(torigdti);
	}
	/**
	 * Gets the reference for attribute tprocdtl.
	 * @return the tprocdtl attribute reference
	 */
	public ElementaryRangeReference getTprocdtlReference() {
		return tprocdtl.getReference();
	}

	/**
	 * Getter for tprocdtl attribute.
	 * @return tprocdtl attribute
	 */
	public int getTprocdtl() {
		return tprocdtl.getValue();
	}

	/**
	 * Setter for tprocdtl attribute.
	 * @param tprocdtl the new value of tprocdtl
	 */
	public void setTprocdtl(int tprocdtl) {
		this.tprocdtl.setValue(tprocdtl);
	}
	/**
	 * Gets the reference for attribute tprocdtf.
	 * @return the tprocdtf attribute reference
	 */
	public ElementaryRangeReference getTprocdtfReference() {
		return tprocdtf.getReference();
	}

	/**
	 * Getter for tprocdtf attribute.
	 * @return tprocdtf attribute
	 */
	public String getTprocdtf() {
		return tprocdtf.getValue();
	}

	/**
	 * Setter for tprocdtf attribute.
	 * @param tprocdtf the new value of tprocdtf
	 */
	public void setTprocdtf(String tprocdtf) {
		this.tprocdtf.setValue(tprocdtf);
	}
	/**
	 * Gets the reference for attribute tprocdta.
	 * @return the tprocdta attribute reference
	 */
	public ElementaryRangeReference getTprocdtaReference() {
		return tprocdta.getReference();
	}

	/**
	 * Getter for tprocdta attribute.
	 * @return tprocdta attribute
	 */
	public String getTprocdta() {
		return tprocdta.getValue();
	}

	/**
	 * Setter for tprocdta attribute.
	 * @param tprocdta the new value of tprocdta
	 */
	public void setTprocdta(String tprocdta) {
		this.tprocdta.setValue(tprocdta);
	}
	/**
	 * Gets the reference for attribute tprocdti.
	 * @return the tprocdti attribute reference
	 */
	public ElementaryRangeReference getTprocdtiReference() {
		return tprocdti.getReference();
	}

	/**
	 * Getter for tprocdti attribute.
	 * @return tprocdti attribute
	 */
	public String getTprocdti() {
		return tprocdti.getValue();
	}

	/**
	 * Setter for tprocdti attribute.
	 * @param tprocdti the new value of tprocdti
	 */
	public void setTprocdti(String tprocdti) {
		this.tprocdti.setValue(tprocdti);
	}
	/**
	 * Gets the reference for attribute midl.
	 * @return the midl attribute reference
	 */
	public ElementaryRangeReference getMidlReference() {
		return midl.getReference();
	}

	/**
	 * Getter for midl attribute.
	 * @return midl attribute
	 */
	public int getMidl() {
		return midl.getValue();
	}

	/**
	 * Setter for midl attribute.
	 * @param midl the new value of midl
	 */
	public void setMidl(int midl) {
		this.midl.setValue(midl);
	}
	/**
	 * Gets the reference for attribute midf.
	 * @return the midf attribute reference
	 */
	public ElementaryRangeReference getMidfReference() {
		return midf.getReference();
	}

	/**
	 * Getter for midf attribute.
	 * @return midf attribute
	 */
	public String getMidf() {
		return midf.getValue();
	}

	/**
	 * Setter for midf attribute.
	 * @param midf the new value of midf
	 */
	public void setMidf(String midf) {
		this.midf.setValue(midf);
	}
	/**
	 * Gets the reference for attribute mida.
	 * @return the mida attribute reference
	 */
	public ElementaryRangeReference getMidaReference() {
		return mida.getReference();
	}

	/**
	 * Getter for mida attribute.
	 * @return mida attribute
	 */
	public String getMida() {
		return mida.getValue();
	}

	/**
	 * Setter for mida attribute.
	 * @param mida the new value of mida
	 */
	public void setMida(String mida) {
		this.mida.setValue(mida);
	}
	/**
	 * Gets the reference for attribute midi.
	 * @return the midi attribute reference
	 */
	public ElementaryRangeReference getMidiReference() {
		return midi.getReference();
	}

	/**
	 * Getter for midi attribute.
	 * @return midi attribute
	 */
	public String getMidi() {
		return midi.getValue();
	}

	/**
	 * Setter for midi attribute.
	 * @param midi the new value of midi
	 */
	public void setMidi(String midi) {
		this.midi.setValue(midi);
	}
	/**
	 * Gets the reference for attribute mnamel.
	 * @return the mnamel attribute reference
	 */
	public ElementaryRangeReference getMnamelReference() {
		return mnamel.getReference();
	}

	/**
	 * Getter for mnamel attribute.
	 * @return mnamel attribute
	 */
	public int getMnamel() {
		return mnamel.getValue();
	}

	/**
	 * Setter for mnamel attribute.
	 * @param mnamel the new value of mnamel
	 */
	public void setMnamel(int mnamel) {
		this.mnamel.setValue(mnamel);
	}
	/**
	 * Gets the reference for attribute mnamef.
	 * @return the mnamef attribute reference
	 */
	public ElementaryRangeReference getMnamefReference() {
		return mnamef.getReference();
	}

	/**
	 * Getter for mnamef attribute.
	 * @return mnamef attribute
	 */
	public String getMnamef() {
		return mnamef.getValue();
	}

	/**
	 * Setter for mnamef attribute.
	 * @param mnamef the new value of mnamef
	 */
	public void setMnamef(String mnamef) {
		this.mnamef.setValue(mnamef);
	}
	/**
	 * Gets the reference for attribute mnamea.
	 * @return the mnamea attribute reference
	 */
	public ElementaryRangeReference getMnameaReference() {
		return mnamea.getReference();
	}

	/**
	 * Getter for mnamea attribute.
	 * @return mnamea attribute
	 */
	public String getMnamea() {
		return mnamea.getValue();
	}

	/**
	 * Setter for mnamea attribute.
	 * @param mnamea the new value of mnamea
	 */
	public void setMnamea(String mnamea) {
		this.mnamea.setValue(mnamea);
	}
	/**
	 * Gets the reference for attribute mnamei.
	 * @return the mnamei attribute reference
	 */
	public ElementaryRangeReference getMnameiReference() {
		return mnamei.getReference();
	}

	/**
	 * Getter for mnamei attribute.
	 * @return mnamei attribute
	 */
	public String getMnamei() {
		return mnamei.getValue();
	}

	/**
	 * Setter for mnamei attribute.
	 * @param mnamei the new value of mnamei
	 */
	public void setMnamei(String mnamei) {
		this.mnamei.setValue(mnamei);
	}
	/**
	 * Gets the reference for attribute mcityl.
	 * @return the mcityl attribute reference
	 */
	public ElementaryRangeReference getMcitylReference() {
		return mcityl.getReference();
	}

	/**
	 * Getter for mcityl attribute.
	 * @return mcityl attribute
	 */
	public int getMcityl() {
		return mcityl.getValue();
	}

	/**
	 * Setter for mcityl attribute.
	 * @param mcityl the new value of mcityl
	 */
	public void setMcityl(int mcityl) {
		this.mcityl.setValue(mcityl);
	}
	/**
	 * Gets the reference for attribute mcityf.
	 * @return the mcityf attribute reference
	 */
	public ElementaryRangeReference getMcityfReference() {
		return mcityf.getReference();
	}

	/**
	 * Getter for mcityf attribute.
	 * @return mcityf attribute
	 */
	public String getMcityf() {
		return mcityf.getValue();
	}

	/**
	 * Setter for mcityf attribute.
	 * @param mcityf the new value of mcityf
	 */
	public void setMcityf(String mcityf) {
		this.mcityf.setValue(mcityf);
	}
	/**
	 * Gets the reference for attribute mcitya.
	 * @return the mcitya attribute reference
	 */
	public ElementaryRangeReference getMcityaReference() {
		return mcitya.getReference();
	}

	/**
	 * Getter for mcitya attribute.
	 * @return mcitya attribute
	 */
	public String getMcitya() {
		return mcitya.getValue();
	}

	/**
	 * Setter for mcitya attribute.
	 * @param mcitya the new value of mcitya
	 */
	public void setMcitya(String mcitya) {
		this.mcitya.setValue(mcitya);
	}
	/**
	 * Gets the reference for attribute mcityi.
	 * @return the mcityi attribute reference
	 */
	public ElementaryRangeReference getMcityiReference() {
		return mcityi.getReference();
	}

	/**
	 * Getter for mcityi attribute.
	 * @return mcityi attribute
	 */
	public String getMcityi() {
		return mcityi.getValue();
	}

	/**
	 * Setter for mcityi attribute.
	 * @param mcityi the new value of mcityi
	 */
	public void setMcityi(String mcityi) {
		this.mcityi.setValue(mcityi);
	}
	/**
	 * Gets the reference for attribute mzipl.
	 * @return the mzipl attribute reference
	 */
	public ElementaryRangeReference getMziplReference() {
		return mzipl.getReference();
	}

	/**
	 * Getter for mzipl attribute.
	 * @return mzipl attribute
	 */
	public int getMzipl() {
		return mzipl.getValue();
	}

	/**
	 * Setter for mzipl attribute.
	 * @param mzipl the new value of mzipl
	 */
	public void setMzipl(int mzipl) {
		this.mzipl.setValue(mzipl);
	}
	/**
	 * Gets the reference for attribute mzipf.
	 * @return the mzipf attribute reference
	 */
	public ElementaryRangeReference getMzipfReference() {
		return mzipf.getReference();
	}

	/**
	 * Getter for mzipf attribute.
	 * @return mzipf attribute
	 */
	public String getMzipf() {
		return mzipf.getValue();
	}

	/**
	 * Setter for mzipf attribute.
	 * @param mzipf the new value of mzipf
	 */
	public void setMzipf(String mzipf) {
		this.mzipf.setValue(mzipf);
	}
	/**
	 * Gets the reference for attribute mzipa.
	 * @return the mzipa attribute reference
	 */
	public ElementaryRangeReference getMzipaReference() {
		return mzipa.getReference();
	}

	/**
	 * Getter for mzipa attribute.
	 * @return mzipa attribute
	 */
	public String getMzipa() {
		return mzipa.getValue();
	}

	/**
	 * Setter for mzipa attribute.
	 * @param mzipa the new value of mzipa
	 */
	public void setMzipa(String mzipa) {
		this.mzipa.setValue(mzipa);
	}
	/**
	 * Gets the reference for attribute mzipi.
	 * @return the mzipi attribute reference
	 */
	public ElementaryRangeReference getMzipiReference() {
		return mzipi.getReference();
	}

	/**
	 * Getter for mzipi attribute.
	 * @return mzipi attribute
	 */
	public String getMzipi() {
		return mzipi.getValue();
	}

	/**
	 * Setter for mzipi attribute.
	 * @param mzipi the new value of mzipi
	 */
	public void setMzipi(String mzipi) {
		this.mzipi.setValue(mzipi);
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
	 * Gets the reference for attribute cotrn1ao.
	 * @return the cotrn1ao attribute reference
	 */
	public RangeReference getCotrn1aoReference() {
		return cotrn1ao.getReference();
	}	
				
	/**
	 * Setter for cotrn1ao .
	 */
   	public void setCotrn1ao(RangeReference reference) {
       	cotrn1ao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute trnidinc.
	 * @return the trnidinc attribute reference
	 */
	public ElementaryRangeReference getTrnidincReference() {
		return trnidinc.getReference();
	}

	/**
	 * Getter for trnidinc attribute.
	 * @return trnidinc attribute
	 */
	public String getTrnidinc() {
		return trnidinc.getValue();
	}

	/**
	 * Setter for trnidinc attribute.
	 * @param trnidinc the new value of trnidinc
	 */
	public void setTrnidinc(String trnidinc) {
		this.trnidinc.setValue(trnidinc);
	}
	/**
	 * Gets the reference for attribute trnidinp.
	 * @return the trnidinp attribute reference
	 */
	public ElementaryRangeReference getTrnidinpReference() {
		return trnidinp.getReference();
	}

	/**
	 * Getter for trnidinp attribute.
	 * @return trnidinp attribute
	 */
	public String getTrnidinp() {
		return trnidinp.getValue();
	}

	/**
	 * Setter for trnidinp attribute.
	 * @param trnidinp the new value of trnidinp
	 */
	public void setTrnidinp(String trnidinp) {
		this.trnidinp.setValue(trnidinp);
	}
	/**
	 * Gets the reference for attribute trnidinh.
	 * @return the trnidinh attribute reference
	 */
	public ElementaryRangeReference getTrnidinhReference() {
		return trnidinh.getReference();
	}

	/**
	 * Getter for trnidinh attribute.
	 * @return trnidinh attribute
	 */
	public String getTrnidinh() {
		return trnidinh.getValue();
	}

	/**
	 * Setter for trnidinh attribute.
	 * @param trnidinh the new value of trnidinh
	 */
	public void setTrnidinh(String trnidinh) {
		this.trnidinh.setValue(trnidinh);
	}
	/**
	 * Gets the reference for attribute trnidinv.
	 * @return the trnidinv attribute reference
	 */
	public ElementaryRangeReference getTrnidinvReference() {
		return trnidinv.getReference();
	}

	/**
	 * Getter for trnidinv attribute.
	 * @return trnidinv attribute
	 */
	public String getTrnidinv() {
		return trnidinv.getValue();
	}

	/**
	 * Setter for trnidinv attribute.
	 * @param trnidinv the new value of trnidinv
	 */
	public void setTrnidinv(String trnidinv) {
		this.trnidinv.setValue(trnidinv);
	}
	/**
	 * Gets the reference for attribute trnidino.
	 * @return the trnidino attribute reference
	 */
	public ElementaryRangeReference getTrnidinoReference() {
		return trnidino.getReference();
	}

	/**
	 * Getter for trnidino attribute.
	 * @return trnidino attribute
	 */
	public String getTrnidino() {
		return trnidino.getValue();
	}

	/**
	 * Setter for trnidino attribute.
	 * @param trnidino the new value of trnidino
	 */
	public void setTrnidino(String trnidino) {
		this.trnidino.setValue(trnidino);
	}
	/**
	 * Gets the reference for attribute trnidc.
	 * @return the trnidc attribute reference
	 */
	public ElementaryRangeReference getTrnidcReference() {
		return trnidc.getReference();
	}

	/**
	 * Getter for trnidc attribute.
	 * @return trnidc attribute
	 */
	public String getTrnidc() {
		return trnidc.getValue();
	}

	/**
	 * Setter for trnidc attribute.
	 * @param trnidc the new value of trnidc
	 */
	public void setTrnidc(String trnidc) {
		this.trnidc.setValue(trnidc);
	}
	/**
	 * Gets the reference for attribute trnidp.
	 * @return the trnidp attribute reference
	 */
	public ElementaryRangeReference getTrnidpReference() {
		return trnidp.getReference();
	}

	/**
	 * Getter for trnidp attribute.
	 * @return trnidp attribute
	 */
	public String getTrnidp() {
		return trnidp.getValue();
	}

	/**
	 * Setter for trnidp attribute.
	 * @param trnidp the new value of trnidp
	 */
	public void setTrnidp(String trnidp) {
		this.trnidp.setValue(trnidp);
	}
	/**
	 * Gets the reference for attribute trnidh.
	 * @return the trnidh attribute reference
	 */
	public ElementaryRangeReference getTrnidhReference() {
		return trnidh.getReference();
	}

	/**
	 * Getter for trnidh attribute.
	 * @return trnidh attribute
	 */
	public String getTrnidh() {
		return trnidh.getValue();
	}

	/**
	 * Setter for trnidh attribute.
	 * @param trnidh the new value of trnidh
	 */
	public void setTrnidh(String trnidh) {
		this.trnidh.setValue(trnidh);
	}
	/**
	 * Gets the reference for attribute trnidv.
	 * @return the trnidv attribute reference
	 */
	public ElementaryRangeReference getTrnidvReference() {
		return trnidv.getReference();
	}

	/**
	 * Getter for trnidv attribute.
	 * @return trnidv attribute
	 */
	public String getTrnidv() {
		return trnidv.getValue();
	}

	/**
	 * Setter for trnidv attribute.
	 * @param trnidv the new value of trnidv
	 */
	public void setTrnidv(String trnidv) {
		this.trnidv.setValue(trnidv);
	}
	/**
	 * Gets the reference for attribute trnido.
	 * @return the trnido attribute reference
	 */
	public ElementaryRangeReference getTrnidoReference() {
		return trnido.getReference();
	}

	/**
	 * Getter for trnido attribute.
	 * @return trnido attribute
	 */
	public String getTrnido() {
		return trnido.getValue();
	}

	/**
	 * Setter for trnido attribute.
	 * @param trnido the new value of trnido
	 */
	public void setTrnido(String trnido) {
		this.trnido.setValue(trnido);
	}
	/**
	 * Gets the reference for attribute cardnumc.
	 * @return the cardnumc attribute reference
	 */
	public ElementaryRangeReference getCardnumcReference() {
		return cardnumc.getReference();
	}

	/**
	 * Getter for cardnumc attribute.
	 * @return cardnumc attribute
	 */
	public String getCardnumc() {
		return cardnumc.getValue();
	}

	/**
	 * Setter for cardnumc attribute.
	 * @param cardnumc the new value of cardnumc
	 */
	public void setCardnumc(String cardnumc) {
		this.cardnumc.setValue(cardnumc);
	}
	/**
	 * Gets the reference for attribute cardnump.
	 * @return the cardnump attribute reference
	 */
	public ElementaryRangeReference getCardnumpReference() {
		return cardnump.getReference();
	}

	/**
	 * Getter for cardnump attribute.
	 * @return cardnump attribute
	 */
	public String getCardnump() {
		return cardnump.getValue();
	}

	/**
	 * Setter for cardnump attribute.
	 * @param cardnump the new value of cardnump
	 */
	public void setCardnump(String cardnump) {
		this.cardnump.setValue(cardnump);
	}
	/**
	 * Gets the reference for attribute cardnumh.
	 * @return the cardnumh attribute reference
	 */
	public ElementaryRangeReference getCardnumhReference() {
		return cardnumh.getReference();
	}

	/**
	 * Getter for cardnumh attribute.
	 * @return cardnumh attribute
	 */
	public String getCardnumh() {
		return cardnumh.getValue();
	}

	/**
	 * Setter for cardnumh attribute.
	 * @param cardnumh the new value of cardnumh
	 */
	public void setCardnumh(String cardnumh) {
		this.cardnumh.setValue(cardnumh);
	}
	/**
	 * Gets the reference for attribute cardnumv.
	 * @return the cardnumv attribute reference
	 */
	public ElementaryRangeReference getCardnumvReference() {
		return cardnumv.getReference();
	}

	/**
	 * Getter for cardnumv attribute.
	 * @return cardnumv attribute
	 */
	public String getCardnumv() {
		return cardnumv.getValue();
	}

	/**
	 * Setter for cardnumv attribute.
	 * @param cardnumv the new value of cardnumv
	 */
	public void setCardnumv(String cardnumv) {
		this.cardnumv.setValue(cardnumv);
	}
	/**
	 * Gets the reference for attribute cardnumo.
	 * @return the cardnumo attribute reference
	 */
	public ElementaryRangeReference getCardnumoReference() {
		return cardnumo.getReference();
	}

	/**
	 * Getter for cardnumo attribute.
	 * @return cardnumo attribute
	 */
	public String getCardnumo() {
		return cardnumo.getValue();
	}

	/**
	 * Setter for cardnumo attribute.
	 * @param cardnumo the new value of cardnumo
	 */
	public void setCardnumo(String cardnumo) {
		this.cardnumo.setValue(cardnumo);
	}
	/**
	 * Gets the reference for attribute ttypcdc.
	 * @return the ttypcdc attribute reference
	 */
	public ElementaryRangeReference getTtypcdcReference() {
		return ttypcdc.getReference();
	}

	/**
	 * Getter for ttypcdc attribute.
	 * @return ttypcdc attribute
	 */
	public String getTtypcdc() {
		return ttypcdc.getValue();
	}

	/**
	 * Setter for ttypcdc attribute.
	 * @param ttypcdc the new value of ttypcdc
	 */
	public void setTtypcdc(String ttypcdc) {
		this.ttypcdc.setValue(ttypcdc);
	}
	/**
	 * Gets the reference for attribute ttypcdp.
	 * @return the ttypcdp attribute reference
	 */
	public ElementaryRangeReference getTtypcdpReference() {
		return ttypcdp.getReference();
	}

	/**
	 * Getter for ttypcdp attribute.
	 * @return ttypcdp attribute
	 */
	public String getTtypcdp() {
		return ttypcdp.getValue();
	}

	/**
	 * Setter for ttypcdp attribute.
	 * @param ttypcdp the new value of ttypcdp
	 */
	public void setTtypcdp(String ttypcdp) {
		this.ttypcdp.setValue(ttypcdp);
	}
	/**
	 * Gets the reference for attribute ttypcdh.
	 * @return the ttypcdh attribute reference
	 */
	public ElementaryRangeReference getTtypcdhReference() {
		return ttypcdh.getReference();
	}

	/**
	 * Getter for ttypcdh attribute.
	 * @return ttypcdh attribute
	 */
	public String getTtypcdh() {
		return ttypcdh.getValue();
	}

	/**
	 * Setter for ttypcdh attribute.
	 * @param ttypcdh the new value of ttypcdh
	 */
	public void setTtypcdh(String ttypcdh) {
		this.ttypcdh.setValue(ttypcdh);
	}
	/**
	 * Gets the reference for attribute ttypcdv.
	 * @return the ttypcdv attribute reference
	 */
	public ElementaryRangeReference getTtypcdvReference() {
		return ttypcdv.getReference();
	}

	/**
	 * Getter for ttypcdv attribute.
	 * @return ttypcdv attribute
	 */
	public String getTtypcdv() {
		return ttypcdv.getValue();
	}

	/**
	 * Setter for ttypcdv attribute.
	 * @param ttypcdv the new value of ttypcdv
	 */
	public void setTtypcdv(String ttypcdv) {
		this.ttypcdv.setValue(ttypcdv);
	}
	/**
	 * Gets the reference for attribute ttypcdo.
	 * @return the ttypcdo attribute reference
	 */
	public ElementaryRangeReference getTtypcdoReference() {
		return ttypcdo.getReference();
	}

	/**
	 * Getter for ttypcdo attribute.
	 * @return ttypcdo attribute
	 */
	public String getTtypcdo() {
		return ttypcdo.getValue();
	}

	/**
	 * Setter for ttypcdo attribute.
	 * @param ttypcdo the new value of ttypcdo
	 */
	public void setTtypcdo(String ttypcdo) {
		this.ttypcdo.setValue(ttypcdo);
	}
	/**
	 * Gets the reference for attribute tcatcdc.
	 * @return the tcatcdc attribute reference
	 */
	public ElementaryRangeReference getTcatcdcReference() {
		return tcatcdc.getReference();
	}

	/**
	 * Getter for tcatcdc attribute.
	 * @return tcatcdc attribute
	 */
	public String getTcatcdc() {
		return tcatcdc.getValue();
	}

	/**
	 * Setter for tcatcdc attribute.
	 * @param tcatcdc the new value of tcatcdc
	 */
	public void setTcatcdc(String tcatcdc) {
		this.tcatcdc.setValue(tcatcdc);
	}
	/**
	 * Gets the reference for attribute tcatcdp.
	 * @return the tcatcdp attribute reference
	 */
	public ElementaryRangeReference getTcatcdpReference() {
		return tcatcdp.getReference();
	}

	/**
	 * Getter for tcatcdp attribute.
	 * @return tcatcdp attribute
	 */
	public String getTcatcdp() {
		return tcatcdp.getValue();
	}

	/**
	 * Setter for tcatcdp attribute.
	 * @param tcatcdp the new value of tcatcdp
	 */
	public void setTcatcdp(String tcatcdp) {
		this.tcatcdp.setValue(tcatcdp);
	}
	/**
	 * Gets the reference for attribute tcatcdh.
	 * @return the tcatcdh attribute reference
	 */
	public ElementaryRangeReference getTcatcdhReference() {
		return tcatcdh.getReference();
	}

	/**
	 * Getter for tcatcdh attribute.
	 * @return tcatcdh attribute
	 */
	public String getTcatcdh() {
		return tcatcdh.getValue();
	}

	/**
	 * Setter for tcatcdh attribute.
	 * @param tcatcdh the new value of tcatcdh
	 */
	public void setTcatcdh(String tcatcdh) {
		this.tcatcdh.setValue(tcatcdh);
	}
	/**
	 * Gets the reference for attribute tcatcdv.
	 * @return the tcatcdv attribute reference
	 */
	public ElementaryRangeReference getTcatcdvReference() {
		return tcatcdv.getReference();
	}

	/**
	 * Getter for tcatcdv attribute.
	 * @return tcatcdv attribute
	 */
	public String getTcatcdv() {
		return tcatcdv.getValue();
	}

	/**
	 * Setter for tcatcdv attribute.
	 * @param tcatcdv the new value of tcatcdv
	 */
	public void setTcatcdv(String tcatcdv) {
		this.tcatcdv.setValue(tcatcdv);
	}
	/**
	 * Gets the reference for attribute tcatcdo.
	 * @return the tcatcdo attribute reference
	 */
	public ElementaryRangeReference getTcatcdoReference() {
		return tcatcdo.getReference();
	}

	/**
	 * Getter for tcatcdo attribute.
	 * @return tcatcdo attribute
	 */
	public String getTcatcdo() {
		return tcatcdo.getValue();
	}

	/**
	 * Setter for tcatcdo attribute.
	 * @param tcatcdo the new value of tcatcdo
	 */
	public void setTcatcdo(String tcatcdo) {
		this.tcatcdo.setValue(tcatcdo);
	}
	/**
	 * Gets the reference for attribute trnsrcc.
	 * @return the trnsrcc attribute reference
	 */
	public ElementaryRangeReference getTrnsrccReference() {
		return trnsrcc.getReference();
	}

	/**
	 * Getter for trnsrcc attribute.
	 * @return trnsrcc attribute
	 */
	public String getTrnsrcc() {
		return trnsrcc.getValue();
	}

	/**
	 * Setter for trnsrcc attribute.
	 * @param trnsrcc the new value of trnsrcc
	 */
	public void setTrnsrcc(String trnsrcc) {
		this.trnsrcc.setValue(trnsrcc);
	}
	/**
	 * Gets the reference for attribute trnsrcp.
	 * @return the trnsrcp attribute reference
	 */
	public ElementaryRangeReference getTrnsrcpReference() {
		return trnsrcp.getReference();
	}

	/**
	 * Getter for trnsrcp attribute.
	 * @return trnsrcp attribute
	 */
	public String getTrnsrcp() {
		return trnsrcp.getValue();
	}

	/**
	 * Setter for trnsrcp attribute.
	 * @param trnsrcp the new value of trnsrcp
	 */
	public void setTrnsrcp(String trnsrcp) {
		this.trnsrcp.setValue(trnsrcp);
	}
	/**
	 * Gets the reference for attribute trnsrch.
	 * @return the trnsrch attribute reference
	 */
	public ElementaryRangeReference getTrnsrchReference() {
		return trnsrch.getReference();
	}

	/**
	 * Getter for trnsrch attribute.
	 * @return trnsrch attribute
	 */
	public String getTrnsrch() {
		return trnsrch.getValue();
	}

	/**
	 * Setter for trnsrch attribute.
	 * @param trnsrch the new value of trnsrch
	 */
	public void setTrnsrch(String trnsrch) {
		this.trnsrch.setValue(trnsrch);
	}
	/**
	 * Gets the reference for attribute trnsrcv.
	 * @return the trnsrcv attribute reference
	 */
	public ElementaryRangeReference getTrnsrcvReference() {
		return trnsrcv.getReference();
	}

	/**
	 * Getter for trnsrcv attribute.
	 * @return trnsrcv attribute
	 */
	public String getTrnsrcv() {
		return trnsrcv.getValue();
	}

	/**
	 * Setter for trnsrcv attribute.
	 * @param trnsrcv the new value of trnsrcv
	 */
	public void setTrnsrcv(String trnsrcv) {
		this.trnsrcv.setValue(trnsrcv);
	}
	/**
	 * Gets the reference for attribute trnsrco.
	 * @return the trnsrco attribute reference
	 */
	public ElementaryRangeReference getTrnsrcoReference() {
		return trnsrco.getReference();
	}

	/**
	 * Getter for trnsrco attribute.
	 * @return trnsrco attribute
	 */
	public String getTrnsrco() {
		return trnsrco.getValue();
	}

	/**
	 * Setter for trnsrco attribute.
	 * @param trnsrco the new value of trnsrco
	 */
	public void setTrnsrco(String trnsrco) {
		this.trnsrco.setValue(trnsrco);
	}
	/**
	 * Gets the reference for attribute tdescc.
	 * @return the tdescc attribute reference
	 */
	public ElementaryRangeReference getTdesccReference() {
		return tdescc.getReference();
	}

	/**
	 * Getter for tdescc attribute.
	 * @return tdescc attribute
	 */
	public String getTdescc() {
		return tdescc.getValue();
	}

	/**
	 * Setter for tdescc attribute.
	 * @param tdescc the new value of tdescc
	 */
	public void setTdescc(String tdescc) {
		this.tdescc.setValue(tdescc);
	}
	/**
	 * Gets the reference for attribute tdescp.
	 * @return the tdescp attribute reference
	 */
	public ElementaryRangeReference getTdescpReference() {
		return tdescp.getReference();
	}

	/**
	 * Getter for tdescp attribute.
	 * @return tdescp attribute
	 */
	public String getTdescp() {
		return tdescp.getValue();
	}

	/**
	 * Setter for tdescp attribute.
	 * @param tdescp the new value of tdescp
	 */
	public void setTdescp(String tdescp) {
		this.tdescp.setValue(tdescp);
	}
	/**
	 * Gets the reference for attribute tdesch.
	 * @return the tdesch attribute reference
	 */
	public ElementaryRangeReference getTdeschReference() {
		return tdesch.getReference();
	}

	/**
	 * Getter for tdesch attribute.
	 * @return tdesch attribute
	 */
	public String getTdesch() {
		return tdesch.getValue();
	}

	/**
	 * Setter for tdesch attribute.
	 * @param tdesch the new value of tdesch
	 */
	public void setTdesch(String tdesch) {
		this.tdesch.setValue(tdesch);
	}
	/**
	 * Gets the reference for attribute tdescv.
	 * @return the tdescv attribute reference
	 */
	public ElementaryRangeReference getTdescvReference() {
		return tdescv.getReference();
	}

	/**
	 * Getter for tdescv attribute.
	 * @return tdescv attribute
	 */
	public String getTdescv() {
		return tdescv.getValue();
	}

	/**
	 * Setter for tdescv attribute.
	 * @param tdescv the new value of tdescv
	 */
	public void setTdescv(String tdescv) {
		this.tdescv.setValue(tdescv);
	}
	/**
	 * Gets the reference for attribute tdesco.
	 * @return the tdesco attribute reference
	 */
	public ElementaryRangeReference getTdescoReference() {
		return tdesco.getReference();
	}

	/**
	 * Getter for tdesco attribute.
	 * @return tdesco attribute
	 */
	public String getTdesco() {
		return tdesco.getValue();
	}

	/**
	 * Setter for tdesco attribute.
	 * @param tdesco the new value of tdesco
	 */
	public void setTdesco(String tdesco) {
		this.tdesco.setValue(tdesco);
	}
	/**
	 * Gets the reference for attribute trnamtc.
	 * @return the trnamtc attribute reference
	 */
	public ElementaryRangeReference getTrnamtcReference() {
		return trnamtc.getReference();
	}

	/**
	 * Getter for trnamtc attribute.
	 * @return trnamtc attribute
	 */
	public String getTrnamtc() {
		return trnamtc.getValue();
	}

	/**
	 * Setter for trnamtc attribute.
	 * @param trnamtc the new value of trnamtc
	 */
	public void setTrnamtc(String trnamtc) {
		this.trnamtc.setValue(trnamtc);
	}
	/**
	 * Gets the reference for attribute trnamtp.
	 * @return the trnamtp attribute reference
	 */
	public ElementaryRangeReference getTrnamtpReference() {
		return trnamtp.getReference();
	}

	/**
	 * Getter for trnamtp attribute.
	 * @return trnamtp attribute
	 */
	public String getTrnamtp() {
		return trnamtp.getValue();
	}

	/**
	 * Setter for trnamtp attribute.
	 * @param trnamtp the new value of trnamtp
	 */
	public void setTrnamtp(String trnamtp) {
		this.trnamtp.setValue(trnamtp);
	}
	/**
	 * Gets the reference for attribute trnamth.
	 * @return the trnamth attribute reference
	 */
	public ElementaryRangeReference getTrnamthReference() {
		return trnamth.getReference();
	}

	/**
	 * Getter for trnamth attribute.
	 * @return trnamth attribute
	 */
	public String getTrnamth() {
		return trnamth.getValue();
	}

	/**
	 * Setter for trnamth attribute.
	 * @param trnamth the new value of trnamth
	 */
	public void setTrnamth(String trnamth) {
		this.trnamth.setValue(trnamth);
	}
	/**
	 * Gets the reference for attribute trnamtv.
	 * @return the trnamtv attribute reference
	 */
	public ElementaryRangeReference getTrnamtvReference() {
		return trnamtv.getReference();
	}

	/**
	 * Getter for trnamtv attribute.
	 * @return trnamtv attribute
	 */
	public String getTrnamtv() {
		return trnamtv.getValue();
	}

	/**
	 * Setter for trnamtv attribute.
	 * @param trnamtv the new value of trnamtv
	 */
	public void setTrnamtv(String trnamtv) {
		this.trnamtv.setValue(trnamtv);
	}
	/**
	 * Gets the reference for attribute trnamto.
	 * @return the trnamto attribute reference
	 */
	public ElementaryRangeReference getTrnamtoReference() {
		return trnamto.getReference();
	}

	/**
	 * Getter for trnamto attribute.
	 * @return trnamto attribute
	 */
	public String getTrnamto() {
		return trnamto.getValue();
	}

	/**
	 * Setter for trnamto attribute.
	 * @param trnamto the new value of trnamto
	 */
	public void setTrnamto(String trnamto) {
		this.trnamto.setValue(trnamto);
	}
	/**
	 * Gets the reference for attribute torigdtc.
	 * @return the torigdtc attribute reference
	 */
	public ElementaryRangeReference getTorigdtcReference() {
		return torigdtc.getReference();
	}

	/**
	 * Getter for torigdtc attribute.
	 * @return torigdtc attribute
	 */
	public String getTorigdtc() {
		return torigdtc.getValue();
	}

	/**
	 * Setter for torigdtc attribute.
	 * @param torigdtc the new value of torigdtc
	 */
	public void setTorigdtc(String torigdtc) {
		this.torigdtc.setValue(torigdtc);
	}
	/**
	 * Gets the reference for attribute torigdtp.
	 * @return the torigdtp attribute reference
	 */
	public ElementaryRangeReference getTorigdtpReference() {
		return torigdtp.getReference();
	}

	/**
	 * Getter for torigdtp attribute.
	 * @return torigdtp attribute
	 */
	public String getTorigdtp() {
		return torigdtp.getValue();
	}

	/**
	 * Setter for torigdtp attribute.
	 * @param torigdtp the new value of torigdtp
	 */
	public void setTorigdtp(String torigdtp) {
		this.torigdtp.setValue(torigdtp);
	}
	/**
	 * Gets the reference for attribute torigdth.
	 * @return the torigdth attribute reference
	 */
	public ElementaryRangeReference getTorigdthReference() {
		return torigdth.getReference();
	}

	/**
	 * Getter for torigdth attribute.
	 * @return torigdth attribute
	 */
	public String getTorigdth() {
		return torigdth.getValue();
	}

	/**
	 * Setter for torigdth attribute.
	 * @param torigdth the new value of torigdth
	 */
	public void setTorigdth(String torigdth) {
		this.torigdth.setValue(torigdth);
	}
	/**
	 * Gets the reference for attribute torigdtv.
	 * @return the torigdtv attribute reference
	 */
	public ElementaryRangeReference getTorigdtvReference() {
		return torigdtv.getReference();
	}

	/**
	 * Getter for torigdtv attribute.
	 * @return torigdtv attribute
	 */
	public String getTorigdtv() {
		return torigdtv.getValue();
	}

	/**
	 * Setter for torigdtv attribute.
	 * @param torigdtv the new value of torigdtv
	 */
	public void setTorigdtv(String torigdtv) {
		this.torigdtv.setValue(torigdtv);
	}
	/**
	 * Gets the reference for attribute torigdto.
	 * @return the torigdto attribute reference
	 */
	public ElementaryRangeReference getTorigdtoReference() {
		return torigdto.getReference();
	}

	/**
	 * Getter for torigdto attribute.
	 * @return torigdto attribute
	 */
	public String getTorigdto() {
		return torigdto.getValue();
	}

	/**
	 * Setter for torigdto attribute.
	 * @param torigdto the new value of torigdto
	 */
	public void setTorigdto(String torigdto) {
		this.torigdto.setValue(torigdto);
	}
	/**
	 * Gets the reference for attribute tprocdtc.
	 * @return the tprocdtc attribute reference
	 */
	public ElementaryRangeReference getTprocdtcReference() {
		return tprocdtc.getReference();
	}

	/**
	 * Getter for tprocdtc attribute.
	 * @return tprocdtc attribute
	 */
	public String getTprocdtc() {
		return tprocdtc.getValue();
	}

	/**
	 * Setter for tprocdtc attribute.
	 * @param tprocdtc the new value of tprocdtc
	 */
	public void setTprocdtc(String tprocdtc) {
		this.tprocdtc.setValue(tprocdtc);
	}
	/**
	 * Gets the reference for attribute tprocdtp.
	 * @return the tprocdtp attribute reference
	 */
	public ElementaryRangeReference getTprocdtpReference() {
		return tprocdtp.getReference();
	}

	/**
	 * Getter for tprocdtp attribute.
	 * @return tprocdtp attribute
	 */
	public String getTprocdtp() {
		return tprocdtp.getValue();
	}

	/**
	 * Setter for tprocdtp attribute.
	 * @param tprocdtp the new value of tprocdtp
	 */
	public void setTprocdtp(String tprocdtp) {
		this.tprocdtp.setValue(tprocdtp);
	}
	/**
	 * Gets the reference for attribute tprocdth.
	 * @return the tprocdth attribute reference
	 */
	public ElementaryRangeReference getTprocdthReference() {
		return tprocdth.getReference();
	}

	/**
	 * Getter for tprocdth attribute.
	 * @return tprocdth attribute
	 */
	public String getTprocdth() {
		return tprocdth.getValue();
	}

	/**
	 * Setter for tprocdth attribute.
	 * @param tprocdth the new value of tprocdth
	 */
	public void setTprocdth(String tprocdth) {
		this.tprocdth.setValue(tprocdth);
	}
	/**
	 * Gets the reference for attribute tprocdtv.
	 * @return the tprocdtv attribute reference
	 */
	public ElementaryRangeReference getTprocdtvReference() {
		return tprocdtv.getReference();
	}

	/**
	 * Getter for tprocdtv attribute.
	 * @return tprocdtv attribute
	 */
	public String getTprocdtv() {
		return tprocdtv.getValue();
	}

	/**
	 * Setter for tprocdtv attribute.
	 * @param tprocdtv the new value of tprocdtv
	 */
	public void setTprocdtv(String tprocdtv) {
		this.tprocdtv.setValue(tprocdtv);
	}
	/**
	 * Gets the reference for attribute tprocdto.
	 * @return the tprocdto attribute reference
	 */
	public ElementaryRangeReference getTprocdtoReference() {
		return tprocdto.getReference();
	}

	/**
	 * Getter for tprocdto attribute.
	 * @return tprocdto attribute
	 */
	public String getTprocdto() {
		return tprocdto.getValue();
	}

	/**
	 * Setter for tprocdto attribute.
	 * @param tprocdto the new value of tprocdto
	 */
	public void setTprocdto(String tprocdto) {
		this.tprocdto.setValue(tprocdto);
	}
	/**
	 * Gets the reference for attribute midc.
	 * @return the midc attribute reference
	 */
	public ElementaryRangeReference getMidcReference() {
		return midc.getReference();
	}

	/**
	 * Getter for midc attribute.
	 * @return midc attribute
	 */
	public String getMidc() {
		return midc.getValue();
	}

	/**
	 * Setter for midc attribute.
	 * @param midc the new value of midc
	 */
	public void setMidc(String midc) {
		this.midc.setValue(midc);
	}
	/**
	 * Gets the reference for attribute midp.
	 * @return the midp attribute reference
	 */
	public ElementaryRangeReference getMidpReference() {
		return midp.getReference();
	}

	/**
	 * Getter for midp attribute.
	 * @return midp attribute
	 */
	public String getMidp() {
		return midp.getValue();
	}

	/**
	 * Setter for midp attribute.
	 * @param midp the new value of midp
	 */
	public void setMidp(String midp) {
		this.midp.setValue(midp);
	}
	/**
	 * Gets the reference for attribute midh.
	 * @return the midh attribute reference
	 */
	public ElementaryRangeReference getMidhReference() {
		return midh.getReference();
	}

	/**
	 * Getter for midh attribute.
	 * @return midh attribute
	 */
	public String getMidh() {
		return midh.getValue();
	}

	/**
	 * Setter for midh attribute.
	 * @param midh the new value of midh
	 */
	public void setMidh(String midh) {
		this.midh.setValue(midh);
	}
	/**
	 * Gets the reference for attribute midv.
	 * @return the midv attribute reference
	 */
	public ElementaryRangeReference getMidvReference() {
		return midv.getReference();
	}

	/**
	 * Getter for midv attribute.
	 * @return midv attribute
	 */
	public String getMidv() {
		return midv.getValue();
	}

	/**
	 * Setter for midv attribute.
	 * @param midv the new value of midv
	 */
	public void setMidv(String midv) {
		this.midv.setValue(midv);
	}
	/**
	 * Gets the reference for attribute mido.
	 * @return the mido attribute reference
	 */
	public ElementaryRangeReference getMidoReference() {
		return mido.getReference();
	}

	/**
	 * Getter for mido attribute.
	 * @return mido attribute
	 */
	public String getMido() {
		return mido.getValue();
	}

	/**
	 * Setter for mido attribute.
	 * @param mido the new value of mido
	 */
	public void setMido(String mido) {
		this.mido.setValue(mido);
	}
	/**
	 * Gets the reference for attribute mnamec.
	 * @return the mnamec attribute reference
	 */
	public ElementaryRangeReference getMnamecReference() {
		return mnamec.getReference();
	}

	/**
	 * Getter for mnamec attribute.
	 * @return mnamec attribute
	 */
	public String getMnamec() {
		return mnamec.getValue();
	}

	/**
	 * Setter for mnamec attribute.
	 * @param mnamec the new value of mnamec
	 */
	public void setMnamec(String mnamec) {
		this.mnamec.setValue(mnamec);
	}
	/**
	 * Gets the reference for attribute mnamep.
	 * @return the mnamep attribute reference
	 */
	public ElementaryRangeReference getMnamepReference() {
		return mnamep.getReference();
	}

	/**
	 * Getter for mnamep attribute.
	 * @return mnamep attribute
	 */
	public String getMnamep() {
		return mnamep.getValue();
	}

	/**
	 * Setter for mnamep attribute.
	 * @param mnamep the new value of mnamep
	 */
	public void setMnamep(String mnamep) {
		this.mnamep.setValue(mnamep);
	}
	/**
	 * Gets the reference for attribute mnameh.
	 * @return the mnameh attribute reference
	 */
	public ElementaryRangeReference getMnamehReference() {
		return mnameh.getReference();
	}

	/**
	 * Getter for mnameh attribute.
	 * @return mnameh attribute
	 */
	public String getMnameh() {
		return mnameh.getValue();
	}

	/**
	 * Setter for mnameh attribute.
	 * @param mnameh the new value of mnameh
	 */
	public void setMnameh(String mnameh) {
		this.mnameh.setValue(mnameh);
	}
	/**
	 * Gets the reference for attribute mnamev.
	 * @return the mnamev attribute reference
	 */
	public ElementaryRangeReference getMnamevReference() {
		return mnamev.getReference();
	}

	/**
	 * Getter for mnamev attribute.
	 * @return mnamev attribute
	 */
	public String getMnamev() {
		return mnamev.getValue();
	}

	/**
	 * Setter for mnamev attribute.
	 * @param mnamev the new value of mnamev
	 */
	public void setMnamev(String mnamev) {
		this.mnamev.setValue(mnamev);
	}
	/**
	 * Gets the reference for attribute mnameo.
	 * @return the mnameo attribute reference
	 */
	public ElementaryRangeReference getMnameoReference() {
		return mnameo.getReference();
	}

	/**
	 * Getter for mnameo attribute.
	 * @return mnameo attribute
	 */
	public String getMnameo() {
		return mnameo.getValue();
	}

	/**
	 * Setter for mnameo attribute.
	 * @param mnameo the new value of mnameo
	 */
	public void setMnameo(String mnameo) {
		this.mnameo.setValue(mnameo);
	}
	/**
	 * Gets the reference for attribute mcityc.
	 * @return the mcityc attribute reference
	 */
	public ElementaryRangeReference getMcitycReference() {
		return mcityc.getReference();
	}

	/**
	 * Getter for mcityc attribute.
	 * @return mcityc attribute
	 */
	public String getMcityc() {
		return mcityc.getValue();
	}

	/**
	 * Setter for mcityc attribute.
	 * @param mcityc the new value of mcityc
	 */
	public void setMcityc(String mcityc) {
		this.mcityc.setValue(mcityc);
	}
	/**
	 * Gets the reference for attribute mcityp.
	 * @return the mcityp attribute reference
	 */
	public ElementaryRangeReference getMcitypReference() {
		return mcityp.getReference();
	}

	/**
	 * Getter for mcityp attribute.
	 * @return mcityp attribute
	 */
	public String getMcityp() {
		return mcityp.getValue();
	}

	/**
	 * Setter for mcityp attribute.
	 * @param mcityp the new value of mcityp
	 */
	public void setMcityp(String mcityp) {
		this.mcityp.setValue(mcityp);
	}
	/**
	 * Gets the reference for attribute mcityh.
	 * @return the mcityh attribute reference
	 */
	public ElementaryRangeReference getMcityhReference() {
		return mcityh.getReference();
	}

	/**
	 * Getter for mcityh attribute.
	 * @return mcityh attribute
	 */
	public String getMcityh() {
		return mcityh.getValue();
	}

	/**
	 * Setter for mcityh attribute.
	 * @param mcityh the new value of mcityh
	 */
	public void setMcityh(String mcityh) {
		this.mcityh.setValue(mcityh);
	}
	/**
	 * Gets the reference for attribute mcityv.
	 * @return the mcityv attribute reference
	 */
	public ElementaryRangeReference getMcityvReference() {
		return mcityv.getReference();
	}

	/**
	 * Getter for mcityv attribute.
	 * @return mcityv attribute
	 */
	public String getMcityv() {
		return mcityv.getValue();
	}

	/**
	 * Setter for mcityv attribute.
	 * @param mcityv the new value of mcityv
	 */
	public void setMcityv(String mcityv) {
		this.mcityv.setValue(mcityv);
	}
	/**
	 * Gets the reference for attribute mcityo.
	 * @return the mcityo attribute reference
	 */
	public ElementaryRangeReference getMcityoReference() {
		return mcityo.getReference();
	}

	/**
	 * Getter for mcityo attribute.
	 * @return mcityo attribute
	 */
	public String getMcityo() {
		return mcityo.getValue();
	}

	/**
	 * Setter for mcityo attribute.
	 * @param mcityo the new value of mcityo
	 */
	public void setMcityo(String mcityo) {
		this.mcityo.setValue(mcityo);
	}
	/**
	 * Gets the reference for attribute mzipc.
	 * @return the mzipc attribute reference
	 */
	public ElementaryRangeReference getMzipcReference() {
		return mzipc.getReference();
	}

	/**
	 * Getter for mzipc attribute.
	 * @return mzipc attribute
	 */
	public String getMzipc() {
		return mzipc.getValue();
	}

	/**
	 * Setter for mzipc attribute.
	 * @param mzipc the new value of mzipc
	 */
	public void setMzipc(String mzipc) {
		this.mzipc.setValue(mzipc);
	}
	/**
	 * Gets the reference for attribute mzipp.
	 * @return the mzipp attribute reference
	 */
	public ElementaryRangeReference getMzippReference() {
		return mzipp.getReference();
	}

	/**
	 * Getter for mzipp attribute.
	 * @return mzipp attribute
	 */
	public String getMzipp() {
		return mzipp.getValue();
	}

	/**
	 * Setter for mzipp attribute.
	 * @param mzipp the new value of mzipp
	 */
	public void setMzipp(String mzipp) {
		this.mzipp.setValue(mzipp);
	}
	/**
	 * Gets the reference for attribute mziph.
	 * @return the mziph attribute reference
	 */
	public ElementaryRangeReference getMziphReference() {
		return mziph.getReference();
	}

	/**
	 * Getter for mziph attribute.
	 * @return mziph attribute
	 */
	public String getMziph() {
		return mziph.getValue();
	}

	/**
	 * Setter for mziph attribute.
	 * @param mziph the new value of mziph
	 */
	public void setMziph(String mziph) {
		this.mziph.setValue(mziph);
	}
	/**
	 * Gets the reference for attribute mzipv.
	 * @return the mzipv attribute reference
	 */
	public ElementaryRangeReference getMzipvReference() {
		return mzipv.getReference();
	}

	/**
	 * Getter for mzipv attribute.
	 * @return mzipv attribute
	 */
	public String getMzipv() {
		return mzipv.getValue();
	}

	/**
	 * Setter for mzipv attribute.
	 * @param mzipv the new value of mzipv
	 */
	public void setMzipv(String mzipv) {
		this.mzipv.setValue(mzipv);
	}
	/**
	 * Gets the reference for attribute mzipo.
	 * @return the mzipo attribute reference
	 */
	public ElementaryRangeReference getMzipoReference() {
		return mzipo.getReference();
	}

	/**
	 * Getter for mzipo attribute.
	 * @return mzipo attribute
	 */
	public String getMzipo() {
		return mzipo.getValue();
	}

	/**
	 * Setter for mzipo attribute.
	 * @param mzipo the new value of mzipo
	 */
	public void setMzipo(String mzipo) {
		this.mzipo.setValue(mzipo);
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
