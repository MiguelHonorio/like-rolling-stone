package java_basic_list001;

import java.util.Scanner;

public class Ex007_AreaQuadrado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o lado: ");
		
		double lado = scan.nextDouble();
		double area = Math.pow(lado, 2)*2;
		
		System.out.println("O dobro da área do quadrado é: " +area) ;
	}

}
