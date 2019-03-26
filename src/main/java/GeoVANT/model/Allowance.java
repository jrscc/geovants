package GeoVANT.model;

import org.springframework.data.annotation.Id;

public class Allowance {
	
	@Id
	private Long allowanceID;
	
	private String description;

	public Long getAllowanceID() {
		return allowanceID;
	}

	public void setAllowanceID(Long allowanceID) {
		this.allowanceID = allowanceID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allowanceID == null) ? 0 : allowanceID.hashCode());
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
		Allowance other = (Allowance) obj;
		if (allowanceID == null) {
			if (other.allowanceID != null)
				return false;
		} else if (!allowanceID.equals(other.allowanceID))
			return false;
		return true;
	}
	
	

}
