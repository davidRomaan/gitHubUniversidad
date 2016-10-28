package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Ciudad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Departamento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;

public interface IDAOEmpresa {

	public void crearEmpresa(Empresa e) throws Exception;

	public Empresa buscarEmpresa(String nit) throws Exception;

	public void editarEmpresa(Empresa e) throws Exception;
	
	public void eliminarEmpresa(Empresa e)throws Exception;
	/**
	 * Lista todas las empresas registradas en la bd
	 * @return lista con todas las empresa
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	
	public List<Empresa>listarEmpresas()throws Exception;
	
	public List<Departamento>listarDepartamentos()throws Exception;
	
	public List<Ciudad>listarCiudades()throws Exception;
	
	public List<SectorLaboral>listarSectorLab()throws Exception;
	
}
