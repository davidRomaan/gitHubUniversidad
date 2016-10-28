/*
 * Clase que representa un Departamento.
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

	@NamedQuery(name = Departamento.LISTAR_DEPARTAMENTOS, query = "SELECT dep FROM Departamento dep ORDER BY dep.nombre ASC") })
@Entity
@Table(name="T_DEPARTAMENTO")
public class Departamento implements Serializable{
	
	/**
	 * lista los departamentos
	 */
	public static final String LISTAR_DEPARTAMENTOS = "listarDepartamentos";
	
	/* Identificador del departamento*/
	@Id
	@Column(name="ID_DEPARTAMENTO")
	private int id;
	
	/* Nombre del departamento */
	@Column(name="NOMBRE", nullable=false)
	private String nombre;

	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departamento(String nombre) {
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
	public String toString() {
		return nombre;
	}

	
	
	
}
