package co.edu.eam.disenosoft.universidad.contrloadores;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.logica.bos.BOCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BOEstudiante;
import co.edu.eam.disenosoft.universidad.logica.bos.BONota;
import co.edu.eam.disenosoft.universidad.logica.bos.BORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;

public class ControladorVentanaVerCalificaciones {

	private BOAsignatura boAsignatura;
	private BOCurso boCurso;
	private BOEstudiante boEstudiante;
	private BONota boNota;
	public ControladorVentanaVerCalificaciones(){
		
		boAsignatura = new BOAsignatura();
		boCurso = new BOCurso();
		boEstudiante = new BOEstudiante();
		boNota = new BONota();
	}
	
	
	public Asignatura buscarAsignatura (String cod) throws Exception{
		return boAsignatura.buscarAsignatura(cod);
	}
	public List<Estudiante> estudiantesCurso (Curso c) throws Exception{
		return boEstudiante.listarEstudiantes(c);
	}
	public List<Nota> notasEstudiante (Estudiante e) throws Exception{
		return boNota.notasEstudiante(e);
	}
	public double calificacionEstudiante (List<Nota> notas){
		return boNota.calcularDefinitiva(notas);
		}
	public List<Curso> cursosAsig (Asignatura a) throws Exception{
		return boCurso.listarTablaCurso(a);
	}
}
