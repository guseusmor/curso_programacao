package static_study;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? %.2f\n", CurrencyConverter.dollar);
		
		System.out.println("How many dollar's will be bought?");
		double dollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(dollar));
		
		sc.close();
	}

}
