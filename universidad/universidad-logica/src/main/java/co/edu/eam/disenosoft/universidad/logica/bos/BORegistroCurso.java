package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jdbc.DAOEstudianteJDBC;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class BORegistroCurso {

	private IDAOCurso daoCurso;
	private IDAORegistroCurso daoRegistroCurso;
	private IDAOAsignatura daoAsignatura;
	private IDAOEstudiante daoEstudiante;

	public BORegistroCurso() {
		daoAsignatura = new DAOAsignatura();
		daoRegistroCurso = new DAORegistroCurso();
		daoEstudiante = new DAOEstudiante();
		daoCurso = new DAOCurso();
	}

	/**
	 * metodo que permite crear el registro de un curso a un estudiante
	 * 
	 * @param r
	 *            el registro del curso
	 * @throws Exception
	 *             excepciones de negocio
	 */
	public void crearRegistro(RegistroCurso r) throws Exception {

		boolean bandera = false;
		Estudiante es = daoEstudiante.buscar(r.getEstudiante().getCedula());
		int capacidad = daoCurso.tamañoCurso(r.getCurso().getAsignatura());
		List<RegistroCurso> regEstudiante = daoCurso.listaCursosEstudiante(es, r.getCurso());

		if (es != null) {
			double creditos = daoAsignatura.sumatoriaCreditos(es);
			if (r.getCurso().getAsignatura().getNumeroCreditos() + creditos > 12) {
				throw new ExcepcionNegocio("solo se puede regstrar hasta 12 creditos academicos");
			} else {
				if (capacidad == 10) {
					throw new ExcepcionNegocio("este curso esta lleno");
				} else {
					if (regEstudiante.size() != 0) {
						for (int i = 0; i < regEstudiante.size(); i++) {
							if (regEstudiante.get(i).getCurso().getAsignatura().getNombre()
									.equals(r.getCurso().getAsignatura().getNombre())) {

								bandera = true;
							}
						}
						if (bandera == true) {
							throw new ExcepcionNegocio("el estudiante ya tiene registrada esta misma materia");
						} else {
							daoRegistroCurso.crear(r);
						}
					}
					daoRegistroCurso.crear(r);

				}
				daoRegistroCurso.crear(r);
			}
		}
	}
	
	public RegistroCurso registroEstudianteCurso (Estudiante e, Curso c) throws Exception{
		List<RegistroCurso> lista = daoRegistroCurso.buscarCursoEstudiante(e, c);
		return lista.get(0);
	}
}
