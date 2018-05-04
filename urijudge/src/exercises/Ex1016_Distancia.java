package exercises;

import java.io.IOException;
import java.util.Scanner;

public class Ex1016_Distancia {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		int distancia;
		double t;

		distancia = input.nextInt();
		/*
		 * S = s0 + vt s1 + v1t = s2 + v2t t = (s1 - s2)/(v2-v1)
		 */

		t = Math.abs(-distancia / (90 - 60.0)) * 60;

		// t = (-distancia/(90 - 60.0)) * 60 *(-1); (Math.abs = transforma de
		// forma elegante um número negatico para positivo)

		System.out.println((int) t + " minutos");

	}
}