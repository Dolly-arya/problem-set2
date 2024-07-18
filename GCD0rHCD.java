package com.problemSet2;
import java.util.Scanner;
public class GCD0rHCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two number");
		int a = input.nextInt();
		int b = input.nextInt();
		
		while(a != b) {
			if(a==0) {
				System.out.println("GCD or HCF :" +b);
				break;
			}
			if(b==0) {
				System.out.println("GCD or HCF :" +a);
				break;
			}
			
			if(a>b) {
				a=a-b;
			}
			if(b>a) {
				b=b-a;
			}
			
			if(a==b) {
				System.out.println("GCD or HCF :" +a);
			}
		}

	}

}
