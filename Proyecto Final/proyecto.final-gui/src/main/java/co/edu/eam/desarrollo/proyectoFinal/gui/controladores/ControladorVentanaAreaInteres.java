package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOAreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;
import java.util.List;

public class ControladorVentanaAreaInteres {

	private BOAreaInteres boAreaInt;

	public ControladorVentanaAreaInteres() {

		boAreaInt = new BOAreaInteres();
	}

	public void crearAreaInt(AreaInteres a) throws Exception {
		boAreaInt.crearAreaInteres(a);
	}

	public AreaInteres buscarArea(int id) throws Exception {
		return boAreaInt.buscarAreaInteres(id);
	}

	public AreaInteres editarArea(AreaInteres a) throws Exception {
		return boAreaInt.editarAreaInteres(a);
	}
       	/**
	 * Listamos todas las areas de interes que se encuentran en la bd
	 * @return lista con todas las areas de interes
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<AreaInteres> listarAreaInteres() throws Exception{
		return boAreaInt.listarAreaInteres();
	}
}
