package co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="viaje")
public class Viaje implements Serializable {

	
	@Id
	@Column(name="ID")
	private int codigoViaje;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA")
	private Date fecha;
	
	@ManyToOne(cascade = {})
	@JoinColumn(name="CIUDAD_DESTINO")
	private Ciudad ciudadDestino;

	@ManyToOne(cascade = {})
	@JoinColumn(name="CIUDAD_ORIGEN")
	private Ciudad ciudadOrigen;
	
	
	public Viaje(){
		
	}


	public Viaje(int codigoViaje, Date fecha, Ciudad ciudadDestino, Ciudad ciudadOrigen) {
		super();
		this.codigoViaje = codigoViaje;
		this.fecha = fecha;
		this.ciudadDestino = ciudadDestino;
		this.ciudadOrigen = ciudadOrigen;
	}


	public int getCodigoViaje() {
		return codigoViaje;
	}


	public void setCodigoViaje(int codigoViaje) {
		this.codigoViaje = codigoViaje;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}


	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}


	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}


	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}


	


	


	
	
	
	
	
	
}
