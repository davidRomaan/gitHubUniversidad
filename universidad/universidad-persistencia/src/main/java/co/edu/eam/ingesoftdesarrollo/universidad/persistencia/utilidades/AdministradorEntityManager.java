package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author david
 *
 */
public class AdministradorEntityManager {

	private static EntityManager em;
	
	public static EntityManager getEntityManager(){
		
		if(em == null){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_pu");
		
		 em = emf.createEntityManager();
		}	
		return em;
	}
}
