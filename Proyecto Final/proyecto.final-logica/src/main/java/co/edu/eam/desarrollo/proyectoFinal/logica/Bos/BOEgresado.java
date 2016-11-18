/**
 * Carlos Martinez
 * Roman
 * 
 * Controlador de las funciones de la ventana egresado
 */
package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;
import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOEgresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOEgresado;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.HistorialLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;

public class BOEgresado {

	private IDAOEgresado daoEgresado;

	public BOEgresado() {
		daoEgresado = new DAOEgresado();

	}

	/**
	 * Registra un egresado en la base de datos.
	 * @param e el egresado a registrar.
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void crearEgresado(Egresado egresado) throws Exception {
		Egresado e = daoEgresado.buscarEgresado(egresado.getId());
		if(e != null){
			throw new ExcepcionNegocio("Este egresado ya se encuentra registrado");
		}else{
			daoEgresado.crearEgresado(egresado);
		}
	}
	/**
	 * Registra la informacion laboral de un egresado en la base de datos.
	 */
	public void crearInformacionLaboral(InformacionLaboral informacionLaboral) throws Exception {
		daoEgresado.crearInformacionLaboral(informacionLaboral);
	}
	
	/**
	 * Registra la informacion academica de un egresado en la base de datos.
	 */
	public void crearInformacionAcademica(InformacionAcademica ia) throws Exception {
		daoEgresado.crearInformacionAcademica(ia);
	}
	
	/**
	 * crear Historial laboral del egresado
	 */
	public void crearHistorialLaboral(HistorialLaboral hl) throws Exception{
		daoEgresado.crearHistorialLaboral(hl);
	}
	
	/**
	 * busca un egresado por su numero de cedula en la base de datos.
	 * @param e el egresado a buscar.
	 */
	public Egresado buscarEgresado(int cod) throws Exception {
		return daoEgresado.buscarEgresado(cod);
	}
	/**
	 * busca un egresado por su numero de cedula y Tipo documento.
	 * @param e el egresado a buscar.
	 */
	public Egresado buscarEgresadoTipoYcedula(TipoDocumento tipo, String numeroDocumento) throws Exception {
		return daoEgresado.buscarEgresadoTipo(tipo, numeroDocumento);
		
	}
	/**
	 * Buscar informacion laboral de un egresado
	 */
	public InformacionLaboral buscarInfoLaboral(int id) throws Exception{
		return daoEgresado.buscarInfoLaboral(id);
	}
	/**
	 * Buscar informacion academica de un egresado
	 */
	public InformacionAcademica buscarInfoAcademica(int id) throws Exception{
		return daoEgresado.buscarInfoAcademica(id);
	}
	/**
	 * edita un egresado.
	 * @param e el egresado a editar.
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void editarEgresado(Egresado egresado) throws Exception {
		Egresado e = daoEgresado.buscarEgresado(egresado.getId());
		if (e != null) {
			daoEgresado.editar(egresado);
		}else{
			throw new ExcepcionNegocio("No se ha encontrado ningun egresado");
		}
	}
	
	/**
	 * editar informacion laboral del egresado
	 */
	public void editarInfoLaboral(InformacionLaboral l) throws Exception{
		daoEgresado.editarInfoLaboral(l);
	}
	/**
	 * editar informacion academica del egresado
	 */
	public void editarInfoAcademica(InformacionAcademica a) throws Exception{
		daoEgresado.editarInfoAcademica(a);
	}

	/**
	 * elimina un egresado
	 * @param e el egresado a eliminar
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public void eliminarEgresado(int id) throws Exception {
		Egresado egresado = daoEgresado.buscarEgresado(id);
		if (egresado != null) {
			daoEgresado.eliminarEgresado(egresado);
		} else {
			throw new ExcepcionNegocio("el egresado no se encuentra");
		}

	}
	
	
}
