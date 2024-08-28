package pacote;

import java.util.Locale;

public class Classe9 {

	public static void main(String[] args) {
		String product1 = "Computer", product2 = "Office Desk";
		int age = 30, code = 5290;
		char gender = 'F';
		double price1 = 2100.0, price2 = 650.50, measure = 52.234567, measure2 = 52.234;
		System.out.println(product1 + ", which price is $ " + price1 + "\n" + product2 + ", Which price is $" + price2 + "\n\n" + "Record: " + age + " years old, code " + code + " and gender:" + gender
				+ "\n\n" + "Measue with eight decimal places: " + measure + "\nRouded (three decimal places): " + measure2);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}
}
