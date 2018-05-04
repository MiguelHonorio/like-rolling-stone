package java_basico_list1;

import java.util.Scanner;

public class Ex004_MediaBimestral {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nota1, nota2, nota3, nota4, media;

		System.out.println("Entre com o valor da nota 1: ");
		nota1 = scan.nextInt();
		System.out.println("Entre com o valor da nota 2: ");
		nota2 = scan.nextInt();
		System.out.println("Entre com o valor da nota 3: ");
		nota3 = scan.nextInt();
		System.out.println("Entre com o valor da nota 4: ");
		nota4 = scan.nextInt();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média final é: " + media);
	}

}
