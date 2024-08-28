package pacote;

import java.util.Scanner;

public class Classe25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alc = 0, gas = 0, die = 0, fim = 0;

		while (fim == 0) {

			System.out.println("Combustivel escolhido: ");
			int x = sc.nextInt();

			if (x == 1) {
				System.out.println("Etanol");
				alc++;
			} else if (x == 2) {
				System.out.println("Gasolina");
				gas++;
			} else if (x == 3) {
				System.out.println("Diesel");
				die++;
			} else if (x == 4) {
				fim++;
			} else {
				System.out.println("Tente novamente");
			}
		}

		System.out.printf("Muito Obrigado%nAlcool: %d%nGasolina: %d%nDiesel %d", alc, gas, die);
		sc.close();

	}

}