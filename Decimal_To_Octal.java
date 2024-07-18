package com.problemSet2;
/*
 * Decimal Number = 100
 * Number    Division by 8     Quotient     Remainder
 * 100         100/8             12            4
 * 12            12/8             1             4
 * 1             1/8              0            1
 * 
 * reverse order 144
 * 
 * octal Number = 144
*/
import java.util.Scanner;
public class Decimal_To_Octal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number :");
		int number = sc.nextInt();//100
		int octal = 0;//0
		int rev = 1;//1
		int mod = 0;//0
		while(number>0) {
			mod = number%8;
			rev = (rev*10)+mod;
			number = number/8;
		}//rev=1441
		
		while(rev>1) {
			mod = rev % 10;
			octal=(octal*10)+mod;
			rev = rev/10;

	}//octal=144
		System.out.println("Octal Number :" + octal);
	}
}
