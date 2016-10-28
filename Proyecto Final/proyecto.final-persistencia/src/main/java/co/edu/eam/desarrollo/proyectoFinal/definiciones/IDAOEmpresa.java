package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;

public interface IDAOEmpresa {

	public void crearEmpresa(Empresa e) throws Exception;

	public Empresa buscarEmpresa(int id) throws Exception;

	public void editarEmpresa(Empresa e) throws Exception;
	
	public void eliminarEmpresa(Empresa e)throws Exception;
	/**
	 * Lista todas las empresas registradas en la bd
	 * @return lista con todas las empresa
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Empresa> listar() throws Exception;
}
