package com.problemSet2;
/*
 * Octal Number = 144
 * 1           4            4
 * 8^2        8^1          8^0
 * 1*8^2  +   4*8^1 +  4*8^0
 * 64     +   32    + 4 = 100
 * 
 * Decimal Number = 100
 * 
 * Number    Division by 2      Quotient   Reminder
 * 100        100/2               50          0
 * 50          50/2               25          0
 * 25          25/2               12          1
 * 12          12/2               6           0
 * 6            6/2               3           0
 * 3            3/2               1           1
 * 1            1/2               0           1
 * 
 * Reverse = 1100100
 * Binary Number= 1100100
*/
import java.util.Scanner;
public class Octal_To_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the octal number :");
		int octal = sc.nextInt();//144
		int decimal = 0;//0
		int binary = 1;//1
		int reverse = 0;//0
		int mod = 0;//0
		int count = 0;
		
		while(octal>0) {//144>0 true
			mod = octal%10;//144%10=4
			decimal = decimal +  (mod * ((int) Math.pow(8, count++)));
			octal = octal/10;
				
		}//decimal number = 100
		
		while(decimal>0) {//100>0true
			mod = decimal%2;//100%2=0
			binary = (binary*10)+mod;//1*10+0=10
			decimal = decimal/2;
		}//binary = 10010011
		
		while(binary>1) {//10010011>0true
			mod = binary%10;//10010011%10=1
			reverse = ((reverse*10)+mod);
			binary = binary/10;
			
		}//reverse = 1100100
		binary=reverse;//1100100
		System.out.println("Binary Number :"+ binary);//Binary Number : 1100100
		

	}

}
