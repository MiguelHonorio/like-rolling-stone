package java_basico_list1;

import java.util.Scanner;

public class Ex008_GanhoHora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double vh;
		double hm;
		System.out.println("Quanto voc� ganha por hora?");
		vh = scan.nextDouble();
		System.out.println("Quantas horas voc� trabalha por m�s?");
		hm = scan.nextDouble();
		double totalMes = vh*hm;
		
		System.out.println("Voc� recebe: R$ " +totalMes);
		
		
		
		
	}

}
