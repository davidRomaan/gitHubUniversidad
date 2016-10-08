/**
 * 
 */
package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.ArrayList;
import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;

/**
 * Interface responsable de definir las operaciones del Profesor
 * @author david 
 *
 */
public interface IDAOProfesor {
	
	public void crear (Profesor p) throws Exception;
	
	public void editar (Profesor p) throws Exception;
	
	public Profesor buscar (String ced) throws Exception;
	
	public void eliminar (Profesor p) throws Exception;
	
	public List<Profesor> listarProfesores() throws Exception;
		
}
