/*
 * Clase que representa una Ciudad.
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
@Table(name="T_CIUDAD")
public class Ciudad implements Serializable{
	/* Identificador de la Ciudad*/
	@Id
	@Column(name="ID_CIUDAD")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/* Nombre de la ciudad */ 
	@Column(name="NOMBRE", nullable=false)
	private String nombre;
	
	/* Departamento al que pertenece la ciudad */
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_DEPARTAMENTO")
	private Departamento departamento;

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciudad(String nombre, Departamento departamento) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return nombre;
	}

	
	
}
