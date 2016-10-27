/**
 * Clase responsable de realizar las operaciones de Sector Laboral. implementando JPA
 * @author carlos alfredo martinez villada & David Roman
 */
package co.edu.eam.desarrollo.proyectoFinal.implementaciones;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOSectorLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.utilidades.AdministradorEntityManager;

public class DAOSectorLaboral implements IDAOSectorLaboral{
	/**
	 * Listamos todas los Sectores laborales que se encuentran en la bd
	 * @return lista con todas los sectores laborales
	 * @throws Exception en caso de que la consulta no se puede ejecutar
	 */
	public List<SectorLaboral> listar() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(SectorLaboral.LISTAR);
		List<SectorLaboral> lista = q.getResultList();
		return lista;
	}

}
