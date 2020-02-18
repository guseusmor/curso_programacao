package Exercicio_04;

import java.text.DecimalFormat;

public class Funcoes {

	int in, out = 0;
	double valorReal1, valorReal2, valorReal3;
	final int peso1 = 2;
	final int peso2 = 3;
	final int peso3 = 5;

	public void mostraImpares(int numero) {

		for (int x = 0; x <= numero; x++) {
			if (x % 2 != 0) {
				System.out.println(x);
			}
		}

	}

	public String ordinal(int i) {
		String[] sufixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
		switch (i % 100) {
		case 11:
		case 12:
		case 13:
			return i + "th";
		default:
			return i + sufixes[i % 10];
		}
	}

	public void verificaIntervalo(int inteiro) {

		if (inteiro >= 10 && inteiro <= 20) {
			in++;
		} else {
			out++;
		}

	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}

	public double getValorReal1() {
		return valorReal1;
	}

	public void setValorReal1(double valorReal1) {
		this.valorReal1 = valorReal1;
	}

	public double getValorReal2() {
		return valorReal2;
	}

	public void setValorReal2(double valorReal2) {
		this.valorReal2 = valorReal2;
	}

	public double getValorReal3() {
		return valorReal3;
	}

	public void setValorReal3(double valorReal3) {
		this.valorReal3 = valorReal3;
	}

	public double mediaPonderada() {

		double calculo = ((valorReal1 * peso1) + (valorReal2 * peso2) + (valorReal3 * peso3)) / (peso1 + peso2 + peso3);

		// DecimalFormat df = new DecimalFormat("#,###") ;
		// calculo = Double.valueOf(df.format(calculo));

		return calculo;
	}

	public double divisaoPrimeiroPeloSegundo(double primeiro, double segundo) {

		double resultado = primeiro / segundo;

		return resultado;

	}

	public int fatorial(int numero) {

		int fatorial = 0;

		if (numero == 0 || numero == 1) {
			fatorial = 1;

			return fatorial;
		}

		else {

			return this.fatorial(numero - 1) * numero;

		}
	}
	
	public void  retornaDivisores(int numero) {
		
		for(int i = 1; i <= numero;i++) {
			if(numero % i == 0) {
				System.out.println(i);
			}
		}
		
		
	}
	
	public void variaOperacoes(int numero) {
		
		for(int i = 1; i <= numero;i++) {
			int quadradoNumero = i * i;
			int cuboNumero = i * i * i;
			
			System.out.print(i + " " + quadradoNumero + " " + cuboNumero + "\n");
		}
	}
}
