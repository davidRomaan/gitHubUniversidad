package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOInfoLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOInfoLaboral implements IDAOInfoLaboral {

	/**
	 * crea un objeto InformacionLaboral en la base de datos
	 */
	public void crear(InformacionLaboral i) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(i);
		en.getTransaction().commit();

	}

	/**
	 * Listamos todas la Informacion Laboral que se encuentran en la bd
	 * @return lista con todas la Informacion Laboral
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<InformacionLaboral> listarInformacionLaboralEgres(Egresado e) {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(InformacionLaboral.LISTAR_INFORMACION_LABORAL);
		q.setParameter(1, e);
		List<InformacionLaboral> lista = q.getResultList();
		return lista;
	}

	/**
	 * actualiza la Informacion Laboral de la base de datos
	 */
	public void editar(InformacionLaboral i) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(i);
		en.getTransaction().commit();
		
		
	}

	/**
	 * busca la Informacion Laboral 
	 * @cod identificador por el que se le va a buscar
	 */
	public InformacionLaboral buscarInfoLaboral(int cod) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(InformacionLaboral.class, cod);
	}

}
