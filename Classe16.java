package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe16 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor");
		Double valor = sc.nextDouble();
		
		if (valor > 0 && valor <= 25) {
			System.out.println("O valor esta no intervalo de [0,25]");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("O valor esta no intervalo de [25,50]");
		} else if (valor > 50 && valor <= 75) {
			System.out.println("O valor esta no intervalo de [50,75]");
		} else if (valor > 75 && valor <= 100) {
			System.out.println("O valor esta no intervalo de [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}

}
