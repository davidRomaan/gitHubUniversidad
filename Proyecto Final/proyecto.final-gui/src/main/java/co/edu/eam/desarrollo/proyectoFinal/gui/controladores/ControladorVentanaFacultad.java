package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOFacultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;

public class ControladorVentanaFacultad {

	private BOFacultad boFacultad;
	
	public ControladorVentanaFacultad(){
		
		boFacultad = new BOFacultad();
	}
	
	public void crearFacultad(Facultad f) throws Exception{	
		boFacultad.crearFacultad(f);
	}
	
	public Facultad buscarFacultad(int id) throws Exception{
		return boFacultad.buscarFacultad(id);
	}
	
	public Facultad editarFacultad(Facultad f) throws Exception{
		return boFacultad.editarFacultad(f);
	}
	
	public List<Facultad> listarFacultad()throws Exception{
		return boFacultad.listarFacultad();
	}
}
