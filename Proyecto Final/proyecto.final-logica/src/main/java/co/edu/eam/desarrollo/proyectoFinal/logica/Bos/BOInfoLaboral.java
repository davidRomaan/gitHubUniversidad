package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOInfoLaboral;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOInfoLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;

public class BOInfoLaboral {

	private IDAOInfoLaboral daoInfoLaboral;

	public BOInfoLaboral() {
		daoInfoLaboral = new DAOInfoLaboral();
	}
	
	/**
	 * crea la informacion laboral del egresado en la base de datos
	 * 
	 * @param i
	 *            la informacion laboral a crear
	 * @throws Exception
	 *             en caso de que haya una excepcion tecnica o de negocio
	 */
	public void crearInfoAcademica(InformacionLaboral i) throws Exception {
		daoInfoLaboral.crear(i);
	}

	/**
	 * metodo que devuelve una lista con toda la informacion laboral de un
	 * egresado
	 * 
	 * @param e
	 *            el egresado al que se le buscara la informacion
	 * @return la lista
	 * @throws Exception
	 *             en caso de que haya una excepcion tecnica o de negocio
	 */
	public List<InformacionLaboral> listaInfoAcademicaEgresado(Egresado e) throws Exception {
		List<InformacionLaboral> lista = daoInfoLaboral.listarInformacionLaboralEgres(e);
		return lista;
	}
	
	/**
	 * edita la informacion
	 * @param i la informacion 
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public void editarInformacion(InformacionLaboral i) throws Exception{
		daoInfoLaboral.editar(i);
	}
	
	

}
