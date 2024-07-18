package com.problemSet2;
import java.util.Scanner;
public class BinaryToOctal {
	public static int conBinToOctal(long bN) {//bN = binaryNumber
		int oN=0,dN=0,i=0;
		while(bN != 0) {
			dN += (bN%10)*Math.pow(2, i);
			++i;
			bN /=10;
		}
		i=1;
		while(dN != 0) {
			oN += (dN%8)*i;
			dN /= 8;
			i*=10;
		}
		return oN;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the binary number :");
		long binary = input.nextLong();
		int octal = conBinToOctal(binary);
		System.out.println(binary + "in binary =" + octal + "in octal");
		
		

	}

}
