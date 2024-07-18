package com.problemSet2;
import java.util.Scanner;
public class Quadrants {
	
	 // Function to check quadrant 
    static void quadrant(int x, int y) 
    { 
        if (x > 0 && y > 0) 
            System.out.println("lies in First quadrant"); 
  
        else if (x < 0 && y > 0) 
            System.out.println("lies in Second quadrant"); 
  
        else if (x < 0 && y < 0) 
            System.out.println("lies in Third quadrant"); 
  
        else if (x > 0 && y < 0) 
            System.out.println("lies in Fourth quadrant"); 
  
        else if (x == 0 && y > 0) 
            System.out.println("lies at positive y axis"); 
  
        else if (x == 0 && y < 0) 
            System.out.println("lies at negative y axis"); 
  
        else if (y == 0 && x < 0) 
            System.out.println("lies at negative x axis"); 
  
        else if (y == 0 && x > 0) 
            System.out.println("lies at positive x axis"); 
  
        else
            System.out.println("lies at origin"); 
    }
//Driver code
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x and y axis:");
		int x =input.nextInt();
		int y =input.nextInt();
		 //int x = 1, y = 1; 
	        // Function Calling 
	        quadrant(x, y); 
		
	}

}
