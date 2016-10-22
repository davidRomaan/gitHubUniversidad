package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;

public interface IDAOFacultad {

	public void crearFacultad(Facultad f) throws Exception;

	public Facultad buscarFacultad(int id) throws Exception;

	public void editar(Facultad f) throws Exception;

	public List<Facultad> listarFacultades() throws Exception;
}
