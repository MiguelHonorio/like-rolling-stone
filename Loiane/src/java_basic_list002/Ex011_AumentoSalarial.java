package java_basic_list002;

import java.util.Scanner;

public class Ex011_AumentoSalarial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor do salário atual: ");
		double salario = scan.nextDouble();
		double percentual = 0;

		if (salario <= 280) {
			percentual = 20;
		} else if (salario > 280 && salario < 700) {
			percentual = 15;
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;
		} else if (salario >= 1500) {
			percentual = 5;
		}

		double aumento = (salario / 100) * percentual;
		double salAjustado = salario + aumento;

		System.out.println("Salário inicial: " + salario);
		System.out.println("Percentual: " + percentual);
		System.out.println("Aumento: " + aumento);
		System.out.println("Salário atualizado: " + salAjustado);
	}

}
