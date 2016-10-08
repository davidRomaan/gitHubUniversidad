package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;

public interface IDAONota {

	public List<Nota> notasEstudianteEval (Estudiante e, Evaluacion eval) throws Exception;
	
	public void agregarCalificacion (Nota n) throws Exception;
	
	public void editarNota(Nota n) throws Exception;
	
	public List<Nota> notasEstudiante (Estudiante e) throws Exception;

}
