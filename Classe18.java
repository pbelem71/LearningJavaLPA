package aplications;

import java.util.Locale;
import java.util.Scanner;

public class Classe18 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salario da pessoa fisica");
		Double res =  sc.nextDouble();
		Double corte1 = res - 2000.00;
		Double corte2 = res - 3000.00;
		Double corte3 = res - 4500.00;
		Double imp;
		
		if (res > 0 && res <= 2000.00) {
			System.out.printf("Isento");
		} else if (res > 2000 && res <= 3000) {
			imp = corte1 * 0.08;
			res = imp;
			System.out.printf("R$ %.2f", res);
		} else if (res > 3000 && res <= 4500.00) {
			imp = corte2 * 0.18;
			res = imp + 80.00;
			System.out.printf("R$ %.2f", res);
		} else if (res > 4500) {
			imp = corte3 * 0.28;
			res = imp + 350.00;
			System.out.printf("R$ %.2f", res);
		}
		sc.close();
	}

}