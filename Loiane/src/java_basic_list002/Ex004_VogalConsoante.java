package java_basic_list002;

import java.util.Scanner;

public class Ex004_VogalConsoante {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra: ");

		char letra;
		letra = scan.nextLine().charAt(0);

		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("A letra '" + letra + "' é uma vogal!");
			break;
		default:
			System.out.println("A letra '" + letra + "' é uma Consoante! ");
		}
	}

}
