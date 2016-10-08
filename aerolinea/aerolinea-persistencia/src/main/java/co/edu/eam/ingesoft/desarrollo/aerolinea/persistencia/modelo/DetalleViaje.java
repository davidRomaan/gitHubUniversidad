package co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_viaje")
public class DetalleViaje implements Serializable{

	@Id
	@Column(name="ID")
	private int codigoDetalleViaje;
	
	@ManyToOne(cascade = {})
	@JoinColumn(name="VIAJE")
	private Viaje viaje;
	
	@ManyToOne(cascade= {})
	@JoinColumn(name="VIAJERO")
	private Viajero viajero;

	
	public DetalleViaje (){
		
	}


	public DetalleViaje(int codigoDetalleViaje, Viaje viaje, Viajero viajero) {
		super();
		this.codigoDetalleViaje = codigoDetalleViaje;
		this.viaje = viaje;
		this.viajero = viajero;
	}


	public int getCodigoDetalleViaje() {
		return codigoDetalleViaje;
	}


	public void setCodigoDetalleViaje(int codigoDetalleViaje) {
		this.codigoDetalleViaje = codigoDetalleViaje;
	}


	public Viaje getViaje() {
		return viaje;
	}


	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}


	public Viajero getViajero() {
		return viajero;
	}


	public void setViajero(Viajero viajero) {
		this.viajero = viajero;
	}


	
	
	
	
}
