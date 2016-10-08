package co.edu.eam.disenosoft.universidad.contrloadores;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.logica.bos.BOCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorVentanaVerRegistroEstudiante {

	private BOEstudiante boEstudiante;
	private BOAsignatura boAsignatura;
	private BOCurso boCurso;

	public ControladorVentanaVerRegistroEstudiante() {
		boEstudiante = new BOEstudiante();
		boAsignatura = new BOAsignatura();
		boCurso = new BOCurso();

	}

	
	public Estudiante buscarEstudiante (String ced) throws Exception{
		return boEstudiante.buscarEstudiante(ced);
	}
	
	public int creditosRegistrados(Estudiante ced) throws Exception{
		return boAsignatura.creditosRegistrados(ced);
	}
	public List<RegistroCurso> listarRegistrosEstudiante (Estudiante e)throws Exception{
		return boCurso.listaRegistroCursosEstudiante(e);
	}
	public void eliminarRegistroCursoEstudiante(Estudiante e, String a)throws Exception{
		 boCurso.eliminarRegistroCursoEstudiante(e, a);
	}
}
