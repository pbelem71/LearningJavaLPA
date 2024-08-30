package pacote;

import java.util.Scanner;

public class Classe32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um numero inteiro e positivo: ");
		int n = sc.nextInt();

		for (boolean i = true; i;) {
			if (n < 0) {
				System.out.println("Numero fora do intervalo solicitado, informe novamente: ");
				n = sc.nextInt();
			} else {
				i = false;
			}
			for (int j = 1; j <= n; j++) {
				System.out.println(j + " " + (int)Math.pow(j, 2) + " " + (int)Math.pow(j, 3));
			}
		}

		sc.close();
	}
}
