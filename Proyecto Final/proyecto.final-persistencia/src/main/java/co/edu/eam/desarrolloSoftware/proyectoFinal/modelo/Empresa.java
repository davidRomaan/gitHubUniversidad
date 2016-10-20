/*
 * Clase que representa una Empresa.
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoEmpresa;

@Entity
@Table(name="T_EMPRESA")
public class Empresa implements Serializable{
	/* Identificador de la Empresa*/
	@Id
	@Column(name="ID_EMPRESA")
	private int id;
	
	/* Sector Laboral de la empresa*/
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_SECTOR")
	private SectorLaboral sectorLaboral;
	
	/* Contacto Empresa */
	@OneToOne(mappedBy="empresa")
	private Contacto contacto;
	
	/* Ciudad donde se encuentra la empresa*/
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_CIUDAD")
	private Ciudad ciudad;
	
	/* Razon social */
	@Column(name="RAZON_SOCIAL_EMPRESA", nullable=false)
	private String razonSocial;
	
	/* pais */
	@Column(name="PAIS_EMPRESA", nullable=false)
	private String pais;
	
	/* Telefono */
	@Column(name="TELEFONO_EMPRESA", nullable=false)
	private String telefono;
	
	/* Nit */
	@Column(name="NIT_EMPRESA", nullable=false)
	private String nit;
	
	/* Tipo Empresa */
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO", nullable=false)
	private TipoEmpresa tipo;
	
	/* Sitio web */
	@Column(name="WEB_EMPRESA")
	private String web;
	
	/* Direccion */
	@Column(name="DIRECCION_EMPRESA", nullable=false)
	private String direccion;

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(SectorLaboral sectorLaboral, Ciudad ciudad, String razonSocial, String pais, String telefono,
			String nit, TipoEmpresa tipo, String web, String direccion) {
		super();
		this.sectorLaboral = sectorLaboral;
		this.ciudad = ciudad;
		this.razonSocial = razonSocial;
		this.pais = pais;
		this.telefono = telefono;
		this.nit = nit;
		this.tipo = tipo;
		this.web = web;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public SectorLaboral getSectorLaboral() {
		return sectorLaboral;
	}

	public void setSectorLaboral(SectorLaboral sectorLaboral) {
		this.sectorLaboral = sectorLaboral;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public TipoEmpresa getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpresa tipo) {
		this.tipo = tipo;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nit == null) ? 0 : nit.hashCode());
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
		Empresa other = (Empresa) obj;
		if (nit == null) {
			if (other.nit != null)
				return false;
		} else if (!nit.equals(other.nit))
			return false;
		return true;
	}
	
	
}
