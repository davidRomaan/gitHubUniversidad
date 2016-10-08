package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOProfesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOProfesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;

public class BOProfesion {
	
	private IDAOProfesion daoProfesion;
	
	public BOProfesion(){
		daoProfesion = new DAOProfesion();
		
	}
	
	/**
	 * lista las profesione de la base de datos
	 * @return las profesiones 
	 */
	public List<Profesion> listarProfesiones() throws Exception{
		 return daoProfesion.listaarProfesionesJPA();
	 }
	
	/**
	 * busca una profesion 
	 * @param nom nombre por el que se va a buscar
	 * @return la profesion
	 */
	public Profesion buscarProfesion (String nom) throws Exception{
		return daoProfesion.buscar(nom);
	}

}
