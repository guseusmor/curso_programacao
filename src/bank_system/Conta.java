package bank_system;

public class Conta {
	
	private String contaNumero;
	private String nomeTitular;
	private double saldo;
	
	public Conta(String numeroConta, String nomeTitular, double depositoInicial) {
		
		this.contaNumero = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = depositoInicial;
	}
	
public Conta(String numeroConta, String nomeTitular) {
		
		this.contaNumero = numeroConta;
		this.nomeTitular = nomeTitular;

	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getContaNumero() {
		return contaNumero;
	}
	public String getSaldo() {
		return "R$" + saldo;
	}
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("\n************************");
		System.out.println(toString());
		System.out.println("************************\n");
	}
	public void sacar(double valor) {
		saldo -= (valor+5);
		System.out.println("\n************************");
		System.out.println(toString());
		System.out.println("************************\n");
	}

	@Override
	public String toString() {
		return "Conta = " + contaNumero + "\nTitular = " + nomeTitular + "\nSaldo = " + "R$" + saldo;
	}
	
	
	
	
}
