package co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.implementacion.txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.definiciones.IDAOCliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;

public class DAOClienteTXT implements IDAOCliente {

	public void crear(Cliente cliente) throws Exception {

		PrintWriter salida = new PrintWriter(new FileWriter("clientes.txt", true));
		salida.println(cliente.getCedula() + ";" + cliente.getNombre() + ";" + cliente.getTelefono() + ";"
				+ cliente.getDireccion());

		salida.close();
	}

	public void editar(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub

	}

	public void eliminar(String cedula) throws Exception {
		// TODO Auto-generated method stub

	}

	public Cliente buscar(String cedula) throws Exception {

		BufferedReader entrada = new BufferedReader(new FileReader("clientes.txt"));

		String linea=null;
		while((linea=entrada.readLine())!=null){
			String data[] =linea.split(";");
			if(data[0].equals(cedula)){
				Cliente c=new Cliente(data[1],data[0],data[2],data[3]);
				return c;
			}
		}
		
		return null;
		
	}

	public List<Cliente> listarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
