package co.edu.eam.desarrollo.proyectoFinal.gui.controladores;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOContacto;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEmpresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Ciudad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Contacto;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Departamento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;

public class ControladorVentanaEmpresas {

	private BOEmpresa boEmpresa;
	private BOContacto boContacto;
	
	public ControladorVentanaEmpresas() {
	
		boEmpresa = new BOEmpresa();
		boContacto = new BOContacto();
	}
	
	
	public void crearEmpresa(Empresa e)throws Exception{
		boEmpresa.crearEmpresa(e);
	}
	
	public Empresa buscarEmpresa(String nit)throws Exception{
		return boEmpresa.buscarEmpresa(nit);
	}
	
	public Empresa editarEmpresa(Empresa e)throws Exception{
		return boEmpresa.editarEmpresa(e);
	}
	
	public void crearContacto(Contacto c,Empresa emp)throws Exception{
		boContacto.crearContacto(c,emp);
	}
	
	public Contacto buscarContacto(String nit)throws Exception{
		return boContacto.buscarContacto(nit);
	}
	
	public Contacto editarContacto(Contacto c)throws Exception{
		return boContacto.editarContacto(c);
	}
	
	public List<Departamento> listarDepartamentos()throws Exception{
		return boEmpresa.listarDepartamentos();
	}
	public List<Ciudad> listarCiudades()throws Exception{
		return boEmpresa.listarCiudades();
	}
	public List<SectorLaboral> listarSectorLaboral()throws Exception{
		return boEmpresa.listarSectorLaboral();
	}
}
