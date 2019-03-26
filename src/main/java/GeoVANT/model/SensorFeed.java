package GeoVANT.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SensorFeed {

	@Id
	private Long sensorFeedId;
	private Long sensorDatakitId;
	private String capability;
	private String measureUnit;
	private ArrayList<SensorValue> sensorValue;
	private ArrayList<Keyword> keyword;
	
	
	public Long getSensorFeedId() {
		return sensorFeedId;
	}
	public void setSensorFeedId(Long sensorFeedId) {
		this.sensorFeedId = sensorFeedId;
	}
	public Long getSensorDatakitId() {
		return sensorDatakitId;
	}
	public void setSensorDatakitId(Long sensorDatakitId) {
		this.sensorDatakitId = sensorDatakitId;
	}
	public String getCapability() {
		return capability;
	}
	public void setCapability(String capability) {
		this.capability = capability;
	}
	public String getMeasureUnit() {
		return measureUnit;
	}
	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}
	public ArrayList<SensorValue> getSensorValue() {
		return sensorValue;
	}
	public void setSensorValue(ArrayList<SensorValue> sensorValue) {
		this.sensorValue = sensorValue;
	}
	public ArrayList<Keyword> getKeyword() {
		return keyword;
	}
	public void setKeyword(ArrayList<Keyword> keyword) {
		this.keyword = keyword;
	}
	
	
	
	
	

}
