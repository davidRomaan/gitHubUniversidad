/**
 * Clase responsable de definir las operaciones de Sector Laboral. 
 * @author carlos alfredo martinez villada & David Roman
 */
package co.edu.eam.desarrollo.proyectoFinal.definiciones;
import java.util.List;

import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;

public interface IDAOSectorLaboral {
	/**
	 * Listamos todas los Sectores laborales que se encuentran en la bd
	 * @return lista con todas los sectores laborales
	 * @throws Exception en caso de que la consulta no se puede ejecutar
	 */
	public List<SectorLaboral> listar() throws Exception;
}
