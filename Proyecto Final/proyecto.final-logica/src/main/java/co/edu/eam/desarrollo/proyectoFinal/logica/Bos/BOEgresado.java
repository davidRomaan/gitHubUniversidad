package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOEgresado;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOEgresado;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;

public class BOEgresado {

	private IDAOEgresado daoEgresado;

	public BOEgresado() {
		daoEgresado = new DAOEgresado();

	}

	/**
	 * crea un egresado en la base de datos
	 * 
	 * @param e
	 *            el egresado a registrar
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public void crearEgresado(Egresado e) throws Exception {

		Egresado eg = daoEgresado.buscarEgresado(e.getId());
		if (eg != null) {
			throw new ExcepcionNegocio("el egresado ya se encuentra registrado");
		} else {
			daoEgresado.crearEgresado(e);
		}
	}

	/**
	 * busca un egresado en la base de datos
	 * 
	 * @param e
	 *            el egresado a buscar
	 */
	public Egresado buscarEgresado(int cod) throws Exception {
		Egresado e = daoEgresado.buscarEgresado(cod);
		if (e == null) {
			throw new ExcepcionNegocio("el egresado no se encuentra");
		} else {
			return e;
		}
	}

	/**
	 * edita un egresado
	 * 
	 * @param e
	 *            el egresado a editar
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public void editarEgresado(Egresado e) throws Exception {
		Egresado eg = daoEgresado.buscarEgresado(e.getId());
		if (eg != null) {
			daoEgresado.editar(eg);
		} else {
			throw new ExcepcionNegocio("el egresado no se encuentra");
		}
	}

	/**
	 * elimina un egresado
	 * 
	 * @param e
	 *            el egresado a eliminar
	 * @throws Exception
	 *             en caso de una excepcion tecnica o de negocio
	 */
	public void eliminarEgresado(Egresado e) throws Exception {
		Egresado eg = daoEgresado.buscarEgresado(e.getId());
		if (eg != null) {
			daoEgresado.eliminarEgresado(eg);
		} else {
			throw new ExcepcionNegocio("el egresado no se encuentra");
		}

	}
}
