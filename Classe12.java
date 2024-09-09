package aplications;

import java.util.Scanner;

public class Classe12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número");
		int num1 = sc.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("O número " + num1 + " é par");
		} else {
			System.out.println("O número " + num1 + " é impar");
		}
		sc.close();
	}
}
