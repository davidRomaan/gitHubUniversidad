/*
 * Clase que nos permite tener una pk compuesta
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;

public class OfertaAplicadaPK implements Serializable{
	private int egresado;
	private int ofertaLaboral;
	
	public OfertaAplicadaPK(int egresado, int ofertaLaboral) {
		super();
		this.egresado = egresado;
		this.ofertaLaboral = ofertaLaboral;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + egresado;
		result = prime * result + ofertaLaboral;
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
		OfertaAplicadaPK other = (OfertaAplicadaPK) obj;
		if (egresado != other.egresado)
			return false;
		if (ofertaLaboral != other.ofertaLaboral)
			return false;
		return true;
	}
	
}
