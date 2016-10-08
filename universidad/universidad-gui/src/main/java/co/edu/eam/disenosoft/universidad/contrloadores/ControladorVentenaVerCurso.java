package co.edu.eam.disenosoft.universidad.contrloadores;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.logica.bos.BOCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;

public class ControladorVentenaVerCurso {

	private BOAsignatura boAsignatura;
	private BOCurso boCurso;
	private BOEstudiante boEstudiante;
	
	public ControladorVentenaVerCurso(){
		boCurso = new BOCurso();
		boAsignatura = new BOAsignatura();
		boEstudiante = new BOEstudiante();
	}
	
	public Asignatura buscarAsignatura(String cod) throws Exception{
		return boAsignatura.buscarAsignatura(cod);
	}
	public List<Curso> listarCombo(Asignatura a) throws Exception {
		return boCurso.listarTablaCurso(a);
	}
	
	public List<Estudiante> listarEstudiantes (Curso c)throws Exception{
		return boEstudiante.listarEstudiantes(c);
	}
	public Curso buscarCurs(String cod)throws Exception{
		return boCurso.buscarCurso(cod);
	}
	public Estudiante buscarEstudiante(String ced)throws Exception{
		return boEstudiante.buscarEstudiante(ced);
	}
}
