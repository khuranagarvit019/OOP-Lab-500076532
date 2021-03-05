package com.R177219080.ques3;
import java.util.Scanner;

public class MonthNumToMonthName {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println("Enter the Month Number: ");
		int num = obj.nextInt();
		
		if (num >= 1 && num <= 12) {
		    System.out.println("The name of month number "+num+" is "+months[num-1]+".");
		} 
		else {
		    System.out.println("You have entered an invalid number");
		}
	
	}
}
