package aplications;

import java.util.Scanner;

public class Classe2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		
//		não dá pra digitar esses dados em sequencia pq o nextInt da uma quebra de linha, essa que fica salva no proximo next(o s1)
//		para resolver da pra colocar um sc.nextLine(); extra
		x = sc.nextInt();
//		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("dados digitados: " + x + s1 + s2 + s3);
		sc.close();
	}

}
