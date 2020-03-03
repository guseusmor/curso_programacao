package vectors;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Alunos[] vect = new Alunos[10];

		for (int i = 0; i < 10; i++) {
			vect[i] = null;
		}

		System.out.println("Qual o número de estudantes que vão alugar os quartos:");
		int quartos = sc.nextInt();

		while (quartos < 1 || quartos > 10) {
			System.out.println("Qual o número de estudantes que vão alugar os quartos:");
			quartos = sc.nextInt();
		}

		for (int i = 1; i <= quartos; i++) {
			System.out.println("Aluguel " + i);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Quarto: ");
			int quarto = sc.nextInt();

			Alunos aluno = new Alunos(nome, email);
			vect[quarto - 1] = aluno;
		}

		for (int i = 0; i < vect.length; i++) {

			if (vect[i] != null) {
				Alunos a = vect[i];
				System.out.print(i + 1 + ": ");
				System.out.println(a.toString());
			} 

		}

		sc.close();
	}

}
