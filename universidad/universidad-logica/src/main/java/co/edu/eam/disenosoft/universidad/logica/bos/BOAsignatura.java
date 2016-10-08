package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;

/**
 * 
 * @author david
 *
 */
public class BOAsignatura {

	private IDAOCurso daoCurso;
	private IDAOAsignatura daoAsignatura;
	private IDAOEstudiante daoEstudiante;

	public BOAsignatura() {
		daoAsignatura = new DAOAsignatura();
		daoEstudiante = new DAOEstudiante();
		daoCurso = new DAOCurso();
	}

	/**
	 * metodo que crea una Asignatura
	 * 
	 * @param a
	 *            la asignatura que se va a crear
	 * @return
	 * @throws Exception
	 *             en caso de que la asignatura ya este registrada
	 */
	public Asignatura crearAsignatura(Asignatura a) throws Exception {

		Asignatura estu = daoAsignatura.buscar(a.getCodigo());

		if (estu == null) {
			daoAsignatura.crear(a);
		} else {
			throw new ExcepcionNegocio("la asignatura ya se encuentra registrada");
		}
		return null;
	}

	/**
	 * metodo encargado de buscar una assignatura
	 * 
	 * @param cod
	 *            codigo por el que se va a buscar
	 * @return la asignatura
	 * @throws Exception
	 *             en caso de que haya una excepcion
	 */
	public Asignatura buscarAsignatura(String cod) throws Exception {
		return daoAsignatura.buscar(cod);
	}

	/**
	 * elimina una asignatura de la base de datos
	 * 
	 * @param a
	 *            asignatura que se va a eliminar
	 */
	public void eliminarAsignatura(Asignatura a) throws Exception {

		Asignatura as = daoAsignatura.buscar(a.getCodigo());
		List<Curso> lista = daoCurso.listarTablaCurso(a);
		if (!lista.isEmpty()) {
			throw new ExcepcionNegocio("no se puede eliminar la asignatura porque ya tiene un curso asignado");
		} else {
			if (as != null) {
				daoAsignatura.eliminar(as);

			}else{
				throw new ExcepcionNegocio("no existe la asignatura");

			}
		}
	}

	/**
	 * ediata una asignatura de la base de datos
	 * 
	 * @param a
	 *            asignatura que se va a editar
	 */
	public Asignatura editarAsignatura(Asignatura a) throws Exception {

		Asignatura as = daoAsignatura.buscar(a.getCodigo());
		if (as != null) {
			daoAsignatura.editar(a);
		} else {
			throw new ExcepcionNegocio("la asignatura no se encuentra registrada");
		}
		return null;
	}

	/**
	 * trae la sumatoria de creditos registrados por un estudiante
	 * 
	 * @param ced
	 *            cedula del estudiante
	 * @return la sumatoria si el estudiante existe
	 * @throws Exception
	 */
	public int creditosRegistrados(Estudiante ced) throws Exception {

		Estudiante est = daoEstudiante.buscar(ced.getCedula());
		if (est != null) {
			return daoAsignatura.sumatoriaCreditos(est);
		} else {
			throw new ExcepcionNegocio("no existe el estudiante");
		}
	}

}
