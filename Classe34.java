package pacote;

import java.util.Scanner;

public class Classe34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quatidade de números: ");
		int tamanho = sc.nextInt();

		int[] numeros = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		sc.close();

		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}

		System.out.println("A soma dos números é: " + soma);
	}

}