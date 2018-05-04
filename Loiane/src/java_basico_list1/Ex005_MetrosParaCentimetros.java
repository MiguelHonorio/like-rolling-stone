package java_basico_list1;

import java.util.Scanner;

public class Ex005_MetrosParaCentimetros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor em metros: ");
		double vMetros = scan.nextDouble();

		double centimetros = vMetros * 100;
		System.out.println(vMetros + " Metros = " + centimetros + " Centímetros");

	}

}
