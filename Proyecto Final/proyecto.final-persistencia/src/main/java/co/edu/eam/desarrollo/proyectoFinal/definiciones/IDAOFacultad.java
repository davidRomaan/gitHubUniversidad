package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;

public interface IDAOFacultad {

	public void crearFacultad(Facultad f) throws Exception;

	public Facultad buscarFacultad(String nom) throws Exception;

	public void editar(Facultad f) throws Exception;

}
