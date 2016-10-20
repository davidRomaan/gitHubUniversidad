/*
 * Clase que representa un Programa.
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_PROGRAMA")
public class Programa implements Serializable{
	
	/* Identificador del Programa */
	@Id
	@Column(name="ID_PROGRAMA")
	private int id;
	
	/* Facultad a la que pertenece el programa */
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_FACULTAD")
	private Facultad facultad;
	
	/* nombre del programa */
	@Column(name="NOMBRE_PROGRAMA", nullable=false)
	private String nombre;

	public Programa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Programa(Facultad facultad, String nombre) {
		super();
		this.facultad = facultad;
		this.nombre = nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programa other = (Programa) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
