package co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class Ciudad implements Serializable{

	@Id
	@Column(name="codigo")
	private String codigoCiud;
	
	@Column(name="nombre_ciudad")
	private String nombreCiudad;
	
	
	public Ciudad (){
	
	}


	public Ciudad(String codigoCiud, String nombreCiudad) {
		super();
		this.codigoCiud = codigoCiud;
		this.nombreCiudad = nombreCiudad;
	}


	public String getCodigoCiud() {
		return codigoCiud;
	}


	public void setCodigoCiud(String codigoCiud) {
		this.codigoCiud = codigoCiud;
	}


	public String getNombreCiudad() {
		return nombreCiudad;
	}


	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}


	@Override
	public String toString() {
		return nombreCiudad;
	}
	
	
	
}
