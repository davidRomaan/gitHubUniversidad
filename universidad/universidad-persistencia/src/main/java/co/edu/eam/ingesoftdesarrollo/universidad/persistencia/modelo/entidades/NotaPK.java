package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

public class NotaPK implements Serializable{

	private int codigoNota;
	
	private RegistroCurso registroCurso;

	
	public NotaPK() {
		// TODO Auto-generated constructor stub
	}
	
	public NotaPK(int codigoNota, RegistroCurso registroCurso) {
		super();
		this.codigoNota = codigoNota;
		this.registroCurso = registroCurso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoNota;
		result = prime * result + ((registroCurso == null) ? 0 : registroCurso.hashCode());
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
		NotaPK other = (NotaPK) obj;
		if (codigoNota != other.codigoNota)
			return false;
		if (registroCurso == null) {
			if (other.registroCurso != null)
				return false;
		} else if (!registroCurso.equals(other.registroCurso))
			return false;
		return true;
	}
	
	
	
}
