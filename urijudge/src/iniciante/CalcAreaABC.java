package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CalcAreaABC {
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		float A,B,C;
		
		A = input.nextFloat();
		B = input.nextFloat();
		C = input.nextFloat();
		
		System.out.printf("TRIANGULO: %.3f\n", (A*C)/2);
		System.out.printf("CIRCULO: %.3f\n", (3.14159 * Math.pow(C, 2)));
		System.out.printf("TRAPEZIO: %.3f\n", (A+B)*C /2);
		System.out.printf("QUADRADO: %.3f\n", (B*B));
		System.out.printf("RETANGULO: %.3f\n", (A*B));
		
	}

}
