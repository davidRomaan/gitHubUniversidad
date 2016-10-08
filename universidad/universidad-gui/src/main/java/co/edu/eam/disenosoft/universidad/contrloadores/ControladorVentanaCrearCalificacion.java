package co.edu.eam.disenosoft.universidad.contrloadores;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.logica.bos.BOCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BOEvaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

public class ControladorVentanaCrearCalificacion {

	private BOAsignatura boAsignatura;
	private BOCurso boCurso;
	private BOEvaluacion boEvaluacion;

	public ControladorVentanaCrearCalificacion() {

		boAsignatura = new BOAsignatura();
		boCurso = new BOCurso();
		boEvaluacion = new BOEvaluacion();
	}

	public void agregarEvaluacion(Evaluacion e, double sum, double porc) throws Exception {
		boEvaluacion.crearEvaluacion(e,sum,porc);
	}

	public Evaluacion buscarEvaluacion(int cod) throws Exception {
		return boEvaluacion.buscarEvaluacion(cod);
	}

	public Asignatura buscarAsignatura(String cod) throws Exception {
		return boAsignatura.buscarAsignatura(cod);
	}

	public List<Curso> listarCombo(Asignatura a) throws Exception {
		return boCurso.listarTablaCurso(a);
	}
	
	public Curso buscarCurso (String cod)throws Exception{
		return boCurso.buscarCurso(cod);
	}
	
	public double porcentaje(Curso c)throws Exception{
		return boEvaluacion.porcentaje(c);
	}
	public List<Evaluacion> listarTabla(Curso c) throws Exception {
		return boEvaluacion.listarTablaEval(c);
	}
	public void eliminarEvaluacion(Evaluacion e)throws Exception{	
	    boEvaluacion.eliminarEvaluacion(e);    		
	}
	 public List<Evaluacion> listarEvaluacionesEstud(Curso c, Asignatura asi) throws Exception {
		 return boEvaluacion.listarEstudiantesAsig(c, asi);
	 }
	 
	
}
