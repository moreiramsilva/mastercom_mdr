package sdk;

public class ParametrosConfig {
	
	private String Proxy;
	private String Porta;
	private String EhDebug;
	private String certificadoPath;
	private String ambiente;
	
	public String getProxy() {
		return Proxy;
	}
	public void setProxy(String proxy) {
		Proxy = proxy;
	}
	public String getPorta() {
		return Porta;
	}
	public void setPorta(String porta) {
		Porta = porta;
	}
	public String getEhDebug() {
		return EhDebug;
	}
	public void setEhDebug(String ehDebug) {
		EhDebug = ehDebug;
	}
	public String getCertificadoPath() {
		return certificadoPath;
	}
	public void setCertificadoPath(String certificadoPath) {
		this.certificadoPath = certificadoPath;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
}
