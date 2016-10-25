package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOContacto;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOContacto;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Contacto;

public class BOContacto {

	private IDAOContacto daoContacto;

	public BOContacto() {
		daoContacto = new DAOContacto();
	}

	/**
	 * crea un contacto en la base de datos
	 * @param c el contacto a crear
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public void crearContacto(Contacto c) throws Exception {
		Contacto con = daoContacto.buscar(c.getIdContacto());
		if (con != null) {
			throw new ExcepcionNegocio("Este contacto ya se encuentra registrado");
		} else {
			daoContacto.crear(c);
		}
	}

	/**
	 * busca un contacto en la base de datos
	 * @param cod el codigo a buscar
	 * @return la el contacto
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public Contacto buscarContacto(int cod) throws Exception {
		return daoContacto.buscar(cod);
	}

	/**
	 * actualiza los datos 
	 * @param c el contacto a actualizar
	 * @return el contacto actualizado
	 * @throws Exception en caso de que haya una excepcion tecnica o de negocio
	 */
	public Contacto editarContacto(Contacto c) throws Exception {
		daoContacto.editar(c);
		return c;
	}
}
