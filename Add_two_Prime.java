package com.problemSet2;
import java.util.Scanner;
public class Add_two_Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input from user
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		int x = 0;
		for(int i = 2 ; i <= number/2 ; i++)
		{
			if(prime_or_not(i) == 1)
			{
				if(prime_or_not(number-i) == 1)
				{
					System.out.println(number+ " = "+i+" + "+(number-i));
					x = 1;
				}
			}
		}
		if(x == 0)
			System.out.println(+number+" cannot be expressed as a sum of two prime numbers");
	}
        //function for checking number is prime or not
	public static int prime_or_not(int n)
	{
		int c = 1;
		for(int i = 2 ; i < n ; i++)
		{
			if(n % i == 0)
			{
				c = 0;
				break;
			}
		}
		return c;
			

	}

}
