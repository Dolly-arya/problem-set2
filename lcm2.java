package com.problemSet2;
import java.util.Scanner;
public class lcm2 {

	public static void main(String[] args) {
		Scanner mom = new Scanner(System.in);
		System.out.println(" Enter the two number");
		int n1 = mom.nextInt();
		int n2 = mom.nextInt();
		int lcm=1;
		
		while(true) {
			if((lcm%n1==0) && (lcm%n2==0)) {
				break;
			}
             lcm++;
		}
		System.out.println("LCM :" +lcm);
	
	}
}