package aplications;

import java.util.Locale;
import java.util.Scanner;

public class Classe21 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		Double desconto;

		System.out.println("informe o numero");
		Double preco = sc.nextDouble();

//		if (preco > 20) {
//			desconto = preco * 0.1;
//		} else {
//			desconto = preco * 0.05;
//		}

//		(condição) ? valor se verdadeiro : valor se falso

		Double desconto = (preco > 20) ? preco * 0.1 : preco * 0.05;

		System.out.printf("seu desconto é R$ %.2f", (preco - desconto));

		sc.close();
	}

}
