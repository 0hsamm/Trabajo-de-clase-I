package co.edu.unbosque.model.persistence;

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
	
	
	
}
