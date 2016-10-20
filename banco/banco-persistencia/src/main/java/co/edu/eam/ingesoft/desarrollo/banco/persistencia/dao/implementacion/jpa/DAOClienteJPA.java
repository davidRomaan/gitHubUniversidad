package co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.definiciones.IDAOCliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.utilidades.AdministradorEntityManager;

/**
 * 
 * Clase responsable del DAO de cliente implementacion JPA <br>
 * 
 * @author Camilo Andres Ferrer Bustos<br>
 * 
 * @date 12/08/2016
 * @version 1.0
 */
public class DAOClienteJPA implements IDAOCliente {

	public void crear(Cliente cliente) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.persist(cliente);

		em.getTransaction().commit();

	}

	public void editar(Cliente cliente) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.merge(cliente);

		em.getTransaction().commit();

	}

	public void eliminar(String cedula) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		Cliente c = buscar(cedula);
		if (c != null) {
			em.remove(c);
		}
		em.getTransaction().commit();

	}

	public Cliente buscar(String cedula) throws Exception {

		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Cliente.class, cedula);

	}

	public List<Cliente> listarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
