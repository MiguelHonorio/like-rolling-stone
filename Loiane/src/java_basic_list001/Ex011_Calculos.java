package java_basic_list001;

import java.util.Scanner;

public class Ex011_Calculos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro número inteiro: ");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo número inteiro: ");
		int num2 = scan.nextInt();
		System.out.println("Entre com o número real: ");
		double numReal = scan.nextDouble();
		
		int produto =  ((num1 * 2) * (num2 / 2));
		System.out.println("O produto do dobro do primeiro somado a metade do segundo é: " + produto);
		double soma1 = (3* num1)+ numReal;
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma1);
		double aoCubo = Math.pow(numReal, 3);
		System.out.println("O terceiro elevado ao cubo é: " + aoCubo);
		
	}

}
