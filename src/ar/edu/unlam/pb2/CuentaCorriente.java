package ar.edu.unlam.pb2;

public class CuentaCorriente extends Cuenta {

	private Double giroEnDescubierto;

	public CuentaCorriente(String nombre, Double saldo, Double giroEnDescubierto) {
		super(nombre, saldo);

		this.giroEnDescubierto = giroEnDescubierto;
	}

	public void extraer(Double monto) {

		if (this.saldo >= monto) {
			this.saldo -= monto;
		} else if (this.giroEnDescubierto >= monto - this.saldo) {
			double giroUsado = monto - this.saldo;
			double interes = (5 * giroUsado) / 100;
			this.saldo -= monto + interes;
		}
	}

}
