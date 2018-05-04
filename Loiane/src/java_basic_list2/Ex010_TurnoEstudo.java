package java_basic_list2;

import java.util.Scanner;

public class Ex010_TurnoEstudo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o turno: ");
		
		char turno;
		turno = scan.nextLine().charAt(0);

		if (turno == 'm') {
			System.out.println("Bom dia");
		}
		else if (turno == 'v') {
			System.out.println("Boa tarde");
		}
		else if (turno == 'n') {
			System.out.println("Boa noite");
		} else {
			System.out.println("Valor inválido!");

		}

	}

}
