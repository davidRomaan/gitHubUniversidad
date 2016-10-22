/*
 * Clase que representa una Facultad.
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@NamedQueries({
	
	@NamedQuery(name = Facultad.LISTAR_FACULTADES, query = "SELECT fac FROM Facultad fac ORDER BY fac.nombre ASC")
})
@Entity
@Table(name="T_FACULTAD")
public class Facultad implements Serializable{
	
	/**
	 * lista las facultades
	 */
	public static final String LISTAR_FACULTADES = "listarFacultades";
	
	/* Identificador de la Facultad */
	@Id
	@Column(name="ID_FACULTAD")
	private int id;
	
	/* Nombre */
	@Column(name="NOMBRE_FACULTAD", nullable=false)
	private String nombre;

	public Facultad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facultad(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		Facultad other = (Facultad) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
