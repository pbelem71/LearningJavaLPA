package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe28 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double x, y, z;
		int peso2 = 2, peso3 = 3, peso5 = 5;

		System.out.println("Insira um valor inteiro");
		int num1 = sc.nextInt();

		for (int i = 0; i < num1; i++) {
			if (i == 0) {
				System.out.println("Insira 3 valores: ");
				x = sc.nextDouble();
				y = sc.nextDouble();
				z = sc.nextDouble();
				Double res = (x * peso2 + y * peso3 + z * peso5) / (peso2 + peso3 + peso5);
				System.out.printf("%.1f%n", res);
			} else {
				System.out.println("Insira mais 3 valores: ");
				x = sc.nextDouble();
				y = sc.nextDouble();
				z = sc.nextDouble();
				Double res = (x * peso2 + y * peso3 + z * peso5) / (peso2 + peso3 + peso5);
				System.out.printf("%.1f%n", res);
			}
//			Média Ponderada = (Valor1 * Peso1 + Valor2 * Peso2 + Valor3 * Peso3) / (Peso1 + Peso2 + Peso3)
		}
		sc.close();
	}

}
