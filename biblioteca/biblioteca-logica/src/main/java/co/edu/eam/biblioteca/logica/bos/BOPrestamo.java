package co.edu.eam.biblioteca.logica.bos;

import java.util.List;

import co.edu.eam.biblioteca.persistencia.dao.definiciones.IDAOPrestamo;
import co.edu.eam.biblioteca.persistencia.dao.implementaciones.jpa.DAOPrestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Libro;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Prestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;
import co.edu.eam.bibliteca.excepciones.ExcepcionNegocio;

public class BOPrestamo {

	private IDAOPrestamo daoPrestamo;
	public BOPrestamo(){
		
		daoPrestamo = new DAOPrestamo();
	}
	
	/**
	 * metodo encargado de buscar un usuario
	 * 
	 * @param ced
	 *            cedula por el que se va a buscar
	 * @return el usuario
	 * @throws Exception
	 *             en caso de que haya una excepcion
	 */
	public Usuario buscarUsuario(String ced) throws Exception {
		return daoPrestamo.buscar(ced);
	}
	
	public Libro buscarLibro(String cod) throws Exception {
		return daoPrestamo.buscarLibro(cod);
	}
	
	
	/**
	 * 
	 * @param p
	 * @param cod
	 * @return
	 * @throws Exception
	 */
	public Prestamo crearPrestamo (Prestamo p, String cod)throws Exception{
		
		Libro libr = daoPrestamo.buscarLibro(cod); 
		if(libr != null){
			daoPrestamo.crear(p);
		}else{
			throw new ExcepcionNegocio("no existe este libro para  prestar");
		}
		return null;
	}
	
	
	public List<Prestamo> listarPrestamosUsu(Usuario u) throws Exception {
		List<Prestamo> lista = daoPrestamo.listarPrestamosUsuario(u);
		return lista;
	}
}
