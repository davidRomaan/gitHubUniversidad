package co.edu.eam.disenosoft.universidad.contrloadores;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BODocente;
import co.edu.eam.disenosoft.universidad.logica.bos.BOEstudiante;
import co.edu.eam.disenosoft.universidad.logica.bos.BONota;
import co.edu.eam.disenosoft.universidad.logica.bos.BORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorIngresarCalificaciones {

	private BONota boNota;
	private BOEstudiante boEstudiante;
	private BODocente boDocente;
	private BOCurso boCurso;
	private BORegistroCurso boRegistroCurso;

	public ControladorIngresarCalificaciones() {
		boNota = new BONota();
		boDocente = new BODocente();
		boCurso = new BOCurso();
		boEstudiante = new BOEstudiante();
		boRegistroCurso = new BORegistroCurso();
	}

	public Profesor buscar(String ced) throws Exception {
		return boDocente.buscarDocente(ced);
	}

	public List<Curso> listarCombo(Profesor p) throws Exception {
		return boCurso.listarComboCursoDocente(p);
	}

	public List<Estudiante> estudiantes(Curso c) throws Exception {
		return boEstudiante.listarEstudiantes(c);
	}

	public String calificacionEstudiante(Estudiante e, Evaluacion a) throws Exception {
		return boNota.calificacionEstudianteEvaluacion(e, a);
	}
	public RegistroCurso registroEstudiante (Estudiante e, Curso c) throws Exception{
		return boRegistroCurso.registroEstudianteCurso(e, c);
	}
	
	public void agregarNota (Nota n, String colum) throws Exception{
		boNota.agregarNota(n, colum);
	}
}
