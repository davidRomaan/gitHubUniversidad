package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import javax.persistence.EntityManager;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOContacto;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Contacto;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOContacto implements IDAOContacto{

	/**
	 * crea un objeto Contacto en la base de datos
	 */
	public void crear(Contacto c) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(c);
		en.getTransaction().commit();
		
	}

	/**
	 * busca un contacto en la base de datos 
	 * @nit identificador por el que se le va a buscar
	 */
	public Contacto buscar(String nit) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
	    return en.find(Contacto.class, nit);
	}

	/**
	 * actualiza el Contacto de la base de datos
	 */
	public void editar(Contacto c) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(c);
		en.getTransaction().commit();
		
	}
	
	

}
