package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOCurso implements IDAOCurso {

	public void crear(Curso cur) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();

		en.getTransaction().begin();
		en.persist(cur);
		en.getTransaction().commit();

	}

	public Curso buscar(String cod) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Curso.class, cod);

	}

	public void editar(Curso cur) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();

		en.getTransaction().begin();
		en.merge(cur);
		en.getTransaction().commit();
	}

	public void eliminar(Curso cur) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.remove(en.merge(cur));
		en.getTransaction().commit();

	}

	public List<Curso> listarTablaCurso(Asignatura a) {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Curso.CONSULTA_TABLA_CURSOS_ASIGNATURA);
		q.setParameter(1, a);
		List<Curso> curso = q.getResultList();
		return curso;

	}
	
	public List<Curso>listarCursosDocente(Profesor p) {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Curso.CONSULTA_CURSOS_DE_UN_PROFESOR);
		q.setParameter(1, p);
		List<Curso> curso = q.getResultList();
		return curso;

	}

	public int tamañoCurso(Asignatura a) {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Curso.CONSULTA_TABLA_CURSOS_ASIGNATURA);
		q.setParameter(1, a);
		List<Long> curso = q.getResultList();
		if (curso != null) {
			return curso.size();
		} else {
			return curso.get(0).intValue();
		}
	}

	public List<RegistroCurso> listaRegistroCursosEstudiante(Estudiante e) {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(RegistroCurso.CONSULTA_REGISTRO_CURSO);
		q.setParameter(1, e);
		List<RegistroCurso> lista = q.getResultList();
		return lista;

	}

	
	public List<RegistroCurso> listaCursosEstudiante(Estudiante e, Curso c) {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(RegistroCurso.CONSULTA_REGISTRO_CURSO_ESTUDIANTES);
		q.setParameter(1, e);
		q.setParameter(2, c);
		List<RegistroCurso> lista = q.getResultList();
		return lista;
	}

	public void eliminarRegistroCursoEstudiante(Estudiante e, String a) {
		
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		Query q = en.createNamedQuery(RegistroCurso.CONSULTA_CURSOS_REGISTRADOS_ESTUDIANTE);
		q.setParameter(1, e);
		q.setParameter(2, a);
		List<RegistroCurso> lista = q.getResultList();
    	RegistroCurso reg = lista.get(0);
    	en.remove(en.merge(reg));
	    en.getTransaction().commit();
	}

}
