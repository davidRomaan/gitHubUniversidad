package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;

public interface IDAOProfesion {

	/**
	 * lista todas las profesiones 
	 * @return
	 * @throws Exception
	 */
	public List<Profesion> listaarProfesionesJPA() throws Exception;
	
	public Profesion buscar (String nom) throws Exception;
	
}
