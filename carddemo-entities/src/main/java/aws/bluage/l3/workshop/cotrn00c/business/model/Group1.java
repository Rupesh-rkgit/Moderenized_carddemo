package aws.bluage.l3.workshop.cotrn00c.business.model;

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
 * <p>About 'cotrn0ai' field, <br>uml entity: aws.bluage.l3.workshop.cotrn00c.business.model.Cotrn0ai
 * <br></p>
 * 
 * <p>About 'cotrn0ao' field, <br>uml entity: aws.bluage.l3.workshop.cotrn00c.business.model.Cotrn0ao
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
	private final Group cotrn0ai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(cotrn0ai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(cotrn0ai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(cotrn0ai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(cotrn0ai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(cotrn0ai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(cotrn0ai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(cotrn0ai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(cotrn0ai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(cotrn0ai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(cotrn0ai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary pagenuml = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(cotrn0ai);
	private final Elementary pagenumf = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary pagenuma = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary pagenumi = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary trnidinl = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(cotrn0ai);
	private final Elementary trnidinf = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary trnidina = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnidini = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary sel0001l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(cotrn0ai);
	private final Elementary sel0001f = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary sel0001a = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0001i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid01l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(cotrn0ai);
	private final Elementary trnid01f = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary trnid01a = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid01i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate01l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(cotrn0ai);
	private final Elementary tdate01f = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary tdate01a = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate01i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc01l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(cotrn0ai);
	private final Elementary tdesc01f = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary tdesc01a = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc01i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt001l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union13 = new Union(cotrn0ai);
	private final Elementary tamt001f = new Elementary(union13,new AlphanumericType(1));
	private final Group group12 = new Group(union13);
	private final Elementary tamt001a = new Elementary(group12,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt001i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary sel0002l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union14 = new Union(cotrn0ai);
	private final Elementary sel0002f = new Elementary(union14,new AlphanumericType(1));
	private final Group group13 = new Group(union14);
	private final Elementary sel0002a = new Elementary(group13,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0002i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid02l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union15 = new Union(cotrn0ai);
	private final Elementary trnid02f = new Elementary(union15,new AlphanumericType(1));
	private final Group group14 = new Group(union15);
	private final Elementary trnid02a = new Elementary(group14,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid02i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate02l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union16 = new Union(cotrn0ai);
	private final Elementary tdate02f = new Elementary(union16,new AlphanumericType(1));
	private final Group group15 = new Group(union16);
	private final Elementary tdate02a = new Elementary(group15,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate02i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc02l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union17 = new Union(cotrn0ai);
	private final Elementary tdesc02f = new Elementary(union17,new AlphanumericType(1));
	private final Group group16 = new Group(union17);
	private final Elementary tdesc02a = new Elementary(group16,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc02i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt002l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union18 = new Union(cotrn0ai);
	private final Elementary tamt002f = new Elementary(union18,new AlphanumericType(1));
	private final Group group17 = new Group(union18);
	private final Elementary tamt002a = new Elementary(group17,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt002i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary sel0003l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union19 = new Union(cotrn0ai);
	private final Elementary sel0003f = new Elementary(union19,new AlphanumericType(1));
	private final Group group18 = new Group(union19);
	private final Elementary sel0003a = new Elementary(group18,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0003i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid03l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union20 = new Union(cotrn0ai);
	private final Elementary trnid03f = new Elementary(union20,new AlphanumericType(1));
	private final Group group19 = new Group(union20);
	private final Elementary trnid03a = new Elementary(group19,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid03i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate03l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union21 = new Union(cotrn0ai);
	private final Elementary tdate03f = new Elementary(union21,new AlphanumericType(1));
	private final Group group20 = new Group(union21);
	private final Elementary tdate03a = new Elementary(group20,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate03i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc03l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union22 = new Union(cotrn0ai);
	private final Elementary tdesc03f = new Elementary(union22,new AlphanumericType(1));
	private final Group group21 = new Group(union22);
	private final Elementary tdesc03a = new Elementary(group21,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc03i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt003l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union23 = new Union(cotrn0ai);
	private final Elementary tamt003f = new Elementary(union23,new AlphanumericType(1));
	private final Group group22 = new Group(union23);
	private final Elementary tamt003a = new Elementary(group22,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt003i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary sel0004l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union24 = new Union(cotrn0ai);
	private final Elementary sel0004f = new Elementary(union24,new AlphanumericType(1));
	private final Group group23 = new Group(union24);
	private final Elementary sel0004a = new Elementary(group23,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0004i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid04l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union25 = new Union(cotrn0ai);
	private final Elementary trnid04f = new Elementary(union25,new AlphanumericType(1));
	private final Group group24 = new Group(union25);
	private final Elementary trnid04a = new Elementary(group24,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid04i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate04l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union26 = new Union(cotrn0ai);
	private final Elementary tdate04f = new Elementary(union26,new AlphanumericType(1));
	private final Group group25 = new Group(union26);
	private final Elementary tdate04a = new Elementary(group25,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate04i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc04l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union27 = new Union(cotrn0ai);
	private final Elementary tdesc04f = new Elementary(union27,new AlphanumericType(1));
	private final Group group26 = new Group(union27);
	private final Elementary tdesc04a = new Elementary(group26,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc04i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt004l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union28 = new Union(cotrn0ai);
	private final Elementary tamt004f = new Elementary(union28,new AlphanumericType(1));
	private final Group group27 = new Group(union28);
	private final Elementary tamt004a = new Elementary(group27,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt004i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary sel0005l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union29 = new Union(cotrn0ai);
	private final Elementary sel0005f = new Elementary(union29,new AlphanumericType(1));
	private final Group group28 = new Group(union29);
	private final Elementary sel0005a = new Elementary(group28,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0005i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid05l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union30 = new Union(cotrn0ai);
	private final Elementary trnid05f = new Elementary(union30,new AlphanumericType(1));
	private final Group group29 = new Group(union30);
	private final Elementary trnid05a = new Elementary(group29,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid05i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate05l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union31 = new Union(cotrn0ai);
	private final Elementary tdate05f = new Elementary(union31,new AlphanumericType(1));
	private final Group group30 = new Group(union31);
	private final Elementary tdate05a = new Elementary(group30,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate05i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc05l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union32 = new Union(cotrn0ai);
	private final Elementary tdesc05f = new Elementary(union32,new AlphanumericType(1));
	private final Group group31 = new Group(union32);
	private final Elementary tdesc05a = new Elementary(group31,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc05i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt005l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union33 = new Union(cotrn0ai);
	private final Elementary tamt005f = new Elementary(union33,new AlphanumericType(1));
	private final Group group32 = new Group(union33);
	private final Elementary tamt005a = new Elementary(group32,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler33 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt005i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary sel0006l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union34 = new Union(cotrn0ai);
	private final Elementary sel0006f = new Elementary(union34,new AlphanumericType(1));
	private final Group group33 = new Group(union34);
	private final Elementary sel0006a = new Elementary(group33,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler34 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0006i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid06l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union35 = new Union(cotrn0ai);
	private final Elementary trnid06f = new Elementary(union35,new AlphanumericType(1));
	private final Group group34 = new Group(union35);
	private final Elementary trnid06a = new Elementary(group34,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler35 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid06i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate06l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union36 = new Union(cotrn0ai);
	private final Elementary tdate06f = new Elementary(union36,new AlphanumericType(1));
	private final Group group35 = new Group(union36);
	private final Elementary tdate06a = new Elementary(group35,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler36 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate06i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc06l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union37 = new Union(cotrn0ai);
	private final Elementary tdesc06f = new Elementary(union37,new AlphanumericType(1));
	private final Group group36 = new Group(union37);
	private final Elementary tdesc06a = new Elementary(group36,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler37 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc06i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt006l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union38 = new Union(cotrn0ai);
	private final Elementary tamt006f = new Elementary(union38,new AlphanumericType(1));
	private final Group group37 = new Group(union38);
	private final Elementary tamt006a = new Elementary(group37,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler38 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt006i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary sel0007l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union39 = new Union(cotrn0ai);
	private final Elementary sel0007f = new Elementary(union39,new AlphanumericType(1));
	private final Group group38 = new Group(union39);
	private final Elementary sel0007a = new Elementary(group38,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler39 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0007i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid07l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union40 = new Union(cotrn0ai);
	private final Elementary trnid07f = new Elementary(union40,new AlphanumericType(1));
	private final Group group39 = new Group(union40);
	private final Elementary trnid07a = new Elementary(group39,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler40 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid07i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate07l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union41 = new Union(cotrn0ai);
	private final Elementary tdate07f = new Elementary(union41,new AlphanumericType(1));
	private final Group group40 = new Group(union41);
	private final Elementary tdate07a = new Elementary(group40,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler41 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate07i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc07l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union42 = new Union(cotrn0ai);
	private final Elementary tdesc07f = new Elementary(union42,new AlphanumericType(1));
	private final Group group41 = new Group(union42);
	private final Elementary tdesc07a = new Elementary(group41,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler42 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc07i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt007l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union43 = new Union(cotrn0ai);
	private final Elementary tamt007f = new Elementary(union43,new AlphanumericType(1));
	private final Group group42 = new Group(union43);
	private final Elementary tamt007a = new Elementary(group42,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler43 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt007i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary sel0008l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union44 = new Union(cotrn0ai);
	private final Elementary sel0008f = new Elementary(union44,new AlphanumericType(1));
	private final Group group43 = new Group(union44);
	private final Elementary sel0008a = new Elementary(group43,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler44 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0008i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid08l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union45 = new Union(cotrn0ai);
	private final Elementary trnid08f = new Elementary(union45,new AlphanumericType(1));
	private final Group group44 = new Group(union45);
	private final Elementary trnid08a = new Elementary(group44,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler45 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid08i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate08l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union46 = new Union(cotrn0ai);
	private final Elementary tdate08f = new Elementary(union46,new AlphanumericType(1));
	private final Group group45 = new Group(union46);
	private final Elementary tdate08a = new Elementary(group45,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler46 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate08i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc08l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union47 = new Union(cotrn0ai);
	private final Elementary tdesc08f = new Elementary(union47,new AlphanumericType(1));
	private final Group group46 = new Group(union47);
	private final Elementary tdesc08a = new Elementary(group46,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler47 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc08i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt008l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union48 = new Union(cotrn0ai);
	private final Elementary tamt008f = new Elementary(union48,new AlphanumericType(1));
	private final Group group47 = new Group(union48);
	private final Elementary tamt008a = new Elementary(group47,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler48 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt008i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary sel0009l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union49 = new Union(cotrn0ai);
	private final Elementary sel0009f = new Elementary(union49,new AlphanumericType(1));
	private final Group group48 = new Group(union49);
	private final Elementary sel0009a = new Elementary(group48,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler49 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0009i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid09l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union50 = new Union(cotrn0ai);
	private final Elementary trnid09f = new Elementary(union50,new AlphanumericType(1));
	private final Group group49 = new Group(union50);
	private final Elementary trnid09a = new Elementary(group49,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler50 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid09i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate09l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union51 = new Union(cotrn0ai);
	private final Elementary tdate09f = new Elementary(union51,new AlphanumericType(1));
	private final Group group50 = new Group(union51);
	private final Elementary tdate09a = new Elementary(group50,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler51 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate09i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc09l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union52 = new Union(cotrn0ai);
	private final Elementary tdesc09f = new Elementary(union52,new AlphanumericType(1));
	private final Group group51 = new Group(union52);
	private final Elementary tdesc09a = new Elementary(group51,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler52 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc09i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt009l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union53 = new Union(cotrn0ai);
	private final Elementary tamt009f = new Elementary(union53,new AlphanumericType(1));
	private final Group group52 = new Group(union53);
	private final Elementary tamt009a = new Elementary(group52,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler53 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt009i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary sel0010l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union54 = new Union(cotrn0ai);
	private final Elementary sel0010f = new Elementary(union54,new AlphanumericType(1));
	private final Group group53 = new Group(union54);
	private final Elementary sel0010a = new Elementary(group53,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler54 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary sel0010i = new Elementary(cotrn0ai,new AlphanumericType(1));
	private final Elementary trnid10l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union55 = new Union(cotrn0ai);
	private final Elementary trnid10f = new Elementary(union55,new AlphanumericType(1));
	private final Group group54 = new Group(union55);
	private final Elementary trnid10a = new Elementary(group54,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler55 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary trnid10i = new Elementary(cotrn0ai,new AlphanumericType(16));
	private final Elementary tdate10l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union56 = new Union(cotrn0ai);
	private final Elementary tdate10f = new Elementary(union56,new AlphanumericType(1));
	private final Group group55 = new Group(union56);
	private final Elementary tdate10a = new Elementary(group55,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler56 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdate10i = new Elementary(cotrn0ai,new AlphanumericType(8));
	private final Elementary tdesc10l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union57 = new Union(cotrn0ai);
	private final Elementary tdesc10f = new Elementary(union57,new AlphanumericType(1));
	private final Group group56 = new Group(union57);
	private final Elementary tdesc10a = new Elementary(group56,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler57 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tdesc10i = new Elementary(cotrn0ai,new AlphanumericType(26));
	private final Elementary tamt010l = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union58 = new Union(cotrn0ai);
	private final Elementary tamt010f = new Elementary(union58,new AlphanumericType(1));
	private final Group group57 = new Group(union58);
	private final Elementary tamt010a = new Elementary(group57,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler58 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary tamt010i = new Elementary(cotrn0ai,new AlphanumericType(12));
	private final Elementary errmsgl = new Elementary(cotrn0ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union59 = new Union(cotrn0ai);
	private final Elementary errmsgf = new Elementary(union59,new AlphanumericType(1));
	private final Group group58 = new Group(union59);
	private final Elementary errmsga = new Elementary(group58,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler59 = new Filler(cotrn0ai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(cotrn0ai,new AlphanumericType(78));
	private final Group cotrn0ao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler60 = new Filler(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler61 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(cotrn0ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler62 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(cotrn0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler63 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler64 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler65 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(cotrn0ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler66 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler67 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary pagenumc = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary pagenump = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary pagenumh = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary pagenumv = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary pagenumo = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler68 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnidinc = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnidinp = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnidinh = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnidinv = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnidino = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler69 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0001c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0001p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0001h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0001v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0001o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler70 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid01c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid01p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid01h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid01v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid01o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler71 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate01c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate01p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate01h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate01v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate01o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler72 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc01c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc01p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc01h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc01v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc01o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler73 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt001c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt001p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt001h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt001v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt001o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler74 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0002c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0002p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0002h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0002v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0002o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler75 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid02c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid02p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid02h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid02v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid02o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler76 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate02c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate02p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate02h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate02v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate02o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler77 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc02c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc02p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc02h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc02v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc02o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler78 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt002c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt002p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt002h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt002v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt002o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler79 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0003c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0003p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0003h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0003v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0003o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler80 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid03c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid03p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid03h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid03v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid03o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler81 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate03c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate03p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate03h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate03v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate03o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler82 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc03c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc03p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc03h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc03v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc03o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler83 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt003c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt003p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt003h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt003v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt003o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler84 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0004c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0004p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0004h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0004v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0004o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler85 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid04c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid04p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid04h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid04v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid04o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler86 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate04c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate04p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate04h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate04v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate04o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler87 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc04c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc04p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc04h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc04v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc04o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler88 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt004c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt004p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt004h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt004v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt004o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler89 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0005c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0005p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0005h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0005v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0005o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler90 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid05c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid05p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid05h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid05v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid05o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler91 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate05c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate05p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate05h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate05v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate05o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler92 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc05c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc05p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc05h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc05v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc05o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler93 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt005c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt005p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt005h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt005v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt005o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler94 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0006c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0006p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0006h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0006v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0006o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler95 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid06c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid06p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid06h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid06v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid06o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler96 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate06c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate06p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate06h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate06v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate06o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler97 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc06c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc06p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc06h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc06v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc06o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler98 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt006c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt006p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt006h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt006v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt006o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler99 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0007c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0007p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0007h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0007v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0007o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler100 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid07c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid07p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid07h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid07v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid07o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler101 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate07c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate07p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate07h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate07v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate07o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler102 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc07c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc07p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc07h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc07v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc07o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler103 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt007c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt007p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt007h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt007v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt007o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler104 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0008c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0008p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0008h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0008v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0008o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler105 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid08c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid08p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid08h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid08v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid08o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler106 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate08c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate08p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate08h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate08v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate08o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler107 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc08c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc08p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc08h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc08v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc08o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler108 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt008c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt008p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt008h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt008v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt008o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler109 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0009c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0009p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0009h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0009v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0009o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler110 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid09c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid09p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid09h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid09v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid09o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler111 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate09c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate09p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate09h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate09v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate09o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler112 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc09c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc09p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc09h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc09v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc09o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler113 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt009c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt009p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt009h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt009v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt009o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler114 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary sel0010c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0010p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0010h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0010v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary sel0010o = new Elementary(cotrn0ao,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler115 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary trnid10c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid10p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid10h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid10v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary trnid10o = new Elementary(cotrn0ao,new AlphanumericType(16));
	@SuppressWarnings("unused")
	private final Filler filler116 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdate10c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate10p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate10h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate10v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdate10o = new Elementary(cotrn0ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler117 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tdesc10c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc10p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc10h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc10v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tdesc10o = new Elementary(cotrn0ao,new AlphanumericType(26));
	@SuppressWarnings("unused")
	private final Filler filler118 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary tamt010c = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt010p = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt010h = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt010v = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary tamt010o = new Elementary(cotrn0ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler119 = new Filler(cotrn0ao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(cotrn0ao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(cotrn0ao,new AlphanumericType(78));
	

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
	 * Gets the reference for attribute cotrn0ai.
	 * @return the cotrn0ai attribute reference
	 */
	public RangeReference getCotrn0aiReference() {
		return cotrn0ai.getReference();
	}	
				
	/**
	 * Setter for cotrn0ai .
	 */
   	public void setCotrn0ai(RangeReference reference) {
       	cotrn0ai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute trnid01l.
	 * @return the trnid01l attribute reference
	 */
	public ElementaryRangeReference getTrnid01lReference() {
		return trnid01l.getReference();
	}

	/**
	 * Getter for trnid01l attribute.
	 * @return trnid01l attribute
	 */
	public int getTrnid01l() {
		return trnid01l.getValue();
	}

	/**
	 * Setter for trnid01l attribute.
	 * @param trnid01l the new value of trnid01l
	 */
	public void setTrnid01l(int trnid01l) {
		this.trnid01l.setValue(trnid01l);
	}
	/**
	 * Gets the reference for attribute trnid01f.
	 * @return the trnid01f attribute reference
	 */
	public ElementaryRangeReference getTrnid01fReference() {
		return trnid01f.getReference();
	}

	/**
	 * Getter for trnid01f attribute.
	 * @return trnid01f attribute
	 */
	public String getTrnid01f() {
		return trnid01f.getValue();
	}

	/**
	 * Setter for trnid01f attribute.
	 * @param trnid01f the new value of trnid01f
	 */
	public void setTrnid01f(String trnid01f) {
		this.trnid01f.setValue(trnid01f);
	}
	/**
	 * Gets the reference for attribute trnid01a.
	 * @return the trnid01a attribute reference
	 */
	public ElementaryRangeReference getTrnid01aReference() {
		return trnid01a.getReference();
	}

	/**
	 * Getter for trnid01a attribute.
	 * @return trnid01a attribute
	 */
	public String getTrnid01a() {
		return trnid01a.getValue();
	}

	/**
	 * Setter for trnid01a attribute.
	 * @param trnid01a the new value of trnid01a
	 */
	public void setTrnid01a(String trnid01a) {
		this.trnid01a.setValue(trnid01a);
	}
	/**
	 * Gets the reference for attribute trnid01i.
	 * @return the trnid01i attribute reference
	 */
	public ElementaryRangeReference getTrnid01iReference() {
		return trnid01i.getReference();
	}

	/**
	 * Getter for trnid01i attribute.
	 * @return trnid01i attribute
	 */
	public String getTrnid01i() {
		return trnid01i.getValue();
	}

	/**
	 * Setter for trnid01i attribute.
	 * @param trnid01i the new value of trnid01i
	 */
	public void setTrnid01i(String trnid01i) {
		this.trnid01i.setValue(trnid01i);
	}
	/**
	 * Gets the reference for attribute tdate01l.
	 * @return the tdate01l attribute reference
	 */
	public ElementaryRangeReference getTdate01lReference() {
		return tdate01l.getReference();
	}

	/**
	 * Getter for tdate01l attribute.
	 * @return tdate01l attribute
	 */
	public int getTdate01l() {
		return tdate01l.getValue();
	}

	/**
	 * Setter for tdate01l attribute.
	 * @param tdate01l the new value of tdate01l
	 */
	public void setTdate01l(int tdate01l) {
		this.tdate01l.setValue(tdate01l);
	}
	/**
	 * Gets the reference for attribute tdate01f.
	 * @return the tdate01f attribute reference
	 */
	public ElementaryRangeReference getTdate01fReference() {
		return tdate01f.getReference();
	}

	/**
	 * Getter for tdate01f attribute.
	 * @return tdate01f attribute
	 */
	public String getTdate01f() {
		return tdate01f.getValue();
	}

	/**
	 * Setter for tdate01f attribute.
	 * @param tdate01f the new value of tdate01f
	 */
	public void setTdate01f(String tdate01f) {
		this.tdate01f.setValue(tdate01f);
	}
	/**
	 * Gets the reference for attribute tdate01a.
	 * @return the tdate01a attribute reference
	 */
	public ElementaryRangeReference getTdate01aReference() {
		return tdate01a.getReference();
	}

	/**
	 * Getter for tdate01a attribute.
	 * @return tdate01a attribute
	 */
	public String getTdate01a() {
		return tdate01a.getValue();
	}

	/**
	 * Setter for tdate01a attribute.
	 * @param tdate01a the new value of tdate01a
	 */
	public void setTdate01a(String tdate01a) {
		this.tdate01a.setValue(tdate01a);
	}
	/**
	 * Gets the reference for attribute tdate01i.
	 * @return the tdate01i attribute reference
	 */
	public ElementaryRangeReference getTdate01iReference() {
		return tdate01i.getReference();
	}

	/**
	 * Getter for tdate01i attribute.
	 * @return tdate01i attribute
	 */
	public String getTdate01i() {
		return tdate01i.getValue();
	}

	/**
	 * Setter for tdate01i attribute.
	 * @param tdate01i the new value of tdate01i
	 */
	public void setTdate01i(String tdate01i) {
		this.tdate01i.setValue(tdate01i);
	}
	/**
	 * Gets the reference for attribute tdesc01l.
	 * @return the tdesc01l attribute reference
	 */
	public ElementaryRangeReference getTdesc01lReference() {
		return tdesc01l.getReference();
	}

	/**
	 * Getter for tdesc01l attribute.
	 * @return tdesc01l attribute
	 */
	public int getTdesc01l() {
		return tdesc01l.getValue();
	}

	/**
	 * Setter for tdesc01l attribute.
	 * @param tdesc01l the new value of tdesc01l
	 */
	public void setTdesc01l(int tdesc01l) {
		this.tdesc01l.setValue(tdesc01l);
	}
	/**
	 * Gets the reference for attribute tdesc01f.
	 * @return the tdesc01f attribute reference
	 */
	public ElementaryRangeReference getTdesc01fReference() {
		return tdesc01f.getReference();
	}

	/**
	 * Getter for tdesc01f attribute.
	 * @return tdesc01f attribute
	 */
	public String getTdesc01f() {
		return tdesc01f.getValue();
	}

	/**
	 * Setter for tdesc01f attribute.
	 * @param tdesc01f the new value of tdesc01f
	 */
	public void setTdesc01f(String tdesc01f) {
		this.tdesc01f.setValue(tdesc01f);
	}
	/**
	 * Gets the reference for attribute tdesc01a.
	 * @return the tdesc01a attribute reference
	 */
	public ElementaryRangeReference getTdesc01aReference() {
		return tdesc01a.getReference();
	}

	/**
	 * Getter for tdesc01a attribute.
	 * @return tdesc01a attribute
	 */
	public String getTdesc01a() {
		return tdesc01a.getValue();
	}

	/**
	 * Setter for tdesc01a attribute.
	 * @param tdesc01a the new value of tdesc01a
	 */
	public void setTdesc01a(String tdesc01a) {
		this.tdesc01a.setValue(tdesc01a);
	}
	/**
	 * Gets the reference for attribute tdesc01i.
	 * @return the tdesc01i attribute reference
	 */
	public ElementaryRangeReference getTdesc01iReference() {
		return tdesc01i.getReference();
	}

	/**
	 * Getter for tdesc01i attribute.
	 * @return tdesc01i attribute
	 */
	public String getTdesc01i() {
		return tdesc01i.getValue();
	}

	/**
	 * Setter for tdesc01i attribute.
	 * @param tdesc01i the new value of tdesc01i
	 */
	public void setTdesc01i(String tdesc01i) {
		this.tdesc01i.setValue(tdesc01i);
	}
	/**
	 * Gets the reference for attribute tamt001l.
	 * @return the tamt001l attribute reference
	 */
	public ElementaryRangeReference getTamt001lReference() {
		return tamt001l.getReference();
	}

	/**
	 * Getter for tamt001l attribute.
	 * @return tamt001l attribute
	 */
	public int getTamt001l() {
		return tamt001l.getValue();
	}

	/**
	 * Setter for tamt001l attribute.
	 * @param tamt001l the new value of tamt001l
	 */
	public void setTamt001l(int tamt001l) {
		this.tamt001l.setValue(tamt001l);
	}
	/**
	 * Gets the reference for attribute tamt001f.
	 * @return the tamt001f attribute reference
	 */
	public ElementaryRangeReference getTamt001fReference() {
		return tamt001f.getReference();
	}

	/**
	 * Getter for tamt001f attribute.
	 * @return tamt001f attribute
	 */
	public String getTamt001f() {
		return tamt001f.getValue();
	}

	/**
	 * Setter for tamt001f attribute.
	 * @param tamt001f the new value of tamt001f
	 */
	public void setTamt001f(String tamt001f) {
		this.tamt001f.setValue(tamt001f);
	}
	/**
	 * Gets the reference for attribute tamt001a.
	 * @return the tamt001a attribute reference
	 */
	public ElementaryRangeReference getTamt001aReference() {
		return tamt001a.getReference();
	}

	/**
	 * Getter for tamt001a attribute.
	 * @return tamt001a attribute
	 */
	public String getTamt001a() {
		return tamt001a.getValue();
	}

	/**
	 * Setter for tamt001a attribute.
	 * @param tamt001a the new value of tamt001a
	 */
	public void setTamt001a(String tamt001a) {
		this.tamt001a.setValue(tamt001a);
	}
	/**
	 * Gets the reference for attribute tamt001i.
	 * @return the tamt001i attribute reference
	 */
	public ElementaryRangeReference getTamt001iReference() {
		return tamt001i.getReference();
	}

	/**
	 * Getter for tamt001i attribute.
	 * @return tamt001i attribute
	 */
	public String getTamt001i() {
		return tamt001i.getValue();
	}

	/**
	 * Setter for tamt001i attribute.
	 * @param tamt001i the new value of tamt001i
	 */
	public void setTamt001i(String tamt001i) {
		this.tamt001i.setValue(tamt001i);
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
	 * Gets the reference for attribute trnid02l.
	 * @return the trnid02l attribute reference
	 */
	public ElementaryRangeReference getTrnid02lReference() {
		return trnid02l.getReference();
	}

	/**
	 * Getter for trnid02l attribute.
	 * @return trnid02l attribute
	 */
	public int getTrnid02l() {
		return trnid02l.getValue();
	}

	/**
	 * Setter for trnid02l attribute.
	 * @param trnid02l the new value of trnid02l
	 */
	public void setTrnid02l(int trnid02l) {
		this.trnid02l.setValue(trnid02l);
	}
	/**
	 * Gets the reference for attribute trnid02f.
	 * @return the trnid02f attribute reference
	 */
	public ElementaryRangeReference getTrnid02fReference() {
		return trnid02f.getReference();
	}

	/**
	 * Getter for trnid02f attribute.
	 * @return trnid02f attribute
	 */
	public String getTrnid02f() {
		return trnid02f.getValue();
	}

	/**
	 * Setter for trnid02f attribute.
	 * @param trnid02f the new value of trnid02f
	 */
	public void setTrnid02f(String trnid02f) {
		this.trnid02f.setValue(trnid02f);
	}
	/**
	 * Gets the reference for attribute trnid02a.
	 * @return the trnid02a attribute reference
	 */
	public ElementaryRangeReference getTrnid02aReference() {
		return trnid02a.getReference();
	}

	/**
	 * Getter for trnid02a attribute.
	 * @return trnid02a attribute
	 */
	public String getTrnid02a() {
		return trnid02a.getValue();
	}

	/**
	 * Setter for trnid02a attribute.
	 * @param trnid02a the new value of trnid02a
	 */
	public void setTrnid02a(String trnid02a) {
		this.trnid02a.setValue(trnid02a);
	}
	/**
	 * Gets the reference for attribute trnid02i.
	 * @return the trnid02i attribute reference
	 */
	public ElementaryRangeReference getTrnid02iReference() {
		return trnid02i.getReference();
	}

	/**
	 * Getter for trnid02i attribute.
	 * @return trnid02i attribute
	 */
	public String getTrnid02i() {
		return trnid02i.getValue();
	}

	/**
	 * Setter for trnid02i attribute.
	 * @param trnid02i the new value of trnid02i
	 */
	public void setTrnid02i(String trnid02i) {
		this.trnid02i.setValue(trnid02i);
	}
	/**
	 * Gets the reference for attribute tdate02l.
	 * @return the tdate02l attribute reference
	 */
	public ElementaryRangeReference getTdate02lReference() {
		return tdate02l.getReference();
	}

	/**
	 * Getter for tdate02l attribute.
	 * @return tdate02l attribute
	 */
	public int getTdate02l() {
		return tdate02l.getValue();
	}

	/**
	 * Setter for tdate02l attribute.
	 * @param tdate02l the new value of tdate02l
	 */
	public void setTdate02l(int tdate02l) {
		this.tdate02l.setValue(tdate02l);
	}
	/**
	 * Gets the reference for attribute tdate02f.
	 * @return the tdate02f attribute reference
	 */
	public ElementaryRangeReference getTdate02fReference() {
		return tdate02f.getReference();
	}

	/**
	 * Getter for tdate02f attribute.
	 * @return tdate02f attribute
	 */
	public String getTdate02f() {
		return tdate02f.getValue();
	}

	/**
	 * Setter for tdate02f attribute.
	 * @param tdate02f the new value of tdate02f
	 */
	public void setTdate02f(String tdate02f) {
		this.tdate02f.setValue(tdate02f);
	}
	/**
	 * Gets the reference for attribute tdate02a.
	 * @return the tdate02a attribute reference
	 */
	public ElementaryRangeReference getTdate02aReference() {
		return tdate02a.getReference();
	}

	/**
	 * Getter for tdate02a attribute.
	 * @return tdate02a attribute
	 */
	public String getTdate02a() {
		return tdate02a.getValue();
	}

	/**
	 * Setter for tdate02a attribute.
	 * @param tdate02a the new value of tdate02a
	 */
	public void setTdate02a(String tdate02a) {
		this.tdate02a.setValue(tdate02a);
	}
	/**
	 * Gets the reference for attribute tdate02i.
	 * @return the tdate02i attribute reference
	 */
	public ElementaryRangeReference getTdate02iReference() {
		return tdate02i.getReference();
	}

	/**
	 * Getter for tdate02i attribute.
	 * @return tdate02i attribute
	 */
	public String getTdate02i() {
		return tdate02i.getValue();
	}

	/**
	 * Setter for tdate02i attribute.
	 * @param tdate02i the new value of tdate02i
	 */
	public void setTdate02i(String tdate02i) {
		this.tdate02i.setValue(tdate02i);
	}
	/**
	 * Gets the reference for attribute tdesc02l.
	 * @return the tdesc02l attribute reference
	 */
	public ElementaryRangeReference getTdesc02lReference() {
		return tdesc02l.getReference();
	}

	/**
	 * Getter for tdesc02l attribute.
	 * @return tdesc02l attribute
	 */
	public int getTdesc02l() {
		return tdesc02l.getValue();
	}

	/**
	 * Setter for tdesc02l attribute.
	 * @param tdesc02l the new value of tdesc02l
	 */
	public void setTdesc02l(int tdesc02l) {
		this.tdesc02l.setValue(tdesc02l);
	}
	/**
	 * Gets the reference for attribute tdesc02f.
	 * @return the tdesc02f attribute reference
	 */
	public ElementaryRangeReference getTdesc02fReference() {
		return tdesc02f.getReference();
	}

	/**
	 * Getter for tdesc02f attribute.
	 * @return tdesc02f attribute
	 */
	public String getTdesc02f() {
		return tdesc02f.getValue();
	}

	/**
	 * Setter for tdesc02f attribute.
	 * @param tdesc02f the new value of tdesc02f
	 */
	public void setTdesc02f(String tdesc02f) {
		this.tdesc02f.setValue(tdesc02f);
	}
	/**
	 * Gets the reference for attribute tdesc02a.
	 * @return the tdesc02a attribute reference
	 */
	public ElementaryRangeReference getTdesc02aReference() {
		return tdesc02a.getReference();
	}

	/**
	 * Getter for tdesc02a attribute.
	 * @return tdesc02a attribute
	 */
	public String getTdesc02a() {
		return tdesc02a.getValue();
	}

	/**
	 * Setter for tdesc02a attribute.
	 * @param tdesc02a the new value of tdesc02a
	 */
	public void setTdesc02a(String tdesc02a) {
		this.tdesc02a.setValue(tdesc02a);
	}
	/**
	 * Gets the reference for attribute tdesc02i.
	 * @return the tdesc02i attribute reference
	 */
	public ElementaryRangeReference getTdesc02iReference() {
		return tdesc02i.getReference();
	}

	/**
	 * Getter for tdesc02i attribute.
	 * @return tdesc02i attribute
	 */
	public String getTdesc02i() {
		return tdesc02i.getValue();
	}

	/**
	 * Setter for tdesc02i attribute.
	 * @param tdesc02i the new value of tdesc02i
	 */
	public void setTdesc02i(String tdesc02i) {
		this.tdesc02i.setValue(tdesc02i);
	}
	/**
	 * Gets the reference for attribute tamt002l.
	 * @return the tamt002l attribute reference
	 */
	public ElementaryRangeReference getTamt002lReference() {
		return tamt002l.getReference();
	}

	/**
	 * Getter for tamt002l attribute.
	 * @return tamt002l attribute
	 */
	public int getTamt002l() {
		return tamt002l.getValue();
	}

	/**
	 * Setter for tamt002l attribute.
	 * @param tamt002l the new value of tamt002l
	 */
	public void setTamt002l(int tamt002l) {
		this.tamt002l.setValue(tamt002l);
	}
	/**
	 * Gets the reference for attribute tamt002f.
	 * @return the tamt002f attribute reference
	 */
	public ElementaryRangeReference getTamt002fReference() {
		return tamt002f.getReference();
	}

	/**
	 * Getter for tamt002f attribute.
	 * @return tamt002f attribute
	 */
	public String getTamt002f() {
		return tamt002f.getValue();
	}

	/**
	 * Setter for tamt002f attribute.
	 * @param tamt002f the new value of tamt002f
	 */
	public void setTamt002f(String tamt002f) {
		this.tamt002f.setValue(tamt002f);
	}
	/**
	 * Gets the reference for attribute tamt002a.
	 * @return the tamt002a attribute reference
	 */
	public ElementaryRangeReference getTamt002aReference() {
		return tamt002a.getReference();
	}

	/**
	 * Getter for tamt002a attribute.
	 * @return tamt002a attribute
	 */
	public String getTamt002a() {
		return tamt002a.getValue();
	}

	/**
	 * Setter for tamt002a attribute.
	 * @param tamt002a the new value of tamt002a
	 */
	public void setTamt002a(String tamt002a) {
		this.tamt002a.setValue(tamt002a);
	}
	/**
	 * Gets the reference for attribute tamt002i.
	 * @return the tamt002i attribute reference
	 */
	public ElementaryRangeReference getTamt002iReference() {
		return tamt002i.getReference();
	}

	/**
	 * Getter for tamt002i attribute.
	 * @return tamt002i attribute
	 */
	public String getTamt002i() {
		return tamt002i.getValue();
	}

	/**
	 * Setter for tamt002i attribute.
	 * @param tamt002i the new value of tamt002i
	 */
	public void setTamt002i(String tamt002i) {
		this.tamt002i.setValue(tamt002i);
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
	 * Gets the reference for attribute trnid03l.
	 * @return the trnid03l attribute reference
	 */
	public ElementaryRangeReference getTrnid03lReference() {
		return trnid03l.getReference();
	}

	/**
	 * Getter for trnid03l attribute.
	 * @return trnid03l attribute
	 */
	public int getTrnid03l() {
		return trnid03l.getValue();
	}

	/**
	 * Setter for trnid03l attribute.
	 * @param trnid03l the new value of trnid03l
	 */
	public void setTrnid03l(int trnid03l) {
		this.trnid03l.setValue(trnid03l);
	}
	/**
	 * Gets the reference for attribute trnid03f.
	 * @return the trnid03f attribute reference
	 */
	public ElementaryRangeReference getTrnid03fReference() {
		return trnid03f.getReference();
	}

	/**
	 * Getter for trnid03f attribute.
	 * @return trnid03f attribute
	 */
	public String getTrnid03f() {
		return trnid03f.getValue();
	}

	/**
	 * Setter for trnid03f attribute.
	 * @param trnid03f the new value of trnid03f
	 */
	public void setTrnid03f(String trnid03f) {
		this.trnid03f.setValue(trnid03f);
	}
	/**
	 * Gets the reference for attribute trnid03a.
	 * @return the trnid03a attribute reference
	 */
	public ElementaryRangeReference getTrnid03aReference() {
		return trnid03a.getReference();
	}

	/**
	 * Getter for trnid03a attribute.
	 * @return trnid03a attribute
	 */
	public String getTrnid03a() {
		return trnid03a.getValue();
	}

	/**
	 * Setter for trnid03a attribute.
	 * @param trnid03a the new value of trnid03a
	 */
	public void setTrnid03a(String trnid03a) {
		this.trnid03a.setValue(trnid03a);
	}
	/**
	 * Gets the reference for attribute trnid03i.
	 * @return the trnid03i attribute reference
	 */
	public ElementaryRangeReference getTrnid03iReference() {
		return trnid03i.getReference();
	}

	/**
	 * Getter for trnid03i attribute.
	 * @return trnid03i attribute
	 */
	public String getTrnid03i() {
		return trnid03i.getValue();
	}

	/**
	 * Setter for trnid03i attribute.
	 * @param trnid03i the new value of trnid03i
	 */
	public void setTrnid03i(String trnid03i) {
		this.trnid03i.setValue(trnid03i);
	}
	/**
	 * Gets the reference for attribute tdate03l.
	 * @return the tdate03l attribute reference
	 */
	public ElementaryRangeReference getTdate03lReference() {
		return tdate03l.getReference();
	}

	/**
	 * Getter for tdate03l attribute.
	 * @return tdate03l attribute
	 */
	public int getTdate03l() {
		return tdate03l.getValue();
	}

	/**
	 * Setter for tdate03l attribute.
	 * @param tdate03l the new value of tdate03l
	 */
	public void setTdate03l(int tdate03l) {
		this.tdate03l.setValue(tdate03l);
	}
	/**
	 * Gets the reference for attribute tdate03f.
	 * @return the tdate03f attribute reference
	 */
	public ElementaryRangeReference getTdate03fReference() {
		return tdate03f.getReference();
	}

	/**
	 * Getter for tdate03f attribute.
	 * @return tdate03f attribute
	 */
	public String getTdate03f() {
		return tdate03f.getValue();
	}

	/**
	 * Setter for tdate03f attribute.
	 * @param tdate03f the new value of tdate03f
	 */
	public void setTdate03f(String tdate03f) {
		this.tdate03f.setValue(tdate03f);
	}
	/**
	 * Gets the reference for attribute tdate03a.
	 * @return the tdate03a attribute reference
	 */
	public ElementaryRangeReference getTdate03aReference() {
		return tdate03a.getReference();
	}

	/**
	 * Getter for tdate03a attribute.
	 * @return tdate03a attribute
	 */
	public String getTdate03a() {
		return tdate03a.getValue();
	}

	/**
	 * Setter for tdate03a attribute.
	 * @param tdate03a the new value of tdate03a
	 */
	public void setTdate03a(String tdate03a) {
		this.tdate03a.setValue(tdate03a);
	}
	/**
	 * Gets the reference for attribute tdate03i.
	 * @return the tdate03i attribute reference
	 */
	public ElementaryRangeReference getTdate03iReference() {
		return tdate03i.getReference();
	}

	/**
	 * Getter for tdate03i attribute.
	 * @return tdate03i attribute
	 */
	public String getTdate03i() {
		return tdate03i.getValue();
	}

	/**
	 * Setter for tdate03i attribute.
	 * @param tdate03i the new value of tdate03i
	 */
	public void setTdate03i(String tdate03i) {
		this.tdate03i.setValue(tdate03i);
	}
	/**
	 * Gets the reference for attribute tdesc03l.
	 * @return the tdesc03l attribute reference
	 */
	public ElementaryRangeReference getTdesc03lReference() {
		return tdesc03l.getReference();
	}

	/**
	 * Getter for tdesc03l attribute.
	 * @return tdesc03l attribute
	 */
	public int getTdesc03l() {
		return tdesc03l.getValue();
	}

	/**
	 * Setter for tdesc03l attribute.
	 * @param tdesc03l the new value of tdesc03l
	 */
	public void setTdesc03l(int tdesc03l) {
		this.tdesc03l.setValue(tdesc03l);
	}
	/**
	 * Gets the reference for attribute tdesc03f.
	 * @return the tdesc03f attribute reference
	 */
	public ElementaryRangeReference getTdesc03fReference() {
		return tdesc03f.getReference();
	}

	/**
	 * Getter for tdesc03f attribute.
	 * @return tdesc03f attribute
	 */
	public String getTdesc03f() {
		return tdesc03f.getValue();
	}

	/**
	 * Setter for tdesc03f attribute.
	 * @param tdesc03f the new value of tdesc03f
	 */
	public void setTdesc03f(String tdesc03f) {
		this.tdesc03f.setValue(tdesc03f);
	}
	/**
	 * Gets the reference for attribute tdesc03a.
	 * @return the tdesc03a attribute reference
	 */
	public ElementaryRangeReference getTdesc03aReference() {
		return tdesc03a.getReference();
	}

	/**
	 * Getter for tdesc03a attribute.
	 * @return tdesc03a attribute
	 */
	public String getTdesc03a() {
		return tdesc03a.getValue();
	}

	/**
	 * Setter for tdesc03a attribute.
	 * @param tdesc03a the new value of tdesc03a
	 */
	public void setTdesc03a(String tdesc03a) {
		this.tdesc03a.setValue(tdesc03a);
	}
	/**
	 * Gets the reference for attribute tdesc03i.
	 * @return the tdesc03i attribute reference
	 */
	public ElementaryRangeReference getTdesc03iReference() {
		return tdesc03i.getReference();
	}

	/**
	 * Getter for tdesc03i attribute.
	 * @return tdesc03i attribute
	 */
	public String getTdesc03i() {
		return tdesc03i.getValue();
	}

	/**
	 * Setter for tdesc03i attribute.
	 * @param tdesc03i the new value of tdesc03i
	 */
	public void setTdesc03i(String tdesc03i) {
		this.tdesc03i.setValue(tdesc03i);
	}
	/**
	 * Gets the reference for attribute tamt003l.
	 * @return the tamt003l attribute reference
	 */
	public ElementaryRangeReference getTamt003lReference() {
		return tamt003l.getReference();
	}

	/**
	 * Getter for tamt003l attribute.
	 * @return tamt003l attribute
	 */
	public int getTamt003l() {
		return tamt003l.getValue();
	}

	/**
	 * Setter for tamt003l attribute.
	 * @param tamt003l the new value of tamt003l
	 */
	public void setTamt003l(int tamt003l) {
		this.tamt003l.setValue(tamt003l);
	}
	/**
	 * Gets the reference for attribute tamt003f.
	 * @return the tamt003f attribute reference
	 */
	public ElementaryRangeReference getTamt003fReference() {
		return tamt003f.getReference();
	}

	/**
	 * Getter for tamt003f attribute.
	 * @return tamt003f attribute
	 */
	public String getTamt003f() {
		return tamt003f.getValue();
	}

	/**
	 * Setter for tamt003f attribute.
	 * @param tamt003f the new value of tamt003f
	 */
	public void setTamt003f(String tamt003f) {
		this.tamt003f.setValue(tamt003f);
	}
	/**
	 * Gets the reference for attribute tamt003a.
	 * @return the tamt003a attribute reference
	 */
	public ElementaryRangeReference getTamt003aReference() {
		return tamt003a.getReference();
	}

	/**
	 * Getter for tamt003a attribute.
	 * @return tamt003a attribute
	 */
	public String getTamt003a() {
		return tamt003a.getValue();
	}

	/**
	 * Setter for tamt003a attribute.
	 * @param tamt003a the new value of tamt003a
	 */
	public void setTamt003a(String tamt003a) {
		this.tamt003a.setValue(tamt003a);
	}
	/**
	 * Gets the reference for attribute tamt003i.
	 * @return the tamt003i attribute reference
	 */
	public ElementaryRangeReference getTamt003iReference() {
		return tamt003i.getReference();
	}

	/**
	 * Getter for tamt003i attribute.
	 * @return tamt003i attribute
	 */
	public String getTamt003i() {
		return tamt003i.getValue();
	}

	/**
	 * Setter for tamt003i attribute.
	 * @param tamt003i the new value of tamt003i
	 */
	public void setTamt003i(String tamt003i) {
		this.tamt003i.setValue(tamt003i);
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
	 * Gets the reference for attribute trnid04l.
	 * @return the trnid04l attribute reference
	 */
	public ElementaryRangeReference getTrnid04lReference() {
		return trnid04l.getReference();
	}

	/**
	 * Getter for trnid04l attribute.
	 * @return trnid04l attribute
	 */
	public int getTrnid04l() {
		return trnid04l.getValue();
	}

	/**
	 * Setter for trnid04l attribute.
	 * @param trnid04l the new value of trnid04l
	 */
	public void setTrnid04l(int trnid04l) {
		this.trnid04l.setValue(trnid04l);
	}
	/**
	 * Gets the reference for attribute trnid04f.
	 * @return the trnid04f attribute reference
	 */
	public ElementaryRangeReference getTrnid04fReference() {
		return trnid04f.getReference();
	}

	/**
	 * Getter for trnid04f attribute.
	 * @return trnid04f attribute
	 */
	public String getTrnid04f() {
		return trnid04f.getValue();
	}

	/**
	 * Setter for trnid04f attribute.
	 * @param trnid04f the new value of trnid04f
	 */
	public void setTrnid04f(String trnid04f) {
		this.trnid04f.setValue(trnid04f);
	}
	/**
	 * Gets the reference for attribute trnid04a.
	 * @return the trnid04a attribute reference
	 */
	public ElementaryRangeReference getTrnid04aReference() {
		return trnid04a.getReference();
	}

	/**
	 * Getter for trnid04a attribute.
	 * @return trnid04a attribute
	 */
	public String getTrnid04a() {
		return trnid04a.getValue();
	}

	/**
	 * Setter for trnid04a attribute.
	 * @param trnid04a the new value of trnid04a
	 */
	public void setTrnid04a(String trnid04a) {
		this.trnid04a.setValue(trnid04a);
	}
	/**
	 * Gets the reference for attribute trnid04i.
	 * @return the trnid04i attribute reference
	 */
	public ElementaryRangeReference getTrnid04iReference() {
		return trnid04i.getReference();
	}

	/**
	 * Getter for trnid04i attribute.
	 * @return trnid04i attribute
	 */
	public String getTrnid04i() {
		return trnid04i.getValue();
	}

	/**
	 * Setter for trnid04i attribute.
	 * @param trnid04i the new value of trnid04i
	 */
	public void setTrnid04i(String trnid04i) {
		this.trnid04i.setValue(trnid04i);
	}
	/**
	 * Gets the reference for attribute tdate04l.
	 * @return the tdate04l attribute reference
	 */
	public ElementaryRangeReference getTdate04lReference() {
		return tdate04l.getReference();
	}

	/**
	 * Getter for tdate04l attribute.
	 * @return tdate04l attribute
	 */
	public int getTdate04l() {
		return tdate04l.getValue();
	}

	/**
	 * Setter for tdate04l attribute.
	 * @param tdate04l the new value of tdate04l
	 */
	public void setTdate04l(int tdate04l) {
		this.tdate04l.setValue(tdate04l);
	}
	/**
	 * Gets the reference for attribute tdate04f.
	 * @return the tdate04f attribute reference
	 */
	public ElementaryRangeReference getTdate04fReference() {
		return tdate04f.getReference();
	}

	/**
	 * Getter for tdate04f attribute.
	 * @return tdate04f attribute
	 */
	public String getTdate04f() {
		return tdate04f.getValue();
	}

	/**
	 * Setter for tdate04f attribute.
	 * @param tdate04f the new value of tdate04f
	 */
	public void setTdate04f(String tdate04f) {
		this.tdate04f.setValue(tdate04f);
	}
	/**
	 * Gets the reference for attribute tdate04a.
	 * @return the tdate04a attribute reference
	 */
	public ElementaryRangeReference getTdate04aReference() {
		return tdate04a.getReference();
	}

	/**
	 * Getter for tdate04a attribute.
	 * @return tdate04a attribute
	 */
	public String getTdate04a() {
		return tdate04a.getValue();
	}

	/**
	 * Setter for tdate04a attribute.
	 * @param tdate04a the new value of tdate04a
	 */
	public void setTdate04a(String tdate04a) {
		this.tdate04a.setValue(tdate04a);
	}
	/**
	 * Gets the reference for attribute tdate04i.
	 * @return the tdate04i attribute reference
	 */
	public ElementaryRangeReference getTdate04iReference() {
		return tdate04i.getReference();
	}

	/**
	 * Getter for tdate04i attribute.
	 * @return tdate04i attribute
	 */
	public String getTdate04i() {
		return tdate04i.getValue();
	}

	/**
	 * Setter for tdate04i attribute.
	 * @param tdate04i the new value of tdate04i
	 */
	public void setTdate04i(String tdate04i) {
		this.tdate04i.setValue(tdate04i);
	}
	/**
	 * Gets the reference for attribute tdesc04l.
	 * @return the tdesc04l attribute reference
	 */
	public ElementaryRangeReference getTdesc04lReference() {
		return tdesc04l.getReference();
	}

	/**
	 * Getter for tdesc04l attribute.
	 * @return tdesc04l attribute
	 */
	public int getTdesc04l() {
		return tdesc04l.getValue();
	}

	/**
	 * Setter for tdesc04l attribute.
	 * @param tdesc04l the new value of tdesc04l
	 */
	public void setTdesc04l(int tdesc04l) {
		this.tdesc04l.setValue(tdesc04l);
	}
	/**
	 * Gets the reference for attribute tdesc04f.
	 * @return the tdesc04f attribute reference
	 */
	public ElementaryRangeReference getTdesc04fReference() {
		return tdesc04f.getReference();
	}

	/**
	 * Getter for tdesc04f attribute.
	 * @return tdesc04f attribute
	 */
	public String getTdesc04f() {
		return tdesc04f.getValue();
	}

	/**
	 * Setter for tdesc04f attribute.
	 * @param tdesc04f the new value of tdesc04f
	 */
	public void setTdesc04f(String tdesc04f) {
		this.tdesc04f.setValue(tdesc04f);
	}
	/**
	 * Gets the reference for attribute tdesc04a.
	 * @return the tdesc04a attribute reference
	 */
	public ElementaryRangeReference getTdesc04aReference() {
		return tdesc04a.getReference();
	}

	/**
	 * Getter for tdesc04a attribute.
	 * @return tdesc04a attribute
	 */
	public String getTdesc04a() {
		return tdesc04a.getValue();
	}

	/**
	 * Setter for tdesc04a attribute.
	 * @param tdesc04a the new value of tdesc04a
	 */
	public void setTdesc04a(String tdesc04a) {
		this.tdesc04a.setValue(tdesc04a);
	}
	/**
	 * Gets the reference for attribute tdesc04i.
	 * @return the tdesc04i attribute reference
	 */
	public ElementaryRangeReference getTdesc04iReference() {
		return tdesc04i.getReference();
	}

	/**
	 * Getter for tdesc04i attribute.
	 * @return tdesc04i attribute
	 */
	public String getTdesc04i() {
		return tdesc04i.getValue();
	}

	/**
	 * Setter for tdesc04i attribute.
	 * @param tdesc04i the new value of tdesc04i
	 */
	public void setTdesc04i(String tdesc04i) {
		this.tdesc04i.setValue(tdesc04i);
	}
	/**
	 * Gets the reference for attribute tamt004l.
	 * @return the tamt004l attribute reference
	 */
	public ElementaryRangeReference getTamt004lReference() {
		return tamt004l.getReference();
	}

	/**
	 * Getter for tamt004l attribute.
	 * @return tamt004l attribute
	 */
	public int getTamt004l() {
		return tamt004l.getValue();
	}

	/**
	 * Setter for tamt004l attribute.
	 * @param tamt004l the new value of tamt004l
	 */
	public void setTamt004l(int tamt004l) {
		this.tamt004l.setValue(tamt004l);
	}
	/**
	 * Gets the reference for attribute tamt004f.
	 * @return the tamt004f attribute reference
	 */
	public ElementaryRangeReference getTamt004fReference() {
		return tamt004f.getReference();
	}

	/**
	 * Getter for tamt004f attribute.
	 * @return tamt004f attribute
	 */
	public String getTamt004f() {
		return tamt004f.getValue();
	}

	/**
	 * Setter for tamt004f attribute.
	 * @param tamt004f the new value of tamt004f
	 */
	public void setTamt004f(String tamt004f) {
		this.tamt004f.setValue(tamt004f);
	}
	/**
	 * Gets the reference for attribute tamt004a.
	 * @return the tamt004a attribute reference
	 */
	public ElementaryRangeReference getTamt004aReference() {
		return tamt004a.getReference();
	}

	/**
	 * Getter for tamt004a attribute.
	 * @return tamt004a attribute
	 */
	public String getTamt004a() {
		return tamt004a.getValue();
	}

	/**
	 * Setter for tamt004a attribute.
	 * @param tamt004a the new value of tamt004a
	 */
	public void setTamt004a(String tamt004a) {
		this.tamt004a.setValue(tamt004a);
	}
	/**
	 * Gets the reference for attribute tamt004i.
	 * @return the tamt004i attribute reference
	 */
	public ElementaryRangeReference getTamt004iReference() {
		return tamt004i.getReference();
	}

	/**
	 * Getter for tamt004i attribute.
	 * @return tamt004i attribute
	 */
	public String getTamt004i() {
		return tamt004i.getValue();
	}

	/**
	 * Setter for tamt004i attribute.
	 * @param tamt004i the new value of tamt004i
	 */
	public void setTamt004i(String tamt004i) {
		this.tamt004i.setValue(tamt004i);
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
	 * Gets the reference for attribute trnid05l.
	 * @return the trnid05l attribute reference
	 */
	public ElementaryRangeReference getTrnid05lReference() {
		return trnid05l.getReference();
	}

	/**
	 * Getter for trnid05l attribute.
	 * @return trnid05l attribute
	 */
	public int getTrnid05l() {
		return trnid05l.getValue();
	}

	/**
	 * Setter for trnid05l attribute.
	 * @param trnid05l the new value of trnid05l
	 */
	public void setTrnid05l(int trnid05l) {
		this.trnid05l.setValue(trnid05l);
	}
	/**
	 * Gets the reference for attribute trnid05f.
	 * @return the trnid05f attribute reference
	 */
	public ElementaryRangeReference getTrnid05fReference() {
		return trnid05f.getReference();
	}

	/**
	 * Getter for trnid05f attribute.
	 * @return trnid05f attribute
	 */
	public String getTrnid05f() {
		return trnid05f.getValue();
	}

	/**
	 * Setter for trnid05f attribute.
	 * @param trnid05f the new value of trnid05f
	 */
	public void setTrnid05f(String trnid05f) {
		this.trnid05f.setValue(trnid05f);
	}
	/**
	 * Gets the reference for attribute trnid05a.
	 * @return the trnid05a attribute reference
	 */
	public ElementaryRangeReference getTrnid05aReference() {
		return trnid05a.getReference();
	}

	/**
	 * Getter for trnid05a attribute.
	 * @return trnid05a attribute
	 */
	public String getTrnid05a() {
		return trnid05a.getValue();
	}

	/**
	 * Setter for trnid05a attribute.
	 * @param trnid05a the new value of trnid05a
	 */
	public void setTrnid05a(String trnid05a) {
		this.trnid05a.setValue(trnid05a);
	}
	/**
	 * Gets the reference for attribute trnid05i.
	 * @return the trnid05i attribute reference
	 */
	public ElementaryRangeReference getTrnid05iReference() {
		return trnid05i.getReference();
	}

	/**
	 * Getter for trnid05i attribute.
	 * @return trnid05i attribute
	 */
	public String getTrnid05i() {
		return trnid05i.getValue();
	}

	/**
	 * Setter for trnid05i attribute.
	 * @param trnid05i the new value of trnid05i
	 */
	public void setTrnid05i(String trnid05i) {
		this.trnid05i.setValue(trnid05i);
	}
	/**
	 * Gets the reference for attribute tdate05l.
	 * @return the tdate05l attribute reference
	 */
	public ElementaryRangeReference getTdate05lReference() {
		return tdate05l.getReference();
	}

	/**
	 * Getter for tdate05l attribute.
	 * @return tdate05l attribute
	 */
	public int getTdate05l() {
		return tdate05l.getValue();
	}

	/**
	 * Setter for tdate05l attribute.
	 * @param tdate05l the new value of tdate05l
	 */
	public void setTdate05l(int tdate05l) {
		this.tdate05l.setValue(tdate05l);
	}
	/**
	 * Gets the reference for attribute tdate05f.
	 * @return the tdate05f attribute reference
	 */
	public ElementaryRangeReference getTdate05fReference() {
		return tdate05f.getReference();
	}

	/**
	 * Getter for tdate05f attribute.
	 * @return tdate05f attribute
	 */
	public String getTdate05f() {
		return tdate05f.getValue();
	}

	/**
	 * Setter for tdate05f attribute.
	 * @param tdate05f the new value of tdate05f
	 */
	public void setTdate05f(String tdate05f) {
		this.tdate05f.setValue(tdate05f);
	}
	/**
	 * Gets the reference for attribute tdate05a.
	 * @return the tdate05a attribute reference
	 */
	public ElementaryRangeReference getTdate05aReference() {
		return tdate05a.getReference();
	}

	/**
	 * Getter for tdate05a attribute.
	 * @return tdate05a attribute
	 */
	public String getTdate05a() {
		return tdate05a.getValue();
	}

	/**
	 * Setter for tdate05a attribute.
	 * @param tdate05a the new value of tdate05a
	 */
	public void setTdate05a(String tdate05a) {
		this.tdate05a.setValue(tdate05a);
	}
	/**
	 * Gets the reference for attribute tdate05i.
	 * @return the tdate05i attribute reference
	 */
	public ElementaryRangeReference getTdate05iReference() {
		return tdate05i.getReference();
	}

	/**
	 * Getter for tdate05i attribute.
	 * @return tdate05i attribute
	 */
	public String getTdate05i() {
		return tdate05i.getValue();
	}

	/**
	 * Setter for tdate05i attribute.
	 * @param tdate05i the new value of tdate05i
	 */
	public void setTdate05i(String tdate05i) {
		this.tdate05i.setValue(tdate05i);
	}
	/**
	 * Gets the reference for attribute tdesc05l.
	 * @return the tdesc05l attribute reference
	 */
	public ElementaryRangeReference getTdesc05lReference() {
		return tdesc05l.getReference();
	}

	/**
	 * Getter for tdesc05l attribute.
	 * @return tdesc05l attribute
	 */
	public int getTdesc05l() {
		return tdesc05l.getValue();
	}

	/**
	 * Setter for tdesc05l attribute.
	 * @param tdesc05l the new value of tdesc05l
	 */
	public void setTdesc05l(int tdesc05l) {
		this.tdesc05l.setValue(tdesc05l);
	}
	/**
	 * Gets the reference for attribute tdesc05f.
	 * @return the tdesc05f attribute reference
	 */
	public ElementaryRangeReference getTdesc05fReference() {
		return tdesc05f.getReference();
	}

	/**
	 * Getter for tdesc05f attribute.
	 * @return tdesc05f attribute
	 */
	public String getTdesc05f() {
		return tdesc05f.getValue();
	}

	/**
	 * Setter for tdesc05f attribute.
	 * @param tdesc05f the new value of tdesc05f
	 */
	public void setTdesc05f(String tdesc05f) {
		this.tdesc05f.setValue(tdesc05f);
	}
	/**
	 * Gets the reference for attribute tdesc05a.
	 * @return the tdesc05a attribute reference
	 */
	public ElementaryRangeReference getTdesc05aReference() {
		return tdesc05a.getReference();
	}

	/**
	 * Getter for tdesc05a attribute.
	 * @return tdesc05a attribute
	 */
	public String getTdesc05a() {
		return tdesc05a.getValue();
	}

	/**
	 * Setter for tdesc05a attribute.
	 * @param tdesc05a the new value of tdesc05a
	 */
	public void setTdesc05a(String tdesc05a) {
		this.tdesc05a.setValue(tdesc05a);
	}
	/**
	 * Gets the reference for attribute tdesc05i.
	 * @return the tdesc05i attribute reference
	 */
	public ElementaryRangeReference getTdesc05iReference() {
		return tdesc05i.getReference();
	}

	/**
	 * Getter for tdesc05i attribute.
	 * @return tdesc05i attribute
	 */
	public String getTdesc05i() {
		return tdesc05i.getValue();
	}

	/**
	 * Setter for tdesc05i attribute.
	 * @param tdesc05i the new value of tdesc05i
	 */
	public void setTdesc05i(String tdesc05i) {
		this.tdesc05i.setValue(tdesc05i);
	}
	/**
	 * Gets the reference for attribute tamt005l.
	 * @return the tamt005l attribute reference
	 */
	public ElementaryRangeReference getTamt005lReference() {
		return tamt005l.getReference();
	}

	/**
	 * Getter for tamt005l attribute.
	 * @return tamt005l attribute
	 */
	public int getTamt005l() {
		return tamt005l.getValue();
	}

	/**
	 * Setter for tamt005l attribute.
	 * @param tamt005l the new value of tamt005l
	 */
	public void setTamt005l(int tamt005l) {
		this.tamt005l.setValue(tamt005l);
	}
	/**
	 * Gets the reference for attribute tamt005f.
	 * @return the tamt005f attribute reference
	 */
	public ElementaryRangeReference getTamt005fReference() {
		return tamt005f.getReference();
	}

	/**
	 * Getter for tamt005f attribute.
	 * @return tamt005f attribute
	 */
	public String getTamt005f() {
		return tamt005f.getValue();
	}

	/**
	 * Setter for tamt005f attribute.
	 * @param tamt005f the new value of tamt005f
	 */
	public void setTamt005f(String tamt005f) {
		this.tamt005f.setValue(tamt005f);
	}
	/**
	 * Gets the reference for attribute tamt005a.
	 * @return the tamt005a attribute reference
	 */
	public ElementaryRangeReference getTamt005aReference() {
		return tamt005a.getReference();
	}

	/**
	 * Getter for tamt005a attribute.
	 * @return tamt005a attribute
	 */
	public String getTamt005a() {
		return tamt005a.getValue();
	}

	/**
	 * Setter for tamt005a attribute.
	 * @param tamt005a the new value of tamt005a
	 */
	public void setTamt005a(String tamt005a) {
		this.tamt005a.setValue(tamt005a);
	}
	/**
	 * Gets the reference for attribute tamt005i.
	 * @return the tamt005i attribute reference
	 */
	public ElementaryRangeReference getTamt005iReference() {
		return tamt005i.getReference();
	}

	/**
	 * Getter for tamt005i attribute.
	 * @return tamt005i attribute
	 */
	public String getTamt005i() {
		return tamt005i.getValue();
	}

	/**
	 * Setter for tamt005i attribute.
	 * @param tamt005i the new value of tamt005i
	 */
	public void setTamt005i(String tamt005i) {
		this.tamt005i.setValue(tamt005i);
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
	 * Gets the reference for attribute trnid06l.
	 * @return the trnid06l attribute reference
	 */
	public ElementaryRangeReference getTrnid06lReference() {
		return trnid06l.getReference();
	}

	/**
	 * Getter for trnid06l attribute.
	 * @return trnid06l attribute
	 */
	public int getTrnid06l() {
		return trnid06l.getValue();
	}

	/**
	 * Setter for trnid06l attribute.
	 * @param trnid06l the new value of trnid06l
	 */
	public void setTrnid06l(int trnid06l) {
		this.trnid06l.setValue(trnid06l);
	}
	/**
	 * Gets the reference for attribute trnid06f.
	 * @return the trnid06f attribute reference
	 */
	public ElementaryRangeReference getTrnid06fReference() {
		return trnid06f.getReference();
	}

	/**
	 * Getter for trnid06f attribute.
	 * @return trnid06f attribute
	 */
	public String getTrnid06f() {
		return trnid06f.getValue();
	}

	/**
	 * Setter for trnid06f attribute.
	 * @param trnid06f the new value of trnid06f
	 */
	public void setTrnid06f(String trnid06f) {
		this.trnid06f.setValue(trnid06f);
	}
	/**
	 * Gets the reference for attribute trnid06a.
	 * @return the trnid06a attribute reference
	 */
	public ElementaryRangeReference getTrnid06aReference() {
		return trnid06a.getReference();
	}

	/**
	 * Getter for trnid06a attribute.
	 * @return trnid06a attribute
	 */
	public String getTrnid06a() {
		return trnid06a.getValue();
	}

	/**
	 * Setter for trnid06a attribute.
	 * @param trnid06a the new value of trnid06a
	 */
	public void setTrnid06a(String trnid06a) {
		this.trnid06a.setValue(trnid06a);
	}
	/**
	 * Gets the reference for attribute trnid06i.
	 * @return the trnid06i attribute reference
	 */
	public ElementaryRangeReference getTrnid06iReference() {
		return trnid06i.getReference();
	}

	/**
	 * Getter for trnid06i attribute.
	 * @return trnid06i attribute
	 */
	public String getTrnid06i() {
		return trnid06i.getValue();
	}

	/**
	 * Setter for trnid06i attribute.
	 * @param trnid06i the new value of trnid06i
	 */
	public void setTrnid06i(String trnid06i) {
		this.trnid06i.setValue(trnid06i);
	}
	/**
	 * Gets the reference for attribute tdate06l.
	 * @return the tdate06l attribute reference
	 */
	public ElementaryRangeReference getTdate06lReference() {
		return tdate06l.getReference();
	}

	/**
	 * Getter for tdate06l attribute.
	 * @return tdate06l attribute
	 */
	public int getTdate06l() {
		return tdate06l.getValue();
	}

	/**
	 * Setter for tdate06l attribute.
	 * @param tdate06l the new value of tdate06l
	 */
	public void setTdate06l(int tdate06l) {
		this.tdate06l.setValue(tdate06l);
	}
	/**
	 * Gets the reference for attribute tdate06f.
	 * @return the tdate06f attribute reference
	 */
	public ElementaryRangeReference getTdate06fReference() {
		return tdate06f.getReference();
	}

	/**
	 * Getter for tdate06f attribute.
	 * @return tdate06f attribute
	 */
	public String getTdate06f() {
		return tdate06f.getValue();
	}

	/**
	 * Setter for tdate06f attribute.
	 * @param tdate06f the new value of tdate06f
	 */
	public void setTdate06f(String tdate06f) {
		this.tdate06f.setValue(tdate06f);
	}
	/**
	 * Gets the reference for attribute tdate06a.
	 * @return the tdate06a attribute reference
	 */
	public ElementaryRangeReference getTdate06aReference() {
		return tdate06a.getReference();
	}

	/**
	 * Getter for tdate06a attribute.
	 * @return tdate06a attribute
	 */
	public String getTdate06a() {
		return tdate06a.getValue();
	}

	/**
	 * Setter for tdate06a attribute.
	 * @param tdate06a the new value of tdate06a
	 */
	public void setTdate06a(String tdate06a) {
		this.tdate06a.setValue(tdate06a);
	}
	/**
	 * Gets the reference for attribute tdate06i.
	 * @return the tdate06i attribute reference
	 */
	public ElementaryRangeReference getTdate06iReference() {
		return tdate06i.getReference();
	}

	/**
	 * Getter for tdate06i attribute.
	 * @return tdate06i attribute
	 */
	public String getTdate06i() {
		return tdate06i.getValue();
	}

	/**
	 * Setter for tdate06i attribute.
	 * @param tdate06i the new value of tdate06i
	 */
	public void setTdate06i(String tdate06i) {
		this.tdate06i.setValue(tdate06i);
	}
	/**
	 * Gets the reference for attribute tdesc06l.
	 * @return the tdesc06l attribute reference
	 */
	public ElementaryRangeReference getTdesc06lReference() {
		return tdesc06l.getReference();
	}

	/**
	 * Getter for tdesc06l attribute.
	 * @return tdesc06l attribute
	 */
	public int getTdesc06l() {
		return tdesc06l.getValue();
	}

	/**
	 * Setter for tdesc06l attribute.
	 * @param tdesc06l the new value of tdesc06l
	 */
	public void setTdesc06l(int tdesc06l) {
		this.tdesc06l.setValue(tdesc06l);
	}
	/**
	 * Gets the reference for attribute tdesc06f.
	 * @return the tdesc06f attribute reference
	 */
	public ElementaryRangeReference getTdesc06fReference() {
		return tdesc06f.getReference();
	}

	/**
	 * Getter for tdesc06f attribute.
	 * @return tdesc06f attribute
	 */
	public String getTdesc06f() {
		return tdesc06f.getValue();
	}

	/**
	 * Setter for tdesc06f attribute.
	 * @param tdesc06f the new value of tdesc06f
	 */
	public void setTdesc06f(String tdesc06f) {
		this.tdesc06f.setValue(tdesc06f);
	}
	/**
	 * Gets the reference for attribute tdesc06a.
	 * @return the tdesc06a attribute reference
	 */
	public ElementaryRangeReference getTdesc06aReference() {
		return tdesc06a.getReference();
	}

	/**
	 * Getter for tdesc06a attribute.
	 * @return tdesc06a attribute
	 */
	public String getTdesc06a() {
		return tdesc06a.getValue();
	}

	/**
	 * Setter for tdesc06a attribute.
	 * @param tdesc06a the new value of tdesc06a
	 */
	public void setTdesc06a(String tdesc06a) {
		this.tdesc06a.setValue(tdesc06a);
	}
	/**
	 * Gets the reference for attribute tdesc06i.
	 * @return the tdesc06i attribute reference
	 */
	public ElementaryRangeReference getTdesc06iReference() {
		return tdesc06i.getReference();
	}

	/**
	 * Getter for tdesc06i attribute.
	 * @return tdesc06i attribute
	 */
	public String getTdesc06i() {
		return tdesc06i.getValue();
	}

	/**
	 * Setter for tdesc06i attribute.
	 * @param tdesc06i the new value of tdesc06i
	 */
	public void setTdesc06i(String tdesc06i) {
		this.tdesc06i.setValue(tdesc06i);
	}
	/**
	 * Gets the reference for attribute tamt006l.
	 * @return the tamt006l attribute reference
	 */
	public ElementaryRangeReference getTamt006lReference() {
		return tamt006l.getReference();
	}

	/**
	 * Getter for tamt006l attribute.
	 * @return tamt006l attribute
	 */
	public int getTamt006l() {
		return tamt006l.getValue();
	}

	/**
	 * Setter for tamt006l attribute.
	 * @param tamt006l the new value of tamt006l
	 */
	public void setTamt006l(int tamt006l) {
		this.tamt006l.setValue(tamt006l);
	}
	/**
	 * Gets the reference for attribute tamt006f.
	 * @return the tamt006f attribute reference
	 */
	public ElementaryRangeReference getTamt006fReference() {
		return tamt006f.getReference();
	}

	/**
	 * Getter for tamt006f attribute.
	 * @return tamt006f attribute
	 */
	public String getTamt006f() {
		return tamt006f.getValue();
	}

	/**
	 * Setter for tamt006f attribute.
	 * @param tamt006f the new value of tamt006f
	 */
	public void setTamt006f(String tamt006f) {
		this.tamt006f.setValue(tamt006f);
	}
	/**
	 * Gets the reference for attribute tamt006a.
	 * @return the tamt006a attribute reference
	 */
	public ElementaryRangeReference getTamt006aReference() {
		return tamt006a.getReference();
	}

	/**
	 * Getter for tamt006a attribute.
	 * @return tamt006a attribute
	 */
	public String getTamt006a() {
		return tamt006a.getValue();
	}

	/**
	 * Setter for tamt006a attribute.
	 * @param tamt006a the new value of tamt006a
	 */
	public void setTamt006a(String tamt006a) {
		this.tamt006a.setValue(tamt006a);
	}
	/**
	 * Gets the reference for attribute tamt006i.
	 * @return the tamt006i attribute reference
	 */
	public ElementaryRangeReference getTamt006iReference() {
		return tamt006i.getReference();
	}

	/**
	 * Getter for tamt006i attribute.
	 * @return tamt006i attribute
	 */
	public String getTamt006i() {
		return tamt006i.getValue();
	}

	/**
	 * Setter for tamt006i attribute.
	 * @param tamt006i the new value of tamt006i
	 */
	public void setTamt006i(String tamt006i) {
		this.tamt006i.setValue(tamt006i);
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
	 * Gets the reference for attribute trnid07l.
	 * @return the trnid07l attribute reference
	 */
	public ElementaryRangeReference getTrnid07lReference() {
		return trnid07l.getReference();
	}

	/**
	 * Getter for trnid07l attribute.
	 * @return trnid07l attribute
	 */
	public int getTrnid07l() {
		return trnid07l.getValue();
	}

	/**
	 * Setter for trnid07l attribute.
	 * @param trnid07l the new value of trnid07l
	 */
	public void setTrnid07l(int trnid07l) {
		this.trnid07l.setValue(trnid07l);
	}
	/**
	 * Gets the reference for attribute trnid07f.
	 * @return the trnid07f attribute reference
	 */
	public ElementaryRangeReference getTrnid07fReference() {
		return trnid07f.getReference();
	}

	/**
	 * Getter for trnid07f attribute.
	 * @return trnid07f attribute
	 */
	public String getTrnid07f() {
		return trnid07f.getValue();
	}

	/**
	 * Setter for trnid07f attribute.
	 * @param trnid07f the new value of trnid07f
	 */
	public void setTrnid07f(String trnid07f) {
		this.trnid07f.setValue(trnid07f);
	}
	/**
	 * Gets the reference for attribute trnid07a.
	 * @return the trnid07a attribute reference
	 */
	public ElementaryRangeReference getTrnid07aReference() {
		return trnid07a.getReference();
	}

	/**
	 * Getter for trnid07a attribute.
	 * @return trnid07a attribute
	 */
	public String getTrnid07a() {
		return trnid07a.getValue();
	}

	/**
	 * Setter for trnid07a attribute.
	 * @param trnid07a the new value of trnid07a
	 */
	public void setTrnid07a(String trnid07a) {
		this.trnid07a.setValue(trnid07a);
	}
	/**
	 * Gets the reference for attribute trnid07i.
	 * @return the trnid07i attribute reference
	 */
	public ElementaryRangeReference getTrnid07iReference() {
		return trnid07i.getReference();
	}

	/**
	 * Getter for trnid07i attribute.
	 * @return trnid07i attribute
	 */
	public String getTrnid07i() {
		return trnid07i.getValue();
	}

	/**
	 * Setter for trnid07i attribute.
	 * @param trnid07i the new value of trnid07i
	 */
	public void setTrnid07i(String trnid07i) {
		this.trnid07i.setValue(trnid07i);
	}
	/**
	 * Gets the reference for attribute tdate07l.
	 * @return the tdate07l attribute reference
	 */
	public ElementaryRangeReference getTdate07lReference() {
		return tdate07l.getReference();
	}

	/**
	 * Getter for tdate07l attribute.
	 * @return tdate07l attribute
	 */
	public int getTdate07l() {
		return tdate07l.getValue();
	}

	/**
	 * Setter for tdate07l attribute.
	 * @param tdate07l the new value of tdate07l
	 */
	public void setTdate07l(int tdate07l) {
		this.tdate07l.setValue(tdate07l);
	}
	/**
	 * Gets the reference for attribute tdate07f.
	 * @return the tdate07f attribute reference
	 */
	public ElementaryRangeReference getTdate07fReference() {
		return tdate07f.getReference();
	}

	/**
	 * Getter for tdate07f attribute.
	 * @return tdate07f attribute
	 */
	public String getTdate07f() {
		return tdate07f.getValue();
	}

	/**
	 * Setter for tdate07f attribute.
	 * @param tdate07f the new value of tdate07f
	 */
	public void setTdate07f(String tdate07f) {
		this.tdate07f.setValue(tdate07f);
	}
	/**
	 * Gets the reference for attribute tdate07a.
	 * @return the tdate07a attribute reference
	 */
	public ElementaryRangeReference getTdate07aReference() {
		return tdate07a.getReference();
	}

	/**
	 * Getter for tdate07a attribute.
	 * @return tdate07a attribute
	 */
	public String getTdate07a() {
		return tdate07a.getValue();
	}

	/**
	 * Setter for tdate07a attribute.
	 * @param tdate07a the new value of tdate07a
	 */
	public void setTdate07a(String tdate07a) {
		this.tdate07a.setValue(tdate07a);
	}
	/**
	 * Gets the reference for attribute tdate07i.
	 * @return the tdate07i attribute reference
	 */
	public ElementaryRangeReference getTdate07iReference() {
		return tdate07i.getReference();
	}

	/**
	 * Getter for tdate07i attribute.
	 * @return tdate07i attribute
	 */
	public String getTdate07i() {
		return tdate07i.getValue();
	}

	/**
	 * Setter for tdate07i attribute.
	 * @param tdate07i the new value of tdate07i
	 */
	public void setTdate07i(String tdate07i) {
		this.tdate07i.setValue(tdate07i);
	}
	/**
	 * Gets the reference for attribute tdesc07l.
	 * @return the tdesc07l attribute reference
	 */
	public ElementaryRangeReference getTdesc07lReference() {
		return tdesc07l.getReference();
	}

	/**
	 * Getter for tdesc07l attribute.
	 * @return tdesc07l attribute
	 */
	public int getTdesc07l() {
		return tdesc07l.getValue();
	}

	/**
	 * Setter for tdesc07l attribute.
	 * @param tdesc07l the new value of tdesc07l
	 */
	public void setTdesc07l(int tdesc07l) {
		this.tdesc07l.setValue(tdesc07l);
	}
	/**
	 * Gets the reference for attribute tdesc07f.
	 * @return the tdesc07f attribute reference
	 */
	public ElementaryRangeReference getTdesc07fReference() {
		return tdesc07f.getReference();
	}

	/**
	 * Getter for tdesc07f attribute.
	 * @return tdesc07f attribute
	 */
	public String getTdesc07f() {
		return tdesc07f.getValue();
	}

	/**
	 * Setter for tdesc07f attribute.
	 * @param tdesc07f the new value of tdesc07f
	 */
	public void setTdesc07f(String tdesc07f) {
		this.tdesc07f.setValue(tdesc07f);
	}
	/**
	 * Gets the reference for attribute tdesc07a.
	 * @return the tdesc07a attribute reference
	 */
	public ElementaryRangeReference getTdesc07aReference() {
		return tdesc07a.getReference();
	}

	/**
	 * Getter for tdesc07a attribute.
	 * @return tdesc07a attribute
	 */
	public String getTdesc07a() {
		return tdesc07a.getValue();
	}

	/**
	 * Setter for tdesc07a attribute.
	 * @param tdesc07a the new value of tdesc07a
	 */
	public void setTdesc07a(String tdesc07a) {
		this.tdesc07a.setValue(tdesc07a);
	}
	/**
	 * Gets the reference for attribute tdesc07i.
	 * @return the tdesc07i attribute reference
	 */
	public ElementaryRangeReference getTdesc07iReference() {
		return tdesc07i.getReference();
	}

	/**
	 * Getter for tdesc07i attribute.
	 * @return tdesc07i attribute
	 */
	public String getTdesc07i() {
		return tdesc07i.getValue();
	}

	/**
	 * Setter for tdesc07i attribute.
	 * @param tdesc07i the new value of tdesc07i
	 */
	public void setTdesc07i(String tdesc07i) {
		this.tdesc07i.setValue(tdesc07i);
	}
	/**
	 * Gets the reference for attribute tamt007l.
	 * @return the tamt007l attribute reference
	 */
	public ElementaryRangeReference getTamt007lReference() {
		return tamt007l.getReference();
	}

	/**
	 * Getter for tamt007l attribute.
	 * @return tamt007l attribute
	 */
	public int getTamt007l() {
		return tamt007l.getValue();
	}

	/**
	 * Setter for tamt007l attribute.
	 * @param tamt007l the new value of tamt007l
	 */
	public void setTamt007l(int tamt007l) {
		this.tamt007l.setValue(tamt007l);
	}
	/**
	 * Gets the reference for attribute tamt007f.
	 * @return the tamt007f attribute reference
	 */
	public ElementaryRangeReference getTamt007fReference() {
		return tamt007f.getReference();
	}

	/**
	 * Getter for tamt007f attribute.
	 * @return tamt007f attribute
	 */
	public String getTamt007f() {
		return tamt007f.getValue();
	}

	/**
	 * Setter for tamt007f attribute.
	 * @param tamt007f the new value of tamt007f
	 */
	public void setTamt007f(String tamt007f) {
		this.tamt007f.setValue(tamt007f);
	}
	/**
	 * Gets the reference for attribute tamt007a.
	 * @return the tamt007a attribute reference
	 */
	public ElementaryRangeReference getTamt007aReference() {
		return tamt007a.getReference();
	}

	/**
	 * Getter for tamt007a attribute.
	 * @return tamt007a attribute
	 */
	public String getTamt007a() {
		return tamt007a.getValue();
	}

	/**
	 * Setter for tamt007a attribute.
	 * @param tamt007a the new value of tamt007a
	 */
	public void setTamt007a(String tamt007a) {
		this.tamt007a.setValue(tamt007a);
	}
	/**
	 * Gets the reference for attribute tamt007i.
	 * @return the tamt007i attribute reference
	 */
	public ElementaryRangeReference getTamt007iReference() {
		return tamt007i.getReference();
	}

	/**
	 * Getter for tamt007i attribute.
	 * @return tamt007i attribute
	 */
	public String getTamt007i() {
		return tamt007i.getValue();
	}

	/**
	 * Setter for tamt007i attribute.
	 * @param tamt007i the new value of tamt007i
	 */
	public void setTamt007i(String tamt007i) {
		this.tamt007i.setValue(tamt007i);
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
	 * Gets the reference for attribute trnid08l.
	 * @return the trnid08l attribute reference
	 */
	public ElementaryRangeReference getTrnid08lReference() {
		return trnid08l.getReference();
	}

	/**
	 * Getter for trnid08l attribute.
	 * @return trnid08l attribute
	 */
	public int getTrnid08l() {
		return trnid08l.getValue();
	}

	/**
	 * Setter for trnid08l attribute.
	 * @param trnid08l the new value of trnid08l
	 */
	public void setTrnid08l(int trnid08l) {
		this.trnid08l.setValue(trnid08l);
	}
	/**
	 * Gets the reference for attribute trnid08f.
	 * @return the trnid08f attribute reference
	 */
	public ElementaryRangeReference getTrnid08fReference() {
		return trnid08f.getReference();
	}

	/**
	 * Getter for trnid08f attribute.
	 * @return trnid08f attribute
	 */
	public String getTrnid08f() {
		return trnid08f.getValue();
	}

	/**
	 * Setter for trnid08f attribute.
	 * @param trnid08f the new value of trnid08f
	 */
	public void setTrnid08f(String trnid08f) {
		this.trnid08f.setValue(trnid08f);
	}
	/**
	 * Gets the reference for attribute trnid08a.
	 * @return the trnid08a attribute reference
	 */
	public ElementaryRangeReference getTrnid08aReference() {
		return trnid08a.getReference();
	}

	/**
	 * Getter for trnid08a attribute.
	 * @return trnid08a attribute
	 */
	public String getTrnid08a() {
		return trnid08a.getValue();
	}

	/**
	 * Setter for trnid08a attribute.
	 * @param trnid08a the new value of trnid08a
	 */
	public void setTrnid08a(String trnid08a) {
		this.trnid08a.setValue(trnid08a);
	}
	/**
	 * Gets the reference for attribute trnid08i.
	 * @return the trnid08i attribute reference
	 */
	public ElementaryRangeReference getTrnid08iReference() {
		return trnid08i.getReference();
	}

	/**
	 * Getter for trnid08i attribute.
	 * @return trnid08i attribute
	 */
	public String getTrnid08i() {
		return trnid08i.getValue();
	}

	/**
	 * Setter for trnid08i attribute.
	 * @param trnid08i the new value of trnid08i
	 */
	public void setTrnid08i(String trnid08i) {
		this.trnid08i.setValue(trnid08i);
	}
	/**
	 * Gets the reference for attribute tdate08l.
	 * @return the tdate08l attribute reference
	 */
	public ElementaryRangeReference getTdate08lReference() {
		return tdate08l.getReference();
	}

	/**
	 * Getter for tdate08l attribute.
	 * @return tdate08l attribute
	 */
	public int getTdate08l() {
		return tdate08l.getValue();
	}

	/**
	 * Setter for tdate08l attribute.
	 * @param tdate08l the new value of tdate08l
	 */
	public void setTdate08l(int tdate08l) {
		this.tdate08l.setValue(tdate08l);
	}
	/**
	 * Gets the reference for attribute tdate08f.
	 * @return the tdate08f attribute reference
	 */
	public ElementaryRangeReference getTdate08fReference() {
		return tdate08f.getReference();
	}

	/**
	 * Getter for tdate08f attribute.
	 * @return tdate08f attribute
	 */
	public String getTdate08f() {
		return tdate08f.getValue();
	}

	/**
	 * Setter for tdate08f attribute.
	 * @param tdate08f the new value of tdate08f
	 */
	public void setTdate08f(String tdate08f) {
		this.tdate08f.setValue(tdate08f);
	}
	/**
	 * Gets the reference for attribute tdate08a.
	 * @return the tdate08a attribute reference
	 */
	public ElementaryRangeReference getTdate08aReference() {
		return tdate08a.getReference();
	}

	/**
	 * Getter for tdate08a attribute.
	 * @return tdate08a attribute
	 */
	public String getTdate08a() {
		return tdate08a.getValue();
	}

	/**
	 * Setter for tdate08a attribute.
	 * @param tdate08a the new value of tdate08a
	 */
	public void setTdate08a(String tdate08a) {
		this.tdate08a.setValue(tdate08a);
	}
	/**
	 * Gets the reference for attribute tdate08i.
	 * @return the tdate08i attribute reference
	 */
	public ElementaryRangeReference getTdate08iReference() {
		return tdate08i.getReference();
	}

	/**
	 * Getter for tdate08i attribute.
	 * @return tdate08i attribute
	 */
	public String getTdate08i() {
		return tdate08i.getValue();
	}

	/**
	 * Setter for tdate08i attribute.
	 * @param tdate08i the new value of tdate08i
	 */
	public void setTdate08i(String tdate08i) {
		this.tdate08i.setValue(tdate08i);
	}
	/**
	 * Gets the reference for attribute tdesc08l.
	 * @return the tdesc08l attribute reference
	 */
	public ElementaryRangeReference getTdesc08lReference() {
		return tdesc08l.getReference();
	}

	/**
	 * Getter for tdesc08l attribute.
	 * @return tdesc08l attribute
	 */
	public int getTdesc08l() {
		return tdesc08l.getValue();
	}

	/**
	 * Setter for tdesc08l attribute.
	 * @param tdesc08l the new value of tdesc08l
	 */
	public void setTdesc08l(int tdesc08l) {
		this.tdesc08l.setValue(tdesc08l);
	}
	/**
	 * Gets the reference for attribute tdesc08f.
	 * @return the tdesc08f attribute reference
	 */
	public ElementaryRangeReference getTdesc08fReference() {
		return tdesc08f.getReference();
	}

	/**
	 * Getter for tdesc08f attribute.
	 * @return tdesc08f attribute
	 */
	public String getTdesc08f() {
		return tdesc08f.getValue();
	}

	/**
	 * Setter for tdesc08f attribute.
	 * @param tdesc08f the new value of tdesc08f
	 */
	public void setTdesc08f(String tdesc08f) {
		this.tdesc08f.setValue(tdesc08f);
	}
	/**
	 * Gets the reference for attribute tdesc08a.
	 * @return the tdesc08a attribute reference
	 */
	public ElementaryRangeReference getTdesc08aReference() {
		return tdesc08a.getReference();
	}

	/**
	 * Getter for tdesc08a attribute.
	 * @return tdesc08a attribute
	 */
	public String getTdesc08a() {
		return tdesc08a.getValue();
	}

	/**
	 * Setter for tdesc08a attribute.
	 * @param tdesc08a the new value of tdesc08a
	 */
	public void setTdesc08a(String tdesc08a) {
		this.tdesc08a.setValue(tdesc08a);
	}
	/**
	 * Gets the reference for attribute tdesc08i.
	 * @return the tdesc08i attribute reference
	 */
	public ElementaryRangeReference getTdesc08iReference() {
		return tdesc08i.getReference();
	}

	/**
	 * Getter for tdesc08i attribute.
	 * @return tdesc08i attribute
	 */
	public String getTdesc08i() {
		return tdesc08i.getValue();
	}

	/**
	 * Setter for tdesc08i attribute.
	 * @param tdesc08i the new value of tdesc08i
	 */
	public void setTdesc08i(String tdesc08i) {
		this.tdesc08i.setValue(tdesc08i);
	}
	/**
	 * Gets the reference for attribute tamt008l.
	 * @return the tamt008l attribute reference
	 */
	public ElementaryRangeReference getTamt008lReference() {
		return tamt008l.getReference();
	}

	/**
	 * Getter for tamt008l attribute.
	 * @return tamt008l attribute
	 */
	public int getTamt008l() {
		return tamt008l.getValue();
	}

	/**
	 * Setter for tamt008l attribute.
	 * @param tamt008l the new value of tamt008l
	 */
	public void setTamt008l(int tamt008l) {
		this.tamt008l.setValue(tamt008l);
	}
	/**
	 * Gets the reference for attribute tamt008f.
	 * @return the tamt008f attribute reference
	 */
	public ElementaryRangeReference getTamt008fReference() {
		return tamt008f.getReference();
	}

	/**
	 * Getter for tamt008f attribute.
	 * @return tamt008f attribute
	 */
	public String getTamt008f() {
		return tamt008f.getValue();
	}

	/**
	 * Setter for tamt008f attribute.
	 * @param tamt008f the new value of tamt008f
	 */
	public void setTamt008f(String tamt008f) {
		this.tamt008f.setValue(tamt008f);
	}
	/**
	 * Gets the reference for attribute tamt008a.
	 * @return the tamt008a attribute reference
	 */
	public ElementaryRangeReference getTamt008aReference() {
		return tamt008a.getReference();
	}

	/**
	 * Getter for tamt008a attribute.
	 * @return tamt008a attribute
	 */
	public String getTamt008a() {
		return tamt008a.getValue();
	}

	/**
	 * Setter for tamt008a attribute.
	 * @param tamt008a the new value of tamt008a
	 */
	public void setTamt008a(String tamt008a) {
		this.tamt008a.setValue(tamt008a);
	}
	/**
	 * Gets the reference for attribute tamt008i.
	 * @return the tamt008i attribute reference
	 */
	public ElementaryRangeReference getTamt008iReference() {
		return tamt008i.getReference();
	}

	/**
	 * Getter for tamt008i attribute.
	 * @return tamt008i attribute
	 */
	public String getTamt008i() {
		return tamt008i.getValue();
	}

	/**
	 * Setter for tamt008i attribute.
	 * @param tamt008i the new value of tamt008i
	 */
	public void setTamt008i(String tamt008i) {
		this.tamt008i.setValue(tamt008i);
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
	 * Gets the reference for attribute trnid09l.
	 * @return the trnid09l attribute reference
	 */
	public ElementaryRangeReference getTrnid09lReference() {
		return trnid09l.getReference();
	}

	/**
	 * Getter for trnid09l attribute.
	 * @return trnid09l attribute
	 */
	public int getTrnid09l() {
		return trnid09l.getValue();
	}

	/**
	 * Setter for trnid09l attribute.
	 * @param trnid09l the new value of trnid09l
	 */
	public void setTrnid09l(int trnid09l) {
		this.trnid09l.setValue(trnid09l);
	}
	/**
	 * Gets the reference for attribute trnid09f.
	 * @return the trnid09f attribute reference
	 */
	public ElementaryRangeReference getTrnid09fReference() {
		return trnid09f.getReference();
	}

	/**
	 * Getter for trnid09f attribute.
	 * @return trnid09f attribute
	 */
	public String getTrnid09f() {
		return trnid09f.getValue();
	}

	/**
	 * Setter for trnid09f attribute.
	 * @param trnid09f the new value of trnid09f
	 */
	public void setTrnid09f(String trnid09f) {
		this.trnid09f.setValue(trnid09f);
	}
	/**
	 * Gets the reference for attribute trnid09a.
	 * @return the trnid09a attribute reference
	 */
	public ElementaryRangeReference getTrnid09aReference() {
		return trnid09a.getReference();
	}

	/**
	 * Getter for trnid09a attribute.
	 * @return trnid09a attribute
	 */
	public String getTrnid09a() {
		return trnid09a.getValue();
	}

	/**
	 * Setter for trnid09a attribute.
	 * @param trnid09a the new value of trnid09a
	 */
	public void setTrnid09a(String trnid09a) {
		this.trnid09a.setValue(trnid09a);
	}
	/**
	 * Gets the reference for attribute trnid09i.
	 * @return the trnid09i attribute reference
	 */
	public ElementaryRangeReference getTrnid09iReference() {
		return trnid09i.getReference();
	}

	/**
	 * Getter for trnid09i attribute.
	 * @return trnid09i attribute
	 */
	public String getTrnid09i() {
		return trnid09i.getValue();
	}

	/**
	 * Setter for trnid09i attribute.
	 * @param trnid09i the new value of trnid09i
	 */
	public void setTrnid09i(String trnid09i) {
		this.trnid09i.setValue(trnid09i);
	}
	/**
	 * Gets the reference for attribute tdate09l.
	 * @return the tdate09l attribute reference
	 */
	public ElementaryRangeReference getTdate09lReference() {
		return tdate09l.getReference();
	}

	/**
	 * Getter for tdate09l attribute.
	 * @return tdate09l attribute
	 */
	public int getTdate09l() {
		return tdate09l.getValue();
	}

	/**
	 * Setter for tdate09l attribute.
	 * @param tdate09l the new value of tdate09l
	 */
	public void setTdate09l(int tdate09l) {
		this.tdate09l.setValue(tdate09l);
	}
	/**
	 * Gets the reference for attribute tdate09f.
	 * @return the tdate09f attribute reference
	 */
	public ElementaryRangeReference getTdate09fReference() {
		return tdate09f.getReference();
	}

	/**
	 * Getter for tdate09f attribute.
	 * @return tdate09f attribute
	 */
	public String getTdate09f() {
		return tdate09f.getValue();
	}

	/**
	 * Setter for tdate09f attribute.
	 * @param tdate09f the new value of tdate09f
	 */
	public void setTdate09f(String tdate09f) {
		this.tdate09f.setValue(tdate09f);
	}
	/**
	 * Gets the reference for attribute tdate09a.
	 * @return the tdate09a attribute reference
	 */
	public ElementaryRangeReference getTdate09aReference() {
		return tdate09a.getReference();
	}

	/**
	 * Getter for tdate09a attribute.
	 * @return tdate09a attribute
	 */
	public String getTdate09a() {
		return tdate09a.getValue();
	}

	/**
	 * Setter for tdate09a attribute.
	 * @param tdate09a the new value of tdate09a
	 */
	public void setTdate09a(String tdate09a) {
		this.tdate09a.setValue(tdate09a);
	}
	/**
	 * Gets the reference for attribute tdate09i.
	 * @return the tdate09i attribute reference
	 */
	public ElementaryRangeReference getTdate09iReference() {
		return tdate09i.getReference();
	}

	/**
	 * Getter for tdate09i attribute.
	 * @return tdate09i attribute
	 */
	public String getTdate09i() {
		return tdate09i.getValue();
	}

	/**
	 * Setter for tdate09i attribute.
	 * @param tdate09i the new value of tdate09i
	 */
	public void setTdate09i(String tdate09i) {
		this.tdate09i.setValue(tdate09i);
	}
	/**
	 * Gets the reference for attribute tdesc09l.
	 * @return the tdesc09l attribute reference
	 */
	public ElementaryRangeReference getTdesc09lReference() {
		return tdesc09l.getReference();
	}

	/**
	 * Getter for tdesc09l attribute.
	 * @return tdesc09l attribute
	 */
	public int getTdesc09l() {
		return tdesc09l.getValue();
	}

	/**
	 * Setter for tdesc09l attribute.
	 * @param tdesc09l the new value of tdesc09l
	 */
	public void setTdesc09l(int tdesc09l) {
		this.tdesc09l.setValue(tdesc09l);
	}
	/**
	 * Gets the reference for attribute tdesc09f.
	 * @return the tdesc09f attribute reference
	 */
	public ElementaryRangeReference getTdesc09fReference() {
		return tdesc09f.getReference();
	}

	/**
	 * Getter for tdesc09f attribute.
	 * @return tdesc09f attribute
	 */
	public String getTdesc09f() {
		return tdesc09f.getValue();
	}

	/**
	 * Setter for tdesc09f attribute.
	 * @param tdesc09f the new value of tdesc09f
	 */
	public void setTdesc09f(String tdesc09f) {
		this.tdesc09f.setValue(tdesc09f);
	}
	/**
	 * Gets the reference for attribute tdesc09a.
	 * @return the tdesc09a attribute reference
	 */
	public ElementaryRangeReference getTdesc09aReference() {
		return tdesc09a.getReference();
	}

	/**
	 * Getter for tdesc09a attribute.
	 * @return tdesc09a attribute
	 */
	public String getTdesc09a() {
		return tdesc09a.getValue();
	}

	/**
	 * Setter for tdesc09a attribute.
	 * @param tdesc09a the new value of tdesc09a
	 */
	public void setTdesc09a(String tdesc09a) {
		this.tdesc09a.setValue(tdesc09a);
	}
	/**
	 * Gets the reference for attribute tdesc09i.
	 * @return the tdesc09i attribute reference
	 */
	public ElementaryRangeReference getTdesc09iReference() {
		return tdesc09i.getReference();
	}

	/**
	 * Getter for tdesc09i attribute.
	 * @return tdesc09i attribute
	 */
	public String getTdesc09i() {
		return tdesc09i.getValue();
	}

	/**
	 * Setter for tdesc09i attribute.
	 * @param tdesc09i the new value of tdesc09i
	 */
	public void setTdesc09i(String tdesc09i) {
		this.tdesc09i.setValue(tdesc09i);
	}
	/**
	 * Gets the reference for attribute tamt009l.
	 * @return the tamt009l attribute reference
	 */
	public ElementaryRangeReference getTamt009lReference() {
		return tamt009l.getReference();
	}

	/**
	 * Getter for tamt009l attribute.
	 * @return tamt009l attribute
	 */
	public int getTamt009l() {
		return tamt009l.getValue();
	}

	/**
	 * Setter for tamt009l attribute.
	 * @param tamt009l the new value of tamt009l
	 */
	public void setTamt009l(int tamt009l) {
		this.tamt009l.setValue(tamt009l);
	}
	/**
	 * Gets the reference for attribute tamt009f.
	 * @return the tamt009f attribute reference
	 */
	public ElementaryRangeReference getTamt009fReference() {
		return tamt009f.getReference();
	}

	/**
	 * Getter for tamt009f attribute.
	 * @return tamt009f attribute
	 */
	public String getTamt009f() {
		return tamt009f.getValue();
	}

	/**
	 * Setter for tamt009f attribute.
	 * @param tamt009f the new value of tamt009f
	 */
	public void setTamt009f(String tamt009f) {
		this.tamt009f.setValue(tamt009f);
	}
	/**
	 * Gets the reference for attribute tamt009a.
	 * @return the tamt009a attribute reference
	 */
	public ElementaryRangeReference getTamt009aReference() {
		return tamt009a.getReference();
	}

	/**
	 * Getter for tamt009a attribute.
	 * @return tamt009a attribute
	 */
	public String getTamt009a() {
		return tamt009a.getValue();
	}

	/**
	 * Setter for tamt009a attribute.
	 * @param tamt009a the new value of tamt009a
	 */
	public void setTamt009a(String tamt009a) {
		this.tamt009a.setValue(tamt009a);
	}
	/**
	 * Gets the reference for attribute tamt009i.
	 * @return the tamt009i attribute reference
	 */
	public ElementaryRangeReference getTamt009iReference() {
		return tamt009i.getReference();
	}

	/**
	 * Getter for tamt009i attribute.
	 * @return tamt009i attribute
	 */
	public String getTamt009i() {
		return tamt009i.getValue();
	}

	/**
	 * Setter for tamt009i attribute.
	 * @param tamt009i the new value of tamt009i
	 */
	public void setTamt009i(String tamt009i) {
		this.tamt009i.setValue(tamt009i);
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
	 * Gets the reference for attribute trnid10l.
	 * @return the trnid10l attribute reference
	 */
	public ElementaryRangeReference getTrnid10lReference() {
		return trnid10l.getReference();
	}

	/**
	 * Getter for trnid10l attribute.
	 * @return trnid10l attribute
	 */
	public int getTrnid10l() {
		return trnid10l.getValue();
	}

	/**
	 * Setter for trnid10l attribute.
	 * @param trnid10l the new value of trnid10l
	 */
	public void setTrnid10l(int trnid10l) {
		this.trnid10l.setValue(trnid10l);
	}
	/**
	 * Gets the reference for attribute trnid10f.
	 * @return the trnid10f attribute reference
	 */
	public ElementaryRangeReference getTrnid10fReference() {
		return trnid10f.getReference();
	}

	/**
	 * Getter for trnid10f attribute.
	 * @return trnid10f attribute
	 */
	public String getTrnid10f() {
		return trnid10f.getValue();
	}

	/**
	 * Setter for trnid10f attribute.
	 * @param trnid10f the new value of trnid10f
	 */
	public void setTrnid10f(String trnid10f) {
		this.trnid10f.setValue(trnid10f);
	}
	/**
	 * Gets the reference for attribute trnid10a.
	 * @return the trnid10a attribute reference
	 */
	public ElementaryRangeReference getTrnid10aReference() {
		return trnid10a.getReference();
	}

	/**
	 * Getter for trnid10a attribute.
	 * @return trnid10a attribute
	 */
	public String getTrnid10a() {
		return trnid10a.getValue();
	}

	/**
	 * Setter for trnid10a attribute.
	 * @param trnid10a the new value of trnid10a
	 */
	public void setTrnid10a(String trnid10a) {
		this.trnid10a.setValue(trnid10a);
	}
	/**
	 * Gets the reference for attribute trnid10i.
	 * @return the trnid10i attribute reference
	 */
	public ElementaryRangeReference getTrnid10iReference() {
		return trnid10i.getReference();
	}

	/**
	 * Getter for trnid10i attribute.
	 * @return trnid10i attribute
	 */
	public String getTrnid10i() {
		return trnid10i.getValue();
	}

	/**
	 * Setter for trnid10i attribute.
	 * @param trnid10i the new value of trnid10i
	 */
	public void setTrnid10i(String trnid10i) {
		this.trnid10i.setValue(trnid10i);
	}
	/**
	 * Gets the reference for attribute tdate10l.
	 * @return the tdate10l attribute reference
	 */
	public ElementaryRangeReference getTdate10lReference() {
		return tdate10l.getReference();
	}

	/**
	 * Getter for tdate10l attribute.
	 * @return tdate10l attribute
	 */
	public int getTdate10l() {
		return tdate10l.getValue();
	}

	/**
	 * Setter for tdate10l attribute.
	 * @param tdate10l the new value of tdate10l
	 */
	public void setTdate10l(int tdate10l) {
		this.tdate10l.setValue(tdate10l);
	}
	/**
	 * Gets the reference for attribute tdate10f.
	 * @return the tdate10f attribute reference
	 */
	public ElementaryRangeReference getTdate10fReference() {
		return tdate10f.getReference();
	}

	/**
	 * Getter for tdate10f attribute.
	 * @return tdate10f attribute
	 */
	public String getTdate10f() {
		return tdate10f.getValue();
	}

	/**
	 * Setter for tdate10f attribute.
	 * @param tdate10f the new value of tdate10f
	 */
	public void setTdate10f(String tdate10f) {
		this.tdate10f.setValue(tdate10f);
	}
	/**
	 * Gets the reference for attribute tdate10a.
	 * @return the tdate10a attribute reference
	 */
	public ElementaryRangeReference getTdate10aReference() {
		return tdate10a.getReference();
	}

	/**
	 * Getter for tdate10a attribute.
	 * @return tdate10a attribute
	 */
	public String getTdate10a() {
		return tdate10a.getValue();
	}

	/**
	 * Setter for tdate10a attribute.
	 * @param tdate10a the new value of tdate10a
	 */
	public void setTdate10a(String tdate10a) {
		this.tdate10a.setValue(tdate10a);
	}
	/**
	 * Gets the reference for attribute tdate10i.
	 * @return the tdate10i attribute reference
	 */
	public ElementaryRangeReference getTdate10iReference() {
		return tdate10i.getReference();
	}

	/**
	 * Getter for tdate10i attribute.
	 * @return tdate10i attribute
	 */
	public String getTdate10i() {
		return tdate10i.getValue();
	}

	/**
	 * Setter for tdate10i attribute.
	 * @param tdate10i the new value of tdate10i
	 */
	public void setTdate10i(String tdate10i) {
		this.tdate10i.setValue(tdate10i);
	}
	/**
	 * Gets the reference for attribute tdesc10l.
	 * @return the tdesc10l attribute reference
	 */
	public ElementaryRangeReference getTdesc10lReference() {
		return tdesc10l.getReference();
	}

	/**
	 * Getter for tdesc10l attribute.
	 * @return tdesc10l attribute
	 */
	public int getTdesc10l() {
		return tdesc10l.getValue();
	}

	/**
	 * Setter for tdesc10l attribute.
	 * @param tdesc10l the new value of tdesc10l
	 */
	public void setTdesc10l(int tdesc10l) {
		this.tdesc10l.setValue(tdesc10l);
	}
	/**
	 * Gets the reference for attribute tdesc10f.
	 * @return the tdesc10f attribute reference
	 */
	public ElementaryRangeReference getTdesc10fReference() {
		return tdesc10f.getReference();
	}

	/**
	 * Getter for tdesc10f attribute.
	 * @return tdesc10f attribute
	 */
	public String getTdesc10f() {
		return tdesc10f.getValue();
	}

	/**
	 * Setter for tdesc10f attribute.
	 * @param tdesc10f the new value of tdesc10f
	 */
	public void setTdesc10f(String tdesc10f) {
		this.tdesc10f.setValue(tdesc10f);
	}
	/**
	 * Gets the reference for attribute tdesc10a.
	 * @return the tdesc10a attribute reference
	 */
	public ElementaryRangeReference getTdesc10aReference() {
		return tdesc10a.getReference();
	}

	/**
	 * Getter for tdesc10a attribute.
	 * @return tdesc10a attribute
	 */
	public String getTdesc10a() {
		return tdesc10a.getValue();
	}

	/**
	 * Setter for tdesc10a attribute.
	 * @param tdesc10a the new value of tdesc10a
	 */
	public void setTdesc10a(String tdesc10a) {
		this.tdesc10a.setValue(tdesc10a);
	}
	/**
	 * Gets the reference for attribute tdesc10i.
	 * @return the tdesc10i attribute reference
	 */
	public ElementaryRangeReference getTdesc10iReference() {
		return tdesc10i.getReference();
	}

	/**
	 * Getter for tdesc10i attribute.
	 * @return tdesc10i attribute
	 */
	public String getTdesc10i() {
		return tdesc10i.getValue();
	}

	/**
	 * Setter for tdesc10i attribute.
	 * @param tdesc10i the new value of tdesc10i
	 */
	public void setTdesc10i(String tdesc10i) {
		this.tdesc10i.setValue(tdesc10i);
	}
	/**
	 * Gets the reference for attribute tamt010l.
	 * @return the tamt010l attribute reference
	 */
	public ElementaryRangeReference getTamt010lReference() {
		return tamt010l.getReference();
	}

	/**
	 * Getter for tamt010l attribute.
	 * @return tamt010l attribute
	 */
	public int getTamt010l() {
		return tamt010l.getValue();
	}

	/**
	 * Setter for tamt010l attribute.
	 * @param tamt010l the new value of tamt010l
	 */
	public void setTamt010l(int tamt010l) {
		this.tamt010l.setValue(tamt010l);
	}
	/**
	 * Gets the reference for attribute tamt010f.
	 * @return the tamt010f attribute reference
	 */
	public ElementaryRangeReference getTamt010fReference() {
		return tamt010f.getReference();
	}

	/**
	 * Getter for tamt010f attribute.
	 * @return tamt010f attribute
	 */
	public String getTamt010f() {
		return tamt010f.getValue();
	}

	/**
	 * Setter for tamt010f attribute.
	 * @param tamt010f the new value of tamt010f
	 */
	public void setTamt010f(String tamt010f) {
		this.tamt010f.setValue(tamt010f);
	}
	/**
	 * Gets the reference for attribute tamt010a.
	 * @return the tamt010a attribute reference
	 */
	public ElementaryRangeReference getTamt010aReference() {
		return tamt010a.getReference();
	}

	/**
	 * Getter for tamt010a attribute.
	 * @return tamt010a attribute
	 */
	public String getTamt010a() {
		return tamt010a.getValue();
	}

	/**
	 * Setter for tamt010a attribute.
	 * @param tamt010a the new value of tamt010a
	 */
	public void setTamt010a(String tamt010a) {
		this.tamt010a.setValue(tamt010a);
	}
	/**
	 * Gets the reference for attribute tamt010i.
	 * @return the tamt010i attribute reference
	 */
	public ElementaryRangeReference getTamt010iReference() {
		return tamt010i.getReference();
	}

	/**
	 * Getter for tamt010i attribute.
	 * @return tamt010i attribute
	 */
	public String getTamt010i() {
		return tamt010i.getValue();
	}

	/**
	 * Setter for tamt010i attribute.
	 * @param tamt010i the new value of tamt010i
	 */
	public void setTamt010i(String tamt010i) {
		this.tamt010i.setValue(tamt010i);
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
	 * Gets the reference for attribute cotrn0ao.
	 * @return the cotrn0ao attribute reference
	 */
	public RangeReference getCotrn0aoReference() {
		return cotrn0ao.getReference();
	}	
				
	/**
	 * Setter for cotrn0ao .
	 */
   	public void setCotrn0ao(RangeReference reference) {
       	cotrn0ao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute trnid01c.
	 * @return the trnid01c attribute reference
	 */
	public ElementaryRangeReference getTrnid01cReference() {
		return trnid01c.getReference();
	}

	/**
	 * Getter for trnid01c attribute.
	 * @return trnid01c attribute
	 */
	public String getTrnid01c() {
		return trnid01c.getValue();
	}

	/**
	 * Setter for trnid01c attribute.
	 * @param trnid01c the new value of trnid01c
	 */
	public void setTrnid01c(String trnid01c) {
		this.trnid01c.setValue(trnid01c);
	}
	/**
	 * Gets the reference for attribute trnid01p.
	 * @return the trnid01p attribute reference
	 */
	public ElementaryRangeReference getTrnid01pReference() {
		return trnid01p.getReference();
	}

	/**
	 * Getter for trnid01p attribute.
	 * @return trnid01p attribute
	 */
	public String getTrnid01p() {
		return trnid01p.getValue();
	}

	/**
	 * Setter for trnid01p attribute.
	 * @param trnid01p the new value of trnid01p
	 */
	public void setTrnid01p(String trnid01p) {
		this.trnid01p.setValue(trnid01p);
	}
	/**
	 * Gets the reference for attribute trnid01h.
	 * @return the trnid01h attribute reference
	 */
	public ElementaryRangeReference getTrnid01hReference() {
		return trnid01h.getReference();
	}

	/**
	 * Getter for trnid01h attribute.
	 * @return trnid01h attribute
	 */
	public String getTrnid01h() {
		return trnid01h.getValue();
	}

	/**
	 * Setter for trnid01h attribute.
	 * @param trnid01h the new value of trnid01h
	 */
	public void setTrnid01h(String trnid01h) {
		this.trnid01h.setValue(trnid01h);
	}
	/**
	 * Gets the reference for attribute trnid01v.
	 * @return the trnid01v attribute reference
	 */
	public ElementaryRangeReference getTrnid01vReference() {
		return trnid01v.getReference();
	}

	/**
	 * Getter for trnid01v attribute.
	 * @return trnid01v attribute
	 */
	public String getTrnid01v() {
		return trnid01v.getValue();
	}

	/**
	 * Setter for trnid01v attribute.
	 * @param trnid01v the new value of trnid01v
	 */
	public void setTrnid01v(String trnid01v) {
		this.trnid01v.setValue(trnid01v);
	}
	/**
	 * Gets the reference for attribute trnid01o.
	 * @return the trnid01o attribute reference
	 */
	public ElementaryRangeReference getTrnid01oReference() {
		return trnid01o.getReference();
	}

	/**
	 * Getter for trnid01o attribute.
	 * @return trnid01o attribute
	 */
	public String getTrnid01o() {
		return trnid01o.getValue();
	}

	/**
	 * Setter for trnid01o attribute.
	 * @param trnid01o the new value of trnid01o
	 */
	public void setTrnid01o(String trnid01o) {
		this.trnid01o.setValue(trnid01o);
	}
	/**
	 * Gets the reference for attribute tdate01c.
	 * @return the tdate01c attribute reference
	 */
	public ElementaryRangeReference getTdate01cReference() {
		return tdate01c.getReference();
	}

	/**
	 * Getter for tdate01c attribute.
	 * @return tdate01c attribute
	 */
	public String getTdate01c() {
		return tdate01c.getValue();
	}

	/**
	 * Setter for tdate01c attribute.
	 * @param tdate01c the new value of tdate01c
	 */
	public void setTdate01c(String tdate01c) {
		this.tdate01c.setValue(tdate01c);
	}
	/**
	 * Gets the reference for attribute tdate01p.
	 * @return the tdate01p attribute reference
	 */
	public ElementaryRangeReference getTdate01pReference() {
		return tdate01p.getReference();
	}

	/**
	 * Getter for tdate01p attribute.
	 * @return tdate01p attribute
	 */
	public String getTdate01p() {
		return tdate01p.getValue();
	}

	/**
	 * Setter for tdate01p attribute.
	 * @param tdate01p the new value of tdate01p
	 */
	public void setTdate01p(String tdate01p) {
		this.tdate01p.setValue(tdate01p);
	}
	/**
	 * Gets the reference for attribute tdate01h.
	 * @return the tdate01h attribute reference
	 */
	public ElementaryRangeReference getTdate01hReference() {
		return tdate01h.getReference();
	}

	/**
	 * Getter for tdate01h attribute.
	 * @return tdate01h attribute
	 */
	public String getTdate01h() {
		return tdate01h.getValue();
	}

	/**
	 * Setter for tdate01h attribute.
	 * @param tdate01h the new value of tdate01h
	 */
	public void setTdate01h(String tdate01h) {
		this.tdate01h.setValue(tdate01h);
	}
	/**
	 * Gets the reference for attribute tdate01v.
	 * @return the tdate01v attribute reference
	 */
	public ElementaryRangeReference getTdate01vReference() {
		return tdate01v.getReference();
	}

	/**
	 * Getter for tdate01v attribute.
	 * @return tdate01v attribute
	 */
	public String getTdate01v() {
		return tdate01v.getValue();
	}

	/**
	 * Setter for tdate01v attribute.
	 * @param tdate01v the new value of tdate01v
	 */
	public void setTdate01v(String tdate01v) {
		this.tdate01v.setValue(tdate01v);
	}
	/**
	 * Gets the reference for attribute tdate01o.
	 * @return the tdate01o attribute reference
	 */
	public ElementaryRangeReference getTdate01oReference() {
		return tdate01o.getReference();
	}

	/**
	 * Getter for tdate01o attribute.
	 * @return tdate01o attribute
	 */
	public String getTdate01o() {
		return tdate01o.getValue();
	}

	/**
	 * Setter for tdate01o attribute.
	 * @param tdate01o the new value of tdate01o
	 */
	public void setTdate01o(String tdate01o) {
		this.tdate01o.setValue(tdate01o);
	}
	/**
	 * Gets the reference for attribute tdesc01c.
	 * @return the tdesc01c attribute reference
	 */
	public ElementaryRangeReference getTdesc01cReference() {
		return tdesc01c.getReference();
	}

	/**
	 * Getter for tdesc01c attribute.
	 * @return tdesc01c attribute
	 */
	public String getTdesc01c() {
		return tdesc01c.getValue();
	}

	/**
	 * Setter for tdesc01c attribute.
	 * @param tdesc01c the new value of tdesc01c
	 */
	public void setTdesc01c(String tdesc01c) {
		this.tdesc01c.setValue(tdesc01c);
	}
	/**
	 * Gets the reference for attribute tdesc01p.
	 * @return the tdesc01p attribute reference
	 */
	public ElementaryRangeReference getTdesc01pReference() {
		return tdesc01p.getReference();
	}

	/**
	 * Getter for tdesc01p attribute.
	 * @return tdesc01p attribute
	 */
	public String getTdesc01p() {
		return tdesc01p.getValue();
	}

	/**
	 * Setter for tdesc01p attribute.
	 * @param tdesc01p the new value of tdesc01p
	 */
	public void setTdesc01p(String tdesc01p) {
		this.tdesc01p.setValue(tdesc01p);
	}
	/**
	 * Gets the reference for attribute tdesc01h.
	 * @return the tdesc01h attribute reference
	 */
	public ElementaryRangeReference getTdesc01hReference() {
		return tdesc01h.getReference();
	}

	/**
	 * Getter for tdesc01h attribute.
	 * @return tdesc01h attribute
	 */
	public String getTdesc01h() {
		return tdesc01h.getValue();
	}

	/**
	 * Setter for tdesc01h attribute.
	 * @param tdesc01h the new value of tdesc01h
	 */
	public void setTdesc01h(String tdesc01h) {
		this.tdesc01h.setValue(tdesc01h);
	}
	/**
	 * Gets the reference for attribute tdesc01v.
	 * @return the tdesc01v attribute reference
	 */
	public ElementaryRangeReference getTdesc01vReference() {
		return tdesc01v.getReference();
	}

	/**
	 * Getter for tdesc01v attribute.
	 * @return tdesc01v attribute
	 */
	public String getTdesc01v() {
		return tdesc01v.getValue();
	}

	/**
	 * Setter for tdesc01v attribute.
	 * @param tdesc01v the new value of tdesc01v
	 */
	public void setTdesc01v(String tdesc01v) {
		this.tdesc01v.setValue(tdesc01v);
	}
	/**
	 * Gets the reference for attribute tdesc01o.
	 * @return the tdesc01o attribute reference
	 */
	public ElementaryRangeReference getTdesc01oReference() {
		return tdesc01o.getReference();
	}

	/**
	 * Getter for tdesc01o attribute.
	 * @return tdesc01o attribute
	 */
	public String getTdesc01o() {
		return tdesc01o.getValue();
	}

	/**
	 * Setter for tdesc01o attribute.
	 * @param tdesc01o the new value of tdesc01o
	 */
	public void setTdesc01o(String tdesc01o) {
		this.tdesc01o.setValue(tdesc01o);
	}
	/**
	 * Gets the reference for attribute tamt001c.
	 * @return the tamt001c attribute reference
	 */
	public ElementaryRangeReference getTamt001cReference() {
		return tamt001c.getReference();
	}

	/**
	 * Getter for tamt001c attribute.
	 * @return tamt001c attribute
	 */
	public String getTamt001c() {
		return tamt001c.getValue();
	}

	/**
	 * Setter for tamt001c attribute.
	 * @param tamt001c the new value of tamt001c
	 */
	public void setTamt001c(String tamt001c) {
		this.tamt001c.setValue(tamt001c);
	}
	/**
	 * Gets the reference for attribute tamt001p.
	 * @return the tamt001p attribute reference
	 */
	public ElementaryRangeReference getTamt001pReference() {
		return tamt001p.getReference();
	}

	/**
	 * Getter for tamt001p attribute.
	 * @return tamt001p attribute
	 */
	public String getTamt001p() {
		return tamt001p.getValue();
	}

	/**
	 * Setter for tamt001p attribute.
	 * @param tamt001p the new value of tamt001p
	 */
	public void setTamt001p(String tamt001p) {
		this.tamt001p.setValue(tamt001p);
	}
	/**
	 * Gets the reference for attribute tamt001h.
	 * @return the tamt001h attribute reference
	 */
	public ElementaryRangeReference getTamt001hReference() {
		return tamt001h.getReference();
	}

	/**
	 * Getter for tamt001h attribute.
	 * @return tamt001h attribute
	 */
	public String getTamt001h() {
		return tamt001h.getValue();
	}

	/**
	 * Setter for tamt001h attribute.
	 * @param tamt001h the new value of tamt001h
	 */
	public void setTamt001h(String tamt001h) {
		this.tamt001h.setValue(tamt001h);
	}
	/**
	 * Gets the reference for attribute tamt001v.
	 * @return the tamt001v attribute reference
	 */
	public ElementaryRangeReference getTamt001vReference() {
		return tamt001v.getReference();
	}

	/**
	 * Getter for tamt001v attribute.
	 * @return tamt001v attribute
	 */
	public String getTamt001v() {
		return tamt001v.getValue();
	}

	/**
	 * Setter for tamt001v attribute.
	 * @param tamt001v the new value of tamt001v
	 */
	public void setTamt001v(String tamt001v) {
		this.tamt001v.setValue(tamt001v);
	}
	/**
	 * Gets the reference for attribute tamt001o.
	 * @return the tamt001o attribute reference
	 */
	public ElementaryRangeReference getTamt001oReference() {
		return tamt001o.getReference();
	}

	/**
	 * Getter for tamt001o attribute.
	 * @return tamt001o attribute
	 */
	public String getTamt001o() {
		return tamt001o.getValue();
	}

	/**
	 * Setter for tamt001o attribute.
	 * @param tamt001o the new value of tamt001o
	 */
	public void setTamt001o(String tamt001o) {
		this.tamt001o.setValue(tamt001o);
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
	 * Gets the reference for attribute trnid02c.
	 * @return the trnid02c attribute reference
	 */
	public ElementaryRangeReference getTrnid02cReference() {
		return trnid02c.getReference();
	}

	/**
	 * Getter for trnid02c attribute.
	 * @return trnid02c attribute
	 */
	public String getTrnid02c() {
		return trnid02c.getValue();
	}

	/**
	 * Setter for trnid02c attribute.
	 * @param trnid02c the new value of trnid02c
	 */
	public void setTrnid02c(String trnid02c) {
		this.trnid02c.setValue(trnid02c);
	}
	/**
	 * Gets the reference for attribute trnid02p.
	 * @return the trnid02p attribute reference
	 */
	public ElementaryRangeReference getTrnid02pReference() {
		return trnid02p.getReference();
	}

	/**
	 * Getter for trnid02p attribute.
	 * @return trnid02p attribute
	 */
	public String getTrnid02p() {
		return trnid02p.getValue();
	}

	/**
	 * Setter for trnid02p attribute.
	 * @param trnid02p the new value of trnid02p
	 */
	public void setTrnid02p(String trnid02p) {
		this.trnid02p.setValue(trnid02p);
	}
	/**
	 * Gets the reference for attribute trnid02h.
	 * @return the trnid02h attribute reference
	 */
	public ElementaryRangeReference getTrnid02hReference() {
		return trnid02h.getReference();
	}

	/**
	 * Getter for trnid02h attribute.
	 * @return trnid02h attribute
	 */
	public String getTrnid02h() {
		return trnid02h.getValue();
	}

	/**
	 * Setter for trnid02h attribute.
	 * @param trnid02h the new value of trnid02h
	 */
	public void setTrnid02h(String trnid02h) {
		this.trnid02h.setValue(trnid02h);
	}
	/**
	 * Gets the reference for attribute trnid02v.
	 * @return the trnid02v attribute reference
	 */
	public ElementaryRangeReference getTrnid02vReference() {
		return trnid02v.getReference();
	}

	/**
	 * Getter for trnid02v attribute.
	 * @return trnid02v attribute
	 */
	public String getTrnid02v() {
		return trnid02v.getValue();
	}

	/**
	 * Setter for trnid02v attribute.
	 * @param trnid02v the new value of trnid02v
	 */
	public void setTrnid02v(String trnid02v) {
		this.trnid02v.setValue(trnid02v);
	}
	/**
	 * Gets the reference for attribute trnid02o.
	 * @return the trnid02o attribute reference
	 */
	public ElementaryRangeReference getTrnid02oReference() {
		return trnid02o.getReference();
	}

	/**
	 * Getter for trnid02o attribute.
	 * @return trnid02o attribute
	 */
	public String getTrnid02o() {
		return trnid02o.getValue();
	}

	/**
	 * Setter for trnid02o attribute.
	 * @param trnid02o the new value of trnid02o
	 */
	public void setTrnid02o(String trnid02o) {
		this.trnid02o.setValue(trnid02o);
	}
	/**
	 * Gets the reference for attribute tdate02c.
	 * @return the tdate02c attribute reference
	 */
	public ElementaryRangeReference getTdate02cReference() {
		return tdate02c.getReference();
	}

	/**
	 * Getter for tdate02c attribute.
	 * @return tdate02c attribute
	 */
	public String getTdate02c() {
		return tdate02c.getValue();
	}

	/**
	 * Setter for tdate02c attribute.
	 * @param tdate02c the new value of tdate02c
	 */
	public void setTdate02c(String tdate02c) {
		this.tdate02c.setValue(tdate02c);
	}
	/**
	 * Gets the reference for attribute tdate02p.
	 * @return the tdate02p attribute reference
	 */
	public ElementaryRangeReference getTdate02pReference() {
		return tdate02p.getReference();
	}

	/**
	 * Getter for tdate02p attribute.
	 * @return tdate02p attribute
	 */
	public String getTdate02p() {
		return tdate02p.getValue();
	}

	/**
	 * Setter for tdate02p attribute.
	 * @param tdate02p the new value of tdate02p
	 */
	public void setTdate02p(String tdate02p) {
		this.tdate02p.setValue(tdate02p);
	}
	/**
	 * Gets the reference for attribute tdate02h.
	 * @return the tdate02h attribute reference
	 */
	public ElementaryRangeReference getTdate02hReference() {
		return tdate02h.getReference();
	}

	/**
	 * Getter for tdate02h attribute.
	 * @return tdate02h attribute
	 */
	public String getTdate02h() {
		return tdate02h.getValue();
	}

	/**
	 * Setter for tdate02h attribute.
	 * @param tdate02h the new value of tdate02h
	 */
	public void setTdate02h(String tdate02h) {
		this.tdate02h.setValue(tdate02h);
	}
	/**
	 * Gets the reference for attribute tdate02v.
	 * @return the tdate02v attribute reference
	 */
	public ElementaryRangeReference getTdate02vReference() {
		return tdate02v.getReference();
	}

	/**
	 * Getter for tdate02v attribute.
	 * @return tdate02v attribute
	 */
	public String getTdate02v() {
		return tdate02v.getValue();
	}

	/**
	 * Setter for tdate02v attribute.
	 * @param tdate02v the new value of tdate02v
	 */
	public void setTdate02v(String tdate02v) {
		this.tdate02v.setValue(tdate02v);
	}
	/**
	 * Gets the reference for attribute tdate02o.
	 * @return the tdate02o attribute reference
	 */
	public ElementaryRangeReference getTdate02oReference() {
		return tdate02o.getReference();
	}

	/**
	 * Getter for tdate02o attribute.
	 * @return tdate02o attribute
	 */
	public String getTdate02o() {
		return tdate02o.getValue();
	}

	/**
	 * Setter for tdate02o attribute.
	 * @param tdate02o the new value of tdate02o
	 */
	public void setTdate02o(String tdate02o) {
		this.tdate02o.setValue(tdate02o);
	}
	/**
	 * Gets the reference for attribute tdesc02c.
	 * @return the tdesc02c attribute reference
	 */
	public ElementaryRangeReference getTdesc02cReference() {
		return tdesc02c.getReference();
	}

	/**
	 * Getter for tdesc02c attribute.
	 * @return tdesc02c attribute
	 */
	public String getTdesc02c() {
		return tdesc02c.getValue();
	}

	/**
	 * Setter for tdesc02c attribute.
	 * @param tdesc02c the new value of tdesc02c
	 */
	public void setTdesc02c(String tdesc02c) {
		this.tdesc02c.setValue(tdesc02c);
	}
	/**
	 * Gets the reference for attribute tdesc02p.
	 * @return the tdesc02p attribute reference
	 */
	public ElementaryRangeReference getTdesc02pReference() {
		return tdesc02p.getReference();
	}

	/**
	 * Getter for tdesc02p attribute.
	 * @return tdesc02p attribute
	 */
	public String getTdesc02p() {
		return tdesc02p.getValue();
	}

	/**
	 * Setter for tdesc02p attribute.
	 * @param tdesc02p the new value of tdesc02p
	 */
	public void setTdesc02p(String tdesc02p) {
		this.tdesc02p.setValue(tdesc02p);
	}
	/**
	 * Gets the reference for attribute tdesc02h.
	 * @return the tdesc02h attribute reference
	 */
	public ElementaryRangeReference getTdesc02hReference() {
		return tdesc02h.getReference();
	}

	/**
	 * Getter for tdesc02h attribute.
	 * @return tdesc02h attribute
	 */
	public String getTdesc02h() {
		return tdesc02h.getValue();
	}

	/**
	 * Setter for tdesc02h attribute.
	 * @param tdesc02h the new value of tdesc02h
	 */
	public void setTdesc02h(String tdesc02h) {
		this.tdesc02h.setValue(tdesc02h);
	}
	/**
	 * Gets the reference for attribute tdesc02v.
	 * @return the tdesc02v attribute reference
	 */
	public ElementaryRangeReference getTdesc02vReference() {
		return tdesc02v.getReference();
	}

	/**
	 * Getter for tdesc02v attribute.
	 * @return tdesc02v attribute
	 */
	public String getTdesc02v() {
		return tdesc02v.getValue();
	}

	/**
	 * Setter for tdesc02v attribute.
	 * @param tdesc02v the new value of tdesc02v
	 */
	public void setTdesc02v(String tdesc02v) {
		this.tdesc02v.setValue(tdesc02v);
	}
	/**
	 * Gets the reference for attribute tdesc02o.
	 * @return the tdesc02o attribute reference
	 */
	public ElementaryRangeReference getTdesc02oReference() {
		return tdesc02o.getReference();
	}

	/**
	 * Getter for tdesc02o attribute.
	 * @return tdesc02o attribute
	 */
	public String getTdesc02o() {
		return tdesc02o.getValue();
	}

	/**
	 * Setter for tdesc02o attribute.
	 * @param tdesc02o the new value of tdesc02o
	 */
	public void setTdesc02o(String tdesc02o) {
		this.tdesc02o.setValue(tdesc02o);
	}
	/**
	 * Gets the reference for attribute tamt002c.
	 * @return the tamt002c attribute reference
	 */
	public ElementaryRangeReference getTamt002cReference() {
		return tamt002c.getReference();
	}

	/**
	 * Getter for tamt002c attribute.
	 * @return tamt002c attribute
	 */
	public String getTamt002c() {
		return tamt002c.getValue();
	}

	/**
	 * Setter for tamt002c attribute.
	 * @param tamt002c the new value of tamt002c
	 */
	public void setTamt002c(String tamt002c) {
		this.tamt002c.setValue(tamt002c);
	}
	/**
	 * Gets the reference for attribute tamt002p.
	 * @return the tamt002p attribute reference
	 */
	public ElementaryRangeReference getTamt002pReference() {
		return tamt002p.getReference();
	}

	/**
	 * Getter for tamt002p attribute.
	 * @return tamt002p attribute
	 */
	public String getTamt002p() {
		return tamt002p.getValue();
	}

	/**
	 * Setter for tamt002p attribute.
	 * @param tamt002p the new value of tamt002p
	 */
	public void setTamt002p(String tamt002p) {
		this.tamt002p.setValue(tamt002p);
	}
	/**
	 * Gets the reference for attribute tamt002h.
	 * @return the tamt002h attribute reference
	 */
	public ElementaryRangeReference getTamt002hReference() {
		return tamt002h.getReference();
	}

	/**
	 * Getter for tamt002h attribute.
	 * @return tamt002h attribute
	 */
	public String getTamt002h() {
		return tamt002h.getValue();
	}

	/**
	 * Setter for tamt002h attribute.
	 * @param tamt002h the new value of tamt002h
	 */
	public void setTamt002h(String tamt002h) {
		this.tamt002h.setValue(tamt002h);
	}
	/**
	 * Gets the reference for attribute tamt002v.
	 * @return the tamt002v attribute reference
	 */
	public ElementaryRangeReference getTamt002vReference() {
		return tamt002v.getReference();
	}

	/**
	 * Getter for tamt002v attribute.
	 * @return tamt002v attribute
	 */
	public String getTamt002v() {
		return tamt002v.getValue();
	}

	/**
	 * Setter for tamt002v attribute.
	 * @param tamt002v the new value of tamt002v
	 */
	public void setTamt002v(String tamt002v) {
		this.tamt002v.setValue(tamt002v);
	}
	/**
	 * Gets the reference for attribute tamt002o.
	 * @return the tamt002o attribute reference
	 */
	public ElementaryRangeReference getTamt002oReference() {
		return tamt002o.getReference();
	}

	/**
	 * Getter for tamt002o attribute.
	 * @return tamt002o attribute
	 */
	public String getTamt002o() {
		return tamt002o.getValue();
	}

	/**
	 * Setter for tamt002o attribute.
	 * @param tamt002o the new value of tamt002o
	 */
	public void setTamt002o(String tamt002o) {
		this.tamt002o.setValue(tamt002o);
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
	 * Gets the reference for attribute trnid03c.
	 * @return the trnid03c attribute reference
	 */
	public ElementaryRangeReference getTrnid03cReference() {
		return trnid03c.getReference();
	}

	/**
	 * Getter for trnid03c attribute.
	 * @return trnid03c attribute
	 */
	public String getTrnid03c() {
		return trnid03c.getValue();
	}

	/**
	 * Setter for trnid03c attribute.
	 * @param trnid03c the new value of trnid03c
	 */
	public void setTrnid03c(String trnid03c) {
		this.trnid03c.setValue(trnid03c);
	}
	/**
	 * Gets the reference for attribute trnid03p.
	 * @return the trnid03p attribute reference
	 */
	public ElementaryRangeReference getTrnid03pReference() {
		return trnid03p.getReference();
	}

	/**
	 * Getter for trnid03p attribute.
	 * @return trnid03p attribute
	 */
	public String getTrnid03p() {
		return trnid03p.getValue();
	}

	/**
	 * Setter for trnid03p attribute.
	 * @param trnid03p the new value of trnid03p
	 */
	public void setTrnid03p(String trnid03p) {
		this.trnid03p.setValue(trnid03p);
	}
	/**
	 * Gets the reference for attribute trnid03h.
	 * @return the trnid03h attribute reference
	 */
	public ElementaryRangeReference getTrnid03hReference() {
		return trnid03h.getReference();
	}

	/**
	 * Getter for trnid03h attribute.
	 * @return trnid03h attribute
	 */
	public String getTrnid03h() {
		return trnid03h.getValue();
	}

	/**
	 * Setter for trnid03h attribute.
	 * @param trnid03h the new value of trnid03h
	 */
	public void setTrnid03h(String trnid03h) {
		this.trnid03h.setValue(trnid03h);
	}
	/**
	 * Gets the reference for attribute trnid03v.
	 * @return the trnid03v attribute reference
	 */
	public ElementaryRangeReference getTrnid03vReference() {
		return trnid03v.getReference();
	}

	/**
	 * Getter for trnid03v attribute.
	 * @return trnid03v attribute
	 */
	public String getTrnid03v() {
		return trnid03v.getValue();
	}

	/**
	 * Setter for trnid03v attribute.
	 * @param trnid03v the new value of trnid03v
	 */
	public void setTrnid03v(String trnid03v) {
		this.trnid03v.setValue(trnid03v);
	}
	/**
	 * Gets the reference for attribute trnid03o.
	 * @return the trnid03o attribute reference
	 */
	public ElementaryRangeReference getTrnid03oReference() {
		return trnid03o.getReference();
	}

	/**
	 * Getter for trnid03o attribute.
	 * @return trnid03o attribute
	 */
	public String getTrnid03o() {
		return trnid03o.getValue();
	}

	/**
	 * Setter for trnid03o attribute.
	 * @param trnid03o the new value of trnid03o
	 */
	public void setTrnid03o(String trnid03o) {
		this.trnid03o.setValue(trnid03o);
	}
	/**
	 * Gets the reference for attribute tdate03c.
	 * @return the tdate03c attribute reference
	 */
	public ElementaryRangeReference getTdate03cReference() {
		return tdate03c.getReference();
	}

	/**
	 * Getter for tdate03c attribute.
	 * @return tdate03c attribute
	 */
	public String getTdate03c() {
		return tdate03c.getValue();
	}

	/**
	 * Setter for tdate03c attribute.
	 * @param tdate03c the new value of tdate03c
	 */
	public void setTdate03c(String tdate03c) {
		this.tdate03c.setValue(tdate03c);
	}
	/**
	 * Gets the reference for attribute tdate03p.
	 * @return the tdate03p attribute reference
	 */
	public ElementaryRangeReference getTdate03pReference() {
		return tdate03p.getReference();
	}

	/**
	 * Getter for tdate03p attribute.
	 * @return tdate03p attribute
	 */
	public String getTdate03p() {
		return tdate03p.getValue();
	}

	/**
	 * Setter for tdate03p attribute.
	 * @param tdate03p the new value of tdate03p
	 */
	public void setTdate03p(String tdate03p) {
		this.tdate03p.setValue(tdate03p);
	}
	/**
	 * Gets the reference for attribute tdate03h.
	 * @return the tdate03h attribute reference
	 */
	public ElementaryRangeReference getTdate03hReference() {
		return tdate03h.getReference();
	}

	/**
	 * Getter for tdate03h attribute.
	 * @return tdate03h attribute
	 */
	public String getTdate03h() {
		return tdate03h.getValue();
	}

	/**
	 * Setter for tdate03h attribute.
	 * @param tdate03h the new value of tdate03h
	 */
	public void setTdate03h(String tdate03h) {
		this.tdate03h.setValue(tdate03h);
	}
	/**
	 * Gets the reference for attribute tdate03v.
	 * @return the tdate03v attribute reference
	 */
	public ElementaryRangeReference getTdate03vReference() {
		return tdate03v.getReference();
	}

	/**
	 * Getter for tdate03v attribute.
	 * @return tdate03v attribute
	 */
	public String getTdate03v() {
		return tdate03v.getValue();
	}

	/**
	 * Setter for tdate03v attribute.
	 * @param tdate03v the new value of tdate03v
	 */
	public void setTdate03v(String tdate03v) {
		this.tdate03v.setValue(tdate03v);
	}
	/**
	 * Gets the reference for attribute tdate03o.
	 * @return the tdate03o attribute reference
	 */
	public ElementaryRangeReference getTdate03oReference() {
		return tdate03o.getReference();
	}

	/**
	 * Getter for tdate03o attribute.
	 * @return tdate03o attribute
	 */
	public String getTdate03o() {
		return tdate03o.getValue();
	}

	/**
	 * Setter for tdate03o attribute.
	 * @param tdate03o the new value of tdate03o
	 */
	public void setTdate03o(String tdate03o) {
		this.tdate03o.setValue(tdate03o);
	}
	/**
	 * Gets the reference for attribute tdesc03c.
	 * @return the tdesc03c attribute reference
	 */
	public ElementaryRangeReference getTdesc03cReference() {
		return tdesc03c.getReference();
	}

	/**
	 * Getter for tdesc03c attribute.
	 * @return tdesc03c attribute
	 */
	public String getTdesc03c() {
		return tdesc03c.getValue();
	}

	/**
	 * Setter for tdesc03c attribute.
	 * @param tdesc03c the new value of tdesc03c
	 */
	public void setTdesc03c(String tdesc03c) {
		this.tdesc03c.setValue(tdesc03c);
	}
	/**
	 * Gets the reference for attribute tdesc03p.
	 * @return the tdesc03p attribute reference
	 */
	public ElementaryRangeReference getTdesc03pReference() {
		return tdesc03p.getReference();
	}

	/**
	 * Getter for tdesc03p attribute.
	 * @return tdesc03p attribute
	 */
	public String getTdesc03p() {
		return tdesc03p.getValue();
	}

	/**
	 * Setter for tdesc03p attribute.
	 * @param tdesc03p the new value of tdesc03p
	 */
	public void setTdesc03p(String tdesc03p) {
		this.tdesc03p.setValue(tdesc03p);
	}
	/**
	 * Gets the reference for attribute tdesc03h.
	 * @return the tdesc03h attribute reference
	 */
	public ElementaryRangeReference getTdesc03hReference() {
		return tdesc03h.getReference();
	}

	/**
	 * Getter for tdesc03h attribute.
	 * @return tdesc03h attribute
	 */
	public String getTdesc03h() {
		return tdesc03h.getValue();
	}

	/**
	 * Setter for tdesc03h attribute.
	 * @param tdesc03h the new value of tdesc03h
	 */
	public void setTdesc03h(String tdesc03h) {
		this.tdesc03h.setValue(tdesc03h);
	}
	/**
	 * Gets the reference for attribute tdesc03v.
	 * @return the tdesc03v attribute reference
	 */
	public ElementaryRangeReference getTdesc03vReference() {
		return tdesc03v.getReference();
	}

	/**
	 * Getter for tdesc03v attribute.
	 * @return tdesc03v attribute
	 */
	public String getTdesc03v() {
		return tdesc03v.getValue();
	}

	/**
	 * Setter for tdesc03v attribute.
	 * @param tdesc03v the new value of tdesc03v
	 */
	public void setTdesc03v(String tdesc03v) {
		this.tdesc03v.setValue(tdesc03v);
	}
	/**
	 * Gets the reference for attribute tdesc03o.
	 * @return the tdesc03o attribute reference
	 */
	public ElementaryRangeReference getTdesc03oReference() {
		return tdesc03o.getReference();
	}

	/**
	 * Getter for tdesc03o attribute.
	 * @return tdesc03o attribute
	 */
	public String getTdesc03o() {
		return tdesc03o.getValue();
	}

	/**
	 * Setter for tdesc03o attribute.
	 * @param tdesc03o the new value of tdesc03o
	 */
	public void setTdesc03o(String tdesc03o) {
		this.tdesc03o.setValue(tdesc03o);
	}
	/**
	 * Gets the reference for attribute tamt003c.
	 * @return the tamt003c attribute reference
	 */
	public ElementaryRangeReference getTamt003cReference() {
		return tamt003c.getReference();
	}

	/**
	 * Getter for tamt003c attribute.
	 * @return tamt003c attribute
	 */
	public String getTamt003c() {
		return tamt003c.getValue();
	}

	/**
	 * Setter for tamt003c attribute.
	 * @param tamt003c the new value of tamt003c
	 */
	public void setTamt003c(String tamt003c) {
		this.tamt003c.setValue(tamt003c);
	}
	/**
	 * Gets the reference for attribute tamt003p.
	 * @return the tamt003p attribute reference
	 */
	public ElementaryRangeReference getTamt003pReference() {
		return tamt003p.getReference();
	}

	/**
	 * Getter for tamt003p attribute.
	 * @return tamt003p attribute
	 */
	public String getTamt003p() {
		return tamt003p.getValue();
	}

	/**
	 * Setter for tamt003p attribute.
	 * @param tamt003p the new value of tamt003p
	 */
	public void setTamt003p(String tamt003p) {
		this.tamt003p.setValue(tamt003p);
	}
	/**
	 * Gets the reference for attribute tamt003h.
	 * @return the tamt003h attribute reference
	 */
	public ElementaryRangeReference getTamt003hReference() {
		return tamt003h.getReference();
	}

	/**
	 * Getter for tamt003h attribute.
	 * @return tamt003h attribute
	 */
	public String getTamt003h() {
		return tamt003h.getValue();
	}

	/**
	 * Setter for tamt003h attribute.
	 * @param tamt003h the new value of tamt003h
	 */
	public void setTamt003h(String tamt003h) {
		this.tamt003h.setValue(tamt003h);
	}
	/**
	 * Gets the reference for attribute tamt003v.
	 * @return the tamt003v attribute reference
	 */
	public ElementaryRangeReference getTamt003vReference() {
		return tamt003v.getReference();
	}

	/**
	 * Getter for tamt003v attribute.
	 * @return tamt003v attribute
	 */
	public String getTamt003v() {
		return tamt003v.getValue();
	}

	/**
	 * Setter for tamt003v attribute.
	 * @param tamt003v the new value of tamt003v
	 */
	public void setTamt003v(String tamt003v) {
		this.tamt003v.setValue(tamt003v);
	}
	/**
	 * Gets the reference for attribute tamt003o.
	 * @return the tamt003o attribute reference
	 */
	public ElementaryRangeReference getTamt003oReference() {
		return tamt003o.getReference();
	}

	/**
	 * Getter for tamt003o attribute.
	 * @return tamt003o attribute
	 */
	public String getTamt003o() {
		return tamt003o.getValue();
	}

	/**
	 * Setter for tamt003o attribute.
	 * @param tamt003o the new value of tamt003o
	 */
	public void setTamt003o(String tamt003o) {
		this.tamt003o.setValue(tamt003o);
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
	 * Gets the reference for attribute trnid04c.
	 * @return the trnid04c attribute reference
	 */
	public ElementaryRangeReference getTrnid04cReference() {
		return trnid04c.getReference();
	}

	/**
	 * Getter for trnid04c attribute.
	 * @return trnid04c attribute
	 */
	public String getTrnid04c() {
		return trnid04c.getValue();
	}

	/**
	 * Setter for trnid04c attribute.
	 * @param trnid04c the new value of trnid04c
	 */
	public void setTrnid04c(String trnid04c) {
		this.trnid04c.setValue(trnid04c);
	}
	/**
	 * Gets the reference for attribute trnid04p.
	 * @return the trnid04p attribute reference
	 */
	public ElementaryRangeReference getTrnid04pReference() {
		return trnid04p.getReference();
	}

	/**
	 * Getter for trnid04p attribute.
	 * @return trnid04p attribute
	 */
	public String getTrnid04p() {
		return trnid04p.getValue();
	}

	/**
	 * Setter for trnid04p attribute.
	 * @param trnid04p the new value of trnid04p
	 */
	public void setTrnid04p(String trnid04p) {
		this.trnid04p.setValue(trnid04p);
	}
	/**
	 * Gets the reference for attribute trnid04h.
	 * @return the trnid04h attribute reference
	 */
	public ElementaryRangeReference getTrnid04hReference() {
		return trnid04h.getReference();
	}

	/**
	 * Getter for trnid04h attribute.
	 * @return trnid04h attribute
	 */
	public String getTrnid04h() {
		return trnid04h.getValue();
	}

	/**
	 * Setter for trnid04h attribute.
	 * @param trnid04h the new value of trnid04h
	 */
	public void setTrnid04h(String trnid04h) {
		this.trnid04h.setValue(trnid04h);
	}
	/**
	 * Gets the reference for attribute trnid04v.
	 * @return the trnid04v attribute reference
	 */
	public ElementaryRangeReference getTrnid04vReference() {
		return trnid04v.getReference();
	}

	/**
	 * Getter for trnid04v attribute.
	 * @return trnid04v attribute
	 */
	public String getTrnid04v() {
		return trnid04v.getValue();
	}

	/**
	 * Setter for trnid04v attribute.
	 * @param trnid04v the new value of trnid04v
	 */
	public void setTrnid04v(String trnid04v) {
		this.trnid04v.setValue(trnid04v);
	}
	/**
	 * Gets the reference for attribute trnid04o.
	 * @return the trnid04o attribute reference
	 */
	public ElementaryRangeReference getTrnid04oReference() {
		return trnid04o.getReference();
	}

	/**
	 * Getter for trnid04o attribute.
	 * @return trnid04o attribute
	 */
	public String getTrnid04o() {
		return trnid04o.getValue();
	}

	/**
	 * Setter for trnid04o attribute.
	 * @param trnid04o the new value of trnid04o
	 */
	public void setTrnid04o(String trnid04o) {
		this.trnid04o.setValue(trnid04o);
	}
	/**
	 * Gets the reference for attribute tdate04c.
	 * @return the tdate04c attribute reference
	 */
	public ElementaryRangeReference getTdate04cReference() {
		return tdate04c.getReference();
	}

	/**
	 * Getter for tdate04c attribute.
	 * @return tdate04c attribute
	 */
	public String getTdate04c() {
		return tdate04c.getValue();
	}

	/**
	 * Setter for tdate04c attribute.
	 * @param tdate04c the new value of tdate04c
	 */
	public void setTdate04c(String tdate04c) {
		this.tdate04c.setValue(tdate04c);
	}
	/**
	 * Gets the reference for attribute tdate04p.
	 * @return the tdate04p attribute reference
	 */
	public ElementaryRangeReference getTdate04pReference() {
		return tdate04p.getReference();
	}

	/**
	 * Getter for tdate04p attribute.
	 * @return tdate04p attribute
	 */
	public String getTdate04p() {
		return tdate04p.getValue();
	}

	/**
	 * Setter for tdate04p attribute.
	 * @param tdate04p the new value of tdate04p
	 */
	public void setTdate04p(String tdate04p) {
		this.tdate04p.setValue(tdate04p);
	}
	/**
	 * Gets the reference for attribute tdate04h.
	 * @return the tdate04h attribute reference
	 */
	public ElementaryRangeReference getTdate04hReference() {
		return tdate04h.getReference();
	}

	/**
	 * Getter for tdate04h attribute.
	 * @return tdate04h attribute
	 */
	public String getTdate04h() {
		return tdate04h.getValue();
	}

	/**
	 * Setter for tdate04h attribute.
	 * @param tdate04h the new value of tdate04h
	 */
	public void setTdate04h(String tdate04h) {
		this.tdate04h.setValue(tdate04h);
	}
	/**
	 * Gets the reference for attribute tdate04v.
	 * @return the tdate04v attribute reference
	 */
	public ElementaryRangeReference getTdate04vReference() {
		return tdate04v.getReference();
	}

	/**
	 * Getter for tdate04v attribute.
	 * @return tdate04v attribute
	 */
	public String getTdate04v() {
		return tdate04v.getValue();
	}

	/**
	 * Setter for tdate04v attribute.
	 * @param tdate04v the new value of tdate04v
	 */
	public void setTdate04v(String tdate04v) {
		this.tdate04v.setValue(tdate04v);
	}
	/**
	 * Gets the reference for attribute tdate04o.
	 * @return the tdate04o attribute reference
	 */
	public ElementaryRangeReference getTdate04oReference() {
		return tdate04o.getReference();
	}

	/**
	 * Getter for tdate04o attribute.
	 * @return tdate04o attribute
	 */
	public String getTdate04o() {
		return tdate04o.getValue();
	}

	/**
	 * Setter for tdate04o attribute.
	 * @param tdate04o the new value of tdate04o
	 */
	public void setTdate04o(String tdate04o) {
		this.tdate04o.setValue(tdate04o);
	}
	/**
	 * Gets the reference for attribute tdesc04c.
	 * @return the tdesc04c attribute reference
	 */
	public ElementaryRangeReference getTdesc04cReference() {
		return tdesc04c.getReference();
	}

	/**
	 * Getter for tdesc04c attribute.
	 * @return tdesc04c attribute
	 */
	public String getTdesc04c() {
		return tdesc04c.getValue();
	}

	/**
	 * Setter for tdesc04c attribute.
	 * @param tdesc04c the new value of tdesc04c
	 */
	public void setTdesc04c(String tdesc04c) {
		this.tdesc04c.setValue(tdesc04c);
	}
	/**
	 * Gets the reference for attribute tdesc04p.
	 * @return the tdesc04p attribute reference
	 */
	public ElementaryRangeReference getTdesc04pReference() {
		return tdesc04p.getReference();
	}

	/**
	 * Getter for tdesc04p attribute.
	 * @return tdesc04p attribute
	 */
	public String getTdesc04p() {
		return tdesc04p.getValue();
	}

	/**
	 * Setter for tdesc04p attribute.
	 * @param tdesc04p the new value of tdesc04p
	 */
	public void setTdesc04p(String tdesc04p) {
		this.tdesc04p.setValue(tdesc04p);
	}
	/**
	 * Gets the reference for attribute tdesc04h.
	 * @return the tdesc04h attribute reference
	 */
	public ElementaryRangeReference getTdesc04hReference() {
		return tdesc04h.getReference();
	}

	/**
	 * Getter for tdesc04h attribute.
	 * @return tdesc04h attribute
	 */
	public String getTdesc04h() {
		return tdesc04h.getValue();
	}

	/**
	 * Setter for tdesc04h attribute.
	 * @param tdesc04h the new value of tdesc04h
	 */
	public void setTdesc04h(String tdesc04h) {
		this.tdesc04h.setValue(tdesc04h);
	}
	/**
	 * Gets the reference for attribute tdesc04v.
	 * @return the tdesc04v attribute reference
	 */
	public ElementaryRangeReference getTdesc04vReference() {
		return tdesc04v.getReference();
	}

	/**
	 * Getter for tdesc04v attribute.
	 * @return tdesc04v attribute
	 */
	public String getTdesc04v() {
		return tdesc04v.getValue();
	}

	/**
	 * Setter for tdesc04v attribute.
	 * @param tdesc04v the new value of tdesc04v
	 */
	public void setTdesc04v(String tdesc04v) {
		this.tdesc04v.setValue(tdesc04v);
	}
	/**
	 * Gets the reference for attribute tdesc04o.
	 * @return the tdesc04o attribute reference
	 */
	public ElementaryRangeReference getTdesc04oReference() {
		return tdesc04o.getReference();
	}

	/**
	 * Getter for tdesc04o attribute.
	 * @return tdesc04o attribute
	 */
	public String getTdesc04o() {
		return tdesc04o.getValue();
	}

	/**
	 * Setter for tdesc04o attribute.
	 * @param tdesc04o the new value of tdesc04o
	 */
	public void setTdesc04o(String tdesc04o) {
		this.tdesc04o.setValue(tdesc04o);
	}
	/**
	 * Gets the reference for attribute tamt004c.
	 * @return the tamt004c attribute reference
	 */
	public ElementaryRangeReference getTamt004cReference() {
		return tamt004c.getReference();
	}

	/**
	 * Getter for tamt004c attribute.
	 * @return tamt004c attribute
	 */
	public String getTamt004c() {
		return tamt004c.getValue();
	}

	/**
	 * Setter for tamt004c attribute.
	 * @param tamt004c the new value of tamt004c
	 */
	public void setTamt004c(String tamt004c) {
		this.tamt004c.setValue(tamt004c);
	}
	/**
	 * Gets the reference for attribute tamt004p.
	 * @return the tamt004p attribute reference
	 */
	public ElementaryRangeReference getTamt004pReference() {
		return tamt004p.getReference();
	}

	/**
	 * Getter for tamt004p attribute.
	 * @return tamt004p attribute
	 */
	public String getTamt004p() {
		return tamt004p.getValue();
	}

	/**
	 * Setter for tamt004p attribute.
	 * @param tamt004p the new value of tamt004p
	 */
	public void setTamt004p(String tamt004p) {
		this.tamt004p.setValue(tamt004p);
	}
	/**
	 * Gets the reference for attribute tamt004h.
	 * @return the tamt004h attribute reference
	 */
	public ElementaryRangeReference getTamt004hReference() {
		return tamt004h.getReference();
	}

	/**
	 * Getter for tamt004h attribute.
	 * @return tamt004h attribute
	 */
	public String getTamt004h() {
		return tamt004h.getValue();
	}

	/**
	 * Setter for tamt004h attribute.
	 * @param tamt004h the new value of tamt004h
	 */
	public void setTamt004h(String tamt004h) {
		this.tamt004h.setValue(tamt004h);
	}
	/**
	 * Gets the reference for attribute tamt004v.
	 * @return the tamt004v attribute reference
	 */
	public ElementaryRangeReference getTamt004vReference() {
		return tamt004v.getReference();
	}

	/**
	 * Getter for tamt004v attribute.
	 * @return tamt004v attribute
	 */
	public String getTamt004v() {
		return tamt004v.getValue();
	}

	/**
	 * Setter for tamt004v attribute.
	 * @param tamt004v the new value of tamt004v
	 */
	public void setTamt004v(String tamt004v) {
		this.tamt004v.setValue(tamt004v);
	}
	/**
	 * Gets the reference for attribute tamt004o.
	 * @return the tamt004o attribute reference
	 */
	public ElementaryRangeReference getTamt004oReference() {
		return tamt004o.getReference();
	}

	/**
	 * Getter for tamt004o attribute.
	 * @return tamt004o attribute
	 */
	public String getTamt004o() {
		return tamt004o.getValue();
	}

	/**
	 * Setter for tamt004o attribute.
	 * @param tamt004o the new value of tamt004o
	 */
	public void setTamt004o(String tamt004o) {
		this.tamt004o.setValue(tamt004o);
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
	 * Gets the reference for attribute trnid05c.
	 * @return the trnid05c attribute reference
	 */
	public ElementaryRangeReference getTrnid05cReference() {
		return trnid05c.getReference();
	}

	/**
	 * Getter for trnid05c attribute.
	 * @return trnid05c attribute
	 */
	public String getTrnid05c() {
		return trnid05c.getValue();
	}

	/**
	 * Setter for trnid05c attribute.
	 * @param trnid05c the new value of trnid05c
	 */
	public void setTrnid05c(String trnid05c) {
		this.trnid05c.setValue(trnid05c);
	}
	/**
	 * Gets the reference for attribute trnid05p.
	 * @return the trnid05p attribute reference
	 */
	public ElementaryRangeReference getTrnid05pReference() {
		return trnid05p.getReference();
	}

	/**
	 * Getter for trnid05p attribute.
	 * @return trnid05p attribute
	 */
	public String getTrnid05p() {
		return trnid05p.getValue();
	}

	/**
	 * Setter for trnid05p attribute.
	 * @param trnid05p the new value of trnid05p
	 */
	public void setTrnid05p(String trnid05p) {
		this.trnid05p.setValue(trnid05p);
	}
	/**
	 * Gets the reference for attribute trnid05h.
	 * @return the trnid05h attribute reference
	 */
	public ElementaryRangeReference getTrnid05hReference() {
		return trnid05h.getReference();
	}

	/**
	 * Getter for trnid05h attribute.
	 * @return trnid05h attribute
	 */
	public String getTrnid05h() {
		return trnid05h.getValue();
	}

	/**
	 * Setter for trnid05h attribute.
	 * @param trnid05h the new value of trnid05h
	 */
	public void setTrnid05h(String trnid05h) {
		this.trnid05h.setValue(trnid05h);
	}
	/**
	 * Gets the reference for attribute trnid05v.
	 * @return the trnid05v attribute reference
	 */
	public ElementaryRangeReference getTrnid05vReference() {
		return trnid05v.getReference();
	}

	/**
	 * Getter for trnid05v attribute.
	 * @return trnid05v attribute
	 */
	public String getTrnid05v() {
		return trnid05v.getValue();
	}

	/**
	 * Setter for trnid05v attribute.
	 * @param trnid05v the new value of trnid05v
	 */
	public void setTrnid05v(String trnid05v) {
		this.trnid05v.setValue(trnid05v);
	}
	/**
	 * Gets the reference for attribute trnid05o.
	 * @return the trnid05o attribute reference
	 */
	public ElementaryRangeReference getTrnid05oReference() {
		return trnid05o.getReference();
	}

	/**
	 * Getter for trnid05o attribute.
	 * @return trnid05o attribute
	 */
	public String getTrnid05o() {
		return trnid05o.getValue();
	}

	/**
	 * Setter for trnid05o attribute.
	 * @param trnid05o the new value of trnid05o
	 */
	public void setTrnid05o(String trnid05o) {
		this.trnid05o.setValue(trnid05o);
	}
	/**
	 * Gets the reference for attribute tdate05c.
	 * @return the tdate05c attribute reference
	 */
	public ElementaryRangeReference getTdate05cReference() {
		return tdate05c.getReference();
	}

	/**
	 * Getter for tdate05c attribute.
	 * @return tdate05c attribute
	 */
	public String getTdate05c() {
		return tdate05c.getValue();
	}

	/**
	 * Setter for tdate05c attribute.
	 * @param tdate05c the new value of tdate05c
	 */
	public void setTdate05c(String tdate05c) {
		this.tdate05c.setValue(tdate05c);
	}
	/**
	 * Gets the reference for attribute tdate05p.
	 * @return the tdate05p attribute reference
	 */
	public ElementaryRangeReference getTdate05pReference() {
		return tdate05p.getReference();
	}

	/**
	 * Getter for tdate05p attribute.
	 * @return tdate05p attribute
	 */
	public String getTdate05p() {
		return tdate05p.getValue();
	}

	/**
	 * Setter for tdate05p attribute.
	 * @param tdate05p the new value of tdate05p
	 */
	public void setTdate05p(String tdate05p) {
		this.tdate05p.setValue(tdate05p);
	}
	/**
	 * Gets the reference for attribute tdate05h.
	 * @return the tdate05h attribute reference
	 */
	public ElementaryRangeReference getTdate05hReference() {
		return tdate05h.getReference();
	}

	/**
	 * Getter for tdate05h attribute.
	 * @return tdate05h attribute
	 */
	public String getTdate05h() {
		return tdate05h.getValue();
	}

	/**
	 * Setter for tdate05h attribute.
	 * @param tdate05h the new value of tdate05h
	 */
	public void setTdate05h(String tdate05h) {
		this.tdate05h.setValue(tdate05h);
	}
	/**
	 * Gets the reference for attribute tdate05v.
	 * @return the tdate05v attribute reference
	 */
	public ElementaryRangeReference getTdate05vReference() {
		return tdate05v.getReference();
	}

	/**
	 * Getter for tdate05v attribute.
	 * @return tdate05v attribute
	 */
	public String getTdate05v() {
		return tdate05v.getValue();
	}

	/**
	 * Setter for tdate05v attribute.
	 * @param tdate05v the new value of tdate05v
	 */
	public void setTdate05v(String tdate05v) {
		this.tdate05v.setValue(tdate05v);
	}
	/**
	 * Gets the reference for attribute tdate05o.
	 * @return the tdate05o attribute reference
	 */
	public ElementaryRangeReference getTdate05oReference() {
		return tdate05o.getReference();
	}

	/**
	 * Getter for tdate05o attribute.
	 * @return tdate05o attribute
	 */
	public String getTdate05o() {
		return tdate05o.getValue();
	}

	/**
	 * Setter for tdate05o attribute.
	 * @param tdate05o the new value of tdate05o
	 */
	public void setTdate05o(String tdate05o) {
		this.tdate05o.setValue(tdate05o);
	}
	/**
	 * Gets the reference for attribute tdesc05c.
	 * @return the tdesc05c attribute reference
	 */
	public ElementaryRangeReference getTdesc05cReference() {
		return tdesc05c.getReference();
	}

	/**
	 * Getter for tdesc05c attribute.
	 * @return tdesc05c attribute
	 */
	public String getTdesc05c() {
		return tdesc05c.getValue();
	}

	/**
	 * Setter for tdesc05c attribute.
	 * @param tdesc05c the new value of tdesc05c
	 */
	public void setTdesc05c(String tdesc05c) {
		this.tdesc05c.setValue(tdesc05c);
	}
	/**
	 * Gets the reference for attribute tdesc05p.
	 * @return the tdesc05p attribute reference
	 */
	public ElementaryRangeReference getTdesc05pReference() {
		return tdesc05p.getReference();
	}

	/**
	 * Getter for tdesc05p attribute.
	 * @return tdesc05p attribute
	 */
	public String getTdesc05p() {
		return tdesc05p.getValue();
	}

	/**
	 * Setter for tdesc05p attribute.
	 * @param tdesc05p the new value of tdesc05p
	 */
	public void setTdesc05p(String tdesc05p) {
		this.tdesc05p.setValue(tdesc05p);
	}
	/**
	 * Gets the reference for attribute tdesc05h.
	 * @return the tdesc05h attribute reference
	 */
	public ElementaryRangeReference getTdesc05hReference() {
		return tdesc05h.getReference();
	}

	/**
	 * Getter for tdesc05h attribute.
	 * @return tdesc05h attribute
	 */
	public String getTdesc05h() {
		return tdesc05h.getValue();
	}

	/**
	 * Setter for tdesc05h attribute.
	 * @param tdesc05h the new value of tdesc05h
	 */
	public void setTdesc05h(String tdesc05h) {
		this.tdesc05h.setValue(tdesc05h);
	}
	/**
	 * Gets the reference for attribute tdesc05v.
	 * @return the tdesc05v attribute reference
	 */
	public ElementaryRangeReference getTdesc05vReference() {
		return tdesc05v.getReference();
	}

	/**
	 * Getter for tdesc05v attribute.
	 * @return tdesc05v attribute
	 */
	public String getTdesc05v() {
		return tdesc05v.getValue();
	}

	/**
	 * Setter for tdesc05v attribute.
	 * @param tdesc05v the new value of tdesc05v
	 */
	public void setTdesc05v(String tdesc05v) {
		this.tdesc05v.setValue(tdesc05v);
	}
	/**
	 * Gets the reference for attribute tdesc05o.
	 * @return the tdesc05o attribute reference
	 */
	public ElementaryRangeReference getTdesc05oReference() {
		return tdesc05o.getReference();
	}

	/**
	 * Getter for tdesc05o attribute.
	 * @return tdesc05o attribute
	 */
	public String getTdesc05o() {
		return tdesc05o.getValue();
	}

	/**
	 * Setter for tdesc05o attribute.
	 * @param tdesc05o the new value of tdesc05o
	 */
	public void setTdesc05o(String tdesc05o) {
		this.tdesc05o.setValue(tdesc05o);
	}
	/**
	 * Gets the reference for attribute tamt005c.
	 * @return the tamt005c attribute reference
	 */
	public ElementaryRangeReference getTamt005cReference() {
		return tamt005c.getReference();
	}

	/**
	 * Getter for tamt005c attribute.
	 * @return tamt005c attribute
	 */
	public String getTamt005c() {
		return tamt005c.getValue();
	}

	/**
	 * Setter for tamt005c attribute.
	 * @param tamt005c the new value of tamt005c
	 */
	public void setTamt005c(String tamt005c) {
		this.tamt005c.setValue(tamt005c);
	}
	/**
	 * Gets the reference for attribute tamt005p.
	 * @return the tamt005p attribute reference
	 */
	public ElementaryRangeReference getTamt005pReference() {
		return tamt005p.getReference();
	}

	/**
	 * Getter for tamt005p attribute.
	 * @return tamt005p attribute
	 */
	public String getTamt005p() {
		return tamt005p.getValue();
	}

	/**
	 * Setter for tamt005p attribute.
	 * @param tamt005p the new value of tamt005p
	 */
	public void setTamt005p(String tamt005p) {
		this.tamt005p.setValue(tamt005p);
	}
	/**
	 * Gets the reference for attribute tamt005h.
	 * @return the tamt005h attribute reference
	 */
	public ElementaryRangeReference getTamt005hReference() {
		return tamt005h.getReference();
	}

	/**
	 * Getter for tamt005h attribute.
	 * @return tamt005h attribute
	 */
	public String getTamt005h() {
		return tamt005h.getValue();
	}

	/**
	 * Setter for tamt005h attribute.
	 * @param tamt005h the new value of tamt005h
	 */
	public void setTamt005h(String tamt005h) {
		this.tamt005h.setValue(tamt005h);
	}
	/**
	 * Gets the reference for attribute tamt005v.
	 * @return the tamt005v attribute reference
	 */
	public ElementaryRangeReference getTamt005vReference() {
		return tamt005v.getReference();
	}

	/**
	 * Getter for tamt005v attribute.
	 * @return tamt005v attribute
	 */
	public String getTamt005v() {
		return tamt005v.getValue();
	}

	/**
	 * Setter for tamt005v attribute.
	 * @param tamt005v the new value of tamt005v
	 */
	public void setTamt005v(String tamt005v) {
		this.tamt005v.setValue(tamt005v);
	}
	/**
	 * Gets the reference for attribute tamt005o.
	 * @return the tamt005o attribute reference
	 */
	public ElementaryRangeReference getTamt005oReference() {
		return tamt005o.getReference();
	}

	/**
	 * Getter for tamt005o attribute.
	 * @return tamt005o attribute
	 */
	public String getTamt005o() {
		return tamt005o.getValue();
	}

	/**
	 * Setter for tamt005o attribute.
	 * @param tamt005o the new value of tamt005o
	 */
	public void setTamt005o(String tamt005o) {
		this.tamt005o.setValue(tamt005o);
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
	 * Gets the reference for attribute trnid06c.
	 * @return the trnid06c attribute reference
	 */
	public ElementaryRangeReference getTrnid06cReference() {
		return trnid06c.getReference();
	}

	/**
	 * Getter for trnid06c attribute.
	 * @return trnid06c attribute
	 */
	public String getTrnid06c() {
		return trnid06c.getValue();
	}

	/**
	 * Setter for trnid06c attribute.
	 * @param trnid06c the new value of trnid06c
	 */
	public void setTrnid06c(String trnid06c) {
		this.trnid06c.setValue(trnid06c);
	}
	/**
	 * Gets the reference for attribute trnid06p.
	 * @return the trnid06p attribute reference
	 */
	public ElementaryRangeReference getTrnid06pReference() {
		return trnid06p.getReference();
	}

	/**
	 * Getter for trnid06p attribute.
	 * @return trnid06p attribute
	 */
	public String getTrnid06p() {
		return trnid06p.getValue();
	}

	/**
	 * Setter for trnid06p attribute.
	 * @param trnid06p the new value of trnid06p
	 */
	public void setTrnid06p(String trnid06p) {
		this.trnid06p.setValue(trnid06p);
	}
	/**
	 * Gets the reference for attribute trnid06h.
	 * @return the trnid06h attribute reference
	 */
	public ElementaryRangeReference getTrnid06hReference() {
		return trnid06h.getReference();
	}

	/**
	 * Getter for trnid06h attribute.
	 * @return trnid06h attribute
	 */
	public String getTrnid06h() {
		return trnid06h.getValue();
	}

	/**
	 * Setter for trnid06h attribute.
	 * @param trnid06h the new value of trnid06h
	 */
	public void setTrnid06h(String trnid06h) {
		this.trnid06h.setValue(trnid06h);
	}
	/**
	 * Gets the reference for attribute trnid06v.
	 * @return the trnid06v attribute reference
	 */
	public ElementaryRangeReference getTrnid06vReference() {
		return trnid06v.getReference();
	}

	/**
	 * Getter for trnid06v attribute.
	 * @return trnid06v attribute
	 */
	public String getTrnid06v() {
		return trnid06v.getValue();
	}

	/**
	 * Setter for trnid06v attribute.
	 * @param trnid06v the new value of trnid06v
	 */
	public void setTrnid06v(String trnid06v) {
		this.trnid06v.setValue(trnid06v);
	}
	/**
	 * Gets the reference for attribute trnid06o.
	 * @return the trnid06o attribute reference
	 */
	public ElementaryRangeReference getTrnid06oReference() {
		return trnid06o.getReference();
	}

	/**
	 * Getter for trnid06o attribute.
	 * @return trnid06o attribute
	 */
	public String getTrnid06o() {
		return trnid06o.getValue();
	}

	/**
	 * Setter for trnid06o attribute.
	 * @param trnid06o the new value of trnid06o
	 */
	public void setTrnid06o(String trnid06o) {
		this.trnid06o.setValue(trnid06o);
	}
	/**
	 * Gets the reference for attribute tdate06c.
	 * @return the tdate06c attribute reference
	 */
	public ElementaryRangeReference getTdate06cReference() {
		return tdate06c.getReference();
	}

	/**
	 * Getter for tdate06c attribute.
	 * @return tdate06c attribute
	 */
	public String getTdate06c() {
		return tdate06c.getValue();
	}

	/**
	 * Setter for tdate06c attribute.
	 * @param tdate06c the new value of tdate06c
	 */
	public void setTdate06c(String tdate06c) {
		this.tdate06c.setValue(tdate06c);
	}
	/**
	 * Gets the reference for attribute tdate06p.
	 * @return the tdate06p attribute reference
	 */
	public ElementaryRangeReference getTdate06pReference() {
		return tdate06p.getReference();
	}

	/**
	 * Getter for tdate06p attribute.
	 * @return tdate06p attribute
	 */
	public String getTdate06p() {
		return tdate06p.getValue();
	}

	/**
	 * Setter for tdate06p attribute.
	 * @param tdate06p the new value of tdate06p
	 */
	public void setTdate06p(String tdate06p) {
		this.tdate06p.setValue(tdate06p);
	}
	/**
	 * Gets the reference for attribute tdate06h.
	 * @return the tdate06h attribute reference
	 */
	public ElementaryRangeReference getTdate06hReference() {
		return tdate06h.getReference();
	}

	/**
	 * Getter for tdate06h attribute.
	 * @return tdate06h attribute
	 */
	public String getTdate06h() {
		return tdate06h.getValue();
	}

	/**
	 * Setter for tdate06h attribute.
	 * @param tdate06h the new value of tdate06h
	 */
	public void setTdate06h(String tdate06h) {
		this.tdate06h.setValue(tdate06h);
	}
	/**
	 * Gets the reference for attribute tdate06v.
	 * @return the tdate06v attribute reference
	 */
	public ElementaryRangeReference getTdate06vReference() {
		return tdate06v.getReference();
	}

	/**
	 * Getter for tdate06v attribute.
	 * @return tdate06v attribute
	 */
	public String getTdate06v() {
		return tdate06v.getValue();
	}

	/**
	 * Setter for tdate06v attribute.
	 * @param tdate06v the new value of tdate06v
	 */
	public void setTdate06v(String tdate06v) {
		this.tdate06v.setValue(tdate06v);
	}
	/**
	 * Gets the reference for attribute tdate06o.
	 * @return the tdate06o attribute reference
	 */
	public ElementaryRangeReference getTdate06oReference() {
		return tdate06o.getReference();
	}

	/**
	 * Getter for tdate06o attribute.
	 * @return tdate06o attribute
	 */
	public String getTdate06o() {
		return tdate06o.getValue();
	}

	/**
	 * Setter for tdate06o attribute.
	 * @param tdate06o the new value of tdate06o
	 */
	public void setTdate06o(String tdate06o) {
		this.tdate06o.setValue(tdate06o);
	}
	/**
	 * Gets the reference for attribute tdesc06c.
	 * @return the tdesc06c attribute reference
	 */
	public ElementaryRangeReference getTdesc06cReference() {
		return tdesc06c.getReference();
	}

	/**
	 * Getter for tdesc06c attribute.
	 * @return tdesc06c attribute
	 */
	public String getTdesc06c() {
		return tdesc06c.getValue();
	}

	/**
	 * Setter for tdesc06c attribute.
	 * @param tdesc06c the new value of tdesc06c
	 */
	public void setTdesc06c(String tdesc06c) {
		this.tdesc06c.setValue(tdesc06c);
	}
	/**
	 * Gets the reference for attribute tdesc06p.
	 * @return the tdesc06p attribute reference
	 */
	public ElementaryRangeReference getTdesc06pReference() {
		return tdesc06p.getReference();
	}

	/**
	 * Getter for tdesc06p attribute.
	 * @return tdesc06p attribute
	 */
	public String getTdesc06p() {
		return tdesc06p.getValue();
	}

	/**
	 * Setter for tdesc06p attribute.
	 * @param tdesc06p the new value of tdesc06p
	 */
	public void setTdesc06p(String tdesc06p) {
		this.tdesc06p.setValue(tdesc06p);
	}
	/**
	 * Gets the reference for attribute tdesc06h.
	 * @return the tdesc06h attribute reference
	 */
	public ElementaryRangeReference getTdesc06hReference() {
		return tdesc06h.getReference();
	}

	/**
	 * Getter for tdesc06h attribute.
	 * @return tdesc06h attribute
	 */
	public String getTdesc06h() {
		return tdesc06h.getValue();
	}

	/**
	 * Setter for tdesc06h attribute.
	 * @param tdesc06h the new value of tdesc06h
	 */
	public void setTdesc06h(String tdesc06h) {
		this.tdesc06h.setValue(tdesc06h);
	}
	/**
	 * Gets the reference for attribute tdesc06v.
	 * @return the tdesc06v attribute reference
	 */
	public ElementaryRangeReference getTdesc06vReference() {
		return tdesc06v.getReference();
	}

	/**
	 * Getter for tdesc06v attribute.
	 * @return tdesc06v attribute
	 */
	public String getTdesc06v() {
		return tdesc06v.getValue();
	}

	/**
	 * Setter for tdesc06v attribute.
	 * @param tdesc06v the new value of tdesc06v
	 */
	public void setTdesc06v(String tdesc06v) {
		this.tdesc06v.setValue(tdesc06v);
	}
	/**
	 * Gets the reference for attribute tdesc06o.
	 * @return the tdesc06o attribute reference
	 */
	public ElementaryRangeReference getTdesc06oReference() {
		return tdesc06o.getReference();
	}

	/**
	 * Getter for tdesc06o attribute.
	 * @return tdesc06o attribute
	 */
	public String getTdesc06o() {
		return tdesc06o.getValue();
	}

	/**
	 * Setter for tdesc06o attribute.
	 * @param tdesc06o the new value of tdesc06o
	 */
	public void setTdesc06o(String tdesc06o) {
		this.tdesc06o.setValue(tdesc06o);
	}
	/**
	 * Gets the reference for attribute tamt006c.
	 * @return the tamt006c attribute reference
	 */
	public ElementaryRangeReference getTamt006cReference() {
		return tamt006c.getReference();
	}

	/**
	 * Getter for tamt006c attribute.
	 * @return tamt006c attribute
	 */
	public String getTamt006c() {
		return tamt006c.getValue();
	}

	/**
	 * Setter for tamt006c attribute.
	 * @param tamt006c the new value of tamt006c
	 */
	public void setTamt006c(String tamt006c) {
		this.tamt006c.setValue(tamt006c);
	}
	/**
	 * Gets the reference for attribute tamt006p.
	 * @return the tamt006p attribute reference
	 */
	public ElementaryRangeReference getTamt006pReference() {
		return tamt006p.getReference();
	}

	/**
	 * Getter for tamt006p attribute.
	 * @return tamt006p attribute
	 */
	public String getTamt006p() {
		return tamt006p.getValue();
	}

	/**
	 * Setter for tamt006p attribute.
	 * @param tamt006p the new value of tamt006p
	 */
	public void setTamt006p(String tamt006p) {
		this.tamt006p.setValue(tamt006p);
	}
	/**
	 * Gets the reference for attribute tamt006h.
	 * @return the tamt006h attribute reference
	 */
	public ElementaryRangeReference getTamt006hReference() {
		return tamt006h.getReference();
	}

	/**
	 * Getter for tamt006h attribute.
	 * @return tamt006h attribute
	 */
	public String getTamt006h() {
		return tamt006h.getValue();
	}

	/**
	 * Setter for tamt006h attribute.
	 * @param tamt006h the new value of tamt006h
	 */
	public void setTamt006h(String tamt006h) {
		this.tamt006h.setValue(tamt006h);
	}
	/**
	 * Gets the reference for attribute tamt006v.
	 * @return the tamt006v attribute reference
	 */
	public ElementaryRangeReference getTamt006vReference() {
		return tamt006v.getReference();
	}

	/**
	 * Getter for tamt006v attribute.
	 * @return tamt006v attribute
	 */
	public String getTamt006v() {
		return tamt006v.getValue();
	}

	/**
	 * Setter for tamt006v attribute.
	 * @param tamt006v the new value of tamt006v
	 */
	public void setTamt006v(String tamt006v) {
		this.tamt006v.setValue(tamt006v);
	}
	/**
	 * Gets the reference for attribute tamt006o.
	 * @return the tamt006o attribute reference
	 */
	public ElementaryRangeReference getTamt006oReference() {
		return tamt006o.getReference();
	}

	/**
	 * Getter for tamt006o attribute.
	 * @return tamt006o attribute
	 */
	public String getTamt006o() {
		return tamt006o.getValue();
	}

	/**
	 * Setter for tamt006o attribute.
	 * @param tamt006o the new value of tamt006o
	 */
	public void setTamt006o(String tamt006o) {
		this.tamt006o.setValue(tamt006o);
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
	 * Gets the reference for attribute trnid07c.
	 * @return the trnid07c attribute reference
	 */
	public ElementaryRangeReference getTrnid07cReference() {
		return trnid07c.getReference();
	}

	/**
	 * Getter for trnid07c attribute.
	 * @return trnid07c attribute
	 */
	public String getTrnid07c() {
		return trnid07c.getValue();
	}

	/**
	 * Setter for trnid07c attribute.
	 * @param trnid07c the new value of trnid07c
	 */
	public void setTrnid07c(String trnid07c) {
		this.trnid07c.setValue(trnid07c);
	}
	/**
	 * Gets the reference for attribute trnid07p.
	 * @return the trnid07p attribute reference
	 */
	public ElementaryRangeReference getTrnid07pReference() {
		return trnid07p.getReference();
	}

	/**
	 * Getter for trnid07p attribute.
	 * @return trnid07p attribute
	 */
	public String getTrnid07p() {
		return trnid07p.getValue();
	}

	/**
	 * Setter for trnid07p attribute.
	 * @param trnid07p the new value of trnid07p
	 */
	public void setTrnid07p(String trnid07p) {
		this.trnid07p.setValue(trnid07p);
	}
	/**
	 * Gets the reference for attribute trnid07h.
	 * @return the trnid07h attribute reference
	 */
	public ElementaryRangeReference getTrnid07hReference() {
		return trnid07h.getReference();
	}

	/**
	 * Getter for trnid07h attribute.
	 * @return trnid07h attribute
	 */
	public String getTrnid07h() {
		return trnid07h.getValue();
	}

	/**
	 * Setter for trnid07h attribute.
	 * @param trnid07h the new value of trnid07h
	 */
	public void setTrnid07h(String trnid07h) {
		this.trnid07h.setValue(trnid07h);
	}
	/**
	 * Gets the reference for attribute trnid07v.
	 * @return the trnid07v attribute reference
	 */
	public ElementaryRangeReference getTrnid07vReference() {
		return trnid07v.getReference();
	}

	/**
	 * Getter for trnid07v attribute.
	 * @return trnid07v attribute
	 */
	public String getTrnid07v() {
		return trnid07v.getValue();
	}

	/**
	 * Setter for trnid07v attribute.
	 * @param trnid07v the new value of trnid07v
	 */
	public void setTrnid07v(String trnid07v) {
		this.trnid07v.setValue(trnid07v);
	}
	/**
	 * Gets the reference for attribute trnid07o.
	 * @return the trnid07o attribute reference
	 */
	public ElementaryRangeReference getTrnid07oReference() {
		return trnid07o.getReference();
	}

	/**
	 * Getter for trnid07o attribute.
	 * @return trnid07o attribute
	 */
	public String getTrnid07o() {
		return trnid07o.getValue();
	}

	/**
	 * Setter for trnid07o attribute.
	 * @param trnid07o the new value of trnid07o
	 */
	public void setTrnid07o(String trnid07o) {
		this.trnid07o.setValue(trnid07o);
	}
	/**
	 * Gets the reference for attribute tdate07c.
	 * @return the tdate07c attribute reference
	 */
	public ElementaryRangeReference getTdate07cReference() {
		return tdate07c.getReference();
	}

	/**
	 * Getter for tdate07c attribute.
	 * @return tdate07c attribute
	 */
	public String getTdate07c() {
		return tdate07c.getValue();
	}

	/**
	 * Setter for tdate07c attribute.
	 * @param tdate07c the new value of tdate07c
	 */
	public void setTdate07c(String tdate07c) {
		this.tdate07c.setValue(tdate07c);
	}
	/**
	 * Gets the reference for attribute tdate07p.
	 * @return the tdate07p attribute reference
	 */
	public ElementaryRangeReference getTdate07pReference() {
		return tdate07p.getReference();
	}

	/**
	 * Getter for tdate07p attribute.
	 * @return tdate07p attribute
	 */
	public String getTdate07p() {
		return tdate07p.getValue();
	}

	/**
	 * Setter for tdate07p attribute.
	 * @param tdate07p the new value of tdate07p
	 */
	public void setTdate07p(String tdate07p) {
		this.tdate07p.setValue(tdate07p);
	}
	/**
	 * Gets the reference for attribute tdate07h.
	 * @return the tdate07h attribute reference
	 */
	public ElementaryRangeReference getTdate07hReference() {
		return tdate07h.getReference();
	}

	/**
	 * Getter for tdate07h attribute.
	 * @return tdate07h attribute
	 */
	public String getTdate07h() {
		return tdate07h.getValue();
	}

	/**
	 * Setter for tdate07h attribute.
	 * @param tdate07h the new value of tdate07h
	 */
	public void setTdate07h(String tdate07h) {
		this.tdate07h.setValue(tdate07h);
	}
	/**
	 * Gets the reference for attribute tdate07v.
	 * @return the tdate07v attribute reference
	 */
	public ElementaryRangeReference getTdate07vReference() {
		return tdate07v.getReference();
	}

	/**
	 * Getter for tdate07v attribute.
	 * @return tdate07v attribute
	 */
	public String getTdate07v() {
		return tdate07v.getValue();
	}

	/**
	 * Setter for tdate07v attribute.
	 * @param tdate07v the new value of tdate07v
	 */
	public void setTdate07v(String tdate07v) {
		this.tdate07v.setValue(tdate07v);
	}
	/**
	 * Gets the reference for attribute tdate07o.
	 * @return the tdate07o attribute reference
	 */
	public ElementaryRangeReference getTdate07oReference() {
		return tdate07o.getReference();
	}

	/**
	 * Getter for tdate07o attribute.
	 * @return tdate07o attribute
	 */
	public String getTdate07o() {
		return tdate07o.getValue();
	}

	/**
	 * Setter for tdate07o attribute.
	 * @param tdate07o the new value of tdate07o
	 */
	public void setTdate07o(String tdate07o) {
		this.tdate07o.setValue(tdate07o);
	}
	/**
	 * Gets the reference for attribute tdesc07c.
	 * @return the tdesc07c attribute reference
	 */
	public ElementaryRangeReference getTdesc07cReference() {
		return tdesc07c.getReference();
	}

	/**
	 * Getter for tdesc07c attribute.
	 * @return tdesc07c attribute
	 */
	public String getTdesc07c() {
		return tdesc07c.getValue();
	}

	/**
	 * Setter for tdesc07c attribute.
	 * @param tdesc07c the new value of tdesc07c
	 */
	public void setTdesc07c(String tdesc07c) {
		this.tdesc07c.setValue(tdesc07c);
	}
	/**
	 * Gets the reference for attribute tdesc07p.
	 * @return the tdesc07p attribute reference
	 */
	public ElementaryRangeReference getTdesc07pReference() {
		return tdesc07p.getReference();
	}

	/**
	 * Getter for tdesc07p attribute.
	 * @return tdesc07p attribute
	 */
	public String getTdesc07p() {
		return tdesc07p.getValue();
	}

	/**
	 * Setter for tdesc07p attribute.
	 * @param tdesc07p the new value of tdesc07p
	 */
	public void setTdesc07p(String tdesc07p) {
		this.tdesc07p.setValue(tdesc07p);
	}
	/**
	 * Gets the reference for attribute tdesc07h.
	 * @return the tdesc07h attribute reference
	 */
	public ElementaryRangeReference getTdesc07hReference() {
		return tdesc07h.getReference();
	}

	/**
	 * Getter for tdesc07h attribute.
	 * @return tdesc07h attribute
	 */
	public String getTdesc07h() {
		return tdesc07h.getValue();
	}

	/**
	 * Setter for tdesc07h attribute.
	 * @param tdesc07h the new value of tdesc07h
	 */
	public void setTdesc07h(String tdesc07h) {
		this.tdesc07h.setValue(tdesc07h);
	}
	/**
	 * Gets the reference for attribute tdesc07v.
	 * @return the tdesc07v attribute reference
	 */
	public ElementaryRangeReference getTdesc07vReference() {
		return tdesc07v.getReference();
	}

	/**
	 * Getter for tdesc07v attribute.
	 * @return tdesc07v attribute
	 */
	public String getTdesc07v() {
		return tdesc07v.getValue();
	}

	/**
	 * Setter for tdesc07v attribute.
	 * @param tdesc07v the new value of tdesc07v
	 */
	public void setTdesc07v(String tdesc07v) {
		this.tdesc07v.setValue(tdesc07v);
	}
	/**
	 * Gets the reference for attribute tdesc07o.
	 * @return the tdesc07o attribute reference
	 */
	public ElementaryRangeReference getTdesc07oReference() {
		return tdesc07o.getReference();
	}

	/**
	 * Getter for tdesc07o attribute.
	 * @return tdesc07o attribute
	 */
	public String getTdesc07o() {
		return tdesc07o.getValue();
	}

	/**
	 * Setter for tdesc07o attribute.
	 * @param tdesc07o the new value of tdesc07o
	 */
	public void setTdesc07o(String tdesc07o) {
		this.tdesc07o.setValue(tdesc07o);
	}
	/**
	 * Gets the reference for attribute tamt007c.
	 * @return the tamt007c attribute reference
	 */
	public ElementaryRangeReference getTamt007cReference() {
		return tamt007c.getReference();
	}

	/**
	 * Getter for tamt007c attribute.
	 * @return tamt007c attribute
	 */
	public String getTamt007c() {
		return tamt007c.getValue();
	}

	/**
	 * Setter for tamt007c attribute.
	 * @param tamt007c the new value of tamt007c
	 */
	public void setTamt007c(String tamt007c) {
		this.tamt007c.setValue(tamt007c);
	}
	/**
	 * Gets the reference for attribute tamt007p.
	 * @return the tamt007p attribute reference
	 */
	public ElementaryRangeReference getTamt007pReference() {
		return tamt007p.getReference();
	}

	/**
	 * Getter for tamt007p attribute.
	 * @return tamt007p attribute
	 */
	public String getTamt007p() {
		return tamt007p.getValue();
	}

	/**
	 * Setter for tamt007p attribute.
	 * @param tamt007p the new value of tamt007p
	 */
	public void setTamt007p(String tamt007p) {
		this.tamt007p.setValue(tamt007p);
	}
	/**
	 * Gets the reference for attribute tamt007h.
	 * @return the tamt007h attribute reference
	 */
	public ElementaryRangeReference getTamt007hReference() {
		return tamt007h.getReference();
	}

	/**
	 * Getter for tamt007h attribute.
	 * @return tamt007h attribute
	 */
	public String getTamt007h() {
		return tamt007h.getValue();
	}

	/**
	 * Setter for tamt007h attribute.
	 * @param tamt007h the new value of tamt007h
	 */
	public void setTamt007h(String tamt007h) {
		this.tamt007h.setValue(tamt007h);
	}
	/**
	 * Gets the reference for attribute tamt007v.
	 * @return the tamt007v attribute reference
	 */
	public ElementaryRangeReference getTamt007vReference() {
		return tamt007v.getReference();
	}

	/**
	 * Getter for tamt007v attribute.
	 * @return tamt007v attribute
	 */
	public String getTamt007v() {
		return tamt007v.getValue();
	}

	/**
	 * Setter for tamt007v attribute.
	 * @param tamt007v the new value of tamt007v
	 */
	public void setTamt007v(String tamt007v) {
		this.tamt007v.setValue(tamt007v);
	}
	/**
	 * Gets the reference for attribute tamt007o.
	 * @return the tamt007o attribute reference
	 */
	public ElementaryRangeReference getTamt007oReference() {
		return tamt007o.getReference();
	}

	/**
	 * Getter for tamt007o attribute.
	 * @return tamt007o attribute
	 */
	public String getTamt007o() {
		return tamt007o.getValue();
	}

	/**
	 * Setter for tamt007o attribute.
	 * @param tamt007o the new value of tamt007o
	 */
	public void setTamt007o(String tamt007o) {
		this.tamt007o.setValue(tamt007o);
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
	 * Gets the reference for attribute trnid08c.
	 * @return the trnid08c attribute reference
	 */
	public ElementaryRangeReference getTrnid08cReference() {
		return trnid08c.getReference();
	}

	/**
	 * Getter for trnid08c attribute.
	 * @return trnid08c attribute
	 */
	public String getTrnid08c() {
		return trnid08c.getValue();
	}

	/**
	 * Setter for trnid08c attribute.
	 * @param trnid08c the new value of trnid08c
	 */
	public void setTrnid08c(String trnid08c) {
		this.trnid08c.setValue(trnid08c);
	}
	/**
	 * Gets the reference for attribute trnid08p.
	 * @return the trnid08p attribute reference
	 */
	public ElementaryRangeReference getTrnid08pReference() {
		return trnid08p.getReference();
	}

	/**
	 * Getter for trnid08p attribute.
	 * @return trnid08p attribute
	 */
	public String getTrnid08p() {
		return trnid08p.getValue();
	}

	/**
	 * Setter for trnid08p attribute.
	 * @param trnid08p the new value of trnid08p
	 */
	public void setTrnid08p(String trnid08p) {
		this.trnid08p.setValue(trnid08p);
	}
	/**
	 * Gets the reference for attribute trnid08h.
	 * @return the trnid08h attribute reference
	 */
	public ElementaryRangeReference getTrnid08hReference() {
		return trnid08h.getReference();
	}

	/**
	 * Getter for trnid08h attribute.
	 * @return trnid08h attribute
	 */
	public String getTrnid08h() {
		return trnid08h.getValue();
	}

	/**
	 * Setter for trnid08h attribute.
	 * @param trnid08h the new value of trnid08h
	 */
	public void setTrnid08h(String trnid08h) {
		this.trnid08h.setValue(trnid08h);
	}
	/**
	 * Gets the reference for attribute trnid08v.
	 * @return the trnid08v attribute reference
	 */
	public ElementaryRangeReference getTrnid08vReference() {
		return trnid08v.getReference();
	}

	/**
	 * Getter for trnid08v attribute.
	 * @return trnid08v attribute
	 */
	public String getTrnid08v() {
		return trnid08v.getValue();
	}

	/**
	 * Setter for trnid08v attribute.
	 * @param trnid08v the new value of trnid08v
	 */
	public void setTrnid08v(String trnid08v) {
		this.trnid08v.setValue(trnid08v);
	}
	/**
	 * Gets the reference for attribute trnid08o.
	 * @return the trnid08o attribute reference
	 */
	public ElementaryRangeReference getTrnid08oReference() {
		return trnid08o.getReference();
	}

	/**
	 * Getter for trnid08o attribute.
	 * @return trnid08o attribute
	 */
	public String getTrnid08o() {
		return trnid08o.getValue();
	}

	/**
	 * Setter for trnid08o attribute.
	 * @param trnid08o the new value of trnid08o
	 */
	public void setTrnid08o(String trnid08o) {
		this.trnid08o.setValue(trnid08o);
	}
	/**
	 * Gets the reference for attribute tdate08c.
	 * @return the tdate08c attribute reference
	 */
	public ElementaryRangeReference getTdate08cReference() {
		return tdate08c.getReference();
	}

	/**
	 * Getter for tdate08c attribute.
	 * @return tdate08c attribute
	 */
	public String getTdate08c() {
		return tdate08c.getValue();
	}

	/**
	 * Setter for tdate08c attribute.
	 * @param tdate08c the new value of tdate08c
	 */
	public void setTdate08c(String tdate08c) {
		this.tdate08c.setValue(tdate08c);
	}
	/**
	 * Gets the reference for attribute tdate08p.
	 * @return the tdate08p attribute reference
	 */
	public ElementaryRangeReference getTdate08pReference() {
		return tdate08p.getReference();
	}

	/**
	 * Getter for tdate08p attribute.
	 * @return tdate08p attribute
	 */
	public String getTdate08p() {
		return tdate08p.getValue();
	}

	/**
	 * Setter for tdate08p attribute.
	 * @param tdate08p the new value of tdate08p
	 */
	public void setTdate08p(String tdate08p) {
		this.tdate08p.setValue(tdate08p);
	}
	/**
	 * Gets the reference for attribute tdate08h.
	 * @return the tdate08h attribute reference
	 */
	public ElementaryRangeReference getTdate08hReference() {
		return tdate08h.getReference();
	}

	/**
	 * Getter for tdate08h attribute.
	 * @return tdate08h attribute
	 */
	public String getTdate08h() {
		return tdate08h.getValue();
	}

	/**
	 * Setter for tdate08h attribute.
	 * @param tdate08h the new value of tdate08h
	 */
	public void setTdate08h(String tdate08h) {
		this.tdate08h.setValue(tdate08h);
	}
	/**
	 * Gets the reference for attribute tdate08v.
	 * @return the tdate08v attribute reference
	 */
	public ElementaryRangeReference getTdate08vReference() {
		return tdate08v.getReference();
	}

	/**
	 * Getter for tdate08v attribute.
	 * @return tdate08v attribute
	 */
	public String getTdate08v() {
		return tdate08v.getValue();
	}

	/**
	 * Setter for tdate08v attribute.
	 * @param tdate08v the new value of tdate08v
	 */
	public void setTdate08v(String tdate08v) {
		this.tdate08v.setValue(tdate08v);
	}
	/**
	 * Gets the reference for attribute tdate08o.
	 * @return the tdate08o attribute reference
	 */
	public ElementaryRangeReference getTdate08oReference() {
		return tdate08o.getReference();
	}

	/**
	 * Getter for tdate08o attribute.
	 * @return tdate08o attribute
	 */
	public String getTdate08o() {
		return tdate08o.getValue();
	}

	/**
	 * Setter for tdate08o attribute.
	 * @param tdate08o the new value of tdate08o
	 */
	public void setTdate08o(String tdate08o) {
		this.tdate08o.setValue(tdate08o);
	}
	/**
	 * Gets the reference for attribute tdesc08c.
	 * @return the tdesc08c attribute reference
	 */
	public ElementaryRangeReference getTdesc08cReference() {
		return tdesc08c.getReference();
	}

	/**
	 * Getter for tdesc08c attribute.
	 * @return tdesc08c attribute
	 */
	public String getTdesc08c() {
		return tdesc08c.getValue();
	}

	/**
	 * Setter for tdesc08c attribute.
	 * @param tdesc08c the new value of tdesc08c
	 */
	public void setTdesc08c(String tdesc08c) {
		this.tdesc08c.setValue(tdesc08c);
	}
	/**
	 * Gets the reference for attribute tdesc08p.
	 * @return the tdesc08p attribute reference
	 */
	public ElementaryRangeReference getTdesc08pReference() {
		return tdesc08p.getReference();
	}

	/**
	 * Getter for tdesc08p attribute.
	 * @return tdesc08p attribute
	 */
	public String getTdesc08p() {
		return tdesc08p.getValue();
	}

	/**
	 * Setter for tdesc08p attribute.
	 * @param tdesc08p the new value of tdesc08p
	 */
	public void setTdesc08p(String tdesc08p) {
		this.tdesc08p.setValue(tdesc08p);
	}
	/**
	 * Gets the reference for attribute tdesc08h.
	 * @return the tdesc08h attribute reference
	 */
	public ElementaryRangeReference getTdesc08hReference() {
		return tdesc08h.getReference();
	}

	/**
	 * Getter for tdesc08h attribute.
	 * @return tdesc08h attribute
	 */
	public String getTdesc08h() {
		return tdesc08h.getValue();
	}

	/**
	 * Setter for tdesc08h attribute.
	 * @param tdesc08h the new value of tdesc08h
	 */
	public void setTdesc08h(String tdesc08h) {
		this.tdesc08h.setValue(tdesc08h);
	}
	/**
	 * Gets the reference for attribute tdesc08v.
	 * @return the tdesc08v attribute reference
	 */
	public ElementaryRangeReference getTdesc08vReference() {
		return tdesc08v.getReference();
	}

	/**
	 * Getter for tdesc08v attribute.
	 * @return tdesc08v attribute
	 */
	public String getTdesc08v() {
		return tdesc08v.getValue();
	}

	/**
	 * Setter for tdesc08v attribute.
	 * @param tdesc08v the new value of tdesc08v
	 */
	public void setTdesc08v(String tdesc08v) {
		this.tdesc08v.setValue(tdesc08v);
	}
	/**
	 * Gets the reference for attribute tdesc08o.
	 * @return the tdesc08o attribute reference
	 */
	public ElementaryRangeReference getTdesc08oReference() {
		return tdesc08o.getReference();
	}

	/**
	 * Getter for tdesc08o attribute.
	 * @return tdesc08o attribute
	 */
	public String getTdesc08o() {
		return tdesc08o.getValue();
	}

	/**
	 * Setter for tdesc08o attribute.
	 * @param tdesc08o the new value of tdesc08o
	 */
	public void setTdesc08o(String tdesc08o) {
		this.tdesc08o.setValue(tdesc08o);
	}
	/**
	 * Gets the reference for attribute tamt008c.
	 * @return the tamt008c attribute reference
	 */
	public ElementaryRangeReference getTamt008cReference() {
		return tamt008c.getReference();
	}

	/**
	 * Getter for tamt008c attribute.
	 * @return tamt008c attribute
	 */
	public String getTamt008c() {
		return tamt008c.getValue();
	}

	/**
	 * Setter for tamt008c attribute.
	 * @param tamt008c the new value of tamt008c
	 */
	public void setTamt008c(String tamt008c) {
		this.tamt008c.setValue(tamt008c);
	}
	/**
	 * Gets the reference for attribute tamt008p.
	 * @return the tamt008p attribute reference
	 */
	public ElementaryRangeReference getTamt008pReference() {
		return tamt008p.getReference();
	}

	/**
	 * Getter for tamt008p attribute.
	 * @return tamt008p attribute
	 */
	public String getTamt008p() {
		return tamt008p.getValue();
	}

	/**
	 * Setter for tamt008p attribute.
	 * @param tamt008p the new value of tamt008p
	 */
	public void setTamt008p(String tamt008p) {
		this.tamt008p.setValue(tamt008p);
	}
	/**
	 * Gets the reference for attribute tamt008h.
	 * @return the tamt008h attribute reference
	 */
	public ElementaryRangeReference getTamt008hReference() {
		return tamt008h.getReference();
	}

	/**
	 * Getter for tamt008h attribute.
	 * @return tamt008h attribute
	 */
	public String getTamt008h() {
		return tamt008h.getValue();
	}

	/**
	 * Setter for tamt008h attribute.
	 * @param tamt008h the new value of tamt008h
	 */
	public void setTamt008h(String tamt008h) {
		this.tamt008h.setValue(tamt008h);
	}
	/**
	 * Gets the reference for attribute tamt008v.
	 * @return the tamt008v attribute reference
	 */
	public ElementaryRangeReference getTamt008vReference() {
		return tamt008v.getReference();
	}

	/**
	 * Getter for tamt008v attribute.
	 * @return tamt008v attribute
	 */
	public String getTamt008v() {
		return tamt008v.getValue();
	}

	/**
	 * Setter for tamt008v attribute.
	 * @param tamt008v the new value of tamt008v
	 */
	public void setTamt008v(String tamt008v) {
		this.tamt008v.setValue(tamt008v);
	}
	/**
	 * Gets the reference for attribute tamt008o.
	 * @return the tamt008o attribute reference
	 */
	public ElementaryRangeReference getTamt008oReference() {
		return tamt008o.getReference();
	}

	/**
	 * Getter for tamt008o attribute.
	 * @return tamt008o attribute
	 */
	public String getTamt008o() {
		return tamt008o.getValue();
	}

	/**
	 * Setter for tamt008o attribute.
	 * @param tamt008o the new value of tamt008o
	 */
	public void setTamt008o(String tamt008o) {
		this.tamt008o.setValue(tamt008o);
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
	 * Gets the reference for attribute trnid09c.
	 * @return the trnid09c attribute reference
	 */
	public ElementaryRangeReference getTrnid09cReference() {
		return trnid09c.getReference();
	}

	/**
	 * Getter for trnid09c attribute.
	 * @return trnid09c attribute
	 */
	public String getTrnid09c() {
		return trnid09c.getValue();
	}

	/**
	 * Setter for trnid09c attribute.
	 * @param trnid09c the new value of trnid09c
	 */
	public void setTrnid09c(String trnid09c) {
		this.trnid09c.setValue(trnid09c);
	}
	/**
	 * Gets the reference for attribute trnid09p.
	 * @return the trnid09p attribute reference
	 */
	public ElementaryRangeReference getTrnid09pReference() {
		return trnid09p.getReference();
	}

	/**
	 * Getter for trnid09p attribute.
	 * @return trnid09p attribute
	 */
	public String getTrnid09p() {
		return trnid09p.getValue();
	}

	/**
	 * Setter for trnid09p attribute.
	 * @param trnid09p the new value of trnid09p
	 */
	public void setTrnid09p(String trnid09p) {
		this.trnid09p.setValue(trnid09p);
	}
	/**
	 * Gets the reference for attribute trnid09h.
	 * @return the trnid09h attribute reference
	 */
	public ElementaryRangeReference getTrnid09hReference() {
		return trnid09h.getReference();
	}

	/**
	 * Getter for trnid09h attribute.
	 * @return trnid09h attribute
	 */
	public String getTrnid09h() {
		return trnid09h.getValue();
	}

	/**
	 * Setter for trnid09h attribute.
	 * @param trnid09h the new value of trnid09h
	 */
	public void setTrnid09h(String trnid09h) {
		this.trnid09h.setValue(trnid09h);
	}
	/**
	 * Gets the reference for attribute trnid09v.
	 * @return the trnid09v attribute reference
	 */
	public ElementaryRangeReference getTrnid09vReference() {
		return trnid09v.getReference();
	}

	/**
	 * Getter for trnid09v attribute.
	 * @return trnid09v attribute
	 */
	public String getTrnid09v() {
		return trnid09v.getValue();
	}

	/**
	 * Setter for trnid09v attribute.
	 * @param trnid09v the new value of trnid09v
	 */
	public void setTrnid09v(String trnid09v) {
		this.trnid09v.setValue(trnid09v);
	}
	/**
	 * Gets the reference for attribute trnid09o.
	 * @return the trnid09o attribute reference
	 */
	public ElementaryRangeReference getTrnid09oReference() {
		return trnid09o.getReference();
	}

	/**
	 * Getter for trnid09o attribute.
	 * @return trnid09o attribute
	 */
	public String getTrnid09o() {
		return trnid09o.getValue();
	}

	/**
	 * Setter for trnid09o attribute.
	 * @param trnid09o the new value of trnid09o
	 */
	public void setTrnid09o(String trnid09o) {
		this.trnid09o.setValue(trnid09o);
	}
	/**
	 * Gets the reference for attribute tdate09c.
	 * @return the tdate09c attribute reference
	 */
	public ElementaryRangeReference getTdate09cReference() {
		return tdate09c.getReference();
	}

	/**
	 * Getter for tdate09c attribute.
	 * @return tdate09c attribute
	 */
	public String getTdate09c() {
		return tdate09c.getValue();
	}

	/**
	 * Setter for tdate09c attribute.
	 * @param tdate09c the new value of tdate09c
	 */
	public void setTdate09c(String tdate09c) {
		this.tdate09c.setValue(tdate09c);
	}
	/**
	 * Gets the reference for attribute tdate09p.
	 * @return the tdate09p attribute reference
	 */
	public ElementaryRangeReference getTdate09pReference() {
		return tdate09p.getReference();
	}

	/**
	 * Getter for tdate09p attribute.
	 * @return tdate09p attribute
	 */
	public String getTdate09p() {
		return tdate09p.getValue();
	}

	/**
	 * Setter for tdate09p attribute.
	 * @param tdate09p the new value of tdate09p
	 */
	public void setTdate09p(String tdate09p) {
		this.tdate09p.setValue(tdate09p);
	}
	/**
	 * Gets the reference for attribute tdate09h.
	 * @return the tdate09h attribute reference
	 */
	public ElementaryRangeReference getTdate09hReference() {
		return tdate09h.getReference();
	}

	/**
	 * Getter for tdate09h attribute.
	 * @return tdate09h attribute
	 */
	public String getTdate09h() {
		return tdate09h.getValue();
	}

	/**
	 * Setter for tdate09h attribute.
	 * @param tdate09h the new value of tdate09h
	 */
	public void setTdate09h(String tdate09h) {
		this.tdate09h.setValue(tdate09h);
	}
	/**
	 * Gets the reference for attribute tdate09v.
	 * @return the tdate09v attribute reference
	 */
	public ElementaryRangeReference getTdate09vReference() {
		return tdate09v.getReference();
	}

	/**
	 * Getter for tdate09v attribute.
	 * @return tdate09v attribute
	 */
	public String getTdate09v() {
		return tdate09v.getValue();
	}

	/**
	 * Setter for tdate09v attribute.
	 * @param tdate09v the new value of tdate09v
	 */
	public void setTdate09v(String tdate09v) {
		this.tdate09v.setValue(tdate09v);
	}
	/**
	 * Gets the reference for attribute tdate09o.
	 * @return the tdate09o attribute reference
	 */
	public ElementaryRangeReference getTdate09oReference() {
		return tdate09o.getReference();
	}

	/**
	 * Getter for tdate09o attribute.
	 * @return tdate09o attribute
	 */
	public String getTdate09o() {
		return tdate09o.getValue();
	}

	/**
	 * Setter for tdate09o attribute.
	 * @param tdate09o the new value of tdate09o
	 */
	public void setTdate09o(String tdate09o) {
		this.tdate09o.setValue(tdate09o);
	}
	/**
	 * Gets the reference for attribute tdesc09c.
	 * @return the tdesc09c attribute reference
	 */
	public ElementaryRangeReference getTdesc09cReference() {
		return tdesc09c.getReference();
	}

	/**
	 * Getter for tdesc09c attribute.
	 * @return tdesc09c attribute
	 */
	public String getTdesc09c() {
		return tdesc09c.getValue();
	}

	/**
	 * Setter for tdesc09c attribute.
	 * @param tdesc09c the new value of tdesc09c
	 */
	public void setTdesc09c(String tdesc09c) {
		this.tdesc09c.setValue(tdesc09c);
	}
	/**
	 * Gets the reference for attribute tdesc09p.
	 * @return the tdesc09p attribute reference
	 */
	public ElementaryRangeReference getTdesc09pReference() {
		return tdesc09p.getReference();
	}

	/**
	 * Getter for tdesc09p attribute.
	 * @return tdesc09p attribute
	 */
	public String getTdesc09p() {
		return tdesc09p.getValue();
	}

	/**
	 * Setter for tdesc09p attribute.
	 * @param tdesc09p the new value of tdesc09p
	 */
	public void setTdesc09p(String tdesc09p) {
		this.tdesc09p.setValue(tdesc09p);
	}
	/**
	 * Gets the reference for attribute tdesc09h.
	 * @return the tdesc09h attribute reference
	 */
	public ElementaryRangeReference getTdesc09hReference() {
		return tdesc09h.getReference();
	}

	/**
	 * Getter for tdesc09h attribute.
	 * @return tdesc09h attribute
	 */
	public String getTdesc09h() {
		return tdesc09h.getValue();
	}

	/**
	 * Setter for tdesc09h attribute.
	 * @param tdesc09h the new value of tdesc09h
	 */
	public void setTdesc09h(String tdesc09h) {
		this.tdesc09h.setValue(tdesc09h);
	}
	/**
	 * Gets the reference for attribute tdesc09v.
	 * @return the tdesc09v attribute reference
	 */
	public ElementaryRangeReference getTdesc09vReference() {
		return tdesc09v.getReference();
	}

	/**
	 * Getter for tdesc09v attribute.
	 * @return tdesc09v attribute
	 */
	public String getTdesc09v() {
		return tdesc09v.getValue();
	}

	/**
	 * Setter for tdesc09v attribute.
	 * @param tdesc09v the new value of tdesc09v
	 */
	public void setTdesc09v(String tdesc09v) {
		this.tdesc09v.setValue(tdesc09v);
	}
	/**
	 * Gets the reference for attribute tdesc09o.
	 * @return the tdesc09o attribute reference
	 */
	public ElementaryRangeReference getTdesc09oReference() {
		return tdesc09o.getReference();
	}

	/**
	 * Getter for tdesc09o attribute.
	 * @return tdesc09o attribute
	 */
	public String getTdesc09o() {
		return tdesc09o.getValue();
	}

	/**
	 * Setter for tdesc09o attribute.
	 * @param tdesc09o the new value of tdesc09o
	 */
	public void setTdesc09o(String tdesc09o) {
		this.tdesc09o.setValue(tdesc09o);
	}
	/**
	 * Gets the reference for attribute tamt009c.
	 * @return the tamt009c attribute reference
	 */
	public ElementaryRangeReference getTamt009cReference() {
		return tamt009c.getReference();
	}

	/**
	 * Getter for tamt009c attribute.
	 * @return tamt009c attribute
	 */
	public String getTamt009c() {
		return tamt009c.getValue();
	}

	/**
	 * Setter for tamt009c attribute.
	 * @param tamt009c the new value of tamt009c
	 */
	public void setTamt009c(String tamt009c) {
		this.tamt009c.setValue(tamt009c);
	}
	/**
	 * Gets the reference for attribute tamt009p.
	 * @return the tamt009p attribute reference
	 */
	public ElementaryRangeReference getTamt009pReference() {
		return tamt009p.getReference();
	}

	/**
	 * Getter for tamt009p attribute.
	 * @return tamt009p attribute
	 */
	public String getTamt009p() {
		return tamt009p.getValue();
	}

	/**
	 * Setter for tamt009p attribute.
	 * @param tamt009p the new value of tamt009p
	 */
	public void setTamt009p(String tamt009p) {
		this.tamt009p.setValue(tamt009p);
	}
	/**
	 * Gets the reference for attribute tamt009h.
	 * @return the tamt009h attribute reference
	 */
	public ElementaryRangeReference getTamt009hReference() {
		return tamt009h.getReference();
	}

	/**
	 * Getter for tamt009h attribute.
	 * @return tamt009h attribute
	 */
	public String getTamt009h() {
		return tamt009h.getValue();
	}

	/**
	 * Setter for tamt009h attribute.
	 * @param tamt009h the new value of tamt009h
	 */
	public void setTamt009h(String tamt009h) {
		this.tamt009h.setValue(tamt009h);
	}
	/**
	 * Gets the reference for attribute tamt009v.
	 * @return the tamt009v attribute reference
	 */
	public ElementaryRangeReference getTamt009vReference() {
		return tamt009v.getReference();
	}

	/**
	 * Getter for tamt009v attribute.
	 * @return tamt009v attribute
	 */
	public String getTamt009v() {
		return tamt009v.getValue();
	}

	/**
	 * Setter for tamt009v attribute.
	 * @param tamt009v the new value of tamt009v
	 */
	public void setTamt009v(String tamt009v) {
		this.tamt009v.setValue(tamt009v);
	}
	/**
	 * Gets the reference for attribute tamt009o.
	 * @return the tamt009o attribute reference
	 */
	public ElementaryRangeReference getTamt009oReference() {
		return tamt009o.getReference();
	}

	/**
	 * Getter for tamt009o attribute.
	 * @return tamt009o attribute
	 */
	public String getTamt009o() {
		return tamt009o.getValue();
	}

	/**
	 * Setter for tamt009o attribute.
	 * @param tamt009o the new value of tamt009o
	 */
	public void setTamt009o(String tamt009o) {
		this.tamt009o.setValue(tamt009o);
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
	 * Gets the reference for attribute trnid10c.
	 * @return the trnid10c attribute reference
	 */
	public ElementaryRangeReference getTrnid10cReference() {
		return trnid10c.getReference();
	}

	/**
	 * Getter for trnid10c attribute.
	 * @return trnid10c attribute
	 */
	public String getTrnid10c() {
		return trnid10c.getValue();
	}

	/**
	 * Setter for trnid10c attribute.
	 * @param trnid10c the new value of trnid10c
	 */
	public void setTrnid10c(String trnid10c) {
		this.trnid10c.setValue(trnid10c);
	}
	/**
	 * Gets the reference for attribute trnid10p.
	 * @return the trnid10p attribute reference
	 */
	public ElementaryRangeReference getTrnid10pReference() {
		return trnid10p.getReference();
	}

	/**
	 * Getter for trnid10p attribute.
	 * @return trnid10p attribute
	 */
	public String getTrnid10p() {
		return trnid10p.getValue();
	}

	/**
	 * Setter for trnid10p attribute.
	 * @param trnid10p the new value of trnid10p
	 */
	public void setTrnid10p(String trnid10p) {
		this.trnid10p.setValue(trnid10p);
	}
	/**
	 * Gets the reference for attribute trnid10h.
	 * @return the trnid10h attribute reference
	 */
	public ElementaryRangeReference getTrnid10hReference() {
		return trnid10h.getReference();
	}

	/**
	 * Getter for trnid10h attribute.
	 * @return trnid10h attribute
	 */
	public String getTrnid10h() {
		return trnid10h.getValue();
	}

	/**
	 * Setter for trnid10h attribute.
	 * @param trnid10h the new value of trnid10h
	 */
	public void setTrnid10h(String trnid10h) {
		this.trnid10h.setValue(trnid10h);
	}
	/**
	 * Gets the reference for attribute trnid10v.
	 * @return the trnid10v attribute reference
	 */
	public ElementaryRangeReference getTrnid10vReference() {
		return trnid10v.getReference();
	}

	/**
	 * Getter for trnid10v attribute.
	 * @return trnid10v attribute
	 */
	public String getTrnid10v() {
		return trnid10v.getValue();
	}

	/**
	 * Setter for trnid10v attribute.
	 * @param trnid10v the new value of trnid10v
	 */
	public void setTrnid10v(String trnid10v) {
		this.trnid10v.setValue(trnid10v);
	}
	/**
	 * Gets the reference for attribute trnid10o.
	 * @return the trnid10o attribute reference
	 */
	public ElementaryRangeReference getTrnid10oReference() {
		return trnid10o.getReference();
	}

	/**
	 * Getter for trnid10o attribute.
	 * @return trnid10o attribute
	 */
	public String getTrnid10o() {
		return trnid10o.getValue();
	}

	/**
	 * Setter for trnid10o attribute.
	 * @param trnid10o the new value of trnid10o
	 */
	public void setTrnid10o(String trnid10o) {
		this.trnid10o.setValue(trnid10o);
	}
	/**
	 * Gets the reference for attribute tdate10c.
	 * @return the tdate10c attribute reference
	 */
	public ElementaryRangeReference getTdate10cReference() {
		return tdate10c.getReference();
	}

	/**
	 * Getter for tdate10c attribute.
	 * @return tdate10c attribute
	 */
	public String getTdate10c() {
		return tdate10c.getValue();
	}

	/**
	 * Setter for tdate10c attribute.
	 * @param tdate10c the new value of tdate10c
	 */
	public void setTdate10c(String tdate10c) {
		this.tdate10c.setValue(tdate10c);
	}
	/**
	 * Gets the reference for attribute tdate10p.
	 * @return the tdate10p attribute reference
	 */
	public ElementaryRangeReference getTdate10pReference() {
		return tdate10p.getReference();
	}

	/**
	 * Getter for tdate10p attribute.
	 * @return tdate10p attribute
	 */
	public String getTdate10p() {
		return tdate10p.getValue();
	}

	/**
	 * Setter for tdate10p attribute.
	 * @param tdate10p the new value of tdate10p
	 */
	public void setTdate10p(String tdate10p) {
		this.tdate10p.setValue(tdate10p);
	}
	/**
	 * Gets the reference for attribute tdate10h.
	 * @return the tdate10h attribute reference
	 */
	public ElementaryRangeReference getTdate10hReference() {
		return tdate10h.getReference();
	}

	/**
	 * Getter for tdate10h attribute.
	 * @return tdate10h attribute
	 */
	public String getTdate10h() {
		return tdate10h.getValue();
	}

	/**
	 * Setter for tdate10h attribute.
	 * @param tdate10h the new value of tdate10h
	 */
	public void setTdate10h(String tdate10h) {
		this.tdate10h.setValue(tdate10h);
	}
	/**
	 * Gets the reference for attribute tdate10v.
	 * @return the tdate10v attribute reference
	 */
	public ElementaryRangeReference getTdate10vReference() {
		return tdate10v.getReference();
	}

	/**
	 * Getter for tdate10v attribute.
	 * @return tdate10v attribute
	 */
	public String getTdate10v() {
		return tdate10v.getValue();
	}

	/**
	 * Setter for tdate10v attribute.
	 * @param tdate10v the new value of tdate10v
	 */
	public void setTdate10v(String tdate10v) {
		this.tdate10v.setValue(tdate10v);
	}
	/**
	 * Gets the reference for attribute tdate10o.
	 * @return the tdate10o attribute reference
	 */
	public ElementaryRangeReference getTdate10oReference() {
		return tdate10o.getReference();
	}

	/**
	 * Getter for tdate10o attribute.
	 * @return tdate10o attribute
	 */
	public String getTdate10o() {
		return tdate10o.getValue();
	}

	/**
	 * Setter for tdate10o attribute.
	 * @param tdate10o the new value of tdate10o
	 */
	public void setTdate10o(String tdate10o) {
		this.tdate10o.setValue(tdate10o);
	}
	/**
	 * Gets the reference for attribute tdesc10c.
	 * @return the tdesc10c attribute reference
	 */
	public ElementaryRangeReference getTdesc10cReference() {
		return tdesc10c.getReference();
	}

	/**
	 * Getter for tdesc10c attribute.
	 * @return tdesc10c attribute
	 */
	public String getTdesc10c() {
		return tdesc10c.getValue();
	}

	/**
	 * Setter for tdesc10c attribute.
	 * @param tdesc10c the new value of tdesc10c
	 */
	public void setTdesc10c(String tdesc10c) {
		this.tdesc10c.setValue(tdesc10c);
	}
	/**
	 * Gets the reference for attribute tdesc10p.
	 * @return the tdesc10p attribute reference
	 */
	public ElementaryRangeReference getTdesc10pReference() {
		return tdesc10p.getReference();
	}

	/**
	 * Getter for tdesc10p attribute.
	 * @return tdesc10p attribute
	 */
	public String getTdesc10p() {
		return tdesc10p.getValue();
	}

	/**
	 * Setter for tdesc10p attribute.
	 * @param tdesc10p the new value of tdesc10p
	 */
	public void setTdesc10p(String tdesc10p) {
		this.tdesc10p.setValue(tdesc10p);
	}
	/**
	 * Gets the reference for attribute tdesc10h.
	 * @return the tdesc10h attribute reference
	 */
	public ElementaryRangeReference getTdesc10hReference() {
		return tdesc10h.getReference();
	}

	/**
	 * Getter for tdesc10h attribute.
	 * @return tdesc10h attribute
	 */
	public String getTdesc10h() {
		return tdesc10h.getValue();
	}

	/**
	 * Setter for tdesc10h attribute.
	 * @param tdesc10h the new value of tdesc10h
	 */
	public void setTdesc10h(String tdesc10h) {
		this.tdesc10h.setValue(tdesc10h);
	}
	/**
	 * Gets the reference for attribute tdesc10v.
	 * @return the tdesc10v attribute reference
	 */
	public ElementaryRangeReference getTdesc10vReference() {
		return tdesc10v.getReference();
	}

	/**
	 * Getter for tdesc10v attribute.
	 * @return tdesc10v attribute
	 */
	public String getTdesc10v() {
		return tdesc10v.getValue();
	}

	/**
	 * Setter for tdesc10v attribute.
	 * @param tdesc10v the new value of tdesc10v
	 */
	public void setTdesc10v(String tdesc10v) {
		this.tdesc10v.setValue(tdesc10v);
	}
	/**
	 * Gets the reference for attribute tdesc10o.
	 * @return the tdesc10o attribute reference
	 */
	public ElementaryRangeReference getTdesc10oReference() {
		return tdesc10o.getReference();
	}

	/**
	 * Getter for tdesc10o attribute.
	 * @return tdesc10o attribute
	 */
	public String getTdesc10o() {
		return tdesc10o.getValue();
	}

	/**
	 * Setter for tdesc10o attribute.
	 * @param tdesc10o the new value of tdesc10o
	 */
	public void setTdesc10o(String tdesc10o) {
		this.tdesc10o.setValue(tdesc10o);
	}
	/**
	 * Gets the reference for attribute tamt010c.
	 * @return the tamt010c attribute reference
	 */
	public ElementaryRangeReference getTamt010cReference() {
		return tamt010c.getReference();
	}

	/**
	 * Getter for tamt010c attribute.
	 * @return tamt010c attribute
	 */
	public String getTamt010c() {
		return tamt010c.getValue();
	}

	/**
	 * Setter for tamt010c attribute.
	 * @param tamt010c the new value of tamt010c
	 */
	public void setTamt010c(String tamt010c) {
		this.tamt010c.setValue(tamt010c);
	}
	/**
	 * Gets the reference for attribute tamt010p.
	 * @return the tamt010p attribute reference
	 */
	public ElementaryRangeReference getTamt010pReference() {
		return tamt010p.getReference();
	}

	/**
	 * Getter for tamt010p attribute.
	 * @return tamt010p attribute
	 */
	public String getTamt010p() {
		return tamt010p.getValue();
	}

	/**
	 * Setter for tamt010p attribute.
	 * @param tamt010p the new value of tamt010p
	 */
	public void setTamt010p(String tamt010p) {
		this.tamt010p.setValue(tamt010p);
	}
	/**
	 * Gets the reference for attribute tamt010h.
	 * @return the tamt010h attribute reference
	 */
	public ElementaryRangeReference getTamt010hReference() {
		return tamt010h.getReference();
	}

	/**
	 * Getter for tamt010h attribute.
	 * @return tamt010h attribute
	 */
	public String getTamt010h() {
		return tamt010h.getValue();
	}

	/**
	 * Setter for tamt010h attribute.
	 * @param tamt010h the new value of tamt010h
	 */
	public void setTamt010h(String tamt010h) {
		this.tamt010h.setValue(tamt010h);
	}
	/**
	 * Gets the reference for attribute tamt010v.
	 * @return the tamt010v attribute reference
	 */
	public ElementaryRangeReference getTamt010vReference() {
		return tamt010v.getReference();
	}

	/**
	 * Getter for tamt010v attribute.
	 * @return tamt010v attribute
	 */
	public String getTamt010v() {
		return tamt010v.getValue();
	}

	/**
	 * Setter for tamt010v attribute.
	 * @param tamt010v the new value of tamt010v
	 */
	public void setTamt010v(String tamt010v) {
		this.tamt010v.setValue(tamt010v);
	}
	/**
	 * Gets the reference for attribute tamt010o.
	 * @return the tamt010o attribute reference
	 */
	public ElementaryRangeReference getTamt010oReference() {
		return tamt010o.getReference();
	}

	/**
	 * Getter for tamt010o attribute.
	 * @return tamt010o attribute
	 */
	public String getTamt010o() {
		return tamt010o.getValue();
	}

	/**
	 * Setter for tamt010o attribute.
	 * @param tamt010o the new value of tamt010o
	 */
	public void setTamt010o(String tamt010o) {
		this.tamt010o.setValue(tamt010o);
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
