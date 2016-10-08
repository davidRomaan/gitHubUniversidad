package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;

public interface IDAOEvaluacion {

	
	public void crearEvaluacion (Evaluacion e)throws Exception;
	
	public Evaluacion buscarEvaluacion(int cod)throws Exception;
	
	public double porcentaje (Curso p)throws Exception;
		
	public List<Evaluacion> listarTabla (Curso c)throws Exception;
	
	public void eliminarEvaluacion(Evaluacion e)throws Exception;
	
	public List<Evaluacion> listaEvaluaciones(Curso c, Asignatura a)throws Exception;
	
}
