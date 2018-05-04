package exercises;

import java.io.IOException;	
import java.util.Locale;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) throws IOException {

		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int nunFunc, horaTrab;
		float valorHora, salario;

		nunFunc = leia.nextInt();
		horaTrab = leia.nextInt();
		valorHora = leia.nextFloat();

		salario = (valorHora * horaTrab);
		System.out.printf("NUMBER = %d\n", nunFunc);
		System.out.printf("SALARY = U$ %.2f%n", salario);
	}

}
