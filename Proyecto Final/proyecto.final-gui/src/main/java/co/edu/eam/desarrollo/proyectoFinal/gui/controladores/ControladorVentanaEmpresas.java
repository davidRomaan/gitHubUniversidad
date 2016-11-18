package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOContacto;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEmpresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Ciudad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Contacto;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Departamento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;

public class ControladorVentanaEmpresas {

	private BOEmpresa boEmpresa;
	private BOContacto boContacto;
	
	public ControladorVentanaEmpresas() {
	
		boEmpresa = new BOEmpresa();
		boContacto = new BOContacto();
	}
	
	/**
	 * crea una empresa en la base de datos
	 * 
	 * @param e
	 *            la empresa a registrar
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public void crearEmpresa(Empresa e)throws Exception{
		boEmpresa.crearEmpresa(e);
	}
	
	/**
	 * busca una empresa en la base de datos
	 * 
	 * @param e
	 *            la empresa a buscar
	 */
	public Empresa buscarEmpresa(String nit)throws Exception{
		return boEmpresa.buscarEmpresa(nit);
	}
	
	/**
	 * edita una empresa
	 * 
	 * @param e
	 *           la empresa a editar
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public Empresa editarEmpresa(Empresa e)throws Exception{
		return boEmpresa.editarEmpresa(e);
	}
	
	/**
	 * crea un contacto en la base de datos
	 * @param c el contacto a crear
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public void crearContacto(Contacto c,Empresa emp)throws Exception{
		boContacto.crearContacto(c,emp);
	}
	
	/**
	 * busca un contacto en la base de datos
	 * @param cod el codigo a buscar
	 * @return la el contacto
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public Contacto buscarContacto(String nit)throws Exception{
		return boContacto.buscarContacto(nit);
	}
	
	/**
	 * actualiza los datos 
	 * @param c el contacto a actualizar
	 * @return el contacto actualizado
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public Contacto editarContacto(Contacto c)throws Exception{
		return boContacto.editarContacto(c);
	}
	
	/**
	 * lista de todos los departamentos que hay en la db
	 * @return la lista con los departamentos
	 * @throws Exception Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public List<Departamento> listarDepartamentos()throws Exception{
		return boEmpresa.listarDepartamentos();
	}
	
	/**
	 * lista las ciudades de la base de datos
	 * @return la lista de las ciudades
	 * @throws Exception Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Ciudad> listarCiudades()throws Exception{
		return boEmpresa.listarCiudades();
	}
	
	/**
	 * lista los Sectores laborales de la base de datos
	 * @return la lista de los sectores laborales
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<SectorLaboral> listarSectorLaboral()throws Exception{
		return boEmpresa.listarSectorLaboral();
	}
}
