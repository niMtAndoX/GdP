package de.ostfalia.gdp.ws23.s3;

import java.util.Scanner;

public class Potenz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long y = sc.nextInt();
		long b = sc.nextInt();
		
		sc.close();
		
	}
	
	public static boolean istPotenz(long y, long b) {
		if(b == y) {
			return true;
		}
		
		if(b == 0 && y != 1) {
			return false;
		}
		if(y == 1) {
			return true;
		}
		
		if(b==1 && y != 1) {
			return false;
		}
		long x = b;
		while(b <= y) {
			if(b == y) {
				return true;
			}
			b *= x;
		}
		return false;
	}

}
