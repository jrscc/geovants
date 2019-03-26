package GeoVANT.model;

public class CornerCoordinate {
	
	private double latitude;
	private double longitude;
	private CornerCoordinateType cornerType;
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public CornerCoordinateType getCornerType() {
		return cornerType;
	}
	public void setCornerType(CornerCoordinateType cornerType) {
		this.cornerType = cornerType;
	}
	
	

}
