package curso_programacao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		//Exercicios ex = new Exercicios();
		Exercicio2 ex2 = new Exercicio2();
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Entre com o primeiro número inteiro: ");
		
		int a = sc.nextInt();
				
		
		System.out.println("Entre com o segundo número inteiro: ");
		
		int b = sc.nextInt();
		
		System.out.println(ex.somaDoisValores(a, b));
		*/
		
		/*
		System.out.println("Entre com o valor do raio:\n");
		
		double raio = Double.parseDouble(sc.nextLine());
		
		System.out.printf("%.4f",ex.calculaAreaCirculo(raio));
		*/
		
		/*
		int a,b,c,d;
		
		System.out.println("Entre com o primeiro valor:");
		a = sc.nextInt();
		
		System.out.println("Entre com o segundo valor:");
		b = sc.nextInt();
		
		System.out.println("Entre com o terceiro valor:");
		c = sc.nextInt();
		
		System.out.println("Entre com o quarto valor:");
		d = sc.nextInt();
		
		System.out.println(ex.diferencaDeProduto(a, b, c, d));
		*/
		
		/*
		int numeroFuncionario, numeroHorasTrabalhadas;
		double salarioFuncionario;
		
				
		System.out.println("Entre como número do funcionário:");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Entre com o número de horas trabalhadas:");
		numeroHorasTrabalhadas = sc.nextInt();
		
		System.out.println("Entre com o valor do salário por hora:");
		salarioFuncionario = sc.nextDouble();
		
		double calculoSalario = ex.calculaSalarioFuncionario(numeroHorasTrabalhadas, salarioFuncionario);
		
		System.out.printf("O funcinário codigo %d tem o salário igual a R$%.2f",numeroFuncionario,calculoSalario);
		*/
		
		/*
		int codigoPeca1, codigoPeca2, numeroDePecas1, numeroDePecas2;
		double valorUnitarioPeca1, valorUnitarioPeca2, valorTotalPeca1, ValorTotalPeca2;
		
		System.out.println("Entre com o código da peça 1:");
		codigoPeca1 = sc.nextInt();
		
		System.out.println("Entre com o número de peças 1:");
		numeroDePecas1 = sc.nextInt();
		
		System.out.println("Entre com o valor unitário da peça 1");
		valorUnitarioPeca1 = sc.nextDouble();
		
		System.out.println("Entre com o código da peça 2:");
		codigoPeca2 = sc.nextInt();
		
		System.out.println("Entre com o número de peças 2:");
		numeroDePecas2 = sc.nextInt();
		
		System.out.println("Entre com o valor unitário da peça 2");
		valorUnitarioPeca2 = sc.nextDouble();
		
		valorTotalPeca1 = ex.valorTotal(numeroDePecas1, valorUnitarioPeca1);
		ValorTotalPeca2 = ex.valorTotal(numeroDePecas2, valorUnitarioPeca2);
		
		double ValorTotal = valorTotalPeca1+ValorTotalPeca2;
		
		System.out.printf("Valor a ser pago: R$%.2f",ValorTotal);
		*/
		
		//int numero;
		
		/*
		System.out.println("Entre com um número para verificar se é negativo ou não: ");
		
		numero = sc.nextInt();
		
		ex2.verificaNumeroNegativo(numero);		
		*/
		
		/*
		System.out.println("Entre com um número para verificar se este é par ou ímpar:");
		
		numero = sc.nextInt();
		
		ex2.verificaParImpar(numero);
		*/
		
		/*
		System.out.println("Entre com o primeiro número:");
		int numero1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int numero2 = sc.nextInt();
		
		ex2.numerosMultiplos(numero1, numero2);
		*/
		
		/*
		System.out.println("Entre com a hora inicial: ");
		int horaInicial = sc.nextInt();
		
		System.out.println("Enter com a hora final: ");
		int horaFinal = sc.nextInt();
		
		System.out.println("O jogo durou " + ex2.duracaoJogo(horaInicial, horaFinal));
		
		ex2.verificaDuracaoJogo(ex2.duracaoJogo(horaInicial, horaFinal));
		*/
		
		//ex2.tabelaPreco("2",3);
		
		/*
		System.out.println("Entre com um valor de 0 a 100");
		double numero = sc.nextDouble();
		
		ex2.verificaIntervalo(numero);
		*/
		
		System.out.println("Entre com o ponto X");
		double x = sc.nextDouble();
		
		System.out.println("Entre com o ponto Y");
		double y = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		df.format(x);
		df.format(y);
		
		ex2.verificaPontoCartesiano(x, y);
				
		sc.close();
		
		
		
	}
}

	