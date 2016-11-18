package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.HistorialLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public interface IDAOEgresado {
	/**
	 * Crear egresado
	 */
	public void crearEgresado(Egresado e)throws Exception;
	
	/**
	 * buscar egresado
	 */
	public Egresado buscarEgresado(int cod)throws Exception;
	
	/**
	 * crear Historial laboral del egresado
	 */
	public void crearHistorialLaboral(HistorialLaboral hl) throws Exception;
	
	/**
	 * Registrar informacion laboral
	 */
	public void crearInformacionLaboral(InformacionLaboral informacionLaboral)throws Exception;
	
	/**
	 * Registrar informacion laboral
	 */
	public void crearInformacionAcademica(InformacionAcademica ia)throws Exception;
	
	/**
	 * buscar egresado por tipo de documento y numero documento
	 */
	public Egresado buscarEgresadoTipo(TipoDocumento tipo, String numero)throws Exception;
	
	/**
	 * Buscar informacion laboral de un egresado
	 */
	public InformacionLaboral buscarInfoLaboral(int id) throws Exception;
	/**
	 * Buscar informacion academica de un egresado
	 */
	public InformacionAcademica buscarInfoAcademica(int id) throws Exception;
	/**
	 * Editar egresado
	 */
	public void editar (Egresado e)throws Exception;
	
	/**
	 * Eliminar egresado
	 */
	public void eliminarEgresado (Egresado e)throws Exception;
	
	/**
	 * lista los egresados por empresa
	 * @param e la empresa por la cual se buscara
	 * @throws Exception en caso de excepcion tecnica
	 */
	public List<InformacionLaboral> listarEgresadosPorEmpresa(Empresa e)throws Exception;
	
	/**
	 * lista los egresados por ocupacion
	 * @param p el programa a el que se le buscaran los egresados
	 * @return la lista
	 * @throws Exception en caso de excepcion tecnica
	 */
	public List<InformacionLaboral> listaEgresadosPorOcupacion(Programa p)throws Exception;
	
	/**
	 * editar informacion laboral del egresado
	 */
	public void editarInfoLaboral(InformacionLaboral l) throws Exception;
	/**
	 * editar informacion academica del egresado
	 */
	public void editarInfoAcademica(InformacionAcademica a) throws Exception;
}
