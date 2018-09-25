package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaSueldoTest {

	@Test
	public void seExtreaeUnPesoDeLaCuentaSueldo() {
		
		CuentaSueldo miCuentaSueldo = new CuentaSueldo("Alejandro", 4000d);
		
		miCuentaSueldo.extraer(1d);
		
		//Comprobacion
		assertEquals(new Double(3999), miCuentaSueldo.getSaldo());
	}
	@Test
	public void cuandoSeExtraeUnMontoMayoAlDisponibleNoSeRealizaLaTransaccion() {
		
		CuentaSueldo miCuentaSueldo = new CuentaSueldo("Alejandro", 100d);
		
		miCuentaSueldo.extraer(101d);
		
		//Comprobacion
		assertEquals(new Double(100), miCuentaSueldo.getSaldo());
	}
	@Test
	public void cuandoSeExtraeElTotalDisponibleElSaldoQuedaEnCero() {
		
		CuentaSueldo miCuentaSueldo = new CuentaSueldo("Alejandro", 100d);
		
		miCuentaSueldo.extraer(100d);
		
		//Comprobacion
		assertEquals(new Double(0), miCuentaSueldo.getSaldo());
		
	}
	@Test
	public void cuandoSeDepositaElMontoAumentaSegunLaCantidadQueSeDeposito() {
		CuentaSueldo miCuentaSueldo = new CuentaSueldo("Alejandro", 100d);
		miCuentaSueldo.depositar(50d);
		assertEquals(new Double(150.0), miCuentaSueldo.getSaldo());
	}
	
}
