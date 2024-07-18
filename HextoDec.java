package com.problemSet2;

public class HextoDec {

	public static void main(String[] args) {
		 String hex1 = "1AB"; 
	        String hex2 = "1A"; 
	        int dec1 = hexToDec(hex1); 
	        int dec2 = hexToDec(hex2); 
	        System.out.println(hex1 + " in decimal is " + dec1); 
	        System.out.println(hex2 + " in decimal is " + dec2); 
	    } 
	  
	    private static int hexToDec(String hex) 
	    { 
	        int len = hex.length(); 
	        int dec = 0; 
	        for (int i = 0; i < len; i++) { 
	            char c = hex.charAt(i); 
	            int digit = Character.digit(c, 16); 
	            dec = dec * 16 + digit; 
	        } 
	        return dec; 

	}

}
