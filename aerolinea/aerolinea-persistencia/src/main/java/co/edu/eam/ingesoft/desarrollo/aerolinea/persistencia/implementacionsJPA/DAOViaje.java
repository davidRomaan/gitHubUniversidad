package co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.implementacionsJPA;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.aerolinea.definiciones.IDAOViaje;
import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo.Viaje;
import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo.Viajero;
import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.utilidades.AdministradorEntityManager;

public class DAOViaje implements IDAOViaje{

	public void crear(Viaje v) throws Exception {
		
		
		EntityManager en = AdministradorEntityManager.getEntityManager();
			
		en.getTransaction().begin();		
		en.persist(v);
		en.getTransaction().commit();
		
		
	}

	public Viaje buscar(int cod) throws Exception {
			
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Viaje.class, cod);
		
	}

	public void editar(Viaje v) throws Exception {
		
		EntityManager en = AdministradorEntityManager.getEntityManager();
		
		en.getTransaction().begin();		
		en.merge(v);
		en.getTransaction().commit();
		
	}

	
	
}
