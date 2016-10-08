package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public interface IDAOCurso {

	
	public void crear (Curso cur)throws Exception;
		
	public Curso buscar (String cod)throws Exception;
	
	public void editar (Curso cur)throws Exception;
	
	public void eliminar (Curso cur)throws Exception;
	
	public List<Curso> listarTablaCurso (Asignatura a)throws Exception;
	
	public int tamañoCurso (Asignatura a)throws Exception;

	public List<RegistroCurso> listaRegistroCursosEstudiante(Estudiante e);
	
	public List<RegistroCurso> listaCursosEstudiante(Estudiante e, Curso c);
	
	public void eliminarRegistroCursoEstudiante(Estudiante e, String a);
	
	public List<Curso>listarCursosDocente(Profesor p)throws Exception;
	

}
