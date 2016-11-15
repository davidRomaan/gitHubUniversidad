package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreasEgresado;

import java.util.List;

public interface IDAOAreaInteres {

	public void crear(AreaInteres a) throws Exception;

	public AreaInteres buscar(int cod) throws Exception;

	public void editar(AreaInteres e) throws Exception;
    /**
	 * Listamos todas las areas de interes que se encuentran en la bd
	 * @return lista con todas las areas de interes
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<AreaInteres> listar() throws Exception;
	
	/**
	 * Busca un area de interes por nombre
	 * @param nombre nombre del area a interes a buscar
	 * @return true si ya hay un area de interes con ese nombre, de lo contrario false
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public boolean buscarByNombre(String nombre) throws Exception;
	
	/**
	 * Agrega un area de interes a un determinado egresado
	 */
	public void addAreaInteresEgresado(AreasEgresado interes) throws Exception;
	
	/**
	 * busca un area de interes de un determinado egresado
	 */
	public AreasEgresado buscarAreaInteresEgresado(AreasEgresado interes) throws Exception;
}
