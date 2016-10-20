/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;

/**
 * Interface responsable de definir 
 * las operaciones de ciente <br>
 * 
 * @author Camilo Andres Ferrer Bustos<br>
 * 
 * @date 5/08/2016
 * @version 1.0
 */
public interface IDAOCliente {
	
	public void crear(Cliente cliente) throws Exception;
	
	public void editar(Cliente cliente) throws Exception;
	
	public void eliminar(String cedula) throws Exception;
	
	public Cliente buscar(String cedula) throws Exception;
	
	public List<Cliente> listarTodos() throws Exception;
	
	

}
