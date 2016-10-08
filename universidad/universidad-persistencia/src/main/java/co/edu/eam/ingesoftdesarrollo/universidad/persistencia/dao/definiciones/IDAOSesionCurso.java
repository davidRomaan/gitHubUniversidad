package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

public interface IDAOSesionCurso {

	
	public void crearSesion (SesionCurso s) throws Exception;
	
	public List<SesionCurso> listarHorarios(Profesor profesor) throws Exception;

	public SesionCurso buscarSesion(int cod);
	
	public void  eliminarSesion(int cod);
}
