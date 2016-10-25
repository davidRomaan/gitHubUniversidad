package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOAreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;

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
}
