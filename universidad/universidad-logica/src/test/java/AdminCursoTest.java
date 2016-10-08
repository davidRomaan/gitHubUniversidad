import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.logica.bos.BOCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BODocente;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;

public class AdminCursoTest {

	
	private BOCurso boCurso;
	private BOAsignatura boAsignatura;
	private BODocente boDocente;

	@BeforeClass
	public static void beforeClass(){
		
		TestDataUtil.ejecutarSQL("sqltest/BOCursoAdmin-addTest-add.sql");
	
	}
	
	
	@Before
	public void setUp() {
		boCurso = new BOCurso();
		boDocente = new BODocente();
		boAsignatura=new BOAsignatura();
	}
	

	@Test
	public void testCrearCurso() {
		try {
			Curso cur = new Curso();
			cur.setCodigo("23");
			Asignatura as = boAsignatura.buscarAsignatura("666");
			cur.setAsignatura(as);
			Profesor p = boDocente.buscarDocente("234");
			cur.setDocente(p);
			boCurso.crearCuso(cur);
			Curso c = boCurso.buscarCurso("23");

			Assert.assertNotNull(c);

		} catch (Exception e) {
		  e.printStackTrace();
			Assert.fail();
			
		}
	
	
	}
	
	@AfterClass
	public static void afterClass(){
		
		TestDataUtil.ejecutarSQL("sqltest/BOCursoAdminTest-del.sql");

		
	}
	
	
}
