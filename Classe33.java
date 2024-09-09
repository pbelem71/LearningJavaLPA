package aplications;

import java.util.Scanner;

//HowAboutStrings

public class Classe33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("String minuscula: -" + s01 + "-");
		System.out.println("String maiuscula: -" + s02 + "-");
		System.out.println("String sem espaços nas extremides: -" + s03 + "-");
		System.out.println("2 character em diante: -" + s04 + "-");
		System.out.println("2 character ao 9: -" + s05 + "-");
		System.out.println("troque a por x: -" + s06 + "-");
		System.out.println("troque abc por xy: -" + s07 + "-");
		System.out.println("captura o valor da posição do character no int: -" + i + "-");
//		first position: indexOf
		System.out.println("captura o valor da posição do character no int: -" + j + "-");
//		last position: lastIndexOf
		
//		split operation
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
//		potato enters position 0, apple in 1, and lemon in 2
		System.out.printf("%s%n%s%n%s%n", vect[0], vect[1], vect[2]);
		System.out.println(word1 + word2 + word3);
		
		
		sc.close();
	}

}
