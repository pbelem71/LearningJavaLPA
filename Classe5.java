package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("qual o raio do circulo?");
		Double raio = sc.nextDouble();
		
		Double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.println("area é igual a: " + area);
		
		sc.close();
		
	}

}
