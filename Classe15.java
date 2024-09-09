package aplications;

import java.util.Scanner;

public class Classe15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double CachorroQuente = 4.00, xSalada = 4.50, xBacon = 5.00, TorradaSimples = 2.00, Refrigerante = 1.50, valor;
		
		System.out.println("Insira o Código");
		int id = sc.nextInt();
		System.out.println("Qual a quantidade do item?");
		Double quant = sc.nextDouble();
		
		if (id == 1) {
			valor = CachorroQuente * quant;
			System.out.println("Total: R$" + valor);
		} else if (id == 2) {
			valor = xSalada * quant;
			System.out.println("Total: R$" + valor);
		} else if (id == 3) {
			valor = xBacon * quant;
			System.out.println("Total: R$" + valor);
		} else if (id == 4) {
			valor = TorradaSimples * quant;
			System.out.println("Total: R$" + valor);
		} else if (id == 5) {
			valor = Refrigerante * quant;
			System.out.println("Total: R$" + valor);
		}
		sc.close();
	}

}
