package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAONota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAONota implements IDAONota {

	/**
	 * Obtiene la nota de una evaluación de un estudiante
	 * 
	 * @param e
	 *            El estudiante
	 * @param a
	 *            La Evaluación
	 * @return La calificacion
	 * @throws Exception
	 *             si falla la operación
	 */
	public List<Nota> notasEstudianteEval(Estudiante e, Evaluacion eval) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Nota.CALIFICACION_ESTUDIANTE);
		q.setParameter(1, e);
		q.setParameter(2, eval);
		List<Nota> lista = q.getResultList();
		return lista;
	}

	/**
	 * crea una calificacion 
	 */
	public void agregarCalificacion(Nota n) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(n);
		em.getTransaction().commit();

	}

	/**
	 * edita la nota
	 */
	public void editarNota(Nota n) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(n);
		em.getTransaction().commit();
	}

	/**
	 * obtiene las notas de un estudiante 
	 */
	public List<Nota> notasEstudiante(Estudiante e) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Nota.CONSULTA_DETALLADA_EST);
		q.setParameter(1, e);
		List<Nota> lista = q.getResultList();
		return lista;
	}

}
