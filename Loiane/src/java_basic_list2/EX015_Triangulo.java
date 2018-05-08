package java_basic_list2;

import java.util.Scanner;

public class EX015_Triangulo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a 1° medida: ");
		double medida1 = scan.nextDouble();
		System.out.println("Entre com a 2° medida: ");
		double medida2 = scan.nextDouble();
		System.out.println("Entre com a 3° medida: ");
		double medida3 = scan.nextDouble();

		if (medida1 + medida2 < medida3 || medida1 + medida3 < medida2 || medida2 + medida3 < medida1) {
			System.out.println("Não é um triângulo");
		} else {
			if (medida1 == medida2 && medida2 == medida3 && medida3 == medida1) {
				System.out.println("É um triângulo equilátero");
			} else if (medida1 == medida2 || medida2 == medida3 || medida3 == medida1) {
				System.out.println("É um triângulo Isóceles");
			} else if (medida1 != medida2 && medida2 != medida3 && medida3 != medida1) {
				System.out.println("É um triângulo Escaleno");

			}
		}
	}
}
