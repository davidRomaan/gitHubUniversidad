package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOAreaInteres;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOAreaInteres;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import java.util.List;

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
			throw new ExcepcionNegocio("Esta area de interes ya se encuentra registrada");
		}else{
			if(buscarByNombre(a.getNombre())){
				throw new ExcepcionNegocio("Ya existe un area de interes con el nombre "+a.getNombre());
			}else{
				daoAreainteres.crear(a);
			}
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
	public AreaInteres editarAreaInteres(AreaInteres a) throws Exception {
		daoAreainteres.editar(a);
		return a;		
	}
        
    /**
	 * Listamos todas las areas de interes que se encuentran en la bd
	 * @return lista con todas las areas de interes
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<AreaInteres> listarAreaInteres() throws Exception{
		return daoAreainteres.listar();
	}
	/**
	 * Busca un area de interes por nombre
	 * @param nombre nombre del area a interes a buscar
	 * @return true si ya hay un area de interes con ese nombre, de lo contrario false
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public boolean buscarByNombre(String nombre) throws Exception{
		return daoAreainteres.buscarByNombre(nombre);
	}
}
