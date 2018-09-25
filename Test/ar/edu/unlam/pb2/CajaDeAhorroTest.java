package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaDeAhorroTest {

	@Test
	public void cuandoSeExtraePorSextaVezSeCobraUnAdicionalDeSeisPesos() {
		CajaDeAhorro cajaDeAhorro = new CajaDeAhorro("Rocio", 1000d);
		
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(94d);

		
		assertEquals(new Double(400d), cajaDeAhorro.getSaldo());
	}
	@Test
	public void cuandoElMontoQueSeQuiereExtraerSuperaElDisponibleNoSeRealizaLaOperacion() {
		
		CajaDeAhorro cajaDeAhorro = new CajaDeAhorro("Rocio", 594d);
		
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(100d);
		cajaDeAhorro.extraer(94d);
		
		assertEquals(new Double(94d), cajaDeAhorro.getSaldo());
		
	}

}
