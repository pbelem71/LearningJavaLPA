package pacote;

import java.util.Scanner;

public class Classe20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione o dia");
		int num1 = sc.nextInt();
		String dia;
		
		switch (num1) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta;";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
			default:
				dia = "esse dia não existe";
		}
		System.out.println("Hoje é " + dia);
		sc.close();
	}

}
