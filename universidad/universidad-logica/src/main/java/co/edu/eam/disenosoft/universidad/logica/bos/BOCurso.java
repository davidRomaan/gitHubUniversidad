package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;
import java.util.ResourceBundle.Control;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOSesionCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOSesionCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

public class BOCurso {

	private IDAOCurso daoCurso;
	private IDAOSesionCurso daoSesion;

	public BOCurso() {
		daoSesion = new DAOSesionCurso();
		daoCurso = new DAOCurso();
	}

	/**
	 * crea un Curso en la base de datos
	 * 
	 * @param cur
	 *            curso que se va a registrar
	 * @return
	 * @throws Exception
	 *             en caso de que halla una excepcion tecnica o de negocio
	 */
	public Curso crearCuso(Curso cur) throws Exception {

		Curso curso = daoCurso.buscar(cur.getCodigo());
		if (curso == null) {

			daoCurso.crear(cur);
		} else {
			throw new ExcepcionNegocio("El curso ya se encuentra registrado");
		}

		return null;
	}

	/**
	 * busca un curso
	 * 
	 * @param cod
	 *            codigo del curso por el que se va a buscar
	 * @return el curso
	 * @throws Exception
	 *             si ocurre una excepcion tecnica
	 */
	public Curso buscarCurso(String cod) throws Exception {
		return daoCurso.buscar(cod);
	}

	/**
	 * edita un curso
	 * 
	 * @param cur
	 *            curso que se va a edita
	 * @throws Exception
	 *             si ocurre una excepcion tecnica
	 */
	public void editarCurso(Curso cur) throws Exception {

	    List<SesionCurso> sesiones = daoSesion.listarHorarios(cur.getDocente());
		List<SesionCurso> listaSesiones = cur.getSesiones();
		boolean bandera = false;
		for (int i = 0; i <sesiones.size(); i++) {
			for (int j = 0; j <listaSesiones.size(); j++) {
				
				if(sesiones.get(i).getDia().equals(listaSesiones.get(j).getDia())&& sesiones.get(i).getHoraInicio()
						<= listaSesiones.get(j).getHoraInicio()&& listaSesiones.get(j).getHoraInicio()< sesiones.get(i).getHoraFinal()){
					bandera = true;
				}
			}	
		}
		if(bandera == false){
			daoCurso.editar(cur);
		}else{
			throw new ExcepcionNegocio("no se puede editar el curso porque se cruzan lo horarios del docente");
		}
	
	}

	/**
	 * lista los cursos de una asignatura
	 * 
	 * @param a
	 *            la asignatura
	 * @return los cursos de esa asignatura
	 * @throws Exception
	 */
	public List<Curso> listarTablaCurso(Asignatura a) throws Exception {
		List<Curso> lista = daoCurso.listarTablaCurso(a);
		return lista;
	}

	/**
	 * lista los cursos registrados de un estudiante
	 * 
	 * @param e
	 *            estudiante
	 * @return la lista de cursos
	 */
	public List<RegistroCurso> listaRegistroCursosEstudiante(Estudiante e) {
		List<RegistroCurso> lista = daoCurso.listaRegistroCursosEstudiante(e);
		return lista;
	}

	/**
	 * elimina un registro de un curso de un estudiante
	 * 
	 * @param e
	 *            el estudiante al que se le va a eliminar del curso
	 * @param asig
	 *            asignatura de la que se va a eliminar
	 */
	public void eliminarRegistroCursoEstudiante(Estudiante e, String asig) {
		daoCurso.eliminarRegistroCursoEstudiante(e, asig);
	}

	/**
	 * lista los cursos de una asignatura
	 * 
	 * @param a
	 *            la asignatura
	 * @return los cursos de esa asignatura
	 * @throws Exception
	 */
	public List<Curso> listarComboCursoDocente(Profesor p) throws Exception {
		List<Curso> lista = daoCurso.listarCursosDocente(p);
		return lista;
	}

}
