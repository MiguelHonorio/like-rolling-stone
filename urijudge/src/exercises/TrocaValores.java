package exercises;

import java.util.Scanner;

public class TrocaValores {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		int b;
		int auxiliatroca;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.println("O valor de A é " + a);
		System.out.println();
		System.out.println("O valor de B é " + b);
		System.out.println();

		auxiliatroca = a;
		a = b;
		b = auxiliatroca;

		System.out.println("Exchange Values or Values Changed");

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
