/*
 * Clase que representa el contacto de una empresa.
 * @author Carlos Martinez
 */
package co.edu.eam.desarrolloSoftware.proyectoFinal.modelo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_CONTACTO")
public class Contacto implements Serializable{

	/* Empresa al que pertenece el contacto */
	
	@OneToOne()
	@JoinColumn(name="ID_EMPRESA", insertable=false, updatable=false)
	@MapsId
	private Empresa empresa;
	
	/* Es necesario crear un nuevo atributo entero para mapear una relacion uno a uno*/
	@Id
	@Column(name="ID_EMPRESA")
	private int idContacto;
	
	/* Nombre Completo del remitente */
	@Column(name="NOMBRE_COMPLETO", nullable=false)
	private String NombreCompleto;
	
	/* correo electronico */
	@Column(name="CORREO", nullable=false)
	private String Correo;
	
	/* Cargo en la empresa del remitente*/
	@Column(name="CARGO", nullable=false)
	private String CargoEmpresa;
	
	/* Telefono del remitente */
	@Column(name="TELEFONO", nullable=false)
	private String telefono;

	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contacto(Empresa empresa, String nombreCompleto, String correo, String cargoEmpresa, String telefono) {
		super();
		this.empresa = empresa;
		NombreCompleto = nombreCompleto;
		Correo = correo;
		CargoEmpresa = cargoEmpresa;
		this.telefono = telefono;
	}

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNombreCompleto() {
		return NombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getCargoEmpresa() {
		return CargoEmpresa;
	}

	public void setCargoEmpresa(String cargoEmpresa) {
		CargoEmpresa = cargoEmpresa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return  NombreCompleto;
	}
	
	
	
}
