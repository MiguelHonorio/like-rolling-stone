package java_basic_list003;

import java.util.Scanner;

public class EX001_InformeNotaEscolar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean valido = false;

		System.out.println("Informa uma nota de 0 � 10!");
		do {
			int nota = scan.nextInt();
			if (nota <= 10 && nota >= 0) {
				System.out.println("A nota " + nota + " � v�lida");
			}else{
				System.out.println("Voc� digitou uma nota inv�lida, tente novamente!");
			}

		} while (!valido);

	}

}
