package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;

/**
 *  Interface responsable de definir las operaciones del estudiante
 * @author david
 *
 */
public interface IDAOEstudiante {
	
    public void crear (Estudiante e) throws Exception;
	
	public void editar (Estudiante e) throws Exception;
	
	public Estudiante buscar (String ced) throws Exception;
	
	public void eliminar (Estudiante e) throws Exception;
	
	public List<Estudiante>listarEstudiante(Curso c)throws Exception;

	public List<Nota> listarNotasEst(Estudiante e)throws Exception;
}
