package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
   	/**
	 * Listamos todas las areas de interes que se encuentran en la bd
	 * @return lista con todas las areas de interes
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<AreaInteres> listar() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(AreaInteres.LISTAR);
		List<AreaInteres> lista = q.getResultList();
		return lista;
	}

}
