package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;

public interface IDAOEgresado {

	public void crearEgresado(Egresado e)throws Exception;
	
	public Egresado buscarEgresado(int cod)throws Exception;
	
	public void editar (Egresado e)throws Exception;
	
	public void eliminarEgresado (Egresado e)throws Exception;
	
}
