package java_basico_list1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex010_CelsiusFarenheit {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		Scanner scan = new Scanner(System.in);
		
		double celsius;
		System.out.println("Entre com a temperatura em ºC: ");
		celsius = scan.nextDouble();
		double farenheit = (celsius * 1.8) + 32;
		
		System.out.println("A temperatura é " + df.format(farenheit) + " ºF");

	}

}
