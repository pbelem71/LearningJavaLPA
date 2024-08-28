package pacote;

import java.util.Scanner;

public class Classe13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 2 números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Os números " + num1 + num2 + " são multiplos");
		} else {
			System.out.println("Os números " + num1 + num2 + " não são multiplos");
		}
		sc.close();
	}

}
