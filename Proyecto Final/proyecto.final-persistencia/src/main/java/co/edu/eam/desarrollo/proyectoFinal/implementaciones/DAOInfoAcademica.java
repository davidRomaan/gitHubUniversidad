package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOInfoAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOInfoAcademica implements IDAOInfoAcademica {

	/**
	 * crea un objeto InformacionAcademica en la base de datos
	 */
	public void crear(InformacionAcademica i) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(i);
		en.getTransaction().commit();
	}

	/**
	 * actualiza la InformacionAcademica de la base de datos
	 */
	public void editar(InformacionAcademica i) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(i);
		en.getTransaction().commit();

	}
	/**
	 * Listamos todas la InformacionAcademica que se encuentran en la bd
	 * @return lista con todas la InformacionAcademica
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<InformacionAcademica> listarInformacionAcademicaEgres(Egresado e) {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(InformacionAcademica.LISTAR_INFORMACION_ACADEMICA);
		q.setParameter(1, e);
		List<InformacionAcademica> info = q.getResultList();
		return info;
	}

	/**
	 * busca la Informacion Academica 
	 * @cod identificador por el que se le va a buscar
	 */
	public InformacionAcademica buscarInfoAcadem(int cod) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(InformacionAcademica.class, cod);
	}

}
