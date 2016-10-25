package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;

public interface IDAOInfoLaboral {

	public void crear(InformacionLaboral i) throws Exception;
	
	public InformacionLaboral buscarInfoLaboral(int cod)throws Exception;

	public List<InformacionLaboral> listarInformacionLaboralEgres(Egresado e);

	public void editar(InformacionLaboral i) throws Exception;
}
