package tests;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEmpresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoEmpresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Ciudad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Departamento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Empresa;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.SectorLaboral;

public class PruebasUnitariasEmpresa {

	private BOEmpresa boEmpresa;

	@BeforeClass
	public static void beforeClass() {

	TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasEmpr-addTest-add2.sql");

	}

	@Before
	public void setUp() {
		boEmpresa = new BOEmpresa();
	}

	@Test
	public void testCrearBuscarEditarEgresado() {

		try {
			Ciudad ciud = new Ciudad();
			ciud.setId(1);
			Departamento dep = new Departamento();
			dep.setId(1);
			SectorLaboral sec = new SectorLaboral();
			sec.setId(1);
			Empresa emp = new Empresa();
			emp.setDireccion("por ahi");
			emp.setNit("234");
			emp.setPais("Colombia");
			emp.setRazonSocial("claro");
			emp.setTelefono("345656");
			emp.setTipo(TipoEmpresa.PRIVADA);
			emp.setWeb("djfdfj@djfd");
			emp.setDepartamento(dep);
			emp.setCiudad(ciud);
			emp.setSectorLaboral(sec);
			boEmpresa.crearEmpresa(emp);
			Empresa e = boEmpresa.buscarEmpresa("234");
			Assert.assertNotNull(e);
			e.setDireccion("parque cafetero");
     	    boEmpresa.editarEmpresa(e);
		    Assert.assertEquals("parque cafetero", e.getDireccion());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasEmprTest-del2.sql");

	}
}
