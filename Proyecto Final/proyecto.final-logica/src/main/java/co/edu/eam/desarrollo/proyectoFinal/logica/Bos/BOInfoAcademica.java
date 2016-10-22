package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOInfoAcademica;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOInfoAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;

public class BOInfoAcademica {

	private IDAOInfoAcademica daoInfoAcadem;

	public BOInfoAcademica() {
		daoInfoAcadem = new DAOInfoAcademica();
	}

	/**
	 * crea la informacion academica del egresado en la base de datos
	 * 
	 * @param i
	 *            la informacion academica a crear
	 * @throws Exception
	 *             en caso de que haya una excepcion tecnica o de negocio
	 */
	public void crearInfoAcademica(InformacionAcademica i) throws Exception {
		daoInfoAcadem.crear(i);
	}

	/**
	 * metodo que devuelve una lista con toda la informacion academica de un
	 * egresado
	 * 
	 * @param e
	 *            el egresado al que se le buscara la informacion
	 * @return la lista
	 * @throws Exception
	 *             en caso de que haya una excepcion tecnica o de negocio
	 */
	public List<InformacionAcademica> listaInfoAcademicaEgresado(Egresado e) throws Exception {
		List<InformacionAcademica> lista = daoInfoAcadem.listarInformacionAcademicaEgres(e);
		return lista;
	}
	
	/**
	 * edita la informacion
	 * @param i la informacion 
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public void editarInformacion(InformacionAcademica i) throws Exception{
		daoInfoAcadem.editar(i);
	}

}
