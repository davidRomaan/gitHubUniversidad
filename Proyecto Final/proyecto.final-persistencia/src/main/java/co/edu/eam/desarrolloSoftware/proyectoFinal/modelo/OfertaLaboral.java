/*
 * Clase que representa una oferta laboral.
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_OFERTALABORAL")
public class OfertaLaboral implements Serializable{
	
	/* Identificador de la oferta laboral */
	@Id
	@Column(name="ID_OFERTA")
	private int id;
	
	/* Empresa de la Oferta laboral */
	@ManyToOne(cascade = {})
	@JoinColumn(name="NIT_EMPRESA")
	private Empresa empresa;
	
	/* Ciudad donde se da la oferta laboral */
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_CIUDAD")
	private Ciudad ciudad;
	
	/* Area de interes de la oferta laboral */
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_AREA")
	private AreaInteres AreaInteres;
	
	/* Resumen de la oferta laboral */
	@Column(name="RESUMEN", nullable=false)
	private String resumen;
	
	/* Cargo a ofrecer de la oferta laboral */
	@Column(name="CARGO", nullable=false)
	private String cargo;
	
	/* salario de la oferta laboral OPCIONAL*/
	@Column(name="SALARIO", nullable=true)
	private double salario;
	
	/* descripccion de la oferta laboral */
	@Column(name="DESCRIPCION", nullable=false)
	private String descripcion;
	
	/* requerimientos de la oferta laboral */
	@Column(name="REQUERIMIENTOS", nullable=false)
	private String requerimientos;
	
	/* Fecha de apertura de la oferta laboral */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_APERTURA", nullable=false)
	private Date fechaApertura;

	/* Estado de la oferta laboral true = abierta | false = cerrada */
	@Column(name="ESTADO", nullable=false)
	private boolean estado;
	
	public OfertaLaboral() {
		super();
		// TODO Auto-generated constructor stub
	}

	





	public OfertaLaboral(Empresa empresa, Ciudad ciudad, AreaInteres areaInteres, String resumen, String cargo,
			double salario, String descripcion, String requerimientos, Date fechaApertura, boolean estado) {
		super();
		this.empresa = empresa;
		this.ciudad = ciudad;
		AreaInteres = areaInteres;
		this.resumen = resumen;
		this.cargo = cargo;
		this.salario = salario;
		this.descripcion = descripcion;
		this.requerimientos = requerimientos;
		this.fechaApertura = fechaApertura;
		this.estado = estado;
	}







	public int getId() {
		return id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}



	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}



	public AreaInteres getAreaInteres() {
		return AreaInteres;
	}



	public void setAreaInteres(AreaInteres areaInteres) {
		AreaInteres = areaInteres;
	}



	public String getResumen() {
		return resumen;
	}



	public void setResumen(String resumen) {
		this.resumen = resumen;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getRequerimientos() {
		return requerimientos;
	}



	public void setRequerimientos(String requerimientos) {
		this.requerimientos = requerimientos;
	}



	public Date getFechaApertura() {
		return fechaApertura;
	}



	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}



	public boolean isEstado() {
		return estado;
	}



	public void setEstado(boolean estado) {
		this.estado = estado;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		OfertaLaboral other = (OfertaLaboral) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
