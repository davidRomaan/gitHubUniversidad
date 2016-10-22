package tests;

import java.util.Date;
import java.util.List;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOEgresado;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOInfoAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.NivelAcademico;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;

public class PruebasUnitariasInfoAcademica {

	private BOInfoAcademica boInfoAcademica;
	private BOEgresado boEgresado;

	@BeforeClass
	public static void beforeClass() {

		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasInfoAcademica-addTest-add2.sql");

	}

	@Before
	public void setUp() {
		boInfoAcademica = new BOInfoAcademica();
		boEgresado = new BOEgresado();
	}

	@Test
	public void testCrearEgresado() {
		try {
			InformacionAcademica info = new InformacionAcademica();
			Egresado e = boEgresado.buscarEgresado(1);
			info.setEgresado(e);
			Date date = new Date();
			date.setTime(3 / 10 / 2016);
			info.setFechaGrado(date);
			info.setNivelAcademico(NivelAcademico.DIPLOMADO);
			info.setNumeroDiploma("345");
			boInfoAcademica.crearInfoAcademica(info);
			List<InformacionAcademica> inf = boInfoAcademica.listaInfoAcademicaEgresado(e);
			for (int i = 0; i < inf.size(); i++) {
				Assert.assertEquals("345", inf.get(i).getNumeroDiploma());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasEgreTest-del.sql");

	}
}
