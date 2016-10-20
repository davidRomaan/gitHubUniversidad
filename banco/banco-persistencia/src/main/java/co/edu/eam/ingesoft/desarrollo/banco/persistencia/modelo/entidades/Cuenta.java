package co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
		@NamedQuery(name = Cuenta.CONSULTA_LISTAR_CUENTAS_POR_CLIENTE, 
				query = "SELECT c FROM Cuenta c WHERE c.cliente=?1"),
		@NamedQuery(name = Cuenta.CONSULTA_SUMA_SALDO_CUENTA_CLIENTE, 
		query = "SELECT SUM(c.saldo) FROM Cuenta c WHERE c.cliente=?1")

})

@Table(name = "T_CUENTAS")
@Entity
public class Cuenta implements Serializable {

	/**
	 * conuslta para listar las cunetas de un cliuente<b>
	 * ?1: el cliente.
	 */
	public static final String CONSULTA_LISTAR_CUENTAS_POR_CLIENTE = "Cuenta.listarporcliente";

	
	/**
	 * conuslta para sumar el saldo de las cunetas de un cliuente<b>
	 * ?1: el cliente.
	 */
	public static final String CONSULTA_SUMA_SALDO_CUENTA_CLIENTE = "Cuenta.sumaSaldosCliente";

	
	@Column(name = "SALDO")
	private double saldo;

	@Column(name = "PASSWORD")
	private String contrasena;

	@Id
	@Column(name = "NUMERO")
	private String numero;

	@Column(name = "CANCELADA")
	private boolean cancelada;

	@ManyToOne(cascade = {})
	@JoinColumn(name = "CED_CLIENTE")
	private Cliente cliente;

	@JoinColumn(name = "ID_TIPOCUENTA")
	@ManyToOne(cascade = {})
	private TipoCuenta tipoCuenta;

	public Cuenta() {
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena
	 *            the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the cancelada
	 */
	public boolean isCancelada() {
		return cancelada;
	}

	/**
	 * @param cancelada
	 *            the cancelada to set
	 */
	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the tipoCuenta
	 */
	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}

	/**
	 * @param tipoCuenta
	 *            the tipoCuenta to set
	 */
	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

}
