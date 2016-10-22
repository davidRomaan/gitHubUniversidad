package tests;

import java.util.List;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.desarrollo.proyectoFinal.implementaciones.DAOPrograma;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOFacultad;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOPrograma;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public class PruebaUnitariaPrograma {

	private BOPrograma boPrograma;
	private BOFacultad boFacultad;

	@BeforeClass
	public static void beforeClass() {

		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasPrograma-addTest-add2.sql");

	}

	@Before
	public void setUp() {

		boPrograma = new BOPrograma();
		boFacultad = new BOFacultad();
	}

	@Test
	public void testCrearPrograma() {
		try {
			Programa p = new Programa();
			p.setId(12);
			p.setNombre("Ingenieria de software");
			Facultad pr = boFacultad.buscarFacultad(1);
			p.setFacultad(pr);
			boPrograma.crearPrograma(p);
			Programa pro = boPrograma.buscarPrograma(12);
			pro.setNombre("ingenieria industrial");
			boPrograma.editarPrograma(pro);
			Assert.assertEquals("ingenieria industrial", pro.getNombre());
			Assert.assertNotNull(pro);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	@Test
	public void testBuscar() {

		try {
			Programa pr = boPrograma.buscarPrograma(12);
			Assert.assertNotNull(pr);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testListarPrograma() {

		try {
			List<Programa> p = boPrograma.listarPrograma();
			for (int i = 0; i < p.size(); i++) {
				if (!p.isEmpty()) {
					String men = "la lista no esta vacia";
					Assert.assertEquals("la lista no esta vacia", men);
				} else {
					String men = "la lista esta vacia";
					Assert.fail(men);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	 @AfterClass
	 public static void afterClass() {
	 TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasPrograma-del2.sql");
	
	 }
}
