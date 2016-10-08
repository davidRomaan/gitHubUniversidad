package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOProfesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOProfesion implements IDAOProfesion{

	public List<Profesion> listaarProfesionesJPA() throws Exception {
		// TODO Auto-generated method stub
		
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Profesion.LISTAR_PROFESIONES);
		List<Profesion> prof = q.getResultList();
		return prof;
		
		
	}

	public Profesion buscar(String nom) throws Exception {
		
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Profesion.class, nom);
		
	}

	
	
	
	
}
