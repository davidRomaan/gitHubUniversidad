package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.HistorialLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;

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
	
}
