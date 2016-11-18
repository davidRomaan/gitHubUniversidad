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
	
	@NamedQuery(name = InformacionLaboral.LISTAR_INFORMACION_LABORAL, query = "SELECT i FROM InformacionLaboral i WHERE i.egresado = ?1 ")
})
@Entity
@Table(name="T_INFO_LABORAL")
public class InformacionLaboral implements Serializable{
	
	/**
	 * consulta que trae la informacion laboral de un egresado
	 */
	public static final String LISTAR_INFORMACION_LABORAL = "informacionLaboralEgresado";
	/* Egresado */
	
	@Id
	@OneToOne
	@JoinColumn(name="ID_EGRESADO", insertable=false, updatable=false)
	private Egresado egresado;
	
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
	
	@JoinColumn(name = "empresa")
	@ManyToOne(cascade = {})
	private Empresa empresa;

	public InformacionLaboral(){
		
	}

	public InformacionLaboral(Egresado egresado, SituacionActual situacionActual, Date fechaIngreso, Date fechaSalida,
			String cargo, Empresa empresa) {
		super();
		this.egresado = egresado;
		this.situacionActual = situacionActual;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.cargo = cargo;
		this.empresa = empresa;
	}

	public Egresado getEgresado() {
		return egresado;
	}

	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
	
}
