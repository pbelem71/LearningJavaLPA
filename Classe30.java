package aplications;

import java.util.Scanner;

public class Classe30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		
		System.out.println("Insira o numero");
		int N = sc.nextInt();

		for (int i = 1; i < N; i++) {
			x *= i;

		}
		System.out.println("O resultado é " + x);
		sc.close();
	}
}
