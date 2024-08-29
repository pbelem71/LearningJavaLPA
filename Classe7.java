package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe7 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o código da primeira peça?");
		int id1 = sc.nextInt();
		System.out.println("Quantas unidades?");
		int u1 = sc.nextInt();
		System.out.println("Qual o valor da primeira peça?");
		Double v1 = sc.nextDouble();
		
		System.out.println("Qual o codigo da segunda peça?");
		int id2 = sc.nextInt();
		System.out.println("Quantas unidades?");
		int u2 = sc.nextInt();
		System.out.println("Qual o valor da segunda peça?");
		Double v2 = sc.nextDouble();
		
		double res = (u1 * v1) + (u2 * v2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", res);
		System.out.println(id1 + " " + id2);
		sc.close();
	}

}
