package aws.bluage.l3.workshop.cotrn02c.business.model;

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
import com.netfective.bluage.gapwalk.datasimplifier.metadata.type.ZonedType;
/**
 * Data simplifier entity WsDateTime.
<pre>
 * 
 * Legacy Documentation:<br>
 *  <br>
 *   Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:15:58 CDT<br>
 *  <br>
 *  ****************************************************************<br>
 *   Copyright Amazon.com, Inc. or its affiliates.<br>
 *   All Rights Reserved.<br>
 *  <br>
 *   Licensed under the Apache License, Version 2.0 (the "License").<br>
 *   You may not use this file except in compliance with the License.<br>
 *   You may obtain a copy of the License at<br>
 *  <br>
 *      http://www.apache.org/licenses/LICENSE-2.0<br>
 *  <br>
 *   Unless required by applicable law or agreed to in writing,<br>
 *   software distributed under the License is distributed on an<br>
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,<br>
 *   either express or implied. See the License for the specific<br>
 *   language governing permissions and limitations under the License<br>
 *  ****************************************************************<br>
</pre>
 * 
 * <p>About 'wsCurdateData' field, <br>uml entity: aws.bluage.l3.workshop.cotrn02c.business.model.WsCurdateData
 * <br></p>
 * 
 * <p>About 'wsCurdateMmDdYy' field, <br>uml entity: aws.bluage.l3.workshop.cotrn02c.business.model.WsCurdateMmDdYy
 * <br></p>
 * 
 * <p>About 'wsCurtimeHhMmSs' field, <br>uml entity: aws.bluage.l3.workshop.cotrn02c.business.model.WsCurtimeHhMmSs
 * <br></p>
 * 
 * <p>About 'wsTimestamp' field, <br>uml entity: aws.bluage.l3.workshop.cotrn02c.business.model.WsTimestamp
 * <br></p>
 * 
 * @see RecordEntity
 */
public class WsDateTime extends RecordEntity {

	private final Group root = new Group(getData()); 
	private final Group wsCurdateData = new Group(root);
	private final Union union = new Union(wsCurdateData);
	private final Group wsCurdate = new Group(union);
	private final Elementary wsCurdateYear = new Elementary(wsCurdate,new ZonedType(4, 0, false));
	private final Elementary wsCurdateMonth = new Elementary(wsCurdate,new ZonedType(2, 0, false));
	private final Elementary wsCurdateDay = new Elementary(wsCurdate,new ZonedType(2, 0, false));
	private final Elementary wsCurdateN = new Elementary(union,new ZonedType(8, 0, false));
	private final Union union1 = new Union(wsCurdateData);
	private final Group wsCurtime = new Group(union1);
	private final Elementary wsCurtimeHours = new Elementary(wsCurtime,new ZonedType(2, 0, false));
	private final Elementary wsCurtimeMinute = new Elementary(wsCurtime,new ZonedType(2, 0, false));
	private final Elementary wsCurtimeSecond = new Elementary(wsCurtime,new ZonedType(2, 0, false));
	private final Elementary wsCurtimeMilsec = new Elementary(wsCurtime,new ZonedType(2, 0, false));
	private final Elementary wsCurtimeN = new Elementary(union1,new ZonedType(8, 0, false));
	private final Group wsCurdateMmDdYy = new Group(root);
	private final Elementary wsCurdateMm = new Elementary(wsCurdateMmDdYy,new ZonedType(2, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler = new Filler(wsCurdateMmDdYy,new AlphanumericType(1),"/");
	private final Elementary wsCurdateDd = new Elementary(wsCurdateMmDdYy,new ZonedType(2, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler1 = new Filler(wsCurdateMmDdYy,new AlphanumericType(1),"/");
	private final Elementary wsCurdateYy = new Elementary(wsCurdateMmDdYy,new ZonedType(2, 0, false));
	private final Group wsCurtimeHhMmSs = new Group(root);
	private final Elementary wsCurtimeHh = new Elementary(wsCurtimeHhMmSs,new ZonedType(2, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler2 = new Filler(wsCurtimeHhMmSs,new AlphanumericType(1),":");
	private final Elementary wsCurtimeMm = new Elementary(wsCurtimeHhMmSs,new ZonedType(2, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler3 = new Filler(wsCurtimeHhMmSs,new AlphanumericType(1),":");
	private final Elementary wsCurtimeSs = new Elementary(wsCurtimeHhMmSs,new ZonedType(2, 0, false));
	private final Group wsTimestamp = new Group(root);
	private final Elementary wsTimestampDtYyyy = new Elementary(wsTimestamp,new ZonedType(4, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler4 = new Filler(wsTimestamp,new AlphanumericType(1),"-");
	private final Elementary wsTimestampDtMm = new Elementary(wsTimestamp,new ZonedType(2, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler5 = new Filler(wsTimestamp,new AlphanumericType(1),"-");
	private final Elementary wsTimestampDtDd = new Elementary(wsTimestamp,new ZonedType(2, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler6 = new Filler(wsTimestamp,new AlphanumericType(1)," ");
	private final Elementary wsTimestampTmHh = new Elementary(wsTimestamp,new ZonedType(2, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler7 = new Filler(wsTimestamp,new AlphanumericType(1),":");
	private final Elementary wsTimestampTmMm = new Elementary(wsTimestamp,new ZonedType(2, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler8 = new Filler(wsTimestamp,new AlphanumericType(1),":");
	private final Elementary wsTimestampTmSs = new Elementary(wsTimestamp,new ZonedType(2, 0, false));
	@SuppressWarnings("unused")
	private final Filler filler9 = new Filler(wsTimestamp,new AlphanumericType(1),".");
	private final Elementary wsTimestampTmMs6 = new Elementary(wsTimestamp,new ZonedType(6, 0, false));
	

	/**
	 * Instantiate a new WsDateTime with a default record.
	 * @param configuration the configuration
	 */
	public WsDateTime(Configuration configuration) {
		super(configuration);
		setupRoot(root);
	}
	/**
	 * Instantiate a new WsDateTime bound to the provided record.
	 * @param configuration the configuration
	 * @param record the existing record to bind
	 */
	public WsDateTime(Configuration configuration, RecordAdaptable record) {
		super(configuration);
		setupRoot(root, record);
	}

	
	/**
	 * Gets the reference for attribute wsCurdateData.
	 * @return the wsCurdateData attribute reference
	 */
	public RangeReference getWsCurdateDataReference() {
		return wsCurdateData.getReference();
	}	
				
	/**
	 * Setter for wsCurdateData .
	 */
   	public void setWsCurdateData(RangeReference reference) {
       	wsCurdateData.getReference().setBytes(reference.getBytes());
   	}
 
	
	/**
	 * Gets the reference for attribute wsCurdate.
	 * @return the wsCurdate attribute reference
	 */
	public RangeReference getWsCurdateReference() {
		return wsCurdate.getReference();
	}	
				
	/**
	 * Setter for wsCurdate .
	 */
   	public void setWsCurdate(RangeReference reference) {
       	wsCurdate.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsCurdateYear.
	 * @return the wsCurdateYear attribute reference
	 */
	public ElementaryRangeReference getWsCurdateYearReference() {
		return wsCurdateYear.getReference();
	}

	/**
	 * Getter for wsCurdateYear attribute.
	 * @return wsCurdateYear attribute
	 */
	public int getWsCurdateYear() {
		return wsCurdateYear.getValue();
	}

	/**
	 * Setter for wsCurdateYear attribute.
	 * @param wsCurdateYear the new value of wsCurdateYear
	 */
	public void setWsCurdateYear(int wsCurdateYear) {
		this.wsCurdateYear.setValue(wsCurdateYear);
	}
	/**
	 * Gets the reference for attribute wsCurdateMonth.
	 * @return the wsCurdateMonth attribute reference
	 */
	public ElementaryRangeReference getWsCurdateMonthReference() {
		return wsCurdateMonth.getReference();
	}

	/**
	 * Getter for wsCurdateMonth attribute.
	 * @return wsCurdateMonth attribute
	 */
	public int getWsCurdateMonth() {
		return wsCurdateMonth.getValue();
	}

	/**
	 * Setter for wsCurdateMonth attribute.
	 * @param wsCurdateMonth the new value of wsCurdateMonth
	 */
	public void setWsCurdateMonth(int wsCurdateMonth) {
		this.wsCurdateMonth.setValue(wsCurdateMonth);
	}
	/**
	 * Gets the reference for attribute wsCurdateDay.
	 * @return the wsCurdateDay attribute reference
	 */
	public ElementaryRangeReference getWsCurdateDayReference() {
		return wsCurdateDay.getReference();
	}

	/**
	 * Getter for wsCurdateDay attribute.
	 * @return wsCurdateDay attribute
	 */
	public int getWsCurdateDay() {
		return wsCurdateDay.getValue();
	}

	/**
	 * Setter for wsCurdateDay attribute.
	 * @param wsCurdateDay the new value of wsCurdateDay
	 */
	public void setWsCurdateDay(int wsCurdateDay) {
		this.wsCurdateDay.setValue(wsCurdateDay);
	}
	/**
	 * Gets the reference for attribute wsCurdateN.
	 * @return the wsCurdateN attribute reference
	 */
	public ElementaryRangeReference getWsCurdateNReference() {
		return wsCurdateN.getReference();
	}

	/**
	 * Getter for wsCurdateN attribute.
	 * @return wsCurdateN attribute
	 */
	public int getWsCurdateN() {
		return wsCurdateN.getValue();
	}

	/**
	 * Setter for wsCurdateN attribute.
	 * @param wsCurdateN the new value of wsCurdateN
	 */
	public void setWsCurdateN(int wsCurdateN) {
		this.wsCurdateN.setValue(wsCurdateN);
	}
	
	/**
	 * Gets the reference for attribute wsCurtime.
	 * @return the wsCurtime attribute reference
	 */
	public RangeReference getWsCurtimeReference() {
		return wsCurtime.getReference();
	}	
				
	/**
	 * Setter for wsCurtime .
	 */
   	public void setWsCurtime(RangeReference reference) {
       	wsCurtime.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsCurtimeHours.
	 * @return the wsCurtimeHours attribute reference
	 */
	public ElementaryRangeReference getWsCurtimeHoursReference() {
		return wsCurtimeHours.getReference();
	}

	/**
	 * Getter for wsCurtimeHours attribute.
	 * @return wsCurtimeHours attribute
	 */
	public int getWsCurtimeHours() {
		return wsCurtimeHours.getValue();
	}

	/**
	 * Setter for wsCurtimeHours attribute.
	 * @param wsCurtimeHours the new value of wsCurtimeHours
	 */
	public void setWsCurtimeHours(int wsCurtimeHours) {
		this.wsCurtimeHours.setValue(wsCurtimeHours);
	}
	/**
	 * Gets the reference for attribute wsCurtimeMinute.
	 * @return the wsCurtimeMinute attribute reference
	 */
	public ElementaryRangeReference getWsCurtimeMinuteReference() {
		return wsCurtimeMinute.getReference();
	}

	/**
	 * Getter for wsCurtimeMinute attribute.
	 * @return wsCurtimeMinute attribute
	 */
	public int getWsCurtimeMinute() {
		return wsCurtimeMinute.getValue();
	}

	/**
	 * Setter for wsCurtimeMinute attribute.
	 * @param wsCurtimeMinute the new value of wsCurtimeMinute
	 */
	public void setWsCurtimeMinute(int wsCurtimeMinute) {
		this.wsCurtimeMinute.setValue(wsCurtimeMinute);
	}
	/**
	 * Gets the reference for attribute wsCurtimeSecond.
	 * @return the wsCurtimeSecond attribute reference
	 */
	public ElementaryRangeReference getWsCurtimeSecondReference() {
		return wsCurtimeSecond.getReference();
	}

	/**
	 * Getter for wsCurtimeSecond attribute.
	 * @return wsCurtimeSecond attribute
	 */
	public int getWsCurtimeSecond() {
		return wsCurtimeSecond.getValue();
	}

	/**
	 * Setter for wsCurtimeSecond attribute.
	 * @param wsCurtimeSecond the new value of wsCurtimeSecond
	 */
	public void setWsCurtimeSecond(int wsCurtimeSecond) {
		this.wsCurtimeSecond.setValue(wsCurtimeSecond);
	}
	/**
	 * Gets the reference for attribute wsCurtimeMilsec.
	 * @return the wsCurtimeMilsec attribute reference
	 */
	public ElementaryRangeReference getWsCurtimeMilsecReference() {
		return wsCurtimeMilsec.getReference();
	}

	/**
	 * Getter for wsCurtimeMilsec attribute.
	 * @return wsCurtimeMilsec attribute
	 */
	public int getWsCurtimeMilsec() {
		return wsCurtimeMilsec.getValue();
	}

	/**
	 * Setter for wsCurtimeMilsec attribute.
	 * @param wsCurtimeMilsec the new value of wsCurtimeMilsec
	 */
	public void setWsCurtimeMilsec(int wsCurtimeMilsec) {
		this.wsCurtimeMilsec.setValue(wsCurtimeMilsec);
	}
	/**
	 * Gets the reference for attribute wsCurtimeN.
	 * @return the wsCurtimeN attribute reference
	 */
	public ElementaryRangeReference getWsCurtimeNReference() {
		return wsCurtimeN.getReference();
	}

	/**
	 * Getter for wsCurtimeN attribute.
	 * @return wsCurtimeN attribute
	 */
	public int getWsCurtimeN() {
		return wsCurtimeN.getValue();
	}

	/**
	 * Setter for wsCurtimeN attribute.
	 * @param wsCurtimeN the new value of wsCurtimeN
	 */
	public void setWsCurtimeN(int wsCurtimeN) {
		this.wsCurtimeN.setValue(wsCurtimeN);
	}
	
	/**
	 * Gets the reference for attribute wsCurdateMmDdYy.
	 * @return the wsCurdateMmDdYy attribute reference
	 */
	public RangeReference getWsCurdateMmDdYyReference() {
		return wsCurdateMmDdYy.getReference();
	}	
				
	/**
	 * Setter for wsCurdateMmDdYy .
	 */
   	public void setWsCurdateMmDdYy(RangeReference reference) {
       	wsCurdateMmDdYy.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsCurdateMm.
	 * @return the wsCurdateMm attribute reference
	 */
	public ElementaryRangeReference getWsCurdateMmReference() {
		return wsCurdateMm.getReference();
	}

	/**
	 * Getter for wsCurdateMm attribute.
	 * @return wsCurdateMm attribute
	 */
	public int getWsCurdateMm() {
		return wsCurdateMm.getValue();
	}

	/**
	 * Setter for wsCurdateMm attribute.
	 * @param wsCurdateMm the new value of wsCurdateMm
	 */
	public void setWsCurdateMm(int wsCurdateMm) {
		this.wsCurdateMm.setValue(wsCurdateMm);
	}
	/**
	 * Gets the reference for attribute wsCurdateDd.
	 * @return the wsCurdateDd attribute reference
	 */
	public ElementaryRangeReference getWsCurdateDdReference() {
		return wsCurdateDd.getReference();
	}

	/**
	 * Getter for wsCurdateDd attribute.
	 * @return wsCurdateDd attribute
	 */
	public int getWsCurdateDd() {
		return wsCurdateDd.getValue();
	}

	/**
	 * Setter for wsCurdateDd attribute.
	 * @param wsCurdateDd the new value of wsCurdateDd
	 */
	public void setWsCurdateDd(int wsCurdateDd) {
		this.wsCurdateDd.setValue(wsCurdateDd);
	}
	/**
	 * Gets the reference for attribute wsCurdateYy.
	 * @return the wsCurdateYy attribute reference
	 */
	public ElementaryRangeReference getWsCurdateYyReference() {
		return wsCurdateYy.getReference();
	}

	/**
	 * Getter for wsCurdateYy attribute.
	 * @return wsCurdateYy attribute
	 */
	public int getWsCurdateYy() {
		return wsCurdateYy.getValue();
	}

	/**
	 * Setter for wsCurdateYy attribute.
	 * @param wsCurdateYy the new value of wsCurdateYy
	 */
	public void setWsCurdateYy(int wsCurdateYy) {
		this.wsCurdateYy.setValue(wsCurdateYy);
	}
	
	/**
	 * Gets the reference for attribute wsCurtimeHhMmSs.
	 * @return the wsCurtimeHhMmSs attribute reference
	 */
	public RangeReference getWsCurtimeHhMmSsReference() {
		return wsCurtimeHhMmSs.getReference();
	}	
				
	/**
	 * Setter for wsCurtimeHhMmSs .
	 */
   	public void setWsCurtimeHhMmSs(RangeReference reference) {
       	wsCurtimeHhMmSs.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsCurtimeHh.
	 * @return the wsCurtimeHh attribute reference
	 */
	public ElementaryRangeReference getWsCurtimeHhReference() {
		return wsCurtimeHh.getReference();
	}

	/**
	 * Getter for wsCurtimeHh attribute.
	 * @return wsCurtimeHh attribute
	 */
	public int getWsCurtimeHh() {
		return wsCurtimeHh.getValue();
	}

	/**
	 * Setter for wsCurtimeHh attribute.
	 * @param wsCurtimeHh the new value of wsCurtimeHh
	 */
	public void setWsCurtimeHh(int wsCurtimeHh) {
		this.wsCurtimeHh.setValue(wsCurtimeHh);
	}
	/**
	 * Gets the reference for attribute wsCurtimeMm.
	 * @return the wsCurtimeMm attribute reference
	 */
	public ElementaryRangeReference getWsCurtimeMmReference() {
		return wsCurtimeMm.getReference();
	}

	/**
	 * Getter for wsCurtimeMm attribute.
	 * @return wsCurtimeMm attribute
	 */
	public int getWsCurtimeMm() {
		return wsCurtimeMm.getValue();
	}

	/**
	 * Setter for wsCurtimeMm attribute.
	 * @param wsCurtimeMm the new value of wsCurtimeMm
	 */
	public void setWsCurtimeMm(int wsCurtimeMm) {
		this.wsCurtimeMm.setValue(wsCurtimeMm);
	}
	/**
	 * Gets the reference for attribute wsCurtimeSs.
	 * @return the wsCurtimeSs attribute reference
	 */
	public ElementaryRangeReference getWsCurtimeSsReference() {
		return wsCurtimeSs.getReference();
	}

	/**
	 * Getter for wsCurtimeSs attribute.
	 * @return wsCurtimeSs attribute
	 */
	public int getWsCurtimeSs() {
		return wsCurtimeSs.getValue();
	}

	/**
	 * Setter for wsCurtimeSs attribute.
	 * @param wsCurtimeSs the new value of wsCurtimeSs
	 */
	public void setWsCurtimeSs(int wsCurtimeSs) {
		this.wsCurtimeSs.setValue(wsCurtimeSs);
	}
	
	/**
	 * Gets the reference for attribute wsTimestamp.
	 * @return the wsTimestamp attribute reference
	 */
	public RangeReference getWsTimestampReference() {
		return wsTimestamp.getReference();
	}	
				
	/**
	 * Setter for wsTimestamp .
	 */
   	public void setWsTimestamp(RangeReference reference) {
       	wsTimestamp.getReference().setBytes(reference.getBytes());
   	}
 
	/**
	 * Gets the reference for attribute wsTimestampDtYyyy.
	 * @return the wsTimestampDtYyyy attribute reference
	 */
	public ElementaryRangeReference getWsTimestampDtYyyyReference() {
		return wsTimestampDtYyyy.getReference();
	}

	/**
	 * Getter for wsTimestampDtYyyy attribute.
	 * @return wsTimestampDtYyyy attribute
	 */
	public int getWsTimestampDtYyyy() {
		return wsTimestampDtYyyy.getValue();
	}

	/**
	 * Setter for wsTimestampDtYyyy attribute.
	 * @param wsTimestampDtYyyy the new value of wsTimestampDtYyyy
	 */
	public void setWsTimestampDtYyyy(int wsTimestampDtYyyy) {
		this.wsTimestampDtYyyy.setValue(wsTimestampDtYyyy);
	}
	/**
	 * Gets the reference for attribute wsTimestampDtMm.
	 * @return the wsTimestampDtMm attribute reference
	 */
	public ElementaryRangeReference getWsTimestampDtMmReference() {
		return wsTimestampDtMm.getReference();
	}

	/**
	 * Getter for wsTimestampDtMm attribute.
	 * @return wsTimestampDtMm attribute
	 */
	public int getWsTimestampDtMm() {
		return wsTimestampDtMm.getValue();
	}

	/**
	 * Setter for wsTimestampDtMm attribute.
	 * @param wsTimestampDtMm the new value of wsTimestampDtMm
	 */
	public void setWsTimestampDtMm(int wsTimestampDtMm) {
		this.wsTimestampDtMm.setValue(wsTimestampDtMm);
	}
	/**
	 * Gets the reference for attribute wsTimestampDtDd.
	 * @return the wsTimestampDtDd attribute reference
	 */
	public ElementaryRangeReference getWsTimestampDtDdReference() {
		return wsTimestampDtDd.getReference();
	}

	/**
	 * Getter for wsTimestampDtDd attribute.
	 * @return wsTimestampDtDd attribute
	 */
	public int getWsTimestampDtDd() {
		return wsTimestampDtDd.getValue();
	}

	/**
	 * Setter for wsTimestampDtDd attribute.
	 * @param wsTimestampDtDd the new value of wsTimestampDtDd
	 */
	public void setWsTimestampDtDd(int wsTimestampDtDd) {
		this.wsTimestampDtDd.setValue(wsTimestampDtDd);
	}
	/**
	 * Gets the reference for attribute wsTimestampTmHh.
	 * @return the wsTimestampTmHh attribute reference
	 */
	public ElementaryRangeReference getWsTimestampTmHhReference() {
		return wsTimestampTmHh.getReference();
	}

	/**
	 * Getter for wsTimestampTmHh attribute.
	 * @return wsTimestampTmHh attribute
	 */
	public int getWsTimestampTmHh() {
		return wsTimestampTmHh.getValue();
	}

	/**
	 * Setter for wsTimestampTmHh attribute.
	 * @param wsTimestampTmHh the new value of wsTimestampTmHh
	 */
	public void setWsTimestampTmHh(int wsTimestampTmHh) {
		this.wsTimestampTmHh.setValue(wsTimestampTmHh);
	}
	/**
	 * Gets the reference for attribute wsTimestampTmMm.
	 * @return the wsTimestampTmMm attribute reference
	 */
	public ElementaryRangeReference getWsTimestampTmMmReference() {
		return wsTimestampTmMm.getReference();
	}

	/**
	 * Getter for wsTimestampTmMm attribute.
	 * @return wsTimestampTmMm attribute
	 */
	public int getWsTimestampTmMm() {
		return wsTimestampTmMm.getValue();
	}

	/**
	 * Setter for wsTimestampTmMm attribute.
	 * @param wsTimestampTmMm the new value of wsTimestampTmMm
	 */
	public void setWsTimestampTmMm(int wsTimestampTmMm) {
		this.wsTimestampTmMm.setValue(wsTimestampTmMm);
	}
	/**
	 * Gets the reference for attribute wsTimestampTmSs.
	 * @return the wsTimestampTmSs attribute reference
	 */
	public ElementaryRangeReference getWsTimestampTmSsReference() {
		return wsTimestampTmSs.getReference();
	}

	/**
	 * Getter for wsTimestampTmSs attribute.
	 * @return wsTimestampTmSs attribute
	 */
	public int getWsTimestampTmSs() {
		return wsTimestampTmSs.getValue();
	}

	/**
	 * Setter for wsTimestampTmSs attribute.
	 * @param wsTimestampTmSs the new value of wsTimestampTmSs
	 */
	public void setWsTimestampTmSs(int wsTimestampTmSs) {
		this.wsTimestampTmSs.setValue(wsTimestampTmSs);
	}
	/**
	 * Gets the reference for attribute wsTimestampTmMs6.
	 * @return the wsTimestampTmMs6 attribute reference
	 */
	public ElementaryRangeReference getWsTimestampTmMs6Reference() {
		return wsTimestampTmMs6.getReference();
	}

	/**
	 * Getter for wsTimestampTmMs6 attribute.
	 * @return wsTimestampTmMs6 attribute
	 */
	public int getWsTimestampTmMs6() {
		return wsTimestampTmMs6.getValue();
	}

	/**
	 * Setter for wsTimestampTmMs6 attribute.
	 * @param wsTimestampTmMs6 the new value of wsTimestampTmMs6
	 */
	public void setWsTimestampTmMs6(int wsTimestampTmMs6) {
		this.wsTimestampTmMs6.setValue(wsTimestampTmMs6);
	}
}
