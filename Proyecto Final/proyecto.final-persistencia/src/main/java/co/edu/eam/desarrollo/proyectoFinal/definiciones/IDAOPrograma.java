package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public interface IDAOPrograma {
	/**
	 * Registra un programa en la bd
	 * @param p
	 * @throws Exception
	 */
	public void crearPrograma(Programa p) throws Exception;

	/**
	 * Buscamos un programa por su codigo
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Programa buscarPrograma(int id) throws Exception;
	
	/**
	 * Buscamos un programa por su nombre
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public boolean buscarProgramaNombre(String nombre) throws Exception;
	
	/**
	 * Edita un programa
	 * @param p
	 * @throws Exception
	 */
	public void editarPrograma(Programa p) throws Exception;
	
	/**
	 * Lista todos los programas
	 * @param facultad
	 * @return
	 * @throws Exception
	 */
	public List<Programa> listarPrograma() throws Exception;
	
	/**
	 * Lista todos los programas de una determinada Facultad
	 * @param facultad
	 * @return
	 * @throws Exception
	 */
	public List<Programa> listarProgramaFacultad(Facultad facultad) throws Exception;

	/**
	 * Eliminar programa
	 * @param id del programa a eliminar
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void eliminar(Programa programa) throws Exception;
}
