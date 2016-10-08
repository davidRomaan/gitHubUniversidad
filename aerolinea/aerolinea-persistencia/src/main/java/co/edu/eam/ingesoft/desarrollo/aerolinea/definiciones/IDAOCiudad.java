package co.edu.eam.ingesoft.desarrollo.aerolinea.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo.Ciudad;

public interface IDAOCiudad {

	
	public List<Ciudad> ListarCiudad()throws Exception;
	
}
