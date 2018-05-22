package java_basic_list001;

import java.util.Scanner;

public class Ex002_ShowNumberInformed {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número!");
		int num = scan.nextInt();
		
		System.out.println("O número informado é: " + num);

	}

}
