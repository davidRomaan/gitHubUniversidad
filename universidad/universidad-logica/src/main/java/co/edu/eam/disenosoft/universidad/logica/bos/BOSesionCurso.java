package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOProfesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOSesionCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOProfesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOSesionCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

public class BOSesionCurso {

	private IDAOSesionCurso daoSesion;
	private IDAOProfesor daoProfesor;

	public BOSesionCurso() {

		daoSesion = new DAOSesionCurso();
		daoProfesor = new DAOProfesor();
	}

	/**
	 * metodo que registra una sesion
	 * 
	 * @param s
	 *            la sesion que se va a registrar
	 * @return las sesion, null si no se pudo crear
	 * @throws Exception
	 *             en caso de que se cree una sesion a un docente el mismo dia a
	 *             la misma hora
	 */
	public void crearSesionCurso(SesionCurso s) throws Exception {

		if (s.getHoraInicio() >= s.getHoraFinal()) {
			throw new ExcepcionNegocio("La hora de inicio no puede ser mayor o igual a la hora final");
		} else {
			Profesor p = daoProfesor.buscar(s.getCodCurso().getDocente().getCedula());

			if (p == null) {
				throw new ExcepcionNegocio("El docente no esta registrado");
			} else {

				List<SesionCurso> sesiones = daoSesion.listarHorarios(s.getCodCurso().getDocente());

				boolean entro = false;
				if (sesiones.size() == 0) {
					daoSesion.crearSesion(s);
				} else {
					for (int i = 0; i < sesiones.size(); i++) {
						if (sesiones.get(i).getDia().equals(s.getDia())
								&& sesiones.get(i).getHoraInicio() <= s.getHoraInicio()
								&& s.getHoraInicio() < sesiones.get(i).getHoraFinal()) {
							entro = true;
						}
					}
					if (entro == true) {
						throw new ExcepcionNegocio("El docente ya tiene una sesión en este mismo día y la misma hora");
					} else {
			           daoSesion.crearSesion(s);
					}
				}
			}
		}
		// Profesor pro =
		// daoProfesor.buscar(s.getCodCurso().getDocente().getCedula());
		// if (pro == null) {
		// throw new ExcepcionNegocio("este docente no se encuentra
		// registrado");
		// } else {
		// List<SesionCurso> sesion =
		// daoSesion.listarHorariosJPA(s.getCodCurso().getDocente());
		//
		// if (sesion.size() == 0) {
		// daoSesion.crearSesion(s);
		// } else {
		// for (int i = 0; i < sesion.size(); i++) {
		// if (sesion.get(i).getDia().equals(s.getDia())
		// && sesion.get(i).getHoraInicio() == s.getHoraInicio()) {
		// throw new ExcepcionNegocio("este docente ya tiene registrado una
		// sesion el mismo dia a la misma hora");
		// } else {
		// daoSesion.crearSesion(s);
		// }
		// }
		// }
		// }
		// return null;

	}

	/**
	 * busca una sesion por el codigo
	 * 
	 * @param cod
	 *            codigo por el que se va a buscar
	 * @return la sesion
	 */
	public SesionCurso buscarSesion(int cod) {
		return daoSesion.buscarSesion(cod);
	}

	/**
	 * elimina una sesion de un curso
	 * 
	 * @param cod
	 *            codigo de la sesion por la cual se va a eliminar
	 */
	public void eliminarSesion(int cod) {
		daoSesion.eliminarSesion(cod);

	}
}
