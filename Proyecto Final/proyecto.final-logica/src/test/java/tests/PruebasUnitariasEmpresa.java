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

//		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasEmpr-addTest-add2.sql");

	}

	@Before
	public void setUp() {
		boEmpresa = new BOEmpresa();
	}

	@Test
	public void testCrearEgresado() {

		try {
			Departamento dep = new Departamento();
			dep.setId(1);
			dep.setNombre("Armenia");
			Ciudad ciud = new Ciudad();
			ciud.setId(1);
			ciud.setNombre("Quindio");
			ciud.setDepartamento(dep);
			SectorLaboral sec = new SectorLaboral();
			sec.setId(1);
			sec.setNombre("sector industrial");
			Empresa emp = new Empresa();
			emp.setId(1);
			emp.setDireccion("por ahi");
			emp.setNit("234");
			emp.setPais("Colombia");
			emp.setRazonSocial("claro");
			emp.setTelefono("345656");
			emp.setTipo(TipoEmpresa.PRIVADA);
			emp.setWeb("djfdfj@djfd");	
			emp.setCiudad(ciud);
			emp.setSectorLaboral(sec);
			boEmpresa.crearEmpresa(emp);
			Empresa e = boEmpresa.buscarEmpresa(1);
			Assert.assertNotNull(e);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

//	@Test
//	public void testEditarEmpresa() {
//		try {
//			Empresa	em = boEmpresa.buscarEmpresa(1);
//			em.setDireccion("parque cafetero");
//		    boEmpresa.editarEmpresa(em);
//		    Assert.assertEquals("parque cafetero", em);
//		
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//			Assert.fail();
//		}
//
//	}

//	@AfterClass
//	public static void afterClass() {
//		TestDataUtil.ejecutarSQL("PruebasUnitariasEmprTest-del.sql");
//
//	}
}
