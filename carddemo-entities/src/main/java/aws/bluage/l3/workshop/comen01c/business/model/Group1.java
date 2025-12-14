package aws.bluage.l3.workshop.comen01c.business.model;

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
 * <p>About 'comen1ai' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.Comen1ai
 * <br></p>
 * 
 * <p>About 'comen1ao' field, <br>uml entity: aws.bluage.l3.workshop.comen01c.business.model.Comen1ao
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
	private final Group comen1ai = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(comen1ai,new AlphanumericType(12));
	private final Elementary trnnamel = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union1 = new Union(comen1ai);
	private final Elementary trnnamef = new Elementary(union1,new AlphanumericType(1));
	private final Group group = new Group(union1);
	private final Elementary trnnamea = new Elementary(group,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary trnnamei = new Elementary(comen1ai,new AlphanumericType(4));
	private final Elementary title01l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union2 = new Union(comen1ai);
	private final Elementary title01f = new Elementary(union2,new AlphanumericType(1));
	private final Group group1 = new Group(union2);
	private final Elementary title01a = new Elementary(group1,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary title01i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary curdatel = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union3 = new Union(comen1ai);
	private final Elementary curdatef = new Elementary(union3,new AlphanumericType(1));
	private final Group group2 = new Group(union3);
	private final Elementary curdatea = new Elementary(group2,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary curdatei = new Elementary(comen1ai,new AlphanumericType(8));
	private final Elementary pgmnamel = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union4 = new Union(comen1ai);
	private final Elementary pgmnamef = new Elementary(union4,new AlphanumericType(1));
	private final Group group3 = new Group(union4);
	private final Elementary pgmnamea = new Elementary(group3,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary pgmnamei = new Elementary(comen1ai,new AlphanumericType(8));
	private final Elementary title02l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union5 = new Union(comen1ai);
	private final Elementary title02f = new Elementary(union5,new AlphanumericType(1));
	private final Group group4 = new Group(union5);
	private final Elementary title02a = new Elementary(group4,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary title02i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary curtimel = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union6 = new Union(comen1ai);
	private final Elementary curtimef = new Elementary(union6,new AlphanumericType(1));
	private final Group group5 = new Group(union6);
	private final Elementary curtimea = new Elementary(group5,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary curtimei = new Elementary(comen1ai,new AlphanumericType(8));
	private final Elementary optn001l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union7 = new Union(comen1ai);
	private final Elementary optn001f = new Elementary(union7,new AlphanumericType(1));
	private final Group group6 = new Group(union7);
	private final Elementary optn001a = new Elementary(group6,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn001i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn002l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union8 = new Union(comen1ai);
	private final Elementary optn002f = new Elementary(union8,new AlphanumericType(1));
	private final Group group7 = new Group(union8);
	private final Elementary optn002a = new Elementary(group7,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn002i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn003l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union9 = new Union(comen1ai);
	private final Elementary optn003f = new Elementary(union9,new AlphanumericType(1));
	private final Group group8 = new Group(union9);
	private final Elementary optn003a = new Elementary(group8,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn003i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn004l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union10 = new Union(comen1ai);
	private final Elementary optn004f = new Elementary(union10,new AlphanumericType(1));
	private final Group group9 = new Group(union10);
	private final Elementary optn004a = new Elementary(group9,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler10 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn004i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn005l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union11 = new Union(comen1ai);
	private final Elementary optn005f = new Elementary(union11,new AlphanumericType(1));
	private final Group group10 = new Group(union11);
	private final Elementary optn005a = new Elementary(group10,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler11 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn005i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn006l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union12 = new Union(comen1ai);
	private final Elementary optn006f = new Elementary(union12,new AlphanumericType(1));
	private final Group group11 = new Group(union12);
	private final Elementary optn006a = new Elementary(group11,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler12 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn006i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn007l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union13 = new Union(comen1ai);
	private final Elementary optn007f = new Elementary(union13,new AlphanumericType(1));
	private final Group group12 = new Group(union13);
	private final Elementary optn007a = new Elementary(group12,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler13 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn007i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn008l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union14 = new Union(comen1ai);
	private final Elementary optn008f = new Elementary(union14,new AlphanumericType(1));
	private final Group group13 = new Group(union14);
	private final Elementary optn008a = new Elementary(group13,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler14 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn008i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn009l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union15 = new Union(comen1ai);
	private final Elementary optn009f = new Elementary(union15,new AlphanumericType(1));
	private final Group group14 = new Group(union15);
	private final Elementary optn009a = new Elementary(group14,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler15 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn009i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn010l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union16 = new Union(comen1ai);
	private final Elementary optn010f = new Elementary(union16,new AlphanumericType(1));
	private final Group group15 = new Group(union16);
	private final Elementary optn010a = new Elementary(group15,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler16 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn010i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn011l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union17 = new Union(comen1ai);
	private final Elementary optn011f = new Elementary(union17,new AlphanumericType(1));
	private final Group group16 = new Group(union17);
	private final Elementary optn011a = new Elementary(group16,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler17 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn011i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optn012l = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union18 = new Union(comen1ai);
	private final Elementary optn012f = new Elementary(union18,new AlphanumericType(1));
	private final Group group17 = new Group(union18);
	private final Elementary optn012a = new Elementary(group17,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler18 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optn012i = new Elementary(comen1ai,new AlphanumericType(40));
	private final Elementary optionl = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union19 = new Union(comen1ai);
	private final Elementary optionf = new Elementary(union19,new AlphanumericType(1));
	private final Group group18 = new Group(union19);
	private final Elementary optiona = new Elementary(group18,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler19 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary optioni = new Elementary(comen1ai,new AlphanumericType(2));
	private final Elementary errmsgl = new Elementary(comen1ai,new BinaryType(4, 0, "STD", false, false, true));
	private final Union union20 = new Union(comen1ai);
	private final Elementary errmsgf = new Elementary(union20,new AlphanumericType(1));
	private final Group group19 = new Group(union20);
	private final Elementary errmsga = new Elementary(group19,new AlphanumericType(1));
	@SuppressWarnings("unused")
	private final Filler filler20 = new Filler(comen1ai,new AlphanumericType(4));
	private final Elementary errmsgi = new Elementary(comen1ai,new AlphanumericType(78));
	private final Group comen1ao = new Group(union);
	@SuppressWarnings("unused")
	private final Filler filler21 = new Filler(comen1ao,new AlphanumericType(12));
	@SuppressWarnings("unused")
	private final Filler filler22 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary trnnamec = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary trnnamep = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary trnnameh = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary trnnamev = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary trnnameo = new Elementary(comen1ao,new AlphanumericType(4));
	@SuppressWarnings("unused")
	private final Filler filler23 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary title01c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary title01p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary title01h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary title01v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary title01o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler24 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary curdatec = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary curdatep = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary curdateh = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary curdatev = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary curdateo = new Elementary(comen1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler25 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary pgmnamec = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary pgmnamep = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary pgmnameh = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary pgmnamev = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary pgmnameo = new Elementary(comen1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler26 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary title02c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary title02p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary title02h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary title02v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary title02o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler27 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary curtimec = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary curtimep = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary curtimeh = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary curtimev = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary curtimeo = new Elementary(comen1ao,new AlphanumericType(8));
	@SuppressWarnings("unused")
	private final Filler filler28 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn001c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn001p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn001h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn001v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn001o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler29 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn002c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn002p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn002h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn002v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn002o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler30 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn003c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn003p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn003h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn003v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn003o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler31 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn004c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn004p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn004h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn004v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn004o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler32 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn005c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn005p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn005h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn005v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn005o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler33 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn006c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn006p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn006h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn006v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn006o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler34 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn007c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn007p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn007h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn007v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn007o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler35 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn008c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn008p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn008h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn008v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn008o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler36 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn009c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn009p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn009h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn009v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn009o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler37 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn010c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn010p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn010h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn010v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn010o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler38 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn011c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn011p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn011h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn011v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn011o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler39 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optn012c = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn012p = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn012h = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn012v = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optn012o = new Elementary(comen1ao,new AlphanumericType(40));
	@SuppressWarnings("unused")
	private final Filler filler40 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary optionc = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optionp = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optionh = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optionv = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary optiono = new Elementary(comen1ao,new AlphanumericType(2));
	@SuppressWarnings("unused")
	private final Filler filler41 = new Filler(comen1ao,new AlphanumericType(3));
	private final Elementary errmsgc = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary errmsgp = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary errmsgh = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary errmsgv = new Elementary(comen1ao,new AlphanumericType(1));
	private final Elementary errmsgo = new Elementary(comen1ao,new AlphanumericType(78));
	

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
	 * Gets the reference for attribute comen1ai.
	 * @return the comen1ai attribute reference
	 */
	public RangeReference getComen1aiReference() {
		return comen1ai.getReference();
	}	
				
	/**
	 * Setter for comen1ai .
	 */
   	public void setComen1ai(RangeReference reference) {
       	comen1ai.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute optn001l.
	 * @return the optn001l attribute reference
	 */
	public ElementaryRangeReference getOptn001lReference() {
		return optn001l.getReference();
	}

	/**
	 * Getter for optn001l attribute.
	 * @return optn001l attribute
	 */
	public int getOptn001l() {
		return optn001l.getValue();
	}

	/**
	 * Setter for optn001l attribute.
	 * @param optn001l the new value of optn001l
	 */
	public void setOptn001l(int optn001l) {
		this.optn001l.setValue(optn001l);
	}
	/**
	 * Gets the reference for attribute optn001f.
	 * @return the optn001f attribute reference
	 */
	public ElementaryRangeReference getOptn001fReference() {
		return optn001f.getReference();
	}

	/**
	 * Getter for optn001f attribute.
	 * @return optn001f attribute
	 */
	public String getOptn001f() {
		return optn001f.getValue();
	}

	/**
	 * Setter for optn001f attribute.
	 * @param optn001f the new value of optn001f
	 */
	public void setOptn001f(String optn001f) {
		this.optn001f.setValue(optn001f);
	}
	/**
	 * Gets the reference for attribute optn001a.
	 * @return the optn001a attribute reference
	 */
	public ElementaryRangeReference getOptn001aReference() {
		return optn001a.getReference();
	}

	/**
	 * Getter for optn001a attribute.
	 * @return optn001a attribute
	 */
	public String getOptn001a() {
		return optn001a.getValue();
	}

	/**
	 * Setter for optn001a attribute.
	 * @param optn001a the new value of optn001a
	 */
	public void setOptn001a(String optn001a) {
		this.optn001a.setValue(optn001a);
	}
	/**
	 * Gets the reference for attribute optn001i.
	 * @return the optn001i attribute reference
	 */
	public ElementaryRangeReference getOptn001iReference() {
		return optn001i.getReference();
	}

	/**
	 * Getter for optn001i attribute.
	 * @return optn001i attribute
	 */
	public String getOptn001i() {
		return optn001i.getValue();
	}

	/**
	 * Setter for optn001i attribute.
	 * @param optn001i the new value of optn001i
	 */
	public void setOptn001i(String optn001i) {
		this.optn001i.setValue(optn001i);
	}
	/**
	 * Gets the reference for attribute optn002l.
	 * @return the optn002l attribute reference
	 */
	public ElementaryRangeReference getOptn002lReference() {
		return optn002l.getReference();
	}

	/**
	 * Getter for optn002l attribute.
	 * @return optn002l attribute
	 */
	public int getOptn002l() {
		return optn002l.getValue();
	}

	/**
	 * Setter for optn002l attribute.
	 * @param optn002l the new value of optn002l
	 */
	public void setOptn002l(int optn002l) {
		this.optn002l.setValue(optn002l);
	}
	/**
	 * Gets the reference for attribute optn002f.
	 * @return the optn002f attribute reference
	 */
	public ElementaryRangeReference getOptn002fReference() {
		return optn002f.getReference();
	}

	/**
	 * Getter for optn002f attribute.
	 * @return optn002f attribute
	 */
	public String getOptn002f() {
		return optn002f.getValue();
	}

	/**
	 * Setter for optn002f attribute.
	 * @param optn002f the new value of optn002f
	 */
	public void setOptn002f(String optn002f) {
		this.optn002f.setValue(optn002f);
	}
	/**
	 * Gets the reference for attribute optn002a.
	 * @return the optn002a attribute reference
	 */
	public ElementaryRangeReference getOptn002aReference() {
		return optn002a.getReference();
	}

	/**
	 * Getter for optn002a attribute.
	 * @return optn002a attribute
	 */
	public String getOptn002a() {
		return optn002a.getValue();
	}

	/**
	 * Setter for optn002a attribute.
	 * @param optn002a the new value of optn002a
	 */
	public void setOptn002a(String optn002a) {
		this.optn002a.setValue(optn002a);
	}
	/**
	 * Gets the reference for attribute optn002i.
	 * @return the optn002i attribute reference
	 */
	public ElementaryRangeReference getOptn002iReference() {
		return optn002i.getReference();
	}

	/**
	 * Getter for optn002i attribute.
	 * @return optn002i attribute
	 */
	public String getOptn002i() {
		return optn002i.getValue();
	}

	/**
	 * Setter for optn002i attribute.
	 * @param optn002i the new value of optn002i
	 */
	public void setOptn002i(String optn002i) {
		this.optn002i.setValue(optn002i);
	}
	/**
	 * Gets the reference for attribute optn003l.
	 * @return the optn003l attribute reference
	 */
	public ElementaryRangeReference getOptn003lReference() {
		return optn003l.getReference();
	}

	/**
	 * Getter for optn003l attribute.
	 * @return optn003l attribute
	 */
	public int getOptn003l() {
		return optn003l.getValue();
	}

	/**
	 * Setter for optn003l attribute.
	 * @param optn003l the new value of optn003l
	 */
	public void setOptn003l(int optn003l) {
		this.optn003l.setValue(optn003l);
	}
	/**
	 * Gets the reference for attribute optn003f.
	 * @return the optn003f attribute reference
	 */
	public ElementaryRangeReference getOptn003fReference() {
		return optn003f.getReference();
	}

	/**
	 * Getter for optn003f attribute.
	 * @return optn003f attribute
	 */
	public String getOptn003f() {
		return optn003f.getValue();
	}

	/**
	 * Setter for optn003f attribute.
	 * @param optn003f the new value of optn003f
	 */
	public void setOptn003f(String optn003f) {
		this.optn003f.setValue(optn003f);
	}
	/**
	 * Gets the reference for attribute optn003a.
	 * @return the optn003a attribute reference
	 */
	public ElementaryRangeReference getOptn003aReference() {
		return optn003a.getReference();
	}

	/**
	 * Getter for optn003a attribute.
	 * @return optn003a attribute
	 */
	public String getOptn003a() {
		return optn003a.getValue();
	}

	/**
	 * Setter for optn003a attribute.
	 * @param optn003a the new value of optn003a
	 */
	public void setOptn003a(String optn003a) {
		this.optn003a.setValue(optn003a);
	}
	/**
	 * Gets the reference for attribute optn003i.
	 * @return the optn003i attribute reference
	 */
	public ElementaryRangeReference getOptn003iReference() {
		return optn003i.getReference();
	}

	/**
	 * Getter for optn003i attribute.
	 * @return optn003i attribute
	 */
	public String getOptn003i() {
		return optn003i.getValue();
	}

	/**
	 * Setter for optn003i attribute.
	 * @param optn003i the new value of optn003i
	 */
	public void setOptn003i(String optn003i) {
		this.optn003i.setValue(optn003i);
	}
	/**
	 * Gets the reference for attribute optn004l.
	 * @return the optn004l attribute reference
	 */
	public ElementaryRangeReference getOptn004lReference() {
		return optn004l.getReference();
	}

	/**
	 * Getter for optn004l attribute.
	 * @return optn004l attribute
	 */
	public int getOptn004l() {
		return optn004l.getValue();
	}

	/**
	 * Setter for optn004l attribute.
	 * @param optn004l the new value of optn004l
	 */
	public void setOptn004l(int optn004l) {
		this.optn004l.setValue(optn004l);
	}
	/**
	 * Gets the reference for attribute optn004f.
	 * @return the optn004f attribute reference
	 */
	public ElementaryRangeReference getOptn004fReference() {
		return optn004f.getReference();
	}

	/**
	 * Getter for optn004f attribute.
	 * @return optn004f attribute
	 */
	public String getOptn004f() {
		return optn004f.getValue();
	}

	/**
	 * Setter for optn004f attribute.
	 * @param optn004f the new value of optn004f
	 */
	public void setOptn004f(String optn004f) {
		this.optn004f.setValue(optn004f);
	}
	/**
	 * Gets the reference for attribute optn004a.
	 * @return the optn004a attribute reference
	 */
	public ElementaryRangeReference getOptn004aReference() {
		return optn004a.getReference();
	}

	/**
	 * Getter for optn004a attribute.
	 * @return optn004a attribute
	 */
	public String getOptn004a() {
		return optn004a.getValue();
	}

	/**
	 * Setter for optn004a attribute.
	 * @param optn004a the new value of optn004a
	 */
	public void setOptn004a(String optn004a) {
		this.optn004a.setValue(optn004a);
	}
	/**
	 * Gets the reference for attribute optn004i.
	 * @return the optn004i attribute reference
	 */
	public ElementaryRangeReference getOptn004iReference() {
		return optn004i.getReference();
	}

	/**
	 * Getter for optn004i attribute.
	 * @return optn004i attribute
	 */
	public String getOptn004i() {
		return optn004i.getValue();
	}

	/**
	 * Setter for optn004i attribute.
	 * @param optn004i the new value of optn004i
	 */
	public void setOptn004i(String optn004i) {
		this.optn004i.setValue(optn004i);
	}
	/**
	 * Gets the reference for attribute optn005l.
	 * @return the optn005l attribute reference
	 */
	public ElementaryRangeReference getOptn005lReference() {
		return optn005l.getReference();
	}

	/**
	 * Getter for optn005l attribute.
	 * @return optn005l attribute
	 */
	public int getOptn005l() {
		return optn005l.getValue();
	}

	/**
	 * Setter for optn005l attribute.
	 * @param optn005l the new value of optn005l
	 */
	public void setOptn005l(int optn005l) {
		this.optn005l.setValue(optn005l);
	}
	/**
	 * Gets the reference for attribute optn005f.
	 * @return the optn005f attribute reference
	 */
	public ElementaryRangeReference getOptn005fReference() {
		return optn005f.getReference();
	}

	/**
	 * Getter for optn005f attribute.
	 * @return optn005f attribute
	 */
	public String getOptn005f() {
		return optn005f.getValue();
	}

	/**
	 * Setter for optn005f attribute.
	 * @param optn005f the new value of optn005f
	 */
	public void setOptn005f(String optn005f) {
		this.optn005f.setValue(optn005f);
	}
	/**
	 * Gets the reference for attribute optn005a.
	 * @return the optn005a attribute reference
	 */
	public ElementaryRangeReference getOptn005aReference() {
		return optn005a.getReference();
	}

	/**
	 * Getter for optn005a attribute.
	 * @return optn005a attribute
	 */
	public String getOptn005a() {
		return optn005a.getValue();
	}

	/**
	 * Setter for optn005a attribute.
	 * @param optn005a the new value of optn005a
	 */
	public void setOptn005a(String optn005a) {
		this.optn005a.setValue(optn005a);
	}
	/**
	 * Gets the reference for attribute optn005i.
	 * @return the optn005i attribute reference
	 */
	public ElementaryRangeReference getOptn005iReference() {
		return optn005i.getReference();
	}

	/**
	 * Getter for optn005i attribute.
	 * @return optn005i attribute
	 */
	public String getOptn005i() {
		return optn005i.getValue();
	}

	/**
	 * Setter for optn005i attribute.
	 * @param optn005i the new value of optn005i
	 */
	public void setOptn005i(String optn005i) {
		this.optn005i.setValue(optn005i);
	}
	/**
	 * Gets the reference for attribute optn006l.
	 * @return the optn006l attribute reference
	 */
	public ElementaryRangeReference getOptn006lReference() {
		return optn006l.getReference();
	}

	/**
	 * Getter for optn006l attribute.
	 * @return optn006l attribute
	 */
	public int getOptn006l() {
		return optn006l.getValue();
	}

	/**
	 * Setter for optn006l attribute.
	 * @param optn006l the new value of optn006l
	 */
	public void setOptn006l(int optn006l) {
		this.optn006l.setValue(optn006l);
	}
	/**
	 * Gets the reference for attribute optn006f.
	 * @return the optn006f attribute reference
	 */
	public ElementaryRangeReference getOptn006fReference() {
		return optn006f.getReference();
	}

	/**
	 * Getter for optn006f attribute.
	 * @return optn006f attribute
	 */
	public String getOptn006f() {
		return optn006f.getValue();
	}

	/**
	 * Setter for optn006f attribute.
	 * @param optn006f the new value of optn006f
	 */
	public void setOptn006f(String optn006f) {
		this.optn006f.setValue(optn006f);
	}
	/**
	 * Gets the reference for attribute optn006a.
	 * @return the optn006a attribute reference
	 */
	public ElementaryRangeReference getOptn006aReference() {
		return optn006a.getReference();
	}

	/**
	 * Getter for optn006a attribute.
	 * @return optn006a attribute
	 */
	public String getOptn006a() {
		return optn006a.getValue();
	}

	/**
	 * Setter for optn006a attribute.
	 * @param optn006a the new value of optn006a
	 */
	public void setOptn006a(String optn006a) {
		this.optn006a.setValue(optn006a);
	}
	/**
	 * Gets the reference for attribute optn006i.
	 * @return the optn006i attribute reference
	 */
	public ElementaryRangeReference getOptn006iReference() {
		return optn006i.getReference();
	}

	/**
	 * Getter for optn006i attribute.
	 * @return optn006i attribute
	 */
	public String getOptn006i() {
		return optn006i.getValue();
	}

	/**
	 * Setter for optn006i attribute.
	 * @param optn006i the new value of optn006i
	 */
	public void setOptn006i(String optn006i) {
		this.optn006i.setValue(optn006i);
	}
	/**
	 * Gets the reference for attribute optn007l.
	 * @return the optn007l attribute reference
	 */
	public ElementaryRangeReference getOptn007lReference() {
		return optn007l.getReference();
	}

	/**
	 * Getter for optn007l attribute.
	 * @return optn007l attribute
	 */
	public int getOptn007l() {
		return optn007l.getValue();
	}

	/**
	 * Setter for optn007l attribute.
	 * @param optn007l the new value of optn007l
	 */
	public void setOptn007l(int optn007l) {
		this.optn007l.setValue(optn007l);
	}
	/**
	 * Gets the reference for attribute optn007f.
	 * @return the optn007f attribute reference
	 */
	public ElementaryRangeReference getOptn007fReference() {
		return optn007f.getReference();
	}

	/**
	 * Getter for optn007f attribute.
	 * @return optn007f attribute
	 */
	public String getOptn007f() {
		return optn007f.getValue();
	}

	/**
	 * Setter for optn007f attribute.
	 * @param optn007f the new value of optn007f
	 */
	public void setOptn007f(String optn007f) {
		this.optn007f.setValue(optn007f);
	}
	/**
	 * Gets the reference for attribute optn007a.
	 * @return the optn007a attribute reference
	 */
	public ElementaryRangeReference getOptn007aReference() {
		return optn007a.getReference();
	}

	/**
	 * Getter for optn007a attribute.
	 * @return optn007a attribute
	 */
	public String getOptn007a() {
		return optn007a.getValue();
	}

	/**
	 * Setter for optn007a attribute.
	 * @param optn007a the new value of optn007a
	 */
	public void setOptn007a(String optn007a) {
		this.optn007a.setValue(optn007a);
	}
	/**
	 * Gets the reference for attribute optn007i.
	 * @return the optn007i attribute reference
	 */
	public ElementaryRangeReference getOptn007iReference() {
		return optn007i.getReference();
	}

	/**
	 * Getter for optn007i attribute.
	 * @return optn007i attribute
	 */
	public String getOptn007i() {
		return optn007i.getValue();
	}

	/**
	 * Setter for optn007i attribute.
	 * @param optn007i the new value of optn007i
	 */
	public void setOptn007i(String optn007i) {
		this.optn007i.setValue(optn007i);
	}
	/**
	 * Gets the reference for attribute optn008l.
	 * @return the optn008l attribute reference
	 */
	public ElementaryRangeReference getOptn008lReference() {
		return optn008l.getReference();
	}

	/**
	 * Getter for optn008l attribute.
	 * @return optn008l attribute
	 */
	public int getOptn008l() {
		return optn008l.getValue();
	}

	/**
	 * Setter for optn008l attribute.
	 * @param optn008l the new value of optn008l
	 */
	public void setOptn008l(int optn008l) {
		this.optn008l.setValue(optn008l);
	}
	/**
	 * Gets the reference for attribute optn008f.
	 * @return the optn008f attribute reference
	 */
	public ElementaryRangeReference getOptn008fReference() {
		return optn008f.getReference();
	}

	/**
	 * Getter for optn008f attribute.
	 * @return optn008f attribute
	 */
	public String getOptn008f() {
		return optn008f.getValue();
	}

	/**
	 * Setter for optn008f attribute.
	 * @param optn008f the new value of optn008f
	 */
	public void setOptn008f(String optn008f) {
		this.optn008f.setValue(optn008f);
	}
	/**
	 * Gets the reference for attribute optn008a.
	 * @return the optn008a attribute reference
	 */
	public ElementaryRangeReference getOptn008aReference() {
		return optn008a.getReference();
	}

	/**
	 * Getter for optn008a attribute.
	 * @return optn008a attribute
	 */
	public String getOptn008a() {
		return optn008a.getValue();
	}

	/**
	 * Setter for optn008a attribute.
	 * @param optn008a the new value of optn008a
	 */
	public void setOptn008a(String optn008a) {
		this.optn008a.setValue(optn008a);
	}
	/**
	 * Gets the reference for attribute optn008i.
	 * @return the optn008i attribute reference
	 */
	public ElementaryRangeReference getOptn008iReference() {
		return optn008i.getReference();
	}

	/**
	 * Getter for optn008i attribute.
	 * @return optn008i attribute
	 */
	public String getOptn008i() {
		return optn008i.getValue();
	}

	/**
	 * Setter for optn008i attribute.
	 * @param optn008i the new value of optn008i
	 */
	public void setOptn008i(String optn008i) {
		this.optn008i.setValue(optn008i);
	}
	/**
	 * Gets the reference for attribute optn009l.
	 * @return the optn009l attribute reference
	 */
	public ElementaryRangeReference getOptn009lReference() {
		return optn009l.getReference();
	}

	/**
	 * Getter for optn009l attribute.
	 * @return optn009l attribute
	 */
	public int getOptn009l() {
		return optn009l.getValue();
	}

	/**
	 * Setter for optn009l attribute.
	 * @param optn009l the new value of optn009l
	 */
	public void setOptn009l(int optn009l) {
		this.optn009l.setValue(optn009l);
	}
	/**
	 * Gets the reference for attribute optn009f.
	 * @return the optn009f attribute reference
	 */
	public ElementaryRangeReference getOptn009fReference() {
		return optn009f.getReference();
	}

	/**
	 * Getter for optn009f attribute.
	 * @return optn009f attribute
	 */
	public String getOptn009f() {
		return optn009f.getValue();
	}

	/**
	 * Setter for optn009f attribute.
	 * @param optn009f the new value of optn009f
	 */
	public void setOptn009f(String optn009f) {
		this.optn009f.setValue(optn009f);
	}
	/**
	 * Gets the reference for attribute optn009a.
	 * @return the optn009a attribute reference
	 */
	public ElementaryRangeReference getOptn009aReference() {
		return optn009a.getReference();
	}

	/**
	 * Getter for optn009a attribute.
	 * @return optn009a attribute
	 */
	public String getOptn009a() {
		return optn009a.getValue();
	}

	/**
	 * Setter for optn009a attribute.
	 * @param optn009a the new value of optn009a
	 */
	public void setOptn009a(String optn009a) {
		this.optn009a.setValue(optn009a);
	}
	/**
	 * Gets the reference for attribute optn009i.
	 * @return the optn009i attribute reference
	 */
	public ElementaryRangeReference getOptn009iReference() {
		return optn009i.getReference();
	}

	/**
	 * Getter for optn009i attribute.
	 * @return optn009i attribute
	 */
	public String getOptn009i() {
		return optn009i.getValue();
	}

	/**
	 * Setter for optn009i attribute.
	 * @param optn009i the new value of optn009i
	 */
	public void setOptn009i(String optn009i) {
		this.optn009i.setValue(optn009i);
	}
	/**
	 * Gets the reference for attribute optn010l.
	 * @return the optn010l attribute reference
	 */
	public ElementaryRangeReference getOptn010lReference() {
		return optn010l.getReference();
	}

	/**
	 * Getter for optn010l attribute.
	 * @return optn010l attribute
	 */
	public int getOptn010l() {
		return optn010l.getValue();
	}

	/**
	 * Setter for optn010l attribute.
	 * @param optn010l the new value of optn010l
	 */
	public void setOptn010l(int optn010l) {
		this.optn010l.setValue(optn010l);
	}
	/**
	 * Gets the reference for attribute optn010f.
	 * @return the optn010f attribute reference
	 */
	public ElementaryRangeReference getOptn010fReference() {
		return optn010f.getReference();
	}

	/**
	 * Getter for optn010f attribute.
	 * @return optn010f attribute
	 */
	public String getOptn010f() {
		return optn010f.getValue();
	}

	/**
	 * Setter for optn010f attribute.
	 * @param optn010f the new value of optn010f
	 */
	public void setOptn010f(String optn010f) {
		this.optn010f.setValue(optn010f);
	}
	/**
	 * Gets the reference for attribute optn010a.
	 * @return the optn010a attribute reference
	 */
	public ElementaryRangeReference getOptn010aReference() {
		return optn010a.getReference();
	}

	/**
	 * Getter for optn010a attribute.
	 * @return optn010a attribute
	 */
	public String getOptn010a() {
		return optn010a.getValue();
	}

	/**
	 * Setter for optn010a attribute.
	 * @param optn010a the new value of optn010a
	 */
	public void setOptn010a(String optn010a) {
		this.optn010a.setValue(optn010a);
	}
	/**
	 * Gets the reference for attribute optn010i.
	 * @return the optn010i attribute reference
	 */
	public ElementaryRangeReference getOptn010iReference() {
		return optn010i.getReference();
	}

	/**
	 * Getter for optn010i attribute.
	 * @return optn010i attribute
	 */
	public String getOptn010i() {
		return optn010i.getValue();
	}

	/**
	 * Setter for optn010i attribute.
	 * @param optn010i the new value of optn010i
	 */
	public void setOptn010i(String optn010i) {
		this.optn010i.setValue(optn010i);
	}
	/**
	 * Gets the reference for attribute optn011l.
	 * @return the optn011l attribute reference
	 */
	public ElementaryRangeReference getOptn011lReference() {
		return optn011l.getReference();
	}

	/**
	 * Getter for optn011l attribute.
	 * @return optn011l attribute
	 */
	public int getOptn011l() {
		return optn011l.getValue();
	}

	/**
	 * Setter for optn011l attribute.
	 * @param optn011l the new value of optn011l
	 */
	public void setOptn011l(int optn011l) {
		this.optn011l.setValue(optn011l);
	}
	/**
	 * Gets the reference for attribute optn011f.
	 * @return the optn011f attribute reference
	 */
	public ElementaryRangeReference getOptn011fReference() {
		return optn011f.getReference();
	}

	/**
	 * Getter for optn011f attribute.
	 * @return optn011f attribute
	 */
	public String getOptn011f() {
		return optn011f.getValue();
	}

	/**
	 * Setter for optn011f attribute.
	 * @param optn011f the new value of optn011f
	 */
	public void setOptn011f(String optn011f) {
		this.optn011f.setValue(optn011f);
	}
	/**
	 * Gets the reference for attribute optn011a.
	 * @return the optn011a attribute reference
	 */
	public ElementaryRangeReference getOptn011aReference() {
		return optn011a.getReference();
	}

	/**
	 * Getter for optn011a attribute.
	 * @return optn011a attribute
	 */
	public String getOptn011a() {
		return optn011a.getValue();
	}

	/**
	 * Setter for optn011a attribute.
	 * @param optn011a the new value of optn011a
	 */
	public void setOptn011a(String optn011a) {
		this.optn011a.setValue(optn011a);
	}
	/**
	 * Gets the reference for attribute optn011i.
	 * @return the optn011i attribute reference
	 */
	public ElementaryRangeReference getOptn011iReference() {
		return optn011i.getReference();
	}

	/**
	 * Getter for optn011i attribute.
	 * @return optn011i attribute
	 */
	public String getOptn011i() {
		return optn011i.getValue();
	}

	/**
	 * Setter for optn011i attribute.
	 * @param optn011i the new value of optn011i
	 */
	public void setOptn011i(String optn011i) {
		this.optn011i.setValue(optn011i);
	}
	/**
	 * Gets the reference for attribute optn012l.
	 * @return the optn012l attribute reference
	 */
	public ElementaryRangeReference getOptn012lReference() {
		return optn012l.getReference();
	}

	/**
	 * Getter for optn012l attribute.
	 * @return optn012l attribute
	 */
	public int getOptn012l() {
		return optn012l.getValue();
	}

	/**
	 * Setter for optn012l attribute.
	 * @param optn012l the new value of optn012l
	 */
	public void setOptn012l(int optn012l) {
		this.optn012l.setValue(optn012l);
	}
	/**
	 * Gets the reference for attribute optn012f.
	 * @return the optn012f attribute reference
	 */
	public ElementaryRangeReference getOptn012fReference() {
		return optn012f.getReference();
	}

	/**
	 * Getter for optn012f attribute.
	 * @return optn012f attribute
	 */
	public String getOptn012f() {
		return optn012f.getValue();
	}

	/**
	 * Setter for optn012f attribute.
	 * @param optn012f the new value of optn012f
	 */
	public void setOptn012f(String optn012f) {
		this.optn012f.setValue(optn012f);
	}
	/**
	 * Gets the reference for attribute optn012a.
	 * @return the optn012a attribute reference
	 */
	public ElementaryRangeReference getOptn012aReference() {
		return optn012a.getReference();
	}

	/**
	 * Getter for optn012a attribute.
	 * @return optn012a attribute
	 */
	public String getOptn012a() {
		return optn012a.getValue();
	}

	/**
	 * Setter for optn012a attribute.
	 * @param optn012a the new value of optn012a
	 */
	public void setOptn012a(String optn012a) {
		this.optn012a.setValue(optn012a);
	}
	/**
	 * Gets the reference for attribute optn012i.
	 * @return the optn012i attribute reference
	 */
	public ElementaryRangeReference getOptn012iReference() {
		return optn012i.getReference();
	}

	/**
	 * Getter for optn012i attribute.
	 * @return optn012i attribute
	 */
	public String getOptn012i() {
		return optn012i.getValue();
	}

	/**
	 * Setter for optn012i attribute.
	 * @param optn012i the new value of optn012i
	 */
	public void setOptn012i(String optn012i) {
		this.optn012i.setValue(optn012i);
	}
	/**
	 * Gets the reference for attribute optionl.
	 * @return the optionl attribute reference
	 */
	public ElementaryRangeReference getOptionlReference() {
		return optionl.getReference();
	}

	/**
	 * Getter for optionl attribute.
	 * @return optionl attribute
	 */
	public int getOptionl() {
		return optionl.getValue();
	}

	/**
	 * Setter for optionl attribute.
	 * @param optionl the new value of optionl
	 */
	public void setOptionl(int optionl) {
		this.optionl.setValue(optionl);
	}
	/**
	 * Gets the reference for attribute optionf.
	 * @return the optionf attribute reference
	 */
	public ElementaryRangeReference getOptionfReference() {
		return optionf.getReference();
	}

	/**
	 * Getter for optionf attribute.
	 * @return optionf attribute
	 */
	public String getOptionf() {
		return optionf.getValue();
	}

	/**
	 * Setter for optionf attribute.
	 * @param optionf the new value of optionf
	 */
	public void setOptionf(String optionf) {
		this.optionf.setValue(optionf);
	}
	/**
	 * Gets the reference for attribute optiona.
	 * @return the optiona attribute reference
	 */
	public ElementaryRangeReference getOptionaReference() {
		return optiona.getReference();
	}

	/**
	 * Getter for optiona attribute.
	 * @return optiona attribute
	 */
	public String getOptiona() {
		return optiona.getValue();
	}

	/**
	 * Setter for optiona attribute.
	 * @param optiona the new value of optiona
	 */
	public void setOptiona(String optiona) {
		this.optiona.setValue(optiona);
	}
	/**
	 * Gets the reference for attribute optioni.
	 * @return the optioni attribute reference
	 */
	public ElementaryRangeReference getOptioniReference() {
		return optioni.getReference();
	}

	/**
	 * Getter for optioni attribute.
	 * @return optioni attribute
	 */
	public String getOptioni() {
		return optioni.getValue();
	}

	/**
	 * Setter for optioni attribute.
	 * @param optioni the new value of optioni
	 */
	public void setOptioni(String optioni) {
		this.optioni.setValue(optioni);
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
	 * Gets the reference for attribute comen1ao.
	 * @return the comen1ao attribute reference
	 */
	public RangeReference getComen1aoReference() {
		return comen1ao.getReference();
	}	
				
	/**
	 * Setter for comen1ao .
	 */
   	public void setComen1ao(RangeReference reference) {
       	comen1ao.getReference().setBytes(reference.getBytes());
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
	 * Gets the reference for attribute optn001c.
	 * @return the optn001c attribute reference
	 */
	public ElementaryRangeReference getOptn001cReference() {
		return optn001c.getReference();
	}

	/**
	 * Getter for optn001c attribute.
	 * @return optn001c attribute
	 */
	public String getOptn001c() {
		return optn001c.getValue();
	}

	/**
	 * Setter for optn001c attribute.
	 * @param optn001c the new value of optn001c
	 */
	public void setOptn001c(String optn001c) {
		this.optn001c.setValue(optn001c);
	}
	/**
	 * Gets the reference for attribute optn001p.
	 * @return the optn001p attribute reference
	 */
	public ElementaryRangeReference getOptn001pReference() {
		return optn001p.getReference();
	}

	/**
	 * Getter for optn001p attribute.
	 * @return optn001p attribute
	 */
	public String getOptn001p() {
		return optn001p.getValue();
	}

	/**
	 * Setter for optn001p attribute.
	 * @param optn001p the new value of optn001p
	 */
	public void setOptn001p(String optn001p) {
		this.optn001p.setValue(optn001p);
	}
	/**
	 * Gets the reference for attribute optn001h.
	 * @return the optn001h attribute reference
	 */
	public ElementaryRangeReference getOptn001hReference() {
		return optn001h.getReference();
	}

	/**
	 * Getter for optn001h attribute.
	 * @return optn001h attribute
	 */
	public String getOptn001h() {
		return optn001h.getValue();
	}

	/**
	 * Setter for optn001h attribute.
	 * @param optn001h the new value of optn001h
	 */
	public void setOptn001h(String optn001h) {
		this.optn001h.setValue(optn001h);
	}
	/**
	 * Gets the reference for attribute optn001v.
	 * @return the optn001v attribute reference
	 */
	public ElementaryRangeReference getOptn001vReference() {
		return optn001v.getReference();
	}

	/**
	 * Getter for optn001v attribute.
	 * @return optn001v attribute
	 */
	public String getOptn001v() {
		return optn001v.getValue();
	}

	/**
	 * Setter for optn001v attribute.
	 * @param optn001v the new value of optn001v
	 */
	public void setOptn001v(String optn001v) {
		this.optn001v.setValue(optn001v);
	}
	/**
	 * Gets the reference for attribute optn001o.
	 * @return the optn001o attribute reference
	 */
	public ElementaryRangeReference getOptn001oReference() {
		return optn001o.getReference();
	}

	/**
	 * Getter for optn001o attribute.
	 * @return optn001o attribute
	 */
	public String getOptn001o() {
		return optn001o.getValue();
	}

	/**
	 * Setter for optn001o attribute.
	 * @param optn001o the new value of optn001o
	 */
	public void setOptn001o(String optn001o) {
		this.optn001o.setValue(optn001o);
	}
	/**
	 * Gets the reference for attribute optn002c.
	 * @return the optn002c attribute reference
	 */
	public ElementaryRangeReference getOptn002cReference() {
		return optn002c.getReference();
	}

	/**
	 * Getter for optn002c attribute.
	 * @return optn002c attribute
	 */
	public String getOptn002c() {
		return optn002c.getValue();
	}

	/**
	 * Setter for optn002c attribute.
	 * @param optn002c the new value of optn002c
	 */
	public void setOptn002c(String optn002c) {
		this.optn002c.setValue(optn002c);
	}
	/**
	 * Gets the reference for attribute optn002p.
	 * @return the optn002p attribute reference
	 */
	public ElementaryRangeReference getOptn002pReference() {
		return optn002p.getReference();
	}

	/**
	 * Getter for optn002p attribute.
	 * @return optn002p attribute
	 */
	public String getOptn002p() {
		return optn002p.getValue();
	}

	/**
	 * Setter for optn002p attribute.
	 * @param optn002p the new value of optn002p
	 */
	public void setOptn002p(String optn002p) {
		this.optn002p.setValue(optn002p);
	}
	/**
	 * Gets the reference for attribute optn002h.
	 * @return the optn002h attribute reference
	 */
	public ElementaryRangeReference getOptn002hReference() {
		return optn002h.getReference();
	}

	/**
	 * Getter for optn002h attribute.
	 * @return optn002h attribute
	 */
	public String getOptn002h() {
		return optn002h.getValue();
	}

	/**
	 * Setter for optn002h attribute.
	 * @param optn002h the new value of optn002h
	 */
	public void setOptn002h(String optn002h) {
		this.optn002h.setValue(optn002h);
	}
	/**
	 * Gets the reference for attribute optn002v.
	 * @return the optn002v attribute reference
	 */
	public ElementaryRangeReference getOptn002vReference() {
		return optn002v.getReference();
	}

	/**
	 * Getter for optn002v attribute.
	 * @return optn002v attribute
	 */
	public String getOptn002v() {
		return optn002v.getValue();
	}

	/**
	 * Setter for optn002v attribute.
	 * @param optn002v the new value of optn002v
	 */
	public void setOptn002v(String optn002v) {
		this.optn002v.setValue(optn002v);
	}
	/**
	 * Gets the reference for attribute optn002o.
	 * @return the optn002o attribute reference
	 */
	public ElementaryRangeReference getOptn002oReference() {
		return optn002o.getReference();
	}

	/**
	 * Getter for optn002o attribute.
	 * @return optn002o attribute
	 */
	public String getOptn002o() {
		return optn002o.getValue();
	}

	/**
	 * Setter for optn002o attribute.
	 * @param optn002o the new value of optn002o
	 */
	public void setOptn002o(String optn002o) {
		this.optn002o.setValue(optn002o);
	}
	/**
	 * Gets the reference for attribute optn003c.
	 * @return the optn003c attribute reference
	 */
	public ElementaryRangeReference getOptn003cReference() {
		return optn003c.getReference();
	}

	/**
	 * Getter for optn003c attribute.
	 * @return optn003c attribute
	 */
	public String getOptn003c() {
		return optn003c.getValue();
	}

	/**
	 * Setter for optn003c attribute.
	 * @param optn003c the new value of optn003c
	 */
	public void setOptn003c(String optn003c) {
		this.optn003c.setValue(optn003c);
	}
	/**
	 * Gets the reference for attribute optn003p.
	 * @return the optn003p attribute reference
	 */
	public ElementaryRangeReference getOptn003pReference() {
		return optn003p.getReference();
	}

	/**
	 * Getter for optn003p attribute.
	 * @return optn003p attribute
	 */
	public String getOptn003p() {
		return optn003p.getValue();
	}

	/**
	 * Setter for optn003p attribute.
	 * @param optn003p the new value of optn003p
	 */
	public void setOptn003p(String optn003p) {
		this.optn003p.setValue(optn003p);
	}
	/**
	 * Gets the reference for attribute optn003h.
	 * @return the optn003h attribute reference
	 */
	public ElementaryRangeReference getOptn003hReference() {
		return optn003h.getReference();
	}

	/**
	 * Getter for optn003h attribute.
	 * @return optn003h attribute
	 */
	public String getOptn003h() {
		return optn003h.getValue();
	}

	/**
	 * Setter for optn003h attribute.
	 * @param optn003h the new value of optn003h
	 */
	public void setOptn003h(String optn003h) {
		this.optn003h.setValue(optn003h);
	}
	/**
	 * Gets the reference for attribute optn003v.
	 * @return the optn003v attribute reference
	 */
	public ElementaryRangeReference getOptn003vReference() {
		return optn003v.getReference();
	}

	/**
	 * Getter for optn003v attribute.
	 * @return optn003v attribute
	 */
	public String getOptn003v() {
		return optn003v.getValue();
	}

	/**
	 * Setter for optn003v attribute.
	 * @param optn003v the new value of optn003v
	 */
	public void setOptn003v(String optn003v) {
		this.optn003v.setValue(optn003v);
	}
	/**
	 * Gets the reference for attribute optn003o.
	 * @return the optn003o attribute reference
	 */
	public ElementaryRangeReference getOptn003oReference() {
		return optn003o.getReference();
	}

	/**
	 * Getter for optn003o attribute.
	 * @return optn003o attribute
	 */
	public String getOptn003o() {
		return optn003o.getValue();
	}

	/**
	 * Setter for optn003o attribute.
	 * @param optn003o the new value of optn003o
	 */
	public void setOptn003o(String optn003o) {
		this.optn003o.setValue(optn003o);
	}
	/**
	 * Gets the reference for attribute optn004c.
	 * @return the optn004c attribute reference
	 */
	public ElementaryRangeReference getOptn004cReference() {
		return optn004c.getReference();
	}

	/**
	 * Getter for optn004c attribute.
	 * @return optn004c attribute
	 */
	public String getOptn004c() {
		return optn004c.getValue();
	}

	/**
	 * Setter for optn004c attribute.
	 * @param optn004c the new value of optn004c
	 */
	public void setOptn004c(String optn004c) {
		this.optn004c.setValue(optn004c);
	}
	/**
	 * Gets the reference for attribute optn004p.
	 * @return the optn004p attribute reference
	 */
	public ElementaryRangeReference getOptn004pReference() {
		return optn004p.getReference();
	}

	/**
	 * Getter for optn004p attribute.
	 * @return optn004p attribute
	 */
	public String getOptn004p() {
		return optn004p.getValue();
	}

	/**
	 * Setter for optn004p attribute.
	 * @param optn004p the new value of optn004p
	 */
	public void setOptn004p(String optn004p) {
		this.optn004p.setValue(optn004p);
	}
	/**
	 * Gets the reference for attribute optn004h.
	 * @return the optn004h attribute reference
	 */
	public ElementaryRangeReference getOptn004hReference() {
		return optn004h.getReference();
	}

	/**
	 * Getter for optn004h attribute.
	 * @return optn004h attribute
	 */
	public String getOptn004h() {
		return optn004h.getValue();
	}

	/**
	 * Setter for optn004h attribute.
	 * @param optn004h the new value of optn004h
	 */
	public void setOptn004h(String optn004h) {
		this.optn004h.setValue(optn004h);
	}
	/**
	 * Gets the reference for attribute optn004v.
	 * @return the optn004v attribute reference
	 */
	public ElementaryRangeReference getOptn004vReference() {
		return optn004v.getReference();
	}

	/**
	 * Getter for optn004v attribute.
	 * @return optn004v attribute
	 */
	public String getOptn004v() {
		return optn004v.getValue();
	}

	/**
	 * Setter for optn004v attribute.
	 * @param optn004v the new value of optn004v
	 */
	public void setOptn004v(String optn004v) {
		this.optn004v.setValue(optn004v);
	}
	/**
	 * Gets the reference for attribute optn004o.
	 * @return the optn004o attribute reference
	 */
	public ElementaryRangeReference getOptn004oReference() {
		return optn004o.getReference();
	}

	/**
	 * Getter for optn004o attribute.
	 * @return optn004o attribute
	 */
	public String getOptn004o() {
		return optn004o.getValue();
	}

	/**
	 * Setter for optn004o attribute.
	 * @param optn004o the new value of optn004o
	 */
	public void setOptn004o(String optn004o) {
		this.optn004o.setValue(optn004o);
	}
	/**
	 * Gets the reference for attribute optn005c.
	 * @return the optn005c attribute reference
	 */
	public ElementaryRangeReference getOptn005cReference() {
		return optn005c.getReference();
	}

	/**
	 * Getter for optn005c attribute.
	 * @return optn005c attribute
	 */
	public String getOptn005c() {
		return optn005c.getValue();
	}

	/**
	 * Setter for optn005c attribute.
	 * @param optn005c the new value of optn005c
	 */
	public void setOptn005c(String optn005c) {
		this.optn005c.setValue(optn005c);
	}
	/**
	 * Gets the reference for attribute optn005p.
	 * @return the optn005p attribute reference
	 */
	public ElementaryRangeReference getOptn005pReference() {
		return optn005p.getReference();
	}

	/**
	 * Getter for optn005p attribute.
	 * @return optn005p attribute
	 */
	public String getOptn005p() {
		return optn005p.getValue();
	}

	/**
	 * Setter for optn005p attribute.
	 * @param optn005p the new value of optn005p
	 */
	public void setOptn005p(String optn005p) {
		this.optn005p.setValue(optn005p);
	}
	/**
	 * Gets the reference for attribute optn005h.
	 * @return the optn005h attribute reference
	 */
	public ElementaryRangeReference getOptn005hReference() {
		return optn005h.getReference();
	}

	/**
	 * Getter for optn005h attribute.
	 * @return optn005h attribute
	 */
	public String getOptn005h() {
		return optn005h.getValue();
	}

	/**
	 * Setter for optn005h attribute.
	 * @param optn005h the new value of optn005h
	 */
	public void setOptn005h(String optn005h) {
		this.optn005h.setValue(optn005h);
	}
	/**
	 * Gets the reference for attribute optn005v.
	 * @return the optn005v attribute reference
	 */
	public ElementaryRangeReference getOptn005vReference() {
		return optn005v.getReference();
	}

	/**
	 * Getter for optn005v attribute.
	 * @return optn005v attribute
	 */
	public String getOptn005v() {
		return optn005v.getValue();
	}

	/**
	 * Setter for optn005v attribute.
	 * @param optn005v the new value of optn005v
	 */
	public void setOptn005v(String optn005v) {
		this.optn005v.setValue(optn005v);
	}
	/**
	 * Gets the reference for attribute optn005o.
	 * @return the optn005o attribute reference
	 */
	public ElementaryRangeReference getOptn005oReference() {
		return optn005o.getReference();
	}

	/**
	 * Getter for optn005o attribute.
	 * @return optn005o attribute
	 */
	public String getOptn005o() {
		return optn005o.getValue();
	}

	/**
	 * Setter for optn005o attribute.
	 * @param optn005o the new value of optn005o
	 */
	public void setOptn005o(String optn005o) {
		this.optn005o.setValue(optn005o);
	}
	/**
	 * Gets the reference for attribute optn006c.
	 * @return the optn006c attribute reference
	 */
	public ElementaryRangeReference getOptn006cReference() {
		return optn006c.getReference();
	}

	/**
	 * Getter for optn006c attribute.
	 * @return optn006c attribute
	 */
	public String getOptn006c() {
		return optn006c.getValue();
	}

	/**
	 * Setter for optn006c attribute.
	 * @param optn006c the new value of optn006c
	 */
	public void setOptn006c(String optn006c) {
		this.optn006c.setValue(optn006c);
	}
	/**
	 * Gets the reference for attribute optn006p.
	 * @return the optn006p attribute reference
	 */
	public ElementaryRangeReference getOptn006pReference() {
		return optn006p.getReference();
	}

	/**
	 * Getter for optn006p attribute.
	 * @return optn006p attribute
	 */
	public String getOptn006p() {
		return optn006p.getValue();
	}

	/**
	 * Setter for optn006p attribute.
	 * @param optn006p the new value of optn006p
	 */
	public void setOptn006p(String optn006p) {
		this.optn006p.setValue(optn006p);
	}
	/**
	 * Gets the reference for attribute optn006h.
	 * @return the optn006h attribute reference
	 */
	public ElementaryRangeReference getOptn006hReference() {
		return optn006h.getReference();
	}

	/**
	 * Getter for optn006h attribute.
	 * @return optn006h attribute
	 */
	public String getOptn006h() {
		return optn006h.getValue();
	}

	/**
	 * Setter for optn006h attribute.
	 * @param optn006h the new value of optn006h
	 */
	public void setOptn006h(String optn006h) {
		this.optn006h.setValue(optn006h);
	}
	/**
	 * Gets the reference for attribute optn006v.
	 * @return the optn006v attribute reference
	 */
	public ElementaryRangeReference getOptn006vReference() {
		return optn006v.getReference();
	}

	/**
	 * Getter for optn006v attribute.
	 * @return optn006v attribute
	 */
	public String getOptn006v() {
		return optn006v.getValue();
	}

	/**
	 * Setter for optn006v attribute.
	 * @param optn006v the new value of optn006v
	 */
	public void setOptn006v(String optn006v) {
		this.optn006v.setValue(optn006v);
	}
	/**
	 * Gets the reference for attribute optn006o.
	 * @return the optn006o attribute reference
	 */
	public ElementaryRangeReference getOptn006oReference() {
		return optn006o.getReference();
	}

	/**
	 * Getter for optn006o attribute.
	 * @return optn006o attribute
	 */
	public String getOptn006o() {
		return optn006o.getValue();
	}

	/**
	 * Setter for optn006o attribute.
	 * @param optn006o the new value of optn006o
	 */
	public void setOptn006o(String optn006o) {
		this.optn006o.setValue(optn006o);
	}
	/**
	 * Gets the reference for attribute optn007c.
	 * @return the optn007c attribute reference
	 */
	public ElementaryRangeReference getOptn007cReference() {
		return optn007c.getReference();
	}

	/**
	 * Getter for optn007c attribute.
	 * @return optn007c attribute
	 */
	public String getOptn007c() {
		return optn007c.getValue();
	}

	/**
	 * Setter for optn007c attribute.
	 * @param optn007c the new value of optn007c
	 */
	public void setOptn007c(String optn007c) {
		this.optn007c.setValue(optn007c);
	}
	/**
	 * Gets the reference for attribute optn007p.
	 * @return the optn007p attribute reference
	 */
	public ElementaryRangeReference getOptn007pReference() {
		return optn007p.getReference();
	}

	/**
	 * Getter for optn007p attribute.
	 * @return optn007p attribute
	 */
	public String getOptn007p() {
		return optn007p.getValue();
	}

	/**
	 * Setter for optn007p attribute.
	 * @param optn007p the new value of optn007p
	 */
	public void setOptn007p(String optn007p) {
		this.optn007p.setValue(optn007p);
	}
	/**
	 * Gets the reference for attribute optn007h.
	 * @return the optn007h attribute reference
	 */
	public ElementaryRangeReference getOptn007hReference() {
		return optn007h.getReference();
	}

	/**
	 * Getter for optn007h attribute.
	 * @return optn007h attribute
	 */
	public String getOptn007h() {
		return optn007h.getValue();
	}

	/**
	 * Setter for optn007h attribute.
	 * @param optn007h the new value of optn007h
	 */
	public void setOptn007h(String optn007h) {
		this.optn007h.setValue(optn007h);
	}
	/**
	 * Gets the reference for attribute optn007v.
	 * @return the optn007v attribute reference
	 */
	public ElementaryRangeReference getOptn007vReference() {
		return optn007v.getReference();
	}

	/**
	 * Getter for optn007v attribute.
	 * @return optn007v attribute
	 */
	public String getOptn007v() {
		return optn007v.getValue();
	}

	/**
	 * Setter for optn007v attribute.
	 * @param optn007v the new value of optn007v
	 */
	public void setOptn007v(String optn007v) {
		this.optn007v.setValue(optn007v);
	}
	/**
	 * Gets the reference for attribute optn007o.
	 * @return the optn007o attribute reference
	 */
	public ElementaryRangeReference getOptn007oReference() {
		return optn007o.getReference();
	}

	/**
	 * Getter for optn007o attribute.
	 * @return optn007o attribute
	 */
	public String getOptn007o() {
		return optn007o.getValue();
	}

	/**
	 * Setter for optn007o attribute.
	 * @param optn007o the new value of optn007o
	 */
	public void setOptn007o(String optn007o) {
		this.optn007o.setValue(optn007o);
	}
	/**
	 * Gets the reference for attribute optn008c.
	 * @return the optn008c attribute reference
	 */
	public ElementaryRangeReference getOptn008cReference() {
		return optn008c.getReference();
	}

	/**
	 * Getter for optn008c attribute.
	 * @return optn008c attribute
	 */
	public String getOptn008c() {
		return optn008c.getValue();
	}

	/**
	 * Setter for optn008c attribute.
	 * @param optn008c the new value of optn008c
	 */
	public void setOptn008c(String optn008c) {
		this.optn008c.setValue(optn008c);
	}
	/**
	 * Gets the reference for attribute optn008p.
	 * @return the optn008p attribute reference
	 */
	public ElementaryRangeReference getOptn008pReference() {
		return optn008p.getReference();
	}

	/**
	 * Getter for optn008p attribute.
	 * @return optn008p attribute
	 */
	public String getOptn008p() {
		return optn008p.getValue();
	}

	/**
	 * Setter for optn008p attribute.
	 * @param optn008p the new value of optn008p
	 */
	public void setOptn008p(String optn008p) {
		this.optn008p.setValue(optn008p);
	}
	/**
	 * Gets the reference for attribute optn008h.
	 * @return the optn008h attribute reference
	 */
	public ElementaryRangeReference getOptn008hReference() {
		return optn008h.getReference();
	}

	/**
	 * Getter for optn008h attribute.
	 * @return optn008h attribute
	 */
	public String getOptn008h() {
		return optn008h.getValue();
	}

	/**
	 * Setter for optn008h attribute.
	 * @param optn008h the new value of optn008h
	 */
	public void setOptn008h(String optn008h) {
		this.optn008h.setValue(optn008h);
	}
	/**
	 * Gets the reference for attribute optn008v.
	 * @return the optn008v attribute reference
	 */
	public ElementaryRangeReference getOptn008vReference() {
		return optn008v.getReference();
	}

	/**
	 * Getter for optn008v attribute.
	 * @return optn008v attribute
	 */
	public String getOptn008v() {
		return optn008v.getValue();
	}

	/**
	 * Setter for optn008v attribute.
	 * @param optn008v the new value of optn008v
	 */
	public void setOptn008v(String optn008v) {
		this.optn008v.setValue(optn008v);
	}
	/**
	 * Gets the reference for attribute optn008o.
	 * @return the optn008o attribute reference
	 */
	public ElementaryRangeReference getOptn008oReference() {
		return optn008o.getReference();
	}

	/**
	 * Getter for optn008o attribute.
	 * @return optn008o attribute
	 */
	public String getOptn008o() {
		return optn008o.getValue();
	}

	/**
	 * Setter for optn008o attribute.
	 * @param optn008o the new value of optn008o
	 */
	public void setOptn008o(String optn008o) {
		this.optn008o.setValue(optn008o);
	}
	/**
	 * Gets the reference for attribute optn009c.
	 * @return the optn009c attribute reference
	 */
	public ElementaryRangeReference getOptn009cReference() {
		return optn009c.getReference();
	}

	/**
	 * Getter for optn009c attribute.
	 * @return optn009c attribute
	 */
	public String getOptn009c() {
		return optn009c.getValue();
	}

	/**
	 * Setter for optn009c attribute.
	 * @param optn009c the new value of optn009c
	 */
	public void setOptn009c(String optn009c) {
		this.optn009c.setValue(optn009c);
	}
	/**
	 * Gets the reference for attribute optn009p.
	 * @return the optn009p attribute reference
	 */
	public ElementaryRangeReference getOptn009pReference() {
		return optn009p.getReference();
	}

	/**
	 * Getter for optn009p attribute.
	 * @return optn009p attribute
	 */
	public String getOptn009p() {
		return optn009p.getValue();
	}

	/**
	 * Setter for optn009p attribute.
	 * @param optn009p the new value of optn009p
	 */
	public void setOptn009p(String optn009p) {
		this.optn009p.setValue(optn009p);
	}
	/**
	 * Gets the reference for attribute optn009h.
	 * @return the optn009h attribute reference
	 */
	public ElementaryRangeReference getOptn009hReference() {
		return optn009h.getReference();
	}

	/**
	 * Getter for optn009h attribute.
	 * @return optn009h attribute
	 */
	public String getOptn009h() {
		return optn009h.getValue();
	}

	/**
	 * Setter for optn009h attribute.
	 * @param optn009h the new value of optn009h
	 */
	public void setOptn009h(String optn009h) {
		this.optn009h.setValue(optn009h);
	}
	/**
	 * Gets the reference for attribute optn009v.
	 * @return the optn009v attribute reference
	 */
	public ElementaryRangeReference getOptn009vReference() {
		return optn009v.getReference();
	}

	/**
	 * Getter for optn009v attribute.
	 * @return optn009v attribute
	 */
	public String getOptn009v() {
		return optn009v.getValue();
	}

	/**
	 * Setter for optn009v attribute.
	 * @param optn009v the new value of optn009v
	 */
	public void setOptn009v(String optn009v) {
		this.optn009v.setValue(optn009v);
	}
	/**
	 * Gets the reference for attribute optn009o.
	 * @return the optn009o attribute reference
	 */
	public ElementaryRangeReference getOptn009oReference() {
		return optn009o.getReference();
	}

	/**
	 * Getter for optn009o attribute.
	 * @return optn009o attribute
	 */
	public String getOptn009o() {
		return optn009o.getValue();
	}

	/**
	 * Setter for optn009o attribute.
	 * @param optn009o the new value of optn009o
	 */
	public void setOptn009o(String optn009o) {
		this.optn009o.setValue(optn009o);
	}
	/**
	 * Gets the reference for attribute optn010c.
	 * @return the optn010c attribute reference
	 */
	public ElementaryRangeReference getOptn010cReference() {
		return optn010c.getReference();
	}

	/**
	 * Getter for optn010c attribute.
	 * @return optn010c attribute
	 */
	public String getOptn010c() {
		return optn010c.getValue();
	}

	/**
	 * Setter for optn010c attribute.
	 * @param optn010c the new value of optn010c
	 */
	public void setOptn010c(String optn010c) {
		this.optn010c.setValue(optn010c);
	}
	/**
	 * Gets the reference for attribute optn010p.
	 * @return the optn010p attribute reference
	 */
	public ElementaryRangeReference getOptn010pReference() {
		return optn010p.getReference();
	}

	/**
	 * Getter for optn010p attribute.
	 * @return optn010p attribute
	 */
	public String getOptn010p() {
		return optn010p.getValue();
	}

	/**
	 * Setter for optn010p attribute.
	 * @param optn010p the new value of optn010p
	 */
	public void setOptn010p(String optn010p) {
		this.optn010p.setValue(optn010p);
	}
	/**
	 * Gets the reference for attribute optn010h.
	 * @return the optn010h attribute reference
	 */
	public ElementaryRangeReference getOptn010hReference() {
		return optn010h.getReference();
	}

	/**
	 * Getter for optn010h attribute.
	 * @return optn010h attribute
	 */
	public String getOptn010h() {
		return optn010h.getValue();
	}

	/**
	 * Setter for optn010h attribute.
	 * @param optn010h the new value of optn010h
	 */
	public void setOptn010h(String optn010h) {
		this.optn010h.setValue(optn010h);
	}
	/**
	 * Gets the reference for attribute optn010v.
	 * @return the optn010v attribute reference
	 */
	public ElementaryRangeReference getOptn010vReference() {
		return optn010v.getReference();
	}

	/**
	 * Getter for optn010v attribute.
	 * @return optn010v attribute
	 */
	public String getOptn010v() {
		return optn010v.getValue();
	}

	/**
	 * Setter for optn010v attribute.
	 * @param optn010v the new value of optn010v
	 */
	public void setOptn010v(String optn010v) {
		this.optn010v.setValue(optn010v);
	}
	/**
	 * Gets the reference for attribute optn010o.
	 * @return the optn010o attribute reference
	 */
	public ElementaryRangeReference getOptn010oReference() {
		return optn010o.getReference();
	}

	/**
	 * Getter for optn010o attribute.
	 * @return optn010o attribute
	 */
	public String getOptn010o() {
		return optn010o.getValue();
	}

	/**
	 * Setter for optn010o attribute.
	 * @param optn010o the new value of optn010o
	 */
	public void setOptn010o(String optn010o) {
		this.optn010o.setValue(optn010o);
	}
	/**
	 * Gets the reference for attribute optn011c.
	 * @return the optn011c attribute reference
	 */
	public ElementaryRangeReference getOptn011cReference() {
		return optn011c.getReference();
	}

	/**
	 * Getter for optn011c attribute.
	 * @return optn011c attribute
	 */
	public String getOptn011c() {
		return optn011c.getValue();
	}

	/**
	 * Setter for optn011c attribute.
	 * @param optn011c the new value of optn011c
	 */
	public void setOptn011c(String optn011c) {
		this.optn011c.setValue(optn011c);
	}
	/**
	 * Gets the reference for attribute optn011p.
	 * @return the optn011p attribute reference
	 */
	public ElementaryRangeReference getOptn011pReference() {
		return optn011p.getReference();
	}

	/**
	 * Getter for optn011p attribute.
	 * @return optn011p attribute
	 */
	public String getOptn011p() {
		return optn011p.getValue();
	}

	/**
	 * Setter for optn011p attribute.
	 * @param optn011p the new value of optn011p
	 */
	public void setOptn011p(String optn011p) {
		this.optn011p.setValue(optn011p);
	}
	/**
	 * Gets the reference for attribute optn011h.
	 * @return the optn011h attribute reference
	 */
	public ElementaryRangeReference getOptn011hReference() {
		return optn011h.getReference();
	}

	/**
	 * Getter for optn011h attribute.
	 * @return optn011h attribute
	 */
	public String getOptn011h() {
		return optn011h.getValue();
	}

	/**
	 * Setter for optn011h attribute.
	 * @param optn011h the new value of optn011h
	 */
	public void setOptn011h(String optn011h) {
		this.optn011h.setValue(optn011h);
	}
	/**
	 * Gets the reference for attribute optn011v.
	 * @return the optn011v attribute reference
	 */
	public ElementaryRangeReference getOptn011vReference() {
		return optn011v.getReference();
	}

	/**
	 * Getter for optn011v attribute.
	 * @return optn011v attribute
	 */
	public String getOptn011v() {
		return optn011v.getValue();
	}

	/**
	 * Setter for optn011v attribute.
	 * @param optn011v the new value of optn011v
	 */
	public void setOptn011v(String optn011v) {
		this.optn011v.setValue(optn011v);
	}
	/**
	 * Gets the reference for attribute optn011o.
	 * @return the optn011o attribute reference
	 */
	public ElementaryRangeReference getOptn011oReference() {
		return optn011o.getReference();
	}

	/**
	 * Getter for optn011o attribute.
	 * @return optn011o attribute
	 */
	public String getOptn011o() {
		return optn011o.getValue();
	}

	/**
	 * Setter for optn011o attribute.
	 * @param optn011o the new value of optn011o
	 */
	public void setOptn011o(String optn011o) {
		this.optn011o.setValue(optn011o);
	}
	/**
	 * Gets the reference for attribute optn012c.
	 * @return the optn012c attribute reference
	 */
	public ElementaryRangeReference getOptn012cReference() {
		return optn012c.getReference();
	}

	/**
	 * Getter for optn012c attribute.
	 * @return optn012c attribute
	 */
	public String getOptn012c() {
		return optn012c.getValue();
	}

	/**
	 * Setter for optn012c attribute.
	 * @param optn012c the new value of optn012c
	 */
	public void setOptn012c(String optn012c) {
		this.optn012c.setValue(optn012c);
	}
	/**
	 * Gets the reference for attribute optn012p.
	 * @return the optn012p attribute reference
	 */
	public ElementaryRangeReference getOptn012pReference() {
		return optn012p.getReference();
	}

	/**
	 * Getter for optn012p attribute.
	 * @return optn012p attribute
	 */
	public String getOptn012p() {
		return optn012p.getValue();
	}

	/**
	 * Setter for optn012p attribute.
	 * @param optn012p the new value of optn012p
	 */
	public void setOptn012p(String optn012p) {
		this.optn012p.setValue(optn012p);
	}
	/**
	 * Gets the reference for attribute optn012h.
	 * @return the optn012h attribute reference
	 */
	public ElementaryRangeReference getOptn012hReference() {
		return optn012h.getReference();
	}

	/**
	 * Getter for optn012h attribute.
	 * @return optn012h attribute
	 */
	public String getOptn012h() {
		return optn012h.getValue();
	}

	/**
	 * Setter for optn012h attribute.
	 * @param optn012h the new value of optn012h
	 */
	public void setOptn012h(String optn012h) {
		this.optn012h.setValue(optn012h);
	}
	/**
	 * Gets the reference for attribute optn012v.
	 * @return the optn012v attribute reference
	 */
	public ElementaryRangeReference getOptn012vReference() {
		return optn012v.getReference();
	}

	/**
	 * Getter for optn012v attribute.
	 * @return optn012v attribute
	 */
	public String getOptn012v() {
		return optn012v.getValue();
	}

	/**
	 * Setter for optn012v attribute.
	 * @param optn012v the new value of optn012v
	 */
	public void setOptn012v(String optn012v) {
		this.optn012v.setValue(optn012v);
	}
	/**
	 * Gets the reference for attribute optn012o.
	 * @return the optn012o attribute reference
	 */
	public ElementaryRangeReference getOptn012oReference() {
		return optn012o.getReference();
	}

	/**
	 * Getter for optn012o attribute.
	 * @return optn012o attribute
	 */
	public String getOptn012o() {
		return optn012o.getValue();
	}

	/**
	 * Setter for optn012o attribute.
	 * @param optn012o the new value of optn012o
	 */
	public void setOptn012o(String optn012o) {
		this.optn012o.setValue(optn012o);
	}
	/**
	 * Gets the reference for attribute optionc.
	 * @return the optionc attribute reference
	 */
	public ElementaryRangeReference getOptioncReference() {
		return optionc.getReference();
	}

	/**
	 * Getter for optionc attribute.
	 * @return optionc attribute
	 */
	public String getOptionc() {
		return optionc.getValue();
	}

	/**
	 * Setter for optionc attribute.
	 * @param optionc the new value of optionc
	 */
	public void setOptionc(String optionc) {
		this.optionc.setValue(optionc);
	}
	/**
	 * Gets the reference for attribute optionp.
	 * @return the optionp attribute reference
	 */
	public ElementaryRangeReference getOptionpReference() {
		return optionp.getReference();
	}

	/**
	 * Getter for optionp attribute.
	 * @return optionp attribute
	 */
	public String getOptionp() {
		return optionp.getValue();
	}

	/**
	 * Setter for optionp attribute.
	 * @param optionp the new value of optionp
	 */
	public void setOptionp(String optionp) {
		this.optionp.setValue(optionp);
	}
	/**
	 * Gets the reference for attribute optionh.
	 * @return the optionh attribute reference
	 */
	public ElementaryRangeReference getOptionhReference() {
		return optionh.getReference();
	}

	/**
	 * Getter for optionh attribute.
	 * @return optionh attribute
	 */
	public String getOptionh() {
		return optionh.getValue();
	}

	/**
	 * Setter for optionh attribute.
	 * @param optionh the new value of optionh
	 */
	public void setOptionh(String optionh) {
		this.optionh.setValue(optionh);
	}
	/**
	 * Gets the reference for attribute optionv.
	 * @return the optionv attribute reference
	 */
	public ElementaryRangeReference getOptionvReference() {
		return optionv.getReference();
	}

	/**
	 * Getter for optionv attribute.
	 * @return optionv attribute
	 */
	public String getOptionv() {
		return optionv.getValue();
	}

	/**
	 * Setter for optionv attribute.
	 * @param optionv the new value of optionv
	 */
	public void setOptionv(String optionv) {
		this.optionv.setValue(optionv);
	}
	/**
	 * Gets the reference for attribute optiono.
	 * @return the optiono attribute reference
	 */
	public ElementaryRangeReference getOptionoReference() {
		return optiono.getReference();
	}

	/**
	 * Getter for optiono attribute.
	 * @return optiono attribute
	 */
	public String getOptiono() {
		return optiono.getValue();
	}

	/**
	 * Setter for optiono attribute.
	 * @param optiono the new value of optiono
	 */
	public void setOptiono(String optiono) {
		this.optiono.setValue(optiono);
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
