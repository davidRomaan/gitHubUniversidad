package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;
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
}
