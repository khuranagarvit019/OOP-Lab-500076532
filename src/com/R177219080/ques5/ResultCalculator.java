package com.R177219080.ques5;
import java.util.Scanner;
import java.util.Arrays;

public class ResultCalculator {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int[] marks = new int[10];
		for(int i = 0; i < 10; i++) {
			int j = i+1;
			System.out.println("Enter the marks of student "+j);
			marks[i] = obj.nextInt();
		}
		Arrays.sort(marks);
		for(int i = 0; i < 10; i++) {
			if(marks[i] >= 40 && marks[i] <= 50) {
				System.out.println("For marks = "+marks[i]+" Grade is PASS");
			}
			if(marks[i] >= 51 && marks[i] <= 75) {
				System.out.println("For marks = "+marks[i]+" Grade is MERIT");
			}
			if(marks[i] < 40) {
				System.out.println("For marks = "+marks[i]+" Grade is NOT DEFINED");
			} 
			else {
				System.out.println("For marks = "+marks[i]+" Grade is DISTINCTION");
			}
		}
		
	}
}
