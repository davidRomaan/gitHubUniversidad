package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;

public interface IDAOEmpresa {

	public void crearEmpresa(Empresa e) throws Exception;

	public Empresa buscarEmpresa(int id) throws Exception;

	public void editarEmpresa(Empresa e) throws Exception;
	
	public void eliminarEmpresa(Empresa e)throws Exception;
}
