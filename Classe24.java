package aplications;

import java.util.Scanner;

public class Classe24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1, y = 1;
		
		while (x != 0 && y != 0) {
			
			System.out.println("Insira X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
			} else if (x == 0 && y ==0) {
				System.out.println("Origem");
			} else if (x == 0){
				System.out.println("Eixo X");
			} else if (y == 0) {
				System.out.println("Eixo Y");
			}
			
		}
		System.out.println("Fim do programa");
		sc.close();
	}

}