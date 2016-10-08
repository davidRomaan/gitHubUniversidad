package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import co.edu.eam.disenosoft.universidad.modelo.enumeraciones.DiaEnum;

/**
 * Clase que representa una sesion de un curso.
 * @author Camilo Andres Ferrer Bustos.
 *
 */
@NamedQueries({
	
	@NamedQuery(name = SesionCurso.CONSULTA_SESIONES_DOCENTE,query = "SELECT s FROM SesionCurso s JOIN s.codCurso c WHERE c.docente = ?1"),
	@NamedQuery(name = SesionCurso.LISTAR_TODO, query = "SELECT s FROM SesionCurso s"),
	@NamedQuery(name = SesionCurso.ELIMINAR_SESION, query = "DELETE FROM SesionCurso s WHERE s.codigoSesionCur = ?1 ")
})


@Entity
@Table(name="tb_sesioncurso")
public class SesionCurso implements Serializable{

	/**
	 * consulta que lista todo el horario de un profesor
	 * ?1 el profesor 
	 */
	public static final String CONSULTA_SESIONES_DOCENTE = "SesionCurso.listarHorario";
	
	/**
	 * lista todo los atributos de la sesion de un Curso
	 */
	public static final String LISTAR_TODO = "SesionCurso.listartodo";
	
	/**
	 * elimina una sesion de un curso
	 */
	public static final String ELIMINAR_SESION = "SesionCurso.eliminarSesion";
	
	
	@Id
	@Column(name="ID")
	private int codigoSesionCur;
	/**
	 * Curso de la sesion.
	 */
	@ManyToOne
	@JoinColumn(name="codigo_curso")
	private Curso codCurso;

	/**
	 * Dia de la sesion.
	 */
	@Enumerated(EnumType.STRING)
	@Column(name="dia_sesion",length=225,nullable=false)
	private DiaEnum dia;

	/**
	 * Hora en que empieza una sesion.
	 */
	@Column(name="horainicio_sesion",length=11,nullable = false)
	private int horaInicio;

	/**
	 * Hora en que termina la sesion.
	 */
	@Column(name="horafinal_sesion",length=11,nullable = false)
	private int horaFinal;

	/**
	 * Cosntructor.
	 */
	public SesionCurso() {
		super();
	}
	/**
	 * Constructor.
	 * @param curso
	 * @param dia
	 * @param horaInicio
	 * @param horaFinal
	 */
	public SesionCurso(int codigoSesionCur, Curso codCurso, DiaEnum dia, int horaInicio, int horaFinal) {
		super();
		this.codigoSesionCur = codigoSesionCur;
		this.codCurso = codCurso;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
	}
		
	
	public int getCodigoSesionCur() {
		return codigoSesionCur;
	}
	public void setCodigoSesionCur(int codigoSesionCur) {
		this.codigoSesionCur = codigoSesionCur;
	}
	public Curso getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(Curso codCurso) {
		this.codCurso = codCurso;
	}
	public DiaEnum getDia() {
		return dia;
	}
	public void setDia(DiaEnum dia) {
		this.dia = dia;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoSesionCur;
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
		SesionCurso other = (SesionCurso) obj;
		if (codigoSesionCur != other.codigoSesionCur)
			return false;
		return true;
	}

	
	
	
	
	
	

	

}
