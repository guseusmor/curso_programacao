package Exercicios_03;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Ex03 ex = new Ex03();
		Scanner sc = new Scanner(System.in);

		/*
		 * String senha;
		 * 
		 * System.out.println("Entre com a senha"); senha = sc.nextLine();
		 * 
		 * while(ex.verificaSenha(senha) == false) {
		 * System.out.println("Senha inválida"); senha = sc.nextLine(); }
		 */

		/*
		 * System.out.println("Entre com o ponto X:"); double x = sc.nextDouble();
		 * 
		 * System.out.println("Entre com o ponto Y:"); double y = sc.nextDouble();
		 * 
		 * while (x != 0 && y != 0) { ex.verificaQuadrante(x, y);
		 * 
		 * System.out.println("\nEntre com o ponto X:"); x = sc.nextDouble();
		 * 
		 * System.out.println("Entre com o ponto Y:"); y = sc.nextDouble();
		 * 
		 * 
		 * }
		 */
		System.out.println("Entre com o codigo do combustivel:");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		int codigo = sc.nextInt();
		
		ex.postoDeCombustivel(codigo);

		while (codigo >= 0 && codigo != 4) {
			System.out.println("Entre com o codigo do combustivel:");
			System.out.println("1 - Álcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			codigo = sc.nextInt();

			ex.postoDeCombustivel(codigo);
		}

		System.out.println("Muito obrigado!");
		ex.getCombustiveis();

		sc.close();

	}

}
