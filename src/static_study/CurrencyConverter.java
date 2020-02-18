package static_study;

public class  CurrencyConverter {
	
	public static double dollar = 3.10;
	
	
	public static double converter(double real) {
		
		return ((real * dollar) * 0.06) + (real * dollar);
	}
	
}
