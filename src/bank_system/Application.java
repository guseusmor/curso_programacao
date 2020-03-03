package bank_system;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o numero da conta");
		String conta = sc.nextLine();
		System.out.println("Enter com o nome completo do cliente");
		String nome = sc.nextLine();
		System.out.println("Entre com o valor do depósito inicial");
		double valor = sc.nextDouble();
		
		Conta conta1 = new Conta(conta,nome,valor);
		
		conta1.depositar(500.00);
		conta1.sacar(200.00);
		conta1.sacar(400.00);
		
		sc.close();
	}

}
