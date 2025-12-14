package aws.bluage.l3.workshop.cocrdlic.business.model;

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
 * <p>About 'ccrdliai' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.Ccrdliai
 * <br></p>
 * 
 * <p>About 'ccrdliao' field, <br>uml entity: aws.bluage.l3.workshop.cocrdlic.business.model.Ccrdliao
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
	 * COPY COCRDSL.
	 * Credit Card List Screen Layout
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
	private final Group ccrdliai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(ccrdliai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(ccrdliai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(ccrdliai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(ccrdliai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(ccrdliai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(ccrdliai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(ccrdliai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(ccrdliai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(ccrdliai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(ccrdliai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(ccrdliai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(ccrdliai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(ccrdliai,new AlphanumericType(8));
	private final Elementary pagenol = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(ccrdliai);
	private final Elementary pagenof = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary pagenoa = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary pagenoi = new Elementary(ccrdliai,new AlphanumericType(3));
	private final Elementary acctsidl = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(ccrdliai);
	private final Elementary acctsidf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary acctsida = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary acctsidi = new Elementary(ccrdliai,new AlphanumericType(11));
	private final Elementary cardsidl = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(ccrdliai);
	private final Elementary cardsidf = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary cardsida = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary cardsidi = new Elementary(ccrdliai,new AlphanumericType(16));
	private final Elementary crdsel1l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(ccrdliai);
	private final Elementary crdsel1f = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary crdsel1a = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsel1i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary acctno1l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(ccrdliai);
	private final Elementary acctno1f = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary acctno1a = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary acctno1i = new Elementary(ccrdliai,new AlphanumericType(11));
	private final Elementary crdnum1l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(ccrdliai);
	private final Elementary crdnum1f = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary crdnum1a = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdnum1i = new Elementary(ccrdliai,new AlphanumericType(16));
	private final Elementary crdsts1l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union13 = new Union(ccrdliai);
	private final Elementary crdsts1f = new Elementary(union13,new AlphanumericType(1));
	private final Group group12 = new Group(union13);
	private final Elementary crdsts1a = new Elementary(group12,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsts1i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdsel2l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union14 = new Union(ccrdliai);
	private final Elementary crdsel2f = new Elementary(union14,new AlphanumericType(1));
	private final Group group13 = new Group(union14);
	private final Elementary crdsel2a = new Elementary(group13,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsel2i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdstp2l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union15 = new Union(ccrdliai);
	private final Elementary crdstp2f = new Elementary(union15,new AlphanumericType(1));
	private final Group group14 = new Group(union15);
	private final Elementary crdstp2a = new Elementary(group14,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdstp2i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary acctno2l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union16 = new Union(ccrdliai);
	private final Elementary acctno2f = new Elementary(union16,new AlphanumericType(1));
	private final Group group15 = new Group(union16);
	private final Elementary acctno2a = new Elementary(group15,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary acctno2i = new Elementary(ccrdliai,new AlphanumericType(11));
	private final Elementary crdnum2l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union17 = new Union(ccrdliai);
	private final Elementary crdnum2f = new Elementary(union17,new AlphanumericType(1));
	private final Group group16 = new Group(union17);
	private final Elementary crdnum2a = new Elementary(group16,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdnum2i = new Elementary(ccrdliai,new AlphanumericType(16));
	private final Elementary crdsts2l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union18 = new Union(ccrdliai);
	private final Elementary crdsts2f = new Elementary(union18,new AlphanumericType(1));
	private final Group group17 = new Group(union18);
	private final Elementary crdsts2a = new Elementary(group17,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsts2i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdsel3l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union19 = new Union(ccrdliai);
	private final Elementary crdsel3f = new Elementary(union19,new AlphanumericType(1));
	private final Group group18 = new Group(union19);
	private final Elementary crdsel3a = new Elementary(group18,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsel3i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdstp3l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union20 = new Union(ccrdliai);
	private final Elementary crdstp3f = new Elementary(union20,new AlphanumericType(1));
	private final Group group19 = new Group(union20);
	private final Elementary crdstp3a = new Elementary(group19,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdstp3i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary acctno3l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union21 = new Union(ccrdliai);
	private final Elementary acctno3f = new Elementary(union21,new AlphanumericType(1));
	private final Group group20 = new Group(union21);
	private final Elementary acctno3a = new Elementary(group20,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary acctno3i = new Elementary(ccrdliai,new AlphanumericType(11));
	private final Elementary crdnum3l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union22 = new Union(ccrdliai);
	private final Elementary crdnum3f = new Elementary(union22,new AlphanumericType(1));
	private final Group group21 = new Group(union22);
	private final Elementary crdnum3a = new Elementary(group21,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdnum3i = new Elementary(ccrdliai,new AlphanumericType(16));
	private final Elementary crdsts3l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union23 = new Union(ccrdliai);
	private final Elementary crdsts3f = new Elementary(union23,new AlphanumericType(1));
	private final Group group22 = new Group(union23);
	private final Elementary crdsts3a = new Elementary(group22,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsts3i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdsel4l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union24 = new Union(ccrdliai);
	private final Elementary crdsel4f = new Elementary(union24,new AlphanumericType(1));
	private final Group group23 = new Group(union24);
	private final Elementary crdsel4a = new Elementary(group23,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsel4i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdstp4l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union25 = new Union(ccrdliai);
	private final Elementary crdstp4f = new Elementary(union25,new AlphanumericType(1));
	private final Group group24 = new Group(union25);
	private final Elementary crdstp4a = new Elementary(group24,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdstp4i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary acctno4l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union26 = new Union(ccrdliai);
	private final Elementary acctno4f = new Elementary(union26,new AlphanumericType(1));
	private final Group group25 = new Group(union26);
	private final Elementary acctno4a = new Elementary(group25,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary acctno4i = new Elementary(ccrdliai,new AlphanumericType(11));
	private final Elementary crdnum4l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union27 = new Union(ccrdliai);
	private final Elementary crdnum4f = new Elementary(union27,new AlphanumericType(1));
	private final Group group26 = new Group(union27);
	private final Elementary crdnum4a = new Elementary(group26,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdnum4i = new Elementary(ccrdliai,new AlphanumericType(16));
	private final Elementary crdsts4l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union28 = new Union(ccrdliai);
	private final Elementary crdsts4f = new Elementary(union28,new AlphanumericType(1));
	private final Group group27 = new Group(union28);
	private final Elementary crdsts4a = new Elementary(group27,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsts4i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdsel5l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union29 = new Union(ccrdliai);
	private final Elementary crdsel5f = new Elementary(union29,new AlphanumericType(1));
	private final Group group28 = new Group(union29);
	private final Elementary crdsel5a = new Elementary(group28,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsel5i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdstp5l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union30 = new Union(ccrdliai);
	private final Elementary crdstp5f = new Elementary(union30,new AlphanumericType(1));
	private final Group group29 = new Group(union30);
	private final Elementary crdstp5a = new Elementary(group29,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdstp5i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary acctno5l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union31 = new Union(ccrdliai);
	private final Elementary acctno5f = new Elementary(union31,new AlphanumericType(1));
	private final Group group30 = new Group(union31);
	private final Elementary acctno5a = new Elementary(group30,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary acctno5i = new Elementary(ccrdliai,new AlphanumericType(11));
	private final Elementary crdnum5l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union32 = new Union(ccrdliai);
	private final Elementary crdnum5f = new Elementary(union32,new AlphanumericType(1));
	private final Group group31 = new Group(union32);
	private final Elementary crdnum5a = new Elementary(group31,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdnum5i = new Elementary(ccrdliai,new AlphanumericType(16));
	private final Elementary crdsts5l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union33 = new Union(ccrdliai);
	private final Elementary crdsts5f = new Elementary(union33,new AlphanumericType(1));
	private final Group group32 = new Group(union33);
	private final Elementary crdsts5a = new Elementary(group32,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler33 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsts5i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdsel6l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union34 = new Union(ccrdliai);
	private final Elementary crdsel6f = new Elementary(union34,new AlphanumericType(1));
	private final Group group33 = new Group(union34);
	private final Elementary crdsel6a = new Elementary(group33,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler34 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsel6i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdstp6l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union35 = new Union(ccrdliai);
	private final Elementary crdstp6f = new Elementary(union35,new AlphanumericType(1));
	private final Group group34 = new Group(union35);
	private final Elementary crdstp6a = new Elementary(group34,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler35 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdstp6i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary acctno6l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union36 = new Union(ccrdliai);
	private final Elementary acctno6f = new Elementary(union36,new AlphanumericType(1));
	private final Group group35 = new Group(union36);
	private final Elementary acctno6a = new Elementary(group35,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler36 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary acctno6i = new Elementary(ccrdliai,new AlphanumericType(11));
	private final Elementary crdnum6l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union37 = new Union(ccrdliai);
	private final Elementary crdnum6f = new Elementary(union37,new AlphanumericType(1));
	private final Group group36 = new Group(union37);
	private final Elementary crdnum6a = new Elementary(group36,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler37 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdnum6i = new Elementary(ccrdliai,new AlphanumericType(16));
	private final Elementary crdsts6l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union38 = new Union(ccrdliai);
	private final Elementary crdsts6f = new Elementary(union38,new AlphanumericType(1));
	private final Group group37 = new Group(union38);
	private final Elementary crdsts6a = new Elementary(group37,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler38 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsts6i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdsel7l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union39 = new Union(ccrdliai);
	private final Elementary crdsel7f = new Elementary(union39,new AlphanumericType(1));
	private final Group group38 = new Group(union39);
	private final Elementary crdsel7a = new Elementary(group38,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler39 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsel7i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary crdstp7l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union40 = new Union(ccrdliai);
	private final Elementary crdstp7f = new Elementary(union40,new AlphanumericType(1));
	private final Group group39 = new Group(union40);
	private final Elementary crdstp7a = new Elementary(group39,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler40 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdstp7i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary acctno7l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union41 = new Union(ccrdliai);
	private final Elementary acctno7f = new Elementary(union41,new AlphanumericType(1));
	private final Group group40 = new Group(union41);
	private final Elementary acctno7a = new Elementary(group40,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler41 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary acctno7i = new Elementary(ccrdliai,new AlphanumericType(11));
	private final Elementary crdnum7l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union42 = new Union(ccrdliai);
	private final Elementary crdnum7f = new Elementary(union42,new AlphanumericType(1));
	private final Group group41 = new Group(union42);
	private final Elementary crdnum7a = new Elementary(group41,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler42 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdnum7i = new Elementary(ccrdliai,new AlphanumericType(16));
	private final Elementary crdsts7l = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union43 = new Union(ccrdliai);
	private final Elementary crdsts7f = new Elementary(union43,new AlphanumericType(1));
	private final Group group42 = new Group(union43);
	private final Elementary crdsts7a = new Elementary(group42,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler43 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary crdsts7i = new Elementary(ccrdliai,new AlphanumericType(1));
	private final Elementary infomsgl = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union44 = new Union(ccrdliai);
	private final Elementary infomsgf = new Elementary(union44,new AlphanumericType(1));
	private final Group group43 = new Group(union44);
	private final Elementary infomsga = new Elementary(group43,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler44 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary infomsgi = new Elementary(ccrdliai,new AlphanumericType(45));
	private final Elementary errmsgl = new Elementary(ccrdliai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union45 = new Union(ccrdliai);
	private final Elementary errmsgf = new Elementary(union45,new AlphanumericType(1));
	private final Group group44 = new Group(union45);
	private final Elementary errmsga = new Elementary(group44,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler45 = new Filler(ccrdliai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(ccrdliai,new AlphanumericType(78));
	private final Group ccrdliao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler46 = new Filler(ccrdliao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler47 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(ccrdliao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler48 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(ccrdliao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler49 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(ccrdliao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler50 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(ccrdliao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler51 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(ccrdliao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler52 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(ccrdliao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler53 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary pagenoc = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary pagenop = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary pagenoh = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary pagenov = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary pagenoo = new Elementary(ccrdliao,new AlphanumericType(3));
	@SuppressWarnings("unused")
	private final Filler filler54 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary acctsidc = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctsidp = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctsidh = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctsidv = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctsido = new Elementary(ccrdliao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler55 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary cardsidc = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary cardsidp = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary cardsidh = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary cardsidv = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary cardsido = new Elementary(ccrdliao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler56 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsel1c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel1p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel1h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel1v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel1o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler57 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary acctno1c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno1p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno1h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno1v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno1o = new Elementary(ccrdliao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler58 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdnum1c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum1p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum1h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum1v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum1o = new Elementary(ccrdliao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler59 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsts1c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts1p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts1h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts1v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts1o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler60 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsel2c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel2p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel2h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel2v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel2o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler61 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdstp2c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp2p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp2h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp2v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp2o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler62 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary acctno2c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno2p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno2h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno2v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno2o = new Elementary(ccrdliao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler63 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdnum2c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum2p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum2h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum2v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum2o = new Elementary(ccrdliao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler64 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsts2c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts2p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts2h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts2v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts2o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler65 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsel3c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel3p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel3h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel3v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel3o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler66 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdstp3c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp3p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp3h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp3v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp3o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler67 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary acctno3c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno3p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno3h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno3v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno3o = new Elementary(ccrdliao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler68 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdnum3c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum3p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum3h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum3v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum3o = new Elementary(ccrdliao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler69 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsts3c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts3p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts3h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts3v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts3o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler70 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsel4c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel4p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel4h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel4v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel4o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler71 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdstp4c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp4p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp4h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp4v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp4o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler72 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary acctno4c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno4p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno4h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno4v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno4o = new Elementary(ccrdliao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler73 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdnum4c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum4p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum4h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum4v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum4o = new Elementary(ccrdliao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler74 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsts4c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts4p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts4h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts4v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts4o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler75 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsel5c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel5p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel5h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel5v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel5o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler76 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdstp5c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp5p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp5h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp5v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp5o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler77 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary acctno5c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno5p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno5h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno5v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno5o = new Elementary(ccrdliao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler78 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdnum5c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum5p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum5h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum5v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum5o = new Elementary(ccrdliao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler79 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsts5c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts5p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts5h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts5v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts5o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler80 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsel6c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel6p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel6h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel6v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel6o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler81 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdstp6c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp6p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp6h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp6v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp6o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler82 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary acctno6c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno6p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno6h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno6v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno6o = new Elementary(ccrdliao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler83 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdnum6c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum6p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum6h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum6v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum6o = new Elementary(ccrdliao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler84 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsts6c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts6p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts6h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts6v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts6o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler85 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsel7c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel7p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel7h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel7v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsel7o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler86 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdstp7c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp7p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp7h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp7v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdstp7o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler87 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary acctno7c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno7p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno7h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno7v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary acctno7o = new Elementary(ccrdliao,new AlphanumericType(11));
	@SuppressWarnings("unused")
	private final Filler filler88 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdnum7c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum7p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum7h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum7v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdnum7o = new Elementary(ccrdliao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler89 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary crdsts7c = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts7p = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts7h = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts7v = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary crdsts7o = new Elementary(ccrdliao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler90 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary infomsgc = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary infomsgp = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary infomsgh = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary infomsgv = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary infomsgo = new Elementary(ccrdliao,new AlphanumericType(45));
	@SuppressWarnings("unused")
	private final Filler filler91 = new Filler(ccrdliao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(ccrdliao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(ccrdliao,new AlphanumericType(78));
	

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
	 * Gets the reference for attribute ccrdliai.
	 * @return the ccrdliai attribute reference
	 */
	public RangeReference getCcrdliaiReference() {
		return ccrdliai.getReference();
	}	
				
	/**
	 * Setter for ccrdliai .
	 */
   	public void setCcrdliai(RangeReference reference) {
       	ccrdliai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute pagenol.
	 * @return the pagenol attribute reference
	 */
	public ElementaryRangeReference getPagenolReference() {
		return pagenol.getReference();
	}

	/**
	 * Getter for pagenol attribute.
	 * @return pagenol attribute
	 */
	public int getPagenol() {
		return pagenol.getValue();
	}

	/**
	 * Setter for pagenol attribute.
	 * @param pagenol the new value of pagenol
	 */
	public void setPagenol(int pagenol) {
		this.pagenol.setValue(pagenol);
	}
	/**
	 * Gets the reference for attribute pagenof.
	 * @return the pagenof attribute reference
	 */
	public ElementaryRangeReference getPagenofReference() {
		return pagenof.getReference();
	}

	/**
	 * Getter for pagenof attribute.
	 * @return pagenof attribute
	 */
	public String getPagenof() {
		return pagenof.getValue();
	}

	/**
	 * Setter for pagenof attribute.
	 * @param pagenof the new value of pagenof
	 */
	public void setPagenof(String pagenof) {
		this.pagenof.setValue(pagenof);
	}
	/**
	 * Gets the reference for attribute pagenoa.
	 * @return the pagenoa attribute reference
	 */
	public ElementaryRangeReference getPagenoaReference() {
		return pagenoa.getReference();
	}

	/**
	 * Getter for pagenoa attribute.
	 * @return pagenoa attribute
	 */
	public String getPagenoa() {
		return pagenoa.getValue();
	}

	/**
	 * Setter for pagenoa attribute.
	 * @param pagenoa the new value of pagenoa
	 */
	public void setPagenoa(String pagenoa) {
		this.pagenoa.setValue(pagenoa);
	}
	/**
	 * Gets the reference for attribute pagenoi.
	 * @return the pagenoi attribute reference
	 */
	public ElementaryRangeReference getPagenoiReference() {
		return pagenoi.getReference();
	}

	/**
	 * Getter for pagenoi attribute.
	 * @return pagenoi attribute
	 */
	public String getPagenoi() {
		return pagenoi.getValue();
	}

	/**
	 * Setter for pagenoi attribute.
	 * @param pagenoi the new value of pagenoi
	 */
	public void setPagenoi(String pagenoi) {
		this.pagenoi.setValue(pagenoi);
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
	 * Gets the reference for attribute crdsel1l.
	 * @return the crdsel1l attribute reference
	 */
	public ElementaryRangeReference getCrdsel1lReference() {
		return crdsel1l.getReference();
	}

	/**
	 * Getter for crdsel1l attribute.
	 * @return crdsel1l attribute
	 */
	public int getCrdsel1l() {
		return crdsel1l.getValue();
	}

	/**
	 * Setter for crdsel1l attribute.
	 * @param crdsel1l the new value of crdsel1l
	 */
	public void setCrdsel1l(int crdsel1l) {
		this.crdsel1l.setValue(crdsel1l);
	}
	/**
	 * Gets the reference for attribute crdsel1f.
	 * @return the crdsel1f attribute reference
	 */
	public ElementaryRangeReference getCrdsel1fReference() {
		return crdsel1f.getReference();
	}

	/**
	 * Getter for crdsel1f attribute.
	 * @return crdsel1f attribute
	 */
	public String getCrdsel1f() {
		return crdsel1f.getValue();
	}

	/**
	 * Setter for crdsel1f attribute.
	 * @param crdsel1f the new value of crdsel1f
	 */
	public void setCrdsel1f(String crdsel1f) {
		this.crdsel1f.setValue(crdsel1f);
	}
	/**
	 * Gets the reference for attribute crdsel1a.
	 * @return the crdsel1a attribute reference
	 */
	public ElementaryRangeReference getCrdsel1aReference() {
		return crdsel1a.getReference();
	}

	/**
	 * Getter for crdsel1a attribute.
	 * @return crdsel1a attribute
	 */
	public String getCrdsel1a() {
		return crdsel1a.getValue();
	}

	/**
	 * Setter for crdsel1a attribute.
	 * @param crdsel1a the new value of crdsel1a
	 */
	public void setCrdsel1a(String crdsel1a) {
		this.crdsel1a.setValue(crdsel1a);
	}
	/**
	 * Gets the reference for attribute crdsel1i.
	 * @return the crdsel1i attribute reference
	 */
	public ElementaryRangeReference getCrdsel1iReference() {
		return crdsel1i.getReference();
	}

	/**
	 * Getter for crdsel1i attribute.
	 * @return crdsel1i attribute
	 */
	public String getCrdsel1i() {
		return crdsel1i.getValue();
	}

	/**
	 * Setter for crdsel1i attribute.
	 * @param crdsel1i the new value of crdsel1i
	 */
	public void setCrdsel1i(String crdsel1i) {
		this.crdsel1i.setValue(crdsel1i);
	}
	/**
	 * Gets the reference for attribute acctno1l.
	 * @return the acctno1l attribute reference
	 */
	public ElementaryRangeReference getAcctno1lReference() {
		return acctno1l.getReference();
	}

	/**
	 * Getter for acctno1l attribute.
	 * @return acctno1l attribute
	 */
	public int getAcctno1l() {
		return acctno1l.getValue();
	}

	/**
	 * Setter for acctno1l attribute.
	 * @param acctno1l the new value of acctno1l
	 */
	public void setAcctno1l(int acctno1l) {
		this.acctno1l.setValue(acctno1l);
	}
	/**
	 * Gets the reference for attribute acctno1f.
	 * @return the acctno1f attribute reference
	 */
	public ElementaryRangeReference getAcctno1fReference() {
		return acctno1f.getReference();
	}

	/**
	 * Getter for acctno1f attribute.
	 * @return acctno1f attribute
	 */
	public String getAcctno1f() {
		return acctno1f.getValue();
	}

	/**
	 * Setter for acctno1f attribute.
	 * @param acctno1f the new value of acctno1f
	 */
	public void setAcctno1f(String acctno1f) {
		this.acctno1f.setValue(acctno1f);
	}
	/**
	 * Gets the reference for attribute acctno1a.
	 * @return the acctno1a attribute reference
	 */
	public ElementaryRangeReference getAcctno1aReference() {
		return acctno1a.getReference();
	}

	/**
	 * Getter for acctno1a attribute.
	 * @return acctno1a attribute
	 */
	public String getAcctno1a() {
		return acctno1a.getValue();
	}

	/**
	 * Setter for acctno1a attribute.
	 * @param acctno1a the new value of acctno1a
	 */
	public void setAcctno1a(String acctno1a) {
		this.acctno1a.setValue(acctno1a);
	}
	/**
	 * Gets the reference for attribute acctno1i.
	 * @return the acctno1i attribute reference
	 */
	public ElementaryRangeReference getAcctno1iReference() {
		return acctno1i.getReference();
	}

	/**
	 * Getter for acctno1i attribute.
	 * @return acctno1i attribute
	 */
	public String getAcctno1i() {
		return acctno1i.getValue();
	}

	/**
	 * Setter for acctno1i attribute.
	 * @param acctno1i the new value of acctno1i
	 */
	public void setAcctno1i(String acctno1i) {
		this.acctno1i.setValue(acctno1i);
	}
	/**
	 * Gets the reference for attribute crdnum1l.
	 * @return the crdnum1l attribute reference
	 */
	public ElementaryRangeReference getCrdnum1lReference() {
		return crdnum1l.getReference();
	}

	/**
	 * Getter for crdnum1l attribute.
	 * @return crdnum1l attribute
	 */
	public int getCrdnum1l() {
		return crdnum1l.getValue();
	}

	/**
	 * Setter for crdnum1l attribute.
	 * @param crdnum1l the new value of crdnum1l
	 */
	public void setCrdnum1l(int crdnum1l) {
		this.crdnum1l.setValue(crdnum1l);
	}
	/**
	 * Gets the reference for attribute crdnum1f.
	 * @return the crdnum1f attribute reference
	 */
	public ElementaryRangeReference getCrdnum1fReference() {
		return crdnum1f.getReference();
	}

	/**
	 * Getter for crdnum1f attribute.
	 * @return crdnum1f attribute
	 */
	public String getCrdnum1f() {
		return crdnum1f.getValue();
	}

	/**
	 * Setter for crdnum1f attribute.
	 * @param crdnum1f the new value of crdnum1f
	 */
	public void setCrdnum1f(String crdnum1f) {
		this.crdnum1f.setValue(crdnum1f);
	}
	/**
	 * Gets the reference for attribute crdnum1a.
	 * @return the crdnum1a attribute reference
	 */
	public ElementaryRangeReference getCrdnum1aReference() {
		return crdnum1a.getReference();
	}

	/**
	 * Getter for crdnum1a attribute.
	 * @return crdnum1a attribute
	 */
	public String getCrdnum1a() {
		return crdnum1a.getValue();
	}

	/**
	 * Setter for crdnum1a attribute.
	 * @param crdnum1a the new value of crdnum1a
	 */
	public void setCrdnum1a(String crdnum1a) {
		this.crdnum1a.setValue(crdnum1a);
	}
	/**
	 * Gets the reference for attribute crdnum1i.
	 * @return the crdnum1i attribute reference
	 */
	public ElementaryRangeReference getCrdnum1iReference() {
		return crdnum1i.getReference();
	}

	/**
	 * Getter for crdnum1i attribute.
	 * @return crdnum1i attribute
	 */
	public String getCrdnum1i() {
		return crdnum1i.getValue();
	}

	/**
	 * Setter for crdnum1i attribute.
	 * @param crdnum1i the new value of crdnum1i
	 */
	public void setCrdnum1i(String crdnum1i) {
		this.crdnum1i.setValue(crdnum1i);
	}
	/**
	 * Gets the reference for attribute crdsts1l.
	 * @return the crdsts1l attribute reference
	 */
	public ElementaryRangeReference getCrdsts1lReference() {
		return crdsts1l.getReference();
	}

	/**
	 * Getter for crdsts1l attribute.
	 * @return crdsts1l attribute
	 */
	public int getCrdsts1l() {
		return crdsts1l.getValue();
	}

	/**
	 * Setter for crdsts1l attribute.
	 * @param crdsts1l the new value of crdsts1l
	 */
	public void setCrdsts1l(int crdsts1l) {
		this.crdsts1l.setValue(crdsts1l);
	}
	/**
	 * Gets the reference for attribute crdsts1f.
	 * @return the crdsts1f attribute reference
	 */
	public ElementaryRangeReference getCrdsts1fReference() {
		return crdsts1f.getReference();
	}

	/**
	 * Getter for crdsts1f attribute.
	 * @return crdsts1f attribute
	 */
	public String getCrdsts1f() {
		return crdsts1f.getValue();
	}

	/**
	 * Setter for crdsts1f attribute.
	 * @param crdsts1f the new value of crdsts1f
	 */
	public void setCrdsts1f(String crdsts1f) {
		this.crdsts1f.setValue(crdsts1f);
	}
	/**
	 * Gets the reference for attribute crdsts1a.
	 * @return the crdsts1a attribute reference
	 */
	public ElementaryRangeReference getCrdsts1aReference() {
		return crdsts1a.getReference();
	}

	/**
	 * Getter for crdsts1a attribute.
	 * @return crdsts1a attribute
	 */
	public String getCrdsts1a() {
		return crdsts1a.getValue();
	}

	/**
	 * Setter for crdsts1a attribute.
	 * @param crdsts1a the new value of crdsts1a
	 */
	public void setCrdsts1a(String crdsts1a) {
		this.crdsts1a.setValue(crdsts1a);
	}
	/**
	 * Gets the reference for attribute crdsts1i.
	 * @return the crdsts1i attribute reference
	 */
	public ElementaryRangeReference getCrdsts1iReference() {
		return crdsts1i.getReference();
	}

	/**
	 * Getter for crdsts1i attribute.
	 * @return crdsts1i attribute
	 */
	public String getCrdsts1i() {
		return crdsts1i.getValue();
	}

	/**
	 * Setter for crdsts1i attribute.
	 * @param crdsts1i the new value of crdsts1i
	 */
	public void setCrdsts1i(String crdsts1i) {
		this.crdsts1i.setValue(crdsts1i);
	}
	/**
	 * Gets the reference for attribute crdsel2l.
	 * @return the crdsel2l attribute reference
	 */
	public ElementaryRangeReference getCrdsel2lReference() {
		return crdsel2l.getReference();
	}

	/**
	 * Getter for crdsel2l attribute.
	 * @return crdsel2l attribute
	 */
	public int getCrdsel2l() {
		return crdsel2l.getValue();
	}

	/**
	 * Setter for crdsel2l attribute.
	 * @param crdsel2l the new value of crdsel2l
	 */
	public void setCrdsel2l(int crdsel2l) {
		this.crdsel2l.setValue(crdsel2l);
	}
	/**
	 * Gets the reference for attribute crdsel2f.
	 * @return the crdsel2f attribute reference
	 */
	public ElementaryRangeReference getCrdsel2fReference() {
		return crdsel2f.getReference();
	}

	/**
	 * Getter for crdsel2f attribute.
	 * @return crdsel2f attribute
	 */
	public String getCrdsel2f() {
		return crdsel2f.getValue();
	}

	/**
	 * Setter for crdsel2f attribute.
	 * @param crdsel2f the new value of crdsel2f
	 */
	public void setCrdsel2f(String crdsel2f) {
		this.crdsel2f.setValue(crdsel2f);
	}
	/**
	 * Gets the reference for attribute crdsel2a.
	 * @return the crdsel2a attribute reference
	 */
	public ElementaryRangeReference getCrdsel2aReference() {
		return crdsel2a.getReference();
	}

	/**
	 * Getter for crdsel2a attribute.
	 * @return crdsel2a attribute
	 */
	public String getCrdsel2a() {
		return crdsel2a.getValue();
	}

	/**
	 * Setter for crdsel2a attribute.
	 * @param crdsel2a the new value of crdsel2a
	 */
	public void setCrdsel2a(String crdsel2a) {
		this.crdsel2a.setValue(crdsel2a);
	}
	/**
	 * Gets the reference for attribute crdsel2i.
	 * @return the crdsel2i attribute reference
	 */
	public ElementaryRangeReference getCrdsel2iReference() {
		return crdsel2i.getReference();
	}

	/**
	 * Getter for crdsel2i attribute.
	 * @return crdsel2i attribute
	 */
	public String getCrdsel2i() {
		return crdsel2i.getValue();
	}

	/**
	 * Setter for crdsel2i attribute.
	 * @param crdsel2i the new value of crdsel2i
	 */
	public void setCrdsel2i(String crdsel2i) {
		this.crdsel2i.setValue(crdsel2i);
	}
	/**
	 * Gets the reference for attribute crdstp2l.
	 * @return the crdstp2l attribute reference
	 */
	public ElementaryRangeReference getCrdstp2lReference() {
		return crdstp2l.getReference();
	}

	/**
	 * Getter for crdstp2l attribute.
	 * @return crdstp2l attribute
	 */
	public int getCrdstp2l() {
		return crdstp2l.getValue();
	}

	/**
	 * Setter for crdstp2l attribute.
	 * @param crdstp2l the new value of crdstp2l
	 */
	public void setCrdstp2l(int crdstp2l) {
		this.crdstp2l.setValue(crdstp2l);
	}
	/**
	 * Gets the reference for attribute crdstp2f.
	 * @return the crdstp2f attribute reference
	 */
	public ElementaryRangeReference getCrdstp2fReference() {
		return crdstp2f.getReference();
	}

	/**
	 * Getter for crdstp2f attribute.
	 * @return crdstp2f attribute
	 */
	public String getCrdstp2f() {
		return crdstp2f.getValue();
	}

	/**
	 * Setter for crdstp2f attribute.
	 * @param crdstp2f the new value of crdstp2f
	 */
	public void setCrdstp2f(String crdstp2f) {
		this.crdstp2f.setValue(crdstp2f);
	}
	/**
	 * Gets the reference for attribute crdstp2a.
	 * @return the crdstp2a attribute reference
	 */
	public ElementaryRangeReference getCrdstp2aReference() {
		return crdstp2a.getReference();
	}

	/**
	 * Getter for crdstp2a attribute.
	 * @return crdstp2a attribute
	 */
	public String getCrdstp2a() {
		return crdstp2a.getValue();
	}

	/**
	 * Setter for crdstp2a attribute.
	 * @param crdstp2a the new value of crdstp2a
	 */
	public void setCrdstp2a(String crdstp2a) {
		this.crdstp2a.setValue(crdstp2a);
	}
	/**
	 * Gets the reference for attribute crdstp2i.
	 * @return the crdstp2i attribute reference
	 */
	public ElementaryRangeReference getCrdstp2iReference() {
		return crdstp2i.getReference();
	}

	/**
	 * Getter for crdstp2i attribute.
	 * @return crdstp2i attribute
	 */
	public String getCrdstp2i() {
		return crdstp2i.getValue();
	}

	/**
	 * Setter for crdstp2i attribute.
	 * @param crdstp2i the new value of crdstp2i
	 */
	public void setCrdstp2i(String crdstp2i) {
		this.crdstp2i.setValue(crdstp2i);
	}
	/**
	 * Gets the reference for attribute acctno2l.
	 * @return the acctno2l attribute reference
	 */
	public ElementaryRangeReference getAcctno2lReference() {
		return acctno2l.getReference();
	}

	/**
	 * Getter for acctno2l attribute.
	 * @return acctno2l attribute
	 */
	public int getAcctno2l() {
		return acctno2l.getValue();
	}

	/**
	 * Setter for acctno2l attribute.
	 * @param acctno2l the new value of acctno2l
	 */
	public void setAcctno2l(int acctno2l) {
		this.acctno2l.setValue(acctno2l);
	}
	/**
	 * Gets the reference for attribute acctno2f.
	 * @return the acctno2f attribute reference
	 */
	public ElementaryRangeReference getAcctno2fReference() {
		return acctno2f.getReference();
	}

	/**
	 * Getter for acctno2f attribute.
	 * @return acctno2f attribute
	 */
	public String getAcctno2f() {
		return acctno2f.getValue();
	}

	/**
	 * Setter for acctno2f attribute.
	 * @param acctno2f the new value of acctno2f
	 */
	public void setAcctno2f(String acctno2f) {
		this.acctno2f.setValue(acctno2f);
	}
	/**
	 * Gets the reference for attribute acctno2a.
	 * @return the acctno2a attribute reference
	 */
	public ElementaryRangeReference getAcctno2aReference() {
		return acctno2a.getReference();
	}

	/**
	 * Getter for acctno2a attribute.
	 * @return acctno2a attribute
	 */
	public String getAcctno2a() {
		return acctno2a.getValue();
	}

	/**
	 * Setter for acctno2a attribute.
	 * @param acctno2a the new value of acctno2a
	 */
	public void setAcctno2a(String acctno2a) {
		this.acctno2a.setValue(acctno2a);
	}
	/**
	 * Gets the reference for attribute acctno2i.
	 * @return the acctno2i attribute reference
	 */
	public ElementaryRangeReference getAcctno2iReference() {
		return acctno2i.getReference();
	}

	/**
	 * Getter for acctno2i attribute.
	 * @return acctno2i attribute
	 */
	public String getAcctno2i() {
		return acctno2i.getValue();
	}

	/**
	 * Setter for acctno2i attribute.
	 * @param acctno2i the new value of acctno2i
	 */
	public void setAcctno2i(String acctno2i) {
		this.acctno2i.setValue(acctno2i);
	}
	/**
	 * Gets the reference for attribute crdnum2l.
	 * @return the crdnum2l attribute reference
	 */
	public ElementaryRangeReference getCrdnum2lReference() {
		return crdnum2l.getReference();
	}

	/**
	 * Getter for crdnum2l attribute.
	 * @return crdnum2l attribute
	 */
	public int getCrdnum2l() {
		return crdnum2l.getValue();
	}

	/**
	 * Setter for crdnum2l attribute.
	 * @param crdnum2l the new value of crdnum2l
	 */
	public void setCrdnum2l(int crdnum2l) {
		this.crdnum2l.setValue(crdnum2l);
	}
	/**
	 * Gets the reference for attribute crdnum2f.
	 * @return the crdnum2f attribute reference
	 */
	public ElementaryRangeReference getCrdnum2fReference() {
		return crdnum2f.getReference();
	}

	/**
	 * Getter for crdnum2f attribute.
	 * @return crdnum2f attribute
	 */
	public String getCrdnum2f() {
		return crdnum2f.getValue();
	}

	/**
	 * Setter for crdnum2f attribute.
	 * @param crdnum2f the new value of crdnum2f
	 */
	public void setCrdnum2f(String crdnum2f) {
		this.crdnum2f.setValue(crdnum2f);
	}
	/**
	 * Gets the reference for attribute crdnum2a.
	 * @return the crdnum2a attribute reference
	 */
	public ElementaryRangeReference getCrdnum2aReference() {
		return crdnum2a.getReference();
	}

	/**
	 * Getter for crdnum2a attribute.
	 * @return crdnum2a attribute
	 */
	public String getCrdnum2a() {
		return crdnum2a.getValue();
	}

	/**
	 * Setter for crdnum2a attribute.
	 * @param crdnum2a the new value of crdnum2a
	 */
	public void setCrdnum2a(String crdnum2a) {
		this.crdnum2a.setValue(crdnum2a);
	}
	/**
	 * Gets the reference for attribute crdnum2i.
	 * @return the crdnum2i attribute reference
	 */
	public ElementaryRangeReference getCrdnum2iReference() {
		return crdnum2i.getReference();
	}

	/**
	 * Getter for crdnum2i attribute.
	 * @return crdnum2i attribute
	 */
	public String getCrdnum2i() {
		return crdnum2i.getValue();
	}

	/**
	 * Setter for crdnum2i attribute.
	 * @param crdnum2i the new value of crdnum2i
	 */
	public void setCrdnum2i(String crdnum2i) {
		this.crdnum2i.setValue(crdnum2i);
	}
	/**
	 * Gets the reference for attribute crdsts2l.
	 * @return the crdsts2l attribute reference
	 */
	public ElementaryRangeReference getCrdsts2lReference() {
		return crdsts2l.getReference();
	}

	/**
	 * Getter for crdsts2l attribute.
	 * @return crdsts2l attribute
	 */
	public int getCrdsts2l() {
		return crdsts2l.getValue();
	}

	/**
	 * Setter for crdsts2l attribute.
	 * @param crdsts2l the new value of crdsts2l
	 */
	public void setCrdsts2l(int crdsts2l) {
		this.crdsts2l.setValue(crdsts2l);
	}
	/**
	 * Gets the reference for attribute crdsts2f.
	 * @return the crdsts2f attribute reference
	 */
	public ElementaryRangeReference getCrdsts2fReference() {
		return crdsts2f.getReference();
	}

	/**
	 * Getter for crdsts2f attribute.
	 * @return crdsts2f attribute
	 */
	public String getCrdsts2f() {
		return crdsts2f.getValue();
	}

	/**
	 * Setter for crdsts2f attribute.
	 * @param crdsts2f the new value of crdsts2f
	 */
	public void setCrdsts2f(String crdsts2f) {
		this.crdsts2f.setValue(crdsts2f);
	}
	/**
	 * Gets the reference for attribute crdsts2a.
	 * @return the crdsts2a attribute reference
	 */
	public ElementaryRangeReference getCrdsts2aReference() {
		return crdsts2a.getReference();
	}

	/**
	 * Getter for crdsts2a attribute.
	 * @return crdsts2a attribute
	 */
	public String getCrdsts2a() {
		return crdsts2a.getValue();
	}

	/**
	 * Setter for crdsts2a attribute.
	 * @param crdsts2a the new value of crdsts2a
	 */
	public void setCrdsts2a(String crdsts2a) {
		this.crdsts2a.setValue(crdsts2a);
	}
	/**
	 * Gets the reference for attribute crdsts2i.
	 * @return the crdsts2i attribute reference
	 */
	public ElementaryRangeReference getCrdsts2iReference() {
		return crdsts2i.getReference();
	}

	/**
	 * Getter for crdsts2i attribute.
	 * @return crdsts2i attribute
	 */
	public String getCrdsts2i() {
		return crdsts2i.getValue();
	}

	/**
	 * Setter for crdsts2i attribute.
	 * @param crdsts2i the new value of crdsts2i
	 */
	public void setCrdsts2i(String crdsts2i) {
		this.crdsts2i.setValue(crdsts2i);
	}
	/**
	 * Gets the reference for attribute crdsel3l.
	 * @return the crdsel3l attribute reference
	 */
	public ElementaryRangeReference getCrdsel3lReference() {
		return crdsel3l.getReference();
	}

	/**
	 * Getter for crdsel3l attribute.
	 * @return crdsel3l attribute
	 */
	public int getCrdsel3l() {
		return crdsel3l.getValue();
	}

	/**
	 * Setter for crdsel3l attribute.
	 * @param crdsel3l the new value of crdsel3l
	 */
	public void setCrdsel3l(int crdsel3l) {
		this.crdsel3l.setValue(crdsel3l);
	}
	/**
	 * Gets the reference for attribute crdsel3f.
	 * @return the crdsel3f attribute reference
	 */
	public ElementaryRangeReference getCrdsel3fReference() {
		return crdsel3f.getReference();
	}

	/**
	 * Getter for crdsel3f attribute.
	 * @return crdsel3f attribute
	 */
	public String getCrdsel3f() {
		return crdsel3f.getValue();
	}

	/**
	 * Setter for crdsel3f attribute.
	 * @param crdsel3f the new value of crdsel3f
	 */
	public void setCrdsel3f(String crdsel3f) {
		this.crdsel3f.setValue(crdsel3f);
	}
	/**
	 * Gets the reference for attribute crdsel3a.
	 * @return the crdsel3a attribute reference
	 */
	public ElementaryRangeReference getCrdsel3aReference() {
		return crdsel3a.getReference();
	}

	/**
	 * Getter for crdsel3a attribute.
	 * @return crdsel3a attribute
	 */
	public String getCrdsel3a() {
		return crdsel3a.getValue();
	}

	/**
	 * Setter for crdsel3a attribute.
	 * @param crdsel3a the new value of crdsel3a
	 */
	public void setCrdsel3a(String crdsel3a) {
		this.crdsel3a.setValue(crdsel3a);
	}
	/**
	 * Gets the reference for attribute crdsel3i.
	 * @return the crdsel3i attribute reference
	 */
	public ElementaryRangeReference getCrdsel3iReference() {
		return crdsel3i.getReference();
	}

	/**
	 * Getter for crdsel3i attribute.
	 * @return crdsel3i attribute
	 */
	public String getCrdsel3i() {
		return crdsel3i.getValue();
	}

	/**
	 * Setter for crdsel3i attribute.
	 * @param crdsel3i the new value of crdsel3i
	 */
	public void setCrdsel3i(String crdsel3i) {
		this.crdsel3i.setValue(crdsel3i);
	}
	/**
	 * Gets the reference for attribute crdstp3l.
	 * @return the crdstp3l attribute reference
	 */
	public ElementaryRangeReference getCrdstp3lReference() {
		return crdstp3l.getReference();
	}

	/**
	 * Getter for crdstp3l attribute.
	 * @return crdstp3l attribute
	 */
	public int getCrdstp3l() {
		return crdstp3l.getValue();
	}

	/**
	 * Setter for crdstp3l attribute.
	 * @param crdstp3l the new value of crdstp3l
	 */
	public void setCrdstp3l(int crdstp3l) {
		this.crdstp3l.setValue(crdstp3l);
	}
	/**
	 * Gets the reference for attribute crdstp3f.
	 * @return the crdstp3f attribute reference
	 */
	public ElementaryRangeReference getCrdstp3fReference() {
		return crdstp3f.getReference();
	}

	/**
	 * Getter for crdstp3f attribute.
	 * @return crdstp3f attribute
	 */
	public String getCrdstp3f() {
		return crdstp3f.getValue();
	}

	/**
	 * Setter for crdstp3f attribute.
	 * @param crdstp3f the new value of crdstp3f
	 */
	public void setCrdstp3f(String crdstp3f) {
		this.crdstp3f.setValue(crdstp3f);
	}
	/**
	 * Gets the reference for attribute crdstp3a.
	 * @return the crdstp3a attribute reference
	 */
	public ElementaryRangeReference getCrdstp3aReference() {
		return crdstp3a.getReference();
	}

	/**
	 * Getter for crdstp3a attribute.
	 * @return crdstp3a attribute
	 */
	public String getCrdstp3a() {
		return crdstp3a.getValue();
	}

	/**
	 * Setter for crdstp3a attribute.
	 * @param crdstp3a the new value of crdstp3a
	 */
	public void setCrdstp3a(String crdstp3a) {
		this.crdstp3a.setValue(crdstp3a);
	}
	/**
	 * Gets the reference for attribute crdstp3i.
	 * @return the crdstp3i attribute reference
	 */
	public ElementaryRangeReference getCrdstp3iReference() {
		return crdstp3i.getReference();
	}

	/**
	 * Getter for crdstp3i attribute.
	 * @return crdstp3i attribute
	 */
	public String getCrdstp3i() {
		return crdstp3i.getValue();
	}

	/**
	 * Setter for crdstp3i attribute.
	 * @param crdstp3i the new value of crdstp3i
	 */
	public void setCrdstp3i(String crdstp3i) {
		this.crdstp3i.setValue(crdstp3i);
	}
	/**
	 * Gets the reference for attribute acctno3l.
	 * @return the acctno3l attribute reference
	 */
	public ElementaryRangeReference getAcctno3lReference() {
		return acctno3l.getReference();
	}

	/**
	 * Getter for acctno3l attribute.
	 * @return acctno3l attribute
	 */
	public int getAcctno3l() {
		return acctno3l.getValue();
	}

	/**
	 * Setter for acctno3l attribute.
	 * @param acctno3l the new value of acctno3l
	 */
	public void setAcctno3l(int acctno3l) {
		this.acctno3l.setValue(acctno3l);
	}
	/**
	 * Gets the reference for attribute acctno3f.
	 * @return the acctno3f attribute reference
	 */
	public ElementaryRangeReference getAcctno3fReference() {
		return acctno3f.getReference();
	}

	/**
	 * Getter for acctno3f attribute.
	 * @return acctno3f attribute
	 */
	public String getAcctno3f() {
		return acctno3f.getValue();
	}

	/**
	 * Setter for acctno3f attribute.
	 * @param acctno3f the new value of acctno3f
	 */
	public void setAcctno3f(String acctno3f) {
		this.acctno3f.setValue(acctno3f);
	}
	/**
	 * Gets the reference for attribute acctno3a.
	 * @return the acctno3a attribute reference
	 */
	public ElementaryRangeReference getAcctno3aReference() {
		return acctno3a.getReference();
	}

	/**
	 * Getter for acctno3a attribute.
	 * @return acctno3a attribute
	 */
	public String getAcctno3a() {
		return acctno3a.getValue();
	}

	/**
	 * Setter for acctno3a attribute.
	 * @param acctno3a the new value of acctno3a
	 */
	public void setAcctno3a(String acctno3a) {
		this.acctno3a.setValue(acctno3a);
	}
	/**
	 * Gets the reference for attribute acctno3i.
	 * @return the acctno3i attribute reference
	 */
	public ElementaryRangeReference getAcctno3iReference() {
		return acctno3i.getReference();
	}

	/**
	 * Getter for acctno3i attribute.
	 * @return acctno3i attribute
	 */
	public String getAcctno3i() {
		return acctno3i.getValue();
	}

	/**
	 * Setter for acctno3i attribute.
	 * @param acctno3i the new value of acctno3i
	 */
	public void setAcctno3i(String acctno3i) {
		this.acctno3i.setValue(acctno3i);
	}
	/**
	 * Gets the reference for attribute crdnum3l.
	 * @return the crdnum3l attribute reference
	 */
	public ElementaryRangeReference getCrdnum3lReference() {
		return crdnum3l.getReference();
	}

	/**
	 * Getter for crdnum3l attribute.
	 * @return crdnum3l attribute
	 */
	public int getCrdnum3l() {
		return crdnum3l.getValue();
	}

	/**
	 * Setter for crdnum3l attribute.
	 * @param crdnum3l the new value of crdnum3l
	 */
	public void setCrdnum3l(int crdnum3l) {
		this.crdnum3l.setValue(crdnum3l);
	}
	/**
	 * Gets the reference for attribute crdnum3f.
	 * @return the crdnum3f attribute reference
	 */
	public ElementaryRangeReference getCrdnum3fReference() {
		return crdnum3f.getReference();
	}

	/**
	 * Getter for crdnum3f attribute.
	 * @return crdnum3f attribute
	 */
	public String getCrdnum3f() {
		return crdnum3f.getValue();
	}

	/**
	 * Setter for crdnum3f attribute.
	 * @param crdnum3f the new value of crdnum3f
	 */
	public void setCrdnum3f(String crdnum3f) {
		this.crdnum3f.setValue(crdnum3f);
	}
	/**
	 * Gets the reference for attribute crdnum3a.
	 * @return the crdnum3a attribute reference
	 */
	public ElementaryRangeReference getCrdnum3aReference() {
		return crdnum3a.getReference();
	}

	/**
	 * Getter for crdnum3a attribute.
	 * @return crdnum3a attribute
	 */
	public String getCrdnum3a() {
		return crdnum3a.getValue();
	}

	/**
	 * Setter for crdnum3a attribute.
	 * @param crdnum3a the new value of crdnum3a
	 */
	public void setCrdnum3a(String crdnum3a) {
		this.crdnum3a.setValue(crdnum3a);
	}
	/**
	 * Gets the reference for attribute crdnum3i.
	 * @return the crdnum3i attribute reference
	 */
	public ElementaryRangeReference getCrdnum3iReference() {
		return crdnum3i.getReference();
	}

	/**
	 * Getter for crdnum3i attribute.
	 * @return crdnum3i attribute
	 */
	public String getCrdnum3i() {
		return crdnum3i.getValue();
	}

	/**
	 * Setter for crdnum3i attribute.
	 * @param crdnum3i the new value of crdnum3i
	 */
	public void setCrdnum3i(String crdnum3i) {
		this.crdnum3i.setValue(crdnum3i);
	}
	/**
	 * Gets the reference for attribute crdsts3l.
	 * @return the crdsts3l attribute reference
	 */
	public ElementaryRangeReference getCrdsts3lReference() {
		return crdsts3l.getReference();
	}

	/**
	 * Getter for crdsts3l attribute.
	 * @return crdsts3l attribute
	 */
	public int getCrdsts3l() {
		return crdsts3l.getValue();
	}

	/**
	 * Setter for crdsts3l attribute.
	 * @param crdsts3l the new value of crdsts3l
	 */
	public void setCrdsts3l(int crdsts3l) {
		this.crdsts3l.setValue(crdsts3l);
	}
	/**
	 * Gets the reference for attribute crdsts3f.
	 * @return the crdsts3f attribute reference
	 */
	public ElementaryRangeReference getCrdsts3fReference() {
		return crdsts3f.getReference();
	}

	/**
	 * Getter for crdsts3f attribute.
	 * @return crdsts3f attribute
	 */
	public String getCrdsts3f() {
		return crdsts3f.getValue();
	}

	/**
	 * Setter for crdsts3f attribute.
	 * @param crdsts3f the new value of crdsts3f
	 */
	public void setCrdsts3f(String crdsts3f) {
		this.crdsts3f.setValue(crdsts3f);
	}
	/**
	 * Gets the reference for attribute crdsts3a.
	 * @return the crdsts3a attribute reference
	 */
	public ElementaryRangeReference getCrdsts3aReference() {
		return crdsts3a.getReference();
	}

	/**
	 * Getter for crdsts3a attribute.
	 * @return crdsts3a attribute
	 */
	public String getCrdsts3a() {
		return crdsts3a.getValue();
	}

	/**
	 * Setter for crdsts3a attribute.
	 * @param crdsts3a the new value of crdsts3a
	 */
	public void setCrdsts3a(String crdsts3a) {
		this.crdsts3a.setValue(crdsts3a);
	}
	/**
	 * Gets the reference for attribute crdsts3i.
	 * @return the crdsts3i attribute reference
	 */
	public ElementaryRangeReference getCrdsts3iReference() {
		return crdsts3i.getReference();
	}

	/**
	 * Getter for crdsts3i attribute.
	 * @return crdsts3i attribute
	 */
	public String getCrdsts3i() {
		return crdsts3i.getValue();
	}

	/**
	 * Setter for crdsts3i attribute.
	 * @param crdsts3i the new value of crdsts3i
	 */
	public void setCrdsts3i(String crdsts3i) {
		this.crdsts3i.setValue(crdsts3i);
	}
	/**
	 * Gets the reference for attribute crdsel4l.
	 * @return the crdsel4l attribute reference
	 */
	public ElementaryRangeReference getCrdsel4lReference() {
		return crdsel4l.getReference();
	}

	/**
	 * Getter for crdsel4l attribute.
	 * @return crdsel4l attribute
	 */
	public int getCrdsel4l() {
		return crdsel4l.getValue();
	}

	/**
	 * Setter for crdsel4l attribute.
	 * @param crdsel4l the new value of crdsel4l
	 */
	public void setCrdsel4l(int crdsel4l) {
		this.crdsel4l.setValue(crdsel4l);
	}
	/**
	 * Gets the reference for attribute crdsel4f.
	 * @return the crdsel4f attribute reference
	 */
	public ElementaryRangeReference getCrdsel4fReference() {
		return crdsel4f.getReference();
	}

	/**
	 * Getter for crdsel4f attribute.
	 * @return crdsel4f attribute
	 */
	public String getCrdsel4f() {
		return crdsel4f.getValue();
	}

	/**
	 * Setter for crdsel4f attribute.
	 * @param crdsel4f the new value of crdsel4f
	 */
	public void setCrdsel4f(String crdsel4f) {
		this.crdsel4f.setValue(crdsel4f);
	}
	/**
	 * Gets the reference for attribute crdsel4a.
	 * @return the crdsel4a attribute reference
	 */
	public ElementaryRangeReference getCrdsel4aReference() {
		return crdsel4a.getReference();
	}

	/**
	 * Getter for crdsel4a attribute.
	 * @return crdsel4a attribute
	 */
	public String getCrdsel4a() {
		return crdsel4a.getValue();
	}

	/**
	 * Setter for crdsel4a attribute.
	 * @param crdsel4a the new value of crdsel4a
	 */
	public void setCrdsel4a(String crdsel4a) {
		this.crdsel4a.setValue(crdsel4a);
	}
	/**
	 * Gets the reference for attribute crdsel4i.
	 * @return the crdsel4i attribute reference
	 */
	public ElementaryRangeReference getCrdsel4iReference() {
		return crdsel4i.getReference();
	}

	/**
	 * Getter for crdsel4i attribute.
	 * @return crdsel4i attribute
	 */
	public String getCrdsel4i() {
		return crdsel4i.getValue();
	}

	/**
	 * Setter for crdsel4i attribute.
	 * @param crdsel4i the new value of crdsel4i
	 */
	public void setCrdsel4i(String crdsel4i) {
		this.crdsel4i.setValue(crdsel4i);
	}
	/**
	 * Gets the reference for attribute crdstp4l.
	 * @return the crdstp4l attribute reference
	 */
	public ElementaryRangeReference getCrdstp4lReference() {
		return crdstp4l.getReference();
	}

	/**
	 * Getter for crdstp4l attribute.
	 * @return crdstp4l attribute
	 */
	public int getCrdstp4l() {
		return crdstp4l.getValue();
	}

	/**
	 * Setter for crdstp4l attribute.
	 * @param crdstp4l the new value of crdstp4l
	 */
	public void setCrdstp4l(int crdstp4l) {
		this.crdstp4l.setValue(crdstp4l);
	}
	/**
	 * Gets the reference for attribute crdstp4f.
	 * @return the crdstp4f attribute reference
	 */
	public ElementaryRangeReference getCrdstp4fReference() {
		return crdstp4f.getReference();
	}

	/**
	 * Getter for crdstp4f attribute.
	 * @return crdstp4f attribute
	 */
	public String getCrdstp4f() {
		return crdstp4f.getValue();
	}

	/**
	 * Setter for crdstp4f attribute.
	 * @param crdstp4f the new value of crdstp4f
	 */
	public void setCrdstp4f(String crdstp4f) {
		this.crdstp4f.setValue(crdstp4f);
	}
	/**
	 * Gets the reference for attribute crdstp4a.
	 * @return the crdstp4a attribute reference
	 */
	public ElementaryRangeReference getCrdstp4aReference() {
		return crdstp4a.getReference();
	}

	/**
	 * Getter for crdstp4a attribute.
	 * @return crdstp4a attribute
	 */
	public String getCrdstp4a() {
		return crdstp4a.getValue();
	}

	/**
	 * Setter for crdstp4a attribute.
	 * @param crdstp4a the new value of crdstp4a
	 */
	public void setCrdstp4a(String crdstp4a) {
		this.crdstp4a.setValue(crdstp4a);
	}
	/**
	 * Gets the reference for attribute crdstp4i.
	 * @return the crdstp4i attribute reference
	 */
	public ElementaryRangeReference getCrdstp4iReference() {
		return crdstp4i.getReference();
	}

	/**
	 * Getter for crdstp4i attribute.
	 * @return crdstp4i attribute
	 */
	public String getCrdstp4i() {
		return crdstp4i.getValue();
	}

	/**
	 * Setter for crdstp4i attribute.
	 * @param crdstp4i the new value of crdstp4i
	 */
	public void setCrdstp4i(String crdstp4i) {
		this.crdstp4i.setValue(crdstp4i);
	}
	/**
	 * Gets the reference for attribute acctno4l.
	 * @return the acctno4l attribute reference
	 */
	public ElementaryRangeReference getAcctno4lReference() {
		return acctno4l.getReference();
	}

	/**
	 * Getter for acctno4l attribute.
	 * @return acctno4l attribute
	 */
	public int getAcctno4l() {
		return acctno4l.getValue();
	}

	/**
	 * Setter for acctno4l attribute.
	 * @param acctno4l the new value of acctno4l
	 */
	public void setAcctno4l(int acctno4l) {
		this.acctno4l.setValue(acctno4l);
	}
	/**
	 * Gets the reference for attribute acctno4f.
	 * @return the acctno4f attribute reference
	 */
	public ElementaryRangeReference getAcctno4fReference() {
		return acctno4f.getReference();
	}

	/**
	 * Getter for acctno4f attribute.
	 * @return acctno4f attribute
	 */
	public String getAcctno4f() {
		return acctno4f.getValue();
	}

	/**
	 * Setter for acctno4f attribute.
	 * @param acctno4f the new value of acctno4f
	 */
	public void setAcctno4f(String acctno4f) {
		this.acctno4f.setValue(acctno4f);
	}
	/**
	 * Gets the reference for attribute acctno4a.
	 * @return the acctno4a attribute reference
	 */
	public ElementaryRangeReference getAcctno4aReference() {
		return acctno4a.getReference();
	}

	/**
	 * Getter for acctno4a attribute.
	 * @return acctno4a attribute
	 */
	public String getAcctno4a() {
		return acctno4a.getValue();
	}

	/**
	 * Setter for acctno4a attribute.
	 * @param acctno4a the new value of acctno4a
	 */
	public void setAcctno4a(String acctno4a) {
		this.acctno4a.setValue(acctno4a);
	}
	/**
	 * Gets the reference for attribute acctno4i.
	 * @return the acctno4i attribute reference
	 */
	public ElementaryRangeReference getAcctno4iReference() {
		return acctno4i.getReference();
	}

	/**
	 * Getter for acctno4i attribute.
	 * @return acctno4i attribute
	 */
	public String getAcctno4i() {
		return acctno4i.getValue();
	}

	/**
	 * Setter for acctno4i attribute.
	 * @param acctno4i the new value of acctno4i
	 */
	public void setAcctno4i(String acctno4i) {
		this.acctno4i.setValue(acctno4i);
	}
	/**
	 * Gets the reference for attribute crdnum4l.
	 * @return the crdnum4l attribute reference
	 */
	public ElementaryRangeReference getCrdnum4lReference() {
		return crdnum4l.getReference();
	}

	/**
	 * Getter for crdnum4l attribute.
	 * @return crdnum4l attribute
	 */
	public int getCrdnum4l() {
		return crdnum4l.getValue();
	}

	/**
	 * Setter for crdnum4l attribute.
	 * @param crdnum4l the new value of crdnum4l
	 */
	public void setCrdnum4l(int crdnum4l) {
		this.crdnum4l.setValue(crdnum4l);
	}
	/**
	 * Gets the reference for attribute crdnum4f.
	 * @return the crdnum4f attribute reference
	 */
	public ElementaryRangeReference getCrdnum4fReference() {
		return crdnum4f.getReference();
	}

	/**
	 * Getter for crdnum4f attribute.
	 * @return crdnum4f attribute
	 */
	public String getCrdnum4f() {
		return crdnum4f.getValue();
	}

	/**
	 * Setter for crdnum4f attribute.
	 * @param crdnum4f the new value of crdnum4f
	 */
	public void setCrdnum4f(String crdnum4f) {
		this.crdnum4f.setValue(crdnum4f);
	}
	/**
	 * Gets the reference for attribute crdnum4a.
	 * @return the crdnum4a attribute reference
	 */
	public ElementaryRangeReference getCrdnum4aReference() {
		return crdnum4a.getReference();
	}

	/**
	 * Getter for crdnum4a attribute.
	 * @return crdnum4a attribute
	 */
	public String getCrdnum4a() {
		return crdnum4a.getValue();
	}

	/**
	 * Setter for crdnum4a attribute.
	 * @param crdnum4a the new value of crdnum4a
	 */
	public void setCrdnum4a(String crdnum4a) {
		this.crdnum4a.setValue(crdnum4a);
	}
	/**
	 * Gets the reference for attribute crdnum4i.
	 * @return the crdnum4i attribute reference
	 */
	public ElementaryRangeReference getCrdnum4iReference() {
		return crdnum4i.getReference();
	}

	/**
	 * Getter for crdnum4i attribute.
	 * @return crdnum4i attribute
	 */
	public String getCrdnum4i() {
		return crdnum4i.getValue();
	}

	/**
	 * Setter for crdnum4i attribute.
	 * @param crdnum4i the new value of crdnum4i
	 */
	public void setCrdnum4i(String crdnum4i) {
		this.crdnum4i.setValue(crdnum4i);
	}
	/**
	 * Gets the reference for attribute crdsts4l.
	 * @return the crdsts4l attribute reference
	 */
	public ElementaryRangeReference getCrdsts4lReference() {
		return crdsts4l.getReference();
	}

	/**
	 * Getter for crdsts4l attribute.
	 * @return crdsts4l attribute
	 */
	public int getCrdsts4l() {
		return crdsts4l.getValue();
	}

	/**
	 * Setter for crdsts4l attribute.
	 * @param crdsts4l the new value of crdsts4l
	 */
	public void setCrdsts4l(int crdsts4l) {
		this.crdsts4l.setValue(crdsts4l);
	}
	/**
	 * Gets the reference for attribute crdsts4f.
	 * @return the crdsts4f attribute reference
	 */
	public ElementaryRangeReference getCrdsts4fReference() {
		return crdsts4f.getReference();
	}

	/**
	 * Getter for crdsts4f attribute.
	 * @return crdsts4f attribute
	 */
	public String getCrdsts4f() {
		return crdsts4f.getValue();
	}

	/**
	 * Setter for crdsts4f attribute.
	 * @param crdsts4f the new value of crdsts4f
	 */
	public void setCrdsts4f(String crdsts4f) {
		this.crdsts4f.setValue(crdsts4f);
	}
	/**
	 * Gets the reference for attribute crdsts4a.
	 * @return the crdsts4a attribute reference
	 */
	public ElementaryRangeReference getCrdsts4aReference() {
		return crdsts4a.getReference();
	}

	/**
	 * Getter for crdsts4a attribute.
	 * @return crdsts4a attribute
	 */
	public String getCrdsts4a() {
		return crdsts4a.getValue();
	}

	/**
	 * Setter for crdsts4a attribute.
	 * @param crdsts4a the new value of crdsts4a
	 */
	public void setCrdsts4a(String crdsts4a) {
		this.crdsts4a.setValue(crdsts4a);
	}
	/**
	 * Gets the reference for attribute crdsts4i.
	 * @return the crdsts4i attribute reference
	 */
	public ElementaryRangeReference getCrdsts4iReference() {
		return crdsts4i.getReference();
	}

	/**
	 * Getter for crdsts4i attribute.
	 * @return crdsts4i attribute
	 */
	public String getCrdsts4i() {
		return crdsts4i.getValue();
	}

	/**
	 * Setter for crdsts4i attribute.
	 * @param crdsts4i the new value of crdsts4i
	 */
	public void setCrdsts4i(String crdsts4i) {
		this.crdsts4i.setValue(crdsts4i);
	}
	/**
	 * Gets the reference for attribute crdsel5l.
	 * @return the crdsel5l attribute reference
	 */
	public ElementaryRangeReference getCrdsel5lReference() {
		return crdsel5l.getReference();
	}

	/**
	 * Getter for crdsel5l attribute.
	 * @return crdsel5l attribute
	 */
	public int getCrdsel5l() {
		return crdsel5l.getValue();
	}

	/**
	 * Setter for crdsel5l attribute.
	 * @param crdsel5l the new value of crdsel5l
	 */
	public void setCrdsel5l(int crdsel5l) {
		this.crdsel5l.setValue(crdsel5l);
	}
	/**
	 * Gets the reference for attribute crdsel5f.
	 * @return the crdsel5f attribute reference
	 */
	public ElementaryRangeReference getCrdsel5fReference() {
		return crdsel5f.getReference();
	}

	/**
	 * Getter for crdsel5f attribute.
	 * @return crdsel5f attribute
	 */
	public String getCrdsel5f() {
		return crdsel5f.getValue();
	}

	/**
	 * Setter for crdsel5f attribute.
	 * @param crdsel5f the new value of crdsel5f
	 */
	public void setCrdsel5f(String crdsel5f) {
		this.crdsel5f.setValue(crdsel5f);
	}
	/**
	 * Gets the reference for attribute crdsel5a.
	 * @return the crdsel5a attribute reference
	 */
	public ElementaryRangeReference getCrdsel5aReference() {
		return crdsel5a.getReference();
	}

	/**
	 * Getter for crdsel5a attribute.
	 * @return crdsel5a attribute
	 */
	public String getCrdsel5a() {
		return crdsel5a.getValue();
	}

	/**
	 * Setter for crdsel5a attribute.
	 * @param crdsel5a the new value of crdsel5a
	 */
	public void setCrdsel5a(String crdsel5a) {
		this.crdsel5a.setValue(crdsel5a);
	}
	/**
	 * Gets the reference for attribute crdsel5i.
	 * @return the crdsel5i attribute reference
	 */
	public ElementaryRangeReference getCrdsel5iReference() {
		return crdsel5i.getReference();
	}

	/**
	 * Getter for crdsel5i attribute.
	 * @return crdsel5i attribute
	 */
	public String getCrdsel5i() {
		return crdsel5i.getValue();
	}

	/**
	 * Setter for crdsel5i attribute.
	 * @param crdsel5i the new value of crdsel5i
	 */
	public void setCrdsel5i(String crdsel5i) {
		this.crdsel5i.setValue(crdsel5i);
	}
	/**
	 * Gets the reference for attribute crdstp5l.
	 * @return the crdstp5l attribute reference
	 */
	public ElementaryRangeReference getCrdstp5lReference() {
		return crdstp5l.getReference();
	}

	/**
	 * Getter for crdstp5l attribute.
	 * @return crdstp5l attribute
	 */
	public int getCrdstp5l() {
		return crdstp5l.getValue();
	}

	/**
	 * Setter for crdstp5l attribute.
	 * @param crdstp5l the new value of crdstp5l
	 */
	public void setCrdstp5l(int crdstp5l) {
		this.crdstp5l.setValue(crdstp5l);
	}
	/**
	 * Gets the reference for attribute crdstp5f.
	 * @return the crdstp5f attribute reference
	 */
	public ElementaryRangeReference getCrdstp5fReference() {
		return crdstp5f.getReference();
	}

	/**
	 * Getter for crdstp5f attribute.
	 * @return crdstp5f attribute
	 */
	public String getCrdstp5f() {
		return crdstp5f.getValue();
	}

	/**
	 * Setter for crdstp5f attribute.
	 * @param crdstp5f the new value of crdstp5f
	 */
	public void setCrdstp5f(String crdstp5f) {
		this.crdstp5f.setValue(crdstp5f);
	}
	/**
	 * Gets the reference for attribute crdstp5a.
	 * @return the crdstp5a attribute reference
	 */
	public ElementaryRangeReference getCrdstp5aReference() {
		return crdstp5a.getReference();
	}

	/**
	 * Getter for crdstp5a attribute.
	 * @return crdstp5a attribute
	 */
	public String getCrdstp5a() {
		return crdstp5a.getValue();
	}

	/**
	 * Setter for crdstp5a attribute.
	 * @param crdstp5a the new value of crdstp5a
	 */
	public void setCrdstp5a(String crdstp5a) {
		this.crdstp5a.setValue(crdstp5a);
	}
	/**
	 * Gets the reference for attribute crdstp5i.
	 * @return the crdstp5i attribute reference
	 */
	public ElementaryRangeReference getCrdstp5iReference() {
		return crdstp5i.getReference();
	}

	/**
	 * Getter for crdstp5i attribute.
	 * @return crdstp5i attribute
	 */
	public String getCrdstp5i() {
		return crdstp5i.getValue();
	}

	/**
	 * Setter for crdstp5i attribute.
	 * @param crdstp5i the new value of crdstp5i
	 */
	public void setCrdstp5i(String crdstp5i) {
		this.crdstp5i.setValue(crdstp5i);
	}
	/**
	 * Gets the reference for attribute acctno5l.
	 * @return the acctno5l attribute reference
	 */
	public ElementaryRangeReference getAcctno5lReference() {
		return acctno5l.getReference();
	}

	/**
	 * Getter for acctno5l attribute.
	 * @return acctno5l attribute
	 */
	public int getAcctno5l() {
		return acctno5l.getValue();
	}

	/**
	 * Setter for acctno5l attribute.
	 * @param acctno5l the new value of acctno5l
	 */
	public void setAcctno5l(int acctno5l) {
		this.acctno5l.setValue(acctno5l);
	}
	/**
	 * Gets the reference for attribute acctno5f.
	 * @return the acctno5f attribute reference
	 */
	public ElementaryRangeReference getAcctno5fReference() {
		return acctno5f.getReference();
	}

	/**
	 * Getter for acctno5f attribute.
	 * @return acctno5f attribute
	 */
	public String getAcctno5f() {
		return acctno5f.getValue();
	}

	/**
	 * Setter for acctno5f attribute.
	 * @param acctno5f the new value of acctno5f
	 */
	public void setAcctno5f(String acctno5f) {
		this.acctno5f.setValue(acctno5f);
	}
	/**
	 * Gets the reference for attribute acctno5a.
	 * @return the acctno5a attribute reference
	 */
	public ElementaryRangeReference getAcctno5aReference() {
		return acctno5a.getReference();
	}

	/**
	 * Getter for acctno5a attribute.
	 * @return acctno5a attribute
	 */
	public String getAcctno5a() {
		return acctno5a.getValue();
	}

	/**
	 * Setter for acctno5a attribute.
	 * @param acctno5a the new value of acctno5a
	 */
	public void setAcctno5a(String acctno5a) {
		this.acctno5a.setValue(acctno5a);
	}
	/**
	 * Gets the reference for attribute acctno5i.
	 * @return the acctno5i attribute reference
	 */
	public ElementaryRangeReference getAcctno5iReference() {
		return acctno5i.getReference();
	}

	/**
	 * Getter for acctno5i attribute.
	 * @return acctno5i attribute
	 */
	public String getAcctno5i() {
		return acctno5i.getValue();
	}

	/**
	 * Setter for acctno5i attribute.
	 * @param acctno5i the new value of acctno5i
	 */
	public void setAcctno5i(String acctno5i) {
		this.acctno5i.setValue(acctno5i);
	}
	/**
	 * Gets the reference for attribute crdnum5l.
	 * @return the crdnum5l attribute reference
	 */
	public ElementaryRangeReference getCrdnum5lReference() {
		return crdnum5l.getReference();
	}

	/**
	 * Getter for crdnum5l attribute.
	 * @return crdnum5l attribute
	 */
	public int getCrdnum5l() {
		return crdnum5l.getValue();
	}

	/**
	 * Setter for crdnum5l attribute.
	 * @param crdnum5l the new value of crdnum5l
	 */
	public void setCrdnum5l(int crdnum5l) {
		this.crdnum5l.setValue(crdnum5l);
	}
	/**
	 * Gets the reference for attribute crdnum5f.
	 * @return the crdnum5f attribute reference
	 */
	public ElementaryRangeReference getCrdnum5fReference() {
		return crdnum5f.getReference();
	}

	/**
	 * Getter for crdnum5f attribute.
	 * @return crdnum5f attribute
	 */
	public String getCrdnum5f() {
		return crdnum5f.getValue();
	}

	/**
	 * Setter for crdnum5f attribute.
	 * @param crdnum5f the new value of crdnum5f
	 */
	public void setCrdnum5f(String crdnum5f) {
		this.crdnum5f.setValue(crdnum5f);
	}
	/**
	 * Gets the reference for attribute crdnum5a.
	 * @return the crdnum5a attribute reference
	 */
	public ElementaryRangeReference getCrdnum5aReference() {
		return crdnum5a.getReference();
	}

	/**
	 * Getter for crdnum5a attribute.
	 * @return crdnum5a attribute
	 */
	public String getCrdnum5a() {
		return crdnum5a.getValue();
	}

	/**
	 * Setter for crdnum5a attribute.
	 * @param crdnum5a the new value of crdnum5a
	 */
	public void setCrdnum5a(String crdnum5a) {
		this.crdnum5a.setValue(crdnum5a);
	}
	/**
	 * Gets the reference for attribute crdnum5i.
	 * @return the crdnum5i attribute reference
	 */
	public ElementaryRangeReference getCrdnum5iReference() {
		return crdnum5i.getReference();
	}

	/**
	 * Getter for crdnum5i attribute.
	 * @return crdnum5i attribute
	 */
	public String getCrdnum5i() {
		return crdnum5i.getValue();
	}

	/**
	 * Setter for crdnum5i attribute.
	 * @param crdnum5i the new value of crdnum5i
	 */
	public void setCrdnum5i(String crdnum5i) {
		this.crdnum5i.setValue(crdnum5i);
	}
	/**
	 * Gets the reference for attribute crdsts5l.
	 * @return the crdsts5l attribute reference
	 */
	public ElementaryRangeReference getCrdsts5lReference() {
		return crdsts5l.getReference();
	}

	/**
	 * Getter for crdsts5l attribute.
	 * @return crdsts5l attribute
	 */
	public int getCrdsts5l() {
		return crdsts5l.getValue();
	}

	/**
	 * Setter for crdsts5l attribute.
	 * @param crdsts5l the new value of crdsts5l
	 */
	public void setCrdsts5l(int crdsts5l) {
		this.crdsts5l.setValue(crdsts5l);
	}
	/**
	 * Gets the reference for attribute crdsts5f.
	 * @return the crdsts5f attribute reference
	 */
	public ElementaryRangeReference getCrdsts5fReference() {
		return crdsts5f.getReference();
	}

	/**
	 * Getter for crdsts5f attribute.
	 * @return crdsts5f attribute
	 */
	public String getCrdsts5f() {
		return crdsts5f.getValue();
	}

	/**
	 * Setter for crdsts5f attribute.
	 * @param crdsts5f the new value of crdsts5f
	 */
	public void setCrdsts5f(String crdsts5f) {
		this.crdsts5f.setValue(crdsts5f);
	}
	/**
	 * Gets the reference for attribute crdsts5a.
	 * @return the crdsts5a attribute reference
	 */
	public ElementaryRangeReference getCrdsts5aReference() {
		return crdsts5a.getReference();
	}

	/**
	 * Getter for crdsts5a attribute.
	 * @return crdsts5a attribute
	 */
	public String getCrdsts5a() {
		return crdsts5a.getValue();
	}

	/**
	 * Setter for crdsts5a attribute.
	 * @param crdsts5a the new value of crdsts5a
	 */
	public void setCrdsts5a(String crdsts5a) {
		this.crdsts5a.setValue(crdsts5a);
	}
	/**
	 * Gets the reference for attribute crdsts5i.
	 * @return the crdsts5i attribute reference
	 */
	public ElementaryRangeReference getCrdsts5iReference() {
		return crdsts5i.getReference();
	}

	/**
	 * Getter for crdsts5i attribute.
	 * @return crdsts5i attribute
	 */
	public String getCrdsts5i() {
		return crdsts5i.getValue();
	}

	/**
	 * Setter for crdsts5i attribute.
	 * @param crdsts5i the new value of crdsts5i
	 */
	public void setCrdsts5i(String crdsts5i) {
		this.crdsts5i.setValue(crdsts5i);
	}
	/**
	 * Gets the reference for attribute crdsel6l.
	 * @return the crdsel6l attribute reference
	 */
	public ElementaryRangeReference getCrdsel6lReference() {
		return crdsel6l.getReference();
	}

	/**
	 * Getter for crdsel6l attribute.
	 * @return crdsel6l attribute
	 */
	public int getCrdsel6l() {
		return crdsel6l.getValue();
	}

	/**
	 * Setter for crdsel6l attribute.
	 * @param crdsel6l the new value of crdsel6l
	 */
	public void setCrdsel6l(int crdsel6l) {
		this.crdsel6l.setValue(crdsel6l);
	}
	/**
	 * Gets the reference for attribute crdsel6f.
	 * @return the crdsel6f attribute reference
	 */
	public ElementaryRangeReference getCrdsel6fReference() {
		return crdsel6f.getReference();
	}

	/**
	 * Getter for crdsel6f attribute.
	 * @return crdsel6f attribute
	 */
	public String getCrdsel6f() {
		return crdsel6f.getValue();
	}

	/**
	 * Setter for crdsel6f attribute.
	 * @param crdsel6f the new value of crdsel6f
	 */
	public void setCrdsel6f(String crdsel6f) {
		this.crdsel6f.setValue(crdsel6f);
	}
	/**
	 * Gets the reference for attribute crdsel6a.
	 * @return the crdsel6a attribute reference
	 */
	public ElementaryRangeReference getCrdsel6aReference() {
		return crdsel6a.getReference();
	}

	/**
	 * Getter for crdsel6a attribute.
	 * @return crdsel6a attribute
	 */
	public String getCrdsel6a() {
		return crdsel6a.getValue();
	}

	/**
	 * Setter for crdsel6a attribute.
	 * @param crdsel6a the new value of crdsel6a
	 */
	public void setCrdsel6a(String crdsel6a) {
		this.crdsel6a.setValue(crdsel6a);
	}
	/**
	 * Gets the reference for attribute crdsel6i.
	 * @return the crdsel6i attribute reference
	 */
	public ElementaryRangeReference getCrdsel6iReference() {
		return crdsel6i.getReference();
	}

	/**
	 * Getter for crdsel6i attribute.
	 * @return crdsel6i attribute
	 */
	public String getCrdsel6i() {
		return crdsel6i.getValue();
	}

	/**
	 * Setter for crdsel6i attribute.
	 * @param crdsel6i the new value of crdsel6i
	 */
	public void setCrdsel6i(String crdsel6i) {
		this.crdsel6i.setValue(crdsel6i);
	}
	/**
	 * Gets the reference for attribute crdstp6l.
	 * @return the crdstp6l attribute reference
	 */
	public ElementaryRangeReference getCrdstp6lReference() {
		return crdstp6l.getReference();
	}

	/**
	 * Getter for crdstp6l attribute.
	 * @return crdstp6l attribute
	 */
	public int getCrdstp6l() {
		return crdstp6l.getValue();
	}

	/**
	 * Setter for crdstp6l attribute.
	 * @param crdstp6l the new value of crdstp6l
	 */
	public void setCrdstp6l(int crdstp6l) {
		this.crdstp6l.setValue(crdstp6l);
	}
	/**
	 * Gets the reference for attribute crdstp6f.
	 * @return the crdstp6f attribute reference
	 */
	public ElementaryRangeReference getCrdstp6fReference() {
		return crdstp6f.getReference();
	}

	/**
	 * Getter for crdstp6f attribute.
	 * @return crdstp6f attribute
	 */
	public String getCrdstp6f() {
		return crdstp6f.getValue();
	}

	/**
	 * Setter for crdstp6f attribute.
	 * @param crdstp6f the new value of crdstp6f
	 */
	public void setCrdstp6f(String crdstp6f) {
		this.crdstp6f.setValue(crdstp6f);
	}
	/**
	 * Gets the reference for attribute crdstp6a.
	 * @return the crdstp6a attribute reference
	 */
	public ElementaryRangeReference getCrdstp6aReference() {
		return crdstp6a.getReference();
	}

	/**
	 * Getter for crdstp6a attribute.
	 * @return crdstp6a attribute
	 */
	public String getCrdstp6a() {
		return crdstp6a.getValue();
	}

	/**
	 * Setter for crdstp6a attribute.
	 * @param crdstp6a the new value of crdstp6a
	 */
	public void setCrdstp6a(String crdstp6a) {
		this.crdstp6a.setValue(crdstp6a);
	}
	/**
	 * Gets the reference for attribute crdstp6i.
	 * @return the crdstp6i attribute reference
	 */
	public ElementaryRangeReference getCrdstp6iReference() {
		return crdstp6i.getReference();
	}

	/**
	 * Getter for crdstp6i attribute.
	 * @return crdstp6i attribute
	 */
	public String getCrdstp6i() {
		return crdstp6i.getValue();
	}

	/**
	 * Setter for crdstp6i attribute.
	 * @param crdstp6i the new value of crdstp6i
	 */
	public void setCrdstp6i(String crdstp6i) {
		this.crdstp6i.setValue(crdstp6i);
	}
	/**
	 * Gets the reference for attribute acctno6l.
	 * @return the acctno6l attribute reference
	 */
	public ElementaryRangeReference getAcctno6lReference() {
		return acctno6l.getReference();
	}

	/**
	 * Getter for acctno6l attribute.
	 * @return acctno6l attribute
	 */
	public int getAcctno6l() {
		return acctno6l.getValue();
	}

	/**
	 * Setter for acctno6l attribute.
	 * @param acctno6l the new value of acctno6l
	 */
	public void setAcctno6l(int acctno6l) {
		this.acctno6l.setValue(acctno6l);
	}
	/**
	 * Gets the reference for attribute acctno6f.
	 * @return the acctno6f attribute reference
	 */
	public ElementaryRangeReference getAcctno6fReference() {
		return acctno6f.getReference();
	}

	/**
	 * Getter for acctno6f attribute.
	 * @return acctno6f attribute
	 */
	public String getAcctno6f() {
		return acctno6f.getValue();
	}

	/**
	 * Setter for acctno6f attribute.
	 * @param acctno6f the new value of acctno6f
	 */
	public void setAcctno6f(String acctno6f) {
		this.acctno6f.setValue(acctno6f);
	}
	/**
	 * Gets the reference for attribute acctno6a.
	 * @return the acctno6a attribute reference
	 */
	public ElementaryRangeReference getAcctno6aReference() {
		return acctno6a.getReference();
	}

	/**
	 * Getter for acctno6a attribute.
	 * @return acctno6a attribute
	 */
	public String getAcctno6a() {
		return acctno6a.getValue();
	}

	/**
	 * Setter for acctno6a attribute.
	 * @param acctno6a the new value of acctno6a
	 */
	public void setAcctno6a(String acctno6a) {
		this.acctno6a.setValue(acctno6a);
	}
	/**
	 * Gets the reference for attribute acctno6i.
	 * @return the acctno6i attribute reference
	 */
	public ElementaryRangeReference getAcctno6iReference() {
		return acctno6i.getReference();
	}

	/**
	 * Getter for acctno6i attribute.
	 * @return acctno6i attribute
	 */
	public String getAcctno6i() {
		return acctno6i.getValue();
	}

	/**
	 * Setter for acctno6i attribute.
	 * @param acctno6i the new value of acctno6i
	 */
	public void setAcctno6i(String acctno6i) {
		this.acctno6i.setValue(acctno6i);
	}
	/**
	 * Gets the reference for attribute crdnum6l.
	 * @return the crdnum6l attribute reference
	 */
	public ElementaryRangeReference getCrdnum6lReference() {
		return crdnum6l.getReference();
	}

	/**
	 * Getter for crdnum6l attribute.
	 * @return crdnum6l attribute
	 */
	public int getCrdnum6l() {
		return crdnum6l.getValue();
	}

	/**
	 * Setter for crdnum6l attribute.
	 * @param crdnum6l the new value of crdnum6l
	 */
	public void setCrdnum6l(int crdnum6l) {
		this.crdnum6l.setValue(crdnum6l);
	}
	/**
	 * Gets the reference for attribute crdnum6f.
	 * @return the crdnum6f attribute reference
	 */
	public ElementaryRangeReference getCrdnum6fReference() {
		return crdnum6f.getReference();
	}

	/**
	 * Getter for crdnum6f attribute.
	 * @return crdnum6f attribute
	 */
	public String getCrdnum6f() {
		return crdnum6f.getValue();
	}

	/**
	 * Setter for crdnum6f attribute.
	 * @param crdnum6f the new value of crdnum6f
	 */
	public void setCrdnum6f(String crdnum6f) {
		this.crdnum6f.setValue(crdnum6f);
	}
	/**
	 * Gets the reference for attribute crdnum6a.
	 * @return the crdnum6a attribute reference
	 */
	public ElementaryRangeReference getCrdnum6aReference() {
		return crdnum6a.getReference();
	}

	/**
	 * Getter for crdnum6a attribute.
	 * @return crdnum6a attribute
	 */
	public String getCrdnum6a() {
		return crdnum6a.getValue();
	}

	/**
	 * Setter for crdnum6a attribute.
	 * @param crdnum6a the new value of crdnum6a
	 */
	public void setCrdnum6a(String crdnum6a) {
		this.crdnum6a.setValue(crdnum6a);
	}
	/**
	 * Gets the reference for attribute crdnum6i.
	 * @return the crdnum6i attribute reference
	 */
	public ElementaryRangeReference getCrdnum6iReference() {
		return crdnum6i.getReference();
	}

	/**
	 * Getter for crdnum6i attribute.
	 * @return crdnum6i attribute
	 */
	public String getCrdnum6i() {
		return crdnum6i.getValue();
	}

	/**
	 * Setter for crdnum6i attribute.
	 * @param crdnum6i the new value of crdnum6i
	 */
	public void setCrdnum6i(String crdnum6i) {
		this.crdnum6i.setValue(crdnum6i);
	}
	/**
	 * Gets the reference for attribute crdsts6l.
	 * @return the crdsts6l attribute reference
	 */
	public ElementaryRangeReference getCrdsts6lReference() {
		return crdsts6l.getReference();
	}

	/**
	 * Getter for crdsts6l attribute.
	 * @return crdsts6l attribute
	 */
	public int getCrdsts6l() {
		return crdsts6l.getValue();
	}

	/**
	 * Setter for crdsts6l attribute.
	 * @param crdsts6l the new value of crdsts6l
	 */
	public void setCrdsts6l(int crdsts6l) {
		this.crdsts6l.setValue(crdsts6l);
	}
	/**
	 * Gets the reference for attribute crdsts6f.
	 * @return the crdsts6f attribute reference
	 */
	public ElementaryRangeReference getCrdsts6fReference() {
		return crdsts6f.getReference();
	}

	/**
	 * Getter for crdsts6f attribute.
	 * @return crdsts6f attribute
	 */
	public String getCrdsts6f() {
		return crdsts6f.getValue();
	}

	/**
	 * Setter for crdsts6f attribute.
	 * @param crdsts6f the new value of crdsts6f
	 */
	public void setCrdsts6f(String crdsts6f) {
		this.crdsts6f.setValue(crdsts6f);
	}
	/**
	 * Gets the reference for attribute crdsts6a.
	 * @return the crdsts6a attribute reference
	 */
	public ElementaryRangeReference getCrdsts6aReference() {
		return crdsts6a.getReference();
	}

	/**
	 * Getter for crdsts6a attribute.
	 * @return crdsts6a attribute
	 */
	public String getCrdsts6a() {
		return crdsts6a.getValue();
	}

	/**
	 * Setter for crdsts6a attribute.
	 * @param crdsts6a the new value of crdsts6a
	 */
	public void setCrdsts6a(String crdsts6a) {
		this.crdsts6a.setValue(crdsts6a);
	}
	/**
	 * Gets the reference for attribute crdsts6i.
	 * @return the crdsts6i attribute reference
	 */
	public ElementaryRangeReference getCrdsts6iReference() {
		return crdsts6i.getReference();
	}

	/**
	 * Getter for crdsts6i attribute.
	 * @return crdsts6i attribute
	 */
	public String getCrdsts6i() {
		return crdsts6i.getValue();
	}

	/**
	 * Setter for crdsts6i attribute.
	 * @param crdsts6i the new value of crdsts6i
	 */
	public void setCrdsts6i(String crdsts6i) {
		this.crdsts6i.setValue(crdsts6i);
	}
	/**
	 * Gets the reference for attribute crdsel7l.
	 * @return the crdsel7l attribute reference
	 */
	public ElementaryRangeReference getCrdsel7lReference() {
		return crdsel7l.getReference();
	}

	/**
	 * Getter for crdsel7l attribute.
	 * @return crdsel7l attribute
	 */
	public int getCrdsel7l() {
		return crdsel7l.getValue();
	}

	/**
	 * Setter for crdsel7l attribute.
	 * @param crdsel7l the new value of crdsel7l
	 */
	public void setCrdsel7l(int crdsel7l) {
		this.crdsel7l.setValue(crdsel7l);
	}
	/**
	 * Gets the reference for attribute crdsel7f.
	 * @return the crdsel7f attribute reference
	 */
	public ElementaryRangeReference getCrdsel7fReference() {
		return crdsel7f.getReference();
	}

	/**
	 * Getter for crdsel7f attribute.
	 * @return crdsel7f attribute
	 */
	public String getCrdsel7f() {
		return crdsel7f.getValue();
	}

	/**
	 * Setter for crdsel7f attribute.
	 * @param crdsel7f the new value of crdsel7f
	 */
	public void setCrdsel7f(String crdsel7f) {
		this.crdsel7f.setValue(crdsel7f);
	}
	/**
	 * Gets the reference for attribute crdsel7a.
	 * @return the crdsel7a attribute reference
	 */
	public ElementaryRangeReference getCrdsel7aReference() {
		return crdsel7a.getReference();
	}

	/**
	 * Getter for crdsel7a attribute.
	 * @return crdsel7a attribute
	 */
	public String getCrdsel7a() {
		return crdsel7a.getValue();
	}

	/**
	 * Setter for crdsel7a attribute.
	 * @param crdsel7a the new value of crdsel7a
	 */
	public void setCrdsel7a(String crdsel7a) {
		this.crdsel7a.setValue(crdsel7a);
	}
	/**
	 * Gets the reference for attribute crdsel7i.
	 * @return the crdsel7i attribute reference
	 */
	public ElementaryRangeReference getCrdsel7iReference() {
		return crdsel7i.getReference();
	}

	/**
	 * Getter for crdsel7i attribute.
	 * @return crdsel7i attribute
	 */
	public String getCrdsel7i() {
		return crdsel7i.getValue();
	}

	/**
	 * Setter for crdsel7i attribute.
	 * @param crdsel7i the new value of crdsel7i
	 */
	public void setCrdsel7i(String crdsel7i) {
		this.crdsel7i.setValue(crdsel7i);
	}
	/**
	 * Gets the reference for attribute crdstp7l.
	 * @return the crdstp7l attribute reference
	 */
	public ElementaryRangeReference getCrdstp7lReference() {
		return crdstp7l.getReference();
	}

	/**
	 * Getter for crdstp7l attribute.
	 * @return crdstp7l attribute
	 */
	public int getCrdstp7l() {
		return crdstp7l.getValue();
	}

	/**
	 * Setter for crdstp7l attribute.
	 * @param crdstp7l the new value of crdstp7l
	 */
	public void setCrdstp7l(int crdstp7l) {
		this.crdstp7l.setValue(crdstp7l);
	}
	/**
	 * Gets the reference for attribute crdstp7f.
	 * @return the crdstp7f attribute reference
	 */
	public ElementaryRangeReference getCrdstp7fReference() {
		return crdstp7f.getReference();
	}

	/**
	 * Getter for crdstp7f attribute.
	 * @return crdstp7f attribute
	 */
	public String getCrdstp7f() {
		return crdstp7f.getValue();
	}

	/**
	 * Setter for crdstp7f attribute.
	 * @param crdstp7f the new value of crdstp7f
	 */
	public void setCrdstp7f(String crdstp7f) {
		this.crdstp7f.setValue(crdstp7f);
	}
	/**
	 * Gets the reference for attribute crdstp7a.
	 * @return the crdstp7a attribute reference
	 */
	public ElementaryRangeReference getCrdstp7aReference() {
		return crdstp7a.getReference();
	}

	/**
	 * Getter for crdstp7a attribute.
	 * @return crdstp7a attribute
	 */
	public String getCrdstp7a() {
		return crdstp7a.getValue();
	}

	/**
	 * Setter for crdstp7a attribute.
	 * @param crdstp7a the new value of crdstp7a
	 */
	public void setCrdstp7a(String crdstp7a) {
		this.crdstp7a.setValue(crdstp7a);
	}
	/**
	 * Gets the reference for attribute crdstp7i.
	 * @return the crdstp7i attribute reference
	 */
	public ElementaryRangeReference getCrdstp7iReference() {
		return crdstp7i.getReference();
	}

	/**
	 * Getter for crdstp7i attribute.
	 * @return crdstp7i attribute
	 */
	public String getCrdstp7i() {
		return crdstp7i.getValue();
	}

	/**
	 * Setter for crdstp7i attribute.
	 * @param crdstp7i the new value of crdstp7i
	 */
	public void setCrdstp7i(String crdstp7i) {
		this.crdstp7i.setValue(crdstp7i);
	}
	/**
	 * Gets the reference for attribute acctno7l.
	 * @return the acctno7l attribute reference
	 */
	public ElementaryRangeReference getAcctno7lReference() {
		return acctno7l.getReference();
	}

	/**
	 * Getter for acctno7l attribute.
	 * @return acctno7l attribute
	 */
	public int getAcctno7l() {
		return acctno7l.getValue();
	}

	/**
	 * Setter for acctno7l attribute.
	 * @param acctno7l the new value of acctno7l
	 */
	public void setAcctno7l(int acctno7l) {
		this.acctno7l.setValue(acctno7l);
	}
	/**
	 * Gets the reference for attribute acctno7f.
	 * @return the acctno7f attribute reference
	 */
	public ElementaryRangeReference getAcctno7fReference() {
		return acctno7f.getReference();
	}

	/**
	 * Getter for acctno7f attribute.
	 * @return acctno7f attribute
	 */
	public String getAcctno7f() {
		return acctno7f.getValue();
	}

	/**
	 * Setter for acctno7f attribute.
	 * @param acctno7f the new value of acctno7f
	 */
	public void setAcctno7f(String acctno7f) {
		this.acctno7f.setValue(acctno7f);
	}
	/**
	 * Gets the reference for attribute acctno7a.
	 * @return the acctno7a attribute reference
	 */
	public ElementaryRangeReference getAcctno7aReference() {
		return acctno7a.getReference();
	}

	/**
	 * Getter for acctno7a attribute.
	 * @return acctno7a attribute
	 */
	public String getAcctno7a() {
		return acctno7a.getValue();
	}

	/**
	 * Setter for acctno7a attribute.
	 * @param acctno7a the new value of acctno7a
	 */
	public void setAcctno7a(String acctno7a) {
		this.acctno7a.setValue(acctno7a);
	}
	/**
	 * Gets the reference for attribute acctno7i.
	 * @return the acctno7i attribute reference
	 */
	public ElementaryRangeReference getAcctno7iReference() {
		return acctno7i.getReference();
	}

	/**
	 * Getter for acctno7i attribute.
	 * @return acctno7i attribute
	 */
	public String getAcctno7i() {
		return acctno7i.getValue();
	}

	/**
	 * Setter for acctno7i attribute.
	 * @param acctno7i the new value of acctno7i
	 */
	public void setAcctno7i(String acctno7i) {
		this.acctno7i.setValue(acctno7i);
	}
	/**
	 * Gets the reference for attribute crdnum7l.
	 * @return the crdnum7l attribute reference
	 */
	public ElementaryRangeReference getCrdnum7lReference() {
		return crdnum7l.getReference();
	}

	/**
	 * Getter for crdnum7l attribute.
	 * @return crdnum7l attribute
	 */
	public int getCrdnum7l() {
		return crdnum7l.getValue();
	}

	/**
	 * Setter for crdnum7l attribute.
	 * @param crdnum7l the new value of crdnum7l
	 */
	public void setCrdnum7l(int crdnum7l) {
		this.crdnum7l.setValue(crdnum7l);
	}
	/**
	 * Gets the reference for attribute crdnum7f.
	 * @return the crdnum7f attribute reference
	 */
	public ElementaryRangeReference getCrdnum7fReference() {
		return crdnum7f.getReference();
	}

	/**
	 * Getter for crdnum7f attribute.
	 * @return crdnum7f attribute
	 */
	public String getCrdnum7f() {
		return crdnum7f.getValue();
	}

	/**
	 * Setter for crdnum7f attribute.
	 * @param crdnum7f the new value of crdnum7f
	 */
	public void setCrdnum7f(String crdnum7f) {
		this.crdnum7f.setValue(crdnum7f);
	}
	/**
	 * Gets the reference for attribute crdnum7a.
	 * @return the crdnum7a attribute reference
	 */
	public ElementaryRangeReference getCrdnum7aReference() {
		return crdnum7a.getReference();
	}

	/**
	 * Getter for crdnum7a attribute.
	 * @return crdnum7a attribute
	 */
	public String getCrdnum7a() {
		return crdnum7a.getValue();
	}

	/**
	 * Setter for crdnum7a attribute.
	 * @param crdnum7a the new value of crdnum7a
	 */
	public void setCrdnum7a(String crdnum7a) {
		this.crdnum7a.setValue(crdnum7a);
	}
	/**
	 * Gets the reference for attribute crdnum7i.
	 * @return the crdnum7i attribute reference
	 */
	public ElementaryRangeReference getCrdnum7iReference() {
		return crdnum7i.getReference();
	}

	/**
	 * Getter for crdnum7i attribute.
	 * @return crdnum7i attribute
	 */
	public String getCrdnum7i() {
		return crdnum7i.getValue();
	}

	/**
	 * Setter for crdnum7i attribute.
	 * @param crdnum7i the new value of crdnum7i
	 */
	public void setCrdnum7i(String crdnum7i) {
		this.crdnum7i.setValue(crdnum7i);
	}
	/**
	 * Gets the reference for attribute crdsts7l.
	 * @return the crdsts7l attribute reference
	 */
	public ElementaryRangeReference getCrdsts7lReference() {
		return crdsts7l.getReference();
	}

	/**
	 * Getter for crdsts7l attribute.
	 * @return crdsts7l attribute
	 */
	public int getCrdsts7l() {
		return crdsts7l.getValue();
	}

	/**
	 * Setter for crdsts7l attribute.
	 * @param crdsts7l the new value of crdsts7l
	 */
	public void setCrdsts7l(int crdsts7l) {
		this.crdsts7l.setValue(crdsts7l);
	}
	/**
	 * Gets the reference for attribute crdsts7f.
	 * @return the crdsts7f attribute reference
	 */
	public ElementaryRangeReference getCrdsts7fReference() {
		return crdsts7f.getReference();
	}

	/**
	 * Getter for crdsts7f attribute.
	 * @return crdsts7f attribute
	 */
	public String getCrdsts7f() {
		return crdsts7f.getValue();
	}

	/**
	 * Setter for crdsts7f attribute.
	 * @param crdsts7f the new value of crdsts7f
	 */
	public void setCrdsts7f(String crdsts7f) {
		this.crdsts7f.setValue(crdsts7f);
	}
	/**
	 * Gets the reference for attribute crdsts7a.
	 * @return the crdsts7a attribute reference
	 */
	public ElementaryRangeReference getCrdsts7aReference() {
		return crdsts7a.getReference();
	}

	/**
	 * Getter for crdsts7a attribute.
	 * @return crdsts7a attribute
	 */
	public String getCrdsts7a() {
		return crdsts7a.getValue();
	}

	/**
	 * Setter for crdsts7a attribute.
	 * @param crdsts7a the new value of crdsts7a
	 */
	public void setCrdsts7a(String crdsts7a) {
		this.crdsts7a.setValue(crdsts7a);
	}
	/**
	 * Gets the reference for attribute crdsts7i.
	 * @return the crdsts7i attribute reference
	 */
	public ElementaryRangeReference getCrdsts7iReference() {
		return crdsts7i.getReference();
	}

	/**
	 * Getter for crdsts7i attribute.
	 * @return crdsts7i attribute
	 */
	public String getCrdsts7i() {
		return crdsts7i.getValue();
	}

	/**
	 * Setter for crdsts7i attribute.
	 * @param crdsts7i the new value of crdsts7i
	 */
	public void setCrdsts7i(String crdsts7i) {
		this.crdsts7i.setValue(crdsts7i);
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
	 * Gets the reference for attribute ccrdliao.
	 * @return the ccrdliao attribute reference
	 */
	public RangeReference getCcrdliaoReference() {
		return ccrdliao.getReference();
	}	
				
	/**
	 * Setter for ccrdliao .
	 */
   	public void setCcrdliao(RangeReference reference) {
       	ccrdliao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute pagenoc.
	 * @return the pagenoc attribute reference
	 */
	public ElementaryRangeReference getPagenocReference() {
		return pagenoc.getReference();
	}

	/**
	 * Getter for pagenoc attribute.
	 * @return pagenoc attribute
	 */
	public String getPagenoc() {
		return pagenoc.getValue();
	}

	/**
	 * Setter for pagenoc attribute.
	 * @param pagenoc the new value of pagenoc
	 */
	public void setPagenoc(String pagenoc) {
		this.pagenoc.setValue(pagenoc);
	}
	/**
	 * Gets the reference for attribute pagenop.
	 * @return the pagenop attribute reference
	 */
	public ElementaryRangeReference getPagenopReference() {
		return pagenop.getReference();
	}

	/**
	 * Getter for pagenop attribute.
	 * @return pagenop attribute
	 */
	public String getPagenop() {
		return pagenop.getValue();
	}

	/**
	 * Setter for pagenop attribute.
	 * @param pagenop the new value of pagenop
	 */
	public void setPagenop(String pagenop) {
		this.pagenop.setValue(pagenop);
	}
	/**
	 * Gets the reference for attribute pagenoh.
	 * @return the pagenoh attribute reference
	 */
	public ElementaryRangeReference getPagenohReference() {
		return pagenoh.getReference();
	}

	/**
	 * Getter for pagenoh attribute.
	 * @return pagenoh attribute
	 */
	public String getPagenoh() {
		return pagenoh.getValue();
	}

	/**
	 * Setter for pagenoh attribute.
	 * @param pagenoh the new value of pagenoh
	 */
	public void setPagenoh(String pagenoh) {
		this.pagenoh.setValue(pagenoh);
	}
	/**
	 * Gets the reference for attribute pagenov.
	 * @return the pagenov attribute reference
	 */
	public ElementaryRangeReference getPagenovReference() {
		return pagenov.getReference();
	}

	/**
	 * Getter for pagenov attribute.
	 * @return pagenov attribute
	 */
	public String getPagenov() {
		return pagenov.getValue();
	}

	/**
	 * Setter for pagenov attribute.
	 * @param pagenov the new value of pagenov
	 */
	public void setPagenov(String pagenov) {
		this.pagenov.setValue(pagenov);
	}
	/**
	 * Gets the reference for attribute pagenoo.
	 * @return the pagenoo attribute reference
	 */
	public ElementaryRangeReference getPagenooReference() {
		return pagenoo.getReference();
	}

	/**
	 * Getter for pagenoo attribute.
	 * @return pagenoo attribute
	 */
	public String getPagenoo() {
		return pagenoo.getValue();
	}

	/**
	 * Setter for pagenoo attribute.
	 * @param pagenoo the new value of pagenoo
	 */
	public void setPagenoo(String pagenoo) {
		this.pagenoo.setValue(pagenoo);
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
	 * Gets the reference for attribute crdsel1c.
	 * @return the crdsel1c attribute reference
	 */
	public ElementaryRangeReference getCrdsel1cReference() {
		return crdsel1c.getReference();
	}

	/**
	 * Getter for crdsel1c attribute.
	 * @return crdsel1c attribute
	 */
	public String getCrdsel1c() {
		return crdsel1c.getValue();
	}

	/**
	 * Setter for crdsel1c attribute.
	 * @param crdsel1c the new value of crdsel1c
	 */
	public void setCrdsel1c(String crdsel1c) {
		this.crdsel1c.setValue(crdsel1c);
	}
	/**
	 * Gets the reference for attribute crdsel1p.
	 * @return the crdsel1p attribute reference
	 */
	public ElementaryRangeReference getCrdsel1pReference() {
		return crdsel1p.getReference();
	}

	/**
	 * Getter for crdsel1p attribute.
	 * @return crdsel1p attribute
	 */
	public String getCrdsel1p() {
		return crdsel1p.getValue();
	}

	/**
	 * Setter for crdsel1p attribute.
	 * @param crdsel1p the new value of crdsel1p
	 */
	public void setCrdsel1p(String crdsel1p) {
		this.crdsel1p.setValue(crdsel1p);
	}
	/**
	 * Gets the reference for attribute crdsel1h.
	 * @return the crdsel1h attribute reference
	 */
	public ElementaryRangeReference getCrdsel1hReference() {
		return crdsel1h.getReference();
	}

	/**
	 * Getter for crdsel1h attribute.
	 * @return crdsel1h attribute
	 */
	public String getCrdsel1h() {
		return crdsel1h.getValue();
	}

	/**
	 * Setter for crdsel1h attribute.
	 * @param crdsel1h the new value of crdsel1h
	 */
	public void setCrdsel1h(String crdsel1h) {
		this.crdsel1h.setValue(crdsel1h);
	}
	/**
	 * Gets the reference for attribute crdsel1v.
	 * @return the crdsel1v attribute reference
	 */
	public ElementaryRangeReference getCrdsel1vReference() {
		return crdsel1v.getReference();
	}

	/**
	 * Getter for crdsel1v attribute.
	 * @return crdsel1v attribute
	 */
	public String getCrdsel1v() {
		return crdsel1v.getValue();
	}

	/**
	 * Setter for crdsel1v attribute.
	 * @param crdsel1v the new value of crdsel1v
	 */
	public void setCrdsel1v(String crdsel1v) {
		this.crdsel1v.setValue(crdsel1v);
	}
	/**
	 * Gets the reference for attribute crdsel1o.
	 * @return the crdsel1o attribute reference
	 */
	public ElementaryRangeReference getCrdsel1oReference() {
		return crdsel1o.getReference();
	}

	/**
	 * Getter for crdsel1o attribute.
	 * @return crdsel1o attribute
	 */
	public String getCrdsel1o() {
		return crdsel1o.getValue();
	}

	/**
	 * Setter for crdsel1o attribute.
	 * @param crdsel1o the new value of crdsel1o
	 */
	public void setCrdsel1o(String crdsel1o) {
		this.crdsel1o.setValue(crdsel1o);
	}
	/**
	 * Gets the reference for attribute acctno1c.
	 * @return the acctno1c attribute reference
	 */
	public ElementaryRangeReference getAcctno1cReference() {
		return acctno1c.getReference();
	}

	/**
	 * Getter for acctno1c attribute.
	 * @return acctno1c attribute
	 */
	public String getAcctno1c() {
		return acctno1c.getValue();
	}

	/**
	 * Setter for acctno1c attribute.
	 * @param acctno1c the new value of acctno1c
	 */
	public void setAcctno1c(String acctno1c) {
		this.acctno1c.setValue(acctno1c);
	}
	/**
	 * Gets the reference for attribute acctno1p.
	 * @return the acctno1p attribute reference
	 */
	public ElementaryRangeReference getAcctno1pReference() {
		return acctno1p.getReference();
	}

	/**
	 * Getter for acctno1p attribute.
	 * @return acctno1p attribute
	 */
	public String getAcctno1p() {
		return acctno1p.getValue();
	}

	/**
	 * Setter for acctno1p attribute.
	 * @param acctno1p the new value of acctno1p
	 */
	public void setAcctno1p(String acctno1p) {
		this.acctno1p.setValue(acctno1p);
	}
	/**
	 * Gets the reference for attribute acctno1h.
	 * @return the acctno1h attribute reference
	 */
	public ElementaryRangeReference getAcctno1hReference() {
		return acctno1h.getReference();
	}

	/**
	 * Getter for acctno1h attribute.
	 * @return acctno1h attribute
	 */
	public String getAcctno1h() {
		return acctno1h.getValue();
	}

	/**
	 * Setter for acctno1h attribute.
	 * @param acctno1h the new value of acctno1h
	 */
	public void setAcctno1h(String acctno1h) {
		this.acctno1h.setValue(acctno1h);
	}
	/**
	 * Gets the reference for attribute acctno1v.
	 * @return the acctno1v attribute reference
	 */
	public ElementaryRangeReference getAcctno1vReference() {
		return acctno1v.getReference();
	}

	/**
	 * Getter for acctno1v attribute.
	 * @return acctno1v attribute
	 */
	public String getAcctno1v() {
		return acctno1v.getValue();
	}

	/**
	 * Setter for acctno1v attribute.
	 * @param acctno1v the new value of acctno1v
	 */
	public void setAcctno1v(String acctno1v) {
		this.acctno1v.setValue(acctno1v);
	}
	/**
	 * Gets the reference for attribute acctno1o.
	 * @return the acctno1o attribute reference
	 */
	public ElementaryRangeReference getAcctno1oReference() {
		return acctno1o.getReference();
	}

	/**
	 * Getter for acctno1o attribute.
	 * @return acctno1o attribute
	 */
	public String getAcctno1o() {
		return acctno1o.getValue();
	}

	/**
	 * Setter for acctno1o attribute.
	 * @param acctno1o the new value of acctno1o
	 */
	public void setAcctno1o(String acctno1o) {
		this.acctno1o.setValue(acctno1o);
	}
	/**
	 * Gets the reference for attribute crdnum1c.
	 * @return the crdnum1c attribute reference
	 */
	public ElementaryRangeReference getCrdnum1cReference() {
		return crdnum1c.getReference();
	}

	/**
	 * Getter for crdnum1c attribute.
	 * @return crdnum1c attribute
	 */
	public String getCrdnum1c() {
		return crdnum1c.getValue();
	}

	/**
	 * Setter for crdnum1c attribute.
	 * @param crdnum1c the new value of crdnum1c
	 */
	public void setCrdnum1c(String crdnum1c) {
		this.crdnum1c.setValue(crdnum1c);
	}
	/**
	 * Gets the reference for attribute crdnum1p.
	 * @return the crdnum1p attribute reference
	 */
	public ElementaryRangeReference getCrdnum1pReference() {
		return crdnum1p.getReference();
	}

	/**
	 * Getter for crdnum1p attribute.
	 * @return crdnum1p attribute
	 */
	public String getCrdnum1p() {
		return crdnum1p.getValue();
	}

	/**
	 * Setter for crdnum1p attribute.
	 * @param crdnum1p the new value of crdnum1p
	 */
	public void setCrdnum1p(String crdnum1p) {
		this.crdnum1p.setValue(crdnum1p);
	}
	/**
	 * Gets the reference for attribute crdnum1h.
	 * @return the crdnum1h attribute reference
	 */
	public ElementaryRangeReference getCrdnum1hReference() {
		return crdnum1h.getReference();
	}

	/**
	 * Getter for crdnum1h attribute.
	 * @return crdnum1h attribute
	 */
	public String getCrdnum1h() {
		return crdnum1h.getValue();
	}

	/**
	 * Setter for crdnum1h attribute.
	 * @param crdnum1h the new value of crdnum1h
	 */
	public void setCrdnum1h(String crdnum1h) {
		this.crdnum1h.setValue(crdnum1h);
	}
	/**
	 * Gets the reference for attribute crdnum1v.
	 * @return the crdnum1v attribute reference
	 */
	public ElementaryRangeReference getCrdnum1vReference() {
		return crdnum1v.getReference();
	}

	/**
	 * Getter for crdnum1v attribute.
	 * @return crdnum1v attribute
	 */
	public String getCrdnum1v() {
		return crdnum1v.getValue();
	}

	/**
	 * Setter for crdnum1v attribute.
	 * @param crdnum1v the new value of crdnum1v
	 */
	public void setCrdnum1v(String crdnum1v) {
		this.crdnum1v.setValue(crdnum1v);
	}
	/**
	 * Gets the reference for attribute crdnum1o.
	 * @return the crdnum1o attribute reference
	 */
	public ElementaryRangeReference getCrdnum1oReference() {
		return crdnum1o.getReference();
	}

	/**
	 * Getter for crdnum1o attribute.
	 * @return crdnum1o attribute
	 */
	public String getCrdnum1o() {
		return crdnum1o.getValue();
	}

	/**
	 * Setter for crdnum1o attribute.
	 * @param crdnum1o the new value of crdnum1o
	 */
	public void setCrdnum1o(String crdnum1o) {
		this.crdnum1o.setValue(crdnum1o);
	}
	/**
	 * Gets the reference for attribute crdsts1c.
	 * @return the crdsts1c attribute reference
	 */
	public ElementaryRangeReference getCrdsts1cReference() {
		return crdsts1c.getReference();
	}

	/**
	 * Getter for crdsts1c attribute.
	 * @return crdsts1c attribute
	 */
	public String getCrdsts1c() {
		return crdsts1c.getValue();
	}

	/**
	 * Setter for crdsts1c attribute.
	 * @param crdsts1c the new value of crdsts1c
	 */
	public void setCrdsts1c(String crdsts1c) {
		this.crdsts1c.setValue(crdsts1c);
	}
	/**
	 * Gets the reference for attribute crdsts1p.
	 * @return the crdsts1p attribute reference
	 */
	public ElementaryRangeReference getCrdsts1pReference() {
		return crdsts1p.getReference();
	}

	/**
	 * Getter for crdsts1p attribute.
	 * @return crdsts1p attribute
	 */
	public String getCrdsts1p() {
		return crdsts1p.getValue();
	}

	/**
	 * Setter for crdsts1p attribute.
	 * @param crdsts1p the new value of crdsts1p
	 */
	public void setCrdsts1p(String crdsts1p) {
		this.crdsts1p.setValue(crdsts1p);
	}
	/**
	 * Gets the reference for attribute crdsts1h.
	 * @return the crdsts1h attribute reference
	 */
	public ElementaryRangeReference getCrdsts1hReference() {
		return crdsts1h.getReference();
	}

	/**
	 * Getter for crdsts1h attribute.
	 * @return crdsts1h attribute
	 */
	public String getCrdsts1h() {
		return crdsts1h.getValue();
	}

	/**
	 * Setter for crdsts1h attribute.
	 * @param crdsts1h the new value of crdsts1h
	 */
	public void setCrdsts1h(String crdsts1h) {
		this.crdsts1h.setValue(crdsts1h);
	}
	/**
	 * Gets the reference for attribute crdsts1v.
	 * @return the crdsts1v attribute reference
	 */
	public ElementaryRangeReference getCrdsts1vReference() {
		return crdsts1v.getReference();
	}

	/**
	 * Getter for crdsts1v attribute.
	 * @return crdsts1v attribute
	 */
	public String getCrdsts1v() {
		return crdsts1v.getValue();
	}

	/**
	 * Setter for crdsts1v attribute.
	 * @param crdsts1v the new value of crdsts1v
	 */
	public void setCrdsts1v(String crdsts1v) {
		this.crdsts1v.setValue(crdsts1v);
	}
	/**
	 * Gets the reference for attribute crdsts1o.
	 * @return the crdsts1o attribute reference
	 */
	public ElementaryRangeReference getCrdsts1oReference() {
		return crdsts1o.getReference();
	}

	/**
	 * Getter for crdsts1o attribute.
	 * @return crdsts1o attribute
	 */
	public String getCrdsts1o() {
		return crdsts1o.getValue();
	}

	/**
	 * Setter for crdsts1o attribute.
	 * @param crdsts1o the new value of crdsts1o
	 */
	public void setCrdsts1o(String crdsts1o) {
		this.crdsts1o.setValue(crdsts1o);
	}
	/**
	 * Gets the reference for attribute crdsel2c.
	 * @return the crdsel2c attribute reference
	 */
	public ElementaryRangeReference getCrdsel2cReference() {
		return crdsel2c.getReference();
	}

	/**
	 * Getter for crdsel2c attribute.
	 * @return crdsel2c attribute
	 */
	public String getCrdsel2c() {
		return crdsel2c.getValue();
	}

	/**
	 * Setter for crdsel2c attribute.
	 * @param crdsel2c the new value of crdsel2c
	 */
	public void setCrdsel2c(String crdsel2c) {
		this.crdsel2c.setValue(crdsel2c);
	}
	/**
	 * Gets the reference for attribute crdsel2p.
	 * @return the crdsel2p attribute reference
	 */
	public ElementaryRangeReference getCrdsel2pReference() {
		return crdsel2p.getReference();
	}

	/**
	 * Getter for crdsel2p attribute.
	 * @return crdsel2p attribute
	 */
	public String getCrdsel2p() {
		return crdsel2p.getValue();
	}

	/**
	 * Setter for crdsel2p attribute.
	 * @param crdsel2p the new value of crdsel2p
	 */
	public void setCrdsel2p(String crdsel2p) {
		this.crdsel2p.setValue(crdsel2p);
	}
	/**
	 * Gets the reference for attribute crdsel2h.
	 * @return the crdsel2h attribute reference
	 */
	public ElementaryRangeReference getCrdsel2hReference() {
		return crdsel2h.getReference();
	}

	/**
	 * Getter for crdsel2h attribute.
	 * @return crdsel2h attribute
	 */
	public String getCrdsel2h() {
		return crdsel2h.getValue();
	}

	/**
	 * Setter for crdsel2h attribute.
	 * @param crdsel2h the new value of crdsel2h
	 */
	public void setCrdsel2h(String crdsel2h) {
		this.crdsel2h.setValue(crdsel2h);
	}
	/**
	 * Gets the reference for attribute crdsel2v.
	 * @return the crdsel2v attribute reference
	 */
	public ElementaryRangeReference getCrdsel2vReference() {
		return crdsel2v.getReference();
	}

	/**
	 * Getter for crdsel2v attribute.
	 * @return crdsel2v attribute
	 */
	public String getCrdsel2v() {
		return crdsel2v.getValue();
	}

	/**
	 * Setter for crdsel2v attribute.
	 * @param crdsel2v the new value of crdsel2v
	 */
	public void setCrdsel2v(String crdsel2v) {
		this.crdsel2v.setValue(crdsel2v);
	}
	/**
	 * Gets the reference for attribute crdsel2o.
	 * @return the crdsel2o attribute reference
	 */
	public ElementaryRangeReference getCrdsel2oReference() {
		return crdsel2o.getReference();
	}

	/**
	 * Getter for crdsel2o attribute.
	 * @return crdsel2o attribute
	 */
	public String getCrdsel2o() {
		return crdsel2o.getValue();
	}

	/**
	 * Setter for crdsel2o attribute.
	 * @param crdsel2o the new value of crdsel2o
	 */
	public void setCrdsel2o(String crdsel2o) {
		this.crdsel2o.setValue(crdsel2o);
	}
	/**
	 * Gets the reference for attribute crdstp2c.
	 * @return the crdstp2c attribute reference
	 */
	public ElementaryRangeReference getCrdstp2cReference() {
		return crdstp2c.getReference();
	}

	/**
	 * Getter for crdstp2c attribute.
	 * @return crdstp2c attribute
	 */
	public String getCrdstp2c() {
		return crdstp2c.getValue();
	}

	/**
	 * Setter for crdstp2c attribute.
	 * @param crdstp2c the new value of crdstp2c
	 */
	public void setCrdstp2c(String crdstp2c) {
		this.crdstp2c.setValue(crdstp2c);
	}
	/**
	 * Gets the reference for attribute crdstp2p.
	 * @return the crdstp2p attribute reference
	 */
	public ElementaryRangeReference getCrdstp2pReference() {
		return crdstp2p.getReference();
	}

	/**
	 * Getter for crdstp2p attribute.
	 * @return crdstp2p attribute
	 */
	public String getCrdstp2p() {
		return crdstp2p.getValue();
	}

	/**
	 * Setter for crdstp2p attribute.
	 * @param crdstp2p the new value of crdstp2p
	 */
	public void setCrdstp2p(String crdstp2p) {
		this.crdstp2p.setValue(crdstp2p);
	}
	/**
	 * Gets the reference for attribute crdstp2h.
	 * @return the crdstp2h attribute reference
	 */
	public ElementaryRangeReference getCrdstp2hReference() {
		return crdstp2h.getReference();
	}

	/**
	 * Getter for crdstp2h attribute.
	 * @return crdstp2h attribute
	 */
	public String getCrdstp2h() {
		return crdstp2h.getValue();
	}

	/**
	 * Setter for crdstp2h attribute.
	 * @param crdstp2h the new value of crdstp2h
	 */
	public void setCrdstp2h(String crdstp2h) {
		this.crdstp2h.setValue(crdstp2h);
	}
	/**
	 * Gets the reference for attribute crdstp2v.
	 * @return the crdstp2v attribute reference
	 */
	public ElementaryRangeReference getCrdstp2vReference() {
		return crdstp2v.getReference();
	}

	/**
	 * Getter for crdstp2v attribute.
	 * @return crdstp2v attribute
	 */
	public String getCrdstp2v() {
		return crdstp2v.getValue();
	}

	/**
	 * Setter for crdstp2v attribute.
	 * @param crdstp2v the new value of crdstp2v
	 */
	public void setCrdstp2v(String crdstp2v) {
		this.crdstp2v.setValue(crdstp2v);
	}
	/**
	 * Gets the reference for attribute crdstp2o.
	 * @return the crdstp2o attribute reference
	 */
	public ElementaryRangeReference getCrdstp2oReference() {
		return crdstp2o.getReference();
	}

	/**
	 * Getter for crdstp2o attribute.
	 * @return crdstp2o attribute
	 */
	public String getCrdstp2o() {
		return crdstp2o.getValue();
	}

	/**
	 * Setter for crdstp2o attribute.
	 * @param crdstp2o the new value of crdstp2o
	 */
	public void setCrdstp2o(String crdstp2o) {
		this.crdstp2o.setValue(crdstp2o);
	}
	/**
	 * Gets the reference for attribute acctno2c.
	 * @return the acctno2c attribute reference
	 */
	public ElementaryRangeReference getAcctno2cReference() {
		return acctno2c.getReference();
	}

	/**
	 * Getter for acctno2c attribute.
	 * @return acctno2c attribute
	 */
	public String getAcctno2c() {
		return acctno2c.getValue();
	}

	/**
	 * Setter for acctno2c attribute.
	 * @param acctno2c the new value of acctno2c
	 */
	public void setAcctno2c(String acctno2c) {
		this.acctno2c.setValue(acctno2c);
	}
	/**
	 * Gets the reference for attribute acctno2p.
	 * @return the acctno2p attribute reference
	 */
	public ElementaryRangeReference getAcctno2pReference() {
		return acctno2p.getReference();
	}

	/**
	 * Getter for acctno2p attribute.
	 * @return acctno2p attribute
	 */
	public String getAcctno2p() {
		return acctno2p.getValue();
	}

	/**
	 * Setter for acctno2p attribute.
	 * @param acctno2p the new value of acctno2p
	 */
	public void setAcctno2p(String acctno2p) {
		this.acctno2p.setValue(acctno2p);
	}
	/**
	 * Gets the reference for attribute acctno2h.
	 * @return the acctno2h attribute reference
	 */
	public ElementaryRangeReference getAcctno2hReference() {
		return acctno2h.getReference();
	}

	/**
	 * Getter for acctno2h attribute.
	 * @return acctno2h attribute
	 */
	public String getAcctno2h() {
		return acctno2h.getValue();
	}

	/**
	 * Setter for acctno2h attribute.
	 * @param acctno2h the new value of acctno2h
	 */
	public void setAcctno2h(String acctno2h) {
		this.acctno2h.setValue(acctno2h);
	}
	/**
	 * Gets the reference for attribute acctno2v.
	 * @return the acctno2v attribute reference
	 */
	public ElementaryRangeReference getAcctno2vReference() {
		return acctno2v.getReference();
	}

	/**
	 * Getter for acctno2v attribute.
	 * @return acctno2v attribute
	 */
	public String getAcctno2v() {
		return acctno2v.getValue();
	}

	/**
	 * Setter for acctno2v attribute.
	 * @param acctno2v the new value of acctno2v
	 */
	public void setAcctno2v(String acctno2v) {
		this.acctno2v.setValue(acctno2v);
	}
	/**
	 * Gets the reference for attribute acctno2o.
	 * @return the acctno2o attribute reference
	 */
	public ElementaryRangeReference getAcctno2oReference() {
		return acctno2o.getReference();
	}

	/**
	 * Getter for acctno2o attribute.
	 * @return acctno2o attribute
	 */
	public String getAcctno2o() {
		return acctno2o.getValue();
	}

	/**
	 * Setter for acctno2o attribute.
	 * @param acctno2o the new value of acctno2o
	 */
	public void setAcctno2o(String acctno2o) {
		this.acctno2o.setValue(acctno2o);
	}
	/**
	 * Gets the reference for attribute crdnum2c.
	 * @return the crdnum2c attribute reference
	 */
	public ElementaryRangeReference getCrdnum2cReference() {
		return crdnum2c.getReference();
	}

	/**
	 * Getter for crdnum2c attribute.
	 * @return crdnum2c attribute
	 */
	public String getCrdnum2c() {
		return crdnum2c.getValue();
	}

	/**
	 * Setter for crdnum2c attribute.
	 * @param crdnum2c the new value of crdnum2c
	 */
	public void setCrdnum2c(String crdnum2c) {
		this.crdnum2c.setValue(crdnum2c);
	}
	/**
	 * Gets the reference for attribute crdnum2p.
	 * @return the crdnum2p attribute reference
	 */
	public ElementaryRangeReference getCrdnum2pReference() {
		return crdnum2p.getReference();
	}

	/**
	 * Getter for crdnum2p attribute.
	 * @return crdnum2p attribute
	 */
	public String getCrdnum2p() {
		return crdnum2p.getValue();
	}

	/**
	 * Setter for crdnum2p attribute.
	 * @param crdnum2p the new value of crdnum2p
	 */
	public void setCrdnum2p(String crdnum2p) {
		this.crdnum2p.setValue(crdnum2p);
	}
	/**
	 * Gets the reference for attribute crdnum2h.
	 * @return the crdnum2h attribute reference
	 */
	public ElementaryRangeReference getCrdnum2hReference() {
		return crdnum2h.getReference();
	}

	/**
	 * Getter for crdnum2h attribute.
	 * @return crdnum2h attribute
	 */
	public String getCrdnum2h() {
		return crdnum2h.getValue();
	}

	/**
	 * Setter for crdnum2h attribute.
	 * @param crdnum2h the new value of crdnum2h
	 */
	public void setCrdnum2h(String crdnum2h) {
		this.crdnum2h.setValue(crdnum2h);
	}
	/**
	 * Gets the reference for attribute crdnum2v.
	 * @return the crdnum2v attribute reference
	 */
	public ElementaryRangeReference getCrdnum2vReference() {
		return crdnum2v.getReference();
	}

	/**
	 * Getter for crdnum2v attribute.
	 * @return crdnum2v attribute
	 */
	public String getCrdnum2v() {
		return crdnum2v.getValue();
	}

	/**
	 * Setter for crdnum2v attribute.
	 * @param crdnum2v the new value of crdnum2v
	 */
	public void setCrdnum2v(String crdnum2v) {
		this.crdnum2v.setValue(crdnum2v);
	}
	/**
	 * Gets the reference for attribute crdnum2o.
	 * @return the crdnum2o attribute reference
	 */
	public ElementaryRangeReference getCrdnum2oReference() {
		return crdnum2o.getReference();
	}

	/**
	 * Getter for crdnum2o attribute.
	 * @return crdnum2o attribute
	 */
	public String getCrdnum2o() {
		return crdnum2o.getValue();
	}

	/**
	 * Setter for crdnum2o attribute.
	 * @param crdnum2o the new value of crdnum2o
	 */
	public void setCrdnum2o(String crdnum2o) {
		this.crdnum2o.setValue(crdnum2o);
	}
	/**
	 * Gets the reference for attribute crdsts2c.
	 * @return the crdsts2c attribute reference
	 */
	public ElementaryRangeReference getCrdsts2cReference() {
		return crdsts2c.getReference();
	}

	/**
	 * Getter for crdsts2c attribute.
	 * @return crdsts2c attribute
	 */
	public String getCrdsts2c() {
		return crdsts2c.getValue();
	}

	/**
	 * Setter for crdsts2c attribute.
	 * @param crdsts2c the new value of crdsts2c
	 */
	public void setCrdsts2c(String crdsts2c) {
		this.crdsts2c.setValue(crdsts2c);
	}
	/**
	 * Gets the reference for attribute crdsts2p.
	 * @return the crdsts2p attribute reference
	 */
	public ElementaryRangeReference getCrdsts2pReference() {
		return crdsts2p.getReference();
	}

	/**
	 * Getter for crdsts2p attribute.
	 * @return crdsts2p attribute
	 */
	public String getCrdsts2p() {
		return crdsts2p.getValue();
	}

	/**
	 * Setter for crdsts2p attribute.
	 * @param crdsts2p the new value of crdsts2p
	 */
	public void setCrdsts2p(String crdsts2p) {
		this.crdsts2p.setValue(crdsts2p);
	}
	/**
	 * Gets the reference for attribute crdsts2h.
	 * @return the crdsts2h attribute reference
	 */
	public ElementaryRangeReference getCrdsts2hReference() {
		return crdsts2h.getReference();
	}

	/**
	 * Getter for crdsts2h attribute.
	 * @return crdsts2h attribute
	 */
	public String getCrdsts2h() {
		return crdsts2h.getValue();
	}

	/**
	 * Setter for crdsts2h attribute.
	 * @param crdsts2h the new value of crdsts2h
	 */
	public void setCrdsts2h(String crdsts2h) {
		this.crdsts2h.setValue(crdsts2h);
	}
	/**
	 * Gets the reference for attribute crdsts2v.
	 * @return the crdsts2v attribute reference
	 */
	public ElementaryRangeReference getCrdsts2vReference() {
		return crdsts2v.getReference();
	}

	/**
	 * Getter for crdsts2v attribute.
	 * @return crdsts2v attribute
	 */
	public String getCrdsts2v() {
		return crdsts2v.getValue();
	}

	/**
	 * Setter for crdsts2v attribute.
	 * @param crdsts2v the new value of crdsts2v
	 */
	public void setCrdsts2v(String crdsts2v) {
		this.crdsts2v.setValue(crdsts2v);
	}
	/**
	 * Gets the reference for attribute crdsts2o.
	 * @return the crdsts2o attribute reference
	 */
	public ElementaryRangeReference getCrdsts2oReference() {
		return crdsts2o.getReference();
	}

	/**
	 * Getter for crdsts2o attribute.
	 * @return crdsts2o attribute
	 */
	public String getCrdsts2o() {
		return crdsts2o.getValue();
	}

	/**
	 * Setter for crdsts2o attribute.
	 * @param crdsts2o the new value of crdsts2o
	 */
	public void setCrdsts2o(String crdsts2o) {
		this.crdsts2o.setValue(crdsts2o);
	}
	/**
	 * Gets the reference for attribute crdsel3c.
	 * @return the crdsel3c attribute reference
	 */
	public ElementaryRangeReference getCrdsel3cReference() {
		return crdsel3c.getReference();
	}

	/**
	 * Getter for crdsel3c attribute.
	 * @return crdsel3c attribute
	 */
	public String getCrdsel3c() {
		return crdsel3c.getValue();
	}

	/**
	 * Setter for crdsel3c attribute.
	 * @param crdsel3c the new value of crdsel3c
	 */
	public void setCrdsel3c(String crdsel3c) {
		this.crdsel3c.setValue(crdsel3c);
	}
	/**
	 * Gets the reference for attribute crdsel3p.
	 * @return the crdsel3p attribute reference
	 */
	public ElementaryRangeReference getCrdsel3pReference() {
		return crdsel3p.getReference();
	}

	/**
	 * Getter for crdsel3p attribute.
	 * @return crdsel3p attribute
	 */
	public String getCrdsel3p() {
		return crdsel3p.getValue();
	}

	/**
	 * Setter for crdsel3p attribute.
	 * @param crdsel3p the new value of crdsel3p
	 */
	public void setCrdsel3p(String crdsel3p) {
		this.crdsel3p.setValue(crdsel3p);
	}
	/**
	 * Gets the reference for attribute crdsel3h.
	 * @return the crdsel3h attribute reference
	 */
	public ElementaryRangeReference getCrdsel3hReference() {
		return crdsel3h.getReference();
	}

	/**
	 * Getter for crdsel3h attribute.
	 * @return crdsel3h attribute
	 */
	public String getCrdsel3h() {
		return crdsel3h.getValue();
	}

	/**
	 * Setter for crdsel3h attribute.
	 * @param crdsel3h the new value of crdsel3h
	 */
	public void setCrdsel3h(String crdsel3h) {
		this.crdsel3h.setValue(crdsel3h);
	}
	/**
	 * Gets the reference for attribute crdsel3v.
	 * @return the crdsel3v attribute reference
	 */
	public ElementaryRangeReference getCrdsel3vReference() {
		return crdsel3v.getReference();
	}

	/**
	 * Getter for crdsel3v attribute.
	 * @return crdsel3v attribute
	 */
	public String getCrdsel3v() {
		return crdsel3v.getValue();
	}

	/**
	 * Setter for crdsel3v attribute.
	 * @param crdsel3v the new value of crdsel3v
	 */
	public void setCrdsel3v(String crdsel3v) {
		this.crdsel3v.setValue(crdsel3v);
	}
	/**
	 * Gets the reference for attribute crdsel3o.
	 * @return the crdsel3o attribute reference
	 */
	public ElementaryRangeReference getCrdsel3oReference() {
		return crdsel3o.getReference();
	}

	/**
	 * Getter for crdsel3o attribute.
	 * @return crdsel3o attribute
	 */
	public String getCrdsel3o() {
		return crdsel3o.getValue();
	}

	/**
	 * Setter for crdsel3o attribute.
	 * @param crdsel3o the new value of crdsel3o
	 */
	public void setCrdsel3o(String crdsel3o) {
		this.crdsel3o.setValue(crdsel3o);
	}
	/**
	 * Gets the reference for attribute crdstp3c.
	 * @return the crdstp3c attribute reference
	 */
	public ElementaryRangeReference getCrdstp3cReference() {
		return crdstp3c.getReference();
	}

	/**
	 * Getter for crdstp3c attribute.
	 * @return crdstp3c attribute
	 */
	public String getCrdstp3c() {
		return crdstp3c.getValue();
	}

	/**
	 * Setter for crdstp3c attribute.
	 * @param crdstp3c the new value of crdstp3c
	 */
	public void setCrdstp3c(String crdstp3c) {
		this.crdstp3c.setValue(crdstp3c);
	}
	/**
	 * Gets the reference for attribute crdstp3p.
	 * @return the crdstp3p attribute reference
	 */
	public ElementaryRangeReference getCrdstp3pReference() {
		return crdstp3p.getReference();
	}

	/**
	 * Getter for crdstp3p attribute.
	 * @return crdstp3p attribute
	 */
	public String getCrdstp3p() {
		return crdstp3p.getValue();
	}

	/**
	 * Setter for crdstp3p attribute.
	 * @param crdstp3p the new value of crdstp3p
	 */
	public void setCrdstp3p(String crdstp3p) {
		this.crdstp3p.setValue(crdstp3p);
	}
	/**
	 * Gets the reference for attribute crdstp3h.
	 * @return the crdstp3h attribute reference
	 */
	public ElementaryRangeReference getCrdstp3hReference() {
		return crdstp3h.getReference();
	}

	/**
	 * Getter for crdstp3h attribute.
	 * @return crdstp3h attribute
	 */
	public String getCrdstp3h() {
		return crdstp3h.getValue();
	}

	/**
	 * Setter for crdstp3h attribute.
	 * @param crdstp3h the new value of crdstp3h
	 */
	public void setCrdstp3h(String crdstp3h) {
		this.crdstp3h.setValue(crdstp3h);
	}
	/**
	 * Gets the reference for attribute crdstp3v.
	 * @return the crdstp3v attribute reference
	 */
	public ElementaryRangeReference getCrdstp3vReference() {
		return crdstp3v.getReference();
	}

	/**
	 * Getter for crdstp3v attribute.
	 * @return crdstp3v attribute
	 */
	public String getCrdstp3v() {
		return crdstp3v.getValue();
	}

	/**
	 * Setter for crdstp3v attribute.
	 * @param crdstp3v the new value of crdstp3v
	 */
	public void setCrdstp3v(String crdstp3v) {
		this.crdstp3v.setValue(crdstp3v);
	}
	/**
	 * Gets the reference for attribute crdstp3o.
	 * @return the crdstp3o attribute reference
	 */
	public ElementaryRangeReference getCrdstp3oReference() {
		return crdstp3o.getReference();
	}

	/**
	 * Getter for crdstp3o attribute.
	 * @return crdstp3o attribute
	 */
	public String getCrdstp3o() {
		return crdstp3o.getValue();
	}

	/**
	 * Setter for crdstp3o attribute.
	 * @param crdstp3o the new value of crdstp3o
	 */
	public void setCrdstp3o(String crdstp3o) {
		this.crdstp3o.setValue(crdstp3o);
	}
	/**
	 * Gets the reference for attribute acctno3c.
	 * @return the acctno3c attribute reference
	 */
	public ElementaryRangeReference getAcctno3cReference() {
		return acctno3c.getReference();
	}

	/**
	 * Getter for acctno3c attribute.
	 * @return acctno3c attribute
	 */
	public String getAcctno3c() {
		return acctno3c.getValue();
	}

	/**
	 * Setter for acctno3c attribute.
	 * @param acctno3c the new value of acctno3c
	 */
	public void setAcctno3c(String acctno3c) {
		this.acctno3c.setValue(acctno3c);
	}
	/**
	 * Gets the reference for attribute acctno3p.
	 * @return the acctno3p attribute reference
	 */
	public ElementaryRangeReference getAcctno3pReference() {
		return acctno3p.getReference();
	}

	/**
	 * Getter for acctno3p attribute.
	 * @return acctno3p attribute
	 */
	public String getAcctno3p() {
		return acctno3p.getValue();
	}

	/**
	 * Setter for acctno3p attribute.
	 * @param acctno3p the new value of acctno3p
	 */
	public void setAcctno3p(String acctno3p) {
		this.acctno3p.setValue(acctno3p);
	}
	/**
	 * Gets the reference for attribute acctno3h.
	 * @return the acctno3h attribute reference
	 */
	public ElementaryRangeReference getAcctno3hReference() {
		return acctno3h.getReference();
	}

	/**
	 * Getter for acctno3h attribute.
	 * @return acctno3h attribute
	 */
	public String getAcctno3h() {
		return acctno3h.getValue();
	}

	/**
	 * Setter for acctno3h attribute.
	 * @param acctno3h the new value of acctno3h
	 */
	public void setAcctno3h(String acctno3h) {
		this.acctno3h.setValue(acctno3h);
	}
	/**
	 * Gets the reference for attribute acctno3v.
	 * @return the acctno3v attribute reference
	 */
	public ElementaryRangeReference getAcctno3vReference() {
		return acctno3v.getReference();
	}

	/**
	 * Getter for acctno3v attribute.
	 * @return acctno3v attribute
	 */
	public String getAcctno3v() {
		return acctno3v.getValue();
	}

	/**
	 * Setter for acctno3v attribute.
	 * @param acctno3v the new value of acctno3v
	 */
	public void setAcctno3v(String acctno3v) {
		this.acctno3v.setValue(acctno3v);
	}
	/**
	 * Gets the reference for attribute acctno3o.
	 * @return the acctno3o attribute reference
	 */
	public ElementaryRangeReference getAcctno3oReference() {
		return acctno3o.getReference();
	}

	/**
	 * Getter for acctno3o attribute.
	 * @return acctno3o attribute
	 */
	public String getAcctno3o() {
		return acctno3o.getValue();
	}

	/**
	 * Setter for acctno3o attribute.
	 * @param acctno3o the new value of acctno3o
	 */
	public void setAcctno3o(String acctno3o) {
		this.acctno3o.setValue(acctno3o);
	}
	/**
	 * Gets the reference for attribute crdnum3c.
	 * @return the crdnum3c attribute reference
	 */
	public ElementaryRangeReference getCrdnum3cReference() {
		return crdnum3c.getReference();
	}

	/**
	 * Getter for crdnum3c attribute.
	 * @return crdnum3c attribute
	 */
	public String getCrdnum3c() {
		return crdnum3c.getValue();
	}

	/**
	 * Setter for crdnum3c attribute.
	 * @param crdnum3c the new value of crdnum3c
	 */
	public void setCrdnum3c(String crdnum3c) {
		this.crdnum3c.setValue(crdnum3c);
	}
	/**
	 * Gets the reference for attribute crdnum3p.
	 * @return the crdnum3p attribute reference
	 */
	public ElementaryRangeReference getCrdnum3pReference() {
		return crdnum3p.getReference();
	}

	/**
	 * Getter for crdnum3p attribute.
	 * @return crdnum3p attribute
	 */
	public String getCrdnum3p() {
		return crdnum3p.getValue();
	}

	/**
	 * Setter for crdnum3p attribute.
	 * @param crdnum3p the new value of crdnum3p
	 */
	public void setCrdnum3p(String crdnum3p) {
		this.crdnum3p.setValue(crdnum3p);
	}
	/**
	 * Gets the reference for attribute crdnum3h.
	 * @return the crdnum3h attribute reference
	 */
	public ElementaryRangeReference getCrdnum3hReference() {
		return crdnum3h.getReference();
	}

	/**
	 * Getter for crdnum3h attribute.
	 * @return crdnum3h attribute
	 */
	public String getCrdnum3h() {
		return crdnum3h.getValue();
	}

	/**
	 * Setter for crdnum3h attribute.
	 * @param crdnum3h the new value of crdnum3h
	 */
	public void setCrdnum3h(String crdnum3h) {
		this.crdnum3h.setValue(crdnum3h);
	}
	/**
	 * Gets the reference for attribute crdnum3v.
	 * @return the crdnum3v attribute reference
	 */
	public ElementaryRangeReference getCrdnum3vReference() {
		return crdnum3v.getReference();
	}

	/**
	 * Getter for crdnum3v attribute.
	 * @return crdnum3v attribute
	 */
	public String getCrdnum3v() {
		return crdnum3v.getValue();
	}

	/**
	 * Setter for crdnum3v attribute.
	 * @param crdnum3v the new value of crdnum3v
	 */
	public void setCrdnum3v(String crdnum3v) {
		this.crdnum3v.setValue(crdnum3v);
	}
	/**
	 * Gets the reference for attribute crdnum3o.
	 * @return the crdnum3o attribute reference
	 */
	public ElementaryRangeReference getCrdnum3oReference() {
		return crdnum3o.getReference();
	}

	/**
	 * Getter for crdnum3o attribute.
	 * @return crdnum3o attribute
	 */
	public String getCrdnum3o() {
		return crdnum3o.getValue();
	}

	/**
	 * Setter for crdnum3o attribute.
	 * @param crdnum3o the new value of crdnum3o
	 */
	public void setCrdnum3o(String crdnum3o) {
		this.crdnum3o.setValue(crdnum3o);
	}
	/**
	 * Gets the reference for attribute crdsts3c.
	 * @return the crdsts3c attribute reference
	 */
	public ElementaryRangeReference getCrdsts3cReference() {
		return crdsts3c.getReference();
	}

	/**
	 * Getter for crdsts3c attribute.
	 * @return crdsts3c attribute
	 */
	public String getCrdsts3c() {
		return crdsts3c.getValue();
	}

	/**
	 * Setter for crdsts3c attribute.
	 * @param crdsts3c the new value of crdsts3c
	 */
	public void setCrdsts3c(String crdsts3c) {
		this.crdsts3c.setValue(crdsts3c);
	}
	/**
	 * Gets the reference for attribute crdsts3p.
	 * @return the crdsts3p attribute reference
	 */
	public ElementaryRangeReference getCrdsts3pReference() {
		return crdsts3p.getReference();
	}

	/**
	 * Getter for crdsts3p attribute.
	 * @return crdsts3p attribute
	 */
	public String getCrdsts3p() {
		return crdsts3p.getValue();
	}

	/**
	 * Setter for crdsts3p attribute.
	 * @param crdsts3p the new value of crdsts3p
	 */
	public void setCrdsts3p(String crdsts3p) {
		this.crdsts3p.setValue(crdsts3p);
	}
	/**
	 * Gets the reference for attribute crdsts3h.
	 * @return the crdsts3h attribute reference
	 */
	public ElementaryRangeReference getCrdsts3hReference() {
		return crdsts3h.getReference();
	}

	/**
	 * Getter for crdsts3h attribute.
	 * @return crdsts3h attribute
	 */
	public String getCrdsts3h() {
		return crdsts3h.getValue();
	}

	/**
	 * Setter for crdsts3h attribute.
	 * @param crdsts3h the new value of crdsts3h
	 */
	public void setCrdsts3h(String crdsts3h) {
		this.crdsts3h.setValue(crdsts3h);
	}
	/**
	 * Gets the reference for attribute crdsts3v.
	 * @return the crdsts3v attribute reference
	 */
	public ElementaryRangeReference getCrdsts3vReference() {
		return crdsts3v.getReference();
	}

	/**
	 * Getter for crdsts3v attribute.
	 * @return crdsts3v attribute
	 */
	public String getCrdsts3v() {
		return crdsts3v.getValue();
	}

	/**
	 * Setter for crdsts3v attribute.
	 * @param crdsts3v the new value of crdsts3v
	 */
	public void setCrdsts3v(String crdsts3v) {
		this.crdsts3v.setValue(crdsts3v);
	}
	/**
	 * Gets the reference for attribute crdsts3o.
	 * @return the crdsts3o attribute reference
	 */
	public ElementaryRangeReference getCrdsts3oReference() {
		return crdsts3o.getReference();
	}

	/**
	 * Getter for crdsts3o attribute.
	 * @return crdsts3o attribute
	 */
	public String getCrdsts3o() {
		return crdsts3o.getValue();
	}

	/**
	 * Setter for crdsts3o attribute.
	 * @param crdsts3o the new value of crdsts3o
	 */
	public void setCrdsts3o(String crdsts3o) {
		this.crdsts3o.setValue(crdsts3o);
	}
	/**
	 * Gets the reference for attribute crdsel4c.
	 * @return the crdsel4c attribute reference
	 */
	public ElementaryRangeReference getCrdsel4cReference() {
		return crdsel4c.getReference();
	}

	/**
	 * Getter for crdsel4c attribute.
	 * @return crdsel4c attribute
	 */
	public String getCrdsel4c() {
		return crdsel4c.getValue();
	}

	/**
	 * Setter for crdsel4c attribute.
	 * @param crdsel4c the new value of crdsel4c
	 */
	public void setCrdsel4c(String crdsel4c) {
		this.crdsel4c.setValue(crdsel4c);
	}
	/**
	 * Gets the reference for attribute crdsel4p.
	 * @return the crdsel4p attribute reference
	 */
	public ElementaryRangeReference getCrdsel4pReference() {
		return crdsel4p.getReference();
	}

	/**
	 * Getter for crdsel4p attribute.
	 * @return crdsel4p attribute
	 */
	public String getCrdsel4p() {
		return crdsel4p.getValue();
	}

	/**
	 * Setter for crdsel4p attribute.
	 * @param crdsel4p the new value of crdsel4p
	 */
	public void setCrdsel4p(String crdsel4p) {
		this.crdsel4p.setValue(crdsel4p);
	}
	/**
	 * Gets the reference for attribute crdsel4h.
	 * @return the crdsel4h attribute reference
	 */
	public ElementaryRangeReference getCrdsel4hReference() {
		return crdsel4h.getReference();
	}

	/**
	 * Getter for crdsel4h attribute.
	 * @return crdsel4h attribute
	 */
	public String getCrdsel4h() {
		return crdsel4h.getValue();
	}

	/**
	 * Setter for crdsel4h attribute.
	 * @param crdsel4h the new value of crdsel4h
	 */
	public void setCrdsel4h(String crdsel4h) {
		this.crdsel4h.setValue(crdsel4h);
	}
	/**
	 * Gets the reference for attribute crdsel4v.
	 * @return the crdsel4v attribute reference
	 */
	public ElementaryRangeReference getCrdsel4vReference() {
		return crdsel4v.getReference();
	}

	/**
	 * Getter for crdsel4v attribute.
	 * @return crdsel4v attribute
	 */
	public String getCrdsel4v() {
		return crdsel4v.getValue();
	}

	/**
	 * Setter for crdsel4v attribute.
	 * @param crdsel4v the new value of crdsel4v
	 */
	public void setCrdsel4v(String crdsel4v) {
		this.crdsel4v.setValue(crdsel4v);
	}
	/**
	 * Gets the reference for attribute crdsel4o.
	 * @return the crdsel4o attribute reference
	 */
	public ElementaryRangeReference getCrdsel4oReference() {
		return crdsel4o.getReference();
	}

	/**
	 * Getter for crdsel4o attribute.
	 * @return crdsel4o attribute
	 */
	public String getCrdsel4o() {
		return crdsel4o.getValue();
	}

	/**
	 * Setter for crdsel4o attribute.
	 * @param crdsel4o the new value of crdsel4o
	 */
	public void setCrdsel4o(String crdsel4o) {
		this.crdsel4o.setValue(crdsel4o);
	}
	/**
	 * Gets the reference for attribute crdstp4c.
	 * @return the crdstp4c attribute reference
	 */
	public ElementaryRangeReference getCrdstp4cReference() {
		return crdstp4c.getReference();
	}

	/**
	 * Getter for crdstp4c attribute.
	 * @return crdstp4c attribute
	 */
	public String getCrdstp4c() {
		return crdstp4c.getValue();
	}

	/**
	 * Setter for crdstp4c attribute.
	 * @param crdstp4c the new value of crdstp4c
	 */
	public void setCrdstp4c(String crdstp4c) {
		this.crdstp4c.setValue(crdstp4c);
	}
	/**
	 * Gets the reference for attribute crdstp4p.
	 * @return the crdstp4p attribute reference
	 */
	public ElementaryRangeReference getCrdstp4pReference() {
		return crdstp4p.getReference();
	}

	/**
	 * Getter for crdstp4p attribute.
	 * @return crdstp4p attribute
	 */
	public String getCrdstp4p() {
		return crdstp4p.getValue();
	}

	/**
	 * Setter for crdstp4p attribute.
	 * @param crdstp4p the new value of crdstp4p
	 */
	public void setCrdstp4p(String crdstp4p) {
		this.crdstp4p.setValue(crdstp4p);
	}
	/**
	 * Gets the reference for attribute crdstp4h.
	 * @return the crdstp4h attribute reference
	 */
	public ElementaryRangeReference getCrdstp4hReference() {
		return crdstp4h.getReference();
	}

	/**
	 * Getter for crdstp4h attribute.
	 * @return crdstp4h attribute
	 */
	public String getCrdstp4h() {
		return crdstp4h.getValue();
	}

	/**
	 * Setter for crdstp4h attribute.
	 * @param crdstp4h the new value of crdstp4h
	 */
	public void setCrdstp4h(String crdstp4h) {
		this.crdstp4h.setValue(crdstp4h);
	}
	/**
	 * Gets the reference for attribute crdstp4v.
	 * @return the crdstp4v attribute reference
	 */
	public ElementaryRangeReference getCrdstp4vReference() {
		return crdstp4v.getReference();
	}

	/**
	 * Getter for crdstp4v attribute.
	 * @return crdstp4v attribute
	 */
	public String getCrdstp4v() {
		return crdstp4v.getValue();
	}

	/**
	 * Setter for crdstp4v attribute.
	 * @param crdstp4v the new value of crdstp4v
	 */
	public void setCrdstp4v(String crdstp4v) {
		this.crdstp4v.setValue(crdstp4v);
	}
	/**
	 * Gets the reference for attribute crdstp4o.
	 * @return the crdstp4o attribute reference
	 */
	public ElementaryRangeReference getCrdstp4oReference() {
		return crdstp4o.getReference();
	}

	/**
	 * Getter for crdstp4o attribute.
	 * @return crdstp4o attribute
	 */
	public String getCrdstp4o() {
		return crdstp4o.getValue();
	}

	/**
	 * Setter for crdstp4o attribute.
	 * @param crdstp4o the new value of crdstp4o
	 */
	public void setCrdstp4o(String crdstp4o) {
		this.crdstp4o.setValue(crdstp4o);
	}
	/**
	 * Gets the reference for attribute acctno4c.
	 * @return the acctno4c attribute reference
	 */
	public ElementaryRangeReference getAcctno4cReference() {
		return acctno4c.getReference();
	}

	/**
	 * Getter for acctno4c attribute.
	 * @return acctno4c attribute
	 */
	public String getAcctno4c() {
		return acctno4c.getValue();
	}

	/**
	 * Setter for acctno4c attribute.
	 * @param acctno4c the new value of acctno4c
	 */
	public void setAcctno4c(String acctno4c) {
		this.acctno4c.setValue(acctno4c);
	}
	/**
	 * Gets the reference for attribute acctno4p.
	 * @return the acctno4p attribute reference
	 */
	public ElementaryRangeReference getAcctno4pReference() {
		return acctno4p.getReference();
	}

	/**
	 * Getter for acctno4p attribute.
	 * @return acctno4p attribute
	 */
	public String getAcctno4p() {
		return acctno4p.getValue();
	}

	/**
	 * Setter for acctno4p attribute.
	 * @param acctno4p the new value of acctno4p
	 */
	public void setAcctno4p(String acctno4p) {
		this.acctno4p.setValue(acctno4p);
	}
	/**
	 * Gets the reference for attribute acctno4h.
	 * @return the acctno4h attribute reference
	 */
	public ElementaryRangeReference getAcctno4hReference() {
		return acctno4h.getReference();
	}

	/**
	 * Getter for acctno4h attribute.
	 * @return acctno4h attribute
	 */
	public String getAcctno4h() {
		return acctno4h.getValue();
	}

	/**
	 * Setter for acctno4h attribute.
	 * @param acctno4h the new value of acctno4h
	 */
	public void setAcctno4h(String acctno4h) {
		this.acctno4h.setValue(acctno4h);
	}
	/**
	 * Gets the reference for attribute acctno4v.
	 * @return the acctno4v attribute reference
	 */
	public ElementaryRangeReference getAcctno4vReference() {
		return acctno4v.getReference();
	}

	/**
	 * Getter for acctno4v attribute.
	 * @return acctno4v attribute
	 */
	public String getAcctno4v() {
		return acctno4v.getValue();
	}

	/**
	 * Setter for acctno4v attribute.
	 * @param acctno4v the new value of acctno4v
	 */
	public void setAcctno4v(String acctno4v) {
		this.acctno4v.setValue(acctno4v);
	}
	/**
	 * Gets the reference for attribute acctno4o.
	 * @return the acctno4o attribute reference
	 */
	public ElementaryRangeReference getAcctno4oReference() {
		return acctno4o.getReference();
	}

	/**
	 * Getter for acctno4o attribute.
	 * @return acctno4o attribute
	 */
	public String getAcctno4o() {
		return acctno4o.getValue();
	}

	/**
	 * Setter for acctno4o attribute.
	 * @param acctno4o the new value of acctno4o
	 */
	public void setAcctno4o(String acctno4o) {
		this.acctno4o.setValue(acctno4o);
	}
	/**
	 * Gets the reference for attribute crdnum4c.
	 * @return the crdnum4c attribute reference
	 */
	public ElementaryRangeReference getCrdnum4cReference() {
		return crdnum4c.getReference();
	}

	/**
	 * Getter for crdnum4c attribute.
	 * @return crdnum4c attribute
	 */
	public String getCrdnum4c() {
		return crdnum4c.getValue();
	}

	/**
	 * Setter for crdnum4c attribute.
	 * @param crdnum4c the new value of crdnum4c
	 */
	public void setCrdnum4c(String crdnum4c) {
		this.crdnum4c.setValue(crdnum4c);
	}
	/**
	 * Gets the reference for attribute crdnum4p.
	 * @return the crdnum4p attribute reference
	 */
	public ElementaryRangeReference getCrdnum4pReference() {
		return crdnum4p.getReference();
	}

	/**
	 * Getter for crdnum4p attribute.
	 * @return crdnum4p attribute
	 */
	public String getCrdnum4p() {
		return crdnum4p.getValue();
	}

	/**
	 * Setter for crdnum4p attribute.
	 * @param crdnum4p the new value of crdnum4p
	 */
	public void setCrdnum4p(String crdnum4p) {
		this.crdnum4p.setValue(crdnum4p);
	}
	/**
	 * Gets the reference for attribute crdnum4h.
	 * @return the crdnum4h attribute reference
	 */
	public ElementaryRangeReference getCrdnum4hReference() {
		return crdnum4h.getReference();
	}

	/**
	 * Getter for crdnum4h attribute.
	 * @return crdnum4h attribute
	 */
	public String getCrdnum4h() {
		return crdnum4h.getValue();
	}

	/**
	 * Setter for crdnum4h attribute.
	 * @param crdnum4h the new value of crdnum4h
	 */
	public void setCrdnum4h(String crdnum4h) {
		this.crdnum4h.setValue(crdnum4h);
	}
	/**
	 * Gets the reference for attribute crdnum4v.
	 * @return the crdnum4v attribute reference
	 */
	public ElementaryRangeReference getCrdnum4vReference() {
		return crdnum4v.getReference();
	}

	/**
	 * Getter for crdnum4v attribute.
	 * @return crdnum4v attribute
	 */
	public String getCrdnum4v() {
		return crdnum4v.getValue();
	}

	/**
	 * Setter for crdnum4v attribute.
	 * @param crdnum4v the new value of crdnum4v
	 */
	public void setCrdnum4v(String crdnum4v) {
		this.crdnum4v.setValue(crdnum4v);
	}
	/**
	 * Gets the reference for attribute crdnum4o.
	 * @return the crdnum4o attribute reference
	 */
	public ElementaryRangeReference getCrdnum4oReference() {
		return crdnum4o.getReference();
	}

	/**
	 * Getter for crdnum4o attribute.
	 * @return crdnum4o attribute
	 */
	public String getCrdnum4o() {
		return crdnum4o.getValue();
	}

	/**
	 * Setter for crdnum4o attribute.
	 * @param crdnum4o the new value of crdnum4o
	 */
	public void setCrdnum4o(String crdnum4o) {
		this.crdnum4o.setValue(crdnum4o);
	}
	/**
	 * Gets the reference for attribute crdsts4c.
	 * @return the crdsts4c attribute reference
	 */
	public ElementaryRangeReference getCrdsts4cReference() {
		return crdsts4c.getReference();
	}

	/**
	 * Getter for crdsts4c attribute.
	 * @return crdsts4c attribute
	 */
	public String getCrdsts4c() {
		return crdsts4c.getValue();
	}

	/**
	 * Setter for crdsts4c attribute.
	 * @param crdsts4c the new value of crdsts4c
	 */
	public void setCrdsts4c(String crdsts4c) {
		this.crdsts4c.setValue(crdsts4c);
	}
	/**
	 * Gets the reference for attribute crdsts4p.
	 * @return the crdsts4p attribute reference
	 */
	public ElementaryRangeReference getCrdsts4pReference() {
		return crdsts4p.getReference();
	}

	/**
	 * Getter for crdsts4p attribute.
	 * @return crdsts4p attribute
	 */
	public String getCrdsts4p() {
		return crdsts4p.getValue();
	}

	/**
	 * Setter for crdsts4p attribute.
	 * @param crdsts4p the new value of crdsts4p
	 */
	public void setCrdsts4p(String crdsts4p) {
		this.crdsts4p.setValue(crdsts4p);
	}
	/**
	 * Gets the reference for attribute crdsts4h.
	 * @return the crdsts4h attribute reference
	 */
	public ElementaryRangeReference getCrdsts4hReference() {
		return crdsts4h.getReference();
	}

	/**
	 * Getter for crdsts4h attribute.
	 * @return crdsts4h attribute
	 */
	public String getCrdsts4h() {
		return crdsts4h.getValue();
	}

	/**
	 * Setter for crdsts4h attribute.
	 * @param crdsts4h the new value of crdsts4h
	 */
	public void setCrdsts4h(String crdsts4h) {
		this.crdsts4h.setValue(crdsts4h);
	}
	/**
	 * Gets the reference for attribute crdsts4v.
	 * @return the crdsts4v attribute reference
	 */
	public ElementaryRangeReference getCrdsts4vReference() {
		return crdsts4v.getReference();
	}

	/**
	 * Getter for crdsts4v attribute.
	 * @return crdsts4v attribute
	 */
	public String getCrdsts4v() {
		return crdsts4v.getValue();
	}

	/**
	 * Setter for crdsts4v attribute.
	 * @param crdsts4v the new value of crdsts4v
	 */
	public void setCrdsts4v(String crdsts4v) {
		this.crdsts4v.setValue(crdsts4v);
	}
	/**
	 * Gets the reference for attribute crdsts4o.
	 * @return the crdsts4o attribute reference
	 */
	public ElementaryRangeReference getCrdsts4oReference() {
		return crdsts4o.getReference();
	}

	/**
	 * Getter for crdsts4o attribute.
	 * @return crdsts4o attribute
	 */
	public String getCrdsts4o() {
		return crdsts4o.getValue();
	}

	/**
	 * Setter for crdsts4o attribute.
	 * @param crdsts4o the new value of crdsts4o
	 */
	public void setCrdsts4o(String crdsts4o) {
		this.crdsts4o.setValue(crdsts4o);
	}
	/**
	 * Gets the reference for attribute crdsel5c.
	 * @return the crdsel5c attribute reference
	 */
	public ElementaryRangeReference getCrdsel5cReference() {
		return crdsel5c.getReference();
	}

	/**
	 * Getter for crdsel5c attribute.
	 * @return crdsel5c attribute
	 */
	public String getCrdsel5c() {
		return crdsel5c.getValue();
	}

	/**
	 * Setter for crdsel5c attribute.
	 * @param crdsel5c the new value of crdsel5c
	 */
	public void setCrdsel5c(String crdsel5c) {
		this.crdsel5c.setValue(crdsel5c);
	}
	/**
	 * Gets the reference for attribute crdsel5p.
	 * @return the crdsel5p attribute reference
	 */
	public ElementaryRangeReference getCrdsel5pReference() {
		return crdsel5p.getReference();
	}

	/**
	 * Getter for crdsel5p attribute.
	 * @return crdsel5p attribute
	 */
	public String getCrdsel5p() {
		return crdsel5p.getValue();
	}

	/**
	 * Setter for crdsel5p attribute.
	 * @param crdsel5p the new value of crdsel5p
	 */
	public void setCrdsel5p(String crdsel5p) {
		this.crdsel5p.setValue(crdsel5p);
	}
	/**
	 * Gets the reference for attribute crdsel5h.
	 * @return the crdsel5h attribute reference
	 */
	public ElementaryRangeReference getCrdsel5hReference() {
		return crdsel5h.getReference();
	}

	/**
	 * Getter for crdsel5h attribute.
	 * @return crdsel5h attribute
	 */
	public String getCrdsel5h() {
		return crdsel5h.getValue();
	}

	/**
	 * Setter for crdsel5h attribute.
	 * @param crdsel5h the new value of crdsel5h
	 */
	public void setCrdsel5h(String crdsel5h) {
		this.crdsel5h.setValue(crdsel5h);
	}
	/**
	 * Gets the reference for attribute crdsel5v.
	 * @return the crdsel5v attribute reference
	 */
	public ElementaryRangeReference getCrdsel5vReference() {
		return crdsel5v.getReference();
	}

	/**
	 * Getter for crdsel5v attribute.
	 * @return crdsel5v attribute
	 */
	public String getCrdsel5v() {
		return crdsel5v.getValue();
	}

	/**
	 * Setter for crdsel5v attribute.
	 * @param crdsel5v the new value of crdsel5v
	 */
	public void setCrdsel5v(String crdsel5v) {
		this.crdsel5v.setValue(crdsel5v);
	}
	/**
	 * Gets the reference for attribute crdsel5o.
	 * @return the crdsel5o attribute reference
	 */
	public ElementaryRangeReference getCrdsel5oReference() {
		return crdsel5o.getReference();
	}

	/**
	 * Getter for crdsel5o attribute.
	 * @return crdsel5o attribute
	 */
	public String getCrdsel5o() {
		return crdsel5o.getValue();
	}

	/**
	 * Setter for crdsel5o attribute.
	 * @param crdsel5o the new value of crdsel5o
	 */
	public void setCrdsel5o(String crdsel5o) {
		this.crdsel5o.setValue(crdsel5o);
	}
	/**
	 * Gets the reference for attribute crdstp5c.
	 * @return the crdstp5c attribute reference
	 */
	public ElementaryRangeReference getCrdstp5cReference() {
		return crdstp5c.getReference();
	}

	/**
	 * Getter for crdstp5c attribute.
	 * @return crdstp5c attribute
	 */
	public String getCrdstp5c() {
		return crdstp5c.getValue();
	}

	/**
	 * Setter for crdstp5c attribute.
	 * @param crdstp5c the new value of crdstp5c
	 */
	public void setCrdstp5c(String crdstp5c) {
		this.crdstp5c.setValue(crdstp5c);
	}
	/**
	 * Gets the reference for attribute crdstp5p.
	 * @return the crdstp5p attribute reference
	 */
	public ElementaryRangeReference getCrdstp5pReference() {
		return crdstp5p.getReference();
	}

	/**
	 * Getter for crdstp5p attribute.
	 * @return crdstp5p attribute
	 */
	public String getCrdstp5p() {
		return crdstp5p.getValue();
	}

	/**
	 * Setter for crdstp5p attribute.
	 * @param crdstp5p the new value of crdstp5p
	 */
	public void setCrdstp5p(String crdstp5p) {
		this.crdstp5p.setValue(crdstp5p);
	}
	/**
	 * Gets the reference for attribute crdstp5h.
	 * @return the crdstp5h attribute reference
	 */
	public ElementaryRangeReference getCrdstp5hReference() {
		return crdstp5h.getReference();
	}

	/**
	 * Getter for crdstp5h attribute.
	 * @return crdstp5h attribute
	 */
	public String getCrdstp5h() {
		return crdstp5h.getValue();
	}

	/**
	 * Setter for crdstp5h attribute.
	 * @param crdstp5h the new value of crdstp5h
	 */
	public void setCrdstp5h(String crdstp5h) {
		this.crdstp5h.setValue(crdstp5h);
	}
	/**
	 * Gets the reference for attribute crdstp5v.
	 * @return the crdstp5v attribute reference
	 */
	public ElementaryRangeReference getCrdstp5vReference() {
		return crdstp5v.getReference();
	}

	/**
	 * Getter for crdstp5v attribute.
	 * @return crdstp5v attribute
	 */
	public String getCrdstp5v() {
		return crdstp5v.getValue();
	}

	/**
	 * Setter for crdstp5v attribute.
	 * @param crdstp5v the new value of crdstp5v
	 */
	public void setCrdstp5v(String crdstp5v) {
		this.crdstp5v.setValue(crdstp5v);
	}
	/**
	 * Gets the reference for attribute crdstp5o.
	 * @return the crdstp5o attribute reference
	 */
	public ElementaryRangeReference getCrdstp5oReference() {
		return crdstp5o.getReference();
	}

	/**
	 * Getter for crdstp5o attribute.
	 * @return crdstp5o attribute
	 */
	public String getCrdstp5o() {
		return crdstp5o.getValue();
	}

	/**
	 * Setter for crdstp5o attribute.
	 * @param crdstp5o the new value of crdstp5o
	 */
	public void setCrdstp5o(String crdstp5o) {
		this.crdstp5o.setValue(crdstp5o);
	}
	/**
	 * Gets the reference for attribute acctno5c.
	 * @return the acctno5c attribute reference
	 */
	public ElementaryRangeReference getAcctno5cReference() {
		return acctno5c.getReference();
	}

	/**
	 * Getter for acctno5c attribute.
	 * @return acctno5c attribute
	 */
	public String getAcctno5c() {
		return acctno5c.getValue();
	}

	/**
	 * Setter for acctno5c attribute.
	 * @param acctno5c the new value of acctno5c
	 */
	public void setAcctno5c(String acctno5c) {
		this.acctno5c.setValue(acctno5c);
	}
	/**
	 * Gets the reference for attribute acctno5p.
	 * @return the acctno5p attribute reference
	 */
	public ElementaryRangeReference getAcctno5pReference() {
		return acctno5p.getReference();
	}

	/**
	 * Getter for acctno5p attribute.
	 * @return acctno5p attribute
	 */
	public String getAcctno5p() {
		return acctno5p.getValue();
	}

	/**
	 * Setter for acctno5p attribute.
	 * @param acctno5p the new value of acctno5p
	 */
	public void setAcctno5p(String acctno5p) {
		this.acctno5p.setValue(acctno5p);
	}
	/**
	 * Gets the reference for attribute acctno5h.
	 * @return the acctno5h attribute reference
	 */
	public ElementaryRangeReference getAcctno5hReference() {
		return acctno5h.getReference();
	}

	/**
	 * Getter for acctno5h attribute.
	 * @return acctno5h attribute
	 */
	public String getAcctno5h() {
		return acctno5h.getValue();
	}

	/**
	 * Setter for acctno5h attribute.
	 * @param acctno5h the new value of acctno5h
	 */
	public void setAcctno5h(String acctno5h) {
		this.acctno5h.setValue(acctno5h);
	}
	/**
	 * Gets the reference for attribute acctno5v.
	 * @return the acctno5v attribute reference
	 */
	public ElementaryRangeReference getAcctno5vReference() {
		return acctno5v.getReference();
	}

	/**
	 * Getter for acctno5v attribute.
	 * @return acctno5v attribute
	 */
	public String getAcctno5v() {
		return acctno5v.getValue();
	}

	/**
	 * Setter for acctno5v attribute.
	 * @param acctno5v the new value of acctno5v
	 */
	public void setAcctno5v(String acctno5v) {
		this.acctno5v.setValue(acctno5v);
	}
	/**
	 * Gets the reference for attribute acctno5o.
	 * @return the acctno5o attribute reference
	 */
	public ElementaryRangeReference getAcctno5oReference() {
		return acctno5o.getReference();
	}

	/**
	 * Getter for acctno5o attribute.
	 * @return acctno5o attribute
	 */
	public String getAcctno5o() {
		return acctno5o.getValue();
	}

	/**
	 * Setter for acctno5o attribute.
	 * @param acctno5o the new value of acctno5o
	 */
	public void setAcctno5o(String acctno5o) {
		this.acctno5o.setValue(acctno5o);
	}
	/**
	 * Gets the reference for attribute crdnum5c.
	 * @return the crdnum5c attribute reference
	 */
	public ElementaryRangeReference getCrdnum5cReference() {
		return crdnum5c.getReference();
	}

	/**
	 * Getter for crdnum5c attribute.
	 * @return crdnum5c attribute
	 */
	public String getCrdnum5c() {
		return crdnum5c.getValue();
	}

	/**
	 * Setter for crdnum5c attribute.
	 * @param crdnum5c the new value of crdnum5c
	 */
	public void setCrdnum5c(String crdnum5c) {
		this.crdnum5c.setValue(crdnum5c);
	}
	/**
	 * Gets the reference for attribute crdnum5p.
	 * @return the crdnum5p attribute reference
	 */
	public ElementaryRangeReference getCrdnum5pReference() {
		return crdnum5p.getReference();
	}

	/**
	 * Getter for crdnum5p attribute.
	 * @return crdnum5p attribute
	 */
	public String getCrdnum5p() {
		return crdnum5p.getValue();
	}

	/**
	 * Setter for crdnum5p attribute.
	 * @param crdnum5p the new value of crdnum5p
	 */
	public void setCrdnum5p(String crdnum5p) {
		this.crdnum5p.setValue(crdnum5p);
	}
	/**
	 * Gets the reference for attribute crdnum5h.
	 * @return the crdnum5h attribute reference
	 */
	public ElementaryRangeReference getCrdnum5hReference() {
		return crdnum5h.getReference();
	}

	/**
	 * Getter for crdnum5h attribute.
	 * @return crdnum5h attribute
	 */
	public String getCrdnum5h() {
		return crdnum5h.getValue();
	}

	/**
	 * Setter for crdnum5h attribute.
	 * @param crdnum5h the new value of crdnum5h
	 */
	public void setCrdnum5h(String crdnum5h) {
		this.crdnum5h.setValue(crdnum5h);
	}
	/**
	 * Gets the reference for attribute crdnum5v.
	 * @return the crdnum5v attribute reference
	 */
	public ElementaryRangeReference getCrdnum5vReference() {
		return crdnum5v.getReference();
	}

	/**
	 * Getter for crdnum5v attribute.
	 * @return crdnum5v attribute
	 */
	public String getCrdnum5v() {
		return crdnum5v.getValue();
	}

	/**
	 * Setter for crdnum5v attribute.
	 * @param crdnum5v the new value of crdnum5v
	 */
	public void setCrdnum5v(String crdnum5v) {
		this.crdnum5v.setValue(crdnum5v);
	}
	/**
	 * Gets the reference for attribute crdnum5o.
	 * @return the crdnum5o attribute reference
	 */
	public ElementaryRangeReference getCrdnum5oReference() {
		return crdnum5o.getReference();
	}

	/**
	 * Getter for crdnum5o attribute.
	 * @return crdnum5o attribute
	 */
	public String getCrdnum5o() {
		return crdnum5o.getValue();
	}

	/**
	 * Setter for crdnum5o attribute.
	 * @param crdnum5o the new value of crdnum5o
	 */
	public void setCrdnum5o(String crdnum5o) {
		this.crdnum5o.setValue(crdnum5o);
	}
	/**
	 * Gets the reference for attribute crdsts5c.
	 * @return the crdsts5c attribute reference
	 */
	public ElementaryRangeReference getCrdsts5cReference() {
		return crdsts5c.getReference();
	}

	/**
	 * Getter for crdsts5c attribute.
	 * @return crdsts5c attribute
	 */
	public String getCrdsts5c() {
		return crdsts5c.getValue();
	}

	/**
	 * Setter for crdsts5c attribute.
	 * @param crdsts5c the new value of crdsts5c
	 */
	public void setCrdsts5c(String crdsts5c) {
		this.crdsts5c.setValue(crdsts5c);
	}
	/**
	 * Gets the reference for attribute crdsts5p.
	 * @return the crdsts5p attribute reference
	 */
	public ElementaryRangeReference getCrdsts5pReference() {
		return crdsts5p.getReference();
	}

	/**
	 * Getter for crdsts5p attribute.
	 * @return crdsts5p attribute
	 */
	public String getCrdsts5p() {
		return crdsts5p.getValue();
	}

	/**
	 * Setter for crdsts5p attribute.
	 * @param crdsts5p the new value of crdsts5p
	 */
	public void setCrdsts5p(String crdsts5p) {
		this.crdsts5p.setValue(crdsts5p);
	}
	/**
	 * Gets the reference for attribute crdsts5h.
	 * @return the crdsts5h attribute reference
	 */
	public ElementaryRangeReference getCrdsts5hReference() {
		return crdsts5h.getReference();
	}

	/**
	 * Getter for crdsts5h attribute.
	 * @return crdsts5h attribute
	 */
	public String getCrdsts5h() {
		return crdsts5h.getValue();
	}

	/**
	 * Setter for crdsts5h attribute.
	 * @param crdsts5h the new value of crdsts5h
	 */
	public void setCrdsts5h(String crdsts5h) {
		this.crdsts5h.setValue(crdsts5h);
	}
	/**
	 * Gets the reference for attribute crdsts5v.
	 * @return the crdsts5v attribute reference
	 */
	public ElementaryRangeReference getCrdsts5vReference() {
		return crdsts5v.getReference();
	}

	/**
	 * Getter for crdsts5v attribute.
	 * @return crdsts5v attribute
	 */
	public String getCrdsts5v() {
		return crdsts5v.getValue();
	}

	/**
	 * Setter for crdsts5v attribute.
	 * @param crdsts5v the new value of crdsts5v
	 */
	public void setCrdsts5v(String crdsts5v) {
		this.crdsts5v.setValue(crdsts5v);
	}
	/**
	 * Gets the reference for attribute crdsts5o.
	 * @return the crdsts5o attribute reference
	 */
	public ElementaryRangeReference getCrdsts5oReference() {
		return crdsts5o.getReference();
	}

	/**
	 * Getter for crdsts5o attribute.
	 * @return crdsts5o attribute
	 */
	public String getCrdsts5o() {
		return crdsts5o.getValue();
	}

	/**
	 * Setter for crdsts5o attribute.
	 * @param crdsts5o the new value of crdsts5o
	 */
	public void setCrdsts5o(String crdsts5o) {
		this.crdsts5o.setValue(crdsts5o);
	}
	/**
	 * Gets the reference for attribute crdsel6c.
	 * @return the crdsel6c attribute reference
	 */
	public ElementaryRangeReference getCrdsel6cReference() {
		return crdsel6c.getReference();
	}

	/**
	 * Getter for crdsel6c attribute.
	 * @return crdsel6c attribute
	 */
	public String getCrdsel6c() {
		return crdsel6c.getValue();
	}

	/**
	 * Setter for crdsel6c attribute.
	 * @param crdsel6c the new value of crdsel6c
	 */
	public void setCrdsel6c(String crdsel6c) {
		this.crdsel6c.setValue(crdsel6c);
	}
	/**
	 * Gets the reference for attribute crdsel6p.
	 * @return the crdsel6p attribute reference
	 */
	public ElementaryRangeReference getCrdsel6pReference() {
		return crdsel6p.getReference();
	}

	/**
	 * Getter for crdsel6p attribute.
	 * @return crdsel6p attribute
	 */
	public String getCrdsel6p() {
		return crdsel6p.getValue();
	}

	/**
	 * Setter for crdsel6p attribute.
	 * @param crdsel6p the new value of crdsel6p
	 */
	public void setCrdsel6p(String crdsel6p) {
		this.crdsel6p.setValue(crdsel6p);
	}
	/**
	 * Gets the reference for attribute crdsel6h.
	 * @return the crdsel6h attribute reference
	 */
	public ElementaryRangeReference getCrdsel6hReference() {
		return crdsel6h.getReference();
	}

	/**
	 * Getter for crdsel6h attribute.
	 * @return crdsel6h attribute
	 */
	public String getCrdsel6h() {
		return crdsel6h.getValue();
	}

	/**
	 * Setter for crdsel6h attribute.
	 * @param crdsel6h the new value of crdsel6h
	 */
	public void setCrdsel6h(String crdsel6h) {
		this.crdsel6h.setValue(crdsel6h);
	}
	/**
	 * Gets the reference for attribute crdsel6v.
	 * @return the crdsel6v attribute reference
	 */
	public ElementaryRangeReference getCrdsel6vReference() {
		return crdsel6v.getReference();
	}

	/**
	 * Getter for crdsel6v attribute.
	 * @return crdsel6v attribute
	 */
	public String getCrdsel6v() {
		return crdsel6v.getValue();
	}

	/**
	 * Setter for crdsel6v attribute.
	 * @param crdsel6v the new value of crdsel6v
	 */
	public void setCrdsel6v(String crdsel6v) {
		this.crdsel6v.setValue(crdsel6v);
	}
	/**
	 * Gets the reference for attribute crdsel6o.
	 * @return the crdsel6o attribute reference
	 */
	public ElementaryRangeReference getCrdsel6oReference() {
		return crdsel6o.getReference();
	}

	/**
	 * Getter for crdsel6o attribute.
	 * @return crdsel6o attribute
	 */
	public String getCrdsel6o() {
		return crdsel6o.getValue();
	}

	/**
	 * Setter for crdsel6o attribute.
	 * @param crdsel6o the new value of crdsel6o
	 */
	public void setCrdsel6o(String crdsel6o) {
		this.crdsel6o.setValue(crdsel6o);
	}
	/**
	 * Gets the reference for attribute crdstp6c.
	 * @return the crdstp6c attribute reference
	 */
	public ElementaryRangeReference getCrdstp6cReference() {
		return crdstp6c.getReference();
	}

	/**
	 * Getter for crdstp6c attribute.
	 * @return crdstp6c attribute
	 */
	public String getCrdstp6c() {
		return crdstp6c.getValue();
	}

	/**
	 * Setter for crdstp6c attribute.
	 * @param crdstp6c the new value of crdstp6c
	 */
	public void setCrdstp6c(String crdstp6c) {
		this.crdstp6c.setValue(crdstp6c);
	}
	/**
	 * Gets the reference for attribute crdstp6p.
	 * @return the crdstp6p attribute reference
	 */
	public ElementaryRangeReference getCrdstp6pReference() {
		return crdstp6p.getReference();
	}

	/**
	 * Getter for crdstp6p attribute.
	 * @return crdstp6p attribute
	 */
	public String getCrdstp6p() {
		return crdstp6p.getValue();
	}

	/**
	 * Setter for crdstp6p attribute.
	 * @param crdstp6p the new value of crdstp6p
	 */
	public void setCrdstp6p(String crdstp6p) {
		this.crdstp6p.setValue(crdstp6p);
	}
	/**
	 * Gets the reference for attribute crdstp6h.
	 * @return the crdstp6h attribute reference
	 */
	public ElementaryRangeReference getCrdstp6hReference() {
		return crdstp6h.getReference();
	}

	/**
	 * Getter for crdstp6h attribute.
	 * @return crdstp6h attribute
	 */
	public String getCrdstp6h() {
		return crdstp6h.getValue();
	}

	/**
	 * Setter for crdstp6h attribute.
	 * @param crdstp6h the new value of crdstp6h
	 */
	public void setCrdstp6h(String crdstp6h) {
		this.crdstp6h.setValue(crdstp6h);
	}
	/**
	 * Gets the reference for attribute crdstp6v.
	 * @return the crdstp6v attribute reference
	 */
	public ElementaryRangeReference getCrdstp6vReference() {
		return crdstp6v.getReference();
	}

	/**
	 * Getter for crdstp6v attribute.
	 * @return crdstp6v attribute
	 */
	public String getCrdstp6v() {
		return crdstp6v.getValue();
	}

	/**
	 * Setter for crdstp6v attribute.
	 * @param crdstp6v the new value of crdstp6v
	 */
	public void setCrdstp6v(String crdstp6v) {
		this.crdstp6v.setValue(crdstp6v);
	}
	/**
	 * Gets the reference for attribute crdstp6o.
	 * @return the crdstp6o attribute reference
	 */
	public ElementaryRangeReference getCrdstp6oReference() {
		return crdstp6o.getReference();
	}

	/**
	 * Getter for crdstp6o attribute.
	 * @return crdstp6o attribute
	 */
	public String getCrdstp6o() {
		return crdstp6o.getValue();
	}

	/**
	 * Setter for crdstp6o attribute.
	 * @param crdstp6o the new value of crdstp6o
	 */
	public void setCrdstp6o(String crdstp6o) {
		this.crdstp6o.setValue(crdstp6o);
	}
	/**
	 * Gets the reference for attribute acctno6c.
	 * @return the acctno6c attribute reference
	 */
	public ElementaryRangeReference getAcctno6cReference() {
		return acctno6c.getReference();
	}

	/**
	 * Getter for acctno6c attribute.
	 * @return acctno6c attribute
	 */
	public String getAcctno6c() {
		return acctno6c.getValue();
	}

	/**
	 * Setter for acctno6c attribute.
	 * @param acctno6c the new value of acctno6c
	 */
	public void setAcctno6c(String acctno6c) {
		this.acctno6c.setValue(acctno6c);
	}
	/**
	 * Gets the reference for attribute acctno6p.
	 * @return the acctno6p attribute reference
	 */
	public ElementaryRangeReference getAcctno6pReference() {
		return acctno6p.getReference();
	}

	/**
	 * Getter for acctno6p attribute.
	 * @return acctno6p attribute
	 */
	public String getAcctno6p() {
		return acctno6p.getValue();
	}

	/**
	 * Setter for acctno6p attribute.
	 * @param acctno6p the new value of acctno6p
	 */
	public void setAcctno6p(String acctno6p) {
		this.acctno6p.setValue(acctno6p);
	}
	/**
	 * Gets the reference for attribute acctno6h.
	 * @return the acctno6h attribute reference
	 */
	public ElementaryRangeReference getAcctno6hReference() {
		return acctno6h.getReference();
	}

	/**
	 * Getter for acctno6h attribute.
	 * @return acctno6h attribute
	 */
	public String getAcctno6h() {
		return acctno6h.getValue();
	}

	/**
	 * Setter for acctno6h attribute.
	 * @param acctno6h the new value of acctno6h
	 */
	public void setAcctno6h(String acctno6h) {
		this.acctno6h.setValue(acctno6h);
	}
	/**
	 * Gets the reference for attribute acctno6v.
	 * @return the acctno6v attribute reference
	 */
	public ElementaryRangeReference getAcctno6vReference() {
		return acctno6v.getReference();
	}

	/**
	 * Getter for acctno6v attribute.
	 * @return acctno6v attribute
	 */
	public String getAcctno6v() {
		return acctno6v.getValue();
	}

	/**
	 * Setter for acctno6v attribute.
	 * @param acctno6v the new value of acctno6v
	 */
	public void setAcctno6v(String acctno6v) {
		this.acctno6v.setValue(acctno6v);
	}
	/**
	 * Gets the reference for attribute acctno6o.
	 * @return the acctno6o attribute reference
	 */
	public ElementaryRangeReference getAcctno6oReference() {
		return acctno6o.getReference();
	}

	/**
	 * Getter for acctno6o attribute.
	 * @return acctno6o attribute
	 */
	public String getAcctno6o() {
		return acctno6o.getValue();
	}

	/**
	 * Setter for acctno6o attribute.
	 * @param acctno6o the new value of acctno6o
	 */
	public void setAcctno6o(String acctno6o) {
		this.acctno6o.setValue(acctno6o);
	}
	/**
	 * Gets the reference for attribute crdnum6c.
	 * @return the crdnum6c attribute reference
	 */
	public ElementaryRangeReference getCrdnum6cReference() {
		return crdnum6c.getReference();
	}

	/**
	 * Getter for crdnum6c attribute.
	 * @return crdnum6c attribute
	 */
	public String getCrdnum6c() {
		return crdnum6c.getValue();
	}

	/**
	 * Setter for crdnum6c attribute.
	 * @param crdnum6c the new value of crdnum6c
	 */
	public void setCrdnum6c(String crdnum6c) {
		this.crdnum6c.setValue(crdnum6c);
	}
	/**
	 * Gets the reference for attribute crdnum6p.
	 * @return the crdnum6p attribute reference
	 */
	public ElementaryRangeReference getCrdnum6pReference() {
		return crdnum6p.getReference();
	}

	/**
	 * Getter for crdnum6p attribute.
	 * @return crdnum6p attribute
	 */
	public String getCrdnum6p() {
		return crdnum6p.getValue();
	}

	/**
	 * Setter for crdnum6p attribute.
	 * @param crdnum6p the new value of crdnum6p
	 */
	public void setCrdnum6p(String crdnum6p) {
		this.crdnum6p.setValue(crdnum6p);
	}
	/**
	 * Gets the reference for attribute crdnum6h.
	 * @return the crdnum6h attribute reference
	 */
	public ElementaryRangeReference getCrdnum6hReference() {
		return crdnum6h.getReference();
	}

	/**
	 * Getter for crdnum6h attribute.
	 * @return crdnum6h attribute
	 */
	public String getCrdnum6h() {
		return crdnum6h.getValue();
	}

	/**
	 * Setter for crdnum6h attribute.
	 * @param crdnum6h the new value of crdnum6h
	 */
	public void setCrdnum6h(String crdnum6h) {
		this.crdnum6h.setValue(crdnum6h);
	}
	/**
	 * Gets the reference for attribute crdnum6v.
	 * @return the crdnum6v attribute reference
	 */
	public ElementaryRangeReference getCrdnum6vReference() {
		return crdnum6v.getReference();
	}

	/**
	 * Getter for crdnum6v attribute.
	 * @return crdnum6v attribute
	 */
	public String getCrdnum6v() {
		return crdnum6v.getValue();
	}

	/**
	 * Setter for crdnum6v attribute.
	 * @param crdnum6v the new value of crdnum6v
	 */
	public void setCrdnum6v(String crdnum6v) {
		this.crdnum6v.setValue(crdnum6v);
	}
	/**
	 * Gets the reference for attribute crdnum6o.
	 * @return the crdnum6o attribute reference
	 */
	public ElementaryRangeReference getCrdnum6oReference() {
		return crdnum6o.getReference();
	}

	/**
	 * Getter for crdnum6o attribute.
	 * @return crdnum6o attribute
	 */
	public String getCrdnum6o() {
		return crdnum6o.getValue();
	}

	/**
	 * Setter for crdnum6o attribute.
	 * @param crdnum6o the new value of crdnum6o
	 */
	public void setCrdnum6o(String crdnum6o) {
		this.crdnum6o.setValue(crdnum6o);
	}
	/**
	 * Gets the reference for attribute crdsts6c.
	 * @return the crdsts6c attribute reference
	 */
	public ElementaryRangeReference getCrdsts6cReference() {
		return crdsts6c.getReference();
	}

	/**
	 * Getter for crdsts6c attribute.
	 * @return crdsts6c attribute
	 */
	public String getCrdsts6c() {
		return crdsts6c.getValue();
	}

	/**
	 * Setter for crdsts6c attribute.
	 * @param crdsts6c the new value of crdsts6c
	 */
	public void setCrdsts6c(String crdsts6c) {
		this.crdsts6c.setValue(crdsts6c);
	}
	/**
	 * Gets the reference for attribute crdsts6p.
	 * @return the crdsts6p attribute reference
	 */
	public ElementaryRangeReference getCrdsts6pReference() {
		return crdsts6p.getReference();
	}

	/**
	 * Getter for crdsts6p attribute.
	 * @return crdsts6p attribute
	 */
	public String getCrdsts6p() {
		return crdsts6p.getValue();
	}

	/**
	 * Setter for crdsts6p attribute.
	 * @param crdsts6p the new value of crdsts6p
	 */
	public void setCrdsts6p(String crdsts6p) {
		this.crdsts6p.setValue(crdsts6p);
	}
	/**
	 * Gets the reference for attribute crdsts6h.
	 * @return the crdsts6h attribute reference
	 */
	public ElementaryRangeReference getCrdsts6hReference() {
		return crdsts6h.getReference();
	}

	/**
	 * Getter for crdsts6h attribute.
	 * @return crdsts6h attribute
	 */
	public String getCrdsts6h() {
		return crdsts6h.getValue();
	}

	/**
	 * Setter for crdsts6h attribute.
	 * @param crdsts6h the new value of crdsts6h
	 */
	public void setCrdsts6h(String crdsts6h) {
		this.crdsts6h.setValue(crdsts6h);
	}
	/**
	 * Gets the reference for attribute crdsts6v.
	 * @return the crdsts6v attribute reference
	 */
	public ElementaryRangeReference getCrdsts6vReference() {
		return crdsts6v.getReference();
	}

	/**
	 * Getter for crdsts6v attribute.
	 * @return crdsts6v attribute
	 */
	public String getCrdsts6v() {
		return crdsts6v.getValue();
	}

	/**
	 * Setter for crdsts6v attribute.
	 * @param crdsts6v the new value of crdsts6v
	 */
	public void setCrdsts6v(String crdsts6v) {
		this.crdsts6v.setValue(crdsts6v);
	}
	/**
	 * Gets the reference for attribute crdsts6o.
	 * @return the crdsts6o attribute reference
	 */
	public ElementaryRangeReference getCrdsts6oReference() {
		return crdsts6o.getReference();
	}

	/**
	 * Getter for crdsts6o attribute.
	 * @return crdsts6o attribute
	 */
	public String getCrdsts6o() {
		return crdsts6o.getValue();
	}

	/**
	 * Setter for crdsts6o attribute.
	 * @param crdsts6o the new value of crdsts6o
	 */
	public void setCrdsts6o(String crdsts6o) {
		this.crdsts6o.setValue(crdsts6o);
	}
	/**
	 * Gets the reference for attribute crdsel7c.
	 * @return the crdsel7c attribute reference
	 */
	public ElementaryRangeReference getCrdsel7cReference() {
		return crdsel7c.getReference();
	}

	/**
	 * Getter for crdsel7c attribute.
	 * @return crdsel7c attribute
	 */
	public String getCrdsel7c() {
		return crdsel7c.getValue();
	}

	/**
	 * Setter for crdsel7c attribute.
	 * @param crdsel7c the new value of crdsel7c
	 */
	public void setCrdsel7c(String crdsel7c) {
		this.crdsel7c.setValue(crdsel7c);
	}
	/**
	 * Gets the reference for attribute crdsel7p.
	 * @return the crdsel7p attribute reference
	 */
	public ElementaryRangeReference getCrdsel7pReference() {
		return crdsel7p.getReference();
	}

	/**
	 * Getter for crdsel7p attribute.
	 * @return crdsel7p attribute
	 */
	public String getCrdsel7p() {
		return crdsel7p.getValue();
	}

	/**
	 * Setter for crdsel7p attribute.
	 * @param crdsel7p the new value of crdsel7p
	 */
	public void setCrdsel7p(String crdsel7p) {
		this.crdsel7p.setValue(crdsel7p);
	}
	/**
	 * Gets the reference for attribute crdsel7h.
	 * @return the crdsel7h attribute reference
	 */
	public ElementaryRangeReference getCrdsel7hReference() {
		return crdsel7h.getReference();
	}

	/**
	 * Getter for crdsel7h attribute.
	 * @return crdsel7h attribute
	 */
	public String getCrdsel7h() {
		return crdsel7h.getValue();
	}

	/**
	 * Setter for crdsel7h attribute.
	 * @param crdsel7h the new value of crdsel7h
	 */
	public void setCrdsel7h(String crdsel7h) {
		this.crdsel7h.setValue(crdsel7h);
	}
	/**
	 * Gets the reference for attribute crdsel7v.
	 * @return the crdsel7v attribute reference
	 */
	public ElementaryRangeReference getCrdsel7vReference() {
		return crdsel7v.getReference();
	}

	/**
	 * Getter for crdsel7v attribute.
	 * @return crdsel7v attribute
	 */
	public String getCrdsel7v() {
		return crdsel7v.getValue();
	}

	/**
	 * Setter for crdsel7v attribute.
	 * @param crdsel7v the new value of crdsel7v
	 */
	public void setCrdsel7v(String crdsel7v) {
		this.crdsel7v.setValue(crdsel7v);
	}
	/**
	 * Gets the reference for attribute crdsel7o.
	 * @return the crdsel7o attribute reference
	 */
	public ElementaryRangeReference getCrdsel7oReference() {
		return crdsel7o.getReference();
	}

	/**
	 * Getter for crdsel7o attribute.
	 * @return crdsel7o attribute
	 */
	public String getCrdsel7o() {
		return crdsel7o.getValue();
	}

	/**
	 * Setter for crdsel7o attribute.
	 * @param crdsel7o the new value of crdsel7o
	 */
	public void setCrdsel7o(String crdsel7o) {
		this.crdsel7o.setValue(crdsel7o);
	}
	/**
	 * Gets the reference for attribute crdstp7c.
	 * @return the crdstp7c attribute reference
	 */
	public ElementaryRangeReference getCrdstp7cReference() {
		return crdstp7c.getReference();
	}

	/**
	 * Getter for crdstp7c attribute.
	 * @return crdstp7c attribute
	 */
	public String getCrdstp7c() {
		return crdstp7c.getValue();
	}

	/**
	 * Setter for crdstp7c attribute.
	 * @param crdstp7c the new value of crdstp7c
	 */
	public void setCrdstp7c(String crdstp7c) {
		this.crdstp7c.setValue(crdstp7c);
	}
	/**
	 * Gets the reference for attribute crdstp7p.
	 * @return the crdstp7p attribute reference
	 */
	public ElementaryRangeReference getCrdstp7pReference() {
		return crdstp7p.getReference();
	}

	/**
	 * Getter for crdstp7p attribute.
	 * @return crdstp7p attribute
	 */
	public String getCrdstp7p() {
		return crdstp7p.getValue();
	}

	/**
	 * Setter for crdstp7p attribute.
	 * @param crdstp7p the new value of crdstp7p
	 */
	public void setCrdstp7p(String crdstp7p) {
		this.crdstp7p.setValue(crdstp7p);
	}
	/**
	 * Gets the reference for attribute crdstp7h.
	 * @return the crdstp7h attribute reference
	 */
	public ElementaryRangeReference getCrdstp7hReference() {
		return crdstp7h.getReference();
	}

	/**
	 * Getter for crdstp7h attribute.
	 * @return crdstp7h attribute
	 */
	public String getCrdstp7h() {
		return crdstp7h.getValue();
	}

	/**
	 * Setter for crdstp7h attribute.
	 * @param crdstp7h the new value of crdstp7h
	 */
	public void setCrdstp7h(String crdstp7h) {
		this.crdstp7h.setValue(crdstp7h);
	}
	/**
	 * Gets the reference for attribute crdstp7v.
	 * @return the crdstp7v attribute reference
	 */
	public ElementaryRangeReference getCrdstp7vReference() {
		return crdstp7v.getReference();
	}

	/**
	 * Getter for crdstp7v attribute.
	 * @return crdstp7v attribute
	 */
	public String getCrdstp7v() {
		return crdstp7v.getValue();
	}

	/**
	 * Setter for crdstp7v attribute.
	 * @param crdstp7v the new value of crdstp7v
	 */
	public void setCrdstp7v(String crdstp7v) {
		this.crdstp7v.setValue(crdstp7v);
	}
	/**
	 * Gets the reference for attribute crdstp7o.
	 * @return the crdstp7o attribute reference
	 */
	public ElementaryRangeReference getCrdstp7oReference() {
		return crdstp7o.getReference();
	}

	/**
	 * Getter for crdstp7o attribute.
	 * @return crdstp7o attribute
	 */
	public String getCrdstp7o() {
		return crdstp7o.getValue();
	}

	/**
	 * Setter for crdstp7o attribute.
	 * @param crdstp7o the new value of crdstp7o
	 */
	public void setCrdstp7o(String crdstp7o) {
		this.crdstp7o.setValue(crdstp7o);
	}
	/**
	 * Gets the reference for attribute acctno7c.
	 * @return the acctno7c attribute reference
	 */
	public ElementaryRangeReference getAcctno7cReference() {
		return acctno7c.getReference();
	}

	/**
	 * Getter for acctno7c attribute.
	 * @return acctno7c attribute
	 */
	public String getAcctno7c() {
		return acctno7c.getValue();
	}

	/**
	 * Setter for acctno7c attribute.
	 * @param acctno7c the new value of acctno7c
	 */
	public void setAcctno7c(String acctno7c) {
		this.acctno7c.setValue(acctno7c);
	}
	/**
	 * Gets the reference for attribute acctno7p.
	 * @return the acctno7p attribute reference
	 */
	public ElementaryRangeReference getAcctno7pReference() {
		return acctno7p.getReference();
	}

	/**
	 * Getter for acctno7p attribute.
	 * @return acctno7p attribute
	 */
	public String getAcctno7p() {
		return acctno7p.getValue();
	}

	/**
	 * Setter for acctno7p attribute.
	 * @param acctno7p the new value of acctno7p
	 */
	public void setAcctno7p(String acctno7p) {
		this.acctno7p.setValue(acctno7p);
	}
	/**
	 * Gets the reference for attribute acctno7h.
	 * @return the acctno7h attribute reference
	 */
	public ElementaryRangeReference getAcctno7hReference() {
		return acctno7h.getReference();
	}

	/**
	 * Getter for acctno7h attribute.
	 * @return acctno7h attribute
	 */
	public String getAcctno7h() {
		return acctno7h.getValue();
	}

	/**
	 * Setter for acctno7h attribute.
	 * @param acctno7h the new value of acctno7h
	 */
	public void setAcctno7h(String acctno7h) {
		this.acctno7h.setValue(acctno7h);
	}
	/**
	 * Gets the reference for attribute acctno7v.
	 * @return the acctno7v attribute reference
	 */
	public ElementaryRangeReference getAcctno7vReference() {
		return acctno7v.getReference();
	}

	/**
	 * Getter for acctno7v attribute.
	 * @return acctno7v attribute
	 */
	public String getAcctno7v() {
		return acctno7v.getValue();
	}

	/**
	 * Setter for acctno7v attribute.
	 * @param acctno7v the new value of acctno7v
	 */
	public void setAcctno7v(String acctno7v) {
		this.acctno7v.setValue(acctno7v);
	}
	/**
	 * Gets the reference for attribute acctno7o.
	 * @return the acctno7o attribute reference
	 */
	public ElementaryRangeReference getAcctno7oReference() {
		return acctno7o.getReference();
	}

	/**
	 * Getter for acctno7o attribute.
	 * @return acctno7o attribute
	 */
	public String getAcctno7o() {
		return acctno7o.getValue();
	}

	/**
	 * Setter for acctno7o attribute.
	 * @param acctno7o the new value of acctno7o
	 */
	public void setAcctno7o(String acctno7o) {
		this.acctno7o.setValue(acctno7o);
	}
	/**
	 * Gets the reference for attribute crdnum7c.
	 * @return the crdnum7c attribute reference
	 */
	public ElementaryRangeReference getCrdnum7cReference() {
		return crdnum7c.getReference();
	}

	/**
	 * Getter for crdnum7c attribute.
	 * @return crdnum7c attribute
	 */
	public String getCrdnum7c() {
		return crdnum7c.getValue();
	}

	/**
	 * Setter for crdnum7c attribute.
	 * @param crdnum7c the new value of crdnum7c
	 */
	public void setCrdnum7c(String crdnum7c) {
		this.crdnum7c.setValue(crdnum7c);
	}
	/**
	 * Gets the reference for attribute crdnum7p.
	 * @return the crdnum7p attribute reference
	 */
	public ElementaryRangeReference getCrdnum7pReference() {
		return crdnum7p.getReference();
	}

	/**
	 * Getter for crdnum7p attribute.
	 * @return crdnum7p attribute
	 */
	public String getCrdnum7p() {
		return crdnum7p.getValue();
	}

	/**
	 * Setter for crdnum7p attribute.
	 * @param crdnum7p the new value of crdnum7p
	 */
	public void setCrdnum7p(String crdnum7p) {
		this.crdnum7p.setValue(crdnum7p);
	}
	/**
	 * Gets the reference for attribute crdnum7h.
	 * @return the crdnum7h attribute reference
	 */
	public ElementaryRangeReference getCrdnum7hReference() {
		return crdnum7h.getReference();
	}

	/**
	 * Getter for crdnum7h attribute.
	 * @return crdnum7h attribute
	 */
	public String getCrdnum7h() {
		return crdnum7h.getValue();
	}

	/**
	 * Setter for crdnum7h attribute.
	 * @param crdnum7h the new value of crdnum7h
	 */
	public void setCrdnum7h(String crdnum7h) {
		this.crdnum7h.setValue(crdnum7h);
	}
	/**
	 * Gets the reference for attribute crdnum7v.
	 * @return the crdnum7v attribute reference
	 */
	public ElementaryRangeReference getCrdnum7vReference() {
		return crdnum7v.getReference();
	}

	/**
	 * Getter for crdnum7v attribute.
	 * @return crdnum7v attribute
	 */
	public String getCrdnum7v() {
		return crdnum7v.getValue();
	}

	/**
	 * Setter for crdnum7v attribute.
	 * @param crdnum7v the new value of crdnum7v
	 */
	public void setCrdnum7v(String crdnum7v) {
		this.crdnum7v.setValue(crdnum7v);
	}
	/**
	 * Gets the reference for attribute crdnum7o.
	 * @return the crdnum7o attribute reference
	 */
	public ElementaryRangeReference getCrdnum7oReference() {
		return crdnum7o.getReference();
	}

	/**
	 * Getter for crdnum7o attribute.
	 * @return crdnum7o attribute
	 */
	public String getCrdnum7o() {
		return crdnum7o.getValue();
	}

	/**
	 * Setter for crdnum7o attribute.
	 * @param crdnum7o the new value of crdnum7o
	 */
	public void setCrdnum7o(String crdnum7o) {
		this.crdnum7o.setValue(crdnum7o);
	}
	/**
	 * Gets the reference for attribute crdsts7c.
	 * @return the crdsts7c attribute reference
	 */
	public ElementaryRangeReference getCrdsts7cReference() {
		return crdsts7c.getReference();
	}

	/**
	 * Getter for crdsts7c attribute.
	 * @return crdsts7c attribute
	 */
	public String getCrdsts7c() {
		return crdsts7c.getValue();
	}

	/**
	 * Setter for crdsts7c attribute.
	 * @param crdsts7c the new value of crdsts7c
	 */
	public void setCrdsts7c(String crdsts7c) {
		this.crdsts7c.setValue(crdsts7c);
	}
	/**
	 * Gets the reference for attribute crdsts7p.
	 * @return the crdsts7p attribute reference
	 */
	public ElementaryRangeReference getCrdsts7pReference() {
		return crdsts7p.getReference();
	}

	/**
	 * Getter for crdsts7p attribute.
	 * @return crdsts7p attribute
	 */
	public String getCrdsts7p() {
		return crdsts7p.getValue();
	}

	/**
	 * Setter for crdsts7p attribute.
	 * @param crdsts7p the new value of crdsts7p
	 */
	public void setCrdsts7p(String crdsts7p) {
		this.crdsts7p.setValue(crdsts7p);
	}
	/**
	 * Gets the reference for attribute crdsts7h.
	 * @return the crdsts7h attribute reference
	 */
	public ElementaryRangeReference getCrdsts7hReference() {
		return crdsts7h.getReference();
	}

	/**
	 * Getter for crdsts7h attribute.
	 * @return crdsts7h attribute
	 */
	public String getCrdsts7h() {
		return crdsts7h.getValue();
	}

	/**
	 * Setter for crdsts7h attribute.
	 * @param crdsts7h the new value of crdsts7h
	 */
	public void setCrdsts7h(String crdsts7h) {
		this.crdsts7h.setValue(crdsts7h);
	}
	/**
	 * Gets the reference for attribute crdsts7v.
	 * @return the crdsts7v attribute reference
	 */
	public ElementaryRangeReference getCrdsts7vReference() {
		return crdsts7v.getReference();
	}

	/**
	 * Getter for crdsts7v attribute.
	 * @return crdsts7v attribute
	 */
	public String getCrdsts7v() {
		return crdsts7v.getValue();
	}

	/**
	 * Setter for crdsts7v attribute.
	 * @param crdsts7v the new value of crdsts7v
	 */
	public void setCrdsts7v(String crdsts7v) {
		this.crdsts7v.setValue(crdsts7v);
	}
	/**
	 * Gets the reference for attribute crdsts7o.
	 * @return the crdsts7o attribute reference
	 */
	public ElementaryRangeReference getCrdsts7oReference() {
		return crdsts7o.getReference();
	}

	/**
	 * Getter for crdsts7o attribute.
	 * @return crdsts7o attribute
	 */
	public String getCrdsts7o() {
		return crdsts7o.getValue();
	}

	/**
	 * Setter for crdsts7o attribute.
	 * @param crdsts7o the new value of crdsts7o
	 */
	public void setCrdsts7o(String crdsts7o) {
		this.crdsts7o.setValue(crdsts7o);
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
