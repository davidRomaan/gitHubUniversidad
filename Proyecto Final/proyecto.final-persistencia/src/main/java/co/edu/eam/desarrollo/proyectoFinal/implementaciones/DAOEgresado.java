package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOEgresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOEgresado implements IDAOEgresado {
	/**
	 * Crear egresado
	 */
	public void crearEgresado(Egresado e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(e);
		en.getTransaction().commit();
	}
	
	/**
	 * buscar egresado
	 */
	public Egresado buscarEgresado(int cod) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Egresado.class, cod);
	}
	
	/**
	 * Editar egresado
	 */
	public void editar(Egresado e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.merge(e);
        en.getTransaction().commit();

	}
	
	/**
	 * Eliminar egresado
	 */
	public void eliminarEgresado(Egresado e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.remove(en.merge(e));
        en.getTransaction().commit();
	}
	/**
	 * busca un egresado por su numero de cedula y Tipo documento.
	 * @param e el egresado a buscar.
	 */
	public Egresado buscarEgresadoTipo(TipoDocumento tipo, String numero) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
        Query q = em.createQuery("SELECT e FROM Egresado e WHERE e.tipoDocumento = '"+tipo+"' AND e.numeroDocumento = '"+numero+"'");
		List<Egresado> lista = q.getResultList();
		if(lista.size() > 0){
			return lista.get(0);
		}else{
			return null;
		}
	}
}
