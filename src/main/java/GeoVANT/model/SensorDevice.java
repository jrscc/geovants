package GeoVANT.model;

public class SensorDevice {
	
	private String capability;
	private String measureUnit;
	private SensorValueMapping sensorValueMapping;
	
	public SensorValueMapping getSensorValueMapping() {
		return sensorValueMapping;
	}
	public void setSensorValueMapping(SensorValueMapping sensorValueMapping) {
		this.sensorValueMapping = sensorValueMapping;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capability == null) ? 0 : capability.hashCode());
		result = prime * result + ((measureUnit == null) ? 0 : measureUnit.hashCode());
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
		SensorDevice other = (SensorDevice) obj;
		if (capability == null) {
			if (other.capability != null)
				return false;
		} else if (!capability.equals(other.capability))
			return false;
		if (measureUnit == null) {
			if (other.measureUnit != null)
				return false;
		} else if (!measureUnit.equals(other.measureUnit))
			return false;
		return true;
	}
	
	

}
