package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAORegistroCurso implements IDAORegistroCurso{

	public void crear(RegistroCurso r) {
		
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(r);
		en.getTransaction().commit();
		
	}

	public List<RegistroCurso> buscarCursoEstudiante(Estudiante es, Curso c) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(RegistroCurso.CONSULTA_REGISTRO_CURSO_ESTUDIANTES);
		q.setParameter(1, es);
		q.setParameter(2, c);
		List<RegistroCurso> lista = q.getResultList();
		return lista;
	}

	


	

	
}
