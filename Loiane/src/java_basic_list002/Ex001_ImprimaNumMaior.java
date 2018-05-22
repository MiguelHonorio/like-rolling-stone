package java_basic_list002;

import java.util.Scanner;

public class Ex001_ImprimaNumMaior {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.println("Informe o segundo número: ");
		double num2 = scan.nextDouble();

		if (num1 > num2) {
			System.out.println("O num1 é o maior:" + num1);
		} else {
			System.out.println("O num2 é o maior:" + num2);
		}

	}

}
