package Exercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("US"));

		Funcoes fn = new Funcoes();
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.
		 * println("Entre com um numero inteiro entre no intervalo de 1 a 1000"); int
		 * numero = sc.nextInt();
		 * 
		 * System.out.println("\n");
		 * 
		 * if(numero >= 1 && numero <= 1000) { fn.mostraImpares(numero); }
		 * 
		 * else { System.out.println("Numero fora do intervalo permitido.\n");
		 * System.out.println("Programa encerrando a execução!"); }
		 */

		/*
		 * System.out.
		 * println("Entre com a quantidade numeros inteiros a serem inseridos"); int
		 * inteiros = sc.nextInt();
		 * 
		 * for (int i = 0; i < inteiros; i++) { int controle = i + 1;
		 * System.out.println("Entre com o numero inteiro " + fn.ordinal(controle)); int
		 * entradas = sc.nextInt(); fn.verificaIntervalo(entradas);
		 * 
		 * }
		 * 
		 * System.out.println(fn.getIn() + " in"); System.out.println(fn.getOut() +
		 * " out");
		 */
		
		/*
		System.out.println("Entre com o numero de casos para testes");
		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			System.out.println("Entre com o primeiro valor real");
			double real1 = sc.nextDouble();
			fn.setValorReal1(real1);

			System.out.println("Entre com o segundo valor real");
			double real2 = sc.nextDouble();
			fn.setValorReal2(real2);

			System.out.println("Entre com o terceiro valor real");
			double real3 = sc.nextDouble();
			fn.setValorReal3(real3);

			double resultadoFinal = fn.mediaPonderada();

			System.out.printf("%.1f\n", resultadoFinal);

		}
		*/
		
		/*
		System.out.println("Entre com o numero de interações do programa");
		int interacoes = sc.nextInt();
		
		for(int i = 0; i < interacoes; i++) {
			System.out.println("Entre com o primeiro número:");
			double primeiro = sc.nextDouble();
			
			System.out.println("Entre com o segundo número:");
			double segundo = sc.nextDouble();
			
			if(segundo != 0) {
				double resultado = fn.divisaoPrimeiroPeloSegundo(primeiro, segundo);
				System.out.printf("%.1f\n", resultado);
			}
			else {
				System.out.println("divisao impossivel");
			}
					
		}
		*/
		
		/*
		System.out.println("Entre com um valor para calcular seu fatorial");
		int numero = sc.nextInt();
		
		System.out.println(fn.fatorial(numero));
		*/
		
		/*
		System.out.println("Entre com um numero para ver seus divisores");
		int numero = sc.nextInt();
		
		fn.retornaDivisores(numero);
		*/
		
		System.out.println("Entre com um numero inteiro positivo:");
		int numero = sc.nextInt();
		
		if(numero <= 0) {
			System.out.println("Programando sendo finalizado");
		}
		
		else {
			fn.variaOperacoes(numero);
		}
		
		sc.close();
}

}
