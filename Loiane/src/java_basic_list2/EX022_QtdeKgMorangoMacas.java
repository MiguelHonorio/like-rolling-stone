package java_basic_list2;

import java.util.Scanner;

public class EX022_QtdeKgMorangoMacas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade em KG: ");
		double kg = scan.nextDouble();
		System.out.println("Fruta escolhida: ");
		String fruta = scan.next();

		double morango = 2.50;
		double maca = 1.50;
		double percDesc = 10;
		double total = 0;
		double totalDesc = 0;

		if (fruta.equalsIgnoreCase("s")) {
			if (kg <= 5) {
				total = kg * morango;
			} else if (kg > 5 && kg <= 8) {
				total = kg * 2.20;
			}

		} else if (fruta.equalsIgnoreCase("a")) {
			if (kg <= 5) {
				total = kg * morango;
			} else if (kg > 5) {
				total = kg * 1.50;
			}
		}if (total > 25) {
			totalDesc = (total * 10) / 100;
		}

		double precoApagar = total - totalDesc;
		System.out.println("O valor a ser pago é: " + precoApagar);

	}

}
