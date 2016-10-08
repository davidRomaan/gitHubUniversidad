package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

public class RegistroCursoPK implements Serializable{

	
	private String estudiante;
	
	private String curso;
	
	public RegistroCursoPK() {
		// TODO Auto-generated constructor stub
	}

	public RegistroCursoPK(String curso, String estudiante) {
		super();
		this.curso = curso;
		this.estudiante = estudiante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((estudiante == null) ? 0 : estudiante.hashCode());
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
		RegistroCursoPK other = (RegistroCursoPK) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (estudiante == null) {
			if (other.estudiante != null)
				return false;
		} else if (!estudiante.equals(other.estudiante))
			return false;
		return true;
	}
	

	




	
	
	
}
