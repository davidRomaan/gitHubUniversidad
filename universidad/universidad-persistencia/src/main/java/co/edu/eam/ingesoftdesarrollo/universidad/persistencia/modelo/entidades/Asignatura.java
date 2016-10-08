/**
 * 
 */
package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import co.edu.eam.disenosoft.universidad.modelo.enumeraciones.TipoAsignaturaEnum;

/**
 * Clase que representa a una asignatura.
 * @author david roman
 *
 */


@Entity
@Table(name="tb_asignatura")
public class Asignatura implements Serializable{
	

	/**
	 * Nombre de la asignatura-
	 */
	@Column(name="nombre_asig",nullable=false)
	private String nombre;
	/**
	 * Nombre de la asignatura
	 */
	@Id
	@Column(name="codigo_asig")
	private String codigo;
	
	/**
	 * Tipo de asignatura
	 */
	@Column(name="tipo_asig",nullable=false)
	@Enumerated(EnumType.STRING)
	private TipoAsignaturaEnum tipo;
	
	/**
	 * Numero de creditos asignatura.
	 */
	@Column(name="numerocreditos_asig",nullable=false)
	private int numeroCreditos;
	
	@Column(name="semestre_asig",nullable=false)
	private int semestreAsig;
	
	public Asignatura() {
	
	}
	/**
	 * @param nombre
	 * @param codigo
	 * @param tipo
	 * @param numeroCreditos
	 */
	public Asignatura(String nombre, String codigo, TipoAsignaturaEnum tipo,
			int numeroCreditos,int semestreAsig) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
		this.semestreAsig = semestreAsig;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the tipo
	 */
	public TipoAsignaturaEnum getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoAsignaturaEnum tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the numeroCreditos
	 */
	public int getNumeroCreditos() {
		return numeroCreditos;
	}
	/**
	 * @param numeroCreditos the numeroCreditos to set
	 */
	public void setNumeroCreditos(int numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}
	public int getSemestreAsig() {
		return semestreAsig;
	}
	public void setSemestreAsig(int semestreAsig) {
		this.semestreAsig = semestreAsig;
	}
	
	

}
