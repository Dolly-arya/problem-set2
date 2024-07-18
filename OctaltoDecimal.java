package com.problemSet2;
import java.util.Scanner;
public class OctaltoDecimal {

	public static void main(String[] args) {
//		int a= 143;
//		int result = 0;
//		int copy_a = a;
	
//		for(int i=0;copy_a>0;i++) {
//			int temp = copy_a%10;
//			double p = Math.pow(8, i);
//			result += (temp*p);
//			copy_a = copy_a/10;
//		}
//		System.out.println("Octal to Decimal (" +a+ "):" +result);
		String onum = "157";
		int num = Integer.parseInt(onum,8);
		
		System.out.println("Decimal equivalent of Octal value 157 is:"+ num);
//		

	}

}
