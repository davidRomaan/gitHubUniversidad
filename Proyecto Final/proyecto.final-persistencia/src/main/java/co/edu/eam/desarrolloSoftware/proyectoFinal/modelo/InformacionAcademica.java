/*
 * Clase que representa la informacion academica de un Egresado.
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.NivelAcademico;

@NamedQueries({
	
	@NamedQuery(name = InformacionAcademica.LISTAR_INFORMACION_ACADEMICA, query = "SELECT i FROM InformacionAcademica i WHERE i.egresado = ?1 ")
})
@Entity
@Table(name="T_INFO_ACADEMICA")
public class InformacionAcademica implements Serializable{
	
	public int getIdInformacionAcademica() {
		return idInformacionAcademica;
	}

	public void setIdInformacionAcademica(int idInformacionAcademica) {
		this.idInformacionAcademica = idInformacionAcademica;
	}

	/**
	 * consulta que trae la informacion academica de un egresado
	 */
	public static final String LISTAR_INFORMACION_ACADEMICA = "informacionAcademicaEgresado";
	
	/* Egresado */
	@Id
	@OneToOne()
	@JoinColumn(name="ID_EGRESADO", insertable=false, updatable=false)
	@MapsId
	private Egresado egresado;
	
	/* Es necesario crear un nuevo atributo entero para mapear una relacion uno a uno*/
	@Id
	@Column(name="ID_EGRESADO")
	private int idInformacionAcademica;
	
	/* Fecha de grado del egresado */
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_GRADO", nullable=false)
	private Date fechaGrado;
	
	/* Nivel academico del egresado*/
	@Enumerated(EnumType.STRING)
	@Column(name="NIVEL_ACADEMICO", nullable=false)
	private NivelAcademico nivelAcademico;
	
	/* Numero del diploma */
	@Column(name="NUMERO_DIPLOMA", nullable=false)
	private String numeroDiploma;

	public InformacionAcademica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InformacionAcademica(Egresado egresado, Date fechaGrado, NivelAcademico nivelAcademico,
			String numeroDiploma) {
		super();
		this.egresado = egresado;
		this.fechaGrado = fechaGrado;
		this.nivelAcademico = nivelAcademico;
		this.numeroDiploma = numeroDiploma;
	}

	public Egresado getEgresado() {
		return egresado;
	}

	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
	}

	public Date getFechaGrado() {
		return fechaGrado;
	}

	public void setFechaGrado(Date fechaGrado) {
		this.fechaGrado = fechaGrado;
	}

	public NivelAcademico getNivelAcademico() {
		return nivelAcademico;
	}

	public void setNivelAcademico(NivelAcademico nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}

	public String getNumeroDiploma() {
		return numeroDiploma;
	}

	public void setNumeroDiploma(String numeroDiploma) {
		this.numeroDiploma = numeroDiploma;
	}
	
		
	
}
