package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase que reprenta un curso registrado por un estudiante.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
@NamedQueries({
		@NamedQuery(name = RegistroCurso.CONSULTA_SUMATORIA_CREDITOS, query = "SELECT SUM(a.numeroCreditos) FROM RegistroCurso r JOIN r.curso c JOIN c.asignatura a WHERE r.estudiante = ?1  "),
		@NamedQuery(name = RegistroCurso.CONSULTA_REGISTRO_CURSO, query = "SELECT r FROM RegistroCurso r WHERE r.estudiante = ?1"),
		@NamedQuery(name = RegistroCurso.CONSULTA_REGISTRO_CURSO_ESTUDIANTES, query = "SELECT r FROM RegistroCurso r WHERE r.estudiante=?1 AND r.curso=?2"),
		@NamedQuery(name = RegistroCurso.CONSULTA_CURSOS_REGISTRADOS_ESTUDIANTE, query = "SELECT r FROM RegistroCurso r JOIN r.curso c JOIN c.asignatura a WHERE r.estudiante = ?1 AND a.nombre = ?2"),
		@NamedQuery(name = RegistroCurso.CONSULTA_ESTUDIANTES, query = "SELECT r.estudiante FROM RegistroCurso r WHERE r.curso = ?1")
		
})
@Entity
@IdClass(RegistroCursoPK.class)
@Table(name = "tb_registrocurso")
public class RegistroCurso implements Serializable {

	/**
	 * consulta que devuelve los estudiantes de un curso
	 * ?1 el curso al que se le van a buscar los estudiantes
	 */
	public static final String CONSULTA_ESTUDIANTES = "RegistroCurso.consultaEstudiantes";
	/**
	 * consulta que devuelve el registro de un curso de un estudiante
	 * ?1 El estudiante
	 * ?2 la asignaatura 
	 */
	public static final String CONSULTA_CURSOS_REGISTRADOS_ESTUDIANTE = "RegistroCurso.RegistrosEst";
	/**
	 * consulta que devuelve los cursos registrados por un estudiante
	 */
	public static final String CONSULTA_REGISTRO_CURSO_ESTUDIANTES = "RegistroCurso.registroCursoEst";

	/**
	 * trae la lista de la tabla registro curso
	 */
	public static final String CONSULTA_REGISTRO_CURSO = "RegistroCurso.consultaRegistroCurso";

	/**
	 * ?1 El estudiante consulata que devuelve la sumatoria de los creditos
	 * registrados de un estudiante
	 */
	public static final String CONSULTA_SUMATORIA_CREDITOS = "RegistroCurso.sumatoriaCreditos";

	/**
	 * Estudiante que registro el curso.
	 */

	@Id
	@ManyToOne
	@JoinColumn(name = "cedula_est")
	private Estudiante estudiante;

	/**
	 * Curso que registro el estudiante.
	 */
	@Id
	@ManyToOne
	@JoinColumn(name = "codigo_cur")
	private Curso curso;

	/**
	 * Notas que el estudiante tiene registradas en este curso.
	 */
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "registroCurso")
	private List<Nota> notas;

	public RegistroCurso() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param estudiante
	 * @param curso
	 * @param notas
	 */

	public RegistroCurso(Estudiante estudiante, Curso curso) {
		super();
		this.estudiante = estudiante;
		this.curso = curso;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
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
		RegistroCurso other = (RegistroCurso) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		return true;
	}

}
