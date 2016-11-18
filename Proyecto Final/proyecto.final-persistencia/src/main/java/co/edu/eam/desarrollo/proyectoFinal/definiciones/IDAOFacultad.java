package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;

public interface IDAOFacultad {

	/**
	 * crea un objeto Facultad en la base de datos
	 */
	public void crearFacultad(Facultad f) throws Exception;


	/**
	 * busca la facultad 
	 * @id identificador por el que se le va a buscar
	 */
	public Facultad buscarFacultad(int id) throws Exception;

	/**
	 * actualiza la facultad de la base de datos
	 */
	public void editar(Facultad f) throws Exception;

 	/**
	 * Listamos todas las facultades que se encuentran en la bd
	 * @return lista con todas las facultades
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<Facultad> listarFacultades() throws Exception;
}
