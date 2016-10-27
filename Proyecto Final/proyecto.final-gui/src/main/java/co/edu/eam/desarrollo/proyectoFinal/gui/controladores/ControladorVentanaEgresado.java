/**
 * Carlos Martinez
 * Roman
 * 
 * Controlador de las funciones de la ventana egresado
 */
package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;
import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEgresado;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOFacultad;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOPrograma;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;

public class ControladorVentanaEgresado {
	private BOEgresado bo;
	private BOFacultad boFacultad;
	private BOPrograma boPrograma;
	public ControladorVentanaEgresado(){
		bo = new BOEgresado();
		boFacultad = new BOFacultad();
		boPrograma = new BOPrograma();
	}

	/**
	 * Listamos todas las facultades que se encuentran en la bd
	 * @return lista con todas las facultades
	 * @throws Exception Exception en caso de que haya una excepcion tecnica o de negocio.
	 */
	public List<Facultad> listarFacultades() throws Exception{
		return boFacultad.listarFacultad();
	}
	
	/**
	 * Listamos todas los programas que se encuentran en la bd
	 * @return lista con todas los programas
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<Programa> listarProgramaFacultad(Facultad facultad) throws Exception{
		return boPrograma.listarProgramaFacultad(facultad);
	}
	/**
	 * Listamos todas los Sectores laborales que se encuentran en la bd
	 * @return lista con todas los sectores laborales
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<SectorLaboral> listarSectorLaboral() throws Exception{
		return null;
	}
}
