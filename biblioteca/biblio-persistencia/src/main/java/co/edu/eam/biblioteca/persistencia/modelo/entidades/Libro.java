package co.edu.eam.biblioteca.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class Libro implements Serializable {

	@Id
	private String codigo;
	
	@Column(name="ejemplares")
	private int numeroEjemplares;
	
	
	private String  nombre;
	
	@ManyToOne
	@JoinColumn(name="autor")
	private Autor autor;
	
	@ManyToOne
	@JoinColumn(name="editorial")
	private Editorial editorial;
	
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}


	public Libro(String codigo, int numeroEjemplares, String nombre, Autor autor) {
		super();
		this.codigo = codigo;
		this.numeroEjemplares = numeroEjemplares;
		this.nombre = nombre;
		this.autor = autor;
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
	 * @return the numeroEjemplares
	 */
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}


	/**
	 * @param numeroEjemplares the numeroEjemplares to set
	 */
	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
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
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}


	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public Editorial getEditorial() {
		return editorial;
	}
	
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	
}
