package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;



import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOProfesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOProfesor implements IDAOProfesor{


	
	/**
	 * crea un profesor en la base de datos
	 */
	public void crear(Profesor p) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		 
		en.getTransaction().begin();		
		en.persist(p);
		en.getTransaction().commit();
		
		
	}

	/**
	 * Edita un registro Profesor de la base de datos
	 */
	public void editar(Profesor p) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();

		en.getTransaction().begin();		
		en.merge(p);
		en.getTransaction().commit();
		
	}

	/**
	 * Busca un profesor en la base de datos
	 * @param ced cedula por la cual se va a buscar
	 */
	public Profesor buscar(String ced) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Profesor.class, ced);
	}

	/**
	 * elimina un profesor de la base de datos
	 * @param p profesor que se va a eliminar
	 */
	public void eliminar(Profesor p) throws Exception {
	EntityManager en = AdministradorEntityManager.getEntityManager();

		
		en.getTransaction().begin();		
		en.remove(en.merge(p));
		en.getTransaction().commit();
		
	}
	

	
	public List<Profesor> listarProfesores() throws Exception {
		// TODO Auto-generated method stub
		return null;  
	}




	
	
}
