package co.edu.eam.disenosoft.universidad.contrloadores;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.logica.bos.BOCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BODocente;
import co.edu.eam.disenosoft.universidad.logica.bos.BOSesionCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

/**
 * Clase responsable de controlar la ventana Crear curso
 * 
 * @author david
 *
 */
public class ControladorVentanaCrearCurso {

	private BOAsignatura boAsignatura;
	private BODocente boDocente;
	private BOCurso boCurso;
	private BOSesionCurso boSesion;

	public ControladorVentanaCrearCurso() {
		boDocente = new BODocente();
		boAsignatura = new BOAsignatura();
		boCurso = new BOCurso();
		boSesion = new BOSesionCurso();
	}

	public Asignatura buscarAsignatura(String cod) throws Exception {
		return boAsignatura.buscarAsignatura(cod);

	}

	public Profesor buscarProfesor(String ced) throws Exception {
		return boDocente.buscarDocente(ced);
	}

	public void crearCurso(Curso cur) throws Exception {
		boCurso.crearCuso(cur);
	}

	public void crearSesionCurso(SesionCurso ses) throws Exception {
     	boSesion.crearSesionCurso(ses);

	}

	public void eliminarSesion(Curso cur) throws Exception {
		boCurso.editarCurso(cur);
	}

	public void editarCurso(Curso cur) throws Exception {
		boCurso.editarCurso(cur);

	}

	public Curso buscarCurso(String cod) throws Exception {
		return boCurso.buscarCurso(cod);

	}
	public SesionCurso buscarSesion(int cod) throws Exception {
		return boSesion.buscarSesion(cod);
	}



}
