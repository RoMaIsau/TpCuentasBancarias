package ar.edu.unlam.pb2;

public class CajaDeAhorro extends Cuenta{

private int cantidadDeExtracciones;
	
	public CajaDeAhorro(String nombre, Double saldo) {
		super(nombre, saldo);
		this.cantidadDeExtracciones = 0;
	}

	public void extraer(Double monto) {
		
		if (cantidadDeExtracciones >= 5) {
			monto += 6;
		}
		
		if (this.saldo >= monto) {
			this.saldo -= monto;

			cantidadDeExtracciones++;
		}

	}

}
