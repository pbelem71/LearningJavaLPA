package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Classe8 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A, B, C, TRI, CIR, TRA, QUA, RET;
		
		System.out.println("Informe 3 valores");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRI = A * C / 2;
		CIR = 3.14159 * Math.pow(C, 2);
		TRA = (A + B) * C / 2;
		QUA = Math.pow(B, 2);
		RET = A * B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", TRI, CIR, TRA, QUA, RET);
		
		sc.close();
	}

}
