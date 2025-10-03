package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;


public class DataMapper {
	
	public static TraduccionDTO convertirTraduccionATraduccionDTO(Traduccion entity) {
		TraduccionDTO dto = new TraduccionDTO();
		dto.setPalabraATraducir(entity.getPalabraATraducir());
		dto.setPalabraTraducida(entity.getPalabraTraducida());
		dto.setIdiomaDetectado(entity.getIdiomaDetectado());
		return dto;
	}
	
	public static Traduccion convertirTraduccionDTOATraduccion(TraduccionDTO dto) {
		Traduccion entity = new Traduccion();
		entity.setPalabraATraducir(dto.getPalabraATraducir());
		entity.setPalabraTraducida(dto.getPalabraTraducida());
		entity.setIdiomaDetectado(dto.getIdiomaDetectado());
		return entity;
	}
	
	public static ArrayList<TraduccionDTO> listaTraduccionAListaDTO(ArrayList<Traduccion> entityList){
		ArrayList<TraduccionDTO> dtoList = new ArrayList<>();
		for(Traduccion t : entityList) {
			dtoList.add(new TraduccionDTO(t.getPalabraATraducir(), t.getPalabraTraducida(), t.getIdiomaDetectado()));
		}
		return dtoList;
	}
	
	public static ArrayList<Traduccion> listaTraduccionDTOAListaTraduccion(ArrayList<TraduccionDTO> dtoList){
		ArrayList<Traduccion> entityList = new ArrayList<>();
		for(TraduccionDTO d : dtoList) {
			entityList.add(new Traduccion(d.getPalabraATraducir(), d.getPalabraTraducida(), d.getIdiomaDetectado()));
		}
		return entityList;
	}
	
}
