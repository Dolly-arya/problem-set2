package com.problemSet2;
import java.util.Scanner;
import static java.lang.Math.*;
public class Quadratic_Equation {
	public static void findRoots(int a, int b, int c)
    {
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }
 
        int d = b * b - 4 * a * c;
        double sqrt_val = sqrt(abs(d));
 
        if (d > 0) {
            System.out.println("Roots are real and different");
            System.out.println((double)(-b + sqrt_val) / (2 * a) + "\n"+ (double)(-b - sqrt_val) / (2 * a));
        }
        else if (d == 0) {
            System.out.println("Roots are real and same ");
            System.out.println(-(double)b / (2 * a) + "\n" + -(double)b / (2 * a));
        }
        else // d < 0
        {
            System.out.println("Roots are complex");
 
            System.out.println(-(double)b / (2 * a) + " + i" + sqrt_val + "\n" + -(double)b / (2 * a) + " - i" + sqrt_val);
        }
    }
 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number1 :");
		int a = input.nextInt();
		System.out.println("Enter the number2 :");
		int b = input.nextInt();
		System.out.println("Enter the number3 :");
		int c = input.nextInt();
		
		 // Function call
        findRoots(a, b, c);

	}

}
