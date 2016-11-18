package tests;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOAreaInteres;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.AreaInteres;

public class PruebasUnitariasAreaInteres {

	private BOAreaInteres boAreaInteres;

	/**
	 * metodo que ejecuta el archivo donde se crean los demas objetos que se necesitan para crear este objeto
	 */
	@Before
	public void setUp() {
		boAreaInteres = new BOAreaInteres();
	}

	/**
	 * test que crea el area de interes 
	 */
	@Test
	public void testCrearAreaInteres() {
		try {
			AreaInteres area = new AreaInteres();
			area.setId(1);
			area.setNombre("programacion");
			boAreaInteres.crearAreaInteres(area);
			AreaInteres ar = boAreaInteres.buscarAreaInteres(1);
			Assert.assertNotNull(ar);
			ar.setNombre("JPA");
			boAreaInteres.editarAreaInteres(ar);
			Assert.assertEquals("JPA", ar.getNombre());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * metodo que ejecuta el archivo donde se eliminan los objetos creados
	 */
	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasAreaInteresTest-del3.sql");
	}

}
