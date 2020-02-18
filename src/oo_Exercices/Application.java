package oo_Exercices;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		/*
		Rectangle rectangle = new Rectangle();
		

		System.out.println("Enter with rectangle width and height");
		double width = sc.nextDouble();
		double height = sc.nextDouble();

		rectangle.setWidth(width);
		rectangle.setHeight(height);

		double area = rectangle.area();
		double perimeter = rectangle.perimeter();
		double diagonal = rectangle.diagonal();
		
		System.out.printf("AREA: %.2f\n",area);
		System.out.printf("PERIMETER: %.2f\n",perimeter);
		System.out.printf("DIAGONAL: %.2f\n",diagonal);
		*/
		
		/*
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Joao Silva");
		funcionario.setGrossSalary(6000.00);
		funcionario.setTax(1000.00);
		
		System.out.println("Employee: " + funcionario);
		System.out.println("");
		System.out.println("Which percentage to increase salary?");
		double increase = sc.nextDouble();
		
		funcionario.increaseSalary(increase);
		
		System.out.println("Update data: $" + funcionario);
		*/
		
		Student student = new Student();
		
		System.out.println("Enter with student name:");
		String name = sc.nextLine();
		student.setName(name);
		
		System.out.println("Enter with firt trimester score");
		double firstTrimester = sc.nextDouble();
		student.setNotaTrimester_1(firstTrimester);
		
		System.out.println("Enter with second trimester score");
		double secondTrimester = sc.nextDouble();
		student.setNotaTrismester_2(secondTrimester);
		
		System.out.println("Enter with third trimester score");
		double thirTrimester = sc.nextDouble();
		student.setNotaTrimester_3(thirTrimester);
		
		student.getAproved();
		
		sc.close();

	}
}
