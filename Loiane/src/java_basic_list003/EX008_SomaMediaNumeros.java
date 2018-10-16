package java_basic_list003;

import java.util.Scanner;

public class EX008_SomaMediaNumeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = Integer.MIN_VALUE;
		int soma = 0;
		double media;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			num = scan.nextInt();

			soma += num;
		}
		media = soma / 5;
		System.out.println("Soma dos números: " + soma);
		System.out.println("Média dos números: " + media);
	}

}
