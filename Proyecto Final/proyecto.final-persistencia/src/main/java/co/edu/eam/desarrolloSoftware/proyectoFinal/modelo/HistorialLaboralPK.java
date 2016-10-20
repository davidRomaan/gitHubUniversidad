/*
 * Clase que nos permite tener una pk compuesta
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;

import java.io.Serializable;

public class HistorialLaboralPK implements Serializable{
	private int informacionLaboral;
	private int empresa;
	public HistorialLaboralPK(int informacionLaboral, int empresa) {
		super();
		this.informacionLaboral = informacionLaboral;
		this.empresa = empresa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empresa;
		result = prime * result + informacionLaboral;
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
		HistorialLaboralPK other = (HistorialLaboralPK) obj;
		if (empresa != other.empresa)
			return false;
		if (informacionLaboral != other.informacionLaboral)
			return false;
		return true;
	}
	
	
}
