package com.problemSet2;
/*
 * Octal Number = 144
 * 1           4             4
 * 8^2         8^1           8^0
 * 1*8^2 + 4*8^1 + 4*8^0
 * 64 + 32 + 4 = 100
 * Decimal Number = 100
*/
import java.util.Scanner;
public class Octal_To_Decimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal number :");
		int octal = sc.nextInt();//144
		int decimal = 0;//0
		int count = 0;//0
		int mod = 0;//0
		while(octal>0) {//144>0 true,14>0true,1>0true,0>0false
			mod = octal%10;//144%10=4,14%10=4,1%10=1
			decimal = decimal + (mod * (int) Math.pow(8, count++));//0+4*8^0=4, 4+4*8^1=36, 36+1*8^2=100
			octal = octal/10;//144/10=14,14/10=1,1/10=0
			
		}
		System.out.println("Decimal number :" + decimal);//Decimal number : 100
		
		
		

	}

}
