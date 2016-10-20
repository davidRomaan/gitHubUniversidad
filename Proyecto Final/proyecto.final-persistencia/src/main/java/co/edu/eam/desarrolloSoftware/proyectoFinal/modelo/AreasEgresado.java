/*
 * Clase que representa las Areas de un Egresado.
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_AREAS_EGRESADO")
@IdClass(AreasEgresadoPK.class) // Asi se mapea cuando la llave primaria es compuesta
public class AreasEgresado implements Serializable{
	/* Egresado */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_EGRESADO")
	private Egresado egresado;
	
	/* Area de interes */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_AREA")
	private AreaInteres areaInteres;

	public AreasEgresado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AreasEgresado(Egresado egresado, AreaInteres areaInteres) {
		super();
		this.egresado = egresado;
		this.areaInteres = areaInteres;
	}

	public Egresado getEgresado() {
		return egresado;
	}

	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
	}

	public AreaInteres getAreaInteres() {
		return areaInteres;
	}

	public void setAreaInteres(AreaInteres areaInteres) {
		this.areaInteres = areaInteres;
	}
}
