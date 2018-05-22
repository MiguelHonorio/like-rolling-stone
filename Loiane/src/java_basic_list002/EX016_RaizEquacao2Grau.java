package java_basic_list002;

import java.util.Scanner;

/**
 * 
 * @since 08/05/2018
 * @author Miguel honório
 * 
 */

public class EX016_RaizEquacao2Grau {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor de 'A' ");
		double a = scan.nextDouble();
		if (a == 0) {
			System.out.println("Não é uma equação de Segundo Grau!");
		} else {

			System.out.println("Entre com o valor de 'B' ");
			double b = scan.nextDouble();
			System.out.println("Entre com o valor de 'C' ");
			double c = scan.nextDouble();

			// ax² + bx + c

			// x = -b±raiz de delta baskara
			// 2.a

			// delta = b² -4.a.c

			double delta = Math.pow(b, 2) - 4 * (a * c);
			if (delta < 0) {
				System.out.println("Delta negativo, fim do programa!");
			} else {
				System.out.println("Delta: " + delta);
				// calculo de x'
				double x1 = ((-b) + Math.sqrt(delta)) / 2 * a;

				// calculo de x''
				double x2 = ((-b) - Math.sqrt(delta)) / 2 * a;

				System.out.println("X' =  " + x1);
				System.out.println("X'' =  " + x2);
			}

		}

	}

}
