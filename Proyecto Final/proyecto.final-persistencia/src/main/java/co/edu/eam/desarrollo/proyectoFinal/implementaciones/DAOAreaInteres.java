package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOAreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreasEgresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOAreaInteres implements IDAOAreaInteres {

	/**
	 * crea un objeto Area de interes en la base de datos
	 */
	public void crear(AreaInteres a) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(a);
		en.getTransaction().commit();
	}

	/**
	 * busca el area de interes 
	 * @id identificador por el que se le va a buscar
	 */
	public AreaInteres buscar(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(AreaInteres.class, id);
	}

	/**
	 * actualiza el area de interes de la base de datos
	 */
	public void editar(AreaInteres f) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(f);
		en.getTransaction().commit();
	}
   	/**
	 * Listamos todas las areas de interes que se encuentran en la bd
	 * @return lista con todas las areas de interes
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<AreaInteres> listar() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(AreaInteres.LISTAR);
		List<AreaInteres> lista = q.getResultList();
		return lista;
	}
	/**
	 * Busca un area de interes por nombre
	 * @param nombre nombre del area a interes a buscar
	 * @return true si ya hay un area de interes con ese nombre, de lo contrario false
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public boolean buscarByNombre(String nombre) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(AreaInteres.BUSCAR_NOMBRE);
		q.setParameter(1, nombre);
		List<AreaInteres> lista = q.getResultList();
		if(lista.size() > 0){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * busca un area de interes de un determinado egresado
	 */
	public AreasEgresado buscarAreaInteresEgresado(AreasEgresado interes) throws Exception{
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(AreasEgresado.BUSCAR);
		q.setParameter(1, interes.getEgresado());
		q.setParameter(2, interes.getAreaInteres());
		List<AreasEgresado> lista = q.getResultList();
		if(lista.size() > 0){
			return lista.get(0);
		}else{
			return null;
		}
	}
	/**
	 * Agrega un area de interes a un determinado egresado
	 */
	public void addAreaInteresEgresado(AreasEgresado interes) throws Exception{
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(interes);
		en.getTransaction().commit();
	}
	/**
	 * Listamos todas las ares de interes de un egresado
	 * @return lista con todas las areas de interes
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<AreaInteres> listarAreaInteresEgresado(Egresado e) throws Exception{
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createQuery("SELECT a FROM AreasEgresado a WHERE a.egresado = '"+e.getId()+"'");
		List<AreasEgresado> list = q.getResultList();
		List<AreaInteres> lista = new ArrayList<AreaInteres>();
		for (AreasEgresado a: list) {
			lista.add(a.getAreaInteres());
		}
		return lista;
	}

}
