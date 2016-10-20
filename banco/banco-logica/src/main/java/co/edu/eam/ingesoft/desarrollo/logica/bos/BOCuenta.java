package co.edu.eam.ingesoft.desarrollo.logica.bos;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.definiciones.IDAOCliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.definiciones.IDAOCuenta;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.implementacion.jpa.DAOCUentaJPA;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.implementacion.jpa.DAOClienteJPA;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cuenta;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;

public class BOCuenta {

	private IDAOCuenta daoCuenta;
	private IDAOCliente daoCliente;

	public BOCuenta() {
		daoCuenta = new DAOCUentaJPA();
		daoCliente = new DAOClienteJPA();
	}

	/**
	 * 
	 * Método que crea una cuenta<br>
	 * un cliente solo puede tener hasta 3 cuentas.
	 * 
	 * @author Camilo Andres Ferrer Bustos<br>
	 *         caferrerb<br>
	 * 
	 * @date 9/09/2016
	 * @version 1.0
	 * @param cuenta
	 * @throws Exception
	 *
	 */
	public void crearCuenta(Cuenta cuenta) throws Exception {

		Cliente cliente = daoCliente.buscar(cuenta.getCliente().getCedula());
		// verificar si el cliente existe.
		if (cliente != null) {

			List<Cuenta> cuentas = daoCuenta.listarCuentasCLiente(cuenta.getCliente());
			// verificando el numero maximo de cuentas.
			if (cuentas.size() < 3) {

				daoCuenta.crear(cuenta);

			} else {
				throw new ExcepcionNegocio("Se excedio el numero de cuentas");
			}
		} else {
			throw new ExcepcionNegocio("No existe el cliente");

		}

	}

	public List<Cuenta> listarCuentasCliente(String cedula) throws Exception {
		Cliente cli = daoCliente.buscar(cedula);
		if (cli != null) {
			List<Cuenta> cuentas = daoCuenta.listarCuentasCLiente(cli);
			return cuentas;
		} else {
			throw new ExcepcionNegocio("No existe el cliente");
		}

	}
	
	public Cuenta buscar(String numero) throws Exception{
		return daoCuenta.buscar(numero);
	}

	public double sumaSaldosCLiente(String cedula) throws Exception {
		Cliente cli = daoCliente.buscar(cedula);
		if (cli != null) {

			return daoCuenta.sumaSaldosCliente(cli);
		} else {
			throw new ExcepcionNegocio("No existe el cliente");
		}

	}

}
