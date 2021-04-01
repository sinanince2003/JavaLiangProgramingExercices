package chapter07;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		printCombinations(numbers);
	}

	public static void combinationsOfTwoNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				System.out.print("(" + twoNum[i] + "," + numbers[j] + ")" + " ");
			}
			System.out.println();
		}
	}
}