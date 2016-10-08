package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(FallaPK.class)
@Table(name="tb_falla")
public class Falla implements Serializable{

	@Id
	@Column(name="id_falla")
	private int codigoFalla;
	
	@Column(name="numero_fallas",length=11,nullable = false)
	private int numeroFallas;
	
	@Id
	@ManyToOne
	@JoinColumns({
		
		@JoinColumn(name="CED_EST", referencedColumnName="cedula_est"),
		@JoinColumn(name="COD_CUR", referencedColumnName="codigo_cur")
	})
	private RegistroCurso codCurso;
	
	
	public Falla() {
		// TODO Auto-generated constructor stub
	}

	public Falla(int codigoFalla, int numeroFallas, RegistroCurso codCurso) {
		super();
		this.codigoFalla = codigoFalla;
		this.numeroFallas = numeroFallas;
		this.codCurso = codCurso;
	}

	public int getCodigoFalla() {
		return codigoFalla;
	}

	public void setCodigoFalla(int codigoFalla) {
		this.codigoFalla = codigoFalla;
	}

	public int getNumeroFallas() {
		return numeroFallas;
	}

	public void setNumeroFallas(int numeroFallas) {
		this.numeroFallas = numeroFallas;
	}

	public RegistroCurso getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(RegistroCurso codCurso) {
		this.codCurso = codCurso;
	}

	
}
