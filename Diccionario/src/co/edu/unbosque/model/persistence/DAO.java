package co.edu.unbosque.model.persistence;

public interface DAO <E>{
	
	public void create(E newData);
	public String showAll();
	public void  leerDesdeArchivoDeTexto(String url);
	public void escribirEnArchivoDeTexto();
	public void cargarDesdeArchivoSerializado();
	public void escribirEnArchivoSerializado();
	public String generarReporteDiaActual();
}
