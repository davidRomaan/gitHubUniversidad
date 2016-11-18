package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOFacultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;

public class ControladorVentanaFacultad {

	private BOFacultad boFacultad;
	
	public ControladorVentanaFacultad(){
		
		boFacultad = new BOFacultad();
	}
	
	/**
	 * crea una facultad en la base de datos
	 * @param f la facultad a crear
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public void crearFacultad(Facultad f) throws Exception{	
		boFacultad.crearFacultad(f);
	}
	
	/**
	 * busca una facultad en la base de datos
	 * @param f la facultad a buscar
	 * @return la faculad
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public Facultad buscarFacultad(int id) throws Exception{
		return boFacultad.buscarFacultad(id);
	}
	
	/**
	 * edita una faculad
	 * @param f la facultad a editar
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public Facultad editarFacultad(Facultad f) throws Exception{
		return boFacultad.editarFacultad(f);
	}
	
	/**
	 * Listamos todas las facultades que se encuentran en la bd
	 * @return lista con todas las facultades
	 * @throws Exception Exception en caso de que haya una excepcion tecnica o de negocio.
	 */
	public List<Facultad> listarFacultad()throws Exception{
		return boFacultad.listarFacultad();
	}
}
