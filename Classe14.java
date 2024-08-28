package pacote;

import java.util.Scanner;

public class Classe14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas o jogo começou?");
		int inicio = sc.nextInt();
		System.out.println("Que horas o jogo terminou?");
		int fim = sc.nextInt();
		
		int duracao = fim - inicio;
		if (duracao <= 0) {
			duracao += 24;
		}
		System.out.println("A duração do jogo foi de " + duracao + " hora(s)");
		sc.close();
	}
}
