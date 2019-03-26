package GeoVANT.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("geovant")
public class GeoVantApiProperty {
	
	private String originPermitida = "http://localhost:8000";
	
	private final SecurityGeoVant security = new SecurityGeoVant();
	
	public String getOriginPermitida() {
		return originPermitida;
	}

	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}

	public SecurityGeoVant getSeguranca() {
		return security;
	}

	public static class SecurityGeoVant{
		
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
		
	}

}
