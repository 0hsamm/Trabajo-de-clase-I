package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.*;


public class DataMapper {
	
	public static AveDTO convertirAveAAveDTO(Ave entity) {
		AveDTO dto = new AveDTO();
		dto.setNombre(entity.getNombre());
		dto.setEspecie(entity.getEspecie());
		dto.setPeso(entity.getPeso());
		dto.setEdad(entity.getEdad());
		dto.setSexo(entity.getSexo());
		dto.setHabitat(entity.getHabitat());
		dto.setFormaDesplazamiento(entity.getFormaDesplazamiento());
		dto.setFechaIngreso(entity.getFechaIngreso());
		dto.setTipoDePluma(entity.getTipoDePluma());
		dto.setTipoDePico(entity.getTipoDePico());
		return dto;
	}
	
	public static Ave convertirAveDTOAAve(AveDTO dto) {
		Ave entity = new Ave();
		entity.setNombre(dto.getNombre());
		entity.setEspecie(dto.getEspecie());
		entity.setPeso(dto.getPeso());
		entity.setEdad(dto.getEdad());
		entity.setSexo(dto.getSexo());
		entity.setHabitat(dto.getHabitat());
		entity.setFormaDesplazamiento(dto.getFormaDesplazamiento());
		entity.setFechaIngreso(dto.getFechaIngreso());
		entity.setTipoDePluma(dto.getTipoDePluma());
		entity.setTipoDePico(dto.getTipoDePico());
		return entity;
	}
	
	public static GatoDTO convertirGatoAGatoDTO(Gato entity) {
		GatoDTO dto = new GatoDTO();
		dto.setNombre(entity.getNombre());
		dto.setEspecie(entity.getEspecie());
		dto.setPeso(entity.getPeso());
		dto.setEdad(entity.getEdad());
		dto.setSexo(entity.getSexo());
		dto.setHabitat(entity.getHabitat());
		dto.setFormaDesplazamiento(entity.getFormaDesplazamiento());
		dto.setFechaIngreso(entity.getFechaIngreso());
		dto.setColorPelaje(entity.getColorPelaje());
		dto.setTamanoOreja(entity.getTamanoOreja());
		return dto;
	}
	
	public static Gato convertirGatoDTOAGato(GatoDTO dto) {
		Gato entity = new Gato();
		entity.setNombre(dto.getNombre());
		entity.setEspecie(dto.getEspecie());
		entity.setPeso(dto.getPeso());
		entity.setEdad(dto.getEdad());
		entity.setSexo(dto.getSexo());
		entity.setHabitat(dto.getHabitat());
		entity.setFormaDesplazamiento(dto.getFormaDesplazamiento());
		entity.setFechaIngreso(dto.getFechaIngreso());
		entity.setColorPelaje(dto.getColorPelaje());
		entity.setTamanoOreja(dto.getTamanoOreja());
		return entity;
	}
	
	public static PerroDTO convertirPerroAPerroDTO(Perro entity) {
		PerroDTO dto = new PerroDTO();
		dto.setNombre(entity.getNombre());
		dto.setEspecie(entity.getEspecie());
		dto.setPeso(entity.getPeso());
		dto.setEdad(entity.getEdad());
		dto.setSexo(entity.getSexo());
		dto.setHabitat(entity.getHabitat());
		dto.setFormaDesplazamiento(entity.getFormaDesplazamiento());
		dto.setFechaIngreso(entity.getFechaIngreso());
		dto.setColorPelaje(entity.getColorPelaje());
		dto.setTamanoOreja(entity.getTamanoOreja());
		return dto;
	}
	
	public static Perro convertirPerroDTOAPerro(PerroDTO dto) {
		Perro entity = new Perro();
		entity.setNombre(dto.getNombre());
		entity.setEspecie(dto.getEspecie());
		entity.setPeso(dto.getPeso());
		entity.setEdad(dto.getEdad());
		entity.setSexo(dto.getSexo());
		entity.setHabitat(dto.getHabitat());
		entity.setFormaDesplazamiento(dto.getFormaDesplazamiento());
		entity.setFechaIngreso(dto.getFechaIngreso());
		entity.setColorPelaje(dto.getColorPelaje());
		entity.setTamanoOreja(dto.getTamanoOreja());
		return entity;
	}
	
	public static PezDTO convertirPezAPezDTO(Pez entity) {
		PezDTO dto = new PezDTO();
		dto.setNombre(entity.getNombre());
		dto.setEspecie(entity.getEspecie());
		dto.setPeso(entity.getPeso());
		dto.setEdad(entity.getEdad());
		dto.setSexo(entity.getSexo());
		dto.setHabitat(entity.getHabitat());
		dto.setFormaDesplazamiento(entity.getFormaDesplazamiento());
		dto.setFechaIngreso(entity.getFechaIngreso());
		dto.setTieneEscama(entity.isTieneEscama());
		dto.setTamanoAleta(entity.getTamanoAleta());
		return dto;
	}
	
	public static Pez convertirPezDTOAPez(PezDTO dto) {
		Pez entity = new Pez();
		entity.setNombre(dto.getNombre());
		entity.setEspecie(dto.getEspecie());
		entity.setPeso(dto.getPeso());
		entity.setEdad(dto.getEdad());
		entity.setSexo(dto.getSexo());
		entity.setHabitat(dto.getHabitat());
		entity.setFormaDesplazamiento(dto.getFormaDesplazamiento());
		entity.setFechaIngreso(dto.getFechaIngreso());
		entity.setTieneEscama(dto.isTieneEscama());
		entity.setTamanoAleta(dto.getTamanoAleta());
		return entity;
	}
	
	public ReptilDTO convertirReptilAReptilDTO(Reptil entity) {
		ReptilDTO dto = new ReptilDTO();
		dto.setNombre(entity.getNombre());
		dto.setEspecie(entity.getEspecie());
		dto.setPeso(entity.getPeso());
		dto.setEdad(entity.getEdad());
		dto.setSexo(entity.getSexo());
		dto.setHabitat(entity.getHabitat());
		dto.setFormaDesplazamiento(entity.getFormaDesplazamiento());
		dto.setFechaIngreso(entity.getFechaIngreso());
		
		
	}
	
}
