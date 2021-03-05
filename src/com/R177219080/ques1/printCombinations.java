package com.R177219080.ques1;
import java.util.Scanner;

// Adding a comment
public class printCombinations {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int input[] = new int[3];
		
		for(int i = 0; i < 3; i++) {
			int j = i+1;
			System.out.println("Enter the value of number "+j);
			input[i] = obj.nextInt();
		}
		System.out.println("All possible combinations:");
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				for (int z = 0; z < 3; z++) {
					if (x != y && y != z && z != x) {
						System.out.println(input[x] + "" + input[y] + "" + input[z]);
					}
			    }
			}
		}
	}
	
}
