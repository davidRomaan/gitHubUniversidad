package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import javax.persistence.EntityManager;
import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOAreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOAreaInteres implements IDAOAreaInteres {

	public void crear(AreaInteres a) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(a);
		en.getTransaction().commit();
	}

	public AreaInteres buscar(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(AreaInteres.class, id);
	}

	public void editar(AreaInteres f) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(f);
		en.getTransaction().commit();
	}

}
