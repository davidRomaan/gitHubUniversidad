package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;
import java.util.ResourceBundle.Control;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;

public class BOEstudiante {

	IDAOEstudiante daoEstuduante;
	
	 public BOEstudiante(){
		 
		 daoEstuduante = new DAOEstudiante();
	 }
	
	/**
	 * metodo que crea un estudiante
	 * @param e el estudiante que se va a crear
	 * @return 
	 * @throws Exception en caso de que el estudiante ya este registrado
	 */
	 public Estudiante crearEstudiante(Estudiante e) throws Exception{
		 
		 Estudiante estu = daoEstuduante.buscar(e.getCedula());
		 
		 if(estu == null){
		      daoEstuduante.crear(e);
		 }else{
				throw new ExcepcionNegocio("El estudiante ya se encuentra registrado");
		 }
		 return null;
	 }
	 
	 
	 /**
	  * busca un estudiante en la base de datos
	  * @param ced cedula por la que se le va a buscaar
	  */
	 public Estudiante buscarEstudiante(String ced) throws Exception{
		 return daoEstuduante.buscar(ced);
	 }
	
	 /**
	  * elimina un estudiante de la base de datos
	  * @param e el esstudiante que se va a eliminar
	  */
	 public Estudiante eliminarEstudiante(Estudiante e) throws Exception{
		 
		 Estudiante es = daoEstuduante.buscar(e.getCedula());
		 if(es !=null){
			daoEstuduante.eliminar(e);
		 }else{
			throw new ExcepcionNegocio("El estudiante no se encuentra registrado");

		 }
		 return null;
	 }
	 
	 /**
	  * ediata un estudiante de la base de datos 
	  * @param e el estudiante que se va a editar
	  */
	 public Estudiante editarEstudiante (Estudiante e) throws Exception{
		 
		 Estudiante est = daoEstuduante.buscar(e.getCedula());
		 if(est != null){
		 daoEstuduante.editar(e);
		 }else{
		   throw new ExcepcionNegocio("El estudiante no se encuentra registrado");
		 }
		 return null;
	 }
	 
	 /**
		 * lista los estudiantes de un curso
		 * 
		 * @param c
		 *            el curso
		 * @return los estudiantes de esa asignatura
		 * @throws Exception
		 */
		public List<Estudiante> listarEstudiantes(Curso c) throws Exception {
			List<Estudiante> lista = daoEstuduante.listarEstudiante(c);
			return lista;
		}
	 
		/**
		 * lista las notas de un estudiante
		 * @param e el estudiante
		 * @return la lista
		 * @throws Exception
		 */
		public List<Nota> listarNotasEst(Estudiante e) throws Exception {
			List<Nota> lista = daoEstuduante.listarNotasEst(e);
			return lista;
		}
}
