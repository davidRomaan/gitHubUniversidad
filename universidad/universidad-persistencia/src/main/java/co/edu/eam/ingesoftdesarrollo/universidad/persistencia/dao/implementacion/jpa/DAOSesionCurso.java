package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOSesionCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.SesionCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOSesionCurso implements IDAOSesionCurso {

	public void crearSesion(SesionCurso s) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(s);
		en.getTransaction().commit();

	}

	public List<SesionCurso> listarHorarios(Profesor profesor) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		javax.persistence.Query q = en.createNamedQuery(SesionCurso.CONSULTA_SESIONES_DOCENTE);
		q.setParameter(1, profesor);
		List<SesionCurso> horario = q.getResultList();
		return horario;
	}

	public SesionCurso buscarSesion(int cod) {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(SesionCurso.class, cod);
	}

	// public void eliminarSesion(int cod) {
	// EntityManager en = AdministradorEntityManager.getEntityManager();
	// Query q = en.createNamedQuery(SesionCurso.ELIMINAR_SESION);
	// q.setParameter(1, cod);
	// }

	public void eliminarSesion(int cod) {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		SesionCurso ses = buscarSesion(cod);
		if (ses != null) {
		en.remove(ses);
		}
		en.getTransaction().commit();

	}

}
