package co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.implementacionsJPA;

import java.util.List;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.aerolinea.definiciones.IDAOCiudad;
import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo.Ciudad;

public class DAOCiudad implements IDAOCiudad{

	public List<Ciudad> ListarCiudad() throws Exception {
		
		EntityManager en = co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.utilidades.AdministradorEntityManager.getEntityManager();
		String jpql = "SELECT ciu FROM Ciudad ciu";		
		javax.persistence.Query q = en.createQuery(jpql);
		List<Ciudad> ciudad = q.getResultList();
		return ciudad;
		
		
		
	}

	
	
	
}
