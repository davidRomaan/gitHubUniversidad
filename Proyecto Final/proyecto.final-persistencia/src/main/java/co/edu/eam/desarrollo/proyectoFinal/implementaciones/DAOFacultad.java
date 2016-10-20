package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import javax.persistence.EntityManager;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOFacultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOFacultad implements IDAOFacultad {

	public void crearFacultad(Facultad f) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(f);
		en.getTransaction().commit();
	}

	public Facultad buscarFacultad(String nom) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Facultad.class, nom);
	}

	public void editar(Facultad f) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(f);
		en.getTransaction().commit();
	}

	

}
