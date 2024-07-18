package com.problemSet2;
import java.util.Scanner;
public class Max_Handshakes {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number:");
	     int num = sc.nextInt();
	     
	     int total = num * (num-1) / 2; // Combination nC2

			System.out.println("For "+ num +" people there will be " +total+" handshakes");
	     
	     

	}

}
