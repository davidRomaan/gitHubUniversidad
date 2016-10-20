package co.edu.eam.diseno.banco.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cuenta;
import co.edu.eam.ingesoft.desarrollo.logica.bos.BOCliente;
import co.edu.eam.ingesoft.desarrollo.logica.bos.BOCuenta;

/**
 * 
 * Clase responsable de controlar la ventana de crearcancelarcuenta <br>
 * 
 * @author Camilo Andres Ferrer Bustos<br>
 *         caferrer@gmail.com<br>
 * 
 * @date 9/09/2016
 * @version 1.0
 */
public class ControladorCrearCancelarCuenta {
	
	
	private BOCuenta boCuenta;
	private BOCliente boCliente;
	
	public ControladorCrearCancelarCuenta() {
		boCuenta=new BOCuenta();
		boCliente=new BOCliente();
	}
	
	public Cliente buscarCliente(String cedula) throws Exception{
		return boCliente.buscarCLiente(cedula);
	}
	
	public void crearCuenta(Cuenta acc) throws Exception{
		boCuenta.crearCuenta(acc);
	}
	
	
	public double sumaSaldosCLiente(String cedula) throws Exception{
		return boCuenta.sumaSaldosCLiente(cedula);
	}
	
	public List<Cuenta> listarCuentasCliente(String cedula) throws Exception{
		return boCuenta.listarCuentasCliente(cedula);
	}
	
	

}
