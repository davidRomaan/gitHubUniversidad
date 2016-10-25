package tests;

import java.util.Date;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEgresado;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOInfoLaboral;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.SituacionActual;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionLaboral;

public class PruebasUnitariasInfoLaboral {

	private BOInfoLaboral boInfoLaboral;
	private BOEgresado boEgresado;

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasInfoLaboral-addTest-add3.sql");
	}

	@Before
	public void setUp() {
		boInfoLaboral = new BOInfoLaboral();
		boEgresado = new BOEgresado();
	}

	@Test
	public void testCrearInfoLaboral() {
		try {
			InformacionLaboral info = new InformacionLaboral();
			Egresado e = boEgresado.buscarEgresado(1);
			info.setEgresado(e);
			info.setCargo("gerente");
			Date date = new Date();
			date.setTime(3 / 10 / 2016);
			info.setFechaIngreso(date);
			info.setFechaSalida(date);
			info.setSituacionActual(SituacionActual.EMPLEADO);
			boInfoLaboral.crearInfoAcademica(info);
			InformacionLaboral in = boInfoLaboral.buscarInfoLaboral(1);
			Assert.assertNotNull(in);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testBuscarInfo() {
		try {
			InformacionLaboral in = boInfoLaboral.buscarInfoLaboral(1);
			Assert.assertNotNull(in);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testEditarInfo(){
		try {
			InformacionLaboral in = boInfoLaboral.buscarInfoLaboral(1);
			in.setCargo("presidente");
		    boInfoLaboral.editarInformacion(in);
		    Assert.assertEquals("presidente", in.getCargo());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasInfoLaboralTest-del3.sql");
	}
}
