package co.edu.eam.desarrollo.proyectoFinal.definiciones;

import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.HistorialLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public interface IDAOEgresado {
	/**
	 * Crear egresado
	 */
	public void crearEgresado(Egresado e)throws Exception;
	
	/**
	 * buscar egresado
	 */
	public Egresado buscarEgresado(int cod)throws Exception;
	
	/**
	 * buscar egresado por tipo de documento y numero documento
	 */
	public Egresado buscarEgresadoTipo(TipoDocumento tipo, String numero)throws Exception;
	
	/**
	 * Editar egresado
	 */
	public void editar (Egresado e)throws Exception;
	
	/**
	 * Eliminar egresado
	 */
	public void eliminarEgresado (Egresado e)throws Exception;
	
	/**
	 * lista los egresados por empresa
	 * @param e la empresa por la cual se buscara
	 * @throws Exception en caso de excepcion tecnica
	 */
	public List<InformacionLaboral> listarEgresadosPorEmpresa(Empresa e)throws Exception;
	
	/**
	 * lista los egresados por ocupacion
	 * @param p el programa a el que se le buscaran los egresados
	 * @return la lista
	 * @throws Exception en caso de excepcion tecnica
	 */
	public List<InformacionLaboral> listaEgresadosPorOcupacion(Programa p)throws Exception;
}
