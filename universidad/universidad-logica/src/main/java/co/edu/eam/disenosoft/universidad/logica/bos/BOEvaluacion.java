package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOEvaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOEvaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;

public class BOEvaluacion {

	private IDAOEvaluacion daoEvaluacion;
	private IDAOCurso daoCurso;

	public BOEvaluacion() {

		daoEvaluacion = new DAOEvaluacion();
		daoCurso = new DAOCurso();
	}

	/**
	 * crea una evaluacion en la base de datos
	 * 
	 * @param e
	 *            la evaluacion que se va a crear
	 * @return null si no se ejecuto el metodo por alguna razon
	 * @throws Exception
	 *             mensaje indicando si ya esta la evaluacion registrada
	 */
	public void crearEvaluacion(Evaluacion e,double sum, double porc) throws Exception {
		Curso c = daoCurso.buscar(e.getCurso().getCodigo());
		Evaluacion eval = daoEvaluacion.buscarEvaluacion(e.getCodigoEval());
		if (eval != null) {
			throw new ExcepcionNegocio("Esta Evaluacion ya se encuentra registrada ");
		} else {
			if (sum + porc < 100) {
				daoEvaluacion.crearEvaluacion(e);
			} else {
				throw new ExcepcionNegocio("no se puede superar el 100%");
			}
		}
	}

	/**
	 * busca una evaluacion de la base de datos
	 * 
	 * @param cod
	 *            codigo por el que se va a buscar
	 * @return la evaluacion
	 * @throws Exception
	 *             en caso de que ocurra una excepcion de negocio
	 */
	public Evaluacion buscarEvaluacion(int cod) throws Exception {
		return daoEvaluacion.buscarEvaluacion(cod);
	}

	/**
	 * devuelve la suma del porsentase registrado
	 * 
	 * @param p
	 *            el curso
	 * @return el porcentaje
	 * @throws Exception
	 *             en caso de que ocurra una excepcion de tecnica
	 */
	public double porcentaje(Curso p) throws Exception {
		return daoEvaluacion.porcentaje(p);

	}

	/**
	 * retorna el objeto evaluacion
	 * @param c curso al que se levan a listar las califiacaiones
	 * @return la evaluacion
	 * @throws Exception en caso de que ocurra una excepcion tecnica
	 */
	public List<Evaluacion> listarTablaEval(Curso c) throws Exception {
		return daoEvaluacion.listarTabla(c);
	}
	
	public void eliminarEvaluacion(Evaluacion e)throws Exception{
		daoEvaluacion.eliminarEvaluacion(e);
	}
	
	public List<Evaluacion>listarEstudiantesAsig(Curso c, Asignatura a)throws Exception{
		return daoEvaluacion.listaEvaluaciones(c, a);
	}
}
