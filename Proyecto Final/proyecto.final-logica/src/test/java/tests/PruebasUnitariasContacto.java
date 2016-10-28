package tests;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOContacto;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEmpresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Contacto;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;

public class PruebasUnitariasContacto {

	private BOContacto boContacto;
	private BOEmpresa boEmpresa;

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasContacto-addTest-add3.sql");
	}

	@Before
	public void setUp() {
		boContacto = new BOContacto();
		boEmpresa = new BOEmpresa();
	}

	@Test
	public void testCrearContacto() {
		try {
			Contacto con = new Contacto();
			Empresa em = boEmpresa.buscarEmpresa("1");
			con.setEmpresa(em);
			con.setCargoEmpresa("gerente");
			con.setCorreo("romanleon@");
			con.setNombreCompleto("DavidRoman");
			con.setTelefono("34556");
			boContacto.crearContacto(con,em);
            Contacto c = boContacto.buscarContacto("1");
            Assert.assertNotNull(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test
	public void testBuscarContacto(){
		
		try {
		
		Contacto c = boContacto.buscarContacto("1");
		Assert.assertNotNull(c);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@AfterClass
	public static void afterClass() {

	}
}
