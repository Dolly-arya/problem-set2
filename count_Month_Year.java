package com.problemSet2;
import java.util.Scanner;
public class count_Month_Year {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month :");
		int month=input.nextInt();
		System.out.println("Enter the year :");
		int year=input.nextInt();
		
		 if((month==2) && ((year%4==0) || ((year%100!=0)&&(year%400==0))))
	            System.out.println("Number of days is 29");

	        else if(month==2)
	            System.out.println("Number of days is 28");

	        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
	            System.out.println("Number of days is 31");

	        else
	            System.out.println("Number of days is 30");



	}

}
