package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;

public interface IDAOInfoAcademica {

	public void crear(InformacionAcademica i) throws Exception;

	public List<InformacionAcademica> listarInformacionAcademicaEgres(Egresado e);

	public void editar(InformacionAcademica i) throws Exception;
	
}
