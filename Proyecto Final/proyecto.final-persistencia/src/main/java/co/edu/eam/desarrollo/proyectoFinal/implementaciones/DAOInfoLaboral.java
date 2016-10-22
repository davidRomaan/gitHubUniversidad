package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOInfoLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOInfoLaboral implements IDAOInfoLaboral {

	public void crear(InformacionLaboral i) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(i);
		en.getTransaction().commit();

	}

	public List<InformacionLaboral> listarInformacionLaboralEgres(Egresado e) {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(InformacionLaboral.LISTAR_INFORMACION_LABORAL);
		q.setParameter(1, e);
		List<InformacionLaboral> lista = q.getResultList();
		return lista;
	}

	public void editar(InformacionLaboral i) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(i);
		en.getTransaction().commit();
		
		
	}

}
