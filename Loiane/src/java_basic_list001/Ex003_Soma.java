package java_basic_list001;

import java.util.Scanner;

public class Ex003_Soma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		System.out.println("Entre com o segundo n�mero: ");
		double num2 = scan.nextDouble();
		double soma = num1 + num2;
		System.out.println("A soma dos n�meros �: " + soma);

	}

}
