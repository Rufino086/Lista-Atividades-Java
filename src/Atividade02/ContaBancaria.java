package Atividade02;

public class ContaBancaria{
	
	private int IDconta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int IDconta, String nomeTitular, double saldo) {
		this.IDconta = IDconta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void sacar (double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		} else {
		System.out.println("Saldo insuficiente, seu pobre");
		}
	}
	
	public double consultaSaldo() {
		return saldo;
	}
}