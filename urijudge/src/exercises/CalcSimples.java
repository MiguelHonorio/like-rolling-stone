package exercises;

import java.io.IOException;
import java.util.*;

public class CalcSimples {
	public static void main (String[] args) throws IOException{
		
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numPeca1, qtdPeca1, numPeca2, qtdPeca2;
		double valorPeca1, valorPeca2, total;
		
		numPeca1 = input.nextInt();
		qtdPeca1 = input.nextInt();
		valorPeca1 = input.nextDouble();
		
		numPeca2 = input.nextInt();
		qtdPeca2 = input.nextInt();
		valorPeca2 = input.nextDouble();
		
		total = (qtdPeca1* valorPeca1)+(qtdPeca2* valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
		
	}

}
