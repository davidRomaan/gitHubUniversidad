package co.edu.eam.disenosoft.universidad.contrloadores;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.logica.bos.BOCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BOEstudiante;
import co.edu.eam.disenosoft.universidad.logica.bos.BORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorVentanaRegistrarCurso {

	private BORegistroCurso boRegistroCurso;
	private BOEstudiante boEstudiante;
	private BOAsignatura boAsignatura;
	private BOCurso boCurso;
	
	public ControladorVentanaRegistrarCurso(){
		
		boEstudiante = new BOEstudiante();
		boAsignatura = new BOAsignatura();
		boCurso = new BOCurso();
		boRegistroCurso = new BORegistroCurso();
	}
	
	
	
	public Estudiante buscarEstudiante(String ced) throws Exception{
		return boEstudiante.buscarEstudiante(ced);
	}
	
	public Asignatura buscarAsignatura(String cod) throws Exception{
		return boAsignatura.buscarAsignatura(cod);
	}
	
	public int creditosRegistrados(Estudiante ced) throws Exception{
		return boAsignatura.creditosRegistrados(ced);
	}
	
	public List<Curso> listarTablaCurso (Asignatura a)throws Exception{
		return boCurso.listarTablaCurso(a);
	}
	public Curso buscarCurso(String cod) throws Exception{
		return boCurso.buscarCurso(cod);
	}
 	public void crearCruso(RegistroCurso r)throws Exception{
 		 boRegistroCurso.crearRegistro(r);
 	}
 	
 	public List<RegistroCurso> listaCursoEstudiante(Estudiante e, Curso c){
 		return null;
 	}
 	
}
