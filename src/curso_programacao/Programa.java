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
		System.out.println("Entre com o primeiro n�mero inteiro: ");
		
		int a = sc.nextInt();
				
		
		System.out.println("Entre com o segundo n�mero inteiro: ");
		
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
		
				
		System.out.println("Entre como n�mero do funcion�rio:");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Entre com o n�mero de horas trabalhadas:");
		numeroHorasTrabalhadas = sc.nextInt();
		
		System.out.println("Entre com o valor do sal�rio por hora:");
		salarioFuncionario = sc.nextDouble();
		
		double calculoSalario = ex.calculaSalarioFuncionario(numeroHorasTrabalhadas, salarioFuncionario);
		
		System.out.printf("O funcin�rio codigo %d tem o sal�rio igual a R$%.2f",numeroFuncionario,calculoSalario);
		*/
		
		/*
		int codigoPeca1, codigoPeca2, numeroDePecas1, numeroDePecas2;
		double valorUnitarioPeca1, valorUnitarioPeca2, valorTotalPeca1, ValorTotalPeca2;
		
		System.out.println("Entre com o c�digo da pe�a 1:");
		codigoPeca1 = sc.nextInt();
		
		System.out.println("Entre com o n�mero de pe�as 1:");
		numeroDePecas1 = sc.nextInt();
		
		System.out.println("Entre com o valor unit�rio da pe�a 1");
		valorUnitarioPeca1 = sc.nextDouble();
		
		System.out.println("Entre com o c�digo da pe�a 2:");
		codigoPeca2 = sc.nextInt();
		
		System.out.println("Entre com o n�mero de pe�as 2:");
		numeroDePecas2 = sc.nextInt();
		
		System.out.println("Entre com o valor unit�rio da pe�a 2");
		valorUnitarioPeca2 = sc.nextDouble();
		
		valorTotalPeca1 = ex.valorTotal(numeroDePecas1, valorUnitarioPeca1);
		ValorTotalPeca2 = ex.valorTotal(numeroDePecas2, valorUnitarioPeca2);
		
		double ValorTotal = valorTotalPeca1+ValorTotalPeca2;
		
		System.out.printf("Valor a ser pago: R$%.2f",ValorTotal);
		*/
		
		//int numero;
		
		/*
		System.out.println("Entre com um n�mero para verificar se � negativo ou n�o: ");
		
		numero = sc.nextInt();
		
		ex2.verificaNumeroNegativo(numero);		
		*/
		
		/*
		System.out.println("Entre com um n�mero para verificar se este � par ou �mpar:");
		
		numero = sc.nextInt();
		
		ex2.verificaParImpar(numero);
		*/
		
		/*
		System.out.println("Entre com o primeiro n�mero:");
		int numero1 = sc.nextInt();
		
		System.out.println("Entre com o segundo n�mero:");
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

	