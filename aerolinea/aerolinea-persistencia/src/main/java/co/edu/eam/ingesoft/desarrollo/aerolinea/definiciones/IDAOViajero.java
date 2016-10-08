package co.edu.eam.ingesoft.desarrollo.aerolinea.definiciones;

import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo.Viajero;

public interface IDAOViajero {

	
	public void crear (Viajero viaj) throws Exception;
	
	public Viajero buscar (String ced) throws Exception;
	 
    public void eliminar (Viajero e) throws Exception;
}
