package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;	

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOEmpresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Ciudad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Departamento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOEmpresa implements IDAOEmpresa{

	/**
	 * crea un objeto Empresa en la base de datos
	 */
	public void crearEmpresa(Empresa e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(e);
		en.getTransaction().commit();
		
	}

	/**
	 * busca la empresa en la base de datos 
	 * @nit identificador por el que se le va a buscar
	 */
	public Empresa buscarEmpresa(String nit) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Empresa.class, nit);
	}


	/**
	 * actualiza la empresa de la base de datos
	 */
	public void editarEmpresa(Empresa e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.merge(e);
        en.getTransaction().commit();
		
	}

	/**
	 * elimina la empresa de la base de datos
	 * @em empresa que se va a eliminar
	 */
	public void eliminarEmpresa(Empresa e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.remove(en.merge(e));
        en.getTransaction().commit();
		
	}
	/**
	 * Lista todas las empresas registradas en la bd
	 * @return lista con todas las empresa
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Empresa> listarEmpresas() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Empresa.LISTAR_EMPRESAS);
		List<Empresa> lista = q.getResultList();
		return lista;
	}

	/**
	 * Lista todas los departamentos registradas en la bd
	 * @return lista con todos los departamentos
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Departamento> listarDepartamentos() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Departamento.LISTAR_DEPARTAMENTOS);
		List<Departamento> lista = q.getResultList();
		return lista;
	}

	/**
	 * Lista todas las ciudades registradas en la bd
	 * @return lista con todas las ciudades
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Ciudad> listarCiudades() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Ciudad.LISTAR_CIUDADES);
		List<Ciudad> lista = q.getResultList();
		return lista;
	}

	/**
	 * Lista todas los sectores laborales registradas en la bd
	 * @return lista con todas los sectores
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<SectorLaboral> listarSectorLab() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(SectorLaboral.LISTAR_SECTORES);
		List<SectorLaboral> lista = q.getResultList();
		return lista;
	}

	
	
	
	
	
}
