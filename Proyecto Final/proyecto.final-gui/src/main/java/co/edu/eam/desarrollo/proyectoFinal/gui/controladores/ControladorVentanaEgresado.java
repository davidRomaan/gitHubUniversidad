/**
 * Carlos Martinez
 * Roman
 * 
 * Controlador de las funciones de la ventana egresado
 */
package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;
import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOAreaInteres;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEgresado;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEmpresa;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOFacultad;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOPrograma;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreasEgresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.HistorialLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;

public class ControladorVentanaEgresado {
	private BOEgresado bo;
	private BOFacultad boFacultad;
	private BOPrograma boPrograma;
	private BOAreaInteres boAreaInteres;
	private BOEmpresa boEmpresa;
	public ControladorVentanaEgresado(){
		bo = new BOEgresado();
		boFacultad = new BOFacultad();
		boPrograma = new BOPrograma();
		boAreaInteres = new BOAreaInteres();
		boEmpresa = new BOEmpresa();
	}
	/**
	 * crear egresado
	 */
	public void crearEgresado(Egresado egresado, List<AreaInteres> misAreas) throws Exception{
		bo.crearEgresado(egresado);
		for (AreaInteres areaInteres : misAreas) {
			AreasEgresado interes = new AreasEgresado(egresado, areaInteres);
			AgregarAreaIntegeresEgresado(interes);
		}
	}
	/**
	 * crear egresado
	 */
	public void crearInformacionLaboral(InformacionLaboral informacionLaboral) throws Exception{
		bo.crearInformacionLaboral(informacionLaboral);
	}
	
	/**
	 * crear egresado
	 */
	public void crearInformacionAcademica(InformacionAcademica ia) throws Exception{
		bo.crearInformacionAcademica(ia);
	}
	
	/**
	 * crear Historial laboral del egresado
	 */
	public void crearHistorialLaboral(HistorialLaboral hl) throws Exception{
		bo.crearHistorialLaboral(hl);
	}
	
	/**
	 * Buscar egresado por tipo de documento y numero de documento
	 */
	public Egresado buscarEgresadoTipo(TipoDocumento tipo, String numeroDocumento) throws Exception{
		return bo.buscarEgresadoTipoYcedula(tipo,numeroDocumento);
	}
	/**
	 * Buscar informacion laboral de un egresado
	 */
	public InformacionLaboral buscarInfoLaboral(int id) throws Exception{
		return bo.buscarInfoLaboral(id);
	}
	/**
	 * Buscar informacion academica de un egresado
	 */
	public InformacionAcademica buscarInfoAcademica(int id) throws Exception{
		return bo.buscarInfoAcademica(id);
	}
	/**
	 * Buscar egresado por id
	 */
	public Egresado buscarEgresado(int id) throws Exception{
		return bo.buscarEgresado(id);
	}
	/*
	 * editar egresado
	 */
	public void editarEgresado(Egresado egresado) throws Exception{
		bo.editarEgresado(egresado);
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
	 * Listamos todas las empresas que se encuentran en la bd
	 * @return lista con todas las empresas
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<Empresa> listarEmpresas() throws Exception{
		return boEmpresa.listarEmpresas();
	}
	/**
	 * Listamos todas las ares de interes que se encuentran en la bd
	 * @return lista con todas las areas de interes
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<AreaInteres> listarAreaInteres() throws Exception{
		return boAreaInteres.listarAreaInteres();
	}
	
	/**
	 * Agregar area de interes  a un egresado
	 */
	public void AgregarAreaIntegeresEgresado(AreasEgresado interes) throws Exception{
		boAreaInteres.addAreaInteresEgresado(interes);
	}
	
/**
	 * Listamos todas las ares de interes de un egresado
	 * @return lista con todas las areas de interes
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<AreaInteres> listarAreaInteresEgresado(Egresado e) throws Exception{
		return boAreaInteres.listarAreaInteresEgresado(e);
	}
	/**
	 * editar egresado
	 */
	public void editar(Egresado egresado) throws Exception{
		bo.editarEgresado(egresado);
	}
	/**
	 * editar informacion laboral del egresado
	 */
	public void editarInfoLaboral(InformacionLaboral l) throws Exception{
		bo.editarInfoLaboral(l);
	}
	/**
	 * editar informacion academica del egresado
	 */
	public void editarInfoAcademica(InformacionAcademica a) throws Exception{
		bo.editarInfoAcademica(a);
	}
}
