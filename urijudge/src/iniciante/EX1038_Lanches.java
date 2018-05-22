package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class EX1038_Lanches {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int code;
		int qtde;

		ArrayList list = new ArrayList();
		list.add(1, 4.00d);
		list.add(2, 4.50d);
		list.add(3, 5.00d);
		list.add(4, 3.50d);
		list.add(5, 1.50d);
		
		code = input.nextInt();
		qtde = input.nextInt();
		
		System.out.println("teste" +code);

	}

}
