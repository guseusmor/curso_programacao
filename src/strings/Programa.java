package strings;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "abcde FGHIJ ABC abc DEFG";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); // Elimina os espa�os
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'z');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		/*
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		System.out.println(i);
		System.out.println(j);
		*/
	}

}
