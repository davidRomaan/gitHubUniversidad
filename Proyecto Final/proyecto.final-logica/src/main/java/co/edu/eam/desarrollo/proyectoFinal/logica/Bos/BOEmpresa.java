package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOEmpresa;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOEmpresa;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;

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

		Empresa emp = daoEmpresa.buscarEmpresa(e.getId());
		if (emp != null) {
			throw new ExcepcionNegocio("la empresa ya se encuentra registrado");
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
	public Empresa buscarEmpresa(int id) throws Exception {
		Empresa e = daoEmpresa.buscarEmpresa(id);
		if (e == null) {
			throw new ExcepcionNegocio("la empresa no se encuantra registrada");
		} else {
			return e;
		}
	}
	
	/**
	 * edita una empresa
	 * 
	 * @param e
	 *           la empresa a editar
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public void editarEmpresa(Empresa e) throws Exception {
		Empresa emp = daoEmpresa.buscarEmpresa(e.getId());
		if (emp != null) {
			daoEmpresa.editarEmpresa(emp);
		} else {
			throw new ExcepcionNegocio("la empresa no se encuentra");
		}
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
		Empresa emp = daoEmpresa.buscarEmpresa(e.getId());
		if (emp != null) {
			daoEmpresa.eliminarEmpresa(emp);
		} else {
			throw new ExcepcionNegocio("el egresado no se encuentra");
		}

	}
}
