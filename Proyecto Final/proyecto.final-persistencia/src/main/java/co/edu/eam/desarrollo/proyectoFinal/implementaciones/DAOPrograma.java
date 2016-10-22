package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOPrograma;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOPrograma implements IDAOPrograma{

	public void crearPrograma(Programa p) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(p);
		en.getTransaction().commit();
		
	}
	public Programa buscarPrograma(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Programa.class,id);

	}
	public void editarPrograma(Programa p) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(p);
		en.getTransaction().commit();
	}
	
	public List<Programa> listarPrograma() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Programa.LISTAR_PROGRAMAS);
		List<Programa> pr = q.getResultList();
		return pr;
	}

}
