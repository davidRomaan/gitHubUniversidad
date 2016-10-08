package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

/**
 * Clase que representa a un curso.
 * 
 * @author Cmilo Andres Ferrer Bustso.
 * 
 */
@NamedQueries({
	@NamedQuery(name = Curso.CONSULTA_TABLA_CURSOS_ASIGNATURA, query = "SELECT c FROM Curso c WHERE c.asignatura = ?1"),
	@NamedQuery(name = Curso.CONSULTA_CURSOS_DE_UN_PROFESOR, query = "SELECT c FROM Curso c WHERE c.docente = ?1")

})
@Entity
@Table(name= "tb_curso")
public class Curso implements Serializable {
	
	/**
	 * se listan los  cursos de un profesor
	 */
	public static final String CONSULTA_CURSOS_DE_UN_PROFESOR = "Curso.consultaCursosDeUnProfesor";
	/**
	 * consulta que trae el curso de una asignatura
	 * ?1 la asignatura a la cual se le va a traer el curso
	 */
	public static final String CONSULTA_TABLA_CURSOS_ASIGNATURA = "Curso.cursosAsignatura";

	/**
	 * Codigo del curso. el codigo se forma con el codigo de la
	 * asignatura+a�o+semestre del a�o (I o II)
	 */
	@Id
	@Column(name = "codigo_curso")
	private String codigo;

	/**
	 * Docente que imparte la asignatura.
	 */
	
	@ManyToOne
	@JoinColumn(name="cedula_docente")
	private Profesor docente;

	/**
	 * Asignatura de este curso.
	 */
	@ManyToOne()
	@JoinColumn(name="codigo_asignatura")
	private Asignatura asignatura;

	/**
	 * Sesiones del curso. las sesiones son los dias en que los estudiantes y el
	 * profesor se encuentran para la clase.
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "codCurso")
	private List<SesionCurso> sesiones;
	
	/**
	 * Estudiantes registrados en este curso.
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "curso")
	private List<RegistroCurso> estudiantes;
	
	/**
	 * Evaluaciones del curso.
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "curso")
	private List<Evaluacion> evaluaciones;
	
	/**
	 * Constructor.
	 */
	public Curso() {
		super();
	}
	
	/**
	 * Constructor.
	 * 
	 * @param codigo
	 * @param docente
	 * @param asignatura
	 */
	public Curso(String codigo, Profesor docente, Asignatura asignatura) {
		super();
		this.codigo = codigo;
		this.docente = docente;
		this.asignatura = asignatura;
		sesiones = new ArrayList<SesionCurso>();
		evaluaciones = new ArrayList<Evaluacion>();
	}

	

	@Override
	public String toString() {
		return  codigo;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the docente
	 */
	public Profesor getDocente() {
		return docente;
	}

	/**
	 * @param docente
	 *            the docente to set
	 */
	public void setDocente(Profesor docente) {
		this.docente = docente;
	}

	/**
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura
	 *            the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @return the sesiones
	 */
	public List<SesionCurso> getSesiones() {
		return sesiones;
	}

	/**
	 * @param sesiones the sesiones to set
	 */
	public void setSesiones(List<SesionCurso> sesiones) {
		this.sesiones = sesiones;
	}

	/**
	 * @return the estudiantes
	 */
	public List<RegistroCurso> getEstudiantes() {
		return estudiantes;
	}

	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void setEstudiantes(List<RegistroCurso> estudiantes) {
		this.estudiantes = estudiantes;
	}

	/**
	 * @return the evaluaciones
	 */
	public List<Evaluacion> getEvaluaciones() {
		return evaluaciones;
	}

	/**
	 * @param evaluaciones the evaluaciones to set
	 */
	public void setEvaluaciones(List<Evaluacion> evaluaciones) {
		this.evaluaciones = evaluaciones;
	}

}
