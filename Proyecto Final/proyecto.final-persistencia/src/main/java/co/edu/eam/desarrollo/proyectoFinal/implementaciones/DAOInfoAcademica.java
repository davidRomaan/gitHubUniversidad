package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOInfoAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOInfoAcademica implements IDAOInfoAcademica {

	public void crear(InformacionAcademica i) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(i);
		en.getTransaction().commit();
	}

	public void editar(InformacionAcademica i) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(i);
		en.getTransaction().commit();

	}

	public List<InformacionAcademica> listarInformacionAcademicaEgres(Egresado e) {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(InformacionAcademica.LISTAR_INFORMACION_ACADEMICA);
		q.setParameter(1, e);
		List<InformacionAcademica> info = q.getResultList();
		return info;
	}

	public InformacionAcademica buscarInfoAcadem(int cod) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(InformacionAcademica.class, cod);
	}

}
