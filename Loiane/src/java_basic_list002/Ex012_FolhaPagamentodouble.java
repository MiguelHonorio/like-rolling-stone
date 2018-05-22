package java_basic_list002;

import java.util.Scanner;

public class Ex012_FolhaPagamentodouble {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o valor hora: ");
		double hora = scan.nextDouble();

		System.out.println("Qual a quantidade de horas trabalhadas no mês: ");
		double horasT = scan.nextDouble();

		double salBruto = hora * horasT;
		double percentualIR = 0;
		if (salBruto <= 900) {
			percentualIR = 0;
			// System.out.println("Isento de IR!");
		} else if (salBruto > 900 && salBruto <= 1500) {
			percentualIR = 5;
		}
		if (salBruto > 1500 && salBruto <= 2500) {
			percentualIR = 10;
		}
		if (salBruto > 2500) {
			percentualIR = 20;
		}

		double ir = (salBruto / 100) * percentualIR;
		double inss = (salBruto / 100) * 10;
		double fgts = (salBruto / 100) * 11;
		double descontos = ir + inss;
		double salLiquido = salBruto - descontos;

		System.out.println("Salário bruto: R$ " + salBruto);
		System.out.println("(-) IR (" + percentualIR + "%): R$ " + ir);
		System.out.println("(-) INSS (10%) : R$ " + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("Total de descontos: R$ " + descontos);
		System.out.println("Salário líquido: R$ " + salLiquido);

	}

}
