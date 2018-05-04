package exercises;

import java.util.Scanner;

public class Ex1020_AnoMesDia {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int idadeDias = input.nextInt();

		int ano = idadeDias / 365;
		int mes = (idadeDias % 365) / 30;
		int dias = (idadeDias % 365) % 30;

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");
	}

}
