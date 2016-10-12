package co.edu.eam.biblioteca.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.biblioteca.persistencia.modelo.entidades.Libro;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Prestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;

public interface IDAOPrestamo {

	public void crear (Prestamo p) throws Exception;
	
	public Usuario buscar (String ced) throws Exception;
	
	public Libro buscarLibro(String cod)throws Exception;
	
	public List<Prestamo> listarPrestamosUsuario (Usuario u)throws Exception;
	


	
}
