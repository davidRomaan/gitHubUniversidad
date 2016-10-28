package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Contacto;

public interface IDAOContacto {

	public void crear(Contacto c) throws Exception;

	public Contacto buscar(String nit) throws Exception;

	public void editar(Contacto c) throws Exception;
	

}
