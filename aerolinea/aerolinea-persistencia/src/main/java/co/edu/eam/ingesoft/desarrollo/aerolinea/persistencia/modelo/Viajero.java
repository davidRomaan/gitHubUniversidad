package co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="viajero")
public class Viajero implements Serializable{

	@Id
	@Column(name="CEDULA")
	private String cedula;
	
	@Column(name="APELLIDO")
	private String apelido;

	@Column(name="NOMBRE")
	private String nombre;

	
	public Viajero(){
		
	}


	public Viajero(String cedula, String apelido, String nombre) {
		super();
		this.cedula = cedula;
		this.apelido = apelido;
		this.nombre = nombre;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getApelido() {
		return apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
