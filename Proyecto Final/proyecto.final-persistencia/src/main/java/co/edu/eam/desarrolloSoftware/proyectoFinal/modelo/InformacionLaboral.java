/*
 * Clase que representa la informacion laboral de un Egresado.
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
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.SituacionActual;
@NamedQueries({
	
	@NamedQuery(name = InformacionLaboral.LISTAR_INFORMACION_LABORAL, query = "SELECT i FROM InformacionLaboral i WHERE i.egresado = ?1 "),
	//@NamedQuery(name = InformacionLaboral.CONSULTA_EGRESADOS_EMPRESA, query = "SELECT i FROM InformacionLaboral i WHERE i.empresa = ?1 ")
	@NamedQuery(name = InformacionLaboral.INFORMACIONLAB_PROGRAM, query = "SELECT i FROM InformacionLaboral i JOIN i.egresado e "
			+ "WHERE e.programa = ?1")

})
@Entity
@Table(name="T_INFO_LABORAL")
public class InformacionLaboral implements Serializable{
	
	/**
	 * consulta que devuelve la informacion laboral de un egresado
	 */
	public static final String INFORMACIONLAB_PROGRAM = "listaEgresadosPorEmpresa";
	/**
	 * consulta que devuelve los egresados que trabajen en cierta empresa
	 */
	public static final String CONSULTA_EGRESADOS_EMPRESA = "listaEgresadosPorEmpresa";
	/**
	 * consulta que trae la informacion laboral de un egresado
	 */
	public static final String LISTAR_INFORMACION_LABORAL = "informacionLaboralEgresado";
	/* Egresado */
	
	@OneToOne
	@JoinColumn(name="ID_EGRESADO", insertable=false, updatable=false)
	@MapsId
	private Egresado egresado;
	
	/* Es necesario crear un nuevo atributo entero para mapear una relacion uno a uno*/
	@Id
	@Column(name="ID_EGRESADO")
	private int codigoEgresado;

	/* Situacion actual del egresado*/
	@Enumerated(EnumType.STRING)
	@Column(name="SITUACION_ACTUAL")
	private SituacionActual situacionActual;
	
	/* Fecha de ingreso */
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INGRESO", nullable=false)
	private Date fechaIngreso;
	
	/* Fecha de salida */
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_SALIDA", nullable=false)
	private Date fechaSalida;
	
	/* Cargo dentro de la empresa */
	@Column(name="CARGO", nullable=false)
	private String cargo;
	

	public InformacionLaboral(){
		
	}


	public InformacionLaboral(Egresado egresado, int codigoEgresado, SituacionActual situacionActual, Date fechaIngreso,
			Date fechaSalida, String cargo) {
		super();
		this.egresado = egresado;
		this.codigoEgresado = codigoEgresado;
		this.situacionActual = situacionActual;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.cargo = cargo;
	}


	public Egresado getEgresado() {
		return egresado;
	}


	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
	}


	public int getCodigoEgresado() {
		return codigoEgresado;
	}


	public void setCodigoEgresado(int codigoEgresado) {
		this.codigoEgresado = codigoEgresado;
	}


	public SituacionActual getSituacionActual() {
		return situacionActual;
	}


	public void setSituacionActual(SituacionActual situacionActual) {
		this.situacionActual = situacionActual;
	}


	public Date getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public Date getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
