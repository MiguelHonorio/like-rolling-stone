package java_basic_list2;

import java.util.Scanner;

public class Ex006_007_MostreMaiorNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Number one: ");
		double one = scan.nextDouble();
		System.out.println("Number two: ");
		double two = scan.nextDouble();
		System.out.println("Number three: ");
		double three = scan.nextDouble();

		if (one >= two && one >= three) {
			System.out.println("One is the largest number");
		}
		if (two >= one && two >= three) {
			System.out.println("Two is the largest number");
		} else if (three >= one && three >= two) {
			System.out.println("Three is the largest number");
		}

		if (one <= two && one <= three) {
			System.out.println("One is the smallest number");
		}
		if (two <= one && two <= three) {
			System.out.println("Two is the smallest number");
		} else if (three <= one && three <= two) {
			System.out.println("Three is the smallest number");
		}

	}

}
