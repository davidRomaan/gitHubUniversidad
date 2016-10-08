package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * clase encargada de modelar una persona
 * @author david
 *
 */

@Entity
@Table(name="tb_persona")
@Inheritance(strategy=InheritanceType.JOINED)
public class Persona implements Serializable {
	
	@Id
	@Column(name="cedula_per")
	protected String cedula;
	
	@Column(name="apellido_per")
	protected String apellido;
	
	@Column(name="correo_per")
	protected String correo;
	
	@Column(name="direccion_per")
	protected String direccion;
		
	@Column(name="nombre_per")
	protected String nombre;
	
	@Column(name="telefono_per")
	protected String telefono;

	
	public Persona(){
		
	}
	
	/**
	 * Metodo constructor que recibe como parametros los atributos de una persona
	 * @param cedula, cédula de la persona
	 * @param apellido, apelllido de la persona
	 * @param correo, correo de la persona
	 * @param direccion, direccion de la persona
	 * @param nombre, nombre de la persona
	 * @param telefono, telefono de la persona
	 */
	public Persona(String cedula, String apellido, String correo, String direccion, String nombre, String telefono) {
		super();
		this.cedula = cedula;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
		this.nombre = nombre;
		this.telefono = telefono;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
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
	
	

}
