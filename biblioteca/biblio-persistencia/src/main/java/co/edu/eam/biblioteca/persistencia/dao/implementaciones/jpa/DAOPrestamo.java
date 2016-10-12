package co.edu.eam.biblioteca.persistencia.dao.implementaciones.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.biblioteca.persistencia.dao.definiciones.IDAOPrestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Libro;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Prestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;
import co.edu.eam.ingesoft.desarrollo.biblioteca.persistencia.utilidades.AdministradorEntityManager;

public class DAOPrestamo implements IDAOPrestamo {

	public void crear(Prestamo p) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(p);
		en.getTransaction().commit();

	}

	public Usuario buscar(String ced) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Usuario.class, ced);

	}
	
	public Libro buscarLibro(String cod) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Libro.class, cod);

	}

	public List<Prestamo> listarPrestamosUsuario(Usuario u) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Prestamo.PRESTAMOS_USUARIO);
		q.setParameter(1, u);
		List<Prestamo> curso = q.getResultList();
		return curso;
	}

	public int sumatoriaLibrosUs(Usuario u) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Prestamo.LIBROS_PRESTADOS_DE_UN_USUARIO);
		q.setParameter(1, u);
		List<Integer> lista = q.getResultList();
		if (lista.get(0) == null) {
			return 0;
		} else {
			int porc =  lista.get(0).intValue();
			return porc;
		}
	}

}
