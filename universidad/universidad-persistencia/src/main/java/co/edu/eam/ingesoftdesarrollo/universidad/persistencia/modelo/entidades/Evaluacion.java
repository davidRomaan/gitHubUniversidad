/**
 * 
 */
package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

/**
 * Clase que representa la evaluacion de un curso.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
@NamedQueries({
	@NamedQuery(name = Evaluacion.CONSULTA_PORCENTAJE, query = "SELECT SUM(e.porcentaje) FROM Evaluacion e WHERE e.curso = ?1 "),
	@NamedQuery(name = Evaluacion.CONSULTA_EVALUACION, query = "SELECT e FROM Evaluacion e JOIN e.curso c WHERE e.curso = ?1"),
	@NamedQuery(name = Evaluacion.CONSULTA_LISTA_EVALUACIONES_ASIGNATURA, query = "SELECT e FROM Evaluacion e JOIN e.curso c JOIN c.asignatura a WHERE e.curso = ?1 AND c.asignatura = ?2")


})
@Entity
@Table(name= "tb_evaluacion")
public class Evaluacion implements Serializable{
	/**
	 * 
	 */
	public static final String CONSULTA_LISTA_EVALUACIONES_ASIGNATURA = "Evaluacion.consultaEvaluacionesAsignatura";
	/**
	 * consulta que devuelve todo el objeto Evaluacion
	 */
	public static final String CONSULTA_EVALUACION = "Evaluacion.consultaEvaluacion";
	/**
	 * consulta que suma el porcentaje de una calificacion
	 */
	public static final String CONSULTA_PORCENTAJE = "Evaluacion.consultaPorcentaje";
	
	
	
	@Id
	@Column(name="ID")
	private int codigoEval;
	/**
	 * Curso al que pertenece esta evaluacion.
	 */
	@ManyToOne
	@JoinColumn(name="codigo_curso")
	private Curso curso;

	/**
	 * Nombre de la evaluacion;
	 */
	@Column(name="nombre_eval",length=225,nullable= false)
	private String nombre;

	/**
	 * Porcentaje que vale esta evaluacion dentro del curso.
	 */
	@Column(name="porcentaje_eval",nullable= false)
	private double porcentaje;

	/**
	 * Constructor.
	 */
	public Evaluacion() {
		super();
	}
	
	/**
	 * Constructor de la clase.
	 * @param curso
	 * @param nombre
	 * @param porcentaje
	 */
	
	public Evaluacion(int codigoEval, Curso curso, String nombre, double porcentaje) {
		super();
		this.codigoEval = codigoEval;
		this.curso = curso;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	public int getCodigoEval() {
		return codigoEval;
	}

	public void setCodigoEval(int codigoEval) {
		this.codigoEval = codigoEval;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoEval;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evaluacion other = (Evaluacion) obj;
		if (codigoEval != other.codigoEval)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	


	

	
	
}
