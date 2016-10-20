/*
 * Clase que representa las ofertas aplicadas de un egresado.
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
@Table(name="T_OFERTAAPLICADA_EGRE")
@IdClass(OfertaAplicadaPK.class) // Asi se mapea cuando la llave primaria es compuesta
public class OfertaAplicada implements Serializable{
	
	/* Egresado */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_EGRESADO")
	private Egresado egresado;
	
	/* Area de interes */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_OFERTA")
	private OfertaLaboral ofertaLaboral;

	public OfertaAplicada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OfertaAplicada(Egresado egresado, OfertaLaboral ofertaLaboral) {
		super();
		this.egresado = egresado;
		this.ofertaLaboral = ofertaLaboral;
	}

	public Egresado getEgresado() {
		return egresado;
	}

	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
	}

	public OfertaLaboral getOfertaLaboral() {
		return ofertaLaboral;
	}

	public void setOfertaLaboral(OfertaLaboral ofertaLaboral) {
		this.ofertaLaboral = ofertaLaboral;
	}
	
}
