/*
 * Clase que nos permite tener una pk compuesta
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;

import java.io.Serializable;

public class HistorialLaboralPK implements Serializable{
	private int informacionLaboral;
	private String empresa;
	public HistorialLaboralPK(int informacionLaboral, String empresa) {
		super();
		this.informacionLaboral = informacionLaboral;
		this.empresa = empresa;
	}
	
	
	public HistorialLaboralPK() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getInformacionLaboral() {
		return informacionLaboral;
	}


	public void setInformacionLaboral(int informacionLaboral) {
		this.informacionLaboral = informacionLaboral;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
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
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (informacionLaboral != other.informacionLaboral)
			return false;
		return true;
	}

	
	
	
}
