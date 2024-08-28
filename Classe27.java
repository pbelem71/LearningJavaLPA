package pacote;

import java.util.Scanner;

public class Classe27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0;
		
		System.out.println("Quantos numeros?");
		int num1 = sc.nextInt();

		for (int i = 0, num2 = 0; i < num1; i++) {
			num2 = sc.nextInt();
			if (num2 >= 10 && num2 <= 20) {
				x++;
			} else {
				y++;
			}
		}
		System.out.println(y + " out\n" + x + " in");
		sc.close();
	}
}