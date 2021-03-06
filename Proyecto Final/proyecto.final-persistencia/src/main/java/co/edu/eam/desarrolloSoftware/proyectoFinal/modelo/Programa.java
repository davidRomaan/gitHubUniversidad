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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = Programa.LISTAR_PROGRAMAS, query = "SELECT p FROM Programa p ORDER BY p.nombre ASC"),
	@NamedQuery(name = Programa.LISTAR_PROGRAMAS_FACULTAD, query = "SELECT p FROM Programa p WHERE p.facultad=?1 ORDER BY p.nombre ASC"),
	@NamedQuery(name = Programa.BUSCAR_NOMBRE, query = "SELECT p FROM Programa p WHERE p.nombre=?1")
})
@Entity
@Table(name="T_PROGRAMA")
public class Programa implements Serializable{
	
	/**
	 * lista los programas
	 */
	public static final String LISTAR_PROGRAMAS = "listarPrograma";
	
	/**
	 * Buscar programas por nombre
	 */
	public static final String BUSCAR_NOMBRE = "Programa.buscarNombre";
	/**
	 * lista todos los programas de una facultad
	 */
	public static final String LISTAR_PROGRAMAS_FACULTAD = "Programa.listarProgramaFacultad";

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

	

	public Programa(int id, Facultad facultad, String nombre) {
		super();
		this.id = id;
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



	@Override
	public String toString() {
		return nombre;
	}
	
	
}
