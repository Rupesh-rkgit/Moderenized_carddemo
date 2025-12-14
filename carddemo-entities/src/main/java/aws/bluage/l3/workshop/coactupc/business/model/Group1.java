package aws.bluage.l3.workshop.coactupc.business.model;

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
 * <p>About 'cactupai' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.Cactupai
 * <br></p>
 * 
 * <p>About 'cactupao' field, <br>uml entity: aws.bluage.l3.workshop.coactupc.business.model.Cactupao
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
	 * Account Update Screen Layout
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
	private final Group cactupai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cactupai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(cactupai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(cactupai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(cactupai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(cactupai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(cactupai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(cactupai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(cactupai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(cactupai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(cactupai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(cactupai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(cactupai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(cactupai,new AlphanumericType(8));
	private final Elementary acctsidl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(cactupai);
	private final Elementary acctsidf = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary acctsida = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acctsidi = new Elementary(cactupai,new AlphanumericType(11));
	private final Elementary acsttusl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(cactupai);
	private final Elementary acsttusf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary acsttusa = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsttusi = new Elementary(cactupai,new AlphanumericType(1));
	private final Elementary opnyearl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(cactupai);
	private final Elementary opnyearf = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary opnyeara = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary opnyeari = new Elementary(cactupai,new AlphanumericType(4));
	private final Elementary opnmonl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(cactupai);
	private final Elementary opnmonf = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary opnmona = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary opnmoni = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary opndayl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(cactupai);
	private final Elementary opndayf = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary opndaya = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary opndayi = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary acrdliml = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(cactupai);
	private final Elementary acrdlimf = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary acrdlima = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acrdlimi = new Elementary(cactupai,new AlphanumericType(15));
	private final Elementary expyearl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union13 = new Union(cactupai);
	private final Elementary expyearf = new Elementary(union13,new AlphanumericType(1));
	private final Group group12 = new Group(union13);
	private final Elementary expyeara = new Elementary(group12,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary expyeari = new Elementary(cactupai,new AlphanumericType(4));
	private final Elementary expmonl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union14 = new Union(cactupai);
	private final Elementary expmonf = new Elementary(union14,new AlphanumericType(1));
	private final Group group13 = new Group(union14);
	private final Elementary expmona = new Elementary(group13,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary expmoni = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary expdayl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union15 = new Union(cactupai);
	private final Elementary expdayf = new Elementary(union15,new AlphanumericType(1));
	private final Group group14 = new Group(union15);
	private final Elementary expdaya = new Elementary(group14,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary expdayi = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary acshliml = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union16 = new Union(cactupai);
	private final Elementary acshlimf = new Elementary(union16,new AlphanumericType(1));
	private final Group group15 = new Group(union16);
	private final Elementary acshlima = new Elementary(group15,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acshlimi = new Elementary(cactupai,new AlphanumericType(15));
	private final Elementary risyearl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union17 = new Union(cactupai);
	private final Elementary risyearf = new Elementary(union17,new AlphanumericType(1));
	private final Group group16 = new Group(union17);
	private final Elementary risyeara = new Elementary(group16,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary risyeari = new Elementary(cactupai,new AlphanumericType(4));
	private final Elementary rismonl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union18 = new Union(cactupai);
	private final Elementary rismonf = new Elementary(union18,new AlphanumericType(1));
	private final Group group17 = new Group(union18);
	private final Elementary rismona = new Elementary(group17,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary rismoni = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary risdayl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union19 = new Union(cactupai);
	private final Elementary risdayf = new Elementary(union19,new AlphanumericType(1));
	private final Group group18 = new Group(union19);
	private final Elementary risdaya = new Elementary(group18,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary risdayi = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary acurball = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union20 = new Union(cactupai);
	private final Elementary acurbalf = new Elementary(union20,new AlphanumericType(1));
	private final Group group19 = new Group(union20);
	private final Elementary acurbala = new Elementary(group19,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acurbali = new Elementary(cactupai,new AlphanumericType(15));
	private final Elementary acrcycrl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union21 = new Union(cactupai);
	private final Elementary acrcycrf = new Elementary(union21,new AlphanumericType(1));
	private final Group group20 = new Group(union21);
	private final Elementary acrcycra = new Elementary(group20,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acrcycri = new Elementary(cactupai,new AlphanumericType(15));
	private final Elementary aaddgrpl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union22 = new Union(cactupai);
	private final Elementary aaddgrpf = new Elementary(union22,new AlphanumericType(1));
	private final Group group21 = new Group(union22);
	private final Elementary aaddgrpa = new Elementary(group21,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary aaddgrpi = new Elementary(cactupai,new AlphanumericType(10));
	private final Elementary acrcydbl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union23 = new Union(cactupai);
	private final Elementary acrcydbf = new Elementary(union23,new AlphanumericType(1));
	private final Group group22 = new Group(union23);
	private final Elementary acrcydba = new Elementary(group22,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acrcydbi = new Elementary(cactupai,new AlphanumericType(15));
	private final Elementary acstnuml = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union24 = new Union(cactupai);
	private final Elementary acstnumf = new Elementary(union24,new AlphanumericType(1));
	private final Group group23 = new Group(union24);
	private final Elementary acstnuma = new Elementary(group23,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acstnumi = new Elementary(cactupai,new AlphanumericType(9));
	private final Elementary actssn1l = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union25 = new Union(cactupai);
	private final Elementary actssn1f = new Elementary(union25,new AlphanumericType(1));
	private final Group group24 = new Group(union25);
	private final Elementary actssn1a = new Elementary(group24,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary actssn1i = new Elementary(cactupai,new AlphanumericType(3));
	private final Elementary actssn2l = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union26 = new Union(cactupai);
	private final Elementary actssn2f = new Elementary(union26,new AlphanumericType(1));
	private final Group group25 = new Group(union26);
	private final Elementary actssn2a = new Elementary(group25,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary actssn2i = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary actssn3l = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union27 = new Union(cactupai);
	private final Elementary actssn3f = new Elementary(union27,new AlphanumericType(1));
	private final Group group26 = new Group(union27);
	private final Elementary actssn3a = new Elementary(group26,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary actssn3i = new Elementary(cactupai,new AlphanumericType(4));
	private final Elementary dobyearl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union28 = new Union(cactupai);
	private final Elementary dobyearf = new Elementary(union28,new AlphanumericType(1));
	private final Group group27 = new Group(union28);
	private final Elementary dobyeara = new Elementary(group27,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary dobyeari = new Elementary(cactupai,new AlphanumericType(4));
	private final Elementary dobmonl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union29 = new Union(cactupai);
	private final Elementary dobmonf = new Elementary(union29,new AlphanumericType(1));
	private final Group group28 = new Group(union29);
	private final Elementary dobmona = new Elementary(group28,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary dobmoni = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary dobdayl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union30 = new Union(cactupai);
	private final Elementary dobdayf = new Elementary(union30,new AlphanumericType(1));
	private final Group group29 = new Group(union30);
	private final Elementary dobdaya = new Elementary(group29,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary dobdayi = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary acstfcol = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union31 = new Union(cactupai);
	private final Elementary acstfcof = new Elementary(union31,new AlphanumericType(1));
	private final Group group30 = new Group(union31);
	private final Elementary acstfcoa = new Elementary(group30,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acstfcoi = new Elementary(cactupai,new AlphanumericType(3));
	private final Elementary acsfnaml = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union32 = new Union(cactupai);
	private final Elementary acsfnamf = new Elementary(union32,new AlphanumericType(1));
	private final Group group31 = new Group(union32);
	private final Elementary acsfnama = new Elementary(group31,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsfnami = new Elementary(cactupai,new AlphanumericType(25));
	private final Elementary acsmnaml = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union33 = new Union(cactupai);
	private final Elementary acsmnamf = new Elementary(union33,new AlphanumericType(1));
	private final Group group32 = new Group(union33);
	private final Elementary acsmnama = new Elementary(group32,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler33 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsmnami = new Elementary(cactupai,new AlphanumericType(25));
	private final Elementary acslnaml = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union34 = new Union(cactupai);
	private final Elementary acslnamf = new Elementary(union34,new AlphanumericType(1));
	private final Group group33 = new Group(union34);
	private final Elementary acslnama = new Elementary(group33,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler34 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acslnami = new Elementary(cactupai,new AlphanumericType(25));
	private final Elementary acsadl1l = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union35 = new Union(cactupai);
	private final Elementary acsadl1f = new Elementary(union35,new AlphanumericType(1));
	private final Group group34 = new Group(union35);
	private final Elementary acsadl1a = new Elementary(group34,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler35 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsadl1i = new Elementary(cactupai,new AlphanumericType(50));
	private final Elementary acssttel = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union36 = new Union(cactupai);
	private final Elementary acssttef = new Elementary(union36,new AlphanumericType(1));
	private final Group group35 = new Group(union36);
	private final Elementary acssttea = new Elementary(group35,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler36 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acssttei = new Elementary(cactupai,new AlphanumericType(2));
	private final Elementary acsadl2l = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union37 = new Union(cactupai);
	private final Elementary acsadl2f = new Elementary(union37,new AlphanumericType(1));
	private final Group group36 = new Group(union37);
	private final Elementary acsadl2a = new Elementary(group36,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler37 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsadl2i = new Elementary(cactupai,new AlphanumericType(50));
	private final Elementary acszipcl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union38 = new Union(cactupai);
	private final Elementary acszipcf = new Elementary(union38,new AlphanumericType(1));
	private final Group group37 = new Group(union38);
	private final Elementary acszipca = new Elementary(group37,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler38 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acszipci = new Elementary(cactupai,new AlphanumericType(5));
	private final Elementary acscityl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union39 = new Union(cactupai);
	private final Elementary acscityf = new Elementary(union39,new AlphanumericType(1));
	private final Group group38 = new Group(union39);
	private final Elementary acscitya = new Elementary(group38,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler39 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acscityi = new Elementary(cactupai,new AlphanumericType(50));
	private final Elementary acsctryl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union40 = new Union(cactupai);
	private final Elementary acsctryf = new Elementary(union40,new AlphanumericType(1));
	private final Group group39 = new Group(union40);
	private final Elementary acsctrya = new Elementary(group39,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler40 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsctryi = new Elementary(cactupai,new AlphanumericType(3));
	private final Elementary acsph1al = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union41 = new Union(cactupai);
	private final Elementary acsph1af = new Elementary(union41,new AlphanumericType(1));
	private final Group group40 = new Group(union41);
	private final Elementary acsph1aa = new Elementary(group40,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler41 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsph1ai = new Elementary(cactupai,new AlphanumericType(3));
	private final Elementary acsph1bl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union42 = new Union(cactupai);
	private final Elementary acsph1bf = new Elementary(union42,new AlphanumericType(1));
	private final Group group41 = new Group(union42);
	private final Elementary acsph1ba = new Elementary(group41,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler42 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsph1bi = new Elementary(cactupai,new AlphanumericType(3));
	private final Elementary acsph1cl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union43 = new Union(cactupai);
	private final Elementary acsph1cf = new Elementary(union43,new AlphanumericType(1));
	private final Group group42 = new Group(union43);
	private final Elementary acsph1ca = new Elementary(group42,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler43 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsph1ci = new Elementary(cactupai,new AlphanumericType(4));
	private final Elementary acsgovtl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union44 = new Union(cactupai);
	private final Elementary acsgovtf = new Elementary(union44,new AlphanumericType(1));
	private final Group group43 = new Group(union44);
	private final Elementary acsgovta = new Elementary(group43,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler44 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsgovti = new Elementary(cactupai,new AlphanumericType(20));
	private final Elementary acsph2al = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union45 = new Union(cactupai);
	private final Elementary acsph2af = new Elementary(union45,new AlphanumericType(1));
	private final Group group44 = new Group(union45);
	private final Elementary acsph2aa = new Elementary(group44,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler45 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsph2ai = new Elementary(cactupai,new AlphanumericType(3));
	private final Elementary acsph2bl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union46 = new Union(cactupai);
	private final Elementary acsph2bf = new Elementary(union46,new AlphanumericType(1));
	private final Group group45 = new Group(union46);
	private final Elementary acsph2ba = new Elementary(group45,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler46 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsph2bi = new Elementary(cactupai,new AlphanumericType(3));
	private final Elementary acsph2cl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union47 = new Union(cactupai);
	private final Elementary acsph2cf = new Elementary(union47,new AlphanumericType(1));
	private final Group group46 = new Group(union47);
	private final Elementary acsph2ca = new Elementary(group46,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler47 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acsph2ci = new Elementary(cactupai,new AlphanumericType(4));
	private final Elementary acseftcl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union48 = new Union(cactupai);
	private final Elementary acseftcf = new Elementary(union48,new AlphanumericType(1));
	private final Group group47 = new Group(union48);
	private final Elementary acseftca = new Elementary(group47,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler48 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acseftci = new Elementary(cactupai,new AlphanumericType(10));
	private final Elementary acspflgl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union49 = new Union(cactupai);
	private final Elementary acspflgf = new Elementary(union49,new AlphanumericType(1));
	private final Group group48 = new Group(union49);
	private final Elementary acspflga = new Elementary(group48,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler49 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary acspflgi = new Elementary(cactupai,new AlphanumericType(1));
	private final Elementary infomsgl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union50 = new Union(cactupai);
	private final Elementary infomsgf = new Elementary(union50,new AlphanumericType(1));
	private final Group group49 = new Group(union50);
	private final Elementary infomsga = new Elementary(group49,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler50 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary infomsgi = new Elementary(cactupai,new AlphanumericType(45));
	private final Elementary errmsgl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union51 = new Union(cactupai);
	private final Elementary errmsgf = new Elementary(union51,new AlphanumericType(1));
	private final Group group50 = new Group(union51);
	private final Elementary errmsga = new Elementary(group50,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler51 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(cactupai,new AlphanumericType(78));
	private final Elementary fkeysl = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union52 = new Union(cactupai);
	private final Elementary fkeysf = new Elementary(union52,new AlphanumericType(1));
	private final Group group51 = new Group(union52);
	private final Elementary fkeysa = new Elementary(group51,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler52 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary fkeysi = new Elementary(cactupai,new AlphanumericType(21));
	private final Elementary fkey05l = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union53 = new Union(cactupai);
	private final Elementary fkey05f = new Elementary(union53,new AlphanumericType(1));
	private final Group group52 = new Group(union53);
	private final Elementary fkey05a = new Elementary(group52,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler53 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary fkey05i = new Elementary(cactupai,new AlphanumericType(7));
	private final Elementary fkey12l = new Elementary(cactupai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union54 = new Union(cactupai);
	private final Elementary fkey12f = new Elementary(union54,new AlphanumericType(1));
	private final Group group53 = new Group(union54);
	private final Elementary fkey12a = new Elementary(group53,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler54 = new Filler(cactupai,new AlphanumericType(4));
	private final Elementary fkey12i = new Elementary(cactupai,new AlphanumericType(10));
	private final Group cactupao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler55 = new Filler(cactupao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler56 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(cactupao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler57 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(cactupao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler58 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(cactupao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler59 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(cactupao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler60 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(cactupao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler61 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(cactupao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler62 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acctsidc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acctsidp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acctsidh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acctsidv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acctsido = new Elementary(cactupao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler63 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsttusc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsttusp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsttush = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsttusv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsttuso = new Elementary(cactupao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler64 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary opnyearc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opnyearp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opnyearh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opnyearv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opnyearo = new Elementary(cactupao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler65 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary opnmonc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opnmonp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opnmonh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opnmonv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opnmono = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler66 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary opndayc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opndayp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opndayh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opndayv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary opndayo = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler67 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acrdlimc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrdlimp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrdlimh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrdlimv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrdlimo = new Elementary(cactupao,new AlphanumericType(15));
	@SuppressWarnings("unused")
	private final Filler filler68 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary expyearc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expyearp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expyearh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expyearv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expyearo = new Elementary(cactupao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler69 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary expmonc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expmonp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expmonh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expmonv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expmono = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler70 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary expdayc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expdayp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expdayh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expdayv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary expdayo = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler71 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acshlimc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acshlimp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acshlimh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acshlimv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acshlimo = new Elementary(cactupao,new AlphanumericType(15));
	@SuppressWarnings("unused")
	private final Filler filler72 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary risyearc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary risyearp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary risyearh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary risyearv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary risyearo = new Elementary(cactupao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler73 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary rismonc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary rismonp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary rismonh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary rismonv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary rismono = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler74 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary risdayc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary risdayp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary risdayh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary risdayv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary risdayo = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler75 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acurbalc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acurbalp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acurbalh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acurbalv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acurbalo = new Elementary(cactupao,new AlphanumericType(15));
	@SuppressWarnings("unused")
	private final Filler filler76 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acrcycrc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrcycrp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrcycrh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrcycrv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrcycro = new Elementary(cactupao,new AlphanumericType(15));
	@SuppressWarnings("unused")
	private final Filler filler77 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary aaddgrpc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary aaddgrpp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary aaddgrph = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary aaddgrpv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary aaddgrpo = new Elementary(cactupao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler78 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acrcydbc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrcydbp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrcydbh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrcydbv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acrcydbo = new Elementary(cactupao,new AlphanumericType(15));
	@SuppressWarnings("unused")
	private final Filler filler79 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acstnumc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acstnump = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acstnumh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acstnumv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acstnumo = new Elementary(cactupao,new AlphanumericType(9));
	@SuppressWarnings("unused")
	private final Filler filler80 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary actssn1c = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn1p = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn1h = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn1v = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn1o = new Elementary(cactupao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler81 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary actssn2c = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn2p = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn2h = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn2v = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn2o = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler82 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary actssn3c = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn3p = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn3h = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn3v = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary actssn3o = new Elementary(cactupao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler83 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary dobyearc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobyearp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobyearh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobyearv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobyearo = new Elementary(cactupao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler84 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary dobmonc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobmonp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobmonh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobmonv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobmono = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler85 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary dobdayc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobdayp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobdayh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobdayv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary dobdayo = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler86 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acstfcoc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acstfcop = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acstfcoh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acstfcov = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acstfcoo = new Elementary(cactupao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler87 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsfnamc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsfnamp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsfnamh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsfnamv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsfnamo = new Elementary(cactupao,new AlphanumericType(25));
	@SuppressWarnings("unused")
	private final Filler filler88 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsmnamc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsmnamp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsmnamh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsmnamv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsmnamo = new Elementary(cactupao,new AlphanumericType(25));
	@SuppressWarnings("unused")
	private final Filler filler89 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acslnamc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acslnamp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acslnamh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acslnamv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acslnamo = new Elementary(cactupao,new AlphanumericType(25));
	@SuppressWarnings("unused")
	private final Filler filler90 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsadl1c = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsadl1p = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsadl1h = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsadl1v = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsadl1o = new Elementary(cactupao,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler91 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acssttec = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acssttep = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsstteh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acssttev = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsstteo = new Elementary(cactupao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler92 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsadl2c = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsadl2p = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsadl2h = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsadl2v = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsadl2o = new Elementary(cactupao,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler93 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acszipcc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acszipcp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acszipch = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acszipcv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acszipco = new Elementary(cactupao,new AlphanumericType(5));
	@SuppressWarnings("unused")
	private final Filler filler94 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acscityc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acscityp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acscityh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acscityv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acscityo = new Elementary(cactupao,new AlphanumericType(50));
	@SuppressWarnings("unused")
	private final Filler filler95 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsctryc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsctryp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsctryh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsctryv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsctryo = new Elementary(cactupao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler96 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsph1ac = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1ap = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1ah = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1av = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1ao = new Elementary(cactupao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler97 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsph1bc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1bp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1bh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1bv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1bo = new Elementary(cactupao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler98 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsph1cc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1cp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1ch = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1cv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph1co = new Elementary(cactupao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler99 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsgovtc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsgovtp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsgovth = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsgovtv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsgovto = new Elementary(cactupao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler100 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsph2ac = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2ap = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2ah = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2av = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2ao = new Elementary(cactupao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler101 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsph2bc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2bp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2bh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2bv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2bo = new Elementary(cactupao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler102 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acsph2cc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2cp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2ch = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2cv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acsph2co = new Elementary(cactupao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler103 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acseftcc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acseftcp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acseftch = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acseftcv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acseftco = new Elementary(cactupao,new AlphanumericType(10));
	@SuppressWarnings("unused")
	private final Filler filler104 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary acspflgc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acspflgp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acspflgh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acspflgv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary acspflgo = new Elementary(cactupao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler105 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary infomsgc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary infomsgp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary infomsgh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary infomsgv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary infomsgo = new Elementary(cactupao,new AlphanumericType(45));
	@SuppressWarnings("unused")
	private final Filler filler106 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(cactupao,new AlphanumericType(78));
	@SuppressWarnings("unused")
	private final Filler filler107 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary fkeysc = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkeysp = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkeysh = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkeysv = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkeyso = new Elementary(cactupao,new AlphanumericType(21));
	@SuppressWarnings("unused")
	private final Filler filler108 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary fkey05c = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkey05p = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkey05h = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkey05v = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkey05o = new Elementary(cactupao,new AlphanumericType(7));
	@SuppressWarnings("unused")
	private final Filler filler109 = new Filler(cactupao,new AlphanumericType(3));
	private final Elementary fkey12c = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkey12p = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkey12h = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkey12v = new Elementary(cactupao,new AlphanumericType(1));
	private final Elementary fkey12o = new Elementary(cactupao,new AlphanumericType(10));
	

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
	 * Gets the reference for attribute cactupai.
	 * @return the cactupai attribute reference
	 */
	public RangeReference getCactupaiReference() {
		return cactupai.getReference();
	}	
				
	/**
	 * Setter for cactupai .
	 */
   	public void setCactupai(RangeReference reference) {
       	cactupai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute opnyearl.
	 * @return the opnyearl attribute reference
	 */
	public ElementaryRangeReference getOpnyearlReference() {
		return opnyearl.getReference();
	}

	/**
	 * Getter for opnyearl attribute.
	 * @return opnyearl attribute
	 */
	public int getOpnyearl() {
		return opnyearl.getValue();
	}

	/**
	 * Setter for opnyearl attribute.
	 * @param opnyearl the new value of opnyearl
	 */
	public void setOpnyearl(int opnyearl) {
		this.opnyearl.setValue(opnyearl);
	}
	/**
	 * Gets the reference for attribute opnyearf.
	 * @return the opnyearf attribute reference
	 */
	public ElementaryRangeReference getOpnyearfReference() {
		return opnyearf.getReference();
	}

	/**
	 * Getter for opnyearf attribute.
	 * @return opnyearf attribute
	 */
	public String getOpnyearf() {
		return opnyearf.getValue();
	}

	/**
	 * Setter for opnyearf attribute.
	 * @param opnyearf the new value of opnyearf
	 */
	public void setOpnyearf(String opnyearf) {
		this.opnyearf.setValue(opnyearf);
	}
	/**
	 * Gets the reference for attribute opnyeara.
	 * @return the opnyeara attribute reference
	 */
	public ElementaryRangeReference getOpnyearaReference() {
		return opnyeara.getReference();
	}

	/**
	 * Getter for opnyeara attribute.
	 * @return opnyeara attribute
	 */
	public String getOpnyeara() {
		return opnyeara.getValue();
	}

	/**
	 * Setter for opnyeara attribute.
	 * @param opnyeara the new value of opnyeara
	 */
	public void setOpnyeara(String opnyeara) {
		this.opnyeara.setValue(opnyeara);
	}
	/**
	 * Gets the reference for attribute opnyeari.
	 * @return the opnyeari attribute reference
	 */
	public ElementaryRangeReference getOpnyeariReference() {
		return opnyeari.getReference();
	}

	/**
	 * Getter for opnyeari attribute.
	 * @return opnyeari attribute
	 */
	public String getOpnyeari() {
		return opnyeari.getValue();
	}

	/**
	 * Setter for opnyeari attribute.
	 * @param opnyeari the new value of opnyeari
	 */
	public void setOpnyeari(String opnyeari) {
		this.opnyeari.setValue(opnyeari);
	}
	/**
	 * Gets the reference for attribute opnmonl.
	 * @return the opnmonl attribute reference
	 */
	public ElementaryRangeReference getOpnmonlReference() {
		return opnmonl.getReference();
	}

	/**
	 * Getter for opnmonl attribute.
	 * @return opnmonl attribute
	 */
	public int getOpnmonl() {
		return opnmonl.getValue();
	}

	/**
	 * Setter for opnmonl attribute.
	 * @param opnmonl the new value of opnmonl
	 */
	public void setOpnmonl(int opnmonl) {
		this.opnmonl.setValue(opnmonl);
	}
	/**
	 * Gets the reference for attribute opnmonf.
	 * @return the opnmonf attribute reference
	 */
	public ElementaryRangeReference getOpnmonfReference() {
		return opnmonf.getReference();
	}

	/**
	 * Getter for opnmonf attribute.
	 * @return opnmonf attribute
	 */
	public String getOpnmonf() {
		return opnmonf.getValue();
	}

	/**
	 * Setter for opnmonf attribute.
	 * @param opnmonf the new value of opnmonf
	 */
	public void setOpnmonf(String opnmonf) {
		this.opnmonf.setValue(opnmonf);
	}
	/**
	 * Gets the reference for attribute opnmona.
	 * @return the opnmona attribute reference
	 */
	public ElementaryRangeReference getOpnmonaReference() {
		return opnmona.getReference();
	}

	/**
	 * Getter for opnmona attribute.
	 * @return opnmona attribute
	 */
	public String getOpnmona() {
		return opnmona.getValue();
	}

	/**
	 * Setter for opnmona attribute.
	 * @param opnmona the new value of opnmona
	 */
	public void setOpnmona(String opnmona) {
		this.opnmona.setValue(opnmona);
	}
	/**
	 * Gets the reference for attribute opnmoni.
	 * @return the opnmoni attribute reference
	 */
	public ElementaryRangeReference getOpnmoniReference() {
		return opnmoni.getReference();
	}

	/**
	 * Getter for opnmoni attribute.
	 * @return opnmoni attribute
	 */
	public String getOpnmoni() {
		return opnmoni.getValue();
	}

	/**
	 * Setter for opnmoni attribute.
	 * @param opnmoni the new value of opnmoni
	 */
	public void setOpnmoni(String opnmoni) {
		this.opnmoni.setValue(opnmoni);
	}
	/**
	 * Gets the reference for attribute opndayl.
	 * @return the opndayl attribute reference
	 */
	public ElementaryRangeReference getOpndaylReference() {
		return opndayl.getReference();
	}

	/**
	 * Getter for opndayl attribute.
	 * @return opndayl attribute
	 */
	public int getOpndayl() {
		return opndayl.getValue();
	}

	/**
	 * Setter for opndayl attribute.
	 * @param opndayl the new value of opndayl
	 */
	public void setOpndayl(int opndayl) {
		this.opndayl.setValue(opndayl);
	}
	/**
	 * Gets the reference for attribute opndayf.
	 * @return the opndayf attribute reference
	 */
	public ElementaryRangeReference getOpndayfReference() {
		return opndayf.getReference();
	}

	/**
	 * Getter for opndayf attribute.
	 * @return opndayf attribute
	 */
	public String getOpndayf() {
		return opndayf.getValue();
	}

	/**
	 * Setter for opndayf attribute.
	 * @param opndayf the new value of opndayf
	 */
	public void setOpndayf(String opndayf) {
		this.opndayf.setValue(opndayf);
	}
	/**
	 * Gets the reference for attribute opndaya.
	 * @return the opndaya attribute reference
	 */
	public ElementaryRangeReference getOpndayaReference() {
		return opndaya.getReference();
	}

	/**
	 * Getter for opndaya attribute.
	 * @return opndaya attribute
	 */
	public String getOpndaya() {
		return opndaya.getValue();
	}

	/**
	 * Setter for opndaya attribute.
	 * @param opndaya the new value of opndaya
	 */
	public void setOpndaya(String opndaya) {
		this.opndaya.setValue(opndaya);
	}
	/**
	 * Gets the reference for attribute opndayi.
	 * @return the opndayi attribute reference
	 */
	public ElementaryRangeReference getOpndayiReference() {
		return opndayi.getReference();
	}

	/**
	 * Getter for opndayi attribute.
	 * @return opndayi attribute
	 */
	public String getOpndayi() {
		return opndayi.getValue();
	}

	/**
	 * Setter for opndayi attribute.
	 * @param opndayi the new value of opndayi
	 */
	public void setOpndayi(String opndayi) {
		this.opndayi.setValue(opndayi);
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
	 * Gets the reference for attribute expdayl.
	 * @return the expdayl attribute reference
	 */
	public ElementaryRangeReference getExpdaylReference() {
		return expdayl.getReference();
	}

	/**
	 * Getter for expdayl attribute.
	 * @return expdayl attribute
	 */
	public int getExpdayl() {
		return expdayl.getValue();
	}

	/**
	 * Setter for expdayl attribute.
	 * @param expdayl the new value of expdayl
	 */
	public void setExpdayl(int expdayl) {
		this.expdayl.setValue(expdayl);
	}
	/**
	 * Gets the reference for attribute expdayf.
	 * @return the expdayf attribute reference
	 */
	public ElementaryRangeReference getExpdayfReference() {
		return expdayf.getReference();
	}

	/**
	 * Getter for expdayf attribute.
	 * @return expdayf attribute
	 */
	public String getExpdayf() {
		return expdayf.getValue();
	}

	/**
	 * Setter for expdayf attribute.
	 * @param expdayf the new value of expdayf
	 */
	public void setExpdayf(String expdayf) {
		this.expdayf.setValue(expdayf);
	}
	/**
	 * Gets the reference for attribute expdaya.
	 * @return the expdaya attribute reference
	 */
	public ElementaryRangeReference getExpdayaReference() {
		return expdaya.getReference();
	}

	/**
	 * Getter for expdaya attribute.
	 * @return expdaya attribute
	 */
	public String getExpdaya() {
		return expdaya.getValue();
	}

	/**
	 * Setter for expdaya attribute.
	 * @param expdaya the new value of expdaya
	 */
	public void setExpdaya(String expdaya) {
		this.expdaya.setValue(expdaya);
	}
	/**
	 * Gets the reference for attribute expdayi.
	 * @return the expdayi attribute reference
	 */
	public ElementaryRangeReference getExpdayiReference() {
		return expdayi.getReference();
	}

	/**
	 * Getter for expdayi attribute.
	 * @return expdayi attribute
	 */
	public String getExpdayi() {
		return expdayi.getValue();
	}

	/**
	 * Setter for expdayi attribute.
	 * @param expdayi the new value of expdayi
	 */
	public void setExpdayi(String expdayi) {
		this.expdayi.setValue(expdayi);
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
	 * Gets the reference for attribute risyearl.
	 * @return the risyearl attribute reference
	 */
	public ElementaryRangeReference getRisyearlReference() {
		return risyearl.getReference();
	}

	/**
	 * Getter for risyearl attribute.
	 * @return risyearl attribute
	 */
	public int getRisyearl() {
		return risyearl.getValue();
	}

	/**
	 * Setter for risyearl attribute.
	 * @param risyearl the new value of risyearl
	 */
	public void setRisyearl(int risyearl) {
		this.risyearl.setValue(risyearl);
	}
	/**
	 * Gets the reference for attribute risyearf.
	 * @return the risyearf attribute reference
	 */
	public ElementaryRangeReference getRisyearfReference() {
		return risyearf.getReference();
	}

	/**
	 * Getter for risyearf attribute.
	 * @return risyearf attribute
	 */
	public String getRisyearf() {
		return risyearf.getValue();
	}

	/**
	 * Setter for risyearf attribute.
	 * @param risyearf the new value of risyearf
	 */
	public void setRisyearf(String risyearf) {
		this.risyearf.setValue(risyearf);
	}
	/**
	 * Gets the reference for attribute risyeara.
	 * @return the risyeara attribute reference
	 */
	public ElementaryRangeReference getRisyearaReference() {
		return risyeara.getReference();
	}

	/**
	 * Getter for risyeara attribute.
	 * @return risyeara attribute
	 */
	public String getRisyeara() {
		return risyeara.getValue();
	}

	/**
	 * Setter for risyeara attribute.
	 * @param risyeara the new value of risyeara
	 */
	public void setRisyeara(String risyeara) {
		this.risyeara.setValue(risyeara);
	}
	/**
	 * Gets the reference for attribute risyeari.
	 * @return the risyeari attribute reference
	 */
	public ElementaryRangeReference getRisyeariReference() {
		return risyeari.getReference();
	}

	/**
	 * Getter for risyeari attribute.
	 * @return risyeari attribute
	 */
	public String getRisyeari() {
		return risyeari.getValue();
	}

	/**
	 * Setter for risyeari attribute.
	 * @param risyeari the new value of risyeari
	 */
	public void setRisyeari(String risyeari) {
		this.risyeari.setValue(risyeari);
	}
	/**
	 * Gets the reference for attribute rismonl.
	 * @return the rismonl attribute reference
	 */
	public ElementaryRangeReference getRismonlReference() {
		return rismonl.getReference();
	}

	/**
	 * Getter for rismonl attribute.
	 * @return rismonl attribute
	 */
	public int getRismonl() {
		return rismonl.getValue();
	}

	/**
	 * Setter for rismonl attribute.
	 * @param rismonl the new value of rismonl
	 */
	public void setRismonl(int rismonl) {
		this.rismonl.setValue(rismonl);
	}
	/**
	 * Gets the reference for attribute rismonf.
	 * @return the rismonf attribute reference
	 */
	public ElementaryRangeReference getRismonfReference() {
		return rismonf.getReference();
	}

	/**
	 * Getter for rismonf attribute.
	 * @return rismonf attribute
	 */
	public String getRismonf() {
		return rismonf.getValue();
	}

	/**
	 * Setter for rismonf attribute.
	 * @param rismonf the new value of rismonf
	 */
	public void setRismonf(String rismonf) {
		this.rismonf.setValue(rismonf);
	}
	/**
	 * Gets the reference for attribute rismona.
	 * @return the rismona attribute reference
	 */
	public ElementaryRangeReference getRismonaReference() {
		return rismona.getReference();
	}

	/**
	 * Getter for rismona attribute.
	 * @return rismona attribute
	 */
	public String getRismona() {
		return rismona.getValue();
	}

	/**
	 * Setter for rismona attribute.
	 * @param rismona the new value of rismona
	 */
	public void setRismona(String rismona) {
		this.rismona.setValue(rismona);
	}
	/**
	 * Gets the reference for attribute rismoni.
	 * @return the rismoni attribute reference
	 */
	public ElementaryRangeReference getRismoniReference() {
		return rismoni.getReference();
	}

	/**
	 * Getter for rismoni attribute.
	 * @return rismoni attribute
	 */
	public String getRismoni() {
		return rismoni.getValue();
	}

	/**
	 * Setter for rismoni attribute.
	 * @param rismoni the new value of rismoni
	 */
	public void setRismoni(String rismoni) {
		this.rismoni.setValue(rismoni);
	}
	/**
	 * Gets the reference for attribute risdayl.
	 * @return the risdayl attribute reference
	 */
	public ElementaryRangeReference getRisdaylReference() {
		return risdayl.getReference();
	}

	/**
	 * Getter for risdayl attribute.
	 * @return risdayl attribute
	 */
	public int getRisdayl() {
		return risdayl.getValue();
	}

	/**
	 * Setter for risdayl attribute.
	 * @param risdayl the new value of risdayl
	 */
	public void setRisdayl(int risdayl) {
		this.risdayl.setValue(risdayl);
	}
	/**
	 * Gets the reference for attribute risdayf.
	 * @return the risdayf attribute reference
	 */
	public ElementaryRangeReference getRisdayfReference() {
		return risdayf.getReference();
	}

	/**
	 * Getter for risdayf attribute.
	 * @return risdayf attribute
	 */
	public String getRisdayf() {
		return risdayf.getValue();
	}

	/**
	 * Setter for risdayf attribute.
	 * @param risdayf the new value of risdayf
	 */
	public void setRisdayf(String risdayf) {
		this.risdayf.setValue(risdayf);
	}
	/**
	 * Gets the reference for attribute risdaya.
	 * @return the risdaya attribute reference
	 */
	public ElementaryRangeReference getRisdayaReference() {
		return risdaya.getReference();
	}

	/**
	 * Getter for risdaya attribute.
	 * @return risdaya attribute
	 */
	public String getRisdaya() {
		return risdaya.getValue();
	}

	/**
	 * Setter for risdaya attribute.
	 * @param risdaya the new value of risdaya
	 */
	public void setRisdaya(String risdaya) {
		this.risdaya.setValue(risdaya);
	}
	/**
	 * Gets the reference for attribute risdayi.
	 * @return the risdayi attribute reference
	 */
	public ElementaryRangeReference getRisdayiReference() {
		return risdayi.getReference();
	}

	/**
	 * Getter for risdayi attribute.
	 * @return risdayi attribute
	 */
	public String getRisdayi() {
		return risdayi.getValue();
	}

	/**
	 * Setter for risdayi attribute.
	 * @param risdayi the new value of risdayi
	 */
	public void setRisdayi(String risdayi) {
		this.risdayi.setValue(risdayi);
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
	 * Gets the reference for attribute actssn1l.
	 * @return the actssn1l attribute reference
	 */
	public ElementaryRangeReference getActssn1lReference() {
		return actssn1l.getReference();
	}

	/**
	 * Getter for actssn1l attribute.
	 * @return actssn1l attribute
	 */
	public int getActssn1l() {
		return actssn1l.getValue();
	}

	/**
	 * Setter for actssn1l attribute.
	 * @param actssn1l the new value of actssn1l
	 */
	public void setActssn1l(int actssn1l) {
		this.actssn1l.setValue(actssn1l);
	}
	/**
	 * Gets the reference for attribute actssn1f.
	 * @return the actssn1f attribute reference
	 */
	public ElementaryRangeReference getActssn1fReference() {
		return actssn1f.getReference();
	}

	/**
	 * Getter for actssn1f attribute.
	 * @return actssn1f attribute
	 */
	public String getActssn1f() {
		return actssn1f.getValue();
	}

	/**
	 * Setter for actssn1f attribute.
	 * @param actssn1f the new value of actssn1f
	 */
	public void setActssn1f(String actssn1f) {
		this.actssn1f.setValue(actssn1f);
	}
	/**
	 * Gets the reference for attribute actssn1a.
	 * @return the actssn1a attribute reference
	 */
	public ElementaryRangeReference getActssn1aReference() {
		return actssn1a.getReference();
	}

	/**
	 * Getter for actssn1a attribute.
	 * @return actssn1a attribute
	 */
	public String getActssn1a() {
		return actssn1a.getValue();
	}

	/**
	 * Setter for actssn1a attribute.
	 * @param actssn1a the new value of actssn1a
	 */
	public void setActssn1a(String actssn1a) {
		this.actssn1a.setValue(actssn1a);
	}
	/**
	 * Gets the reference for attribute actssn1i.
	 * @return the actssn1i attribute reference
	 */
	public ElementaryRangeReference getActssn1iReference() {
		return actssn1i.getReference();
	}

	/**
	 * Getter for actssn1i attribute.
	 * @return actssn1i attribute
	 */
	public String getActssn1i() {
		return actssn1i.getValue();
	}

	/**
	 * Setter for actssn1i attribute.
	 * @param actssn1i the new value of actssn1i
	 */
	public void setActssn1i(String actssn1i) {
		this.actssn1i.setValue(actssn1i);
	}
	/**
	 * Gets the reference for attribute actssn2l.
	 * @return the actssn2l attribute reference
	 */
	public ElementaryRangeReference getActssn2lReference() {
		return actssn2l.getReference();
	}

	/**
	 * Getter for actssn2l attribute.
	 * @return actssn2l attribute
	 */
	public int getActssn2l() {
		return actssn2l.getValue();
	}

	/**
	 * Setter for actssn2l attribute.
	 * @param actssn2l the new value of actssn2l
	 */
	public void setActssn2l(int actssn2l) {
		this.actssn2l.setValue(actssn2l);
	}
	/**
	 * Gets the reference for attribute actssn2f.
	 * @return the actssn2f attribute reference
	 */
	public ElementaryRangeReference getActssn2fReference() {
		return actssn2f.getReference();
	}

	/**
	 * Getter for actssn2f attribute.
	 * @return actssn2f attribute
	 */
	public String getActssn2f() {
		return actssn2f.getValue();
	}

	/**
	 * Setter for actssn2f attribute.
	 * @param actssn2f the new value of actssn2f
	 */
	public void setActssn2f(String actssn2f) {
		this.actssn2f.setValue(actssn2f);
	}
	/**
	 * Gets the reference for attribute actssn2a.
	 * @return the actssn2a attribute reference
	 */
	public ElementaryRangeReference getActssn2aReference() {
		return actssn2a.getReference();
	}

	/**
	 * Getter for actssn2a attribute.
	 * @return actssn2a attribute
	 */
	public String getActssn2a() {
		return actssn2a.getValue();
	}

	/**
	 * Setter for actssn2a attribute.
	 * @param actssn2a the new value of actssn2a
	 */
	public void setActssn2a(String actssn2a) {
		this.actssn2a.setValue(actssn2a);
	}
	/**
	 * Gets the reference for attribute actssn2i.
	 * @return the actssn2i attribute reference
	 */
	public ElementaryRangeReference getActssn2iReference() {
		return actssn2i.getReference();
	}

	/**
	 * Getter for actssn2i attribute.
	 * @return actssn2i attribute
	 */
	public String getActssn2i() {
		return actssn2i.getValue();
	}

	/**
	 * Setter for actssn2i attribute.
	 * @param actssn2i the new value of actssn2i
	 */
	public void setActssn2i(String actssn2i) {
		this.actssn2i.setValue(actssn2i);
	}
	/**
	 * Gets the reference for attribute actssn3l.
	 * @return the actssn3l attribute reference
	 */
	public ElementaryRangeReference getActssn3lReference() {
		return actssn3l.getReference();
	}

	/**
	 * Getter for actssn3l attribute.
	 * @return actssn3l attribute
	 */
	public int getActssn3l() {
		return actssn3l.getValue();
	}

	/**
	 * Setter for actssn3l attribute.
	 * @param actssn3l the new value of actssn3l
	 */
	public void setActssn3l(int actssn3l) {
		this.actssn3l.setValue(actssn3l);
	}
	/**
	 * Gets the reference for attribute actssn3f.
	 * @return the actssn3f attribute reference
	 */
	public ElementaryRangeReference getActssn3fReference() {
		return actssn3f.getReference();
	}

	/**
	 * Getter for actssn3f attribute.
	 * @return actssn3f attribute
	 */
	public String getActssn3f() {
		return actssn3f.getValue();
	}

	/**
	 * Setter for actssn3f attribute.
	 * @param actssn3f the new value of actssn3f
	 */
	public void setActssn3f(String actssn3f) {
		this.actssn3f.setValue(actssn3f);
	}
	/**
	 * Gets the reference for attribute actssn3a.
	 * @return the actssn3a attribute reference
	 */
	public ElementaryRangeReference getActssn3aReference() {
		return actssn3a.getReference();
	}

	/**
	 * Getter for actssn3a attribute.
	 * @return actssn3a attribute
	 */
	public String getActssn3a() {
		return actssn3a.getValue();
	}

	/**
	 * Setter for actssn3a attribute.
	 * @param actssn3a the new value of actssn3a
	 */
	public void setActssn3a(String actssn3a) {
		this.actssn3a.setValue(actssn3a);
	}
	/**
	 * Gets the reference for attribute actssn3i.
	 * @return the actssn3i attribute reference
	 */
	public ElementaryRangeReference getActssn3iReference() {
		return actssn3i.getReference();
	}

	/**
	 * Getter for actssn3i attribute.
	 * @return actssn3i attribute
	 */
	public String getActssn3i() {
		return actssn3i.getValue();
	}

	/**
	 * Setter for actssn3i attribute.
	 * @param actssn3i the new value of actssn3i
	 */
	public void setActssn3i(String actssn3i) {
		this.actssn3i.setValue(actssn3i);
	}
	/**
	 * Gets the reference for attribute dobyearl.
	 * @return the dobyearl attribute reference
	 */
	public ElementaryRangeReference getDobyearlReference() {
		return dobyearl.getReference();
	}

	/**
	 * Getter for dobyearl attribute.
	 * @return dobyearl attribute
	 */
	public int getDobyearl() {
		return dobyearl.getValue();
	}

	/**
	 * Setter for dobyearl attribute.
	 * @param dobyearl the new value of dobyearl
	 */
	public void setDobyearl(int dobyearl) {
		this.dobyearl.setValue(dobyearl);
	}
	/**
	 * Gets the reference for attribute dobyearf.
	 * @return the dobyearf attribute reference
	 */
	public ElementaryRangeReference getDobyearfReference() {
		return dobyearf.getReference();
	}

	/**
	 * Getter for dobyearf attribute.
	 * @return dobyearf attribute
	 */
	public String getDobyearf() {
		return dobyearf.getValue();
	}

	/**
	 * Setter for dobyearf attribute.
	 * @param dobyearf the new value of dobyearf
	 */
	public void setDobyearf(String dobyearf) {
		this.dobyearf.setValue(dobyearf);
	}
	/**
	 * Gets the reference for attribute dobyeara.
	 * @return the dobyeara attribute reference
	 */
	public ElementaryRangeReference getDobyearaReference() {
		return dobyeara.getReference();
	}

	/**
	 * Getter for dobyeara attribute.
	 * @return dobyeara attribute
	 */
	public String getDobyeara() {
		return dobyeara.getValue();
	}

	/**
	 * Setter for dobyeara attribute.
	 * @param dobyeara the new value of dobyeara
	 */
	public void setDobyeara(String dobyeara) {
		this.dobyeara.setValue(dobyeara);
	}
	/**
	 * Gets the reference for attribute dobyeari.
	 * @return the dobyeari attribute reference
	 */
	public ElementaryRangeReference getDobyeariReference() {
		return dobyeari.getReference();
	}

	/**
	 * Getter for dobyeari attribute.
	 * @return dobyeari attribute
	 */
	public String getDobyeari() {
		return dobyeari.getValue();
	}

	/**
	 * Setter for dobyeari attribute.
	 * @param dobyeari the new value of dobyeari
	 */
	public void setDobyeari(String dobyeari) {
		this.dobyeari.setValue(dobyeari);
	}
	/**
	 * Gets the reference for attribute dobmonl.
	 * @return the dobmonl attribute reference
	 */
	public ElementaryRangeReference getDobmonlReference() {
		return dobmonl.getReference();
	}

	/**
	 * Getter for dobmonl attribute.
	 * @return dobmonl attribute
	 */
	public int getDobmonl() {
		return dobmonl.getValue();
	}

	/**
	 * Setter for dobmonl attribute.
	 * @param dobmonl the new value of dobmonl
	 */
	public void setDobmonl(int dobmonl) {
		this.dobmonl.setValue(dobmonl);
	}
	/**
	 * Gets the reference for attribute dobmonf.
	 * @return the dobmonf attribute reference
	 */
	public ElementaryRangeReference getDobmonfReference() {
		return dobmonf.getReference();
	}

	/**
	 * Getter for dobmonf attribute.
	 * @return dobmonf attribute
	 */
	public String getDobmonf() {
		return dobmonf.getValue();
	}

	/**
	 * Setter for dobmonf attribute.
	 * @param dobmonf the new value of dobmonf
	 */
	public void setDobmonf(String dobmonf) {
		this.dobmonf.setValue(dobmonf);
	}
	/**
	 * Gets the reference for attribute dobmona.
	 * @return the dobmona attribute reference
	 */
	public ElementaryRangeReference getDobmonaReference() {
		return dobmona.getReference();
	}

	/**
	 * Getter for dobmona attribute.
	 * @return dobmona attribute
	 */
	public String getDobmona() {
		return dobmona.getValue();
	}

	/**
	 * Setter for dobmona attribute.
	 * @param dobmona the new value of dobmona
	 */
	public void setDobmona(String dobmona) {
		this.dobmona.setValue(dobmona);
	}
	/**
	 * Gets the reference for attribute dobmoni.
	 * @return the dobmoni attribute reference
	 */
	public ElementaryRangeReference getDobmoniReference() {
		return dobmoni.getReference();
	}

	/**
	 * Getter for dobmoni attribute.
	 * @return dobmoni attribute
	 */
	public String getDobmoni() {
		return dobmoni.getValue();
	}

	/**
	 * Setter for dobmoni attribute.
	 * @param dobmoni the new value of dobmoni
	 */
	public void setDobmoni(String dobmoni) {
		this.dobmoni.setValue(dobmoni);
	}
	/**
	 * Gets the reference for attribute dobdayl.
	 * @return the dobdayl attribute reference
	 */
	public ElementaryRangeReference getDobdaylReference() {
		return dobdayl.getReference();
	}

	/**
	 * Getter for dobdayl attribute.
	 * @return dobdayl attribute
	 */
	public int getDobdayl() {
		return dobdayl.getValue();
	}

	/**
	 * Setter for dobdayl attribute.
	 * @param dobdayl the new value of dobdayl
	 */
	public void setDobdayl(int dobdayl) {
		this.dobdayl.setValue(dobdayl);
	}
	/**
	 * Gets the reference for attribute dobdayf.
	 * @return the dobdayf attribute reference
	 */
	public ElementaryRangeReference getDobdayfReference() {
		return dobdayf.getReference();
	}

	/**
	 * Getter for dobdayf attribute.
	 * @return dobdayf attribute
	 */
	public String getDobdayf() {
		return dobdayf.getValue();
	}

	/**
	 * Setter for dobdayf attribute.
	 * @param dobdayf the new value of dobdayf
	 */
	public void setDobdayf(String dobdayf) {
		this.dobdayf.setValue(dobdayf);
	}
	/**
	 * Gets the reference for attribute dobdaya.
	 * @return the dobdaya attribute reference
	 */
	public ElementaryRangeReference getDobdayaReference() {
		return dobdaya.getReference();
	}

	/**
	 * Getter for dobdaya attribute.
	 * @return dobdaya attribute
	 */
	public String getDobdaya() {
		return dobdaya.getValue();
	}

	/**
	 * Setter for dobdaya attribute.
	 * @param dobdaya the new value of dobdaya
	 */
	public void setDobdaya(String dobdaya) {
		this.dobdaya.setValue(dobdaya);
	}
	/**
	 * Gets the reference for attribute dobdayi.
	 * @return the dobdayi attribute reference
	 */
	public ElementaryRangeReference getDobdayiReference() {
		return dobdayi.getReference();
	}

	/**
	 * Getter for dobdayi attribute.
	 * @return dobdayi attribute
	 */
	public String getDobdayi() {
		return dobdayi.getValue();
	}

	/**
	 * Setter for dobdayi attribute.
	 * @param dobdayi the new value of dobdayi
	 */
	public void setDobdayi(String dobdayi) {
		this.dobdayi.setValue(dobdayi);
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
	 * Gets the reference for attribute acsph1al.
	 * @return the acsph1al attribute reference
	 */
	public ElementaryRangeReference getAcsph1alReference() {
		return acsph1al.getReference();
	}

	/**
	 * Getter for acsph1al attribute.
	 * @return acsph1al attribute
	 */
	public int getAcsph1al() {
		return acsph1al.getValue();
	}

	/**
	 * Setter for acsph1al attribute.
	 * @param acsph1al the new value of acsph1al
	 */
	public void setAcsph1al(int acsph1al) {
		this.acsph1al.setValue(acsph1al);
	}
	/**
	 * Gets the reference for attribute acsph1af.
	 * @return the acsph1af attribute reference
	 */
	public ElementaryRangeReference getAcsph1afReference() {
		return acsph1af.getReference();
	}

	/**
	 * Getter for acsph1af attribute.
	 * @return acsph1af attribute
	 */
	public String getAcsph1af() {
		return acsph1af.getValue();
	}

	/**
	 * Setter for acsph1af attribute.
	 * @param acsph1af the new value of acsph1af
	 */
	public void setAcsph1af(String acsph1af) {
		this.acsph1af.setValue(acsph1af);
	}
	/**
	 * Gets the reference for attribute acsph1aa.
	 * @return the acsph1aa attribute reference
	 */
	public ElementaryRangeReference getAcsph1aaReference() {
		return acsph1aa.getReference();
	}

	/**
	 * Getter for acsph1aa attribute.
	 * @return acsph1aa attribute
	 */
	public String getAcsph1aa() {
		return acsph1aa.getValue();
	}

	/**
	 * Setter for acsph1aa attribute.
	 * @param acsph1aa the new value of acsph1aa
	 */
	public void setAcsph1aa(String acsph1aa) {
		this.acsph1aa.setValue(acsph1aa);
	}
	/**
	 * Gets the reference for attribute acsph1ai.
	 * @return the acsph1ai attribute reference
	 */
	public ElementaryRangeReference getAcsph1aiReference() {
		return acsph1ai.getReference();
	}

	/**
	 * Getter for acsph1ai attribute.
	 * @return acsph1ai attribute
	 */
	public String getAcsph1ai() {
		return acsph1ai.getValue();
	}

	/**
	 * Setter for acsph1ai attribute.
	 * @param acsph1ai the new value of acsph1ai
	 */
	public void setAcsph1ai(String acsph1ai) {
		this.acsph1ai.setValue(acsph1ai);
	}
	/**
	 * Gets the reference for attribute acsph1bl.
	 * @return the acsph1bl attribute reference
	 */
	public ElementaryRangeReference getAcsph1blReference() {
		return acsph1bl.getReference();
	}

	/**
	 * Getter for acsph1bl attribute.
	 * @return acsph1bl attribute
	 */
	public int getAcsph1bl() {
		return acsph1bl.getValue();
	}

	/**
	 * Setter for acsph1bl attribute.
	 * @param acsph1bl the new value of acsph1bl
	 */
	public void setAcsph1bl(int acsph1bl) {
		this.acsph1bl.setValue(acsph1bl);
	}
	/**
	 * Gets the reference for attribute acsph1bf.
	 * @return the acsph1bf attribute reference
	 */
	public ElementaryRangeReference getAcsph1bfReference() {
		return acsph1bf.getReference();
	}

	/**
	 * Getter for acsph1bf attribute.
	 * @return acsph1bf attribute
	 */
	public String getAcsph1bf() {
		return acsph1bf.getValue();
	}

	/**
	 * Setter for acsph1bf attribute.
	 * @param acsph1bf the new value of acsph1bf
	 */
	public void setAcsph1bf(String acsph1bf) {
		this.acsph1bf.setValue(acsph1bf);
	}
	/**
	 * Gets the reference for attribute acsph1ba.
	 * @return the acsph1ba attribute reference
	 */
	public ElementaryRangeReference getAcsph1baReference() {
		return acsph1ba.getReference();
	}

	/**
	 * Getter for acsph1ba attribute.
	 * @return acsph1ba attribute
	 */
	public String getAcsph1ba() {
		return acsph1ba.getValue();
	}

	/**
	 * Setter for acsph1ba attribute.
	 * @param acsph1ba the new value of acsph1ba
	 */
	public void setAcsph1ba(String acsph1ba) {
		this.acsph1ba.setValue(acsph1ba);
	}
	/**
	 * Gets the reference for attribute acsph1bi.
	 * @return the acsph1bi attribute reference
	 */
	public ElementaryRangeReference getAcsph1biReference() {
		return acsph1bi.getReference();
	}

	/**
	 * Getter for acsph1bi attribute.
	 * @return acsph1bi attribute
	 */
	public String getAcsph1bi() {
		return acsph1bi.getValue();
	}

	/**
	 * Setter for acsph1bi attribute.
	 * @param acsph1bi the new value of acsph1bi
	 */
	public void setAcsph1bi(String acsph1bi) {
		this.acsph1bi.setValue(acsph1bi);
	}
	/**
	 * Gets the reference for attribute acsph1cl.
	 * @return the acsph1cl attribute reference
	 */
	public ElementaryRangeReference getAcsph1clReference() {
		return acsph1cl.getReference();
	}

	/**
	 * Getter for acsph1cl attribute.
	 * @return acsph1cl attribute
	 */
	public int getAcsph1cl() {
		return acsph1cl.getValue();
	}

	/**
	 * Setter for acsph1cl attribute.
	 * @param acsph1cl the new value of acsph1cl
	 */
	public void setAcsph1cl(int acsph1cl) {
		this.acsph1cl.setValue(acsph1cl);
	}
	/**
	 * Gets the reference for attribute acsph1cf.
	 * @return the acsph1cf attribute reference
	 */
	public ElementaryRangeReference getAcsph1cfReference() {
		return acsph1cf.getReference();
	}

	/**
	 * Getter for acsph1cf attribute.
	 * @return acsph1cf attribute
	 */
	public String getAcsph1cf() {
		return acsph1cf.getValue();
	}

	/**
	 * Setter for acsph1cf attribute.
	 * @param acsph1cf the new value of acsph1cf
	 */
	public void setAcsph1cf(String acsph1cf) {
		this.acsph1cf.setValue(acsph1cf);
	}
	/**
	 * Gets the reference for attribute acsph1ca.
	 * @return the acsph1ca attribute reference
	 */
	public ElementaryRangeReference getAcsph1caReference() {
		return acsph1ca.getReference();
	}

	/**
	 * Getter for acsph1ca attribute.
	 * @return acsph1ca attribute
	 */
	public String getAcsph1ca() {
		return acsph1ca.getValue();
	}

	/**
	 * Setter for acsph1ca attribute.
	 * @param acsph1ca the new value of acsph1ca
	 */
	public void setAcsph1ca(String acsph1ca) {
		this.acsph1ca.setValue(acsph1ca);
	}
	/**
	 * Gets the reference for attribute acsph1ci.
	 * @return the acsph1ci attribute reference
	 */
	public ElementaryRangeReference getAcsph1ciReference() {
		return acsph1ci.getReference();
	}

	/**
	 * Getter for acsph1ci attribute.
	 * @return acsph1ci attribute
	 */
	public String getAcsph1ci() {
		return acsph1ci.getValue();
	}

	/**
	 * Setter for acsph1ci attribute.
	 * @param acsph1ci the new value of acsph1ci
	 */
	public void setAcsph1ci(String acsph1ci) {
		this.acsph1ci.setValue(acsph1ci);
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
	 * Gets the reference for attribute acsph2al.
	 * @return the acsph2al attribute reference
	 */
	public ElementaryRangeReference getAcsph2alReference() {
		return acsph2al.getReference();
	}

	/**
	 * Getter for acsph2al attribute.
	 * @return acsph2al attribute
	 */
	public int getAcsph2al() {
		return acsph2al.getValue();
	}

	/**
	 * Setter for acsph2al attribute.
	 * @param acsph2al the new value of acsph2al
	 */
	public void setAcsph2al(int acsph2al) {
		this.acsph2al.setValue(acsph2al);
	}
	/**
	 * Gets the reference for attribute acsph2af.
	 * @return the acsph2af attribute reference
	 */
	public ElementaryRangeReference getAcsph2afReference() {
		return acsph2af.getReference();
	}

	/**
	 * Getter for acsph2af attribute.
	 * @return acsph2af attribute
	 */
	public String getAcsph2af() {
		return acsph2af.getValue();
	}

	/**
	 * Setter for acsph2af attribute.
	 * @param acsph2af the new value of acsph2af
	 */
	public void setAcsph2af(String acsph2af) {
		this.acsph2af.setValue(acsph2af);
	}
	/**
	 * Gets the reference for attribute acsph2aa.
	 * @return the acsph2aa attribute reference
	 */
	public ElementaryRangeReference getAcsph2aaReference() {
		return acsph2aa.getReference();
	}

	/**
	 * Getter for acsph2aa attribute.
	 * @return acsph2aa attribute
	 */
	public String getAcsph2aa() {
		return acsph2aa.getValue();
	}

	/**
	 * Setter for acsph2aa attribute.
	 * @param acsph2aa the new value of acsph2aa
	 */
	public void setAcsph2aa(String acsph2aa) {
		this.acsph2aa.setValue(acsph2aa);
	}
	/**
	 * Gets the reference for attribute acsph2ai.
	 * @return the acsph2ai attribute reference
	 */
	public ElementaryRangeReference getAcsph2aiReference() {
		return acsph2ai.getReference();
	}

	/**
	 * Getter for acsph2ai attribute.
	 * @return acsph2ai attribute
	 */
	public String getAcsph2ai() {
		return acsph2ai.getValue();
	}

	/**
	 * Setter for acsph2ai attribute.
	 * @param acsph2ai the new value of acsph2ai
	 */
	public void setAcsph2ai(String acsph2ai) {
		this.acsph2ai.setValue(acsph2ai);
	}
	/**
	 * Gets the reference for attribute acsph2bl.
	 * @return the acsph2bl attribute reference
	 */
	public ElementaryRangeReference getAcsph2blReference() {
		return acsph2bl.getReference();
	}

	/**
	 * Getter for acsph2bl attribute.
	 * @return acsph2bl attribute
	 */
	public int getAcsph2bl() {
		return acsph2bl.getValue();
	}

	/**
	 * Setter for acsph2bl attribute.
	 * @param acsph2bl the new value of acsph2bl
	 */
	public void setAcsph2bl(int acsph2bl) {
		this.acsph2bl.setValue(acsph2bl);
	}
	/**
	 * Gets the reference for attribute acsph2bf.
	 * @return the acsph2bf attribute reference
	 */
	public ElementaryRangeReference getAcsph2bfReference() {
		return acsph2bf.getReference();
	}

	/**
	 * Getter for acsph2bf attribute.
	 * @return acsph2bf attribute
	 */
	public String getAcsph2bf() {
		return acsph2bf.getValue();
	}

	/**
	 * Setter for acsph2bf attribute.
	 * @param acsph2bf the new value of acsph2bf
	 */
	public void setAcsph2bf(String acsph2bf) {
		this.acsph2bf.setValue(acsph2bf);
	}
	/**
	 * Gets the reference for attribute acsph2ba.
	 * @return the acsph2ba attribute reference
	 */
	public ElementaryRangeReference getAcsph2baReference() {
		return acsph2ba.getReference();
	}

	/**
	 * Getter for acsph2ba attribute.
	 * @return acsph2ba attribute
	 */
	public String getAcsph2ba() {
		return acsph2ba.getValue();
	}

	/**
	 * Setter for acsph2ba attribute.
	 * @param acsph2ba the new value of acsph2ba
	 */
	public void setAcsph2ba(String acsph2ba) {
		this.acsph2ba.setValue(acsph2ba);
	}
	/**
	 * Gets the reference for attribute acsph2bi.
	 * @return the acsph2bi attribute reference
	 */
	public ElementaryRangeReference getAcsph2biReference() {
		return acsph2bi.getReference();
	}

	/**
	 * Getter for acsph2bi attribute.
	 * @return acsph2bi attribute
	 */
	public String getAcsph2bi() {
		return acsph2bi.getValue();
	}

	/**
	 * Setter for acsph2bi attribute.
	 * @param acsph2bi the new value of acsph2bi
	 */
	public void setAcsph2bi(String acsph2bi) {
		this.acsph2bi.setValue(acsph2bi);
	}
	/**
	 * Gets the reference for attribute acsph2cl.
	 * @return the acsph2cl attribute reference
	 */
	public ElementaryRangeReference getAcsph2clReference() {
		return acsph2cl.getReference();
	}

	/**
	 * Getter for acsph2cl attribute.
	 * @return acsph2cl attribute
	 */
	public int getAcsph2cl() {
		return acsph2cl.getValue();
	}

	/**
	 * Setter for acsph2cl attribute.
	 * @param acsph2cl the new value of acsph2cl
	 */
	public void setAcsph2cl(int acsph2cl) {
		this.acsph2cl.setValue(acsph2cl);
	}
	/**
	 * Gets the reference for attribute acsph2cf.
	 * @return the acsph2cf attribute reference
	 */
	public ElementaryRangeReference getAcsph2cfReference() {
		return acsph2cf.getReference();
	}

	/**
	 * Getter for acsph2cf attribute.
	 * @return acsph2cf attribute
	 */
	public String getAcsph2cf() {
		return acsph2cf.getValue();
	}

	/**
	 * Setter for acsph2cf attribute.
	 * @param acsph2cf the new value of acsph2cf
	 */
	public void setAcsph2cf(String acsph2cf) {
		this.acsph2cf.setValue(acsph2cf);
	}
	/**
	 * Gets the reference for attribute acsph2ca.
	 * @return the acsph2ca attribute reference
	 */
	public ElementaryRangeReference getAcsph2caReference() {
		return acsph2ca.getReference();
	}

	/**
	 * Getter for acsph2ca attribute.
	 * @return acsph2ca attribute
	 */
	public String getAcsph2ca() {
		return acsph2ca.getValue();
	}

	/**
	 * Setter for acsph2ca attribute.
	 * @param acsph2ca the new value of acsph2ca
	 */
	public void setAcsph2ca(String acsph2ca) {
		this.acsph2ca.setValue(acsph2ca);
	}
	/**
	 * Gets the reference for attribute acsph2ci.
	 * @return the acsph2ci attribute reference
	 */
	public ElementaryRangeReference getAcsph2ciReference() {
		return acsph2ci.getReference();
	}

	/**
	 * Getter for acsph2ci attribute.
	 * @return acsph2ci attribute
	 */
	public String getAcsph2ci() {
		return acsph2ci.getValue();
	}

	/**
	 * Setter for acsph2ci attribute.
	 * @param acsph2ci the new value of acsph2ci
	 */
	public void setAcsph2ci(String acsph2ci) {
		this.acsph2ci.setValue(acsph2ci);
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
	 * Gets the reference for attribute fkey05l.
	 * @return the fkey05l attribute reference
	 */
	public ElementaryRangeReference getFkey05lReference() {
		return fkey05l.getReference();
	}

	/**
	 * Getter for fkey05l attribute.
	 * @return fkey05l attribute
	 */
	public int getFkey05l() {
		return fkey05l.getValue();
	}

	/**
	 * Setter for fkey05l attribute.
	 * @param fkey05l the new value of fkey05l
	 */
	public void setFkey05l(int fkey05l) {
		this.fkey05l.setValue(fkey05l);
	}
	/**
	 * Gets the reference for attribute fkey05f.
	 * @return the fkey05f attribute reference
	 */
	public ElementaryRangeReference getFkey05fReference() {
		return fkey05f.getReference();
	}

	/**
	 * Getter for fkey05f attribute.
	 * @return fkey05f attribute
	 */
	public String getFkey05f() {
		return fkey05f.getValue();
	}

	/**
	 * Setter for fkey05f attribute.
	 * @param fkey05f the new value of fkey05f
	 */
	public void setFkey05f(String fkey05f) {
		this.fkey05f.setValue(fkey05f);
	}
	/**
	 * Gets the reference for attribute fkey05a.
	 * @return the fkey05a attribute reference
	 */
	public ElementaryRangeReference getFkey05aReference() {
		return fkey05a.getReference();
	}

	/**
	 * Getter for fkey05a attribute.
	 * @return fkey05a attribute
	 */
	public String getFkey05a() {
		return fkey05a.getValue();
	}

	/**
	 * Setter for fkey05a attribute.
	 * @param fkey05a the new value of fkey05a
	 */
	public void setFkey05a(String fkey05a) {
		this.fkey05a.setValue(fkey05a);
	}
	/**
	 * Gets the reference for attribute fkey05i.
	 * @return the fkey05i attribute reference
	 */
	public ElementaryRangeReference getFkey05iReference() {
		return fkey05i.getReference();
	}

	/**
	 * Getter for fkey05i attribute.
	 * @return fkey05i attribute
	 */
	public String getFkey05i() {
		return fkey05i.getValue();
	}

	/**
	 * Setter for fkey05i attribute.
	 * @param fkey05i the new value of fkey05i
	 */
	public void setFkey05i(String fkey05i) {
		this.fkey05i.setValue(fkey05i);
	}
	/**
	 * Gets the reference for attribute fkey12l.
	 * @return the fkey12l attribute reference
	 */
	public ElementaryRangeReference getFkey12lReference() {
		return fkey12l.getReference();
	}

	/**
	 * Getter for fkey12l attribute.
	 * @return fkey12l attribute
	 */
	public int getFkey12l() {
		return fkey12l.getValue();
	}

	/**
	 * Setter for fkey12l attribute.
	 * @param fkey12l the new value of fkey12l
	 */
	public void setFkey12l(int fkey12l) {
		this.fkey12l.setValue(fkey12l);
	}
	/**
	 * Gets the reference for attribute fkey12f.
	 * @return the fkey12f attribute reference
	 */
	public ElementaryRangeReference getFkey12fReference() {
		return fkey12f.getReference();
	}

	/**
	 * Getter for fkey12f attribute.
	 * @return fkey12f attribute
	 */
	public String getFkey12f() {
		return fkey12f.getValue();
	}

	/**
	 * Setter for fkey12f attribute.
	 * @param fkey12f the new value of fkey12f
	 */
	public void setFkey12f(String fkey12f) {
		this.fkey12f.setValue(fkey12f);
	}
	/**
	 * Gets the reference for attribute fkey12a.
	 * @return the fkey12a attribute reference
	 */
	public ElementaryRangeReference getFkey12aReference() {
		return fkey12a.getReference();
	}

	/**
	 * Getter for fkey12a attribute.
	 * @return fkey12a attribute
	 */
	public String getFkey12a() {
		return fkey12a.getValue();
	}

	/**
	 * Setter for fkey12a attribute.
	 * @param fkey12a the new value of fkey12a
	 */
	public void setFkey12a(String fkey12a) {
		this.fkey12a.setValue(fkey12a);
	}
	/**
	 * Gets the reference for attribute fkey12i.
	 * @return the fkey12i attribute reference
	 */
	public ElementaryRangeReference getFkey12iReference() {
		return fkey12i.getReference();
	}

	/**
	 * Getter for fkey12i attribute.
	 * @return fkey12i attribute
	 */
	public String getFkey12i() {
		return fkey12i.getValue();
	}

	/**
	 * Setter for fkey12i attribute.
	 * @param fkey12i the new value of fkey12i
	 */
	public void setFkey12i(String fkey12i) {
		this.fkey12i.setValue(fkey12i);
	}
	
	/**
	 * Gets the reference for attribute cactupao.
	 * @return the cactupao attribute reference
	 */
	public RangeReference getCactupaoReference() {
		return cactupao.getReference();
	}	
				
	/**
	 * Setter for cactupao .
	 */
   	public void setCactupao(RangeReference reference) {
       	cactupao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute opnyearc.
	 * @return the opnyearc attribute reference
	 */
	public ElementaryRangeReference getOpnyearcReference() {
		return opnyearc.getReference();
	}

	/**
	 * Getter for opnyearc attribute.
	 * @return opnyearc attribute
	 */
	public String getOpnyearc() {
		return opnyearc.getValue();
	}

	/**
	 * Setter for opnyearc attribute.
	 * @param opnyearc the new value of opnyearc
	 */
	public void setOpnyearc(String opnyearc) {
		this.opnyearc.setValue(opnyearc);
	}
	/**
	 * Gets the reference for attribute opnyearp.
	 * @return the opnyearp attribute reference
	 */
	public ElementaryRangeReference getOpnyearpReference() {
		return opnyearp.getReference();
	}

	/**
	 * Getter for opnyearp attribute.
	 * @return opnyearp attribute
	 */
	public String getOpnyearp() {
		return opnyearp.getValue();
	}

	/**
	 * Setter for opnyearp attribute.
	 * @param opnyearp the new value of opnyearp
	 */
	public void setOpnyearp(String opnyearp) {
		this.opnyearp.setValue(opnyearp);
	}
	/**
	 * Gets the reference for attribute opnyearh.
	 * @return the opnyearh attribute reference
	 */
	public ElementaryRangeReference getOpnyearhReference() {
		return opnyearh.getReference();
	}

	/**
	 * Getter for opnyearh attribute.
	 * @return opnyearh attribute
	 */
	public String getOpnyearh() {
		return opnyearh.getValue();
	}

	/**
	 * Setter for opnyearh attribute.
	 * @param opnyearh the new value of opnyearh
	 */
	public void setOpnyearh(String opnyearh) {
		this.opnyearh.setValue(opnyearh);
	}
	/**
	 * Gets the reference for attribute opnyearv.
	 * @return the opnyearv attribute reference
	 */
	public ElementaryRangeReference getOpnyearvReference() {
		return opnyearv.getReference();
	}

	/**
	 * Getter for opnyearv attribute.
	 * @return opnyearv attribute
	 */
	public String getOpnyearv() {
		return opnyearv.getValue();
	}

	/**
	 * Setter for opnyearv attribute.
	 * @param opnyearv the new value of opnyearv
	 */
	public void setOpnyearv(String opnyearv) {
		this.opnyearv.setValue(opnyearv);
	}
	/**
	 * Gets the reference for attribute opnyearo.
	 * @return the opnyearo attribute reference
	 */
	public ElementaryRangeReference getOpnyearoReference() {
		return opnyearo.getReference();
	}

	/**
	 * Getter for opnyearo attribute.
	 * @return opnyearo attribute
	 */
	public String getOpnyearo() {
		return opnyearo.getValue();
	}

	/**
	 * Setter for opnyearo attribute.
	 * @param opnyearo the new value of opnyearo
	 */
	public void setOpnyearo(String opnyearo) {
		this.opnyearo.setValue(opnyearo);
	}
	/**
	 * Gets the reference for attribute opnmonc.
	 * @return the opnmonc attribute reference
	 */
	public ElementaryRangeReference getOpnmoncReference() {
		return opnmonc.getReference();
	}

	/**
	 * Getter for opnmonc attribute.
	 * @return opnmonc attribute
	 */
	public String getOpnmonc() {
		return opnmonc.getValue();
	}

	/**
	 * Setter for opnmonc attribute.
	 * @param opnmonc the new value of opnmonc
	 */
	public void setOpnmonc(String opnmonc) {
		this.opnmonc.setValue(opnmonc);
	}
	/**
	 * Gets the reference for attribute opnmonp.
	 * @return the opnmonp attribute reference
	 */
	public ElementaryRangeReference getOpnmonpReference() {
		return opnmonp.getReference();
	}

	/**
	 * Getter for opnmonp attribute.
	 * @return opnmonp attribute
	 */
	public String getOpnmonp() {
		return opnmonp.getValue();
	}

	/**
	 * Setter for opnmonp attribute.
	 * @param opnmonp the new value of opnmonp
	 */
	public void setOpnmonp(String opnmonp) {
		this.opnmonp.setValue(opnmonp);
	}
	/**
	 * Gets the reference for attribute opnmonh.
	 * @return the opnmonh attribute reference
	 */
	public ElementaryRangeReference getOpnmonhReference() {
		return opnmonh.getReference();
	}

	/**
	 * Getter for opnmonh attribute.
	 * @return opnmonh attribute
	 */
	public String getOpnmonh() {
		return opnmonh.getValue();
	}

	/**
	 * Setter for opnmonh attribute.
	 * @param opnmonh the new value of opnmonh
	 */
	public void setOpnmonh(String opnmonh) {
		this.opnmonh.setValue(opnmonh);
	}
	/**
	 * Gets the reference for attribute opnmonv.
	 * @return the opnmonv attribute reference
	 */
	public ElementaryRangeReference getOpnmonvReference() {
		return opnmonv.getReference();
	}

	/**
	 * Getter for opnmonv attribute.
	 * @return opnmonv attribute
	 */
	public String getOpnmonv() {
		return opnmonv.getValue();
	}

	/**
	 * Setter for opnmonv attribute.
	 * @param opnmonv the new value of opnmonv
	 */
	public void setOpnmonv(String opnmonv) {
		this.opnmonv.setValue(opnmonv);
	}
	/**
	 * Gets the reference for attribute opnmono.
	 * @return the opnmono attribute reference
	 */
	public ElementaryRangeReference getOpnmonoReference() {
		return opnmono.getReference();
	}

	/**
	 * Getter for opnmono attribute.
	 * @return opnmono attribute
	 */
	public String getOpnmono() {
		return opnmono.getValue();
	}

	/**
	 * Setter for opnmono attribute.
	 * @param opnmono the new value of opnmono
	 */
	public void setOpnmono(String opnmono) {
		this.opnmono.setValue(opnmono);
	}
	/**
	 * Gets the reference for attribute opndayc.
	 * @return the opndayc attribute reference
	 */
	public ElementaryRangeReference getOpndaycReference() {
		return opndayc.getReference();
	}

	/**
	 * Getter for opndayc attribute.
	 * @return opndayc attribute
	 */
	public String getOpndayc() {
		return opndayc.getValue();
	}

	/**
	 * Setter for opndayc attribute.
	 * @param opndayc the new value of opndayc
	 */
	public void setOpndayc(String opndayc) {
		this.opndayc.setValue(opndayc);
	}
	/**
	 * Gets the reference for attribute opndayp.
	 * @return the opndayp attribute reference
	 */
	public ElementaryRangeReference getOpndaypReference() {
		return opndayp.getReference();
	}

	/**
	 * Getter for opndayp attribute.
	 * @return opndayp attribute
	 */
	public String getOpndayp() {
		return opndayp.getValue();
	}

	/**
	 * Setter for opndayp attribute.
	 * @param opndayp the new value of opndayp
	 */
	public void setOpndayp(String opndayp) {
		this.opndayp.setValue(opndayp);
	}
	/**
	 * Gets the reference for attribute opndayh.
	 * @return the opndayh attribute reference
	 */
	public ElementaryRangeReference getOpndayhReference() {
		return opndayh.getReference();
	}

	/**
	 * Getter for opndayh attribute.
	 * @return opndayh attribute
	 */
	public String getOpndayh() {
		return opndayh.getValue();
	}

	/**
	 * Setter for opndayh attribute.
	 * @param opndayh the new value of opndayh
	 */
	public void setOpndayh(String opndayh) {
		this.opndayh.setValue(opndayh);
	}
	/**
	 * Gets the reference for attribute opndayv.
	 * @return the opndayv attribute reference
	 */
	public ElementaryRangeReference getOpndayvReference() {
		return opndayv.getReference();
	}

	/**
	 * Getter for opndayv attribute.
	 * @return opndayv attribute
	 */
	public String getOpndayv() {
		return opndayv.getValue();
	}

	/**
	 * Setter for opndayv attribute.
	 * @param opndayv the new value of opndayv
	 */
	public void setOpndayv(String opndayv) {
		this.opndayv.setValue(opndayv);
	}
	/**
	 * Gets the reference for attribute opndayo.
	 * @return the opndayo attribute reference
	 */
	public ElementaryRangeReference getOpndayoReference() {
		return opndayo.getReference();
	}

	/**
	 * Getter for opndayo attribute.
	 * @return opndayo attribute
	 */
	public String getOpndayo() {
		return opndayo.getValue();
	}

	/**
	 * Setter for opndayo attribute.
	 * @param opndayo the new value of opndayo
	 */
	public void setOpndayo(String opndayo) {
		this.opndayo.setValue(opndayo);
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
	 * Gets the reference for attribute expdayc.
	 * @return the expdayc attribute reference
	 */
	public ElementaryRangeReference getExpdaycReference() {
		return expdayc.getReference();
	}

	/**
	 * Getter for expdayc attribute.
	 * @return expdayc attribute
	 */
	public String getExpdayc() {
		return expdayc.getValue();
	}

	/**
	 * Setter for expdayc attribute.
	 * @param expdayc the new value of expdayc
	 */
	public void setExpdayc(String expdayc) {
		this.expdayc.setValue(expdayc);
	}
	/**
	 * Gets the reference for attribute expdayp.
	 * @return the expdayp attribute reference
	 */
	public ElementaryRangeReference getExpdaypReference() {
		return expdayp.getReference();
	}

	/**
	 * Getter for expdayp attribute.
	 * @return expdayp attribute
	 */
	public String getExpdayp() {
		return expdayp.getValue();
	}

	/**
	 * Setter for expdayp attribute.
	 * @param expdayp the new value of expdayp
	 */
	public void setExpdayp(String expdayp) {
		this.expdayp.setValue(expdayp);
	}
	/**
	 * Gets the reference for attribute expdayh.
	 * @return the expdayh attribute reference
	 */
	public ElementaryRangeReference getExpdayhReference() {
		return expdayh.getReference();
	}

	/**
	 * Getter for expdayh attribute.
	 * @return expdayh attribute
	 */
	public String getExpdayh() {
		return expdayh.getValue();
	}

	/**
	 * Setter for expdayh attribute.
	 * @param expdayh the new value of expdayh
	 */
	public void setExpdayh(String expdayh) {
		this.expdayh.setValue(expdayh);
	}
	/**
	 * Gets the reference for attribute expdayv.
	 * @return the expdayv attribute reference
	 */
	public ElementaryRangeReference getExpdayvReference() {
		return expdayv.getReference();
	}

	/**
	 * Getter for expdayv attribute.
	 * @return expdayv attribute
	 */
	public String getExpdayv() {
		return expdayv.getValue();
	}

	/**
	 * Setter for expdayv attribute.
	 * @param expdayv the new value of expdayv
	 */
	public void setExpdayv(String expdayv) {
		this.expdayv.setValue(expdayv);
	}
	/**
	 * Gets the reference for attribute expdayo.
	 * @return the expdayo attribute reference
	 */
	public ElementaryRangeReference getExpdayoReference() {
		return expdayo.getReference();
	}

	/**
	 * Getter for expdayo attribute.
	 * @return expdayo attribute
	 */
	public String getExpdayo() {
		return expdayo.getValue();
	}

	/**
	 * Setter for expdayo attribute.
	 * @param expdayo the new value of expdayo
	 */
	public void setExpdayo(String expdayo) {
		this.expdayo.setValue(expdayo);
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
	 * Gets the reference for attribute risyearc.
	 * @return the risyearc attribute reference
	 */
	public ElementaryRangeReference getRisyearcReference() {
		return risyearc.getReference();
	}

	/**
	 * Getter for risyearc attribute.
	 * @return risyearc attribute
	 */
	public String getRisyearc() {
		return risyearc.getValue();
	}

	/**
	 * Setter for risyearc attribute.
	 * @param risyearc the new value of risyearc
	 */
	public void setRisyearc(String risyearc) {
		this.risyearc.setValue(risyearc);
	}
	/**
	 * Gets the reference for attribute risyearp.
	 * @return the risyearp attribute reference
	 */
	public ElementaryRangeReference getRisyearpReference() {
		return risyearp.getReference();
	}

	/**
	 * Getter for risyearp attribute.
	 * @return risyearp attribute
	 */
	public String getRisyearp() {
		return risyearp.getValue();
	}

	/**
	 * Setter for risyearp attribute.
	 * @param risyearp the new value of risyearp
	 */
	public void setRisyearp(String risyearp) {
		this.risyearp.setValue(risyearp);
	}
	/**
	 * Gets the reference for attribute risyearh.
	 * @return the risyearh attribute reference
	 */
	public ElementaryRangeReference getRisyearhReference() {
		return risyearh.getReference();
	}

	/**
	 * Getter for risyearh attribute.
	 * @return risyearh attribute
	 */
	public String getRisyearh() {
		return risyearh.getValue();
	}

	/**
	 * Setter for risyearh attribute.
	 * @param risyearh the new value of risyearh
	 */
	public void setRisyearh(String risyearh) {
		this.risyearh.setValue(risyearh);
	}
	/**
	 * Gets the reference for attribute risyearv.
	 * @return the risyearv attribute reference
	 */
	public ElementaryRangeReference getRisyearvReference() {
		return risyearv.getReference();
	}

	/**
	 * Getter for risyearv attribute.
	 * @return risyearv attribute
	 */
	public String getRisyearv() {
		return risyearv.getValue();
	}

	/**
	 * Setter for risyearv attribute.
	 * @param risyearv the new value of risyearv
	 */
	public void setRisyearv(String risyearv) {
		this.risyearv.setValue(risyearv);
	}
	/**
	 * Gets the reference for attribute risyearo.
	 * @return the risyearo attribute reference
	 */
	public ElementaryRangeReference getRisyearoReference() {
		return risyearo.getReference();
	}

	/**
	 * Getter for risyearo attribute.
	 * @return risyearo attribute
	 */
	public String getRisyearo() {
		return risyearo.getValue();
	}

	/**
	 * Setter for risyearo attribute.
	 * @param risyearo the new value of risyearo
	 */
	public void setRisyearo(String risyearo) {
		this.risyearo.setValue(risyearo);
	}
	/**
	 * Gets the reference for attribute rismonc.
	 * @return the rismonc attribute reference
	 */
	public ElementaryRangeReference getRismoncReference() {
		return rismonc.getReference();
	}

	/**
	 * Getter for rismonc attribute.
	 * @return rismonc attribute
	 */
	public String getRismonc() {
		return rismonc.getValue();
	}

	/**
	 * Setter for rismonc attribute.
	 * @param rismonc the new value of rismonc
	 */
	public void setRismonc(String rismonc) {
		this.rismonc.setValue(rismonc);
	}
	/**
	 * Gets the reference for attribute rismonp.
	 * @return the rismonp attribute reference
	 */
	public ElementaryRangeReference getRismonpReference() {
		return rismonp.getReference();
	}

	/**
	 * Getter for rismonp attribute.
	 * @return rismonp attribute
	 */
	public String getRismonp() {
		return rismonp.getValue();
	}

	/**
	 * Setter for rismonp attribute.
	 * @param rismonp the new value of rismonp
	 */
	public void setRismonp(String rismonp) {
		this.rismonp.setValue(rismonp);
	}
	/**
	 * Gets the reference for attribute rismonh.
	 * @return the rismonh attribute reference
	 */
	public ElementaryRangeReference getRismonhReference() {
		return rismonh.getReference();
	}

	/**
	 * Getter for rismonh attribute.
	 * @return rismonh attribute
	 */
	public String getRismonh() {
		return rismonh.getValue();
	}

	/**
	 * Setter for rismonh attribute.
	 * @param rismonh the new value of rismonh
	 */
	public void setRismonh(String rismonh) {
		this.rismonh.setValue(rismonh);
	}
	/**
	 * Gets the reference for attribute rismonv.
	 * @return the rismonv attribute reference
	 */
	public ElementaryRangeReference getRismonvReference() {
		return rismonv.getReference();
	}

	/**
	 * Getter for rismonv attribute.
	 * @return rismonv attribute
	 */
	public String getRismonv() {
		return rismonv.getValue();
	}

	/**
	 * Setter for rismonv attribute.
	 * @param rismonv the new value of rismonv
	 */
	public void setRismonv(String rismonv) {
		this.rismonv.setValue(rismonv);
	}
	/**
	 * Gets the reference for attribute rismono.
	 * @return the rismono attribute reference
	 */
	public ElementaryRangeReference getRismonoReference() {
		return rismono.getReference();
	}

	/**
	 * Getter for rismono attribute.
	 * @return rismono attribute
	 */
	public String getRismono() {
		return rismono.getValue();
	}

	/**
	 * Setter for rismono attribute.
	 * @param rismono the new value of rismono
	 */
	public void setRismono(String rismono) {
		this.rismono.setValue(rismono);
	}
	/**
	 * Gets the reference for attribute risdayc.
	 * @return the risdayc attribute reference
	 */
	public ElementaryRangeReference getRisdaycReference() {
		return risdayc.getReference();
	}

	/**
	 * Getter for risdayc attribute.
	 * @return risdayc attribute
	 */
	public String getRisdayc() {
		return risdayc.getValue();
	}

	/**
	 * Setter for risdayc attribute.
	 * @param risdayc the new value of risdayc
	 */
	public void setRisdayc(String risdayc) {
		this.risdayc.setValue(risdayc);
	}
	/**
	 * Gets the reference for attribute risdayp.
	 * @return the risdayp attribute reference
	 */
	public ElementaryRangeReference getRisdaypReference() {
		return risdayp.getReference();
	}

	/**
	 * Getter for risdayp attribute.
	 * @return risdayp attribute
	 */
	public String getRisdayp() {
		return risdayp.getValue();
	}

	/**
	 * Setter for risdayp attribute.
	 * @param risdayp the new value of risdayp
	 */
	public void setRisdayp(String risdayp) {
		this.risdayp.setValue(risdayp);
	}
	/**
	 * Gets the reference for attribute risdayh.
	 * @return the risdayh attribute reference
	 */
	public ElementaryRangeReference getRisdayhReference() {
		return risdayh.getReference();
	}

	/**
	 * Getter for risdayh attribute.
	 * @return risdayh attribute
	 */
	public String getRisdayh() {
		return risdayh.getValue();
	}

	/**
	 * Setter for risdayh attribute.
	 * @param risdayh the new value of risdayh
	 */
	public void setRisdayh(String risdayh) {
		this.risdayh.setValue(risdayh);
	}
	/**
	 * Gets the reference for attribute risdayv.
	 * @return the risdayv attribute reference
	 */
	public ElementaryRangeReference getRisdayvReference() {
		return risdayv.getReference();
	}

	/**
	 * Getter for risdayv attribute.
	 * @return risdayv attribute
	 */
	public String getRisdayv() {
		return risdayv.getValue();
	}

	/**
	 * Setter for risdayv attribute.
	 * @param risdayv the new value of risdayv
	 */
	public void setRisdayv(String risdayv) {
		this.risdayv.setValue(risdayv);
	}
	/**
	 * Gets the reference for attribute risdayo.
	 * @return the risdayo attribute reference
	 */
	public ElementaryRangeReference getRisdayoReference() {
		return risdayo.getReference();
	}

	/**
	 * Getter for risdayo attribute.
	 * @return risdayo attribute
	 */
	public String getRisdayo() {
		return risdayo.getValue();
	}

	/**
	 * Setter for risdayo attribute.
	 * @param risdayo the new value of risdayo
	 */
	public void setRisdayo(String risdayo) {
		this.risdayo.setValue(risdayo);
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
	 * Gets the reference for attribute actssn1c.
	 * @return the actssn1c attribute reference
	 */
	public ElementaryRangeReference getActssn1cReference() {
		return actssn1c.getReference();
	}

	/**
	 * Getter for actssn1c attribute.
	 * @return actssn1c attribute
	 */
	public String getActssn1c() {
		return actssn1c.getValue();
	}

	/**
	 * Setter for actssn1c attribute.
	 * @param actssn1c the new value of actssn1c
	 */
	public void setActssn1c(String actssn1c) {
		this.actssn1c.setValue(actssn1c);
	}
	/**
	 * Gets the reference for attribute actssn1p.
	 * @return the actssn1p attribute reference
	 */
	public ElementaryRangeReference getActssn1pReference() {
		return actssn1p.getReference();
	}

	/**
	 * Getter for actssn1p attribute.
	 * @return actssn1p attribute
	 */
	public String getActssn1p() {
		return actssn1p.getValue();
	}

	/**
	 * Setter for actssn1p attribute.
	 * @param actssn1p the new value of actssn1p
	 */
	public void setActssn1p(String actssn1p) {
		this.actssn1p.setValue(actssn1p);
	}
	/**
	 * Gets the reference for attribute actssn1h.
	 * @return the actssn1h attribute reference
	 */
	public ElementaryRangeReference getActssn1hReference() {
		return actssn1h.getReference();
	}

	/**
	 * Getter for actssn1h attribute.
	 * @return actssn1h attribute
	 */
	public String getActssn1h() {
		return actssn1h.getValue();
	}

	/**
	 * Setter for actssn1h attribute.
	 * @param actssn1h the new value of actssn1h
	 */
	public void setActssn1h(String actssn1h) {
		this.actssn1h.setValue(actssn1h);
	}
	/**
	 * Gets the reference for attribute actssn1v.
	 * @return the actssn1v attribute reference
	 */
	public ElementaryRangeReference getActssn1vReference() {
		return actssn1v.getReference();
	}

	/**
	 * Getter for actssn1v attribute.
	 * @return actssn1v attribute
	 */
	public String getActssn1v() {
		return actssn1v.getValue();
	}

	/**
	 * Setter for actssn1v attribute.
	 * @param actssn1v the new value of actssn1v
	 */
	public void setActssn1v(String actssn1v) {
		this.actssn1v.setValue(actssn1v);
	}
	/**
	 * Gets the reference for attribute actssn1o.
	 * @return the actssn1o attribute reference
	 */
	public ElementaryRangeReference getActssn1oReference() {
		return actssn1o.getReference();
	}

	/**
	 * Getter for actssn1o attribute.
	 * @return actssn1o attribute
	 */
	public String getActssn1o() {
		return actssn1o.getValue();
	}

	/**
	 * Setter for actssn1o attribute.
	 * @param actssn1o the new value of actssn1o
	 */
	public void setActssn1o(String actssn1o) {
		this.actssn1o.setValue(actssn1o);
	}
	/**
	 * Gets the reference for attribute actssn2c.
	 * @return the actssn2c attribute reference
	 */
	public ElementaryRangeReference getActssn2cReference() {
		return actssn2c.getReference();
	}

	/**
	 * Getter for actssn2c attribute.
	 * @return actssn2c attribute
	 */
	public String getActssn2c() {
		return actssn2c.getValue();
	}

	/**
	 * Setter for actssn2c attribute.
	 * @param actssn2c the new value of actssn2c
	 */
	public void setActssn2c(String actssn2c) {
		this.actssn2c.setValue(actssn2c);
	}
	/**
	 * Gets the reference for attribute actssn2p.
	 * @return the actssn2p attribute reference
	 */
	public ElementaryRangeReference getActssn2pReference() {
		return actssn2p.getReference();
	}

	/**
	 * Getter for actssn2p attribute.
	 * @return actssn2p attribute
	 */
	public String getActssn2p() {
		return actssn2p.getValue();
	}

	/**
	 * Setter for actssn2p attribute.
	 * @param actssn2p the new value of actssn2p
	 */
	public void setActssn2p(String actssn2p) {
		this.actssn2p.setValue(actssn2p);
	}
	/**
	 * Gets the reference for attribute actssn2h.
	 * @return the actssn2h attribute reference
	 */
	public ElementaryRangeReference getActssn2hReference() {
		return actssn2h.getReference();
	}

	/**
	 * Getter for actssn2h attribute.
	 * @return actssn2h attribute
	 */
	public String getActssn2h() {
		return actssn2h.getValue();
	}

	/**
	 * Setter for actssn2h attribute.
	 * @param actssn2h the new value of actssn2h
	 */
	public void setActssn2h(String actssn2h) {
		this.actssn2h.setValue(actssn2h);
	}
	/**
	 * Gets the reference for attribute actssn2v.
	 * @return the actssn2v attribute reference
	 */
	public ElementaryRangeReference getActssn2vReference() {
		return actssn2v.getReference();
	}

	/**
	 * Getter for actssn2v attribute.
	 * @return actssn2v attribute
	 */
	public String getActssn2v() {
		return actssn2v.getValue();
	}

	/**
	 * Setter for actssn2v attribute.
	 * @param actssn2v the new value of actssn2v
	 */
	public void setActssn2v(String actssn2v) {
		this.actssn2v.setValue(actssn2v);
	}
	/**
	 * Gets the reference for attribute actssn2o.
	 * @return the actssn2o attribute reference
	 */
	public ElementaryRangeReference getActssn2oReference() {
		return actssn2o.getReference();
	}

	/**
	 * Getter for actssn2o attribute.
	 * @return actssn2o attribute
	 */
	public String getActssn2o() {
		return actssn2o.getValue();
	}

	/**
	 * Setter for actssn2o attribute.
	 * @param actssn2o the new value of actssn2o
	 */
	public void setActssn2o(String actssn2o) {
		this.actssn2o.setValue(actssn2o);
	}
	/**
	 * Gets the reference for attribute actssn3c.
	 * @return the actssn3c attribute reference
	 */
	public ElementaryRangeReference getActssn3cReference() {
		return actssn3c.getReference();
	}

	/**
	 * Getter for actssn3c attribute.
	 * @return actssn3c attribute
	 */
	public String getActssn3c() {
		return actssn3c.getValue();
	}

	/**
	 * Setter for actssn3c attribute.
	 * @param actssn3c the new value of actssn3c
	 */
	public void setActssn3c(String actssn3c) {
		this.actssn3c.setValue(actssn3c);
	}
	/**
	 * Gets the reference for attribute actssn3p.
	 * @return the actssn3p attribute reference
	 */
	public ElementaryRangeReference getActssn3pReference() {
		return actssn3p.getReference();
	}

	/**
	 * Getter for actssn3p attribute.
	 * @return actssn3p attribute
	 */
	public String getActssn3p() {
		return actssn3p.getValue();
	}

	/**
	 * Setter for actssn3p attribute.
	 * @param actssn3p the new value of actssn3p
	 */
	public void setActssn3p(String actssn3p) {
		this.actssn3p.setValue(actssn3p);
	}
	/**
	 * Gets the reference for attribute actssn3h.
	 * @return the actssn3h attribute reference
	 */
	public ElementaryRangeReference getActssn3hReference() {
		return actssn3h.getReference();
	}

	/**
	 * Getter for actssn3h attribute.
	 * @return actssn3h attribute
	 */
	public String getActssn3h() {
		return actssn3h.getValue();
	}

	/**
	 * Setter for actssn3h attribute.
	 * @param actssn3h the new value of actssn3h
	 */
	public void setActssn3h(String actssn3h) {
		this.actssn3h.setValue(actssn3h);
	}
	/**
	 * Gets the reference for attribute actssn3v.
	 * @return the actssn3v attribute reference
	 */
	public ElementaryRangeReference getActssn3vReference() {
		return actssn3v.getReference();
	}

	/**
	 * Getter for actssn3v attribute.
	 * @return actssn3v attribute
	 */
	public String getActssn3v() {
		return actssn3v.getValue();
	}

	/**
	 * Setter for actssn3v attribute.
	 * @param actssn3v the new value of actssn3v
	 */
	public void setActssn3v(String actssn3v) {
		this.actssn3v.setValue(actssn3v);
	}
	/**
	 * Gets the reference for attribute actssn3o.
	 * @return the actssn3o attribute reference
	 */
	public ElementaryRangeReference getActssn3oReference() {
		return actssn3o.getReference();
	}

	/**
	 * Getter for actssn3o attribute.
	 * @return actssn3o attribute
	 */
	public String getActssn3o() {
		return actssn3o.getValue();
	}

	/**
	 * Setter for actssn3o attribute.
	 * @param actssn3o the new value of actssn3o
	 */
	public void setActssn3o(String actssn3o) {
		this.actssn3o.setValue(actssn3o);
	}
	/**
	 * Gets the reference for attribute dobyearc.
	 * @return the dobyearc attribute reference
	 */
	public ElementaryRangeReference getDobyearcReference() {
		return dobyearc.getReference();
	}

	/**
	 * Getter for dobyearc attribute.
	 * @return dobyearc attribute
	 */
	public String getDobyearc() {
		return dobyearc.getValue();
	}

	/**
	 * Setter for dobyearc attribute.
	 * @param dobyearc the new value of dobyearc
	 */
	public void setDobyearc(String dobyearc) {
		this.dobyearc.setValue(dobyearc);
	}
	/**
	 * Gets the reference for attribute dobyearp.
	 * @return the dobyearp attribute reference
	 */
	public ElementaryRangeReference getDobyearpReference() {
		return dobyearp.getReference();
	}

	/**
	 * Getter for dobyearp attribute.
	 * @return dobyearp attribute
	 */
	public String getDobyearp() {
		return dobyearp.getValue();
	}

	/**
	 * Setter for dobyearp attribute.
	 * @param dobyearp the new value of dobyearp
	 */
	public void setDobyearp(String dobyearp) {
		this.dobyearp.setValue(dobyearp);
	}
	/**
	 * Gets the reference for attribute dobyearh.
	 * @return the dobyearh attribute reference
	 */
	public ElementaryRangeReference getDobyearhReference() {
		return dobyearh.getReference();
	}

	/**
	 * Getter for dobyearh attribute.
	 * @return dobyearh attribute
	 */
	public String getDobyearh() {
		return dobyearh.getValue();
	}

	/**
	 * Setter for dobyearh attribute.
	 * @param dobyearh the new value of dobyearh
	 */
	public void setDobyearh(String dobyearh) {
		this.dobyearh.setValue(dobyearh);
	}
	/**
	 * Gets the reference for attribute dobyearv.
	 * @return the dobyearv attribute reference
	 */
	public ElementaryRangeReference getDobyearvReference() {
		return dobyearv.getReference();
	}

	/**
	 * Getter for dobyearv attribute.
	 * @return dobyearv attribute
	 */
	public String getDobyearv() {
		return dobyearv.getValue();
	}

	/**
	 * Setter for dobyearv attribute.
	 * @param dobyearv the new value of dobyearv
	 */
	public void setDobyearv(String dobyearv) {
		this.dobyearv.setValue(dobyearv);
	}
	/**
	 * Gets the reference for attribute dobyearo.
	 * @return the dobyearo attribute reference
	 */
	public ElementaryRangeReference getDobyearoReference() {
		return dobyearo.getReference();
	}

	/**
	 * Getter for dobyearo attribute.
	 * @return dobyearo attribute
	 */
	public String getDobyearo() {
		return dobyearo.getValue();
	}

	/**
	 * Setter for dobyearo attribute.
	 * @param dobyearo the new value of dobyearo
	 */
	public void setDobyearo(String dobyearo) {
		this.dobyearo.setValue(dobyearo);
	}
	/**
	 * Gets the reference for attribute dobmonc.
	 * @return the dobmonc attribute reference
	 */
	public ElementaryRangeReference getDobmoncReference() {
		return dobmonc.getReference();
	}

	/**
	 * Getter for dobmonc attribute.
	 * @return dobmonc attribute
	 */
	public String getDobmonc() {
		return dobmonc.getValue();
	}

	/**
	 * Setter for dobmonc attribute.
	 * @param dobmonc the new value of dobmonc
	 */
	public void setDobmonc(String dobmonc) {
		this.dobmonc.setValue(dobmonc);
	}
	/**
	 * Gets the reference for attribute dobmonp.
	 * @return the dobmonp attribute reference
	 */
	public ElementaryRangeReference getDobmonpReference() {
		return dobmonp.getReference();
	}

	/**
	 * Getter for dobmonp attribute.
	 * @return dobmonp attribute
	 */
	public String getDobmonp() {
		return dobmonp.getValue();
	}

	/**
	 * Setter for dobmonp attribute.
	 * @param dobmonp the new value of dobmonp
	 */
	public void setDobmonp(String dobmonp) {
		this.dobmonp.setValue(dobmonp);
	}
	/**
	 * Gets the reference for attribute dobmonh.
	 * @return the dobmonh attribute reference
	 */
	public ElementaryRangeReference getDobmonhReference() {
		return dobmonh.getReference();
	}

	/**
	 * Getter for dobmonh attribute.
	 * @return dobmonh attribute
	 */
	public String getDobmonh() {
		return dobmonh.getValue();
	}

	/**
	 * Setter for dobmonh attribute.
	 * @param dobmonh the new value of dobmonh
	 */
	public void setDobmonh(String dobmonh) {
		this.dobmonh.setValue(dobmonh);
	}
	/**
	 * Gets the reference for attribute dobmonv.
	 * @return the dobmonv attribute reference
	 */
	public ElementaryRangeReference getDobmonvReference() {
		return dobmonv.getReference();
	}

	/**
	 * Getter for dobmonv attribute.
	 * @return dobmonv attribute
	 */
	public String getDobmonv() {
		return dobmonv.getValue();
	}

	/**
	 * Setter for dobmonv attribute.
	 * @param dobmonv the new value of dobmonv
	 */
	public void setDobmonv(String dobmonv) {
		this.dobmonv.setValue(dobmonv);
	}
	/**
	 * Gets the reference for attribute dobmono.
	 * @return the dobmono attribute reference
	 */
	public ElementaryRangeReference getDobmonoReference() {
		return dobmono.getReference();
	}

	/**
	 * Getter for dobmono attribute.
	 * @return dobmono attribute
	 */
	public String getDobmono() {
		return dobmono.getValue();
	}

	/**
	 * Setter for dobmono attribute.
	 * @param dobmono the new value of dobmono
	 */
	public void setDobmono(String dobmono) {
		this.dobmono.setValue(dobmono);
	}
	/**
	 * Gets the reference for attribute dobdayc.
	 * @return the dobdayc attribute reference
	 */
	public ElementaryRangeReference getDobdaycReference() {
		return dobdayc.getReference();
	}

	/**
	 * Getter for dobdayc attribute.
	 * @return dobdayc attribute
	 */
	public String getDobdayc() {
		return dobdayc.getValue();
	}

	/**
	 * Setter for dobdayc attribute.
	 * @param dobdayc the new value of dobdayc
	 */
	public void setDobdayc(String dobdayc) {
		this.dobdayc.setValue(dobdayc);
	}
	/**
	 * Gets the reference for attribute dobdayp.
	 * @return the dobdayp attribute reference
	 */
	public ElementaryRangeReference getDobdaypReference() {
		return dobdayp.getReference();
	}

	/**
	 * Getter for dobdayp attribute.
	 * @return dobdayp attribute
	 */
	public String getDobdayp() {
		return dobdayp.getValue();
	}

	/**
	 * Setter for dobdayp attribute.
	 * @param dobdayp the new value of dobdayp
	 */
	public void setDobdayp(String dobdayp) {
		this.dobdayp.setValue(dobdayp);
	}
	/**
	 * Gets the reference for attribute dobdayh.
	 * @return the dobdayh attribute reference
	 */
	public ElementaryRangeReference getDobdayhReference() {
		return dobdayh.getReference();
	}

	/**
	 * Getter for dobdayh attribute.
	 * @return dobdayh attribute
	 */
	public String getDobdayh() {
		return dobdayh.getValue();
	}

	/**
	 * Setter for dobdayh attribute.
	 * @param dobdayh the new value of dobdayh
	 */
	public void setDobdayh(String dobdayh) {
		this.dobdayh.setValue(dobdayh);
	}
	/**
	 * Gets the reference for attribute dobdayv.
	 * @return the dobdayv attribute reference
	 */
	public ElementaryRangeReference getDobdayvReference() {
		return dobdayv.getReference();
	}

	/**
	 * Getter for dobdayv attribute.
	 * @return dobdayv attribute
	 */
	public String getDobdayv() {
		return dobdayv.getValue();
	}

	/**
	 * Setter for dobdayv attribute.
	 * @param dobdayv the new value of dobdayv
	 */
	public void setDobdayv(String dobdayv) {
		this.dobdayv.setValue(dobdayv);
	}
	/**
	 * Gets the reference for attribute dobdayo.
	 * @return the dobdayo attribute reference
	 */
	public ElementaryRangeReference getDobdayoReference() {
		return dobdayo.getReference();
	}

	/**
	 * Getter for dobdayo attribute.
	 * @return dobdayo attribute
	 */
	public String getDobdayo() {
		return dobdayo.getValue();
	}

	/**
	 * Setter for dobdayo attribute.
	 * @param dobdayo the new value of dobdayo
	 */
	public void setDobdayo(String dobdayo) {
		this.dobdayo.setValue(dobdayo);
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
	 * Gets the reference for attribute acsph1ac.
	 * @return the acsph1ac attribute reference
	 */
	public ElementaryRangeReference getAcsph1acReference() {
		return acsph1ac.getReference();
	}

	/**
	 * Getter for acsph1ac attribute.
	 * @return acsph1ac attribute
	 */
	public String getAcsph1ac() {
		return acsph1ac.getValue();
	}

	/**
	 * Setter for acsph1ac attribute.
	 * @param acsph1ac the new value of acsph1ac
	 */
	public void setAcsph1ac(String acsph1ac) {
		this.acsph1ac.setValue(acsph1ac);
	}
	/**
	 * Gets the reference for attribute acsph1ap.
	 * @return the acsph1ap attribute reference
	 */
	public ElementaryRangeReference getAcsph1apReference() {
		return acsph1ap.getReference();
	}

	/**
	 * Getter for acsph1ap attribute.
	 * @return acsph1ap attribute
	 */
	public String getAcsph1ap() {
		return acsph1ap.getValue();
	}

	/**
	 * Setter for acsph1ap attribute.
	 * @param acsph1ap the new value of acsph1ap
	 */
	public void setAcsph1ap(String acsph1ap) {
		this.acsph1ap.setValue(acsph1ap);
	}
	/**
	 * Gets the reference for attribute acsph1ah.
	 * @return the acsph1ah attribute reference
	 */
	public ElementaryRangeReference getAcsph1ahReference() {
		return acsph1ah.getReference();
	}

	/**
	 * Getter for acsph1ah attribute.
	 * @return acsph1ah attribute
	 */
	public String getAcsph1ah() {
		return acsph1ah.getValue();
	}

	/**
	 * Setter for acsph1ah attribute.
	 * @param acsph1ah the new value of acsph1ah
	 */
	public void setAcsph1ah(String acsph1ah) {
		this.acsph1ah.setValue(acsph1ah);
	}
	/**
	 * Gets the reference for attribute acsph1av.
	 * @return the acsph1av attribute reference
	 */
	public ElementaryRangeReference getAcsph1avReference() {
		return acsph1av.getReference();
	}

	/**
	 * Getter for acsph1av attribute.
	 * @return acsph1av attribute
	 */
	public String getAcsph1av() {
		return acsph1av.getValue();
	}

	/**
	 * Setter for acsph1av attribute.
	 * @param acsph1av the new value of acsph1av
	 */
	public void setAcsph1av(String acsph1av) {
		this.acsph1av.setValue(acsph1av);
	}
	/**
	 * Gets the reference for attribute acsph1ao.
	 * @return the acsph1ao attribute reference
	 */
	public ElementaryRangeReference getAcsph1aoReference() {
		return acsph1ao.getReference();
	}

	/**
	 * Getter for acsph1ao attribute.
	 * @return acsph1ao attribute
	 */
	public String getAcsph1ao() {
		return acsph1ao.getValue();
	}

	/**
	 * Setter for acsph1ao attribute.
	 * @param acsph1ao the new value of acsph1ao
	 */
	public void setAcsph1ao(String acsph1ao) {
		this.acsph1ao.setValue(acsph1ao);
	}
	/**
	 * Gets the reference for attribute acsph1bc.
	 * @return the acsph1bc attribute reference
	 */
	public ElementaryRangeReference getAcsph1bcReference() {
		return acsph1bc.getReference();
	}

	/**
	 * Getter for acsph1bc attribute.
	 * @return acsph1bc attribute
	 */
	public String getAcsph1bc() {
		return acsph1bc.getValue();
	}

	/**
	 * Setter for acsph1bc attribute.
	 * @param acsph1bc the new value of acsph1bc
	 */
	public void setAcsph1bc(String acsph1bc) {
		this.acsph1bc.setValue(acsph1bc);
	}
	/**
	 * Gets the reference for attribute acsph1bp.
	 * @return the acsph1bp attribute reference
	 */
	public ElementaryRangeReference getAcsph1bpReference() {
		return acsph1bp.getReference();
	}

	/**
	 * Getter for acsph1bp attribute.
	 * @return acsph1bp attribute
	 */
	public String getAcsph1bp() {
		return acsph1bp.getValue();
	}

	/**
	 * Setter for acsph1bp attribute.
	 * @param acsph1bp the new value of acsph1bp
	 */
	public void setAcsph1bp(String acsph1bp) {
		this.acsph1bp.setValue(acsph1bp);
	}
	/**
	 * Gets the reference for attribute acsph1bh.
	 * @return the acsph1bh attribute reference
	 */
	public ElementaryRangeReference getAcsph1bhReference() {
		return acsph1bh.getReference();
	}

	/**
	 * Getter for acsph1bh attribute.
	 * @return acsph1bh attribute
	 */
	public String getAcsph1bh() {
		return acsph1bh.getValue();
	}

	/**
	 * Setter for acsph1bh attribute.
	 * @param acsph1bh the new value of acsph1bh
	 */
	public void setAcsph1bh(String acsph1bh) {
		this.acsph1bh.setValue(acsph1bh);
	}
	/**
	 * Gets the reference for attribute acsph1bv.
	 * @return the acsph1bv attribute reference
	 */
	public ElementaryRangeReference getAcsph1bvReference() {
		return acsph1bv.getReference();
	}

	/**
	 * Getter for acsph1bv attribute.
	 * @return acsph1bv attribute
	 */
	public String getAcsph1bv() {
		return acsph1bv.getValue();
	}

	/**
	 * Setter for acsph1bv attribute.
	 * @param acsph1bv the new value of acsph1bv
	 */
	public void setAcsph1bv(String acsph1bv) {
		this.acsph1bv.setValue(acsph1bv);
	}
	/**
	 * Gets the reference for attribute acsph1bo.
	 * @return the acsph1bo attribute reference
	 */
	public ElementaryRangeReference getAcsph1boReference() {
		return acsph1bo.getReference();
	}

	/**
	 * Getter for acsph1bo attribute.
	 * @return acsph1bo attribute
	 */
	public String getAcsph1bo() {
		return acsph1bo.getValue();
	}

	/**
	 * Setter for acsph1bo attribute.
	 * @param acsph1bo the new value of acsph1bo
	 */
	public void setAcsph1bo(String acsph1bo) {
		this.acsph1bo.setValue(acsph1bo);
	}
	/**
	 * Gets the reference for attribute acsph1cc.
	 * @return the acsph1cc attribute reference
	 */
	public ElementaryRangeReference getAcsph1ccReference() {
		return acsph1cc.getReference();
	}

	/**
	 * Getter for acsph1cc attribute.
	 * @return acsph1cc attribute
	 */
	public String getAcsph1cc() {
		return acsph1cc.getValue();
	}

	/**
	 * Setter for acsph1cc attribute.
	 * @param acsph1cc the new value of acsph1cc
	 */
	public void setAcsph1cc(String acsph1cc) {
		this.acsph1cc.setValue(acsph1cc);
	}
	/**
	 * Gets the reference for attribute acsph1cp.
	 * @return the acsph1cp attribute reference
	 */
	public ElementaryRangeReference getAcsph1cpReference() {
		return acsph1cp.getReference();
	}

	/**
	 * Getter for acsph1cp attribute.
	 * @return acsph1cp attribute
	 */
	public String getAcsph1cp() {
		return acsph1cp.getValue();
	}

	/**
	 * Setter for acsph1cp attribute.
	 * @param acsph1cp the new value of acsph1cp
	 */
	public void setAcsph1cp(String acsph1cp) {
		this.acsph1cp.setValue(acsph1cp);
	}
	/**
	 * Gets the reference for attribute acsph1ch.
	 * @return the acsph1ch attribute reference
	 */
	public ElementaryRangeReference getAcsph1chReference() {
		return acsph1ch.getReference();
	}

	/**
	 * Getter for acsph1ch attribute.
	 * @return acsph1ch attribute
	 */
	public String getAcsph1ch() {
		return acsph1ch.getValue();
	}

	/**
	 * Setter for acsph1ch attribute.
	 * @param acsph1ch the new value of acsph1ch
	 */
	public void setAcsph1ch(String acsph1ch) {
		this.acsph1ch.setValue(acsph1ch);
	}
	/**
	 * Gets the reference for attribute acsph1cv.
	 * @return the acsph1cv attribute reference
	 */
	public ElementaryRangeReference getAcsph1cvReference() {
		return acsph1cv.getReference();
	}

	/**
	 * Getter for acsph1cv attribute.
	 * @return acsph1cv attribute
	 */
	public String getAcsph1cv() {
		return acsph1cv.getValue();
	}

	/**
	 * Setter for acsph1cv attribute.
	 * @param acsph1cv the new value of acsph1cv
	 */
	public void setAcsph1cv(String acsph1cv) {
		this.acsph1cv.setValue(acsph1cv);
	}
	/**
	 * Gets the reference for attribute acsph1co.
	 * @return the acsph1co attribute reference
	 */
	public ElementaryRangeReference getAcsph1coReference() {
		return acsph1co.getReference();
	}

	/**
	 * Getter for acsph1co attribute.
	 * @return acsph1co attribute
	 */
	public String getAcsph1co() {
		return acsph1co.getValue();
	}

	/**
	 * Setter for acsph1co attribute.
	 * @param acsph1co the new value of acsph1co
	 */
	public void setAcsph1co(String acsph1co) {
		this.acsph1co.setValue(acsph1co);
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
	 * Gets the reference for attribute acsph2ac.
	 * @return the acsph2ac attribute reference
	 */
	public ElementaryRangeReference getAcsph2acReference() {
		return acsph2ac.getReference();
	}

	/**
	 * Getter for acsph2ac attribute.
	 * @return acsph2ac attribute
	 */
	public String getAcsph2ac() {
		return acsph2ac.getValue();
	}

	/**
	 * Setter for acsph2ac attribute.
	 * @param acsph2ac the new value of acsph2ac
	 */
	public void setAcsph2ac(String acsph2ac) {
		this.acsph2ac.setValue(acsph2ac);
	}
	/**
	 * Gets the reference for attribute acsph2ap.
	 * @return the acsph2ap attribute reference
	 */
	public ElementaryRangeReference getAcsph2apReference() {
		return acsph2ap.getReference();
	}

	/**
	 * Getter for acsph2ap attribute.
	 * @return acsph2ap attribute
	 */
	public String getAcsph2ap() {
		return acsph2ap.getValue();
	}

	/**
	 * Setter for acsph2ap attribute.
	 * @param acsph2ap the new value of acsph2ap
	 */
	public void setAcsph2ap(String acsph2ap) {
		this.acsph2ap.setValue(acsph2ap);
	}
	/**
	 * Gets the reference for attribute acsph2ah.
	 * @return the acsph2ah attribute reference
	 */
	public ElementaryRangeReference getAcsph2ahReference() {
		return acsph2ah.getReference();
	}

	/**
	 * Getter for acsph2ah attribute.
	 * @return acsph2ah attribute
	 */
	public String getAcsph2ah() {
		return acsph2ah.getValue();
	}

	/**
	 * Setter for acsph2ah attribute.
	 * @param acsph2ah the new value of acsph2ah
	 */
	public void setAcsph2ah(String acsph2ah) {
		this.acsph2ah.setValue(acsph2ah);
	}
	/**
	 * Gets the reference for attribute acsph2av.
	 * @return the acsph2av attribute reference
	 */
	public ElementaryRangeReference getAcsph2avReference() {
		return acsph2av.getReference();
	}

	/**
	 * Getter for acsph2av attribute.
	 * @return acsph2av attribute
	 */
	public String getAcsph2av() {
		return acsph2av.getValue();
	}

	/**
	 * Setter for acsph2av attribute.
	 * @param acsph2av the new value of acsph2av
	 */
	public void setAcsph2av(String acsph2av) {
		this.acsph2av.setValue(acsph2av);
	}
	/**
	 * Gets the reference for attribute acsph2ao.
	 * @return the acsph2ao attribute reference
	 */
	public ElementaryRangeReference getAcsph2aoReference() {
		return acsph2ao.getReference();
	}

	/**
	 * Getter for acsph2ao attribute.
	 * @return acsph2ao attribute
	 */
	public String getAcsph2ao() {
		return acsph2ao.getValue();
	}

	/**
	 * Setter for acsph2ao attribute.
	 * @param acsph2ao the new value of acsph2ao
	 */
	public void setAcsph2ao(String acsph2ao) {
		this.acsph2ao.setValue(acsph2ao);
	}
	/**
	 * Gets the reference for attribute acsph2bc.
	 * @return the acsph2bc attribute reference
	 */
	public ElementaryRangeReference getAcsph2bcReference() {
		return acsph2bc.getReference();
	}

	/**
	 * Getter for acsph2bc attribute.
	 * @return acsph2bc attribute
	 */
	public String getAcsph2bc() {
		return acsph2bc.getValue();
	}

	/**
	 * Setter for acsph2bc attribute.
	 * @param acsph2bc the new value of acsph2bc
	 */
	public void setAcsph2bc(String acsph2bc) {
		this.acsph2bc.setValue(acsph2bc);
	}
	/**
	 * Gets the reference for attribute acsph2bp.
	 * @return the acsph2bp attribute reference
	 */
	public ElementaryRangeReference getAcsph2bpReference() {
		return acsph2bp.getReference();
	}

	/**
	 * Getter for acsph2bp attribute.
	 * @return acsph2bp attribute
	 */
	public String getAcsph2bp() {
		return acsph2bp.getValue();
	}

	/**
	 * Setter for acsph2bp attribute.
	 * @param acsph2bp the new value of acsph2bp
	 */
	public void setAcsph2bp(String acsph2bp) {
		this.acsph2bp.setValue(acsph2bp);
	}
	/**
	 * Gets the reference for attribute acsph2bh.
	 * @return the acsph2bh attribute reference
	 */
	public ElementaryRangeReference getAcsph2bhReference() {
		return acsph2bh.getReference();
	}

	/**
	 * Getter for acsph2bh attribute.
	 * @return acsph2bh attribute
	 */
	public String getAcsph2bh() {
		return acsph2bh.getValue();
	}

	/**
	 * Setter for acsph2bh attribute.
	 * @param acsph2bh the new value of acsph2bh
	 */
	public void setAcsph2bh(String acsph2bh) {
		this.acsph2bh.setValue(acsph2bh);
	}
	/**
	 * Gets the reference for attribute acsph2bv.
	 * @return the acsph2bv attribute reference
	 */
	public ElementaryRangeReference getAcsph2bvReference() {
		return acsph2bv.getReference();
	}

	/**
	 * Getter for acsph2bv attribute.
	 * @return acsph2bv attribute
	 */
	public String getAcsph2bv() {
		return acsph2bv.getValue();
	}

	/**
	 * Setter for acsph2bv attribute.
	 * @param acsph2bv the new value of acsph2bv
	 */
	public void setAcsph2bv(String acsph2bv) {
		this.acsph2bv.setValue(acsph2bv);
	}
	/**
	 * Gets the reference for attribute acsph2bo.
	 * @return the acsph2bo attribute reference
	 */
	public ElementaryRangeReference getAcsph2boReference() {
		return acsph2bo.getReference();
	}

	/**
	 * Getter for acsph2bo attribute.
	 * @return acsph2bo attribute
	 */
	public String getAcsph2bo() {
		return acsph2bo.getValue();
	}

	/**
	 * Setter for acsph2bo attribute.
	 * @param acsph2bo the new value of acsph2bo
	 */
	public void setAcsph2bo(String acsph2bo) {
		this.acsph2bo.setValue(acsph2bo);
	}
	/**
	 * Gets the reference for attribute acsph2cc.
	 * @return the acsph2cc attribute reference
	 */
	public ElementaryRangeReference getAcsph2ccReference() {
		return acsph2cc.getReference();
	}

	/**
	 * Getter for acsph2cc attribute.
	 * @return acsph2cc attribute
	 */
	public String getAcsph2cc() {
		return acsph2cc.getValue();
	}

	/**
	 * Setter for acsph2cc attribute.
	 * @param acsph2cc the new value of acsph2cc
	 */
	public void setAcsph2cc(String acsph2cc) {
		this.acsph2cc.setValue(acsph2cc);
	}
	/**
	 * Gets the reference for attribute acsph2cp.
	 * @return the acsph2cp attribute reference
	 */
	public ElementaryRangeReference getAcsph2cpReference() {
		return acsph2cp.getReference();
	}

	/**
	 * Getter for acsph2cp attribute.
	 * @return acsph2cp attribute
	 */
	public String getAcsph2cp() {
		return acsph2cp.getValue();
	}

	/**
	 * Setter for acsph2cp attribute.
	 * @param acsph2cp the new value of acsph2cp
	 */
	public void setAcsph2cp(String acsph2cp) {
		this.acsph2cp.setValue(acsph2cp);
	}
	/**
	 * Gets the reference for attribute acsph2ch.
	 * @return the acsph2ch attribute reference
	 */
	public ElementaryRangeReference getAcsph2chReference() {
		return acsph2ch.getReference();
	}

	/**
	 * Getter for acsph2ch attribute.
	 * @return acsph2ch attribute
	 */
	public String getAcsph2ch() {
		return acsph2ch.getValue();
	}

	/**
	 * Setter for acsph2ch attribute.
	 * @param acsph2ch the new value of acsph2ch
	 */
	public void setAcsph2ch(String acsph2ch) {
		this.acsph2ch.setValue(acsph2ch);
	}
	/**
	 * Gets the reference for attribute acsph2cv.
	 * @return the acsph2cv attribute reference
	 */
	public ElementaryRangeReference getAcsph2cvReference() {
		return acsph2cv.getReference();
	}

	/**
	 * Getter for acsph2cv attribute.
	 * @return acsph2cv attribute
	 */
	public String getAcsph2cv() {
		return acsph2cv.getValue();
	}

	/**
	 * Setter for acsph2cv attribute.
	 * @param acsph2cv the new value of acsph2cv
	 */
	public void setAcsph2cv(String acsph2cv) {
		this.acsph2cv.setValue(acsph2cv);
	}
	/**
	 * Gets the reference for attribute acsph2co.
	 * @return the acsph2co attribute reference
	 */
	public ElementaryRangeReference getAcsph2coReference() {
		return acsph2co.getReference();
	}

	/**
	 * Getter for acsph2co attribute.
	 * @return acsph2co attribute
	 */
	public String getAcsph2co() {
		return acsph2co.getValue();
	}

	/**
	 * Setter for acsph2co attribute.
	 * @param acsph2co the new value of acsph2co
	 */
	public void setAcsph2co(String acsph2co) {
		this.acsph2co.setValue(acsph2co);
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
	/**
	 * Gets the reference for attribute fkey05c.
	 * @return the fkey05c attribute reference
	 */
	public ElementaryRangeReference getFkey05cReference() {
		return fkey05c.getReference();
	}

	/**
	 * Getter for fkey05c attribute.
	 * @return fkey05c attribute
	 */
	public String getFkey05c() {
		return fkey05c.getValue();
	}

	/**
	 * Setter for fkey05c attribute.
	 * @param fkey05c the new value of fkey05c
	 */
	public void setFkey05c(String fkey05c) {
		this.fkey05c.setValue(fkey05c);
	}
	/**
	 * Gets the reference for attribute fkey05p.
	 * @return the fkey05p attribute reference
	 */
	public ElementaryRangeReference getFkey05pReference() {
		return fkey05p.getReference();
	}

	/**
	 * Getter for fkey05p attribute.
	 * @return fkey05p attribute
	 */
	public String getFkey05p() {
		return fkey05p.getValue();
	}

	/**
	 * Setter for fkey05p attribute.
	 * @param fkey05p the new value of fkey05p
	 */
	public void setFkey05p(String fkey05p) {
		this.fkey05p.setValue(fkey05p);
	}
	/**
	 * Gets the reference for attribute fkey05h.
	 * @return the fkey05h attribute reference
	 */
	public ElementaryRangeReference getFkey05hReference() {
		return fkey05h.getReference();
	}

	/**
	 * Getter for fkey05h attribute.
	 * @return fkey05h attribute
	 */
	public String getFkey05h() {
		return fkey05h.getValue();
	}

	/**
	 * Setter for fkey05h attribute.
	 * @param fkey05h the new value of fkey05h
	 */
	public void setFkey05h(String fkey05h) {
		this.fkey05h.setValue(fkey05h);
	}
	/**
	 * Gets the reference for attribute fkey05v.
	 * @return the fkey05v attribute reference
	 */
	public ElementaryRangeReference getFkey05vReference() {
		return fkey05v.getReference();
	}

	/**
	 * Getter for fkey05v attribute.
	 * @return fkey05v attribute
	 */
	public String getFkey05v() {
		return fkey05v.getValue();
	}

	/**
	 * Setter for fkey05v attribute.
	 * @param fkey05v the new value of fkey05v
	 */
	public void setFkey05v(String fkey05v) {
		this.fkey05v.setValue(fkey05v);
	}
	/**
	 * Gets the reference for attribute fkey05o.
	 * @return the fkey05o attribute reference
	 */
	public ElementaryRangeReference getFkey05oReference() {
		return fkey05o.getReference();
	}

	/**
	 * Getter for fkey05o attribute.
	 * @return fkey05o attribute
	 */
	public String getFkey05o() {
		return fkey05o.getValue();
	}

	/**
	 * Setter for fkey05o attribute.
	 * @param fkey05o the new value of fkey05o
	 */
	public void setFkey05o(String fkey05o) {
		this.fkey05o.setValue(fkey05o);
	}
	/**
	 * Gets the reference for attribute fkey12c.
	 * @return the fkey12c attribute reference
	 */
	public ElementaryRangeReference getFkey12cReference() {
		return fkey12c.getReference();
	}

	/**
	 * Getter for fkey12c attribute.
	 * @return fkey12c attribute
	 */
	public String getFkey12c() {
		return fkey12c.getValue();
	}

	/**
	 * Setter for fkey12c attribute.
	 * @param fkey12c the new value of fkey12c
	 */
	public void setFkey12c(String fkey12c) {
		this.fkey12c.setValue(fkey12c);
	}
	/**
	 * Gets the reference for attribute fkey12p.
	 * @return the fkey12p attribute reference
	 */
	public ElementaryRangeReference getFkey12pReference() {
		return fkey12p.getReference();
	}

	/**
	 * Getter for fkey12p attribute.
	 * @return fkey12p attribute
	 */
	public String getFkey12p() {
		return fkey12p.getValue();
	}

	/**
	 * Setter for fkey12p attribute.
	 * @param fkey12p the new value of fkey12p
	 */
	public void setFkey12p(String fkey12p) {
		this.fkey12p.setValue(fkey12p);
	}
	/**
	 * Gets the reference for attribute fkey12h.
	 * @return the fkey12h attribute reference
	 */
	public ElementaryRangeReference getFkey12hReference() {
		return fkey12h.getReference();
	}

	/**
	 * Getter for fkey12h attribute.
	 * @return fkey12h attribute
	 */
	public String getFkey12h() {
		return fkey12h.getValue();
	}

	/**
	 * Setter for fkey12h attribute.
	 * @param fkey12h the new value of fkey12h
	 */
	public void setFkey12h(String fkey12h) {
		this.fkey12h.setValue(fkey12h);
	}
	/**
	 * Gets the reference for attribute fkey12v.
	 * @return the fkey12v attribute reference
	 */
	public ElementaryRangeReference getFkey12vReference() {
		return fkey12v.getReference();
	}

	/**
	 * Getter for fkey12v attribute.
	 * @return fkey12v attribute
	 */
	public String getFkey12v() {
		return fkey12v.getValue();
	}

	/**
	 * Setter for fkey12v attribute.
	 * @param fkey12v the new value of fkey12v
	 */
	public void setFkey12v(String fkey12v) {
		this.fkey12v.setValue(fkey12v);
	}
	/**
	 * Gets the reference for attribute fkey12o.
	 * @return the fkey12o attribute reference
	 */
	public ElementaryRangeReference getFkey12oReference() {
		return fkey12o.getReference();
	}

	/**
	 * Getter for fkey12o attribute.
	 * @return fkey12o attribute
	 */
	public String getFkey12o() {
		return fkey12o.getValue();
	}

	/**
	 * Setter for fkey12o attribute.
	 * @param fkey12o the new value of fkey12o
	 */
	public void setFkey12o(String fkey12o) {
		this.fkey12o.setValue(fkey12o);
	}
}
