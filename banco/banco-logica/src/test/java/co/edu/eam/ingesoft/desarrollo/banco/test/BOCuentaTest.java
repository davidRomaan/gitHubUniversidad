package co.edu.eam.ingesoft.desarrollo.banco.test;

//import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cuenta;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.TipoCuenta;
import co.edu.eam.ingesoft.desarrollo.logica.bos.BOCuenta;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;
import junit.framework.Assert;

public class BOCuentaTest {

	private BOCuenta boCuenta;

	@BeforeClass
	public static void beforeClass() {

//		TestDataUtil.ejecutarSQL("sqltest/BOCuentaTest-add.sql");
	}

	@Before
	public void setUp() {
		boCuenta = new BOCuenta();
	}

	@Test
	public void testCrearCuenta() {

		Cuenta acc = new Cuenta();
		acc.setContrasena("1234");
		acc.setNumero("98765");
		acc.setSaldo(1000);
		TipoCuenta tip = new TipoCuenta();
		tip.setId(1);
		acc.setTipoCuenta(tip);
		Cliente cli = new Cliente();
		cli.setCedula("289793874");
		acc.setCliente(cli);

		try {
			boCuenta.crearCuenta(acc);

			Cuenta accBuscada = boCuenta.buscar("98765");

			Assert.assertNotNull(accBuscada);
			Assert.assertEquals(1000.0, accBuscada.getSaldo(), 0);

		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();

		}

	}

	@Test
	public void testCrearCuentaClienteNoExiste() {

		Cuenta acc = new Cuenta();
		acc.setContrasena("1234");
		acc.setNumero("98765");
		acc.setSaldo(1000);
		TipoCuenta tip = new TipoCuenta();
		tip.setId(1);
		acc.setTipoCuenta(tip);
		Cliente cli = new Cliente();
		cli.setCedula("9823742983");
		acc.setCliente(cli);

		try {
			boCuenta.crearCuenta(acc);

			Assert.fail("FAllo porque el cliente no existe");
		} catch (ExcepcionNegocio e) {

			Assert.assertEquals("No existe el cliente", e.getMessage());

		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();

		}
	}

	@Test
	public void testCrearCuentaMasdeTresCuentas() {
		Cuenta acc = new Cuenta();
		acc.setContrasena("1234");
		acc.setNumero("98765");
		acc.setSaldo(1000);
		TipoCuenta tip = new TipoCuenta();
		tip.setId(1);
		acc.setTipoCuenta(tip);
		Cliente cli = new Cliente();
		cli.setCedula("289793879");
		acc.setCliente(cli);

		try {
			boCuenta.crearCuenta(acc);

			Assert.fail("FAllo porque tenia mas de tres cliente no existe");
		} catch (ExcepcionNegocio e) {

			Assert.assertEquals("Se excedio el numero de cuentas", e.getMessage());

		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();

		}
	}
	
	@Test
	public void testSumaSaldoCliente(){
		double saldo;
		try {
			saldo = boCuenta.sumaSaldosCLiente("289793879");
			Assert.assertEquals(6000.0, saldo,0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@AfterClass
	public static void afterClass() {

		TestDataUtil.ejecutarSQL("sqltest/BOCuentaTest-del.sql");
	}

}
