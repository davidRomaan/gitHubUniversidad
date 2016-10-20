package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOFacultad;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOFacultad;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;

public class BOFacultad {

	private IDAOFacultad daoFacultad;

	public BOFacultad() {

		daoFacultad = new DAOFacultad();
	}

	/**
	 * crea una facultad en la base de datos
	 * @param f la facultad a crear
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public void crearFacultad(Facultad f) throws Exception {
		Facultad fa = daoFacultad.buscarFacultad(f.getNombre());
		if (fa != null) {
			throw new ExcepcionNegocio("la Facultad no se encuentra registrada");
		} else {
			daoFacultad.crearFacultad(f);
		}
	}

	/**
	 * busca una facultad en la base de datos
	 * @param f la facultad a buscar
	 * @return la faculad
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public Facultad buscarFacultad(Facultad f) throws Exception {
		return daoFacultad.buscarFacultad(f.getNombre());
	}

	/**
	 * edita una faculad
	 * @param f la facultad a editar
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public void editarFacultad(Facultad f) throws Exception {
		Facultad fa = daoFacultad.buscarFacultad(f.getNombre());
		if (fa != null) {
			daoFacultad.editar(fa);
		} else {
			throw new ExcepcionNegocio("la Facultad no se encuentra registrada");
		}
	}
}
