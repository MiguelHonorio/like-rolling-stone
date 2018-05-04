package java_basic_list2;

import java.util.Scanner;

public class Ex002_PositivoNegativo {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um valor qualquer: ");
		double valor = scan.nextDouble();
		
		if(valor >= 0){
			System.out.println("O número digitado é positivo! ");
		}else{
			System.out.println("O número digitado é negativo! ");
		}
		
	}

}
