package com.problemSet2;
import java.util.Scanner;
public class HexadecimalToDecimal {
	 static int hexadecimalToDecimal(String hexVal) {
	        // Storing the length of the 
	        int len = hexVal.length(); 
	
	        int base = 1; 
	
	        int dec_val =0; 
	  
	        for (int i = len - 1; i >= 0; i--) { 
	        	 if (hexVal.charAt(i) >= '0'
	                     && hexVal.charAt(i) <= '9') { 
	                     dec_val += (hexVal.charAt(i) - 48) * base; 
	       
	                     // Incrementing base by power 
	                     base = base * 16; 
	                 } 
	              }
	        return dec_val;
	   }

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String hexNum = input.toString();
		System.out.println(hexadecimalToDecimal(hexNum));
		

	}

}
