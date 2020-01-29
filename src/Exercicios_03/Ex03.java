package Exercicios_03;

public class Ex03 {
	
	int alcool = 0;
	int gasolina = 0;
	int diesel = 0;

	public boolean verificaSenha(String senha) {

		String senha_cadastrada = "2002";

		if (senha_cadastrada.equals(senha)) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			return false;
		}

	}

	public void verificaQuadrante(double x, double y) {

		if (x > 0 && y > 0) {
			System.out.println("Primeiro");
		} else if (x < 0 && y > 0) {
			System.out.println("Segundo");
		} else if (x < 0 && y < 0) {
			System.out.println("Terceiro");
		} else if (x > 0 && y < 0) {
			System.out.println("Quarto");
		}

	}
	
	public void postoDeCombustivel(int codigo) {
		
		switch(codigo) {
		case 1:
			alcool++;
			break;
		case 2:
			gasolina++;
			break;
		case 3:
			diesel++;
			break;
		}
	}
	
	public void getCombustiveis() {
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}
	
	
}
