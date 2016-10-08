package co.edu.eam.disenosoft.universidad.contrloadores;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BODocente;
import co.edu.eam.disenosoft.universidad.logica.bos.BOProfesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;

public class ControladorVentanaDocente {

	private BODocente boDocente;
	private BOProfesion boProfesion;
	
	public ControladorVentanaDocente(){
		boDocente = new BODocente();
		boProfesion = new BOProfesion();
	}
	
	public void crearProfesor (Profesor p) throws Exception{
		boDocente.crearProfesor(p);
	}
	
	public Profesor buscarProfesor(String ced) throws Exception{
		return boDocente.buscarDocente(ced);
	}
	
	public Profesor eliminarProfesor(Profesor p) throws Exception{
		return boDocente.eliminarProfesor(p);
	}
	
	public Profesor editarProfesor(Profesor p) throws Exception{
		return boDocente.editarProfesor(p);
	}
	
	public List<Profesion> listarProfesiones() throws Exception {
		return boProfesion.listarProfesiones();
	}
	public Profesion buscarProfesion (String nom) throws Exception{
		return boProfesion.buscarProfesion(nom);
	}
	
	
}
