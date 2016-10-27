package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOPrograma;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOPrograma;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public class BOPrograma {

	private IDAOPrograma daoPrograma;
	public BOPrograma(){
		
		daoPrograma = new DAOPrograma();
	}

	/**
	 * crea un programa en la base de datos
	 * @param p el programa que se va a crear
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public void crearPrograma(Programa p) throws Exception{
		Programa pr = daoPrograma.buscarPrograma(p.getId());
		if(pr != null){
			throw new ExcepcionNegocio("Este programa ya se encuentra registrado");
		}else{
			if(daoPrograma.buscarProgramaNombre(p.getNombre())){
				throw new ExcepcionNegocio("Ya hay un programa con este nombre");
			}else{
				daoPrograma.crearPrograma(p);
			}
		}
	}
	
	/**
	 * busca un programa en la base de datos
	 * @param p el programa que se va a buscar
	 * @return el programa 
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public Programa buscarPrograma(int id) throws Exception{
		return daoPrograma.buscarPrograma(id);
	}
	
	/**
	 * edita un programa 
	 * @param p el programa que se va a editar
	 * @throws Exception en caso de una excepcion tecnica o de negocio
	 */
	public Programa editarPrograma(Programa p) throws Exception{	
		if(daoPrograma.buscarProgramaNombre(p.getNombre())){
			throw new ExcepcionNegocio("Ya hay un programa con este nombre");
		}else{
			daoPrograma.editarPrograma(p);
			return p;
		}
	}
	
	/**
	 * Listamos todas los programas
	 * @return lista con todas los programas
	 * @throws Exception  en caso de una excepcion tecnica o de negocio.
	 */
	public List<Programa>listarPrograma()throws Exception{
		return daoPrograma.listarPrograma();
	}
	
	/**
	 * Listamos todas los programas de una facultad que se encuentran en la bd
	 * @return lista con todas los programas de una facultad
	 * @throws Exception  en caso de una excepcion tecnica o de negocio.
	 */
	public List<Programa>listarProgramaFacultad(Facultad facultad)throws Exception{
		return daoPrograma.listarProgramaFacultad(facultad);
	}
	/**
	 * Eliminar programa
	 * @param id del programa a eliminar
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void eliminarPrograma(int id) throws Exception{
		Programa p = daoPrograma.buscarPrograma(id);
		if(p == null){
			throw new ExcepcionNegocio("No se ha encontrado ningun programa\ncon el codigo "+id);
		}else{
			daoPrograma.eliminar(p);
		}
	}
}

