package co.edu.unbosque.model;

public class TraduccionDTO {
	private String palabraATraducir;
	private String palabraTraducida;
	private String idiomaDetectado;
	
	public TraduccionDTO() {
		// TODO Auto-generated constructor stub
	}

	public TraduccionDTO(String palabraATraducir, String palabraTraducida, String idiomaDetectado) {
		super();
		this.palabraATraducir = palabraATraducir;
		this.palabraTraducida = palabraTraducida;
		this.idiomaDetectado = idiomaDetectado;
	}

	public String getPalabraATraducir() {
		return palabraATraducir;
	}

	public void setPalabraATraducir(String palabraATraducir) {
		this.palabraATraducir = palabraATraducir;
	}

	public String getPalabraTraducida() {
		return palabraTraducida;
	}

	public void setPalabraTraducida(String palabraTraducida) {
		this.palabraTraducida = palabraTraducida;
	}

	public String getIdiomaDetectado() {
		return idiomaDetectado;
	}

	public void setIdiomaDetectado(String idiomaDetectado) {
		this.idiomaDetectado = idiomaDetectado;
	}

	@Override
	public String toString() {
		return "Traduccion [palabraATraducir=" + palabraATraducir + ", palabraTraducida=" + palabraTraducida
				+ ", idiomaDetectado=" + idiomaDetectado + "]";
	}
	
	
	
}
