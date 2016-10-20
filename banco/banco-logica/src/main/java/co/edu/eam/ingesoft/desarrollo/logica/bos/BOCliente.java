package co.edu.eam.ingesoft.desarrollo.logica.bos;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.definiciones.IDAOCliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.implementacion.jpa.DAOClienteJPA;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;

public class BOCliente {
	
	
	private IDAOCliente daoCliente;
	
	public BOCliente() {
		daoCliente=new DAOClienteJPA();
	}
	
	
	public Cliente buscarCLiente(String cedula) throws Exception{
		return daoCliente.buscar(cedula);
	}

}
