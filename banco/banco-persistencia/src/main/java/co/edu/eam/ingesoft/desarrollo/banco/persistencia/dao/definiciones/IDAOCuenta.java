package co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cuenta;

public interface IDAOCuenta {

	public void crear(Cuenta cuenta) throws Exception;

	public void editar(Cuenta cuenta) throws Exception;

	public void borrar(Cuenta cuenta) throws Exception;

	public Cuenta buscar(String numero) throws Exception;

	public List<Cuenta> listarCuentasCLiente(Cliente c) throws Exception;
	
	public double sumaSaldosCliente(Cliente c) throws Exception;
}
