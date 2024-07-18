package com.problemSet2;
import java.util.Scanner;
public class BinarytoDecimal {
	public static void binaryToDecimal(int num) {
		int r,temp,ans=0,p=0;
		temp=num;//1100
		while(num != 0) {//right
			r=num%10;//0
			ans += r*(1<<p);//0
			p++;//1
			num /= 10;//11
		}
		System.out.println("Decimal Equivalent of " +temp+" is "+ans);
	}

	public static void main(String[] args) {
		//int num = 1100;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Binary number");
		int num = input.nextInt();
		binaryToDecimal(num);

	}

}
