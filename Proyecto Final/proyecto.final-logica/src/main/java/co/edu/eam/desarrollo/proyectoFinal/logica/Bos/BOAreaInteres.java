package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOAreaInteres;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOAreaInteres;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;

public class BOAreaInteres {

	private IDAOAreaInteres daoAreainteres;

	public BOAreaInteres() {

		daoAreainteres = new DAOAreaInteres();
	}

	/**
	 * crea un Area de interes en la base de datos
	 * 
	 * @param a
	 *            el area de interes del egresado a crear
	 * @throws Exception
	 *             en caso de que haya una excepcion tecnica o de negocio
	 */
	public void crearAreaInteres(AreaInteres a) throws Exception {
		AreaInteres area = daoAreainteres.buscar(a.getId());
		if (area != null) {
			throw new ExcepcionNegocio("el area de interes ya se encuentra registrada");
		} else {
			daoAreainteres.crear(a);
		}
	}

	/**
	 * busca un area de interes en la base de datos
	 * 
	 * @param a
	 *            el area de interes a buscar
	 * @return el area de interes
	 * @throws Exception
	 *             en caso de que haya una excepcion tecnica o de negocio
	 */
	public AreaInteres buscarAreaInteres(int id) throws Exception {
		return daoAreainteres.buscar(id);
	}

	/**
	 * edita un area de interes
	 * 
	 * @param a
	 *            el area de interes a editar
	 * @throws Exception
	 *             en caso de que haya una excepcion tecnica o de negocio
	 */
	public void editarAreaInteres(AreaInteres a) throws Exception {
		AreaInteres area = daoAreainteres.buscar(a.getId());
		if (area != null) {
			daoAreainteres.editar(area);
		} else {
			throw new ExcepcionNegocio("el Area de Interes no se encuentra registrada");
		}
	}

}
