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
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.NivelAcademico;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.SituacionActual;

@Entity
@Table(name="T_INFO_LABORAL")
public class InformacionLaboral implements Serializable{
	
	/* Egresado */
	@Id
	@OneToOne
	@JoinColumn(name="ID_EGRESADO", insertable=false, updatable=false)
	@MapsId
	private Egresado egresado;
	
	/* Es necesario crear un nuevo atributo entero para mapear una relacion uno a uno*/
	@Id
	@Column(name="ID_EGRESADO")
	private int idInformacionLaboral;
	
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
	

}
