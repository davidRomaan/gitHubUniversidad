package tests;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEgresado;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOPrograma;
import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.TipoDocumento;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public class PruebasUnitariasEgresado {

	private BOPrograma boPrograma;
	private BOEgresado boEgresado;

	/**
	 * metodo que ejecuta el archivo donde se crean los demas objetos que se necesitan para crear este objeto
	 */
	@BeforeClass
	public static void beforeClass() {

		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasEgres-addTest-add.sql");

	}

	@Before
	public void setUp() {
		boPrograma = new BOPrograma();
		boEgresado = new BOEgresado();
	}


	/**
	 * test que crea el egresado 
	 */
	@Test
	public void testCrearEgresado() {
		try {
			Egresado egresado = new Egresado();
			egresado.setId(1);
			egresado.setApellido("Roman");
			egresado.setCelular("312770399");
			egresado.setCorreo("romanleon2010@hotmail.com");
			egresado.setNombre("David");
			egresado.setNumeroDocumento("1094969916");
			egresado.setTelefono("455676");
			egresado.setTipoDocumento(TipoDocumento.CEDULA);
			Programa p = boPrograma.buscarPrograma(12);
			egresado.setPrograma(p);
			boEgresado.crearEgresado(egresado);
			Egresado e = boEgresado.buscarEgresado(1);
			Assert.assertNotNull(e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}


	/**
	 * test que edita el egresado
	 */
	@Test
	public void testEditarEgresado() {
		try {

			Egresado e = boEgresado.buscarEgresado(1);
			e.setApellido("Leon");
			boEgresado.editarEgresado(e);
			Assert.assertEquals("Leon", e);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}


	/**
	 * test que elimina el egresado
	 */
	@Test
	public void testEliminarEgresado() {
		try {

			Egresado e = boEgresado.buscarEgresado(1);
			boEgresado.eliminarEgresado(e.getId());
			boEgresado.buscarEgresado(1);
		} catch (ExcepcionNegocio ex) {
			Assert.assertEquals("el egresado no se encuentra", ex.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * metodo que ejecuta el archivo donde se eliminan los objetos creados
	 */
	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasInfoAcademicaTest-del2.sql");

	}
}
