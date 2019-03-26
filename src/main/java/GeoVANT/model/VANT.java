package GeoVANT.model;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class VANT {
	
	@Id
	private Long vantId;
	private LocalDate since ;
	private int vantCode;
	private SensorType sensorType;
	private String model;
	private String manufacturer;
	private ArrayList<VANTDevice> vANTDevice;
	public Long getVantId() {
		return vantId;
	}
	public void setVantId(Long vantId) {
		this.vantId = vantId;
	}
	public LocalDate getSince() {
		return since;
	}
	public void setSince(LocalDate since) {
		this.since = since;
	}
	public int getVantCode() {
		return vantCode;
	}
	public void setVantCode(int vantCode) {
		this.vantCode = vantCode;
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

	public ArrayList<VANTDevice> getvANTDevice() {
		return vANTDevice;
	}
	public void setvANTDevice(ArrayList<VANTDevice> vANTDevice) {
		this.vANTDevice = vANTDevice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vantId == null) ? 0 : vantId.hashCode());
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
		VANT other = (VANT) obj;
		if (vantId == null) {
			if (other.vantId != null)
				return false;
		} else if (!vantId.equals(other.vantId))
			return false;
		return true;
	}
	
	
	
	

}
