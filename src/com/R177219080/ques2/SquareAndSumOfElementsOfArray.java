package com.R177219080.ques2;
import java.util.Scanner;

public class SquareAndSumOfElementsOfArray {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int[] input = new int[10];
		for(int i = 0; i < 10; i++) {
			int j = i+1;
			System.out.println("Enter the value of number "+j);
			input[i] = obj.nextInt();
		}
		
		int sum = 0;
		System.out.println("Square of entered numbers: ");
		for(int i = 0; i<10; i++) {
			int square = input[i]*input[i];
			sum += input[i];
			System.out.println("Square of "+input[i]+" = "+square);
		}
		System.out.println("Sum of entered numbers = "+sum);

	}
}
