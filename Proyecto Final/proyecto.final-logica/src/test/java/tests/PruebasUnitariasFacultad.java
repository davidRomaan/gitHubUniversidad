package tests;

import java.util.List;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOFacultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;

public class PruebasUnitariasFacultad {

	private BOFacultad boFacultad;

	@Before
	public void setUp() {
		boFacultad = new BOFacultad();
	}

	@Test
	public void testCrearFacultad() {
		try {
			Facultad fac = new Facultad();
			fac.setId(1);
			fac.setNombre("ingenieria");
			boFacultad.crearFacultad(fac);
			Facultad f = boFacultad.buscarFacultad(1);
			Assert.assertNotNull(f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	@Test
	public void testBuscar() {
		try {
			Facultad f = boFacultad.buscarFacultad(1);
			Assert.assertNotNull(f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	@Test
	public void testEditarFacultad() {
		try {

			Facultad f = boFacultad.buscarFacultad(1);
			f.setNombre("diseño");
			boFacultad.editarFacultad(f);
			Assert.assertNotNull(f);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testListarFacultad() {

		try {
			List<Facultad> fa = boFacultad.listarFacultad();
			if (!fa.isEmpty()) {
				String men = "la lista no esta vacia";
				Assert.assertEquals("la lista no esta vacia", men);
			} else {
				String men = "la lista esta vacia";
				Assert.fail(men);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasFacultadTest-del2.sql");

	}

}
