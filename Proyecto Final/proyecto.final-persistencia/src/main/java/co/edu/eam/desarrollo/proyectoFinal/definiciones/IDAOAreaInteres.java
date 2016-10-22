package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;

public interface IDAOAreaInteres {

	public void crear(AreaInteres a) throws Exception;

	public AreaInteres buscar(int cod) throws Exception;

	public void editar(AreaInteres e) throws Exception;

}
