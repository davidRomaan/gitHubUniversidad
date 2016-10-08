package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public interface IDAORegistroCurso {

	public void crear(RegistroCurso r); 
	
	public List<RegistroCurso> buscarCursoEstudiante (Estudiante es, Curso c) throws Exception;
	
}
