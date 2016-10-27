/*
 * Clase que representa una oferta laboral.
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
	@NamedQuery(name = AreaInteres.LISTAR, query = "SELECT a FROM AreaInteres a ORDER BY a.nombre ASC")
})
@Entity
@Table(name="T_AREAINTERES")
public class AreaInteres implements Serializable{
	/**
	 * listado de las areas de interes
	 */
	public static final String LISTAR = "AreaInteres.Listar";
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

	

	public AreaInteres(int id, String nombre) {
		super();
		this.id = id;
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
