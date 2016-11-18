package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEgresado;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEmpresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public class ControladorVentanaReportesyEstadisticas {

	private BOEmpresa boEmpresa;
	private BOEgresado boEgresado;

	public ControladorVentanaReportesyEstadisticas() {

		boEmpresa = new BOEmpresa();
		boEgresado = new BOEgresado();
	}

	/**
	 * lista con las empresas
	 * 
	 * @return la lista con las empresas
	 * @throws Exception
	 *             en caso de que ocurra una excepcion tecnica
	 */
	public List<Empresa> listarEmpresas() throws Exception {
		return boEmpresa.listarEmpresas();
	}

	/**
	 * lista los egresados por empresa
	 * 
	 * @param e
	 *            la empresa por la cual se buscaran
	 * @return la lista
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public List<InformacionLaboral> listarEgresadosPorEmpresa(Empresa e) throws Exception {
		return boEgresado.listarEgresadosPorEmpresa(e);
	}

	/**
	 * lista los egresados por ocupacion
	 * @param p el programa  al cual se buscaran los egresados 
	 * @return la lista
	 * @throws Exception  en caso de una excepcion tecnica o de negocio
	 */
	public List<InformacionLaboral> listaEgresadosPorOcupacion(Programa p) throws Exception {
        return boEgresado.listaEgresadosPorOcupacion(p);
	}
}
