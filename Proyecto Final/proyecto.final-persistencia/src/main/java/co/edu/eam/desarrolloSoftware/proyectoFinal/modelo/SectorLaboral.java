/*
 * Clase que representa un Sector Laboral.
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

	@NamedQuery(name = SectorLaboral.LISTAR_SECTORES, query = "SELECT s FROM SectorLaboral s ORDER BY s.nombre ASC") })

@Entity
@Table(name="T_SECTORLABORAL")
public class SectorLaboral implements Serializable{

	
	/**
	 * lista los sectores laborales
	 */
	public static final String LISTAR_SECTORES = "listarSectoresLaborales";
	
	/* Identificador del sector laboral*/
	@Id
	@Column(name="ID_SECTOR")
	private int id;
	
	/* nombre del sector laboral */
	@Column(name="NOMBRE_SECTOR", nullable=false)
	private String nombre;

	public SectorLaboral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SectorLaboral(String nombre) {
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
