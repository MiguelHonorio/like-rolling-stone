package java_basic_list002;

import java.util.Scanner;

public class EX018_NumIntParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um n�mero qualquer: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " � um n�mero par!");
		}else {
			System.out.println(num + " � um n�mero impar!");
		}
	}

}
