package pacote;

import java.util.Scanner;

public class Classe11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número");
		int num1 = sc.nextInt();
		
		if (num1 >= 0) {
			System.out.println("O número " + num1 + " é positivo");
		} else {
			System.out.println("O número " + num1 + " é negativo");
		}
		sc.close();
	}

}
