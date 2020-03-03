package list_exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Funcionario> funcionario = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionarios serão registrados?");
		int numeroFuncionarios = sc.nextInt();

		for (int i = 0; i < numeroFuncionarios; i++) {
			
			Funcionario func = new Funcionario();

			System.out.println("Funcionario #" + i + 1);

			System.out.print("ID:");
			
			int id = sc.nextInt();
			func.setId(id);
			
			sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			func.setNome(nome);

			System.out.print("Salário:");
			double salario = sc.nextDouble();
			func.setSalario(salario);

						
			funcionario.add(func);
		}

		System.out.println("Selecione o id de funcionario que terá aumento de salário:");
		double idAumento = sc.nextDouble();
		
		funcionario.contains(funcionario.get(index))
		
		for(Funcionario verificaId : funcionario) {
			
			if(verificaId.getId().) {
				
			}
		}

		System.out.println("Entre com a porcentagem do aumento:");
		double percentual = sc.nextDouble();
		
		System.out.println("Lista de funcionários:");
		
		for(Funcionario obj : funcionario) {
			
			if(obj.getId() == idAumento) {
				obj.incrementaSalario(percentual);
			}
			
			System.out.printf(obj.getId() + ", " + obj.getNome() + ", " + "%.2f\n",obj.getSalario());
		}
		
		sc.close();
	}

}
