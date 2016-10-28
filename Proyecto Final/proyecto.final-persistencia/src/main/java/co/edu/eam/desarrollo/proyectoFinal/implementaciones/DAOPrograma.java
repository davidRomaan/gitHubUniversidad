package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOPrograma;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOPrograma implements IDAOPrograma{
	/**
	 * Registra un programa en la bd
	 * @param p
	 * @throws Exception
	 */
	public void crearPrograma(Programa p) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(p);
		en.getTransaction().commit();
		
	}

	/**
	 * Buscamos un programa por su codigo
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Programa buscarPrograma(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Programa.class,id);

	}
	
	/**
	 * Edita un programa
	 * @param p
	 * @throws Exception
	 */
	public void editarPrograma(Programa p) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(p);
		en.getTransaction().commit();
	}
	
	/**
	 * Lista todos los programas
	 * @param facultad
	 * @return
	 * @throws Exception
	 */
	public List<Programa> listarPrograma() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Programa.LISTAR_PROGRAMAS);
		List<Programa> lista = q.getResultList();
		return lista;
	}
	
	/**
	 * Listamos todas los programas de una facultad que se encuentran en la bd
	 * @return lista con todas los programas de una facultad
	 * @throws Exception  en caso de una excepcion tecnica o de negocio.
	 */
	public List<Programa> listarProgramaFacultad(Facultad facultad) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Programa.LISTAR_PROGRAMAS_FACULTAD);
		q.setParameter(1, facultad);
		List<Programa> lista = q.getResultList();
		return lista;
	}
	/**
	 * Buscamos programas por nombre
	 * True en caso de que se encuentre un programa por un nombre
	 * de lo contrario false
	 */
	public boolean buscarProgramaNombre(String nombre) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Programa.BUSCAR_NOMBRE);
		q.setParameter(1, nombre);
		List<Programa> lista = q.getResultList();
		if(lista.size() > 0){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * Eliminar programa
	 * @param programa es el programa a eliminar
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void eliminar(Programa programa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.remove(programa);
		em.getTransaction().commit();
	}

}
