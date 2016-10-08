/**
 * 
 */
package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa un estudiante.
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
@Entity
@Table(name="tb_estudiante")
public class Estudiante extends Persona {

	
	/**
	 * Fecha nacimiento estudiante.
	 */
	@Column(name="fechanacimiento_est")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	/**
	 * Cursos registrados por el estudiante.
	 */
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true, mappedBy = "estudiante")
	private List<RegistroCurso> registro;
	
	
	
	public Estudiante(){
		
	}
	
	
	
	/**
	 * Constructor.
	 */
	

	/**
	 * Constructor.
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param correo
	 * @param direccion
	 * @param telefono
	 */
	
	
	public Estudiante(String cedula, String apellido, String correo, String direccion, String nombre, String telefono,
			Date fechaNacimiento) {
		super(cedula, apellido, correo, direccion, nombre, telefono);
		this.fechaNacimiento = fechaNacimiento;
	}


	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the registro
	 */
	public List<RegistroCurso> getRegistro() {
		return registro;
	}

	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(List<RegistroCurso> registro) {
		this.registro = registro;
	}
	
	

}
