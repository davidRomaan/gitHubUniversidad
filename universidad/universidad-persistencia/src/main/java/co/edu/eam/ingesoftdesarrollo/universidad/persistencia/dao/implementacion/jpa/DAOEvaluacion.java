package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOEvaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOEvaluacion implements IDAOEvaluacion {

	public void crearEvaluacion(Evaluacion e) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();

		en.getTransaction().begin();
		en.persist(e);
		en.getTransaction().commit();
	}

	public Evaluacion buscarEvaluacion(int cod) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Evaluacion.class, cod);
	}

	public double porcentaje(Curso p) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Evaluacion.CONSULTA_PORCENTAJE);
		q.setParameter(1, p);
		List<Double> lista = q.getResultList();
		if (lista.get(0) == null) {
			return 0;
		} else {
			double porc =  lista.get(0);
			return porc;
		}
	}

	public List<Evaluacion> listarTabla(Curso c) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Evaluacion.CONSULTA_EVALUACION);
		q.setParameter(1, c);
		List<Evaluacion> lista = q.getResultList();
		return lista;

	}

	public void eliminarEvaluacion(Evaluacion e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.remove(en.merge(e));
		en.getTransaction().commit();
	}

	public List<Evaluacion> listaEvaluaciones(Curso c, Asignatura a) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Evaluacion.CONSULTA_LISTA_EVALUACIONES_ASIGNATURA);
		q.setParameter(1, c);
		q.setParameter(2, a);
		List<Evaluacion> lista = q.getResultList();
		return lista;
	}
}
