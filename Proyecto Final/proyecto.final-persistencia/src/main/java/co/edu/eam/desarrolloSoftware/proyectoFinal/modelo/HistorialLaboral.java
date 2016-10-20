/*
 * Clase que representa el historial laboral de un Egresado.
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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_HIST_LABORAL")
@IdClass(HistorialLaboralPK.class) // Asi se mapea cuando la llave primaria es compuesta
public class HistorialLaboral implements Serializable{
	
	/* Egresado */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_EGRESADO")
	private InformacionLaboral informacionLaboral;
	
	/* Empresa en la que ha trabajado */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_EMPRESA")
	private Empresa empresa;

	public HistorialLaboral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistorialLaboral(InformacionLaboral informacionLaboral, Empresa empresa) {
		super();
		this.informacionLaboral = informacionLaboral;
		this.empresa = empresa;
	}

	public InformacionLaboral getInformacionLaboral() {
		return informacionLaboral;
	}

	public void setInformacionLaboral(InformacionLaboral informacionLaboral) {
		this.informacionLaboral = informacionLaboral;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}
