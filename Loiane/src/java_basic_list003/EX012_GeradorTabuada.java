package java_basic_list003;

import java.util.Scanner;

public class EX012_GeradorTabuada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int tabuada;
		int count;
		int result;

		System.out.println("Informe a tabuada desejada!");
		tabuada = scan.nextInt();

		System.out.println("Tabuada do " +tabuada+ ":");
		for (count = 0; count <= 10; count++) {
			result = tabuada * count;
			System.out.println(tabuada + " * " + count + " = " + result);
		}
	}
}
