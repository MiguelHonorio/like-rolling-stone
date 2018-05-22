package java_basic_list002;

import java.util.Scanner;

public class EX020_CrimeQuestion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Telefonou para a vítima?");
		String resposta1 = scan.next();
		System.out.println("2 - Esteve no local do crime?");
		String resposta2 = scan.next();
		System.out.println("3 - Mora perto da vítima?");
		String resposta3 = scan.next();
		System.out.println("4 - Devia para a vítima?");
		String resposta4 = scan.next();
		System.out.println("5 - Já trabalhou para a vítima?");
		String resposta5 = scan.next();
		int count = 0;

		if (resposta1.equalsIgnoreCase("S")) {
			count++;
		}
		if (resposta2.equalsIgnoreCase("S")) {
			count++;
		}
		if (resposta3.equalsIgnoreCase("S")) {
			count++;
		}
		if (resposta4.equalsIgnoreCase("S")) {
			count++;
		}
		if (resposta5.equalsIgnoreCase("S")) {
			count++;
		}

		if (count == 0) {
			System.out.println("É inocente!");
		} else if (count == 2) {
			System.out.println("É suspeito!");
		} else if (count == 3 && count == 4) {
			System.out.println("É Cúmplice!");
		} else {
			System.out.println("É Assassino!");
		}

	}

}
