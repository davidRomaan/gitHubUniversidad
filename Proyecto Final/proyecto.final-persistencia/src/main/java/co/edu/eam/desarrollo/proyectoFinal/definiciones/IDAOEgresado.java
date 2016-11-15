package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;

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
	 * buscar egresado por tipo de documento y numero documento
	 */
	public Egresado buscarEgresadoTipo(TipoDocumento tipo, String numero)throws Exception;
	
	/**
	 * Editar egresado
	 */
	public void editar (Egresado e)throws Exception;
	
	/**
	 * Eliminar egresado
	 */
	public void eliminarEgresado (Egresado e)throws Exception;
	
}
