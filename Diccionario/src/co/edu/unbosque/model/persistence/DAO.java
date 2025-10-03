package co.edu.unbosque.model.persistence;

public interface DAO <E, D>{
	
	public void create(D newData);
	public String showAll();
	public void  leerDesdeArchivoDeTexto(String url);
	public void escribirEnArchivoDeTexto();
	public void cargarDesdeArchivoSerializado();
	public void escribirEnArchivoSerializado();
}
