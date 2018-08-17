package java_basic_list003;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class EX005_PopulacaoEdit {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double populA, populB, txA, txB;
		double count = 0;
		boolean infoValida = false;

		do {
			System.out.println("Entre com o número da população 'A'");
			populA = scan.nextDouble();

			if (populA > 0) {
				infoValida = true;
			} else {
				System.out.println("População A deve ser maior que zero");
			}
		} while (!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com a taxa de crescimento da população 'A'");
			txA = scan.nextDouble(); // taxa de crescimento 3%

			if (txA > 0) {
				infoValida = true;
			} else {
				System.out.println("Taxa de crescimento A deve ser maior que zero");
			}
		} while (!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com o número da população 'B'");
			populB = scan.nextDouble();

			if (populB > 0) {
				infoValida = true;
			} else {
				System.out.println("População B deve ser maior que zero");
			}
		} while (!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com a taxa de crescimento da população 'B'");
			txB = scan.nextDouble(); // taxa de crescimento 3%

			if (txB > 0) {
				infoValida = true;
			} else {
				System.out.println("Taxa de crescimento B deve ser maior que zero");
			}
		} while (!infoValida);

		while (populA < populB) {
			populA += (populA / 100) * txA;
			populB += (populB / 100) * txB;
			count++;
			infoValida = true;
		}
		System.out.println("População A: " + df.format(populA));
		System.out.println("População B: " + df.format(populB));
		System.out.println("Em " + df.format(count) + " anos população 'A' irá alcançar população 'B'");

	}

}
