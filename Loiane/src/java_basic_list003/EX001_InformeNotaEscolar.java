package java_basic_list003;

import java.io.NotActiveException;
import java.util.Scanner;

public class EX001_InformeNotaEscolar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean valido = false;

		do {
			System.out.println("Informa uma nota de 0 à 10!");
			valido = true;
			int nota = scan.nextInt();
			if (nota <= 10 && nota >= 0) {
				System.out.println("A nota " + nota + " é válida");
			} else {
				System.out.println("Você digitou uma nota inválida, tente novamente!");
			}

		} while (!valido);

	}

}
