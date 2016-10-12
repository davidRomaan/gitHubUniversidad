package co.ema.edu.biblioteca.controlador;

import java.util.List;

import javax.swing.plaf.basic.BasicOptionPaneUI;

import co.edu.eam.biblioteca.logica.bos.BOPrestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Libro;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Prestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;

public class ControladorVentanaPrestamo {

   private BOPrestamo boPrestamo;

	public ControladorVentanaPrestamo(){
		
		boPrestamo = new BOPrestamo();
	}
	
	
	public Usuario buscarUsuario(String ced) throws Exception{
		return boPrestamo.buscarUsuario(ced);
	}
	
	public Libro buscarLibro(String cod) throws Exception{
		return boPrestamo.buscarLibro(cod);
	}
	
	public Prestamo agregarPrestamo(Prestamo pr, String cod) throws Exception {
		return boPrestamo.crearPrestamo(pr, cod);
	}
	
	public List<Prestamo> prestamosUsuario(Usuario u)throws Exception{
		return boPrestamo.listarPrestamosUsu(u);
	}
}
