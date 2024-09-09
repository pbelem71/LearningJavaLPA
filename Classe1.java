package aplications;

import java.util.Locale;
import java.util.Scanner;

public class Classe1 {

	public static void main(String[] args) {
		
//		ctrol+shift+f formata o codigo
//		System.out.println(""); ignora o comando Locale, nesses casos utiliza o printf
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char x;
		int y;
		double z;
		
		System.out.println("Digite o char");
		x = sc.next().charAt(0);
		System.out.println("Digite o int");
		y = sc.nextInt();
		System.out.println("Digite o Double");
		z = sc.nextDouble();
		
		System.out.printf("O char é %s%nO int é %d%nO Double é %.2f", x,  y, z);
		
		sc.close();
		
//		charAt(0); é um comando para atribuir apenas a primeira letra na variavel
		
		
		

	}

}
