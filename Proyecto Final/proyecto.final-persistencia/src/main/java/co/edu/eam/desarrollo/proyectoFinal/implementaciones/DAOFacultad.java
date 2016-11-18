package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOFacultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOFacultad implements IDAOFacultad {

	/**
	 * crea un objeto Facultad en la base de datos
	 */
	public void crearFacultad(Facultad f) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(f);
		en.getTransaction().commit();
	}

	/**
	 * busca la facultad 
	 * @id identificador por el que se le va a buscar
	 */
	public Facultad buscarFacultad(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Facultad.class, id);
	}


	/**
	 * actualiza la facultad de la base de datos
	 */
	public void editar(Facultad f) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(f);
		en.getTransaction().commit();
	}

	/**
	 * Listamos todas las facultades que se encuentran en la bd
	 * @return lista con todas las facultades
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<Facultad> listarFacultades() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Facultad.LISTAR_FACULTADES);
		List<Facultad> fac = q.getResultList();
		return fac;
		
	}


}
