package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe26 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		
		for (int i = 0; i == 0;) {

			System.out.println("Insira um valor maior que 0 e menor que 1000");
			x = sc.nextInt();

			if (x < 0 || x > 1000) {
				System.out.println("Valor fora do intervalo solicitado");
			} else {
				i++;
			}
		}
		
		if (x % 2 == 0) {
			System.out.println("O valor é par");
		} else {
			for (int i = 0; i <= x; i++) {
				System.out.println("O valor impar é: " + i);
			}
		}
		
		sc.close();
	}
}
