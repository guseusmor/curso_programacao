package curso_programacao;

public class Exercicio1{

	public int a;
	public int b;
	public double area;
	public final double pi = 3.14159;

	public int somaDoisValores(int a, int b) {

		int soma = a + b;

		return soma;
	}

	
	public double calculaAreaCirculo(double raio) {
		
		return this.area = (raio * raio) * pi;
	}
	
	public int diferencaDeProduto(int a, int b, int c, int d) {
		
		return (a*b)-(c*d);
	}
	
	public double calculaSalarioFuncionario(int horas, double salarioHora) {
		
		return horas * salarioHora;
		
	}
	
	public double valorTotal(int numeroPecas, double valorUnitario) {
		
		return numeroPecas * valorUnitario;
	}


}
