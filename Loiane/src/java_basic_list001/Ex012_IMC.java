package java_basic_list001;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex012_IMC {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("Digita a altura: ");
		double altura = scan.nextDouble();
		double imc = ((72.7 * altura)-58);
		System.out.println("O peso ideal é: " + df.format(imc));
		
	}

}
