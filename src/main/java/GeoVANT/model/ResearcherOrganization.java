package GeoVANT.model;

public class ResearcherOrganization {
	
	private Long organizationID;
	private String acronym;
	private String name;
	private String department;
	
	public Long getOrganizationID() {
		return organizationID;
	}
	public void setOrganizationID(Long organizationID) {
		this.organizationID = organizationID;
	}
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	

}
