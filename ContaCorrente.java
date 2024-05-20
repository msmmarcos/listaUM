public class ContaCorrente {
	
	private int numeroDaConta;
	private double saldo;
	
	public ContaCorrente(int novoNumeroDaConta, double novoSaldo) {
		this.numeroDaConta = novoNumeroDaConta;
		this.saldo = novoSaldo;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	public void depositar ( double valor) {
		this.saldo = saldo + valor;
	}
	
	public void sacar ( double valor) {
		this.saldo = saldo - valor;
	}
	
	public String toString() {
		return "Conta: " + this.numeroDaConta + "\nSaldo: R$ "+ this.saldo;
	}
}
