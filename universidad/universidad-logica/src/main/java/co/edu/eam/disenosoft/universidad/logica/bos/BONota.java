package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAONota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAONota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;

public class BONota {

	private DAONota daoNota;

	public BONota() {

		daoNota = new DAONota();
	}

	/**
	 * devuelve la calificación de una evaluación de un estudiante
	 * 
	 * @param e
	 *            El estudiante
	 * @param eval
	 *            La Evaluación
	 * @return La calificacion
	 * @throws Exception
	 *             si ocurre una excepcion de negocio
	 */
	public String calificacionEstudianteEvaluacion(Estudiante e, Evaluacion eval) throws Exception {
		List<Nota> lista = daoNota.notasEstudianteEval(e, eval);
		if (!lista.isEmpty()) {
			return lista.get(0).getValor() + "";
		} else {
			return "NC";
		}
	}

	/**
	 * Agrega una nota
	 * 
	 * @param n
	 *            nota que se va a agregar
	 * @throws Exception
	 *             si ocurre una excepcion tecnica o de negocio
	 */
	public void agregarNota(Nota n, String c) throws Exception {
		
		Nota not = null;
		List<Nota> notas = daoNota.notasEstudianteEval(n.getRegistroCurso().getEstudiante(), n.getEvaluacion());
		if (!notas.isEmpty()) {
			not = notas.get(0);
		}
		if (not == null) {
			daoNota.agregarCalificacion(n);
		} else {
			if (!c.equals("NC") && not.isEditada() == true) {
				throw new ExcepcionNegocio("No se puede modificar mas de dos veces la calificacion");
			} else {
				if (!c.equals("NC")) {
					if (not != null) {
						not.setValor(n.getValor());
						not.setEditada(true);
						daoNota.editarNota(not);
					}
				} else {
					daoNota.agregarCalificacion(n);
				}
			}
		}
	}
	

	public List<Nota> notasEstudiante(Estudiante e) throws Exception {
		return daoNota.notasEstudiante(e);
	}
	
	/**
	 * calcula la nota definitiva
	 * @param notas la nota a calcular
	 * @return la definitiva
	 */
	public double calcularDefinitiva(List<Nota> notas) {
		double definitiva = 0;
		for (int i = 0; i < notas.size(); i++) {
			double porcentajeNota = notas.get(i).getEvaluacion().getPorcentaje();
			double porcentaje = porcentajeNota / 100;
			double nota = notas.get(i).getValor();
			definitiva = (nota * porcentaje) + definitiva;
		}
		return definitiva;
	}
}
