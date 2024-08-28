package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe17 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de X");
		Double x = sc.nextDouble();
		System.out.println("Insira o valor de Y");
		Double y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x == 0 && y ==0) {
			System.out.println("Origem");
		} else if (x == 0){
			System.out.println("Eixo X");
		} else if (y == 0) {
			System.out.println("Eixo Y");
		}
		sc.close();
	}

}
