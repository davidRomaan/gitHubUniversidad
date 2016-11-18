package co.edu.eam.desarrollo.proyectoFinal.definiciones;
import java.util.List;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Ciudad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Departamento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;

public interface IDAOEmpresa {

	/**
	 * crea un objeto Empresa en la base de datos
	 */
	public void crearEmpresa(Empresa e) throws Exception;

	/**
	 * busca la empresa en la base de datos 
	 * @nit identificador por el que se le va a buscar
	 */
	public Empresa buscarEmpresa(String nit) throws Exception;


	/**
	 * actualiza la empresa de la base de datos
	 */
	public void editarEmpresa(Empresa e) throws Exception;
	
	/**
	 * elimina la empresa de la base de datos
	 * @em empresa que se va a eliminar
	 */
	public void eliminarEmpresa(Empresa e)throws Exception;
	/**
	 * Lista todas las empresas registradas en la bd
	 * @return lista con todas las empresa
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Empresa>listarEmpresas()throws Exception;
	
	/**
	 * Lista todas los departamentos registradas en la bd
	 * @return lista con todos los departamentos
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Departamento>listarDepartamentos()throws Exception;
	
	/**
	 * Lista todas las ciudades registradas en la bd
	 * @return lista con todas las ciudades
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Ciudad>listarCiudades()throws Exception;
	
	/**
	 * Lista todas los sectores laborales registradas en la bd
	 * @return lista con todas los sectores
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<SectorLaboral>listarSectorLab()throws Exception;
	
}
