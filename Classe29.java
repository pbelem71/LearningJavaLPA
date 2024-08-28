package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe29 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double num1, num2;

		System.out.println("Insira a quantidade de repetições: ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Insira os valores que quer dividir");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();;
			if (num2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				Double res = num1 / num2;
				System.out.printf("resultado = %.2f%n", res);
			}
		}

		sc.close();
	}
}
