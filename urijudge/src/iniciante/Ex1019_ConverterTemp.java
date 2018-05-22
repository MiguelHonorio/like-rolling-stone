package iniciante;

import java.util.Scanner;

public class Ex1019_ConverterTemp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int mileSeg = input.nextInt();

		int hora = mileSeg / 3600;
		int minutos = (mileSeg % 3600) / 60;
		int seg = (mileSeg % 3600) % 60;

		System.out.println(hora +":"+ minutos +":" +seg);

	}

}

//Scanner input = new Scanner(System.in);
//
//int seg = input.nextInt();
//
//int hora = seg / 3600;
//int minutos = (seg - (hora * 3600)) / 60;
//seg = seg - ((hora * 3600) + (minutos * 60));
//
//System.out.println(hora +":"+ minutos +":" +seg);