package exercises;

import java.util.Locale;
import java.util.Scanner;


public class Media {
	public static void main (String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
	
		double a,b,c, media;
		
		a = leia.nextDouble();
		b = leia.nextDouble();
		c = leia.nextDouble();
		
		media = (a*2+b*3+c*5)/10;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
	}

}


//Locale.setDefault(Locale.US);
//Scanner leia = new Scanner(System.in);

//float a;
//float b;
//
//a = leia.nextFloat();
//b = leia.nextFloat();
//
//float media = (((a*3.5f)+(b*7.5f))/11);

//System.out.printf("MEDIA = %.5f%n", media);