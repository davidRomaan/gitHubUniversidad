/*
 * Clase que representa una oferta laboral.
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_AREAINTERES")
public class AreaInteres implements Serializable{
	
	/* Identificador del area de interes */
	@Id
	@Column(name="ID_AREA")
	private int id;
	
	/* nombre del area de interes */
	@Column(name="NOMBRE", nullable=false)
	private String nombre;

	public AreaInteres() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AreaInteres(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
