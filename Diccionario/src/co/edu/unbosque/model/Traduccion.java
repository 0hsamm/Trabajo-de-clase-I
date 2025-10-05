package co.edu.unbosque.model;

import java.io.Serializable;

public class Traduccion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2995112188596815998L;
	private String palabraATraducir;
	private String palabraTraducida;
	private String idiomaDetectado;
	
	public Traduccion() {
		// TODO Auto-generated constructor stub
	}

	public Traduccion(String palabraATraducir, String palabraTraducida, String idiomaDetectado) {
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
		return "Traduccion "
				+ "palabraATraducir: " + palabraATraducir 
				+ "palabraTraducida: " + palabraTraducida
				+ "idiomaDetectado: " + idiomaDetectado;
	}
	
	
	
}
