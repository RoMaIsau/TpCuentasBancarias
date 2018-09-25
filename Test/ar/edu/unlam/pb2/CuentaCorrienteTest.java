package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test 
	public void cuandoSeRequiereUsarElGiroAlDescubiertoSeCobraUnaComisionDelCincoPorciento() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente("Analia", 100d, 150d);
		
		miCuentaCorriente.extraer(200d);
		
		assertEquals(new Double(-105d), miCuentaCorriente.getSaldo());
		
	}
	
	@Test 
	public void cuandoElMontoAExtraerSuperaAlGiroNoSeRealizaLaOperacion() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente("Analia", 100d, 150d);
		
		miCuentaCorriente.extraer(251d);
		
		assertEquals(new Double(100d), miCuentaCorriente.getSaldo());
	}
	
	@Test 
	public void cuandoNoSeUsaElGiroNoSeCobraComision() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente("Analia", 100d, 150d);
		
		miCuentaCorriente.extraer(50d);
		
		assertEquals(new Double(50d), miCuentaCorriente.getSaldo());
	}
	
	

}
