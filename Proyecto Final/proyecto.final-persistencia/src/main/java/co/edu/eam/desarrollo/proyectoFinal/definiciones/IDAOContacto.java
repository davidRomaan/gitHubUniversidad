package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Contacto;

public interface IDAOContacto {

	public void crear(Contacto c) throws Exception;

	public Contacto buscar(int cod) throws Exception;

	public void editar(Contacto e) throws Exception;
	

}
