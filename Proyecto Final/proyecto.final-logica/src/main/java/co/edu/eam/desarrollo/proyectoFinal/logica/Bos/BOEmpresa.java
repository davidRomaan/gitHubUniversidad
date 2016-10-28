package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;
import java.util.List;
import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOEmpresa;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOEmpresa;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Ciudad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Departamento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;

public class BOEmpresa {

	
	private IDAOEmpresa daoEmpresa;
	
	public BOEmpresa(){
		daoEmpresa = new DAOEmpresa();
	}
	
	
	/**
	 * crea una empresa en la base de datos
	 * 
	 * @param e
	 *            la empresa a registrar
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public void crearEmpresa(Empresa e) throws Exception {

		Empresa emp = daoEmpresa.buscarEmpresa(e.getNit());
		if (emp != null) {
			throw new ExcepcionNegocio("la empresa ya se encuentra registrada");
		} else {
			daoEmpresa.crearEmpresa(e);
		}
	}
	
	/**
	 * busca una empresa en la base de datos
	 * 
	 * @param e
	 *            la empresa a buscar
	 */
	public Empresa buscarEmpresa(String nit) throws Exception {
		return daoEmpresa.buscarEmpresa(nit);
		
	}
	
	/**
	 * edita una empresa
	 * 
	 * @param e
	 *           la empresa a editar
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public Empresa editarEmpresa(Empresa e) throws Exception {
		daoEmpresa.editarEmpresa(e);
		return e;
		
	}
	
	/**
	 * elimina una empresa
	 * 
	 * @param e
	 *            la empresa a eliminar
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public void eliminarEmpresa(Empresa e) throws Exception {
		Empresa emp = daoEmpresa.buscarEmpresa(e.getNit());
		if (emp != null) {
			daoEmpresa.eliminarEmpresa(emp);
		} else {
			throw new ExcepcionNegocio("el egresado no se encuentra");
		}

	}
	
	/**
	 * lista los departamentos de la base de datos
	 * @return la lista de las ciudades
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Departamento>listarDepartamentos()throws Exception{
		return daoEmpresa.listarDepartamentos();
	}
	
	/**
	 * lista las ciudades de la base de datos
	 * @return la lista de las ciudades
	 * @throws Exception Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Ciudad>listarCiudades()throws Exception{
		return daoEmpresa.listarCiudades();
	}
	
	/**
	 * lista los Sectores laborales de la base de datos
	 * @return la lista de los sectores laborales
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<SectorLaboral>listarSectorLaboral()throws Exception{
		return daoEmpresa.listarSectorLab();
	}
}
