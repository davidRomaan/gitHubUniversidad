package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOEgresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.HistorialLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOEgresado implements IDAOEgresado {
	/**
	 * Crear egresado
	 */
	public void crearEgresado(Egresado egresado) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(egresado);
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
	 * Buscar informacion laboral de un egresado
	 */
	public InformacionLaboral buscarInfoLaboral(int id) throws Exception{
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(InformacionLaboral.class, id);
	}
	/**
	 * Buscar informacion academica de un egresado
	 */
	public InformacionAcademica buscarInfoAcademica(int id) throws Exception{
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(InformacionAcademica.class, id);
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


	public void crearInformacionLaboral(InformacionLaboral informacionLaboral) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(informacionLaboral);
		en.getTransaction().commit();
	}


	public void crearInformacionAcademica(InformacionAcademica ia) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(ia);
		en.getTransaction().commit();
	}
	
	/**
	 * crear Historial laboral del egresado
	 */
	public void crearHistorialLaboral(HistorialLaboral hl) throws Exception{
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(hl);
		en.getTransaction().commit();
	}
	
	/**
	 * editar informacion laboral del egresado
	 */
	public void editarInfoLaboral(InformacionLaboral l) throws Exception{
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.merge(l);
        en.getTransaction().commit();
	}
	/**
	 * editar informacion academica del egresado
	 */
	public void editarInfoAcademica(InformacionAcademica a) throws Exception{
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.merge(a);
        en.getTransaction().commit();
	}
}
