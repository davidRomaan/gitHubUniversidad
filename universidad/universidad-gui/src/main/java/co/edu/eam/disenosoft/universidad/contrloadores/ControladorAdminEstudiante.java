package co.edu.eam.disenosoft.universidad.contrloadores;

import co.edu.eam.disenosoft.universidad.logica.bos.BOEstudiante;
import co.edu.eam.disenosoft.universidad.logica.bos.BOProfesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;

/**
 * clase encargada de controlar la ventana del Estudiante
 * @author david
 *
 */
public class ControladorAdminEstudiante {

	
	private BOEstudiante boEstudiante;
	
	public ControladorAdminEstudiante(int a){
		
		boEstudiante = new BOEstudiante();
	
	}
	
	
	public void crearEstudiante (Estudiante es) throws Exception{
		 boEstudiante.crearEstudiante(es);
	}
	
	public Estudiante buscarEstudiante(String ced) throws Exception{
		return boEstudiante.buscarEstudiante(ced);
	}
	
	public Estudiante eliminarEstudiante(Estudiante e) throws Exception{
		return boEstudiante.eliminarEstudiante(e);
	}
	
	public Estudiante editarEstudiante(Estudiante e) throws Exception{
		return boEstudiante.editarEstudiante(e);
	}
	
	
}
