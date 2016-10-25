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
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOFacultad;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOInfoAcademica;
import co.edu.eam.desarrollo.proyectoFinal.logica.Bos.BOPrograma;
import co.edu.eam.desarrolloSoftware.proyectoFinal.enumeraciones.NivelAcademico;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Egresado;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Facultad;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.InformacionAcademica;
import co.edu.eam.desarrolloSoftware.proyectoFinal.modelo.Programa;

public class PruebasUnitariasInfoAcademica {

	private BOInfoAcademica boInfoAcademica;
	private BOEgresado boEgresado;
	private BOFacultad boFacultad;
	private BOPrograma boPrograma;

	@BeforeClass
	public static void beforeClass() {

		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasInfoAcademica-addTest-add2.sql");

	}

	@Before
	public void setUp() {
		boInfoAcademica = new BOInfoAcademica();
		boEgresado = new BOEgresado();
		boFacultad = new BOFacultad();
		boPrograma = new BOPrograma();
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
			Facultad f = boFacultad.buscarFacultad(1);
			info.setFacultad(f);
			Programa p = boPrograma.buscarPrograma(1);
			info.setPrograma(p);
			boInfoAcademica.crearInfoAcademica(info);
			InformacionAcademica infor = boInfoAcademica.buscar(1);
			Assert.assertNotNull(infor);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void buscarInformacion() {
		try {
			InformacionAcademica infor = boInfoAcademica.buscar(1);
			Assert.assertNotNull(infor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void editarInformacion() {
		try {

			InformacionAcademica infor = boInfoAcademica.buscar(1);
			infor.setNumeroDiploma("67");
			boInfoAcademica.editarInformacion(infor);
			Assert.assertEquals("67", infor.getNumeroDiploma());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/PruebasUnitariasInfoAcademicaTest-del2.sql");

	}
}
