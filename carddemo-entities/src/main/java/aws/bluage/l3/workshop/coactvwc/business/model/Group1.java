package aws.bluage.l3.workshop.coactvwc.business.model;

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
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.NumericEditedType;
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity Group1.
 * 
 * <p>About 'cactvwai' field, <br>uml entity: aws.bluage.l3.workshop.coactvwc.business.model.Cactvwai
 * <br></p>
 * 
 * <p>About 'cactvwao' field, <br>uml entity: aws.bluage.l3.workshop.coactvwc.business.model.Cactvwao
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
	 * BMS Copybook
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
	private final Group cactvwai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cactvwai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(cactvwai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(cactvwai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(cactvwai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(cactvwai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(cactvwai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(cactvwai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(cactvwai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(cactvwai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(cactvwai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(cactvwai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(cactvwai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(cactvwai,new AlphanumericType(8));
	private final Elementary acctsidl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(cactvwai);
	private final Elementary acctsidf = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary acctsida = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acctsidi = new Elementary(cactvwai,new ZonedType(11, 0, false));
	private final Elementary acsttusl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(cactvwai);
	private final Elementary acsttusf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary acsttusa = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acsttusi = new Elementary(cactvwai,new AlphanumericType(1));
	private final Elementary adtopenl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(cactvwai);
	private final Elementary adtopenf = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary adtopena = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary adtopeni = new Elementary(cactvwai,new AlphanumericType(10));
	private final Elementary acrdliml = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(cactvwai);
	private final Elementary acrdlimf = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary acrdlima = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acrdlimi = new Elementary(cactvwai,new AlphanumericType(15));
	private final Elementary aexpdtl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(cactvwai);
	private final Elementary aexpdtf = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary aexpdta = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary aexpdti = new Elementary(cactvwai,new AlphanumericType(10));
	private final Elementary acshliml = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(cactvwai);
	private final Elementary acshlimf = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary acshlima = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acshlimi = new Elementary(cactvwai,new AlphanumericType(15));
	private final Elementary areisdtl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union13 = new Union(cactvwai);
	private final Elementary areisdtf = new Elementary(union13,new AlphanumericType(1));
	private final Group group12 = new Group(union13);
	private final Elementary areisdta = new Elementary(group12,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary areisdti = new Elementary(cactvwai,new AlphanumericType(10));
	private final Elementary acurball = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union14 = new Union(cactvwai);
	private final Elementary acurbalf = new Elementary(union14,new AlphanumericType(1));
	private final Group group13 = new Group(union14);
	private final Elementary acurbala = new Elementary(group13,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acurbali = new Elementary(cactvwai,new AlphanumericType(15));
	private final Elementary acrcycrl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union15 = new Union(cactvwai);
	private final Elementary acrcycrf = new Elementary(union15,new AlphanumericType(1));
	private final Group group14 = new Group(union15);
	private final Elementary acrcycra = new Elementary(group14,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acrcycri = new Elementary(cactvwai,new AlphanumericType(15));
	private final Elementary aaddgrpl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union16 = new Union(cactvwai);
	private final Elementary aaddgrpf = new Elementary(union16,new AlphanumericType(1));
	private final Group group15 = new Group(union16);
	private final Elementary aaddgrpa = new Elementary(group15,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary aaddgrpi = new Elementary(cactvwai,new AlphanumericType(10));
	private final Elementary acrcydbl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union17 = new Union(cactvwai);
	private final Elementary acrcydbf = new Elementary(union17,new AlphanumericType(1));
	private final Group group16 = new Group(union17);
	private final Elementary acrcydba = new Elementary(group16,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acrcydbi = new Elementary(cactvwai,new AlphanumericType(15));
	private final Elementary acstnuml = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union18 = new Union(cactvwai);
	private final Elementary acstnumf = new Elementary(union18,new AlphanumericType(1));
	private final Group group17 = new Group(union18);
	private final Elementary acstnuma = new Elementary(group17,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acstnumi = new Elementary(cactvwai,new AlphanumericType(9));
	private final Elementary acstssnl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union19 = new Union(cactvwai);
	private final Elementary acstssnf = new Elementary(union19,new AlphanumericType(1));
	private final Group group18 = new Group(union19);
	private final Elementary acstssna = new Elementary(group18,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acstssni = new Elementary(cactvwai,new AlphanumericType(12));
	private final Elementary acstdobl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union20 = new Union(cactvwai);
	private final Elementary acstdobf = new Elementary(union20,new AlphanumericType(1));
	private final Group group19 = new Group(union20);
	private final Elementary acstdoba = new Elementary(group19,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acstdobi = new Elementary(cactvwai,new AlphanumericType(10));
	private final Elementary acstfcol = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union21 = new Union(cactvwai);
	private final Elementary acstfcof = new Elementary(union21,new AlphanumericType(1));
	private final Group group20 = new Group(union21);
	private final Elementary acstfcoa = new Elementary(group20,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acstfcoi = new Elementary(cactvwai,new AlphanumericType(3));
	private final Elementary acsfnaml = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union22 = new Union(cactvwai);
	private final Elementary acsfnamf = new Elementary(union22,new AlphanumericType(1));
	private final Group group21 = new Group(union22);
	private final Elementary acsfnama = new Elementary(group21,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acsfnami = new Elementary(cactvwai,new AlphanumericType(25));
	private final Elementary acsmnaml = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union23 = new Union(cactvwai);
	private final Elementary acsmnamf = new Elementary(union23,new AlphanumericType(1));
	private final Group group22 = new Group(union23);
	private final Elementary acsmnama = new Elementary(group22,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acsmnami = new Elementary(cactvwai,new AlphanumericType(25));
	private final Elementary acslnaml = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union24 = new Union(cactvwai);
	private final Elementary acslnamf = new Elementary(union24,new AlphanumericType(1));
	private final Group group23 = new Group(union24);
	private final Elementary acslnama = new Elementary(group23,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acslnami = new Elementary(cactvwai,new AlphanumericType(25));
	private final Elementary acsadl1l = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union25 = new Union(cactvwai);
	private final Elementary acsadl1f = new Elementary(union25,new AlphanumericType(1));
	private final Group group24 = new Group(union25);
	private final Elementary acsadl1a = new Elementary(group24,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acsadl1i = new Elementary(cactvwai,new AlphanumericType(50));
	private final Elementary acssttel = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union26 = new Union(cactvwai);
	private final Elementary acssttef = new Elementary(union26,new AlphanumericType(1));
	private final Group group25 = new Group(union26);
	private final Elementary acssttea = new Elementary(group25,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acssttei = new Elementary(cactvwai,new AlphanumericType(2));
	private final Elementary acsadl2l = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union27 = new Union(cactvwai);
	private final Elementary acsadl2f = new Elementary(union27,new AlphanumericType(1));
	private final Group group26 = new Group(union27);
	private final Elementary acsadl2a = new Elementary(group26,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acsadl2i = new Elementary(cactvwai,new AlphanumericType(50));
	private final Elementary acszipcl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union28 = new Union(cactvwai);
	private final Elementary acszipcf = new Elementary(union28,new AlphanumericType(1));
	private final Group group27 = new Group(union28);
	private final Elementary acszipca = new Elementary(group27,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acszipci = new Elementary(cactvwai,new AlphanumericType(5));
	private final Elementary acscityl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union29 = new Union(cactvwai);
	private final Elementary acscityf = new Elementary(union29,new AlphanumericType(1));
	private final Group group28 = new Group(union29);
	private final Elementary acscitya = new Elementary(group28,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acscityi = new Elementary(cactvwai,new AlphanumericType(50));
	private final Elementary acsctryl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union30 = new Union(cactvwai);
	private final Elementary acsctryf = new Elementary(union30,new AlphanumericType(1));
	private final Group group29 = new Group(union30);
	private final Elementary acsctrya = new Elementary(group29,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acsctryi = new Elementary(cactvwai,new AlphanumericType(3));
	private final Elementary acsphn1l = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union31 = new Union(cactvwai);
	private final Elementary acsphn1f = new Elementary(union31,new AlphanumericType(1));
	private final Group group30 = new Group(union31);
	private final Elementary acsphn1a = new Elementary(group30,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acsphn1i = new Elementary(cactvwai,new AlphanumericType(13));
	private final Elementary acsgovtl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union32 = new Union(cactvwai);
	private final Elementary acsgovtf = new Elementary(union32,new AlphanumericType(1));
	private final Group group31 = new Group(union32);
	private final Elementary acsgovta = new Elementary(group31,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acsgovti = new Elementary(cactvwai,new AlphanumericType(20));
	private final Elementary acsphn2l = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union33 = new Union(cactvwai);
	private final Elementary acsphn2f = new Elementary(union33,new AlphanumericType(1));
	private final Group group32 = new Group(union33);
	private final Elementary acsphn2a = new Elementary(group32,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler33 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acsphn2i = new Elementary(cactvwai,new AlphanumericType(13));
	private final Elementary acseftcl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union34 = new Union(cactvwai);
	private final Elementary acseftcf = new Elementary(union34,new AlphanumericType(1));
	private final Group group33 = new Group(union34);
	private final Elementary acseftca = new Elementary(group33,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler34 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acseftci = new Elementary(cactvwai,new AlphanumericType(10));
	private final Elementary acspflgl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union35 = new Union(cactvwai);
	private final Elementary acspflgf = new Elementary(union35,new AlphanumericType(1));
	private final Group group34 = new Group(union35);
	private final Elementary acspflga = new Elementary(group34,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler35 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary acspflgi = new Elementary(cactvwai,new AlphanumericType(1));
	private final Elementary infomsgl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union36 = new Union(cactvwai);
	private final Elementary infomsgf = new Elementary(union36,new AlphanumericType(1));
	private final Group group35 = new Group(union36);
	private final Elementary infomsga = new Elementary(group35,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler36 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary infomsgi = new Elementary(cactvwai,new AlphanumericType(45));
	private final Elementary errmsgl = new Elementary(cactvwai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union37 = new Union(cactvwai);
	private final Elementary errmsgf = new Elementary(union37,new AlphanumericType(1));
	private final Group group36 = new Group(union37);
	private final Elementary errmsga = new Elementary(group36,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler37 = new Filler(cactvwai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(cactvwai,new AlphanumericType(78));
	private final Group cactvwao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler38 = new Filler(cactvwao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler39 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(cactvwao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler40 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(cactvwao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler41 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(cactvwao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler42 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(cactvwao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler43 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(cactvwao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler44 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(cactvwao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler45 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acctsidc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acctsidp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acctsidh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acctsidv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acctsido = new Elementary(cactvwao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler46 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acsttusc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsttusp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsttush = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsttusv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsttuso = new Elementary(cactvwao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler47 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary adtopenc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary adtopenp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary adtopenh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary adtopenv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary adtopeno = new Elementary(cactvwao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler48 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acrdlimc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrdlimp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrdlimh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrdlimv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrdlimo = new Elementary(cactvwao,new NumericEditedType("+ZZZ,ZZZ,ZZZ.99"));
	@SuppressWarnings("unused")
	private final Filler filler49 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary aexpdtc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary aexpdtp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary aexpdth = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary aexpdtv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary aexpdto = new Elementary(cactvwao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler50 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acshlimc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acshlimp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acshlimh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acshlimv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acshlimo = new Elementary(cactvwao,new NumericEditedType("+ZZZ,ZZZ,ZZZ.99"));
	@SuppressWarnings("unused")
	private final Filler filler51 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary areisdtc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary areisdtp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary areisdth = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary areisdtv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary areisdto = new Elementary(cactvwao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler52 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acurbalc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acurbalp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acurbalh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acurbalv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acurbalo = new Elementary(cactvwao,new NumericEditedType("+ZZZ,ZZZ,ZZZ.99"));
	@SuppressWarnings("unused")
	private final Filler filler53 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acrcycrc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrcycrp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrcycrh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrcycrv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrcycro = new Elementary(cactvwao,new NumericEditedType("+ZZZ,ZZZ,ZZZ.99"));
	@SuppressWarnings("unused")
	private final Filler filler54 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary aaddgrpc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary aaddgrpp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary aaddgrph = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary aaddgrpv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary aaddgrpo = new Elementary(cactvwao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler55 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acrcydbc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrcydbp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrcydbh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrcydbv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acrcydbo = new Elementary(cactvwao,new NumericEditedType("+ZZZ,ZZZ,ZZZ.99"));
	@SuppressWarnings("unused")
	private final Filler filler56 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acstnumc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstnump = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstnumh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstnumv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstnumo = new Elementary(cactvwao,new AlphanumericType(9));
	@SuppressWarnings("unused")
	private final Filler filler57 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acstssnc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstssnp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstssnh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstssnv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstssno = new Elementary(cactvwao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler58 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acstdobc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstdobp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstdobh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstdobv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstdobo = new Elementary(cactvwao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler59 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acstfcoc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstfcop = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstfcoh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstfcov = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acstfcoo = new Elementary(cactvwao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler60 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acsfnamc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsfnamp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsfnamh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsfnamv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsfnamo = new Elementary(cactvwao,new AlphanumericType(25));
	@SuppressWarnings("unused")
	private final Filler filler61 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acsmnamc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsmnamp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsmnamh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsmnamv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsmnamo = new Elementary(cactvwao,new AlphanumericType(25));
	@SuppressWarnings("unused")
	private final Filler filler62 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acslnamc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acslnamp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acslnamh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acslnamv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acslnamo = new Elementary(cactvwao,new AlphanumericType(25));
	@SuppressWarnings("unused")
	private final Filler filler63 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acsadl1c = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsadl1p = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsadl1h = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsadl1v = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsadl1o = new Elementary(cactvwao,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler64 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acssttec = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acssttep = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsstteh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acssttev = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsstteo = new Elementary(cactvwao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler65 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acsadl2c = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsadl2p = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsadl2h = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsadl2v = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsadl2o = new Elementary(cactvwao,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler66 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acszipcc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acszipcp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acszipch = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acszipcv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acszipco = new Elementary(cactvwao,new AlphanumericType(5));
	@SuppressWarnings("unused")
	private final Filler filler67 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acscityc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acscityp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acscityh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acscityv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acscityo = new Elementary(cactvwao,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler68 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acsctryc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsctryp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsctryh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsctryv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsctryo = new Elementary(cactvwao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler69 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acsphn1c = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsphn1p = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsphn1h = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsphn1v = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsphn1o = new Elementary(cactvwao,new AlphanumericType(13));
	@SuppressWarnings("unused")
	private final Filler filler70 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acsgovtc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsgovtp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsgovth = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsgovtv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsgovto = new Elementary(cactvwao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler71 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acsphn2c = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsphn2p = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsphn2h = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsphn2v = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acsphn2o = new Elementary(cactvwao,new AlphanumericType(13));
	@SuppressWarnings("unused")
	private final Filler filler72 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acseftcc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acseftcp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acseftch = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acseftcv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acseftco = new Elementary(cactvwao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler73 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary acspflgc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acspflgp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acspflgh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acspflgv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary acspflgo = new Elementary(cactvwao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler74 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary infomsgc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary infomsgp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary infomsgh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary infomsgv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary infomsgo = new Elementary(cactvwao,new AlphanumericType(45));
	@SuppressWarnings("unused")
	private final Filler filler75 = new Filler(cactvwao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(cactvwao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(cactvwao,new AlphanumericType(78));
	

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
	 * Gets the reference for attribute cactvwai.
	 * @return the cactvwai attribute reference
	 */
	public RangeReference getCactvwaiReference() {
		return cactvwai.getReference();
	}	
				
	/**
	 * Setter for cactvwai .
	 */
   	public void setCactvwai(RangeReference reference) {
       	cactvwai.getReference().setBytes(reference.getBytes());
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
	public long getAcctsidi() {
		return acctsidi.getValue();
	}

	/**
	 * Setter for acctsidi attribute.
	 * @param acctsidi the new value of acctsidi
	 */
	public void setAcctsidi(long acctsidi) {
		this.acctsidi.setValue(acctsidi);
	}
	/**
	 * Gets the reference for attribute acsttusl.
	 * @return the acsttusl attribute reference
	 */
	public ElementaryRangeReference getAcsttuslReference() {
		return acsttusl.getReference();
	}

	/**
	 * Getter for acsttusl attribute.
	 * @return acsttusl attribute
	 */
	public int getAcsttusl() {
		return acsttusl.getValue();
	}

	/**
	 * Setter for acsttusl attribute.
	 * @param acsttusl the new value of acsttusl
	 */
	public void setAcsttusl(int acsttusl) {
		this.acsttusl.setValue(acsttusl);
	}
	/**
	 * Gets the reference for attribute acsttusf.
	 * @return the acsttusf attribute reference
	 */
	public ElementaryRangeReference getAcsttusfReference() {
		return acsttusf.getReference();
	}

	/**
	 * Getter for acsttusf attribute.
	 * @return acsttusf attribute
	 */
	public String getAcsttusf() {
		return acsttusf.getValue();
	}

	/**
	 * Setter for acsttusf attribute.
	 * @param acsttusf the new value of acsttusf
	 */
	public void setAcsttusf(String acsttusf) {
		this.acsttusf.setValue(acsttusf);
	}
	/**
	 * Gets the reference for attribute acsttusa.
	 * @return the acsttusa attribute reference
	 */
	public ElementaryRangeReference getAcsttusaReference() {
		return acsttusa.getReference();
	}

	/**
	 * Getter for acsttusa attribute.
	 * @return acsttusa attribute
	 */
	public String getAcsttusa() {
		return acsttusa.getValue();
	}

	/**
	 * Setter for acsttusa attribute.
	 * @param acsttusa the new value of acsttusa
	 */
	public void setAcsttusa(String acsttusa) {
		this.acsttusa.setValue(acsttusa);
	}
	/**
	 * Gets the reference for attribute acsttusi.
	 * @return the acsttusi attribute reference
	 */
	public ElementaryRangeReference getAcsttusiReference() {
		return acsttusi.getReference();
	}

	/**
	 * Getter for acsttusi attribute.
	 * @return acsttusi attribute
	 */
	public String getAcsttusi() {
		return acsttusi.getValue();
	}

	/**
	 * Setter for acsttusi attribute.
	 * @param acsttusi the new value of acsttusi
	 */
	public void setAcsttusi(String acsttusi) {
		this.acsttusi.setValue(acsttusi);
	}
	/**
	 * Gets the reference for attribute adtopenl.
	 * @return the adtopenl attribute reference
	 */
	public ElementaryRangeReference getAdtopenlReference() {
		return adtopenl.getReference();
	}

	/**
	 * Getter for adtopenl attribute.
	 * @return adtopenl attribute
	 */
	public int getAdtopenl() {
		return adtopenl.getValue();
	}

	/**
	 * Setter for adtopenl attribute.
	 * @param adtopenl the new value of adtopenl
	 */
	public void setAdtopenl(int adtopenl) {
		this.adtopenl.setValue(adtopenl);
	}
	/**
	 * Gets the reference for attribute adtopenf.
	 * @return the adtopenf attribute reference
	 */
	public ElementaryRangeReference getAdtopenfReference() {
		return adtopenf.getReference();
	}

	/**
	 * Getter for adtopenf attribute.
	 * @return adtopenf attribute
	 */
	public String getAdtopenf() {
		return adtopenf.getValue();
	}

	/**
	 * Setter for adtopenf attribute.
	 * @param adtopenf the new value of adtopenf
	 */
	public void setAdtopenf(String adtopenf) {
		this.adtopenf.setValue(adtopenf);
	}
	/**
	 * Gets the reference for attribute adtopena.
	 * @return the adtopena attribute reference
	 */
	public ElementaryRangeReference getAdtopenaReference() {
		return adtopena.getReference();
	}

	/**
	 * Getter for adtopena attribute.
	 * @return adtopena attribute
	 */
	public String getAdtopena() {
		return adtopena.getValue();
	}

	/**
	 * Setter for adtopena attribute.
	 * @param adtopena the new value of adtopena
	 */
	public void setAdtopena(String adtopena) {
		this.adtopena.setValue(adtopena);
	}
	/**
	 * Gets the reference for attribute adtopeni.
	 * @return the adtopeni attribute reference
	 */
	public ElementaryRangeReference getAdtopeniReference() {
		return adtopeni.getReference();
	}

	/**
	 * Getter for adtopeni attribute.
	 * @return adtopeni attribute
	 */
	public String getAdtopeni() {
		return adtopeni.getValue();
	}

	/**
	 * Setter for adtopeni attribute.
	 * @param adtopeni the new value of adtopeni
	 */
	public void setAdtopeni(String adtopeni) {
		this.adtopeni.setValue(adtopeni);
	}
	/**
	 * Gets the reference for attribute acrdliml.
	 * @return the acrdliml attribute reference
	 */
	public ElementaryRangeReference getAcrdlimlReference() {
		return acrdliml.getReference();
	}

	/**
	 * Getter for acrdliml attribute.
	 * @return acrdliml attribute
	 */
	public int getAcrdliml() {
		return acrdliml.getValue();
	}

	/**
	 * Setter for acrdliml attribute.
	 * @param acrdliml the new value of acrdliml
	 */
	public void setAcrdliml(int acrdliml) {
		this.acrdliml.setValue(acrdliml);
	}
	/**
	 * Gets the reference for attribute acrdlimf.
	 * @return the acrdlimf attribute reference
	 */
	public ElementaryRangeReference getAcrdlimfReference() {
		return acrdlimf.getReference();
	}

	/**
	 * Getter for acrdlimf attribute.
	 * @return acrdlimf attribute
	 */
	public String getAcrdlimf() {
		return acrdlimf.getValue();
	}

	/**
	 * Setter for acrdlimf attribute.
	 * @param acrdlimf the new value of acrdlimf
	 */
	public void setAcrdlimf(String acrdlimf) {
		this.acrdlimf.setValue(acrdlimf);
	}
	/**
	 * Gets the reference for attribute acrdlima.
	 * @return the acrdlima attribute reference
	 */
	public ElementaryRangeReference getAcrdlimaReference() {
		return acrdlima.getReference();
	}

	/**
	 * Getter for acrdlima attribute.
	 * @return acrdlima attribute
	 */
	public String getAcrdlima() {
		return acrdlima.getValue();
	}

	/**
	 * Setter for acrdlima attribute.
	 * @param acrdlima the new value of acrdlima
	 */
	public void setAcrdlima(String acrdlima) {
		this.acrdlima.setValue(acrdlima);
	}
	/**
	 * Gets the reference for attribute acrdlimi.
	 * @return the acrdlimi attribute reference
	 */
	public ElementaryRangeReference getAcrdlimiReference() {
		return acrdlimi.getReference();
	}

	/**
	 * Getter for acrdlimi attribute.
	 * @return acrdlimi attribute
	 */
	public String getAcrdlimi() {
		return acrdlimi.getValue();
	}

	/**
	 * Setter for acrdlimi attribute.
	 * @param acrdlimi the new value of acrdlimi
	 */
	public void setAcrdlimi(String acrdlimi) {
		this.acrdlimi.setValue(acrdlimi);
	}
	/**
	 * Gets the reference for attribute aexpdtl.
	 * @return the aexpdtl attribute reference
	 */
	public ElementaryRangeReference getAexpdtlReference() {
		return aexpdtl.getReference();
	}

	/**
	 * Getter for aexpdtl attribute.
	 * @return aexpdtl attribute
	 */
	public int getAexpdtl() {
		return aexpdtl.getValue();
	}

	/**
	 * Setter for aexpdtl attribute.
	 * @param aexpdtl the new value of aexpdtl
	 */
	public void setAexpdtl(int aexpdtl) {
		this.aexpdtl.setValue(aexpdtl);
	}
	/**
	 * Gets the reference for attribute aexpdtf.
	 * @return the aexpdtf attribute reference
	 */
	public ElementaryRangeReference getAexpdtfReference() {
		return aexpdtf.getReference();
	}

	/**
	 * Getter for aexpdtf attribute.
	 * @return aexpdtf attribute
	 */
	public String getAexpdtf() {
		return aexpdtf.getValue();
	}

	/**
	 * Setter for aexpdtf attribute.
	 * @param aexpdtf the new value of aexpdtf
	 */
	public void setAexpdtf(String aexpdtf) {
		this.aexpdtf.setValue(aexpdtf);
	}
	/**
	 * Gets the reference for attribute aexpdta.
	 * @return the aexpdta attribute reference
	 */
	public ElementaryRangeReference getAexpdtaReference() {
		return aexpdta.getReference();
	}

	/**
	 * Getter for aexpdta attribute.
	 * @return aexpdta attribute
	 */
	public String getAexpdta() {
		return aexpdta.getValue();
	}

	/**
	 * Setter for aexpdta attribute.
	 * @param aexpdta the new value of aexpdta
	 */
	public void setAexpdta(String aexpdta) {
		this.aexpdta.setValue(aexpdta);
	}
	/**
	 * Gets the reference for attribute aexpdti.
	 * @return the aexpdti attribute reference
	 */
	public ElementaryRangeReference getAexpdtiReference() {
		return aexpdti.getReference();
	}

	/**
	 * Getter for aexpdti attribute.
	 * @return aexpdti attribute
	 */
	public String getAexpdti() {
		return aexpdti.getValue();
	}

	/**
	 * Setter for aexpdti attribute.
	 * @param aexpdti the new value of aexpdti
	 */
	public void setAexpdti(String aexpdti) {
		this.aexpdti.setValue(aexpdti);
	}
	/**
	 * Gets the reference for attribute acshliml.
	 * @return the acshliml attribute reference
	 */
	public ElementaryRangeReference getAcshlimlReference() {
		return acshliml.getReference();
	}

	/**
	 * Getter for acshliml attribute.
	 * @return acshliml attribute
	 */
	public int getAcshliml() {
		return acshliml.getValue();
	}

	/**
	 * Setter for acshliml attribute.
	 * @param acshliml the new value of acshliml
	 */
	public void setAcshliml(int acshliml) {
		this.acshliml.setValue(acshliml);
	}
	/**
	 * Gets the reference for attribute acshlimf.
	 * @return the acshlimf attribute reference
	 */
	public ElementaryRangeReference getAcshlimfReference() {
		return acshlimf.getReference();
	}

	/**
	 * Getter for acshlimf attribute.
	 * @return acshlimf attribute
	 */
	public String getAcshlimf() {
		return acshlimf.getValue();
	}

	/**
	 * Setter for acshlimf attribute.
	 * @param acshlimf the new value of acshlimf
	 */
	public void setAcshlimf(String acshlimf) {
		this.acshlimf.setValue(acshlimf);
	}
	/**
	 * Gets the reference for attribute acshlima.
	 * @return the acshlima attribute reference
	 */
	public ElementaryRangeReference getAcshlimaReference() {
		return acshlima.getReference();
	}

	/**
	 * Getter for acshlima attribute.
	 * @return acshlima attribute
	 */
	public String getAcshlima() {
		return acshlima.getValue();
	}

	/**
	 * Setter for acshlima attribute.
	 * @param acshlima the new value of acshlima
	 */
	public void setAcshlima(String acshlima) {
		this.acshlima.setValue(acshlima);
	}
	/**
	 * Gets the reference for attribute acshlimi.
	 * @return the acshlimi attribute reference
	 */
	public ElementaryRangeReference getAcshlimiReference() {
		return acshlimi.getReference();
	}

	/**
	 * Getter for acshlimi attribute.
	 * @return acshlimi attribute
	 */
	public String getAcshlimi() {
		return acshlimi.getValue();
	}

	/**
	 * Setter for acshlimi attribute.
	 * @param acshlimi the new value of acshlimi
	 */
	public void setAcshlimi(String acshlimi) {
		this.acshlimi.setValue(acshlimi);
	}
	/**
	 * Gets the reference for attribute areisdtl.
	 * @return the areisdtl attribute reference
	 */
	public ElementaryRangeReference getAreisdtlReference() {
		return areisdtl.getReference();
	}

	/**
	 * Getter for areisdtl attribute.
	 * @return areisdtl attribute
	 */
	public int getAreisdtl() {
		return areisdtl.getValue();
	}

	/**
	 * Setter for areisdtl attribute.
	 * @param areisdtl the new value of areisdtl
	 */
	public void setAreisdtl(int areisdtl) {
		this.areisdtl.setValue(areisdtl);
	}
	/**
	 * Gets the reference for attribute areisdtf.
	 * @return the areisdtf attribute reference
	 */
	public ElementaryRangeReference getAreisdtfReference() {
		return areisdtf.getReference();
	}

	/**
	 * Getter for areisdtf attribute.
	 * @return areisdtf attribute
	 */
	public String getAreisdtf() {
		return areisdtf.getValue();
	}

	/**
	 * Setter for areisdtf attribute.
	 * @param areisdtf the new value of areisdtf
	 */
	public void setAreisdtf(String areisdtf) {
		this.areisdtf.setValue(areisdtf);
	}
	/**
	 * Gets the reference for attribute areisdta.
	 * @return the areisdta attribute reference
	 */
	public ElementaryRangeReference getAreisdtaReference() {
		return areisdta.getReference();
	}

	/**
	 * Getter for areisdta attribute.
	 * @return areisdta attribute
	 */
	public String getAreisdta() {
		return areisdta.getValue();
	}

	/**
	 * Setter for areisdta attribute.
	 * @param areisdta the new value of areisdta
	 */
	public void setAreisdta(String areisdta) {
		this.areisdta.setValue(areisdta);
	}
	/**
	 * Gets the reference for attribute areisdti.
	 * @return the areisdti attribute reference
	 */
	public ElementaryRangeReference getAreisdtiReference() {
		return areisdti.getReference();
	}

	/**
	 * Getter for areisdti attribute.
	 * @return areisdti attribute
	 */
	public String getAreisdti() {
		return areisdti.getValue();
	}

	/**
	 * Setter for areisdti attribute.
	 * @param areisdti the new value of areisdti
	 */
	public void setAreisdti(String areisdti) {
		this.areisdti.setValue(areisdti);
	}
	/**
	 * Gets the reference for attribute acurball.
	 * @return the acurball attribute reference
	 */
	public ElementaryRangeReference getAcurballReference() {
		return acurball.getReference();
	}

	/**
	 * Getter for acurball attribute.
	 * @return acurball attribute
	 */
	public int getAcurball() {
		return acurball.getValue();
	}

	/**
	 * Setter for acurball attribute.
	 * @param acurball the new value of acurball
	 */
	public void setAcurball(int acurball) {
		this.acurball.setValue(acurball);
	}
	/**
	 * Gets the reference for attribute acurbalf.
	 * @return the acurbalf attribute reference
	 */
	public ElementaryRangeReference getAcurbalfReference() {
		return acurbalf.getReference();
	}

	/**
	 * Getter for acurbalf attribute.
	 * @return acurbalf attribute
	 */
	public String getAcurbalf() {
		return acurbalf.getValue();
	}

	/**
	 * Setter for acurbalf attribute.
	 * @param acurbalf the new value of acurbalf
	 */
	public void setAcurbalf(String acurbalf) {
		this.acurbalf.setValue(acurbalf);
	}
	/**
	 * Gets the reference for attribute acurbala.
	 * @return the acurbala attribute reference
	 */
	public ElementaryRangeReference getAcurbalaReference() {
		return acurbala.getReference();
	}

	/**
	 * Getter for acurbala attribute.
	 * @return acurbala attribute
	 */
	public String getAcurbala() {
		return acurbala.getValue();
	}

	/**
	 * Setter for acurbala attribute.
	 * @param acurbala the new value of acurbala
	 */
	public void setAcurbala(String acurbala) {
		this.acurbala.setValue(acurbala);
	}
	/**
	 * Gets the reference for attribute acurbali.
	 * @return the acurbali attribute reference
	 */
	public ElementaryRangeReference getAcurbaliReference() {
		return acurbali.getReference();
	}

	/**
	 * Getter for acurbali attribute.
	 * @return acurbali attribute
	 */
	public String getAcurbali() {
		return acurbali.getValue();
	}

	/**
	 * Setter for acurbali attribute.
	 * @param acurbali the new value of acurbali
	 */
	public void setAcurbali(String acurbali) {
		this.acurbali.setValue(acurbali);
	}
	/**
	 * Gets the reference for attribute acrcycrl.
	 * @return the acrcycrl attribute reference
	 */
	public ElementaryRangeReference getAcrcycrlReference() {
		return acrcycrl.getReference();
	}

	/**
	 * Getter for acrcycrl attribute.
	 * @return acrcycrl attribute
	 */
	public int getAcrcycrl() {
		return acrcycrl.getValue();
	}

	/**
	 * Setter for acrcycrl attribute.
	 * @param acrcycrl the new value of acrcycrl
	 */
	public void setAcrcycrl(int acrcycrl) {
		this.acrcycrl.setValue(acrcycrl);
	}
	/**
	 * Gets the reference for attribute acrcycrf.
	 * @return the acrcycrf attribute reference
	 */
	public ElementaryRangeReference getAcrcycrfReference() {
		return acrcycrf.getReference();
	}

	/**
	 * Getter for acrcycrf attribute.
	 * @return acrcycrf attribute
	 */
	public String getAcrcycrf() {
		return acrcycrf.getValue();
	}

	/**
	 * Setter for acrcycrf attribute.
	 * @param acrcycrf the new value of acrcycrf
	 */
	public void setAcrcycrf(String acrcycrf) {
		this.acrcycrf.setValue(acrcycrf);
	}
	/**
	 * Gets the reference for attribute acrcycra.
	 * @return the acrcycra attribute reference
	 */
	public ElementaryRangeReference getAcrcycraReference() {
		return acrcycra.getReference();
	}

	/**
	 * Getter for acrcycra attribute.
	 * @return acrcycra attribute
	 */
	public String getAcrcycra() {
		return acrcycra.getValue();
	}

	/**
	 * Setter for acrcycra attribute.
	 * @param acrcycra the new value of acrcycra
	 */
	public void setAcrcycra(String acrcycra) {
		this.acrcycra.setValue(acrcycra);
	}
	/**
	 * Gets the reference for attribute acrcycri.
	 * @return the acrcycri attribute reference
	 */
	public ElementaryRangeReference getAcrcycriReference() {
		return acrcycri.getReference();
	}

	/**
	 * Getter for acrcycri attribute.
	 * @return acrcycri attribute
	 */
	public String getAcrcycri() {
		return acrcycri.getValue();
	}

	/**
	 * Setter for acrcycri attribute.
	 * @param acrcycri the new value of acrcycri
	 */
	public void setAcrcycri(String acrcycri) {
		this.acrcycri.setValue(acrcycri);
	}
	/**
	 * Gets the reference for attribute aaddgrpl.
	 * @return the aaddgrpl attribute reference
	 */
	public ElementaryRangeReference getAaddgrplReference() {
		return aaddgrpl.getReference();
	}

	/**
	 * Getter for aaddgrpl attribute.
	 * @return aaddgrpl attribute
	 */
	public int getAaddgrpl() {
		return aaddgrpl.getValue();
	}

	/**
	 * Setter for aaddgrpl attribute.
	 * @param aaddgrpl the new value of aaddgrpl
	 */
	public void setAaddgrpl(int aaddgrpl) {
		this.aaddgrpl.setValue(aaddgrpl);
	}
	/**
	 * Gets the reference for attribute aaddgrpf.
	 * @return the aaddgrpf attribute reference
	 */
	public ElementaryRangeReference getAaddgrpfReference() {
		return aaddgrpf.getReference();
	}

	/**
	 * Getter for aaddgrpf attribute.
	 * @return aaddgrpf attribute
	 */
	public String getAaddgrpf() {
		return aaddgrpf.getValue();
	}

	/**
	 * Setter for aaddgrpf attribute.
	 * @param aaddgrpf the new value of aaddgrpf
	 */
	public void setAaddgrpf(String aaddgrpf) {
		this.aaddgrpf.setValue(aaddgrpf);
	}
	/**
	 * Gets the reference for attribute aaddgrpa.
	 * @return the aaddgrpa attribute reference
	 */
	public ElementaryRangeReference getAaddgrpaReference() {
		return aaddgrpa.getReference();
	}

	/**
	 * Getter for aaddgrpa attribute.
	 * @return aaddgrpa attribute
	 */
	public String getAaddgrpa() {
		return aaddgrpa.getValue();
	}

	/**
	 * Setter for aaddgrpa attribute.
	 * @param aaddgrpa the new value of aaddgrpa
	 */
	public void setAaddgrpa(String aaddgrpa) {
		this.aaddgrpa.setValue(aaddgrpa);
	}
	/**
	 * Gets the reference for attribute aaddgrpi.
	 * @return the aaddgrpi attribute reference
	 */
	public ElementaryRangeReference getAaddgrpiReference() {
		return aaddgrpi.getReference();
	}

	/**
	 * Getter for aaddgrpi attribute.
	 * @return aaddgrpi attribute
	 */
	public String getAaddgrpi() {
		return aaddgrpi.getValue();
	}

	/**
	 * Setter for aaddgrpi attribute.
	 * @param aaddgrpi the new value of aaddgrpi
	 */
	public void setAaddgrpi(String aaddgrpi) {
		this.aaddgrpi.setValue(aaddgrpi);
	}
	/**
	 * Gets the reference for attribute acrcydbl.
	 * @return the acrcydbl attribute reference
	 */
	public ElementaryRangeReference getAcrcydblReference() {
		return acrcydbl.getReference();
	}

	/**
	 * Getter for acrcydbl attribute.
	 * @return acrcydbl attribute
	 */
	public int getAcrcydbl() {
		return acrcydbl.getValue();
	}

	/**
	 * Setter for acrcydbl attribute.
	 * @param acrcydbl the new value of acrcydbl
	 */
	public void setAcrcydbl(int acrcydbl) {
		this.acrcydbl.setValue(acrcydbl);
	}
	/**
	 * Gets the reference for attribute acrcydbf.
	 * @return the acrcydbf attribute reference
	 */
	public ElementaryRangeReference getAcrcydbfReference() {
		return acrcydbf.getReference();
	}

	/**
	 * Getter for acrcydbf attribute.
	 * @return acrcydbf attribute
	 */
	public String getAcrcydbf() {
		return acrcydbf.getValue();
	}

	/**
	 * Setter for acrcydbf attribute.
	 * @param acrcydbf the new value of acrcydbf
	 */
	public void setAcrcydbf(String acrcydbf) {
		this.acrcydbf.setValue(acrcydbf);
	}
	/**
	 * Gets the reference for attribute acrcydba.
	 * @return the acrcydba attribute reference
	 */
	public ElementaryRangeReference getAcrcydbaReference() {
		return acrcydba.getReference();
	}

	/**
	 * Getter for acrcydba attribute.
	 * @return acrcydba attribute
	 */
	public String getAcrcydba() {
		return acrcydba.getValue();
	}

	/**
	 * Setter for acrcydba attribute.
	 * @param acrcydba the new value of acrcydba
	 */
	public void setAcrcydba(String acrcydba) {
		this.acrcydba.setValue(acrcydba);
	}
	/**
	 * Gets the reference for attribute acrcydbi.
	 * @return the acrcydbi attribute reference
	 */
	public ElementaryRangeReference getAcrcydbiReference() {
		return acrcydbi.getReference();
	}

	/**
	 * Getter for acrcydbi attribute.
	 * @return acrcydbi attribute
	 */
	public String getAcrcydbi() {
		return acrcydbi.getValue();
	}

	/**
	 * Setter for acrcydbi attribute.
	 * @param acrcydbi the new value of acrcydbi
	 */
	public void setAcrcydbi(String acrcydbi) {
		this.acrcydbi.setValue(acrcydbi);
	}
	/**
	 * Gets the reference for attribute acstnuml.
	 * @return the acstnuml attribute reference
	 */
	public ElementaryRangeReference getAcstnumlReference() {
		return acstnuml.getReference();
	}

	/**
	 * Getter for acstnuml attribute.
	 * @return acstnuml attribute
	 */
	public int getAcstnuml() {
		return acstnuml.getValue();
	}

	/**
	 * Setter for acstnuml attribute.
	 * @param acstnuml the new value of acstnuml
	 */
	public void setAcstnuml(int acstnuml) {
		this.acstnuml.setValue(acstnuml);
	}
	/**
	 * Gets the reference for attribute acstnumf.
	 * @return the acstnumf attribute reference
	 */
	public ElementaryRangeReference getAcstnumfReference() {
		return acstnumf.getReference();
	}

	/**
	 * Getter for acstnumf attribute.
	 * @return acstnumf attribute
	 */
	public String getAcstnumf() {
		return acstnumf.getValue();
	}

	/**
	 * Setter for acstnumf attribute.
	 * @param acstnumf the new value of acstnumf
	 */
	public void setAcstnumf(String acstnumf) {
		this.acstnumf.setValue(acstnumf);
	}
	/**
	 * Gets the reference for attribute acstnuma.
	 * @return the acstnuma attribute reference
	 */
	public ElementaryRangeReference getAcstnumaReference() {
		return acstnuma.getReference();
	}

	/**
	 * Getter for acstnuma attribute.
	 * @return acstnuma attribute
	 */
	public String getAcstnuma() {
		return acstnuma.getValue();
	}

	/**
	 * Setter for acstnuma attribute.
	 * @param acstnuma the new value of acstnuma
	 */
	public void setAcstnuma(String acstnuma) {
		this.acstnuma.setValue(acstnuma);
	}
	/**
	 * Gets the reference for attribute acstnumi.
	 * @return the acstnumi attribute reference
	 */
	public ElementaryRangeReference getAcstnumiReference() {
		return acstnumi.getReference();
	}

	/**
	 * Getter for acstnumi attribute.
	 * @return acstnumi attribute
	 */
	public String getAcstnumi() {
		return acstnumi.getValue();
	}

	/**
	 * Setter for acstnumi attribute.
	 * @param acstnumi the new value of acstnumi
	 */
	public void setAcstnumi(String acstnumi) {
		this.acstnumi.setValue(acstnumi);
	}
	/**
	 * Gets the reference for attribute acstssnl.
	 * @return the acstssnl attribute reference
	 */
	public ElementaryRangeReference getAcstssnlReference() {
		return acstssnl.getReference();
	}

	/**
	 * Getter for acstssnl attribute.
	 * @return acstssnl attribute
	 */
	public int getAcstssnl() {
		return acstssnl.getValue();
	}

	/**
	 * Setter for acstssnl attribute.
	 * @param acstssnl the new value of acstssnl
	 */
	public void setAcstssnl(int acstssnl) {
		this.acstssnl.setValue(acstssnl);
	}
	/**
	 * Gets the reference for attribute acstssnf.
	 * @return the acstssnf attribute reference
	 */
	public ElementaryRangeReference getAcstssnfReference() {
		return acstssnf.getReference();
	}

	/**
	 * Getter for acstssnf attribute.
	 * @return acstssnf attribute
	 */
	public String getAcstssnf() {
		return acstssnf.getValue();
	}

	/**
	 * Setter for acstssnf attribute.
	 * @param acstssnf the new value of acstssnf
	 */
	public void setAcstssnf(String acstssnf) {
		this.acstssnf.setValue(acstssnf);
	}
	/**
	 * Gets the reference for attribute acstssna.
	 * @return the acstssna attribute reference
	 */
	public ElementaryRangeReference getAcstssnaReference() {
		return acstssna.getReference();
	}

	/**
	 * Getter for acstssna attribute.
	 * @return acstssna attribute
	 */
	public String getAcstssna() {
		return acstssna.getValue();
	}

	/**
	 * Setter for acstssna attribute.
	 * @param acstssna the new value of acstssna
	 */
	public void setAcstssna(String acstssna) {
		this.acstssna.setValue(acstssna);
	}
	/**
	 * Gets the reference for attribute acstssni.
	 * @return the acstssni attribute reference
	 */
	public ElementaryRangeReference getAcstssniReference() {
		return acstssni.getReference();
	}

	/**
	 * Getter for acstssni attribute.
	 * @return acstssni attribute
	 */
	public String getAcstssni() {
		return acstssni.getValue();
	}

	/**
	 * Setter for acstssni attribute.
	 * @param acstssni the new value of acstssni
	 */
	public void setAcstssni(String acstssni) {
		this.acstssni.setValue(acstssni);
	}
	/**
	 * Gets the reference for attribute acstdobl.
	 * @return the acstdobl attribute reference
	 */
	public ElementaryRangeReference getAcstdoblReference() {
		return acstdobl.getReference();
	}

	/**
	 * Getter for acstdobl attribute.
	 * @return acstdobl attribute
	 */
	public int getAcstdobl() {
		return acstdobl.getValue();
	}

	/**
	 * Setter for acstdobl attribute.
	 * @param acstdobl the new value of acstdobl
	 */
	public void setAcstdobl(int acstdobl) {
		this.acstdobl.setValue(acstdobl);
	}
	/**
	 * Gets the reference for attribute acstdobf.
	 * @return the acstdobf attribute reference
	 */
	public ElementaryRangeReference getAcstdobfReference() {
		return acstdobf.getReference();
	}

	/**
	 * Getter for acstdobf attribute.
	 * @return acstdobf attribute
	 */
	public String getAcstdobf() {
		return acstdobf.getValue();
	}

	/**
	 * Setter for acstdobf attribute.
	 * @param acstdobf the new value of acstdobf
	 */
	public void setAcstdobf(String acstdobf) {
		this.acstdobf.setValue(acstdobf);
	}
	/**
	 * Gets the reference for attribute acstdoba.
	 * @return the acstdoba attribute reference
	 */
	public ElementaryRangeReference getAcstdobaReference() {
		return acstdoba.getReference();
	}

	/**
	 * Getter for acstdoba attribute.
	 * @return acstdoba attribute
	 */
	public String getAcstdoba() {
		return acstdoba.getValue();
	}

	/**
	 * Setter for acstdoba attribute.
	 * @param acstdoba the new value of acstdoba
	 */
	public void setAcstdoba(String acstdoba) {
		this.acstdoba.setValue(acstdoba);
	}
	/**
	 * Gets the reference for attribute acstdobi.
	 * @return the acstdobi attribute reference
	 */
	public ElementaryRangeReference getAcstdobiReference() {
		return acstdobi.getReference();
	}

	/**
	 * Getter for acstdobi attribute.
	 * @return acstdobi attribute
	 */
	public String getAcstdobi() {
		return acstdobi.getValue();
	}

	/**
	 * Setter for acstdobi attribute.
	 * @param acstdobi the new value of acstdobi
	 */
	public void setAcstdobi(String acstdobi) {
		this.acstdobi.setValue(acstdobi);
	}
	/**
	 * Gets the reference for attribute acstfcol.
	 * @return the acstfcol attribute reference
	 */
	public ElementaryRangeReference getAcstfcolReference() {
		return acstfcol.getReference();
	}

	/**
	 * Getter for acstfcol attribute.
	 * @return acstfcol attribute
	 */
	public int getAcstfcol() {
		return acstfcol.getValue();
	}

	/**
	 * Setter for acstfcol attribute.
	 * @param acstfcol the new value of acstfcol
	 */
	public void setAcstfcol(int acstfcol) {
		this.acstfcol.setValue(acstfcol);
	}
	/**
	 * Gets the reference for attribute acstfcof.
	 * @return the acstfcof attribute reference
	 */
	public ElementaryRangeReference getAcstfcofReference() {
		return acstfcof.getReference();
	}

	/**
	 * Getter for acstfcof attribute.
	 * @return acstfcof attribute
	 */
	public String getAcstfcof() {
		return acstfcof.getValue();
	}

	/**
	 * Setter for acstfcof attribute.
	 * @param acstfcof the new value of acstfcof
	 */
	public void setAcstfcof(String acstfcof) {
		this.acstfcof.setValue(acstfcof);
	}
	/**
	 * Gets the reference for attribute acstfcoa.
	 * @return the acstfcoa attribute reference
	 */
	public ElementaryRangeReference getAcstfcoaReference() {
		return acstfcoa.getReference();
	}

	/**
	 * Getter for acstfcoa attribute.
	 * @return acstfcoa attribute
	 */
	public String getAcstfcoa() {
		return acstfcoa.getValue();
	}

	/**
	 * Setter for acstfcoa attribute.
	 * @param acstfcoa the new value of acstfcoa
	 */
	public void setAcstfcoa(String acstfcoa) {
		this.acstfcoa.setValue(acstfcoa);
	}
	/**
	 * Gets the reference for attribute acstfcoi.
	 * @return the acstfcoi attribute reference
	 */
	public ElementaryRangeReference getAcstfcoiReference() {
		return acstfcoi.getReference();
	}

	/**
	 * Getter for acstfcoi attribute.
	 * @return acstfcoi attribute
	 */
	public String getAcstfcoi() {
		return acstfcoi.getValue();
	}

	/**
	 * Setter for acstfcoi attribute.
	 * @param acstfcoi the new value of acstfcoi
	 */
	public void setAcstfcoi(String acstfcoi) {
		this.acstfcoi.setValue(acstfcoi);
	}
	/**
	 * Gets the reference for attribute acsfnaml.
	 * @return the acsfnaml attribute reference
	 */
	public ElementaryRangeReference getAcsfnamlReference() {
		return acsfnaml.getReference();
	}

	/**
	 * Getter for acsfnaml attribute.
	 * @return acsfnaml attribute
	 */
	public int getAcsfnaml() {
		return acsfnaml.getValue();
	}

	/**
	 * Setter for acsfnaml attribute.
	 * @param acsfnaml the new value of acsfnaml
	 */
	public void setAcsfnaml(int acsfnaml) {
		this.acsfnaml.setValue(acsfnaml);
	}
	/**
	 * Gets the reference for attribute acsfnamf.
	 * @return the acsfnamf attribute reference
	 */
	public ElementaryRangeReference getAcsfnamfReference() {
		return acsfnamf.getReference();
	}

	/**
	 * Getter for acsfnamf attribute.
	 * @return acsfnamf attribute
	 */
	public String getAcsfnamf() {
		return acsfnamf.getValue();
	}

	/**
	 * Setter for acsfnamf attribute.
	 * @param acsfnamf the new value of acsfnamf
	 */
	public void setAcsfnamf(String acsfnamf) {
		this.acsfnamf.setValue(acsfnamf);
	}
	/**
	 * Gets the reference for attribute acsfnama.
	 * @return the acsfnama attribute reference
	 */
	public ElementaryRangeReference getAcsfnamaReference() {
		return acsfnama.getReference();
	}

	/**
	 * Getter for acsfnama attribute.
	 * @return acsfnama attribute
	 */
	public String getAcsfnama() {
		return acsfnama.getValue();
	}

	/**
	 * Setter for acsfnama attribute.
	 * @param acsfnama the new value of acsfnama
	 */
	public void setAcsfnama(String acsfnama) {
		this.acsfnama.setValue(acsfnama);
	}
	/**
	 * Gets the reference for attribute acsfnami.
	 * @return the acsfnami attribute reference
	 */
	public ElementaryRangeReference getAcsfnamiReference() {
		return acsfnami.getReference();
	}

	/**
	 * Getter for acsfnami attribute.
	 * @return acsfnami attribute
	 */
	public String getAcsfnami() {
		return acsfnami.getValue();
	}

	/**
	 * Setter for acsfnami attribute.
	 * @param acsfnami the new value of acsfnami
	 */
	public void setAcsfnami(String acsfnami) {
		this.acsfnami.setValue(acsfnami);
	}
	/**
	 * Gets the reference for attribute acsmnaml.
	 * @return the acsmnaml attribute reference
	 */
	public ElementaryRangeReference getAcsmnamlReference() {
		return acsmnaml.getReference();
	}

	/**
	 * Getter for acsmnaml attribute.
	 * @return acsmnaml attribute
	 */
	public int getAcsmnaml() {
		return acsmnaml.getValue();
	}

	/**
	 * Setter for acsmnaml attribute.
	 * @param acsmnaml the new value of acsmnaml
	 */
	public void setAcsmnaml(int acsmnaml) {
		this.acsmnaml.setValue(acsmnaml);
	}
	/**
	 * Gets the reference for attribute acsmnamf.
	 * @return the acsmnamf attribute reference
	 */
	public ElementaryRangeReference getAcsmnamfReference() {
		return acsmnamf.getReference();
	}

	/**
	 * Getter for acsmnamf attribute.
	 * @return acsmnamf attribute
	 */
	public String getAcsmnamf() {
		return acsmnamf.getValue();
	}

	/**
	 * Setter for acsmnamf attribute.
	 * @param acsmnamf the new value of acsmnamf
	 */
	public void setAcsmnamf(String acsmnamf) {
		this.acsmnamf.setValue(acsmnamf);
	}
	/**
	 * Gets the reference for attribute acsmnama.
	 * @return the acsmnama attribute reference
	 */
	public ElementaryRangeReference getAcsmnamaReference() {
		return acsmnama.getReference();
	}

	/**
	 * Getter for acsmnama attribute.
	 * @return acsmnama attribute
	 */
	public String getAcsmnama() {
		return acsmnama.getValue();
	}

	/**
	 * Setter for acsmnama attribute.
	 * @param acsmnama the new value of acsmnama
	 */
	public void setAcsmnama(String acsmnama) {
		this.acsmnama.setValue(acsmnama);
	}
	/**
	 * Gets the reference for attribute acsmnami.
	 * @return the acsmnami attribute reference
	 */
	public ElementaryRangeReference getAcsmnamiReference() {
		return acsmnami.getReference();
	}

	/**
	 * Getter for acsmnami attribute.
	 * @return acsmnami attribute
	 */
	public String getAcsmnami() {
		return acsmnami.getValue();
	}

	/**
	 * Setter for acsmnami attribute.
	 * @param acsmnami the new value of acsmnami
	 */
	public void setAcsmnami(String acsmnami) {
		this.acsmnami.setValue(acsmnami);
	}
	/**
	 * Gets the reference for attribute acslnaml.
	 * @return the acslnaml attribute reference
	 */
	public ElementaryRangeReference getAcslnamlReference() {
		return acslnaml.getReference();
	}

	/**
	 * Getter for acslnaml attribute.
	 * @return acslnaml attribute
	 */
	public int getAcslnaml() {
		return acslnaml.getValue();
	}

	/**
	 * Setter for acslnaml attribute.
	 * @param acslnaml the new value of acslnaml
	 */
	public void setAcslnaml(int acslnaml) {
		this.acslnaml.setValue(acslnaml);
	}
	/**
	 * Gets the reference for attribute acslnamf.
	 * @return the acslnamf attribute reference
	 */
	public ElementaryRangeReference getAcslnamfReference() {
		return acslnamf.getReference();
	}

	/**
	 * Getter for acslnamf attribute.
	 * @return acslnamf attribute
	 */
	public String getAcslnamf() {
		return acslnamf.getValue();
	}

	/**
	 * Setter for acslnamf attribute.
	 * @param acslnamf the new value of acslnamf
	 */
	public void setAcslnamf(String acslnamf) {
		this.acslnamf.setValue(acslnamf);
	}
	/**
	 * Gets the reference for attribute acslnama.
	 * @return the acslnama attribute reference
	 */
	public ElementaryRangeReference getAcslnamaReference() {
		return acslnama.getReference();
	}

	/**
	 * Getter for acslnama attribute.
	 * @return acslnama attribute
	 */
	public String getAcslnama() {
		return acslnama.getValue();
	}

	/**
	 * Setter for acslnama attribute.
	 * @param acslnama the new value of acslnama
	 */
	public void setAcslnama(String acslnama) {
		this.acslnama.setValue(acslnama);
	}
	/**
	 * Gets the reference for attribute acslnami.
	 * @return the acslnami attribute reference
	 */
	public ElementaryRangeReference getAcslnamiReference() {
		return acslnami.getReference();
	}

	/**
	 * Getter for acslnami attribute.
	 * @return acslnami attribute
	 */
	public String getAcslnami() {
		return acslnami.getValue();
	}

	/**
	 * Setter for acslnami attribute.
	 * @param acslnami the new value of acslnami
	 */
	public void setAcslnami(String acslnami) {
		this.acslnami.setValue(acslnami);
	}
	/**
	 * Gets the reference for attribute acsadl1l.
	 * @return the acsadl1l attribute reference
	 */
	public ElementaryRangeReference getAcsadl1lReference() {
		return acsadl1l.getReference();
	}

	/**
	 * Getter for acsadl1l attribute.
	 * @return acsadl1l attribute
	 */
	public int getAcsadl1l() {
		return acsadl1l.getValue();
	}

	/**
	 * Setter for acsadl1l attribute.
	 * @param acsadl1l the new value of acsadl1l
	 */
	public void setAcsadl1l(int acsadl1l) {
		this.acsadl1l.setValue(acsadl1l);
	}
	/**
	 * Gets the reference for attribute acsadl1f.
	 * @return the acsadl1f attribute reference
	 */
	public ElementaryRangeReference getAcsadl1fReference() {
		return acsadl1f.getReference();
	}

	/**
	 * Getter for acsadl1f attribute.
	 * @return acsadl1f attribute
	 */
	public String getAcsadl1f() {
		return acsadl1f.getValue();
	}

	/**
	 * Setter for acsadl1f attribute.
	 * @param acsadl1f the new value of acsadl1f
	 */
	public void setAcsadl1f(String acsadl1f) {
		this.acsadl1f.setValue(acsadl1f);
	}
	/**
	 * Gets the reference for attribute acsadl1a.
	 * @return the acsadl1a attribute reference
	 */
	public ElementaryRangeReference getAcsadl1aReference() {
		return acsadl1a.getReference();
	}

	/**
	 * Getter for acsadl1a attribute.
	 * @return acsadl1a attribute
	 */
	public String getAcsadl1a() {
		return acsadl1a.getValue();
	}

	/**
	 * Setter for acsadl1a attribute.
	 * @param acsadl1a the new value of acsadl1a
	 */
	public void setAcsadl1a(String acsadl1a) {
		this.acsadl1a.setValue(acsadl1a);
	}
	/**
	 * Gets the reference for attribute acsadl1i.
	 * @return the acsadl1i attribute reference
	 */
	public ElementaryRangeReference getAcsadl1iReference() {
		return acsadl1i.getReference();
	}

	/**
	 * Getter for acsadl1i attribute.
	 * @return acsadl1i attribute
	 */
	public String getAcsadl1i() {
		return acsadl1i.getValue();
	}

	/**
	 * Setter for acsadl1i attribute.
	 * @param acsadl1i the new value of acsadl1i
	 */
	public void setAcsadl1i(String acsadl1i) {
		this.acsadl1i.setValue(acsadl1i);
	}
	/**
	 * Gets the reference for attribute acssttel.
	 * @return the acssttel attribute reference
	 */
	public ElementaryRangeReference getAcssttelReference() {
		return acssttel.getReference();
	}

	/**
	 * Getter for acssttel attribute.
	 * @return acssttel attribute
	 */
	public int getAcssttel() {
		return acssttel.getValue();
	}

	/**
	 * Setter for acssttel attribute.
	 * @param acssttel the new value of acssttel
	 */
	public void setAcssttel(int acssttel) {
		this.acssttel.setValue(acssttel);
	}
	/**
	 * Gets the reference for attribute acssttef.
	 * @return the acssttef attribute reference
	 */
	public ElementaryRangeReference getAcssttefReference() {
		return acssttef.getReference();
	}

	/**
	 * Getter for acssttef attribute.
	 * @return acssttef attribute
	 */
	public String getAcssttef() {
		return acssttef.getValue();
	}

	/**
	 * Setter for acssttef attribute.
	 * @param acssttef the new value of acssttef
	 */
	public void setAcssttef(String acssttef) {
		this.acssttef.setValue(acssttef);
	}
	/**
	 * Gets the reference for attribute acssttea.
	 * @return the acssttea attribute reference
	 */
	public ElementaryRangeReference getAcsstteaReference() {
		return acssttea.getReference();
	}

	/**
	 * Getter for acssttea attribute.
	 * @return acssttea attribute
	 */
	public String getAcssttea() {
		return acssttea.getValue();
	}

	/**
	 * Setter for acssttea attribute.
	 * @param acssttea the new value of acssttea
	 */
	public void setAcssttea(String acssttea) {
		this.acssttea.setValue(acssttea);
	}
	/**
	 * Gets the reference for attribute acssttei.
	 * @return the acssttei attribute reference
	 */
	public ElementaryRangeReference getAcsstteiReference() {
		return acssttei.getReference();
	}

	/**
	 * Getter for acssttei attribute.
	 * @return acssttei attribute
	 */
	public String getAcssttei() {
		return acssttei.getValue();
	}

	/**
	 * Setter for acssttei attribute.
	 * @param acssttei the new value of acssttei
	 */
	public void setAcssttei(String acssttei) {
		this.acssttei.setValue(acssttei);
	}
	/**
	 * Gets the reference for attribute acsadl2l.
	 * @return the acsadl2l attribute reference
	 */
	public ElementaryRangeReference getAcsadl2lReference() {
		return acsadl2l.getReference();
	}

	/**
	 * Getter for acsadl2l attribute.
	 * @return acsadl2l attribute
	 */
	public int getAcsadl2l() {
		return acsadl2l.getValue();
	}

	/**
	 * Setter for acsadl2l attribute.
	 * @param acsadl2l the new value of acsadl2l
	 */
	public void setAcsadl2l(int acsadl2l) {
		this.acsadl2l.setValue(acsadl2l);
	}
	/**
	 * Gets the reference for attribute acsadl2f.
	 * @return the acsadl2f attribute reference
	 */
	public ElementaryRangeReference getAcsadl2fReference() {
		return acsadl2f.getReference();
	}

	/**
	 * Getter for acsadl2f attribute.
	 * @return acsadl2f attribute
	 */
	public String getAcsadl2f() {
		return acsadl2f.getValue();
	}

	/**
	 * Setter for acsadl2f attribute.
	 * @param acsadl2f the new value of acsadl2f
	 */
	public void setAcsadl2f(String acsadl2f) {
		this.acsadl2f.setValue(acsadl2f);
	}
	/**
	 * Gets the reference for attribute acsadl2a.
	 * @return the acsadl2a attribute reference
	 */
	public ElementaryRangeReference getAcsadl2aReference() {
		return acsadl2a.getReference();
	}

	/**
	 * Getter for acsadl2a attribute.
	 * @return acsadl2a attribute
	 */
	public String getAcsadl2a() {
		return acsadl2a.getValue();
	}

	/**
	 * Setter for acsadl2a attribute.
	 * @param acsadl2a the new value of acsadl2a
	 */
	public void setAcsadl2a(String acsadl2a) {
		this.acsadl2a.setValue(acsadl2a);
	}
	/**
	 * Gets the reference for attribute acsadl2i.
	 * @return the acsadl2i attribute reference
	 */
	public ElementaryRangeReference getAcsadl2iReference() {
		return acsadl2i.getReference();
	}

	/**
	 * Getter for acsadl2i attribute.
	 * @return acsadl2i attribute
	 */
	public String getAcsadl2i() {
		return acsadl2i.getValue();
	}

	/**
	 * Setter for acsadl2i attribute.
	 * @param acsadl2i the new value of acsadl2i
	 */
	public void setAcsadl2i(String acsadl2i) {
		this.acsadl2i.setValue(acsadl2i);
	}
	/**
	 * Gets the reference for attribute acszipcl.
	 * @return the acszipcl attribute reference
	 */
	public ElementaryRangeReference getAcszipclReference() {
		return acszipcl.getReference();
	}

	/**
	 * Getter for acszipcl attribute.
	 * @return acszipcl attribute
	 */
	public int getAcszipcl() {
		return acszipcl.getValue();
	}

	/**
	 * Setter for acszipcl attribute.
	 * @param acszipcl the new value of acszipcl
	 */
	public void setAcszipcl(int acszipcl) {
		this.acszipcl.setValue(acszipcl);
	}
	/**
	 * Gets the reference for attribute acszipcf.
	 * @return the acszipcf attribute reference
	 */
	public ElementaryRangeReference getAcszipcfReference() {
		return acszipcf.getReference();
	}

	/**
	 * Getter for acszipcf attribute.
	 * @return acszipcf attribute
	 */
	public String getAcszipcf() {
		return acszipcf.getValue();
	}

	/**
	 * Setter for acszipcf attribute.
	 * @param acszipcf the new value of acszipcf
	 */
	public void setAcszipcf(String acszipcf) {
		this.acszipcf.setValue(acszipcf);
	}
	/**
	 * Gets the reference for attribute acszipca.
	 * @return the acszipca attribute reference
	 */
	public ElementaryRangeReference getAcszipcaReference() {
		return acszipca.getReference();
	}

	/**
	 * Getter for acszipca attribute.
	 * @return acszipca attribute
	 */
	public String getAcszipca() {
		return acszipca.getValue();
	}

	/**
	 * Setter for acszipca attribute.
	 * @param acszipca the new value of acszipca
	 */
	public void setAcszipca(String acszipca) {
		this.acszipca.setValue(acszipca);
	}
	/**
	 * Gets the reference for attribute acszipci.
	 * @return the acszipci attribute reference
	 */
	public ElementaryRangeReference getAcszipciReference() {
		return acszipci.getReference();
	}

	/**
	 * Getter for acszipci attribute.
	 * @return acszipci attribute
	 */
	public String getAcszipci() {
		return acszipci.getValue();
	}

	/**
	 * Setter for acszipci attribute.
	 * @param acszipci the new value of acszipci
	 */
	public void setAcszipci(String acszipci) {
		this.acszipci.setValue(acszipci);
	}
	/**
	 * Gets the reference for attribute acscityl.
	 * @return the acscityl attribute reference
	 */
	public ElementaryRangeReference getAcscitylReference() {
		return acscityl.getReference();
	}

	/**
	 * Getter for acscityl attribute.
	 * @return acscityl attribute
	 */
	public int getAcscityl() {
		return acscityl.getValue();
	}

	/**
	 * Setter for acscityl attribute.
	 * @param acscityl the new value of acscityl
	 */
	public void setAcscityl(int acscityl) {
		this.acscityl.setValue(acscityl);
	}
	/**
	 * Gets the reference for attribute acscityf.
	 * @return the acscityf attribute reference
	 */
	public ElementaryRangeReference getAcscityfReference() {
		return acscityf.getReference();
	}

	/**
	 * Getter for acscityf attribute.
	 * @return acscityf attribute
	 */
	public String getAcscityf() {
		return acscityf.getValue();
	}

	/**
	 * Setter for acscityf attribute.
	 * @param acscityf the new value of acscityf
	 */
	public void setAcscityf(String acscityf) {
		this.acscityf.setValue(acscityf);
	}
	/**
	 * Gets the reference for attribute acscitya.
	 * @return the acscitya attribute reference
	 */
	public ElementaryRangeReference getAcscityaReference() {
		return acscitya.getReference();
	}

	/**
	 * Getter for acscitya attribute.
	 * @return acscitya attribute
	 */
	public String getAcscitya() {
		return acscitya.getValue();
	}

	/**
	 * Setter for acscitya attribute.
	 * @param acscitya the new value of acscitya
	 */
	public void setAcscitya(String acscitya) {
		this.acscitya.setValue(acscitya);
	}
	/**
	 * Gets the reference for attribute acscityi.
	 * @return the acscityi attribute reference
	 */
	public ElementaryRangeReference getAcscityiReference() {
		return acscityi.getReference();
	}

	/**
	 * Getter for acscityi attribute.
	 * @return acscityi attribute
	 */
	public String getAcscityi() {
		return acscityi.getValue();
	}

	/**
	 * Setter for acscityi attribute.
	 * @param acscityi the new value of acscityi
	 */
	public void setAcscityi(String acscityi) {
		this.acscityi.setValue(acscityi);
	}
	/**
	 * Gets the reference for attribute acsctryl.
	 * @return the acsctryl attribute reference
	 */
	public ElementaryRangeReference getAcsctrylReference() {
		return acsctryl.getReference();
	}

	/**
	 * Getter for acsctryl attribute.
	 * @return acsctryl attribute
	 */
	public int getAcsctryl() {
		return acsctryl.getValue();
	}

	/**
	 * Setter for acsctryl attribute.
	 * @param acsctryl the new value of acsctryl
	 */
	public void setAcsctryl(int acsctryl) {
		this.acsctryl.setValue(acsctryl);
	}
	/**
	 * Gets the reference for attribute acsctryf.
	 * @return the acsctryf attribute reference
	 */
	public ElementaryRangeReference getAcsctryfReference() {
		return acsctryf.getReference();
	}

	/**
	 * Getter for acsctryf attribute.
	 * @return acsctryf attribute
	 */
	public String getAcsctryf() {
		return acsctryf.getValue();
	}

	/**
	 * Setter for acsctryf attribute.
	 * @param acsctryf the new value of acsctryf
	 */
	public void setAcsctryf(String acsctryf) {
		this.acsctryf.setValue(acsctryf);
	}
	/**
	 * Gets the reference for attribute acsctrya.
	 * @return the acsctrya attribute reference
	 */
	public ElementaryRangeReference getAcsctryaReference() {
		return acsctrya.getReference();
	}

	/**
	 * Getter for acsctrya attribute.
	 * @return acsctrya attribute
	 */
	public String getAcsctrya() {
		return acsctrya.getValue();
	}

	/**
	 * Setter for acsctrya attribute.
	 * @param acsctrya the new value of acsctrya
	 */
	public void setAcsctrya(String acsctrya) {
		this.acsctrya.setValue(acsctrya);
	}
	/**
	 * Gets the reference for attribute acsctryi.
	 * @return the acsctryi attribute reference
	 */
	public ElementaryRangeReference getAcsctryiReference() {
		return acsctryi.getReference();
	}

	/**
	 * Getter for acsctryi attribute.
	 * @return acsctryi attribute
	 */
	public String getAcsctryi() {
		return acsctryi.getValue();
	}

	/**
	 * Setter for acsctryi attribute.
	 * @param acsctryi the new value of acsctryi
	 */
	public void setAcsctryi(String acsctryi) {
		this.acsctryi.setValue(acsctryi);
	}
	/**
	 * Gets the reference for attribute acsphn1l.
	 * @return the acsphn1l attribute reference
	 */
	public ElementaryRangeReference getAcsphn1lReference() {
		return acsphn1l.getReference();
	}

	/**
	 * Getter for acsphn1l attribute.
	 * @return acsphn1l attribute
	 */
	public int getAcsphn1l() {
		return acsphn1l.getValue();
	}

	/**
	 * Setter for acsphn1l attribute.
	 * @param acsphn1l the new value of acsphn1l
	 */
	public void setAcsphn1l(int acsphn1l) {
		this.acsphn1l.setValue(acsphn1l);
	}
	/**
	 * Gets the reference for attribute acsphn1f.
	 * @return the acsphn1f attribute reference
	 */
	public ElementaryRangeReference getAcsphn1fReference() {
		return acsphn1f.getReference();
	}

	/**
	 * Getter for acsphn1f attribute.
	 * @return acsphn1f attribute
	 */
	public String getAcsphn1f() {
		return acsphn1f.getValue();
	}

	/**
	 * Setter for acsphn1f attribute.
	 * @param acsphn1f the new value of acsphn1f
	 */
	public void setAcsphn1f(String acsphn1f) {
		this.acsphn1f.setValue(acsphn1f);
	}
	/**
	 * Gets the reference for attribute acsphn1a.
	 * @return the acsphn1a attribute reference
	 */
	public ElementaryRangeReference getAcsphn1aReference() {
		return acsphn1a.getReference();
	}

	/**
	 * Getter for acsphn1a attribute.
	 * @return acsphn1a attribute
	 */
	public String getAcsphn1a() {
		return acsphn1a.getValue();
	}

	/**
	 * Setter for acsphn1a attribute.
	 * @param acsphn1a the new value of acsphn1a
	 */
	public void setAcsphn1a(String acsphn1a) {
		this.acsphn1a.setValue(acsphn1a);
	}
	/**
	 * Gets the reference for attribute acsphn1i.
	 * @return the acsphn1i attribute reference
	 */
	public ElementaryRangeReference getAcsphn1iReference() {
		return acsphn1i.getReference();
	}

	/**
	 * Getter for acsphn1i attribute.
	 * @return acsphn1i attribute
	 */
	public String getAcsphn1i() {
		return acsphn1i.getValue();
	}

	/**
	 * Setter for acsphn1i attribute.
	 * @param acsphn1i the new value of acsphn1i
	 */
	public void setAcsphn1i(String acsphn1i) {
		this.acsphn1i.setValue(acsphn1i);
	}
	/**
	 * Gets the reference for attribute acsgovtl.
	 * @return the acsgovtl attribute reference
	 */
	public ElementaryRangeReference getAcsgovtlReference() {
		return acsgovtl.getReference();
	}

	/**
	 * Getter for acsgovtl attribute.
	 * @return acsgovtl attribute
	 */
	public int getAcsgovtl() {
		return acsgovtl.getValue();
	}

	/**
	 * Setter for acsgovtl attribute.
	 * @param acsgovtl the new value of acsgovtl
	 */
	public void setAcsgovtl(int acsgovtl) {
		this.acsgovtl.setValue(acsgovtl);
	}
	/**
	 * Gets the reference for attribute acsgovtf.
	 * @return the acsgovtf attribute reference
	 */
	public ElementaryRangeReference getAcsgovtfReference() {
		return acsgovtf.getReference();
	}

	/**
	 * Getter for acsgovtf attribute.
	 * @return acsgovtf attribute
	 */
	public String getAcsgovtf() {
		return acsgovtf.getValue();
	}

	/**
	 * Setter for acsgovtf attribute.
	 * @param acsgovtf the new value of acsgovtf
	 */
	public void setAcsgovtf(String acsgovtf) {
		this.acsgovtf.setValue(acsgovtf);
	}
	/**
	 * Gets the reference for attribute acsgovta.
	 * @return the acsgovta attribute reference
	 */
	public ElementaryRangeReference getAcsgovtaReference() {
		return acsgovta.getReference();
	}

	/**
	 * Getter for acsgovta attribute.
	 * @return acsgovta attribute
	 */
	public String getAcsgovta() {
		return acsgovta.getValue();
	}

	/**
	 * Setter for acsgovta attribute.
	 * @param acsgovta the new value of acsgovta
	 */
	public void setAcsgovta(String acsgovta) {
		this.acsgovta.setValue(acsgovta);
	}
	/**
	 * Gets the reference for attribute acsgovti.
	 * @return the acsgovti attribute reference
	 */
	public ElementaryRangeReference getAcsgovtiReference() {
		return acsgovti.getReference();
	}

	/**
	 * Getter for acsgovti attribute.
	 * @return acsgovti attribute
	 */
	public String getAcsgovti() {
		return acsgovti.getValue();
	}

	/**
	 * Setter for acsgovti attribute.
	 * @param acsgovti the new value of acsgovti
	 */
	public void setAcsgovti(String acsgovti) {
		this.acsgovti.setValue(acsgovti);
	}
	/**
	 * Gets the reference for attribute acsphn2l.
	 * @return the acsphn2l attribute reference
	 */
	public ElementaryRangeReference getAcsphn2lReference() {
		return acsphn2l.getReference();
	}

	/**
	 * Getter for acsphn2l attribute.
	 * @return acsphn2l attribute
	 */
	public int getAcsphn2l() {
		return acsphn2l.getValue();
	}

	/**
	 * Setter for acsphn2l attribute.
	 * @param acsphn2l the new value of acsphn2l
	 */
	public void setAcsphn2l(int acsphn2l) {
		this.acsphn2l.setValue(acsphn2l);
	}
	/**
	 * Gets the reference for attribute acsphn2f.
	 * @return the acsphn2f attribute reference
	 */
	public ElementaryRangeReference getAcsphn2fReference() {
		return acsphn2f.getReference();
	}

	/**
	 * Getter for acsphn2f attribute.
	 * @return acsphn2f attribute
	 */
	public String getAcsphn2f() {
		return acsphn2f.getValue();
	}

	/**
	 * Setter for acsphn2f attribute.
	 * @param acsphn2f the new value of acsphn2f
	 */
	public void setAcsphn2f(String acsphn2f) {
		this.acsphn2f.setValue(acsphn2f);
	}
	/**
	 * Gets the reference for attribute acsphn2a.
	 * @return the acsphn2a attribute reference
	 */
	public ElementaryRangeReference getAcsphn2aReference() {
		return acsphn2a.getReference();
	}

	/**
	 * Getter for acsphn2a attribute.
	 * @return acsphn2a attribute
	 */
	public String getAcsphn2a() {
		return acsphn2a.getValue();
	}

	/**
	 * Setter for acsphn2a attribute.
	 * @param acsphn2a the new value of acsphn2a
	 */
	public void setAcsphn2a(String acsphn2a) {
		this.acsphn2a.setValue(acsphn2a);
	}
	/**
	 * Gets the reference for attribute acsphn2i.
	 * @return the acsphn2i attribute reference
	 */
	public ElementaryRangeReference getAcsphn2iReference() {
		return acsphn2i.getReference();
	}

	/**
	 * Getter for acsphn2i attribute.
	 * @return acsphn2i attribute
	 */
	public String getAcsphn2i() {
		return acsphn2i.getValue();
	}

	/**
	 * Setter for acsphn2i attribute.
	 * @param acsphn2i the new value of acsphn2i
	 */
	public void setAcsphn2i(String acsphn2i) {
		this.acsphn2i.setValue(acsphn2i);
	}
	/**
	 * Gets the reference for attribute acseftcl.
	 * @return the acseftcl attribute reference
	 */
	public ElementaryRangeReference getAcseftclReference() {
		return acseftcl.getReference();
	}

	/**
	 * Getter for acseftcl attribute.
	 * @return acseftcl attribute
	 */
	public int getAcseftcl() {
		return acseftcl.getValue();
	}

	/**
	 * Setter for acseftcl attribute.
	 * @param acseftcl the new value of acseftcl
	 */
	public void setAcseftcl(int acseftcl) {
		this.acseftcl.setValue(acseftcl);
	}
	/**
	 * Gets the reference for attribute acseftcf.
	 * @return the acseftcf attribute reference
	 */
	public ElementaryRangeReference getAcseftcfReference() {
		return acseftcf.getReference();
	}

	/**
	 * Getter for acseftcf attribute.
	 * @return acseftcf attribute
	 */
	public String getAcseftcf() {
		return acseftcf.getValue();
	}

	/**
	 * Setter for acseftcf attribute.
	 * @param acseftcf the new value of acseftcf
	 */
	public void setAcseftcf(String acseftcf) {
		this.acseftcf.setValue(acseftcf);
	}
	/**
	 * Gets the reference for attribute acseftca.
	 * @return the acseftca attribute reference
	 */
	public ElementaryRangeReference getAcseftcaReference() {
		return acseftca.getReference();
	}

	/**
	 * Getter for acseftca attribute.
	 * @return acseftca attribute
	 */
	public String getAcseftca() {
		return acseftca.getValue();
	}

	/**
	 * Setter for acseftca attribute.
	 * @param acseftca the new value of acseftca
	 */
	public void setAcseftca(String acseftca) {
		this.acseftca.setValue(acseftca);
	}
	/**
	 * Gets the reference for attribute acseftci.
	 * @return the acseftci attribute reference
	 */
	public ElementaryRangeReference getAcseftciReference() {
		return acseftci.getReference();
	}

	/**
	 * Getter for acseftci attribute.
	 * @return acseftci attribute
	 */
	public String getAcseftci() {
		return acseftci.getValue();
	}

	/**
	 * Setter for acseftci attribute.
	 * @param acseftci the new value of acseftci
	 */
	public void setAcseftci(String acseftci) {
		this.acseftci.setValue(acseftci);
	}
	/**
	 * Gets the reference for attribute acspflgl.
	 * @return the acspflgl attribute reference
	 */
	public ElementaryRangeReference getAcspflglReference() {
		return acspflgl.getReference();
	}

	/**
	 * Getter for acspflgl attribute.
	 * @return acspflgl attribute
	 */
	public int getAcspflgl() {
		return acspflgl.getValue();
	}

	/**
	 * Setter for acspflgl attribute.
	 * @param acspflgl the new value of acspflgl
	 */
	public void setAcspflgl(int acspflgl) {
		this.acspflgl.setValue(acspflgl);
	}
	/**
	 * Gets the reference for attribute acspflgf.
	 * @return the acspflgf attribute reference
	 */
	public ElementaryRangeReference getAcspflgfReference() {
		return acspflgf.getReference();
	}

	/**
	 * Getter for acspflgf attribute.
	 * @return acspflgf attribute
	 */
	public String getAcspflgf() {
		return acspflgf.getValue();
	}

	/**
	 * Setter for acspflgf attribute.
	 * @param acspflgf the new value of acspflgf
	 */
	public void setAcspflgf(String acspflgf) {
		this.acspflgf.setValue(acspflgf);
	}
	/**
	 * Gets the reference for attribute acspflga.
	 * @return the acspflga attribute reference
	 */
	public ElementaryRangeReference getAcspflgaReference() {
		return acspflga.getReference();
	}

	/**
	 * Getter for acspflga attribute.
	 * @return acspflga attribute
	 */
	public String getAcspflga() {
		return acspflga.getValue();
	}

	/**
	 * Setter for acspflga attribute.
	 * @param acspflga the new value of acspflga
	 */
	public void setAcspflga(String acspflga) {
		this.acspflga.setValue(acspflga);
	}
	/**
	 * Gets the reference for attribute acspflgi.
	 * @return the acspflgi attribute reference
	 */
	public ElementaryRangeReference getAcspflgiReference() {
		return acspflgi.getReference();
	}

	/**
	 * Getter for acspflgi attribute.
	 * @return acspflgi attribute
	 */
	public String getAcspflgi() {
		return acspflgi.getValue();
	}

	/**
	 * Setter for acspflgi attribute.
	 * @param acspflgi the new value of acspflgi
	 */
	public void setAcspflgi(String acspflgi) {
		this.acspflgi.setValue(acspflgi);
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
	 * Gets the reference for attribute cactvwao.
	 * @return the cactvwao attribute reference
	 */
	public RangeReference getCactvwaoReference() {
		return cactvwao.getReference();
	}	
				
	/**
	 * Setter for cactvwao .
	 */
   	public void setCactvwao(RangeReference reference) {
       	cactvwao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute acsttusc.
	 * @return the acsttusc attribute reference
	 */
	public ElementaryRangeReference getAcsttuscReference() {
		return acsttusc.getReference();
	}

	/**
	 * Getter for acsttusc attribute.
	 * @return acsttusc attribute
	 */
	public String getAcsttusc() {
		return acsttusc.getValue();
	}

	/**
	 * Setter for acsttusc attribute.
	 * @param acsttusc the new value of acsttusc
	 */
	public void setAcsttusc(String acsttusc) {
		this.acsttusc.setValue(acsttusc);
	}
	/**
	 * Gets the reference for attribute acsttusp.
	 * @return the acsttusp attribute reference
	 */
	public ElementaryRangeReference getAcsttuspReference() {
		return acsttusp.getReference();
	}

	/**
	 * Getter for acsttusp attribute.
	 * @return acsttusp attribute
	 */
	public String getAcsttusp() {
		return acsttusp.getValue();
	}

	/**
	 * Setter for acsttusp attribute.
	 * @param acsttusp the new value of acsttusp
	 */
	public void setAcsttusp(String acsttusp) {
		this.acsttusp.setValue(acsttusp);
	}
	/**
	 * Gets the reference for attribute acsttush.
	 * @return the acsttush attribute reference
	 */
	public ElementaryRangeReference getAcsttushReference() {
		return acsttush.getReference();
	}

	/**
	 * Getter for acsttush attribute.
	 * @return acsttush attribute
	 */
	public String getAcsttush() {
		return acsttush.getValue();
	}

	/**
	 * Setter for acsttush attribute.
	 * @param acsttush the new value of acsttush
	 */
	public void setAcsttush(String acsttush) {
		this.acsttush.setValue(acsttush);
	}
	/**
	 * Gets the reference for attribute acsttusv.
	 * @return the acsttusv attribute reference
	 */
	public ElementaryRangeReference getAcsttusvReference() {
		return acsttusv.getReference();
	}

	/**
	 * Getter for acsttusv attribute.
	 * @return acsttusv attribute
	 */
	public String getAcsttusv() {
		return acsttusv.getValue();
	}

	/**
	 * Setter for acsttusv attribute.
	 * @param acsttusv the new value of acsttusv
	 */
	public void setAcsttusv(String acsttusv) {
		this.acsttusv.setValue(acsttusv);
	}
	/**
	 * Gets the reference for attribute acsttuso.
	 * @return the acsttuso attribute reference
	 */
	public ElementaryRangeReference getAcsttusoReference() {
		return acsttuso.getReference();
	}

	/**
	 * Getter for acsttuso attribute.
	 * @return acsttuso attribute
	 */
	public String getAcsttuso() {
		return acsttuso.getValue();
	}

	/**
	 * Setter for acsttuso attribute.
	 * @param acsttuso the new value of acsttuso
	 */
	public void setAcsttuso(String acsttuso) {
		this.acsttuso.setValue(acsttuso);
	}
	/**
	 * Gets the reference for attribute adtopenc.
	 * @return the adtopenc attribute reference
	 */
	public ElementaryRangeReference getAdtopencReference() {
		return adtopenc.getReference();
	}

	/**
	 * Getter for adtopenc attribute.
	 * @return adtopenc attribute
	 */
	public String getAdtopenc() {
		return adtopenc.getValue();
	}

	/**
	 * Setter for adtopenc attribute.
	 * @param adtopenc the new value of adtopenc
	 */
	public void setAdtopenc(String adtopenc) {
		this.adtopenc.setValue(adtopenc);
	}
	/**
	 * Gets the reference for attribute adtopenp.
	 * @return the adtopenp attribute reference
	 */
	public ElementaryRangeReference getAdtopenpReference() {
		return adtopenp.getReference();
	}

	/**
	 * Getter for adtopenp attribute.
	 * @return adtopenp attribute
	 */
	public String getAdtopenp() {
		return adtopenp.getValue();
	}

	/**
	 * Setter for adtopenp attribute.
	 * @param adtopenp the new value of adtopenp
	 */
	public void setAdtopenp(String adtopenp) {
		this.adtopenp.setValue(adtopenp);
	}
	/**
	 * Gets the reference for attribute adtopenh.
	 * @return the adtopenh attribute reference
	 */
	public ElementaryRangeReference getAdtopenhReference() {
		return adtopenh.getReference();
	}

	/**
	 * Getter for adtopenh attribute.
	 * @return adtopenh attribute
	 */
	public String getAdtopenh() {
		return adtopenh.getValue();
	}

	/**
	 * Setter for adtopenh attribute.
	 * @param adtopenh the new value of adtopenh
	 */
	public void setAdtopenh(String adtopenh) {
		this.adtopenh.setValue(adtopenh);
	}
	/**
	 * Gets the reference for attribute adtopenv.
	 * @return the adtopenv attribute reference
	 */
	public ElementaryRangeReference getAdtopenvReference() {
		return adtopenv.getReference();
	}

	/**
	 * Getter for adtopenv attribute.
	 * @return adtopenv attribute
	 */
	public String getAdtopenv() {
		return adtopenv.getValue();
	}

	/**
	 * Setter for adtopenv attribute.
	 * @param adtopenv the new value of adtopenv
	 */
	public void setAdtopenv(String adtopenv) {
		this.adtopenv.setValue(adtopenv);
	}
	/**
	 * Gets the reference for attribute adtopeno.
	 * @return the adtopeno attribute reference
	 */
	public ElementaryRangeReference getAdtopenoReference() {
		return adtopeno.getReference();
	}

	/**
	 * Getter for adtopeno attribute.
	 * @return adtopeno attribute
	 */
	public String getAdtopeno() {
		return adtopeno.getValue();
	}

	/**
	 * Setter for adtopeno attribute.
	 * @param adtopeno the new value of adtopeno
	 */
	public void setAdtopeno(String adtopeno) {
		this.adtopeno.setValue(adtopeno);
	}
	/**
	 * Gets the reference for attribute acrdlimc.
	 * @return the acrdlimc attribute reference
	 */
	public ElementaryRangeReference getAcrdlimcReference() {
		return acrdlimc.getReference();
	}

	/**
	 * Getter for acrdlimc attribute.
	 * @return acrdlimc attribute
	 */
	public String getAcrdlimc() {
		return acrdlimc.getValue();
	}

	/**
	 * Setter for acrdlimc attribute.
	 * @param acrdlimc the new value of acrdlimc
	 */
	public void setAcrdlimc(String acrdlimc) {
		this.acrdlimc.setValue(acrdlimc);
	}
	/**
	 * Gets the reference for attribute acrdlimp.
	 * @return the acrdlimp attribute reference
	 */
	public ElementaryRangeReference getAcrdlimpReference() {
		return acrdlimp.getReference();
	}

	/**
	 * Getter for acrdlimp attribute.
	 * @return acrdlimp attribute
	 */
	public String getAcrdlimp() {
		return acrdlimp.getValue();
	}

	/**
	 * Setter for acrdlimp attribute.
	 * @param acrdlimp the new value of acrdlimp
	 */
	public void setAcrdlimp(String acrdlimp) {
		this.acrdlimp.setValue(acrdlimp);
	}
	/**
	 * Gets the reference for attribute acrdlimh.
	 * @return the acrdlimh attribute reference
	 */
	public ElementaryRangeReference getAcrdlimhReference() {
		return acrdlimh.getReference();
	}

	/**
	 * Getter for acrdlimh attribute.
	 * @return acrdlimh attribute
	 */
	public String getAcrdlimh() {
		return acrdlimh.getValue();
	}

	/**
	 * Setter for acrdlimh attribute.
	 * @param acrdlimh the new value of acrdlimh
	 */
	public void setAcrdlimh(String acrdlimh) {
		this.acrdlimh.setValue(acrdlimh);
	}
	/**
	 * Gets the reference for attribute acrdlimv.
	 * @return the acrdlimv attribute reference
	 */
	public ElementaryRangeReference getAcrdlimvReference() {
		return acrdlimv.getReference();
	}

	/**
	 * Getter for acrdlimv attribute.
	 * @return acrdlimv attribute
	 */
	public String getAcrdlimv() {
		return acrdlimv.getValue();
	}

	/**
	 * Setter for acrdlimv attribute.
	 * @param acrdlimv the new value of acrdlimv
	 */
	public void setAcrdlimv(String acrdlimv) {
		this.acrdlimv.setValue(acrdlimv);
	}
	/**
	 * Gets the reference for attribute acrdlimo.
	 * @return the acrdlimo attribute reference
	 */
	public ElementaryRangeReference getAcrdlimoReference() {
		return acrdlimo.getReference();
	}

	/**
	 * Getter for acrdlimo attribute.
	 * @return acrdlimo attribute
	 */
	public String getAcrdlimo() {
		return acrdlimo.getValue();
	}

	/**
	 * Setter for acrdlimo attribute.
	 * @param acrdlimo the new value of acrdlimo
	 */
	public void setAcrdlimo(String acrdlimo) {
		this.acrdlimo.setValue(acrdlimo);
	}
	/**
	 * Gets the reference for attribute aexpdtc.
	 * @return the aexpdtc attribute reference
	 */
	public ElementaryRangeReference getAexpdtcReference() {
		return aexpdtc.getReference();
	}

	/**
	 * Getter for aexpdtc attribute.
	 * @return aexpdtc attribute
	 */
	public String getAexpdtc() {
		return aexpdtc.getValue();
	}

	/**
	 * Setter for aexpdtc attribute.
	 * @param aexpdtc the new value of aexpdtc
	 */
	public void setAexpdtc(String aexpdtc) {
		this.aexpdtc.setValue(aexpdtc);
	}
	/**
	 * Gets the reference for attribute aexpdtp.
	 * @return the aexpdtp attribute reference
	 */
	public ElementaryRangeReference getAexpdtpReference() {
		return aexpdtp.getReference();
	}

	/**
	 * Getter for aexpdtp attribute.
	 * @return aexpdtp attribute
	 */
	public String getAexpdtp() {
		return aexpdtp.getValue();
	}

	/**
	 * Setter for aexpdtp attribute.
	 * @param aexpdtp the new value of aexpdtp
	 */
	public void setAexpdtp(String aexpdtp) {
		this.aexpdtp.setValue(aexpdtp);
	}
	/**
	 * Gets the reference for attribute aexpdth.
	 * @return the aexpdth attribute reference
	 */
	public ElementaryRangeReference getAexpdthReference() {
		return aexpdth.getReference();
	}

	/**
	 * Getter for aexpdth attribute.
	 * @return aexpdth attribute
	 */
	public String getAexpdth() {
		return aexpdth.getValue();
	}

	/**
	 * Setter for aexpdth attribute.
	 * @param aexpdth the new value of aexpdth
	 */
	public void setAexpdth(String aexpdth) {
		this.aexpdth.setValue(aexpdth);
	}
	/**
	 * Gets the reference for attribute aexpdtv.
	 * @return the aexpdtv attribute reference
	 */
	public ElementaryRangeReference getAexpdtvReference() {
		return aexpdtv.getReference();
	}

	/**
	 * Getter for aexpdtv attribute.
	 * @return aexpdtv attribute
	 */
	public String getAexpdtv() {
		return aexpdtv.getValue();
	}

	/**
	 * Setter for aexpdtv attribute.
	 * @param aexpdtv the new value of aexpdtv
	 */
	public void setAexpdtv(String aexpdtv) {
		this.aexpdtv.setValue(aexpdtv);
	}
	/**
	 * Gets the reference for attribute aexpdto.
	 * @return the aexpdto attribute reference
	 */
	public ElementaryRangeReference getAexpdtoReference() {
		return aexpdto.getReference();
	}

	/**
	 * Getter for aexpdto attribute.
	 * @return aexpdto attribute
	 */
	public String getAexpdto() {
		return aexpdto.getValue();
	}

	/**
	 * Setter for aexpdto attribute.
	 * @param aexpdto the new value of aexpdto
	 */
	public void setAexpdto(String aexpdto) {
		this.aexpdto.setValue(aexpdto);
	}
	/**
	 * Gets the reference for attribute acshlimc.
	 * @return the acshlimc attribute reference
	 */
	public ElementaryRangeReference getAcshlimcReference() {
		return acshlimc.getReference();
	}

	/**
	 * Getter for acshlimc attribute.
	 * @return acshlimc attribute
	 */
	public String getAcshlimc() {
		return acshlimc.getValue();
	}

	/**
	 * Setter for acshlimc attribute.
	 * @param acshlimc the new value of acshlimc
	 */
	public void setAcshlimc(String acshlimc) {
		this.acshlimc.setValue(acshlimc);
	}
	/**
	 * Gets the reference for attribute acshlimp.
	 * @return the acshlimp attribute reference
	 */
	public ElementaryRangeReference getAcshlimpReference() {
		return acshlimp.getReference();
	}

	/**
	 * Getter for acshlimp attribute.
	 * @return acshlimp attribute
	 */
	public String getAcshlimp() {
		return acshlimp.getValue();
	}

	/**
	 * Setter for acshlimp attribute.
	 * @param acshlimp the new value of acshlimp
	 */
	public void setAcshlimp(String acshlimp) {
		this.acshlimp.setValue(acshlimp);
	}
	/**
	 * Gets the reference for attribute acshlimh.
	 * @return the acshlimh attribute reference
	 */
	public ElementaryRangeReference getAcshlimhReference() {
		return acshlimh.getReference();
	}

	/**
	 * Getter for acshlimh attribute.
	 * @return acshlimh attribute
	 */
	public String getAcshlimh() {
		return acshlimh.getValue();
	}

	/**
	 * Setter for acshlimh attribute.
	 * @param acshlimh the new value of acshlimh
	 */
	public void setAcshlimh(String acshlimh) {
		this.acshlimh.setValue(acshlimh);
	}
	/**
	 * Gets the reference for attribute acshlimv.
	 * @return the acshlimv attribute reference
	 */
	public ElementaryRangeReference getAcshlimvReference() {
		return acshlimv.getReference();
	}

	/**
	 * Getter for acshlimv attribute.
	 * @return acshlimv attribute
	 */
	public String getAcshlimv() {
		return acshlimv.getValue();
	}

	/**
	 * Setter for acshlimv attribute.
	 * @param acshlimv the new value of acshlimv
	 */
	public void setAcshlimv(String acshlimv) {
		this.acshlimv.setValue(acshlimv);
	}
	/**
	 * Gets the reference for attribute acshlimo.
	 * @return the acshlimo attribute reference
	 */
	public ElementaryRangeReference getAcshlimoReference() {
		return acshlimo.getReference();
	}

	/**
	 * Getter for acshlimo attribute.
	 * @return acshlimo attribute
	 */
	public String getAcshlimo() {
		return acshlimo.getValue();
	}

	/**
	 * Setter for acshlimo attribute.
	 * @param acshlimo the new value of acshlimo
	 */
	public void setAcshlimo(String acshlimo) {
		this.acshlimo.setValue(acshlimo);
	}
	/**
	 * Gets the reference for attribute areisdtc.
	 * @return the areisdtc attribute reference
	 */
	public ElementaryRangeReference getAreisdtcReference() {
		return areisdtc.getReference();
	}

	/**
	 * Getter for areisdtc attribute.
	 * @return areisdtc attribute
	 */
	public String getAreisdtc() {
		return areisdtc.getValue();
	}

	/**
	 * Setter for areisdtc attribute.
	 * @param areisdtc the new value of areisdtc
	 */
	public void setAreisdtc(String areisdtc) {
		this.areisdtc.setValue(areisdtc);
	}
	/**
	 * Gets the reference for attribute areisdtp.
	 * @return the areisdtp attribute reference
	 */
	public ElementaryRangeReference getAreisdtpReference() {
		return areisdtp.getReference();
	}

	/**
	 * Getter for areisdtp attribute.
	 * @return areisdtp attribute
	 */
	public String getAreisdtp() {
		return areisdtp.getValue();
	}

	/**
	 * Setter for areisdtp attribute.
	 * @param areisdtp the new value of areisdtp
	 */
	public void setAreisdtp(String areisdtp) {
		this.areisdtp.setValue(areisdtp);
	}
	/**
	 * Gets the reference for attribute areisdth.
	 * @return the areisdth attribute reference
	 */
	public ElementaryRangeReference getAreisdthReference() {
		return areisdth.getReference();
	}

	/**
	 * Getter for areisdth attribute.
	 * @return areisdth attribute
	 */
	public String getAreisdth() {
		return areisdth.getValue();
	}

	/**
	 * Setter for areisdth attribute.
	 * @param areisdth the new value of areisdth
	 */
	public void setAreisdth(String areisdth) {
		this.areisdth.setValue(areisdth);
	}
	/**
	 * Gets the reference for attribute areisdtv.
	 * @return the areisdtv attribute reference
	 */
	public ElementaryRangeReference getAreisdtvReference() {
		return areisdtv.getReference();
	}

	/**
	 * Getter for areisdtv attribute.
	 * @return areisdtv attribute
	 */
	public String getAreisdtv() {
		return areisdtv.getValue();
	}

	/**
	 * Setter for areisdtv attribute.
	 * @param areisdtv the new value of areisdtv
	 */
	public void setAreisdtv(String areisdtv) {
		this.areisdtv.setValue(areisdtv);
	}
	/**
	 * Gets the reference for attribute areisdto.
	 * @return the areisdto attribute reference
	 */
	public ElementaryRangeReference getAreisdtoReference() {
		return areisdto.getReference();
	}

	/**
	 * Getter for areisdto attribute.
	 * @return areisdto attribute
	 */
	public String getAreisdto() {
		return areisdto.getValue();
	}

	/**
	 * Setter for areisdto attribute.
	 * @param areisdto the new value of areisdto
	 */
	public void setAreisdto(String areisdto) {
		this.areisdto.setValue(areisdto);
	}
	/**
	 * Gets the reference for attribute acurbalc.
	 * @return the acurbalc attribute reference
	 */
	public ElementaryRangeReference getAcurbalcReference() {
		return acurbalc.getReference();
	}

	/**
	 * Getter for acurbalc attribute.
	 * @return acurbalc attribute
	 */
	public String getAcurbalc() {
		return acurbalc.getValue();
	}

	/**
	 * Setter for acurbalc attribute.
	 * @param acurbalc the new value of acurbalc
	 */
	public void setAcurbalc(String acurbalc) {
		this.acurbalc.setValue(acurbalc);
	}
	/**
	 * Gets the reference for attribute acurbalp.
	 * @return the acurbalp attribute reference
	 */
	public ElementaryRangeReference getAcurbalpReference() {
		return acurbalp.getReference();
	}

	/**
	 * Getter for acurbalp attribute.
	 * @return acurbalp attribute
	 */
	public String getAcurbalp() {
		return acurbalp.getValue();
	}

	/**
	 * Setter for acurbalp attribute.
	 * @param acurbalp the new value of acurbalp
	 */
	public void setAcurbalp(String acurbalp) {
		this.acurbalp.setValue(acurbalp);
	}
	/**
	 * Gets the reference for attribute acurbalh.
	 * @return the acurbalh attribute reference
	 */
	public ElementaryRangeReference getAcurbalhReference() {
		return acurbalh.getReference();
	}

	/**
	 * Getter for acurbalh attribute.
	 * @return acurbalh attribute
	 */
	public String getAcurbalh() {
		return acurbalh.getValue();
	}

	/**
	 * Setter for acurbalh attribute.
	 * @param acurbalh the new value of acurbalh
	 */
	public void setAcurbalh(String acurbalh) {
		this.acurbalh.setValue(acurbalh);
	}
	/**
	 * Gets the reference for attribute acurbalv.
	 * @return the acurbalv attribute reference
	 */
	public ElementaryRangeReference getAcurbalvReference() {
		return acurbalv.getReference();
	}

	/**
	 * Getter for acurbalv attribute.
	 * @return acurbalv attribute
	 */
	public String getAcurbalv() {
		return acurbalv.getValue();
	}

	/**
	 * Setter for acurbalv attribute.
	 * @param acurbalv the new value of acurbalv
	 */
	public void setAcurbalv(String acurbalv) {
		this.acurbalv.setValue(acurbalv);
	}
	/**
	 * Gets the reference for attribute acurbalo.
	 * @return the acurbalo attribute reference
	 */
	public ElementaryRangeReference getAcurbaloReference() {
		return acurbalo.getReference();
	}

	/**
	 * Getter for acurbalo attribute.
	 * @return acurbalo attribute
	 */
	public String getAcurbalo() {
		return acurbalo.getValue();
	}

	/**
	 * Setter for acurbalo attribute.
	 * @param acurbalo the new value of acurbalo
	 */
	public void setAcurbalo(String acurbalo) {
		this.acurbalo.setValue(acurbalo);
	}
	/**
	 * Gets the reference for attribute acrcycrc.
	 * @return the acrcycrc attribute reference
	 */
	public ElementaryRangeReference getAcrcycrcReference() {
		return acrcycrc.getReference();
	}

	/**
	 * Getter for acrcycrc attribute.
	 * @return acrcycrc attribute
	 */
	public String getAcrcycrc() {
		return acrcycrc.getValue();
	}

	/**
	 * Setter for acrcycrc attribute.
	 * @param acrcycrc the new value of acrcycrc
	 */
	public void setAcrcycrc(String acrcycrc) {
		this.acrcycrc.setValue(acrcycrc);
	}
	/**
	 * Gets the reference for attribute acrcycrp.
	 * @return the acrcycrp attribute reference
	 */
	public ElementaryRangeReference getAcrcycrpReference() {
		return acrcycrp.getReference();
	}

	/**
	 * Getter for acrcycrp attribute.
	 * @return acrcycrp attribute
	 */
	public String getAcrcycrp() {
		return acrcycrp.getValue();
	}

	/**
	 * Setter for acrcycrp attribute.
	 * @param acrcycrp the new value of acrcycrp
	 */
	public void setAcrcycrp(String acrcycrp) {
		this.acrcycrp.setValue(acrcycrp);
	}
	/**
	 * Gets the reference for attribute acrcycrh.
	 * @return the acrcycrh attribute reference
	 */
	public ElementaryRangeReference getAcrcycrhReference() {
		return acrcycrh.getReference();
	}

	/**
	 * Getter for acrcycrh attribute.
	 * @return acrcycrh attribute
	 */
	public String getAcrcycrh() {
		return acrcycrh.getValue();
	}

	/**
	 * Setter for acrcycrh attribute.
	 * @param acrcycrh the new value of acrcycrh
	 */
	public void setAcrcycrh(String acrcycrh) {
		this.acrcycrh.setValue(acrcycrh);
	}
	/**
	 * Gets the reference for attribute acrcycrv.
	 * @return the acrcycrv attribute reference
	 */
	public ElementaryRangeReference getAcrcycrvReference() {
		return acrcycrv.getReference();
	}

	/**
	 * Getter for acrcycrv attribute.
	 * @return acrcycrv attribute
	 */
	public String getAcrcycrv() {
		return acrcycrv.getValue();
	}

	/**
	 * Setter for acrcycrv attribute.
	 * @param acrcycrv the new value of acrcycrv
	 */
	public void setAcrcycrv(String acrcycrv) {
		this.acrcycrv.setValue(acrcycrv);
	}
	/**
	 * Gets the reference for attribute acrcycro.
	 * @return the acrcycro attribute reference
	 */
	public ElementaryRangeReference getAcrcycroReference() {
		return acrcycro.getReference();
	}

	/**
	 * Getter for acrcycro attribute.
	 * @return acrcycro attribute
	 */
	public String getAcrcycro() {
		return acrcycro.getValue();
	}

	/**
	 * Setter for acrcycro attribute.
	 * @param acrcycro the new value of acrcycro
	 */
	public void setAcrcycro(String acrcycro) {
		this.acrcycro.setValue(acrcycro);
	}
	/**
	 * Gets the reference for attribute aaddgrpc.
	 * @return the aaddgrpc attribute reference
	 */
	public ElementaryRangeReference getAaddgrpcReference() {
		return aaddgrpc.getReference();
	}

	/**
	 * Getter for aaddgrpc attribute.
	 * @return aaddgrpc attribute
	 */
	public String getAaddgrpc() {
		return aaddgrpc.getValue();
	}

	/**
	 * Setter for aaddgrpc attribute.
	 * @param aaddgrpc the new value of aaddgrpc
	 */
	public void setAaddgrpc(String aaddgrpc) {
		this.aaddgrpc.setValue(aaddgrpc);
	}
	/**
	 * Gets the reference for attribute aaddgrpp.
	 * @return the aaddgrpp attribute reference
	 */
	public ElementaryRangeReference getAaddgrppReference() {
		return aaddgrpp.getReference();
	}

	/**
	 * Getter for aaddgrpp attribute.
	 * @return aaddgrpp attribute
	 */
	public String getAaddgrpp() {
		return aaddgrpp.getValue();
	}

	/**
	 * Setter for aaddgrpp attribute.
	 * @param aaddgrpp the new value of aaddgrpp
	 */
	public void setAaddgrpp(String aaddgrpp) {
		this.aaddgrpp.setValue(aaddgrpp);
	}
	/**
	 * Gets the reference for attribute aaddgrph.
	 * @return the aaddgrph attribute reference
	 */
	public ElementaryRangeReference getAaddgrphReference() {
		return aaddgrph.getReference();
	}

	/**
	 * Getter for aaddgrph attribute.
	 * @return aaddgrph attribute
	 */
	public String getAaddgrph() {
		return aaddgrph.getValue();
	}

	/**
	 * Setter for aaddgrph attribute.
	 * @param aaddgrph the new value of aaddgrph
	 */
	public void setAaddgrph(String aaddgrph) {
		this.aaddgrph.setValue(aaddgrph);
	}
	/**
	 * Gets the reference for attribute aaddgrpv.
	 * @return the aaddgrpv attribute reference
	 */
	public ElementaryRangeReference getAaddgrpvReference() {
		return aaddgrpv.getReference();
	}

	/**
	 * Getter for aaddgrpv attribute.
	 * @return aaddgrpv attribute
	 */
	public String getAaddgrpv() {
		return aaddgrpv.getValue();
	}

	/**
	 * Setter for aaddgrpv attribute.
	 * @param aaddgrpv the new value of aaddgrpv
	 */
	public void setAaddgrpv(String aaddgrpv) {
		this.aaddgrpv.setValue(aaddgrpv);
	}
	/**
	 * Gets the reference for attribute aaddgrpo.
	 * @return the aaddgrpo attribute reference
	 */
	public ElementaryRangeReference getAaddgrpoReference() {
		return aaddgrpo.getReference();
	}

	/**
	 * Getter for aaddgrpo attribute.
	 * @return aaddgrpo attribute
	 */
	public String getAaddgrpo() {
		return aaddgrpo.getValue();
	}

	/**
	 * Setter for aaddgrpo attribute.
	 * @param aaddgrpo the new value of aaddgrpo
	 */
	public void setAaddgrpo(String aaddgrpo) {
		this.aaddgrpo.setValue(aaddgrpo);
	}
	/**
	 * Gets the reference for attribute acrcydbc.
	 * @return the acrcydbc attribute reference
	 */
	public ElementaryRangeReference getAcrcydbcReference() {
		return acrcydbc.getReference();
	}

	/**
	 * Getter for acrcydbc attribute.
	 * @return acrcydbc attribute
	 */
	public String getAcrcydbc() {
		return acrcydbc.getValue();
	}

	/**
	 * Setter for acrcydbc attribute.
	 * @param acrcydbc the new value of acrcydbc
	 */
	public void setAcrcydbc(String acrcydbc) {
		this.acrcydbc.setValue(acrcydbc);
	}
	/**
	 * Gets the reference for attribute acrcydbp.
	 * @return the acrcydbp attribute reference
	 */
	public ElementaryRangeReference getAcrcydbpReference() {
		return acrcydbp.getReference();
	}

	/**
	 * Getter for acrcydbp attribute.
	 * @return acrcydbp attribute
	 */
	public String getAcrcydbp() {
		return acrcydbp.getValue();
	}

	/**
	 * Setter for acrcydbp attribute.
	 * @param acrcydbp the new value of acrcydbp
	 */
	public void setAcrcydbp(String acrcydbp) {
		this.acrcydbp.setValue(acrcydbp);
	}
	/**
	 * Gets the reference for attribute acrcydbh.
	 * @return the acrcydbh attribute reference
	 */
	public ElementaryRangeReference getAcrcydbhReference() {
		return acrcydbh.getReference();
	}

	/**
	 * Getter for acrcydbh attribute.
	 * @return acrcydbh attribute
	 */
	public String getAcrcydbh() {
		return acrcydbh.getValue();
	}

	/**
	 * Setter for acrcydbh attribute.
	 * @param acrcydbh the new value of acrcydbh
	 */
	public void setAcrcydbh(String acrcydbh) {
		this.acrcydbh.setValue(acrcydbh);
	}
	/**
	 * Gets the reference for attribute acrcydbv.
	 * @return the acrcydbv attribute reference
	 */
	public ElementaryRangeReference getAcrcydbvReference() {
		return acrcydbv.getReference();
	}

	/**
	 * Getter for acrcydbv attribute.
	 * @return acrcydbv attribute
	 */
	public String getAcrcydbv() {
		return acrcydbv.getValue();
	}

	/**
	 * Setter for acrcydbv attribute.
	 * @param acrcydbv the new value of acrcydbv
	 */
	public void setAcrcydbv(String acrcydbv) {
		this.acrcydbv.setValue(acrcydbv);
	}
	/**
	 * Gets the reference for attribute acrcydbo.
	 * @return the acrcydbo attribute reference
	 */
	public ElementaryRangeReference getAcrcydboReference() {
		return acrcydbo.getReference();
	}

	/**
	 * Getter for acrcydbo attribute.
	 * @return acrcydbo attribute
	 */
	public String getAcrcydbo() {
		return acrcydbo.getValue();
	}

	/**
	 * Setter for acrcydbo attribute.
	 * @param acrcydbo the new value of acrcydbo
	 */
	public void setAcrcydbo(String acrcydbo) {
		this.acrcydbo.setValue(acrcydbo);
	}
	/**
	 * Gets the reference for attribute acstnumc.
	 * @return the acstnumc attribute reference
	 */
	public ElementaryRangeReference getAcstnumcReference() {
		return acstnumc.getReference();
	}

	/**
	 * Getter for acstnumc attribute.
	 * @return acstnumc attribute
	 */
	public String getAcstnumc() {
		return acstnumc.getValue();
	}

	/**
	 * Setter for acstnumc attribute.
	 * @param acstnumc the new value of acstnumc
	 */
	public void setAcstnumc(String acstnumc) {
		this.acstnumc.setValue(acstnumc);
	}
	/**
	 * Gets the reference for attribute acstnump.
	 * @return the acstnump attribute reference
	 */
	public ElementaryRangeReference getAcstnumpReference() {
		return acstnump.getReference();
	}

	/**
	 * Getter for acstnump attribute.
	 * @return acstnump attribute
	 */
	public String getAcstnump() {
		return acstnump.getValue();
	}

	/**
	 * Setter for acstnump attribute.
	 * @param acstnump the new value of acstnump
	 */
	public void setAcstnump(String acstnump) {
		this.acstnump.setValue(acstnump);
	}
	/**
	 * Gets the reference for attribute acstnumh.
	 * @return the acstnumh attribute reference
	 */
	public ElementaryRangeReference getAcstnumhReference() {
		return acstnumh.getReference();
	}

	/**
	 * Getter for acstnumh attribute.
	 * @return acstnumh attribute
	 */
	public String getAcstnumh() {
		return acstnumh.getValue();
	}

	/**
	 * Setter for acstnumh attribute.
	 * @param acstnumh the new value of acstnumh
	 */
	public void setAcstnumh(String acstnumh) {
		this.acstnumh.setValue(acstnumh);
	}
	/**
	 * Gets the reference for attribute acstnumv.
	 * @return the acstnumv attribute reference
	 */
	public ElementaryRangeReference getAcstnumvReference() {
		return acstnumv.getReference();
	}

	/**
	 * Getter for acstnumv attribute.
	 * @return acstnumv attribute
	 */
	public String getAcstnumv() {
		return acstnumv.getValue();
	}

	/**
	 * Setter for acstnumv attribute.
	 * @param acstnumv the new value of acstnumv
	 */
	public void setAcstnumv(String acstnumv) {
		this.acstnumv.setValue(acstnumv);
	}
	/**
	 * Gets the reference for attribute acstnumo.
	 * @return the acstnumo attribute reference
	 */
	public ElementaryRangeReference getAcstnumoReference() {
		return acstnumo.getReference();
	}

	/**
	 * Getter for acstnumo attribute.
	 * @return acstnumo attribute
	 */
	public String getAcstnumo() {
		return acstnumo.getValue();
	}

	/**
	 * Setter for acstnumo attribute.
	 * @param acstnumo the new value of acstnumo
	 */
	public void setAcstnumo(String acstnumo) {
		this.acstnumo.setValue(acstnumo);
	}
	/**
	 * Gets the reference for attribute acstssnc.
	 * @return the acstssnc attribute reference
	 */
	public ElementaryRangeReference getAcstssncReference() {
		return acstssnc.getReference();
	}

	/**
	 * Getter for acstssnc attribute.
	 * @return acstssnc attribute
	 */
	public String getAcstssnc() {
		return acstssnc.getValue();
	}

	/**
	 * Setter for acstssnc attribute.
	 * @param acstssnc the new value of acstssnc
	 */
	public void setAcstssnc(String acstssnc) {
		this.acstssnc.setValue(acstssnc);
	}
	/**
	 * Gets the reference for attribute acstssnp.
	 * @return the acstssnp attribute reference
	 */
	public ElementaryRangeReference getAcstssnpReference() {
		return acstssnp.getReference();
	}

	/**
	 * Getter for acstssnp attribute.
	 * @return acstssnp attribute
	 */
	public String getAcstssnp() {
		return acstssnp.getValue();
	}

	/**
	 * Setter for acstssnp attribute.
	 * @param acstssnp the new value of acstssnp
	 */
	public void setAcstssnp(String acstssnp) {
		this.acstssnp.setValue(acstssnp);
	}
	/**
	 * Gets the reference for attribute acstssnh.
	 * @return the acstssnh attribute reference
	 */
	public ElementaryRangeReference getAcstssnhReference() {
		return acstssnh.getReference();
	}

	/**
	 * Getter for acstssnh attribute.
	 * @return acstssnh attribute
	 */
	public String getAcstssnh() {
		return acstssnh.getValue();
	}

	/**
	 * Setter for acstssnh attribute.
	 * @param acstssnh the new value of acstssnh
	 */
	public void setAcstssnh(String acstssnh) {
		this.acstssnh.setValue(acstssnh);
	}
	/**
	 * Gets the reference for attribute acstssnv.
	 * @return the acstssnv attribute reference
	 */
	public ElementaryRangeReference getAcstssnvReference() {
		return acstssnv.getReference();
	}

	/**
	 * Getter for acstssnv attribute.
	 * @return acstssnv attribute
	 */
	public String getAcstssnv() {
		return acstssnv.getValue();
	}

	/**
	 * Setter for acstssnv attribute.
	 * @param acstssnv the new value of acstssnv
	 */
	public void setAcstssnv(String acstssnv) {
		this.acstssnv.setValue(acstssnv);
	}
	/**
	 * Gets the reference for attribute acstssno.
	 * @return the acstssno attribute reference
	 */
	public ElementaryRangeReference getAcstssnoReference() {
		return acstssno.getReference();
	}

	/**
	 * Getter for acstssno attribute.
	 * @return acstssno attribute
	 */
	public String getAcstssno() {
		return acstssno.getValue();
	}

	/**
	 * Setter for acstssno attribute.
	 * @param acstssno the new value of acstssno
	 */
	public void setAcstssno(String acstssno) {
		this.acstssno.setValue(acstssno);
	}
	/**
	 * Gets the reference for attribute acstdobc.
	 * @return the acstdobc attribute reference
	 */
	public ElementaryRangeReference getAcstdobcReference() {
		return acstdobc.getReference();
	}

	/**
	 * Getter for acstdobc attribute.
	 * @return acstdobc attribute
	 */
	public String getAcstdobc() {
		return acstdobc.getValue();
	}

	/**
	 * Setter for acstdobc attribute.
	 * @param acstdobc the new value of acstdobc
	 */
	public void setAcstdobc(String acstdobc) {
		this.acstdobc.setValue(acstdobc);
	}
	/**
	 * Gets the reference for attribute acstdobp.
	 * @return the acstdobp attribute reference
	 */
	public ElementaryRangeReference getAcstdobpReference() {
		return acstdobp.getReference();
	}

	/**
	 * Getter for acstdobp attribute.
	 * @return acstdobp attribute
	 */
	public String getAcstdobp() {
		return acstdobp.getValue();
	}

	/**
	 * Setter for acstdobp attribute.
	 * @param acstdobp the new value of acstdobp
	 */
	public void setAcstdobp(String acstdobp) {
		this.acstdobp.setValue(acstdobp);
	}
	/**
	 * Gets the reference for attribute acstdobh.
	 * @return the acstdobh attribute reference
	 */
	public ElementaryRangeReference getAcstdobhReference() {
		return acstdobh.getReference();
	}

	/**
	 * Getter for acstdobh attribute.
	 * @return acstdobh attribute
	 */
	public String getAcstdobh() {
		return acstdobh.getValue();
	}

	/**
	 * Setter for acstdobh attribute.
	 * @param acstdobh the new value of acstdobh
	 */
	public void setAcstdobh(String acstdobh) {
		this.acstdobh.setValue(acstdobh);
	}
	/**
	 * Gets the reference for attribute acstdobv.
	 * @return the acstdobv attribute reference
	 */
	public ElementaryRangeReference getAcstdobvReference() {
		return acstdobv.getReference();
	}

	/**
	 * Getter for acstdobv attribute.
	 * @return acstdobv attribute
	 */
	public String getAcstdobv() {
		return acstdobv.getValue();
	}

	/**
	 * Setter for acstdobv attribute.
	 * @param acstdobv the new value of acstdobv
	 */
	public void setAcstdobv(String acstdobv) {
		this.acstdobv.setValue(acstdobv);
	}
	/**
	 * Gets the reference for attribute acstdobo.
	 * @return the acstdobo attribute reference
	 */
	public ElementaryRangeReference getAcstdoboReference() {
		return acstdobo.getReference();
	}

	/**
	 * Getter for acstdobo attribute.
	 * @return acstdobo attribute
	 */
	public String getAcstdobo() {
		return acstdobo.getValue();
	}

	/**
	 * Setter for acstdobo attribute.
	 * @param acstdobo the new value of acstdobo
	 */
	public void setAcstdobo(String acstdobo) {
		this.acstdobo.setValue(acstdobo);
	}
	/**
	 * Gets the reference for attribute acstfcoc.
	 * @return the acstfcoc attribute reference
	 */
	public ElementaryRangeReference getAcstfcocReference() {
		return acstfcoc.getReference();
	}

	/**
	 * Getter for acstfcoc attribute.
	 * @return acstfcoc attribute
	 */
	public String getAcstfcoc() {
		return acstfcoc.getValue();
	}

	/**
	 * Setter for acstfcoc attribute.
	 * @param acstfcoc the new value of acstfcoc
	 */
	public void setAcstfcoc(String acstfcoc) {
		this.acstfcoc.setValue(acstfcoc);
	}
	/**
	 * Gets the reference for attribute acstfcop.
	 * @return the acstfcop attribute reference
	 */
	public ElementaryRangeReference getAcstfcopReference() {
		return acstfcop.getReference();
	}

	/**
	 * Getter for acstfcop attribute.
	 * @return acstfcop attribute
	 */
	public String getAcstfcop() {
		return acstfcop.getValue();
	}

	/**
	 * Setter for acstfcop attribute.
	 * @param acstfcop the new value of acstfcop
	 */
	public void setAcstfcop(String acstfcop) {
		this.acstfcop.setValue(acstfcop);
	}
	/**
	 * Gets the reference for attribute acstfcoh.
	 * @return the acstfcoh attribute reference
	 */
	public ElementaryRangeReference getAcstfcohReference() {
		return acstfcoh.getReference();
	}

	/**
	 * Getter for acstfcoh attribute.
	 * @return acstfcoh attribute
	 */
	public String getAcstfcoh() {
		return acstfcoh.getValue();
	}

	/**
	 * Setter for acstfcoh attribute.
	 * @param acstfcoh the new value of acstfcoh
	 */
	public void setAcstfcoh(String acstfcoh) {
		this.acstfcoh.setValue(acstfcoh);
	}
	/**
	 * Gets the reference for attribute acstfcov.
	 * @return the acstfcov attribute reference
	 */
	public ElementaryRangeReference getAcstfcovReference() {
		return acstfcov.getReference();
	}

	/**
	 * Getter for acstfcov attribute.
	 * @return acstfcov attribute
	 */
	public String getAcstfcov() {
		return acstfcov.getValue();
	}

	/**
	 * Setter for acstfcov attribute.
	 * @param acstfcov the new value of acstfcov
	 */
	public void setAcstfcov(String acstfcov) {
		this.acstfcov.setValue(acstfcov);
	}
	/**
	 * Gets the reference for attribute acstfcoo.
	 * @return the acstfcoo attribute reference
	 */
	public ElementaryRangeReference getAcstfcooReference() {
		return acstfcoo.getReference();
	}

	/**
	 * Getter for acstfcoo attribute.
	 * @return acstfcoo attribute
	 */
	public String getAcstfcoo() {
		return acstfcoo.getValue();
	}

	/**
	 * Setter for acstfcoo attribute.
	 * @param acstfcoo the new value of acstfcoo
	 */
	public void setAcstfcoo(String acstfcoo) {
		this.acstfcoo.setValue(acstfcoo);
	}
	/**
	 * Gets the reference for attribute acsfnamc.
	 * @return the acsfnamc attribute reference
	 */
	public ElementaryRangeReference getAcsfnamcReference() {
		return acsfnamc.getReference();
	}

	/**
	 * Getter for acsfnamc attribute.
	 * @return acsfnamc attribute
	 */
	public String getAcsfnamc() {
		return acsfnamc.getValue();
	}

	/**
	 * Setter for acsfnamc attribute.
	 * @param acsfnamc the new value of acsfnamc
	 */
	public void setAcsfnamc(String acsfnamc) {
		this.acsfnamc.setValue(acsfnamc);
	}
	/**
	 * Gets the reference for attribute acsfnamp.
	 * @return the acsfnamp attribute reference
	 */
	public ElementaryRangeReference getAcsfnampReference() {
		return acsfnamp.getReference();
	}

	/**
	 * Getter for acsfnamp attribute.
	 * @return acsfnamp attribute
	 */
	public String getAcsfnamp() {
		return acsfnamp.getValue();
	}

	/**
	 * Setter for acsfnamp attribute.
	 * @param acsfnamp the new value of acsfnamp
	 */
	public void setAcsfnamp(String acsfnamp) {
		this.acsfnamp.setValue(acsfnamp);
	}
	/**
	 * Gets the reference for attribute acsfnamh.
	 * @return the acsfnamh attribute reference
	 */
	public ElementaryRangeReference getAcsfnamhReference() {
		return acsfnamh.getReference();
	}

	/**
	 * Getter for acsfnamh attribute.
	 * @return acsfnamh attribute
	 */
	public String getAcsfnamh() {
		return acsfnamh.getValue();
	}

	/**
	 * Setter for acsfnamh attribute.
	 * @param acsfnamh the new value of acsfnamh
	 */
	public void setAcsfnamh(String acsfnamh) {
		this.acsfnamh.setValue(acsfnamh);
	}
	/**
	 * Gets the reference for attribute acsfnamv.
	 * @return the acsfnamv attribute reference
	 */
	public ElementaryRangeReference getAcsfnamvReference() {
		return acsfnamv.getReference();
	}

	/**
	 * Getter for acsfnamv attribute.
	 * @return acsfnamv attribute
	 */
	public String getAcsfnamv() {
		return acsfnamv.getValue();
	}

	/**
	 * Setter for acsfnamv attribute.
	 * @param acsfnamv the new value of acsfnamv
	 */
	public void setAcsfnamv(String acsfnamv) {
		this.acsfnamv.setValue(acsfnamv);
	}
	/**
	 * Gets the reference for attribute acsfnamo.
	 * @return the acsfnamo attribute reference
	 */
	public ElementaryRangeReference getAcsfnamoReference() {
		return acsfnamo.getReference();
	}

	/**
	 * Getter for acsfnamo attribute.
	 * @return acsfnamo attribute
	 */
	public String getAcsfnamo() {
		return acsfnamo.getValue();
	}

	/**
	 * Setter for acsfnamo attribute.
	 * @param acsfnamo the new value of acsfnamo
	 */
	public void setAcsfnamo(String acsfnamo) {
		this.acsfnamo.setValue(acsfnamo);
	}
	/**
	 * Gets the reference for attribute acsmnamc.
	 * @return the acsmnamc attribute reference
	 */
	public ElementaryRangeReference getAcsmnamcReference() {
		return acsmnamc.getReference();
	}

	/**
	 * Getter for acsmnamc attribute.
	 * @return acsmnamc attribute
	 */
	public String getAcsmnamc() {
		return acsmnamc.getValue();
	}

	/**
	 * Setter for acsmnamc attribute.
	 * @param acsmnamc the new value of acsmnamc
	 */
	public void setAcsmnamc(String acsmnamc) {
		this.acsmnamc.setValue(acsmnamc);
	}
	/**
	 * Gets the reference for attribute acsmnamp.
	 * @return the acsmnamp attribute reference
	 */
	public ElementaryRangeReference getAcsmnampReference() {
		return acsmnamp.getReference();
	}

	/**
	 * Getter for acsmnamp attribute.
	 * @return acsmnamp attribute
	 */
	public String getAcsmnamp() {
		return acsmnamp.getValue();
	}

	/**
	 * Setter for acsmnamp attribute.
	 * @param acsmnamp the new value of acsmnamp
	 */
	public void setAcsmnamp(String acsmnamp) {
		this.acsmnamp.setValue(acsmnamp);
	}
	/**
	 * Gets the reference for attribute acsmnamh.
	 * @return the acsmnamh attribute reference
	 */
	public ElementaryRangeReference getAcsmnamhReference() {
		return acsmnamh.getReference();
	}

	/**
	 * Getter for acsmnamh attribute.
	 * @return acsmnamh attribute
	 */
	public String getAcsmnamh() {
		return acsmnamh.getValue();
	}

	/**
	 * Setter for acsmnamh attribute.
	 * @param acsmnamh the new value of acsmnamh
	 */
	public void setAcsmnamh(String acsmnamh) {
		this.acsmnamh.setValue(acsmnamh);
	}
	/**
	 * Gets the reference for attribute acsmnamv.
	 * @return the acsmnamv attribute reference
	 */
	public ElementaryRangeReference getAcsmnamvReference() {
		return acsmnamv.getReference();
	}

	/**
	 * Getter for acsmnamv attribute.
	 * @return acsmnamv attribute
	 */
	public String getAcsmnamv() {
		return acsmnamv.getValue();
	}

	/**
	 * Setter for acsmnamv attribute.
	 * @param acsmnamv the new value of acsmnamv
	 */
	public void setAcsmnamv(String acsmnamv) {
		this.acsmnamv.setValue(acsmnamv);
	}
	/**
	 * Gets the reference for attribute acsmnamo.
	 * @return the acsmnamo attribute reference
	 */
	public ElementaryRangeReference getAcsmnamoReference() {
		return acsmnamo.getReference();
	}

	/**
	 * Getter for acsmnamo attribute.
	 * @return acsmnamo attribute
	 */
	public String getAcsmnamo() {
		return acsmnamo.getValue();
	}

	/**
	 * Setter for acsmnamo attribute.
	 * @param acsmnamo the new value of acsmnamo
	 */
	public void setAcsmnamo(String acsmnamo) {
		this.acsmnamo.setValue(acsmnamo);
	}
	/**
	 * Gets the reference for attribute acslnamc.
	 * @return the acslnamc attribute reference
	 */
	public ElementaryRangeReference getAcslnamcReference() {
		return acslnamc.getReference();
	}

	/**
	 * Getter for acslnamc attribute.
	 * @return acslnamc attribute
	 */
	public String getAcslnamc() {
		return acslnamc.getValue();
	}

	/**
	 * Setter for acslnamc attribute.
	 * @param acslnamc the new value of acslnamc
	 */
	public void setAcslnamc(String acslnamc) {
		this.acslnamc.setValue(acslnamc);
	}
	/**
	 * Gets the reference for attribute acslnamp.
	 * @return the acslnamp attribute reference
	 */
	public ElementaryRangeReference getAcslnampReference() {
		return acslnamp.getReference();
	}

	/**
	 * Getter for acslnamp attribute.
	 * @return acslnamp attribute
	 */
	public String getAcslnamp() {
		return acslnamp.getValue();
	}

	/**
	 * Setter for acslnamp attribute.
	 * @param acslnamp the new value of acslnamp
	 */
	public void setAcslnamp(String acslnamp) {
		this.acslnamp.setValue(acslnamp);
	}
	/**
	 * Gets the reference for attribute acslnamh.
	 * @return the acslnamh attribute reference
	 */
	public ElementaryRangeReference getAcslnamhReference() {
		return acslnamh.getReference();
	}

	/**
	 * Getter for acslnamh attribute.
	 * @return acslnamh attribute
	 */
	public String getAcslnamh() {
		return acslnamh.getValue();
	}

	/**
	 * Setter for acslnamh attribute.
	 * @param acslnamh the new value of acslnamh
	 */
	public void setAcslnamh(String acslnamh) {
		this.acslnamh.setValue(acslnamh);
	}
	/**
	 * Gets the reference for attribute acslnamv.
	 * @return the acslnamv attribute reference
	 */
	public ElementaryRangeReference getAcslnamvReference() {
		return acslnamv.getReference();
	}

	/**
	 * Getter for acslnamv attribute.
	 * @return acslnamv attribute
	 */
	public String getAcslnamv() {
		return acslnamv.getValue();
	}

	/**
	 * Setter for acslnamv attribute.
	 * @param acslnamv the new value of acslnamv
	 */
	public void setAcslnamv(String acslnamv) {
		this.acslnamv.setValue(acslnamv);
	}
	/**
	 * Gets the reference for attribute acslnamo.
	 * @return the acslnamo attribute reference
	 */
	public ElementaryRangeReference getAcslnamoReference() {
		return acslnamo.getReference();
	}

	/**
	 * Getter for acslnamo attribute.
	 * @return acslnamo attribute
	 */
	public String getAcslnamo() {
		return acslnamo.getValue();
	}

	/**
	 * Setter for acslnamo attribute.
	 * @param acslnamo the new value of acslnamo
	 */
	public void setAcslnamo(String acslnamo) {
		this.acslnamo.setValue(acslnamo);
	}
	/**
	 * Gets the reference for attribute acsadl1c.
	 * @return the acsadl1c attribute reference
	 */
	public ElementaryRangeReference getAcsadl1cReference() {
		return acsadl1c.getReference();
	}

	/**
	 * Getter for acsadl1c attribute.
	 * @return acsadl1c attribute
	 */
	public String getAcsadl1c() {
		return acsadl1c.getValue();
	}

	/**
	 * Setter for acsadl1c attribute.
	 * @param acsadl1c the new value of acsadl1c
	 */
	public void setAcsadl1c(String acsadl1c) {
		this.acsadl1c.setValue(acsadl1c);
	}
	/**
	 * Gets the reference for attribute acsadl1p.
	 * @return the acsadl1p attribute reference
	 */
	public ElementaryRangeReference getAcsadl1pReference() {
		return acsadl1p.getReference();
	}

	/**
	 * Getter for acsadl1p attribute.
	 * @return acsadl1p attribute
	 */
	public String getAcsadl1p() {
		return acsadl1p.getValue();
	}

	/**
	 * Setter for acsadl1p attribute.
	 * @param acsadl1p the new value of acsadl1p
	 */
	public void setAcsadl1p(String acsadl1p) {
		this.acsadl1p.setValue(acsadl1p);
	}
	/**
	 * Gets the reference for attribute acsadl1h.
	 * @return the acsadl1h attribute reference
	 */
	public ElementaryRangeReference getAcsadl1hReference() {
		return acsadl1h.getReference();
	}

	/**
	 * Getter for acsadl1h attribute.
	 * @return acsadl1h attribute
	 */
	public String getAcsadl1h() {
		return acsadl1h.getValue();
	}

	/**
	 * Setter for acsadl1h attribute.
	 * @param acsadl1h the new value of acsadl1h
	 */
	public void setAcsadl1h(String acsadl1h) {
		this.acsadl1h.setValue(acsadl1h);
	}
	/**
	 * Gets the reference for attribute acsadl1v.
	 * @return the acsadl1v attribute reference
	 */
	public ElementaryRangeReference getAcsadl1vReference() {
		return acsadl1v.getReference();
	}

	/**
	 * Getter for acsadl1v attribute.
	 * @return acsadl1v attribute
	 */
	public String getAcsadl1v() {
		return acsadl1v.getValue();
	}

	/**
	 * Setter for acsadl1v attribute.
	 * @param acsadl1v the new value of acsadl1v
	 */
	public void setAcsadl1v(String acsadl1v) {
		this.acsadl1v.setValue(acsadl1v);
	}
	/**
	 * Gets the reference for attribute acsadl1o.
	 * @return the acsadl1o attribute reference
	 */
	public ElementaryRangeReference getAcsadl1oReference() {
		return acsadl1o.getReference();
	}

	/**
	 * Getter for acsadl1o attribute.
	 * @return acsadl1o attribute
	 */
	public String getAcsadl1o() {
		return acsadl1o.getValue();
	}

	/**
	 * Setter for acsadl1o attribute.
	 * @param acsadl1o the new value of acsadl1o
	 */
	public void setAcsadl1o(String acsadl1o) {
		this.acsadl1o.setValue(acsadl1o);
	}
	/**
	 * Gets the reference for attribute acssttec.
	 * @return the acssttec attribute reference
	 */
	public ElementaryRangeReference getAcssttecReference() {
		return acssttec.getReference();
	}

	/**
	 * Getter for acssttec attribute.
	 * @return acssttec attribute
	 */
	public String getAcssttec() {
		return acssttec.getValue();
	}

	/**
	 * Setter for acssttec attribute.
	 * @param acssttec the new value of acssttec
	 */
	public void setAcssttec(String acssttec) {
		this.acssttec.setValue(acssttec);
	}
	/**
	 * Gets the reference for attribute acssttep.
	 * @return the acssttep attribute reference
	 */
	public ElementaryRangeReference getAcssttepReference() {
		return acssttep.getReference();
	}

	/**
	 * Getter for acssttep attribute.
	 * @return acssttep attribute
	 */
	public String getAcssttep() {
		return acssttep.getValue();
	}

	/**
	 * Setter for acssttep attribute.
	 * @param acssttep the new value of acssttep
	 */
	public void setAcssttep(String acssttep) {
		this.acssttep.setValue(acssttep);
	}
	/**
	 * Gets the reference for attribute acsstteh.
	 * @return the acsstteh attribute reference
	 */
	public ElementaryRangeReference getAcssttehReference() {
		return acsstteh.getReference();
	}

	/**
	 * Getter for acsstteh attribute.
	 * @return acsstteh attribute
	 */
	public String getAcsstteh() {
		return acsstteh.getValue();
	}

	/**
	 * Setter for acsstteh attribute.
	 * @param acsstteh the new value of acsstteh
	 */
	public void setAcsstteh(String acsstteh) {
		this.acsstteh.setValue(acsstteh);
	}
	/**
	 * Gets the reference for attribute acssttev.
	 * @return the acssttev attribute reference
	 */
	public ElementaryRangeReference getAcssttevReference() {
		return acssttev.getReference();
	}

	/**
	 * Getter for acssttev attribute.
	 * @return acssttev attribute
	 */
	public String getAcssttev() {
		return acssttev.getValue();
	}

	/**
	 * Setter for acssttev attribute.
	 * @param acssttev the new value of acssttev
	 */
	public void setAcssttev(String acssttev) {
		this.acssttev.setValue(acssttev);
	}
	/**
	 * Gets the reference for attribute acsstteo.
	 * @return the acsstteo attribute reference
	 */
	public ElementaryRangeReference getAcsstteoReference() {
		return acsstteo.getReference();
	}

	/**
	 * Getter for acsstteo attribute.
	 * @return acsstteo attribute
	 */
	public String getAcsstteo() {
		return acsstteo.getValue();
	}

	/**
	 * Setter for acsstteo attribute.
	 * @param acsstteo the new value of acsstteo
	 */
	public void setAcsstteo(String acsstteo) {
		this.acsstteo.setValue(acsstteo);
	}
	/**
	 * Gets the reference for attribute acsadl2c.
	 * @return the acsadl2c attribute reference
	 */
	public ElementaryRangeReference getAcsadl2cReference() {
		return acsadl2c.getReference();
	}

	/**
	 * Getter for acsadl2c attribute.
	 * @return acsadl2c attribute
	 */
	public String getAcsadl2c() {
		return acsadl2c.getValue();
	}

	/**
	 * Setter for acsadl2c attribute.
	 * @param acsadl2c the new value of acsadl2c
	 */
	public void setAcsadl2c(String acsadl2c) {
		this.acsadl2c.setValue(acsadl2c);
	}
	/**
	 * Gets the reference for attribute acsadl2p.
	 * @return the acsadl2p attribute reference
	 */
	public ElementaryRangeReference getAcsadl2pReference() {
		return acsadl2p.getReference();
	}

	/**
	 * Getter for acsadl2p attribute.
	 * @return acsadl2p attribute
	 */
	public String getAcsadl2p() {
		return acsadl2p.getValue();
	}

	/**
	 * Setter for acsadl2p attribute.
	 * @param acsadl2p the new value of acsadl2p
	 */
	public void setAcsadl2p(String acsadl2p) {
		this.acsadl2p.setValue(acsadl2p);
	}
	/**
	 * Gets the reference for attribute acsadl2h.
	 * @return the acsadl2h attribute reference
	 */
	public ElementaryRangeReference getAcsadl2hReference() {
		return acsadl2h.getReference();
	}

	/**
	 * Getter for acsadl2h attribute.
	 * @return acsadl2h attribute
	 */
	public String getAcsadl2h() {
		return acsadl2h.getValue();
	}

	/**
	 * Setter for acsadl2h attribute.
	 * @param acsadl2h the new value of acsadl2h
	 */
	public void setAcsadl2h(String acsadl2h) {
		this.acsadl2h.setValue(acsadl2h);
	}
	/**
	 * Gets the reference for attribute acsadl2v.
	 * @return the acsadl2v attribute reference
	 */
	public ElementaryRangeReference getAcsadl2vReference() {
		return acsadl2v.getReference();
	}

	/**
	 * Getter for acsadl2v attribute.
	 * @return acsadl2v attribute
	 */
	public String getAcsadl2v() {
		return acsadl2v.getValue();
	}

	/**
	 * Setter for acsadl2v attribute.
	 * @param acsadl2v the new value of acsadl2v
	 */
	public void setAcsadl2v(String acsadl2v) {
		this.acsadl2v.setValue(acsadl2v);
	}
	/**
	 * Gets the reference for attribute acsadl2o.
	 * @return the acsadl2o attribute reference
	 */
	public ElementaryRangeReference getAcsadl2oReference() {
		return acsadl2o.getReference();
	}

	/**
	 * Getter for acsadl2o attribute.
	 * @return acsadl2o attribute
	 */
	public String getAcsadl2o() {
		return acsadl2o.getValue();
	}

	/**
	 * Setter for acsadl2o attribute.
	 * @param acsadl2o the new value of acsadl2o
	 */
	public void setAcsadl2o(String acsadl2o) {
		this.acsadl2o.setValue(acsadl2o);
	}
	/**
	 * Gets the reference for attribute acszipcc.
	 * @return the acszipcc attribute reference
	 */
	public ElementaryRangeReference getAcszipccReference() {
		return acszipcc.getReference();
	}

	/**
	 * Getter for acszipcc attribute.
	 * @return acszipcc attribute
	 */
	public String getAcszipcc() {
		return acszipcc.getValue();
	}

	/**
	 * Setter for acszipcc attribute.
	 * @param acszipcc the new value of acszipcc
	 */
	public void setAcszipcc(String acszipcc) {
		this.acszipcc.setValue(acszipcc);
	}
	/**
	 * Gets the reference for attribute acszipcp.
	 * @return the acszipcp attribute reference
	 */
	public ElementaryRangeReference getAcszipcpReference() {
		return acszipcp.getReference();
	}

	/**
	 * Getter for acszipcp attribute.
	 * @return acszipcp attribute
	 */
	public String getAcszipcp() {
		return acszipcp.getValue();
	}

	/**
	 * Setter for acszipcp attribute.
	 * @param acszipcp the new value of acszipcp
	 */
	public void setAcszipcp(String acszipcp) {
		this.acszipcp.setValue(acszipcp);
	}
	/**
	 * Gets the reference for attribute acszipch.
	 * @return the acszipch attribute reference
	 */
	public ElementaryRangeReference getAcszipchReference() {
		return acszipch.getReference();
	}

	/**
	 * Getter for acszipch attribute.
	 * @return acszipch attribute
	 */
	public String getAcszipch() {
		return acszipch.getValue();
	}

	/**
	 * Setter for acszipch attribute.
	 * @param acszipch the new value of acszipch
	 */
	public void setAcszipch(String acszipch) {
		this.acszipch.setValue(acszipch);
	}
	/**
	 * Gets the reference for attribute acszipcv.
	 * @return the acszipcv attribute reference
	 */
	public ElementaryRangeReference getAcszipcvReference() {
		return acszipcv.getReference();
	}

	/**
	 * Getter for acszipcv attribute.
	 * @return acszipcv attribute
	 */
	public String getAcszipcv() {
		return acszipcv.getValue();
	}

	/**
	 * Setter for acszipcv attribute.
	 * @param acszipcv the new value of acszipcv
	 */
	public void setAcszipcv(String acszipcv) {
		this.acszipcv.setValue(acszipcv);
	}
	/**
	 * Gets the reference for attribute acszipco.
	 * @return the acszipco attribute reference
	 */
	public ElementaryRangeReference getAcszipcoReference() {
		return acszipco.getReference();
	}

	/**
	 * Getter for acszipco attribute.
	 * @return acszipco attribute
	 */
	public String getAcszipco() {
		return acszipco.getValue();
	}

	/**
	 * Setter for acszipco attribute.
	 * @param acszipco the new value of acszipco
	 */
	public void setAcszipco(String acszipco) {
		this.acszipco.setValue(acszipco);
	}
	/**
	 * Gets the reference for attribute acscityc.
	 * @return the acscityc attribute reference
	 */
	public ElementaryRangeReference getAcscitycReference() {
		return acscityc.getReference();
	}

	/**
	 * Getter for acscityc attribute.
	 * @return acscityc attribute
	 */
	public String getAcscityc() {
		return acscityc.getValue();
	}

	/**
	 * Setter for acscityc attribute.
	 * @param acscityc the new value of acscityc
	 */
	public void setAcscityc(String acscityc) {
		this.acscityc.setValue(acscityc);
	}
	/**
	 * Gets the reference for attribute acscityp.
	 * @return the acscityp attribute reference
	 */
	public ElementaryRangeReference getAcscitypReference() {
		return acscityp.getReference();
	}

	/**
	 * Getter for acscityp attribute.
	 * @return acscityp attribute
	 */
	public String getAcscityp() {
		return acscityp.getValue();
	}

	/**
	 * Setter for acscityp attribute.
	 * @param acscityp the new value of acscityp
	 */
	public void setAcscityp(String acscityp) {
		this.acscityp.setValue(acscityp);
	}
	/**
	 * Gets the reference for attribute acscityh.
	 * @return the acscityh attribute reference
	 */
	public ElementaryRangeReference getAcscityhReference() {
		return acscityh.getReference();
	}

	/**
	 * Getter for acscityh attribute.
	 * @return acscityh attribute
	 */
	public String getAcscityh() {
		return acscityh.getValue();
	}

	/**
	 * Setter for acscityh attribute.
	 * @param acscityh the new value of acscityh
	 */
	public void setAcscityh(String acscityh) {
		this.acscityh.setValue(acscityh);
	}
	/**
	 * Gets the reference for attribute acscityv.
	 * @return the acscityv attribute reference
	 */
	public ElementaryRangeReference getAcscityvReference() {
		return acscityv.getReference();
	}

	/**
	 * Getter for acscityv attribute.
	 * @return acscityv attribute
	 */
	public String getAcscityv() {
		return acscityv.getValue();
	}

	/**
	 * Setter for acscityv attribute.
	 * @param acscityv the new value of acscityv
	 */
	public void setAcscityv(String acscityv) {
		this.acscityv.setValue(acscityv);
	}
	/**
	 * Gets the reference for attribute acscityo.
	 * @return the acscityo attribute reference
	 */
	public ElementaryRangeReference getAcscityoReference() {
		return acscityo.getReference();
	}

	/**
	 * Getter for acscityo attribute.
	 * @return acscityo attribute
	 */
	public String getAcscityo() {
		return acscityo.getValue();
	}

	/**
	 * Setter for acscityo attribute.
	 * @param acscityo the new value of acscityo
	 */
	public void setAcscityo(String acscityo) {
		this.acscityo.setValue(acscityo);
	}
	/**
	 * Gets the reference for attribute acsctryc.
	 * @return the acsctryc attribute reference
	 */
	public ElementaryRangeReference getAcsctrycReference() {
		return acsctryc.getReference();
	}

	/**
	 * Getter for acsctryc attribute.
	 * @return acsctryc attribute
	 */
	public String getAcsctryc() {
		return acsctryc.getValue();
	}

	/**
	 * Setter for acsctryc attribute.
	 * @param acsctryc the new value of acsctryc
	 */
	public void setAcsctryc(String acsctryc) {
		this.acsctryc.setValue(acsctryc);
	}
	/**
	 * Gets the reference for attribute acsctryp.
	 * @return the acsctryp attribute reference
	 */
	public ElementaryRangeReference getAcsctrypReference() {
		return acsctryp.getReference();
	}

	/**
	 * Getter for acsctryp attribute.
	 * @return acsctryp attribute
	 */
	public String getAcsctryp() {
		return acsctryp.getValue();
	}

	/**
	 * Setter for acsctryp attribute.
	 * @param acsctryp the new value of acsctryp
	 */
	public void setAcsctryp(String acsctryp) {
		this.acsctryp.setValue(acsctryp);
	}
	/**
	 * Gets the reference for attribute acsctryh.
	 * @return the acsctryh attribute reference
	 */
	public ElementaryRangeReference getAcsctryhReference() {
		return acsctryh.getReference();
	}

	/**
	 * Getter for acsctryh attribute.
	 * @return acsctryh attribute
	 */
	public String getAcsctryh() {
		return acsctryh.getValue();
	}

	/**
	 * Setter for acsctryh attribute.
	 * @param acsctryh the new value of acsctryh
	 */
	public void setAcsctryh(String acsctryh) {
		this.acsctryh.setValue(acsctryh);
	}
	/**
	 * Gets the reference for attribute acsctryv.
	 * @return the acsctryv attribute reference
	 */
	public ElementaryRangeReference getAcsctryvReference() {
		return acsctryv.getReference();
	}

	/**
	 * Getter for acsctryv attribute.
	 * @return acsctryv attribute
	 */
	public String getAcsctryv() {
		return acsctryv.getValue();
	}

	/**
	 * Setter for acsctryv attribute.
	 * @param acsctryv the new value of acsctryv
	 */
	public void setAcsctryv(String acsctryv) {
		this.acsctryv.setValue(acsctryv);
	}
	/**
	 * Gets the reference for attribute acsctryo.
	 * @return the acsctryo attribute reference
	 */
	public ElementaryRangeReference getAcsctryoReference() {
		return acsctryo.getReference();
	}

	/**
	 * Getter for acsctryo attribute.
	 * @return acsctryo attribute
	 */
	public String getAcsctryo() {
		return acsctryo.getValue();
	}

	/**
	 * Setter for acsctryo attribute.
	 * @param acsctryo the new value of acsctryo
	 */
	public void setAcsctryo(String acsctryo) {
		this.acsctryo.setValue(acsctryo);
	}
	/**
	 * Gets the reference for attribute acsphn1c.
	 * @return the acsphn1c attribute reference
	 */
	public ElementaryRangeReference getAcsphn1cReference() {
		return acsphn1c.getReference();
	}

	/**
	 * Getter for acsphn1c attribute.
	 * @return acsphn1c attribute
	 */
	public String getAcsphn1c() {
		return acsphn1c.getValue();
	}

	/**
	 * Setter for acsphn1c attribute.
	 * @param acsphn1c the new value of acsphn1c
	 */
	public void setAcsphn1c(String acsphn1c) {
		this.acsphn1c.setValue(acsphn1c);
	}
	/**
	 * Gets the reference for attribute acsphn1p.
	 * @return the acsphn1p attribute reference
	 */
	public ElementaryRangeReference getAcsphn1pReference() {
		return acsphn1p.getReference();
	}

	/**
	 * Getter for acsphn1p attribute.
	 * @return acsphn1p attribute
	 */
	public String getAcsphn1p() {
		return acsphn1p.getValue();
	}

	/**
	 * Setter for acsphn1p attribute.
	 * @param acsphn1p the new value of acsphn1p
	 */
	public void setAcsphn1p(String acsphn1p) {
		this.acsphn1p.setValue(acsphn1p);
	}
	/**
	 * Gets the reference for attribute acsphn1h.
	 * @return the acsphn1h attribute reference
	 */
	public ElementaryRangeReference getAcsphn1hReference() {
		return acsphn1h.getReference();
	}

	/**
	 * Getter for acsphn1h attribute.
	 * @return acsphn1h attribute
	 */
	public String getAcsphn1h() {
		return acsphn1h.getValue();
	}

	/**
	 * Setter for acsphn1h attribute.
	 * @param acsphn1h the new value of acsphn1h
	 */
	public void setAcsphn1h(String acsphn1h) {
		this.acsphn1h.setValue(acsphn1h);
	}
	/**
	 * Gets the reference for attribute acsphn1v.
	 * @return the acsphn1v attribute reference
	 */
	public ElementaryRangeReference getAcsphn1vReference() {
		return acsphn1v.getReference();
	}

	/**
	 * Getter for acsphn1v attribute.
	 * @return acsphn1v attribute
	 */
	public String getAcsphn1v() {
		return acsphn1v.getValue();
	}

	/**
	 * Setter for acsphn1v attribute.
	 * @param acsphn1v the new value of acsphn1v
	 */
	public void setAcsphn1v(String acsphn1v) {
		this.acsphn1v.setValue(acsphn1v);
	}
	/**
	 * Gets the reference for attribute acsphn1o.
	 * @return the acsphn1o attribute reference
	 */
	public ElementaryRangeReference getAcsphn1oReference() {
		return acsphn1o.getReference();
	}

	/**
	 * Getter for acsphn1o attribute.
	 * @return acsphn1o attribute
	 */
	public String getAcsphn1o() {
		return acsphn1o.getValue();
	}

	/**
	 * Setter for acsphn1o attribute.
	 * @param acsphn1o the new value of acsphn1o
	 */
	public void setAcsphn1o(String acsphn1o) {
		this.acsphn1o.setValue(acsphn1o);
	}
	/**
	 * Gets the reference for attribute acsgovtc.
	 * @return the acsgovtc attribute reference
	 */
	public ElementaryRangeReference getAcsgovtcReference() {
		return acsgovtc.getReference();
	}

	/**
	 * Getter for acsgovtc attribute.
	 * @return acsgovtc attribute
	 */
	public String getAcsgovtc() {
		return acsgovtc.getValue();
	}

	/**
	 * Setter for acsgovtc attribute.
	 * @param acsgovtc the new value of acsgovtc
	 */
	public void setAcsgovtc(String acsgovtc) {
		this.acsgovtc.setValue(acsgovtc);
	}
	/**
	 * Gets the reference for attribute acsgovtp.
	 * @return the acsgovtp attribute reference
	 */
	public ElementaryRangeReference getAcsgovtpReference() {
		return acsgovtp.getReference();
	}

	/**
	 * Getter for acsgovtp attribute.
	 * @return acsgovtp attribute
	 */
	public String getAcsgovtp() {
		return acsgovtp.getValue();
	}

	/**
	 * Setter for acsgovtp attribute.
	 * @param acsgovtp the new value of acsgovtp
	 */
	public void setAcsgovtp(String acsgovtp) {
		this.acsgovtp.setValue(acsgovtp);
	}
	/**
	 * Gets the reference for attribute acsgovth.
	 * @return the acsgovth attribute reference
	 */
	public ElementaryRangeReference getAcsgovthReference() {
		return acsgovth.getReference();
	}

	/**
	 * Getter for acsgovth attribute.
	 * @return acsgovth attribute
	 */
	public String getAcsgovth() {
		return acsgovth.getValue();
	}

	/**
	 * Setter for acsgovth attribute.
	 * @param acsgovth the new value of acsgovth
	 */
	public void setAcsgovth(String acsgovth) {
		this.acsgovth.setValue(acsgovth);
	}
	/**
	 * Gets the reference for attribute acsgovtv.
	 * @return the acsgovtv attribute reference
	 */
	public ElementaryRangeReference getAcsgovtvReference() {
		return acsgovtv.getReference();
	}

	/**
	 * Getter for acsgovtv attribute.
	 * @return acsgovtv attribute
	 */
	public String getAcsgovtv() {
		return acsgovtv.getValue();
	}

	/**
	 * Setter for acsgovtv attribute.
	 * @param acsgovtv the new value of acsgovtv
	 */
	public void setAcsgovtv(String acsgovtv) {
		this.acsgovtv.setValue(acsgovtv);
	}
	/**
	 * Gets the reference for attribute acsgovto.
	 * @return the acsgovto attribute reference
	 */
	public ElementaryRangeReference getAcsgovtoReference() {
		return acsgovto.getReference();
	}

	/**
	 * Getter for acsgovto attribute.
	 * @return acsgovto attribute
	 */
	public String getAcsgovto() {
		return acsgovto.getValue();
	}

	/**
	 * Setter for acsgovto attribute.
	 * @param acsgovto the new value of acsgovto
	 */
	public void setAcsgovto(String acsgovto) {
		this.acsgovto.setValue(acsgovto);
	}
	/**
	 * Gets the reference for attribute acsphn2c.
	 * @return the acsphn2c attribute reference
	 */
	public ElementaryRangeReference getAcsphn2cReference() {
		return acsphn2c.getReference();
	}

	/**
	 * Getter for acsphn2c attribute.
	 * @return acsphn2c attribute
	 */
	public String getAcsphn2c() {
		return acsphn2c.getValue();
	}

	/**
	 * Setter for acsphn2c attribute.
	 * @param acsphn2c the new value of acsphn2c
	 */
	public void setAcsphn2c(String acsphn2c) {
		this.acsphn2c.setValue(acsphn2c);
	}
	/**
	 * Gets the reference for attribute acsphn2p.
	 * @return the acsphn2p attribute reference
	 */
	public ElementaryRangeReference getAcsphn2pReference() {
		return acsphn2p.getReference();
	}

	/**
	 * Getter for acsphn2p attribute.
	 * @return acsphn2p attribute
	 */
	public String getAcsphn2p() {
		return acsphn2p.getValue();
	}

	/**
	 * Setter for acsphn2p attribute.
	 * @param acsphn2p the new value of acsphn2p
	 */
	public void setAcsphn2p(String acsphn2p) {
		this.acsphn2p.setValue(acsphn2p);
	}
	/**
	 * Gets the reference for attribute acsphn2h.
	 * @return the acsphn2h attribute reference
	 */
	public ElementaryRangeReference getAcsphn2hReference() {
		return acsphn2h.getReference();
	}

	/**
	 * Getter for acsphn2h attribute.
	 * @return acsphn2h attribute
	 */
	public String getAcsphn2h() {
		return acsphn2h.getValue();
	}

	/**
	 * Setter for acsphn2h attribute.
	 * @param acsphn2h the new value of acsphn2h
	 */
	public void setAcsphn2h(String acsphn2h) {
		this.acsphn2h.setValue(acsphn2h);
	}
	/**
	 * Gets the reference for attribute acsphn2v.
	 * @return the acsphn2v attribute reference
	 */
	public ElementaryRangeReference getAcsphn2vReference() {
		return acsphn2v.getReference();
	}

	/**
	 * Getter for acsphn2v attribute.
	 * @return acsphn2v attribute
	 */
	public String getAcsphn2v() {
		return acsphn2v.getValue();
	}

	/**
	 * Setter for acsphn2v attribute.
	 * @param acsphn2v the new value of acsphn2v
	 */
	public void setAcsphn2v(String acsphn2v) {
		this.acsphn2v.setValue(acsphn2v);
	}
	/**
	 * Gets the reference for attribute acsphn2o.
	 * @return the acsphn2o attribute reference
	 */
	public ElementaryRangeReference getAcsphn2oReference() {
		return acsphn2o.getReference();
	}

	/**
	 * Getter for acsphn2o attribute.
	 * @return acsphn2o attribute
	 */
	public String getAcsphn2o() {
		return acsphn2o.getValue();
	}

	/**
	 * Setter for acsphn2o attribute.
	 * @param acsphn2o the new value of acsphn2o
	 */
	public void setAcsphn2o(String acsphn2o) {
		this.acsphn2o.setValue(acsphn2o);
	}
	/**
	 * Gets the reference for attribute acseftcc.
	 * @return the acseftcc attribute reference
	 */
	public ElementaryRangeReference getAcseftccReference() {
		return acseftcc.getReference();
	}

	/**
	 * Getter for acseftcc attribute.
	 * @return acseftcc attribute
	 */
	public String getAcseftcc() {
		return acseftcc.getValue();
	}

	/**
	 * Setter for acseftcc attribute.
	 * @param acseftcc the new value of acseftcc
	 */
	public void setAcseftcc(String acseftcc) {
		this.acseftcc.setValue(acseftcc);
	}
	/**
	 * Gets the reference for attribute acseftcp.
	 * @return the acseftcp attribute reference
	 */
	public ElementaryRangeReference getAcseftcpReference() {
		return acseftcp.getReference();
	}

	/**
	 * Getter for acseftcp attribute.
	 * @return acseftcp attribute
	 */
	public String getAcseftcp() {
		return acseftcp.getValue();
	}

	/**
	 * Setter for acseftcp attribute.
	 * @param acseftcp the new value of acseftcp
	 */
	public void setAcseftcp(String acseftcp) {
		this.acseftcp.setValue(acseftcp);
	}
	/**
	 * Gets the reference for attribute acseftch.
	 * @return the acseftch attribute reference
	 */
	public ElementaryRangeReference getAcseftchReference() {
		return acseftch.getReference();
	}

	/**
	 * Getter for acseftch attribute.
	 * @return acseftch attribute
	 */
	public String getAcseftch() {
		return acseftch.getValue();
	}

	/**
	 * Setter for acseftch attribute.
	 * @param acseftch the new value of acseftch
	 */
	public void setAcseftch(String acseftch) {
		this.acseftch.setValue(acseftch);
	}
	/**
	 * Gets the reference for attribute acseftcv.
	 * @return the acseftcv attribute reference
	 */
	public ElementaryRangeReference getAcseftcvReference() {
		return acseftcv.getReference();
	}

	/**
	 * Getter for acseftcv attribute.
	 * @return acseftcv attribute
	 */
	public String getAcseftcv() {
		return acseftcv.getValue();
	}

	/**
	 * Setter for acseftcv attribute.
	 * @param acseftcv the new value of acseftcv
	 */
	public void setAcseftcv(String acseftcv) {
		this.acseftcv.setValue(acseftcv);
	}
	/**
	 * Gets the reference for attribute acseftco.
	 * @return the acseftco attribute reference
	 */
	public ElementaryRangeReference getAcseftcoReference() {
		return acseftco.getReference();
	}

	/**
	 * Getter for acseftco attribute.
	 * @return acseftco attribute
	 */
	public String getAcseftco() {
		return acseftco.getValue();
	}

	/**
	 * Setter for acseftco attribute.
	 * @param acseftco the new value of acseftco
	 */
	public void setAcseftco(String acseftco) {
		this.acseftco.setValue(acseftco);
	}
	/**
	 * Gets the reference for attribute acspflgc.
	 * @return the acspflgc attribute reference
	 */
	public ElementaryRangeReference getAcspflgcReference() {
		return acspflgc.getReference();
	}

	/**
	 * Getter for acspflgc attribute.
	 * @return acspflgc attribute
	 */
	public String getAcspflgc() {
		return acspflgc.getValue();
	}

	/**
	 * Setter for acspflgc attribute.
	 * @param acspflgc the new value of acspflgc
	 */
	public void setAcspflgc(String acspflgc) {
		this.acspflgc.setValue(acspflgc);
	}
	/**
	 * Gets the reference for attribute acspflgp.
	 * @return the acspflgp attribute reference
	 */
	public ElementaryRangeReference getAcspflgpReference() {
		return acspflgp.getReference();
	}

	/**
	 * Getter for acspflgp attribute.
	 * @return acspflgp attribute
	 */
	public String getAcspflgp() {
		return acspflgp.getValue();
	}

	/**
	 * Setter for acspflgp attribute.
	 * @param acspflgp the new value of acspflgp
	 */
	public void setAcspflgp(String acspflgp) {
		this.acspflgp.setValue(acspflgp);
	}
	/**
	 * Gets the reference for attribute acspflgh.
	 * @return the acspflgh attribute reference
	 */
	public ElementaryRangeReference getAcspflghReference() {
		return acspflgh.getReference();
	}

	/**
	 * Getter for acspflgh attribute.
	 * @return acspflgh attribute
	 */
	public String getAcspflgh() {
		return acspflgh.getValue();
	}

	/**
	 * Setter for acspflgh attribute.
	 * @param acspflgh the new value of acspflgh
	 */
	public void setAcspflgh(String acspflgh) {
		this.acspflgh.setValue(acspflgh);
	}
	/**
	 * Gets the reference for attribute acspflgv.
	 * @return the acspflgv attribute reference
	 */
	public ElementaryRangeReference getAcspflgvReference() {
		return acspflgv.getReference();
	}

	/**
	 * Getter for acspflgv attribute.
	 * @return acspflgv attribute
	 */
	public String getAcspflgv() {
		return acspflgv.getValue();
	}

	/**
	 * Setter for acspflgv attribute.
	 * @param acspflgv the new value of acspflgv
	 */
	public void setAcspflgv(String acspflgv) {
		this.acspflgv.setValue(acspflgv);
	}
	/**
	 * Gets the reference for attribute acspflgo.
	 * @return the acspflgo attribute reference
	 */
	public ElementaryRangeReference getAcspflgoReference() {
		return acspflgo.getReference();
	}

	/**
	 * Getter for acspflgo attribute.
	 * @return acspflgo attribute
	 */
	public String getAcspflgo() {
		return acspflgo.getValue();
	}

	/**
	 * Setter for acspflgo attribute.
	 * @param acspflgo the new value of acspflgo
	 */
	public void setAcspflgo(String acspflgo) {
		this.acspflgo.setValue(acspflgo);
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
}
