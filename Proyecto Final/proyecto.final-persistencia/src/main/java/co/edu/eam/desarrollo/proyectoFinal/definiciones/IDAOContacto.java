package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Contacto;

public interface IDAOContacto {

	/**
	 * crea un objeto Contacto en la base de datos
	 */
	public void crear(Contacto c) throws Exception;

	/**
	 * busca un contacto en la base de datos 
	 * @id identificador por el que se le va a buscar
	 */
	public Contacto buscar(String nit) throws Exception;

	/**
	 * actualiza el Contacto de la base de datos
	 */
	public void editar(Contacto c) throws Exception;
	

}
