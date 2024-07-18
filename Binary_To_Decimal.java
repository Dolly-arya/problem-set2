package com.problemSet2;
/*
 * Binary Number= 1100100
 * 1     1    0     0   1       0     0 
 * 2^6  2^5  2^4  2^3  2^2     2^1   2^0
 * 1*2^6+1*2^5+0*2^4+0*2^3+1*2^2+0*2^1+0*2^0
 * 64+32+0+0+4+0+0=100
 * Decimal Number = 100
*/
import java.util.Scanner;
public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary number :" );
		int binary = sc.nextInt();//1100100
		int decimal = 0;//0
		int count = 0;//0
		
		while(binary>0) {//1100100>0true,110010>0true,11001>0true,1100>0true,110>0true,11>0true,1>0true,0>0false
			int mod = binary%10;//1100100%10=0,110010%10=0,11001%10=1,1100%10=0,110%10=0,11%10=1,1%10=1
			    decimal = decimal+(mod*(int)(Math.pow(2, count++)));//0+0*2^0=0,0+0*2^1=0,0+1*2^2=4,4+0*2^3=4,4+0*2^4=4,4+1*2^5=36,36+1*2^6=100
			    binary = binary/10;//1100100/10=110010,110010/10=11001,11001/10=1100,1100/10=110,110/10=11,11/10=1,1/10=0
		}
		System.out.println("Decimal Number = "+decimal);//Decimal Number = 100

	}

}
