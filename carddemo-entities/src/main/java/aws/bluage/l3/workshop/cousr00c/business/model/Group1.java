package aws.bluage.l3.workshop.cousr00c.business.model;

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
 * <p>About 'cousr0ai' field, <br>uml entity: aws.bluage.l3.workshop.cousr00c.business.model.Cousr0ai
 * <br></p>
 * 
 * <p>About 'cousr0ao' field, <br>uml entity: aws.bluage.l3.workshop.cousr00c.business.model.Cousr0ao
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
	private final Group cousr0ai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cousr0ai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(cousr0ai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(cousr0ai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(cousr0ai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(cousr0ai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(cousr0ai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(cousr0ai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(cousr0ai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(cousr0ai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(cousr0ai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary pagenuml = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(cousr0ai);
	private final Elementary pagenumf = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary pagenuma = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary pagenumi = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary usridinl = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(cousr0ai);
	private final Elementary usridinf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary usridina = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usridini = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary sel0001l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(cousr0ai);
	private final Elementary sel0001f = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary sel0001a = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0001i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid01l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(cousr0ai);
	private final Elementary usrid01f = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary usrid01a = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid01i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname01l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(cousr0ai);
	private final Elementary fname01f = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary fname01a = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname01i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname01l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(cousr0ai);
	private final Elementary lname01f = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary lname01a = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname01i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype01l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union13 = new Union(cousr0ai);
	private final Elementary utype01f = new Elementary(union13,new AlphanumericType(1));
	private final Group group12 = new Group(union13);
	private final Elementary utype01a = new Elementary(group12,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype01i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary sel0002l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union14 = new Union(cousr0ai);
	private final Elementary sel0002f = new Elementary(union14,new AlphanumericType(1));
	private final Group group13 = new Group(union14);
	private final Elementary sel0002a = new Elementary(group13,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0002i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid02l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union15 = new Union(cousr0ai);
	private final Elementary usrid02f = new Elementary(union15,new AlphanumericType(1));
	private final Group group14 = new Group(union15);
	private final Elementary usrid02a = new Elementary(group14,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid02i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname02l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union16 = new Union(cousr0ai);
	private final Elementary fname02f = new Elementary(union16,new AlphanumericType(1));
	private final Group group15 = new Group(union16);
	private final Elementary fname02a = new Elementary(group15,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname02i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname02l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union17 = new Union(cousr0ai);
	private final Elementary lname02f = new Elementary(union17,new AlphanumericType(1));
	private final Group group16 = new Group(union17);
	private final Elementary lname02a = new Elementary(group16,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname02i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype02l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union18 = new Union(cousr0ai);
	private final Elementary utype02f = new Elementary(union18,new AlphanumericType(1));
	private final Group group17 = new Group(union18);
	private final Elementary utype02a = new Elementary(group17,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype02i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary sel0003l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union19 = new Union(cousr0ai);
	private final Elementary sel0003f = new Elementary(union19,new AlphanumericType(1));
	private final Group group18 = new Group(union19);
	private final Elementary sel0003a = new Elementary(group18,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0003i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid03l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union20 = new Union(cousr0ai);
	private final Elementary usrid03f = new Elementary(union20,new AlphanumericType(1));
	private final Group group19 = new Group(union20);
	private final Elementary usrid03a = new Elementary(group19,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid03i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname03l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union21 = new Union(cousr0ai);
	private final Elementary fname03f = new Elementary(union21,new AlphanumericType(1));
	private final Group group20 = new Group(union21);
	private final Elementary fname03a = new Elementary(group20,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname03i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname03l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union22 = new Union(cousr0ai);
	private final Elementary lname03f = new Elementary(union22,new AlphanumericType(1));
	private final Group group21 = new Group(union22);
	private final Elementary lname03a = new Elementary(group21,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname03i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype03l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union23 = new Union(cousr0ai);
	private final Elementary utype03f = new Elementary(union23,new AlphanumericType(1));
	private final Group group22 = new Group(union23);
	private final Elementary utype03a = new Elementary(group22,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype03i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary sel0004l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union24 = new Union(cousr0ai);
	private final Elementary sel0004f = new Elementary(union24,new AlphanumericType(1));
	private final Group group23 = new Group(union24);
	private final Elementary sel0004a = new Elementary(group23,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0004i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid04l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union25 = new Union(cousr0ai);
	private final Elementary usrid04f = new Elementary(union25,new AlphanumericType(1));
	private final Group group24 = new Group(union25);
	private final Elementary usrid04a = new Elementary(group24,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid04i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname04l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union26 = new Union(cousr0ai);
	private final Elementary fname04f = new Elementary(union26,new AlphanumericType(1));
	private final Group group25 = new Group(union26);
	private final Elementary fname04a = new Elementary(group25,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname04i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname04l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union27 = new Union(cousr0ai);
	private final Elementary lname04f = new Elementary(union27,new AlphanumericType(1));
	private final Group group26 = new Group(union27);
	private final Elementary lname04a = new Elementary(group26,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname04i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype04l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union28 = new Union(cousr0ai);
	private final Elementary utype04f = new Elementary(union28,new AlphanumericType(1));
	private final Group group27 = new Group(union28);
	private final Elementary utype04a = new Elementary(group27,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype04i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary sel0005l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union29 = new Union(cousr0ai);
	private final Elementary sel0005f = new Elementary(union29,new AlphanumericType(1));
	private final Group group28 = new Group(union29);
	private final Elementary sel0005a = new Elementary(group28,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0005i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid05l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union30 = new Union(cousr0ai);
	private final Elementary usrid05f = new Elementary(union30,new AlphanumericType(1));
	private final Group group29 = new Group(union30);
	private final Elementary usrid05a = new Elementary(group29,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid05i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname05l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union31 = new Union(cousr0ai);
	private final Elementary fname05f = new Elementary(union31,new AlphanumericType(1));
	private final Group group30 = new Group(union31);
	private final Elementary fname05a = new Elementary(group30,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname05i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname05l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union32 = new Union(cousr0ai);
	private final Elementary lname05f = new Elementary(union32,new AlphanumericType(1));
	private final Group group31 = new Group(union32);
	private final Elementary lname05a = new Elementary(group31,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname05i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype05l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union33 = new Union(cousr0ai);
	private final Elementary utype05f = new Elementary(union33,new AlphanumericType(1));
	private final Group group32 = new Group(union33);
	private final Elementary utype05a = new Elementary(group32,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler33 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype05i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary sel0006l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union34 = new Union(cousr0ai);
	private final Elementary sel0006f = new Elementary(union34,new AlphanumericType(1));
	private final Group group33 = new Group(union34);
	private final Elementary sel0006a = new Elementary(group33,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler34 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0006i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid06l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union35 = new Union(cousr0ai);
	private final Elementary usrid06f = new Elementary(union35,new AlphanumericType(1));
	private final Group group34 = new Group(union35);
	private final Elementary usrid06a = new Elementary(group34,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler35 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid06i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname06l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union36 = new Union(cousr0ai);
	private final Elementary fname06f = new Elementary(union36,new AlphanumericType(1));
	private final Group group35 = new Group(union36);
	private final Elementary fname06a = new Elementary(group35,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler36 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname06i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname06l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union37 = new Union(cousr0ai);
	private final Elementary lname06f = new Elementary(union37,new AlphanumericType(1));
	private final Group group36 = new Group(union37);
	private final Elementary lname06a = new Elementary(group36,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler37 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname06i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype06l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union38 = new Union(cousr0ai);
	private final Elementary utype06f = new Elementary(union38,new AlphanumericType(1));
	private final Group group37 = new Group(union38);
	private final Elementary utype06a = new Elementary(group37,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler38 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype06i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary sel0007l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union39 = new Union(cousr0ai);
	private final Elementary sel0007f = new Elementary(union39,new AlphanumericType(1));
	private final Group group38 = new Group(union39);
	private final Elementary sel0007a = new Elementary(group38,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler39 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0007i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid07l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union40 = new Union(cousr0ai);
	private final Elementary usrid07f = new Elementary(union40,new AlphanumericType(1));
	private final Group group39 = new Group(union40);
	private final Elementary usrid07a = new Elementary(group39,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler40 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid07i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname07l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union41 = new Union(cousr0ai);
	private final Elementary fname07f = new Elementary(union41,new AlphanumericType(1));
	private final Group group40 = new Group(union41);
	private final Elementary fname07a = new Elementary(group40,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler41 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname07i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname07l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union42 = new Union(cousr0ai);
	private final Elementary lname07f = new Elementary(union42,new AlphanumericType(1));
	private final Group group41 = new Group(union42);
	private final Elementary lname07a = new Elementary(group41,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler42 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname07i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype07l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union43 = new Union(cousr0ai);
	private final Elementary utype07f = new Elementary(union43,new AlphanumericType(1));
	private final Group group42 = new Group(union43);
	private final Elementary utype07a = new Elementary(group42,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler43 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype07i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary sel0008l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union44 = new Union(cousr0ai);
	private final Elementary sel0008f = new Elementary(union44,new AlphanumericType(1));
	private final Group group43 = new Group(union44);
	private final Elementary sel0008a = new Elementary(group43,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler44 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0008i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid08l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union45 = new Union(cousr0ai);
	private final Elementary usrid08f = new Elementary(union45,new AlphanumericType(1));
	private final Group group44 = new Group(union45);
	private final Elementary usrid08a = new Elementary(group44,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler45 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid08i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname08l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union46 = new Union(cousr0ai);
	private final Elementary fname08f = new Elementary(union46,new AlphanumericType(1));
	private final Group group45 = new Group(union46);
	private final Elementary fname08a = new Elementary(group45,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler46 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname08i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname08l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union47 = new Union(cousr0ai);
	private final Elementary lname08f = new Elementary(union47,new AlphanumericType(1));
	private final Group group46 = new Group(union47);
	private final Elementary lname08a = new Elementary(group46,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler47 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname08i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype08l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union48 = new Union(cousr0ai);
	private final Elementary utype08f = new Elementary(union48,new AlphanumericType(1));
	private final Group group47 = new Group(union48);
	private final Elementary utype08a = new Elementary(group47,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler48 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype08i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary sel0009l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union49 = new Union(cousr0ai);
	private final Elementary sel0009f = new Elementary(union49,new AlphanumericType(1));
	private final Group group48 = new Group(union49);
	private final Elementary sel0009a = new Elementary(group48,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler49 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0009i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid09l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union50 = new Union(cousr0ai);
	private final Elementary usrid09f = new Elementary(union50,new AlphanumericType(1));
	private final Group group49 = new Group(union50);
	private final Elementary usrid09a = new Elementary(group49,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler50 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid09i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname09l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union51 = new Union(cousr0ai);
	private final Elementary fname09f = new Elementary(union51,new AlphanumericType(1));
	private final Group group50 = new Group(union51);
	private final Elementary fname09a = new Elementary(group50,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler51 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname09i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname09l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union52 = new Union(cousr0ai);
	private final Elementary lname09f = new Elementary(union52,new AlphanumericType(1));
	private final Group group51 = new Group(union52);
	private final Elementary lname09a = new Elementary(group51,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler52 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname09i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype09l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union53 = new Union(cousr0ai);
	private final Elementary utype09f = new Elementary(union53,new AlphanumericType(1));
	private final Group group52 = new Group(union53);
	private final Elementary utype09a = new Elementary(group52,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler53 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype09i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary sel0010l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union54 = new Union(cousr0ai);
	private final Elementary sel0010f = new Elementary(union54,new AlphanumericType(1));
	private final Group group53 = new Group(union54);
	private final Elementary sel0010a = new Elementary(group53,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler54 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary sel0010i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary usrid10l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union55 = new Union(cousr0ai);
	private final Elementary usrid10f = new Elementary(union55,new AlphanumericType(1));
	private final Group group54 = new Group(union55);
	private final Elementary usrid10a = new Elementary(group54,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler55 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary usrid10i = new Elementary(cousr0ai,new AlphanumericType(8));
	private final Elementary fname10l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union56 = new Union(cousr0ai);
	private final Elementary fname10f = new Elementary(union56,new AlphanumericType(1));
	private final Group group55 = new Group(union56);
	private final Elementary fname10a = new Elementary(group55,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler56 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary fname10i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary lname10l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union57 = new Union(cousr0ai);
	private final Elementary lname10f = new Elementary(union57,new AlphanumericType(1));
	private final Group group56 = new Group(union57);
	private final Elementary lname10a = new Elementary(group56,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler57 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary lname10i = new Elementary(cousr0ai,new AlphanumericType(20));
	private final Elementary utype10l = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union58 = new Union(cousr0ai);
	private final Elementary utype10f = new Elementary(union58,new AlphanumericType(1));
	private final Group group57 = new Group(union58);
	private final Elementary utype10a = new Elementary(group57,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler58 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary utype10i = new Elementary(cousr0ai,new AlphanumericType(1));
	private final Elementary errmsgl = new Elementary(cousr0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union59 = new Union(cousr0ai);
	private final Elementary errmsgf = new Elementary(union59,new AlphanumericType(1));
	private final Group group58 = new Group(union59);
	private final Elementary errmsga = new Elementary(group58,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler59 = new Filler(cousr0ai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(cousr0ai,new AlphanumericType(78));
	private final Group cousr0ao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler60 = new Filler(cousr0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler61 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(cousr0ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler62 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(cousr0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler63 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler64 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler65 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(cousr0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler66 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler67 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary pagenumc = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary pagenump = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary pagenumh = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary pagenumv = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary pagenumo = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler68 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usridinc = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usridinp = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usridinh = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usridinv = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usridino = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler69 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0001c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0001p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0001h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0001v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0001o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler70 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid01c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid01p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid01h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid01v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid01o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler71 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname01c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname01p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname01h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname01v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname01o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler72 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname01c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname01p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname01h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname01v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname01o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler73 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype01c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype01p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype01h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype01v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype01o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler74 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0002c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0002p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0002h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0002v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0002o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler75 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid02c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid02p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid02h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid02v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid02o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler76 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname02c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname02p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname02h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname02v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname02o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler77 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname02c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname02p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname02h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname02v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname02o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler78 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype02c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype02p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype02h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype02v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype02o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler79 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0003c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0003p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0003h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0003v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0003o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler80 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid03c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid03p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid03h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid03v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid03o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler81 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname03c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname03p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname03h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname03v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname03o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler82 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname03c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname03p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname03h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname03v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname03o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler83 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype03c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype03p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype03h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype03v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype03o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler84 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0004c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0004p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0004h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0004v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0004o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler85 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid04c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid04p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid04h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid04v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid04o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler86 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname04c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname04p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname04h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname04v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname04o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler87 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname04c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname04p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname04h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname04v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname04o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler88 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype04c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype04p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype04h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype04v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype04o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler89 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0005c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0005p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0005h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0005v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0005o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler90 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid05c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid05p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid05h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid05v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid05o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler91 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname05c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname05p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname05h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname05v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname05o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler92 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname05c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname05p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname05h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname05v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname05o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler93 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype05c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype05p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype05h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype05v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype05o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler94 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0006c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0006p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0006h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0006v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0006o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler95 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid06c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid06p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid06h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid06v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid06o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler96 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname06c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname06p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname06h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname06v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname06o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler97 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname06c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname06p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname06h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname06v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname06o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler98 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype06c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype06p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype06h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype06v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype06o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler99 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0007c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0007p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0007h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0007v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0007o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler100 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid07c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid07p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid07h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid07v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid07o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler101 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname07c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname07p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname07h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname07v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname07o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler102 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname07c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname07p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname07h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname07v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname07o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler103 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype07c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype07p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype07h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype07v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype07o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler104 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0008c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0008p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0008h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0008v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0008o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler105 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid08c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid08p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid08h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid08v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid08o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler106 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname08c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname08p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname08h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname08v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname08o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler107 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname08c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname08p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname08h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname08v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname08o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler108 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype08c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype08p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype08h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype08v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype08o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler109 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0009c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0009p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0009h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0009v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0009o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler110 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid09c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid09p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid09h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid09v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid09o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler111 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname09c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname09p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname09h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname09v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname09o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler112 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname09c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname09p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname09h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname09v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname09o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler113 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype09c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype09p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype09h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype09v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype09o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler114 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary sel0010c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0010p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0010h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0010v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary sel0010o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler115 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary usrid10c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid10p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid10h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid10v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary usrid10o = new Elementary(cousr0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler116 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary fname10c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname10p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname10h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname10v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary fname10o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler117 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary lname10c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname10p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname10h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname10v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary lname10o = new Elementary(cousr0ao,new AlphanumericType(20));
	@SuppressWarnings("unused")
	private final Filler filler118 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary utype10c = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype10p = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype10h = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype10v = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary utype10o = new Elementary(cousr0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler119 = new Filler(cousr0ao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(cousr0ao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(cousr0ao,new AlphanumericType(78));
	

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
	 * Gets the reference for attribute cousr0ai.
	 * @return the cousr0ai attribute reference
	 */
	public RangeReference getCousr0aiReference() {
		return cousr0ai.getReference();
	}	
				
	/**
	 * Setter for cousr0ai .
	 */
   	public void setCousr0ai(RangeReference reference) {
       	cousr0ai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute pagenuml.
	 * @return the pagenuml attribute reference
	 */
	public ElementaryRangeReference getPagenumlReference() {
		return pagenuml.getReference();
	}

	/**
	 * Getter for pagenuml attribute.
	 * @return pagenuml attribute
	 */
	public int getPagenuml() {
		return pagenuml.getValue();
	}

	/**
	 * Setter for pagenuml attribute.
	 * @param pagenuml the new value of pagenuml
	 */
	public void setPagenuml(int pagenuml) {
		this.pagenuml.setValue(pagenuml);
	}
	/**
	 * Gets the reference for attribute pagenumf.
	 * @return the pagenumf attribute reference
	 */
	public ElementaryRangeReference getPagenumfReference() {
		return pagenumf.getReference();
	}

	/**
	 * Getter for pagenumf attribute.
	 * @return pagenumf attribute
	 */
	public String getPagenumf() {
		return pagenumf.getValue();
	}

	/**
	 * Setter for pagenumf attribute.
	 * @param pagenumf the new value of pagenumf
	 */
	public void setPagenumf(String pagenumf) {
		this.pagenumf.setValue(pagenumf);
	}
	/**
	 * Gets the reference for attribute pagenuma.
	 * @return the pagenuma attribute reference
	 */
	public ElementaryRangeReference getPagenumaReference() {
		return pagenuma.getReference();
	}

	/**
	 * Getter for pagenuma attribute.
	 * @return pagenuma attribute
	 */
	public String getPagenuma() {
		return pagenuma.getValue();
	}

	/**
	 * Setter for pagenuma attribute.
	 * @param pagenuma the new value of pagenuma
	 */
	public void setPagenuma(String pagenuma) {
		this.pagenuma.setValue(pagenuma);
	}
	/**
	 * Gets the reference for attribute pagenumi.
	 * @return the pagenumi attribute reference
	 */
	public ElementaryRangeReference getPagenumiReference() {
		return pagenumi.getReference();
	}

	/**
	 * Getter for pagenumi attribute.
	 * @return pagenumi attribute
	 */
	public String getPagenumi() {
		return pagenumi.getValue();
	}

	/**
	 * Setter for pagenumi attribute.
	 * @param pagenumi the new value of pagenumi
	 */
	public void setPagenumi(String pagenumi) {
		this.pagenumi.setValue(pagenumi);
	}
	/**
	 * Gets the reference for attribute usridinl.
	 * @return the usridinl attribute reference
	 */
	public ElementaryRangeReference getUsridinlReference() {
		return usridinl.getReference();
	}

	/**
	 * Getter for usridinl attribute.
	 * @return usridinl attribute
	 */
	public int getUsridinl() {
		return usridinl.getValue();
	}

	/**
	 * Setter for usridinl attribute.
	 * @param usridinl the new value of usridinl
	 */
	public void setUsridinl(int usridinl) {
		this.usridinl.setValue(usridinl);
	}
	/**
	 * Gets the reference for attribute usridinf.
	 * @return the usridinf attribute reference
	 */
	public ElementaryRangeReference getUsridinfReference() {
		return usridinf.getReference();
	}

	/**
	 * Getter for usridinf attribute.
	 * @return usridinf attribute
	 */
	public String getUsridinf() {
		return usridinf.getValue();
	}

	/**
	 * Setter for usridinf attribute.
	 * @param usridinf the new value of usridinf
	 */
	public void setUsridinf(String usridinf) {
		this.usridinf.setValue(usridinf);
	}
	/**
	 * Gets the reference for attribute usridina.
	 * @return the usridina attribute reference
	 */
	public ElementaryRangeReference getUsridinaReference() {
		return usridina.getReference();
	}

	/**
	 * Getter for usridina attribute.
	 * @return usridina attribute
	 */
	public String getUsridina() {
		return usridina.getValue();
	}

	/**
	 * Setter for usridina attribute.
	 * @param usridina the new value of usridina
	 */
	public void setUsridina(String usridina) {
		this.usridina.setValue(usridina);
	}
	/**
	 * Gets the reference for attribute usridini.
	 * @return the usridini attribute reference
	 */
	public ElementaryRangeReference getUsridiniReference() {
		return usridini.getReference();
	}

	/**
	 * Getter for usridini attribute.
	 * @return usridini attribute
	 */
	public String getUsridini() {
		return usridini.getValue();
	}

	/**
	 * Setter for usridini attribute.
	 * @param usridini the new value of usridini
	 */
	public void setUsridini(String usridini) {
		this.usridini.setValue(usridini);
	}
	/**
	 * Gets the reference for attribute sel0001l.
	 * @return the sel0001l attribute reference
	 */
	public ElementaryRangeReference getSel0001lReference() {
		return sel0001l.getReference();
	}

	/**
	 * Getter for sel0001l attribute.
	 * @return sel0001l attribute
	 */
	public int getSel0001l() {
		return sel0001l.getValue();
	}

	/**
	 * Setter for sel0001l attribute.
	 * @param sel0001l the new value of sel0001l
	 */
	public void setSel0001l(int sel0001l) {
		this.sel0001l.setValue(sel0001l);
	}
	/**
	 * Gets the reference for attribute sel0001f.
	 * @return the sel0001f attribute reference
	 */
	public ElementaryRangeReference getSel0001fReference() {
		return sel0001f.getReference();
	}

	/**
	 * Getter for sel0001f attribute.
	 * @return sel0001f attribute
	 */
	public String getSel0001f() {
		return sel0001f.getValue();
	}

	/**
	 * Setter for sel0001f attribute.
	 * @param sel0001f the new value of sel0001f
	 */
	public void setSel0001f(String sel0001f) {
		this.sel0001f.setValue(sel0001f);
	}
	/**
	 * Gets the reference for attribute sel0001a.
	 * @return the sel0001a attribute reference
	 */
	public ElementaryRangeReference getSel0001aReference() {
		return sel0001a.getReference();
	}

	/**
	 * Getter for sel0001a attribute.
	 * @return sel0001a attribute
	 */
	public String getSel0001a() {
		return sel0001a.getValue();
	}

	/**
	 * Setter for sel0001a attribute.
	 * @param sel0001a the new value of sel0001a
	 */
	public void setSel0001a(String sel0001a) {
		this.sel0001a.setValue(sel0001a);
	}
	/**
	 * Gets the reference for attribute sel0001i.
	 * @return the sel0001i attribute reference
	 */
	public ElementaryRangeReference getSel0001iReference() {
		return sel0001i.getReference();
	}

	/**
	 * Getter for sel0001i attribute.
	 * @return sel0001i attribute
	 */
	public String getSel0001i() {
		return sel0001i.getValue();
	}

	/**
	 * Setter for sel0001i attribute.
	 * @param sel0001i the new value of sel0001i
	 */
	public void setSel0001i(String sel0001i) {
		this.sel0001i.setValue(sel0001i);
	}
	/**
	 * Gets the reference for attribute usrid01l.
	 * @return the usrid01l attribute reference
	 */
	public ElementaryRangeReference getUsrid01lReference() {
		return usrid01l.getReference();
	}

	/**
	 * Getter for usrid01l attribute.
	 * @return usrid01l attribute
	 */
	public int getUsrid01l() {
		return usrid01l.getValue();
	}

	/**
	 * Setter for usrid01l attribute.
	 * @param usrid01l the new value of usrid01l
	 */
	public void setUsrid01l(int usrid01l) {
		this.usrid01l.setValue(usrid01l);
	}
	/**
	 * Gets the reference for attribute usrid01f.
	 * @return the usrid01f attribute reference
	 */
	public ElementaryRangeReference getUsrid01fReference() {
		return usrid01f.getReference();
	}

	/**
	 * Getter for usrid01f attribute.
	 * @return usrid01f attribute
	 */
	public String getUsrid01f() {
		return usrid01f.getValue();
	}

	/**
	 * Setter for usrid01f attribute.
	 * @param usrid01f the new value of usrid01f
	 */
	public void setUsrid01f(String usrid01f) {
		this.usrid01f.setValue(usrid01f);
	}
	/**
	 * Gets the reference for attribute usrid01a.
	 * @return the usrid01a attribute reference
	 */
	public ElementaryRangeReference getUsrid01aReference() {
		return usrid01a.getReference();
	}

	/**
	 * Getter for usrid01a attribute.
	 * @return usrid01a attribute
	 */
	public String getUsrid01a() {
		return usrid01a.getValue();
	}

	/**
	 * Setter for usrid01a attribute.
	 * @param usrid01a the new value of usrid01a
	 */
	public void setUsrid01a(String usrid01a) {
		this.usrid01a.setValue(usrid01a);
	}
	/**
	 * Gets the reference for attribute usrid01i.
	 * @return the usrid01i attribute reference
	 */
	public ElementaryRangeReference getUsrid01iReference() {
		return usrid01i.getReference();
	}

	/**
	 * Getter for usrid01i attribute.
	 * @return usrid01i attribute
	 */
	public String getUsrid01i() {
		return usrid01i.getValue();
	}

	/**
	 * Setter for usrid01i attribute.
	 * @param usrid01i the new value of usrid01i
	 */
	public void setUsrid01i(String usrid01i) {
		this.usrid01i.setValue(usrid01i);
	}
	/**
	 * Gets the reference for attribute fname01l.
	 * @return the fname01l attribute reference
	 */
	public ElementaryRangeReference getFname01lReference() {
		return fname01l.getReference();
	}

	/**
	 * Getter for fname01l attribute.
	 * @return fname01l attribute
	 */
	public int getFname01l() {
		return fname01l.getValue();
	}

	/**
	 * Setter for fname01l attribute.
	 * @param fname01l the new value of fname01l
	 */
	public void setFname01l(int fname01l) {
		this.fname01l.setValue(fname01l);
	}
	/**
	 * Gets the reference for attribute fname01f.
	 * @return the fname01f attribute reference
	 */
	public ElementaryRangeReference getFname01fReference() {
		return fname01f.getReference();
	}

	/**
	 * Getter for fname01f attribute.
	 * @return fname01f attribute
	 */
	public String getFname01f() {
		return fname01f.getValue();
	}

	/**
	 * Setter for fname01f attribute.
	 * @param fname01f the new value of fname01f
	 */
	public void setFname01f(String fname01f) {
		this.fname01f.setValue(fname01f);
	}
	/**
	 * Gets the reference for attribute fname01a.
	 * @return the fname01a attribute reference
	 */
	public ElementaryRangeReference getFname01aReference() {
		return fname01a.getReference();
	}

	/**
	 * Getter for fname01a attribute.
	 * @return fname01a attribute
	 */
	public String getFname01a() {
		return fname01a.getValue();
	}

	/**
	 * Setter for fname01a attribute.
	 * @param fname01a the new value of fname01a
	 */
	public void setFname01a(String fname01a) {
		this.fname01a.setValue(fname01a);
	}
	/**
	 * Gets the reference for attribute fname01i.
	 * @return the fname01i attribute reference
	 */
	public ElementaryRangeReference getFname01iReference() {
		return fname01i.getReference();
	}

	/**
	 * Getter for fname01i attribute.
	 * @return fname01i attribute
	 */
	public String getFname01i() {
		return fname01i.getValue();
	}

	/**
	 * Setter for fname01i attribute.
	 * @param fname01i the new value of fname01i
	 */
	public void setFname01i(String fname01i) {
		this.fname01i.setValue(fname01i);
	}
	/**
	 * Gets the reference for attribute lname01l.
	 * @return the lname01l attribute reference
	 */
	public ElementaryRangeReference getLname01lReference() {
		return lname01l.getReference();
	}

	/**
	 * Getter for lname01l attribute.
	 * @return lname01l attribute
	 */
	public int getLname01l() {
		return lname01l.getValue();
	}

	/**
	 * Setter for lname01l attribute.
	 * @param lname01l the new value of lname01l
	 */
	public void setLname01l(int lname01l) {
		this.lname01l.setValue(lname01l);
	}
	/**
	 * Gets the reference for attribute lname01f.
	 * @return the lname01f attribute reference
	 */
	public ElementaryRangeReference getLname01fReference() {
		return lname01f.getReference();
	}

	/**
	 * Getter for lname01f attribute.
	 * @return lname01f attribute
	 */
	public String getLname01f() {
		return lname01f.getValue();
	}

	/**
	 * Setter for lname01f attribute.
	 * @param lname01f the new value of lname01f
	 */
	public void setLname01f(String lname01f) {
		this.lname01f.setValue(lname01f);
	}
	/**
	 * Gets the reference for attribute lname01a.
	 * @return the lname01a attribute reference
	 */
	public ElementaryRangeReference getLname01aReference() {
		return lname01a.getReference();
	}

	/**
	 * Getter for lname01a attribute.
	 * @return lname01a attribute
	 */
	public String getLname01a() {
		return lname01a.getValue();
	}

	/**
	 * Setter for lname01a attribute.
	 * @param lname01a the new value of lname01a
	 */
	public void setLname01a(String lname01a) {
		this.lname01a.setValue(lname01a);
	}
	/**
	 * Gets the reference for attribute lname01i.
	 * @return the lname01i attribute reference
	 */
	public ElementaryRangeReference getLname01iReference() {
		return lname01i.getReference();
	}

	/**
	 * Getter for lname01i attribute.
	 * @return lname01i attribute
	 */
	public String getLname01i() {
		return lname01i.getValue();
	}

	/**
	 * Setter for lname01i attribute.
	 * @param lname01i the new value of lname01i
	 */
	public void setLname01i(String lname01i) {
		this.lname01i.setValue(lname01i);
	}
	/**
	 * Gets the reference for attribute utype01l.
	 * @return the utype01l attribute reference
	 */
	public ElementaryRangeReference getUtype01lReference() {
		return utype01l.getReference();
	}

	/**
	 * Getter for utype01l attribute.
	 * @return utype01l attribute
	 */
	public int getUtype01l() {
		return utype01l.getValue();
	}

	/**
	 * Setter for utype01l attribute.
	 * @param utype01l the new value of utype01l
	 */
	public void setUtype01l(int utype01l) {
		this.utype01l.setValue(utype01l);
	}
	/**
	 * Gets the reference for attribute utype01f.
	 * @return the utype01f attribute reference
	 */
	public ElementaryRangeReference getUtype01fReference() {
		return utype01f.getReference();
	}

	/**
	 * Getter for utype01f attribute.
	 * @return utype01f attribute
	 */
	public String getUtype01f() {
		return utype01f.getValue();
	}

	/**
	 * Setter for utype01f attribute.
	 * @param utype01f the new value of utype01f
	 */
	public void setUtype01f(String utype01f) {
		this.utype01f.setValue(utype01f);
	}
	/**
	 * Gets the reference for attribute utype01a.
	 * @return the utype01a attribute reference
	 */
	public ElementaryRangeReference getUtype01aReference() {
		return utype01a.getReference();
	}

	/**
	 * Getter for utype01a attribute.
	 * @return utype01a attribute
	 */
	public String getUtype01a() {
		return utype01a.getValue();
	}

	/**
	 * Setter for utype01a attribute.
	 * @param utype01a the new value of utype01a
	 */
	public void setUtype01a(String utype01a) {
		this.utype01a.setValue(utype01a);
	}
	/**
	 * Gets the reference for attribute utype01i.
	 * @return the utype01i attribute reference
	 */
	public ElementaryRangeReference getUtype01iReference() {
		return utype01i.getReference();
	}

	/**
	 * Getter for utype01i attribute.
	 * @return utype01i attribute
	 */
	public String getUtype01i() {
		return utype01i.getValue();
	}

	/**
	 * Setter for utype01i attribute.
	 * @param utype01i the new value of utype01i
	 */
	public void setUtype01i(String utype01i) {
		this.utype01i.setValue(utype01i);
	}
	/**
	 * Gets the reference for attribute sel0002l.
	 * @return the sel0002l attribute reference
	 */
	public ElementaryRangeReference getSel0002lReference() {
		return sel0002l.getReference();
	}

	/**
	 * Getter for sel0002l attribute.
	 * @return sel0002l attribute
	 */
	public int getSel0002l() {
		return sel0002l.getValue();
	}

	/**
	 * Setter for sel0002l attribute.
	 * @param sel0002l the new value of sel0002l
	 */
	public void setSel0002l(int sel0002l) {
		this.sel0002l.setValue(sel0002l);
	}
	/**
	 * Gets the reference for attribute sel0002f.
	 * @return the sel0002f attribute reference
	 */
	public ElementaryRangeReference getSel0002fReference() {
		return sel0002f.getReference();
	}

	/**
	 * Getter for sel0002f attribute.
	 * @return sel0002f attribute
	 */
	public String getSel0002f() {
		return sel0002f.getValue();
	}

	/**
	 * Setter for sel0002f attribute.
	 * @param sel0002f the new value of sel0002f
	 */
	public void setSel0002f(String sel0002f) {
		this.sel0002f.setValue(sel0002f);
	}
	/**
	 * Gets the reference for attribute sel0002a.
	 * @return the sel0002a attribute reference
	 */
	public ElementaryRangeReference getSel0002aReference() {
		return sel0002a.getReference();
	}

	/**
	 * Getter for sel0002a attribute.
	 * @return sel0002a attribute
	 */
	public String getSel0002a() {
		return sel0002a.getValue();
	}

	/**
	 * Setter for sel0002a attribute.
	 * @param sel0002a the new value of sel0002a
	 */
	public void setSel0002a(String sel0002a) {
		this.sel0002a.setValue(sel0002a);
	}
	/**
	 * Gets the reference for attribute sel0002i.
	 * @return the sel0002i attribute reference
	 */
	public ElementaryRangeReference getSel0002iReference() {
		return sel0002i.getReference();
	}

	/**
	 * Getter for sel0002i attribute.
	 * @return sel0002i attribute
	 */
	public String getSel0002i() {
		return sel0002i.getValue();
	}

	/**
	 * Setter for sel0002i attribute.
	 * @param sel0002i the new value of sel0002i
	 */
	public void setSel0002i(String sel0002i) {
		this.sel0002i.setValue(sel0002i);
	}
	/**
	 * Gets the reference for attribute usrid02l.
	 * @return the usrid02l attribute reference
	 */
	public ElementaryRangeReference getUsrid02lReference() {
		return usrid02l.getReference();
	}

	/**
	 * Getter for usrid02l attribute.
	 * @return usrid02l attribute
	 */
	public int getUsrid02l() {
		return usrid02l.getValue();
	}

	/**
	 * Setter for usrid02l attribute.
	 * @param usrid02l the new value of usrid02l
	 */
	public void setUsrid02l(int usrid02l) {
		this.usrid02l.setValue(usrid02l);
	}
	/**
	 * Gets the reference for attribute usrid02f.
	 * @return the usrid02f attribute reference
	 */
	public ElementaryRangeReference getUsrid02fReference() {
		return usrid02f.getReference();
	}

	/**
	 * Getter for usrid02f attribute.
	 * @return usrid02f attribute
	 */
	public String getUsrid02f() {
		return usrid02f.getValue();
	}

	/**
	 * Setter for usrid02f attribute.
	 * @param usrid02f the new value of usrid02f
	 */
	public void setUsrid02f(String usrid02f) {
		this.usrid02f.setValue(usrid02f);
	}
	/**
	 * Gets the reference for attribute usrid02a.
	 * @return the usrid02a attribute reference
	 */
	public ElementaryRangeReference getUsrid02aReference() {
		return usrid02a.getReference();
	}

	/**
	 * Getter for usrid02a attribute.
	 * @return usrid02a attribute
	 */
	public String getUsrid02a() {
		return usrid02a.getValue();
	}

	/**
	 * Setter for usrid02a attribute.
	 * @param usrid02a the new value of usrid02a
	 */
	public void setUsrid02a(String usrid02a) {
		this.usrid02a.setValue(usrid02a);
	}
	/**
	 * Gets the reference for attribute usrid02i.
	 * @return the usrid02i attribute reference
	 */
	public ElementaryRangeReference getUsrid02iReference() {
		return usrid02i.getReference();
	}

	/**
	 * Getter for usrid02i attribute.
	 * @return usrid02i attribute
	 */
	public String getUsrid02i() {
		return usrid02i.getValue();
	}

	/**
	 * Setter for usrid02i attribute.
	 * @param usrid02i the new value of usrid02i
	 */
	public void setUsrid02i(String usrid02i) {
		this.usrid02i.setValue(usrid02i);
	}
	/**
	 * Gets the reference for attribute fname02l.
	 * @return the fname02l attribute reference
	 */
	public ElementaryRangeReference getFname02lReference() {
		return fname02l.getReference();
	}

	/**
	 * Getter for fname02l attribute.
	 * @return fname02l attribute
	 */
	public int getFname02l() {
		return fname02l.getValue();
	}

	/**
	 * Setter for fname02l attribute.
	 * @param fname02l the new value of fname02l
	 */
	public void setFname02l(int fname02l) {
		this.fname02l.setValue(fname02l);
	}
	/**
	 * Gets the reference for attribute fname02f.
	 * @return the fname02f attribute reference
	 */
	public ElementaryRangeReference getFname02fReference() {
		return fname02f.getReference();
	}

	/**
	 * Getter for fname02f attribute.
	 * @return fname02f attribute
	 */
	public String getFname02f() {
		return fname02f.getValue();
	}

	/**
	 * Setter for fname02f attribute.
	 * @param fname02f the new value of fname02f
	 */
	public void setFname02f(String fname02f) {
		this.fname02f.setValue(fname02f);
	}
	/**
	 * Gets the reference for attribute fname02a.
	 * @return the fname02a attribute reference
	 */
	public ElementaryRangeReference getFname02aReference() {
		return fname02a.getReference();
	}

	/**
	 * Getter for fname02a attribute.
	 * @return fname02a attribute
	 */
	public String getFname02a() {
		return fname02a.getValue();
	}

	/**
	 * Setter for fname02a attribute.
	 * @param fname02a the new value of fname02a
	 */
	public void setFname02a(String fname02a) {
		this.fname02a.setValue(fname02a);
	}
	/**
	 * Gets the reference for attribute fname02i.
	 * @return the fname02i attribute reference
	 */
	public ElementaryRangeReference getFname02iReference() {
		return fname02i.getReference();
	}

	/**
	 * Getter for fname02i attribute.
	 * @return fname02i attribute
	 */
	public String getFname02i() {
		return fname02i.getValue();
	}

	/**
	 * Setter for fname02i attribute.
	 * @param fname02i the new value of fname02i
	 */
	public void setFname02i(String fname02i) {
		this.fname02i.setValue(fname02i);
	}
	/**
	 * Gets the reference for attribute lname02l.
	 * @return the lname02l attribute reference
	 */
	public ElementaryRangeReference getLname02lReference() {
		return lname02l.getReference();
	}

	/**
	 * Getter for lname02l attribute.
	 * @return lname02l attribute
	 */
	public int getLname02l() {
		return lname02l.getValue();
	}

	/**
	 * Setter for lname02l attribute.
	 * @param lname02l the new value of lname02l
	 */
	public void setLname02l(int lname02l) {
		this.lname02l.setValue(lname02l);
	}
	/**
	 * Gets the reference for attribute lname02f.
	 * @return the lname02f attribute reference
	 */
	public ElementaryRangeReference getLname02fReference() {
		return lname02f.getReference();
	}

	/**
	 * Getter for lname02f attribute.
	 * @return lname02f attribute
	 */
	public String getLname02f() {
		return lname02f.getValue();
	}

	/**
	 * Setter for lname02f attribute.
	 * @param lname02f the new value of lname02f
	 */
	public void setLname02f(String lname02f) {
		this.lname02f.setValue(lname02f);
	}
	/**
	 * Gets the reference for attribute lname02a.
	 * @return the lname02a attribute reference
	 */
	public ElementaryRangeReference getLname02aReference() {
		return lname02a.getReference();
	}

	/**
	 * Getter for lname02a attribute.
	 * @return lname02a attribute
	 */
	public String getLname02a() {
		return lname02a.getValue();
	}

	/**
	 * Setter for lname02a attribute.
	 * @param lname02a the new value of lname02a
	 */
	public void setLname02a(String lname02a) {
		this.lname02a.setValue(lname02a);
	}
	/**
	 * Gets the reference for attribute lname02i.
	 * @return the lname02i attribute reference
	 */
	public ElementaryRangeReference getLname02iReference() {
		return lname02i.getReference();
	}

	/**
	 * Getter for lname02i attribute.
	 * @return lname02i attribute
	 */
	public String getLname02i() {
		return lname02i.getValue();
	}

	/**
	 * Setter for lname02i attribute.
	 * @param lname02i the new value of lname02i
	 */
	public void setLname02i(String lname02i) {
		this.lname02i.setValue(lname02i);
	}
	/**
	 * Gets the reference for attribute utype02l.
	 * @return the utype02l attribute reference
	 */
	public ElementaryRangeReference getUtype02lReference() {
		return utype02l.getReference();
	}

	/**
	 * Getter for utype02l attribute.
	 * @return utype02l attribute
	 */
	public int getUtype02l() {
		return utype02l.getValue();
	}

	/**
	 * Setter for utype02l attribute.
	 * @param utype02l the new value of utype02l
	 */
	public void setUtype02l(int utype02l) {
		this.utype02l.setValue(utype02l);
	}
	/**
	 * Gets the reference for attribute utype02f.
	 * @return the utype02f attribute reference
	 */
	public ElementaryRangeReference getUtype02fReference() {
		return utype02f.getReference();
	}

	/**
	 * Getter for utype02f attribute.
	 * @return utype02f attribute
	 */
	public String getUtype02f() {
		return utype02f.getValue();
	}

	/**
	 * Setter for utype02f attribute.
	 * @param utype02f the new value of utype02f
	 */
	public void setUtype02f(String utype02f) {
		this.utype02f.setValue(utype02f);
	}
	/**
	 * Gets the reference for attribute utype02a.
	 * @return the utype02a attribute reference
	 */
	public ElementaryRangeReference getUtype02aReference() {
		return utype02a.getReference();
	}

	/**
	 * Getter for utype02a attribute.
	 * @return utype02a attribute
	 */
	public String getUtype02a() {
		return utype02a.getValue();
	}

	/**
	 * Setter for utype02a attribute.
	 * @param utype02a the new value of utype02a
	 */
	public void setUtype02a(String utype02a) {
		this.utype02a.setValue(utype02a);
	}
	/**
	 * Gets the reference for attribute utype02i.
	 * @return the utype02i attribute reference
	 */
	public ElementaryRangeReference getUtype02iReference() {
		return utype02i.getReference();
	}

	/**
	 * Getter for utype02i attribute.
	 * @return utype02i attribute
	 */
	public String getUtype02i() {
		return utype02i.getValue();
	}

	/**
	 * Setter for utype02i attribute.
	 * @param utype02i the new value of utype02i
	 */
	public void setUtype02i(String utype02i) {
		this.utype02i.setValue(utype02i);
	}
	/**
	 * Gets the reference for attribute sel0003l.
	 * @return the sel0003l attribute reference
	 */
	public ElementaryRangeReference getSel0003lReference() {
		return sel0003l.getReference();
	}

	/**
	 * Getter for sel0003l attribute.
	 * @return sel0003l attribute
	 */
	public int getSel0003l() {
		return sel0003l.getValue();
	}

	/**
	 * Setter for sel0003l attribute.
	 * @param sel0003l the new value of sel0003l
	 */
	public void setSel0003l(int sel0003l) {
		this.sel0003l.setValue(sel0003l);
	}
	/**
	 * Gets the reference for attribute sel0003f.
	 * @return the sel0003f attribute reference
	 */
	public ElementaryRangeReference getSel0003fReference() {
		return sel0003f.getReference();
	}

	/**
	 * Getter for sel0003f attribute.
	 * @return sel0003f attribute
	 */
	public String getSel0003f() {
		return sel0003f.getValue();
	}

	/**
	 * Setter for sel0003f attribute.
	 * @param sel0003f the new value of sel0003f
	 */
	public void setSel0003f(String sel0003f) {
		this.sel0003f.setValue(sel0003f);
	}
	/**
	 * Gets the reference for attribute sel0003a.
	 * @return the sel0003a attribute reference
	 */
	public ElementaryRangeReference getSel0003aReference() {
		return sel0003a.getReference();
	}

	/**
	 * Getter for sel0003a attribute.
	 * @return sel0003a attribute
	 */
	public String getSel0003a() {
		return sel0003a.getValue();
	}

	/**
	 * Setter for sel0003a attribute.
	 * @param sel0003a the new value of sel0003a
	 */
	public void setSel0003a(String sel0003a) {
		this.sel0003a.setValue(sel0003a);
	}
	/**
	 * Gets the reference for attribute sel0003i.
	 * @return the sel0003i attribute reference
	 */
	public ElementaryRangeReference getSel0003iReference() {
		return sel0003i.getReference();
	}

	/**
	 * Getter for sel0003i attribute.
	 * @return sel0003i attribute
	 */
	public String getSel0003i() {
		return sel0003i.getValue();
	}

	/**
	 * Setter for sel0003i attribute.
	 * @param sel0003i the new value of sel0003i
	 */
	public void setSel0003i(String sel0003i) {
		this.sel0003i.setValue(sel0003i);
	}
	/**
	 * Gets the reference for attribute usrid03l.
	 * @return the usrid03l attribute reference
	 */
	public ElementaryRangeReference getUsrid03lReference() {
		return usrid03l.getReference();
	}

	/**
	 * Getter for usrid03l attribute.
	 * @return usrid03l attribute
	 */
	public int getUsrid03l() {
		return usrid03l.getValue();
	}

	/**
	 * Setter for usrid03l attribute.
	 * @param usrid03l the new value of usrid03l
	 */
	public void setUsrid03l(int usrid03l) {
		this.usrid03l.setValue(usrid03l);
	}
	/**
	 * Gets the reference for attribute usrid03f.
	 * @return the usrid03f attribute reference
	 */
	public ElementaryRangeReference getUsrid03fReference() {
		return usrid03f.getReference();
	}

	/**
	 * Getter for usrid03f attribute.
	 * @return usrid03f attribute
	 */
	public String getUsrid03f() {
		return usrid03f.getValue();
	}

	/**
	 * Setter for usrid03f attribute.
	 * @param usrid03f the new value of usrid03f
	 */
	public void setUsrid03f(String usrid03f) {
		this.usrid03f.setValue(usrid03f);
	}
	/**
	 * Gets the reference for attribute usrid03a.
	 * @return the usrid03a attribute reference
	 */
	public ElementaryRangeReference getUsrid03aReference() {
		return usrid03a.getReference();
	}

	/**
	 * Getter for usrid03a attribute.
	 * @return usrid03a attribute
	 */
	public String getUsrid03a() {
		return usrid03a.getValue();
	}

	/**
	 * Setter for usrid03a attribute.
	 * @param usrid03a the new value of usrid03a
	 */
	public void setUsrid03a(String usrid03a) {
		this.usrid03a.setValue(usrid03a);
	}
	/**
	 * Gets the reference for attribute usrid03i.
	 * @return the usrid03i attribute reference
	 */
	public ElementaryRangeReference getUsrid03iReference() {
		return usrid03i.getReference();
	}

	/**
	 * Getter for usrid03i attribute.
	 * @return usrid03i attribute
	 */
	public String getUsrid03i() {
		return usrid03i.getValue();
	}

	/**
	 * Setter for usrid03i attribute.
	 * @param usrid03i the new value of usrid03i
	 */
	public void setUsrid03i(String usrid03i) {
		this.usrid03i.setValue(usrid03i);
	}
	/**
	 * Gets the reference for attribute fname03l.
	 * @return the fname03l attribute reference
	 */
	public ElementaryRangeReference getFname03lReference() {
		return fname03l.getReference();
	}

	/**
	 * Getter for fname03l attribute.
	 * @return fname03l attribute
	 */
	public int getFname03l() {
		return fname03l.getValue();
	}

	/**
	 * Setter for fname03l attribute.
	 * @param fname03l the new value of fname03l
	 */
	public void setFname03l(int fname03l) {
		this.fname03l.setValue(fname03l);
	}
	/**
	 * Gets the reference for attribute fname03f.
	 * @return the fname03f attribute reference
	 */
	public ElementaryRangeReference getFname03fReference() {
		return fname03f.getReference();
	}

	/**
	 * Getter for fname03f attribute.
	 * @return fname03f attribute
	 */
	public String getFname03f() {
		return fname03f.getValue();
	}

	/**
	 * Setter for fname03f attribute.
	 * @param fname03f the new value of fname03f
	 */
	public void setFname03f(String fname03f) {
		this.fname03f.setValue(fname03f);
	}
	/**
	 * Gets the reference for attribute fname03a.
	 * @return the fname03a attribute reference
	 */
	public ElementaryRangeReference getFname03aReference() {
		return fname03a.getReference();
	}

	/**
	 * Getter for fname03a attribute.
	 * @return fname03a attribute
	 */
	public String getFname03a() {
		return fname03a.getValue();
	}

	/**
	 * Setter for fname03a attribute.
	 * @param fname03a the new value of fname03a
	 */
	public void setFname03a(String fname03a) {
		this.fname03a.setValue(fname03a);
	}
	/**
	 * Gets the reference for attribute fname03i.
	 * @return the fname03i attribute reference
	 */
	public ElementaryRangeReference getFname03iReference() {
		return fname03i.getReference();
	}

	/**
	 * Getter for fname03i attribute.
	 * @return fname03i attribute
	 */
	public String getFname03i() {
		return fname03i.getValue();
	}

	/**
	 * Setter for fname03i attribute.
	 * @param fname03i the new value of fname03i
	 */
	public void setFname03i(String fname03i) {
		this.fname03i.setValue(fname03i);
	}
	/**
	 * Gets the reference for attribute lname03l.
	 * @return the lname03l attribute reference
	 */
	public ElementaryRangeReference getLname03lReference() {
		return lname03l.getReference();
	}

	/**
	 * Getter for lname03l attribute.
	 * @return lname03l attribute
	 */
	public int getLname03l() {
		return lname03l.getValue();
	}

	/**
	 * Setter for lname03l attribute.
	 * @param lname03l the new value of lname03l
	 */
	public void setLname03l(int lname03l) {
		this.lname03l.setValue(lname03l);
	}
	/**
	 * Gets the reference for attribute lname03f.
	 * @return the lname03f attribute reference
	 */
	public ElementaryRangeReference getLname03fReference() {
		return lname03f.getReference();
	}

	/**
	 * Getter for lname03f attribute.
	 * @return lname03f attribute
	 */
	public String getLname03f() {
		return lname03f.getValue();
	}

	/**
	 * Setter for lname03f attribute.
	 * @param lname03f the new value of lname03f
	 */
	public void setLname03f(String lname03f) {
		this.lname03f.setValue(lname03f);
	}
	/**
	 * Gets the reference for attribute lname03a.
	 * @return the lname03a attribute reference
	 */
	public ElementaryRangeReference getLname03aReference() {
		return lname03a.getReference();
	}

	/**
	 * Getter for lname03a attribute.
	 * @return lname03a attribute
	 */
	public String getLname03a() {
		return lname03a.getValue();
	}

	/**
	 * Setter for lname03a attribute.
	 * @param lname03a the new value of lname03a
	 */
	public void setLname03a(String lname03a) {
		this.lname03a.setValue(lname03a);
	}
	/**
	 * Gets the reference for attribute lname03i.
	 * @return the lname03i attribute reference
	 */
	public ElementaryRangeReference getLname03iReference() {
		return lname03i.getReference();
	}

	/**
	 * Getter for lname03i attribute.
	 * @return lname03i attribute
	 */
	public String getLname03i() {
		return lname03i.getValue();
	}

	/**
	 * Setter for lname03i attribute.
	 * @param lname03i the new value of lname03i
	 */
	public void setLname03i(String lname03i) {
		this.lname03i.setValue(lname03i);
	}
	/**
	 * Gets the reference for attribute utype03l.
	 * @return the utype03l attribute reference
	 */
	public ElementaryRangeReference getUtype03lReference() {
		return utype03l.getReference();
	}

	/**
	 * Getter for utype03l attribute.
	 * @return utype03l attribute
	 */
	public int getUtype03l() {
		return utype03l.getValue();
	}

	/**
	 * Setter for utype03l attribute.
	 * @param utype03l the new value of utype03l
	 */
	public void setUtype03l(int utype03l) {
		this.utype03l.setValue(utype03l);
	}
	/**
	 * Gets the reference for attribute utype03f.
	 * @return the utype03f attribute reference
	 */
	public ElementaryRangeReference getUtype03fReference() {
		return utype03f.getReference();
	}

	/**
	 * Getter for utype03f attribute.
	 * @return utype03f attribute
	 */
	public String getUtype03f() {
		return utype03f.getValue();
	}

	/**
	 * Setter for utype03f attribute.
	 * @param utype03f the new value of utype03f
	 */
	public void setUtype03f(String utype03f) {
		this.utype03f.setValue(utype03f);
	}
	/**
	 * Gets the reference for attribute utype03a.
	 * @return the utype03a attribute reference
	 */
	public ElementaryRangeReference getUtype03aReference() {
		return utype03a.getReference();
	}

	/**
	 * Getter for utype03a attribute.
	 * @return utype03a attribute
	 */
	public String getUtype03a() {
		return utype03a.getValue();
	}

	/**
	 * Setter for utype03a attribute.
	 * @param utype03a the new value of utype03a
	 */
	public void setUtype03a(String utype03a) {
		this.utype03a.setValue(utype03a);
	}
	/**
	 * Gets the reference for attribute utype03i.
	 * @return the utype03i attribute reference
	 */
	public ElementaryRangeReference getUtype03iReference() {
		return utype03i.getReference();
	}

	/**
	 * Getter for utype03i attribute.
	 * @return utype03i attribute
	 */
	public String getUtype03i() {
		return utype03i.getValue();
	}

	/**
	 * Setter for utype03i attribute.
	 * @param utype03i the new value of utype03i
	 */
	public void setUtype03i(String utype03i) {
		this.utype03i.setValue(utype03i);
	}
	/**
	 * Gets the reference for attribute sel0004l.
	 * @return the sel0004l attribute reference
	 */
	public ElementaryRangeReference getSel0004lReference() {
		return sel0004l.getReference();
	}

	/**
	 * Getter for sel0004l attribute.
	 * @return sel0004l attribute
	 */
	public int getSel0004l() {
		return sel0004l.getValue();
	}

	/**
	 * Setter for sel0004l attribute.
	 * @param sel0004l the new value of sel0004l
	 */
	public void setSel0004l(int sel0004l) {
		this.sel0004l.setValue(sel0004l);
	}
	/**
	 * Gets the reference for attribute sel0004f.
	 * @return the sel0004f attribute reference
	 */
	public ElementaryRangeReference getSel0004fReference() {
		return sel0004f.getReference();
	}

	/**
	 * Getter for sel0004f attribute.
	 * @return sel0004f attribute
	 */
	public String getSel0004f() {
		return sel0004f.getValue();
	}

	/**
	 * Setter for sel0004f attribute.
	 * @param sel0004f the new value of sel0004f
	 */
	public void setSel0004f(String sel0004f) {
		this.sel0004f.setValue(sel0004f);
	}
	/**
	 * Gets the reference for attribute sel0004a.
	 * @return the sel0004a attribute reference
	 */
	public ElementaryRangeReference getSel0004aReference() {
		return sel0004a.getReference();
	}

	/**
	 * Getter for sel0004a attribute.
	 * @return sel0004a attribute
	 */
	public String getSel0004a() {
		return sel0004a.getValue();
	}

	/**
	 * Setter for sel0004a attribute.
	 * @param sel0004a the new value of sel0004a
	 */
	public void setSel0004a(String sel0004a) {
		this.sel0004a.setValue(sel0004a);
	}
	/**
	 * Gets the reference for attribute sel0004i.
	 * @return the sel0004i attribute reference
	 */
	public ElementaryRangeReference getSel0004iReference() {
		return sel0004i.getReference();
	}

	/**
	 * Getter for sel0004i attribute.
	 * @return sel0004i attribute
	 */
	public String getSel0004i() {
		return sel0004i.getValue();
	}

	/**
	 * Setter for sel0004i attribute.
	 * @param sel0004i the new value of sel0004i
	 */
	public void setSel0004i(String sel0004i) {
		this.sel0004i.setValue(sel0004i);
	}
	/**
	 * Gets the reference for attribute usrid04l.
	 * @return the usrid04l attribute reference
	 */
	public ElementaryRangeReference getUsrid04lReference() {
		return usrid04l.getReference();
	}

	/**
	 * Getter for usrid04l attribute.
	 * @return usrid04l attribute
	 */
	public int getUsrid04l() {
		return usrid04l.getValue();
	}

	/**
	 * Setter for usrid04l attribute.
	 * @param usrid04l the new value of usrid04l
	 */
	public void setUsrid04l(int usrid04l) {
		this.usrid04l.setValue(usrid04l);
	}
	/**
	 * Gets the reference for attribute usrid04f.
	 * @return the usrid04f attribute reference
	 */
	public ElementaryRangeReference getUsrid04fReference() {
		return usrid04f.getReference();
	}

	/**
	 * Getter for usrid04f attribute.
	 * @return usrid04f attribute
	 */
	public String getUsrid04f() {
		return usrid04f.getValue();
	}

	/**
	 * Setter for usrid04f attribute.
	 * @param usrid04f the new value of usrid04f
	 */
	public void setUsrid04f(String usrid04f) {
		this.usrid04f.setValue(usrid04f);
	}
	/**
	 * Gets the reference for attribute usrid04a.
	 * @return the usrid04a attribute reference
	 */
	public ElementaryRangeReference getUsrid04aReference() {
		return usrid04a.getReference();
	}

	/**
	 * Getter for usrid04a attribute.
	 * @return usrid04a attribute
	 */
	public String getUsrid04a() {
		return usrid04a.getValue();
	}

	/**
	 * Setter for usrid04a attribute.
	 * @param usrid04a the new value of usrid04a
	 */
	public void setUsrid04a(String usrid04a) {
		this.usrid04a.setValue(usrid04a);
	}
	/**
	 * Gets the reference for attribute usrid04i.
	 * @return the usrid04i attribute reference
	 */
	public ElementaryRangeReference getUsrid04iReference() {
		return usrid04i.getReference();
	}

	/**
	 * Getter for usrid04i attribute.
	 * @return usrid04i attribute
	 */
	public String getUsrid04i() {
		return usrid04i.getValue();
	}

	/**
	 * Setter for usrid04i attribute.
	 * @param usrid04i the new value of usrid04i
	 */
	public void setUsrid04i(String usrid04i) {
		this.usrid04i.setValue(usrid04i);
	}
	/**
	 * Gets the reference for attribute fname04l.
	 * @return the fname04l attribute reference
	 */
	public ElementaryRangeReference getFname04lReference() {
		return fname04l.getReference();
	}

	/**
	 * Getter for fname04l attribute.
	 * @return fname04l attribute
	 */
	public int getFname04l() {
		return fname04l.getValue();
	}

	/**
	 * Setter for fname04l attribute.
	 * @param fname04l the new value of fname04l
	 */
	public void setFname04l(int fname04l) {
		this.fname04l.setValue(fname04l);
	}
	/**
	 * Gets the reference for attribute fname04f.
	 * @return the fname04f attribute reference
	 */
	public ElementaryRangeReference getFname04fReference() {
		return fname04f.getReference();
	}

	/**
	 * Getter for fname04f attribute.
	 * @return fname04f attribute
	 */
	public String getFname04f() {
		return fname04f.getValue();
	}

	/**
	 * Setter for fname04f attribute.
	 * @param fname04f the new value of fname04f
	 */
	public void setFname04f(String fname04f) {
		this.fname04f.setValue(fname04f);
	}
	/**
	 * Gets the reference for attribute fname04a.
	 * @return the fname04a attribute reference
	 */
	public ElementaryRangeReference getFname04aReference() {
		return fname04a.getReference();
	}

	/**
	 * Getter for fname04a attribute.
	 * @return fname04a attribute
	 */
	public String getFname04a() {
		return fname04a.getValue();
	}

	/**
	 * Setter for fname04a attribute.
	 * @param fname04a the new value of fname04a
	 */
	public void setFname04a(String fname04a) {
		this.fname04a.setValue(fname04a);
	}
	/**
	 * Gets the reference for attribute fname04i.
	 * @return the fname04i attribute reference
	 */
	public ElementaryRangeReference getFname04iReference() {
		return fname04i.getReference();
	}

	/**
	 * Getter for fname04i attribute.
	 * @return fname04i attribute
	 */
	public String getFname04i() {
		return fname04i.getValue();
	}

	/**
	 * Setter for fname04i attribute.
	 * @param fname04i the new value of fname04i
	 */
	public void setFname04i(String fname04i) {
		this.fname04i.setValue(fname04i);
	}
	/**
	 * Gets the reference for attribute lname04l.
	 * @return the lname04l attribute reference
	 */
	public ElementaryRangeReference getLname04lReference() {
		return lname04l.getReference();
	}

	/**
	 * Getter for lname04l attribute.
	 * @return lname04l attribute
	 */
	public int getLname04l() {
		return lname04l.getValue();
	}

	/**
	 * Setter for lname04l attribute.
	 * @param lname04l the new value of lname04l
	 */
	public void setLname04l(int lname04l) {
		this.lname04l.setValue(lname04l);
	}
	/**
	 * Gets the reference for attribute lname04f.
	 * @return the lname04f attribute reference
	 */
	public ElementaryRangeReference getLname04fReference() {
		return lname04f.getReference();
	}

	/**
	 * Getter for lname04f attribute.
	 * @return lname04f attribute
	 */
	public String getLname04f() {
		return lname04f.getValue();
	}

	/**
	 * Setter for lname04f attribute.
	 * @param lname04f the new value of lname04f
	 */
	public void setLname04f(String lname04f) {
		this.lname04f.setValue(lname04f);
	}
	/**
	 * Gets the reference for attribute lname04a.
	 * @return the lname04a attribute reference
	 */
	public ElementaryRangeReference getLname04aReference() {
		return lname04a.getReference();
	}

	/**
	 * Getter for lname04a attribute.
	 * @return lname04a attribute
	 */
	public String getLname04a() {
		return lname04a.getValue();
	}

	/**
	 * Setter for lname04a attribute.
	 * @param lname04a the new value of lname04a
	 */
	public void setLname04a(String lname04a) {
		this.lname04a.setValue(lname04a);
	}
	/**
	 * Gets the reference for attribute lname04i.
	 * @return the lname04i attribute reference
	 */
	public ElementaryRangeReference getLname04iReference() {
		return lname04i.getReference();
	}

	/**
	 * Getter for lname04i attribute.
	 * @return lname04i attribute
	 */
	public String getLname04i() {
		return lname04i.getValue();
	}

	/**
	 * Setter for lname04i attribute.
	 * @param lname04i the new value of lname04i
	 */
	public void setLname04i(String lname04i) {
		this.lname04i.setValue(lname04i);
	}
	/**
	 * Gets the reference for attribute utype04l.
	 * @return the utype04l attribute reference
	 */
	public ElementaryRangeReference getUtype04lReference() {
		return utype04l.getReference();
	}

	/**
	 * Getter for utype04l attribute.
	 * @return utype04l attribute
	 */
	public int getUtype04l() {
		return utype04l.getValue();
	}

	/**
	 * Setter for utype04l attribute.
	 * @param utype04l the new value of utype04l
	 */
	public void setUtype04l(int utype04l) {
		this.utype04l.setValue(utype04l);
	}
	/**
	 * Gets the reference for attribute utype04f.
	 * @return the utype04f attribute reference
	 */
	public ElementaryRangeReference getUtype04fReference() {
		return utype04f.getReference();
	}

	/**
	 * Getter for utype04f attribute.
	 * @return utype04f attribute
	 */
	public String getUtype04f() {
		return utype04f.getValue();
	}

	/**
	 * Setter for utype04f attribute.
	 * @param utype04f the new value of utype04f
	 */
	public void setUtype04f(String utype04f) {
		this.utype04f.setValue(utype04f);
	}
	/**
	 * Gets the reference for attribute utype04a.
	 * @return the utype04a attribute reference
	 */
	public ElementaryRangeReference getUtype04aReference() {
		return utype04a.getReference();
	}

	/**
	 * Getter for utype04a attribute.
	 * @return utype04a attribute
	 */
	public String getUtype04a() {
		return utype04a.getValue();
	}

	/**
	 * Setter for utype04a attribute.
	 * @param utype04a the new value of utype04a
	 */
	public void setUtype04a(String utype04a) {
		this.utype04a.setValue(utype04a);
	}
	/**
	 * Gets the reference for attribute utype04i.
	 * @return the utype04i attribute reference
	 */
	public ElementaryRangeReference getUtype04iReference() {
		return utype04i.getReference();
	}

	/**
	 * Getter for utype04i attribute.
	 * @return utype04i attribute
	 */
	public String getUtype04i() {
		return utype04i.getValue();
	}

	/**
	 * Setter for utype04i attribute.
	 * @param utype04i the new value of utype04i
	 */
	public void setUtype04i(String utype04i) {
		this.utype04i.setValue(utype04i);
	}
	/**
	 * Gets the reference for attribute sel0005l.
	 * @return the sel0005l attribute reference
	 */
	public ElementaryRangeReference getSel0005lReference() {
		return sel0005l.getReference();
	}

	/**
	 * Getter for sel0005l attribute.
	 * @return sel0005l attribute
	 */
	public int getSel0005l() {
		return sel0005l.getValue();
	}

	/**
	 * Setter for sel0005l attribute.
	 * @param sel0005l the new value of sel0005l
	 */
	public void setSel0005l(int sel0005l) {
		this.sel0005l.setValue(sel0005l);
	}
	/**
	 * Gets the reference for attribute sel0005f.
	 * @return the sel0005f attribute reference
	 */
	public ElementaryRangeReference getSel0005fReference() {
		return sel0005f.getReference();
	}

	/**
	 * Getter for sel0005f attribute.
	 * @return sel0005f attribute
	 */
	public String getSel0005f() {
		return sel0005f.getValue();
	}

	/**
	 * Setter for sel0005f attribute.
	 * @param sel0005f the new value of sel0005f
	 */
	public void setSel0005f(String sel0005f) {
		this.sel0005f.setValue(sel0005f);
	}
	/**
	 * Gets the reference for attribute sel0005a.
	 * @return the sel0005a attribute reference
	 */
	public ElementaryRangeReference getSel0005aReference() {
		return sel0005a.getReference();
	}

	/**
	 * Getter for sel0005a attribute.
	 * @return sel0005a attribute
	 */
	public String getSel0005a() {
		return sel0005a.getValue();
	}

	/**
	 * Setter for sel0005a attribute.
	 * @param sel0005a the new value of sel0005a
	 */
	public void setSel0005a(String sel0005a) {
		this.sel0005a.setValue(sel0005a);
	}
	/**
	 * Gets the reference for attribute sel0005i.
	 * @return the sel0005i attribute reference
	 */
	public ElementaryRangeReference getSel0005iReference() {
		return sel0005i.getReference();
	}

	/**
	 * Getter for sel0005i attribute.
	 * @return sel0005i attribute
	 */
	public String getSel0005i() {
		return sel0005i.getValue();
	}

	/**
	 * Setter for sel0005i attribute.
	 * @param sel0005i the new value of sel0005i
	 */
	public void setSel0005i(String sel0005i) {
		this.sel0005i.setValue(sel0005i);
	}
	/**
	 * Gets the reference for attribute usrid05l.
	 * @return the usrid05l attribute reference
	 */
	public ElementaryRangeReference getUsrid05lReference() {
		return usrid05l.getReference();
	}

	/**
	 * Getter for usrid05l attribute.
	 * @return usrid05l attribute
	 */
	public int getUsrid05l() {
		return usrid05l.getValue();
	}

	/**
	 * Setter for usrid05l attribute.
	 * @param usrid05l the new value of usrid05l
	 */
	public void setUsrid05l(int usrid05l) {
		this.usrid05l.setValue(usrid05l);
	}
	/**
	 * Gets the reference for attribute usrid05f.
	 * @return the usrid05f attribute reference
	 */
	public ElementaryRangeReference getUsrid05fReference() {
		return usrid05f.getReference();
	}

	/**
	 * Getter for usrid05f attribute.
	 * @return usrid05f attribute
	 */
	public String getUsrid05f() {
		return usrid05f.getValue();
	}

	/**
	 * Setter for usrid05f attribute.
	 * @param usrid05f the new value of usrid05f
	 */
	public void setUsrid05f(String usrid05f) {
		this.usrid05f.setValue(usrid05f);
	}
	/**
	 * Gets the reference for attribute usrid05a.
	 * @return the usrid05a attribute reference
	 */
	public ElementaryRangeReference getUsrid05aReference() {
		return usrid05a.getReference();
	}

	/**
	 * Getter for usrid05a attribute.
	 * @return usrid05a attribute
	 */
	public String getUsrid05a() {
		return usrid05a.getValue();
	}

	/**
	 * Setter for usrid05a attribute.
	 * @param usrid05a the new value of usrid05a
	 */
	public void setUsrid05a(String usrid05a) {
		this.usrid05a.setValue(usrid05a);
	}
	/**
	 * Gets the reference for attribute usrid05i.
	 * @return the usrid05i attribute reference
	 */
	public ElementaryRangeReference getUsrid05iReference() {
		return usrid05i.getReference();
	}

	/**
	 * Getter for usrid05i attribute.
	 * @return usrid05i attribute
	 */
	public String getUsrid05i() {
		return usrid05i.getValue();
	}

	/**
	 * Setter for usrid05i attribute.
	 * @param usrid05i the new value of usrid05i
	 */
	public void setUsrid05i(String usrid05i) {
		this.usrid05i.setValue(usrid05i);
	}
	/**
	 * Gets the reference for attribute fname05l.
	 * @return the fname05l attribute reference
	 */
	public ElementaryRangeReference getFname05lReference() {
		return fname05l.getReference();
	}

	/**
	 * Getter for fname05l attribute.
	 * @return fname05l attribute
	 */
	public int getFname05l() {
		return fname05l.getValue();
	}

	/**
	 * Setter for fname05l attribute.
	 * @param fname05l the new value of fname05l
	 */
	public void setFname05l(int fname05l) {
		this.fname05l.setValue(fname05l);
	}
	/**
	 * Gets the reference for attribute fname05f.
	 * @return the fname05f attribute reference
	 */
	public ElementaryRangeReference getFname05fReference() {
		return fname05f.getReference();
	}

	/**
	 * Getter for fname05f attribute.
	 * @return fname05f attribute
	 */
	public String getFname05f() {
		return fname05f.getValue();
	}

	/**
	 * Setter for fname05f attribute.
	 * @param fname05f the new value of fname05f
	 */
	public void setFname05f(String fname05f) {
		this.fname05f.setValue(fname05f);
	}
	/**
	 * Gets the reference for attribute fname05a.
	 * @return the fname05a attribute reference
	 */
	public ElementaryRangeReference getFname05aReference() {
		return fname05a.getReference();
	}

	/**
	 * Getter for fname05a attribute.
	 * @return fname05a attribute
	 */
	public String getFname05a() {
		return fname05a.getValue();
	}

	/**
	 * Setter for fname05a attribute.
	 * @param fname05a the new value of fname05a
	 */
	public void setFname05a(String fname05a) {
		this.fname05a.setValue(fname05a);
	}
	/**
	 * Gets the reference for attribute fname05i.
	 * @return the fname05i attribute reference
	 */
	public ElementaryRangeReference getFname05iReference() {
		return fname05i.getReference();
	}

	/**
	 * Getter for fname05i attribute.
	 * @return fname05i attribute
	 */
	public String getFname05i() {
		return fname05i.getValue();
	}

	/**
	 * Setter for fname05i attribute.
	 * @param fname05i the new value of fname05i
	 */
	public void setFname05i(String fname05i) {
		this.fname05i.setValue(fname05i);
	}
	/**
	 * Gets the reference for attribute lname05l.
	 * @return the lname05l attribute reference
	 */
	public ElementaryRangeReference getLname05lReference() {
		return lname05l.getReference();
	}

	/**
	 * Getter for lname05l attribute.
	 * @return lname05l attribute
	 */
	public int getLname05l() {
		return lname05l.getValue();
	}

	/**
	 * Setter for lname05l attribute.
	 * @param lname05l the new value of lname05l
	 */
	public void setLname05l(int lname05l) {
		this.lname05l.setValue(lname05l);
	}
	/**
	 * Gets the reference for attribute lname05f.
	 * @return the lname05f attribute reference
	 */
	public ElementaryRangeReference getLname05fReference() {
		return lname05f.getReference();
	}

	/**
	 * Getter for lname05f attribute.
	 * @return lname05f attribute
	 */
	public String getLname05f() {
		return lname05f.getValue();
	}

	/**
	 * Setter for lname05f attribute.
	 * @param lname05f the new value of lname05f
	 */
	public void setLname05f(String lname05f) {
		this.lname05f.setValue(lname05f);
	}
	/**
	 * Gets the reference for attribute lname05a.
	 * @return the lname05a attribute reference
	 */
	public ElementaryRangeReference getLname05aReference() {
		return lname05a.getReference();
	}

	/**
	 * Getter for lname05a attribute.
	 * @return lname05a attribute
	 */
	public String getLname05a() {
		return lname05a.getValue();
	}

	/**
	 * Setter for lname05a attribute.
	 * @param lname05a the new value of lname05a
	 */
	public void setLname05a(String lname05a) {
		this.lname05a.setValue(lname05a);
	}
	/**
	 * Gets the reference for attribute lname05i.
	 * @return the lname05i attribute reference
	 */
	public ElementaryRangeReference getLname05iReference() {
		return lname05i.getReference();
	}

	/**
	 * Getter for lname05i attribute.
	 * @return lname05i attribute
	 */
	public String getLname05i() {
		return lname05i.getValue();
	}

	/**
	 * Setter for lname05i attribute.
	 * @param lname05i the new value of lname05i
	 */
	public void setLname05i(String lname05i) {
		this.lname05i.setValue(lname05i);
	}
	/**
	 * Gets the reference for attribute utype05l.
	 * @return the utype05l attribute reference
	 */
	public ElementaryRangeReference getUtype05lReference() {
		return utype05l.getReference();
	}

	/**
	 * Getter for utype05l attribute.
	 * @return utype05l attribute
	 */
	public int getUtype05l() {
		return utype05l.getValue();
	}

	/**
	 * Setter for utype05l attribute.
	 * @param utype05l the new value of utype05l
	 */
	public void setUtype05l(int utype05l) {
		this.utype05l.setValue(utype05l);
	}
	/**
	 * Gets the reference for attribute utype05f.
	 * @return the utype05f attribute reference
	 */
	public ElementaryRangeReference getUtype05fReference() {
		return utype05f.getReference();
	}

	/**
	 * Getter for utype05f attribute.
	 * @return utype05f attribute
	 */
	public String getUtype05f() {
		return utype05f.getValue();
	}

	/**
	 * Setter for utype05f attribute.
	 * @param utype05f the new value of utype05f
	 */
	public void setUtype05f(String utype05f) {
		this.utype05f.setValue(utype05f);
	}
	/**
	 * Gets the reference for attribute utype05a.
	 * @return the utype05a attribute reference
	 */
	public ElementaryRangeReference getUtype05aReference() {
		return utype05a.getReference();
	}

	/**
	 * Getter for utype05a attribute.
	 * @return utype05a attribute
	 */
	public String getUtype05a() {
		return utype05a.getValue();
	}

	/**
	 * Setter for utype05a attribute.
	 * @param utype05a the new value of utype05a
	 */
	public void setUtype05a(String utype05a) {
		this.utype05a.setValue(utype05a);
	}
	/**
	 * Gets the reference for attribute utype05i.
	 * @return the utype05i attribute reference
	 */
	public ElementaryRangeReference getUtype05iReference() {
		return utype05i.getReference();
	}

	/**
	 * Getter for utype05i attribute.
	 * @return utype05i attribute
	 */
	public String getUtype05i() {
		return utype05i.getValue();
	}

	/**
	 * Setter for utype05i attribute.
	 * @param utype05i the new value of utype05i
	 */
	public void setUtype05i(String utype05i) {
		this.utype05i.setValue(utype05i);
	}
	/**
	 * Gets the reference for attribute sel0006l.
	 * @return the sel0006l attribute reference
	 */
	public ElementaryRangeReference getSel0006lReference() {
		return sel0006l.getReference();
	}

	/**
	 * Getter for sel0006l attribute.
	 * @return sel0006l attribute
	 */
	public int getSel0006l() {
		return sel0006l.getValue();
	}

	/**
	 * Setter for sel0006l attribute.
	 * @param sel0006l the new value of sel0006l
	 */
	public void setSel0006l(int sel0006l) {
		this.sel0006l.setValue(sel0006l);
	}
	/**
	 * Gets the reference for attribute sel0006f.
	 * @return the sel0006f attribute reference
	 */
	public ElementaryRangeReference getSel0006fReference() {
		return sel0006f.getReference();
	}

	/**
	 * Getter for sel0006f attribute.
	 * @return sel0006f attribute
	 */
	public String getSel0006f() {
		return sel0006f.getValue();
	}

	/**
	 * Setter for sel0006f attribute.
	 * @param sel0006f the new value of sel0006f
	 */
	public void setSel0006f(String sel0006f) {
		this.sel0006f.setValue(sel0006f);
	}
	/**
	 * Gets the reference for attribute sel0006a.
	 * @return the sel0006a attribute reference
	 */
	public ElementaryRangeReference getSel0006aReference() {
		return sel0006a.getReference();
	}

	/**
	 * Getter for sel0006a attribute.
	 * @return sel0006a attribute
	 */
	public String getSel0006a() {
		return sel0006a.getValue();
	}

	/**
	 * Setter for sel0006a attribute.
	 * @param sel0006a the new value of sel0006a
	 */
	public void setSel0006a(String sel0006a) {
		this.sel0006a.setValue(sel0006a);
	}
	/**
	 * Gets the reference for attribute sel0006i.
	 * @return the sel0006i attribute reference
	 */
	public ElementaryRangeReference getSel0006iReference() {
		return sel0006i.getReference();
	}

	/**
	 * Getter for sel0006i attribute.
	 * @return sel0006i attribute
	 */
	public String getSel0006i() {
		return sel0006i.getValue();
	}

	/**
	 * Setter for sel0006i attribute.
	 * @param sel0006i the new value of sel0006i
	 */
	public void setSel0006i(String sel0006i) {
		this.sel0006i.setValue(sel0006i);
	}
	/**
	 * Gets the reference for attribute usrid06l.
	 * @return the usrid06l attribute reference
	 */
	public ElementaryRangeReference getUsrid06lReference() {
		return usrid06l.getReference();
	}

	/**
	 * Getter for usrid06l attribute.
	 * @return usrid06l attribute
	 */
	public int getUsrid06l() {
		return usrid06l.getValue();
	}

	/**
	 * Setter for usrid06l attribute.
	 * @param usrid06l the new value of usrid06l
	 */
	public void setUsrid06l(int usrid06l) {
		this.usrid06l.setValue(usrid06l);
	}
	/**
	 * Gets the reference for attribute usrid06f.
	 * @return the usrid06f attribute reference
	 */
	public ElementaryRangeReference getUsrid06fReference() {
		return usrid06f.getReference();
	}

	/**
	 * Getter for usrid06f attribute.
	 * @return usrid06f attribute
	 */
	public String getUsrid06f() {
		return usrid06f.getValue();
	}

	/**
	 * Setter for usrid06f attribute.
	 * @param usrid06f the new value of usrid06f
	 */
	public void setUsrid06f(String usrid06f) {
		this.usrid06f.setValue(usrid06f);
	}
	/**
	 * Gets the reference for attribute usrid06a.
	 * @return the usrid06a attribute reference
	 */
	public ElementaryRangeReference getUsrid06aReference() {
		return usrid06a.getReference();
	}

	/**
	 * Getter for usrid06a attribute.
	 * @return usrid06a attribute
	 */
	public String getUsrid06a() {
		return usrid06a.getValue();
	}

	/**
	 * Setter for usrid06a attribute.
	 * @param usrid06a the new value of usrid06a
	 */
	public void setUsrid06a(String usrid06a) {
		this.usrid06a.setValue(usrid06a);
	}
	/**
	 * Gets the reference for attribute usrid06i.
	 * @return the usrid06i attribute reference
	 */
	public ElementaryRangeReference getUsrid06iReference() {
		return usrid06i.getReference();
	}

	/**
	 * Getter for usrid06i attribute.
	 * @return usrid06i attribute
	 */
	public String getUsrid06i() {
		return usrid06i.getValue();
	}

	/**
	 * Setter for usrid06i attribute.
	 * @param usrid06i the new value of usrid06i
	 */
	public void setUsrid06i(String usrid06i) {
		this.usrid06i.setValue(usrid06i);
	}
	/**
	 * Gets the reference for attribute fname06l.
	 * @return the fname06l attribute reference
	 */
	public ElementaryRangeReference getFname06lReference() {
		return fname06l.getReference();
	}

	/**
	 * Getter for fname06l attribute.
	 * @return fname06l attribute
	 */
	public int getFname06l() {
		return fname06l.getValue();
	}

	/**
	 * Setter for fname06l attribute.
	 * @param fname06l the new value of fname06l
	 */
	public void setFname06l(int fname06l) {
		this.fname06l.setValue(fname06l);
	}
	/**
	 * Gets the reference for attribute fname06f.
	 * @return the fname06f attribute reference
	 */
	public ElementaryRangeReference getFname06fReference() {
		return fname06f.getReference();
	}

	/**
	 * Getter for fname06f attribute.
	 * @return fname06f attribute
	 */
	public String getFname06f() {
		return fname06f.getValue();
	}

	/**
	 * Setter for fname06f attribute.
	 * @param fname06f the new value of fname06f
	 */
	public void setFname06f(String fname06f) {
		this.fname06f.setValue(fname06f);
	}
	/**
	 * Gets the reference for attribute fname06a.
	 * @return the fname06a attribute reference
	 */
	public ElementaryRangeReference getFname06aReference() {
		return fname06a.getReference();
	}

	/**
	 * Getter for fname06a attribute.
	 * @return fname06a attribute
	 */
	public String getFname06a() {
		return fname06a.getValue();
	}

	/**
	 * Setter for fname06a attribute.
	 * @param fname06a the new value of fname06a
	 */
	public void setFname06a(String fname06a) {
		this.fname06a.setValue(fname06a);
	}
	/**
	 * Gets the reference for attribute fname06i.
	 * @return the fname06i attribute reference
	 */
	public ElementaryRangeReference getFname06iReference() {
		return fname06i.getReference();
	}

	/**
	 * Getter for fname06i attribute.
	 * @return fname06i attribute
	 */
	public String getFname06i() {
		return fname06i.getValue();
	}

	/**
	 * Setter for fname06i attribute.
	 * @param fname06i the new value of fname06i
	 */
	public void setFname06i(String fname06i) {
		this.fname06i.setValue(fname06i);
	}
	/**
	 * Gets the reference for attribute lname06l.
	 * @return the lname06l attribute reference
	 */
	public ElementaryRangeReference getLname06lReference() {
		return lname06l.getReference();
	}

	/**
	 * Getter for lname06l attribute.
	 * @return lname06l attribute
	 */
	public int getLname06l() {
		return lname06l.getValue();
	}

	/**
	 * Setter for lname06l attribute.
	 * @param lname06l the new value of lname06l
	 */
	public void setLname06l(int lname06l) {
		this.lname06l.setValue(lname06l);
	}
	/**
	 * Gets the reference for attribute lname06f.
	 * @return the lname06f attribute reference
	 */
	public ElementaryRangeReference getLname06fReference() {
		return lname06f.getReference();
	}

	/**
	 * Getter for lname06f attribute.
	 * @return lname06f attribute
	 */
	public String getLname06f() {
		return lname06f.getValue();
	}

	/**
	 * Setter for lname06f attribute.
	 * @param lname06f the new value of lname06f
	 */
	public void setLname06f(String lname06f) {
		this.lname06f.setValue(lname06f);
	}
	/**
	 * Gets the reference for attribute lname06a.
	 * @return the lname06a attribute reference
	 */
	public ElementaryRangeReference getLname06aReference() {
		return lname06a.getReference();
	}

	/**
	 * Getter for lname06a attribute.
	 * @return lname06a attribute
	 */
	public String getLname06a() {
		return lname06a.getValue();
	}

	/**
	 * Setter for lname06a attribute.
	 * @param lname06a the new value of lname06a
	 */
	public void setLname06a(String lname06a) {
		this.lname06a.setValue(lname06a);
	}
	/**
	 * Gets the reference for attribute lname06i.
	 * @return the lname06i attribute reference
	 */
	public ElementaryRangeReference getLname06iReference() {
		return lname06i.getReference();
	}

	/**
	 * Getter for lname06i attribute.
	 * @return lname06i attribute
	 */
	public String getLname06i() {
		return lname06i.getValue();
	}

	/**
	 * Setter for lname06i attribute.
	 * @param lname06i the new value of lname06i
	 */
	public void setLname06i(String lname06i) {
		this.lname06i.setValue(lname06i);
	}
	/**
	 * Gets the reference for attribute utype06l.
	 * @return the utype06l attribute reference
	 */
	public ElementaryRangeReference getUtype06lReference() {
		return utype06l.getReference();
	}

	/**
	 * Getter for utype06l attribute.
	 * @return utype06l attribute
	 */
	public int getUtype06l() {
		return utype06l.getValue();
	}

	/**
	 * Setter for utype06l attribute.
	 * @param utype06l the new value of utype06l
	 */
	public void setUtype06l(int utype06l) {
		this.utype06l.setValue(utype06l);
	}
	/**
	 * Gets the reference for attribute utype06f.
	 * @return the utype06f attribute reference
	 */
	public ElementaryRangeReference getUtype06fReference() {
		return utype06f.getReference();
	}

	/**
	 * Getter for utype06f attribute.
	 * @return utype06f attribute
	 */
	public String getUtype06f() {
		return utype06f.getValue();
	}

	/**
	 * Setter for utype06f attribute.
	 * @param utype06f the new value of utype06f
	 */
	public void setUtype06f(String utype06f) {
		this.utype06f.setValue(utype06f);
	}
	/**
	 * Gets the reference for attribute utype06a.
	 * @return the utype06a attribute reference
	 */
	public ElementaryRangeReference getUtype06aReference() {
		return utype06a.getReference();
	}

	/**
	 * Getter for utype06a attribute.
	 * @return utype06a attribute
	 */
	public String getUtype06a() {
		return utype06a.getValue();
	}

	/**
	 * Setter for utype06a attribute.
	 * @param utype06a the new value of utype06a
	 */
	public void setUtype06a(String utype06a) {
		this.utype06a.setValue(utype06a);
	}
	/**
	 * Gets the reference for attribute utype06i.
	 * @return the utype06i attribute reference
	 */
	public ElementaryRangeReference getUtype06iReference() {
		return utype06i.getReference();
	}

	/**
	 * Getter for utype06i attribute.
	 * @return utype06i attribute
	 */
	public String getUtype06i() {
		return utype06i.getValue();
	}

	/**
	 * Setter for utype06i attribute.
	 * @param utype06i the new value of utype06i
	 */
	public void setUtype06i(String utype06i) {
		this.utype06i.setValue(utype06i);
	}
	/**
	 * Gets the reference for attribute sel0007l.
	 * @return the sel0007l attribute reference
	 */
	public ElementaryRangeReference getSel0007lReference() {
		return sel0007l.getReference();
	}

	/**
	 * Getter for sel0007l attribute.
	 * @return sel0007l attribute
	 */
	public int getSel0007l() {
		return sel0007l.getValue();
	}

	/**
	 * Setter for sel0007l attribute.
	 * @param sel0007l the new value of sel0007l
	 */
	public void setSel0007l(int sel0007l) {
		this.sel0007l.setValue(sel0007l);
	}
	/**
	 * Gets the reference for attribute sel0007f.
	 * @return the sel0007f attribute reference
	 */
	public ElementaryRangeReference getSel0007fReference() {
		return sel0007f.getReference();
	}

	/**
	 * Getter for sel0007f attribute.
	 * @return sel0007f attribute
	 */
	public String getSel0007f() {
		return sel0007f.getValue();
	}

	/**
	 * Setter for sel0007f attribute.
	 * @param sel0007f the new value of sel0007f
	 */
	public void setSel0007f(String sel0007f) {
		this.sel0007f.setValue(sel0007f);
	}
	/**
	 * Gets the reference for attribute sel0007a.
	 * @return the sel0007a attribute reference
	 */
	public ElementaryRangeReference getSel0007aReference() {
		return sel0007a.getReference();
	}

	/**
	 * Getter for sel0007a attribute.
	 * @return sel0007a attribute
	 */
	public String getSel0007a() {
		return sel0007a.getValue();
	}

	/**
	 * Setter for sel0007a attribute.
	 * @param sel0007a the new value of sel0007a
	 */
	public void setSel0007a(String sel0007a) {
		this.sel0007a.setValue(sel0007a);
	}
	/**
	 * Gets the reference for attribute sel0007i.
	 * @return the sel0007i attribute reference
	 */
	public ElementaryRangeReference getSel0007iReference() {
		return sel0007i.getReference();
	}

	/**
	 * Getter for sel0007i attribute.
	 * @return sel0007i attribute
	 */
	public String getSel0007i() {
		return sel0007i.getValue();
	}

	/**
	 * Setter for sel0007i attribute.
	 * @param sel0007i the new value of sel0007i
	 */
	public void setSel0007i(String sel0007i) {
		this.sel0007i.setValue(sel0007i);
	}
	/**
	 * Gets the reference for attribute usrid07l.
	 * @return the usrid07l attribute reference
	 */
	public ElementaryRangeReference getUsrid07lReference() {
		return usrid07l.getReference();
	}

	/**
	 * Getter for usrid07l attribute.
	 * @return usrid07l attribute
	 */
	public int getUsrid07l() {
		return usrid07l.getValue();
	}

	/**
	 * Setter for usrid07l attribute.
	 * @param usrid07l the new value of usrid07l
	 */
	public void setUsrid07l(int usrid07l) {
		this.usrid07l.setValue(usrid07l);
	}
	/**
	 * Gets the reference for attribute usrid07f.
	 * @return the usrid07f attribute reference
	 */
	public ElementaryRangeReference getUsrid07fReference() {
		return usrid07f.getReference();
	}

	/**
	 * Getter for usrid07f attribute.
	 * @return usrid07f attribute
	 */
	public String getUsrid07f() {
		return usrid07f.getValue();
	}

	/**
	 * Setter for usrid07f attribute.
	 * @param usrid07f the new value of usrid07f
	 */
	public void setUsrid07f(String usrid07f) {
		this.usrid07f.setValue(usrid07f);
	}
	/**
	 * Gets the reference for attribute usrid07a.
	 * @return the usrid07a attribute reference
	 */
	public ElementaryRangeReference getUsrid07aReference() {
		return usrid07a.getReference();
	}

	/**
	 * Getter for usrid07a attribute.
	 * @return usrid07a attribute
	 */
	public String getUsrid07a() {
		return usrid07a.getValue();
	}

	/**
	 * Setter for usrid07a attribute.
	 * @param usrid07a the new value of usrid07a
	 */
	public void setUsrid07a(String usrid07a) {
		this.usrid07a.setValue(usrid07a);
	}
	/**
	 * Gets the reference for attribute usrid07i.
	 * @return the usrid07i attribute reference
	 */
	public ElementaryRangeReference getUsrid07iReference() {
		return usrid07i.getReference();
	}

	/**
	 * Getter for usrid07i attribute.
	 * @return usrid07i attribute
	 */
	public String getUsrid07i() {
		return usrid07i.getValue();
	}

	/**
	 * Setter for usrid07i attribute.
	 * @param usrid07i the new value of usrid07i
	 */
	public void setUsrid07i(String usrid07i) {
		this.usrid07i.setValue(usrid07i);
	}
	/**
	 * Gets the reference for attribute fname07l.
	 * @return the fname07l attribute reference
	 */
	public ElementaryRangeReference getFname07lReference() {
		return fname07l.getReference();
	}

	/**
	 * Getter for fname07l attribute.
	 * @return fname07l attribute
	 */
	public int getFname07l() {
		return fname07l.getValue();
	}

	/**
	 * Setter for fname07l attribute.
	 * @param fname07l the new value of fname07l
	 */
	public void setFname07l(int fname07l) {
		this.fname07l.setValue(fname07l);
	}
	/**
	 * Gets the reference for attribute fname07f.
	 * @return the fname07f attribute reference
	 */
	public ElementaryRangeReference getFname07fReference() {
		return fname07f.getReference();
	}

	/**
	 * Getter for fname07f attribute.
	 * @return fname07f attribute
	 */
	public String getFname07f() {
		return fname07f.getValue();
	}

	/**
	 * Setter for fname07f attribute.
	 * @param fname07f the new value of fname07f
	 */
	public void setFname07f(String fname07f) {
		this.fname07f.setValue(fname07f);
	}
	/**
	 * Gets the reference for attribute fname07a.
	 * @return the fname07a attribute reference
	 */
	public ElementaryRangeReference getFname07aReference() {
		return fname07a.getReference();
	}

	/**
	 * Getter for fname07a attribute.
	 * @return fname07a attribute
	 */
	public String getFname07a() {
		return fname07a.getValue();
	}

	/**
	 * Setter for fname07a attribute.
	 * @param fname07a the new value of fname07a
	 */
	public void setFname07a(String fname07a) {
		this.fname07a.setValue(fname07a);
	}
	/**
	 * Gets the reference for attribute fname07i.
	 * @return the fname07i attribute reference
	 */
	public ElementaryRangeReference getFname07iReference() {
		return fname07i.getReference();
	}

	/**
	 * Getter for fname07i attribute.
	 * @return fname07i attribute
	 */
	public String getFname07i() {
		return fname07i.getValue();
	}

	/**
	 * Setter for fname07i attribute.
	 * @param fname07i the new value of fname07i
	 */
	public void setFname07i(String fname07i) {
		this.fname07i.setValue(fname07i);
	}
	/**
	 * Gets the reference for attribute lname07l.
	 * @return the lname07l attribute reference
	 */
	public ElementaryRangeReference getLname07lReference() {
		return lname07l.getReference();
	}

	/**
	 * Getter for lname07l attribute.
	 * @return lname07l attribute
	 */
	public int getLname07l() {
		return lname07l.getValue();
	}

	/**
	 * Setter for lname07l attribute.
	 * @param lname07l the new value of lname07l
	 */
	public void setLname07l(int lname07l) {
		this.lname07l.setValue(lname07l);
	}
	/**
	 * Gets the reference for attribute lname07f.
	 * @return the lname07f attribute reference
	 */
	public ElementaryRangeReference getLname07fReference() {
		return lname07f.getReference();
	}

	/**
	 * Getter for lname07f attribute.
	 * @return lname07f attribute
	 */
	public String getLname07f() {
		return lname07f.getValue();
	}

	/**
	 * Setter for lname07f attribute.
	 * @param lname07f the new value of lname07f
	 */
	public void setLname07f(String lname07f) {
		this.lname07f.setValue(lname07f);
	}
	/**
	 * Gets the reference for attribute lname07a.
	 * @return the lname07a attribute reference
	 */
	public ElementaryRangeReference getLname07aReference() {
		return lname07a.getReference();
	}

	/**
	 * Getter for lname07a attribute.
	 * @return lname07a attribute
	 */
	public String getLname07a() {
		return lname07a.getValue();
	}

	/**
	 * Setter for lname07a attribute.
	 * @param lname07a the new value of lname07a
	 */
	public void setLname07a(String lname07a) {
		this.lname07a.setValue(lname07a);
	}
	/**
	 * Gets the reference for attribute lname07i.
	 * @return the lname07i attribute reference
	 */
	public ElementaryRangeReference getLname07iReference() {
		return lname07i.getReference();
	}

	/**
	 * Getter for lname07i attribute.
	 * @return lname07i attribute
	 */
	public String getLname07i() {
		return lname07i.getValue();
	}

	/**
	 * Setter for lname07i attribute.
	 * @param lname07i the new value of lname07i
	 */
	public void setLname07i(String lname07i) {
		this.lname07i.setValue(lname07i);
	}
	/**
	 * Gets the reference for attribute utype07l.
	 * @return the utype07l attribute reference
	 */
	public ElementaryRangeReference getUtype07lReference() {
		return utype07l.getReference();
	}

	/**
	 * Getter for utype07l attribute.
	 * @return utype07l attribute
	 */
	public int getUtype07l() {
		return utype07l.getValue();
	}

	/**
	 * Setter for utype07l attribute.
	 * @param utype07l the new value of utype07l
	 */
	public void setUtype07l(int utype07l) {
		this.utype07l.setValue(utype07l);
	}
	/**
	 * Gets the reference for attribute utype07f.
	 * @return the utype07f attribute reference
	 */
	public ElementaryRangeReference getUtype07fReference() {
		return utype07f.getReference();
	}

	/**
	 * Getter for utype07f attribute.
	 * @return utype07f attribute
	 */
	public String getUtype07f() {
		return utype07f.getValue();
	}

	/**
	 * Setter for utype07f attribute.
	 * @param utype07f the new value of utype07f
	 */
	public void setUtype07f(String utype07f) {
		this.utype07f.setValue(utype07f);
	}
	/**
	 * Gets the reference for attribute utype07a.
	 * @return the utype07a attribute reference
	 */
	public ElementaryRangeReference getUtype07aReference() {
		return utype07a.getReference();
	}

	/**
	 * Getter for utype07a attribute.
	 * @return utype07a attribute
	 */
	public String getUtype07a() {
		return utype07a.getValue();
	}

	/**
	 * Setter for utype07a attribute.
	 * @param utype07a the new value of utype07a
	 */
	public void setUtype07a(String utype07a) {
		this.utype07a.setValue(utype07a);
	}
	/**
	 * Gets the reference for attribute utype07i.
	 * @return the utype07i attribute reference
	 */
	public ElementaryRangeReference getUtype07iReference() {
		return utype07i.getReference();
	}

	/**
	 * Getter for utype07i attribute.
	 * @return utype07i attribute
	 */
	public String getUtype07i() {
		return utype07i.getValue();
	}

	/**
	 * Setter for utype07i attribute.
	 * @param utype07i the new value of utype07i
	 */
	public void setUtype07i(String utype07i) {
		this.utype07i.setValue(utype07i);
	}
	/**
	 * Gets the reference for attribute sel0008l.
	 * @return the sel0008l attribute reference
	 */
	public ElementaryRangeReference getSel0008lReference() {
		return sel0008l.getReference();
	}

	/**
	 * Getter for sel0008l attribute.
	 * @return sel0008l attribute
	 */
	public int getSel0008l() {
		return sel0008l.getValue();
	}

	/**
	 * Setter for sel0008l attribute.
	 * @param sel0008l the new value of sel0008l
	 */
	public void setSel0008l(int sel0008l) {
		this.sel0008l.setValue(sel0008l);
	}
	/**
	 * Gets the reference for attribute sel0008f.
	 * @return the sel0008f attribute reference
	 */
	public ElementaryRangeReference getSel0008fReference() {
		return sel0008f.getReference();
	}

	/**
	 * Getter for sel0008f attribute.
	 * @return sel0008f attribute
	 */
	public String getSel0008f() {
		return sel0008f.getValue();
	}

	/**
	 * Setter for sel0008f attribute.
	 * @param sel0008f the new value of sel0008f
	 */
	public void setSel0008f(String sel0008f) {
		this.sel0008f.setValue(sel0008f);
	}
	/**
	 * Gets the reference for attribute sel0008a.
	 * @return the sel0008a attribute reference
	 */
	public ElementaryRangeReference getSel0008aReference() {
		return sel0008a.getReference();
	}

	/**
	 * Getter for sel0008a attribute.
	 * @return sel0008a attribute
	 */
	public String getSel0008a() {
		return sel0008a.getValue();
	}

	/**
	 * Setter for sel0008a attribute.
	 * @param sel0008a the new value of sel0008a
	 */
	public void setSel0008a(String sel0008a) {
		this.sel0008a.setValue(sel0008a);
	}
	/**
	 * Gets the reference for attribute sel0008i.
	 * @return the sel0008i attribute reference
	 */
	public ElementaryRangeReference getSel0008iReference() {
		return sel0008i.getReference();
	}

	/**
	 * Getter for sel0008i attribute.
	 * @return sel0008i attribute
	 */
	public String getSel0008i() {
		return sel0008i.getValue();
	}

	/**
	 * Setter for sel0008i attribute.
	 * @param sel0008i the new value of sel0008i
	 */
	public void setSel0008i(String sel0008i) {
		this.sel0008i.setValue(sel0008i);
	}
	/**
	 * Gets the reference for attribute usrid08l.
	 * @return the usrid08l attribute reference
	 */
	public ElementaryRangeReference getUsrid08lReference() {
		return usrid08l.getReference();
	}

	/**
	 * Getter for usrid08l attribute.
	 * @return usrid08l attribute
	 */
	public int getUsrid08l() {
		return usrid08l.getValue();
	}

	/**
	 * Setter for usrid08l attribute.
	 * @param usrid08l the new value of usrid08l
	 */
	public void setUsrid08l(int usrid08l) {
		this.usrid08l.setValue(usrid08l);
	}
	/**
	 * Gets the reference for attribute usrid08f.
	 * @return the usrid08f attribute reference
	 */
	public ElementaryRangeReference getUsrid08fReference() {
		return usrid08f.getReference();
	}

	/**
	 * Getter for usrid08f attribute.
	 * @return usrid08f attribute
	 */
	public String getUsrid08f() {
		return usrid08f.getValue();
	}

	/**
	 * Setter for usrid08f attribute.
	 * @param usrid08f the new value of usrid08f
	 */
	public void setUsrid08f(String usrid08f) {
		this.usrid08f.setValue(usrid08f);
	}
	/**
	 * Gets the reference for attribute usrid08a.
	 * @return the usrid08a attribute reference
	 */
	public ElementaryRangeReference getUsrid08aReference() {
		return usrid08a.getReference();
	}

	/**
	 * Getter for usrid08a attribute.
	 * @return usrid08a attribute
	 */
	public String getUsrid08a() {
		return usrid08a.getValue();
	}

	/**
	 * Setter for usrid08a attribute.
	 * @param usrid08a the new value of usrid08a
	 */
	public void setUsrid08a(String usrid08a) {
		this.usrid08a.setValue(usrid08a);
	}
	/**
	 * Gets the reference for attribute usrid08i.
	 * @return the usrid08i attribute reference
	 */
	public ElementaryRangeReference getUsrid08iReference() {
		return usrid08i.getReference();
	}

	/**
	 * Getter for usrid08i attribute.
	 * @return usrid08i attribute
	 */
	public String getUsrid08i() {
		return usrid08i.getValue();
	}

	/**
	 * Setter for usrid08i attribute.
	 * @param usrid08i the new value of usrid08i
	 */
	public void setUsrid08i(String usrid08i) {
		this.usrid08i.setValue(usrid08i);
	}
	/**
	 * Gets the reference for attribute fname08l.
	 * @return the fname08l attribute reference
	 */
	public ElementaryRangeReference getFname08lReference() {
		return fname08l.getReference();
	}

	/**
	 * Getter for fname08l attribute.
	 * @return fname08l attribute
	 */
	public int getFname08l() {
		return fname08l.getValue();
	}

	/**
	 * Setter for fname08l attribute.
	 * @param fname08l the new value of fname08l
	 */
	public void setFname08l(int fname08l) {
		this.fname08l.setValue(fname08l);
	}
	/**
	 * Gets the reference for attribute fname08f.
	 * @return the fname08f attribute reference
	 */
	public ElementaryRangeReference getFname08fReference() {
		return fname08f.getReference();
	}

	/**
	 * Getter for fname08f attribute.
	 * @return fname08f attribute
	 */
	public String getFname08f() {
		return fname08f.getValue();
	}

	/**
	 * Setter for fname08f attribute.
	 * @param fname08f the new value of fname08f
	 */
	public void setFname08f(String fname08f) {
		this.fname08f.setValue(fname08f);
	}
	/**
	 * Gets the reference for attribute fname08a.
	 * @return the fname08a attribute reference
	 */
	public ElementaryRangeReference getFname08aReference() {
		return fname08a.getReference();
	}

	/**
	 * Getter for fname08a attribute.
	 * @return fname08a attribute
	 */
	public String getFname08a() {
		return fname08a.getValue();
	}

	/**
	 * Setter for fname08a attribute.
	 * @param fname08a the new value of fname08a
	 */
	public void setFname08a(String fname08a) {
		this.fname08a.setValue(fname08a);
	}
	/**
	 * Gets the reference for attribute fname08i.
	 * @return the fname08i attribute reference
	 */
	public ElementaryRangeReference getFname08iReference() {
		return fname08i.getReference();
	}

	/**
	 * Getter for fname08i attribute.
	 * @return fname08i attribute
	 */
	public String getFname08i() {
		return fname08i.getValue();
	}

	/**
	 * Setter for fname08i attribute.
	 * @param fname08i the new value of fname08i
	 */
	public void setFname08i(String fname08i) {
		this.fname08i.setValue(fname08i);
	}
	/**
	 * Gets the reference for attribute lname08l.
	 * @return the lname08l attribute reference
	 */
	public ElementaryRangeReference getLname08lReference() {
		return lname08l.getReference();
	}

	/**
	 * Getter for lname08l attribute.
	 * @return lname08l attribute
	 */
	public int getLname08l() {
		return lname08l.getValue();
	}

	/**
	 * Setter for lname08l attribute.
	 * @param lname08l the new value of lname08l
	 */
	public void setLname08l(int lname08l) {
		this.lname08l.setValue(lname08l);
	}
	/**
	 * Gets the reference for attribute lname08f.
	 * @return the lname08f attribute reference
	 */
	public ElementaryRangeReference getLname08fReference() {
		return lname08f.getReference();
	}

	/**
	 * Getter for lname08f attribute.
	 * @return lname08f attribute
	 */
	public String getLname08f() {
		return lname08f.getValue();
	}

	/**
	 * Setter for lname08f attribute.
	 * @param lname08f the new value of lname08f
	 */
	public void setLname08f(String lname08f) {
		this.lname08f.setValue(lname08f);
	}
	/**
	 * Gets the reference for attribute lname08a.
	 * @return the lname08a attribute reference
	 */
	public ElementaryRangeReference getLname08aReference() {
		return lname08a.getReference();
	}

	/**
	 * Getter for lname08a attribute.
	 * @return lname08a attribute
	 */
	public String getLname08a() {
		return lname08a.getValue();
	}

	/**
	 * Setter for lname08a attribute.
	 * @param lname08a the new value of lname08a
	 */
	public void setLname08a(String lname08a) {
		this.lname08a.setValue(lname08a);
	}
	/**
	 * Gets the reference for attribute lname08i.
	 * @return the lname08i attribute reference
	 */
	public ElementaryRangeReference getLname08iReference() {
		return lname08i.getReference();
	}

	/**
	 * Getter for lname08i attribute.
	 * @return lname08i attribute
	 */
	public String getLname08i() {
		return lname08i.getValue();
	}

	/**
	 * Setter for lname08i attribute.
	 * @param lname08i the new value of lname08i
	 */
	public void setLname08i(String lname08i) {
		this.lname08i.setValue(lname08i);
	}
	/**
	 * Gets the reference for attribute utype08l.
	 * @return the utype08l attribute reference
	 */
	public ElementaryRangeReference getUtype08lReference() {
		return utype08l.getReference();
	}

	/**
	 * Getter for utype08l attribute.
	 * @return utype08l attribute
	 */
	public int getUtype08l() {
		return utype08l.getValue();
	}

	/**
	 * Setter for utype08l attribute.
	 * @param utype08l the new value of utype08l
	 */
	public void setUtype08l(int utype08l) {
		this.utype08l.setValue(utype08l);
	}
	/**
	 * Gets the reference for attribute utype08f.
	 * @return the utype08f attribute reference
	 */
	public ElementaryRangeReference getUtype08fReference() {
		return utype08f.getReference();
	}

	/**
	 * Getter for utype08f attribute.
	 * @return utype08f attribute
	 */
	public String getUtype08f() {
		return utype08f.getValue();
	}

	/**
	 * Setter for utype08f attribute.
	 * @param utype08f the new value of utype08f
	 */
	public void setUtype08f(String utype08f) {
		this.utype08f.setValue(utype08f);
	}
	/**
	 * Gets the reference for attribute utype08a.
	 * @return the utype08a attribute reference
	 */
	public ElementaryRangeReference getUtype08aReference() {
		return utype08a.getReference();
	}

	/**
	 * Getter for utype08a attribute.
	 * @return utype08a attribute
	 */
	public String getUtype08a() {
		return utype08a.getValue();
	}

	/**
	 * Setter for utype08a attribute.
	 * @param utype08a the new value of utype08a
	 */
	public void setUtype08a(String utype08a) {
		this.utype08a.setValue(utype08a);
	}
	/**
	 * Gets the reference for attribute utype08i.
	 * @return the utype08i attribute reference
	 */
	public ElementaryRangeReference getUtype08iReference() {
		return utype08i.getReference();
	}

	/**
	 * Getter for utype08i attribute.
	 * @return utype08i attribute
	 */
	public String getUtype08i() {
		return utype08i.getValue();
	}

	/**
	 * Setter for utype08i attribute.
	 * @param utype08i the new value of utype08i
	 */
	public void setUtype08i(String utype08i) {
		this.utype08i.setValue(utype08i);
	}
	/**
	 * Gets the reference for attribute sel0009l.
	 * @return the sel0009l attribute reference
	 */
	public ElementaryRangeReference getSel0009lReference() {
		return sel0009l.getReference();
	}

	/**
	 * Getter for sel0009l attribute.
	 * @return sel0009l attribute
	 */
	public int getSel0009l() {
		return sel0009l.getValue();
	}

	/**
	 * Setter for sel0009l attribute.
	 * @param sel0009l the new value of sel0009l
	 */
	public void setSel0009l(int sel0009l) {
		this.sel0009l.setValue(sel0009l);
	}
	/**
	 * Gets the reference for attribute sel0009f.
	 * @return the sel0009f attribute reference
	 */
	public ElementaryRangeReference getSel0009fReference() {
		return sel0009f.getReference();
	}

	/**
	 * Getter for sel0009f attribute.
	 * @return sel0009f attribute
	 */
	public String getSel0009f() {
		return sel0009f.getValue();
	}

	/**
	 * Setter for sel0009f attribute.
	 * @param sel0009f the new value of sel0009f
	 */
	public void setSel0009f(String sel0009f) {
		this.sel0009f.setValue(sel0009f);
	}
	/**
	 * Gets the reference for attribute sel0009a.
	 * @return the sel0009a attribute reference
	 */
	public ElementaryRangeReference getSel0009aReference() {
		return sel0009a.getReference();
	}

	/**
	 * Getter for sel0009a attribute.
	 * @return sel0009a attribute
	 */
	public String getSel0009a() {
		return sel0009a.getValue();
	}

	/**
	 * Setter for sel0009a attribute.
	 * @param sel0009a the new value of sel0009a
	 */
	public void setSel0009a(String sel0009a) {
		this.sel0009a.setValue(sel0009a);
	}
	/**
	 * Gets the reference for attribute sel0009i.
	 * @return the sel0009i attribute reference
	 */
	public ElementaryRangeReference getSel0009iReference() {
		return sel0009i.getReference();
	}

	/**
	 * Getter for sel0009i attribute.
	 * @return sel0009i attribute
	 */
	public String getSel0009i() {
		return sel0009i.getValue();
	}

	/**
	 * Setter for sel0009i attribute.
	 * @param sel0009i the new value of sel0009i
	 */
	public void setSel0009i(String sel0009i) {
		this.sel0009i.setValue(sel0009i);
	}
	/**
	 * Gets the reference for attribute usrid09l.
	 * @return the usrid09l attribute reference
	 */
	public ElementaryRangeReference getUsrid09lReference() {
		return usrid09l.getReference();
	}

	/**
	 * Getter for usrid09l attribute.
	 * @return usrid09l attribute
	 */
	public int getUsrid09l() {
		return usrid09l.getValue();
	}

	/**
	 * Setter for usrid09l attribute.
	 * @param usrid09l the new value of usrid09l
	 */
	public void setUsrid09l(int usrid09l) {
		this.usrid09l.setValue(usrid09l);
	}
	/**
	 * Gets the reference for attribute usrid09f.
	 * @return the usrid09f attribute reference
	 */
	public ElementaryRangeReference getUsrid09fReference() {
		return usrid09f.getReference();
	}

	/**
	 * Getter for usrid09f attribute.
	 * @return usrid09f attribute
	 */
	public String getUsrid09f() {
		return usrid09f.getValue();
	}

	/**
	 * Setter for usrid09f attribute.
	 * @param usrid09f the new value of usrid09f
	 */
	public void setUsrid09f(String usrid09f) {
		this.usrid09f.setValue(usrid09f);
	}
	/**
	 * Gets the reference for attribute usrid09a.
	 * @return the usrid09a attribute reference
	 */
	public ElementaryRangeReference getUsrid09aReference() {
		return usrid09a.getReference();
	}

	/**
	 * Getter for usrid09a attribute.
	 * @return usrid09a attribute
	 */
	public String getUsrid09a() {
		return usrid09a.getValue();
	}

	/**
	 * Setter for usrid09a attribute.
	 * @param usrid09a the new value of usrid09a
	 */
	public void setUsrid09a(String usrid09a) {
		this.usrid09a.setValue(usrid09a);
	}
	/**
	 * Gets the reference for attribute usrid09i.
	 * @return the usrid09i attribute reference
	 */
	public ElementaryRangeReference getUsrid09iReference() {
		return usrid09i.getReference();
	}

	/**
	 * Getter for usrid09i attribute.
	 * @return usrid09i attribute
	 */
	public String getUsrid09i() {
		return usrid09i.getValue();
	}

	/**
	 * Setter for usrid09i attribute.
	 * @param usrid09i the new value of usrid09i
	 */
	public void setUsrid09i(String usrid09i) {
		this.usrid09i.setValue(usrid09i);
	}
	/**
	 * Gets the reference for attribute fname09l.
	 * @return the fname09l attribute reference
	 */
	public ElementaryRangeReference getFname09lReference() {
		return fname09l.getReference();
	}

	/**
	 * Getter for fname09l attribute.
	 * @return fname09l attribute
	 */
	public int getFname09l() {
		return fname09l.getValue();
	}

	/**
	 * Setter for fname09l attribute.
	 * @param fname09l the new value of fname09l
	 */
	public void setFname09l(int fname09l) {
		this.fname09l.setValue(fname09l);
	}
	/**
	 * Gets the reference for attribute fname09f.
	 * @return the fname09f attribute reference
	 */
	public ElementaryRangeReference getFname09fReference() {
		return fname09f.getReference();
	}

	/**
	 * Getter for fname09f attribute.
	 * @return fname09f attribute
	 */
	public String getFname09f() {
		return fname09f.getValue();
	}

	/**
	 * Setter for fname09f attribute.
	 * @param fname09f the new value of fname09f
	 */
	public void setFname09f(String fname09f) {
		this.fname09f.setValue(fname09f);
	}
	/**
	 * Gets the reference for attribute fname09a.
	 * @return the fname09a attribute reference
	 */
	public ElementaryRangeReference getFname09aReference() {
		return fname09a.getReference();
	}

	/**
	 * Getter for fname09a attribute.
	 * @return fname09a attribute
	 */
	public String getFname09a() {
		return fname09a.getValue();
	}

	/**
	 * Setter for fname09a attribute.
	 * @param fname09a the new value of fname09a
	 */
	public void setFname09a(String fname09a) {
		this.fname09a.setValue(fname09a);
	}
	/**
	 * Gets the reference for attribute fname09i.
	 * @return the fname09i attribute reference
	 */
	public ElementaryRangeReference getFname09iReference() {
		return fname09i.getReference();
	}

	/**
	 * Getter for fname09i attribute.
	 * @return fname09i attribute
	 */
	public String getFname09i() {
		return fname09i.getValue();
	}

	/**
	 * Setter for fname09i attribute.
	 * @param fname09i the new value of fname09i
	 */
	public void setFname09i(String fname09i) {
		this.fname09i.setValue(fname09i);
	}
	/**
	 * Gets the reference for attribute lname09l.
	 * @return the lname09l attribute reference
	 */
	public ElementaryRangeReference getLname09lReference() {
		return lname09l.getReference();
	}

	/**
	 * Getter for lname09l attribute.
	 * @return lname09l attribute
	 */
	public int getLname09l() {
		return lname09l.getValue();
	}

	/**
	 * Setter for lname09l attribute.
	 * @param lname09l the new value of lname09l
	 */
	public void setLname09l(int lname09l) {
		this.lname09l.setValue(lname09l);
	}
	/**
	 * Gets the reference for attribute lname09f.
	 * @return the lname09f attribute reference
	 */
	public ElementaryRangeReference getLname09fReference() {
		return lname09f.getReference();
	}

	/**
	 * Getter for lname09f attribute.
	 * @return lname09f attribute
	 */
	public String getLname09f() {
		return lname09f.getValue();
	}

	/**
	 * Setter for lname09f attribute.
	 * @param lname09f the new value of lname09f
	 */
	public void setLname09f(String lname09f) {
		this.lname09f.setValue(lname09f);
	}
	/**
	 * Gets the reference for attribute lname09a.
	 * @return the lname09a attribute reference
	 */
	public ElementaryRangeReference getLname09aReference() {
		return lname09a.getReference();
	}

	/**
	 * Getter for lname09a attribute.
	 * @return lname09a attribute
	 */
	public String getLname09a() {
		return lname09a.getValue();
	}

	/**
	 * Setter for lname09a attribute.
	 * @param lname09a the new value of lname09a
	 */
	public void setLname09a(String lname09a) {
		this.lname09a.setValue(lname09a);
	}
	/**
	 * Gets the reference for attribute lname09i.
	 * @return the lname09i attribute reference
	 */
	public ElementaryRangeReference getLname09iReference() {
		return lname09i.getReference();
	}

	/**
	 * Getter for lname09i attribute.
	 * @return lname09i attribute
	 */
	public String getLname09i() {
		return lname09i.getValue();
	}

	/**
	 * Setter for lname09i attribute.
	 * @param lname09i the new value of lname09i
	 */
	public void setLname09i(String lname09i) {
		this.lname09i.setValue(lname09i);
	}
	/**
	 * Gets the reference for attribute utype09l.
	 * @return the utype09l attribute reference
	 */
	public ElementaryRangeReference getUtype09lReference() {
		return utype09l.getReference();
	}

	/**
	 * Getter for utype09l attribute.
	 * @return utype09l attribute
	 */
	public int getUtype09l() {
		return utype09l.getValue();
	}

	/**
	 * Setter for utype09l attribute.
	 * @param utype09l the new value of utype09l
	 */
	public void setUtype09l(int utype09l) {
		this.utype09l.setValue(utype09l);
	}
	/**
	 * Gets the reference for attribute utype09f.
	 * @return the utype09f attribute reference
	 */
	public ElementaryRangeReference getUtype09fReference() {
		return utype09f.getReference();
	}

	/**
	 * Getter for utype09f attribute.
	 * @return utype09f attribute
	 */
	public String getUtype09f() {
		return utype09f.getValue();
	}

	/**
	 * Setter for utype09f attribute.
	 * @param utype09f the new value of utype09f
	 */
	public void setUtype09f(String utype09f) {
		this.utype09f.setValue(utype09f);
	}
	/**
	 * Gets the reference for attribute utype09a.
	 * @return the utype09a attribute reference
	 */
	public ElementaryRangeReference getUtype09aReference() {
		return utype09a.getReference();
	}

	/**
	 * Getter for utype09a attribute.
	 * @return utype09a attribute
	 */
	public String getUtype09a() {
		return utype09a.getValue();
	}

	/**
	 * Setter for utype09a attribute.
	 * @param utype09a the new value of utype09a
	 */
	public void setUtype09a(String utype09a) {
		this.utype09a.setValue(utype09a);
	}
	/**
	 * Gets the reference for attribute utype09i.
	 * @return the utype09i attribute reference
	 */
	public ElementaryRangeReference getUtype09iReference() {
		return utype09i.getReference();
	}

	/**
	 * Getter for utype09i attribute.
	 * @return utype09i attribute
	 */
	public String getUtype09i() {
		return utype09i.getValue();
	}

	/**
	 * Setter for utype09i attribute.
	 * @param utype09i the new value of utype09i
	 */
	public void setUtype09i(String utype09i) {
		this.utype09i.setValue(utype09i);
	}
	/**
	 * Gets the reference for attribute sel0010l.
	 * @return the sel0010l attribute reference
	 */
	public ElementaryRangeReference getSel0010lReference() {
		return sel0010l.getReference();
	}

	/**
	 * Getter for sel0010l attribute.
	 * @return sel0010l attribute
	 */
	public int getSel0010l() {
		return sel0010l.getValue();
	}

	/**
	 * Setter for sel0010l attribute.
	 * @param sel0010l the new value of sel0010l
	 */
	public void setSel0010l(int sel0010l) {
		this.sel0010l.setValue(sel0010l);
	}
	/**
	 * Gets the reference for attribute sel0010f.
	 * @return the sel0010f attribute reference
	 */
	public ElementaryRangeReference getSel0010fReference() {
		return sel0010f.getReference();
	}

	/**
	 * Getter for sel0010f attribute.
	 * @return sel0010f attribute
	 */
	public String getSel0010f() {
		return sel0010f.getValue();
	}

	/**
	 * Setter for sel0010f attribute.
	 * @param sel0010f the new value of sel0010f
	 */
	public void setSel0010f(String sel0010f) {
		this.sel0010f.setValue(sel0010f);
	}
	/**
	 * Gets the reference for attribute sel0010a.
	 * @return the sel0010a attribute reference
	 */
	public ElementaryRangeReference getSel0010aReference() {
		return sel0010a.getReference();
	}

	/**
	 * Getter for sel0010a attribute.
	 * @return sel0010a attribute
	 */
	public String getSel0010a() {
		return sel0010a.getValue();
	}

	/**
	 * Setter for sel0010a attribute.
	 * @param sel0010a the new value of sel0010a
	 */
	public void setSel0010a(String sel0010a) {
		this.sel0010a.setValue(sel0010a);
	}
	/**
	 * Gets the reference for attribute sel0010i.
	 * @return the sel0010i attribute reference
	 */
	public ElementaryRangeReference getSel0010iReference() {
		return sel0010i.getReference();
	}

	/**
	 * Getter for sel0010i attribute.
	 * @return sel0010i attribute
	 */
	public String getSel0010i() {
		return sel0010i.getValue();
	}

	/**
	 * Setter for sel0010i attribute.
	 * @param sel0010i the new value of sel0010i
	 */
	public void setSel0010i(String sel0010i) {
		this.sel0010i.setValue(sel0010i);
	}
	/**
	 * Gets the reference for attribute usrid10l.
	 * @return the usrid10l attribute reference
	 */
	public ElementaryRangeReference getUsrid10lReference() {
		return usrid10l.getReference();
	}

	/**
	 * Getter for usrid10l attribute.
	 * @return usrid10l attribute
	 */
	public int getUsrid10l() {
		return usrid10l.getValue();
	}

	/**
	 * Setter for usrid10l attribute.
	 * @param usrid10l the new value of usrid10l
	 */
	public void setUsrid10l(int usrid10l) {
		this.usrid10l.setValue(usrid10l);
	}
	/**
	 * Gets the reference for attribute usrid10f.
	 * @return the usrid10f attribute reference
	 */
	public ElementaryRangeReference getUsrid10fReference() {
		return usrid10f.getReference();
	}

	/**
	 * Getter for usrid10f attribute.
	 * @return usrid10f attribute
	 */
	public String getUsrid10f() {
		return usrid10f.getValue();
	}

	/**
	 * Setter for usrid10f attribute.
	 * @param usrid10f the new value of usrid10f
	 */
	public void setUsrid10f(String usrid10f) {
		this.usrid10f.setValue(usrid10f);
	}
	/**
	 * Gets the reference for attribute usrid10a.
	 * @return the usrid10a attribute reference
	 */
	public ElementaryRangeReference getUsrid10aReference() {
		return usrid10a.getReference();
	}

	/**
	 * Getter for usrid10a attribute.
	 * @return usrid10a attribute
	 */
	public String getUsrid10a() {
		return usrid10a.getValue();
	}

	/**
	 * Setter for usrid10a attribute.
	 * @param usrid10a the new value of usrid10a
	 */
	public void setUsrid10a(String usrid10a) {
		this.usrid10a.setValue(usrid10a);
	}
	/**
	 * Gets the reference for attribute usrid10i.
	 * @return the usrid10i attribute reference
	 */
	public ElementaryRangeReference getUsrid10iReference() {
		return usrid10i.getReference();
	}

	/**
	 * Getter for usrid10i attribute.
	 * @return usrid10i attribute
	 */
	public String getUsrid10i() {
		return usrid10i.getValue();
	}

	/**
	 * Setter for usrid10i attribute.
	 * @param usrid10i the new value of usrid10i
	 */
	public void setUsrid10i(String usrid10i) {
		this.usrid10i.setValue(usrid10i);
	}
	/**
	 * Gets the reference for attribute fname10l.
	 * @return the fname10l attribute reference
	 */
	public ElementaryRangeReference getFname10lReference() {
		return fname10l.getReference();
	}

	/**
	 * Getter for fname10l attribute.
	 * @return fname10l attribute
	 */
	public int getFname10l() {
		return fname10l.getValue();
	}

	/**
	 * Setter for fname10l attribute.
	 * @param fname10l the new value of fname10l
	 */
	public void setFname10l(int fname10l) {
		this.fname10l.setValue(fname10l);
	}
	/**
	 * Gets the reference for attribute fname10f.
	 * @return the fname10f attribute reference
	 */
	public ElementaryRangeReference getFname10fReference() {
		return fname10f.getReference();
	}

	/**
	 * Getter for fname10f attribute.
	 * @return fname10f attribute
	 */
	public String getFname10f() {
		return fname10f.getValue();
	}

	/**
	 * Setter for fname10f attribute.
	 * @param fname10f the new value of fname10f
	 */
	public void setFname10f(String fname10f) {
		this.fname10f.setValue(fname10f);
	}
	/**
	 * Gets the reference for attribute fname10a.
	 * @return the fname10a attribute reference
	 */
	public ElementaryRangeReference getFname10aReference() {
		return fname10a.getReference();
	}

	/**
	 * Getter for fname10a attribute.
	 * @return fname10a attribute
	 */
	public String getFname10a() {
		return fname10a.getValue();
	}

	/**
	 * Setter for fname10a attribute.
	 * @param fname10a the new value of fname10a
	 */
	public void setFname10a(String fname10a) {
		this.fname10a.setValue(fname10a);
	}
	/**
	 * Gets the reference for attribute fname10i.
	 * @return the fname10i attribute reference
	 */
	public ElementaryRangeReference getFname10iReference() {
		return fname10i.getReference();
	}

	/**
	 * Getter for fname10i attribute.
	 * @return fname10i attribute
	 */
	public String getFname10i() {
		return fname10i.getValue();
	}

	/**
	 * Setter for fname10i attribute.
	 * @param fname10i the new value of fname10i
	 */
	public void setFname10i(String fname10i) {
		this.fname10i.setValue(fname10i);
	}
	/**
	 * Gets the reference for attribute lname10l.
	 * @return the lname10l attribute reference
	 */
	public ElementaryRangeReference getLname10lReference() {
		return lname10l.getReference();
	}

	/**
	 * Getter for lname10l attribute.
	 * @return lname10l attribute
	 */
	public int getLname10l() {
		return lname10l.getValue();
	}

	/**
	 * Setter for lname10l attribute.
	 * @param lname10l the new value of lname10l
	 */
	public void setLname10l(int lname10l) {
		this.lname10l.setValue(lname10l);
	}
	/**
	 * Gets the reference for attribute lname10f.
	 * @return the lname10f attribute reference
	 */
	public ElementaryRangeReference getLname10fReference() {
		return lname10f.getReference();
	}

	/**
	 * Getter for lname10f attribute.
	 * @return lname10f attribute
	 */
	public String getLname10f() {
		return lname10f.getValue();
	}

	/**
	 * Setter for lname10f attribute.
	 * @param lname10f the new value of lname10f
	 */
	public void setLname10f(String lname10f) {
		this.lname10f.setValue(lname10f);
	}
	/**
	 * Gets the reference for attribute lname10a.
	 * @return the lname10a attribute reference
	 */
	public ElementaryRangeReference getLname10aReference() {
		return lname10a.getReference();
	}

	/**
	 * Getter for lname10a attribute.
	 * @return lname10a attribute
	 */
	public String getLname10a() {
		return lname10a.getValue();
	}

	/**
	 * Setter for lname10a attribute.
	 * @param lname10a the new value of lname10a
	 */
	public void setLname10a(String lname10a) {
		this.lname10a.setValue(lname10a);
	}
	/**
	 * Gets the reference for attribute lname10i.
	 * @return the lname10i attribute reference
	 */
	public ElementaryRangeReference getLname10iReference() {
		return lname10i.getReference();
	}

	/**
	 * Getter for lname10i attribute.
	 * @return lname10i attribute
	 */
	public String getLname10i() {
		return lname10i.getValue();
	}

	/**
	 * Setter for lname10i attribute.
	 * @param lname10i the new value of lname10i
	 */
	public void setLname10i(String lname10i) {
		this.lname10i.setValue(lname10i);
	}
	/**
	 * Gets the reference for attribute utype10l.
	 * @return the utype10l attribute reference
	 */
	public ElementaryRangeReference getUtype10lReference() {
		return utype10l.getReference();
	}

	/**
	 * Getter for utype10l attribute.
	 * @return utype10l attribute
	 */
	public int getUtype10l() {
		return utype10l.getValue();
	}

	/**
	 * Setter for utype10l attribute.
	 * @param utype10l the new value of utype10l
	 */
	public void setUtype10l(int utype10l) {
		this.utype10l.setValue(utype10l);
	}
	/**
	 * Gets the reference for attribute utype10f.
	 * @return the utype10f attribute reference
	 */
	public ElementaryRangeReference getUtype10fReference() {
		return utype10f.getReference();
	}

	/**
	 * Getter for utype10f attribute.
	 * @return utype10f attribute
	 */
	public String getUtype10f() {
		return utype10f.getValue();
	}

	/**
	 * Setter for utype10f attribute.
	 * @param utype10f the new value of utype10f
	 */
	public void setUtype10f(String utype10f) {
		this.utype10f.setValue(utype10f);
	}
	/**
	 * Gets the reference for attribute utype10a.
	 * @return the utype10a attribute reference
	 */
	public ElementaryRangeReference getUtype10aReference() {
		return utype10a.getReference();
	}

	/**
	 * Getter for utype10a attribute.
	 * @return utype10a attribute
	 */
	public String getUtype10a() {
		return utype10a.getValue();
	}

	/**
	 * Setter for utype10a attribute.
	 * @param utype10a the new value of utype10a
	 */
	public void setUtype10a(String utype10a) {
		this.utype10a.setValue(utype10a);
	}
	/**
	 * Gets the reference for attribute utype10i.
	 * @return the utype10i attribute reference
	 */
	public ElementaryRangeReference getUtype10iReference() {
		return utype10i.getReference();
	}

	/**
	 * Getter for utype10i attribute.
	 * @return utype10i attribute
	 */
	public String getUtype10i() {
		return utype10i.getValue();
	}

	/**
	 * Setter for utype10i attribute.
	 * @param utype10i the new value of utype10i
	 */
	public void setUtype10i(String utype10i) {
		this.utype10i.setValue(utype10i);
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
	 * Gets the reference for attribute cousr0ao.
	 * @return the cousr0ao attribute reference
	 */
	public RangeReference getCousr0aoReference() {
		return cousr0ao.getReference();
	}	
				
	/**
	 * Setter for cousr0ao .
	 */
   	public void setCousr0ao(RangeReference reference) {
       	cousr0ao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute pagenumc.
	 * @return the pagenumc attribute reference
	 */
	public ElementaryRangeReference getPagenumcReference() {
		return pagenumc.getReference();
	}

	/**
	 * Getter for pagenumc attribute.
	 * @return pagenumc attribute
	 */
	public String getPagenumc() {
		return pagenumc.getValue();
	}

	/**
	 * Setter for pagenumc attribute.
	 * @param pagenumc the new value of pagenumc
	 */
	public void setPagenumc(String pagenumc) {
		this.pagenumc.setValue(pagenumc);
	}
	/**
	 * Gets the reference for attribute pagenump.
	 * @return the pagenump attribute reference
	 */
	public ElementaryRangeReference getPagenumpReference() {
		return pagenump.getReference();
	}

	/**
	 * Getter for pagenump attribute.
	 * @return pagenump attribute
	 */
	public String getPagenump() {
		return pagenump.getValue();
	}

	/**
	 * Setter for pagenump attribute.
	 * @param pagenump the new value of pagenump
	 */
	public void setPagenump(String pagenump) {
		this.pagenump.setValue(pagenump);
	}
	/**
	 * Gets the reference for attribute pagenumh.
	 * @return the pagenumh attribute reference
	 */
	public ElementaryRangeReference getPagenumhReference() {
		return pagenumh.getReference();
	}

	/**
	 * Getter for pagenumh attribute.
	 * @return pagenumh attribute
	 */
	public String getPagenumh() {
		return pagenumh.getValue();
	}

	/**
	 * Setter for pagenumh attribute.
	 * @param pagenumh the new value of pagenumh
	 */
	public void setPagenumh(String pagenumh) {
		this.pagenumh.setValue(pagenumh);
	}
	/**
	 * Gets the reference for attribute pagenumv.
	 * @return the pagenumv attribute reference
	 */
	public ElementaryRangeReference getPagenumvReference() {
		return pagenumv.getReference();
	}

	/**
	 * Getter for pagenumv attribute.
	 * @return pagenumv attribute
	 */
	public String getPagenumv() {
		return pagenumv.getValue();
	}

	/**
	 * Setter for pagenumv attribute.
	 * @param pagenumv the new value of pagenumv
	 */
	public void setPagenumv(String pagenumv) {
		this.pagenumv.setValue(pagenumv);
	}
	/**
	 * Gets the reference for attribute pagenumo.
	 * @return the pagenumo attribute reference
	 */
	public ElementaryRangeReference getPagenumoReference() {
		return pagenumo.getReference();
	}

	/**
	 * Getter for pagenumo attribute.
	 * @return pagenumo attribute
	 */
	public String getPagenumo() {
		return pagenumo.getValue();
	}

	/**
	 * Setter for pagenumo attribute.
	 * @param pagenumo the new value of pagenumo
	 */
	public void setPagenumo(String pagenumo) {
		this.pagenumo.setValue(pagenumo);
	}
	/**
	 * Gets the reference for attribute usridinc.
	 * @return the usridinc attribute reference
	 */
	public ElementaryRangeReference getUsridincReference() {
		return usridinc.getReference();
	}

	/**
	 * Getter for usridinc attribute.
	 * @return usridinc attribute
	 */
	public String getUsridinc() {
		return usridinc.getValue();
	}

	/**
	 * Setter for usridinc attribute.
	 * @param usridinc the new value of usridinc
	 */
	public void setUsridinc(String usridinc) {
		this.usridinc.setValue(usridinc);
	}
	/**
	 * Gets the reference for attribute usridinp.
	 * @return the usridinp attribute reference
	 */
	public ElementaryRangeReference getUsridinpReference() {
		return usridinp.getReference();
	}

	/**
	 * Getter for usridinp attribute.
	 * @return usridinp attribute
	 */
	public String getUsridinp() {
		return usridinp.getValue();
	}

	/**
	 * Setter for usridinp attribute.
	 * @param usridinp the new value of usridinp
	 */
	public void setUsridinp(String usridinp) {
		this.usridinp.setValue(usridinp);
	}
	/**
	 * Gets the reference for attribute usridinh.
	 * @return the usridinh attribute reference
	 */
	public ElementaryRangeReference getUsridinhReference() {
		return usridinh.getReference();
	}

	/**
	 * Getter for usridinh attribute.
	 * @return usridinh attribute
	 */
	public String getUsridinh() {
		return usridinh.getValue();
	}

	/**
	 * Setter for usridinh attribute.
	 * @param usridinh the new value of usridinh
	 */
	public void setUsridinh(String usridinh) {
		this.usridinh.setValue(usridinh);
	}
	/**
	 * Gets the reference for attribute usridinv.
	 * @return the usridinv attribute reference
	 */
	public ElementaryRangeReference getUsridinvReference() {
		return usridinv.getReference();
	}

	/**
	 * Getter for usridinv attribute.
	 * @return usridinv attribute
	 */
	public String getUsridinv() {
		return usridinv.getValue();
	}

	/**
	 * Setter for usridinv attribute.
	 * @param usridinv the new value of usridinv
	 */
	public void setUsridinv(String usridinv) {
		this.usridinv.setValue(usridinv);
	}
	/**
	 * Gets the reference for attribute usridino.
	 * @return the usridino attribute reference
	 */
	public ElementaryRangeReference getUsridinoReference() {
		return usridino.getReference();
	}

	/**
	 * Getter for usridino attribute.
	 * @return usridino attribute
	 */
	public String getUsridino() {
		return usridino.getValue();
	}

	/**
	 * Setter for usridino attribute.
	 * @param usridino the new value of usridino
	 */
	public void setUsridino(String usridino) {
		this.usridino.setValue(usridino);
	}
	/**
	 * Gets the reference for attribute sel0001c.
	 * @return the sel0001c attribute reference
	 */
	public ElementaryRangeReference getSel0001cReference() {
		return sel0001c.getReference();
	}

	/**
	 * Getter for sel0001c attribute.
	 * @return sel0001c attribute
	 */
	public String getSel0001c() {
		return sel0001c.getValue();
	}

	/**
	 * Setter for sel0001c attribute.
	 * @param sel0001c the new value of sel0001c
	 */
	public void setSel0001c(String sel0001c) {
		this.sel0001c.setValue(sel0001c);
	}
	/**
	 * Gets the reference for attribute sel0001p.
	 * @return the sel0001p attribute reference
	 */
	public ElementaryRangeReference getSel0001pReference() {
		return sel0001p.getReference();
	}

	/**
	 * Getter for sel0001p attribute.
	 * @return sel0001p attribute
	 */
	public String getSel0001p() {
		return sel0001p.getValue();
	}

	/**
	 * Setter for sel0001p attribute.
	 * @param sel0001p the new value of sel0001p
	 */
	public void setSel0001p(String sel0001p) {
		this.sel0001p.setValue(sel0001p);
	}
	/**
	 * Gets the reference for attribute sel0001h.
	 * @return the sel0001h attribute reference
	 */
	public ElementaryRangeReference getSel0001hReference() {
		return sel0001h.getReference();
	}

	/**
	 * Getter for sel0001h attribute.
	 * @return sel0001h attribute
	 */
	public String getSel0001h() {
		return sel0001h.getValue();
	}

	/**
	 * Setter for sel0001h attribute.
	 * @param sel0001h the new value of sel0001h
	 */
	public void setSel0001h(String sel0001h) {
		this.sel0001h.setValue(sel0001h);
	}
	/**
	 * Gets the reference for attribute sel0001v.
	 * @return the sel0001v attribute reference
	 */
	public ElementaryRangeReference getSel0001vReference() {
		return sel0001v.getReference();
	}

	/**
	 * Getter for sel0001v attribute.
	 * @return sel0001v attribute
	 */
	public String getSel0001v() {
		return sel0001v.getValue();
	}

	/**
	 * Setter for sel0001v attribute.
	 * @param sel0001v the new value of sel0001v
	 */
	public void setSel0001v(String sel0001v) {
		this.sel0001v.setValue(sel0001v);
	}
	/**
	 * Gets the reference for attribute sel0001o.
	 * @return the sel0001o attribute reference
	 */
	public ElementaryRangeReference getSel0001oReference() {
		return sel0001o.getReference();
	}

	/**
	 * Getter for sel0001o attribute.
	 * @return sel0001o attribute
	 */
	public String getSel0001o() {
		return sel0001o.getValue();
	}

	/**
	 * Setter for sel0001o attribute.
	 * @param sel0001o the new value of sel0001o
	 */
	public void setSel0001o(String sel0001o) {
		this.sel0001o.setValue(sel0001o);
	}
	/**
	 * Gets the reference for attribute usrid01c.
	 * @return the usrid01c attribute reference
	 */
	public ElementaryRangeReference getUsrid01cReference() {
		return usrid01c.getReference();
	}

	/**
	 * Getter for usrid01c attribute.
	 * @return usrid01c attribute
	 */
	public String getUsrid01c() {
		return usrid01c.getValue();
	}

	/**
	 * Setter for usrid01c attribute.
	 * @param usrid01c the new value of usrid01c
	 */
	public void setUsrid01c(String usrid01c) {
		this.usrid01c.setValue(usrid01c);
	}
	/**
	 * Gets the reference for attribute usrid01p.
	 * @return the usrid01p attribute reference
	 */
	public ElementaryRangeReference getUsrid01pReference() {
		return usrid01p.getReference();
	}

	/**
	 * Getter for usrid01p attribute.
	 * @return usrid01p attribute
	 */
	public String getUsrid01p() {
		return usrid01p.getValue();
	}

	/**
	 * Setter for usrid01p attribute.
	 * @param usrid01p the new value of usrid01p
	 */
	public void setUsrid01p(String usrid01p) {
		this.usrid01p.setValue(usrid01p);
	}
	/**
	 * Gets the reference for attribute usrid01h.
	 * @return the usrid01h attribute reference
	 */
	public ElementaryRangeReference getUsrid01hReference() {
		return usrid01h.getReference();
	}

	/**
	 * Getter for usrid01h attribute.
	 * @return usrid01h attribute
	 */
	public String getUsrid01h() {
		return usrid01h.getValue();
	}

	/**
	 * Setter for usrid01h attribute.
	 * @param usrid01h the new value of usrid01h
	 */
	public void setUsrid01h(String usrid01h) {
		this.usrid01h.setValue(usrid01h);
	}
	/**
	 * Gets the reference for attribute usrid01v.
	 * @return the usrid01v attribute reference
	 */
	public ElementaryRangeReference getUsrid01vReference() {
		return usrid01v.getReference();
	}

	/**
	 * Getter for usrid01v attribute.
	 * @return usrid01v attribute
	 */
	public String getUsrid01v() {
		return usrid01v.getValue();
	}

	/**
	 * Setter for usrid01v attribute.
	 * @param usrid01v the new value of usrid01v
	 */
	public void setUsrid01v(String usrid01v) {
		this.usrid01v.setValue(usrid01v);
	}
	/**
	 * Gets the reference for attribute usrid01o.
	 * @return the usrid01o attribute reference
	 */
	public ElementaryRangeReference getUsrid01oReference() {
		return usrid01o.getReference();
	}

	/**
	 * Getter for usrid01o attribute.
	 * @return usrid01o attribute
	 */
	public String getUsrid01o() {
		return usrid01o.getValue();
	}

	/**
	 * Setter for usrid01o attribute.
	 * @param usrid01o the new value of usrid01o
	 */
	public void setUsrid01o(String usrid01o) {
		this.usrid01o.setValue(usrid01o);
	}
	/**
	 * Gets the reference for attribute fname01c.
	 * @return the fname01c attribute reference
	 */
	public ElementaryRangeReference getFname01cReference() {
		return fname01c.getReference();
	}

	/**
	 * Getter for fname01c attribute.
	 * @return fname01c attribute
	 */
	public String getFname01c() {
		return fname01c.getValue();
	}

	/**
	 * Setter for fname01c attribute.
	 * @param fname01c the new value of fname01c
	 */
	public void setFname01c(String fname01c) {
		this.fname01c.setValue(fname01c);
	}
	/**
	 * Gets the reference for attribute fname01p.
	 * @return the fname01p attribute reference
	 */
	public ElementaryRangeReference getFname01pReference() {
		return fname01p.getReference();
	}

	/**
	 * Getter for fname01p attribute.
	 * @return fname01p attribute
	 */
	public String getFname01p() {
		return fname01p.getValue();
	}

	/**
	 * Setter for fname01p attribute.
	 * @param fname01p the new value of fname01p
	 */
	public void setFname01p(String fname01p) {
		this.fname01p.setValue(fname01p);
	}
	/**
	 * Gets the reference for attribute fname01h.
	 * @return the fname01h attribute reference
	 */
	public ElementaryRangeReference getFname01hReference() {
		return fname01h.getReference();
	}

	/**
	 * Getter for fname01h attribute.
	 * @return fname01h attribute
	 */
	public String getFname01h() {
		return fname01h.getValue();
	}

	/**
	 * Setter for fname01h attribute.
	 * @param fname01h the new value of fname01h
	 */
	public void setFname01h(String fname01h) {
		this.fname01h.setValue(fname01h);
	}
	/**
	 * Gets the reference for attribute fname01v.
	 * @return the fname01v attribute reference
	 */
	public ElementaryRangeReference getFname01vReference() {
		return fname01v.getReference();
	}

	/**
	 * Getter for fname01v attribute.
	 * @return fname01v attribute
	 */
	public String getFname01v() {
		return fname01v.getValue();
	}

	/**
	 * Setter for fname01v attribute.
	 * @param fname01v the new value of fname01v
	 */
	public void setFname01v(String fname01v) {
		this.fname01v.setValue(fname01v);
	}
	/**
	 * Gets the reference for attribute fname01o.
	 * @return the fname01o attribute reference
	 */
	public ElementaryRangeReference getFname01oReference() {
		return fname01o.getReference();
	}

	/**
	 * Getter for fname01o attribute.
	 * @return fname01o attribute
	 */
	public String getFname01o() {
		return fname01o.getValue();
	}

	/**
	 * Setter for fname01o attribute.
	 * @param fname01o the new value of fname01o
	 */
	public void setFname01o(String fname01o) {
		this.fname01o.setValue(fname01o);
	}
	/**
	 * Gets the reference for attribute lname01c.
	 * @return the lname01c attribute reference
	 */
	public ElementaryRangeReference getLname01cReference() {
		return lname01c.getReference();
	}

	/**
	 * Getter for lname01c attribute.
	 * @return lname01c attribute
	 */
	public String getLname01c() {
		return lname01c.getValue();
	}

	/**
	 * Setter for lname01c attribute.
	 * @param lname01c the new value of lname01c
	 */
	public void setLname01c(String lname01c) {
		this.lname01c.setValue(lname01c);
	}
	/**
	 * Gets the reference for attribute lname01p.
	 * @return the lname01p attribute reference
	 */
	public ElementaryRangeReference getLname01pReference() {
		return lname01p.getReference();
	}

	/**
	 * Getter for lname01p attribute.
	 * @return lname01p attribute
	 */
	public String getLname01p() {
		return lname01p.getValue();
	}

	/**
	 * Setter for lname01p attribute.
	 * @param lname01p the new value of lname01p
	 */
	public void setLname01p(String lname01p) {
		this.lname01p.setValue(lname01p);
	}
	/**
	 * Gets the reference for attribute lname01h.
	 * @return the lname01h attribute reference
	 */
	public ElementaryRangeReference getLname01hReference() {
		return lname01h.getReference();
	}

	/**
	 * Getter for lname01h attribute.
	 * @return lname01h attribute
	 */
	public String getLname01h() {
		return lname01h.getValue();
	}

	/**
	 * Setter for lname01h attribute.
	 * @param lname01h the new value of lname01h
	 */
	public void setLname01h(String lname01h) {
		this.lname01h.setValue(lname01h);
	}
	/**
	 * Gets the reference for attribute lname01v.
	 * @return the lname01v attribute reference
	 */
	public ElementaryRangeReference getLname01vReference() {
		return lname01v.getReference();
	}

	/**
	 * Getter for lname01v attribute.
	 * @return lname01v attribute
	 */
	public String getLname01v() {
		return lname01v.getValue();
	}

	/**
	 * Setter for lname01v attribute.
	 * @param lname01v the new value of lname01v
	 */
	public void setLname01v(String lname01v) {
		this.lname01v.setValue(lname01v);
	}
	/**
	 * Gets the reference for attribute lname01o.
	 * @return the lname01o attribute reference
	 */
	public ElementaryRangeReference getLname01oReference() {
		return lname01o.getReference();
	}

	/**
	 * Getter for lname01o attribute.
	 * @return lname01o attribute
	 */
	public String getLname01o() {
		return lname01o.getValue();
	}

	/**
	 * Setter for lname01o attribute.
	 * @param lname01o the new value of lname01o
	 */
	public void setLname01o(String lname01o) {
		this.lname01o.setValue(lname01o);
	}
	/**
	 * Gets the reference for attribute utype01c.
	 * @return the utype01c attribute reference
	 */
	public ElementaryRangeReference getUtype01cReference() {
		return utype01c.getReference();
	}

	/**
	 * Getter for utype01c attribute.
	 * @return utype01c attribute
	 */
	public String getUtype01c() {
		return utype01c.getValue();
	}

	/**
	 * Setter for utype01c attribute.
	 * @param utype01c the new value of utype01c
	 */
	public void setUtype01c(String utype01c) {
		this.utype01c.setValue(utype01c);
	}
	/**
	 * Gets the reference for attribute utype01p.
	 * @return the utype01p attribute reference
	 */
	public ElementaryRangeReference getUtype01pReference() {
		return utype01p.getReference();
	}

	/**
	 * Getter for utype01p attribute.
	 * @return utype01p attribute
	 */
	public String getUtype01p() {
		return utype01p.getValue();
	}

	/**
	 * Setter for utype01p attribute.
	 * @param utype01p the new value of utype01p
	 */
	public void setUtype01p(String utype01p) {
		this.utype01p.setValue(utype01p);
	}
	/**
	 * Gets the reference for attribute utype01h.
	 * @return the utype01h attribute reference
	 */
	public ElementaryRangeReference getUtype01hReference() {
		return utype01h.getReference();
	}

	/**
	 * Getter for utype01h attribute.
	 * @return utype01h attribute
	 */
	public String getUtype01h() {
		return utype01h.getValue();
	}

	/**
	 * Setter for utype01h attribute.
	 * @param utype01h the new value of utype01h
	 */
	public void setUtype01h(String utype01h) {
		this.utype01h.setValue(utype01h);
	}
	/**
	 * Gets the reference for attribute utype01v.
	 * @return the utype01v attribute reference
	 */
	public ElementaryRangeReference getUtype01vReference() {
		return utype01v.getReference();
	}

	/**
	 * Getter for utype01v attribute.
	 * @return utype01v attribute
	 */
	public String getUtype01v() {
		return utype01v.getValue();
	}

	/**
	 * Setter for utype01v attribute.
	 * @param utype01v the new value of utype01v
	 */
	public void setUtype01v(String utype01v) {
		this.utype01v.setValue(utype01v);
	}
	/**
	 * Gets the reference for attribute utype01o.
	 * @return the utype01o attribute reference
	 */
	public ElementaryRangeReference getUtype01oReference() {
		return utype01o.getReference();
	}

	/**
	 * Getter for utype01o attribute.
	 * @return utype01o attribute
	 */
	public String getUtype01o() {
		return utype01o.getValue();
	}

	/**
	 * Setter for utype01o attribute.
	 * @param utype01o the new value of utype01o
	 */
	public void setUtype01o(String utype01o) {
		this.utype01o.setValue(utype01o);
	}
	/**
	 * Gets the reference for attribute sel0002c.
	 * @return the sel0002c attribute reference
	 */
	public ElementaryRangeReference getSel0002cReference() {
		return sel0002c.getReference();
	}

	/**
	 * Getter for sel0002c attribute.
	 * @return sel0002c attribute
	 */
	public String getSel0002c() {
		return sel0002c.getValue();
	}

	/**
	 * Setter for sel0002c attribute.
	 * @param sel0002c the new value of sel0002c
	 */
	public void setSel0002c(String sel0002c) {
		this.sel0002c.setValue(sel0002c);
	}
	/**
	 * Gets the reference for attribute sel0002p.
	 * @return the sel0002p attribute reference
	 */
	public ElementaryRangeReference getSel0002pReference() {
		return sel0002p.getReference();
	}

	/**
	 * Getter for sel0002p attribute.
	 * @return sel0002p attribute
	 */
	public String getSel0002p() {
		return sel0002p.getValue();
	}

	/**
	 * Setter for sel0002p attribute.
	 * @param sel0002p the new value of sel0002p
	 */
	public void setSel0002p(String sel0002p) {
		this.sel0002p.setValue(sel0002p);
	}
	/**
	 * Gets the reference for attribute sel0002h.
	 * @return the sel0002h attribute reference
	 */
	public ElementaryRangeReference getSel0002hReference() {
		return sel0002h.getReference();
	}

	/**
	 * Getter for sel0002h attribute.
	 * @return sel0002h attribute
	 */
	public String getSel0002h() {
		return sel0002h.getValue();
	}

	/**
	 * Setter for sel0002h attribute.
	 * @param sel0002h the new value of sel0002h
	 */
	public void setSel0002h(String sel0002h) {
		this.sel0002h.setValue(sel0002h);
	}
	/**
	 * Gets the reference for attribute sel0002v.
	 * @return the sel0002v attribute reference
	 */
	public ElementaryRangeReference getSel0002vReference() {
		return sel0002v.getReference();
	}

	/**
	 * Getter for sel0002v attribute.
	 * @return sel0002v attribute
	 */
	public String getSel0002v() {
		return sel0002v.getValue();
	}

	/**
	 * Setter for sel0002v attribute.
	 * @param sel0002v the new value of sel0002v
	 */
	public void setSel0002v(String sel0002v) {
		this.sel0002v.setValue(sel0002v);
	}
	/**
	 * Gets the reference for attribute sel0002o.
	 * @return the sel0002o attribute reference
	 */
	public ElementaryRangeReference getSel0002oReference() {
		return sel0002o.getReference();
	}

	/**
	 * Getter for sel0002o attribute.
	 * @return sel0002o attribute
	 */
	public String getSel0002o() {
		return sel0002o.getValue();
	}

	/**
	 * Setter for sel0002o attribute.
	 * @param sel0002o the new value of sel0002o
	 */
	public void setSel0002o(String sel0002o) {
		this.sel0002o.setValue(sel0002o);
	}
	/**
	 * Gets the reference for attribute usrid02c.
	 * @return the usrid02c attribute reference
	 */
	public ElementaryRangeReference getUsrid02cReference() {
		return usrid02c.getReference();
	}

	/**
	 * Getter for usrid02c attribute.
	 * @return usrid02c attribute
	 */
	public String getUsrid02c() {
		return usrid02c.getValue();
	}

	/**
	 * Setter for usrid02c attribute.
	 * @param usrid02c the new value of usrid02c
	 */
	public void setUsrid02c(String usrid02c) {
		this.usrid02c.setValue(usrid02c);
	}
	/**
	 * Gets the reference for attribute usrid02p.
	 * @return the usrid02p attribute reference
	 */
	public ElementaryRangeReference getUsrid02pReference() {
		return usrid02p.getReference();
	}

	/**
	 * Getter for usrid02p attribute.
	 * @return usrid02p attribute
	 */
	public String getUsrid02p() {
		return usrid02p.getValue();
	}

	/**
	 * Setter for usrid02p attribute.
	 * @param usrid02p the new value of usrid02p
	 */
	public void setUsrid02p(String usrid02p) {
		this.usrid02p.setValue(usrid02p);
	}
	/**
	 * Gets the reference for attribute usrid02h.
	 * @return the usrid02h attribute reference
	 */
	public ElementaryRangeReference getUsrid02hReference() {
		return usrid02h.getReference();
	}

	/**
	 * Getter for usrid02h attribute.
	 * @return usrid02h attribute
	 */
	public String getUsrid02h() {
		return usrid02h.getValue();
	}

	/**
	 * Setter for usrid02h attribute.
	 * @param usrid02h the new value of usrid02h
	 */
	public void setUsrid02h(String usrid02h) {
		this.usrid02h.setValue(usrid02h);
	}
	/**
	 * Gets the reference for attribute usrid02v.
	 * @return the usrid02v attribute reference
	 */
	public ElementaryRangeReference getUsrid02vReference() {
		return usrid02v.getReference();
	}

	/**
	 * Getter for usrid02v attribute.
	 * @return usrid02v attribute
	 */
	public String getUsrid02v() {
		return usrid02v.getValue();
	}

	/**
	 * Setter for usrid02v attribute.
	 * @param usrid02v the new value of usrid02v
	 */
	public void setUsrid02v(String usrid02v) {
		this.usrid02v.setValue(usrid02v);
	}
	/**
	 * Gets the reference for attribute usrid02o.
	 * @return the usrid02o attribute reference
	 */
	public ElementaryRangeReference getUsrid02oReference() {
		return usrid02o.getReference();
	}

	/**
	 * Getter for usrid02o attribute.
	 * @return usrid02o attribute
	 */
	public String getUsrid02o() {
		return usrid02o.getValue();
	}

	/**
	 * Setter for usrid02o attribute.
	 * @param usrid02o the new value of usrid02o
	 */
	public void setUsrid02o(String usrid02o) {
		this.usrid02o.setValue(usrid02o);
	}
	/**
	 * Gets the reference for attribute fname02c.
	 * @return the fname02c attribute reference
	 */
	public ElementaryRangeReference getFname02cReference() {
		return fname02c.getReference();
	}

	/**
	 * Getter for fname02c attribute.
	 * @return fname02c attribute
	 */
	public String getFname02c() {
		return fname02c.getValue();
	}

	/**
	 * Setter for fname02c attribute.
	 * @param fname02c the new value of fname02c
	 */
	public void setFname02c(String fname02c) {
		this.fname02c.setValue(fname02c);
	}
	/**
	 * Gets the reference for attribute fname02p.
	 * @return the fname02p attribute reference
	 */
	public ElementaryRangeReference getFname02pReference() {
		return fname02p.getReference();
	}

	/**
	 * Getter for fname02p attribute.
	 * @return fname02p attribute
	 */
	public String getFname02p() {
		return fname02p.getValue();
	}

	/**
	 * Setter for fname02p attribute.
	 * @param fname02p the new value of fname02p
	 */
	public void setFname02p(String fname02p) {
		this.fname02p.setValue(fname02p);
	}
	/**
	 * Gets the reference for attribute fname02h.
	 * @return the fname02h attribute reference
	 */
	public ElementaryRangeReference getFname02hReference() {
		return fname02h.getReference();
	}

	/**
	 * Getter for fname02h attribute.
	 * @return fname02h attribute
	 */
	public String getFname02h() {
		return fname02h.getValue();
	}

	/**
	 * Setter for fname02h attribute.
	 * @param fname02h the new value of fname02h
	 */
	public void setFname02h(String fname02h) {
		this.fname02h.setValue(fname02h);
	}
	/**
	 * Gets the reference for attribute fname02v.
	 * @return the fname02v attribute reference
	 */
	public ElementaryRangeReference getFname02vReference() {
		return fname02v.getReference();
	}

	/**
	 * Getter for fname02v attribute.
	 * @return fname02v attribute
	 */
	public String getFname02v() {
		return fname02v.getValue();
	}

	/**
	 * Setter for fname02v attribute.
	 * @param fname02v the new value of fname02v
	 */
	public void setFname02v(String fname02v) {
		this.fname02v.setValue(fname02v);
	}
	/**
	 * Gets the reference for attribute fname02o.
	 * @return the fname02o attribute reference
	 */
	public ElementaryRangeReference getFname02oReference() {
		return fname02o.getReference();
	}

	/**
	 * Getter for fname02o attribute.
	 * @return fname02o attribute
	 */
	public String getFname02o() {
		return fname02o.getValue();
	}

	/**
	 * Setter for fname02o attribute.
	 * @param fname02o the new value of fname02o
	 */
	public void setFname02o(String fname02o) {
		this.fname02o.setValue(fname02o);
	}
	/**
	 * Gets the reference for attribute lname02c.
	 * @return the lname02c attribute reference
	 */
	public ElementaryRangeReference getLname02cReference() {
		return lname02c.getReference();
	}

	/**
	 * Getter for lname02c attribute.
	 * @return lname02c attribute
	 */
	public String getLname02c() {
		return lname02c.getValue();
	}

	/**
	 * Setter for lname02c attribute.
	 * @param lname02c the new value of lname02c
	 */
	public void setLname02c(String lname02c) {
		this.lname02c.setValue(lname02c);
	}
	/**
	 * Gets the reference for attribute lname02p.
	 * @return the lname02p attribute reference
	 */
	public ElementaryRangeReference getLname02pReference() {
		return lname02p.getReference();
	}

	/**
	 * Getter for lname02p attribute.
	 * @return lname02p attribute
	 */
	public String getLname02p() {
		return lname02p.getValue();
	}

	/**
	 * Setter for lname02p attribute.
	 * @param lname02p the new value of lname02p
	 */
	public void setLname02p(String lname02p) {
		this.lname02p.setValue(lname02p);
	}
	/**
	 * Gets the reference for attribute lname02h.
	 * @return the lname02h attribute reference
	 */
	public ElementaryRangeReference getLname02hReference() {
		return lname02h.getReference();
	}

	/**
	 * Getter for lname02h attribute.
	 * @return lname02h attribute
	 */
	public String getLname02h() {
		return lname02h.getValue();
	}

	/**
	 * Setter for lname02h attribute.
	 * @param lname02h the new value of lname02h
	 */
	public void setLname02h(String lname02h) {
		this.lname02h.setValue(lname02h);
	}
	/**
	 * Gets the reference for attribute lname02v.
	 * @return the lname02v attribute reference
	 */
	public ElementaryRangeReference getLname02vReference() {
		return lname02v.getReference();
	}

	/**
	 * Getter for lname02v attribute.
	 * @return lname02v attribute
	 */
	public String getLname02v() {
		return lname02v.getValue();
	}

	/**
	 * Setter for lname02v attribute.
	 * @param lname02v the new value of lname02v
	 */
	public void setLname02v(String lname02v) {
		this.lname02v.setValue(lname02v);
	}
	/**
	 * Gets the reference for attribute lname02o.
	 * @return the lname02o attribute reference
	 */
	public ElementaryRangeReference getLname02oReference() {
		return lname02o.getReference();
	}

	/**
	 * Getter for lname02o attribute.
	 * @return lname02o attribute
	 */
	public String getLname02o() {
		return lname02o.getValue();
	}

	/**
	 * Setter for lname02o attribute.
	 * @param lname02o the new value of lname02o
	 */
	public void setLname02o(String lname02o) {
		this.lname02o.setValue(lname02o);
	}
	/**
	 * Gets the reference for attribute utype02c.
	 * @return the utype02c attribute reference
	 */
	public ElementaryRangeReference getUtype02cReference() {
		return utype02c.getReference();
	}

	/**
	 * Getter for utype02c attribute.
	 * @return utype02c attribute
	 */
	public String getUtype02c() {
		return utype02c.getValue();
	}

	/**
	 * Setter for utype02c attribute.
	 * @param utype02c the new value of utype02c
	 */
	public void setUtype02c(String utype02c) {
		this.utype02c.setValue(utype02c);
	}
	/**
	 * Gets the reference for attribute utype02p.
	 * @return the utype02p attribute reference
	 */
	public ElementaryRangeReference getUtype02pReference() {
		return utype02p.getReference();
	}

	/**
	 * Getter for utype02p attribute.
	 * @return utype02p attribute
	 */
	public String getUtype02p() {
		return utype02p.getValue();
	}

	/**
	 * Setter for utype02p attribute.
	 * @param utype02p the new value of utype02p
	 */
	public void setUtype02p(String utype02p) {
		this.utype02p.setValue(utype02p);
	}
	/**
	 * Gets the reference for attribute utype02h.
	 * @return the utype02h attribute reference
	 */
	public ElementaryRangeReference getUtype02hReference() {
		return utype02h.getReference();
	}

	/**
	 * Getter for utype02h attribute.
	 * @return utype02h attribute
	 */
	public String getUtype02h() {
		return utype02h.getValue();
	}

	/**
	 * Setter for utype02h attribute.
	 * @param utype02h the new value of utype02h
	 */
	public void setUtype02h(String utype02h) {
		this.utype02h.setValue(utype02h);
	}
	/**
	 * Gets the reference for attribute utype02v.
	 * @return the utype02v attribute reference
	 */
	public ElementaryRangeReference getUtype02vReference() {
		return utype02v.getReference();
	}

	/**
	 * Getter for utype02v attribute.
	 * @return utype02v attribute
	 */
	public String getUtype02v() {
		return utype02v.getValue();
	}

	/**
	 * Setter for utype02v attribute.
	 * @param utype02v the new value of utype02v
	 */
	public void setUtype02v(String utype02v) {
		this.utype02v.setValue(utype02v);
	}
	/**
	 * Gets the reference for attribute utype02o.
	 * @return the utype02o attribute reference
	 */
	public ElementaryRangeReference getUtype02oReference() {
		return utype02o.getReference();
	}

	/**
	 * Getter for utype02o attribute.
	 * @return utype02o attribute
	 */
	public String getUtype02o() {
		return utype02o.getValue();
	}

	/**
	 * Setter for utype02o attribute.
	 * @param utype02o the new value of utype02o
	 */
	public void setUtype02o(String utype02o) {
		this.utype02o.setValue(utype02o);
	}
	/**
	 * Gets the reference for attribute sel0003c.
	 * @return the sel0003c attribute reference
	 */
	public ElementaryRangeReference getSel0003cReference() {
		return sel0003c.getReference();
	}

	/**
	 * Getter for sel0003c attribute.
	 * @return sel0003c attribute
	 */
	public String getSel0003c() {
		return sel0003c.getValue();
	}

	/**
	 * Setter for sel0003c attribute.
	 * @param sel0003c the new value of sel0003c
	 */
	public void setSel0003c(String sel0003c) {
		this.sel0003c.setValue(sel0003c);
	}
	/**
	 * Gets the reference for attribute sel0003p.
	 * @return the sel0003p attribute reference
	 */
	public ElementaryRangeReference getSel0003pReference() {
		return sel0003p.getReference();
	}

	/**
	 * Getter for sel0003p attribute.
	 * @return sel0003p attribute
	 */
	public String getSel0003p() {
		return sel0003p.getValue();
	}

	/**
	 * Setter for sel0003p attribute.
	 * @param sel0003p the new value of sel0003p
	 */
	public void setSel0003p(String sel0003p) {
		this.sel0003p.setValue(sel0003p);
	}
	/**
	 * Gets the reference for attribute sel0003h.
	 * @return the sel0003h attribute reference
	 */
	public ElementaryRangeReference getSel0003hReference() {
		return sel0003h.getReference();
	}

	/**
	 * Getter for sel0003h attribute.
	 * @return sel0003h attribute
	 */
	public String getSel0003h() {
		return sel0003h.getValue();
	}

	/**
	 * Setter for sel0003h attribute.
	 * @param sel0003h the new value of sel0003h
	 */
	public void setSel0003h(String sel0003h) {
		this.sel0003h.setValue(sel0003h);
	}
	/**
	 * Gets the reference for attribute sel0003v.
	 * @return the sel0003v attribute reference
	 */
	public ElementaryRangeReference getSel0003vReference() {
		return sel0003v.getReference();
	}

	/**
	 * Getter for sel0003v attribute.
	 * @return sel0003v attribute
	 */
	public String getSel0003v() {
		return sel0003v.getValue();
	}

	/**
	 * Setter for sel0003v attribute.
	 * @param sel0003v the new value of sel0003v
	 */
	public void setSel0003v(String sel0003v) {
		this.sel0003v.setValue(sel0003v);
	}
	/**
	 * Gets the reference for attribute sel0003o.
	 * @return the sel0003o attribute reference
	 */
	public ElementaryRangeReference getSel0003oReference() {
		return sel0003o.getReference();
	}

	/**
	 * Getter for sel0003o attribute.
	 * @return sel0003o attribute
	 */
	public String getSel0003o() {
		return sel0003o.getValue();
	}

	/**
	 * Setter for sel0003o attribute.
	 * @param sel0003o the new value of sel0003o
	 */
	public void setSel0003o(String sel0003o) {
		this.sel0003o.setValue(sel0003o);
	}
	/**
	 * Gets the reference for attribute usrid03c.
	 * @return the usrid03c attribute reference
	 */
	public ElementaryRangeReference getUsrid03cReference() {
		return usrid03c.getReference();
	}

	/**
	 * Getter for usrid03c attribute.
	 * @return usrid03c attribute
	 */
	public String getUsrid03c() {
		return usrid03c.getValue();
	}

	/**
	 * Setter for usrid03c attribute.
	 * @param usrid03c the new value of usrid03c
	 */
	public void setUsrid03c(String usrid03c) {
		this.usrid03c.setValue(usrid03c);
	}
	/**
	 * Gets the reference for attribute usrid03p.
	 * @return the usrid03p attribute reference
	 */
	public ElementaryRangeReference getUsrid03pReference() {
		return usrid03p.getReference();
	}

	/**
	 * Getter for usrid03p attribute.
	 * @return usrid03p attribute
	 */
	public String getUsrid03p() {
		return usrid03p.getValue();
	}

	/**
	 * Setter for usrid03p attribute.
	 * @param usrid03p the new value of usrid03p
	 */
	public void setUsrid03p(String usrid03p) {
		this.usrid03p.setValue(usrid03p);
	}
	/**
	 * Gets the reference for attribute usrid03h.
	 * @return the usrid03h attribute reference
	 */
	public ElementaryRangeReference getUsrid03hReference() {
		return usrid03h.getReference();
	}

	/**
	 * Getter for usrid03h attribute.
	 * @return usrid03h attribute
	 */
	public String getUsrid03h() {
		return usrid03h.getValue();
	}

	/**
	 * Setter for usrid03h attribute.
	 * @param usrid03h the new value of usrid03h
	 */
	public void setUsrid03h(String usrid03h) {
		this.usrid03h.setValue(usrid03h);
	}
	/**
	 * Gets the reference for attribute usrid03v.
	 * @return the usrid03v attribute reference
	 */
	public ElementaryRangeReference getUsrid03vReference() {
		return usrid03v.getReference();
	}

	/**
	 * Getter for usrid03v attribute.
	 * @return usrid03v attribute
	 */
	public String getUsrid03v() {
		return usrid03v.getValue();
	}

	/**
	 * Setter for usrid03v attribute.
	 * @param usrid03v the new value of usrid03v
	 */
	public void setUsrid03v(String usrid03v) {
		this.usrid03v.setValue(usrid03v);
	}
	/**
	 * Gets the reference for attribute usrid03o.
	 * @return the usrid03o attribute reference
	 */
	public ElementaryRangeReference getUsrid03oReference() {
		return usrid03o.getReference();
	}

	/**
	 * Getter for usrid03o attribute.
	 * @return usrid03o attribute
	 */
	public String getUsrid03o() {
		return usrid03o.getValue();
	}

	/**
	 * Setter for usrid03o attribute.
	 * @param usrid03o the new value of usrid03o
	 */
	public void setUsrid03o(String usrid03o) {
		this.usrid03o.setValue(usrid03o);
	}
	/**
	 * Gets the reference for attribute fname03c.
	 * @return the fname03c attribute reference
	 */
	public ElementaryRangeReference getFname03cReference() {
		return fname03c.getReference();
	}

	/**
	 * Getter for fname03c attribute.
	 * @return fname03c attribute
	 */
	public String getFname03c() {
		return fname03c.getValue();
	}

	/**
	 * Setter for fname03c attribute.
	 * @param fname03c the new value of fname03c
	 */
	public void setFname03c(String fname03c) {
		this.fname03c.setValue(fname03c);
	}
	/**
	 * Gets the reference for attribute fname03p.
	 * @return the fname03p attribute reference
	 */
	public ElementaryRangeReference getFname03pReference() {
		return fname03p.getReference();
	}

	/**
	 * Getter for fname03p attribute.
	 * @return fname03p attribute
	 */
	public String getFname03p() {
		return fname03p.getValue();
	}

	/**
	 * Setter for fname03p attribute.
	 * @param fname03p the new value of fname03p
	 */
	public void setFname03p(String fname03p) {
		this.fname03p.setValue(fname03p);
	}
	/**
	 * Gets the reference for attribute fname03h.
	 * @return the fname03h attribute reference
	 */
	public ElementaryRangeReference getFname03hReference() {
		return fname03h.getReference();
	}

	/**
	 * Getter for fname03h attribute.
	 * @return fname03h attribute
	 */
	public String getFname03h() {
		return fname03h.getValue();
	}

	/**
	 * Setter for fname03h attribute.
	 * @param fname03h the new value of fname03h
	 */
	public void setFname03h(String fname03h) {
		this.fname03h.setValue(fname03h);
	}
	/**
	 * Gets the reference for attribute fname03v.
	 * @return the fname03v attribute reference
	 */
	public ElementaryRangeReference getFname03vReference() {
		return fname03v.getReference();
	}

	/**
	 * Getter for fname03v attribute.
	 * @return fname03v attribute
	 */
	public String getFname03v() {
		return fname03v.getValue();
	}

	/**
	 * Setter for fname03v attribute.
	 * @param fname03v the new value of fname03v
	 */
	public void setFname03v(String fname03v) {
		this.fname03v.setValue(fname03v);
	}
	/**
	 * Gets the reference for attribute fname03o.
	 * @return the fname03o attribute reference
	 */
	public ElementaryRangeReference getFname03oReference() {
		return fname03o.getReference();
	}

	/**
	 * Getter for fname03o attribute.
	 * @return fname03o attribute
	 */
	public String getFname03o() {
		return fname03o.getValue();
	}

	/**
	 * Setter for fname03o attribute.
	 * @param fname03o the new value of fname03o
	 */
	public void setFname03o(String fname03o) {
		this.fname03o.setValue(fname03o);
	}
	/**
	 * Gets the reference for attribute lname03c.
	 * @return the lname03c attribute reference
	 */
	public ElementaryRangeReference getLname03cReference() {
		return lname03c.getReference();
	}

	/**
	 * Getter for lname03c attribute.
	 * @return lname03c attribute
	 */
	public String getLname03c() {
		return lname03c.getValue();
	}

	/**
	 * Setter for lname03c attribute.
	 * @param lname03c the new value of lname03c
	 */
	public void setLname03c(String lname03c) {
		this.lname03c.setValue(lname03c);
	}
	/**
	 * Gets the reference for attribute lname03p.
	 * @return the lname03p attribute reference
	 */
	public ElementaryRangeReference getLname03pReference() {
		return lname03p.getReference();
	}

	/**
	 * Getter for lname03p attribute.
	 * @return lname03p attribute
	 */
	public String getLname03p() {
		return lname03p.getValue();
	}

	/**
	 * Setter for lname03p attribute.
	 * @param lname03p the new value of lname03p
	 */
	public void setLname03p(String lname03p) {
		this.lname03p.setValue(lname03p);
	}
	/**
	 * Gets the reference for attribute lname03h.
	 * @return the lname03h attribute reference
	 */
	public ElementaryRangeReference getLname03hReference() {
		return lname03h.getReference();
	}

	/**
	 * Getter for lname03h attribute.
	 * @return lname03h attribute
	 */
	public String getLname03h() {
		return lname03h.getValue();
	}

	/**
	 * Setter for lname03h attribute.
	 * @param lname03h the new value of lname03h
	 */
	public void setLname03h(String lname03h) {
		this.lname03h.setValue(lname03h);
	}
	/**
	 * Gets the reference for attribute lname03v.
	 * @return the lname03v attribute reference
	 */
	public ElementaryRangeReference getLname03vReference() {
		return lname03v.getReference();
	}

	/**
	 * Getter for lname03v attribute.
	 * @return lname03v attribute
	 */
	public String getLname03v() {
		return lname03v.getValue();
	}

	/**
	 * Setter for lname03v attribute.
	 * @param lname03v the new value of lname03v
	 */
	public void setLname03v(String lname03v) {
		this.lname03v.setValue(lname03v);
	}
	/**
	 * Gets the reference for attribute lname03o.
	 * @return the lname03o attribute reference
	 */
	public ElementaryRangeReference getLname03oReference() {
		return lname03o.getReference();
	}

	/**
	 * Getter for lname03o attribute.
	 * @return lname03o attribute
	 */
	public String getLname03o() {
		return lname03o.getValue();
	}

	/**
	 * Setter for lname03o attribute.
	 * @param lname03o the new value of lname03o
	 */
	public void setLname03o(String lname03o) {
		this.lname03o.setValue(lname03o);
	}
	/**
	 * Gets the reference for attribute utype03c.
	 * @return the utype03c attribute reference
	 */
	public ElementaryRangeReference getUtype03cReference() {
		return utype03c.getReference();
	}

	/**
	 * Getter for utype03c attribute.
	 * @return utype03c attribute
	 */
	public String getUtype03c() {
		return utype03c.getValue();
	}

	/**
	 * Setter for utype03c attribute.
	 * @param utype03c the new value of utype03c
	 */
	public void setUtype03c(String utype03c) {
		this.utype03c.setValue(utype03c);
	}
	/**
	 * Gets the reference for attribute utype03p.
	 * @return the utype03p attribute reference
	 */
	public ElementaryRangeReference getUtype03pReference() {
		return utype03p.getReference();
	}

	/**
	 * Getter for utype03p attribute.
	 * @return utype03p attribute
	 */
	public String getUtype03p() {
		return utype03p.getValue();
	}

	/**
	 * Setter for utype03p attribute.
	 * @param utype03p the new value of utype03p
	 */
	public void setUtype03p(String utype03p) {
		this.utype03p.setValue(utype03p);
	}
	/**
	 * Gets the reference for attribute utype03h.
	 * @return the utype03h attribute reference
	 */
	public ElementaryRangeReference getUtype03hReference() {
		return utype03h.getReference();
	}

	/**
	 * Getter for utype03h attribute.
	 * @return utype03h attribute
	 */
	public String getUtype03h() {
		return utype03h.getValue();
	}

	/**
	 * Setter for utype03h attribute.
	 * @param utype03h the new value of utype03h
	 */
	public void setUtype03h(String utype03h) {
		this.utype03h.setValue(utype03h);
	}
	/**
	 * Gets the reference for attribute utype03v.
	 * @return the utype03v attribute reference
	 */
	public ElementaryRangeReference getUtype03vReference() {
		return utype03v.getReference();
	}

	/**
	 * Getter for utype03v attribute.
	 * @return utype03v attribute
	 */
	public String getUtype03v() {
		return utype03v.getValue();
	}

	/**
	 * Setter for utype03v attribute.
	 * @param utype03v the new value of utype03v
	 */
	public void setUtype03v(String utype03v) {
		this.utype03v.setValue(utype03v);
	}
	/**
	 * Gets the reference for attribute utype03o.
	 * @return the utype03o attribute reference
	 */
	public ElementaryRangeReference getUtype03oReference() {
		return utype03o.getReference();
	}

	/**
	 * Getter for utype03o attribute.
	 * @return utype03o attribute
	 */
	public String getUtype03o() {
		return utype03o.getValue();
	}

	/**
	 * Setter for utype03o attribute.
	 * @param utype03o the new value of utype03o
	 */
	public void setUtype03o(String utype03o) {
		this.utype03o.setValue(utype03o);
	}
	/**
	 * Gets the reference for attribute sel0004c.
	 * @return the sel0004c attribute reference
	 */
	public ElementaryRangeReference getSel0004cReference() {
		return sel0004c.getReference();
	}

	/**
	 * Getter for sel0004c attribute.
	 * @return sel0004c attribute
	 */
	public String getSel0004c() {
		return sel0004c.getValue();
	}

	/**
	 * Setter for sel0004c attribute.
	 * @param sel0004c the new value of sel0004c
	 */
	public void setSel0004c(String sel0004c) {
		this.sel0004c.setValue(sel0004c);
	}
	/**
	 * Gets the reference for attribute sel0004p.
	 * @return the sel0004p attribute reference
	 */
	public ElementaryRangeReference getSel0004pReference() {
		return sel0004p.getReference();
	}

	/**
	 * Getter for sel0004p attribute.
	 * @return sel0004p attribute
	 */
	public String getSel0004p() {
		return sel0004p.getValue();
	}

	/**
	 * Setter for sel0004p attribute.
	 * @param sel0004p the new value of sel0004p
	 */
	public void setSel0004p(String sel0004p) {
		this.sel0004p.setValue(sel0004p);
	}
	/**
	 * Gets the reference for attribute sel0004h.
	 * @return the sel0004h attribute reference
	 */
	public ElementaryRangeReference getSel0004hReference() {
		return sel0004h.getReference();
	}

	/**
	 * Getter for sel0004h attribute.
	 * @return sel0004h attribute
	 */
	public String getSel0004h() {
		return sel0004h.getValue();
	}

	/**
	 * Setter for sel0004h attribute.
	 * @param sel0004h the new value of sel0004h
	 */
	public void setSel0004h(String sel0004h) {
		this.sel0004h.setValue(sel0004h);
	}
	/**
	 * Gets the reference for attribute sel0004v.
	 * @return the sel0004v attribute reference
	 */
	public ElementaryRangeReference getSel0004vReference() {
		return sel0004v.getReference();
	}

	/**
	 * Getter for sel0004v attribute.
	 * @return sel0004v attribute
	 */
	public String getSel0004v() {
		return sel0004v.getValue();
	}

	/**
	 * Setter for sel0004v attribute.
	 * @param sel0004v the new value of sel0004v
	 */
	public void setSel0004v(String sel0004v) {
		this.sel0004v.setValue(sel0004v);
	}
	/**
	 * Gets the reference for attribute sel0004o.
	 * @return the sel0004o attribute reference
	 */
	public ElementaryRangeReference getSel0004oReference() {
		return sel0004o.getReference();
	}

	/**
	 * Getter for sel0004o attribute.
	 * @return sel0004o attribute
	 */
	public String getSel0004o() {
		return sel0004o.getValue();
	}

	/**
	 * Setter for sel0004o attribute.
	 * @param sel0004o the new value of sel0004o
	 */
	public void setSel0004o(String sel0004o) {
		this.sel0004o.setValue(sel0004o);
	}
	/**
	 * Gets the reference for attribute usrid04c.
	 * @return the usrid04c attribute reference
	 */
	public ElementaryRangeReference getUsrid04cReference() {
		return usrid04c.getReference();
	}

	/**
	 * Getter for usrid04c attribute.
	 * @return usrid04c attribute
	 */
	public String getUsrid04c() {
		return usrid04c.getValue();
	}

	/**
	 * Setter for usrid04c attribute.
	 * @param usrid04c the new value of usrid04c
	 */
	public void setUsrid04c(String usrid04c) {
		this.usrid04c.setValue(usrid04c);
	}
	/**
	 * Gets the reference for attribute usrid04p.
	 * @return the usrid04p attribute reference
	 */
	public ElementaryRangeReference getUsrid04pReference() {
		return usrid04p.getReference();
	}

	/**
	 * Getter for usrid04p attribute.
	 * @return usrid04p attribute
	 */
	public String getUsrid04p() {
		return usrid04p.getValue();
	}

	/**
	 * Setter for usrid04p attribute.
	 * @param usrid04p the new value of usrid04p
	 */
	public void setUsrid04p(String usrid04p) {
		this.usrid04p.setValue(usrid04p);
	}
	/**
	 * Gets the reference for attribute usrid04h.
	 * @return the usrid04h attribute reference
	 */
	public ElementaryRangeReference getUsrid04hReference() {
		return usrid04h.getReference();
	}

	/**
	 * Getter for usrid04h attribute.
	 * @return usrid04h attribute
	 */
	public String getUsrid04h() {
		return usrid04h.getValue();
	}

	/**
	 * Setter for usrid04h attribute.
	 * @param usrid04h the new value of usrid04h
	 */
	public void setUsrid04h(String usrid04h) {
		this.usrid04h.setValue(usrid04h);
	}
	/**
	 * Gets the reference for attribute usrid04v.
	 * @return the usrid04v attribute reference
	 */
	public ElementaryRangeReference getUsrid04vReference() {
		return usrid04v.getReference();
	}

	/**
	 * Getter for usrid04v attribute.
	 * @return usrid04v attribute
	 */
	public String getUsrid04v() {
		return usrid04v.getValue();
	}

	/**
	 * Setter for usrid04v attribute.
	 * @param usrid04v the new value of usrid04v
	 */
	public void setUsrid04v(String usrid04v) {
		this.usrid04v.setValue(usrid04v);
	}
	/**
	 * Gets the reference for attribute usrid04o.
	 * @return the usrid04o attribute reference
	 */
	public ElementaryRangeReference getUsrid04oReference() {
		return usrid04o.getReference();
	}

	/**
	 * Getter for usrid04o attribute.
	 * @return usrid04o attribute
	 */
	public String getUsrid04o() {
		return usrid04o.getValue();
	}

	/**
	 * Setter for usrid04o attribute.
	 * @param usrid04o the new value of usrid04o
	 */
	public void setUsrid04o(String usrid04o) {
		this.usrid04o.setValue(usrid04o);
	}
	/**
	 * Gets the reference for attribute fname04c.
	 * @return the fname04c attribute reference
	 */
	public ElementaryRangeReference getFname04cReference() {
		return fname04c.getReference();
	}

	/**
	 * Getter for fname04c attribute.
	 * @return fname04c attribute
	 */
	public String getFname04c() {
		return fname04c.getValue();
	}

	/**
	 * Setter for fname04c attribute.
	 * @param fname04c the new value of fname04c
	 */
	public void setFname04c(String fname04c) {
		this.fname04c.setValue(fname04c);
	}
	/**
	 * Gets the reference for attribute fname04p.
	 * @return the fname04p attribute reference
	 */
	public ElementaryRangeReference getFname04pReference() {
		return fname04p.getReference();
	}

	/**
	 * Getter for fname04p attribute.
	 * @return fname04p attribute
	 */
	public String getFname04p() {
		return fname04p.getValue();
	}

	/**
	 * Setter for fname04p attribute.
	 * @param fname04p the new value of fname04p
	 */
	public void setFname04p(String fname04p) {
		this.fname04p.setValue(fname04p);
	}
	/**
	 * Gets the reference for attribute fname04h.
	 * @return the fname04h attribute reference
	 */
	public ElementaryRangeReference getFname04hReference() {
		return fname04h.getReference();
	}

	/**
	 * Getter for fname04h attribute.
	 * @return fname04h attribute
	 */
	public String getFname04h() {
		return fname04h.getValue();
	}

	/**
	 * Setter for fname04h attribute.
	 * @param fname04h the new value of fname04h
	 */
	public void setFname04h(String fname04h) {
		this.fname04h.setValue(fname04h);
	}
	/**
	 * Gets the reference for attribute fname04v.
	 * @return the fname04v attribute reference
	 */
	public ElementaryRangeReference getFname04vReference() {
		return fname04v.getReference();
	}

	/**
	 * Getter for fname04v attribute.
	 * @return fname04v attribute
	 */
	public String getFname04v() {
		return fname04v.getValue();
	}

	/**
	 * Setter for fname04v attribute.
	 * @param fname04v the new value of fname04v
	 */
	public void setFname04v(String fname04v) {
		this.fname04v.setValue(fname04v);
	}
	/**
	 * Gets the reference for attribute fname04o.
	 * @return the fname04o attribute reference
	 */
	public ElementaryRangeReference getFname04oReference() {
		return fname04o.getReference();
	}

	/**
	 * Getter for fname04o attribute.
	 * @return fname04o attribute
	 */
	public String getFname04o() {
		return fname04o.getValue();
	}

	/**
	 * Setter for fname04o attribute.
	 * @param fname04o the new value of fname04o
	 */
	public void setFname04o(String fname04o) {
		this.fname04o.setValue(fname04o);
	}
	/**
	 * Gets the reference for attribute lname04c.
	 * @return the lname04c attribute reference
	 */
	public ElementaryRangeReference getLname04cReference() {
		return lname04c.getReference();
	}

	/**
	 * Getter for lname04c attribute.
	 * @return lname04c attribute
	 */
	public String getLname04c() {
		return lname04c.getValue();
	}

	/**
	 * Setter for lname04c attribute.
	 * @param lname04c the new value of lname04c
	 */
	public void setLname04c(String lname04c) {
		this.lname04c.setValue(lname04c);
	}
	/**
	 * Gets the reference for attribute lname04p.
	 * @return the lname04p attribute reference
	 */
	public ElementaryRangeReference getLname04pReference() {
		return lname04p.getReference();
	}

	/**
	 * Getter for lname04p attribute.
	 * @return lname04p attribute
	 */
	public String getLname04p() {
		return lname04p.getValue();
	}

	/**
	 * Setter for lname04p attribute.
	 * @param lname04p the new value of lname04p
	 */
	public void setLname04p(String lname04p) {
		this.lname04p.setValue(lname04p);
	}
	/**
	 * Gets the reference for attribute lname04h.
	 * @return the lname04h attribute reference
	 */
	public ElementaryRangeReference getLname04hReference() {
		return lname04h.getReference();
	}

	/**
	 * Getter for lname04h attribute.
	 * @return lname04h attribute
	 */
	public String getLname04h() {
		return lname04h.getValue();
	}

	/**
	 * Setter for lname04h attribute.
	 * @param lname04h the new value of lname04h
	 */
	public void setLname04h(String lname04h) {
		this.lname04h.setValue(lname04h);
	}
	/**
	 * Gets the reference for attribute lname04v.
	 * @return the lname04v attribute reference
	 */
	public ElementaryRangeReference getLname04vReference() {
		return lname04v.getReference();
	}

	/**
	 * Getter for lname04v attribute.
	 * @return lname04v attribute
	 */
	public String getLname04v() {
		return lname04v.getValue();
	}

	/**
	 * Setter for lname04v attribute.
	 * @param lname04v the new value of lname04v
	 */
	public void setLname04v(String lname04v) {
		this.lname04v.setValue(lname04v);
	}
	/**
	 * Gets the reference for attribute lname04o.
	 * @return the lname04o attribute reference
	 */
	public ElementaryRangeReference getLname04oReference() {
		return lname04o.getReference();
	}

	/**
	 * Getter for lname04o attribute.
	 * @return lname04o attribute
	 */
	public String getLname04o() {
		return lname04o.getValue();
	}

	/**
	 * Setter for lname04o attribute.
	 * @param lname04o the new value of lname04o
	 */
	public void setLname04o(String lname04o) {
		this.lname04o.setValue(lname04o);
	}
	/**
	 * Gets the reference for attribute utype04c.
	 * @return the utype04c attribute reference
	 */
	public ElementaryRangeReference getUtype04cReference() {
		return utype04c.getReference();
	}

	/**
	 * Getter for utype04c attribute.
	 * @return utype04c attribute
	 */
	public String getUtype04c() {
		return utype04c.getValue();
	}

	/**
	 * Setter for utype04c attribute.
	 * @param utype04c the new value of utype04c
	 */
	public void setUtype04c(String utype04c) {
		this.utype04c.setValue(utype04c);
	}
	/**
	 * Gets the reference for attribute utype04p.
	 * @return the utype04p attribute reference
	 */
	public ElementaryRangeReference getUtype04pReference() {
		return utype04p.getReference();
	}

	/**
	 * Getter for utype04p attribute.
	 * @return utype04p attribute
	 */
	public String getUtype04p() {
		return utype04p.getValue();
	}

	/**
	 * Setter for utype04p attribute.
	 * @param utype04p the new value of utype04p
	 */
	public void setUtype04p(String utype04p) {
		this.utype04p.setValue(utype04p);
	}
	/**
	 * Gets the reference for attribute utype04h.
	 * @return the utype04h attribute reference
	 */
	public ElementaryRangeReference getUtype04hReference() {
		return utype04h.getReference();
	}

	/**
	 * Getter for utype04h attribute.
	 * @return utype04h attribute
	 */
	public String getUtype04h() {
		return utype04h.getValue();
	}

	/**
	 * Setter for utype04h attribute.
	 * @param utype04h the new value of utype04h
	 */
	public void setUtype04h(String utype04h) {
		this.utype04h.setValue(utype04h);
	}
	/**
	 * Gets the reference for attribute utype04v.
	 * @return the utype04v attribute reference
	 */
	public ElementaryRangeReference getUtype04vReference() {
		return utype04v.getReference();
	}

	/**
	 * Getter for utype04v attribute.
	 * @return utype04v attribute
	 */
	public String getUtype04v() {
		return utype04v.getValue();
	}

	/**
	 * Setter for utype04v attribute.
	 * @param utype04v the new value of utype04v
	 */
	public void setUtype04v(String utype04v) {
		this.utype04v.setValue(utype04v);
	}
	/**
	 * Gets the reference for attribute utype04o.
	 * @return the utype04o attribute reference
	 */
	public ElementaryRangeReference getUtype04oReference() {
		return utype04o.getReference();
	}

	/**
	 * Getter for utype04o attribute.
	 * @return utype04o attribute
	 */
	public String getUtype04o() {
		return utype04o.getValue();
	}

	/**
	 * Setter for utype04o attribute.
	 * @param utype04o the new value of utype04o
	 */
	public void setUtype04o(String utype04o) {
		this.utype04o.setValue(utype04o);
	}
	/**
	 * Gets the reference for attribute sel0005c.
	 * @return the sel0005c attribute reference
	 */
	public ElementaryRangeReference getSel0005cReference() {
		return sel0005c.getReference();
	}

	/**
	 * Getter for sel0005c attribute.
	 * @return sel0005c attribute
	 */
	public String getSel0005c() {
		return sel0005c.getValue();
	}

	/**
	 * Setter for sel0005c attribute.
	 * @param sel0005c the new value of sel0005c
	 */
	public void setSel0005c(String sel0005c) {
		this.sel0005c.setValue(sel0005c);
	}
	/**
	 * Gets the reference for attribute sel0005p.
	 * @return the sel0005p attribute reference
	 */
	public ElementaryRangeReference getSel0005pReference() {
		return sel0005p.getReference();
	}

	/**
	 * Getter for sel0005p attribute.
	 * @return sel0005p attribute
	 */
	public String getSel0005p() {
		return sel0005p.getValue();
	}

	/**
	 * Setter for sel0005p attribute.
	 * @param sel0005p the new value of sel0005p
	 */
	public void setSel0005p(String sel0005p) {
		this.sel0005p.setValue(sel0005p);
	}
	/**
	 * Gets the reference for attribute sel0005h.
	 * @return the sel0005h attribute reference
	 */
	public ElementaryRangeReference getSel0005hReference() {
		return sel0005h.getReference();
	}

	/**
	 * Getter for sel0005h attribute.
	 * @return sel0005h attribute
	 */
	public String getSel0005h() {
		return sel0005h.getValue();
	}

	/**
	 * Setter for sel0005h attribute.
	 * @param sel0005h the new value of sel0005h
	 */
	public void setSel0005h(String sel0005h) {
		this.sel0005h.setValue(sel0005h);
	}
	/**
	 * Gets the reference for attribute sel0005v.
	 * @return the sel0005v attribute reference
	 */
	public ElementaryRangeReference getSel0005vReference() {
		return sel0005v.getReference();
	}

	/**
	 * Getter for sel0005v attribute.
	 * @return sel0005v attribute
	 */
	public String getSel0005v() {
		return sel0005v.getValue();
	}

	/**
	 * Setter for sel0005v attribute.
	 * @param sel0005v the new value of sel0005v
	 */
	public void setSel0005v(String sel0005v) {
		this.sel0005v.setValue(sel0005v);
	}
	/**
	 * Gets the reference for attribute sel0005o.
	 * @return the sel0005o attribute reference
	 */
	public ElementaryRangeReference getSel0005oReference() {
		return sel0005o.getReference();
	}

	/**
	 * Getter for sel0005o attribute.
	 * @return sel0005o attribute
	 */
	public String getSel0005o() {
		return sel0005o.getValue();
	}

	/**
	 * Setter for sel0005o attribute.
	 * @param sel0005o the new value of sel0005o
	 */
	public void setSel0005o(String sel0005o) {
		this.sel0005o.setValue(sel0005o);
	}
	/**
	 * Gets the reference for attribute usrid05c.
	 * @return the usrid05c attribute reference
	 */
	public ElementaryRangeReference getUsrid05cReference() {
		return usrid05c.getReference();
	}

	/**
	 * Getter for usrid05c attribute.
	 * @return usrid05c attribute
	 */
	public String getUsrid05c() {
		return usrid05c.getValue();
	}

	/**
	 * Setter for usrid05c attribute.
	 * @param usrid05c the new value of usrid05c
	 */
	public void setUsrid05c(String usrid05c) {
		this.usrid05c.setValue(usrid05c);
	}
	/**
	 * Gets the reference for attribute usrid05p.
	 * @return the usrid05p attribute reference
	 */
	public ElementaryRangeReference getUsrid05pReference() {
		return usrid05p.getReference();
	}

	/**
	 * Getter for usrid05p attribute.
	 * @return usrid05p attribute
	 */
	public String getUsrid05p() {
		return usrid05p.getValue();
	}

	/**
	 * Setter for usrid05p attribute.
	 * @param usrid05p the new value of usrid05p
	 */
	public void setUsrid05p(String usrid05p) {
		this.usrid05p.setValue(usrid05p);
	}
	/**
	 * Gets the reference for attribute usrid05h.
	 * @return the usrid05h attribute reference
	 */
	public ElementaryRangeReference getUsrid05hReference() {
		return usrid05h.getReference();
	}

	/**
	 * Getter for usrid05h attribute.
	 * @return usrid05h attribute
	 */
	public String getUsrid05h() {
		return usrid05h.getValue();
	}

	/**
	 * Setter for usrid05h attribute.
	 * @param usrid05h the new value of usrid05h
	 */
	public void setUsrid05h(String usrid05h) {
		this.usrid05h.setValue(usrid05h);
	}
	/**
	 * Gets the reference for attribute usrid05v.
	 * @return the usrid05v attribute reference
	 */
	public ElementaryRangeReference getUsrid05vReference() {
		return usrid05v.getReference();
	}

	/**
	 * Getter for usrid05v attribute.
	 * @return usrid05v attribute
	 */
	public String getUsrid05v() {
		return usrid05v.getValue();
	}

	/**
	 * Setter for usrid05v attribute.
	 * @param usrid05v the new value of usrid05v
	 */
	public void setUsrid05v(String usrid05v) {
		this.usrid05v.setValue(usrid05v);
	}
	/**
	 * Gets the reference for attribute usrid05o.
	 * @return the usrid05o attribute reference
	 */
	public ElementaryRangeReference getUsrid05oReference() {
		return usrid05o.getReference();
	}

	/**
	 * Getter for usrid05o attribute.
	 * @return usrid05o attribute
	 */
	public String getUsrid05o() {
		return usrid05o.getValue();
	}

	/**
	 * Setter for usrid05o attribute.
	 * @param usrid05o the new value of usrid05o
	 */
	public void setUsrid05o(String usrid05o) {
		this.usrid05o.setValue(usrid05o);
	}
	/**
	 * Gets the reference for attribute fname05c.
	 * @return the fname05c attribute reference
	 */
	public ElementaryRangeReference getFname05cReference() {
		return fname05c.getReference();
	}

	/**
	 * Getter for fname05c attribute.
	 * @return fname05c attribute
	 */
	public String getFname05c() {
		return fname05c.getValue();
	}

	/**
	 * Setter for fname05c attribute.
	 * @param fname05c the new value of fname05c
	 */
	public void setFname05c(String fname05c) {
		this.fname05c.setValue(fname05c);
	}
	/**
	 * Gets the reference for attribute fname05p.
	 * @return the fname05p attribute reference
	 */
	public ElementaryRangeReference getFname05pReference() {
		return fname05p.getReference();
	}

	/**
	 * Getter for fname05p attribute.
	 * @return fname05p attribute
	 */
	public String getFname05p() {
		return fname05p.getValue();
	}

	/**
	 * Setter for fname05p attribute.
	 * @param fname05p the new value of fname05p
	 */
	public void setFname05p(String fname05p) {
		this.fname05p.setValue(fname05p);
	}
	/**
	 * Gets the reference for attribute fname05h.
	 * @return the fname05h attribute reference
	 */
	public ElementaryRangeReference getFname05hReference() {
		return fname05h.getReference();
	}

	/**
	 * Getter for fname05h attribute.
	 * @return fname05h attribute
	 */
	public String getFname05h() {
		return fname05h.getValue();
	}

	/**
	 * Setter for fname05h attribute.
	 * @param fname05h the new value of fname05h
	 */
	public void setFname05h(String fname05h) {
		this.fname05h.setValue(fname05h);
	}
	/**
	 * Gets the reference for attribute fname05v.
	 * @return the fname05v attribute reference
	 */
	public ElementaryRangeReference getFname05vReference() {
		return fname05v.getReference();
	}

	/**
	 * Getter for fname05v attribute.
	 * @return fname05v attribute
	 */
	public String getFname05v() {
		return fname05v.getValue();
	}

	/**
	 * Setter for fname05v attribute.
	 * @param fname05v the new value of fname05v
	 */
	public void setFname05v(String fname05v) {
		this.fname05v.setValue(fname05v);
	}
	/**
	 * Gets the reference for attribute fname05o.
	 * @return the fname05o attribute reference
	 */
	public ElementaryRangeReference getFname05oReference() {
		return fname05o.getReference();
	}

	/**
	 * Getter for fname05o attribute.
	 * @return fname05o attribute
	 */
	public String getFname05o() {
		return fname05o.getValue();
	}

	/**
	 * Setter for fname05o attribute.
	 * @param fname05o the new value of fname05o
	 */
	public void setFname05o(String fname05o) {
		this.fname05o.setValue(fname05o);
	}
	/**
	 * Gets the reference for attribute lname05c.
	 * @return the lname05c attribute reference
	 */
	public ElementaryRangeReference getLname05cReference() {
		return lname05c.getReference();
	}

	/**
	 * Getter for lname05c attribute.
	 * @return lname05c attribute
	 */
	public String getLname05c() {
		return lname05c.getValue();
	}

	/**
	 * Setter for lname05c attribute.
	 * @param lname05c the new value of lname05c
	 */
	public void setLname05c(String lname05c) {
		this.lname05c.setValue(lname05c);
	}
	/**
	 * Gets the reference for attribute lname05p.
	 * @return the lname05p attribute reference
	 */
	public ElementaryRangeReference getLname05pReference() {
		return lname05p.getReference();
	}

	/**
	 * Getter for lname05p attribute.
	 * @return lname05p attribute
	 */
	public String getLname05p() {
		return lname05p.getValue();
	}

	/**
	 * Setter for lname05p attribute.
	 * @param lname05p the new value of lname05p
	 */
	public void setLname05p(String lname05p) {
		this.lname05p.setValue(lname05p);
	}
	/**
	 * Gets the reference for attribute lname05h.
	 * @return the lname05h attribute reference
	 */
	public ElementaryRangeReference getLname05hReference() {
		return lname05h.getReference();
	}

	/**
	 * Getter for lname05h attribute.
	 * @return lname05h attribute
	 */
	public String getLname05h() {
		return lname05h.getValue();
	}

	/**
	 * Setter for lname05h attribute.
	 * @param lname05h the new value of lname05h
	 */
	public void setLname05h(String lname05h) {
		this.lname05h.setValue(lname05h);
	}
	/**
	 * Gets the reference for attribute lname05v.
	 * @return the lname05v attribute reference
	 */
	public ElementaryRangeReference getLname05vReference() {
		return lname05v.getReference();
	}

	/**
	 * Getter for lname05v attribute.
	 * @return lname05v attribute
	 */
	public String getLname05v() {
		return lname05v.getValue();
	}

	/**
	 * Setter for lname05v attribute.
	 * @param lname05v the new value of lname05v
	 */
	public void setLname05v(String lname05v) {
		this.lname05v.setValue(lname05v);
	}
	/**
	 * Gets the reference for attribute lname05o.
	 * @return the lname05o attribute reference
	 */
	public ElementaryRangeReference getLname05oReference() {
		return lname05o.getReference();
	}

	/**
	 * Getter for lname05o attribute.
	 * @return lname05o attribute
	 */
	public String getLname05o() {
		return lname05o.getValue();
	}

	/**
	 * Setter for lname05o attribute.
	 * @param lname05o the new value of lname05o
	 */
	public void setLname05o(String lname05o) {
		this.lname05o.setValue(lname05o);
	}
	/**
	 * Gets the reference for attribute utype05c.
	 * @return the utype05c attribute reference
	 */
	public ElementaryRangeReference getUtype05cReference() {
		return utype05c.getReference();
	}

	/**
	 * Getter for utype05c attribute.
	 * @return utype05c attribute
	 */
	public String getUtype05c() {
		return utype05c.getValue();
	}

	/**
	 * Setter for utype05c attribute.
	 * @param utype05c the new value of utype05c
	 */
	public void setUtype05c(String utype05c) {
		this.utype05c.setValue(utype05c);
	}
	/**
	 * Gets the reference for attribute utype05p.
	 * @return the utype05p attribute reference
	 */
	public ElementaryRangeReference getUtype05pReference() {
		return utype05p.getReference();
	}

	/**
	 * Getter for utype05p attribute.
	 * @return utype05p attribute
	 */
	public String getUtype05p() {
		return utype05p.getValue();
	}

	/**
	 * Setter for utype05p attribute.
	 * @param utype05p the new value of utype05p
	 */
	public void setUtype05p(String utype05p) {
		this.utype05p.setValue(utype05p);
	}
	/**
	 * Gets the reference for attribute utype05h.
	 * @return the utype05h attribute reference
	 */
	public ElementaryRangeReference getUtype05hReference() {
		return utype05h.getReference();
	}

	/**
	 * Getter for utype05h attribute.
	 * @return utype05h attribute
	 */
	public String getUtype05h() {
		return utype05h.getValue();
	}

	/**
	 * Setter for utype05h attribute.
	 * @param utype05h the new value of utype05h
	 */
	public void setUtype05h(String utype05h) {
		this.utype05h.setValue(utype05h);
	}
	/**
	 * Gets the reference for attribute utype05v.
	 * @return the utype05v attribute reference
	 */
	public ElementaryRangeReference getUtype05vReference() {
		return utype05v.getReference();
	}

	/**
	 * Getter for utype05v attribute.
	 * @return utype05v attribute
	 */
	public String getUtype05v() {
		return utype05v.getValue();
	}

	/**
	 * Setter for utype05v attribute.
	 * @param utype05v the new value of utype05v
	 */
	public void setUtype05v(String utype05v) {
		this.utype05v.setValue(utype05v);
	}
	/**
	 * Gets the reference for attribute utype05o.
	 * @return the utype05o attribute reference
	 */
	public ElementaryRangeReference getUtype05oReference() {
		return utype05o.getReference();
	}

	/**
	 * Getter for utype05o attribute.
	 * @return utype05o attribute
	 */
	public String getUtype05o() {
		return utype05o.getValue();
	}

	/**
	 * Setter for utype05o attribute.
	 * @param utype05o the new value of utype05o
	 */
	public void setUtype05o(String utype05o) {
		this.utype05o.setValue(utype05o);
	}
	/**
	 * Gets the reference for attribute sel0006c.
	 * @return the sel0006c attribute reference
	 */
	public ElementaryRangeReference getSel0006cReference() {
		return sel0006c.getReference();
	}

	/**
	 * Getter for sel0006c attribute.
	 * @return sel0006c attribute
	 */
	public String getSel0006c() {
		return sel0006c.getValue();
	}

	/**
	 * Setter for sel0006c attribute.
	 * @param sel0006c the new value of sel0006c
	 */
	public void setSel0006c(String sel0006c) {
		this.sel0006c.setValue(sel0006c);
	}
	/**
	 * Gets the reference for attribute sel0006p.
	 * @return the sel0006p attribute reference
	 */
	public ElementaryRangeReference getSel0006pReference() {
		return sel0006p.getReference();
	}

	/**
	 * Getter for sel0006p attribute.
	 * @return sel0006p attribute
	 */
	public String getSel0006p() {
		return sel0006p.getValue();
	}

	/**
	 * Setter for sel0006p attribute.
	 * @param sel0006p the new value of sel0006p
	 */
	public void setSel0006p(String sel0006p) {
		this.sel0006p.setValue(sel0006p);
	}
	/**
	 * Gets the reference for attribute sel0006h.
	 * @return the sel0006h attribute reference
	 */
	public ElementaryRangeReference getSel0006hReference() {
		return sel0006h.getReference();
	}

	/**
	 * Getter for sel0006h attribute.
	 * @return sel0006h attribute
	 */
	public String getSel0006h() {
		return sel0006h.getValue();
	}

	/**
	 * Setter for sel0006h attribute.
	 * @param sel0006h the new value of sel0006h
	 */
	public void setSel0006h(String sel0006h) {
		this.sel0006h.setValue(sel0006h);
	}
	/**
	 * Gets the reference for attribute sel0006v.
	 * @return the sel0006v attribute reference
	 */
	public ElementaryRangeReference getSel0006vReference() {
		return sel0006v.getReference();
	}

	/**
	 * Getter for sel0006v attribute.
	 * @return sel0006v attribute
	 */
	public String getSel0006v() {
		return sel0006v.getValue();
	}

	/**
	 * Setter for sel0006v attribute.
	 * @param sel0006v the new value of sel0006v
	 */
	public void setSel0006v(String sel0006v) {
		this.sel0006v.setValue(sel0006v);
	}
	/**
	 * Gets the reference for attribute sel0006o.
	 * @return the sel0006o attribute reference
	 */
	public ElementaryRangeReference getSel0006oReference() {
		return sel0006o.getReference();
	}

	/**
	 * Getter for sel0006o attribute.
	 * @return sel0006o attribute
	 */
	public String getSel0006o() {
		return sel0006o.getValue();
	}

	/**
	 * Setter for sel0006o attribute.
	 * @param sel0006o the new value of sel0006o
	 */
	public void setSel0006o(String sel0006o) {
		this.sel0006o.setValue(sel0006o);
	}
	/**
	 * Gets the reference for attribute usrid06c.
	 * @return the usrid06c attribute reference
	 */
	public ElementaryRangeReference getUsrid06cReference() {
		return usrid06c.getReference();
	}

	/**
	 * Getter for usrid06c attribute.
	 * @return usrid06c attribute
	 */
	public String getUsrid06c() {
		return usrid06c.getValue();
	}

	/**
	 * Setter for usrid06c attribute.
	 * @param usrid06c the new value of usrid06c
	 */
	public void setUsrid06c(String usrid06c) {
		this.usrid06c.setValue(usrid06c);
	}
	/**
	 * Gets the reference for attribute usrid06p.
	 * @return the usrid06p attribute reference
	 */
	public ElementaryRangeReference getUsrid06pReference() {
		return usrid06p.getReference();
	}

	/**
	 * Getter for usrid06p attribute.
	 * @return usrid06p attribute
	 */
	public String getUsrid06p() {
		return usrid06p.getValue();
	}

	/**
	 * Setter for usrid06p attribute.
	 * @param usrid06p the new value of usrid06p
	 */
	public void setUsrid06p(String usrid06p) {
		this.usrid06p.setValue(usrid06p);
	}
	/**
	 * Gets the reference for attribute usrid06h.
	 * @return the usrid06h attribute reference
	 */
	public ElementaryRangeReference getUsrid06hReference() {
		return usrid06h.getReference();
	}

	/**
	 * Getter for usrid06h attribute.
	 * @return usrid06h attribute
	 */
	public String getUsrid06h() {
		return usrid06h.getValue();
	}

	/**
	 * Setter for usrid06h attribute.
	 * @param usrid06h the new value of usrid06h
	 */
	public void setUsrid06h(String usrid06h) {
		this.usrid06h.setValue(usrid06h);
	}
	/**
	 * Gets the reference for attribute usrid06v.
	 * @return the usrid06v attribute reference
	 */
	public ElementaryRangeReference getUsrid06vReference() {
		return usrid06v.getReference();
	}

	/**
	 * Getter for usrid06v attribute.
	 * @return usrid06v attribute
	 */
	public String getUsrid06v() {
		return usrid06v.getValue();
	}

	/**
	 * Setter for usrid06v attribute.
	 * @param usrid06v the new value of usrid06v
	 */
	public void setUsrid06v(String usrid06v) {
		this.usrid06v.setValue(usrid06v);
	}
	/**
	 * Gets the reference for attribute usrid06o.
	 * @return the usrid06o attribute reference
	 */
	public ElementaryRangeReference getUsrid06oReference() {
		return usrid06o.getReference();
	}

	/**
	 * Getter for usrid06o attribute.
	 * @return usrid06o attribute
	 */
	public String getUsrid06o() {
		return usrid06o.getValue();
	}

	/**
	 * Setter for usrid06o attribute.
	 * @param usrid06o the new value of usrid06o
	 */
	public void setUsrid06o(String usrid06o) {
		this.usrid06o.setValue(usrid06o);
	}
	/**
	 * Gets the reference for attribute fname06c.
	 * @return the fname06c attribute reference
	 */
	public ElementaryRangeReference getFname06cReference() {
		return fname06c.getReference();
	}

	/**
	 * Getter for fname06c attribute.
	 * @return fname06c attribute
	 */
	public String getFname06c() {
		return fname06c.getValue();
	}

	/**
	 * Setter for fname06c attribute.
	 * @param fname06c the new value of fname06c
	 */
	public void setFname06c(String fname06c) {
		this.fname06c.setValue(fname06c);
	}
	/**
	 * Gets the reference for attribute fname06p.
	 * @return the fname06p attribute reference
	 */
	public ElementaryRangeReference getFname06pReference() {
		return fname06p.getReference();
	}

	/**
	 * Getter for fname06p attribute.
	 * @return fname06p attribute
	 */
	public String getFname06p() {
		return fname06p.getValue();
	}

	/**
	 * Setter for fname06p attribute.
	 * @param fname06p the new value of fname06p
	 */
	public void setFname06p(String fname06p) {
		this.fname06p.setValue(fname06p);
	}
	/**
	 * Gets the reference for attribute fname06h.
	 * @return the fname06h attribute reference
	 */
	public ElementaryRangeReference getFname06hReference() {
		return fname06h.getReference();
	}

	/**
	 * Getter for fname06h attribute.
	 * @return fname06h attribute
	 */
	public String getFname06h() {
		return fname06h.getValue();
	}

	/**
	 * Setter for fname06h attribute.
	 * @param fname06h the new value of fname06h
	 */
	public void setFname06h(String fname06h) {
		this.fname06h.setValue(fname06h);
	}
	/**
	 * Gets the reference for attribute fname06v.
	 * @return the fname06v attribute reference
	 */
	public ElementaryRangeReference getFname06vReference() {
		return fname06v.getReference();
	}

	/**
	 * Getter for fname06v attribute.
	 * @return fname06v attribute
	 */
	public String getFname06v() {
		return fname06v.getValue();
	}

	/**
	 * Setter for fname06v attribute.
	 * @param fname06v the new value of fname06v
	 */
	public void setFname06v(String fname06v) {
		this.fname06v.setValue(fname06v);
	}
	/**
	 * Gets the reference for attribute fname06o.
	 * @return the fname06o attribute reference
	 */
	public ElementaryRangeReference getFname06oReference() {
		return fname06o.getReference();
	}

	/**
	 * Getter for fname06o attribute.
	 * @return fname06o attribute
	 */
	public String getFname06o() {
		return fname06o.getValue();
	}

	/**
	 * Setter for fname06o attribute.
	 * @param fname06o the new value of fname06o
	 */
	public void setFname06o(String fname06o) {
		this.fname06o.setValue(fname06o);
	}
	/**
	 * Gets the reference for attribute lname06c.
	 * @return the lname06c attribute reference
	 */
	public ElementaryRangeReference getLname06cReference() {
		return lname06c.getReference();
	}

	/**
	 * Getter for lname06c attribute.
	 * @return lname06c attribute
	 */
	public String getLname06c() {
		return lname06c.getValue();
	}

	/**
	 * Setter for lname06c attribute.
	 * @param lname06c the new value of lname06c
	 */
	public void setLname06c(String lname06c) {
		this.lname06c.setValue(lname06c);
	}
	/**
	 * Gets the reference for attribute lname06p.
	 * @return the lname06p attribute reference
	 */
	public ElementaryRangeReference getLname06pReference() {
		return lname06p.getReference();
	}

	/**
	 * Getter for lname06p attribute.
	 * @return lname06p attribute
	 */
	public String getLname06p() {
		return lname06p.getValue();
	}

	/**
	 * Setter for lname06p attribute.
	 * @param lname06p the new value of lname06p
	 */
	public void setLname06p(String lname06p) {
		this.lname06p.setValue(lname06p);
	}
	/**
	 * Gets the reference for attribute lname06h.
	 * @return the lname06h attribute reference
	 */
	public ElementaryRangeReference getLname06hReference() {
		return lname06h.getReference();
	}

	/**
	 * Getter for lname06h attribute.
	 * @return lname06h attribute
	 */
	public String getLname06h() {
		return lname06h.getValue();
	}

	/**
	 * Setter for lname06h attribute.
	 * @param lname06h the new value of lname06h
	 */
	public void setLname06h(String lname06h) {
		this.lname06h.setValue(lname06h);
	}
	/**
	 * Gets the reference for attribute lname06v.
	 * @return the lname06v attribute reference
	 */
	public ElementaryRangeReference getLname06vReference() {
		return lname06v.getReference();
	}

	/**
	 * Getter for lname06v attribute.
	 * @return lname06v attribute
	 */
	public String getLname06v() {
		return lname06v.getValue();
	}

	/**
	 * Setter for lname06v attribute.
	 * @param lname06v the new value of lname06v
	 */
	public void setLname06v(String lname06v) {
		this.lname06v.setValue(lname06v);
	}
	/**
	 * Gets the reference for attribute lname06o.
	 * @return the lname06o attribute reference
	 */
	public ElementaryRangeReference getLname06oReference() {
		return lname06o.getReference();
	}

	/**
	 * Getter for lname06o attribute.
	 * @return lname06o attribute
	 */
	public String getLname06o() {
		return lname06o.getValue();
	}

	/**
	 * Setter for lname06o attribute.
	 * @param lname06o the new value of lname06o
	 */
	public void setLname06o(String lname06o) {
		this.lname06o.setValue(lname06o);
	}
	/**
	 * Gets the reference for attribute utype06c.
	 * @return the utype06c attribute reference
	 */
	public ElementaryRangeReference getUtype06cReference() {
		return utype06c.getReference();
	}

	/**
	 * Getter for utype06c attribute.
	 * @return utype06c attribute
	 */
	public String getUtype06c() {
		return utype06c.getValue();
	}

	/**
	 * Setter for utype06c attribute.
	 * @param utype06c the new value of utype06c
	 */
	public void setUtype06c(String utype06c) {
		this.utype06c.setValue(utype06c);
	}
	/**
	 * Gets the reference for attribute utype06p.
	 * @return the utype06p attribute reference
	 */
	public ElementaryRangeReference getUtype06pReference() {
		return utype06p.getReference();
	}

	/**
	 * Getter for utype06p attribute.
	 * @return utype06p attribute
	 */
	public String getUtype06p() {
		return utype06p.getValue();
	}

	/**
	 * Setter for utype06p attribute.
	 * @param utype06p the new value of utype06p
	 */
	public void setUtype06p(String utype06p) {
		this.utype06p.setValue(utype06p);
	}
	/**
	 * Gets the reference for attribute utype06h.
	 * @return the utype06h attribute reference
	 */
	public ElementaryRangeReference getUtype06hReference() {
		return utype06h.getReference();
	}

	/**
	 * Getter for utype06h attribute.
	 * @return utype06h attribute
	 */
	public String getUtype06h() {
		return utype06h.getValue();
	}

	/**
	 * Setter for utype06h attribute.
	 * @param utype06h the new value of utype06h
	 */
	public void setUtype06h(String utype06h) {
		this.utype06h.setValue(utype06h);
	}
	/**
	 * Gets the reference for attribute utype06v.
	 * @return the utype06v attribute reference
	 */
	public ElementaryRangeReference getUtype06vReference() {
		return utype06v.getReference();
	}

	/**
	 * Getter for utype06v attribute.
	 * @return utype06v attribute
	 */
	public String getUtype06v() {
		return utype06v.getValue();
	}

	/**
	 * Setter for utype06v attribute.
	 * @param utype06v the new value of utype06v
	 */
	public void setUtype06v(String utype06v) {
		this.utype06v.setValue(utype06v);
	}
	/**
	 * Gets the reference for attribute utype06o.
	 * @return the utype06o attribute reference
	 */
	public ElementaryRangeReference getUtype06oReference() {
		return utype06o.getReference();
	}

	/**
	 * Getter for utype06o attribute.
	 * @return utype06o attribute
	 */
	public String getUtype06o() {
		return utype06o.getValue();
	}

	/**
	 * Setter for utype06o attribute.
	 * @param utype06o the new value of utype06o
	 */
	public void setUtype06o(String utype06o) {
		this.utype06o.setValue(utype06o);
	}
	/**
	 * Gets the reference for attribute sel0007c.
	 * @return the sel0007c attribute reference
	 */
	public ElementaryRangeReference getSel0007cReference() {
		return sel0007c.getReference();
	}

	/**
	 * Getter for sel0007c attribute.
	 * @return sel0007c attribute
	 */
	public String getSel0007c() {
		return sel0007c.getValue();
	}

	/**
	 * Setter for sel0007c attribute.
	 * @param sel0007c the new value of sel0007c
	 */
	public void setSel0007c(String sel0007c) {
		this.sel0007c.setValue(sel0007c);
	}
	/**
	 * Gets the reference for attribute sel0007p.
	 * @return the sel0007p attribute reference
	 */
	public ElementaryRangeReference getSel0007pReference() {
		return sel0007p.getReference();
	}

	/**
	 * Getter for sel0007p attribute.
	 * @return sel0007p attribute
	 */
	public String getSel0007p() {
		return sel0007p.getValue();
	}

	/**
	 * Setter for sel0007p attribute.
	 * @param sel0007p the new value of sel0007p
	 */
	public void setSel0007p(String sel0007p) {
		this.sel0007p.setValue(sel0007p);
	}
	/**
	 * Gets the reference for attribute sel0007h.
	 * @return the sel0007h attribute reference
	 */
	public ElementaryRangeReference getSel0007hReference() {
		return sel0007h.getReference();
	}

	/**
	 * Getter for sel0007h attribute.
	 * @return sel0007h attribute
	 */
	public String getSel0007h() {
		return sel0007h.getValue();
	}

	/**
	 * Setter for sel0007h attribute.
	 * @param sel0007h the new value of sel0007h
	 */
	public void setSel0007h(String sel0007h) {
		this.sel0007h.setValue(sel0007h);
	}
	/**
	 * Gets the reference for attribute sel0007v.
	 * @return the sel0007v attribute reference
	 */
	public ElementaryRangeReference getSel0007vReference() {
		return sel0007v.getReference();
	}

	/**
	 * Getter for sel0007v attribute.
	 * @return sel0007v attribute
	 */
	public String getSel0007v() {
		return sel0007v.getValue();
	}

	/**
	 * Setter for sel0007v attribute.
	 * @param sel0007v the new value of sel0007v
	 */
	public void setSel0007v(String sel0007v) {
		this.sel0007v.setValue(sel0007v);
	}
	/**
	 * Gets the reference for attribute sel0007o.
	 * @return the sel0007o attribute reference
	 */
	public ElementaryRangeReference getSel0007oReference() {
		return sel0007o.getReference();
	}

	/**
	 * Getter for sel0007o attribute.
	 * @return sel0007o attribute
	 */
	public String getSel0007o() {
		return sel0007o.getValue();
	}

	/**
	 * Setter for sel0007o attribute.
	 * @param sel0007o the new value of sel0007o
	 */
	public void setSel0007o(String sel0007o) {
		this.sel0007o.setValue(sel0007o);
	}
	/**
	 * Gets the reference for attribute usrid07c.
	 * @return the usrid07c attribute reference
	 */
	public ElementaryRangeReference getUsrid07cReference() {
		return usrid07c.getReference();
	}

	/**
	 * Getter for usrid07c attribute.
	 * @return usrid07c attribute
	 */
	public String getUsrid07c() {
		return usrid07c.getValue();
	}

	/**
	 * Setter for usrid07c attribute.
	 * @param usrid07c the new value of usrid07c
	 */
	public void setUsrid07c(String usrid07c) {
		this.usrid07c.setValue(usrid07c);
	}
	/**
	 * Gets the reference for attribute usrid07p.
	 * @return the usrid07p attribute reference
	 */
	public ElementaryRangeReference getUsrid07pReference() {
		return usrid07p.getReference();
	}

	/**
	 * Getter for usrid07p attribute.
	 * @return usrid07p attribute
	 */
	public String getUsrid07p() {
		return usrid07p.getValue();
	}

	/**
	 * Setter for usrid07p attribute.
	 * @param usrid07p the new value of usrid07p
	 */
	public void setUsrid07p(String usrid07p) {
		this.usrid07p.setValue(usrid07p);
	}
	/**
	 * Gets the reference for attribute usrid07h.
	 * @return the usrid07h attribute reference
	 */
	public ElementaryRangeReference getUsrid07hReference() {
		return usrid07h.getReference();
	}

	/**
	 * Getter for usrid07h attribute.
	 * @return usrid07h attribute
	 */
	public String getUsrid07h() {
		return usrid07h.getValue();
	}

	/**
	 * Setter for usrid07h attribute.
	 * @param usrid07h the new value of usrid07h
	 */
	public void setUsrid07h(String usrid07h) {
		this.usrid07h.setValue(usrid07h);
	}
	/**
	 * Gets the reference for attribute usrid07v.
	 * @return the usrid07v attribute reference
	 */
	public ElementaryRangeReference getUsrid07vReference() {
		return usrid07v.getReference();
	}

	/**
	 * Getter for usrid07v attribute.
	 * @return usrid07v attribute
	 */
	public String getUsrid07v() {
		return usrid07v.getValue();
	}

	/**
	 * Setter for usrid07v attribute.
	 * @param usrid07v the new value of usrid07v
	 */
	public void setUsrid07v(String usrid07v) {
		this.usrid07v.setValue(usrid07v);
	}
	/**
	 * Gets the reference for attribute usrid07o.
	 * @return the usrid07o attribute reference
	 */
	public ElementaryRangeReference getUsrid07oReference() {
		return usrid07o.getReference();
	}

	/**
	 * Getter for usrid07o attribute.
	 * @return usrid07o attribute
	 */
	public String getUsrid07o() {
		return usrid07o.getValue();
	}

	/**
	 * Setter for usrid07o attribute.
	 * @param usrid07o the new value of usrid07o
	 */
	public void setUsrid07o(String usrid07o) {
		this.usrid07o.setValue(usrid07o);
	}
	/**
	 * Gets the reference for attribute fname07c.
	 * @return the fname07c attribute reference
	 */
	public ElementaryRangeReference getFname07cReference() {
		return fname07c.getReference();
	}

	/**
	 * Getter for fname07c attribute.
	 * @return fname07c attribute
	 */
	public String getFname07c() {
		return fname07c.getValue();
	}

	/**
	 * Setter for fname07c attribute.
	 * @param fname07c the new value of fname07c
	 */
	public void setFname07c(String fname07c) {
		this.fname07c.setValue(fname07c);
	}
	/**
	 * Gets the reference for attribute fname07p.
	 * @return the fname07p attribute reference
	 */
	public ElementaryRangeReference getFname07pReference() {
		return fname07p.getReference();
	}

	/**
	 * Getter for fname07p attribute.
	 * @return fname07p attribute
	 */
	public String getFname07p() {
		return fname07p.getValue();
	}

	/**
	 * Setter for fname07p attribute.
	 * @param fname07p the new value of fname07p
	 */
	public void setFname07p(String fname07p) {
		this.fname07p.setValue(fname07p);
	}
	/**
	 * Gets the reference for attribute fname07h.
	 * @return the fname07h attribute reference
	 */
	public ElementaryRangeReference getFname07hReference() {
		return fname07h.getReference();
	}

	/**
	 * Getter for fname07h attribute.
	 * @return fname07h attribute
	 */
	public String getFname07h() {
		return fname07h.getValue();
	}

	/**
	 * Setter for fname07h attribute.
	 * @param fname07h the new value of fname07h
	 */
	public void setFname07h(String fname07h) {
		this.fname07h.setValue(fname07h);
	}
	/**
	 * Gets the reference for attribute fname07v.
	 * @return the fname07v attribute reference
	 */
	public ElementaryRangeReference getFname07vReference() {
		return fname07v.getReference();
	}

	/**
	 * Getter for fname07v attribute.
	 * @return fname07v attribute
	 */
	public String getFname07v() {
		return fname07v.getValue();
	}

	/**
	 * Setter for fname07v attribute.
	 * @param fname07v the new value of fname07v
	 */
	public void setFname07v(String fname07v) {
		this.fname07v.setValue(fname07v);
	}
	/**
	 * Gets the reference for attribute fname07o.
	 * @return the fname07o attribute reference
	 */
	public ElementaryRangeReference getFname07oReference() {
		return fname07o.getReference();
	}

	/**
	 * Getter for fname07o attribute.
	 * @return fname07o attribute
	 */
	public String getFname07o() {
		return fname07o.getValue();
	}

	/**
	 * Setter for fname07o attribute.
	 * @param fname07o the new value of fname07o
	 */
	public void setFname07o(String fname07o) {
		this.fname07o.setValue(fname07o);
	}
	/**
	 * Gets the reference for attribute lname07c.
	 * @return the lname07c attribute reference
	 */
	public ElementaryRangeReference getLname07cReference() {
		return lname07c.getReference();
	}

	/**
	 * Getter for lname07c attribute.
	 * @return lname07c attribute
	 */
	public String getLname07c() {
		return lname07c.getValue();
	}

	/**
	 * Setter for lname07c attribute.
	 * @param lname07c the new value of lname07c
	 */
	public void setLname07c(String lname07c) {
		this.lname07c.setValue(lname07c);
	}
	/**
	 * Gets the reference for attribute lname07p.
	 * @return the lname07p attribute reference
	 */
	public ElementaryRangeReference getLname07pReference() {
		return lname07p.getReference();
	}

	/**
	 * Getter for lname07p attribute.
	 * @return lname07p attribute
	 */
	public String getLname07p() {
		return lname07p.getValue();
	}

	/**
	 * Setter for lname07p attribute.
	 * @param lname07p the new value of lname07p
	 */
	public void setLname07p(String lname07p) {
		this.lname07p.setValue(lname07p);
	}
	/**
	 * Gets the reference for attribute lname07h.
	 * @return the lname07h attribute reference
	 */
	public ElementaryRangeReference getLname07hReference() {
		return lname07h.getReference();
	}

	/**
	 * Getter for lname07h attribute.
	 * @return lname07h attribute
	 */
	public String getLname07h() {
		return lname07h.getValue();
	}

	/**
	 * Setter for lname07h attribute.
	 * @param lname07h the new value of lname07h
	 */
	public void setLname07h(String lname07h) {
		this.lname07h.setValue(lname07h);
	}
	/**
	 * Gets the reference for attribute lname07v.
	 * @return the lname07v attribute reference
	 */
	public ElementaryRangeReference getLname07vReference() {
		return lname07v.getReference();
	}

	/**
	 * Getter for lname07v attribute.
	 * @return lname07v attribute
	 */
	public String getLname07v() {
		return lname07v.getValue();
	}

	/**
	 * Setter for lname07v attribute.
	 * @param lname07v the new value of lname07v
	 */
	public void setLname07v(String lname07v) {
		this.lname07v.setValue(lname07v);
	}
	/**
	 * Gets the reference for attribute lname07o.
	 * @return the lname07o attribute reference
	 */
	public ElementaryRangeReference getLname07oReference() {
		return lname07o.getReference();
	}

	/**
	 * Getter for lname07o attribute.
	 * @return lname07o attribute
	 */
	public String getLname07o() {
		return lname07o.getValue();
	}

	/**
	 * Setter for lname07o attribute.
	 * @param lname07o the new value of lname07o
	 */
	public void setLname07o(String lname07o) {
		this.lname07o.setValue(lname07o);
	}
	/**
	 * Gets the reference for attribute utype07c.
	 * @return the utype07c attribute reference
	 */
	public ElementaryRangeReference getUtype07cReference() {
		return utype07c.getReference();
	}

	/**
	 * Getter for utype07c attribute.
	 * @return utype07c attribute
	 */
	public String getUtype07c() {
		return utype07c.getValue();
	}

	/**
	 * Setter for utype07c attribute.
	 * @param utype07c the new value of utype07c
	 */
	public void setUtype07c(String utype07c) {
		this.utype07c.setValue(utype07c);
	}
	/**
	 * Gets the reference for attribute utype07p.
	 * @return the utype07p attribute reference
	 */
	public ElementaryRangeReference getUtype07pReference() {
		return utype07p.getReference();
	}

	/**
	 * Getter for utype07p attribute.
	 * @return utype07p attribute
	 */
	public String getUtype07p() {
		return utype07p.getValue();
	}

	/**
	 * Setter for utype07p attribute.
	 * @param utype07p the new value of utype07p
	 */
	public void setUtype07p(String utype07p) {
		this.utype07p.setValue(utype07p);
	}
	/**
	 * Gets the reference for attribute utype07h.
	 * @return the utype07h attribute reference
	 */
	public ElementaryRangeReference getUtype07hReference() {
		return utype07h.getReference();
	}

	/**
	 * Getter for utype07h attribute.
	 * @return utype07h attribute
	 */
	public String getUtype07h() {
		return utype07h.getValue();
	}

	/**
	 * Setter for utype07h attribute.
	 * @param utype07h the new value of utype07h
	 */
	public void setUtype07h(String utype07h) {
		this.utype07h.setValue(utype07h);
	}
	/**
	 * Gets the reference for attribute utype07v.
	 * @return the utype07v attribute reference
	 */
	public ElementaryRangeReference getUtype07vReference() {
		return utype07v.getReference();
	}

	/**
	 * Getter for utype07v attribute.
	 * @return utype07v attribute
	 */
	public String getUtype07v() {
		return utype07v.getValue();
	}

	/**
	 * Setter for utype07v attribute.
	 * @param utype07v the new value of utype07v
	 */
	public void setUtype07v(String utype07v) {
		this.utype07v.setValue(utype07v);
	}
	/**
	 * Gets the reference for attribute utype07o.
	 * @return the utype07o attribute reference
	 */
	public ElementaryRangeReference getUtype07oReference() {
		return utype07o.getReference();
	}

	/**
	 * Getter for utype07o attribute.
	 * @return utype07o attribute
	 */
	public String getUtype07o() {
		return utype07o.getValue();
	}

	/**
	 * Setter for utype07o attribute.
	 * @param utype07o the new value of utype07o
	 */
	public void setUtype07o(String utype07o) {
		this.utype07o.setValue(utype07o);
	}
	/**
	 * Gets the reference for attribute sel0008c.
	 * @return the sel0008c attribute reference
	 */
	public ElementaryRangeReference getSel0008cReference() {
		return sel0008c.getReference();
	}

	/**
	 * Getter for sel0008c attribute.
	 * @return sel0008c attribute
	 */
	public String getSel0008c() {
		return sel0008c.getValue();
	}

	/**
	 * Setter for sel0008c attribute.
	 * @param sel0008c the new value of sel0008c
	 */
	public void setSel0008c(String sel0008c) {
		this.sel0008c.setValue(sel0008c);
	}
	/**
	 * Gets the reference for attribute sel0008p.
	 * @return the sel0008p attribute reference
	 */
	public ElementaryRangeReference getSel0008pReference() {
		return sel0008p.getReference();
	}

	/**
	 * Getter for sel0008p attribute.
	 * @return sel0008p attribute
	 */
	public String getSel0008p() {
		return sel0008p.getValue();
	}

	/**
	 * Setter for sel0008p attribute.
	 * @param sel0008p the new value of sel0008p
	 */
	public void setSel0008p(String sel0008p) {
		this.sel0008p.setValue(sel0008p);
	}
	/**
	 * Gets the reference for attribute sel0008h.
	 * @return the sel0008h attribute reference
	 */
	public ElementaryRangeReference getSel0008hReference() {
		return sel0008h.getReference();
	}

	/**
	 * Getter for sel0008h attribute.
	 * @return sel0008h attribute
	 */
	public String getSel0008h() {
		return sel0008h.getValue();
	}

	/**
	 * Setter for sel0008h attribute.
	 * @param sel0008h the new value of sel0008h
	 */
	public void setSel0008h(String sel0008h) {
		this.sel0008h.setValue(sel0008h);
	}
	/**
	 * Gets the reference for attribute sel0008v.
	 * @return the sel0008v attribute reference
	 */
	public ElementaryRangeReference getSel0008vReference() {
		return sel0008v.getReference();
	}

	/**
	 * Getter for sel0008v attribute.
	 * @return sel0008v attribute
	 */
	public String getSel0008v() {
		return sel0008v.getValue();
	}

	/**
	 * Setter for sel0008v attribute.
	 * @param sel0008v the new value of sel0008v
	 */
	public void setSel0008v(String sel0008v) {
		this.sel0008v.setValue(sel0008v);
	}
	/**
	 * Gets the reference for attribute sel0008o.
	 * @return the sel0008o attribute reference
	 */
	public ElementaryRangeReference getSel0008oReference() {
		return sel0008o.getReference();
	}

	/**
	 * Getter for sel0008o attribute.
	 * @return sel0008o attribute
	 */
	public String getSel0008o() {
		return sel0008o.getValue();
	}

	/**
	 * Setter for sel0008o attribute.
	 * @param sel0008o the new value of sel0008o
	 */
	public void setSel0008o(String sel0008o) {
		this.sel0008o.setValue(sel0008o);
	}
	/**
	 * Gets the reference for attribute usrid08c.
	 * @return the usrid08c attribute reference
	 */
	public ElementaryRangeReference getUsrid08cReference() {
		return usrid08c.getReference();
	}

	/**
	 * Getter for usrid08c attribute.
	 * @return usrid08c attribute
	 */
	public String getUsrid08c() {
		return usrid08c.getValue();
	}

	/**
	 * Setter for usrid08c attribute.
	 * @param usrid08c the new value of usrid08c
	 */
	public void setUsrid08c(String usrid08c) {
		this.usrid08c.setValue(usrid08c);
	}
	/**
	 * Gets the reference for attribute usrid08p.
	 * @return the usrid08p attribute reference
	 */
	public ElementaryRangeReference getUsrid08pReference() {
		return usrid08p.getReference();
	}

	/**
	 * Getter for usrid08p attribute.
	 * @return usrid08p attribute
	 */
	public String getUsrid08p() {
		return usrid08p.getValue();
	}

	/**
	 * Setter for usrid08p attribute.
	 * @param usrid08p the new value of usrid08p
	 */
	public void setUsrid08p(String usrid08p) {
		this.usrid08p.setValue(usrid08p);
	}
	/**
	 * Gets the reference for attribute usrid08h.
	 * @return the usrid08h attribute reference
	 */
	public ElementaryRangeReference getUsrid08hReference() {
		return usrid08h.getReference();
	}

	/**
	 * Getter for usrid08h attribute.
	 * @return usrid08h attribute
	 */
	public String getUsrid08h() {
		return usrid08h.getValue();
	}

	/**
	 * Setter for usrid08h attribute.
	 * @param usrid08h the new value of usrid08h
	 */
	public void setUsrid08h(String usrid08h) {
		this.usrid08h.setValue(usrid08h);
	}
	/**
	 * Gets the reference for attribute usrid08v.
	 * @return the usrid08v attribute reference
	 */
	public ElementaryRangeReference getUsrid08vReference() {
		return usrid08v.getReference();
	}

	/**
	 * Getter for usrid08v attribute.
	 * @return usrid08v attribute
	 */
	public String getUsrid08v() {
		return usrid08v.getValue();
	}

	/**
	 * Setter for usrid08v attribute.
	 * @param usrid08v the new value of usrid08v
	 */
	public void setUsrid08v(String usrid08v) {
		this.usrid08v.setValue(usrid08v);
	}
	/**
	 * Gets the reference for attribute usrid08o.
	 * @return the usrid08o attribute reference
	 */
	public ElementaryRangeReference getUsrid08oReference() {
		return usrid08o.getReference();
	}

	/**
	 * Getter for usrid08o attribute.
	 * @return usrid08o attribute
	 */
	public String getUsrid08o() {
		return usrid08o.getValue();
	}

	/**
	 * Setter for usrid08o attribute.
	 * @param usrid08o the new value of usrid08o
	 */
	public void setUsrid08o(String usrid08o) {
		this.usrid08o.setValue(usrid08o);
	}
	/**
	 * Gets the reference for attribute fname08c.
	 * @return the fname08c attribute reference
	 */
	public ElementaryRangeReference getFname08cReference() {
		return fname08c.getReference();
	}

	/**
	 * Getter for fname08c attribute.
	 * @return fname08c attribute
	 */
	public String getFname08c() {
		return fname08c.getValue();
	}

	/**
	 * Setter for fname08c attribute.
	 * @param fname08c the new value of fname08c
	 */
	public void setFname08c(String fname08c) {
		this.fname08c.setValue(fname08c);
	}
	/**
	 * Gets the reference for attribute fname08p.
	 * @return the fname08p attribute reference
	 */
	public ElementaryRangeReference getFname08pReference() {
		return fname08p.getReference();
	}

	/**
	 * Getter for fname08p attribute.
	 * @return fname08p attribute
	 */
	public String getFname08p() {
		return fname08p.getValue();
	}

	/**
	 * Setter for fname08p attribute.
	 * @param fname08p the new value of fname08p
	 */
	public void setFname08p(String fname08p) {
		this.fname08p.setValue(fname08p);
	}
	/**
	 * Gets the reference for attribute fname08h.
	 * @return the fname08h attribute reference
	 */
	public ElementaryRangeReference getFname08hReference() {
		return fname08h.getReference();
	}

	/**
	 * Getter for fname08h attribute.
	 * @return fname08h attribute
	 */
	public String getFname08h() {
		return fname08h.getValue();
	}

	/**
	 * Setter for fname08h attribute.
	 * @param fname08h the new value of fname08h
	 */
	public void setFname08h(String fname08h) {
		this.fname08h.setValue(fname08h);
	}
	/**
	 * Gets the reference for attribute fname08v.
	 * @return the fname08v attribute reference
	 */
	public ElementaryRangeReference getFname08vReference() {
		return fname08v.getReference();
	}

	/**
	 * Getter for fname08v attribute.
	 * @return fname08v attribute
	 */
	public String getFname08v() {
		return fname08v.getValue();
	}

	/**
	 * Setter for fname08v attribute.
	 * @param fname08v the new value of fname08v
	 */
	public void setFname08v(String fname08v) {
		this.fname08v.setValue(fname08v);
	}
	/**
	 * Gets the reference for attribute fname08o.
	 * @return the fname08o attribute reference
	 */
	public ElementaryRangeReference getFname08oReference() {
		return fname08o.getReference();
	}

	/**
	 * Getter for fname08o attribute.
	 * @return fname08o attribute
	 */
	public String getFname08o() {
		return fname08o.getValue();
	}

	/**
	 * Setter for fname08o attribute.
	 * @param fname08o the new value of fname08o
	 */
	public void setFname08o(String fname08o) {
		this.fname08o.setValue(fname08o);
	}
	/**
	 * Gets the reference for attribute lname08c.
	 * @return the lname08c attribute reference
	 */
	public ElementaryRangeReference getLname08cReference() {
		return lname08c.getReference();
	}

	/**
	 * Getter for lname08c attribute.
	 * @return lname08c attribute
	 */
	public String getLname08c() {
		return lname08c.getValue();
	}

	/**
	 * Setter for lname08c attribute.
	 * @param lname08c the new value of lname08c
	 */
	public void setLname08c(String lname08c) {
		this.lname08c.setValue(lname08c);
	}
	/**
	 * Gets the reference for attribute lname08p.
	 * @return the lname08p attribute reference
	 */
	public ElementaryRangeReference getLname08pReference() {
		return lname08p.getReference();
	}

	/**
	 * Getter for lname08p attribute.
	 * @return lname08p attribute
	 */
	public String getLname08p() {
		return lname08p.getValue();
	}

	/**
	 * Setter for lname08p attribute.
	 * @param lname08p the new value of lname08p
	 */
	public void setLname08p(String lname08p) {
		this.lname08p.setValue(lname08p);
	}
	/**
	 * Gets the reference for attribute lname08h.
	 * @return the lname08h attribute reference
	 */
	public ElementaryRangeReference getLname08hReference() {
		return lname08h.getReference();
	}

	/**
	 * Getter for lname08h attribute.
	 * @return lname08h attribute
	 */
	public String getLname08h() {
		return lname08h.getValue();
	}

	/**
	 * Setter for lname08h attribute.
	 * @param lname08h the new value of lname08h
	 */
	public void setLname08h(String lname08h) {
		this.lname08h.setValue(lname08h);
	}
	/**
	 * Gets the reference for attribute lname08v.
	 * @return the lname08v attribute reference
	 */
	public ElementaryRangeReference getLname08vReference() {
		return lname08v.getReference();
	}

	/**
	 * Getter for lname08v attribute.
	 * @return lname08v attribute
	 */
	public String getLname08v() {
		return lname08v.getValue();
	}

	/**
	 * Setter for lname08v attribute.
	 * @param lname08v the new value of lname08v
	 */
	public void setLname08v(String lname08v) {
		this.lname08v.setValue(lname08v);
	}
	/**
	 * Gets the reference for attribute lname08o.
	 * @return the lname08o attribute reference
	 */
	public ElementaryRangeReference getLname08oReference() {
		return lname08o.getReference();
	}

	/**
	 * Getter for lname08o attribute.
	 * @return lname08o attribute
	 */
	public String getLname08o() {
		return lname08o.getValue();
	}

	/**
	 * Setter for lname08o attribute.
	 * @param lname08o the new value of lname08o
	 */
	public void setLname08o(String lname08o) {
		this.lname08o.setValue(lname08o);
	}
	/**
	 * Gets the reference for attribute utype08c.
	 * @return the utype08c attribute reference
	 */
	public ElementaryRangeReference getUtype08cReference() {
		return utype08c.getReference();
	}

	/**
	 * Getter for utype08c attribute.
	 * @return utype08c attribute
	 */
	public String getUtype08c() {
		return utype08c.getValue();
	}

	/**
	 * Setter for utype08c attribute.
	 * @param utype08c the new value of utype08c
	 */
	public void setUtype08c(String utype08c) {
		this.utype08c.setValue(utype08c);
	}
	/**
	 * Gets the reference for attribute utype08p.
	 * @return the utype08p attribute reference
	 */
	public ElementaryRangeReference getUtype08pReference() {
		return utype08p.getReference();
	}

	/**
	 * Getter for utype08p attribute.
	 * @return utype08p attribute
	 */
	public String getUtype08p() {
		return utype08p.getValue();
	}

	/**
	 * Setter for utype08p attribute.
	 * @param utype08p the new value of utype08p
	 */
	public void setUtype08p(String utype08p) {
		this.utype08p.setValue(utype08p);
	}
	/**
	 * Gets the reference for attribute utype08h.
	 * @return the utype08h attribute reference
	 */
	public ElementaryRangeReference getUtype08hReference() {
		return utype08h.getReference();
	}

	/**
	 * Getter for utype08h attribute.
	 * @return utype08h attribute
	 */
	public String getUtype08h() {
		return utype08h.getValue();
	}

	/**
	 * Setter for utype08h attribute.
	 * @param utype08h the new value of utype08h
	 */
	public void setUtype08h(String utype08h) {
		this.utype08h.setValue(utype08h);
	}
	/**
	 * Gets the reference for attribute utype08v.
	 * @return the utype08v attribute reference
	 */
	public ElementaryRangeReference getUtype08vReference() {
		return utype08v.getReference();
	}

	/**
	 * Getter for utype08v attribute.
	 * @return utype08v attribute
	 */
	public String getUtype08v() {
		return utype08v.getValue();
	}

	/**
	 * Setter for utype08v attribute.
	 * @param utype08v the new value of utype08v
	 */
	public void setUtype08v(String utype08v) {
		this.utype08v.setValue(utype08v);
	}
	/**
	 * Gets the reference for attribute utype08o.
	 * @return the utype08o attribute reference
	 */
	public ElementaryRangeReference getUtype08oReference() {
		return utype08o.getReference();
	}

	/**
	 * Getter for utype08o attribute.
	 * @return utype08o attribute
	 */
	public String getUtype08o() {
		return utype08o.getValue();
	}

	/**
	 * Setter for utype08o attribute.
	 * @param utype08o the new value of utype08o
	 */
	public void setUtype08o(String utype08o) {
		this.utype08o.setValue(utype08o);
	}
	/**
	 * Gets the reference for attribute sel0009c.
	 * @return the sel0009c attribute reference
	 */
	public ElementaryRangeReference getSel0009cReference() {
		return sel0009c.getReference();
	}

	/**
	 * Getter for sel0009c attribute.
	 * @return sel0009c attribute
	 */
	public String getSel0009c() {
		return sel0009c.getValue();
	}

	/**
	 * Setter for sel0009c attribute.
	 * @param sel0009c the new value of sel0009c
	 */
	public void setSel0009c(String sel0009c) {
		this.sel0009c.setValue(sel0009c);
	}
	/**
	 * Gets the reference for attribute sel0009p.
	 * @return the sel0009p attribute reference
	 */
	public ElementaryRangeReference getSel0009pReference() {
		return sel0009p.getReference();
	}

	/**
	 * Getter for sel0009p attribute.
	 * @return sel0009p attribute
	 */
	public String getSel0009p() {
		return sel0009p.getValue();
	}

	/**
	 * Setter for sel0009p attribute.
	 * @param sel0009p the new value of sel0009p
	 */
	public void setSel0009p(String sel0009p) {
		this.sel0009p.setValue(sel0009p);
	}
	/**
	 * Gets the reference for attribute sel0009h.
	 * @return the sel0009h attribute reference
	 */
	public ElementaryRangeReference getSel0009hReference() {
		return sel0009h.getReference();
	}

	/**
	 * Getter for sel0009h attribute.
	 * @return sel0009h attribute
	 */
	public String getSel0009h() {
		return sel0009h.getValue();
	}

	/**
	 * Setter for sel0009h attribute.
	 * @param sel0009h the new value of sel0009h
	 */
	public void setSel0009h(String sel0009h) {
		this.sel0009h.setValue(sel0009h);
	}
	/**
	 * Gets the reference for attribute sel0009v.
	 * @return the sel0009v attribute reference
	 */
	public ElementaryRangeReference getSel0009vReference() {
		return sel0009v.getReference();
	}

	/**
	 * Getter for sel0009v attribute.
	 * @return sel0009v attribute
	 */
	public String getSel0009v() {
		return sel0009v.getValue();
	}

	/**
	 * Setter for sel0009v attribute.
	 * @param sel0009v the new value of sel0009v
	 */
	public void setSel0009v(String sel0009v) {
		this.sel0009v.setValue(sel0009v);
	}
	/**
	 * Gets the reference for attribute sel0009o.
	 * @return the sel0009o attribute reference
	 */
	public ElementaryRangeReference getSel0009oReference() {
		return sel0009o.getReference();
	}

	/**
	 * Getter for sel0009o attribute.
	 * @return sel0009o attribute
	 */
	public String getSel0009o() {
		return sel0009o.getValue();
	}

	/**
	 * Setter for sel0009o attribute.
	 * @param sel0009o the new value of sel0009o
	 */
	public void setSel0009o(String sel0009o) {
		this.sel0009o.setValue(sel0009o);
	}
	/**
	 * Gets the reference for attribute usrid09c.
	 * @return the usrid09c attribute reference
	 */
	public ElementaryRangeReference getUsrid09cReference() {
		return usrid09c.getReference();
	}

	/**
	 * Getter for usrid09c attribute.
	 * @return usrid09c attribute
	 */
	public String getUsrid09c() {
		return usrid09c.getValue();
	}

	/**
	 * Setter for usrid09c attribute.
	 * @param usrid09c the new value of usrid09c
	 */
	public void setUsrid09c(String usrid09c) {
		this.usrid09c.setValue(usrid09c);
	}
	/**
	 * Gets the reference for attribute usrid09p.
	 * @return the usrid09p attribute reference
	 */
	public ElementaryRangeReference getUsrid09pReference() {
		return usrid09p.getReference();
	}

	/**
	 * Getter for usrid09p attribute.
	 * @return usrid09p attribute
	 */
	public String getUsrid09p() {
		return usrid09p.getValue();
	}

	/**
	 * Setter for usrid09p attribute.
	 * @param usrid09p the new value of usrid09p
	 */
	public void setUsrid09p(String usrid09p) {
		this.usrid09p.setValue(usrid09p);
	}
	/**
	 * Gets the reference for attribute usrid09h.
	 * @return the usrid09h attribute reference
	 */
	public ElementaryRangeReference getUsrid09hReference() {
		return usrid09h.getReference();
	}

	/**
	 * Getter for usrid09h attribute.
	 * @return usrid09h attribute
	 */
	public String getUsrid09h() {
		return usrid09h.getValue();
	}

	/**
	 * Setter for usrid09h attribute.
	 * @param usrid09h the new value of usrid09h
	 */
	public void setUsrid09h(String usrid09h) {
		this.usrid09h.setValue(usrid09h);
	}
	/**
	 * Gets the reference for attribute usrid09v.
	 * @return the usrid09v attribute reference
	 */
	public ElementaryRangeReference getUsrid09vReference() {
		return usrid09v.getReference();
	}

	/**
	 * Getter for usrid09v attribute.
	 * @return usrid09v attribute
	 */
	public String getUsrid09v() {
		return usrid09v.getValue();
	}

	/**
	 * Setter for usrid09v attribute.
	 * @param usrid09v the new value of usrid09v
	 */
	public void setUsrid09v(String usrid09v) {
		this.usrid09v.setValue(usrid09v);
	}
	/**
	 * Gets the reference for attribute usrid09o.
	 * @return the usrid09o attribute reference
	 */
	public ElementaryRangeReference getUsrid09oReference() {
		return usrid09o.getReference();
	}

	/**
	 * Getter for usrid09o attribute.
	 * @return usrid09o attribute
	 */
	public String getUsrid09o() {
		return usrid09o.getValue();
	}

	/**
	 * Setter for usrid09o attribute.
	 * @param usrid09o the new value of usrid09o
	 */
	public void setUsrid09o(String usrid09o) {
		this.usrid09o.setValue(usrid09o);
	}
	/**
	 * Gets the reference for attribute fname09c.
	 * @return the fname09c attribute reference
	 */
	public ElementaryRangeReference getFname09cReference() {
		return fname09c.getReference();
	}

	/**
	 * Getter for fname09c attribute.
	 * @return fname09c attribute
	 */
	public String getFname09c() {
		return fname09c.getValue();
	}

	/**
	 * Setter for fname09c attribute.
	 * @param fname09c the new value of fname09c
	 */
	public void setFname09c(String fname09c) {
		this.fname09c.setValue(fname09c);
	}
	/**
	 * Gets the reference for attribute fname09p.
	 * @return the fname09p attribute reference
	 */
	public ElementaryRangeReference getFname09pReference() {
		return fname09p.getReference();
	}

	/**
	 * Getter for fname09p attribute.
	 * @return fname09p attribute
	 */
	public String getFname09p() {
		return fname09p.getValue();
	}

	/**
	 * Setter for fname09p attribute.
	 * @param fname09p the new value of fname09p
	 */
	public void setFname09p(String fname09p) {
		this.fname09p.setValue(fname09p);
	}
	/**
	 * Gets the reference for attribute fname09h.
	 * @return the fname09h attribute reference
	 */
	public ElementaryRangeReference getFname09hReference() {
		return fname09h.getReference();
	}

	/**
	 * Getter for fname09h attribute.
	 * @return fname09h attribute
	 */
	public String getFname09h() {
		return fname09h.getValue();
	}

	/**
	 * Setter for fname09h attribute.
	 * @param fname09h the new value of fname09h
	 */
	public void setFname09h(String fname09h) {
		this.fname09h.setValue(fname09h);
	}
	/**
	 * Gets the reference for attribute fname09v.
	 * @return the fname09v attribute reference
	 */
	public ElementaryRangeReference getFname09vReference() {
		return fname09v.getReference();
	}

	/**
	 * Getter for fname09v attribute.
	 * @return fname09v attribute
	 */
	public String getFname09v() {
		return fname09v.getValue();
	}

	/**
	 * Setter for fname09v attribute.
	 * @param fname09v the new value of fname09v
	 */
	public void setFname09v(String fname09v) {
		this.fname09v.setValue(fname09v);
	}
	/**
	 * Gets the reference for attribute fname09o.
	 * @return the fname09o attribute reference
	 */
	public ElementaryRangeReference getFname09oReference() {
		return fname09o.getReference();
	}

	/**
	 * Getter for fname09o attribute.
	 * @return fname09o attribute
	 */
	public String getFname09o() {
		return fname09o.getValue();
	}

	/**
	 * Setter for fname09o attribute.
	 * @param fname09o the new value of fname09o
	 */
	public void setFname09o(String fname09o) {
		this.fname09o.setValue(fname09o);
	}
	/**
	 * Gets the reference for attribute lname09c.
	 * @return the lname09c attribute reference
	 */
	public ElementaryRangeReference getLname09cReference() {
		return lname09c.getReference();
	}

	/**
	 * Getter for lname09c attribute.
	 * @return lname09c attribute
	 */
	public String getLname09c() {
		return lname09c.getValue();
	}

	/**
	 * Setter for lname09c attribute.
	 * @param lname09c the new value of lname09c
	 */
	public void setLname09c(String lname09c) {
		this.lname09c.setValue(lname09c);
	}
	/**
	 * Gets the reference for attribute lname09p.
	 * @return the lname09p attribute reference
	 */
	public ElementaryRangeReference getLname09pReference() {
		return lname09p.getReference();
	}

	/**
	 * Getter for lname09p attribute.
	 * @return lname09p attribute
	 */
	public String getLname09p() {
		return lname09p.getValue();
	}

	/**
	 * Setter for lname09p attribute.
	 * @param lname09p the new value of lname09p
	 */
	public void setLname09p(String lname09p) {
		this.lname09p.setValue(lname09p);
	}
	/**
	 * Gets the reference for attribute lname09h.
	 * @return the lname09h attribute reference
	 */
	public ElementaryRangeReference getLname09hReference() {
		return lname09h.getReference();
	}

	/**
	 * Getter for lname09h attribute.
	 * @return lname09h attribute
	 */
	public String getLname09h() {
		return lname09h.getValue();
	}

	/**
	 * Setter for lname09h attribute.
	 * @param lname09h the new value of lname09h
	 */
	public void setLname09h(String lname09h) {
		this.lname09h.setValue(lname09h);
	}
	/**
	 * Gets the reference for attribute lname09v.
	 * @return the lname09v attribute reference
	 */
	public ElementaryRangeReference getLname09vReference() {
		return lname09v.getReference();
	}

	/**
	 * Getter for lname09v attribute.
	 * @return lname09v attribute
	 */
	public String getLname09v() {
		return lname09v.getValue();
	}

	/**
	 * Setter for lname09v attribute.
	 * @param lname09v the new value of lname09v
	 */
	public void setLname09v(String lname09v) {
		this.lname09v.setValue(lname09v);
	}
	/**
	 * Gets the reference for attribute lname09o.
	 * @return the lname09o attribute reference
	 */
	public ElementaryRangeReference getLname09oReference() {
		return lname09o.getReference();
	}

	/**
	 * Getter for lname09o attribute.
	 * @return lname09o attribute
	 */
	public String getLname09o() {
		return lname09o.getValue();
	}

	/**
	 * Setter for lname09o attribute.
	 * @param lname09o the new value of lname09o
	 */
	public void setLname09o(String lname09o) {
		this.lname09o.setValue(lname09o);
	}
	/**
	 * Gets the reference for attribute utype09c.
	 * @return the utype09c attribute reference
	 */
	public ElementaryRangeReference getUtype09cReference() {
		return utype09c.getReference();
	}

	/**
	 * Getter for utype09c attribute.
	 * @return utype09c attribute
	 */
	public String getUtype09c() {
		return utype09c.getValue();
	}

	/**
	 * Setter for utype09c attribute.
	 * @param utype09c the new value of utype09c
	 */
	public void setUtype09c(String utype09c) {
		this.utype09c.setValue(utype09c);
	}
	/**
	 * Gets the reference for attribute utype09p.
	 * @return the utype09p attribute reference
	 */
	public ElementaryRangeReference getUtype09pReference() {
		return utype09p.getReference();
	}

	/**
	 * Getter for utype09p attribute.
	 * @return utype09p attribute
	 */
	public String getUtype09p() {
		return utype09p.getValue();
	}

	/**
	 * Setter for utype09p attribute.
	 * @param utype09p the new value of utype09p
	 */
	public void setUtype09p(String utype09p) {
		this.utype09p.setValue(utype09p);
	}
	/**
	 * Gets the reference for attribute utype09h.
	 * @return the utype09h attribute reference
	 */
	public ElementaryRangeReference getUtype09hReference() {
		return utype09h.getReference();
	}

	/**
	 * Getter for utype09h attribute.
	 * @return utype09h attribute
	 */
	public String getUtype09h() {
		return utype09h.getValue();
	}

	/**
	 * Setter for utype09h attribute.
	 * @param utype09h the new value of utype09h
	 */
	public void setUtype09h(String utype09h) {
		this.utype09h.setValue(utype09h);
	}
	/**
	 * Gets the reference for attribute utype09v.
	 * @return the utype09v attribute reference
	 */
	public ElementaryRangeReference getUtype09vReference() {
		return utype09v.getReference();
	}

	/**
	 * Getter for utype09v attribute.
	 * @return utype09v attribute
	 */
	public String getUtype09v() {
		return utype09v.getValue();
	}

	/**
	 * Setter for utype09v attribute.
	 * @param utype09v the new value of utype09v
	 */
	public void setUtype09v(String utype09v) {
		this.utype09v.setValue(utype09v);
	}
	/**
	 * Gets the reference for attribute utype09o.
	 * @return the utype09o attribute reference
	 */
	public ElementaryRangeReference getUtype09oReference() {
		return utype09o.getReference();
	}

	/**
	 * Getter for utype09o attribute.
	 * @return utype09o attribute
	 */
	public String getUtype09o() {
		return utype09o.getValue();
	}

	/**
	 * Setter for utype09o attribute.
	 * @param utype09o the new value of utype09o
	 */
	public void setUtype09o(String utype09o) {
		this.utype09o.setValue(utype09o);
	}
	/**
	 * Gets the reference for attribute sel0010c.
	 * @return the sel0010c attribute reference
	 */
	public ElementaryRangeReference getSel0010cReference() {
		return sel0010c.getReference();
	}

	/**
	 * Getter for sel0010c attribute.
	 * @return sel0010c attribute
	 */
	public String getSel0010c() {
		return sel0010c.getValue();
	}

	/**
	 * Setter for sel0010c attribute.
	 * @param sel0010c the new value of sel0010c
	 */
	public void setSel0010c(String sel0010c) {
		this.sel0010c.setValue(sel0010c);
	}
	/**
	 * Gets the reference for attribute sel0010p.
	 * @return the sel0010p attribute reference
	 */
	public ElementaryRangeReference getSel0010pReference() {
		return sel0010p.getReference();
	}

	/**
	 * Getter for sel0010p attribute.
	 * @return sel0010p attribute
	 */
	public String getSel0010p() {
		return sel0010p.getValue();
	}

	/**
	 * Setter for sel0010p attribute.
	 * @param sel0010p the new value of sel0010p
	 */
	public void setSel0010p(String sel0010p) {
		this.sel0010p.setValue(sel0010p);
	}
	/**
	 * Gets the reference for attribute sel0010h.
	 * @return the sel0010h attribute reference
	 */
	public ElementaryRangeReference getSel0010hReference() {
		return sel0010h.getReference();
	}

	/**
	 * Getter for sel0010h attribute.
	 * @return sel0010h attribute
	 */
	public String getSel0010h() {
		return sel0010h.getValue();
	}

	/**
	 * Setter for sel0010h attribute.
	 * @param sel0010h the new value of sel0010h
	 */
	public void setSel0010h(String sel0010h) {
		this.sel0010h.setValue(sel0010h);
	}
	/**
	 * Gets the reference for attribute sel0010v.
	 * @return the sel0010v attribute reference
	 */
	public ElementaryRangeReference getSel0010vReference() {
		return sel0010v.getReference();
	}

	/**
	 * Getter for sel0010v attribute.
	 * @return sel0010v attribute
	 */
	public String getSel0010v() {
		return sel0010v.getValue();
	}

	/**
	 * Setter for sel0010v attribute.
	 * @param sel0010v the new value of sel0010v
	 */
	public void setSel0010v(String sel0010v) {
		this.sel0010v.setValue(sel0010v);
	}
	/**
	 * Gets the reference for attribute sel0010o.
	 * @return the sel0010o attribute reference
	 */
	public ElementaryRangeReference getSel0010oReference() {
		return sel0010o.getReference();
	}

	/**
	 * Getter for sel0010o attribute.
	 * @return sel0010o attribute
	 */
	public String getSel0010o() {
		return sel0010o.getValue();
	}

	/**
	 * Setter for sel0010o attribute.
	 * @param sel0010o the new value of sel0010o
	 */
	public void setSel0010o(String sel0010o) {
		this.sel0010o.setValue(sel0010o);
	}
	/**
	 * Gets the reference for attribute usrid10c.
	 * @return the usrid10c attribute reference
	 */
	public ElementaryRangeReference getUsrid10cReference() {
		return usrid10c.getReference();
	}

	/**
	 * Getter for usrid10c attribute.
	 * @return usrid10c attribute
	 */
	public String getUsrid10c() {
		return usrid10c.getValue();
	}

	/**
	 * Setter for usrid10c attribute.
	 * @param usrid10c the new value of usrid10c
	 */
	public void setUsrid10c(String usrid10c) {
		this.usrid10c.setValue(usrid10c);
	}
	/**
	 * Gets the reference for attribute usrid10p.
	 * @return the usrid10p attribute reference
	 */
	public ElementaryRangeReference getUsrid10pReference() {
		return usrid10p.getReference();
	}

	/**
	 * Getter for usrid10p attribute.
	 * @return usrid10p attribute
	 */
	public String getUsrid10p() {
		return usrid10p.getValue();
	}

	/**
	 * Setter for usrid10p attribute.
	 * @param usrid10p the new value of usrid10p
	 */
	public void setUsrid10p(String usrid10p) {
		this.usrid10p.setValue(usrid10p);
	}
	/**
	 * Gets the reference for attribute usrid10h.
	 * @return the usrid10h attribute reference
	 */
	public ElementaryRangeReference getUsrid10hReference() {
		return usrid10h.getReference();
	}

	/**
	 * Getter for usrid10h attribute.
	 * @return usrid10h attribute
	 */
	public String getUsrid10h() {
		return usrid10h.getValue();
	}

	/**
	 * Setter for usrid10h attribute.
	 * @param usrid10h the new value of usrid10h
	 */
	public void setUsrid10h(String usrid10h) {
		this.usrid10h.setValue(usrid10h);
	}
	/**
	 * Gets the reference for attribute usrid10v.
	 * @return the usrid10v attribute reference
	 */
	public ElementaryRangeReference getUsrid10vReference() {
		return usrid10v.getReference();
	}

	/**
	 * Getter for usrid10v attribute.
	 * @return usrid10v attribute
	 */
	public String getUsrid10v() {
		return usrid10v.getValue();
	}

	/**
	 * Setter for usrid10v attribute.
	 * @param usrid10v the new value of usrid10v
	 */
	public void setUsrid10v(String usrid10v) {
		this.usrid10v.setValue(usrid10v);
	}
	/**
	 * Gets the reference for attribute usrid10o.
	 * @return the usrid10o attribute reference
	 */
	public ElementaryRangeReference getUsrid10oReference() {
		return usrid10o.getReference();
	}

	/**
	 * Getter for usrid10o attribute.
	 * @return usrid10o attribute
	 */
	public String getUsrid10o() {
		return usrid10o.getValue();
	}

	/**
	 * Setter for usrid10o attribute.
	 * @param usrid10o the new value of usrid10o
	 */
	public void setUsrid10o(String usrid10o) {
		this.usrid10o.setValue(usrid10o);
	}
	/**
	 * Gets the reference for attribute fname10c.
	 * @return the fname10c attribute reference
	 */
	public ElementaryRangeReference getFname10cReference() {
		return fname10c.getReference();
	}

	/**
	 * Getter for fname10c attribute.
	 * @return fname10c attribute
	 */
	public String getFname10c() {
		return fname10c.getValue();
	}

	/**
	 * Setter for fname10c attribute.
	 * @param fname10c the new value of fname10c
	 */
	public void setFname10c(String fname10c) {
		this.fname10c.setValue(fname10c);
	}
	/**
	 * Gets the reference for attribute fname10p.
	 * @return the fname10p attribute reference
	 */
	public ElementaryRangeReference getFname10pReference() {
		return fname10p.getReference();
	}

	/**
	 * Getter for fname10p attribute.
	 * @return fname10p attribute
	 */
	public String getFname10p() {
		return fname10p.getValue();
	}

	/**
	 * Setter for fname10p attribute.
	 * @param fname10p the new value of fname10p
	 */
	public void setFname10p(String fname10p) {
		this.fname10p.setValue(fname10p);
	}
	/**
	 * Gets the reference for attribute fname10h.
	 * @return the fname10h attribute reference
	 */
	public ElementaryRangeReference getFname10hReference() {
		return fname10h.getReference();
	}

	/**
	 * Getter for fname10h attribute.
	 * @return fname10h attribute
	 */
	public String getFname10h() {
		return fname10h.getValue();
	}

	/**
	 * Setter for fname10h attribute.
	 * @param fname10h the new value of fname10h
	 */
	public void setFname10h(String fname10h) {
		this.fname10h.setValue(fname10h);
	}
	/**
	 * Gets the reference for attribute fname10v.
	 * @return the fname10v attribute reference
	 */
	public ElementaryRangeReference getFname10vReference() {
		return fname10v.getReference();
	}

	/**
	 * Getter for fname10v attribute.
	 * @return fname10v attribute
	 */
	public String getFname10v() {
		return fname10v.getValue();
	}

	/**
	 * Setter for fname10v attribute.
	 * @param fname10v the new value of fname10v
	 */
	public void setFname10v(String fname10v) {
		this.fname10v.setValue(fname10v);
	}
	/**
	 * Gets the reference for attribute fname10o.
	 * @return the fname10o attribute reference
	 */
	public ElementaryRangeReference getFname10oReference() {
		return fname10o.getReference();
	}

	/**
	 * Getter for fname10o attribute.
	 * @return fname10o attribute
	 */
	public String getFname10o() {
		return fname10o.getValue();
	}

	/**
	 * Setter for fname10o attribute.
	 * @param fname10o the new value of fname10o
	 */
	public void setFname10o(String fname10o) {
		this.fname10o.setValue(fname10o);
	}
	/**
	 * Gets the reference for attribute lname10c.
	 * @return the lname10c attribute reference
	 */
	public ElementaryRangeReference getLname10cReference() {
		return lname10c.getReference();
	}

	/**
	 * Getter for lname10c attribute.
	 * @return lname10c attribute
	 */
	public String getLname10c() {
		return lname10c.getValue();
	}

	/**
	 * Setter for lname10c attribute.
	 * @param lname10c the new value of lname10c
	 */
	public void setLname10c(String lname10c) {
		this.lname10c.setValue(lname10c);
	}
	/**
	 * Gets the reference for attribute lname10p.
	 * @return the lname10p attribute reference
	 */
	public ElementaryRangeReference getLname10pReference() {
		return lname10p.getReference();
	}

	/**
	 * Getter for lname10p attribute.
	 * @return lname10p attribute
	 */
	public String getLname10p() {
		return lname10p.getValue();
	}

	/**
	 * Setter for lname10p attribute.
	 * @param lname10p the new value of lname10p
	 */
	public void setLname10p(String lname10p) {
		this.lname10p.setValue(lname10p);
	}
	/**
	 * Gets the reference for attribute lname10h.
	 * @return the lname10h attribute reference
	 */
	public ElementaryRangeReference getLname10hReference() {
		return lname10h.getReference();
	}

	/**
	 * Getter for lname10h attribute.
	 * @return lname10h attribute
	 */
	public String getLname10h() {
		return lname10h.getValue();
	}

	/**
	 * Setter for lname10h attribute.
	 * @param lname10h the new value of lname10h
	 */
	public void setLname10h(String lname10h) {
		this.lname10h.setValue(lname10h);
	}
	/**
	 * Gets the reference for attribute lname10v.
	 * @return the lname10v attribute reference
	 */
	public ElementaryRangeReference getLname10vReference() {
		return lname10v.getReference();
	}

	/**
	 * Getter for lname10v attribute.
	 * @return lname10v attribute
	 */
	public String getLname10v() {
		return lname10v.getValue();
	}

	/**
	 * Setter for lname10v attribute.
	 * @param lname10v the new value of lname10v
	 */
	public void setLname10v(String lname10v) {
		this.lname10v.setValue(lname10v);
	}
	/**
	 * Gets the reference for attribute lname10o.
	 * @return the lname10o attribute reference
	 */
	public ElementaryRangeReference getLname10oReference() {
		return lname10o.getReference();
	}

	/**
	 * Getter for lname10o attribute.
	 * @return lname10o attribute
	 */
	public String getLname10o() {
		return lname10o.getValue();
	}

	/**
	 * Setter for lname10o attribute.
	 * @param lname10o the new value of lname10o
	 */
	public void setLname10o(String lname10o) {
		this.lname10o.setValue(lname10o);
	}
	/**
	 * Gets the reference for attribute utype10c.
	 * @return the utype10c attribute reference
	 */
	public ElementaryRangeReference getUtype10cReference() {
		return utype10c.getReference();
	}

	/**
	 * Getter for utype10c attribute.
	 * @return utype10c attribute
	 */
	public String getUtype10c() {
		return utype10c.getValue();
	}

	/**
	 * Setter for utype10c attribute.
	 * @param utype10c the new value of utype10c
	 */
	public void setUtype10c(String utype10c) {
		this.utype10c.setValue(utype10c);
	}
	/**
	 * Gets the reference for attribute utype10p.
	 * @return the utype10p attribute reference
	 */
	public ElementaryRangeReference getUtype10pReference() {
		return utype10p.getReference();
	}

	/**
	 * Getter for utype10p attribute.
	 * @return utype10p attribute
	 */
	public String getUtype10p() {
		return utype10p.getValue();
	}

	/**
	 * Setter for utype10p attribute.
	 * @param utype10p the new value of utype10p
	 */
	public void setUtype10p(String utype10p) {
		this.utype10p.setValue(utype10p);
	}
	/**
	 * Gets the reference for attribute utype10h.
	 * @return the utype10h attribute reference
	 */
	public ElementaryRangeReference getUtype10hReference() {
		return utype10h.getReference();
	}

	/**
	 * Getter for utype10h attribute.
	 * @return utype10h attribute
	 */
	public String getUtype10h() {
		return utype10h.getValue();
	}

	/**
	 * Setter for utype10h attribute.
	 * @param utype10h the new value of utype10h
	 */
	public void setUtype10h(String utype10h) {
		this.utype10h.setValue(utype10h);
	}
	/**
	 * Gets the reference for attribute utype10v.
	 * @return the utype10v attribute reference
	 */
	public ElementaryRangeReference getUtype10vReference() {
		return utype10v.getReference();
	}

	/**
	 * Getter for utype10v attribute.
	 * @return utype10v attribute
	 */
	public String getUtype10v() {
		return utype10v.getValue();
	}

	/**
	 * Setter for utype10v attribute.
	 * @param utype10v the new value of utype10v
	 */
	public void setUtype10v(String utype10v) {
		this.utype10v.setValue(utype10v);
	}
	/**
	 * Gets the reference for attribute utype10o.
	 * @return the utype10o attribute reference
	 */
	public ElementaryRangeReference getUtype10oReference() {
		return utype10o.getReference();
	}

	/**
	 * Getter for utype10o attribute.
	 * @return utype10o attribute
	 */
	public String getUtype10o() {
		return utype10o.getValue();
	}

	/**
	 * Setter for utype10o attribute.
	 * @param utype10o the new value of utype10o
	 */
	public void setUtype10o(String utype10o) {
		this.utype10o.setValue(utype10o);
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
