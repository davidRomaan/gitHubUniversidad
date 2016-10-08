package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOProfesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOProfesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOProfesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOProfesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;

/**
 * 
 * @author david
 *
 */
public class BODocente {

	private IDAOProfesor daoprofesor;
	private IDAOProfesion daoProfesion;

	public BODocente() {

		daoprofesor = new DAOProfesor();
		daoProfesion = new DAOProfesion();
	}

	/**
	  metodo que busca un docente
	 * @param ced cedula por la cual se va a buscar el docente
	 * @return el docente 
	 * @throws Exception en caso de que haya una excepcion
	 */
	public Profesor buscarDocente(String ced) throws Exception {
		return daoprofesor.buscar(ced);

	}
	

	/**
	 * metodo que registra a un profesor
	 * @param p profesor que se va a crear
	 */
	 public Profesor crearProfesor(Profesor p) throws Exception{
		 
		 Profesor prof = daoprofesor.buscar(p.getCedula());
		 
		 if(prof == null){
			 daoprofesor.crear(p);
		 }else{
				throw new ExcepcionNegocio("El profesor ya se encuentra registrado");
		 }
		 return null;
	 }
	 
	 /**
	  * elimina un profesor de la base de datos
	  * @param p profesor  que se va a eliminar
	  */
	 public Profesor eliminarProfesor(Profesor p) throws Exception{
		 
		 Profesor es = daoprofesor.buscar(p.getCedula());
		 if(es !=null){
			 daoprofesor.eliminar(p);
		 }else{
			throw new ExcepcionNegocio("la asignatura no se encuentra registrada");

		 }
		 return null;
	 }
	 
	 /**
	  * ediata una profesor de la base de datos 
	  * @param p profesor que se va a editar
	  */
	 public Profesor editarProfesor (Profesor p) throws Exception{
		 
		 Profesor prof = daoprofesor.buscar(p.getCedula());
		 if(prof != null){
		 daoprofesor.editar(p);
		 }else{
		   throw new ExcepcionNegocio("la asignatura no se encuentra registrada");
		 }
		 return null;
	 }

	 
	 
	 
}
