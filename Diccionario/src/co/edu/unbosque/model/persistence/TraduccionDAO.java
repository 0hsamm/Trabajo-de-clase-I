package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Traduccion;
import co.edu.unbosque.model.TraduccionDTO;

public class TraduccionDAO implements DAO<Traduccion, TraduccionDTO>{
	private ArrayList<Traduccion> listaTraduccion;
	private ArrayList<TraduccionDTO> listaTraduccionDTO;
	
	private final String FILE_NAME = "Traduccion.csv";
	private final String SERIAL_FILE_NAME = "Traduccion.bin";
	
	
	
	public TraduccionDAO() {
		listaTraduccion = new ArrayList<>();
		listaTraduccionDTO = new ArrayList<>();
		leerDesdeArchivoDeTexto(FILE_NAME);
		cargarDesdeArchivoSerializado();
	}
	

	@Override
	public void create(TraduccionDTO newData) {
		
	}


	@Override
	public String showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escribirEnArchivoSerializado() {
		// TODO Auto-generated method stub
		
	}


}
