package java_basic_list003;

import java.util.Scanner;

public class EX012_GeradorTabuada2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a tabuada desejada!");
		int tabuada = scan.nextInt();

		System.out.println("Tabuada do " + tabuada + ":");
		for (int count = 0; count <= 10; count++) {
			System.out.println(tabuada + " * " + count + " = " + (tabuada * count));
		}
	}
}
