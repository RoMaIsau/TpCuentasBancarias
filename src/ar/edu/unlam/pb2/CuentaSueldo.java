package ar.edu.unlam.pb2;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(String nombre, Double saldo) {
		super(nombre, saldo);
		
}
	public void extraer(Double monto) {
		if (this.saldo >= monto) {
			this.saldo-=monto;
		}
	}

}
