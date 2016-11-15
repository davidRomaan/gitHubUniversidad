/*
 * Clase que nos permite tener una pk compuesta
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;

public class AreasEgresadoPK implements Serializable{
	private int egresado;
	private int areaInteres;
	
	public AreasEgresadoPK(int egresado, int areaInteres) {
		super();
		this.egresado = egresado;
		this.areaInteres = areaInteres;
	}

	public AreasEgresadoPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEgresado() {
		return egresado;
	}

	public void setEgresado(int egresado) {
		this.egresado = egresado;
	}

	public int getAreaInteres() {
		return areaInteres;
	}

	public void setAreaInteres(int areaInteres) {
		this.areaInteres = areaInteres;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaInteres;
		result = prime * result + egresado;
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
		AreasEgresadoPK other = (AreasEgresadoPK) obj;
		if (areaInteres != other.areaInteres)
			return false;
		if (egresado != other.egresado)
			return false;
		return true;
	}
	
	
}
