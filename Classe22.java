package aplications;

import java.util.Locale;
import java.util.Scanner;

public class Classe22 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira x:");
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("Seu valor ficou em: " + soma);
		sc.close();
	}
	
}
