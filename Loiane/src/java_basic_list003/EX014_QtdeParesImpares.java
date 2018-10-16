package java_basic_list003;

import java.util.Scanner;


/**
 * @author PERCEPTRON T.I
 *
 */
public class EX014_QtdeParesImpares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num;
		int pares = 0;
		int impar = 0;
		
		for(int i=0;i < 10; i++){
			System.out.println("Entre com um numero");
			num = scan.nextInt();
			if(num % 2 == 0){
				pares++;
			}else{
				impar++;
			}
			
		}
		System.out.println("ares: "+pares);
		System.out.println("Impares: "+impar);
	}

}
