package exercises;

import java.io.IOException;
import java.util.*;

/**
 * 
 * @author miguel.honorio
 *
 */
public class VolumeEsfera {
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		float raio = 0;

		raio = input.nextInt();
		double calcVolume = ((4.0 / 3) * 3.14159 * Math.pow(raio, 3));

		System.out.printf("VOLUME = %.3f\n", calcVolume);
	}
}
