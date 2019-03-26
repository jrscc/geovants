package GeoVANT.model;

import java.util.Date;
import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ResearcherCollector {

	@Id
	private Long collectorID;
	private Date since;
	private Date certified;
	private String email;
	private String password;
	private String name;
	private String authorName;
	private List<Long> vantIds;
	private List<Long> sensorIds;
	private List<Allowance> allowance;
	private ResearcherOrganization researcherOrganization;
	public Long getCollectorID() {
		return collectorID;
	}
	public void setCollectorID(Long collectorID) {
		this.collectorID = collectorID;
	}
	public Date getSince() {
		return since;
	}
	public void setSince(Date since) {
		this.since = since;
	}
	public Date getCertified() {
		return certified;
	}
	public void setCertified(Date certified) {
		this.certified = certified;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public List<Long> getVantIds() {
		return vantIds;
	}
	public void setVantIds(List<Long> vantIds) {
		this.vantIds = vantIds;
	}
	public List<Long> getSensorIds() {
		return sensorIds;
	}
	public void setSensorIds(List<Long> sensorIds) {
		this.sensorIds = sensorIds;
	}
	public List<Allowance> getAllowance() {
		return allowance;
	}
	public void setAllowance(List<Allowance> allowance) {
		this.allowance = allowance;
	}
	public ResearcherOrganization getResearcherOrganization() {
		return researcherOrganization;
	}
	public void setResearcherOrganization(ResearcherOrganization researcherOrganization) {
		this.researcherOrganization = researcherOrganization;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collectorID == null) ? 0 : collectorID.hashCode());
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
		ResearcherCollector other = (ResearcherCollector) obj;
		if (collectorID == null) {
			if (other.collectorID != null)
				return false;
		} else if (!collectorID.equals(other.collectorID))
			return false;
		return true;
	}
	
	
}
