package ar.edu.unlam.pb2;

public class Cuenta {

	protected String titular;
	protected Double saldo;

	public Cuenta(String titular, Double saldo) {
		this.saldo = saldo;
		this.titular = titular;
	
	}

	public void depositar(Double monto) {
		this.saldo += monto;

	}

	public String getTitular() {
			return titular;
	}

	public void setTitular(String titular) {
			this.titular = titular;
	}

	public Double getSaldo() {
			return saldo;
	}

	public void setSaldo(Double saldo) {
			this.saldo = saldo;
	}

}

