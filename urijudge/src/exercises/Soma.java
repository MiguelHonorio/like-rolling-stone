package exercises;

import java.io.IOException;
import java.util.Scanner;

public class Soma {
	public static void main (String[] args) throws IOException{
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,prod;
		
		a = leia.nextInt();
		b = leia.nextInt();
		prod = a*b;
		
		System.out.println("PROD = "+prod);
		
	}

}
