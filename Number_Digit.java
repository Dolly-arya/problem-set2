package com.problemSet2;
import java.util.Scanner;
public class Number_Digit {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the number :");
	    int number=input.nextInt();
	    
	    int digit=0;
	    while(number != 0) {
	    	int pick_last = number%10;
	    	digit++;
	    	number = number/10;
	    }
	    System.out.println("Number of Digits = "+digit);

	}

}
