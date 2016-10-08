package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.ArrayList;
import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;

public interface IDAOAsignatura {

    public void crear (Asignatura as) throws Exception;
	
	public void editar (Asignatura as) throws Exception;
	
	public Asignatura buscar (String cod) throws Exception;
	
	public void eliminar (Asignatura as) throws Exception;
	
	public int sumatoriaCreditos(Estudiante ced)throws Exception;
	
}
