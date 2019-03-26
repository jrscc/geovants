package GeoVANT.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SensorDatakit {
	
	@Id
	private Long sensorDatakitId;
	private Long sensorId;
	private Long collectorId;
	private Date since;
	private CornerCoordinate xplorePin;
	private ArrayList<CornerCoordinate> totalCoveredArea;
	
	
	public Long getSensorDatakitId() {
		return sensorDatakitId;
	}
	public void setSensorDatakitId(Long sensorDatakitId) {
		this.sensorDatakitId = sensorDatakitId;
	}
	public Long getSensorId() {
		return sensorId;
	}
	public void setSensorId(Long sensorId) {
		this.sensorId = sensorId;
	}
	public Long getCollectorId() {
		return collectorId;
	}
	public void setCollectorId(Long collectorId) {
		this.collectorId = collectorId;
	}
	public Date getSince() {
		return since;
	}
	public void setSince(Date since) {
		this.since = since;
	}
	public CornerCoordinate getXplorePin() {
		return xplorePin;
	}
	public void setXplorePin(CornerCoordinate xplorePin) {
		this.xplorePin = xplorePin;
	}
	public ArrayList<CornerCoordinate> getTotalCoveredArea() {
		return totalCoveredArea;
	}
	public void setTotalCoveredArea(ArrayList<CornerCoordinate> totalCoveredArea) {
		this.totalCoveredArea = totalCoveredArea;
	}
	
	

}
