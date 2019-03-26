package GeoVANT.model;

import java.util.ArrayList;
import java.util.Date;

public class VANTImage {
	
	private Long vantId;
	private Long collectorId;
	private VANTImageType vantImageType;
	private Date capturation;
	private Date since;
	private String format;
	private String linkWMS;
	private ArrayList<CornerCoordinate> cornerCordinate;
	public Long getVantId() {
		return vantId;
	}
	public void setVantId(Long vantId) {
		this.vantId = vantId;
	}
	public Long getCollectorId() {
		return collectorId;
	}
	public void setCollectorId(Long collectorId) {
		this.collectorId = collectorId;
	}
	public VANTImageType getVantImageType() {
		return vantImageType;
	}
	public void setVantImageType(VANTImageType vantImageType) {
		this.vantImageType = vantImageType;
	}
	public Date getCapturation() {
		return capturation;
	}
	public void setCapturation(Date capturation) {
		this.capturation = capturation;
	}
	public Date getSince() {
		return since;
	}
	public void setSince(Date since) {
		this.since = since;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getLinkWMS() {
		return linkWMS;
	}
	public void setLinkWMS(String linkWMS) {
		this.linkWMS = linkWMS;
	}
	public ArrayList<CornerCoordinate> getCornerCordinate() {
		return cornerCordinate;
	}
	public void setCornerCordinate(ArrayList<CornerCoordinate> cornerCordinate) {
		this.cornerCordinate = cornerCordinate;
	}
	
	

}
