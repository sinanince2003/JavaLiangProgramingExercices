package chapter04;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length from the center to a vertex: ");
		double r = input.nextDouble();

		final double Pİ = 3;

		double s = (2 * r) * Math.sin(Pİ / 5);
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Pİ / 5));

		System.out.println("The area of the pentagon is " + area);
	}
}
