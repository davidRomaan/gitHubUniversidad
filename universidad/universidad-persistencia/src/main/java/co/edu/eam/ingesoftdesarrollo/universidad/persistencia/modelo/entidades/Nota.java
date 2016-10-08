/**
 * 
 */
package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.swing.JOptionPane;

/**
 * Clase que representa una calificacion de una evaluacion de un curso.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
@NamedQueries({
	@NamedQuery(name = Nota.CONSULTA_DETALLADA_EST, query = "SELECT n FROM Nota n JOIN n.registroCurso r WHERE r.estudiante = ?1"),
	@NamedQuery(name = Nota.CALIFICACION_ESTUDIANTE, query = "SELECT n FROM Nota n JOIN n.registroCurso r WHERE r.estudiante=?1 AND n.evaluacion=?2")
})
@Entity
@IdClass(NotaPK.class)
@Table(name="tb_nota")
public class Nota implements Serializable {

	/**
	 * 
	 */
	public static final String CONSULTA_DETALLADA_EST = "Nota.consultaDetalladaEst";
	
	/**
	 * Obtiene la nota de un estudiante de una evaluacion
	 * ?1: El estudiante
	 * ?2: La evaluación
	 */
	public static final String CALIFICACION_ESTUDIANTE = "Nota.CalificacionEst";
	@Id
	@Column(name="ID")
	private int codigoNota;
	
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="C_EST", referencedColumnName = "cedula_est"),
		@JoinColumn(name="COD_CUR", referencedColumnName = "codigo_cur")
	})
	private RegistroCurso registroCurso;
	
	
	
	/**
	 * Nota que puso el profesor.
	 */
	@Column(name="valor_nota", nullable = false)
	private double valor;

	/**
	 * bandera que indica si la nota ya fue modificada para no dejar que lo sea
	 * una vez mas.
	 */
	@Column(name="editada_nota", nullable = false)
	private boolean editada;
	
	
	/**
	 * Evaluacion a la que pertenece esta nota.
	 */
	@ManyToOne
	@JoinColumn(name="id_evaluacion")
	private Evaluacion evaluacion;

	
	

	/**
	 * Constructor
	 */
	public Nota() {
		super();
	}

	/**
	 * @param evaluacion
	 * @param valor
	 * @param editada
	 */
	public Nota(Evaluacion evaluacion, double valor, boolean editada) {
		super();
		this.evaluacion = evaluacion;
		this.valor = valor;
		this.editada = editada;
	}



	/**
	 * @param registroCurso
	 * @param evaluacion
	 * @param valor
	 * @param editada
	 */
	public Nota(RegistroCurso registroCurso, Evaluacion evaluacion,
			double valor, boolean editada) {
		super();
		this.registroCurso = registroCurso;
		this.evaluacion = evaluacion;
		this.valor = valor;
		this.editada = editada;
	}



	/**
	 * @return the evaluacion
	 */
	public Evaluacion getEvaluacion() {
		return evaluacion;
	}



	/**
	 * @param evaluacion the evaluacion to set
	 */
	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}



	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}



	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}



	/**
	 * @return the editada
	 */
	public boolean isEditada() {
		return editada;
	}



	/**
	 * @param editada the editada to set
	 */
	public void setEditada(boolean editada) {
		this.editada = editada;
	}



	/**
	 * @return the registroCurso
	 */
	public RegistroCurso getRegistroCurso() {
		return registroCurso;
	}



	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setRegistroCurso(RegistroCurso registroCurso) {
		this.registroCurso = registroCurso;
	}

}
