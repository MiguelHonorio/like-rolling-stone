package java_basico_list1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex009_FarenheitCelsius {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		Scanner scan = new Scanner(System.in);
		double farenheit;
		System.out.println("Entre com a temperatura em ºF: ");
		farenheit = scan.nextDouble();
		double celsius = (5 * (farenheit - 32) / 9);

		System.out.println("A temperatura é " + df.format(celsius) + " ºC");

	}

}
