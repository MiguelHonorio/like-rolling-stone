package iniciante;

import java.util.Scanner;

public class Triangulos {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		double ang1 = 0;
		double ang2 = 0;
		double ang3 = 0;

		System.out.println("Entre com o 1� �ngulo desejado");
		ang1 = ler.nextDouble();
		System.out.println("Entre com o 2� �ngulo desejado");
		ang2 = ler.nextDouble();
		System.out.println("Entre com o 3� �ngulo desejado");
		ang3 = ler.nextDouble();

		if ((ang1 < ang2 + ang3) && (ang2 < ang1 + ang3) && (ang3 < ang1 + ang2)) {
			if ((ang1 == ang2) && (ang2 == ang3)) {
				System.out.println("Este � um tri�ngulo equil�tero!");
			} else if ((ang1 == ang2) || (ang1 == ang3) || (ang2 == ang3)) {
				System.out.println("Este � um tri�ngulo is�celes!");
			} else
				System.out.println("Este � um tri�ngulo escaleno!");

			System.out.println("Estes valores formam um tipo de tri�ngulo!");

		} else {

			System.out
					.println("Estes valores n�o formam um tipo de tri�ngulo!");
		}
	}
}
