package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;

public interface IDAOInfoLaboral {

	/**
	 * crea un objeto InformacionLaboral en la base de datos
	 */
	public void crear(InformacionLaboral i) throws Exception;
	
	/**
	 * busca la Informacion Laboral 
	 * @cod identificador por el que se le va a buscar
	 */
	public InformacionLaboral buscarInfoLaboral(int cod)throws Exception;

	/**
	 * Listamos todas la Informacion Laboral que se encuentran en la bd
	 * @return lista con todas la Informacion Laboral
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<InformacionLaboral> listarInformacionLaboralEgres(Egresado e);

	/**
	 * actualiza la Informacion Laboral de la base de datos
	 */
	public void editar(InformacionLaboral i) throws Exception;
}
