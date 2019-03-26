package GeoVANT.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class VANTDatakit {
	
	@Id
	private Long vANTDatakitId;
	private Long collectorId;
	private Date since;
	private CornerCoordinate xplorePin;
	private ArrayList<VANTImage> imagens;
	private ArrayList<CornerCoordinate> totalCoveredArea;
	
	public Long getvANTDatakitId() {
		return vANTDatakitId;
	}
	public void setvANTDatakitId(Long vANTDatakitId) {
		this.vANTDatakitId = vANTDatakitId;
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
	public ArrayList<VANTImage> getImagens() {
		return imagens;
	}
	public void setImagens(ArrayList<VANTImage> imagens) {
		this.imagens = imagens;
	}
	public ArrayList<CornerCoordinate> getTotalCoveredArea() {
		return totalCoveredArea;
	}
	public void setTotalCoveredArea(ArrayList<CornerCoordinate> totalCoveredArea) {
		this.totalCoveredArea = totalCoveredArea;
	}
	
	
	

}
