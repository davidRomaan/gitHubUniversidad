package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;


import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOPrograma;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public class ControladorVentanaPrograma {

	private BOPrograma boPrograma;

	public ControladorVentanaPrograma() {

		boPrograma = new BOPrograma();
	}

	public void crearPrograma(Programa p) throws Exception {
		boPrograma.crearPrograma(p);

	}

	public Programa buscarPrograma(int id) throws Exception {
		return boPrograma.buscarPrograma(id);
	}
	
	public Programa editarPrograma(Programa p) throws Exception{
		return boPrograma.editarPrograma(p);
	}
}
