package com.problemSet2;
import java.util.Scanner;
public class Area_Circle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius :");
		double radius = input.nextInt();
		
		 //formula for area of a circle
		double area = (3.14 * radius * radius);		
		System.out.println(area);

	}

}
