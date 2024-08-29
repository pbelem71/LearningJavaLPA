package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe31 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um numero inteiro");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				int res = N / i;
				System.out.println(res);
			}

		}
		sc.close();
	}

}
