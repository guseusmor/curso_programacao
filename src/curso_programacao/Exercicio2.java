package curso_programacao;

import java.text.DecimalFormat;

public class Exercicio2 {

	public void verificaNumeroNegativo(int numero) {

		if (numero < 0) {
			System.out.println("Número negativo");
		} else {
			System.out.println("Número não negativo");
		}
	}

	public void verificaParImpar(int numero) {

		if (numero % 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("Número ímpar");
		}
	}

	public void numerosMultiplos(int numero1, int numero2) {

		if (numero1 > numero2) {
			if (numero1 % numero2 == 0) {
				System.out.println("São Multiplos");
			} else {
				System.out.println("Não são Multiplos");
			}
		} else {
			if (numero2 % numero1 == 0) {
				System.out.println("São Multiplos");
			} else {
				System.out.println("Não são Multiplos");
			}
		}
	}

	public int duracaoJogo(int horaInicial, int horaFinal) {

		int duracao1, duracaoFinal;

		if (horaInicial >= horaFinal) {

			duracao1 = 24 - horaInicial;
			duracaoFinal = duracao1 + horaFinal;

		} else {

			duracaoFinal = horaFinal - horaInicial;
		}

		if (duracaoFinal >= 1 && duracaoFinal <= 24) {

		}

		return duracaoFinal;
	}

	public void verificaDuracaoJogo(int duracaoTotal) {

		if (duracaoTotal >= 1 && duracaoTotal <= 24) {
			System.out.println("Jogo válido");
		} else {
			System.out.println("Tempo de jogo não permitido");
		}

	}
	
	public void tabelaPreco(String codigo, int quantidade) {
		
		String[][] tabela = new String[5][3];
		double preco,precoTotal;
		
		tabela[0][0] = "1";
		tabela[1][0] = "2";
		tabela[2][0] = "3";
		tabela[3][0] = "4";
		tabela[4][0] = "5";
		
		tabela[0][1] = "Cachoro Quente";
		tabela[1][1] = "X-Salada";
		tabela[2][1] = "X-Bacon";
		tabela[3][1] = "Torrada simples";
		tabela[4][1] = "Regrigerante";
		
		tabela[0][2] = "4.00";
		tabela[1][2] = "4.50";
		tabela[2][2] = "5.00";
		tabela[3][2] = "2.00";
		tabela[4][2] = "1.50";
		
		if(codigo == "1") {
			preco = Double.parseDouble(tabela[0][2]);
			precoTotal = preco * quantidade;
			
			System.out.printf("O valor da conta é: R$" + "%.2f" + " .Item:" + "%s",precoTotal,tabela[0][1]);
			
		}
		if(codigo == "2") {
			preco = Double.parseDouble(tabela[1][2]);
			precoTotal = preco * quantidade;
			
			System.out.printf("O valor da conta é: R$" + "%.2f" + " .Item:" + "%s",precoTotal,tabela[1][1]);
			
		}
		if(codigo == "3") {
			preco = Double.parseDouble(tabela[2][2]);
			precoTotal = preco * quantidade;
			
			System.out.printf("O valor da conta é: R$" + "%.2f" + " .Item:" + "%s",precoTotal,tabela[2][1]);
			
		}
		if(codigo == "4") {
			preco = Double.parseDouble(tabela[3][2]);
			precoTotal = preco * quantidade;
			
			System.out.printf("O valor da conta é: R$" + "%.2f" + " .Item:" + "%s",precoTotal,tabela[3][1]);
			
		}
		if(codigo == "5") {
			preco = Double.parseDouble(tabela[4][2]);
			precoTotal = preco * quantidade;
			
			System.out.printf("O valor da conta é: R$" + "%.2f" + " .Item:" + "%s",precoTotal,tabela[4][1]);
			
		}
		
	}
	
	public void verificaIntervalo(double numero) {
		
		if(numero >= 0 && numero <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if(numero > 25 && numero <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		else if(numero > 50 && numero <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else if(numero > 75 && numero <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora do intervalo");
		}
	}
	
	public void verificaPontoCartesiano(double x, double y) {
				
			
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		
		if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		
		if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		
		if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
	}
}
