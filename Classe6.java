package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe6 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Id do funcionario");
		int id = sc.nextInt();
		
		System.out.println("Qual o numero de horas trabalhadas?");
		Double horas = sc.nextDouble();
		
		System.out.println("Quanto recebe por hora?");
		Double valorPorHora = sc.nextDouble();
		
		Double salario = horas * valorPorHora;
		
		System.out.printf("NUMBER = %d%nSalary =  U$ %.2f", id, salario);
		
		sc.close();
		
	}

}