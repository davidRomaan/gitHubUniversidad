package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

/**
 * clase encargada de implementar todos los metodos de la asignatura
 * 
 * @author david
 *
 */
public class DAOAsignatura implements IDAOAsignatura {

	/**
	 * Crea una asignatura en la base de datos
	 * 
	 * @param as
	 *            asignatura que se va a registrar
	 */
	public void crear(Asignatura as) throws Exception {
		// TODO Auto-generated method stub

		EntityManager en = AdministradorEntityManager.getEntityManager();

		en.getTransaction().begin();
		en.persist(as);
		en.getTransaction().commit();

	}

	/**
	 * Edita una asignatura de la base de datos
	 * 
	 * @param as
	 *            asignatura la cual se le van a editar los datos
	 */
	public void editar(Asignatura as) throws Exception {
		// TODO Auto-generated method stub

		EntityManager en = AdministradorEntityManager.getEntityManager();

		en.getTransaction().begin();
		en.merge(as);
		en.getTransaction().commit();

	}

	/**
	 * busca una asignatura de la base de datos
	 * 
	 * @param cod
	 *            codigo por el cual se le va a buscar
	 */
	public Asignatura buscar(String cod) throws Exception {

		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Asignatura.class, cod);

	}

	/**
	 * Elimina una asignatura de la base de datos
	 * 
	 * @param as
	 *            asignatura que se va a eliminar
	 */
	public void eliminar(Asignatura as) throws Exception {
		// TODO Auto-generated method stub

		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.remove(en.merge(as));
		en.getTransaction().commit();

	}

	/**
	 * Suma los creditos que un estudiante registre de una asignatura
	 */
	public int sumatoriaCreditos(Estudiante ced) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(RegistroCurso.CONSULTA_SUMATORIA_CREDITOS);
		q.setParameter(1, ced);
		List<Long> lista = q.getResultList();
		if (lista.get(0) == null) {
			return 0;
		} else {
			return lista.get(0).intValue();
		}

	}


}
