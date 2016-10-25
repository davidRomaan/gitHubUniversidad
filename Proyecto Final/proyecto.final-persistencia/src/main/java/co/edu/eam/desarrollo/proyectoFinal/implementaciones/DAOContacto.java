package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import javax.persistence.EntityManager;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOContacto;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Contacto;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOContacto implements IDAOContacto{

	public void crear(Contacto c) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(c);
		en.getTransaction().commit();
		
	}

	public Contacto buscar(int cod) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Contacto.class, cod);
	}

	public void editar(Contacto e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(e);
		en.getTransaction().commit();
		
	}
	
	

}
