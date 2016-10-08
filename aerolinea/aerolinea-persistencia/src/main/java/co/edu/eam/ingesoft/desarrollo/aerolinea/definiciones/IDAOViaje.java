package co.edu.eam.ingesoft.desarrollo.aerolinea.definiciones;

import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo.Viaje;
import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo.Viajero;

public interface IDAOViaje {

	
    public void crear (Viaje v) throws Exception;
	
	public Viaje buscar (int cod) throws Exception;
	
	public void editar (Viaje v) throws Exception;
	
}
