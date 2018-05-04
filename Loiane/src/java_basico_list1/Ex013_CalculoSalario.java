package java_basico_list1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex013_CalculoSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");

		double valorHora;
		double horasMes;

		System.out.println("Entre com valor hora: R$ ");
		valorHora = scan.nextDouble();
		System.out.println("Entre com horas por m�s: ");
		horasMes = scan.nextDouble();

		double salBruto = valorHora * horasMes;
		System.out.println("O sal�rio bruto �: R$ " + salBruto);

		// INSS 8%
		double inss = salBruto * 0.08;
		System.out.println("Desconto INSS: R$ " + inss);

		// imposto de renda 11%
		double ir = salBruto * 0.11;
		System.out.println("Desconto IR: R$ " + ir);

		// Sindicato 5%
		double sindicato = salBruto * 0.05;
		System.out.println("Desconto Sindicato: R$ " + sindicato);

		double salLiquido = salBruto - inss - ir - sindicato;
		System.out.println("Sal�rio l�quido: R$ " + salLiquido);

	}

}
