package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void cuandoDepositoUnMontoSeLeAgregaAlSaldoDeLaCuenta() {
	Cuenta miCuenta = new Cuenta("Maria", 4000d);
	
	miCuenta.depositar(300d);
	
	assertEquals(new Double(4300d), miCuenta.getSaldo());
	}
}
	
