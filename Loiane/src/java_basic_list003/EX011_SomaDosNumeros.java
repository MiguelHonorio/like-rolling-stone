package java_basic_list003;

import java.util.Scanner;

public class EX011_SomaDosNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Insira o segundo número: ");
		int num2 = scan.nextInt();
		int soma = 0;
		
		for (int i = num1; i <= num2; i++) {
			soma += i;
		}
		System.out.print("Soma = "+soma);
	}
}
