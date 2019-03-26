package GeoVANT.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sensor {
	
	@Id
	private Long sensorId;
	private Long vantId;
	private SensorType sensorType;
	private String model;
	private String manufacturer;
	private ArrayList<SensorDevice> sensorDevice;
	
	public Long getSensorId() {
		return sensorId;
	}
	public void setSensorId(Long sensorId) {
		this.sensorId = sensorId;
	}
	public Long getVantId() {
		return vantId;
	}
	public void setVantId(Long vantId) {
		this.vantId = vantId;
	}
	public SensorType getSensorType() {
		return sensorType;
	}
	public void setSensorType(SensorType sensorType) {
		this.sensorType = sensorType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public ArrayList<SensorDevice> getSensorDevice() {
		return sensorDevice;
	}
	public void setSensorDevice(ArrayList<SensorDevice> sensorDevice) {
		this.sensorDevice = sensorDevice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sensorId == null) ? 0 : sensorId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensor other = (Sensor) obj;
		if (sensorId == null) {
			if (other.sensorId != null)
				return false;
		} else if (!sensorId.equals(other.sensorId))
			return false;
		return true;
	}
	

}
