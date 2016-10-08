package co.edu.eam.disenosoft.universidad.contrloadores;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;

public class ControladorVentanaAsignatura {

	
	private BOAsignatura boAsignatura;
	
	public ControladorVentanaAsignatura(){
		boAsignatura = new BOAsignatura();
	}
	
	public void crearAsignatura (Asignatura a) throws Exception{
		boAsignatura.crearAsignatura(a);
	}
	
	public Asignatura buscarAsignatura(String ced) throws Exception{
		return boAsignatura.buscarAsignatura(ced);
	}
	
	public void  eliminarAsignatura(Asignatura a) throws Exception{
		boAsignatura.eliminarAsignatura(a);
	}
	
	public Asignatura editarEstudiante(Asignatura a) throws Exception{
		return boAsignatura.editarAsignatura(a);
	}
	
	
	
}
