package com.R177219080.ques4;

public class ques4 {
	public static void main(String arg[]){
        int sum=0;
        
        for(int i=40; i<=250; i++){
            if(i%5==0){
                sum += i;   
            }   
        }
        System.out.println("The sum of intergers from 40 to 250 that are divisible by 5 = "+sum);
    }
}
