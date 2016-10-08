package co.edu.eam.disenosoft.universidad.contrloadores;

import java.util.List;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.logica.bos.BOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;

public class ControladorVentanaVerEstudiante {

	private BOAsignatura boAsignatura;
	private BOEstudiante boEstudiante;
	public ControladorVentanaVerEstudiante(){
		
		boAsignatura = new BOAsignatura();
		boEstudiante = new BOEstudiante();
	}
	
	public int crditosEstudiante(Estudiante e) throws Exception{
		return boAsignatura.creditosRegistrados(e);
	}
	
	public List<Nota>listarTablaEstudiante (Estudiante e)throws Exception{
		return boEstudiante.listarNotasEst(e);
	}
	
}
