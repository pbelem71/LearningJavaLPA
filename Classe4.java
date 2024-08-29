package pacote;

import java.util.Scanner;

public class Classe4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, res;
		
		System.out.println("Insira o primeiro numero: ");
		x = sc.nextInt();
		System.out.println("Insira o segundo numero: ");
		y = sc.nextInt();
		
		res = x + y;
		
		System.out.println("o resultado da soma é: " + res);
		sc.close();
	}

}
