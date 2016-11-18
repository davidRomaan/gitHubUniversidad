/*
 * Clase que representa un Egresado.
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;


@Entity
@Table(name="T_EGRESADO")
public class Egresado implements Serializable{
	

	
	/* Identificador del egresado */
	@Id
	@Column(name="ID_EGRESADO")
	private int id;
	
	/* programa al que pertenece el Egresado */
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_PROGRAMA")
	private Programa programa;
	
	/* Nombre del Egresado */
	@Column(name="NOMBRE_EGRESADO", nullable=false)
	private String nombre;
	
	/* Apellido del Egresado */
	@Column(name="APELLIDO_EGRESADO", nullable=false)
	private String apellido;
	
	/* Correo del Egresado */
	@Column(name="CORREO_EGRESADO", nullable=false)
	private String correo; 
	
	/* Telefono del Egresado */
	@Column(name="TELEFONO_EGRESADO", nullable=false)
	private String telefono;
	
	/* celular del Egresado */
	@Column(name="CELULAR_EGRESADO", nullable=false)
	private String celular;
	
	/* Tipo de documento del Egresado */
	@Column(name="TIPO_DOCUMENTO_EGRESADO", nullable=false)
	private TipoDocumento tipoDocumento;
	
	/* Numero de documento del Egresado */
	@Column(name="DOCUMENTO_EGRESADO", nullable=false)
	private String numeroDocumento;

	/* Informacion laboral */
	@OneToOne(mappedBy="egresado")
	private InformacionLaboral informacionLaboral;
	
	/* Informacion Academica */
	@OneToOne(mappedBy="egresado")
	private InformacionAcademica informacionAcademica;
	
	public Egresado() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Egresado(int id, Programa programa, String nombre, String apellido, String correo, String telefono,
			String celular, TipoDocumento tipoDocumento, String numeroDocumento) {
		super();
		this.id = id;
		this.programa = programa;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.celular = celular;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}


	public int getId() {
		return id;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
	
	public InformacionLaboral getInformacionLaboral() {
		return informacionLaboral;
	}
	public void setInformacionLaboral(InformacionLaboral informacionLaboral) {
		this.informacionLaboral = informacionLaboral;
	}
	public InformacionAcademica getInformacionAcademica() {
		return informacionAcademica;
	}
	public void setInformacionAcademica(InformacionAcademica informacionAcademica) {
		this.informacionAcademica = informacionAcademica;
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
		Egresado other = (Egresado) obj;
		if (id != other.id)
			return false;
		return true;
	}	
}
