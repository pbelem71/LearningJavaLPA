package aplications;

import java.util.Scanner;

public class Classe23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int acesso = 0, tentativa, senha;
		
			System.out.println("Defina sua senha:");
			tentativa = sc.nextInt();
			senha = tentativa;

		while (acesso == 0) {
			System.out.println("Senha: ");
			tentativa = sc.nextInt();
			if (tentativa != senha) {
				System.out.println("Acesso negado");
			} else {
				acesso++;
			}
		}
		System.out.println("Acesso permitido");
		sc.close();
	}

}