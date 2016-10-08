package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.MergedSettings;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

/**
 * clase responsable del DAO de Estudiante, implementacion JPA
 * @author david
 *
 */
public class DAOEstudiante implements IDAOEstudiante{

	public void crear(Estudiante e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
 
		en.getTransaction().begin();		
		en.persist(e);
		en.getTransaction().commit();
		
	}

	public void editar(Estudiante e) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();

		en.getTransaction().begin();		
		en.merge(e);
		en.getTransaction().commit();
		
		
	}

	public Estudiante buscar(String ced) throws Exception {
		
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Estudiante.class, ced);
	}

	public void eliminar(Estudiante e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();

		
		en.getTransaction().begin();		
		en.remove(en.merge(e));
		en.getTransaction().commit();
		
		
	}

	public List<Estudiante> listarEstudiante(Curso c) throws Exception {
		
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(RegistroCurso.CONSULTA_ESTUDIANTES);
		q.setParameter(1, c);
		List<Estudiante> curso = q.getResultList();
		return curso;
		
		
	}

	
	public List<Nota> listarNotasEst(Estudiante e) throws Exception {
		
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Nota.CONSULTA_DETALLADA_EST);
		q.setParameter(1, e);
		List<Nota> lista = q.getResultList();
		return lista;
	}

}
