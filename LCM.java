package com.problemSet2;
import java.util.Scanner;
public class LCM {
	public static int lcm(int n1,int n2) {
		int i = 1;
		while(true) { //while(i<=num2)
			int factor = n1*i;//4*1
			if(factor%n2==0) {//4%6
				return factor;
			}
				i++;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two number");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int lcm = lcm(n1,n2);
		System.out.println("LCM number : " +lcm);
		

	}

}
