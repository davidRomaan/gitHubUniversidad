package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOProfesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;

public class DAOProfesorTXT implements IDAOProfesor {

	public void crear(Profesor p) throws Exception {
		// TODO Auto-generated method stub
		
		PrintWriter salida = new PrintWriter( new FileWriter ("docentes.txt", true));
		
		salida.println(p.getCedula() + ";" +
				p.getApellido() + ";" + 
				p.getCorreo() + ";" +
				p.getDireccion() + ";" +
				p.getNombre() + ";" +
				p.isPostgrado() + ";" +
				p.getProfesion() + ";" +
				p.getTelefono());
	}

	public void editar(Profesor p) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public Profesor buscar(String ced) throws Exception {
		return null;
}

	public void eliminar(Profesor p) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public List<Profesor> listarProfesores() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Profesion> listaProfesiones() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	public Profesion buscarProfesion(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Profesion> listaarProfesionesJPA() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Profesion buscarProfesionJPA(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
