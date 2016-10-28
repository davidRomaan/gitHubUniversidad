package co.edu.eam.desarrollo.proyectoFinal.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOEmpresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOEmpresa implements IDAOEmpresa{

	public void crearEmpresa(Empresa e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(e);
		en.getTransaction().commit();
		
	}

	public Empresa buscarEmpresa(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Empresa.class, id);
	}

	public void editarEmpresa(Empresa e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.merge(e);
        en.getTransaction().commit();
		
	}

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
	public List<Empresa> listar() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Empresa.LISTAR);
		List<Empresa> lista = q.getResultList();
		return lista;		
	}

	
	
	
	
	
}
