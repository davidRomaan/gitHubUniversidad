package co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Clase responsable de modelar un cliente <br>
 * 
 * @author caferrer@eservicios.indracompany.com<br>
 * 
 * @date 5/08/2016
 * @version 1.0
 */
@Entity
@Table(name="T_CLIENTES")
public class Cliente implements Serializable{

	@Column(name="NOMBRE",nullable=false)
	private String nombre;
	
	@Id
	@Column(name="CEDULA")
	private String cedula;
	
	@Column(name="TELEFONO")
	private String telefono;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	public Cliente() {
	}
	
	
	/**
	 * 
	 * @param nombre
	 * @param cedula
	 * @param telefono
	 * @param direccion
	 */
	public Cliente(String nombre, String cedula, String telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
