package java_basic_list002;

import java.util.Scanner;

public class EX013_DiaSemana {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o dia da semana de (1 - 7): ");
		int diaSemana = scan.nextInt();
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo!");
			break;
		case 2:
			System.out.println("Segunda-Feira!");
			break;
		case 3:
			System.out.println("Ter�a-Feira!");
			break;
		case 4:
			System.out.println("Quarta-Feira!");
			break;
		case 5:
			System.out.println("Quinta-Feira!");
			break;
		case 6:
			System.out.println("Sexta-Feira!");
			break;
		case 7:
			System.out.println("Sab�do!");
			break;
		default:
			System.out.println("Dia inv�lido");
		}
	}

}
