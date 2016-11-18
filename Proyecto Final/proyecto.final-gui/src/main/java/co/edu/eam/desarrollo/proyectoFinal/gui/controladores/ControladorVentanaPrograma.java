package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;
import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOPrograma;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public class ControladorVentanaPrograma {

	private BOPrograma boPrograma;

	public ControladorVentanaPrograma() {

		boPrograma = new BOPrograma();
	}

	/**
	 * crea un programa en la base de datos
	 * @param p el programa que se va a crear
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public void crearPrograma(Programa p) throws Exception {
		boPrograma.crearPrograma(p);

	}

	/**
	 * busca un programa en la base de datos
	 * @param p el programa que se va a buscar
	 * @return el programa 
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public Programa buscarPrograma(int id) throws Exception {
		return boPrograma.buscarPrograma(id);
	}
	
	/**
	 * edita un programa 
	 * @param p el programa que se va a editar
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public Programa editarPrograma(Programa p) throws Exception{
		return boPrograma.editarPrograma(p);
	}
	/**
	 * Listamos todas los programas que se encuentran en la bd
	 * @return lista con todas los programas
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<Programa> listarPrograma() throws Exception{
		return boPrograma.listarPrograma();
	}
	/**
	 * Eliminar programa
	 * @param id del programa a eliminar
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void eliminarPrograma(int id) throws Exception{
		boPrograma.eliminarPrograma(id);
	}
}
