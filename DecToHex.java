package com.problemSet2;
import java.util.Scanner;
public class DecToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the decimal number :");
		int num =input.nextInt();
		
		System.out.println(Integer.toString(num, 16)); 
	}

}
