package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Calse responsable de modelar un profesor
 * 
 * @author david 
 *
 */
@Entity	
@Table(name="tb_docente")
public class Profesor extends Persona implements Serializable {

	
	@Column(name="postgrado_doc")
	private boolean postgrado;
	
	@ManyToOne(cascade={})
	@JoinColumn(name="profesion_doc")
	private Profesion profesion;

	
	public Profesor(){
		
	}



	public Profesor(String cedula, String apellido, String correo, String direccion, String nombre, String telefono,
			boolean postgrado, Profesion profesion) {
		super(cedula, apellido, correo, direccion, nombre, telefono);
		this.postgrado = postgrado;
		this.profesion = profesion;
	}





	public boolean isPostgrado() {
		return postgrado;
	}


	public void setPostgrado(boolean postgrado) {
		this.postgrado = postgrado;
	}


	public Profesion getProfesion() {
		return profesion;
	}


	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (postgrado ? 1231 : 1237);
		result = prime * result + ((profesion == null) ? 0 : profesion.hashCode());
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
		Profesor other = (Profesor) obj;
		if (postgrado != other.postgrado)
			return false;
		if (profesion == null) {
			if (other.profesion != null)
				return false;
		} else if (!profesion.equals(other.profesion))
			return false;
		return true;
	}
	
	
	

	

	
	
}
