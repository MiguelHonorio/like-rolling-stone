package java_basic_list2;

import java.util.Scanner;

public class Ex003_FemininoMasculino {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual seu sexo (F) ou (M): ");
		String genero = scan.next();
		
		if (genero.equals("f")) {
			System.out.println("Sexo feminino");

		} else if (genero.equals("m")) {
			System.out.println("Sexo Masculino");

		} else {
			System.out.println("Sexo inválido");

		}

	}

}
