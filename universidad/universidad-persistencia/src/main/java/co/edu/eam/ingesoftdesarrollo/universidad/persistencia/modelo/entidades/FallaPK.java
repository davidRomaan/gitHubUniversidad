package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

public class FallaPK implements Serializable{

	private int codigoFalla;
	
	private RegistroCurso codCurso;
	
	
	public FallaPK() {
		// TODO Auto-generated constructor stub
	}


	public FallaPK(int codigoFalla, RegistroCurso codCurso) {
		super();
		this.codigoFalla = codigoFalla;
		this.codCurso = codCurso;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCurso == null) ? 0 : codCurso.hashCode());
		result = prime * result + codigoFalla;
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
		FallaPK other = (FallaPK) obj;
		if (codCurso == null) {
			if (other.codCurso != null)
				return false;
		} else if (!codCurso.equals(other.codCurso))
			return false;
		if (codigoFalla != other.codigoFalla)
			return false;
		return true;
	}

	
	
	
	
}
