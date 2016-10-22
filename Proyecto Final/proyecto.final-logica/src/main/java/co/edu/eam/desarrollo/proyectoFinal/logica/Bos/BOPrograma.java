package co.edu.eam.desarrollo.proyectoFinal.logica.Bos;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.definiciones.IDAOPrograma;
import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOPrograma;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
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
			throw new ExcepcionNegocio("el programa ya se encuentra registrado");

		}else{
			daoPrograma.crearPrograma(p);
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
	public void  editarPrograma(Programa p) throws Exception{
		Programa pr = daoPrograma.buscarPrograma(p.getId());
        if(pr != null){
        	daoPrograma.editarPrograma(pr);
        }else{
			throw new ExcepcionNegocio("el programa no se encuentra registrado");

        }	
	}
	
	/**
	 * lista los programas por su nombre
	 * @return los programas
	 * @throws Exception Exception en caso de una excepcion tecnica o de negocio
	 */
	public List<Programa>listarPrograma()throws Exception{
		return daoPrograma.listarPrograma();
	}
}

