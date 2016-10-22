package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public interface IDAOPrograma {

	public void crearPrograma(Programa p) throws Exception;

	public Programa buscarPrograma(int id) throws Exception;

	public void editarPrograma(Programa p) throws Exception;
	
	public List<Programa> listarPrograma() throws Exception;

}
