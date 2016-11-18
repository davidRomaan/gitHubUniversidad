package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;

public interface IDAOInfoAcademica {

	/**
	 * crea un objeto InformacionAcademica en la base de datos
	 */
	public void crear(InformacionAcademica i) throws Exception;

	/**
	 * busca la Informacion Academica 
	 * @cod identificador por el que se le va a buscar
	 */
	public InformacionAcademica buscarInfoAcadem(int cod) throws Exception;

	/**
	 * Listamos todas la InformacionAcademica que se encuentran en la bd
	 * @return lista con todas la InformacionAcademica
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<InformacionAcademica> listarInformacionAcademicaEgres(Egresado e);

	/**
	 * actualiza la InformacionAcademica de la base de datos
	 */
	public void editar(InformacionAcademica i) throws Exception;

}
