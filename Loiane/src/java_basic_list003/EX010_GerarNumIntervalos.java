package java_basic_list003;

import java.util.Scanner;

public class EX010_GerarNumIntervalos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o primeiro n�mero: ");
		int num1 = scan.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		int num2 = scan.nextInt();

		System.out.println("Os n�meros existentes entre o primeiro e segundo s�o: ");
		for (int i = num1; i <= num2; i++) {
			System.out.print(i);
			if(i<num2){
				System.out.print(",");
			}
		}
	}

}
